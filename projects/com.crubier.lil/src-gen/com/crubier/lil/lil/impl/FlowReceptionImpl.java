/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.Component;
import com.crubier.lil.lil.FlowDeclaration;
import com.crubier.lil.lil.FlowReception;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Reception</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.FlowReceptionImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.FlowReceptionImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowReceptionImpl extends MinimalEObjectImpl.Container implements FlowReception
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
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Component source;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlowReceptionImpl()
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
    return LilPackage.Literals.FLOW_RECEPTION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.FLOW_RECEPTION__INSTANCE, oldInstance, instance));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.FLOW_RECEPTION__INSTANCE, oldInstance, instance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(Component newSource, NotificationChain msgs)
  {
    Component oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.FLOW_RECEPTION__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Component newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.FLOW_RECEPTION__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.FLOW_RECEPTION__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.FLOW_RECEPTION__SOURCE, newSource, newSource));
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
      case LilPackage.FLOW_RECEPTION__SOURCE:
        return basicSetSource(null, msgs);
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
      case LilPackage.FLOW_RECEPTION__INSTANCE:
        if (resolve) return getInstance();
        return basicGetInstance();
      case LilPackage.FLOW_RECEPTION__SOURCE:
        return getSource();
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
      case LilPackage.FLOW_RECEPTION__INSTANCE:
        setInstance((FlowDeclaration)newValue);
        return;
      case LilPackage.FLOW_RECEPTION__SOURCE:
        setSource((Component)newValue);
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
      case LilPackage.FLOW_RECEPTION__INSTANCE:
        setInstance((FlowDeclaration)null);
        return;
      case LilPackage.FLOW_RECEPTION__SOURCE:
        setSource((Component)null);
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
      case LilPackage.FLOW_RECEPTION__INSTANCE:
        return instance != null;
      case LilPackage.FLOW_RECEPTION__SOURCE:
        return source != null;
    }
    return super.eIsSet(featureID);
  }

} //FlowReceptionImpl
