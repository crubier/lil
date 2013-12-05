/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.LilModel#getActorType <em>Actor Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.LilModel#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.LilModel#getInteractorType <em>Interactor Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getLilModel()
 * @model
 * @generated
 */
public interface LilModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Actor Type</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.ActorTypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actor Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actor Type</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getLilModel_ActorType()
   * @model containment="true"
   * @generated
   */
  EList<ActorTypeDefinition> getActorType();

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.DataTypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getLilModel_DataType()
   * @model containment="true"
   * @generated
   */
  EList<DataTypeDefinition> getDataType();

  /**
   * Returns the value of the '<em><b>Interactor Type</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.InteractorTypeDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactor Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactor Type</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getLilModel_InteractorType()
   * @model containment="true"
   * @generated
   */
  EList<InteractorTypeDefinition> getInteractorType();

} // LilModel
