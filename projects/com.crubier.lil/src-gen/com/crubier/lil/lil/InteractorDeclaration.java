/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorDeclaration#getEntities <em>Entities</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorDeclaration#getSignals <em>Signals</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorDeclaration#getBehaviors <em>Behaviors</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorDeclaration()
 * @model
 * @generated
 */
public interface InteractorDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.crubier.lil.lil.LilPackage#getInteractorDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.EntityDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getInteractorDeclaration_Entities()
   * @model containment="true"
   * @generated
   */
  EList<EntityDeclaration> getEntities();

  /**
   * Returns the value of the '<em><b>Signals</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.SignalDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signals</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getInteractorDeclaration_Signals()
   * @model containment="true"
   * @generated
   */
  EList<SignalDeclaration> getSignals();

  /**
   * Returns the value of the '<em><b>Behaviors</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.BehaviorDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behaviors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviors</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getInteractorDeclaration_Behaviors()
   * @model containment="true"
   * @generated
   */
  EList<BehaviorDeclaration> getBehaviors();

} // InteractorDeclaration
