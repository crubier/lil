/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorComponent#getType <em>Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorComponent#getActors <em>Actors</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorComponent()
 * @model
 * @generated
 */
public interface InteractorComponent extends Entity
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
   * @see #setType(InteractorType)
   * @see com.crubier.lil.lil.LilPackage#getInteractorComponent_Type()
   * @model containment="true"
   * @generated
   */
  InteractorType getType();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorComponent#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(InteractorType value);

  /**
   * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.ActorAlias}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actors</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getInteractorComponent_Actors()
   * @model containment="true"
   * @generated
   */
  EList<ActorAlias> getActors();

} // InteractorComponent
