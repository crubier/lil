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
      case LilPackage.SIGNAL_DECLARATION:
      {
        SignalDeclaration signalDeclaration = (SignalDeclaration)theEObject;
        T result = caseSignalDeclaration(signalDeclaration);
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
      case LilPackage.XEXPRESSION:
      {
        XExpression xExpression = (XExpression)theEObject;
        T result = caseXExpression(xExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XCOLLECTION_LITERAL:
      {
        XCollectionLiteral xCollectionLiteral = (XCollectionLiteral)theEObject;
        T result = caseXCollectionLiteral(xCollectionLiteral);
        if (result == null) result = caseXExpression(xCollectionLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XSET_LITERAL:
      {
        XSetLiteral xSetLiteral = (XSetLiteral)theEObject;
        T result = caseXSetLiteral(xSetLiteral);
        if (result == null) result = caseXCollectionLiteral(xSetLiteral);
        if (result == null) result = caseXExpression(xSetLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XLIST_LITERAL:
      {
        XListLiteral xListLiteral = (XListLiteral)theEObject;
        T result = caseXListLiteral(xListLiteral);
        if (result == null) result = caseXCollectionLiteral(xListLiteral);
        if (result == null) result = caseXExpression(xListLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XCASE_PART:
      {
        XCasePart xCasePart = (XCasePart)theEObject;
        T result = caseXCasePart(xCasePart);
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
      case LilPackage.XBINARY_OPERATION:
      {
        XBinaryOperation xBinaryOperation = (XBinaryOperation)theEObject;
        T result = caseXBinaryOperation(xBinaryOperation);
        if (result == null) result = caseXExpression(xBinaryOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XUNARY_OPERATION:
      {
        XUnaryOperation xUnaryOperation = (XUnaryOperation)theEObject;
        T result = caseXUnaryOperation(xUnaryOperation);
        if (result == null) result = caseXExpression(xUnaryOperation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XIF_EXPRESSION:
      {
        XIfExpression xIfExpression = (XIfExpression)theEObject;
        T result = caseXIfExpression(xIfExpression);
        if (result == null) result = caseXExpression(xIfExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XSWITCH_EXPRESSION:
      {
        XSwitchExpression xSwitchExpression = (XSwitchExpression)theEObject;
        T result = caseXSwitchExpression(xSwitchExpression);
        if (result == null) result = caseXExpression(xSwitchExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XFOR_EACH_EXPRESSION:
      {
        XForEachExpression xForEachExpression = (XForEachExpression)theEObject;
        T result = caseXForEachExpression(xForEachExpression);
        if (result == null) result = caseXExpression(xForEachExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XFUNCTION_CALL_EXPRESSION:
      {
        XFunctionCallExpression xFunctionCallExpression = (XFunctionCallExpression)theEObject;
        T result = caseXFunctionCallExpression(xFunctionCallExpression);
        if (result == null) result = caseXExpression(xFunctionCallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XBOOLEAN_LITERAL:
      {
        XBooleanLiteral xBooleanLiteral = (XBooleanLiteral)theEObject;
        T result = caseXBooleanLiteral(xBooleanLiteral);
        if (result == null) result = caseXExpression(xBooleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XNULL_LITERAL:
      {
        XNullLiteral xNullLiteral = (XNullLiteral)theEObject;
        T result = caseXNullLiteral(xNullLiteral);
        if (result == null) result = caseXExpression(xNullLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XNUMBER_LITERAL:
      {
        XNumberLiteral xNumberLiteral = (XNumberLiteral)theEObject;
        T result = caseXNumberLiteral(xNumberLiteral);
        if (result == null) result = caseXExpression(xNumberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case LilPackage.XSTRING_LITERAL:
      {
        XStringLiteral xStringLiteral = (XStringLiteral)theEObject;
        T result = caseXStringLiteral(xStringLiteral);
        if (result == null) result = caseXExpression(xStringLiteral);
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
   * Returns the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXExpression(XExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XCollection Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XCollection Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXCollectionLiteral(XCollectionLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XSet Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XSet Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXSetLiteral(XSetLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XList Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XList Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXListLiteral(XListLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XCase Part</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XCase Part</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXCasePart(XCasePart object)
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
   * Returns the result of interpreting the object as an instance of '<em>XUnary Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XUnary Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXUnaryOperation(XUnaryOperation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XIf Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XIf Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXIfExpression(XIfExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XSwitch Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XSwitch Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXSwitchExpression(XSwitchExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XFor Each Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XFor Each Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXForEachExpression(XForEachExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XFunction Call Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XFunction Call Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXFunctionCallExpression(XFunctionCallExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XBoolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XBoolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXBooleanLiteral(XBooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XNull Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XNull Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXNullLiteral(XNullLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XNumber Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XNumber Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXNumberLiteral(XNumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XString Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XString Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXStringLiteral(XStringLiteral object)
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
