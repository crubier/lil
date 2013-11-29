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
   * Returns a new object of class '<em>Interactor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor</em>'.
   * @generated
   */
  Interactor createInteractor();

  /**
   * Returns a new object of class '<em>Accessible Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Accessible Entity</em>'.
   * @generated
   */
  AccessibleEntity createAccessibleEntity();

  /**
   * Returns a new object of class '<em>Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity</em>'.
   * @generated
   */
  Entity createEntity();

  /**
   * Returns a new object of class '<em>Actor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor</em>'.
   * @generated
   */
  Actor createActor();

  /**
   * Returns a new object of class '<em>Actor Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Alias</em>'.
   * @generated
   */
  ActorAlias createActorAlias();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

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
   * Returns a new object of class '<em>Signal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal</em>'.
   * @generated
   */
  Signal createSignal();

  /**
   * Returns a new object of class '<em>Definition Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition Set</em>'.
   * @generated
   */
  DefinitionSet createDefinitionSet();

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
   * Returns a new object of class '<em>Data Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Definition</em>'.
   * @generated
   */
  DataTypeDefinition createDataTypeDefinition();

  /**
   * Returns a new object of class '<em>Data Type Structure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Structure</em>'.
   * @generated
   */
  DataTypeStructure createDataTypeStructure();

  /**
   * Returns a new object of class '<em>Data Type Structure Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Structure Field</em>'.
   * @generated
   */
  DataTypeStructureField createDataTypeStructureField();

  /**
   * Returns a new object of class '<em>Behavior</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Behavior</em>'.
   * @generated
   */
  Behavior createBehavior();

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
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Collection Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Collection Literal</em>'.
   * @generated
   */
  CollectionLiteral createCollectionLiteral();

  /**
   * Returns a new object of class '<em>Set Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Literal</em>'.
   * @generated
   */
  SetLiteral createSetLiteral();

  /**
   * Returns a new object of class '<em>List Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Literal</em>'.
   * @generated
   */
  ListLiteral createListLiteral();

  /**
   * Returns a new object of class '<em>Case Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Part</em>'.
   * @generated
   */
  CasePart createCasePart();

  /**
   * Returns a new object of class '<em>Enum Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Element</em>'.
   * @generated
   */
  EnumElement createEnumElement();

  /**
   * Returns a new object of class '<em>Enum Definition Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Definition Set</em>'.
   * @generated
   */
  EnumDefinitionSet createEnumDefinitionSet();

  /**
   * Returns a new object of class '<em>Number Definition Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Definition Set</em>'.
   * @generated
   */
  NumberDefinitionSet createNumberDefinitionSet();

  /**
   * Returns a new object of class '<em>Number Definition Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Definition Interval</em>'.
   * @generated
   */
  NumberDefinitionInterval createNumberDefinitionInterval();

  /**
   * Returns a new object of class '<em>Data Type Base</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Base</em>'.
   * @generated
   */
  DataTypeBase createDataTypeBase();

  /**
   * Returns a new object of class '<em>Data Type Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Collection</em>'.
   * @generated
   */
  DataTypeCollection createDataTypeCollection();

  /**
   * Returns a new object of class '<em>Data Type Compound</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Compound</em>'.
   * @generated
   */
  DataTypeCompound createDataTypeCompound();

  /**
   * Returns a new object of class '<em>XBinary Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XBinary Operation</em>'.
   * @generated
   */
  XBinaryOperation createXBinaryOperation();

  /**
   * Returns a new object of class '<em>Unary Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Operation</em>'.
   * @generated
   */
  UnaryOperation createUnaryOperation();

  /**
   * Returns a new object of class '<em>Enum Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Literal</em>'.
   * @generated
   */
  EnumLiteral createEnumLiteral();

  /**
   * Returns a new object of class '<em>Signal Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Literal</em>'.
   * @generated
   */
  SignalLiteral createSignalLiteral();

  /**
   * Returns a new object of class '<em>If Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Expression</em>'.
   * @generated
   */
  IfExpression createIfExpression();

  /**
   * Returns a new object of class '<em>Switch Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch Expression</em>'.
   * @generated
   */
  SwitchExpression createSwitchExpression();

  /**
   * Returns a new object of class '<em>For Each Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Each Expression</em>'.
   * @generated
   */
  ForEachExpression createForEachExpression();

  /**
   * Returns a new object of class '<em>Function Call Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Call Expression</em>'.
   * @generated
   */
  FunctionCallExpression createFunctionCallExpression();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Time Literal Now</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Literal Now</em>'.
   * @generated
   */
  TimeLiteralNow createTimeLiteralNow();

  /**
   * Returns a new object of class '<em>Time Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Time Literal</em>'.
   * @generated
   */
  TimeLiteral createTimeLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LilPackage getLilPackage();

} //LilFactory
