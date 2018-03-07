package strictecore;

import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;

@SuppressWarnings("all")
public class orgeclipseemfecoreEAnnotationAspect extends orgeclipseemfecoreEModelElementAspect {
  public static void feedOpposites(final EAnnotation _self) {
    final strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties _self_ = strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    					strictecore.orgeclipseemfecoreEAnnotationAspect._privk3_feedOpposites(_self_, (org.eclipse.emf.ecore.EAnnotation)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.feedOpposites((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void reinit(final EAnnotation _self) {
    final strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties _self_ = strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    					strictecore.orgeclipseemfecoreEAnnotationAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EAnnotation)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.reinit((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.reinit((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void _visitToAddClasses(final EAnnotation _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties _self_ = strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    					strictecore.orgeclipseemfecoreEAnnotationAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddClasses((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void _visitToAddRelations(final EAnnotation _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties _self_ = strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    					strictecore.orgeclipseemfecoreEAnnotationAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddRelations((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_feedOpposites(final EAnnotation _self) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites(_self_, _self);
  }
  
  protected static void _privk3_feedOpposites(final orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties _self_, final EAnnotation _self) {
    orgeclipseemfecoreEAnnotationAspect.super_feedOpposites(_self);
    EMap<String, String> _details = _self.getDetails();
    final Consumer<Map.Entry<String, String>> _function = new Consumer<Map.Entry<String, String>>() {
      @Override
      public void accept(final Map.Entry<String, String> it) {
        __SlicerAspect__.feedOpposites(it);
      }
    };
    _details.forEach(_function);
    EList<EObject> _contents = _self.getContents();
    final Consumer<EObject> _function_1 = new Consumer<EObject>() {
      @Override
      public void accept(final EObject it) {
        __SlicerAspect__.feedOpposites(it);
      }
    };
    _contents.forEach(_function_1);
  }
  
  private static void super_reinit(final EAnnotation _self) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties _self_, final EAnnotation _self) {
    orgeclipseemfecoreEAnnotationAspect.super_reinit(_self);
    EMap<String, String> _details = _self.getDetails();
    final Consumer<Map.Entry<String, String>> _function = new Consumer<Map.Entry<String, String>>() {
      @Override
      public void accept(final Map.Entry<String, String> it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _details.forEach(_function);
    EList<EObject> _contents = _self.getContents();
    final Consumer<EObject> _function_1 = new Consumer<EObject>() {
      @Override
      public void accept(final EObject it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _contents.forEach(_function_1);
  }
  
  private static void super__visitToAddClasses(final EAnnotation _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties _self_, final EAnnotation _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EAnnotation _createEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
		theSlicer.sliceToOriginal.put(_createEAnnotation, _self);
      __SlicerAspect__.clonedElt(_self, _createEAnnotation);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEAnnotationAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EAnnotation _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties _self_, final EAnnotation _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEAnnotationAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
