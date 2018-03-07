package docywood.scenario;

import docywood.Docywood;
import java.util.Optional;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;

public abstract class ConceptElementAction<T extends EModelElement> extends CompositeAction {
	protected final T elt;

	ConceptElementAction(final T element) {
		super();
		elt = element;
	}

	public T getElt() {
		return elt;
	}

	@Override
	public abstract ConceptElementAction<T> duplicate();

	@Override
	public Optional<Action> findActionWith(final ENamedElement namedElt) {
		if(elt == namedElt || elt instanceof ENamedElement && Docywood.getQName((ENamedElement) elt).equals(Docywood.getQName(namedElt)))
			return Optional.of(this);

		return super.findActionWith(namedElt);
	}
}
