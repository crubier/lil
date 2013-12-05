/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.InteractorData;
import com.crubier.lil.lil.InteractorSignalAlias;
import com.crubier.lil.lil.InteractorSignalEmission;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interactor Signal Emission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorSignalEmissionImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorSignalEmissionImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractorSignalEmissionImpl extends MinimalEObjectImpl.Container implements InteractorSignalEmission
{
  /**
   * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance()
   * @generated
   * @ordered
   */
  protected InteractorData instance;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected InteractorSignalAlias destination;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractorSignalEmissionImpl()
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
    return LilPackage.Literals.INTERACTOR_SIGNAL_EMISSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorData getInstance()
  {
    if (instance != null && instance.eIsProxy())
    {
      InternalEObject oldInstance = (InternalEObject)instance;
      instance = (InteractorData)eResolveProxy(oldInstance);
      if (instance != oldInstance)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.INTERACTOR_SIGNAL_EMISSION__INSTANCE, oldInstance, instance));
      }
    }
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorData basicGetInstance()
  {
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance(InteractorData newInstance)
  {
    InteractorData oldInstance = instance;
    instance = newInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_SIGNAL_EMISSION__INSTANCE, oldInstance, instance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorSignalAlias getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDestination(InteractorSignalAlias newDestination, NotificationChain msgs)
  {
    InteractorSignalAlias oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_SIGNAL_EMISSION__DESTINATION, oldDestination, newDestination);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(InteractorSignalAlias newDestination)
  {
    if (newDestination != destination)
    {
      NotificationChain msgs = null;
      if (destination != null)
        msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.INTERACTOR_SIGNAL_EMISSION__DESTINATION, null, msgs);
      if (newDestination != null)
        msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.INTERACTOR_SIGNAL_EMISSION__DESTINATION, null, msgs);
      msgs = basicSetDestination(newDestination, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_SIGNAL_EMISSION__DESTINATION, newDestination, newDestination));
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
      case LilPackage.INTERACTOR_SIGNAL_EMISSION__DESTINATION:
        return basicSetDestination(null, msgs);
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
      case LilPackage.INTERACTOR_SIGNAL_EMISSION__INSTANCE:
        if (resolve) return getInstance();
        return basicGetInstance();
      case LilPackage.INTERACTOR_SIGNAL_EMISSION__DESTINATION:
        return getDestination();
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
      case LilPackage.INTERACTOR_SIGNAL_EMISSION__INSTANCE:
        setInstance((InteractorData)newValue);
        return;
      case LilPackage.INTERACTOR_SIGNAL_EMISSION__DESTINATION:
        setDestination((InteractorSignalAlias)newValue);
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
      case LilPackage.INTERACTOR_SIGNAL_EMISSION__INSTANCE:
        setInstance((InteractorData)null);
        return;
      case LilPackage.INTERACTOR_SIGNAL_EMISSION__DESTINATION:
        setDestination((InteractorSignalAlias)null);
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
      case LilPackage.INTERACTOR_SIGNAL_EMISSION__INSTANCE:
        return instance != null;
      case LilPackage.INTERACTOR_SIGNAL_EMISSION__DESTINATION:
        return destination != null;
    }
    return super.eIsSet(featureID);
  }

} //InteractorSignalEmissionImpl
