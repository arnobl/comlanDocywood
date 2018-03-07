package docywood.scenario;

import org.eclipse.xtext.AbstractRule;

public class WithFormatAction extends Action {
	private final AbstractRule format;

	public WithFormatAction(final AbstractRule ft) {
		super();
		format = ft;
	}

	@Override
	public String toString() {
		return "WithFormatAction{" + "format=" + format.getName() + '}';
	}

	public AbstractRule getFormat() {
		return format;
	}

	@Override
	public WithFormatAction duplicate() {
		return new WithFormatAction(format);
	}

	@Override
	public String getText() {
		return super.getText();
	}
}
