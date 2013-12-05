/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.ActorType#getBase <em>Base</em>}</li>
 *   <li>{@link com.crubier.lil.lil.ActorType#getCustom <em>Custom</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getActorType()
 * @model
 * @generated
 */
public interface ActorType extends EObject
{
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
   * @see com.crubier.lil.lil.LilPackage#getActorType_Base()
   * @model
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ActorType#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

  /**
   * Returns the value of the '<em><b>Custom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom</em>' reference.
   * @see #setCustom(ActorTypeDefinition)
   * @see com.crubier.lil.lil.LilPackage#getActorType_Custom()
   * @model
   * @generated
   */
  ActorTypeDefinition getCustom();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ActorType#getCustom <em>Custom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom</em>' reference.
   * @see #getCustom()
   * @generated
   */
  void setCustom(ActorTypeDefinition value);

} // ActorType
