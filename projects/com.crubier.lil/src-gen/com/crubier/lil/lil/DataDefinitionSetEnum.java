/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Definition Set Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataDefinitionSetEnum#getElement <em>Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataDefinitionSetEnum()
 * @model
 * @generated
 */
public interface DataDefinitionSetEnum extends DataDefinitionSet
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.DataDefinitionEnumElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getDataDefinitionSetEnum_Element()
   * @model containment="true"
   * @generated
   */
  EList<DataDefinitionEnumElement> getElement();

} // DataDefinitionSetEnum
