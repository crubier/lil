/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Behavior Cause On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorBehaviorCauseOn#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorBehaviorCauseOn()
 * @model
 * @generated
 */
public interface InteractorBehaviorCauseOn extends InteractorBehaviorCause
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(InteractorDataReception)
   * @see com.crubier.lil.lil.LilPackage#getInteractorBehaviorCauseOn_Event()
   * @model containment="true"
   * @generated
   */
  InteractorDataReception getEvent();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorBehaviorCauseOn#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(InteractorDataReception value);

} // InteractorBehaviorCauseOn
