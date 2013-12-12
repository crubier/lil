/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.InteractorBehaviorCause;
import com.crubier.lil.lil.InteractorBehaviorDeclaration;
import com.crubier.lil.lil.InteractorBehaviorEffect;
import com.crubier.lil.lil.LilPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interactor Behavior Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorBehaviorDeclarationImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorBehaviorDeclarationImpl#getEffect <em>Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractorBehaviorDeclarationImpl extends MinimalEObjectImpl.Container implements InteractorBehaviorDeclaration
{
  /**
   * The cached value of the '{@link #getCause() <em>Cause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCause()
   * @generated
   * @ordered
   */
  protected InteractorBehaviorCause cause;

  /**
   * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEffect()
   * @generated
   * @ordered
   */
  protected EList<InteractorBehaviorEffect> effect;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractorBehaviorDeclarationImpl()
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
    return LilPackage.Literals.INTERACTOR_BEHAVIOR_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorBehaviorCause getCause()
  {
    return cause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCause(InteractorBehaviorCause newCause, NotificationChain msgs)
  {
    InteractorBehaviorCause oldCause = cause;
    cause = newCause;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__CAUSE, oldCause, newCause);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCause(InteractorBehaviorCause newCause)
  {
    if (newCause != cause)
    {
      NotificationChain msgs = null;
      if (cause != null)
        msgs = ((InternalEObject)cause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__CAUSE, null, msgs);
      if (newCause != null)
        msgs = ((InternalEObject)newCause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__CAUSE, null, msgs);
      msgs = basicSetCause(newCause, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__CAUSE, newCause, newCause));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractorBehaviorEffect> getEffect()
  {
    if (effect == null)
    {
      effect = new EObjectContainmentEList<InteractorBehaviorEffect>(InteractorBehaviorEffect.class, this, LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__EFFECT);
    }
    return effect;
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
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__CAUSE:
        return basicSetCause(null, msgs);
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__EFFECT:
        return ((InternalEList<?>)getEffect()).basicRemove(otherEnd, msgs);
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
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__CAUSE:
        return getCause();
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__EFFECT:
        return getEffect();
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
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__CAUSE:
        setCause((InteractorBehaviorCause)newValue);
        return;
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__EFFECT:
        getEffect().clear();
        getEffect().addAll((Collection<? extends InteractorBehaviorEffect>)newValue);
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
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__CAUSE:
        setCause((InteractorBehaviorCause)null);
        return;
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__EFFECT:
        getEffect().clear();
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
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__CAUSE:
        return cause != null;
      case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION__EFFECT:
        return effect != null && !effect.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InteractorBehaviorDeclarationImpl
