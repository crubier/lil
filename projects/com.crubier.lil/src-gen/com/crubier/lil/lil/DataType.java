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
 *   <li>{@link com.crubier.lil.lil.DataType#getDefinitionSet <em>Definition Set</em>}</li>
 *   <li>{@link com.crubier.lil.lil.DataType#getCustom <em>Custom</em>}</li>
 *   <li>{@link com.crubier.lil.lil.DataType#getCollection <em>Collection</em>}</li>
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
   * Returns the value of the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition Set</em>' containment reference.
   * @see #setDefinitionSet(DataDefinitionSet)
   * @see com.crubier.lil.lil.LilPackage#getDataType_DefinitionSet()
   * @model containment="true"
   * @generated
   */
  DataDefinitionSet getDefinitionSet();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataType#getDefinitionSet <em>Definition Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition Set</em>' containment reference.
   * @see #getDefinitionSet()
   * @generated
   */
  void setDefinitionSet(DataDefinitionSet value);

  /**
   * Returns the value of the '<em><b>Custom</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Custom</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Custom</em>' reference.
   * @see #setCustom(DataTypeDefinition)
   * @see com.crubier.lil.lil.LilPackage#getDataType_Custom()
   * @model
   * @generated
   */
  DataTypeDefinition getCustom();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataType#getCustom <em>Custom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Custom</em>' reference.
   * @see #getCustom()
   * @generated
   */
  void setCustom(DataTypeDefinition value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' containment reference.
   * @see #setCollection(DataCollectionType)
   * @see com.crubier.lil.lil.LilPackage#getDataType_Collection()
   * @model containment="true"
   * @generated
   */
  DataCollectionType getCollection();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataType#getCollection <em>Collection</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' containment reference.
   * @see #getCollection()
   * @generated
   */
  void setCollection(DataCollectionType value);

} // DataType
