package docywood;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.xtext.Grammar;

public class ProduceThingMLDoc {
	public static void main(final String[] args) throws IOException {
		final List<EPackage> metamodel = Docywood.loadMetamodel("src/main/resources/thingML/ThingML.ecore");
		Grammar grammar = Docywood.loadXText("src/main/resources/thingML/ThingML.xtext");
		EPackage rootPkg = metamodel.get(0);
		Activity activity = (Activity) Docywood.loadUMLModel("output/ThingML/thingMLDefaultActDiagram.uml").getPackagedElements().get(0);
		Activity2MarkDownScenarios scen = new Activity2MarkDownScenarios("ThingMLModel",
			rootPkg, "src/main/resources/thingML/models/",
			activity, grammar, "output/ThingML/");
		scen.produce();
	}
}
