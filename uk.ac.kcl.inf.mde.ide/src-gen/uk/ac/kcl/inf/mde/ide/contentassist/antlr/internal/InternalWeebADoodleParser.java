package uk.ac.kcl.inf.mde.ide.contentassist.antlr.internal;

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
import uk.ac.kcl.inf.mde.services.WeebADoodleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalWeebADoodleParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(WeebADoodleGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleStoryboard"
    // InternalWeebADoodle.g:53:1: entryRuleStoryboard : ruleStoryboard EOF ;
    public final void entryRuleStoryboard() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:54:1: ( ruleStoryboard EOF )
            // InternalWeebADoodle.g:55:1: ruleStoryboard EOF
            {
             before(grammarAccess.getStoryboardRule()); 
            pushFollow(FOLLOW_1);
            ruleStoryboard();

            state._fsp--;

             after(grammarAccess.getStoryboardRule()); 
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
    // $ANTLR end "entryRuleStoryboard"


    // $ANTLR start "ruleStoryboard"
    // InternalWeebADoodle.g:62:1: ruleStoryboard : ( ( rule__Storyboard__Group__0 ) ) ;
    public final void ruleStoryboard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:66:2: ( ( ( rule__Storyboard__Group__0 ) ) )
            // InternalWeebADoodle.g:67:2: ( ( rule__Storyboard__Group__0 ) )
            {
            // InternalWeebADoodle.g:67:2: ( ( rule__Storyboard__Group__0 ) )
            // InternalWeebADoodle.g:68:3: ( rule__Storyboard__Group__0 )
            {
             before(grammarAccess.getStoryboardAccess().getGroup()); 
            // InternalWeebADoodle.g:69:3: ( rule__Storyboard__Group__0 )
            // InternalWeebADoodle.g:69:4: rule__Storyboard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Storyboard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoryboardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStoryboard"


    // $ANTLR start "entryRuleScene"
    // InternalWeebADoodle.g:78:1: entryRuleScene : ruleScene EOF ;
    public final void entryRuleScene() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:79:1: ( ruleScene EOF )
            // InternalWeebADoodle.g:80:1: ruleScene EOF
            {
             before(grammarAccess.getSceneRule()); 
            pushFollow(FOLLOW_1);
            ruleScene();

            state._fsp--;

             after(grammarAccess.getSceneRule()); 
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
    // $ANTLR end "entryRuleScene"


    // $ANTLR start "ruleScene"
    // InternalWeebADoodle.g:87:1: ruleScene : ( ( rule__Scene__Group__0 ) ) ;
    public final void ruleScene() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:91:2: ( ( ( rule__Scene__Group__0 ) ) )
            // InternalWeebADoodle.g:92:2: ( ( rule__Scene__Group__0 ) )
            {
            // InternalWeebADoodle.g:92:2: ( ( rule__Scene__Group__0 ) )
            // InternalWeebADoodle.g:93:3: ( rule__Scene__Group__0 )
            {
             before(grammarAccess.getSceneAccess().getGroup()); 
            // InternalWeebADoodle.g:94:3: ( rule__Scene__Group__0 )
            // InternalWeebADoodle.g:94:4: rule__Scene__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScene"


    // $ANTLR start "entryRuleCharacter"
    // InternalWeebADoodle.g:103:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:104:1: ( ruleCharacter EOF )
            // InternalWeebADoodle.g:105:1: ruleCharacter EOF
            {
             before(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacter();

            state._fsp--;

             after(grammarAccess.getCharacterRule()); 
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
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // InternalWeebADoodle.g:112:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:116:2: ( ( ( rule__Character__Group__0 ) ) )
            // InternalWeebADoodle.g:117:2: ( ( rule__Character__Group__0 ) )
            {
            // InternalWeebADoodle.g:117:2: ( ( rule__Character__Group__0 ) )
            // InternalWeebADoodle.g:118:3: ( rule__Character__Group__0 )
            {
             before(grammarAccess.getCharacterAccess().getGroup()); 
            // InternalWeebADoodle.g:119:3: ( rule__Character__Group__0 )
            // InternalWeebADoodle.g:119:4: rule__Character__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleSceneObject"
    // InternalWeebADoodle.g:128:1: entryRuleSceneObject : ruleSceneObject EOF ;
    public final void entryRuleSceneObject() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:129:1: ( ruleSceneObject EOF )
            // InternalWeebADoodle.g:130:1: ruleSceneObject EOF
            {
             before(grammarAccess.getSceneObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleSceneObject();

            state._fsp--;

             after(grammarAccess.getSceneObjectRule()); 
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
    // $ANTLR end "entryRuleSceneObject"


    // $ANTLR start "ruleSceneObject"
    // InternalWeebADoodle.g:137:1: ruleSceneObject : ( ( rule__SceneObject__Group__0 ) ) ;
    public final void ruleSceneObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:141:2: ( ( ( rule__SceneObject__Group__0 ) ) )
            // InternalWeebADoodle.g:142:2: ( ( rule__SceneObject__Group__0 ) )
            {
            // InternalWeebADoodle.g:142:2: ( ( rule__SceneObject__Group__0 ) )
            // InternalWeebADoodle.g:143:3: ( rule__SceneObject__Group__0 )
            {
             before(grammarAccess.getSceneObjectAccess().getGroup()); 
            // InternalWeebADoodle.g:144:3: ( rule__SceneObject__Group__0 )
            // InternalWeebADoodle.g:144:4: rule__SceneObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSceneObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSceneObject"


    // $ANTLR start "entryRuleSetting"
    // InternalWeebADoodle.g:153:1: entryRuleSetting : ruleSetting EOF ;
    public final void entryRuleSetting() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:154:1: ( ruleSetting EOF )
            // InternalWeebADoodle.g:155:1: ruleSetting EOF
            {
             before(grammarAccess.getSettingRule()); 
            pushFollow(FOLLOW_1);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getSettingRule()); 
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
    // $ANTLR end "entryRuleSetting"


    // $ANTLR start "ruleSetting"
    // InternalWeebADoodle.g:162:1: ruleSetting : ( ( rule__Setting__Group__0 ) ) ;
    public final void ruleSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:166:2: ( ( ( rule__Setting__Group__0 ) ) )
            // InternalWeebADoodle.g:167:2: ( ( rule__Setting__Group__0 ) )
            {
            // InternalWeebADoodle.g:167:2: ( ( rule__Setting__Group__0 ) )
            // InternalWeebADoodle.g:168:3: ( rule__Setting__Group__0 )
            {
             before(grammarAccess.getSettingAccess().getGroup()); 
            // InternalWeebADoodle.g:169:3: ( rule__Setting__Group__0 )
            // InternalWeebADoodle.g:169:4: rule__Setting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Setting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetting"


    // $ANTLR start "entryRuleDirection"
    // InternalWeebADoodle.g:178:1: entryRuleDirection : ruleDirection EOF ;
    public final void entryRuleDirection() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:179:1: ( ruleDirection EOF )
            // InternalWeebADoodle.g:180:1: ruleDirection EOF
            {
             before(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_1);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectionRule()); 
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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalWeebADoodle.g:187:1: ruleDirection : ( ( rule__Direction__Group__0 ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:191:2: ( ( ( rule__Direction__Group__0 ) ) )
            // InternalWeebADoodle.g:192:2: ( ( rule__Direction__Group__0 ) )
            {
            // InternalWeebADoodle.g:192:2: ( ( rule__Direction__Group__0 ) )
            // InternalWeebADoodle.g:193:3: ( rule__Direction__Group__0 )
            {
             before(grammarAccess.getDirectionAccess().getGroup()); 
            // InternalWeebADoodle.g:194:3: ( rule__Direction__Group__0 )
            // InternalWeebADoodle.g:194:4: rule__Direction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "rule__Direction__Alternatives_2"
    // InternalWeebADoodle.g:202:1: rule__Direction__Alternatives_2 : ( ( ( rule__Direction__Group_2_0__0 ) ) | ( ( rule__Direction__Group_2_1__0 ) ) );
    public final void rule__Direction__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:206:1: ( ( ( rule__Direction__Group_2_0__0 ) ) | ( ( rule__Direction__Group_2_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalWeebADoodle.g:207:2: ( ( rule__Direction__Group_2_0__0 ) )
                    {
                    // InternalWeebADoodle.g:207:2: ( ( rule__Direction__Group_2_0__0 ) )
                    // InternalWeebADoodle.g:208:3: ( rule__Direction__Group_2_0__0 )
                    {
                     before(grammarAccess.getDirectionAccess().getGroup_2_0()); 
                    // InternalWeebADoodle.g:209:3: ( rule__Direction__Group_2_0__0 )
                    // InternalWeebADoodle.g:209:4: rule__Direction__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Direction__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalWeebADoodle.g:213:2: ( ( rule__Direction__Group_2_1__0 ) )
                    {
                    // InternalWeebADoodle.g:213:2: ( ( rule__Direction__Group_2_1__0 ) )
                    // InternalWeebADoodle.g:214:3: ( rule__Direction__Group_2_1__0 )
                    {
                     before(grammarAccess.getDirectionAccess().getGroup_2_1()); 
                    // InternalWeebADoodle.g:215:3: ( rule__Direction__Group_2_1__0 )
                    // InternalWeebADoodle.g:215:4: rule__Direction__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Direction__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectionAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Direction__Alternatives_2"


    // $ANTLR start "rule__Storyboard__Group__0"
    // InternalWeebADoodle.g:223:1: rule__Storyboard__Group__0 : rule__Storyboard__Group__0__Impl rule__Storyboard__Group__1 ;
    public final void rule__Storyboard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:227:1: ( rule__Storyboard__Group__0__Impl rule__Storyboard__Group__1 )
            // InternalWeebADoodle.g:228:2: rule__Storyboard__Group__0__Impl rule__Storyboard__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Storyboard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Storyboard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storyboard__Group__0"


    // $ANTLR start "rule__Storyboard__Group__0__Impl"
    // InternalWeebADoodle.g:235:1: rule__Storyboard__Group__0__Impl : ( 'board' ) ;
    public final void rule__Storyboard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:239:1: ( ( 'board' ) )
            // InternalWeebADoodle.g:240:1: ( 'board' )
            {
            // InternalWeebADoodle.g:240:1: ( 'board' )
            // InternalWeebADoodle.g:241:2: 'board'
            {
             before(grammarAccess.getStoryboardAccess().getBoardKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStoryboardAccess().getBoardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storyboard__Group__0__Impl"


    // $ANTLR start "rule__Storyboard__Group__1"
    // InternalWeebADoodle.g:250:1: rule__Storyboard__Group__1 : rule__Storyboard__Group__1__Impl rule__Storyboard__Group__2 ;
    public final void rule__Storyboard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:254:1: ( rule__Storyboard__Group__1__Impl rule__Storyboard__Group__2 )
            // InternalWeebADoodle.g:255:2: rule__Storyboard__Group__1__Impl rule__Storyboard__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Storyboard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Storyboard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storyboard__Group__1"


    // $ANTLR start "rule__Storyboard__Group__1__Impl"
    // InternalWeebADoodle.g:262:1: rule__Storyboard__Group__1__Impl : ( '{' ) ;
    public final void rule__Storyboard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:266:1: ( ( '{' ) )
            // InternalWeebADoodle.g:267:1: ( '{' )
            {
            // InternalWeebADoodle.g:267:1: ( '{' )
            // InternalWeebADoodle.g:268:2: '{'
            {
             before(grammarAccess.getStoryboardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStoryboardAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storyboard__Group__1__Impl"


    // $ANTLR start "rule__Storyboard__Group__2"
    // InternalWeebADoodle.g:277:1: rule__Storyboard__Group__2 : rule__Storyboard__Group__2__Impl rule__Storyboard__Group__3 ;
    public final void rule__Storyboard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:281:1: ( rule__Storyboard__Group__2__Impl rule__Storyboard__Group__3 )
            // InternalWeebADoodle.g:282:2: rule__Storyboard__Group__2__Impl rule__Storyboard__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Storyboard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Storyboard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storyboard__Group__2"


    // $ANTLR start "rule__Storyboard__Group__2__Impl"
    // InternalWeebADoodle.g:289:1: rule__Storyboard__Group__2__Impl : ( ( ( rule__Storyboard__ScenesAssignment_2 ) ) ( ( rule__Storyboard__ScenesAssignment_2 )* ) ) ;
    public final void rule__Storyboard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:293:1: ( ( ( ( rule__Storyboard__ScenesAssignment_2 ) ) ( ( rule__Storyboard__ScenesAssignment_2 )* ) ) )
            // InternalWeebADoodle.g:294:1: ( ( ( rule__Storyboard__ScenesAssignment_2 ) ) ( ( rule__Storyboard__ScenesAssignment_2 )* ) )
            {
            // InternalWeebADoodle.g:294:1: ( ( ( rule__Storyboard__ScenesAssignment_2 ) ) ( ( rule__Storyboard__ScenesAssignment_2 )* ) )
            // InternalWeebADoodle.g:295:2: ( ( rule__Storyboard__ScenesAssignment_2 ) ) ( ( rule__Storyboard__ScenesAssignment_2 )* )
            {
            // InternalWeebADoodle.g:295:2: ( ( rule__Storyboard__ScenesAssignment_2 ) )
            // InternalWeebADoodle.g:296:3: ( rule__Storyboard__ScenesAssignment_2 )
            {
             before(grammarAccess.getStoryboardAccess().getScenesAssignment_2()); 
            // InternalWeebADoodle.g:297:3: ( rule__Storyboard__ScenesAssignment_2 )
            // InternalWeebADoodle.g:297:4: rule__Storyboard__ScenesAssignment_2
            {
            pushFollow(FOLLOW_6);
            rule__Storyboard__ScenesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStoryboardAccess().getScenesAssignment_2()); 

            }

            // InternalWeebADoodle.g:300:2: ( ( rule__Storyboard__ScenesAssignment_2 )* )
            // InternalWeebADoodle.g:301:3: ( rule__Storyboard__ScenesAssignment_2 )*
            {
             before(grammarAccess.getStoryboardAccess().getScenesAssignment_2()); 
            // InternalWeebADoodle.g:302:3: ( rule__Storyboard__ScenesAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWeebADoodle.g:302:4: rule__Storyboard__ScenesAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Storyboard__ScenesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getStoryboardAccess().getScenesAssignment_2()); 

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
    // $ANTLR end "rule__Storyboard__Group__2__Impl"


    // $ANTLR start "rule__Storyboard__Group__3"
    // InternalWeebADoodle.g:311:1: rule__Storyboard__Group__3 : rule__Storyboard__Group__3__Impl ;
    public final void rule__Storyboard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:315:1: ( rule__Storyboard__Group__3__Impl )
            // InternalWeebADoodle.g:316:2: rule__Storyboard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Storyboard__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storyboard__Group__3"


    // $ANTLR start "rule__Storyboard__Group__3__Impl"
    // InternalWeebADoodle.g:322:1: rule__Storyboard__Group__3__Impl : ( '}' ) ;
    public final void rule__Storyboard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:326:1: ( ( '}' ) )
            // InternalWeebADoodle.g:327:1: ( '}' )
            {
            // InternalWeebADoodle.g:327:1: ( '}' )
            // InternalWeebADoodle.g:328:2: '}'
            {
             before(grammarAccess.getStoryboardAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStoryboardAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storyboard__Group__3__Impl"


    // $ANTLR start "rule__Scene__Group__0"
    // InternalWeebADoodle.g:338:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:342:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalWeebADoodle.g:343:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Scene__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__0"


    // $ANTLR start "rule__Scene__Group__0__Impl"
    // InternalWeebADoodle.g:350:1: rule__Scene__Group__0__Impl : ( 'scene' ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:354:1: ( ( 'scene' ) )
            // InternalWeebADoodle.g:355:1: ( 'scene' )
            {
            // InternalWeebADoodle.g:355:1: ( 'scene' )
            // InternalWeebADoodle.g:356:2: 'scene'
            {
             before(grammarAccess.getSceneAccess().getSceneKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getSceneKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__0__Impl"


    // $ANTLR start "rule__Scene__Group__1"
    // InternalWeebADoodle.g:365:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:369:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalWeebADoodle.g:370:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Scene__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__1"


    // $ANTLR start "rule__Scene__Group__1__Impl"
    // InternalWeebADoodle.g:377:1: rule__Scene__Group__1__Impl : ( '{' ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:381:1: ( ( '{' ) )
            // InternalWeebADoodle.g:382:1: ( '{' )
            {
            // InternalWeebADoodle.g:382:1: ( '{' )
            // InternalWeebADoodle.g:383:2: '{'
            {
             before(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__1__Impl"


    // $ANTLR start "rule__Scene__Group__2"
    // InternalWeebADoodle.g:392:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:396:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalWeebADoodle.g:397:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Scene__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__2"


    // $ANTLR start "rule__Scene__Group__2__Impl"
    // InternalWeebADoodle.g:404:1: rule__Scene__Group__2__Impl : ( 'name' ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:408:1: ( ( 'name' ) )
            // InternalWeebADoodle.g:409:1: ( 'name' )
            {
            // InternalWeebADoodle.g:409:1: ( 'name' )
            // InternalWeebADoodle.g:410:2: 'name'
            {
             before(grammarAccess.getSceneAccess().getNameKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__2__Impl"


    // $ANTLR start "rule__Scene__Group__3"
    // InternalWeebADoodle.g:419:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:423:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalWeebADoodle.g:424:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Scene__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__3"


    // $ANTLR start "rule__Scene__Group__3__Impl"
    // InternalWeebADoodle.g:431:1: rule__Scene__Group__3__Impl : ( ( rule__Scene__NameAssignment_3 ) ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:435:1: ( ( ( rule__Scene__NameAssignment_3 ) ) )
            // InternalWeebADoodle.g:436:1: ( ( rule__Scene__NameAssignment_3 ) )
            {
            // InternalWeebADoodle.g:436:1: ( ( rule__Scene__NameAssignment_3 ) )
            // InternalWeebADoodle.g:437:2: ( rule__Scene__NameAssignment_3 )
            {
             before(grammarAccess.getSceneAccess().getNameAssignment_3()); 
            // InternalWeebADoodle.g:438:2: ( rule__Scene__NameAssignment_3 )
            // InternalWeebADoodle.g:438:3: rule__Scene__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Scene__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__3__Impl"


    // $ANTLR start "rule__Scene__Group__4"
    // InternalWeebADoodle.g:446:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:450:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalWeebADoodle.g:451:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Scene__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__4"


    // $ANTLR start "rule__Scene__Group__4__Impl"
    // InternalWeebADoodle.g:458:1: rule__Scene__Group__4__Impl : ( ':' ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:462:1: ( ( ':' ) )
            // InternalWeebADoodle.g:463:1: ( ':' )
            {
            // InternalWeebADoodle.g:463:1: ( ':' )
            // InternalWeebADoodle.g:464:2: ':'
            {
             before(grammarAccess.getSceneAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__4__Impl"


    // $ANTLR start "rule__Scene__Group__5"
    // InternalWeebADoodle.g:473:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:477:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalWeebADoodle.g:478:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Scene__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__5"


    // $ANTLR start "rule__Scene__Group__5__Impl"
    // InternalWeebADoodle.g:485:1: rule__Scene__Group__5__Impl : ( ( rule__Scene__ValueAssignment_5 ) ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:489:1: ( ( ( rule__Scene__ValueAssignment_5 ) ) )
            // InternalWeebADoodle.g:490:1: ( ( rule__Scene__ValueAssignment_5 ) )
            {
            // InternalWeebADoodle.g:490:1: ( ( rule__Scene__ValueAssignment_5 ) )
            // InternalWeebADoodle.g:491:2: ( rule__Scene__ValueAssignment_5 )
            {
             before(grammarAccess.getSceneAccess().getValueAssignment_5()); 
            // InternalWeebADoodle.g:492:2: ( rule__Scene__ValueAssignment_5 )
            // InternalWeebADoodle.g:492:3: rule__Scene__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__5__Impl"


    // $ANTLR start "rule__Scene__Group__6"
    // InternalWeebADoodle.g:500:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl rule__Scene__Group__7 ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:504:1: ( rule__Scene__Group__6__Impl rule__Scene__Group__7 )
            // InternalWeebADoodle.g:505:2: rule__Scene__Group__6__Impl rule__Scene__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Scene__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__6"


    // $ANTLR start "rule__Scene__Group__6__Impl"
    // InternalWeebADoodle.g:512:1: rule__Scene__Group__6__Impl : ( ';' ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:516:1: ( ( ';' ) )
            // InternalWeebADoodle.g:517:1: ( ';' )
            {
            // InternalWeebADoodle.g:517:1: ( ';' )
            // InternalWeebADoodle.g:518:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__6__Impl"


    // $ANTLR start "rule__Scene__Group__7"
    // InternalWeebADoodle.g:527:1: rule__Scene__Group__7 : rule__Scene__Group__7__Impl rule__Scene__Group__8 ;
    public final void rule__Scene__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:531:1: ( rule__Scene__Group__7__Impl rule__Scene__Group__8 )
            // InternalWeebADoodle.g:532:2: rule__Scene__Group__7__Impl rule__Scene__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Scene__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__7"


    // $ANTLR start "rule__Scene__Group__7__Impl"
    // InternalWeebADoodle.g:539:1: rule__Scene__Group__7__Impl : ( 'background:' ) ;
    public final void rule__Scene__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:543:1: ( ( 'background:' ) )
            // InternalWeebADoodle.g:544:1: ( 'background:' )
            {
            // InternalWeebADoodle.g:544:1: ( 'background:' )
            // InternalWeebADoodle.g:545:2: 'background:'
            {
             before(grammarAccess.getSceneAccess().getBackgroundKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getBackgroundKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__7__Impl"


    // $ANTLR start "rule__Scene__Group__8"
    // InternalWeebADoodle.g:554:1: rule__Scene__Group__8 : rule__Scene__Group__8__Impl rule__Scene__Group__9 ;
    public final void rule__Scene__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:558:1: ( rule__Scene__Group__8__Impl rule__Scene__Group__9 )
            // InternalWeebADoodle.g:559:2: rule__Scene__Group__8__Impl rule__Scene__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Scene__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__8"


    // $ANTLR start "rule__Scene__Group__8__Impl"
    // InternalWeebADoodle.g:566:1: rule__Scene__Group__8__Impl : ( ( rule__Scene__BackgroundAssignment_8 ) ) ;
    public final void rule__Scene__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:570:1: ( ( ( rule__Scene__BackgroundAssignment_8 ) ) )
            // InternalWeebADoodle.g:571:1: ( ( rule__Scene__BackgroundAssignment_8 ) )
            {
            // InternalWeebADoodle.g:571:1: ( ( rule__Scene__BackgroundAssignment_8 ) )
            // InternalWeebADoodle.g:572:2: ( rule__Scene__BackgroundAssignment_8 )
            {
             before(grammarAccess.getSceneAccess().getBackgroundAssignment_8()); 
            // InternalWeebADoodle.g:573:2: ( rule__Scene__BackgroundAssignment_8 )
            // InternalWeebADoodle.g:573:3: rule__Scene__BackgroundAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Scene__BackgroundAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getBackgroundAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__8__Impl"


    // $ANTLR start "rule__Scene__Group__9"
    // InternalWeebADoodle.g:581:1: rule__Scene__Group__9 : rule__Scene__Group__9__Impl rule__Scene__Group__10 ;
    public final void rule__Scene__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:585:1: ( rule__Scene__Group__9__Impl rule__Scene__Group__10 )
            // InternalWeebADoodle.g:586:2: rule__Scene__Group__9__Impl rule__Scene__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Scene__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__9"


    // $ANTLR start "rule__Scene__Group__9__Impl"
    // InternalWeebADoodle.g:593:1: rule__Scene__Group__9__Impl : ( ';' ) ;
    public final void rule__Scene__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:597:1: ( ( ';' ) )
            // InternalWeebADoodle.g:598:1: ( ';' )
            {
            // InternalWeebADoodle.g:598:1: ( ';' )
            // InternalWeebADoodle.g:599:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__9__Impl"


    // $ANTLR start "rule__Scene__Group__10"
    // InternalWeebADoodle.g:608:1: rule__Scene__Group__10 : rule__Scene__Group__10__Impl rule__Scene__Group__11 ;
    public final void rule__Scene__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:612:1: ( rule__Scene__Group__10__Impl rule__Scene__Group__11 )
            // InternalWeebADoodle.g:613:2: rule__Scene__Group__10__Impl rule__Scene__Group__11
            {
            pushFollow(FOLLOW_13);
            rule__Scene__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__10"


    // $ANTLR start "rule__Scene__Group__10__Impl"
    // InternalWeebADoodle.g:620:1: rule__Scene__Group__10__Impl : ( ( rule__Scene__CharactersAssignment_10 )* ) ;
    public final void rule__Scene__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:624:1: ( ( ( rule__Scene__CharactersAssignment_10 )* ) )
            // InternalWeebADoodle.g:625:1: ( ( rule__Scene__CharactersAssignment_10 )* )
            {
            // InternalWeebADoodle.g:625:1: ( ( rule__Scene__CharactersAssignment_10 )* )
            // InternalWeebADoodle.g:626:2: ( rule__Scene__CharactersAssignment_10 )*
            {
             before(grammarAccess.getSceneAccess().getCharactersAssignment_10()); 
            // InternalWeebADoodle.g:627:2: ( rule__Scene__CharactersAssignment_10 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWeebADoodle.g:627:3: rule__Scene__CharactersAssignment_10
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Scene__CharactersAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getSceneAccess().getCharactersAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__10__Impl"


    // $ANTLR start "rule__Scene__Group__11"
    // InternalWeebADoodle.g:635:1: rule__Scene__Group__11 : rule__Scene__Group__11__Impl rule__Scene__Group__12 ;
    public final void rule__Scene__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:639:1: ( rule__Scene__Group__11__Impl rule__Scene__Group__12 )
            // InternalWeebADoodle.g:640:2: rule__Scene__Group__11__Impl rule__Scene__Group__12
            {
            pushFollow(FOLLOW_13);
            rule__Scene__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__11"


    // $ANTLR start "rule__Scene__Group__11__Impl"
    // InternalWeebADoodle.g:647:1: rule__Scene__Group__11__Impl : ( ( rule__Scene__ObjectsAssignment_11 )* ) ;
    public final void rule__Scene__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:651:1: ( ( ( rule__Scene__ObjectsAssignment_11 )* ) )
            // InternalWeebADoodle.g:652:1: ( ( rule__Scene__ObjectsAssignment_11 )* )
            {
            // InternalWeebADoodle.g:652:1: ( ( rule__Scene__ObjectsAssignment_11 )* )
            // InternalWeebADoodle.g:653:2: ( rule__Scene__ObjectsAssignment_11 )*
            {
             before(grammarAccess.getSceneAccess().getObjectsAssignment_11()); 
            // InternalWeebADoodle.g:654:2: ( rule__Scene__ObjectsAssignment_11 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==23) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalWeebADoodle.g:654:3: rule__Scene__ObjectsAssignment_11
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Scene__ObjectsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSceneAccess().getObjectsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__11__Impl"


    // $ANTLR start "rule__Scene__Group__12"
    // InternalWeebADoodle.g:662:1: rule__Scene__Group__12 : rule__Scene__Group__12__Impl rule__Scene__Group__13 ;
    public final void rule__Scene__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:666:1: ( rule__Scene__Group__12__Impl rule__Scene__Group__13 )
            // InternalWeebADoodle.g:667:2: rule__Scene__Group__12__Impl rule__Scene__Group__13
            {
            pushFollow(FOLLOW_16);
            rule__Scene__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__12"


    // $ANTLR start "rule__Scene__Group__12__Impl"
    // InternalWeebADoodle.g:674:1: rule__Scene__Group__12__Impl : ( ( rule__Scene__SettingsAssignment_12 ) ) ;
    public final void rule__Scene__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:678:1: ( ( ( rule__Scene__SettingsAssignment_12 ) ) )
            // InternalWeebADoodle.g:679:1: ( ( rule__Scene__SettingsAssignment_12 ) )
            {
            // InternalWeebADoodle.g:679:1: ( ( rule__Scene__SettingsAssignment_12 ) )
            // InternalWeebADoodle.g:680:2: ( rule__Scene__SettingsAssignment_12 )
            {
             before(grammarAccess.getSceneAccess().getSettingsAssignment_12()); 
            // InternalWeebADoodle.g:681:2: ( rule__Scene__SettingsAssignment_12 )
            // InternalWeebADoodle.g:681:3: rule__Scene__SettingsAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Scene__SettingsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getSettingsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__12__Impl"


    // $ANTLR start "rule__Scene__Group__13"
    // InternalWeebADoodle.g:689:1: rule__Scene__Group__13 : rule__Scene__Group__13__Impl rule__Scene__Group__14 ;
    public final void rule__Scene__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:693:1: ( rule__Scene__Group__13__Impl rule__Scene__Group__14 )
            // InternalWeebADoodle.g:694:2: rule__Scene__Group__13__Impl rule__Scene__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__Scene__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scene__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__13"


    // $ANTLR start "rule__Scene__Group__13__Impl"
    // InternalWeebADoodle.g:701:1: rule__Scene__Group__13__Impl : ( ( rule__Scene__DirectionsAssignment_13 )? ) ;
    public final void rule__Scene__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:705:1: ( ( ( rule__Scene__DirectionsAssignment_13 )? ) )
            // InternalWeebADoodle.g:706:1: ( ( rule__Scene__DirectionsAssignment_13 )? )
            {
            // InternalWeebADoodle.g:706:1: ( ( rule__Scene__DirectionsAssignment_13 )? )
            // InternalWeebADoodle.g:707:2: ( rule__Scene__DirectionsAssignment_13 )?
            {
             before(grammarAccess.getSceneAccess().getDirectionsAssignment_13()); 
            // InternalWeebADoodle.g:708:2: ( rule__Scene__DirectionsAssignment_13 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWeebADoodle.g:708:3: rule__Scene__DirectionsAssignment_13
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scene__DirectionsAssignment_13();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSceneAccess().getDirectionsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__13__Impl"


    // $ANTLR start "rule__Scene__Group__14"
    // InternalWeebADoodle.g:716:1: rule__Scene__Group__14 : rule__Scene__Group__14__Impl ;
    public final void rule__Scene__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:720:1: ( rule__Scene__Group__14__Impl )
            // InternalWeebADoodle.g:721:2: rule__Scene__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__14"


    // $ANTLR start "rule__Scene__Group__14__Impl"
    // InternalWeebADoodle.g:727:1: rule__Scene__Group__14__Impl : ( '}' ) ;
    public final void rule__Scene__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:731:1: ( ( '}' ) )
            // InternalWeebADoodle.g:732:1: ( '}' )
            {
            // InternalWeebADoodle.g:732:1: ( '}' )
            // InternalWeebADoodle.g:733:2: '}'
            {
             before(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_14()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__Group__14__Impl"


    // $ANTLR start "rule__Character__Group__0"
    // InternalWeebADoodle.g:743:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:747:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // InternalWeebADoodle.g:748:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Character__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0"


    // $ANTLR start "rule__Character__Group__0__Impl"
    // InternalWeebADoodle.g:755:1: rule__Character__Group__0__Impl : ( 'character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:759:1: ( ( 'character' ) )
            // InternalWeebADoodle.g:760:1: ( 'character' )
            {
            // InternalWeebADoodle.g:760:1: ( 'character' )
            // InternalWeebADoodle.g:761:2: 'character'
            {
             before(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getCharacterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0__Impl"


    // $ANTLR start "rule__Character__Group__1"
    // InternalWeebADoodle.g:770:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:774:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // InternalWeebADoodle.g:775:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Character__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1"


    // $ANTLR start "rule__Character__Group__1__Impl"
    // InternalWeebADoodle.g:782:1: rule__Character__Group__1__Impl : ( '{' ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:786:1: ( ( '{' ) )
            // InternalWeebADoodle.g:787:1: ( '{' )
            {
            // InternalWeebADoodle.g:787:1: ( '{' )
            // InternalWeebADoodle.g:788:2: '{'
            {
             before(grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1__Impl"


    // $ANTLR start "rule__Character__Group__2"
    // InternalWeebADoodle.g:797:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:801:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // InternalWeebADoodle.g:802:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Character__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2"


    // $ANTLR start "rule__Character__Group__2__Impl"
    // InternalWeebADoodle.g:809:1: rule__Character__Group__2__Impl : ( 'name' ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:813:1: ( ( 'name' ) )
            // InternalWeebADoodle.g:814:1: ( 'name' )
            {
            // InternalWeebADoodle.g:814:1: ( 'name' )
            // InternalWeebADoodle.g:815:2: 'name'
            {
             before(grammarAccess.getCharacterAccess().getNameKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2__Impl"


    // $ANTLR start "rule__Character__Group__3"
    // InternalWeebADoodle.g:824:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:828:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // InternalWeebADoodle.g:829:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Character__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__3"


    // $ANTLR start "rule__Character__Group__3__Impl"
    // InternalWeebADoodle.g:836:1: rule__Character__Group__3__Impl : ( ( rule__Character__NameAssignment_3 ) ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:840:1: ( ( ( rule__Character__NameAssignment_3 ) ) )
            // InternalWeebADoodle.g:841:1: ( ( rule__Character__NameAssignment_3 ) )
            {
            // InternalWeebADoodle.g:841:1: ( ( rule__Character__NameAssignment_3 ) )
            // InternalWeebADoodle.g:842:2: ( rule__Character__NameAssignment_3 )
            {
             before(grammarAccess.getCharacterAccess().getNameAssignment_3()); 
            // InternalWeebADoodle.g:843:2: ( rule__Character__NameAssignment_3 )
            // InternalWeebADoodle.g:843:3: rule__Character__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Character__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__3__Impl"


    // $ANTLR start "rule__Character__Group__4"
    // InternalWeebADoodle.g:851:1: rule__Character__Group__4 : rule__Character__Group__4__Impl rule__Character__Group__5 ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:855:1: ( rule__Character__Group__4__Impl rule__Character__Group__5 )
            // InternalWeebADoodle.g:856:2: rule__Character__Group__4__Impl rule__Character__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Character__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__4"


    // $ANTLR start "rule__Character__Group__4__Impl"
    // InternalWeebADoodle.g:863:1: rule__Character__Group__4__Impl : ( ':' ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:867:1: ( ( ':' ) )
            // InternalWeebADoodle.g:868:1: ( ':' )
            {
            // InternalWeebADoodle.g:868:1: ( ':' )
            // InternalWeebADoodle.g:869:2: ':'
            {
             before(grammarAccess.getCharacterAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__4__Impl"


    // $ANTLR start "rule__Character__Group__5"
    // InternalWeebADoodle.g:878:1: rule__Character__Group__5 : rule__Character__Group__5__Impl rule__Character__Group__6 ;
    public final void rule__Character__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:882:1: ( rule__Character__Group__5__Impl rule__Character__Group__6 )
            // InternalWeebADoodle.g:883:2: rule__Character__Group__5__Impl rule__Character__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Character__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__5"


    // $ANTLR start "rule__Character__Group__5__Impl"
    // InternalWeebADoodle.g:890:1: rule__Character__Group__5__Impl : ( ( rule__Character__ValueAssignment_5 ) ) ;
    public final void rule__Character__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:894:1: ( ( ( rule__Character__ValueAssignment_5 ) ) )
            // InternalWeebADoodle.g:895:1: ( ( rule__Character__ValueAssignment_5 ) )
            {
            // InternalWeebADoodle.g:895:1: ( ( rule__Character__ValueAssignment_5 ) )
            // InternalWeebADoodle.g:896:2: ( rule__Character__ValueAssignment_5 )
            {
             before(grammarAccess.getCharacterAccess().getValueAssignment_5()); 
            // InternalWeebADoodle.g:897:2: ( rule__Character__ValueAssignment_5 )
            // InternalWeebADoodle.g:897:3: rule__Character__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Character__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__5__Impl"


    // $ANTLR start "rule__Character__Group__6"
    // InternalWeebADoodle.g:905:1: rule__Character__Group__6 : rule__Character__Group__6__Impl rule__Character__Group__7 ;
    public final void rule__Character__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:909:1: ( rule__Character__Group__6__Impl rule__Character__Group__7 )
            // InternalWeebADoodle.g:910:2: rule__Character__Group__6__Impl rule__Character__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Character__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__6"


    // $ANTLR start "rule__Character__Group__6__Impl"
    // InternalWeebADoodle.g:917:1: rule__Character__Group__6__Impl : ( ';' ) ;
    public final void rule__Character__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:921:1: ( ( ';' ) )
            // InternalWeebADoodle.g:922:1: ( ';' )
            {
            // InternalWeebADoodle.g:922:1: ( ';' )
            // InternalWeebADoodle.g:923:2: ';'
            {
             before(grammarAccess.getCharacterAccess().getSemicolonKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__6__Impl"


    // $ANTLR start "rule__Character__Group__7"
    // InternalWeebADoodle.g:932:1: rule__Character__Group__7 : rule__Character__Group__7__Impl rule__Character__Group__8 ;
    public final void rule__Character__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:936:1: ( rule__Character__Group__7__Impl rule__Character__Group__8 )
            // InternalWeebADoodle.g:937:2: rule__Character__Group__7__Impl rule__Character__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Character__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__7"


    // $ANTLR start "rule__Character__Group__7__Impl"
    // InternalWeebADoodle.g:944:1: rule__Character__Group__7__Impl : ( 'action:' ) ;
    public final void rule__Character__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:948:1: ( ( 'action:' ) )
            // InternalWeebADoodle.g:949:1: ( 'action:' )
            {
            // InternalWeebADoodle.g:949:1: ( 'action:' )
            // InternalWeebADoodle.g:950:2: 'action:'
            {
             before(grammarAccess.getCharacterAccess().getActionKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getActionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__7__Impl"


    // $ANTLR start "rule__Character__Group__8"
    // InternalWeebADoodle.g:959:1: rule__Character__Group__8 : rule__Character__Group__8__Impl rule__Character__Group__9 ;
    public final void rule__Character__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:963:1: ( rule__Character__Group__8__Impl rule__Character__Group__9 )
            // InternalWeebADoodle.g:964:2: rule__Character__Group__8__Impl rule__Character__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Character__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__8"


    // $ANTLR start "rule__Character__Group__8__Impl"
    // InternalWeebADoodle.g:971:1: rule__Character__Group__8__Impl : ( ( rule__Character__ActionAssignment_8 ) ) ;
    public final void rule__Character__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:975:1: ( ( ( rule__Character__ActionAssignment_8 ) ) )
            // InternalWeebADoodle.g:976:1: ( ( rule__Character__ActionAssignment_8 ) )
            {
            // InternalWeebADoodle.g:976:1: ( ( rule__Character__ActionAssignment_8 ) )
            // InternalWeebADoodle.g:977:2: ( rule__Character__ActionAssignment_8 )
            {
             before(grammarAccess.getCharacterAccess().getActionAssignment_8()); 
            // InternalWeebADoodle.g:978:2: ( rule__Character__ActionAssignment_8 )
            // InternalWeebADoodle.g:978:3: rule__Character__ActionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Character__ActionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getActionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__8__Impl"


    // $ANTLR start "rule__Character__Group__9"
    // InternalWeebADoodle.g:986:1: rule__Character__Group__9 : rule__Character__Group__9__Impl rule__Character__Group__10 ;
    public final void rule__Character__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:990:1: ( rule__Character__Group__9__Impl rule__Character__Group__10 )
            // InternalWeebADoodle.g:991:2: rule__Character__Group__9__Impl rule__Character__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Character__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__9"


    // $ANTLR start "rule__Character__Group__9__Impl"
    // InternalWeebADoodle.g:998:1: rule__Character__Group__9__Impl : ( ';' ) ;
    public final void rule__Character__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1002:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1003:1: ( ';' )
            {
            // InternalWeebADoodle.g:1003:1: ( ';' )
            // InternalWeebADoodle.g:1004:2: ';'
            {
             before(grammarAccess.getCharacterAccess().getSemicolonKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__9__Impl"


    // $ANTLR start "rule__Character__Group__10"
    // InternalWeebADoodle.g:1013:1: rule__Character__Group__10 : rule__Character__Group__10__Impl rule__Character__Group__11 ;
    public final void rule__Character__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1017:1: ( rule__Character__Group__10__Impl rule__Character__Group__11 )
            // InternalWeebADoodle.g:1018:2: rule__Character__Group__10__Impl rule__Character__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Character__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__10"


    // $ANTLR start "rule__Character__Group__10__Impl"
    // InternalWeebADoodle.g:1025:1: rule__Character__Group__10__Impl : ( 'dialogue:' ) ;
    public final void rule__Character__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1029:1: ( ( 'dialogue:' ) )
            // InternalWeebADoodle.g:1030:1: ( 'dialogue:' )
            {
            // InternalWeebADoodle.g:1030:1: ( 'dialogue:' )
            // InternalWeebADoodle.g:1031:2: 'dialogue:'
            {
             before(grammarAccess.getCharacterAccess().getDialogueKeyword_10()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getDialogueKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__10__Impl"


    // $ANTLR start "rule__Character__Group__11"
    // InternalWeebADoodle.g:1040:1: rule__Character__Group__11 : rule__Character__Group__11__Impl rule__Character__Group__12 ;
    public final void rule__Character__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1044:1: ( rule__Character__Group__11__Impl rule__Character__Group__12 )
            // InternalWeebADoodle.g:1045:2: rule__Character__Group__11__Impl rule__Character__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__Character__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__11"


    // $ANTLR start "rule__Character__Group__11__Impl"
    // InternalWeebADoodle.g:1052:1: rule__Character__Group__11__Impl : ( ( rule__Character__DialogueAssignment_11 ) ) ;
    public final void rule__Character__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1056:1: ( ( ( rule__Character__DialogueAssignment_11 ) ) )
            // InternalWeebADoodle.g:1057:1: ( ( rule__Character__DialogueAssignment_11 ) )
            {
            // InternalWeebADoodle.g:1057:1: ( ( rule__Character__DialogueAssignment_11 ) )
            // InternalWeebADoodle.g:1058:2: ( rule__Character__DialogueAssignment_11 )
            {
             before(grammarAccess.getCharacterAccess().getDialogueAssignment_11()); 
            // InternalWeebADoodle.g:1059:2: ( rule__Character__DialogueAssignment_11 )
            // InternalWeebADoodle.g:1059:3: rule__Character__DialogueAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Character__DialogueAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getDialogueAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__11__Impl"


    // $ANTLR start "rule__Character__Group__12"
    // InternalWeebADoodle.g:1067:1: rule__Character__Group__12 : rule__Character__Group__12__Impl rule__Character__Group__13 ;
    public final void rule__Character__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1071:1: ( rule__Character__Group__12__Impl rule__Character__Group__13 )
            // InternalWeebADoodle.g:1072:2: rule__Character__Group__12__Impl rule__Character__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__Character__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__12"


    // $ANTLR start "rule__Character__Group__12__Impl"
    // InternalWeebADoodle.g:1079:1: rule__Character__Group__12__Impl : ( ';' ) ;
    public final void rule__Character__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1083:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1084:1: ( ';' )
            {
            // InternalWeebADoodle.g:1084:1: ( ';' )
            // InternalWeebADoodle.g:1085:2: ';'
            {
             before(grammarAccess.getCharacterAccess().getSemicolonKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getSemicolonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__12__Impl"


    // $ANTLR start "rule__Character__Group__13"
    // InternalWeebADoodle.g:1094:1: rule__Character__Group__13 : rule__Character__Group__13__Impl rule__Character__Group__14 ;
    public final void rule__Character__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1098:1: ( rule__Character__Group__13__Impl rule__Character__Group__14 )
            // InternalWeebADoodle.g:1099:2: rule__Character__Group__13__Impl rule__Character__Group__14
            {
            pushFollow(FOLLOW_10);
            rule__Character__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__13"


    // $ANTLR start "rule__Character__Group__13__Impl"
    // InternalWeebADoodle.g:1106:1: rule__Character__Group__13__Impl : ( 'description:' ) ;
    public final void rule__Character__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1110:1: ( ( 'description:' ) )
            // InternalWeebADoodle.g:1111:1: ( 'description:' )
            {
            // InternalWeebADoodle.g:1111:1: ( 'description:' )
            // InternalWeebADoodle.g:1112:2: 'description:'
            {
             before(grammarAccess.getCharacterAccess().getDescriptionKeyword_13()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getDescriptionKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__13__Impl"


    // $ANTLR start "rule__Character__Group__14"
    // InternalWeebADoodle.g:1121:1: rule__Character__Group__14 : rule__Character__Group__14__Impl rule__Character__Group__15 ;
    public final void rule__Character__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1125:1: ( rule__Character__Group__14__Impl rule__Character__Group__15 )
            // InternalWeebADoodle.g:1126:2: rule__Character__Group__14__Impl rule__Character__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__Character__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__14"


    // $ANTLR start "rule__Character__Group__14__Impl"
    // InternalWeebADoodle.g:1133:1: rule__Character__Group__14__Impl : ( ( rule__Character__DescriptionAssignment_14 ) ) ;
    public final void rule__Character__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1137:1: ( ( ( rule__Character__DescriptionAssignment_14 ) ) )
            // InternalWeebADoodle.g:1138:1: ( ( rule__Character__DescriptionAssignment_14 ) )
            {
            // InternalWeebADoodle.g:1138:1: ( ( rule__Character__DescriptionAssignment_14 ) )
            // InternalWeebADoodle.g:1139:2: ( rule__Character__DescriptionAssignment_14 )
            {
             before(grammarAccess.getCharacterAccess().getDescriptionAssignment_14()); 
            // InternalWeebADoodle.g:1140:2: ( rule__Character__DescriptionAssignment_14 )
            // InternalWeebADoodle.g:1140:3: rule__Character__DescriptionAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Character__DescriptionAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getDescriptionAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__14__Impl"


    // $ANTLR start "rule__Character__Group__15"
    // InternalWeebADoodle.g:1148:1: rule__Character__Group__15 : rule__Character__Group__15__Impl rule__Character__Group__16 ;
    public final void rule__Character__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1152:1: ( rule__Character__Group__15__Impl rule__Character__Group__16 )
            // InternalWeebADoodle.g:1153:2: rule__Character__Group__15__Impl rule__Character__Group__16
            {
            pushFollow(FOLLOW_5);
            rule__Character__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__15"


    // $ANTLR start "rule__Character__Group__15__Impl"
    // InternalWeebADoodle.g:1160:1: rule__Character__Group__15__Impl : ( ';' ) ;
    public final void rule__Character__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1164:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1165:1: ( ';' )
            {
            // InternalWeebADoodle.g:1165:1: ( ';' )
            // InternalWeebADoodle.g:1166:2: ';'
            {
             before(grammarAccess.getCharacterAccess().getSemicolonKeyword_15()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getSemicolonKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__15__Impl"


    // $ANTLR start "rule__Character__Group__16"
    // InternalWeebADoodle.g:1175:1: rule__Character__Group__16 : rule__Character__Group__16__Impl ;
    public final void rule__Character__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1179:1: ( rule__Character__Group__16__Impl )
            // InternalWeebADoodle.g:1180:2: rule__Character__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__16"


    // $ANTLR start "rule__Character__Group__16__Impl"
    // InternalWeebADoodle.g:1186:1: rule__Character__Group__16__Impl : ( '}' ) ;
    public final void rule__Character__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1190:1: ( ( '}' ) )
            // InternalWeebADoodle.g:1191:1: ( '}' )
            {
            // InternalWeebADoodle.g:1191:1: ( '}' )
            // InternalWeebADoodle.g:1192:2: '}'
            {
             before(grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_16()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__16__Impl"


    // $ANTLR start "rule__SceneObject__Group__0"
    // InternalWeebADoodle.g:1202:1: rule__SceneObject__Group__0 : rule__SceneObject__Group__0__Impl rule__SceneObject__Group__1 ;
    public final void rule__SceneObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1206:1: ( rule__SceneObject__Group__0__Impl rule__SceneObject__Group__1 )
            // InternalWeebADoodle.g:1207:2: rule__SceneObject__Group__0__Impl rule__SceneObject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SceneObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__0"


    // $ANTLR start "rule__SceneObject__Group__0__Impl"
    // InternalWeebADoodle.g:1214:1: rule__SceneObject__Group__0__Impl : ( 'object' ) ;
    public final void rule__SceneObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1218:1: ( ( 'object' ) )
            // InternalWeebADoodle.g:1219:1: ( 'object' )
            {
            // InternalWeebADoodle.g:1219:1: ( 'object' )
            // InternalWeebADoodle.g:1220:2: 'object'
            {
             before(grammarAccess.getSceneObjectAccess().getObjectKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getObjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__0__Impl"


    // $ANTLR start "rule__SceneObject__Group__1"
    // InternalWeebADoodle.g:1229:1: rule__SceneObject__Group__1 : rule__SceneObject__Group__1__Impl rule__SceneObject__Group__2 ;
    public final void rule__SceneObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1233:1: ( rule__SceneObject__Group__1__Impl rule__SceneObject__Group__2 )
            // InternalWeebADoodle.g:1234:2: rule__SceneObject__Group__1__Impl rule__SceneObject__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__SceneObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__1"


    // $ANTLR start "rule__SceneObject__Group__1__Impl"
    // InternalWeebADoodle.g:1241:1: rule__SceneObject__Group__1__Impl : ( '{' ) ;
    public final void rule__SceneObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1245:1: ( ( '{' ) )
            // InternalWeebADoodle.g:1246:1: ( '{' )
            {
            // InternalWeebADoodle.g:1246:1: ( '{' )
            // InternalWeebADoodle.g:1247:2: '{'
            {
             before(grammarAccess.getSceneObjectAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__1__Impl"


    // $ANTLR start "rule__SceneObject__Group__2"
    // InternalWeebADoodle.g:1256:1: rule__SceneObject__Group__2 : rule__SceneObject__Group__2__Impl rule__SceneObject__Group__3 ;
    public final void rule__SceneObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1260:1: ( rule__SceneObject__Group__2__Impl rule__SceneObject__Group__3 )
            // InternalWeebADoodle.g:1261:2: rule__SceneObject__Group__2__Impl rule__SceneObject__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__SceneObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__2"


    // $ANTLR start "rule__SceneObject__Group__2__Impl"
    // InternalWeebADoodle.g:1268:1: rule__SceneObject__Group__2__Impl : ( 'name' ) ;
    public final void rule__SceneObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1272:1: ( ( 'name' ) )
            // InternalWeebADoodle.g:1273:1: ( 'name' )
            {
            // InternalWeebADoodle.g:1273:1: ( 'name' )
            // InternalWeebADoodle.g:1274:2: 'name'
            {
             before(grammarAccess.getSceneObjectAccess().getNameKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__2__Impl"


    // $ANTLR start "rule__SceneObject__Group__3"
    // InternalWeebADoodle.g:1283:1: rule__SceneObject__Group__3 : rule__SceneObject__Group__3__Impl rule__SceneObject__Group__4 ;
    public final void rule__SceneObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1287:1: ( rule__SceneObject__Group__3__Impl rule__SceneObject__Group__4 )
            // InternalWeebADoodle.g:1288:2: rule__SceneObject__Group__3__Impl rule__SceneObject__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__SceneObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__3"


    // $ANTLR start "rule__SceneObject__Group__3__Impl"
    // InternalWeebADoodle.g:1295:1: rule__SceneObject__Group__3__Impl : ( ( rule__SceneObject__NameAssignment_3 ) ) ;
    public final void rule__SceneObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1299:1: ( ( ( rule__SceneObject__NameAssignment_3 ) ) )
            // InternalWeebADoodle.g:1300:1: ( ( rule__SceneObject__NameAssignment_3 ) )
            {
            // InternalWeebADoodle.g:1300:1: ( ( rule__SceneObject__NameAssignment_3 ) )
            // InternalWeebADoodle.g:1301:2: ( rule__SceneObject__NameAssignment_3 )
            {
             before(grammarAccess.getSceneObjectAccess().getNameAssignment_3()); 
            // InternalWeebADoodle.g:1302:2: ( rule__SceneObject__NameAssignment_3 )
            // InternalWeebADoodle.g:1302:3: rule__SceneObject__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSceneObjectAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__3__Impl"


    // $ANTLR start "rule__SceneObject__Group__4"
    // InternalWeebADoodle.g:1310:1: rule__SceneObject__Group__4 : rule__SceneObject__Group__4__Impl rule__SceneObject__Group__5 ;
    public final void rule__SceneObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1314:1: ( rule__SceneObject__Group__4__Impl rule__SceneObject__Group__5 )
            // InternalWeebADoodle.g:1315:2: rule__SceneObject__Group__4__Impl rule__SceneObject__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__SceneObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__4"


    // $ANTLR start "rule__SceneObject__Group__4__Impl"
    // InternalWeebADoodle.g:1322:1: rule__SceneObject__Group__4__Impl : ( ':' ) ;
    public final void rule__SceneObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1326:1: ( ( ':' ) )
            // InternalWeebADoodle.g:1327:1: ( ':' )
            {
            // InternalWeebADoodle.g:1327:1: ( ':' )
            // InternalWeebADoodle.g:1328:2: ':'
            {
             before(grammarAccess.getSceneObjectAccess().getColonKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__4__Impl"


    // $ANTLR start "rule__SceneObject__Group__5"
    // InternalWeebADoodle.g:1337:1: rule__SceneObject__Group__5 : rule__SceneObject__Group__5__Impl rule__SceneObject__Group__6 ;
    public final void rule__SceneObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1341:1: ( rule__SceneObject__Group__5__Impl rule__SceneObject__Group__6 )
            // InternalWeebADoodle.g:1342:2: rule__SceneObject__Group__5__Impl rule__SceneObject__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__SceneObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__5"


    // $ANTLR start "rule__SceneObject__Group__5__Impl"
    // InternalWeebADoodle.g:1349:1: rule__SceneObject__Group__5__Impl : ( ( rule__SceneObject__ValueAssignment_5 ) ) ;
    public final void rule__SceneObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1353:1: ( ( ( rule__SceneObject__ValueAssignment_5 ) ) )
            // InternalWeebADoodle.g:1354:1: ( ( rule__SceneObject__ValueAssignment_5 ) )
            {
            // InternalWeebADoodle.g:1354:1: ( ( rule__SceneObject__ValueAssignment_5 ) )
            // InternalWeebADoodle.g:1355:2: ( rule__SceneObject__ValueAssignment_5 )
            {
             before(grammarAccess.getSceneObjectAccess().getValueAssignment_5()); 
            // InternalWeebADoodle.g:1356:2: ( rule__SceneObject__ValueAssignment_5 )
            // InternalWeebADoodle.g:1356:3: rule__SceneObject__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSceneObjectAccess().getValueAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__5__Impl"


    // $ANTLR start "rule__SceneObject__Group__6"
    // InternalWeebADoodle.g:1364:1: rule__SceneObject__Group__6 : rule__SceneObject__Group__6__Impl rule__SceneObject__Group__7 ;
    public final void rule__SceneObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1368:1: ( rule__SceneObject__Group__6__Impl rule__SceneObject__Group__7 )
            // InternalWeebADoodle.g:1369:2: rule__SceneObject__Group__6__Impl rule__SceneObject__Group__7
            {
            pushFollow(FOLLOW_20);
            rule__SceneObject__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__6"


    // $ANTLR start "rule__SceneObject__Group__6__Impl"
    // InternalWeebADoodle.g:1376:1: rule__SceneObject__Group__6__Impl : ( ';' ) ;
    public final void rule__SceneObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1380:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1381:1: ( ';' )
            {
            // InternalWeebADoodle.g:1381:1: ( ';' )
            // InternalWeebADoodle.g:1382:2: ';'
            {
             before(grammarAccess.getSceneObjectAccess().getSemicolonKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__6__Impl"


    // $ANTLR start "rule__SceneObject__Group__7"
    // InternalWeebADoodle.g:1391:1: rule__SceneObject__Group__7 : rule__SceneObject__Group__7__Impl rule__SceneObject__Group__8 ;
    public final void rule__SceneObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1395:1: ( rule__SceneObject__Group__7__Impl rule__SceneObject__Group__8 )
            // InternalWeebADoodle.g:1396:2: rule__SceneObject__Group__7__Impl rule__SceneObject__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__SceneObject__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__7"


    // $ANTLR start "rule__SceneObject__Group__7__Impl"
    // InternalWeebADoodle.g:1403:1: rule__SceneObject__Group__7__Impl : ( 'position:' ) ;
    public final void rule__SceneObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1407:1: ( ( 'position:' ) )
            // InternalWeebADoodle.g:1408:1: ( 'position:' )
            {
            // InternalWeebADoodle.g:1408:1: ( 'position:' )
            // InternalWeebADoodle.g:1409:2: 'position:'
            {
             before(grammarAccess.getSceneObjectAccess().getPositionKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getPositionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__7__Impl"


    // $ANTLR start "rule__SceneObject__Group__8"
    // InternalWeebADoodle.g:1418:1: rule__SceneObject__Group__8 : rule__SceneObject__Group__8__Impl rule__SceneObject__Group__9 ;
    public final void rule__SceneObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1422:1: ( rule__SceneObject__Group__8__Impl rule__SceneObject__Group__9 )
            // InternalWeebADoodle.g:1423:2: rule__SceneObject__Group__8__Impl rule__SceneObject__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__SceneObject__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__8"


    // $ANTLR start "rule__SceneObject__Group__8__Impl"
    // InternalWeebADoodle.g:1430:1: rule__SceneObject__Group__8__Impl : ( ( rule__SceneObject__PositionAssignment_8 ) ) ;
    public final void rule__SceneObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1434:1: ( ( ( rule__SceneObject__PositionAssignment_8 ) ) )
            // InternalWeebADoodle.g:1435:1: ( ( rule__SceneObject__PositionAssignment_8 ) )
            {
            // InternalWeebADoodle.g:1435:1: ( ( rule__SceneObject__PositionAssignment_8 ) )
            // InternalWeebADoodle.g:1436:2: ( rule__SceneObject__PositionAssignment_8 )
            {
             before(grammarAccess.getSceneObjectAccess().getPositionAssignment_8()); 
            // InternalWeebADoodle.g:1437:2: ( rule__SceneObject__PositionAssignment_8 )
            // InternalWeebADoodle.g:1437:3: rule__SceneObject__PositionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__PositionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSceneObjectAccess().getPositionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__8__Impl"


    // $ANTLR start "rule__SceneObject__Group__9"
    // InternalWeebADoodle.g:1445:1: rule__SceneObject__Group__9 : rule__SceneObject__Group__9__Impl rule__SceneObject__Group__10 ;
    public final void rule__SceneObject__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1449:1: ( rule__SceneObject__Group__9__Impl rule__SceneObject__Group__10 )
            // InternalWeebADoodle.g:1450:2: rule__SceneObject__Group__9__Impl rule__SceneObject__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__SceneObject__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__9"


    // $ANTLR start "rule__SceneObject__Group__9__Impl"
    // InternalWeebADoodle.g:1457:1: rule__SceneObject__Group__9__Impl : ( ';' ) ;
    public final void rule__SceneObject__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1461:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1462:1: ( ';' )
            {
            // InternalWeebADoodle.g:1462:1: ( ';' )
            // InternalWeebADoodle.g:1463:2: ';'
            {
             before(grammarAccess.getSceneObjectAccess().getSemicolonKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getSemicolonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__9__Impl"


    // $ANTLR start "rule__SceneObject__Group__10"
    // InternalWeebADoodle.g:1472:1: rule__SceneObject__Group__10 : rule__SceneObject__Group__10__Impl rule__SceneObject__Group__11 ;
    public final void rule__SceneObject__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1476:1: ( rule__SceneObject__Group__10__Impl rule__SceneObject__Group__11 )
            // InternalWeebADoodle.g:1477:2: rule__SceneObject__Group__10__Impl rule__SceneObject__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__SceneObject__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__10"


    // $ANTLR start "rule__SceneObject__Group__10__Impl"
    // InternalWeebADoodle.g:1484:1: rule__SceneObject__Group__10__Impl : ( 'description:' ) ;
    public final void rule__SceneObject__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1488:1: ( ( 'description:' ) )
            // InternalWeebADoodle.g:1489:1: ( 'description:' )
            {
            // InternalWeebADoodle.g:1489:1: ( 'description:' )
            // InternalWeebADoodle.g:1490:2: 'description:'
            {
             before(grammarAccess.getSceneObjectAccess().getDescriptionKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getDescriptionKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__10__Impl"


    // $ANTLR start "rule__SceneObject__Group__11"
    // InternalWeebADoodle.g:1499:1: rule__SceneObject__Group__11 : rule__SceneObject__Group__11__Impl rule__SceneObject__Group__12 ;
    public final void rule__SceneObject__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1503:1: ( rule__SceneObject__Group__11__Impl rule__SceneObject__Group__12 )
            // InternalWeebADoodle.g:1504:2: rule__SceneObject__Group__11__Impl rule__SceneObject__Group__12
            {
            pushFollow(FOLLOW_11);
            rule__SceneObject__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__11"


    // $ANTLR start "rule__SceneObject__Group__11__Impl"
    // InternalWeebADoodle.g:1511:1: rule__SceneObject__Group__11__Impl : ( ( rule__SceneObject__DescriptionAssignment_11 ) ) ;
    public final void rule__SceneObject__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1515:1: ( ( ( rule__SceneObject__DescriptionAssignment_11 ) ) )
            // InternalWeebADoodle.g:1516:1: ( ( rule__SceneObject__DescriptionAssignment_11 ) )
            {
            // InternalWeebADoodle.g:1516:1: ( ( rule__SceneObject__DescriptionAssignment_11 ) )
            // InternalWeebADoodle.g:1517:2: ( rule__SceneObject__DescriptionAssignment_11 )
            {
             before(grammarAccess.getSceneObjectAccess().getDescriptionAssignment_11()); 
            // InternalWeebADoodle.g:1518:2: ( rule__SceneObject__DescriptionAssignment_11 )
            // InternalWeebADoodle.g:1518:3: rule__SceneObject__DescriptionAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__DescriptionAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSceneObjectAccess().getDescriptionAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__11__Impl"


    // $ANTLR start "rule__SceneObject__Group__12"
    // InternalWeebADoodle.g:1526:1: rule__SceneObject__Group__12 : rule__SceneObject__Group__12__Impl rule__SceneObject__Group__13 ;
    public final void rule__SceneObject__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1530:1: ( rule__SceneObject__Group__12__Impl rule__SceneObject__Group__13 )
            // InternalWeebADoodle.g:1531:2: rule__SceneObject__Group__12__Impl rule__SceneObject__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__SceneObject__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__12"


    // $ANTLR start "rule__SceneObject__Group__12__Impl"
    // InternalWeebADoodle.g:1538:1: rule__SceneObject__Group__12__Impl : ( ';' ) ;
    public final void rule__SceneObject__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1542:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1543:1: ( ';' )
            {
            // InternalWeebADoodle.g:1543:1: ( ';' )
            // InternalWeebADoodle.g:1544:2: ';'
            {
             before(grammarAccess.getSceneObjectAccess().getSemicolonKeyword_12()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getSemicolonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__12__Impl"


    // $ANTLR start "rule__SceneObject__Group__13"
    // InternalWeebADoodle.g:1553:1: rule__SceneObject__Group__13 : rule__SceneObject__Group__13__Impl ;
    public final void rule__SceneObject__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1557:1: ( rule__SceneObject__Group__13__Impl )
            // InternalWeebADoodle.g:1558:2: rule__SceneObject__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__13"


    // $ANTLR start "rule__SceneObject__Group__13__Impl"
    // InternalWeebADoodle.g:1564:1: rule__SceneObject__Group__13__Impl : ( '}' ) ;
    public final void rule__SceneObject__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1568:1: ( ( '}' ) )
            // InternalWeebADoodle.g:1569:1: ( '}' )
            {
            // InternalWeebADoodle.g:1569:1: ( '}' )
            // InternalWeebADoodle.g:1570:2: '}'
            {
             before(grammarAccess.getSceneObjectAccess().getRightCurlyBracketKeyword_13()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__Group__13__Impl"


    // $ANTLR start "rule__Setting__Group__0"
    // InternalWeebADoodle.g:1580:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1584:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // InternalWeebADoodle.g:1585:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Setting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__0"


    // $ANTLR start "rule__Setting__Group__0__Impl"
    // InternalWeebADoodle.g:1592:1: rule__Setting__Group__0__Impl : ( 'setting' ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1596:1: ( ( 'setting' ) )
            // InternalWeebADoodle.g:1597:1: ( 'setting' )
            {
            // InternalWeebADoodle.g:1597:1: ( 'setting' )
            // InternalWeebADoodle.g:1598:2: 'setting'
            {
             before(grammarAccess.getSettingAccess().getSettingKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSettingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__0__Impl"


    // $ANTLR start "rule__Setting__Group__1"
    // InternalWeebADoodle.g:1607:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1611:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // InternalWeebADoodle.g:1612:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Setting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__1"


    // $ANTLR start "rule__Setting__Group__1__Impl"
    // InternalWeebADoodle.g:1619:1: rule__Setting__Group__1__Impl : ( '{' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1623:1: ( ( '{' ) )
            // InternalWeebADoodle.g:1624:1: ( '{' )
            {
            // InternalWeebADoodle.g:1624:1: ( '{' )
            // InternalWeebADoodle.g:1625:2: '{'
            {
             before(grammarAccess.getSettingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__1__Impl"


    // $ANTLR start "rule__Setting__Group__2"
    // InternalWeebADoodle.g:1634:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl rule__Setting__Group__3 ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1638:1: ( rule__Setting__Group__2__Impl rule__Setting__Group__3 )
            // InternalWeebADoodle.g:1639:2: rule__Setting__Group__2__Impl rule__Setting__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Setting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__2"


    // $ANTLR start "rule__Setting__Group__2__Impl"
    // InternalWeebADoodle.g:1646:1: rule__Setting__Group__2__Impl : ( 'camera_shot:' ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1650:1: ( ( 'camera_shot:' ) )
            // InternalWeebADoodle.g:1651:1: ( 'camera_shot:' )
            {
            // InternalWeebADoodle.g:1651:1: ( 'camera_shot:' )
            // InternalWeebADoodle.g:1652:2: 'camera_shot:'
            {
             before(grammarAccess.getSettingAccess().getCamera_shotKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getCamera_shotKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__2__Impl"


    // $ANTLR start "rule__Setting__Group__3"
    // InternalWeebADoodle.g:1661:1: rule__Setting__Group__3 : rule__Setting__Group__3__Impl rule__Setting__Group__4 ;
    public final void rule__Setting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1665:1: ( rule__Setting__Group__3__Impl rule__Setting__Group__4 )
            // InternalWeebADoodle.g:1666:2: rule__Setting__Group__3__Impl rule__Setting__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Setting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__3"


    // $ANTLR start "rule__Setting__Group__3__Impl"
    // InternalWeebADoodle.g:1673:1: rule__Setting__Group__3__Impl : ( ( rule__Setting__CameraShotAssignment_3 ) ) ;
    public final void rule__Setting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1677:1: ( ( ( rule__Setting__CameraShotAssignment_3 ) ) )
            // InternalWeebADoodle.g:1678:1: ( ( rule__Setting__CameraShotAssignment_3 ) )
            {
            // InternalWeebADoodle.g:1678:1: ( ( rule__Setting__CameraShotAssignment_3 ) )
            // InternalWeebADoodle.g:1679:2: ( rule__Setting__CameraShotAssignment_3 )
            {
             before(grammarAccess.getSettingAccess().getCameraShotAssignment_3()); 
            // InternalWeebADoodle.g:1680:2: ( rule__Setting__CameraShotAssignment_3 )
            // InternalWeebADoodle.g:1680:3: rule__Setting__CameraShotAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Setting__CameraShotAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getCameraShotAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__3__Impl"


    // $ANTLR start "rule__Setting__Group__4"
    // InternalWeebADoodle.g:1688:1: rule__Setting__Group__4 : rule__Setting__Group__4__Impl rule__Setting__Group__5 ;
    public final void rule__Setting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1692:1: ( rule__Setting__Group__4__Impl rule__Setting__Group__5 )
            // InternalWeebADoodle.g:1693:2: rule__Setting__Group__4__Impl rule__Setting__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Setting__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__4"


    // $ANTLR start "rule__Setting__Group__4__Impl"
    // InternalWeebADoodle.g:1700:1: rule__Setting__Group__4__Impl : ( ';' ) ;
    public final void rule__Setting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1704:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1705:1: ( ';' )
            {
            // InternalWeebADoodle.g:1705:1: ( ';' )
            // InternalWeebADoodle.g:1706:2: ';'
            {
             before(grammarAccess.getSettingAccess().getSemicolonKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__4__Impl"


    // $ANTLR start "rule__Setting__Group__5"
    // InternalWeebADoodle.g:1715:1: rule__Setting__Group__5 : rule__Setting__Group__5__Impl rule__Setting__Group__6 ;
    public final void rule__Setting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1719:1: ( rule__Setting__Group__5__Impl rule__Setting__Group__6 )
            // InternalWeebADoodle.g:1720:2: rule__Setting__Group__5__Impl rule__Setting__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Setting__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__5"


    // $ANTLR start "rule__Setting__Group__5__Impl"
    // InternalWeebADoodle.g:1727:1: rule__Setting__Group__5__Impl : ( 'camera_angle:' ) ;
    public final void rule__Setting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1731:1: ( ( 'camera_angle:' ) )
            // InternalWeebADoodle.g:1732:1: ( 'camera_angle:' )
            {
            // InternalWeebADoodle.g:1732:1: ( 'camera_angle:' )
            // InternalWeebADoodle.g:1733:2: 'camera_angle:'
            {
             before(grammarAccess.getSettingAccess().getCamera_angleKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getCamera_angleKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__5__Impl"


    // $ANTLR start "rule__Setting__Group__6"
    // InternalWeebADoodle.g:1742:1: rule__Setting__Group__6 : rule__Setting__Group__6__Impl rule__Setting__Group__7 ;
    public final void rule__Setting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1746:1: ( rule__Setting__Group__6__Impl rule__Setting__Group__7 )
            // InternalWeebADoodle.g:1747:2: rule__Setting__Group__6__Impl rule__Setting__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Setting__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__6"


    // $ANTLR start "rule__Setting__Group__6__Impl"
    // InternalWeebADoodle.g:1754:1: rule__Setting__Group__6__Impl : ( ( rule__Setting__CameraAngleAssignment_6 ) ) ;
    public final void rule__Setting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1758:1: ( ( ( rule__Setting__CameraAngleAssignment_6 ) ) )
            // InternalWeebADoodle.g:1759:1: ( ( rule__Setting__CameraAngleAssignment_6 ) )
            {
            // InternalWeebADoodle.g:1759:1: ( ( rule__Setting__CameraAngleAssignment_6 ) )
            // InternalWeebADoodle.g:1760:2: ( rule__Setting__CameraAngleAssignment_6 )
            {
             before(grammarAccess.getSettingAccess().getCameraAngleAssignment_6()); 
            // InternalWeebADoodle.g:1761:2: ( rule__Setting__CameraAngleAssignment_6 )
            // InternalWeebADoodle.g:1761:3: rule__Setting__CameraAngleAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Setting__CameraAngleAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getCameraAngleAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__6__Impl"


    // $ANTLR start "rule__Setting__Group__7"
    // InternalWeebADoodle.g:1769:1: rule__Setting__Group__7 : rule__Setting__Group__7__Impl rule__Setting__Group__8 ;
    public final void rule__Setting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1773:1: ( rule__Setting__Group__7__Impl rule__Setting__Group__8 )
            // InternalWeebADoodle.g:1774:2: rule__Setting__Group__7__Impl rule__Setting__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__Setting__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__7"


    // $ANTLR start "rule__Setting__Group__7__Impl"
    // InternalWeebADoodle.g:1781:1: rule__Setting__Group__7__Impl : ( ';' ) ;
    public final void rule__Setting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1785:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1786:1: ( ';' )
            {
            // InternalWeebADoodle.g:1786:1: ( ';' )
            // InternalWeebADoodle.g:1787:2: ';'
            {
             before(grammarAccess.getSettingAccess().getSemicolonKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__7__Impl"


    // $ANTLR start "rule__Setting__Group__8"
    // InternalWeebADoodle.g:1796:1: rule__Setting__Group__8 : rule__Setting__Group__8__Impl rule__Setting__Group__9 ;
    public final void rule__Setting__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1800:1: ( rule__Setting__Group__8__Impl rule__Setting__Group__9 )
            // InternalWeebADoodle.g:1801:2: rule__Setting__Group__8__Impl rule__Setting__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Setting__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__8"


    // $ANTLR start "rule__Setting__Group__8__Impl"
    // InternalWeebADoodle.g:1808:1: rule__Setting__Group__8__Impl : ( 'lighting:' ) ;
    public final void rule__Setting__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1812:1: ( ( 'lighting:' ) )
            // InternalWeebADoodle.g:1813:1: ( 'lighting:' )
            {
            // InternalWeebADoodle.g:1813:1: ( 'lighting:' )
            // InternalWeebADoodle.g:1814:2: 'lighting:'
            {
             before(grammarAccess.getSettingAccess().getLightingKeyword_8()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getLightingKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__8__Impl"


    // $ANTLR start "rule__Setting__Group__9"
    // InternalWeebADoodle.g:1823:1: rule__Setting__Group__9 : rule__Setting__Group__9__Impl rule__Setting__Group__10 ;
    public final void rule__Setting__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1827:1: ( rule__Setting__Group__9__Impl rule__Setting__Group__10 )
            // InternalWeebADoodle.g:1828:2: rule__Setting__Group__9__Impl rule__Setting__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__Setting__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__9"


    // $ANTLR start "rule__Setting__Group__9__Impl"
    // InternalWeebADoodle.g:1835:1: rule__Setting__Group__9__Impl : ( ( rule__Setting__LightingAssignment_9 ) ) ;
    public final void rule__Setting__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1839:1: ( ( ( rule__Setting__LightingAssignment_9 ) ) )
            // InternalWeebADoodle.g:1840:1: ( ( rule__Setting__LightingAssignment_9 ) )
            {
            // InternalWeebADoodle.g:1840:1: ( ( rule__Setting__LightingAssignment_9 ) )
            // InternalWeebADoodle.g:1841:2: ( rule__Setting__LightingAssignment_9 )
            {
             before(grammarAccess.getSettingAccess().getLightingAssignment_9()); 
            // InternalWeebADoodle.g:1842:2: ( rule__Setting__LightingAssignment_9 )
            // InternalWeebADoodle.g:1842:3: rule__Setting__LightingAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Setting__LightingAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getLightingAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__9__Impl"


    // $ANTLR start "rule__Setting__Group__10"
    // InternalWeebADoodle.g:1850:1: rule__Setting__Group__10 : rule__Setting__Group__10__Impl rule__Setting__Group__11 ;
    public final void rule__Setting__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1854:1: ( rule__Setting__Group__10__Impl rule__Setting__Group__11 )
            // InternalWeebADoodle.g:1855:2: rule__Setting__Group__10__Impl rule__Setting__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Setting__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__10"


    // $ANTLR start "rule__Setting__Group__10__Impl"
    // InternalWeebADoodle.g:1862:1: rule__Setting__Group__10__Impl : ( ';' ) ;
    public final void rule__Setting__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1866:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1867:1: ( ';' )
            {
            // InternalWeebADoodle.g:1867:1: ( ';' )
            // InternalWeebADoodle.g:1868:2: ';'
            {
             before(grammarAccess.getSettingAccess().getSemicolonKeyword_10()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__10__Impl"


    // $ANTLR start "rule__Setting__Group__11"
    // InternalWeebADoodle.g:1877:1: rule__Setting__Group__11 : rule__Setting__Group__11__Impl rule__Setting__Group__12 ;
    public final void rule__Setting__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1881:1: ( rule__Setting__Group__11__Impl rule__Setting__Group__12 )
            // InternalWeebADoodle.g:1882:2: rule__Setting__Group__11__Impl rule__Setting__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__Setting__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__11"


    // $ANTLR start "rule__Setting__Group__11__Impl"
    // InternalWeebADoodle.g:1889:1: rule__Setting__Group__11__Impl : ( 'description:' ) ;
    public final void rule__Setting__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1893:1: ( ( 'description:' ) )
            // InternalWeebADoodle.g:1894:1: ( 'description:' )
            {
            // InternalWeebADoodle.g:1894:1: ( 'description:' )
            // InternalWeebADoodle.g:1895:2: 'description:'
            {
             before(grammarAccess.getSettingAccess().getDescriptionKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getDescriptionKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__11__Impl"


    // $ANTLR start "rule__Setting__Group__12"
    // InternalWeebADoodle.g:1904:1: rule__Setting__Group__12 : rule__Setting__Group__12__Impl rule__Setting__Group__13 ;
    public final void rule__Setting__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1908:1: ( rule__Setting__Group__12__Impl rule__Setting__Group__13 )
            // InternalWeebADoodle.g:1909:2: rule__Setting__Group__12__Impl rule__Setting__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__Setting__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__12"


    // $ANTLR start "rule__Setting__Group__12__Impl"
    // InternalWeebADoodle.g:1916:1: rule__Setting__Group__12__Impl : ( ( rule__Setting__DescriptionAssignment_12 ) ) ;
    public final void rule__Setting__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1920:1: ( ( ( rule__Setting__DescriptionAssignment_12 ) ) )
            // InternalWeebADoodle.g:1921:1: ( ( rule__Setting__DescriptionAssignment_12 ) )
            {
            // InternalWeebADoodle.g:1921:1: ( ( rule__Setting__DescriptionAssignment_12 ) )
            // InternalWeebADoodle.g:1922:2: ( rule__Setting__DescriptionAssignment_12 )
            {
             before(grammarAccess.getSettingAccess().getDescriptionAssignment_12()); 
            // InternalWeebADoodle.g:1923:2: ( rule__Setting__DescriptionAssignment_12 )
            // InternalWeebADoodle.g:1923:3: rule__Setting__DescriptionAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Setting__DescriptionAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getDescriptionAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__12__Impl"


    // $ANTLR start "rule__Setting__Group__13"
    // InternalWeebADoodle.g:1931:1: rule__Setting__Group__13 : rule__Setting__Group__13__Impl rule__Setting__Group__14 ;
    public final void rule__Setting__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1935:1: ( rule__Setting__Group__13__Impl rule__Setting__Group__14 )
            // InternalWeebADoodle.g:1936:2: rule__Setting__Group__13__Impl rule__Setting__Group__14
            {
            pushFollow(FOLLOW_5);
            rule__Setting__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Setting__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__13"


    // $ANTLR start "rule__Setting__Group__13__Impl"
    // InternalWeebADoodle.g:1943:1: rule__Setting__Group__13__Impl : ( ';' ) ;
    public final void rule__Setting__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1947:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1948:1: ( ';' )
            {
            // InternalWeebADoodle.g:1948:1: ( ';' )
            // InternalWeebADoodle.g:1949:2: ';'
            {
             before(grammarAccess.getSettingAccess().getSemicolonKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getSemicolonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__13__Impl"


    // $ANTLR start "rule__Setting__Group__14"
    // InternalWeebADoodle.g:1958:1: rule__Setting__Group__14 : rule__Setting__Group__14__Impl ;
    public final void rule__Setting__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1962:1: ( rule__Setting__Group__14__Impl )
            // InternalWeebADoodle.g:1963:2: rule__Setting__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Setting__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__14"


    // $ANTLR start "rule__Setting__Group__14__Impl"
    // InternalWeebADoodle.g:1969:1: rule__Setting__Group__14__Impl : ( '}' ) ;
    public final void rule__Setting__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1973:1: ( ( '}' ) )
            // InternalWeebADoodle.g:1974:1: ( '}' )
            {
            // InternalWeebADoodle.g:1974:1: ( '}' )
            // InternalWeebADoodle.g:1975:2: '}'
            {
             before(grammarAccess.getSettingAccess().getRightCurlyBracketKeyword_14()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__Group__14__Impl"


    // $ANTLR start "rule__Direction__Group__0"
    // InternalWeebADoodle.g:1985:1: rule__Direction__Group__0 : rule__Direction__Group__0__Impl rule__Direction__Group__1 ;
    public final void rule__Direction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1989:1: ( rule__Direction__Group__0__Impl rule__Direction__Group__1 )
            // InternalWeebADoodle.g:1990:2: rule__Direction__Group__0__Impl rule__Direction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Direction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__0"


    // $ANTLR start "rule__Direction__Group__0__Impl"
    // InternalWeebADoodle.g:1997:1: rule__Direction__Group__0__Impl : ( 'direction' ) ;
    public final void rule__Direction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2001:1: ( ( 'direction' ) )
            // InternalWeebADoodle.g:2002:1: ( 'direction' )
            {
            // InternalWeebADoodle.g:2002:1: ( 'direction' )
            // InternalWeebADoodle.g:2003:2: 'direction'
            {
             before(grammarAccess.getDirectionAccess().getDirectionKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getDirectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__0__Impl"


    // $ANTLR start "rule__Direction__Group__1"
    // InternalWeebADoodle.g:2012:1: rule__Direction__Group__1 : rule__Direction__Group__1__Impl rule__Direction__Group__2 ;
    public final void rule__Direction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2016:1: ( rule__Direction__Group__1__Impl rule__Direction__Group__2 )
            // InternalWeebADoodle.g:2017:2: rule__Direction__Group__1__Impl rule__Direction__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Direction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__1"


    // $ANTLR start "rule__Direction__Group__1__Impl"
    // InternalWeebADoodle.g:2024:1: rule__Direction__Group__1__Impl : ( '{' ) ;
    public final void rule__Direction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2028:1: ( ( '{' ) )
            // InternalWeebADoodle.g:2029:1: ( '{' )
            {
            // InternalWeebADoodle.g:2029:1: ( '{' )
            // InternalWeebADoodle.g:2030:2: '{'
            {
             before(grammarAccess.getDirectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__1__Impl"


    // $ANTLR start "rule__Direction__Group__2"
    // InternalWeebADoodle.g:2039:1: rule__Direction__Group__2 : rule__Direction__Group__2__Impl rule__Direction__Group__3 ;
    public final void rule__Direction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2043:1: ( rule__Direction__Group__2__Impl rule__Direction__Group__3 )
            // InternalWeebADoodle.g:2044:2: rule__Direction__Group__2__Impl rule__Direction__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Direction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__2"


    // $ANTLR start "rule__Direction__Group__2__Impl"
    // InternalWeebADoodle.g:2051:1: rule__Direction__Group__2__Impl : ( ( rule__Direction__Alternatives_2 ) ) ;
    public final void rule__Direction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2055:1: ( ( ( rule__Direction__Alternatives_2 ) ) )
            // InternalWeebADoodle.g:2056:1: ( ( rule__Direction__Alternatives_2 ) )
            {
            // InternalWeebADoodle.g:2056:1: ( ( rule__Direction__Alternatives_2 ) )
            // InternalWeebADoodle.g:2057:2: ( rule__Direction__Alternatives_2 )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives_2()); 
            // InternalWeebADoodle.g:2058:2: ( rule__Direction__Alternatives_2 )
            // InternalWeebADoodle.g:2058:3: rule__Direction__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__2__Impl"


    // $ANTLR start "rule__Direction__Group__3"
    // InternalWeebADoodle.g:2066:1: rule__Direction__Group__3 : rule__Direction__Group__3__Impl rule__Direction__Group__4 ;
    public final void rule__Direction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2070:1: ( rule__Direction__Group__3__Impl rule__Direction__Group__4 )
            // InternalWeebADoodle.g:2071:2: rule__Direction__Group__3__Impl rule__Direction__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Direction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__3"


    // $ANTLR start "rule__Direction__Group__3__Impl"
    // InternalWeebADoodle.g:2078:1: rule__Direction__Group__3__Impl : ( 'movement:' ) ;
    public final void rule__Direction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2082:1: ( ( 'movement:' ) )
            // InternalWeebADoodle.g:2083:1: ( 'movement:' )
            {
            // InternalWeebADoodle.g:2083:1: ( 'movement:' )
            // InternalWeebADoodle.g:2084:2: 'movement:'
            {
             before(grammarAccess.getDirectionAccess().getMovementKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getMovementKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__3__Impl"


    // $ANTLR start "rule__Direction__Group__4"
    // InternalWeebADoodle.g:2093:1: rule__Direction__Group__4 : rule__Direction__Group__4__Impl rule__Direction__Group__5 ;
    public final void rule__Direction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2097:1: ( rule__Direction__Group__4__Impl rule__Direction__Group__5 )
            // InternalWeebADoodle.g:2098:2: rule__Direction__Group__4__Impl rule__Direction__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Direction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__4"


    // $ANTLR start "rule__Direction__Group__4__Impl"
    // InternalWeebADoodle.g:2105:1: rule__Direction__Group__4__Impl : ( ( rule__Direction__MovementAssignment_4 ) ) ;
    public final void rule__Direction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2109:1: ( ( ( rule__Direction__MovementAssignment_4 ) ) )
            // InternalWeebADoodle.g:2110:1: ( ( rule__Direction__MovementAssignment_4 ) )
            {
            // InternalWeebADoodle.g:2110:1: ( ( rule__Direction__MovementAssignment_4 ) )
            // InternalWeebADoodle.g:2111:2: ( rule__Direction__MovementAssignment_4 )
            {
             before(grammarAccess.getDirectionAccess().getMovementAssignment_4()); 
            // InternalWeebADoodle.g:2112:2: ( rule__Direction__MovementAssignment_4 )
            // InternalWeebADoodle.g:2112:3: rule__Direction__MovementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Direction__MovementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getMovementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__4__Impl"


    // $ANTLR start "rule__Direction__Group__5"
    // InternalWeebADoodle.g:2120:1: rule__Direction__Group__5 : rule__Direction__Group__5__Impl rule__Direction__Group__6 ;
    public final void rule__Direction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2124:1: ( rule__Direction__Group__5__Impl rule__Direction__Group__6 )
            // InternalWeebADoodle.g:2125:2: rule__Direction__Group__5__Impl rule__Direction__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Direction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__5"


    // $ANTLR start "rule__Direction__Group__5__Impl"
    // InternalWeebADoodle.g:2132:1: rule__Direction__Group__5__Impl : ( 'description:' ) ;
    public final void rule__Direction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2136:1: ( ( 'description:' ) )
            // InternalWeebADoodle.g:2137:1: ( 'description:' )
            {
            // InternalWeebADoodle.g:2137:1: ( 'description:' )
            // InternalWeebADoodle.g:2138:2: 'description:'
            {
             before(grammarAccess.getDirectionAccess().getDescriptionKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getDescriptionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__5__Impl"


    // $ANTLR start "rule__Direction__Group__6"
    // InternalWeebADoodle.g:2147:1: rule__Direction__Group__6 : rule__Direction__Group__6__Impl rule__Direction__Group__7 ;
    public final void rule__Direction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2151:1: ( rule__Direction__Group__6__Impl rule__Direction__Group__7 )
            // InternalWeebADoodle.g:2152:2: rule__Direction__Group__6__Impl rule__Direction__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Direction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__6"


    // $ANTLR start "rule__Direction__Group__6__Impl"
    // InternalWeebADoodle.g:2159:1: rule__Direction__Group__6__Impl : ( ( rule__Direction__DescriptionAssignment_6 ) ) ;
    public final void rule__Direction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2163:1: ( ( ( rule__Direction__DescriptionAssignment_6 ) ) )
            // InternalWeebADoodle.g:2164:1: ( ( rule__Direction__DescriptionAssignment_6 ) )
            {
            // InternalWeebADoodle.g:2164:1: ( ( rule__Direction__DescriptionAssignment_6 ) )
            // InternalWeebADoodle.g:2165:2: ( rule__Direction__DescriptionAssignment_6 )
            {
             before(grammarAccess.getDirectionAccess().getDescriptionAssignment_6()); 
            // InternalWeebADoodle.g:2166:2: ( rule__Direction__DescriptionAssignment_6 )
            // InternalWeebADoodle.g:2166:3: rule__Direction__DescriptionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Direction__DescriptionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getDescriptionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__6__Impl"


    // $ANTLR start "rule__Direction__Group__7"
    // InternalWeebADoodle.g:2174:1: rule__Direction__Group__7 : rule__Direction__Group__7__Impl rule__Direction__Group__8 ;
    public final void rule__Direction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2178:1: ( rule__Direction__Group__7__Impl rule__Direction__Group__8 )
            // InternalWeebADoodle.g:2179:2: rule__Direction__Group__7__Impl rule__Direction__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Direction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__7"


    // $ANTLR start "rule__Direction__Group__7__Impl"
    // InternalWeebADoodle.g:2186:1: rule__Direction__Group__7__Impl : ( ';' ) ;
    public final void rule__Direction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2190:1: ( ( ';' ) )
            // InternalWeebADoodle.g:2191:1: ( ';' )
            {
            // InternalWeebADoodle.g:2191:1: ( ';' )
            // InternalWeebADoodle.g:2192:2: ';'
            {
             before(grammarAccess.getDirectionAccess().getSemicolonKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__7__Impl"


    // $ANTLR start "rule__Direction__Group__8"
    // InternalWeebADoodle.g:2201:1: rule__Direction__Group__8 : rule__Direction__Group__8__Impl ;
    public final void rule__Direction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2205:1: ( rule__Direction__Group__8__Impl )
            // InternalWeebADoodle.g:2206:2: rule__Direction__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__8"


    // $ANTLR start "rule__Direction__Group__8__Impl"
    // InternalWeebADoodle.g:2212:1: rule__Direction__Group__8__Impl : ( '}' ) ;
    public final void rule__Direction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2216:1: ( ( '}' ) )
            // InternalWeebADoodle.g:2217:1: ( '}' )
            {
            // InternalWeebADoodle.g:2217:1: ( '}' )
            // InternalWeebADoodle.g:2218:2: '}'
            {
             before(grammarAccess.getDirectionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group__8__Impl"


    // $ANTLR start "rule__Direction__Group_2_0__0"
    // InternalWeebADoodle.g:2228:1: rule__Direction__Group_2_0__0 : rule__Direction__Group_2_0__0__Impl rule__Direction__Group_2_0__1 ;
    public final void rule__Direction__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2232:1: ( rule__Direction__Group_2_0__0__Impl rule__Direction__Group_2_0__1 )
            // InternalWeebADoodle.g:2233:2: rule__Direction__Group_2_0__0__Impl rule__Direction__Group_2_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Direction__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direction__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group_2_0__0"


    // $ANTLR start "rule__Direction__Group_2_0__0__Impl"
    // InternalWeebADoodle.g:2240:1: rule__Direction__Group_2_0__0__Impl : ( 'character' ) ;
    public final void rule__Direction__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2244:1: ( ( 'character' ) )
            // InternalWeebADoodle.g:2245:1: ( 'character' )
            {
            // InternalWeebADoodle.g:2245:1: ( 'character' )
            // InternalWeebADoodle.g:2246:2: 'character'
            {
             before(grammarAccess.getDirectionAccess().getCharacterKeyword_2_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getCharacterKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group_2_0__0__Impl"


    // $ANTLR start "rule__Direction__Group_2_0__1"
    // InternalWeebADoodle.g:2255:1: rule__Direction__Group_2_0__1 : rule__Direction__Group_2_0__1__Impl ;
    public final void rule__Direction__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2259:1: ( rule__Direction__Group_2_0__1__Impl )
            // InternalWeebADoodle.g:2260:2: rule__Direction__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group_2_0__1"


    // $ANTLR start "rule__Direction__Group_2_0__1__Impl"
    // InternalWeebADoodle.g:2266:1: rule__Direction__Group_2_0__1__Impl : ( ( rule__Direction__TargetCharacterAssignment_2_0_1 ) ) ;
    public final void rule__Direction__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2270:1: ( ( ( rule__Direction__TargetCharacterAssignment_2_0_1 ) ) )
            // InternalWeebADoodle.g:2271:1: ( ( rule__Direction__TargetCharacterAssignment_2_0_1 ) )
            {
            // InternalWeebADoodle.g:2271:1: ( ( rule__Direction__TargetCharacterAssignment_2_0_1 ) )
            // InternalWeebADoodle.g:2272:2: ( rule__Direction__TargetCharacterAssignment_2_0_1 )
            {
             before(grammarAccess.getDirectionAccess().getTargetCharacterAssignment_2_0_1()); 
            // InternalWeebADoodle.g:2273:2: ( rule__Direction__TargetCharacterAssignment_2_0_1 )
            // InternalWeebADoodle.g:2273:3: rule__Direction__TargetCharacterAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Direction__TargetCharacterAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getTargetCharacterAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group_2_0__1__Impl"


    // $ANTLR start "rule__Direction__Group_2_1__0"
    // InternalWeebADoodle.g:2282:1: rule__Direction__Group_2_1__0 : rule__Direction__Group_2_1__0__Impl rule__Direction__Group_2_1__1 ;
    public final void rule__Direction__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2286:1: ( rule__Direction__Group_2_1__0__Impl rule__Direction__Group_2_1__1 )
            // InternalWeebADoodle.g:2287:2: rule__Direction__Group_2_1__0__Impl rule__Direction__Group_2_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Direction__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Direction__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group_2_1__0"


    // $ANTLR start "rule__Direction__Group_2_1__0__Impl"
    // InternalWeebADoodle.g:2294:1: rule__Direction__Group_2_1__0__Impl : ( 'object' ) ;
    public final void rule__Direction__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2298:1: ( ( 'object' ) )
            // InternalWeebADoodle.g:2299:1: ( 'object' )
            {
            // InternalWeebADoodle.g:2299:1: ( 'object' )
            // InternalWeebADoodle.g:2300:2: 'object'
            {
             before(grammarAccess.getDirectionAccess().getObjectKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getObjectKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group_2_1__0__Impl"


    // $ANTLR start "rule__Direction__Group_2_1__1"
    // InternalWeebADoodle.g:2309:1: rule__Direction__Group_2_1__1 : rule__Direction__Group_2_1__1__Impl ;
    public final void rule__Direction__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2313:1: ( rule__Direction__Group_2_1__1__Impl )
            // InternalWeebADoodle.g:2314:2: rule__Direction__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group_2_1__1"


    // $ANTLR start "rule__Direction__Group_2_1__1__Impl"
    // InternalWeebADoodle.g:2320:1: rule__Direction__Group_2_1__1__Impl : ( ( rule__Direction__TargetObjectAssignment_2_1_1 ) ) ;
    public final void rule__Direction__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2324:1: ( ( ( rule__Direction__TargetObjectAssignment_2_1_1 ) ) )
            // InternalWeebADoodle.g:2325:1: ( ( rule__Direction__TargetObjectAssignment_2_1_1 ) )
            {
            // InternalWeebADoodle.g:2325:1: ( ( rule__Direction__TargetObjectAssignment_2_1_1 ) )
            // InternalWeebADoodle.g:2326:2: ( rule__Direction__TargetObjectAssignment_2_1_1 )
            {
             before(grammarAccess.getDirectionAccess().getTargetObjectAssignment_2_1_1()); 
            // InternalWeebADoodle.g:2327:2: ( rule__Direction__TargetObjectAssignment_2_1_1 )
            // InternalWeebADoodle.g:2327:3: rule__Direction__TargetObjectAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Direction__TargetObjectAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getTargetObjectAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Group_2_1__1__Impl"


    // $ANTLR start "rule__Storyboard__ScenesAssignment_2"
    // InternalWeebADoodle.g:2336:1: rule__Storyboard__ScenesAssignment_2 : ( ruleScene ) ;
    public final void rule__Storyboard__ScenesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2340:1: ( ( ruleScene ) )
            // InternalWeebADoodle.g:2341:2: ( ruleScene )
            {
            // InternalWeebADoodle.g:2341:2: ( ruleScene )
            // InternalWeebADoodle.g:2342:3: ruleScene
            {
             before(grammarAccess.getStoryboardAccess().getScenesSceneParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleScene();

            state._fsp--;

             after(grammarAccess.getStoryboardAccess().getScenesSceneParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Storyboard__ScenesAssignment_2"


    // $ANTLR start "rule__Scene__NameAssignment_3"
    // InternalWeebADoodle.g:2351:1: rule__Scene__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2355:1: ( ( RULE_ID ) )
            // InternalWeebADoodle.g:2356:2: ( RULE_ID )
            {
            // InternalWeebADoodle.g:2356:2: ( RULE_ID )
            // InternalWeebADoodle.g:2357:3: RULE_ID
            {
             before(grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__NameAssignment_3"


    // $ANTLR start "rule__Scene__ValueAssignment_5"
    // InternalWeebADoodle.g:2366:1: rule__Scene__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Scene__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2370:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2371:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2371:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2372:3: RULE_STRING
            {
             before(grammarAccess.getSceneAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__ValueAssignment_5"


    // $ANTLR start "rule__Scene__BackgroundAssignment_8"
    // InternalWeebADoodle.g:2381:1: rule__Scene__BackgroundAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Scene__BackgroundAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2385:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2386:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2386:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2387:3: RULE_STRING
            {
             before(grammarAccess.getSceneAccess().getBackgroundSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getBackgroundSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__BackgroundAssignment_8"


    // $ANTLR start "rule__Scene__CharactersAssignment_10"
    // InternalWeebADoodle.g:2396:1: rule__Scene__CharactersAssignment_10 : ( ruleCharacter ) ;
    public final void rule__Scene__CharactersAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2400:1: ( ( ruleCharacter ) )
            // InternalWeebADoodle.g:2401:2: ( ruleCharacter )
            {
            // InternalWeebADoodle.g:2401:2: ( ruleCharacter )
            // InternalWeebADoodle.g:2402:3: ruleCharacter
            {
             before(grammarAccess.getSceneAccess().getCharactersCharacterParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleCharacter();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getCharactersCharacterParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__CharactersAssignment_10"


    // $ANTLR start "rule__Scene__ObjectsAssignment_11"
    // InternalWeebADoodle.g:2411:1: rule__Scene__ObjectsAssignment_11 : ( ruleSceneObject ) ;
    public final void rule__Scene__ObjectsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2415:1: ( ( ruleSceneObject ) )
            // InternalWeebADoodle.g:2416:2: ( ruleSceneObject )
            {
            // InternalWeebADoodle.g:2416:2: ( ruleSceneObject )
            // InternalWeebADoodle.g:2417:3: ruleSceneObject
            {
             before(grammarAccess.getSceneAccess().getObjectsSceneObjectParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleSceneObject();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getObjectsSceneObjectParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__ObjectsAssignment_11"


    // $ANTLR start "rule__Scene__SettingsAssignment_12"
    // InternalWeebADoodle.g:2426:1: rule__Scene__SettingsAssignment_12 : ( ruleSetting ) ;
    public final void rule__Scene__SettingsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2430:1: ( ( ruleSetting ) )
            // InternalWeebADoodle.g:2431:2: ( ruleSetting )
            {
            // InternalWeebADoodle.g:2431:2: ( ruleSetting )
            // InternalWeebADoodle.g:2432:3: ruleSetting
            {
             before(grammarAccess.getSceneAccess().getSettingsSettingParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getSettingsSettingParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__SettingsAssignment_12"


    // $ANTLR start "rule__Scene__DirectionsAssignment_13"
    // InternalWeebADoodle.g:2441:1: rule__Scene__DirectionsAssignment_13 : ( ruleDirection ) ;
    public final void rule__Scene__DirectionsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2445:1: ( ( ruleDirection ) )
            // InternalWeebADoodle.g:2446:2: ( ruleDirection )
            {
            // InternalWeebADoodle.g:2446:2: ( ruleDirection )
            // InternalWeebADoodle.g:2447:3: ruleDirection
            {
             before(grammarAccess.getSceneAccess().getDirectionsDirectionParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getDirectionsDirectionParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__DirectionsAssignment_13"


    // $ANTLR start "rule__Character__NameAssignment_3"
    // InternalWeebADoodle.g:2456:1: rule__Character__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Character__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2460:1: ( ( RULE_ID ) )
            // InternalWeebADoodle.g:2461:2: ( RULE_ID )
            {
            // InternalWeebADoodle.g:2461:2: ( RULE_ID )
            // InternalWeebADoodle.g:2462:3: RULE_ID
            {
             before(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__NameAssignment_3"


    // $ANTLR start "rule__Character__ValueAssignment_5"
    // InternalWeebADoodle.g:2471:1: rule__Character__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Character__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2475:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2476:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2476:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2477:3: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__ValueAssignment_5"


    // $ANTLR start "rule__Character__ActionAssignment_8"
    // InternalWeebADoodle.g:2486:1: rule__Character__ActionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__Character__ActionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2490:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2491:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2491:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2492:3: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getActionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getActionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__ActionAssignment_8"


    // $ANTLR start "rule__Character__DialogueAssignment_11"
    // InternalWeebADoodle.g:2501:1: rule__Character__DialogueAssignment_11 : ( RULE_STRING ) ;
    public final void rule__Character__DialogueAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2505:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2506:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2506:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2507:3: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getDialogueSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getDialogueSTRINGTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__DialogueAssignment_11"


    // $ANTLR start "rule__Character__DescriptionAssignment_14"
    // InternalWeebADoodle.g:2516:1: rule__Character__DescriptionAssignment_14 : ( RULE_STRING ) ;
    public final void rule__Character__DescriptionAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2520:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2521:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2521:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2522:3: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getDescriptionSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getDescriptionSTRINGTerminalRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__DescriptionAssignment_14"


    // $ANTLR start "rule__SceneObject__NameAssignment_3"
    // InternalWeebADoodle.g:2531:1: rule__SceneObject__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__SceneObject__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2535:1: ( ( RULE_ID ) )
            // InternalWeebADoodle.g:2536:2: ( RULE_ID )
            {
            // InternalWeebADoodle.g:2536:2: ( RULE_ID )
            // InternalWeebADoodle.g:2537:3: RULE_ID
            {
             before(grammarAccess.getSceneObjectAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__NameAssignment_3"


    // $ANTLR start "rule__SceneObject__ValueAssignment_5"
    // InternalWeebADoodle.g:2546:1: rule__SceneObject__ValueAssignment_5 : ( RULE_STRING ) ;
    public final void rule__SceneObject__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2550:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2551:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2551:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2552:3: RULE_STRING
            {
             before(grammarAccess.getSceneObjectAccess().getValueSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getValueSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__ValueAssignment_5"


    // $ANTLR start "rule__SceneObject__PositionAssignment_8"
    // InternalWeebADoodle.g:2561:1: rule__SceneObject__PositionAssignment_8 : ( RULE_STRING ) ;
    public final void rule__SceneObject__PositionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2565:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2566:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2566:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2567:3: RULE_STRING
            {
             before(grammarAccess.getSceneObjectAccess().getPositionSTRINGTerminalRuleCall_8_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getPositionSTRINGTerminalRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__PositionAssignment_8"


    // $ANTLR start "rule__SceneObject__DescriptionAssignment_11"
    // InternalWeebADoodle.g:2576:1: rule__SceneObject__DescriptionAssignment_11 : ( RULE_STRING ) ;
    public final void rule__SceneObject__DescriptionAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2580:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2581:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2581:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2582:3: RULE_STRING
            {
             before(grammarAccess.getSceneObjectAccess().getDescriptionSTRINGTerminalRuleCall_11_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getDescriptionSTRINGTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__DescriptionAssignment_11"


    // $ANTLR start "rule__Setting__CameraShotAssignment_3"
    // InternalWeebADoodle.g:2591:1: rule__Setting__CameraShotAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Setting__CameraShotAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2595:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2596:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2596:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2597:3: RULE_STRING
            {
             before(grammarAccess.getSettingAccess().getCameraShotSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getCameraShotSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__CameraShotAssignment_3"


    // $ANTLR start "rule__Setting__CameraAngleAssignment_6"
    // InternalWeebADoodle.g:2606:1: rule__Setting__CameraAngleAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Setting__CameraAngleAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2610:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2611:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2611:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2612:3: RULE_STRING
            {
             before(grammarAccess.getSettingAccess().getCameraAngleSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getCameraAngleSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__CameraAngleAssignment_6"


    // $ANTLR start "rule__Setting__LightingAssignment_9"
    // InternalWeebADoodle.g:2621:1: rule__Setting__LightingAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Setting__LightingAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2625:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2626:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2626:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2627:3: RULE_STRING
            {
             before(grammarAccess.getSettingAccess().getLightingSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getLightingSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__LightingAssignment_9"


    // $ANTLR start "rule__Setting__DescriptionAssignment_12"
    // InternalWeebADoodle.g:2636:1: rule__Setting__DescriptionAssignment_12 : ( RULE_STRING ) ;
    public final void rule__Setting__DescriptionAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2640:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2641:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2641:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2642:3: RULE_STRING
            {
             before(grammarAccess.getSettingAccess().getDescriptionSTRINGTerminalRuleCall_12_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getDescriptionSTRINGTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__DescriptionAssignment_12"


    // $ANTLR start "rule__Direction__TargetCharacterAssignment_2_0_1"
    // InternalWeebADoodle.g:2651:1: rule__Direction__TargetCharacterAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Direction__TargetCharacterAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2655:1: ( ( ( RULE_ID ) ) )
            // InternalWeebADoodle.g:2656:2: ( ( RULE_ID ) )
            {
            // InternalWeebADoodle.g:2656:2: ( ( RULE_ID ) )
            // InternalWeebADoodle.g:2657:3: ( RULE_ID )
            {
             before(grammarAccess.getDirectionAccess().getTargetCharacterCharacterCrossReference_2_0_1_0()); 
            // InternalWeebADoodle.g:2658:3: ( RULE_ID )
            // InternalWeebADoodle.g:2659:4: RULE_ID
            {
             before(grammarAccess.getDirectionAccess().getTargetCharacterCharacterIDTerminalRuleCall_2_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getTargetCharacterCharacterIDTerminalRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getDirectionAccess().getTargetCharacterCharacterCrossReference_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__TargetCharacterAssignment_2_0_1"


    // $ANTLR start "rule__Direction__TargetObjectAssignment_2_1_1"
    // InternalWeebADoodle.g:2670:1: rule__Direction__TargetObjectAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Direction__TargetObjectAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2674:1: ( ( ( RULE_ID ) ) )
            // InternalWeebADoodle.g:2675:2: ( ( RULE_ID ) )
            {
            // InternalWeebADoodle.g:2675:2: ( ( RULE_ID ) )
            // InternalWeebADoodle.g:2676:3: ( RULE_ID )
            {
             before(grammarAccess.getDirectionAccess().getTargetObjectSceneObjectCrossReference_2_1_1_0()); 
            // InternalWeebADoodle.g:2677:3: ( RULE_ID )
            // InternalWeebADoodle.g:2678:4: RULE_ID
            {
             before(grammarAccess.getDirectionAccess().getTargetObjectSceneObjectIDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getTargetObjectSceneObjectIDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getDirectionAccess().getTargetObjectSceneObjectCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__TargetObjectAssignment_2_1_1"


    // $ANTLR start "rule__Direction__MovementAssignment_4"
    // InternalWeebADoodle.g:2689:1: rule__Direction__MovementAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Direction__MovementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2693:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2694:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2694:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2695:3: RULE_STRING
            {
             before(grammarAccess.getDirectionAccess().getMovementSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getMovementSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__MovementAssignment_4"


    // $ANTLR start "rule__Direction__DescriptionAssignment_6"
    // InternalWeebADoodle.g:2704:1: rule__Direction__DescriptionAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Direction__DescriptionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2708:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2709:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2709:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2710:3: RULE_STRING
            {
             before(grammarAccess.getDirectionAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getDescriptionSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__DescriptionAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002880000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});

}