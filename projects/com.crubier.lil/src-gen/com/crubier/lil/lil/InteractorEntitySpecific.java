/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Entity Specific</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorEntitySpecific#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorEntitySpecific()
 * @model
 * @generated
 */
public interface InteractorEntitySpecific extends InteractorEntity
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' reference.
   * @see #setEntity(InteractorEntityDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getInteractorEntitySpecific_Entity()
   * @model
   * @generated
   */
  InteractorEntityDeclaration getEntity();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorEntitySpecific#getEntity <em>Entity</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(InteractorEntityDeclaration value);

} // InteractorEntitySpecific
