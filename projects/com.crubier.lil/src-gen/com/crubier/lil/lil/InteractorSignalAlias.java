/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Signal Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorSignalAlias#getSource <em>Source</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorSignalAlias#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorSignalAlias()
 * @model
 * @generated
 */
public interface InteractorSignalAlias extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(AccessibleEntity)
   * @see com.crubier.lil.lil.LilPackage#getInteractorSignalAlias_Source()
   * @model containment="true"
   * @generated
   */
  AccessibleEntity getSource();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorSignalAlias#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(AccessibleEntity value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' reference.
   * @see #setAlias(InteractorData)
   * @see com.crubier.lil.lil.LilPackage#getInteractorSignalAlias_Alias()
   * @model
   * @generated
   */
  InteractorData getAlias();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorSignalAlias#getAlias <em>Alias</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' reference.
   * @see #getAlias()
   * @generated
   */
  void setAlias(InteractorData value);

} // InteractorSignalAlias
