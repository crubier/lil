/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Identifier Definition Set Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataTypeIdentifierDefinitionSetSet#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataTypeIdentifierDefinitionSetSet()
 * @model
 * @generated
 */
public interface DataTypeIdentifierDefinitionSetSet extends DataTypeIdentifierDefinitionSet
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getDataTypeIdentifierDefinitionSetSet_Element()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getElement();

} // DataTypeIdentifierDefinitionSetSet
