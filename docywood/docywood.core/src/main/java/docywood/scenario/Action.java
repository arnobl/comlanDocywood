package docywood.scenario;

import java.util.Optional;
import org.eclipse.emf.ecore.ENamedElement;

public abstract class Action {
	protected String codeExample;
	protected String text;

	public Action() {
		super();
		codeExample = "";
		text = "";
	}

	public abstract Action duplicate();

	public String getCodeExample() {
		return codeExample;
	}

	public void setCodeExample(final String str) {
		codeExample = str == null ? "" : str;
	}

	public String getText() {
		return codeExample.isEmpty() ? text : text.replaceAll("<%%%>", codeExample);
	}

	public void setText(final String txt) {
		text = txt == null ? "" : txt;
	}

	public Optional<Action> findActionWith(final ENamedElement elt) {
		return Optional.empty();
	}
}
