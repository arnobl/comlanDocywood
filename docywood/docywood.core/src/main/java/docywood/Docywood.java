package docywood;

import com.google.inject.Injector;
import docywood.scenario.Action;
import docywood.scenario.CompositeAction;
import docywood.scenario.ConceptAction;
import docywood.scenario.ConceptAttributeAction;
import docywood.scenario.TypeSymbolAction;
import docywood.scenario.WithFormatAction;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.utils.StandaloneSetup;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.resource.UMLResourceFactoryImpl;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CompoundElement;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.XtextStandaloneSetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import strictecore.StrictEcore;

public class Docywood {
	private static final Action NOPE = new Action() {
		@Override
		public Action duplicate() {
			return this;
		}
	};

	static {
		EcoreFactory.eINSTANCE.eClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
	}

	private final Map<ENamedElement, Integer> max;
	private final Map<ENamedElement, Integer> count;


	public Docywood() {
		super();
		max = new HashMap<>();
		count = new HashMap<>();
	}


	public static StrictEcore getMinimalEcore(final List<EPackage> mm) {
		EClass root = getRootClasses(mm).iterator().next();
		StrictEcore slicer = new StrictEcore(Collections.singletonList(root), root, false, true);
		slicer.slice();
		slicer.reinit();
		return slicer;
	}


	public static Set<EClass> getRootClasses(final List<EPackage> mm) {
		final Set<EClass> classes = mm.parallelStream().map(pkg -> pkg.getEClassifiers().parallelStream().
			filter(cl -> cl instanceof EClass).map(cl -> (EClass) cl)).
			flatMap(s -> s).collect(Collectors.toSet());

		mm.get(0).eAllContents().forEachRemaining(o -> {
			if(o instanceof EReference) {
				classes.remove(((EReference) o).getEType());
			}
		});

		int size;
		do {
			size = classes.size();
			classes.removeIf(cl -> !cl.getESuperTypes().isEmpty() && cl.getESuperTypes().stream().noneMatch(sup -> classes.contains(sup)));
		}while(size != classes.size());

		return classes;
	}


	public static Optional<String> getEcoreDocOf(final EModelElement elt) {
		return elt.getEAnnotations().stream().map(an -> an.getDetails().get("documentation")).filter(doc -> doc != null).findAny();
	}


	public static String getQName(final ENamedElement elt) {
		if(elt == null) return "";

		String qn = elt.getName();

		if(elt.eContainer() instanceof ENamedElement) {
			qn = getQName((ENamedElement) elt.eContainer()) + "." + qn;
		}

		return qn;
	}

	public static Model produceActivityDiagram(final EClass rootClassMM, final EPackage root, final String dslName, final boolean coverAllRelations) {
		final UMLFactory fac = UMLFactory.eINSTANCE;
		Model umlModel = fac.createModel();
		InitialNode init = fac.createInitialNode();
		ActivityFinalNode end = fac.createActivityFinalNode();
		Activity activity = fac.createActivity();
		activity.setName("The serie of documentations for " + dslName);

		init.setName("init");
		end.setName("end");

		umlModel.getPackagedElements().add(activity);
		activity.getNodes().add(init);

		produceActivityDiagram(rootClassMM, null, new HashSet<>(), activity, init, new HashSet<>(), root, new HashSet<>(), coverAllRelations);
		activity.getNodes().stream().filter(node -> node.getOutgoings().isEmpty()).forEach(node -> {
			ControlFlow flow = fac.createControlFlow();
			flow.setSource(node);
			flow.setTarget(end);
		//	flow.setName(node.getName() + " -> " + end.getName());
			activity.getEdges().add(flow);
		});

		activity.getNodes().add(end);

		return umlModel;
	}

	private static void produceActivityDiagram(final EClass eclass, final EReference eref, final Set<EClass> done, final Activity activity,
											   final ActivityNode prevNode, final Set<EModelElement> slicedElts, final EPackage root,
											   final Set<EModelElement> toAddToSlicer, final boolean coverAllRelations) {
		if(eclass.eIsProxy() || done.contains(eclass) || !getQName(eclass).startsWith(getQName(root))) return;

		final UMLFactory fac = UMLFactory.eINSTANCE;
		ActivityNode previousNode = prevNode;

		done.add(eclass);

		if(!slicedElts.contains(eclass)) {
			if(!eclass.isAbstract()) {
				OpaqueAction act = fac.createOpaqueAction();
				ControlFlow flow = fac.createControlFlow();
				toAddToSlicer.add(eclass);
				StrictEcore slicer = new StrictEcore(Collections.unmodifiableSet(toAddToSlicer), eclass, false, true);
				slicer.slice();
				slicedElts.addAll(slicer.sliceToOriginal.values());
				slicer.reinit();

				act.setName("Defining a " + eclass.getName());
				act.createInputValue(getQName(eclass), null);
				if(eref != null) {
					act.createInputValue(getQName(eref), null);
				}
				flow.setSource(previousNode);
				flow.setTarget(act);
			//	flow.setName(previousNode.getName() + " -> " + act.getName());
				activity.getNodes().add(act);
				activity.getEdges().add(flow);
				previousNode = act;
			}

			root.getEClassifiers().stream().
				filter(classif -> classif != eclass && classif instanceof EClass && eclass.isSuperTypeOf((EClass) classif)).
				forEach(lower -> produceActivityDiagram((EClass) lower, eref, done, activity, prevNode, slicedElts, root,
						new HashSet<>(toAddToSlicer), coverAllRelations));
		}

		for(final EAttribute attr : eclass.getEAllAttributes()) {
			if(!attr.isDerived() && !slicedElts.contains(attr)) {
				OpaqueAction tgtAction = fac.createOpaqueAction();
				ControlFlow flow = fac.createControlFlow();

				tgtAction.createInputValue(getQName(attr), null);
				tgtAction.setName("Defining a " + attr.getName() + " " + attr.getEContainingClass().getName());

				flow.setSource(previousNode);
				flow.setTarget(tgtAction);
	//			flow.setName(previousNode.getName() + " -> " + tgtAction.getName());

				activity.getNodes().add(tgtAction);
				activity.getEdges().add(flow);

				slicedElts.add(attr);
			}
		}

		for(final EReference ref : eclass.getEAllReferences()) {
			if(!ref.isDerived() && ref.getEType() instanceof EClass) {
				final Set<EModelElement> toAddToSliceClone = new HashSet<>(toAddToSlicer);
				toAddToSliceClone.add(ref);
				toAddToSliceClone.add(ref.getEType());
				produceActivityDiagram((EClass) ref.getEType(), ref, done, activity, previousNode, slicedElts, root, toAddToSliceClone, coverAllRelations);
			}
		}
	}


	public static void saveUMLModel(Element umlModel, final String path) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("uml", new UMLResourceFactoryImpl());
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.createResource(URI.createURI(path));

		try {
			res.getContents().add(umlModel);
			res.save(Collections.emptyMap());
		}catch(IOException e) {
			e.printStackTrace();
		}
	}


	public static Model loadUMLModel(final String path) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(UMLPackage.eINSTANCE.getNsURI(), UMLPackage.eINSTANCE);
		Resource res = rs.getResource(URI.createURI(path), true);

		try {
			res.load(Collections.emptyMap());
			return (Model) res.getContents().stream().filter(elt -> elt instanceof Model).findAny().orElse(null);
		}catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}


	public static List<DynamicEObjectImpl> loadModel(final String path, final EPackage mm) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getPackageRegistry().put(mm.getNsURI(), mm);
		Resource res = rs.getResource(URI.createURI(path), true);
		try {
			res.load(Collections.emptyMap());
			return res.getContents().stream().map(elt -> (DynamicEObjectImpl)elt).collect(Collectors.toList());
		}catch(IOException e) {
			e.printStackTrace();
		}
		return Collections.emptyList();
	}


	public static List<DynamicEObjectImpl> sliceModel(final Collection<DynamicEObjectImpl> model, final EPackage mm, final EPackage orig) {
		final List<EClass> classifSlice = mm.getEClassifiers().stream().filter(c -> c instanceof EClass).map(c -> (EClass)c).collect(Collectors.toList());
		final List<EClass> classifOrigin = orig.getEClassifiers().stream().filter(c -> c instanceof EClass).map(c -> (EClass)c).collect(Collectors.toList());
		final List<DynamicEObjectImpl> slice = new ArrayList<>();

		for(final DynamicEObjectImpl object : model) {
			if(classifSlice.stream().
				anyMatch(cl -> isObjectCompatibleWithClass(object, cl, classifOrigin.stream().
				filter(c -> getQName(c).equals(getQName(cl))).findAny().get()))) {
				// Keeping the element and collecting it in a list.
				slice.add(object);
			}else {
				// Removing the element from the model.
				try {
					object.eBasicRemoveFromContainer(null);
				}catch(ClassCastException ex) {

				}
			}
		}

		slice.forEach(m -> sliceObject(m, classifSlice, classifOrigin));

		return slice;
	}


	private static boolean isObjectCompatibleWithClass(final DynamicEObjectImpl obj, final EClass classifSliced,
													   final EClass classifOrigin) {
		if( obj == null || classifSliced == null || !getQName(classifSliced).equals(getQName(obj.eClass()))) return false;
		return classifSliced.getEAllStructuralFeatures().stream().
			filter(feat -> !feat.isDerived()).
			map(feat -> classifOrigin.getEAllStructuralFeatures().stream().filter(feat2 -> feat.getName().equals(feat2.getName())).
			findAny().get()).allMatch(feat -> {
				try {
					Object val = obj.eGet(feat);
					return val != null && (!(val instanceof EcoreEList<?>) || !((EcoreEList<?>)val).isEmpty());
				}catch(Exception ex) {
					return false;
				}
		});
	}


	private static void sliceObject(final DynamicEObjectImpl object, final Collection<EClass> classifSlice, final Collection<EClass> classifOrigin) {
		final String name = getQName(object.eClass());
		final EClass slicedClass = classifSlice.stream().filter(cl -> getQName(cl).equals(name)).findAny().get();
		final EClass originClass = classifOrigin.stream().filter(cl -> getQName(cl).equals(name)).findAny().get();

		// Removing objects
		final Set<DynamicEObjectImpl> toremove = new HashSet<>();
		object.eAllContents().forEachRemaining(content -> {
			if(content instanceof DynamicEObjectImpl && classifSlice.stream().
				noneMatch(c -> getQName(c).equals(getQName(content.eClass())))) {
				toremove.add((DynamicEObjectImpl) content);
			}
		});
		toremove.forEach(c -> c.eBasicRemoveFromContainer(null));

		// Removing attributes
		removeAttributes(originClass, slicedClass, object);

		// Recursive slice
		object.eAllContents().forEachRemaining(content -> {
			if(content instanceof DynamicEObjectImpl) {
				sliceObject((DynamicEObjectImpl) content, classifSlice, classifOrigin);
			}
		});
	}


	private static void removeAttributes(final EClass origin, final EClass sliced, final DynamicEObjectImpl object) {
		origin.getEAllStructuralFeatures().stream().
			filter(s -> sliced.getEAllStructuralFeatures().stream().noneMatch(s2 -> getQName(s2).equals(getQName(s)))).
			map(s -> s.getFeatureID()).forEach(id -> object.dynamicUnset(id));
	}


//	public static List<List<?>> checkOCLModel(final List<DynamicEObjectImpl> model, final List<Constraint> csts, final EPackage mm) {
//		EPackage.Registry reg = new EPackageRegistryImpl();
//		reg.put(mm.getNsURI(), mm);
//		EcoreEnvironmentFactory eef = new EcoreEnvironmentFactory(reg);
//		OCL ocl = OCL.newInstance(eef);
//
//		return csts.stream().map(cst -> ocl.createQuery(cst).evaluate(model)).collect(Collectors.toList());
//	}
//
//
//	public static List<Constraint> loadOCL(final EPackage mm, final String oclFile) {
//		EPackage.Registry reg = new EPackageRegistryImpl();
//		reg.put(mm.getNsURI(), mm);
//		EcoreEnvironmentFactory eef = new EcoreEnvironmentFactory(reg);
//		OCL ocl = OCL.newInstance(eef);
//		try {
//			InputStream in = new FileInputStream(oclFile);
//			OCLInput doc = new OCLInput(in);
//			List<Constraint> csts = ocl.parse(doc);
//			System.out.println(csts);
//			return csts;
//		}catch(FileNotFoundException | ParserException e) {
//			e.printStackTrace();
//		}
//		return Collections.emptyList();
//	}


	public static List<EPackage> loadMetamodel(final String path) throws IOException {
		final ResourceSet rs = new ResourceSetImpl();
		final Resource res = rs.getResource(URI.createURI(path), true);

		res.load(Collections.emptyMap());

		return res.getContents().parallelStream().filter(elt -> elt instanceof EPackage).map(pkg -> (EPackage) pkg).collect(Collectors.toList());
	}


	public static Grammar loadXText(final String path) {
		new StandaloneSetup().setPlatformUri("../");
		Injector injector = new XtextStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(path), true);
		return (Grammar) resource.getContents().get(0);
	}


	public Collection<EClass> getSubClasses(final EClass cl) {
		if(cl == null || cl.getEPackage() == null) return Collections.emptySet();
		return cl.getEPackage().getEClassifiers().stream().filter(classif -> classif instanceof EClass).map(classif -> (EClass) classif).
			filter(lower -> cl.isSuperTypeOf(lower)).collect(Collectors.toSet());
	}


	public Optional<AbstractRule> getXtextElementFromEClassifier(final Grammar grammar, final EClassifier elt) {
		if(elt == null || grammar == null) return Optional.empty();
		final String pkgQN = getQName(elt.getEPackage());

		elt.eAllContents().forEachRemaining(a -> {
			if(a instanceof EStructuralFeature) {
				final EStructuralFeature struct = (EStructuralFeature) a;
				final EClassifier eType = struct.getEType();

				if(eType instanceof EClass && getQName(eType.getEPackage()).equals(pkgQN)) {
					Collection<EClass> subs = getSubClasses((EClass) eType);
					subs.add((EClass) eType);
					subs.removeIf(cl -> cl.isAbstract());
					max.put(struct, subs.size());
					count.put(struct, 0);
					subs.forEach(sub -> {
						max.put(sub, 1);
						count.put(sub, 0);
					});
				}else {
					max.put(struct, 1);
					count.put(struct, 0);
				}
			}
		});

		if(elt instanceof EClass) {
			EClass eClass = (EClass) elt;
			eClass.getESuperTypes().forEach(supercl -> getXtextElementFromEClassifier(grammar, supercl));
		}

		return grammar.getRules().parallelStream().
			filter(rule -> rule.getType().getClassifier() != null && getQName(elt).equals(getQName(rule.getType().getClassifier()))).findAny();
	}


	public ConceptAction getTutorialText(final AbstractRule rule, final Collection<EClass> slicedClass, final EClass rootClass) {
		ConceptAction action = new ConceptAction(rootClass);
		action.addActions(getTutorialtextFromXTextElementRoot(rule.getAlternatives(), slicedClass));
		return action;
	}


	public List<Action> getTutorialtextFromXTextElementRoot(final AbstractElement elt, final Collection<EClass> slicedClass) {
		if(elt instanceof CompoundElement) {
			final ObjectProperty<AbstractElement> prevElt = new SimpleObjectProperty<>();

			return ((CompoundElement) elt).getElements().stream().map(gpElt -> {
				final Action actions = getTutorialtextFromXTextElement(gpElt, slicedClass, prevElt.get());
				if(actions != null) {
					prevElt.set(gpElt);
					return actions;
				}
				return null;
			}).filter(act -> act != null && act != NOPE).collect(Collectors.toList());
		}

		final Action action = getTutorialtextFromXTextElement(elt, slicedClass, null);
		return action == null || action == NOPE ? Collections.emptyList() : Collections.singletonList(action);
	}


	private Optional<AbstractRule> getMainParentRule(final AbstractElement elt) {
		if(elt == null) return Optional.empty();
		EObject cont = elt.eContainer();

		while(cont != null && !(cont instanceof AbstractRule)) {
			cont = cont.eContainer();
		}

		return Optional.ofNullable((AbstractRule)cont);
	}


	private Action getTutorialtextFromXTextElement(final AbstractElement elt, final Collection<EClass> classes, final AbstractElement prev) {
		if(elt instanceof Alternatives && ((Alternatives) elt).getElements().stream().allMatch(e -> e instanceof RuleCall)) {
			final Alternatives alt = (Alternatives) elt;
			final List<AbstractElement> filtered = alt.getElements().stream().filter(e -> e instanceof RuleCall).map(e -> (RuleCall)e).
				filter(e -> classes.stream().anyMatch(c -> getQName(c).equals(getQName(e.getRule().getType().getClassifier())))).collect(Collectors.toList());

			switch(filtered.size()) {
				case 0: return NOPE;
				case 1: return getTutorialtextFromXTextElement(filtered.get(0), classes, prev);
				default:
					System.err.println("Warning: several alternatives: " + filtered);
					return getTutorialtextFromXTextElement(filtered.get(0), classes, prev);
			}
		}

		if(elt instanceof CompoundElement) {
			final CompoundElement comp = (CompoundElement) elt;
			final ObjectProperty<AbstractElement> prevElt = new SimpleObjectProperty<>(prev);

			List<Action> collect = comp.getElements().stream().map(gpElt -> {
				Action actions = getTutorialtextFromXTextElement(gpElt, classes, prevElt.get());
				if(actions != null) {
					prevElt.set(gpElt);
				}
				return actions;
			}).filter(act -> act != null).collect(Collectors.toList());

			if(collect.contains(NOPE) || collect.isEmpty()) {
				return null;
			}

			if(collect.size() == 1) {
				return collect.get(0);
			}

			CompositeAction compo = new CompositeAction();
			compo.addActions(collect);
			return compo;
		}

		if(elt instanceof Keyword) {
			Keyword key = (Keyword) elt;
			return new TypeSymbolAction(key.getValue());
		}

		if(elt instanceof Assignment) {
			final Assignment assig = (Assignment) elt;
			final String feature = assig.getFeature();
			final EClassifier ruleType = getMainParentRule(elt).get().getType().getClassifier();

			final List<EStructuralFeature> collect = classes.stream().map(c -> getEClassFeature(c, feature, ruleType)).
				filter(res -> res.isPresent() && max.getOrDefault(res.get(), Integer.MIN_VALUE) > count.getOrDefault(res.get(), Integer.MAX_VALUE)).
				filter(o -> o.isPresent()).map(o -> o.get()).collect(Collectors.toList());

			AbstractElement terminal = assig.getTerminal();

			if(!collect.isEmpty() && (terminal instanceof RuleCall || terminal instanceof Alternatives)) {
				RuleCall rulecall;

				// If the rule call another rule of an abstract class that contains alternatives
				if(terminal instanceof RuleCall &&
					((RuleCall)terminal).getRule().getType().getClassifier() instanceof EClass &&
					((EClass)((RuleCall)terminal).getRule().getType().getClassifier()).isAbstract() &&
					((RuleCall)terminal).getRule().getAlternatives() instanceof Alternatives) {
					terminal = ((RuleCall)terminal).getRule().getAlternatives();
				}

				// If it is a set of alternatives we have to find the good one
				if(terminal instanceof Alternatives) {
					rulecall = (RuleCall) ((Alternatives)terminal).getElements().stream().filter(altern ->
						altern instanceof RuleCall &&
							max.entrySet().stream().anyMatch(entry -> count.get(entry.getKey()) < entry.getValue() &&
								getQName(((RuleCall)altern).getRule().getType().getClassifier()).equals(getQName(entry.getKey())))
							).findFirst().orElse(null);
				}else {
					rulecall = (RuleCall) terminal;
				}

				if(rulecall == null) return NOPE;

				final EClassifier type = rulecall.getRule().getType().getClassifier();
				final String qn = getQName(type);

				if(type instanceof EClass) {
					Optional<ENamedElement> any = max.keySet().stream().filter(v -> getQName(v).equals(qn)).findAny();
					// Checking whether the type of the assignment must be analysed or ignored.
					if((!any.isPresent() && getQName(type.getEPackage()).equals(getQName(ruleType.getEPackage()))) ||
						(any.isPresent() && count.getOrDefault(any.get(), Integer.MIN_VALUE) >= max.getOrDefault(any.get(), Integer.MAX_VALUE))) {
						collect.clear();
					}else {
						if(any.isPresent() && max.getOrDefault(any.get(), Integer.MIN_VALUE) > count.getOrDefault(any.get(), Integer.MIN_VALUE)) {
							count.put(any.get(), count.get(any.get()) + 1);
						}
					}
				}
			}

			if(collect.isEmpty()) {
				return NOPE;
			}else {
				final EStructuralFeature sf = collect.get(0);
				count.put(sf, count.get(sf) + 1);
				return new ConceptAttributeAction(sf, Collections.singletonList(getTutorialtextFromXTextElement(assig.getTerminal(), classes, prev)));
			}
		}

		if(elt instanceof RuleCall) {
			AbstractRule called = ((RuleCall) elt).getRule();

			if(called instanceof ParserRule) {
				ParserRule rule = (ParserRule) called;
				Optional<EClass> concept = classes.stream().filter(cl -> getQName(rule.getType().getClassifier()).equals(getQName(cl))).findAny();

				if(concept.isPresent()) {
					ConceptAction conceptAction = new ConceptAction(concept.get());
					conceptAction.addActions(getTutorialtextFromXTextElementRoot(rule.getAlternatives(), classes));
					return conceptAction;
				}
			}
			return new WithFormatAction(called);
		}

		if(elt instanceof CrossReference) {
			CrossReference cross = (CrossReference) elt;
			return getTutorialtextFromXTextElement(cross.getTerminal(), classes, prev);
		}

		if(elt instanceof org.eclipse.xtext.Action) { // e.g. {Foo}
			return null;
		}

		System.err.println("Unsupported XText element: " + elt);

		return NOPE;
	}


	private Optional<EStructuralFeature> getEClassFeature(final EClass eclass, final String name, final EClassifier ruleType) {
		if(getQName(ruleType).equals(getQName(eclass))) {
			Optional<EStructuralFeature> found = eclass.getEAllStructuralFeatures().stream().filter(feat -> feat.getName().equals(name)).findAny();
			if(found.isPresent()) return found;
		}

		for(final EClass esuper : eclass.getESuperTypes()) {
			Optional<EStructuralFeature> found = getEClassFeature(esuper, name, ruleType);

			if(found.isPresent())
				return found;
		}

		return Optional.empty();
	}
}
