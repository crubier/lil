/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.DataCollectionType;
import com.crubier.lil.lil.DataDefinitionSet;
import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeDefinition;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeImpl#getDefinitionSet <em>Definition Set</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeImpl#getCustom <em>Custom</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeImpl#getCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType
{
  /**
   * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected static final String BASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected String base = BASE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDefinitionSet() <em>Definition Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitionSet()
   * @generated
   * @ordered
   */
  protected DataDefinitionSet definitionSet;

  /**
   * The cached value of the '{@link #getCustom() <em>Custom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustom()
   * @generated
   * @ordered
   */
  protected DataTypeDefinition custom;

  /**
   * The cached value of the '{@link #getCollection() <em>Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollection()
   * @generated
   * @ordered
   */
  protected DataCollectionType collection;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeImpl()
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
    return LilPackage.Literals.DATA_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(String newBase)
  {
    String oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDefinitionSet getDefinitionSet()
  {
    return definitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefinitionSet(DataDefinitionSet newDefinitionSet, NotificationChain msgs)
  {
    DataDefinitionSet oldDefinitionSet = definitionSet;
    definitionSet = newDefinitionSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE__DEFINITION_SET, oldDefinitionSet, newDefinitionSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinitionSet(DataDefinitionSet newDefinitionSet)
  {
    if (newDefinitionSet != definitionSet)
    {
      NotificationChain msgs = null;
      if (definitionSet != null)
        msgs = ((InternalEObject)definitionSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.DATA_TYPE__DEFINITION_SET, null, msgs);
      if (newDefinitionSet != null)
        msgs = ((InternalEObject)newDefinitionSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.DATA_TYPE__DEFINITION_SET, null, msgs);
      msgs = basicSetDefinitionSet(newDefinitionSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE__DEFINITION_SET, newDefinitionSet, newDefinitionSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeDefinition getCustom()
  {
    if (custom != null && custom.eIsProxy())
    {
      InternalEObject oldCustom = (InternalEObject)custom;
      custom = (DataTypeDefinition)eResolveProxy(oldCustom);
      if (custom != oldCustom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.DATA_TYPE__CUSTOM, oldCustom, custom));
      }
    }
    return custom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeDefinition basicGetCustom()
  {
    return custom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCustom(DataTypeDefinition newCustom)
  {
    DataTypeDefinition oldCustom = custom;
    custom = newCustom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE__CUSTOM, oldCustom, custom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataCollectionType getCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollection(DataCollectionType newCollection, NotificationChain msgs)
  {
    DataCollectionType oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE__COLLECTION, oldCollection, newCollection);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollection(DataCollectionType newCollection)
  {
    if (newCollection != collection)
    {
      NotificationChain msgs = null;
      if (collection != null)
        msgs = ((InternalEObject)collection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.DATA_TYPE__COLLECTION, null, msgs);
      if (newCollection != null)
        msgs = ((InternalEObject)newCollection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.DATA_TYPE__COLLECTION, null, msgs);
      msgs = basicSetCollection(newCollection, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE__COLLECTION, newCollection, newCollection));
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
      case LilPackage.DATA_TYPE__DEFINITION_SET:
        return basicSetDefinitionSet(null, msgs);
      case LilPackage.DATA_TYPE__COLLECTION:
        return basicSetCollection(null, msgs);
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
      case LilPackage.DATA_TYPE__BASE:
        return getBase();
      case LilPackage.DATA_TYPE__DEFINITION_SET:
        return getDefinitionSet();
      case LilPackage.DATA_TYPE__CUSTOM:
        if (resolve) return getCustom();
        return basicGetCustom();
      case LilPackage.DATA_TYPE__COLLECTION:
        return getCollection();
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
      case LilPackage.DATA_TYPE__BASE:
        setBase((String)newValue);
        return;
      case LilPackage.DATA_TYPE__DEFINITION_SET:
        setDefinitionSet((DataDefinitionSet)newValue);
        return;
      case LilPackage.DATA_TYPE__CUSTOM:
        setCustom((DataTypeDefinition)newValue);
        return;
      case LilPackage.DATA_TYPE__COLLECTION:
        setCollection((DataCollectionType)newValue);
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
      case LilPackage.DATA_TYPE__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case LilPackage.DATA_TYPE__DEFINITION_SET:
        setDefinitionSet((DataDefinitionSet)null);
        return;
      case LilPackage.DATA_TYPE__CUSTOM:
        setCustom((DataTypeDefinition)null);
        return;
      case LilPackage.DATA_TYPE__COLLECTION:
        setCollection((DataCollectionType)null);
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
      case LilPackage.DATA_TYPE__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
      case LilPackage.DATA_TYPE__DEFINITION_SET:
        return definitionSet != null;
      case LilPackage.DATA_TYPE__CUSTOM:
        return custom != null;
      case LilPackage.DATA_TYPE__COLLECTION:
        return collection != null;
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
    result.append(" (base: ");
    result.append(base);
    result.append(')');
    return result.toString();
  }

} //DataTypeImpl
