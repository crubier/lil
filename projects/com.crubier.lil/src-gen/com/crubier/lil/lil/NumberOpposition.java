/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Opposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.NumberOpposition#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getNumberOpposition()
 * @model
 * @generated
 */
public interface NumberOpposition extends NumberExpression
{
  /**
   * Returns the value of the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operand</em>' containment reference.
   * @see #setOperand(NumberExpression)
   * @see com.crubier.lil.lil.LilPackage#getNumberOpposition_Operand()
   * @model containment="true"
   * @generated
   */
  NumberExpression getOperand();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.NumberOpposition#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(NumberExpression value);

} // NumberOpposition
