package com.crubier.lil.serializer;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.Actor;
import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.AlwaysEffect;
import com.crubier.lil.lil.Behavior;
import com.crubier.lil.lil.BooleanLiteral;
import com.crubier.lil.lil.CasePart;
import com.crubier.lil.lil.Component;
import com.crubier.lil.lil.DataTypeBase;
import com.crubier.lil.lil.DataTypeCollection;
import com.crubier.lil.lil.DataTypeCompound;
import com.crubier.lil.lil.DataTypeStructure;
import com.crubier.lil.lil.DataTypeStructureField;
import com.crubier.lil.lil.EnumDefinitionSet;
import com.crubier.lil.lil.EnumLiteral;
import com.crubier.lil.lil.ForEachExpression;
import com.crubier.lil.lil.FunctionCallExpression;
import com.crubier.lil.lil.IfExpression;
import com.crubier.lil.lil.Interactor;
import com.crubier.lil.lil.LilModel;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.ListLiteral;
import com.crubier.lil.lil.NullLiteral;
import com.crubier.lil.lil.NumberDefinitionInterval;
import com.crubier.lil.lil.NumberDefinitionSet;
import com.crubier.lil.lil.NumberLiteral;
import com.crubier.lil.lil.OnCause;
import com.crubier.lil.lil.SetEffect;
import com.crubier.lil.lil.SetLiteral;
import com.crubier.lil.lil.Signal;
import com.crubier.lil.lil.SignalAlias;
import com.crubier.lil.lil.SignalEmission;
import com.crubier.lil.lil.SignalLiteral;
import com.crubier.lil.lil.SignalReception;
import com.crubier.lil.lil.StringLiteral;
import com.crubier.lil.lil.SwitchExpression;
import com.crubier.lil.lil.TimeLiteral;
import com.crubier.lil.lil.TimeLiteralNow;
import com.crubier.lil.lil.TriggerEffect;
import com.crubier.lil.lil.UnaryOperation;
import com.crubier.lil.lil.WhenCause;
import com.crubier.lil.lil.XBinaryOperation;
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
			case LilPackage.ACTOR:
				if(context == grammarAccess.getActorRule() ||
				   context == grammarAccess.getEntityRule()) {
					sequence_Actor(context, (Actor) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ACTOR_ALIAS:
				if(context == grammarAccess.getActorAliasRule()) {
					sequence_ActorAlias(context, (ActorAlias) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ALWAYS_EFFECT:
				if(context == grammarAccess.getAlwaysEffectRule() ||
				   context == grammarAccess.getEffectRule()) {
					sequence_AlwaysEffect(context, (AlwaysEffect) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.BEHAVIOR:
				if(context == grammarAccess.getBehaviorRule()) {
					sequence_Behavior(context, (Behavior) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.CASE_PART:
				if(context == grammarAccess.getCasePartRule()) {
					sequence_CasePart(context, (CasePart) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule() ||
				   context == grammarAccess.getEntityRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_BASE:
				if(context == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataTypeBase) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_COLLECTION:
				if(context == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataTypeCollection) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_COMPOUND:
				if(context == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataTypeCompound) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_STRUCTURE:
				if(context == grammarAccess.getDataTypeDefinitionRule() ||
				   context == grammarAccess.getDataTypeStructureRule()) {
					sequence_DataTypeStructure(context, (DataTypeStructure) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_STRUCTURE_FIELD:
				if(context == grammarAccess.getDataTypeStructureFieldRule()) {
					sequence_DataTypeStructureField(context, (DataTypeStructureField) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ENUM_DEFINITION_SET:
				if(context == grammarAccess.getDefinitionSetRule()) {
					sequence_DefinitionSet(context, (EnumDefinitionSet) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ENUM_LITERAL:
				if(context == grammarAccess.getEnumElementRule()) {
					sequence_EnumElement(context, (EnumLiteral) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_Literal(context, (EnumLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.FOR_EACH_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getForEachExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_ForEachExpression(context, (ForEachExpression) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.FUNCTION_CALL_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionCallExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_FunctionCallExpression(context, (FunctionCallExpression) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.IF_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIfExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_IfExpression(context, (IfExpression) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR:
				if(context == grammarAccess.getInteractorRule()) {
					sequence_Interactor(context, (Interactor) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.LIL_MODEL:
				if(context == grammarAccess.getLilModelRule()) {
					sequence_LilModel(context, (LilModel) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.LIST_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getCollectionLiteralRule() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getListLiteralRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_ListLiteral(context, (ListLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NULL_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getNullLiteralRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_NullLiteral(context, (NullLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_DEFINITION_INTERVAL:
				if(context == grammarAccess.getDefinitionSetRule()) {
					sequence_DefinitionSet(context, (NumberDefinitionInterval) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_DEFINITION_SET:
				if(context == grammarAccess.getDefinitionSetRule()) {
					sequence_DefinitionSet(context, (NumberDefinitionSet) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getNumberLiteralRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_NumberLiteral(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ON_CAUSE:
				if(context == grammarAccess.getCauseRule() ||
				   context == grammarAccess.getOnCauseRule()) {
					sequence_OnCause(context, (OnCause) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.SET_EFFECT:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getSetEffectRule()) {
					sequence_SetEffect(context, (SetEffect) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.SET_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getCollectionLiteralRule() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getSetLiteralRule() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_SetLiteral(context, (SetLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.SIGNAL:
				if(context == grammarAccess.getSignalRule()) {
					sequence_Signal(context, (Signal) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.SIGNAL_ALIAS:
				if(context == grammarAccess.getSignalAliasRule()) {
					sequence_SignalAlias(context, (SignalAlias) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.SIGNAL_EMISSION:
				if(context == grammarAccess.getSignalEmissionRule()) {
					sequence_SignalEmission(context, (SignalEmission) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.SIGNAL_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_Literal(context, (SignalLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.SIGNAL_RECEPTION:
				if(context == grammarAccess.getSignalReceptionRule()) {
					sequence_SignalReception(context, (SignalReception) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.STRING_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getStringLiteralRule() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.SWITCH_EXPRESSION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getSwitchExpressionRule() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_SwitchExpression(context, (SwitchExpression) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.TIME_LITERAL:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getTimeLiteralRule() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_TimeLiteral(context, (TimeLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.TIME_LITERAL_NOW:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getTimeLiteralRule() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_TimeLiteral(context, (TimeLiteralNow) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.TRIGGER_EFFECT:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getTriggerEffectRule()) {
					sequence_TriggerEffect(context, (TriggerEffect) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.UNARY_OPERATION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_UnaryOperation(context, (UnaryOperation) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.WHEN_CAUSE:
				if(context == grammarAccess.getCauseRule() ||
				   context == grammarAccess.getWhenCauseRule()) {
					sequence_WhenCause(context, (WhenCause) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XBINARY_OPERATION:
				if(context == grammarAccess.getAdditiveExpressionRule() ||
				   context == grammarAccess.getAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getEqualityExpressionRule() ||
				   context == grammarAccess.getEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionRule() ||
				   context == grammarAccess.getMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getOtherOperatorExpressionRule() ||
				   context == grammarAccess.getOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getParenthesizedExpressionRule() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionRule() ||
				   context == grammarAccess.getRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getUnaryOperationRule()) {
					sequence_AdditiveExpression_AndExpression_EqualityExpression_MultiplicativeExpression_OrExpression_OtherOperatorExpression_RelationalExpression(context, (XBinaryOperation) semanticObject); 
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
	 *     (source=[Actor|ID] alias=[Actor|ID])
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
		feeder.accept(grammarAccess.getActorAliasAccess().getSourceActorIDTerminalRuleCall_0_0_1(), semanticObject.getSource());
		feeder.accept(grammarAccess.getActorAliasAccess().getAliasActorIDTerminalRuleCall_2_0_1(), semanticObject.getAlias());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ENTITY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (leftOperand=AdditiveExpression_XBinaryOperation_1_0_0_0 feature=OpAdd rightOperand=MultiplicativeExpression) | 
	 *         (leftOperand=MultiplicativeExpression_XBinaryOperation_1_0_0_0 feature=OpMulti rightOperand=UnaryOperation) | 
	 *         (leftOperand=OtherOperatorExpression_XBinaryOperation_1_0_0_0 feature=OpOther rightOperand=AdditiveExpression) | 
	 *         (leftOperand=RelationalExpression_XBinaryOperation_1_0_0_0 feature=OpCompare rightOperand=OtherOperatorExpression) | 
	 *         (leftOperand=EqualityExpression_XBinaryOperation_1_0_0_0 feature=OpEquality rightOperand=RelationalExpression) | 
	 *         (leftOperand=AndExpression_XBinaryOperation_1_0_0_0 feature=OpAnd rightOperand=EqualityExpression) | 
	 *         (leftOperand=OrExpression_XBinaryOperation_1_0_0_0 feature=OpOr rightOperand=AndExpression)
	 *     )
	 */
	protected void sequence_AdditiveExpression_AndExpression_EqualityExpression_MultiplicativeExpression_OrExpression_OtherOperatorExpression_RelationalExpression(EObject context, XBinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=SignalEmission value=Expression)
	 */
	protected void sequence_AlwaysEffect(EObject context, AlwaysEffect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EFFECT__TARGET));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EFFECT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlwaysEffectAccess().getTargetSignalEmissionParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getAlwaysEffectAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cause=Cause effects+=Effect+)
	 */
	protected void sequence_Behavior(EObject context, Behavior semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isTrue?='true'?)
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (case=Expression then=Expression)
	 */
	protected void sequence_CasePart(EObject context, CasePart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.CASE_PART__CASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.CASE_PART__CASE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.CASE_PART__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.CASE_PART__THEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCasePartAccess().getCaseExpressionParserRuleCall_1_0(), semanticObject.getCase());
		feeder.accept(grammarAccess.getCasePartAccess().getThenExpressionParserRuleCall_3_0(), semanticObject.getThen());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID interactor=[Interactor|ID] (actors+=ActorAlias actors+=ActorAlias*)?)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=DataType)
	 */
	protected void sequence_DataTypeStructureField(EObject context, DataTypeStructureField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_STRUCTURE_FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_STRUCTURE_FIELD__NAME));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_STRUCTURE_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_STRUCTURE_FIELD__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeStructureFieldAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getDataTypeStructureFieldAccess().getTypeDataTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fields+=DataTypeStructureField*)
	 */
	protected void sequence_DataTypeStructure(EObject context, DataTypeStructure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeBase definitionSet=DefinitionSet?)
	 */
	protected void sequence_DataType(EObject context, DataTypeBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((mode='set' | mode='list' | mode='map') type=[DataType|ID] definitionSet=DefinitionSet?)
	 */
	protected void sequence_DataType(EObject context, DataTypeCollection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     compound=[DataTypeStructure|ID]
	 */
	protected void sequence_DataType(EObject context, DataTypeCompound semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_COMPOUND__COMPOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_COMPOUND__COMPOUND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getCompoundDataTypeStructureIDTerminalRuleCall_2_1_0_1(), semanticObject.getCompound());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=EnumElement elements+=EnumElement*)
	 */
	protected void sequence_DefinitionSet(EObject context, EnumDefinitionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inf=NumberLiteral sup=NumberLiteral)
	 */
	protected void sequence_DefinitionSet(EObject context, NumberDefinitionInterval semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_DEFINITION_INTERVAL__INF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_DEFINITION_INTERVAL__INF));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_DEFINITION_INTERVAL__SUP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_DEFINITION_INTERVAL__SUP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDefinitionSetAccess().getInfNumberLiteralParserRuleCall_2_2_0(), semanticObject.getInf());
		feeder.accept(grammarAccess.getDefinitionSetAccess().getSupNumberLiteralParserRuleCall_2_4_0(), semanticObject.getSup());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=NumberLiteral elements+=NumberLiteral*)
	 */
	protected void sequence_DefinitionSet(EObject context, NumberDefinitionSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EnumElement(EObject context, EnumLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (forExpression=Expression eachExpression=Expression)
	 */
	protected void sequence_ForEachExpression(EObject context, ForEachExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.FOR_EACH_EXPRESSION__FOR_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.FOR_EACH_EXPRESSION__FOR_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.FOR_EACH_EXPRESSION__EACH_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.FOR_EACH_EXPRESSION__EACH_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForEachExpressionAccess().getForExpressionExpressionParserRuleCall_4_0(), semanticObject.getForExpression());
		feeder.accept(grammarAccess.getForEachExpressionAccess().getEachExpressionExpressionParserRuleCall_6_0(), semanticObject.getEachExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (function=BuiltInFunction arguments+=Expression? arguments+=Expression*)
	 */
	protected void sequence_FunctionCallExpression(EObject context, FunctionCallExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=Expression then=Expression else=Expression)
	 */
	protected void sequence_IfExpression(EObject context, IfExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.IF_EXPRESSION__IF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.IF_EXPRESSION__IF));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.IF_EXPRESSION__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.IF_EXPRESSION__THEN));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.IF_EXPRESSION__ELSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.IF_EXPRESSION__ELSE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIfExpressionAccess().getIfExpressionParserRuleCall_3_0(), semanticObject.getIf());
		feeder.accept(grammarAccess.getIfExpressionAccess().getThenExpressionParserRuleCall_5_0(), semanticObject.getThen());
		feeder.accept(grammarAccess.getIfExpressionAccess().getElseExpressionParserRuleCall_6_1_0(), semanticObject.getElse());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (entities+=Entity | signals+=Signal | behaviors+=Behavior)*)
	 */
	protected void sequence_Interactor(EObject context, Interactor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interactors+=Interactor | dataTypes+=DataTypeDefinition)*
	 */
	protected void sequence_LilModel(EObject context, LilModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elements+=Expression elements+=Expression*)?)
	 */
	protected void sequence_ListLiteral(EObject context, ListLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     element=[EnumElement|ID]
	 */
	protected void sequence_Literal(EObject context, EnumLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     signal=[Signal|ID]
	 */
	protected void sequence_Literal(EObject context, SignalLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.SIGNAL_LITERAL__SIGNAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.SIGNAL_LITERAL__SIGNAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getSignalSignalIDTerminalRuleCall_7_1_0_1(), semanticObject.getSignal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {NullLiteral}
	 */
	protected void sequence_NullLiteral(EObject context, NullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_NumberLiteral(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberLiteralAccess().getValueNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (event=SignalReception guard=Expression?)
	 */
	protected void sequence_OnCause(EObject context, OnCause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=SignalEmission value=Expression)
	 */
	protected void sequence_SetEffect(EObject context, SetEffect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EFFECT__TARGET));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EFFECT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetEffectAccess().getTargetSignalEmissionParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getSetEffectAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((elements+=Expression elements+=Expression*)?)
	 */
	protected void sequence_SetLiteral(EObject context, SetLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=AccessibleEntity alias=[Signal|ID]?)
	 */
	protected void sequence_SignalAlias(EObject context, SignalAlias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instance=[Signal|ID] destination=SignalAlias?)
	 */
	protected void sequence_SignalEmission(EObject context, SignalEmission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((instance=[Signal|ID] source=SignalAlias?) | init?='init')
	 */
	protected void sequence_SignalReception(EObject context, SignalReception semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=DataType mode=SignalMode source=SignalAlias? destinations+=SignalAlias*)
	 */
	protected void sequence_Signal(EObject context, Signal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (switch=Expression cases+=CasePart+ default=Expression?)
	 */
	protected void sequence_SwitchExpression(EObject context, SwitchExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	protected void sequence_TimeLiteral(EObject context, TimeLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {TimeLiteralNow}
	 */
	protected void sequence_TimeLiteral(EObject context, TimeLiteralNow semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=SignalEmission value=Expression)
	 */
	protected void sequence_TriggerEffect(EObject context, TriggerEffect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EFFECT__TARGET));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EFFECT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTriggerEffectAccess().getTargetSignalEmissionParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getTriggerEffectAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (feature=OpUnary operand=PrimaryExpression)
	 */
	protected void sequence_UnaryOperation(EObject context, UnaryOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.UNARY_OPERATION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.UNARY_OPERATION__FEATURE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.UNARY_OPERATION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.UNARY_OPERATION__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnaryOperationAccess().getFeatureOpUnaryParserRuleCall_0_1_0(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getUnaryOperationAccess().getOperandPrimaryExpressionParserRuleCall_0_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression guard=Expression?)
	 */
	protected void sequence_WhenCause(EObject context, WhenCause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
