/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Data Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorDataAlias#getEntity <em>Entity</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorDataAlias#getAlias <em>Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorDataAlias()
 * @model
 * @generated
 */
public interface InteractorDataAlias extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(InteractorEntity)
   * @see com.crubier.lil.lil.LilPackage#getInteractorDataAlias_Entity()
   * @model containment="true"
   * @generated
   */
  InteractorEntity getEntity();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorDataAlias#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(InteractorEntity value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' reference.
   * @see #setAlias(InteractorDataDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getInteractorDataAlias_Alias()
   * @model
   * @generated
   */
  InteractorDataDeclaration getAlias();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorDataAlias#getAlias <em>Alias</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' reference.
   * @see #getAlias()
   * @generated
   */
  void setAlias(InteractorDataDeclaration value);

} // InteractorDataAlias
