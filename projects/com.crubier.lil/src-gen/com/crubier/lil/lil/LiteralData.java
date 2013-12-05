/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.LiteralData#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getLiteralData()
 * @model
 * @generated
 */
public interface LiteralData extends Expression
{
  /**
   * Returns the value of the '<em><b>Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' reference.
   * @see #setData(InteractorData)
   * @see com.crubier.lil.lil.LilPackage#getLiteralData_Data()
   * @model
   * @generated
   */
  InteractorData getData();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.LiteralData#getData <em>Data</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' reference.
   * @see #getData()
   * @generated
   */
  void setData(InteractorData value);

} // LiteralData
