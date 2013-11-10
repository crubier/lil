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
      case LilPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.INTERACTOR_DECLARATION:
      {
        InteractorDeclaration interactorDeclaration = (InteractorDeclaration)theEObject;
        T result = caseInteractorDeclaration(interactorDeclaration);
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
      case LilPackage.ACTOR:
      {
        Actor actor = (Actor)theEObject;
        T result = caseActor(actor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ENTITY_DECLARATION:
      {
        EntityDeclaration entityDeclaration = (EntityDeclaration)theEObject;
        T result = caseEntityDeclaration(entityDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ACTOR_DECLARATION:
      {
        ActorDeclaration actorDeclaration = (ActorDeclaration)theEObject;
        T result = caseActorDeclaration(actorDeclaration);
        if (result == null) result = caseEntityDeclaration(actorDeclaration);
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
      case LilPackage.COMPONENT_DECLARATION:
      {
        ComponentDeclaration componentDeclaration = (ComponentDeclaration)theEObject;
        T result = caseComponentDeclaration(componentDeclaration);
        if (result == null) result = caseEntityDeclaration(componentDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EVENT_RECEPTION:
      {
        EventReception eventReception = (EventReception)theEObject;
        T result = caseEventReception(eventReception);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.FLOW_RECEPTION:
      {
        FlowReception flowReception = (FlowReception)theEObject;
        T result = caseFlowReception(flowReception);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EVENT_EMISSION:
      {
        EventEmission eventEmission = (EventEmission)theEObject;
        T result = caseEventEmission(eventEmission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.FLOW_EMISSION:
      {
        FlowEmission flowEmission = (FlowEmission)theEObject;
        T result = caseFlowEmission(flowEmission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.SIGNAL_DECLARATION:
      {
        SignalDeclaration signalDeclaration = (SignalDeclaration)theEObject;
        T result = caseSignalDeclaration(signalDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EVENT_DECLARATION:
      {
        EventDeclaration eventDeclaration = (EventDeclaration)theEObject;
        T result = caseEventDeclaration(eventDeclaration);
        if (result == null) result = caseSignalDeclaration(eventDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.FLOW_DECLARATION:
      {
        FlowDeclaration flowDeclaration = (FlowDeclaration)theEObject;
        T result = caseFlowDeclaration(flowDeclaration);
        if (result == null) result = caseSignalDeclaration(flowDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.BEHAVIOR_DECLARATION:
      {
        BehaviorDeclaration behaviorDeclaration = (BehaviorDeclaration)theEObject;
        T result = caseBehaviorDeclaration(behaviorDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.CAUSE:
      {
        Cause cause = (Cause)theEObject;
        T result = caseCause(cause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ON_CAUSE:
      {
        OnCause onCause = (OnCause)theEObject;
        T result = caseOnCause(onCause);
        if (result == null) result = caseCause(onCause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.WHEN_CAUSE:
      {
        WhenCause whenCause = (WhenCause)theEObject;
        T result = caseWhenCause(whenCause);
        if (result == null) result = caseCause(whenCause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.EFFECT:
      {
        Effect effect = (Effect)theEObject;
        T result = caseEffect(effect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ALWAYS_EFFECT:
      {
        AlwaysEffect alwaysEffect = (AlwaysEffect)theEObject;
        T result = caseAlwaysEffect(alwaysEffect);
        if (result == null) result = caseEffect(alwaysEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.SET_EFFECT:
      {
        SetEffect setEffect = (SetEffect)theEObject;
        T result = caseSetEffect(setEffect);
        if (result == null) result = caseEffect(setEffect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.TRIGGER_EFFECT:
      {
        TriggerEffect triggerEffect = (TriggerEffect)theEObject;
        T result = caseTriggerEffect(triggerEffect);
        if (result == null) result = caseEffect(triggerEffect);
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
      case LilPackage.DATA_TYPE_COMPOUND_DECLARATION:
      {
        DataTypeCompoundDeclaration dataTypeCompoundDeclaration = (DataTypeCompoundDeclaration)theEObject;
        T result = caseDataTypeCompoundDeclaration(dataTypeCompoundDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_COMPOUND_FIELD:
      {
        DataTypeCompoundField dataTypeCompoundField = (DataTypeCompoundField)theEObject;
        T result = caseDataTypeCompoundField(dataTypeCompoundField);
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
      case LilPackage.BOOLEAN_EXPRESSION:
      {
        BooleanExpression booleanExpression = (BooleanExpression)theEObject;
        T result = caseBooleanExpression(booleanExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_EXPRESSION:
      {
        NumberExpression numberExpression = (NumberExpression)theEObject;
        T result = caseNumberExpression(numberExpression);
        if (result == null) result = caseExpression(numberExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE:
      {
        NumberSwitchExpressionNumberCase numberSwitchExpressionNumberCase = (NumberSwitchExpressionNumberCase)theEObject;
        T result = caseNumberSwitchExpressionNumberCase(numberSwitchExpressionNumberCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_SWITCH_EXPRESSION_TEXT_CASE:
      {
        NumberSwitchExpressionTextCase numberSwitchExpressionTextCase = (NumberSwitchExpressionTextCase)theEObject;
        T result = caseNumberSwitchExpressionTextCase(numberSwitchExpressionTextCase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.TEXT_EXPRESSION:
      {
        TextExpression textExpression = (TextExpression)theEObject;
        T result = caseTextExpression(textExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_COMPOUND:
      {
        DataTypeCompound dataTypeCompound = (DataTypeCompound)theEObject;
        T result = caseDataTypeCompound(dataTypeCompound);
        if (result == null) result = caseDataType(dataTypeCompound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_BASE:
      {
        DataTypeBase dataTypeBase = (DataTypeBase)theEObject;
        T result = caseDataTypeBase(dataTypeBase);
        if (result == null) result = caseDataType(dataTypeBase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.BOOLEAN_DISJONCTION:
      {
        BooleanDisjonction booleanDisjonction = (BooleanDisjonction)theEObject;
        T result = caseBooleanDisjonction(booleanDisjonction);
        if (result == null) result = caseBooleanExpression(booleanDisjonction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.BOOLEAN_CONJONCTION:
      {
        BooleanConjonction booleanConjonction = (BooleanConjonction)theEObject;
        T result = caseBooleanConjonction(booleanConjonction);
        if (result == null) result = caseBooleanExpression(booleanConjonction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.BOOLEAN_NEGATION:
      {
        BooleanNegation booleanNegation = (BooleanNegation)theEObject;
        T result = caseBooleanNegation(booleanNegation);
        if (result == null) result = caseBooleanExpression(booleanNegation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseBooleanExpression(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.BOOLEAN_NUMBER_COMPARISON:
      {
        BooleanNumberComparison booleanNumberComparison = (BooleanNumberComparison)theEObject;
        T result = caseBooleanNumberComparison(booleanNumberComparison);
        if (result == null) result = caseBooleanExpression(booleanNumberComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_IF_EXPRESSION:
      {
        NumberIfExpression numberIfExpression = (NumberIfExpression)theEObject;
        T result = caseNumberIfExpression(numberIfExpression);
        if (result == null) result = caseNumberExpression(numberIfExpression);
        if (result == null) result = caseExpression(numberIfExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER:
      {
        NumberSwitchExpressionNumber numberSwitchExpressionNumber = (NumberSwitchExpressionNumber)theEObject;
        T result = caseNumberSwitchExpressionNumber(numberSwitchExpressionNumber);
        if (result == null) result = caseNumberExpression(numberSwitchExpressionNumber);
        if (result == null) result = caseExpression(numberSwitchExpressionNumber);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_SWITCH_EXPRESSION_TEXT:
      {
        NumberSwitchExpressionText numberSwitchExpressionText = (NumberSwitchExpressionText)theEObject;
        T result = caseNumberSwitchExpressionText(numberSwitchExpressionText);
        if (result == null) result = caseNumberExpression(numberSwitchExpressionText);
        if (result == null) result = caseExpression(numberSwitchExpressionText);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_ADDITION:
      {
        NumberAddition numberAddition = (NumberAddition)theEObject;
        T result = caseNumberAddition(numberAddition);
        if (result == null) result = caseNumberExpression(numberAddition);
        if (result == null) result = caseExpression(numberAddition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_SUBSTRACTION:
      {
        NumberSubstraction numberSubstraction = (NumberSubstraction)theEObject;
        T result = caseNumberSubstraction(numberSubstraction);
        if (result == null) result = caseNumberExpression(numberSubstraction);
        if (result == null) result = caseExpression(numberSubstraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_MULTIPLICATION:
      {
        NumberMultiplication numberMultiplication = (NumberMultiplication)theEObject;
        T result = caseNumberMultiplication(numberMultiplication);
        if (result == null) result = caseNumberExpression(numberMultiplication);
        if (result == null) result = caseExpression(numberMultiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_DIVISION:
      {
        NumberDivision numberDivision = (NumberDivision)theEObject;
        T result = caseNumberDivision(numberDivision);
        if (result == null) result = caseNumberExpression(numberDivision);
        if (result == null) result = caseExpression(numberDivision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_MODULO:
      {
        NumberModulo numberModulo = (NumberModulo)theEObject;
        T result = caseNumberModulo(numberModulo);
        if (result == null) result = caseNumberExpression(numberModulo);
        if (result == null) result = caseExpression(numberModulo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_POWER:
      {
        NumberPower numberPower = (NumberPower)theEObject;
        T result = caseNumberPower(numberPower);
        if (result == null) result = caseNumberExpression(numberPower);
        if (result == null) result = caseExpression(numberPower);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_OPPOSITION:
      {
        NumberOpposition numberOpposition = (NumberOpposition)theEObject;
        T result = caseNumberOpposition(numberOpposition);
        if (result == null) result = caseNumberExpression(numberOpposition);
        if (result == null) result = caseExpression(numberOpposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseNumberExpression(numberLiteral);
        if (result == null) result = caseExpression(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_FUNCTION_EXPRESSION:
      {
        NumberFunctionExpression numberFunctionExpression = (NumberFunctionExpression)theEObject;
        T result = caseNumberFunctionExpression(numberFunctionExpression);
        if (result == null) result = caseNumberExpression(numberFunctionExpression);
        if (result == null) result = caseExpression(numberFunctionExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.TEXT_JOIN:
      {
        TextJoin textJoin = (TextJoin)theEObject;
        T result = caseTextJoin(textJoin);
        if (result == null) result = caseTextExpression(textJoin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.TEXT_LITERAL:
      {
        TextLiteral textLiteral = (TextLiteral)theEObject;
        T result = caseTextLiteral(textLiteral);
        if (result == null) result = caseTextExpression(textLiteral);
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
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interactor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractorDeclaration(InteractorDeclaration object)
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
   * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActor(Actor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponent(Component object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityDeclaration(EntityDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actor Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actor Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActorDeclaration(ActorDeclaration object)
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
   * Returns the result of interpreting the object as an instance of '<em>Component Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Component Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComponentDeclaration(ComponentDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Reception</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Reception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventReception(EventReception object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Reception</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Reception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowReception(FlowReception object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Emission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Emission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventEmission(EventEmission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Emission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Emission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowEmission(FlowEmission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignalDeclaration(SignalDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventDeclaration(EventDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowDeclaration(FlowDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehaviorDeclaration(BehaviorDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCause(Cause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>On Cause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>On Cause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnCause(OnCause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Cause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Cause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenCause(WhenCause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffect(Effect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Always Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Always Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlwaysEffect(AlwaysEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetEffect(SetEffect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Trigger Effect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Trigger Effect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTriggerEffect(TriggerEffect object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Type Compound Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Compound Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeCompoundDeclaration(DataTypeCompoundDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Compound Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Compound Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeCompoundField(DataTypeCompoundField object)
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
   * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanExpression(BooleanExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberExpression(NumberExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Switch Expression Number Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Switch Expression Number Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberSwitchExpressionNumberCase(NumberSwitchExpressionNumberCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Switch Expression Text Case</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Switch Expression Text Case</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberSwitchExpressionTextCase(NumberSwitchExpressionTextCase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextExpression(TextExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Compound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Compound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeCompound(DataTypeCompound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Base</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Base</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeBase(DataTypeBase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Disjonction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Disjonction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanDisjonction(BooleanDisjonction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Conjonction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Conjonction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanConjonction(BooleanConjonction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Negation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Negation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanNegation(BooleanNegation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Number Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Number Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanNumberComparison(BooleanNumberComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number If Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number If Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberIfExpression(NumberIfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Switch Expression Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Switch Expression Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberSwitchExpressionNumber(NumberSwitchExpressionNumber object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Switch Expression Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Switch Expression Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberSwitchExpressionText(NumberSwitchExpressionText object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Addition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Addition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberAddition(NumberAddition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Substraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Substraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberSubstraction(NumberSubstraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberMultiplication(NumberMultiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Division</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Division</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberDivision(NumberDivision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Modulo</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Modulo</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberModulo(NumberModulo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Power</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Power</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberPower(NumberPower object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Opposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Opposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberOpposition(NumberOpposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Function Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Function Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberFunctionExpression(NumberFunctionExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Join</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Join</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextJoin(TextJoin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextLiteral(TextLiteral object)
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
