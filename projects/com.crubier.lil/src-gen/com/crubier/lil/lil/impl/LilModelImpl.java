/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.DataTypeDefinition;
import com.crubier.lil.lil.Interactor;
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
 *   <li>{@link com.crubier.lil.lil.impl.LilModelImpl#getInteractors <em>Interactors</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.LilModelImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LilModelImpl extends MinimalEObjectImpl.Container implements LilModel
{
  /**
   * The cached value of the '{@link #getInteractors() <em>Interactors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractors()
   * @generated
   * @ordered
   */
  protected EList<Interactor> interactors;

  /**
   * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataTypes()
   * @generated
   * @ordered
   */
  protected EList<DataTypeDefinition> dataTypes;

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
  public EList<Interactor> getInteractors()
  {
    if (interactors == null)
    {
      interactors = new EObjectContainmentEList<Interactor>(Interactor.class, this, LilPackage.LIL_MODEL__INTERACTORS);
    }
    return interactors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataTypeDefinition> getDataTypes()
  {
    if (dataTypes == null)
    {
      dataTypes = new EObjectContainmentEList<DataTypeDefinition>(DataTypeDefinition.class, this, LilPackage.LIL_MODEL__DATA_TYPES);
    }
    return dataTypes;
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
      case LilPackage.LIL_MODEL__INTERACTORS:
        return ((InternalEList<?>)getInteractors()).basicRemove(otherEnd, msgs);
      case LilPackage.LIL_MODEL__DATA_TYPES:
        return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
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
      case LilPackage.LIL_MODEL__INTERACTORS:
        return getInteractors();
      case LilPackage.LIL_MODEL__DATA_TYPES:
        return getDataTypes();
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
      case LilPackage.LIL_MODEL__INTERACTORS:
        getInteractors().clear();
        getInteractors().addAll((Collection<? extends Interactor>)newValue);
        return;
      case LilPackage.LIL_MODEL__DATA_TYPES:
        getDataTypes().clear();
        getDataTypes().addAll((Collection<? extends DataTypeDefinition>)newValue);
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
      case LilPackage.LIL_MODEL__INTERACTORS:
        getInteractors().clear();
        return;
      case LilPackage.LIL_MODEL__DATA_TYPES:
        getDataTypes().clear();
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
      case LilPackage.LIL_MODEL__INTERACTORS:
        return interactors != null && !interactors.isEmpty();
      case LilPackage.LIL_MODEL__DATA_TYPES:
        return dataTypes != null && !dataTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LilModelImpl
