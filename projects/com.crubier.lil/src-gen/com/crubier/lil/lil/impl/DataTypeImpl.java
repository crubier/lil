/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeDeclaration;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeImpl#getCompound <em>Compound</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeImpl#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType
{
  /**
   * The cached value of the '{@link #getCompound() <em>Compound</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompound()
   * @generated
   * @ordered
   */
  protected DataTypeDeclaration compound;

  /**
   * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected static final String BASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected String base = BASE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeImpl()
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
    return LilPackage.Literals.DATA_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeDeclaration getCompound()
  {
    if (compound != null && compound.eIsProxy())
    {
      InternalEObject oldCompound = (InternalEObject)compound;
      compound = (DataTypeDeclaration)eResolveProxy(oldCompound);
      if (compound != oldCompound)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.DATA_TYPE__COMPOUND, oldCompound, compound));
      }
    }
    return compound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeDeclaration basicGetCompound()
  {
    return compound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompound(DataTypeDeclaration newCompound)
  {
    DataTypeDeclaration oldCompound = compound;
    compound = newCompound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE__COMPOUND, oldCompound, compound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(String newBase)
  {
    String oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE__BASE, oldBase, base));
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
      case LilPackage.DATA_TYPE__COMPOUND:
        if (resolve) return getCompound();
        return basicGetCompound();
      case LilPackage.DATA_TYPE__BASE:
        return getBase();
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
      case LilPackage.DATA_TYPE__COMPOUND:
        setCompound((DataTypeDeclaration)newValue);
        return;
      case LilPackage.DATA_TYPE__BASE:
        setBase((String)newValue);
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
      case LilPackage.DATA_TYPE__COMPOUND:
        setCompound((DataTypeDeclaration)null);
        return;
      case LilPackage.DATA_TYPE__BASE:
        setBase(BASE_EDEFAULT);
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
      case LilPackage.DATA_TYPE__COMPOUND:
        return compound != null;
      case LilPackage.DATA_TYPE__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
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
    result.append(" (base: ");
    result.append(base);
    result.append(')');
    return result.toString();
  }

} //DataTypeImpl
