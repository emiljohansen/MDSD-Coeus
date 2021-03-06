/*
 * generated by Xtext 2.21.0
 */
package dk.sdu.mdsd.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.xtext.validation.Check;

import dk.sdu.mdsd.cSVParserGenerator.Add;
import dk.sdu.mdsd.cSVParserGenerator.CSVParserGeneratorPackage;
import dk.sdu.mdsd.cSVParserGenerator.ColDecl;
import dk.sdu.mdsd.cSVParserGenerator.DateLit;
import dk.sdu.mdsd.cSVParserGenerator.Expression;
import dk.sdu.mdsd.cSVParserGenerator.Parser;
import dk.sdu.mdsd.cSVParserGenerator.StatFunc;
import dk.sdu.mdsd.cSVParserGenerator.ValueMod;
import dk.sdu.mdsd.cSVParserGenerator.Integ;
import dk.sdu.mdsd.cSVParserGenerator.Floa;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class CSVParserGeneratorValidator extends AbstractCSVParserGeneratorValidator {
	
	Pattern datePattern = Pattern.compile("[0-9][0-9][0-9][0-9][-][0-1][0-9][-][0-3][0-9]");
	
	@Check
	public void checkModificationType(ValueMod mod) {
		
	}
	
	@Check
	public void checkAddColumnName(Add a, Parser p) {
		for (ColDecl col : p.getColumns()) {
			if (col.getName() == a.getName()) {
				warning("Columns names should be unique", CSVParserGeneratorPackage.Literals.ADD__NAME);
			}
		}
	}
	
	@Check
	public void checkStatFuncInputType(StatFunc s) {
		if (!(s.getInput().getType() instanceof Integ) && !(s.getInput().getType() instanceof Floa)) {
			warning("Statistics function only with the types integer and float", CSVParserGeneratorPackage.Literals.STAT_FUNC__INPUT);
		}
	}
	
	@Check
	public void checkInputOutput(Parser p) {
		if (p.getFile() == null) {
			if (p.getOut() == null) {
				warning("Output may not be null, if input is null", CSVParserGeneratorPackage.Literals.PARSER__FILE);
			}
			
			if (p.getOut().getNumber() == 0) {
				warning("Number of records may not be null", CSVParserGeneratorPackage.Literals.PARSER__OUT);
			}
		}
	}
	
	@Check
	public void checkDateFormat(DateLit d) {
		String matchString = d.getValue();
		
		Matcher matcher = datePattern.matcher(matchString);
		
		if (!matcher.find()) {
			warning("Not a valid date", CSVParserGeneratorPackage.Literals.DATE_LIT__VALUE);
		}
	}
	
}
