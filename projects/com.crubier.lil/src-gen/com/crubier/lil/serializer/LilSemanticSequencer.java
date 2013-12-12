package com.crubier.lil.serializer;

import com.crubier.lil.lil.ActorComponentDeclaration;
import com.crubier.lil.lil.ActorTypeCustom;
import com.crubier.lil.lil.ActorTypeDefinition;
import com.crubier.lil.lil.ActorTypeInput;
import com.crubier.lil.lil.ActorTypeOutput;
import com.crubier.lil.lil.DataComponentDeclaration;
import com.crubier.lil.lil.DataTypeCollection;
import com.crubier.lil.lil.DataTypeCustom;
import com.crubier.lil.lil.DataTypeDefinitionAlias;
import com.crubier.lil.lil.DataTypeDefinitionCompound;
import com.crubier.lil.lil.DataTypeIdentifier;
import com.crubier.lil.lil.DataTypeIdentifierDefinitionSetSet;
import com.crubier.lil.lil.DataTypeList;
import com.crubier.lil.lil.DataTypeNumber;
import com.crubier.lil.lil.DataTypeNumberDefinitionSetInterval;
import com.crubier.lil.lil.DataTypeNumberDefinitionSetSet;
import com.crubier.lil.lil.DataTypeQueue;
import com.crubier.lil.lil.DataTypeSet;
import com.crubier.lil.lil.DataTypeSymbol;
import com.crubier.lil.lil.DataTypeSymbolDefinitionSet;
import com.crubier.lil.lil.DataTypeSymbolDefinitionSetElement;
import com.crubier.lil.lil.DataTypeText;
import com.crubier.lil.lil.DataTypeTextDefinitionSetSet;
import com.crubier.lil.lil.DataTypeTime;
import com.crubier.lil.lil.DataTypeTimeDefinitionSetInterval;
import com.crubier.lil.lil.DataTypeTimeDefinitionSetSet;
import com.crubier.lil.lil.DataTypeVoid;
import com.crubier.lil.lil.ExpressionBinaryOperation;
import com.crubier.lil.lil.ExpressionCase;
import com.crubier.lil.lil.ExpressionForEach;
import com.crubier.lil.lil.ExpressionFunctionCall;
import com.crubier.lil.lil.ExpressionIf;
import com.crubier.lil.lil.ExpressionLiteralList;
import com.crubier.lil.lil.ExpressionLiteralSet;
import com.crubier.lil.lil.ExpressionSwitch;
import com.crubier.lil.lil.ImportStatement;
import com.crubier.lil.lil.InteractorActorAlias;
import com.crubier.lil.lil.InteractorActorDeclaration;
import com.crubier.lil.lil.InteractorBehaviorCauseOn;
import com.crubier.lil.lil.InteractorBehaviorCauseWhen;
import com.crubier.lil.lil.InteractorBehaviorDeclaration;
import com.crubier.lil.lil.InteractorBehaviorEffectAlways;
import com.crubier.lil.lil.InteractorBehaviorEffectSet;
import com.crubier.lil.lil.InteractorBehaviorEffectTrigger;
import com.crubier.lil.lil.InteractorComponentDeclaration;
import com.crubier.lil.lil.InteractorDataAlias;
import com.crubier.lil.lil.InteractorDataDeclarationConstant;
import com.crubier.lil.lil.InteractorDataDeclarationEvent;
import com.crubier.lil.lil.InteractorDataDeclarationFlow;
import com.crubier.lil.lil.InteractorDataEmissionExternal;
import com.crubier.lil.lil.InteractorDataEmissionInternal;
import com.crubier.lil.lil.InteractorDataReceptionExternal;
import com.crubier.lil.lil.InteractorDataReceptionInit;
import com.crubier.lil.lil.InteractorDataReceptionInternal;
import com.crubier.lil.lil.InteractorEntityActors;
import com.crubier.lil.lil.InteractorEntityAll;
import com.crubier.lil.lil.InteractorEntityAny;
import com.crubier.lil.lil.InteractorEntityChild;
import com.crubier.lil.lil.InteractorEntityOther;
import com.crubier.lil.lil.InteractorEntityParent;
import com.crubier.lil.lil.InteractorEntitySelf;
import com.crubier.lil.lil.InteractorEntitySpecific;
import com.crubier.lil.lil.InteractorTypeCustom;
import com.crubier.lil.lil.InteractorTypeDefinition;
import com.crubier.lil.lil.LilModel;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.LiteralBoolean;
import com.crubier.lil.lil.LiteralEnum;
import com.crubier.lil.lil.LiteralNull;
import com.crubier.lil.lil.LiteralNumber;
import com.crubier.lil.lil.LiteralText;
import com.crubier.lil.lil.LiteralTime;
import com.crubier.lil.lil.LiteralTimeNow;
import com.crubier.lil.lil.UnaryOperation;
import com.crubier.lil.services.LilGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LilSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LilGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LilPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LilPackage.ACTOR_COMPONENT_DECLARATION:
				if(context == grammarAccess.getActorComponentDeclarationRule()) {
					sequence_ActorComponentDeclaration(context, (ActorComponentDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ACTOR_TYPE_CUSTOM:
				if(context == grammarAccess.getActorTypeRule()) {
					sequence_ActorType(context, (ActorTypeCustom) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ACTOR_TYPE_DEFINITION:
				if(context == grammarAccess.getActorTypeDefinitionRule()) {
					sequence_ActorTypeDefinition(context, (ActorTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ACTOR_TYPE_INPUT:
				if(context == grammarAccess.getActorTypeRule()) {
					sequence_ActorType(context, (ActorTypeInput) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ACTOR_TYPE_OUTPUT:
				if(context == grammarAccess.getActorTypeRule()) {
					sequence_ActorType(context, (ActorTypeOutput) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_COMPONENT_DECLARATION:
				if(context == grammarAccess.getDataComponentDeclarationRule()) {
					sequence_DataComponentDeclaration(context, (DataComponentDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_COLLECTION:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0()) {
					sequence_DataType(context, (DataTypeCollection) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_CUSTOM:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0()) {
					sequence_DataType(context, (DataTypeCustom) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_DEFINITION_ALIAS:
				if(context == grammarAccess.getDataTypeDefinitionRule()) {
					sequence_DataTypeDefinition(context, (DataTypeDefinitionAlias) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_DEFINITION_COMPOUND:
				if(context == grammarAccess.getDataTypeDefinitionRule()) {
					sequence_DataTypeDefinition(context, (DataTypeDefinitionCompound) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_IDENTIFIER:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0()) {
					sequence_DataType(context, (DataTypeIdentifier) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_IDENTIFIER_DEFINITION_SET_SET:
				if(context == grammarAccess.getDataTypeIdentifierDefinitionSetRule()) {
					sequence_DataTypeIdentifierDefinitionSet(context, (DataTypeIdentifierDefinitionSetSet) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_LIST:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0()) {
					sequence_DataType(context, (DataTypeList) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_NUMBER:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0()) {
					sequence_DataType(context, (DataTypeNumber) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL:
				if(context == grammarAccess.getDataTypeNumberDefinitionSetRule()) {
					sequence_DataTypeNumberDefinitionSet(context, (DataTypeNumberDefinitionSetInterval) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_NUMBER_DEFINITION_SET_SET:
				if(context == grammarAccess.getDataTypeNumberDefinitionSetRule()) {
					sequence_DataTypeNumberDefinitionSet(context, (DataTypeNumberDefinitionSetSet) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_QUEUE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0()) {
					sequence_DataType(context, (DataTypeQueue) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_SET:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0()) {
					sequence_DataType(context, (DataTypeSet) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_SYMBOL:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0()) {
					sequence_DataType(context, (DataTypeSymbol) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_SYMBOL_DEFINITION_SET:
				if(context == grammarAccess.getDataTypeSymbolDefinitionSetRule()) {
					sequence_DataTypeSymbolDefinitionSet(context, (DataTypeSymbolDefinitionSet) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT:
				if(context == grammarAccess.getDataTypeSymbolDefinitionSetElementRule()) {
					sequence_DataTypeSymbolDefinitionSetElement(context, (DataTypeSymbolDefinitionSetElement) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_TEXT:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0()) {
					sequence_DataType(context, (DataTypeText) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_TEXT_DEFINITION_SET_SET:
				if(context == grammarAccess.getDataTypeTextDefinitionSetRule()) {
					sequence_DataTypeTextDefinitionSet(context, (DataTypeTextDefinitionSetSet) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_TIME:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0()) {
					sequence_DataType(context, (DataTypeTime) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_TIME_DEFINITION_SET_INTERVAL:
				if(context == grammarAccess.getDataTypeTimeDefinitionSetRule()) {
					sequence_DataTypeTimeDefinitionSet(context, (DataTypeTimeDefinitionSetInterval) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_TIME_DEFINITION_SET_SET:
				if(context == grammarAccess.getDataTypeTimeDefinitionSetRule()) {
					sequence_DataTypeTimeDefinitionSet(context, (DataTypeTimeDefinitionSetSet) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_VOID:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0() ||
				   context == grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0()) {
					sequence_DataType(context, (DataTypeVoid) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EXPRESSION_BINARY_OPERATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule()) {
					sequence_ExpressionAddition_ExpressionAnd_ExpressionCompare_ExpressionEquality_ExpressionMultiplication_ExpressionOr_ExpressionOther(context, (ExpressionBinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EXPRESSION_CASE:
				if(context == grammarAccess.getExpressionCaseRule()) {
					sequence_ExpressionCase(context, (ExpressionCase) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EXPRESSION_FOR_EACH:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionForEachRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule()) {
					sequence_ExpressionForEach(context, (ExpressionForEach) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EXPRESSION_FUNCTION_CALL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionFunctionCallRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule()) {
					sequence_ExpressionFunctionCall(context, (ExpressionFunctionCall) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EXPRESSION_IF:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionIfRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule()) {
					sequence_ExpressionIf(context, (ExpressionIf) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EXPRESSION_LITERAL_LIST:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionLiteralCollectionRule() ||
				   context == grammarAccess.getExpressionLiteralListRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule()) {
					sequence_ExpressionLiteralList(context, (ExpressionLiteralList) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EXPRESSION_LITERAL_SET:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionLiteralCollectionRule() ||
				   context == grammarAccess.getExpressionLiteralSetRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule()) {
					sequence_ExpressionLiteralSet(context, (ExpressionLiteralSet) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EXPRESSION_SWITCH:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionSwitchRule() ||
				   context == grammarAccess.getExpressionUnaryRule()) {
					sequence_ExpressionSwitch(context, (ExpressionSwitch) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.IMPORT_STATEMENT:
				if(context == grammarAccess.getImportStatementRule()) {
					sequence_ImportStatement(context, (ImportStatement) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_ACTOR_ALIAS:
				if(context == grammarAccess.getInteractorActorAliasRule()) {
					sequence_InteractorActorAlias(context, (InteractorActorAlias) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_ACTOR_DECLARATION:
				if(context == grammarAccess.getInteractorActorDeclarationRule()) {
					sequence_InteractorActorDeclaration(context, (InteractorActorDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_CAUSE_ON:
				if(context == grammarAccess.getInteractorBehaviorCauseRule()) {
					sequence_InteractorBehaviorCause(context, (InteractorBehaviorCauseOn) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_CAUSE_WHEN:
				if(context == grammarAccess.getInteractorBehaviorCauseRule()) {
					sequence_InteractorBehaviorCause(context, (InteractorBehaviorCauseWhen) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_DECLARATION:
				if(context == grammarAccess.getInteractorBehaviorDeclarationRule()) {
					sequence_InteractorBehaviorDeclaration(context, (InteractorBehaviorDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_EFFECT_ALWAYS:
				if(context == grammarAccess.getInteractorBehaviorEffectRule()) {
					sequence_InteractorBehaviorEffect(context, (InteractorBehaviorEffectAlways) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_EFFECT_SET:
				if(context == grammarAccess.getInteractorBehaviorEffectRule()) {
					sequence_InteractorBehaviorEffect(context, (InteractorBehaviorEffectSet) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_EFFECT_TRIGGER:
				if(context == grammarAccess.getInteractorBehaviorEffectRule()) {
					sequence_InteractorBehaviorEffect(context, (InteractorBehaviorEffectTrigger) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_COMPONENT_DECLARATION:
				if(context == grammarAccess.getInteractorComponentDeclarationRule()) {
					sequence_InteractorComponentDeclaration(context, (InteractorComponentDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DATA_ALIAS:
				if(context == grammarAccess.getInteractorDataAliasRule()) {
					sequence_InteractorDataAlias(context, (InteractorDataAlias) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DATA_DECLARATION_CONSTANT:
				if(context == grammarAccess.getInteractorDataDeclarationRule()) {
					sequence_InteractorDataDeclaration(context, (InteractorDataDeclarationConstant) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DATA_DECLARATION_EVENT:
				if(context == grammarAccess.getInteractorDataDeclarationRule()) {
					sequence_InteractorDataDeclaration(context, (InteractorDataDeclarationEvent) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DATA_DECLARATION_FLOW:
				if(context == grammarAccess.getInteractorDataDeclarationRule()) {
					sequence_InteractorDataDeclaration(context, (InteractorDataDeclarationFlow) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DATA_EMISSION_EXTERNAL:
				if(context == grammarAccess.getInteractorDataEmissionRule()) {
					sequence_InteractorDataEmission(context, (InteractorDataEmissionExternal) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DATA_EMISSION_INTERNAL:
				if(context == grammarAccess.getInteractorDataEmissionRule()) {
					sequence_InteractorDataEmission(context, (InteractorDataEmissionInternal) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DATA_RECEPTION_EXTERNAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule() ||
				   context == grammarAccess.getInteractorDataReceptionRule()) {
					sequence_InteractorDataReception(context, (InteractorDataReceptionExternal) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DATA_RECEPTION_INIT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule() ||
				   context == grammarAccess.getInteractorDataReceptionRule()) {
					sequence_InteractorDataReception(context, (InteractorDataReceptionInit) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DATA_RECEPTION_INTERNAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule() ||
				   context == grammarAccess.getInteractorDataReceptionRule()) {
					sequence_InteractorDataReception(context, (InteractorDataReceptionInternal) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_ENTITY_ACTORS:
				if(context == grammarAccess.getInteractorEntityRule()) {
					sequence_InteractorEntity(context, (InteractorEntityActors) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_ENTITY_ALL:
				if(context == grammarAccess.getInteractorEntityRule()) {
					sequence_InteractorEntity(context, (InteractorEntityAll) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_ENTITY_ANY:
				if(context == grammarAccess.getInteractorEntityRule()) {
					sequence_InteractorEntity(context, (InteractorEntityAny) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_ENTITY_CHILD:
				if(context == grammarAccess.getInteractorEntityRule()) {
					sequence_InteractorEntity(context, (InteractorEntityChild) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_ENTITY_OTHER:
				if(context == grammarAccess.getInteractorEntityRule()) {
					sequence_InteractorEntity(context, (InteractorEntityOther) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_ENTITY_PARENT:
				if(context == grammarAccess.getInteractorEntityRule()) {
					sequence_InteractorEntity(context, (InteractorEntityParent) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_ENTITY_SELF:
				if(context == grammarAccess.getInteractorEntityRule()) {
					sequence_InteractorEntity(context, (InteractorEntitySelf) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_ENTITY_SPECIFIC:
				if(context == grammarAccess.getInteractorEntityRule()) {
					sequence_InteractorEntity(context, (InteractorEntitySpecific) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_TYPE_CUSTOM:
				if(context == grammarAccess.getInteractorTypeRule()) {
					sequence_InteractorType(context, (InteractorTypeCustom) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_TYPE_DEFINITION:
				if(context == grammarAccess.getInteractorTypeDefinitionRule()) {
					sequence_InteractorTypeDefinition(context, (InteractorTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.LIL_MODEL:
				if(context == grammarAccess.getLilModelRule()) {
					sequence_LilModel(context, (LilModel) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.LITERAL_BOOLEAN:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule() ||
				   context == grammarAccess.getLiteralBooleanRule()) {
					sequence_LiteralBoolean(context, (LiteralBoolean) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.LITERAL_ENUM:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule() ||
				   context == grammarAccess.getLiteralEnumRule()) {
					sequence_LiteralEnum(context, (LiteralEnum) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.LITERAL_NULL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule() ||
				   context == grammarAccess.getLiteralNullRule()) {
					sequence_LiteralNull(context, (LiteralNull) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.LITERAL_NUMBER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule() ||
				   context == grammarAccess.getLiteralNumberRule()) {
					sequence_LiteralNumber(context, (LiteralNumber) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.LITERAL_TEXT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule() ||
				   context == grammarAccess.getLiteralTextRule()) {
					sequence_LiteralText(context, (LiteralText) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.LITERAL_TIME:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule() ||
				   context == grammarAccess.getLiteralTimeRule()) {
					sequence_LiteralTime(context, (LiteralTime) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.LITERAL_TIME_NOW:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionLiteralRule() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule() ||
				   context == grammarAccess.getLiteralTimeRule()) {
					sequence_LiteralTime(context, (LiteralTimeNow) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.UNARY_OPERATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAdditionRule() ||
				   context == grammarAccess.getExpressionAdditionAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionAndRule() ||
				   context == grammarAccess.getExpressionAndAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionCompareRule() ||
				   context == grammarAccess.getExpressionCompareAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionEqualityRule() ||
				   context == grammarAccess.getExpressionEqualityAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionMultiplicationRule() ||
				   context == grammarAccess.getExpressionMultiplicationAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOrRule() ||
				   context == grammarAccess.getExpressionOrAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionOtherRule() ||
				   context == grammarAccess.getExpressionOtherAccess().getExpressionBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionParenthesizedRule() ||
				   context == grammarAccess.getExpressionPrimaryRule() ||
				   context == grammarAccess.getExpressionUnaryRule()) {
					sequence_ExpressionUnary(context, (UnaryOperation) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID type=ActorType)
	 */
	protected void sequence_ActorComponentDeclaration(EObject context, ActorComponentDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ACTOR_COMPONENT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ACTOR_COMPONENT_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ACTOR_COMPONENT_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ACTOR_COMPONENT_DECLARATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActorComponentDeclarationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActorComponentDeclarationAccess().getTypeActorTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID component+=ActorComponentDeclaration*)
	 */
	protected void sequence_ActorTypeDefinition(EObject context, ActorTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     definition=[ActorTypeDefinition|ID]
	 */
	protected void sequence_ActorType(EObject context, ActorTypeCustom semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ACTOR_TYPE_CUSTOM__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ACTOR_TYPE_CUSTOM__DEFINITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActorTypeAccess().getDefinitionActorTypeDefinitionIDTerminalRuleCall_2_1_0_1(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {ActorTypeInput}
	 */
	protected void sequence_ActorType(EObject context, ActorTypeInput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ActorTypeOutput}
	 */
	protected void sequence_ActorType(EObject context, ActorTypeOutput semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=DataType)
	 */
	protected void sequence_DataComponentDeclaration(EObject context, DataComponentDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_COMPONENT_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_COMPONENT_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_COMPONENT_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_COMPONENT_DECLARATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataComponentDeclarationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDataComponentDeclarationAccess().getTypeDataTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID alias=DataType)
	 */
	protected void sequence_DataTypeDefinition(EObject context, DataTypeDefinitionAlias semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_DEFINITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_DEFINITION__NAME));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_DEFINITION_ALIAS__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_DEFINITION_ALIAS__ALIAS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeDefinitionAccess().getNameIDTerminalRuleCall_1_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDataTypeDefinitionAccess().getAliasDataTypeParserRuleCall_1_4_0(), semanticObject.getAlias());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID component+=DataComponentDeclaration*)
	 */
	protected void sequence_DataTypeDefinition(EObject context, DataTypeDefinitionCompound semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element+=LiteralNumber element+=LiteralNumber*)
	 */
	protected void sequence_DataTypeIdentifierDefinitionSet(EObject context, DataTypeIdentifierDefinitionSetSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inf=LiteralNumber sup=LiteralNumber)
	 */
	protected void sequence_DataTypeNumberDefinitionSet(EObject context, DataTypeNumberDefinitionSetInterval semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL__INF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL__INF));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL__SUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_NUMBER_DEFINITION_SET_INTERVAL__SUP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeNumberDefinitionSetAccess().getInfLiteralNumberParserRuleCall_1_2_0(), semanticObject.getInf());
		feeder.accept(grammarAccess.getDataTypeNumberDefinitionSetAccess().getSupLiteralNumberParserRuleCall_1_4_0(), semanticObject.getSup());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (element+=LiteralNumber element+=LiteralNumber*)
	 */
	protected void sequence_DataTypeNumberDefinitionSet(EObject context, DataTypeNumberDefinitionSetSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataTypeSymbolDefinitionSetElement(EObject context, DataTypeSymbolDefinitionSetElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_SYMBOL_DEFINITION_SET_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeSymbolDefinitionSetElementAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (element+=DataTypeSymbolDefinitionSetElement element+=DataTypeSymbolDefinitionSetElement*)
	 */
	protected void sequence_DataTypeSymbolDefinitionSet(EObject context, DataTypeSymbolDefinitionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element+=LiteralText element+=LiteralText*)
	 */
	protected void sequence_DataTypeTextDefinitionSet(EObject context, DataTypeTextDefinitionSetSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inf=LiteralTime sup=LiteralTime)
	 */
	protected void sequence_DataTypeTimeDefinitionSet(EObject context, DataTypeTimeDefinitionSetInterval semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_TIME_DEFINITION_SET_INTERVAL__INF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_TIME_DEFINITION_SET_INTERVAL__INF));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_TIME_DEFINITION_SET_INTERVAL__SUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_TIME_DEFINITION_SET_INTERVAL__SUP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeTimeDefinitionSetAccess().getInfLiteralTimeParserRuleCall_1_2_0(), semanticObject.getInf());
		feeder.accept(grammarAccess.getDataTypeTimeDefinitionSetAccess().getSupLiteralTimeParserRuleCall_1_4_0(), semanticObject.getSup());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (element+=LiteralTime element+=LiteralTime*)
	 */
	protected void sequence_DataTypeTimeDefinitionSet(EObject context, DataTypeTimeDefinitionSetSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elementType=DataType_DataTypeCollection_1_0_0
	 */
	protected void sequence_DataType(EObject context, DataTypeCollection semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_COLLECTION__ELEMENT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_COLLECTION__ELEMENT_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getDataTypeCollectionElementTypeAction_1_0_0(), semanticObject.getElementType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     definition=[DataTypeDefinition|ID]
	 */
	protected void sequence_DataType(EObject context, DataTypeCustom semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_CUSTOM__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_CUSTOM__DEFINITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getDefinitionDataTypeDefinitionIDTerminalRuleCall_0_6_1_0_1(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (definitionSet=DataTypeIdentifierDefinitionSet?)
	 */
	protected void sequence_DataType(EObject context, DataTypeIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elementType=DataType_DataTypeList_3_0_0
	 */
	protected void sequence_DataType(EObject context, DataTypeList semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_LIST__ELEMENT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_LIST__ELEMENT_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getDataTypeListElementTypeAction_3_0_0(), semanticObject.getElementType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (definitionSet=DataTypeNumberDefinitionSet?)
	 */
	protected void sequence_DataType(EObject context, DataTypeNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elementType=DataType_DataTypeQueue_4_0_0
	 */
	protected void sequence_DataType(EObject context, DataTypeQueue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_QUEUE__ELEMENT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_QUEUE__ELEMENT_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getDataTypeQueueElementTypeAction_4_0_0(), semanticObject.getElementType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     elementType=DataType_DataTypeSet_2_0_0
	 */
	protected void sequence_DataType(EObject context, DataTypeSet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_SET__ELEMENT_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_SET__ELEMENT_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getDataTypeSetElementTypeAction_2_0_0(), semanticObject.getElementType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (definitionSet=DataTypeSymbolDefinitionSet?)
	 */
	protected void sequence_DataType(EObject context, DataTypeSymbol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (definitionSet=DataTypeTextDefinitionSet?)
	 */
	protected void sequence_DataType(EObject context, DataTypeText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (definitionSet=DataTypeTimeDefinitionSet?)
	 */
	protected void sequence_DataType(EObject context, DataTypeTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DataTypeVoid}
	 */
	protected void sequence_DataType(EObject context, DataTypeVoid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (leftOperand=ExpressionAddition_ExpressionBinaryOperation_1_0_0_0 feature=ExpressionAdditionOp rightOperand=ExpressionMultiplication) | 
	 *         (leftOperand=ExpressionMultiplication_ExpressionBinaryOperation_1_0_0_0 feature=ExpressionMultiplicationOp rightOperand=ExpressionUnary) | 
	 *         (leftOperand=ExpressionOther_ExpressionBinaryOperation_1_0_0_0 feature=ExpressionOtherOp rightOperand=ExpressionAddition) | 
	 *         (leftOperand=ExpressionCompare_ExpressionBinaryOperation_1_0_0_0 feature=ExpressionCompareOp rightOperand=ExpressionOther) | 
	 *         (leftOperand=ExpressionEquality_ExpressionBinaryOperation_1_0_0_0 feature=ExpressionEqualityOp rightOperand=ExpressionCompare) | 
	 *         (leftOperand=ExpressionAnd_ExpressionBinaryOperation_1_0_0_0 feature=ExpressionAndOp rightOperand=ExpressionEquality) | 
	 *         (leftOperand=ExpressionOr_ExpressionBinaryOperation_1_0_0_0 feature=ExpressionOrOp rightOperand=ExpressionAnd)
	 *     )
	 */
	protected void sequence_ExpressionAddition_ExpressionAnd_ExpressionCompare_ExpressionEquality_ExpressionMultiplication_ExpressionOr_ExpressionOther(EObject context, ExpressionBinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (case=Expression then=Expression)
	 */
	protected void sequence_ExpressionCase(EObject context, ExpressionCase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EXPRESSION_CASE__CASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EXPRESSION_CASE__CASE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EXPRESSION_CASE__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EXPRESSION_CASE__THEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionCaseAccess().getCaseExpressionParserRuleCall_1_0(), semanticObject.getCase());
		feeder.accept(grammarAccess.getExpressionCaseAccess().getThenExpressionParserRuleCall_3_0(), semanticObject.getThen());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (forExpression=Expression eachExpression=Expression)
	 */
	protected void sequence_ExpressionForEach(EObject context, ExpressionForEach semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EXPRESSION_FOR_EACH__FOR_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EXPRESSION_FOR_EACH__FOR_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EXPRESSION_FOR_EACH__EACH_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EXPRESSION_FOR_EACH__EACH_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionForEachAccess().getForExpressionExpressionParserRuleCall_4_0(), semanticObject.getForExpression());
		feeder.accept(grammarAccess.getExpressionForEachAccess().getEachExpressionExpressionParserRuleCall_6_0(), semanticObject.getEachExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (function=ExpressionFunctionCallBase arguments+=Expression? arguments+=Expression*)
	 */
	protected void sequence_ExpressionFunctionCall(EObject context, ExpressionFunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=Expression then=Expression else=Expression)
	 */
	protected void sequence_ExpressionIf(EObject context, ExpressionIf semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EXPRESSION_IF__IF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EXPRESSION_IF__IF));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EXPRESSION_IF__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EXPRESSION_IF__THEN));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EXPRESSION_IF__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EXPRESSION_IF__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionIfAccess().getIfExpressionParserRuleCall_3_0(), semanticObject.getIf());
		feeder.accept(grammarAccess.getExpressionIfAccess().getThenExpressionParserRuleCall_5_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getExpressionIfAccess().getElseExpressionParserRuleCall_6_1_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((elements+=Expression elements+=Expression*)?)
	 */
	protected void sequence_ExpressionLiteralList(EObject context, ExpressionLiteralList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elements+=Expression elements+=Expression*)?)
	 */
	protected void sequence_ExpressionLiteralSet(EObject context, ExpressionLiteralSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (switch=Expression case+=ExpressionCase+ default=Expression?)
	 */
	protected void sequence_ExpressionSwitch(EObject context, ExpressionSwitch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=ExpressionUnaryOp operand=ExpressionPrimary)
	 */
	protected void sequence_ExpressionUnary(EObject context, UnaryOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.UNARY_OPERATION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.UNARY_OPERATION__FEATURE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.UNARY_OPERATION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.UNARY_OPERATION__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionUnaryAccess().getFeatureExpressionUnaryOpParserRuleCall_0_1_0(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getExpressionUnaryAccess().getOperandExpressionPrimaryParserRuleCall_0_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_ImportStatement(EObject context, ImportStatement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.IMPORT_STATEMENT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.IMPORT_STATEMENT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportStatementAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (actor=[InteractorActorDeclaration|ID] alias=[InteractorActorDeclaration|ID])
	 */
	protected void sequence_InteractorActorAlias(EObject context, InteractorActorAlias semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_ACTOR_ALIAS__ACTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_ACTOR_ALIAS__ACTOR));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_ACTOR_ALIAS__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_ACTOR_ALIAS__ALIAS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorActorAliasAccess().getActorInteractorActorDeclarationIDTerminalRuleCall_0_0_1(), semanticObject.getActor());
		feeder.accept(grammarAccess.getInteractorActorAliasAccess().getAliasInteractorActorDeclarationIDTerminalRuleCall_2_0_1(), semanticObject.getAlias());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ActorType)
	 */
	protected void sequence_InteractorActorDeclaration(EObject context, InteractorActorDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_ENTITY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_ENTITY_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_ACTOR_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_ACTOR_DECLARATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorActorDeclarationAccess().getNameIDTerminalRuleCall_1_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInteractorActorDeclarationAccess().getTypeActorTypeParserRuleCall_1_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (event=InteractorDataReception guard=Expression?)
	 */
	protected void sequence_InteractorBehaviorCause(EObject context, InteractorBehaviorCauseOn semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression guard=Expression?)
	 */
	protected void sequence_InteractorBehaviorCause(EObject context, InteractorBehaviorCauseWhen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cause=InteractorBehaviorCause effect+=InteractorBehaviorEffect+)
	 */
	protected void sequence_InteractorBehaviorDeclaration(EObject context, InteractorBehaviorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=InteractorDataEmission value=Expression)
	 */
	protected void sequence_InteractorBehaviorEffect(EObject context, InteractorBehaviorEffectAlways semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorBehaviorEffectAccess().getTargetInteractorDataEmissionParserRuleCall_0_1_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getInteractorBehaviorEffectAccess().getValueExpressionParserRuleCall_0_1_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=InteractorDataEmission value=Expression)
	 */
	protected void sequence_InteractorBehaviorEffect(EObject context, InteractorBehaviorEffectSet semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorBehaviorEffectAccess().getTargetInteractorDataEmissionParserRuleCall_1_1_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getInteractorBehaviorEffectAccess().getValueExpressionParserRuleCall_1_1_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=InteractorDataEmission value=Expression)
	 */
	protected void sequence_InteractorBehaviorEffect(EObject context, InteractorBehaviorEffectTrigger semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorBehaviorEffectAccess().getTargetInteractorDataEmissionParserRuleCall_2_1_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getInteractorBehaviorEffectAccess().getValueExpressionParserRuleCall_2_1_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=InteractorType actors+=InteractorActorAlias*)
	 */
	protected void sequence_InteractorComponentDeclaration(EObject context, InteractorComponentDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entity=InteractorEntity alias=[InteractorDataDeclaration|ID]?)
	 */
	protected void sequence_InteractorDataAlias(EObject context, InteractorDataAlias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=DataType)
	 */
	protected void sequence_InteractorDataDeclaration(EObject context, InteractorDataDeclarationConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_DATA_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_DATA_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_DATA_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_DATA_DECLARATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorDataDeclarationAccess().getNameIDTerminalRuleCall_2_1_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInteractorDataDeclarationAccess().getTypeDataTypeParserRuleCall_2_1_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=DataType source=InteractorDataAlias? destinations+=InteractorDataAlias*)
	 */
	protected void sequence_InteractorDataDeclaration(EObject context, InteractorDataDeclarationEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=DataType source=InteractorDataAlias? destinations+=InteractorDataAlias*)
	 */
	protected void sequence_InteractorDataDeclaration(EObject context, InteractorDataDeclarationFlow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (data=[InteractorDataDeclaration|ID] destination=InteractorDataAlias)
	 */
	protected void sequence_InteractorDataEmission(EObject context, InteractorDataEmissionExternal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_DATA_EMISSION__DATA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_DATA_EMISSION__DATA));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_DATA_EMISSION_EXTERNAL__DESTINATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_DATA_EMISSION_EXTERNAL__DESTINATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorDataEmissionAccess().getDataInteractorDataDeclarationIDTerminalRuleCall_1_1_0_0_1(), semanticObject.getData());
		feeder.accept(grammarAccess.getInteractorDataEmissionAccess().getDestinationInteractorDataAliasParserRuleCall_1_1_2_0(), semanticObject.getDestination());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     data=[InteractorDataDeclaration|ID]
	 */
	protected void sequence_InteractorDataEmission(EObject context, InteractorDataEmissionInternal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_DATA_EMISSION__DATA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_DATA_EMISSION__DATA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorDataEmissionAccess().getDataInteractorDataDeclarationIDTerminalRuleCall_0_1_0_1(), semanticObject.getData());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (data=[InteractorDataDeclaration|ID] source=InteractorDataAlias)
	 */
	protected void sequence_InteractorDataReception(EObject context, InteractorDataReceptionExternal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_DATA_RECEPTION_EXTERNAL__DATA));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_DATA_RECEPTION_EXTERNAL__SOURCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorDataReceptionAccess().getDataInteractorDataDeclarationIDTerminalRuleCall_1_1_0_0_1(), semanticObject.getData());
		feeder.accept(grammarAccess.getInteractorDataReceptionAccess().getSourceInteractorDataAliasParserRuleCall_1_1_2_0(), semanticObject.getSource());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {InteractorDataReceptionInit}
	 */
	protected void sequence_InteractorDataReception(EObject context, InteractorDataReceptionInit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     data=[InteractorDataDeclaration|ID]
	 */
	protected void sequence_InteractorDataReception(EObject context, InteractorDataReceptionInternal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_DATA_RECEPTION_INTERNAL__DATA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_DATA_RECEPTION_INTERNAL__DATA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorDataReceptionAccess().getDataInteractorDataDeclarationIDTerminalRuleCall_0_1_0_1(), semanticObject.getData());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {InteractorEntityActors}
	 */
	protected void sequence_InteractorEntity(EObject context, InteractorEntityActors semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InteractorEntityAll}
	 */
	protected void sequence_InteractorEntity(EObject context, InteractorEntityAll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InteractorEntityAny}
	 */
	protected void sequence_InteractorEntity(EObject context, InteractorEntityAny semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InteractorEntityChild}
	 */
	protected void sequence_InteractorEntity(EObject context, InteractorEntityChild semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InteractorEntityOther}
	 */
	protected void sequence_InteractorEntity(EObject context, InteractorEntityOther semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InteractorEntityParent}
	 */
	protected void sequence_InteractorEntity(EObject context, InteractorEntityParent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {InteractorEntitySelf}
	 */
	protected void sequence_InteractorEntity(EObject context, InteractorEntitySelf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     entity=[InteractorEntityDeclaration|ID]
	 */
	protected void sequence_InteractorEntity(EObject context, InteractorEntitySpecific semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_ENTITY_SPECIFIC__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_ENTITY_SPECIFIC__ENTITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorEntityAccess().getEntityInteractorEntityDeclarationIDTerminalRuleCall_7_1_0_1(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             actor+=InteractorActorDeclaration | 
	 *             data+=InteractorDataDeclaration | 
	 *             component+=InteractorComponentDeclaration | 
	 *             behavior+=InteractorBehaviorDeclaration
	 *         )*
	 *     )
	 */
	protected void sequence_InteractorTypeDefinition(EObject context, InteractorTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     definition=[InteractorTypeDefinition|ID]
	 */
	protected void sequence_InteractorType(EObject context, InteractorTypeCustom semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_TYPE_CUSTOM__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_TYPE_CUSTOM__DEFINITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorTypeAccess().getDefinitionInteractorTypeDefinitionIDTerminalRuleCall_1_0_1(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=QualifiedName 
	 *         imports+=ImportStatement* 
	 *         (actorType+=ActorTypeDefinition | dataType+=DataTypeDefinition | interactorType+=InteractorTypeDefinition)*
	 *     )
	 */
	protected void sequence_LilModel(EObject context, LilModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isTrue?='true'?)
	 */
	protected void sequence_LiteralBoolean(EObject context, LiteralBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[DataTypeSymbolDefinitionSetElement|ID]
	 */
	protected void sequence_LiteralEnum(EObject context, LiteralEnum semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.LITERAL_ENUM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.LITERAL_ENUM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralEnumAccess().getValueDataTypeSymbolDefinitionSetElementIDTerminalRuleCall_2_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {LiteralNull}
	 */
	protected void sequence_LiteralNull(EObject context, LiteralNull semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_LiteralNumber(EObject context, LiteralNumber semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.LITERAL_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.LITERAL_NUMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralNumberAccess().getValueNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_LiteralText(EObject context, LiteralText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.LITERAL_TEXT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.LITERAL_TEXT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralTextAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             year=NUMBER 
	 *             month=NUMBER? 
	 *             day=NUMBER? 
	 *             hour=NUMBER? 
	 *             minute=NUMBER? 
	 *             second=NUMBER?
	 *         ) | 
	 *         (month=NUMBER day=NUMBER? hour=NUMBER? minute=NUMBER? second=NUMBER?) | 
	 *         (day=NUMBER hour=NUMBER? minute=NUMBER? second=NUMBER?) | 
	 *         (hour=NUMBER minute=NUMBER? second=NUMBER?) | 
	 *         (minute=NUMBER second=NUMBER?) | 
	 *         second=NUMBER
	 *     )
	 */
	protected void sequence_LiteralTime(EObject context, LiteralTime semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LiteralTimeNow}
	 */
	protected void sequence_LiteralTime(EObject context, LiteralTimeNow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
