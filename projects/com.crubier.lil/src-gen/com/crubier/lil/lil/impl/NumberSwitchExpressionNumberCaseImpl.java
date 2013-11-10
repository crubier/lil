/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.NumberExpression;
import com.crubier.lil.lil.NumberSwitchExpressionNumberCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Switch Expression Number Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.NumberSwitchExpressionNumberCaseImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.NumberSwitchExpressionNumberCaseImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberSwitchExpressionNumberCaseImpl extends MinimalEObjectImpl.Container implements NumberSwitchExpressionNumberCase
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected NumberExpression condition;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected NumberExpression value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberSwitchExpressionNumberCaseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LilPackage.Literals.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(NumberExpression newCondition, NotificationChain msgs)
  {
    NumberExpression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(NumberExpression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(NumberExpression newValue, NotificationChain msgs)
  {
    NumberExpression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(NumberExpression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION:
        return basicSetCondition(null, msgs);
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE:
        return basicSetValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION:
        return getCondition();
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION:
        setCondition((NumberExpression)newValue);
        return;
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE:
        setValue((NumberExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION:
        setCondition((NumberExpression)null);
        return;
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE:
        setValue((NumberExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION:
        return condition != null;
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //NumberSwitchExpressionNumberCaseImpl
