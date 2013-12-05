/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.ExpressionSwitch#getSwitch <em>Switch</em>}</li>
 *   <li>{@link com.crubier.lil.lil.ExpressionSwitch#getCase <em>Case</em>}</li>
 *   <li>{@link com.crubier.lil.lil.ExpressionSwitch#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getExpressionSwitch()
 * @model
 * @generated
 */
public interface ExpressionSwitch extends Expression
{
  /**
   * Returns the value of the '<em><b>Switch</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Switch</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Switch</em>' containment reference.
   * @see #setSwitch(Expression)
   * @see com.crubier.lil.lil.LilPackage#getExpressionSwitch_Switch()
   * @model containment="true"
   * @generated
   */
  Expression getSwitch();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ExpressionSwitch#getSwitch <em>Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch</em>' containment reference.
   * @see #getSwitch()
   * @generated
   */
  void setSwitch(Expression value);

  /**
   * Returns the value of the '<em><b>Case</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.ExpressionCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getExpressionSwitch_Case()
   * @model containment="true"
   * @generated
   */
  EList<ExpressionCase> getCase();

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(Expression)
   * @see com.crubier.lil.lil.LilPackage#getExpressionSwitch_Default()
   * @model containment="true"
   * @generated
   */
  Expression getDefault();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ExpressionSwitch#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(Expression value);

} // ExpressionSwitch
