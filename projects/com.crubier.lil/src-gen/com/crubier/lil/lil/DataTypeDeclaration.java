/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataTypeDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link com.crubier.lil.lil.DataTypeDeclaration#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataTypeDeclaration()
 * @model
 * @generated
 */
public interface DataTypeDeclaration extends EObject
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
   * @see com.crubier.lil.lil.LilPackage#getDataTypeDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getDataTypeDeclaration_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // DataTypeDeclaration
