/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Data Emission External</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorDataEmissionExternal#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorDataEmissionExternal()
 * @model
 * @generated
 */
public interface InteractorDataEmissionExternal extends InteractorDataEmission
{
  /**
   * Returns the value of the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destination</em>' containment reference.
   * @see #setDestination(InteractorDataAlias)
   * @see com.crubier.lil.lil.LilPackage#getInteractorDataEmissionExternal_Destination()
   * @model containment="true"
   * @generated
   */
  InteractorDataAlias getDestination();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorDataEmissionExternal#getDestination <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Destination</em>' containment reference.
   * @see #getDestination()
   * @generated
   */
  void setDestination(InteractorDataAlias value);

} // InteractorDataEmissionExternal
