package com.crubier.lil.ui.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper

class TokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	override protected calculateId(String tokenName, int tokenType) {
		//TODO Make it better
		
		
		switch tokenName {
			case "RULE_ML_COMMENT" : return HighlightingConfiguration.COMMENT_ID
			case "RULE_SL_COMMENT" : return HighlightingConfiguration.COMMENT_ID
			case "'initialization'" : return null
			case tokenName.startsWith("'math.") : return null
			case tokenName.startsWith("'") && tokenName.length > 3 : return HighlightingConfiguration.KEYWORD_ID
			default : return null
		}
		
		
	}

}
