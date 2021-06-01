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
import dk.sdu.mdsd.cSVParserGenerator.Integ
import dk.sdu.mdsd.cSVParserGenerator.Floa
import dk.sdu.mdsd.cSVParserGenerator.Date
import dk.sdu.mdsd.cSVParserGenerator.ValueM
import dk.sdu.mdsd.cSVParserGenerator.Constrain
import dk.sdu.mdsd.cSVParserGenerator.Ext
import dk.sdu.mdsd.cSVParserGenerator.Stat
import dk.sdu.mdsd.cSVParserGenerator.ColAct
import dk.sdu.mdsd.cSVParserGenerator.DateLit
import dk.sdu.mdsd.cSVParserGenerator.Type
import dk.sdu.mdsd.cSVParserGenerator.Str
import dk.sdu.mdsd.cSVParserGenerator.StringLit

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
		import java.time.*;
		
		public class CSVParser {
			
			«IF p.file !== null»private final String fileName = "«p.file.name»";
			private final String separator = "«p.file.sepchar»";
			«ENDIF»
			«IF p.out !== null»private final String outputName = "«p.out.name»";«ENDIF»
			
			«IF p.file === null»private final String separator = ",";«ENDIF»
			
			private ArrayList<ArrayList<String>> records;
			private ExternalCheck externals;
			
			private List<String> headerSet;
			
			public CSVParser(ExternalCheck externals) {
				this.externals = externals;
			}
					
					
			public void parse() {
				try {
					
					«IF p.file === null»
						records = generateNewFileRecords();
					«ELSE»
					records = new ArrayList<ArrayList<String>>();
					
					FileReader in = new FileReader(fileName);
					
					BufferedReader reader = new BufferedReader(in);
					
					String line;
					
					while ((line = reader.readLine()) != null) {
						
						List<String> temp = Arrays.asList(line.split(separator));
					
						ArrayList<String> record = new ArrayList<>(temp);
						
						records.add(record);
					}
					
					«ENDIF»
		
					headerSet = records.get(0);
					
					// Take out the headers as types do not hold for them.
					records.remove(0);
					
					«FOR mod : p.mods»
						«mod.intermediateMods»
					«ENDFOR»
					
					«IF p.out !== null»
					BufferedWriter writer = new BufferedWriter(new FileWriter(outputName));
					
					for (String s : headerSet) {
						writer.write(s + separator);
					}
					
					writer.write("\n");
					
					for (ArrayList<String> record : records) {
						for (String s : record) {
							writer.write(s + separator);
						}
						writer.write("\n");
					}
					
					writer.close();
					
					«ELSE»
					
					System.out.println(headerSet);
					
					for (ArrayList<String> record : records) {
						for (String s : record) {
							System.out.print(s + separator);
						}
						System.out.print("\n");
					}
					
					«ENDIF»
										
				} catch (IOException e) {
					e.printStackTrace();
				}
				

			}
			
			«IF p.file === null»«generateNewFileFunc(p)»«ENDIF»

			«FOR mod: p.mods»
				«mod.modFuncGen»
			«ENDFOR»
		}
	'''
	
	def dispatch CharSequence intermediateMods(ValueM m) '''«FOR vm : m.mods»records = «GenerateModInvocation(vm)»;
	«ENDFOR»'''
	
	def dispatch CharSequence intermediateMods(ColAct m) '''«FOR ca : m.mods»records = «GenerateModInvocation(ca)»;
	«ENDFOR»'''
	
	def dispatch CharSequence intermediateMods(Constrain m) '''«FOR c : m.mods»records = «GenerateModInvocation(c)»;
	«ENDFOR»'''
	
	def dispatch CharSequence intermediateMods(Ext e) '''«FOR ext : e.mods»records = externals.«GenerateModInvocation(ext)»;
	«ENDFOR»'''
	
	def dispatch CharSequence intermediateMods(Stat s) '''«FOR st : s.mods» System.out.println(«GenerateModInvocation(st)»);
	«ENDFOR»'''
	
	def dispatch CharSequence modFuncGen(ValueM vm) '''«FOR v : vm.mods»«ShowValueMod(v)»«ENDFOR»'''
	
	def dispatch CharSequence modFuncGen(ColAct ca) '''«FOR c : ca.mods»«ShowColumnAction(c)»«ENDFOR»'''
	
	def dispatch CharSequence modFuncGen(Ext ex) '''«FOR e : ex.mods»«ShowExternalFunc(e)»«ENDFOR»'''
	
	def dispatch CharSequence modFuncGen(Constrain con) '''«FOR c : con.mods»«ShowConstraint(c)»«ENDFOR»'''
	
	def dispatch CharSequence modFuncGen(Stat st) '''«FOR s : st.mods»«statfunc(s)»«ENDFOR»'''
	
	def CharSequence generateNewFileFunc(Parser p) '''
		public ArrayList<ArrayList<String>> generateNewFileRecords() {
			ArrayList<ArrayList<String>> _return = new ArrayList<ArrayList<String>>();
			// Instantiate header list
			ArrayList<String> headers = new ArrayList<String>() {«FOR col : p.columns SEPARATOR ','»"«col.name»"«ENDFOR»};
			
			_return.add(headers);
						
			for (int i = 0; i < «p.out.number»; i++) {
				ArrayList<String> newRecord = new ArrayList<String>();
				
				for (int j = 0; j < headers.size(); j++) {
					// Fill new records with empty strings, that can later be modified.
					newRecord.add(j, "");
				}
				
				_return.add(newRecord);
			}
			
			
			return _return;
		}
		
	'''

	def CharSequence generateExternalInterface(Parser p) '''
		package dk.sdu.mmmi.parser;
		
		import java.io.*;
		import java.util.*;

		public interface ExternalCheck {
			«FOR ex : p.mods.filter[x | x instanceof Ext]» 
				«GenerateInterfaceFunc(ex as Ext) /*Type casting is necessary, as it otherwise exists as a Modification */»
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
		private ArrayList<ArrayList<String>> addColumn«add.name»(ArrayList<ArrayList<String>> records) {
			ArrayList<ArrayList<String>> _return = new ArrayList<ArrayList<String>>();
			headerSet.add("«add.name»");
			int index = headerSet.indexOf("«add.name»");
			for (ArrayList<String> record : records) {
				var value = «ShowExpression(add.type, add.mod)»;
				record.set(index, value);
				_return.add(record);
			}
			
			return _return;
		} 
	'''
	
	def CharSequence RemColumn(Rem rem) '''
		private ArrayList<ArrayList<String>> remColumn«rem.name.name»(ArrayList<ArrayList<String>> records) {
			ArrayList<ArrayList<String>> _return = new ArrayList<ArrayList<String>>();
			int index = headerSet.indexOf("«rem.name.name»");
			for (ArrayList<String> record : records) {
				record.remove(index);
				_return.add(record);
			}
			
			headerSet.remove("«rem.name.name»");
			
			return _return;
		} 
	'''
	
	def CharSequence ShowValueMod(ValueMod vm) '''
		public ArrayList<ArrayList<String>> «vm.name.name»ModifyValue(ArrayList<ArrayList<String>> records) {
			ArrayList<ArrayList<String>> _return = new ArrayList<ArrayList<String>>();
			int index = headerSet.indexOf("«vm.name.name»");
			for (ArrayList<String> record : records) {
				var value = record.get(index);
				value = «ShowExpression(vm.name.type, vm.exp)»;
				record.set(index, value);
				_return.add(record);
			}
			
			return _return;
		}
	'''
	
	def CharSequence ShowExpression(Type t, Expression exp) {
		switch t {
			Date: ShowExpressionDate(exp)+'.toString()'
			Floa,
			Integ: 'String.valueOf('+ShowExpressionNumber(exp)+')'
			Str: ShowExpressionString(exp)
			default: ''
		}
	}
	
	def CharSequence ShowExpressionNumber(Expression exp) {
		switch exp {
			Plus: ShowExpressionNumber(exp.left)+'+'+ShowExpressionNumber(exp.right)
			Minus: ShowExpressionNumber(exp.left)+'-'+ShowExpressionNumber(exp.right)
			Mult: ShowExpressionNumber(exp.left)+'*'+ShowExpressionNumber(exp.right)
			Div: ShowExpressionNumber(exp.left)+'/'+ShowExpressionNumber(exp.right)
			Or: ShowExpressionNumber(exp.left)+'||'+ShowExpressionNumber(exp.right)
			And: ShowExpressionNumber(exp.left)+'&&'+ShowExpressionNumber(exp.right)
			Gt: ShowExpressionNumber(exp.left)+'>'+ShowExpressionNumber(exp.right)
			Lt: ShowExpressionNumber(exp.left)+'<'+ShowExpressionNumber(exp.right)
			Equ: ShowExpressionNumber(exp.left)+'=='+ShowExpressionNumber(exp.right)
			Neq: ShowExpressionNumber(exp.left)+'!='+ShowExpressionNumber(exp.right)
			Geq: ShowExpressionNumber(exp.left)+'=>'+ShowExpressionNumber(exp.right)
			Leq: ShowExpressionNumber(exp.left)+'=<'+ShowExpressionNumber(exp.right)
			Parens: '('+ShowExpressionNumber(exp.exp)+')'
			ColumnVar: 'Double.parseDouble(record.get(headerSet.indexOf("'+exp.name.name+'")))' //Get the value from the column referenced.
			Num: exp.value.toString
			DateLit: 'LocalDate.parse("'+exp.value+'")'
			StringLit: exp.value
			default: ''
		}
		
	}
	
	// Might need to add parens about the full expression to ensure that it is an actual date object.
	def CharSequence ShowExpressionDate(Expression exp) {
		switch exp {
			Plus: ShowExpressionDate(exp.left)+'.plusDays('+ShowExpressionDate(exp.right)+')'
			Minus: ShowExpressionDate(exp.left)+'minusDays('+ShowExpressionDate(exp.right)+')'
			Or: ShowExpressionDate(exp.left)+'||'+ShowExpressionDate(exp.right)
			And: ShowExpressionDate(exp.left)+'&&'+ShowExpressionDate(exp.right)
			Gt: ShowExpressionDate(exp.left)+'.isBefore('+ShowExpressionDate(exp.right)+')'
			Lt: ShowExpressionDate(exp.left)+'.isAfter('+ShowExpressionDate(exp.right)+')'
			Equ: ShowExpressionDate(exp.left)+'.equals('+ShowExpressionDate(exp.right)+')'
			Neq: '!'+ShowExpressionDate(exp.left)+'.equals('+ShowExpressionDate(exp.right)+')'
			Geq: ShowExpressionDate(exp.left)+'.isBefore('+ShowExpressionDate(exp.right)+')'
			Leq: ShowExpressionDate(exp.left)+'.isAfter('+ShowExpressionDate(exp.right)+')'
			Parens: '('+ShowExpressionDate(exp.exp)+')'
			ColumnVar: 'LocalDate.parse((record.get(headerSet.indexOf("'+exp.name.name+'"))))' //Get the value from the column referenced.
			DateLit: 'LocalDate.parse("'+exp.value+'")'
			Num: exp.value.toString
			StringLit: exp.value
			Mult,
			Div,
			default: ''
		}
	}
	
	def CharSequence ShowExpressionString(Expression exp) {
		switch exp {
			Or: ShowExpressionString(exp.left)+'||'+ShowExpressionString(exp.right)
			And: ShowExpressionString(exp.left)+'&&'+ShowExpressionString(exp.right)
			Equ: ShowExpressionString(exp.left)+'.equals('+ShowExpressionString(exp.right)+')'
			Neq: '!'+ShowExpressionString(exp.left)+'.equals('+ShowExpressionString(exp.right)+')'
			Parens: '('+ShowExpressionString(exp.exp)+')'
			ColumnVar: '(record.get(headerSet.indexOf("'+exp.name.name+'"))' //Get the value from the column referenced.
			Num: exp.value.toString
			DateLit: 'LocalDate.parse("'+exp.value+'")'
			StringLit: exp.value
			Plus,
			Minus,
			Mult,
			Div,
			Geq,
			Leq,
			Gt, 
			Lt,
			default: ''
		}
	}
		
	def CharSequence ShowExternalFunc(External ext) ''''''
	
	def CharSequence GenerateInterfaceFunc(Ext ex) '''«FOR e : ex.mods» public ArrayList<ArrayList<String>> «e.name»(ArrayList<ArrayList<String>> records); «ENDFOR»'''
	
	// Find index of column.
	def dispatch CharSequence statfunc(Max m) '''
		private double max«m.input.name»(ArrayList<ArrayList<String>> records)  {
			double currentMax = 0.0;
			int index = headerSet.indexOf("«m.input.name»");
			for (ArrayList<String> record : records) {
				double val = Double.parseDouble(record.get(index)); //Getting values from CSVRecord returns Strings
				if (val > currentMax) {
					currentMax = val;
				}
			}
			
			return currentMax;
		}
	'''
	
	def dispatch CharSequence statfunc(Min m) '''
		private double  min«m.input.name»(ArrayList<ArrayList<String>> records)  {
			double currentMin = Integer.MAX_VALUE;
			int index = headerSet.indexOf("«m.input.name»");
			for (ArrayList<String> record : records) {
				double val = Double.parseDouble(record.get(index));
				if (val < currentMin) {
					currentMin = val;
				}
			}
			
			return currentMin;
		}
	'''
	
	def dispatch CharSequence statfunc(Std s) '''
		private double stdDev«s.input.name»(ArrayList<ArrayList<String>> records) {
			double standard_deviation = 0.0;
			int count = 0;
			double total_deviation = 0.0;
			int index = headerSet.indexOf("«s.input.name»");
			double mean = mean«s.input.name»(records);
			for (ArrayList<String> record : records) {
				double val = Double.parseDouble(record.get(index));
				total_deviation += val - mean;
				count++;	
			}
			
			standard_deviation = Math.sqrt(Math.pow(total_deviation, 2)/count);
			
			return standard_deviation;
		}
	'''
	
	def dispatch CharSequence statfunc(Mean m) '''
		private double mean«m.input.name»(ArrayList<ArrayList<String>> records) {
			int count = 0;
			double sum = 0.0;
			double mean = 0.0;
			int index = headerSet.indexOf("«m.input.name»");
			for (ArrayList<String> record : records) {
				double val = Double.parseDouble(record.get(index));
				sum += val;
				count++;
			}
			
			mean = sum / count;
			
			return mean;
		} 
	'''
	
	def dispatch CharSequence statfunc(SumFunc s) '''
		private double sum«s.input.name»(ArrayList<ArrayList<String>> records)  {
			double currentSum = 0;
			int index = headerSet.indexOf("«s.input.name»");
			for (ArrayList<String> record : records) {
				double val = Double.parseDouble(record.get(index));
				currentSum += val;
			}
			
			return currentSum;
		}	
	'''
	
	def CharSequence ShowConstraint(Constraint constraint) '''
		public ArrayList<ArrayList<String>> check«constraint.name.name»(ArrayList<ArrayList<String>> records) {
			ArrayList<ArrayList<String>> _return = new ArrayList<ArrayList<String>>();
			int index = headerSet.indexOf("«constraint.name.name»");
			for (ArrayList<String> record : records) {
				if («IF constraint.name.type instanceof Date»«ShowExpressionDate(constraint.exp)»«ELSEIF constraint.name.type instanceof Integ || constraint.name.type instanceof Floa»«ShowExpressionNumber(constraint.exp)»«ELSE»«ShowExpressionString(constraint.exp)»«ENDIF») {
					_return.add(record);
				}
			}
			
			return _return;
		}
	'''
	
	def dispatch CharSequence GenerateModInvocation(External ext) '''«ext.name»(records)''' 
	
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