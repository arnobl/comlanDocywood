package strictecore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

public class StrictEcore {
	public final boolean optionlowerTypes;
	public final boolean card1;
	public final Map<EModelElement, EModelElement> sliceToOriginal;
	protected final Collection<EModelElement> inputEModelElement;
	protected final List<EObject> clonedElts = new ArrayList<>();
	protected final EObject _root;
	protected Set<EPackage> output;

	public StrictEcore(final Collection<EModelElement> inputEModelElement, final EObject metamodelRoot, final boolean optionlowerTypes, final boolean card1) {
		super();

		if(metamodelRoot == null) {
			throw new IllegalArgumentException();
		}

		this.inputEModelElement = inputEModelElement;
		this._root = metamodelRoot;
		this.optionlowerTypes = optionlowerTypes;
		this.card1 = card1;
		sliceToOriginal = new HashMap<>();
	}

	public void slice() {
		orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.INSTANCE.getMap().clear();
		__SlicerAspect__ObjectAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEAttributeAspectEAttributeAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEClassAspectEClassAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEEnumAspectEEnumAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEOperationAspectEOperationAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEPackageAspectEPackageAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEParameterAspectEParameterAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEReferenceAspectEReferenceAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.INSTANCE.getMap().clear();
		orgeclipseemfecoreETypeParameterAspectETypeParameterAspectContext.INSTANCE.getMap().clear();

//		__SlicerAspect__.feedOpposites(this._root);
		((EPackage)_root.eContainer()).getEClassifiers().forEach(classif -> __SlicerAspect__.feedOpposites(classif));

		if(this.inputEModelElement != null) {
			this.inputEModelElement.forEach(it -> __SlicerAspect__.visitToAddClasses(it, StrictEcore.this));
		}
		if(this.inputEModelElement != null) {
			this.inputEModelElement.forEach(it -> __SlicerAspect__.visitToAddRelations(it, StrictEcore.this));
		}
		onEnd();
	}

	public void objectCloned(final EObject object) {
		this.clonedElts.add(object);
	}

	public void onEnd() {
		output = clonedElts.parallelStream().filter(elt -> elt.eContainer() == null && elt instanceof EPackage && !((EPackage) elt).getName().equals("ecore")).
			map(o -> (EPackage) o).collect(Collectors.toSet());
	}

	public void reinit() {
		__SlicerAspect__.reinit(this._root);
	}

	public Set<EPackage> getOutput() {
		return output;
	}
}
