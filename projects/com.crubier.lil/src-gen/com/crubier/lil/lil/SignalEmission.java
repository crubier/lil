/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Emission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.SignalEmission#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.crubier.lil.lil.SignalEmission#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getSignalEmission()
 * @model
 * @generated
 */
public interface SignalEmission extends EObject
{
  /**
   * Returns the value of the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' reference.
   * @see #setInstance(SignalDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getSignalEmission_Instance()
   * @model
   * @generated
   */
  SignalDeclaration getInstance();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.SignalEmission#getInstance <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(SignalDeclaration value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' containment reference.
   * @see #setDestination(SignalAlias)
   * @see com.crubier.lil.lil.LilPackage#getSignalEmission_Destination()
   * @model containment="true"
   * @generated
   */
  SignalAlias getDestination();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.SignalEmission#getDestination <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' containment reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(SignalAlias value);

} // SignalEmission
