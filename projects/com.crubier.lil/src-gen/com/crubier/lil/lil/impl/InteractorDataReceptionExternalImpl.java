/**
 */
package com.crubier.lil.lil.impl;

import com.crubier.lil.lil.InteractorDataAlias;
import com.crubier.lil.lil.InteractorDataDeclaration;
import com.crubier.lil.lil.InteractorDataReceptionExternal;
import com.crubier.lil.lil.LilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interactor Data Reception External</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorDataReceptionExternalImpl#getData <em>Data</em>}</li>
 *   <li>{@link com.crubier.lil.lil.impl.InteractorDataReceptionExternalImpl#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractorDataReceptionExternalImpl extends InteractorDataReceptionImpl implements InteractorDataReceptionExternal
{
  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected InteractorDataDeclaration data;

  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected InteractorDataAlias source;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractorDataReceptionExternalImpl()
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
    return LilPackage.Literals.INTERACTOR_DATA_RECEPTION_EXTERNAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataDeclaration getData()
  {
    if (data != null && data.eIsProxy())
    {
      InternalEObject oldData = (InternalEObject)data;
      data = (InteractorDataDeclaration)eResolveProxy(oldData);
      if (data != oldData)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA, oldData, data));
      }
    }
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataDeclaration basicGetData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData(InteractorDataDeclaration newData)
  {
    InteractorDataDeclaration oldData = data;
    data = newData;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA, oldData, data));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InteractorDataAlias getSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSource(InteractorDataAlias newSource, NotificationChain msgs)
  {
    InteractorDataAlias oldSource = source;
    source = newSource;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE, oldSource, newSource);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSource(InteractorDataAlias newSource)
  {
    if (newSource != source)
    {
      NotificationChain msgs = null;
      if (source != null)
        msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE, null, msgs);
      if (newSource != null)
        msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE, null, msgs);
      msgs = basicSetSource(newSource, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE, newSource, newSource));
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
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE:
        return basicSetSource(null, msgs);
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
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA:
        if (resolve) return getData();
        return basicGetData();
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE:
        return getSource();
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
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA:
        setData((InteractorDataDeclaration)newValue);
        return;
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE:
        setSource((InteractorDataAlias)newValue);
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
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA:
        setData((InteractorDataDeclaration)null);
        return;
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE:
        setSource((InteractorDataAlias)null);
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
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA:
        return data != null;
      case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE:
        return source != null;
    }
    return super.eIsSet(featureID);
  }

} //InteractorDataReceptionExternalImpl
