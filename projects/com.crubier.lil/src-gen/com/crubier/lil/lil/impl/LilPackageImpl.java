/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.ActorComponent;
import com.crubier.lil.lil.ActorType;
import com.crubier.lil.lil.ActorTypeDefinition;
import com.crubier.lil.lil.DataCollectionType;
import com.crubier.lil.lil.DataComponent;
import com.crubier.lil.lil.DataDefinitionEnumElement;
import com.crubier.lil.lil.DataDefinitionSet;
import com.crubier.lil.lil.DataDefinitionSetEnum;
import com.crubier.lil.lil.DataDefinitionSetInterval;
import com.crubier.lil.lil.DataDefinitionSetNumber;
import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeDefinition;
import com.crubier.lil.lil.DataTypeDefinitionAlias;
import com.crubier.lil.lil.DataTypeDefinitionCompound;
import com.crubier.lil.lil.Entity;
import com.crubier.lil.lil.Expression;
import com.crubier.lil.lil.ExpressionBinaryOperation;
import com.crubier.lil.lil.ExpressionCase;
import com.crubier.lil.lil.ExpressionForEach;
import com.crubier.lil.lil.ExpressionFunctionCall;
import com.crubier.lil.lil.ExpressionIf;
import com.crubier.lil.lil.ExpressionLiteralCollection;
import com.crubier.lil.lil.ExpressionLiteralList;
import com.crubier.lil.lil.ExpressionLiteralSet;
import com.crubier.lil.lil.ExpressionSwitch;
import com.crubier.lil.lil.InteractorActor;
import com.crubier.lil.lil.InteractorBehavior;
import com.crubier.lil.lil.InteractorBehaviorAlwaysEffect;
import com.crubier.lil.lil.InteractorBehaviorCause;
import com.crubier.lil.lil.InteractorBehaviorEffect;
import com.crubier.lil.lil.InteractorBehaviorOnCause;
import com.crubier.lil.lil.InteractorBehaviorSetEffect;
import com.crubier.lil.lil.InteractorBehaviorTriggerEffect;
import com.crubier.lil.lil.InteractorBehaviorWhenCause;
import com.crubier.lil.lil.InteractorComponent;
import com.crubier.lil.lil.InteractorData;
import com.crubier.lil.lil.InteractorSignalAlias;
import com.crubier.lil.lil.InteractorSignalEmission;
import com.crubier.lil.lil.InteractorSignalReception;
import com.crubier.lil.lil.InteractorType;
import com.crubier.lil.lil.InteractorTypeDefinition;
import com.crubier.lil.lil.LilFactory;
import com.crubier.lil.lil.LilModel;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.LiteralBoolean;
import com.crubier.lil.lil.LiteralData;
import com.crubier.lil.lil.LiteralEnum;
import com.crubier.lil.lil.LiteralNull;
import com.crubier.lil.lil.LiteralNumber;
import com.crubier.lil.lil.LiteralString;
import com.crubier.lil.lil.LiteralTime;
import com.crubier.lil.lil.UnaryOperation;

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
  private EClass actorTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorComponentEClass = null;

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
  private EClass dataTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataDefinitionSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataDefinitionEnumElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataCollectionTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataComponentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorTypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorActorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorSignalAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorComponentEClass = null;

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
  private EClass actorAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorSignalReceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorSignalEmissionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorCauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorOnCauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorWhenCauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorAlwaysEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorSetEffectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorTriggerEffectEClass = null;

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
  private EClass expressionLiteralCollectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionLiteralSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionLiteralListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionCaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeDefinitionCompoundEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeDefinitionAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataDefinitionSetEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataDefinitionSetNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataDefinitionSetIntervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionBinaryOperationEClass = null;

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
  private EClass literalDataEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionIfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionSwitchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionForEachEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionFunctionCallEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalBooleanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalNullEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEnumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalTimeEClass = null;

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
  public EReference getLilModel_ActorType()
  {
    return (EReference)lilModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLilModel_DataType()
  {
    return (EReference)lilModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLilModel_InteractorType()
  {
    return (EReference)lilModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorTypeDefinition()
  {
    return actorTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorTypeDefinition_Name()
  {
    return (EAttribute)actorTypeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorTypeDefinition_Component()
  {
    return (EReference)actorTypeDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorType()
  {
    return actorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorType_Base()
  {
    return (EAttribute)actorTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorType_Custom()
  {
    return (EReference)actorTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorComponent()
  {
    return actorComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorComponent_Name()
  {
    return (EAttribute)actorComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorComponent_Type()
  {
    return (EReference)actorComponentEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getDataTypeDefinition_Name()
  {
    return (EAttribute)dataTypeDefinitionEClass.getEStructuralFeatures().get(0);
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
  public EReference getDataType_DefinitionSet()
  {
    return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataType_Custom()
  {
    return (EReference)dataTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataType_Collection()
  {
    return (EReference)dataTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataDefinitionSet()
  {
    return dataDefinitionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataDefinitionEnumElement()
  {
    return dataDefinitionEnumElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataDefinitionEnumElement_Name()
  {
    return (EAttribute)dataDefinitionEnumElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataCollectionType()
  {
    return dataCollectionTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataCollectionType_Type()
  {
    return (EAttribute)dataCollectionTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataCollectionType_Mapping()
  {
    return (EReference)dataCollectionTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataComponent()
  {
    return dataComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataComponent_Name()
  {
    return (EAttribute)dataComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataComponent_Type()
  {
    return (EReference)dataComponentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorTypeDefinition()
  {
    return interactorTypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteractorTypeDefinition_Name()
  {
    return (EAttribute)interactorTypeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorTypeDefinition_Actor()
  {
    return (EReference)interactorTypeDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorTypeDefinition_Data()
  {
    return (EReference)interactorTypeDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorTypeDefinition_Component()
  {
    return (EReference)interactorTypeDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorTypeDefinition_Behavior()
  {
    return (EReference)interactorTypeDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorType()
  {
    return interactorTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorType_Custom()
  {
    return (EReference)interactorTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorActor()
  {
    return interactorActorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorActor_Type()
  {
    return (EReference)interactorActorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorData()
  {
    return interactorDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteractorData_Name()
  {
    return (EAttribute)interactorDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorData_Type()
  {
    return (EReference)interactorDataEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteractorData_Mode()
  {
    return (EAttribute)interactorDataEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorData_Source()
  {
    return (EReference)interactorDataEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorData_Destinations()
  {
    return (EReference)interactorDataEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorSignalAlias()
  {
    return interactorSignalAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorSignalAlias_Source()
  {
    return (EReference)interactorSignalAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorSignalAlias_Alias()
  {
    return (EReference)interactorSignalAliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorComponent()
  {
    return interactorComponentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorComponent_Type()
  {
    return (EReference)interactorComponentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorComponent_Actors()
  {
    return (EReference)interactorComponentEClass.getEStructuralFeatures().get(1);
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
  public EClass getInteractorSignalReception()
  {
    return interactorSignalReceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorSignalReception_Instance()
  {
    return (EReference)interactorSignalReceptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorSignalReception_Source()
  {
    return (EReference)interactorSignalReceptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteractorSignalReception_Init()
  {
    return (EAttribute)interactorSignalReceptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorSignalEmission()
  {
    return interactorSignalEmissionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorSignalEmission_Instance()
  {
    return (EReference)interactorSignalEmissionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorSignalEmission_Destination()
  {
    return (EReference)interactorSignalEmissionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehavior()
  {
    return interactorBehaviorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehavior_Cause()
  {
    return (EReference)interactorBehaviorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehavior_Effect()
  {
    return (EReference)interactorBehaviorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorCause()
  {
    return interactorBehaviorCauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehaviorCause_Guard()
  {
    return (EReference)interactorBehaviorCauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorOnCause()
  {
    return interactorBehaviorOnCauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehaviorOnCause_Event()
  {
    return (EReference)interactorBehaviorOnCauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorWhenCause()
  {
    return interactorBehaviorWhenCauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehaviorWhenCause_Condition()
  {
    return (EReference)interactorBehaviorWhenCauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorEffect()
  {
    return interactorBehaviorEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehaviorEffect_Target()
  {
    return (EReference)interactorBehaviorEffectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehaviorEffect_Value()
  {
    return (EReference)interactorBehaviorEffectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorAlwaysEffect()
  {
    return interactorBehaviorAlwaysEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorSetEffect()
  {
    return interactorBehaviorSetEffectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorTriggerEffect()
  {
    return interactorBehaviorTriggerEffectEClass;
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
  public EClass getExpressionLiteralCollection()
  {
    return expressionLiteralCollectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionLiteralCollection_Elements()
  {
    return (EReference)expressionLiteralCollectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionLiteralSet()
  {
    return expressionLiteralSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionLiteralList()
  {
    return expressionLiteralListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionCase()
  {
    return expressionCaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionCase_Case()
  {
    return (EReference)expressionCaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionCase_Then()
  {
    return (EReference)expressionCaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeDefinitionCompound()
  {
    return dataTypeDefinitionCompoundEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeDefinitionCompound_Component()
  {
    return (EReference)dataTypeDefinitionCompoundEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeDefinitionAlias()
  {
    return dataTypeDefinitionAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeDefinitionAlias_Alias()
  {
    return (EReference)dataTypeDefinitionAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataDefinitionSetEnum()
  {
    return dataDefinitionSetEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataDefinitionSetEnum_Element()
  {
    return (EReference)dataDefinitionSetEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataDefinitionSetNumber()
  {
    return dataDefinitionSetNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataDefinitionSetNumber_Element()
  {
    return (EReference)dataDefinitionSetNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataDefinitionSetInterval()
  {
    return dataDefinitionSetIntervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataDefinitionSetInterval_Inf()
  {
    return (EReference)dataDefinitionSetIntervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataDefinitionSetInterval_Sup()
  {
    return (EReference)dataDefinitionSetIntervalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionBinaryOperation()
  {
    return expressionBinaryOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionBinaryOperation_LeftOperand()
  {
    return (EReference)expressionBinaryOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionBinaryOperation_Feature()
  {
    return (EAttribute)expressionBinaryOperationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionBinaryOperation_RightOperand()
  {
    return (EReference)expressionBinaryOperationEClass.getEStructuralFeatures().get(2);
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
  public EClass getLiteralData()
  {
    return literalDataEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteralData_Data()
  {
    return (EReference)literalDataEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionIf()
  {
    return expressionIfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionIf_If()
  {
    return (EReference)expressionIfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionIf_Then()
  {
    return (EReference)expressionIfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionIf_Else()
  {
    return (EReference)expressionIfEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionSwitch()
  {
    return expressionSwitchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionSwitch_Switch()
  {
    return (EReference)expressionSwitchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionSwitch_Case()
  {
    return (EReference)expressionSwitchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionSwitch_Default()
  {
    return (EReference)expressionSwitchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionForEach()
  {
    return expressionForEachEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionForEach_ForExpression()
  {
    return (EReference)expressionForEachEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionForEach_EachExpression()
  {
    return (EReference)expressionForEachEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpressionFunctionCall()
  {
    return expressionFunctionCallEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpressionFunctionCall_Function()
  {
    return (EAttribute)expressionFunctionCallEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpressionFunctionCall_Arguments()
  {
    return (EReference)expressionFunctionCallEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralBoolean()
  {
    return literalBooleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralBoolean_IsTrue()
  {
    return (EAttribute)literalBooleanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralNull()
  {
    return literalNullEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralNumber()
  {
    return literalNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralNumber_Value()
  {
    return (EAttribute)literalNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralString()
  {
    return literalStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralString_Value()
  {
    return (EAttribute)literalStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralEnum()
  {
    return literalEnumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteralEnum_Value()
  {
    return (EReference)literalEnumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteralTime()
  {
    return literalTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Now()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Year()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Month()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Day()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Hour()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Minute()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Second()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(6);
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
    createEReference(lilModelEClass, LIL_MODEL__ACTOR_TYPE);
    createEReference(lilModelEClass, LIL_MODEL__DATA_TYPE);
    createEReference(lilModelEClass, LIL_MODEL__INTERACTOR_TYPE);

    actorTypeDefinitionEClass = createEClass(ACTOR_TYPE_DEFINITION);
    createEAttribute(actorTypeDefinitionEClass, ACTOR_TYPE_DEFINITION__NAME);
    createEReference(actorTypeDefinitionEClass, ACTOR_TYPE_DEFINITION__COMPONENT);

    actorTypeEClass = createEClass(ACTOR_TYPE);
    createEAttribute(actorTypeEClass, ACTOR_TYPE__BASE);
    createEReference(actorTypeEClass, ACTOR_TYPE__CUSTOM);

    actorComponentEClass = createEClass(ACTOR_COMPONENT);
    createEAttribute(actorComponentEClass, ACTOR_COMPONENT__NAME);
    createEReference(actorComponentEClass, ACTOR_COMPONENT__TYPE);

    dataTypeDefinitionEClass = createEClass(DATA_TYPE_DEFINITION);
    createEAttribute(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__NAME);

    dataTypeEClass = createEClass(DATA_TYPE);
    createEAttribute(dataTypeEClass, DATA_TYPE__BASE);
    createEReference(dataTypeEClass, DATA_TYPE__DEFINITION_SET);
    createEReference(dataTypeEClass, DATA_TYPE__CUSTOM);
    createEReference(dataTypeEClass, DATA_TYPE__COLLECTION);

    dataDefinitionSetEClass = createEClass(DATA_DEFINITION_SET);

    dataDefinitionEnumElementEClass = createEClass(DATA_DEFINITION_ENUM_ELEMENT);
    createEAttribute(dataDefinitionEnumElementEClass, DATA_DEFINITION_ENUM_ELEMENT__NAME);

    dataCollectionTypeEClass = createEClass(DATA_COLLECTION_TYPE);
    createEAttribute(dataCollectionTypeEClass, DATA_COLLECTION_TYPE__TYPE);
    createEReference(dataCollectionTypeEClass, DATA_COLLECTION_TYPE__MAPPING);

    dataComponentEClass = createEClass(DATA_COMPONENT);
    createEAttribute(dataComponentEClass, DATA_COMPONENT__NAME);
    createEReference(dataComponentEClass, DATA_COMPONENT__TYPE);

    interactorTypeDefinitionEClass = createEClass(INTERACTOR_TYPE_DEFINITION);
    createEAttribute(interactorTypeDefinitionEClass, INTERACTOR_TYPE_DEFINITION__NAME);
    createEReference(interactorTypeDefinitionEClass, INTERACTOR_TYPE_DEFINITION__ACTOR);
    createEReference(interactorTypeDefinitionEClass, INTERACTOR_TYPE_DEFINITION__DATA);
    createEReference(interactorTypeDefinitionEClass, INTERACTOR_TYPE_DEFINITION__COMPONENT);
    createEReference(interactorTypeDefinitionEClass, INTERACTOR_TYPE_DEFINITION__BEHAVIOR);

    interactorTypeEClass = createEClass(INTERACTOR_TYPE);
    createEReference(interactorTypeEClass, INTERACTOR_TYPE__CUSTOM);

    interactorActorEClass = createEClass(INTERACTOR_ACTOR);
    createEReference(interactorActorEClass, INTERACTOR_ACTOR__TYPE);

    interactorDataEClass = createEClass(INTERACTOR_DATA);
    createEAttribute(interactorDataEClass, INTERACTOR_DATA__NAME);
    createEReference(interactorDataEClass, INTERACTOR_DATA__TYPE);
    createEAttribute(interactorDataEClass, INTERACTOR_DATA__MODE);
    createEReference(interactorDataEClass, INTERACTOR_DATA__SOURCE);
    createEReference(interactorDataEClass, INTERACTOR_DATA__DESTINATIONS);

    interactorSignalAliasEClass = createEClass(INTERACTOR_SIGNAL_ALIAS);
    createEReference(interactorSignalAliasEClass, INTERACTOR_SIGNAL_ALIAS__SOURCE);
    createEReference(interactorSignalAliasEClass, INTERACTOR_SIGNAL_ALIAS__ALIAS);

    interactorComponentEClass = createEClass(INTERACTOR_COMPONENT);
    createEReference(interactorComponentEClass, INTERACTOR_COMPONENT__TYPE);
    createEReference(interactorComponentEClass, INTERACTOR_COMPONENT__ACTORS);

    accessibleEntityEClass = createEClass(ACCESSIBLE_ENTITY);
    createEAttribute(accessibleEntityEClass, ACCESSIBLE_ENTITY__GENERIC);
    createEReference(accessibleEntityEClass, ACCESSIBLE_ENTITY__SPECIFIC);

    entityEClass = createEClass(ENTITY);
    createEAttribute(entityEClass, ENTITY__NAME);

    actorAliasEClass = createEClass(ACTOR_ALIAS);
    createEReference(actorAliasEClass, ACTOR_ALIAS__SOURCE);
    createEReference(actorAliasEClass, ACTOR_ALIAS__ALIAS);

    interactorSignalReceptionEClass = createEClass(INTERACTOR_SIGNAL_RECEPTION);
    createEReference(interactorSignalReceptionEClass, INTERACTOR_SIGNAL_RECEPTION__INSTANCE);
    createEReference(interactorSignalReceptionEClass, INTERACTOR_SIGNAL_RECEPTION__SOURCE);
    createEAttribute(interactorSignalReceptionEClass, INTERACTOR_SIGNAL_RECEPTION__INIT);

    interactorSignalEmissionEClass = createEClass(INTERACTOR_SIGNAL_EMISSION);
    createEReference(interactorSignalEmissionEClass, INTERACTOR_SIGNAL_EMISSION__INSTANCE);
    createEReference(interactorSignalEmissionEClass, INTERACTOR_SIGNAL_EMISSION__DESTINATION);

    interactorBehaviorEClass = createEClass(INTERACTOR_BEHAVIOR);
    createEReference(interactorBehaviorEClass, INTERACTOR_BEHAVIOR__CAUSE);
    createEReference(interactorBehaviorEClass, INTERACTOR_BEHAVIOR__EFFECT);

    interactorBehaviorCauseEClass = createEClass(INTERACTOR_BEHAVIOR_CAUSE);
    createEReference(interactorBehaviorCauseEClass, INTERACTOR_BEHAVIOR_CAUSE__GUARD);

    interactorBehaviorOnCauseEClass = createEClass(INTERACTOR_BEHAVIOR_ON_CAUSE);
    createEReference(interactorBehaviorOnCauseEClass, INTERACTOR_BEHAVIOR_ON_CAUSE__EVENT);

    interactorBehaviorWhenCauseEClass = createEClass(INTERACTOR_BEHAVIOR_WHEN_CAUSE);
    createEReference(interactorBehaviorWhenCauseEClass, INTERACTOR_BEHAVIOR_WHEN_CAUSE__CONDITION);

    interactorBehaviorEffectEClass = createEClass(INTERACTOR_BEHAVIOR_EFFECT);
    createEReference(interactorBehaviorEffectEClass, INTERACTOR_BEHAVIOR_EFFECT__TARGET);
    createEReference(interactorBehaviorEffectEClass, INTERACTOR_BEHAVIOR_EFFECT__VALUE);

    interactorBehaviorAlwaysEffectEClass = createEClass(INTERACTOR_BEHAVIOR_ALWAYS_EFFECT);

    interactorBehaviorSetEffectEClass = createEClass(INTERACTOR_BEHAVIOR_SET_EFFECT);

    interactorBehaviorTriggerEffectEClass = createEClass(INTERACTOR_BEHAVIOR_TRIGGER_EFFECT);

    expressionEClass = createEClass(EXPRESSION);

    expressionLiteralCollectionEClass = createEClass(EXPRESSION_LITERAL_COLLECTION);
    createEReference(expressionLiteralCollectionEClass, EXPRESSION_LITERAL_COLLECTION__ELEMENTS);

    expressionLiteralSetEClass = createEClass(EXPRESSION_LITERAL_SET);

    expressionLiteralListEClass = createEClass(EXPRESSION_LITERAL_LIST);

    expressionCaseEClass = createEClass(EXPRESSION_CASE);
    createEReference(expressionCaseEClass, EXPRESSION_CASE__CASE);
    createEReference(expressionCaseEClass, EXPRESSION_CASE__THEN);

    dataTypeDefinitionCompoundEClass = createEClass(DATA_TYPE_DEFINITION_COMPOUND);
    createEReference(dataTypeDefinitionCompoundEClass, DATA_TYPE_DEFINITION_COMPOUND__COMPONENT);

    dataTypeDefinitionAliasEClass = createEClass(DATA_TYPE_DEFINITION_ALIAS);
    createEReference(dataTypeDefinitionAliasEClass, DATA_TYPE_DEFINITION_ALIAS__ALIAS);

    dataDefinitionSetEnumEClass = createEClass(DATA_DEFINITION_SET_ENUM);
    createEReference(dataDefinitionSetEnumEClass, DATA_DEFINITION_SET_ENUM__ELEMENT);

    dataDefinitionSetNumberEClass = createEClass(DATA_DEFINITION_SET_NUMBER);
    createEReference(dataDefinitionSetNumberEClass, DATA_DEFINITION_SET_NUMBER__ELEMENT);

    dataDefinitionSetIntervalEClass = createEClass(DATA_DEFINITION_SET_INTERVAL);
    createEReference(dataDefinitionSetIntervalEClass, DATA_DEFINITION_SET_INTERVAL__INF);
    createEReference(dataDefinitionSetIntervalEClass, DATA_DEFINITION_SET_INTERVAL__SUP);

    expressionBinaryOperationEClass = createEClass(EXPRESSION_BINARY_OPERATION);
    createEReference(expressionBinaryOperationEClass, EXPRESSION_BINARY_OPERATION__LEFT_OPERAND);
    createEAttribute(expressionBinaryOperationEClass, EXPRESSION_BINARY_OPERATION__FEATURE);
    createEReference(expressionBinaryOperationEClass, EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND);

    unaryOperationEClass = createEClass(UNARY_OPERATION);
    createEAttribute(unaryOperationEClass, UNARY_OPERATION__FEATURE);
    createEReference(unaryOperationEClass, UNARY_OPERATION__OPERAND);

    literalDataEClass = createEClass(LITERAL_DATA);
    createEReference(literalDataEClass, LITERAL_DATA__DATA);

    expressionIfEClass = createEClass(EXPRESSION_IF);
    createEReference(expressionIfEClass, EXPRESSION_IF__IF);
    createEReference(expressionIfEClass, EXPRESSION_IF__THEN);
    createEReference(expressionIfEClass, EXPRESSION_IF__ELSE);

    expressionSwitchEClass = createEClass(EXPRESSION_SWITCH);
    createEReference(expressionSwitchEClass, EXPRESSION_SWITCH__SWITCH);
    createEReference(expressionSwitchEClass, EXPRESSION_SWITCH__CASE);
    createEReference(expressionSwitchEClass, EXPRESSION_SWITCH__DEFAULT);

    expressionForEachEClass = createEClass(EXPRESSION_FOR_EACH);
    createEReference(expressionForEachEClass, EXPRESSION_FOR_EACH__FOR_EXPRESSION);
    createEReference(expressionForEachEClass, EXPRESSION_FOR_EACH__EACH_EXPRESSION);

    expressionFunctionCallEClass = createEClass(EXPRESSION_FUNCTION_CALL);
    createEAttribute(expressionFunctionCallEClass, EXPRESSION_FUNCTION_CALL__FUNCTION);
    createEReference(expressionFunctionCallEClass, EXPRESSION_FUNCTION_CALL__ARGUMENTS);

    literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
    createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__IS_TRUE);

    literalNullEClass = createEClass(LITERAL_NULL);

    literalNumberEClass = createEClass(LITERAL_NUMBER);
    createEAttribute(literalNumberEClass, LITERAL_NUMBER__VALUE);

    literalStringEClass = createEClass(LITERAL_STRING);
    createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

    literalEnumEClass = createEClass(LITERAL_ENUM);
    createEReference(literalEnumEClass, LITERAL_ENUM__VALUE);

    literalTimeEClass = createEClass(LITERAL_TIME);
    createEAttribute(literalTimeEClass, LITERAL_TIME__NOW);
    createEAttribute(literalTimeEClass, LITERAL_TIME__YEAR);
    createEAttribute(literalTimeEClass, LITERAL_TIME__MONTH);
    createEAttribute(literalTimeEClass, LITERAL_TIME__DAY);
    createEAttribute(literalTimeEClass, LITERAL_TIME__HOUR);
    createEAttribute(literalTimeEClass, LITERAL_TIME__MINUTE);
    createEAttribute(literalTimeEClass, LITERAL_TIME__SECOND);
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
    interactorActorEClass.getESuperTypes().add(this.getEntity());
    interactorComponentEClass.getESuperTypes().add(this.getEntity());
    interactorBehaviorOnCauseEClass.getESuperTypes().add(this.getInteractorBehaviorCause());
    interactorBehaviorWhenCauseEClass.getESuperTypes().add(this.getInteractorBehaviorCause());
    interactorBehaviorAlwaysEffectEClass.getESuperTypes().add(this.getInteractorBehaviorEffect());
    interactorBehaviorSetEffectEClass.getESuperTypes().add(this.getInteractorBehaviorEffect());
    interactorBehaviorTriggerEffectEClass.getESuperTypes().add(this.getInteractorBehaviorEffect());
    expressionLiteralCollectionEClass.getESuperTypes().add(this.getExpression());
    expressionLiteralSetEClass.getESuperTypes().add(this.getExpressionLiteralCollection());
    expressionLiteralListEClass.getESuperTypes().add(this.getExpressionLiteralCollection());
    dataTypeDefinitionCompoundEClass.getESuperTypes().add(this.getDataTypeDefinition());
    dataTypeDefinitionAliasEClass.getESuperTypes().add(this.getDataTypeDefinition());
    dataDefinitionSetEnumEClass.getESuperTypes().add(this.getDataDefinitionSet());
    dataDefinitionSetNumberEClass.getESuperTypes().add(this.getDataDefinitionSet());
    dataDefinitionSetIntervalEClass.getESuperTypes().add(this.getDataDefinitionSet());
    expressionBinaryOperationEClass.getESuperTypes().add(this.getExpression());
    unaryOperationEClass.getESuperTypes().add(this.getExpression());
    literalDataEClass.getESuperTypes().add(this.getExpression());
    expressionIfEClass.getESuperTypes().add(this.getExpression());
    expressionSwitchEClass.getESuperTypes().add(this.getExpression());
    expressionForEachEClass.getESuperTypes().add(this.getExpression());
    expressionFunctionCallEClass.getESuperTypes().add(this.getExpression());
    literalBooleanEClass.getESuperTypes().add(this.getExpression());
    literalNullEClass.getESuperTypes().add(this.getExpression());
    literalNumberEClass.getESuperTypes().add(this.getExpression());
    literalStringEClass.getESuperTypes().add(this.getExpression());
    literalEnumEClass.getESuperTypes().add(this.getExpression());
    literalTimeEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(lilModelEClass, LilModel.class, "LilModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLilModel_ActorType(), this.getActorTypeDefinition(), null, "actorType", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLilModel_DataType(), this.getDataTypeDefinition(), null, "dataType", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLilModel_InteractorType(), this.getInteractorTypeDefinition(), null, "interactorType", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorTypeDefinitionEClass, ActorTypeDefinition.class, "ActorTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActorTypeDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActorTypeDefinition_Component(), this.getActorComponent(), null, "component", null, 0, -1, ActorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorTypeEClass, ActorType.class, "ActorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActorType_Base(), ecorePackage.getEString(), "base", null, 0, 1, ActorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActorType_Custom(), this.getActorTypeDefinition(), null, "custom", null, 0, 1, ActorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorComponentEClass, ActorComponent.class, "ActorComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActorComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActorComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActorComponent_Type(), this.getActorType(), null, "type", null, 0, 1, ActorComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeDefinitionEClass, DataTypeDefinition.class, "DataTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataType_Base(), ecorePackage.getEString(), "base", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataType_DefinitionSet(), this.getDataDefinitionSet(), null, "definitionSet", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataType_Custom(), this.getDataTypeDefinition(), null, "custom", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataType_Collection(), this.getDataCollectionType(), null, "collection", null, 0, 1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataDefinitionSetEClass, DataDefinitionSet.class, "DataDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataDefinitionEnumElementEClass, DataDefinitionEnumElement.class, "DataDefinitionEnumElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataDefinitionEnumElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataDefinitionEnumElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataCollectionTypeEClass, DataCollectionType.class, "DataCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataCollectionType_Type(), ecorePackage.getEString(), "type", null, 0, 1, DataCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataCollectionType_Mapping(), this.getDataType(), null, "mapping", null, 0, 1, DataCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataComponentEClass, DataComponent.class, "DataComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataComponent_Type(), this.getDataType(), null, "type", null, 0, 1, DataComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorTypeDefinitionEClass, InteractorTypeDefinition.class, "InteractorTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteractorTypeDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, InteractorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorTypeDefinition_Actor(), this.getInteractorActor(), null, "actor", null, 0, -1, InteractorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorTypeDefinition_Data(), this.getInteractorData(), null, "data", null, 0, -1, InteractorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorTypeDefinition_Component(), this.getInteractorComponent(), null, "component", null, 0, -1, InteractorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorTypeDefinition_Behavior(), this.getInteractorBehavior(), null, "behavior", null, 0, -1, InteractorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorTypeEClass, InteractorType.class, "InteractorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorType_Custom(), this.getInteractorTypeDefinition(), null, "custom", null, 0, 1, InteractorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorActorEClass, InteractorActor.class, "InteractorActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorActor_Type(), this.getActorType(), null, "type", null, 0, 1, InteractorActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorDataEClass, InteractorData.class, "InteractorData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteractorData_Name(), ecorePackage.getEString(), "name", null, 0, 1, InteractorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorData_Type(), this.getDataType(), null, "type", null, 0, 1, InteractorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInteractorData_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, InteractorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorData_Source(), this.getInteractorSignalAlias(), null, "source", null, 0, 1, InteractorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorData_Destinations(), this.getInteractorSignalAlias(), null, "destinations", null, 0, -1, InteractorData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorSignalAliasEClass, InteractorSignalAlias.class, "InteractorSignalAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorSignalAlias_Source(), this.getAccessibleEntity(), null, "source", null, 0, 1, InteractorSignalAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorSignalAlias_Alias(), this.getInteractorData(), null, "alias", null, 0, 1, InteractorSignalAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorComponentEClass, InteractorComponent.class, "InteractorComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorComponent_Type(), this.getInteractorType(), null, "type", null, 0, 1, InteractorComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorComponent_Actors(), this.getActorAlias(), null, "actors", null, 0, -1, InteractorComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(accessibleEntityEClass, AccessibleEntity.class, "AccessibleEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAccessibleEntity_Generic(), ecorePackage.getEString(), "generic", null, 0, 1, AccessibleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAccessibleEntity_Specific(), this.getEntity(), null, "specific", null, 0, 1, AccessibleEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorAliasEClass, ActorAlias.class, "ActorAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActorAlias_Source(), this.getInteractorActor(), null, "source", null, 0, 1, ActorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActorAlias_Alias(), this.getInteractorActor(), null, "alias", null, 0, 1, ActorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorSignalReceptionEClass, InteractorSignalReception.class, "InteractorSignalReception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorSignalReception_Instance(), this.getInteractorData(), null, "instance", null, 0, 1, InteractorSignalReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorSignalReception_Source(), this.getInteractorSignalAlias(), null, "source", null, 0, 1, InteractorSignalReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInteractorSignalReception_Init(), ecorePackage.getEBoolean(), "init", null, 0, 1, InteractorSignalReception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorSignalEmissionEClass, InteractorSignalEmission.class, "InteractorSignalEmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorSignalEmission_Instance(), this.getInteractorData(), null, "instance", null, 0, 1, InteractorSignalEmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorSignalEmission_Destination(), this.getInteractorSignalAlias(), null, "destination", null, 0, 1, InteractorSignalEmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorEClass, InteractorBehavior.class, "InteractorBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorBehavior_Cause(), this.getInteractorBehaviorCause(), null, "cause", null, 0, 1, InteractorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorBehavior_Effect(), this.getInteractorBehaviorEffect(), null, "effect", null, 0, -1, InteractorBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorCauseEClass, InteractorBehaviorCause.class, "InteractorBehaviorCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorBehaviorCause_Guard(), this.getExpression(), null, "guard", null, 0, 1, InteractorBehaviorCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorOnCauseEClass, InteractorBehaviorOnCause.class, "InteractorBehaviorOnCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorBehaviorOnCause_Event(), this.getInteractorSignalReception(), null, "event", null, 0, 1, InteractorBehaviorOnCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorWhenCauseEClass, InteractorBehaviorWhenCause.class, "InteractorBehaviorWhenCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorBehaviorWhenCause_Condition(), this.getExpression(), null, "condition", null, 0, 1, InteractorBehaviorWhenCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorEffectEClass, InteractorBehaviorEffect.class, "InteractorBehaviorEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorBehaviorEffect_Target(), this.getInteractorSignalEmission(), null, "target", null, 0, 1, InteractorBehaviorEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorBehaviorEffect_Value(), this.getExpression(), null, "value", null, 0, 1, InteractorBehaviorEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorAlwaysEffectEClass, InteractorBehaviorAlwaysEffect.class, "InteractorBehaviorAlwaysEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorBehaviorSetEffectEClass, InteractorBehaviorSetEffect.class, "InteractorBehaviorSetEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorBehaviorTriggerEffectEClass, InteractorBehaviorTriggerEffect.class, "InteractorBehaviorTriggerEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionLiteralCollectionEClass, ExpressionLiteralCollection.class, "ExpressionLiteralCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionLiteralCollection_Elements(), this.getExpression(), null, "elements", null, 0, -1, ExpressionLiteralCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionLiteralSetEClass, ExpressionLiteralSet.class, "ExpressionLiteralSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionLiteralListEClass, ExpressionLiteralList.class, "ExpressionLiteralList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionCaseEClass, ExpressionCase.class, "ExpressionCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionCase_Case(), this.getExpression(), null, "case", null, 0, 1, ExpressionCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionCase_Then(), this.getExpression(), null, "then", null, 0, 1, ExpressionCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeDefinitionCompoundEClass, DataTypeDefinitionCompound.class, "DataTypeDefinitionCompound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeDefinitionCompound_Component(), this.getDataComponent(), null, "component", null, 0, -1, DataTypeDefinitionCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeDefinitionAliasEClass, DataTypeDefinitionAlias.class, "DataTypeDefinitionAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeDefinitionAlias_Alias(), this.getDataType(), null, "alias", null, 0, 1, DataTypeDefinitionAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataDefinitionSetEnumEClass, DataDefinitionSetEnum.class, "DataDefinitionSetEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataDefinitionSetEnum_Element(), this.getDataDefinitionEnumElement(), null, "element", null, 0, -1, DataDefinitionSetEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataDefinitionSetNumberEClass, DataDefinitionSetNumber.class, "DataDefinitionSetNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataDefinitionSetNumber_Element(), this.getExpression(), null, "element", null, 0, -1, DataDefinitionSetNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataDefinitionSetIntervalEClass, DataDefinitionSetInterval.class, "DataDefinitionSetInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataDefinitionSetInterval_Inf(), this.getExpression(), null, "inf", null, 0, 1, DataDefinitionSetInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataDefinitionSetInterval_Sup(), this.getExpression(), null, "sup", null, 0, 1, DataDefinitionSetInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionBinaryOperationEClass, ExpressionBinaryOperation.class, "ExpressionBinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionBinaryOperation_LeftOperand(), this.getExpression(), null, "leftOperand", null, 0, 1, ExpressionBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionBinaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, ExpressionBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionBinaryOperation_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, ExpressionBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryOperationEClass, UnaryOperation.class, "UnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryOperation_Operand(), this.getExpression(), null, "operand", null, 0, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalDataEClass, LiteralData.class, "LiteralData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteralData_Data(), this.getInteractorData(), null, "data", null, 0, 1, LiteralData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionIfEClass, ExpressionIf.class, "ExpressionIf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionIf_If(), this.getExpression(), null, "if", null, 0, 1, ExpressionIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionIf_Then(), this.getExpression(), null, "then", null, 0, 1, ExpressionIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionIf_Else(), this.getExpression(), null, "else", null, 0, 1, ExpressionIf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionSwitchEClass, ExpressionSwitch.class, "ExpressionSwitch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionSwitch_Switch(), this.getExpression(), null, "switch", null, 0, 1, ExpressionSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionSwitch_Case(), this.getExpressionCase(), null, "case", null, 0, -1, ExpressionSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionSwitch_Default(), this.getExpression(), null, "default", null, 0, 1, ExpressionSwitch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionForEachEClass, ExpressionForEach.class, "ExpressionForEach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionForEach_ForExpression(), this.getExpression(), null, "forExpression", null, 0, 1, ExpressionForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionForEach_EachExpression(), this.getExpression(), null, "eachExpression", null, 0, 1, ExpressionForEach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionFunctionCallEClass, ExpressionFunctionCall.class, "ExpressionFunctionCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExpressionFunctionCall_Function(), ecorePackage.getEString(), "function", null, 0, 1, ExpressionFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionFunctionCall_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, ExpressionFunctionCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralBoolean_IsTrue(), ecorePackage.getEBoolean(), "isTrue", null, 0, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalNullEClass, LiteralNull.class, "LiteralNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalNumberEClass, LiteralNumber.class, "LiteralNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralNumber_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, LiteralNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralString_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEnumEClass, LiteralEnum.class, "LiteralEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteralEnum_Value(), this.getDataDefinitionEnumElement(), null, "value", null, 0, 1, LiteralEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalTimeEClass, LiteralTime.class, "LiteralTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralTime_Now(), ecorePackage.getEBoolean(), "now", null, 0, 1, LiteralTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteralTime_Year(), ecorePackage.getEDouble(), "year", null, 0, 1, LiteralTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteralTime_Month(), ecorePackage.getEDouble(), "month", null, 0, 1, LiteralTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteralTime_Day(), ecorePackage.getEDouble(), "day", null, 0, 1, LiteralTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteralTime_Hour(), ecorePackage.getEDouble(), "hour", null, 0, 1, LiteralTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteralTime_Minute(), ecorePackage.getEDouble(), "minute", null, 0, 1, LiteralTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteralTime_Second(), ecorePackage.getEDouble(), "second", null, 0, 1, LiteralTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LilPackageImpl
