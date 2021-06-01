package dk.sdu.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mdsd.services.CSVParserGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSVParserGeneratorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'columns'", "'{'", "'}'", "'file'", "':'", "'separator'", "'modifications'", "'externals'", "'statistics'", "'layout'", "'constraints'", "'output'", "'records'", "'='", "'string'", "'integer'", "'date'", "'float'", "'||'", "'&&'", "'<'", "'>'", "'=='", "'!='", "'=<'", "'=>'", "'('", "')'", "'extFunc'", "'max'", "'min'", "'std'", "'sum'", "'mean'", "'addCol'", "'with'", "'remCol'", "'+'", "'-'", "'*'", "'/'", "'satisfies'", "'constraint'", "'d'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCSVParserGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCSVParserGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCSVParserGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCSVParserGenerator.g"; }


    	private CSVParserGeneratorGrammarAccess grammarAccess;

    	public void setGrammarAccess(CSVParserGeneratorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleParser"
    // InternalCSVParserGenerator.g:53:1: entryRuleParser : ruleParser EOF ;
    public final void entryRuleParser() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:54:1: ( ruleParser EOF )
            // InternalCSVParserGenerator.g:55:1: ruleParser EOF
            {
             before(grammarAccess.getParserRule()); 
            pushFollow(FOLLOW_1);
            ruleParser();

            state._fsp--;

             after(grammarAccess.getParserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParser"


    // $ANTLR start "ruleParser"
    // InternalCSVParserGenerator.g:62:1: ruleParser : ( ( rule__Parser__Group__0 ) ) ;
    public final void ruleParser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:66:2: ( ( ( rule__Parser__Group__0 ) ) )
            // InternalCSVParserGenerator.g:67:2: ( ( rule__Parser__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:67:2: ( ( rule__Parser__Group__0 ) )
            // InternalCSVParserGenerator.g:68:3: ( rule__Parser__Group__0 )
            {
             before(grammarAccess.getParserAccess().getGroup()); 
            // InternalCSVParserGenerator.g:69:3: ( rule__Parser__Group__0 )
            // InternalCSVParserGenerator.g:69:4: rule__Parser__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parser__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParserAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParser"


    // $ANTLR start "entryRuleFileDecl"
    // InternalCSVParserGenerator.g:78:1: entryRuleFileDecl : ruleFileDecl EOF ;
    public final void entryRuleFileDecl() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:79:1: ( ruleFileDecl EOF )
            // InternalCSVParserGenerator.g:80:1: ruleFileDecl EOF
            {
             before(grammarAccess.getFileDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleFileDecl();

            state._fsp--;

             after(grammarAccess.getFileDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFileDecl"


    // $ANTLR start "ruleFileDecl"
    // InternalCSVParserGenerator.g:87:1: ruleFileDecl : ( ( rule__FileDecl__Group__0 ) ) ;
    public final void ruleFileDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:91:2: ( ( ( rule__FileDecl__Group__0 ) ) )
            // InternalCSVParserGenerator.g:92:2: ( ( rule__FileDecl__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:92:2: ( ( rule__FileDecl__Group__0 ) )
            // InternalCSVParserGenerator.g:93:3: ( rule__FileDecl__Group__0 )
            {
             before(grammarAccess.getFileDeclAccess().getGroup()); 
            // InternalCSVParserGenerator.g:94:3: ( rule__FileDecl__Group__0 )
            // InternalCSVParserGenerator.g:94:4: rule__FileDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileDecl"


    // $ANTLR start "entryRuleColDecl"
    // InternalCSVParserGenerator.g:103:1: entryRuleColDecl : ruleColDecl EOF ;
    public final void entryRuleColDecl() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:104:1: ( ruleColDecl EOF )
            // InternalCSVParserGenerator.g:105:1: ruleColDecl EOF
            {
             before(grammarAccess.getColDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleColDecl();

            state._fsp--;

             after(grammarAccess.getColDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColDecl"


    // $ANTLR start "ruleColDecl"
    // InternalCSVParserGenerator.g:112:1: ruleColDecl : ( ( rule__ColDecl__Group__0 ) ) ;
    public final void ruleColDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:116:2: ( ( ( rule__ColDecl__Group__0 ) ) )
            // InternalCSVParserGenerator.g:117:2: ( ( rule__ColDecl__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:117:2: ( ( rule__ColDecl__Group__0 ) )
            // InternalCSVParserGenerator.g:118:3: ( rule__ColDecl__Group__0 )
            {
             before(grammarAccess.getColDeclAccess().getGroup()); 
            // InternalCSVParserGenerator.g:119:3: ( rule__ColDecl__Group__0 )
            // InternalCSVParserGenerator.g:119:4: rule__ColDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ColDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColDecl"


    // $ANTLR start "entryRuleModification"
    // InternalCSVParserGenerator.g:128:1: entryRuleModification : ruleModification EOF ;
    public final void entryRuleModification() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:129:1: ( ruleModification EOF )
            // InternalCSVParserGenerator.g:130:1: ruleModification EOF
            {
             before(grammarAccess.getModificationRule()); 
            pushFollow(FOLLOW_1);
            ruleModification();

            state._fsp--;

             after(grammarAccess.getModificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModification"


    // $ANTLR start "ruleModification"
    // InternalCSVParserGenerator.g:137:1: ruleModification : ( ( rule__Modification__Alternatives ) ) ;
    public final void ruleModification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:141:2: ( ( ( rule__Modification__Alternatives ) ) )
            // InternalCSVParserGenerator.g:142:2: ( ( rule__Modification__Alternatives ) )
            {
            // InternalCSVParserGenerator.g:142:2: ( ( rule__Modification__Alternatives ) )
            // InternalCSVParserGenerator.g:143:3: ( rule__Modification__Alternatives )
            {
             before(grammarAccess.getModificationAccess().getAlternatives()); 
            // InternalCSVParserGenerator.g:144:3: ( rule__Modification__Alternatives )
            // InternalCSVParserGenerator.g:144:4: rule__Modification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Modification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModification"


    // $ANTLR start "entryRuleOutput"
    // InternalCSVParserGenerator.g:153:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:154:1: ( ruleOutput EOF )
            // InternalCSVParserGenerator.g:155:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalCSVParserGenerator.g:162:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:166:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalCSVParserGenerator.g:167:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:167:2: ( ( rule__Output__Group__0 ) )
            // InternalCSVParserGenerator.g:168:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalCSVParserGenerator.g:169:3: ( rule__Output__Group__0 )
            // InternalCSVParserGenerator.g:169:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleValueMod"
    // InternalCSVParserGenerator.g:178:1: entryRuleValueMod : ruleValueMod EOF ;
    public final void entryRuleValueMod() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:179:1: ( ruleValueMod EOF )
            // InternalCSVParserGenerator.g:180:1: ruleValueMod EOF
            {
             before(grammarAccess.getValueModRule()); 
            pushFollow(FOLLOW_1);
            ruleValueMod();

            state._fsp--;

             after(grammarAccess.getValueModRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValueMod"


    // $ANTLR start "ruleValueMod"
    // InternalCSVParserGenerator.g:187:1: ruleValueMod : ( ( rule__ValueMod__Group__0 ) ) ;
    public final void ruleValueMod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:191:2: ( ( ( rule__ValueMod__Group__0 ) ) )
            // InternalCSVParserGenerator.g:192:2: ( ( rule__ValueMod__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:192:2: ( ( rule__ValueMod__Group__0 ) )
            // InternalCSVParserGenerator.g:193:3: ( rule__ValueMod__Group__0 )
            {
             before(grammarAccess.getValueModAccess().getGroup()); 
            // InternalCSVParserGenerator.g:194:3: ( rule__ValueMod__Group__0 )
            // InternalCSVParserGenerator.g:194:4: rule__ValueMod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueMod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueModAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValueMod"


    // $ANTLR start "entryRuleType"
    // InternalCSVParserGenerator.g:203:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:204:1: ( ruleType EOF )
            // InternalCSVParserGenerator.g:205:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalCSVParserGenerator.g:212:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:216:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalCSVParserGenerator.g:217:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalCSVParserGenerator.g:217:2: ( ( rule__Type__Alternatives ) )
            // InternalCSVParserGenerator.g:218:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalCSVParserGenerator.g:219:3: ( rule__Type__Alternatives )
            // InternalCSVParserGenerator.g:219:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLogExp"
    // InternalCSVParserGenerator.g:228:1: entryRuleLogExp : ruleLogExp EOF ;
    public final void entryRuleLogExp() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:229:1: ( ruleLogExp EOF )
            // InternalCSVParserGenerator.g:230:1: ruleLogExp EOF
            {
             before(grammarAccess.getLogExpRule()); 
            pushFollow(FOLLOW_1);
            ruleLogExp();

            state._fsp--;

             after(grammarAccess.getLogExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogExp"


    // $ANTLR start "ruleLogExp"
    // InternalCSVParserGenerator.g:237:1: ruleLogExp : ( ( rule__LogExp__Group__0 ) ) ;
    public final void ruleLogExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:241:2: ( ( ( rule__LogExp__Group__0 ) ) )
            // InternalCSVParserGenerator.g:242:2: ( ( rule__LogExp__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:242:2: ( ( rule__LogExp__Group__0 ) )
            // InternalCSVParserGenerator.g:243:3: ( rule__LogExp__Group__0 )
            {
             before(grammarAccess.getLogExpAccess().getGroup()); 
            // InternalCSVParserGenerator.g:244:3: ( rule__LogExp__Group__0 )
            // InternalCSVParserGenerator.g:244:4: rule__LogExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LogExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogExp"


    // $ANTLR start "entryRuleComparison"
    // InternalCSVParserGenerator.g:253:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:254:1: ( ruleComparison EOF )
            // InternalCSVParserGenerator.g:255:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalCSVParserGenerator.g:262:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:266:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalCSVParserGenerator.g:267:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:267:2: ( ( rule__Comparison__Group__0 ) )
            // InternalCSVParserGenerator.g:268:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalCSVParserGenerator.g:269:3: ( rule__Comparison__Group__0 )
            // InternalCSVParserGenerator.g:269:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleParens"
    // InternalCSVParserGenerator.g:278:1: entryRuleParens : ruleParens EOF ;
    public final void entryRuleParens() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:279:1: ( ruleParens EOF )
            // InternalCSVParserGenerator.g:280:1: ruleParens EOF
            {
             before(grammarAccess.getParensRule()); 
            pushFollow(FOLLOW_1);
            ruleParens();

            state._fsp--;

             after(grammarAccess.getParensRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParens"


    // $ANTLR start "ruleParens"
    // InternalCSVParserGenerator.g:287:1: ruleParens : ( ( rule__Parens__Group__0 ) ) ;
    public final void ruleParens() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:291:2: ( ( ( rule__Parens__Group__0 ) ) )
            // InternalCSVParserGenerator.g:292:2: ( ( rule__Parens__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:292:2: ( ( rule__Parens__Group__0 ) )
            // InternalCSVParserGenerator.g:293:3: ( rule__Parens__Group__0 )
            {
             before(grammarAccess.getParensAccess().getGroup()); 
            // InternalCSVParserGenerator.g:294:3: ( rule__Parens__Group__0 )
            // InternalCSVParserGenerator.g:294:4: rule__Parens__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parens__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParensAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParens"


    // $ANTLR start "entryRuleExternal"
    // InternalCSVParserGenerator.g:303:1: entryRuleExternal : ruleExternal EOF ;
    public final void entryRuleExternal() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:304:1: ( ruleExternal EOF )
            // InternalCSVParserGenerator.g:305:1: ruleExternal EOF
            {
             before(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getExternalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalCSVParserGenerator.g:312:1: ruleExternal : ( ( rule__External__Group__0 ) ) ;
    public final void ruleExternal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:316:2: ( ( ( rule__External__Group__0 ) ) )
            // InternalCSVParserGenerator.g:317:2: ( ( rule__External__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:317:2: ( ( rule__External__Group__0 ) )
            // InternalCSVParserGenerator.g:318:3: ( rule__External__Group__0 )
            {
             before(grammarAccess.getExternalAccess().getGroup()); 
            // InternalCSVParserGenerator.g:319:3: ( rule__External__Group__0 )
            // InternalCSVParserGenerator.g:319:4: rule__External__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleStatFunc"
    // InternalCSVParserGenerator.g:328:1: entryRuleStatFunc : ruleStatFunc EOF ;
    public final void entryRuleStatFunc() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:329:1: ( ruleStatFunc EOF )
            // InternalCSVParserGenerator.g:330:1: ruleStatFunc EOF
            {
             before(grammarAccess.getStatFuncRule()); 
            pushFollow(FOLLOW_1);
            ruleStatFunc();

            state._fsp--;

             after(grammarAccess.getStatFuncRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatFunc"


    // $ANTLR start "ruleStatFunc"
    // InternalCSVParserGenerator.g:337:1: ruleStatFunc : ( ( rule__StatFunc__Alternatives ) ) ;
    public final void ruleStatFunc() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:341:2: ( ( ( rule__StatFunc__Alternatives ) ) )
            // InternalCSVParserGenerator.g:342:2: ( ( rule__StatFunc__Alternatives ) )
            {
            // InternalCSVParserGenerator.g:342:2: ( ( rule__StatFunc__Alternatives ) )
            // InternalCSVParserGenerator.g:343:3: ( rule__StatFunc__Alternatives )
            {
             before(grammarAccess.getStatFuncAccess().getAlternatives()); 
            // InternalCSVParserGenerator.g:344:3: ( rule__StatFunc__Alternatives )
            // InternalCSVParserGenerator.g:344:4: rule__StatFunc__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatFuncAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatFunc"


    // $ANTLR start "entryRuleColumnAction"
    // InternalCSVParserGenerator.g:353:1: entryRuleColumnAction : ruleColumnAction EOF ;
    public final void entryRuleColumnAction() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:354:1: ( ruleColumnAction EOF )
            // InternalCSVParserGenerator.g:355:1: ruleColumnAction EOF
            {
             before(grammarAccess.getColumnActionRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnAction();

            state._fsp--;

             after(grammarAccess.getColumnActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnAction"


    // $ANTLR start "ruleColumnAction"
    // InternalCSVParserGenerator.g:362:1: ruleColumnAction : ( ( rule__ColumnAction__Alternatives ) ) ;
    public final void ruleColumnAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:366:2: ( ( ( rule__ColumnAction__Alternatives ) ) )
            // InternalCSVParserGenerator.g:367:2: ( ( rule__ColumnAction__Alternatives ) )
            {
            // InternalCSVParserGenerator.g:367:2: ( ( rule__ColumnAction__Alternatives ) )
            // InternalCSVParserGenerator.g:368:3: ( rule__ColumnAction__Alternatives )
            {
             before(grammarAccess.getColumnActionAccess().getAlternatives()); 
            // InternalCSVParserGenerator.g:369:3: ( rule__ColumnAction__Alternatives )
            // InternalCSVParserGenerator.g:369:4: rule__ColumnAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnAction"


    // $ANTLR start "entryRuleSum"
    // InternalCSVParserGenerator.g:378:1: entryRuleSum : ruleSum EOF ;
    public final void entryRuleSum() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:379:1: ( ruleSum EOF )
            // InternalCSVParserGenerator.g:380:1: ruleSum EOF
            {
             before(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getSumRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalCSVParserGenerator.g:387:1: ruleSum : ( ( rule__Sum__Group__0 ) ) ;
    public final void ruleSum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:391:2: ( ( ( rule__Sum__Group__0 ) ) )
            // InternalCSVParserGenerator.g:392:2: ( ( rule__Sum__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:392:2: ( ( rule__Sum__Group__0 ) )
            // InternalCSVParserGenerator.g:393:3: ( rule__Sum__Group__0 )
            {
             before(grammarAccess.getSumAccess().getGroup()); 
            // InternalCSVParserGenerator.g:394:3: ( rule__Sum__Group__0 )
            // InternalCSVParserGenerator.g:394:4: rule__Sum__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleFactor"
    // InternalCSVParserGenerator.g:403:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:404:1: ( ruleFactor EOF )
            // InternalCSVParserGenerator.g:405:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalCSVParserGenerator.g:412:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:416:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalCSVParserGenerator.g:417:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:417:2: ( ( rule__Factor__Group__0 ) )
            // InternalCSVParserGenerator.g:418:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalCSVParserGenerator.g:419:3: ( rule__Factor__Group__0 )
            // InternalCSVParserGenerator.g:419:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalCSVParserGenerator.g:428:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:429:1: ( rulePrimary EOF )
            // InternalCSVParserGenerator.g:430:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalCSVParserGenerator.g:437:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:441:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalCSVParserGenerator.g:442:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalCSVParserGenerator.g:442:2: ( ( rule__Primary__Alternatives ) )
            // InternalCSVParserGenerator.g:443:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalCSVParserGenerator.g:444:3: ( rule__Primary__Alternatives )
            // InternalCSVParserGenerator.g:444:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleColumnVar"
    // InternalCSVParserGenerator.g:453:1: entryRuleColumnVar : ruleColumnVar EOF ;
    public final void entryRuleColumnVar() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:454:1: ( ruleColumnVar EOF )
            // InternalCSVParserGenerator.g:455:1: ruleColumnVar EOF
            {
             before(grammarAccess.getColumnVarRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnVar();

            state._fsp--;

             after(grammarAccess.getColumnVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnVar"


    // $ANTLR start "ruleColumnVar"
    // InternalCSVParserGenerator.g:462:1: ruleColumnVar : ( ( rule__ColumnVar__NameAssignment ) ) ;
    public final void ruleColumnVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:466:2: ( ( ( rule__ColumnVar__NameAssignment ) ) )
            // InternalCSVParserGenerator.g:467:2: ( ( rule__ColumnVar__NameAssignment ) )
            {
            // InternalCSVParserGenerator.g:467:2: ( ( rule__ColumnVar__NameAssignment ) )
            // InternalCSVParserGenerator.g:468:3: ( rule__ColumnVar__NameAssignment )
            {
             before(grammarAccess.getColumnVarAccess().getNameAssignment()); 
            // InternalCSVParserGenerator.g:469:3: ( rule__ColumnVar__NameAssignment )
            // InternalCSVParserGenerator.g:469:4: rule__ColumnVar__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColumnVar__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnVarAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnVar"


    // $ANTLR start "entryRuleNumber"
    // InternalCSVParserGenerator.g:478:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:479:1: ( ruleNumber EOF )
            // InternalCSVParserGenerator.g:480:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalCSVParserGenerator.g:487:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:491:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalCSVParserGenerator.g:492:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:492:2: ( ( rule__Number__Group__0 ) )
            // InternalCSVParserGenerator.g:493:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalCSVParserGenerator.g:494:3: ( rule__Number__Group__0 )
            // InternalCSVParserGenerator.g:494:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleConstraint"
    // InternalCSVParserGenerator.g:503:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:504:1: ( ruleConstraint EOF )
            // InternalCSVParserGenerator.g:505:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalCSVParserGenerator.g:512:1: ruleConstraint : ( ( rule__Constraint__Group__0 ) ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:516:2: ( ( ( rule__Constraint__Group__0 ) ) )
            // InternalCSVParserGenerator.g:517:2: ( ( rule__Constraint__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:517:2: ( ( rule__Constraint__Group__0 ) )
            // InternalCSVParserGenerator.g:518:3: ( rule__Constraint__Group__0 )
            {
             before(grammarAccess.getConstraintAccess().getGroup()); 
            // InternalCSVParserGenerator.g:519:3: ( rule__Constraint__Group__0 )
            // InternalCSVParserGenerator.g:519:4: rule__Constraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleDateLiteral"
    // InternalCSVParserGenerator.g:528:1: entryRuleDateLiteral : ruleDateLiteral EOF ;
    public final void entryRuleDateLiteral() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:529:1: ( ruleDateLiteral EOF )
            // InternalCSVParserGenerator.g:530:1: ruleDateLiteral EOF
            {
             before(grammarAccess.getDateLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleDateLiteral();

            state._fsp--;

             after(grammarAccess.getDateLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateLiteral"


    // $ANTLR start "ruleDateLiteral"
    // InternalCSVParserGenerator.g:537:1: ruleDateLiteral : ( ( rule__DateLiteral__Group__0 ) ) ;
    public final void ruleDateLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:541:2: ( ( ( rule__DateLiteral__Group__0 ) ) )
            // InternalCSVParserGenerator.g:542:2: ( ( rule__DateLiteral__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:542:2: ( ( rule__DateLiteral__Group__0 ) )
            // InternalCSVParserGenerator.g:543:3: ( rule__DateLiteral__Group__0 )
            {
             before(grammarAccess.getDateLiteralAccess().getGroup()); 
            // InternalCSVParserGenerator.g:544:3: ( rule__DateLiteral__Group__0 )
            // InternalCSVParserGenerator.g:544:4: rule__DateLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DateLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalCSVParserGenerator.g:553:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalCSVParserGenerator.g:554:1: ( ruleStringLiteral EOF )
            // InternalCSVParserGenerator.g:555:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalCSVParserGenerator.g:562:1: ruleStringLiteral : ( ( rule__StringLiteral__Group__0 ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:566:2: ( ( ( rule__StringLiteral__Group__0 ) ) )
            // InternalCSVParserGenerator.g:567:2: ( ( rule__StringLiteral__Group__0 ) )
            {
            // InternalCSVParserGenerator.g:567:2: ( ( rule__StringLiteral__Group__0 ) )
            // InternalCSVParserGenerator.g:568:3: ( rule__StringLiteral__Group__0 )
            {
             before(grammarAccess.getStringLiteralAccess().getGroup()); 
            // InternalCSVParserGenerator.g:569:3: ( rule__StringLiteral__Group__0 )
            // InternalCSVParserGenerator.g:569:4: rule__StringLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "rule__Modification__Alternatives"
    // InternalCSVParserGenerator.g:577:1: rule__Modification__Alternatives : ( ( ( rule__Modification__Group_0__0 ) ) | ( ( rule__Modification__Group_1__0 ) ) | ( ( rule__Modification__Group_2__0 ) ) | ( ( rule__Modification__Group_3__0 ) ) | ( ( rule__Modification__Group_4__0 ) ) );
    public final void rule__Modification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:581:1: ( ( ( rule__Modification__Group_0__0 ) ) | ( ( rule__Modification__Group_1__0 ) ) | ( ( rule__Modification__Group_2__0 ) ) | ( ( rule__Modification__Group_3__0 ) ) | ( ( rule__Modification__Group_4__0 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                alt1=2;
                }
                break;
            case 19:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 21:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalCSVParserGenerator.g:582:2: ( ( rule__Modification__Group_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:582:2: ( ( rule__Modification__Group_0__0 ) )
                    // InternalCSVParserGenerator.g:583:3: ( rule__Modification__Group_0__0 )
                    {
                     before(grammarAccess.getModificationAccess().getGroup_0()); 
                    // InternalCSVParserGenerator.g:584:3: ( rule__Modification__Group_0__0 )
                    // InternalCSVParserGenerator.g:584:4: rule__Modification__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modification__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModificationAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:588:2: ( ( rule__Modification__Group_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:588:2: ( ( rule__Modification__Group_1__0 ) )
                    // InternalCSVParserGenerator.g:589:3: ( rule__Modification__Group_1__0 )
                    {
                     before(grammarAccess.getModificationAccess().getGroup_1()); 
                    // InternalCSVParserGenerator.g:590:3: ( rule__Modification__Group_1__0 )
                    // InternalCSVParserGenerator.g:590:4: rule__Modification__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modification__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModificationAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:594:2: ( ( rule__Modification__Group_2__0 ) )
                    {
                    // InternalCSVParserGenerator.g:594:2: ( ( rule__Modification__Group_2__0 ) )
                    // InternalCSVParserGenerator.g:595:3: ( rule__Modification__Group_2__0 )
                    {
                     before(grammarAccess.getModificationAccess().getGroup_2()); 
                    // InternalCSVParserGenerator.g:596:3: ( rule__Modification__Group_2__0 )
                    // InternalCSVParserGenerator.g:596:4: rule__Modification__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modification__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModificationAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:600:2: ( ( rule__Modification__Group_3__0 ) )
                    {
                    // InternalCSVParserGenerator.g:600:2: ( ( rule__Modification__Group_3__0 ) )
                    // InternalCSVParserGenerator.g:601:3: ( rule__Modification__Group_3__0 )
                    {
                     before(grammarAccess.getModificationAccess().getGroup_3()); 
                    // InternalCSVParserGenerator.g:602:3: ( rule__Modification__Group_3__0 )
                    // InternalCSVParserGenerator.g:602:4: rule__Modification__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modification__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModificationAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCSVParserGenerator.g:606:2: ( ( rule__Modification__Group_4__0 ) )
                    {
                    // InternalCSVParserGenerator.g:606:2: ( ( rule__Modification__Group_4__0 ) )
                    // InternalCSVParserGenerator.g:607:3: ( rule__Modification__Group_4__0 )
                    {
                     before(grammarAccess.getModificationAccess().getGroup_4()); 
                    // InternalCSVParserGenerator.g:608:3: ( rule__Modification__Group_4__0 )
                    // InternalCSVParserGenerator.g:608:4: rule__Modification__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Modification__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModificationAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalCSVParserGenerator.g:616:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:620:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalCSVParserGenerator.g:621:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:621:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalCSVParserGenerator.g:622:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalCSVParserGenerator.g:623:3: ( rule__Type__Group_0__0 )
                    // InternalCSVParserGenerator.g:623:4: rule__Type__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:627:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:627:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalCSVParserGenerator.g:628:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalCSVParserGenerator.g:629:3: ( rule__Type__Group_1__0 )
                    // InternalCSVParserGenerator.g:629:4: rule__Type__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:633:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalCSVParserGenerator.g:633:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalCSVParserGenerator.g:634:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalCSVParserGenerator.g:635:3: ( rule__Type__Group_2__0 )
                    // InternalCSVParserGenerator.g:635:4: rule__Type__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:639:2: ( ( rule__Type__Group_3__0 ) )
                    {
                    // InternalCSVParserGenerator.g:639:2: ( ( rule__Type__Group_3__0 ) )
                    // InternalCSVParserGenerator.g:640:3: ( rule__Type__Group_3__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_3()); 
                    // InternalCSVParserGenerator.g:641:3: ( rule__Type__Group_3__0 )
                    // InternalCSVParserGenerator.g:641:4: rule__Type__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__LogExp__Alternatives_1_0"
    // InternalCSVParserGenerator.g:649:1: rule__LogExp__Alternatives_1_0 : ( ( ( rule__LogExp__Group_1_0_0__0 ) ) | ( ( rule__LogExp__Group_1_0_1__0 ) ) );
    public final void rule__LogExp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:653:1: ( ( ( rule__LogExp__Group_1_0_0__0 ) ) | ( ( rule__LogExp__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCSVParserGenerator.g:654:2: ( ( rule__LogExp__Group_1_0_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:654:2: ( ( rule__LogExp__Group_1_0_0__0 ) )
                    // InternalCSVParserGenerator.g:655:3: ( rule__LogExp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getLogExpAccess().getGroup_1_0_0()); 
                    // InternalCSVParserGenerator.g:656:3: ( rule__LogExp__Group_1_0_0__0 )
                    // InternalCSVParserGenerator.g:656:4: rule__LogExp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogExp__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogExpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:660:2: ( ( rule__LogExp__Group_1_0_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:660:2: ( ( rule__LogExp__Group_1_0_1__0 ) )
                    // InternalCSVParserGenerator.g:661:3: ( rule__LogExp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getLogExpAccess().getGroup_1_0_1()); 
                    // InternalCSVParserGenerator.g:662:3: ( rule__LogExp__Group_1_0_1__0 )
                    // InternalCSVParserGenerator.g:662:4: rule__LogExp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogExp__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogExpAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Alternatives_1_0"


    // $ANTLR start "rule__Comparison__Alternatives_1_0"
    // InternalCSVParserGenerator.g:670:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) | ( ( rule__Comparison__Group_1_0_5__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:674:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) | ( ( rule__Comparison__Group_1_0_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            case 36:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalCSVParserGenerator.g:675:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:675:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalCSVParserGenerator.g:676:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    // InternalCSVParserGenerator.g:677:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalCSVParserGenerator.g:677:4: rule__Comparison__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:681:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:681:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalCSVParserGenerator.g:682:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    // InternalCSVParserGenerator.g:683:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalCSVParserGenerator.g:683:4: rule__Comparison__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:687:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalCSVParserGenerator.g:687:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalCSVParserGenerator.g:688:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    // InternalCSVParserGenerator.g:689:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalCSVParserGenerator.g:689:4: rule__Comparison__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:693:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    {
                    // InternalCSVParserGenerator.g:693:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    // InternalCSVParserGenerator.g:694:3: ( rule__Comparison__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    // InternalCSVParserGenerator.g:695:3: ( rule__Comparison__Group_1_0_3__0 )
                    // InternalCSVParserGenerator.g:695:4: rule__Comparison__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCSVParserGenerator.g:699:2: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    {
                    // InternalCSVParserGenerator.g:699:2: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    // InternalCSVParserGenerator.g:700:3: ( rule__Comparison__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_4()); 
                    // InternalCSVParserGenerator.g:701:3: ( rule__Comparison__Group_1_0_4__0 )
                    // InternalCSVParserGenerator.g:701:4: rule__Comparison__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCSVParserGenerator.g:705:2: ( ( rule__Comparison__Group_1_0_5__0 ) )
                    {
                    // InternalCSVParserGenerator.g:705:2: ( ( rule__Comparison__Group_1_0_5__0 ) )
                    // InternalCSVParserGenerator.g:706:3: ( rule__Comparison__Group_1_0_5__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_5()); 
                    // InternalCSVParserGenerator.g:707:3: ( rule__Comparison__Group_1_0_5__0 )
                    // InternalCSVParserGenerator.g:707:4: rule__Comparison__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives_1_0"


    // $ANTLR start "rule__StatFunc__Alternatives"
    // InternalCSVParserGenerator.g:715:1: rule__StatFunc__Alternatives : ( ( ( rule__StatFunc__Group_0__0 ) ) | ( ( rule__StatFunc__Group_1__0 ) ) | ( ( rule__StatFunc__Group_2__0 ) ) | ( ( rule__StatFunc__Group_3__0 ) ) | ( ( rule__StatFunc__Group_4__0 ) ) );
    public final void rule__StatFunc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:719:1: ( ( ( rule__StatFunc__Group_0__0 ) ) | ( ( rule__StatFunc__Group_1__0 ) ) | ( ( rule__StatFunc__Group_2__0 ) ) | ( ( rule__StatFunc__Group_3__0 ) ) | ( ( rule__StatFunc__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 42:
                {
                alt5=3;
                }
                break;
            case 43:
                {
                alt5=4;
                }
                break;
            case 44:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalCSVParserGenerator.g:720:2: ( ( rule__StatFunc__Group_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:720:2: ( ( rule__StatFunc__Group_0__0 ) )
                    // InternalCSVParserGenerator.g:721:3: ( rule__StatFunc__Group_0__0 )
                    {
                     before(grammarAccess.getStatFuncAccess().getGroup_0()); 
                    // InternalCSVParserGenerator.g:722:3: ( rule__StatFunc__Group_0__0 )
                    // InternalCSVParserGenerator.g:722:4: rule__StatFunc__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatFunc__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatFuncAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:726:2: ( ( rule__StatFunc__Group_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:726:2: ( ( rule__StatFunc__Group_1__0 ) )
                    // InternalCSVParserGenerator.g:727:3: ( rule__StatFunc__Group_1__0 )
                    {
                     before(grammarAccess.getStatFuncAccess().getGroup_1()); 
                    // InternalCSVParserGenerator.g:728:3: ( rule__StatFunc__Group_1__0 )
                    // InternalCSVParserGenerator.g:728:4: rule__StatFunc__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatFunc__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatFuncAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:732:2: ( ( rule__StatFunc__Group_2__0 ) )
                    {
                    // InternalCSVParserGenerator.g:732:2: ( ( rule__StatFunc__Group_2__0 ) )
                    // InternalCSVParserGenerator.g:733:3: ( rule__StatFunc__Group_2__0 )
                    {
                     before(grammarAccess.getStatFuncAccess().getGroup_2()); 
                    // InternalCSVParserGenerator.g:734:3: ( rule__StatFunc__Group_2__0 )
                    // InternalCSVParserGenerator.g:734:4: rule__StatFunc__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatFunc__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatFuncAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:738:2: ( ( rule__StatFunc__Group_3__0 ) )
                    {
                    // InternalCSVParserGenerator.g:738:2: ( ( rule__StatFunc__Group_3__0 ) )
                    // InternalCSVParserGenerator.g:739:3: ( rule__StatFunc__Group_3__0 )
                    {
                     before(grammarAccess.getStatFuncAccess().getGroup_3()); 
                    // InternalCSVParserGenerator.g:740:3: ( rule__StatFunc__Group_3__0 )
                    // InternalCSVParserGenerator.g:740:4: rule__StatFunc__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatFunc__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatFuncAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCSVParserGenerator.g:744:2: ( ( rule__StatFunc__Group_4__0 ) )
                    {
                    // InternalCSVParserGenerator.g:744:2: ( ( rule__StatFunc__Group_4__0 ) )
                    // InternalCSVParserGenerator.g:745:3: ( rule__StatFunc__Group_4__0 )
                    {
                     before(grammarAccess.getStatFuncAccess().getGroup_4()); 
                    // InternalCSVParserGenerator.g:746:3: ( rule__StatFunc__Group_4__0 )
                    // InternalCSVParserGenerator.g:746:4: rule__StatFunc__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatFunc__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatFuncAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Alternatives"


    // $ANTLR start "rule__ColumnAction__Alternatives"
    // InternalCSVParserGenerator.g:754:1: rule__ColumnAction__Alternatives : ( ( ( rule__ColumnAction__Group_0__0 ) ) | ( ( rule__ColumnAction__Group_1__0 ) ) );
    public final void rule__ColumnAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:758:1: ( ( ( rule__ColumnAction__Group_0__0 ) ) | ( ( rule__ColumnAction__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==45) ) {
                alt6=1;
            }
            else if ( (LA6_0==47) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCSVParserGenerator.g:759:2: ( ( rule__ColumnAction__Group_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:759:2: ( ( rule__ColumnAction__Group_0__0 ) )
                    // InternalCSVParserGenerator.g:760:3: ( rule__ColumnAction__Group_0__0 )
                    {
                     before(grammarAccess.getColumnActionAccess().getGroup_0()); 
                    // InternalCSVParserGenerator.g:761:3: ( rule__ColumnAction__Group_0__0 )
                    // InternalCSVParserGenerator.g:761:4: rule__ColumnAction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnAction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:765:2: ( ( rule__ColumnAction__Group_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:765:2: ( ( rule__ColumnAction__Group_1__0 ) )
                    // InternalCSVParserGenerator.g:766:3: ( rule__ColumnAction__Group_1__0 )
                    {
                     before(grammarAccess.getColumnActionAccess().getGroup_1()); 
                    // InternalCSVParserGenerator.g:767:3: ( rule__ColumnAction__Group_1__0 )
                    // InternalCSVParserGenerator.g:767:4: rule__ColumnAction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ColumnAction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getColumnActionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Alternatives"


    // $ANTLR start "rule__Sum__Alternatives_1_0"
    // InternalCSVParserGenerator.g:775:1: rule__Sum__Alternatives_1_0 : ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) );
    public final void rule__Sum__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:779:1: ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==48) ) {
                alt7=1;
            }
            else if ( (LA7_0==49) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCSVParserGenerator.g:780:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:780:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    // InternalCSVParserGenerator.g:781:3: ( rule__Sum__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_0()); 
                    // InternalCSVParserGenerator.g:782:3: ( rule__Sum__Group_1_0_0__0 )
                    // InternalCSVParserGenerator.g:782:4: rule__Sum__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sum__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSumAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:786:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:786:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    // InternalCSVParserGenerator.g:787:3: ( rule__Sum__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_1()); 
                    // InternalCSVParserGenerator.g:788:3: ( rule__Sum__Group_1_0_1__0 )
                    // InternalCSVParserGenerator.g:788:4: rule__Sum__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sum__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSumAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives_1_0"
    // InternalCSVParserGenerator.g:796:1: rule__Factor__Alternatives_1_0 : ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) );
    public final void rule__Factor__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:800:1: ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==50) ) {
                alt8=1;
            }
            else if ( (LA8_0==51) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCSVParserGenerator.g:801:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:801:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    // InternalCSVParserGenerator.g:802:3: ( rule__Factor__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_0()); 
                    // InternalCSVParserGenerator.g:803:3: ( rule__Factor__Group_1_0_0__0 )
                    // InternalCSVParserGenerator.g:803:4: rule__Factor__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:807:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:807:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    // InternalCSVParserGenerator.g:808:3: ( rule__Factor__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_1()); 
                    // InternalCSVParserGenerator.g:809:3: ( rule__Factor__Group_1_0_1__0 )
                    // InternalCSVParserGenerator.g:809:4: rule__Factor__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalCSVParserGenerator.g:817:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParens ) | ( ruleColumnVar ) | ( ruleDateLiteral ) | ( ruleStringLiteral ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:821:1: ( ( ruleNumber ) | ( ruleParens ) | ( ruleColumnVar ) | ( ruleDateLiteral ) | ( ruleStringLiteral ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 37:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            case 54:
                {
                alt9=4;
                }
                break;
            case RULE_STRING:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCSVParserGenerator.g:822:2: ( ruleNumber )
                    {
                    // InternalCSVParserGenerator.g:822:2: ( ruleNumber )
                    // InternalCSVParserGenerator.g:823:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:828:2: ( ruleParens )
                    {
                    // InternalCSVParserGenerator.g:828:2: ( ruleParens )
                    // InternalCSVParserGenerator.g:829:3: ruleParens
                    {
                     before(grammarAccess.getPrimaryAccess().getParensParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParens();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParensParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:834:2: ( ruleColumnVar )
                    {
                    // InternalCSVParserGenerator.g:834:2: ( ruleColumnVar )
                    // InternalCSVParserGenerator.g:835:3: ruleColumnVar
                    {
                     before(grammarAccess.getPrimaryAccess().getColumnVarParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnVar();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getColumnVarParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:840:2: ( ruleDateLiteral )
                    {
                    // InternalCSVParserGenerator.g:840:2: ( ruleDateLiteral )
                    // InternalCSVParserGenerator.g:841:3: ruleDateLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getDateLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDateLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getDateLiteralParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCSVParserGenerator.g:846:2: ( ruleStringLiteral )
                    {
                    // InternalCSVParserGenerator.g:846:2: ( ruleStringLiteral )
                    // InternalCSVParserGenerator.g:847:3: ruleStringLiteral
                    {
                     before(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Parser__Group__0"
    // InternalCSVParserGenerator.g:856:1: rule__Parser__Group__0 : rule__Parser__Group__0__Impl rule__Parser__Group__1 ;
    public final void rule__Parser__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:860:1: ( rule__Parser__Group__0__Impl rule__Parser__Group__1 )
            // InternalCSVParserGenerator.g:861:2: rule__Parser__Group__0__Impl rule__Parser__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Parser__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parser__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__0"


    // $ANTLR start "rule__Parser__Group__0__Impl"
    // InternalCSVParserGenerator.g:868:1: rule__Parser__Group__0__Impl : ( ( rule__Parser__FileAssignment_0 )? ) ;
    public final void rule__Parser__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:872:1: ( ( ( rule__Parser__FileAssignment_0 )? ) )
            // InternalCSVParserGenerator.g:873:1: ( ( rule__Parser__FileAssignment_0 )? )
            {
            // InternalCSVParserGenerator.g:873:1: ( ( rule__Parser__FileAssignment_0 )? )
            // InternalCSVParserGenerator.g:874:2: ( rule__Parser__FileAssignment_0 )?
            {
             before(grammarAccess.getParserAccess().getFileAssignment_0()); 
            // InternalCSVParserGenerator.g:875:2: ( rule__Parser__FileAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCSVParserGenerator.g:875:3: rule__Parser__FileAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parser__FileAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserAccess().getFileAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__0__Impl"


    // $ANTLR start "rule__Parser__Group__1"
    // InternalCSVParserGenerator.g:883:1: rule__Parser__Group__1 : rule__Parser__Group__1__Impl rule__Parser__Group__2 ;
    public final void rule__Parser__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:887:1: ( rule__Parser__Group__1__Impl rule__Parser__Group__2 )
            // InternalCSVParserGenerator.g:888:2: rule__Parser__Group__1__Impl rule__Parser__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Parser__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parser__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__1"


    // $ANTLR start "rule__Parser__Group__1__Impl"
    // InternalCSVParserGenerator.g:895:1: rule__Parser__Group__1__Impl : ( 'columns' ) ;
    public final void rule__Parser__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:899:1: ( ( 'columns' ) )
            // InternalCSVParserGenerator.g:900:1: ( 'columns' )
            {
            // InternalCSVParserGenerator.g:900:1: ( 'columns' )
            // InternalCSVParserGenerator.g:901:2: 'columns'
            {
             before(grammarAccess.getParserAccess().getColumnsKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getParserAccess().getColumnsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__1__Impl"


    // $ANTLR start "rule__Parser__Group__2"
    // InternalCSVParserGenerator.g:910:1: rule__Parser__Group__2 : rule__Parser__Group__2__Impl rule__Parser__Group__3 ;
    public final void rule__Parser__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:914:1: ( rule__Parser__Group__2__Impl rule__Parser__Group__3 )
            // InternalCSVParserGenerator.g:915:2: rule__Parser__Group__2__Impl rule__Parser__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Parser__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parser__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__2"


    // $ANTLR start "rule__Parser__Group__2__Impl"
    // InternalCSVParserGenerator.g:922:1: rule__Parser__Group__2__Impl : ( '{' ) ;
    public final void rule__Parser__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:926:1: ( ( '{' ) )
            // InternalCSVParserGenerator.g:927:1: ( '{' )
            {
            // InternalCSVParserGenerator.g:927:1: ( '{' )
            // InternalCSVParserGenerator.g:928:2: '{'
            {
             before(grammarAccess.getParserAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getParserAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__2__Impl"


    // $ANTLR start "rule__Parser__Group__3"
    // InternalCSVParserGenerator.g:937:1: rule__Parser__Group__3 : rule__Parser__Group__3__Impl rule__Parser__Group__4 ;
    public final void rule__Parser__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:941:1: ( rule__Parser__Group__3__Impl rule__Parser__Group__4 )
            // InternalCSVParserGenerator.g:942:2: rule__Parser__Group__3__Impl rule__Parser__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Parser__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parser__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__3"


    // $ANTLR start "rule__Parser__Group__3__Impl"
    // InternalCSVParserGenerator.g:949:1: rule__Parser__Group__3__Impl : ( ( ( rule__Parser__ColumnsAssignment_3 ) ) ( ( rule__Parser__ColumnsAssignment_3 )* ) ) ;
    public final void rule__Parser__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:953:1: ( ( ( ( rule__Parser__ColumnsAssignment_3 ) ) ( ( rule__Parser__ColumnsAssignment_3 )* ) ) )
            // InternalCSVParserGenerator.g:954:1: ( ( ( rule__Parser__ColumnsAssignment_3 ) ) ( ( rule__Parser__ColumnsAssignment_3 )* ) )
            {
            // InternalCSVParserGenerator.g:954:1: ( ( ( rule__Parser__ColumnsAssignment_3 ) ) ( ( rule__Parser__ColumnsAssignment_3 )* ) )
            // InternalCSVParserGenerator.g:955:2: ( ( rule__Parser__ColumnsAssignment_3 ) ) ( ( rule__Parser__ColumnsAssignment_3 )* )
            {
            // InternalCSVParserGenerator.g:955:2: ( ( rule__Parser__ColumnsAssignment_3 ) )
            // InternalCSVParserGenerator.g:956:3: ( rule__Parser__ColumnsAssignment_3 )
            {
             before(grammarAccess.getParserAccess().getColumnsAssignment_3()); 
            // InternalCSVParserGenerator.g:957:3: ( rule__Parser__ColumnsAssignment_3 )
            // InternalCSVParserGenerator.g:957:4: rule__Parser__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Parser__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParserAccess().getColumnsAssignment_3()); 

            }

            // InternalCSVParserGenerator.g:960:2: ( ( rule__Parser__ColumnsAssignment_3 )* )
            // InternalCSVParserGenerator.g:961:3: ( rule__Parser__ColumnsAssignment_3 )*
            {
             before(grammarAccess.getParserAccess().getColumnsAssignment_3()); 
            // InternalCSVParserGenerator.g:962:3: ( rule__Parser__ColumnsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:962:4: rule__Parser__ColumnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Parser__ColumnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getParserAccess().getColumnsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__3__Impl"


    // $ANTLR start "rule__Parser__Group__4"
    // InternalCSVParserGenerator.g:971:1: rule__Parser__Group__4 : rule__Parser__Group__4__Impl rule__Parser__Group__5 ;
    public final void rule__Parser__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:975:1: ( rule__Parser__Group__4__Impl rule__Parser__Group__5 )
            // InternalCSVParserGenerator.g:976:2: rule__Parser__Group__4__Impl rule__Parser__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Parser__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parser__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__4"


    // $ANTLR start "rule__Parser__Group__4__Impl"
    // InternalCSVParserGenerator.g:983:1: rule__Parser__Group__4__Impl : ( '}' ) ;
    public final void rule__Parser__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:987:1: ( ( '}' ) )
            // InternalCSVParserGenerator.g:988:1: ( '}' )
            {
            // InternalCSVParserGenerator.g:988:1: ( '}' )
            // InternalCSVParserGenerator.g:989:2: '}'
            {
             before(grammarAccess.getParserAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParserAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__4__Impl"


    // $ANTLR start "rule__Parser__Group__5"
    // InternalCSVParserGenerator.g:998:1: rule__Parser__Group__5 : rule__Parser__Group__5__Impl rule__Parser__Group__6 ;
    public final void rule__Parser__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1002:1: ( rule__Parser__Group__5__Impl rule__Parser__Group__6 )
            // InternalCSVParserGenerator.g:1003:2: rule__Parser__Group__5__Impl rule__Parser__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Parser__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parser__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__5"


    // $ANTLR start "rule__Parser__Group__5__Impl"
    // InternalCSVParserGenerator.g:1010:1: rule__Parser__Group__5__Impl : ( ( rule__Parser__ModsAssignment_5 )* ) ;
    public final void rule__Parser__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1014:1: ( ( ( rule__Parser__ModsAssignment_5 )* ) )
            // InternalCSVParserGenerator.g:1015:1: ( ( rule__Parser__ModsAssignment_5 )* )
            {
            // InternalCSVParserGenerator.g:1015:1: ( ( rule__Parser__ModsAssignment_5 )* )
            // InternalCSVParserGenerator.g:1016:2: ( rule__Parser__ModsAssignment_5 )*
            {
             before(grammarAccess.getParserAccess().getModsAssignment_5()); 
            // InternalCSVParserGenerator.g:1017:2: ( rule__Parser__ModsAssignment_5 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=17 && LA12_0<=21)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1017:3: rule__Parser__ModsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Parser__ModsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getParserAccess().getModsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__5__Impl"


    // $ANTLR start "rule__Parser__Group__6"
    // InternalCSVParserGenerator.g:1025:1: rule__Parser__Group__6 : rule__Parser__Group__6__Impl ;
    public final void rule__Parser__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1029:1: ( rule__Parser__Group__6__Impl )
            // InternalCSVParserGenerator.g:1030:2: rule__Parser__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parser__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__6"


    // $ANTLR start "rule__Parser__Group__6__Impl"
    // InternalCSVParserGenerator.g:1036:1: rule__Parser__Group__6__Impl : ( ( rule__Parser__OutAssignment_6 )? ) ;
    public final void rule__Parser__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1040:1: ( ( ( rule__Parser__OutAssignment_6 )? ) )
            // InternalCSVParserGenerator.g:1041:1: ( ( rule__Parser__OutAssignment_6 )? )
            {
            // InternalCSVParserGenerator.g:1041:1: ( ( rule__Parser__OutAssignment_6 )? )
            // InternalCSVParserGenerator.g:1042:2: ( rule__Parser__OutAssignment_6 )?
            {
             before(grammarAccess.getParserAccess().getOutAssignment_6()); 
            // InternalCSVParserGenerator.g:1043:2: ( rule__Parser__OutAssignment_6 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCSVParserGenerator.g:1043:3: rule__Parser__OutAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Parser__OutAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParserAccess().getOutAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__Group__6__Impl"


    // $ANTLR start "rule__FileDecl__Group__0"
    // InternalCSVParserGenerator.g:1052:1: rule__FileDecl__Group__0 : rule__FileDecl__Group__0__Impl rule__FileDecl__Group__1 ;
    public final void rule__FileDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1056:1: ( rule__FileDecl__Group__0__Impl rule__FileDecl__Group__1 )
            // InternalCSVParserGenerator.g:1057:2: rule__FileDecl__Group__0__Impl rule__FileDecl__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FileDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__Group__0"


    // $ANTLR start "rule__FileDecl__Group__0__Impl"
    // InternalCSVParserGenerator.g:1064:1: rule__FileDecl__Group__0__Impl : ( 'file' ) ;
    public final void rule__FileDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1068:1: ( ( 'file' ) )
            // InternalCSVParserGenerator.g:1069:1: ( 'file' )
            {
            // InternalCSVParserGenerator.g:1069:1: ( 'file' )
            // InternalCSVParserGenerator.g:1070:2: 'file'
            {
             before(grammarAccess.getFileDeclAccess().getFileKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFileDeclAccess().getFileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__Group__0__Impl"


    // $ANTLR start "rule__FileDecl__Group__1"
    // InternalCSVParserGenerator.g:1079:1: rule__FileDecl__Group__1 : rule__FileDecl__Group__1__Impl rule__FileDecl__Group__2 ;
    public final void rule__FileDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1083:1: ( rule__FileDecl__Group__1__Impl rule__FileDecl__Group__2 )
            // InternalCSVParserGenerator.g:1084:2: rule__FileDecl__Group__1__Impl rule__FileDecl__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__FileDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__Group__1"


    // $ANTLR start "rule__FileDecl__Group__1__Impl"
    // InternalCSVParserGenerator.g:1091:1: rule__FileDecl__Group__1__Impl : ( ':' ) ;
    public final void rule__FileDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1095:1: ( ( ':' ) )
            // InternalCSVParserGenerator.g:1096:1: ( ':' )
            {
            // InternalCSVParserGenerator.g:1096:1: ( ':' )
            // InternalCSVParserGenerator.g:1097:2: ':'
            {
             before(grammarAccess.getFileDeclAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFileDeclAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__Group__1__Impl"


    // $ANTLR start "rule__FileDecl__Group__2"
    // InternalCSVParserGenerator.g:1106:1: rule__FileDecl__Group__2 : rule__FileDecl__Group__2__Impl rule__FileDecl__Group__3 ;
    public final void rule__FileDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1110:1: ( rule__FileDecl__Group__2__Impl rule__FileDecl__Group__3 )
            // InternalCSVParserGenerator.g:1111:2: rule__FileDecl__Group__2__Impl rule__FileDecl__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__FileDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__Group__2"


    // $ANTLR start "rule__FileDecl__Group__2__Impl"
    // InternalCSVParserGenerator.g:1118:1: rule__FileDecl__Group__2__Impl : ( ( rule__FileDecl__NameAssignment_2 ) ) ;
    public final void rule__FileDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1122:1: ( ( ( rule__FileDecl__NameAssignment_2 ) ) )
            // InternalCSVParserGenerator.g:1123:1: ( ( rule__FileDecl__NameAssignment_2 ) )
            {
            // InternalCSVParserGenerator.g:1123:1: ( ( rule__FileDecl__NameAssignment_2 ) )
            // InternalCSVParserGenerator.g:1124:2: ( rule__FileDecl__NameAssignment_2 )
            {
             before(grammarAccess.getFileDeclAccess().getNameAssignment_2()); 
            // InternalCSVParserGenerator.g:1125:2: ( rule__FileDecl__NameAssignment_2 )
            // InternalCSVParserGenerator.g:1125:3: rule__FileDecl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FileDecl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileDeclAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__Group__2__Impl"


    // $ANTLR start "rule__FileDecl__Group__3"
    // InternalCSVParserGenerator.g:1133:1: rule__FileDecl__Group__3 : rule__FileDecl__Group__3__Impl rule__FileDecl__Group__4 ;
    public final void rule__FileDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1137:1: ( rule__FileDecl__Group__3__Impl rule__FileDecl__Group__4 )
            // InternalCSVParserGenerator.g:1138:2: rule__FileDecl__Group__3__Impl rule__FileDecl__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__FileDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__Group__3"


    // $ANTLR start "rule__FileDecl__Group__3__Impl"
    // InternalCSVParserGenerator.g:1145:1: rule__FileDecl__Group__3__Impl : ( 'separator' ) ;
    public final void rule__FileDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1149:1: ( ( 'separator' ) )
            // InternalCSVParserGenerator.g:1150:1: ( 'separator' )
            {
            // InternalCSVParserGenerator.g:1150:1: ( 'separator' )
            // InternalCSVParserGenerator.g:1151:2: 'separator'
            {
             before(grammarAccess.getFileDeclAccess().getSeparatorKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFileDeclAccess().getSeparatorKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__Group__3__Impl"


    // $ANTLR start "rule__FileDecl__Group__4"
    // InternalCSVParserGenerator.g:1160:1: rule__FileDecl__Group__4 : rule__FileDecl__Group__4__Impl ;
    public final void rule__FileDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1164:1: ( rule__FileDecl__Group__4__Impl )
            // InternalCSVParserGenerator.g:1165:2: rule__FileDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileDecl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__Group__4"


    // $ANTLR start "rule__FileDecl__Group__4__Impl"
    // InternalCSVParserGenerator.g:1171:1: rule__FileDecl__Group__4__Impl : ( ( rule__FileDecl__SepcharAssignment_4 ) ) ;
    public final void rule__FileDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1175:1: ( ( ( rule__FileDecl__SepcharAssignment_4 ) ) )
            // InternalCSVParserGenerator.g:1176:1: ( ( rule__FileDecl__SepcharAssignment_4 ) )
            {
            // InternalCSVParserGenerator.g:1176:1: ( ( rule__FileDecl__SepcharAssignment_4 ) )
            // InternalCSVParserGenerator.g:1177:2: ( rule__FileDecl__SepcharAssignment_4 )
            {
             before(grammarAccess.getFileDeclAccess().getSepcharAssignment_4()); 
            // InternalCSVParserGenerator.g:1178:2: ( rule__FileDecl__SepcharAssignment_4 )
            // InternalCSVParserGenerator.g:1178:3: rule__FileDecl__SepcharAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FileDecl__SepcharAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFileDeclAccess().getSepcharAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__Group__4__Impl"


    // $ANTLR start "rule__ColDecl__Group__0"
    // InternalCSVParserGenerator.g:1187:1: rule__ColDecl__Group__0 : rule__ColDecl__Group__0__Impl rule__ColDecl__Group__1 ;
    public final void rule__ColDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1191:1: ( rule__ColDecl__Group__0__Impl rule__ColDecl__Group__1 )
            // InternalCSVParserGenerator.g:1192:2: rule__ColDecl__Group__0__Impl rule__ColDecl__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ColDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__Group__0"


    // $ANTLR start "rule__ColDecl__Group__0__Impl"
    // InternalCSVParserGenerator.g:1199:1: rule__ColDecl__Group__0__Impl : ( ( rule__ColDecl__NameAssignment_0 ) ) ;
    public final void rule__ColDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1203:1: ( ( ( rule__ColDecl__NameAssignment_0 ) ) )
            // InternalCSVParserGenerator.g:1204:1: ( ( rule__ColDecl__NameAssignment_0 ) )
            {
            // InternalCSVParserGenerator.g:1204:1: ( ( rule__ColDecl__NameAssignment_0 ) )
            // InternalCSVParserGenerator.g:1205:2: ( rule__ColDecl__NameAssignment_0 )
            {
             before(grammarAccess.getColDeclAccess().getNameAssignment_0()); 
            // InternalCSVParserGenerator.g:1206:2: ( rule__ColDecl__NameAssignment_0 )
            // InternalCSVParserGenerator.g:1206:3: rule__ColDecl__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ColDecl__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColDeclAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__Group__0__Impl"


    // $ANTLR start "rule__ColDecl__Group__1"
    // InternalCSVParserGenerator.g:1214:1: rule__ColDecl__Group__1 : rule__ColDecl__Group__1__Impl rule__ColDecl__Group__2 ;
    public final void rule__ColDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1218:1: ( rule__ColDecl__Group__1__Impl rule__ColDecl__Group__2 )
            // InternalCSVParserGenerator.g:1219:2: rule__ColDecl__Group__1__Impl rule__ColDecl__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ColDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__Group__1"


    // $ANTLR start "rule__ColDecl__Group__1__Impl"
    // InternalCSVParserGenerator.g:1226:1: rule__ColDecl__Group__1__Impl : ( ':' ) ;
    public final void rule__ColDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1230:1: ( ( ':' ) )
            // InternalCSVParserGenerator.g:1231:1: ( ':' )
            {
            // InternalCSVParserGenerator.g:1231:1: ( ':' )
            // InternalCSVParserGenerator.g:1232:2: ':'
            {
             before(grammarAccess.getColDeclAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getColDeclAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__Group__1__Impl"


    // $ANTLR start "rule__ColDecl__Group__2"
    // InternalCSVParserGenerator.g:1241:1: rule__ColDecl__Group__2 : rule__ColDecl__Group__2__Impl rule__ColDecl__Group__3 ;
    public final void rule__ColDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1245:1: ( rule__ColDecl__Group__2__Impl rule__ColDecl__Group__3 )
            // InternalCSVParserGenerator.g:1246:2: rule__ColDecl__Group__2__Impl rule__ColDecl__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ColDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__Group__2"


    // $ANTLR start "rule__ColDecl__Group__2__Impl"
    // InternalCSVParserGenerator.g:1253:1: rule__ColDecl__Group__2__Impl : ( ( rule__ColDecl__TypeAssignment_2 ) ) ;
    public final void rule__ColDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1257:1: ( ( ( rule__ColDecl__TypeAssignment_2 ) ) )
            // InternalCSVParserGenerator.g:1258:1: ( ( rule__ColDecl__TypeAssignment_2 ) )
            {
            // InternalCSVParserGenerator.g:1258:1: ( ( rule__ColDecl__TypeAssignment_2 ) )
            // InternalCSVParserGenerator.g:1259:2: ( rule__ColDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getColDeclAccess().getTypeAssignment_2()); 
            // InternalCSVParserGenerator.g:1260:2: ( rule__ColDecl__TypeAssignment_2 )
            // InternalCSVParserGenerator.g:1260:3: rule__ColDecl__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ColDecl__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColDeclAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__Group__2__Impl"


    // $ANTLR start "rule__ColDecl__Group__3"
    // InternalCSVParserGenerator.g:1268:1: rule__ColDecl__Group__3 : rule__ColDecl__Group__3__Impl ;
    public final void rule__ColDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1272:1: ( rule__ColDecl__Group__3__Impl )
            // InternalCSVParserGenerator.g:1273:2: rule__ColDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColDecl__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__Group__3"


    // $ANTLR start "rule__ColDecl__Group__3__Impl"
    // InternalCSVParserGenerator.g:1279:1: rule__ColDecl__Group__3__Impl : ( ( rule__ColDecl__ModsAssignment_3 )* ) ;
    public final void rule__ColDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1283:1: ( ( ( rule__ColDecl__ModsAssignment_3 )* ) )
            // InternalCSVParserGenerator.g:1284:1: ( ( rule__ColDecl__ModsAssignment_3 )* )
            {
            // InternalCSVParserGenerator.g:1284:1: ( ( rule__ColDecl__ModsAssignment_3 )* )
            // InternalCSVParserGenerator.g:1285:2: ( rule__ColDecl__ModsAssignment_3 )*
            {
             before(grammarAccess.getColDeclAccess().getModsAssignment_3()); 
            // InternalCSVParserGenerator.g:1286:2: ( rule__ColDecl__ModsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=17 && LA14_0<=21)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1286:3: rule__ColDecl__ModsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ColDecl__ModsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getColDeclAccess().getModsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__Group__3__Impl"


    // $ANTLR start "rule__Modification__Group_0__0"
    // InternalCSVParserGenerator.g:1295:1: rule__Modification__Group_0__0 : rule__Modification__Group_0__0__Impl rule__Modification__Group_0__1 ;
    public final void rule__Modification__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1299:1: ( rule__Modification__Group_0__0__Impl rule__Modification__Group_0__1 )
            // InternalCSVParserGenerator.g:1300:2: rule__Modification__Group_0__0__Impl rule__Modification__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Modification__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_0__0"


    // $ANTLR start "rule__Modification__Group_0__0__Impl"
    // InternalCSVParserGenerator.g:1307:1: rule__Modification__Group_0__0__Impl : ( () ) ;
    public final void rule__Modification__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1311:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1312:1: ( () )
            {
            // InternalCSVParserGenerator.g:1312:1: ( () )
            // InternalCSVParserGenerator.g:1313:2: ()
            {
             before(grammarAccess.getModificationAccess().getValueMAction_0_0()); 
            // InternalCSVParserGenerator.g:1314:2: ()
            // InternalCSVParserGenerator.g:1314:3: 
            {
            }

             after(grammarAccess.getModificationAccess().getValueMAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_0__0__Impl"


    // $ANTLR start "rule__Modification__Group_0__1"
    // InternalCSVParserGenerator.g:1322:1: rule__Modification__Group_0__1 : rule__Modification__Group_0__1__Impl rule__Modification__Group_0__2 ;
    public final void rule__Modification__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1326:1: ( rule__Modification__Group_0__1__Impl rule__Modification__Group_0__2 )
            // InternalCSVParserGenerator.g:1327:2: rule__Modification__Group_0__1__Impl rule__Modification__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Modification__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_0__1"


    // $ANTLR start "rule__Modification__Group_0__1__Impl"
    // InternalCSVParserGenerator.g:1334:1: rule__Modification__Group_0__1__Impl : ( 'modifications' ) ;
    public final void rule__Modification__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1338:1: ( ( 'modifications' ) )
            // InternalCSVParserGenerator.g:1339:1: ( 'modifications' )
            {
            // InternalCSVParserGenerator.g:1339:1: ( 'modifications' )
            // InternalCSVParserGenerator.g:1340:2: 'modifications'
            {
             before(grammarAccess.getModificationAccess().getModificationsKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getModificationsKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_0__1__Impl"


    // $ANTLR start "rule__Modification__Group_0__2"
    // InternalCSVParserGenerator.g:1349:1: rule__Modification__Group_0__2 : rule__Modification__Group_0__2__Impl rule__Modification__Group_0__3 ;
    public final void rule__Modification__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1353:1: ( rule__Modification__Group_0__2__Impl rule__Modification__Group_0__3 )
            // InternalCSVParserGenerator.g:1354:2: rule__Modification__Group_0__2__Impl rule__Modification__Group_0__3
            {
            pushFollow(FOLLOW_16);
            rule__Modification__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_0__2"


    // $ANTLR start "rule__Modification__Group_0__2__Impl"
    // InternalCSVParserGenerator.g:1361:1: rule__Modification__Group_0__2__Impl : ( '{' ) ;
    public final void rule__Modification__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1365:1: ( ( '{' ) )
            // InternalCSVParserGenerator.g:1366:1: ( '{' )
            {
            // InternalCSVParserGenerator.g:1366:1: ( '{' )
            // InternalCSVParserGenerator.g:1367:2: '{'
            {
             before(grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_0_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_0__2__Impl"


    // $ANTLR start "rule__Modification__Group_0__3"
    // InternalCSVParserGenerator.g:1376:1: rule__Modification__Group_0__3 : rule__Modification__Group_0__3__Impl rule__Modification__Group_0__4 ;
    public final void rule__Modification__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1380:1: ( rule__Modification__Group_0__3__Impl rule__Modification__Group_0__4 )
            // InternalCSVParserGenerator.g:1381:2: rule__Modification__Group_0__3__Impl rule__Modification__Group_0__4
            {
            pushFollow(FOLLOW_16);
            rule__Modification__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_0__3"


    // $ANTLR start "rule__Modification__Group_0__3__Impl"
    // InternalCSVParserGenerator.g:1388:1: rule__Modification__Group_0__3__Impl : ( ( rule__Modification__ModsAssignment_0_3 )* ) ;
    public final void rule__Modification__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1392:1: ( ( ( rule__Modification__ModsAssignment_0_3 )* ) )
            // InternalCSVParserGenerator.g:1393:1: ( ( rule__Modification__ModsAssignment_0_3 )* )
            {
            // InternalCSVParserGenerator.g:1393:1: ( ( rule__Modification__ModsAssignment_0_3 )* )
            // InternalCSVParserGenerator.g:1394:2: ( rule__Modification__ModsAssignment_0_3 )*
            {
             before(grammarAccess.getModificationAccess().getModsAssignment_0_3()); 
            // InternalCSVParserGenerator.g:1395:2: ( rule__Modification__ModsAssignment_0_3 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1395:3: rule__Modification__ModsAssignment_0_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Modification__ModsAssignment_0_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModificationAccess().getModsAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_0__3__Impl"


    // $ANTLR start "rule__Modification__Group_0__4"
    // InternalCSVParserGenerator.g:1403:1: rule__Modification__Group_0__4 : rule__Modification__Group_0__4__Impl ;
    public final void rule__Modification__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1407:1: ( rule__Modification__Group_0__4__Impl )
            // InternalCSVParserGenerator.g:1408:2: rule__Modification__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modification__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_0__4"


    // $ANTLR start "rule__Modification__Group_0__4__Impl"
    // InternalCSVParserGenerator.g:1414:1: rule__Modification__Group_0__4__Impl : ( '}' ) ;
    public final void rule__Modification__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1418:1: ( ( '}' ) )
            // InternalCSVParserGenerator.g:1419:1: ( '}' )
            {
            // InternalCSVParserGenerator.g:1419:1: ( '}' )
            // InternalCSVParserGenerator.g:1420:2: '}'
            {
             before(grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_0_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_0__4__Impl"


    // $ANTLR start "rule__Modification__Group_1__0"
    // InternalCSVParserGenerator.g:1430:1: rule__Modification__Group_1__0 : rule__Modification__Group_1__0__Impl rule__Modification__Group_1__1 ;
    public final void rule__Modification__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1434:1: ( rule__Modification__Group_1__0__Impl rule__Modification__Group_1__1 )
            // InternalCSVParserGenerator.g:1435:2: rule__Modification__Group_1__0__Impl rule__Modification__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Modification__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_1__0"


    // $ANTLR start "rule__Modification__Group_1__0__Impl"
    // InternalCSVParserGenerator.g:1442:1: rule__Modification__Group_1__0__Impl : ( () ) ;
    public final void rule__Modification__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1446:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1447:1: ( () )
            {
            // InternalCSVParserGenerator.g:1447:1: ( () )
            // InternalCSVParserGenerator.g:1448:2: ()
            {
             before(grammarAccess.getModificationAccess().getExtAction_1_0()); 
            // InternalCSVParserGenerator.g:1449:2: ()
            // InternalCSVParserGenerator.g:1449:3: 
            {
            }

             after(grammarAccess.getModificationAccess().getExtAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_1__0__Impl"


    // $ANTLR start "rule__Modification__Group_1__1"
    // InternalCSVParserGenerator.g:1457:1: rule__Modification__Group_1__1 : rule__Modification__Group_1__1__Impl rule__Modification__Group_1__2 ;
    public final void rule__Modification__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1461:1: ( rule__Modification__Group_1__1__Impl rule__Modification__Group_1__2 )
            // InternalCSVParserGenerator.g:1462:2: rule__Modification__Group_1__1__Impl rule__Modification__Group_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Modification__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_1__1"


    // $ANTLR start "rule__Modification__Group_1__1__Impl"
    // InternalCSVParserGenerator.g:1469:1: rule__Modification__Group_1__1__Impl : ( 'externals' ) ;
    public final void rule__Modification__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1473:1: ( ( 'externals' ) )
            // InternalCSVParserGenerator.g:1474:1: ( 'externals' )
            {
            // InternalCSVParserGenerator.g:1474:1: ( 'externals' )
            // InternalCSVParserGenerator.g:1475:2: 'externals'
            {
             before(grammarAccess.getModificationAccess().getExternalsKeyword_1_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getExternalsKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_1__1__Impl"


    // $ANTLR start "rule__Modification__Group_1__2"
    // InternalCSVParserGenerator.g:1484:1: rule__Modification__Group_1__2 : rule__Modification__Group_1__2__Impl rule__Modification__Group_1__3 ;
    public final void rule__Modification__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1488:1: ( rule__Modification__Group_1__2__Impl rule__Modification__Group_1__3 )
            // InternalCSVParserGenerator.g:1489:2: rule__Modification__Group_1__2__Impl rule__Modification__Group_1__3
            {
            pushFollow(FOLLOW_18);
            rule__Modification__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_1__2"


    // $ANTLR start "rule__Modification__Group_1__2__Impl"
    // InternalCSVParserGenerator.g:1496:1: rule__Modification__Group_1__2__Impl : ( '{' ) ;
    public final void rule__Modification__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1500:1: ( ( '{' ) )
            // InternalCSVParserGenerator.g:1501:1: ( '{' )
            {
            // InternalCSVParserGenerator.g:1501:1: ( '{' )
            // InternalCSVParserGenerator.g:1502:2: '{'
            {
             before(grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_1_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_1__2__Impl"


    // $ANTLR start "rule__Modification__Group_1__3"
    // InternalCSVParserGenerator.g:1511:1: rule__Modification__Group_1__3 : rule__Modification__Group_1__3__Impl rule__Modification__Group_1__4 ;
    public final void rule__Modification__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1515:1: ( rule__Modification__Group_1__3__Impl rule__Modification__Group_1__4 )
            // InternalCSVParserGenerator.g:1516:2: rule__Modification__Group_1__3__Impl rule__Modification__Group_1__4
            {
            pushFollow(FOLLOW_18);
            rule__Modification__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_1__3"


    // $ANTLR start "rule__Modification__Group_1__3__Impl"
    // InternalCSVParserGenerator.g:1523:1: rule__Modification__Group_1__3__Impl : ( ( rule__Modification__ModsAssignment_1_3 )* ) ;
    public final void rule__Modification__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1527:1: ( ( ( rule__Modification__ModsAssignment_1_3 )* ) )
            // InternalCSVParserGenerator.g:1528:1: ( ( rule__Modification__ModsAssignment_1_3 )* )
            {
            // InternalCSVParserGenerator.g:1528:1: ( ( rule__Modification__ModsAssignment_1_3 )* )
            // InternalCSVParserGenerator.g:1529:2: ( rule__Modification__ModsAssignment_1_3 )*
            {
             before(grammarAccess.getModificationAccess().getModsAssignment_1_3()); 
            // InternalCSVParserGenerator.g:1530:2: ( rule__Modification__ModsAssignment_1_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1530:3: rule__Modification__ModsAssignment_1_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Modification__ModsAssignment_1_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getModificationAccess().getModsAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_1__3__Impl"


    // $ANTLR start "rule__Modification__Group_1__4"
    // InternalCSVParserGenerator.g:1538:1: rule__Modification__Group_1__4 : rule__Modification__Group_1__4__Impl ;
    public final void rule__Modification__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1542:1: ( rule__Modification__Group_1__4__Impl )
            // InternalCSVParserGenerator.g:1543:2: rule__Modification__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modification__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_1__4"


    // $ANTLR start "rule__Modification__Group_1__4__Impl"
    // InternalCSVParserGenerator.g:1549:1: rule__Modification__Group_1__4__Impl : ( '}' ) ;
    public final void rule__Modification__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1553:1: ( ( '}' ) )
            // InternalCSVParserGenerator.g:1554:1: ( '}' )
            {
            // InternalCSVParserGenerator.g:1554:1: ( '}' )
            // InternalCSVParserGenerator.g:1555:2: '}'
            {
             before(grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_1_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_1__4__Impl"


    // $ANTLR start "rule__Modification__Group_2__0"
    // InternalCSVParserGenerator.g:1565:1: rule__Modification__Group_2__0 : rule__Modification__Group_2__0__Impl rule__Modification__Group_2__1 ;
    public final void rule__Modification__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1569:1: ( rule__Modification__Group_2__0__Impl rule__Modification__Group_2__1 )
            // InternalCSVParserGenerator.g:1570:2: rule__Modification__Group_2__0__Impl rule__Modification__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Modification__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_2__0"


    // $ANTLR start "rule__Modification__Group_2__0__Impl"
    // InternalCSVParserGenerator.g:1577:1: rule__Modification__Group_2__0__Impl : ( () ) ;
    public final void rule__Modification__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1581:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1582:1: ( () )
            {
            // InternalCSVParserGenerator.g:1582:1: ( () )
            // InternalCSVParserGenerator.g:1583:2: ()
            {
             before(grammarAccess.getModificationAccess().getStatAction_2_0()); 
            // InternalCSVParserGenerator.g:1584:2: ()
            // InternalCSVParserGenerator.g:1584:3: 
            {
            }

             after(grammarAccess.getModificationAccess().getStatAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_2__0__Impl"


    // $ANTLR start "rule__Modification__Group_2__1"
    // InternalCSVParserGenerator.g:1592:1: rule__Modification__Group_2__1 : rule__Modification__Group_2__1__Impl rule__Modification__Group_2__2 ;
    public final void rule__Modification__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1596:1: ( rule__Modification__Group_2__1__Impl rule__Modification__Group_2__2 )
            // InternalCSVParserGenerator.g:1597:2: rule__Modification__Group_2__1__Impl rule__Modification__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Modification__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_2__1"


    // $ANTLR start "rule__Modification__Group_2__1__Impl"
    // InternalCSVParserGenerator.g:1604:1: rule__Modification__Group_2__1__Impl : ( 'statistics' ) ;
    public final void rule__Modification__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1608:1: ( ( 'statistics' ) )
            // InternalCSVParserGenerator.g:1609:1: ( 'statistics' )
            {
            // InternalCSVParserGenerator.g:1609:1: ( 'statistics' )
            // InternalCSVParserGenerator.g:1610:2: 'statistics'
            {
             before(grammarAccess.getModificationAccess().getStatisticsKeyword_2_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getStatisticsKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_2__1__Impl"


    // $ANTLR start "rule__Modification__Group_2__2"
    // InternalCSVParserGenerator.g:1619:1: rule__Modification__Group_2__2 : rule__Modification__Group_2__2__Impl rule__Modification__Group_2__3 ;
    public final void rule__Modification__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1623:1: ( rule__Modification__Group_2__2__Impl rule__Modification__Group_2__3 )
            // InternalCSVParserGenerator.g:1624:2: rule__Modification__Group_2__2__Impl rule__Modification__Group_2__3
            {
            pushFollow(FOLLOW_21);
            rule__Modification__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_2__2"


    // $ANTLR start "rule__Modification__Group_2__2__Impl"
    // InternalCSVParserGenerator.g:1631:1: rule__Modification__Group_2__2__Impl : ( '{' ) ;
    public final void rule__Modification__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1635:1: ( ( '{' ) )
            // InternalCSVParserGenerator.g:1636:1: ( '{' )
            {
            // InternalCSVParserGenerator.g:1636:1: ( '{' )
            // InternalCSVParserGenerator.g:1637:2: '{'
            {
             before(grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_2_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_2__2__Impl"


    // $ANTLR start "rule__Modification__Group_2__3"
    // InternalCSVParserGenerator.g:1646:1: rule__Modification__Group_2__3 : rule__Modification__Group_2__3__Impl rule__Modification__Group_2__4 ;
    public final void rule__Modification__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1650:1: ( rule__Modification__Group_2__3__Impl rule__Modification__Group_2__4 )
            // InternalCSVParserGenerator.g:1651:2: rule__Modification__Group_2__3__Impl rule__Modification__Group_2__4
            {
            pushFollow(FOLLOW_21);
            rule__Modification__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_2__3"


    // $ANTLR start "rule__Modification__Group_2__3__Impl"
    // InternalCSVParserGenerator.g:1658:1: rule__Modification__Group_2__3__Impl : ( ( rule__Modification__ModsAssignment_2_3 )* ) ;
    public final void rule__Modification__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1662:1: ( ( ( rule__Modification__ModsAssignment_2_3 )* ) )
            // InternalCSVParserGenerator.g:1663:1: ( ( rule__Modification__ModsAssignment_2_3 )* )
            {
            // InternalCSVParserGenerator.g:1663:1: ( ( rule__Modification__ModsAssignment_2_3 )* )
            // InternalCSVParserGenerator.g:1664:2: ( rule__Modification__ModsAssignment_2_3 )*
            {
             before(grammarAccess.getModificationAccess().getModsAssignment_2_3()); 
            // InternalCSVParserGenerator.g:1665:2: ( rule__Modification__ModsAssignment_2_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=40 && LA17_0<=44)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1665:3: rule__Modification__ModsAssignment_2_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Modification__ModsAssignment_2_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getModificationAccess().getModsAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_2__3__Impl"


    // $ANTLR start "rule__Modification__Group_2__4"
    // InternalCSVParserGenerator.g:1673:1: rule__Modification__Group_2__4 : rule__Modification__Group_2__4__Impl ;
    public final void rule__Modification__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1677:1: ( rule__Modification__Group_2__4__Impl )
            // InternalCSVParserGenerator.g:1678:2: rule__Modification__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modification__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_2__4"


    // $ANTLR start "rule__Modification__Group_2__4__Impl"
    // InternalCSVParserGenerator.g:1684:1: rule__Modification__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Modification__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1688:1: ( ( '}' ) )
            // InternalCSVParserGenerator.g:1689:1: ( '}' )
            {
            // InternalCSVParserGenerator.g:1689:1: ( '}' )
            // InternalCSVParserGenerator.g:1690:2: '}'
            {
             before(grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_2__4__Impl"


    // $ANTLR start "rule__Modification__Group_3__0"
    // InternalCSVParserGenerator.g:1700:1: rule__Modification__Group_3__0 : rule__Modification__Group_3__0__Impl rule__Modification__Group_3__1 ;
    public final void rule__Modification__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1704:1: ( rule__Modification__Group_3__0__Impl rule__Modification__Group_3__1 )
            // InternalCSVParserGenerator.g:1705:2: rule__Modification__Group_3__0__Impl rule__Modification__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Modification__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_3__0"


    // $ANTLR start "rule__Modification__Group_3__0__Impl"
    // InternalCSVParserGenerator.g:1712:1: rule__Modification__Group_3__0__Impl : ( () ) ;
    public final void rule__Modification__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1716:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1717:1: ( () )
            {
            // InternalCSVParserGenerator.g:1717:1: ( () )
            // InternalCSVParserGenerator.g:1718:2: ()
            {
             before(grammarAccess.getModificationAccess().getColActAction_3_0()); 
            // InternalCSVParserGenerator.g:1719:2: ()
            // InternalCSVParserGenerator.g:1719:3: 
            {
            }

             after(grammarAccess.getModificationAccess().getColActAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_3__0__Impl"


    // $ANTLR start "rule__Modification__Group_3__1"
    // InternalCSVParserGenerator.g:1727:1: rule__Modification__Group_3__1 : rule__Modification__Group_3__1__Impl rule__Modification__Group_3__2 ;
    public final void rule__Modification__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1731:1: ( rule__Modification__Group_3__1__Impl rule__Modification__Group_3__2 )
            // InternalCSVParserGenerator.g:1732:2: rule__Modification__Group_3__1__Impl rule__Modification__Group_3__2
            {
            pushFollow(FOLLOW_4);
            rule__Modification__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_3__1"


    // $ANTLR start "rule__Modification__Group_3__1__Impl"
    // InternalCSVParserGenerator.g:1739:1: rule__Modification__Group_3__1__Impl : ( 'layout' ) ;
    public final void rule__Modification__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1743:1: ( ( 'layout' ) )
            // InternalCSVParserGenerator.g:1744:1: ( 'layout' )
            {
            // InternalCSVParserGenerator.g:1744:1: ( 'layout' )
            // InternalCSVParserGenerator.g:1745:2: 'layout'
            {
             before(grammarAccess.getModificationAccess().getLayoutKeyword_3_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getLayoutKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_3__1__Impl"


    // $ANTLR start "rule__Modification__Group_3__2"
    // InternalCSVParserGenerator.g:1754:1: rule__Modification__Group_3__2 : rule__Modification__Group_3__2__Impl rule__Modification__Group_3__3 ;
    public final void rule__Modification__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1758:1: ( rule__Modification__Group_3__2__Impl rule__Modification__Group_3__3 )
            // InternalCSVParserGenerator.g:1759:2: rule__Modification__Group_3__2__Impl rule__Modification__Group_3__3
            {
            pushFollow(FOLLOW_24);
            rule__Modification__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_3__2"


    // $ANTLR start "rule__Modification__Group_3__2__Impl"
    // InternalCSVParserGenerator.g:1766:1: rule__Modification__Group_3__2__Impl : ( '{' ) ;
    public final void rule__Modification__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1770:1: ( ( '{' ) )
            // InternalCSVParserGenerator.g:1771:1: ( '{' )
            {
            // InternalCSVParserGenerator.g:1771:1: ( '{' )
            // InternalCSVParserGenerator.g:1772:2: '{'
            {
             before(grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_3_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_3__2__Impl"


    // $ANTLR start "rule__Modification__Group_3__3"
    // InternalCSVParserGenerator.g:1781:1: rule__Modification__Group_3__3 : rule__Modification__Group_3__3__Impl rule__Modification__Group_3__4 ;
    public final void rule__Modification__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1785:1: ( rule__Modification__Group_3__3__Impl rule__Modification__Group_3__4 )
            // InternalCSVParserGenerator.g:1786:2: rule__Modification__Group_3__3__Impl rule__Modification__Group_3__4
            {
            pushFollow(FOLLOW_24);
            rule__Modification__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_3__3"


    // $ANTLR start "rule__Modification__Group_3__3__Impl"
    // InternalCSVParserGenerator.g:1793:1: rule__Modification__Group_3__3__Impl : ( ( rule__Modification__ModsAssignment_3_3 )* ) ;
    public final void rule__Modification__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1797:1: ( ( ( rule__Modification__ModsAssignment_3_3 )* ) )
            // InternalCSVParserGenerator.g:1798:1: ( ( rule__Modification__ModsAssignment_3_3 )* )
            {
            // InternalCSVParserGenerator.g:1798:1: ( ( rule__Modification__ModsAssignment_3_3 )* )
            // InternalCSVParserGenerator.g:1799:2: ( rule__Modification__ModsAssignment_3_3 )*
            {
             before(grammarAccess.getModificationAccess().getModsAssignment_3_3()); 
            // InternalCSVParserGenerator.g:1800:2: ( rule__Modification__ModsAssignment_3_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==45||LA18_0==47) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1800:3: rule__Modification__ModsAssignment_3_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Modification__ModsAssignment_3_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getModificationAccess().getModsAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_3__3__Impl"


    // $ANTLR start "rule__Modification__Group_3__4"
    // InternalCSVParserGenerator.g:1808:1: rule__Modification__Group_3__4 : rule__Modification__Group_3__4__Impl ;
    public final void rule__Modification__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1812:1: ( rule__Modification__Group_3__4__Impl )
            // InternalCSVParserGenerator.g:1813:2: rule__Modification__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modification__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_3__4"


    // $ANTLR start "rule__Modification__Group_3__4__Impl"
    // InternalCSVParserGenerator.g:1819:1: rule__Modification__Group_3__4__Impl : ( '}' ) ;
    public final void rule__Modification__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1823:1: ( ( '}' ) )
            // InternalCSVParserGenerator.g:1824:1: ( '}' )
            {
            // InternalCSVParserGenerator.g:1824:1: ( '}' )
            // InternalCSVParserGenerator.g:1825:2: '}'
            {
             before(grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_3__4__Impl"


    // $ANTLR start "rule__Modification__Group_4__0"
    // InternalCSVParserGenerator.g:1835:1: rule__Modification__Group_4__0 : rule__Modification__Group_4__0__Impl rule__Modification__Group_4__1 ;
    public final void rule__Modification__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1839:1: ( rule__Modification__Group_4__0__Impl rule__Modification__Group_4__1 )
            // InternalCSVParserGenerator.g:1840:2: rule__Modification__Group_4__0__Impl rule__Modification__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Modification__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_4__0"


    // $ANTLR start "rule__Modification__Group_4__0__Impl"
    // InternalCSVParserGenerator.g:1847:1: rule__Modification__Group_4__0__Impl : ( () ) ;
    public final void rule__Modification__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1851:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1852:1: ( () )
            {
            // InternalCSVParserGenerator.g:1852:1: ( () )
            // InternalCSVParserGenerator.g:1853:2: ()
            {
             before(grammarAccess.getModificationAccess().getConstrainAction_4_0()); 
            // InternalCSVParserGenerator.g:1854:2: ()
            // InternalCSVParserGenerator.g:1854:3: 
            {
            }

             after(grammarAccess.getModificationAccess().getConstrainAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_4__0__Impl"


    // $ANTLR start "rule__Modification__Group_4__1"
    // InternalCSVParserGenerator.g:1862:1: rule__Modification__Group_4__1 : rule__Modification__Group_4__1__Impl rule__Modification__Group_4__2 ;
    public final void rule__Modification__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1866:1: ( rule__Modification__Group_4__1__Impl rule__Modification__Group_4__2 )
            // InternalCSVParserGenerator.g:1867:2: rule__Modification__Group_4__1__Impl rule__Modification__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Modification__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_4__1"


    // $ANTLR start "rule__Modification__Group_4__1__Impl"
    // InternalCSVParserGenerator.g:1874:1: rule__Modification__Group_4__1__Impl : ( 'constraints' ) ;
    public final void rule__Modification__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1878:1: ( ( 'constraints' ) )
            // InternalCSVParserGenerator.g:1879:1: ( 'constraints' )
            {
            // InternalCSVParserGenerator.g:1879:1: ( 'constraints' )
            // InternalCSVParserGenerator.g:1880:2: 'constraints'
            {
             before(grammarAccess.getModificationAccess().getConstraintsKeyword_4_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getConstraintsKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_4__1__Impl"


    // $ANTLR start "rule__Modification__Group_4__2"
    // InternalCSVParserGenerator.g:1889:1: rule__Modification__Group_4__2 : rule__Modification__Group_4__2__Impl rule__Modification__Group_4__3 ;
    public final void rule__Modification__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1893:1: ( rule__Modification__Group_4__2__Impl rule__Modification__Group_4__3 )
            // InternalCSVParserGenerator.g:1894:2: rule__Modification__Group_4__2__Impl rule__Modification__Group_4__3
            {
            pushFollow(FOLLOW_26);
            rule__Modification__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_4__2"


    // $ANTLR start "rule__Modification__Group_4__2__Impl"
    // InternalCSVParserGenerator.g:1901:1: rule__Modification__Group_4__2__Impl : ( '{' ) ;
    public final void rule__Modification__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1905:1: ( ( '{' ) )
            // InternalCSVParserGenerator.g:1906:1: ( '{' )
            {
            // InternalCSVParserGenerator.g:1906:1: ( '{' )
            // InternalCSVParserGenerator.g:1907:2: '{'
            {
             before(grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_4_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_4__2__Impl"


    // $ANTLR start "rule__Modification__Group_4__3"
    // InternalCSVParserGenerator.g:1916:1: rule__Modification__Group_4__3 : rule__Modification__Group_4__3__Impl rule__Modification__Group_4__4 ;
    public final void rule__Modification__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1920:1: ( rule__Modification__Group_4__3__Impl rule__Modification__Group_4__4 )
            // InternalCSVParserGenerator.g:1921:2: rule__Modification__Group_4__3__Impl rule__Modification__Group_4__4
            {
            pushFollow(FOLLOW_26);
            rule__Modification__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Modification__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_4__3"


    // $ANTLR start "rule__Modification__Group_4__3__Impl"
    // InternalCSVParserGenerator.g:1928:1: rule__Modification__Group_4__3__Impl : ( ( rule__Modification__ModsAssignment_4_3 )* ) ;
    public final void rule__Modification__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1932:1: ( ( ( rule__Modification__ModsAssignment_4_3 )* ) )
            // InternalCSVParserGenerator.g:1933:1: ( ( rule__Modification__ModsAssignment_4_3 )* )
            {
            // InternalCSVParserGenerator.g:1933:1: ( ( rule__Modification__ModsAssignment_4_3 )* )
            // InternalCSVParserGenerator.g:1934:2: ( rule__Modification__ModsAssignment_4_3 )*
            {
             before(grammarAccess.getModificationAccess().getModsAssignment_4_3()); 
            // InternalCSVParserGenerator.g:1935:2: ( rule__Modification__ModsAssignment_4_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==52) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1935:3: rule__Modification__ModsAssignment_4_3
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Modification__ModsAssignment_4_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getModificationAccess().getModsAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_4__3__Impl"


    // $ANTLR start "rule__Modification__Group_4__4"
    // InternalCSVParserGenerator.g:1943:1: rule__Modification__Group_4__4 : rule__Modification__Group_4__4__Impl ;
    public final void rule__Modification__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1947:1: ( rule__Modification__Group_4__4__Impl )
            // InternalCSVParserGenerator.g:1948:2: rule__Modification__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Modification__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_4__4"


    // $ANTLR start "rule__Modification__Group_4__4__Impl"
    // InternalCSVParserGenerator.g:1954:1: rule__Modification__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Modification__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1958:1: ( ( '}' ) )
            // InternalCSVParserGenerator.g:1959:1: ( '}' )
            {
            // InternalCSVParserGenerator.g:1959:1: ( '}' )
            // InternalCSVParserGenerator.g:1960:2: '}'
            {
             before(grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__Group_4__4__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalCSVParserGenerator.g:1970:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1974:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalCSVParserGenerator.g:1975:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalCSVParserGenerator.g:1982:1: rule__Output__Group__0__Impl : ( 'output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1986:1: ( ( 'output' ) )
            // InternalCSVParserGenerator.g:1987:1: ( 'output' )
            {
            // InternalCSVParserGenerator.g:1987:1: ( 'output' )
            // InternalCSVParserGenerator.g:1988:2: 'output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalCSVParserGenerator.g:1997:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2001:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalCSVParserGenerator.g:2002:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalCSVParserGenerator.g:2009:1: rule__Output__Group__1__Impl : ( ':' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2013:1: ( ( ':' ) )
            // InternalCSVParserGenerator.g:2014:1: ( ':' )
            {
            // InternalCSVParserGenerator.g:2014:1: ( ':' )
            // InternalCSVParserGenerator.g:2015:2: ':'
            {
             before(grammarAccess.getOutputAccess().getColonKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalCSVParserGenerator.g:2024:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2028:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalCSVParserGenerator.g:2029:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalCSVParserGenerator.g:2036:1: rule__Output__Group__2__Impl : ( ( rule__Output__NameAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2040:1: ( ( ( rule__Output__NameAssignment_2 ) ) )
            // InternalCSVParserGenerator.g:2041:1: ( ( rule__Output__NameAssignment_2 ) )
            {
            // InternalCSVParserGenerator.g:2041:1: ( ( rule__Output__NameAssignment_2 ) )
            // InternalCSVParserGenerator.g:2042:2: ( rule__Output__NameAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getNameAssignment_2()); 
            // InternalCSVParserGenerator.g:2043:2: ( rule__Output__NameAssignment_2 )
            // InternalCSVParserGenerator.g:2043:3: rule__Output__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Output__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalCSVParserGenerator.g:2051:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2055:1: ( rule__Output__Group__3__Impl )
            // InternalCSVParserGenerator.g:2056:2: rule__Output__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalCSVParserGenerator.g:2062:1: rule__Output__Group__3__Impl : ( ( rule__Output__Group_3__0 )? ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2066:1: ( ( ( rule__Output__Group_3__0 )? ) )
            // InternalCSVParserGenerator.g:2067:1: ( ( rule__Output__Group_3__0 )? )
            {
            // InternalCSVParserGenerator.g:2067:1: ( ( rule__Output__Group_3__0 )? )
            // InternalCSVParserGenerator.g:2068:2: ( rule__Output__Group_3__0 )?
            {
             before(grammarAccess.getOutputAccess().getGroup_3()); 
            // InternalCSVParserGenerator.g:2069:2: ( rule__Output__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalCSVParserGenerator.g:2069:3: rule__Output__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Output__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Output__Group_3__0"
    // InternalCSVParserGenerator.g:2078:1: rule__Output__Group_3__0 : rule__Output__Group_3__0__Impl rule__Output__Group_3__1 ;
    public final void rule__Output__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2082:1: ( rule__Output__Group_3__0__Impl rule__Output__Group_3__1 )
            // InternalCSVParserGenerator.g:2083:2: rule__Output__Group_3__0__Impl rule__Output__Group_3__1
            {
            pushFollow(FOLLOW_29);
            rule__Output__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0"


    // $ANTLR start "rule__Output__Group_3__0__Impl"
    // InternalCSVParserGenerator.g:2090:1: rule__Output__Group_3__0__Impl : ( 'records' ) ;
    public final void rule__Output__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2094:1: ( ( 'records' ) )
            // InternalCSVParserGenerator.g:2095:1: ( 'records' )
            {
            // InternalCSVParserGenerator.g:2095:1: ( 'records' )
            // InternalCSVParserGenerator.g:2096:2: 'records'
            {
             before(grammarAccess.getOutputAccess().getRecordsKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getRecordsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__0__Impl"


    // $ANTLR start "rule__Output__Group_3__1"
    // InternalCSVParserGenerator.g:2105:1: rule__Output__Group_3__1 : rule__Output__Group_3__1__Impl ;
    public final void rule__Output__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2109:1: ( rule__Output__Group_3__1__Impl )
            // InternalCSVParserGenerator.g:2110:2: rule__Output__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1"


    // $ANTLR start "rule__Output__Group_3__1__Impl"
    // InternalCSVParserGenerator.g:2116:1: rule__Output__Group_3__1__Impl : ( ( rule__Output__NumberAssignment_3_1 ) ) ;
    public final void rule__Output__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2120:1: ( ( ( rule__Output__NumberAssignment_3_1 ) ) )
            // InternalCSVParserGenerator.g:2121:1: ( ( rule__Output__NumberAssignment_3_1 ) )
            {
            // InternalCSVParserGenerator.g:2121:1: ( ( rule__Output__NumberAssignment_3_1 ) )
            // InternalCSVParserGenerator.g:2122:2: ( rule__Output__NumberAssignment_3_1 )
            {
             before(grammarAccess.getOutputAccess().getNumberAssignment_3_1()); 
            // InternalCSVParserGenerator.g:2123:2: ( rule__Output__NumberAssignment_3_1 )
            // InternalCSVParserGenerator.g:2123:3: rule__Output__NumberAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Output__NumberAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getNumberAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_3__1__Impl"


    // $ANTLR start "rule__ValueMod__Group__0"
    // InternalCSVParserGenerator.g:2132:1: rule__ValueMod__Group__0 : rule__ValueMod__Group__0__Impl rule__ValueMod__Group__1 ;
    public final void rule__ValueMod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2136:1: ( rule__ValueMod__Group__0__Impl rule__ValueMod__Group__1 )
            // InternalCSVParserGenerator.g:2137:2: rule__ValueMod__Group__0__Impl rule__ValueMod__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ValueMod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueMod__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueMod__Group__0"


    // $ANTLR start "rule__ValueMod__Group__0__Impl"
    // InternalCSVParserGenerator.g:2144:1: rule__ValueMod__Group__0__Impl : ( ( rule__ValueMod__NameAssignment_0 ) ) ;
    public final void rule__ValueMod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2148:1: ( ( ( rule__ValueMod__NameAssignment_0 ) ) )
            // InternalCSVParserGenerator.g:2149:1: ( ( rule__ValueMod__NameAssignment_0 ) )
            {
            // InternalCSVParserGenerator.g:2149:1: ( ( rule__ValueMod__NameAssignment_0 ) )
            // InternalCSVParserGenerator.g:2150:2: ( rule__ValueMod__NameAssignment_0 )
            {
             before(grammarAccess.getValueModAccess().getNameAssignment_0()); 
            // InternalCSVParserGenerator.g:2151:2: ( rule__ValueMod__NameAssignment_0 )
            // InternalCSVParserGenerator.g:2151:3: rule__ValueMod__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ValueMod__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getValueModAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueMod__Group__0__Impl"


    // $ANTLR start "rule__ValueMod__Group__1"
    // InternalCSVParserGenerator.g:2159:1: rule__ValueMod__Group__1 : rule__ValueMod__Group__1__Impl rule__ValueMod__Group__2 ;
    public final void rule__ValueMod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2163:1: ( rule__ValueMod__Group__1__Impl rule__ValueMod__Group__2 )
            // InternalCSVParserGenerator.g:2164:2: rule__ValueMod__Group__1__Impl rule__ValueMod__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ValueMod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueMod__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueMod__Group__1"


    // $ANTLR start "rule__ValueMod__Group__1__Impl"
    // InternalCSVParserGenerator.g:2171:1: rule__ValueMod__Group__1__Impl : ( '=' ) ;
    public final void rule__ValueMod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2175:1: ( ( '=' ) )
            // InternalCSVParserGenerator.g:2176:1: ( '=' )
            {
            // InternalCSVParserGenerator.g:2176:1: ( '=' )
            // InternalCSVParserGenerator.g:2177:2: '='
            {
             before(grammarAccess.getValueModAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getValueModAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueMod__Group__1__Impl"


    // $ANTLR start "rule__ValueMod__Group__2"
    // InternalCSVParserGenerator.g:2186:1: rule__ValueMod__Group__2 : rule__ValueMod__Group__2__Impl ;
    public final void rule__ValueMod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2190:1: ( rule__ValueMod__Group__2__Impl )
            // InternalCSVParserGenerator.g:2191:2: rule__ValueMod__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueMod__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueMod__Group__2"


    // $ANTLR start "rule__ValueMod__Group__2__Impl"
    // InternalCSVParserGenerator.g:2197:1: rule__ValueMod__Group__2__Impl : ( ( rule__ValueMod__ExpAssignment_2 ) ) ;
    public final void rule__ValueMod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2201:1: ( ( ( rule__ValueMod__ExpAssignment_2 ) ) )
            // InternalCSVParserGenerator.g:2202:1: ( ( rule__ValueMod__ExpAssignment_2 ) )
            {
            // InternalCSVParserGenerator.g:2202:1: ( ( rule__ValueMod__ExpAssignment_2 ) )
            // InternalCSVParserGenerator.g:2203:2: ( rule__ValueMod__ExpAssignment_2 )
            {
             before(grammarAccess.getValueModAccess().getExpAssignment_2()); 
            // InternalCSVParserGenerator.g:2204:2: ( rule__ValueMod__ExpAssignment_2 )
            // InternalCSVParserGenerator.g:2204:3: rule__ValueMod__ExpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ValueMod__ExpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getValueModAccess().getExpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueMod__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_0__0"
    // InternalCSVParserGenerator.g:2213:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2217:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalCSVParserGenerator.g:2218:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__Type__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0"


    // $ANTLR start "rule__Type__Group_0__0__Impl"
    // InternalCSVParserGenerator.g:2225:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2229:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2230:1: ( () )
            {
            // InternalCSVParserGenerator.g:2230:1: ( () )
            // InternalCSVParserGenerator.g:2231:2: ()
            {
             before(grammarAccess.getTypeAccess().getStrAction_0_0()); 
            // InternalCSVParserGenerator.g:2232:2: ()
            // InternalCSVParserGenerator.g:2232:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getStrAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__0__Impl"


    // $ANTLR start "rule__Type__Group_0__1"
    // InternalCSVParserGenerator.g:2240:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2244:1: ( rule__Type__Group_0__1__Impl )
            // InternalCSVParserGenerator.g:2245:2: rule__Type__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1"


    // $ANTLR start "rule__Type__Group_0__1__Impl"
    // InternalCSVParserGenerator.g:2251:1: rule__Type__Group_0__1__Impl : ( 'string' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2255:1: ( ( 'string' ) )
            // InternalCSVParserGenerator.g:2256:1: ( 'string' )
            {
            // InternalCSVParserGenerator.g:2256:1: ( 'string' )
            // InternalCSVParserGenerator.g:2257:2: 'string'
            {
             before(grammarAccess.getTypeAccess().getStringKeyword_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getStringKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_0__1__Impl"


    // $ANTLR start "rule__Type__Group_1__0"
    // InternalCSVParserGenerator.g:2267:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2271:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalCSVParserGenerator.g:2272:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Type__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0"


    // $ANTLR start "rule__Type__Group_1__0__Impl"
    // InternalCSVParserGenerator.g:2279:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2283:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2284:1: ( () )
            {
            // InternalCSVParserGenerator.g:2284:1: ( () )
            // InternalCSVParserGenerator.g:2285:2: ()
            {
             before(grammarAccess.getTypeAccess().getIntegAction_1_0()); 
            // InternalCSVParserGenerator.g:2286:2: ()
            // InternalCSVParserGenerator.g:2286:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getIntegAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__0__Impl"


    // $ANTLR start "rule__Type__Group_1__1"
    // InternalCSVParserGenerator.g:2294:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2298:1: ( rule__Type__Group_1__1__Impl )
            // InternalCSVParserGenerator.g:2299:2: rule__Type__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1"


    // $ANTLR start "rule__Type__Group_1__1__Impl"
    // InternalCSVParserGenerator.g:2305:1: rule__Type__Group_1__1__Impl : ( 'integer' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2309:1: ( ( 'integer' ) )
            // InternalCSVParserGenerator.g:2310:1: ( 'integer' )
            {
            // InternalCSVParserGenerator.g:2310:1: ( 'integer' )
            // InternalCSVParserGenerator.g:2311:2: 'integer'
            {
             before(grammarAccess.getTypeAccess().getIntegerKeyword_1_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getIntegerKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_1__1__Impl"


    // $ANTLR start "rule__Type__Group_2__0"
    // InternalCSVParserGenerator.g:2321:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2325:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalCSVParserGenerator.g:2326:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__Type__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0"


    // $ANTLR start "rule__Type__Group_2__0__Impl"
    // InternalCSVParserGenerator.g:2333:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2337:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2338:1: ( () )
            {
            // InternalCSVParserGenerator.g:2338:1: ( () )
            // InternalCSVParserGenerator.g:2339:2: ()
            {
             before(grammarAccess.getTypeAccess().getDateAction_2_0()); 
            // InternalCSVParserGenerator.g:2340:2: ()
            // InternalCSVParserGenerator.g:2340:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getDateAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__0__Impl"


    // $ANTLR start "rule__Type__Group_2__1"
    // InternalCSVParserGenerator.g:2348:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2352:1: ( rule__Type__Group_2__1__Impl )
            // InternalCSVParserGenerator.g:2353:2: rule__Type__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1"


    // $ANTLR start "rule__Type__Group_2__1__Impl"
    // InternalCSVParserGenerator.g:2359:1: rule__Type__Group_2__1__Impl : ( 'date' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2363:1: ( ( 'date' ) )
            // InternalCSVParserGenerator.g:2364:1: ( 'date' )
            {
            // InternalCSVParserGenerator.g:2364:1: ( 'date' )
            // InternalCSVParserGenerator.g:2365:2: 'date'
            {
             before(grammarAccess.getTypeAccess().getDateKeyword_2_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getDateKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_2__1__Impl"


    // $ANTLR start "rule__Type__Group_3__0"
    // InternalCSVParserGenerator.g:2375:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2379:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalCSVParserGenerator.g:2380:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Type__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0"


    // $ANTLR start "rule__Type__Group_3__0__Impl"
    // InternalCSVParserGenerator.g:2387:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2391:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2392:1: ( () )
            {
            // InternalCSVParserGenerator.g:2392:1: ( () )
            // InternalCSVParserGenerator.g:2393:2: ()
            {
             before(grammarAccess.getTypeAccess().getFloaAction_3_0()); 
            // InternalCSVParserGenerator.g:2394:2: ()
            // InternalCSVParserGenerator.g:2394:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getFloaAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__0__Impl"


    // $ANTLR start "rule__Type__Group_3__1"
    // InternalCSVParserGenerator.g:2402:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2406:1: ( rule__Type__Group_3__1__Impl )
            // InternalCSVParserGenerator.g:2407:2: rule__Type__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1"


    // $ANTLR start "rule__Type__Group_3__1__Impl"
    // InternalCSVParserGenerator.g:2413:1: rule__Type__Group_3__1__Impl : ( 'float' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2417:1: ( ( 'float' ) )
            // InternalCSVParserGenerator.g:2418:1: ( 'float' )
            {
            // InternalCSVParserGenerator.g:2418:1: ( 'float' )
            // InternalCSVParserGenerator.g:2419:2: 'float'
            {
             before(grammarAccess.getTypeAccess().getFloatKeyword_3_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getFloatKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group_3__1__Impl"


    // $ANTLR start "rule__LogExp__Group__0"
    // InternalCSVParserGenerator.g:2429:1: rule__LogExp__Group__0 : rule__LogExp__Group__0__Impl rule__LogExp__Group__1 ;
    public final void rule__LogExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2433:1: ( rule__LogExp__Group__0__Impl rule__LogExp__Group__1 )
            // InternalCSVParserGenerator.g:2434:2: rule__LogExp__Group__0__Impl rule__LogExp__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__LogExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group__0"


    // $ANTLR start "rule__LogExp__Group__0__Impl"
    // InternalCSVParserGenerator.g:2441:1: rule__LogExp__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__LogExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2445:1: ( ( ruleComparison ) )
            // InternalCSVParserGenerator.g:2446:1: ( ruleComparison )
            {
            // InternalCSVParserGenerator.g:2446:1: ( ruleComparison )
            // InternalCSVParserGenerator.g:2447:2: ruleComparison
            {
             before(grammarAccess.getLogExpAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getLogExpAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group__0__Impl"


    // $ANTLR start "rule__LogExp__Group__1"
    // InternalCSVParserGenerator.g:2456:1: rule__LogExp__Group__1 : rule__LogExp__Group__1__Impl ;
    public final void rule__LogExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2460:1: ( rule__LogExp__Group__1__Impl )
            // InternalCSVParserGenerator.g:2461:2: rule__LogExp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogExp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group__1"


    // $ANTLR start "rule__LogExp__Group__1__Impl"
    // InternalCSVParserGenerator.g:2467:1: rule__LogExp__Group__1__Impl : ( ( rule__LogExp__Group_1__0 )* ) ;
    public final void rule__LogExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2471:1: ( ( ( rule__LogExp__Group_1__0 )* ) )
            // InternalCSVParserGenerator.g:2472:1: ( ( rule__LogExp__Group_1__0 )* )
            {
            // InternalCSVParserGenerator.g:2472:1: ( ( rule__LogExp__Group_1__0 )* )
            // InternalCSVParserGenerator.g:2473:2: ( rule__LogExp__Group_1__0 )*
            {
             before(grammarAccess.getLogExpAccess().getGroup_1()); 
            // InternalCSVParserGenerator.g:2474:2: ( rule__LogExp__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=29 && LA21_0<=30)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:2474:3: rule__LogExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__LogExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getLogExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group__1__Impl"


    // $ANTLR start "rule__LogExp__Group_1__0"
    // InternalCSVParserGenerator.g:2483:1: rule__LogExp__Group_1__0 : rule__LogExp__Group_1__0__Impl rule__LogExp__Group_1__1 ;
    public final void rule__LogExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2487:1: ( rule__LogExp__Group_1__0__Impl rule__LogExp__Group_1__1 )
            // InternalCSVParserGenerator.g:2488:2: rule__LogExp__Group_1__0__Impl rule__LogExp__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__LogExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogExp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1__0"


    // $ANTLR start "rule__LogExp__Group_1__0__Impl"
    // InternalCSVParserGenerator.g:2495:1: rule__LogExp__Group_1__0__Impl : ( ( rule__LogExp__Alternatives_1_0 ) ) ;
    public final void rule__LogExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2499:1: ( ( ( rule__LogExp__Alternatives_1_0 ) ) )
            // InternalCSVParserGenerator.g:2500:1: ( ( rule__LogExp__Alternatives_1_0 ) )
            {
            // InternalCSVParserGenerator.g:2500:1: ( ( rule__LogExp__Alternatives_1_0 ) )
            // InternalCSVParserGenerator.g:2501:2: ( rule__LogExp__Alternatives_1_0 )
            {
             before(grammarAccess.getLogExpAccess().getAlternatives_1_0()); 
            // InternalCSVParserGenerator.g:2502:2: ( rule__LogExp__Alternatives_1_0 )
            // InternalCSVParserGenerator.g:2502:3: rule__LogExp__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LogExp__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLogExpAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1__0__Impl"


    // $ANTLR start "rule__LogExp__Group_1__1"
    // InternalCSVParserGenerator.g:2510:1: rule__LogExp__Group_1__1 : rule__LogExp__Group_1__1__Impl ;
    public final void rule__LogExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2514:1: ( rule__LogExp__Group_1__1__Impl )
            // InternalCSVParserGenerator.g:2515:2: rule__LogExp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogExp__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1__1"


    // $ANTLR start "rule__LogExp__Group_1__1__Impl"
    // InternalCSVParserGenerator.g:2521:1: rule__LogExp__Group_1__1__Impl : ( ( rule__LogExp__RightAssignment_1_1 ) ) ;
    public final void rule__LogExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2525:1: ( ( ( rule__LogExp__RightAssignment_1_1 ) ) )
            // InternalCSVParserGenerator.g:2526:1: ( ( rule__LogExp__RightAssignment_1_1 ) )
            {
            // InternalCSVParserGenerator.g:2526:1: ( ( rule__LogExp__RightAssignment_1_1 ) )
            // InternalCSVParserGenerator.g:2527:2: ( rule__LogExp__RightAssignment_1_1 )
            {
             before(grammarAccess.getLogExpAccess().getRightAssignment_1_1()); 
            // InternalCSVParserGenerator.g:2528:2: ( rule__LogExp__RightAssignment_1_1 )
            // InternalCSVParserGenerator.g:2528:3: rule__LogExp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LogExp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogExpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1__1__Impl"


    // $ANTLR start "rule__LogExp__Group_1_0_0__0"
    // InternalCSVParserGenerator.g:2537:1: rule__LogExp__Group_1_0_0__0 : rule__LogExp__Group_1_0_0__0__Impl rule__LogExp__Group_1_0_0__1 ;
    public final void rule__LogExp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2541:1: ( rule__LogExp__Group_1_0_0__0__Impl rule__LogExp__Group_1_0_0__1 )
            // InternalCSVParserGenerator.g:2542:2: rule__LogExp__Group_1_0_0__0__Impl rule__LogExp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__LogExp__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogExp__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1_0_0__0"


    // $ANTLR start "rule__LogExp__Group_1_0_0__0__Impl"
    // InternalCSVParserGenerator.g:2549:1: rule__LogExp__Group_1_0_0__0__Impl : ( '||' ) ;
    public final void rule__LogExp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2553:1: ( ( '||' ) )
            // InternalCSVParserGenerator.g:2554:1: ( '||' )
            {
            // InternalCSVParserGenerator.g:2554:1: ( '||' )
            // InternalCSVParserGenerator.g:2555:2: '||'
            {
             before(grammarAccess.getLogExpAccess().getVerticalLineVerticalLineKeyword_1_0_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLogExpAccess().getVerticalLineVerticalLineKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__LogExp__Group_1_0_0__1"
    // InternalCSVParserGenerator.g:2564:1: rule__LogExp__Group_1_0_0__1 : rule__LogExp__Group_1_0_0__1__Impl ;
    public final void rule__LogExp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2568:1: ( rule__LogExp__Group_1_0_0__1__Impl )
            // InternalCSVParserGenerator.g:2569:2: rule__LogExp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogExp__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1_0_0__1"


    // $ANTLR start "rule__LogExp__Group_1_0_0__1__Impl"
    // InternalCSVParserGenerator.g:2575:1: rule__LogExp__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__LogExp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2579:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2580:1: ( () )
            {
            // InternalCSVParserGenerator.g:2580:1: ( () )
            // InternalCSVParserGenerator.g:2581:2: ()
            {
             before(grammarAccess.getLogExpAccess().getOrLeftAction_1_0_0_1()); 
            // InternalCSVParserGenerator.g:2582:2: ()
            // InternalCSVParserGenerator.g:2582:3: 
            {
            }

             after(grammarAccess.getLogExpAccess().getOrLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__LogExp__Group_1_0_1__0"
    // InternalCSVParserGenerator.g:2591:1: rule__LogExp__Group_1_0_1__0 : rule__LogExp__Group_1_0_1__0__Impl rule__LogExp__Group_1_0_1__1 ;
    public final void rule__LogExp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2595:1: ( rule__LogExp__Group_1_0_1__0__Impl rule__LogExp__Group_1_0_1__1 )
            // InternalCSVParserGenerator.g:2596:2: rule__LogExp__Group_1_0_1__0__Impl rule__LogExp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__LogExp__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LogExp__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1_0_1__0"


    // $ANTLR start "rule__LogExp__Group_1_0_1__0__Impl"
    // InternalCSVParserGenerator.g:2603:1: rule__LogExp__Group_1_0_1__0__Impl : ( '&&' ) ;
    public final void rule__LogExp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2607:1: ( ( '&&' ) )
            // InternalCSVParserGenerator.g:2608:1: ( '&&' )
            {
            // InternalCSVParserGenerator.g:2608:1: ( '&&' )
            // InternalCSVParserGenerator.g:2609:2: '&&'
            {
             before(grammarAccess.getLogExpAccess().getAmpersandAmpersandKeyword_1_0_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLogExpAccess().getAmpersandAmpersandKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__LogExp__Group_1_0_1__1"
    // InternalCSVParserGenerator.g:2618:1: rule__LogExp__Group_1_0_1__1 : rule__LogExp__Group_1_0_1__1__Impl ;
    public final void rule__LogExp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2622:1: ( rule__LogExp__Group_1_0_1__1__Impl )
            // InternalCSVParserGenerator.g:2623:2: rule__LogExp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LogExp__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1_0_1__1"


    // $ANTLR start "rule__LogExp__Group_1_0_1__1__Impl"
    // InternalCSVParserGenerator.g:2629:1: rule__LogExp__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__LogExp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2633:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2634:1: ( () )
            {
            // InternalCSVParserGenerator.g:2634:1: ( () )
            // InternalCSVParserGenerator.g:2635:2: ()
            {
             before(grammarAccess.getLogExpAccess().getAndLeftAction_1_0_1_1()); 
            // InternalCSVParserGenerator.g:2636:2: ()
            // InternalCSVParserGenerator.g:2636:3: 
            {
            }

             after(grammarAccess.getLogExpAccess().getAndLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalCSVParserGenerator.g:2645:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2649:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalCSVParserGenerator.g:2650:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalCSVParserGenerator.g:2657:1: rule__Comparison__Group__0__Impl : ( ruleSum ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2661:1: ( ( ruleSum ) )
            // InternalCSVParserGenerator.g:2662:1: ( ruleSum )
            {
            // InternalCSVParserGenerator.g:2662:1: ( ruleSum )
            // InternalCSVParserGenerator.g:2663:2: ruleSum
            {
             before(grammarAccess.getComparisonAccess().getSumParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getSumParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalCSVParserGenerator.g:2672:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2676:1: ( rule__Comparison__Group__1__Impl )
            // InternalCSVParserGenerator.g:2677:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalCSVParserGenerator.g:2683:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2687:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalCSVParserGenerator.g:2688:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalCSVParserGenerator.g:2688:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalCSVParserGenerator.g:2689:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalCSVParserGenerator.g:2690:2: ( rule__Comparison__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=31 && LA22_0<=36)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:2690:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalCSVParserGenerator.g:2699:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2703:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalCSVParserGenerator.g:2704:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalCSVParserGenerator.g:2711:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2715:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalCSVParserGenerator.g:2716:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalCSVParserGenerator.g:2716:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalCSVParserGenerator.g:2717:2: ( rule__Comparison__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            // InternalCSVParserGenerator.g:2718:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalCSVParserGenerator.g:2718:3: rule__Comparison__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalCSVParserGenerator.g:2726:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2730:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalCSVParserGenerator.g:2731:2: rule__Comparison__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalCSVParserGenerator.g:2737:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2741:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalCSVParserGenerator.g:2742:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalCSVParserGenerator.g:2742:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalCSVParserGenerator.g:2743:2: ( rule__Comparison__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            // InternalCSVParserGenerator.g:2744:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalCSVParserGenerator.g:2744:3: rule__Comparison__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0"
    // InternalCSVParserGenerator.g:2753:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2757:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalCSVParserGenerator.g:2758:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0_0__0__Impl"
    // InternalCSVParserGenerator.g:2765:1: rule__Comparison__Group_1_0_0__0__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2769:1: ( ( '<' ) )
            // InternalCSVParserGenerator.g:2770:1: ( '<' )
            {
            // InternalCSVParserGenerator.g:2770:1: ( '<' )
            // InternalCSVParserGenerator.g:2771:2: '<'
            {
             before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1"
    // InternalCSVParserGenerator.g:2780:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2784:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalCSVParserGenerator.g:2785:2: rule__Comparison__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0_0__1__Impl"
    // InternalCSVParserGenerator.g:2791:1: rule__Comparison__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2795:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2796:1: ( () )
            {
            // InternalCSVParserGenerator.g:2796:1: ( () )
            // InternalCSVParserGenerator.g:2797:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLtLeftAction_1_0_0_1()); 
            // InternalCSVParserGenerator.g:2798:2: ()
            // InternalCSVParserGenerator.g:2798:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getLtLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0"
    // InternalCSVParserGenerator.g:2807:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2811:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalCSVParserGenerator.g:2812:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0"


    // $ANTLR start "rule__Comparison__Group_1_0_1__0__Impl"
    // InternalCSVParserGenerator.g:2819:1: rule__Comparison__Group_1_0_1__0__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2823:1: ( ( '>' ) )
            // InternalCSVParserGenerator.g:2824:1: ( '>' )
            {
            // InternalCSVParserGenerator.g:2824:1: ( '>' )
            // InternalCSVParserGenerator.g:2825:2: '>'
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1"
    // InternalCSVParserGenerator.g:2834:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2838:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalCSVParserGenerator.g:2839:2: rule__Comparison__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__1"


    // $ANTLR start "rule__Comparison__Group_1_0_1__1__Impl"
    // InternalCSVParserGenerator.g:2845:1: rule__Comparison__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2849:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2850:1: ( () )
            {
            // InternalCSVParserGenerator.g:2850:1: ( () )
            // InternalCSVParserGenerator.g:2851:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGtLeftAction_1_0_1_1()); 
            // InternalCSVParserGenerator.g:2852:2: ()
            // InternalCSVParserGenerator.g:2852:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getGtLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0"
    // InternalCSVParserGenerator.g:2861:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2865:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalCSVParserGenerator.g:2866:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__0"


    // $ANTLR start "rule__Comparison__Group_1_0_2__0__Impl"
    // InternalCSVParserGenerator.g:2873:1: rule__Comparison__Group_1_0_2__0__Impl : ( '==' ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2877:1: ( ( '==' ) )
            // InternalCSVParserGenerator.g:2878:1: ( '==' )
            {
            // InternalCSVParserGenerator.g:2878:1: ( '==' )
            // InternalCSVParserGenerator.g:2879:2: '=='
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1"
    // InternalCSVParserGenerator.g:2888:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2892:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalCSVParserGenerator.g:2893:2: rule__Comparison__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__1"


    // $ANTLR start "rule__Comparison__Group_1_0_2__1__Impl"
    // InternalCSVParserGenerator.g:2899:1: rule__Comparison__Group_1_0_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2903:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2904:1: ( () )
            {
            // InternalCSVParserGenerator.g:2904:1: ( () )
            // InternalCSVParserGenerator.g:2905:2: ()
            {
             before(grammarAccess.getComparisonAccess().getEquLeftAction_1_0_2_1()); 
            // InternalCSVParserGenerator.g:2906:2: ()
            // InternalCSVParserGenerator.g:2906:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getEquLeftAction_1_0_2_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0"
    // InternalCSVParserGenerator.g:2915:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2919:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // InternalCSVParserGenerator.g:2920:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__0"


    // $ANTLR start "rule__Comparison__Group_1_0_3__0__Impl"
    // InternalCSVParserGenerator.g:2927:1: rule__Comparison__Group_1_0_3__0__Impl : ( '!=' ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2931:1: ( ( '!=' ) )
            // InternalCSVParserGenerator.g:2932:1: ( '!=' )
            {
            // InternalCSVParserGenerator.g:2932:1: ( '!=' )
            // InternalCSVParserGenerator.g:2933:2: '!='
            {
             before(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1"
    // InternalCSVParserGenerator.g:2942:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2946:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // InternalCSVParserGenerator.g:2947:2: rule__Comparison__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__1"


    // $ANTLR start "rule__Comparison__Group_1_0_3__1__Impl"
    // InternalCSVParserGenerator.g:2953:1: rule__Comparison__Group_1_0_3__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2957:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2958:1: ( () )
            {
            // InternalCSVParserGenerator.g:2958:1: ( () )
            // InternalCSVParserGenerator.g:2959:2: ()
            {
             before(grammarAccess.getComparisonAccess().getNeqLeftAction_1_0_3_1()); 
            // InternalCSVParserGenerator.g:2960:2: ()
            // InternalCSVParserGenerator.g:2960:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getNeqLeftAction_1_0_3_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_4__0"
    // InternalCSVParserGenerator.g:2969:1: rule__Comparison__Group_1_0_4__0 : rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 ;
    public final void rule__Comparison__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2973:1: ( rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 )
            // InternalCSVParserGenerator.g:2974:2: rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_4__0"


    // $ANTLR start "rule__Comparison__Group_1_0_4__0__Impl"
    // InternalCSVParserGenerator.g:2981:1: rule__Comparison__Group_1_0_4__0__Impl : ( '=<' ) ;
    public final void rule__Comparison__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2985:1: ( ( '=<' ) )
            // InternalCSVParserGenerator.g:2986:1: ( '=<' )
            {
            // InternalCSVParserGenerator.g:2986:1: ( '=<' )
            // InternalCSVParserGenerator.g:2987:2: '=<'
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignLessThanSignKeyword_1_0_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getEqualsSignLessThanSignKeyword_1_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_4__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_4__1"
    // InternalCSVParserGenerator.g:2996:1: rule__Comparison__Group_1_0_4__1 : rule__Comparison__Group_1_0_4__1__Impl ;
    public final void rule__Comparison__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3000:1: ( rule__Comparison__Group_1_0_4__1__Impl )
            // InternalCSVParserGenerator.g:3001:2: rule__Comparison__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_4__1"


    // $ANTLR start "rule__Comparison__Group_1_0_4__1__Impl"
    // InternalCSVParserGenerator.g:3007:1: rule__Comparison__Group_1_0_4__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3011:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3012:1: ( () )
            {
            // InternalCSVParserGenerator.g:3012:1: ( () )
            // InternalCSVParserGenerator.g:3013:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLeqLeftAction_1_0_4_1()); 
            // InternalCSVParserGenerator.g:3014:2: ()
            // InternalCSVParserGenerator.g:3014:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getLeqLeftAction_1_0_4_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_4__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_5__0"
    // InternalCSVParserGenerator.g:3023:1: rule__Comparison__Group_1_0_5__0 : rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1 ;
    public final void rule__Comparison__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3027:1: ( rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1 )
            // InternalCSVParserGenerator.g:3028:2: rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1
            {
            pushFollow(FOLLOW_1);
            rule__Comparison__Group_1_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_5__0"


    // $ANTLR start "rule__Comparison__Group_1_0_5__0__Impl"
    // InternalCSVParserGenerator.g:3035:1: rule__Comparison__Group_1_0_5__0__Impl : ( '=>' ) ;
    public final void rule__Comparison__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3039:1: ( ( '=>' ) )
            // InternalCSVParserGenerator.g:3040:1: ( '=>' )
            {
            // InternalCSVParserGenerator.g:3040:1: ( '=>' )
            // InternalCSVParserGenerator.g:3041:2: '=>'
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignGreaterThanSignKeyword_1_0_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getEqualsSignGreaterThanSignKeyword_1_0_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_5__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0_5__1"
    // InternalCSVParserGenerator.g:3050:1: rule__Comparison__Group_1_0_5__1 : rule__Comparison__Group_1_0_5__1__Impl ;
    public final void rule__Comparison__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3054:1: ( rule__Comparison__Group_1_0_5__1__Impl )
            // InternalCSVParserGenerator.g:3055:2: rule__Comparison__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_5__1"


    // $ANTLR start "rule__Comparison__Group_1_0_5__1__Impl"
    // InternalCSVParserGenerator.g:3061:1: rule__Comparison__Group_1_0_5__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3065:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3066:1: ( () )
            {
            // InternalCSVParserGenerator.g:3066:1: ( () )
            // InternalCSVParserGenerator.g:3067:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGeqLeftAction_1_0_5_1()); 
            // InternalCSVParserGenerator.g:3068:2: ()
            // InternalCSVParserGenerator.g:3068:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getGeqLeftAction_1_0_5_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0_5__1__Impl"


    // $ANTLR start "rule__Parens__Group__0"
    // InternalCSVParserGenerator.g:3077:1: rule__Parens__Group__0 : rule__Parens__Group__0__Impl rule__Parens__Group__1 ;
    public final void rule__Parens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3081:1: ( rule__Parens__Group__0__Impl rule__Parens__Group__1 )
            // InternalCSVParserGenerator.g:3082:2: rule__Parens__Group__0__Impl rule__Parens__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Parens__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parens__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parens__Group__0"


    // $ANTLR start "rule__Parens__Group__0__Impl"
    // InternalCSVParserGenerator.g:3089:1: rule__Parens__Group__0__Impl : ( '(' ) ;
    public final void rule__Parens__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3093:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:3094:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:3094:1: ( '(' )
            // InternalCSVParserGenerator.g:3095:2: '('
            {
             before(grammarAccess.getParensAccess().getLeftParenthesisKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParensAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parens__Group__0__Impl"


    // $ANTLR start "rule__Parens__Group__1"
    // InternalCSVParserGenerator.g:3104:1: rule__Parens__Group__1 : rule__Parens__Group__1__Impl rule__Parens__Group__2 ;
    public final void rule__Parens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3108:1: ( rule__Parens__Group__1__Impl rule__Parens__Group__2 )
            // InternalCSVParserGenerator.g:3109:2: rule__Parens__Group__1__Impl rule__Parens__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Parens__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parens__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parens__Group__1"


    // $ANTLR start "rule__Parens__Group__1__Impl"
    // InternalCSVParserGenerator.g:3116:1: rule__Parens__Group__1__Impl : ( ( rule__Parens__ExpAssignment_1 ) ) ;
    public final void rule__Parens__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3120:1: ( ( ( rule__Parens__ExpAssignment_1 ) ) )
            // InternalCSVParserGenerator.g:3121:1: ( ( rule__Parens__ExpAssignment_1 ) )
            {
            // InternalCSVParserGenerator.g:3121:1: ( ( rule__Parens__ExpAssignment_1 ) )
            // InternalCSVParserGenerator.g:3122:2: ( rule__Parens__ExpAssignment_1 )
            {
             before(grammarAccess.getParensAccess().getExpAssignment_1()); 
            // InternalCSVParserGenerator.g:3123:2: ( rule__Parens__ExpAssignment_1 )
            // InternalCSVParserGenerator.g:3123:3: rule__Parens__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parens__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParensAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parens__Group__1__Impl"


    // $ANTLR start "rule__Parens__Group__2"
    // InternalCSVParserGenerator.g:3131:1: rule__Parens__Group__2 : rule__Parens__Group__2__Impl ;
    public final void rule__Parens__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3135:1: ( rule__Parens__Group__2__Impl )
            // InternalCSVParserGenerator.g:3136:2: rule__Parens__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parens__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parens__Group__2"


    // $ANTLR start "rule__Parens__Group__2__Impl"
    // InternalCSVParserGenerator.g:3142:1: rule__Parens__Group__2__Impl : ( ')' ) ;
    public final void rule__Parens__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3146:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:3147:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:3147:1: ( ')' )
            // InternalCSVParserGenerator.g:3148:2: ')'
            {
             before(grammarAccess.getParensAccess().getRightParenthesisKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParensAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parens__Group__2__Impl"


    // $ANTLR start "rule__External__Group__0"
    // InternalCSVParserGenerator.g:3158:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3162:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // InternalCSVParserGenerator.g:3163:2: rule__External__Group__0__Impl rule__External__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__External__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__0"


    // $ANTLR start "rule__External__Group__0__Impl"
    // InternalCSVParserGenerator.g:3170:1: rule__External__Group__0__Impl : ( 'extFunc' ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3174:1: ( ( 'extFunc' ) )
            // InternalCSVParserGenerator.g:3175:1: ( 'extFunc' )
            {
            // InternalCSVParserGenerator.g:3175:1: ( 'extFunc' )
            // InternalCSVParserGenerator.g:3176:2: 'extFunc'
            {
             before(grammarAccess.getExternalAccess().getExtFuncKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getExtFuncKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__0__Impl"


    // $ANTLR start "rule__External__Group__1"
    // InternalCSVParserGenerator.g:3185:1: rule__External__Group__1 : rule__External__Group__1__Impl rule__External__Group__2 ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3189:1: ( rule__External__Group__1__Impl rule__External__Group__2 )
            // InternalCSVParserGenerator.g:3190:2: rule__External__Group__1__Impl rule__External__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__External__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__1"


    // $ANTLR start "rule__External__Group__1__Impl"
    // InternalCSVParserGenerator.g:3197:1: rule__External__Group__1__Impl : ( ( rule__External__NameAssignment_1 ) ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3201:1: ( ( ( rule__External__NameAssignment_1 ) ) )
            // InternalCSVParserGenerator.g:3202:1: ( ( rule__External__NameAssignment_1 ) )
            {
            // InternalCSVParserGenerator.g:3202:1: ( ( rule__External__NameAssignment_1 ) )
            // InternalCSVParserGenerator.g:3203:2: ( rule__External__NameAssignment_1 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_1()); 
            // InternalCSVParserGenerator.g:3204:2: ( rule__External__NameAssignment_1 )
            // InternalCSVParserGenerator.g:3204:3: rule__External__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__External__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__1__Impl"


    // $ANTLR start "rule__External__Group__2"
    // InternalCSVParserGenerator.g:3212:1: rule__External__Group__2 : rule__External__Group__2__Impl rule__External__Group__3 ;
    public final void rule__External__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3216:1: ( rule__External__Group__2__Impl rule__External__Group__3 )
            // InternalCSVParserGenerator.g:3217:2: rule__External__Group__2__Impl rule__External__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__External__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__2"


    // $ANTLR start "rule__External__Group__2__Impl"
    // InternalCSVParserGenerator.g:3224:1: rule__External__Group__2__Impl : ( '(' ) ;
    public final void rule__External__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3228:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:3229:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:3229:1: ( '(' )
            // InternalCSVParserGenerator.g:3230:2: '('
            {
             before(grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__2__Impl"


    // $ANTLR start "rule__External__Group__3"
    // InternalCSVParserGenerator.g:3239:1: rule__External__Group__3 : rule__External__Group__3__Impl rule__External__Group__4 ;
    public final void rule__External__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3243:1: ( rule__External__Group__3__Impl rule__External__Group__4 )
            // InternalCSVParserGenerator.g:3244:2: rule__External__Group__3__Impl rule__External__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__External__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__External__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__3"


    // $ANTLR start "rule__External__Group__3__Impl"
    // InternalCSVParserGenerator.g:3251:1: rule__External__Group__3__Impl : ( ( rule__External__InpAssignment_3 ) ) ;
    public final void rule__External__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3255:1: ( ( ( rule__External__InpAssignment_3 ) ) )
            // InternalCSVParserGenerator.g:3256:1: ( ( rule__External__InpAssignment_3 ) )
            {
            // InternalCSVParserGenerator.g:3256:1: ( ( rule__External__InpAssignment_3 ) )
            // InternalCSVParserGenerator.g:3257:2: ( rule__External__InpAssignment_3 )
            {
             before(grammarAccess.getExternalAccess().getInpAssignment_3()); 
            // InternalCSVParserGenerator.g:3258:2: ( rule__External__InpAssignment_3 )
            // InternalCSVParserGenerator.g:3258:3: rule__External__InpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__External__InpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExternalAccess().getInpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__3__Impl"


    // $ANTLR start "rule__External__Group__4"
    // InternalCSVParserGenerator.g:3266:1: rule__External__Group__4 : rule__External__Group__4__Impl ;
    public final void rule__External__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3270:1: ( rule__External__Group__4__Impl )
            // InternalCSVParserGenerator.g:3271:2: rule__External__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__External__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__4"


    // $ANTLR start "rule__External__Group__4__Impl"
    // InternalCSVParserGenerator.g:3277:1: rule__External__Group__4__Impl : ( ')' ) ;
    public final void rule__External__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3281:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:3282:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:3282:1: ( ')' )
            // InternalCSVParserGenerator.g:3283:2: ')'
            {
             before(grammarAccess.getExternalAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__Group__4__Impl"


    // $ANTLR start "rule__StatFunc__Group_0__0"
    // InternalCSVParserGenerator.g:3293:1: rule__StatFunc__Group_0__0 : rule__StatFunc__Group_0__0__Impl rule__StatFunc__Group_0__1 ;
    public final void rule__StatFunc__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3297:1: ( rule__StatFunc__Group_0__0__Impl rule__StatFunc__Group_0__1 )
            // InternalCSVParserGenerator.g:3298:2: rule__StatFunc__Group_0__0__Impl rule__StatFunc__Group_0__1
            {
            pushFollow(FOLLOW_41);
            rule__StatFunc__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_0__0"


    // $ANTLR start "rule__StatFunc__Group_0__0__Impl"
    // InternalCSVParserGenerator.g:3305:1: rule__StatFunc__Group_0__0__Impl : ( () ) ;
    public final void rule__StatFunc__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3309:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3310:1: ( () )
            {
            // InternalCSVParserGenerator.g:3310:1: ( () )
            // InternalCSVParserGenerator.g:3311:2: ()
            {
             before(grammarAccess.getStatFuncAccess().getMaxAction_0_0()); 
            // InternalCSVParserGenerator.g:3312:2: ()
            // InternalCSVParserGenerator.g:3312:3: 
            {
            }

             after(grammarAccess.getStatFuncAccess().getMaxAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_0__0__Impl"


    // $ANTLR start "rule__StatFunc__Group_0__1"
    // InternalCSVParserGenerator.g:3320:1: rule__StatFunc__Group_0__1 : rule__StatFunc__Group_0__1__Impl rule__StatFunc__Group_0__2 ;
    public final void rule__StatFunc__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3324:1: ( rule__StatFunc__Group_0__1__Impl rule__StatFunc__Group_0__2 )
            // InternalCSVParserGenerator.g:3325:2: rule__StatFunc__Group_0__1__Impl rule__StatFunc__Group_0__2
            {
            pushFollow(FOLLOW_40);
            rule__StatFunc__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_0__1"


    // $ANTLR start "rule__StatFunc__Group_0__1__Impl"
    // InternalCSVParserGenerator.g:3332:1: rule__StatFunc__Group_0__1__Impl : ( 'max' ) ;
    public final void rule__StatFunc__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3336:1: ( ( 'max' ) )
            // InternalCSVParserGenerator.g:3337:1: ( 'max' )
            {
            // InternalCSVParserGenerator.g:3337:1: ( 'max' )
            // InternalCSVParserGenerator.g:3338:2: 'max'
            {
             before(grammarAccess.getStatFuncAccess().getMaxKeyword_0_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getMaxKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_0__1__Impl"


    // $ANTLR start "rule__StatFunc__Group_0__2"
    // InternalCSVParserGenerator.g:3347:1: rule__StatFunc__Group_0__2 : rule__StatFunc__Group_0__2__Impl rule__StatFunc__Group_0__3 ;
    public final void rule__StatFunc__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3351:1: ( rule__StatFunc__Group_0__2__Impl rule__StatFunc__Group_0__3 )
            // InternalCSVParserGenerator.g:3352:2: rule__StatFunc__Group_0__2__Impl rule__StatFunc__Group_0__3
            {
            pushFollow(FOLLOW_5);
            rule__StatFunc__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_0__2"


    // $ANTLR start "rule__StatFunc__Group_0__2__Impl"
    // InternalCSVParserGenerator.g:3359:1: rule__StatFunc__Group_0__2__Impl : ( '(' ) ;
    public final void rule__StatFunc__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3363:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:3364:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:3364:1: ( '(' )
            // InternalCSVParserGenerator.g:3365:2: '('
            {
             before(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_0__2__Impl"


    // $ANTLR start "rule__StatFunc__Group_0__3"
    // InternalCSVParserGenerator.g:3374:1: rule__StatFunc__Group_0__3 : rule__StatFunc__Group_0__3__Impl rule__StatFunc__Group_0__4 ;
    public final void rule__StatFunc__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3378:1: ( rule__StatFunc__Group_0__3__Impl rule__StatFunc__Group_0__4 )
            // InternalCSVParserGenerator.g:3379:2: rule__StatFunc__Group_0__3__Impl rule__StatFunc__Group_0__4
            {
            pushFollow(FOLLOW_39);
            rule__StatFunc__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_0__3"


    // $ANTLR start "rule__StatFunc__Group_0__3__Impl"
    // InternalCSVParserGenerator.g:3386:1: rule__StatFunc__Group_0__3__Impl : ( ( rule__StatFunc__InputAssignment_0_3 ) ) ;
    public final void rule__StatFunc__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3390:1: ( ( ( rule__StatFunc__InputAssignment_0_3 ) ) )
            // InternalCSVParserGenerator.g:3391:1: ( ( rule__StatFunc__InputAssignment_0_3 ) )
            {
            // InternalCSVParserGenerator.g:3391:1: ( ( rule__StatFunc__InputAssignment_0_3 ) )
            // InternalCSVParserGenerator.g:3392:2: ( rule__StatFunc__InputAssignment_0_3 )
            {
             before(grammarAccess.getStatFuncAccess().getInputAssignment_0_3()); 
            // InternalCSVParserGenerator.g:3393:2: ( rule__StatFunc__InputAssignment_0_3 )
            // InternalCSVParserGenerator.g:3393:3: rule__StatFunc__InputAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__InputAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getStatFuncAccess().getInputAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_0__3__Impl"


    // $ANTLR start "rule__StatFunc__Group_0__4"
    // InternalCSVParserGenerator.g:3401:1: rule__StatFunc__Group_0__4 : rule__StatFunc__Group_0__4__Impl ;
    public final void rule__StatFunc__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3405:1: ( rule__StatFunc__Group_0__4__Impl )
            // InternalCSVParserGenerator.g:3406:2: rule__StatFunc__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_0__4"


    // $ANTLR start "rule__StatFunc__Group_0__4__Impl"
    // InternalCSVParserGenerator.g:3412:1: rule__StatFunc__Group_0__4__Impl : ( ')' ) ;
    public final void rule__StatFunc__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3416:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:3417:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:3417:1: ( ')' )
            // InternalCSVParserGenerator.g:3418:2: ')'
            {
             before(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_0_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_0__4__Impl"


    // $ANTLR start "rule__StatFunc__Group_1__0"
    // InternalCSVParserGenerator.g:3428:1: rule__StatFunc__Group_1__0 : rule__StatFunc__Group_1__0__Impl rule__StatFunc__Group_1__1 ;
    public final void rule__StatFunc__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3432:1: ( rule__StatFunc__Group_1__0__Impl rule__StatFunc__Group_1__1 )
            // InternalCSVParserGenerator.g:3433:2: rule__StatFunc__Group_1__0__Impl rule__StatFunc__Group_1__1
            {
            pushFollow(FOLLOW_42);
            rule__StatFunc__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_1__0"


    // $ANTLR start "rule__StatFunc__Group_1__0__Impl"
    // InternalCSVParserGenerator.g:3440:1: rule__StatFunc__Group_1__0__Impl : ( () ) ;
    public final void rule__StatFunc__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3444:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3445:1: ( () )
            {
            // InternalCSVParserGenerator.g:3445:1: ( () )
            // InternalCSVParserGenerator.g:3446:2: ()
            {
             before(grammarAccess.getStatFuncAccess().getMinAction_1_0()); 
            // InternalCSVParserGenerator.g:3447:2: ()
            // InternalCSVParserGenerator.g:3447:3: 
            {
            }

             after(grammarAccess.getStatFuncAccess().getMinAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_1__0__Impl"


    // $ANTLR start "rule__StatFunc__Group_1__1"
    // InternalCSVParserGenerator.g:3455:1: rule__StatFunc__Group_1__1 : rule__StatFunc__Group_1__1__Impl rule__StatFunc__Group_1__2 ;
    public final void rule__StatFunc__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3459:1: ( rule__StatFunc__Group_1__1__Impl rule__StatFunc__Group_1__2 )
            // InternalCSVParserGenerator.g:3460:2: rule__StatFunc__Group_1__1__Impl rule__StatFunc__Group_1__2
            {
            pushFollow(FOLLOW_40);
            rule__StatFunc__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_1__1"


    // $ANTLR start "rule__StatFunc__Group_1__1__Impl"
    // InternalCSVParserGenerator.g:3467:1: rule__StatFunc__Group_1__1__Impl : ( 'min' ) ;
    public final void rule__StatFunc__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3471:1: ( ( 'min' ) )
            // InternalCSVParserGenerator.g:3472:1: ( 'min' )
            {
            // InternalCSVParserGenerator.g:3472:1: ( 'min' )
            // InternalCSVParserGenerator.g:3473:2: 'min'
            {
             before(grammarAccess.getStatFuncAccess().getMinKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getMinKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_1__1__Impl"


    // $ANTLR start "rule__StatFunc__Group_1__2"
    // InternalCSVParserGenerator.g:3482:1: rule__StatFunc__Group_1__2 : rule__StatFunc__Group_1__2__Impl rule__StatFunc__Group_1__3 ;
    public final void rule__StatFunc__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3486:1: ( rule__StatFunc__Group_1__2__Impl rule__StatFunc__Group_1__3 )
            // InternalCSVParserGenerator.g:3487:2: rule__StatFunc__Group_1__2__Impl rule__StatFunc__Group_1__3
            {
            pushFollow(FOLLOW_5);
            rule__StatFunc__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_1__2"


    // $ANTLR start "rule__StatFunc__Group_1__2__Impl"
    // InternalCSVParserGenerator.g:3494:1: rule__StatFunc__Group_1__2__Impl : ( '(' ) ;
    public final void rule__StatFunc__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3498:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:3499:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:3499:1: ( '(' )
            // InternalCSVParserGenerator.g:3500:2: '('
            {
             before(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_1__2__Impl"


    // $ANTLR start "rule__StatFunc__Group_1__3"
    // InternalCSVParserGenerator.g:3509:1: rule__StatFunc__Group_1__3 : rule__StatFunc__Group_1__3__Impl rule__StatFunc__Group_1__4 ;
    public final void rule__StatFunc__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3513:1: ( rule__StatFunc__Group_1__3__Impl rule__StatFunc__Group_1__4 )
            // InternalCSVParserGenerator.g:3514:2: rule__StatFunc__Group_1__3__Impl rule__StatFunc__Group_1__4
            {
            pushFollow(FOLLOW_39);
            rule__StatFunc__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_1__3"


    // $ANTLR start "rule__StatFunc__Group_1__3__Impl"
    // InternalCSVParserGenerator.g:3521:1: rule__StatFunc__Group_1__3__Impl : ( ( rule__StatFunc__InputAssignment_1_3 ) ) ;
    public final void rule__StatFunc__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3525:1: ( ( ( rule__StatFunc__InputAssignment_1_3 ) ) )
            // InternalCSVParserGenerator.g:3526:1: ( ( rule__StatFunc__InputAssignment_1_3 ) )
            {
            // InternalCSVParserGenerator.g:3526:1: ( ( rule__StatFunc__InputAssignment_1_3 ) )
            // InternalCSVParserGenerator.g:3527:2: ( rule__StatFunc__InputAssignment_1_3 )
            {
             before(grammarAccess.getStatFuncAccess().getInputAssignment_1_3()); 
            // InternalCSVParserGenerator.g:3528:2: ( rule__StatFunc__InputAssignment_1_3 )
            // InternalCSVParserGenerator.g:3528:3: rule__StatFunc__InputAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__InputAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getStatFuncAccess().getInputAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_1__3__Impl"


    // $ANTLR start "rule__StatFunc__Group_1__4"
    // InternalCSVParserGenerator.g:3536:1: rule__StatFunc__Group_1__4 : rule__StatFunc__Group_1__4__Impl ;
    public final void rule__StatFunc__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3540:1: ( rule__StatFunc__Group_1__4__Impl )
            // InternalCSVParserGenerator.g:3541:2: rule__StatFunc__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_1__4"


    // $ANTLR start "rule__StatFunc__Group_1__4__Impl"
    // InternalCSVParserGenerator.g:3547:1: rule__StatFunc__Group_1__4__Impl : ( ')' ) ;
    public final void rule__StatFunc__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3551:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:3552:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:3552:1: ( ')' )
            // InternalCSVParserGenerator.g:3553:2: ')'
            {
             before(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_1_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_1__4__Impl"


    // $ANTLR start "rule__StatFunc__Group_2__0"
    // InternalCSVParserGenerator.g:3563:1: rule__StatFunc__Group_2__0 : rule__StatFunc__Group_2__0__Impl rule__StatFunc__Group_2__1 ;
    public final void rule__StatFunc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3567:1: ( rule__StatFunc__Group_2__0__Impl rule__StatFunc__Group_2__1 )
            // InternalCSVParserGenerator.g:3568:2: rule__StatFunc__Group_2__0__Impl rule__StatFunc__Group_2__1
            {
            pushFollow(FOLLOW_43);
            rule__StatFunc__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_2__0"


    // $ANTLR start "rule__StatFunc__Group_2__0__Impl"
    // InternalCSVParserGenerator.g:3575:1: rule__StatFunc__Group_2__0__Impl : ( () ) ;
    public final void rule__StatFunc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3579:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3580:1: ( () )
            {
            // InternalCSVParserGenerator.g:3580:1: ( () )
            // InternalCSVParserGenerator.g:3581:2: ()
            {
             before(grammarAccess.getStatFuncAccess().getStdAction_2_0()); 
            // InternalCSVParserGenerator.g:3582:2: ()
            // InternalCSVParserGenerator.g:3582:3: 
            {
            }

             after(grammarAccess.getStatFuncAccess().getStdAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_2__0__Impl"


    // $ANTLR start "rule__StatFunc__Group_2__1"
    // InternalCSVParserGenerator.g:3590:1: rule__StatFunc__Group_2__1 : rule__StatFunc__Group_2__1__Impl rule__StatFunc__Group_2__2 ;
    public final void rule__StatFunc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3594:1: ( rule__StatFunc__Group_2__1__Impl rule__StatFunc__Group_2__2 )
            // InternalCSVParserGenerator.g:3595:2: rule__StatFunc__Group_2__1__Impl rule__StatFunc__Group_2__2
            {
            pushFollow(FOLLOW_40);
            rule__StatFunc__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_2__1"


    // $ANTLR start "rule__StatFunc__Group_2__1__Impl"
    // InternalCSVParserGenerator.g:3602:1: rule__StatFunc__Group_2__1__Impl : ( 'std' ) ;
    public final void rule__StatFunc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3606:1: ( ( 'std' ) )
            // InternalCSVParserGenerator.g:3607:1: ( 'std' )
            {
            // InternalCSVParserGenerator.g:3607:1: ( 'std' )
            // InternalCSVParserGenerator.g:3608:2: 'std'
            {
             before(grammarAccess.getStatFuncAccess().getStdKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getStdKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_2__1__Impl"


    // $ANTLR start "rule__StatFunc__Group_2__2"
    // InternalCSVParserGenerator.g:3617:1: rule__StatFunc__Group_2__2 : rule__StatFunc__Group_2__2__Impl rule__StatFunc__Group_2__3 ;
    public final void rule__StatFunc__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3621:1: ( rule__StatFunc__Group_2__2__Impl rule__StatFunc__Group_2__3 )
            // InternalCSVParserGenerator.g:3622:2: rule__StatFunc__Group_2__2__Impl rule__StatFunc__Group_2__3
            {
            pushFollow(FOLLOW_5);
            rule__StatFunc__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_2__2"


    // $ANTLR start "rule__StatFunc__Group_2__2__Impl"
    // InternalCSVParserGenerator.g:3629:1: rule__StatFunc__Group_2__2__Impl : ( '(' ) ;
    public final void rule__StatFunc__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3633:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:3634:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:3634:1: ( '(' )
            // InternalCSVParserGenerator.g:3635:2: '('
            {
             before(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_2__2__Impl"


    // $ANTLR start "rule__StatFunc__Group_2__3"
    // InternalCSVParserGenerator.g:3644:1: rule__StatFunc__Group_2__3 : rule__StatFunc__Group_2__3__Impl rule__StatFunc__Group_2__4 ;
    public final void rule__StatFunc__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3648:1: ( rule__StatFunc__Group_2__3__Impl rule__StatFunc__Group_2__4 )
            // InternalCSVParserGenerator.g:3649:2: rule__StatFunc__Group_2__3__Impl rule__StatFunc__Group_2__4
            {
            pushFollow(FOLLOW_39);
            rule__StatFunc__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_2__3"


    // $ANTLR start "rule__StatFunc__Group_2__3__Impl"
    // InternalCSVParserGenerator.g:3656:1: rule__StatFunc__Group_2__3__Impl : ( ( rule__StatFunc__InputAssignment_2_3 ) ) ;
    public final void rule__StatFunc__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3660:1: ( ( ( rule__StatFunc__InputAssignment_2_3 ) ) )
            // InternalCSVParserGenerator.g:3661:1: ( ( rule__StatFunc__InputAssignment_2_3 ) )
            {
            // InternalCSVParserGenerator.g:3661:1: ( ( rule__StatFunc__InputAssignment_2_3 ) )
            // InternalCSVParserGenerator.g:3662:2: ( rule__StatFunc__InputAssignment_2_3 )
            {
             before(grammarAccess.getStatFuncAccess().getInputAssignment_2_3()); 
            // InternalCSVParserGenerator.g:3663:2: ( rule__StatFunc__InputAssignment_2_3 )
            // InternalCSVParserGenerator.g:3663:3: rule__StatFunc__InputAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__InputAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getStatFuncAccess().getInputAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_2__3__Impl"


    // $ANTLR start "rule__StatFunc__Group_2__4"
    // InternalCSVParserGenerator.g:3671:1: rule__StatFunc__Group_2__4 : rule__StatFunc__Group_2__4__Impl ;
    public final void rule__StatFunc__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3675:1: ( rule__StatFunc__Group_2__4__Impl )
            // InternalCSVParserGenerator.g:3676:2: rule__StatFunc__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_2__4"


    // $ANTLR start "rule__StatFunc__Group_2__4__Impl"
    // InternalCSVParserGenerator.g:3682:1: rule__StatFunc__Group_2__4__Impl : ( ')' ) ;
    public final void rule__StatFunc__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3686:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:3687:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:3687:1: ( ')' )
            // InternalCSVParserGenerator.g:3688:2: ')'
            {
             before(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_2_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_2__4__Impl"


    // $ANTLR start "rule__StatFunc__Group_3__0"
    // InternalCSVParserGenerator.g:3698:1: rule__StatFunc__Group_3__0 : rule__StatFunc__Group_3__0__Impl rule__StatFunc__Group_3__1 ;
    public final void rule__StatFunc__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3702:1: ( rule__StatFunc__Group_3__0__Impl rule__StatFunc__Group_3__1 )
            // InternalCSVParserGenerator.g:3703:2: rule__StatFunc__Group_3__0__Impl rule__StatFunc__Group_3__1
            {
            pushFollow(FOLLOW_44);
            rule__StatFunc__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_3__0"


    // $ANTLR start "rule__StatFunc__Group_3__0__Impl"
    // InternalCSVParserGenerator.g:3710:1: rule__StatFunc__Group_3__0__Impl : ( () ) ;
    public final void rule__StatFunc__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3714:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3715:1: ( () )
            {
            // InternalCSVParserGenerator.g:3715:1: ( () )
            // InternalCSVParserGenerator.g:3716:2: ()
            {
             before(grammarAccess.getStatFuncAccess().getSumFuncAction_3_0()); 
            // InternalCSVParserGenerator.g:3717:2: ()
            // InternalCSVParserGenerator.g:3717:3: 
            {
            }

             after(grammarAccess.getStatFuncAccess().getSumFuncAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_3__0__Impl"


    // $ANTLR start "rule__StatFunc__Group_3__1"
    // InternalCSVParserGenerator.g:3725:1: rule__StatFunc__Group_3__1 : rule__StatFunc__Group_3__1__Impl rule__StatFunc__Group_3__2 ;
    public final void rule__StatFunc__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3729:1: ( rule__StatFunc__Group_3__1__Impl rule__StatFunc__Group_3__2 )
            // InternalCSVParserGenerator.g:3730:2: rule__StatFunc__Group_3__1__Impl rule__StatFunc__Group_3__2
            {
            pushFollow(FOLLOW_40);
            rule__StatFunc__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_3__1"


    // $ANTLR start "rule__StatFunc__Group_3__1__Impl"
    // InternalCSVParserGenerator.g:3737:1: rule__StatFunc__Group_3__1__Impl : ( 'sum' ) ;
    public final void rule__StatFunc__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3741:1: ( ( 'sum' ) )
            // InternalCSVParserGenerator.g:3742:1: ( 'sum' )
            {
            // InternalCSVParserGenerator.g:3742:1: ( 'sum' )
            // InternalCSVParserGenerator.g:3743:2: 'sum'
            {
             before(grammarAccess.getStatFuncAccess().getSumKeyword_3_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getSumKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_3__1__Impl"


    // $ANTLR start "rule__StatFunc__Group_3__2"
    // InternalCSVParserGenerator.g:3752:1: rule__StatFunc__Group_3__2 : rule__StatFunc__Group_3__2__Impl rule__StatFunc__Group_3__3 ;
    public final void rule__StatFunc__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3756:1: ( rule__StatFunc__Group_3__2__Impl rule__StatFunc__Group_3__3 )
            // InternalCSVParserGenerator.g:3757:2: rule__StatFunc__Group_3__2__Impl rule__StatFunc__Group_3__3
            {
            pushFollow(FOLLOW_5);
            rule__StatFunc__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_3__2"


    // $ANTLR start "rule__StatFunc__Group_3__2__Impl"
    // InternalCSVParserGenerator.g:3764:1: rule__StatFunc__Group_3__2__Impl : ( '(' ) ;
    public final void rule__StatFunc__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3768:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:3769:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:3769:1: ( '(' )
            // InternalCSVParserGenerator.g:3770:2: '('
            {
             before(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_3__2__Impl"


    // $ANTLR start "rule__StatFunc__Group_3__3"
    // InternalCSVParserGenerator.g:3779:1: rule__StatFunc__Group_3__3 : rule__StatFunc__Group_3__3__Impl rule__StatFunc__Group_3__4 ;
    public final void rule__StatFunc__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3783:1: ( rule__StatFunc__Group_3__3__Impl rule__StatFunc__Group_3__4 )
            // InternalCSVParserGenerator.g:3784:2: rule__StatFunc__Group_3__3__Impl rule__StatFunc__Group_3__4
            {
            pushFollow(FOLLOW_39);
            rule__StatFunc__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_3__3"


    // $ANTLR start "rule__StatFunc__Group_3__3__Impl"
    // InternalCSVParserGenerator.g:3791:1: rule__StatFunc__Group_3__3__Impl : ( ( rule__StatFunc__InputAssignment_3_3 ) ) ;
    public final void rule__StatFunc__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3795:1: ( ( ( rule__StatFunc__InputAssignment_3_3 ) ) )
            // InternalCSVParserGenerator.g:3796:1: ( ( rule__StatFunc__InputAssignment_3_3 ) )
            {
            // InternalCSVParserGenerator.g:3796:1: ( ( rule__StatFunc__InputAssignment_3_3 ) )
            // InternalCSVParserGenerator.g:3797:2: ( rule__StatFunc__InputAssignment_3_3 )
            {
             before(grammarAccess.getStatFuncAccess().getInputAssignment_3_3()); 
            // InternalCSVParserGenerator.g:3798:2: ( rule__StatFunc__InputAssignment_3_3 )
            // InternalCSVParserGenerator.g:3798:3: rule__StatFunc__InputAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__InputAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getStatFuncAccess().getInputAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_3__3__Impl"


    // $ANTLR start "rule__StatFunc__Group_3__4"
    // InternalCSVParserGenerator.g:3806:1: rule__StatFunc__Group_3__4 : rule__StatFunc__Group_3__4__Impl ;
    public final void rule__StatFunc__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3810:1: ( rule__StatFunc__Group_3__4__Impl )
            // InternalCSVParserGenerator.g:3811:2: rule__StatFunc__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_3__4"


    // $ANTLR start "rule__StatFunc__Group_3__4__Impl"
    // InternalCSVParserGenerator.g:3817:1: rule__StatFunc__Group_3__4__Impl : ( ')' ) ;
    public final void rule__StatFunc__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3821:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:3822:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:3822:1: ( ')' )
            // InternalCSVParserGenerator.g:3823:2: ')'
            {
             before(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_3_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_3__4__Impl"


    // $ANTLR start "rule__StatFunc__Group_4__0"
    // InternalCSVParserGenerator.g:3833:1: rule__StatFunc__Group_4__0 : rule__StatFunc__Group_4__0__Impl rule__StatFunc__Group_4__1 ;
    public final void rule__StatFunc__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3837:1: ( rule__StatFunc__Group_4__0__Impl rule__StatFunc__Group_4__1 )
            // InternalCSVParserGenerator.g:3838:2: rule__StatFunc__Group_4__0__Impl rule__StatFunc__Group_4__1
            {
            pushFollow(FOLLOW_45);
            rule__StatFunc__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_4__0"


    // $ANTLR start "rule__StatFunc__Group_4__0__Impl"
    // InternalCSVParserGenerator.g:3845:1: rule__StatFunc__Group_4__0__Impl : ( () ) ;
    public final void rule__StatFunc__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3849:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3850:1: ( () )
            {
            // InternalCSVParserGenerator.g:3850:1: ( () )
            // InternalCSVParserGenerator.g:3851:2: ()
            {
             before(grammarAccess.getStatFuncAccess().getMeanAction_4_0()); 
            // InternalCSVParserGenerator.g:3852:2: ()
            // InternalCSVParserGenerator.g:3852:3: 
            {
            }

             after(grammarAccess.getStatFuncAccess().getMeanAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_4__0__Impl"


    // $ANTLR start "rule__StatFunc__Group_4__1"
    // InternalCSVParserGenerator.g:3860:1: rule__StatFunc__Group_4__1 : rule__StatFunc__Group_4__1__Impl rule__StatFunc__Group_4__2 ;
    public final void rule__StatFunc__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3864:1: ( rule__StatFunc__Group_4__1__Impl rule__StatFunc__Group_4__2 )
            // InternalCSVParserGenerator.g:3865:2: rule__StatFunc__Group_4__1__Impl rule__StatFunc__Group_4__2
            {
            pushFollow(FOLLOW_40);
            rule__StatFunc__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_4__1"


    // $ANTLR start "rule__StatFunc__Group_4__1__Impl"
    // InternalCSVParserGenerator.g:3872:1: rule__StatFunc__Group_4__1__Impl : ( 'mean' ) ;
    public final void rule__StatFunc__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3876:1: ( ( 'mean' ) )
            // InternalCSVParserGenerator.g:3877:1: ( 'mean' )
            {
            // InternalCSVParserGenerator.g:3877:1: ( 'mean' )
            // InternalCSVParserGenerator.g:3878:2: 'mean'
            {
             before(grammarAccess.getStatFuncAccess().getMeanKeyword_4_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getMeanKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_4__1__Impl"


    // $ANTLR start "rule__StatFunc__Group_4__2"
    // InternalCSVParserGenerator.g:3887:1: rule__StatFunc__Group_4__2 : rule__StatFunc__Group_4__2__Impl rule__StatFunc__Group_4__3 ;
    public final void rule__StatFunc__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3891:1: ( rule__StatFunc__Group_4__2__Impl rule__StatFunc__Group_4__3 )
            // InternalCSVParserGenerator.g:3892:2: rule__StatFunc__Group_4__2__Impl rule__StatFunc__Group_4__3
            {
            pushFollow(FOLLOW_5);
            rule__StatFunc__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_4__2"


    // $ANTLR start "rule__StatFunc__Group_4__2__Impl"
    // InternalCSVParserGenerator.g:3899:1: rule__StatFunc__Group_4__2__Impl : ( '(' ) ;
    public final void rule__StatFunc__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3903:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:3904:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:3904:1: ( '(' )
            // InternalCSVParserGenerator.g:3905:2: '('
            {
             before(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_4_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_4__2__Impl"


    // $ANTLR start "rule__StatFunc__Group_4__3"
    // InternalCSVParserGenerator.g:3914:1: rule__StatFunc__Group_4__3 : rule__StatFunc__Group_4__3__Impl rule__StatFunc__Group_4__4 ;
    public final void rule__StatFunc__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3918:1: ( rule__StatFunc__Group_4__3__Impl rule__StatFunc__Group_4__4 )
            // InternalCSVParserGenerator.g:3919:2: rule__StatFunc__Group_4__3__Impl rule__StatFunc__Group_4__4
            {
            pushFollow(FOLLOW_39);
            rule__StatFunc__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_4__3"


    // $ANTLR start "rule__StatFunc__Group_4__3__Impl"
    // InternalCSVParserGenerator.g:3926:1: rule__StatFunc__Group_4__3__Impl : ( ( rule__StatFunc__InputAssignment_4_3 ) ) ;
    public final void rule__StatFunc__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3930:1: ( ( ( rule__StatFunc__InputAssignment_4_3 ) ) )
            // InternalCSVParserGenerator.g:3931:1: ( ( rule__StatFunc__InputAssignment_4_3 ) )
            {
            // InternalCSVParserGenerator.g:3931:1: ( ( rule__StatFunc__InputAssignment_4_3 ) )
            // InternalCSVParserGenerator.g:3932:2: ( rule__StatFunc__InputAssignment_4_3 )
            {
             before(grammarAccess.getStatFuncAccess().getInputAssignment_4_3()); 
            // InternalCSVParserGenerator.g:3933:2: ( rule__StatFunc__InputAssignment_4_3 )
            // InternalCSVParserGenerator.g:3933:3: rule__StatFunc__InputAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__InputAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getStatFuncAccess().getInputAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_4__3__Impl"


    // $ANTLR start "rule__StatFunc__Group_4__4"
    // InternalCSVParserGenerator.g:3941:1: rule__StatFunc__Group_4__4 : rule__StatFunc__Group_4__4__Impl ;
    public final void rule__StatFunc__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3945:1: ( rule__StatFunc__Group_4__4__Impl )
            // InternalCSVParserGenerator.g:3946:2: rule__StatFunc__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatFunc__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_4__4"


    // $ANTLR start "rule__StatFunc__Group_4__4__Impl"
    // InternalCSVParserGenerator.g:3952:1: rule__StatFunc__Group_4__4__Impl : ( ')' ) ;
    public final void rule__StatFunc__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3956:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:3957:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:3957:1: ( ')' )
            // InternalCSVParserGenerator.g:3958:2: ')'
            {
             before(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_4_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__Group_4__4__Impl"


    // $ANTLR start "rule__ColumnAction__Group_0__0"
    // InternalCSVParserGenerator.g:3968:1: rule__ColumnAction__Group_0__0 : rule__ColumnAction__Group_0__0__Impl rule__ColumnAction__Group_0__1 ;
    public final void rule__ColumnAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3972:1: ( rule__ColumnAction__Group_0__0__Impl rule__ColumnAction__Group_0__1 )
            // InternalCSVParserGenerator.g:3973:2: rule__ColumnAction__Group_0__0__Impl rule__ColumnAction__Group_0__1
            {
            pushFollow(FOLLOW_46);
            rule__ColumnAction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__0"


    // $ANTLR start "rule__ColumnAction__Group_0__0__Impl"
    // InternalCSVParserGenerator.g:3980:1: rule__ColumnAction__Group_0__0__Impl : ( () ) ;
    public final void rule__ColumnAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3984:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3985:1: ( () )
            {
            // InternalCSVParserGenerator.g:3985:1: ( () )
            // InternalCSVParserGenerator.g:3986:2: ()
            {
             before(grammarAccess.getColumnActionAccess().getAddAction_0_0()); 
            // InternalCSVParserGenerator.g:3987:2: ()
            // InternalCSVParserGenerator.g:3987:3: 
            {
            }

             after(grammarAccess.getColumnActionAccess().getAddAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__0__Impl"


    // $ANTLR start "rule__ColumnAction__Group_0__1"
    // InternalCSVParserGenerator.g:3995:1: rule__ColumnAction__Group_0__1 : rule__ColumnAction__Group_0__1__Impl rule__ColumnAction__Group_0__2 ;
    public final void rule__ColumnAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3999:1: ( rule__ColumnAction__Group_0__1__Impl rule__ColumnAction__Group_0__2 )
            // InternalCSVParserGenerator.g:4000:2: rule__ColumnAction__Group_0__1__Impl rule__ColumnAction__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__ColumnAction__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__1"


    // $ANTLR start "rule__ColumnAction__Group_0__1__Impl"
    // InternalCSVParserGenerator.g:4007:1: rule__ColumnAction__Group_0__1__Impl : ( 'addCol' ) ;
    public final void rule__ColumnAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4011:1: ( ( 'addCol' ) )
            // InternalCSVParserGenerator.g:4012:1: ( 'addCol' )
            {
            // InternalCSVParserGenerator.g:4012:1: ( 'addCol' )
            // InternalCSVParserGenerator.g:4013:2: 'addCol'
            {
             before(grammarAccess.getColumnActionAccess().getAddColKeyword_0_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getColumnActionAccess().getAddColKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__1__Impl"


    // $ANTLR start "rule__ColumnAction__Group_0__2"
    // InternalCSVParserGenerator.g:4022:1: rule__ColumnAction__Group_0__2 : rule__ColumnAction__Group_0__2__Impl rule__ColumnAction__Group_0__3 ;
    public final void rule__ColumnAction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4026:1: ( rule__ColumnAction__Group_0__2__Impl rule__ColumnAction__Group_0__3 )
            // InternalCSVParserGenerator.g:4027:2: rule__ColumnAction__Group_0__2__Impl rule__ColumnAction__Group_0__3
            {
            pushFollow(FOLLOW_10);
            rule__ColumnAction__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__2"


    // $ANTLR start "rule__ColumnAction__Group_0__2__Impl"
    // InternalCSVParserGenerator.g:4034:1: rule__ColumnAction__Group_0__2__Impl : ( ( rule__ColumnAction__NameAssignment_0_2 ) ) ;
    public final void rule__ColumnAction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4038:1: ( ( ( rule__ColumnAction__NameAssignment_0_2 ) ) )
            // InternalCSVParserGenerator.g:4039:1: ( ( rule__ColumnAction__NameAssignment_0_2 ) )
            {
            // InternalCSVParserGenerator.g:4039:1: ( ( rule__ColumnAction__NameAssignment_0_2 ) )
            // InternalCSVParserGenerator.g:4040:2: ( rule__ColumnAction__NameAssignment_0_2 )
            {
             before(grammarAccess.getColumnActionAccess().getNameAssignment_0_2()); 
            // InternalCSVParserGenerator.g:4041:2: ( rule__ColumnAction__NameAssignment_0_2 )
            // InternalCSVParserGenerator.g:4041:3: rule__ColumnAction__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ColumnAction__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnActionAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__2__Impl"


    // $ANTLR start "rule__ColumnAction__Group_0__3"
    // InternalCSVParserGenerator.g:4049:1: rule__ColumnAction__Group_0__3 : rule__ColumnAction__Group_0__3__Impl rule__ColumnAction__Group_0__4 ;
    public final void rule__ColumnAction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4053:1: ( rule__ColumnAction__Group_0__3__Impl rule__ColumnAction__Group_0__4 )
            // InternalCSVParserGenerator.g:4054:2: rule__ColumnAction__Group_0__3__Impl rule__ColumnAction__Group_0__4
            {
            pushFollow(FOLLOW_13);
            rule__ColumnAction__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__3"


    // $ANTLR start "rule__ColumnAction__Group_0__3__Impl"
    // InternalCSVParserGenerator.g:4061:1: rule__ColumnAction__Group_0__3__Impl : ( ':' ) ;
    public final void rule__ColumnAction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4065:1: ( ( ':' ) )
            // InternalCSVParserGenerator.g:4066:1: ( ':' )
            {
            // InternalCSVParserGenerator.g:4066:1: ( ':' )
            // InternalCSVParserGenerator.g:4067:2: ':'
            {
             before(grammarAccess.getColumnActionAccess().getColonKeyword_0_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getColumnActionAccess().getColonKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__3__Impl"


    // $ANTLR start "rule__ColumnAction__Group_0__4"
    // InternalCSVParserGenerator.g:4076:1: rule__ColumnAction__Group_0__4 : rule__ColumnAction__Group_0__4__Impl rule__ColumnAction__Group_0__5 ;
    public final void rule__ColumnAction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4080:1: ( rule__ColumnAction__Group_0__4__Impl rule__ColumnAction__Group_0__5 )
            // InternalCSVParserGenerator.g:4081:2: rule__ColumnAction__Group_0__4__Impl rule__ColumnAction__Group_0__5
            {
            pushFollow(FOLLOW_47);
            rule__ColumnAction__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__4"


    // $ANTLR start "rule__ColumnAction__Group_0__4__Impl"
    // InternalCSVParserGenerator.g:4088:1: rule__ColumnAction__Group_0__4__Impl : ( ( rule__ColumnAction__TypeAssignment_0_4 ) ) ;
    public final void rule__ColumnAction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4092:1: ( ( ( rule__ColumnAction__TypeAssignment_0_4 ) ) )
            // InternalCSVParserGenerator.g:4093:1: ( ( rule__ColumnAction__TypeAssignment_0_4 ) )
            {
            // InternalCSVParserGenerator.g:4093:1: ( ( rule__ColumnAction__TypeAssignment_0_4 ) )
            // InternalCSVParserGenerator.g:4094:2: ( rule__ColumnAction__TypeAssignment_0_4 )
            {
             before(grammarAccess.getColumnActionAccess().getTypeAssignment_0_4()); 
            // InternalCSVParserGenerator.g:4095:2: ( rule__ColumnAction__TypeAssignment_0_4 )
            // InternalCSVParserGenerator.g:4095:3: rule__ColumnAction__TypeAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__ColumnAction__TypeAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getColumnActionAccess().getTypeAssignment_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__4__Impl"


    // $ANTLR start "rule__ColumnAction__Group_0__5"
    // InternalCSVParserGenerator.g:4103:1: rule__ColumnAction__Group_0__5 : rule__ColumnAction__Group_0__5__Impl rule__ColumnAction__Group_0__6 ;
    public final void rule__ColumnAction__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4107:1: ( rule__ColumnAction__Group_0__5__Impl rule__ColumnAction__Group_0__6 )
            // InternalCSVParserGenerator.g:4108:2: rule__ColumnAction__Group_0__5__Impl rule__ColumnAction__Group_0__6
            {
            pushFollow(FOLLOW_31);
            rule__ColumnAction__Group_0__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_0__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__5"


    // $ANTLR start "rule__ColumnAction__Group_0__5__Impl"
    // InternalCSVParserGenerator.g:4115:1: rule__ColumnAction__Group_0__5__Impl : ( 'with' ) ;
    public final void rule__ColumnAction__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4119:1: ( ( 'with' ) )
            // InternalCSVParserGenerator.g:4120:1: ( 'with' )
            {
            // InternalCSVParserGenerator.g:4120:1: ( 'with' )
            // InternalCSVParserGenerator.g:4121:2: 'with'
            {
             before(grammarAccess.getColumnActionAccess().getWithKeyword_0_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getColumnActionAccess().getWithKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__5__Impl"


    // $ANTLR start "rule__ColumnAction__Group_0__6"
    // InternalCSVParserGenerator.g:4130:1: rule__ColumnAction__Group_0__6 : rule__ColumnAction__Group_0__6__Impl ;
    public final void rule__ColumnAction__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4134:1: ( rule__ColumnAction__Group_0__6__Impl )
            // InternalCSVParserGenerator.g:4135:2: rule__ColumnAction__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_0__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__6"


    // $ANTLR start "rule__ColumnAction__Group_0__6__Impl"
    // InternalCSVParserGenerator.g:4141:1: rule__ColumnAction__Group_0__6__Impl : ( ( rule__ColumnAction__ModAssignment_0_6 ) ) ;
    public final void rule__ColumnAction__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4145:1: ( ( ( rule__ColumnAction__ModAssignment_0_6 ) ) )
            // InternalCSVParserGenerator.g:4146:1: ( ( rule__ColumnAction__ModAssignment_0_6 ) )
            {
            // InternalCSVParserGenerator.g:4146:1: ( ( rule__ColumnAction__ModAssignment_0_6 ) )
            // InternalCSVParserGenerator.g:4147:2: ( rule__ColumnAction__ModAssignment_0_6 )
            {
             before(grammarAccess.getColumnActionAccess().getModAssignment_0_6()); 
            // InternalCSVParserGenerator.g:4148:2: ( rule__ColumnAction__ModAssignment_0_6 )
            // InternalCSVParserGenerator.g:4148:3: rule__ColumnAction__ModAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__ColumnAction__ModAssignment_0_6();

            state._fsp--;


            }

             after(grammarAccess.getColumnActionAccess().getModAssignment_0_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_0__6__Impl"


    // $ANTLR start "rule__ColumnAction__Group_1__0"
    // InternalCSVParserGenerator.g:4157:1: rule__ColumnAction__Group_1__0 : rule__ColumnAction__Group_1__0__Impl rule__ColumnAction__Group_1__1 ;
    public final void rule__ColumnAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4161:1: ( rule__ColumnAction__Group_1__0__Impl rule__ColumnAction__Group_1__1 )
            // InternalCSVParserGenerator.g:4162:2: rule__ColumnAction__Group_1__0__Impl rule__ColumnAction__Group_1__1
            {
            pushFollow(FOLLOW_48);
            rule__ColumnAction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_1__0"


    // $ANTLR start "rule__ColumnAction__Group_1__0__Impl"
    // InternalCSVParserGenerator.g:4169:1: rule__ColumnAction__Group_1__0__Impl : ( () ) ;
    public final void rule__ColumnAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4173:1: ( ( () ) )
            // InternalCSVParserGenerator.g:4174:1: ( () )
            {
            // InternalCSVParserGenerator.g:4174:1: ( () )
            // InternalCSVParserGenerator.g:4175:2: ()
            {
             before(grammarAccess.getColumnActionAccess().getRemAction_1_0()); 
            // InternalCSVParserGenerator.g:4176:2: ()
            // InternalCSVParserGenerator.g:4176:3: 
            {
            }

             after(grammarAccess.getColumnActionAccess().getRemAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_1__0__Impl"


    // $ANTLR start "rule__ColumnAction__Group_1__1"
    // InternalCSVParserGenerator.g:4184:1: rule__ColumnAction__Group_1__1 : rule__ColumnAction__Group_1__1__Impl rule__ColumnAction__Group_1__2 ;
    public final void rule__ColumnAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4188:1: ( rule__ColumnAction__Group_1__1__Impl rule__ColumnAction__Group_1__2 )
            // InternalCSVParserGenerator.g:4189:2: rule__ColumnAction__Group_1__1__Impl rule__ColumnAction__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__ColumnAction__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_1__1"


    // $ANTLR start "rule__ColumnAction__Group_1__1__Impl"
    // InternalCSVParserGenerator.g:4196:1: rule__ColumnAction__Group_1__1__Impl : ( 'remCol' ) ;
    public final void rule__ColumnAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4200:1: ( ( 'remCol' ) )
            // InternalCSVParserGenerator.g:4201:1: ( 'remCol' )
            {
            // InternalCSVParserGenerator.g:4201:1: ( 'remCol' )
            // InternalCSVParserGenerator.g:4202:2: 'remCol'
            {
             before(grammarAccess.getColumnActionAccess().getRemColKeyword_1_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getColumnActionAccess().getRemColKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_1__1__Impl"


    // $ANTLR start "rule__ColumnAction__Group_1__2"
    // InternalCSVParserGenerator.g:4211:1: rule__ColumnAction__Group_1__2 : rule__ColumnAction__Group_1__2__Impl ;
    public final void rule__ColumnAction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4215:1: ( rule__ColumnAction__Group_1__2__Impl )
            // InternalCSVParserGenerator.g:4216:2: rule__ColumnAction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_1__2"


    // $ANTLR start "rule__ColumnAction__Group_1__2__Impl"
    // InternalCSVParserGenerator.g:4222:1: rule__ColumnAction__Group_1__2__Impl : ( ( rule__ColumnAction__NameAssignment_1_2 ) ) ;
    public final void rule__ColumnAction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4226:1: ( ( ( rule__ColumnAction__NameAssignment_1_2 ) ) )
            // InternalCSVParserGenerator.g:4227:1: ( ( rule__ColumnAction__NameAssignment_1_2 ) )
            {
            // InternalCSVParserGenerator.g:4227:1: ( ( rule__ColumnAction__NameAssignment_1_2 ) )
            // InternalCSVParserGenerator.g:4228:2: ( rule__ColumnAction__NameAssignment_1_2 )
            {
             before(grammarAccess.getColumnActionAccess().getNameAssignment_1_2()); 
            // InternalCSVParserGenerator.g:4229:2: ( rule__ColumnAction__NameAssignment_1_2 )
            // InternalCSVParserGenerator.g:4229:3: rule__ColumnAction__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ColumnAction__NameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnActionAccess().getNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__Group_1__2__Impl"


    // $ANTLR start "rule__Sum__Group__0"
    // InternalCSVParserGenerator.g:4238:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4242:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalCSVParserGenerator.g:4243:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__Sum__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0"


    // $ANTLR start "rule__Sum__Group__0__Impl"
    // InternalCSVParserGenerator.g:4250:1: rule__Sum__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4254:1: ( ( ruleFactor ) )
            // InternalCSVParserGenerator.g:4255:1: ( ruleFactor )
            {
            // InternalCSVParserGenerator.g:4255:1: ( ruleFactor )
            // InternalCSVParserGenerator.g:4256:2: ruleFactor
            {
             before(grammarAccess.getSumAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getSumAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__0__Impl"


    // $ANTLR start "rule__Sum__Group__1"
    // InternalCSVParserGenerator.g:4265:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4269:1: ( rule__Sum__Group__1__Impl )
            // InternalCSVParserGenerator.g:4270:2: rule__Sum__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1"


    // $ANTLR start "rule__Sum__Group__1__Impl"
    // InternalCSVParserGenerator.g:4276:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4280:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // InternalCSVParserGenerator.g:4281:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // InternalCSVParserGenerator.g:4281:1: ( ( rule__Sum__Group_1__0 )* )
            // InternalCSVParserGenerator.g:4282:2: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // InternalCSVParserGenerator.g:4283:2: ( rule__Sum__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=48 && LA23_0<=49)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:4283:3: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_50);
            	    rule__Sum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSumAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group__1__Impl"


    // $ANTLR start "rule__Sum__Group_1__0"
    // InternalCSVParserGenerator.g:4292:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4296:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // InternalCSVParserGenerator.g:4297:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__Sum__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__0"


    // $ANTLR start "rule__Sum__Group_1__0__Impl"
    // InternalCSVParserGenerator.g:4304:1: rule__Sum__Group_1__0__Impl : ( ( rule__Sum__Alternatives_1_0 ) ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4308:1: ( ( ( rule__Sum__Alternatives_1_0 ) ) )
            // InternalCSVParserGenerator.g:4309:1: ( ( rule__Sum__Alternatives_1_0 ) )
            {
            // InternalCSVParserGenerator.g:4309:1: ( ( rule__Sum__Alternatives_1_0 ) )
            // InternalCSVParserGenerator.g:4310:2: ( rule__Sum__Alternatives_1_0 )
            {
             before(grammarAccess.getSumAccess().getAlternatives_1_0()); 
            // InternalCSVParserGenerator.g:4311:2: ( rule__Sum__Alternatives_1_0 )
            // InternalCSVParserGenerator.g:4311:3: rule__Sum__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1__1"
    // InternalCSVParserGenerator.g:4319:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4323:1: ( rule__Sum__Group_1__1__Impl )
            // InternalCSVParserGenerator.g:4324:2: rule__Sum__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__1"


    // $ANTLR start "rule__Sum__Group_1__1__Impl"
    // InternalCSVParserGenerator.g:4330:1: rule__Sum__Group_1__1__Impl : ( ( rule__Sum__RightAssignment_1_1 ) ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4334:1: ( ( ( rule__Sum__RightAssignment_1_1 ) ) )
            // InternalCSVParserGenerator.g:4335:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            {
            // InternalCSVParserGenerator.g:4335:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            // InternalCSVParserGenerator.g:4336:2: ( rule__Sum__RightAssignment_1_1 )
            {
             before(grammarAccess.getSumAccess().getRightAssignment_1_1()); 
            // InternalCSVParserGenerator.g:4337:2: ( rule__Sum__RightAssignment_1_1 )
            // InternalCSVParserGenerator.g:4337:3: rule__Sum__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sum__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSumAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1__1__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_0__0"
    // InternalCSVParserGenerator.g:4346:1: rule__Sum__Group_1_0_0__0 : rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 ;
    public final void rule__Sum__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4350:1: ( rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 )
            // InternalCSVParserGenerator.g:4351:2: rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Sum__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__0"


    // $ANTLR start "rule__Sum__Group_1_0_0__0__Impl"
    // InternalCSVParserGenerator.g:4358:1: rule__Sum__Group_1_0_0__0__Impl : ( '+' ) ;
    public final void rule__Sum__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4362:1: ( ( '+' ) )
            // InternalCSVParserGenerator.g:4363:1: ( '+' )
            {
            // InternalCSVParserGenerator.g:4363:1: ( '+' )
            // InternalCSVParserGenerator.g:4364:2: '+'
            {
             before(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_0__1"
    // InternalCSVParserGenerator.g:4373:1: rule__Sum__Group_1_0_0__1 : rule__Sum__Group_1_0_0__1__Impl ;
    public final void rule__Sum__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4377:1: ( rule__Sum__Group_1_0_0__1__Impl )
            // InternalCSVParserGenerator.g:4378:2: rule__Sum__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__1"


    // $ANTLR start "rule__Sum__Group_1_0_0__1__Impl"
    // InternalCSVParserGenerator.g:4384:1: rule__Sum__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4388:1: ( ( () ) )
            // InternalCSVParserGenerator.g:4389:1: ( () )
            {
            // InternalCSVParserGenerator.g:4389:1: ( () )
            // InternalCSVParserGenerator.g:4390:2: ()
            {
             before(grammarAccess.getSumAccess().getPlusLeftAction_1_0_0_1()); 
            // InternalCSVParserGenerator.g:4391:2: ()
            // InternalCSVParserGenerator.g:4391:3: 
            {
            }

             after(grammarAccess.getSumAccess().getPlusLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_1__0"
    // InternalCSVParserGenerator.g:4400:1: rule__Sum__Group_1_0_1__0 : rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 ;
    public final void rule__Sum__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4404:1: ( rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 )
            // InternalCSVParserGenerator.g:4405:2: rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Sum__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__0"


    // $ANTLR start "rule__Sum__Group_1_0_1__0__Impl"
    // InternalCSVParserGenerator.g:4412:1: rule__Sum__Group_1_0_1__0__Impl : ( '-' ) ;
    public final void rule__Sum__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4416:1: ( ( '-' ) )
            // InternalCSVParserGenerator.g:4417:1: ( '-' )
            {
            // InternalCSVParserGenerator.g:4417:1: ( '-' )
            // InternalCSVParserGenerator.g:4418:2: '-'
            {
             before(grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Sum__Group_1_0_1__1"
    // InternalCSVParserGenerator.g:4427:1: rule__Sum__Group_1_0_1__1 : rule__Sum__Group_1_0_1__1__Impl ;
    public final void rule__Sum__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4431:1: ( rule__Sum__Group_1_0_1__1__Impl )
            // InternalCSVParserGenerator.g:4432:2: rule__Sum__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sum__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__1"


    // $ANTLR start "rule__Sum__Group_1_0_1__1__Impl"
    // InternalCSVParserGenerator.g:4438:1: rule__Sum__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4442:1: ( ( () ) )
            // InternalCSVParserGenerator.g:4443:1: ( () )
            {
            // InternalCSVParserGenerator.g:4443:1: ( () )
            // InternalCSVParserGenerator.g:4444:2: ()
            {
             before(grammarAccess.getSumAccess().getMinusLeftAction_1_0_1_1()); 
            // InternalCSVParserGenerator.g:4445:2: ()
            // InternalCSVParserGenerator.g:4445:3: 
            {
            }

             after(grammarAccess.getSumAccess().getMinusLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalCSVParserGenerator.g:4454:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4458:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalCSVParserGenerator.g:4459:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalCSVParserGenerator.g:4466:1: rule__Factor__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4470:1: ( ( rulePrimary ) )
            // InternalCSVParserGenerator.g:4471:1: ( rulePrimary )
            {
            // InternalCSVParserGenerator.g:4471:1: ( rulePrimary )
            // InternalCSVParserGenerator.g:4472:2: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalCSVParserGenerator.g:4481:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4485:1: ( rule__Factor__Group__1__Impl )
            // InternalCSVParserGenerator.g:4486:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalCSVParserGenerator.g:4492:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4496:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalCSVParserGenerator.g:4497:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalCSVParserGenerator.g:4497:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalCSVParserGenerator.g:4498:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalCSVParserGenerator.g:4499:2: ( rule__Factor__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=50 && LA24_0<=51)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:4499:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalCSVParserGenerator.g:4508:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4512:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalCSVParserGenerator.g:4513:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalCSVParserGenerator.g:4520:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__Alternatives_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4524:1: ( ( ( rule__Factor__Alternatives_1_0 ) ) )
            // InternalCSVParserGenerator.g:4525:1: ( ( rule__Factor__Alternatives_1_0 ) )
            {
            // InternalCSVParserGenerator.g:4525:1: ( ( rule__Factor__Alternatives_1_0 ) )
            // InternalCSVParserGenerator.g:4526:2: ( rule__Factor__Alternatives_1_0 )
            {
             before(grammarAccess.getFactorAccess().getAlternatives_1_0()); 
            // InternalCSVParserGenerator.g:4527:2: ( rule__Factor__Alternatives_1_0 )
            // InternalCSVParserGenerator.g:4527:3: rule__Factor__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalCSVParserGenerator.g:4535:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4539:1: ( rule__Factor__Group_1__1__Impl )
            // InternalCSVParserGenerator.g:4540:2: rule__Factor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalCSVParserGenerator.g:4546:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4550:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalCSVParserGenerator.g:4551:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalCSVParserGenerator.g:4551:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalCSVParserGenerator.g:4552:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalCSVParserGenerator.g:4553:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalCSVParserGenerator.g:4553:3: rule__Factor__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_0__0"
    // InternalCSVParserGenerator.g:4562:1: rule__Factor__Group_1_0_0__0 : rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 ;
    public final void rule__Factor__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4566:1: ( rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 )
            // InternalCSVParserGenerator.g:4567:2: rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1
            {
            pushFollow(FOLLOW_1);
            rule__Factor__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__0"


    // $ANTLR start "rule__Factor__Group_1_0_0__0__Impl"
    // InternalCSVParserGenerator.g:4574:1: rule__Factor__Group_1_0_0__0__Impl : ( '*' ) ;
    public final void rule__Factor__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4578:1: ( ( '*' ) )
            // InternalCSVParserGenerator.g:4579:1: ( '*' )
            {
            // InternalCSVParserGenerator.g:4579:1: ( '*' )
            // InternalCSVParserGenerator.g:4580:2: '*'
            {
             before(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_0__1"
    // InternalCSVParserGenerator.g:4589:1: rule__Factor__Group_1_0_0__1 : rule__Factor__Group_1_0_0__1__Impl ;
    public final void rule__Factor__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4593:1: ( rule__Factor__Group_1_0_0__1__Impl )
            // InternalCSVParserGenerator.g:4594:2: rule__Factor__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__1"


    // $ANTLR start "rule__Factor__Group_1_0_0__1__Impl"
    // InternalCSVParserGenerator.g:4600:1: rule__Factor__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4604:1: ( ( () ) )
            // InternalCSVParserGenerator.g:4605:1: ( () )
            {
            // InternalCSVParserGenerator.g:4605:1: ( () )
            // InternalCSVParserGenerator.g:4606:2: ()
            {
             before(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1()); 
            // InternalCSVParserGenerator.g:4607:2: ()
            // InternalCSVParserGenerator.g:4607:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_1__0"
    // InternalCSVParserGenerator.g:4616:1: rule__Factor__Group_1_0_1__0 : rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 ;
    public final void rule__Factor__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4620:1: ( rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 )
            // InternalCSVParserGenerator.g:4621:2: rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1
            {
            pushFollow(FOLLOW_1);
            rule__Factor__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__0"


    // $ANTLR start "rule__Factor__Group_1_0_1__0__Impl"
    // InternalCSVParserGenerator.g:4628:1: rule__Factor__Group_1_0_1__0__Impl : ( '/' ) ;
    public final void rule__Factor__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4632:1: ( ( '/' ) )
            // InternalCSVParserGenerator.g:4633:1: ( '/' )
            {
            // InternalCSVParserGenerator.g:4633:1: ( '/' )
            // InternalCSVParserGenerator.g:4634:2: '/'
            {
             before(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_1__1"
    // InternalCSVParserGenerator.g:4643:1: rule__Factor__Group_1_0_1__1 : rule__Factor__Group_1_0_1__1__Impl ;
    public final void rule__Factor__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4647:1: ( rule__Factor__Group_1_0_1__1__Impl )
            // InternalCSVParserGenerator.g:4648:2: rule__Factor__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__1"


    // $ANTLR start "rule__Factor__Group_1_0_1__1__Impl"
    // InternalCSVParserGenerator.g:4654:1: rule__Factor__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4658:1: ( ( () ) )
            // InternalCSVParserGenerator.g:4659:1: ( () )
            {
            // InternalCSVParserGenerator.g:4659:1: ( () )
            // InternalCSVParserGenerator.g:4660:2: ()
            {
             before(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1()); 
            // InternalCSVParserGenerator.g:4661:2: ()
            // InternalCSVParserGenerator.g:4661:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalCSVParserGenerator.g:4670:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4674:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalCSVParserGenerator.g:4675:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalCSVParserGenerator.g:4682:1: rule__Number__Group__0__Impl : ( () ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4686:1: ( ( () ) )
            // InternalCSVParserGenerator.g:4687:1: ( () )
            {
            // InternalCSVParserGenerator.g:4687:1: ( () )
            // InternalCSVParserGenerator.g:4688:2: ()
            {
             before(grammarAccess.getNumberAccess().getNumAction_0()); 
            // InternalCSVParserGenerator.g:4689:2: ()
            // InternalCSVParserGenerator.g:4689:3: 
            {
            }

             after(grammarAccess.getNumberAccess().getNumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalCSVParserGenerator.g:4697:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4701:1: ( rule__Number__Group__1__Impl )
            // InternalCSVParserGenerator.g:4702:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalCSVParserGenerator.g:4708:1: rule__Number__Group__1__Impl : ( ( rule__Number__ValueAssignment_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4712:1: ( ( ( rule__Number__ValueAssignment_1 ) ) )
            // InternalCSVParserGenerator.g:4713:1: ( ( rule__Number__ValueAssignment_1 ) )
            {
            // InternalCSVParserGenerator.g:4713:1: ( ( rule__Number__ValueAssignment_1 ) )
            // InternalCSVParserGenerator.g:4714:2: ( rule__Number__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment_1()); 
            // InternalCSVParserGenerator.g:4715:2: ( rule__Number__ValueAssignment_1 )
            // InternalCSVParserGenerator.g:4715:3: rule__Number__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__0"
    // InternalCSVParserGenerator.g:4724:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4728:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalCSVParserGenerator.g:4729:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Constraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0"


    // $ANTLR start "rule__Constraint__Group__0__Impl"
    // InternalCSVParserGenerator.g:4736:1: rule__Constraint__Group__0__Impl : ( 'satisfies' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4740:1: ( ( 'satisfies' ) )
            // InternalCSVParserGenerator.g:4741:1: ( 'satisfies' )
            {
            // InternalCSVParserGenerator.g:4741:1: ( 'satisfies' )
            // InternalCSVParserGenerator.g:4742:2: 'satisfies'
            {
             before(grammarAccess.getConstraintAccess().getSatisfiesKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getSatisfiesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__0__Impl"


    // $ANTLR start "rule__Constraint__Group__1"
    // InternalCSVParserGenerator.g:4751:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4755:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalCSVParserGenerator.g:4756:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__Constraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1"


    // $ANTLR start "rule__Constraint__Group__1__Impl"
    // InternalCSVParserGenerator.g:4763:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4767:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalCSVParserGenerator.g:4768:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalCSVParserGenerator.g:4768:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalCSVParserGenerator.g:4769:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalCSVParserGenerator.g:4770:2: ( rule__Constraint__NameAssignment_1 )
            // InternalCSVParserGenerator.g:4770:3: rule__Constraint__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__1__Impl"


    // $ANTLR start "rule__Constraint__Group__2"
    // InternalCSVParserGenerator.g:4778:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4782:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalCSVParserGenerator.g:4783:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Constraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2"


    // $ANTLR start "rule__Constraint__Group__2__Impl"
    // InternalCSVParserGenerator.g:4790:1: rule__Constraint__Group__2__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4794:1: ( ( 'constraint' ) )
            // InternalCSVParserGenerator.g:4795:1: ( 'constraint' )
            {
            // InternalCSVParserGenerator.g:4795:1: ( 'constraint' )
            // InternalCSVParserGenerator.g:4796:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getConstraintKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__2__Impl"


    // $ANTLR start "rule__Constraint__Group__3"
    // InternalCSVParserGenerator.g:4805:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4809:1: ( rule__Constraint__Group__3__Impl )
            // InternalCSVParserGenerator.g:4810:2: rule__Constraint__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3"


    // $ANTLR start "rule__Constraint__Group__3__Impl"
    // InternalCSVParserGenerator.g:4816:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__ExpAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4820:1: ( ( ( rule__Constraint__ExpAssignment_3 ) ) )
            // InternalCSVParserGenerator.g:4821:1: ( ( rule__Constraint__ExpAssignment_3 ) )
            {
            // InternalCSVParserGenerator.g:4821:1: ( ( rule__Constraint__ExpAssignment_3 ) )
            // InternalCSVParserGenerator.g:4822:2: ( rule__Constraint__ExpAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_3()); 
            // InternalCSVParserGenerator.g:4823:2: ( rule__Constraint__ExpAssignment_3 )
            // InternalCSVParserGenerator.g:4823:3: rule__Constraint__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Constraint__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConstraintAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__Group__3__Impl"


    // $ANTLR start "rule__DateLiteral__Group__0"
    // InternalCSVParserGenerator.g:4832:1: rule__DateLiteral__Group__0 : rule__DateLiteral__Group__0__Impl rule__DateLiteral__Group__1 ;
    public final void rule__DateLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4836:1: ( rule__DateLiteral__Group__0__Impl rule__DateLiteral__Group__1 )
            // InternalCSVParserGenerator.g:4837:2: rule__DateLiteral__Group__0__Impl rule__DateLiteral__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__DateLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__0"


    // $ANTLR start "rule__DateLiteral__Group__0__Impl"
    // InternalCSVParserGenerator.g:4844:1: rule__DateLiteral__Group__0__Impl : ( () ) ;
    public final void rule__DateLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4848:1: ( ( () ) )
            // InternalCSVParserGenerator.g:4849:1: ( () )
            {
            // InternalCSVParserGenerator.g:4849:1: ( () )
            // InternalCSVParserGenerator.g:4850:2: ()
            {
             before(grammarAccess.getDateLiteralAccess().getDateLitAction_0()); 
            // InternalCSVParserGenerator.g:4851:2: ()
            // InternalCSVParserGenerator.g:4851:3: 
            {
            }

             after(grammarAccess.getDateLiteralAccess().getDateLitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__0__Impl"


    // $ANTLR start "rule__DateLiteral__Group__1"
    // InternalCSVParserGenerator.g:4859:1: rule__DateLiteral__Group__1 : rule__DateLiteral__Group__1__Impl rule__DateLiteral__Group__2 ;
    public final void rule__DateLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4863:1: ( rule__DateLiteral__Group__1__Impl rule__DateLiteral__Group__2 )
            // InternalCSVParserGenerator.g:4864:2: rule__DateLiteral__Group__1__Impl rule__DateLiteral__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DateLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DateLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__1"


    // $ANTLR start "rule__DateLiteral__Group__1__Impl"
    // InternalCSVParserGenerator.g:4871:1: rule__DateLiteral__Group__1__Impl : ( 'd' ) ;
    public final void rule__DateLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4875:1: ( ( 'd' ) )
            // InternalCSVParserGenerator.g:4876:1: ( 'd' )
            {
            // InternalCSVParserGenerator.g:4876:1: ( 'd' )
            // InternalCSVParserGenerator.g:4877:2: 'd'
            {
             before(grammarAccess.getDateLiteralAccess().getDKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDateLiteralAccess().getDKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__1__Impl"


    // $ANTLR start "rule__DateLiteral__Group__2"
    // InternalCSVParserGenerator.g:4886:1: rule__DateLiteral__Group__2 : rule__DateLiteral__Group__2__Impl ;
    public final void rule__DateLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4890:1: ( rule__DateLiteral__Group__2__Impl )
            // InternalCSVParserGenerator.g:4891:2: rule__DateLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DateLiteral__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__2"


    // $ANTLR start "rule__DateLiteral__Group__2__Impl"
    // InternalCSVParserGenerator.g:4897:1: rule__DateLiteral__Group__2__Impl : ( ( rule__DateLiteral__ValueAssignment_2 ) ) ;
    public final void rule__DateLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4901:1: ( ( ( rule__DateLiteral__ValueAssignment_2 ) ) )
            // InternalCSVParserGenerator.g:4902:1: ( ( rule__DateLiteral__ValueAssignment_2 ) )
            {
            // InternalCSVParserGenerator.g:4902:1: ( ( rule__DateLiteral__ValueAssignment_2 ) )
            // InternalCSVParserGenerator.g:4903:2: ( rule__DateLiteral__ValueAssignment_2 )
            {
             before(grammarAccess.getDateLiteralAccess().getValueAssignment_2()); 
            // InternalCSVParserGenerator.g:4904:2: ( rule__DateLiteral__ValueAssignment_2 )
            // InternalCSVParserGenerator.g:4904:3: rule__DateLiteral__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DateLiteral__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDateLiteralAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__Group__2__Impl"


    // $ANTLR start "rule__StringLiteral__Group__0"
    // InternalCSVParserGenerator.g:4913:1: rule__StringLiteral__Group__0 : rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 ;
    public final void rule__StringLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4917:1: ( rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1 )
            // InternalCSVParserGenerator.g:4918:2: rule__StringLiteral__Group__0__Impl rule__StringLiteral__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__StringLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0"


    // $ANTLR start "rule__StringLiteral__Group__0__Impl"
    // InternalCSVParserGenerator.g:4925:1: rule__StringLiteral__Group__0__Impl : ( () ) ;
    public final void rule__StringLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4929:1: ( ( () ) )
            // InternalCSVParserGenerator.g:4930:1: ( () )
            {
            // InternalCSVParserGenerator.g:4930:1: ( () )
            // InternalCSVParserGenerator.g:4931:2: ()
            {
             before(grammarAccess.getStringLiteralAccess().getStringLitAction_0()); 
            // InternalCSVParserGenerator.g:4932:2: ()
            // InternalCSVParserGenerator.g:4932:3: 
            {
            }

             after(grammarAccess.getStringLiteralAccess().getStringLitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__0__Impl"


    // $ANTLR start "rule__StringLiteral__Group__1"
    // InternalCSVParserGenerator.g:4940:1: rule__StringLiteral__Group__1 : rule__StringLiteral__Group__1__Impl ;
    public final void rule__StringLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4944:1: ( rule__StringLiteral__Group__1__Impl )
            // InternalCSVParserGenerator.g:4945:2: rule__StringLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__1"


    // $ANTLR start "rule__StringLiteral__Group__1__Impl"
    // InternalCSVParserGenerator.g:4951:1: rule__StringLiteral__Group__1__Impl : ( ( rule__StringLiteral__ValueAssignment_1 ) ) ;
    public final void rule__StringLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4955:1: ( ( ( rule__StringLiteral__ValueAssignment_1 ) ) )
            // InternalCSVParserGenerator.g:4956:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            {
            // InternalCSVParserGenerator.g:4956:1: ( ( rule__StringLiteral__ValueAssignment_1 ) )
            // InternalCSVParserGenerator.g:4957:2: ( rule__StringLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 
            // InternalCSVParserGenerator.g:4958:2: ( rule__StringLiteral__ValueAssignment_1 )
            // InternalCSVParserGenerator.g:4958:3: rule__StringLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__Group__1__Impl"


    // $ANTLR start "rule__Parser__FileAssignment_0"
    // InternalCSVParserGenerator.g:4967:1: rule__Parser__FileAssignment_0 : ( ruleFileDecl ) ;
    public final void rule__Parser__FileAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4971:1: ( ( ruleFileDecl ) )
            // InternalCSVParserGenerator.g:4972:2: ( ruleFileDecl )
            {
            // InternalCSVParserGenerator.g:4972:2: ( ruleFileDecl )
            // InternalCSVParserGenerator.g:4973:3: ruleFileDecl
            {
             before(grammarAccess.getParserAccess().getFileFileDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFileDecl();

            state._fsp--;

             after(grammarAccess.getParserAccess().getFileFileDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__FileAssignment_0"


    // $ANTLR start "rule__Parser__ColumnsAssignment_3"
    // InternalCSVParserGenerator.g:4982:1: rule__Parser__ColumnsAssignment_3 : ( ruleColDecl ) ;
    public final void rule__Parser__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4986:1: ( ( ruleColDecl ) )
            // InternalCSVParserGenerator.g:4987:2: ( ruleColDecl )
            {
            // InternalCSVParserGenerator.g:4987:2: ( ruleColDecl )
            // InternalCSVParserGenerator.g:4988:3: ruleColDecl
            {
             before(grammarAccess.getParserAccess().getColumnsColDeclParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColDecl();

            state._fsp--;

             after(grammarAccess.getParserAccess().getColumnsColDeclParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__ColumnsAssignment_3"


    // $ANTLR start "rule__Parser__ModsAssignment_5"
    // InternalCSVParserGenerator.g:4997:1: rule__Parser__ModsAssignment_5 : ( ruleModification ) ;
    public final void rule__Parser__ModsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5001:1: ( ( ruleModification ) )
            // InternalCSVParserGenerator.g:5002:2: ( ruleModification )
            {
            // InternalCSVParserGenerator.g:5002:2: ( ruleModification )
            // InternalCSVParserGenerator.g:5003:3: ruleModification
            {
             before(grammarAccess.getParserAccess().getModsModificationParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleModification();

            state._fsp--;

             after(grammarAccess.getParserAccess().getModsModificationParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__ModsAssignment_5"


    // $ANTLR start "rule__Parser__OutAssignment_6"
    // InternalCSVParserGenerator.g:5012:1: rule__Parser__OutAssignment_6 : ( ruleOutput ) ;
    public final void rule__Parser__OutAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5016:1: ( ( ruleOutput ) )
            // InternalCSVParserGenerator.g:5017:2: ( ruleOutput )
            {
            // InternalCSVParserGenerator.g:5017:2: ( ruleOutput )
            // InternalCSVParserGenerator.g:5018:3: ruleOutput
            {
             before(grammarAccess.getParserAccess().getOutOutputParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getParserAccess().getOutOutputParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parser__OutAssignment_6"


    // $ANTLR start "rule__FileDecl__NameAssignment_2"
    // InternalCSVParserGenerator.g:5027:1: rule__FileDecl__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FileDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5031:1: ( ( RULE_STRING ) )
            // InternalCSVParserGenerator.g:5032:2: ( RULE_STRING )
            {
            // InternalCSVParserGenerator.g:5032:2: ( RULE_STRING )
            // InternalCSVParserGenerator.g:5033:3: RULE_STRING
            {
             before(grammarAccess.getFileDeclAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileDeclAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__NameAssignment_2"


    // $ANTLR start "rule__FileDecl__SepcharAssignment_4"
    // InternalCSVParserGenerator.g:5042:1: rule__FileDecl__SepcharAssignment_4 : ( RULE_STRING ) ;
    public final void rule__FileDecl__SepcharAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5046:1: ( ( RULE_STRING ) )
            // InternalCSVParserGenerator.g:5047:2: ( RULE_STRING )
            {
            // InternalCSVParserGenerator.g:5047:2: ( RULE_STRING )
            // InternalCSVParserGenerator.g:5048:3: RULE_STRING
            {
             before(grammarAccess.getFileDeclAccess().getSepcharSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileDeclAccess().getSepcharSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileDecl__SepcharAssignment_4"


    // $ANTLR start "rule__ColDecl__NameAssignment_0"
    // InternalCSVParserGenerator.g:5057:1: rule__ColDecl__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ColDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5061:1: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5062:2: ( RULE_ID )
            {
            // InternalCSVParserGenerator.g:5062:2: ( RULE_ID )
            // InternalCSVParserGenerator.g:5063:3: RULE_ID
            {
             before(grammarAccess.getColDeclAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColDeclAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__NameAssignment_0"


    // $ANTLR start "rule__ColDecl__TypeAssignment_2"
    // InternalCSVParserGenerator.g:5072:1: rule__ColDecl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ColDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5076:1: ( ( ruleType ) )
            // InternalCSVParserGenerator.g:5077:2: ( ruleType )
            {
            // InternalCSVParserGenerator.g:5077:2: ( ruleType )
            // InternalCSVParserGenerator.g:5078:3: ruleType
            {
             before(grammarAccess.getColDeclAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getColDeclAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__TypeAssignment_2"


    // $ANTLR start "rule__ColDecl__ModsAssignment_3"
    // InternalCSVParserGenerator.g:5087:1: rule__ColDecl__ModsAssignment_3 : ( ruleModification ) ;
    public final void rule__ColDecl__ModsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5091:1: ( ( ruleModification ) )
            // InternalCSVParserGenerator.g:5092:2: ( ruleModification )
            {
            // InternalCSVParserGenerator.g:5092:2: ( ruleModification )
            // InternalCSVParserGenerator.g:5093:3: ruleModification
            {
             before(grammarAccess.getColDeclAccess().getModsModificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleModification();

            state._fsp--;

             after(grammarAccess.getColDeclAccess().getModsModificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColDecl__ModsAssignment_3"


    // $ANTLR start "rule__Modification__ModsAssignment_0_3"
    // InternalCSVParserGenerator.g:5102:1: rule__Modification__ModsAssignment_0_3 : ( ruleValueMod ) ;
    public final void rule__Modification__ModsAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5106:1: ( ( ruleValueMod ) )
            // InternalCSVParserGenerator.g:5107:2: ( ruleValueMod )
            {
            // InternalCSVParserGenerator.g:5107:2: ( ruleValueMod )
            // InternalCSVParserGenerator.g:5108:3: ruleValueMod
            {
             before(grammarAccess.getModificationAccess().getModsValueModParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleValueMod();

            state._fsp--;

             after(grammarAccess.getModificationAccess().getModsValueModParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__ModsAssignment_0_3"


    // $ANTLR start "rule__Modification__ModsAssignment_1_3"
    // InternalCSVParserGenerator.g:5117:1: rule__Modification__ModsAssignment_1_3 : ( ruleExternal ) ;
    public final void rule__Modification__ModsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5121:1: ( ( ruleExternal ) )
            // InternalCSVParserGenerator.g:5122:2: ( ruleExternal )
            {
            // InternalCSVParserGenerator.g:5122:2: ( ruleExternal )
            // InternalCSVParserGenerator.g:5123:3: ruleExternal
            {
             before(grammarAccess.getModificationAccess().getModsExternalParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExternal();

            state._fsp--;

             after(grammarAccess.getModificationAccess().getModsExternalParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__ModsAssignment_1_3"


    // $ANTLR start "rule__Modification__ModsAssignment_2_3"
    // InternalCSVParserGenerator.g:5132:1: rule__Modification__ModsAssignment_2_3 : ( ruleStatFunc ) ;
    public final void rule__Modification__ModsAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5136:1: ( ( ruleStatFunc ) )
            // InternalCSVParserGenerator.g:5137:2: ( ruleStatFunc )
            {
            // InternalCSVParserGenerator.g:5137:2: ( ruleStatFunc )
            // InternalCSVParserGenerator.g:5138:3: ruleStatFunc
            {
             before(grammarAccess.getModificationAccess().getModsStatFuncParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatFunc();

            state._fsp--;

             after(grammarAccess.getModificationAccess().getModsStatFuncParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__ModsAssignment_2_3"


    // $ANTLR start "rule__Modification__ModsAssignment_3_3"
    // InternalCSVParserGenerator.g:5147:1: rule__Modification__ModsAssignment_3_3 : ( ruleColumnAction ) ;
    public final void rule__Modification__ModsAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5151:1: ( ( ruleColumnAction ) )
            // InternalCSVParserGenerator.g:5152:2: ( ruleColumnAction )
            {
            // InternalCSVParserGenerator.g:5152:2: ( ruleColumnAction )
            // InternalCSVParserGenerator.g:5153:3: ruleColumnAction
            {
             before(grammarAccess.getModificationAccess().getModsColumnActionParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnAction();

            state._fsp--;

             after(grammarAccess.getModificationAccess().getModsColumnActionParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__ModsAssignment_3_3"


    // $ANTLR start "rule__Modification__ModsAssignment_4_3"
    // InternalCSVParserGenerator.g:5162:1: rule__Modification__ModsAssignment_4_3 : ( ruleConstraint ) ;
    public final void rule__Modification__ModsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5166:1: ( ( ruleConstraint ) )
            // InternalCSVParserGenerator.g:5167:2: ( ruleConstraint )
            {
            // InternalCSVParserGenerator.g:5167:2: ( ruleConstraint )
            // InternalCSVParserGenerator.g:5168:3: ruleConstraint
            {
             before(grammarAccess.getModificationAccess().getModsConstraintParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getModificationAccess().getModsConstraintParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Modification__ModsAssignment_4_3"


    // $ANTLR start "rule__Output__NameAssignment_2"
    // InternalCSVParserGenerator.g:5177:1: rule__Output__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5181:1: ( ( RULE_STRING ) )
            // InternalCSVParserGenerator.g:5182:2: ( RULE_STRING )
            {
            // InternalCSVParserGenerator.g:5182:2: ( RULE_STRING )
            // InternalCSVParserGenerator.g:5183:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__NameAssignment_2"


    // $ANTLR start "rule__Output__NumberAssignment_3_1"
    // InternalCSVParserGenerator.g:5192:1: rule__Output__NumberAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Output__NumberAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5196:1: ( ( RULE_INT ) )
            // InternalCSVParserGenerator.g:5197:2: ( RULE_INT )
            {
            // InternalCSVParserGenerator.g:5197:2: ( RULE_INT )
            // InternalCSVParserGenerator.g:5198:3: RULE_INT
            {
             before(grammarAccess.getOutputAccess().getNumberINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getNumberINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__NumberAssignment_3_1"


    // $ANTLR start "rule__ValueMod__NameAssignment_0"
    // InternalCSVParserGenerator.g:5207:1: rule__ValueMod__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ValueMod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5211:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:5212:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:5212:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5213:3: ( RULE_ID )
            {
             before(grammarAccess.getValueModAccess().getNameColDeclCrossReference_0_0()); 
            // InternalCSVParserGenerator.g:5214:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:5215:4: RULE_ID
            {
             before(grammarAccess.getValueModAccess().getNameColDeclIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueModAccess().getNameColDeclIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getValueModAccess().getNameColDeclCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueMod__NameAssignment_0"


    // $ANTLR start "rule__ValueMod__ExpAssignment_2"
    // InternalCSVParserGenerator.g:5226:1: rule__ValueMod__ExpAssignment_2 : ( ruleLogExp ) ;
    public final void rule__ValueMod__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5230:1: ( ( ruleLogExp ) )
            // InternalCSVParserGenerator.g:5231:2: ( ruleLogExp )
            {
            // InternalCSVParserGenerator.g:5231:2: ( ruleLogExp )
            // InternalCSVParserGenerator.g:5232:3: ruleLogExp
            {
             before(grammarAccess.getValueModAccess().getExpLogExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogExp();

            state._fsp--;

             after(grammarAccess.getValueModAccess().getExpLogExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValueMod__ExpAssignment_2"


    // $ANTLR start "rule__LogExp__RightAssignment_1_1"
    // InternalCSVParserGenerator.g:5241:1: rule__LogExp__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__LogExp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5245:1: ( ( ruleComparison ) )
            // InternalCSVParserGenerator.g:5246:2: ( ruleComparison )
            {
            // InternalCSVParserGenerator.g:5246:2: ( ruleComparison )
            // InternalCSVParserGenerator.g:5247:3: ruleComparison
            {
             before(grammarAccess.getLogExpAccess().getRightComparisonParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getLogExpAccess().getRightComparisonParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogExp__RightAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_1"
    // InternalCSVParserGenerator.g:5256:1: rule__Comparison__RightAssignment_1_1 : ( ruleSum ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5260:1: ( ( ruleSum ) )
            // InternalCSVParserGenerator.g:5261:2: ( ruleSum )
            {
            // InternalCSVParserGenerator.g:5261:2: ( ruleSum )
            // InternalCSVParserGenerator.g:5262:3: ruleSum
            {
             before(grammarAccess.getComparisonAccess().getRightSumParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSum();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightSumParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_1"


    // $ANTLR start "rule__Parens__ExpAssignment_1"
    // InternalCSVParserGenerator.g:5271:1: rule__Parens__ExpAssignment_1 : ( ruleLogExp ) ;
    public final void rule__Parens__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5275:1: ( ( ruleLogExp ) )
            // InternalCSVParserGenerator.g:5276:2: ( ruleLogExp )
            {
            // InternalCSVParserGenerator.g:5276:2: ( ruleLogExp )
            // InternalCSVParserGenerator.g:5277:3: ruleLogExp
            {
             before(grammarAccess.getParensAccess().getExpLogExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogExp();

            state._fsp--;

             after(grammarAccess.getParensAccess().getExpLogExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parens__ExpAssignment_1"


    // $ANTLR start "rule__External__NameAssignment_1"
    // InternalCSVParserGenerator.g:5286:1: rule__External__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__External__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5290:1: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5291:2: ( RULE_ID )
            {
            // InternalCSVParserGenerator.g:5291:2: ( RULE_ID )
            // InternalCSVParserGenerator.g:5292:3: RULE_ID
            {
             before(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__NameAssignment_1"


    // $ANTLR start "rule__External__InpAssignment_3"
    // InternalCSVParserGenerator.g:5301:1: rule__External__InpAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__External__InpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5305:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:5306:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:5306:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5307:3: ( RULE_ID )
            {
             before(grammarAccess.getExternalAccess().getInpColDeclCrossReference_3_0()); 
            // InternalCSVParserGenerator.g:5308:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:5309:4: RULE_ID
            {
             before(grammarAccess.getExternalAccess().getInpColDeclIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExternalAccess().getInpColDeclIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExternalAccess().getInpColDeclCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__External__InpAssignment_3"


    // $ANTLR start "rule__StatFunc__InputAssignment_0_3"
    // InternalCSVParserGenerator.g:5320:1: rule__StatFunc__InputAssignment_0_3 : ( ( RULE_ID ) ) ;
    public final void rule__StatFunc__InputAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5324:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:5325:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:5325:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5326:3: ( RULE_ID )
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_0_3_0()); 
            // InternalCSVParserGenerator.g:5327:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:5328:4: RULE_ID
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclIDTerminalRuleCall_0_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getInputColDeclIDTerminalRuleCall_0_3_0_1()); 

            }

             after(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__InputAssignment_0_3"


    // $ANTLR start "rule__StatFunc__InputAssignment_1_3"
    // InternalCSVParserGenerator.g:5339:1: rule__StatFunc__InputAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__StatFunc__InputAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5343:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:5344:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:5344:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5345:3: ( RULE_ID )
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_1_3_0()); 
            // InternalCSVParserGenerator.g:5346:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:5347:4: RULE_ID
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclIDTerminalRuleCall_1_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getInputColDeclIDTerminalRuleCall_1_3_0_1()); 

            }

             after(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__InputAssignment_1_3"


    // $ANTLR start "rule__StatFunc__InputAssignment_2_3"
    // InternalCSVParserGenerator.g:5358:1: rule__StatFunc__InputAssignment_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__StatFunc__InputAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5362:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:5363:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:5363:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5364:3: ( RULE_ID )
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_2_3_0()); 
            // InternalCSVParserGenerator.g:5365:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:5366:4: RULE_ID
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclIDTerminalRuleCall_2_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getInputColDeclIDTerminalRuleCall_2_3_0_1()); 

            }

             after(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__InputAssignment_2_3"


    // $ANTLR start "rule__StatFunc__InputAssignment_3_3"
    // InternalCSVParserGenerator.g:5377:1: rule__StatFunc__InputAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__StatFunc__InputAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5381:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:5382:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:5382:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5383:3: ( RULE_ID )
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_3_3_0()); 
            // InternalCSVParserGenerator.g:5384:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:5385:4: RULE_ID
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclIDTerminalRuleCall_3_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getInputColDeclIDTerminalRuleCall_3_3_0_1()); 

            }

             after(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__InputAssignment_3_3"


    // $ANTLR start "rule__StatFunc__InputAssignment_4_3"
    // InternalCSVParserGenerator.g:5396:1: rule__StatFunc__InputAssignment_4_3 : ( ( RULE_ID ) ) ;
    public final void rule__StatFunc__InputAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5400:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:5401:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:5401:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5402:3: ( RULE_ID )
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_4_3_0()); 
            // InternalCSVParserGenerator.g:5403:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:5404:4: RULE_ID
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclIDTerminalRuleCall_4_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStatFuncAccess().getInputColDeclIDTerminalRuleCall_4_3_0_1()); 

            }

             after(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatFunc__InputAssignment_4_3"


    // $ANTLR start "rule__ColumnAction__NameAssignment_0_2"
    // InternalCSVParserGenerator.g:5415:1: rule__ColumnAction__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__ColumnAction__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5419:1: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5420:2: ( RULE_ID )
            {
            // InternalCSVParserGenerator.g:5420:2: ( RULE_ID )
            // InternalCSVParserGenerator.g:5421:3: RULE_ID
            {
             before(grammarAccess.getColumnActionAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnActionAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__NameAssignment_0_2"


    // $ANTLR start "rule__ColumnAction__TypeAssignment_0_4"
    // InternalCSVParserGenerator.g:5430:1: rule__ColumnAction__TypeAssignment_0_4 : ( ruleType ) ;
    public final void rule__ColumnAction__TypeAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5434:1: ( ( ruleType ) )
            // InternalCSVParserGenerator.g:5435:2: ( ruleType )
            {
            // InternalCSVParserGenerator.g:5435:2: ( ruleType )
            // InternalCSVParserGenerator.g:5436:3: ruleType
            {
             before(grammarAccess.getColumnActionAccess().getTypeTypeParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getColumnActionAccess().getTypeTypeParserRuleCall_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__TypeAssignment_0_4"


    // $ANTLR start "rule__ColumnAction__ModAssignment_0_6"
    // InternalCSVParserGenerator.g:5445:1: rule__ColumnAction__ModAssignment_0_6 : ( ruleLogExp ) ;
    public final void rule__ColumnAction__ModAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5449:1: ( ( ruleLogExp ) )
            // InternalCSVParserGenerator.g:5450:2: ( ruleLogExp )
            {
            // InternalCSVParserGenerator.g:5450:2: ( ruleLogExp )
            // InternalCSVParserGenerator.g:5451:3: ruleLogExp
            {
             before(grammarAccess.getColumnActionAccess().getModLogExpParserRuleCall_0_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLogExp();

            state._fsp--;

             after(grammarAccess.getColumnActionAccess().getModLogExpParserRuleCall_0_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__ModAssignment_0_6"


    // $ANTLR start "rule__ColumnAction__NameAssignment_1_2"
    // InternalCSVParserGenerator.g:5460:1: rule__ColumnAction__NameAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ColumnAction__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5464:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:5465:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:5465:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5466:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnActionAccess().getNameColDeclCrossReference_1_2_0()); 
            // InternalCSVParserGenerator.g:5467:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:5468:4: RULE_ID
            {
             before(grammarAccess.getColumnActionAccess().getNameColDeclIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnActionAccess().getNameColDeclIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getColumnActionAccess().getNameColDeclCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnAction__NameAssignment_1_2"


    // $ANTLR start "rule__Sum__RightAssignment_1_1"
    // InternalCSVParserGenerator.g:5479:1: rule__Sum__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Sum__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5483:1: ( ( ruleFactor ) )
            // InternalCSVParserGenerator.g:5484:2: ( ruleFactor )
            {
            // InternalCSVParserGenerator.g:5484:2: ( ruleFactor )
            // InternalCSVParserGenerator.g:5485:3: ruleFactor
            {
             before(grammarAccess.getSumAccess().getRightFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getSumAccess().getRightFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sum__RightAssignment_1_1"


    // $ANTLR start "rule__Factor__RightAssignment_1_1"
    // InternalCSVParserGenerator.g:5494:1: rule__Factor__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5498:1: ( ( rulePrimary ) )
            // InternalCSVParserGenerator.g:5499:2: ( rulePrimary )
            {
            // InternalCSVParserGenerator.g:5499:2: ( rulePrimary )
            // InternalCSVParserGenerator.g:5500:3: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__RightAssignment_1_1"


    // $ANTLR start "rule__ColumnVar__NameAssignment"
    // InternalCSVParserGenerator.g:5509:1: rule__ColumnVar__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ColumnVar__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5513:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:5514:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:5514:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5515:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnVarAccess().getNameColDeclCrossReference_0()); 
            // InternalCSVParserGenerator.g:5516:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:5517:4: RULE_ID
            {
             before(grammarAccess.getColumnVarAccess().getNameColDeclIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnVarAccess().getNameColDeclIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getColumnVarAccess().getNameColDeclCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnVar__NameAssignment"


    // $ANTLR start "rule__Number__ValueAssignment_1"
    // InternalCSVParserGenerator.g:5528:1: rule__Number__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5532:1: ( ( RULE_INT ) )
            // InternalCSVParserGenerator.g:5533:2: ( RULE_INT )
            {
            // InternalCSVParserGenerator.g:5533:2: ( RULE_INT )
            // InternalCSVParserGenerator.g:5534:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment_1"


    // $ANTLR start "rule__Constraint__NameAssignment_1"
    // InternalCSVParserGenerator.g:5543:1: rule__Constraint__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5547:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:5548:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:5548:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:5549:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getNameColDeclCrossReference_1_0()); 
            // InternalCSVParserGenerator.g:5550:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:5551:4: RULE_ID
            {
             before(grammarAccess.getConstraintAccess().getNameColDeclIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstraintAccess().getNameColDeclIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConstraintAccess().getNameColDeclCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__NameAssignment_1"


    // $ANTLR start "rule__Constraint__ExpAssignment_3"
    // InternalCSVParserGenerator.g:5562:1: rule__Constraint__ExpAssignment_3 : ( ruleLogExp ) ;
    public final void rule__Constraint__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5566:1: ( ( ruleLogExp ) )
            // InternalCSVParserGenerator.g:5567:2: ( ruleLogExp )
            {
            // InternalCSVParserGenerator.g:5567:2: ( ruleLogExp )
            // InternalCSVParserGenerator.g:5568:3: ruleLogExp
            {
             before(grammarAccess.getConstraintAccess().getExpLogExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLogExp();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getExpLogExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constraint__ExpAssignment_3"


    // $ANTLR start "rule__DateLiteral__ValueAssignment_2"
    // InternalCSVParserGenerator.g:5577:1: rule__DateLiteral__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DateLiteral__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5581:1: ( ( RULE_STRING ) )
            // InternalCSVParserGenerator.g:5582:2: ( RULE_STRING )
            {
            // InternalCSVParserGenerator.g:5582:2: ( RULE_STRING )
            // InternalCSVParserGenerator.g:5583:3: RULE_STRING
            {
             before(grammarAccess.getDateLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDateLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateLiteral__ValueAssignment_2"


    // $ANTLR start "rule__StringLiteral__ValueAssignment_1"
    // InternalCSVParserGenerator.g:5592:1: rule__StringLiteral__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:5596:1: ( ( RULE_STRING ) )
            // InternalCSVParserGenerator.g:5597:2: ( RULE_STRING )
            {
            // InternalCSVParserGenerator.g:5597:2: ( RULE_STRING )
            // InternalCSVParserGenerator.g:5598:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00001F0000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00001F0000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000A00000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000A00000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040002000000070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00001F0000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0040000000000000L});

}