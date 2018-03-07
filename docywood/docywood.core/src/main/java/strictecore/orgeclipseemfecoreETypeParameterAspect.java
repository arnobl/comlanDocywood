package strictecore;


import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EcoreFactory;

@SuppressWarnings("all")
public class orgeclipseemfecoreETypeParameterAspect extends orgeclipseemfecoreENamedElementAspect {

  public static void feedOpposites(final ETypeParameter _self) {
    final strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties _self_ = strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    					strictecore.orgeclipseemfecoreETypeParameterAspect._privk3_feedOpposites(_self_, (org.eclipse.emf.ecore.ETypeParameter)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.feedOpposites((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void reinit(final ETypeParameter _self) {
    final strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties _self_ = strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    					strictecore.orgeclipseemfecoreETypeParameterAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.ETypeParameter)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect.reinit((org.eclipse.emf.ecore.ENamedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.reinit((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.reinit((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddClasses(final ETypeParameter _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties _self_ = strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    					strictecore.orgeclipseemfecoreETypeParameterAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.ETypeParameter)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddClasses((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddRelations(final ETypeParameter _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties _self_ = strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    					strictecore.orgeclipseemfecoreETypeParameterAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.ETypeParameter)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddRelations((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_feedOpposites(final ETypeParameter _self) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites(_self_, _self);
  }
  
  protected static void _privk3_feedOpposites(final orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties _self_, final ETypeParameter _self) {
    orgeclipseemfecoreETypeParameterAspect.super_feedOpposites(_self);
    EList<EGenericType> _eBounds = _self.getEBounds();
    final Consumer<EGenericType> _function = new Consumer<EGenericType>() {
      @Override
      public void accept(final EGenericType it) {
        __SlicerAspect__.feedOpposites(it);
      }
    };
    _eBounds.forEach(_function);
  }
  
  private static void super_reinit(final ETypeParameter _self) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties _self_, final ETypeParameter _self) {
    orgeclipseemfecoreETypeParameterAspect.super_reinit(_self);
    EList<EGenericType> _eBounds = _self.getEBounds();
    final Consumer<EGenericType> _function = new Consumer<EGenericType>() {
      @Override
      public void accept(final EGenericType it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _eBounds.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final ETypeParameter _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties _self_, final ETypeParameter _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      ETypeParameter _createETypeParameter = EcoreFactory.eINSTANCE.createETypeParameter();
		theSlicer.sliceToOriginal.put(_createETypeParameter, _self);
      __SlicerAspect__.clonedElt(_self, _createETypeParameter);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreETypeParameterAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final ETypeParameter _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties _self_, final ETypeParameter _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreETypeParameterAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
