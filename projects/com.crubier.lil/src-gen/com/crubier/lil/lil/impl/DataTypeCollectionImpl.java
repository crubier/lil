/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeCollection;
import com.crubier.lil.lil.DefinitionSet;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeCollectionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeCollectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.DataTypeCollectionImpl#getDefinitionSet <em>Definition Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataTypeCollectionImpl extends DataTypeImpl implements DataTypeCollection
{
  /**
   * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected static final String MODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected String mode = MODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DataType type;

  /**
   * The cached value of the '{@link #getDefinitionSet() <em>Definition Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitionSet()
   * @generated
   * @ordered
   */
  protected DefinitionSet definitionSet;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataTypeCollectionImpl()
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
    return LilPackage.Literals.DATA_TYPE_COLLECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMode(String newMode)
  {
    String oldMode = mode;
    mode = newMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE_COLLECTION__MODE, oldMode, mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (DataType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.DATA_TYPE_COLLECTION__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DataType newType)
  {
    DataType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE_COLLECTION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionSet getDefinitionSet()
  {
    return definitionSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefinitionSet(DefinitionSet newDefinitionSet, NotificationChain msgs)
  {
    DefinitionSet oldDefinitionSet = definitionSet;
    definitionSet = newDefinitionSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE_COLLECTION__DEFINITION_SET, oldDefinitionSet, newDefinitionSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinitionSet(DefinitionSet newDefinitionSet)
  {
    if (newDefinitionSet != definitionSet)
    {
      NotificationChain msgs = null;
      if (definitionSet != null)
        msgs = ((InternalEObject)definitionSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.DATA_TYPE_COLLECTION__DEFINITION_SET, null, msgs);
      if (newDefinitionSet != null)
        msgs = ((InternalEObject)newDefinitionSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.DATA_TYPE_COLLECTION__DEFINITION_SET, null, msgs);
      msgs = basicSetDefinitionSet(newDefinitionSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.DATA_TYPE_COLLECTION__DEFINITION_SET, newDefinitionSet, newDefinitionSet));
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
      case LilPackage.DATA_TYPE_COLLECTION__DEFINITION_SET:
        return basicSetDefinitionSet(null, msgs);
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
      case LilPackage.DATA_TYPE_COLLECTION__MODE:
        return getMode();
      case LilPackage.DATA_TYPE_COLLECTION__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case LilPackage.DATA_TYPE_COLLECTION__DEFINITION_SET:
        return getDefinitionSet();
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
      case LilPackage.DATA_TYPE_COLLECTION__MODE:
        setMode((String)newValue);
        return;
      case LilPackage.DATA_TYPE_COLLECTION__TYPE:
        setType((DataType)newValue);
        return;
      case LilPackage.DATA_TYPE_COLLECTION__DEFINITION_SET:
        setDefinitionSet((DefinitionSet)newValue);
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
      case LilPackage.DATA_TYPE_COLLECTION__MODE:
        setMode(MODE_EDEFAULT);
        return;
      case LilPackage.DATA_TYPE_COLLECTION__TYPE:
        setType((DataType)null);
        return;
      case LilPackage.DATA_TYPE_COLLECTION__DEFINITION_SET:
        setDefinitionSet((DefinitionSet)null);
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
      case LilPackage.DATA_TYPE_COLLECTION__MODE:
        return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
      case LilPackage.DATA_TYPE_COLLECTION__TYPE:
        return type != null;
      case LilPackage.DATA_TYPE_COLLECTION__DEFINITION_SET:
        return definitionSet != null;
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
    result.append(" (mode: ");
    result.append(mode);
    result.append(')');
    return result.toString();
  }

} //DataTypeCollectionImpl
