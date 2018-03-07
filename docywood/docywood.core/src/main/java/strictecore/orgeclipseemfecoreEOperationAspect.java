package strictecore;


import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;

@SuppressWarnings("all")
public class orgeclipseemfecoreEOperationAspect extends orgeclipseemfecoreETypedElementAspect {

  public static void feedOpposites(final EOperation _self) {
    final strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectProperties _self_ = strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EOperation){
    					strictecore.orgeclipseemfecoreEOperationAspect._privk3_feedOpposites(_self_, (org.eclipse.emf.ecore.EOperation)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    					strictecore.orgeclipseemfecoreETypedElementAspect.feedOpposites((org.eclipse.emf.ecore.ETypedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.feedOpposites((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void reinit(final EOperation _self) {
    final strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectProperties _self_ = strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EOperation){
    					strictecore.orgeclipseemfecoreEOperationAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EOperation)_self);
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
  

  public static void _visitToAddClasses(final EOperation _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectProperties _self_ = strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EOperation){
    					strictecore.orgeclipseemfecoreEOperationAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EOperation)_self,theSlicer);
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
  

  public static void _visitToAddRelations(final EOperation _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectProperties _self_ = strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EOperation){
    					strictecore.orgeclipseemfecoreEOperationAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EOperation)_self,theSlicer);
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
  
  private static void super_feedOpposites(final EOperation _self) {
    final strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3_feedOpposites(_self_, _self);
  }
  
  protected static void _privk3_feedOpposites(final orgeclipseemfecoreEOperationAspectEOperationAspectProperties _self_, final EOperation _self) {
    orgeclipseemfecoreEOperationAspect.super_feedOpposites(_self);
    EList<ETypeParameter> _eTypeParameters = _self.getETypeParameters();
    final Consumer<ETypeParameter> _function = new Consumer<ETypeParameter>() {
      @Override
      public void accept(final ETypeParameter it) {
        orgeclipseemfecoreETypeParameterAspect.feedOpposites(it);
      }
    };
    _eTypeParameters.forEach(_function);
    EList<EParameter> _eParameters = _self.getEParameters();
    final Consumer<EParameter> _function_1 = new Consumer<EParameter>() {
      @Override
      public void accept(final EParameter it) {
        orgeclipseemfecoreETypedElementAspect.feedOpposites(it);
      }
    };
    _eParameters.forEach(_function_1);
    EList<EGenericType> _eGenericExceptions = _self.getEGenericExceptions();
    final Consumer<EGenericType> _function_2 = new Consumer<EGenericType>() {
      @Override
      public void accept(final EGenericType it) {
        __SlicerAspect__.feedOpposites(it);
      }
    };
    _eGenericExceptions.forEach(_function_2);
  }
  
  private static void super_reinit(final EOperation _self) {
    final strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEOperationAspectEOperationAspectProperties _self_, final EOperation _self) {
    orgeclipseemfecoreEOperationAspect.super_reinit(_self);
    EList<ETypeParameter> _eTypeParameters = _self.getETypeParameters();
    final Consumer<ETypeParameter> _function = new Consumer<ETypeParameter>() {
      @Override
      public void accept(final ETypeParameter it) {
        orgeclipseemfecoreETypeParameterAspect.reinit(it);
      }
    };
    _eTypeParameters.forEach(_function);
    EList<EParameter> _eParameters = _self.getEParameters();
    final Consumer<EParameter> _function_1 = new Consumer<EParameter>() {
      @Override
      public void accept(final EParameter it) {
        orgeclipseemfecoreEParameterAspect.reinit(it);
      }
    };
    _eParameters.forEach(_function_1);
    EList<EGenericType> _eGenericExceptions = _self.getEGenericExceptions();
    final Consumer<EGenericType> _function_2 = new Consumer<EGenericType>() {
      @Override
      public void accept(final EGenericType it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _eGenericExceptions.forEach(_function_2);
  }
  
  private static void super__visitToAddClasses(final EOperation _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEOperationAspectEOperationAspectProperties _self_, final EOperation _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EOperation _createEOperation = EcoreFactory.eINSTANCE.createEOperation();
		theSlicer.sliceToOriginal.put(_createEOperation, _self);
      __SlicerAspect__.clonedElt(_self, _createEOperation);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEOperationAspect.super__visitToAddClasses(_self, theSlicer);
    EList<EParameter> _eParameters = _self.getEParameters();
    final Consumer<EParameter> _function = new Consumer<EParameter>() {
      @Override
      public void accept(final EParameter it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _eParameters.forEach(_function);
    EClass _eContainingClass = _self.getEContainingClass();
    if (_eContainingClass!=null) {
      __SlicerAspect__.visitToAddClasses(_eContainingClass, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final EOperation _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEOperationAspectEOperationAspectProperties _self_, final EOperation _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEOperationAspect.super__visitToAddRelations(_self, theSlicer);
    EList<EParameter> _eParameters = _self.getEParameters();
    final Consumer<EParameter> _function = new Consumer<EParameter>() {
      @Override
      public void accept(final EParameter _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
        if (((__SlicerAspect__.sliced(_self) && __SlicerAspect__.sliced(_elt)) && (__SlicerAspect__.clonedElt(_elt) != null))) {
          EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
          EList<EParameter> _eParameters = ((EOperation) _clonedElt).getEParameters();
          EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_elt);
          _eParameters.add(((EParameter) _clonedElt_1));
        }
      }
    };
    _eParameters.forEach(_function);
    EClass _eContainingClass = _self.getEContainingClass();
    boolean _tripleNotEquals = (_eContainingClass != null);
    if (_tripleNotEquals) {
      EClass _eContainingClass_1 = _self.getEContainingClass();
      __SlicerAspect__.visitToAddRelations(_eContainingClass_1, theSlicer);
      if ((__SlicerAspect__.sliced(_self) && __SlicerAspect__.sliced(_self.getEContainingClass()))) {
        EClass _eContainingClass_2 = _self.getEContainingClass();
        EObject _clonedElt = __SlicerAspect__.clonedElt(_eContainingClass_2);
        EList<EOperation> _eOperations = ((EClass) _clonedElt).getEOperations();
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        _eOperations.add(((EOperation) _clonedElt_1));
      }
    }
  }
}
