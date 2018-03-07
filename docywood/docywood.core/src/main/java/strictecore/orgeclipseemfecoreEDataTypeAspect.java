package strictecore;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;

@SuppressWarnings("all")
public class orgeclipseemfecoreEDataTypeAspect extends orgeclipseemfecoreEClassifierAspect {
  public static void reinit(final EDataType _self) {
    final strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties _self_ = strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect.reinit((org.eclipse.emf.ecore.EEnum)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EDataType)_self);
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
  
  public static void _visitToAddClasses(final EDataType _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties _self_ = strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect._visitToAddClasses((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EDataType)_self,theSlicer);
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
  
  public static void _visitToAddRelations(final EDataType _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties _self_ = strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect._visitToAddRelations((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EDataType)_self,theSlicer);
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
  
  private static void super_reinit(final EDataType _self) {
    final strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties _self_, final EDataType _self) {
    orgeclipseemfecoreEDataTypeAspect.super_reinit(_self);
  }
  
  private static void super__visitToAddClasses(final EDataType _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties _self_, final EDataType _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EDataType _createEDataType = EcoreFactory.eINSTANCE.createEDataType();
		theSlicer.sliceToOriginal.put(_createEDataType, _self);
      __SlicerAspect__.clonedElt(_self, _createEDataType);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEDataTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EDataType _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties _self_, final EDataType _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEDataTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
