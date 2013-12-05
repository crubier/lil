/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.InteractorType;
import com.crubier.lil.lil.InteractorTypeDefinition;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interactor Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorTypeImpl#getCustom <em>Custom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractorTypeImpl extends MinimalEObjectImpl.Container implements InteractorType
{
  /**
   * The cached value of the '{@link #getCustom() <em>Custom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustom()
   * @generated
   * @ordered
   */
  protected InteractorTypeDefinition custom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractorTypeImpl()
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
    return LilPackage.Literals.INTERACTOR_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorTypeDefinition getCustom()
  {
    if (custom != null && custom.eIsProxy())
    {
      InternalEObject oldCustom = (InternalEObject)custom;
      custom = (InteractorTypeDefinition)eResolveProxy(oldCustom);
      if (custom != oldCustom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.INTERACTOR_TYPE__CUSTOM, oldCustom, custom));
      }
    }
    return custom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorTypeDefinition basicGetCustom()
  {
    return custom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustom(InteractorTypeDefinition newCustom)
  {
    InteractorTypeDefinition oldCustom = custom;
    custom = newCustom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_TYPE__CUSTOM, oldCustom, custom));
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
      case LilPackage.INTERACTOR_TYPE__CUSTOM:
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
      case LilPackage.INTERACTOR_TYPE__CUSTOM:
        setCustom((InteractorTypeDefinition)newValue);
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
      case LilPackage.INTERACTOR_TYPE__CUSTOM:
        setCustom((InteractorTypeDefinition)null);
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
      case LilPackage.INTERACTOR_TYPE__CUSTOM:
        return custom != null;
    }
    return super.eIsSet(featureID);
  }

} //InteractorTypeImpl
