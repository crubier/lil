/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Reception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.EventReception#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.crubier.lil.lil.EventReception#getSource <em>Source</em>}</li>
 *   <li>{@link com.crubier.lil.lil.EventReception#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getEventReception()
 * @model
 * @generated
 */
public interface EventReception extends EObject
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
   * @see #setInstance(EventDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getEventReception_Instance()
   * @model
   * @generated
   */
  EventDeclaration getInstance();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.EventReception#getInstance <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(EventDeclaration value);

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
   * @see com.crubier.lil.lil.LilPackage#getEventReception_Source()
   * @model containment="true"
   * @generated
   */
  Component getSource();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.EventReception#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Component value);

  /**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(String)
   * @see com.crubier.lil.lil.LilPackage#getEventReception_Base()
   * @model
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.EventReception#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

} // EventReception
