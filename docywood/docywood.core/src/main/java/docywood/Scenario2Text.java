package docywood;

import docywood.scenario.Action;
import docywood.scenario.CompositeAction;
import docywood.scenario.ConceptAction;
import docywood.scenario.ConceptAttributeAction;
import docywood.scenario.TypeSymbolAction;
import docywood.scenario.WithFormatAction;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.uml2.uml.OpaqueAction;
import util.Tuple;

public class Scenario2Text {
	private static final String EOL = System.getProperty("line.separator");
	private static final String CONFIG = "config/";

	private final ConceptAction scenario;
	private List<DynamicEObjectImpl> model;
	private final Map<EModelElement, EModelElement> slice2OriginMM;
	private int tabs;
	private final ScriptEngine engine;
	private final ENamedElement coreElement;
	private final List<OpaqueAction> prevActivities;
	private final String dslName;
	private final String modelsFolder;
	private final EPackage rootPkg;
	private final EPackage slicedRootPkg;

	private final Set<String> unjoinable;
	private final Map<String, String> symbolExplained;
	private final Set<String> openBlock;
	private final Set<String> closeBlock;
	private final Map<String, String> formatExplained;
	private final Set<Path> notToUse;
	private Path currentPath;


	public Scenario2Text(final String dslName, final ENamedElement coreScenarioElement, final ConceptAction scenar, final String modelsFolder,
						 final Map<EModelElement, EModelElement> slice2Origin, List<OpaqueAction> previousActivities,
						 final EPackage rootPkg, final EPackage slicedRootPkg) {
		super();
		scenario = scenar;
		this.modelsFolder = modelsFolder;
		slice2OriginMM = Collections.unmodifiableMap(slice2Origin);
		tabs = 0;
		currentPath = null;
		engine = new ScriptEngineManager().getEngineByName("JavaScript");
		coreElement = coreScenarioElement;
		prevActivities = previousActivities;
		this.dslName = dslName;
		this.rootPkg = rootPkg;
		this.slicedRootPkg = slicedRootPkg;
		notToUse = new HashSet<>();

		unjoinable = readTokensFile(CONFIG + dslName + "/do_not_join.txt");
		symbolExplained = readMappingFile(CONFIG + dslName + "/symbol_explained.txt");
		openBlock = readTokensFile(CONFIG + dslName + "/open_block.txt");
		closeBlock = readTokensFile(CONFIG + dslName + "/close_block.txt");
		formatExplained = readMappingFile(CONFIG + dslName + "/format_explained.txt");

		model = loadAModel();
	}


	private List<DynamicEObjectImpl> loadAModel() {
		List<DynamicEObjectImpl> list = null;
		Path next = null;
		int cpt = 0;

		try {
			Iterator<Path> iterator = Files.newDirectoryStream(Paths.get(modelsFolder)).iterator();

			while(iterator.hasNext() && list == null) {
				next = iterator.next();
				if(next.toString().endsWith(".xmi") && !notToUse.contains(next)) {
					cpt++;
					list = Docywood.sliceModel(flatModel(Docywood.loadModel(next.toString(), rootPkg)), slicedRootPkg, rootPkg);
					currentPath = next;
				}
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}catch(Throwable ex) {
//			ex.printStackTrace();
			if(next != null) {
				notToUse.add(next);
				return loadAModel();
			}
		}

		if(cpt == 0)
			throw new IllegalArgumentException("No model matches the documentation");

		return list;
	}


	private static Set<DynamicEObjectImpl> flatModel(final Collection<DynamicEObjectImpl> model) {
		Set<DynamicEObjectImpl> collect = model.stream().map(obj -> {
			Set<DynamicEObjectImpl> objs = new HashSet<>();
			obj.eAllContents().forEachRemaining(elt -> {
				if(elt instanceof DynamicEObjectImpl) {
					objs.add((DynamicEObjectImpl) elt);
				}
			});
			return objs;
		}).map(objs -> flatModel(objs)).flatMap(s -> s.stream()).collect(Collectors.toSet());
		collect.addAll(model);
		return collect;
	}


	public String get() {
		final ConceptAction dup = scenario.duplicate();
		reduceTypeAction(dup);
//		System.out.println(dup);
		try {
			return produceText(dup);
		}catch(Throwable ex) {
//			ex.printStackTrace();
			if(currentPath != null) {
				notToUse.add(currentPath);
			}
			model = loadAModel();
			return get();
		}
	}


	private static Map<String, String> readMappingFile(final String strPath) {
		final Path path = Paths.get(new File(strPath).toURI());

		if(Files.exists(path)) {
			try {
				return Files.readAllLines(path).stream().map(line -> {
					String[] split = line.split(" ");
					return new Tuple<>(split[0], line.substring(split[0].length() + 1));
				}).collect(Collectors.toMap(t -> t.a, t -> t.b));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

		return Collections.emptyMap();
	}

	private static Set<String> readTokensFile(final String strPath) {
		final Path path = Paths.get(new File(strPath).toURI());

		if(Files.exists(path)) {
			try {
				return new HashSet<>(Files.readAllLines(path));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

		return Collections.emptySet();
	}


	private String produceText(final ConceptAction scenar) {
		final EClass elt = scenar.getElt();
		final Action coreAction = scenar.findActionWith(coreElement).
			orElseThrow(() -> new IllegalArgumentException("Cannot find the action for: " + Docywood.getQName(coreElement) + " in " + scenar));
		final DynamicEObjectImpl obj = model.stream().filter(o -> Docywood.getQName(o.eClass()).equals(Docywood.getQName(elt))).findFirst().
			orElseThrow(() -> new IllegalArgumentException("Cannot find a model element for " + elt.getName()));

	 	produceActionText(scenar, obj, false, true, false);
		final String scenarName = "Defining " + (coreElement instanceof EClass ? "a " + coreElement.getName() : format(Docywood.getQName(coreElement)));

		return ("### <a name=\""+ scenarName.replaceAll(" ", "-") +"\"></a>" + scenarName + EOL + EOL + "```" + EOL + scenar.getCodeExample() + "```" + EOL +
			doc(coreElement) + coreAction.getText() + (prevActivities.isEmpty() ? "" : EOL + EOL + "See also:<br/>" + EOL +
			prevActivities.stream().map(node -> "[" + node.getName() + "](" + node.getName().replaceAll(" ", "-") + ")").
				collect(Collectors.joining("<br/>" + EOL)))).replaceAll("  ", " ").replaceAll("In our example, type: ``.", "");
	}

	private String getFormattedObject(final String format, final Object obj) {
		Path dir = Paths.get(CONFIG + dslName);
		Path path = Paths.get(CONFIG + dslName + "/" + format + ".js");
		if(!Files.exists(path)) {
			try {
				if(!Files.exists(dir)) {
					Files.createDirectories(dir);
				}

				final List<String> jscode = Arrays.asList("// Javascript code here.", "// Use the variable 'obj' to format it as expected in the variable 'res'.",
					"// For instance:", "// res = \"'\" + obj.toString() + \"'\"", "// Helper methods can be coded here as in any Javascript file.",
					"res = obj.toString();");

				Files.write(path, jscode);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

		try {
			String jscode = Files.readAllLines(path).stream().collect(Collectors.joining(EOL));
			engine.put("obj", obj);
			return engine.eval(jscode).toString();
		}catch(IOException | ScriptException e) {
			e.printStackTrace();
		}

		return "";
	}


	private void produceActionText(final Action scenar, final DynamicEObjectImpl obj, final boolean partOfASequence,
								   final boolean initialposition, final boolean noExample) {
		if(scenar instanceof TypeSymbolAction) {
			String txt = ((TypeSymbolAction) scenar).getTxt();
			String expl = symbolExplained.get(txt);
			String codeEx = txt;

			if(openBlock.contains(txt)) {
				tabs++;
				codeEx += EOL;
			}
			if(closeBlock.contains(txt)) {
				tabs--;
				codeEx += EOL;
			}

			scenar.setCodeExample(codeEx);
			scenar.setText("Type " + ttt(txt) + (expl == null ? "" : " to " + expl) + ". ");
			return;
		}
		if(scenar instanceof ConceptAttributeAction) {
			final ConceptAttributeAction caa = (ConceptAttributeAction) scenar;
			final EStructuralFeature elt = caa.getElt();
			EStructuralFeature feat = null;
			Object value;
			feat = (EStructuralFeature) slice2OriginMM.get(elt);

			if(feat == null) {
				throw new IllegalArgumentException("Cannot find the feature: " + elt);
			}

			value = obj.eGet(feat);

			if(value instanceof EcoreEList) {
				final EcoreEList<?> list = (EcoreEList<?>) value;
				if(list.isEmpty()) {
					throw new IllegalArgumentException("The input model does not have the following feature: " + feat + " for the object " + obj);
				}
				value = list.get(0);
			}

			if(caa.getActions().size() == 1 && caa.getActions().get(0) instanceof WithFormatAction) {
				String format = ((WithFormatAction) caa.getActions().get(0)).getFormat().getName();
				value = getFormattedObject(format, value);

				if(!partOfASequence) {
					scenar.setText(formatExplained.getOrDefault(Docywood.getQName(feat), "`" + elt.getName() + "`") +
						" must be defined. " + doc(elt));
				}

				if(value != null && initialposition) {
					scenar.setCodeExample(value.toString() + ' ');
				}
			}

			caa.getActions().forEach(act -> produceActionText(act, obj, partOfASequence, true, noExample));
			return;
		}

		if(scenar instanceof WithFormatAction) {
			if(partOfASequence) {
				scenar.setText("Then, give the value, here: `<%%%>`.");
			}else {
				String format = ((WithFormatAction) scenar).getFormat().getName();
				scenar.setText("The expected format is " + formatExplained.getOrDefault(format, format) +
					(noExample ? "." : ".  In our example, type: `<%%%>`."));
			}
			return;
		}

		if(scenar instanceof CompositeAction) {
			DynamicEObjectImpl theobject;

			if(scenar instanceof ConceptAction) {
				final String qname = Docywood.getQName(((ConceptAction) scenar).getElt());
				final TreeIterator<EObject> content = obj.eAllContents();
				theobject = null;

				while(content.hasNext() && theobject == null) {
					EObject next = content.next();
					if(next instanceof DynamicEObjectImpl && Docywood.getQName(next.eClass()).equals(qname)) {
						theobject = (DynamicEObjectImpl) next;
					}
				}

				if(theobject == null) {
					theobject = model.stream().filter(o -> Docywood.getQName(o.eClass()).equals(qname)).findFirst().
						orElseThrow(() -> new IllegalArgumentException("Cannot find a model element for " + qname + " with the following features: " + scenar));
				}
			}else {
				theobject = obj;
			}

			final DynamicEObjectImpl theCurrentOject = theobject;
			final CompositeAction compo = (CompositeAction) scenar;
			final Set<ConceptAttributeAction> features = compo.getFeatures();

			if(features.size() == 1) {
				compo.setCodeExample(IntStream.range(0, tabs).mapToObj(i -> "\t").collect(Collectors.joining()));
				compo.setCodeExampleEnd(EOL);

				produceActionText(features.iterator().next(), theobject, false, false, true);
				scenar.setText(features.iterator().next().getText());
				features.iterator().next().setText("");

				compo.getActions().forEach(act -> produceActionText(act, theCurrentOject, true, true, false));
			}else {
				compo.getActions().forEach(act -> produceActionText(act, theCurrentOject, false, true, false));
			}
			return;
		}

		System.err.println(scenar.getClass() + " not supported.");
	}


	private String doc(final EModelElement elt) {
		return format(Docywood.getEcoreDocOf(elt).map(txt -> txt + " ").orElse(""));
	}

	private String format(final String str) {
		return formatExplained.getOrDefault(str, str);
	}

	private String ttt(final String elt) {
		return "`" + elt + "`";
	}

	private void reduceTypeAction(final CompositeAction scenar) {
		List<Action> actions = scenar.getActions();
		int i = 0;
		List<TypeSymbolAction> types = new ArrayList<>();
		int pos = 0;

		while(i < actions.size()) {
			final Action act = actions.get(i);

			if(act instanceof TypeSymbolAction && !unjoinable.contains(((TypeSymbolAction) act).getTxt())) {
				if(types.isEmpty()) {
					pos = i;
				}
				types.add((TypeSymbolAction) act);
				i++;
			}else {
				if(types.size() > 1) {
					TypeSymbolAction ty = new TypeSymbolAction(types.stream().map(t -> t.getTxt()).collect(Collectors.joining(" ")));
					actions.set(pos, ty);
					final int position = pos + 1;
					IntStream.range(position, pos + types.size()).forEach(j -> actions.remove(position));
					i -= types.size() - 2;
				}else {
					i++;
				}
				types.clear();

				if(act instanceof CompositeAction) {
					reduceTypeAction((CompositeAction) act);
				}
			}
		}
	}
}
