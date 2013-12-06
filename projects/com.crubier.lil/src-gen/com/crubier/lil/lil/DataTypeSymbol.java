/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataTypeSymbol#getDefinitionSet <em>Definition Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataTypeSymbol()
 * @model
 * @generated
 */
public interface DataTypeSymbol extends DataType
{
  /**
   * Returns the value of the '<em><b>Definition Set</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition Set</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition Set</em>' containment reference.
   * @see #setDefinitionSet(DataTypeSymbolDefinitionSet)
   * @see com.crubier.lil.lil.LilPackage#getDataTypeSymbol_DefinitionSet()
   * @model containment="true"
   * @generated
   */
  DataTypeSymbolDefinitionSet getDefinitionSet();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.DataTypeSymbol#getDefinitionSet <em>Definition Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition Set</em>' containment reference.
   * @see #getDefinitionSet()
   * @generated
   */
  void setDefinitionSet(DataTypeSymbolDefinitionSet value);

} // DataTypeSymbol
