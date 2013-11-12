/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.EntityDeclaration;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accessible Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.AccessibleEntityImpl#getGeneric <em>Generic</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.AccessibleEntityImpl#getSpecific <em>Specific</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessibleEntityImpl extends MinimalEObjectImpl.Container implements AccessibleEntity
{
  /**
   * The default value of the '{@link #getGeneric() <em>Generic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneric()
   * @generated
   * @ordered
   */
  protected static final String GENERIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGeneric() <em>Generic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneric()
   * @generated
   * @ordered
   */
  protected String generic = GENERIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getSpecific() <em>Specific</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecific()
   * @generated
   * @ordered
   */
  protected EntityDeclaration specific;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AccessibleEntityImpl()
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
    return LilPackage.Literals.ACCESSIBLE_ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGeneric()
  {
    return generic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeneric(String newGeneric)
  {
    String oldGeneric = generic;
    generic = newGeneric;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.ACCESSIBLE_ENTITY__GENERIC, oldGeneric, generic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityDeclaration getSpecific()
  {
    if (specific != null && specific.eIsProxy())
    {
      InternalEObject oldSpecific = (InternalEObject)specific;
      specific = (EntityDeclaration)eResolveProxy(oldSpecific);
      if (specific != oldSpecific)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.ACCESSIBLE_ENTITY__SPECIFIC, oldSpecific, specific));
      }
    }
    return specific;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityDeclaration basicGetSpecific()
  {
    return specific;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecific(EntityDeclaration newSpecific)
  {
    EntityDeclaration oldSpecific = specific;
    specific = newSpecific;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.ACCESSIBLE_ENTITY__SPECIFIC, oldSpecific, specific));
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
      case LilPackage.ACCESSIBLE_ENTITY__GENERIC:
        return getGeneric();
      case LilPackage.ACCESSIBLE_ENTITY__SPECIFIC:
        if (resolve) return getSpecific();
        return basicGetSpecific();
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
      case LilPackage.ACCESSIBLE_ENTITY__GENERIC:
        setGeneric((String)newValue);
        return;
      case LilPackage.ACCESSIBLE_ENTITY__SPECIFIC:
        setSpecific((EntityDeclaration)newValue);
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
      case LilPackage.ACCESSIBLE_ENTITY__GENERIC:
        setGeneric(GENERIC_EDEFAULT);
        return;
      case LilPackage.ACCESSIBLE_ENTITY__SPECIFIC:
        setSpecific((EntityDeclaration)null);
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
      case LilPackage.ACCESSIBLE_ENTITY__GENERIC:
        return GENERIC_EDEFAULT == null ? generic != null : !GENERIC_EDEFAULT.equals(generic);
      case LilPackage.ACCESSIBLE_ENTITY__SPECIFIC:
        return specific != null;
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
    result.append(" (generic: ");
    result.append(generic);
    result.append(')');
    return result.toString();
  }

} //AccessibleEntityImpl
