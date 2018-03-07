package docywood.scenario;

import docywood.Docywood;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EClass;

public class ConceptAction extends ConceptElementAction<EClass> {
	public ConceptAction(final EClass ecl) {
		super(ecl);
	}

	@Override
	public String toString() {
		return "Concept{\n\telement=" + Docywood.getQName(elt) + ",\n\tactions=\n\t\t" +
			actions.stream().map(ac -> ac.toString()).collect(Collectors.joining("\n\t\t")) + "\n}";
	}

	@Override
	public ConceptAction duplicate() {
		ConceptAction dup = new ConceptAction(elt);
		dup.addActions(actions.stream().map(act -> act.duplicate()).collect(Collectors.toList()));
		return dup;
	}

	@Override
	public String getText() {
		return text.replaceAll("<%%%>", codeExample) + actions.stream().map(ac -> ac.getText()).filter(txt -> !txt.isEmpty()).collect(Collectors.joining("\n\n"));
	}
}
