package docywood.scenario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.ENamedElement;

public class CompositeAction extends Action {
	protected final List<Action> actions;
	protected String codeExampleEnd;

	public CompositeAction() {
		super();
		actions = new ArrayList<>();
		codeExampleEnd = "";
	}

	public void addActions(final List<Action> acts) {
		if(acts != null) {
			actions.addAll(acts);
		}
	}

	public List<Action> getActions() {
		return actions;
	}

	public Set<ConceptAttributeAction> getFeatures() {
		return actions.stream().map(act -> {
			if(act instanceof ConceptAttributeAction) {
				return Collections.singleton((ConceptAttributeAction) act);
			}
			if(act instanceof CompositeAction) {
				return ((CompositeAction) act).getFeatures();
			}
			return Collections.<ConceptAttributeAction>emptySet();
		}).flatMap(s -> s.stream()).collect(Collectors.toSet());
	}

	@Override
	public CompositeAction duplicate() {
		CompositeAction dup = new CompositeAction();
		dup.addActions(actions.stream().map(act -> act.duplicate()).collect(Collectors.toList()));
		return dup;
	}

	@Override
	public String toString() {
		return "CompositeAction{\n\t" + actions.stream().map(ac -> ac.toString()).collect(Collectors.joining("\n\t\t")) + "\n}";
	}

	@Override
	public String getCodeExample() {
		return codeExample + actions.stream().map(ac -> ac.getCodeExample()).filter(txt -> !txt.isEmpty()).
			collect(Collectors.joining(" ")) + getCodeExampleEnd();
	}

	public String getCodeExampleEnd() {
		return codeExampleEnd;
	}

	public void setCodeExampleEnd(final String str) {
		codeExampleEnd = str == null ? "" : str;
	}

	@Override
	public String getText() {
		return text.replaceAll("<%%%>", codeExample) + actions.stream().map(ac -> ac.getText()).filter(txt -> !txt.isEmpty()).collect(Collectors.joining("\n"));
	}

	@Override
	public Optional<Action> findActionWith(final ENamedElement elt) {
		return actions.stream().map(act -> act.findActionWith(elt)).filter(act -> act.isPresent()).findAny().orElse(Optional.empty());
	}
}
