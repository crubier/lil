/*
 * generated by Xtext
 */
package com.crubier.lil.scoping

import com.crubier.lil.lil.FlowEmission
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.Scopes
import com.crubier.lil.lil.InteractorDeclaration
import org.eclipse.emf.ecore.EObject

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class LilScopeProvider extends AbstractDeclarativeScopeProvider {
	
	
	// flow emission instance scope : either a signal defined in this interactor, or a signal defined in the interactor specified by the "to <destination>" statement
  	 def public IScope scope_FlowEmission_instance(FlowEmission flowemission, EReference ref) {
        if(flowemission.destination == null) {
        	var EObject temp = flowemission;
        	while(!(temp instanceof InteractorDeclaration)) {
        		temp =temp.eContainer;
        	}
        	Scopes.scopeFor(temp.eContents);
        }
        else {
        	Scopes.scopeFor(flowemission.destination.instance.interactor.eContents);
        }
    }

}
