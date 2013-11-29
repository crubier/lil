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
 *   <li>{@link com.crubier.lil.lil.DataTypeCompound#getCompound <em>Compound</em>}</li>
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
   * Returns the value of the '<em><b>Compound</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compound</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compound</em>' reference.
   * @see #setCompound(DataTypeStructure)
   * @see com.crubier.lil.lil.LilPackage#getDataTypeCompound_Compound()
   * @model
   * @generated
   */
  DataTypeStructure getCompound();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeCompound#getCompound <em>Compound</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compound</em>' reference.
   * @see #getCompound()
   * @generated
   */
  void setCompound(DataTypeStructure value);

} // DataTypeCompound
