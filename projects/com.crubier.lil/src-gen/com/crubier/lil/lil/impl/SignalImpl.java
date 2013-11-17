/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DefinitionSet;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.Signal;
import com.crubier.lil.lil.SignalAlias;

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
 * An implementation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.SignalImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.SignalImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.SignalImpl#getDefinitionSet <em>Definition Set</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.SignalImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.SignalImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.SignalImpl#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SignalImpl extends MinimalEObjectImpl.Container implements Signal
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
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
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected SignalAlias source;

  /**
   * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinations()
   * @generated
   * @ordered
   */
  protected EList<SignalAlias> destinations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SignalImpl()
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
    return LilPackage.Literals.SIGNAL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL__TYPE, oldType, newType);
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
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.SIGNAL__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.SIGNAL__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL__TYPE, newType, newType));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL__DEFINITION_SET, oldDefinitionSet, newDefinitionSet);
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
        msgs = ((InternalEObject)definitionSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.SIGNAL__DEFINITION_SET, null, msgs);
      if (newDefinitionSet != null)
        msgs = ((InternalEObject)newDefinitionSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.SIGNAL__DEFINITION_SET, null, msgs);
      msgs = basicSetDefinitionSet(newDefinitionSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL__DEFINITION_SET, newDefinitionSet, newDefinitionSet));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL__MODE, oldMode, mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SignalAlias getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(SignalAlias newSource, NotificationChain msgs)
  {
    SignalAlias oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(SignalAlias newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.SIGNAL__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.SIGNAL__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.SIGNAL__SOURCE, newSource, newSource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SignalAlias> getDestinations()
  {
    if (destinations == null)
    {
      destinations = new EObjectContainmentEList<SignalAlias>(SignalAlias.class, this, LilPackage.SIGNAL__DESTINATIONS);
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
      case LilPackage.SIGNAL__TYPE:
        return basicSetType(null, msgs);
      case LilPackage.SIGNAL__DEFINITION_SET:
        return basicSetDefinitionSet(null, msgs);
      case LilPackage.SIGNAL__SOURCE:
        return basicSetSource(null, msgs);
      case LilPackage.SIGNAL__DESTINATIONS:
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
      case LilPackage.SIGNAL__NAME:
        return getName();
      case LilPackage.SIGNAL__TYPE:
        return getType();
      case LilPackage.SIGNAL__DEFINITION_SET:
        return getDefinitionSet();
      case LilPackage.SIGNAL__MODE:
        return getMode();
      case LilPackage.SIGNAL__SOURCE:
        return getSource();
      case LilPackage.SIGNAL__DESTINATIONS:
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
      case LilPackage.SIGNAL__NAME:
        setName((String)newValue);
        return;
      case LilPackage.SIGNAL__TYPE:
        setType((DataType)newValue);
        return;
      case LilPackage.SIGNAL__DEFINITION_SET:
        setDefinitionSet((DefinitionSet)newValue);
        return;
      case LilPackage.SIGNAL__MODE:
        setMode((String)newValue);
        return;
      case LilPackage.SIGNAL__SOURCE:
        setSource((SignalAlias)newValue);
        return;
      case LilPackage.SIGNAL__DESTINATIONS:
        getDestinations().clear();
        getDestinations().addAll((Collection<? extends SignalAlias>)newValue);
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
      case LilPackage.SIGNAL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LilPackage.SIGNAL__TYPE:
        setType((DataType)null);
        return;
      case LilPackage.SIGNAL__DEFINITION_SET:
        setDefinitionSet((DefinitionSet)null);
        return;
      case LilPackage.SIGNAL__MODE:
        setMode(MODE_EDEFAULT);
        return;
      case LilPackage.SIGNAL__SOURCE:
        setSource((SignalAlias)null);
        return;
      case LilPackage.SIGNAL__DESTINATIONS:
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
      case LilPackage.SIGNAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LilPackage.SIGNAL__TYPE:
        return type != null;
      case LilPackage.SIGNAL__DEFINITION_SET:
        return definitionSet != null;
      case LilPackage.SIGNAL__MODE:
        return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
      case LilPackage.SIGNAL__SOURCE:
        return source != null;
      case LilPackage.SIGNAL__DESTINATIONS:
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
    result.append(", mode: ");
    result.append(mode);
    result.append(')');
    return result.toString();
  }

} //SignalImpl
