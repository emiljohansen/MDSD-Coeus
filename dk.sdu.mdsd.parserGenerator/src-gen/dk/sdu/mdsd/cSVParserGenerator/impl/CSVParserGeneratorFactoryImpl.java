/**
 * generated by Xtext 2.21.0
 */
package dk.sdu.mdsd.cSVParserGenerator.impl;

import dk.sdu.mdsd.cSVParserGenerator.Add;
import dk.sdu.mdsd.cSVParserGenerator.And;
import dk.sdu.mdsd.cSVParserGenerator.CSVParserGeneratorFactory;
import dk.sdu.mdsd.cSVParserGenerator.CSVParserGeneratorPackage;
import dk.sdu.mdsd.cSVParserGenerator.ColAct;
import dk.sdu.mdsd.cSVParserGenerator.ColDecl;
import dk.sdu.mdsd.cSVParserGenerator.ColumnAction;
import dk.sdu.mdsd.cSVParserGenerator.ColumnVar;
import dk.sdu.mdsd.cSVParserGenerator.Constrain;
import dk.sdu.mdsd.cSVParserGenerator.Constraint;
import dk.sdu.mdsd.cSVParserGenerator.Date;
import dk.sdu.mdsd.cSVParserGenerator.DateLit;
import dk.sdu.mdsd.cSVParserGenerator.DateLiteral;
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
import dk.sdu.mdsd.cSVParserGenerator.StringLiteral;
import dk.sdu.mdsd.cSVParserGenerator.SumFunc;
import dk.sdu.mdsd.cSVParserGenerator.Type;
import dk.sdu.mdsd.cSVParserGenerator.ValueM;
import dk.sdu.mdsd.cSVParserGenerator.ValueMod;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSVParserGeneratorFactoryImpl extends EFactoryImpl implements CSVParserGeneratorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CSVParserGeneratorFactory init()
  {
    try
    {
      CSVParserGeneratorFactory theCSVParserGeneratorFactory = (CSVParserGeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(CSVParserGeneratorPackage.eNS_URI);
      if (theCSVParserGeneratorFactory != null)
      {
        return theCSVParserGeneratorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CSVParserGeneratorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVParserGeneratorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CSVParserGeneratorPackage.PARSER: return createParser();
      case CSVParserGeneratorPackage.FILE_DECL: return createFileDecl();
      case CSVParserGeneratorPackage.COL_DECL: return createColDecl();
      case CSVParserGeneratorPackage.MODIFICATION: return createModification();
      case CSVParserGeneratorPackage.OUTPUT: return createOutput();
      case CSVParserGeneratorPackage.VALUE_MOD: return createValueMod();
      case CSVParserGeneratorPackage.TYPE: return createType();
      case CSVParserGeneratorPackage.EXPRESSION: return createExpression();
      case CSVParserGeneratorPackage.PARENS: return createParens();
      case CSVParserGeneratorPackage.EXTERNAL: return createExternal();
      case CSVParserGeneratorPackage.STAT_FUNC: return createStatFunc();
      case CSVParserGeneratorPackage.COLUMN_ACTION: return createColumnAction();
      case CSVParserGeneratorPackage.COLUMN_VAR: return createColumnVar();
      case CSVParserGeneratorPackage.NUMBER: return createNumber();
      case CSVParserGeneratorPackage.CONSTRAINT: return createConstraint();
      case CSVParserGeneratorPackage.DATE_LITERAL: return createDateLiteral();
      case CSVParserGeneratorPackage.STRING_LITERAL: return createStringLiteral();
      case CSVParserGeneratorPackage.VALUE_M: return createValueM();
      case CSVParserGeneratorPackage.EXT: return createExt();
      case CSVParserGeneratorPackage.STAT: return createStat();
      case CSVParserGeneratorPackage.COL_ACT: return createColAct();
      case CSVParserGeneratorPackage.CONSTRAIN: return createConstrain();
      case CSVParserGeneratorPackage.STR: return createStr();
      case CSVParserGeneratorPackage.INTEG: return createInteg();
      case CSVParserGeneratorPackage.DATE: return createDate();
      case CSVParserGeneratorPackage.FLOA: return createFloa();
      case CSVParserGeneratorPackage.OR: return createOr();
      case CSVParserGeneratorPackage.AND: return createAnd();
      case CSVParserGeneratorPackage.LT: return createLt();
      case CSVParserGeneratorPackage.GT: return createGt();
      case CSVParserGeneratorPackage.EQU: return createEqu();
      case CSVParserGeneratorPackage.NEQ: return createNeq();
      case CSVParserGeneratorPackage.LEQ: return createLeq();
      case CSVParserGeneratorPackage.GEQ: return createGeq();
      case CSVParserGeneratorPackage.MAX: return createMax();
      case CSVParserGeneratorPackage.MIN: return createMin();
      case CSVParserGeneratorPackage.STD: return createStd();
      case CSVParserGeneratorPackage.SUM_FUNC: return createSumFunc();
      case CSVParserGeneratorPackage.MEAN: return createMean();
      case CSVParserGeneratorPackage.ADD: return createAdd();
      case CSVParserGeneratorPackage.REM: return createRem();
      case CSVParserGeneratorPackage.PLUS: return createPlus();
      case CSVParserGeneratorPackage.MINUS: return createMinus();
      case CSVParserGeneratorPackage.MULT: return createMult();
      case CSVParserGeneratorPackage.DIV: return createDiv();
      case CSVParserGeneratorPackage.NUM: return createNum();
      case CSVParserGeneratorPackage.DATE_LIT: return createDateLit();
      case CSVParserGeneratorPackage.STRING_LIT: return createStringLit();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parser createParser()
  {
    ParserImpl parser = new ParserImpl();
    return parser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FileDecl createFileDecl()
  {
    FileDeclImpl fileDecl = new FileDeclImpl();
    return fileDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColDecl createColDecl()
  {
    ColDeclImpl colDecl = new ColDeclImpl();
    return colDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Modification createModification()
  {
    ModificationImpl modification = new ModificationImpl();
    return modification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValueMod createValueMod()
  {
    ValueModImpl valueMod = new ValueModImpl();
    return valueMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parens createParens()
  {
    ParensImpl parens = new ParensImpl();
    return parens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public External createExternal()
  {
    ExternalImpl external = new ExternalImpl();
    return external;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StatFunc createStatFunc()
  {
    StatFuncImpl statFunc = new StatFuncImpl();
    return statFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColumnAction createColumnAction()
  {
    ColumnActionImpl columnAction = new ColumnActionImpl();
    return columnAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColumnVar createColumnVar()
  {
    ColumnVarImpl columnVar = new ColumnVarImpl();
    return columnVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public dk.sdu.mdsd.cSVParserGenerator.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constraint createConstraint()
  {
    ConstraintImpl constraint = new ConstraintImpl();
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DateLiteral createDateLiteral()
  {
    DateLiteralImpl dateLiteral = new DateLiteralImpl();
    return dateLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ValueM createValueM()
  {
    ValueMImpl valueM = new ValueMImpl();
    return valueM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ext createExt()
  {
    ExtImpl ext = new ExtImpl();
    return ext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Stat createStat()
  {
    StatImpl stat = new StatImpl();
    return stat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ColAct createColAct()
  {
    ColActImpl colAct = new ColActImpl();
    return colAct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Constrain createConstrain()
  {
    ConstrainImpl constrain = new ConstrainImpl();
    return constrain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Str createStr()
  {
    StrImpl str = new StrImpl();
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integ createInteg()
  {
    IntegImpl integ = new IntegImpl();
    return integ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Floa createFloa()
  {
    FloaImpl floa = new FloaImpl();
    return floa;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lt createLt()
  {
    LtImpl lt = new LtImpl();
    return lt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Gt createGt()
  {
    GtImpl gt = new GtImpl();
    return gt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equ createEqu()
  {
    EquImpl equ = new EquImpl();
    return equ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Neq createNeq()
  {
    NeqImpl neq = new NeqImpl();
    return neq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Leq createLeq()
  {
    LeqImpl leq = new LeqImpl();
    return leq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Geq createGeq()
  {
    GeqImpl geq = new GeqImpl();
    return geq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Max createMax()
  {
    MaxImpl max = new MaxImpl();
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Min createMin()
  {
    MinImpl min = new MinImpl();
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Std createStd()
  {
    StdImpl std = new StdImpl();
    return std;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SumFunc createSumFunc()
  {
    SumFuncImpl sumFunc = new SumFuncImpl();
    return sumFunc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mean createMean()
  {
    MeanImpl mean = new MeanImpl();
    return mean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Add createAdd()
  {
    AddImpl add = new AddImpl();
    return add;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Rem createRem()
  {
    RemImpl rem = new RemImpl();
    return rem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mult createMult()
  {
    MultImpl mult = new MultImpl();
    return mult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Num createNum()
  {
    NumImpl num = new NumImpl();
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DateLit createDateLit()
  {
    DateLitImpl dateLit = new DateLitImpl();
    return dateLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLit createStringLit()
  {
    StringLitImpl stringLit = new StringLitImpl();
    return stringLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CSVParserGeneratorPackage getCSVParserGeneratorPackage()
  {
    return (CSVParserGeneratorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CSVParserGeneratorPackage getPackage()
  {
    return CSVParserGeneratorPackage.eINSTANCE;
  }

} //CSVParserGeneratorFactoryImpl
