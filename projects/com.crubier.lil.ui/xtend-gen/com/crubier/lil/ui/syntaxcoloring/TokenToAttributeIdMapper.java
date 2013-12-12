package com.crubier.lil.ui.syntaxcoloring;

import com.crubier.lil.ui.syntaxcoloring.HighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

@SuppressWarnings("all")
public class TokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {
  protected String calculateId(final String tokenName, final int tokenType) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _startsWith = tokenName.startsWith("\'");
    if (!_startsWith) {
      _and_1 = false;
    } else {
      int _length = tokenName.length();
      boolean _greaterThan = (_length > 3);
      _and_1 = (_startsWith && _greaterThan);
    }
    if (!_and_1) {
      _and = false;
    } else {
      boolean _startsWith_1 = tokenName.startsWith("math");
      boolean _not = (!_startsWith_1);
      _and = (_and_1 && _not);
    }
    if (_and) {
      return HighlightingConfiguration.KEYWORD_ID;
    } else {
      boolean _or = false;
      boolean _equals = tokenName.equals("RULE_ML_COMMENT");
      if (_equals) {
        _or = true;
      } else {
        boolean _equals_1 = tokenName.equals("RULE_SL_COMMENT");
        _or = (_equals || _equals_1);
      }
      if (_or) {
        return HighlightingConfiguration.COMMENT_ID;
      } else {
        return null;
      }
    }
  }
}
