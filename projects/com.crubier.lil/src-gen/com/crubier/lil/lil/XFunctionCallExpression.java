/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XFunction Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.XFunctionCallExpression#getFunction <em>Function</em>}</li>
 *   <li>{@link com.crubier.lil.lil.XFunctionCallExpression#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getXFunctionCallExpression()
 * @model
 * @generated
 */
public interface XFunctionCallExpression extends XExpression
{
  /**
   * Returns the value of the '<em><b>Function</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function</em>' attribute.
   * @see #setFunction(String)
   * @see com.crubier.lil.lil.LilPackage#getXFunctionCallExpression_Function()
   * @model
   * @generated
   */
  String getFunction();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.XFunctionCallExpression#getFunction <em>Function</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function</em>' attribute.
   * @see #getFunction()
   * @generated
   */
  void setFunction(String value);

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getXFunctionCallExpression_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getArguments();

} // XFunctionCallExpression
