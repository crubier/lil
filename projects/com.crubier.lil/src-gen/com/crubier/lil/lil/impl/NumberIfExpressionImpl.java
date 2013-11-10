/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.BooleanExpression;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.NumberExpression;
import com.crubier.lil.lil.NumberIfExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number If Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.NumberIfExpressionImpl#getIf <em>If</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.NumberIfExpressionImpl#getThen <em>Then</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.NumberIfExpressionImpl#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberIfExpressionImpl extends NumberExpressionImpl implements NumberIfExpression
{
  /**
   * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIf()
   * @generated
   * @ordered
   */
  protected BooleanExpression if_;

  /**
   * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThen()
   * @generated
   * @ordered
   */
  protected NumberExpression then;

  /**
   * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElse()
   * @generated
   * @ordered
   */
  protected NumberExpression else_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberIfExpressionImpl()
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
    return LilPackage.Literals.NUMBER_IF_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanExpression getIf()
  {
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIf(BooleanExpression newIf, NotificationChain msgs)
  {
    BooleanExpression oldIf = if_;
    if_ = newIf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_IF_EXPRESSION__IF, oldIf, newIf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIf(BooleanExpression newIf)
  {
    if (newIf != if_)
    {
      NotificationChain msgs = null;
      if (if_ != null)
        msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_IF_EXPRESSION__IF, null, msgs);
      if (newIf != null)
        msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_IF_EXPRESSION__IF, null, msgs);
      msgs = basicSetIf(newIf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_IF_EXPRESSION__IF, newIf, newIf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression getThen()
  {
    return then;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThen(NumberExpression newThen, NotificationChain msgs)
  {
    NumberExpression oldThen = then;
    then = newThen;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_IF_EXPRESSION__THEN, oldThen, newThen);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThen(NumberExpression newThen)
  {
    if (newThen != then)
    {
      NotificationChain msgs = null;
      if (then != null)
        msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_IF_EXPRESSION__THEN, null, msgs);
      if (newThen != null)
        msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_IF_EXPRESSION__THEN, null, msgs);
      msgs = basicSetThen(newThen, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_IF_EXPRESSION__THEN, newThen, newThen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression getElse()
  {
    return else_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElse(NumberExpression newElse, NotificationChain msgs)
  {
    NumberExpression oldElse = else_;
    else_ = newElse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_IF_EXPRESSION__ELSE, oldElse, newElse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElse(NumberExpression newElse)
  {
    if (newElse != else_)
    {
      NotificationChain msgs = null;
      if (else_ != null)
        msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_IF_EXPRESSION__ELSE, null, msgs);
      if (newElse != null)
        msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_IF_EXPRESSION__ELSE, null, msgs);
      msgs = basicSetElse(newElse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_IF_EXPRESSION__ELSE, newElse, newElse));
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
      case LilPackage.NUMBER_IF_EXPRESSION__IF:
        return basicSetIf(null, msgs);
      case LilPackage.NUMBER_IF_EXPRESSION__THEN:
        return basicSetThen(null, msgs);
      case LilPackage.NUMBER_IF_EXPRESSION__ELSE:
        return basicSetElse(null, msgs);
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
      case LilPackage.NUMBER_IF_EXPRESSION__IF:
        return getIf();
      case LilPackage.NUMBER_IF_EXPRESSION__THEN:
        return getThen();
      case LilPackage.NUMBER_IF_EXPRESSION__ELSE:
        return getElse();
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
      case LilPackage.NUMBER_IF_EXPRESSION__IF:
        setIf((BooleanExpression)newValue);
        return;
      case LilPackage.NUMBER_IF_EXPRESSION__THEN:
        setThen((NumberExpression)newValue);
        return;
      case LilPackage.NUMBER_IF_EXPRESSION__ELSE:
        setElse((NumberExpression)newValue);
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
      case LilPackage.NUMBER_IF_EXPRESSION__IF:
        setIf((BooleanExpression)null);
        return;
      case LilPackage.NUMBER_IF_EXPRESSION__THEN:
        setThen((NumberExpression)null);
        return;
      case LilPackage.NUMBER_IF_EXPRESSION__ELSE:
        setElse((NumberExpression)null);
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
      case LilPackage.NUMBER_IF_EXPRESSION__IF:
        return if_ != null;
      case LilPackage.NUMBER_IF_EXPRESSION__THEN:
        return then != null;
      case LilPackage.NUMBER_IF_EXPRESSION__ELSE:
        return else_ != null;
    }
    return super.eIsSet(featureID);
  }

} //NumberIfExpressionImpl
