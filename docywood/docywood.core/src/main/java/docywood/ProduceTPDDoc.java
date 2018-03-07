package docywood;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.xtext.Grammar;

public class ProduceTPDDoc {
	public static void main(final String[] args) throws IOException {
		final List<EPackage> metamodel = Docywood.loadMetamodel("src/main/resources/tpd/targetplatform.ecore");
		Grammar grammar = Docywood.loadXText("src/main/resources/tpd/TargetPlatform.xtext");
		EPackage rootPkg = metamodel.get(0);
		Activity activity = (Activity) Docywood.loadUMLModel("output/tpd/tpdDefaultActDiagram.uml").getPackagedElements().get(0);

		Activity2MarkDownScenarios scen = new Activity2MarkDownScenarios("TargetPlatform",
			rootPkg, "src/main/resources/tpd/models/", activity, grammar, "output/tpd/");
		scen.produce();
	}
}
