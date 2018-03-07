package strictecore;


import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;

@SuppressWarnings("all")
public class orgeclipseemfecoreEPackageAspect extends orgeclipseemfecoreENamedElementAspect {

  public static void feedOpposites(final EPackage _self) {
    final strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectProperties _self_ = strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EPackage){
    					strictecore.orgeclipseemfecoreEPackageAspect._privk3_feedOpposites(_self_, (org.eclipse.emf.ecore.EPackage)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.feedOpposites((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void reinit(final EPackage _self) {
    final strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectProperties _self_ = strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EPackage){
    					strictecore.orgeclipseemfecoreEPackageAspect._privk3_reinit(_self_, (org.eclipse.emf.ecore.EPackage)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect.reinit((org.eclipse.emf.ecore.ENamedElement)_self);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect.reinit((org.eclipse.emf.ecore.EModelElement)_self);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__.reinit((java.lang.Object)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddClasses(final EPackage _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectProperties _self_ = strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EPackage){
    					strictecore.orgeclipseemfecoreEPackageAspect._privk3__visitToAddClasses(_self_, (org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddClasses((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  

  public static void _visitToAddRelations(final EPackage _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectProperties _self_ = strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectContext.getSelf(_self);
     if (_self instanceof org.eclipse.emf.ecore.EPackage){
    					strictecore.orgeclipseemfecoreEPackageAspect._privk3__visitToAddRelations(_self_, (org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    					strictecore.orgeclipseemfecoreENamedElementAspect._visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    					strictecore.orgeclipseemfecoreEModelElementAspect._visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    } else  if (_self instanceof java.lang.Object){
    					strictecore.__SlicerAspect__._visitToAddRelations((java.lang.Object)_self,theSlicer);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_feedOpposites(final EPackage _self) {
    final strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites(_self_, _self);
  }
  
  protected static void _privk3_feedOpposites(final orgeclipseemfecoreEPackageAspectEPackageAspectProperties _self_, final EPackage _self) {
    orgeclipseemfecoreEPackageAspect.super_feedOpposites(_self);
    EList<EClassifier> _eClassifiers = _self.getEClassifiers();
    final Consumer<EClassifier> _function = new Consumer<EClassifier>() {
      @Override
      public void accept(final EClassifier it) {
        orgeclipseemfecoreEClassifierAspect.feedOpposites(it);
      }
    };
    _eClassifiers.forEach(_function);
    EList<EPackage> _eSubpackages = _self.getESubpackages();
    final Consumer<EPackage> _function_1 = new Consumer<EPackage>() {
      @Override
      public void accept(final EPackage it) {
        orgeclipseemfecoreEPackageAspect.feedOpposites(it);
      }
    };
    _eSubpackages.forEach(_function_1);
  }
  
  private static void super_reinit(final EPackage _self) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3_reinit(_self_, _self);
  }
  
  protected static void _privk3_reinit(final orgeclipseemfecoreEPackageAspectEPackageAspectProperties _self_, final EPackage _self) {
    orgeclipseemfecoreEPackageAspect.super_reinit(_self);
    EList<EClassifier> _eClassifiers = _self.getEClassifiers();
    final Consumer<EClassifier> _function = new Consumer<EClassifier>() {
      @Override
      public void accept(final EClassifier it) {
        orgeclipseemfecoreEClassifierAspect.reinit(it);
      }
    };
    _eClassifiers.forEach(_function);
    EList<EPackage> _eSubpackages = _self.getESubpackages();
    final Consumer<EPackage> _function_1 = new Consumer<EPackage>() {
      @Override
      public void accept(final EPackage it) {
        orgeclipseemfecoreEPackageAspect.reinit(it);
      }
    };
    _eSubpackages.forEach(_function_1);
  }
  
  private static void super__visitToAddClasses(final EPackage _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final orgeclipseemfecoreEPackageAspectEPackageAspectProperties _self_, final EPackage _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EPackage _createEPackage = EcoreFactory.eINSTANCE.createEPackage();
      theSlicer.sliceToOriginal.put(_createEPackage, _self);
      __SlicerAspect__.clonedElt(_self, _createEPackage);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEPackageAspect.super__visitToAddClasses(_self, theSlicer);
    EPackage _eSuperPackage = _self.getESuperPackage();
    if (_eSuperPackage!=null) {
      __SlicerAspect__.visitToAddClasses(_eSuperPackage, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final EPackage _self, final StrictEcore theSlicer) {
    final strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations(_self_, _self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final orgeclipseemfecoreEPackageAspectEPackageAspectProperties _self_, final EPackage _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEPackageAspect.super__visitToAddRelations(_self, theSlicer);
    EPackage _eSuperPackage = _self.getESuperPackage();
    boolean _tripleNotEquals = (_eSuperPackage != null);
    if (_tripleNotEquals) {
      EPackage _eSuperPackage_1 = _self.getESuperPackage();
      __SlicerAspect__.visitToAddRelations(_eSuperPackage_1, theSlicer);
      if ((__SlicerAspect__.sliced(_self) && __SlicerAspect__.sliced(_self.getESuperPackage()))) {
        EPackage _eSuperPackage_2 = _self.getESuperPackage();
        EObject _clonedElt = __SlicerAspect__.clonedElt(_eSuperPackage_2);
        EList<EPackage> _eSubpackages = ((EPackage) _clonedElt).getESubpackages();
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        _eSubpackages.add(((EPackage) _clonedElt_1));
      }
    }
    boolean _sliced = __SlicerAspect__.sliced(_self);
    if (_sliced) {
      EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_self);
      String _nsPrefix = _self.getNsPrefix();
      ((EPackage) _clonedElt_2).setNsPrefix(_nsPrefix);
    }
    boolean _sliced_1 = __SlicerAspect__.sliced(_self);
    if (_sliced_1) {
      EObject _clonedElt_3 = __SlicerAspect__.clonedElt(_self);
      String _nsURI = _self.getNsURI();
      ((EPackage) _clonedElt_3).setNsURI(_nsURI);
    }
  }
}
