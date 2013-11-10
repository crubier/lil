/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Compound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataTypeCompound#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataTypeCompound()
 * @model
 * @generated
 */
public interface DataTypeCompound extends DataType
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(DataTypeCompoundDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getDataTypeCompound_Type()
   * @model
   * @generated
   */
  DataTypeCompoundDeclaration getType();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeCompound#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(DataTypeCompoundDeclaration value);

} // DataTypeCompound
