/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Definition Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.NumberDefinitionInterval#getInf <em>Inf</em>}</li>
 *   <li>{@link com.crubier.lil.lil.NumberDefinitionInterval#getSup <em>Sup</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getNumberDefinitionInterval()
 * @model
 * @generated
 */
public interface NumberDefinitionInterval extends DefinitionSet
{
  /**
   * Returns the value of the '<em><b>Inf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inf</em>' containment reference.
   * @see #setInf(Expression)
   * @see com.crubier.lil.lil.LilPackage#getNumberDefinitionInterval_Inf()
   * @model containment="true"
   * @generated
   */
  Expression getInf();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.NumberDefinitionInterval#getInf <em>Inf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inf</em>' containment reference.
   * @see #getInf()
   * @generated
   */
  void setInf(Expression value);

  /**
   * Returns the value of the '<em><b>Sup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sup</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sup</em>' containment reference.
   * @see #setSup(Expression)
   * @see com.crubier.lil.lil.LilPackage#getNumberDefinitionInterval_Sup()
   * @model containment="true"
   * @generated
   */
  Expression getSup();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.NumberDefinitionInterval#getSup <em>Sup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sup</em>' containment reference.
   * @see #getSup()
   * @generated
   */
  void setSup(Expression value);

} // NumberDefinitionInterval
