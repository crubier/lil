/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression For Each</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.ExpressionForEach#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link com.crubier.lil.lil.ExpressionForEach#getEachExpression <em>Each Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getExpressionForEach()
 * @model
 * @generated
 */
public interface ExpressionForEach extends Expression
{
  /**
   * Returns the value of the '<em><b>For Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Expression</em>' containment reference.
   * @see #setForExpression(Expression)
   * @see com.crubier.lil.lil.LilPackage#getExpressionForEach_ForExpression()
   * @model containment="true"
   * @generated
   */
  Expression getForExpression();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ExpressionForEach#getForExpression <em>For Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Expression</em>' containment reference.
   * @see #getForExpression()
   * @generated
   */
  void setForExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Each Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Each Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Each Expression</em>' containment reference.
   * @see #setEachExpression(Expression)
   * @see com.crubier.lil.lil.LilPackage#getExpressionForEach_EachExpression()
   * @model containment="true"
   * @generated
   */
  Expression getEachExpression();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ExpressionForEach#getEachExpression <em>Each Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Each Expression</em>' containment reference.
   * @see #getEachExpression()
   * @generated
   */
  void setEachExpression(Expression value);

} // ExpressionForEach
