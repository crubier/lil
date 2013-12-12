/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Actor Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorActorDeclaration#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorActorDeclaration()
 * @model
 * @generated
 */
public interface InteractorActorDeclaration extends InteractorEntityDeclaration
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(ActorType)
   * @see com.crubier.lil.lil.LilPackage#getInteractorActorDeclaration_Type()
   * @model containment="true"
   * @generated
   */
  ActorType getType();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorActorDeclaration#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ActorType value);

} // InteractorActorDeclaration
