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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'board'", "'{'", "'}'", "'scene'", "'name'", "':'", "';'", "'background:'", "'character'", "'action:'", "'dialogue:'", "'description:'", "'object'", "'position:'", "'setting'", "'camera_shot:'", "'camera_angle:'", "'lighting:'", "'direction'", "'movement:'"
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
    public static final int T__30=30;
    public static final int RULE_ID=4;
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
        	return "Storyboard";
       	}

       	@Override
       	protected WeebADoodleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStoryboard"
    // InternalWeebADoodle.g:64:1: entryRuleStoryboard returns [EObject current=null] : iv_ruleStoryboard= ruleStoryboard EOF ;
    public final EObject entryRuleStoryboard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStoryboard = null;


        try {
            // InternalWeebADoodle.g:64:51: (iv_ruleStoryboard= ruleStoryboard EOF )
            // InternalWeebADoodle.g:65:2: iv_ruleStoryboard= ruleStoryboard EOF
            {
             newCompositeNode(grammarAccess.getStoryboardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStoryboard=ruleStoryboard();

            state._fsp--;

             current =iv_ruleStoryboard; 
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
    // $ANTLR end "entryRuleStoryboard"


    // $ANTLR start "ruleStoryboard"
    // InternalWeebADoodle.g:71:1: ruleStoryboard returns [EObject current=null] : (otherlv_0= 'board' otherlv_1= '{' ( (lv_scenes_2_0= ruleScene ) )+ otherlv_3= '}' ) ;
    public final EObject ruleStoryboard() throws RecognitionException {
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

            			newLeafNode(otherlv_0, grammarAccess.getStoryboardAccess().getBoardKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStoryboardAccess().getLeftCurlyBracketKeyword_1());
            		
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

            	    					newCompositeNode(grammarAccess.getStoryboardAccess().getScenesSceneParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_scenes_2_0=ruleScene();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStoryboardRule());
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

            			newLeafNode(otherlv_3, grammarAccess.getStoryboardAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleStoryboard"


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
    // InternalWeebADoodle.g:121:1: ruleScene returns [EObject current=null] : (otherlv_0= 'scene' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'background:' ( (lv_background_8_0= RULE_STRING ) ) otherlv_9= ';' ( (lv_characters_10_0= ruleCharacter ) )* ( (lv_objects_11_0= ruleSceneObject ) )* ( (lv_settings_12_0= ruleSetting ) ) ( (lv_directions_13_0= ruleDirection ) )? otherlv_14= '}' ) ;
    public final EObject ruleScene() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_background_8_0=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        EObject lv_characters_10_0 = null;

        EObject lv_objects_11_0 = null;

        EObject lv_settings_12_0 = null;

        EObject lv_directions_13_0 = null;



        	enterRule();

        try {
            // InternalWeebADoodle.g:127:2: ( (otherlv_0= 'scene' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'background:' ( (lv_background_8_0= RULE_STRING ) ) otherlv_9= ';' ( (lv_characters_10_0= ruleCharacter ) )* ( (lv_objects_11_0= ruleSceneObject ) )* ( (lv_settings_12_0= ruleSetting ) ) ( (lv_directions_13_0= ruleDirection ) )? otherlv_14= '}' ) )
            // InternalWeebADoodle.g:128:2: (otherlv_0= 'scene' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'background:' ( (lv_background_8_0= RULE_STRING ) ) otherlv_9= ';' ( (lv_characters_10_0= ruleCharacter ) )* ( (lv_objects_11_0= ruleSceneObject ) )* ( (lv_settings_12_0= ruleSetting ) ) ( (lv_directions_13_0= ruleDirection ) )? otherlv_14= '}' )
            {
            // InternalWeebADoodle.g:128:2: (otherlv_0= 'scene' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'background:' ( (lv_background_8_0= RULE_STRING ) ) otherlv_9= ';' ( (lv_characters_10_0= ruleCharacter ) )* ( (lv_objects_11_0= ruleSceneObject ) )* ( (lv_settings_12_0= ruleSetting ) ) ( (lv_directions_13_0= ruleDirection ) )? otherlv_14= '}' )
            // InternalWeebADoodle.g:129:3: otherlv_0= 'scene' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'background:' ( (lv_background_8_0= RULE_STRING ) ) otherlv_9= ';' ( (lv_characters_10_0= ruleCharacter ) )* ( (lv_objects_11_0= ruleSceneObject ) )* ( (lv_settings_12_0= ruleSetting ) ) ( (lv_directions_13_0= ruleDirection ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSceneAccess().getSceneKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSceneAccess().getNameKeyword_2());
            		
            // InternalWeebADoodle.g:141:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalWeebADoodle.g:142:4: (lv_name_3_0= RULE_ID )
            {
            // InternalWeebADoodle.g:142:4: (lv_name_3_0= RULE_ID )
            // InternalWeebADoodle.g:143:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSceneAccess().getColonKeyword_4());
            		
            // InternalWeebADoodle.g:163:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalWeebADoodle.g:164:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:164:4: (lv_value_5_0= RULE_STRING )
            // InternalWeebADoodle.g:165:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_value_5_0, grammarAccess.getSceneAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getSceneAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getSceneAccess().getBackgroundKeyword_7());
            		
            // InternalWeebADoodle.g:189:3: ( (lv_background_8_0= RULE_STRING ) )
            // InternalWeebADoodle.g:190:4: (lv_background_8_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:190:4: (lv_background_8_0= RULE_STRING )
            // InternalWeebADoodle.g:191:5: lv_background_8_0= RULE_STRING
            {
            lv_background_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_background_8_0, grammarAccess.getSceneAccess().getBackgroundSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneRule());
            					}
            					setWithLastConsumed(
            						current,
            						"background",
            						lv_background_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_9, grammarAccess.getSceneAccess().getSemicolonKeyword_9());
            		
            // InternalWeebADoodle.g:211:3: ( (lv_characters_10_0= ruleCharacter ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWeebADoodle.g:212:4: (lv_characters_10_0= ruleCharacter )
            	    {
            	    // InternalWeebADoodle.g:212:4: (lv_characters_10_0= ruleCharacter )
            	    // InternalWeebADoodle.g:213:5: lv_characters_10_0= ruleCharacter
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

            // InternalWeebADoodle.g:230:3: ( (lv_objects_11_0= ruleSceneObject ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWeebADoodle.g:231:4: (lv_objects_11_0= ruleSceneObject )
            	    {
            	    // InternalWeebADoodle.g:231:4: (lv_objects_11_0= ruleSceneObject )
            	    // InternalWeebADoodle.g:232:5: lv_objects_11_0= ruleSceneObject
            	    {

            	    					newCompositeNode(grammarAccess.getSceneAccess().getObjectsSceneObjectParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_12);
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

            // InternalWeebADoodle.g:249:3: ( (lv_settings_12_0= ruleSetting ) )
            // InternalWeebADoodle.g:250:4: (lv_settings_12_0= ruleSetting )
            {
            // InternalWeebADoodle.g:250:4: (lv_settings_12_0= ruleSetting )
            // InternalWeebADoodle.g:251:5: lv_settings_12_0= ruleSetting
            {

            					newCompositeNode(grammarAccess.getSceneAccess().getSettingsSettingParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_13);
            lv_settings_12_0=ruleSetting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSceneRule());
            					}
            					set(
            						current,
            						"settings",
            						lv_settings_12_0,
            						"uk.ac.kcl.inf.mde.WeebADoodle.Setting");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalWeebADoodle.g:268:3: ( (lv_directions_13_0= ruleDirection ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWeebADoodle.g:269:4: (lv_directions_13_0= ruleDirection )
                    {
                    // InternalWeebADoodle.g:269:4: (lv_directions_13_0= ruleDirection )
                    // InternalWeebADoodle.g:270:5: lv_directions_13_0= ruleDirection
                    {

                    					newCompositeNode(grammarAccess.getSceneAccess().getDirectionsDirectionParserRuleCall_13_0());
                    				
                    pushFollow(FOLLOW_14);
                    lv_directions_13_0=ruleDirection();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSceneRule());
                    					}
                    					set(
                    						current,
                    						"directions",
                    						lv_directions_13_0,
                    						"uk.ac.kcl.inf.mde.WeebADoodle.Direction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalWeebADoodle.g:295:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // InternalWeebADoodle.g:295:50: (iv_ruleCharacter= ruleCharacter EOF )
            // InternalWeebADoodle.g:296:2: iv_ruleCharacter= ruleCharacter EOF
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
    // InternalWeebADoodle.g:302:1: ruleCharacter returns [EObject current=null] : (otherlv_0= 'character' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'action:' ( (lv_action_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'dialogue:' ( (lv_dialogue_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= 'description:' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= '}' ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_action_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_dialogue_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_description_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:308:2: ( (otherlv_0= 'character' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'action:' ( (lv_action_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'dialogue:' ( (lv_dialogue_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= 'description:' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= '}' ) )
            // InternalWeebADoodle.g:309:2: (otherlv_0= 'character' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'action:' ( (lv_action_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'dialogue:' ( (lv_dialogue_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= 'description:' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= '}' )
            {
            // InternalWeebADoodle.g:309:2: (otherlv_0= 'character' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'action:' ( (lv_action_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'dialogue:' ( (lv_dialogue_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= 'description:' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= '}' )
            // InternalWeebADoodle.g:310:3: otherlv_0= 'character' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'action:' ( (lv_action_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'dialogue:' ( (lv_dialogue_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= 'description:' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCharacterAccess().getCharacterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCharacterAccess().getNameKeyword_2());
            		
            // InternalWeebADoodle.g:322:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalWeebADoodle.g:323:4: (lv_name_3_0= RULE_ID )
            {
            // InternalWeebADoodle.g:323:4: (lv_name_3_0= RULE_ID )
            // InternalWeebADoodle.g:324:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getCharacterAccess().getColonKeyword_4());
            		
            // InternalWeebADoodle.g:344:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalWeebADoodle.g:345:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:345:4: (lv_value_5_0= RULE_STRING )
            // InternalWeebADoodle.g:346:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_value_5_0, grammarAccess.getCharacterAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getCharacterAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getCharacterAccess().getActionKeyword_7());
            		
            // InternalWeebADoodle.g:370:3: ( (lv_action_8_0= RULE_STRING ) )
            // InternalWeebADoodle.g:371:4: (lv_action_8_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:371:4: (lv_action_8_0= RULE_STRING )
            // InternalWeebADoodle.g:372:5: lv_action_8_0= RULE_STRING
            {
            lv_action_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_action_8_0, grammarAccess.getCharacterAccess().getActionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"action",
            						lv_action_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getCharacterAccess().getSemicolonKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getCharacterAccess().getDialogueKeyword_10());
            		
            // InternalWeebADoodle.g:396:3: ( (lv_dialogue_11_0= RULE_STRING ) )
            // InternalWeebADoodle.g:397:4: (lv_dialogue_11_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:397:4: (lv_dialogue_11_0= RULE_STRING )
            // InternalWeebADoodle.g:398:5: lv_dialogue_11_0= RULE_STRING
            {
            lv_dialogue_11_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_dialogue_11_0, grammarAccess.getCharacterAccess().getDialogueSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"dialogue",
            						lv_dialogue_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getCharacterAccess().getSemicolonKeyword_12());
            		
            otherlv_13=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getCharacterAccess().getDescriptionKeyword_13());
            		
            // InternalWeebADoodle.g:422:3: ( (lv_description_14_0= RULE_STRING ) )
            // InternalWeebADoodle.g:423:4: (lv_description_14_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:423:4: (lv_description_14_0= RULE_STRING )
            // InternalWeebADoodle.g:424:5: lv_description_14_0= RULE_STRING
            {
            lv_description_14_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_14_0, grammarAccess.getCharacterAccess().getDescriptionSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_15, grammarAccess.getCharacterAccess().getSemicolonKeyword_15());
            		
            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalWeebADoodle.g:452:1: entryRuleSceneObject returns [EObject current=null] : iv_ruleSceneObject= ruleSceneObject EOF ;
    public final EObject entryRuleSceneObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSceneObject = null;


        try {
            // InternalWeebADoodle.g:452:52: (iv_ruleSceneObject= ruleSceneObject EOF )
            // InternalWeebADoodle.g:453:2: iv_ruleSceneObject= ruleSceneObject EOF
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
    // InternalWeebADoodle.g:459:1: ruleSceneObject returns [EObject current=null] : (otherlv_0= 'object' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'position:' ( (lv_position_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'description:' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) ;
    public final EObject ruleSceneObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_position_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:465:2: ( (otherlv_0= 'object' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'position:' ( (lv_position_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'description:' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' ) )
            // InternalWeebADoodle.g:466:2: (otherlv_0= 'object' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'position:' ( (lv_position_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'description:' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' )
            {
            // InternalWeebADoodle.g:466:2: (otherlv_0= 'object' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'position:' ( (lv_position_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'description:' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}' )
            // InternalWeebADoodle.g:467:3: otherlv_0= 'object' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ':' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= 'position:' ( (lv_position_8_0= RULE_STRING ) ) otherlv_9= ';' otherlv_10= 'description:' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSceneObjectAccess().getObjectKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSceneObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSceneObjectAccess().getNameKeyword_2());
            		
            // InternalWeebADoodle.g:479:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalWeebADoodle.g:480:4: (lv_name_3_0= RULE_ID )
            {
            // InternalWeebADoodle.g:480:4: (lv_name_3_0= RULE_ID )
            // InternalWeebADoodle.g:481:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_3_0, grammarAccess.getSceneObjectAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSceneObjectAccess().getColonKeyword_4());
            		
            // InternalWeebADoodle.g:501:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalWeebADoodle.g:502:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:502:4: (lv_value_5_0= RULE_STRING )
            // InternalWeebADoodle.g:503:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_value_5_0, grammarAccess.getSceneObjectAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getSceneObjectAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,24,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getSceneObjectAccess().getPositionKeyword_7());
            		
            // InternalWeebADoodle.g:527:3: ( (lv_position_8_0= RULE_STRING ) )
            // InternalWeebADoodle.g:528:4: (lv_position_8_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:528:4: (lv_position_8_0= RULE_STRING )
            // InternalWeebADoodle.g:529:5: lv_position_8_0= RULE_STRING
            {
            lv_position_8_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_position_8_0, grammarAccess.getSceneObjectAccess().getPositionSTRINGTerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"position",
            						lv_position_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_9=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getSceneObjectAccess().getSemicolonKeyword_9());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getSceneObjectAccess().getDescriptionKeyword_10());
            		
            // InternalWeebADoodle.g:553:3: ( (lv_description_11_0= RULE_STRING ) )
            // InternalWeebADoodle.g:554:4: (lv_description_11_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:554:4: (lv_description_11_0= RULE_STRING )
            // InternalWeebADoodle.g:555:5: lv_description_11_0= RULE_STRING
            {
            lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_11_0, grammarAccess.getSceneObjectAccess().getDescriptionSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSceneObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_11_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_12=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getSceneObjectAccess().getSemicolonKeyword_12());
            		
            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getSceneObjectAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalWeebADoodle.g:583:1: entryRuleSetting returns [EObject current=null] : iv_ruleSetting= ruleSetting EOF ;
    public final EObject entryRuleSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetting = null;


        try {
            // InternalWeebADoodle.g:583:48: (iv_ruleSetting= ruleSetting EOF )
            // InternalWeebADoodle.g:584:2: iv_ruleSetting= ruleSetting EOF
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
    // InternalWeebADoodle.g:590:1: ruleSetting returns [EObject current=null] : (otherlv_0= 'setting' otherlv_1= '{' otherlv_2= 'camera_shot:' ( (lv_cameraShot_3_0= RULE_STRING ) ) otherlv_4= ';' otherlv_5= 'camera_angle:' ( (lv_cameraAngle_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'lighting:' ( (lv_lighting_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'description:' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' ) ;
    public final EObject ruleSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_cameraShot_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_cameraAngle_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_lighting_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_description_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:596:2: ( (otherlv_0= 'setting' otherlv_1= '{' otherlv_2= 'camera_shot:' ( (lv_cameraShot_3_0= RULE_STRING ) ) otherlv_4= ';' otherlv_5= 'camera_angle:' ( (lv_cameraAngle_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'lighting:' ( (lv_lighting_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'description:' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' ) )
            // InternalWeebADoodle.g:597:2: (otherlv_0= 'setting' otherlv_1= '{' otherlv_2= 'camera_shot:' ( (lv_cameraShot_3_0= RULE_STRING ) ) otherlv_4= ';' otherlv_5= 'camera_angle:' ( (lv_cameraAngle_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'lighting:' ( (lv_lighting_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'description:' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' )
            {
            // InternalWeebADoodle.g:597:2: (otherlv_0= 'setting' otherlv_1= '{' otherlv_2= 'camera_shot:' ( (lv_cameraShot_3_0= RULE_STRING ) ) otherlv_4= ';' otherlv_5= 'camera_angle:' ( (lv_cameraAngle_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'lighting:' ( (lv_lighting_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'description:' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}' )
            // InternalWeebADoodle.g:598:3: otherlv_0= 'setting' otherlv_1= '{' otherlv_2= 'camera_shot:' ( (lv_cameraShot_3_0= RULE_STRING ) ) otherlv_4= ';' otherlv_5= 'camera_angle:' ( (lv_cameraAngle_6_0= RULE_STRING ) ) otherlv_7= ';' otherlv_8= 'lighting:' ( (lv_lighting_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= 'description:' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSettingAccess().getSettingKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSettingAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getSettingAccess().getCamera_shotKeyword_2());
            		
            // InternalWeebADoodle.g:610:3: ( (lv_cameraShot_3_0= RULE_STRING ) )
            // InternalWeebADoodle.g:611:4: (lv_cameraShot_3_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:611:4: (lv_cameraShot_3_0= RULE_STRING )
            // InternalWeebADoodle.g:612:5: lv_cameraShot_3_0= RULE_STRING
            {
            lv_cameraShot_3_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_cameraShot_3_0, grammarAccess.getSettingAccess().getCameraShotSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cameraShot",
            						lv_cameraShot_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getSettingAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getSettingAccess().getCamera_angleKeyword_5());
            		
            // InternalWeebADoodle.g:636:3: ( (lv_cameraAngle_6_0= RULE_STRING ) )
            // InternalWeebADoodle.g:637:4: (lv_cameraAngle_6_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:637:4: (lv_cameraAngle_6_0= RULE_STRING )
            // InternalWeebADoodle.g:638:5: lv_cameraAngle_6_0= RULE_STRING
            {
            lv_cameraAngle_6_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_cameraAngle_6_0, grammarAccess.getSettingAccess().getCameraAngleSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cameraAngle",
            						lv_cameraAngle_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getSettingAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getSettingAccess().getLightingKeyword_8());
            		
            // InternalWeebADoodle.g:662:3: ( (lv_lighting_9_0= RULE_STRING ) )
            // InternalWeebADoodle.g:663:4: (lv_lighting_9_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:663:4: (lv_lighting_9_0= RULE_STRING )
            // InternalWeebADoodle.g:664:5: lv_lighting_9_0= RULE_STRING
            {
            lv_lighting_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_lighting_9_0, grammarAccess.getSettingAccess().getLightingSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lighting",
            						lv_lighting_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getSettingAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_11, grammarAccess.getSettingAccess().getDescriptionKeyword_11());
            		
            // InternalWeebADoodle.g:688:3: ( (lv_description_12_0= RULE_STRING ) )
            // InternalWeebADoodle.g:689:4: (lv_description_12_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:689:4: (lv_description_12_0= RULE_STRING )
            // InternalWeebADoodle.g:690:5: lv_description_12_0= RULE_STRING
            {
            lv_description_12_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_12_0, grammarAccess.getSettingAccess().getDescriptionSTRINGTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSettingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_12_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_13=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getSettingAccess().getSemicolonKeyword_13());
            		
            otherlv_14=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSettingAccess().getRightCurlyBracketKeyword_14());
            		

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


    // $ANTLR start "entryRuleDirection"
    // InternalWeebADoodle.g:718:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // InternalWeebADoodle.g:718:50: (iv_ruleDirection= ruleDirection EOF )
            // InternalWeebADoodle.g:719:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalWeebADoodle.g:725:1: ruleDirection returns [EObject current=null] : (otherlv_0= 'direction' otherlv_1= '{' ( (otherlv_2= 'character' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'object' ( (otherlv_5= RULE_ID ) ) ) ) otherlv_6= 'movement:' ( (lv_movement_7_0= RULE_STRING ) ) otherlv_8= 'description:' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= '}' ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_movement_7_0=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalWeebADoodle.g:731:2: ( (otherlv_0= 'direction' otherlv_1= '{' ( (otherlv_2= 'character' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'object' ( (otherlv_5= RULE_ID ) ) ) ) otherlv_6= 'movement:' ( (lv_movement_7_0= RULE_STRING ) ) otherlv_8= 'description:' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= '}' ) )
            // InternalWeebADoodle.g:732:2: (otherlv_0= 'direction' otherlv_1= '{' ( (otherlv_2= 'character' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'object' ( (otherlv_5= RULE_ID ) ) ) ) otherlv_6= 'movement:' ( (lv_movement_7_0= RULE_STRING ) ) otherlv_8= 'description:' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= '}' )
            {
            // InternalWeebADoodle.g:732:2: (otherlv_0= 'direction' otherlv_1= '{' ( (otherlv_2= 'character' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'object' ( (otherlv_5= RULE_ID ) ) ) ) otherlv_6= 'movement:' ( (lv_movement_7_0= RULE_STRING ) ) otherlv_8= 'description:' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= '}' )
            // InternalWeebADoodle.g:733:3: otherlv_0= 'direction' otherlv_1= '{' ( (otherlv_2= 'character' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'object' ( (otherlv_5= RULE_ID ) ) ) ) otherlv_6= 'movement:' ( (lv_movement_7_0= RULE_STRING ) ) otherlv_8= 'description:' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDirectionAccess().getDirectionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getDirectionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalWeebADoodle.g:741:3: ( (otherlv_2= 'character' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= 'object' ( (otherlv_5= RULE_ID ) ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==23) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalWeebADoodle.g:742:4: (otherlv_2= 'character' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalWeebADoodle.g:742:4: (otherlv_2= 'character' ( (otherlv_3= RULE_ID ) ) )
                    // InternalWeebADoodle.g:743:5: otherlv_2= 'character' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_7); 

                    					newLeafNode(otherlv_2, grammarAccess.getDirectionAccess().getCharacterKeyword_2_0_0());
                    				
                    // InternalWeebADoodle.g:747:5: ( (otherlv_3= RULE_ID ) )
                    // InternalWeebADoodle.g:748:6: (otherlv_3= RULE_ID )
                    {
                    // InternalWeebADoodle.g:748:6: (otherlv_3= RULE_ID )
                    // InternalWeebADoodle.g:749:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDirectionRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

                    							newLeafNode(otherlv_3, grammarAccess.getDirectionAccess().getTargetCharacterCharacterCrossReference_2_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalWeebADoodle.g:762:4: (otherlv_4= 'object' ( (otherlv_5= RULE_ID ) ) )
                    {
                    // InternalWeebADoodle.g:762:4: (otherlv_4= 'object' ( (otherlv_5= RULE_ID ) ) )
                    // InternalWeebADoodle.g:763:5: otherlv_4= 'object' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_7); 

                    					newLeafNode(otherlv_4, grammarAccess.getDirectionAccess().getObjectKeyword_2_1_0());
                    				
                    // InternalWeebADoodle.g:767:5: ( (otherlv_5= RULE_ID ) )
                    // InternalWeebADoodle.g:768:6: (otherlv_5= RULE_ID )
                    {
                    // InternalWeebADoodle.g:768:6: (otherlv_5= RULE_ID )
                    // InternalWeebADoodle.g:769:7: otherlv_5= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getDirectionRule());
                    							}
                    						
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); 

                    							newLeafNode(otherlv_5, grammarAccess.getDirectionAccess().getTargetObjectSceneObjectCrossReference_2_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,30,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getDirectionAccess().getMovementKeyword_3());
            		
            // InternalWeebADoodle.g:786:3: ( (lv_movement_7_0= RULE_STRING ) )
            // InternalWeebADoodle.g:787:4: (lv_movement_7_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:787:4: (lv_movement_7_0= RULE_STRING )
            // InternalWeebADoodle.g:788:5: lv_movement_7_0= RULE_STRING
            {
            lv_movement_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_movement_7_0, grammarAccess.getDirectionAccess().getMovementSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"movement",
            						lv_movement_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getDirectionAccess().getDescriptionKeyword_5());
            		
            // InternalWeebADoodle.g:808:3: ( (lv_description_9_0= RULE_STRING ) )
            // InternalWeebADoodle.g:809:4: (lv_description_9_0= RULE_STRING )
            {
            // InternalWeebADoodle.g:809:4: (lv_description_9_0= RULE_STRING )
            // InternalWeebADoodle.g:810:5: lv_description_9_0= RULE_STRING
            {
            lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_description_9_0, grammarAccess.getDirectionAccess().getDescriptionSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDirectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getDirectionAccess().getSemicolonKeyword_7());
            		
            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getDirectionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleDirection"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002880000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});

}