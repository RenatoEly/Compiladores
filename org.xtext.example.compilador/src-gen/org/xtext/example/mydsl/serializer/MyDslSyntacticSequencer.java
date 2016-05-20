/*
 * generated by Xtext 2.9.2
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_compound_statement___LeftCurlyBracketKeyword_0_0_RightCurlyBracketKeyword_0_1___or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__;
	protected AbstractElementAlias match_direct_abstract_declarator2___LeftParenthesisKeyword_8_0_RightParenthesisKeyword_8_1___or___LeftSquareBracketKeyword_0_0_RightSquareBracketKeyword_0_1___or___LeftSquareBracketKeyword_1_0_AsteriskKeyword_1_1_RightSquareBracketKeyword_1_2__;
	protected AbstractElementAlias match_direct_declarator2___LeftParenthesisKeyword_10_0_RightParenthesisKeyword_10_1___or___LeftSquareBracketKeyword_0_0_RightSquareBracketKeyword_0_1___or___LeftSquareBracketKeyword_1_0_AsteriskKeyword_1_1_RightSquareBracketKeyword_1_2__;
	protected AbstractElementAlias match_postfix_expression2_DEC_OPTerminalRuleCall_6_or_INC_OPTerminalRuleCall_5_or___FullStopKeyword_3_0_IDTerminalRuleCall_3_1___or___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1___or___PTR_OPTerminalRuleCall_4_0_IDTerminalRuleCall_4_1__;
	protected AbstractElementAlias match_primary_expression_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_primary_expression_LeftParenthesisKeyword_0_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_compound_statement___LeftCurlyBracketKeyword_0_0_RightCurlyBracketKeyword_0_1___or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompound_statementAccess().getLeftCurlyBracketKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCompound_statementAccess().getRightCurlyBracketKeyword_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompound_statementAccess().getLeftCurlyBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getCompound_statementAccess().getRightCurlyBracketKeyword_1_2())));
		match_direct_abstract_declarator2___LeftParenthesisKeyword_8_0_RightParenthesisKeyword_8_1___or___LeftSquareBracketKeyword_0_0_RightSquareBracketKeyword_0_1___or___LeftSquareBracketKeyword_1_0_AsteriskKeyword_1_1_RightSquareBracketKeyword_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDirect_abstract_declarator2Access().getLeftParenthesisKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getDirect_abstract_declarator2Access().getRightParenthesisKeyword_8_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDirect_abstract_declarator2Access().getLeftSquareBracketKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getDirect_abstract_declarator2Access().getRightSquareBracketKeyword_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDirect_abstract_declarator2Access().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDirect_abstract_declarator2Access().getAsteriskKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDirect_abstract_declarator2Access().getRightSquareBracketKeyword_1_2())));
		match_direct_declarator2___LeftParenthesisKeyword_10_0_RightParenthesisKeyword_10_1___or___LeftSquareBracketKeyword_0_0_RightSquareBracketKeyword_0_1___or___LeftSquareBracketKeyword_1_0_AsteriskKeyword_1_1_RightSquareBracketKeyword_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDirect_declarator2Access().getLeftParenthesisKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getDirect_declarator2Access().getRightParenthesisKeyword_10_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDirect_declarator2Access().getLeftSquareBracketKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getDirect_declarator2Access().getRightSquareBracketKeyword_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDirect_declarator2Access().getLeftSquareBracketKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getDirect_declarator2Access().getAsteriskKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDirect_declarator2Access().getRightSquareBracketKeyword_1_2())));
		match_postfix_expression2_DEC_OPTerminalRuleCall_6_or_INC_OPTerminalRuleCall_5_or___FullStopKeyword_3_0_IDTerminalRuleCall_3_1___or___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1___or___PTR_OPTerminalRuleCall_4_0_IDTerminalRuleCall_4_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPostfix_expression2Access().getFullStopKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getPostfix_expression2Access().getIDTerminalRuleCall_3_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPostfix_expression2Access().getLeftParenthesisKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getPostfix_expression2Access().getRightParenthesisKeyword_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getPostfix_expression2Access().getPTR_OPTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getPostfix_expression2Access().getIDTerminalRuleCall_4_1())), new TokenAlias(false, false, grammarAccess.getPostfix_expression2Access().getDEC_OPTerminalRuleCall_6()), new TokenAlias(false, false, grammarAccess.getPostfix_expression2Access().getINC_OPTerminalRuleCall_5()));
		match_primary_expression_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getPrimary_expressionAccess().getLeftParenthesisKeyword_0_0());
		match_primary_expression_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getPrimary_expressionAccess().getLeftParenthesisKeyword_0_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAND_OPRule())
			return getAND_OPToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDEC_OPRule())
			return getDEC_OPToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINC_OPRule())
			return getINC_OPToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOR_OPRule())
			return getOR_OPToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPTR_OPRule())
			return getPTR_OPToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal AND_OP:
	 * 	'&&'
	 * ;
	 */
	protected String getAND_OPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&&";
	}
	
	/**
	 * terminal DEC_OP:
	 * 	'--'
	 * ;
	 */
	protected String getDEC_OPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "--";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal INC_OP:
	 * 	'++'
	 * ;
	 */
	protected String getINC_OPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "++";
	}
	
	/**
	 * terminal OR_OP:
	 * 	'||'
	 * ;
	 */
	protected String getOR_OPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "||";
	}
	
	/**
	 * terminal PTR_OP:
	 * 	'->'
	 * ;
	 */
	protected String getPTR_OPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "->";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_compound_statement___LeftCurlyBracketKeyword_0_0_RightCurlyBracketKeyword_0_1___or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__.equals(syntax))
				emit_compound_statement___LeftCurlyBracketKeyword_0_0_RightCurlyBracketKeyword_0_1___or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_direct_abstract_declarator2___LeftParenthesisKeyword_8_0_RightParenthesisKeyword_8_1___or___LeftSquareBracketKeyword_0_0_RightSquareBracketKeyword_0_1___or___LeftSquareBracketKeyword_1_0_AsteriskKeyword_1_1_RightSquareBracketKeyword_1_2__.equals(syntax))
				emit_direct_abstract_declarator2___LeftParenthesisKeyword_8_0_RightParenthesisKeyword_8_1___or___LeftSquareBracketKeyword_0_0_RightSquareBracketKeyword_0_1___or___LeftSquareBracketKeyword_1_0_AsteriskKeyword_1_1_RightSquareBracketKeyword_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_direct_declarator2___LeftParenthesisKeyword_10_0_RightParenthesisKeyword_10_1___or___LeftSquareBracketKeyword_0_0_RightSquareBracketKeyword_0_1___or___LeftSquareBracketKeyword_1_0_AsteriskKeyword_1_1_RightSquareBracketKeyword_1_2__.equals(syntax))
				emit_direct_declarator2___LeftParenthesisKeyword_10_0_RightParenthesisKeyword_10_1___or___LeftSquareBracketKeyword_0_0_RightSquareBracketKeyword_0_1___or___LeftSquareBracketKeyword_1_0_AsteriskKeyword_1_1_RightSquareBracketKeyword_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_postfix_expression2_DEC_OPTerminalRuleCall_6_or_INC_OPTerminalRuleCall_5_or___FullStopKeyword_3_0_IDTerminalRuleCall_3_1___or___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1___or___PTR_OPTerminalRuleCall_4_0_IDTerminalRuleCall_4_1__.equals(syntax))
				emit_postfix_expression2_DEC_OPTerminalRuleCall_6_or_INC_OPTerminalRuleCall_5_or___FullStopKeyword_3_0_IDTerminalRuleCall_3_1___or___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1___or___PTR_OPTerminalRuleCall_4_0_IDTerminalRuleCall_4_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_primary_expression_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_primary_expression_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_primary_expression_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_primary_expression_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}') | ('{' '}')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_compound_statement___LeftCurlyBracketKeyword_0_0_RightCurlyBracketKeyword_0_1___or___LeftCurlyBracketKeyword_1_0_RightCurlyBracketKeyword_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' '*' ']') | ('[' ']') | ('(' ')')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_direct_abstract_declarator2___LeftParenthesisKeyword_8_0_RightParenthesisKeyword_8_1___or___LeftSquareBracketKeyword_0_0_RightSquareBracketKeyword_0_1___or___LeftSquareBracketKeyword_1_0_AsteriskKeyword_1_1_RightSquareBracketKeyword_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('[' '*' ']') | ('[' ']') | ('(' ')')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_direct_declarator2___LeftParenthesisKeyword_10_0_RightParenthesisKeyword_10_1___or___LeftSquareBracketKeyword_0_0_RightSquareBracketKeyword_0_1___or___LeftSquareBracketKeyword_1_0_AsteriskKeyword_1_1_RightSquareBracketKeyword_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')') | ('.' ID) | (PTR_OP ID) | INC_OP | DEC_OP
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_postfix_expression2_DEC_OPTerminalRuleCall_6_or_INC_OPTerminalRuleCall_5_or___FullStopKeyword_3_0_IDTerminalRuleCall_3_1___or___LeftParenthesisKeyword_1_0_RightParenthesisKeyword_1_1___or___PTR_OPTerminalRuleCall_4_0_IDTerminalRuleCall_4_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) value='false'
	 *     (rule start) (ambiguity) value='true'
	 *     (rule start) (ambiguity) value=F_CONSTANT
	 *     (rule start) (ambiguity) value=I_CONSTANT
	 *     (rule start) (ambiguity) value=string_nova
	 *     (rule start) (ambiguity) variable=[direct_declarator|ID]
	 *     (rule start) (ambiguity) {ADD.left=}
	 *     (rule start) (ambiguity) {AND.left=}
	 *     (rule start) (ambiguity) {EQL.left=}
	 *     (rule start) (ambiguity) {EXC_OR.left=}
	 *     (rule start) (ambiguity) {INC_OR.left=}
	 *     (rule start) (ambiguity) {LOG_AND.left=}
	 *     (rule start) (ambiguity) {LOG_OR.left=}
	 *     (rule start) (ambiguity) {MINUS.left=}
	 *     (rule start) (ambiguity) {MUL.left=}
	 *     (rule start) (ambiguity) {REL.left=}
	 *     (rule start) (ambiguity) {SHF.left=}
	 */
	protected void emit_primary_expression_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) {ADD.left=}
	 *     (rule start) (ambiguity) {AND.left=}
	 *     (rule start) (ambiguity) {EQL.left=}
	 *     (rule start) (ambiguity) {EXC_OR.left=}
	 *     (rule start) (ambiguity) {INC_OR.left=}
	 *     (rule start) (ambiguity) {LOG_AND.left=}
	 *     (rule start) (ambiguity) {LOG_OR.left=}
	 *     (rule start) (ambiguity) {MINUS.left=}
	 *     (rule start) (ambiguity) {MUL.left=}
	 *     (rule start) (ambiguity) {REL.left=}
	 *     (rule start) (ambiguity) {SHF.left=}
	 */
	protected void emit_primary_expression_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
