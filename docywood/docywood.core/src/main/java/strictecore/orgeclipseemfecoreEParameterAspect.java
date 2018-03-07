package strictecore;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcoreFactory;

@SuppressWarnings("all")
public class orgeclipseemfecoreEParameterAspect extends orgeclipseemfecoreETypedElementAspect {

  public static void reinit(final EParameter _self) {
    final strictecore.orgeclipseemfecoreEParameterAspectEParameterAspectProperties _self_ = strictecore.orgeclipseemfecoreEParameterAspectEParameterAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EParameter){
    					strictecore.orgeclipseemfecoreEParameterAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EParameter)_self);
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
  

  public static void _visitToAddClasses(final EParameter _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEParameterAspectEParameterAspectProperties _self_ = strictecore.orgeclipseemfecoreEParameterAspectEParameterAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EParameter){
    					strictecore.orgeclipseemfecoreEParameterAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EParameter)_self,theSlicer);
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
  

  public static void _visitToAddRelations(final EParameter _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEParameterAspectEParameterAspectProperties _self_ = strictecore.orgeclipseemfecoreEParameterAspectEParameterAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EParameter){
    					strictecore.orgeclipseemfecoreEParameterAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EParameter)_self,theSlicer);
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
  
  private static void super_reinit(final EParameter _self) {
    final strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEParameterAspectEParameterAspectProperties _self_, final EParameter _self) {
    orgeclipseemfecoreEParameterAspect.super_reinit(_self);
  }
  
  private static void super__visitToAddClasses(final EParameter _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEParameterAspectEParameterAspectProperties _self_, final EParameter _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EParameter _createEParameter = EcoreFactory.eINSTANCE.createEParameter();
		theSlicer.sliceToOriginal.put(_createEParameter, _self);
      __SlicerAspect__.clonedElt(_self, _createEParameter);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEParameterAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EParameter _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEParameterAspectEParameterAspectProperties _self_, final EParameter _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEParameterAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
