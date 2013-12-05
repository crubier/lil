/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.Expression;
import com.crubier.lil.lil.ExpressionBinaryOperation;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.ExpressionBinaryOperationImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.ExpressionBinaryOperationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.ExpressionBinaryOperationImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionBinaryOperationImpl extends ExpressionImpl implements ExpressionBinaryOperation
{
  /**
   * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftOperand()
   * @generated
   * @ordered
   */
  protected Expression leftOperand;

  /**
   * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected String feature = FEATURE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightOperand()
   * @generated
   * @ordered
   */
  protected Expression rightOperand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionBinaryOperationImpl()
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
    return LilPackage.Literals.EXPRESSION_BINARY_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getLeftOperand()
  {
    return leftOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftOperand(Expression newLeftOperand, NotificationChain msgs)
  {
    Expression oldLeftOperand = leftOperand;
    leftOperand = newLeftOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.EXPRESSION_BINARY_OPERATION__LEFT_OPERAND, oldLeftOperand, newLeftOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftOperand(Expression newLeftOperand)
  {
    if (newLeftOperand != leftOperand)
    {
      NotificationChain msgs = null;
      if (leftOperand != null)
        msgs = ((InternalEObject)leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.EXPRESSION_BINARY_OPERATION__LEFT_OPERAND, null, msgs);
      if (newLeftOperand != null)
        msgs = ((InternalEObject)newLeftOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.EXPRESSION_BINARY_OPERATION__LEFT_OPERAND, null, msgs);
      msgs = basicSetLeftOperand(newLeftOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.EXPRESSION_BINARY_OPERATION__LEFT_OPERAND, newLeftOperand, newLeftOperand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(String newFeature)
  {
    String oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.EXPRESSION_BINARY_OPERATION__FEATURE, oldFeature, feature));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getRightOperand()
  {
    return rightOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightOperand(Expression newRightOperand, NotificationChain msgs)
  {
    Expression oldRightOperand = rightOperand;
    rightOperand = newRightOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND, oldRightOperand, newRightOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightOperand(Expression newRightOperand)
  {
    if (newRightOperand != rightOperand)
    {
      NotificationChain msgs = null;
      if (rightOperand != null)
        msgs = ((InternalEObject)rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND, null, msgs);
      if (newRightOperand != null)
        msgs = ((InternalEObject)newRightOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND, null, msgs);
      msgs = basicSetRightOperand(newRightOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND, newRightOperand, newRightOperand));
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
      case LilPackage.EXPRESSION_BINARY_OPERATION__LEFT_OPERAND:
        return basicSetLeftOperand(null, msgs);
      case LilPackage.EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND:
        return basicSetRightOperand(null, msgs);
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
      case LilPackage.EXPRESSION_BINARY_OPERATION__LEFT_OPERAND:
        return getLeftOperand();
      case LilPackage.EXPRESSION_BINARY_OPERATION__FEATURE:
        return getFeature();
      case LilPackage.EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND:
        return getRightOperand();
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
      case LilPackage.EXPRESSION_BINARY_OPERATION__LEFT_OPERAND:
        setLeftOperand((Expression)newValue);
        return;
      case LilPackage.EXPRESSION_BINARY_OPERATION__FEATURE:
        setFeature((String)newValue);
        return;
      case LilPackage.EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND:
        setRightOperand((Expression)newValue);
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
      case LilPackage.EXPRESSION_BINARY_OPERATION__LEFT_OPERAND:
        setLeftOperand((Expression)null);
        return;
      case LilPackage.EXPRESSION_BINARY_OPERATION__FEATURE:
        setFeature(FEATURE_EDEFAULT);
        return;
      case LilPackage.EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND:
        setRightOperand((Expression)null);
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
      case LilPackage.EXPRESSION_BINARY_OPERATION__LEFT_OPERAND:
        return leftOperand != null;
      case LilPackage.EXPRESSION_BINARY_OPERATION__FEATURE:
        return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
      case LilPackage.EXPRESSION_BINARY_OPERATION__RIGHT_OPERAND:
        return rightOperand != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (feature: ");
    result.append(feature);
    result.append(')');
    return result.toString();
  }

} //ExpressionBinaryOperationImpl
