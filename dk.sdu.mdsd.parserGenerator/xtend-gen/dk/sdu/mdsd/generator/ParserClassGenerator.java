package dk.sdu.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mdsd.cSVParserGenerator.Add;
import dk.sdu.mdsd.cSVParserGenerator.And;
import dk.sdu.mdsd.cSVParserGenerator.ColumnAction;
import dk.sdu.mdsd.cSVParserGenerator.ColumnVar;
import dk.sdu.mdsd.cSVParserGenerator.Constraint;
import dk.sdu.mdsd.cSVParserGenerator.Div;
import dk.sdu.mdsd.cSVParserGenerator.Equ;
import dk.sdu.mdsd.cSVParserGenerator.Expression;
import dk.sdu.mdsd.cSVParserGenerator.External;
import dk.sdu.mdsd.cSVParserGenerator.Geq;
import dk.sdu.mdsd.cSVParserGenerator.Gt;
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
import dk.sdu.mdsd.cSVParserGenerator.StatFunc;
import dk.sdu.mdsd.cSVParserGenerator.Std;
import dk.sdu.mdsd.cSVParserGenerator.SumFunc;
import dk.sdu.mdsd.cSVParserGenerator.ValueMod;
import java.util.Arrays;
import java.util.Iterator;
import org.eclipse.emf.common.util.EList;
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
    _builder.newLine();
    _builder.append("import org.apache.commons.csv.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class CSVParser {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private final String fileName = \"");
    String _name = p.getFile().getName();
    _builder.append(_name, "\t");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    {
      Output _out = p.getOut();
      boolean _tripleNotEquals = (_out != null);
      if (_tripleNotEquals) {
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
    _builder.append("private Iterable<CSVRecord> records;");
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
    _builder.append("private CSVPrinter printer = null;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private org.apache.commons.csv.CSVParser parser = null;");
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
    _builder.append("\t\t\t");
    _builder.append("FileReader in = new FileReader(fileName);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("parser = CSVFormat.DEFAULT.withHeader(\"column1\",\"column2\",\"column3\").parse(in);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("records = parser.getRecords();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("headerSet = parser.getHeaderNames();");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      final Function1<Modification, Boolean> _function = (Modification mod) -> {
        return Boolean.valueOf((!(mod instanceof StatFunc)));
      };
      Iterable<Modification> _filter = IterableExtensions.<Modification>filter(p.getMods(), _function);
      for(final Modification mod : _filter) {
        _builder.append("\t\t\t");
        _builder.append("records = ");
        CharSequence _GenerateModInvocation = this.GenerateModInvocation(mod);
        _builder.append(_GenerateModInvocation, "\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      final Function1<Modification, Boolean> _function_1 = (Modification mod_1) -> {
        return Boolean.valueOf((mod_1 instanceof StatFunc));
      };
      Iterable<Modification> _filter_1 = IterableExtensions.<Modification>filter(p.getMods(), _function_1);
      for(final Modification mod_1 : _filter_1) {
        _builder.append("\t\t\t");
        _builder.append("System.out.println(");
        CharSequence _GenerateModInvocation_1 = this.GenerateModInvocation(mod_1);
        _builder.append(_GenerateModInvocation_1, "\t\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    {
      Output _out_1 = p.getOut();
      boolean _tripleNotEquals_1 = (_out_1 != null);
      if (_tripleNotEquals_1) {
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("printer = new CSVPrinter(new FileWriter(outputName), CSVFormat.DEFAULT);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("printer.printRecord(headerSet);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("printer.printRecords(records);");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.newLine();
      } else {
        _builder.append("\t\t\t");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("for (CSVRecord record : records) {");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("\t");
        _builder.append("System.out.println(record.toString());");
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
    _builder.newLine();
    {
      EList<Modification> _mods = p.getMods();
      for(final Modification mods : _mods) {
        _builder.append("\t");
        CharSequence _switchResult = null;
        boolean _matched = false;
        if (mods instanceof Expression) {
          _matched=true;
          _switchResult = this.ShowExpression(((Expression)mods));
        }
        if (!_matched) {
          if (mods instanceof ValueMod) {
            _matched=true;
            _switchResult = this.ShowValueMod(((ValueMod)mods));
          }
        }
        if (!_matched) {
          if (mods instanceof External) {
            _matched=true;
            _switchResult = this.ShowExternalFunc(((External)mods));
          }
        }
        if (!_matched) {
          if (mods instanceof StatFunc) {
            _matched=true;
            _switchResult = this.statfunc(((StatFunc)mods));
          }
        }
        if (!_matched) {
          if (mods instanceof ColumnAction) {
            _matched=true;
            _switchResult = this.ShowColumnAction(((ColumnAction)mods));
          }
        }
        if (!_matched) {
          if (mods instanceof Constraint) {
            _matched=true;
            _switchResult = this.ShowConstraint(((Constraint)mods));
          }
        }
        if (!_matched) {
          _switchResult = "";
        }
        _builder.append(_switchResult, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
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
    _builder.append("import org.apache.commons.csv.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public interface ExternalCheck {");
    _builder.newLine();
    {
      final Function1<Modification, Boolean> _function = (Modification x) -> {
        return Boolean.valueOf((x instanceof External));
      };
      Iterable<Modification> _filter = IterableExtensions.<Modification>filter(p.getMods(), _function);
      for(final Modification ext : _filter) {
        _builder.append("\t");
        CharSequence _GenerateInterfaceFunc = this.GenerateInterfaceFunc(((External) ext));
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
    _builder.append("private Iterable<CSVRecord> addColumn");
    String _name = add.getName();
    _builder.append(_name);
    _builder.append("(Iterable<CSVRecord> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<CSVRecord> _return = new ArrayList<CSVRecord>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (CSVRecord record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("record.get(\"");
    String _name_1 = add.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\") = String.valueOf((");
    CharSequence _ShowExpression = this.ShowExpression(add.getMod());
    _builder.append(_ShowExpression, "\t\t");
    _builder.append("));");
    _builder.newLineIfNotEmpty();
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
    _builder.append("private Iterable<CSVRecord> remColumn");
    String _name = rem.getName().getName();
    _builder.append(_name);
    _builder.append("(Iterable<CSVRecord> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<CSVRecord> _return = new ArrayList<CSVRecord>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (CSVRecord record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("record.get(\"");
    String _name_1 = rem.getName().getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\") = null;");
    _builder.newLineIfNotEmpty();
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
  
  public CharSequence ShowValueMod(final ValueMod vm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public Iterable<CSVRecord> ");
    String _name = vm.getName().getName();
    _builder.append(_name);
    _builder.append("ModifyValue(Iterable<CSVRecord> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<CSVRecord> _return = new ArrayList<CSVRecord>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (CSVRecord record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("record.get(\"");
    String _name_1 = vm.getName().getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\") = String.valueOf(");
    CharSequence _ShowExpression = this.ShowExpression(vm.getExp());
    _builder.append(_ShowExpression, "\t\t");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
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
  
  public CharSequence ShowExpression(final Expression exp) {
    String _switchResult = null;
    boolean _matched = false;
    if (exp instanceof Plus) {
      _matched=true;
      CharSequence _ShowExpression = this.ShowExpression(((Plus)exp).getLeft());
      String _plus = (_ShowExpression + "+");
      CharSequence _ShowExpression_1 = this.ShowExpression(((Plus)exp).getRight());
      _switchResult = (_plus + _ShowExpression_1);
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Minus)exp).getLeft());
        String _plus = (_ShowExpression + "-");
        CharSequence _ShowExpression_1 = this.ShowExpression(((Minus)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Mult)exp).getLeft());
        String _plus = (_ShowExpression + "*");
        CharSequence _ShowExpression_1 = this.ShowExpression(((Mult)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Div) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Div)exp).getLeft());
        String _plus = (_ShowExpression + "/");
        CharSequence _ShowExpression_1 = this.ShowExpression(((Div)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Or) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Or)exp).getLeft());
        String _plus = (_ShowExpression + "||");
        CharSequence _ShowExpression_1 = this.ShowExpression(((Or)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof And) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((And)exp).getLeft());
        String _plus = (_ShowExpression + "&&");
        CharSequence _ShowExpression_1 = this.ShowExpression(((And)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Gt) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Gt)exp).getLeft());
        String _plus = (_ShowExpression + ">");
        CharSequence _ShowExpression_1 = this.ShowExpression(((Gt)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Lt) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Lt)exp).getLeft());
        String _plus = (_ShowExpression + "<");
        CharSequence _ShowExpression_1 = this.ShowExpression(((Lt)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Equ) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Equ)exp).getLeft());
        String _plus = (_ShowExpression + "==");
        CharSequence _ShowExpression_1 = this.ShowExpression(((Equ)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Neq) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Neq)exp).getLeft());
        String _plus = (_ShowExpression + "!=");
        CharSequence _ShowExpression_1 = this.ShowExpression(((Neq)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Geq) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Geq)exp).getLeft());
        String _plus = (_ShowExpression + "=>");
        CharSequence _ShowExpression_1 = this.ShowExpression(((Geq)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Leq) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Leq)exp).getLeft());
        String _plus = (_ShowExpression + "=<");
        CharSequence _ShowExpression_1 = this.ShowExpression(((Leq)exp).getRight());
        _switchResult = (_plus + _ShowExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Parens) {
        _matched=true;
        CharSequence _ShowExpression = this.ShowExpression(((Parens)exp).getExp());
        String _plus = ("(" + _ShowExpression);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof ColumnVar) {
        _matched=true;
        String _name = ((ColumnVar)exp).getName().getName();
        String _plus = ("Double.parseDouble(record.get(\"" + _name);
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
      _switchResult = "";
    }
    return _switchResult;
  }
  
  public CharSequence ShowExternalFunc(final External ext) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public Iterable<CSVRecord> ");
    String _name = ext.getName();
    _builder.append(_name);
    _builder.append("ExternalCheck(Iterable<CSVRecord> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<CSVRecord> _return = new ArrayList<CSVRecord>(); ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (CSVRecord record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (externals.");
    String _name_1 = ext.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("(record)) {");
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
  
  public CharSequence GenerateInterfaceFunc(final External ext) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public boolean ");
    String _name = ext.getName();
    _builder.append(_name);
    _builder.append("(CSVRecord record);");
    return _builder;
  }
  
  protected CharSequence _statfunc(final Max m) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("private double max");
    String _name = m.getInput().getName();
    _builder.append(_name);
    _builder.append("(Iterable<CSVRecord> records)  {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("double currentMax = 0.0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (CSVRecord record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double val = Double.parseDouble(record.get(\"");
    String _name_1 = m.getInput().getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\")); //Getting values from CSVRecord returns Strings");
    _builder.newLineIfNotEmpty();
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
    _builder.append("(Iterable<CSVRecord> records)  {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("double currentMin = INTEGER_MAX;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (CSVRecord record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double val = Double.parseDouble(record.get(\"");
    String _name_1 = m.getInput().getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\"));");
    _builder.newLineIfNotEmpty();
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
    _builder.append("(Iterable<CSVRecord> records) {");
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
    _builder.append("double mean = mean");
    String _name_1 = s.getInput().getName();
    _builder.append(_name_1, "\t");
    _builder.append("(records);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("for (CSVRecord record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double val = Double.parseDouble(record.get(\"");
    String _name_2 = s.getInput().getName();
    _builder.append(_name_2, "\t\t");
    _builder.append("\"));");
    _builder.newLineIfNotEmpty();
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
    _builder.append("(Iterable<CSVRecord> records) {");
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
    _builder.append("for (CSVRecord record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double val = Double.parseDouble(record.get(\"");
    String _name_1 = m.getInput().getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\"));");
    _builder.newLineIfNotEmpty();
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
    _builder.append("(Iterable<CSVRecord> records)  {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("double currentSum = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (CSVRecord record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("double val = Double.parseDouble(record.get(\"");
    String _name_1 = s.getInput().getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("\"));");
    _builder.newLineIfNotEmpty();
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
    _builder.append("public Iterable<CSVRecord> check");
    String _name = constraint.getName().getName();
    _builder.append(_name);
    _builder.append("(Iterable<CSVRecord> records) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ArrayList<CSVRecord> _return = new ArrayList<CSVRecord>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (CSVRecord record : records) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if (");
    CharSequence _ShowExpression = this.ShowExpression(constraint.getExp());
    _builder.append(_ShowExpression, "\t\t");
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
    _builder.append("ExternalCheck(records)");
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
  
  public CharSequence GenerateModInvocation(final Modification ca) {
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
