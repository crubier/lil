/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.BehaviorDeclaration#getCause <em>Cause</em>}</li>
 *   <li>{@link com.crubier.lil.lil.BehaviorDeclaration#getEffects <em>Effects</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getBehaviorDeclaration()
 * @model
 * @generated
 */
public interface BehaviorDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Cause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cause</em>' containment reference.
   * @see #setCause(Cause)
   * @see com.crubier.lil.lil.LilPackage#getBehaviorDeclaration_Cause()
   * @model containment="true"
   * @generated
   */
  Cause getCause();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.BehaviorDeclaration#getCause <em>Cause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cause</em>' containment reference.
   * @see #getCause()
   * @generated
   */
  void setCause(Cause value);

  /**
   * Returns the value of the '<em><b>Effects</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.Effect}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Effects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Effects</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getBehaviorDeclaration_Effects()
   * @model containment="true"
   * @generated
   */
  EList<Effect> getEffects();

} // BehaviorDeclaration
