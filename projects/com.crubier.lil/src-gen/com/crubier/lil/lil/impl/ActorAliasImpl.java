/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.Actor;
import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.ActorAliasImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.ActorAliasImpl#getRemote <em>Remote</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorAliasImpl extends MinimalEObjectImpl.Container implements ActorAlias
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Actor source;

  /**
   * The cached value of the '{@link #getRemote() <em>Remote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemote()
   * @generated
   * @ordered
   */
  protected Actor remote;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorAliasImpl()
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
    return LilPackage.Literals.ACTOR_ALIAS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(Actor newSource, NotificationChain msgs)
  {
    Actor oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.ACTOR_ALIAS__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(Actor newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.ACTOR_ALIAS__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.ACTOR_ALIAS__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.ACTOR_ALIAS__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actor getRemote()
  {
    return remote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRemote(Actor newRemote, NotificationChain msgs)
  {
    Actor oldRemote = remote;
    remote = newRemote;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.ACTOR_ALIAS__REMOTE, oldRemote, newRemote);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemote(Actor newRemote)
  {
    if (newRemote != remote)
    {
      NotificationChain msgs = null;
      if (remote != null)
        msgs = ((InternalEObject)remote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.ACTOR_ALIAS__REMOTE, null, msgs);
      if (newRemote != null)
        msgs = ((InternalEObject)newRemote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.ACTOR_ALIAS__REMOTE, null, msgs);
      msgs = basicSetRemote(newRemote, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.ACTOR_ALIAS__REMOTE, newRemote, newRemote));
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
      case LilPackage.ACTOR_ALIAS__SOURCE:
        return basicSetSource(null, msgs);
      case LilPackage.ACTOR_ALIAS__REMOTE:
        return basicSetRemote(null, msgs);
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
      case LilPackage.ACTOR_ALIAS__SOURCE:
        return getSource();
      case LilPackage.ACTOR_ALIAS__REMOTE:
        return getRemote();
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
      case LilPackage.ACTOR_ALIAS__SOURCE:
        setSource((Actor)newValue);
        return;
      case LilPackage.ACTOR_ALIAS__REMOTE:
        setRemote((Actor)newValue);
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
      case LilPackage.ACTOR_ALIAS__SOURCE:
        setSource((Actor)null);
        return;
      case LilPackage.ACTOR_ALIAS__REMOTE:
        setRemote((Actor)null);
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
      case LilPackage.ACTOR_ALIAS__SOURCE:
        return source != null;
      case LilPackage.ACTOR_ALIAS__REMOTE:
        return remote != null;
    }
    return super.eIsSet(featureID);
  }

} //ActorAliasImpl
