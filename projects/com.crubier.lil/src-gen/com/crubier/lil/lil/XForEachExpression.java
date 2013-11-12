/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XFor Each Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.XForEachExpression#getForExpression <em>For Expression</em>}</li>
 *   <li>{@link com.crubier.lil.lil.XForEachExpression#getEachExpression <em>Each Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getXForEachExpression()
 * @model
 * @generated
 */
public interface XForEachExpression extends XExpression
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
   * @see #setForExpression(XExpression)
   * @see com.crubier.lil.lil.LilPackage#getXForEachExpression_ForExpression()
   * @model containment="true"
   * @generated
   */
  XExpression getForExpression();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.XForEachExpression#getForExpression <em>For Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Expression</em>' containment reference.
   * @see #getForExpression()
   * @generated
   */
  void setForExpression(XExpression value);

  /**
   * Returns the value of the '<em><b>Each Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Each Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Each Expression</em>' containment reference.
   * @see #setEachExpression(XExpression)
   * @see com.crubier.lil.lil.LilPackage#getXForEachExpression_EachExpression()
   * @model containment="true"
   * @generated
   */
  XExpression getEachExpression();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.XForEachExpression#getEachExpression <em>Each Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Each Expression</em>' containment reference.
   * @see #getEachExpression()
   * @generated
   */
  void setEachExpression(XExpression value);

} // XForEachExpression
