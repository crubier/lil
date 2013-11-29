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
      case LilPackage.INTERACTOR:
      {
        Interactor interactor = (Interactor)theEObject;
        T result = caseInteractor(interactor);
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
        if (result == null) result = caseEntity(actor);
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
      case LilPackage.COMPONENT:
      {
        Component component = (Component)theEObject;
        T result = caseComponent(component);
        if (result == null) result = caseEntity(component);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.SIGNAL_RECEPTION:
      {
        SignalReception signalReception = (SignalReception)theEObject;
        T result = caseSignalReception(signalReception);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.SIGNAL_EMISSION:
      {
        SignalEmission signalEmission = (SignalEmission)theEObject;
        T result = caseSignalEmission(signalEmission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.SIGNAL:
      {
        Signal signal = (Signal)theEObject;
        T result = caseSignal(signal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DEFINITION_SET:
      {
        DefinitionSet definitionSet = (DefinitionSet)theEObject;
        T result = caseDefinitionSet(definitionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.SIGNAL_ALIAS:
      {
        SignalAlias signalAlias = (SignalAlias)theEObject;
        T result = caseSignalAlias(signalAlias);
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
      case LilPackage.DATA_TYPE_DEFINITION:
      {
        DataTypeDefinition dataTypeDefinition = (DataTypeDefinition)theEObject;
        T result = caseDataTypeDefinition(dataTypeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_STRUCTURE:
      {
        DataTypeStructure dataTypeStructure = (DataTypeStructure)theEObject;
        T result = caseDataTypeStructure(dataTypeStructure);
        if (result == null) result = caseDataTypeDefinition(dataTypeStructure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.DATA_TYPE_STRUCTURE_FIELD:
      {
        DataTypeStructureField dataTypeStructureField = (DataTypeStructureField)theEObject;
        T result = caseDataTypeStructureField(dataTypeStructureField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.BEHAVIOR:
      {
        Behavior behavior = (Behavior)theEObject;
        T result = caseBehavior(behavior);
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
      case LilPackage.COLLECTION_LITERAL:
      {
        CollectionLiteral collectionLiteral = (CollectionLiteral)theEObject;
        T result = caseCollectionLiteral(collectionLiteral);
        if (result == null) result = caseExpression(collectionLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.SET_LITERAL:
      {
        SetLiteral setLiteral = (SetLiteral)theEObject;
        T result = caseSetLiteral(setLiteral);
        if (result == null) result = caseCollectionLiteral(setLiteral);
        if (result == null) result = caseExpression(setLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.LIST_LITERAL:
      {
        ListLiteral listLiteral = (ListLiteral)theEObject;
        T result = caseListLiteral(listLiteral);
        if (result == null) result = caseCollectionLiteral(listLiteral);
        if (result == null) result = caseExpression(listLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.CASE_PART:
      {
        CasePart casePart = (CasePart)theEObject;
        T result = caseCasePart(casePart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ENUM_ELEMENT:
      {
        EnumElement enumElement = (EnumElement)theEObject;
        T result = caseEnumElement(enumElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.ENUM_DEFINITION_SET:
      {
        EnumDefinitionSet enumDefinitionSet = (EnumDefinitionSet)theEObject;
        T result = caseEnumDefinitionSet(enumDefinitionSet);
        if (result == null) result = caseDefinitionSet(enumDefinitionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_DEFINITION_SET:
      {
        NumberDefinitionSet numberDefinitionSet = (NumberDefinitionSet)theEObject;
        T result = caseNumberDefinitionSet(numberDefinitionSet);
        if (result == null) result = caseDefinitionSet(numberDefinitionSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_DEFINITION_INTERVAL:
      {
        NumberDefinitionInterval numberDefinitionInterval = (NumberDefinitionInterval)theEObject;
        T result = caseNumberDefinitionInterval(numberDefinitionInterval);
        if (result == null) result = caseDefinitionSet(numberDefinitionInterval);
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
      case LilPackage.DATA_TYPE_COLLECTION:
      {
        DataTypeCollection dataTypeCollection = (DataTypeCollection)theEObject;
        T result = caseDataTypeCollection(dataTypeCollection);
        if (result == null) result = caseDataType(dataTypeCollection);
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
      case LilPackage.XBINARY_OPERATION:
      {
        XBinaryOperation xBinaryOperation = (XBinaryOperation)theEObject;
        T result = caseXBinaryOperation(xBinaryOperation);
        if (result == null) result = caseExpression(xBinaryOperation);
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
      case LilPackage.ENUM_LITERAL:
      {
        EnumLiteral enumLiteral = (EnumLiteral)theEObject;
        T result = caseEnumLiteral(enumLiteral);
        if (result == null) result = caseExpression(enumLiteral);
        if (result == null) result = caseEnumElement(enumLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.SIGNAL_LITERAL:
      {
        SignalLiteral signalLiteral = (SignalLiteral)theEObject;
        T result = caseSignalLiteral(signalLiteral);
        if (result == null) result = caseExpression(signalLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.IF_EXPRESSION:
      {
        IfExpression ifExpression = (IfExpression)theEObject;
        T result = caseIfExpression(ifExpression);
        if (result == null) result = caseExpression(ifExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.SWITCH_EXPRESSION:
      {
        SwitchExpression switchExpression = (SwitchExpression)theEObject;
        T result = caseSwitchExpression(switchExpression);
        if (result == null) result = caseExpression(switchExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.FOR_EACH_EXPRESSION:
      {
        ForEachExpression forEachExpression = (ForEachExpression)theEObject;
        T result = caseForEachExpression(forEachExpression);
        if (result == null) result = caseExpression(forEachExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.FUNCTION_CALL_EXPRESSION:
      {
        FunctionCallExpression functionCallExpression = (FunctionCallExpression)theEObject;
        T result = caseFunctionCallExpression(functionCallExpression);
        if (result == null) result = caseExpression(functionCallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseExpression(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NULL_LITERAL:
      {
        NullLiteral nullLiteral = (NullLiteral)theEObject;
        T result = caseNullLiteral(nullLiteral);
        if (result == null) result = caseExpression(nullLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseExpression(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.TIME_LITERAL_NOW:
      {
        TimeLiteralNow timeLiteralNow = (TimeLiteralNow)theEObject;
        T result = caseTimeLiteralNow(timeLiteralNow);
        if (result == null) result = caseExpression(timeLiteralNow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.TIME_LITERAL:
      {
        TimeLiteral timeLiteral = (TimeLiteral)theEObject;
        T result = caseTimeLiteral(timeLiteral);
        if (result == null) result = caseExpression(timeLiteral);
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
   * Returns the result of interpreting the object as an instance of '<em>Interactor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interactor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteractor(Interactor object)
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
   * Returns the result of interpreting the object as an instance of '<em>Signal Reception</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal Reception</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignalReception(SignalReception object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal Emission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal Emission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignalEmission(SignalEmission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignal(Signal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionSet(DefinitionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignalAlias(SignalAlias object)
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
   * Returns the result of interpreting the object as an instance of '<em>Data Type Structure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Structure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeStructure(DataTypeStructure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Structure Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Structure Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeStructureField(DataTypeStructureField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavior</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavior</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehavior(Behavior object)
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
   * Returns the result of interpreting the object as an instance of '<em>Collection Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Collection Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCollectionLiteral(CollectionLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetLiteral(SetLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListLiteral(ListLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCasePart(CasePart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumElement(EnumElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Definition Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Definition Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDefinitionSet(EnumDefinitionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Definition Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Definition Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberDefinitionSet(NumberDefinitionSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Definition Interval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Definition Interval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberDefinitionInterval(NumberDefinitionInterval object)
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
   * Returns the result of interpreting the object as an instance of '<em>XBinary Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBinary Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBinaryOperation(XBinaryOperation object)
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
   * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumLiteral(EnumLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Signal Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Signal Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSignalLiteral(SignalLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfExpression(IfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitchExpression(SwitchExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Each Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Each Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForEachExpression(ForEachExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCallExpression(FunctionCallExpression object)
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
   * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullLiteral(NullLiteral object)
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
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Literal Now</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Literal Now</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeLiteralNow(TimeLiteralNow object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimeLiteral(TimeLiteral object)
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
