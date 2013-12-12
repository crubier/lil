/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.LiteralEnum#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getLiteralEnum()
 * @model
 * @generated
 */
public interface LiteralEnum extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' reference.
   * @see #setValue(DataTypeSymbolDefinitionSetElement)
   * @see com.crubier.lil.lil.LilPackage#getLiteralEnum_Value()
   * @model
   * @generated
   */
  DataTypeSymbolDefinitionSetElement getValue();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.LiteralEnum#getValue <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' reference.
   * @see #getValue()
   * @generated
   */
  void setValue(DataTypeSymbolDefinitionSetElement value);

} // LiteralEnum
