/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataTypeStructure#getName <em>Name</em>}</li>
 *   <li>{@link com.crubier.lil.lil.DataTypeStructure#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataTypeStructure()
 * @model
 * @generated
 */
public interface DataTypeStructure extends DataTypeDefinition
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
   * @see com.crubier.lil.lil.LilPackage#getDataTypeStructure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeStructure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.DataTypeStructureField}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getDataTypeStructure_Fields()
   * @model containment="true"
   * @generated
   */
  EList<DataTypeStructureField> getFields();

} // DataTypeStructure
