/**
 */
package com.crubier.lil.lil.util;

import com.crubier.lil.lil.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.crubier.lil.lil.LilPackage
 * @generated
 */
public class LilSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LilPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LilSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = LilPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case LilPackage.LIL_MODEL:
      {
        LilModel lilModel = (LilModel)theEObject;
        T result = caseLilModel(lilModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ACTOR_TYPE_DEFINITION:
      {
        ActorTypeDefinition actorTypeDefinition = (ActorTypeDefinition)theEObject;
        T result = caseActorTypeDefinition(actorTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ACTOR_TYPE:
      {
        ActorType actorType = (ActorType)theEObject;
        T result = caseActorType(actorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ACTOR_COMPONENT:
      {
        ActorComponent actorComponent = (ActorComponent)theEObject;
        T result = caseActorComponent(actorComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_DEFINITION:
      {
        DataTypeDefinition dataTypeDefinition = (DataTypeDefinition)theEObject;
        T result = caseDataTypeDefinition(dataTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE:
      {
        DataType dataType = (DataType)theEObject;
        T result = caseDataType(dataType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_DEFINITION_SET:
      {
        DataDefinitionSet dataDefinitionSet = (DataDefinitionSet)theEObject;
        T result = caseDataDefinitionSet(dataDefinitionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_DEFINITION_ENUM_ELEMENT:
      {
        DataDefinitionEnumElement dataDefinitionEnumElement = (DataDefinitionEnumElement)theEObject;
        T result = caseDataDefinitionEnumElement(dataDefinitionEnumElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_COLLECTION_TYPE:
      {
        DataCollectionType dataCollectionType = (DataCollectionType)theEObject;
        T result = caseDataCollectionType(dataCollectionType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_COMPONENT:
      {
        DataComponent dataComponent = (DataComponent)theEObject;
        T result = caseDataComponent(dataComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_TYPE_DEFINITION:
      {
        InteractorTypeDefinition interactorTypeDefinition = (InteractorTypeDefinition)theEObject;
        T result = caseInteractorTypeDefinition(interactorTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_TYPE:
      {
        InteractorType interactorType = (InteractorType)theEObject;
        T result = caseInteractorType(interactorType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ACTOR:
      {
        InteractorActor interactorActor = (InteractorActor)theEObject;
        T result = caseInteractorActor(interactorActor);
        if (result == null) result = caseEntity(interactorActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA:
      {
        InteractorData interactorData = (InteractorData)theEObject;
        T result = caseInteractorData(interactorData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_SIGNAL_ALIAS:
      {
        InteractorSignalAlias interactorSignalAlias = (InteractorSignalAlias)theEObject;
        T result = caseInteractorSignalAlias(interactorSignalAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_COMPONENT:
      {
        InteractorComponent interactorComponent = (InteractorComponent)theEObject;
        T result = caseInteractorComponent(interactorComponent);
        if (result == null) result = caseEntity(interactorComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ACCESSIBLE_ENTITY:
      {
        AccessibleEntity accessibleEntity = (AccessibleEntity)theEObject;
        T result = caseAccessibleEntity(accessibleEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ENTITY:
      {
        Entity entity = (Entity)theEObject;
        T result = caseEntity(entity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ACTOR_ALIAS:
      {
        ActorAlias actorAlias = (ActorAlias)theEObject;
        T result = caseActorAlias(actorAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_SIGNAL_RECEPTION:
      {
        InteractorSignalReception interactorSignalReception = (InteractorSignalReception)theEObject;
        T result = caseInteractorSignalReception(interactorSignalReception);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_SIGNAL_EMISSION:
      {
        InteractorSignalEmission interactorSignalEmission = (InteractorSignalEmission)theEObject;
        T result = caseInteractorSignalEmission(interactorSignalEmission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR:
      {
        InteractorBehavior interactorBehavior = (InteractorBehavior)theEObject;
        T result = caseInteractorBehavior(interactorBehavior);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_CAUSE:
      {
        InteractorBehaviorCause interactorBehaviorCause = (InteractorBehaviorCause)theEObject;
        T result = caseInteractorBehaviorCause(interactorBehaviorCause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_ON_CAUSE:
      {
        InteractorBehaviorOnCause interactorBehaviorOnCause = (InteractorBehaviorOnCause)theEObject;
        T result = caseInteractorBehaviorOnCause(interactorBehaviorOnCause);
        if (result == null) result = caseInteractorBehaviorCause(interactorBehaviorOnCause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_WHEN_CAUSE:
      {
        InteractorBehaviorWhenCause interactorBehaviorWhenCause = (InteractorBehaviorWhenCause)theEObject;
        T result = caseInteractorBehaviorWhenCause(interactorBehaviorWhenCause);
        if (result == null) result = caseInteractorBehaviorCause(interactorBehaviorWhenCause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_EFFECT:
      {
        InteractorBehaviorEffect interactorBehaviorEffect = (InteractorBehaviorEffect)theEObject;
        T result = caseInteractorBehaviorEffect(interactorBehaviorEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_ALWAYS_EFFECT:
      {
        InteractorBehaviorAlwaysEffect interactorBehaviorAlwaysEffect = (InteractorBehaviorAlwaysEffect)theEObject;
        T result = caseInteractorBehaviorAlwaysEffect(interactorBehaviorAlwaysEffect);
        if (result == null) result = caseInteractorBehaviorEffect(interactorBehaviorAlwaysEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_SET_EFFECT:
      {
        InteractorBehaviorSetEffect interactorBehaviorSetEffect = (InteractorBehaviorSetEffect)theEObject;
        T result = caseInteractorBehaviorSetEffect(interactorBehaviorSetEffect);
        if (result == null) result = caseInteractorBehaviorEffect(interactorBehaviorSetEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_TRIGGER_EFFECT:
      {
        InteractorBehaviorTriggerEffect interactorBehaviorTriggerEffect = (InteractorBehaviorTriggerEffect)theEObject;
        T result = caseInteractorBehaviorTriggerEffect(interactorBehaviorTriggerEffect);
        if (result == null) result = caseInteractorBehaviorEffect(interactorBehaviorTriggerEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EXPRESSION_LITERAL_COLLECTION:
      {
        ExpressionLiteralCollection expressionLiteralCollection = (ExpressionLiteralCollection)theEObject;
        T result = caseExpressionLiteralCollection(expressionLiteralCollection);
        if (result == null) result = caseExpression(expressionLiteralCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EXPRESSION_LITERAL_SET:
      {
        ExpressionLiteralSet expressionLiteralSet = (ExpressionLiteralSet)theEObject;
        T result = caseExpressionLiteralSet(expressionLiteralSet);
        if (result == null) result = caseExpressionLiteralCollection(expressionLiteralSet);
        if (result == null) result = caseExpression(expressionLiteralSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EXPRESSION_LITERAL_LIST:
      {
        ExpressionLiteralList expressionLiteralList = (ExpressionLiteralList)theEObject;
        T result = caseExpressionLiteralList(expressionLiteralList);
        if (result == null) result = caseExpressionLiteralCollection(expressionLiteralList);
        if (result == null) result = caseExpression(expressionLiteralList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EXPRESSION_CASE:
      {
        ExpressionCase expressionCase = (ExpressionCase)theEObject;
        T result = caseExpressionCase(expressionCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_DEFINITION_COMPOUND:
      {
        DataTypeDefinitionCompound dataTypeDefinitionCompound = (DataTypeDefinitionCompound)theEObject;
        T result = caseDataTypeDefinitionCompound(dataTypeDefinitionCompound);
        if (result == null) result = caseDataTypeDefinition(dataTypeDefinitionCompound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_DEFINITION_ALIAS:
      {
        DataTypeDefinitionAlias dataTypeDefinitionAlias = (DataTypeDefinitionAlias)theEObject;
        T result = caseDataTypeDefinitionAlias(dataTypeDefinitionAlias);
        if (result == null) result = caseDataTypeDefinition(dataTypeDefinitionAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_DEFINITION_SET_ENUM:
      {
        DataDefinitionSetEnum dataDefinitionSetEnum = (DataDefinitionSetEnum)theEObject;
        T result = caseDataDefinitionSetEnum(dataDefinitionSetEnum);
        if (result == null) result = caseDataDefinitionSet(dataDefinitionSetEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_DEFINITION_SET_NUMBER:
      {
        DataDefinitionSetNumber dataDefinitionSetNumber = (DataDefinitionSetNumber)theEObject;
        T result = caseDataDefinitionSetNumber(dataDefinitionSetNumber);
        if (result == null) result = caseDataDefinitionSet(dataDefinitionSetNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_DEFINITION_SET_INTERVAL:
      {
        DataDefinitionSetInterval dataDefinitionSetInterval = (DataDefinitionSetInterval)theEObject;
        T result = caseDataDefinitionSetInterval(dataDefinitionSetInterval);
        if (result == null) result = caseDataDefinitionSet(dataDefinitionSetInterval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EXPRESSION_BINARY_OPERATION:
      {
        ExpressionBinaryOperation expressionBinaryOperation = (ExpressionBinaryOperation)theEObject;
        T result = caseExpressionBinaryOperation(expressionBinaryOperation);
        if (result == null) result = caseExpression(expressionBinaryOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.UNARY_OPERATION:
      {
        UnaryOperation unaryOperation = (UnaryOperation)theEObject;
        T result = caseUnaryOperation(unaryOperation);
        if (result == null) result = caseExpression(unaryOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.LITERAL_DATA:
      {
        LiteralData literalData = (LiteralData)theEObject;
        T result = caseLiteralData(literalData);
        if (result == null) result = caseExpression(literalData);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EXPRESSION_IF:
      {
        ExpressionIf expressionIf = (ExpressionIf)theEObject;
        T result = caseExpressionIf(expressionIf);
        if (result == null) result = caseExpression(expressionIf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EXPRESSION_SWITCH:
      {
        ExpressionSwitch expressionSwitch = (ExpressionSwitch)theEObject;
        T result = caseExpressionSwitch(expressionSwitch);
        if (result == null) result = caseExpression(expressionSwitch);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EXPRESSION_FOR_EACH:
      {
        ExpressionForEach expressionForEach = (ExpressionForEach)theEObject;
        T result = caseExpressionForEach(expressionForEach);
        if (result == null) result = caseExpression(expressionForEach);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EXPRESSION_FUNCTION_CALL:
      {
        ExpressionFunctionCall expressionFunctionCall = (ExpressionFunctionCall)theEObject;
        T result = caseExpressionFunctionCall(expressionFunctionCall);
        if (result == null) result = caseExpression(expressionFunctionCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.LITERAL_BOOLEAN:
      {
        LiteralBoolean literalBoolean = (LiteralBoolean)theEObject;
        T result = caseLiteralBoolean(literalBoolean);
        if (result == null) result = caseExpression(literalBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.LITERAL_NULL:
      {
        LiteralNull literalNull = (LiteralNull)theEObject;
        T result = caseLiteralNull(literalNull);
        if (result == null) result = caseExpression(literalNull);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.LITERAL_NUMBER:
      {
        LiteralNumber literalNumber = (LiteralNumber)theEObject;
        T result = caseLiteralNumber(literalNumber);
        if (result == null) result = caseExpression(literalNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.LITERAL_STRING:
      {
        LiteralString literalString = (LiteralString)theEObject;
        T result = caseLiteralString(literalString);
        if (result == null) result = caseExpression(literalString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.LITERAL_ENUM:
      {
        LiteralEnum literalEnum = (LiteralEnum)theEObject;
        T result = caseLiteralEnum(literalEnum);
        if (result == null) result = caseExpression(literalEnum);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.LITERAL_TIME:
      {
        LiteralTime literalTime = (LiteralTime)theEObject;
        T result = caseLiteralTime(literalTime);
        if (result == null) result = caseExpression(literalTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLilModel(LilModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorTypeDefinition(ActorTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorType(ActorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorComponent(ActorComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeDefinition(DataTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataType(DataType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Definition Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Definition Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataDefinitionSet(DataDefinitionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Definition Enum Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Definition Enum Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataDefinitionEnumElement(DataDefinitionEnumElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Collection Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Collection Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataCollectionType(DataCollectionType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataComponent(DataComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorTypeDefinition(InteractorTypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorType(InteractorType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorActor(InteractorActor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorData(InteractorData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Signal Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Signal Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorSignalAlias(InteractorSignalAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorComponent(InteractorComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Accessible Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Accessible Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAccessibleEntity(AccessibleEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntity(Entity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorAlias(ActorAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Signal Reception</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Signal Reception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorSignalReception(InteractorSignalReception object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Signal Emission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Signal Emission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorSignalEmission(InteractorSignalEmission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehavior(InteractorBehavior object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Cause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Cause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorCause(InteractorBehaviorCause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior On Cause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior On Cause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorOnCause(InteractorBehaviorOnCause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior When Cause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior When Cause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorWhenCause(InteractorBehaviorWhenCause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorEffect(InteractorBehaviorEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Always Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Always Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorAlwaysEffect(InteractorBehaviorAlwaysEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Set Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Set Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorSetEffect(InteractorBehaviorSetEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Trigger Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Trigger Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorTriggerEffect(InteractorBehaviorTriggerEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Literal Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Literal Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionLiteralCollection(ExpressionLiteralCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Literal Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Literal Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionLiteralSet(ExpressionLiteralSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Literal List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Literal List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionLiteralList(ExpressionLiteralList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionCase(ExpressionCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Definition Compound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Definition Compound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeDefinitionCompound(DataTypeDefinitionCompound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Definition Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Definition Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeDefinitionAlias(DataTypeDefinitionAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Definition Set Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Definition Set Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataDefinitionSetEnum(DataDefinitionSetEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Definition Set Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Definition Set Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataDefinitionSetNumber(DataDefinitionSetNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Definition Set Interval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Definition Set Interval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataDefinitionSetInterval(DataDefinitionSetInterval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Binary Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Binary Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionBinaryOperation(ExpressionBinaryOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryOperation(UnaryOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralData(LiteralData object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression If</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression If</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionIf(ExpressionIf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionSwitch(ExpressionSwitch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression For Each</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression For Each</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionForEach(ExpressionForEach object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Function Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Function Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionFunctionCall(ExpressionFunctionCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralBoolean(LiteralBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Null</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Null</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralNull(LiteralNull object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralNumber(LiteralNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal String</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal String</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralString(LiteralString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralEnum(LiteralEnum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralTime(LiteralTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //LilSwitch
