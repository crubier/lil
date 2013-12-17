/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.InteractorBehaviorDeclaration;
import com.crubier.lil.lil.InteractorDataDeclaration;
import com.crubier.lil.lil.InteractorEntityDeclaration;
import com.crubier.lil.lil.InteractorTypeDefinition;
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
 * An implementation of the model object '<em><b>Interactor Type Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl#getData <em>Data</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl#getInteractor <em>Interactor</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorTypeDefinitionImpl#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractorTypeDefinitionImpl extends MinimalEObjectImpl.Container implements InteractorTypeDefinition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getActor() <em>Actor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActor()
   * @generated
   * @ordered
   */
  protected EList<InteractorEntityDeclaration> actor;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected EList<InteractorDataDeclaration> data;

  /**
   * The cached value of the '{@link #getInteractor() <em>Interactor</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractor()
   * @generated
   * @ordered
   */
  protected EList<InteractorEntityDeclaration> interactor;

  /**
   * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehavior()
   * @generated
   * @ordered
   */
  protected EList<InteractorBehaviorDeclaration> behavior;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractorTypeDefinitionImpl()
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
    return LilPackage.Literals.INTERACTOR_TYPE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_TYPE_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractorEntityDeclaration> getActor()
  {
    if (actor == null)
    {
      actor = new EObjectContainmentEList<InteractorEntityDeclaration>(InteractorEntityDeclaration.class, this, LilPackage.INTERACTOR_TYPE_DEFINITION__ACTOR);
    }
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractorDataDeclaration> getData()
  {
    if (data == null)
    {
      data = new EObjectContainmentEList<InteractorDataDeclaration>(InteractorDataDeclaration.class, this, LilPackage.INTERACTOR_TYPE_DEFINITION__DATA);
    }
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractorEntityDeclaration> getInteractor()
  {
    if (interactor == null)
    {
      interactor = new EObjectContainmentEList<InteractorEntityDeclaration>(InteractorEntityDeclaration.class, this, LilPackage.INTERACTOR_TYPE_DEFINITION__INTERACTOR);
    }
    return interactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InteractorBehaviorDeclaration> getBehavior()
  {
    if (behavior == null)
    {
      behavior = new EObjectContainmentEList<InteractorBehaviorDeclaration>(InteractorBehaviorDeclaration.class, this, LilPackage.INTERACTOR_TYPE_DEFINITION__BEHAVIOR);
    }
    return behavior;
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
      case LilPackage.INTERACTOR_TYPE_DEFINITION__ACTOR:
        return ((InternalEList<?>)getActor()).basicRemove(otherEnd, msgs);
      case LilPackage.INTERACTOR_TYPE_DEFINITION__DATA:
        return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
      case LilPackage.INTERACTOR_TYPE_DEFINITION__INTERACTOR:
        return ((InternalEList<?>)getInteractor()).basicRemove(otherEnd, msgs);
      case LilPackage.INTERACTOR_TYPE_DEFINITION__BEHAVIOR:
        return ((InternalEList<?>)getBehavior()).basicRemove(otherEnd, msgs);
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
      case LilPackage.INTERACTOR_TYPE_DEFINITION__NAME:
        return getName();
      case LilPackage.INTERACTOR_TYPE_DEFINITION__ACTOR:
        return getActor();
      case LilPackage.INTERACTOR_TYPE_DEFINITION__DATA:
        return getData();
      case LilPackage.INTERACTOR_TYPE_DEFINITION__INTERACTOR:
        return getInteractor();
      case LilPackage.INTERACTOR_TYPE_DEFINITION__BEHAVIOR:
        return getBehavior();
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
      case LilPackage.INTERACTOR_TYPE_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case LilPackage.INTERACTOR_TYPE_DEFINITION__ACTOR:
        getActor().clear();
        getActor().addAll((Collection<? extends InteractorEntityDeclaration>)newValue);
        return;
      case LilPackage.INTERACTOR_TYPE_DEFINITION__DATA:
        getData().clear();
        getData().addAll((Collection<? extends InteractorDataDeclaration>)newValue);
        return;
      case LilPackage.INTERACTOR_TYPE_DEFINITION__INTERACTOR:
        getInteractor().clear();
        getInteractor().addAll((Collection<? extends InteractorEntityDeclaration>)newValue);
        return;
      case LilPackage.INTERACTOR_TYPE_DEFINITION__BEHAVIOR:
        getBehavior().clear();
        getBehavior().addAll((Collection<? extends InteractorBehaviorDeclaration>)newValue);
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
      case LilPackage.INTERACTOR_TYPE_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LilPackage.INTERACTOR_TYPE_DEFINITION__ACTOR:
        getActor().clear();
        return;
      case LilPackage.INTERACTOR_TYPE_DEFINITION__DATA:
        getData().clear();
        return;
      case LilPackage.INTERACTOR_TYPE_DEFINITION__INTERACTOR:
        getInteractor().clear();
        return;
      case LilPackage.INTERACTOR_TYPE_DEFINITION__BEHAVIOR:
        getBehavior().clear();
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
      case LilPackage.INTERACTOR_TYPE_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LilPackage.INTERACTOR_TYPE_DEFINITION__ACTOR:
        return actor != null && !actor.isEmpty();
      case LilPackage.INTERACTOR_TYPE_DEFINITION__DATA:
        return data != null && !data.isEmpty();
      case LilPackage.INTERACTOR_TYPE_DEFINITION__INTERACTOR:
        return interactor != null && !interactor.isEmpty();
      case LilPackage.INTERACTOR_TYPE_DEFINITION__BEHAVIOR:
        return behavior != null && !behavior.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InteractorTypeDefinitionImpl
