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
   * Returns a new object of class '<em>Actor Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Type Definition</em>'.
   * @generated
   */
  ActorTypeDefinition createActorTypeDefinition();

  /**
   * Returns a new object of class '<em>Actor Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Type</em>'.
   * @generated
   */
  ActorType createActorType();

  /**
   * Returns a new object of class '<em>Actor Instance Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Instance Declaration</em>'.
   * @generated
   */
  ActorInstanceDeclaration createActorInstanceDeclaration();

  /**
   * Returns a new object of class '<em>Data Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Definition</em>'.
   * @generated
   */
  DataTypeDefinition createDataTypeDefinition();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  DataType createDataType();

  /**
   * Returns a new object of class '<em>Data Type Symbol Definition Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Symbol Definition Set</em>'.
   * @generated
   */
  DataTypeSymbolDefinitionSet createDataTypeSymbolDefinitionSet();

  /**
   * Returns a new object of class '<em>Data Type Symbol Definition Set Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Symbol Definition Set Element</em>'.
   * @generated
   */
  DataTypeSymbolDefinitionSetElement createDataTypeSymbolDefinitionSetElement();

  /**
   * Returns a new object of class '<em>Data Type Number Definition Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Number Definition Set</em>'.
   * @generated
   */
  DataTypeNumberDefinitionSet createDataTypeNumberDefinitionSet();

  /**
   * Returns a new object of class '<em>Data Type Text Definition Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Text Definition Set</em>'.
   * @generated
   */
  DataTypeTextDefinitionSet createDataTypeTextDefinitionSet();

  /**
   * Returns a new object of class '<em>Data Type Time Definition Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Time Definition Set</em>'.
   * @generated
   */
  DataTypeTimeDefinitionSet createDataTypeTimeDefinitionSet();

  /**
   * Returns a new object of class '<em>Data Type Identifier Definition Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Identifier Definition Set</em>'.
   * @generated
   */
  DataTypeIdentifierDefinitionSet createDataTypeIdentifierDefinitionSet();

  /**
   * Returns a new object of class '<em>Data Instance Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Instance Declaration</em>'.
   * @generated
   */
  DataInstanceDeclaration createDataInstanceDeclaration();

  /**
   * Returns a new object of class '<em>Interactor Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Type Definition</em>'.
   * @generated
   */
  InteractorTypeDefinition createInteractorTypeDefinition();

  /**
   * Returns a new object of class '<em>Interactor Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Type</em>'.
   * @generated
   */
  InteractorType createInteractorType();

  /**
   * Returns a new object of class '<em>Interactor Actor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Actor</em>'.
   * @generated
   */
  InteractorActor createInteractorActor();

  /**
   * Returns a new object of class '<em>Interactor Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Data</em>'.
   * @generated
   */
  InteractorData createInteractorData();

  /**
   * Returns a new object of class '<em>Interactor Signal Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Signal Alias</em>'.
   * @generated
   */
  InteractorSignalAlias createInteractorSignalAlias();

  /**
   * Returns a new object of class '<em>Interactor Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Component</em>'.
   * @generated
   */
  InteractorComponent createInteractorComponent();

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
   * Returns a new object of class '<em>Actor Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Alias</em>'.
   * @generated
   */
  ActorAlias createActorAlias();

  /**
   * Returns a new object of class '<em>Interactor Signal Reception</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Signal Reception</em>'.
   * @generated
   */
  InteractorSignalReception createInteractorSignalReception();

  /**
   * Returns a new object of class '<em>Interactor Signal Emission</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Signal Emission</em>'.
   * @generated
   */
  InteractorSignalEmission createInteractorSignalEmission();

  /**
   * Returns a new object of class '<em>Interactor Behavior</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Behavior</em>'.
   * @generated
   */
  InteractorBehavior createInteractorBehavior();

  /**
   * Returns a new object of class '<em>Interactor Behavior Cause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Behavior Cause</em>'.
   * @generated
   */
  InteractorBehaviorCause createInteractorBehaviorCause();

  /**
   * Returns a new object of class '<em>Interactor Behavior On Cause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Behavior On Cause</em>'.
   * @generated
   */
  InteractorBehaviorOnCause createInteractorBehaviorOnCause();

  /**
   * Returns a new object of class '<em>Interactor Behavior When Cause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Behavior When Cause</em>'.
   * @generated
   */
  InteractorBehaviorWhenCause createInteractorBehaviorWhenCause();

  /**
   * Returns a new object of class '<em>Interactor Behavior Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Behavior Effect</em>'.
   * @generated
   */
  InteractorBehaviorEffect createInteractorBehaviorEffect();

  /**
   * Returns a new object of class '<em>Interactor Behavior Always Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Behavior Always Effect</em>'.
   * @generated
   */
  InteractorBehaviorAlwaysEffect createInteractorBehaviorAlwaysEffect();

  /**
   * Returns a new object of class '<em>Interactor Behavior Set Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Behavior Set Effect</em>'.
   * @generated
   */
  InteractorBehaviorSetEffect createInteractorBehaviorSetEffect();

  /**
   * Returns a new object of class '<em>Interactor Behavior Trigger Effect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interactor Behavior Trigger Effect</em>'.
   * @generated
   */
  InteractorBehaviorTriggerEffect createInteractorBehaviorTriggerEffect();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Expression Literal Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Literal Collection</em>'.
   * @generated
   */
  ExpressionLiteralCollection createExpressionLiteralCollection();

  /**
   * Returns a new object of class '<em>Expression Literal Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Literal Set</em>'.
   * @generated
   */
  ExpressionLiteralSet createExpressionLiteralSet();

  /**
   * Returns a new object of class '<em>Expression Literal List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Literal List</em>'.
   * @generated
   */
  ExpressionLiteralList createExpressionLiteralList();

  /**
   * Returns a new object of class '<em>Expression Case</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Case</em>'.
   * @generated
   */
  ExpressionCase createExpressionCase();

  /**
   * Returns a new object of class '<em>Actor Type Input</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Type Input</em>'.
   * @generated
   */
  ActorTypeInput createActorTypeInput();

  /**
   * Returns a new object of class '<em>Actor Type Output</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Type Output</em>'.
   * @generated
   */
  ActorTypeOutput createActorTypeOutput();

  /**
   * Returns a new object of class '<em>Actor Type Custom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actor Type Custom</em>'.
   * @generated
   */
  ActorTypeCustom createActorTypeCustom();

  /**
   * Returns a new object of class '<em>Data Type Definition Compound</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Definition Compound</em>'.
   * @generated
   */
  DataTypeDefinitionCompound createDataTypeDefinitionCompound();

  /**
   * Returns a new object of class '<em>Data Type Definition Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Definition Alias</em>'.
   * @generated
   */
  DataTypeDefinitionAlias createDataTypeDefinitionAlias();

  /**
   * Returns a new object of class '<em>Data Type Void</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Void</em>'.
   * @generated
   */
  DataTypeVoid createDataTypeVoid();

  /**
   * Returns a new object of class '<em>Data Type Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Symbol</em>'.
   * @generated
   */
  DataTypeSymbol createDataTypeSymbol();

  /**
   * Returns a new object of class '<em>Data Type Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Number</em>'.
   * @generated
   */
  DataTypeNumber createDataTypeNumber();

  /**
   * Returns a new object of class '<em>Data Type Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Text</em>'.
   * @generated
   */
  DataTypeText createDataTypeText();

  /**
   * Returns a new object of class '<em>Data Type Time</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Time</em>'.
   * @generated
   */
  DataTypeTime createDataTypeTime();

  /**
   * Returns a new object of class '<em>Data Type Identifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Identifier</em>'.
   * @generated
   */
  DataTypeIdentifier createDataTypeIdentifier();

  /**
   * Returns a new object of class '<em>Data Type Custom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Custom</em>'.
   * @generated
   */
  DataTypeCustom createDataTypeCustom();

  /**
   * Returns a new object of class '<em>Data Type Collection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Collection</em>'.
   * @generated
   */
  DataTypeCollection createDataTypeCollection();

  /**
   * Returns a new object of class '<em>Data Type Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Set</em>'.
   * @generated
   */
  DataTypeSet createDataTypeSet();

  /**
   * Returns a new object of class '<em>Data Type List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type List</em>'.
   * @generated
   */
  DataTypeList createDataTypeList();

  /**
   * Returns a new object of class '<em>Data Type Queue</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Queue</em>'.
   * @generated
   */
  DataTypeQueue createDataTypeQueue();

  /**
   * Returns a new object of class '<em>Data Definition Enum Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Definition Enum Element</em>'.
   * @generated
   */
  DataDefinitionEnumElement createDataDefinitionEnumElement();

  /**
   * Returns a new object of class '<em>Data Type Number Definition Set Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Number Definition Set Set</em>'.
   * @generated
   */
  DataTypeNumberDefinitionSetSet createDataTypeNumberDefinitionSetSet();

  /**
   * Returns a new object of class '<em>Data Type Number Definition Set Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Number Definition Set Interval</em>'.
   * @generated
   */
  DataTypeNumberDefinitionSetInterval createDataTypeNumberDefinitionSetInterval();

  /**
   * Returns a new object of class '<em>Data Type Text Definition Set Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Text Definition Set Set</em>'.
   * @generated
   */
  DataTypeTextDefinitionSetSet createDataTypeTextDefinitionSetSet();

  /**
   * Returns a new object of class '<em>Data Type Time Definition Set Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Time Definition Set Set</em>'.
   * @generated
   */
  DataTypeTimeDefinitionSetSet createDataTypeTimeDefinitionSetSet();

  /**
   * Returns a new object of class '<em>Data Type Time Definition Set Interval</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Time Definition Set Interval</em>'.
   * @generated
   */
  DataTypeTimeDefinitionSetInterval createDataTypeTimeDefinitionSetInterval();

  /**
   * Returns a new object of class '<em>Data Type Identifier Definition Set Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Identifier Definition Set Set</em>'.
   * @generated
   */
  DataTypeIdentifierDefinitionSetSet createDataTypeIdentifierDefinitionSetSet();

  /**
   * Returns a new object of class '<em>Expression Binary Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Binary Operation</em>'.
   * @generated
   */
  ExpressionBinaryOperation createExpressionBinaryOperation();

  /**
   * Returns a new object of class '<em>Unary Operation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Operation</em>'.
   * @generated
   */
  UnaryOperation createUnaryOperation();

  /**
   * Returns a new object of class '<em>Literal Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Data</em>'.
   * @generated
   */
  LiteralData createLiteralData();

  /**
   * Returns a new object of class '<em>Expression If</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression If</em>'.
   * @generated
   */
  ExpressionIf createExpressionIf();

  /**
   * Returns a new object of class '<em>Expression Switch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Switch</em>'.
   * @generated
   */
  ExpressionSwitch createExpressionSwitch();

  /**
   * Returns a new object of class '<em>Expression For Each</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression For Each</em>'.
   * @generated
   */
  ExpressionForEach createExpressionForEach();

  /**
   * Returns a new object of class '<em>Expression Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Function Call</em>'.
   * @generated
   */
  ExpressionFunctionCall createExpressionFunctionCall();

  /**
   * Returns a new object of class '<em>Literal Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Boolean</em>'.
   * @generated
   */
  LiteralBoolean createLiteralBoolean();

  /**
   * Returns a new object of class '<em>Literal Null</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Null</em>'.
   * @generated
   */
  LiteralNull createLiteralNull();

  /**
   * Returns a new object of class '<em>Literal Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Number</em>'.
   * @generated
   */
  LiteralNumber createLiteralNumber();

  /**
   * Returns a new object of class '<em>Literal Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Text</em>'.
   * @generated
   */
  LiteralText createLiteralText();

  /**
   * Returns a new object of class '<em>Literal Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Enum</em>'.
   * @generated
   */
  LiteralEnum createLiteralEnum();

  /**
   * Returns a new object of class '<em>Literal Time</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Time</em>'.
   * @generated
   */
  LiteralTime createLiteralTime();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LilPackage getLilPackage();

} //LilFactory
