/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataType#getBase <em>Base</em>}</li>
 *   <li>{@link com.crubier.lil.lil.DataType#getCompound <em>Compound</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataType()
 * @model
 * @generated
 */
public interface DataType extends EObject
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
   * @see com.crubier.lil.lil.LilPackage#getDataType_Base()
   * @model
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataType#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

  /**
   * Returns the value of the '<em><b>Compound</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compound</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compound</em>' reference.
   * @see #setCompound(DataTypeCompound)
   * @see com.crubier.lil.lil.LilPackage#getDataType_Compound()
   * @model
   * @generated
   */
  DataTypeCompound getCompound();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataType#getCompound <em>Compound</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compound</em>' reference.
   * @see #getCompound()
   * @generated
   */
  void setCompound(DataTypeCompound value);

} // DataType
