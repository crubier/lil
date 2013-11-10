/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.ComponentDeclaration#getInteractor <em>Interactor</em>}</li>
 *   <li>{@link com.crubier.lil.lil.ComponentDeclaration#getAliases <em>Aliases</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getComponentDeclaration()
 * @model
 * @generated
 */
public interface ComponentDeclaration extends EntityDeclaration
{
  /**
   * Returns the value of the '<em><b>Interactor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactor</em>' reference.
   * @see #setInteractor(InteractorDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getComponentDeclaration_Interactor()
   * @model
   * @generated
   */
  InteractorDeclaration getInteractor();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ComponentDeclaration#getInteractor <em>Interactor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interactor</em>' reference.
   * @see #getInteractor()
   * @generated
   */
  void setInteractor(InteractorDeclaration value);

  /**
   * Returns the value of the '<em><b>Aliases</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.ActorAlias}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliases</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getComponentDeclaration_Aliases()
   * @model containment="true"
   * @generated
   */
  EList<ActorAlias> getAliases();

} // ComponentDeclaration
