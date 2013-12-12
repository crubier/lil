package com.crubier.lil.ui.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper

class TokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	override protected calculateId(String tokenName, int tokenType) {
		//TODO Make it better
		if (tokenName.startsWith("'") && tokenName.length > 3 && !tokenName.startsWith("math"))
			return HighlightingConfiguration.KEYWORD_ID
		else if (tokenName.equals("RULE_ML_COMMENT") || tokenName.equals("RULE_SL_COMMENT"))
			return HighlightingConfiguration.COMMENT_ID
		else
			return null
	}

}
