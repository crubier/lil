/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Symbol Definition Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataTypeSymbolDefinitionSet#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataTypeSymbolDefinitionSet()
 * @model
 * @generated
 */
public interface DataTypeSymbolDefinitionSet extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.DataTypeSymbolDefinitionSetElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getDataTypeSymbolDefinitionSet_Element()
   * @model containment="true"
   * @generated
   */
  EList<DataTypeSymbolDefinitionSetElement> getElement();

} // DataTypeSymbolDefinitionSet
