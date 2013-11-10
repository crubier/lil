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
 *   <li>{@link com.crubier.lil.lil.ActorAlias#getRemote <em>Remote</em>}</li>
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
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(Actor)
   * @see com.crubier.lil.lil.LilPackage#getActorAlias_Source()
   * @model containment="true"
   * @generated
   */
  Actor getSource();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ActorAlias#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Actor value);

  /**
   * Returns the value of the '<em><b>Remote</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remote</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remote</em>' containment reference.
   * @see #setRemote(Actor)
   * @see com.crubier.lil.lil.LilPackage#getActorAlias_Remote()
   * @model containment="true"
   * @generated
   */
  Actor getRemote();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ActorAlias#getRemote <em>Remote</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remote</em>' containment reference.
   * @see #getRemote()
   * @generated
   */
  void setRemote(Actor value);

} // ActorAlias
