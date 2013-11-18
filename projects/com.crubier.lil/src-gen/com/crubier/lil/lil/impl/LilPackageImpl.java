/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.Actor;
import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.AlwaysEffect;
import com.crubier.lil.lil.Behavior;
import com.crubier.lil.lil.Cause;
import com.crubier.lil.lil.Component;
import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeCompound;
import com.crubier.lil.lil.DataTypeCompoundField;
import com.crubier.lil.lil.DefinitionSet;
import com.crubier.lil.lil.Effect;
import com.crubier.lil.lil.Entity;
import com.crubier.lil.lil.EnumDefinitionSet;
import com.crubier.lil.lil.Interactor;
import com.crubier.lil.lil.LilFactory;
import com.crubier.lil.lil.LilModel;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.NumberDefinitionInterval;
import com.crubier.lil.lil.NumberDefinitionSet;
import com.crubier.lil.lil.OnCause;
import com.crubier.lil.lil.SetEffect;
import com.crubier.lil.lil.Signal;
import com.crubier.lil.lil.SignalAlias;
import com.crubier.lil.lil.SignalEmission;
import com.crubier.lil.lil.SignalReception;
import com.crubier.lil.lil.TriggerEffect;
import com.crubier.lil.lil.WhenCause;
import com.crubier.lil.lil.XBinaryOperation;
import com.crubier.lil.lil.XBooleanLiteral;
import com.crubier.lil.lil.XCasePart;
import com.crubier.lil.lil.XCollectionLiteral;
import com.crubier.lil.lil.XEnumElement;
import com.crubier.lil.lil.XEnumLiteral;
import com.crubier.lil.lil.XExpression;
import com.crubier.lil.lil.XForEachExpression;
import com.crubier.lil.lil.XFunctionCallExpression;
import com.crubier.lil.lil.XIfExpression;
import com.crubier.lil.lil.XListLiteral;
import com.crubier.lil.lil.XNullLiteral;
import com.crubier.lil.lil.XNumberLiteral;
import com.crubier.lil.lil.XSetLiteral;
import com.crubier.lil.lil.XSignalLiteral;
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
  private EClass interactorEClass = null;

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
  private EClass actorAliasEClass = null;

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
  private EClass signalReceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalEmissionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalAliasEClass = null;

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
  private EClass dataTypeCompoundEClass = null;

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
  private EClass behaviorEClass = null;

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
  private EClass xEnumElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumDefinitionSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberDefinitionSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberDefinitionIntervalEClass = null;

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
  private EClass xEnumLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xSignalLiteralEClass = null;

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
  public EClass getInteractor()
  {
    return interactorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteractor_Name()
  {
    return (EAttribute)interactorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractor_Entities()
  {
    return (EReference)interactorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractor_Signals()
  {
    return (EReference)interactorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractor_Behaviors()
  {
    return (EReference)interactorEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getEntity_Name()
  {
    return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
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
  public EReference getActorAlias_Alias()
  {
    return (EReference)actorAliasEClass.getEStructuralFeatures().get(1);
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
  public EReference getComponent_Interactor()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComponent_Actors()
  {
    return (EReference)componentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalReception()
  {
    return signalReceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalReception_Instance()
  {
    return (EReference)signalReceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalReception_Source()
  {
    return (EReference)signalReceptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignalReception_Init()
  {
    return (EAttribute)signalReceptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalEmission()
  {
    return signalEmissionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalEmission_Instance()
  {
    return (EReference)signalEmissionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalEmission_Destination()
  {
    return (EReference)signalEmissionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignal()
  {
    return signalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignal_Name()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignal_Type()
  {
    return (EReference)signalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignal_DefinitionSet()
  {
    return (EReference)signalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSignal_Mode()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignal_Source()
  {
    return (EReference)signalEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignal_Destinations()
  {
    return (EReference)signalEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinitionSet()
  {
    return definitionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalAlias()
  {
    return signalAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalAlias_Source()
  {
    return (EReference)signalAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalAlias_Alias()
  {
    return (EReference)signalAliasEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getDataType_Base()
  {
    return (EAttribute)dataTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataType_Compound()
  {
    return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getDataTypeCompound_Name()
  {
    return (EAttribute)dataTypeCompoundEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeCompound_Fields()
  {
    return (EReference)dataTypeCompoundEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getDataTypeCompoundField_Name()
  {
    return (EAttribute)dataTypeCompoundFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeCompoundField_Type()
  {
    return (EReference)dataTypeCompoundFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBehavior()
  {
    return behaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehavior_Cause()
  {
    return (EReference)behaviorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehavior_Effects()
  {
    return (EReference)behaviorEClass.getEStructuralFeatures().get(1);
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
  public EReference getEffect_Target()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEffect_Value()
  {
    return (EReference)effectEClass.getEStructuralFeatures().get(1);
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
  public EClass getSetEffect()
  {
    return setEffectEClass;
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
  public EClass getXEnumElement()
  {
    return xEnumElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumDefinitionSet()
  {
    return enumDefinitionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDefinitionSet_Elements()
  {
    return (EReference)enumDefinitionSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberDefinitionSet()
  {
    return numberDefinitionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberDefinitionSet_Elements()
  {
    return (EReference)numberDefinitionSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberDefinitionInterval()
  {
    return numberDefinitionIntervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberDefinitionInterval_Inf()
  {
    return (EReference)numberDefinitionIntervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumberDefinitionInterval_Sup()
  {
    return (EReference)numberDefinitionIntervalEClass.getEStructuralFeatures().get(1);
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
  public EClass getXEnumLiteral()
  {
    return xEnumLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXEnumLiteral_Element()
  {
    return (EReference)xEnumLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXEnumLiteral_Name()
  {
    return (EAttribute)xEnumLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXSignalLiteral()
  {
    return xSignalLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXSignalLiteral_Signal()
  {
    return (EReference)xSignalLiteralEClass.getEStructuralFeatures().get(0);
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

    interactorEClass = createEClass(INTERACTOR);
    createEAttribute(interactorEClass, INTERACTOR__NAME);
    createEReference(interactorEClass, INTERACTOR__ENTITIES);
    createEReference(interactorEClass, INTERACTOR__SIGNALS);
    createEReference(interactorEClass, INTERACTOR__BEHAVIORS);

    accessibleEntityEClass = createEClass(ACCESSIBLE_ENTITY);
    createEAttribute(accessibleEntityEClass, ACCESSIBLE_ENTITY__GENERIC);
    createEReference(accessibleEntityEClass, ACCESSIBLE_ENTITY__SPECIFIC);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);

    actorEClass = createEClass(ACTOR);

    actorAliasEClass = createEClass(ACTOR_ALIAS);
    createEReference(actorAliasEClass, ACTOR_ALIAS__SOURCE);
    createEReference(actorAliasEClass, ACTOR_ALIAS__ALIAS);

    componentEClass = createEClass(COMPONENT);
    createEReference(componentEClass, COMPONENT__INTERACTOR);
    createEReference(componentEClass, COMPONENT__ACTORS);

    signalReceptionEClass = createEClass(SIGNAL_RECEPTION);
    createEReference(signalReceptionEClass, SIGNAL_RECEPTION__INSTANCE);
    createEReference(signalReceptionEClass, SIGNAL_RECEPTION__SOURCE);
    createEAttribute(signalReceptionEClass, SIGNAL_RECEPTION__INIT);

    signalEmissionEClass = createEClass(SIGNAL_EMISSION);
    createEReference(signalEmissionEClass, SIGNAL_EMISSION__INSTANCE);
    createEReference(signalEmissionEClass, SIGNAL_EMISSION__DESTINATION);

    signalEClass = createEClass(SIGNAL);
    createEAttribute(signalEClass, SIGNAL__NAME);
    createEReference(signalEClass, SIGNAL__TYPE);
    createEReference(signalEClass, SIGNAL__DEFINITION_SET);
    createEAttribute(signalEClass, SIGNAL__MODE);
    createEReference(signalEClass, SIGNAL__SOURCE);
    createEReference(signalEClass, SIGNAL__DESTINATIONS);

    definitionSetEClass = createEClass(DEFINITION_SET);

    signalAliasEClass = createEClass(SIGNAL_ALIAS);
    createEReference(signalAliasEClass, SIGNAL_ALIAS__SOURCE);
    createEReference(signalAliasEClass, SIGNAL_ALIAS__ALIAS);

    dataTypeEClass = createEClass(DATA_TYPE);
    createEAttribute(dataTypeEClass, DATA_TYPE__BASE);
    createEReference(dataTypeEClass, DATA_TYPE__COMPOUND);

    dataTypeCompoundEClass = createEClass(DATA_TYPE_COMPOUND);
    createEAttribute(dataTypeCompoundEClass, DATA_TYPE_COMPOUND__NAME);
    createEReference(dataTypeCompoundEClass, DATA_TYPE_COMPOUND__FIELDS);

    dataTypeCompoundFieldEClass = createEClass(DATA_TYPE_COMPOUND_FIELD);
    createEAttribute(dataTypeCompoundFieldEClass, DATA_TYPE_COMPOUND_FIELD__NAME);
    createEReference(dataTypeCompoundFieldEClass, DATA_TYPE_COMPOUND_FIELD__TYPE);

    behaviorEClass = createEClass(BEHAVIOR);
    createEReference(behaviorEClass, BEHAVIOR__CAUSE);
    createEReference(behaviorEClass, BEHAVIOR__EFFECTS);

    causeEClass = createEClass(CAUSE);
    createEReference(causeEClass, CAUSE__GUARD);

    onCauseEClass = createEClass(ON_CAUSE);
    createEReference(onCauseEClass, ON_CAUSE__EVENT);

    whenCauseEClass = createEClass(WHEN_CAUSE);
    createEReference(whenCauseEClass, WHEN_CAUSE__CONDITION);

    effectEClass = createEClass(EFFECT);
    createEReference(effectEClass, EFFECT__TARGET);
    createEReference(effectEClass, EFFECT__VALUE);

    alwaysEffectEClass = createEClass(ALWAYS_EFFECT);

    setEffectEClass = createEClass(SET_EFFECT);

    triggerEffectEClass = createEClass(TRIGGER_EFFECT);

    xExpressionEClass = createEClass(XEXPRESSION);

    xCollectionLiteralEClass = createEClass(XCOLLECTION_LITERAL);
    createEReference(xCollectionLiteralEClass, XCOLLECTION_LITERAL__ELEMENTS);

    xSetLiteralEClass = createEClass(XSET_LITERAL);

    xListLiteralEClass = createEClass(XLIST_LITERAL);

    xCasePartEClass = createEClass(XCASE_PART);
    createEReference(xCasePartEClass, XCASE_PART__CASE);
    createEReference(xCasePartEClass, XCASE_PART__THEN);

    xEnumElementEClass = createEClass(XENUM_ELEMENT);

    enumDefinitionSetEClass = createEClass(ENUM_DEFINITION_SET);
    createEReference(enumDefinitionSetEClass, ENUM_DEFINITION_SET__ELEMENTS);

    numberDefinitionSetEClass = createEClass(NUMBER_DEFINITION_SET);
    createEReference(numberDefinitionSetEClass, NUMBER_DEFINITION_SET__ELEMENTS);

    numberDefinitionIntervalEClass = createEClass(NUMBER_DEFINITION_INTERVAL);
    createEReference(numberDefinitionIntervalEClass, NUMBER_DEFINITION_INTERVAL__INF);
    createEReference(numberDefinitionIntervalEClass, NUMBER_DEFINITION_INTERVAL__SUP);

    xBinaryOperationEClass = createEClass(XBINARY_OPERATION);
    createEReference(xBinaryOperationEClass, XBINARY_OPERATION__LEFT_OPERAND);
    createEAttribute(xBinaryOperationEClass, XBINARY_OPERATION__FEATURE);
    createEReference(xBinaryOperationEClass, XBINARY_OPERATION__RIGHT_OPERAND);

    xUnaryOperationEClass = createEClass(XUNARY_OPERATION);
    createEAttribute(xUnaryOperationEClass, XUNARY_OPERATION__FEATURE);
    createEReference(xUnaryOperationEClass, XUNARY_OPERATION__OPERAND);

    xEnumLiteralEClass = createEClass(XENUM_LITERAL);
    createEReference(xEnumLiteralEClass, XENUM_LITERAL__ELEMENT);
    createEAttribute(xEnumLiteralEClass, XENUM_LITERAL__NAME);

    xSignalLiteralEClass = createEClass(XSIGNAL_LITERAL);
    createEReference(xSignalLiteralEClass, XSIGNAL_LITERAL__SIGNAL);

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
    actorEClass.getESuperTypes().add(this.getEntity());
    componentEClass.getESuperTypes().add(this.getEntity());
    onCauseEClass.getESuperTypes().add(this.getCause());
    whenCauseEClass.getESuperTypes().add(this.getCause());
    alwaysEffectEClass.getESuperTypes().add(this.getEffect());
    setEffectEClass.getESuperTypes().add(this.getEffect());
    triggerEffectEClass.getESuperTypes().add(this.getEffect());
    xCollectionLiteralEClass.getESuperTypes().add(this.getXExpression());
    xSetLiteralEClass.getESuperTypes().add(this.getXCollectionLiteral());
    xListLiteralEClass.getESuperTypes().add(this.getXCollectionLiteral());
    enumDefinitionSetEClass.getESuperTypes().add(this.getDefinitionSet());
    numberDefinitionSetEClass.getESuperTypes().add(this.getDefinitionSet());
    numberDefinitionIntervalEClass.getESuperTypes().add(this.getDefinitionSet());
    xBinaryOperationEClass.getESuperTypes().add(this.getXExpression());
    xUnaryOperationEClass.getESuperTypes().add(this.getXExpression());
    xEnumLiteralEClass.getESuperTypes().add(this.getXExpression());
    xEnumLiteralEClass.getESuperTypes().add(this.getXEnumElement());
    xSignalLiteralEClass.getESuperTypes().add(this.getXExpression());
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
    initEReference(getLilModel_Interactors(), this.getInteractor(), null, "interactors", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLilModel_DataTypes(), this.getDataTypeCompound(), null, "dataTypes", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorEClass, Interactor.class, "Interactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteractor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractor_Entities(), this.getEntity(), null, "entities", null, 0, -1, Interactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractor_Signals(), this.getSignal(), null, "signals", null, 0, -1, Interactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractor_Behaviors(), this.getBehavior(), null, "behaviors", null, 0, -1, Interactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accessibleEntityEClass, AccessibleEntity.class, "AccessibleEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAccessibleEntity_Generic(), ecorePackage.getEString(), "generic", null, 0, 1, AccessibleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccessibleEntity_Specific(), this.getEntity(), null, "specific", null, 0, 1, AccessibleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actorAliasEClass, ActorAlias.class, "ActorAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActorAlias_Source(), this.getActor(), null, "source", null, 0, 1, ActorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActorAlias_Alias(), this.getActor(), null, "alias", null, 0, 1, ActorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComponent_Interactor(), this.getInteractor(), null, "interactor", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComponent_Actors(), this.getActorAlias(), null, "actors", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalReceptionEClass, SignalReception.class, "SignalReception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalReception_Instance(), this.getSignal(), null, "instance", null, 0, 1, SignalReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignalReception_Source(), this.getSignalAlias(), null, "source", null, 0, 1, SignalReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignalReception_Init(), ecorePackage.getEBoolean(), "init", null, 0, 1, SignalReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalEmissionEClass, SignalEmission.class, "SignalEmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalEmission_Instance(), this.getSignal(), null, "instance", null, 0, 1, SignalEmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignalEmission_Destination(), this.getSignalAlias(), null, "destination", null, 0, 1, SignalEmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSignal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignal_Type(), this.getDataType(), null, "type", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignal_DefinitionSet(), this.getDefinitionSet(), null, "definitionSet", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSignal_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignal_Source(), this.getSignalAlias(), null, "source", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignal_Destinations(), this.getSignalAlias(), null, "destinations", null, 0, -1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionSetEClass, DefinitionSet.class, "DefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(signalAliasEClass, SignalAlias.class, "SignalAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalAlias_Source(), this.getAccessibleEntity(), null, "source", null, 0, 1, SignalAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignalAlias_Alias(), this.getSignal(), null, "alias", null, 0, 1, SignalAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataType_Base(), ecorePackage.getEString(), "base", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataType_Compound(), this.getDataTypeCompound(), null, "compound", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeCompoundEClass, DataTypeCompound.class, "DataTypeCompound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeCompound_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeCompound_Fields(), this.getDataTypeCompoundField(), null, "fields", null, 0, -1, DataTypeCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeCompoundFieldEClass, DataTypeCompoundField.class, "DataTypeCompoundField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeCompoundField_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeCompoundField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeCompoundField_Type(), this.getDataType(), null, "type", null, 0, 1, DataTypeCompoundField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBehavior_Cause(), this.getCause(), null, "cause", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBehavior_Effects(), this.getEffect(), null, "effects", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(causeEClass, Cause.class, "Cause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCause_Guard(), this.getXExpression(), null, "guard", null, 0, 1, Cause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onCauseEClass, OnCause.class, "OnCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOnCause_Event(), this.getSignalReception(), null, "event", null, 0, 1, OnCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenCauseEClass, WhenCause.class, "WhenCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenCause_Condition(), this.getXExpression(), null, "condition", null, 0, 1, WhenCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEffect_Target(), this.getSignalEmission(), null, "target", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEffect_Value(), this.getXExpression(), null, "value", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alwaysEffectEClass, AlwaysEffect.class, "AlwaysEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setEffectEClass, SetEffect.class, "SetEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(triggerEffectEClass, TriggerEffect.class, "TriggerEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xExpressionEClass, XExpression.class, "XExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xCollectionLiteralEClass, XCollectionLiteral.class, "XCollectionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXCollectionLiteral_Elements(), this.getXExpression(), null, "elements", null, 0, -1, XCollectionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xSetLiteralEClass, XSetLiteral.class, "XSetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xListLiteralEClass, XListLiteral.class, "XListLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(xCasePartEClass, XCasePart.class, "XCasePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXCasePart_Case(), this.getXExpression(), null, "case", null, 0, 1, XCasePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXCasePart_Then(), this.getXExpression(), null, "then", null, 0, 1, XCasePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xEnumElementEClass, XEnumElement.class, "XEnumElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumDefinitionSetEClass, EnumDefinitionSet.class, "EnumDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumDefinitionSet_Elements(), this.getXEnumElement(), null, "elements", null, 0, -1, EnumDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberDefinitionSetEClass, NumberDefinitionSet.class, "NumberDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberDefinitionSet_Elements(), this.getXExpression(), null, "elements", null, 0, -1, NumberDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberDefinitionIntervalEClass, NumberDefinitionInterval.class, "NumberDefinitionInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberDefinitionInterval_Inf(), this.getXExpression(), null, "inf", null, 0, 1, NumberDefinitionInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberDefinitionInterval_Sup(), this.getXExpression(), null, "sup", null, 0, 1, NumberDefinitionInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBinaryOperationEClass, XBinaryOperation.class, "XBinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXBinaryOperation_LeftOperand(), this.getXExpression(), null, "leftOperand", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXBinaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXBinaryOperation_RightOperand(), this.getXExpression(), null, "rightOperand", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xUnaryOperationEClass, XUnaryOperation.class, "XUnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getXUnaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXUnaryOperation_Operand(), this.getXExpression(), null, "operand", null, 0, 1, XUnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xEnumLiteralEClass, XEnumLiteral.class, "XEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXEnumLiteral_Element(), this.getXEnumElement(), null, "element", null, 0, 1, XEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXEnumLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, XEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xSignalLiteralEClass, XSignalLiteral.class, "XSignalLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXSignalLiteral_Signal(), this.getSignal(), null, "signal", null, 0, 1, XSignalLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
