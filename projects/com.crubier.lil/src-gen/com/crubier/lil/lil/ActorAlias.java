/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.ActorAlias#getSource <em>Source</em>}</li>
 *   <li>{@link com.crubier.lil.lil.ActorAlias#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getActorAlias()
 * @model
 * @generated
 */
public interface ActorAlias extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(InteractorActor)
   * @see com.crubier.lil.lil.LilPackage#getActorAlias_Source()
   * @model
   * @generated
   */
  InteractorActor getSource();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ActorAlias#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(InteractorActor value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' reference.
   * @see #setAlias(InteractorActor)
   * @see com.crubier.lil.lil.LilPackage#getActorAlias_Alias()
   * @model
   * @generated
   */
  InteractorActor getAlias();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ActorAlias#getAlias <em>Alias</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' reference.
   * @see #getAlias()
   * @generated
   */
  void setAlias(InteractorActor value);

} // ActorAlias
