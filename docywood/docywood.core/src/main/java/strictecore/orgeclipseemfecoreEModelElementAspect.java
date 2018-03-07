package strictecore;


import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;

@SuppressWarnings("all")
public abstract class orgeclipseemfecoreEModelElementAspect extends __SlicerAspect__ {

  public static void feedOpposites(final EModelElement _self) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EClass){
    					strictecore.orgeclipseemfecoreEClassAspect.feedOpposites((org.eclipse.emf.ecore.EClass)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect.feedOpposites((org.eclipse.emf.ecore.EEnum)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EPackage){
    					strictecore.orgeclipseemfecoreEPackageAspect.feedOpposites((org.eclipse.emf.ecore.EPackage)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    					strictecore.orgeclipseemfecoreEAnnotationAspect.feedOpposites((org.eclipse.emf.ecore.EAnnotation)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    					strictecore.orgeclipseemfecoreETypeParameterAspect.feedOpposites((org.eclipse.emf.ecore.ETypeParameter)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EOperation){
    					strictecore.orgeclipseemfecoreEOperationAspect.feedOpposites((org.eclipse.emf.ecore.EOperation)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect.feedOpposites((org.eclipse.emf.ecore.EClassifier)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    					strictecore.orgeclipseemfecoreETypedElementAspect.feedOpposites((org.eclipse.emf.ecore.ETypedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites(_self_, (org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.feedOpposites((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void reinit(final EModelElement _self) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EParameter){
    					strictecore.orgeclipseemfecoreEParameterAspect.reinit((org.eclipse.emf.ecore.EParameter)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    					strictecore.orgeclipseemfecoreEClassAspect.reinit((org.eclipse.emf.ecore.EClass)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect.reinit((org.eclipse.emf.ecore.EEnum)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EPackage){
    					strictecore.orgeclipseemfecoreEPackageAspect.reinit((org.eclipse.emf.ecore.EPackage)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    					strictecore.orgeclipseemfecoreEAttributeAspect.reinit((org.eclipse.emf.ecore.EAttribute)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EReference){
    					strictecore.orgeclipseemfecoreEReferenceAspect.reinit((org.eclipse.emf.ecore.EReference)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    					strictecore.orgeclipseemfecoreEAnnotationAspect.reinit((org.eclipse.emf.ecore.EAnnotation)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    					strictecore.orgeclipseemfecoreETypeParameterAspect.reinit((org.eclipse.emf.ecore.ETypeParameter)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    					strictecore.orgeclipseemfecoreEEnumLiteralAspect.reinit((org.eclipse.emf.ecore.EEnumLiteral)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    					strictecore.orgeclipseemfecoreEStructuralFeatureAspect.reinit((org.eclipse.emf.ecore.EStructuralFeature)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EOperation){
    					strictecore.orgeclipseemfecoreEOperationAspect.reinit((org.eclipse.emf.ecore.EOperation)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect.reinit((org.eclipse.emf.ecore.EDataType)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect.reinit((org.eclipse.emf.ecore.EClassifier)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    					strictecore.orgeclipseemfecoreETypedElementAspect.reinit((org.eclipse.emf.ecore.ETypedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect.reinit((org.eclipse.emf.ecore.ENamedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.reinit((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddClasses(final EModelElement _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EParameter){
    					strictecore.orgeclipseemfecoreEParameterAspect._visitToAddClasses((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    					strictecore.orgeclipseemfecoreEClassAspect._visitToAddClasses((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect._visitToAddClasses((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EPackage){
    					strictecore.orgeclipseemfecoreEPackageAspect._visitToAddClasses((org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    					strictecore.orgeclipseemfecoreEAttributeAspect._visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EReference){
    					strictecore.orgeclipseemfecoreEReferenceAspect._visitToAddClasses((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    					strictecore.orgeclipseemfecoreEAnnotationAspect._visitToAddClasses((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    					strictecore.orgeclipseemfecoreETypeParameterAspect._visitToAddClasses((org.eclipse.emf.ecore.ETypeParameter)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    					strictecore.orgeclipseemfecoreEEnumLiteralAspect._visitToAddClasses((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    					strictecore.orgeclipseemfecoreEStructuralFeatureAspect._visitToAddClasses((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EOperation){
    					strictecore.orgeclipseemfecoreEOperationAspect._visitToAddClasses((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect._visitToAddClasses((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect._visitToAddClasses((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    					strictecore.orgeclipseemfecoreETypedElementAspect._visitToAddClasses((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddClasses((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddRelations(final EModelElement _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EParameter){
    					strictecore.orgeclipseemfecoreEParameterAspect._visitToAddRelations((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    					strictecore.orgeclipseemfecoreEClassAspect._visitToAddRelations((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect._visitToAddRelations((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EPackage){
    					strictecore.orgeclipseemfecoreEPackageAspect._visitToAddRelations((org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    					strictecore.orgeclipseemfecoreEAttributeAspect._visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EReference){
    					strictecore.orgeclipseemfecoreEReferenceAspect._visitToAddRelations((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    					strictecore.orgeclipseemfecoreEAnnotationAspect._visitToAddRelations((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    					strictecore.orgeclipseemfecoreETypeParameterAspect._visitToAddRelations((org.eclipse.emf.ecore.ETypeParameter)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    					strictecore.orgeclipseemfecoreEEnumLiteralAspect._visitToAddRelations((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    					strictecore.orgeclipseemfecoreEStructuralFeatureAspect._visitToAddRelations((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EOperation){
    					strictecore.orgeclipseemfecoreEOperationAspect._visitToAddRelations((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect._visitToAddRelations((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect._visitToAddRelations((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    					strictecore.orgeclipseemfecoreETypedElementAspect._visitToAddRelations((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddRelations((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_feedOpposites(final EModelElement _self) {
    final strictecore.__SlicerAspect__ObjectAspectProperties _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
     strictecore.__SlicerAspect__._privk3_feedOpposites(_self_, _self);
  }
  
  protected static void _privk3_feedOpposites(final orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_, final EModelElement _self) {
    orgeclipseemfecoreEModelElementAspect.super_feedOpposites(_self);
    EList<EAnnotation> _eAnnotations = _self.getEAnnotations();
    final Consumer<EAnnotation> _function = new Consumer<EAnnotation>() {
      @Override
      public void accept(final EAnnotation it) {
        orgeclipseemfecoreEAnnotationAspect.feedOpposites(it);
      }
    };
    _eAnnotations.forEach(_function);
  }
  
  private static void super_reinit(final EModelElement _self) {
    final strictecore.__SlicerAspect__ObjectAspectProperties _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
     strictecore.__SlicerAspect__._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_, final EModelElement _self) {
    orgeclipseemfecoreEModelElementAspect.super_reinit(_self);
    EList<EAnnotation> _eAnnotations = _self.getEAnnotations();
    final Consumer<EAnnotation> _function = new Consumer<EAnnotation>() {
      @Override
      public void accept(final EAnnotation it) {
        orgeclipseemfecoreEAnnotationAspect.reinit(it);
      }
    };
    _eAnnotations.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final EModelElement _self, final StrictEcore theSlicer) {
    final strictecore.__SlicerAspect__ObjectAspectProperties _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
     strictecore.__SlicerAspect__._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_, final EModelElement _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEModelElementAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EModelElement _self, final StrictEcore theSlicer) {
    final strictecore.__SlicerAspect__ObjectAspectProperties _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
     strictecore.__SlicerAspect__._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_, final EModelElement _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEModelElementAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
