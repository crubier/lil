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
      case LilPackage.IMPORT_STATEMENT: return createImportStatement();
      case LilPackage.ACTOR_TYPE_DEFINITION: return createActorTypeDefinition();
      case LilPackage.ACTOR_TYPE: return createActorType();
      case LilPackage.ACTOR_COMPONENT_DECLARATION: return createActorComponentDeclaration();
      case LilPackage.DATA_TYPE_DEFINITION: return createDataTypeDefinition();
      case LilPackage.DATA_TYPE: return createDataType();
      case LilPackage.DATA_TYPE_SYMBOL_DEFINITION_SET: return createDataTypeSymbolDefinitionSet();
      case LilPackage.DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT: return createDataTypeSymbolDefinitionSetElement();
      case LilPackage.DATA_TYPE_NUMBER_DEFINITION_SET: return createDataTypeNumberDefinitionSet();
      case LilPackage.DATA_TYPE_TEXT_DEFINITION_SET: return createDataTypeTextDefinitionSet();
      case LilPackage.DATA_TYPE_TIME_DEFINITION_SET: return createDataTypeTimeDefinitionSet();
      case LilPackage.DATA_TYPE_IDENTIFIER_DEFINITION_SET: return createDataTypeIdentifierDefinitionSet();
      case LilPackage.DATA_COMPONENT_DECLARATION: return createDataComponentDeclaration();
      case LilPackage.INTERACTOR_TYPE_DEFINITION: return createInteractorTypeDefinition();
      case LilPackage.INTERACTOR_TYPE: return createInteractorType();
      case LilPackage.INTERACTOR_ENTITY_DECLARATION: return createInteractorEntityDeclaration();
      case LilPackage.INTERACTOR_DATA_DECLARATION: return createInteractorDataDeclaration();
      case LilPackage.INTERACTOR_ACTOR_ALIAS: return createInteractorActorAlias();
      case LilPackage.INTERACTOR_DATA_ALIAS: return createInteractorDataAlias();
      case LilPackage.INTERACTOR_ENTITY: return createInteractorEntity();
      case LilPackage.INTERACTOR_DATA_RECEPTION: return createInteractorDataReception();
      case LilPackage.INTERACTOR_DATA_EMISSION: return createInteractorDataEmission();
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION: return createInteractorBehaviorDeclaration();
      case LilPackage.INTERACTOR_BEHAVIOR_CAUSE: return createInteractorBehaviorCause();
      case LilPackage.INTERACTOR_BEHAVIOR_EFFECT: return createInteractorBehaviorEffect();
      case LilPackage.EXPRESSION: return createExpression();
      case LilPackage.EXPRESSION_LITERAL_COLLECTION: return createExpressionLiteralCollection();
      case LilPackage.EXPRESSION_LITERAL_SET: return createExpressionLiteralSet();
      case LilPackage.EXPRESSION_LITERAL_LIST: return createExpressionLiteralList();
      case LilPackage.EXPRESSION_CASE: return createExpressionCase();
      case LilPackage.ACTOR_TYPE_INPUT: return createActorTypeInput();
      case LilPackage.ACTOR_TYPE_OUTPUT: return createActorTypeOutput();
      case LilPackage.ACTOR_TYPE_CUSTOM: return createActorTypeCustom();
      case LilPackage.DATA_TYPE_DEFINITION_COMPOUND: return createDataTypeDefinitionCompound();
      case LilPackage.DATA_TYPE_DEFINITION_ALIAS: return createDataTypeDefinitionAlias();
      case LilPackage.DATA_TYPE_VOID: return createDataTypeVoid();
      case LilPackage.DATA_TYPE_BOOLEAN: return createDataTypeBoolean();
      case LilPackage.DATA_TYPE_SYMBOL: return createDataTypeSymbol();
      case LilPackage.DATA_TYPE_NUMBER: return createDataTypeNumber();
      case LilPackage.DATA_TYPE_TEXT: return createDataTypeText();
      case LilPackage.DATA_TYPE_TIME: return createDataTypeTime();
      case LilPackage.DATA_TYPE_IDENTIFIER: return createDataTypeIdentifier();
      case LilPackage.DATA_TYPE_CUSTOM: return createDataTypeCustom();
      case LilPackage.DATA_TYPE_COLLECTION: return createDataTypeCollection();
      case LilPackage.DATA_TYPE_SET: return createDataTypeSet();
      case LilPackage.DATA_TYPE_LIST: return createDataTypeList();
      case LilPackage.DATA_TYPE_QUEUE: return createDataTypeQueue();
      case LilPackage.DATA_TYPE_NUMBER_DEFINITION_SET_SET: return createDataTypeNumberDefinitionSetSet();
      case LilPackage.DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL: return createDataTypeNumberDefinitionSetInterval();
      case LilPackage.DATA_TYPE_TEXT_DEFINITION_SET_SET: return createDataTypeTextDefinitionSetSet();
      case LilPackage.DATA_TYPE_TIME_DEFINITION_SET_SET: return createDataTypeTimeDefinitionSetSet();
      case LilPackage.DATA_TYPE_TIME_DEFINITION_SET_INTERVAL: return createDataTypeTimeDefinitionSetInterval();
      case LilPackage.DATA_TYPE_IDENTIFIER_DEFINITION_SET_SET: return createDataTypeIdentifierDefinitionSetSet();
      case LilPackage.INTERACTOR_TYPE_CUSTOM: return createInteractorTypeCustom();
      case LilPackage.INTERACTOR_ACTOR_DECLARATION: return createInteractorActorDeclaration();
      case LilPackage.INTERACTOR_INTERACTOR_DECLARATION: return createInteractorInteractorDeclaration();
      case LilPackage.INTERACTOR_DATA_DECLARATION_EVENT: return createInteractorDataDeclarationEvent();
      case LilPackage.INTERACTOR_DATA_DECLARATION_FLOW: return createInteractorDataDeclarationFlow();
      case LilPackage.INTERACTOR_DATA_DECLARATION_CONSTANT: return createInteractorDataDeclarationConstant();
      case LilPackage.INTERACTOR_ENTITY_ANY: return createInteractorEntityAny();
      case LilPackage.INTERACTOR_ENTITY_SELF: return createInteractorEntitySelf();
      case LilPackage.INTERACTOR_ENTITY_OTHER: return createInteractorEntityOther();
      case LilPackage.INTERACTOR_ENTITY_PARENT: return createInteractorEntityParent();
      case LilPackage.INTERACTOR_ENTITY_CHILD: return createInteractorEntityChild();
      case LilPackage.INTERACTOR_ENTITY_ALL: return createInteractorEntityAll();
      case LilPackage.INTERACTOR_ENTITY_ACTORS: return createInteractorEntityActors();
      case LilPackage.INTERACTOR_ENTITY_SPECIFIC: return createInteractorEntitySpecific();
      case LilPackage.INTERACTOR_ENTITY_ACTOR: return createInteractorEntityActor();
      case LilPackage.INTERACTOR_ENTITY_INTERACTOR: return createInteractorEntityInteractor();
      case LilPackage.INTERACTOR_DATA_RECEPTION_INTERNAL: return createInteractorDataReceptionInternal();
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL: return createInteractorDataReceptionExternal();
      case LilPackage.INTERACTOR_DATA_RECEPTION_INITIALIZATION: return createInteractorDataReceptionInitialization();
      case LilPackage.INTERACTOR_DATA_EMISSION_INTERNAL: return createInteractorDataEmissionInternal();
      case LilPackage.INTERACTOR_DATA_EMISSION_EXTERNAL: return createInteractorDataEmissionExternal();
      case LilPackage.INTERACTOR_BEHAVIOR_CAUSE_ON: return createInteractorBehaviorCauseOn();
      case LilPackage.INTERACTOR_BEHAVIOR_CAUSE_WHEN: return createInteractorBehaviorCauseWhen();
      case LilPackage.INTERACTOR_BEHAVIOR_EFFECT_ALWAYS: return createInteractorBehaviorEffectAlways();
      case LilPackage.INTERACTOR_BEHAVIOR_EFFECT_SET: return createInteractorBehaviorEffectSet();
      case LilPackage.INTERACTOR_BEHAVIOR_EFFECT_TRIGGER: return createInteractorBehaviorEffectTrigger();
      case LilPackage.EXPRESSION_BINARY_OPERATION: return createExpressionBinaryOperation();
      case LilPackage.UNARY_OPERATION: return createUnaryOperation();
      case LilPackage.EXPRESSION_IF: return createExpressionIf();
      case LilPackage.EXPRESSION_SWITCH: return createExpressionSwitch();
      case LilPackage.EXPRESSION_FOR_EACH: return createExpressionForEach();
      case LilPackage.EXPRESSION_FUNCTION_CALL: return createExpressionFunctionCall();
      case LilPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
      case LilPackage.LITERAL_NULL: return createLiteralNull();
      case LilPackage.LITERAL_NUMBER: return createLiteralNumber();
      case LilPackage.LITERAL_TEXT: return createLiteralText();
      case LilPackage.LITERAL_ENUM: return createLiteralEnum();
      case LilPackage.LITERAL_TIME_NOW: return createLiteralTimeNow();
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
  public ImportStatement createImportStatement()
  {
    ImportStatementImpl importStatement = new ImportStatementImpl();
    return importStatement;
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
  public ActorComponentDeclaration createActorComponentDeclaration()
  {
    ActorComponentDeclarationImpl actorComponentDeclaration = new ActorComponentDeclarationImpl();
    return actorComponentDeclaration;
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
  public DataTypeSymbolDefinitionSet createDataTypeSymbolDefinitionSet()
  {
    DataTypeSymbolDefinitionSetImpl dataTypeSymbolDefinitionSet = new DataTypeSymbolDefinitionSetImpl();
    return dataTypeSymbolDefinitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeSymbolDefinitionSetElement createDataTypeSymbolDefinitionSetElement()
  {
    DataTypeSymbolDefinitionSetElementImpl dataTypeSymbolDefinitionSetElement = new DataTypeSymbolDefinitionSetElementImpl();
    return dataTypeSymbolDefinitionSetElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeNumberDefinitionSet createDataTypeNumberDefinitionSet()
  {
    DataTypeNumberDefinitionSetImpl dataTypeNumberDefinitionSet = new DataTypeNumberDefinitionSetImpl();
    return dataTypeNumberDefinitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeTextDefinitionSet createDataTypeTextDefinitionSet()
  {
    DataTypeTextDefinitionSetImpl dataTypeTextDefinitionSet = new DataTypeTextDefinitionSetImpl();
    return dataTypeTextDefinitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeTimeDefinitionSet createDataTypeTimeDefinitionSet()
  {
    DataTypeTimeDefinitionSetImpl dataTypeTimeDefinitionSet = new DataTypeTimeDefinitionSetImpl();
    return dataTypeTimeDefinitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeIdentifierDefinitionSet createDataTypeIdentifierDefinitionSet()
  {
    DataTypeIdentifierDefinitionSetImpl dataTypeIdentifierDefinitionSet = new DataTypeIdentifierDefinitionSetImpl();
    return dataTypeIdentifierDefinitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataComponentDeclaration createDataComponentDeclaration()
  {
    DataComponentDeclarationImpl dataComponentDeclaration = new DataComponentDeclarationImpl();
    return dataComponentDeclaration;
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
  public InteractorEntityDeclaration createInteractorEntityDeclaration()
  {
    InteractorEntityDeclarationImpl interactorEntityDeclaration = new InteractorEntityDeclarationImpl();
    return interactorEntityDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataDeclaration createInteractorDataDeclaration()
  {
    InteractorDataDeclarationImpl interactorDataDeclaration = new InteractorDataDeclarationImpl();
    return interactorDataDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorActorAlias createInteractorActorAlias()
  {
    InteractorActorAliasImpl interactorActorAlias = new InteractorActorAliasImpl();
    return interactorActorAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataAlias createInteractorDataAlias()
  {
    InteractorDataAliasImpl interactorDataAlias = new InteractorDataAliasImpl();
    return interactorDataAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntity createInteractorEntity()
  {
    InteractorEntityImpl interactorEntity = new InteractorEntityImpl();
    return interactorEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataReception createInteractorDataReception()
  {
    InteractorDataReceptionImpl interactorDataReception = new InteractorDataReceptionImpl();
    return interactorDataReception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataEmission createInteractorDataEmission()
  {
    InteractorDataEmissionImpl interactorDataEmission = new InteractorDataEmissionImpl();
    return interactorDataEmission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorDeclaration createInteractorBehaviorDeclaration()
  {
    InteractorBehaviorDeclarationImpl interactorBehaviorDeclaration = new InteractorBehaviorDeclarationImpl();
    return interactorBehaviorDeclaration;
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
  public ActorTypeInput createActorTypeInput()
  {
    ActorTypeInputImpl actorTypeInput = new ActorTypeInputImpl();
    return actorTypeInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorTypeOutput createActorTypeOutput()
  {
    ActorTypeOutputImpl actorTypeOutput = new ActorTypeOutputImpl();
    return actorTypeOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorTypeCustom createActorTypeCustom()
  {
    ActorTypeCustomImpl actorTypeCustom = new ActorTypeCustomImpl();
    return actorTypeCustom;
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
  public DataTypeVoid createDataTypeVoid()
  {
    DataTypeVoidImpl dataTypeVoid = new DataTypeVoidImpl();
    return dataTypeVoid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeBoolean createDataTypeBoolean()
  {
    DataTypeBooleanImpl dataTypeBoolean = new DataTypeBooleanImpl();
    return dataTypeBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeSymbol createDataTypeSymbol()
  {
    DataTypeSymbolImpl dataTypeSymbol = new DataTypeSymbolImpl();
    return dataTypeSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeNumber createDataTypeNumber()
  {
    DataTypeNumberImpl dataTypeNumber = new DataTypeNumberImpl();
    return dataTypeNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeText createDataTypeText()
  {
    DataTypeTextImpl dataTypeText = new DataTypeTextImpl();
    return dataTypeText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeTime createDataTypeTime()
  {
    DataTypeTimeImpl dataTypeTime = new DataTypeTimeImpl();
    return dataTypeTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeIdentifier createDataTypeIdentifier()
  {
    DataTypeIdentifierImpl dataTypeIdentifier = new DataTypeIdentifierImpl();
    return dataTypeIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeCustom createDataTypeCustom()
  {
    DataTypeCustomImpl dataTypeCustom = new DataTypeCustomImpl();
    return dataTypeCustom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeCollection createDataTypeCollection()
  {
    DataTypeCollectionImpl dataTypeCollection = new DataTypeCollectionImpl();
    return dataTypeCollection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeSet createDataTypeSet()
  {
    DataTypeSetImpl dataTypeSet = new DataTypeSetImpl();
    return dataTypeSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeList createDataTypeList()
  {
    DataTypeListImpl dataTypeList = new DataTypeListImpl();
    return dataTypeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeQueue createDataTypeQueue()
  {
    DataTypeQueueImpl dataTypeQueue = new DataTypeQueueImpl();
    return dataTypeQueue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeNumberDefinitionSetSet createDataTypeNumberDefinitionSetSet()
  {
    DataTypeNumberDefinitionSetSetImpl dataTypeNumberDefinitionSetSet = new DataTypeNumberDefinitionSetSetImpl();
    return dataTypeNumberDefinitionSetSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeNumberDefinitionSetInterval createDataTypeNumberDefinitionSetInterval()
  {
    DataTypeNumberDefinitionSetIntervalImpl dataTypeNumberDefinitionSetInterval = new DataTypeNumberDefinitionSetIntervalImpl();
    return dataTypeNumberDefinitionSetInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeTextDefinitionSetSet createDataTypeTextDefinitionSetSet()
  {
    DataTypeTextDefinitionSetSetImpl dataTypeTextDefinitionSetSet = new DataTypeTextDefinitionSetSetImpl();
    return dataTypeTextDefinitionSetSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeTimeDefinitionSetSet createDataTypeTimeDefinitionSetSet()
  {
    DataTypeTimeDefinitionSetSetImpl dataTypeTimeDefinitionSetSet = new DataTypeTimeDefinitionSetSetImpl();
    return dataTypeTimeDefinitionSetSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeTimeDefinitionSetInterval createDataTypeTimeDefinitionSetInterval()
  {
    DataTypeTimeDefinitionSetIntervalImpl dataTypeTimeDefinitionSetInterval = new DataTypeTimeDefinitionSetIntervalImpl();
    return dataTypeTimeDefinitionSetInterval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeIdentifierDefinitionSetSet createDataTypeIdentifierDefinitionSetSet()
  {
    DataTypeIdentifierDefinitionSetSetImpl dataTypeIdentifierDefinitionSetSet = new DataTypeIdentifierDefinitionSetSetImpl();
    return dataTypeIdentifierDefinitionSetSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorTypeCustom createInteractorTypeCustom()
  {
    InteractorTypeCustomImpl interactorTypeCustom = new InteractorTypeCustomImpl();
    return interactorTypeCustom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorActorDeclaration createInteractorActorDeclaration()
  {
    InteractorActorDeclarationImpl interactorActorDeclaration = new InteractorActorDeclarationImpl();
    return interactorActorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorInteractorDeclaration createInteractorInteractorDeclaration()
  {
    InteractorInteractorDeclarationImpl interactorInteractorDeclaration = new InteractorInteractorDeclarationImpl();
    return interactorInteractorDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataDeclarationEvent createInteractorDataDeclarationEvent()
  {
    InteractorDataDeclarationEventImpl interactorDataDeclarationEvent = new InteractorDataDeclarationEventImpl();
    return interactorDataDeclarationEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataDeclarationFlow createInteractorDataDeclarationFlow()
  {
    InteractorDataDeclarationFlowImpl interactorDataDeclarationFlow = new InteractorDataDeclarationFlowImpl();
    return interactorDataDeclarationFlow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataDeclarationConstant createInteractorDataDeclarationConstant()
  {
    InteractorDataDeclarationConstantImpl interactorDataDeclarationConstant = new InteractorDataDeclarationConstantImpl();
    return interactorDataDeclarationConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntityAny createInteractorEntityAny()
  {
    InteractorEntityAnyImpl interactorEntityAny = new InteractorEntityAnyImpl();
    return interactorEntityAny;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntitySelf createInteractorEntitySelf()
  {
    InteractorEntitySelfImpl interactorEntitySelf = new InteractorEntitySelfImpl();
    return interactorEntitySelf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntityOther createInteractorEntityOther()
  {
    InteractorEntityOtherImpl interactorEntityOther = new InteractorEntityOtherImpl();
    return interactorEntityOther;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntityParent createInteractorEntityParent()
  {
    InteractorEntityParentImpl interactorEntityParent = new InteractorEntityParentImpl();
    return interactorEntityParent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntityChild createInteractorEntityChild()
  {
    InteractorEntityChildImpl interactorEntityChild = new InteractorEntityChildImpl();
    return interactorEntityChild;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntityAll createInteractorEntityAll()
  {
    InteractorEntityAllImpl interactorEntityAll = new InteractorEntityAllImpl();
    return interactorEntityAll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntityActors createInteractorEntityActors()
  {
    InteractorEntityActorsImpl interactorEntityActors = new InteractorEntityActorsImpl();
    return interactorEntityActors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntitySpecific createInteractorEntitySpecific()
  {
    InteractorEntitySpecificImpl interactorEntitySpecific = new InteractorEntitySpecificImpl();
    return interactorEntitySpecific;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntityActor createInteractorEntityActor()
  {
    InteractorEntityActorImpl interactorEntityActor = new InteractorEntityActorImpl();
    return interactorEntityActor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorEntityInteractor createInteractorEntityInteractor()
  {
    InteractorEntityInteractorImpl interactorEntityInteractor = new InteractorEntityInteractorImpl();
    return interactorEntityInteractor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataReceptionInternal createInteractorDataReceptionInternal()
  {
    InteractorDataReceptionInternalImpl interactorDataReceptionInternal = new InteractorDataReceptionInternalImpl();
    return interactorDataReceptionInternal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataReceptionExternal createInteractorDataReceptionExternal()
  {
    InteractorDataReceptionExternalImpl interactorDataReceptionExternal = new InteractorDataReceptionExternalImpl();
    return interactorDataReceptionExternal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataReceptionInitialization createInteractorDataReceptionInitialization()
  {
    InteractorDataReceptionInitializationImpl interactorDataReceptionInitialization = new InteractorDataReceptionInitializationImpl();
    return interactorDataReceptionInitialization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataEmissionInternal createInteractorDataEmissionInternal()
  {
    InteractorDataEmissionInternalImpl interactorDataEmissionInternal = new InteractorDataEmissionInternalImpl();
    return interactorDataEmissionInternal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataEmissionExternal createInteractorDataEmissionExternal()
  {
    InteractorDataEmissionExternalImpl interactorDataEmissionExternal = new InteractorDataEmissionExternalImpl();
    return interactorDataEmissionExternal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorCauseOn createInteractorBehaviorCauseOn()
  {
    InteractorBehaviorCauseOnImpl interactorBehaviorCauseOn = new InteractorBehaviorCauseOnImpl();
    return interactorBehaviorCauseOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorCauseWhen createInteractorBehaviorCauseWhen()
  {
    InteractorBehaviorCauseWhenImpl interactorBehaviorCauseWhen = new InteractorBehaviorCauseWhenImpl();
    return interactorBehaviorCauseWhen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorEffectAlways createInteractorBehaviorEffectAlways()
  {
    InteractorBehaviorEffectAlwaysImpl interactorBehaviorEffectAlways = new InteractorBehaviorEffectAlwaysImpl();
    return interactorBehaviorEffectAlways;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorEffectSet createInteractorBehaviorEffectSet()
  {
    InteractorBehaviorEffectSetImpl interactorBehaviorEffectSet = new InteractorBehaviorEffectSetImpl();
    return interactorBehaviorEffectSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorEffectTrigger createInteractorBehaviorEffectTrigger()
  {
    InteractorBehaviorEffectTriggerImpl interactorBehaviorEffectTrigger = new InteractorBehaviorEffectTriggerImpl();
    return interactorBehaviorEffectTrigger;
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
  public LiteralText createLiteralText()
  {
    LiteralTextImpl literalText = new LiteralTextImpl();
    return literalText;
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
  public LiteralTimeNow createLiteralTimeNow()
  {
    LiteralTimeNowImpl literalTimeNow = new LiteralTimeNowImpl();
    return literalTimeNow;
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
