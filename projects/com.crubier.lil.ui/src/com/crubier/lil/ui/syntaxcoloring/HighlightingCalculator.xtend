package com.crubier.lil.ui.syntaxcoloring

import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator
import org.eclipse.xtext.nodemodel.impl.CompositeNodeWithSemanticElement
import org.eclipse.xtext.nodemodel.BidiIterator
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode
import org.eclipse.xtext.impl.TerminalRuleImpl
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import com.crubier.lil.lil.InteractorType

import org.eclipse.xtext.xtext.XtextLocationInFileProvider
import com.crubier.lil.lil.DataType

class HighlightingCalculator implements ISemanticHighlightingCalculator {

	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		
		println("I was called");
		val locationProvider = new XtextLocationInFileProvider();
		val iterator = resource.allContents;
		
		while(iterator.hasNext) {
			val current = iterator.next;
			val region = locationProvider.getSignificantTextRegion(current);
			
			switch current {
				InteractorType : 
					acceptor.addPosition(region.offset, region.length, HighlightingConfiguration.INTERACTOR_ID)
				DataType :
					acceptor.addPosition(region.offset, region.length, HighlightingConfiguration.INTERACTOR_ID)
			}
			
		}
		
		
		
		
		
//		
//		
//		
//		if(resource?.parseResult == null) return;
//
//		val root = resource.parseResult.rootNode;
//
//		val tree = root.asTreeIterable;
//
//
//
//
//		for (node : tree) {
//			
//			
//			
//			
//			
//					switch node {
//						
//						CompositeNodeWithSemanticElement case NodeModelUtils.findActualSemanticObjectFor(node) instanceof InteractorType :
//						 	
//					}
//		}

	}

//	def setStyles(IHighlightedPositionAcceptor acceptor, BidiIterator<INode> iterator, String... styles) {
//		for (s : styles) {
//			if(!iterator.hasNext()) return;
//			val n = skipWhiteSpace(acceptor, iterator);
//			if (n != null && s != null) {
//				acceptor.addPosition(n.offset, n.length, s)
//			}
//		}
//	}
//
//	def skipWhiteSpace(IHighlightedPositionAcceptor acceptor, BidiIterator<INode> iterator) {
//		var INode n = null;
//		while (iterator.hasNext() && ((n = iterator.next()) instanceof HiddenLeafNode)) {
//			processHiddenNode(acceptor,n as HiddenLeafNode);
//		}
//		return n;
// 	}
// 	
// 	def skipWhiteSpaceBackwards(IHighlightedPositionAcceptor acceptor, BidiIterator<INode> iterator) {
//		var INode n = null;
//		while (iterator.hasPrevious() && ((n = iterator.previous()) instanceof HiddenLeafNode)) {
//			processHiddenNode(acceptor,n as HiddenLeafNode);
//		}
//		return n;
// 	}
//
//	def processHiddenNode(IHighlightedPositionAcceptor acceptor, HiddenLeafNode node) {
//		val ge = node.grammarElement;
//		switch (ge) {
//			TerminalRuleImpl case ge.name.equalsIgnoreCase("GUESS_COMMENT"):
//				acceptor.addPosition(node.offset, node.length, "comment")
//		}
//	}
}
