/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Data Declaration Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorDataDeclarationFlow#getSource <em>Source</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorDataDeclarationFlow#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorDataDeclarationFlow()
 * @model
 * @generated
 */
public interface InteractorDataDeclarationFlow extends InteractorDataDeclaration
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(InteractorDataAlias)
   * @see com.crubier.lil.lil.LilPackage#getInteractorDataDeclarationFlow_Source()
   * @model containment="true"
   * @generated
   */
  InteractorDataAlias getSource();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorDataDeclarationFlow#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(InteractorDataAlias value);

  /**
   * Returns the value of the '<em><b>Destinations</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.InteractorDataAlias}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destinations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Destinations</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getInteractorDataDeclarationFlow_Destinations()
   * @model containment="true"
   * @generated
   */
  EList<InteractorDataAlias> getDestinations();

} // InteractorDataDeclarationFlow
