/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Data Reception Internal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorDataReceptionInternal#getData <em>Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorDataReceptionInternal()
 * @model
 * @generated
 */
public interface InteractorDataReceptionInternal extends InteractorDataReception
{
  /**
   * Returns the value of the '<em><b>Data</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' reference.
   * @see #setData(InteractorDataDeclaration)
   * @see com.crubier.lil.lil.LilPackage#getInteractorDataReceptionInternal_Data()
   * @model
   * @generated
   */
  InteractorDataDeclaration getData();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorDataReceptionInternal#getData <em>Data</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' reference.
   * @see #getData()
   * @generated
   */
  void setData(InteractorDataDeclaration value);

} // InteractorDataReceptionInternal
