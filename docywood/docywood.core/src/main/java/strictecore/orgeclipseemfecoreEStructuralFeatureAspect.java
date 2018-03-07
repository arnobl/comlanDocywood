package strictecore;


import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

@SuppressWarnings("all")
public abstract class orgeclipseemfecoreEStructuralFeatureAspect extends orgeclipseemfecoreETypedElementAspect {

  public static void reinit(final EStructuralFeature _self) {
    final strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_ = strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    					strictecore.orgeclipseemfecoreEAttributeAspect.reinit((org.eclipse.emf.ecore.EAttribute)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EReference){
    					strictecore.orgeclipseemfecoreEReferenceAspect.reinit((org.eclipse.emf.ecore.EReference)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    					strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EStructuralFeature)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    					strictecore.orgeclipseemfecoreETypedElementAspect.reinit((org.eclipse.emf.ecore.ETypedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect.reinit((org.eclipse.emf.ecore.ENamedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.reinit((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.reinit((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddClasses(final EStructuralFeature _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_ = strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    					strictecore.orgeclipseemfecoreEAttributeAspect._visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EReference){
    					strictecore.orgeclipseemfecoreEReferenceAspect._visitToAddClasses((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    					strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    					strictecore.orgeclipseemfecoreETypedElementAspect._visitToAddClasses((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddClasses((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddRelations(final EStructuralFeature _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_ = strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    					strictecore.orgeclipseemfecoreEAttributeAspect._visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EReference){
    					strictecore.orgeclipseemfecoreEReferenceAspect._visitToAddRelations((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    					strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    					strictecore.orgeclipseemfecoreETypedElementAspect._visitToAddRelations((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddRelations((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static boolean checkcard1(final EStructuralFeature _self) {
    final strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_ = strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_checkcard1(_self_, _self);;
    return (boolean)result;
  }
  
  private static void super_reinit(final EStructuralFeature _self) {
    final strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_, final EStructuralFeature _self) {
    orgeclipseemfecoreEStructuralFeatureAspect.super_reinit(_self);
  }
  
  private static void super__visitToAddClasses(final EStructuralFeature _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_, final EStructuralFeature _self, final StrictEcore theSlicer) {
    if (((!theSlicer.card1) || orgeclipseemfecoreEStructuralFeatureAspect.checkcard1(_self)) || theSlicer.inputEModelElement.contains(_self)) {
      orgeclipseemfecoreEStructuralFeatureAspect.super__visitToAddClasses(_self, theSlicer);
      EClass _eContainingClass = _self.getEContainingClass();
      if (_eContainingClass!=null) {
        __SlicerAspect__.visitToAddClasses(_eContainingClass, theSlicer);
      }
    }
  }
  
  private static void super__visitToAddRelations(final EStructuralFeature _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_, final EStructuralFeature _self, final StrictEcore theSlicer) {
    if (((!theSlicer.card1) || orgeclipseemfecoreEStructuralFeatureAspect.checkcard1(_self)) || theSlicer.inputEModelElement.contains(_self)) {
      orgeclipseemfecoreEStructuralFeatureAspect.super__visitToAddRelations(_self, theSlicer);
      EClass _eContainingClass = _self.getEContainingClass();
      boolean _tripleNotEquals = (_eContainingClass != null);
      if (_tripleNotEquals) {
        EClass _eContainingClass_1 = _self.getEContainingClass();
        __SlicerAspect__.visitToAddRelations(_eContainingClass_1, theSlicer);
        if ((__SlicerAspect__.sliced(_self) && __SlicerAspect__.sliced(_self.getEContainingClass()))) {
          EClass _eContainingClass_2 = _self.getEContainingClass();
          EObject _clonedElt = __SlicerAspect__.clonedElt(_eContainingClass_2);
          EList<EStructuralFeature> _eStructuralFeatures = ((EClass) _clonedElt).getEStructuralFeatures();
          EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
          _eStructuralFeatures.add(((EStructuralFeature) _clonedElt_1));
        }
      }
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (_sliced) {
        EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_self);
        boolean _isChangeable = _self.isChangeable();
        ((EStructuralFeature) _clonedElt_2).setChangeable(_isChangeable);
      }
      boolean _sliced_1 = __SlicerAspect__.sliced(_self);
      if (_sliced_1) {
        EObject _clonedElt_3 = __SlicerAspect__.clonedElt(_self);
        String _defaultValueLiteral = _self.getDefaultValueLiteral();
        ((EStructuralFeature) _clonedElt_3).setDefaultValueLiteral(_defaultValueLiteral);
      }
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (_sliced_2) {
        EObject _clonedElt_4 = __SlicerAspect__.clonedElt(_self);
        boolean _isDerived = _self.isDerived();
        ((EStructuralFeature) _clonedElt_4).setDerived(_isDerived);
      }
      boolean _sliced_3 = __SlicerAspect__.sliced(_self);
      if (_sliced_3) {
        EObject _clonedElt_5 = __SlicerAspect__.clonedElt(_self);
        boolean _isTransient = _self.isTransient();
        ((EStructuralFeature) _clonedElt_5).setTransient(_isTransient);
      }
      boolean _sliced_4 = __SlicerAspect__.sliced(_self);
      if (_sliced_4) {
        EObject _clonedElt_6 = __SlicerAspect__.clonedElt(_self);
        boolean _isUnsettable = _self.isUnsettable();
        ((EStructuralFeature) _clonedElt_6).setUnsettable(_isUnsettable);
      }
      boolean _sliced_5 = __SlicerAspect__.sliced(_self);
      if (_sliced_5) {
        EObject _clonedElt_7 = __SlicerAspect__.clonedElt(_self);
        boolean _isVolatile = _self.isVolatile();
        ((EStructuralFeature) _clonedElt_7).setVolatile(_isVolatile);
      }
    }
  }
  
  protected static boolean _privk3_checkcard1(final orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_, final EStructuralFeature _self) {
    boolean _xblockexpression = false;
    {
      final EStructuralFeature feat = _self;
      int _lowerBound = feat.getLowerBound();
      _xblockexpression = (_lowerBound > 0);
    }
    return _xblockexpression;
  }
}
