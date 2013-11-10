/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Switch Expression Text Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.NumberSwitchExpressionTextCase#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.crubier.lil.lil.NumberSwitchExpressionTextCase#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getNumberSwitchExpressionTextCase()
 * @model
 * @generated
 */
public interface NumberSwitchExpressionTextCase extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(TextExpression)
   * @see com.crubier.lil.lil.LilPackage#getNumberSwitchExpressionTextCase_Condition()
   * @model containment="true"
   * @generated
   */
  TextExpression getCondition();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.NumberSwitchExpressionTextCase#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(TextExpression value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(NumberExpression)
   * @see com.crubier.lil.lil.LilPackage#getNumberSwitchExpressionTextCase_Value()
   * @model containment="true"
   * @generated
   */
  NumberExpression getValue();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.NumberSwitchExpressionTextCase#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(NumberExpression value);

} // NumberSwitchExpressionTextCase
