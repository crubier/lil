/*
* generated by Xtext
*/
package com.crubier.lil;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class LilStandaloneSetup extends LilStandaloneSetupGenerated{

	public static void doSetup() {
		new LilStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

