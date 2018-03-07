package docywood;

import docywood.scenario.ConceptAction;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.DynamicEObjectImpl;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Model;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestDocywood {
	List<EPackage> metamodel;
	Docywood docy;

	@Before
	public void setUp() throws IOException {
		metamodel = Docywood.loadMetamodel("src/main/resources/kompren/kompren.ecore");
		docy = new Docywood();
	}

	@Test
	public void testLoadMetamodel() {
		assertFalse(metamodel.isEmpty());
	}

	@Test
	public void testgetEcoreDocOf() {
		assertTrue(Docywood.getEcoreDocOf(metamodel.parallelStream().map(pkg -> pkg.getEClassifier("Slicer")).findAny().get()).isPresent());
	}

	@Test
	public void testGetRootClasses() {
		Set<EClass> roots = Docywood.getRootClasses(metamodel);
		assertEquals(1, roots.size());
	}

	@Test
	public void testMinimalEcoreOnePackage() {
		Set<EPackage> output = Docywood.getMinimalEcore(metamodel).getOutput();
		assertEquals(1, output.size());
	}

	@Test
	public void testMinimalEcoreOneClass() {
		Set<EPackage> output = Docywood.getMinimalEcore(metamodel).getOutput();
		assertEquals(1, output.iterator().next().getEClassifiers().size());
		assertTrue(output.iterator().next().getESubpackages().isEmpty());
	}

	@Test
	public void testMinimalEcoreClassKompren() {
		Set<EPackage> output = Docywood.getMinimalEcore(metamodel).getOutput();
		assertEquals("Slicer", output.iterator().next().getEClassifiers().get(0).getName());
	}

	@Test
	public void testMinimalEcoreClassKomprenAttr() {
		Set<EPackage> output = Docywood.getMinimalEcore(metamodel).getOutput();
		assertEquals(2, ((EClass) output.iterator().next().getEClassifiers().get(0)).getEAttributes().size());
		assertEquals("name", ((EClass) output.iterator().next().getEClassifiers().get(0)).getEAttributes().get(0).getName());
		assertEquals("uriMetamodel", ((EClass) output.iterator().next().getEClassifiers().get(0)).getEAttributes().get(1).getName());
	}

	@Test
	public void testMinimalEcoreClassKomprenRef() {
		Set<EPackage> output = Docywood.getMinimalEcore(metamodel).getOutput();
		assertEquals(1, ((EClass) output.iterator().next().getEClassifiers().get(0)).getEReferences().size());
		assertEquals("inputClasses", ((EClass) output.iterator().next().getEClassifiers().get(0)).getEReferences().get(0).getName());
	}

	@Test
	public void testLoadXText() {
		assertNotNull(Docywood.loadXText("src/main/resources/kompren/Kompren.xtext"));
	}

	@Test
	public void testGetXtextElementFromEClassifier() {
		Grammar grammar = Docywood.loadXText("src/main/resources/kompren/Kompren.xtext");
		EClassifier slicer = metamodel.get(0).getEClassifier("Slicer");
		docy.getXtextElementFromEClassifier(grammar, slicer);
	}

	@Test
	public void testGetXtextElementFromEClassifierFromSlicedMetamodel() {
		Grammar grammar = Docywood.loadXText("src/main/resources/kompren/Kompren.xtext");
		EPackage root = Docywood.getMinimalEcore(metamodel).getOutput().iterator().next();
		EClassifier slicer = root.getEClassifier("Slicer");
		docy.getXtextElementFromEClassifier(grammar, slicer);
	}

	@Test
	public void testGetTutorialText() {
		Grammar grammar = Docywood.loadXText("src/main/resources/kompren/Kompren.xtext");
		EPackage root = Docywood.getMinimalEcore(metamodel).getOutput().iterator().next();
		AbstractRule rule = docy.getXtextElementFromEClassifier(grammar, root.getEClassifier("Slicer")).orElseThrow(NullPointerException::new);
		EClass slicedClass = (EClass) root.getEClassifier("Slicer");
		ConceptAction act = docy.getTutorialText(rule, Collections.singletonList(slicedClass), slicedClass);
		assertNotNull(act);
		System.out.println(act);
	}

	@Test
	public void testLoadModel() {
		List<DynamicEObjectImpl> model = Docywood.loadModel("src/main/resources/kompren/models/myslicer.xmi", metamodel.get(0));
		assertFalse(model.isEmpty());
	}

	@Test
	public void testSliceModel() {
		EPackage root = Docywood.getMinimalEcore(metamodel).getOutput().iterator().next();
		List<DynamicEObjectImpl> model = Docywood.loadModel("src/main/resources/kompren/models/myslicer.xmi", metamodel.get(0));
		List<DynamicEObjectImpl> slice = Docywood.sliceModel(model, root, metamodel.get(0));
		assertEquals(1, slice.size());
	}

	@Test
	public void testProduceActivityDiagram() {
		Model umlModel = Docywood.produceActivityDiagram(
			(EClass) metamodel.get(0).getEClassifiers().get(0), metamodel.get(0), "Kompren", false);
		Docywood.saveUMLModel(umlModel, "output/kompren/komprenDefaultActDiag.uml");
	}

	@Test
	public void testProduceActivityDiagramRobot() throws IOException {
		metamodel = Docywood.loadMetamodel("src/main/resources/robot/logo.ecore");
		Model umlModel = Docywood.produceActivityDiagram(
			(EClass) metamodel.get(0).getEClassifiers().get(0), metamodel.get(0), "ProgramUnit", false);
		Docywood.saveUMLModel(umlModel, "output/robot/robotDefaultActDiagram.uml");
	}

	@Test
	public void testProduceThingMLActivityDiagram() throws IOException {
		metamodel = Docywood.loadMetamodel("src/main/resources/thingML/ThingML.ecore");
		Model umlModel = Docywood.produceActivityDiagram(
			(EClass) metamodel.get(0).getEClassifiers().get(0), metamodel.get(0), "ThingML", false);
		Docywood.saveUMLModel(umlModel, "output/ThingML/thingMLDefaultActDiagram.uml");
	}


	@Test
	public void testProduceTPDActivityDiagram() throws IOException {
		metamodel = Docywood.loadMetamodel("src/main/resources/tpd/targetplatform.ecore");
		Model umlModel = Docywood.produceActivityDiagram(
			(EClass) metamodel.get(0).getEClassifiers().get(0), metamodel.get(0), "TPD", false);
		Docywood.saveUMLModel(umlModel, "output/tpd/tpdDefaultActDiagram.uml");
	}


	@Test
	public void testKomprenDocGen() {
		Grammar grammar = Docywood.loadXText("src/main/resources/kompren/Kompren.xtext");
		EPackage rootPkg = metamodel.get(0);
//		Activity activity = (Activity) Docywood.produceActivityDiagram(
//			(EClass) rootPkg.getEClassifier("Slicer"), rootPkg, "Kompren", false).getPackagedElements().get(0);
		Activity activity = (Activity) Docywood.loadUMLModel("output/kompren/komprenDefaultActDiag.uml").getPackagedElements().get(0);

		Activity2MarkDownScenarios scen = new Activity2MarkDownScenarios(rootPkg, "src/main/resources/kompren/models/",
			activity, grammar, "output/kompren/");
		scen.produce();
	}

	@Test
	public void testRobotDocGen() throws IOException {
		metamodel = Docywood.loadMetamodel("src/main/resources/robot/logo.ecore");
		Grammar grammar = Docywood.loadXText("src/main/resources/robot/Logo.xtext");
		EPackage rootPkg = metamodel.get(0);
		Activity activity = (Activity) Docywood.produceActivityDiagram(
			(EClass) rootPkg.getEClassifier("ProgramUnit"), rootPkg, "Robot", false).getPackagedElements().get(0);
//		Activity activity = (Activity) Docywood.loadUMLModel("robotScenarios.uml").getPackagedElements().get(0);

		Activity2MarkDownScenarios scen = new Activity2MarkDownScenarios(rootPkg, "src/main/resources/robot/",
			activity, grammar, "output/robot/");
		scen.produce();
	}

	@Test
	public void testThingMLDocGen() throws IOException {
		metamodel = Docywood.loadMetamodel("src/main/resources/thingML/ThingML.ecore");
		Grammar grammar = Docywood.loadXText("src/main/resources/thingML/ThingML.xtext");
		EPackage rootPkg = metamodel.get(0);
//		Activity activity = (Activity) Docywood.produceActivityDiagram(
//			(EClass) rootPkg.getEClassifier("ThingMLModel"), rootPkg, "ThingML", false).getPackagedElements().get(0);
		Activity activity = (Activity) Docywood.loadUMLModel("output/ThingML/thingMLDefaultActDiagram.uml").getPackagedElements().get(0);

		Activity2MarkDownScenarios scen = new Activity2MarkDownScenarios("ThingMLModel",
			rootPkg, "src/main/resources/thingML/models/",
			activity, grammar, "output/ThingML/");
		scen.produce();
	}

	@Test
	public void testTPDDocGen() throws IOException {
		metamodel = Docywood.loadMetamodel("src/main/resources/tpd/targetplatform.ecore");
		Grammar grammar = Docywood.loadXText("src/main/resources/tpd/TargetPlatform.xtext");
		EPackage rootPkg = metamodel.get(0);
//		Activity activity = (Activity) Docywood.produceActivityDiagram(
//			(EClass) rootPkg.getEClassifier("TargetPlatform"), rootPkg, "TPD", false).getPackagedElements().get(0);
		Activity activity = (Activity) Docywood.loadUMLModel("output/tpd/tpdDefaultActDiagram.uml").getPackagedElements().get(0);

		Activity2MarkDownScenarios scen = new Activity2MarkDownScenarios("TargetPlatform",
			rootPkg, "src/main/resources/tpd/models/", activity, grammar, "output/tpd/");
		scen.produce();
	}
}
