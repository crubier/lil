/*
* generated by Xtext
*/
package com.crubier.lil.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.crubier.lil.services.LilGrammarAccess;

public class LilParser extends AbstractContentAssistParser {
	
	@Inject
	private LilGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.crubier.lil.ui.contentassist.antlr.internal.InternalLilParser createParser() {
		com.crubier.lil.ui.contentassist.antlr.internal.InternalLilParser result = new com.crubier.lil.ui.contentassist.antlr.internal.InternalLilParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getLilModelAccess().getAlternatives(), "rule__LilModel__Alternatives");
					put(grammarAccess.getInteractorDeclarationAccess().getAlternatives_3(), "rule__InteractorDeclaration__Alternatives_3");
					put(grammarAccess.getAccessibleEntityAccess().getAlternatives(), "rule__AccessibleEntity__Alternatives");
					put(grammarAccess.getAccessibleEntityAccess().getGenericAlternatives_0_0(), "rule__AccessibleEntity__GenericAlternatives_0_0");
					put(grammarAccess.getEntityDeclarationAccess().getAlternatives(), "rule__EntityDeclaration__Alternatives");
					put(grammarAccess.getEventReceptionAccess().getAlternatives(), "rule__EventReception__Alternatives");
					put(grammarAccess.getSignalDeclarationAccess().getAlternatives(), "rule__SignalDeclaration__Alternatives");
					put(grammarAccess.getCauseAccess().getAlternatives(), "rule__Cause__Alternatives");
					put(grammarAccess.getEffectAccess().getAlternatives(), "rule__Effect__Alternatives");
					put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
					put(grammarAccess.getDataTypeBaseAccess().getAlternatives(), "rule__DataTypeBase__Alternatives");
					put(grammarAccess.getOpEqualityAccess().getAlternatives(), "rule__OpEquality__Alternatives");
					put(grammarAccess.getOpCompareAccess().getAlternatives(), "rule__OpCompare__Alternatives");
					put(grammarAccess.getOpOtherAccess().getAlternatives(), "rule__OpOther__Alternatives");
					put(grammarAccess.getOpAddAccess().getAlternatives(), "rule__OpAdd__Alternatives");
					put(grammarAccess.getOpMultiAccess().getAlternatives(), "rule__OpMulti__Alternatives");
					put(grammarAccess.getXUnaryOperationAccess().getAlternatives(), "rule__XUnaryOperation__Alternatives");
					put(grammarAccess.getOpUnaryAccess().getAlternatives(), "rule__OpUnary__Alternatives");
					put(grammarAccess.getXPrimaryExpressionAccess().getAlternatives(), "rule__XPrimaryExpression__Alternatives");
					put(grammarAccess.getXLiteralAccess().getAlternatives(), "rule__XLiteral__Alternatives");
					put(grammarAccess.getXCollectionLiteralAccess().getAlternatives(), "rule__XCollectionLiteral__Alternatives");
					put(grammarAccess.getBuiltInFunctionAccess().getAlternatives(), "rule__BuiltInFunction__Alternatives");
					put(grammarAccess.getXBooleanLiteralAccess().getAlternatives_1(), "rule__XBooleanLiteral__Alternatives_1");
					put(grammarAccess.getInteractorDeclarationAccess().getGroup(), "rule__InteractorDeclaration__Group__0");
					put(grammarAccess.getActorDeclarationAccess().getGroup(), "rule__ActorDeclaration__Group__0");
					put(grammarAccess.getActorAliasAccess().getGroup(), "rule__ActorAlias__Group__0");
					put(grammarAccess.getComponentDeclarationAccess().getGroup(), "rule__ComponentDeclaration__Group__0");
					put(grammarAccess.getComponentDeclarationAccess().getGroup_2(), "rule__ComponentDeclaration__Group_2__0");
					put(grammarAccess.getComponentDeclarationAccess().getGroup_2_2(), "rule__ComponentDeclaration__Group_2_2__0");
					put(grammarAccess.getEventReceptionAccess().getGroup_0(), "rule__EventReception__Group_0__0");
					put(grammarAccess.getEventReceptionAccess().getGroup_0_1(), "rule__EventReception__Group_0_1__0");
					put(grammarAccess.getFlowReceptionAccess().getGroup(), "rule__FlowReception__Group__0");
					put(grammarAccess.getFlowReceptionAccess().getGroup_1(), "rule__FlowReception__Group_1__0");
					put(grammarAccess.getEventEmissionAccess().getGroup(), "rule__EventEmission__Group__0");
					put(grammarAccess.getEventEmissionAccess().getGroup_1(), "rule__EventEmission__Group_1__0");
					put(grammarAccess.getFlowEmissionAccess().getGroup(), "rule__FlowEmission__Group__0");
					put(grammarAccess.getFlowEmissionAccess().getGroup_1(), "rule__FlowEmission__Group_1__0");
					put(grammarAccess.getEventDeclarationAccess().getGroup(), "rule__EventDeclaration__Group__0");
					put(grammarAccess.getEventDeclarationAccess().getGroup_3(), "rule__EventDeclaration__Group_3__0");
					put(grammarAccess.getEventDeclarationAccess().getGroup_4(), "rule__EventDeclaration__Group_4__0");
					put(grammarAccess.getFlowDeclarationAccess().getGroup(), "rule__FlowDeclaration__Group__0");
					put(grammarAccess.getFlowDeclarationAccess().getGroup_3(), "rule__FlowDeclaration__Group_3__0");
					put(grammarAccess.getFlowDeclarationAccess().getGroup_4(), "rule__FlowDeclaration__Group_4__0");
					put(grammarAccess.getBehaviorDeclarationAccess().getGroup(), "rule__BehaviorDeclaration__Group__0");
					put(grammarAccess.getOnCauseAccess().getGroup(), "rule__OnCause__Group__0");
					put(grammarAccess.getOnCauseAccess().getGroup_2(), "rule__OnCause__Group_2__0");
					put(grammarAccess.getWhenCauseAccess().getGroup(), "rule__WhenCause__Group__0");
					put(grammarAccess.getWhenCauseAccess().getGroup_2(), "rule__WhenCause__Group_2__0");
					put(grammarAccess.getAlwaysEffectAccess().getGroup(), "rule__AlwaysEffect__Group__0");
					put(grammarAccess.getSetEffectAccess().getGroup(), "rule__SetEffect__Group__0");
					put(grammarAccess.getTriggerEffectAccess().getGroup(), "rule__TriggerEffect__Group__0");
					put(grammarAccess.getDataTypeCompoundDeclarationAccess().getGroup(), "rule__DataTypeCompoundDeclaration__Group__0");
					put(grammarAccess.getDataTypeCompoundFieldAccess().getGroup(), "rule__DataTypeCompoundField__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup_0(), "rule__DataType__Group_0__0");
					put(grammarAccess.getDataTypeAccess().getGroup_1(), "rule__DataType__Group_1__0");
					put(grammarAccess.getXOrExpressionAccess().getGroup(), "rule__XOrExpression__Group__0");
					put(grammarAccess.getXOrExpressionAccess().getGroup_1(), "rule__XOrExpression__Group_1__0");
					put(grammarAccess.getXOrExpressionAccess().getGroup_1_0(), "rule__XOrExpression__Group_1_0__0");
					put(grammarAccess.getXOrExpressionAccess().getGroup_1_0_0(), "rule__XOrExpression__Group_1_0_0__0");
					put(grammarAccess.getXAndExpressionAccess().getGroup(), "rule__XAndExpression__Group__0");
					put(grammarAccess.getXAndExpressionAccess().getGroup_1(), "rule__XAndExpression__Group_1__0");
					put(grammarAccess.getXAndExpressionAccess().getGroup_1_0(), "rule__XAndExpression__Group_1_0__0");
					put(grammarAccess.getXAndExpressionAccess().getGroup_1_0_0(), "rule__XAndExpression__Group_1_0_0__0");
					put(grammarAccess.getXEqualityExpressionAccess().getGroup(), "rule__XEqualityExpression__Group__0");
					put(grammarAccess.getXEqualityExpressionAccess().getGroup_1(), "rule__XEqualityExpression__Group_1__0");
					put(grammarAccess.getXEqualityExpressionAccess().getGroup_1_0(), "rule__XEqualityExpression__Group_1_0__0");
					put(grammarAccess.getXEqualityExpressionAccess().getGroup_1_0_0(), "rule__XEqualityExpression__Group_1_0_0__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup(), "rule__XRelationalExpression__Group__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup_1(), "rule__XRelationalExpression__Group_1__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup_1_0(), "rule__XRelationalExpression__Group_1_0__0");
					put(grammarAccess.getXRelationalExpressionAccess().getGroup_1_0_0(), "rule__XRelationalExpression__Group_1_0_0__0");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getGroup(), "rule__XOtherOperatorExpression__Group__0");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getGroup_1(), "rule__XOtherOperatorExpression__Group_1__0");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getGroup_1_0(), "rule__XOtherOperatorExpression__Group_1_0__0");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getGroup_1_0_0(), "rule__XOtherOperatorExpression__Group_1_0_0__0");
					put(grammarAccess.getXAdditiveExpressionAccess().getGroup(), "rule__XAdditiveExpression__Group__0");
					put(grammarAccess.getXAdditiveExpressionAccess().getGroup_1(), "rule__XAdditiveExpression__Group_1__0");
					put(grammarAccess.getXAdditiveExpressionAccess().getGroup_1_0(), "rule__XAdditiveExpression__Group_1_0__0");
					put(grammarAccess.getXAdditiveExpressionAccess().getGroup_1_0_0(), "rule__XAdditiveExpression__Group_1_0_0__0");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getGroup(), "rule__XMultiplicativeExpression__Group__0");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getGroup_1(), "rule__XMultiplicativeExpression__Group_1__0");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getGroup_1_0(), "rule__XMultiplicativeExpression__Group_1_0__0");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getGroup_1_0_0(), "rule__XMultiplicativeExpression__Group_1_0_0__0");
					put(grammarAccess.getXUnaryOperationAccess().getGroup_0(), "rule__XUnaryOperation__Group_0__0");
					put(grammarAccess.getXSetLiteralAccess().getGroup(), "rule__XSetLiteral__Group__0");
					put(grammarAccess.getXSetLiteralAccess().getGroup_2(), "rule__XSetLiteral__Group_2__0");
					put(grammarAccess.getXSetLiteralAccess().getGroup_2_1(), "rule__XSetLiteral__Group_2_1__0");
					put(grammarAccess.getXListLiteralAccess().getGroup(), "rule__XListLiteral__Group__0");
					put(grammarAccess.getXListLiteralAccess().getGroup_2(), "rule__XListLiteral__Group_2__0");
					put(grammarAccess.getXListLiteralAccess().getGroup_2_1(), "rule__XListLiteral__Group_2_1__0");
					put(grammarAccess.getXParenthesizedExpressionAccess().getGroup(), "rule__XParenthesizedExpression__Group__0");
					put(grammarAccess.getXIfExpressionAccess().getGroup(), "rule__XIfExpression__Group__0");
					put(grammarAccess.getXIfExpressionAccess().getGroup_6(), "rule__XIfExpression__Group_6__0");
					put(grammarAccess.getXSwitchExpressionAccess().getGroup(), "rule__XSwitchExpression__Group__0");
					put(grammarAccess.getXSwitchExpressionAccess().getGroup_6(), "rule__XSwitchExpression__Group_6__0");
					put(grammarAccess.getXCasePartAccess().getGroup(), "rule__XCasePart__Group__0");
					put(grammarAccess.getXForEachExpressionAccess().getGroup(), "rule__XForEachExpression__Group__0");
					put(grammarAccess.getXFunctionCallExpressionAccess().getGroup(), "rule__XFunctionCallExpression__Group__0");
					put(grammarAccess.getXFunctionCallExpressionAccess().getGroup_4(), "rule__XFunctionCallExpression__Group_4__0");
					put(grammarAccess.getXBooleanLiteralAccess().getGroup(), "rule__XBooleanLiteral__Group__0");
					put(grammarAccess.getXNullLiteralAccess().getGroup(), "rule__XNullLiteral__Group__0");
					put(grammarAccess.getXNumberLiteralAccess().getGroup(), "rule__XNumberLiteral__Group__0");
					put(grammarAccess.getXStringLiteralAccess().getGroup(), "rule__XStringLiteral__Group__0");
					put(grammarAccess.getNUMBERAccess().getGroup(), "rule__NUMBER__Group__0");
					put(grammarAccess.getNUMBERAccess().getGroup_1(), "rule__NUMBER__Group_1__0");
					put(grammarAccess.getLilModelAccess().getInteractorsAssignment_0(), "rule__LilModel__InteractorsAssignment_0");
					put(grammarAccess.getLilModelAccess().getDataTypesAssignment_1(), "rule__LilModel__DataTypesAssignment_1");
					put(grammarAccess.getInteractorDeclarationAccess().getNameAssignment_1(), "rule__InteractorDeclaration__NameAssignment_1");
					put(grammarAccess.getInteractorDeclarationAccess().getEntitiesAssignment_3_0(), "rule__InteractorDeclaration__EntitiesAssignment_3_0");
					put(grammarAccess.getInteractorDeclarationAccess().getSignalsAssignment_3_1(), "rule__InteractorDeclaration__SignalsAssignment_3_1");
					put(grammarAccess.getInteractorDeclarationAccess().getBehaviorsAssignment_3_2(), "rule__InteractorDeclaration__BehaviorsAssignment_3_2");
					put(grammarAccess.getAccessibleEntityAccess().getGenericAssignment_0(), "rule__AccessibleEntity__GenericAssignment_0");
					put(grammarAccess.getAccessibleEntityAccess().getSpecificAssignment_1(), "rule__AccessibleEntity__SpecificAssignment_1");
					put(grammarAccess.getEntityAccess().getInstanceAssignment(), "rule__Entity__InstanceAssignment");
					put(grammarAccess.getActorAccess().getInstanceAssignment(), "rule__Actor__InstanceAssignment");
					put(grammarAccess.getComponentAccess().getInstanceAssignment(), "rule__Component__InstanceAssignment");
					put(grammarAccess.getActorDeclarationAccess().getNameAssignment_1(), "rule__ActorDeclaration__NameAssignment_1");
					put(grammarAccess.getActorAliasAccess().getSourceAssignment_0(), "rule__ActorAlias__SourceAssignment_0");
					put(grammarAccess.getActorAliasAccess().getRemoteAssignment_2(), "rule__ActorAlias__RemoteAssignment_2");
					put(grammarAccess.getComponentDeclarationAccess().getInteractorAssignment_0(), "rule__ComponentDeclaration__InteractorAssignment_0");
					put(grammarAccess.getComponentDeclarationAccess().getNameAssignment_1(), "rule__ComponentDeclaration__NameAssignment_1");
					put(grammarAccess.getComponentDeclarationAccess().getAliasesAssignment_2_1(), "rule__ComponentDeclaration__AliasesAssignment_2_1");
					put(grammarAccess.getComponentDeclarationAccess().getAliasesAssignment_2_2_1(), "rule__ComponentDeclaration__AliasesAssignment_2_2_1");
					put(grammarAccess.getEventReceptionAccess().getInstanceAssignment_0_0(), "rule__EventReception__InstanceAssignment_0_0");
					put(grammarAccess.getEventReceptionAccess().getSourceAssignment_0_1_1(), "rule__EventReception__SourceAssignment_0_1_1");
					put(grammarAccess.getEventReceptionAccess().getBaseAssignment_1(), "rule__EventReception__BaseAssignment_1");
					put(grammarAccess.getFlowReceptionAccess().getInstanceAssignment_0(), "rule__FlowReception__InstanceAssignment_0");
					put(grammarAccess.getFlowReceptionAccess().getSourceAssignment_1_1(), "rule__FlowReception__SourceAssignment_1_1");
					put(grammarAccess.getEventEmissionAccess().getInstanceAssignment_0(), "rule__EventEmission__InstanceAssignment_0");
					put(grammarAccess.getEventEmissionAccess().getDestinationAssignment_1_1(), "rule__EventEmission__DestinationAssignment_1_1");
					put(grammarAccess.getFlowEmissionAccess().getInstanceAssignment_0(), "rule__FlowEmission__InstanceAssignment_0");
					put(grammarAccess.getFlowEmissionAccess().getDestinationAssignment_1_1(), "rule__FlowEmission__DestinationAssignment_1_1");
					put(grammarAccess.getEventDeclarationAccess().getTypeAssignment_0(), "rule__EventDeclaration__TypeAssignment_0");
					put(grammarAccess.getEventDeclarationAccess().getNameAssignment_2(), "rule__EventDeclaration__NameAssignment_2");
					put(grammarAccess.getEventDeclarationAccess().getSourceAssignment_3_1(), "rule__EventDeclaration__SourceAssignment_3_1");
					put(grammarAccess.getEventDeclarationAccess().getDestinationsAssignment_4_1(), "rule__EventDeclaration__DestinationsAssignment_4_1");
					put(grammarAccess.getFlowDeclarationAccess().getTypeAssignment_0(), "rule__FlowDeclaration__TypeAssignment_0");
					put(grammarAccess.getFlowDeclarationAccess().getNameAssignment_2(), "rule__FlowDeclaration__NameAssignment_2");
					put(grammarAccess.getFlowDeclarationAccess().getSourceAssignment_3_1(), "rule__FlowDeclaration__SourceAssignment_3_1");
					put(grammarAccess.getFlowDeclarationAccess().getDestinationsAssignment_4_1(), "rule__FlowDeclaration__DestinationsAssignment_4_1");
					put(grammarAccess.getBehaviorDeclarationAccess().getCauseAssignment_0(), "rule__BehaviorDeclaration__CauseAssignment_0");
					put(grammarAccess.getBehaviorDeclarationAccess().getEffectsAssignment_2(), "rule__BehaviorDeclaration__EffectsAssignment_2");
					put(grammarAccess.getOnCauseAccess().getEventAssignment_1(), "rule__OnCause__EventAssignment_1");
					put(grammarAccess.getOnCauseAccess().getGuardAssignment_2_1(), "rule__OnCause__GuardAssignment_2_1");
					put(grammarAccess.getWhenCauseAccess().getConditionAssignment_1(), "rule__WhenCause__ConditionAssignment_1");
					put(grammarAccess.getWhenCauseAccess().getGuardAssignment_2_1(), "rule__WhenCause__GuardAssignment_2_1");
					put(grammarAccess.getAlwaysEffectAccess().getTargetAssignment_1(), "rule__AlwaysEffect__TargetAssignment_1");
					put(grammarAccess.getAlwaysEffectAccess().getValueAssignment_3(), "rule__AlwaysEffect__ValueAssignment_3");
					put(grammarAccess.getSetEffectAccess().getTargetAssignment_1(), "rule__SetEffect__TargetAssignment_1");
					put(grammarAccess.getSetEffectAccess().getValueAssignment_3(), "rule__SetEffect__ValueAssignment_3");
					put(grammarAccess.getTriggerEffectAccess().getTargetAssignment_1(), "rule__TriggerEffect__TargetAssignment_1");
					put(grammarAccess.getTriggerEffectAccess().getValueAssignment_3(), "rule__TriggerEffect__ValueAssignment_3");
					put(grammarAccess.getDataTypeCompoundDeclarationAccess().getNameAssignment_1(), "rule__DataTypeCompoundDeclaration__NameAssignment_1");
					put(grammarAccess.getDataTypeCompoundDeclarationAccess().getFieldsAssignment_3(), "rule__DataTypeCompoundDeclaration__FieldsAssignment_3");
					put(grammarAccess.getDataTypeCompoundFieldAccess().getTypeAssignment_0(), "rule__DataTypeCompoundField__TypeAssignment_0");
					put(grammarAccess.getDataTypeCompoundFieldAccess().getNameAssignment_1(), "rule__DataTypeCompoundField__NameAssignment_1");
					put(grammarAccess.getDataTypeAccess().getTypeAssignment_0_1(), "rule__DataType__TypeAssignment_0_1");
					put(grammarAccess.getDataTypeAccess().getTypeAssignment_1_1(), "rule__DataType__TypeAssignment_1_1");
					put(grammarAccess.getXOrExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XOrExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXOrExpressionAccess().getRightOperandAssignment_1_1(), "rule__XOrExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXAndExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XAndExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXAndExpressionAccess().getRightOperandAssignment_1_1(), "rule__XAndExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXEqualityExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XEqualityExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXEqualityExpressionAccess().getRightOperandAssignment_1_1(), "rule__XEqualityExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXRelationalExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XRelationalExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXRelationalExpressionAccess().getRightOperandAssignment_1_1(), "rule__XRelationalExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XOtherOperatorExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandAssignment_1_1(), "rule__XOtherOperatorExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXAdditiveExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XAdditiveExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXAdditiveExpressionAccess().getRightOperandAssignment_1_1(), "rule__XAdditiveExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureAssignment_1_0_0_1(), "rule__XMultiplicativeExpression__FeatureAssignment_1_0_0_1");
					put(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandAssignment_1_1(), "rule__XMultiplicativeExpression__RightOperandAssignment_1_1");
					put(grammarAccess.getXUnaryOperationAccess().getFeatureAssignment_0_1(), "rule__XUnaryOperation__FeatureAssignment_0_1");
					put(grammarAccess.getXUnaryOperationAccess().getOperandAssignment_0_2(), "rule__XUnaryOperation__OperandAssignment_0_2");
					put(grammarAccess.getXSetLiteralAccess().getElementsAssignment_2_0(), "rule__XSetLiteral__ElementsAssignment_2_0");
					put(grammarAccess.getXSetLiteralAccess().getElementsAssignment_2_1_1(), "rule__XSetLiteral__ElementsAssignment_2_1_1");
					put(grammarAccess.getXListLiteralAccess().getElementsAssignment_2_0(), "rule__XListLiteral__ElementsAssignment_2_0");
					put(grammarAccess.getXListLiteralAccess().getElementsAssignment_2_1_1(), "rule__XListLiteral__ElementsAssignment_2_1_1");
					put(grammarAccess.getXIfExpressionAccess().getIfAssignment_3(), "rule__XIfExpression__IfAssignment_3");
					put(grammarAccess.getXIfExpressionAccess().getThenAssignment_5(), "rule__XIfExpression__ThenAssignment_5");
					put(grammarAccess.getXIfExpressionAccess().getElseAssignment_6_1(), "rule__XIfExpression__ElseAssignment_6_1");
					put(grammarAccess.getXSwitchExpressionAccess().getSwitchAssignment_3(), "rule__XSwitchExpression__SwitchAssignment_3");
					put(grammarAccess.getXSwitchExpressionAccess().getCasesAssignment_5(), "rule__XSwitchExpression__CasesAssignment_5");
					put(grammarAccess.getXSwitchExpressionAccess().getDefaultAssignment_6_2(), "rule__XSwitchExpression__DefaultAssignment_6_2");
					put(grammarAccess.getXCasePartAccess().getCaseAssignment_1(), "rule__XCasePart__CaseAssignment_1");
					put(grammarAccess.getXCasePartAccess().getThenAssignment_3(), "rule__XCasePart__ThenAssignment_3");
					put(grammarAccess.getXForEachExpressionAccess().getForExpressionAssignment_4(), "rule__XForEachExpression__ForExpressionAssignment_4");
					put(grammarAccess.getXForEachExpressionAccess().getEachExpressionAssignment_6(), "rule__XForEachExpression__EachExpressionAssignment_6");
					put(grammarAccess.getXFunctionCallExpressionAccess().getFunctionAssignment_1(), "rule__XFunctionCallExpression__FunctionAssignment_1");
					put(grammarAccess.getXFunctionCallExpressionAccess().getArgumentsAssignment_3(), "rule__XFunctionCallExpression__ArgumentsAssignment_3");
					put(grammarAccess.getXFunctionCallExpressionAccess().getArgumentsAssignment_4_1(), "rule__XFunctionCallExpression__ArgumentsAssignment_4_1");
					put(grammarAccess.getXBooleanLiteralAccess().getIsTrueAssignment_1_1(), "rule__XBooleanLiteral__IsTrueAssignment_1_1");
					put(grammarAccess.getXNumberLiteralAccess().getValueAssignment_1(), "rule__XNumberLiteral__ValueAssignment_1");
					put(grammarAccess.getXStringLiteralAccess().getValueAssignment_1(), "rule__XStringLiteral__ValueAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.crubier.lil.ui.contentassist.antlr.internal.InternalLilParser typedParser = (com.crubier.lil.ui.contentassist.antlr.internal.InternalLilParser) parser;
			typedParser.entryRuleLilModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LilGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LilGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
