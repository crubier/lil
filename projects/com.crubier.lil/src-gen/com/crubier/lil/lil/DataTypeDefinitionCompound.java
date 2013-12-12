/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Definition Compound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.crubier.lil.lil.DataTypeDefinitionCompound#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.crubier.lil.lil.LilPackage#getDataTypeDefinitionCompound()
 * @model
 * @generated
 */
public interface DataTypeDefinitionCompound extends DataTypeDefinition
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' containment reference list.
   * The list contents are of type {@link com.crubier.lil.lil.DataComponentDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Component</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' containment reference list.
   * @see com.crubier.lil.lil.LilPackage#getDataTypeDefinitionCompound_Component()
   * @model containment="true"
   * @generated
   */
  EList<DataComponentDeclaration> getComponent();

} // DataTypeDefinitionCompound
