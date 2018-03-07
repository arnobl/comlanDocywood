package docywood.scenario;

public class TypeSymbolAction extends Action {
	final String txt;

	public TypeSymbolAction(final String text) {
		super();
		txt = text;
	}

	@Override
	public String toString() {
		return "TypeSymbolAction{" + "txt='" + txt + '\'' + '}';
	}

	@Override
	public TypeSymbolAction duplicate() {
		return new TypeSymbolAction(txt);
	}

	public String getTxt() {
		return txt.replaceAll("<%%%>", codeExample);
	}
}
