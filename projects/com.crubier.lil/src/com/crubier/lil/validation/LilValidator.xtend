/*
 * generated by Xtext
 */
package com.crubier.lil.validation

import org.eclipse.xtext.validation.Check
import com.crubier.lil.lil.LilPackage


/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class LilValidator extends AbstractLilValidator {

  public static val INVALID_NAME = 'invalidName'

//	@Check
//	def checkGreetingStartsWithCapital(Interactor interactor) {
//		if (!Character.isUpperCase(interactor.name.charAt(0))) {
//			warning('Name should start with a capital', LilPackage.Literals.INTERACTOR__NAME,INVALID_NAME)
//		}
//	}
}
