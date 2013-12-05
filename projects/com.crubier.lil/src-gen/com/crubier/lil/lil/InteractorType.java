/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorType#getCustom <em>Custom</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorType()
 * @model
 * @generated
 */
public interface InteractorType extends EObject
{
  /**
   * Returns the value of the '<em><b>Custom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom</em>' reference.
   * @see #setCustom(InteractorTypeDefinition)
   * @see com.crubier.lil.lil.LilPackage#getInteractorType_Custom()
   * @model
   * @generated
   */
  InteractorTypeDefinition getCustom();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorType#getCustom <em>Custom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom</em>' reference.
   * @see #getCustom()
   * @generated
   */
  void setCustom(InteractorTypeDefinition value);

} // InteractorType
