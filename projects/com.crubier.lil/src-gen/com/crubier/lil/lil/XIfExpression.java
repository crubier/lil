/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XIf Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.XIfExpression#getIf <em>If</em>}</li>
 *   <li>{@link com.crubier.lil.lil.XIfExpression#getThen <em>Then</em>}</li>
 *   <li>{@link com.crubier.lil.lil.XIfExpression#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getXIfExpression()
 * @model
 * @generated
 */
public interface XIfExpression extends XExpression
{
  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>If</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(XExpression)
   * @see com.crubier.lil.lil.LilPackage#getXIfExpression_If()
   * @model containment="true"
   * @generated
   */
  XExpression getIf();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.XIfExpression#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(XExpression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(XExpression)
   * @see com.crubier.lil.lil.LilPackage#getXIfExpression_Then()
   * @model containment="true"
   * @generated
   */
  XExpression getThen();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.XIfExpression#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(XExpression value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(XExpression)
   * @see com.crubier.lil.lil.LilPackage#getXIfExpression_Else()
   * @model containment="true"
   * @generated
   */
  XExpression getElse();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.XIfExpression#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(XExpression value);

} // XIfExpression
