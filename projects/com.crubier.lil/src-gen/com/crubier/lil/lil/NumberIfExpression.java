/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number If Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.NumberIfExpression#getIf <em>If</em>}</li>
 *   <li>{@link com.crubier.lil.lil.NumberIfExpression#getThen <em>Then</em>}</li>
 *   <li>{@link com.crubier.lil.lil.NumberIfExpression#getElse <em>Else</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getNumberIfExpression()
 * @model
 * @generated
 */
public interface NumberIfExpression extends NumberExpression
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
   * @see #setIf(BooleanExpression)
   * @see com.crubier.lil.lil.LilPackage#getNumberIfExpression_If()
   * @model containment="true"
   * @generated
   */
  BooleanExpression getIf();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.NumberIfExpression#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(BooleanExpression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(NumberExpression)
   * @see com.crubier.lil.lil.LilPackage#getNumberIfExpression_Then()
   * @model containment="true"
   * @generated
   */
  NumberExpression getThen();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.NumberIfExpression#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(NumberExpression value);

  /**
   * Returns the value of the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Else</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else</em>' containment reference.
   * @see #setElse(NumberExpression)
   * @see com.crubier.lil.lil.LilPackage#getNumberIfExpression_Else()
   * @model containment="true"
   * @generated
   */
  NumberExpression getElse();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.NumberIfExpression#getElse <em>Else</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else</em>' containment reference.
   * @see #getElse()
   * @generated
   */
  void setElse(NumberExpression value);

} // NumberIfExpression
