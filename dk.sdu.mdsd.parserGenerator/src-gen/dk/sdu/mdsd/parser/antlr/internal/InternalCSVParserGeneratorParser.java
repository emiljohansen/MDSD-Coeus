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
    // InternalCSVParserGenerator.g:71:1: ruleParser returns [EObject current=null] : ( ( (lv_file_0_0= ruleFileDecl ) ) otherlv_1= 'columns' otherlv_2= '{' ( (lv_columns_3_0= ruleColDecl ) )+ otherlv_4= '}' ( (lv_mods_5_0= ruleModification ) )* ( (lv_out_6_0= ruleOutput ) )? ) ;
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
            // InternalCSVParserGenerator.g:77:2: ( ( ( (lv_file_0_0= ruleFileDecl ) ) otherlv_1= 'columns' otherlv_2= '{' ( (lv_columns_3_0= ruleColDecl ) )+ otherlv_4= '}' ( (lv_mods_5_0= ruleModification ) )* ( (lv_out_6_0= ruleOutput ) )? ) )
            // InternalCSVParserGenerator.g:78:2: ( ( (lv_file_0_0= ruleFileDecl ) ) otherlv_1= 'columns' otherlv_2= '{' ( (lv_columns_3_0= ruleColDecl ) )+ otherlv_4= '}' ( (lv_mods_5_0= ruleModification ) )* ( (lv_out_6_0= ruleOutput ) )? )
            {
            // InternalCSVParserGenerator.g:78:2: ( ( (lv_file_0_0= ruleFileDecl ) ) otherlv_1= 'columns' otherlv_2= '{' ( (lv_columns_3_0= ruleColDecl ) )+ otherlv_4= '}' ( (lv_mods_5_0= ruleModification ) )* ( (lv_out_6_0= ruleOutput ) )? )
            // InternalCSVParserGenerator.g:79:3: ( (lv_file_0_0= ruleFileDecl ) ) otherlv_1= 'columns' otherlv_2= '{' ( (lv_columns_3_0= ruleColDecl ) )+ otherlv_4= '}' ( (lv_mods_5_0= ruleModification ) )* ( (lv_out_6_0= ruleOutput ) )?
            {
            // InternalCSVParserGenerator.g:79:3: ( (lv_file_0_0= ruleFileDecl ) )
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

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParserAccess().getColumnsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParserAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCSVParserGenerator.g:106:3: ( (lv_columns_3_0= ruleColDecl ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getParserAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalCSVParserGenerator.g:129:3: ( (lv_mods_5_0= ruleModification ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=32 && LA2_0<=38)||LA2_0==40||LA2_0==45) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
                }
            } while (true);

            // InternalCSVParserGenerator.g:148:3: ( (lv_out_6_0= ruleOutput ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
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
    // InternalCSVParserGenerator.g:178:1: ruleFileDecl returns [EObject current=null] : (otherlv_0= 'File' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFileDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:184:2: ( (otherlv_0= 'File' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalCSVParserGenerator.g:185:2: (otherlv_0= 'File' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalCSVParserGenerator.g:185:2: (otherlv_0= 'File' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalCSVParserGenerator.g:186:3: otherlv_0= 'File' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) )
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
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

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
    // InternalCSVParserGenerator.g:216:1: entryRuleColDecl returns [EObject current=null] : iv_ruleColDecl= ruleColDecl EOF ;
    public final EObject entryRuleColDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColDecl = null;


        try {
            // InternalCSVParserGenerator.g:216:48: (iv_ruleColDecl= ruleColDecl EOF )
            // InternalCSVParserGenerator.g:217:2: iv_ruleColDecl= ruleColDecl EOF
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
    // InternalCSVParserGenerator.g:223:1: ruleColDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_mods_3_0= ruleModification ) )* ) ;
    public final EObject ruleColDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;

        EObject lv_mods_3_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:229:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_mods_3_0= ruleModification ) )* ) )
            // InternalCSVParserGenerator.g:230:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_mods_3_0= ruleModification ) )* )
            {
            // InternalCSVParserGenerator.g:230:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_mods_3_0= ruleModification ) )* )
            // InternalCSVParserGenerator.g:231:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ( (lv_mods_3_0= ruleModification ) )*
            {
            // InternalCSVParserGenerator.g:231:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCSVParserGenerator.g:232:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCSVParserGenerator.g:232:4: (lv_name_0_0= RULE_ID )
            // InternalCSVParserGenerator.g:233:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getColDeclAccess().getColonKeyword_1());
            		
            // InternalCSVParserGenerator.g:253:3: ( (lv_type_2_0= ruleType ) )
            // InternalCSVParserGenerator.g:254:4: (lv_type_2_0= ruleType )
            {
            // InternalCSVParserGenerator.g:254:4: (lv_type_2_0= ruleType )
            // InternalCSVParserGenerator.g:255:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getColDeclAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalCSVParserGenerator.g:272:3: ( (lv_mods_3_0= ruleModification ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==17) ) {
                        alt4=1;
                    }


                }
                else if ( ((LA4_0>=32 && LA4_0<=38)||LA4_0==40||LA4_0==45) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:273:4: (lv_mods_3_0= ruleModification )
            	    {
            	    // InternalCSVParserGenerator.g:273:4: (lv_mods_3_0= ruleModification )
            	    // InternalCSVParserGenerator.g:274:5: lv_mods_3_0= ruleModification
            	    {

            	    					newCompositeNode(grammarAccess.getColDeclAccess().getModsModificationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop4;
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
    // InternalCSVParserGenerator.g:295:1: entryRuleModification returns [EObject current=null] : iv_ruleModification= ruleModification EOF ;
    public final EObject entryRuleModification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModification = null;


        try {
            // InternalCSVParserGenerator.g:295:53: (iv_ruleModification= ruleModification EOF )
            // InternalCSVParserGenerator.g:296:2: iv_ruleModification= ruleModification EOF
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
    // InternalCSVParserGenerator.g:302:1: ruleModification returns [EObject current=null] : (this_ValueMod_0= ruleValueMod | this_External_1= ruleExternal | this_StatFunc_2= ruleStatFunc | this_ColumnAction_3= ruleColumnAction | this_Constraint_4= ruleConstraint ) ;
    public final EObject ruleModification() throws RecognitionException {
        EObject current = null;

        EObject this_ValueMod_0 = null;

        EObject this_External_1 = null;

        EObject this_StatFunc_2 = null;

        EObject this_ColumnAction_3 = null;

        EObject this_Constraint_4 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:308:2: ( (this_ValueMod_0= ruleValueMod | this_External_1= ruleExternal | this_StatFunc_2= ruleStatFunc | this_ColumnAction_3= ruleColumnAction | this_Constraint_4= ruleConstraint ) )
            // InternalCSVParserGenerator.g:309:2: (this_ValueMod_0= ruleValueMod | this_External_1= ruleExternal | this_StatFunc_2= ruleStatFunc | this_ColumnAction_3= ruleColumnAction | this_Constraint_4= ruleConstraint )
            {
            // InternalCSVParserGenerator.g:309:2: (this_ValueMod_0= ruleValueMod | this_External_1= ruleExternal | this_StatFunc_2= ruleStatFunc | this_ColumnAction_3= ruleColumnAction | this_Constraint_4= ruleConstraint )
            int alt5=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt5=3;
                }
                break;
            case 38:
            case 40:
                {
                alt5=4;
                }
                break;
            case 45:
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
                    // InternalCSVParserGenerator.g:310:3: this_ValueMod_0= ruleValueMod
                    {

                    			newCompositeNode(grammarAccess.getModificationAccess().getValueModParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueMod_0=ruleValueMod();

                    state._fsp--;


                    			current = this_ValueMod_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:319:3: this_External_1= ruleExternal
                    {

                    			newCompositeNode(grammarAccess.getModificationAccess().getExternalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_External_1=ruleExternal();

                    state._fsp--;


                    			current = this_External_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:328:3: this_StatFunc_2= ruleStatFunc
                    {

                    			newCompositeNode(grammarAccess.getModificationAccess().getStatFuncParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StatFunc_2=ruleStatFunc();

                    state._fsp--;


                    			current = this_StatFunc_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:337:3: this_ColumnAction_3= ruleColumnAction
                    {

                    			newCompositeNode(grammarAccess.getModificationAccess().getColumnActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnAction_3=ruleColumnAction();

                    state._fsp--;


                    			current = this_ColumnAction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalCSVParserGenerator.g:346:3: this_Constraint_4= ruleConstraint
                    {

                    			newCompositeNode(grammarAccess.getModificationAccess().getConstraintParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constraint_4=ruleConstraint();

                    state._fsp--;


                    			current = this_Constraint_4;
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
    // $ANTLR end "ruleModification"


    // $ANTLR start "entryRuleOutput"
    // InternalCSVParserGenerator.g:358:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalCSVParserGenerator.g:358:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalCSVParserGenerator.g:359:2: iv_ruleOutput= ruleOutput EOF
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
    // InternalCSVParserGenerator.g:365:1: ruleOutput returns [EObject current=null] : (otherlv_0= 'Output' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:371:2: ( (otherlv_0= 'Output' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) ) )
            // InternalCSVParserGenerator.g:372:2: (otherlv_0= 'Output' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            {
            // InternalCSVParserGenerator.g:372:2: (otherlv_0= 'Output' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) ) )
            // InternalCSVParserGenerator.g:373:3: otherlv_0= 'Output' otherlv_1= ':' ( (lv_name_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputAccess().getOutputKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getColonKeyword_1());
            		
            // InternalCSVParserGenerator.g:381:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalCSVParserGenerator.g:382:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalCSVParserGenerator.g:382:4: (lv_name_2_0= RULE_STRING )
            // InternalCSVParserGenerator.g:383:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

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
    // InternalCSVParserGenerator.g:403:1: entryRuleValueMod returns [EObject current=null] : iv_ruleValueMod= ruleValueMod EOF ;
    public final EObject entryRuleValueMod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueMod = null;


        try {
            // InternalCSVParserGenerator.g:403:49: (iv_ruleValueMod= ruleValueMod EOF )
            // InternalCSVParserGenerator.g:404:2: iv_ruleValueMod= ruleValueMod EOF
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
    // InternalCSVParserGenerator.g:410:1: ruleValueMod returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleLogExp ) ) ) ;
    public final EObject ruleValueMod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_exp_2_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:416:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleLogExp ) ) ) )
            // InternalCSVParserGenerator.g:417:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleLogExp ) ) )
            {
            // InternalCSVParserGenerator.g:417:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleLogExp ) ) )
            // InternalCSVParserGenerator.g:418:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( (lv_exp_2_0= ruleLogExp ) )
            {
            // InternalCSVParserGenerator.g:418:3: ( (otherlv_0= RULE_ID ) )
            // InternalCSVParserGenerator.g:419:4: (otherlv_0= RULE_ID )
            {
            // InternalCSVParserGenerator.g:419:4: (otherlv_0= RULE_ID )
            // InternalCSVParserGenerator.g:420:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueModRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getValueModAccess().getNameColDeclCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getValueModAccess().getEqualsSignKeyword_1());
            		
            // InternalCSVParserGenerator.g:435:3: ( (lv_exp_2_0= ruleLogExp ) )
            // InternalCSVParserGenerator.g:436:4: (lv_exp_2_0= ruleLogExp )
            {
            // InternalCSVParserGenerator.g:436:4: (lv_exp_2_0= ruleLogExp )
            // InternalCSVParserGenerator.g:437:5: lv_exp_2_0= ruleLogExp
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
    // InternalCSVParserGenerator.g:458:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalCSVParserGenerator.g:458:45: (iv_ruleType= ruleType EOF )
            // InternalCSVParserGenerator.g:459:2: iv_ruleType= ruleType EOF
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
    // InternalCSVParserGenerator.g:465:1: ruleType returns [EObject current=null] : ( ( () otherlv_1= 'String' ) | ( () otherlv_3= 'Integer' ) | ( () otherlv_5= 'Date' ) | ( () otherlv_7= 'Float' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:471:2: ( ( ( () otherlv_1= 'String' ) | ( () otherlv_3= 'Integer' ) | ( () otherlv_5= 'Date' ) | ( () otherlv_7= 'Float' ) ) )
            // InternalCSVParserGenerator.g:472:2: ( ( () otherlv_1= 'String' ) | ( () otherlv_3= 'Integer' ) | ( () otherlv_5= 'Date' ) | ( () otherlv_7= 'Float' ) )
            {
            // InternalCSVParserGenerator.g:472:2: ( ( () otherlv_1= 'String' ) | ( () otherlv_3= 'Integer' ) | ( () otherlv_5= 'Date' ) | ( () otherlv_7= 'Float' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalCSVParserGenerator.g:473:3: ( () otherlv_1= 'String' )
                    {
                    // InternalCSVParserGenerator.g:473:3: ( () otherlv_1= 'String' )
                    // InternalCSVParserGenerator.g:474:4: () otherlv_1= 'String'
                    {
                    // InternalCSVParserGenerator.g:474:4: ()
                    // InternalCSVParserGenerator.g:475:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getStrAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getStringKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:487:3: ( () otherlv_3= 'Integer' )
                    {
                    // InternalCSVParserGenerator.g:487:3: ( () otherlv_3= 'Integer' )
                    // InternalCSVParserGenerator.g:488:4: () otherlv_3= 'Integer'
                    {
                    // InternalCSVParserGenerator.g:488:4: ()
                    // InternalCSVParserGenerator.g:489:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getIntegerAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getIntegerKeyword_1_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:501:3: ( () otherlv_5= 'Date' )
                    {
                    // InternalCSVParserGenerator.g:501:3: ( () otherlv_5= 'Date' )
                    // InternalCSVParserGenerator.g:502:4: () otherlv_5= 'Date'
                    {
                    // InternalCSVParserGenerator.g:502:4: ()
                    // InternalCSVParserGenerator.g:503:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getDateAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getDateKeyword_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:515:3: ( () otherlv_7= 'Float' )
                    {
                    // InternalCSVParserGenerator.g:515:3: ( () otherlv_7= 'Float' )
                    // InternalCSVParserGenerator.g:516:4: () otherlv_7= 'Float'
                    {
                    // InternalCSVParserGenerator.g:516:4: ()
                    // InternalCSVParserGenerator.g:517:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getTypeAccess().getFloatAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_7=(Token)match(input,21,FOLLOW_2); 

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
    // InternalCSVParserGenerator.g:532:1: entryRuleLogExp returns [EObject current=null] : iv_ruleLogExp= ruleLogExp EOF ;
    public final EObject entryRuleLogExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogExp = null;


        try {
            // InternalCSVParserGenerator.g:532:47: (iv_ruleLogExp= ruleLogExp EOF )
            // InternalCSVParserGenerator.g:533:2: iv_ruleLogExp= ruleLogExp EOF
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
    // InternalCSVParserGenerator.g:539:1: ruleLogExp returns [EObject current=null] : (this_Comparison_0= ruleComparison ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) ;
    public final EObject ruleLogExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:545:2: ( (this_Comparison_0= ruleComparison ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )* ) )
            // InternalCSVParserGenerator.g:546:2: (this_Comparison_0= ruleComparison ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            {
            // InternalCSVParserGenerator.g:546:2: (this_Comparison_0= ruleComparison ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )* )
            // InternalCSVParserGenerator.g:547:3: this_Comparison_0= ruleComparison ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getLogExpAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVParserGenerator.g:555:3: ( ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=22 && LA8_0<=23)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:556:4: ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) ) ( (lv_right_5_0= ruleComparison ) )
            	    {
            	    // InternalCSVParserGenerator.g:556:4: ( (otherlv_1= '||' () ) | (otherlv_3= '&&' () ) )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==22) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==23) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalCSVParserGenerator.g:557:5: (otherlv_1= '||' () )
            	            {
            	            // InternalCSVParserGenerator.g:557:5: (otherlv_1= '||' () )
            	            // InternalCSVParserGenerator.g:558:6: otherlv_1= '||' ()
            	            {
            	            otherlv_1=(Token)match(input,22,FOLLOW_13); 

            	            						newLeafNode(otherlv_1, grammarAccess.getLogExpAccess().getVerticalLineVerticalLineKeyword_1_0_0_0());
            	            					
            	            // InternalCSVParserGenerator.g:562:6: ()
            	            // InternalCSVParserGenerator.g:563:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogExpAccess().getOrLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVParserGenerator.g:571:5: (otherlv_3= '&&' () )
            	            {
            	            // InternalCSVParserGenerator.g:571:5: (otherlv_3= '&&' () )
            	            // InternalCSVParserGenerator.g:572:6: otherlv_3= '&&' ()
            	            {
            	            otherlv_3=(Token)match(input,23,FOLLOW_13); 

            	            						newLeafNode(otherlv_3, grammarAccess.getLogExpAccess().getAmpersandAmpersandKeyword_1_0_1_0());
            	            					
            	            // InternalCSVParserGenerator.g:576:6: ()
            	            // InternalCSVParserGenerator.g:577:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getLogExpAccess().getAndLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalCSVParserGenerator.g:585:4: ( (lv_right_5_0= ruleComparison ) )
            	    // InternalCSVParserGenerator.g:586:5: (lv_right_5_0= ruleComparison )
            	    {
            	    // InternalCSVParserGenerator.g:586:5: (lv_right_5_0= ruleComparison )
            	    // InternalCSVParserGenerator.g:587:6: lv_right_5_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getLogExpAccess().getRightComparisonParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop8;
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
    // InternalCSVParserGenerator.g:609:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalCSVParserGenerator.g:609:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalCSVParserGenerator.g:610:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalCSVParserGenerator.g:616:1: ruleComparison returns [EObject current=null] : (this_Sum_0= ruleSum ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )* ) ;
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
            // InternalCSVParserGenerator.g:622:2: ( (this_Sum_0= ruleSum ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )* ) )
            // InternalCSVParserGenerator.g:623:2: (this_Sum_0= ruleSum ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )* )
            {
            // InternalCSVParserGenerator.g:623:2: (this_Sum_0= ruleSum ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )* )
            // InternalCSVParserGenerator.g:624:3: this_Sum_0= ruleSum ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getSumParserRuleCall_0());
            		
            pushFollow(FOLLOW_15);
            this_Sum_0=ruleSum();

            state._fsp--;


            			current = this_Sum_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVParserGenerator.g:632:3: ( ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=24 && LA10_0<=29)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:633:4: ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) ) ( (lv_right_13_0= ruleSum ) )
            	    {
            	    // InternalCSVParserGenerator.g:633:4: ( (otherlv_1= '<' () ) | (otherlv_3= '>' () ) | (otherlv_5= '==' () ) | (otherlv_7= '!=' () ) | (otherlv_9= '=<' () ) | (otherlv_11= '=>' () ) )
            	    int alt9=6;
            	    switch ( input.LA(1) ) {
            	    case 24:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt9=4;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt9=5;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt9=6;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // InternalCSVParserGenerator.g:634:5: (otherlv_1= '<' () )
            	            {
            	            // InternalCSVParserGenerator.g:634:5: (otherlv_1= '<' () )
            	            // InternalCSVParserGenerator.g:635:6: otherlv_1= '<' ()
            	            {
            	            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            	            						newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_0_0());
            	            					
            	            // InternalCSVParserGenerator.g:639:6: ()
            	            // InternalCSVParserGenerator.g:640:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getLtLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVParserGenerator.g:648:5: (otherlv_3= '>' () )
            	            {
            	            // InternalCSVParserGenerator.g:648:5: (otherlv_3= '>' () )
            	            // InternalCSVParserGenerator.g:649:6: otherlv_3= '>' ()
            	            {
            	            otherlv_3=(Token)match(input,25,FOLLOW_13); 

            	            						newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_0());
            	            					
            	            // InternalCSVParserGenerator.g:653:6: ()
            	            // InternalCSVParserGenerator.g:654:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getGtLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalCSVParserGenerator.g:662:5: (otherlv_5= '==' () )
            	            {
            	            // InternalCSVParserGenerator.g:662:5: (otherlv_5= '==' () )
            	            // InternalCSVParserGenerator.g:663:6: otherlv_5= '==' ()
            	            {
            	            otherlv_5=(Token)match(input,26,FOLLOW_13); 

            	            						newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getEqualsSignEqualsSignKeyword_1_0_2_0());
            	            					
            	            // InternalCSVParserGenerator.g:667:6: ()
            	            // InternalCSVParserGenerator.g:668:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getEquLeftAction_1_0_2_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalCSVParserGenerator.g:676:5: (otherlv_7= '!=' () )
            	            {
            	            // InternalCSVParserGenerator.g:676:5: (otherlv_7= '!=' () )
            	            // InternalCSVParserGenerator.g:677:6: otherlv_7= '!=' ()
            	            {
            	            otherlv_7=(Token)match(input,27,FOLLOW_13); 

            	            						newLeafNode(otherlv_7, grammarAccess.getComparisonAccess().getExclamationMarkEqualsSignKeyword_1_0_3_0());
            	            					
            	            // InternalCSVParserGenerator.g:681:6: ()
            	            // InternalCSVParserGenerator.g:682:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getNeqLeftAction_1_0_3_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalCSVParserGenerator.g:690:5: (otherlv_9= '=<' () )
            	            {
            	            // InternalCSVParserGenerator.g:690:5: (otherlv_9= '=<' () )
            	            // InternalCSVParserGenerator.g:691:6: otherlv_9= '=<' ()
            	            {
            	            otherlv_9=(Token)match(input,28,FOLLOW_13); 

            	            						newLeafNode(otherlv_9, grammarAccess.getComparisonAccess().getEqualsSignLessThanSignKeyword_1_0_4_0());
            	            					
            	            // InternalCSVParserGenerator.g:695:6: ()
            	            // InternalCSVParserGenerator.g:696:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getLeqLeftAction_1_0_4_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalCSVParserGenerator.g:704:5: (otherlv_11= '=>' () )
            	            {
            	            // InternalCSVParserGenerator.g:704:5: (otherlv_11= '=>' () )
            	            // InternalCSVParserGenerator.g:705:6: otherlv_11= '=>' ()
            	            {
            	            otherlv_11=(Token)match(input,29,FOLLOW_13); 

            	            						newLeafNode(otherlv_11, grammarAccess.getComparisonAccess().getEqualsSignGreaterThanSignKeyword_1_0_5_0());
            	            					
            	            // InternalCSVParserGenerator.g:709:6: ()
            	            // InternalCSVParserGenerator.g:710:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getComparisonAccess().getGeqLeftAction_1_0_5_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalCSVParserGenerator.g:718:4: ( (lv_right_13_0= ruleSum ) )
            	    // InternalCSVParserGenerator.g:719:5: (lv_right_13_0= ruleSum )
            	    {
            	    // InternalCSVParserGenerator.g:719:5: (lv_right_13_0= ruleSum )
            	    // InternalCSVParserGenerator.g:720:6: lv_right_13_0= ruleSum
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightSumParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
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
            	    break loop10;
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
    // InternalCSVParserGenerator.g:742:1: entryRuleParens returns [EObject current=null] : iv_ruleParens= ruleParens EOF ;
    public final EObject entryRuleParens() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParens = null;


        try {
            // InternalCSVParserGenerator.g:742:47: (iv_ruleParens= ruleParens EOF )
            // InternalCSVParserGenerator.g:743:2: iv_ruleParens= ruleParens EOF
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
    // InternalCSVParserGenerator.g:749:1: ruleParens returns [EObject current=null] : (otherlv_0= '(' ( (lv_exp_1_0= ruleLogExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleParens() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:755:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleLogExp ) ) otherlv_2= ')' ) )
            // InternalCSVParserGenerator.g:756:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleLogExp ) ) otherlv_2= ')' )
            {
            // InternalCSVParserGenerator.g:756:2: (otherlv_0= '(' ( (lv_exp_1_0= ruleLogExp ) ) otherlv_2= ')' )
            // InternalCSVParserGenerator.g:757:3: otherlv_0= '(' ( (lv_exp_1_0= ruleLogExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getParensAccess().getLeftParenthesisKeyword_0());
            		
            // InternalCSVParserGenerator.g:761:3: ( (lv_exp_1_0= ruleLogExp ) )
            // InternalCSVParserGenerator.g:762:4: (lv_exp_1_0= ruleLogExp )
            {
            // InternalCSVParserGenerator.g:762:4: (lv_exp_1_0= ruleLogExp )
            // InternalCSVParserGenerator.g:763:5: lv_exp_1_0= ruleLogExp
            {

            					newCompositeNode(grammarAccess.getParensAccess().getExpLogExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
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

            otherlv_2=(Token)match(input,31,FOLLOW_2); 

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
    // InternalCSVParserGenerator.g:788:1: entryRuleExternal returns [EObject current=null] : iv_ruleExternal= ruleExternal EOF ;
    public final EObject entryRuleExternal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternal = null;


        try {
            // InternalCSVParserGenerator.g:788:49: (iv_ruleExternal= ruleExternal EOF )
            // InternalCSVParserGenerator.g:789:2: iv_ruleExternal= ruleExternal EOF
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
    // InternalCSVParserGenerator.g:795:1: ruleExternal returns [EObject current=null] : (otherlv_0= 'ExtFunc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ;
    public final EObject ruleExternal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:801:2: ( (otherlv_0= 'ExtFunc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            // InternalCSVParserGenerator.g:802:2: (otherlv_0= 'ExtFunc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            {
            // InternalCSVParserGenerator.g:802:2: (otherlv_0= 'ExtFunc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
            // InternalCSVParserGenerator.g:803:3: otherlv_0= 'ExtFunc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAccess().getExtFuncKeyword_0());
            		
            // InternalCSVParserGenerator.g:807:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCSVParserGenerator.g:808:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCSVParserGenerator.g:808:4: (lv_name_1_0= RULE_ID )
            // InternalCSVParserGenerator.g:809:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCSVParserGenerator.g:829:3: ( (otherlv_3= RULE_ID ) )
            // InternalCSVParserGenerator.g:830:4: (otherlv_3= RULE_ID )
            {
            // InternalCSVParserGenerator.g:830:4: (otherlv_3= RULE_ID )
            // InternalCSVParserGenerator.g:831:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_3, grammarAccess.getExternalAccess().getInpColDeclCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_2); 

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
    // InternalCSVParserGenerator.g:850:1: entryRuleStatFunc returns [EObject current=null] : iv_ruleStatFunc= ruleStatFunc EOF ;
    public final EObject entryRuleStatFunc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatFunc = null;


        try {
            // InternalCSVParserGenerator.g:850:49: (iv_ruleStatFunc= ruleStatFunc EOF )
            // InternalCSVParserGenerator.g:851:2: iv_ruleStatFunc= ruleStatFunc EOF
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
    // InternalCSVParserGenerator.g:857:1: ruleStatFunc returns [EObject current=null] : ( ( () otherlv_1= 'Max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( () otherlv_6= 'Min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( () otherlv_11= 'Std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'Sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) | ( () otherlv_21= 'Mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' ) ) ;
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
            // InternalCSVParserGenerator.g:863:2: ( ( ( () otherlv_1= 'Max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( () otherlv_6= 'Min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( () otherlv_11= 'Std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'Sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) | ( () otherlv_21= 'Mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' ) ) )
            // InternalCSVParserGenerator.g:864:2: ( ( () otherlv_1= 'Max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( () otherlv_6= 'Min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( () otherlv_11= 'Std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'Sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) | ( () otherlv_21= 'Mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' ) )
            {
            // InternalCSVParserGenerator.g:864:2: ( ( () otherlv_1= 'Max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) | ( () otherlv_6= 'Min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' ) | ( () otherlv_11= 'Std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' ) | ( () otherlv_16= 'Sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' ) | ( () otherlv_21= 'Mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 34:
                {
                alt11=2;
                }
                break;
            case 35:
                {
                alt11=3;
                }
                break;
            case 36:
                {
                alt11=4;
                }
                break;
            case 37:
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
                    // InternalCSVParserGenerator.g:865:3: ( () otherlv_1= 'Max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    {
                    // InternalCSVParserGenerator.g:865:3: ( () otherlv_1= 'Max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    // InternalCSVParserGenerator.g:866:4: () otherlv_1= 'Max' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    // InternalCSVParserGenerator.g:866:4: ()
                    // InternalCSVParserGenerator.g:867:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatFuncAccess().getMaxAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatFuncAccess().getMaxKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalCSVParserGenerator.g:881:4: ( (otherlv_3= RULE_ID ) )
                    // InternalCSVParserGenerator.g:882:5: (otherlv_3= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:882:5: (otherlv_3= RULE_ID )
                    // InternalCSVParserGenerator.g:883:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatFuncRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_3, grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_0_3_0());
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:900:3: ( () otherlv_6= 'Min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
                    {
                    // InternalCSVParserGenerator.g:900:3: ( () otherlv_6= 'Min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')' )
                    // InternalCSVParserGenerator.g:901:4: () otherlv_6= 'Min' otherlv_7= '(' ( (otherlv_8= RULE_ID ) ) otherlv_9= ')'
                    {
                    // InternalCSVParserGenerator.g:901:4: ()
                    // InternalCSVParserGenerator.g:902:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatFuncAccess().getMinAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,34,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getStatFuncAccess().getMinKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalCSVParserGenerator.g:916:4: ( (otherlv_8= RULE_ID ) )
                    // InternalCSVParserGenerator.g:917:5: (otherlv_8= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:917:5: (otherlv_8= RULE_ID )
                    // InternalCSVParserGenerator.g:918:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatFuncRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_8, grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_1_3_0());
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCSVParserGenerator.g:935:3: ( () otherlv_11= 'Std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )
                    {
                    // InternalCSVParserGenerator.g:935:3: ( () otherlv_11= 'Std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')' )
                    // InternalCSVParserGenerator.g:936:4: () otherlv_11= 'Std' otherlv_12= '(' ( (otherlv_13= RULE_ID ) ) otherlv_14= ')'
                    {
                    // InternalCSVParserGenerator.g:936:4: ()
                    // InternalCSVParserGenerator.g:937:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatFuncAccess().getStdAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,35,FOLLOW_17); 

                    				newLeafNode(otherlv_11, grammarAccess.getStatFuncAccess().getStdKeyword_2_1());
                    			
                    otherlv_12=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalCSVParserGenerator.g:951:4: ( (otherlv_13= RULE_ID ) )
                    // InternalCSVParserGenerator.g:952:5: (otherlv_13= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:952:5: (otherlv_13= RULE_ID )
                    // InternalCSVParserGenerator.g:953:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatFuncRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_13, grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_2_3_0());
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCSVParserGenerator.g:970:3: ( () otherlv_16= 'Sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' )
                    {
                    // InternalCSVParserGenerator.g:970:3: ( () otherlv_16= 'Sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')' )
                    // InternalCSVParserGenerator.g:971:4: () otherlv_16= 'Sum' otherlv_17= '(' ( (otherlv_18= RULE_ID ) ) otherlv_19= ')'
                    {
                    // InternalCSVParserGenerator.g:971:4: ()
                    // InternalCSVParserGenerator.g:972:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatFuncAccess().getSumFuncAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_16=(Token)match(input,36,FOLLOW_17); 

                    				newLeafNode(otherlv_16, grammarAccess.getStatFuncAccess().getSumKeyword_3_1());
                    			
                    otherlv_17=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_17, grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_3_2());
                    			
                    // InternalCSVParserGenerator.g:986:4: ( (otherlv_18= RULE_ID ) )
                    // InternalCSVParserGenerator.g:987:5: (otherlv_18= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:987:5: (otherlv_18= RULE_ID )
                    // InternalCSVParserGenerator.g:988:6: otherlv_18= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatFuncRule());
                    						}
                    					
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_18, grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_3_3_0());
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_19, grammarAccess.getStatFuncAccess().getRightParenthesisKeyword_3_4());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalCSVParserGenerator.g:1005:3: ( () otherlv_21= 'Mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' )
                    {
                    // InternalCSVParserGenerator.g:1005:3: ( () otherlv_21= 'Mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')' )
                    // InternalCSVParserGenerator.g:1006:4: () otherlv_21= 'Mean' otherlv_22= '(' ( (otherlv_23= RULE_ID ) ) otherlv_24= ')'
                    {
                    // InternalCSVParserGenerator.g:1006:4: ()
                    // InternalCSVParserGenerator.g:1007:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatFuncAccess().getMeanAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_21=(Token)match(input,37,FOLLOW_17); 

                    				newLeafNode(otherlv_21, grammarAccess.getStatFuncAccess().getMeanKeyword_4_1());
                    			
                    otherlv_22=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_22, grammarAccess.getStatFuncAccess().getLeftParenthesisKeyword_4_2());
                    			
                    // InternalCSVParserGenerator.g:1021:4: ( (otherlv_23= RULE_ID ) )
                    // InternalCSVParserGenerator.g:1022:5: (otherlv_23= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:1022:5: (otherlv_23= RULE_ID )
                    // InternalCSVParserGenerator.g:1023:6: otherlv_23= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatFuncRule());
                    						}
                    					
                    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_23, grammarAccess.getStatFuncAccess().getInputColDeclCrossReference_4_3_0());
                    					

                    }


                    }

                    otherlv_24=(Token)match(input,31,FOLLOW_2); 

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
    // InternalCSVParserGenerator.g:1043:1: entryRuleColumnAction returns [EObject current=null] : iv_ruleColumnAction= ruleColumnAction EOF ;
    public final EObject entryRuleColumnAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnAction = null;


        try {
            // InternalCSVParserGenerator.g:1043:53: (iv_ruleColumnAction= ruleColumnAction EOF )
            // InternalCSVParserGenerator.g:1044:2: iv_ruleColumnAction= ruleColumnAction EOF
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
    // InternalCSVParserGenerator.g:1050:1: ruleColumnAction returns [EObject current=null] : ( ( () otherlv_1= 'AddCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_mod_4_0= ruleLogExp ) ) ) | ( () otherlv_6= 'RemCol' ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleColumnAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_mod_4_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1056:2: ( ( ( () otherlv_1= 'AddCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_mod_4_0= ruleLogExp ) ) ) | ( () otherlv_6= 'RemCol' ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalCSVParserGenerator.g:1057:2: ( ( () otherlv_1= 'AddCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_mod_4_0= ruleLogExp ) ) ) | ( () otherlv_6= 'RemCol' ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalCSVParserGenerator.g:1057:2: ( ( () otherlv_1= 'AddCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_mod_4_0= ruleLogExp ) ) ) | ( () otherlv_6= 'RemCol' ( (otherlv_7= RULE_ID ) ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            else if ( (LA12_0==40) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCSVParserGenerator.g:1058:3: ( () otherlv_1= 'AddCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_mod_4_0= ruleLogExp ) ) )
                    {
                    // InternalCSVParserGenerator.g:1058:3: ( () otherlv_1= 'AddCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_mod_4_0= ruleLogExp ) ) )
                    // InternalCSVParserGenerator.g:1059:4: () otherlv_1= 'AddCol' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'with' ( (lv_mod_4_0= ruleLogExp ) )
                    {
                    // InternalCSVParserGenerator.g:1059:4: ()
                    // InternalCSVParserGenerator.g:1060:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColumnActionAccess().getAddAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,38,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getColumnActionAccess().getAddColKeyword_0_1());
                    			
                    // InternalCSVParserGenerator.g:1070:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalCSVParserGenerator.g:1071:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:1071:5: (lv_name_2_0= RULE_ID )
                    // InternalCSVParserGenerator.g:1072:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); 

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

                    otherlv_3=(Token)match(input,39,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getColumnActionAccess().getWithKeyword_0_3());
                    			
                    // InternalCSVParserGenerator.g:1092:4: ( (lv_mod_4_0= ruleLogExp ) )
                    // InternalCSVParserGenerator.g:1093:5: (lv_mod_4_0= ruleLogExp )
                    {
                    // InternalCSVParserGenerator.g:1093:5: (lv_mod_4_0= ruleLogExp )
                    // InternalCSVParserGenerator.g:1094:6: lv_mod_4_0= ruleLogExp
                    {

                    						newCompositeNode(grammarAccess.getColumnActionAccess().getModLogExpParserRuleCall_0_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mod_4_0=ruleLogExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnActionRule());
                    						}
                    						set(
                    							current,
                    							"mod",
                    							lv_mod_4_0,
                    							"dk.sdu.mdsd.CSVParserGenerator.LogExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCSVParserGenerator.g:1113:3: ( () otherlv_6= 'RemCol' ( (otherlv_7= RULE_ID ) ) )
                    {
                    // InternalCSVParserGenerator.g:1113:3: ( () otherlv_6= 'RemCol' ( (otherlv_7= RULE_ID ) ) )
                    // InternalCSVParserGenerator.g:1114:4: () otherlv_6= 'RemCol' ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalCSVParserGenerator.g:1114:4: ()
                    // InternalCSVParserGenerator.g:1115:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getColumnActionAccess().getRemAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getColumnActionAccess().getRemColKeyword_1_1());
                    			
                    // InternalCSVParserGenerator.g:1125:4: ( (otherlv_7= RULE_ID ) )
                    // InternalCSVParserGenerator.g:1126:5: (otherlv_7= RULE_ID )
                    {
                    // InternalCSVParserGenerator.g:1126:5: (otherlv_7= RULE_ID )
                    // InternalCSVParserGenerator.g:1127:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getColumnActionRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getColumnActionAccess().getNameColDeclCrossReference_1_2_0());
                    					

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
    // InternalCSVParserGenerator.g:1143:1: entryRuleSum returns [EObject current=null] : iv_ruleSum= ruleSum EOF ;
    public final EObject entryRuleSum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSum = null;


        try {
            // InternalCSVParserGenerator.g:1143:44: (iv_ruleSum= ruleSum EOF )
            // InternalCSVParserGenerator.g:1144:2: iv_ruleSum= ruleSum EOF
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
    // InternalCSVParserGenerator.g:1150:1: ruleSum returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleSum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1156:2: ( (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalCSVParserGenerator.g:1157:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalCSVParserGenerator.g:1157:2: (this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalCSVParserGenerator.g:1158:3: this_Factor_0= ruleFactor ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getSumAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_19);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVParserGenerator.g:1166:3: ( ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=41 && LA14_0<=42)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1167:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalCSVParserGenerator.g:1167:4: ( (otherlv_1= '+' () ) | (otherlv_3= '-' () ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==41) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==42) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalCSVParserGenerator.g:1168:5: (otherlv_1= '+' () )
            	            {
            	            // InternalCSVParserGenerator.g:1168:5: (otherlv_1= '+' () )
            	            // InternalCSVParserGenerator.g:1169:6: otherlv_1= '+' ()
            	            {
            	            otherlv_1=(Token)match(input,41,FOLLOW_13); 

            	            						newLeafNode(otherlv_1, grammarAccess.getSumAccess().getPlusSignKeyword_1_0_0_0());
            	            					
            	            // InternalCSVParserGenerator.g:1173:6: ()
            	            // InternalCSVParserGenerator.g:1174:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getPlusLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVParserGenerator.g:1182:5: (otherlv_3= '-' () )
            	            {
            	            // InternalCSVParserGenerator.g:1182:5: (otherlv_3= '-' () )
            	            // InternalCSVParserGenerator.g:1183:6: otherlv_3= '-' ()
            	            {
            	            otherlv_3=(Token)match(input,42,FOLLOW_13); 

            	            						newLeafNode(otherlv_3, grammarAccess.getSumAccess().getHyphenMinusKeyword_1_0_1_0());
            	            					
            	            // InternalCSVParserGenerator.g:1187:6: ()
            	            // InternalCSVParserGenerator.g:1188:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getSumAccess().getMinusLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalCSVParserGenerator.g:1196:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalCSVParserGenerator.g:1197:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalCSVParserGenerator.g:1197:5: (lv_right_5_0= ruleFactor )
            	    // InternalCSVParserGenerator.g:1198:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getSumAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop14;
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
    // InternalCSVParserGenerator.g:1220:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalCSVParserGenerator.g:1220:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalCSVParserGenerator.g:1221:2: iv_ruleFactor= ruleFactor EOF
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
    // InternalCSVParserGenerator.g:1227:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1233:2: ( (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalCSVParserGenerator.g:1234:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalCSVParserGenerator.g:1234:2: (this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalCSVParserGenerator.g:1235:3: this_Primary_0= rulePrimary ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_20);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCSVParserGenerator.g:1243:3: ( ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=43 && LA16_0<=44)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCSVParserGenerator.g:1244:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalCSVParserGenerator.g:1244:4: ( (otherlv_1= '*' () ) | (otherlv_3= '/' () ) )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==43) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==44) ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalCSVParserGenerator.g:1245:5: (otherlv_1= '*' () )
            	            {
            	            // InternalCSVParserGenerator.g:1245:5: (otherlv_1= '*' () )
            	            // InternalCSVParserGenerator.g:1246:6: otherlv_1= '*' ()
            	            {
            	            otherlv_1=(Token)match(input,43,FOLLOW_13); 

            	            						newLeafNode(otherlv_1, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_0());
            	            					
            	            // InternalCSVParserGenerator.g:1250:6: ()
            	            // InternalCSVParserGenerator.g:1251:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalCSVParserGenerator.g:1259:5: (otherlv_3= '/' () )
            	            {
            	            // InternalCSVParserGenerator.g:1259:5: (otherlv_3= '/' () )
            	            // InternalCSVParserGenerator.g:1260:6: otherlv_3= '/' ()
            	            {
            	            otherlv_3=(Token)match(input,44,FOLLOW_13); 

            	            						newLeafNode(otherlv_3, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_0());
            	            					
            	            // InternalCSVParserGenerator.g:1264:6: ()
            	            // InternalCSVParserGenerator.g:1265:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_1(),
            	            								current);
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalCSVParserGenerator.g:1273:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalCSVParserGenerator.g:1274:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalCSVParserGenerator.g:1274:5: (lv_right_5_0= rulePrimary )
            	    // InternalCSVParserGenerator.g:1275:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop16;
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
    // InternalCSVParserGenerator.g:1297:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalCSVParserGenerator.g:1297:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalCSVParserGenerator.g:1298:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalCSVParserGenerator.g:1304:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parens_1= ruleParens | this_ColumnVar_2= ruleColumnVar ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parens_1 = null;

        EObject this_ColumnVar_2 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1310:2: ( (this_Number_0= ruleNumber | this_Parens_1= ruleParens | this_ColumnVar_2= ruleColumnVar ) )
            // InternalCSVParserGenerator.g:1311:2: (this_Number_0= ruleNumber | this_Parens_1= ruleParens | this_ColumnVar_2= ruleColumnVar )
            {
            // InternalCSVParserGenerator.g:1311:2: (this_Number_0= ruleNumber | this_Parens_1= ruleParens | this_ColumnVar_2= ruleColumnVar )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt17=1;
                }
                break;
            case 30:
                {
                alt17=2;
                }
                break;
            case RULE_ID:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalCSVParserGenerator.g:1312:3: this_Number_0= ruleNumber
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
                    // InternalCSVParserGenerator.g:1321:3: this_Parens_1= ruleParens
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
                    // InternalCSVParserGenerator.g:1330:3: this_ColumnVar_2= ruleColumnVar
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getColumnVarParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ColumnVar_2=ruleColumnVar();

                    state._fsp--;


                    			current = this_ColumnVar_2;
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
    // InternalCSVParserGenerator.g:1342:1: entryRuleColumnVar returns [EObject current=null] : iv_ruleColumnVar= ruleColumnVar EOF ;
    public final EObject entryRuleColumnVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnVar = null;


        try {
            // InternalCSVParserGenerator.g:1342:50: (iv_ruleColumnVar= ruleColumnVar EOF )
            // InternalCSVParserGenerator.g:1343:2: iv_ruleColumnVar= ruleColumnVar EOF
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
    // InternalCSVParserGenerator.g:1349:1: ruleColumnVar returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleColumnVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1355:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCSVParserGenerator.g:1356:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCSVParserGenerator.g:1356:2: ( (otherlv_0= RULE_ID ) )
            // InternalCSVParserGenerator.g:1357:3: (otherlv_0= RULE_ID )
            {
            // InternalCSVParserGenerator.g:1357:3: (otherlv_0= RULE_ID )
            // InternalCSVParserGenerator.g:1358:4: otherlv_0= RULE_ID
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
    // InternalCSVParserGenerator.g:1372:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalCSVParserGenerator.g:1372:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalCSVParserGenerator.g:1373:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalCSVParserGenerator.g:1379:1: ruleNumber returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1385:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalCSVParserGenerator.g:1386:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalCSVParserGenerator.g:1386:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
            // InternalCSVParserGenerator.g:1387:3: () ( (lv_value_1_0= RULE_INT ) )
            {
            // InternalCSVParserGenerator.g:1387:3: ()
            // InternalCSVParserGenerator.g:1388:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNumberAccess().getNumAction_0(),
            					current);
            			

            }

            // InternalCSVParserGenerator.g:1394:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalCSVParserGenerator.g:1395:4: (lv_value_1_0= RULE_INT )
            {
            // InternalCSVParserGenerator.g:1395:4: (lv_value_1_0= RULE_INT )
            // InternalCSVParserGenerator.g:1396:5: lv_value_1_0= RULE_INT
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
    // InternalCSVParserGenerator.g:1416:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalCSVParserGenerator.g:1416:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalCSVParserGenerator.g:1417:2: iv_ruleConstraint= ruleConstraint EOF
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
    // InternalCSVParserGenerator.g:1423:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'satisfies' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_exp_3_0= ruleLogExp ) ) ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_exp_3_0 = null;



        	enterRule();

        try {
            // InternalCSVParserGenerator.g:1429:2: ( (otherlv_0= 'satisfies' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_exp_3_0= ruleLogExp ) ) ) )
            // InternalCSVParserGenerator.g:1430:2: (otherlv_0= 'satisfies' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_exp_3_0= ruleLogExp ) ) )
            {
            // InternalCSVParserGenerator.g:1430:2: (otherlv_0= 'satisfies' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_exp_3_0= ruleLogExp ) ) )
            // InternalCSVParserGenerator.g:1431:3: otherlv_0= 'satisfies' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'constraint' ( (lv_exp_3_0= ruleLogExp ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getSatisfiesKeyword_0());
            		
            // InternalCSVParserGenerator.g:1435:3: ( (otherlv_1= RULE_ID ) )
            // InternalCSVParserGenerator.g:1436:4: (otherlv_1= RULE_ID )
            {
            // InternalCSVParserGenerator.g:1436:4: (otherlv_1= RULE_ID )
            // InternalCSVParserGenerator.g:1437:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConstraintRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getNameColDeclCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,46,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getConstraintKeyword_2());
            		
            // InternalCSVParserGenerator.g:1452:3: ( (lv_exp_3_0= ruleLogExp ) )
            // InternalCSVParserGenerator.g:1453:4: (lv_exp_3_0= ruleLogExp )
            {
            // InternalCSVParserGenerator.g:1453:4: (lv_exp_3_0= ruleLogExp )
            // InternalCSVParserGenerator.g:1454:5: lv_exp_3_0= ruleLogExp
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000217F00010022L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000217F00000022L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000003F000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});

}