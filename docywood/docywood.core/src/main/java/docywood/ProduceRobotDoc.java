package docywood;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.xtext.Grammar;

public class ProduceRobotDoc {
	public static void main(final String[] args) throws IOException {
		final List<EPackage> metamodel = Docywood.loadMetamodel("src/main/resources/robot/logo.ecore");
		Grammar grammar = Docywood.loadXText("src/main/resources/robot/Logo.xtext");
		EPackage rootPkg = metamodel.get(0);
		Activity activity = (Activity) Docywood.produceActivityDiagram(
			(EClass) rootPkg.getEClassifier("ProgramUnit"), rootPkg, "Robot", false).getPackagedElements().get(0);

		Activity2MarkDownScenarios scen = new Activity2MarkDownScenarios(rootPkg, "src/main/resources/robot/",
			activity, grammar, "output/robot/");
		scen.produce();
	}
}
