/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Signal Reception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorSignalReception#getInstance <em>Instance</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorSignalReception#getSource <em>Source</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorSignalReception#isInit <em>Init</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorSignalReception()
 * @model
 * @generated
 */
public interface InteractorSignalReception extends EObject
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
   * @see #setInstance(InteractorData)
   * @see com.crubier.lil.lil.LilPackage#getInteractorSignalReception_Instance()
   * @model
   * @generated
   */
  InteractorData getInstance();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorSignalReception#getInstance <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(InteractorData value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(InteractorSignalAlias)
   * @see com.crubier.lil.lil.LilPackage#getInteractorSignalReception_Source()
   * @model containment="true"
   * @generated
   */
  InteractorSignalAlias getSource();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorSignalReception#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(InteractorSignalAlias value);

  /**
   * Returns the value of the '<em><b>Init</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' attribute.
   * @see #setInit(boolean)
   * @see com.crubier.lil.lil.LilPackage#getInteractorSignalReception_Init()
   * @model
   * @generated
   */
  boolean isInit();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorSignalReception#isInit <em>Init</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' attribute.
   * @see #isInit()
   * @generated
   */
  void setInit(boolean value);

} // InteractorSignalReception
