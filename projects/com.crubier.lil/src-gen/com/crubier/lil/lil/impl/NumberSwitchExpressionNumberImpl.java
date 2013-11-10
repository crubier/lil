/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.NumberExpression;
import com.crubier.lil.lil.NumberSwitchExpressionNumber;
import com.crubier.lil.lil.NumberSwitchExpressionNumberCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Switch Expression Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.NumberSwitchExpressionNumberImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.NumberSwitchExpressionNumberImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.NumberSwitchExpressionNumberImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberSwitchExpressionNumberImpl extends NumberExpressionImpl implements NumberSwitchExpressionNumber
{
  /**
   * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitch()
   * @generated
   * @ordered
   */
  protected NumberExpression switch_;

  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<NumberSwitchExpressionNumberCase> cases;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected NumberExpression default_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberSwitchExpressionNumberImpl()
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
    return LilPackage.Literals.NUMBER_SWITCH_EXPRESSION_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression getSwitch()
  {
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitch(NumberExpression newSwitch, NotificationChain msgs)
  {
    NumberExpression oldSwitch = switch_;
    switch_ = newSwitch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH, oldSwitch, newSwitch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitch(NumberExpression newSwitch)
  {
    if (newSwitch != switch_)
    {
      NotificationChain msgs = null;
      if (switch_ != null)
        msgs = ((InternalEObject)switch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH, null, msgs);
      if (newSwitch != null)
        msgs = ((InternalEObject)newSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH, null, msgs);
      msgs = basicSetSwitch(newSwitch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH, newSwitch, newSwitch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NumberSwitchExpressionNumberCase> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<NumberSwitchExpressionNumberCase>(NumberSwitchExpressionNumberCase.class, this, LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__CASES);
    }
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(NumberExpression newDefault, NotificationChain msgs)
  {
    NumberExpression oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(NumberExpression newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT, newDefault, newDefault));
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
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH:
        return basicSetSwitch(null, msgs);
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT:
        return basicSetDefault(null, msgs);
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
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH:
        return getSwitch();
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__CASES:
        return getCases();
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT:
        return getDefault();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH:
        setSwitch((NumberExpression)newValue);
        return;
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends NumberSwitchExpressionNumberCase>)newValue);
        return;
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT:
        setDefault((NumberExpression)newValue);
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
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH:
        setSwitch((NumberExpression)null);
        return;
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__CASES:
        getCases().clear();
        return;
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT:
        setDefault((NumberExpression)null);
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
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__SWITCH:
        return switch_ != null;
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__CASES:
        return cases != null && !cases.isEmpty();
      case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER__DEFAULT:
        return default_ != null;
    }
    return super.eIsSet(featureID);
  }

} //NumberSwitchExpressionNumberImpl