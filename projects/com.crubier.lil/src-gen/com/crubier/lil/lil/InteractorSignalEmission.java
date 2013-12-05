/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Signal Emission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorSignalEmission#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorSignalEmission#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorSignalEmission()
 * @model
 * @generated
 */
public interface InteractorSignalEmission extends EObject
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
   * @see #setInstance(InteractorData)
   * @see com.crubier.lil.lil.LilPackage#getInteractorSignalEmission_Instance()
   * @model
   * @generated
   */
  InteractorData getInstance();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorSignalEmission#getInstance <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(InteractorData value);

  /**
   * Returns the value of the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' containment reference.
   * @see #setDestination(InteractorSignalAlias)
   * @see com.crubier.lil.lil.LilPackage#getInteractorSignalEmission_Destination()
   * @model containment="true"
   * @generated
   */
  InteractorSignalAlias getDestination();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorSignalEmission#getDestination <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' containment reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(InteractorSignalAlias value);

} // InteractorSignalEmission
