package dk.sdu.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mdsd.services.CSVParserGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSVParserGeneratorParser extends AbstractInternalAntlrParser {
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

        public InternalCSVParserGeneratorParser(TokenStream input, CSVParserGeneratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Parser";
       	}

       	@Override
       	protected CSVParserGeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleParser"
    // InternalCSVParserGenerator.g:64:1: entryRuleParser returns [EObject current=null] : iv_ruleParser= ruleParser EOF ;
    public final EObject entryRuleParser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParser = null;


        try {
            // InternalCSVParserGenerator.g:64:47: (iv_ruleParser= ruleParser EOF )
            // InternalCSVParserGenerator.g:65:2: iv_ruleParser= ruleParser EOF
            {
             newCompositeNode(grammarAccess.getParserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParser=ruleParser();

            state._fsp--;

             current =iv_ruleParser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParser"


    // $ANTLR start "ruleParser"
    // InternalCSVParserGenerator.g:71:1: ruleParser returns [EObject current=null] : ( ( (lv_file_0_0= ruleFileDecl ) )? otherlv_1= 'columns' otherlv_2= '{' ( (lv_columns_3_0= ruleColDecl ) )+ otherlv_4= '}' ( (lv_mods_5_0= ruleModification ) )* ( (lv_out_6_0= ruleOutput ) )? ) ;
    public final EObject ruleParser() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_file_0_0 = null;

        EObject lv_columns_3_0 = null;

        EObject lv_mods_5_0 = null;

        EObject lv_out_6_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:77:2: ( ( ( (lv_file_0_0= ruleFileDecl ) )? otherlv_1= 'columns' otherlv_2= '{' ( (lv_columns_3_0= ruleColDecl ) )+ otherlv_4= '}' ( (lv_mods_5_0= ruleModification ) )* ( (lv_out_6_0= ruleOutput ) )? ) )
            // InternalCSVParserGenerator.g:78:2: ( ( (lv_file_0_0= ruleFileDecl ) )? otherlv_1= 'columns' otherlv_2= '{' ( (lv_columns_3_0= ruleColDecl ) )+ otherlv_4= '}' ( (lv_mods_5_0= ruleModification ) )* ( (lv_out_6_0= ruleOutput ) )? )
            {
            // InternalCSVParserGenerator.g:78:2: ( ( (lv_file_0_0= ruleFileDecl ) )? otherlv_1= 'columns' otherlv_2= '{' ( (lv_columns_3_0= ruleColDecl ) )+ otherlv_4= '}' ( (lv_mods_5_0= ruleModification ) )* ( (lv_out_6_0= ruleOutput ) )? )
            // InternalCSVParserGenerator.g:79:3: ( (lv_file_0_0= ruleFileDecl ) )? otherlv_1= 'columns' otherlv_2= '{' ( (lv_columns_3_0= ruleColDecl ) )+ otherlv_4= '}' ( (lv_mods_5_0= ruleModification ) )* ( (lv_out_6_0= ruleOutput ) )?
            {
            // InternalCSVParserGenerator.g:79:3: ( (lv_file_0_0= ruleFileDecl ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCSVParserGenerator.g:80:4: (lv_file_0_0= ruleFileDecl )
                    {
                    // InternalCSVParserGenerator.g:80:4: (lv_file_0_0= ruleFileDecl )
                    // InternalCSVParserGenerator.g:81:5: lv_file_0_0= ruleFileDecl
                    {

                    					newCompositeNode(grammarAccess.getParserAccess().getFileFileDeclParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_file_0_0=ruleFileDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParserRule());
                    					}
                    					set(
                    						current,
                    						"file",
                    						lv_file_0_0,
                    						"dk.sdu.mdsd.CSVParserGenerator.FileDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParserAccess().getColumnsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParserAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCSVParserGenerator.g:106:3: ( (lv_columns_3_0= ruleColDecl ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:107:4: (lv_columns_3_0= ruleColDecl )
            	    {
            	    // InternalCSVParserGenerator.g:107:4: (lv_columns_3_0= ruleColDecl )
            	    // InternalCSVParserGenerator.g:108:5: lv_columns_3_0= ruleColDecl
            	    {

            	    					newCompositeNode(grammarAccess.getParserAccess().getColumnsColDeclParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_columns_3_0=ruleColDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParserRule());
            	    					}
            	    					add(
            	    						current,
            	    						"columns",
            	    						lv_columns_3_0,
            	    						"dk.sdu.mdsd.CSVParserGenerator.ColDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getParserAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalCSVParserGenerator.g:129:3: ( (lv_mods_5_0= ruleModification ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=17 && LA3_0<=21)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:130:4: (lv_mods_5_0= ruleModification )
            	    {
            	    // InternalCSVParserGenerator.g:130:4: (lv_mods_5_0= ruleModification )
            	    // InternalCSVParserGenerator.g:131:5: lv_mods_5_0= ruleModification
            	    {

            	    					newCompositeNode(grammarAccess.getParserAccess().getModsModificationParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_mods_5_0=ruleModification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParserRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mods",
            	    						lv_mods_5_0,
            	    						"dk.sdu.mdsd.CSVParserGenerator.Modification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalCSVParserGenerator.g:148:3: ( (lv_out_6_0= ruleOutput ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCSVParserGenerator.g:149:4: (lv_out_6_0= ruleOutput )
                    {
                    // InternalCSVParserGenerator.g:149:4: (lv_out_6_0= ruleOutput )
                    // InternalCSVParserGenerator.g:150:5: lv_out_6_0= ruleOutput
                    {

                    					newCompositeNode(grammarAccess.getParserAccess().getOutOutputParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_out_6_0=ruleOutput();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParserRule());
                    					}
                    					set(
                    						current,
                    						"out",
                    						lv_out_6_0,
                    						"dk.sdu.mdsd.CSVParserGenerator.Output");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParser"


    // $ANTLR start "entryRuleFileDecl"
    // InternalCSVParserGenerator.g:171:1: entryRuleFileDecl returns [EObject current=null] : iv_ruleFileDecl= ruleFileDecl EOF ;
    public final EObject entryRuleFileDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileDecl = null;


        try {
            // InternalCSVParserGenerator.g:171:49: (iv_ruleFileDecl= ruleFileDecl EOF )
            // InternalCSVParserGenerator.g:172:2: iv_ruleFileDecl= ruleFileDecl EOF
            {
             newCompositeNode(grammarAccess.getFileDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileDecl=ruleFileDecl();

            state._fsp--;

             current =iv_ruleFileDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileDecl"


    // $ANTLR start "ruleFileDecl"
    // InternalCSVParserGenerator.g:178:1: ruleFileDecl returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'separator' ( (lv_sepchar_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleFileDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_sepchar_4_0=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:184:2: ( (otherlv_0= 'file' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'separator' ( (lv_sepchar_4_0= RULE_STRING ) ) ) )
            // InternalCSVParserGenerator.g:185:2: (otherlv_0= 'file' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'separator' ( (lv_sepchar_4_0= RULE_STRING ) ) )
            {
            // InternalCSVParserGenerator.g:185:2: (otherlv_0= 'file' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'separator' ( (lv_sepchar_4_0= RULE_STRING ) ) )
            // InternalCSVParserGenerator.g:186:3: otherlv_0= 'file' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'separator' ( (lv_sepchar_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getFileDeclAccess().getFileKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getFileDeclAccess().getColonKeyword_1());
            		
            // InternalCSVParserGenerator.g:194:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalCSVParserGenerator.g:195:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalCSVParserGenerator.g:195:4: (lv_name_2_0= RULE_STRING )
            // InternalCSVParserGenerator.g:196:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFileDeclAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getFileDeclAccess().getSeparatorKeyword_3());
            		
            // InternalCSVParserGenerator.g:216:3: ( (lv_sepchar_4_0= RULE_STRING ) )
            // InternalCSVParserGenerator.g:217:4: (lv_sepchar_4_0= RULE_STRING )
            {
            // InternalCSVParserGenerator.g:217:4: (lv_sepchar_4_0= RULE_STRING )
            // InternalCSVParserGenerator.g:218:5: lv_sepchar_4_0= RULE_STRING
            {
            lv_sepchar_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_sepchar_4_0, grammarAccess.getFileDeclAccess().getSepcharSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"sepchar",
            						lv_sepchar_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileDecl"


    // $ANTLR start "entryRuleColDecl"
    // InternalCSVParserGenerator.g:238:1: entryRuleColDecl returns [EObject current=null] : iv_ruleColDecl= ruleColDecl EOF ;
    public final EObject entryRuleColDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColDecl = null;


        try {
            // InternalCSVParserGenerator.g:238:48: (iv_ruleColDecl= ruleColDecl EOF )
            // InternalCSVParserGenerator.g:239:2: iv_ruleColDecl= ruleColDecl EOF
            {
             newCompositeNode(grammarAccess.getColDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColDecl=ruleColDecl();

            state._fsp--;

             current =iv_ruleColDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColDecl"


    // $ANTLR start "ruleColDecl"
    // InternalCSVParserGenerator.g:245:1: ruleColDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_mods_3_0= ruleModification ) )* ) ;
    public final EObject ruleColDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;

        EObject lv_mods_3_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:251:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_mods_3_0= ruleModification ) )* ) )
            // InternalCSVParserGenerator.g:252:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_mods_3_0= ruleModification ) )* )
            {
            // InternalCSVParserGenerator.g:252:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_mods_3_0= ruleModification ) )* )
            // InternalCSVParserGenerator.g:253:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_mods_3_0= ruleModification ) )*
            {
            // InternalCSVParserGenerator.g:253:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCSVParserGenerator.g:254:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCSVParserGenerator.g:254:4: (lv_name_0_0= RULE_ID )
            // InternalCSVParserGenerator.g:255:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getColDeclAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getColDeclAccess().getColonKeyword_1());
            		
            // InternalCSVParserGenerator.g:275:3: ( (lv_type_2_0= ruleType ) )
            // InternalCSVParserGenerator.g:276:4: (lv_type_2_0= ruleType )
            {
            // InternalCSVParserGenerator.g:276:4: (lv_type_2_0= ruleType )
            // InternalCSVParserGenerator.g:277:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getColDeclAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColDeclRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"dk.sdu.mdsd.CSVParserGenerator.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCSVParserGenerator.g:294:3: ( (lv_mods_3_0= ruleModification ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:295:4: (lv_mods_3_0= ruleModification )
            	    {
            	    // InternalCSVParserGenerator.g:295:4: (lv_mods_3_0= ruleModification )
            	    // InternalCSVParserGenerator.g:296:5: lv_mods_3_0= ruleModification
            	    {

            	    					newCompositeNode(grammarAccess.getColDeclAccess().getModsModificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_mods_3_0=ruleModification();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getColDeclRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mods",
            	    						lv_mods_3_0,
            	    						"dk.sdu.mdsd.CSVParserGenerator.Modification");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColDecl"


    // $ANTLR start "entryRuleModification"
    // InternalCSVParserGenerator.g:317:1: entryRuleModification returns [EObject current=null] : iv_ruleModification= ruleModification EOF ;
    public final EObject entryRuleModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModification = null;


        try {
            // InternalCSVParserGenerator.g:317:53: (iv_ruleModification= ruleModification EOF )
            // InternalCSVParserGenerator.g:318:2: iv_ruleModification= ruleModification EOF
            {
             newCompositeNode(grammarAccess.getModificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModification=ruleModification();

            state._fsp--;

             current =iv_ruleModification; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModification"


    // $ANTLR start "ruleModification"
    // InternalCSVParserGenerator.g:324:1: ruleModification returns [EObject current=null] : ( ( () otherlv_1= 'modifications' otherlv_2= '{' ( (lv_mods_3_0= ruleValueMod ) )* otherlv_4= '}' ) | ( () otherlv_6= 'externals' otherlv_7= '{' ( (lv_mods_8_0= ruleExternal ) )* otherlv_9= '}' ) | ( () otherlv_11= 'statistics' otherlv_12= '{' ( (lv_mods_13_0= ruleStatFunc ) )* otherlv_14= '}' ) | ( () otherlv_16= 'layout' otherlv_17= '{' ( (lv_mods_18_0= ruleColumnAction ) )* otherlv_19= '}' ) | ( () otherlv_21= 'constraints' otherlv_22= '{' ( (lv_mods_23_0= ruleConstraint ) )* otherlv_24= '}' ) ) ;
    public final EObject ruleModification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        EObject lv_mods_3_0 = null;

        EObject lv_mods_8_0 = null;

        EObject lv_mods_13_0 = null;

        EObject lv_mods_18_0 = null;

        EObject lv_mods_23_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:330:2: ( ( ( () otherlv_1= 'modifications' otherlv_2= '{' ( (lv_mods_3_0= ruleValueMod ) )* otherlv_4= '}' ) | ( () otherlv_6= 'externals' otherlv_7= '{' ( (lv_mods_8_0= ruleExternal ) )* otherlv_9= '}' ) | ( () otherlv_11= 'statistics' otherlv_12= '{' ( (lv_mods_13_0= ruleStatFunc ) )* otherlv_14= '}' ) | ( () otherlv_16= 'layout' otherlv_17= '{' ( (lv_mods_18_0= ruleColumnAction ) )* otherlv_19= '}' ) | ( () otherlv_21= 'constraints' otherlv_22= '{' ( (lv_mods_23_0= ruleConstraint ) )* otherlv_24= '}' ) ) )
            // InternalCSVParserGenerator.g:331:2: ( ( () otherlv_1= 'modifications' otherlv_2= '{' ( (lv_mods_3_0= ruleValueMod ) )* otherlv_4= '}' ) | ( () otherlv_6= 'externals' otherlv_7= '{' ( (lv_mods_8_0= ruleExternal ) )* otherlv_9= '}' ) | ( () otherlv_11= 'statistics' otherlv_12= '{' ( (lv_mods_13_0= ruleStatFunc ) )* otherlv_14= '}' ) | ( () otherlv_16= 'layout' otherlv_17= '{' ( (lv_mods_18_0= ruleColumnAction ) )* otherlv_19= '}' ) | ( () otherlv_21= 'constraints' otherlv_22= '{' ( (lv_mods_23_0= ruleConstraint ) )* otherlv_24= '}' ) )
            {
            // InternalCSVParserGenerator.g:331:2: ( ( () otherlv_1= 'modifications' otherlv_2= '{' ( (lv_mods_3_0= ruleValueMod ) )* otherlv_4= '}' ) | ( () otherlv_6= 'externals' otherlv_7= '{' ( (lv_mods_8_0= ruleExternal ) )* otherlv_9= '}' ) | ( () otherlv_11= 'statistics' otherlv_12= '{' ( (lv_mods_13_0= ruleStatFunc ) )* otherlv_14= '}' ) | ( () otherlv_16= 'layout' otherlv_17= '{' ( (lv_mods_18_0= ruleColumnAction ) )* otherlv_19= '}' ) | ( () otherlv_21= 'constraints' otherlv_22= '{' ( (lv_mods_23_0= ruleConstraint ) )* otherlv_24= '}' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case 19:
                {
                alt11=3;
                }
                break;
            case 20:
                {
                alt11=4;
                }
                break;
            case 21:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalCSVParserGenerator.g:332:3: ( () otherlv_1= 'modifications' otherlv_2= '{' ( (lv_mods_3_0= ruleValueMod ) )* otherlv_4= '}' )
                    {
                    // InternalCSVParserGenerator.g:332:3: ( () otherlv_1= 'modifications' otherlv_2= '{' ( (lv_mods_3_0= ruleValueMod ) )* otherlv_4= '}' )
                    // InternalCSVParserGenerator.g:333:4: () otherlv_1= 'modifications' otherlv_2= '{' ( (lv_mods_3_0= ruleValueMod ) )* otherlv_4= '}'
                    {
                    // InternalCSVParserGenerator.g:333:4: ()
                    // InternalCSVParserGenerator.g:334:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getModificationAccess().getValueMAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getModificationAccess().getModificationsKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_0_2());
                    			
                    // InternalCSVParserGenerator.g:348:4: ( (lv_mods_3_0= ruleValueMod ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCSVParserGenerator.g:349:5: (lv_mods_3_0= ruleValueMod )
                    	    {
                    	    // InternalCSVParserGenerator.g:349:5: (lv_mods_3_0= ruleValueMod )
                    	    // InternalCSVParserGenerator.g:350:6: lv_mods_3_0= ruleValueMod
                    	    {

                    	    						newCompositeNode(grammarAccess.getModificationAccess().getModsValueModParserRuleCall_0_3_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_mods_3_0=ruleValueMod();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModificationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"mods",
                    	    							lv_mods_3_0,
                    	    							"dk.sdu.mdsd.CSVParserGenerator.ValueMod");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:373:3: ( () otherlv_6= 'externals' otherlv_7= '{' ( (lv_mods_8_0= ruleExternal ) )* otherlv_9= '}' )
                    {
                    // InternalCSVParserGenerator.g:373:3: ( () otherlv_6= 'externals' otherlv_7= '{' ( (lv_mods_8_0= ruleExternal ) )* otherlv_9= '}' )
                    // InternalCSVParserGenerator.g:374:4: () otherlv_6= 'externals' otherlv_7= '{' ( (lv_mods_8_0= ruleExternal ) )* otherlv_9= '}'
                    {
                    // InternalCSVParserGenerator.g:374:4: ()
                    // InternalCSVParserGenerator.g:375:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getModificationAccess().getExtAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getModificationAccess().getExternalsKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_1_2());
                    			
                    // InternalCSVParserGenerator.g:389:4: ( (lv_mods_8_0= ruleExternal ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==39) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCSVParserGenerator.g:390:5: (lv_mods_8_0= ruleExternal )
                    	    {
                    	    // InternalCSVParserGenerator.g:390:5: (lv_mods_8_0= ruleExternal )
                    	    // InternalCSVParserGenerator.g:391:6: lv_mods_8_0= ruleExternal
                    	    {

                    	    						newCompositeNode(grammarAccess.getModificationAccess().getModsExternalParserRuleCall_1_3_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_mods_8_0=ruleExternal();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModificationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"mods",
                    	    							lv_mods_8_0,
                    	    							"dk.sdu.mdsd.CSVParserGenerator.External");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:414:3: ( () otherlv_11= 'statistics' otherlv_12= '{' ( (lv_mods_13_0= ruleStatFunc ) )* otherlv_14= '}' )
                    {
                    // InternalCSVParserGenerator.g:414:3: ( () otherlv_11= 'statistics' otherlv_12= '{' ( (lv_mods_13_0= ruleStatFunc ) )* otherlv_14= '}' )
                    // InternalCSVParserGenerator.g:415:4: () otherlv_11= 'statistics' otherlv_12= '{' ( (lv_mods_13_0= ruleStatFunc ) )* otherlv_14= '}'
                    {
                    // InternalCSVParserGenerator.g:415:4: ()
                    // InternalCSVParserGenerator.g:416:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getModificationAccess().getStatAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getModificationAccess().getStatisticsKeyword_2_1());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_12, grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_2_2());
                    			
                    // InternalCSVParserGenerator.g:430:4: ( (lv_mods_13_0= ruleStatFunc ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=40 && LA8_0<=44)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalCSVParserGenerator.g:431:5: (lv_mods_13_0= ruleStatFunc )
                    	    {
                    	    // InternalCSVParserGenerator.g:431:5: (lv_mods_13_0= ruleStatFunc )
                    	    // InternalCSVParserGenerator.g:432:6: lv_mods_13_0= ruleStatFunc
                    	    {

                    	    						newCompositeNode(grammarAccess.getModificationAccess().getModsStatFuncParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_mods_13_0=ruleStatFunc();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModificationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"mods",
                    	    							lv_mods_13_0,
                    	    							"dk.sdu.mdsd.CSVParserGenerator.StatFunc");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:455:3: ( () otherlv_16= 'layout' otherlv_17= '{' ( (lv_mods_18_0= ruleColumnAction ) )* otherlv_19= '}' )
                    {
                    // InternalCSVParserGenerator.g:455:3: ( () otherlv_16= 'layout' otherlv_17= '{' ( (lv_mods_18_0= ruleColumnAction ) )* otherlv_19= '}' )
                    // InternalCSVParserGenerator.g:456:4: () otherlv_16= 'layout' otherlv_17= '{' ( (lv_mods_18_0= ruleColumnAction ) )* otherlv_19= '}'
                    {
                    // InternalCSVParserGenerator.g:456:4: ()
                    // InternalCSVParserGenerator.g:457:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getModificationAccess().getColActAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_16=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getModificationAccess().getLayoutKeyword_3_1());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_17, grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_3_2());
                    			
                    // InternalCSVParserGenerator.g:471:4: ( (lv_mods_18_0= ruleColumnAction ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==45||LA9_0==47) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCSVParserGenerator.g:472:5: (lv_mods_18_0= ruleColumnAction )
                    	    {
                    	    // InternalCSVParserGenerator.g:472:5: (lv_mods_18_0= ruleColumnAction )
                    	    // InternalCSVParserGenerator.g:473:6: lv_mods_18_0= ruleColumnAction
                    	    {

                    	    						newCompositeNode(grammarAccess.getModificationAccess().getModsColumnActionParserRuleCall_3_3_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_mods_18_0=ruleColumnAction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModificationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"mods",
                    	    							lv_mods_18_0,
                    	    							"dk.sdu.mdsd.CSVParserGenerator.ColumnAction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCSVParserGenerator.g:496:3: ( () otherlv_21= 'constraints' otherlv_22= '{' ( (lv_mods_23_0= ruleConstraint ) )* otherlv_24= '}' )
                    {
                    // InternalCSVParserGenerator.g:496:3: ( () otherlv_21= 'constraints' otherlv_22= '{' ( (lv_mods_23_0= ruleConstraint ) )* otherlv_24= '}' )
                    // InternalCSVParserGenerator.g:497:4: () otherlv_21= 'constraints' otherlv_22= '{' ( (lv_mods_23_0= ruleConstraint ) )* otherlv_24= '}'
                    {
                    // InternalCSVParserGenerator.g:497:4: ()
                    // InternalCSVParserGenerator.g:498:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getModificationAccess().getConstrainAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_21=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_21, grammarAccess.getModificationAccess().getConstraintsKeyword_4_1());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_22, grammarAccess.getModificationAccess().getLeftCurlyBracketKeyword_4_2());
                    			
                    // InternalCSVParserGenerator.g:512:4: ( (lv_mods_23_0= ruleConstraint ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==52) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalCSVParserGenerator.g:513:5: (lv_mods_23_0= ruleConstraint )
                    	    {
                    	    // InternalCSVParserGenerator.g:513:5: (lv_mods_23_0= ruleConstraint )
                    	    // InternalCSVParserGenerator.g:514:6: lv_mods_23_0= ruleConstraint
                    	    {

                    	    						newCompositeNode(grammarAccess.getModificationAccess().getModsConstraintParserRuleCall_4_3_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_mods_23_0=ruleConstraint();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModificationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"mods",
                    	    							lv_mods_23_0,
                    	    							"dk.sdu.mdsd.CSVParserGenerator.Constraint");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getModificationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModification"


    // $ANTLR start "entryRuleOutput"
    // InternalCSVParserGenerator.g:540:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalCSVParserGenerator.g:540:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalCSVParserGenerator.g:541:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalCSVParserGenerator.g:547:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'output' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'records' ( (lv_number_4_0= RULE_INT ) ) )? ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_number_4_0=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:553:2: ( (otherlv_0= 'output' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'records' ( (lv_number_4_0= RULE_INT ) ) )? ) )
            // InternalCSVParserGenerator.g:554:2: (otherlv_0= 'output' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'records' ( (lv_number_4_0= RULE_INT ) ) )? )
            {
            // InternalCSVParserGenerator.g:554:2: (otherlv_0= 'output' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'records' ( (lv_number_4_0= RULE_INT ) ) )? )
            // InternalCSVParserGenerator.g:555:3: otherlv_0= 'output' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) (otherlv_3= 'records' ( (lv_number_4_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getColonKeyword_1());
            		
            // InternalCSVParserGenerator.g:563:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalCSVParserGenerator.g:564:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalCSVParserGenerator.g:564:4: (lv_name_2_0= RULE_STRING )
            // InternalCSVParserGenerator.g:565:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOutputAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalCSVParserGenerator.g:581:3: (otherlv_3= 'records' ( (lv_number_4_0= RULE_INT ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCSVParserGenerator.g:582:4: otherlv_3= 'records' ( (lv_number_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getOutputAccess().getRecordsKeyword_3_0());
                    			
                    // InternalCSVParserGenerator.g:586:4: ( (lv_number_4_0= RULE_INT ) )
                    // InternalCSVParserGenerator.g:587:5: (lv_number_4_0= RULE_INT )
                    {
                    // InternalCSVParserGenerator.g:587:5: (lv_number_4_0= RULE_INT )
                    // InternalCSVParserGenerator.g:588:6: lv_number_4_0= RULE_INT
                    {
                    lv_number_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_number_4_0, grammarAccess.getOutputAccess().getNumberINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleValueMod"
    // InternalCSVParserGenerator.g:609:1: entryRuleValueMod returns [EObject current=null] : iv_ruleValueMod= ruleValueMod EOF ;
    public final EObject entryRuleValueMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueMod = null;


        try {
            // InternalCSVParserGenerator.g:609:49: (iv_ruleValueMod= ruleValueMod EOF )
            // InternalCSVParserGenerator.g:610:2: iv_ruleValueMod= ruleValueMod EOF
            {
             newCompositeNode(grammarAccess.getValueModRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueMod=ruleValueMod();

            state._fsp--;

             current =iv_ruleValueMod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueMod"


    // $ANTLR start "ruleValueMod"
    // InternalCSVParserGenerator.g:616:1: ruleValueMod returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleLogExp ) ) ) ;
    public final EObject ruleValueMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:622:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleLogExp ) ) ) )
            // InternalCSVParserGenerator.g:623:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleLogExp ) ) )
            {
            // InternalCSVParserGenerator.g:623:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleLogExp ) ) )
            // InternalCSVParserGenerator.g:624:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleLogExp ) )
            {
            // InternalCSVParserGenerator.g:624:3: ( (otherlv_0= RULE_ID ) )
            // InternalCSVParserGenerator.g:625:4: (otherlv_0= RULE_ID )
            {
            // InternalCSVParserGenerator.g:625:4: (otherlv_0= RULE_ID )
            // InternalCSVParserGenerator.g:626:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueModRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_0, grammarAccess.getValueModAccess().getNameColDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getValueModAccess().getEqualsSignKeyword_1());
            		
            // InternalCSVParserGenerator.g:641:3: ( (lv_exp_2_0= ruleLogExp ) )
            // InternalCSVParserGenerator.g:642:4: (lv_exp_2_0= ruleLogExp )
            {
            // InternalCSVParserGenerator.g:642:4: (lv_exp_2_0= ruleLogExp )
            // InternalCSVParserGenerator.g:643:5: lv_exp_2_0= ruleLogExp
            {

            					newCompositeNode(grammarAccess.getValueModAccess().getExpLogExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_2_0=ruleLogExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getValueModRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_2_0,
            						"dk.sdu.mdsd.CSVParserGenerator.LogExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueMod"


    // $ANTLR start "entryRuleType"
    // InternalCSVParserGenerator.g:664:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalCSVParserGenerator.g:664:45: (iv_ruleType= ruleType EOF )
            // InternalCSVParserGenerator.g:665:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalCSVParserGenerator.g:671:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'integer' ) | ( () otherlv_5= 'date' ) | ( () otherlv_7= 'float' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:677:2: ( ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'integer' ) | ( () otherlv_5= 'date' ) | ( () otherlv_7= 'float' ) ) )
            // InternalCSVParserGenerator.g:678:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'integer' ) | ( () otherlv_5= 'date' ) | ( () otherlv_7= 'float' ) )
            {
            // InternalCSVParserGenerator.g:678:2: ( ( () otherlv_1= 'string' ) | ( () otherlv_3= 'integer' ) | ( () otherlv_5= 'date' ) | ( () otherlv_7= 'float' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            case 28:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalCSVParserGenerator.g:679:3: ( () otherlv_1= 'string' )
                    {
                    // InternalCSVParserGenerator.g:679:3: ( () otherlv_1= 'string' )
                    // InternalCSVParserGenerator.g:680:4: () otherlv_1= 'string'
                    {
                    // InternalCSVParserGenerator.g:680:4: ()
                    // InternalCSVParserGenerator.g:681:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getStrAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getStringKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:693:3: ( () otherlv_3= 'integer' )
                    {
                    // InternalCSVParserGenerator.g:693:3: ( () otherlv_3= 'integer' )
                    // InternalCSVParserGenerator.g:694:4: () otherlv_3= 'integer'
                    {
                    // InternalCSVParserGenerator.g:694:4: ()
                    // InternalCSVParserGenerator.g:695:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getIntegAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getIntegerKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:707:3: ( () otherlv_5= 'date' )
                    {
                    // InternalCSVParserGenerator.g:707:3: ( () otherlv_5= 'date' )
                    // InternalCSVParserGenerator.g:708:4: () otherlv_5= 'date'
                    {
                    // InternalCSVParserGenerator.g:708:4: ()
                    // InternalCSVParserGenerator.g:709:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getDateAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getDateKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:721:3: ( () otherlv_7= 'float' )
                    {
                    // InternalCSVParserGenerator.g:721:3: ( () otherlv_7= 'float' )
                    // InternalCSVParserGenerator.g:722:4: () otherlv_7= 'float'
                    {
                    // InternalCSVParserGenerator.g:722:4: ()
                    // InternalCSVParserGenerator.g:723:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getFloaAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getFloatKeyword_3_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLogExp"
    // InternalCSVParserGenerator.g:738:1: entryRuleLogExp returns [EObject current=null] : iv_ruleLogExp= ruleLogExp EOF ;
    public final EObject entryRuleLogExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogExp = null;


        try {
            // InternalCSVParserGenerator.g:738:47: (iv_ruleLogExp= ruleLogExp EOF )
            // InternalCSVParserGenerator.g:739:2: iv_ruleLogExp= ruleLogExp EOF
            {
             newCompositeNode(grammarAccess.getLogExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogExp=ruleLogExp();

            state._fsp--;

             current =iv_ruleLogExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogExp"


    // $ANTLR start "ruleLogExp"
    // InternalCSVParserGenerator.g:745:1: ruleLogExp returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleLogExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:751:2: ( (this_Comparison_0= ruleComparison ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) )
            // InternalCSVParserGenerator.g:752:2: (this_Comparison_0= ruleComparison ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            {
            // InternalCSVParserGenerator.g:752:2: (this_Comparison_0= ruleComparison ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            // InternalCSVParserGenerator.g:753:3: this_Comparison_0= ruleComparison ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogExpAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVParserGenerator.g:761:3: ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=29 && LA15_0<=30)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:762:4: ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) )
            	    {
            	    // InternalCSVParserGenerator.g:762:4: ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==29) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==30) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalCSVParserGenerator.g:763:5: (otherlv_1= '||' () )
            	            {
            	            // InternalCSVParserGenerator.g:763:5: (otherlv_1= '||' () )
            	            // InternalCSVParserGenerator.g:764:6: otherlv_1= '||' ()
            	            {
            	            otherlv_1=(Token)match(input,29,FOLLOW_20); 

            	            						newLeafNode(otherlv_1, grammarAccess.getLogExpAccess().getVerticalLineVerticalLineKeyword_1_0_0_0());
            	            					
            	            // InternalCSVParserGenerator.g:768:6: ()
            	            // InternalCSVParserGenerator.g:769:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogExpAccess().getOrLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVParserGenerator.g:777:5: (otherlv_3= '&&' () )
            	            {
            	            // InternalCSVParserGenerator.g:777:5: (otherlv_3= '&&' () )
            	            // InternalCSVParserGenerator.g:778:6: otherlv_3= '&&' ()
            	            {
            	            otherlv_3=(Token)match(input,30,FOLLOW_20); 

            	            						newLeafNode(otherlv_3, grammarAccess.getLogExpAccess().getAmpersandAmpersandKeyword_1_0_1_0());
            	            					
            	            // InternalCSVParserGenerator.g:782:6: ()
            	            // InternalCSVParserGenerator.g:783:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogExpAccess().getAndLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalCSVParserGenerator.g:791:4: ( (lv_right_5_0= ruleComparison ) )
            	    // InternalCSVParserGenerator.g:792:5: (lv_right_5_0= ruleComparison )
            	    {
            	    // InternalCSVParserGenerator.g:792:5: (lv_right_5_0= ruleComparison )
            	    // InternalCSVParserGenerator.g:793:6: lv_right_5_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getLogExpAccess().getRightComparisonParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_5_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLogExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mdsd.CSVParserGenerator.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogExp"


    // $ANTLR start "entryRuleComparison"
    // InternalCSVParserGenerator.g:815:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalCSVParserGenerator.g:815:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalCSVParserGenerator.g:816:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalCSVParserGenerator.g:822:1: ruleComparison returns [EObject current=null] : (this_Sum_0= ruleSum ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_Sum_0 = null;

        EObject lv_right_13_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:828:2: ( (this_Sum_0= ruleSum ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )* ) )
            // InternalCSVParserGenerator.g:829:2: (this_Sum_0= ruleSum ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )* )
            {
            // InternalCSVParserGenerator.g:829:2: (this_Sum_0= ruleSum ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )* )
            // InternalCSVParserGenerator.g:830:3: this_Sum_0= ruleSum ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getSumParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_Sum_0=ruleSum();

            state._fsp--;


            			current = this_Sum_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVParserGenerator.g:838:3: ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=31 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:839:4: ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) )
            	    {
            	    // InternalCSVParserGenerator.g:839:4: ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) )
            	    int alt16=6;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt16=5;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt16=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // InternalCSVParserGenerator.g:840:5: (otherlv_1= '<' () )
            	            {
            	            // InternalCSVParserGenerator.g:840:5: (otherlv_1= '<' () )
            	            // InternalCSVParserGenerator.g:841:6: otherlv_1= '<' ()
            	            {
            	            otherlv_1=(Token)match(input,31,FOLLOW_20); 

            	            						newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0());
            	            					
            	            // InternalCSVParserGenerator.g:845:6: ()
            	            // InternalCSVParserGenerator.g:846:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getLtLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVParserGenerator.g:854:5: (otherlv_3= '>' () )
            	            {
            	            // InternalCSVParserGenerator.g:854:5: (otherlv_3= '>' () )
            	            // InternalCSVParserGenerator.g:855:6: otherlv_3= '>' ()
            	            {
            	            otherlv_3=(Token)match(input,32,FOLLOW_20); 

            	            						newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_0());
            	            					
            	            // InternalCSVParserGenerator.g:859:6: ()
            	            // InternalCSVParserGenerator.g:860:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getGtLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalCSVParserGenerator.g:868:5: (otherlv_5= '==' () )
            	            {
            	            // InternalCSVParserGenerator.g:868:5: (otherlv_5= '==' () )
            	            // InternalCSVParserGenerator.g:869:6: otherlv_5= '==' ()
            	            {
            	            otherlv_5=(Token)match(input,33,FOLLOW_20); 

            	            						newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_2_0());
            	            					
            	            // InternalCSVParserGenerator.g:873:6: ()
            	            // InternalCSVParserGenerator.g:874:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getEquLeftAction_1_0_2_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalCSVParserGenerator.g:882:5: (otherlv_7= '!=' () )
            	            {
            	            // InternalCSVParserGenerator.g:882:5: (otherlv_7= '!=' () )
            	            // InternalCSVParserGenerator.g:883:6: otherlv_7= '!=' ()
            	            {
            	            otherlv_7=(Token)match(input,34,FOLLOW_20); 

            	            						newLeafNode(otherlv_7, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_0());
            	            					
            	            // InternalCSVParserGenerator.g:887:6: ()
            	            // InternalCSVParserGenerator.g:888:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getNeqLeftAction_1_0_3_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalCSVParserGenerator.g:896:5: (otherlv_9= '=<' () )
            	            {
            	            // InternalCSVParserGenerator.g:896:5: (otherlv_9= '=<' () )
            	            // InternalCSVParserGenerator.g:897:6: otherlv_9= '=<' ()
            	            {
            	            otherlv_9=(Token)match(input,35,FOLLOW_20); 

            	            						newLeafNode(otherlv_9, grammarAccess.getComparisonAccess().getEqualsSignLessThanSignKeyword_1_0_4_0());
            	            					
            	            // InternalCSVParserGenerator.g:901:6: ()
            	            // InternalCSVParserGenerator.g:902:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getLeqLeftAction_1_0_4_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalCSVParserGenerator.g:910:5: (otherlv_11= '=>' () )
            	            {
            	            // InternalCSVParserGenerator.g:910:5: (otherlv_11= '=>' () )
            	            // InternalCSVParserGenerator.g:911:6: otherlv_11= '=>' ()
            	            {
            	            otherlv_11=(Token)match(input,36,FOLLOW_20); 

            	            						newLeafNode(otherlv_11, grammarAccess.getComparisonAccess().getEqualsSignGreaterThanSignKeyword_1_0_5_0());
            	            					
            	            // InternalCSVParserGenerator.g:915:6: ()
            	            // InternalCSVParserGenerator.g:916:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getGeqLeftAction_1_0_5_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalCSVParserGenerator.g:924:4: ( (lv_right_13_0= ruleSum ) )
            	    // InternalCSVParserGenerator.g:925:5: (lv_right_13_0= ruleSum )
            	    {
            	    // InternalCSVParserGenerator.g:925:5: (lv_right_13_0= ruleSum )
            	    // InternalCSVParserGenerator.g:926:6: lv_right_13_0= ruleSum
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightSumParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_13_0=ruleSum();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_13_0,
            	    							"dk.sdu.mdsd.CSVParserGenerator.Sum");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleParens"
    // InternalCSVParserGenerator.g:948:1: entryRuleParens returns [EObject current=null] : iv_ruleParens= ruleParens EOF ;
    public final EObject entryRuleParens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParens = null;


        try {
            // InternalCSVParserGenerator.g:948:47: (iv_ruleParens= ruleParens EOF )
            // InternalCSVParserGenerator.g:949:2: iv_ruleParens= ruleParens EOF
            {
             newCompositeNode(grammarAccess.getParensRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParens=ruleParens();

            state._fsp--;

             current =iv_ruleParens; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParens"


    // $ANTLR start "ruleParens"
    // InternalCSVParserGenerator.g:955:1: ruleParens returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleLogExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:961:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleLogExp ) ) otherlv_2= ')' ) )
            // InternalCSVParserGenerator.g:962:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleLogExp ) ) otherlv_2= ')' )
            {
            // InternalCSVParserGenerator.g:962:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleLogExp ) ) otherlv_2= ')' )
            // InternalCSVParserGenerator.g:963:3: otherlv_0= '(' ( (lv_exp_1_0= ruleLogExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getParensAccess().getLeftParenthesisKeyword_0());
            		
            // InternalCSVParserGenerator.g:967:3: ( (lv_exp_1_0= ruleLogExp ) )
            // InternalCSVParserGenerator.g:968:4: (lv_exp_1_0= ruleLogExp )
            {
            // InternalCSVParserGenerator.g:968:4: (lv_exp_1_0= ruleLogExp )
            // InternalCSVParserGenerator.g:969:5: lv_exp_1_0= ruleLogExp
            {

            					newCompositeNode(grammarAccess.getParensAccess().getExpLogExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_exp_1_0=ruleLogExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParensRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"dk.sdu.mdsd.CSVParserGenerator.LogExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getParensAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParens"


    // $ANTLR start "entryRuleExternal"
    // InternalCSVParserGenerator.g:994:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalCSVParserGenerator.g:994:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalCSVParserGenerator.g:995:2: iv_ruleExternal= ruleExternal EOF
            {
             newCompositeNode(grammarAccess.getExternalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternal=ruleExternal();

            state._fsp--;

             current =iv_ruleExternal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternal"


    // $ANTLR start "ruleExternal"
    // InternalCSVParserGenerator.g:1001:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'extFunc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1007:2: ( (otherlv_0= 'extFunc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalCSVParserGenerator.g:1008:2: (otherlv_0= 'extFunc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalCSVParserGenerator.g:1008:2: (otherlv_0= 'extFunc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // InternalCSVParserGenerator.g:1009:3: otherlv_0= 'extFunc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExtFuncKeyword_0());
            		
            // InternalCSVParserGenerator.g:1013:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCSVParserGenerator.g:1014:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCSVParserGenerator.g:1014:4: (lv_name_1_0= RULE_ID )
            // InternalCSVParserGenerator.g:1015:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCSVParserGenerator.g:1035:3: ( (otherlv_3= RULE_ID ) )
            // InternalCSVParserGenerator.g:1036:4: (otherlv_3= RULE_ID )
            {
            // InternalCSVParserGenerator.g:1036:4: (otherlv_3= RULE_ID )
            // InternalCSVParserGenerator.g:1037:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_3, grammarAccess.getExternalAccess().getInpColDeclCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExternalAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternal"


    // $ANTLR start "entryRuleStatFunc"
    // InternalCSVParserGenerator.g:1056:1: entryRuleStatFunc returns [EObject current=null] : iv_ruleStatFunc= ruleStatFunc EOF ;
    public final EObject entryRuleStatFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatFunc = null;


        try {
            // InternalCSVParserGenerator.g:1056:49: (iv_ruleStatFunc= ruleStatFunc EOF )
            // InternalCSVParserGenerator.g:1057:2: iv_ruleStatFunc= ruleStatFunc EOF
            {
             newCompositeNode(grammarAccess.getStatFuncRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatFunc=ruleStatFunc();

            state._fsp--;

             current =iv_ruleStatFunc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatFunc"


    // $ANTLR start "ruleStatFunc"
    // InternalCSVParserGenerator.g:1063:1: ruleStatFunc returns [EObject current=null] : ( ( () otherlv_1= 'max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( () otherlv_6= 'min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( () otherlv_11= 'std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) | ( () otherlv_21= 'mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' ) ) ;
    public final EObject ruleStatFunc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1069:2: ( ( ( () otherlv_1= 'max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( () otherlv_6= 'min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( () otherlv_11= 'std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) | ( () otherlv_21= 'mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' ) ) )
            // InternalCSVParserGenerator.g:1070:2: ( ( () otherlv_1= 'max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( () otherlv_6= 'min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( () otherlv_11= 'std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) | ( () otherlv_21= 'mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' ) )
            {
            // InternalCSVParserGenerator.g:1070:2: ( ( () otherlv_1= 'max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( () otherlv_6= 'min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( () otherlv_11= 'std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) | ( () otherlv_21= 'mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt18=1;
                }
                break;
            case 41:
                {
                alt18=2;
                }
                break;
            case 42:
                {
                alt18=3;
                }
                break;
            case 43:
                {
                alt18=4;
                }
                break;
            case 44:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalCSVParserGenerator.g:1071:3: ( () otherlv_1= 'max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    {
                    // InternalCSVParserGenerator.g:1071:3: ( () otherlv_1= 'max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    // InternalCSVParserGenerator.g:1072:4: () otherlv_1= 'max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    // InternalCSVParserGenerator.g:1072:4: ()
                    // InternalCSVParserGenerator.g:1073:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatFuncAccess().getMaxAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,40,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatFuncAccess().getMaxKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalCSVParserGenerator.g:1087:4: ( (otherlv_3= RULE_ID ) )
                    // InternalCSVParserGenerator.g:1088:5: (otherlv_3= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:1088:5: (otherlv_3= RULE_ID )
                    // InternalCSVParserGenerator.g:1089:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatFuncRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_3, grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:1106:3: ( () otherlv_6= 'min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
                    {
                    // InternalCSVParserGenerator.g:1106:3: ( () otherlv_6= 'min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
                    // InternalCSVParserGenerator.g:1107:4: () otherlv_6= 'min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
                    {
                    // InternalCSVParserGenerator.g:1107:4: ()
                    // InternalCSVParserGenerator.g:1108:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatFuncAccess().getMinAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,41,FOLLOW_24); 

                    				newLeafNode(otherlv_6, grammarAccess.getStatFuncAccess().getMinKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalCSVParserGenerator.g:1122:4: ( (otherlv_8= RULE_ID ) )
                    // InternalCSVParserGenerator.g:1123:5: (otherlv_8= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:1123:5: (otherlv_8= RULE_ID )
                    // InternalCSVParserGenerator.g:1124:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatFuncRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_8, grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:1141:3: ( () otherlv_11= 'std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )
                    {
                    // InternalCSVParserGenerator.g:1141:3: ( () otherlv_11= 'std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )
                    // InternalCSVParserGenerator.g:1142:4: () otherlv_11= 'std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')'
                    {
                    // InternalCSVParserGenerator.g:1142:4: ()
                    // InternalCSVParserGenerator.g:1143:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatFuncAccess().getStdAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,42,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getStatFuncAccess().getStdKeyword_2_1());
                    			
                    otherlv_12=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalCSVParserGenerator.g:1157:4: ( (otherlv_13= RULE_ID ) )
                    // InternalCSVParserGenerator.g:1158:5: (otherlv_13= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:1158:5: (otherlv_13= RULE_ID )
                    // InternalCSVParserGenerator.g:1159:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatFuncRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_13, grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_2_3_0());
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:1176:3: ( () otherlv_16= 'sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' )
                    {
                    // InternalCSVParserGenerator.g:1176:3: ( () otherlv_16= 'sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' )
                    // InternalCSVParserGenerator.g:1177:4: () otherlv_16= 'sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')'
                    {
                    // InternalCSVParserGenerator.g:1177:4: ()
                    // InternalCSVParserGenerator.g:1178:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatFuncAccess().getSumFuncAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_16=(Token)match(input,43,FOLLOW_24); 

                    				newLeafNode(otherlv_16, grammarAccess.getStatFuncAccess().getSumKeyword_3_1());
                    			
                    otherlv_17=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalCSVParserGenerator.g:1192:4: ( (otherlv_18= RULE_ID ) )
                    // InternalCSVParserGenerator.g:1193:5: (otherlv_18= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:1193:5: (otherlv_18= RULE_ID )
                    // InternalCSVParserGenerator.g:1194:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatFuncRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_18, grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_3_3_0());
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCSVParserGenerator.g:1211:3: ( () otherlv_21= 'mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' )
                    {
                    // InternalCSVParserGenerator.g:1211:3: ( () otherlv_21= 'mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' )
                    // InternalCSVParserGenerator.g:1212:4: () otherlv_21= 'mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')'
                    {
                    // InternalCSVParserGenerator.g:1212:4: ()
                    // InternalCSVParserGenerator.g:1213:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatFuncAccess().getMeanAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_21=(Token)match(input,44,FOLLOW_24); 

                    				newLeafNode(otherlv_21, grammarAccess.getStatFuncAccess().getMeanKeyword_4_1());
                    			
                    otherlv_22=(Token)match(input,37,FOLLOW_5); 

                    				newLeafNode(otherlv_22, grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_4_2());
                    			
                    // InternalCSVParserGenerator.g:1227:4: ( (otherlv_23= RULE_ID ) )
                    // InternalCSVParserGenerator.g:1228:5: (otherlv_23= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:1228:5: (otherlv_23= RULE_ID )
                    // InternalCSVParserGenerator.g:1229:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatFuncRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_23, grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_4_3_0());
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,38,FOLLOW_2); 

                    				newLeafNode(otherlv_24, grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_4_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatFunc"


    // $ANTLR start "entryRuleColumnAction"
    // InternalCSVParserGenerator.g:1249:1: entryRuleColumnAction returns [EObject current=null] : iv_ruleColumnAction= ruleColumnAction EOF ;
    public final EObject entryRuleColumnAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnAction = null;


        try {
            // InternalCSVParserGenerator.g:1249:53: (iv_ruleColumnAction= ruleColumnAction EOF )
            // InternalCSVParserGenerator.g:1250:2: iv_ruleColumnAction= ruleColumnAction EOF
            {
             newCompositeNode(grammarAccess.getColumnActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnAction=ruleColumnAction();

            state._fsp--;

             current =iv_ruleColumnAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnAction"


    // $ANTLR start "ruleColumnAction"
    // InternalCSVParserGenerator.g:1256:1: ruleColumnAction returns [EObject current=null] : ( ( () otherlv_1= 'addCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'with' ( (lv_mod_6_0= ruleLogExp ) ) ) | ( () otherlv_8= 'remCol' ( (otherlv_9= RULE_ID ) ) ) ) ;
    public final EObject ruleColumnAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_type_4_0 = null;

        EObject lv_mod_6_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1262:2: ( ( ( () otherlv_1= 'addCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'with' ( (lv_mod_6_0= ruleLogExp ) ) ) | ( () otherlv_8= 'remCol' ( (otherlv_9= RULE_ID ) ) ) ) )
            // InternalCSVParserGenerator.g:1263:2: ( ( () otherlv_1= 'addCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'with' ( (lv_mod_6_0= ruleLogExp ) ) ) | ( () otherlv_8= 'remCol' ( (otherlv_9= RULE_ID ) ) ) )
            {
            // InternalCSVParserGenerator.g:1263:2: ( ( () otherlv_1= 'addCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'with' ( (lv_mod_6_0= ruleLogExp ) ) ) | ( () otherlv_8= 'remCol' ( (otherlv_9= RULE_ID ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==45) ) {
                alt19=1;
            }
            else if ( (LA19_0==47) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalCSVParserGenerator.g:1264:3: ( () otherlv_1= 'addCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'with' ( (lv_mod_6_0= ruleLogExp ) ) )
                    {
                    // InternalCSVParserGenerator.g:1264:3: ( () otherlv_1= 'addCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'with' ( (lv_mod_6_0= ruleLogExp ) ) )
                    // InternalCSVParserGenerator.g:1265:4: () otherlv_1= 'addCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= 'with' ( (lv_mod_6_0= ruleLogExp ) )
                    {
                    // InternalCSVParserGenerator.g:1265:4: ()
                    // InternalCSVParserGenerator.g:1266:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColumnActionAccess().getAddAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,45,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnActionAccess().getAddColKeyword_0_1());
                    			
                    // InternalCSVParserGenerator.g:1276:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalCSVParserGenerator.g:1277:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:1277:5: (lv_name_2_0= RULE_ID )
                    // InternalCSVParserGenerator.g:1278:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getColumnActionAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnActionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnActionAccess().getColonKeyword_0_3());
                    			
                    // InternalCSVParserGenerator.g:1298:4: ( (lv_type_4_0= ruleType ) )
                    // InternalCSVParserGenerator.g:1299:5: (lv_type_4_0= ruleType )
                    {
                    // InternalCSVParserGenerator.g:1299:5: (lv_type_4_0= ruleType )
                    // InternalCSVParserGenerator.g:1300:6: lv_type_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getColumnActionAccess().getTypeTypeParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnActionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"dk.sdu.mdsd.CSVParserGenerator.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,46,FOLLOW_20); 

                    				newLeafNode(otherlv_5, grammarAccess.getColumnActionAccess().getWithKeyword_0_5());
                    			
                    // InternalCSVParserGenerator.g:1321:4: ( (lv_mod_6_0= ruleLogExp ) )
                    // InternalCSVParserGenerator.g:1322:5: (lv_mod_6_0= ruleLogExp )
                    {
                    // InternalCSVParserGenerator.g:1322:5: (lv_mod_6_0= ruleLogExp )
                    // InternalCSVParserGenerator.g:1323:6: lv_mod_6_0= ruleLogExp
                    {

                    						newCompositeNode(grammarAccess.getColumnActionAccess().getModLogExpParserRuleCall_0_6_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mod_6_0=ruleLogExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnActionRule());
                    						}
                    						set(
                    							current,
                    							"mod",
                    							lv_mod_6_0,
                    							"dk.sdu.mdsd.CSVParserGenerator.LogExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:1342:3: ( () otherlv_8= 'remCol' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalCSVParserGenerator.g:1342:3: ( () otherlv_8= 'remCol' ( (otherlv_9= RULE_ID ) ) )
                    // InternalCSVParserGenerator.g:1343:4: () otherlv_8= 'remCol' ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalCSVParserGenerator.g:1343:4: ()
                    // InternalCSVParserGenerator.g:1344:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColumnActionAccess().getRemAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,47,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getColumnActionAccess().getRemColKeyword_1_1());
                    			
                    // InternalCSVParserGenerator.g:1354:4: ( (otherlv_9= RULE_ID ) )
                    // InternalCSVParserGenerator.g:1355:5: (otherlv_9= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:1355:5: (otherlv_9= RULE_ID )
                    // InternalCSVParserGenerator.g:1356:6: otherlv_9= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnActionRule());
                    						}
                    					
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_9, grammarAccess.getColumnActionAccess().getNameColDeclCrossReference_1_2_0());
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnAction"


    // $ANTLR start "entryRuleSum"
    // InternalCSVParserGenerator.g:1372:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalCSVParserGenerator.g:1372:44: (iv_ruleSum= ruleSum EOF )
            // InternalCSVParserGenerator.g:1373:2: iv_ruleSum= ruleSum EOF
            {
             newCompositeNode(grammarAccess.getSumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSum=ruleSum();

            state._fsp--;

             current =iv_ruleSum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSum"


    // $ANTLR start "ruleSum"
    // InternalCSVParserGenerator.g:1379:1: ruleSum returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1385:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalCSVParserGenerator.g:1386:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalCSVParserGenerator.g:1386:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalCSVParserGenerator.g:1387:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_26);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVParserGenerator.g:1395:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=48 && LA21_0<=49)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1396:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalCSVParserGenerator.g:1396:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==48) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==49) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalCSVParserGenerator.g:1397:5: (otherlv_1= '+' () )
            	            {
            	            // InternalCSVParserGenerator.g:1397:5: (otherlv_1= '+' () )
            	            // InternalCSVParserGenerator.g:1398:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,48,FOLLOW_20); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalCSVParserGenerator.g:1402:6: ()
            	            // InternalCSVParserGenerator.g:1403:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVParserGenerator.g:1411:5: (otherlv_3= '-' () )
            	            {
            	            // InternalCSVParserGenerator.g:1411:5: (otherlv_3= '-' () )
            	            // InternalCSVParserGenerator.g:1412:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,49,FOLLOW_20); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalCSVParserGenerator.g:1416:6: ()
            	            // InternalCSVParserGenerator.g:1417:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalCSVParserGenerator.g:1425:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalCSVParserGenerator.g:1426:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalCSVParserGenerator.g:1426:5: (lv_right_5_0= ruleFactor )
            	    // InternalCSVParserGenerator.g:1427:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSumRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mdsd.CSVParserGenerator.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSum"


    // $ANTLR start "entryRuleFactor"
    // InternalCSVParserGenerator.g:1449:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalCSVParserGenerator.g:1449:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalCSVParserGenerator.g:1450:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalCSVParserGenerator.g:1456:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1462:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalCSVParserGenerator.g:1463:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalCSVParserGenerator.g:1463:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalCSVParserGenerator.g:1464:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_27);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVParserGenerator.g:1472:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=50 && LA23_0<=51)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1473:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalCSVParserGenerator.g:1473:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==50) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==51) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalCSVParserGenerator.g:1474:5: (otherlv_1= '*' () )
            	            {
            	            // InternalCSVParserGenerator.g:1474:5: (otherlv_1= '*' () )
            	            // InternalCSVParserGenerator.g:1475:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,50,FOLLOW_20); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalCSVParserGenerator.g:1479:6: ()
            	            // InternalCSVParserGenerator.g:1480:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVParserGenerator.g:1488:5: (otherlv_3= '/' () )
            	            {
            	            // InternalCSVParserGenerator.g:1488:5: (otherlv_3= '/' () )
            	            // InternalCSVParserGenerator.g:1489:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,51,FOLLOW_20); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalCSVParserGenerator.g:1493:6: ()
            	            // InternalCSVParserGenerator.g:1494:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalCSVParserGenerator.g:1502:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalCSVParserGenerator.g:1503:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalCSVParserGenerator.g:1503:5: (lv_right_5_0= rulePrimary )
            	    // InternalCSVParserGenerator.g:1504:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mdsd.CSVParserGenerator.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalCSVParserGenerator.g:1526:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalCSVParserGenerator.g:1526:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalCSVParserGenerator.g:1527:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalCSVParserGenerator.g:1533:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parens_1= ruleParens | this_ColumnVar_2= ruleColumnVar | this_DateLiteral_3= ruleDateLiteral | this_StringLiteral_4= ruleStringLiteral ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parens_1 = null;

        EObject this_ColumnVar_2 = null;

        EObject this_DateLiteral_3 = null;

        EObject this_StringLiteral_4 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1539:2: ( (this_Number_0= ruleNumber | this_Parens_1= ruleParens | this_ColumnVar_2= ruleColumnVar | this_DateLiteral_3= ruleDateLiteral | this_StringLiteral_4= ruleStringLiteral ) )
            // InternalCSVParserGenerator.g:1540:2: (this_Number_0= ruleNumber | this_Parens_1= ruleParens | this_ColumnVar_2= ruleColumnVar | this_DateLiteral_3= ruleDateLiteral | this_StringLiteral_4= ruleStringLiteral )
            {
            // InternalCSVParserGenerator.g:1540:2: (this_Number_0= ruleNumber | this_Parens_1= ruleParens | this_ColumnVar_2= ruleColumnVar | this_DateLiteral_3= ruleDateLiteral | this_StringLiteral_4= ruleStringLiteral )
            int alt24=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt24=1;
                }
                break;
            case 37:
                {
                alt24=2;
                }
                break;
            case RULE_ID:
                {
                alt24=3;
                }
                break;
            case 54:
                {
                alt24=4;
                }
                break;
            case RULE_STRING:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalCSVParserGenerator.g:1541:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:1550:3: this_Parens_1= ruleParens
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParensParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parens_1=ruleParens();

                    state._fsp--;


                    			current = this_Parens_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:1559:3: this_ColumnVar_2= ruleColumnVar
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getColumnVarParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnVar_2=ruleColumnVar();

                    state._fsp--;


                    			current = this_ColumnVar_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:1568:3: this_DateLiteral_3= ruleDateLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getDateLiteralParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DateLiteral_3=ruleDateLiteral();

                    state._fsp--;


                    			current = this_DateLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCSVParserGenerator.g:1577:3: this_StringLiteral_4= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getStringLiteralParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_4=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleColumnVar"
    // InternalCSVParserGenerator.g:1589:1: entryRuleColumnVar returns [EObject current=null] : iv_ruleColumnVar= ruleColumnVar EOF ;
    public final EObject entryRuleColumnVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnVar = null;


        try {
            // InternalCSVParserGenerator.g:1589:50: (iv_ruleColumnVar= ruleColumnVar EOF )
            // InternalCSVParserGenerator.g:1590:2: iv_ruleColumnVar= ruleColumnVar EOF
            {
             newCompositeNode(grammarAccess.getColumnVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumnVar=ruleColumnVar();

            state._fsp--;

             current =iv_ruleColumnVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnVar"


    // $ANTLR start "ruleColumnVar"
    // InternalCSVParserGenerator.g:1596:1: ruleColumnVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleColumnVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1602:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCSVParserGenerator.g:1603:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:1603:2: ( (otherlv_0= RULE_ID ) )
            // InternalCSVParserGenerator.g:1604:3: (otherlv_0= RULE_ID )
            {
            // InternalCSVParserGenerator.g:1604:3: (otherlv_0= RULE_ID )
            // InternalCSVParserGenerator.g:1605:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getColumnVarRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getColumnVarAccess().getNameColDeclCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnVar"


    // $ANTLR start "entryRuleNumber"
    // InternalCSVParserGenerator.g:1619:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalCSVParserGenerator.g:1619:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalCSVParserGenerator.g:1620:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalCSVParserGenerator.g:1626:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1632:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalCSVParserGenerator.g:1633:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalCSVParserGenerator.g:1633:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalCSVParserGenerator.g:1634:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalCSVParserGenerator.g:1634:3: ()
            // InternalCSVParserGenerator.g:1635:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalCSVParserGenerator.g:1641:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalCSVParserGenerator.g:1642:4: (lv_value_1_0= RULE_INT )
            {
            // InternalCSVParserGenerator.g:1642:4: (lv_value_1_0= RULE_INT )
            // InternalCSVParserGenerator.g:1643:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNumberRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleConstraint"
    // InternalCSVParserGenerator.g:1663:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalCSVParserGenerator.g:1663:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalCSVParserGenerator.g:1664:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalCSVParserGenerator.g:1670:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'satisfies' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_exp_3_0= ruleLogExp ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1676:2: ( (otherlv_0= 'satisfies' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_exp_3_0= ruleLogExp ) ) ) )
            // InternalCSVParserGenerator.g:1677:2: (otherlv_0= 'satisfies' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_exp_3_0= ruleLogExp ) ) )
            {
            // InternalCSVParserGenerator.g:1677:2: (otherlv_0= 'satisfies' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_exp_3_0= ruleLogExp ) ) )
            // InternalCSVParserGenerator.g:1678:3: otherlv_0= 'satisfies' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_exp_3_0= ruleLogExp ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getSatisfiesKeyword_0());
            		
            // InternalCSVParserGenerator.g:1682:3: ( (otherlv_1= RULE_ID ) )
            // InternalCSVParserGenerator.g:1683:4: (otherlv_1= RULE_ID )
            {
            // InternalCSVParserGenerator.g:1683:4: (otherlv_1= RULE_ID )
            // InternalCSVParserGenerator.g:1684:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getNameColDeclCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,53,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getConstraintKeyword_2());
            		
            // InternalCSVParserGenerator.g:1699:3: ( (lv_exp_3_0= ruleLogExp ) )
            // InternalCSVParserGenerator.g:1700:4: (lv_exp_3_0= ruleLogExp )
            {
            // InternalCSVParserGenerator.g:1700:4: (lv_exp_3_0= ruleLogExp )
            // InternalCSVParserGenerator.g:1701:5: lv_exp_3_0= ruleLogExp
            {

            					newCompositeNode(grammarAccess.getConstraintAccess().getExpLogExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_exp_3_0=ruleLogExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.sdu.mdsd.CSVParserGenerator.LogExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleDateLiteral"
    // InternalCSVParserGenerator.g:1722:1: entryRuleDateLiteral returns [EObject current=null] : iv_ruleDateLiteral= ruleDateLiteral EOF ;
    public final EObject entryRuleDateLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateLiteral = null;


        try {
            // InternalCSVParserGenerator.g:1722:52: (iv_ruleDateLiteral= ruleDateLiteral EOF )
            // InternalCSVParserGenerator.g:1723:2: iv_ruleDateLiteral= ruleDateLiteral EOF
            {
             newCompositeNode(grammarAccess.getDateLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateLiteral=ruleDateLiteral();

            state._fsp--;

             current =iv_ruleDateLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateLiteral"


    // $ANTLR start "ruleDateLiteral"
    // InternalCSVParserGenerator.g:1729:1: ruleDateLiteral returns [EObject current=null] : ( () otherlv_1= 'd' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDateLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1735:2: ( ( () otherlv_1= 'd' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalCSVParserGenerator.g:1736:2: ( () otherlv_1= 'd' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalCSVParserGenerator.g:1736:2: ( () otherlv_1= 'd' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalCSVParserGenerator.g:1737:3: () otherlv_1= 'd' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalCSVParserGenerator.g:1737:3: ()
            // InternalCSVParserGenerator.g:1738:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateLiteralAccess().getDateLitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getDateLiteralAccess().getDKeyword_1());
            		
            // InternalCSVParserGenerator.g:1748:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCSVParserGenerator.g:1749:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalCSVParserGenerator.g:1749:4: (lv_value_2_0= RULE_STRING )
            // InternalCSVParserGenerator.g:1750:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDateLiteralAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDateLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalCSVParserGenerator.g:1770:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalCSVParserGenerator.g:1770:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalCSVParserGenerator.g:1771:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalCSVParserGenerator.g:1777:1: ruleStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1783:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalCSVParserGenerator.g:1784:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalCSVParserGenerator.g:1784:2: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalCSVParserGenerator.g:1785:3: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalCSVParserGenerator.g:1785:3: ()
            // InternalCSVParserGenerator.g:1786:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringLiteralAccess().getStringLitAction_0(),
            					current);
            			

            }

            // InternalCSVParserGenerator.g:1792:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalCSVParserGenerator.g:1793:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalCSVParserGenerator.g:1793:4: (lv_value_1_0= RULE_STRING )
            // InternalCSVParserGenerator.g:1794:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007E0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003E0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001F0000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000A00000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0040002000000070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001F80000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0020000000000000L});

}