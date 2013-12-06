package com.crubier.lil.ui.syntaxcoloring;

import com.crubier.lil.ui.syntaxcoloring.HighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

@SuppressWarnings("all")
public class TokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {
  protected String calculateId(final String tokenName, final int tokenType) {
    boolean _and = false;
    boolean _startsWith = tokenName.startsWith("\'");
    if (!_startsWith) {
      _and = false;
    } else {
      int _length = tokenName.length();
      boolean _greaterThan = (_length > 3);
      _and = (_startsWith && _greaterThan);
    }
    if (_and) {
      return HighlightingConfiguration.KEYWORD_ID;
    } else {
      return null;
    }
  }
}
