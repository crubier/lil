/*
 * generated by Xtext
 */
package com.crubier.lil.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.emf.ecore.EObject
import com.crubier.lil.lil.LilPackage
import com.crubier.lil.lil.LilFactory

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class LilScopeProvider extends AbstractDeclarativeScopeProvider {

//	// flow emission instance scope : either a signal defined in this interactor, or a signal defined in the interactor specified by the "to <destination>" statement
//	def public IScope scope_SignalEmission_instance(SignalEmission flowemission, EReference ref) {
//		if (flowemission.destination == null) {
//			var EObject temp = flowemission;
//			while (!(temp instanceof Interactor)) {
//				temp = temp.eContainer;
//			}
//			return Scopes.scopeFor(temp.eContents);
//		} else {
//
//			//        	println((flowemission.destination.source.specific as Component).interactor.eContents);
//			return Scopes.scopeFor((flowemission.destination.source.specific as Component).interactor.eContents);
//		}
//	}
//
//	// enum literal scope is at the interactor level
//	def public IScope scope_EnumLiteral_element(EnumLiteral literal, EReference ref) {
//		var EObject object = literal;
//		while (!(object instanceof Interactor)) {
//			object = object.eContainer;
//		}
//
//		val elements = new HashSet<EnumElement>
//		val interactor = object as Interactor
////		for (s : interactor.signals) {
////			if(s?.definitionSet instanceof EnumDefinitionSet)
////				if ((s?.definitionSet as EnumDefinitionSet)?.elements != null)
////					elements.addAll((s?.definitionSet as EnumDefinitionSet).elements)
////		}
//		return Scopes.scopeFor(elements);
//	}

}
