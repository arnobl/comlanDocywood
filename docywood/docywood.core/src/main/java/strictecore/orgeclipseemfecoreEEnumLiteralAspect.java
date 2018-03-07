package strictecore;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;

@SuppressWarnings("all")
public class orgeclipseemfecoreEEnumLiteralAspect extends orgeclipseemfecoreENamedElementAspect {

  public static void reinit(final EEnumLiteral _self) {
    final strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties _self_ = strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    					strictecore.orgeclipseemfecoreEEnumLiteralAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EEnumLiteral)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect.reinit((org.eclipse.emf.ecore.ENamedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.reinit((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.reinit((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddClasses(final EEnumLiteral _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties _self_ = strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    					strictecore.orgeclipseemfecoreEEnumLiteralAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddClasses((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddRelations(final EEnumLiteral _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties _self_ = strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    					strictecore.orgeclipseemfecoreEEnumLiteralAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddRelations((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_reinit(final EEnumLiteral _self) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties _self_, final EEnumLiteral _self) {
    orgeclipseemfecoreEEnumLiteralAspect.super_reinit(_self);
  }
  
  private static void super__visitToAddClasses(final EEnumLiteral _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties _self_, final EEnumLiteral _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EEnumLiteral _createEEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
		theSlicer.sliceToOriginal.put(_createEEnumLiteral, _self);
      __SlicerAspect__.clonedElt(_self, _createEEnumLiteral);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEEnumLiteralAspect.super__visitToAddClasses(_self, theSlicer);
    EEnum _eEnum = _self.getEEnum();
    if (_eEnum!=null) {
      __SlicerAspect__.visitToAddClasses(_eEnum, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final EEnumLiteral _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties _self_, final EEnumLiteral _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEEnumLiteralAspect.super__visitToAddRelations(_self, theSlicer);
    EEnum _eEnum = _self.getEEnum();
    boolean _tripleNotEquals = (_eEnum != null);
    if (_tripleNotEquals) {
      EEnum _eEnum_1 = _self.getEEnum();
      __SlicerAspect__.visitToAddRelations(_eEnum_1, theSlicer);
      if ((__SlicerAspect__.sliced(_self) && __SlicerAspect__.sliced(_self.getEEnum()))) {
        EEnum _eEnum_2 = _self.getEEnum();
        EObject _clonedElt = __SlicerAspect__.clonedElt(_eEnum_2);
        EList<EEnumLiteral> _eLiterals = ((EEnum) _clonedElt).getELiterals();
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        _eLiterals.add(((EEnumLiteral) _clonedElt_1));
      }
    }
    boolean _sliced = __SlicerAspect__.sliced(_self);
    if (_sliced) {
      EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_self);
      int _value = _self.getValue();
      ((EEnumLiteral) _clonedElt_2).setValue(_value);
    }
  }
}
