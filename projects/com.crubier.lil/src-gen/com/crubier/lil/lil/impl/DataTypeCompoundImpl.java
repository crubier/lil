/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.DataTypeCompound;
import com.crubier.lil.lil.DataTypeStructure;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Compound</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeCompoundImpl#getCompound <em>Compound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeCompoundImpl extends DataTypeImpl implements DataTypeCompound
{
  /**
   * The cached value of the '{@link #getCompound() <em>Compound</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompound()
   * @generated
   * @ordered
   */
  protected DataTypeStructure compound;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeCompoundImpl()
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
    return LilPackage.Literals.DATA_TYPE_COMPOUND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeStructure getCompound()
  {
    if (compound != null && compound.eIsProxy())
    {
      InternalEObject oldCompound = (InternalEObject)compound;
      compound = (DataTypeStructure)eResolveProxy(oldCompound);
      if (compound != oldCompound)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.DATA_TYPE_COMPOUND__COMPOUND, oldCompound, compound));
      }
    }
    return compound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeStructure basicGetCompound()
  {
    return compound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompound(DataTypeStructure newCompound)
  {
    DataTypeStructure oldCompound = compound;
    compound = newCompound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE_COMPOUND__COMPOUND, oldCompound, compound));
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
      case LilPackage.DATA_TYPE_COMPOUND__COMPOUND:
        if (resolve) return getCompound();
        return basicGetCompound();
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
      case LilPackage.DATA_TYPE_COMPOUND__COMPOUND:
        setCompound((DataTypeStructure)newValue);
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
      case LilPackage.DATA_TYPE_COMPOUND__COMPOUND:
        setCompound((DataTypeStructure)null);
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
      case LilPackage.DATA_TYPE_COMPOUND__COMPOUND:
        return compound != null;
    }
    return super.eIsSet(featureID);
  }

} //DataTypeCompoundImpl
