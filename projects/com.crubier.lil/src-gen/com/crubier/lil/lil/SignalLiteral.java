/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.SignalLiteral#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getSignalLiteral()
 * @model
 * @generated
 */
public interface SignalLiteral extends Expression
{
  /**
   * Returns the value of the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signal</em>' reference.
   * @see #setSignal(Signal)
   * @see com.crubier.lil.lil.LilPackage#getSignalLiteral_Signal()
   * @model
   * @generated
   */
  Signal getSignal();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.SignalLiteral#getSignal <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signal</em>' reference.
   * @see #getSignal()
   * @generated
   */
  void setSignal(Signal value);

} // SignalLiteral
