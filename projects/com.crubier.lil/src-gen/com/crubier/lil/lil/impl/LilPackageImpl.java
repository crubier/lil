/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.Actor;
import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.ActorDeclaration;
import com.crubier.lil.lil.AlwaysEffect;
import com.crubier.lil.lil.BehaviorDeclaration;
import com.crubier.lil.lil.BooleanConjonction;
import com.crubier.lil.lil.BooleanDisjonction;
import com.crubier.lil.lil.BooleanExpression;
import com.crubier.lil.lil.BooleanLiteral;
import com.crubier.lil.lil.BooleanNegation;
import com.crubier.lil.lil.Cause;
import com.crubier.lil.lil.Component;
import com.crubier.lil.lil.ComponentDeclaration;
import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeDeclaration;
import com.crubier.lil.lil.Effect;
import com.crubier.lil.lil.Entity;
import com.crubier.lil.lil.EntityDeclaration;
import com.crubier.lil.lil.EventDeclaration;
import com.crubier.lil.lil.EventEmission;
import com.crubier.lil.lil.EventReception;
import com.crubier.lil.lil.Expression;
import com.crubier.lil.lil.Field;
import com.crubier.lil.lil.FlowDeclaration;
import com.crubier.lil.lil.FlowEmission;
import com.crubier.lil.lil.FlowReception;
import com.crubier.lil.lil.InteractorDeclaration;
import com.crubier.lil.lil.LilFactory;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.Model;
import com.crubier.lil.lil.NumberAddition;
import com.crubier.lil.lil.NumberDivision;
import com.crubier.lil.lil.NumberExpression;
import com.crubier.lil.lil.NumberFunctionExpression;
import com.crubier.lil.lil.NumberIfExpression;
import com.crubier.lil.lil.NumberLiteral;
import com.crubier.lil.lil.NumberModulo;
import com.crubier.lil.lil.NumberMultiplication;
import com.crubier.lil.lil.NumberOpposition;
import com.crubier.lil.lil.NumberPower;
import com.crubier.lil.lil.NumberSubstraction;
import com.crubier.lil.lil.NumberSwitchExpressionNumber;
import com.crubier.lil.lil.NumberSwitchExpressionNumberCase;
import com.crubier.lil.lil.NumberSwitchExpressionText;
import com.crubier.lil.lil.NumberSwitchExpressionTextCase;
import com.crubier.lil.lil.OnCause;
import com.crubier.lil.lil.SetEffect;
import com.crubier.lil.lil.SignalDeclaration;
import com.crubier.lil.lil.TextExpression;
import com.crubier.lil.lil.TextJoin;
import com.crubier.lil.lil.TextLiteral;
import com.crubier.lil.lil.TriggerEffect;
import com.crubier.lil.lil.WhenCause;

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
  private EClass modelEClass = null;

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
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldEClass = null;

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
  private EClass booleanExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberSwitchExpressionNumberCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberSwitchExpressionTextCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanDisjonctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanConjonctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanNegationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberIfExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberSwitchExpressionNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberSwitchExpressionTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberAdditionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberSubstractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberMultiplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberDivisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberModuloEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberPowerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberOppositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberFunctionExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textJoinEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textLiteralEClass = null;

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
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Interactors()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_DataTypes()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(1);
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
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeDeclaration()
  {
    return dataTypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeDeclaration_Name()
  {
    return (EAttribute)dataTypeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeDeclaration_Fields()
  {
    return (EReference)dataTypeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField()
  {
    return fieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_Type()
  {
    return (EReference)fieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_Name()
  {
    return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
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
  public EReference getDataType_Compound()
  {
    return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataType_Base()
  {
    return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanExpression()
  {
    return booleanExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberExpression()
  {
    return numberExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberSwitchExpressionNumberCase()
  {
    return numberSwitchExpressionNumberCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSwitchExpressionNumberCase_Condition()
  {
    return (EReference)numberSwitchExpressionNumberCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSwitchExpressionNumberCase_Value()
  {
    return (EReference)numberSwitchExpressionNumberCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberSwitchExpressionTextCase()
  {
    return numberSwitchExpressionTextCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSwitchExpressionTextCase_Condition()
  {
    return (EReference)numberSwitchExpressionTextCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSwitchExpressionTextCase_Value()
  {
    return (EReference)numberSwitchExpressionTextCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextExpression()
  {
    return textExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanDisjonction()
  {
    return booleanDisjonctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanDisjonction_Left()
  {
    return (EReference)booleanDisjonctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanDisjonction_Right()
  {
    return (EReference)booleanDisjonctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanConjonction()
  {
    return booleanConjonctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanConjonction_Left()
  {
    return (EReference)booleanConjonctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanConjonction_Right()
  {
    return (EReference)booleanConjonctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanNegation()
  {
    return booleanNegationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBooleanNegation_Operand()
  {
    return (EReference)booleanNegationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBooleanLiteral()
  {
    return booleanLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBooleanLiteral_Value()
  {
    return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberIfExpression()
  {
    return numberIfExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberIfExpression_If()
  {
    return (EReference)numberIfExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberIfExpression_Then()
  {
    return (EReference)numberIfExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberIfExpression_Else()
  {
    return (EReference)numberIfExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberSwitchExpressionNumber()
  {
    return numberSwitchExpressionNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSwitchExpressionNumber_Switch()
  {
    return (EReference)numberSwitchExpressionNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSwitchExpressionNumber_Cases()
  {
    return (EReference)numberSwitchExpressionNumberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSwitchExpressionNumber_Default()
  {
    return (EReference)numberSwitchExpressionNumberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberSwitchExpressionText()
  {
    return numberSwitchExpressionTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSwitchExpressionText_Switch()
  {
    return (EReference)numberSwitchExpressionTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSwitchExpressionText_Cases()
  {
    return (EReference)numberSwitchExpressionTextEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSwitchExpressionText_Default()
  {
    return (EReference)numberSwitchExpressionTextEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberAddition()
  {
    return numberAdditionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberAddition_Left()
  {
    return (EReference)numberAdditionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberAddition_Right()
  {
    return (EReference)numberAdditionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberSubstraction()
  {
    return numberSubstractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSubstraction_Left()
  {
    return (EReference)numberSubstractionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberSubstraction_Right()
  {
    return (EReference)numberSubstractionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberMultiplication()
  {
    return numberMultiplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberMultiplication_Left()
  {
    return (EReference)numberMultiplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberMultiplication_Right()
  {
    return (EReference)numberMultiplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberDivision()
  {
    return numberDivisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberDivision_Left()
  {
    return (EReference)numberDivisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberDivision_Right()
  {
    return (EReference)numberDivisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberModulo()
  {
    return numberModuloEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberModulo_Left()
  {
    return (EReference)numberModuloEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberModulo_Right()
  {
    return (EReference)numberModuloEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberPower()
  {
    return numberPowerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberPower_Left()
  {
    return (EReference)numberPowerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberPower_Right()
  {
    return (EReference)numberPowerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberOpposition()
  {
    return numberOppositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberOpposition_Operand()
  {
    return (EReference)numberOppositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLiteral()
  {
    return numberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberLiteral_Value()
  {
    return (EAttribute)numberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberFunctionExpression()
  {
    return numberFunctionExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberFunctionExpression_Function()
  {
    return (EAttribute)numberFunctionExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberFunctionExpression_Arguments()
  {
    return (EReference)numberFunctionExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextJoin()
  {
    return textJoinEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextJoin_Left()
  {
    return (EReference)textJoinEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTextJoin_Right()
  {
    return (EReference)textJoinEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextLiteral()
  {
    return textLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextLiteral_Value()
  {
    return (EAttribute)textLiteralEClass.getEStructuralFeatures().get(0);
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
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__INTERACTORS);
    createEReference(modelEClass, MODEL__DATA_TYPES);

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

    expressionEClass = createEClass(EXPRESSION);

    dataTypeDeclarationEClass = createEClass(DATA_TYPE_DECLARATION);
    createEAttribute(dataTypeDeclarationEClass, DATA_TYPE_DECLARATION__NAME);
    createEReference(dataTypeDeclarationEClass, DATA_TYPE_DECLARATION__FIELDS);

    fieldEClass = createEClass(FIELD);
    createEReference(fieldEClass, FIELD__TYPE);
    createEAttribute(fieldEClass, FIELD__NAME);

    dataTypeEClass = createEClass(DATA_TYPE);
    createEReference(dataTypeEClass, DATA_TYPE__COMPOUND);
    createEAttribute(dataTypeEClass, DATA_TYPE__BASE);

    booleanExpressionEClass = createEClass(BOOLEAN_EXPRESSION);

    numberExpressionEClass = createEClass(NUMBER_EXPRESSION);

    numberSwitchExpressionNumberCaseEClass = createEClass(NUMBER_SWITCH_EXPRESSION_NUMBER_CASE);
    createEReference(numberSwitchExpressionNumberCaseEClass, NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION);
    createEReference(numberSwitchExpressionNumberCaseEClass, NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE);

    numberSwitchExpressionTextCaseEClass = createEClass(NUMBER_SWITCH_EXPRESSION_TEXT_CASE);
    createEReference(numberSwitchExpressionTextCaseEClass, NUMBER_SWITCH_EXPRESSION_TEXT_CASE__CONDITION);
    createEReference(numberSwitchExpressionTextCaseEClass, NUMBER_SWITCH_EXPRESSION_TEXT_CASE__VALUE);

    textExpressionEClass = createEClass(TEXT_EXPRESSION);

    booleanDisjonctionEClass = createEClass(BOOLEAN_DISJONCTION);
    createEReference(booleanDisjonctionEClass, BOOLEAN_DISJONCTION__LEFT);
    createEReference(booleanDisjonctionEClass, BOOLEAN_DISJONCTION__RIGHT);

    booleanConjonctionEClass = createEClass(BOOLEAN_CONJONCTION);
    createEReference(booleanConjonctionEClass, BOOLEAN_CONJONCTION__LEFT);
    createEReference(booleanConjonctionEClass, BOOLEAN_CONJONCTION__RIGHT);

    booleanNegationEClass = createEClass(BOOLEAN_NEGATION);
    createEReference(booleanNegationEClass, BOOLEAN_NEGATION__OPERAND);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
    createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__VALUE);

    numberIfExpressionEClass = createEClass(NUMBER_IF_EXPRESSION);
    createEReference(numberIfExpressionEClass, NUMBER_IF_EXPRESSION__IF);
    createEReference(numberIfExpressionEClass, NUMBER_IF_EXPRESSION__THEN);
    createEReference(numberIfExpressionEClass, NUMBER_IF_EXPRESSION__ELSE);

    numberSwitchExpressionNumberEClass = createEClass(NUMBER_SWITCH_EXPRESSION_NUMBER);
    createEReference(numberSwitchExpressionNumberEClass, NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH);
    createEReference(numberSwitchExpressionNumberEClass, NUMBER_SWITCH_EXPRESSION_NUMBER__CASES);
    createEReference(numberSwitchExpressionNumberEClass, NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT);

    numberSwitchExpressionTextEClass = createEClass(NUMBER_SWITCH_EXPRESSION_TEXT);
    createEReference(numberSwitchExpressionTextEClass, NUMBER_SWITCH_EXPRESSION_TEXT__SWITCH);
    createEReference(numberSwitchExpressionTextEClass, NUMBER_SWITCH_EXPRESSION_TEXT__CASES);
    createEReference(numberSwitchExpressionTextEClass, NUMBER_SWITCH_EXPRESSION_TEXT__DEFAULT);

    numberAdditionEClass = createEClass(NUMBER_ADDITION);
    createEReference(numberAdditionEClass, NUMBER_ADDITION__LEFT);
    createEReference(numberAdditionEClass, NUMBER_ADDITION__RIGHT);

    numberSubstractionEClass = createEClass(NUMBER_SUBSTRACTION);
    createEReference(numberSubstractionEClass, NUMBER_SUBSTRACTION__LEFT);
    createEReference(numberSubstractionEClass, NUMBER_SUBSTRACTION__RIGHT);

    numberMultiplicationEClass = createEClass(NUMBER_MULTIPLICATION);
    createEReference(numberMultiplicationEClass, NUMBER_MULTIPLICATION__LEFT);
    createEReference(numberMultiplicationEClass, NUMBER_MULTIPLICATION__RIGHT);

    numberDivisionEClass = createEClass(NUMBER_DIVISION);
    createEReference(numberDivisionEClass, NUMBER_DIVISION__LEFT);
    createEReference(numberDivisionEClass, NUMBER_DIVISION__RIGHT);

    numberModuloEClass = createEClass(NUMBER_MODULO);
    createEReference(numberModuloEClass, NUMBER_MODULO__LEFT);
    createEReference(numberModuloEClass, NUMBER_MODULO__RIGHT);

    numberPowerEClass = createEClass(NUMBER_POWER);
    createEReference(numberPowerEClass, NUMBER_POWER__LEFT);
    createEReference(numberPowerEClass, NUMBER_POWER__RIGHT);

    numberOppositionEClass = createEClass(NUMBER_OPPOSITION);
    createEReference(numberOppositionEClass, NUMBER_OPPOSITION__OPERAND);

    numberLiteralEClass = createEClass(NUMBER_LITERAL);
    createEAttribute(numberLiteralEClass, NUMBER_LITERAL__VALUE);

    numberFunctionExpressionEClass = createEClass(NUMBER_FUNCTION_EXPRESSION);
    createEAttribute(numberFunctionExpressionEClass, NUMBER_FUNCTION_EXPRESSION__FUNCTION);
    createEReference(numberFunctionExpressionEClass, NUMBER_FUNCTION_EXPRESSION__ARGUMENTS);

    textJoinEClass = createEClass(TEXT_JOIN);
    createEReference(textJoinEClass, TEXT_JOIN__LEFT);
    createEReference(textJoinEClass, TEXT_JOIN__RIGHT);

    textLiteralEClass = createEClass(TEXT_LITERAL);
    createEAttribute(textLiteralEClass, TEXT_LITERAL__VALUE);
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
    numberExpressionEClass.getESuperTypes().add(this.getExpression());
    booleanDisjonctionEClass.getESuperTypes().add(this.getBooleanExpression());
    booleanConjonctionEClass.getESuperTypes().add(this.getBooleanExpression());
    booleanNegationEClass.getESuperTypes().add(this.getBooleanExpression());
    booleanLiteralEClass.getESuperTypes().add(this.getBooleanExpression());
    numberIfExpressionEClass.getESuperTypes().add(this.getNumberExpression());
    numberSwitchExpressionNumberEClass.getESuperTypes().add(this.getNumberExpression());
    numberSwitchExpressionTextEClass.getESuperTypes().add(this.getNumberExpression());
    numberAdditionEClass.getESuperTypes().add(this.getNumberExpression());
    numberSubstractionEClass.getESuperTypes().add(this.getNumberExpression());
    numberMultiplicationEClass.getESuperTypes().add(this.getNumberExpression());
    numberDivisionEClass.getESuperTypes().add(this.getNumberExpression());
    numberModuloEClass.getESuperTypes().add(this.getNumberExpression());
    numberPowerEClass.getESuperTypes().add(this.getNumberExpression());
    numberOppositionEClass.getESuperTypes().add(this.getNumberExpression());
    numberLiteralEClass.getESuperTypes().add(this.getNumberExpression());
    numberFunctionExpressionEClass.getESuperTypes().add(this.getNumberExpression());
    textJoinEClass.getESuperTypes().add(this.getTextExpression());
    textLiteralEClass.getESuperTypes().add(this.getTextExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Interactors(), this.getInteractorDeclaration(), null, "interactors", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModel_DataTypes(), this.getDataTypeDeclaration(), null, "dataTypes", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEReference(getCause_Guard(), this.getExpression(), null, "guard", null, 0, 1, Cause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onCauseEClass, OnCause.class, "OnCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOnCause_Event(), this.getEventReception(), null, "event", null, 0, 1, OnCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenCauseEClass, WhenCause.class, "WhenCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenCause_Condition(), this.getExpression(), null, "condition", null, 0, 1, WhenCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEffect_Value(), this.getExpression(), null, "value", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alwaysEffectEClass, AlwaysEffect.class, "AlwaysEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlwaysEffect_Target(), this.getFlowEmission(), null, "target", null, 0, 1, AlwaysEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setEffectEClass, SetEffect.class, "SetEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSetEffect_Target(), this.getFlowEmission(), null, "target", null, 0, 1, SetEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(triggerEffectEClass, TriggerEffect.class, "TriggerEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTriggerEffect_Target(), this.getEventEmission(), null, "target", null, 0, 1, TriggerEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeDeclarationEClass, DataTypeDeclaration.class, "DataTypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeDeclaration_Fields(), this.getField(), null, "fields", null, 0, -1, DataTypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getField_Type(), this.getDataType(), null, "type", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataType_Compound(), this.getDataTypeDeclaration(), null, "compound", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataType_Base(), ecorePackage.getEString(), "base", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanExpressionEClass, BooleanExpression.class, "BooleanExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberExpressionEClass, NumberExpression.class, "NumberExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberSwitchExpressionNumberCaseEClass, NumberSwitchExpressionNumberCase.class, "NumberSwitchExpressionNumberCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberSwitchExpressionNumberCase_Condition(), this.getNumberExpression(), null, "condition", null, 0, 1, NumberSwitchExpressionNumberCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberSwitchExpressionNumberCase_Value(), this.getNumberExpression(), null, "value", null, 0, 1, NumberSwitchExpressionNumberCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberSwitchExpressionTextCaseEClass, NumberSwitchExpressionTextCase.class, "NumberSwitchExpressionTextCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberSwitchExpressionTextCase_Condition(), this.getTextExpression(), null, "condition", null, 0, 1, NumberSwitchExpressionTextCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberSwitchExpressionTextCase_Value(), this.getNumberExpression(), null, "value", null, 0, 1, NumberSwitchExpressionTextCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textExpressionEClass, TextExpression.class, "TextExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanDisjonctionEClass, BooleanDisjonction.class, "BooleanDisjonction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanDisjonction_Left(), this.getBooleanExpression(), null, "left", null, 0, 1, BooleanDisjonction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanDisjonction_Right(), this.getBooleanExpression(), null, "right", null, 0, 1, BooleanDisjonction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanConjonctionEClass, BooleanConjonction.class, "BooleanConjonction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanConjonction_Left(), this.getBooleanExpression(), null, "left", null, 0, 1, BooleanConjonction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBooleanConjonction_Right(), this.getBooleanExpression(), null, "right", null, 0, 1, BooleanConjonction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanNegationEClass, BooleanNegation.class, "BooleanNegation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBooleanNegation_Operand(), this.getBooleanExpression(), null, "operand", null, 0, 1, BooleanNegation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteral_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberIfExpressionEClass, NumberIfExpression.class, "NumberIfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberIfExpression_If(), this.getBooleanExpression(), null, "if", null, 0, 1, NumberIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberIfExpression_Then(), this.getNumberExpression(), null, "then", null, 0, 1, NumberIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberIfExpression_Else(), this.getNumberExpression(), null, "else", null, 0, 1, NumberIfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberSwitchExpressionNumberEClass, NumberSwitchExpressionNumber.class, "NumberSwitchExpressionNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberSwitchExpressionNumber_Switch(), this.getNumberExpression(), null, "switch", null, 0, 1, NumberSwitchExpressionNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberSwitchExpressionNumber_Cases(), this.getNumberSwitchExpressionNumberCase(), null, "cases", null, 0, -1, NumberSwitchExpressionNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberSwitchExpressionNumber_Default(), this.getNumberExpression(), null, "default", null, 0, 1, NumberSwitchExpressionNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberSwitchExpressionTextEClass, NumberSwitchExpressionText.class, "NumberSwitchExpressionText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberSwitchExpressionText_Switch(), this.getTextExpression(), null, "switch", null, 0, 1, NumberSwitchExpressionText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberSwitchExpressionText_Cases(), this.getNumberSwitchExpressionTextCase(), null, "cases", null, 0, -1, NumberSwitchExpressionText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberSwitchExpressionText_Default(), this.getNumberExpression(), null, "default", null, 0, 1, NumberSwitchExpressionText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberAdditionEClass, NumberAddition.class, "NumberAddition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberAddition_Left(), this.getNumberExpression(), null, "left", null, 0, 1, NumberAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberAddition_Right(), this.getNumberExpression(), null, "right", null, 0, 1, NumberAddition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberSubstractionEClass, NumberSubstraction.class, "NumberSubstraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberSubstraction_Left(), this.getNumberExpression(), null, "left", null, 0, 1, NumberSubstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberSubstraction_Right(), this.getNumberExpression(), null, "right", null, 0, 1, NumberSubstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberMultiplicationEClass, NumberMultiplication.class, "NumberMultiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberMultiplication_Left(), this.getNumberExpression(), null, "left", null, 0, 1, NumberMultiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberMultiplication_Right(), this.getNumberExpression(), null, "right", null, 0, 1, NumberMultiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberDivisionEClass, NumberDivision.class, "NumberDivision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberDivision_Left(), this.getNumberExpression(), null, "left", null, 0, 1, NumberDivision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberDivision_Right(), this.getNumberExpression(), null, "right", null, 0, 1, NumberDivision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberModuloEClass, NumberModulo.class, "NumberModulo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberModulo_Left(), this.getNumberExpression(), null, "left", null, 0, 1, NumberModulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberModulo_Right(), this.getNumberExpression(), null, "right", null, 0, 1, NumberModulo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberPowerEClass, NumberPower.class, "NumberPower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberPower_Left(), this.getNumberExpression(), null, "left", null, 0, 1, NumberPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberPower_Right(), this.getNumberExpression(), null, "right", null, 0, 1, NumberPower.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberOppositionEClass, NumberOpposition.class, "NumberOpposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberOpposition_Operand(), this.getNumberExpression(), null, "operand", null, 0, 1, NumberOpposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberFunctionExpressionEClass, NumberFunctionExpression.class, "NumberFunctionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberFunctionExpression_Function(), ecorePackage.getEString(), "function", null, 0, 1, NumberFunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberFunctionExpression_Arguments(), this.getNumberExpression(), null, "arguments", null, 0, -1, NumberFunctionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textJoinEClass, TextJoin.class, "TextJoin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTextJoin_Left(), this.getTextExpression(), null, "left", null, 0, 1, TextJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTextJoin_Right(), this.getTextExpression(), null, "right", null, 0, 1, TextJoin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textLiteralEClass, TextLiteral.class, "TextLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, TextLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LilPackageImpl
