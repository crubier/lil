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
 *   <li>{@link com.crubier.lil.lil.Model#getInteractors <em>Interactors</em>}</li>
 *   <li>{@link com.crubier.lil.lil.Model#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Interactors</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.InteractorDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactors</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getModel_Interactors()
   * @model containment="true"
   * @generated
   */
  EList<InteractorDeclaration> getInteractors();

  /**
   * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.DataTypeDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Types</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getModel_DataTypes()
   * @model containment="true"
   * @generated
   */
  EList<DataTypeDeclaration> getDataTypes();

} // Model
