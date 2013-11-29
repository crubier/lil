/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Definition Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.NumberDefinitionSet#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getNumberDefinitionSet()
 * @model
 * @generated
 */
public interface NumberDefinitionSet extends DefinitionSet
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.Expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getNumberDefinitionSet_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getElements();

} // NumberDefinitionSet
