package com.crubier.lil.ui.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper

class TokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	override protected calculateId(String tokenName, int tokenType) {
		//TODO Make it better
		if (tokenName.startsWith("'") && tokenName.length > 3)
			return HighlightingConfiguration.KEYWORD_ID
		else
			return null
	}

}
