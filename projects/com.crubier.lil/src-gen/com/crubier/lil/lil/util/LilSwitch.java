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
      case LilPackage.IMPORT_STATEMENT:
      {
        ImportStatement importStatement = (ImportStatement)theEObject;
        T result = caseImportStatement(importStatement);
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
      case LilPackage.ACTOR_COMPONENT_DECLARATION:
      {
        ActorComponentDeclaration actorComponentDeclaration = (ActorComponentDeclaration)theEObject;
        T result = caseActorComponentDeclaration(actorComponentDeclaration);
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
      case LilPackage.DATA_TYPE_SYMBOL_DEFINITION_SET:
      {
        DataTypeSymbolDefinitionSet dataTypeSymbolDefinitionSet = (DataTypeSymbolDefinitionSet)theEObject;
        T result = caseDataTypeSymbolDefinitionSet(dataTypeSymbolDefinitionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT:
      {
        DataTypeSymbolDefinitionSetElement dataTypeSymbolDefinitionSetElement = (DataTypeSymbolDefinitionSetElement)theEObject;
        T result = caseDataTypeSymbolDefinitionSetElement(dataTypeSymbolDefinitionSetElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_NUMBER_DEFINITION_SET:
      {
        DataTypeNumberDefinitionSet dataTypeNumberDefinitionSet = (DataTypeNumberDefinitionSet)theEObject;
        T result = caseDataTypeNumberDefinitionSet(dataTypeNumberDefinitionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_TEXT_DEFINITION_SET:
      {
        DataTypeTextDefinitionSet dataTypeTextDefinitionSet = (DataTypeTextDefinitionSet)theEObject;
        T result = caseDataTypeTextDefinitionSet(dataTypeTextDefinitionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_TIME_DEFINITION_SET:
      {
        DataTypeTimeDefinitionSet dataTypeTimeDefinitionSet = (DataTypeTimeDefinitionSet)theEObject;
        T result = caseDataTypeTimeDefinitionSet(dataTypeTimeDefinitionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_IDENTIFIER_DEFINITION_SET:
      {
        DataTypeIdentifierDefinitionSet dataTypeIdentifierDefinitionSet = (DataTypeIdentifierDefinitionSet)theEObject;
        T result = caseDataTypeIdentifierDefinitionSet(dataTypeIdentifierDefinitionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_COMPONENT_DECLARATION:
      {
        DataComponentDeclaration dataComponentDeclaration = (DataComponentDeclaration)theEObject;
        T result = caseDataComponentDeclaration(dataComponentDeclaration);
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
      case LilPackage.INTERACTOR_ENTITY_DECLARATION:
      {
        InteractorEntityDeclaration interactorEntityDeclaration = (InteractorEntityDeclaration)theEObject;
        T result = caseInteractorEntityDeclaration(interactorEntityDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_DECLARATION:
      {
        InteractorDataDeclaration interactorDataDeclaration = (InteractorDataDeclaration)theEObject;
        T result = caseInteractorDataDeclaration(interactorDataDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ACTOR_ALIAS:
      {
        InteractorActorAlias interactorActorAlias = (InteractorActorAlias)theEObject;
        T result = caseInteractorActorAlias(interactorActorAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_ALIAS:
      {
        InteractorDataAlias interactorDataAlias = (InteractorDataAlias)theEObject;
        T result = caseInteractorDataAlias(interactorDataAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY:
      {
        InteractorEntity interactorEntity = (InteractorEntity)theEObject;
        T result = caseInteractorEntity(interactorEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_RECEPTION:
      {
        InteractorDataReception interactorDataReception = (InteractorDataReception)theEObject;
        T result = caseInteractorDataReception(interactorDataReception);
        if (result == null) result = caseExpression(interactorDataReception);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_EMISSION:
      {
        InteractorDataEmission interactorDataEmission = (InteractorDataEmission)theEObject;
        T result = caseInteractorDataEmission(interactorDataEmission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION:
      {
        InteractorBehaviorDeclaration interactorBehaviorDeclaration = (InteractorBehaviorDeclaration)theEObject;
        T result = caseInteractorBehaviorDeclaration(interactorBehaviorDeclaration);
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
      case LilPackage.INTERACTOR_BEHAVIOR_EFFECT:
      {
        InteractorBehaviorEffect interactorBehaviorEffect = (InteractorBehaviorEffect)theEObject;
        T result = caseInteractorBehaviorEffect(interactorBehaviorEffect);
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
      case LilPackage.ACTOR_TYPE_INPUT:
      {
        ActorTypeInput actorTypeInput = (ActorTypeInput)theEObject;
        T result = caseActorTypeInput(actorTypeInput);
        if (result == null) result = caseActorType(actorTypeInput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ACTOR_TYPE_OUTPUT:
      {
        ActorTypeOutput actorTypeOutput = (ActorTypeOutput)theEObject;
        T result = caseActorTypeOutput(actorTypeOutput);
        if (result == null) result = caseActorType(actorTypeOutput);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ACTOR_TYPE_CUSTOM:
      {
        ActorTypeCustom actorTypeCustom = (ActorTypeCustom)theEObject;
        T result = caseActorTypeCustom(actorTypeCustom);
        if (result == null) result = caseActorType(actorTypeCustom);
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
      case LilPackage.DATA_TYPE_VOID:
      {
        DataTypeVoid dataTypeVoid = (DataTypeVoid)theEObject;
        T result = caseDataTypeVoid(dataTypeVoid);
        if (result == null) result = caseDataType(dataTypeVoid);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_BOOLEAN:
      {
        DataTypeBoolean dataTypeBoolean = (DataTypeBoolean)theEObject;
        T result = caseDataTypeBoolean(dataTypeBoolean);
        if (result == null) result = caseDataType(dataTypeBoolean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_SYMBOL:
      {
        DataTypeSymbol dataTypeSymbol = (DataTypeSymbol)theEObject;
        T result = caseDataTypeSymbol(dataTypeSymbol);
        if (result == null) result = caseDataType(dataTypeSymbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_NUMBER:
      {
        DataTypeNumber dataTypeNumber = (DataTypeNumber)theEObject;
        T result = caseDataTypeNumber(dataTypeNumber);
        if (result == null) result = caseDataType(dataTypeNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_TEXT:
      {
        DataTypeText dataTypeText = (DataTypeText)theEObject;
        T result = caseDataTypeText(dataTypeText);
        if (result == null) result = caseDataType(dataTypeText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_TIME:
      {
        DataTypeTime dataTypeTime = (DataTypeTime)theEObject;
        T result = caseDataTypeTime(dataTypeTime);
        if (result == null) result = caseDataType(dataTypeTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_IDENTIFIER:
      {
        DataTypeIdentifier dataTypeIdentifier = (DataTypeIdentifier)theEObject;
        T result = caseDataTypeIdentifier(dataTypeIdentifier);
        if (result == null) result = caseDataType(dataTypeIdentifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_CUSTOM:
      {
        DataTypeCustom dataTypeCustom = (DataTypeCustom)theEObject;
        T result = caseDataTypeCustom(dataTypeCustom);
        if (result == null) result = caseDataType(dataTypeCustom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_COLLECTION:
      {
        DataTypeCollection dataTypeCollection = (DataTypeCollection)theEObject;
        T result = caseDataTypeCollection(dataTypeCollection);
        if (result == null) result = caseDataType(dataTypeCollection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_SET:
      {
        DataTypeSet dataTypeSet = (DataTypeSet)theEObject;
        T result = caseDataTypeSet(dataTypeSet);
        if (result == null) result = caseDataType(dataTypeSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_LIST:
      {
        DataTypeList dataTypeList = (DataTypeList)theEObject;
        T result = caseDataTypeList(dataTypeList);
        if (result == null) result = caseDataType(dataTypeList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_QUEUE:
      {
        DataTypeQueue dataTypeQueue = (DataTypeQueue)theEObject;
        T result = caseDataTypeQueue(dataTypeQueue);
        if (result == null) result = caseDataType(dataTypeQueue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_NUMBER_DEFINITION_SET_SET:
      {
        DataTypeNumberDefinitionSetSet dataTypeNumberDefinitionSetSet = (DataTypeNumberDefinitionSetSet)theEObject;
        T result = caseDataTypeNumberDefinitionSetSet(dataTypeNumberDefinitionSetSet);
        if (result == null) result = caseDataTypeNumberDefinitionSet(dataTypeNumberDefinitionSetSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL:
      {
        DataTypeNumberDefinitionSetInterval dataTypeNumberDefinitionSetInterval = (DataTypeNumberDefinitionSetInterval)theEObject;
        T result = caseDataTypeNumberDefinitionSetInterval(dataTypeNumberDefinitionSetInterval);
        if (result == null) result = caseDataTypeNumberDefinitionSet(dataTypeNumberDefinitionSetInterval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_TEXT_DEFINITION_SET_SET:
      {
        DataTypeTextDefinitionSetSet dataTypeTextDefinitionSetSet = (DataTypeTextDefinitionSetSet)theEObject;
        T result = caseDataTypeTextDefinitionSetSet(dataTypeTextDefinitionSetSet);
        if (result == null) result = caseDataTypeTextDefinitionSet(dataTypeTextDefinitionSetSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_TIME_DEFINITION_SET_SET:
      {
        DataTypeTimeDefinitionSetSet dataTypeTimeDefinitionSetSet = (DataTypeTimeDefinitionSetSet)theEObject;
        T result = caseDataTypeTimeDefinitionSetSet(dataTypeTimeDefinitionSetSet);
        if (result == null) result = caseDataTypeTimeDefinitionSet(dataTypeTimeDefinitionSetSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_TIME_DEFINITION_SET_INTERVAL:
      {
        DataTypeTimeDefinitionSetInterval dataTypeTimeDefinitionSetInterval = (DataTypeTimeDefinitionSetInterval)theEObject;
        T result = caseDataTypeTimeDefinitionSetInterval(dataTypeTimeDefinitionSetInterval);
        if (result == null) result = caseDataTypeTimeDefinitionSet(dataTypeTimeDefinitionSetInterval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_IDENTIFIER_DEFINITION_SET_SET:
      {
        DataTypeIdentifierDefinitionSetSet dataTypeIdentifierDefinitionSetSet = (DataTypeIdentifierDefinitionSetSet)theEObject;
        T result = caseDataTypeIdentifierDefinitionSetSet(dataTypeIdentifierDefinitionSetSet);
        if (result == null) result = caseDataTypeIdentifierDefinitionSet(dataTypeIdentifierDefinitionSetSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_TYPE_CUSTOM:
      {
        InteractorTypeCustom interactorTypeCustom = (InteractorTypeCustom)theEObject;
        T result = caseInteractorTypeCustom(interactorTypeCustom);
        if (result == null) result = caseInteractorType(interactorTypeCustom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ACTOR_DECLARATION:
      {
        InteractorActorDeclaration interactorActorDeclaration = (InteractorActorDeclaration)theEObject;
        T result = caseInteractorActorDeclaration(interactorActorDeclaration);
        if (result == null) result = caseInteractorEntityDeclaration(interactorActorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_INTERACTOR_DECLARATION:
      {
        InteractorInteractorDeclaration interactorInteractorDeclaration = (InteractorInteractorDeclaration)theEObject;
        T result = caseInteractorInteractorDeclaration(interactorInteractorDeclaration);
        if (result == null) result = caseInteractorEntityDeclaration(interactorInteractorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_DECLARATION_EVENT:
      {
        InteractorDataDeclarationEvent interactorDataDeclarationEvent = (InteractorDataDeclarationEvent)theEObject;
        T result = caseInteractorDataDeclarationEvent(interactorDataDeclarationEvent);
        if (result == null) result = caseInteractorDataDeclaration(interactorDataDeclarationEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_DECLARATION_FLOW:
      {
        InteractorDataDeclarationFlow interactorDataDeclarationFlow = (InteractorDataDeclarationFlow)theEObject;
        T result = caseInteractorDataDeclarationFlow(interactorDataDeclarationFlow);
        if (result == null) result = caseInteractorDataDeclaration(interactorDataDeclarationFlow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_DECLARATION_CONSTANT:
      {
        InteractorDataDeclarationConstant interactorDataDeclarationConstant = (InteractorDataDeclarationConstant)theEObject;
        T result = caseInteractorDataDeclarationConstant(interactorDataDeclarationConstant);
        if (result == null) result = caseInteractorDataDeclaration(interactorDataDeclarationConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY_ANY:
      {
        InteractorEntityAny interactorEntityAny = (InteractorEntityAny)theEObject;
        T result = caseInteractorEntityAny(interactorEntityAny);
        if (result == null) result = caseInteractorEntity(interactorEntityAny);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY_SELF:
      {
        InteractorEntitySelf interactorEntitySelf = (InteractorEntitySelf)theEObject;
        T result = caseInteractorEntitySelf(interactorEntitySelf);
        if (result == null) result = caseInteractorEntity(interactorEntitySelf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY_OTHER:
      {
        InteractorEntityOther interactorEntityOther = (InteractorEntityOther)theEObject;
        T result = caseInteractorEntityOther(interactorEntityOther);
        if (result == null) result = caseInteractorEntity(interactorEntityOther);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY_PARENT:
      {
        InteractorEntityParent interactorEntityParent = (InteractorEntityParent)theEObject;
        T result = caseInteractorEntityParent(interactorEntityParent);
        if (result == null) result = caseInteractorEntity(interactorEntityParent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY_CHILD:
      {
        InteractorEntityChild interactorEntityChild = (InteractorEntityChild)theEObject;
        T result = caseInteractorEntityChild(interactorEntityChild);
        if (result == null) result = caseInteractorEntity(interactorEntityChild);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY_ALL:
      {
        InteractorEntityAll interactorEntityAll = (InteractorEntityAll)theEObject;
        T result = caseInteractorEntityAll(interactorEntityAll);
        if (result == null) result = caseInteractorEntity(interactorEntityAll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY_ACTORS:
      {
        InteractorEntityActors interactorEntityActors = (InteractorEntityActors)theEObject;
        T result = caseInteractorEntityActors(interactorEntityActors);
        if (result == null) result = caseInteractorEntity(interactorEntityActors);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY_SPECIFIC:
      {
        InteractorEntitySpecific interactorEntitySpecific = (InteractorEntitySpecific)theEObject;
        T result = caseInteractorEntitySpecific(interactorEntitySpecific);
        if (result == null) result = caseInteractorEntity(interactorEntitySpecific);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY_ACTOR:
      {
        InteractorEntityActor interactorEntityActor = (InteractorEntityActor)theEObject;
        T result = caseInteractorEntityActor(interactorEntityActor);
        if (result == null) result = caseInteractorEntity(interactorEntityActor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_ENTITY_INTERACTOR:
      {
        InteractorEntityInteractor interactorEntityInteractor = (InteractorEntityInteractor)theEObject;
        T result = caseInteractorEntityInteractor(interactorEntityInteractor);
        if (result == null) result = caseInteractorEntity(interactorEntityInteractor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_RECEPTION_INTERNAL:
      {
        InteractorDataReceptionInternal interactorDataReceptionInternal = (InteractorDataReceptionInternal)theEObject;
        T result = caseInteractorDataReceptionInternal(interactorDataReceptionInternal);
        if (result == null) result = caseInteractorDataReception(interactorDataReceptionInternal);
        if (result == null) result = caseExpression(interactorDataReceptionInternal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL:
      {
        InteractorDataReceptionExternal interactorDataReceptionExternal = (InteractorDataReceptionExternal)theEObject;
        T result = caseInteractorDataReceptionExternal(interactorDataReceptionExternal);
        if (result == null) result = caseInteractorDataReception(interactorDataReceptionExternal);
        if (result == null) result = caseExpression(interactorDataReceptionExternal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_RECEPTION_INITIALIZATION:
      {
        InteractorDataReceptionInitialization interactorDataReceptionInitialization = (InteractorDataReceptionInitialization)theEObject;
        T result = caseInteractorDataReceptionInitialization(interactorDataReceptionInitialization);
        if (result == null) result = caseInteractorDataReception(interactorDataReceptionInitialization);
        if (result == null) result = caseExpression(interactorDataReceptionInitialization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_EMISSION_INTERNAL:
      {
        InteractorDataEmissionInternal interactorDataEmissionInternal = (InteractorDataEmissionInternal)theEObject;
        T result = caseInteractorDataEmissionInternal(interactorDataEmissionInternal);
        if (result == null) result = caseInteractorDataEmission(interactorDataEmissionInternal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DATA_EMISSION_EXTERNAL:
      {
        InteractorDataEmissionExternal interactorDataEmissionExternal = (InteractorDataEmissionExternal)theEObject;
        T result = caseInteractorDataEmissionExternal(interactorDataEmissionExternal);
        if (result == null) result = caseInteractorDataEmission(interactorDataEmissionExternal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_CAUSE_ON:
      {
        InteractorBehaviorCauseOn interactorBehaviorCauseOn = (InteractorBehaviorCauseOn)theEObject;
        T result = caseInteractorBehaviorCauseOn(interactorBehaviorCauseOn);
        if (result == null) result = caseInteractorBehaviorCause(interactorBehaviorCauseOn);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_CAUSE_WHEN:
      {
        InteractorBehaviorCauseWhen interactorBehaviorCauseWhen = (InteractorBehaviorCauseWhen)theEObject;
        T result = caseInteractorBehaviorCauseWhen(interactorBehaviorCauseWhen);
        if (result == null) result = caseInteractorBehaviorCause(interactorBehaviorCauseWhen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_EFFECT_ALWAYS:
      {
        InteractorBehaviorEffectAlways interactorBehaviorEffectAlways = (InteractorBehaviorEffectAlways)theEObject;
        T result = caseInteractorBehaviorEffectAlways(interactorBehaviorEffectAlways);
        if (result == null) result = caseInteractorBehaviorEffect(interactorBehaviorEffectAlways);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_EFFECT_SET:
      {
        InteractorBehaviorEffectSet interactorBehaviorEffectSet = (InteractorBehaviorEffectSet)theEObject;
        T result = caseInteractorBehaviorEffectSet(interactorBehaviorEffectSet);
        if (result == null) result = caseInteractorBehaviorEffect(interactorBehaviorEffectSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_BEHAVIOR_EFFECT_TRIGGER:
      {
        InteractorBehaviorEffectTrigger interactorBehaviorEffectTrigger = (InteractorBehaviorEffectTrigger)theEObject;
        T result = caseInteractorBehaviorEffectTrigger(interactorBehaviorEffectTrigger);
        if (result == null) result = caseInteractorBehaviorEffect(interactorBehaviorEffectTrigger);
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
      case LilPackage.LITERAL_TEXT:
      {
        LiteralText literalText = (LiteralText)theEObject;
        T result = caseLiteralText(literalText);
        if (result == null) result = caseExpression(literalText);
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
      case LilPackage.LITERAL_TIME_NOW:
      {
        LiteralTimeNow literalTimeNow = (LiteralTimeNow)theEObject;
        T result = caseLiteralTimeNow(literalTimeNow);
        if (result == null) result = caseExpression(literalTimeNow);
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
   * Returns the result of interpreting the object as an instance of '<em>Import Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportStatement(ImportStatement object)
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
   * Returns the result of interpreting the object as an instance of '<em>Actor Component Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Component Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorComponentDeclaration(ActorComponentDeclaration object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Type Symbol Definition Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Symbol Definition Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeSymbolDefinitionSet(DataTypeSymbolDefinitionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Symbol Definition Set Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Symbol Definition Set Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeSymbolDefinitionSetElement(DataTypeSymbolDefinitionSetElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Number Definition Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Number Definition Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeNumberDefinitionSet(DataTypeNumberDefinitionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Text Definition Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Text Definition Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeTextDefinitionSet(DataTypeTextDefinitionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Time Definition Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Time Definition Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeTimeDefinitionSet(DataTypeTimeDefinitionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Identifier Definition Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Identifier Definition Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeIdentifierDefinitionSet(DataTypeIdentifierDefinitionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Component Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Component Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataComponentDeclaration(DataComponentDeclaration object)
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
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntityDeclaration(InteractorEntityDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataDeclaration(InteractorDataDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Actor Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Actor Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorActorAlias(InteractorActorAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataAlias(InteractorDataAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntity(InteractorEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Reception</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Reception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataReception(InteractorDataReception object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Emission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Emission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataEmission(InteractorDataEmission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorDeclaration(InteractorBehaviorDeclaration object)
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
   * Returns the result of interpreting the object as an instance of '<em>Actor Type Input</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Type Input</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorTypeInput(ActorTypeInput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Type Output</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Type Output</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorTypeOutput(ActorTypeOutput object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Type Custom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Type Custom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorTypeCustom(ActorTypeCustom object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Type Void</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Void</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeVoid(DataTypeVoid object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeBoolean(DataTypeBoolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeSymbol(DataTypeSymbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeNumber(DataTypeNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeText(DataTypeText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeTime(DataTypeTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Identifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Identifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeIdentifier(DataTypeIdentifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Custom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Custom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeCustom(DataTypeCustom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Collection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Collection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeCollection(DataTypeCollection object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeSet(DataTypeSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeList(DataTypeList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Queue</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Queue</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeQueue(DataTypeQueue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Number Definition Set Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Number Definition Set Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeNumberDefinitionSetSet(DataTypeNumberDefinitionSetSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Number Definition Set Interval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Number Definition Set Interval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeNumberDefinitionSetInterval(DataTypeNumberDefinitionSetInterval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Text Definition Set Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Text Definition Set Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeTextDefinitionSetSet(DataTypeTextDefinitionSetSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Time Definition Set Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Time Definition Set Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeTimeDefinitionSetSet(DataTypeTimeDefinitionSetSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Time Definition Set Interval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Time Definition Set Interval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeTimeDefinitionSetInterval(DataTypeTimeDefinitionSetInterval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Identifier Definition Set Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Identifier Definition Set Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeIdentifierDefinitionSetSet(DataTypeIdentifierDefinitionSetSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Type Custom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Type Custom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorTypeCustom(InteractorTypeCustom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Actor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Actor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorActorDeclaration(InteractorActorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Interactor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Interactor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorInteractorDeclaration(InteractorInteractorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Declaration Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Declaration Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataDeclarationEvent(InteractorDataDeclarationEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Declaration Flow</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Declaration Flow</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataDeclarationFlow(InteractorDataDeclarationFlow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Declaration Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Declaration Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataDeclarationConstant(InteractorDataDeclarationConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity Any</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity Any</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntityAny(InteractorEntityAny object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity Self</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity Self</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntitySelf(InteractorEntitySelf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity Other</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity Other</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntityOther(InteractorEntityOther object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity Parent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity Parent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntityParent(InteractorEntityParent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity Child</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntityChild(InteractorEntityChild object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity All</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity All</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntityAll(InteractorEntityAll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity Actors</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity Actors</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntityActors(InteractorEntityActors object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity Specific</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity Specific</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntitySpecific(InteractorEntitySpecific object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntityActor(InteractorEntityActor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Entity Interactor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Entity Interactor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorEntityInteractor(InteractorEntityInteractor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Reception Internal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Reception Internal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataReceptionInternal(InteractorDataReceptionInternal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Reception External</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Reception External</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataReceptionExternal(InteractorDataReceptionExternal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Reception Initialization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Reception Initialization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataReceptionInitialization(InteractorDataReceptionInitialization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Emission Internal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Emission Internal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataEmissionInternal(InteractorDataEmissionInternal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Data Emission External</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Data Emission External</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDataEmissionExternal(InteractorDataEmissionExternal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Cause On</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Cause On</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorCauseOn(InteractorBehaviorCauseOn object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Cause When</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Cause When</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorCauseWhen(InteractorBehaviorCauseWhen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Effect Always</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Effect Always</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorEffectAlways(InteractorBehaviorEffectAlways object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Effect Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Effect Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorEffectSet(InteractorBehaviorEffectSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Behavior Effect Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Behavior Effect Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorBehaviorEffectTrigger(InteractorBehaviorEffectTrigger object)
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
   * Returns the result of interpreting the object as an instance of '<em>Literal Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralText(LiteralText object)
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
   * Returns the result of interpreting the object as an instance of '<em>Literal Time Now</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Time Now</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteralTimeNow(LiteralTimeNow object)
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
