package docywood;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.xtext.Grammar;

public class ProduceKomprenDoc {
	public static void main(final String[] args) throws IOException {
		final List<EPackage>  metamodel = Docywood.loadMetamodel("src/main/resources/kompren/kompren.ecore");
		final Grammar grammar = Docywood.loadXText("src/main/resources/kompren/Kompren.xtext");
		final EPackage rootPkg = metamodel.get(0);
		final Activity activity = (Activity) Docywood.loadUMLModel("output/kompren/komprenDefaultActDiag.uml").getPackagedElements().get(0);

		Activity2MarkDownScenarios scen = new Activity2MarkDownScenarios(rootPkg, "src/main/resources/kompren/models/",
			activity, grammar, "output/kompren/");
		scen.produce();
	}
}
