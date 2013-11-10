/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.BehaviorDeclaration;
import com.crubier.lil.lil.EntityDeclaration;
import com.crubier.lil.lil.InteractorDeclaration;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.SignalDeclaration;

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
 * An implementation of the model object '<em><b>Interactor Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorDeclarationImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorDeclarationImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorDeclarationImpl#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractorDeclarationImpl extends MinimalEObjectImpl.Container implements InteractorDeclaration
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
   * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntities()
   * @generated
   * @ordered
   */
  protected EList<EntityDeclaration> entities;

  /**
   * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignals()
   * @generated
   * @ordered
   */
  protected EList<SignalDeclaration> signals;

  /**
   * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviors()
   * @generated
   * @ordered
   */
  protected EList<BehaviorDeclaration> behaviors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractorDeclarationImpl()
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
    return LilPackage.Literals.INTERACTOR_DECLARATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityDeclaration> getEntities()
  {
    if (entities == null)
    {
      entities = new EObjectContainmentEList<EntityDeclaration>(EntityDeclaration.class, this, LilPackage.INTERACTOR_DECLARATION__ENTITIES);
    }
    return entities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SignalDeclaration> getSignals()
  {
    if (signals == null)
    {
      signals = new EObjectContainmentEList<SignalDeclaration>(SignalDeclaration.class, this, LilPackage.INTERACTOR_DECLARATION__SIGNALS);
    }
    return signals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BehaviorDeclaration> getBehaviors()
  {
    if (behaviors == null)
    {
      behaviors = new EObjectContainmentEList<BehaviorDeclaration>(BehaviorDeclaration.class, this, LilPackage.INTERACTOR_DECLARATION__BEHAVIORS);
    }
    return behaviors;
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
      case LilPackage.INTERACTOR_DECLARATION__ENTITIES:
        return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
      case LilPackage.INTERACTOR_DECLARATION__SIGNALS:
        return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
      case LilPackage.INTERACTOR_DECLARATION__BEHAVIORS:
        return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
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
      case LilPackage.INTERACTOR_DECLARATION__NAME:
        return getName();
      case LilPackage.INTERACTOR_DECLARATION__ENTITIES:
        return getEntities();
      case LilPackage.INTERACTOR_DECLARATION__SIGNALS:
        return getSignals();
      case LilPackage.INTERACTOR_DECLARATION__BEHAVIORS:
        return getBehaviors();
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
      case LilPackage.INTERACTOR_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case LilPackage.INTERACTOR_DECLARATION__ENTITIES:
        getEntities().clear();
        getEntities().addAll((Collection<? extends EntityDeclaration>)newValue);
        return;
      case LilPackage.INTERACTOR_DECLARATION__SIGNALS:
        getSignals().clear();
        getSignals().addAll((Collection<? extends SignalDeclaration>)newValue);
        return;
      case LilPackage.INTERACTOR_DECLARATION__BEHAVIORS:
        getBehaviors().clear();
        getBehaviors().addAll((Collection<? extends BehaviorDeclaration>)newValue);
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
      case LilPackage.INTERACTOR_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LilPackage.INTERACTOR_DECLARATION__ENTITIES:
        getEntities().clear();
        return;
      case LilPackage.INTERACTOR_DECLARATION__SIGNALS:
        getSignals().clear();
        return;
      case LilPackage.INTERACTOR_DECLARATION__BEHAVIORS:
        getBehaviors().clear();
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
      case LilPackage.INTERACTOR_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LilPackage.INTERACTOR_DECLARATION__ENTITIES:
        return entities != null && !entities.isEmpty();
      case LilPackage.INTERACTOR_DECLARATION__SIGNALS:
        return signals != null && !signals.isEmpty();
      case LilPackage.INTERACTOR_DECLARATION__BEHAVIORS:
        return behaviors != null && !behaviors.isEmpty();
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

} //InteractorDeclarationImpl
