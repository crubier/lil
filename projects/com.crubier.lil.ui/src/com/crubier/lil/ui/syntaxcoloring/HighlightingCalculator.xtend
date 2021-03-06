package com.crubier.lil.ui.syntaxcoloring

import com.crubier.lil.lil.DataType
import com.crubier.lil.lil.DataTypeDefinition
import com.crubier.lil.lil.InteractorType
import com.crubier.lil.lil.InteractorTypeDefinition
import com.crubier.lil.lil.LiteralBoolean
import com.crubier.lil.lil.LiteralEnum
import com.crubier.lil.lil.LiteralNull
import com.crubier.lil.lil.LiteralNumber
import com.crubier.lil.lil.LiteralText
import com.crubier.lil.lil.LiteralTime
import org.eclipse.xtext.resource.DefaultLocationInFileProvider
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator
import com.crubier.lil.lil.ActorType
import com.crubier.lil.lil.ActorTypeDefinition
import com.crubier.lil.lil.DataTypeSymbolDefinitionSetElement
import com.crubier.lil.lil.LiteralTimeNow

class HighlightingCalculator implements ISemanticHighlightingCalculator {

	override provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		val locationProvider = new DefaultLocationInFileProvider();
		val iterator = resource.allContents;

		while (iterator.hasNext) {
			
			val current = iterator.next;
			val region = locationProvider.getSignificantTextRegion(current);
			val regionf = locationProvider.getFullTextRegion(current)
			
			switch current {
				InteractorType:
					acceptor.addPosition(regionf.offset, regionf.length, HighlightingConfiguration.INTERACTOR_ID)
				InteractorTypeDefinition:
					acceptor.addPosition(region.offset, region.length, HighlightingConfiguration.INTERACTOR_ID)
				DataType: 
					acceptor.addPosition(region.offset,region.length, HighlightingConfiguration.DATA_ID)	
				DataTypeDefinition:
					acceptor.addPosition(region.offset, region.length, HighlightingConfiguration.DATA_ID)
				ActorType:
					acceptor.addPosition(regionf.offset, regionf.length, HighlightingConfiguration.ACTOR_ID)
				ActorTypeDefinition:
					acceptor.addPosition(region.offset, region.length, HighlightingConfiguration.ACTOR_ID)
				LiteralBoolean:
					acceptor.addPosition(regionf.offset, regionf.length, HighlightingConfiguration.LITERAL_ID)
				LiteralNull:
					acceptor.addPosition(regionf.offset, regionf.length, HighlightingConfiguration.LITERAL_ID)
				LiteralNumber:
					acceptor.addPosition(regionf.offset, regionf.length, HighlightingConfiguration.LITERAL_ID)
				LiteralText:
					acceptor.addPosition(regionf.offset, regionf.length, HighlightingConfiguration.LITERAL_ID)
				LiteralEnum:
					acceptor.addPosition(regionf.offset, regionf.length, HighlightingConfiguration.LITERAL_ID)
				DataTypeSymbolDefinitionSetElement:
					acceptor.addPosition(regionf.offset, regionf.length, HighlightingConfiguration.LITERAL_ID)
				LiteralTime: 
					acceptor.addPosition(regionf.offset, regionf.length, HighlightingConfiguration.LITERAL_ID)
				LiteralTimeNow :
					acceptor.addPosition(regionf.offset, regionf.length, HighlightingConfiguration.LITERAL_ID)
			}

		}

	}

}
