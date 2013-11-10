/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Reception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.FlowReception#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.crubier.lil.lil.FlowReception#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getFlowReception()
 * @model
 * @generated
 */
public interface FlowReception extends EObject
{
  /**
   * Returns the value of the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' reference.
   * @see #setInstance(FlowDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getFlowReception_Instance()
   * @model
   * @generated
   */
  FlowDeclaration getInstance();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.FlowReception#getInstance <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(FlowDeclaration value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(Component)
   * @see com.crubier.lil.lil.LilPackage#getFlowReception_Source()
   * @model containment="true"
   * @generated
   */
  Component getSource();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.FlowReception#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Component value);

} // FlowReception
