package com.crubier.lil.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class HighlightingConfiguration implements IHighlightingConfiguration {
  public final static String KEYWORD_ID = "Keyword";
  
  public final static String COMMENT_ID = "Comment";
  
  public final static String INTERACTOR_ID = "Interactor";
  
  public void addType(final IHighlightingConfigurationAcceptor acceptor, final String s, final int r, final int g, final int b, final int style) {
    TextStyle _textStyle = new TextStyle();
    final TextStyle textStyle = _textStyle;
    RGB _rGB = new RGB(255, 255, 255);
    textStyle.setBackgroundColor(_rGB);
    RGB _rGB_1 = new RGB(r, g, b);
    textStyle.setColor(_rGB_1);
    textStyle.setStyle(style);
    acceptor.acceptDefaultHighlighting(s, s, textStyle);
  }
  
  public void configure(final IHighlightingConfigurationAcceptor acceptor) {
    this.addType(acceptor, HighlightingConfiguration.KEYWORD_ID, 127, 0, 85, SWT.BOLD);
    this.addType(acceptor, HighlightingConfiguration.COMMENT_ID, 31, 127, 31, SWT.BOLD);
    this.addType(acceptor, HighlightingConfiguration.INTERACTOR_ID, 255, 0, 255, SWT.BOLD);
  }
}
