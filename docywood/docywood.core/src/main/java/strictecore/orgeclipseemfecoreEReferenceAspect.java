package strictecore;


import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;

@SuppressWarnings("all")
public class orgeclipseemfecoreEReferenceAspect extends orgeclipseemfecoreEStructuralFeatureAspect {

  public static void reinit(final EReference _self) {
    final strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties _self_ = strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EReference){
    					strictecore.orgeclipseemfecoreEReferenceAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EReference)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    					strictecore.orgeclipseemfecoreEStructuralFeatureAspect.reinit((org.eclipse.emf.ecore.EStructuralFeature)_self);
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
  

  public static void _visitToAddClasses(final EReference _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties _self_ = strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EReference){
    					strictecore.orgeclipseemfecoreEReferenceAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EReference)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    					strictecore.orgeclipseemfecoreEStructuralFeatureAspect._visitToAddClasses((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
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
  

  public static void _visitToAddRelations(final EReference _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties _self_ = strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EReference){
    					strictecore.orgeclipseemfecoreEReferenceAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EReference)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    					strictecore.orgeclipseemfecoreEStructuralFeatureAspect._visitToAddRelations((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
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
  
  private static void super_reinit(final EReference _self) {
    final strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_ = strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties _self_, final EReference _self) {
    orgeclipseemfecoreEReferenceAspect.super_reinit(_self);
  }
  
  private static void super__visitToAddClasses(final EReference _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_ = strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties _self_, final EReference _self, final StrictEcore theSlicer) {
    if (((!theSlicer.card1) || orgeclipseemfecoreEStructuralFeatureAspect.checkcard1(_self)) || theSlicer.inputEModelElement.contains(_self)) {
      EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
      boolean _tripleEquals = (_clonedElt == null);
      if (_tripleEquals) {
        EReference _createEReference = EcoreFactory.eINSTANCE.createEReference();
		  theSlicer.sliceToOriginal.put(_createEReference, _self);
        __SlicerAspect__.clonedElt(_self, _createEReference);
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        theSlicer.objectCloned(_clonedElt_1);
      }
      orgeclipseemfecoreEReferenceAspect.super__visitToAddClasses(_self, theSlicer);
      EClass _eReferenceType = _self.getEReferenceType();
      if (_eReferenceType!=null) {
        __SlicerAspect__.visitToAddClasses(_eReferenceType, theSlicer);
      }
    }
  }
  
  private static void super__visitToAddRelations(final EReference _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_ = strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties _self_, final EReference _self, final StrictEcore theSlicer) {
    if (((!theSlicer.card1) || orgeclipseemfecoreEStructuralFeatureAspect.checkcard1(_self)) || theSlicer.inputEModelElement.contains(_self)) {
      orgeclipseemfecoreEReferenceAspect.super__visitToAddRelations(_self, theSlicer);
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (_sliced) {
        EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
        boolean _isContainment = _self.isContainment();
        ((EReference) _clonedElt).setContainment(_isContainment);
      }
      boolean _sliced_1 = __SlicerAspect__.sliced(_self);
      if (_sliced_1) {
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        boolean _isResolveProxies = _self.isResolveProxies();
        ((EReference) _clonedElt_1).setResolveProxies(_isResolveProxies);
      }
      EClass _eReferenceType = _self.getEReferenceType();
      boolean _tripleNotEquals = (_eReferenceType != null);
      if (_tripleNotEquals) {
        EClass _eReferenceType_1 = _self.getEReferenceType();
        __SlicerAspect__.visitToAddRelations(_eReferenceType_1, theSlicer);
      }
    }
  }
}
