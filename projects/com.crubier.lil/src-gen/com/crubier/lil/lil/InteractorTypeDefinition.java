/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorTypeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorTypeDefinition#getActor <em>Actor</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorTypeDefinition#getData <em>Data</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorTypeDefinition#getComponent <em>Component</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorTypeDefinition#getBehavior <em>Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorTypeDefinition()
 * @model
 * @generated
 */
public interface InteractorTypeDefinition extends EObject
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
   * @see com.crubier.lil.lil.LilPackage#getInteractorTypeDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorTypeDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.InteractorActor}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getInteractorTypeDefinition_Actor()
   * @model containment="true"
   * @generated
   */
  EList<InteractorActor> getActor();

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.InteractorData}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getInteractorTypeDefinition_Data()
   * @model containment="true"
   * @generated
   */
  EList<InteractorData> getData();

  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.InteractorComponent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getInteractorTypeDefinition_Component()
   * @model containment="true"
   * @generated
   */
  EList<InteractorComponent> getComponent();

  /**
   * Returns the value of the '<em><b>Behavior</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.InteractorBehavior}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Behavior</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behavior</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getInteractorTypeDefinition_Behavior()
   * @model containment="true"
   * @generated
   */
  EList<InteractorBehavior> getBehavior();

} // InteractorTypeDefinition
