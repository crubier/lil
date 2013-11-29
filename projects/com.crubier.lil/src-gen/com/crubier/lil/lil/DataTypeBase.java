/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataTypeBase#getType <em>Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.DataTypeBase#getDefinitionSet <em>Definition Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataTypeBase()
 * @model
 * @generated
 */
public interface DataTypeBase extends DataType
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see com.crubier.lil.lil.LilPackage#getDataTypeBase_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeBase#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition Set</em>' containment reference.
   * @see #setDefinitionSet(DefinitionSet)
   * @see com.crubier.lil.lil.LilPackage#getDataTypeBase_DefinitionSet()
   * @model containment="true"
   * @generated
   */
  DefinitionSet getDefinitionSet();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeBase#getDefinitionSet <em>Definition Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition Set</em>' containment reference.
   * @see #getDefinitionSet()
   * @generated
   */
  void setDefinitionSet(DefinitionSet value);

} // DataTypeBase
