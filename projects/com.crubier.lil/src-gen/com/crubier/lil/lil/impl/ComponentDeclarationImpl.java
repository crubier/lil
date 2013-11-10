/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.ComponentDeclaration;
import com.crubier.lil.lil.InteractorDeclaration;
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
 * An implementation of the model object '<em><b>Component Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.ComponentDeclarationImpl#getInteractor <em>Interactor</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.ComponentDeclarationImpl#getAliases <em>Aliases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentDeclarationImpl extends EntityDeclarationImpl implements ComponentDeclaration
{
  /**
   * The cached value of the '{@link #getInteractor() <em>Interactor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractor()
   * @generated
   * @ordered
   */
  protected InteractorDeclaration interactor;

  /**
   * The cached value of the '{@link #getAliases() <em>Aliases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliases()
   * @generated
   * @ordered
   */
  protected EList<ActorAlias> aliases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComponentDeclarationImpl()
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
    return LilPackage.Literals.COMPONENT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDeclaration getInteractor()
  {
    if (interactor != null && interactor.eIsProxy())
    {
      InternalEObject oldInteractor = (InternalEObject)interactor;
      interactor = (InteractorDeclaration)eResolveProxy(oldInteractor);
      if (interactor != oldInteractor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.COMPONENT_DECLARATION__INTERACTOR, oldInteractor, interactor));
      }
    }
    return interactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDeclaration basicGetInteractor()
  {
    return interactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteractor(InteractorDeclaration newInteractor)
  {
    InteractorDeclaration oldInteractor = interactor;
    interactor = newInteractor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.COMPONENT_DECLARATION__INTERACTOR, oldInteractor, interactor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActorAlias> getAliases()
  {
    if (aliases == null)
    {
      aliases = new EObjectContainmentEList<ActorAlias>(ActorAlias.class, this, LilPackage.COMPONENT_DECLARATION__ALIASES);
    }
    return aliases;
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
      case LilPackage.COMPONENT_DECLARATION__ALIASES:
        return ((InternalEList<?>)getAliases()).basicRemove(otherEnd, msgs);
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
      case LilPackage.COMPONENT_DECLARATION__INTERACTOR:
        if (resolve) return getInteractor();
        return basicGetInteractor();
      case LilPackage.COMPONENT_DECLARATION__ALIASES:
        return getAliases();
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
      case LilPackage.COMPONENT_DECLARATION__INTERACTOR:
        setInteractor((InteractorDeclaration)newValue);
        return;
      case LilPackage.COMPONENT_DECLARATION__ALIASES:
        getAliases().clear();
        getAliases().addAll((Collection<? extends ActorAlias>)newValue);
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
      case LilPackage.COMPONENT_DECLARATION__INTERACTOR:
        setInteractor((InteractorDeclaration)null);
        return;
      case LilPackage.COMPONENT_DECLARATION__ALIASES:
        getAliases().clear();
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
      case LilPackage.COMPONENT_DECLARATION__INTERACTOR:
        return interactor != null;
      case LilPackage.COMPONENT_DECLARATION__ALIASES:
        return aliases != null && !aliases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ComponentDeclarationImpl
