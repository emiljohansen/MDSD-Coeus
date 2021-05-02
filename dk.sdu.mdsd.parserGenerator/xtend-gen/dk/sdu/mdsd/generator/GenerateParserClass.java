package dk.sdu.mdsd.generator;

import dk.sdu.mdsd.cSVParserGenerator.Output;
import dk.sdu.mdsd.cSVParserGenerator.Parser;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

@SuppressWarnings("all")
public class GenerateParserClass extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public CharSequence generateParserClass(final Parser p) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("import java.io.*;");
    _builder.newLine();
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.apache.commons.csv.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("private final String fileName = \"");
    String _name = p.getFile().getName();
    _builder.append(_name);
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    {
      Output _out = p.getOut();
      boolean _tripleNotEquals = (_out != null);
      if (_tripleNotEquals) {
        _builder.append("private final String outputName \"");
        String _name_1 = p.getOut().getName();
        _builder.append(_name_1);
        _builder.append("\";");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class CSVParser {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("try {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("} catch (IOException e) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("e.printStacktrace();");
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
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateExternalInterface() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
}
