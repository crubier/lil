/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.Component;
import com.crubier.lil.lil.FlowDeclaration;
import com.crubier.lil.lil.FlowEmission;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Emission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.FlowEmissionImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.FlowEmissionImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowEmissionImpl extends MinimalEObjectImpl.Container implements FlowEmission
{
  /**
   * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstance()
   * @generated
   * @ordered
   */
  protected FlowDeclaration instance;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected Component destination;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowEmissionImpl()
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
    return LilPackage.Literals.FLOW_EMISSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowDeclaration getInstance()
  {
    if (instance != null && instance.eIsProxy())
    {
      InternalEObject oldInstance = (InternalEObject)instance;
      instance = (FlowDeclaration)eResolveProxy(oldInstance);
      if (instance != oldInstance)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.FLOW_EMISSION__INSTANCE, oldInstance, instance));
      }
    }
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowDeclaration basicGetInstance()
  {
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInstance(FlowDeclaration newInstance)
  {
    FlowDeclaration oldInstance = instance;
    instance = newInstance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.FLOW_EMISSION__INSTANCE, oldInstance, instance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDestination(Component newDestination, NotificationChain msgs)
  {
    Component oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.FLOW_EMISSION__DESTINATION, oldDestination, newDestination);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(Component newDestination)
  {
    if (newDestination != destination)
    {
      NotificationChain msgs = null;
      if (destination != null)
        msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.FLOW_EMISSION__DESTINATION, null, msgs);
      if (newDestination != null)
        msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.FLOW_EMISSION__DESTINATION, null, msgs);
      msgs = basicSetDestination(newDestination, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.FLOW_EMISSION__DESTINATION, newDestination, newDestination));
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
      case LilPackage.FLOW_EMISSION__DESTINATION:
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
      case LilPackage.FLOW_EMISSION__INSTANCE:
        if (resolve) return getInstance();
        return basicGetInstance();
      case LilPackage.FLOW_EMISSION__DESTINATION:
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
      case LilPackage.FLOW_EMISSION__INSTANCE:
        setInstance((FlowDeclaration)newValue);
        return;
      case LilPackage.FLOW_EMISSION__DESTINATION:
        setDestination((Component)newValue);
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
      case LilPackage.FLOW_EMISSION__INSTANCE:
        setInstance((FlowDeclaration)null);
        return;
      case LilPackage.FLOW_EMISSION__DESTINATION:
        setDestination((Component)null);
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
      case LilPackage.FLOW_EMISSION__INSTANCE:
        return instance != null;
      case LilPackage.FLOW_EMISSION__DESTINATION:
        return destination != null;
    }
    return super.eIsSet(featureID);
  }

} //FlowEmissionImpl
