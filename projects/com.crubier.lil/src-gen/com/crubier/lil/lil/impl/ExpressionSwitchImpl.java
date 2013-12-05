/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.Expression;
import com.crubier.lil.lil.ExpressionCase;
import com.crubier.lil.lil.ExpressionSwitch;
import com.crubier.lil.lil.LilPackage;

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
 * An implementation of the model object '<em><b>Expression Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.ExpressionSwitchImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.ExpressionSwitchImpl#getCase <em>Case</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.ExpressionSwitchImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionSwitchImpl extends ExpressionImpl implements ExpressionSwitch
{
  /**
   * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitch()
   * @generated
   * @ordered
   */
  protected Expression switch_;

  /**
   * The cached value of the '{@link #getCase() <em>Case</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCase()
   * @generated
   * @ordered
   */
  protected EList<ExpressionCase> case_;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected Expression default_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionSwitchImpl()
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
    return LilPackage.Literals.EXPRESSION_SWITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSwitch()
  {
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitch(Expression newSwitch, NotificationChain msgs)
  {
    Expression oldSwitch = switch_;
    switch_ = newSwitch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.EXPRESSION_SWITCH__SWITCH, oldSwitch, newSwitch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitch(Expression newSwitch)
  {
    if (newSwitch != switch_)
    {
      NotificationChain msgs = null;
      if (switch_ != null)
        msgs = ((InternalEObject)switch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.EXPRESSION_SWITCH__SWITCH, null, msgs);
      if (newSwitch != null)
        msgs = ((InternalEObject)newSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.EXPRESSION_SWITCH__SWITCH, null, msgs);
      msgs = basicSetSwitch(newSwitch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.EXPRESSION_SWITCH__SWITCH, newSwitch, newSwitch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpressionCase> getCase()
  {
    if (case_ == null)
    {
      case_ = new EObjectContainmentEList<ExpressionCase>(ExpressionCase.class, this, LilPackage.EXPRESSION_SWITCH__CASE);
    }
    return case_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(Expression newDefault, NotificationChain msgs)
  {
    Expression oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.EXPRESSION_SWITCH__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(Expression newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.EXPRESSION_SWITCH__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.EXPRESSION_SWITCH__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.EXPRESSION_SWITCH__DEFAULT, newDefault, newDefault));
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
      case LilPackage.EXPRESSION_SWITCH__SWITCH:
        return basicSetSwitch(null, msgs);
      case LilPackage.EXPRESSION_SWITCH__CASE:
        return ((InternalEList<?>)getCase()).basicRemove(otherEnd, msgs);
      case LilPackage.EXPRESSION_SWITCH__DEFAULT:
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
      case LilPackage.EXPRESSION_SWITCH__SWITCH:
        return getSwitch();
      case LilPackage.EXPRESSION_SWITCH__CASE:
        return getCase();
      case LilPackage.EXPRESSION_SWITCH__DEFAULT:
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
      case LilPackage.EXPRESSION_SWITCH__SWITCH:
        setSwitch((Expression)newValue);
        return;
      case LilPackage.EXPRESSION_SWITCH__CASE:
        getCase().clear();
        getCase().addAll((Collection<? extends ExpressionCase>)newValue);
        return;
      case LilPackage.EXPRESSION_SWITCH__DEFAULT:
        setDefault((Expression)newValue);
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
      case LilPackage.EXPRESSION_SWITCH__SWITCH:
        setSwitch((Expression)null);
        return;
      case LilPackage.EXPRESSION_SWITCH__CASE:
        getCase().clear();
        return;
      case LilPackage.EXPRESSION_SWITCH__DEFAULT:
        setDefault((Expression)null);
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
      case LilPackage.EXPRESSION_SWITCH__SWITCH:
        return switch_ != null;
      case LilPackage.EXPRESSION_SWITCH__CASE:
        return case_ != null && !case_.isEmpty();
      case LilPackage.EXPRESSION_SWITCH__DEFAULT:
        return default_ != null;
    }
    return super.eIsSet(featureID);
  }

} //ExpressionSwitchImpl
