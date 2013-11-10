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
  Model createModel();

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
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

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
   * Returns a new object of class '<em>Event Reception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Reception</em>'.
   * @generated
   */
  EventReception createEventReception();

  /**
   * Returns a new object of class '<em>Flow Reception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Reception</em>'.
   * @generated
   */
  FlowReception createFlowReception();

  /**
   * Returns a new object of class '<em>Event Emission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Emission</em>'.
   * @generated
   */
  EventEmission createEventEmission();

  /**
   * Returns a new object of class '<em>Flow Emission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Emission</em>'.
   * @generated
   */
  FlowEmission createFlowEmission();

  /**
   * Returns a new object of class '<em>Signal Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Signal Declaration</em>'.
   * @generated
   */
  SignalDeclaration createSignalDeclaration();

  /**
   * Returns a new object of class '<em>Event Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Declaration</em>'.
   * @generated
   */
  EventDeclaration createEventDeclaration();

  /**
   * Returns a new object of class '<em>Flow Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flow Declaration</em>'.
   * @generated
   */
  FlowDeclaration createFlowDeclaration();

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
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Data Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Declaration</em>'.
   * @generated
   */
  DataTypeDeclaration createDataTypeDeclaration();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Boolean Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Expression</em>'.
   * @generated
   */
  BooleanExpression createBooleanExpression();

  /**
   * Returns a new object of class '<em>Number Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Expression</em>'.
   * @generated
   */
  NumberExpression createNumberExpression();

  /**
   * Returns a new object of class '<em>Number Switch Expression Number Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Switch Expression Number Case</em>'.
   * @generated
   */
  NumberSwitchExpressionNumberCase createNumberSwitchExpressionNumberCase();

  /**
   * Returns a new object of class '<em>Number Switch Expression Text Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Switch Expression Text Case</em>'.
   * @generated
   */
  NumberSwitchExpressionTextCase createNumberSwitchExpressionTextCase();

  /**
   * Returns a new object of class '<em>Text Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Expression</em>'.
   * @generated
   */
  TextExpression createTextExpression();

  /**
   * Returns a new object of class '<em>Boolean Disjonction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Disjonction</em>'.
   * @generated
   */
  BooleanDisjonction createBooleanDisjonction();

  /**
   * Returns a new object of class '<em>Boolean Conjonction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Conjonction</em>'.
   * @generated
   */
  BooleanConjonction createBooleanConjonction();

  /**
   * Returns a new object of class '<em>Boolean Negation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Negation</em>'.
   * @generated
   */
  BooleanNegation createBooleanNegation();

  /**
   * Returns a new object of class '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Literal</em>'.
   * @generated
   */
  BooleanLiteral createBooleanLiteral();

  /**
   * Returns a new object of class '<em>Number If Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number If Expression</em>'.
   * @generated
   */
  NumberIfExpression createNumberIfExpression();

  /**
   * Returns a new object of class '<em>Number Switch Expression Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Switch Expression Number</em>'.
   * @generated
   */
  NumberSwitchExpressionNumber createNumberSwitchExpressionNumber();

  /**
   * Returns a new object of class '<em>Number Switch Expression Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Switch Expression Text</em>'.
   * @generated
   */
  NumberSwitchExpressionText createNumberSwitchExpressionText();

  /**
   * Returns a new object of class '<em>Number Addition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Addition</em>'.
   * @generated
   */
  NumberAddition createNumberAddition();

  /**
   * Returns a new object of class '<em>Number Substraction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Substraction</em>'.
   * @generated
   */
  NumberSubstraction createNumberSubstraction();

  /**
   * Returns a new object of class '<em>Number Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Multiplication</em>'.
   * @generated
   */
  NumberMultiplication createNumberMultiplication();

  /**
   * Returns a new object of class '<em>Number Division</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Division</em>'.
   * @generated
   */
  NumberDivision createNumberDivision();

  /**
   * Returns a new object of class '<em>Number Modulo</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Modulo</em>'.
   * @generated
   */
  NumberModulo createNumberModulo();

  /**
   * Returns a new object of class '<em>Number Power</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Power</em>'.
   * @generated
   */
  NumberPower createNumberPower();

  /**
   * Returns a new object of class '<em>Number Opposition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Opposition</em>'.
   * @generated
   */
  NumberOpposition createNumberOpposition();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>Number Function Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Function Expression</em>'.
   * @generated
   */
  NumberFunctionExpression createNumberFunctionExpression();

  /**
   * Returns a new object of class '<em>Text Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Join</em>'.
   * @generated
   */
  TextJoin createTextJoin();

  /**
   * Returns a new object of class '<em>Text Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Literal</em>'.
   * @generated
   */
  TextLiteral createTextLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LilPackage getLilPackage();

} //LilFactory
