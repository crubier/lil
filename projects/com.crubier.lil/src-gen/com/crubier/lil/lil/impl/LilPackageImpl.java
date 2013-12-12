/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.ActorComponentDeclaration;
import com.crubier.lil.lil.ActorType;
import com.crubier.lil.lil.ActorTypeCustom;
import com.crubier.lil.lil.ActorTypeDefinition;
import com.crubier.lil.lil.ActorTypeInput;
import com.crubier.lil.lil.ActorTypeOutput;
import com.crubier.lil.lil.DataComponentDeclaration;
import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeCollection;
import com.crubier.lil.lil.DataTypeCustom;
import com.crubier.lil.lil.DataTypeDefinition;
import com.crubier.lil.lil.DataTypeDefinitionAlias;
import com.crubier.lil.lil.DataTypeDefinitionCompound;
import com.crubier.lil.lil.DataTypeIdentifier;
import com.crubier.lil.lil.DataTypeIdentifierDefinitionSet;
import com.crubier.lil.lil.DataTypeIdentifierDefinitionSetSet;
import com.crubier.lil.lil.DataTypeList;
import com.crubier.lil.lil.DataTypeNumber;
import com.crubier.lil.lil.DataTypeNumberDefinitionSet;
import com.crubier.lil.lil.DataTypeNumberDefinitionSetInterval;
import com.crubier.lil.lil.DataTypeNumberDefinitionSetSet;
import com.crubier.lil.lil.DataTypeQueue;
import com.crubier.lil.lil.DataTypeSet;
import com.crubier.lil.lil.DataTypeSymbol;
import com.crubier.lil.lil.DataTypeSymbolDefinitionSet;
import com.crubier.lil.lil.DataTypeSymbolDefinitionSetElement;
import com.crubier.lil.lil.DataTypeText;
import com.crubier.lil.lil.DataTypeTextDefinitionSet;
import com.crubier.lil.lil.DataTypeTextDefinitionSetSet;
import com.crubier.lil.lil.DataTypeTime;
import com.crubier.lil.lil.DataTypeTimeDefinitionSet;
import com.crubier.lil.lil.DataTypeTimeDefinitionSetInterval;
import com.crubier.lil.lil.DataTypeTimeDefinitionSetSet;
import com.crubier.lil.lil.DataTypeVoid;
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
import com.crubier.lil.lil.ImportStatement;
import com.crubier.lil.lil.InteractorActorAlias;
import com.crubier.lil.lil.InteractorActorDeclaration;
import com.crubier.lil.lil.InteractorBehaviorCause;
import com.crubier.lil.lil.InteractorBehaviorCauseOn;
import com.crubier.lil.lil.InteractorBehaviorCauseWhen;
import com.crubier.lil.lil.InteractorBehaviorDeclaration;
import com.crubier.lil.lil.InteractorBehaviorEffect;
import com.crubier.lil.lil.InteractorBehaviorEffectAlways;
import com.crubier.lil.lil.InteractorBehaviorEffectSet;
import com.crubier.lil.lil.InteractorBehaviorEffectTrigger;
import com.crubier.lil.lil.InteractorComponentDeclaration;
import com.crubier.lil.lil.InteractorDataAlias;
import com.crubier.lil.lil.InteractorDataDeclaration;
import com.crubier.lil.lil.InteractorDataDeclarationConstant;
import com.crubier.lil.lil.InteractorDataDeclarationEvent;
import com.crubier.lil.lil.InteractorDataDeclarationFlow;
import com.crubier.lil.lil.InteractorDataEmission;
import com.crubier.lil.lil.InteractorDataEmissionExternal;
import com.crubier.lil.lil.InteractorDataEmissionInternal;
import com.crubier.lil.lil.InteractorDataReception;
import com.crubier.lil.lil.InteractorDataReceptionExternal;
import com.crubier.lil.lil.InteractorDataReceptionInit;
import com.crubier.lil.lil.InteractorDataReceptionInternal;
import com.crubier.lil.lil.InteractorEntity;
import com.crubier.lil.lil.InteractorEntityActors;
import com.crubier.lil.lil.InteractorEntityAll;
import com.crubier.lil.lil.InteractorEntityAny;
import com.crubier.lil.lil.InteractorEntityChild;
import com.crubier.lil.lil.InteractorEntityDeclaration;
import com.crubier.lil.lil.InteractorEntityOther;
import com.crubier.lil.lil.InteractorEntityParent;
import com.crubier.lil.lil.InteractorEntitySelf;
import com.crubier.lil.lil.InteractorEntitySpecific;
import com.crubier.lil.lil.InteractorType;
import com.crubier.lil.lil.InteractorTypeCustom;
import com.crubier.lil.lil.InteractorTypeDefinition;
import com.crubier.lil.lil.LilFactory;
import com.crubier.lil.lil.LilModel;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.LiteralBoolean;
import com.crubier.lil.lil.LiteralEnum;
import com.crubier.lil.lil.LiteralNull;
import com.crubier.lil.lil.LiteralNumber;
import com.crubier.lil.lil.LiteralText;
import com.crubier.lil.lil.LiteralTime;
import com.crubier.lil.lil.LiteralTimeNow;
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
  private EClass importStatementEClass = null;

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
  private EClass actorComponentDeclarationEClass = null;

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
  private EClass dataTypeSymbolDefinitionSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeSymbolDefinitionSetElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeNumberDefinitionSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeTextDefinitionSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeTimeDefinitionSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeIdentifierDefinitionSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataComponentDeclarationEClass = null;

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
  private EClass interactorEntityDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorActorAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataReceptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataEmissionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorDeclarationEClass = null;

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
  private EClass interactorBehaviorEffectEClass = null;

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
  private EClass actorTypeInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorTypeOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actorTypeCustomEClass = null;

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
  private EClass dataTypeVoidEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeSymbolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeNumberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeTextEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeTimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeIdentifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeCustomEClass = null;

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
  private EClass dataTypeSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeQueueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeNumberDefinitionSetSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeNumberDefinitionSetIntervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeTextDefinitionSetSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeTimeDefinitionSetSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeTimeDefinitionSetIntervalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeIdentifierDefinitionSetSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorTypeCustomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorActorDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorComponentDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataDeclarationEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataDeclarationFlowEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataDeclarationConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorEntityAnyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorEntitySelfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorEntityOtherEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorEntityParentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorEntityChildEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorEntityAllEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorEntityActorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorEntitySpecificEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataReceptionInternalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataReceptionExternalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataReceptionInitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataEmissionInternalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorDataEmissionExternalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorCauseOnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorCauseWhenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorEffectAlwaysEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorEffectSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interactorBehaviorEffectTriggerEClass = null;

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
  private EClass literalTextEClass = null;

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
  private EClass literalTimeNowEClass = null;

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
  public EAttribute getLilModel_Name()
  {
    return (EAttribute)lilModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLilModel_Imports()
  {
    return (EReference)lilModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLilModel_ActorType()
  {
    return (EReference)lilModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLilModel_DataType()
  {
    return (EReference)lilModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLilModel_InteractorType()
  {
    return (EReference)lilModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportStatement()
  {
    return importStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportStatement_ImportedNamespace()
  {
    return (EAttribute)importStatementEClass.getEStructuralFeatures().get(0);
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
  public EClass getActorComponentDeclaration()
  {
    return actorComponentDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getActorComponentDeclaration_Name()
  {
    return (EAttribute)actorComponentDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorComponentDeclaration_Type()
  {
    return (EReference)actorComponentDeclarationEClass.getEStructuralFeatures().get(1);
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
  public EClass getDataTypeSymbolDefinitionSet()
  {
    return dataTypeSymbolDefinitionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeSymbolDefinitionSet_Element()
  {
    return (EReference)dataTypeSymbolDefinitionSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeSymbolDefinitionSetElement()
  {
    return dataTypeSymbolDefinitionSetElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeSymbolDefinitionSetElement_Name()
  {
    return (EAttribute)dataTypeSymbolDefinitionSetElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeNumberDefinitionSet()
  {
    return dataTypeNumberDefinitionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeTextDefinitionSet()
  {
    return dataTypeTextDefinitionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeTimeDefinitionSet()
  {
    return dataTypeTimeDefinitionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeIdentifierDefinitionSet()
  {
    return dataTypeIdentifierDefinitionSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataComponentDeclaration()
  {
    return dataComponentDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataComponentDeclaration_Name()
  {
    return (EAttribute)dataComponentDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataComponentDeclaration_Type()
  {
    return (EReference)dataComponentDeclarationEClass.getEStructuralFeatures().get(1);
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
  public EClass getInteractorEntityDeclaration()
  {
    return interactorEntityDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteractorEntityDeclaration_Name()
  {
    return (EAttribute)interactorEntityDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataDeclaration()
  {
    return interactorDataDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteractorDataDeclaration_Name()
  {
    return (EAttribute)interactorDataDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataDeclaration_Type()
  {
    return (EReference)interactorDataDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorActorAlias()
  {
    return interactorActorAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorActorAlias_Actor()
  {
    return (EReference)interactorActorAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorActorAlias_Alias()
  {
    return (EReference)interactorActorAliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataAlias()
  {
    return interactorDataAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataAlias_Entity()
  {
    return (EReference)interactorDataAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataAlias_Alias()
  {
    return (EReference)interactorDataAliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorEntity()
  {
    return interactorEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataReception()
  {
    return interactorDataReceptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataEmission()
  {
    return interactorDataEmissionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataEmission_Data()
  {
    return (EReference)interactorDataEmissionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorDeclaration()
  {
    return interactorBehaviorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehaviorDeclaration_Cause()
  {
    return (EReference)interactorBehaviorDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehaviorDeclaration_Effect()
  {
    return (EReference)interactorBehaviorDeclarationEClass.getEStructuralFeatures().get(1);
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
  public EClass getActorTypeInput()
  {
    return actorTypeInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorTypeOutput()
  {
    return actorTypeOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getActorTypeCustom()
  {
    return actorTypeCustomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getActorTypeCustom_Definition()
  {
    return (EReference)actorTypeCustomEClass.getEStructuralFeatures().get(0);
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
  public EClass getDataTypeVoid()
  {
    return dataTypeVoidEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeSymbol()
  {
    return dataTypeSymbolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeSymbol_DefinitionSet()
  {
    return (EReference)dataTypeSymbolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeNumber()
  {
    return dataTypeNumberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeNumber_DefinitionSet()
  {
    return (EReference)dataTypeNumberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeText()
  {
    return dataTypeTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeText_DefinitionSet()
  {
    return (EReference)dataTypeTextEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeTime()
  {
    return dataTypeTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeTime_DefinitionSet()
  {
    return (EReference)dataTypeTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeIdentifier()
  {
    return dataTypeIdentifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeIdentifier_DefinitionSet()
  {
    return (EReference)dataTypeIdentifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeCustom()
  {
    return dataTypeCustomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeCustom_Definition()
  {
    return (EReference)dataTypeCustomEClass.getEStructuralFeatures().get(0);
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
  public EReference getDataTypeCollection_ElementType()
  {
    return (EReference)dataTypeCollectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeSet()
  {
    return dataTypeSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeSet_ElementType()
  {
    return (EReference)dataTypeSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeList()
  {
    return dataTypeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeList_ElementType()
  {
    return (EReference)dataTypeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeQueue()
  {
    return dataTypeQueueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeQueue_ElementType()
  {
    return (EReference)dataTypeQueueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeNumberDefinitionSetSet()
  {
    return dataTypeNumberDefinitionSetSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeNumberDefinitionSetSet_Element()
  {
    return (EReference)dataTypeNumberDefinitionSetSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeNumberDefinitionSetInterval()
  {
    return dataTypeNumberDefinitionSetIntervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeNumberDefinitionSetInterval_Inf()
  {
    return (EReference)dataTypeNumberDefinitionSetIntervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeNumberDefinitionSetInterval_Sup()
  {
    return (EReference)dataTypeNumberDefinitionSetIntervalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeTextDefinitionSetSet()
  {
    return dataTypeTextDefinitionSetSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeTextDefinitionSetSet_Element()
  {
    return (EReference)dataTypeTextDefinitionSetSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeTimeDefinitionSetSet()
  {
    return dataTypeTimeDefinitionSetSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeTimeDefinitionSetSet_Element()
  {
    return (EReference)dataTypeTimeDefinitionSetSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeTimeDefinitionSetInterval()
  {
    return dataTypeTimeDefinitionSetIntervalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeTimeDefinitionSetInterval_Inf()
  {
    return (EReference)dataTypeTimeDefinitionSetIntervalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeTimeDefinitionSetInterval_Sup()
  {
    return (EReference)dataTypeTimeDefinitionSetIntervalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeIdentifierDefinitionSetSet()
  {
    return dataTypeIdentifierDefinitionSetSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataTypeIdentifierDefinitionSetSet_Element()
  {
    return (EReference)dataTypeIdentifierDefinitionSetSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorTypeCustom()
  {
    return interactorTypeCustomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorTypeCustom_Definition()
  {
    return (EReference)interactorTypeCustomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorActorDeclaration()
  {
    return interactorActorDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorActorDeclaration_Type()
  {
    return (EReference)interactorActorDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorComponentDeclaration()
  {
    return interactorComponentDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorComponentDeclaration_Type()
  {
    return (EReference)interactorComponentDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorComponentDeclaration_Actors()
  {
    return (EReference)interactorComponentDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataDeclarationEvent()
  {
    return interactorDataDeclarationEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataDeclarationEvent_Source()
  {
    return (EReference)interactorDataDeclarationEventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataDeclarationEvent_Destinations()
  {
    return (EReference)interactorDataDeclarationEventEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataDeclarationFlow()
  {
    return interactorDataDeclarationFlowEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataDeclarationFlow_Source()
  {
    return (EReference)interactorDataDeclarationFlowEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataDeclarationFlow_Destinations()
  {
    return (EReference)interactorDataDeclarationFlowEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataDeclarationConstant()
  {
    return interactorDataDeclarationConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorEntityAny()
  {
    return interactorEntityAnyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorEntitySelf()
  {
    return interactorEntitySelfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorEntityOther()
  {
    return interactorEntityOtherEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorEntityParent()
  {
    return interactorEntityParentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorEntityChild()
  {
    return interactorEntityChildEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorEntityAll()
  {
    return interactorEntityAllEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorEntityActors()
  {
    return interactorEntityActorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorEntitySpecific()
  {
    return interactorEntitySpecificEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorEntitySpecific_Entity()
  {
    return (EReference)interactorEntitySpecificEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataReceptionInternal()
  {
    return interactorDataReceptionInternalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataReceptionInternal_Data()
  {
    return (EReference)interactorDataReceptionInternalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataReceptionExternal()
  {
    return interactorDataReceptionExternalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataReceptionExternal_Data()
  {
    return (EReference)interactorDataReceptionExternalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataReceptionExternal_Source()
  {
    return (EReference)interactorDataReceptionExternalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataReceptionInit()
  {
    return interactorDataReceptionInitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataEmissionInternal()
  {
    return interactorDataEmissionInternalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorDataEmissionExternal()
  {
    return interactorDataEmissionExternalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorDataEmissionExternal_Destination()
  {
    return (EReference)interactorDataEmissionExternalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorCauseOn()
  {
    return interactorBehaviorCauseOnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehaviorCauseOn_Event()
  {
    return (EReference)interactorBehaviorCauseOnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorCauseWhen()
  {
    return interactorBehaviorCauseWhenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInteractorBehaviorCauseWhen_Condition()
  {
    return (EReference)interactorBehaviorCauseWhenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorEffectAlways()
  {
    return interactorBehaviorEffectAlwaysEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorEffectSet()
  {
    return interactorBehaviorEffectSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteractorBehaviorEffectTrigger()
  {
    return interactorBehaviorEffectTriggerEClass;
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
  public EClass getLiteralText()
  {
    return literalTextEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralText_Value()
  {
    return (EAttribute)literalTextEClass.getEStructuralFeatures().get(0);
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
  public EClass getLiteralTimeNow()
  {
    return literalTimeNowEClass;
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
  public EAttribute getLiteralTime_Year()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Month()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Day()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Hour()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Minute()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteralTime_Second()
  {
    return (EAttribute)literalTimeEClass.getEStructuralFeatures().get(5);
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
    createEAttribute(lilModelEClass, LIL_MODEL__NAME);
    createEReference(lilModelEClass, LIL_MODEL__IMPORTS);
    createEReference(lilModelEClass, LIL_MODEL__ACTOR_TYPE);
    createEReference(lilModelEClass, LIL_MODEL__DATA_TYPE);
    createEReference(lilModelEClass, LIL_MODEL__INTERACTOR_TYPE);

    importStatementEClass = createEClass(IMPORT_STATEMENT);
    createEAttribute(importStatementEClass, IMPORT_STATEMENT__IMPORTED_NAMESPACE);

    actorTypeDefinitionEClass = createEClass(ACTOR_TYPE_DEFINITION);
    createEAttribute(actorTypeDefinitionEClass, ACTOR_TYPE_DEFINITION__NAME);
    createEReference(actorTypeDefinitionEClass, ACTOR_TYPE_DEFINITION__COMPONENT);

    actorTypeEClass = createEClass(ACTOR_TYPE);

    actorComponentDeclarationEClass = createEClass(ACTOR_COMPONENT_DECLARATION);
    createEAttribute(actorComponentDeclarationEClass, ACTOR_COMPONENT_DECLARATION__NAME);
    createEReference(actorComponentDeclarationEClass, ACTOR_COMPONENT_DECLARATION__TYPE);

    dataTypeDefinitionEClass = createEClass(DATA_TYPE_DEFINITION);
    createEAttribute(dataTypeDefinitionEClass, DATA_TYPE_DEFINITION__NAME);

    dataTypeEClass = createEClass(DATA_TYPE);

    dataTypeSymbolDefinitionSetEClass = createEClass(DATA_TYPE_SYMBOL_DEFINITION_SET);
    createEReference(dataTypeSymbolDefinitionSetEClass, DATA_TYPE_SYMBOL_DEFINITION_SET__ELEMENT);

    dataTypeSymbolDefinitionSetElementEClass = createEClass(DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT);
    createEAttribute(dataTypeSymbolDefinitionSetElementEClass, DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT__NAME);

    dataTypeNumberDefinitionSetEClass = createEClass(DATA_TYPE_NUMBER_DEFINITION_SET);

    dataTypeTextDefinitionSetEClass = createEClass(DATA_TYPE_TEXT_DEFINITION_SET);

    dataTypeTimeDefinitionSetEClass = createEClass(DATA_TYPE_TIME_DEFINITION_SET);

    dataTypeIdentifierDefinitionSetEClass = createEClass(DATA_TYPE_IDENTIFIER_DEFINITION_SET);

    dataComponentDeclarationEClass = createEClass(DATA_COMPONENT_DECLARATION);
    createEAttribute(dataComponentDeclarationEClass, DATA_COMPONENT_DECLARATION__NAME);
    createEReference(dataComponentDeclarationEClass, DATA_COMPONENT_DECLARATION__TYPE);

    interactorTypeDefinitionEClass = createEClass(INTERACTOR_TYPE_DEFINITION);
    createEAttribute(interactorTypeDefinitionEClass, INTERACTOR_TYPE_DEFINITION__NAME);
    createEReference(interactorTypeDefinitionEClass, INTERACTOR_TYPE_DEFINITION__ACTOR);
    createEReference(interactorTypeDefinitionEClass, INTERACTOR_TYPE_DEFINITION__DATA);
    createEReference(interactorTypeDefinitionEClass, INTERACTOR_TYPE_DEFINITION__COMPONENT);
    createEReference(interactorTypeDefinitionEClass, INTERACTOR_TYPE_DEFINITION__BEHAVIOR);

    interactorTypeEClass = createEClass(INTERACTOR_TYPE);

    interactorEntityDeclarationEClass = createEClass(INTERACTOR_ENTITY_DECLARATION);
    createEAttribute(interactorEntityDeclarationEClass, INTERACTOR_ENTITY_DECLARATION__NAME);

    interactorDataDeclarationEClass = createEClass(INTERACTOR_DATA_DECLARATION);
    createEAttribute(interactorDataDeclarationEClass, INTERACTOR_DATA_DECLARATION__NAME);
    createEReference(interactorDataDeclarationEClass, INTERACTOR_DATA_DECLARATION__TYPE);

    interactorActorAliasEClass = createEClass(INTERACTOR_ACTOR_ALIAS);
    createEReference(interactorActorAliasEClass, INTERACTOR_ACTOR_ALIAS__ACTOR);
    createEReference(interactorActorAliasEClass, INTERACTOR_ACTOR_ALIAS__ALIAS);

    interactorDataAliasEClass = createEClass(INTERACTOR_DATA_ALIAS);
    createEReference(interactorDataAliasEClass, INTERACTOR_DATA_ALIAS__ENTITY);
    createEReference(interactorDataAliasEClass, INTERACTOR_DATA_ALIAS__ALIAS);

    interactorEntityEClass = createEClass(INTERACTOR_ENTITY);

    interactorDataReceptionEClass = createEClass(INTERACTOR_DATA_RECEPTION);

    interactorDataEmissionEClass = createEClass(INTERACTOR_DATA_EMISSION);
    createEReference(interactorDataEmissionEClass, INTERACTOR_DATA_EMISSION__DATA);

    interactorBehaviorDeclarationEClass = createEClass(INTERACTOR_BEHAVIOR_DECLARATION);
    createEReference(interactorBehaviorDeclarationEClass, INTERACTOR_BEHAVIOR_DECLARATION__CAUSE);
    createEReference(interactorBehaviorDeclarationEClass, INTERACTOR_BEHAVIOR_DECLARATION__EFFECT);

    interactorBehaviorCauseEClass = createEClass(INTERACTOR_BEHAVIOR_CAUSE);
    createEReference(interactorBehaviorCauseEClass, INTERACTOR_BEHAVIOR_CAUSE__GUARD);

    interactorBehaviorEffectEClass = createEClass(INTERACTOR_BEHAVIOR_EFFECT);
    createEReference(interactorBehaviorEffectEClass, INTERACTOR_BEHAVIOR_EFFECT__TARGET);
    createEReference(interactorBehaviorEffectEClass, INTERACTOR_BEHAVIOR_EFFECT__VALUE);

    expressionEClass = createEClass(EXPRESSION);

    expressionLiteralCollectionEClass = createEClass(EXPRESSION_LITERAL_COLLECTION);
    createEReference(expressionLiteralCollectionEClass, EXPRESSION_LITERAL_COLLECTION__ELEMENTS);

    expressionLiteralSetEClass = createEClass(EXPRESSION_LITERAL_SET);

    expressionLiteralListEClass = createEClass(EXPRESSION_LITERAL_LIST);

    expressionCaseEClass = createEClass(EXPRESSION_CASE);
    createEReference(expressionCaseEClass, EXPRESSION_CASE__CASE);
    createEReference(expressionCaseEClass, EXPRESSION_CASE__THEN);

    actorTypeInputEClass = createEClass(ACTOR_TYPE_INPUT);

    actorTypeOutputEClass = createEClass(ACTOR_TYPE_OUTPUT);

    actorTypeCustomEClass = createEClass(ACTOR_TYPE_CUSTOM);
    createEReference(actorTypeCustomEClass, ACTOR_TYPE_CUSTOM__DEFINITION);

    dataTypeDefinitionCompoundEClass = createEClass(DATA_TYPE_DEFINITION_COMPOUND);
    createEReference(dataTypeDefinitionCompoundEClass, DATA_TYPE_DEFINITION_COMPOUND__COMPONENT);

    dataTypeDefinitionAliasEClass = createEClass(DATA_TYPE_DEFINITION_ALIAS);
    createEReference(dataTypeDefinitionAliasEClass, DATA_TYPE_DEFINITION_ALIAS__ALIAS);

    dataTypeVoidEClass = createEClass(DATA_TYPE_VOID);

    dataTypeSymbolEClass = createEClass(DATA_TYPE_SYMBOL);
    createEReference(dataTypeSymbolEClass, DATA_TYPE_SYMBOL__DEFINITION_SET);

    dataTypeNumberEClass = createEClass(DATA_TYPE_NUMBER);
    createEReference(dataTypeNumberEClass, DATA_TYPE_NUMBER__DEFINITION_SET);

    dataTypeTextEClass = createEClass(DATA_TYPE_TEXT);
    createEReference(dataTypeTextEClass, DATA_TYPE_TEXT__DEFINITION_SET);

    dataTypeTimeEClass = createEClass(DATA_TYPE_TIME);
    createEReference(dataTypeTimeEClass, DATA_TYPE_TIME__DEFINITION_SET);

    dataTypeIdentifierEClass = createEClass(DATA_TYPE_IDENTIFIER);
    createEReference(dataTypeIdentifierEClass, DATA_TYPE_IDENTIFIER__DEFINITION_SET);

    dataTypeCustomEClass = createEClass(DATA_TYPE_CUSTOM);
    createEReference(dataTypeCustomEClass, DATA_TYPE_CUSTOM__DEFINITION);

    dataTypeCollectionEClass = createEClass(DATA_TYPE_COLLECTION);
    createEReference(dataTypeCollectionEClass, DATA_TYPE_COLLECTION__ELEMENT_TYPE);

    dataTypeSetEClass = createEClass(DATA_TYPE_SET);
    createEReference(dataTypeSetEClass, DATA_TYPE_SET__ELEMENT_TYPE);

    dataTypeListEClass = createEClass(DATA_TYPE_LIST);
    createEReference(dataTypeListEClass, DATA_TYPE_LIST__ELEMENT_TYPE);

    dataTypeQueueEClass = createEClass(DATA_TYPE_QUEUE);
    createEReference(dataTypeQueueEClass, DATA_TYPE_QUEUE__ELEMENT_TYPE);

    dataTypeNumberDefinitionSetSetEClass = createEClass(DATA_TYPE_NUMBER_DEFINITION_SET_SET);
    createEReference(dataTypeNumberDefinitionSetSetEClass, DATA_TYPE_NUMBER_DEFINITION_SET_SET__ELEMENT);

    dataTypeNumberDefinitionSetIntervalEClass = createEClass(DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL);
    createEReference(dataTypeNumberDefinitionSetIntervalEClass, DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL__INF);
    createEReference(dataTypeNumberDefinitionSetIntervalEClass, DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL__SUP);

    dataTypeTextDefinitionSetSetEClass = createEClass(DATA_TYPE_TEXT_DEFINITION_SET_SET);
    createEReference(dataTypeTextDefinitionSetSetEClass, DATA_TYPE_TEXT_DEFINITION_SET_SET__ELEMENT);

    dataTypeTimeDefinitionSetSetEClass = createEClass(DATA_TYPE_TIME_DEFINITION_SET_SET);
    createEReference(dataTypeTimeDefinitionSetSetEClass, DATA_TYPE_TIME_DEFINITION_SET_SET__ELEMENT);

    dataTypeTimeDefinitionSetIntervalEClass = createEClass(DATA_TYPE_TIME_DEFINITION_SET_INTERVAL);
    createEReference(dataTypeTimeDefinitionSetIntervalEClass, DATA_TYPE_TIME_DEFINITION_SET_INTERVAL__INF);
    createEReference(dataTypeTimeDefinitionSetIntervalEClass, DATA_TYPE_TIME_DEFINITION_SET_INTERVAL__SUP);

    dataTypeIdentifierDefinitionSetSetEClass = createEClass(DATA_TYPE_IDENTIFIER_DEFINITION_SET_SET);
    createEReference(dataTypeIdentifierDefinitionSetSetEClass, DATA_TYPE_IDENTIFIER_DEFINITION_SET_SET__ELEMENT);

    interactorTypeCustomEClass = createEClass(INTERACTOR_TYPE_CUSTOM);
    createEReference(interactorTypeCustomEClass, INTERACTOR_TYPE_CUSTOM__DEFINITION);

    interactorActorDeclarationEClass = createEClass(INTERACTOR_ACTOR_DECLARATION);
    createEReference(interactorActorDeclarationEClass, INTERACTOR_ACTOR_DECLARATION__TYPE);

    interactorComponentDeclarationEClass = createEClass(INTERACTOR_COMPONENT_DECLARATION);
    createEReference(interactorComponentDeclarationEClass, INTERACTOR_COMPONENT_DECLARATION__TYPE);
    createEReference(interactorComponentDeclarationEClass, INTERACTOR_COMPONENT_DECLARATION__ACTORS);

    interactorDataDeclarationEventEClass = createEClass(INTERACTOR_DATA_DECLARATION_EVENT);
    createEReference(interactorDataDeclarationEventEClass, INTERACTOR_DATA_DECLARATION_EVENT__SOURCE);
    createEReference(interactorDataDeclarationEventEClass, INTERACTOR_DATA_DECLARATION_EVENT__DESTINATIONS);

    interactorDataDeclarationFlowEClass = createEClass(INTERACTOR_DATA_DECLARATION_FLOW);
    createEReference(interactorDataDeclarationFlowEClass, INTERACTOR_DATA_DECLARATION_FLOW__SOURCE);
    createEReference(interactorDataDeclarationFlowEClass, INTERACTOR_DATA_DECLARATION_FLOW__DESTINATIONS);

    interactorDataDeclarationConstantEClass = createEClass(INTERACTOR_DATA_DECLARATION_CONSTANT);

    interactorEntityAnyEClass = createEClass(INTERACTOR_ENTITY_ANY);

    interactorEntitySelfEClass = createEClass(INTERACTOR_ENTITY_SELF);

    interactorEntityOtherEClass = createEClass(INTERACTOR_ENTITY_OTHER);

    interactorEntityParentEClass = createEClass(INTERACTOR_ENTITY_PARENT);

    interactorEntityChildEClass = createEClass(INTERACTOR_ENTITY_CHILD);

    interactorEntityAllEClass = createEClass(INTERACTOR_ENTITY_ALL);

    interactorEntityActorsEClass = createEClass(INTERACTOR_ENTITY_ACTORS);

    interactorEntitySpecificEClass = createEClass(INTERACTOR_ENTITY_SPECIFIC);
    createEReference(interactorEntitySpecificEClass, INTERACTOR_ENTITY_SPECIFIC__ENTITY);

    interactorDataReceptionInternalEClass = createEClass(INTERACTOR_DATA_RECEPTION_INTERNAL);
    createEReference(interactorDataReceptionInternalEClass, INTERACTOR_DATA_RECEPTION_INTERNAL__DATA);

    interactorDataReceptionExternalEClass = createEClass(INTERACTOR_DATA_RECEPTION_EXTERNAL);
    createEReference(interactorDataReceptionExternalEClass, INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA);
    createEReference(interactorDataReceptionExternalEClass, INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE);

    interactorDataReceptionInitEClass = createEClass(INTERACTOR_DATA_RECEPTION_INIT);

    interactorDataEmissionInternalEClass = createEClass(INTERACTOR_DATA_EMISSION_INTERNAL);

    interactorDataEmissionExternalEClass = createEClass(INTERACTOR_DATA_EMISSION_EXTERNAL);
    createEReference(interactorDataEmissionExternalEClass, INTERACTOR_DATA_EMISSION_EXTERNAL__DESTINATION);

    interactorBehaviorCauseOnEClass = createEClass(INTERACTOR_BEHAVIOR_CAUSE_ON);
    createEReference(interactorBehaviorCauseOnEClass, INTERACTOR_BEHAVIOR_CAUSE_ON__EVENT);

    interactorBehaviorCauseWhenEClass = createEClass(INTERACTOR_BEHAVIOR_CAUSE_WHEN);
    createEReference(interactorBehaviorCauseWhenEClass, INTERACTOR_BEHAVIOR_CAUSE_WHEN__CONDITION);

    interactorBehaviorEffectAlwaysEClass = createEClass(INTERACTOR_BEHAVIOR_EFFECT_ALWAYS);

    interactorBehaviorEffectSetEClass = createEClass(INTERACTOR_BEHAVIOR_EFFECT_SET);

    interactorBehaviorEffectTriggerEClass = createEClass(INTERACTOR_BEHAVIOR_EFFECT_TRIGGER);

    expressionBinaryOperationEClass = createEClass(EXPRESSION_BINARY_OPERATION);
    createEReference(expressionBinaryOperationEClass, EXPRESSION_BINARY_OPERATION__LEFT_OPERAND);
    createEAttribute(expressionBinaryOperationEClass, EXPRESSION_BINARY_OPERATION__FEATURE);
    createEReference(expressionBinaryOperationEClass, EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND);

    unaryOperationEClass = createEClass(UNARY_OPERATION);
    createEAttribute(unaryOperationEClass, UNARY_OPERATION__FEATURE);
    createEReference(unaryOperationEClass, UNARY_OPERATION__OPERAND);

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

    literalTextEClass = createEClass(LITERAL_TEXT);
    createEAttribute(literalTextEClass, LITERAL_TEXT__VALUE);

    literalEnumEClass = createEClass(LITERAL_ENUM);
    createEReference(literalEnumEClass, LITERAL_ENUM__VALUE);

    literalTimeNowEClass = createEClass(LITERAL_TIME_NOW);

    literalTimeEClass = createEClass(LITERAL_TIME);
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
    interactorDataReceptionEClass.getESuperTypes().add(this.getExpression());
    expressionLiteralCollectionEClass.getESuperTypes().add(this.getExpression());
    expressionLiteralSetEClass.getESuperTypes().add(this.getExpressionLiteralCollection());
    expressionLiteralListEClass.getESuperTypes().add(this.getExpressionLiteralCollection());
    actorTypeInputEClass.getESuperTypes().add(this.getActorType());
    actorTypeOutputEClass.getESuperTypes().add(this.getActorType());
    actorTypeCustomEClass.getESuperTypes().add(this.getActorType());
    dataTypeDefinitionCompoundEClass.getESuperTypes().add(this.getDataTypeDefinition());
    dataTypeDefinitionAliasEClass.getESuperTypes().add(this.getDataTypeDefinition());
    dataTypeVoidEClass.getESuperTypes().add(this.getDataType());
    dataTypeSymbolEClass.getESuperTypes().add(this.getDataType());
    dataTypeNumberEClass.getESuperTypes().add(this.getDataType());
    dataTypeTextEClass.getESuperTypes().add(this.getDataType());
    dataTypeTimeEClass.getESuperTypes().add(this.getDataType());
    dataTypeIdentifierEClass.getESuperTypes().add(this.getDataType());
    dataTypeCustomEClass.getESuperTypes().add(this.getDataType());
    dataTypeCollectionEClass.getESuperTypes().add(this.getDataType());
    dataTypeSetEClass.getESuperTypes().add(this.getDataType());
    dataTypeListEClass.getESuperTypes().add(this.getDataType());
    dataTypeQueueEClass.getESuperTypes().add(this.getDataType());
    dataTypeNumberDefinitionSetSetEClass.getESuperTypes().add(this.getDataTypeNumberDefinitionSet());
    dataTypeNumberDefinitionSetIntervalEClass.getESuperTypes().add(this.getDataTypeNumberDefinitionSet());
    dataTypeTextDefinitionSetSetEClass.getESuperTypes().add(this.getDataTypeTextDefinitionSet());
    dataTypeTimeDefinitionSetSetEClass.getESuperTypes().add(this.getDataTypeTimeDefinitionSet());
    dataTypeTimeDefinitionSetIntervalEClass.getESuperTypes().add(this.getDataTypeTimeDefinitionSet());
    dataTypeIdentifierDefinitionSetSetEClass.getESuperTypes().add(this.getDataTypeIdentifierDefinitionSet());
    interactorTypeCustomEClass.getESuperTypes().add(this.getInteractorType());
    interactorActorDeclarationEClass.getESuperTypes().add(this.getInteractorEntityDeclaration());
    interactorComponentDeclarationEClass.getESuperTypes().add(this.getInteractorEntityDeclaration());
    interactorDataDeclarationEventEClass.getESuperTypes().add(this.getInteractorDataDeclaration());
    interactorDataDeclarationFlowEClass.getESuperTypes().add(this.getInteractorDataDeclaration());
    interactorDataDeclarationConstantEClass.getESuperTypes().add(this.getInteractorDataDeclaration());
    interactorEntityAnyEClass.getESuperTypes().add(this.getInteractorEntity());
    interactorEntitySelfEClass.getESuperTypes().add(this.getInteractorEntity());
    interactorEntityOtherEClass.getESuperTypes().add(this.getInteractorEntity());
    interactorEntityParentEClass.getESuperTypes().add(this.getInteractorEntity());
    interactorEntityChildEClass.getESuperTypes().add(this.getInteractorEntity());
    interactorEntityAllEClass.getESuperTypes().add(this.getInteractorEntity());
    interactorEntityActorsEClass.getESuperTypes().add(this.getInteractorEntity());
    interactorEntitySpecificEClass.getESuperTypes().add(this.getInteractorEntity());
    interactorDataReceptionInternalEClass.getESuperTypes().add(this.getInteractorDataReception());
    interactorDataReceptionExternalEClass.getESuperTypes().add(this.getInteractorDataReception());
    interactorDataReceptionInitEClass.getESuperTypes().add(this.getInteractorDataReception());
    interactorDataEmissionInternalEClass.getESuperTypes().add(this.getInteractorDataEmission());
    interactorDataEmissionExternalEClass.getESuperTypes().add(this.getInteractorDataEmission());
    interactorBehaviorCauseOnEClass.getESuperTypes().add(this.getInteractorBehaviorCause());
    interactorBehaviorCauseWhenEClass.getESuperTypes().add(this.getInteractorBehaviorCause());
    interactorBehaviorEffectAlwaysEClass.getESuperTypes().add(this.getInteractorBehaviorEffect());
    interactorBehaviorEffectSetEClass.getESuperTypes().add(this.getInteractorBehaviorEffect());
    interactorBehaviorEffectTriggerEClass.getESuperTypes().add(this.getInteractorBehaviorEffect());
    expressionBinaryOperationEClass.getESuperTypes().add(this.getExpression());
    unaryOperationEClass.getESuperTypes().add(this.getExpression());
    expressionIfEClass.getESuperTypes().add(this.getExpression());
    expressionSwitchEClass.getESuperTypes().add(this.getExpression());
    expressionForEachEClass.getESuperTypes().add(this.getExpression());
    expressionFunctionCallEClass.getESuperTypes().add(this.getExpression());
    literalBooleanEClass.getESuperTypes().add(this.getExpression());
    literalNullEClass.getESuperTypes().add(this.getExpression());
    literalNumberEClass.getESuperTypes().add(this.getExpression());
    literalTextEClass.getESuperTypes().add(this.getExpression());
    literalEnumEClass.getESuperTypes().add(this.getExpression());
    literalTimeNowEClass.getESuperTypes().add(this.getExpression());
    literalTimeEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(lilModelEClass, LilModel.class, "LilModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLilModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLilModel_Imports(), this.getImportStatement(), null, "imports", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLilModel_ActorType(), this.getActorTypeDefinition(), null, "actorType", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLilModel_DataType(), this.getDataTypeDefinition(), null, "dataType", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLilModel_InteractorType(), this.getInteractorTypeDefinition(), null, "interactorType", null, 0, -1, LilModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportStatement_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorTypeDefinitionEClass, ActorTypeDefinition.class, "ActorTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActorTypeDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActorTypeDefinition_Component(), this.getActorComponentDeclaration(), null, "component", null, 0, -1, ActorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorTypeEClass, ActorType.class, "ActorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actorComponentDeclarationEClass, ActorComponentDeclaration.class, "ActorComponentDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActorComponentDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActorComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActorComponentDeclaration_Type(), this.getActorType(), null, "type", null, 0, 1, ActorComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeDefinitionEClass, DataTypeDefinition.class, "DataTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeSymbolDefinitionSetEClass, DataTypeSymbolDefinitionSet.class, "DataTypeSymbolDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeSymbolDefinitionSet_Element(), this.getDataTypeSymbolDefinitionSetElement(), null, "element", null, 0, -1, DataTypeSymbolDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeSymbolDefinitionSetElementEClass, DataTypeSymbolDefinitionSetElement.class, "DataTypeSymbolDefinitionSetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeSymbolDefinitionSetElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataTypeSymbolDefinitionSetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeNumberDefinitionSetEClass, DataTypeNumberDefinitionSet.class, "DataTypeNumberDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeTextDefinitionSetEClass, DataTypeTextDefinitionSet.class, "DataTypeTextDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeTimeDefinitionSetEClass, DataTypeTimeDefinitionSet.class, "DataTypeTimeDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeIdentifierDefinitionSetEClass, DataTypeIdentifierDefinitionSet.class, "DataTypeIdentifierDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataComponentDeclarationEClass, DataComponentDeclaration.class, "DataComponentDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataComponentDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataComponentDeclaration_Type(), this.getDataType(), null, "type", null, 0, 1, DataComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorTypeDefinitionEClass, InteractorTypeDefinition.class, "InteractorTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteractorTypeDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, InteractorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorTypeDefinition_Actor(), this.getInteractorEntityDeclaration(), null, "actor", null, 0, -1, InteractorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorTypeDefinition_Data(), this.getInteractorDataDeclaration(), null, "data", null, 0, -1, InteractorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorTypeDefinition_Component(), this.getInteractorEntityDeclaration(), null, "component", null, 0, -1, InteractorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorTypeDefinition_Behavior(), this.getInteractorBehaviorDeclaration(), null, "behavior", null, 0, -1, InteractorTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorTypeEClass, InteractorType.class, "InteractorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorEntityDeclarationEClass, InteractorEntityDeclaration.class, "InteractorEntityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteractorEntityDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, InteractorEntityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorDataDeclarationEClass, InteractorDataDeclaration.class, "InteractorDataDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteractorDataDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, InteractorDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorDataDeclaration_Type(), this.getDataType(), null, "type", null, 0, 1, InteractorDataDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorActorAliasEClass, InteractorActorAlias.class, "InteractorActorAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorActorAlias_Actor(), this.getInteractorActorDeclaration(), null, "actor", null, 0, 1, InteractorActorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorActorAlias_Alias(), this.getInteractorActorDeclaration(), null, "alias", null, 0, 1, InteractorActorAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorDataAliasEClass, InteractorDataAlias.class, "InteractorDataAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorDataAlias_Entity(), this.getInteractorEntity(), null, "entity", null, 0, 1, InteractorDataAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorDataAlias_Alias(), this.getInteractorDataDeclaration(), null, "alias", null, 0, 1, InteractorDataAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorEntityEClass, InteractorEntity.class, "InteractorEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorDataReceptionEClass, InteractorDataReception.class, "InteractorDataReception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorDataEmissionEClass, InteractorDataEmission.class, "InteractorDataEmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorDataEmission_Data(), this.getInteractorDataDeclaration(), null, "data", null, 0, 1, InteractorDataEmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorDeclarationEClass, InteractorBehaviorDeclaration.class, "InteractorBehaviorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorBehaviorDeclaration_Cause(), this.getInteractorBehaviorCause(), null, "cause", null, 0, 1, InteractorBehaviorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorBehaviorDeclaration_Effect(), this.getInteractorBehaviorEffect(), null, "effect", null, 0, -1, InteractorBehaviorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorCauseEClass, InteractorBehaviorCause.class, "InteractorBehaviorCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorBehaviorCause_Guard(), this.getExpression(), null, "guard", null, 0, 1, InteractorBehaviorCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorEffectEClass, InteractorBehaviorEffect.class, "InteractorBehaviorEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorBehaviorEffect_Target(), this.getInteractorDataEmission(), null, "target", null, 0, 1, InteractorBehaviorEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorBehaviorEffect_Value(), this.getExpression(), null, "value", null, 0, 1, InteractorBehaviorEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionLiteralCollectionEClass, ExpressionLiteralCollection.class, "ExpressionLiteralCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionLiteralCollection_Elements(), this.getExpression(), null, "elements", null, 0, -1, ExpressionLiteralCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionLiteralSetEClass, ExpressionLiteralSet.class, "ExpressionLiteralSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionLiteralListEClass, ExpressionLiteralList.class, "ExpressionLiteralList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionCaseEClass, ExpressionCase.class, "ExpressionCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionCase_Case(), this.getExpression(), null, "case", null, 0, 1, ExpressionCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionCase_Then(), this.getExpression(), null, "then", null, 0, 1, ExpressionCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actorTypeInputEClass, ActorTypeInput.class, "ActorTypeInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actorTypeOutputEClass, ActorTypeOutput.class, "ActorTypeOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(actorTypeCustomEClass, ActorTypeCustom.class, "ActorTypeCustom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActorTypeCustom_Definition(), this.getActorTypeDefinition(), null, "definition", null, 0, 1, ActorTypeCustom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeDefinitionCompoundEClass, DataTypeDefinitionCompound.class, "DataTypeDefinitionCompound", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeDefinitionCompound_Component(), this.getDataComponentDeclaration(), null, "component", null, 0, -1, DataTypeDefinitionCompound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeDefinitionAliasEClass, DataTypeDefinitionAlias.class, "DataTypeDefinitionAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeDefinitionAlias_Alias(), this.getDataType(), null, "alias", null, 0, 1, DataTypeDefinitionAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeVoidEClass, DataTypeVoid.class, "DataTypeVoid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataTypeSymbolEClass, DataTypeSymbol.class, "DataTypeSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeSymbol_DefinitionSet(), this.getDataTypeSymbolDefinitionSet(), null, "definitionSet", null, 0, 1, DataTypeSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeNumberEClass, DataTypeNumber.class, "DataTypeNumber", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeNumber_DefinitionSet(), this.getDataTypeNumberDefinitionSet(), null, "definitionSet", null, 0, 1, DataTypeNumber.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeTextEClass, DataTypeText.class, "DataTypeText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeText_DefinitionSet(), this.getDataTypeTextDefinitionSet(), null, "definitionSet", null, 0, 1, DataTypeText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeTimeEClass, DataTypeTime.class, "DataTypeTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeTime_DefinitionSet(), this.getDataTypeTimeDefinitionSet(), null, "definitionSet", null, 0, 1, DataTypeTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeIdentifierEClass, DataTypeIdentifier.class, "DataTypeIdentifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeIdentifier_DefinitionSet(), this.getDataTypeIdentifierDefinitionSet(), null, "definitionSet", null, 0, 1, DataTypeIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeCustomEClass, DataTypeCustom.class, "DataTypeCustom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeCustom_Definition(), this.getDataTypeDefinition(), null, "definition", null, 0, 1, DataTypeCustom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeCollectionEClass, DataTypeCollection.class, "DataTypeCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeCollection_ElementType(), this.getDataType(), null, "elementType", null, 0, 1, DataTypeCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeSetEClass, DataTypeSet.class, "DataTypeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeSet_ElementType(), this.getDataType(), null, "elementType", null, 0, 1, DataTypeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeListEClass, DataTypeList.class, "DataTypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeList_ElementType(), this.getDataType(), null, "elementType", null, 0, 1, DataTypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeQueueEClass, DataTypeQueue.class, "DataTypeQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeQueue_ElementType(), this.getDataType(), null, "elementType", null, 0, 1, DataTypeQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeNumberDefinitionSetSetEClass, DataTypeNumberDefinitionSetSet.class, "DataTypeNumberDefinitionSetSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeNumberDefinitionSetSet_Element(), this.getExpression(), null, "element", null, 0, -1, DataTypeNumberDefinitionSetSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeNumberDefinitionSetIntervalEClass, DataTypeNumberDefinitionSetInterval.class, "DataTypeNumberDefinitionSetInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeNumberDefinitionSetInterval_Inf(), this.getExpression(), null, "inf", null, 0, 1, DataTypeNumberDefinitionSetInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeNumberDefinitionSetInterval_Sup(), this.getExpression(), null, "sup", null, 0, 1, DataTypeNumberDefinitionSetInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeTextDefinitionSetSetEClass, DataTypeTextDefinitionSetSet.class, "DataTypeTextDefinitionSetSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeTextDefinitionSetSet_Element(), this.getExpression(), null, "element", null, 0, -1, DataTypeTextDefinitionSetSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeTimeDefinitionSetSetEClass, DataTypeTimeDefinitionSetSet.class, "DataTypeTimeDefinitionSetSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeTimeDefinitionSetSet_Element(), this.getExpression(), null, "element", null, 0, -1, DataTypeTimeDefinitionSetSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeTimeDefinitionSetIntervalEClass, DataTypeTimeDefinitionSetInterval.class, "DataTypeTimeDefinitionSetInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeTimeDefinitionSetInterval_Inf(), this.getExpression(), null, "inf", null, 0, 1, DataTypeTimeDefinitionSetInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataTypeTimeDefinitionSetInterval_Sup(), this.getExpression(), null, "sup", null, 0, 1, DataTypeTimeDefinitionSetInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeIdentifierDefinitionSetSetEClass, DataTypeIdentifierDefinitionSetSet.class, "DataTypeIdentifierDefinitionSetSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataTypeIdentifierDefinitionSetSet_Element(), this.getExpression(), null, "element", null, 0, -1, DataTypeIdentifierDefinitionSetSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorTypeCustomEClass, InteractorTypeCustom.class, "InteractorTypeCustom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorTypeCustom_Definition(), this.getInteractorTypeDefinition(), null, "definition", null, 0, 1, InteractorTypeCustom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorActorDeclarationEClass, InteractorActorDeclaration.class, "InteractorActorDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorActorDeclaration_Type(), this.getActorType(), null, "type", null, 0, 1, InteractorActorDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorComponentDeclarationEClass, InteractorComponentDeclaration.class, "InteractorComponentDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorComponentDeclaration_Type(), this.getInteractorType(), null, "type", null, 0, 1, InteractorComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorComponentDeclaration_Actors(), this.getInteractorActorAlias(), null, "actors", null, 0, -1, InteractorComponentDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorDataDeclarationEventEClass, InteractorDataDeclarationEvent.class, "InteractorDataDeclarationEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorDataDeclarationEvent_Source(), this.getInteractorDataAlias(), null, "source", null, 0, 1, InteractorDataDeclarationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorDataDeclarationEvent_Destinations(), this.getInteractorDataAlias(), null, "destinations", null, 0, -1, InteractorDataDeclarationEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorDataDeclarationFlowEClass, InteractorDataDeclarationFlow.class, "InteractorDataDeclarationFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorDataDeclarationFlow_Source(), this.getInteractorDataAlias(), null, "source", null, 0, 1, InteractorDataDeclarationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorDataDeclarationFlow_Destinations(), this.getInteractorDataAlias(), null, "destinations", null, 0, -1, InteractorDataDeclarationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorDataDeclarationConstantEClass, InteractorDataDeclarationConstant.class, "InteractorDataDeclarationConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorEntityAnyEClass, InteractorEntityAny.class, "InteractorEntityAny", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorEntitySelfEClass, InteractorEntitySelf.class, "InteractorEntitySelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorEntityOtherEClass, InteractorEntityOther.class, "InteractorEntityOther", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorEntityParentEClass, InteractorEntityParent.class, "InteractorEntityParent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorEntityChildEClass, InteractorEntityChild.class, "InteractorEntityChild", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorEntityAllEClass, InteractorEntityAll.class, "InteractorEntityAll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorEntityActorsEClass, InteractorEntityActors.class, "InteractorEntityActors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorEntitySpecificEClass, InteractorEntitySpecific.class, "InteractorEntitySpecific", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorEntitySpecific_Entity(), this.getInteractorEntityDeclaration(), null, "entity", null, 0, 1, InteractorEntitySpecific.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorDataReceptionInternalEClass, InteractorDataReceptionInternal.class, "InteractorDataReceptionInternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorDataReceptionInternal_Data(), this.getInteractorDataDeclaration(), null, "data", null, 0, 1, InteractorDataReceptionInternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorDataReceptionExternalEClass, InteractorDataReceptionExternal.class, "InteractorDataReceptionExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorDataReceptionExternal_Data(), this.getInteractorDataDeclaration(), null, "data", null, 0, 1, InteractorDataReceptionExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInteractorDataReceptionExternal_Source(), this.getInteractorDataAlias(), null, "source", null, 0, 1, InteractorDataReceptionExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorDataReceptionInitEClass, InteractorDataReceptionInit.class, "InteractorDataReceptionInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorDataEmissionInternalEClass, InteractorDataEmissionInternal.class, "InteractorDataEmissionInternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorDataEmissionExternalEClass, InteractorDataEmissionExternal.class, "InteractorDataEmissionExternal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorDataEmissionExternal_Destination(), this.getInteractorDataAlias(), null, "destination", null, 0, 1, InteractorDataEmissionExternal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorCauseOnEClass, InteractorBehaviorCauseOn.class, "InteractorBehaviorCauseOn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorBehaviorCauseOn_Event(), this.getInteractorDataReception(), null, "event", null, 0, 1, InteractorBehaviorCauseOn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorCauseWhenEClass, InteractorBehaviorCauseWhen.class, "InteractorBehaviorCauseWhen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInteractorBehaviorCauseWhen_Condition(), this.getExpression(), null, "condition", null, 0, 1, InteractorBehaviorCauseWhen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interactorBehaviorEffectAlwaysEClass, InteractorBehaviorEffectAlways.class, "InteractorBehaviorEffectAlways", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorBehaviorEffectSetEClass, InteractorBehaviorEffectSet.class, "InteractorBehaviorEffectSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(interactorBehaviorEffectTriggerEClass, InteractorBehaviorEffectTrigger.class, "InteractorBehaviorEffectTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionBinaryOperationEClass, ExpressionBinaryOperation.class, "ExpressionBinaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpressionBinaryOperation_LeftOperand(), this.getExpression(), null, "leftOperand", null, 0, 1, ExpressionBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpressionBinaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, ExpressionBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpressionBinaryOperation_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, ExpressionBinaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryOperationEClass, UnaryOperation.class, "UnaryOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryOperation_Feature(), ecorePackage.getEString(), "feature", null, 0, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryOperation_Operand(), this.getExpression(), null, "operand", null, 0, 1, UnaryOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(literalTextEClass, LiteralText.class, "LiteralText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteralText_Value(), ecorePackage.getEString(), "value", null, 0, 1, LiteralText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEnumEClass, LiteralEnum.class, "LiteralEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteralEnum_Value(), this.getDataTypeSymbolDefinitionSetElement(), null, "value", null, 0, 1, LiteralEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalTimeNowEClass, LiteralTimeNow.class, "LiteralTimeNow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalTimeEClass, LiteralTime.class, "LiteralTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
