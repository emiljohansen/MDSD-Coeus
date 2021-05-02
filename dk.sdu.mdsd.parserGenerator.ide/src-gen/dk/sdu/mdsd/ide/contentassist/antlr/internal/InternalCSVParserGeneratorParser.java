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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'columns'", "'{'", "'}'", "'File'", "':'", "'Output'", "'='", "'String'", "'Integer'", "'Date'", "'Float'", "'||'", "'&&'", "'<'", "'>'", "'=='", "'!='", "'=<'", "'=>'", "'('", "')'", "'ExtFunc'", "'Max'", "'Min'", "'Std'", "'Sum'", "'Mean'", "'AddCol'", "'with'", "'RemCol'", "'+'", "'-'", "'*'", "'/'", "'satisfies'", "'constraint'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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


    // $ANTLR start "rule__Modification__Alternatives"
    // InternalCSVParserGenerator.g:527:1: rule__Modification__Alternatives : ( ( ruleValueMod ) | ( ruleExternal ) | ( ruleStatFunc ) | ( ruleColumnAction ) | ( ruleConstraint ) );
    public final void rule__Modification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:531:1: ( ( ruleValueMod ) | ( ruleExternal ) | ( ruleStatFunc ) | ( ruleColumnAction ) | ( ruleConstraint ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt1=1;
                }
                break;
            case 32:
                {
                alt1=2;
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt1=3;
                }
                break;
            case 38:
            case 40:
                {
                alt1=4;
                }
                break;
            case 45:
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
                    // InternalCSVParserGenerator.g:532:2: ( ruleValueMod )
                    {
                    // InternalCSVParserGenerator.g:532:2: ( ruleValueMod )
                    // InternalCSVParserGenerator.g:533:3: ruleValueMod
                    {
                     before(grammarAccess.getModificationAccess().getValueModParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleValueMod();

                    state._fsp--;

                     after(grammarAccess.getModificationAccess().getValueModParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:538:2: ( ruleExternal )
                    {
                    // InternalCSVParserGenerator.g:538:2: ( ruleExternal )
                    // InternalCSVParserGenerator.g:539:3: ruleExternal
                    {
                     before(grammarAccess.getModificationAccess().getExternalParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternal();

                    state._fsp--;

                     after(grammarAccess.getModificationAccess().getExternalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:544:2: ( ruleStatFunc )
                    {
                    // InternalCSVParserGenerator.g:544:2: ( ruleStatFunc )
                    // InternalCSVParserGenerator.g:545:3: ruleStatFunc
                    {
                     before(grammarAccess.getModificationAccess().getStatFuncParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStatFunc();

                    state._fsp--;

                     after(grammarAccess.getModificationAccess().getStatFuncParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:550:2: ( ruleColumnAction )
                    {
                    // InternalCSVParserGenerator.g:550:2: ( ruleColumnAction )
                    // InternalCSVParserGenerator.g:551:3: ruleColumnAction
                    {
                     before(grammarAccess.getModificationAccess().getColumnActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnAction();

                    state._fsp--;

                     after(grammarAccess.getModificationAccess().getColumnActionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCSVParserGenerator.g:556:2: ( ruleConstraint )
                    {
                    // InternalCSVParserGenerator.g:556:2: ( ruleConstraint )
                    // InternalCSVParserGenerator.g:557:3: ruleConstraint
                    {
                     before(grammarAccess.getModificationAccess().getConstraintParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleConstraint();

                    state._fsp--;

                     after(grammarAccess.getModificationAccess().getConstraintParserRuleCall_4()); 

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
    // InternalCSVParserGenerator.g:566:1: rule__Type__Alternatives : ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:570:1: ( ( ( rule__Type__Group_0__0 ) ) | ( ( rule__Type__Group_1__0 ) ) | ( ( rule__Type__Group_2__0 ) ) | ( ( rule__Type__Group_3__0 ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            case 21:
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
                    // InternalCSVParserGenerator.g:571:2: ( ( rule__Type__Group_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:571:2: ( ( rule__Type__Group_0__0 ) )
                    // InternalCSVParserGenerator.g:572:3: ( rule__Type__Group_0__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_0()); 
                    // InternalCSVParserGenerator.g:573:3: ( rule__Type__Group_0__0 )
                    // InternalCSVParserGenerator.g:573:4: rule__Type__Group_0__0
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
                    // InternalCSVParserGenerator.g:577:2: ( ( rule__Type__Group_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:577:2: ( ( rule__Type__Group_1__0 ) )
                    // InternalCSVParserGenerator.g:578:3: ( rule__Type__Group_1__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_1()); 
                    // InternalCSVParserGenerator.g:579:3: ( rule__Type__Group_1__0 )
                    // InternalCSVParserGenerator.g:579:4: rule__Type__Group_1__0
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
                    // InternalCSVParserGenerator.g:583:2: ( ( rule__Type__Group_2__0 ) )
                    {
                    // InternalCSVParserGenerator.g:583:2: ( ( rule__Type__Group_2__0 ) )
                    // InternalCSVParserGenerator.g:584:3: ( rule__Type__Group_2__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_2()); 
                    // InternalCSVParserGenerator.g:585:3: ( rule__Type__Group_2__0 )
                    // InternalCSVParserGenerator.g:585:4: rule__Type__Group_2__0
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
                    // InternalCSVParserGenerator.g:589:2: ( ( rule__Type__Group_3__0 ) )
                    {
                    // InternalCSVParserGenerator.g:589:2: ( ( rule__Type__Group_3__0 ) )
                    // InternalCSVParserGenerator.g:590:3: ( rule__Type__Group_3__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_3()); 
                    // InternalCSVParserGenerator.g:591:3: ( rule__Type__Group_3__0 )
                    // InternalCSVParserGenerator.g:591:4: rule__Type__Group_3__0
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
    // InternalCSVParserGenerator.g:599:1: rule__LogExp__Alternatives_1_0 : ( ( ( rule__LogExp__Group_1_0_0__0 ) ) | ( ( rule__LogExp__Group_1_0_1__0 ) ) );
    public final void rule__LogExp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:603:1: ( ( ( rule__LogExp__Group_1_0_0__0 ) ) | ( ( rule__LogExp__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==23) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCSVParserGenerator.g:604:2: ( ( rule__LogExp__Group_1_0_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:604:2: ( ( rule__LogExp__Group_1_0_0__0 ) )
                    // InternalCSVParserGenerator.g:605:3: ( rule__LogExp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getLogExpAccess().getGroup_1_0_0()); 
                    // InternalCSVParserGenerator.g:606:3: ( rule__LogExp__Group_1_0_0__0 )
                    // InternalCSVParserGenerator.g:606:4: rule__LogExp__Group_1_0_0__0
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
                    // InternalCSVParserGenerator.g:610:2: ( ( rule__LogExp__Group_1_0_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:610:2: ( ( rule__LogExp__Group_1_0_1__0 ) )
                    // InternalCSVParserGenerator.g:611:3: ( rule__LogExp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getLogExpAccess().getGroup_1_0_1()); 
                    // InternalCSVParserGenerator.g:612:3: ( rule__LogExp__Group_1_0_1__0 )
                    // InternalCSVParserGenerator.g:612:4: rule__LogExp__Group_1_0_1__0
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
    // InternalCSVParserGenerator.g:620:1: rule__Comparison__Alternatives_1_0 : ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) | ( ( rule__Comparison__Group_1_0_5__0 ) ) );
    public final void rule__Comparison__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:624:1: ( ( ( rule__Comparison__Group_1_0_0__0 ) ) | ( ( rule__Comparison__Group_1_0_1__0 ) ) | ( ( rule__Comparison__Group_1_0_2__0 ) ) | ( ( rule__Comparison__Group_1_0_3__0 ) ) | ( ( rule__Comparison__Group_1_0_4__0 ) ) | ( ( rule__Comparison__Group_1_0_5__0 ) ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 26:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            case 28:
                {
                alt4=5;
                }
                break;
            case 29:
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
                    // InternalCSVParserGenerator.g:625:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:625:2: ( ( rule__Comparison__Group_1_0_0__0 ) )
                    // InternalCSVParserGenerator.g:626:3: ( rule__Comparison__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_0()); 
                    // InternalCSVParserGenerator.g:627:3: ( rule__Comparison__Group_1_0_0__0 )
                    // InternalCSVParserGenerator.g:627:4: rule__Comparison__Group_1_0_0__0
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
                    // InternalCSVParserGenerator.g:631:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:631:2: ( ( rule__Comparison__Group_1_0_1__0 ) )
                    // InternalCSVParserGenerator.g:632:3: ( rule__Comparison__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_1()); 
                    // InternalCSVParserGenerator.g:633:3: ( rule__Comparison__Group_1_0_1__0 )
                    // InternalCSVParserGenerator.g:633:4: rule__Comparison__Group_1_0_1__0
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
                    // InternalCSVParserGenerator.g:637:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    {
                    // InternalCSVParserGenerator.g:637:2: ( ( rule__Comparison__Group_1_0_2__0 ) )
                    // InternalCSVParserGenerator.g:638:3: ( rule__Comparison__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_2()); 
                    // InternalCSVParserGenerator.g:639:3: ( rule__Comparison__Group_1_0_2__0 )
                    // InternalCSVParserGenerator.g:639:4: rule__Comparison__Group_1_0_2__0
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
                    // InternalCSVParserGenerator.g:643:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    {
                    // InternalCSVParserGenerator.g:643:2: ( ( rule__Comparison__Group_1_0_3__0 ) )
                    // InternalCSVParserGenerator.g:644:3: ( rule__Comparison__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_3()); 
                    // InternalCSVParserGenerator.g:645:3: ( rule__Comparison__Group_1_0_3__0 )
                    // InternalCSVParserGenerator.g:645:4: rule__Comparison__Group_1_0_3__0
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
                    // InternalCSVParserGenerator.g:649:2: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    {
                    // InternalCSVParserGenerator.g:649:2: ( ( rule__Comparison__Group_1_0_4__0 ) )
                    // InternalCSVParserGenerator.g:650:3: ( rule__Comparison__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_4()); 
                    // InternalCSVParserGenerator.g:651:3: ( rule__Comparison__Group_1_0_4__0 )
                    // InternalCSVParserGenerator.g:651:4: rule__Comparison__Group_1_0_4__0
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
                    // InternalCSVParserGenerator.g:655:2: ( ( rule__Comparison__Group_1_0_5__0 ) )
                    {
                    // InternalCSVParserGenerator.g:655:2: ( ( rule__Comparison__Group_1_0_5__0 ) )
                    // InternalCSVParserGenerator.g:656:3: ( rule__Comparison__Group_1_0_5__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0_5()); 
                    // InternalCSVParserGenerator.g:657:3: ( rule__Comparison__Group_1_0_5__0 )
                    // InternalCSVParserGenerator.g:657:4: rule__Comparison__Group_1_0_5__0
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
    // InternalCSVParserGenerator.g:665:1: rule__StatFunc__Alternatives : ( ( ( rule__StatFunc__Group_0__0 ) ) | ( ( rule__StatFunc__Group_1__0 ) ) | ( ( rule__StatFunc__Group_2__0 ) ) | ( ( rule__StatFunc__Group_3__0 ) ) | ( ( rule__StatFunc__Group_4__0 ) ) );
    public final void rule__StatFunc__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:669:1: ( ( ( rule__StatFunc__Group_0__0 ) ) | ( ( rule__StatFunc__Group_1__0 ) ) | ( ( rule__StatFunc__Group_2__0 ) ) | ( ( rule__StatFunc__Group_3__0 ) ) | ( ( rule__StatFunc__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt5=1;
                }
                break;
            case 34:
                {
                alt5=2;
                }
                break;
            case 35:
                {
                alt5=3;
                }
                break;
            case 36:
                {
                alt5=4;
                }
                break;
            case 37:
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
                    // InternalCSVParserGenerator.g:670:2: ( ( rule__StatFunc__Group_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:670:2: ( ( rule__StatFunc__Group_0__0 ) )
                    // InternalCSVParserGenerator.g:671:3: ( rule__StatFunc__Group_0__0 )
                    {
                     before(grammarAccess.getStatFuncAccess().getGroup_0()); 
                    // InternalCSVParserGenerator.g:672:3: ( rule__StatFunc__Group_0__0 )
                    // InternalCSVParserGenerator.g:672:4: rule__StatFunc__Group_0__0
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
                    // InternalCSVParserGenerator.g:676:2: ( ( rule__StatFunc__Group_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:676:2: ( ( rule__StatFunc__Group_1__0 ) )
                    // InternalCSVParserGenerator.g:677:3: ( rule__StatFunc__Group_1__0 )
                    {
                     before(grammarAccess.getStatFuncAccess().getGroup_1()); 
                    // InternalCSVParserGenerator.g:678:3: ( rule__StatFunc__Group_1__0 )
                    // InternalCSVParserGenerator.g:678:4: rule__StatFunc__Group_1__0
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
                    // InternalCSVParserGenerator.g:682:2: ( ( rule__StatFunc__Group_2__0 ) )
                    {
                    // InternalCSVParserGenerator.g:682:2: ( ( rule__StatFunc__Group_2__0 ) )
                    // InternalCSVParserGenerator.g:683:3: ( rule__StatFunc__Group_2__0 )
                    {
                     before(grammarAccess.getStatFuncAccess().getGroup_2()); 
                    // InternalCSVParserGenerator.g:684:3: ( rule__StatFunc__Group_2__0 )
                    // InternalCSVParserGenerator.g:684:4: rule__StatFunc__Group_2__0
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
                    // InternalCSVParserGenerator.g:688:2: ( ( rule__StatFunc__Group_3__0 ) )
                    {
                    // InternalCSVParserGenerator.g:688:2: ( ( rule__StatFunc__Group_3__0 ) )
                    // InternalCSVParserGenerator.g:689:3: ( rule__StatFunc__Group_3__0 )
                    {
                     before(grammarAccess.getStatFuncAccess().getGroup_3()); 
                    // InternalCSVParserGenerator.g:690:3: ( rule__StatFunc__Group_3__0 )
                    // InternalCSVParserGenerator.g:690:4: rule__StatFunc__Group_3__0
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
                    // InternalCSVParserGenerator.g:694:2: ( ( rule__StatFunc__Group_4__0 ) )
                    {
                    // InternalCSVParserGenerator.g:694:2: ( ( rule__StatFunc__Group_4__0 ) )
                    // InternalCSVParserGenerator.g:695:3: ( rule__StatFunc__Group_4__0 )
                    {
                     before(grammarAccess.getStatFuncAccess().getGroup_4()); 
                    // InternalCSVParserGenerator.g:696:3: ( rule__StatFunc__Group_4__0 )
                    // InternalCSVParserGenerator.g:696:4: rule__StatFunc__Group_4__0
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
    // InternalCSVParserGenerator.g:704:1: rule__ColumnAction__Alternatives : ( ( ( rule__ColumnAction__Group_0__0 ) ) | ( ( rule__ColumnAction__Group_1__0 ) ) );
    public final void rule__ColumnAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:708:1: ( ( ( rule__ColumnAction__Group_0__0 ) ) | ( ( rule__ColumnAction__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==38) ) {
                alt6=1;
            }
            else if ( (LA6_0==40) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCSVParserGenerator.g:709:2: ( ( rule__ColumnAction__Group_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:709:2: ( ( rule__ColumnAction__Group_0__0 ) )
                    // InternalCSVParserGenerator.g:710:3: ( rule__ColumnAction__Group_0__0 )
                    {
                     before(grammarAccess.getColumnActionAccess().getGroup_0()); 
                    // InternalCSVParserGenerator.g:711:3: ( rule__ColumnAction__Group_0__0 )
                    // InternalCSVParserGenerator.g:711:4: rule__ColumnAction__Group_0__0
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
                    // InternalCSVParserGenerator.g:715:2: ( ( rule__ColumnAction__Group_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:715:2: ( ( rule__ColumnAction__Group_1__0 ) )
                    // InternalCSVParserGenerator.g:716:3: ( rule__ColumnAction__Group_1__0 )
                    {
                     before(grammarAccess.getColumnActionAccess().getGroup_1()); 
                    // InternalCSVParserGenerator.g:717:3: ( rule__ColumnAction__Group_1__0 )
                    // InternalCSVParserGenerator.g:717:4: rule__ColumnAction__Group_1__0
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
    // InternalCSVParserGenerator.g:725:1: rule__Sum__Alternatives_1_0 : ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) );
    public final void rule__Sum__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:729:1: ( ( ( rule__Sum__Group_1_0_0__0 ) ) | ( ( rule__Sum__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==41) ) {
                alt7=1;
            }
            else if ( (LA7_0==42) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCSVParserGenerator.g:730:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:730:2: ( ( rule__Sum__Group_1_0_0__0 ) )
                    // InternalCSVParserGenerator.g:731:3: ( rule__Sum__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_0()); 
                    // InternalCSVParserGenerator.g:732:3: ( rule__Sum__Group_1_0_0__0 )
                    // InternalCSVParserGenerator.g:732:4: rule__Sum__Group_1_0_0__0
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
                    // InternalCSVParserGenerator.g:736:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:736:2: ( ( rule__Sum__Group_1_0_1__0 ) )
                    // InternalCSVParserGenerator.g:737:3: ( rule__Sum__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getSumAccess().getGroup_1_0_1()); 
                    // InternalCSVParserGenerator.g:738:3: ( rule__Sum__Group_1_0_1__0 )
                    // InternalCSVParserGenerator.g:738:4: rule__Sum__Group_1_0_1__0
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
    // InternalCSVParserGenerator.g:746:1: rule__Factor__Alternatives_1_0 : ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) );
    public final void rule__Factor__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:750:1: ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==43) ) {
                alt8=1;
            }
            else if ( (LA8_0==44) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalCSVParserGenerator.g:751:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    {
                    // InternalCSVParserGenerator.g:751:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    // InternalCSVParserGenerator.g:752:3: ( rule__Factor__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_0()); 
                    // InternalCSVParserGenerator.g:753:3: ( rule__Factor__Group_1_0_0__0 )
                    // InternalCSVParserGenerator.g:753:4: rule__Factor__Group_1_0_0__0
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
                    // InternalCSVParserGenerator.g:757:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    {
                    // InternalCSVParserGenerator.g:757:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    // InternalCSVParserGenerator.g:758:3: ( rule__Factor__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_1()); 
                    // InternalCSVParserGenerator.g:759:3: ( rule__Factor__Group_1_0_1__0 )
                    // InternalCSVParserGenerator.g:759:4: rule__Factor__Group_1_0_1__0
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
    // InternalCSVParserGenerator.g:767:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParens ) | ( ruleColumnVar ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:771:1: ( ( ruleNumber ) | ( ruleParens ) | ( ruleColumnVar ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalCSVParserGenerator.g:772:2: ( ruleNumber )
                    {
                    // InternalCSVParserGenerator.g:772:2: ( ruleNumber )
                    // InternalCSVParserGenerator.g:773:3: ruleNumber
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
                    // InternalCSVParserGenerator.g:778:2: ( ruleParens )
                    {
                    // InternalCSVParserGenerator.g:778:2: ( ruleParens )
                    // InternalCSVParserGenerator.g:779:3: ruleParens
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
                    // InternalCSVParserGenerator.g:784:2: ( ruleColumnVar )
                    {
                    // InternalCSVParserGenerator.g:784:2: ( ruleColumnVar )
                    // InternalCSVParserGenerator.g:785:3: ruleColumnVar
                    {
                     before(grammarAccess.getPrimaryAccess().getColumnVarParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnVar();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getColumnVarParserRuleCall_2()); 

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
    // InternalCSVParserGenerator.g:794:1: rule__Parser__Group__0 : rule__Parser__Group__0__Impl rule__Parser__Group__1 ;
    public final void rule__Parser__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:798:1: ( rule__Parser__Group__0__Impl rule__Parser__Group__1 )
            // InternalCSVParserGenerator.g:799:2: rule__Parser__Group__0__Impl rule__Parser__Group__1
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
    // InternalCSVParserGenerator.g:806:1: rule__Parser__Group__0__Impl : ( ( rule__Parser__FileAssignment_0 ) ) ;
    public final void rule__Parser__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:810:1: ( ( ( rule__Parser__FileAssignment_0 ) ) )
            // InternalCSVParserGenerator.g:811:1: ( ( rule__Parser__FileAssignment_0 ) )
            {
            // InternalCSVParserGenerator.g:811:1: ( ( rule__Parser__FileAssignment_0 ) )
            // InternalCSVParserGenerator.g:812:2: ( rule__Parser__FileAssignment_0 )
            {
             before(grammarAccess.getParserAccess().getFileAssignment_0()); 
            // InternalCSVParserGenerator.g:813:2: ( rule__Parser__FileAssignment_0 )
            // InternalCSVParserGenerator.g:813:3: rule__Parser__FileAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parser__FileAssignment_0();

            state._fsp--;


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
    // InternalCSVParserGenerator.g:821:1: rule__Parser__Group__1 : rule__Parser__Group__1__Impl rule__Parser__Group__2 ;
    public final void rule__Parser__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:825:1: ( rule__Parser__Group__1__Impl rule__Parser__Group__2 )
            // InternalCSVParserGenerator.g:826:2: rule__Parser__Group__1__Impl rule__Parser__Group__2
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
    // InternalCSVParserGenerator.g:833:1: rule__Parser__Group__1__Impl : ( 'columns' ) ;
    public final void rule__Parser__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:837:1: ( ( 'columns' ) )
            // InternalCSVParserGenerator.g:838:1: ( 'columns' )
            {
            // InternalCSVParserGenerator.g:838:1: ( 'columns' )
            // InternalCSVParserGenerator.g:839:2: 'columns'
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
    // InternalCSVParserGenerator.g:848:1: rule__Parser__Group__2 : rule__Parser__Group__2__Impl rule__Parser__Group__3 ;
    public final void rule__Parser__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:852:1: ( rule__Parser__Group__2__Impl rule__Parser__Group__3 )
            // InternalCSVParserGenerator.g:853:2: rule__Parser__Group__2__Impl rule__Parser__Group__3
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
    // InternalCSVParserGenerator.g:860:1: rule__Parser__Group__2__Impl : ( '{' ) ;
    public final void rule__Parser__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:864:1: ( ( '{' ) )
            // InternalCSVParserGenerator.g:865:1: ( '{' )
            {
            // InternalCSVParserGenerator.g:865:1: ( '{' )
            // InternalCSVParserGenerator.g:866:2: '{'
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
    // InternalCSVParserGenerator.g:875:1: rule__Parser__Group__3 : rule__Parser__Group__3__Impl rule__Parser__Group__4 ;
    public final void rule__Parser__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:879:1: ( rule__Parser__Group__3__Impl rule__Parser__Group__4 )
            // InternalCSVParserGenerator.g:880:2: rule__Parser__Group__3__Impl rule__Parser__Group__4
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
    // InternalCSVParserGenerator.g:887:1: rule__Parser__Group__3__Impl : ( ( ( rule__Parser__ColumnsAssignment_3 ) ) ( ( rule__Parser__ColumnsAssignment_3 )* ) ) ;
    public final void rule__Parser__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:891:1: ( ( ( ( rule__Parser__ColumnsAssignment_3 ) ) ( ( rule__Parser__ColumnsAssignment_3 )* ) ) )
            // InternalCSVParserGenerator.g:892:1: ( ( ( rule__Parser__ColumnsAssignment_3 ) ) ( ( rule__Parser__ColumnsAssignment_3 )* ) )
            {
            // InternalCSVParserGenerator.g:892:1: ( ( ( rule__Parser__ColumnsAssignment_3 ) ) ( ( rule__Parser__ColumnsAssignment_3 )* ) )
            // InternalCSVParserGenerator.g:893:2: ( ( rule__Parser__ColumnsAssignment_3 ) ) ( ( rule__Parser__ColumnsAssignment_3 )* )
            {
            // InternalCSVParserGenerator.g:893:2: ( ( rule__Parser__ColumnsAssignment_3 ) )
            // InternalCSVParserGenerator.g:894:3: ( rule__Parser__ColumnsAssignment_3 )
            {
             before(grammarAccess.getParserAccess().getColumnsAssignment_3()); 
            // InternalCSVParserGenerator.g:895:3: ( rule__Parser__ColumnsAssignment_3 )
            // InternalCSVParserGenerator.g:895:4: rule__Parser__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Parser__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParserAccess().getColumnsAssignment_3()); 

            }

            // InternalCSVParserGenerator.g:898:2: ( ( rule__Parser__ColumnsAssignment_3 )* )
            // InternalCSVParserGenerator.g:899:3: ( rule__Parser__ColumnsAssignment_3 )*
            {
             before(grammarAccess.getParserAccess().getColumnsAssignment_3()); 
            // InternalCSVParserGenerator.g:900:3: ( rule__Parser__ColumnsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:900:4: rule__Parser__ColumnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Parser__ColumnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalCSVParserGenerator.g:909:1: rule__Parser__Group__4 : rule__Parser__Group__4__Impl rule__Parser__Group__5 ;
    public final void rule__Parser__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:913:1: ( rule__Parser__Group__4__Impl rule__Parser__Group__5 )
            // InternalCSVParserGenerator.g:914:2: rule__Parser__Group__4__Impl rule__Parser__Group__5
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
    // InternalCSVParserGenerator.g:921:1: rule__Parser__Group__4__Impl : ( '}' ) ;
    public final void rule__Parser__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:925:1: ( ( '}' ) )
            // InternalCSVParserGenerator.g:926:1: ( '}' )
            {
            // InternalCSVParserGenerator.g:926:1: ( '}' )
            // InternalCSVParserGenerator.g:927:2: '}'
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
    // InternalCSVParserGenerator.g:936:1: rule__Parser__Group__5 : rule__Parser__Group__5__Impl rule__Parser__Group__6 ;
    public final void rule__Parser__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:940:1: ( rule__Parser__Group__5__Impl rule__Parser__Group__6 )
            // InternalCSVParserGenerator.g:941:2: rule__Parser__Group__5__Impl rule__Parser__Group__6
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
    // InternalCSVParserGenerator.g:948:1: rule__Parser__Group__5__Impl : ( ( rule__Parser__ModsAssignment_5 )* ) ;
    public final void rule__Parser__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:952:1: ( ( ( rule__Parser__ModsAssignment_5 )* ) )
            // InternalCSVParserGenerator.g:953:1: ( ( rule__Parser__ModsAssignment_5 )* )
            {
            // InternalCSVParserGenerator.g:953:1: ( ( rule__Parser__ModsAssignment_5 )* )
            // InternalCSVParserGenerator.g:954:2: ( rule__Parser__ModsAssignment_5 )*
            {
             before(grammarAccess.getParserAccess().getModsAssignment_5()); 
            // InternalCSVParserGenerator.g:955:2: ( rule__Parser__ModsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||(LA11_0>=32 && LA11_0<=38)||LA11_0==40||LA11_0==45) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:955:3: rule__Parser__ModsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Parser__ModsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalCSVParserGenerator.g:963:1: rule__Parser__Group__6 : rule__Parser__Group__6__Impl ;
    public final void rule__Parser__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:967:1: ( rule__Parser__Group__6__Impl )
            // InternalCSVParserGenerator.g:968:2: rule__Parser__Group__6__Impl
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
    // InternalCSVParserGenerator.g:974:1: rule__Parser__Group__6__Impl : ( ( rule__Parser__OutAssignment_6 )? ) ;
    public final void rule__Parser__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:978:1: ( ( ( rule__Parser__OutAssignment_6 )? ) )
            // InternalCSVParserGenerator.g:979:1: ( ( rule__Parser__OutAssignment_6 )? )
            {
            // InternalCSVParserGenerator.g:979:1: ( ( rule__Parser__OutAssignment_6 )? )
            // InternalCSVParserGenerator.g:980:2: ( rule__Parser__OutAssignment_6 )?
            {
             before(grammarAccess.getParserAccess().getOutAssignment_6()); 
            // InternalCSVParserGenerator.g:981:2: ( rule__Parser__OutAssignment_6 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCSVParserGenerator.g:981:3: rule__Parser__OutAssignment_6
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
    // InternalCSVParserGenerator.g:990:1: rule__FileDecl__Group__0 : rule__FileDecl__Group__0__Impl rule__FileDecl__Group__1 ;
    public final void rule__FileDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:994:1: ( rule__FileDecl__Group__0__Impl rule__FileDecl__Group__1 )
            // InternalCSVParserGenerator.g:995:2: rule__FileDecl__Group__0__Impl rule__FileDecl__Group__1
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
    // InternalCSVParserGenerator.g:1002:1: rule__FileDecl__Group__0__Impl : ( 'File' ) ;
    public final void rule__FileDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1006:1: ( ( 'File' ) )
            // InternalCSVParserGenerator.g:1007:1: ( 'File' )
            {
            // InternalCSVParserGenerator.g:1007:1: ( 'File' )
            // InternalCSVParserGenerator.g:1008:2: 'File'
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
    // InternalCSVParserGenerator.g:1017:1: rule__FileDecl__Group__1 : rule__FileDecl__Group__1__Impl rule__FileDecl__Group__2 ;
    public final void rule__FileDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1021:1: ( rule__FileDecl__Group__1__Impl rule__FileDecl__Group__2 )
            // InternalCSVParserGenerator.g:1022:2: rule__FileDecl__Group__1__Impl rule__FileDecl__Group__2
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
    // InternalCSVParserGenerator.g:1029:1: rule__FileDecl__Group__1__Impl : ( ':' ) ;
    public final void rule__FileDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1033:1: ( ( ':' ) )
            // InternalCSVParserGenerator.g:1034:1: ( ':' )
            {
            // InternalCSVParserGenerator.g:1034:1: ( ':' )
            // InternalCSVParserGenerator.g:1035:2: ':'
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
    // InternalCSVParserGenerator.g:1044:1: rule__FileDecl__Group__2 : rule__FileDecl__Group__2__Impl ;
    public final void rule__FileDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1048:1: ( rule__FileDecl__Group__2__Impl )
            // InternalCSVParserGenerator.g:1049:2: rule__FileDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileDecl__Group__2__Impl();

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
    // InternalCSVParserGenerator.g:1055:1: rule__FileDecl__Group__2__Impl : ( ( rule__FileDecl__NameAssignment_2 ) ) ;
    public final void rule__FileDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1059:1: ( ( ( rule__FileDecl__NameAssignment_2 ) ) )
            // InternalCSVParserGenerator.g:1060:1: ( ( rule__FileDecl__NameAssignment_2 ) )
            {
            // InternalCSVParserGenerator.g:1060:1: ( ( rule__FileDecl__NameAssignment_2 ) )
            // InternalCSVParserGenerator.g:1061:2: ( rule__FileDecl__NameAssignment_2 )
            {
             before(grammarAccess.getFileDeclAccess().getNameAssignment_2()); 
            // InternalCSVParserGenerator.g:1062:2: ( rule__FileDecl__NameAssignment_2 )
            // InternalCSVParserGenerator.g:1062:3: rule__FileDecl__NameAssignment_2
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


    // $ANTLR start "rule__ColDecl__Group__0"
    // InternalCSVParserGenerator.g:1071:1: rule__ColDecl__Group__0 : rule__ColDecl__Group__0__Impl rule__ColDecl__Group__1 ;
    public final void rule__ColDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1075:1: ( rule__ColDecl__Group__0__Impl rule__ColDecl__Group__1 )
            // InternalCSVParserGenerator.g:1076:2: rule__ColDecl__Group__0__Impl rule__ColDecl__Group__1
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
    // InternalCSVParserGenerator.g:1083:1: rule__ColDecl__Group__0__Impl : ( ( rule__ColDecl__NameAssignment_0 ) ) ;
    public final void rule__ColDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1087:1: ( ( ( rule__ColDecl__NameAssignment_0 ) ) )
            // InternalCSVParserGenerator.g:1088:1: ( ( rule__ColDecl__NameAssignment_0 ) )
            {
            // InternalCSVParserGenerator.g:1088:1: ( ( rule__ColDecl__NameAssignment_0 ) )
            // InternalCSVParserGenerator.g:1089:2: ( rule__ColDecl__NameAssignment_0 )
            {
             before(grammarAccess.getColDeclAccess().getNameAssignment_0()); 
            // InternalCSVParserGenerator.g:1090:2: ( rule__ColDecl__NameAssignment_0 )
            // InternalCSVParserGenerator.g:1090:3: rule__ColDecl__NameAssignment_0
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
    // InternalCSVParserGenerator.g:1098:1: rule__ColDecl__Group__1 : rule__ColDecl__Group__1__Impl rule__ColDecl__Group__2 ;
    public final void rule__ColDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1102:1: ( rule__ColDecl__Group__1__Impl rule__ColDecl__Group__2 )
            // InternalCSVParserGenerator.g:1103:2: rule__ColDecl__Group__1__Impl rule__ColDecl__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalCSVParserGenerator.g:1110:1: rule__ColDecl__Group__1__Impl : ( ':' ) ;
    public final void rule__ColDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1114:1: ( ( ':' ) )
            // InternalCSVParserGenerator.g:1115:1: ( ':' )
            {
            // InternalCSVParserGenerator.g:1115:1: ( ':' )
            // InternalCSVParserGenerator.g:1116:2: ':'
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
    // InternalCSVParserGenerator.g:1125:1: rule__ColDecl__Group__2 : rule__ColDecl__Group__2__Impl rule__ColDecl__Group__3 ;
    public final void rule__ColDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1129:1: ( rule__ColDecl__Group__2__Impl rule__ColDecl__Group__3 )
            // InternalCSVParserGenerator.g:1130:2: rule__ColDecl__Group__2__Impl rule__ColDecl__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalCSVParserGenerator.g:1137:1: rule__ColDecl__Group__2__Impl : ( ( rule__ColDecl__TypeAssignment_2 ) ) ;
    public final void rule__ColDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1141:1: ( ( ( rule__ColDecl__TypeAssignment_2 ) ) )
            // InternalCSVParserGenerator.g:1142:1: ( ( rule__ColDecl__TypeAssignment_2 ) )
            {
            // InternalCSVParserGenerator.g:1142:1: ( ( rule__ColDecl__TypeAssignment_2 ) )
            // InternalCSVParserGenerator.g:1143:2: ( rule__ColDecl__TypeAssignment_2 )
            {
             before(grammarAccess.getColDeclAccess().getTypeAssignment_2()); 
            // InternalCSVParserGenerator.g:1144:2: ( rule__ColDecl__TypeAssignment_2 )
            // InternalCSVParserGenerator.g:1144:3: rule__ColDecl__TypeAssignment_2
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
    // InternalCSVParserGenerator.g:1152:1: rule__ColDecl__Group__3 : rule__ColDecl__Group__3__Impl ;
    public final void rule__ColDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1156:1: ( rule__ColDecl__Group__3__Impl )
            // InternalCSVParserGenerator.g:1157:2: rule__ColDecl__Group__3__Impl
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
    // InternalCSVParserGenerator.g:1163:1: rule__ColDecl__Group__3__Impl : ( ( rule__ColDecl__ModsAssignment_3 )* ) ;
    public final void rule__ColDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1167:1: ( ( ( rule__ColDecl__ModsAssignment_3 )* ) )
            // InternalCSVParserGenerator.g:1168:1: ( ( rule__ColDecl__ModsAssignment_3 )* )
            {
            // InternalCSVParserGenerator.g:1168:1: ( ( rule__ColDecl__ModsAssignment_3 )* )
            // InternalCSVParserGenerator.g:1169:2: ( rule__ColDecl__ModsAssignment_3 )*
            {
             before(grammarAccess.getColDeclAccess().getModsAssignment_3()); 
            // InternalCSVParserGenerator.g:1170:2: ( rule__ColDecl__ModsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==17) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>=32 && LA13_0<=38)||LA13_0==40||LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1170:3: rule__ColDecl__ModsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ColDecl__ModsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "rule__Output__Group__0"
    // InternalCSVParserGenerator.g:1179:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1183:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalCSVParserGenerator.g:1184:2: rule__Output__Group__0__Impl rule__Output__Group__1
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
    // InternalCSVParserGenerator.g:1191:1: rule__Output__Group__0__Impl : ( 'Output' ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1195:1: ( ( 'Output' ) )
            // InternalCSVParserGenerator.g:1196:1: ( 'Output' )
            {
            // InternalCSVParserGenerator.g:1196:1: ( 'Output' )
            // InternalCSVParserGenerator.g:1197:2: 'Output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:1206:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1210:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalCSVParserGenerator.g:1211:2: rule__Output__Group__1__Impl rule__Output__Group__2
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
    // InternalCSVParserGenerator.g:1218:1: rule__Output__Group__1__Impl : ( ':' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1222:1: ( ( ':' ) )
            // InternalCSVParserGenerator.g:1223:1: ( ':' )
            {
            // InternalCSVParserGenerator.g:1223:1: ( ':' )
            // InternalCSVParserGenerator.g:1224:2: ':'
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
    // InternalCSVParserGenerator.g:1233:1: rule__Output__Group__2 : rule__Output__Group__2__Impl ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1237:1: ( rule__Output__Group__2__Impl )
            // InternalCSVParserGenerator.g:1238:2: rule__Output__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__2__Impl();

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
    // InternalCSVParserGenerator.g:1244:1: rule__Output__Group__2__Impl : ( ( rule__Output__NameAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1248:1: ( ( ( rule__Output__NameAssignment_2 ) ) )
            // InternalCSVParserGenerator.g:1249:1: ( ( rule__Output__NameAssignment_2 ) )
            {
            // InternalCSVParserGenerator.g:1249:1: ( ( rule__Output__NameAssignment_2 ) )
            // InternalCSVParserGenerator.g:1250:2: ( rule__Output__NameAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getNameAssignment_2()); 
            // InternalCSVParserGenerator.g:1251:2: ( rule__Output__NameAssignment_2 )
            // InternalCSVParserGenerator.g:1251:3: rule__Output__NameAssignment_2
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


    // $ANTLR start "rule__ValueMod__Group__0"
    // InternalCSVParserGenerator.g:1260:1: rule__ValueMod__Group__0 : rule__ValueMod__Group__0__Impl rule__ValueMod__Group__1 ;
    public final void rule__ValueMod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1264:1: ( rule__ValueMod__Group__0__Impl rule__ValueMod__Group__1 )
            // InternalCSVParserGenerator.g:1265:2: rule__ValueMod__Group__0__Impl rule__ValueMod__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalCSVParserGenerator.g:1272:1: rule__ValueMod__Group__0__Impl : ( ( rule__ValueMod__NameAssignment_0 ) ) ;
    public final void rule__ValueMod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1276:1: ( ( ( rule__ValueMod__NameAssignment_0 ) ) )
            // InternalCSVParserGenerator.g:1277:1: ( ( rule__ValueMod__NameAssignment_0 ) )
            {
            // InternalCSVParserGenerator.g:1277:1: ( ( rule__ValueMod__NameAssignment_0 ) )
            // InternalCSVParserGenerator.g:1278:2: ( rule__ValueMod__NameAssignment_0 )
            {
             before(grammarAccess.getValueModAccess().getNameAssignment_0()); 
            // InternalCSVParserGenerator.g:1279:2: ( rule__ValueMod__NameAssignment_0 )
            // InternalCSVParserGenerator.g:1279:3: rule__ValueMod__NameAssignment_0
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
    // InternalCSVParserGenerator.g:1287:1: rule__ValueMod__Group__1 : rule__ValueMod__Group__1__Impl rule__ValueMod__Group__2 ;
    public final void rule__ValueMod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1291:1: ( rule__ValueMod__Group__1__Impl rule__ValueMod__Group__2 )
            // InternalCSVParserGenerator.g:1292:2: rule__ValueMod__Group__1__Impl rule__ValueMod__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalCSVParserGenerator.g:1299:1: rule__ValueMod__Group__1__Impl : ( '=' ) ;
    public final void rule__ValueMod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1303:1: ( ( '=' ) )
            // InternalCSVParserGenerator.g:1304:1: ( '=' )
            {
            // InternalCSVParserGenerator.g:1304:1: ( '=' )
            // InternalCSVParserGenerator.g:1305:2: '='
            {
             before(grammarAccess.getValueModAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:1314:1: rule__ValueMod__Group__2 : rule__ValueMod__Group__2__Impl ;
    public final void rule__ValueMod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1318:1: ( rule__ValueMod__Group__2__Impl )
            // InternalCSVParserGenerator.g:1319:2: rule__ValueMod__Group__2__Impl
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
    // InternalCSVParserGenerator.g:1325:1: rule__ValueMod__Group__2__Impl : ( ( rule__ValueMod__ExpAssignment_2 ) ) ;
    public final void rule__ValueMod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1329:1: ( ( ( rule__ValueMod__ExpAssignment_2 ) ) )
            // InternalCSVParserGenerator.g:1330:1: ( ( rule__ValueMod__ExpAssignment_2 ) )
            {
            // InternalCSVParserGenerator.g:1330:1: ( ( rule__ValueMod__ExpAssignment_2 ) )
            // InternalCSVParserGenerator.g:1331:2: ( rule__ValueMod__ExpAssignment_2 )
            {
             before(grammarAccess.getValueModAccess().getExpAssignment_2()); 
            // InternalCSVParserGenerator.g:1332:2: ( rule__ValueMod__ExpAssignment_2 )
            // InternalCSVParserGenerator.g:1332:3: rule__ValueMod__ExpAssignment_2
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
    // InternalCSVParserGenerator.g:1341:1: rule__Type__Group_0__0 : rule__Type__Group_0__0__Impl rule__Type__Group_0__1 ;
    public final void rule__Type__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1345:1: ( rule__Type__Group_0__0__Impl rule__Type__Group_0__1 )
            // InternalCSVParserGenerator.g:1346:2: rule__Type__Group_0__0__Impl rule__Type__Group_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalCSVParserGenerator.g:1353:1: rule__Type__Group_0__0__Impl : ( () ) ;
    public final void rule__Type__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1357:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1358:1: ( () )
            {
            // InternalCSVParserGenerator.g:1358:1: ( () )
            // InternalCSVParserGenerator.g:1359:2: ()
            {
             before(grammarAccess.getTypeAccess().getStrAction_0_0()); 
            // InternalCSVParserGenerator.g:1360:2: ()
            // InternalCSVParserGenerator.g:1360:3: 
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
    // InternalCSVParserGenerator.g:1368:1: rule__Type__Group_0__1 : rule__Type__Group_0__1__Impl ;
    public final void rule__Type__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1372:1: ( rule__Type__Group_0__1__Impl )
            // InternalCSVParserGenerator.g:1373:2: rule__Type__Group_0__1__Impl
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
    // InternalCSVParserGenerator.g:1379:1: rule__Type__Group_0__1__Impl : ( 'String' ) ;
    public final void rule__Type__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1383:1: ( ( 'String' ) )
            // InternalCSVParserGenerator.g:1384:1: ( 'String' )
            {
            // InternalCSVParserGenerator.g:1384:1: ( 'String' )
            // InternalCSVParserGenerator.g:1385:2: 'String'
            {
             before(grammarAccess.getTypeAccess().getStringKeyword_0_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:1395:1: rule__Type__Group_1__0 : rule__Type__Group_1__0__Impl rule__Type__Group_1__1 ;
    public final void rule__Type__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1399:1: ( rule__Type__Group_1__0__Impl rule__Type__Group_1__1 )
            // InternalCSVParserGenerator.g:1400:2: rule__Type__Group_1__0__Impl rule__Type__Group_1__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalCSVParserGenerator.g:1407:1: rule__Type__Group_1__0__Impl : ( () ) ;
    public final void rule__Type__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1411:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1412:1: ( () )
            {
            // InternalCSVParserGenerator.g:1412:1: ( () )
            // InternalCSVParserGenerator.g:1413:2: ()
            {
             before(grammarAccess.getTypeAccess().getIntegerAction_1_0()); 
            // InternalCSVParserGenerator.g:1414:2: ()
            // InternalCSVParserGenerator.g:1414:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getIntegerAction_1_0()); 

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
    // InternalCSVParserGenerator.g:1422:1: rule__Type__Group_1__1 : rule__Type__Group_1__1__Impl ;
    public final void rule__Type__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1426:1: ( rule__Type__Group_1__1__Impl )
            // InternalCSVParserGenerator.g:1427:2: rule__Type__Group_1__1__Impl
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
    // InternalCSVParserGenerator.g:1433:1: rule__Type__Group_1__1__Impl : ( 'Integer' ) ;
    public final void rule__Type__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1437:1: ( ( 'Integer' ) )
            // InternalCSVParserGenerator.g:1438:1: ( 'Integer' )
            {
            // InternalCSVParserGenerator.g:1438:1: ( 'Integer' )
            // InternalCSVParserGenerator.g:1439:2: 'Integer'
            {
             before(grammarAccess.getTypeAccess().getIntegerKeyword_1_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:1449:1: rule__Type__Group_2__0 : rule__Type__Group_2__0__Impl rule__Type__Group_2__1 ;
    public final void rule__Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1453:1: ( rule__Type__Group_2__0__Impl rule__Type__Group_2__1 )
            // InternalCSVParserGenerator.g:1454:2: rule__Type__Group_2__0__Impl rule__Type__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalCSVParserGenerator.g:1461:1: rule__Type__Group_2__0__Impl : ( () ) ;
    public final void rule__Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1465:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1466:1: ( () )
            {
            // InternalCSVParserGenerator.g:1466:1: ( () )
            // InternalCSVParserGenerator.g:1467:2: ()
            {
             before(grammarAccess.getTypeAccess().getDateAction_2_0()); 
            // InternalCSVParserGenerator.g:1468:2: ()
            // InternalCSVParserGenerator.g:1468:3: 
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
    // InternalCSVParserGenerator.g:1476:1: rule__Type__Group_2__1 : rule__Type__Group_2__1__Impl ;
    public final void rule__Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1480:1: ( rule__Type__Group_2__1__Impl )
            // InternalCSVParserGenerator.g:1481:2: rule__Type__Group_2__1__Impl
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
    // InternalCSVParserGenerator.g:1487:1: rule__Type__Group_2__1__Impl : ( 'Date' ) ;
    public final void rule__Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1491:1: ( ( 'Date' ) )
            // InternalCSVParserGenerator.g:1492:1: ( 'Date' )
            {
            // InternalCSVParserGenerator.g:1492:1: ( 'Date' )
            // InternalCSVParserGenerator.g:1493:2: 'Date'
            {
             before(grammarAccess.getTypeAccess().getDateKeyword_2_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:1503:1: rule__Type__Group_3__0 : rule__Type__Group_3__0__Impl rule__Type__Group_3__1 ;
    public final void rule__Type__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1507:1: ( rule__Type__Group_3__0__Impl rule__Type__Group_3__1 )
            // InternalCSVParserGenerator.g:1508:2: rule__Type__Group_3__0__Impl rule__Type__Group_3__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalCSVParserGenerator.g:1515:1: rule__Type__Group_3__0__Impl : ( () ) ;
    public final void rule__Type__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1519:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1520:1: ( () )
            {
            // InternalCSVParserGenerator.g:1520:1: ( () )
            // InternalCSVParserGenerator.g:1521:2: ()
            {
             before(grammarAccess.getTypeAccess().getFloatAction_3_0()); 
            // InternalCSVParserGenerator.g:1522:2: ()
            // InternalCSVParserGenerator.g:1522:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getFloatAction_3_0()); 

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
    // InternalCSVParserGenerator.g:1530:1: rule__Type__Group_3__1 : rule__Type__Group_3__1__Impl ;
    public final void rule__Type__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1534:1: ( rule__Type__Group_3__1__Impl )
            // InternalCSVParserGenerator.g:1535:2: rule__Type__Group_3__1__Impl
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
    // InternalCSVParserGenerator.g:1541:1: rule__Type__Group_3__1__Impl : ( 'Float' ) ;
    public final void rule__Type__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1545:1: ( ( 'Float' ) )
            // InternalCSVParserGenerator.g:1546:1: ( 'Float' )
            {
            // InternalCSVParserGenerator.g:1546:1: ( 'Float' )
            // InternalCSVParserGenerator.g:1547:2: 'Float'
            {
             before(grammarAccess.getTypeAccess().getFloatKeyword_3_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:1557:1: rule__LogExp__Group__0 : rule__LogExp__Group__0__Impl rule__LogExp__Group__1 ;
    public final void rule__LogExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1561:1: ( rule__LogExp__Group__0__Impl rule__LogExp__Group__1 )
            // InternalCSVParserGenerator.g:1562:2: rule__LogExp__Group__0__Impl rule__LogExp__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalCSVParserGenerator.g:1569:1: rule__LogExp__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__LogExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1573:1: ( ( ruleComparison ) )
            // InternalCSVParserGenerator.g:1574:1: ( ruleComparison )
            {
            // InternalCSVParserGenerator.g:1574:1: ( ruleComparison )
            // InternalCSVParserGenerator.g:1575:2: ruleComparison
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
    // InternalCSVParserGenerator.g:1584:1: rule__LogExp__Group__1 : rule__LogExp__Group__1__Impl ;
    public final void rule__LogExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1588:1: ( rule__LogExp__Group__1__Impl )
            // InternalCSVParserGenerator.g:1589:2: rule__LogExp__Group__1__Impl
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
    // InternalCSVParserGenerator.g:1595:1: rule__LogExp__Group__1__Impl : ( ( rule__LogExp__Group_1__0 )* ) ;
    public final void rule__LogExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1599:1: ( ( ( rule__LogExp__Group_1__0 )* ) )
            // InternalCSVParserGenerator.g:1600:1: ( ( rule__LogExp__Group_1__0 )* )
            {
            // InternalCSVParserGenerator.g:1600:1: ( ( rule__LogExp__Group_1__0 )* )
            // InternalCSVParserGenerator.g:1601:2: ( rule__LogExp__Group_1__0 )*
            {
             before(grammarAccess.getLogExpAccess().getGroup_1()); 
            // InternalCSVParserGenerator.g:1602:2: ( rule__LogExp__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=22 && LA14_0<=23)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1602:3: rule__LogExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__LogExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalCSVParserGenerator.g:1611:1: rule__LogExp__Group_1__0 : rule__LogExp__Group_1__0__Impl rule__LogExp__Group_1__1 ;
    public final void rule__LogExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1615:1: ( rule__LogExp__Group_1__0__Impl rule__LogExp__Group_1__1 )
            // InternalCSVParserGenerator.g:1616:2: rule__LogExp__Group_1__0__Impl rule__LogExp__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCSVParserGenerator.g:1623:1: rule__LogExp__Group_1__0__Impl : ( ( rule__LogExp__Alternatives_1_0 ) ) ;
    public final void rule__LogExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1627:1: ( ( ( rule__LogExp__Alternatives_1_0 ) ) )
            // InternalCSVParserGenerator.g:1628:1: ( ( rule__LogExp__Alternatives_1_0 ) )
            {
            // InternalCSVParserGenerator.g:1628:1: ( ( rule__LogExp__Alternatives_1_0 ) )
            // InternalCSVParserGenerator.g:1629:2: ( rule__LogExp__Alternatives_1_0 )
            {
             before(grammarAccess.getLogExpAccess().getAlternatives_1_0()); 
            // InternalCSVParserGenerator.g:1630:2: ( rule__LogExp__Alternatives_1_0 )
            // InternalCSVParserGenerator.g:1630:3: rule__LogExp__Alternatives_1_0
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
    // InternalCSVParserGenerator.g:1638:1: rule__LogExp__Group_1__1 : rule__LogExp__Group_1__1__Impl ;
    public final void rule__LogExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1642:1: ( rule__LogExp__Group_1__1__Impl )
            // InternalCSVParserGenerator.g:1643:2: rule__LogExp__Group_1__1__Impl
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
    // InternalCSVParserGenerator.g:1649:1: rule__LogExp__Group_1__1__Impl : ( ( rule__LogExp__RightAssignment_1_1 ) ) ;
    public final void rule__LogExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1653:1: ( ( ( rule__LogExp__RightAssignment_1_1 ) ) )
            // InternalCSVParserGenerator.g:1654:1: ( ( rule__LogExp__RightAssignment_1_1 ) )
            {
            // InternalCSVParserGenerator.g:1654:1: ( ( rule__LogExp__RightAssignment_1_1 ) )
            // InternalCSVParserGenerator.g:1655:2: ( rule__LogExp__RightAssignment_1_1 )
            {
             before(grammarAccess.getLogExpAccess().getRightAssignment_1_1()); 
            // InternalCSVParserGenerator.g:1656:2: ( rule__LogExp__RightAssignment_1_1 )
            // InternalCSVParserGenerator.g:1656:3: rule__LogExp__RightAssignment_1_1
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
    // InternalCSVParserGenerator.g:1665:1: rule__LogExp__Group_1_0_0__0 : rule__LogExp__Group_1_0_0__0__Impl rule__LogExp__Group_1_0_0__1 ;
    public final void rule__LogExp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1669:1: ( rule__LogExp__Group_1_0_0__0__Impl rule__LogExp__Group_1_0_0__1 )
            // InternalCSVParserGenerator.g:1670:2: rule__LogExp__Group_1_0_0__0__Impl rule__LogExp__Group_1_0_0__1
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
    // InternalCSVParserGenerator.g:1677:1: rule__LogExp__Group_1_0_0__0__Impl : ( '||' ) ;
    public final void rule__LogExp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1681:1: ( ( '||' ) )
            // InternalCSVParserGenerator.g:1682:1: ( '||' )
            {
            // InternalCSVParserGenerator.g:1682:1: ( '||' )
            // InternalCSVParserGenerator.g:1683:2: '||'
            {
             before(grammarAccess.getLogExpAccess().getVerticalLineVerticalLineKeyword_1_0_0_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:1692:1: rule__LogExp__Group_1_0_0__1 : rule__LogExp__Group_1_0_0__1__Impl ;
    public final void rule__LogExp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1696:1: ( rule__LogExp__Group_1_0_0__1__Impl )
            // InternalCSVParserGenerator.g:1697:2: rule__LogExp__Group_1_0_0__1__Impl
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
    // InternalCSVParserGenerator.g:1703:1: rule__LogExp__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__LogExp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1707:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1708:1: ( () )
            {
            // InternalCSVParserGenerator.g:1708:1: ( () )
            // InternalCSVParserGenerator.g:1709:2: ()
            {
             before(grammarAccess.getLogExpAccess().getOrLeftAction_1_0_0_1()); 
            // InternalCSVParserGenerator.g:1710:2: ()
            // InternalCSVParserGenerator.g:1710:3: 
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
    // InternalCSVParserGenerator.g:1719:1: rule__LogExp__Group_1_0_1__0 : rule__LogExp__Group_1_0_1__0__Impl rule__LogExp__Group_1_0_1__1 ;
    public final void rule__LogExp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1723:1: ( rule__LogExp__Group_1_0_1__0__Impl rule__LogExp__Group_1_0_1__1 )
            // InternalCSVParserGenerator.g:1724:2: rule__LogExp__Group_1_0_1__0__Impl rule__LogExp__Group_1_0_1__1
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
    // InternalCSVParserGenerator.g:1731:1: rule__LogExp__Group_1_0_1__0__Impl : ( '&&' ) ;
    public final void rule__LogExp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1735:1: ( ( '&&' ) )
            // InternalCSVParserGenerator.g:1736:1: ( '&&' )
            {
            // InternalCSVParserGenerator.g:1736:1: ( '&&' )
            // InternalCSVParserGenerator.g:1737:2: '&&'
            {
             before(grammarAccess.getLogExpAccess().getAmpersandAmpersandKeyword_1_0_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:1746:1: rule__LogExp__Group_1_0_1__1 : rule__LogExp__Group_1_0_1__1__Impl ;
    public final void rule__LogExp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1750:1: ( rule__LogExp__Group_1_0_1__1__Impl )
            // InternalCSVParserGenerator.g:1751:2: rule__LogExp__Group_1_0_1__1__Impl
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
    // InternalCSVParserGenerator.g:1757:1: rule__LogExp__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__LogExp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1761:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1762:1: ( () )
            {
            // InternalCSVParserGenerator.g:1762:1: ( () )
            // InternalCSVParserGenerator.g:1763:2: ()
            {
             before(grammarAccess.getLogExpAccess().getAndLeftAction_1_0_1_1()); 
            // InternalCSVParserGenerator.g:1764:2: ()
            // InternalCSVParserGenerator.g:1764:3: 
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
    // InternalCSVParserGenerator.g:1773:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1777:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalCSVParserGenerator.g:1778:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalCSVParserGenerator.g:1785:1: rule__Comparison__Group__0__Impl : ( ruleSum ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1789:1: ( ( ruleSum ) )
            // InternalCSVParserGenerator.g:1790:1: ( ruleSum )
            {
            // InternalCSVParserGenerator.g:1790:1: ( ruleSum )
            // InternalCSVParserGenerator.g:1791:2: ruleSum
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
    // InternalCSVParserGenerator.g:1800:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1804:1: ( rule__Comparison__Group__1__Impl )
            // InternalCSVParserGenerator.g:1805:2: rule__Comparison__Group__1__Impl
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
    // InternalCSVParserGenerator.g:1811:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1815:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalCSVParserGenerator.g:1816:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalCSVParserGenerator.g:1816:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalCSVParserGenerator.g:1817:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalCSVParserGenerator.g:1818:2: ( rule__Comparison__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=24 && LA15_0<=29)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1818:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalCSVParserGenerator.g:1827:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1831:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalCSVParserGenerator.g:1832:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCSVParserGenerator.g:1839:1: rule__Comparison__Group_1__0__Impl : ( ( rule__Comparison__Alternatives_1_0 ) ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1843:1: ( ( ( rule__Comparison__Alternatives_1_0 ) ) )
            // InternalCSVParserGenerator.g:1844:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            {
            // InternalCSVParserGenerator.g:1844:1: ( ( rule__Comparison__Alternatives_1_0 ) )
            // InternalCSVParserGenerator.g:1845:2: ( rule__Comparison__Alternatives_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0()); 
            // InternalCSVParserGenerator.g:1846:2: ( rule__Comparison__Alternatives_1_0 )
            // InternalCSVParserGenerator.g:1846:3: rule__Comparison__Alternatives_1_0
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
    // InternalCSVParserGenerator.g:1854:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1858:1: ( rule__Comparison__Group_1__1__Impl )
            // InternalCSVParserGenerator.g:1859:2: rule__Comparison__Group_1__1__Impl
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
    // InternalCSVParserGenerator.g:1865:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__RightAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1869:1: ( ( ( rule__Comparison__RightAssignment_1_1 ) ) )
            // InternalCSVParserGenerator.g:1870:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            {
            // InternalCSVParserGenerator.g:1870:1: ( ( rule__Comparison__RightAssignment_1_1 ) )
            // InternalCSVParserGenerator.g:1871:2: ( rule__Comparison__RightAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_1()); 
            // InternalCSVParserGenerator.g:1872:2: ( rule__Comparison__RightAssignment_1_1 )
            // InternalCSVParserGenerator.g:1872:3: rule__Comparison__RightAssignment_1_1
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
    // InternalCSVParserGenerator.g:1881:1: rule__Comparison__Group_1_0_0__0 : rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 ;
    public final void rule__Comparison__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1885:1: ( rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1 )
            // InternalCSVParserGenerator.g:1886:2: rule__Comparison__Group_1_0_0__0__Impl rule__Comparison__Group_1_0_0__1
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
    // InternalCSVParserGenerator.g:1893:1: rule__Comparison__Group_1_0_0__0__Impl : ( '<' ) ;
    public final void rule__Comparison__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1897:1: ( ( '<' ) )
            // InternalCSVParserGenerator.g:1898:1: ( '<' )
            {
            // InternalCSVParserGenerator.g:1898:1: ( '<' )
            // InternalCSVParserGenerator.g:1899:2: '<'
            {
             before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:1908:1: rule__Comparison__Group_1_0_0__1 : rule__Comparison__Group_1_0_0__1__Impl ;
    public final void rule__Comparison__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1912:1: ( rule__Comparison__Group_1_0_0__1__Impl )
            // InternalCSVParserGenerator.g:1913:2: rule__Comparison__Group_1_0_0__1__Impl
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
    // InternalCSVParserGenerator.g:1919:1: rule__Comparison__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1923:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1924:1: ( () )
            {
            // InternalCSVParserGenerator.g:1924:1: ( () )
            // InternalCSVParserGenerator.g:1925:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLtLeftAction_1_0_0_1()); 
            // InternalCSVParserGenerator.g:1926:2: ()
            // InternalCSVParserGenerator.g:1926:3: 
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
    // InternalCSVParserGenerator.g:1935:1: rule__Comparison__Group_1_0_1__0 : rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 ;
    public final void rule__Comparison__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1939:1: ( rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1 )
            // InternalCSVParserGenerator.g:1940:2: rule__Comparison__Group_1_0_1__0__Impl rule__Comparison__Group_1_0_1__1
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
    // InternalCSVParserGenerator.g:1947:1: rule__Comparison__Group_1_0_1__0__Impl : ( '>' ) ;
    public final void rule__Comparison__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1951:1: ( ( '>' ) )
            // InternalCSVParserGenerator.g:1952:1: ( '>' )
            {
            // InternalCSVParserGenerator.g:1952:1: ( '>' )
            // InternalCSVParserGenerator.g:1953:2: '>'
            {
             before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:1962:1: rule__Comparison__Group_1_0_1__1 : rule__Comparison__Group_1_0_1__1__Impl ;
    public final void rule__Comparison__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1966:1: ( rule__Comparison__Group_1_0_1__1__Impl )
            // InternalCSVParserGenerator.g:1967:2: rule__Comparison__Group_1_0_1__1__Impl
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
    // InternalCSVParserGenerator.g:1973:1: rule__Comparison__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1977:1: ( ( () ) )
            // InternalCSVParserGenerator.g:1978:1: ( () )
            {
            // InternalCSVParserGenerator.g:1978:1: ( () )
            // InternalCSVParserGenerator.g:1979:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGtLeftAction_1_0_1_1()); 
            // InternalCSVParserGenerator.g:1980:2: ()
            // InternalCSVParserGenerator.g:1980:3: 
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
    // InternalCSVParserGenerator.g:1989:1: rule__Comparison__Group_1_0_2__0 : rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 ;
    public final void rule__Comparison__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:1993:1: ( rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1 )
            // InternalCSVParserGenerator.g:1994:2: rule__Comparison__Group_1_0_2__0__Impl rule__Comparison__Group_1_0_2__1
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
    // InternalCSVParserGenerator.g:2001:1: rule__Comparison__Group_1_0_2__0__Impl : ( '==' ) ;
    public final void rule__Comparison__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2005:1: ( ( '==' ) )
            // InternalCSVParserGenerator.g:2006:1: ( '==' )
            {
            // InternalCSVParserGenerator.g:2006:1: ( '==' )
            // InternalCSVParserGenerator.g:2007:2: '=='
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2016:1: rule__Comparison__Group_1_0_2__1 : rule__Comparison__Group_1_0_2__1__Impl ;
    public final void rule__Comparison__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2020:1: ( rule__Comparison__Group_1_0_2__1__Impl )
            // InternalCSVParserGenerator.g:2021:2: rule__Comparison__Group_1_0_2__1__Impl
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
    // InternalCSVParserGenerator.g:2027:1: rule__Comparison__Group_1_0_2__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2031:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2032:1: ( () )
            {
            // InternalCSVParserGenerator.g:2032:1: ( () )
            // InternalCSVParserGenerator.g:2033:2: ()
            {
             before(grammarAccess.getComparisonAccess().getEquLeftAction_1_0_2_1()); 
            // InternalCSVParserGenerator.g:2034:2: ()
            // InternalCSVParserGenerator.g:2034:3: 
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
    // InternalCSVParserGenerator.g:2043:1: rule__Comparison__Group_1_0_3__0 : rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 ;
    public final void rule__Comparison__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2047:1: ( rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1 )
            // InternalCSVParserGenerator.g:2048:2: rule__Comparison__Group_1_0_3__0__Impl rule__Comparison__Group_1_0_3__1
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
    // InternalCSVParserGenerator.g:2055:1: rule__Comparison__Group_1_0_3__0__Impl : ( '!=' ) ;
    public final void rule__Comparison__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2059:1: ( ( '!=' ) )
            // InternalCSVParserGenerator.g:2060:1: ( '!=' )
            {
            // InternalCSVParserGenerator.g:2060:1: ( '!=' )
            // InternalCSVParserGenerator.g:2061:2: '!='
            {
             before(grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2070:1: rule__Comparison__Group_1_0_3__1 : rule__Comparison__Group_1_0_3__1__Impl ;
    public final void rule__Comparison__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2074:1: ( rule__Comparison__Group_1_0_3__1__Impl )
            // InternalCSVParserGenerator.g:2075:2: rule__Comparison__Group_1_0_3__1__Impl
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
    // InternalCSVParserGenerator.g:2081:1: rule__Comparison__Group_1_0_3__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2085:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2086:1: ( () )
            {
            // InternalCSVParserGenerator.g:2086:1: ( () )
            // InternalCSVParserGenerator.g:2087:2: ()
            {
             before(grammarAccess.getComparisonAccess().getNeqLeftAction_1_0_3_1()); 
            // InternalCSVParserGenerator.g:2088:2: ()
            // InternalCSVParserGenerator.g:2088:3: 
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
    // InternalCSVParserGenerator.g:2097:1: rule__Comparison__Group_1_0_4__0 : rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 ;
    public final void rule__Comparison__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2101:1: ( rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1 )
            // InternalCSVParserGenerator.g:2102:2: rule__Comparison__Group_1_0_4__0__Impl rule__Comparison__Group_1_0_4__1
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
    // InternalCSVParserGenerator.g:2109:1: rule__Comparison__Group_1_0_4__0__Impl : ( '=<' ) ;
    public final void rule__Comparison__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2113:1: ( ( '=<' ) )
            // InternalCSVParserGenerator.g:2114:1: ( '=<' )
            {
            // InternalCSVParserGenerator.g:2114:1: ( '=<' )
            // InternalCSVParserGenerator.g:2115:2: '=<'
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignLessThanSignKeyword_1_0_4_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2124:1: rule__Comparison__Group_1_0_4__1 : rule__Comparison__Group_1_0_4__1__Impl ;
    public final void rule__Comparison__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2128:1: ( rule__Comparison__Group_1_0_4__1__Impl )
            // InternalCSVParserGenerator.g:2129:2: rule__Comparison__Group_1_0_4__1__Impl
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
    // InternalCSVParserGenerator.g:2135:1: rule__Comparison__Group_1_0_4__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2139:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2140:1: ( () )
            {
            // InternalCSVParserGenerator.g:2140:1: ( () )
            // InternalCSVParserGenerator.g:2141:2: ()
            {
             before(grammarAccess.getComparisonAccess().getLeqLeftAction_1_0_4_1()); 
            // InternalCSVParserGenerator.g:2142:2: ()
            // InternalCSVParserGenerator.g:2142:3: 
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
    // InternalCSVParserGenerator.g:2151:1: rule__Comparison__Group_1_0_5__0 : rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1 ;
    public final void rule__Comparison__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2155:1: ( rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1 )
            // InternalCSVParserGenerator.g:2156:2: rule__Comparison__Group_1_0_5__0__Impl rule__Comparison__Group_1_0_5__1
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
    // InternalCSVParserGenerator.g:2163:1: rule__Comparison__Group_1_0_5__0__Impl : ( '=>' ) ;
    public final void rule__Comparison__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2167:1: ( ( '=>' ) )
            // InternalCSVParserGenerator.g:2168:1: ( '=>' )
            {
            // InternalCSVParserGenerator.g:2168:1: ( '=>' )
            // InternalCSVParserGenerator.g:2169:2: '=>'
            {
             before(grammarAccess.getComparisonAccess().getEqualsSignGreaterThanSignKeyword_1_0_5_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2178:1: rule__Comparison__Group_1_0_5__1 : rule__Comparison__Group_1_0_5__1__Impl ;
    public final void rule__Comparison__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2182:1: ( rule__Comparison__Group_1_0_5__1__Impl )
            // InternalCSVParserGenerator.g:2183:2: rule__Comparison__Group_1_0_5__1__Impl
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
    // InternalCSVParserGenerator.g:2189:1: rule__Comparison__Group_1_0_5__1__Impl : ( () ) ;
    public final void rule__Comparison__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2193:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2194:1: ( () )
            {
            // InternalCSVParserGenerator.g:2194:1: ( () )
            // InternalCSVParserGenerator.g:2195:2: ()
            {
             before(grammarAccess.getComparisonAccess().getGeqLeftAction_1_0_5_1()); 
            // InternalCSVParserGenerator.g:2196:2: ()
            // InternalCSVParserGenerator.g:2196:3: 
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
    // InternalCSVParserGenerator.g:2205:1: rule__Parens__Group__0 : rule__Parens__Group__0__Impl rule__Parens__Group__1 ;
    public final void rule__Parens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2209:1: ( rule__Parens__Group__0__Impl rule__Parens__Group__1 )
            // InternalCSVParserGenerator.g:2210:2: rule__Parens__Group__0__Impl rule__Parens__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCSVParserGenerator.g:2217:1: rule__Parens__Group__0__Impl : ( '(' ) ;
    public final void rule__Parens__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2221:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:2222:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:2222:1: ( '(' )
            // InternalCSVParserGenerator.g:2223:2: '('
            {
             before(grammarAccess.getParensAccess().getLeftParenthesisKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2232:1: rule__Parens__Group__1 : rule__Parens__Group__1__Impl rule__Parens__Group__2 ;
    public final void rule__Parens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2236:1: ( rule__Parens__Group__1__Impl rule__Parens__Group__2 )
            // InternalCSVParserGenerator.g:2237:2: rule__Parens__Group__1__Impl rule__Parens__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalCSVParserGenerator.g:2244:1: rule__Parens__Group__1__Impl : ( ( rule__Parens__ExpAssignment_1 ) ) ;
    public final void rule__Parens__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2248:1: ( ( ( rule__Parens__ExpAssignment_1 ) ) )
            // InternalCSVParserGenerator.g:2249:1: ( ( rule__Parens__ExpAssignment_1 ) )
            {
            // InternalCSVParserGenerator.g:2249:1: ( ( rule__Parens__ExpAssignment_1 ) )
            // InternalCSVParserGenerator.g:2250:2: ( rule__Parens__ExpAssignment_1 )
            {
             before(grammarAccess.getParensAccess().getExpAssignment_1()); 
            // InternalCSVParserGenerator.g:2251:2: ( rule__Parens__ExpAssignment_1 )
            // InternalCSVParserGenerator.g:2251:3: rule__Parens__ExpAssignment_1
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
    // InternalCSVParserGenerator.g:2259:1: rule__Parens__Group__2 : rule__Parens__Group__2__Impl ;
    public final void rule__Parens__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2263:1: ( rule__Parens__Group__2__Impl )
            // InternalCSVParserGenerator.g:2264:2: rule__Parens__Group__2__Impl
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
    // InternalCSVParserGenerator.g:2270:1: rule__Parens__Group__2__Impl : ( ')' ) ;
    public final void rule__Parens__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2274:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:2275:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:2275:1: ( ')' )
            // InternalCSVParserGenerator.g:2276:2: ')'
            {
             before(grammarAccess.getParensAccess().getRightParenthesisKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2286:1: rule__External__Group__0 : rule__External__Group__0__Impl rule__External__Group__1 ;
    public final void rule__External__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2290:1: ( rule__External__Group__0__Impl rule__External__Group__1 )
            // InternalCSVParserGenerator.g:2291:2: rule__External__Group__0__Impl rule__External__Group__1
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
    // InternalCSVParserGenerator.g:2298:1: rule__External__Group__0__Impl : ( 'ExtFunc' ) ;
    public final void rule__External__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2302:1: ( ( 'ExtFunc' ) )
            // InternalCSVParserGenerator.g:2303:1: ( 'ExtFunc' )
            {
            // InternalCSVParserGenerator.g:2303:1: ( 'ExtFunc' )
            // InternalCSVParserGenerator.g:2304:2: 'ExtFunc'
            {
             before(grammarAccess.getExternalAccess().getExtFuncKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2313:1: rule__External__Group__1 : rule__External__Group__1__Impl rule__External__Group__2 ;
    public final void rule__External__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2317:1: ( rule__External__Group__1__Impl rule__External__Group__2 )
            // InternalCSVParserGenerator.g:2318:2: rule__External__Group__1__Impl rule__External__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalCSVParserGenerator.g:2325:1: rule__External__Group__1__Impl : ( ( rule__External__NameAssignment_1 ) ) ;
    public final void rule__External__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2329:1: ( ( ( rule__External__NameAssignment_1 ) ) )
            // InternalCSVParserGenerator.g:2330:1: ( ( rule__External__NameAssignment_1 ) )
            {
            // InternalCSVParserGenerator.g:2330:1: ( ( rule__External__NameAssignment_1 ) )
            // InternalCSVParserGenerator.g:2331:2: ( rule__External__NameAssignment_1 )
            {
             before(grammarAccess.getExternalAccess().getNameAssignment_1()); 
            // InternalCSVParserGenerator.g:2332:2: ( rule__External__NameAssignment_1 )
            // InternalCSVParserGenerator.g:2332:3: rule__External__NameAssignment_1
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
    // InternalCSVParserGenerator.g:2340:1: rule__External__Group__2 : rule__External__Group__2__Impl rule__External__Group__3 ;
    public final void rule__External__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2344:1: ( rule__External__Group__2__Impl rule__External__Group__3 )
            // InternalCSVParserGenerator.g:2345:2: rule__External__Group__2__Impl rule__External__Group__3
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
    // InternalCSVParserGenerator.g:2352:1: rule__External__Group__2__Impl : ( '(' ) ;
    public final void rule__External__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2356:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:2357:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:2357:1: ( '(' )
            // InternalCSVParserGenerator.g:2358:2: '('
            {
             before(grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2367:1: rule__External__Group__3 : rule__External__Group__3__Impl rule__External__Group__4 ;
    public final void rule__External__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2371:1: ( rule__External__Group__3__Impl rule__External__Group__4 )
            // InternalCSVParserGenerator.g:2372:2: rule__External__Group__3__Impl rule__External__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalCSVParserGenerator.g:2379:1: rule__External__Group__3__Impl : ( ( rule__External__InpAssignment_3 ) ) ;
    public final void rule__External__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2383:1: ( ( ( rule__External__InpAssignment_3 ) ) )
            // InternalCSVParserGenerator.g:2384:1: ( ( rule__External__InpAssignment_3 ) )
            {
            // InternalCSVParserGenerator.g:2384:1: ( ( rule__External__InpAssignment_3 ) )
            // InternalCSVParserGenerator.g:2385:2: ( rule__External__InpAssignment_3 )
            {
             before(grammarAccess.getExternalAccess().getInpAssignment_3()); 
            // InternalCSVParserGenerator.g:2386:2: ( rule__External__InpAssignment_3 )
            // InternalCSVParserGenerator.g:2386:3: rule__External__InpAssignment_3
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
    // InternalCSVParserGenerator.g:2394:1: rule__External__Group__4 : rule__External__Group__4__Impl ;
    public final void rule__External__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2398:1: ( rule__External__Group__4__Impl )
            // InternalCSVParserGenerator.g:2399:2: rule__External__Group__4__Impl
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
    // InternalCSVParserGenerator.g:2405:1: rule__External__Group__4__Impl : ( ')' ) ;
    public final void rule__External__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2409:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:2410:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:2410:1: ( ')' )
            // InternalCSVParserGenerator.g:2411:2: ')'
            {
             before(grammarAccess.getExternalAccess().getRightParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2421:1: rule__StatFunc__Group_0__0 : rule__StatFunc__Group_0__0__Impl rule__StatFunc__Group_0__1 ;
    public final void rule__StatFunc__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2425:1: ( rule__StatFunc__Group_0__0__Impl rule__StatFunc__Group_0__1 )
            // InternalCSVParserGenerator.g:2426:2: rule__StatFunc__Group_0__0__Impl rule__StatFunc__Group_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalCSVParserGenerator.g:2433:1: rule__StatFunc__Group_0__0__Impl : ( () ) ;
    public final void rule__StatFunc__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2437:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2438:1: ( () )
            {
            // InternalCSVParserGenerator.g:2438:1: ( () )
            // InternalCSVParserGenerator.g:2439:2: ()
            {
             before(grammarAccess.getStatFuncAccess().getMaxAction_0_0()); 
            // InternalCSVParserGenerator.g:2440:2: ()
            // InternalCSVParserGenerator.g:2440:3: 
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
    // InternalCSVParserGenerator.g:2448:1: rule__StatFunc__Group_0__1 : rule__StatFunc__Group_0__1__Impl rule__StatFunc__Group_0__2 ;
    public final void rule__StatFunc__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2452:1: ( rule__StatFunc__Group_0__1__Impl rule__StatFunc__Group_0__2 )
            // InternalCSVParserGenerator.g:2453:2: rule__StatFunc__Group_0__1__Impl rule__StatFunc__Group_0__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalCSVParserGenerator.g:2460:1: rule__StatFunc__Group_0__1__Impl : ( 'Max' ) ;
    public final void rule__StatFunc__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2464:1: ( ( 'Max' ) )
            // InternalCSVParserGenerator.g:2465:1: ( 'Max' )
            {
            // InternalCSVParserGenerator.g:2465:1: ( 'Max' )
            // InternalCSVParserGenerator.g:2466:2: 'Max'
            {
             before(grammarAccess.getStatFuncAccess().getMaxKeyword_0_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2475:1: rule__StatFunc__Group_0__2 : rule__StatFunc__Group_0__2__Impl rule__StatFunc__Group_0__3 ;
    public final void rule__StatFunc__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2479:1: ( rule__StatFunc__Group_0__2__Impl rule__StatFunc__Group_0__3 )
            // InternalCSVParserGenerator.g:2480:2: rule__StatFunc__Group_0__2__Impl rule__StatFunc__Group_0__3
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
    // InternalCSVParserGenerator.g:2487:1: rule__StatFunc__Group_0__2__Impl : ( '(' ) ;
    public final void rule__StatFunc__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2491:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:2492:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:2492:1: ( '(' )
            // InternalCSVParserGenerator.g:2493:2: '('
            {
             before(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2502:1: rule__StatFunc__Group_0__3 : rule__StatFunc__Group_0__3__Impl rule__StatFunc__Group_0__4 ;
    public final void rule__StatFunc__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2506:1: ( rule__StatFunc__Group_0__3__Impl rule__StatFunc__Group_0__4 )
            // InternalCSVParserGenerator.g:2507:2: rule__StatFunc__Group_0__3__Impl rule__StatFunc__Group_0__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalCSVParserGenerator.g:2514:1: rule__StatFunc__Group_0__3__Impl : ( ( rule__StatFunc__InputAssignment_0_3 ) ) ;
    public final void rule__StatFunc__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2518:1: ( ( ( rule__StatFunc__InputAssignment_0_3 ) ) )
            // InternalCSVParserGenerator.g:2519:1: ( ( rule__StatFunc__InputAssignment_0_3 ) )
            {
            // InternalCSVParserGenerator.g:2519:1: ( ( rule__StatFunc__InputAssignment_0_3 ) )
            // InternalCSVParserGenerator.g:2520:2: ( rule__StatFunc__InputAssignment_0_3 )
            {
             before(grammarAccess.getStatFuncAccess().getInputAssignment_0_3()); 
            // InternalCSVParserGenerator.g:2521:2: ( rule__StatFunc__InputAssignment_0_3 )
            // InternalCSVParserGenerator.g:2521:3: rule__StatFunc__InputAssignment_0_3
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
    // InternalCSVParserGenerator.g:2529:1: rule__StatFunc__Group_0__4 : rule__StatFunc__Group_0__4__Impl ;
    public final void rule__StatFunc__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2533:1: ( rule__StatFunc__Group_0__4__Impl )
            // InternalCSVParserGenerator.g:2534:2: rule__StatFunc__Group_0__4__Impl
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
    // InternalCSVParserGenerator.g:2540:1: rule__StatFunc__Group_0__4__Impl : ( ')' ) ;
    public final void rule__StatFunc__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2544:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:2545:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:2545:1: ( ')' )
            // InternalCSVParserGenerator.g:2546:2: ')'
            {
             before(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_0_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2556:1: rule__StatFunc__Group_1__0 : rule__StatFunc__Group_1__0__Impl rule__StatFunc__Group_1__1 ;
    public final void rule__StatFunc__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2560:1: ( rule__StatFunc__Group_1__0__Impl rule__StatFunc__Group_1__1 )
            // InternalCSVParserGenerator.g:2561:2: rule__StatFunc__Group_1__0__Impl rule__StatFunc__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalCSVParserGenerator.g:2568:1: rule__StatFunc__Group_1__0__Impl : ( () ) ;
    public final void rule__StatFunc__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2572:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2573:1: ( () )
            {
            // InternalCSVParserGenerator.g:2573:1: ( () )
            // InternalCSVParserGenerator.g:2574:2: ()
            {
             before(grammarAccess.getStatFuncAccess().getMinAction_1_0()); 
            // InternalCSVParserGenerator.g:2575:2: ()
            // InternalCSVParserGenerator.g:2575:3: 
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
    // InternalCSVParserGenerator.g:2583:1: rule__StatFunc__Group_1__1 : rule__StatFunc__Group_1__1__Impl rule__StatFunc__Group_1__2 ;
    public final void rule__StatFunc__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2587:1: ( rule__StatFunc__Group_1__1__Impl rule__StatFunc__Group_1__2 )
            // InternalCSVParserGenerator.g:2588:2: rule__StatFunc__Group_1__1__Impl rule__StatFunc__Group_1__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalCSVParserGenerator.g:2595:1: rule__StatFunc__Group_1__1__Impl : ( 'Min' ) ;
    public final void rule__StatFunc__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2599:1: ( ( 'Min' ) )
            // InternalCSVParserGenerator.g:2600:1: ( 'Min' )
            {
            // InternalCSVParserGenerator.g:2600:1: ( 'Min' )
            // InternalCSVParserGenerator.g:2601:2: 'Min'
            {
             before(grammarAccess.getStatFuncAccess().getMinKeyword_1_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2610:1: rule__StatFunc__Group_1__2 : rule__StatFunc__Group_1__2__Impl rule__StatFunc__Group_1__3 ;
    public final void rule__StatFunc__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2614:1: ( rule__StatFunc__Group_1__2__Impl rule__StatFunc__Group_1__3 )
            // InternalCSVParserGenerator.g:2615:2: rule__StatFunc__Group_1__2__Impl rule__StatFunc__Group_1__3
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
    // InternalCSVParserGenerator.g:2622:1: rule__StatFunc__Group_1__2__Impl : ( '(' ) ;
    public final void rule__StatFunc__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2626:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:2627:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:2627:1: ( '(' )
            // InternalCSVParserGenerator.g:2628:2: '('
            {
             before(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2637:1: rule__StatFunc__Group_1__3 : rule__StatFunc__Group_1__3__Impl rule__StatFunc__Group_1__4 ;
    public final void rule__StatFunc__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2641:1: ( rule__StatFunc__Group_1__3__Impl rule__StatFunc__Group_1__4 )
            // InternalCSVParserGenerator.g:2642:2: rule__StatFunc__Group_1__3__Impl rule__StatFunc__Group_1__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalCSVParserGenerator.g:2649:1: rule__StatFunc__Group_1__3__Impl : ( ( rule__StatFunc__InputAssignment_1_3 ) ) ;
    public final void rule__StatFunc__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2653:1: ( ( ( rule__StatFunc__InputAssignment_1_3 ) ) )
            // InternalCSVParserGenerator.g:2654:1: ( ( rule__StatFunc__InputAssignment_1_3 ) )
            {
            // InternalCSVParserGenerator.g:2654:1: ( ( rule__StatFunc__InputAssignment_1_3 ) )
            // InternalCSVParserGenerator.g:2655:2: ( rule__StatFunc__InputAssignment_1_3 )
            {
             before(grammarAccess.getStatFuncAccess().getInputAssignment_1_3()); 
            // InternalCSVParserGenerator.g:2656:2: ( rule__StatFunc__InputAssignment_1_3 )
            // InternalCSVParserGenerator.g:2656:3: rule__StatFunc__InputAssignment_1_3
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
    // InternalCSVParserGenerator.g:2664:1: rule__StatFunc__Group_1__4 : rule__StatFunc__Group_1__4__Impl ;
    public final void rule__StatFunc__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2668:1: ( rule__StatFunc__Group_1__4__Impl )
            // InternalCSVParserGenerator.g:2669:2: rule__StatFunc__Group_1__4__Impl
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
    // InternalCSVParserGenerator.g:2675:1: rule__StatFunc__Group_1__4__Impl : ( ')' ) ;
    public final void rule__StatFunc__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2679:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:2680:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:2680:1: ( ')' )
            // InternalCSVParserGenerator.g:2681:2: ')'
            {
             before(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_1_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2691:1: rule__StatFunc__Group_2__0 : rule__StatFunc__Group_2__0__Impl rule__StatFunc__Group_2__1 ;
    public final void rule__StatFunc__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2695:1: ( rule__StatFunc__Group_2__0__Impl rule__StatFunc__Group_2__1 )
            // InternalCSVParserGenerator.g:2696:2: rule__StatFunc__Group_2__0__Impl rule__StatFunc__Group_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalCSVParserGenerator.g:2703:1: rule__StatFunc__Group_2__0__Impl : ( () ) ;
    public final void rule__StatFunc__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2707:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2708:1: ( () )
            {
            // InternalCSVParserGenerator.g:2708:1: ( () )
            // InternalCSVParserGenerator.g:2709:2: ()
            {
             before(grammarAccess.getStatFuncAccess().getStdAction_2_0()); 
            // InternalCSVParserGenerator.g:2710:2: ()
            // InternalCSVParserGenerator.g:2710:3: 
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
    // InternalCSVParserGenerator.g:2718:1: rule__StatFunc__Group_2__1 : rule__StatFunc__Group_2__1__Impl rule__StatFunc__Group_2__2 ;
    public final void rule__StatFunc__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2722:1: ( rule__StatFunc__Group_2__1__Impl rule__StatFunc__Group_2__2 )
            // InternalCSVParserGenerator.g:2723:2: rule__StatFunc__Group_2__1__Impl rule__StatFunc__Group_2__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalCSVParserGenerator.g:2730:1: rule__StatFunc__Group_2__1__Impl : ( 'Std' ) ;
    public final void rule__StatFunc__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2734:1: ( ( 'Std' ) )
            // InternalCSVParserGenerator.g:2735:1: ( 'Std' )
            {
            // InternalCSVParserGenerator.g:2735:1: ( 'Std' )
            // InternalCSVParserGenerator.g:2736:2: 'Std'
            {
             before(grammarAccess.getStatFuncAccess().getStdKeyword_2_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2745:1: rule__StatFunc__Group_2__2 : rule__StatFunc__Group_2__2__Impl rule__StatFunc__Group_2__3 ;
    public final void rule__StatFunc__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2749:1: ( rule__StatFunc__Group_2__2__Impl rule__StatFunc__Group_2__3 )
            // InternalCSVParserGenerator.g:2750:2: rule__StatFunc__Group_2__2__Impl rule__StatFunc__Group_2__3
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
    // InternalCSVParserGenerator.g:2757:1: rule__StatFunc__Group_2__2__Impl : ( '(' ) ;
    public final void rule__StatFunc__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2761:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:2762:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:2762:1: ( '(' )
            // InternalCSVParserGenerator.g:2763:2: '('
            {
             before(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2772:1: rule__StatFunc__Group_2__3 : rule__StatFunc__Group_2__3__Impl rule__StatFunc__Group_2__4 ;
    public final void rule__StatFunc__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2776:1: ( rule__StatFunc__Group_2__3__Impl rule__StatFunc__Group_2__4 )
            // InternalCSVParserGenerator.g:2777:2: rule__StatFunc__Group_2__3__Impl rule__StatFunc__Group_2__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalCSVParserGenerator.g:2784:1: rule__StatFunc__Group_2__3__Impl : ( ( rule__StatFunc__InputAssignment_2_3 ) ) ;
    public final void rule__StatFunc__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2788:1: ( ( ( rule__StatFunc__InputAssignment_2_3 ) ) )
            // InternalCSVParserGenerator.g:2789:1: ( ( rule__StatFunc__InputAssignment_2_3 ) )
            {
            // InternalCSVParserGenerator.g:2789:1: ( ( rule__StatFunc__InputAssignment_2_3 ) )
            // InternalCSVParserGenerator.g:2790:2: ( rule__StatFunc__InputAssignment_2_3 )
            {
             before(grammarAccess.getStatFuncAccess().getInputAssignment_2_3()); 
            // InternalCSVParserGenerator.g:2791:2: ( rule__StatFunc__InputAssignment_2_3 )
            // InternalCSVParserGenerator.g:2791:3: rule__StatFunc__InputAssignment_2_3
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
    // InternalCSVParserGenerator.g:2799:1: rule__StatFunc__Group_2__4 : rule__StatFunc__Group_2__4__Impl ;
    public final void rule__StatFunc__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2803:1: ( rule__StatFunc__Group_2__4__Impl )
            // InternalCSVParserGenerator.g:2804:2: rule__StatFunc__Group_2__4__Impl
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
    // InternalCSVParserGenerator.g:2810:1: rule__StatFunc__Group_2__4__Impl : ( ')' ) ;
    public final void rule__StatFunc__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2814:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:2815:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:2815:1: ( ')' )
            // InternalCSVParserGenerator.g:2816:2: ')'
            {
             before(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_2_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2826:1: rule__StatFunc__Group_3__0 : rule__StatFunc__Group_3__0__Impl rule__StatFunc__Group_3__1 ;
    public final void rule__StatFunc__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2830:1: ( rule__StatFunc__Group_3__0__Impl rule__StatFunc__Group_3__1 )
            // InternalCSVParserGenerator.g:2831:2: rule__StatFunc__Group_3__0__Impl rule__StatFunc__Group_3__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalCSVParserGenerator.g:2838:1: rule__StatFunc__Group_3__0__Impl : ( () ) ;
    public final void rule__StatFunc__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2842:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2843:1: ( () )
            {
            // InternalCSVParserGenerator.g:2843:1: ( () )
            // InternalCSVParserGenerator.g:2844:2: ()
            {
             before(grammarAccess.getStatFuncAccess().getSumFuncAction_3_0()); 
            // InternalCSVParserGenerator.g:2845:2: ()
            // InternalCSVParserGenerator.g:2845:3: 
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
    // InternalCSVParserGenerator.g:2853:1: rule__StatFunc__Group_3__1 : rule__StatFunc__Group_3__1__Impl rule__StatFunc__Group_3__2 ;
    public final void rule__StatFunc__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2857:1: ( rule__StatFunc__Group_3__1__Impl rule__StatFunc__Group_3__2 )
            // InternalCSVParserGenerator.g:2858:2: rule__StatFunc__Group_3__1__Impl rule__StatFunc__Group_3__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalCSVParserGenerator.g:2865:1: rule__StatFunc__Group_3__1__Impl : ( 'Sum' ) ;
    public final void rule__StatFunc__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2869:1: ( ( 'Sum' ) )
            // InternalCSVParserGenerator.g:2870:1: ( 'Sum' )
            {
            // InternalCSVParserGenerator.g:2870:1: ( 'Sum' )
            // InternalCSVParserGenerator.g:2871:2: 'Sum'
            {
             before(grammarAccess.getStatFuncAccess().getSumKeyword_3_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2880:1: rule__StatFunc__Group_3__2 : rule__StatFunc__Group_3__2__Impl rule__StatFunc__Group_3__3 ;
    public final void rule__StatFunc__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2884:1: ( rule__StatFunc__Group_3__2__Impl rule__StatFunc__Group_3__3 )
            // InternalCSVParserGenerator.g:2885:2: rule__StatFunc__Group_3__2__Impl rule__StatFunc__Group_3__3
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
    // InternalCSVParserGenerator.g:2892:1: rule__StatFunc__Group_3__2__Impl : ( '(' ) ;
    public final void rule__StatFunc__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2896:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:2897:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:2897:1: ( '(' )
            // InternalCSVParserGenerator.g:2898:2: '('
            {
             before(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_3_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2907:1: rule__StatFunc__Group_3__3 : rule__StatFunc__Group_3__3__Impl rule__StatFunc__Group_3__4 ;
    public final void rule__StatFunc__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2911:1: ( rule__StatFunc__Group_3__3__Impl rule__StatFunc__Group_3__4 )
            // InternalCSVParserGenerator.g:2912:2: rule__StatFunc__Group_3__3__Impl rule__StatFunc__Group_3__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalCSVParserGenerator.g:2919:1: rule__StatFunc__Group_3__3__Impl : ( ( rule__StatFunc__InputAssignment_3_3 ) ) ;
    public final void rule__StatFunc__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2923:1: ( ( ( rule__StatFunc__InputAssignment_3_3 ) ) )
            // InternalCSVParserGenerator.g:2924:1: ( ( rule__StatFunc__InputAssignment_3_3 ) )
            {
            // InternalCSVParserGenerator.g:2924:1: ( ( rule__StatFunc__InputAssignment_3_3 ) )
            // InternalCSVParserGenerator.g:2925:2: ( rule__StatFunc__InputAssignment_3_3 )
            {
             before(grammarAccess.getStatFuncAccess().getInputAssignment_3_3()); 
            // InternalCSVParserGenerator.g:2926:2: ( rule__StatFunc__InputAssignment_3_3 )
            // InternalCSVParserGenerator.g:2926:3: rule__StatFunc__InputAssignment_3_3
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
    // InternalCSVParserGenerator.g:2934:1: rule__StatFunc__Group_3__4 : rule__StatFunc__Group_3__4__Impl ;
    public final void rule__StatFunc__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2938:1: ( rule__StatFunc__Group_3__4__Impl )
            // InternalCSVParserGenerator.g:2939:2: rule__StatFunc__Group_3__4__Impl
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
    // InternalCSVParserGenerator.g:2945:1: rule__StatFunc__Group_3__4__Impl : ( ')' ) ;
    public final void rule__StatFunc__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2949:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:2950:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:2950:1: ( ')' )
            // InternalCSVParserGenerator.g:2951:2: ')'
            {
             before(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_3_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:2961:1: rule__StatFunc__Group_4__0 : rule__StatFunc__Group_4__0__Impl rule__StatFunc__Group_4__1 ;
    public final void rule__StatFunc__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2965:1: ( rule__StatFunc__Group_4__0__Impl rule__StatFunc__Group_4__1 )
            // InternalCSVParserGenerator.g:2966:2: rule__StatFunc__Group_4__0__Impl rule__StatFunc__Group_4__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalCSVParserGenerator.g:2973:1: rule__StatFunc__Group_4__0__Impl : ( () ) ;
    public final void rule__StatFunc__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2977:1: ( ( () ) )
            // InternalCSVParserGenerator.g:2978:1: ( () )
            {
            // InternalCSVParserGenerator.g:2978:1: ( () )
            // InternalCSVParserGenerator.g:2979:2: ()
            {
             before(grammarAccess.getStatFuncAccess().getMeanAction_4_0()); 
            // InternalCSVParserGenerator.g:2980:2: ()
            // InternalCSVParserGenerator.g:2980:3: 
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
    // InternalCSVParserGenerator.g:2988:1: rule__StatFunc__Group_4__1 : rule__StatFunc__Group_4__1__Impl rule__StatFunc__Group_4__2 ;
    public final void rule__StatFunc__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:2992:1: ( rule__StatFunc__Group_4__1__Impl rule__StatFunc__Group_4__2 )
            // InternalCSVParserGenerator.g:2993:2: rule__StatFunc__Group_4__1__Impl rule__StatFunc__Group_4__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalCSVParserGenerator.g:3000:1: rule__StatFunc__Group_4__1__Impl : ( 'Mean' ) ;
    public final void rule__StatFunc__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3004:1: ( ( 'Mean' ) )
            // InternalCSVParserGenerator.g:3005:1: ( 'Mean' )
            {
            // InternalCSVParserGenerator.g:3005:1: ( 'Mean' )
            // InternalCSVParserGenerator.g:3006:2: 'Mean'
            {
             before(grammarAccess.getStatFuncAccess().getMeanKeyword_4_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3015:1: rule__StatFunc__Group_4__2 : rule__StatFunc__Group_4__2__Impl rule__StatFunc__Group_4__3 ;
    public final void rule__StatFunc__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3019:1: ( rule__StatFunc__Group_4__2__Impl rule__StatFunc__Group_4__3 )
            // InternalCSVParserGenerator.g:3020:2: rule__StatFunc__Group_4__2__Impl rule__StatFunc__Group_4__3
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
    // InternalCSVParserGenerator.g:3027:1: rule__StatFunc__Group_4__2__Impl : ( '(' ) ;
    public final void rule__StatFunc__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3031:1: ( ( '(' ) )
            // InternalCSVParserGenerator.g:3032:1: ( '(' )
            {
            // InternalCSVParserGenerator.g:3032:1: ( '(' )
            // InternalCSVParserGenerator.g:3033:2: '('
            {
             before(grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_4_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3042:1: rule__StatFunc__Group_4__3 : rule__StatFunc__Group_4__3__Impl rule__StatFunc__Group_4__4 ;
    public final void rule__StatFunc__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3046:1: ( rule__StatFunc__Group_4__3__Impl rule__StatFunc__Group_4__4 )
            // InternalCSVParserGenerator.g:3047:2: rule__StatFunc__Group_4__3__Impl rule__StatFunc__Group_4__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalCSVParserGenerator.g:3054:1: rule__StatFunc__Group_4__3__Impl : ( ( rule__StatFunc__InputAssignment_4_3 ) ) ;
    public final void rule__StatFunc__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3058:1: ( ( ( rule__StatFunc__InputAssignment_4_3 ) ) )
            // InternalCSVParserGenerator.g:3059:1: ( ( rule__StatFunc__InputAssignment_4_3 ) )
            {
            // InternalCSVParserGenerator.g:3059:1: ( ( rule__StatFunc__InputAssignment_4_3 ) )
            // InternalCSVParserGenerator.g:3060:2: ( rule__StatFunc__InputAssignment_4_3 )
            {
             before(grammarAccess.getStatFuncAccess().getInputAssignment_4_3()); 
            // InternalCSVParserGenerator.g:3061:2: ( rule__StatFunc__InputAssignment_4_3 )
            // InternalCSVParserGenerator.g:3061:3: rule__StatFunc__InputAssignment_4_3
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
    // InternalCSVParserGenerator.g:3069:1: rule__StatFunc__Group_4__4 : rule__StatFunc__Group_4__4__Impl ;
    public final void rule__StatFunc__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3073:1: ( rule__StatFunc__Group_4__4__Impl )
            // InternalCSVParserGenerator.g:3074:2: rule__StatFunc__Group_4__4__Impl
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
    // InternalCSVParserGenerator.g:3080:1: rule__StatFunc__Group_4__4__Impl : ( ')' ) ;
    public final void rule__StatFunc__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3084:1: ( ( ')' ) )
            // InternalCSVParserGenerator.g:3085:1: ( ')' )
            {
            // InternalCSVParserGenerator.g:3085:1: ( ')' )
            // InternalCSVParserGenerator.g:3086:2: ')'
            {
             before(grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_4_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3096:1: rule__ColumnAction__Group_0__0 : rule__ColumnAction__Group_0__0__Impl rule__ColumnAction__Group_0__1 ;
    public final void rule__ColumnAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3100:1: ( rule__ColumnAction__Group_0__0__Impl rule__ColumnAction__Group_0__1 )
            // InternalCSVParserGenerator.g:3101:2: rule__ColumnAction__Group_0__0__Impl rule__ColumnAction__Group_0__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalCSVParserGenerator.g:3108:1: rule__ColumnAction__Group_0__0__Impl : ( () ) ;
    public final void rule__ColumnAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3112:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3113:1: ( () )
            {
            // InternalCSVParserGenerator.g:3113:1: ( () )
            // InternalCSVParserGenerator.g:3114:2: ()
            {
             before(grammarAccess.getColumnActionAccess().getAddAction_0_0()); 
            // InternalCSVParserGenerator.g:3115:2: ()
            // InternalCSVParserGenerator.g:3115:3: 
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
    // InternalCSVParserGenerator.g:3123:1: rule__ColumnAction__Group_0__1 : rule__ColumnAction__Group_0__1__Impl rule__ColumnAction__Group_0__2 ;
    public final void rule__ColumnAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3127:1: ( rule__ColumnAction__Group_0__1__Impl rule__ColumnAction__Group_0__2 )
            // InternalCSVParserGenerator.g:3128:2: rule__ColumnAction__Group_0__1__Impl rule__ColumnAction__Group_0__2
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
    // InternalCSVParserGenerator.g:3135:1: rule__ColumnAction__Group_0__1__Impl : ( 'AddCol' ) ;
    public final void rule__ColumnAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3139:1: ( ( 'AddCol' ) )
            // InternalCSVParserGenerator.g:3140:1: ( 'AddCol' )
            {
            // InternalCSVParserGenerator.g:3140:1: ( 'AddCol' )
            // InternalCSVParserGenerator.g:3141:2: 'AddCol'
            {
             before(grammarAccess.getColumnActionAccess().getAddColKeyword_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3150:1: rule__ColumnAction__Group_0__2 : rule__ColumnAction__Group_0__2__Impl rule__ColumnAction__Group_0__3 ;
    public final void rule__ColumnAction__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3154:1: ( rule__ColumnAction__Group_0__2__Impl rule__ColumnAction__Group_0__3 )
            // InternalCSVParserGenerator.g:3155:2: rule__ColumnAction__Group_0__2__Impl rule__ColumnAction__Group_0__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalCSVParserGenerator.g:3162:1: rule__ColumnAction__Group_0__2__Impl : ( ( rule__ColumnAction__NameAssignment_0_2 ) ) ;
    public final void rule__ColumnAction__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3166:1: ( ( ( rule__ColumnAction__NameAssignment_0_2 ) ) )
            // InternalCSVParserGenerator.g:3167:1: ( ( rule__ColumnAction__NameAssignment_0_2 ) )
            {
            // InternalCSVParserGenerator.g:3167:1: ( ( rule__ColumnAction__NameAssignment_0_2 ) )
            // InternalCSVParserGenerator.g:3168:2: ( rule__ColumnAction__NameAssignment_0_2 )
            {
             before(grammarAccess.getColumnActionAccess().getNameAssignment_0_2()); 
            // InternalCSVParserGenerator.g:3169:2: ( rule__ColumnAction__NameAssignment_0_2 )
            // InternalCSVParserGenerator.g:3169:3: rule__ColumnAction__NameAssignment_0_2
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
    // InternalCSVParserGenerator.g:3177:1: rule__ColumnAction__Group_0__3 : rule__ColumnAction__Group_0__3__Impl rule__ColumnAction__Group_0__4 ;
    public final void rule__ColumnAction__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3181:1: ( rule__ColumnAction__Group_0__3__Impl rule__ColumnAction__Group_0__4 )
            // InternalCSVParserGenerator.g:3182:2: rule__ColumnAction__Group_0__3__Impl rule__ColumnAction__Group_0__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalCSVParserGenerator.g:3189:1: rule__ColumnAction__Group_0__3__Impl : ( 'with' ) ;
    public final void rule__ColumnAction__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3193:1: ( ( 'with' ) )
            // InternalCSVParserGenerator.g:3194:1: ( 'with' )
            {
            // InternalCSVParserGenerator.g:3194:1: ( 'with' )
            // InternalCSVParserGenerator.g:3195:2: 'with'
            {
             before(grammarAccess.getColumnActionAccess().getWithKeyword_0_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getColumnActionAccess().getWithKeyword_0_3()); 

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
    // InternalCSVParserGenerator.g:3204:1: rule__ColumnAction__Group_0__4 : rule__ColumnAction__Group_0__4__Impl ;
    public final void rule__ColumnAction__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3208:1: ( rule__ColumnAction__Group_0__4__Impl )
            // InternalCSVParserGenerator.g:3209:2: rule__ColumnAction__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ColumnAction__Group_0__4__Impl();

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
    // InternalCSVParserGenerator.g:3215:1: rule__ColumnAction__Group_0__4__Impl : ( ( rule__ColumnAction__ModAssignment_0_4 ) ) ;
    public final void rule__ColumnAction__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3219:1: ( ( ( rule__ColumnAction__ModAssignment_0_4 ) ) )
            // InternalCSVParserGenerator.g:3220:1: ( ( rule__ColumnAction__ModAssignment_0_4 ) )
            {
            // InternalCSVParserGenerator.g:3220:1: ( ( rule__ColumnAction__ModAssignment_0_4 ) )
            // InternalCSVParserGenerator.g:3221:2: ( rule__ColumnAction__ModAssignment_0_4 )
            {
             before(grammarAccess.getColumnActionAccess().getModAssignment_0_4()); 
            // InternalCSVParserGenerator.g:3222:2: ( rule__ColumnAction__ModAssignment_0_4 )
            // InternalCSVParserGenerator.g:3222:3: rule__ColumnAction__ModAssignment_0_4
            {
            pushFollow(FOLLOW_2);
            rule__ColumnAction__ModAssignment_0_4();

            state._fsp--;


            }

             after(grammarAccess.getColumnActionAccess().getModAssignment_0_4()); 

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


    // $ANTLR start "rule__ColumnAction__Group_1__0"
    // InternalCSVParserGenerator.g:3231:1: rule__ColumnAction__Group_1__0 : rule__ColumnAction__Group_1__0__Impl rule__ColumnAction__Group_1__1 ;
    public final void rule__ColumnAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3235:1: ( rule__ColumnAction__Group_1__0__Impl rule__ColumnAction__Group_1__1 )
            // InternalCSVParserGenerator.g:3236:2: rule__ColumnAction__Group_1__0__Impl rule__ColumnAction__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalCSVParserGenerator.g:3243:1: rule__ColumnAction__Group_1__0__Impl : ( () ) ;
    public final void rule__ColumnAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3247:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3248:1: ( () )
            {
            // InternalCSVParserGenerator.g:3248:1: ( () )
            // InternalCSVParserGenerator.g:3249:2: ()
            {
             before(grammarAccess.getColumnActionAccess().getRemAction_1_0()); 
            // InternalCSVParserGenerator.g:3250:2: ()
            // InternalCSVParserGenerator.g:3250:3: 
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
    // InternalCSVParserGenerator.g:3258:1: rule__ColumnAction__Group_1__1 : rule__ColumnAction__Group_1__1__Impl rule__ColumnAction__Group_1__2 ;
    public final void rule__ColumnAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3262:1: ( rule__ColumnAction__Group_1__1__Impl rule__ColumnAction__Group_1__2 )
            // InternalCSVParserGenerator.g:3263:2: rule__ColumnAction__Group_1__1__Impl rule__ColumnAction__Group_1__2
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
    // InternalCSVParserGenerator.g:3270:1: rule__ColumnAction__Group_1__1__Impl : ( 'RemCol' ) ;
    public final void rule__ColumnAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3274:1: ( ( 'RemCol' ) )
            // InternalCSVParserGenerator.g:3275:1: ( 'RemCol' )
            {
            // InternalCSVParserGenerator.g:3275:1: ( 'RemCol' )
            // InternalCSVParserGenerator.g:3276:2: 'RemCol'
            {
             before(grammarAccess.getColumnActionAccess().getRemColKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3285:1: rule__ColumnAction__Group_1__2 : rule__ColumnAction__Group_1__2__Impl ;
    public final void rule__ColumnAction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3289:1: ( rule__ColumnAction__Group_1__2__Impl )
            // InternalCSVParserGenerator.g:3290:2: rule__ColumnAction__Group_1__2__Impl
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
    // InternalCSVParserGenerator.g:3296:1: rule__ColumnAction__Group_1__2__Impl : ( ( rule__ColumnAction__NameAssignment_1_2 ) ) ;
    public final void rule__ColumnAction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3300:1: ( ( ( rule__ColumnAction__NameAssignment_1_2 ) ) )
            // InternalCSVParserGenerator.g:3301:1: ( ( rule__ColumnAction__NameAssignment_1_2 ) )
            {
            // InternalCSVParserGenerator.g:3301:1: ( ( rule__ColumnAction__NameAssignment_1_2 ) )
            // InternalCSVParserGenerator.g:3302:2: ( rule__ColumnAction__NameAssignment_1_2 )
            {
             before(grammarAccess.getColumnActionAccess().getNameAssignment_1_2()); 
            // InternalCSVParserGenerator.g:3303:2: ( rule__ColumnAction__NameAssignment_1_2 )
            // InternalCSVParserGenerator.g:3303:3: rule__ColumnAction__NameAssignment_1_2
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
    // InternalCSVParserGenerator.g:3312:1: rule__Sum__Group__0 : rule__Sum__Group__0__Impl rule__Sum__Group__1 ;
    public final void rule__Sum__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3316:1: ( rule__Sum__Group__0__Impl rule__Sum__Group__1 )
            // InternalCSVParserGenerator.g:3317:2: rule__Sum__Group__0__Impl rule__Sum__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalCSVParserGenerator.g:3324:1: rule__Sum__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Sum__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3328:1: ( ( ruleFactor ) )
            // InternalCSVParserGenerator.g:3329:1: ( ruleFactor )
            {
            // InternalCSVParserGenerator.g:3329:1: ( ruleFactor )
            // InternalCSVParserGenerator.g:3330:2: ruleFactor
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
    // InternalCSVParserGenerator.g:3339:1: rule__Sum__Group__1 : rule__Sum__Group__1__Impl ;
    public final void rule__Sum__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3343:1: ( rule__Sum__Group__1__Impl )
            // InternalCSVParserGenerator.g:3344:2: rule__Sum__Group__1__Impl
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
    // InternalCSVParserGenerator.g:3350:1: rule__Sum__Group__1__Impl : ( ( rule__Sum__Group_1__0 )* ) ;
    public final void rule__Sum__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3354:1: ( ( ( rule__Sum__Group_1__0 )* ) )
            // InternalCSVParserGenerator.g:3355:1: ( ( rule__Sum__Group_1__0 )* )
            {
            // InternalCSVParserGenerator.g:3355:1: ( ( rule__Sum__Group_1__0 )* )
            // InternalCSVParserGenerator.g:3356:2: ( rule__Sum__Group_1__0 )*
            {
             before(grammarAccess.getSumAccess().getGroup_1()); 
            // InternalCSVParserGenerator.g:3357:2: ( rule__Sum__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=41 && LA16_0<=42)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:3357:3: rule__Sum__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__Sum__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalCSVParserGenerator.g:3366:1: rule__Sum__Group_1__0 : rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 ;
    public final void rule__Sum__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3370:1: ( rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1 )
            // InternalCSVParserGenerator.g:3371:2: rule__Sum__Group_1__0__Impl rule__Sum__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCSVParserGenerator.g:3378:1: rule__Sum__Group_1__0__Impl : ( ( rule__Sum__Alternatives_1_0 ) ) ;
    public final void rule__Sum__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3382:1: ( ( ( rule__Sum__Alternatives_1_0 ) ) )
            // InternalCSVParserGenerator.g:3383:1: ( ( rule__Sum__Alternatives_1_0 ) )
            {
            // InternalCSVParserGenerator.g:3383:1: ( ( rule__Sum__Alternatives_1_0 ) )
            // InternalCSVParserGenerator.g:3384:2: ( rule__Sum__Alternatives_1_0 )
            {
             before(grammarAccess.getSumAccess().getAlternatives_1_0()); 
            // InternalCSVParserGenerator.g:3385:2: ( rule__Sum__Alternatives_1_0 )
            // InternalCSVParserGenerator.g:3385:3: rule__Sum__Alternatives_1_0
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
    // InternalCSVParserGenerator.g:3393:1: rule__Sum__Group_1__1 : rule__Sum__Group_1__1__Impl ;
    public final void rule__Sum__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3397:1: ( rule__Sum__Group_1__1__Impl )
            // InternalCSVParserGenerator.g:3398:2: rule__Sum__Group_1__1__Impl
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
    // InternalCSVParserGenerator.g:3404:1: rule__Sum__Group_1__1__Impl : ( ( rule__Sum__RightAssignment_1_1 ) ) ;
    public final void rule__Sum__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3408:1: ( ( ( rule__Sum__RightAssignment_1_1 ) ) )
            // InternalCSVParserGenerator.g:3409:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            {
            // InternalCSVParserGenerator.g:3409:1: ( ( rule__Sum__RightAssignment_1_1 ) )
            // InternalCSVParserGenerator.g:3410:2: ( rule__Sum__RightAssignment_1_1 )
            {
             before(grammarAccess.getSumAccess().getRightAssignment_1_1()); 
            // InternalCSVParserGenerator.g:3411:2: ( rule__Sum__RightAssignment_1_1 )
            // InternalCSVParserGenerator.g:3411:3: rule__Sum__RightAssignment_1_1
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
    // InternalCSVParserGenerator.g:3420:1: rule__Sum__Group_1_0_0__0 : rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 ;
    public final void rule__Sum__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3424:1: ( rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1 )
            // InternalCSVParserGenerator.g:3425:2: rule__Sum__Group_1_0_0__0__Impl rule__Sum__Group_1_0_0__1
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
    // InternalCSVParserGenerator.g:3432:1: rule__Sum__Group_1_0_0__0__Impl : ( '+' ) ;
    public final void rule__Sum__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3436:1: ( ( '+' ) )
            // InternalCSVParserGenerator.g:3437:1: ( '+' )
            {
            // InternalCSVParserGenerator.g:3437:1: ( '+' )
            // InternalCSVParserGenerator.g:3438:2: '+'
            {
             before(grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3447:1: rule__Sum__Group_1_0_0__1 : rule__Sum__Group_1_0_0__1__Impl ;
    public final void rule__Sum__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3451:1: ( rule__Sum__Group_1_0_0__1__Impl )
            // InternalCSVParserGenerator.g:3452:2: rule__Sum__Group_1_0_0__1__Impl
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
    // InternalCSVParserGenerator.g:3458:1: rule__Sum__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3462:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3463:1: ( () )
            {
            // InternalCSVParserGenerator.g:3463:1: ( () )
            // InternalCSVParserGenerator.g:3464:2: ()
            {
             before(grammarAccess.getSumAccess().getPlusLeftAction_1_0_0_1()); 
            // InternalCSVParserGenerator.g:3465:2: ()
            // InternalCSVParserGenerator.g:3465:3: 
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
    // InternalCSVParserGenerator.g:3474:1: rule__Sum__Group_1_0_1__0 : rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 ;
    public final void rule__Sum__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3478:1: ( rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1 )
            // InternalCSVParserGenerator.g:3479:2: rule__Sum__Group_1_0_1__0__Impl rule__Sum__Group_1_0_1__1
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
    // InternalCSVParserGenerator.g:3486:1: rule__Sum__Group_1_0_1__0__Impl : ( '-' ) ;
    public final void rule__Sum__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3490:1: ( ( '-' ) )
            // InternalCSVParserGenerator.g:3491:1: ( '-' )
            {
            // InternalCSVParserGenerator.g:3491:1: ( '-' )
            // InternalCSVParserGenerator.g:3492:2: '-'
            {
             before(grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3501:1: rule__Sum__Group_1_0_1__1 : rule__Sum__Group_1_0_1__1__Impl ;
    public final void rule__Sum__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3505:1: ( rule__Sum__Group_1_0_1__1__Impl )
            // InternalCSVParserGenerator.g:3506:2: rule__Sum__Group_1_0_1__1__Impl
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
    // InternalCSVParserGenerator.g:3512:1: rule__Sum__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Sum__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3516:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3517:1: ( () )
            {
            // InternalCSVParserGenerator.g:3517:1: ( () )
            // InternalCSVParserGenerator.g:3518:2: ()
            {
             before(grammarAccess.getSumAccess().getMinusLeftAction_1_0_1_1()); 
            // InternalCSVParserGenerator.g:3519:2: ()
            // InternalCSVParserGenerator.g:3519:3: 
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
    // InternalCSVParserGenerator.g:3528:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3532:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalCSVParserGenerator.g:3533:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalCSVParserGenerator.g:3540:1: rule__Factor__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3544:1: ( ( rulePrimary ) )
            // InternalCSVParserGenerator.g:3545:1: ( rulePrimary )
            {
            // InternalCSVParserGenerator.g:3545:1: ( rulePrimary )
            // InternalCSVParserGenerator.g:3546:2: rulePrimary
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
    // InternalCSVParserGenerator.g:3555:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3559:1: ( rule__Factor__Group__1__Impl )
            // InternalCSVParserGenerator.g:3560:2: rule__Factor__Group__1__Impl
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
    // InternalCSVParserGenerator.g:3566:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3570:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalCSVParserGenerator.g:3571:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalCSVParserGenerator.g:3571:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalCSVParserGenerator.g:3572:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalCSVParserGenerator.g:3573:2: ( rule__Factor__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=43 && LA17_0<=44)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:3573:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalCSVParserGenerator.g:3582:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3586:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalCSVParserGenerator.g:3587:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalCSVParserGenerator.g:3594:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__Alternatives_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3598:1: ( ( ( rule__Factor__Alternatives_1_0 ) ) )
            // InternalCSVParserGenerator.g:3599:1: ( ( rule__Factor__Alternatives_1_0 ) )
            {
            // InternalCSVParserGenerator.g:3599:1: ( ( rule__Factor__Alternatives_1_0 ) )
            // InternalCSVParserGenerator.g:3600:2: ( rule__Factor__Alternatives_1_0 )
            {
             before(grammarAccess.getFactorAccess().getAlternatives_1_0()); 
            // InternalCSVParserGenerator.g:3601:2: ( rule__Factor__Alternatives_1_0 )
            // InternalCSVParserGenerator.g:3601:3: rule__Factor__Alternatives_1_0
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
    // InternalCSVParserGenerator.g:3609:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3613:1: ( rule__Factor__Group_1__1__Impl )
            // InternalCSVParserGenerator.g:3614:2: rule__Factor__Group_1__1__Impl
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
    // InternalCSVParserGenerator.g:3620:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3624:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalCSVParserGenerator.g:3625:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalCSVParserGenerator.g:3625:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalCSVParserGenerator.g:3626:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalCSVParserGenerator.g:3627:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalCSVParserGenerator.g:3627:3: rule__Factor__RightAssignment_1_1
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
    // InternalCSVParserGenerator.g:3636:1: rule__Factor__Group_1_0_0__0 : rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 ;
    public final void rule__Factor__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3640:1: ( rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 )
            // InternalCSVParserGenerator.g:3641:2: rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1
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
    // InternalCSVParserGenerator.g:3648:1: rule__Factor__Group_1_0_0__0__Impl : ( '*' ) ;
    public final void rule__Factor__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3652:1: ( ( '*' ) )
            // InternalCSVParserGenerator.g:3653:1: ( '*' )
            {
            // InternalCSVParserGenerator.g:3653:1: ( '*' )
            // InternalCSVParserGenerator.g:3654:2: '*'
            {
             before(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3663:1: rule__Factor__Group_1_0_0__1 : rule__Factor__Group_1_0_0__1__Impl ;
    public final void rule__Factor__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3667:1: ( rule__Factor__Group_1_0_0__1__Impl )
            // InternalCSVParserGenerator.g:3668:2: rule__Factor__Group_1_0_0__1__Impl
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
    // InternalCSVParserGenerator.g:3674:1: rule__Factor__Group_1_0_0__1__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3678:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3679:1: ( () )
            {
            // InternalCSVParserGenerator.g:3679:1: ( () )
            // InternalCSVParserGenerator.g:3680:2: ()
            {
             before(grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1()); 
            // InternalCSVParserGenerator.g:3681:2: ()
            // InternalCSVParserGenerator.g:3681:3: 
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
    // InternalCSVParserGenerator.g:3690:1: rule__Factor__Group_1_0_1__0 : rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 ;
    public final void rule__Factor__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3694:1: ( rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 )
            // InternalCSVParserGenerator.g:3695:2: rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1
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
    // InternalCSVParserGenerator.g:3702:1: rule__Factor__Group_1_0_1__0__Impl : ( '/' ) ;
    public final void rule__Factor__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3706:1: ( ( '/' ) )
            // InternalCSVParserGenerator.g:3707:1: ( '/' )
            {
            // InternalCSVParserGenerator.g:3707:1: ( '/' )
            // InternalCSVParserGenerator.g:3708:2: '/'
            {
             before(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3717:1: rule__Factor__Group_1_0_1__1 : rule__Factor__Group_1_0_1__1__Impl ;
    public final void rule__Factor__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3721:1: ( rule__Factor__Group_1_0_1__1__Impl )
            // InternalCSVParserGenerator.g:3722:2: rule__Factor__Group_1_0_1__1__Impl
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
    // InternalCSVParserGenerator.g:3728:1: rule__Factor__Group_1_0_1__1__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3732:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3733:1: ( () )
            {
            // InternalCSVParserGenerator.g:3733:1: ( () )
            // InternalCSVParserGenerator.g:3734:2: ()
            {
             before(grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1()); 
            // InternalCSVParserGenerator.g:3735:2: ()
            // InternalCSVParserGenerator.g:3735:3: 
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
    // InternalCSVParserGenerator.g:3744:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3748:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalCSVParserGenerator.g:3749:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalCSVParserGenerator.g:3756:1: rule__Number__Group__0__Impl : ( () ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3760:1: ( ( () ) )
            // InternalCSVParserGenerator.g:3761:1: ( () )
            {
            // InternalCSVParserGenerator.g:3761:1: ( () )
            // InternalCSVParserGenerator.g:3762:2: ()
            {
             before(grammarAccess.getNumberAccess().getNumAction_0()); 
            // InternalCSVParserGenerator.g:3763:2: ()
            // InternalCSVParserGenerator.g:3763:3: 
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
    // InternalCSVParserGenerator.g:3771:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3775:1: ( rule__Number__Group__1__Impl )
            // InternalCSVParserGenerator.g:3776:2: rule__Number__Group__1__Impl
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
    // InternalCSVParserGenerator.g:3782:1: rule__Number__Group__1__Impl : ( ( rule__Number__ValueAssignment_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3786:1: ( ( ( rule__Number__ValueAssignment_1 ) ) )
            // InternalCSVParserGenerator.g:3787:1: ( ( rule__Number__ValueAssignment_1 ) )
            {
            // InternalCSVParserGenerator.g:3787:1: ( ( rule__Number__ValueAssignment_1 ) )
            // InternalCSVParserGenerator.g:3788:2: ( rule__Number__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment_1()); 
            // InternalCSVParserGenerator.g:3789:2: ( rule__Number__ValueAssignment_1 )
            // InternalCSVParserGenerator.g:3789:3: rule__Number__ValueAssignment_1
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
    // InternalCSVParserGenerator.g:3798:1: rule__Constraint__Group__0 : rule__Constraint__Group__0__Impl rule__Constraint__Group__1 ;
    public final void rule__Constraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3802:1: ( rule__Constraint__Group__0__Impl rule__Constraint__Group__1 )
            // InternalCSVParserGenerator.g:3803:2: rule__Constraint__Group__0__Impl rule__Constraint__Group__1
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
    // InternalCSVParserGenerator.g:3810:1: rule__Constraint__Group__0__Impl : ( 'satisfies' ) ;
    public final void rule__Constraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3814:1: ( ( 'satisfies' ) )
            // InternalCSVParserGenerator.g:3815:1: ( 'satisfies' )
            {
            // InternalCSVParserGenerator.g:3815:1: ( 'satisfies' )
            // InternalCSVParserGenerator.g:3816:2: 'satisfies'
            {
             before(grammarAccess.getConstraintAccess().getSatisfiesKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3825:1: rule__Constraint__Group__1 : rule__Constraint__Group__1__Impl rule__Constraint__Group__2 ;
    public final void rule__Constraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3829:1: ( rule__Constraint__Group__1__Impl rule__Constraint__Group__2 )
            // InternalCSVParserGenerator.g:3830:2: rule__Constraint__Group__1__Impl rule__Constraint__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalCSVParserGenerator.g:3837:1: rule__Constraint__Group__1__Impl : ( ( rule__Constraint__NameAssignment_1 ) ) ;
    public final void rule__Constraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3841:1: ( ( ( rule__Constraint__NameAssignment_1 ) ) )
            // InternalCSVParserGenerator.g:3842:1: ( ( rule__Constraint__NameAssignment_1 ) )
            {
            // InternalCSVParserGenerator.g:3842:1: ( ( rule__Constraint__NameAssignment_1 ) )
            // InternalCSVParserGenerator.g:3843:2: ( rule__Constraint__NameAssignment_1 )
            {
             before(grammarAccess.getConstraintAccess().getNameAssignment_1()); 
            // InternalCSVParserGenerator.g:3844:2: ( rule__Constraint__NameAssignment_1 )
            // InternalCSVParserGenerator.g:3844:3: rule__Constraint__NameAssignment_1
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
    // InternalCSVParserGenerator.g:3852:1: rule__Constraint__Group__2 : rule__Constraint__Group__2__Impl rule__Constraint__Group__3 ;
    public final void rule__Constraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3856:1: ( rule__Constraint__Group__2__Impl rule__Constraint__Group__3 )
            // InternalCSVParserGenerator.g:3857:2: rule__Constraint__Group__2__Impl rule__Constraint__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalCSVParserGenerator.g:3864:1: rule__Constraint__Group__2__Impl : ( 'constraint' ) ;
    public final void rule__Constraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3868:1: ( ( 'constraint' ) )
            // InternalCSVParserGenerator.g:3869:1: ( 'constraint' )
            {
            // InternalCSVParserGenerator.g:3869:1: ( 'constraint' )
            // InternalCSVParserGenerator.g:3870:2: 'constraint'
            {
             before(grammarAccess.getConstraintAccess().getConstraintKeyword_2()); 
            match(input,46,FOLLOW_2); 
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
    // InternalCSVParserGenerator.g:3879:1: rule__Constraint__Group__3 : rule__Constraint__Group__3__Impl ;
    public final void rule__Constraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3883:1: ( rule__Constraint__Group__3__Impl )
            // InternalCSVParserGenerator.g:3884:2: rule__Constraint__Group__3__Impl
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
    // InternalCSVParserGenerator.g:3890:1: rule__Constraint__Group__3__Impl : ( ( rule__Constraint__ExpAssignment_3 ) ) ;
    public final void rule__Constraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3894:1: ( ( ( rule__Constraint__ExpAssignment_3 ) ) )
            // InternalCSVParserGenerator.g:3895:1: ( ( rule__Constraint__ExpAssignment_3 ) )
            {
            // InternalCSVParserGenerator.g:3895:1: ( ( rule__Constraint__ExpAssignment_3 ) )
            // InternalCSVParserGenerator.g:3896:2: ( rule__Constraint__ExpAssignment_3 )
            {
             before(grammarAccess.getConstraintAccess().getExpAssignment_3()); 
            // InternalCSVParserGenerator.g:3897:2: ( rule__Constraint__ExpAssignment_3 )
            // InternalCSVParserGenerator.g:3897:3: rule__Constraint__ExpAssignment_3
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


    // $ANTLR start "rule__Parser__FileAssignment_0"
    // InternalCSVParserGenerator.g:3906:1: rule__Parser__FileAssignment_0 : ( ruleFileDecl ) ;
    public final void rule__Parser__FileAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3910:1: ( ( ruleFileDecl ) )
            // InternalCSVParserGenerator.g:3911:2: ( ruleFileDecl )
            {
            // InternalCSVParserGenerator.g:3911:2: ( ruleFileDecl )
            // InternalCSVParserGenerator.g:3912:3: ruleFileDecl
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
    // InternalCSVParserGenerator.g:3921:1: rule__Parser__ColumnsAssignment_3 : ( ruleColDecl ) ;
    public final void rule__Parser__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3925:1: ( ( ruleColDecl ) )
            // InternalCSVParserGenerator.g:3926:2: ( ruleColDecl )
            {
            // InternalCSVParserGenerator.g:3926:2: ( ruleColDecl )
            // InternalCSVParserGenerator.g:3927:3: ruleColDecl
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
    // InternalCSVParserGenerator.g:3936:1: rule__Parser__ModsAssignment_5 : ( ruleModification ) ;
    public final void rule__Parser__ModsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3940:1: ( ( ruleModification ) )
            // InternalCSVParserGenerator.g:3941:2: ( ruleModification )
            {
            // InternalCSVParserGenerator.g:3941:2: ( ruleModification )
            // InternalCSVParserGenerator.g:3942:3: ruleModification
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
    // InternalCSVParserGenerator.g:3951:1: rule__Parser__OutAssignment_6 : ( ruleOutput ) ;
    public final void rule__Parser__OutAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3955:1: ( ( ruleOutput ) )
            // InternalCSVParserGenerator.g:3956:2: ( ruleOutput )
            {
            // InternalCSVParserGenerator.g:3956:2: ( ruleOutput )
            // InternalCSVParserGenerator.g:3957:3: ruleOutput
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
    // InternalCSVParserGenerator.g:3966:1: rule__FileDecl__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FileDecl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3970:1: ( ( RULE_STRING ) )
            // InternalCSVParserGenerator.g:3971:2: ( RULE_STRING )
            {
            // InternalCSVParserGenerator.g:3971:2: ( RULE_STRING )
            // InternalCSVParserGenerator.g:3972:3: RULE_STRING
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


    // $ANTLR start "rule__ColDecl__NameAssignment_0"
    // InternalCSVParserGenerator.g:3981:1: rule__ColDecl__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ColDecl__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:3985:1: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:3986:2: ( RULE_ID )
            {
            // InternalCSVParserGenerator.g:3986:2: ( RULE_ID )
            // InternalCSVParserGenerator.g:3987:3: RULE_ID
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
    // InternalCSVParserGenerator.g:3996:1: rule__ColDecl__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__ColDecl__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4000:1: ( ( ruleType ) )
            // InternalCSVParserGenerator.g:4001:2: ( ruleType )
            {
            // InternalCSVParserGenerator.g:4001:2: ( ruleType )
            // InternalCSVParserGenerator.g:4002:3: ruleType
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
    // InternalCSVParserGenerator.g:4011:1: rule__ColDecl__ModsAssignment_3 : ( ruleModification ) ;
    public final void rule__ColDecl__ModsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4015:1: ( ( ruleModification ) )
            // InternalCSVParserGenerator.g:4016:2: ( ruleModification )
            {
            // InternalCSVParserGenerator.g:4016:2: ( ruleModification )
            // InternalCSVParserGenerator.g:4017:3: ruleModification
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


    // $ANTLR start "rule__Output__NameAssignment_2"
    // InternalCSVParserGenerator.g:4026:1: rule__Output__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Output__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4030:1: ( ( RULE_STRING ) )
            // InternalCSVParserGenerator.g:4031:2: ( RULE_STRING )
            {
            // InternalCSVParserGenerator.g:4031:2: ( RULE_STRING )
            // InternalCSVParserGenerator.g:4032:3: RULE_STRING
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


    // $ANTLR start "rule__ValueMod__NameAssignment_0"
    // InternalCSVParserGenerator.g:4041:1: rule__ValueMod__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ValueMod__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4045:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:4046:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:4046:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4047:3: ( RULE_ID )
            {
             before(grammarAccess.getValueModAccess().getNameColDeclCrossReference_0_0()); 
            // InternalCSVParserGenerator.g:4048:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:4049:4: RULE_ID
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
    // InternalCSVParserGenerator.g:4060:1: rule__ValueMod__ExpAssignment_2 : ( ruleLogExp ) ;
    public final void rule__ValueMod__ExpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4064:1: ( ( ruleLogExp ) )
            // InternalCSVParserGenerator.g:4065:2: ( ruleLogExp )
            {
            // InternalCSVParserGenerator.g:4065:2: ( ruleLogExp )
            // InternalCSVParserGenerator.g:4066:3: ruleLogExp
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
    // InternalCSVParserGenerator.g:4075:1: rule__LogExp__RightAssignment_1_1 : ( ruleComparison ) ;
    public final void rule__LogExp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4079:1: ( ( ruleComparison ) )
            // InternalCSVParserGenerator.g:4080:2: ( ruleComparison )
            {
            // InternalCSVParserGenerator.g:4080:2: ( ruleComparison )
            // InternalCSVParserGenerator.g:4081:3: ruleComparison
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
    // InternalCSVParserGenerator.g:4090:1: rule__Comparison__RightAssignment_1_1 : ( ruleSum ) ;
    public final void rule__Comparison__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4094:1: ( ( ruleSum ) )
            // InternalCSVParserGenerator.g:4095:2: ( ruleSum )
            {
            // InternalCSVParserGenerator.g:4095:2: ( ruleSum )
            // InternalCSVParserGenerator.g:4096:3: ruleSum
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
    // InternalCSVParserGenerator.g:4105:1: rule__Parens__ExpAssignment_1 : ( ruleLogExp ) ;
    public final void rule__Parens__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4109:1: ( ( ruleLogExp ) )
            // InternalCSVParserGenerator.g:4110:2: ( ruleLogExp )
            {
            // InternalCSVParserGenerator.g:4110:2: ( ruleLogExp )
            // InternalCSVParserGenerator.g:4111:3: ruleLogExp
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
    // InternalCSVParserGenerator.g:4120:1: rule__External__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__External__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4124:1: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4125:2: ( RULE_ID )
            {
            // InternalCSVParserGenerator.g:4125:2: ( RULE_ID )
            // InternalCSVParserGenerator.g:4126:3: RULE_ID
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
    // InternalCSVParserGenerator.g:4135:1: rule__External__InpAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__External__InpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4139:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:4140:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:4140:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4141:3: ( RULE_ID )
            {
             before(grammarAccess.getExternalAccess().getInpColDeclCrossReference_3_0()); 
            // InternalCSVParserGenerator.g:4142:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:4143:4: RULE_ID
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
    // InternalCSVParserGenerator.g:4154:1: rule__StatFunc__InputAssignment_0_3 : ( ( RULE_ID ) ) ;
    public final void rule__StatFunc__InputAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4158:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:4159:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:4159:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4160:3: ( RULE_ID )
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_0_3_0()); 
            // InternalCSVParserGenerator.g:4161:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:4162:4: RULE_ID
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
    // InternalCSVParserGenerator.g:4173:1: rule__StatFunc__InputAssignment_1_3 : ( ( RULE_ID ) ) ;
    public final void rule__StatFunc__InputAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4177:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:4178:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:4178:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4179:3: ( RULE_ID )
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_1_3_0()); 
            // InternalCSVParserGenerator.g:4180:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:4181:4: RULE_ID
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
    // InternalCSVParserGenerator.g:4192:1: rule__StatFunc__InputAssignment_2_3 : ( ( RULE_ID ) ) ;
    public final void rule__StatFunc__InputAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4196:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:4197:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:4197:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4198:3: ( RULE_ID )
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_2_3_0()); 
            // InternalCSVParserGenerator.g:4199:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:4200:4: RULE_ID
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
    // InternalCSVParserGenerator.g:4211:1: rule__StatFunc__InputAssignment_3_3 : ( ( RULE_ID ) ) ;
    public final void rule__StatFunc__InputAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4215:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:4216:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:4216:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4217:3: ( RULE_ID )
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_3_3_0()); 
            // InternalCSVParserGenerator.g:4218:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:4219:4: RULE_ID
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
    // InternalCSVParserGenerator.g:4230:1: rule__StatFunc__InputAssignment_4_3 : ( ( RULE_ID ) ) ;
    public final void rule__StatFunc__InputAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4234:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:4235:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:4235:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4236:3: ( RULE_ID )
            {
             before(grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_4_3_0()); 
            // InternalCSVParserGenerator.g:4237:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:4238:4: RULE_ID
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
    // InternalCSVParserGenerator.g:4249:1: rule__ColumnAction__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__ColumnAction__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4253:1: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4254:2: ( RULE_ID )
            {
            // InternalCSVParserGenerator.g:4254:2: ( RULE_ID )
            // InternalCSVParserGenerator.g:4255:3: RULE_ID
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


    // $ANTLR start "rule__ColumnAction__ModAssignment_0_4"
    // InternalCSVParserGenerator.g:4264:1: rule__ColumnAction__ModAssignment_0_4 : ( ruleLogExp ) ;
    public final void rule__ColumnAction__ModAssignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4268:1: ( ( ruleLogExp ) )
            // InternalCSVParserGenerator.g:4269:2: ( ruleLogExp )
            {
            // InternalCSVParserGenerator.g:4269:2: ( ruleLogExp )
            // InternalCSVParserGenerator.g:4270:3: ruleLogExp
            {
             before(grammarAccess.getColumnActionAccess().getModLogExpParserRuleCall_0_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLogExp();

            state._fsp--;

             after(grammarAccess.getColumnActionAccess().getModLogExpParserRuleCall_0_4_0()); 

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
    // $ANTLR end "rule__ColumnAction__ModAssignment_0_4"


    // $ANTLR start "rule__ColumnAction__NameAssignment_1_2"
    // InternalCSVParserGenerator.g:4279:1: rule__ColumnAction__NameAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__ColumnAction__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4283:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:4284:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:4284:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4285:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnActionAccess().getNameColDeclCrossReference_1_2_0()); 
            // InternalCSVParserGenerator.g:4286:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:4287:4: RULE_ID
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
    // InternalCSVParserGenerator.g:4298:1: rule__Sum__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Sum__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4302:1: ( ( ruleFactor ) )
            // InternalCSVParserGenerator.g:4303:2: ( ruleFactor )
            {
            // InternalCSVParserGenerator.g:4303:2: ( ruleFactor )
            // InternalCSVParserGenerator.g:4304:3: ruleFactor
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
    // InternalCSVParserGenerator.g:4313:1: rule__Factor__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4317:1: ( ( rulePrimary ) )
            // InternalCSVParserGenerator.g:4318:2: ( rulePrimary )
            {
            // InternalCSVParserGenerator.g:4318:2: ( rulePrimary )
            // InternalCSVParserGenerator.g:4319:3: rulePrimary
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
    // InternalCSVParserGenerator.g:4328:1: rule__ColumnVar__NameAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ColumnVar__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4332:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:4333:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:4333:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4334:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnVarAccess().getNameColDeclCrossReference_0()); 
            // InternalCSVParserGenerator.g:4335:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:4336:4: RULE_ID
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
    // InternalCSVParserGenerator.g:4347:1: rule__Number__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4351:1: ( ( RULE_INT ) )
            // InternalCSVParserGenerator.g:4352:2: ( RULE_INT )
            {
            // InternalCSVParserGenerator.g:4352:2: ( RULE_INT )
            // InternalCSVParserGenerator.g:4353:3: RULE_INT
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
    // InternalCSVParserGenerator.g:4362:1: rule__Constraint__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Constraint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4366:1: ( ( ( RULE_ID ) ) )
            // InternalCSVParserGenerator.g:4367:2: ( ( RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:4367:2: ( ( RULE_ID ) )
            // InternalCSVParserGenerator.g:4368:3: ( RULE_ID )
            {
             before(grammarAccess.getConstraintAccess().getNameColDeclCrossReference_1_0()); 
            // InternalCSVParserGenerator.g:4369:3: ( RULE_ID )
            // InternalCSVParserGenerator.g:4370:4: RULE_ID
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
    // InternalCSVParserGenerator.g:4381:1: rule__Constraint__ExpAssignment_3 : ( ruleLogExp ) ;
    public final void rule__Constraint__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCSVParserGenerator.g:4385:1: ( ( ruleLogExp ) )
            // InternalCSVParserGenerator.g:4386:2: ( ruleLogExp )
            {
            // InternalCSVParserGenerator.g:4386:2: ( ruleLogExp )
            // InternalCSVParserGenerator.g:4387:3: ruleLogExp
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000217F00010020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000217F00000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000217F00000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003F000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000014000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});

}