/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.NumberDefinitionInterval;
import com.crubier.lil.lil.XExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number Definition Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.NumberDefinitionIntervalImpl#getInf <em>Inf</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.NumberDefinitionIntervalImpl#getSup <em>Sup</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NumberDefinitionIntervalImpl extends DefinitionSetImpl implements NumberDefinitionInterval
{
  /**
   * The cached value of the '{@link #getInf() <em>Inf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInf()
   * @generated
   * @ordered
   */
  protected XExpression inf;

  /**
   * The cached value of the '{@link #getSup() <em>Sup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSup()
   * @generated
   * @ordered
   */
  protected XExpression sup;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberDefinitionIntervalImpl()
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
    return LilPackage.Literals.NUMBER_DEFINITION_INTERVAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getInf()
  {
    return inf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInf(XExpression newInf, NotificationChain msgs)
  {
    XExpression oldInf = inf;
    inf = newInf;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_DEFINITION_INTERVAL__INF, oldInf, newInf);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInf(XExpression newInf)
  {
    if (newInf != inf)
    {
      NotificationChain msgs = null;
      if (inf != null)
        msgs = ((InternalEObject)inf).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_DEFINITION_INTERVAL__INF, null, msgs);
      if (newInf != null)
        msgs = ((InternalEObject)newInf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_DEFINITION_INTERVAL__INF, null, msgs);
      msgs = basicSetInf(newInf, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_DEFINITION_INTERVAL__INF, newInf, newInf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getSup()
  {
    return sup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSup(XExpression newSup, NotificationChain msgs)
  {
    XExpression oldSup = sup;
    sup = newSup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_DEFINITION_INTERVAL__SUP, oldSup, newSup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSup(XExpression newSup)
  {
    if (newSup != sup)
    {
      NotificationChain msgs = null;
      if (sup != null)
        msgs = ((InternalEObject)sup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_DEFINITION_INTERVAL__SUP, null, msgs);
      if (newSup != null)
        msgs = ((InternalEObject)newSup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.NUMBER_DEFINITION_INTERVAL__SUP, null, msgs);
      msgs = basicSetSup(newSup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.NUMBER_DEFINITION_INTERVAL__SUP, newSup, newSup));
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
      case LilPackage.NUMBER_DEFINITION_INTERVAL__INF:
        return basicSetInf(null, msgs);
      case LilPackage.NUMBER_DEFINITION_INTERVAL__SUP:
        return basicSetSup(null, msgs);
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
      case LilPackage.NUMBER_DEFINITION_INTERVAL__INF:
        return getInf();
      case LilPackage.NUMBER_DEFINITION_INTERVAL__SUP:
        return getSup();
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
      case LilPackage.NUMBER_DEFINITION_INTERVAL__INF:
        setInf((XExpression)newValue);
        return;
      case LilPackage.NUMBER_DEFINITION_INTERVAL__SUP:
        setSup((XExpression)newValue);
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
      case LilPackage.NUMBER_DEFINITION_INTERVAL__INF:
        setInf((XExpression)null);
        return;
      case LilPackage.NUMBER_DEFINITION_INTERVAL__SUP:
        setSup((XExpression)null);
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
      case LilPackage.NUMBER_DEFINITION_INTERVAL__INF:
        return inf != null;
      case LilPackage.NUMBER_DEFINITION_INTERVAL__SUP:
        return sup != null;
    }
    return super.eIsSet(featureID);
  }

} //NumberDefinitionIntervalImpl
