package docywood;

import docywood.scenario.ConceptAction;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import strictecore.StrictEcore;

public class Activity2MarkDownScenarios {
	private final String modelFolder;
	private final Activity activity;
	private final Grammar grammar;
	private final String outputPath;
	private final EPackage rootPkg;
	private final EClass rootClass;
	private final Map<String, String> docs;

	Activity2MarkDownScenarios(final EPackage root, final String aModelPath, final Activity umlActivity, Grammar theGrammar, final String output,
							   final EClass rootClazz) {
		super();
		modelFolder = aModelPath;
		activity = umlActivity;
		grammar = theGrammar;
		outputPath = output;
		rootPkg = root;
		docs = new HashMap<>();
		rootClass = rootClazz;
	}

	public Activity2MarkDownScenarios(final EPackage root, final String aModelPath, final Activity umlActivity, Grammar theGrammar, final String output) {
		this(root, aModelPath, umlActivity, theGrammar, output, Docywood.getRootClasses(Collections.singletonList(root)).iterator().next());
	}

	public Activity2MarkDownScenarios(final String rootClassName, final EPackage root, final String aModelFolder, final Activity umlActivity,
									  Grammar theGrammar, final String output) {
		this(root, aModelFolder, umlActivity, theGrammar, output,
			(EClass) root.getEClassifiers().parallelStream().filter(cl -> cl instanceof EClass && cl.getName().equals(rootClassName)).
				findAny().orElseThrow(IllegalArgumentException::new));
	}


	public void produce() {
		ActivityNode init = activity.getNodes().stream().filter(n -> n instanceof InitialNode).findAny().get();
		init.getOutgoings().forEach(edge -> produceScenarioFromNode((OpaqueAction) edge.getTarget(), new HashSet<>(), new ArrayList<>()));
		produceXtextFragment();
	}


	private void produceXtextFragment() {
		final String xtextcode = docs.entrySet().stream().map(doc -> {
			String doctxt = doc.getValue();
			if(doctxt.contains("See also:<br/>")) {
				doctxt = doctxt.substring(0, doc.getValue().indexOf("See also:<br/>") - 1);
			}
			return "map.put(\"" + doc.getKey() + "\", \"" + doctxt.substring(doctxt.indexOf('\n') + 2).replaceAll("\"", "\\\"") + "\")";
		}).
			collect(Collectors.joining("\n\n",
				"// Copy paste this code into the ProposalProvider.xtend file of your xtext project\n" +
					"// You may have to change the keys of the generated map to match the tokens of the grammar you want\n\n" +
					"val static values = {\n" + "\t\tval map = new HashMap<String, String>()\n" + "\n\n",
				"\n\t\tmap\n" + "\t}\n\n" +
			"\toverride ConfigurableCompletionProposal doCreateProposal(String proposal, StyledString displayString, Image image,\n" +
					"\t\tint replacementOffset, int replacementLength) {\n" + "\n" +
					"\t\tval cc = new ConfigurableCompletionProposal(proposal, replacementOffset, replacementLength, proposal.length(),\n" +
					"\t\t\timage, displayString, null, values.get(proposal))\n" + "\t\treturn cc;\n" + "\t}"));

		try {
			Files.write(Paths.get(outputPath + "xtextFragment.xtend"), Collections.singletonList(xtextcode));
		}catch(final IOException ex) {
			ex.printStackTrace();
		}
	}


	private void produceScenarioFromNode(OpaqueAction node, final Set<EModelElement> toAddToSlicer, final List<OpaqueAction> past) {
		try {
			EList<InputPin> inputs = node.getInputValues();
			final String qn = inputs.get(0).getName();

			final EModelElement element = getElementFromQName(qn);

			if(element == null) {
				System.err.print("Cannot find the model element " + qn);
				return;
			}

			if(element instanceof EClass || element instanceof EAttribute) {
				final ENamedElement namedElt = (ENamedElement) element;
				final boolean isClass = element instanceof EClass;
				final Docywood docywood = new Docywood();
				final EClass cl = isClass ? (EClass) element : ((EAttribute) element).getEContainingClass();

				System.out.println("Producing a scenario for " + Docywood.getQName(namedElt));

				for(int i=1; i<inputs.size(); i++) {
					toAddToSlicer.add(getElementFromQName(inputs.get(i).getName()));
				}

				toAddToSlicer.add(cl);

				if(!isClass) {
					toAddToSlicer.add(element);
				}

				final StrictEcore slicer = new StrictEcore(toAddToSlicer, rootClass, false, true);

				slicer.slice();
				slicer.reinit();

				final EPackage slicedRootPkg = slicer.getOutput().iterator().next();

				Collection<EClass> classes4XText = past.stream().map(n -> (EClass) getElementFromQName(n.getInputValues().get(0).getName(), slicedRootPkg)).collect(Collectors.toSet());

				classes4XText.addAll(slicedRootPkg.getEClassifiers().stream().filter(o -> o instanceof EClass).map(o -> (EClass)o).collect(Collectors.toList()));

				final EClass rootslicedClass = (EClass) slicedRootPkg.getEClassifier(rootClass.getName());
				final AbstractRule rule = docywood.getXtextElementFromEClassifier(grammar, rootslicedClass).orElseThrow(NullPointerException::new);
				// Must initialise all the max/count of the concepts to use in the scenarios.
				classes4XText.forEach(cl4xtext -> docywood.getXtextElementFromEClassifier(grammar, cl4xtext));
				final ConceptAction concept = docywood.getTutorialText(rule, classes4XText, rootslicedClass);

				if(!concept.getActions().isEmpty()) {
					final Scenario2Text scen = new Scenario2Text(rootPkg.getName(), namedElt, concept, modelFolder,
						slicer.sliceToOriginal, Collections.unmodifiableList(past), rootPkg, slicedRootPkg);

					try {
						if(!Files.exists(Paths.get(outputPath))) {
							Files.createDirectories(Paths.get(outputPath));
						}
						final String docUnit = scen.get();
						docs.put(namedElt.getName(), docUnit);
						Files.write(Paths.get(outputPath + namedElt.getName() + ".md"), Collections.singletonList(docUnit));
					}catch(final IOException e) {
						//e.printStackTrace();
						System.out.println(e.getMessage());
					}
				}

				past.add(node);

				toAddToSlicer.addAll(slicer.sliceToOriginal.values().stream().
					filter(elt -> !Docywood.getQName((ENamedElement) elt).startsWith("ecore.")).collect(Collectors.toList()));

			}else {
				System.err.println("Not supported: " + element);
			}

			node.getOutgoings().forEach(edge -> {
				if(edge.getTarget() instanceof OpaqueAction) {
					produceScenarioFromNode((OpaqueAction) edge.getTarget(), new HashSet<>(toAddToSlicer), new ArrayList<>(past));
				}
			});
		}catch(Throwable ex) {
//			ex.printStackTrace();
		}
	}


//	private Set<DynamicEObjectImpl> flatModel(final Collection<DynamicEObjectImpl> model) {
//		Set<DynamicEObjectImpl> collect = model.stream().map(obj -> {
//			Set<DynamicEObjectImpl> objs = new HashSet<>();
//			obj.eAllContents().forEachRemaining(elt -> {
//				if(elt instanceof DynamicEObjectImpl) {
//					objs.add((DynamicEObjectImpl) elt);
//				}
//			});
//			return objs;
//		}).map(objs -> flatModel(objs)).flatMap(s -> s.stream()).collect(Collectors.toSet());
//		collect.addAll(model);
//		return collect;
//	}


	private EModelElement getElementFromQName(final String qname) {
		return getElementFromQName(qname, rootPkg);
	}

	private EModelElement getElementFromQName(final String qname, final EPackage thePkg) {
		EModelElement current = null;

		for(final String elt : qname.split("\\.")) {
			if(current == null) {
				if(elt.equals(thePkg.getName())) {
					current = thePkg;
				}else return null;
			}else {
				current = (EModelElement) current.eContents().stream().
					filter(o -> o instanceof ENamedElement && ((ENamedElement) o).getName().equals(elt)).findAny().orElse(null);
				if(current == null) return null;
			}
		}

		return current;
	}
}
