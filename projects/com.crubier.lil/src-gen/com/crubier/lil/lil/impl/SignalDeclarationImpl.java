/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.DataType;
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
 * An implementation of the model object '<em><b>Signal Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.SignalDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.SignalDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.SignalDeclarationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.SignalDeclarationImpl#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalDeclarationImpl extends MinimalEObjectImpl.Container implements SignalDeclaration
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DataType type;

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
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected AccessibleEntity source;

  /**
   * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinations()
   * @generated
   * @ordered
   */
  protected EList<AccessibleEntity> destinations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SignalDeclarationImpl()
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
    return LilPackage.Literals.SIGNAL_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(DataType newType, NotificationChain msgs)
  {
    DataType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DataType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.SIGNAL_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.SIGNAL_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL_DECLARATION__TYPE, newType, newType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AccessibleEntity getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(AccessibleEntity newSource, NotificationChain msgs)
  {
    AccessibleEntity oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL_DECLARATION__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(AccessibleEntity newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.SIGNAL_DECLARATION__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.SIGNAL_DECLARATION__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL_DECLARATION__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AccessibleEntity> getDestinations()
  {
    if (destinations == null)
    {
      destinations = new EObjectContainmentEList<AccessibleEntity>(AccessibleEntity.class, this, LilPackage.SIGNAL_DECLARATION__DESTINATIONS);
    }
    return destinations;
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
      case LilPackage.SIGNAL_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case LilPackage.SIGNAL_DECLARATION__SOURCE:
        return basicSetSource(null, msgs);
      case LilPackage.SIGNAL_DECLARATION__DESTINATIONS:
        return ((InternalEList<?>)getDestinations()).basicRemove(otherEnd, msgs);
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
      case LilPackage.SIGNAL_DECLARATION__TYPE:
        return getType();
      case LilPackage.SIGNAL_DECLARATION__NAME:
        return getName();
      case LilPackage.SIGNAL_DECLARATION__SOURCE:
        return getSource();
      case LilPackage.SIGNAL_DECLARATION__DESTINATIONS:
        return getDestinations();
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
      case LilPackage.SIGNAL_DECLARATION__TYPE:
        setType((DataType)newValue);
        return;
      case LilPackage.SIGNAL_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case LilPackage.SIGNAL_DECLARATION__SOURCE:
        setSource((AccessibleEntity)newValue);
        return;
      case LilPackage.SIGNAL_DECLARATION__DESTINATIONS:
        getDestinations().clear();
        getDestinations().addAll((Collection<? extends AccessibleEntity>)newValue);
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
      case LilPackage.SIGNAL_DECLARATION__TYPE:
        setType((DataType)null);
        return;
      case LilPackage.SIGNAL_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LilPackage.SIGNAL_DECLARATION__SOURCE:
        setSource((AccessibleEntity)null);
        return;
      case LilPackage.SIGNAL_DECLARATION__DESTINATIONS:
        getDestinations().clear();
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
      case LilPackage.SIGNAL_DECLARATION__TYPE:
        return type != null;
      case LilPackage.SIGNAL_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LilPackage.SIGNAL_DECLARATION__SOURCE:
        return source != null;
      case LilPackage.SIGNAL_DECLARATION__DESTINATIONS:
        return destinations != null && !destinations.isEmpty();
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

} //SignalDeclarationImpl
