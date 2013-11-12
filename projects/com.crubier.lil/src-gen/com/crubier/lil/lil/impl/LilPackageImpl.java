/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.Actor;
import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.ActorDeclaration;
import com.crubier.lil.lil.AlwaysEffect;
import com.crubier.lil.lil.BehaviorDeclaration;
import com.crubier.lil.lil.Cause;
import com.crubier.lil.lil.Component;
import com.crubier.lil.lil.ComponentDeclaration;
import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeBase;
import com.crubier.lil.lil.DataTypeCompound;
import com.crubier.lil.lil.DataTypeCompoundDeclaration;
import com.crubier.lil.lil.DataTypeCompoundField;
import com.crubier.lil.lil.Effect;
import com.crubier.lil.lil.Entity;
import com.crubier.lil.lil.EntityDeclaration;
import com.crubier.lil.lil.EventDeclaration;
import com.crubier.lil.lil.EventEmission;
import com.crubier.lil.lil.EventReception;
import com.crubier.lil.lil.FlowDeclaration;
import com.crubier.lil.lil.FlowEmission;
import com.crubier.lil.lil.FlowReception;
import com.crubier.lil.lil.InteractorDeclaration;
import com.crubier.lil.lil.LilFactory;
import com.crubier.lil.lil.LilModel;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.OnCause;
import com.crubier.lil.lil.SetEffect;
import com.crubier.lil.lil.SignalDeclaration;
import com.crubier.lil.lil.TriggerEffect;
import com.crubier.lil.lil.WhenCause;
import com.crubier.lil.lil.XBinaryOperation;
import com.crubier.lil.lil.XBooleanLiteral;
import com.crubier.lil.lil.XCasePart;
import com.crubier.lil.lil.XCollectionLiteral;
import com.crubier.lil.lil.XExpression;
import com.crubier.lil.lil.XForEachExpression;
import com.crubier.lil.lil.XFunctionCallExpression;
import com.crubier.lil.lil.XIfExpression;
import com.crubier.lil.lil.XListLiteral;
import com.crubier.lil.lil.XNullLiteral;
import com.crubier.lil.lil.XNumberLiteral;
import com.crubier.lil.lil.XSetLiteral;
import com.crubier.lil.lil.XStringLiteral;
import com.crubier.lil.lil.XSwitchExpression;
import com.crubier.lil.lil.XUnaryOperation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LilPackageImpl extends EPackageImpl implements LilPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lilModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass accessibleEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass componentDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventReceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowReceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEmissionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowEmissionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flowDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass behaviorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass causeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onCauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenCauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alwaysEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass triggerEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeCompoundDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeCompoundFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xCollectionLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xSetLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xListLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xCasePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeCompoundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeBaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBinaryOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xUnaryOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xIfExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xSwitchExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xForEachExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xFunctionCallExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xBooleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xNullLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xNumberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xStringLiteralEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.crubier.lil.lil.LilPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LilPackageImpl()
  {
    super(eNS_URI, LilFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LilPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LilPackage init()
  {
    if (isInited) return (LilPackage)EPackage.Registry.INSTANCE.getEPackage(LilPackage.eNS_URI);

    // Obtain or create and register package
    LilPackageImpl theLilPackage = (LilPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LilPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LilPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLilPackage.createPackageContents();

    // Initialize created meta-data
    theLilPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLilPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LilPackage.eNS_URI, theLilPackage);
    return theLilPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLilModel()
  {
    return lilModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLilModel_Interactors()
  {
    return (EReference)lilModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLilModel_DataTypes()
  {
    return (EReference)lilModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDeclaration()
  {
    return interactorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteractorDeclaration_Name()
  {
    return (EAttribute)interactorDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDeclaration_Entities()
  {
    return (EReference)interactorDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDeclaration_Signals()
  {
    return (EReference)interactorDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDeclaration_Behaviors()
  {
    return (EReference)interactorDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAccessibleEntity()
  {
    return accessibleEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAccessibleEntity_Generic()
  {
    return (EAttribute)accessibleEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAccessibleEntity_Specific()
  {
    return (EReference)accessibleEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_Instance()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActor()
  {
    return actorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActor_Instance()
  {
    return (EReference)actorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponent()
  {
    return componentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Instance()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityDeclaration()
  {
    return entityDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityDeclaration_Name()
  {
    return (EAttribute)entityDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorDeclaration()
  {
    return actorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorAlias()
  {
    return actorAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorAlias_Source()
  {
    return (EReference)actorAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorAlias_Remote()
  {
    return (EReference)actorAliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComponentDeclaration()
  {
    return componentDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDeclaration_Interactor()
  {
    return (EReference)componentDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponentDeclaration_Aliases()
  {
    return (EReference)componentDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventReception()
  {
    return eventReceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventReception_Instance()
  {
    return (EReference)eventReceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventReception_Source()
  {
    return (EReference)eventReceptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEventReception_Base()
  {
    return (EAttribute)eventReceptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowReception()
  {
    return flowReceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowReception_Instance()
  {
    return (EReference)flowReceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowReception_Source()
  {
    return (EReference)flowReceptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventEmission()
  {
    return eventEmissionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventEmission_Instance()
  {
    return (EReference)eventEmissionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEventEmission_Destination()
  {
    return (EReference)eventEmissionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowEmission()
  {
    return flowEmissionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowEmission_Instance()
  {
    return (EReference)flowEmissionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFlowEmission_Destination()
  {
    return (EReference)flowEmissionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalDeclaration()
  {
    return signalDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalDeclaration_Type()
  {
    return (EReference)signalDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignalDeclaration_Name()
  {
    return (EAttribute)signalDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalDeclaration_Source()
  {
    return (EReference)signalDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalDeclaration_Destinations()
  {
    return (EReference)signalDeclarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEventDeclaration()
  {
    return eventDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlowDeclaration()
  {
    return flowDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBehaviorDeclaration()
  {
    return behaviorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehaviorDeclaration_Cause()
  {
    return (EReference)behaviorDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehaviorDeclaration_Effects()
  {
    return (EReference)behaviorDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCause()
  {
    return causeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCause_Guard()
  {
    return (EReference)causeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnCause()
  {
    return onCauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOnCause_Event()
  {
    return (EReference)onCauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenCause()
  {
    return whenCauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenCause_Condition()
  {
    return (EReference)whenCauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEffect()
  {
    return effectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_Value()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlwaysEffect()
  {
    return alwaysEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlwaysEffect_Target()
  {
    return (EReference)alwaysEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetEffect()
  {
    return setEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSetEffect_Target()
  {
    return (EReference)setEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTriggerEffect()
  {
    return triggerEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTriggerEffect_Target()
  {
    return (EReference)triggerEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeCompoundDeclaration()
  {
    return dataTypeCompoundDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeCompoundDeclaration_Name()
  {
    return (EAttribute)dataTypeCompoundDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeCompoundDeclaration_Fields()
  {
    return (EReference)dataTypeCompoundDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeCompoundField()
  {
    return dataTypeCompoundFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeCompoundField_Type()
  {
    return (EReference)dataTypeCompoundFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeCompoundField_Name()
  {
    return (EAttribute)dataTypeCompoundFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataType()
  {
    return dataTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXExpression()
  {
    return xExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXCollectionLiteral()
  {
    return xCollectionLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXCollectionLiteral_Elements()
  {
    return (EReference)xCollectionLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXSetLiteral()
  {
    return xSetLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXListLiteral()
  {
    return xListLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXCasePart()
  {
    return xCasePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXCasePart_Case()
  {
    return (EReference)xCasePartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXCasePart_Then()
  {
    return (EReference)xCasePartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeCompound()
  {
    return dataTypeCompoundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeCompound_Type()
  {
    return (EReference)dataTypeCompoundEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeBase()
  {
    return dataTypeBaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeBase_Type()
  {
    return (EAttribute)dataTypeBaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBinaryOperation()
  {
    return xBinaryOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBinaryOperation_LeftOperand()
  {
    return (EReference)xBinaryOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXBinaryOperation_Feature()
  {
    return (EAttribute)xBinaryOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXBinaryOperation_RightOperand()
  {
    return (EReference)xBinaryOperationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXUnaryOperation()
  {
    return xUnaryOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXUnaryOperation_Feature()
  {
    return (EAttribute)xUnaryOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXUnaryOperation_Operand()
  {
    return (EReference)xUnaryOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXIfExpression()
  {
    return xIfExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_If()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_Then()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXIfExpression_Else()
  {
    return (EReference)xIfExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXSwitchExpression()
  {
    return xSwitchExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSwitchExpression_Switch()
  {
    return (EReference)xSwitchExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSwitchExpression_Cases()
  {
    return (EReference)xSwitchExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSwitchExpression_Default()
  {
    return (EReference)xSwitchExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXForEachExpression()
  {
    return xForEachExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForEachExpression_ForExpression()
  {
    return (EReference)xForEachExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXForEachExpression_EachExpression()
  {
    return (EReference)xForEachExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXFunctionCallExpression()
  {
    return xFunctionCallExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXFunctionCallExpression_Function()
  {
    return (EAttribute)xFunctionCallExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXFunctionCallExpression_Arguments()
  {
    return (EReference)xFunctionCallExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXBooleanLiteral()
  {
    return xBooleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXBooleanLiteral_IsTrue()
  {
    return (EAttribute)xBooleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXNullLiteral()
  {
    return xNullLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXNumberLiteral()
  {
    return xNumberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXNumberLiteral_Value()
  {
    return (EAttribute)xNumberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXStringLiteral()
  {
    return xStringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXStringLiteral_Value()
  {
    return (EAttribute)xStringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilFactory getLilFactory()
  {
    return (LilFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    lilModelEClass = createEClass(LIL_MODEL);
    createEReference(lilModelEClass, LIL_MODEL__INTERACTORS);
    createEReference(lilModelEClass, LIL_MODEL__DATA_TYPES);

    interactorDeclarationEClass = createEClass(INTERACTOR_DECLARATION);
    createEAttribute(interactorDeclarationEClass, INTERACTOR_DECLARATION__NAME);
    createEReference(interactorDeclarationEClass, INTERACTOR_DECLARATION__ENTITIES);
    createEReference(interactorDeclarationEClass, INTERACTOR_DECLARATION__SIGNALS);
    createEReference(interactorDeclarationEClass, INTERACTOR_DECLARATION__BEHAVIORS);

    accessibleEntityEClass = createEClass(ACCESSIBLE_ENTITY);
    createEAttribute(accessibleEntityEClass, ACCESSIBLE_ENTITY__GENERIC);
    createEReference(accessibleEntityEClass, ACCESSIBLE_ENTITY__SPECIFIC);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__INSTANCE);

    actorEClass = createEClass(ACTOR);
    createEReference(actorEClass, ACTOR__INSTANCE);

    componentEClass = createEClass(COMPONENT);
    createEReference(componentEClass, COMPONENT__INSTANCE);

    entityDeclarationEClass = createEClass(ENTITY_DECLARATION);
    createEAttribute(entityDeclarationEClass, ENTITY_DECLARATION__NAME);

    actorDeclarationEClass = createEClass(ACTOR_DECLARATION);

    actorAliasEClass = createEClass(ACTOR_ALIAS);
    createEReference(actorAliasEClass, ACTOR_ALIAS__SOURCE);
    createEReference(actorAliasEClass, ACTOR_ALIAS__REMOTE);

    componentDeclarationEClass = createEClass(COMPONENT_DECLARATION);
    createEReference(componentDeclarationEClass, COMPONENT_DECLARATION__INTERACTOR);
    createEReference(componentDeclarationEClass, COMPONENT_DECLARATION__ALIASES);

    eventReceptionEClass = createEClass(EVENT_RECEPTION);
    createEReference(eventReceptionEClass, EVENT_RECEPTION__INSTANCE);
    createEReference(eventReceptionEClass, EVENT_RECEPTION__SOURCE);
    createEAttribute(eventReceptionEClass, EVENT_RECEPTION__BASE);

    flowReceptionEClass = createEClass(FLOW_RECEPTION);
    createEReference(flowReceptionEClass, FLOW_RECEPTION__INSTANCE);
    createEReference(flowReceptionEClass, FLOW_RECEPTION__SOURCE);

    eventEmissionEClass = createEClass(EVENT_EMISSION);
    createEReference(eventEmissionEClass, EVENT_EMISSION__INSTANCE);
    createEReference(eventEmissionEClass, EVENT_EMISSION__DESTINATION);

    flowEmissionEClass = createEClass(FLOW_EMISSION);
    createEReference(flowEmissionEClass, FLOW_EMISSION__INSTANCE);
    createEReference(flowEmissionEClass, FLOW_EMISSION__DESTINATION);

    signalDeclarationEClass = createEClass(SIGNAL_DECLARATION);
    createEReference(signalDeclarationEClass, SIGNAL_DECLARATION__TYPE);
    createEAttribute(signalDeclarationEClass, SIGNAL_DECLARATION__NAME);
    createEReference(signalDeclarationEClass, SIGNAL_DECLARATION__SOURCE);
    createEReference(signalDeclarationEClass, SIGNAL_DECLARATION__DESTINATIONS);

    eventDeclarationEClass = createEClass(EVENT_DECLARATION);

    flowDeclarationEClass = createEClass(FLOW_DECLARATION);

    behaviorDeclarationEClass = createEClass(BEHAVIOR_DECLARATION);
    createEReference(behaviorDeclarationEClass, BEHAVIOR_DECLARATION__CAUSE);
    createEReference(behaviorDeclarationEClass, BEHAVIOR_DECLARATION__EFFECTS);

    causeEClass = createEClass(CAUSE);
    createEReference(causeEClass, CAUSE__GUARD);

    onCauseEClass = createEClass(ON_CAUSE);
    createEReference(onCauseEClass, ON_CAUSE__EVENT);

    whenCauseEClass = createEClass(WHEN_CAUSE);
    createEReference(whenCauseEClass, WHEN_CAUSE__CONDITION);

    effectEClass = createEClass(EFFECT);
    createEReference(effectEClass, EFFECT__VALUE);

    alwaysEffectEClass = createEClass(ALWAYS_EFFECT);
    createEReference(alwaysEffectEClass, ALWAYS_EFFECT__TARGET);

    setEffectEClass = createEClass(SET_EFFECT);
    createEReference(setEffectEClass, SET_EFFECT__TARGET);

    triggerEffectEClass = createEClass(TRIGGER_EFFECT);
    createEReference(triggerEffectEClass, TRIGGER_EFFECT__TARGET);

    dataTypeCompoundDeclarationEClass = createEClass(DATA_TYPE_COMPOUND_DECLARATION);
    createEAttribute(dataTypeCompoundDeclarationEClass, DATA_TYPE_COMPOUND_DECLARATION__NAME);
    createEReference(dataTypeCompoundDeclarationEClass, DATA_TYPE_COMPOUND_DECLARATION__FIELDS);

    dataTypeCompoundFieldEClass = createEClass(DATA_TYPE_COMPOUND_FIELD);
    createEReference(dataTypeCompoundFieldEClass, DATA_TYPE_COMPOUND_FIELD__TYPE);
    createEAttribute(dataTypeCompoundFieldEClass, DATA_TYPE_COMPOUND_FIELD__NAME);

    dataTypeEClass = createEClass(DATA_TYPE);

    xExpressionEClass = createEClass(XEXPRESSION);

    xCollectionLiteralEClass = createEClass(XCOLLECTION_LITERAL);
    createEReference(xCollectionLiteralEClass, XCOLLECTION_LITERAL__ELEMENTS);

    xSetLiteralEClass = createEClass(XSET_LITERAL);

    xListLiteralEClass = createEClass(XLIST_LITERAL);

    xCasePartEClass = createEClass(XCASE_PART);
    createEReference(xCasePartEClass, XCASE_PART__CASE);
    createEReference(xCasePartEClass, XCASE_PART__THEN);

    dataTypeCompoundEClass = createEClass(DATA_TYPE_COMPOUND);
    createEReference(dataTypeCompoundEClass, DATA_TYPE_COMPOUND__TYPE);

    dataTypeBaseEClass = createEClass(DATA_TYPE_BASE);
    createEAttribute(dataTypeBaseEClass, DATA_TYPE_BASE__TYPE);

    xBinaryOperationEClass = createEClass(XBINARY_OPERATION);
    createEReference(xBinaryOperationEClass, XBINARY_OPERATION__LEFT_OPERAND);
    createEAttribute(xBinaryOperationEClass, XBINARY_OPERATION__FEATURE);
    createEReference(xBinaryOperationEClass, XBINARY_OPERATION__RIGHT_OPERAND);

    xUnaryOperationEClass = createEClass(XUNARY_OPERATION);
    createEAttribute(xUnaryOperationEClass, XUNARY_OPERATION__FEATURE);
    createEReference(xUnaryOperationEClass, XUNARY_OPERATION__OPERAND);

    xIfExpressionEClass = createEClass(XIF_EXPRESSION);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__IF);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__THEN);
    createEReference(xIfExpressionEClass, XIF_EXPRESSION__ELSE);

    xSwitchExpressionEClass = createEClass(XSWITCH_EXPRESSION);
    createEReference(xSwitchExpressionEClass, XSWITCH_EXPRESSION__SWITCH);
    createEReference(xSwitchExpressionEClass, XSWITCH_EXPRESSION__CASES);
    createEReference(xSwitchExpressionEClass, XSWITCH_EXPRESSION__DEFAULT);

    xForEachExpressionEClass = createEClass(XFOR_EACH_EXPRESSION);
    createEReference(xForEachExpressionEClass, XFOR_EACH_EXPRESSION__FOR_EXPRESSION);
    createEReference(xForEachExpressionEClass, XFOR_EACH_EXPRESSION__EACH_EXPRESSION);

    xFunctionCallExpressionEClass = createEClass(XFUNCTION_CALL_EXPRESSION);
    createEAttribute(xFunctionCallExpressionEClass, XFUNCTION_CALL_EXPRESSION__FUNCTION);
    createEReference(xFunctionCallExpressionEClass, XFUNCTION_CALL_EXPRESSION__ARGUMENTS);

    xBooleanLiteralEClass = createEClass(XBOOLEAN_LITERAL);
    createEAttribute(xBooleanLiteralEClass, XBOOLEAN_LITERAL__IS_TRUE);

    xNullLiteralEClass = createEClass(XNULL_LITERAL);

    xNumberLiteralEClass = createEClass(XNUMBER_LITERAL);
    createEAttribute(xNumberLiteralEClass, XNUMBER_LITERAL__VALUE);

    xStringLiteralEClass = createEClass(XSTRING_LITERAL);
    createEAttribute(xStringLiteralEClass, XSTRING_LITERAL__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    actorDeclarationEClass.getESuperTypes().add(this.getEntityDeclaration());
    componentDeclarationEClass.getESuperTypes().add(this.getEntityDeclaration());
    eventDeclarationEClass.getESuperTypes().add(this.getSignalDeclaration());
    flowDeclarationEClass.getESuperTypes().add(this.getSignalDeclaration());
    onCauseEClass.getESuperTypes().add(this.getCause());
    whenCauseEClass.getESuperTypes().add(this.getCause());
    alwaysEffectEClass.getESuperTypes().add(this.getEffect());
    setEffectEClass.getESuperTypes().add(this.getEffect());
    triggerEffectEClass.getESuperTypes().add(this.getEffect());
    xCollectionLiteralEClass.getESuperTypes().add(this.getXExpression());
    xSetLiteralEClass.getESuperTypes().add(this.getXCollectionLiteral());
    xListLiteralEClass.getESuperTypes().add(this.getXCollectionLiteral());
    dataTypeCompoundEClass.getESuperTypes().add(this.getDataType());
    dataTypeBaseEClass.getESuperTypes().add(this.getDataType());
    xBinaryOperationEClass.getESuperTypes().add(this.getXExpression());
    xUnaryOperationEClass.getESuperTypes().add(this.getXExpression());
    xIfExpressionEClass.getESuperTypes().add(this.getXExpression());
    xSwitchExpressionEClass.getESuperTypes().add(this.getXExpression());
    xForEachExpressionEClass.getESuperTypes().add(this.getXExpression());
    xFunctionCallExpressionEClass.getESuperTypes().add(this.getXExpression());
    xBooleanLiteralEClass.getESuperTypes().add(this.getXExpression());
    xNullLiteralEClass.getESuperTypes().add(this.getXExpression());
    xNumberLiteralEClass.getESuperTypes().add(this.getXExpression());
    xStringLiteralEClass.getESuperTypes().add(this.getXExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(lilModelEClass, LilModel.class, "LilModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLilModel_Interactors(), this.getInteractorDeclaration(), null, "interactors", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLilModel_DataTypes(), this.getDataTypeCompoundDeclaration(), null, "dataTypes", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorDeclarationEClass, InteractorDeclaration.class, "InteractorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteractorDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, InteractorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorDeclaration_Entities(), this.getEntityDeclaration(), null, "entities", null, 0, -1, InteractorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorDeclaration_Signals(), this.getSignalDeclaration(), null, "signals", null, 0, -1, InteractorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorDeclaration_Behaviors(), this.getBehaviorDeclaration(), null, "behaviors", null, 0, -1, InteractorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accessibleEntityEClass, AccessibleEntity.class, "AccessibleEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAccessibleEntity_Generic(), ecorePackage.getEString(), "generic", null, 0, 1, AccessibleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccessibleEntity_Specific(), this.getEntity(), null, "specific", null, 0, 1, AccessibleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_Instance(), this.getEntityDeclaration(), null, "instance", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActor_Instance(), this.getActorDeclaration(), null, "instance", null, 0, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponent_Instance(), this.getComponentDeclaration(), null, "instance", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityDeclarationEClass, EntityDeclaration.class, "EntityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntityDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, EntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorDeclarationEClass, ActorDeclaration.class, "ActorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actorAliasEClass, ActorAlias.class, "ActorAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActorAlias_Source(), this.getActor(), null, "source", null, 0, 1, ActorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActorAlias_Remote(), this.getActor(), null, "remote", null, 0, 1, ActorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentDeclarationEClass, ComponentDeclaration.class, "ComponentDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponentDeclaration_Interactor(), this.getInteractorDeclaration(), null, "interactor", null, 0, 1, ComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponentDeclaration_Aliases(), this.getActorAlias(), null, "aliases", null, 0, -1, ComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventReceptionEClass, EventReception.class, "EventReception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEventReception_Instance(), this.getEventDeclaration(), null, "instance", null, 0, 1, EventReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventReception_Source(), this.getComponent(), null, "source", null, 0, 1, EventReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEventReception_Base(), ecorePackage.getEString(), "base", null, 0, 1, EventReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowReceptionEClass, FlowReception.class, "FlowReception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFlowReception_Instance(), this.getFlowDeclaration(), null, "instance", null, 0, 1, FlowReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlowReception_Source(), this.getComponent(), null, "source", null, 0, 1, FlowReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEmissionEClass, EventEmission.class, "EventEmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEventEmission_Instance(), this.getEventDeclaration(), null, "instance", null, 0, 1, EventEmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEventEmission_Destination(), this.getComponent(), null, "destination", null, 0, 1, EventEmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flowEmissionEClass, FlowEmission.class, "FlowEmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFlowEmission_Instance(), this.getFlowDeclaration(), null, "instance", null, 0, 1, FlowEmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFlowEmission_Destination(), this.getComponent(), null, "destination", null, 0, 1, FlowEmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalDeclarationEClass, SignalDeclaration.class, "SignalDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalDeclaration_Type(), this.getDataType(), null, "type", null, 0, 1, SignalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignalDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, SignalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignalDeclaration_Source(), this.getAccessibleEntity(), null, "source", null, 0, 1, SignalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignalDeclaration_Destinations(), this.getAccessibleEntity(), null, "destinations", null, 0, -1, SignalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventDeclarationEClass, EventDeclaration.class, "EventDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(flowDeclarationEClass, FlowDeclaration.class, "FlowDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(behaviorDeclarationEClass, BehaviorDeclaration.class, "BehaviorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBehaviorDeclaration_Cause(), this.getCause(), null, "cause", null, 0, 1, BehaviorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBehaviorDeclaration_Effects(), this.getEffect(), null, "effects", null, 0, -1, BehaviorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(causeEClass, Cause.class, "Cause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCause_Guard(), this.getXExpression(), null, "guard", null, 0, 1, Cause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onCauseEClass, OnCause.class, "OnCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOnCause_Event(), this.getEventReception(), null, "event", null, 0, 1, OnCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenCauseEClass, WhenCause.class, "WhenCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenCause_Condition(), this.getXExpression(), null, "condition", null, 0, 1, WhenCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEffect_Value(), this.getXExpression(), null, "value", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alwaysEffectEClass, AlwaysEffect.class, "AlwaysEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlwaysEffect_Target(), this.getFlowEmission(), null, "target", null, 0, 1, AlwaysEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setEffectEClass, SetEffect.class, "SetEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetEffect_Target(), this.getFlowEmission(), null, "target", null, 0, 1, SetEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(triggerEffectEClass, TriggerEffect.class, "TriggerEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTriggerEffect_Target(), this.getEventEmission(), null, "target", null, 0, 1, TriggerEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeCompoundDeclarationEClass, DataTypeCompoundDeclaration.class, "DataTypeCompoundDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeCompoundDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeCompoundDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeCompoundDeclaration_Fields(), this.getDataTypeCompoundField(), null, "fields", null, 0, -1, DataTypeCompoundDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeCompoundFieldEClass, DataTypeCompoundField.class, "DataTypeCompoundField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeCompoundField_Type(), this.getDataType(), null, "type", null, 0, 1, DataTypeCompoundField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataTypeCompoundField_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeCompoundField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xExpressionEClass, XExpression.class, "XExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xCollectionLiteralEClass, XCollectionLiteral.class, "XCollectionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXCollectionLiteral_Elements(), this.getXExpression(), null, "elements", null, 0, -1, XCollectionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xSetLiteralEClass, XSetLiteral.class, "XSetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xListLiteralEClass, XListLiteral.class, "XListLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xCasePartEClass, XCasePart.class, "XCasePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXCasePart_Case(), this.getXExpression(), null, "case", null, 0, 1, XCasePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXCasePart_Then(), this.getXExpression(), null, "then", null, 0, 1, XCasePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeCompoundEClass, DataTypeCompound.class, "DataTypeCompound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeCompound_Type(), this.getDataTypeCompoundDeclaration(), null, "type", null, 0, 1, DataTypeCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeBaseEClass, DataTypeBase.class, "DataTypeBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeBase_Type(), ecorePackage.getEString(), "type", null, 0, 1, DataTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBinaryOperationEClass, XBinaryOperation.class, "XBinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXBinaryOperation_LeftOperand(), this.getXExpression(), null, "leftOperand", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXBinaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXBinaryOperation_RightOperand(), this.getXExpression(), null, "rightOperand", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xUnaryOperationEClass, XUnaryOperation.class, "XUnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXUnaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXUnaryOperation_Operand(), this.getXExpression(), null, "operand", null, 0, 1, XUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xIfExpressionEClass, XIfExpression.class, "XIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXIfExpression_If(), this.getXExpression(), null, "if", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXIfExpression_Then(), this.getXExpression(), null, "then", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXIfExpression_Else(), this.getXExpression(), null, "else", null, 0, 1, XIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xSwitchExpressionEClass, XSwitchExpression.class, "XSwitchExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXSwitchExpression_Switch(), this.getXExpression(), null, "switch", null, 0, 1, XSwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXSwitchExpression_Cases(), this.getXCasePart(), null, "cases", null, 0, -1, XSwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXSwitchExpression_Default(), this.getXExpression(), null, "default", null, 0, 1, XSwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xForEachExpressionEClass, XForEachExpression.class, "XForEachExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXForEachExpression_ForExpression(), this.getXExpression(), null, "forExpression", null, 0, 1, XForEachExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXForEachExpression_EachExpression(), this.getXExpression(), null, "eachExpression", null, 0, 1, XForEachExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xFunctionCallExpressionEClass, XFunctionCallExpression.class, "XFunctionCallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXFunctionCallExpression_Function(), ecorePackage.getEString(), "function", null, 0, 1, XFunctionCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXFunctionCallExpression_Arguments(), this.getXExpression(), null, "arguments", null, 0, -1, XFunctionCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBooleanLiteralEClass, XBooleanLiteral.class, "XBooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXBooleanLiteral_IsTrue(), ecorePackage.getEBoolean(), "isTrue", null, 0, 1, XBooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xNullLiteralEClass, XNullLiteral.class, "XNullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xNumberLiteralEClass, XNumberLiteral.class, "XNumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXNumberLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, XNumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xStringLiteralEClass, XStringLiteral.class, "XStringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, XStringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LilPackageImpl
