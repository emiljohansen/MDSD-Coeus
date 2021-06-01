package dk.sdu.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mdsd.cSVParserGenerator.Add;
import dk.sdu.mdsd.cSVParserGenerator.And;
import dk.sdu.mdsd.cSVParserGenerator.ColAct;
import dk.sdu.mdsd.cSVParserGenerator.ColDecl;
import dk.sdu.mdsd.cSVParserGenerator.ColumnAction;
import dk.sdu.mdsd.cSVParserGenerator.ColumnVar;
import dk.sdu.mdsd.cSVParserGenerator.Constrain;
import dk.sdu.mdsd.cSVParserGenerator.Constraint;
import dk.sdu.mdsd.cSVParserGenerator.Date;
import dk.sdu.mdsd.cSVParserGenerator.DateLit;
import dk.sdu.mdsd.cSVParserGenerator.Div;
import dk.sdu.mdsd.cSVParserGenerator.Equ;
import dk.sdu.mdsd.cSVParserGenerator.Expression;
import dk.sdu.mdsd.cSVParserGenerator.Ext;
import dk.sdu.mdsd.cSVParserGenerator.External;
import dk.sdu.mdsd.cSVParserGenerator.FileDecl;
import dk.sdu.mdsd.cSVParserGenerator.Floa;
import dk.sdu.mdsd.cSVParserGenerator.Geq;
import dk.sdu.mdsd.cSVParserGenerator.Gt;
import dk.sdu.mdsd.cSVParserGenerator.Integ;
import dk.sdu.mdsd.cSVParserGenerator.Leq;
import dk.sdu.mdsd.cSVParserGenerator.Lt;
import dk.sdu.mdsd.cSVParserGenerator.Max;
import dk.sdu.mdsd.cSVParserGenerator.Mean;
import dk.sdu.mdsd.cSVParserGenerator.Min;
import dk.sdu.mdsd.cSVParserGenerator.Minus;
import dk.sdu.mdsd.cSVParserGenerator.Modification;
import dk.sdu.mdsd.cSVParserGenerator.Mult;
import dk.sdu.mdsd.cSVParserGenerator.Neq;
import dk.sdu.mdsd.cSVParserGenerator.Num;
import dk.sdu.mdsd.cSVParserGenerator.Or;
import dk.sdu.mdsd.cSVParserGenerator.Output;
import dk.sdu.mdsd.cSVParserGenerator.Parens;
import dk.sdu.mdsd.cSVParserGenerator.Parser;
import dk.sdu.mdsd.cSVParserGenerator.Plus;
import dk.sdu.mdsd.cSVParserGenerator.Rem;
import dk.sdu.mdsd.cSVParserGenerator.Stat;
import dk.sdu.mdsd.cSVParserGenerator.StatFunc;
import dk.sdu.mdsd.cSVParserGenerator.Std;
import dk.sdu.mdsd.cSVParserGenerator.Str;
import dk.sdu.mdsd.cSVParserGenerator.StringLit;
import dk.sdu.mdsd.cSVParserGenerator.SumFunc;
import dk.sdu.mdsd.cSVParserGenerator.Type;
import dk.sdu.mdsd.cSVParserGenerator.ValueM;
import dk.sdu.mdsd.cSVParserGenerator.ValueMod;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ParserClassGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterator<Parser> parser = Iterators.<Parser>filter(input.getAllContents(), Parser.class);
    Parser program = parser.next();
    fsa.generateFile("/parser/src/dk/sdu/mmmi/parser/CSVParser.java", this.generateParserClass(program));
    fsa.generateFile("/parser/src/dk/sdu/mmmi/parser/ExternalCheck.java", this.generateExternalInterface(program));
  }
  
  public CharSequence generateParserClass(final Parser p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package dk.sdu.mmmi.parser;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.*;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import java.time.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class CSVParser {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      FileDecl _file = p.getFile();
      boolean _tripleNotEquals = (_file != null);
      if (_tripleNotEquals) {
        _builder.append("private final String fileName = \"");
        String _name = p.getFile().getName();
        _builder.append(_name, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("private final String separator = \"");
        String _sepchar = p.getFile().getSepchar();
        _builder.append(_sepchar, "\t");
        _builder.append("\";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    {
      Output _out = p.getOut();
      boolean _tripleNotEquals_1 = (_out != null);
      if (_tripleNotEquals_1) {
        _builder.append("private final String outputName = \"");
        String _name_1 = p.getOut().getName();
        _builder.append(_name_1, "\t");
        _builder.append("\";");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      FileDecl _file_1 = p.getFile();
      boolean _tripleEquals = (_file_1 == null);
      if (_tripleEquals) {
        _builder.append("private final String separator = \",\";");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ArrayList<ArrayList<String>> records;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private ExternalCheck externals;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<String> headerSet;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public CSVParser(ExternalCheck externals) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.externals = externals;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void parse() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      FileDecl _file_2 = p.getFile();
      boolean _tripleEquals_1 = (_file_2 == null);
      if (_tripleEquals_1) {
        _builder.append("\t\t\t");
        _builder.append("records = generateNewFileRecords();");
        _builder.newLine();
      } else {
        _builder.append("\t\t\t");
        _builder.append("records = new ArrayList<ArrayList<String>>();");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("FileReader in = new FileReader(fileName);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("BufferedReader reader = new BufferedReader(in);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("String line;");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("while ((line = reader.readLine()) != null) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("List<String> temp = Arrays.asList(line.split(separator));");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("ArrayList<String> record = new ArrayList<>(temp);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("records.add(record);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
      }
    }
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("headerSet = records.get(0);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// Take out the headers as types do not hold for them.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("records.remove(0);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      EList<Modification> _mods = p.getMods();
      for(final Modification mod : _mods) {
        _builder.append("\t\t\t");
        CharSequence _intermediateMods = this.intermediateMods(mod);
        _builder.append(_intermediateMods, "\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      Output _out_1 = p.getOut();
      boolean _tripleNotEquals_2 = (_out_1 != null);
      if (_tripleNotEquals_2) {
        _builder.append("\t\t\t");
        _builder.append("BufferedWriter writer = new BufferedWriter(new FileWriter(outputName));");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("for (String s : headerSet) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("writer.write(s + separator);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("writer.write(\"\\n\");");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("for (ArrayList<String> record : records) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("for (String s : record) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("writer.write(s + separator);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("writer.write(\"\\n\");");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("writer.close();");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
      } else {
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("System.out.println(headerSet);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("for (ArrayList<String> record : records) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("for (String s : record) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t\t");
        _builder.append("System.out.print(s + separator);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("System.out.print(\"\\n\");");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch (IOException e) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      FileDecl _file_3 = p.getFile();
      boolean _tripleEquals_2 = (_file_3 == null);
      if (_tripleEquals_2) {
        CharSequence _generateNewFileFunc = this.generateNewFileFunc(p);
        _builder.append(_generateNewFileFunc, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Modification> _mods_1 = p.getMods();
      for(final Modification mod_1 : _mods_1) {
        _builder.append("\t");
        CharSequence _modFuncGen = this.modFuncGen(mod_1);
        _builder.append(_modFuncGen, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _intermediateMods(final ValueM m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ValueMod> _mods = m.getMods();
      for(final ValueMod vm : _mods) {
        _builder.append("records = ");
        CharSequence _GenerateModInvocation = this.GenerateModInvocation(vm);
        _builder.append(_GenerateModInvocation);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    return _builder;
  }
  
  protected CharSequence _intermediateMods(final ColAct m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ColumnAction> _mods = m.getMods();
      for(final ColumnAction ca : _mods) {
        _builder.append("records = ");
        CharSequence _GenerateModInvocation = this.GenerateModInvocation(ca);
        _builder.append(_GenerateModInvocation);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    return _builder;
  }
  
  protected CharSequence _intermediateMods(final Constrain m) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Constraint> _mods = m.getMods();
      for(final Constraint c : _mods) {
        _builder.append("records = ");
        CharSequence _GenerateModInvocation = this.GenerateModInvocation(c);
        _builder.append(_GenerateModInvocation);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    return _builder;
  }
  
  protected CharSequence _intermediateMods(final Ext e) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<External> _mods = e.getMods();
      for(final External ext : _mods) {
        _builder.append("records = externals.");
        CharSequence _GenerateModInvocation = this.GenerateModInvocation(ext);
        _builder.append(_GenerateModInvocation);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    return _builder;
  }
  
  protected CharSequence _intermediateMods(final Stat s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<StatFunc> _mods = s.getMods();
      for(final StatFunc st : _mods) {
        _builder.append(" System.out.println(");
        CharSequence _GenerateModInvocation = this.GenerateModInvocation(st);
        _builder.append(_GenerateModInvocation);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
      }
    }
    return _builder;
  }
  
  protected CharSequence _modFuncGen(final ValueM vm) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ValueMod> _mods = vm.getMods();
      for(final ValueMod v : _mods) {
        CharSequence _ShowValueMod = this.ShowValueMod(v);
        _builder.append(_ShowValueMod);
      }
    }
    return _builder;
  }
  
  protected CharSequence _modFuncGen(final ColAct ca) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ColumnAction> _mods = ca.getMods();
      for(final ColumnAction c : _mods) {
        CharSequence _ShowColumnAction = this.ShowColumnAction(c);
        _builder.append(_ShowColumnAction);
      }
    }
    return _builder;
  }
  
  protected CharSequence _modFuncGen(final Ext ex) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<External> _mods = ex.getMods();
      for(final External e : _mods) {
        CharSequence _ShowExternalFunc = this.ShowExternalFunc(e);
        _builder.append(_ShowExternalFunc);
      }
    }
    return _builder;
  }
  
  protected CharSequence _modFuncGen(final Constrain con) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Constraint> _mods = con.getMods();
      for(final Constraint c : _mods) {
        CharSequence _ShowConstraint = this.ShowConstraint(c);
        _builder.append(_ShowConstraint);
      }
    }
    return _builder;
  }
  
  protected CharSequence _modFuncGen(final Stat st) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<StatFunc> _mods = st.getMods();
      for(final StatFunc s : _mods) {
        CharSequence _statfunc = this.statfunc(s);
        _builder.append(_statfunc);
      }
    }
    return _builder;
  }
  
  public CharSequence generateNewFileFunc(final Parser p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ArrayList<ArrayList<String>> generateNewFileRecords() {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ArrayList<ArrayList<String>> _return = new ArrayList<ArrayList<String>>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// Instantiate header list");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ArrayList<String> headers = new ArrayList<String>() {");
    {
      EList<ColDecl> _columns = p.getColumns();
      boolean _hasElements = false;
      for(final ColDecl col : _columns) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\"");
        String _name = col.getName();
        _builder.append(_name, "\t");
        _builder.append("\"");
      }
    }
    _builder.append("};");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("_return.add(headers);");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (int i = 0; i < ");
    int _number = p.getOut().getNumber();
    _builder.append(_number, "\t");
    _builder.append("; i++) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("ArrayList<String> newRecord = new ArrayList<String>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (int j = 0; j < headers.size(); j++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("// Fill new records with empty strings, that can later be modified.");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("newRecord.add(j, \"\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("_return.add(newRecord);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return _return;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateExternalInterface(final Parser p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package dk.sdu.mmmi.parser;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.*;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface ExternalCheck {");
    _builder.newLine();
    {
      final Function1<Modification, Boolean> _function = (Modification x) -> {
        return Boolean.valueOf((x instanceof Ext));
      };
      Iterable<Modification> _filter = IterableExtensions.<Modification>filter(p.getMods(), _function);
      for(final Modification ex : _filter) {
        _builder.append("\t");
        CharSequence _GenerateInterfaceFunc = this.GenerateInterfaceFunc(((Ext) ex));
        _builder.append(_GenerateInterfaceFunc, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence ShowColumnAction(final ColumnAction ca) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (ca instanceof Add) {
      _matched=true;
      _switchResult = this.AddColumn(((Add)ca));
    }
    if (!_matched) {
      if (ca instanceof Rem) {
        _matched=true;
        _switchResult = this.RemColumn(((Rem)ca));
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public CharSequence AddColumn(final Add add) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ArrayList<ArrayList<String>> addColumn");
    String _name = add.getName();
    _builder.append(_name);
    _builder.append("(ArrayList<ArrayList<String>> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<ArrayList<String>> _return = new ArrayList<ArrayList<String>>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("headerSet.add(\"");
    String _name_1 = add.getName();
    _builder.append(_name_1, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("int index = headerSet.indexOf(\"");
    String _name_2 = add.getName();
    _builder.append(_name_2, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (ArrayList<String> record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var value = ");
    CharSequence _ShowExpression = this.ShowExpression(add.getType(), add.getMod());
    _builder.append(_ShowExpression, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("record.set(index, value);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("_return.add(record);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return _return;");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence RemColumn(final Rem rem) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private ArrayList<ArrayList<String>> remColumn");
    String _name = rem.getName().getName();
    _builder.append(_name);
    _builder.append("(ArrayList<ArrayList<String>> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<ArrayList<String>> _return = new ArrayList<ArrayList<String>>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int index = headerSet.indexOf(\"");
    String _name_1 = rem.getName().getName();
    _builder.append(_name_1, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (ArrayList<String> record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("record.remove(index);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("_return.add(record);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("headerSet.remove(\"");
    String _name_2 = rem.getName().getName();
    _builder.append(_name_2, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return _return;");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence ShowValueMod(final ValueMod vm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ArrayList<ArrayList<String>> ");
    String _name = vm.getName().getName();
    _builder.append(_name);
    _builder.append("ModifyValue(ArrayList<ArrayList<String>> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<ArrayList<String>> _return = new ArrayList<ArrayList<String>>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int index = headerSet.indexOf(\"");
    String _name_1 = vm.getName().getName();
    _builder.append(_name_1, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (ArrayList<String> record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("var value = record.get(index);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("value = ");
    CharSequence _ShowExpression = this.ShowExpression(vm.getName().getType(), vm.getExp());
    _builder.append(_ShowExpression, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("record.set(index, value);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("_return.add(record);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return _return;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence ShowExpression(final Type t, final Expression exp) {
    CharSequence _switchResult = null;
    boolean _matched = false;
    if (t instanceof Date) {
      _matched=true;
      CharSequence _ShowExpressionDate = this.ShowExpressionDate(exp);
      _switchResult = (_ShowExpressionDate + ".toString()");
    }
    if (!_matched) {
      if (t instanceof Floa) {
        _matched=true;
      }
      if (!_matched) {
        if (t instanceof Integ) {
          _matched=true;
        }
      }
      if (_matched) {
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(exp);
        String _plus = ("String.valueOf(" + _ShowExpressionNumber);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (t instanceof Str) {
        _matched=true;
        _switchResult = this.ShowExpressionString(exp);
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public CharSequence ShowExpressionNumber(final Expression exp) {
    String _switchResult = null;
    boolean _matched = false;
    if (exp instanceof Plus) {
      _matched=true;
      CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Plus)exp).getLeft());
      String _plus = (_ShowExpressionNumber + "+");
      CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Plus)exp).getRight());
      _switchResult = (_plus + _ShowExpressionNumber_1);
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Minus)exp).getLeft());
        String _plus = (_ShowExpressionNumber + "-");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Minus)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Mult)exp).getLeft());
        String _plus = (_ShowExpressionNumber + "*");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Mult)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Div) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Div)exp).getLeft());
        String _plus = (_ShowExpressionNumber + "/");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Div)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Or) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Or)exp).getLeft());
        String _plus = (_ShowExpressionNumber + "||");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Or)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof And) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((And)exp).getLeft());
        String _plus = (_ShowExpressionNumber + "&&");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((And)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Gt) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Gt)exp).getLeft());
        String _plus = (_ShowExpressionNumber + ">");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Gt)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Lt) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Lt)exp).getLeft());
        String _plus = (_ShowExpressionNumber + "<");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Lt)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Equ) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Equ)exp).getLeft());
        String _plus = (_ShowExpressionNumber + "==");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Equ)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Neq) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Neq)exp).getLeft());
        String _plus = (_ShowExpressionNumber + "!=");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Neq)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Geq) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Geq)exp).getLeft());
        String _plus = (_ShowExpressionNumber + "=>");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Geq)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Leq) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Leq)exp).getLeft());
        String _plus = (_ShowExpressionNumber + "=<");
        CharSequence _ShowExpressionNumber_1 = this.ShowExpressionNumber(((Leq)exp).getRight());
        _switchResult = (_plus + _ShowExpressionNumber_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Parens) {
        _matched=true;
        CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(((Parens)exp).getExp());
        String _plus = ("(" + _ShowExpressionNumber);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof ColumnVar) {
        _matched=true;
        String _name = ((ColumnVar)exp).getName().getName();
        String _plus = ("Double.parseDouble(record.get(headerSet.indexOf(\"" + _name);
        _switchResult = (_plus + "\")))");
      }
    }
    if (!_matched) {
      if (exp instanceof Num) {
        _matched=true;
        _switchResult = Integer.valueOf(((Num)exp).getValue()).toString();
      }
    }
    if (!_matched) {
      if (exp instanceof DateLit) {
        _matched=true;
        String _value = ((DateLit)exp).getValue();
        String _plus = ("LocalDate.parse(\"" + _value);
        _switchResult = (_plus + "\")");
      }
    }
    if (!_matched) {
      if (exp instanceof StringLit) {
        _matched=true;
        _switchResult = ((StringLit)exp).getValue();
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public CharSequence ShowExpressionDate(final Expression exp) {
    String _switchResult = null;
    boolean _matched = false;
    if (exp instanceof Plus) {
      _matched=true;
      CharSequence _ShowExpressionDate = this.ShowExpressionDate(((Plus)exp).getLeft());
      String _plus = (_ShowExpressionDate + ".plusDays(");
      CharSequence _ShowExpressionDate_1 = this.ShowExpressionDate(((Plus)exp).getRight());
      String _plus_1 = (_plus + _ShowExpressionDate_1);
      _switchResult = (_plus_1 + ")");
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(((Minus)exp).getLeft());
        String _plus = (_ShowExpressionDate + "minusDays(");
        CharSequence _ShowExpressionDate_1 = this.ShowExpressionDate(((Minus)exp).getRight());
        String _plus_1 = (_plus + _ShowExpressionDate_1);
        _switchResult = (_plus_1 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Or) {
        _matched=true;
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(((Or)exp).getLeft());
        String _plus = (_ShowExpressionDate + "||");
        CharSequence _ShowExpressionDate_1 = this.ShowExpressionDate(((Or)exp).getRight());
        _switchResult = (_plus + _ShowExpressionDate_1);
      }
    }
    if (!_matched) {
      if (exp instanceof And) {
        _matched=true;
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(((And)exp).getLeft());
        String _plus = (_ShowExpressionDate + "&&");
        CharSequence _ShowExpressionDate_1 = this.ShowExpressionDate(((And)exp).getRight());
        _switchResult = (_plus + _ShowExpressionDate_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Gt) {
        _matched=true;
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(((Gt)exp).getLeft());
        String _plus = (_ShowExpressionDate + ".isBefore(");
        CharSequence _ShowExpressionDate_1 = this.ShowExpressionDate(((Gt)exp).getRight());
        String _plus_1 = (_plus + _ShowExpressionDate_1);
        _switchResult = (_plus_1 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Lt) {
        _matched=true;
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(((Lt)exp).getLeft());
        String _plus = (_ShowExpressionDate + ".isAfter(");
        CharSequence _ShowExpressionDate_1 = this.ShowExpressionDate(((Lt)exp).getRight());
        String _plus_1 = (_plus + _ShowExpressionDate_1);
        _switchResult = (_plus_1 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Equ) {
        _matched=true;
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(((Equ)exp).getLeft());
        String _plus = (_ShowExpressionDate + ".equals(");
        CharSequence _ShowExpressionDate_1 = this.ShowExpressionDate(((Equ)exp).getRight());
        String _plus_1 = (_plus + _ShowExpressionDate_1);
        _switchResult = (_plus_1 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Neq) {
        _matched=true;
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(((Neq)exp).getLeft());
        String _plus = ("!" + _ShowExpressionDate);
        String _plus_1 = (_plus + ".equals(");
        CharSequence _ShowExpressionDate_1 = this.ShowExpressionDate(((Neq)exp).getRight());
        String _plus_2 = (_plus_1 + _ShowExpressionDate_1);
        _switchResult = (_plus_2 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Geq) {
        _matched=true;
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(((Geq)exp).getLeft());
        String _plus = (_ShowExpressionDate + ".isBefore(");
        CharSequence _ShowExpressionDate_1 = this.ShowExpressionDate(((Geq)exp).getRight());
        String _plus_1 = (_plus + _ShowExpressionDate_1);
        _switchResult = (_plus_1 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Leq) {
        _matched=true;
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(((Leq)exp).getLeft());
        String _plus = (_ShowExpressionDate + ".isAfter(");
        CharSequence _ShowExpressionDate_1 = this.ShowExpressionDate(((Leq)exp).getRight());
        String _plus_1 = (_plus + _ShowExpressionDate_1);
        _switchResult = (_plus_1 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Parens) {
        _matched=true;
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(((Parens)exp).getExp());
        String _plus = ("(" + _ShowExpressionDate);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof ColumnVar) {
        _matched=true;
        String _name = ((ColumnVar)exp).getName().getName();
        String _plus = ("LocalDate.parse((record.get(headerSet.indexOf(\"" + _name);
        _switchResult = (_plus + "\"))))");
      }
    }
    if (!_matched) {
      if (exp instanceof DateLit) {
        _matched=true;
        String _value = ((DateLit)exp).getValue();
        String _plus = ("LocalDate.parse(\"" + _value);
        _switchResult = (_plus + "\")");
      }
    }
    if (!_matched) {
      if (exp instanceof Num) {
        _matched=true;
        _switchResult = Integer.valueOf(((Num)exp).getValue()).toString();
      }
    }
    if (!_matched) {
      if (exp instanceof StringLit) {
        _matched=true;
        _switchResult = ((StringLit)exp).getValue();
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
      }
      if (!_matched) {
        if (exp instanceof Div) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = "";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public CharSequence ShowExpressionString(final Expression exp) {
    String _switchResult = null;
    boolean _matched = false;
    if (exp instanceof Or) {
      _matched=true;
      CharSequence _ShowExpressionString = this.ShowExpressionString(((Or)exp).getLeft());
      String _plus = (_ShowExpressionString + "||");
      CharSequence _ShowExpressionString_1 = this.ShowExpressionString(((Or)exp).getRight());
      _switchResult = (_plus + _ShowExpressionString_1);
    }
    if (!_matched) {
      if (exp instanceof And) {
        _matched=true;
        CharSequence _ShowExpressionString = this.ShowExpressionString(((And)exp).getLeft());
        String _plus = (_ShowExpressionString + "&&");
        CharSequence _ShowExpressionString_1 = this.ShowExpressionString(((And)exp).getRight());
        _switchResult = (_plus + _ShowExpressionString_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Equ) {
        _matched=true;
        CharSequence _ShowExpressionString = this.ShowExpressionString(((Equ)exp).getLeft());
        String _plus = (_ShowExpressionString + ".equals(");
        CharSequence _ShowExpressionString_1 = this.ShowExpressionString(((Equ)exp).getRight());
        String _plus_1 = (_plus + _ShowExpressionString_1);
        _switchResult = (_plus_1 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Neq) {
        _matched=true;
        CharSequence _ShowExpressionString = this.ShowExpressionString(((Neq)exp).getLeft());
        String _plus = ("!" + _ShowExpressionString);
        String _plus_1 = (_plus + ".equals(");
        CharSequence _ShowExpressionString_1 = this.ShowExpressionString(((Neq)exp).getRight());
        String _plus_2 = (_plus_1 + _ShowExpressionString_1);
        _switchResult = (_plus_2 + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Parens) {
        _matched=true;
        CharSequence _ShowExpressionString = this.ShowExpressionString(((Parens)exp).getExp());
        String _plus = ("(" + _ShowExpressionString);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof ColumnVar) {
        _matched=true;
        String _name = ((ColumnVar)exp).getName().getName();
        String _plus = ("(record.get(headerSet.indexOf(\"" + _name);
        _switchResult = (_plus + "\"))");
      }
    }
    if (!_matched) {
      if (exp instanceof Num) {
        _matched=true;
        _switchResult = Integer.valueOf(((Num)exp).getValue()).toString();
      }
    }
    if (!_matched) {
      if (exp instanceof DateLit) {
        _matched=true;
        String _value = ((DateLit)exp).getValue();
        String _plus = ("LocalDate.parse(\"" + _value);
        _switchResult = (_plus + "\")");
      }
    }
    if (!_matched) {
      if (exp instanceof StringLit) {
        _matched=true;
        _switchResult = ((StringLit)exp).getValue();
      }
    }
    if (!_matched) {
      if (exp instanceof Plus) {
        _matched=true;
      }
      if (!_matched) {
        if (exp instanceof Minus) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (exp instanceof Mult) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (exp instanceof Div) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (exp instanceof Geq) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (exp instanceof Leq) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (exp instanceof Gt) {
          _matched=true;
        }
      }
      if (!_matched) {
        if (exp instanceof Lt) {
          _matched=true;
        }
      }
      if (_matched) {
        _switchResult = "";
      }
    }
    if (!_matched) {
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public CharSequence ShowExternalFunc(final External ext) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public CharSequence GenerateInterfaceFunc(final Ext ex) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<External> _mods = ex.getMods();
      for(final External e : _mods) {
        _builder.append(" public ArrayList<ArrayList<String>> ");
        String _name = e.getName();
        _builder.append(_name);
        _builder.append("(ArrayList<ArrayList<String>> records); ");
      }
    }
    return _builder;
  }
  
  protected CharSequence _statfunc(final Max m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private double max");
    String _name = m.getInput().getName();
    _builder.append(_name);
    _builder.append("(ArrayList<ArrayList<String>> records)  {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("double currentMax = 0.0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int index = headerSet.indexOf(\"");
    String _name_1 = m.getInput().getName();
    _builder.append(_name_1, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (ArrayList<String> record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double val = Double.parseDouble(record.get(index)); //Getting values from CSVRecord returns Strings");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (val > currentMax) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("currentMax = val;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return currentMax;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _statfunc(final Min m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private double  min");
    String _name = m.getInput().getName();
    _builder.append(_name);
    _builder.append("(ArrayList<ArrayList<String>> records)  {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("double currentMin = Integer.MAX_VALUE;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int index = headerSet.indexOf(\"");
    String _name_1 = m.getInput().getName();
    _builder.append(_name_1, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (ArrayList<String> record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double val = Double.parseDouble(record.get(index));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (val < currentMin) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("currentMin = val;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return currentMin;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _statfunc(final Std s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private double stdDev");
    String _name = s.getInput().getName();
    _builder.append(_name);
    _builder.append("(ArrayList<ArrayList<String>> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("double standard_deviation = 0.0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int count = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("double total_deviation = 0.0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int index = headerSet.indexOf(\"");
    String _name_1 = s.getInput().getName();
    _builder.append(_name_1, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("double mean = mean");
    String _name_2 = s.getInput().getName();
    _builder.append(_name_2, "\t");
    _builder.append("(records);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (ArrayList<String> record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double val = Double.parseDouble(record.get(index));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("total_deviation += val - mean;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("count++;\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("standard_deviation = Math.sqrt(Math.pow(total_deviation, 2)/count);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return standard_deviation;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _statfunc(final Mean m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private double mean");
    String _name = m.getInput().getName();
    _builder.append(_name);
    _builder.append("(ArrayList<ArrayList<String>> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("int count = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("double sum = 0.0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("double mean = 0.0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int index = headerSet.indexOf(\"");
    String _name_1 = m.getInput().getName();
    _builder.append(_name_1, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (ArrayList<String> record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double val = Double.parseDouble(record.get(index));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("sum += val;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("count++;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("mean = sum / count;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return mean;");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _statfunc(final SumFunc s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private double sum");
    String _name = s.getInput().getName();
    _builder.append(_name);
    _builder.append("(ArrayList<ArrayList<String>> records)  {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("double currentSum = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int index = headerSet.indexOf(\"");
    String _name_1 = s.getInput().getName();
    _builder.append(_name_1, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (ArrayList<String> record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double val = Double.parseDouble(record.get(index));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("currentSum += val;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return currentSum;");
    _builder.newLine();
    _builder.append("}\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence ShowConstraint(final Constraint constraint) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ArrayList<ArrayList<String>> check");
    String _name = constraint.getName().getName();
    _builder.append(_name);
    _builder.append("(ArrayList<ArrayList<String>> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<ArrayList<String>> _return = new ArrayList<ArrayList<String>>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("int index = headerSet.indexOf(\"");
    String _name_1 = constraint.getName().getName();
    _builder.append(_name_1, "\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (ArrayList<String> record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (");
    {
      Type _type = constraint.getName().getType();
      if ((_type instanceof Date)) {
        CharSequence _ShowExpressionDate = this.ShowExpressionDate(constraint.getExp());
        _builder.append(_ShowExpressionDate, "\t\t");
      } else {
        if (((constraint.getName().getType() instanceof Integ) || (constraint.getName().getType() instanceof Floa))) {
          CharSequence _ShowExpressionNumber = this.ShowExpressionNumber(constraint.getExp());
          _builder.append(_ShowExpressionNumber, "\t\t");
        } else {
          CharSequence _ShowExpressionString = this.ShowExpressionString(constraint.getExp());
          _builder.append(_ShowExpressionString, "\t\t");
        }
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("_return.add(record);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return _return;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocation(final External ext) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = ext.getName();
    _builder.append(_name);
    _builder.append("(records)");
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocation(final ColumnAction ca) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _GenerateModInvocationCA = this.GenerateModInvocationCA(ca);
    _builder.append(_GenerateModInvocationCA);
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocation(final ValueMod vm) {
    StringConcatenation _builder = new StringConcatenation();
    String _name = vm.getName().getName();
    _builder.append(_name);
    _builder.append("ModifyValue(records)");
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocation(final StatFunc sf) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _GenerateModInvocationStat = this.GenerateModInvocationStat(sf);
    _builder.append(_GenerateModInvocationStat);
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocation(final Constraint c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("check");
    String _name = c.getName().getName();
    _builder.append(_name);
    _builder.append("(records)");
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocationCA(final Add a) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("addColumn");
    String _name = a.getName();
    _builder.append(_name);
    _builder.append("(records)");
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocationCA(final Rem r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("remColumn");
    String _name = r.getName().getName();
    _builder.append(_name);
    _builder.append("(records)");
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocationStat(final SumFunc s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("sum");
    String _name = s.getInput().getName();
    _builder.append(_name);
    _builder.append("(records)");
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocationStat(final Mean m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mean");
    String _name = m.getInput().getName();
    _builder.append(_name);
    _builder.append("(records)");
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocationStat(final Std s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("stdDev");
    String _name = s.getInput().getName();
    _builder.append(_name);
    _builder.append("(records)");
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocationStat(final Min m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("min");
    String _name = m.getInput().getName();
    _builder.append(_name);
    _builder.append("(records)");
    return _builder;
  }
  
  protected CharSequence _GenerateModInvocationStat(final Max m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("max");
    String _name = m.getInput().getName();
    _builder.append(_name);
    _builder.append("(records)");
    return _builder;
  }
  
  public CharSequence intermediateMods(final Modification m) {
    if (m instanceof ColAct) {
      return _intermediateMods((ColAct)m);
    } else if (m instanceof Constrain) {
      return _intermediateMods((Constrain)m);
    } else if (m instanceof Ext) {
      return _intermediateMods((Ext)m);
    } else if (m instanceof Stat) {
      return _intermediateMods((Stat)m);
    } else if (m instanceof ValueM) {
      return _intermediateMods((ValueM)m);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(m).toString());
    }
  }
  
  public CharSequence modFuncGen(final Modification ca) {
    if (ca instanceof ColAct) {
      return _modFuncGen((ColAct)ca);
    } else if (ca instanceof Constrain) {
      return _modFuncGen((Constrain)ca);
    } else if (ca instanceof Ext) {
      return _modFuncGen((Ext)ca);
    } else if (ca instanceof Stat) {
      return _modFuncGen((Stat)ca);
    } else if (ca instanceof ValueM) {
      return _modFuncGen((ValueM)ca);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ca).toString());
    }
  }
  
  public CharSequence statfunc(final StatFunc m) {
    if (m instanceof Max) {
      return _statfunc((Max)m);
    } else if (m instanceof Mean) {
      return _statfunc((Mean)m);
    } else if (m instanceof Min) {
      return _statfunc((Min)m);
    } else if (m instanceof Std) {
      return _statfunc((Std)m);
    } else if (m instanceof SumFunc) {
      return _statfunc((SumFunc)m);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(m).toString());
    }
  }
  
  public CharSequence GenerateModInvocation(final EObject ca) {
    if (ca instanceof ColumnAction) {
      return _GenerateModInvocation((ColumnAction)ca);
    } else if (ca instanceof Constraint) {
      return _GenerateModInvocation((Constraint)ca);
    } else if (ca instanceof External) {
      return _GenerateModInvocation((External)ca);
    } else if (ca instanceof StatFunc) {
      return _GenerateModInvocation((StatFunc)ca);
    } else if (ca instanceof ValueMod) {
      return _GenerateModInvocation((ValueMod)ca);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ca).toString());
    }
  }
  
  public CharSequence GenerateModInvocationCA(final ColumnAction a) {
    if (a instanceof Add) {
      return _GenerateModInvocationCA((Add)a);
    } else if (a instanceof Rem) {
      return _GenerateModInvocationCA((Rem)a);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a).toString());
    }
  }
  
  public CharSequence GenerateModInvocationStat(final StatFunc m) {
    if (m instanceof Max) {
      return _GenerateModInvocationStat((Max)m);
    } else if (m instanceof Mean) {
      return _GenerateModInvocationStat((Mean)m);
    } else if (m instanceof Min) {
      return _GenerateModInvocationStat((Min)m);
    } else if (m instanceof Std) {
      return _GenerateModInvocationStat((Std)m);
    } else if (m instanceof SumFunc) {
      return _GenerateModInvocationStat((SumFunc)m);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(m).toString());
    }
  }
}
