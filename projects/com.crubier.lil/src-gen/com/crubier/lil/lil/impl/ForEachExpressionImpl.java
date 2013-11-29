/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.Expression;
import com.crubier.lil.lil.ForEachExpression;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For Each Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.ForEachExpressionImpl#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.ForEachExpressionImpl#getEachExpression <em>Each Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForEachExpressionImpl extends ExpressionImpl implements ForEachExpression
{
  /**
   * The cached value of the '{@link #getForExpression() <em>For Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForExpression()
   * @generated
   * @ordered
   */
  protected Expression forExpression;

  /**
   * The cached value of the '{@link #getEachExpression() <em>Each Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEachExpression()
   * @generated
   * @ordered
   */
  protected Expression eachExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForEachExpressionImpl()
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
    return LilPackage.Literals.FOR_EACH_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getForExpression()
  {
    return forExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetForExpression(Expression newForExpression, NotificationChain msgs)
  {
    Expression oldForExpression = forExpression;
    forExpression = newForExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.FOR_EACH_EXPRESSION__FOR_EXPRESSION, oldForExpression, newForExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForExpression(Expression newForExpression)
  {
    if (newForExpression != forExpression)
    {
      NotificationChain msgs = null;
      if (forExpression != null)
        msgs = ((InternalEObject)forExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.FOR_EACH_EXPRESSION__FOR_EXPRESSION, null, msgs);
      if (newForExpression != null)
        msgs = ((InternalEObject)newForExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.FOR_EACH_EXPRESSION__FOR_EXPRESSION, null, msgs);
      msgs = basicSetForExpression(newForExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.FOR_EACH_EXPRESSION__FOR_EXPRESSION, newForExpression, newForExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getEachExpression()
  {
    return eachExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEachExpression(Expression newEachExpression, NotificationChain msgs)
  {
    Expression oldEachExpression = eachExpression;
    eachExpression = newEachExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.FOR_EACH_EXPRESSION__EACH_EXPRESSION, oldEachExpression, newEachExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEachExpression(Expression newEachExpression)
  {
    if (newEachExpression != eachExpression)
    {
      NotificationChain msgs = null;
      if (eachExpression != null)
        msgs = ((InternalEObject)eachExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.FOR_EACH_EXPRESSION__EACH_EXPRESSION, null, msgs);
      if (newEachExpression != null)
        msgs = ((InternalEObject)newEachExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.FOR_EACH_EXPRESSION__EACH_EXPRESSION, null, msgs);
      msgs = basicSetEachExpression(newEachExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.FOR_EACH_EXPRESSION__EACH_EXPRESSION, newEachExpression, newEachExpression));
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
      case LilPackage.FOR_EACH_EXPRESSION__FOR_EXPRESSION:
        return basicSetForExpression(null, msgs);
      case LilPackage.FOR_EACH_EXPRESSION__EACH_EXPRESSION:
        return basicSetEachExpression(null, msgs);
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
      case LilPackage.FOR_EACH_EXPRESSION__FOR_EXPRESSION:
        return getForExpression();
      case LilPackage.FOR_EACH_EXPRESSION__EACH_EXPRESSION:
        return getEachExpression();
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
      case LilPackage.FOR_EACH_EXPRESSION__FOR_EXPRESSION:
        setForExpression((Expression)newValue);
        return;
      case LilPackage.FOR_EACH_EXPRESSION__EACH_EXPRESSION:
        setEachExpression((Expression)newValue);
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
      case LilPackage.FOR_EACH_EXPRESSION__FOR_EXPRESSION:
        setForExpression((Expression)null);
        return;
      case LilPackage.FOR_EACH_EXPRESSION__EACH_EXPRESSION:
        setEachExpression((Expression)null);
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
      case LilPackage.FOR_EACH_EXPRESSION__FOR_EXPRESSION:
        return forExpression != null;
      case LilPackage.FOR_EACH_EXPRESSION__EACH_EXPRESSION:
        return eachExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //ForEachExpressionImpl
