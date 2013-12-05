/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.ActorType;
import com.crubier.lil.lil.ActorTypeDefinition;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.ActorTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.ActorTypeImpl#getCustom <em>Custom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorTypeImpl extends MinimalEObjectImpl.Container implements ActorType
{
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
   * The cached value of the '{@link #getCustom() <em>Custom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustom()
   * @generated
   * @ordered
   */
  protected ActorTypeDefinition custom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorTypeImpl()
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
    return LilPackage.Literals.ACTOR_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.ACTOR_TYPE__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorTypeDefinition getCustom()
  {
    if (custom != null && custom.eIsProxy())
    {
      InternalEObject oldCustom = (InternalEObject)custom;
      custom = (ActorTypeDefinition)eResolveProxy(oldCustom);
      if (custom != oldCustom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.ACTOR_TYPE__CUSTOM, oldCustom, custom));
      }
    }
    return custom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActorTypeDefinition basicGetCustom()
  {
    return custom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustom(ActorTypeDefinition newCustom)
  {
    ActorTypeDefinition oldCustom = custom;
    custom = newCustom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.ACTOR_TYPE__CUSTOM, oldCustom, custom));
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
      case LilPackage.ACTOR_TYPE__BASE:
        return getBase();
      case LilPackage.ACTOR_TYPE__CUSTOM:
        if (resolve) return getCustom();
        return basicGetCustom();
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
      case LilPackage.ACTOR_TYPE__BASE:
        setBase((String)newValue);
        return;
      case LilPackage.ACTOR_TYPE__CUSTOM:
        setCustom((ActorTypeDefinition)newValue);
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
      case LilPackage.ACTOR_TYPE__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case LilPackage.ACTOR_TYPE__CUSTOM:
        setCustom((ActorTypeDefinition)null);
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
      case LilPackage.ACTOR_TYPE__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
      case LilPackage.ACTOR_TYPE__CUSTOM:
        return custom != null;
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

} //ActorTypeImpl
