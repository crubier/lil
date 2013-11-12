package com.crubier.lil.serializer;

import com.crubier.lil.lil.AccessibleEntity;
import com.crubier.lil.lil.Actor;
import com.crubier.lil.lil.ActorAlias;
import com.crubier.lil.lil.ActorDeclaration;
import com.crubier.lil.lil.AlwaysEffect;
import com.crubier.lil.lil.BehaviorDeclaration;
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
import com.crubier.lil.lil.LilModel;
import com.crubier.lil.lil.LilPackage;
import com.crubier.lil.lil.OnCause;
import com.crubier.lil.lil.SetEffect;
import com.crubier.lil.lil.TriggerEffect;
import com.crubier.lil.lil.WhenCause;
import com.crubier.lil.lil.XBinaryOperation;
import com.crubier.lil.lil.XBooleanLiteral;
import com.crubier.lil.lil.XCasePart;
import com.crubier.lil.lil.XForEachExpression;
import com.crubier.lil.lil.XFunctionCallExpression;
import com.crubier.lil.lil.XIfExpression;
import com.crubier.lil.lil.XListLiteral;
import com.crubier.lil.lil.XNullLiteral;
import com.crubier.lil.lil.XNumberLiteral;
import com.crubier.lil.lil.XSetLiteral;
import com.crubier.lil.lil.XStringLiteral;
import com.crubier.lil.lil.XSwitchExpression;
import com.crubier.lil.lil.XUnaryOperation;
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
			case LilPackage.LIL_MODEL:
				if(context == grammarAccess.getLilModelRule()) {
					sequence_LilModel(context, (LilModel) semanticObject); 
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
			case LilPackage.XBINARY_OPERATION:
				if(context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()) {
					sequence_XAdditiveExpression_XAndExpression_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()) {
					sequence_XAdditiveExpression_XAndExpression_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()) {
					sequence_XAndExpression_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXOrExpressionRule() ||
				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XAndExpression_XEqualityExpression_XOrExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXAndExpressionRule() ||
				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()) {
					sequence_XAndExpression_XEqualityExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXEqualityExpressionRule() ||
				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0()) {
					sequence_XEqualityExpression_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getXRelationalExpressionRule()) {
					sequence_XRelationalExpression(context, (XBinaryOperation) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XBOOLEAN_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXBooleanLiteralRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XCASE_PART:
				if(context == grammarAccess.getXCasePartRule()) {
					sequence_XCasePart(context, (XCasePart) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XFOR_EACH_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXForEachExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XForEachExpression(context, (XForEachExpression) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XFUNCTION_CALL_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXFunctionCallExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XFunctionCallExpression(context, (XFunctionCallExpression) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XIF_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXIfExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XIfExpression(context, (XIfExpression) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XLIST_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXCollectionLiteralRule() ||
				   context == grammarAccess.getXListLiteralRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XListLiteral(context, (XListLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XNULL_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNullLiteralRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XRelationalExpression_XBinaryOperation_1_0_0_0(context, (XNullLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XNUMBER_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXNumberLiteralRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XNumberLiteral(context, (XNumberLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XSET_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXCollectionLiteralRule() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXSetLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSetLiteral(context, (XSetLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XSTRING_LITERAL:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXLiteralRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXStringLiteralRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XSWITCH_EXPRESSION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXSwitchExpressionRule() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
					return; 
				}
				else break;
			case LilPackage.XUNARY_OPERATION:
				if(context == grammarAccess.getXAdditiveExpressionRule() ||
				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
				   context == grammarAccess.getXUnaryOperationRule()) {
					sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
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
	 *     (target=FlowEmission value=XExpression)
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
		feeder.accept(grammarAccess.getAlwaysEffectAccess().getValueXExpressionParserRuleCall_3_0(), semanticObject.getValue());
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
	 *     type=DataTypeBase
	 */
	protected void sequence_DataType(EObject context, DataTypeBase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.DATA_TYPE_BASE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.DATA_TYPE_BASE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getTypeDataTypeBaseParserRuleCall_1_1_0(), semanticObject.getType());
		feeder.finish();
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
	protected void sequence_LilModel(EObject context, LilModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=EventReception guard=XExpression?)
	 */
	protected void sequence_OnCause(EObject context, OnCause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=FlowEmission value=XExpression)
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
		feeder.accept(grammarAccess.getSetEffectAccess().getValueXExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (target=EventEmission value=XExpression)
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
		feeder.accept(grammarAccess.getTriggerEffectAccess().getValueXExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=XExpression guard=XExpression?)
	 */
	protected void sequence_WhenCause(EObject context, WhenCause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (leftOperand=XEqualityExpression_XBinaryOperation_1_0_0_0 feature=OpEquality rightOperand=XRelationalExpression) | 
	 *         (leftOperand=XRelationalExpression_XBinaryOperation_1_0_0_0 feature=OpCompare rightOperand=XOtherOperatorExpression) | 
	 *         (leftOperand=XAndExpression_XBinaryOperation_1_0_0_0 feature=OpAnd rightOperand=XEqualityExpression) | 
	 *         (leftOperand=XOrExpression_XBinaryOperation_1_0_0_0 feature=OpOr rightOperand=XAndExpression) | 
	 *         (leftOperand=XMultiplicativeExpression_XBinaryOperation_1_0_0_0 feature=OpMulti rightOperand=XUnaryOperation) | 
	 *         (leftOperand=XAdditiveExpression_XBinaryOperation_1_0_0_0 feature=OpAdd rightOperand=XMultiplicativeExpression) | 
	 *         (leftOperand=XOtherOperatorExpression_XBinaryOperation_1_0_0_0 feature=OpOther rightOperand=XAdditiveExpression)
	 *     )
	 */
	protected void sequence_XAdditiveExpression_XAndExpression_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XOtherOperatorExpression_XRelationalExpression(EObject context, XBinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (leftOperand=XEqualityExpression_XBinaryOperation_1_0_0_0 feature=OpEquality rightOperand=XRelationalExpression) | 
	 *         (leftOperand=XRelationalExpression_XBinaryOperation_1_0_0_0 feature=OpCompare rightOperand=XOtherOperatorExpression) | 
	 *         (leftOperand=XAndExpression_XBinaryOperation_1_0_0_0 feature=OpAnd rightOperand=XEqualityExpression) | 
	 *         (leftOperand=XOrExpression_XBinaryOperation_1_0_0_0 feature=OpOr rightOperand=XAndExpression) | 
	 *         (leftOperand=XMultiplicativeExpression_XBinaryOperation_1_0_0_0 feature=OpMulti rightOperand=XUnaryOperation) | 
	 *         (leftOperand=XAdditiveExpression_XBinaryOperation_1_0_0_0 feature=OpAdd rightOperand=XMultiplicativeExpression)
	 *     )
	 */
	protected void sequence_XAdditiveExpression_XAndExpression_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XRelationalExpression(EObject context, XBinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (leftOperand=XEqualityExpression_XBinaryOperation_1_0_0_0 feature=OpEquality rightOperand=XRelationalExpression) | 
	 *         (leftOperand=XRelationalExpression_XBinaryOperation_1_0_0_0 feature=OpCompare rightOperand=XOtherOperatorExpression) | 
	 *         (leftOperand=XAndExpression_XBinaryOperation_1_0_0_0 feature=OpAnd rightOperand=XEqualityExpression) | 
	 *         (leftOperand=XOrExpression_XBinaryOperation_1_0_0_0 feature=OpOr rightOperand=XAndExpression) | 
	 *         (leftOperand=XMultiplicativeExpression_XBinaryOperation_1_0_0_0 feature=OpMulti rightOperand=XUnaryOperation)
	 *     )
	 */
	protected void sequence_XAndExpression_XEqualityExpression_XMultiplicativeExpression_XOrExpression_XRelationalExpression(EObject context, XBinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (leftOperand=XEqualityExpression_XBinaryOperation_1_0_0_0 feature=OpEquality rightOperand=XRelationalExpression) | 
	 *         (leftOperand=XRelationalExpression_XBinaryOperation_1_0_0_0 feature=OpCompare rightOperand=XOtherOperatorExpression) | 
	 *         (leftOperand=XAndExpression_XBinaryOperation_1_0_0_0 feature=OpAnd rightOperand=XEqualityExpression) | 
	 *         (leftOperand=XOrExpression_XBinaryOperation_1_0_0_0 feature=OpOr rightOperand=XAndExpression)
	 *     )
	 */
	protected void sequence_XAndExpression_XEqualityExpression_XOrExpression_XRelationalExpression(EObject context, XBinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (leftOperand=XEqualityExpression_XBinaryOperation_1_0_0_0 feature=OpEquality rightOperand=XRelationalExpression) | 
	 *         (leftOperand=XRelationalExpression_XBinaryOperation_1_0_0_0 feature=OpCompare rightOperand=XOtherOperatorExpression) | 
	 *         (leftOperand=XAndExpression_XBinaryOperation_1_0_0_0 feature=OpAnd rightOperand=XEqualityExpression)
	 *     )
	 */
	protected void sequence_XAndExpression_XEqualityExpression_XRelationalExpression(EObject context, XBinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isTrue?='true'?)
	 */
	protected void sequence_XBooleanLiteral(EObject context, XBooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (case=XExpression then=XExpression)
	 */
	protected void sequence_XCasePart(EObject context, XCasePart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XCASE_PART__CASE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XCASE_PART__CASE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XCASE_PART__THEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XCASE_PART__THEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_0(), semanticObject.getCase());
		feeder.accept(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0(), semanticObject.getThen());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (leftOperand=XEqualityExpression_XBinaryOperation_1_0_0_0 feature=OpEquality rightOperand=XRelationalExpression) | 
	 *         (leftOperand=XRelationalExpression_XBinaryOperation_1_0_0_0 feature=OpCompare rightOperand=XOtherOperatorExpression)
	 *     )
	 */
	protected void sequence_XEqualityExpression_XRelationalExpression(EObject context, XBinaryOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (forExpression=XExpression eachExpression=XExpression)
	 */
	protected void sequence_XForEachExpression(EObject context, XForEachExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XFOR_EACH_EXPRESSION__FOR_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XFOR_EACH_EXPRESSION__FOR_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XFOR_EACH_EXPRESSION__EACH_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XFOR_EACH_EXPRESSION__EACH_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXForEachExpressionAccess().getForExpressionXExpressionParserRuleCall_4_0(), semanticObject.getForExpression());
		feeder.accept(grammarAccess.getXForEachExpressionAccess().getEachExpressionXExpressionParserRuleCall_6_0(), semanticObject.getEachExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (function=BuiltInFunction arguments+=XExpression? arguments+=XExpression*)
	 */
	protected void sequence_XFunctionCallExpression(EObject context, XFunctionCallExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (if=XExpression then=XExpression else=XExpression?)
	 */
	protected void sequence_XIfExpression(EObject context, XIfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elements+=XExpression elements+=XExpression*)?)
	 */
	protected void sequence_XListLiteral(EObject context, XListLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_XNumberLiteral(EObject context, XNumberLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XNUMBER_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XNUMBER_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXNumberLiteralAccess().getValueNUMBERParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (leftOperand=XRelationalExpression_XBinaryOperation_1_0_0_0 feature=OpCompare rightOperand=XOtherOperatorExpression)
	 */
	protected void sequence_XRelationalExpression(EObject context, XBinaryOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XBINARY_OPERATION__LEFT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XBINARY_OPERATION__LEFT_OPERAND));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XBINARY_OPERATION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XBINARY_OPERATION__FEATURE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XBINARY_OPERATION__RIGHT_OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XBINARY_OPERATION__RIGHT_OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(), semanticObject.getLeftOperand());
		feeder.accept(grammarAccess.getXRelationalExpressionAccess().getFeatureOpCompareParserRuleCall_1_0_0_1_0(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_0(), semanticObject.getRightOperand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {XNullLiteral}
	 */
	protected void sequence_XRelationalExpression_XBinaryOperation_1_0_0_0(EObject context, XNullLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((elements+=XExpression elements+=XExpression*)?)
	 */
	protected void sequence_XSetLiteral(EObject context, XSetLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_XStringLiteral(EObject context, XStringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XSTRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XSTRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (switch=XExpression cases+=XCasePart+ default=XExpression?)
	 */
	protected void sequence_XSwitchExpression(EObject context, XSwitchExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (feature=OpUnary operand=XUnaryOperation)
	 */
	protected void sequence_XUnaryOperation(EObject context, XUnaryOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XUNARY_OPERATION__FEATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XUNARY_OPERATION__FEATURE));
			if(transientValues.isValueTransient(semanticObject, LilPackage.Literals.XUNARY_OPERATION__OPERAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilPackage.Literals.XUNARY_OPERATION__OPERAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXUnaryOperationAccess().getFeatureOpUnaryParserRuleCall_0_1_0(), semanticObject.getFeature());
		feeder.accept(grammarAccess.getXUnaryOperationAccess().getOperandXUnaryOperationParserRuleCall_0_2_0(), semanticObject.getOperand());
		feeder.finish();
	}
}
