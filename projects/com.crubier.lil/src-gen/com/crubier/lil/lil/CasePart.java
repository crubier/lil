/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.CasePart#getCase <em>Case</em>}</li>
 *   <li>{@link com.crubier.lil.lil.CasePart#getThen <em>Then</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getCasePart()
 * @model
 * @generated
 */
public interface CasePart extends EObject
{
  /**
   * Returns the value of the '<em><b>Case</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case</em>' containment reference.
   * @see #setCase(Expression)
   * @see com.crubier.lil.lil.LilPackage#getCasePart_Case()
   * @model containment="true"
   * @generated
   */
  Expression getCase();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.CasePart#getCase <em>Case</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case</em>' containment reference.
   * @see #getCase()
   * @generated
   */
  void setCase(Expression value);

  /**
   * Returns the value of the '<em><b>Then</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Then</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then</em>' containment reference.
   * @see #setThen(Expression)
   * @see com.crubier.lil.lil.LilPackage#getCasePart_Then()
   * @model containment="true"
   * @generated
   */
  Expression getThen();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.CasePart#getThen <em>Then</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then</em>' containment reference.
   * @see #getThen()
   * @generated
   */
  void setThen(Expression value);

} // CasePart
