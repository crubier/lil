/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Join</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.TextJoin#getLeft <em>Left</em>}</li>
 *   <li>{@link com.crubier.lil.lil.TextJoin#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getTextJoin()
 * @model
 * @generated
 */
public interface TextJoin extends TextExpression
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
   * @see #setLeft(TextExpression)
   * @see com.crubier.lil.lil.LilPackage#getTextJoin_Left()
   * @model containment="true"
   * @generated
   */
  TextExpression getLeft();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.TextJoin#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(TextExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(TextExpression)
   * @see com.crubier.lil.lil.LilPackage#getTextJoin_Right()
   * @model containment="true"
   * @generated
   */
  TextExpression getRight();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.TextJoin#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(TextExpression value);

} // TextJoin
