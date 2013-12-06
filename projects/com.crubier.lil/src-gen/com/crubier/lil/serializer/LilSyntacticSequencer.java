package com.crubier.lil.serializer;

import com.crubier.lil.services.LilGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LilSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LilGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ExpressionParenthesized_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_ExpressionParenthesized_LeftParenthesisKeyword_0_p;
	protected AbstractElementAlias match_LiteralTime_MKeyword_1_5_1_0_or_MinuteKeyword_1_5_1_1;
	protected AbstractElementAlias match_LiteralTime_MKeyword_2_4_1_0_or_MinuteKeyword_2_4_1_1;
	protected AbstractElementAlias match_LiteralTime_MKeyword_3_3_1_0_or_MinuteKeyword_3_3_1_1;
	protected AbstractElementAlias match_LiteralTime_MKeyword_4_2_1_0_or_MinuteKeyword_4_2_1_1;
	protected AbstractElementAlias match_LiteralTime_MKeyword_5_1_1_0_or_MinuteKeyword_5_1_1_1;
	protected AbstractElementAlias match_LiteralTime_SKeyword_1_6_1_0_or_SecondKeyword_1_6_1_1;
	protected AbstractElementAlias match_LiteralTime_SKeyword_2_5_1_0_or_SecondKeyword_2_5_1_1;
	protected AbstractElementAlias match_LiteralTime_SKeyword_3_4_1_0_or_SecondKeyword_3_4_1_1;
	protected AbstractElementAlias match_LiteralTime_SKeyword_4_3_1_0_or_SecondKeyword_4_3_1_1;
	protected AbstractElementAlias match_LiteralTime_SKeyword_5_2_1_0_or_SecondKeyword_5_2_1_1;
	protected AbstractElementAlias match_LiteralTime_SKeyword_6_1_1_0_or_SecondKeyword_6_1_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LilGrammarAccess) access;
		match_ExpressionParenthesized_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getExpressionParenthesizedAccess().getLeftParenthesisKeyword_0());
		match_ExpressionParenthesized_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getExpressionParenthesizedAccess().getLeftParenthesisKeyword_0());
		match_LiteralTime_MKeyword_1_5_1_0_or_MinuteKeyword_1_5_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getMKeyword_1_5_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_1_5_1_1()));
		match_LiteralTime_MKeyword_2_4_1_0_or_MinuteKeyword_2_4_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getMKeyword_2_4_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_2_4_1_1()));
		match_LiteralTime_MKeyword_3_3_1_0_or_MinuteKeyword_3_3_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getMKeyword_3_3_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_3_3_1_1()));
		match_LiteralTime_MKeyword_4_2_1_0_or_MinuteKeyword_4_2_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getMKeyword_4_2_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_4_2_1_1()));
		match_LiteralTime_MKeyword_5_1_1_0_or_MinuteKeyword_5_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getMKeyword_5_1_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getMinuteKeyword_5_1_1_1()));
		match_LiteralTime_SKeyword_1_6_1_0_or_SecondKeyword_1_6_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSKeyword_1_6_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSecondKeyword_1_6_1_1()));
		match_LiteralTime_SKeyword_2_5_1_0_or_SecondKeyword_2_5_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSKeyword_2_5_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSecondKeyword_2_5_1_1()));
		match_LiteralTime_SKeyword_3_4_1_0_or_SecondKeyword_3_4_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSKeyword_3_4_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSecondKeyword_3_4_1_1()));
		match_LiteralTime_SKeyword_4_3_1_0_or_SecondKeyword_4_3_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSKeyword_4_3_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSecondKeyword_4_3_1_1()));
		match_LiteralTime_SKeyword_5_2_1_0_or_SecondKeyword_5_2_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSKeyword_5_2_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSecondKeyword_5_2_1_1()));
		match_LiteralTime_SKeyword_6_1_1_0_or_SecondKeyword_6_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSKeyword_6_1_1_0()), new TokenAlias(false, false, grammarAccess.getLiteralTimeAccess().getSecondKeyword_6_1_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ExpressionParenthesized_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_ExpressionParenthesized_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ExpressionParenthesized_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_ExpressionParenthesized_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_MKeyword_1_5_1_0_or_MinuteKeyword_1_5_1_1.equals(syntax))
				emit_LiteralTime_MKeyword_1_5_1_0_or_MinuteKeyword_1_5_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_MKeyword_2_4_1_0_or_MinuteKeyword_2_4_1_1.equals(syntax))
				emit_LiteralTime_MKeyword_2_4_1_0_or_MinuteKeyword_2_4_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_MKeyword_3_3_1_0_or_MinuteKeyword_3_3_1_1.equals(syntax))
				emit_LiteralTime_MKeyword_3_3_1_0_or_MinuteKeyword_3_3_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_MKeyword_4_2_1_0_or_MinuteKeyword_4_2_1_1.equals(syntax))
				emit_LiteralTime_MKeyword_4_2_1_0_or_MinuteKeyword_4_2_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_MKeyword_5_1_1_0_or_MinuteKeyword_5_1_1_1.equals(syntax))
				emit_LiteralTime_MKeyword_5_1_1_0_or_MinuteKeyword_5_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_SKeyword_1_6_1_0_or_SecondKeyword_1_6_1_1.equals(syntax))
				emit_LiteralTime_SKeyword_1_6_1_0_or_SecondKeyword_1_6_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_SKeyword_2_5_1_0_or_SecondKeyword_2_5_1_1.equals(syntax))
				emit_LiteralTime_SKeyword_2_5_1_0_or_SecondKeyword_2_5_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_SKeyword_3_4_1_0_or_SecondKeyword_3_4_1_1.equals(syntax))
				emit_LiteralTime_SKeyword_3_4_1_0_or_SecondKeyword_3_4_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_SKeyword_4_3_1_0_or_SecondKeyword_4_3_1_1.equals(syntax))
				emit_LiteralTime_SKeyword_4_3_1_0_or_SecondKeyword_4_3_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_SKeyword_5_2_1_0_or_SecondKeyword_5_2_1_1.equals(syntax))
				emit_LiteralTime_SKeyword_5_2_1_0_or_SecondKeyword_5_2_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralTime_SKeyword_6_1_1_0_or_SecondKeyword_6_1_1_1.equals(syntax))
				emit_LiteralTime_SKeyword_6_1_1_0_or_SecondKeyword_6_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_ExpressionParenthesized_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_ExpressionParenthesized_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'minute' | 'm'
	 */
	protected void emit_LiteralTime_MKeyword_1_5_1_0_or_MinuteKeyword_1_5_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'm' | 'minute'
	 */
	protected void emit_LiteralTime_MKeyword_2_4_1_0_or_MinuteKeyword_2_4_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'm' | 'minute'
	 */
	protected void emit_LiteralTime_MKeyword_3_3_1_0_or_MinuteKeyword_3_3_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'm' | 'minute'
	 */
	protected void emit_LiteralTime_MKeyword_4_2_1_0_or_MinuteKeyword_4_2_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'minute' | 'm'
	 */
	protected void emit_LiteralTime_MKeyword_5_1_1_0_or_MinuteKeyword_5_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     's' | 'second'
	 */
	protected void emit_LiteralTime_SKeyword_1_6_1_0_or_SecondKeyword_1_6_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'second' | 's'
	 */
	protected void emit_LiteralTime_SKeyword_2_5_1_0_or_SecondKeyword_2_5_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     's' | 'second'
	 */
	protected void emit_LiteralTime_SKeyword_3_4_1_0_or_SecondKeyword_3_4_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     's' | 'second'
	 */
	protected void emit_LiteralTime_SKeyword_4_3_1_0_or_SecondKeyword_4_3_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     's' | 'second'
	 */
	protected void emit_LiteralTime_SKeyword_5_2_1_0_or_SecondKeyword_5_2_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     's' | 'second'
	 */
	protected void emit_LiteralTime_SKeyword_6_1_1_0_or_SecondKeyword_6_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
