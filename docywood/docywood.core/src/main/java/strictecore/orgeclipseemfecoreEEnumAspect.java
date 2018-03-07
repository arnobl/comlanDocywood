package strictecore;


import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;

@SuppressWarnings("all")
public class orgeclipseemfecoreEEnumAspect extends orgeclipseemfecoreEDataTypeAspect {

  public static void feedOpposites(final EEnum _self) {
    final strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectProperties _self_ = strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect._privk3_feedOpposites(_self_, (org.eclipse.emf.ecore.EEnum)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect.feedOpposites((org.eclipse.emf.ecore.EClassifier)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.feedOpposites((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void reinit(final EEnum _self) {
    final strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectProperties _self_ = strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EEnum)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect.reinit((org.eclipse.emf.ecore.EDataType)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect.reinit((org.eclipse.emf.ecore.EClassifier)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect.reinit((org.eclipse.emf.ecore.ENamedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.reinit((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.reinit((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddClasses(final EEnum _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectProperties _self_ = strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect._visitToAddClasses((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect._visitToAddClasses((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddClasses((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddRelations(final EEnum _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectProperties _self_ = strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect._visitToAddRelations((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect._visitToAddRelations((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddRelations((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_feedOpposites(final EEnum _self) {
    final strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3_feedOpposites(_self_, _self);
  }
  
  protected static void _privk3_feedOpposites(final orgeclipseemfecoreEEnumAspectEEnumAspectProperties _self_, final EEnum _self) {
    orgeclipseemfecoreEEnumAspect.super_feedOpposites(_self);
    EList<EEnumLiteral> _eLiterals = _self.getELiterals();
    final Consumer<EEnumLiteral> _function = new Consumer<EEnumLiteral>() {
      @Override
      public void accept(final EEnumLiteral it) {
        orgeclipseemfecoreEModelElementAspect.feedOpposites(it);
      }
    };
    _eLiterals.forEach(_function);
  }
  
  private static void super_reinit(final EEnum _self) {
    final strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties _self_ = strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEDataTypeAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEEnumAspectEEnumAspectProperties _self_, final EEnum _self) {
    orgeclipseemfecoreEEnumAspect.super_reinit(_self);
    EList<EEnumLiteral> _eLiterals = _self.getELiterals();
    final Consumer<EEnumLiteral> _function = new Consumer<EEnumLiteral>() {
      @Override
      public void accept(final EEnumLiteral it) {
        orgeclipseemfecoreEEnumLiteralAspect.reinit(it);
      }
    };
    _eLiterals.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final EEnum _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties _self_ = strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEDataTypeAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEEnumAspectEEnumAspectProperties _self_, final EEnum _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EEnum _createEEnum = EcoreFactory.eINSTANCE.createEEnum();
		theSlicer.sliceToOriginal.put(_createEEnum, _self);
      __SlicerAspect__.clonedElt(_self, _createEEnum);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEEnumAspect.super__visitToAddClasses(_self, theSlicer);
    EList<EEnumLiteral> _eLiterals = _self.getELiterals();
    final Consumer<EEnumLiteral> _function = new Consumer<EEnumLiteral>() {
      @Override
      public void accept(final EEnumLiteral it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _eLiterals.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final EEnum _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties _self_ = strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEDataTypeAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEEnumAspectEEnumAspectProperties _self_, final EEnum _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEEnumAspect.super__visitToAddRelations(_self, theSlicer);
    EList<EEnumLiteral> _eLiterals = _self.getELiterals();
    final Consumer<EEnumLiteral> _function = new Consumer<EEnumLiteral>() {
      @Override
      public void accept(final EEnumLiteral _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
        if (((__SlicerAspect__.sliced(_self) && __SlicerAspect__.sliced(_elt)) && (__SlicerAspect__.clonedElt(_elt) != null))) {
          EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
          EList<EEnumLiteral> _eLiterals = ((EEnum) _clonedElt).getELiterals();
          EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_elt);
          _eLiterals.add(((EEnumLiteral) _clonedElt_1));
        }
      }
    };
    _eLiterals.forEach(_function);
  }
}
