package dk.sdu.mdsd.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mdsd.cSVParserGenerator.Parser
import dk.sdu.mdsd.cSVParserGenerator.External
import dk.sdu.mdsd.cSVParserGenerator.Add
import dk.sdu.mdsd.cSVParserGenerator.StatFunc
import dk.sdu.mdsd.cSVParserGenerator.ColumnAction
import dk.sdu.mdsd.cSVParserGenerator.Rem
import dk.sdu.mdsd.cSVParserGenerator.Min
import dk.sdu.mdsd.cSVParserGenerator.Max
import dk.sdu.mdsd.cSVParserGenerator.Std
import dk.sdu.mdsd.cSVParserGenerator.Mean
import dk.sdu.mdsd.cSVParserGenerator.SumFunc
import dk.sdu.mdsd.cSVParserGenerator.ValueMod
import dk.sdu.mdsd.cSVParserGenerator.Plus
import dk.sdu.mdsd.cSVParserGenerator.Expression
import dk.sdu.mdsd.cSVParserGenerator.Minus
import dk.sdu.mdsd.cSVParserGenerator.Mult
import dk.sdu.mdsd.cSVParserGenerator.Div
import dk.sdu.mdsd.cSVParserGenerator.Or
import dk.sdu.mdsd.cSVParserGenerator.And
import dk.sdu.mdsd.cSVParserGenerator.Parens
import dk.sdu.mdsd.cSVParserGenerator.Geq
import dk.sdu.mdsd.cSVParserGenerator.Neq
import dk.sdu.mdsd.cSVParserGenerator.Leq
import dk.sdu.mdsd.cSVParserGenerator.Equ
import dk.sdu.mdsd.cSVParserGenerator.ColumnVar
import dk.sdu.mdsd.cSVParserGenerator.Num
import dk.sdu.mdsd.cSVParserGenerator.Constraint
import dk.sdu.mdsd.cSVParserGenerator.Gt
import dk.sdu.mdsd.cSVParserGenerator.Lt

class ParserClassGenerator extends AbstractGenerator {
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var parser = input.allContents.filter(Parser);
		var program = parser.next();
		fsa.generateFile('/parser/src/dk/sdu/mmmi/parser/CSVParser.java', generateParserClass(program));
		fsa.generateFile('/parser/src/dk/sdu/mmmi/parser/ExternalCheck.java', generateExternalInterface(program))
	}
	
	def CharSequence generateParserClass(Parser p) '''
		package dk.sdu.mmmi.parser;
		
		import java.io.*;
		import java.util.*;
		
		import org.apache.commons.csv.*;
		
		public class CSVParser {
			
			private final String fileName = "«p.file.name»";
			«IF p.out !== null»private final String outputName = "«p.out.name»";«ENDIF»
			
			private Iterable<CSVRecord> records;
			private ExternalCheck externals;
			
			private List<String> headerSet;
			
			private CSVPrinter printer = null;
			private org.apache.commons.csv.CSVParser parser = null;
			
			public CSVParser(ExternalCheck externals) {
				this.externals = externals;
			}
					
					
			public void parse() {
				try {
					
					FileReader in = new FileReader(fileName);
					parser = CSVFormat.DEFAULT.withHeader("column1","column2","column3").parse(in);
		
					records = parser.getRecords();
		
					headerSet = parser.getHeaderNames();
					
					«FOR mod : p.mods.filter[mod | !(mod instanceof StatFunc)]»
						records = «GenerateModInvocation(mod)»;
						
					«ENDFOR»
					
					«FOR mod : p.mods.filter[mod | (mod instanceof StatFunc)]»
						System.out.println(«GenerateModInvocation(mod)»);
					«ENDFOR»
					
					«IF p.out !== null»
					
					printer = new CSVPrinter(new FileWriter(outputName), CSVFormat.DEFAULT);
					
					printer.printRecord(headerSet);
					printer.printRecords(records);
					
					«ELSE»
					
					for (CSVRecord record : records) {
						System.out.println(record.toString());
					}
					
					«ENDIF»
										
				} catch (IOException e) {
					e.printStackTrace();
				}
				

			}

			«FOR mods: p.mods»
				«switch mods {
					Expression: ShowExpression(mods)
					ValueMod: ShowValueMod(mods)
					External: ShowExternalFunc(mods)
					StatFunc: statfunc(mods)
					ColumnAction: ShowColumnAction(mods)
					Constraint: ShowConstraint(mods)
					default: ''
				}»
			«ENDFOR»
			
			«/*FOR col: p.columns»
				«IF col.mods !== null»
					«FOR mods: p.mods»
						«switch mods {
							Expression: ShowExpression(mods)
							ValueMod: ShowValueMod(mods)
							External: ShowExternalFunc(mods)
							StatFunc: statfunc(mods)
							ColumnAction: ShowColumnAction(mods)
							Constraint: ShowConstraint(mods)
							default: ''
						}»
					«ENDFOR»
				«ENDIF»
			«ENDFOR*/»
		}
	'''

	def CharSequence generateExternalInterface(Parser p) '''
		package dk.sdu.mmmi.parser;
		
		import java.io.*;
		import java.util.*;
		
		import org.apache.commons.csv.*;

		public interface ExternalCheck {
			«FOR ext : p.mods.filter[x | x instanceof External]» 
				«GenerateInterfaceFunc(ext as External)»
			«ENDFOR»
		}
	'''
	
	def CharSequence ShowColumnAction(ColumnAction ca) {
		switch ca {
			Add: AddColumn(ca)
			Rem: RemColumn(ca)
			default: ''
		}
	}
	
	def CharSequence AddColumn(Add add) '''
		private Iterable<CSVRecord> addColumn«add.name»(Iterable<CSVRecord> records) {
			ArrayList<CSVRecord> _return = new ArrayList<CSVRecord>();
			for (CSVRecord record : records) {
				record.get("«add.name»") = String.valueOf((«ShowExpression(add.mod)»));
				_return.add(record);
			}
			
			return _return;
		} 
	'''
	
	def CharSequence RemColumn(Rem rem) '''
		private Iterable<CSVRecord> remColumn«rem.name.name»(Iterable<CSVRecord> records) {
			ArrayList<CSVRecord> _return = new ArrayList<CSVRecord>();
			for (CSVRecord record : records) {
				record.get("«rem.name.name»") = null;
				_return.add(record);
			}
			
			return _return;
		} 
	'''
	
	def CharSequence ShowValueMod(ValueMod vm) '''
		public Iterable<CSVRecord> «vm.name.name»ModifyValue(Iterable<CSVRecord> records) {
			ArrayList<CSVRecord> _return = new ArrayList<CSVRecord>();
			
			for (CSVRecord record : records) {
				record.get("«vm.name.name»") = String.valueOf(«ShowExpression(vm.exp)»);
				_return.add(record);
			}
			
			return _return;
		}
	'''
	
	def CharSequence ShowExpression(Expression exp) {
		switch exp {
			Plus: ShowExpression(exp.left)+'+'+ShowExpression(exp.right)
			Minus: ShowExpression(exp.left)+'-'+ShowExpression(exp.right)
			Mult: ShowExpression(exp.left)+'*'+ShowExpression(exp.right)
			Div: ShowExpression(exp.left)+'/'+ShowExpression(exp.right)
			Or: ShowExpression(exp.left)+'||'+ShowExpression(exp.right)
			And: ShowExpression(exp.left)+'&&'+ShowExpression(exp.right)
			Gt: ShowExpression(exp.left)+'>'+ShowExpression(exp.right)
			Lt: ShowExpression(exp.left)+'<'+ShowExpression(exp.right)
			Equ: ShowExpression(exp.left)+'=='+ShowExpression(exp.right)
			Neq: ShowExpression(exp.left)+'!='+ShowExpression(exp.right)
			Geq: ShowExpression(exp.left)+'=>'+ShowExpression(exp.right)
			Leq: ShowExpression(exp.left)+'=<'+ShowExpression(exp.right)
			Parens: '('+ShowExpression(exp.exp)+')'
			ColumnVar: 'Double.parseDouble(record.get("'+exp.name.name+'"))' //Get the value from the column referenced.
			Num: exp.value.toString
			default: ''
		}
		
	}
		
	def CharSequence ShowExternalFunc(External ext) '''
		public Iterable<CSVRecord> «ext.name»ExternalCheck(Iterable<CSVRecord> records) {
			ArrayList<CSVRecord> _return = new ArrayList<CSVRecord>(); 
			for (CSVRecord record : records) {
				if (externals.«ext.name»(record)) {
					_return.add(record);
				}
			}
			
			return _return;
		}
	'''
	
	def CharSequence GenerateInterfaceFunc(External ext) '''public boolean «ext.name»(CSVRecord record);'''
	
	// Find index of column.
	def dispatch CharSequence statfunc(Max m) '''
		private double max«m.input.name»(Iterable<CSVRecord> records)  {
			double currentMax = 0.0;
			for (CSVRecord record : records) {
				double val = Double.parseDouble(record.get("«m.input.name»")); //Getting values from CSVRecord returns Strings
				if (val > currentMax) {
					currentMax = val;
				}
			}
			
			return currentMax;
		}
	'''
	
	def dispatch CharSequence statfunc(Min m) '''
		private double  min«m.input.name»(Iterable<CSVRecord> records)  {
			double currentMin = INTEGER_MAX;
			for (CSVRecord record : records) {
				double val = Double.parseDouble(record.get("«m.input.name»"));
				if (val < currentMin) {
					currentMin = val;
				}
			}
			
			return currentMin;
		}
	'''
	
	def dispatch CharSequence statfunc(Std s) '''
		private double stdDev«s.input.name»(Iterable<CSVRecord> records) {
			double standard_deviation = 0.0;
			int count = 0;
			double total_deviation = 0.0;
			double mean = mean«s.input.name»(records);
			for (CSVRecord record : records) {
				double val = Double.parseDouble(record.get("«s.input.name»"));
				total_deviation += val - mean;
				count++;	
			}
			
			standard_deviation = Math.sqrt(Math.pow(total_deviation, 2)/count);
			
			return standard_deviation;
		}
	'''
	
	def dispatch CharSequence statfunc(Mean m) '''
		private double mean«m.input.name»(Iterable<CSVRecord> records) {
			int count = 0;
			double sum = 0.0;
			double mean = 0.0;
			for (CSVRecord record : records) {
				double val = Double.parseDouble(record.get("«m.input.name»"));
				sum += val;
				count++;
			}
			
			mean = sum / count;
			
			return mean;
		} 
	'''
	
	def dispatch CharSequence statfunc(SumFunc s) '''
		private double sum«s.input.name»(Iterable<CSVRecord> records)  {
			double currentSum = 0;
			for (CSVRecord record : records) {
				double val = Double.parseDouble(record.get("«s.input.name»"));
				currentSum += val;
			}
			
			return currentSum;
		}	
	'''
	
	def CharSequence ShowConstraint(Constraint constraint) '''
		public Iterable<CSVRecord> check«constraint.name.name»(Iterable<CSVRecord> records) {
			ArrayList<CSVRecord> _return = new ArrayList<CSVRecord>();
			
			for (CSVRecord record : records) {
				if («ShowExpression(constraint.exp)») {
					_return.add(record);
				}
			}
			
			return _return;
		}
	'''
	
	def dispatch CharSequence GenerateModInvocation(External ext) '''«ext.name»ExternalCheck(records)''' 
	
	def dispatch CharSequence GenerateModInvocation(ColumnAction ca) '''«ca.GenerateModInvocationCA»'''
	
	def dispatch CharSequence GenerateModInvocation(ValueMod vm) '''«vm.name.name»ModifyValue(records)'''
	
	def dispatch CharSequence GenerateModInvocation(StatFunc sf) '''«sf.GenerateModInvocationStat»'''
	
	def dispatch CharSequence GenerateModInvocation(Constraint c) '''check«c.name.name»(records)'''	
	
	def dispatch CharSequence GenerateModInvocationCA(Add a) '''addColumn«a.name»(records)'''
	
	def dispatch CharSequence GenerateModInvocationCA(Rem r) '''remColumn«r.name.name»(records)'''
	
	def dispatch CharSequence GenerateModInvocationStat(SumFunc s) '''sum«s.input.name»(records)'''
	
	def dispatch CharSequence GenerateModInvocationStat(Mean m) '''mean«m.input.name»(records)'''
	
	def dispatch CharSequence GenerateModInvocationStat(Std s) '''stdDev«s.input.name»(records)'''
	
	def dispatch CharSequence GenerateModInvocationStat(Min m) '''min«m.input.name»(records)'''
	
	def dispatch CharSequence GenerateModInvocationStat(Max m) '''max«m.input.name»(records)'''
	
}