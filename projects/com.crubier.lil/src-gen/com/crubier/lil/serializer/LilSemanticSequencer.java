package com.crubier.lil.serializer;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.Actor;
import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.ActorDeclaration;
import com.crubier.lil.lil.AlwaysEffect;
import com.crubier.lil.lil.BehaviorDeclaration;
import com.crubier.lil.lil.BooleanConjonction;
import com.crubier.lil.lil.BooleanDisjonction;
import com.crubier.lil.lil.BooleanLiteral;
import com.crubier.lil.lil.BooleanNegation;
import com.crubier.lil.lil.BooleanNumberComparison;
import com.crubier.lil.lil.Component;
import com.crubier.lil.lil.ComponentDeclaration;
import com.crubier.lil.lil.DataTypeBase;
import com.crubier.lil.lil.DataTypeCompound;
import com.crubier.lil.lil.DataTypeCompoundDeclaration;
import com.crubier.lil.lil.DataTypeCompoundField;
import com.crubier.lil.lil.Entity;
import com.crubier.lil.lil.EventDeclaration;
import com.crubier.lil.lil.EventEmission;
import com.crubier.lil.lil.EventReception;
import com.crubier.lil.lil.FlowDeclaration;
import com.crubier.lil.lil.FlowEmission;
import com.crubier.lil.lil.FlowReception;
import com.crubier.lil.lil.InteractorDeclaration;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.Model;
import com.crubier.lil.lil.NumberAddition;
import com.crubier.lil.lil.NumberDivision;
import com.crubier.lil.lil.NumberFunctionExpression;
import com.crubier.lil.lil.NumberIfExpression;
import com.crubier.lil.lil.NumberLiteral;
import com.crubier.lil.lil.NumberModulo;
import com.crubier.lil.lil.NumberMultiplication;
import com.crubier.lil.lil.NumberOpposition;
import com.crubier.lil.lil.NumberPower;
import com.crubier.lil.lil.NumberSubstraction;
import com.crubier.lil.lil.NumberSwitchExpressionNumber;
import com.crubier.lil.lil.NumberSwitchExpressionNumberCase;
import com.crubier.lil.lil.NumberSwitchExpressionText;
import com.crubier.lil.lil.NumberSwitchExpressionTextCase;
import com.crubier.lil.lil.OnCause;
import com.crubier.lil.lil.SetEffect;
import com.crubier.lil.lil.TextJoin;
import com.crubier.lil.lil.TextLiteral;
import com.crubier.lil.lil.TriggerEffect;
import com.crubier.lil.lil.WhenCause;
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
				if(context == grammarAccess.getActorRule()) {
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
			case LilPackage.ACTOR_DECLARATION:
				if(context == grammarAccess.getActorDeclarationRule() ||
				   context == grammarAccess.getEntityDeclarationRule()) {
					sequence_ActorDeclaration(context, (ActorDeclaration) semanticObject); 
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
			case LilPackage.BEHAVIOR_DECLARATION:
				if(context == grammarAccess.getBehaviorDeclarationRule()) {
					sequence_BehaviorDeclaration(context, (BehaviorDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.BOOLEAN_CONJONCTION:
				if(context == grammarAccess.getBooleanConjonctionRule() ||
				   context == grammarAccess.getBooleanConjonctionAccess().getBooleanConjonctionLeftAction_1_0_0() ||
				   context == grammarAccess.getBooleanDisjonctionRule() ||
				   context == grammarAccess.getBooleanDisjonctionAccess().getBooleanDisjonctionLeftAction_1_0_0() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanTerminalExpressionRule() ||
				   context == grammarAccess.getBooleanUnaryRule()) {
					sequence_BooleanConjonction(context, (BooleanConjonction) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.BOOLEAN_DISJONCTION:
				if(context == grammarAccess.getBooleanConjonctionRule() ||
				   context == grammarAccess.getBooleanConjonctionAccess().getBooleanConjonctionLeftAction_1_0_0() ||
				   context == grammarAccess.getBooleanDisjonctionRule() ||
				   context == grammarAccess.getBooleanDisjonctionAccess().getBooleanDisjonctionLeftAction_1_0_0() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanTerminalExpressionRule() ||
				   context == grammarAccess.getBooleanUnaryRule()) {
					sequence_BooleanDisjonction(context, (BooleanDisjonction) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanConjonctionRule() ||
				   context == grammarAccess.getBooleanConjonctionAccess().getBooleanConjonctionLeftAction_1_0_0() ||
				   context == grammarAccess.getBooleanDisjonctionRule() ||
				   context == grammarAccess.getBooleanDisjonctionAccess().getBooleanDisjonctionLeftAction_1_0_0() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanTerminalExpressionRule() ||
				   context == grammarAccess.getBooleanUnaryRule()) {
					sequence_BooleanTerminalExpression(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.BOOLEAN_NEGATION:
				if(context == grammarAccess.getBooleanConjonctionRule() ||
				   context == grammarAccess.getBooleanConjonctionAccess().getBooleanConjonctionLeftAction_1_0_0() ||
				   context == grammarAccess.getBooleanDisjonctionRule() ||
				   context == grammarAccess.getBooleanDisjonctionAccess().getBooleanDisjonctionLeftAction_1_0_0() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanTerminalExpressionRule() ||
				   context == grammarAccess.getBooleanUnaryRule()) {
					sequence_BooleanUnary(context, (BooleanNegation) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.BOOLEAN_NUMBER_COMPARISON:
				if(context == grammarAccess.getBooleanConjonctionRule() ||
				   context == grammarAccess.getBooleanConjonctionAccess().getBooleanConjonctionLeftAction_1_0_0() ||
				   context == grammarAccess.getBooleanDisjonctionRule() ||
				   context == grammarAccess.getBooleanDisjonctionAccess().getBooleanDisjonctionLeftAction_1_0_0() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanTerminalExpressionRule() ||
				   context == grammarAccess.getBooleanUnaryRule()) {
					sequence_BooleanTerminalExpression(context, (BooleanNumberComparison) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.COMPONENT_DECLARATION:
				if(context == grammarAccess.getComponentDeclarationRule() ||
				   context == grammarAccess.getEntityDeclarationRule()) {
					sequence_ComponentDeclaration(context, (ComponentDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_BASE:
				if(context == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataTypeBase) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_COMPOUND:
				if(context == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataTypeCompound) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_COMPOUND_DECLARATION:
				if(context == grammarAccess.getDataTypeCompoundDeclarationRule()) {
					sequence_DataTypeCompoundDeclaration(context, (DataTypeCompoundDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.DATA_TYPE_COMPOUND_FIELD:
				if(context == grammarAccess.getDataTypeCompoundFieldRule()) {
					sequence_DataTypeCompoundField(context, (DataTypeCompoundField) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EVENT_DECLARATION:
				if(context == grammarAccess.getEventDeclarationRule() ||
				   context == grammarAccess.getSignalDeclarationRule()) {
					sequence_EventDeclaration(context, (EventDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EVENT_EMISSION:
				if(context == grammarAccess.getEventEmissionRule()) {
					sequence_EventEmission(context, (EventEmission) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.EVENT_RECEPTION:
				if(context == grammarAccess.getEventReceptionRule()) {
					sequence_EventReception(context, (EventReception) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.FLOW_DECLARATION:
				if(context == grammarAccess.getFlowDeclarationRule() ||
				   context == grammarAccess.getSignalDeclarationRule()) {
					sequence_FlowDeclaration(context, (FlowDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.FLOW_EMISSION:
				if(context == grammarAccess.getFlowEmissionRule()) {
					sequence_FlowEmission(context, (FlowEmission) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.FLOW_RECEPTION:
				if(context == grammarAccess.getFlowReceptionRule()) {
					sequence_FlowReception(context, (FlowReception) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.INTERACTOR_DECLARATION:
				if(context == grammarAccess.getInteractorDeclarationRule()) {
					sequence_InteractorDeclaration(context, (InteractorDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_ADDITION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberAddition(context, (NumberAddition) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_DIVISION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberMultiplication(context, (NumberDivision) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_FUNCTION_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberTerminalExpression(context, (NumberFunctionExpression) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_IF_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberCompoundExpression(context, (NumberIfExpression) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_LITERAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberTerminalExpression(context, (NumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_MODULO:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberMultiplication(context, (NumberModulo) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_MULTIPLICATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberMultiplication(context, (NumberMultiplication) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_OPPOSITION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberUnary(context, (NumberOpposition) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_POWER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberPower(context, (NumberPower) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_SUBSTRACTION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberAddition(context, (NumberSubstraction) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberCompoundExpression(context, (NumberSwitchExpressionNumber) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE:
				if(context == grammarAccess.getNumberSwitchExpressionNumberCaseRule()) {
					sequence_NumberSwitchExpressionNumberCase(context, (NumberSwitchExpressionNumberCase) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_SWITCH_EXPRESSION_TEXT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberAdditionRule() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberCompoundExpressionRule() ||
				   context == grammarAccess.getNumberExpressionRule() ||
				   context == grammarAccess.getNumberMultiplicationRule() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0() ||
				   context == grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberPowerRule() ||
				   context == grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0() ||
				   context == grammarAccess.getNumberTerminalExpressionRule() ||
				   context == grammarAccess.getNumberUnaryRule()) {
					sequence_NumberCompoundExpression(context, (NumberSwitchExpressionText) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.NUMBER_SWITCH_EXPRESSION_TEXT_CASE:
				if(context == grammarAccess.getNumberSwitchExpressionTextCaseRule()) {
					sequence_NumberSwitchExpressionTextCase(context, (NumberSwitchExpressionTextCase) semanticObject); 
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
			case LilPackage.TEXT_JOIN:
				if(context == grammarAccess.getTextExpressionRule() ||
				   context == grammarAccess.getTextJoinRule() ||
				   context == grammarAccess.getTextJoinAccess().getTextJoinLeftAction_1_0_0()) {
					sequence_TextJoin(context, (TextJoin) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.TEXT_LITERAL:
				if(context == grammarAccess.getTextExpressionRule() ||
				   context == grammarAccess.getTextJoinRule() ||
				   context == grammarAccess.getTextJoinAccess().getTextJoinLeftAction_1_0_0() ||
				   context == grammarAccess.getTextTerminalExpressionRule()) {
					sequence_TextTerminalExpression(context, (TextLiteral) semanticObject); 
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
			case LilPackage.WHEN_CAUSE:
				if(context == grammarAccess.getCauseRule() ||
				   context == grammarAccess.getWhenCauseRule()) {
					sequence_WhenCause(context, (WhenCause) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         generic='any' | 
	 *         generic='self' | 
	 *         generic='other' | 
	 *         generic='parent' | 
	 *         generic='child' | 
	 *         generic='all' | 
	 *         generic='actors' | 
	 *         specific=Entity
	 *     )
	 */
	protected void sequence_AccessibleEntity(EObject context, AccessibleEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (source=Actor remote=Actor)
	 */
	protected void sequence_ActorAlias(EObject context, ActorAlias semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ACTOR_ALIAS__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ACTOR_ALIAS__SOURCE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ACTOR_ALIAS__REMOTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ACTOR_ALIAS__REMOTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActorAliasAccess().getSourceActorParserRuleCall_0_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getActorAliasAccess().getRemoteActorParserRuleCall_2_0(), semanticObject.getRemote());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ActorDeclaration(EObject context, ActorDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ENTITY_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ENTITY_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActorDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     instance=[ActorDeclaration|ID]
	 */
	protected void sequence_Actor(EObject context, Actor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ACTOR__INSTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ACTOR__INSTANCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActorAccess().getInstanceActorDeclarationIDTerminalRuleCall_0_1(), semanticObject.getInstance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=FlowEmission value=Expression)
	 */
	protected void sequence_AlwaysEffect(EObject context, AlwaysEffect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EFFECT__VALUE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ALWAYS_EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ALWAYS_EFFECT__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAlwaysEffectAccess().getTargetFlowEmissionParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getAlwaysEffectAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (cause=Cause effects+=Effect+)
	 */
	protected void sequence_BehaviorDeclaration(EObject context, BehaviorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=BooleanConjonction_BooleanConjonction_1_0_0 right=BooleanUnary)
	 */
	protected void sequence_BooleanConjonction(EObject context, BooleanConjonction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.BOOLEAN_CONJONCTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.BOOLEAN_CONJONCTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.BOOLEAN_CONJONCTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.BOOLEAN_CONJONCTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanConjonctionAccess().getBooleanConjonctionLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBooleanConjonctionAccess().getRightBooleanUnaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=BooleanDisjonction_BooleanDisjonction_1_0_0 right=BooleanConjonction)
	 */
	protected void sequence_BooleanDisjonction(EObject context, BooleanDisjonction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.BOOLEAN_DISJONCTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.BOOLEAN_DISJONCTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.BOOLEAN_DISJONCTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.BOOLEAN_DISJONCTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanDisjonctionAccess().getBooleanDisjonctionLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getBooleanDisjonctionAccess().getRightBooleanConjonctionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BooleanLiteral
	 */
	protected void sequence_BooleanTerminalExpression(EObject context, BooleanLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.BOOLEAN_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanTerminalExpressionAccess().getValueBooleanLiteralParserRuleCall_1_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         left=NumberExpression 
	 *         (
	 *             op='==' | 
	 *             op='!=' | 
	 *             op='<' | 
	 *             op='>' | 
	 *             op='<=' | 
	 *             op='>='
	 *         ) 
	 *         right=NumberExpression
	 *     )
	 */
	protected void sequence_BooleanTerminalExpression(EObject context, BooleanNumberComparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     operand=BooleanTerminalExpression
	 */
	protected void sequence_BooleanUnary(EObject context, BooleanNegation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.BOOLEAN_NEGATION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.BOOLEAN_NEGATION__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanUnaryAccess().getOperandBooleanTerminalExpressionParserRuleCall_1_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (interactor=[InteractorDeclaration|ID] name=ID (aliases+=ActorAlias aliases+=ActorAlias*)?)
	 */
	protected void sequence_ComponentDeclaration(EObject context, ComponentDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     instance=[ComponentDeclaration|ID]
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.COMPONENT__INSTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.COMPONENT__INSTANCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComponentAccess().getInstanceComponentDeclarationIDTerminalRuleCall_0_1(), semanticObject.getInstance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID fields+=DataTypeCompoundField*)
	 */
	protected void sequence_DataTypeCompoundDeclaration(EObject context, DataTypeCompoundDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=DataType name=ID)
	 */
	protected void sequence_DataTypeCompoundField(EObject context, DataTypeCompoundField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_COMPOUND_FIELD__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_COMPOUND_FIELD__TYPE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_COMPOUND_FIELD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_COMPOUND_FIELD__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeCompoundFieldAccess().getTypeDataTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDataTypeCompoundFieldAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         type='void' | 
	 *         type='symbol' | 
	 *         type='number' | 
	 *         type='text' | 
	 *         type='time' | 
	 *         type='reference'
	 *     )
	 */
	protected void sequence_DataType(EObject context, DataTypeBase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[DataTypeCompoundDeclaration|ID]
	 */
	protected void sequence_DataType(EObject context, DataTypeCompound semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_COMPOUND__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_COMPOUND__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getTypeDataTypeCompoundDeclarationIDTerminalRuleCall_0_1_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     instance=[EntityDeclaration|ID]
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.ENTITY__INSTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.ENTITY__INSTANCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityAccess().getInstanceEntityDeclarationIDTerminalRuleCall_0_1(), semanticObject.getInstance());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=DataType name=ID source=AccessibleEntity? destinations+=AccessibleEntity*)
	 */
	protected void sequence_EventDeclaration(EObject context, EventDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instance=[EventDeclaration|ID] destination=Component?)
	 */
	protected void sequence_EventEmission(EObject context, EventEmission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((instance=[EventDeclaration|ID] source=Component?) | base='init')
	 */
	protected void sequence_EventReception(EObject context, EventReception semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=DataType name=ID source=AccessibleEntity? destinations+=AccessibleEntity*)
	 */
	protected void sequence_FlowDeclaration(EObject context, FlowDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instance=[FlowDeclaration|ID] destination=Component?)
	 */
	protected void sequence_FlowEmission(EObject context, FlowEmission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (instance=[FlowDeclaration|ID] source=Component?)
	 */
	protected void sequence_FlowReception(EObject context, FlowReception semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (entities+=EntityDeclaration | signals+=SignalDeclaration | behaviors+=BehaviorDeclaration)*)
	 */
	protected void sequence_InteractorDeclaration(EObject context, InteractorDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (interactors+=InteractorDeclaration | dataTypes+=DataTypeCompoundDeclaration)*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=NumberAddition_NumberAddition_1_0_0_0 right=NumberMultiplication)
	 */
	protected void sequence_NumberAddition(EObject context, NumberAddition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_ADDITION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_ADDITION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_ADDITION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_ADDITION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberAdditionAccess().getNumberAdditionLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNumberAdditionAccess().getRightNumberMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=NumberAddition_NumberSubstraction_1_0_1_0 right=NumberMultiplication)
	 */
	protected void sequence_NumberAddition(EObject context, NumberSubstraction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_SUBSTRACTION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_SUBSTRACTION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_SUBSTRACTION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_SUBSTRACTION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberAdditionAccess().getNumberSubstractionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNumberAdditionAccess().getRightNumberMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (if=BooleanExpression then=NumberAddition else=NumberAddition?)
	 */
	protected void sequence_NumberCompoundExpression(EObject context, NumberIfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (switch=NumberExpression cases+=NumberSwitchExpressionNumberCase+ default=NumberExpression?)
	 */
	protected void sequence_NumberCompoundExpression(EObject context, NumberSwitchExpressionNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (switch=TextExpression cases+=NumberSwitchExpressionTextCase+ default=NumberExpression?)
	 */
	protected void sequence_NumberCompoundExpression(EObject context, NumberSwitchExpressionText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=NumberMultiplication_NumberDivision_1_0_1_0 right=NumberPower)
	 */
	protected void sequence_NumberMultiplication(EObject context, NumberDivision semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_DIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberMultiplicationAccess().getNumberDivisionLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNumberMultiplicationAccess().getRightNumberPowerParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=NumberMultiplication_NumberModulo_1_0_2_0 right=NumberPower)
	 */
	protected void sequence_NumberMultiplication(EObject context, NumberModulo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_MODULO__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_MODULO__LEFT));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_MODULO__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_MODULO__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberMultiplicationAccess().getNumberModuloLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNumberMultiplicationAccess().getRightNumberPowerParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=NumberMultiplication_NumberMultiplication_1_0_0_0 right=NumberPower)
	 */
	protected void sequence_NumberMultiplication(EObject context, NumberMultiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberMultiplicationAccess().getNumberMultiplicationLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNumberMultiplicationAccess().getRightNumberPowerParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=NumberPower_NumberPower_1_0_0 right=NumberUnary)
	 */
	protected void sequence_NumberPower(EObject context, NumberPower semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_POWER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_POWER__LEFT));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_POWER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_POWER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberPowerAccess().getNumberPowerLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getNumberPowerAccess().getRightNumberUnaryParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=NumberExpression value=NumberExpression)
	 */
	protected void sequence_NumberSwitchExpressionNumberCase(EObject context, NumberSwitchExpressionNumberCase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_SWITCH_EXPRESSION_NUMBER_CASE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberSwitchExpressionNumberCaseAccess().getConditionNumberExpressionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getNumberSwitchExpressionNumberCaseAccess().getValueNumberExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=TextExpression value=NumberExpression)
	 */
	protected void sequence_NumberSwitchExpressionTextCase(EObject context, NumberSwitchExpressionTextCase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_SWITCH_EXPRESSION_TEXT_CASE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_SWITCH_EXPRESSION_TEXT_CASE__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_SWITCH_EXPRESSION_TEXT_CASE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_SWITCH_EXPRESSION_TEXT_CASE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberSwitchExpressionTextCaseAccess().getConditionTextExpressionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getNumberSwitchExpressionTextCaseAccess().getValueNumberExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (function=ID (arguments+=NumberExpression arguments+=NumberExpression*)?)
	 */
	protected void sequence_NumberTerminalExpression(EObject context, NumberFunctionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NumberLiteral
	 */
	protected void sequence_NumberTerminalExpression(EObject context, NumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberTerminalExpressionAccess().getValueNumberLiteralParserRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     operand=NumberTerminalExpression
	 */
	protected void sequence_NumberUnary(EObject context, NumberOpposition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.NUMBER_OPPOSITION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.NUMBER_OPPOSITION__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberUnaryAccess().getOperandNumberTerminalExpressionParserRuleCall_1_1_0(), semanticObject.getOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (event=EventReception guard=BooleanExpression?)
	 */
	protected void sequence_OnCause(EObject context, OnCause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=FlowEmission value=Expression)
	 */
	protected void sequence_SetEffect(EObject context, SetEffect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EFFECT__VALUE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.SET_EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.SET_EFFECT__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSetEffectAccess().getTargetFlowEmissionParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getSetEffectAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=TextJoin_TextJoin_1_0_0 right=TextTerminalExpression)
	 */
	protected void sequence_TextJoin(EObject context, TextJoin semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.TEXT_JOIN__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.TEXT_JOIN__LEFT));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.TEXT_JOIN__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.TEXT_JOIN__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextJoinAccess().getTextJoinLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getTextJoinAccess().getRightTextTerminalExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=TextLiteral
	 */
	protected void sequence_TextTerminalExpression(EObject context, TextLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.TEXT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.TEXT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextTerminalExpressionAccess().getValueTextLiteralParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=EventEmission value=Expression)
	 */
	protected void sequence_TriggerEffect(EObject context, TriggerEffect semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.EFFECT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.EFFECT__VALUE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.TRIGGER_EFFECT__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.TRIGGER_EFFECT__TARGET));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTriggerEffectAccess().getTargetEventEmissionParserRuleCall_1_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getTriggerEffectAccess().getValueExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=BooleanExpression guard=BooleanExpression?)
	 */
	protected void sequence_WhenCause(EObject context, WhenCause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
