package strictecore;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

@SuppressWarnings("all")
public abstract class orgeclipseemfecoreEClassifierAspect extends orgeclipseemfecoreENamedElementAspect {
  public static void feedOpposites(final EClassifier _self) {
    final strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EClass){
    					strictecore.orgeclipseemfecoreEClassAspect.feedOpposites((org.eclipse.emf.ecore.EClass)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect.feedOpposites((org.eclipse.emf.ecore.EEnum)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect._privk3_feedOpposites(_self_, (org.eclipse.emf.ecore.EClassifier)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.feedOpposites((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void reinit(final EClassifier _self) {
    final strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EClass){
    					strictecore.orgeclipseemfecoreEClassAspect.reinit((org.eclipse.emf.ecore.EClass)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect.reinit((org.eclipse.emf.ecore.EEnum)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect.reinit((org.eclipse.emf.ecore.EDataType)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EClassifier)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect.reinit((org.eclipse.emf.ecore.ENamedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.reinit((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.reinit((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void _visitToAddClasses(final EClassifier _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EClass){
    					strictecore.orgeclipseemfecoreEClassAspect._visitToAddClasses((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect._visitToAddClasses((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect._visitToAddClasses((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddClasses((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void _visitToAddRelations(final EClassifier _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EClass){
    					strictecore.orgeclipseemfecoreEClassAspect._visitToAddRelations((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EEnum){
    					strictecore.orgeclipseemfecoreEEnumAspect._visitToAddRelations((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    					strictecore.orgeclipseemfecoreEDataTypeAspect._visitToAddRelations((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    					strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddRelations((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_feedOpposites(final EClassifier _self) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites(_self_, _self);
  }
  
  protected static void _privk3_feedOpposites(final orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_, final EClassifier _self) {
    orgeclipseemfecoreEClassifierAspect.super_feedOpposites(_self);
    EList<ETypeParameter> _eTypeParameters = _self.getETypeParameters();
    final Consumer<ETypeParameter> _function = new Consumer<ETypeParameter>() {
      @Override
      public void accept(final ETypeParameter it) {
        orgeclipseemfecoreETypeParameterAspect.feedOpposites(it);
      }
    };
    _eTypeParameters.forEach(_function);
  }
  
  private static void super_reinit(final EClassifier _self) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_, final EClassifier _self) {
    orgeclipseemfecoreEClassifierAspect.super_reinit(_self);
    EList<ETypeParameter> _eTypeParameters = _self.getETypeParameters();
    final Consumer<ETypeParameter> _function = new Consumer<ETypeParameter>() {
      @Override
      public void accept(final ETypeParameter it) {
        orgeclipseemfecoreETypeParameterAspect.reinit(it);
      }
    };
    _eTypeParameters.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final EClassifier _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_, final EClassifier _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEClassifierAspect.super__visitToAddClasses(_self, theSlicer);
    EPackage _ePackage = _self.getEPackage();
    if (_ePackage!=null) {
      __SlicerAspect__.visitToAddClasses(_ePackage, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final EClassifier _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_, final EClassifier _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEClassifierAspect.super__visitToAddRelations(_self, theSlicer);
    EPackage _ePackage = _self.getEPackage();
    boolean _tripleNotEquals = (_ePackage != null);
    if (_tripleNotEquals) {
      EPackage _ePackage_1 = _self.getEPackage();
      __SlicerAspect__.visitToAddRelations(_ePackage_1, theSlicer);
      if ((__SlicerAspect__.sliced(_self) && __SlicerAspect__.sliced(_self.getEPackage()))) {
        EPackage _ePackage_2 = _self.getEPackage();
        EObject _clonedElt = __SlicerAspect__.clonedElt(_ePackage_2);
        EList<EClassifier> _eClassifiers = ((EPackage) _clonedElt).getEClassifiers();
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        _eClassifiers.add(((EClassifier) _clonedElt_1));
      }
    }
    boolean _sliced = __SlicerAspect__.sliced(_self);
    if (_sliced) {
      EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_self);
      String _instanceTypeName = _self.getInstanceTypeName();
      ((EClassifier) _clonedElt_2).setInstanceTypeName(_instanceTypeName);
    }
    boolean _sliced_1 = __SlicerAspect__.sliced(_self);
    if (_sliced_1) {
      EObject _clonedElt_3 = __SlicerAspect__.clonedElt(_self);
      String _instanceClassName = _self.getInstanceClassName();
      ((EClassifier) _clonedElt_3).setInstanceClassName(_instanceClassName);
    }
  }
}
