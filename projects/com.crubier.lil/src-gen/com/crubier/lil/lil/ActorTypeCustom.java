/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Type Custom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.ActorTypeCustom#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getActorTypeCustom()
 * @model
 * @generated
 */
public interface ActorTypeCustom extends ActorType
{
  /**
   * Returns the value of the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' reference.
   * @see #setDefinition(ActorTypeDefinition)
   * @see com.crubier.lil.lil.LilPackage#getActorTypeCustom_Definition()
   * @model
   * @generated
   */
  ActorTypeDefinition getDefinition();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.ActorTypeCustom#getDefinition <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(ActorTypeDefinition value);

} // ActorTypeCustom
