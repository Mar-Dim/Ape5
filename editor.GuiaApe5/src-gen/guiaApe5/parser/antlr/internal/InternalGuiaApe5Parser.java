package guiaApe5.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import guiaApe5.services.GuiaApe5GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGuiaApe5Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Sistema'", "'{'", "'contiene'", "'='", "','", "'}'", "'Contenedor'", "'relaciona'", "'['", "']'", "'posee'", "';'", "'esMain'", "'esVisual'", "'Elemento'", "'longitud'", "'tipoDato'", "'isPrimary'", "'esObligatorio'", "'true'", "'false'", "'-'", "'String'", "'int'", "'boolean'", "'double'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalGuiaApe5Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGuiaApe5Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGuiaApe5Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalGuiaApe5.g"; }



     	private GuiaApe5GrammarAccess grammarAccess;

        public InternalGuiaApe5Parser(TokenStream input, GuiaApe5GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Sistema";
       	}

       	@Override
       	protected GuiaApe5GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSistema"
    // InternalGuiaApe5.g:65:1: entryRuleSistema returns [EObject current=null] : iv_ruleSistema= ruleSistema EOF ;
    public final EObject entryRuleSistema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSistema = null;


        try {
            // InternalGuiaApe5.g:65:48: (iv_ruleSistema= ruleSistema EOF )
            // InternalGuiaApe5.g:66:2: iv_ruleSistema= ruleSistema EOF
            {
             newCompositeNode(grammarAccess.getSistemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSistema=ruleSistema();

            state._fsp--;

             current =iv_ruleSistema; 
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
    // $ANTLR end "entryRuleSistema"


    // $ANTLR start "ruleSistema"
    // InternalGuiaApe5.g:72:1: ruleSistema returns [EObject current=null] : (otherlv_0= 'Sistema' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contiene' otherlv_4= '=' otherlv_5= '{' ( (lv_contiene_6_0= ruleContenedor ) ) (otherlv_7= ',' ( (lv_contiene_8_0= ruleContenedor ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleSistema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_contiene_6_0 = null;

        EObject lv_contiene_8_0 = null;



        	enterRule();

        try {
            // InternalGuiaApe5.g:78:2: ( (otherlv_0= 'Sistema' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contiene' otherlv_4= '=' otherlv_5= '{' ( (lv_contiene_6_0= ruleContenedor ) ) (otherlv_7= ',' ( (lv_contiene_8_0= ruleContenedor ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // InternalGuiaApe5.g:79:2: (otherlv_0= 'Sistema' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contiene' otherlv_4= '=' otherlv_5= '{' ( (lv_contiene_6_0= ruleContenedor ) ) (otherlv_7= ',' ( (lv_contiene_8_0= ruleContenedor ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // InternalGuiaApe5.g:79:2: (otherlv_0= 'Sistema' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contiene' otherlv_4= '=' otherlv_5= '{' ( (lv_contiene_6_0= ruleContenedor ) ) (otherlv_7= ',' ( (lv_contiene_8_0= ruleContenedor ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // InternalGuiaApe5.g:80:3: otherlv_0= 'Sistema' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'contiene' otherlv_4= '=' otherlv_5= '{' ( (lv_contiene_6_0= ruleContenedor ) ) (otherlv_7= ',' ( (lv_contiene_8_0= ruleContenedor ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSistemaAccess().getSistemaKeyword_0());
            		
            // InternalGuiaApe5.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGuiaApe5.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalGuiaApe5.g:85:4: (lv_name_1_0= ruleEString )
            // InternalGuiaApe5.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSistemaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSistemaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"guiaApe5.GuiaApe5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSistemaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSistemaAccess().getContieneKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSistemaAccess().getEqualsSignKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getSistemaAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGuiaApe5.g:119:3: ( (lv_contiene_6_0= ruleContenedor ) )
            // InternalGuiaApe5.g:120:4: (lv_contiene_6_0= ruleContenedor )
            {
            // InternalGuiaApe5.g:120:4: (lv_contiene_6_0= ruleContenedor )
            // InternalGuiaApe5.g:121:5: lv_contiene_6_0= ruleContenedor
            {

            					newCompositeNode(grammarAccess.getSistemaAccess().getContieneContenedorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_contiene_6_0=ruleContenedor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSistemaRule());
            					}
            					add(
            						current,
            						"contiene",
            						lv_contiene_6_0,
            						"guiaApe5.GuiaApe5.Contenedor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuiaApe5.g:138:3: (otherlv_7= ',' ( (lv_contiene_8_0= ruleContenedor ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalGuiaApe5.g:139:4: otherlv_7= ',' ( (lv_contiene_8_0= ruleContenedor ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSistemaAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalGuiaApe5.g:143:4: ( (lv_contiene_8_0= ruleContenedor ) )
            	    // InternalGuiaApe5.g:144:5: (lv_contiene_8_0= ruleContenedor )
            	    {
            	    // InternalGuiaApe5.g:144:5: (lv_contiene_8_0= ruleContenedor )
            	    // InternalGuiaApe5.g:145:6: lv_contiene_8_0= ruleContenedor
            	    {

            	    						newCompositeNode(grammarAccess.getSistemaAccess().getContieneContenedorParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_contiene_8_0=ruleContenedor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSistemaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contiene",
            	    							lv_contiene_8_0,
            	    							"guiaApe5.GuiaApe5.Contenedor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getSistemaAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSistemaAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleSistema"


    // $ANTLR start "entryRuleEString"
    // InternalGuiaApe5.g:175:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalGuiaApe5.g:175:47: (iv_ruleEString= ruleEString EOF )
            // InternalGuiaApe5.g:176:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGuiaApe5.g:182:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalGuiaApe5.g:188:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalGuiaApe5.g:189:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalGuiaApe5.g:189:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGuiaApe5.g:190:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGuiaApe5.g:198:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleContenedor"
    // InternalGuiaApe5.g:209:1: entryRuleContenedor returns [EObject current=null] : iv_ruleContenedor= ruleContenedor EOF ;
    public final EObject entryRuleContenedor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContenedor = null;


        try {
            // InternalGuiaApe5.g:209:51: (iv_ruleContenedor= ruleContenedor EOF )
            // InternalGuiaApe5.g:210:2: iv_ruleContenedor= ruleContenedor EOF
            {
             newCompositeNode(grammarAccess.getContenedorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContenedor=ruleContenedor();

            state._fsp--;

             current =iv_ruleContenedor; 
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
    // $ANTLR end "entryRuleContenedor"


    // $ANTLR start "ruleContenedor"
    // InternalGuiaApe5.g:216:1: ruleContenedor returns [EObject current=null] : (otherlv_0= 'Contenedor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'relaciona' otherlv_4= '[' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ']' )? otherlv_9= 'posee' otherlv_10= '{' ( (lv_posee_11_0= ruleElemento ) ) ( (lv_posee_12_0= ruleElemento ) )* otherlv_13= ';' otherlv_14= '}' otherlv_15= 'esMain' otherlv_16= '=' ( (lv_main_17_0= ruleEBoolean ) ) otherlv_18= ';' otherlv_19= 'esVisual' otherlv_20= '=' ( (lv_esVisual_21_0= ruleEBoolean ) ) otherlv_22= ';' otherlv_23= '}' ) ;
    public final EObject ruleContenedor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_posee_11_0 = null;

        EObject lv_posee_12_0 = null;

        AntlrDatatypeRuleToken lv_main_17_0 = null;

        AntlrDatatypeRuleToken lv_esVisual_21_0 = null;



        	enterRule();

        try {
            // InternalGuiaApe5.g:222:2: ( (otherlv_0= 'Contenedor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'relaciona' otherlv_4= '[' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ']' )? otherlv_9= 'posee' otherlv_10= '{' ( (lv_posee_11_0= ruleElemento ) ) ( (lv_posee_12_0= ruleElemento ) )* otherlv_13= ';' otherlv_14= '}' otherlv_15= 'esMain' otherlv_16= '=' ( (lv_main_17_0= ruleEBoolean ) ) otherlv_18= ';' otherlv_19= 'esVisual' otherlv_20= '=' ( (lv_esVisual_21_0= ruleEBoolean ) ) otherlv_22= ';' otherlv_23= '}' ) )
            // InternalGuiaApe5.g:223:2: (otherlv_0= 'Contenedor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'relaciona' otherlv_4= '[' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ']' )? otherlv_9= 'posee' otherlv_10= '{' ( (lv_posee_11_0= ruleElemento ) ) ( (lv_posee_12_0= ruleElemento ) )* otherlv_13= ';' otherlv_14= '}' otherlv_15= 'esMain' otherlv_16= '=' ( (lv_main_17_0= ruleEBoolean ) ) otherlv_18= ';' otherlv_19= 'esVisual' otherlv_20= '=' ( (lv_esVisual_21_0= ruleEBoolean ) ) otherlv_22= ';' otherlv_23= '}' )
            {
            // InternalGuiaApe5.g:223:2: (otherlv_0= 'Contenedor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'relaciona' otherlv_4= '[' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ']' )? otherlv_9= 'posee' otherlv_10= '{' ( (lv_posee_11_0= ruleElemento ) ) ( (lv_posee_12_0= ruleElemento ) )* otherlv_13= ';' otherlv_14= '}' otherlv_15= 'esMain' otherlv_16= '=' ( (lv_main_17_0= ruleEBoolean ) ) otherlv_18= ';' otherlv_19= 'esVisual' otherlv_20= '=' ( (lv_esVisual_21_0= ruleEBoolean ) ) otherlv_22= ';' otherlv_23= '}' )
            // InternalGuiaApe5.g:224:3: otherlv_0= 'Contenedor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'relaciona' otherlv_4= '[' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ']' )? otherlv_9= 'posee' otherlv_10= '{' ( (lv_posee_11_0= ruleElemento ) ) ( (lv_posee_12_0= ruleElemento ) )* otherlv_13= ';' otherlv_14= '}' otherlv_15= 'esMain' otherlv_16= '=' ( (lv_main_17_0= ruleEBoolean ) ) otherlv_18= ';' otherlv_19= 'esVisual' otherlv_20= '=' ( (lv_esVisual_21_0= ruleEBoolean ) ) otherlv_22= ';' otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContenedorAccess().getContenedorKeyword_0());
            		
            // InternalGuiaApe5.g:228:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGuiaApe5.g:229:4: (lv_name_1_0= ruleEString )
            {
            // InternalGuiaApe5.g:229:4: (lv_name_1_0= ruleEString )
            // InternalGuiaApe5.g:230:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getContenedorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContenedorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"guiaApe5.GuiaApe5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getContenedorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalGuiaApe5.g:251:3: (otherlv_3= 'relaciona' otherlv_4= '[' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalGuiaApe5.g:252:4: otherlv_3= 'relaciona' otherlv_4= '[' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ']'
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getContenedorAccess().getRelacionaKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getContenedorAccess().getLeftSquareBracketKeyword_3_1());
                    			
                    // InternalGuiaApe5.g:260:4: ( ( ruleEString ) )
                    // InternalGuiaApe5.g:261:5: ( ruleEString )
                    {
                    // InternalGuiaApe5.g:261:5: ( ruleEString )
                    // InternalGuiaApe5.g:262:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContenedorRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getContenedorAccess().getRelacionaContenedorCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalGuiaApe5.g:276:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalGuiaApe5.g:277:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getContenedorAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalGuiaApe5.g:281:5: ( ( ruleEString ) )
                    	    // InternalGuiaApe5.g:282:6: ( ruleEString )
                    	    {
                    	    // InternalGuiaApe5.g:282:6: ( ruleEString )
                    	    // InternalGuiaApe5.g:283:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getContenedorRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getContenedorAccess().getRelacionaContenedorCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_8, grammarAccess.getContenedorAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getContenedorAccess().getPoseeKeyword_4());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getContenedorAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalGuiaApe5.g:311:3: ( (lv_posee_11_0= ruleElemento ) )
            // InternalGuiaApe5.g:312:4: (lv_posee_11_0= ruleElemento )
            {
            // InternalGuiaApe5.g:312:4: (lv_posee_11_0= ruleElemento )
            // InternalGuiaApe5.g:313:5: lv_posee_11_0= ruleElemento
            {

            					newCompositeNode(grammarAccess.getContenedorAccess().getPoseeElementoParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_15);
            lv_posee_11_0=ruleElemento();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContenedorRule());
            					}
            					add(
            						current,
            						"posee",
            						lv_posee_11_0,
            						"guiaApe5.GuiaApe5.Elemento");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGuiaApe5.g:330:3: ( (lv_posee_12_0= ruleElemento ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGuiaApe5.g:331:4: (lv_posee_12_0= ruleElemento )
            	    {
            	    // InternalGuiaApe5.g:331:4: (lv_posee_12_0= ruleElemento )
            	    // InternalGuiaApe5.g:332:5: lv_posee_12_0= ruleElemento
            	    {

            	    					newCompositeNode(grammarAccess.getContenedorAccess().getPoseeElementoParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_posee_12_0=ruleElemento();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContenedorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"posee",
            	    						lv_posee_12_0,
            	    						"guiaApe5.GuiaApe5.Elemento");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_13=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getContenedorAccess().getSemicolonKeyword_8());
            		
            otherlv_14=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_14, grammarAccess.getContenedorAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_15=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getContenedorAccess().getEsMainKeyword_10());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_16, grammarAccess.getContenedorAccess().getEqualsSignKeyword_11());
            		
            // InternalGuiaApe5.g:365:3: ( (lv_main_17_0= ruleEBoolean ) )
            // InternalGuiaApe5.g:366:4: (lv_main_17_0= ruleEBoolean )
            {
            // InternalGuiaApe5.g:366:4: (lv_main_17_0= ruleEBoolean )
            // InternalGuiaApe5.g:367:5: lv_main_17_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getContenedorAccess().getMainEBooleanParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_18);
            lv_main_17_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContenedorRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_17_0,
            						"guiaApe5.GuiaApe5.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_18, grammarAccess.getContenedorAccess().getSemicolonKeyword_13());
            		
            otherlv_19=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_19, grammarAccess.getContenedorAccess().getEsVisualKeyword_14());
            		
            otherlv_20=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_20, grammarAccess.getContenedorAccess().getEqualsSignKeyword_15());
            		
            // InternalGuiaApe5.g:396:3: ( (lv_esVisual_21_0= ruleEBoolean ) )
            // InternalGuiaApe5.g:397:4: (lv_esVisual_21_0= ruleEBoolean )
            {
            // InternalGuiaApe5.g:397:4: (lv_esVisual_21_0= ruleEBoolean )
            // InternalGuiaApe5.g:398:5: lv_esVisual_21_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getContenedorAccess().getEsVisualEBooleanParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_18);
            lv_esVisual_21_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContenedorRule());
            					}
            					set(
            						current,
            						"esVisual",
            						lv_esVisual_21_0,
            						"guiaApe5.GuiaApe5.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_22, grammarAccess.getContenedorAccess().getSemicolonKeyword_17());
            		
            otherlv_23=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getContenedorAccess().getRightCurlyBracketKeyword_18());
            		

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
    // $ANTLR end "ruleContenedor"


    // $ANTLR start "entryRuleElemento"
    // InternalGuiaApe5.g:427:1: entryRuleElemento returns [EObject current=null] : iv_ruleElemento= ruleElemento EOF ;
    public final EObject entryRuleElemento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElemento = null;


        try {
            // InternalGuiaApe5.g:427:49: (iv_ruleElemento= ruleElemento EOF )
            // InternalGuiaApe5.g:428:2: iv_ruleElemento= ruleElemento EOF
            {
             newCompositeNode(grammarAccess.getElementoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElemento=ruleElemento();

            state._fsp--;

             current =iv_ruleElemento; 
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
    // $ANTLR end "entryRuleElemento"


    // $ANTLR start "ruleElemento"
    // InternalGuiaApe5.g:434:1: ruleElemento returns [EObject current=null] : (otherlv_0= 'Elemento' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'longitud' otherlv_4= '=' ( (lv_longitud_5_0= ruleEInt ) ) otherlv_6= ';' (otherlv_7= 'tipoDato' otherlv_8= '=' ( (lv_tipoDato_9_0= ruleTipoDato ) ) otherlv_10= ';' )? otherlv_11= 'isPrimary' otherlv_12= '=' ( (lv_isPrimary_13_0= ruleEBoolean ) ) otherlv_14= ';' otherlv_15= 'esObligatorio' otherlv_16= '=' ( (lv_esObligatorio_17_0= ruleEBoolean ) ) otherlv_18= ';' otherlv_19= '}' ) ;
    public final EObject ruleElemento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_longitud_5_0 = null;

        Enumerator lv_tipoDato_9_0 = null;

        AntlrDatatypeRuleToken lv_isPrimary_13_0 = null;

        AntlrDatatypeRuleToken lv_esObligatorio_17_0 = null;



        	enterRule();

        try {
            // InternalGuiaApe5.g:440:2: ( (otherlv_0= 'Elemento' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'longitud' otherlv_4= '=' ( (lv_longitud_5_0= ruleEInt ) ) otherlv_6= ';' (otherlv_7= 'tipoDato' otherlv_8= '=' ( (lv_tipoDato_9_0= ruleTipoDato ) ) otherlv_10= ';' )? otherlv_11= 'isPrimary' otherlv_12= '=' ( (lv_isPrimary_13_0= ruleEBoolean ) ) otherlv_14= ';' otherlv_15= 'esObligatorio' otherlv_16= '=' ( (lv_esObligatorio_17_0= ruleEBoolean ) ) otherlv_18= ';' otherlv_19= '}' ) )
            // InternalGuiaApe5.g:441:2: (otherlv_0= 'Elemento' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'longitud' otherlv_4= '=' ( (lv_longitud_5_0= ruleEInt ) ) otherlv_6= ';' (otherlv_7= 'tipoDato' otherlv_8= '=' ( (lv_tipoDato_9_0= ruleTipoDato ) ) otherlv_10= ';' )? otherlv_11= 'isPrimary' otherlv_12= '=' ( (lv_isPrimary_13_0= ruleEBoolean ) ) otherlv_14= ';' otherlv_15= 'esObligatorio' otherlv_16= '=' ( (lv_esObligatorio_17_0= ruleEBoolean ) ) otherlv_18= ';' otherlv_19= '}' )
            {
            // InternalGuiaApe5.g:441:2: (otherlv_0= 'Elemento' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'longitud' otherlv_4= '=' ( (lv_longitud_5_0= ruleEInt ) ) otherlv_6= ';' (otherlv_7= 'tipoDato' otherlv_8= '=' ( (lv_tipoDato_9_0= ruleTipoDato ) ) otherlv_10= ';' )? otherlv_11= 'isPrimary' otherlv_12= '=' ( (lv_isPrimary_13_0= ruleEBoolean ) ) otherlv_14= ';' otherlv_15= 'esObligatorio' otherlv_16= '=' ( (lv_esObligatorio_17_0= ruleEBoolean ) ) otherlv_18= ';' otherlv_19= '}' )
            // InternalGuiaApe5.g:442:3: otherlv_0= 'Elemento' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'longitud' otherlv_4= '=' ( (lv_longitud_5_0= ruleEInt ) ) otherlv_6= ';' (otherlv_7= 'tipoDato' otherlv_8= '=' ( (lv_tipoDato_9_0= ruleTipoDato ) ) otherlv_10= ';' )? otherlv_11= 'isPrimary' otherlv_12= '=' ( (lv_isPrimary_13_0= ruleEBoolean ) ) otherlv_14= ';' otherlv_15= 'esObligatorio' otherlv_16= '=' ( (lv_esObligatorio_17_0= ruleEBoolean ) ) otherlv_18= ';' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getElementoAccess().getElementoKeyword_0());
            		
            // InternalGuiaApe5.g:446:3: ( (lv_name_1_0= ruleEString ) )
            // InternalGuiaApe5.g:447:4: (lv_name_1_0= ruleEString )
            {
            // InternalGuiaApe5.g:447:4: (lv_name_1_0= ruleEString )
            // InternalGuiaApe5.g:448:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getElementoAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"guiaApe5.GuiaApe5.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getElementoAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getElementoAccess().getLongitudKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_4, grammarAccess.getElementoAccess().getEqualsSignKeyword_4());
            		
            // InternalGuiaApe5.g:477:3: ( (lv_longitud_5_0= ruleEInt ) )
            // InternalGuiaApe5.g:478:4: (lv_longitud_5_0= ruleEInt )
            {
            // InternalGuiaApe5.g:478:4: (lv_longitud_5_0= ruleEInt )
            // InternalGuiaApe5.g:479:5: lv_longitud_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getElementoAccess().getLongitudEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_longitud_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementoRule());
            					}
            					set(
            						current,
            						"longitud",
            						lv_longitud_5_0,
            						"guiaApe5.GuiaApe5.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getElementoAccess().getSemicolonKeyword_6());
            		
            // InternalGuiaApe5.g:500:3: (otherlv_7= 'tipoDato' otherlv_8= '=' ( (lv_tipoDato_9_0= ruleTipoDato ) ) otherlv_10= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGuiaApe5.g:501:4: otherlv_7= 'tipoDato' otherlv_8= '=' ( (lv_tipoDato_9_0= ruleTipoDato ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getElementoAccess().getTipoDatoKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,14,FOLLOW_23); 

                    				newLeafNode(otherlv_8, grammarAccess.getElementoAccess().getEqualsSignKeyword_7_1());
                    			
                    // InternalGuiaApe5.g:509:4: ( (lv_tipoDato_9_0= ruleTipoDato ) )
                    // InternalGuiaApe5.g:510:5: (lv_tipoDato_9_0= ruleTipoDato )
                    {
                    // InternalGuiaApe5.g:510:5: (lv_tipoDato_9_0= ruleTipoDato )
                    // InternalGuiaApe5.g:511:6: lv_tipoDato_9_0= ruleTipoDato
                    {

                    						newCompositeNode(grammarAccess.getElementoAccess().getTipoDatoTipoDatoEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_tipoDato_9_0=ruleTipoDato();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementoRule());
                    						}
                    						set(
                    							current,
                    							"tipoDato",
                    							lv_tipoDato_9_0,
                    							"guiaApe5.GuiaApe5.TipoDato");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,22,FOLLOW_24); 

                    				newLeafNode(otherlv_10, grammarAccess.getElementoAccess().getSemicolonKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getElementoAccess().getIsPrimaryKeyword_8());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getElementoAccess().getEqualsSignKeyword_9());
            		
            // InternalGuiaApe5.g:541:3: ( (lv_isPrimary_13_0= ruleEBoolean ) )
            // InternalGuiaApe5.g:542:4: (lv_isPrimary_13_0= ruleEBoolean )
            {
            // InternalGuiaApe5.g:542:4: (lv_isPrimary_13_0= ruleEBoolean )
            // InternalGuiaApe5.g:543:5: lv_isPrimary_13_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getElementoAccess().getIsPrimaryEBooleanParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_18);
            lv_isPrimary_13_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementoRule());
            					}
            					set(
            						current,
            						"isPrimary",
            						lv_isPrimary_13_0,
            						"guiaApe5.GuiaApe5.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,22,FOLLOW_25); 

            			newLeafNode(otherlv_14, grammarAccess.getElementoAccess().getSemicolonKeyword_11());
            		
            otherlv_15=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getElementoAccess().getEsObligatorioKeyword_12());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_16, grammarAccess.getElementoAccess().getEqualsSignKeyword_13());
            		
            // InternalGuiaApe5.g:572:3: ( (lv_esObligatorio_17_0= ruleEBoolean ) )
            // InternalGuiaApe5.g:573:4: (lv_esObligatorio_17_0= ruleEBoolean )
            {
            // InternalGuiaApe5.g:573:4: (lv_esObligatorio_17_0= ruleEBoolean )
            // InternalGuiaApe5.g:574:5: lv_esObligatorio_17_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getElementoAccess().getEsObligatorioEBooleanParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_18);
            lv_esObligatorio_17_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementoRule());
            					}
            					set(
            						current,
            						"esObligatorio",
            						lv_esObligatorio_17_0,
            						"guiaApe5.GuiaApe5.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_18, grammarAccess.getElementoAccess().getSemicolonKeyword_15());
            		
            otherlv_19=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getElementoAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleElemento"


    // $ANTLR start "entryRuleEBoolean"
    // InternalGuiaApe5.g:603:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalGuiaApe5.g:603:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalGuiaApe5.g:604:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalGuiaApe5.g:610:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalGuiaApe5.g:616:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalGuiaApe5.g:617:2: (kw= 'true' | kw= 'false' )
            {
            // InternalGuiaApe5.g:617:2: (kw= 'true' | kw= 'false' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            else if ( (LA7_0==31) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalGuiaApe5.g:618:3: kw= 'true'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalGuiaApe5.g:624:3: kw= 'false'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalGuiaApe5.g:633:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalGuiaApe5.g:633:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalGuiaApe5.g:634:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalGuiaApe5.g:640:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalGuiaApe5.g:646:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalGuiaApe5.g:647:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalGuiaApe5.g:647:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalGuiaApe5.g:648:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalGuiaApe5.g:648:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==32) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalGuiaApe5.g:649:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_26); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleTipoDato"
    // InternalGuiaApe5.g:666:1: ruleTipoDato returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'double' ) ) ;
    public final Enumerator ruleTipoDato() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalGuiaApe5.g:672:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'double' ) ) )
            // InternalGuiaApe5.g:673:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'double' ) )
            {
            // InternalGuiaApe5.g:673:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'int' ) | (enumLiteral_2= 'boolean' ) | (enumLiteral_3= 'double' ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 35:
                {
                alt9=3;
                }
                break;
            case 36:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalGuiaApe5.g:674:3: (enumLiteral_0= 'String' )
                    {
                    // InternalGuiaApe5.g:674:3: (enumLiteral_0= 'String' )
                    // InternalGuiaApe5.g:675:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTipoDatoAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalGuiaApe5.g:682:3: (enumLiteral_1= 'int' )
                    {
                    // InternalGuiaApe5.g:682:3: (enumLiteral_1= 'int' )
                    // InternalGuiaApe5.g:683:4: enumLiteral_1= 'int'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTipoDatoAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalGuiaApe5.g:690:3: (enumLiteral_2= 'boolean' )
                    {
                    // InternalGuiaApe5.g:690:3: (enumLiteral_2= 'boolean' )
                    // InternalGuiaApe5.g:691:4: enumLiteral_2= 'boolean'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTipoDatoAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalGuiaApe5.g:698:3: (enumLiteral_3= 'double' )
                    {
                    // InternalGuiaApe5.g:698:3: (enumLiteral_3= 'double' )
                    // InternalGuiaApe5.g:699:4: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTipoDatoAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTipoDatoAccess().getDoubleEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTipoDato"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});

}