package com.crubier.lil.ui.syntaxcoloring;

import com.crubier.lil.ui.syntaxcoloring.HighlightingConfiguration;
import com.google.common.base.Objects;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

@SuppressWarnings("all")
public class TokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {
  protected String calculateId(final String tokenName, final int tokenType) {
    boolean _matched = false;
    if (!_matched) {
      if (Objects.equal(tokenName,"RULE_ML_COMMENT")) {
        _matched=true;
        return HighlightingConfiguration.COMMENT_ID;
      }
    }
    if (!_matched) {
      if (Objects.equal(tokenName,"RULE_SL_COMMENT")) {
        _matched=true;
        return HighlightingConfiguration.COMMENT_ID;
      }
    }
    if (!_matched) {
      if (Objects.equal(tokenName,"\'initialization\'")) {
        _matched=true;
        return null;
      }
    }
    if (!_matched) {
      boolean _startsWith = tokenName.startsWith("\'math.");
      if (_startsWith) {
        _matched=true;
        return null;
      }
    }
    if (!_matched) {
      boolean _and = false;
      boolean _startsWith_1 = tokenName.startsWith("\'");
      if (!_startsWith_1) {
        _and = false;
      } else {
        int _length = tokenName.length();
        boolean _greaterThan = (_length > 3);
        _and = (_startsWith_1 && _greaterThan);
      }
      if (_and) {
        _matched=true;
        return HighlightingConfiguration.KEYWORD_ID;
      }
    }
    return null;
  }
}
