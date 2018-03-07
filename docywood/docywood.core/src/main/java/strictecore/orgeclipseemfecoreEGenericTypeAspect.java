package strictecore;


import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EGenericType;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEGenericTypeAspect extends __SlicerAspect__ {

  public static void feedOpposites(final EGenericType _self) {
    final strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties _self_ = strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    					strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3_feedOpposites(_self_, (org.eclipse.emf.ecore.EGenericType)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.feedOpposites((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void reinit(final EGenericType _self) {
    final strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties _self_ = strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    					strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EGenericType)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.reinit((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddClasses(final EGenericType _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties _self_ = strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    					strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EGenericType)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddClasses((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddRelations(final EGenericType _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties _self_ = strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    					strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EGenericType)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddRelations((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_feedOpposites(final EGenericType _self) {
    final strictecore.__SlicerAspect__ObjectAspectProperties _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
     strictecore.__SlicerAspect__._privk3_feedOpposites(_self_, _self);
  }
  
  protected static void _privk3_feedOpposites(final orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties _self_, final EGenericType _self) {
    orgeclipseemfecoreEGenericTypeAspect.super_feedOpposites(_self);
    EGenericType _eUpperBound = _self.getEUpperBound();
    if (_eUpperBound!=null) {
      orgeclipseemfecoreEGenericTypeAspect.feedOpposites(_eUpperBound);
    }
    EList<EGenericType> _eTypeArguments = _self.getETypeArguments();
    final Consumer<EGenericType> _function = new Consumer<EGenericType>() {
      @Override
      public void accept(final EGenericType it) {
        orgeclipseemfecoreEGenericTypeAspect.feedOpposites(it);
      }
    };
    _eTypeArguments.forEach(_function);
    EGenericType _eLowerBound = _self.getELowerBound();
    if (_eLowerBound!=null) {
      orgeclipseemfecoreEGenericTypeAspect.feedOpposites(_eLowerBound);
    }
  }
  
  private static void super_reinit(final EGenericType _self) {
    final strictecore.__SlicerAspect__ObjectAspectProperties _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
     strictecore.__SlicerAspect__._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties _self_, final EGenericType _self) {
    orgeclipseemfecoreEGenericTypeAspect.super_reinit(_self);
    EGenericType _eUpperBound = _self.getEUpperBound();
    if (_eUpperBound!=null) {
      orgeclipseemfecoreEGenericTypeAspect.reinit(_eUpperBound);
    }
    EList<EGenericType> _eTypeArguments = _self.getETypeArguments();
    final Consumer<EGenericType> _function = new Consumer<EGenericType>() {
      @Override
      public void accept(final EGenericType it) {
        orgeclipseemfecoreEGenericTypeAspect.reinit(it);
      }
    };
    _eTypeArguments.forEach(_function);
    EGenericType _eLowerBound = _self.getELowerBound();
    if (_eLowerBound!=null) {
      orgeclipseemfecoreEGenericTypeAspect.reinit(_eLowerBound);
    }
  }
  
  private static void super__visitToAddClasses(final EGenericType _self, final StrictEcore theSlicer) {
    final strictecore.__SlicerAspect__ObjectAspectProperties _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
     strictecore.__SlicerAspect__._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties _self_, final EGenericType _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEGenericTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EGenericType _self, final StrictEcore theSlicer) {
    final strictecore.__SlicerAspect__ObjectAspectProperties _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
     strictecore.__SlicerAspect__._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties _self_, final EGenericType _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEGenericTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
