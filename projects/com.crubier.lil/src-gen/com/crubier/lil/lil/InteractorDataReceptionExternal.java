/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interactor Data Reception External</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.InteractorDataReceptionExternal#getData <em>Data</em>}</li>
 *   <li>{@link com.crubier.lil.lil.InteractorDataReceptionExternal#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getInteractorDataReceptionExternal()
 * @model
 * @generated
 */
public interface InteractorDataReceptionExternal extends InteractorDataReception
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
   * @see com.crubier.lil.lil.LilPackage#getInteractorDataReceptionExternal_Data()
   * @model
   * @generated
   */
  InteractorDataDeclaration getData();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorDataReceptionExternal#getData <em>Data</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' reference.
   * @see #getData()
   * @generated
   */
  void setData(InteractorDataDeclaration value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference.
   * @see #setSource(InteractorDataAlias)
   * @see com.crubier.lil.lil.LilPackage#getInteractorDataReceptionExternal_Source()
   * @model containment="true"
   * @generated
   */
  InteractorDataAlias getSource();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.InteractorDataReceptionExternal#getSource <em>Source</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' containment reference.
   * @see #getSource()
   * @generated
   */
  void setSource(InteractorDataAlias value);

} // InteractorDataReceptionExternal
