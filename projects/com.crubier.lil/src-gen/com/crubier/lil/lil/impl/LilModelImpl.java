/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.ActorTypeDefinition;
import com.crubier.lil.lil.DataTypeDefinition;
import com.crubier.lil.lil.InteractorTypeDefinition;
import com.crubier.lil.lil.LilModel;
import com.crubier.lil.lil.LilPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.LilModelImpl#getActorType <em>Actor Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.LilModelImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.LilModelImpl#getInteractorType <em>Interactor Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LilModelImpl extends MinimalEObjectImpl.Container implements LilModel
{
  /**
   * The cached value of the '{@link #getActorType() <em>Actor Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActorType()
   * @generated
   * @ordered
   */
  protected EList<ActorTypeDefinition> actorType;

  /**
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected EList<DataTypeDefinition> dataType;

  /**
   * The cached value of the '{@link #getInteractorType() <em>Interactor Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractorType()
   * @generated
   * @ordered
   */
  protected EList<InteractorTypeDefinition> interactorType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LilModelImpl()
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
    return LilPackage.Literals.LIL_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActorTypeDefinition> getActorType()
  {
    if (actorType == null)
    {
      actorType = new EObjectContainmentEList<ActorTypeDefinition>(ActorTypeDefinition.class, this, LilPackage.LIL_MODEL__ACTOR_TYPE);
    }
    return actorType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataTypeDefinition> getDataType()
  {
    if (dataType == null)
    {
      dataType = new EObjectContainmentEList<DataTypeDefinition>(DataTypeDefinition.class, this, LilPackage.LIL_MODEL__DATA_TYPE);
    }
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractorTypeDefinition> getInteractorType()
  {
    if (interactorType == null)
    {
      interactorType = new EObjectContainmentEList<InteractorTypeDefinition>(InteractorTypeDefinition.class, this, LilPackage.LIL_MODEL__INTERACTOR_TYPE);
    }
    return interactorType;
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
      case LilPackage.LIL_MODEL__ACTOR_TYPE:
        return ((InternalEList<?>)getActorType()).basicRemove(otherEnd, msgs);
      case LilPackage.LIL_MODEL__DATA_TYPE:
        return ((InternalEList<?>)getDataType()).basicRemove(otherEnd, msgs);
      case LilPackage.LIL_MODEL__INTERACTOR_TYPE:
        return ((InternalEList<?>)getInteractorType()).basicRemove(otherEnd, msgs);
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
      case LilPackage.LIL_MODEL__ACTOR_TYPE:
        return getActorType();
      case LilPackage.LIL_MODEL__DATA_TYPE:
        return getDataType();
      case LilPackage.LIL_MODEL__INTERACTOR_TYPE:
        return getInteractorType();
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
      case LilPackage.LIL_MODEL__ACTOR_TYPE:
        getActorType().clear();
        getActorType().addAll((Collection<? extends ActorTypeDefinition>)newValue);
        return;
      case LilPackage.LIL_MODEL__DATA_TYPE:
        getDataType().clear();
        getDataType().addAll((Collection<? extends DataTypeDefinition>)newValue);
        return;
      case LilPackage.LIL_MODEL__INTERACTOR_TYPE:
        getInteractorType().clear();
        getInteractorType().addAll((Collection<? extends InteractorTypeDefinition>)newValue);
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
      case LilPackage.LIL_MODEL__ACTOR_TYPE:
        getActorType().clear();
        return;
      case LilPackage.LIL_MODEL__DATA_TYPE:
        getDataType().clear();
        return;
      case LilPackage.LIL_MODEL__INTERACTOR_TYPE:
        getInteractorType().clear();
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
      case LilPackage.LIL_MODEL__ACTOR_TYPE:
        return actorType != null && !actorType.isEmpty();
      case LilPackage.LIL_MODEL__DATA_TYPE:
        return dataType != null && !dataType.isEmpty();
      case LilPackage.LIL_MODEL__INTERACTOR_TYPE:
        return interactorType != null && !interactorType.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LilModelImpl
