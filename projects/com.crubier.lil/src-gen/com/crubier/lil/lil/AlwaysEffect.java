/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Always Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.AlwaysEffect#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getAlwaysEffect()
 * @model
 * @generated
 */
public interface AlwaysEffect extends Effect
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' containment reference.
   * @see #setTarget(FlowEmission)
   * @see com.crubier.lil.lil.LilPackage#getAlwaysEffect_Target()
   * @model containment="true"
   * @generated
   */
  FlowEmission getTarget();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.AlwaysEffect#getTarget <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' containment reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(FlowEmission value);

} // AlwaysEffect
