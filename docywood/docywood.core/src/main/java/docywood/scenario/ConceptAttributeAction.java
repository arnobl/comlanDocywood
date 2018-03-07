package docywood.scenario;

import docywood.Docywood;
import java.util.List;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ConceptAttributeAction extends ConceptElementAction<EStructuralFeature> {

	public ConceptAttributeAction(final EStructuralFeature at, final List<Action> acts) {
		super(at);
		addActions(acts);
	}

	@Override
	public String toString() {
		return "ConceptAttributeAction{attr=" + Docywood.getQName(elt) + ", actions=" + actions + '}';
	}

	@Override
	public ConceptAttributeAction duplicate() {
		return new ConceptAttributeAction(elt, actions.stream().map(act -> act.duplicate()).collect(Collectors.toList()));
	}

	@Override
	public String getText() {
		return super.getText().replaceAll("<%%%>", codeExample) + "\n";
	}
}
