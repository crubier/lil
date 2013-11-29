/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataTypeCollection#getMode <em>Mode</em>}</li>
 *   <li>{@link com.crubier.lil.lil.DataTypeCollection#getType <em>Type</em>}</li>
 *   <li>{@link com.crubier.lil.lil.DataTypeCollection#getDefinitionSet <em>Definition Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataTypeCollection()
 * @model
 * @generated
 */
public interface DataTypeCollection extends DataType
{
  /**
   * Returns the value of the '<em><b>Mode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mode</em>' attribute.
   * @see #setMode(String)
   * @see com.crubier.lil.lil.LilPackage#getDataTypeCollection_Mode()
   * @model
   * @generated
   */
  String getMode();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeCollection#getMode <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mode</em>' attribute.
   * @see #getMode()
   * @generated
   */
  void setMode(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DataType)
   * @see com.crubier.lil.lil.LilPackage#getDataTypeCollection_Type()
   * @model
   * @generated
   */
  DataType getType();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeCollection#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DataType value);

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
   * @see com.crubier.lil.lil.LilPackage#getDataTypeCollection_DefinitionSet()
   * @model containment="true"
   * @generated
   */
  DefinitionSet getDefinitionSet();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeCollection#getDefinitionSet <em>Definition Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition Set</em>' containment reference.
   * @see #getDefinitionSet()
   * @generated
   */
  void setDefinitionSet(DefinitionSet value);

} // DataTypeCollection
