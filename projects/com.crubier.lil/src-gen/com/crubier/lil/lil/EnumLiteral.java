/**
 */
package com.crubier.lil.lil;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.EnumLiteral#getElement <em>Element</em>}</li>
 *   <li>{@link com.crubier.lil.lil.EnumLiteral#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getEnumLiteral()
 * @model
 * @generated
 */
public interface EnumLiteral extends Expression, EnumElement
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(EnumElement)
   * @see com.crubier.lil.lil.LilPackage#getEnumLiteral_Element()
   * @model
   * @generated
   */
  EnumElement getElement();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.EnumLiteral#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(EnumElement value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.crubier.lil.lil.LilPackage#getEnumLiteral_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.crubier.lil.lil.EnumLiteral#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // EnumLiteral
