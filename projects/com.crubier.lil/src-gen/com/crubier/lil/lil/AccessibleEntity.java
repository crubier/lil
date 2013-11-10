/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accessible Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.AccessibleEntity#getGeneric <em>Generic</em>}</li>
 *   <li>{@link com.crubier.lil.lil.AccessibleEntity#getSpecific <em>Specific</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getAccessibleEntity()
 * @model
 * @generated
 */
public interface AccessibleEntity extends EObject
{
  /**
   * Returns the value of the '<em><b>Generic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generic</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generic</em>' attribute.
   * @see #setGeneric(String)
   * @see com.crubier.lil.lil.LilPackage#getAccessibleEntity_Generic()
   * @model
   * @generated
   */
  String getGeneric();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.AccessibleEntity#getGeneric <em>Generic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generic</em>' attribute.
   * @see #getGeneric()
   * @generated
   */
  void setGeneric(String value);

  /**
   * Returns the value of the '<em><b>Specific</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specific</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specific</em>' containment reference.
   * @see #setSpecific(Entity)
   * @see com.crubier.lil.lil.LilPackage#getAccessibleEntity_Specific()
   * @model containment="true"
   * @generated
   */
  Entity getSpecific();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.AccessibleEntity#getSpecific <em>Specific</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specific</em>' containment reference.
   * @see #getSpecific()
   * @generated
   */
  void setSpecific(Entity value);

} // AccessibleEntity
