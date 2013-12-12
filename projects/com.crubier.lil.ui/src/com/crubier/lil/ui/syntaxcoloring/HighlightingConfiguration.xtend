package com.crubier.lil.ui.syntaxcoloring

import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor
import org.eclipse.xtext.ui.editor.utils.TextStyle

class HighlightingConfiguration implements IHighlightingConfiguration {

	public static final val KEYWORD_ID = "Keyword";
	public static final val COMMENT_ID = "Comment";
	public static final val INTERACTOR_ID = "Interactor";
	public static final val ACTOR_ID = "Actor";
	public static final val DATA_ID = "Data";
	public static final val LITERAL_ID = "Literal";
	public static final val SPECIAL_ID = "Special";

	def addType(IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int style) {
		val textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(r, g, b));
		textStyle.setStyle(style);
		acceptor.acceptDefaultHighlighting(s, s, textStyle);
	}
	
	def addType(IHighlightingConfigurationAcceptor acceptor, String s, int r, int g, int b, int br, int bg, int bb, int style) {
		val textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(br, bg, bb));
		textStyle.setColor(new RGB(r, g, b));
		textStyle.setStyle(style);
		acceptor.acceptDefaultHighlighting(s, s, textStyle);
	}

	override configure(IHighlightingConfigurationAcceptor acceptor) {
		addType(acceptor, KEYWORD_ID, 0, 0, 0, SWT.BOLD);
		addType(acceptor, COMMENT_ID, 128,128,128, SWT.ITALIC);
		addType(acceptor, INTERACTOR_ID, 0, 0, 240, SWT.NORMAL);
		addType(acceptor, ACTOR_ID, 175, 0, 0, SWT.NORMAL);
		addType(acceptor, DATA_ID, 0, 150, 0, SWT.NORMAL);
		addType(acceptor, LITERAL_ID, 150, 0,150, SWT.NORMAL);
		addType(acceptor, SPECIAL_ID, 255, 0,255, SWT.BOLD.bitwiseOr(SWT.ITALIC));
	}

}
