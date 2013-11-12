package com.crubier.lil.tests

import org.eclipse.xtext.junit4.XtextRunner
import com.crubier.lil.LilInjectorProvider
import org.eclipse.xtext.junit4.InjectWith
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.util.ParseHelper
import static org.junit.Assert.*
import javax.inject.Inject
import org.junit.Test
import com.crubier.lil.lil.LilModel
import com.crubier.lil.lil.InteractorDeclaration

@InjectWith(LilInjectorProvider)
@RunWith(XtextRunner)
class BasicTest {
	
	@Inject ParseHelper<LilModel> parser
	
	@Test
	def void parseLil(){
		val model = parser.parse(
			"
				interactor test1234testInteractor :

			"
		)
		val entity = model.interactors.head as InteractorDeclaration
		assertEquals(entity.name,"test1234testInteractor");
	}
	
}