/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LilFactoryImpl extends EFactoryImpl implements LilFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LilFactory init()
  {
    try
    {
      LilFactory theLilFactory = (LilFactory)EPackage.Registry.INSTANCE.getEFactory(LilPackage.eNS_URI);
      if (theLilFactory != null)
      {
        return theLilFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LilFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LilPackage.LIL_MODEL: return createLilModel();
      case LilPackage.ACTOR_TYPE_DEFINITION: return createActorTypeDefinition();
      case LilPackage.ACTOR_TYPE: return createActorType();
      case LilPackage.ACTOR_COMPONENT: return createActorComponent();
      case LilPackage.DATA_TYPE_DEFINITION: return createDataTypeDefinition();
      case LilPackage.DATA_TYPE: return createDataType();
      case LilPackage.DATA_DEFINITION_SET: return createDataDefinitionSet();
      case LilPackage.DATA_DEFINITION_ENUM_ELEMENT: return createDataDefinitionEnumElement();
      case LilPackage.DATA_COLLECTION_TYPE: return createDataCollectionType();
      case LilPackage.DATA_COMPONENT: return createDataComponent();
      case LilPackage.INTERACTOR_TYPE_DEFINITION: return createInteractorTypeDefinition();
      case LilPackage.INTERACTOR_TYPE: return createInteractorType();
      case LilPackage.INTERACTOR_ACTOR: return createInteractorActor();
      case LilPackage.INTERACTOR_DATA: return createInteractorData();
      case LilPackage.INTERACTOR_SIGNAL_ALIAS: return createInteractorSignalAlias();
      case LilPackage.INTERACTOR_COMPONENT: return createInteractorComponent();
      case LilPackage.ACCESSIBLE_ENTITY: return createAccessibleEntity();
      case LilPackage.ENTITY: return createEntity();
      case LilPackage.ACTOR_ALIAS: return createActorAlias();
      case LilPackage.INTERACTOR_SIGNAL_RECEPTION: return createInteractorSignalReception();
      case LilPackage.INTERACTOR_SIGNAL_EMISSION: return createInteractorSignalEmission();
      case LilPackage.INTERACTOR_BEHAVIOR: return createInteractorBehavior();
      case LilPackage.INTERACTOR_BEHAVIOR_CAUSE: return createInteractorBehaviorCause();
      case LilPackage.INTERACTOR_BEHAVIOR_ON_CAUSE: return createInteractorBehaviorOnCause();
      case LilPackage.INTERACTOR_BEHAVIOR_WHEN_CAUSE: return createInteractorBehaviorWhenCause();
      case LilPackage.INTERACTOR_BEHAVIOR_EFFECT: return createInteractorBehaviorEffect();
      case LilPackage.INTERACTOR_BEHAVIOR_ALWAYS_EFFECT: return createInteractorBehaviorAlwaysEffect();
      case LilPackage.INTERACTOR_BEHAVIOR_SET_EFFECT: return createInteractorBehaviorSetEffect();
      case LilPackage.INTERACTOR_BEHAVIOR_TRIGGER_EFFECT: return createInteractorBehaviorTriggerEffect();
      case LilPackage.EXPRESSION: return createExpression();
      case LilPackage.EXPRESSION_LITERAL_COLLECTION: return createExpressionLiteralCollection();
      case LilPackage.EXPRESSION_LITERAL_SET: return createExpressionLiteralSet();
      case LilPackage.EXPRESSION_LITERAL_LIST: return createExpressionLiteralList();
      case LilPackage.EXPRESSION_CASE: return createExpressionCase();
      case LilPackage.DATA_TYPE_DEFINITION_COMPOUND: return createDataTypeDefinitionCompound();
      case LilPackage.DATA_TYPE_DEFINITION_ALIAS: return createDataTypeDefinitionAlias();
      case LilPackage.DATA_DEFINITION_SET_ENUM: return createDataDefinitionSetEnum();
      case LilPackage.DATA_DEFINITION_SET_NUMBER: return createDataDefinitionSetNumber();
      case LilPackage.DATA_DEFINITION_SET_INTERVAL: return createDataDefinitionSetInterval();
      case LilPackage.EXPRESSION_BINARY_OPERATION: return createExpressionBinaryOperation();
      case LilPackage.UNARY_OPERATION: return createUnaryOperation();
      case LilPackage.LITERAL_DATA: return createLiteralData();
      case LilPackage.EXPRESSION_IF: return createExpressionIf();
      case LilPackage.EXPRESSION_SWITCH: return createExpressionSwitch();
      case LilPackage.EXPRESSION_FOR_EACH: return createExpressionForEach();
      case LilPackage.EXPRESSION_FUNCTION_CALL: return createExpressionFunctionCall();
      case LilPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
      case LilPackage.LITERAL_NULL: return createLiteralNull();
      case LilPackage.LITERAL_NUMBER: return createLiteralNumber();
      case LilPackage.LITERAL_STRING: return createLiteralString();
      case LilPackage.LITERAL_ENUM: return createLiteralEnum();
      case LilPackage.LITERAL_TIME: return createLiteralTime();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilModel createLilModel()
  {
    LilModelImpl lilModel = new LilModelImpl();
    return lilModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorTypeDefinition createActorTypeDefinition()
  {
    ActorTypeDefinitionImpl actorTypeDefinition = new ActorTypeDefinitionImpl();
    return actorTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorType createActorType()
  {
    ActorTypeImpl actorType = new ActorTypeImpl();
    return actorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorComponent createActorComponent()
  {
    ActorComponentImpl actorComponent = new ActorComponentImpl();
    return actorComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeDefinition createDataTypeDefinition()
  {
    DataTypeDefinitionImpl dataTypeDefinition = new DataTypeDefinitionImpl();
    return dataTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDefinitionSet createDataDefinitionSet()
  {
    DataDefinitionSetImpl dataDefinitionSet = new DataDefinitionSetImpl();
    return dataDefinitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDefinitionEnumElement createDataDefinitionEnumElement()
  {
    DataDefinitionEnumElementImpl dataDefinitionEnumElement = new DataDefinitionEnumElementImpl();
    return dataDefinitionEnumElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollectionType createDataCollectionType()
  {
    DataCollectionTypeImpl dataCollectionType = new DataCollectionTypeImpl();
    return dataCollectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataComponent createDataComponent()
  {
    DataComponentImpl dataComponent = new DataComponentImpl();
    return dataComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorTypeDefinition createInteractorTypeDefinition()
  {
    InteractorTypeDefinitionImpl interactorTypeDefinition = new InteractorTypeDefinitionImpl();
    return interactorTypeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorType createInteractorType()
  {
    InteractorTypeImpl interactorType = new InteractorTypeImpl();
    return interactorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorActor createInteractorActor()
  {
    InteractorActorImpl interactorActor = new InteractorActorImpl();
    return interactorActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorData createInteractorData()
  {
    InteractorDataImpl interactorData = new InteractorDataImpl();
    return interactorData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorSignalAlias createInteractorSignalAlias()
  {
    InteractorSignalAliasImpl interactorSignalAlias = new InteractorSignalAliasImpl();
    return interactorSignalAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorComponent createInteractorComponent()
  {
    InteractorComponentImpl interactorComponent = new InteractorComponentImpl();
    return interactorComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessibleEntity createAccessibleEntity()
  {
    AccessibleEntityImpl accessibleEntity = new AccessibleEntityImpl();
    return accessibleEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorAlias createActorAlias()
  {
    ActorAliasImpl actorAlias = new ActorAliasImpl();
    return actorAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorSignalReception createInteractorSignalReception()
  {
    InteractorSignalReceptionImpl interactorSignalReception = new InteractorSignalReceptionImpl();
    return interactorSignalReception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorSignalEmission createInteractorSignalEmission()
  {
    InteractorSignalEmissionImpl interactorSignalEmission = new InteractorSignalEmissionImpl();
    return interactorSignalEmission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehavior createInteractorBehavior()
  {
    InteractorBehaviorImpl interactorBehavior = new InteractorBehaviorImpl();
    return interactorBehavior;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorCause createInteractorBehaviorCause()
  {
    InteractorBehaviorCauseImpl interactorBehaviorCause = new InteractorBehaviorCauseImpl();
    return interactorBehaviorCause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorOnCause createInteractorBehaviorOnCause()
  {
    InteractorBehaviorOnCauseImpl interactorBehaviorOnCause = new InteractorBehaviorOnCauseImpl();
    return interactorBehaviorOnCause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorWhenCause createInteractorBehaviorWhenCause()
  {
    InteractorBehaviorWhenCauseImpl interactorBehaviorWhenCause = new InteractorBehaviorWhenCauseImpl();
    return interactorBehaviorWhenCause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorEffect createInteractorBehaviorEffect()
  {
    InteractorBehaviorEffectImpl interactorBehaviorEffect = new InteractorBehaviorEffectImpl();
    return interactorBehaviorEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorAlwaysEffect createInteractorBehaviorAlwaysEffect()
  {
    InteractorBehaviorAlwaysEffectImpl interactorBehaviorAlwaysEffect = new InteractorBehaviorAlwaysEffectImpl();
    return interactorBehaviorAlwaysEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorSetEffect createInteractorBehaviorSetEffect()
  {
    InteractorBehaviorSetEffectImpl interactorBehaviorSetEffect = new InteractorBehaviorSetEffectImpl();
    return interactorBehaviorSetEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorTriggerEffect createInteractorBehaviorTriggerEffect()
  {
    InteractorBehaviorTriggerEffectImpl interactorBehaviorTriggerEffect = new InteractorBehaviorTriggerEffectImpl();
    return interactorBehaviorTriggerEffect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionLiteralCollection createExpressionLiteralCollection()
  {
    ExpressionLiteralCollectionImpl expressionLiteralCollection = new ExpressionLiteralCollectionImpl();
    return expressionLiteralCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionLiteralSet createExpressionLiteralSet()
  {
    ExpressionLiteralSetImpl expressionLiteralSet = new ExpressionLiteralSetImpl();
    return expressionLiteralSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionLiteralList createExpressionLiteralList()
  {
    ExpressionLiteralListImpl expressionLiteralList = new ExpressionLiteralListImpl();
    return expressionLiteralList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionCase createExpressionCase()
  {
    ExpressionCaseImpl expressionCase = new ExpressionCaseImpl();
    return expressionCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeDefinitionCompound createDataTypeDefinitionCompound()
  {
    DataTypeDefinitionCompoundImpl dataTypeDefinitionCompound = new DataTypeDefinitionCompoundImpl();
    return dataTypeDefinitionCompound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeDefinitionAlias createDataTypeDefinitionAlias()
  {
    DataTypeDefinitionAliasImpl dataTypeDefinitionAlias = new DataTypeDefinitionAliasImpl();
    return dataTypeDefinitionAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDefinitionSetEnum createDataDefinitionSetEnum()
  {
    DataDefinitionSetEnumImpl dataDefinitionSetEnum = new DataDefinitionSetEnumImpl();
    return dataDefinitionSetEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDefinitionSetNumber createDataDefinitionSetNumber()
  {
    DataDefinitionSetNumberImpl dataDefinitionSetNumber = new DataDefinitionSetNumberImpl();
    return dataDefinitionSetNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDefinitionSetInterval createDataDefinitionSetInterval()
  {
    DataDefinitionSetIntervalImpl dataDefinitionSetInterval = new DataDefinitionSetIntervalImpl();
    return dataDefinitionSetInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionBinaryOperation createExpressionBinaryOperation()
  {
    ExpressionBinaryOperationImpl expressionBinaryOperation = new ExpressionBinaryOperationImpl();
    return expressionBinaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryOperation createUnaryOperation()
  {
    UnaryOperationImpl unaryOperation = new UnaryOperationImpl();
    return unaryOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralData createLiteralData()
  {
    LiteralDataImpl literalData = new LiteralDataImpl();
    return literalData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionIf createExpressionIf()
  {
    ExpressionIfImpl expressionIf = new ExpressionIfImpl();
    return expressionIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionSwitch createExpressionSwitch()
  {
    ExpressionSwitchImpl expressionSwitch = new ExpressionSwitchImpl();
    return expressionSwitch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionForEach createExpressionForEach()
  {
    ExpressionForEachImpl expressionForEach = new ExpressionForEachImpl();
    return expressionForEach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpressionFunctionCall createExpressionFunctionCall()
  {
    ExpressionFunctionCallImpl expressionFunctionCall = new ExpressionFunctionCallImpl();
    return expressionFunctionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralBoolean createLiteralBoolean()
  {
    LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
    return literalBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralNull createLiteralNull()
  {
    LiteralNullImpl literalNull = new LiteralNullImpl();
    return literalNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralNumber createLiteralNumber()
  {
    LiteralNumberImpl literalNumber = new LiteralNumberImpl();
    return literalNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralString createLiteralString()
  {
    LiteralStringImpl literalString = new LiteralStringImpl();
    return literalString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralEnum createLiteralEnum()
  {
    LiteralEnumImpl literalEnum = new LiteralEnumImpl();
    return literalEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralTime createLiteralTime()
  {
    LiteralTimeImpl literalTime = new LiteralTimeImpl();
    return literalTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilPackage getLilPackage()
  {
    return (LilPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LilPackage getPackage()
  {
    return LilPackage.eINSTANCE;
  }

} //LilFactoryImpl
