package com.crubier.lil.ui.syntaxcoloring

import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.SWT

class HighlightingConfiguration implements IHighlightingConfiguration {
 
  public static final val KEYWORD_ID = "Keyword";
  public static final val COMMENT_ID = "Comment";
  public static final val INTERACTOR_ID = "Interactor";
  
  
 
 
 
// 
// // provide an id string for the highlighting calculator
// val PARAM = "Parameter";
// val PARAM_VAL = "Parameter Value";
// val VARIABLE = "Variable";
// val VARIABLE_VAL = "Variable Val";
// val COMMENT = "Comment";
// val STRING = "String";
// val NUMBER = "Number";
//val GROUP = "Group";
//val PFT = "PFT";
//val GROUP_NAME = "Group Name";
//var ALL_STRINGS = #[ PARAM , PARAM_VAL , VARIABLE , VARIABLE_VAL , STRING , NUMBER , GROUP , PFT ];
// 
// // configure the acceptor providing the id, the description string
// // that will appear in the preference page and the initial text style
//override configure(IHighlightingConfigurationAcceptor acceptor) 
// {
// addType( acceptor, PARAM, 50, 0, 0, SWT.NORMAL );
// addType( acceptor, PARAM_VAL, 50, 0, 0, SWT.NORMAL );
// addType( acceptor, VARIABLE, 50, 0, 0, SWT.NORMAL );
// addType( acceptor, VARIABLE_VAL, 50, 0, 0, SWT.NORMAL );
// addType( acceptor, STRING, 50, 0, 0, SWT.NORMAL );
// addType( acceptor, NUMBER, 50, 0, 0, SWT.NORMAL );
// addType( acceptor, GROUP, 50, 0, 0, SWT.NORMAL );
// addType( acceptor, PFT, 50, 0, 0, SWT.NORMAL );
// addType( acceptor, GROUP_NAME, 50, 0, 0, SWT.NORMAL );
// addType( acceptor, COMMENT, 150, 200, 200, SWT.NORMAL );
// }
// 
 def addType( IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style )
 {
 val textStyle = new TextStyle();
 textStyle.setBackgroundColor(new RGB(255, 255, 255));
 textStyle.setColor(new RGB(r, g, b));
 textStyle.setStyle(style);
 acceptor.acceptDefaultHighlighting(s, s, textStyle);
 }
//
// 
 
  override configure(IHighlightingConfigurationAcceptor acceptor) {
  	
  	addType(acceptor,KEYWORD_ID,127,0,85,SWT.BOLD);
  	addType(acceptor,COMMENT_ID,31,127, 31,SWT.BOLD);
  	addType(acceptor,INTERACTOR_ID,255,0, 255,SWT.BOLD);
  }
  

}