/*
* generated by Xtext
*/
package com.crubier.lil;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class LilUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return com.crubier.lil.ui.internal.LilActivator.getInstance().getInjector("com.crubier.lil.Lil");
	}
	
}
