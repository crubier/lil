package com.crubier.lil.ui.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.SWT

class HighlightingConfiguration implements IHighlightingConfiguration {
 
  public static final String KEYWORD_ID = "keyword";
  public static final String COMMENT_ID = "comment";
 
 
 
 
// // provide an id string for the highlighting calculator
// String PARAM = "Parameter";
// String PARAM_VAL = "Parameter Value";
// String VARIABLE = "Variable";
// String VARIABLE_VAL = "Variable Val";
// String COMMENT = "Comment";
// String STRING = "String";
// String NUMBER = "Number";
//String GROUP = "Group";
//String PFT = "PFT";
//String GROUP_NAME = "Group Name";
//String[] ALL_STRINGS = { PARAM , PARAM_VAL , VARIABLE , VARIABLE_VAL , STRING , NUMBER , GROUP , PFT };
// 
// // configure the acceptor providing the id, the description string
// // that will appear in the preference page and the initial text style
// public void configure(IHighlightingConfigurationAcceptor acceptor) 
// {
// addType( acceptor, PARAM, 50, 0, 0, NORMAL );
// addType( acceptor, PARAM_VAL, 50, 0, 0, NORMAL );
// addType( acceptor, VARIABLE, 50, 0, 0, NORMAL );
// addType( acceptor, VARIABLE_VAL, 50, 0, 0, NORMAL );
// addType( acceptor, STRING, 50, 0, 0, NORMAL );
// addType( acceptor, NUMBER, 50, 0, 0, NORMAL );
// addType( acceptor, GROUP, 50, 0, 0, NORMAL );
// addType( acceptor, PFT, 50, 0, 0, NORMAL );
// addType( acceptor, GROUP_NAME, 50, 0, 0, NORMAL );
// addType( acceptor, COMMENT, 150, 200, 200, NORMAL );
// }
// 
// public void addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style )
// {
// TextStyle textStyle = new TextStyle();
// textStyle.setBackgroundColor(new RGB(255, 255, 255));
// textStyle.setColor(new RGB(r, g, b));
// textStyle.setStyle(style);
// acceptor.acceptDefaultHighlighting(s, s, textStyle);
// }
// 
 
 
 
  override configure(IHighlightingConfigurationAcceptor acceptor) {
  	println("coloring")
    acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", keywordTextStyle());
    acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", keywordTextStyle())
  }
  
  def keywordTextStyle() {
    val textStyle = new TextStyle();
    textStyle.setColor(new RGB(127,200, 85));
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
}