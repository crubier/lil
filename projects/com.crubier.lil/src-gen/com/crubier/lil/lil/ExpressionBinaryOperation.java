/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Binary Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.ExpressionBinaryOperation#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link com.crubier.lil.lil.ExpressionBinaryOperation#getFeature <em>Feature</em>}</li>
 *   <li>{@link com.crubier.lil.lil.ExpressionBinaryOperation#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getExpressionBinaryOperation()
 * @model
 * @generated
 */
public interface ExpressionBinaryOperation extends Expression
{
  /**
   * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Operand</em>' containment reference.
   * @see #setLeftOperand(Expression)
   * @see com.crubier.lil.lil.LilPackage#getExpressionBinaryOperation_LeftOperand()
   * @model containment="true"
   * @generated
   */
  Expression getLeftOperand();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ExpressionBinaryOperation#getLeftOperand <em>Left Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Operand</em>' containment reference.
   * @see #getLeftOperand()
   * @generated
   */
  void setLeftOperand(Expression value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' attribute.
   * @see #setFeature(String)
   * @see com.crubier.lil.lil.LilPackage#getExpressionBinaryOperation_Feature()
   * @model
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ExpressionBinaryOperation#getFeature <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' attribute.
   * @see #getFeature()
   * @generated
   */
  void setFeature(String value);

  /**
   * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Operand</em>' containment reference.
   * @see #setRightOperand(Expression)
   * @see com.crubier.lil.lil.LilPackage#getExpressionBinaryOperation_RightOperand()
   * @model containment="true"
   * @generated
   */
  Expression getRightOperand();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ExpressionBinaryOperation#getRightOperand <em>Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Operand</em>' containment reference.
   * @see #getRightOperand()
   * @generated
   */
  void setRightOperand(Expression value);

} // ExpressionBinaryOperation
