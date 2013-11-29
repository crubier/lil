/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.Actor;
import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.AlwaysEffect;
import com.crubier.lil.lil.Behavior;
import com.crubier.lil.lil.BooleanLiteral;
import com.crubier.lil.lil.CasePart;
import com.crubier.lil.lil.Cause;
import com.crubier.lil.lil.CollectionLiteral;
import com.crubier.lil.lil.Component;
import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeBase;
import com.crubier.lil.lil.DataTypeCollection;
import com.crubier.lil.lil.DataTypeCompound;
import com.crubier.lil.lil.DataTypeDefinition;
import com.crubier.lil.lil.DataTypeStructure;
import com.crubier.lil.lil.DataTypeStructureField;
import com.crubier.lil.lil.DefinitionSet;
import com.crubier.lil.lil.Effect;
import com.crubier.lil.lil.Entity;
import com.crubier.lil.lil.EnumDefinitionSet;
import com.crubier.lil.lil.EnumElement;
import com.crubier.lil.lil.EnumLiteral;
import com.crubier.lil.lil.Expression;
import com.crubier.lil.lil.ForEachExpression;
import com.crubier.lil.lil.FunctionCallExpression;
import com.crubier.lil.lil.IfExpression;
import com.crubier.lil.lil.Interactor;
import com.crubier.lil.lil.LilFactory;
import com.crubier.lil.lil.LilModel;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.ListLiteral;
import com.crubier.lil.lil.NullLiteral;
import com.crubier.lil.lil.NumberDefinitionInterval;
import com.crubier.lil.lil.NumberDefinitionSet;
import com.crubier.lil.lil.NumberLiteral;
import com.crubier.lil.lil.OnCause;
import com.crubier.lil.lil.SetEffect;
import com.crubier.lil.lil.SetLiteral;
import com.crubier.lil.lil.Signal;
import com.crubier.lil.lil.SignalAlias;
import com.crubier.lil.lil.SignalEmission;
import com.crubier.lil.lil.SignalLiteral;
import com.crubier.lil.lil.SignalReception;
import com.crubier.lil.lil.StringLiteral;
import com.crubier.lil.lil.SwitchExpression;
import com.crubier.lil.lil.TimeLiteral;
import com.crubier.lil.lil.TimeLiteralNow;
import com.crubier.lil.lil.TriggerEffect;
import com.crubier.lil.lil.UnaryOperation;
import com.crubier.lil.lil.WhenCause;
import com.crubier.lil.lil.XBinaryOperation;

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
  private EClass dataTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeStructureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeStructureFieldEClass = null;

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
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass collectionLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass casePartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumElementEClass = null;

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
  private EClass dataTypeBaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeCollectionEClass = null;

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
  private EClass xBinaryOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass signalLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass forEachExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionCallExpressionEClass = null;

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
  private EClass nullLiteralEClass = null;

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
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeLiteralNowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass timeLiteralEClass = null;

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
  public EAttribute getSignal_Mode()
  {
    return (EAttribute)signalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignal_Source()
  {
    return (EReference)signalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignal_Destinations()
  {
    return (EReference)signalEClass.getEStructuralFeatures().get(4);
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
  public EClass getDataTypeDefinition()
  {
    return dataTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeStructure()
  {
    return dataTypeStructureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeStructure_Name()
  {
    return (EAttribute)dataTypeStructureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeStructure_Fields()
  {
    return (EReference)dataTypeStructureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeStructureField()
  {
    return dataTypeStructureFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeStructureField_Name()
  {
    return (EAttribute)dataTypeStructureFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeStructureField_Type()
  {
    return (EReference)dataTypeStructureFieldEClass.getEStructuralFeatures().get(1);
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
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCollectionLiteral()
  {
    return collectionLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCollectionLiteral_Elements()
  {
    return (EReference)collectionLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetLiteral()
  {
    return setLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListLiteral()
  {
    return listLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCasePart()
  {
    return casePartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCasePart_Case()
  {
    return (EReference)casePartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCasePart_Then()
  {
    return (EReference)casePartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumElement()
  {
    return enumElementEClass;
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
  public EReference getDataTypeBase_DefinitionSet()
  {
    return (EReference)dataTypeBaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeCollection()
  {
    return dataTypeCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeCollection_Mode()
  {
    return (EAttribute)dataTypeCollectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeCollection_Type()
  {
    return (EReference)dataTypeCollectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeCollection_DefinitionSet()
  {
    return (EReference)dataTypeCollectionEClass.getEStructuralFeatures().get(2);
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
  public EReference getDataTypeCompound_Compound()
  {
    return (EReference)dataTypeCompoundEClass.getEStructuralFeatures().get(0);
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
  public EClass getUnaryOperation()
  {
    return unaryOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryOperation_Feature()
  {
    return (EAttribute)unaryOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryOperation_Operand()
  {
    return (EReference)unaryOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumLiteral()
  {
    return enumLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumLiteral_Element()
  {
    return (EReference)enumLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumLiteral_Name()
  {
    return (EAttribute)enumLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSignalLiteral()
  {
    return signalLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSignalLiteral_Signal()
  {
    return (EReference)signalLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfExpression()
  {
    return ifExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfExpression_If()
  {
    return (EReference)ifExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfExpression_Then()
  {
    return (EReference)ifExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfExpression_Else()
  {
    return (EReference)ifExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitchExpression()
  {
    return switchExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchExpression_Switch()
  {
    return (EReference)switchExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchExpression_Cases()
  {
    return (EReference)switchExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitchExpression_Default()
  {
    return (EReference)switchExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForEachExpression()
  {
    return forEachExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForEachExpression_ForExpression()
  {
    return (EReference)forEachExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getForEachExpression_EachExpression()
  {
    return (EReference)forEachExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionCallExpression()
  {
    return functionCallExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionCallExpression_Function()
  {
    return (EAttribute)functionCallExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionCallExpression_Arguments()
  {
    return (EReference)functionCallExpressionEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getBooleanLiteral_IsTrue()
  {
    return (EAttribute)booleanLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullLiteral()
  {
    return nullLiteralEClass;
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
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeLiteralNow()
  {
    return timeLiteralNowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTimeLiteral()
  {
    return timeLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeLiteral_Year()
  {
    return (EAttribute)timeLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeLiteral_Month()
  {
    return (EAttribute)timeLiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeLiteral_Day()
  {
    return (EAttribute)timeLiteralEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeLiteral_Hour()
  {
    return (EAttribute)timeLiteralEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeLiteral_Minute()
  {
    return (EAttribute)timeLiteralEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTimeLiteral_Second()
  {
    return (EAttribute)timeLiteralEClass.getEStructuralFeatures().get(5);
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
    createEAttribute(signalEClass, SIGNAL__MODE);
    createEReference(signalEClass, SIGNAL__SOURCE);
    createEReference(signalEClass, SIGNAL__DESTINATIONS);

    definitionSetEClass = createEClass(DEFINITION_SET);

    signalAliasEClass = createEClass(SIGNAL_ALIAS);
    createEReference(signalAliasEClass, SIGNAL_ALIAS__SOURCE);
    createEReference(signalAliasEClass, SIGNAL_ALIAS__ALIAS);

    dataTypeEClass = createEClass(DATA_TYPE);

    dataTypeDefinitionEClass = createEClass(DATA_TYPE_DEFINITION);

    dataTypeStructureEClass = createEClass(DATA_TYPE_STRUCTURE);
    createEAttribute(dataTypeStructureEClass, DATA_TYPE_STRUCTURE__NAME);
    createEReference(dataTypeStructureEClass, DATA_TYPE_STRUCTURE__FIELDS);

    dataTypeStructureFieldEClass = createEClass(DATA_TYPE_STRUCTURE_FIELD);
    createEAttribute(dataTypeStructureFieldEClass, DATA_TYPE_STRUCTURE_FIELD__NAME);
    createEReference(dataTypeStructureFieldEClass, DATA_TYPE_STRUCTURE_FIELD__TYPE);

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

    expressionEClass = createEClass(EXPRESSION);

    collectionLiteralEClass = createEClass(COLLECTION_LITERAL);
    createEReference(collectionLiteralEClass, COLLECTION_LITERAL__ELEMENTS);

    setLiteralEClass = createEClass(SET_LITERAL);

    listLiteralEClass = createEClass(LIST_LITERAL);

    casePartEClass = createEClass(CASE_PART);
    createEReference(casePartEClass, CASE_PART__CASE);
    createEReference(casePartEClass, CASE_PART__THEN);

    enumElementEClass = createEClass(ENUM_ELEMENT);

    enumDefinitionSetEClass = createEClass(ENUM_DEFINITION_SET);
    createEReference(enumDefinitionSetEClass, ENUM_DEFINITION_SET__ELEMENTS);

    numberDefinitionSetEClass = createEClass(NUMBER_DEFINITION_SET);
    createEReference(numberDefinitionSetEClass, NUMBER_DEFINITION_SET__ELEMENTS);

    numberDefinitionIntervalEClass = createEClass(NUMBER_DEFINITION_INTERVAL);
    createEReference(numberDefinitionIntervalEClass, NUMBER_DEFINITION_INTERVAL__INF);
    createEReference(numberDefinitionIntervalEClass, NUMBER_DEFINITION_INTERVAL__SUP);

    dataTypeBaseEClass = createEClass(DATA_TYPE_BASE);
    createEAttribute(dataTypeBaseEClass, DATA_TYPE_BASE__TYPE);
    createEReference(dataTypeBaseEClass, DATA_TYPE_BASE__DEFINITION_SET);

    dataTypeCollectionEClass = createEClass(DATA_TYPE_COLLECTION);
    createEAttribute(dataTypeCollectionEClass, DATA_TYPE_COLLECTION__MODE);
    createEReference(dataTypeCollectionEClass, DATA_TYPE_COLLECTION__TYPE);
    createEReference(dataTypeCollectionEClass, DATA_TYPE_COLLECTION__DEFINITION_SET);

    dataTypeCompoundEClass = createEClass(DATA_TYPE_COMPOUND);
    createEReference(dataTypeCompoundEClass, DATA_TYPE_COMPOUND__COMPOUND);

    xBinaryOperationEClass = createEClass(XBINARY_OPERATION);
    createEReference(xBinaryOperationEClass, XBINARY_OPERATION__LEFT_OPERAND);
    createEAttribute(xBinaryOperationEClass, XBINARY_OPERATION__FEATURE);
    createEReference(xBinaryOperationEClass, XBINARY_OPERATION__RIGHT_OPERAND);

    unaryOperationEClass = createEClass(UNARY_OPERATION);
    createEAttribute(unaryOperationEClass, UNARY_OPERATION__FEATURE);
    createEReference(unaryOperationEClass, UNARY_OPERATION__OPERAND);

    enumLiteralEClass = createEClass(ENUM_LITERAL);
    createEReference(enumLiteralEClass, ENUM_LITERAL__ELEMENT);
    createEAttribute(enumLiteralEClass, ENUM_LITERAL__NAME);

    signalLiteralEClass = createEClass(SIGNAL_LITERAL);
    createEReference(signalLiteralEClass, SIGNAL_LITERAL__SIGNAL);

    ifExpressionEClass = createEClass(IF_EXPRESSION);
    createEReference(ifExpressionEClass, IF_EXPRESSION__IF);
    createEReference(ifExpressionEClass, IF_EXPRESSION__THEN);
    createEReference(ifExpressionEClass, IF_EXPRESSION__ELSE);

    switchExpressionEClass = createEClass(SWITCH_EXPRESSION);
    createEReference(switchExpressionEClass, SWITCH_EXPRESSION__SWITCH);
    createEReference(switchExpressionEClass, SWITCH_EXPRESSION__CASES);
    createEReference(switchExpressionEClass, SWITCH_EXPRESSION__DEFAULT);

    forEachExpressionEClass = createEClass(FOR_EACH_EXPRESSION);
    createEReference(forEachExpressionEClass, FOR_EACH_EXPRESSION__FOR_EXPRESSION);
    createEReference(forEachExpressionEClass, FOR_EACH_EXPRESSION__EACH_EXPRESSION);

    functionCallExpressionEClass = createEClass(FUNCTION_CALL_EXPRESSION);
    createEAttribute(functionCallExpressionEClass, FUNCTION_CALL_EXPRESSION__FUNCTION);
    createEReference(functionCallExpressionEClass, FUNCTION_CALL_EXPRESSION__ARGUMENTS);

    booleanLiteralEClass = createEClass(BOOLEAN_LITERAL);
    createEAttribute(booleanLiteralEClass, BOOLEAN_LITERAL__IS_TRUE);

    nullLiteralEClass = createEClass(NULL_LITERAL);

    numberLiteralEClass = createEClass(NUMBER_LITERAL);
    createEAttribute(numberLiteralEClass, NUMBER_LITERAL__VALUE);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    timeLiteralNowEClass = createEClass(TIME_LITERAL_NOW);

    timeLiteralEClass = createEClass(TIME_LITERAL);
    createEAttribute(timeLiteralEClass, TIME_LITERAL__YEAR);
    createEAttribute(timeLiteralEClass, TIME_LITERAL__MONTH);
    createEAttribute(timeLiteralEClass, TIME_LITERAL__DAY);
    createEAttribute(timeLiteralEClass, TIME_LITERAL__HOUR);
    createEAttribute(timeLiteralEClass, TIME_LITERAL__MINUTE);
    createEAttribute(timeLiteralEClass, TIME_LITERAL__SECOND);
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
    dataTypeStructureEClass.getESuperTypes().add(this.getDataTypeDefinition());
    onCauseEClass.getESuperTypes().add(this.getCause());
    whenCauseEClass.getESuperTypes().add(this.getCause());
    alwaysEffectEClass.getESuperTypes().add(this.getEffect());
    setEffectEClass.getESuperTypes().add(this.getEffect());
    triggerEffectEClass.getESuperTypes().add(this.getEffect());
    collectionLiteralEClass.getESuperTypes().add(this.getExpression());
    setLiteralEClass.getESuperTypes().add(this.getCollectionLiteral());
    listLiteralEClass.getESuperTypes().add(this.getCollectionLiteral());
    enumDefinitionSetEClass.getESuperTypes().add(this.getDefinitionSet());
    numberDefinitionSetEClass.getESuperTypes().add(this.getDefinitionSet());
    numberDefinitionIntervalEClass.getESuperTypes().add(this.getDefinitionSet());
    dataTypeBaseEClass.getESuperTypes().add(this.getDataType());
    dataTypeCollectionEClass.getESuperTypes().add(this.getDataType());
    dataTypeCompoundEClass.getESuperTypes().add(this.getDataType());
    xBinaryOperationEClass.getESuperTypes().add(this.getExpression());
    unaryOperationEClass.getESuperTypes().add(this.getExpression());
    enumLiteralEClass.getESuperTypes().add(this.getExpression());
    enumLiteralEClass.getESuperTypes().add(this.getEnumElement());
    signalLiteralEClass.getESuperTypes().add(this.getExpression());
    ifExpressionEClass.getESuperTypes().add(this.getExpression());
    switchExpressionEClass.getESuperTypes().add(this.getExpression());
    forEachExpressionEClass.getESuperTypes().add(this.getExpression());
    functionCallExpressionEClass.getESuperTypes().add(this.getExpression());
    booleanLiteralEClass.getESuperTypes().add(this.getExpression());
    nullLiteralEClass.getESuperTypes().add(this.getExpression());
    numberLiteralEClass.getESuperTypes().add(this.getExpression());
    stringLiteralEClass.getESuperTypes().add(this.getExpression());
    timeLiteralNowEClass.getESuperTypes().add(this.getExpression());
    timeLiteralEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(lilModelEClass, LilModel.class, "LilModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLilModel_Interactors(), this.getInteractor(), null, "interactors", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLilModel_DataTypes(), this.getDataTypeDefinition(), null, "dataTypes", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
    initEAttribute(getSignal_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignal_Source(), this.getSignalAlias(), null, "source", null, 0, 1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignal_Destinations(), this.getSignalAlias(), null, "destinations", null, 0, -1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionSetEClass, DefinitionSet.class, "DefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(signalAliasEClass, SignalAlias.class, "SignalAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalAlias_Source(), this.getAccessibleEntity(), null, "source", null, 0, 1, SignalAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSignalAlias_Alias(), this.getSignal(), null, "alias", null, 0, 1, SignalAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeDefinitionEClass, DataTypeDefinition.class, "DataTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeStructureEClass, DataTypeStructure.class, "DataTypeStructure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeStructure_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeStructure_Fields(), this.getDataTypeStructureField(), null, "fields", null, 0, -1, DataTypeStructure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeStructureFieldEClass, DataTypeStructureField.class, "DataTypeStructureField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeStructureField_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeStructureField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeStructureField_Type(), this.getDataType(), null, "type", null, 0, 1, DataTypeStructureField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(behaviorEClass, Behavior.class, "Behavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBehavior_Cause(), this.getCause(), null, "cause", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBehavior_Effects(), this.getEffect(), null, "effects", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(causeEClass, Cause.class, "Cause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCause_Guard(), this.getExpression(), null, "guard", null, 0, 1, Cause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onCauseEClass, OnCause.class, "OnCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOnCause_Event(), this.getSignalReception(), null, "event", null, 0, 1, OnCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(whenCauseEClass, WhenCause.class, "WhenCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhenCause_Condition(), this.getExpression(), null, "condition", null, 0, 1, WhenCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEffect_Target(), this.getSignalEmission(), null, "target", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEffect_Value(), this.getExpression(), null, "value", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alwaysEffectEClass, AlwaysEffect.class, "AlwaysEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setEffectEClass, SetEffect.class, "SetEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(triggerEffectEClass, TriggerEffect.class, "TriggerEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(collectionLiteralEClass, CollectionLiteral.class, "CollectionLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCollectionLiteral_Elements(), this.getExpression(), null, "elements", null, 0, -1, CollectionLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(setLiteralEClass, SetLiteral.class, "SetLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listLiteralEClass, ListLiteral.class, "ListLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(casePartEClass, CasePart.class, "CasePart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCasePart_Case(), this.getExpression(), null, "case", null, 0, 1, CasePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCasePart_Then(), this.getExpression(), null, "then", null, 0, 1, CasePart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumElementEClass, EnumElement.class, "EnumElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumDefinitionSetEClass, EnumDefinitionSet.class, "EnumDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumDefinitionSet_Elements(), this.getEnumElement(), null, "elements", null, 0, -1, EnumDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberDefinitionSetEClass, NumberDefinitionSet.class, "NumberDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberDefinitionSet_Elements(), this.getExpression(), null, "elements", null, 0, -1, NumberDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberDefinitionIntervalEClass, NumberDefinitionInterval.class, "NumberDefinitionInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNumberDefinitionInterval_Inf(), this.getExpression(), null, "inf", null, 0, 1, NumberDefinitionInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumberDefinitionInterval_Sup(), this.getExpression(), null, "sup", null, 0, 1, NumberDefinitionInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeBaseEClass, DataTypeBase.class, "DataTypeBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeBase_Type(), ecorePackage.getEString(), "type", null, 0, 1, DataTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeBase_DefinitionSet(), this.getDefinitionSet(), null, "definitionSet", null, 0, 1, DataTypeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeCollectionEClass, DataTypeCollection.class, "DataTypeCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeCollection_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, DataTypeCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeCollection_Type(), this.getDataType(), null, "type", null, 0, 1, DataTypeCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeCollection_DefinitionSet(), this.getDefinitionSet(), null, "definitionSet", null, 0, 1, DataTypeCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeCompoundEClass, DataTypeCompound.class, "DataTypeCompound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeCompound_Compound(), this.getDataTypeStructure(), null, "compound", null, 0, 1, DataTypeCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xBinaryOperationEClass, XBinaryOperation.class, "XBinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXBinaryOperation_LeftOperand(), this.getExpression(), null, "leftOperand", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXBinaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXBinaryOperation_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, XBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryOperationEClass, UnaryOperation.class, "UnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryOperation_Operand(), this.getExpression(), null, "operand", null, 0, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumLiteral_Element(), this.getEnumElement(), null, "element", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(signalLiteralEClass, SignalLiteral.class, "SignalLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSignalLiteral_Signal(), this.getSignal(), null, "signal", null, 0, 1, SignalLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifExpressionEClass, IfExpression.class, "IfExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfExpression_If(), this.getExpression(), null, "if", null, 0, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfExpression_Then(), this.getExpression(), null, "then", null, 0, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfExpression_Else(), this.getExpression(), null, "else", null, 0, 1, IfExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchExpressionEClass, SwitchExpression.class, "SwitchExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitchExpression_Switch(), this.getExpression(), null, "switch", null, 0, 1, SwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitchExpression_Cases(), this.getCasePart(), null, "cases", null, 0, -1, SwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitchExpression_Default(), this.getExpression(), null, "default", null, 0, 1, SwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(forEachExpressionEClass, ForEachExpression.class, "ForEachExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getForEachExpression_ForExpression(), this.getExpression(), null, "forExpression", null, 0, 1, ForEachExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getForEachExpression_EachExpression(), this.getExpression(), null, "eachExpression", null, 0, 1, ForEachExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionCallExpressionEClass, FunctionCallExpression.class, "FunctionCallExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionCallExpression_Function(), ecorePackage.getEString(), "function", null, 0, 1, FunctionCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionCallExpression_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, FunctionCallExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanLiteralEClass, BooleanLiteral.class, "BooleanLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanLiteral_IsTrue(), ecorePackage.getEBoolean(), "isTrue", null, 0, 1, BooleanLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberLiteral_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(timeLiteralNowEClass, TimeLiteralNow.class, "TimeLiteralNow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(timeLiteralEClass, TimeLiteral.class, "TimeLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTimeLiteral_Year(), ecorePackage.getEDouble(), "year", null, 0, 1, TimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeLiteral_Month(), ecorePackage.getEDouble(), "month", null, 0, 1, TimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeLiteral_Day(), ecorePackage.getEDouble(), "day", null, 0, 1, TimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeLiteral_Hour(), ecorePackage.getEDouble(), "hour", null, 0, 1, TimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeLiteral_Minute(), ecorePackage.getEDouble(), "minute", null, 0, 1, TimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTimeLiteral_Second(), ecorePackage.getEDouble(), "second", null, 0, 1, TimeLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LilPackageImpl
