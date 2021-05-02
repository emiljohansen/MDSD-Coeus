/*
 * generated by Xtext 2.21.0
 */
package dk.sdu.mdsd.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import dk.sdu.mdsd.CSVParserGeneratorRuntimeModule;
import dk.sdu.mdsd.CSVParserGeneratorStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class CSVParserGeneratorIdeSetup extends CSVParserGeneratorStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new CSVParserGeneratorRuntimeModule(), new CSVParserGeneratorIdeModule()));
	}
	
}
