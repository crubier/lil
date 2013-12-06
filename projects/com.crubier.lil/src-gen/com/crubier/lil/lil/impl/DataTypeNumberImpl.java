/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.DataTypeNumber;
import com.crubier.lil.lil.DataTypeNumberDefinitionSet;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeNumberImpl#getDefinitionSet <em>Definition Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeNumberImpl extends DataTypeImpl implements DataTypeNumber
{
  /**
   * The cached value of the '{@link #getDefinitionSet() <em>Definition Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitionSet()
   * @generated
   * @ordered
   */
  protected DataTypeNumberDefinitionSet definitionSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeNumberImpl()
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
    return LilPackage.Literals.DATA_TYPE_NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeNumberDefinitionSet getDefinitionSet()
  {
    return definitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefinitionSet(DataTypeNumberDefinitionSet newDefinitionSet, NotificationChain msgs)
  {
    DataTypeNumberDefinitionSet oldDefinitionSet = definitionSet;
    definitionSet = newDefinitionSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE_NUMBER__DEFINITION_SET, oldDefinitionSet, newDefinitionSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinitionSet(DataTypeNumberDefinitionSet newDefinitionSet)
  {
    if (newDefinitionSet != definitionSet)
    {
      NotificationChain msgs = null;
      if (definitionSet != null)
        msgs = ((InternalEObject)definitionSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.DATA_TYPE_NUMBER__DEFINITION_SET, null, msgs);
      if (newDefinitionSet != null)
        msgs = ((InternalEObject)newDefinitionSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.DATA_TYPE_NUMBER__DEFINITION_SET, null, msgs);
      msgs = basicSetDefinitionSet(newDefinitionSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE_NUMBER__DEFINITION_SET, newDefinitionSet, newDefinitionSet));
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
      case LilPackage.DATA_TYPE_NUMBER__DEFINITION_SET:
        return basicSetDefinitionSet(null, msgs);
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
      case LilPackage.DATA_TYPE_NUMBER__DEFINITION_SET:
        return getDefinitionSet();
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
      case LilPackage.DATA_TYPE_NUMBER__DEFINITION_SET:
        setDefinitionSet((DataTypeNumberDefinitionSet)newValue);
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
      case LilPackage.DATA_TYPE_NUMBER__DEFINITION_SET:
        setDefinitionSet((DataTypeNumberDefinitionSet)null);
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
      case LilPackage.DATA_TYPE_NUMBER__DEFINITION_SET:
        return definitionSet != null;
    }
    return super.eIsSet(featureID);
  }

} //DataTypeNumberImpl
