package uk.ac.kcl.inf.mde.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'board'", "'{'", "'}'", "'scene'", "':'", "';'", "'background:'", "'character'", "'name:'", "'object'", "'setting'", "'description:'", "'dialogue:'", "'action:'", "'position:'", "'camera:'", "'from'", "'lighting:'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalWeebADoodle.g:64:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalWeebADoodle.g:64:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalWeebADoodle.g:65:2: iv_ruleBoard= ruleBoard EOF
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
    // InternalWeebADoodle.g:71:1: ruleBoard returns [EObject current=null] : (otherlv_0= 'board' otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )+ otherlv_3= '}' ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_scenes_2_0 = null;



        	enterRule();

        try {
            // InternalWeebADoodle.g:77:2: ( (otherlv_0= 'board' otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )+ otherlv_3= '}' ) )
            // InternalWeebADoodle.g:78:2: (otherlv_0= 'board' otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )+ otherlv_3= '}' )
            {
            // InternalWeebADoodle.g:78:2: (otherlv_0= 'board' otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )+ otherlv_3= '}' )
            // InternalWeebADoodle.g:79:3: otherlv_0= 'board' otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWeebADoodle.g:87:3: ( (lv_scenes_2_0= ruleScene ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWeebADoodle.g:88:4: (lv_scenes_2_0= ruleScene )
            	    {
            	    // InternalWeebADoodle.g:88:4: (lv_scenes_2_0= ruleScene )
            	    // InternalWeebADoodle.g:89:5: lv_scenes_2_0= ruleScene
            	    {

            	    					newCompositeNode(grammarAccess.getBoardAccess().getScenesSceneParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_scenes_2_0=ruleScene();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"scenes",
            	    						lv_scenes_2_0,
            	    						"uk.ac.kcl.inf.mde.WeebADoodle.Scene");
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

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleScene"
    // InternalWeebADoodle.g:114:1: entryRuleScene returns [EObject current=null] : iv_ruleScene= ruleScene EOF ;
    public final EObject entryRuleScene() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScene = null;


        try {
            // InternalWeebADoodle.g:114:46: (iv_ruleScene= ruleScene EOF )
            // InternalWeebADoodle.g:115:2: iv_ruleScene= ruleScene EOF
            {
             newCompositeNode(grammarAccess.getSceneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScene=ruleScene();

            state._fsp--;

             current =iv_ruleScene; 
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
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalWeebADoodle.g:121:1: ruleScene returns [EObject current=null] : (otherlv_0= 'scene' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'background:' ( (lv_background_7_0= RULE_STRING ) ) otherlv_8= ';' ( (lv_settings_9_0= ruleSetting ) ) ( (lv_characters_10_0= ruleCharacter ) )* ( (lv_objects_11_0= ruleSceneObject ) )* otherlv_12= '}' ) ;
    public final EObject ruleScene() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_background_7_0=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        EObject lv_settings_9_0 = null;

        EObject lv_characters_10_0 = null;

        EObject lv_objects_11_0 = null;



        	enterRule();

        try {
            // InternalWeebADoodle.g:127:2: ( (otherlv_0= 'scene' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'background:' ( (lv_background_7_0= RULE_STRING ) ) otherlv_8= ';' ( (lv_settings_9_0= ruleSetting ) ) ( (lv_characters_10_0= ruleCharacter ) )* ( (lv_objects_11_0= ruleSceneObject ) )* otherlv_12= '}' ) )
            // InternalWeebADoodle.g:128:2: (otherlv_0= 'scene' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'background:' ( (lv_background_7_0= RULE_STRING ) ) otherlv_8= ';' ( (lv_settings_9_0= ruleSetting ) ) ( (lv_characters_10_0= ruleCharacter ) )* ( (lv_objects_11_0= ruleSceneObject ) )* otherlv_12= '}' )
            {
            // InternalWeebADoodle.g:128:2: (otherlv_0= 'scene' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'background:' ( (lv_background_7_0= RULE_STRING ) ) otherlv_8= ';' ( (lv_settings_9_0= ruleSetting ) ) ( (lv_characters_10_0= ruleCharacter ) )* ( (lv_objects_11_0= ruleSceneObject ) )* otherlv_12= '}' )
            // InternalWeebADoodle.g:129:3: otherlv_0= 'scene' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'background:' ( (lv_background_7_0= RULE_STRING ) ) otherlv_8= ';' ( (lv_settings_9_0= ruleSetting ) ) ( (lv_characters_10_0= ruleCharacter ) )* ( (lv_objects_11_0= ruleSceneObject ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSceneAccess().getSceneKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWeebADoodle.g:137:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalWeebADoodle.g:138:4: (lv_name_2_0= RULE_ID )
            {
            // InternalWeebADoodle.g:138:4: (lv_name_2_0= RULE_ID )
            // InternalWeebADoodle.g:139:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSceneAccess().getColonKeyword_3());
            		
            // InternalWeebADoodle.g:159:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalWeebADoodle.g:160:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:160:4: (lv_value_4_0= RULE_STRING )
            // InternalWeebADoodle.g:161:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_value_4_0, grammarAccess.getSceneAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getSceneAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getSceneAccess().getBackgroundKeyword_6());
            		
            // InternalWeebADoodle.g:185:3: ( (lv_background_7_0= RULE_STRING ) )
            // InternalWeebADoodle.g:186:4: (lv_background_7_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:186:4: (lv_background_7_0= RULE_STRING )
            // InternalWeebADoodle.g:187:5: lv_background_7_0= RULE_STRING
            {
            lv_background_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_background_7_0, grammarAccess.getSceneAccess().getBackgroundSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"background",
            						lv_background_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getSceneAccess().getSemicolonKeyword_8());
            		
            // InternalWeebADoodle.g:207:3: ( (lv_settings_9_0= ruleSetting ) )
            // InternalWeebADoodle.g:208:4: (lv_settings_9_0= ruleSetting )
            {
            // InternalWeebADoodle.g:208:4: (lv_settings_9_0= ruleSetting )
            // InternalWeebADoodle.g:209:5: lv_settings_9_0= ruleSetting
            {

            					newCompositeNode(grammarAccess.getSceneAccess().getSettingsSettingParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_settings_9_0=ruleSetting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSceneRule());
            					}
            					set(
            						current,
            						"settings",
            						lv_settings_9_0,
            						"uk.ac.kcl.inf.mde.WeebADoodle.Setting");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWeebADoodle.g:226:3: ( (lv_characters_10_0= ruleCharacter ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWeebADoodle.g:227:4: (lv_characters_10_0= ruleCharacter )
            	    {
            	    // InternalWeebADoodle.g:227:4: (lv_characters_10_0= ruleCharacter )
            	    // InternalWeebADoodle.g:228:5: lv_characters_10_0= ruleCharacter
            	    {

            	    					newCompositeNode(grammarAccess.getSceneAccess().getCharactersCharacterParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_characters_10_0=ruleCharacter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSceneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"characters",
            	    						lv_characters_10_0,
            	    						"uk.ac.kcl.inf.mde.WeebADoodle.Character");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalWeebADoodle.g:245:3: ( (lv_objects_11_0= ruleSceneObject ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==20) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWeebADoodle.g:246:4: (lv_objects_11_0= ruleSceneObject )
            	    {
            	    // InternalWeebADoodle.g:246:4: (lv_objects_11_0= ruleSceneObject )
            	    // InternalWeebADoodle.g:247:5: lv_objects_11_0= ruleSceneObject
            	    {

            	    					newCompositeNode(grammarAccess.getSceneAccess().getObjectsSceneObjectParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_objects_11_0=ruleSceneObject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSceneRule());
            	    					}
            	    					add(
            	    						current,
            	    						"objects",
            	    						lv_objects_11_0,
            	    						"uk.ac.kcl.inf.mde.WeebADoodle.SceneObject");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_12=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleCharacter"
    // InternalWeebADoodle.g:272:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // InternalWeebADoodle.g:272:50: (iv_ruleCharacter= ruleCharacter EOF )
            // InternalWeebADoodle.g:273:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
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
    // InternalWeebADoodle.g:279:1: ruleCharacter returns [EObject current=null] : (otherlv_0= 'character' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'name:' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_position_6_0= rulePositionStatement ) ) ( (lv_action_7_0= ruleActionStatement ) )? ( (lv_dialogue_8_0= ruleDialogueStatement ) )? ( (lv_description_9_0= ruleDescriptionStatement ) ) otherlv_10= '}' ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;
        Token otherlv_10=null;
        EObject lv_position_6_0 = null;

        EObject lv_action_7_0 = null;

        EObject lv_dialogue_8_0 = null;

        EObject lv_description_9_0 = null;



        	enterRule();

        try {
            // InternalWeebADoodle.g:285:2: ( (otherlv_0= 'character' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'name:' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_position_6_0= rulePositionStatement ) ) ( (lv_action_7_0= ruleActionStatement ) )? ( (lv_dialogue_8_0= ruleDialogueStatement ) )? ( (lv_description_9_0= ruleDescriptionStatement ) ) otherlv_10= '}' ) )
            // InternalWeebADoodle.g:286:2: (otherlv_0= 'character' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'name:' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_position_6_0= rulePositionStatement ) ) ( (lv_action_7_0= ruleActionStatement ) )? ( (lv_dialogue_8_0= ruleDialogueStatement ) )? ( (lv_description_9_0= ruleDescriptionStatement ) ) otherlv_10= '}' )
            {
            // InternalWeebADoodle.g:286:2: (otherlv_0= 'character' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'name:' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_position_6_0= rulePositionStatement ) ) ( (lv_action_7_0= ruleActionStatement ) )? ( (lv_dialogue_8_0= ruleDialogueStatement ) )? ( (lv_description_9_0= ruleDescriptionStatement ) ) otherlv_10= '}' )
            // InternalWeebADoodle.g:287:3: otherlv_0= 'character' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'name:' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_position_6_0= rulePositionStatement ) ) ( (lv_action_7_0= ruleActionStatement ) )? ( (lv_dialogue_8_0= ruleDialogueStatement ) )? ( (lv_description_9_0= ruleDescriptionStatement ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacterAccess().getCharacterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWeebADoodle.g:295:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalWeebADoodle.g:296:4: (lv_name_2_0= RULE_ID )
            {
            // InternalWeebADoodle.g:296:4: (lv_name_2_0= RULE_ID )
            // InternalWeebADoodle.g:297:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getCharacterAccess().getNameKeyword_3());
            		
            // InternalWeebADoodle.g:317:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalWeebADoodle.g:318:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:318:4: (lv_value_4_0= RULE_STRING )
            // InternalWeebADoodle.g:319:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_value_4_0, grammarAccess.getCharacterAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getCharacterAccess().getSemicolonKeyword_5());
            		
            // InternalWeebADoodle.g:339:3: ( (lv_position_6_0= rulePositionStatement ) )
            // InternalWeebADoodle.g:340:4: (lv_position_6_0= rulePositionStatement )
            {
            // InternalWeebADoodle.g:340:4: (lv_position_6_0= rulePositionStatement )
            // InternalWeebADoodle.g:341:5: lv_position_6_0= rulePositionStatement
            {

            					newCompositeNode(grammarAccess.getCharacterAccess().getPositionPositionStatementParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_position_6_0=rulePositionStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacterRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_6_0,
            						"uk.ac.kcl.inf.mde.WeebADoodle.PositionStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWeebADoodle.g:358:3: ( (lv_action_7_0= ruleActionStatement ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWeebADoodle.g:359:4: (lv_action_7_0= ruleActionStatement )
                    {
                    // InternalWeebADoodle.g:359:4: (lv_action_7_0= ruleActionStatement )
                    // InternalWeebADoodle.g:360:5: lv_action_7_0= ruleActionStatement
                    {

                    					newCompositeNode(grammarAccess.getCharacterAccess().getActionActionStatementParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_action_7_0=ruleActionStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCharacterRule());
                    					}
                    					set(
                    						current,
                    						"action",
                    						lv_action_7_0,
                    						"uk.ac.kcl.inf.mde.WeebADoodle.ActionStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWeebADoodle.g:377:3: ( (lv_dialogue_8_0= ruleDialogueStatement ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWeebADoodle.g:378:4: (lv_dialogue_8_0= ruleDialogueStatement )
                    {
                    // InternalWeebADoodle.g:378:4: (lv_dialogue_8_0= ruleDialogueStatement )
                    // InternalWeebADoodle.g:379:5: lv_dialogue_8_0= ruleDialogueStatement
                    {

                    					newCompositeNode(grammarAccess.getCharacterAccess().getDialogueDialogueStatementParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_dialogue_8_0=ruleDialogueStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCharacterRule());
                    					}
                    					set(
                    						current,
                    						"dialogue",
                    						lv_dialogue_8_0,
                    						"uk.ac.kcl.inf.mde.WeebADoodle.DialogueStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalWeebADoodle.g:396:3: ( (lv_description_9_0= ruleDescriptionStatement ) )
            // InternalWeebADoodle.g:397:4: (lv_description_9_0= ruleDescriptionStatement )
            {
            // InternalWeebADoodle.g:397:4: (lv_description_9_0= ruleDescriptionStatement )
            // InternalWeebADoodle.g:398:5: lv_description_9_0= ruleDescriptionStatement
            {

            					newCompositeNode(grammarAccess.getCharacterAccess().getDescriptionDescriptionStatementParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_17);
            lv_description_9_0=ruleDescriptionStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacterRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_9_0,
            						"uk.ac.kcl.inf.mde.WeebADoodle.DescriptionStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleSceneObject"
    // InternalWeebADoodle.g:423:1: entryRuleSceneObject returns [EObject current=null] : iv_ruleSceneObject= ruleSceneObject EOF ;
    public final EObject entryRuleSceneObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSceneObject = null;


        try {
            // InternalWeebADoodle.g:423:52: (iv_ruleSceneObject= ruleSceneObject EOF )
            // InternalWeebADoodle.g:424:2: iv_ruleSceneObject= ruleSceneObject EOF
            {
             newCompositeNode(grammarAccess.getSceneObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSceneObject=ruleSceneObject();

            state._fsp--;

             current =iv_ruleSceneObject; 
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
    // $ANTLR end "entryRuleSceneObject"


    // $ANTLR start "ruleSceneObject"
    // InternalWeebADoodle.g:430:1: ruleSceneObject returns [EObject current=null] : (otherlv_0= 'object' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'name:' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_position_6_0= rulePositionStatement ) ) ( (lv_description_7_0= ruleDescriptionStatement ) ) otherlv_8= '}' ) ;
    public final EObject ruleSceneObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_position_6_0 = null;

        EObject lv_description_7_0 = null;



        	enterRule();

        try {
            // InternalWeebADoodle.g:436:2: ( (otherlv_0= 'object' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'name:' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_position_6_0= rulePositionStatement ) ) ( (lv_description_7_0= ruleDescriptionStatement ) ) otherlv_8= '}' ) )
            // InternalWeebADoodle.g:437:2: (otherlv_0= 'object' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'name:' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_position_6_0= rulePositionStatement ) ) ( (lv_description_7_0= ruleDescriptionStatement ) ) otherlv_8= '}' )
            {
            // InternalWeebADoodle.g:437:2: (otherlv_0= 'object' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'name:' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_position_6_0= rulePositionStatement ) ) ( (lv_description_7_0= ruleDescriptionStatement ) ) otherlv_8= '}' )
            // InternalWeebADoodle.g:438:3: otherlv_0= 'object' otherlv_1= '{' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'name:' ( (lv_value_4_0= RULE_STRING ) ) otherlv_5= ';' ( (lv_position_6_0= rulePositionStatement ) ) ( (lv_description_7_0= ruleDescriptionStatement ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSceneObjectAccess().getObjectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSceneObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWeebADoodle.g:446:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalWeebADoodle.g:447:4: (lv_name_2_0= RULE_ID )
            {
            // InternalWeebADoodle.g:447:4: (lv_name_2_0= RULE_ID )
            // InternalWeebADoodle.g:448:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSceneObjectAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSceneObjectAccess().getNameKeyword_3());
            		
            // InternalWeebADoodle.g:468:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalWeebADoodle.g:469:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:469:4: (lv_value_4_0= RULE_STRING )
            // InternalWeebADoodle.g:470:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_value_4_0, grammarAccess.getSceneObjectAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getSceneObjectAccess().getSemicolonKeyword_5());
            		
            // InternalWeebADoodle.g:490:3: ( (lv_position_6_0= rulePositionStatement ) )
            // InternalWeebADoodle.g:491:4: (lv_position_6_0= rulePositionStatement )
            {
            // InternalWeebADoodle.g:491:4: (lv_position_6_0= rulePositionStatement )
            // InternalWeebADoodle.g:492:5: lv_position_6_0= rulePositionStatement
            {

            					newCompositeNode(grammarAccess.getSceneObjectAccess().getPositionPositionStatementParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_position_6_0=rulePositionStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSceneObjectRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_6_0,
            						"uk.ac.kcl.inf.mde.WeebADoodle.PositionStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWeebADoodle.g:509:3: ( (lv_description_7_0= ruleDescriptionStatement ) )
            // InternalWeebADoodle.g:510:4: (lv_description_7_0= ruleDescriptionStatement )
            {
            // InternalWeebADoodle.g:510:4: (lv_description_7_0= ruleDescriptionStatement )
            // InternalWeebADoodle.g:511:5: lv_description_7_0= ruleDescriptionStatement
            {

            					newCompositeNode(grammarAccess.getSceneObjectAccess().getDescriptionDescriptionStatementParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_17);
            lv_description_7_0=ruleDescriptionStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSceneObjectRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_7_0,
            						"uk.ac.kcl.inf.mde.WeebADoodle.DescriptionStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSceneObjectAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSceneObject"


    // $ANTLR start "entryRuleSetting"
    // InternalWeebADoodle.g:536:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalWeebADoodle.g:536:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalWeebADoodle.g:537:2: iv_ruleSetting= ruleSetting EOF
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
    // InternalWeebADoodle.g:543:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'setting' otherlv_1= '{' ( (lv_camera_2_0= ruleCameraShotStatement ) ) ( (lv_lighting_3_0= ruleLightingStatement ) ) ( (lv_description_4_0= ruleDescriptionStatement ) ) otherlv_5= '}' ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_camera_2_0 = null;

        EObject lv_lighting_3_0 = null;

        EObject lv_description_4_0 = null;



        	enterRule();

        try {
            // InternalWeebADoodle.g:549:2: ( (otherlv_0= 'setting' otherlv_1= '{' ( (lv_camera_2_0= ruleCameraShotStatement ) ) ( (lv_lighting_3_0= ruleLightingStatement ) ) ( (lv_description_4_0= ruleDescriptionStatement ) ) otherlv_5= '}' ) )
            // InternalWeebADoodle.g:550:2: (otherlv_0= 'setting' otherlv_1= '{' ( (lv_camera_2_0= ruleCameraShotStatement ) ) ( (lv_lighting_3_0= ruleLightingStatement ) ) ( (lv_description_4_0= ruleDescriptionStatement ) ) otherlv_5= '}' )
            {
            // InternalWeebADoodle.g:550:2: (otherlv_0= 'setting' otherlv_1= '{' ( (lv_camera_2_0= ruleCameraShotStatement ) ) ( (lv_lighting_3_0= ruleLightingStatement ) ) ( (lv_description_4_0= ruleDescriptionStatement ) ) otherlv_5= '}' )
            // InternalWeebADoodle.g:551:3: otherlv_0= 'setting' otherlv_1= '{' ( (lv_camera_2_0= ruleCameraShotStatement ) ) ( (lv_lighting_3_0= ruleLightingStatement ) ) ( (lv_description_4_0= ruleDescriptionStatement ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getSettingAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWeebADoodle.g:559:3: ( (lv_camera_2_0= ruleCameraShotStatement ) )
            // InternalWeebADoodle.g:560:4: (lv_camera_2_0= ruleCameraShotStatement )
            {
            // InternalWeebADoodle.g:560:4: (lv_camera_2_0= ruleCameraShotStatement )
            // InternalWeebADoodle.g:561:5: lv_camera_2_0= ruleCameraShotStatement
            {

            					newCompositeNode(grammarAccess.getSettingAccess().getCameraCameraShotStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_camera_2_0=ruleCameraShotStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingRule());
            					}
            					set(
            						current,
            						"camera",
            						lv_camera_2_0,
            						"uk.ac.kcl.inf.mde.WeebADoodle.CameraShotStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWeebADoodle.g:578:3: ( (lv_lighting_3_0= ruleLightingStatement ) )
            // InternalWeebADoodle.g:579:4: (lv_lighting_3_0= ruleLightingStatement )
            {
            // InternalWeebADoodle.g:579:4: (lv_lighting_3_0= ruleLightingStatement )
            // InternalWeebADoodle.g:580:5: lv_lighting_3_0= ruleLightingStatement
            {

            					newCompositeNode(grammarAccess.getSettingAccess().getLightingLightingStatementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_lighting_3_0=ruleLightingStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingRule());
            					}
            					set(
            						current,
            						"lighting",
            						lv_lighting_3_0,
            						"uk.ac.kcl.inf.mde.WeebADoodle.LightingStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWeebADoodle.g:597:3: ( (lv_description_4_0= ruleDescriptionStatement ) )
            // InternalWeebADoodle.g:598:4: (lv_description_4_0= ruleDescriptionStatement )
            {
            // InternalWeebADoodle.g:598:4: (lv_description_4_0= ruleDescriptionStatement )
            // InternalWeebADoodle.g:599:5: lv_description_4_0= ruleDescriptionStatement
            {

            					newCompositeNode(grammarAccess.getSettingAccess().getDescriptionDescriptionStatementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_description_4_0=ruleDescriptionStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSettingRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_4_0,
            						"uk.ac.kcl.inf.mde.WeebADoodle.DescriptionStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSettingAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleDescriptionStatement"
    // InternalWeebADoodle.g:624:1: entryRuleDescriptionStatement returns [EObject current=null] : iv_ruleDescriptionStatement= ruleDescriptionStatement EOF ;
    public final EObject entryRuleDescriptionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionStatement = null;


        try {
            // InternalWeebADoodle.g:624:61: (iv_ruleDescriptionStatement= ruleDescriptionStatement EOF )
            // InternalWeebADoodle.g:625:2: iv_ruleDescriptionStatement= ruleDescriptionStatement EOF
            {
             newCompositeNode(grammarAccess.getDescriptionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptionStatement=ruleDescriptionStatement();

            state._fsp--;

             current =iv_ruleDescriptionStatement; 
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
    // $ANTLR end "entryRuleDescriptionStatement"


    // $ANTLR start "ruleDescriptionStatement"
    // InternalWeebADoodle.g:631:1: ruleDescriptionStatement returns [EObject current=null] : (otherlv_0= 'description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleDescriptionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:637:2: ( (otherlv_0= 'description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalWeebADoodle.g:638:2: (otherlv_0= 'description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalWeebADoodle.g:638:2: (otherlv_0= 'description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalWeebADoodle.g:639:3: otherlv_0= 'description:' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptionStatementAccess().getDescriptionKeyword_0());
            		
            // InternalWeebADoodle.g:643:3: ( (lv_description_1_0= RULE_STRING ) )
            // InternalWeebADoodle.g:644:4: (lv_description_1_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:644:4: (lv_description_1_0= RULE_STRING )
            // InternalWeebADoodle.g:645:5: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_description_1_0, grammarAccess.getDescriptionStatementAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptionStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptionStatementAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleDescriptionStatement"


    // $ANTLR start "entryRuleDialogueStatement"
    // InternalWeebADoodle.g:669:1: entryRuleDialogueStatement returns [EObject current=null] : iv_ruleDialogueStatement= ruleDialogueStatement EOF ;
    public final EObject entryRuleDialogueStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialogueStatement = null;


        try {
            // InternalWeebADoodle.g:669:58: (iv_ruleDialogueStatement= ruleDialogueStatement EOF )
            // InternalWeebADoodle.g:670:2: iv_ruleDialogueStatement= ruleDialogueStatement EOF
            {
             newCompositeNode(grammarAccess.getDialogueStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDialogueStatement=ruleDialogueStatement();

            state._fsp--;

             current =iv_ruleDialogueStatement; 
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
    // $ANTLR end "entryRuleDialogueStatement"


    // $ANTLR start "ruleDialogueStatement"
    // InternalWeebADoodle.g:676:1: ruleDialogueStatement returns [EObject current=null] : (otherlv_0= 'dialogue:' ( (lv_dialogue_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleDialogueStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_dialogue_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:682:2: ( (otherlv_0= 'dialogue:' ( (lv_dialogue_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalWeebADoodle.g:683:2: (otherlv_0= 'dialogue:' ( (lv_dialogue_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalWeebADoodle.g:683:2: (otherlv_0= 'dialogue:' ( (lv_dialogue_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalWeebADoodle.g:684:3: otherlv_0= 'dialogue:' ( (lv_dialogue_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDialogueStatementAccess().getDialogueKeyword_0());
            		
            // InternalWeebADoodle.g:688:3: ( (lv_dialogue_1_0= RULE_STRING ) )
            // InternalWeebADoodle.g:689:4: (lv_dialogue_1_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:689:4: (lv_dialogue_1_0= RULE_STRING )
            // InternalWeebADoodle.g:690:5: lv_dialogue_1_0= RULE_STRING
            {
            lv_dialogue_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_dialogue_1_0, grammarAccess.getDialogueStatementAccess().getDialogueSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDialogueStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dialogue",
            						lv_dialogue_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getDialogueStatementAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleDialogueStatement"


    // $ANTLR start "entryRuleActionStatement"
    // InternalWeebADoodle.g:714:1: entryRuleActionStatement returns [EObject current=null] : iv_ruleActionStatement= ruleActionStatement EOF ;
    public final EObject entryRuleActionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionStatement = null;


        try {
            // InternalWeebADoodle.g:714:56: (iv_ruleActionStatement= ruleActionStatement EOF )
            // InternalWeebADoodle.g:715:2: iv_ruleActionStatement= ruleActionStatement EOF
            {
             newCompositeNode(grammarAccess.getActionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionStatement=ruleActionStatement();

            state._fsp--;

             current =iv_ruleActionStatement; 
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
    // $ANTLR end "entryRuleActionStatement"


    // $ANTLR start "ruleActionStatement"
    // InternalWeebADoodle.g:721:1: ruleActionStatement returns [EObject current=null] : (otherlv_0= 'action:' ( (lv_action_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleActionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_action_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:727:2: ( (otherlv_0= 'action:' ( (lv_action_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalWeebADoodle.g:728:2: (otherlv_0= 'action:' ( (lv_action_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalWeebADoodle.g:728:2: (otherlv_0= 'action:' ( (lv_action_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalWeebADoodle.g:729:3: otherlv_0= 'action:' ( (lv_action_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getActionStatementAccess().getActionKeyword_0());
            		
            // InternalWeebADoodle.g:733:3: ( (lv_action_1_0= RULE_STRING ) )
            // InternalWeebADoodle.g:734:4: (lv_action_1_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:734:4: (lv_action_1_0= RULE_STRING )
            // InternalWeebADoodle.g:735:5: lv_action_1_0= RULE_STRING
            {
            lv_action_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_action_1_0, grammarAccess.getActionStatementAccess().getActionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getActionStatementAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleActionStatement"


    // $ANTLR start "entryRulePositionStatement"
    // InternalWeebADoodle.g:759:1: entryRulePositionStatement returns [EObject current=null] : iv_rulePositionStatement= rulePositionStatement EOF ;
    public final EObject entryRulePositionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePositionStatement = null;


        try {
            // InternalWeebADoodle.g:759:58: (iv_rulePositionStatement= rulePositionStatement EOF )
            // InternalWeebADoodle.g:760:2: iv_rulePositionStatement= rulePositionStatement EOF
            {
             newCompositeNode(grammarAccess.getPositionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePositionStatement=rulePositionStatement();

            state._fsp--;

             current =iv_rulePositionStatement; 
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
    // $ANTLR end "entryRulePositionStatement"


    // $ANTLR start "rulePositionStatement"
    // InternalWeebADoodle.g:766:1: rulePositionStatement returns [EObject current=null] : (otherlv_0= 'position:' ( (lv_position_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject rulePositionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_position_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:772:2: ( (otherlv_0= 'position:' ( (lv_position_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // InternalWeebADoodle.g:773:2: (otherlv_0= 'position:' ( (lv_position_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // InternalWeebADoodle.g:773:2: (otherlv_0= 'position:' ( (lv_position_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // InternalWeebADoodle.g:774:3: otherlv_0= 'position:' ( (lv_position_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionStatementAccess().getPositionKeyword_0());
            		
            // InternalWeebADoodle.g:778:3: ( (lv_position_1_0= RULE_STRING ) )
            // InternalWeebADoodle.g:779:4: (lv_position_1_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:779:4: (lv_position_1_0= RULE_STRING )
            // InternalWeebADoodle.g:780:5: lv_position_1_0= RULE_STRING
            {
            lv_position_1_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_position_1_0, grammarAccess.getPositionStatementAccess().getPositionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPositionStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"position",
            						lv_position_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPositionStatementAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "rulePositionStatement"


    // $ANTLR start "entryRuleCameraShotStatement"
    // InternalWeebADoodle.g:804:1: entryRuleCameraShotStatement returns [EObject current=null] : iv_ruleCameraShotStatement= ruleCameraShotStatement EOF ;
    public final EObject entryRuleCameraShotStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCameraShotStatement = null;


        try {
            // InternalWeebADoodle.g:804:60: (iv_ruleCameraShotStatement= ruleCameraShotStatement EOF )
            // InternalWeebADoodle.g:805:2: iv_ruleCameraShotStatement= ruleCameraShotStatement EOF
            {
             newCompositeNode(grammarAccess.getCameraShotStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCameraShotStatement=ruleCameraShotStatement();

            state._fsp--;

             current =iv_ruleCameraShotStatement; 
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
    // $ANTLR end "entryRuleCameraShotStatement"


    // $ANTLR start "ruleCameraShotStatement"
    // InternalWeebADoodle.g:811:1: ruleCameraShotStatement returns [EObject current=null] : (otherlv_0= 'camera:' ( (lv_cameraShot_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_cameraAngle_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleCameraShotStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cameraShot_1_0=null;
        Token otherlv_2=null;
        Token lv_cameraAngle_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:817:2: ( (otherlv_0= 'camera:' ( (lv_cameraShot_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_cameraAngle_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // InternalWeebADoodle.g:818:2: (otherlv_0= 'camera:' ( (lv_cameraShot_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_cameraAngle_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // InternalWeebADoodle.g:818:2: (otherlv_0= 'camera:' ( (lv_cameraShot_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_cameraAngle_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // InternalWeebADoodle.g:819:3: otherlv_0= 'camera:' ( (lv_cameraShot_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_cameraAngle_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCameraShotStatementAccess().getCameraKeyword_0());
            		
            // InternalWeebADoodle.g:823:3: ( (lv_cameraShot_1_0= RULE_STRING ) )
            // InternalWeebADoodle.g:824:4: (lv_cameraShot_1_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:824:4: (lv_cameraShot_1_0= RULE_STRING )
            // InternalWeebADoodle.g:825:5: lv_cameraShot_1_0= RULE_STRING
            {
            lv_cameraShot_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_cameraShot_1_0, grammarAccess.getCameraShotStatementAccess().getCameraShotSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraShotStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cameraShot",
            						lv_cameraShot_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getCameraShotStatementAccess().getFromKeyword_2());
            		
            // InternalWeebADoodle.g:845:3: ( (lv_cameraAngle_3_0= RULE_STRING ) )
            // InternalWeebADoodle.g:846:4: (lv_cameraAngle_3_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:846:4: (lv_cameraAngle_3_0= RULE_STRING )
            // InternalWeebADoodle.g:847:5: lv_cameraAngle_3_0= RULE_STRING
            {
            lv_cameraAngle_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_cameraAngle_3_0, grammarAccess.getCameraShotStatementAccess().getCameraAngleSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCameraShotStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cameraAngle",
            						lv_cameraAngle_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCameraShotStatementAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleCameraShotStatement"


    // $ANTLR start "entryRuleLightingStatement"
    // InternalWeebADoodle.g:871:1: entryRuleLightingStatement returns [EObject current=null] : iv_ruleLightingStatement= ruleLightingStatement EOF ;
    public final EObject entryRuleLightingStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightingStatement = null;


        try {
            // InternalWeebADoodle.g:871:58: (iv_ruleLightingStatement= ruleLightingStatement EOF )
            // InternalWeebADoodle.g:872:2: iv_ruleLightingStatement= ruleLightingStatement EOF
            {
             newCompositeNode(grammarAccess.getLightingStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLightingStatement=ruleLightingStatement();

            state._fsp--;

             current =iv_ruleLightingStatement; 
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
    // $ANTLR end "entryRuleLightingStatement"


    // $ANTLR start "ruleLightingStatement"
    // InternalWeebADoodle.g:878:1: ruleLightingStatement returns [EObject current=null] : (otherlv_0= 'lighting:' ( (lv_source_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_direction_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleLightingStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_source_1_0=null;
        Token otherlv_2=null;
        Token lv_direction_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:884:2: ( (otherlv_0= 'lighting:' ( (lv_source_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_direction_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // InternalWeebADoodle.g:885:2: (otherlv_0= 'lighting:' ( (lv_source_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_direction_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // InternalWeebADoodle.g:885:2: (otherlv_0= 'lighting:' ( (lv_source_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_direction_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // InternalWeebADoodle.g:886:3: otherlv_0= 'lighting:' ( (lv_source_1_0= RULE_STRING ) ) otherlv_2= 'from' ( (lv_direction_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getLightingStatementAccess().getLightingKeyword_0());
            		
            // InternalWeebADoodle.g:890:3: ( (lv_source_1_0= RULE_STRING ) )
            // InternalWeebADoodle.g:891:4: (lv_source_1_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:891:4: (lv_source_1_0= RULE_STRING )
            // InternalWeebADoodle.g:892:5: lv_source_1_0= RULE_STRING
            {
            lv_source_1_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_source_1_0, grammarAccess.getLightingStatementAccess().getSourceSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLightingStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"source",
            						lv_source_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getLightingStatementAccess().getFromKeyword_2());
            		
            // InternalWeebADoodle.g:912:3: ( (lv_direction_3_0= RULE_STRING ) )
            // InternalWeebADoodle.g:913:4: (lv_direction_3_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:913:4: (lv_direction_3_0= RULE_STRING )
            // InternalWeebADoodle.g:914:5: lv_direction_3_0= RULE_STRING
            {
            lv_direction_3_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_direction_3_0, grammarAccess.getLightingStatementAccess().getDirectionSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLightingStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"direction",
            						lv_direction_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLightingStatementAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleLightingStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000142000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});

}