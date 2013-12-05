/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Definition Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataTypeDefinitionAlias#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataTypeDefinitionAlias()
 * @model
 * @generated
 */
public interface DataTypeDefinitionAlias extends DataTypeDefinition
{
  /**
   * Returns the value of the '<em><b>Alias</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' containment reference.
   * @see #setAlias(DataType)
   * @see com.crubier.lil.lil.LilPackage#getDataTypeDefinitionAlias_Alias()
   * @model containment="true"
   * @generated
   */
  DataType getAlias();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeDefinitionAlias#getAlias <em>Alias</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' containment reference.
   * @see #getAlias()
   * @generated
   */
  void setAlias(DataType value);

} // DataTypeDefinitionAlias
