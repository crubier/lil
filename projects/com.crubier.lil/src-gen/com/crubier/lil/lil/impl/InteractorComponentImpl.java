/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.InteractorComponent;
import com.crubier.lil.lil.InteractorType;
import com.crubier.lil.lil.LilPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interactor Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorComponentImpl#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractorComponentImpl extends EntityImpl implements InteractorComponent
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected InteractorType type;

  /**
   * The cached value of the '{@link #getActors() <em>Actors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActors()
   * @generated
   * @ordered
   */
  protected EList<ActorAlias> actors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractorComponentImpl()
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
    return LilPackage.Literals.INTERACTOR_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(InteractorType newType, NotificationChain msgs)
  {
    InteractorType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_COMPONENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(InteractorType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.INTERACTOR_COMPONENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.INTERACTOR_COMPONENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_COMPONENT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActorAlias> getActors()
  {
    if (actors == null)
    {
      actors = new EObjectContainmentEList<ActorAlias>(ActorAlias.class, this, LilPackage.INTERACTOR_COMPONENT__ACTORS);
    }
    return actors;
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
      case LilPackage.INTERACTOR_COMPONENT__TYPE:
        return basicSetType(null, msgs);
      case LilPackage.INTERACTOR_COMPONENT__ACTORS:
        return ((InternalEList<?>)getActors()).basicRemove(otherEnd, msgs);
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
      case LilPackage.INTERACTOR_COMPONENT__TYPE:
        return getType();
      case LilPackage.INTERACTOR_COMPONENT__ACTORS:
        return getActors();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LilPackage.INTERACTOR_COMPONENT__TYPE:
        setType((InteractorType)newValue);
        return;
      case LilPackage.INTERACTOR_COMPONENT__ACTORS:
        getActors().clear();
        getActors().addAll((Collection<? extends ActorAlias>)newValue);
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
      case LilPackage.INTERACTOR_COMPONENT__TYPE:
        setType((InteractorType)null);
        return;
      case LilPackage.INTERACTOR_COMPONENT__ACTORS:
        getActors().clear();
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
      case LilPackage.INTERACTOR_COMPONENT__TYPE:
        return type != null;
      case LilPackage.INTERACTOR_COMPONENT__ACTORS:
        return actors != null && !actors.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InteractorComponentImpl
