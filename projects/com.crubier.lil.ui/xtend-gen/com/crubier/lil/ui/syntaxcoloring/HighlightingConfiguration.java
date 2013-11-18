package com.crubier.lil.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class HighlightingConfiguration implements IHighlightingConfiguration {
  public final static String KEYWORD_ID = "keyword";
  
  public final static String COMMENT_ID = "comment";
  
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    InputOutput.<String>println("coloring");
    TextStyle _keywordTextStyle = this.keywordTextStyle();
    acceptor.acceptDefaultHighlighting(HighlightingConfiguration.KEYWORD_ID, "Keyword", _keywordTextStyle);
    TextStyle _keywordTextStyle_1 = this.keywordTextStyle();
    acceptor.acceptDefaultHighlighting(HighlightingConfiguration.COMMENT_ID, "Comment", _keywordTextStyle_1);
  }
  
  public TextStyle keywordTextStyle() {
    TextStyle _textStyle = new TextStyle();
    final TextStyle textStyle = _textStyle;
    RGB _rGB = new RGB(127, 200, 85);
    textStyle.setColor(_rGB);
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
}
