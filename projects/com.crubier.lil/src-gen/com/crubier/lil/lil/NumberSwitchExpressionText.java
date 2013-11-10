/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Switch Expression Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.NumberSwitchExpressionText#getSwitch <em>Switch</em>}</li>
 *   <li>{@link com.crubier.lil.lil.NumberSwitchExpressionText#getCases <em>Cases</em>}</li>
 *   <li>{@link com.crubier.lil.lil.NumberSwitchExpressionText#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getNumberSwitchExpressionText()
 * @model
 * @generated
 */
public interface NumberSwitchExpressionText extends NumberExpression
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
   * @see #setSwitch(TextExpression)
   * @see com.crubier.lil.lil.LilPackage#getNumberSwitchExpressionText_Switch()
   * @model containment="true"
   * @generated
   */
  TextExpression getSwitch();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.NumberSwitchExpressionText#getSwitch <em>Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Switch</em>' containment reference.
   * @see #getSwitch()
   * @generated
   */
  void setSwitch(TextExpression value);

  /**
   * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.NumberSwitchExpressionTextCase}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cases</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getNumberSwitchExpressionText_Cases()
   * @model containment="true"
   * @generated
   */
  EList<NumberSwitchExpressionTextCase> getCases();

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(NumberExpression)
   * @see com.crubier.lil.lil.LilPackage#getNumberSwitchExpressionText_Default()
   * @model containment="true"
   * @generated
   */
  NumberExpression getDefault();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.NumberSwitchExpressionText#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(NumberExpression value);

} // NumberSwitchExpressionText
