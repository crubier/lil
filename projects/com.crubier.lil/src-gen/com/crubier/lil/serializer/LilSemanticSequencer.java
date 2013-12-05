package com.crubier.lil.serializer;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.ActorComponent;
import com.crubier.lil.lil.ActorType;
import com.crubier.lil.lil.ActorTypeDefinition;
import com.crubier.lil.lil.DataCollectionType;
import com.crubier.lil.lil.DataComponent;
import com.crubier.lil.lil.DataDefinitionEnumElement;
import com.crubier.lil.lil.DataDefinitionSetEnum;
import com.crubier.lil.lil.DataDefinitionSetInterval;
import com.crubier.lil.lil.DataDefinitionSetNumber;
import com.crubier.lil.lil.DataType;
import com.crubier.lil.lil.DataTypeDefinitionAlias;
import com.crubier.lil.lil.DataTypeDefinitionCompound;
import com.crubier.lil.lil.ExpressionBinaryOperation;
import com.crubier.lil.lil.ExpressionCase;
import com.crubier.lil.lil.ExpressionForEach;
import com.crubier.lil.lil.ExpressionFunctionCall;
import com.crubier.lil.lil.ExpressionIf;
import com.crubier.lil.lil.ExpressionLiteralList;
import com.crubier.lil.lil.ExpressionLiteralSet;
import com.crubier.lil.lil.ExpressionSwitch;
import com.crubier.lil.lil.InteractorActor;
import com.crubier.lil.lil.InteractorBehavior;
import com.crubier.lil.lil.InteractorBehaviorAlwaysEffect;
import com.crubier.lil.lil.InteractorBehaviorOnCause;
import com.crubier.lil.lil.InteractorBehaviorSetEffect;
import com.crubier.lil.lil.InteractorBehaviorTriggerEffect;
import com.crubier.lil.lil.InteractorBehaviorWhenCause;
import com.crubier.lil.lil.InteractorComponent;
import com.crubier.lil.lil.InteractorData;
import com.crubier.lil.lil.InteractorSignalAlias;
import com.crubier.lil.lil.InteractorSignalEmission;
import com.crubier.lil.lil.InteractorSignalReception;
import com.crubier.lil.lil.InteractorType;
import com.crubier.lil.lil.InteractorTypeDefinition;
import com.crubier.lil.lil.LilModel;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.LiteralBoolean;
import com.crubier.lil.lil.LiteralData;
import com.crubier.lil.lil.LiteralEnum;
import com.crubier.lil.lil.LiteralNull;
import com.crubier.lil.lil.LiteralNumber;
import com.crubier.lil.lil.LiteralString;
import com.crubier.lil.lil.LiteralTime;
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
			case LilPackage.ACCESSIBLE_ENTITY:
				if(context == grammarAccess.getAccessibleEntityRule()) {
					sequence_AccessibleEntity(context, (AccessibleEntity) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ACTOR_ALIAS:
				if(context == grammarAccess.getActorAliasRule()) {
					sequence_ActorAlias(context, (ActorAlias) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ACTOR_COMPONENT:
				if(context == grammarAccess.getActorComponentRule()) {
					sequence_ActorComponent(context, (ActorComponent) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ACTOR_TYPE:
				if(context == grammarAccess.getActorTypeRule()) {
					sequence_ActorType(context, (ActorType) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ACTOR_TYPE_DEFINITION:
				if(context == grammarAccess.getActorTypeDefinitionRule()) {
					sequence_ActorTypeDefinition(context, (ActorTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_COLLECTION_TYPE:
				if(context == grammarAccess.getDataCollectionTypeRule()) {
					sequence_DataCollectionType(context, (DataCollectionType) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_COMPONENT:
				if(context == grammarAccess.getDataComponentRule()) {
					sequence_DataComponent(context, (DataComponent) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_DEFINITION_ENUM_ELEMENT:
				if(context == grammarAccess.getDataDefinitionEnumElementRule()) {
					sequence_DataDefinitionEnumElement(context, (DataDefinitionEnumElement) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_DEFINITION_SET_ENUM:
				if(context == grammarAccess.getDataDefinitionSetRule()) {
					sequence_DataDefinitionSet(context, (DataDefinitionSetEnum) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_DEFINITION_SET_INTERVAL:
				if(context == grammarAccess.getDataDefinitionSetRule()) {
					sequence_DataDefinitionSet(context, (DataDefinitionSetInterval) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_DEFINITION_SET_NUMBER:
				if(context == grammarAccess.getDataDefinitionSetRule()) {
					sequence_DataDefinitionSet(context, (DataDefinitionSetNumber) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
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
			case LilPackage.INTERACTOR_ACTOR:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getInteractorActorRule()) {
					sequence_InteractorActor(context, (InteractorActor) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR:
				if(context == grammarAccess.getInteractorBehaviorRule()) {
					sequence_InteractorBehavior(context, (InteractorBehavior) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_ALWAYS_EFFECT:
				if(context == grammarAccess.getInteractorBehaviorAlwaysEffectRule() ||
				   context == grammarAccess.getInteractorBehaviorEffectRule()) {
					sequence_InteractorBehaviorAlwaysEffect(context, (InteractorBehaviorAlwaysEffect) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_ON_CAUSE:
				if(context == grammarAccess.getInteractorBehaviorCauseRule() ||
				   context == grammarAccess.getInteractorBehaviorOnCauseRule()) {
					sequence_InteractorBehaviorOnCause(context, (InteractorBehaviorOnCause) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_SET_EFFECT:
				if(context == grammarAccess.getInteractorBehaviorEffectRule() ||
				   context == grammarAccess.getInteractorBehaviorSetEffectRule()) {
					sequence_InteractorBehaviorSetEffect(context, (InteractorBehaviorSetEffect) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_TRIGGER_EFFECT:
				if(context == grammarAccess.getInteractorBehaviorEffectRule() ||
				   context == grammarAccess.getInteractorBehaviorTriggerEffectRule()) {
					sequence_InteractorBehaviorTriggerEffect(context, (InteractorBehaviorTriggerEffect) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_BEHAVIOR_WHEN_CAUSE:
				if(context == grammarAccess.getInteractorBehaviorCauseRule() ||
				   context == grammarAccess.getInteractorBehaviorWhenCauseRule()) {
					sequence_InteractorBehaviorWhenCause(context, (InteractorBehaviorWhenCause) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_COMPONENT:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getInteractorComponentRule()) {
					sequence_InteractorComponent(context, (InteractorComponent) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DATA:
				if(context == grammarAccess.getInteractorDataRule()) {
					sequence_InteractorData(context, (InteractorData) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_SIGNAL_ALIAS:
				if(context == grammarAccess.getInteractorSignalAliasRule()) {
					sequence_InteractorSignalAlias(context, (InteractorSignalAlias) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_SIGNAL_EMISSION:
				if(context == grammarAccess.getInteractorSignalEmissionRule()) {
					sequence_InteractorSignalEmission(context, (InteractorSignalEmission) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_SIGNAL_RECEPTION:
				if(context == grammarAccess.getInteractorSignalReceptionRule()) {
					sequence_InteractorSignalReception(context, (InteractorSignalReception) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_TYPE:
				if(context == grammarAccess.getInteractorTypeRule()) {
					sequence_InteractorType(context, (InteractorType) semanticObject); 
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
			case LilPackage.LITERAL_DATA:
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
				   context == grammarAccess.getExpressionUnaryRule()) {
					sequence_ExpressionLiteral(context, (LiteralData) semanticObject); 
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
			case LilPackage.LITERAL_STRING:
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
				   context == grammarAccess.getLiteralStringRule()) {
					sequence_LiteralString(context, (LiteralString) semanticObject); 
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
	 *     (generic=GenericEntity | specific=[Entity|ID])
	 */
	protected void sequence_AccessibleEntity(EObject context, AccessibleEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=[InteractorActor|ID] alias=[InteractorActor|ID])
	 */
	protected void sequence_ActorAlias(EObject context, ActorAlias semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ACTOR_ALIAS__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ACTOR_ALIAS__SOURCE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ACTOR_ALIAS__ALIAS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ACTOR_ALIAS__ALIAS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActorAliasAccess().getSourceInteractorActorIDTerminalRuleCall_0_0_1(), semanticObject.getSource());
		feeder.accept(grammarAccess.getActorAliasAccess().getAliasInteractorActorIDTerminalRuleCall_2_0_1(), semanticObject.getAlias());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=ActorType)
	 */
	protected void sequence_ActorComponent(EObject context, ActorComponent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ACTOR_COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ACTOR_COMPONENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ACTOR_COMPONENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ACTOR_COMPONENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActorComponentAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getActorComponentAccess().getTypeActorTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID component+=ActorComponent*)
	 */
	protected void sequence_ActorTypeDefinition(EObject context, ActorTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=ActorBaseType | custom=[ActorTypeDefinition|ID])
	 */
	protected void sequence_ActorType(EObject context, ActorType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='collection' | type='set' | type='list' | type='queue' | (type='map' mapping=DataType))
	 */
	protected void sequence_DataCollectionType(EObject context, DataCollectionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=DataType)
	 */
	protected void sequence_DataComponent(EObject context, DataComponent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_COMPONENT__NAME));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_COMPONENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_COMPONENT__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataComponentAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDataComponentAccess().getTypeDataTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataDefinitionEnumElement(EObject context, DataDefinitionEnumElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_DEFINITION_ENUM_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_DEFINITION_ENUM_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataDefinitionEnumElementAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (element+=DataDefinitionEnumElement element+=DataDefinitionEnumElement*)
	 */
	protected void sequence_DataDefinitionSet(EObject context, DataDefinitionSetEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inf=LiteralNumber sup=LiteralNumber)
	 */
	protected void sequence_DataDefinitionSet(EObject context, DataDefinitionSetInterval semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_DEFINITION_SET_INTERVAL__INF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_DEFINITION_SET_INTERVAL__INF));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_DEFINITION_SET_INTERVAL__SUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_DEFINITION_SET_INTERVAL__SUP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataDefinitionSetAccess().getInfLiteralNumberParserRuleCall_2_2_0(), semanticObject.getInf());
		feeder.accept(grammarAccess.getDataDefinitionSetAccess().getSupLiteralNumberParserRuleCall_2_4_0(), semanticObject.getSup());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (element+=LiteralNumber element+=LiteralNumber*)
	 */
	protected void sequence_DataDefinitionSet(EObject context, DataDefinitionSetNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=ID component+=DataComponent*)
	 */
	protected void sequence_DataTypeDefinition(EObject context, DataTypeDefinitionCompound semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((base=DataBaseType definitionSet=DataDefinitionSet?) | custom=[DataTypeDefinition|ID]) collection=DataCollectionType?)
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
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
	 *     data=[InteractorData|ID]
	 */
	protected void sequence_ExpressionLiteral(EObject context, LiteralData semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.LITERAL_DATA__DATA) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.LITERAL_DATA__DATA));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpressionLiteralAccess().getDataInteractorDataIDTerminalRuleCall_7_1_0_1(), semanticObject.getData());
		feeder.finish();
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
	 *     (name=ID type=ActorType)
	 */
	protected void sequence_InteractorActor(EObject context, InteractorActor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ENTITY__NAME));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_ACTOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_ACTOR__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorActorAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInteractorActorAccess().getTypeActorTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=InteractorSignalEmission value=Expression)
	 */
	protected void sequence_InteractorBehaviorAlwaysEffect(EObject context, InteractorBehaviorAlwaysEffect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorBehaviorAlwaysEffectAccess().getTargetInteractorSignalEmissionParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getInteractorBehaviorAlwaysEffectAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (event=InteractorSignalReception guard=Expression?)
	 */
	protected void sequence_InteractorBehaviorOnCause(EObject context, InteractorBehaviorOnCause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=InteractorSignalEmission value=Expression)
	 */
	protected void sequence_InteractorBehaviorSetEffect(EObject context, InteractorBehaviorSetEffect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorBehaviorSetEffectAccess().getTargetInteractorSignalEmissionParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getInteractorBehaviorSetEffectAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=InteractorSignalEmission value=Expression)
	 */
	protected void sequence_InteractorBehaviorTriggerEffect(EObject context, InteractorBehaviorTriggerEffect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__TARGET));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_BEHAVIOR_EFFECT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorBehaviorTriggerEffectAccess().getTargetInteractorSignalEmissionParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getInteractorBehaviorTriggerEffectAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression guard=Expression?)
	 */
	protected void sequence_InteractorBehaviorWhenCause(EObject context, InteractorBehaviorWhenCause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cause=InteractorBehaviorCause effect+=InteractorBehaviorEffect+)
	 */
	protected void sequence_InteractorBehavior(EObject context, InteractorBehavior semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=InteractorType (actors+=ActorAlias actors+=ActorAlias*)?)
	 */
	protected void sequence_InteractorComponent(EObject context, InteractorComponent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=DataType mode=InteractorDataComponentMode source=InteractorSignalAlias? destinations+=InteractorSignalAlias*)
	 */
	protected void sequence_InteractorData(EObject context, InteractorData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=AccessibleEntity alias=[InteractorData|ID]?)
	 */
	protected void sequence_InteractorSignalAlias(EObject context, InteractorSignalAlias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instance=[InteractorData|ID] destination=InteractorSignalAlias?)
	 */
	protected void sequence_InteractorSignalEmission(EObject context, InteractorSignalEmission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((instance=[InteractorData|ID] source=InteractorSignalAlias?) | init?='init')
	 */
	protected void sequence_InteractorSignalReception(EObject context, InteractorSignalReception semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (actor+=InteractorActor | data+=InteractorData | component+=InteractorComponent | behavior+=InteractorBehavior)*)
	 */
	protected void sequence_InteractorTypeDefinition(EObject context, InteractorTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     custom=[InteractorTypeDefinition|ID]
	 */
	protected void sequence_InteractorType(EObject context, InteractorType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.INTERACTOR_TYPE__CUSTOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.INTERACTOR_TYPE__CUSTOM));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInteractorTypeAccess().getCustomInteractorTypeDefinitionIDTerminalRuleCall_0_1(), semanticObject.getCustom());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (actorType+=ActorTypeDefinition | dataType+=DataTypeDefinition | interactorType+=InteractorTypeDefinition)*
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
	 *     value=[DataDefinitionEnumElement|ID]
	 */
	protected void sequence_LiteralEnum(EObject context, LiteralEnum semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.LITERAL_ENUM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.LITERAL_ENUM__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralEnumAccess().getValueDataDefinitionEnumElementIDTerminalRuleCall_2_0_1(), semanticObject.getValue());
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
	protected void sequence_LiteralString(EObject context, LiteralString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.LITERAL_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.LITERAL_STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralStringAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         now?='now' | 
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
}
