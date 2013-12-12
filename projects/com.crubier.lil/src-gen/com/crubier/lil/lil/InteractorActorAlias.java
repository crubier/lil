/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Actor Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorActorAlias#getActor <em>Actor</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorActorAlias#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorActorAlias()
 * @model
 * @generated
 */
public interface InteractorActorAlias extends EObject
{
  /**
   * Returns the value of the '<em><b>Actor</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor</em>' reference.
   * @see #setActor(InteractorActorDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getInteractorActorAlias_Actor()
   * @model
   * @generated
   */
  InteractorActorDeclaration getActor();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorActorAlias#getActor <em>Actor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actor</em>' reference.
   * @see #getActor()
   * @generated
   */
  void setActor(InteractorActorDeclaration value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' reference.
   * @see #setAlias(InteractorActorDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getInteractorActorAlias_Alias()
   * @model
   * @generated
   */
  InteractorActorDeclaration getAlias();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorActorAlias#getAlias <em>Alias</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' reference.
   * @see #getAlias()
   * @generated
   */
  void setAlias(InteractorActorDeclaration value);

} // InteractorActorAlias
