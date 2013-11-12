/**
 */
package com.crubier.lil.lil;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.crubier.lil.lil.LilPackage
 * @generated
 */
public interface LilFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LilFactory eINSTANCE = com.crubier.lil.lil.impl.LilFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  LilModel createLilModel();

  /**
   * Returns a new object of class '<em>Interactor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Declaration</em>'.
   * @generated
   */
  InteractorDeclaration createInteractorDeclaration();

  /**
   * Returns a new object of class '<em>Accessible Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Accessible Entity</em>'.
   * @generated
   */
  AccessibleEntity createAccessibleEntity();

  /**
   * Returns a new object of class '<em>Entity Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Declaration</em>'.
   * @generated
   */
  EntityDeclaration createEntityDeclaration();

  /**
   * Returns a new object of class '<em>Actor Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Declaration</em>'.
   * @generated
   */
  ActorDeclaration createActorDeclaration();

  /**
   * Returns a new object of class '<em>Actor Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Alias</em>'.
   * @generated
   */
  ActorAlias createActorAlias();

  /**
   * Returns a new object of class '<em>Component Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component Declaration</em>'.
   * @generated
   */
  ComponentDeclaration createComponentDeclaration();

  /**
   * Returns a new object of class '<em>Signal Reception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Reception</em>'.
   * @generated
   */
  SignalReception createSignalReception();

  /**
   * Returns a new object of class '<em>Signal Emission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Emission</em>'.
   * @generated
   */
  SignalEmission createSignalEmission();

  /**
   * Returns a new object of class '<em>Signal Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Declaration</em>'.
   * @generated
   */
  SignalDeclaration createSignalDeclaration();

  /**
   * Returns a new object of class '<em>Signal Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Alias</em>'.
   * @generated
   */
  SignalAlias createSignalAlias();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Data Type Compound Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Compound Declaration</em>'.
   * @generated
   */
  DataTypeCompoundDeclaration createDataTypeCompoundDeclaration();

  /**
   * Returns a new object of class '<em>Data Type Compound Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Compound Field</em>'.
   * @generated
   */
  DataTypeCompoundField createDataTypeCompoundField();

  /**
   * Returns a new object of class '<em>Behavior Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Behavior Declaration</em>'.
   * @generated
   */
  BehaviorDeclaration createBehaviorDeclaration();

  /**
   * Returns a new object of class '<em>Cause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cause</em>'.
   * @generated
   */
  Cause createCause();

  /**
   * Returns a new object of class '<em>On Cause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>On Cause</em>'.
   * @generated
   */
  OnCause createOnCause();

  /**
   * Returns a new object of class '<em>When Cause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When Cause</em>'.
   * @generated
   */
  WhenCause createWhenCause();

  /**
   * Returns a new object of class '<em>Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Effect</em>'.
   * @generated
   */
  Effect createEffect();

  /**
   * Returns a new object of class '<em>Always Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Always Effect</em>'.
   * @generated
   */
  AlwaysEffect createAlwaysEffect();

  /**
   * Returns a new object of class '<em>Set Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Effect</em>'.
   * @generated
   */
  SetEffect createSetEffect();

  /**
   * Returns a new object of class '<em>Trigger Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Trigger Effect</em>'.
   * @generated
   */
  TriggerEffect createTriggerEffect();

  /**
   * Returns a new object of class '<em>XExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XExpression</em>'.
   * @generated
   */
  XExpression createXExpression();

  /**
   * Returns a new object of class '<em>XCollection Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XCollection Literal</em>'.
   * @generated
   */
  XCollectionLiteral createXCollectionLiteral();

  /**
   * Returns a new object of class '<em>XSet Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XSet Literal</em>'.
   * @generated
   */
  XSetLiteral createXSetLiteral();

  /**
   * Returns a new object of class '<em>XList Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XList Literal</em>'.
   * @generated
   */
  XListLiteral createXListLiteral();

  /**
   * Returns a new object of class '<em>XCase Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XCase Part</em>'.
   * @generated
   */
  XCasePart createXCasePart();

  /**
   * Returns a new object of class '<em>Data Type Compound</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Compound</em>'.
   * @generated
   */
  DataTypeCompound createDataTypeCompound();

  /**
   * Returns a new object of class '<em>Data Type Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Base</em>'.
   * @generated
   */
  DataTypeBase createDataTypeBase();

  /**
   * Returns a new object of class '<em>XBinary Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XBinary Operation</em>'.
   * @generated
   */
  XBinaryOperation createXBinaryOperation();

  /**
   * Returns a new object of class '<em>XUnary Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XUnary Operation</em>'.
   * @generated
   */
  XUnaryOperation createXUnaryOperation();

  /**
   * Returns a new object of class '<em>XIf Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XIf Expression</em>'.
   * @generated
   */
  XIfExpression createXIfExpression();

  /**
   * Returns a new object of class '<em>XSwitch Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XSwitch Expression</em>'.
   * @generated
   */
  XSwitchExpression createXSwitchExpression();

  /**
   * Returns a new object of class '<em>XFor Each Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XFor Each Expression</em>'.
   * @generated
   */
  XForEachExpression createXForEachExpression();

  /**
   * Returns a new object of class '<em>XFunction Call Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XFunction Call Expression</em>'.
   * @generated
   */
  XFunctionCallExpression createXFunctionCallExpression();

  /**
   * Returns a new object of class '<em>XBoolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XBoolean Literal</em>'.
   * @generated
   */
  XBooleanLiteral createXBooleanLiteral();

  /**
   * Returns a new object of class '<em>XNull Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XNull Literal</em>'.
   * @generated
   */
  XNullLiteral createXNullLiteral();

  /**
   * Returns a new object of class '<em>XNumber Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XNumber Literal</em>'.
   * @generated
   */
  XNumberLiteral createXNumberLiteral();

  /**
   * Returns a new object of class '<em>XString Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XString Literal</em>'.
   * @generated
   */
  XStringLiteral createXStringLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LilPackage getLilPackage();

} //LilFactory
