/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.Entity#getInstance <em>Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
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
   * @see #setInstance(EntityDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getEntity_Instance()
   * @model
   * @generated
   */
  EntityDeclaration getInstance();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.Entity#getInstance <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(EntityDeclaration value);

} // Entity
