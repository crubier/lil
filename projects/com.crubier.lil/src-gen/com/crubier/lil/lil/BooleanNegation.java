/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Negation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.BooleanNegation#getOperand <em>Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getBooleanNegation()
 * @model
 * @generated
 */
public interface BooleanNegation extends BooleanExpression
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
   * @see #setOperand(BooleanExpression)
   * @see com.crubier.lil.lil.LilPackage#getBooleanNegation_Operand()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getOperand();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.BooleanNegation#getOperand <em>Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operand</em>' containment reference.
   * @see #getOperand()
   * @generated
   */
  void setOperand(BooleanExpression value);

} // BooleanNegation
