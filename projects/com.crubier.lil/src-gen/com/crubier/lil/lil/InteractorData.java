/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorData#getName <em>Name</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorData#getType <em>Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorData#getMode <em>Mode</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorData#getSource <em>Source</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorData#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorData()
 * @model
 * @generated
 */
public interface InteractorData extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.crubier.lil.lil.LilPackage#getInteractorData_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorData#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DataType)
   * @see com.crubier.lil.lil.LilPackage#getInteractorData_Type()
   * @model containment="true"
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorData#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see #setMode(String)
   * @see com.crubier.lil.lil.LilPackage#getInteractorData_Mode()
   * @model
   * @generated
   */
  String getMode();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorData#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see #getMode()
   * @generated
   */
  void setMode(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(InteractorSignalAlias)
   * @see com.crubier.lil.lil.LilPackage#getInteractorData_Source()
   * @model containment="true"
   * @generated
   */
  InteractorSignalAlias getSource();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorData#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(InteractorSignalAlias value);

  /**
   * Returns the value of the '<em><b>Destinations</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.InteractorSignalAlias}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destinations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destinations</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getInteractorData_Destinations()
   * @model containment="true"
   * @generated
   */
  EList<InteractorSignalAlias> getDestinations();

} // InteractorData
