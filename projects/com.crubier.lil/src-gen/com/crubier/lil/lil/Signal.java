/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.Signal#getName <em>Name</em>}</li>
 *   <li>{@link com.crubier.lil.lil.Signal#getType <em>Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.Signal#getDefinitionSet <em>Definition Set</em>}</li>
 *   <li>{@link com.crubier.lil.lil.Signal#getMode <em>Mode</em>}</li>
 *   <li>{@link com.crubier.lil.lil.Signal#getSource <em>Source</em>}</li>
 *   <li>{@link com.crubier.lil.lil.Signal#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getSignal()
 * @model
 * @generated
 */
public interface Signal extends EObject
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
   * @see com.crubier.lil.lil.LilPackage#getSignal_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.Signal#getName <em>Name</em>}' attribute.
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
   * @see com.crubier.lil.lil.LilPackage#getSignal_Type()
   * @model containment="true"
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.Signal#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

  /**
   * Returns the value of the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition Set</em>' containment reference.
   * @see #setDefinitionSet(DefinitionSet)
   * @see com.crubier.lil.lil.LilPackage#getSignal_DefinitionSet()
   * @model containment="true"
   * @generated
   */
  DefinitionSet getDefinitionSet();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.Signal#getDefinitionSet <em>Definition Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition Set</em>' containment reference.
   * @see #getDefinitionSet()
   * @generated
   */
  void setDefinitionSet(DefinitionSet value);

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
   * @see com.crubier.lil.lil.LilPackage#getSignal_Mode()
   * @model
   * @generated
   */
  String getMode();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.Signal#getMode <em>Mode</em>}' attribute.
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
   * @see #setSource(SignalAlias)
   * @see com.crubier.lil.lil.LilPackage#getSignal_Source()
   * @model containment="true"
   * @generated
   */
  SignalAlias getSource();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.Signal#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(SignalAlias value);

  /**
   * Returns the value of the '<em><b>Destinations</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.SignalAlias}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destinations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destinations</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getSignal_Destinations()
   * @model containment="true"
   * @generated
   */
  EList<SignalAlias> getDestinations();

} // Signal
