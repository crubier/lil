/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Disjonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.BooleanDisjonction#getLeft <em>Left</em>}</li>
 *   <li>{@link com.crubier.lil.lil.BooleanDisjonction#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getBooleanDisjonction()
 * @model
 * @generated
 */
public interface BooleanDisjonction extends BooleanExpression
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
   * @see #setLeft(BooleanExpression)
   * @see com.crubier.lil.lil.LilPackage#getBooleanDisjonction_Left()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getLeft();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.BooleanDisjonction#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(BooleanExpression)
   * @see com.crubier.lil.lil.LilPackage#getBooleanDisjonction_Right()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getRight();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.BooleanDisjonction#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(BooleanExpression value);

} // BooleanDisjonction
