package uk.ac.kcl.inf.mde.parser.antlr.internal;

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
import uk.ac.kcl.inf.mde.services.WeebADoodleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWeebADoodleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "'character'", "'forward'", "'backward'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalWeebADoodleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalWeebADoodleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalWeebADoodleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalWeebADoodle.g"; }



     	private WeebADoodleGrammarAccess grammarAccess;

        public InternalWeebADoodleParser(TokenStream input, WeebADoodleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Board";
       	}

       	@Override
       	protected WeebADoodleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBoard"
    // InternalWeebADoodle.g:65:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalWeebADoodle.g:65:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalWeebADoodle.g:66:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalWeebADoodle.g:72:1: ruleBoard returns [EObject current=null] : ( (lv_settings_0_0= ruleSetting ) )* ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        EObject lv_settings_0_0 = null;



        	enterRule();

        try {
            // InternalWeebADoodle.g:78:2: ( ( (lv_settings_0_0= ruleSetting ) )* )
            // InternalWeebADoodle.g:79:2: ( (lv_settings_0_0= ruleSetting ) )*
            {
            // InternalWeebADoodle.g:79:2: ( (lv_settings_0_0= ruleSetting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWeebADoodle.g:80:3: (lv_settings_0_0= ruleSetting )
            	    {
            	    // InternalWeebADoodle.g:80:3: (lv_settings_0_0= ruleSetting )
            	    // InternalWeebADoodle.g:81:4: lv_settings_0_0= ruleSetting
            	    {

            	    				newCompositeNode(grammarAccess.getBoardAccess().getSettingsSettingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_settings_0_0=ruleSetting();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getBoardRule());
            	    				}
            	    				add(
            	    					current,
            	    					"settings",
            	    					lv_settings_0_0,
            	    					"uk.ac.kcl.inf.mde.WeebADoodle.Setting");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleSetting"
    // InternalWeebADoodle.g:101:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalWeebADoodle.g:101:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalWeebADoodle.g:102:2: iv_ruleSetting= ruleSetting EOF
            {
             newCompositeNode(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetting=ruleSetting();

            state._fsp--;

             current =iv_ruleSetting; 
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
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // InternalWeebADoodle.g:108:1: ruleSetting returns [EObject current=null] : (this_Action_0= ruleAction | ruleCharacter ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        EObject this_Action_0 = null;



        	enterRule();

        try {
            // InternalWeebADoodle.g:114:2: ( (this_Action_0= ruleAction | ruleCharacter ) )
            // InternalWeebADoodle.g:115:2: (this_Action_0= ruleAction | ruleCharacter )
            {
            // InternalWeebADoodle.g:115:2: (this_Action_0= ruleAction | ruleCharacter )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=14 && LA2_0<=15)) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalWeebADoodle.g:116:3: this_Action_0= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getSettingAccess().getActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_0=ruleAction();

                    state._fsp--;


                    			current = this_Action_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalWeebADoodle.g:125:3: ruleCharacter
                    {

                    			newCompositeNode(grammarAccess.getSettingAccess().getCharacterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    ruleCharacter();

                    state._fsp--;


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
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRuleAction"
    // InternalWeebADoodle.g:136:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalWeebADoodle.g:136:47: (iv_ruleAction= ruleAction EOF )
            // InternalWeebADoodle.g:137:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalWeebADoodle.g:143:1: ruleAction returns [EObject current=null] : ( ( (lv_command_0_0= ruleActionCommand ) ) otherlv_1= '(' otherlv_2= ')' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Enumerator lv_command_0_0 = null;



        	enterRule();

        try {
            // InternalWeebADoodle.g:149:2: ( ( ( (lv_command_0_0= ruleActionCommand ) ) otherlv_1= '(' otherlv_2= ')' ) )
            // InternalWeebADoodle.g:150:2: ( ( (lv_command_0_0= ruleActionCommand ) ) otherlv_1= '(' otherlv_2= ')' )
            {
            // InternalWeebADoodle.g:150:2: ( ( (lv_command_0_0= ruleActionCommand ) ) otherlv_1= '(' otherlv_2= ')' )
            // InternalWeebADoodle.g:151:3: ( (lv_command_0_0= ruleActionCommand ) ) otherlv_1= '(' otherlv_2= ')'
            {
            // InternalWeebADoodle.g:151:3: ( (lv_command_0_0= ruleActionCommand ) )
            // InternalWeebADoodle.g:152:4: (lv_command_0_0= ruleActionCommand )
            {
            // InternalWeebADoodle.g:152:4: (lv_command_0_0= ruleActionCommand )
            // InternalWeebADoodle.g:153:5: lv_command_0_0= ruleActionCommand
            {

            					newCompositeNode(grammarAccess.getActionAccess().getCommandActionCommandEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_command_0_0=ruleActionCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_0_0,
            						"uk.ac.kcl.inf.mde.WeebADoodle.ActionCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCharacter"
    // InternalWeebADoodle.g:182:1: entryRuleCharacter returns [String current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final String entryRuleCharacter() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCharacter = null;


        try {
            // InternalWeebADoodle.g:182:49: (iv_ruleCharacter= ruleCharacter EOF )
            // InternalWeebADoodle.g:183:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter.getText(); 
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
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // InternalWeebADoodle.g:189:1: ruleCharacter returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'character' ;
    public final AntlrDatatypeRuleToken ruleCharacter() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:195:2: (kw= 'character' )
            // InternalWeebADoodle.g:196:2: kw= 'character'
            {
            kw=(Token)match(input,13,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCharacterAccess().getCharacterKeyword());
            	

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
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "ruleActionCommand"
    // InternalWeebADoodle.g:204:1: ruleActionCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) ;
    public final Enumerator ruleActionCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:210:2: ( ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) ) )
            // InternalWeebADoodle.g:211:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            {
            // InternalWeebADoodle.g:211:2: ( (enumLiteral_0= 'forward' ) | (enumLiteral_1= 'backward' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalWeebADoodle.g:212:3: (enumLiteral_0= 'forward' )
                    {
                    // InternalWeebADoodle.g:212:3: (enumLiteral_0= 'forward' )
                    // InternalWeebADoodle.g:213:4: enumLiteral_0= 'forward'
                    {
                    enumLiteral_0=(Token)match(input,14,FOLLOW_2); 

                    				current = grammarAccess.getActionCommandAccess().getForwardEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionCommandAccess().getForwardEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalWeebADoodle.g:220:3: (enumLiteral_1= 'backward' )
                    {
                    // InternalWeebADoodle.g:220:3: (enumLiteral_1= 'backward' )
                    // InternalWeebADoodle.g:221:4: enumLiteral_1= 'backward'
                    {
                    enumLiteral_1=(Token)match(input,15,FOLLOW_2); 

                    				current = grammarAccess.getActionCommandAccess().getBackwardEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionCommandAccess().getBackwardEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleActionCommand"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000E002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});

}