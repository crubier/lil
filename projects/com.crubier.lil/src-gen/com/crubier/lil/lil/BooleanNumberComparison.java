/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Number Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.BooleanNumberComparison#getLeft <em>Left</em>}</li>
 *   <li>{@link com.crubier.lil.lil.BooleanNumberComparison#getOp <em>Op</em>}</li>
 *   <li>{@link com.crubier.lil.lil.BooleanNumberComparison#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getBooleanNumberComparison()
 * @model
 * @generated
 */
public interface BooleanNumberComparison extends BooleanExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(NumberExpression)
   * @see com.crubier.lil.lil.LilPackage#getBooleanNumberComparison_Left()
   * @model containment="true"
   * @generated
   */
  NumberExpression getLeft();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.BooleanNumberComparison#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(NumberExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.crubier.lil.lil.LilPackage#getBooleanNumberComparison_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.BooleanNumberComparison#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(NumberExpression)
   * @see com.crubier.lil.lil.LilPackage#getBooleanNumberComparison_Right()
   * @model containment="true"
   * @generated
   */
  NumberExpression getRight();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.BooleanNumberComparison#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(NumberExpression value);

} // BooleanNumberComparison
