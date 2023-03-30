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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'board'", "'{'", "'title:'", "'}'", "'scene'", "':'", "';'", "'background:'", "'character'", "'name:'", "'object'", "'setting'", "'description:'", "'dialogue:'", "'action:'", "'position:'", "'camera:'", "'from'", "'lighting:'"
    };
    public static final int RULE_STRING=4;
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



    // $ANTLR start "entryRuleBoard"
    // InternalWeebADoodle.g:53:1: entryRuleBoard : ruleBoard EOF ;
    public final void entryRuleBoard() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:54:1: ( ruleBoard EOF )
            // InternalWeebADoodle.g:55:1: ruleBoard EOF
            {
             before(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            ruleBoard();

            state._fsp--;

             after(grammarAccess.getBoardRule()); 
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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalWeebADoodle.g:62:1: ruleBoard : ( ( rule__Board__Group__0 ) ) ;
    public final void ruleBoard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:66:2: ( ( ( rule__Board__Group__0 ) ) )
            // InternalWeebADoodle.g:67:2: ( ( rule__Board__Group__0 ) )
            {
            // InternalWeebADoodle.g:67:2: ( ( rule__Board__Group__0 ) )
            // InternalWeebADoodle.g:68:3: ( rule__Board__Group__0 )
            {
             before(grammarAccess.getBoardAccess().getGroup()); 
            // InternalWeebADoodle.g:69:3: ( rule__Board__Group__0 )
            // InternalWeebADoodle.g:69:4: rule__Board__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoard"


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


    // $ANTLR start "entryRuleDescriptionStatement"
    // InternalWeebADoodle.g:178:1: entryRuleDescriptionStatement : ruleDescriptionStatement EOF ;
    public final void entryRuleDescriptionStatement() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:179:1: ( ruleDescriptionStatement EOF )
            // InternalWeebADoodle.g:180:1: ruleDescriptionStatement EOF
            {
             before(grammarAccess.getDescriptionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDescriptionStatement();

            state._fsp--;

             after(grammarAccess.getDescriptionStatementRule()); 
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
    // $ANTLR end "entryRuleDescriptionStatement"


    // $ANTLR start "ruleDescriptionStatement"
    // InternalWeebADoodle.g:187:1: ruleDescriptionStatement : ( ( rule__DescriptionStatement__Group__0 ) ) ;
    public final void ruleDescriptionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:191:2: ( ( ( rule__DescriptionStatement__Group__0 ) ) )
            // InternalWeebADoodle.g:192:2: ( ( rule__DescriptionStatement__Group__0 ) )
            {
            // InternalWeebADoodle.g:192:2: ( ( rule__DescriptionStatement__Group__0 ) )
            // InternalWeebADoodle.g:193:3: ( rule__DescriptionStatement__Group__0 )
            {
             before(grammarAccess.getDescriptionStatementAccess().getGroup()); 
            // InternalWeebADoodle.g:194:3: ( rule__DescriptionStatement__Group__0 )
            // InternalWeebADoodle.g:194:4: rule__DescriptionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescriptionStatement"


    // $ANTLR start "entryRuleDialogueStatement"
    // InternalWeebADoodle.g:203:1: entryRuleDialogueStatement : ruleDialogueStatement EOF ;
    public final void entryRuleDialogueStatement() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:204:1: ( ruleDialogueStatement EOF )
            // InternalWeebADoodle.g:205:1: ruleDialogueStatement EOF
            {
             before(grammarAccess.getDialogueStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleDialogueStatement();

            state._fsp--;

             after(grammarAccess.getDialogueStatementRule()); 
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
    // $ANTLR end "entryRuleDialogueStatement"


    // $ANTLR start "ruleDialogueStatement"
    // InternalWeebADoodle.g:212:1: ruleDialogueStatement : ( ( rule__DialogueStatement__Group__0 ) ) ;
    public final void ruleDialogueStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:216:2: ( ( ( rule__DialogueStatement__Group__0 ) ) )
            // InternalWeebADoodle.g:217:2: ( ( rule__DialogueStatement__Group__0 ) )
            {
            // InternalWeebADoodle.g:217:2: ( ( rule__DialogueStatement__Group__0 ) )
            // InternalWeebADoodle.g:218:3: ( rule__DialogueStatement__Group__0 )
            {
             before(grammarAccess.getDialogueStatementAccess().getGroup()); 
            // InternalWeebADoodle.g:219:3: ( rule__DialogueStatement__Group__0 )
            // InternalWeebADoodle.g:219:4: rule__DialogueStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DialogueStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDialogueStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDialogueStatement"


    // $ANTLR start "entryRuleActionStatement"
    // InternalWeebADoodle.g:228:1: entryRuleActionStatement : ruleActionStatement EOF ;
    public final void entryRuleActionStatement() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:229:1: ( ruleActionStatement EOF )
            // InternalWeebADoodle.g:230:1: ruleActionStatement EOF
            {
             before(grammarAccess.getActionStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleActionStatement();

            state._fsp--;

             after(grammarAccess.getActionStatementRule()); 
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
    // $ANTLR end "entryRuleActionStatement"


    // $ANTLR start "ruleActionStatement"
    // InternalWeebADoodle.g:237:1: ruleActionStatement : ( ( rule__ActionStatement__Group__0 ) ) ;
    public final void ruleActionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:241:2: ( ( ( rule__ActionStatement__Group__0 ) ) )
            // InternalWeebADoodle.g:242:2: ( ( rule__ActionStatement__Group__0 ) )
            {
            // InternalWeebADoodle.g:242:2: ( ( rule__ActionStatement__Group__0 ) )
            // InternalWeebADoodle.g:243:3: ( rule__ActionStatement__Group__0 )
            {
             before(grammarAccess.getActionStatementAccess().getGroup()); 
            // InternalWeebADoodle.g:244:3: ( rule__ActionStatement__Group__0 )
            // InternalWeebADoodle.g:244:4: rule__ActionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionStatement"


    // $ANTLR start "entryRulePositionStatement"
    // InternalWeebADoodle.g:253:1: entryRulePositionStatement : rulePositionStatement EOF ;
    public final void entryRulePositionStatement() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:254:1: ( rulePositionStatement EOF )
            // InternalWeebADoodle.g:255:1: rulePositionStatement EOF
            {
             before(grammarAccess.getPositionStatementRule()); 
            pushFollow(FOLLOW_1);
            rulePositionStatement();

            state._fsp--;

             after(grammarAccess.getPositionStatementRule()); 
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
    // $ANTLR end "entryRulePositionStatement"


    // $ANTLR start "rulePositionStatement"
    // InternalWeebADoodle.g:262:1: rulePositionStatement : ( ( rule__PositionStatement__Group__0 ) ) ;
    public final void rulePositionStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:266:2: ( ( ( rule__PositionStatement__Group__0 ) ) )
            // InternalWeebADoodle.g:267:2: ( ( rule__PositionStatement__Group__0 ) )
            {
            // InternalWeebADoodle.g:267:2: ( ( rule__PositionStatement__Group__0 ) )
            // InternalWeebADoodle.g:268:3: ( rule__PositionStatement__Group__0 )
            {
             before(grammarAccess.getPositionStatementAccess().getGroup()); 
            // InternalWeebADoodle.g:269:3: ( rule__PositionStatement__Group__0 )
            // InternalWeebADoodle.g:269:4: rule__PositionStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PositionStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionStatement"


    // $ANTLR start "entryRuleCameraShotStatement"
    // InternalWeebADoodle.g:278:1: entryRuleCameraShotStatement : ruleCameraShotStatement EOF ;
    public final void entryRuleCameraShotStatement() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:279:1: ( ruleCameraShotStatement EOF )
            // InternalWeebADoodle.g:280:1: ruleCameraShotStatement EOF
            {
             before(grammarAccess.getCameraShotStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleCameraShotStatement();

            state._fsp--;

             after(grammarAccess.getCameraShotStatementRule()); 
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
    // $ANTLR end "entryRuleCameraShotStatement"


    // $ANTLR start "ruleCameraShotStatement"
    // InternalWeebADoodle.g:287:1: ruleCameraShotStatement : ( ( rule__CameraShotStatement__Group__0 ) ) ;
    public final void ruleCameraShotStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:291:2: ( ( ( rule__CameraShotStatement__Group__0 ) ) )
            // InternalWeebADoodle.g:292:2: ( ( rule__CameraShotStatement__Group__0 ) )
            {
            // InternalWeebADoodle.g:292:2: ( ( rule__CameraShotStatement__Group__0 ) )
            // InternalWeebADoodle.g:293:3: ( rule__CameraShotStatement__Group__0 )
            {
             before(grammarAccess.getCameraShotStatementAccess().getGroup()); 
            // InternalWeebADoodle.g:294:3: ( rule__CameraShotStatement__Group__0 )
            // InternalWeebADoodle.g:294:4: rule__CameraShotStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CameraShotStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCameraShotStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCameraShotStatement"


    // $ANTLR start "entryRuleLightingStatement"
    // InternalWeebADoodle.g:303:1: entryRuleLightingStatement : ruleLightingStatement EOF ;
    public final void entryRuleLightingStatement() throws RecognitionException {
        try {
            // InternalWeebADoodle.g:304:1: ( ruleLightingStatement EOF )
            // InternalWeebADoodle.g:305:1: ruleLightingStatement EOF
            {
             before(grammarAccess.getLightingStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleLightingStatement();

            state._fsp--;

             after(grammarAccess.getLightingStatementRule()); 
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
    // $ANTLR end "entryRuleLightingStatement"


    // $ANTLR start "ruleLightingStatement"
    // InternalWeebADoodle.g:312:1: ruleLightingStatement : ( ( rule__LightingStatement__Group__0 ) ) ;
    public final void ruleLightingStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:316:2: ( ( ( rule__LightingStatement__Group__0 ) ) )
            // InternalWeebADoodle.g:317:2: ( ( rule__LightingStatement__Group__0 ) )
            {
            // InternalWeebADoodle.g:317:2: ( ( rule__LightingStatement__Group__0 ) )
            // InternalWeebADoodle.g:318:3: ( rule__LightingStatement__Group__0 )
            {
             before(grammarAccess.getLightingStatementAccess().getGroup()); 
            // InternalWeebADoodle.g:319:3: ( rule__LightingStatement__Group__0 )
            // InternalWeebADoodle.g:319:4: rule__LightingStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LightingStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLightingStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLightingStatement"


    // $ANTLR start "rule__Board__Group__0"
    // InternalWeebADoodle.g:327:1: rule__Board__Group__0 : rule__Board__Group__0__Impl rule__Board__Group__1 ;
    public final void rule__Board__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:331:1: ( rule__Board__Group__0__Impl rule__Board__Group__1 )
            // InternalWeebADoodle.g:332:2: rule__Board__Group__0__Impl rule__Board__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Board__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0"


    // $ANTLR start "rule__Board__Group__0__Impl"
    // InternalWeebADoodle.g:339:1: rule__Board__Group__0__Impl : ( 'board' ) ;
    public final void rule__Board__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:343:1: ( ( 'board' ) )
            // InternalWeebADoodle.g:344:1: ( 'board' )
            {
            // InternalWeebADoodle.g:344:1: ( 'board' )
            // InternalWeebADoodle.g:345:2: 'board'
            {
             before(grammarAccess.getBoardAccess().getBoardKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getBoardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__0__Impl"


    // $ANTLR start "rule__Board__Group__1"
    // InternalWeebADoodle.g:354:1: rule__Board__Group__1 : rule__Board__Group__1__Impl rule__Board__Group__2 ;
    public final void rule__Board__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:358:1: ( rule__Board__Group__1__Impl rule__Board__Group__2 )
            // InternalWeebADoodle.g:359:2: rule__Board__Group__1__Impl rule__Board__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Board__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1"


    // $ANTLR start "rule__Board__Group__1__Impl"
    // InternalWeebADoodle.g:366:1: rule__Board__Group__1__Impl : ( '{' ) ;
    public final void rule__Board__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:370:1: ( ( '{' ) )
            // InternalWeebADoodle.g:371:1: ( '{' )
            {
            // InternalWeebADoodle.g:371:1: ( '{' )
            // InternalWeebADoodle.g:372:2: '{'
            {
             before(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__1__Impl"


    // $ANTLR start "rule__Board__Group__2"
    // InternalWeebADoodle.g:381:1: rule__Board__Group__2 : rule__Board__Group__2__Impl rule__Board__Group__3 ;
    public final void rule__Board__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:385:1: ( rule__Board__Group__2__Impl rule__Board__Group__3 )
            // InternalWeebADoodle.g:386:2: rule__Board__Group__2__Impl rule__Board__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Board__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__2"


    // $ANTLR start "rule__Board__Group__2__Impl"
    // InternalWeebADoodle.g:393:1: rule__Board__Group__2__Impl : ( 'title:' ) ;
    public final void rule__Board__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:397:1: ( ( 'title:' ) )
            // InternalWeebADoodle.g:398:1: ( 'title:' )
            {
            // InternalWeebADoodle.g:398:1: ( 'title:' )
            // InternalWeebADoodle.g:399:2: 'title:'
            {
             before(grammarAccess.getBoardAccess().getTitleKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getTitleKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__2__Impl"


    // $ANTLR start "rule__Board__Group__3"
    // InternalWeebADoodle.g:408:1: rule__Board__Group__3 : rule__Board__Group__3__Impl rule__Board__Group__4 ;
    public final void rule__Board__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:412:1: ( rule__Board__Group__3__Impl rule__Board__Group__4 )
            // InternalWeebADoodle.g:413:2: rule__Board__Group__3__Impl rule__Board__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Board__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__3"


    // $ANTLR start "rule__Board__Group__3__Impl"
    // InternalWeebADoodle.g:420:1: rule__Board__Group__3__Impl : ( ( rule__Board__TitleAssignment_3 ) ) ;
    public final void rule__Board__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:424:1: ( ( ( rule__Board__TitleAssignment_3 ) ) )
            // InternalWeebADoodle.g:425:1: ( ( rule__Board__TitleAssignment_3 ) )
            {
            // InternalWeebADoodle.g:425:1: ( ( rule__Board__TitleAssignment_3 ) )
            // InternalWeebADoodle.g:426:2: ( rule__Board__TitleAssignment_3 )
            {
             before(grammarAccess.getBoardAccess().getTitleAssignment_3()); 
            // InternalWeebADoodle.g:427:2: ( rule__Board__TitleAssignment_3 )
            // InternalWeebADoodle.g:427:3: rule__Board__TitleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Board__TitleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getTitleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__3__Impl"


    // $ANTLR start "rule__Board__Group__4"
    // InternalWeebADoodle.g:435:1: rule__Board__Group__4 : rule__Board__Group__4__Impl rule__Board__Group__5 ;
    public final void rule__Board__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:439:1: ( rule__Board__Group__4__Impl rule__Board__Group__5 )
            // InternalWeebADoodle.g:440:2: rule__Board__Group__4__Impl rule__Board__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Board__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Board__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__4"


    // $ANTLR start "rule__Board__Group__4__Impl"
    // InternalWeebADoodle.g:447:1: rule__Board__Group__4__Impl : ( ( ( rule__Board__ScenesAssignment_4 ) ) ( ( rule__Board__ScenesAssignment_4 )* ) ) ;
    public final void rule__Board__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:451:1: ( ( ( ( rule__Board__ScenesAssignment_4 ) ) ( ( rule__Board__ScenesAssignment_4 )* ) ) )
            // InternalWeebADoodle.g:452:1: ( ( ( rule__Board__ScenesAssignment_4 ) ) ( ( rule__Board__ScenesAssignment_4 )* ) )
            {
            // InternalWeebADoodle.g:452:1: ( ( ( rule__Board__ScenesAssignment_4 ) ) ( ( rule__Board__ScenesAssignment_4 )* ) )
            // InternalWeebADoodle.g:453:2: ( ( rule__Board__ScenesAssignment_4 ) ) ( ( rule__Board__ScenesAssignment_4 )* )
            {
            // InternalWeebADoodle.g:453:2: ( ( rule__Board__ScenesAssignment_4 ) )
            // InternalWeebADoodle.g:454:3: ( rule__Board__ScenesAssignment_4 )
            {
             before(grammarAccess.getBoardAccess().getScenesAssignment_4()); 
            // InternalWeebADoodle.g:455:3: ( rule__Board__ScenesAssignment_4 )
            // InternalWeebADoodle.g:455:4: rule__Board__ScenesAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__Board__ScenesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBoardAccess().getScenesAssignment_4()); 

            }

            // InternalWeebADoodle.g:458:2: ( ( rule__Board__ScenesAssignment_4 )* )
            // InternalWeebADoodle.g:459:3: ( rule__Board__ScenesAssignment_4 )*
            {
             before(grammarAccess.getBoardAccess().getScenesAssignment_4()); 
            // InternalWeebADoodle.g:460:3: ( rule__Board__ScenesAssignment_4 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalWeebADoodle.g:460:4: rule__Board__ScenesAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Board__ScenesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getBoardAccess().getScenesAssignment_4()); 

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
    // $ANTLR end "rule__Board__Group__4__Impl"


    // $ANTLR start "rule__Board__Group__5"
    // InternalWeebADoodle.g:469:1: rule__Board__Group__5 : rule__Board__Group__5__Impl ;
    public final void rule__Board__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:473:1: ( rule__Board__Group__5__Impl )
            // InternalWeebADoodle.g:474:2: rule__Board__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Board__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__5"


    // $ANTLR start "rule__Board__Group__5__Impl"
    // InternalWeebADoodle.g:480:1: rule__Board__Group__5__Impl : ( '}' ) ;
    public final void rule__Board__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:484:1: ( ( '}' ) )
            // InternalWeebADoodle.g:485:1: ( '}' )
            {
            // InternalWeebADoodle.g:485:1: ( '}' )
            // InternalWeebADoodle.g:486:2: '}'
            {
             before(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__Group__5__Impl"


    // $ANTLR start "rule__Scene__Group__0"
    // InternalWeebADoodle.g:496:1: rule__Scene__Group__0 : rule__Scene__Group__0__Impl rule__Scene__Group__1 ;
    public final void rule__Scene__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:500:1: ( rule__Scene__Group__0__Impl rule__Scene__Group__1 )
            // InternalWeebADoodle.g:501:2: rule__Scene__Group__0__Impl rule__Scene__Group__1
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
    // InternalWeebADoodle.g:508:1: rule__Scene__Group__0__Impl : ( 'scene' ) ;
    public final void rule__Scene__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:512:1: ( ( 'scene' ) )
            // InternalWeebADoodle.g:513:1: ( 'scene' )
            {
            // InternalWeebADoodle.g:513:1: ( 'scene' )
            // InternalWeebADoodle.g:514:2: 'scene'
            {
             before(grammarAccess.getSceneAccess().getSceneKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalWeebADoodle.g:523:1: rule__Scene__Group__1 : rule__Scene__Group__1__Impl rule__Scene__Group__2 ;
    public final void rule__Scene__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:527:1: ( rule__Scene__Group__1__Impl rule__Scene__Group__2 )
            // InternalWeebADoodle.g:528:2: rule__Scene__Group__1__Impl rule__Scene__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalWeebADoodle.g:535:1: rule__Scene__Group__1__Impl : ( '{' ) ;
    public final void rule__Scene__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:539:1: ( ( '{' ) )
            // InternalWeebADoodle.g:540:1: ( '{' )
            {
            // InternalWeebADoodle.g:540:1: ( '{' )
            // InternalWeebADoodle.g:541:2: '{'
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
    // InternalWeebADoodle.g:550:1: rule__Scene__Group__2 : rule__Scene__Group__2__Impl rule__Scene__Group__3 ;
    public final void rule__Scene__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:554:1: ( rule__Scene__Group__2__Impl rule__Scene__Group__3 )
            // InternalWeebADoodle.g:555:2: rule__Scene__Group__2__Impl rule__Scene__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalWeebADoodle.g:562:1: rule__Scene__Group__2__Impl : ( ( rule__Scene__NameAssignment_2 ) ) ;
    public final void rule__Scene__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:566:1: ( ( ( rule__Scene__NameAssignment_2 ) ) )
            // InternalWeebADoodle.g:567:1: ( ( rule__Scene__NameAssignment_2 ) )
            {
            // InternalWeebADoodle.g:567:1: ( ( rule__Scene__NameAssignment_2 ) )
            // InternalWeebADoodle.g:568:2: ( rule__Scene__NameAssignment_2 )
            {
             before(grammarAccess.getSceneAccess().getNameAssignment_2()); 
            // InternalWeebADoodle.g:569:2: ( rule__Scene__NameAssignment_2 )
            // InternalWeebADoodle.g:569:3: rule__Scene__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Scene__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:577:1: rule__Scene__Group__3 : rule__Scene__Group__3__Impl rule__Scene__Group__4 ;
    public final void rule__Scene__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:581:1: ( rule__Scene__Group__3__Impl rule__Scene__Group__4 )
            // InternalWeebADoodle.g:582:2: rule__Scene__Group__3__Impl rule__Scene__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalWeebADoodle.g:589:1: rule__Scene__Group__3__Impl : ( ':' ) ;
    public final void rule__Scene__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:593:1: ( ( ':' ) )
            // InternalWeebADoodle.g:594:1: ( ':' )
            {
            // InternalWeebADoodle.g:594:1: ( ':' )
            // InternalWeebADoodle.g:595:2: ':'
            {
             before(grammarAccess.getSceneAccess().getColonKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:604:1: rule__Scene__Group__4 : rule__Scene__Group__4__Impl rule__Scene__Group__5 ;
    public final void rule__Scene__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:608:1: ( rule__Scene__Group__4__Impl rule__Scene__Group__5 )
            // InternalWeebADoodle.g:609:2: rule__Scene__Group__4__Impl rule__Scene__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalWeebADoodle.g:616:1: rule__Scene__Group__4__Impl : ( ( rule__Scene__ValueAssignment_4 ) ) ;
    public final void rule__Scene__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:620:1: ( ( ( rule__Scene__ValueAssignment_4 ) ) )
            // InternalWeebADoodle.g:621:1: ( ( rule__Scene__ValueAssignment_4 ) )
            {
            // InternalWeebADoodle.g:621:1: ( ( rule__Scene__ValueAssignment_4 ) )
            // InternalWeebADoodle.g:622:2: ( rule__Scene__ValueAssignment_4 )
            {
             before(grammarAccess.getSceneAccess().getValueAssignment_4()); 
            // InternalWeebADoodle.g:623:2: ( rule__Scene__ValueAssignment_4 )
            // InternalWeebADoodle.g:623:3: rule__Scene__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Scene__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getValueAssignment_4()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:631:1: rule__Scene__Group__5 : rule__Scene__Group__5__Impl rule__Scene__Group__6 ;
    public final void rule__Scene__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:635:1: ( rule__Scene__Group__5__Impl rule__Scene__Group__6 )
            // InternalWeebADoodle.g:636:2: rule__Scene__Group__5__Impl rule__Scene__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalWeebADoodle.g:643:1: rule__Scene__Group__5__Impl : ( ';' ) ;
    public final void rule__Scene__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:647:1: ( ( ';' ) )
            // InternalWeebADoodle.g:648:1: ( ';' )
            {
            // InternalWeebADoodle.g:648:1: ( ';' )
            // InternalWeebADoodle.g:649:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:658:1: rule__Scene__Group__6 : rule__Scene__Group__6__Impl rule__Scene__Group__7 ;
    public final void rule__Scene__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:662:1: ( rule__Scene__Group__6__Impl rule__Scene__Group__7 )
            // InternalWeebADoodle.g:663:2: rule__Scene__Group__6__Impl rule__Scene__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalWeebADoodle.g:670:1: rule__Scene__Group__6__Impl : ( 'background:' ) ;
    public final void rule__Scene__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:674:1: ( ( 'background:' ) )
            // InternalWeebADoodle.g:675:1: ( 'background:' )
            {
            // InternalWeebADoodle.g:675:1: ( 'background:' )
            // InternalWeebADoodle.g:676:2: 'background:'
            {
             before(grammarAccess.getSceneAccess().getBackgroundKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getBackgroundKeyword_6()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:685:1: rule__Scene__Group__7 : rule__Scene__Group__7__Impl rule__Scene__Group__8 ;
    public final void rule__Scene__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:689:1: ( rule__Scene__Group__7__Impl rule__Scene__Group__8 )
            // InternalWeebADoodle.g:690:2: rule__Scene__Group__7__Impl rule__Scene__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalWeebADoodle.g:697:1: rule__Scene__Group__7__Impl : ( ( rule__Scene__BackgroundAssignment_7 ) ) ;
    public final void rule__Scene__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:701:1: ( ( ( rule__Scene__BackgroundAssignment_7 ) ) )
            // InternalWeebADoodle.g:702:1: ( ( rule__Scene__BackgroundAssignment_7 ) )
            {
            // InternalWeebADoodle.g:702:1: ( ( rule__Scene__BackgroundAssignment_7 ) )
            // InternalWeebADoodle.g:703:2: ( rule__Scene__BackgroundAssignment_7 )
            {
             before(grammarAccess.getSceneAccess().getBackgroundAssignment_7()); 
            // InternalWeebADoodle.g:704:2: ( rule__Scene__BackgroundAssignment_7 )
            // InternalWeebADoodle.g:704:3: rule__Scene__BackgroundAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Scene__BackgroundAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getBackgroundAssignment_7()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:712:1: rule__Scene__Group__8 : rule__Scene__Group__8__Impl rule__Scene__Group__9 ;
    public final void rule__Scene__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:716:1: ( rule__Scene__Group__8__Impl rule__Scene__Group__9 )
            // InternalWeebADoodle.g:717:2: rule__Scene__Group__8__Impl rule__Scene__Group__9
            {
            pushFollow(FOLLOW_13);
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
    // InternalWeebADoodle.g:724:1: rule__Scene__Group__8__Impl : ( ';' ) ;
    public final void rule__Scene__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:728:1: ( ( ';' ) )
            // InternalWeebADoodle.g:729:1: ( ';' )
            {
            // InternalWeebADoodle.g:729:1: ( ';' )
            // InternalWeebADoodle.g:730:2: ';'
            {
             before(grammarAccess.getSceneAccess().getSemicolonKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getSemicolonKeyword_8()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:739:1: rule__Scene__Group__9 : rule__Scene__Group__9__Impl rule__Scene__Group__10 ;
    public final void rule__Scene__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:743:1: ( rule__Scene__Group__9__Impl rule__Scene__Group__10 )
            // InternalWeebADoodle.g:744:2: rule__Scene__Group__9__Impl rule__Scene__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalWeebADoodle.g:751:1: rule__Scene__Group__9__Impl : ( ( rule__Scene__SettingsAssignment_9 ) ) ;
    public final void rule__Scene__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:755:1: ( ( ( rule__Scene__SettingsAssignment_9 ) ) )
            // InternalWeebADoodle.g:756:1: ( ( rule__Scene__SettingsAssignment_9 ) )
            {
            // InternalWeebADoodle.g:756:1: ( ( rule__Scene__SettingsAssignment_9 ) )
            // InternalWeebADoodle.g:757:2: ( rule__Scene__SettingsAssignment_9 )
            {
             before(grammarAccess.getSceneAccess().getSettingsAssignment_9()); 
            // InternalWeebADoodle.g:758:2: ( rule__Scene__SettingsAssignment_9 )
            // InternalWeebADoodle.g:758:3: rule__Scene__SettingsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Scene__SettingsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSceneAccess().getSettingsAssignment_9()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:766:1: rule__Scene__Group__10 : rule__Scene__Group__10__Impl rule__Scene__Group__11 ;
    public final void rule__Scene__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:770:1: ( rule__Scene__Group__10__Impl rule__Scene__Group__11 )
            // InternalWeebADoodle.g:771:2: rule__Scene__Group__10__Impl rule__Scene__Group__11
            {
            pushFollow(FOLLOW_14);
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
    // InternalWeebADoodle.g:778:1: rule__Scene__Group__10__Impl : ( ( rule__Scene__CharactersAssignment_10 )* ) ;
    public final void rule__Scene__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:782:1: ( ( ( rule__Scene__CharactersAssignment_10 )* ) )
            // InternalWeebADoodle.g:783:1: ( ( rule__Scene__CharactersAssignment_10 )* )
            {
            // InternalWeebADoodle.g:783:1: ( ( rule__Scene__CharactersAssignment_10 )* )
            // InternalWeebADoodle.g:784:2: ( rule__Scene__CharactersAssignment_10 )*
            {
             before(grammarAccess.getSceneAccess().getCharactersAssignment_10()); 
            // InternalWeebADoodle.g:785:2: ( rule__Scene__CharactersAssignment_10 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalWeebADoodle.g:785:3: rule__Scene__CharactersAssignment_10
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Scene__CharactersAssignment_10();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalWeebADoodle.g:793:1: rule__Scene__Group__11 : rule__Scene__Group__11__Impl rule__Scene__Group__12 ;
    public final void rule__Scene__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:797:1: ( rule__Scene__Group__11__Impl rule__Scene__Group__12 )
            // InternalWeebADoodle.g:798:2: rule__Scene__Group__11__Impl rule__Scene__Group__12
            {
            pushFollow(FOLLOW_14);
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
    // InternalWeebADoodle.g:805:1: rule__Scene__Group__11__Impl : ( ( rule__Scene__ObjectsAssignment_11 )* ) ;
    public final void rule__Scene__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:809:1: ( ( ( rule__Scene__ObjectsAssignment_11 )* ) )
            // InternalWeebADoodle.g:810:1: ( ( rule__Scene__ObjectsAssignment_11 )* )
            {
            // InternalWeebADoodle.g:810:1: ( ( rule__Scene__ObjectsAssignment_11 )* )
            // InternalWeebADoodle.g:811:2: ( rule__Scene__ObjectsAssignment_11 )*
            {
             before(grammarAccess.getSceneAccess().getObjectsAssignment_11()); 
            // InternalWeebADoodle.g:812:2: ( rule__Scene__ObjectsAssignment_11 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalWeebADoodle.g:812:3: rule__Scene__ObjectsAssignment_11
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Scene__ObjectsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalWeebADoodle.g:820:1: rule__Scene__Group__12 : rule__Scene__Group__12__Impl ;
    public final void rule__Scene__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:824:1: ( rule__Scene__Group__12__Impl )
            // InternalWeebADoodle.g:825:2: rule__Scene__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scene__Group__12__Impl();

            state._fsp--;


            }

        }
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
    // InternalWeebADoodle.g:831:1: rule__Scene__Group__12__Impl : ( '}' ) ;
    public final void rule__Scene__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:835:1: ( ( '}' ) )
            // InternalWeebADoodle.g:836:1: ( '}' )
            {
            // InternalWeebADoodle.g:836:1: ( '}' )
            // InternalWeebADoodle.g:837:2: '}'
            {
             before(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_12()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__Character__Group__0"
    // InternalWeebADoodle.g:847:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:851:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // InternalWeebADoodle.g:852:2: rule__Character__Group__0__Impl rule__Character__Group__1
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
    // InternalWeebADoodle.g:859:1: rule__Character__Group__0__Impl : ( 'character' ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:863:1: ( ( 'character' ) )
            // InternalWeebADoodle.g:864:1: ( 'character' )
            {
            // InternalWeebADoodle.g:864:1: ( 'character' )
            // InternalWeebADoodle.g:865:2: 'character'
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
    // InternalWeebADoodle.g:874:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:878:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // InternalWeebADoodle.g:879:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalWeebADoodle.g:886:1: rule__Character__Group__1__Impl : ( '{' ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:890:1: ( ( '{' ) )
            // InternalWeebADoodle.g:891:1: ( '{' )
            {
            // InternalWeebADoodle.g:891:1: ( '{' )
            // InternalWeebADoodle.g:892:2: '{'
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
    // InternalWeebADoodle.g:901:1: rule__Character__Group__2 : rule__Character__Group__2__Impl rule__Character__Group__3 ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:905:1: ( rule__Character__Group__2__Impl rule__Character__Group__3 )
            // InternalWeebADoodle.g:906:2: rule__Character__Group__2__Impl rule__Character__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalWeebADoodle.g:913:1: rule__Character__Group__2__Impl : ( ( rule__Character__NameAssignment_2 ) ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:917:1: ( ( ( rule__Character__NameAssignment_2 ) ) )
            // InternalWeebADoodle.g:918:1: ( ( rule__Character__NameAssignment_2 ) )
            {
            // InternalWeebADoodle.g:918:1: ( ( rule__Character__NameAssignment_2 ) )
            // InternalWeebADoodle.g:919:2: ( rule__Character__NameAssignment_2 )
            {
             before(grammarAccess.getCharacterAccess().getNameAssignment_2()); 
            // InternalWeebADoodle.g:920:2: ( rule__Character__NameAssignment_2 )
            // InternalWeebADoodle.g:920:3: rule__Character__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Character__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:928:1: rule__Character__Group__3 : rule__Character__Group__3__Impl rule__Character__Group__4 ;
    public final void rule__Character__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:932:1: ( rule__Character__Group__3__Impl rule__Character__Group__4 )
            // InternalWeebADoodle.g:933:2: rule__Character__Group__3__Impl rule__Character__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalWeebADoodle.g:940:1: rule__Character__Group__3__Impl : ( 'name:' ) ;
    public final void rule__Character__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:944:1: ( ( 'name:' ) )
            // InternalWeebADoodle.g:945:1: ( 'name:' )
            {
            // InternalWeebADoodle.g:945:1: ( 'name:' )
            // InternalWeebADoodle.g:946:2: 'name:'
            {
             before(grammarAccess.getCharacterAccess().getNameKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getNameKeyword_3()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:955:1: rule__Character__Group__4 : rule__Character__Group__4__Impl rule__Character__Group__5 ;
    public final void rule__Character__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:959:1: ( rule__Character__Group__4__Impl rule__Character__Group__5 )
            // InternalWeebADoodle.g:960:2: rule__Character__Group__4__Impl rule__Character__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalWeebADoodle.g:967:1: rule__Character__Group__4__Impl : ( ( rule__Character__ValueAssignment_4 ) ) ;
    public final void rule__Character__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:971:1: ( ( ( rule__Character__ValueAssignment_4 ) ) )
            // InternalWeebADoodle.g:972:1: ( ( rule__Character__ValueAssignment_4 ) )
            {
            // InternalWeebADoodle.g:972:1: ( ( rule__Character__ValueAssignment_4 ) )
            // InternalWeebADoodle.g:973:2: ( rule__Character__ValueAssignment_4 )
            {
             before(grammarAccess.getCharacterAccess().getValueAssignment_4()); 
            // InternalWeebADoodle.g:974:2: ( rule__Character__ValueAssignment_4 )
            // InternalWeebADoodle.g:974:3: rule__Character__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Character__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getValueAssignment_4()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:982:1: rule__Character__Group__5 : rule__Character__Group__5__Impl rule__Character__Group__6 ;
    public final void rule__Character__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:986:1: ( rule__Character__Group__5__Impl rule__Character__Group__6 )
            // InternalWeebADoodle.g:987:2: rule__Character__Group__5__Impl rule__Character__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalWeebADoodle.g:994:1: rule__Character__Group__5__Impl : ( ';' ) ;
    public final void rule__Character__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:998:1: ( ( ';' ) )
            // InternalWeebADoodle.g:999:1: ( ';' )
            {
            // InternalWeebADoodle.g:999:1: ( ';' )
            // InternalWeebADoodle.g:1000:2: ';'
            {
             before(grammarAccess.getCharacterAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1009:1: rule__Character__Group__6 : rule__Character__Group__6__Impl rule__Character__Group__7 ;
    public final void rule__Character__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1013:1: ( rule__Character__Group__6__Impl rule__Character__Group__7 )
            // InternalWeebADoodle.g:1014:2: rule__Character__Group__6__Impl rule__Character__Group__7
            {
            pushFollow(FOLLOW_18);
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
    // InternalWeebADoodle.g:1021:1: rule__Character__Group__6__Impl : ( ( rule__Character__PositionAssignment_6 )? ) ;
    public final void rule__Character__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1025:1: ( ( ( rule__Character__PositionAssignment_6 )? ) )
            // InternalWeebADoodle.g:1026:1: ( ( rule__Character__PositionAssignment_6 )? )
            {
            // InternalWeebADoodle.g:1026:1: ( ( rule__Character__PositionAssignment_6 )? )
            // InternalWeebADoodle.g:1027:2: ( rule__Character__PositionAssignment_6 )?
            {
             before(grammarAccess.getCharacterAccess().getPositionAssignment_6()); 
            // InternalWeebADoodle.g:1028:2: ( rule__Character__PositionAssignment_6 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalWeebADoodle.g:1028:3: rule__Character__PositionAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Character__PositionAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getPositionAssignment_6()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1036:1: rule__Character__Group__7 : rule__Character__Group__7__Impl rule__Character__Group__8 ;
    public final void rule__Character__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1040:1: ( rule__Character__Group__7__Impl rule__Character__Group__8 )
            // InternalWeebADoodle.g:1041:2: rule__Character__Group__7__Impl rule__Character__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalWeebADoodle.g:1048:1: rule__Character__Group__7__Impl : ( ( rule__Character__ActionAssignment_7 )? ) ;
    public final void rule__Character__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1052:1: ( ( ( rule__Character__ActionAssignment_7 )? ) )
            // InternalWeebADoodle.g:1053:1: ( ( rule__Character__ActionAssignment_7 )? )
            {
            // InternalWeebADoodle.g:1053:1: ( ( rule__Character__ActionAssignment_7 )? )
            // InternalWeebADoodle.g:1054:2: ( rule__Character__ActionAssignment_7 )?
            {
             before(grammarAccess.getCharacterAccess().getActionAssignment_7()); 
            // InternalWeebADoodle.g:1055:2: ( rule__Character__ActionAssignment_7 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalWeebADoodle.g:1055:3: rule__Character__ActionAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Character__ActionAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getActionAssignment_7()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1063:1: rule__Character__Group__8 : rule__Character__Group__8__Impl rule__Character__Group__9 ;
    public final void rule__Character__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1067:1: ( rule__Character__Group__8__Impl rule__Character__Group__9 )
            // InternalWeebADoodle.g:1068:2: rule__Character__Group__8__Impl rule__Character__Group__9
            {
            pushFollow(FOLLOW_18);
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
    // InternalWeebADoodle.g:1075:1: rule__Character__Group__8__Impl : ( ( rule__Character__DialogueAssignment_8 )? ) ;
    public final void rule__Character__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1079:1: ( ( ( rule__Character__DialogueAssignment_8 )? ) )
            // InternalWeebADoodle.g:1080:1: ( ( rule__Character__DialogueAssignment_8 )? )
            {
            // InternalWeebADoodle.g:1080:1: ( ( rule__Character__DialogueAssignment_8 )? )
            // InternalWeebADoodle.g:1081:2: ( rule__Character__DialogueAssignment_8 )?
            {
             before(grammarAccess.getCharacterAccess().getDialogueAssignment_8()); 
            // InternalWeebADoodle.g:1082:2: ( rule__Character__DialogueAssignment_8 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalWeebADoodle.g:1082:3: rule__Character__DialogueAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Character__DialogueAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getDialogueAssignment_8()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1090:1: rule__Character__Group__9 : rule__Character__Group__9__Impl rule__Character__Group__10 ;
    public final void rule__Character__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1094:1: ( rule__Character__Group__9__Impl rule__Character__Group__10 )
            // InternalWeebADoodle.g:1095:2: rule__Character__Group__9__Impl rule__Character__Group__10
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
    // InternalWeebADoodle.g:1102:1: rule__Character__Group__9__Impl : ( ( rule__Character__DescriptionAssignment_9 )? ) ;
    public final void rule__Character__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1106:1: ( ( ( rule__Character__DescriptionAssignment_9 )? ) )
            // InternalWeebADoodle.g:1107:1: ( ( rule__Character__DescriptionAssignment_9 )? )
            {
            // InternalWeebADoodle.g:1107:1: ( ( rule__Character__DescriptionAssignment_9 )? )
            // InternalWeebADoodle.g:1108:2: ( rule__Character__DescriptionAssignment_9 )?
            {
             before(grammarAccess.getCharacterAccess().getDescriptionAssignment_9()); 
            // InternalWeebADoodle.g:1109:2: ( rule__Character__DescriptionAssignment_9 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalWeebADoodle.g:1109:3: rule__Character__DescriptionAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Character__DescriptionAssignment_9();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getDescriptionAssignment_9()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1117:1: rule__Character__Group__10 : rule__Character__Group__10__Impl ;
    public final void rule__Character__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1121:1: ( rule__Character__Group__10__Impl )
            // InternalWeebADoodle.g:1122:2: rule__Character__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__10__Impl();

            state._fsp--;


            }

        }
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
    // InternalWeebADoodle.g:1128:1: rule__Character__Group__10__Impl : ( '}' ) ;
    public final void rule__Character__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1132:1: ( ( '}' ) )
            // InternalWeebADoodle.g:1133:1: ( '}' )
            {
            // InternalWeebADoodle.g:1133:1: ( '}' )
            // InternalWeebADoodle.g:1134:2: '}'
            {
             before(grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
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


    // $ANTLR start "rule__SceneObject__Group__0"
    // InternalWeebADoodle.g:1144:1: rule__SceneObject__Group__0 : rule__SceneObject__Group__0__Impl rule__SceneObject__Group__1 ;
    public final void rule__SceneObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1148:1: ( rule__SceneObject__Group__0__Impl rule__SceneObject__Group__1 )
            // InternalWeebADoodle.g:1149:2: rule__SceneObject__Group__0__Impl rule__SceneObject__Group__1
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
    // InternalWeebADoodle.g:1156:1: rule__SceneObject__Group__0__Impl : ( 'object' ) ;
    public final void rule__SceneObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1160:1: ( ( 'object' ) )
            // InternalWeebADoodle.g:1161:1: ( 'object' )
            {
            // InternalWeebADoodle.g:1161:1: ( 'object' )
            // InternalWeebADoodle.g:1162:2: 'object'
            {
             before(grammarAccess.getSceneObjectAccess().getObjectKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalWeebADoodle.g:1171:1: rule__SceneObject__Group__1 : rule__SceneObject__Group__1__Impl rule__SceneObject__Group__2 ;
    public final void rule__SceneObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1175:1: ( rule__SceneObject__Group__1__Impl rule__SceneObject__Group__2 )
            // InternalWeebADoodle.g:1176:2: rule__SceneObject__Group__1__Impl rule__SceneObject__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalWeebADoodle.g:1183:1: rule__SceneObject__Group__1__Impl : ( '{' ) ;
    public final void rule__SceneObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1187:1: ( ( '{' ) )
            // InternalWeebADoodle.g:1188:1: ( '{' )
            {
            // InternalWeebADoodle.g:1188:1: ( '{' )
            // InternalWeebADoodle.g:1189:2: '{'
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
    // InternalWeebADoodle.g:1198:1: rule__SceneObject__Group__2 : rule__SceneObject__Group__2__Impl rule__SceneObject__Group__3 ;
    public final void rule__SceneObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1202:1: ( rule__SceneObject__Group__2__Impl rule__SceneObject__Group__3 )
            // InternalWeebADoodle.g:1203:2: rule__SceneObject__Group__2__Impl rule__SceneObject__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalWeebADoodle.g:1210:1: rule__SceneObject__Group__2__Impl : ( ( rule__SceneObject__NameAssignment_2 ) ) ;
    public final void rule__SceneObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1214:1: ( ( ( rule__SceneObject__NameAssignment_2 ) ) )
            // InternalWeebADoodle.g:1215:1: ( ( rule__SceneObject__NameAssignment_2 ) )
            {
            // InternalWeebADoodle.g:1215:1: ( ( rule__SceneObject__NameAssignment_2 ) )
            // InternalWeebADoodle.g:1216:2: ( rule__SceneObject__NameAssignment_2 )
            {
             before(grammarAccess.getSceneObjectAccess().getNameAssignment_2()); 
            // InternalWeebADoodle.g:1217:2: ( rule__SceneObject__NameAssignment_2 )
            // InternalWeebADoodle.g:1217:3: rule__SceneObject__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSceneObjectAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1225:1: rule__SceneObject__Group__3 : rule__SceneObject__Group__3__Impl rule__SceneObject__Group__4 ;
    public final void rule__SceneObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1229:1: ( rule__SceneObject__Group__3__Impl rule__SceneObject__Group__4 )
            // InternalWeebADoodle.g:1230:2: rule__SceneObject__Group__3__Impl rule__SceneObject__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalWeebADoodle.g:1237:1: rule__SceneObject__Group__3__Impl : ( 'name:' ) ;
    public final void rule__SceneObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1241:1: ( ( 'name:' ) )
            // InternalWeebADoodle.g:1242:1: ( 'name:' )
            {
            // InternalWeebADoodle.g:1242:1: ( 'name:' )
            // InternalWeebADoodle.g:1243:2: 'name:'
            {
             before(grammarAccess.getSceneObjectAccess().getNameKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getNameKeyword_3()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1252:1: rule__SceneObject__Group__4 : rule__SceneObject__Group__4__Impl rule__SceneObject__Group__5 ;
    public final void rule__SceneObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1256:1: ( rule__SceneObject__Group__4__Impl rule__SceneObject__Group__5 )
            // InternalWeebADoodle.g:1257:2: rule__SceneObject__Group__4__Impl rule__SceneObject__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalWeebADoodle.g:1264:1: rule__SceneObject__Group__4__Impl : ( ( rule__SceneObject__ValueAssignment_4 ) ) ;
    public final void rule__SceneObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1268:1: ( ( ( rule__SceneObject__ValueAssignment_4 ) ) )
            // InternalWeebADoodle.g:1269:1: ( ( rule__SceneObject__ValueAssignment_4 ) )
            {
            // InternalWeebADoodle.g:1269:1: ( ( rule__SceneObject__ValueAssignment_4 ) )
            // InternalWeebADoodle.g:1270:2: ( rule__SceneObject__ValueAssignment_4 )
            {
             before(grammarAccess.getSceneObjectAccess().getValueAssignment_4()); 
            // InternalWeebADoodle.g:1271:2: ( rule__SceneObject__ValueAssignment_4 )
            // InternalWeebADoodle.g:1271:3: rule__SceneObject__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSceneObjectAccess().getValueAssignment_4()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1279:1: rule__SceneObject__Group__5 : rule__SceneObject__Group__5__Impl rule__SceneObject__Group__6 ;
    public final void rule__SceneObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1283:1: ( rule__SceneObject__Group__5__Impl rule__SceneObject__Group__6 )
            // InternalWeebADoodle.g:1284:2: rule__SceneObject__Group__5__Impl rule__SceneObject__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalWeebADoodle.g:1291:1: rule__SceneObject__Group__5__Impl : ( ';' ) ;
    public final void rule__SceneObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1295:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1296:1: ( ';' )
            {
            // InternalWeebADoodle.g:1296:1: ( ';' )
            // InternalWeebADoodle.g:1297:2: ';'
            {
             before(grammarAccess.getSceneObjectAccess().getSemicolonKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1306:1: rule__SceneObject__Group__6 : rule__SceneObject__Group__6__Impl rule__SceneObject__Group__7 ;
    public final void rule__SceneObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1310:1: ( rule__SceneObject__Group__6__Impl rule__SceneObject__Group__7 )
            // InternalWeebADoodle.g:1311:2: rule__SceneObject__Group__6__Impl rule__SceneObject__Group__7
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
    // InternalWeebADoodle.g:1318:1: rule__SceneObject__Group__6__Impl : ( ( rule__SceneObject__PositionAssignment_6 ) ) ;
    public final void rule__SceneObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1322:1: ( ( ( rule__SceneObject__PositionAssignment_6 ) ) )
            // InternalWeebADoodle.g:1323:1: ( ( rule__SceneObject__PositionAssignment_6 ) )
            {
            // InternalWeebADoodle.g:1323:1: ( ( rule__SceneObject__PositionAssignment_6 ) )
            // InternalWeebADoodle.g:1324:2: ( rule__SceneObject__PositionAssignment_6 )
            {
             before(grammarAccess.getSceneObjectAccess().getPositionAssignment_6()); 
            // InternalWeebADoodle.g:1325:2: ( rule__SceneObject__PositionAssignment_6 )
            // InternalWeebADoodle.g:1325:3: rule__SceneObject__PositionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__PositionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSceneObjectAccess().getPositionAssignment_6()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1333:1: rule__SceneObject__Group__7 : rule__SceneObject__Group__7__Impl rule__SceneObject__Group__8 ;
    public final void rule__SceneObject__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1337:1: ( rule__SceneObject__Group__7__Impl rule__SceneObject__Group__8 )
            // InternalWeebADoodle.g:1338:2: rule__SceneObject__Group__7__Impl rule__SceneObject__Group__8
            {
            pushFollow(FOLLOW_7);
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
    // InternalWeebADoodle.g:1345:1: rule__SceneObject__Group__7__Impl : ( ( rule__SceneObject__DescriptionAssignment_7 ) ) ;
    public final void rule__SceneObject__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1349:1: ( ( ( rule__SceneObject__DescriptionAssignment_7 ) ) )
            // InternalWeebADoodle.g:1350:1: ( ( rule__SceneObject__DescriptionAssignment_7 ) )
            {
            // InternalWeebADoodle.g:1350:1: ( ( rule__SceneObject__DescriptionAssignment_7 ) )
            // InternalWeebADoodle.g:1351:2: ( rule__SceneObject__DescriptionAssignment_7 )
            {
             before(grammarAccess.getSceneObjectAccess().getDescriptionAssignment_7()); 
            // InternalWeebADoodle.g:1352:2: ( rule__SceneObject__DescriptionAssignment_7 )
            // InternalWeebADoodle.g:1352:3: rule__SceneObject__DescriptionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__DescriptionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSceneObjectAccess().getDescriptionAssignment_7()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1360:1: rule__SceneObject__Group__8 : rule__SceneObject__Group__8__Impl ;
    public final void rule__SceneObject__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1364:1: ( rule__SceneObject__Group__8__Impl )
            // InternalWeebADoodle.g:1365:2: rule__SceneObject__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SceneObject__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalWeebADoodle.g:1371:1: rule__SceneObject__Group__8__Impl : ( '}' ) ;
    public final void rule__SceneObject__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1375:1: ( ( '}' ) )
            // InternalWeebADoodle.g:1376:1: ( '}' )
            {
            // InternalWeebADoodle.g:1376:1: ( '}' )
            // InternalWeebADoodle.g:1377:2: '}'
            {
             before(grammarAccess.getSceneObjectAccess().getRightCurlyBracketKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Setting__Group__0"
    // InternalWeebADoodle.g:1387:1: rule__Setting__Group__0 : rule__Setting__Group__0__Impl rule__Setting__Group__1 ;
    public final void rule__Setting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1391:1: ( rule__Setting__Group__0__Impl rule__Setting__Group__1 )
            // InternalWeebADoodle.g:1392:2: rule__Setting__Group__0__Impl rule__Setting__Group__1
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
    // InternalWeebADoodle.g:1399:1: rule__Setting__Group__0__Impl : ( 'setting' ) ;
    public final void rule__Setting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1403:1: ( ( 'setting' ) )
            // InternalWeebADoodle.g:1404:1: ( 'setting' )
            {
            // InternalWeebADoodle.g:1404:1: ( 'setting' )
            // InternalWeebADoodle.g:1405:2: 'setting'
            {
             before(grammarAccess.getSettingAccess().getSettingKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalWeebADoodle.g:1414:1: rule__Setting__Group__1 : rule__Setting__Group__1__Impl rule__Setting__Group__2 ;
    public final void rule__Setting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1418:1: ( rule__Setting__Group__1__Impl rule__Setting__Group__2 )
            // InternalWeebADoodle.g:1419:2: rule__Setting__Group__1__Impl rule__Setting__Group__2
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
    // InternalWeebADoodle.g:1426:1: rule__Setting__Group__1__Impl : ( '{' ) ;
    public final void rule__Setting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1430:1: ( ( '{' ) )
            // InternalWeebADoodle.g:1431:1: ( '{' )
            {
            // InternalWeebADoodle.g:1431:1: ( '{' )
            // InternalWeebADoodle.g:1432:2: '{'
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
    // InternalWeebADoodle.g:1441:1: rule__Setting__Group__2 : rule__Setting__Group__2__Impl rule__Setting__Group__3 ;
    public final void rule__Setting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1445:1: ( rule__Setting__Group__2__Impl rule__Setting__Group__3 )
            // InternalWeebADoodle.g:1446:2: rule__Setting__Group__2__Impl rule__Setting__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalWeebADoodle.g:1453:1: rule__Setting__Group__2__Impl : ( ( rule__Setting__CameraAssignment_2 ) ) ;
    public final void rule__Setting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1457:1: ( ( ( rule__Setting__CameraAssignment_2 ) ) )
            // InternalWeebADoodle.g:1458:1: ( ( rule__Setting__CameraAssignment_2 ) )
            {
            // InternalWeebADoodle.g:1458:1: ( ( rule__Setting__CameraAssignment_2 ) )
            // InternalWeebADoodle.g:1459:2: ( rule__Setting__CameraAssignment_2 )
            {
             before(grammarAccess.getSettingAccess().getCameraAssignment_2()); 
            // InternalWeebADoodle.g:1460:2: ( rule__Setting__CameraAssignment_2 )
            // InternalWeebADoodle.g:1460:3: rule__Setting__CameraAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Setting__CameraAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getCameraAssignment_2()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1468:1: rule__Setting__Group__3 : rule__Setting__Group__3__Impl rule__Setting__Group__4 ;
    public final void rule__Setting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1472:1: ( rule__Setting__Group__3__Impl rule__Setting__Group__4 )
            // InternalWeebADoodle.g:1473:2: rule__Setting__Group__3__Impl rule__Setting__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalWeebADoodle.g:1480:1: rule__Setting__Group__3__Impl : ( ( rule__Setting__LightingAssignment_3 ) ) ;
    public final void rule__Setting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1484:1: ( ( ( rule__Setting__LightingAssignment_3 ) ) )
            // InternalWeebADoodle.g:1485:1: ( ( rule__Setting__LightingAssignment_3 ) )
            {
            // InternalWeebADoodle.g:1485:1: ( ( rule__Setting__LightingAssignment_3 ) )
            // InternalWeebADoodle.g:1486:2: ( rule__Setting__LightingAssignment_3 )
            {
             before(grammarAccess.getSettingAccess().getLightingAssignment_3()); 
            // InternalWeebADoodle.g:1487:2: ( rule__Setting__LightingAssignment_3 )
            // InternalWeebADoodle.g:1487:3: rule__Setting__LightingAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Setting__LightingAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getLightingAssignment_3()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1495:1: rule__Setting__Group__4 : rule__Setting__Group__4__Impl rule__Setting__Group__5 ;
    public final void rule__Setting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1499:1: ( rule__Setting__Group__4__Impl rule__Setting__Group__5 )
            // InternalWeebADoodle.g:1500:2: rule__Setting__Group__4__Impl rule__Setting__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalWeebADoodle.g:1507:1: rule__Setting__Group__4__Impl : ( ( rule__Setting__DescriptionAssignment_4 ) ) ;
    public final void rule__Setting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1511:1: ( ( ( rule__Setting__DescriptionAssignment_4 ) ) )
            // InternalWeebADoodle.g:1512:1: ( ( rule__Setting__DescriptionAssignment_4 ) )
            {
            // InternalWeebADoodle.g:1512:1: ( ( rule__Setting__DescriptionAssignment_4 ) )
            // InternalWeebADoodle.g:1513:2: ( rule__Setting__DescriptionAssignment_4 )
            {
             before(grammarAccess.getSettingAccess().getDescriptionAssignment_4()); 
            // InternalWeebADoodle.g:1514:2: ( rule__Setting__DescriptionAssignment_4 )
            // InternalWeebADoodle.g:1514:3: rule__Setting__DescriptionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Setting__DescriptionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSettingAccess().getDescriptionAssignment_4()); 

            }


            }

        }
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
    // InternalWeebADoodle.g:1522:1: rule__Setting__Group__5 : rule__Setting__Group__5__Impl ;
    public final void rule__Setting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1526:1: ( rule__Setting__Group__5__Impl )
            // InternalWeebADoodle.g:1527:2: rule__Setting__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Setting__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalWeebADoodle.g:1533:1: rule__Setting__Group__5__Impl : ( '}' ) ;
    public final void rule__Setting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1537:1: ( ( '}' ) )
            // InternalWeebADoodle.g:1538:1: ( '}' )
            {
            // InternalWeebADoodle.g:1538:1: ( '}' )
            // InternalWeebADoodle.g:1539:2: '}'
            {
             before(grammarAccess.getSettingAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSettingAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__DescriptionStatement__Group__0"
    // InternalWeebADoodle.g:1549:1: rule__DescriptionStatement__Group__0 : rule__DescriptionStatement__Group__0__Impl rule__DescriptionStatement__Group__1 ;
    public final void rule__DescriptionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1553:1: ( rule__DescriptionStatement__Group__0__Impl rule__DescriptionStatement__Group__1 )
            // InternalWeebADoodle.g:1554:2: rule__DescriptionStatement__Group__0__Impl rule__DescriptionStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DescriptionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionStatement__Group__0"


    // $ANTLR start "rule__DescriptionStatement__Group__0__Impl"
    // InternalWeebADoodle.g:1561:1: rule__DescriptionStatement__Group__0__Impl : ( 'description:' ) ;
    public final void rule__DescriptionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1565:1: ( ( 'description:' ) )
            // InternalWeebADoodle.g:1566:1: ( 'description:' )
            {
            // InternalWeebADoodle.g:1566:1: ( 'description:' )
            // InternalWeebADoodle.g:1567:2: 'description:'
            {
             before(grammarAccess.getDescriptionStatementAccess().getDescriptionKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDescriptionStatementAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionStatement__Group__0__Impl"


    // $ANTLR start "rule__DescriptionStatement__Group__1"
    // InternalWeebADoodle.g:1576:1: rule__DescriptionStatement__Group__1 : rule__DescriptionStatement__Group__1__Impl rule__DescriptionStatement__Group__2 ;
    public final void rule__DescriptionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1580:1: ( rule__DescriptionStatement__Group__1__Impl rule__DescriptionStatement__Group__2 )
            // InternalWeebADoodle.g:1581:2: rule__DescriptionStatement__Group__1__Impl rule__DescriptionStatement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DescriptionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptionStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionStatement__Group__1"


    // $ANTLR start "rule__DescriptionStatement__Group__1__Impl"
    // InternalWeebADoodle.g:1588:1: rule__DescriptionStatement__Group__1__Impl : ( ( rule__DescriptionStatement__DescriptionAssignment_1 ) ) ;
    public final void rule__DescriptionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1592:1: ( ( ( rule__DescriptionStatement__DescriptionAssignment_1 ) ) )
            // InternalWeebADoodle.g:1593:1: ( ( rule__DescriptionStatement__DescriptionAssignment_1 ) )
            {
            // InternalWeebADoodle.g:1593:1: ( ( rule__DescriptionStatement__DescriptionAssignment_1 ) )
            // InternalWeebADoodle.g:1594:2: ( rule__DescriptionStatement__DescriptionAssignment_1 )
            {
             before(grammarAccess.getDescriptionStatementAccess().getDescriptionAssignment_1()); 
            // InternalWeebADoodle.g:1595:2: ( rule__DescriptionStatement__DescriptionAssignment_1 )
            // InternalWeebADoodle.g:1595:3: rule__DescriptionStatement__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionStatement__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionStatementAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionStatement__Group__1__Impl"


    // $ANTLR start "rule__DescriptionStatement__Group__2"
    // InternalWeebADoodle.g:1603:1: rule__DescriptionStatement__Group__2 : rule__DescriptionStatement__Group__2__Impl ;
    public final void rule__DescriptionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1607:1: ( rule__DescriptionStatement__Group__2__Impl )
            // InternalWeebADoodle.g:1608:2: rule__DescriptionStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DescriptionStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionStatement__Group__2"


    // $ANTLR start "rule__DescriptionStatement__Group__2__Impl"
    // InternalWeebADoodle.g:1614:1: rule__DescriptionStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__DescriptionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1618:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1619:1: ( ';' )
            {
            // InternalWeebADoodle.g:1619:1: ( ';' )
            // InternalWeebADoodle.g:1620:2: ';'
            {
             before(grammarAccess.getDescriptionStatementAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDescriptionStatementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionStatement__Group__2__Impl"


    // $ANTLR start "rule__DialogueStatement__Group__0"
    // InternalWeebADoodle.g:1630:1: rule__DialogueStatement__Group__0 : rule__DialogueStatement__Group__0__Impl rule__DialogueStatement__Group__1 ;
    public final void rule__DialogueStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1634:1: ( rule__DialogueStatement__Group__0__Impl rule__DialogueStatement__Group__1 )
            // InternalWeebADoodle.g:1635:2: rule__DialogueStatement__Group__0__Impl rule__DialogueStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DialogueStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DialogueStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogueStatement__Group__0"


    // $ANTLR start "rule__DialogueStatement__Group__0__Impl"
    // InternalWeebADoodle.g:1642:1: rule__DialogueStatement__Group__0__Impl : ( 'dialogue:' ) ;
    public final void rule__DialogueStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1646:1: ( ( 'dialogue:' ) )
            // InternalWeebADoodle.g:1647:1: ( 'dialogue:' )
            {
            // InternalWeebADoodle.g:1647:1: ( 'dialogue:' )
            // InternalWeebADoodle.g:1648:2: 'dialogue:'
            {
             before(grammarAccess.getDialogueStatementAccess().getDialogueKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDialogueStatementAccess().getDialogueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogueStatement__Group__0__Impl"


    // $ANTLR start "rule__DialogueStatement__Group__1"
    // InternalWeebADoodle.g:1657:1: rule__DialogueStatement__Group__1 : rule__DialogueStatement__Group__1__Impl rule__DialogueStatement__Group__2 ;
    public final void rule__DialogueStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1661:1: ( rule__DialogueStatement__Group__1__Impl rule__DialogueStatement__Group__2 )
            // InternalWeebADoodle.g:1662:2: rule__DialogueStatement__Group__1__Impl rule__DialogueStatement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DialogueStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DialogueStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogueStatement__Group__1"


    // $ANTLR start "rule__DialogueStatement__Group__1__Impl"
    // InternalWeebADoodle.g:1669:1: rule__DialogueStatement__Group__1__Impl : ( ( rule__DialogueStatement__DialogueAssignment_1 ) ) ;
    public final void rule__DialogueStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1673:1: ( ( ( rule__DialogueStatement__DialogueAssignment_1 ) ) )
            // InternalWeebADoodle.g:1674:1: ( ( rule__DialogueStatement__DialogueAssignment_1 ) )
            {
            // InternalWeebADoodle.g:1674:1: ( ( rule__DialogueStatement__DialogueAssignment_1 ) )
            // InternalWeebADoodle.g:1675:2: ( rule__DialogueStatement__DialogueAssignment_1 )
            {
             before(grammarAccess.getDialogueStatementAccess().getDialogueAssignment_1()); 
            // InternalWeebADoodle.g:1676:2: ( rule__DialogueStatement__DialogueAssignment_1 )
            // InternalWeebADoodle.g:1676:3: rule__DialogueStatement__DialogueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DialogueStatement__DialogueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDialogueStatementAccess().getDialogueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogueStatement__Group__1__Impl"


    // $ANTLR start "rule__DialogueStatement__Group__2"
    // InternalWeebADoodle.g:1684:1: rule__DialogueStatement__Group__2 : rule__DialogueStatement__Group__2__Impl ;
    public final void rule__DialogueStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1688:1: ( rule__DialogueStatement__Group__2__Impl )
            // InternalWeebADoodle.g:1689:2: rule__DialogueStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DialogueStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogueStatement__Group__2"


    // $ANTLR start "rule__DialogueStatement__Group__2__Impl"
    // InternalWeebADoodle.g:1695:1: rule__DialogueStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__DialogueStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1699:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1700:1: ( ';' )
            {
            // InternalWeebADoodle.g:1700:1: ( ';' )
            // InternalWeebADoodle.g:1701:2: ';'
            {
             before(grammarAccess.getDialogueStatementAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDialogueStatementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogueStatement__Group__2__Impl"


    // $ANTLR start "rule__ActionStatement__Group__0"
    // InternalWeebADoodle.g:1711:1: rule__ActionStatement__Group__0 : rule__ActionStatement__Group__0__Impl rule__ActionStatement__Group__1 ;
    public final void rule__ActionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1715:1: ( rule__ActionStatement__Group__0__Impl rule__ActionStatement__Group__1 )
            // InternalWeebADoodle.g:1716:2: rule__ActionStatement__Group__0__Impl rule__ActionStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ActionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStatement__Group__0"


    // $ANTLR start "rule__ActionStatement__Group__0__Impl"
    // InternalWeebADoodle.g:1723:1: rule__ActionStatement__Group__0__Impl : ( 'action:' ) ;
    public final void rule__ActionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1727:1: ( ( 'action:' ) )
            // InternalWeebADoodle.g:1728:1: ( 'action:' )
            {
            // InternalWeebADoodle.g:1728:1: ( 'action:' )
            // InternalWeebADoodle.g:1729:2: 'action:'
            {
             before(grammarAccess.getActionStatementAccess().getActionKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActionStatementAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStatement__Group__0__Impl"


    // $ANTLR start "rule__ActionStatement__Group__1"
    // InternalWeebADoodle.g:1738:1: rule__ActionStatement__Group__1 : rule__ActionStatement__Group__1__Impl rule__ActionStatement__Group__2 ;
    public final void rule__ActionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1742:1: ( rule__ActionStatement__Group__1__Impl rule__ActionStatement__Group__2 )
            // InternalWeebADoodle.g:1743:2: rule__ActionStatement__Group__1__Impl rule__ActionStatement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ActionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStatement__Group__1"


    // $ANTLR start "rule__ActionStatement__Group__1__Impl"
    // InternalWeebADoodle.g:1750:1: rule__ActionStatement__Group__1__Impl : ( ( rule__ActionStatement__ActionAssignment_1 ) ) ;
    public final void rule__ActionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1754:1: ( ( ( rule__ActionStatement__ActionAssignment_1 ) ) )
            // InternalWeebADoodle.g:1755:1: ( ( rule__ActionStatement__ActionAssignment_1 ) )
            {
            // InternalWeebADoodle.g:1755:1: ( ( rule__ActionStatement__ActionAssignment_1 ) )
            // InternalWeebADoodle.g:1756:2: ( rule__ActionStatement__ActionAssignment_1 )
            {
             before(grammarAccess.getActionStatementAccess().getActionAssignment_1()); 
            // InternalWeebADoodle.g:1757:2: ( rule__ActionStatement__ActionAssignment_1 )
            // InternalWeebADoodle.g:1757:3: rule__ActionStatement__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionStatement__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionStatementAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStatement__Group__1__Impl"


    // $ANTLR start "rule__ActionStatement__Group__2"
    // InternalWeebADoodle.g:1765:1: rule__ActionStatement__Group__2 : rule__ActionStatement__Group__2__Impl ;
    public final void rule__ActionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1769:1: ( rule__ActionStatement__Group__2__Impl )
            // InternalWeebADoodle.g:1770:2: rule__ActionStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStatement__Group__2"


    // $ANTLR start "rule__ActionStatement__Group__2__Impl"
    // InternalWeebADoodle.g:1776:1: rule__ActionStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__ActionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1780:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1781:1: ( ';' )
            {
            // InternalWeebADoodle.g:1781:1: ( ';' )
            // InternalWeebADoodle.g:1782:2: ';'
            {
             before(grammarAccess.getActionStatementAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getActionStatementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStatement__Group__2__Impl"


    // $ANTLR start "rule__PositionStatement__Group__0"
    // InternalWeebADoodle.g:1792:1: rule__PositionStatement__Group__0 : rule__PositionStatement__Group__0__Impl rule__PositionStatement__Group__1 ;
    public final void rule__PositionStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1796:1: ( rule__PositionStatement__Group__0__Impl rule__PositionStatement__Group__1 )
            // InternalWeebADoodle.g:1797:2: rule__PositionStatement__Group__0__Impl rule__PositionStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PositionStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionStatement__Group__0"


    // $ANTLR start "rule__PositionStatement__Group__0__Impl"
    // InternalWeebADoodle.g:1804:1: rule__PositionStatement__Group__0__Impl : ( 'position:' ) ;
    public final void rule__PositionStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1808:1: ( ( 'position:' ) )
            // InternalWeebADoodle.g:1809:1: ( 'position:' )
            {
            // InternalWeebADoodle.g:1809:1: ( 'position:' )
            // InternalWeebADoodle.g:1810:2: 'position:'
            {
             before(grammarAccess.getPositionStatementAccess().getPositionKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPositionStatementAccess().getPositionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionStatement__Group__0__Impl"


    // $ANTLR start "rule__PositionStatement__Group__1"
    // InternalWeebADoodle.g:1819:1: rule__PositionStatement__Group__1 : rule__PositionStatement__Group__1__Impl rule__PositionStatement__Group__2 ;
    public final void rule__PositionStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1823:1: ( rule__PositionStatement__Group__1__Impl rule__PositionStatement__Group__2 )
            // InternalWeebADoodle.g:1824:2: rule__PositionStatement__Group__1__Impl rule__PositionStatement__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__PositionStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PositionStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionStatement__Group__1"


    // $ANTLR start "rule__PositionStatement__Group__1__Impl"
    // InternalWeebADoodle.g:1831:1: rule__PositionStatement__Group__1__Impl : ( ( rule__PositionStatement__PositionAssignment_1 ) ) ;
    public final void rule__PositionStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1835:1: ( ( ( rule__PositionStatement__PositionAssignment_1 ) ) )
            // InternalWeebADoodle.g:1836:1: ( ( rule__PositionStatement__PositionAssignment_1 ) )
            {
            // InternalWeebADoodle.g:1836:1: ( ( rule__PositionStatement__PositionAssignment_1 ) )
            // InternalWeebADoodle.g:1837:2: ( rule__PositionStatement__PositionAssignment_1 )
            {
             before(grammarAccess.getPositionStatementAccess().getPositionAssignment_1()); 
            // InternalWeebADoodle.g:1838:2: ( rule__PositionStatement__PositionAssignment_1 )
            // InternalWeebADoodle.g:1838:3: rule__PositionStatement__PositionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PositionStatement__PositionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPositionStatementAccess().getPositionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionStatement__Group__1__Impl"


    // $ANTLR start "rule__PositionStatement__Group__2"
    // InternalWeebADoodle.g:1846:1: rule__PositionStatement__Group__2 : rule__PositionStatement__Group__2__Impl ;
    public final void rule__PositionStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1850:1: ( rule__PositionStatement__Group__2__Impl )
            // InternalWeebADoodle.g:1851:2: rule__PositionStatement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PositionStatement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionStatement__Group__2"


    // $ANTLR start "rule__PositionStatement__Group__2__Impl"
    // InternalWeebADoodle.g:1857:1: rule__PositionStatement__Group__2__Impl : ( ';' ) ;
    public final void rule__PositionStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1861:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1862:1: ( ';' )
            {
            // InternalWeebADoodle.g:1862:1: ( ';' )
            // InternalWeebADoodle.g:1863:2: ';'
            {
             before(grammarAccess.getPositionStatementAccess().getSemicolonKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPositionStatementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionStatement__Group__2__Impl"


    // $ANTLR start "rule__CameraShotStatement__Group__0"
    // InternalWeebADoodle.g:1873:1: rule__CameraShotStatement__Group__0 : rule__CameraShotStatement__Group__0__Impl rule__CameraShotStatement__Group__1 ;
    public final void rule__CameraShotStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1877:1: ( rule__CameraShotStatement__Group__0__Impl rule__CameraShotStatement__Group__1 )
            // InternalWeebADoodle.g:1878:2: rule__CameraShotStatement__Group__0__Impl rule__CameraShotStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CameraShotStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraShotStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group__0"


    // $ANTLR start "rule__CameraShotStatement__Group__0__Impl"
    // InternalWeebADoodle.g:1885:1: rule__CameraShotStatement__Group__0__Impl : ( 'camera:' ) ;
    public final void rule__CameraShotStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1889:1: ( ( 'camera:' ) )
            // InternalWeebADoodle.g:1890:1: ( 'camera:' )
            {
            // InternalWeebADoodle.g:1890:1: ( 'camera:' )
            // InternalWeebADoodle.g:1891:2: 'camera:'
            {
             before(grammarAccess.getCameraShotStatementAccess().getCameraKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCameraShotStatementAccess().getCameraKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group__0__Impl"


    // $ANTLR start "rule__CameraShotStatement__Group__1"
    // InternalWeebADoodle.g:1900:1: rule__CameraShotStatement__Group__1 : rule__CameraShotStatement__Group__1__Impl rule__CameraShotStatement__Group__2 ;
    public final void rule__CameraShotStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1904:1: ( rule__CameraShotStatement__Group__1__Impl rule__CameraShotStatement__Group__2 )
            // InternalWeebADoodle.g:1905:2: rule__CameraShotStatement__Group__1__Impl rule__CameraShotStatement__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__CameraShotStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraShotStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group__1"


    // $ANTLR start "rule__CameraShotStatement__Group__1__Impl"
    // InternalWeebADoodle.g:1912:1: rule__CameraShotStatement__Group__1__Impl : ( ( rule__CameraShotStatement__CameraShotAssignment_1 ) ) ;
    public final void rule__CameraShotStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1916:1: ( ( ( rule__CameraShotStatement__CameraShotAssignment_1 ) ) )
            // InternalWeebADoodle.g:1917:1: ( ( rule__CameraShotStatement__CameraShotAssignment_1 ) )
            {
            // InternalWeebADoodle.g:1917:1: ( ( rule__CameraShotStatement__CameraShotAssignment_1 ) )
            // InternalWeebADoodle.g:1918:2: ( rule__CameraShotStatement__CameraShotAssignment_1 )
            {
             before(grammarAccess.getCameraShotStatementAccess().getCameraShotAssignment_1()); 
            // InternalWeebADoodle.g:1919:2: ( rule__CameraShotStatement__CameraShotAssignment_1 )
            // InternalWeebADoodle.g:1919:3: rule__CameraShotStatement__CameraShotAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CameraShotStatement__CameraShotAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCameraShotStatementAccess().getCameraShotAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group__1__Impl"


    // $ANTLR start "rule__CameraShotStatement__Group__2"
    // InternalWeebADoodle.g:1927:1: rule__CameraShotStatement__Group__2 : rule__CameraShotStatement__Group__2__Impl rule__CameraShotStatement__Group__3 ;
    public final void rule__CameraShotStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1931:1: ( rule__CameraShotStatement__Group__2__Impl rule__CameraShotStatement__Group__3 )
            // InternalWeebADoodle.g:1932:2: rule__CameraShotStatement__Group__2__Impl rule__CameraShotStatement__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__CameraShotStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraShotStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group__2"


    // $ANTLR start "rule__CameraShotStatement__Group__2__Impl"
    // InternalWeebADoodle.g:1939:1: rule__CameraShotStatement__Group__2__Impl : ( ( rule__CameraShotStatement__Group_2__0 )? ) ;
    public final void rule__CameraShotStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1943:1: ( ( ( rule__CameraShotStatement__Group_2__0 )? ) )
            // InternalWeebADoodle.g:1944:1: ( ( rule__CameraShotStatement__Group_2__0 )? )
            {
            // InternalWeebADoodle.g:1944:1: ( ( rule__CameraShotStatement__Group_2__0 )? )
            // InternalWeebADoodle.g:1945:2: ( rule__CameraShotStatement__Group_2__0 )?
            {
             before(grammarAccess.getCameraShotStatementAccess().getGroup_2()); 
            // InternalWeebADoodle.g:1946:2: ( rule__CameraShotStatement__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalWeebADoodle.g:1946:3: rule__CameraShotStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CameraShotStatement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCameraShotStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group__2__Impl"


    // $ANTLR start "rule__CameraShotStatement__Group__3"
    // InternalWeebADoodle.g:1954:1: rule__CameraShotStatement__Group__3 : rule__CameraShotStatement__Group__3__Impl ;
    public final void rule__CameraShotStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1958:1: ( rule__CameraShotStatement__Group__3__Impl )
            // InternalWeebADoodle.g:1959:2: rule__CameraShotStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CameraShotStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group__3"


    // $ANTLR start "rule__CameraShotStatement__Group__3__Impl"
    // InternalWeebADoodle.g:1965:1: rule__CameraShotStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__CameraShotStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1969:1: ( ( ';' ) )
            // InternalWeebADoodle.g:1970:1: ( ';' )
            {
            // InternalWeebADoodle.g:1970:1: ( ';' )
            // InternalWeebADoodle.g:1971:2: ';'
            {
             before(grammarAccess.getCameraShotStatementAccess().getSemicolonKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCameraShotStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group__3__Impl"


    // $ANTLR start "rule__CameraShotStatement__Group_2__0"
    // InternalWeebADoodle.g:1981:1: rule__CameraShotStatement__Group_2__0 : rule__CameraShotStatement__Group_2__0__Impl rule__CameraShotStatement__Group_2__1 ;
    public final void rule__CameraShotStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1985:1: ( rule__CameraShotStatement__Group_2__0__Impl rule__CameraShotStatement__Group_2__1 )
            // InternalWeebADoodle.g:1986:2: rule__CameraShotStatement__Group_2__0__Impl rule__CameraShotStatement__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__CameraShotStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CameraShotStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group_2__0"


    // $ANTLR start "rule__CameraShotStatement__Group_2__0__Impl"
    // InternalWeebADoodle.g:1993:1: rule__CameraShotStatement__Group_2__0__Impl : ( 'from' ) ;
    public final void rule__CameraShotStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:1997:1: ( ( 'from' ) )
            // InternalWeebADoodle.g:1998:1: ( 'from' )
            {
            // InternalWeebADoodle.g:1998:1: ( 'from' )
            // InternalWeebADoodle.g:1999:2: 'from'
            {
             before(grammarAccess.getCameraShotStatementAccess().getFromKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCameraShotStatementAccess().getFromKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group_2__0__Impl"


    // $ANTLR start "rule__CameraShotStatement__Group_2__1"
    // InternalWeebADoodle.g:2008:1: rule__CameraShotStatement__Group_2__1 : rule__CameraShotStatement__Group_2__1__Impl ;
    public final void rule__CameraShotStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2012:1: ( rule__CameraShotStatement__Group_2__1__Impl )
            // InternalWeebADoodle.g:2013:2: rule__CameraShotStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CameraShotStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group_2__1"


    // $ANTLR start "rule__CameraShotStatement__Group_2__1__Impl"
    // InternalWeebADoodle.g:2019:1: rule__CameraShotStatement__Group_2__1__Impl : ( ( rule__CameraShotStatement__CameraAngleAssignment_2_1 ) ) ;
    public final void rule__CameraShotStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2023:1: ( ( ( rule__CameraShotStatement__CameraAngleAssignment_2_1 ) ) )
            // InternalWeebADoodle.g:2024:1: ( ( rule__CameraShotStatement__CameraAngleAssignment_2_1 ) )
            {
            // InternalWeebADoodle.g:2024:1: ( ( rule__CameraShotStatement__CameraAngleAssignment_2_1 ) )
            // InternalWeebADoodle.g:2025:2: ( rule__CameraShotStatement__CameraAngleAssignment_2_1 )
            {
             before(grammarAccess.getCameraShotStatementAccess().getCameraAngleAssignment_2_1()); 
            // InternalWeebADoodle.g:2026:2: ( rule__CameraShotStatement__CameraAngleAssignment_2_1 )
            // InternalWeebADoodle.g:2026:3: rule__CameraShotStatement__CameraAngleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CameraShotStatement__CameraAngleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCameraShotStatementAccess().getCameraAngleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__Group_2__1__Impl"


    // $ANTLR start "rule__LightingStatement__Group__0"
    // InternalWeebADoodle.g:2035:1: rule__LightingStatement__Group__0 : rule__LightingStatement__Group__0__Impl rule__LightingStatement__Group__1 ;
    public final void rule__LightingStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2039:1: ( rule__LightingStatement__Group__0__Impl rule__LightingStatement__Group__1 )
            // InternalWeebADoodle.g:2040:2: rule__LightingStatement__Group__0__Impl rule__LightingStatement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__LightingStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightingStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group__0"


    // $ANTLR start "rule__LightingStatement__Group__0__Impl"
    // InternalWeebADoodle.g:2047:1: rule__LightingStatement__Group__0__Impl : ( 'lighting:' ) ;
    public final void rule__LightingStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2051:1: ( ( 'lighting:' ) )
            // InternalWeebADoodle.g:2052:1: ( 'lighting:' )
            {
            // InternalWeebADoodle.g:2052:1: ( 'lighting:' )
            // InternalWeebADoodle.g:2053:2: 'lighting:'
            {
             before(grammarAccess.getLightingStatementAccess().getLightingKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLightingStatementAccess().getLightingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group__0__Impl"


    // $ANTLR start "rule__LightingStatement__Group__1"
    // InternalWeebADoodle.g:2062:1: rule__LightingStatement__Group__1 : rule__LightingStatement__Group__1__Impl rule__LightingStatement__Group__2 ;
    public final void rule__LightingStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2066:1: ( rule__LightingStatement__Group__1__Impl rule__LightingStatement__Group__2 )
            // InternalWeebADoodle.g:2067:2: rule__LightingStatement__Group__1__Impl rule__LightingStatement__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__LightingStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightingStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group__1"


    // $ANTLR start "rule__LightingStatement__Group__1__Impl"
    // InternalWeebADoodle.g:2074:1: rule__LightingStatement__Group__1__Impl : ( ( rule__LightingStatement__SourceAssignment_1 ) ) ;
    public final void rule__LightingStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2078:1: ( ( ( rule__LightingStatement__SourceAssignment_1 ) ) )
            // InternalWeebADoodle.g:2079:1: ( ( rule__LightingStatement__SourceAssignment_1 ) )
            {
            // InternalWeebADoodle.g:2079:1: ( ( rule__LightingStatement__SourceAssignment_1 ) )
            // InternalWeebADoodle.g:2080:2: ( rule__LightingStatement__SourceAssignment_1 )
            {
             before(grammarAccess.getLightingStatementAccess().getSourceAssignment_1()); 
            // InternalWeebADoodle.g:2081:2: ( rule__LightingStatement__SourceAssignment_1 )
            // InternalWeebADoodle.g:2081:3: rule__LightingStatement__SourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LightingStatement__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLightingStatementAccess().getSourceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group__1__Impl"


    // $ANTLR start "rule__LightingStatement__Group__2"
    // InternalWeebADoodle.g:2089:1: rule__LightingStatement__Group__2 : rule__LightingStatement__Group__2__Impl rule__LightingStatement__Group__3 ;
    public final void rule__LightingStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2093:1: ( rule__LightingStatement__Group__2__Impl rule__LightingStatement__Group__3 )
            // InternalWeebADoodle.g:2094:2: rule__LightingStatement__Group__2__Impl rule__LightingStatement__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__LightingStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightingStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group__2"


    // $ANTLR start "rule__LightingStatement__Group__2__Impl"
    // InternalWeebADoodle.g:2101:1: rule__LightingStatement__Group__2__Impl : ( ( rule__LightingStatement__Group_2__0 )? ) ;
    public final void rule__LightingStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2105:1: ( ( ( rule__LightingStatement__Group_2__0 )? ) )
            // InternalWeebADoodle.g:2106:1: ( ( rule__LightingStatement__Group_2__0 )? )
            {
            // InternalWeebADoodle.g:2106:1: ( ( rule__LightingStatement__Group_2__0 )? )
            // InternalWeebADoodle.g:2107:2: ( rule__LightingStatement__Group_2__0 )?
            {
             before(grammarAccess.getLightingStatementAccess().getGroup_2()); 
            // InternalWeebADoodle.g:2108:2: ( rule__LightingStatement__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalWeebADoodle.g:2108:3: rule__LightingStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LightingStatement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLightingStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group__2__Impl"


    // $ANTLR start "rule__LightingStatement__Group__3"
    // InternalWeebADoodle.g:2116:1: rule__LightingStatement__Group__3 : rule__LightingStatement__Group__3__Impl ;
    public final void rule__LightingStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2120:1: ( rule__LightingStatement__Group__3__Impl )
            // InternalWeebADoodle.g:2121:2: rule__LightingStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightingStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group__3"


    // $ANTLR start "rule__LightingStatement__Group__3__Impl"
    // InternalWeebADoodle.g:2127:1: rule__LightingStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__LightingStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2131:1: ( ( ';' ) )
            // InternalWeebADoodle.g:2132:1: ( ';' )
            {
            // InternalWeebADoodle.g:2132:1: ( ';' )
            // InternalWeebADoodle.g:2133:2: ';'
            {
             before(grammarAccess.getLightingStatementAccess().getSemicolonKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLightingStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group__3__Impl"


    // $ANTLR start "rule__LightingStatement__Group_2__0"
    // InternalWeebADoodle.g:2143:1: rule__LightingStatement__Group_2__0 : rule__LightingStatement__Group_2__0__Impl rule__LightingStatement__Group_2__1 ;
    public final void rule__LightingStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2147:1: ( rule__LightingStatement__Group_2__0__Impl rule__LightingStatement__Group_2__1 )
            // InternalWeebADoodle.g:2148:2: rule__LightingStatement__Group_2__0__Impl rule__LightingStatement__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__LightingStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightingStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group_2__0"


    // $ANTLR start "rule__LightingStatement__Group_2__0__Impl"
    // InternalWeebADoodle.g:2155:1: rule__LightingStatement__Group_2__0__Impl : ( 'from' ) ;
    public final void rule__LightingStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2159:1: ( ( 'from' ) )
            // InternalWeebADoodle.g:2160:1: ( 'from' )
            {
            // InternalWeebADoodle.g:2160:1: ( 'from' )
            // InternalWeebADoodle.g:2161:2: 'from'
            {
             before(grammarAccess.getLightingStatementAccess().getFromKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLightingStatementAccess().getFromKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group_2__0__Impl"


    // $ANTLR start "rule__LightingStatement__Group_2__1"
    // InternalWeebADoodle.g:2170:1: rule__LightingStatement__Group_2__1 : rule__LightingStatement__Group_2__1__Impl ;
    public final void rule__LightingStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2174:1: ( rule__LightingStatement__Group_2__1__Impl )
            // InternalWeebADoodle.g:2175:2: rule__LightingStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightingStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group_2__1"


    // $ANTLR start "rule__LightingStatement__Group_2__1__Impl"
    // InternalWeebADoodle.g:2181:1: rule__LightingStatement__Group_2__1__Impl : ( ( rule__LightingStatement__DirectionAssignment_2_1 ) ) ;
    public final void rule__LightingStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2185:1: ( ( ( rule__LightingStatement__DirectionAssignment_2_1 ) ) )
            // InternalWeebADoodle.g:2186:1: ( ( rule__LightingStatement__DirectionAssignment_2_1 ) )
            {
            // InternalWeebADoodle.g:2186:1: ( ( rule__LightingStatement__DirectionAssignment_2_1 ) )
            // InternalWeebADoodle.g:2187:2: ( rule__LightingStatement__DirectionAssignment_2_1 )
            {
             before(grammarAccess.getLightingStatementAccess().getDirectionAssignment_2_1()); 
            // InternalWeebADoodle.g:2188:2: ( rule__LightingStatement__DirectionAssignment_2_1 )
            // InternalWeebADoodle.g:2188:3: rule__LightingStatement__DirectionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LightingStatement__DirectionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLightingStatementAccess().getDirectionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__Group_2__1__Impl"


    // $ANTLR start "rule__Board__TitleAssignment_3"
    // InternalWeebADoodle.g:2197:1: rule__Board__TitleAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Board__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2201:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2202:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2202:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2203:3: RULE_STRING
            {
             before(grammarAccess.getBoardAccess().getTitleSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBoardAccess().getTitleSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__TitleAssignment_3"


    // $ANTLR start "rule__Board__ScenesAssignment_4"
    // InternalWeebADoodle.g:2212:1: rule__Board__ScenesAssignment_4 : ( ruleScene ) ;
    public final void rule__Board__ScenesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2216:1: ( ( ruleScene ) )
            // InternalWeebADoodle.g:2217:2: ( ruleScene )
            {
            // InternalWeebADoodle.g:2217:2: ( ruleScene )
            // InternalWeebADoodle.g:2218:3: ruleScene
            {
             before(grammarAccess.getBoardAccess().getScenesSceneParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleScene();

            state._fsp--;

             after(grammarAccess.getBoardAccess().getScenesSceneParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Board__ScenesAssignment_4"


    // $ANTLR start "rule__Scene__NameAssignment_2"
    // InternalWeebADoodle.g:2227:1: rule__Scene__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Scene__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2231:1: ( ( RULE_ID ) )
            // InternalWeebADoodle.g:2232:2: ( RULE_ID )
            {
            // InternalWeebADoodle.g:2232:2: ( RULE_ID )
            // InternalWeebADoodle.g:2233:3: RULE_ID
            {
             before(grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__NameAssignment_2"


    // $ANTLR start "rule__Scene__ValueAssignment_4"
    // InternalWeebADoodle.g:2242:1: rule__Scene__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Scene__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2246:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2247:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2247:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2248:3: RULE_STRING
            {
             before(grammarAccess.getSceneAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getValueSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__ValueAssignment_4"


    // $ANTLR start "rule__Scene__BackgroundAssignment_7"
    // InternalWeebADoodle.g:2257:1: rule__Scene__BackgroundAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Scene__BackgroundAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2261:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2262:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2262:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2263:3: RULE_STRING
            {
             before(grammarAccess.getSceneAccess().getBackgroundSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSceneAccess().getBackgroundSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__BackgroundAssignment_7"


    // $ANTLR start "rule__Scene__SettingsAssignment_9"
    // InternalWeebADoodle.g:2272:1: rule__Scene__SettingsAssignment_9 : ( ruleSetting ) ;
    public final void rule__Scene__SettingsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2276:1: ( ( ruleSetting ) )
            // InternalWeebADoodle.g:2277:2: ( ruleSetting )
            {
            // InternalWeebADoodle.g:2277:2: ( ruleSetting )
            // InternalWeebADoodle.g:2278:3: ruleSetting
            {
             before(grammarAccess.getSceneAccess().getSettingsSettingParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleSetting();

            state._fsp--;

             after(grammarAccess.getSceneAccess().getSettingsSettingParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scene__SettingsAssignment_9"


    // $ANTLR start "rule__Scene__CharactersAssignment_10"
    // InternalWeebADoodle.g:2287:1: rule__Scene__CharactersAssignment_10 : ( ruleCharacter ) ;
    public final void rule__Scene__CharactersAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2291:1: ( ( ruleCharacter ) )
            // InternalWeebADoodle.g:2292:2: ( ruleCharacter )
            {
            // InternalWeebADoodle.g:2292:2: ( ruleCharacter )
            // InternalWeebADoodle.g:2293:3: ruleCharacter
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
    // InternalWeebADoodle.g:2302:1: rule__Scene__ObjectsAssignment_11 : ( ruleSceneObject ) ;
    public final void rule__Scene__ObjectsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2306:1: ( ( ruleSceneObject ) )
            // InternalWeebADoodle.g:2307:2: ( ruleSceneObject )
            {
            // InternalWeebADoodle.g:2307:2: ( ruleSceneObject )
            // InternalWeebADoodle.g:2308:3: ruleSceneObject
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


    // $ANTLR start "rule__Character__NameAssignment_2"
    // InternalWeebADoodle.g:2317:1: rule__Character__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Character__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2321:1: ( ( RULE_ID ) )
            // InternalWeebADoodle.g:2322:2: ( RULE_ID )
            {
            // InternalWeebADoodle.g:2322:2: ( RULE_ID )
            // InternalWeebADoodle.g:2323:3: RULE_ID
            {
             before(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__NameAssignment_2"


    // $ANTLR start "rule__Character__ValueAssignment_4"
    // InternalWeebADoodle.g:2332:1: rule__Character__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Character__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2336:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2337:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2337:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2338:3: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getValueSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__ValueAssignment_4"


    // $ANTLR start "rule__Character__PositionAssignment_6"
    // InternalWeebADoodle.g:2347:1: rule__Character__PositionAssignment_6 : ( rulePositionStatement ) ;
    public final void rule__Character__PositionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2351:1: ( ( rulePositionStatement ) )
            // InternalWeebADoodle.g:2352:2: ( rulePositionStatement )
            {
            // InternalWeebADoodle.g:2352:2: ( rulePositionStatement )
            // InternalWeebADoodle.g:2353:3: rulePositionStatement
            {
             before(grammarAccess.getCharacterAccess().getPositionPositionStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePositionStatement();

            state._fsp--;

             after(grammarAccess.getCharacterAccess().getPositionPositionStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__PositionAssignment_6"


    // $ANTLR start "rule__Character__ActionAssignment_7"
    // InternalWeebADoodle.g:2362:1: rule__Character__ActionAssignment_7 : ( ruleActionStatement ) ;
    public final void rule__Character__ActionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2366:1: ( ( ruleActionStatement ) )
            // InternalWeebADoodle.g:2367:2: ( ruleActionStatement )
            {
            // InternalWeebADoodle.g:2367:2: ( ruleActionStatement )
            // InternalWeebADoodle.g:2368:3: ruleActionStatement
            {
             before(grammarAccess.getCharacterAccess().getActionActionStatementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleActionStatement();

            state._fsp--;

             after(grammarAccess.getCharacterAccess().getActionActionStatementParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__ActionAssignment_7"


    // $ANTLR start "rule__Character__DialogueAssignment_8"
    // InternalWeebADoodle.g:2377:1: rule__Character__DialogueAssignment_8 : ( ruleDialogueStatement ) ;
    public final void rule__Character__DialogueAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2381:1: ( ( ruleDialogueStatement ) )
            // InternalWeebADoodle.g:2382:2: ( ruleDialogueStatement )
            {
            // InternalWeebADoodle.g:2382:2: ( ruleDialogueStatement )
            // InternalWeebADoodle.g:2383:3: ruleDialogueStatement
            {
             before(grammarAccess.getCharacterAccess().getDialogueDialogueStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleDialogueStatement();

            state._fsp--;

             after(grammarAccess.getCharacterAccess().getDialogueDialogueStatementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__DialogueAssignment_8"


    // $ANTLR start "rule__Character__DescriptionAssignment_9"
    // InternalWeebADoodle.g:2392:1: rule__Character__DescriptionAssignment_9 : ( ruleDescriptionStatement ) ;
    public final void rule__Character__DescriptionAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2396:1: ( ( ruleDescriptionStatement ) )
            // InternalWeebADoodle.g:2397:2: ( ruleDescriptionStatement )
            {
            // InternalWeebADoodle.g:2397:2: ( ruleDescriptionStatement )
            // InternalWeebADoodle.g:2398:3: ruleDescriptionStatement
            {
             before(grammarAccess.getCharacterAccess().getDescriptionDescriptionStatementParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleDescriptionStatement();

            state._fsp--;

             after(grammarAccess.getCharacterAccess().getDescriptionDescriptionStatementParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__DescriptionAssignment_9"


    // $ANTLR start "rule__SceneObject__NameAssignment_2"
    // InternalWeebADoodle.g:2407:1: rule__SceneObject__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SceneObject__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2411:1: ( ( RULE_ID ) )
            // InternalWeebADoodle.g:2412:2: ( RULE_ID )
            {
            // InternalWeebADoodle.g:2412:2: ( RULE_ID )
            // InternalWeebADoodle.g:2413:3: RULE_ID
            {
             before(grammarAccess.getSceneObjectAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__NameAssignment_2"


    // $ANTLR start "rule__SceneObject__ValueAssignment_4"
    // InternalWeebADoodle.g:2422:1: rule__SceneObject__ValueAssignment_4 : ( RULE_STRING ) ;
    public final void rule__SceneObject__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2426:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2427:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2427:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2428:3: RULE_STRING
            {
             before(grammarAccess.getSceneObjectAccess().getValueSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSceneObjectAccess().getValueSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__ValueAssignment_4"


    // $ANTLR start "rule__SceneObject__PositionAssignment_6"
    // InternalWeebADoodle.g:2437:1: rule__SceneObject__PositionAssignment_6 : ( rulePositionStatement ) ;
    public final void rule__SceneObject__PositionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2441:1: ( ( rulePositionStatement ) )
            // InternalWeebADoodle.g:2442:2: ( rulePositionStatement )
            {
            // InternalWeebADoodle.g:2442:2: ( rulePositionStatement )
            // InternalWeebADoodle.g:2443:3: rulePositionStatement
            {
             before(grammarAccess.getSceneObjectAccess().getPositionPositionStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePositionStatement();

            state._fsp--;

             after(grammarAccess.getSceneObjectAccess().getPositionPositionStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__PositionAssignment_6"


    // $ANTLR start "rule__SceneObject__DescriptionAssignment_7"
    // InternalWeebADoodle.g:2452:1: rule__SceneObject__DescriptionAssignment_7 : ( ruleDescriptionStatement ) ;
    public final void rule__SceneObject__DescriptionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2456:1: ( ( ruleDescriptionStatement ) )
            // InternalWeebADoodle.g:2457:2: ( ruleDescriptionStatement )
            {
            // InternalWeebADoodle.g:2457:2: ( ruleDescriptionStatement )
            // InternalWeebADoodle.g:2458:3: ruleDescriptionStatement
            {
             before(grammarAccess.getSceneObjectAccess().getDescriptionDescriptionStatementParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleDescriptionStatement();

            state._fsp--;

             after(grammarAccess.getSceneObjectAccess().getDescriptionDescriptionStatementParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SceneObject__DescriptionAssignment_7"


    // $ANTLR start "rule__Setting__CameraAssignment_2"
    // InternalWeebADoodle.g:2467:1: rule__Setting__CameraAssignment_2 : ( ruleCameraShotStatement ) ;
    public final void rule__Setting__CameraAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2471:1: ( ( ruleCameraShotStatement ) )
            // InternalWeebADoodle.g:2472:2: ( ruleCameraShotStatement )
            {
            // InternalWeebADoodle.g:2472:2: ( ruleCameraShotStatement )
            // InternalWeebADoodle.g:2473:3: ruleCameraShotStatement
            {
             before(grammarAccess.getSettingAccess().getCameraCameraShotStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCameraShotStatement();

            state._fsp--;

             after(grammarAccess.getSettingAccess().getCameraCameraShotStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__CameraAssignment_2"


    // $ANTLR start "rule__Setting__LightingAssignment_3"
    // InternalWeebADoodle.g:2482:1: rule__Setting__LightingAssignment_3 : ( ruleLightingStatement ) ;
    public final void rule__Setting__LightingAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2486:1: ( ( ruleLightingStatement ) )
            // InternalWeebADoodle.g:2487:2: ( ruleLightingStatement )
            {
            // InternalWeebADoodle.g:2487:2: ( ruleLightingStatement )
            // InternalWeebADoodle.g:2488:3: ruleLightingStatement
            {
             before(grammarAccess.getSettingAccess().getLightingLightingStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLightingStatement();

            state._fsp--;

             after(grammarAccess.getSettingAccess().getLightingLightingStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__LightingAssignment_3"


    // $ANTLR start "rule__Setting__DescriptionAssignment_4"
    // InternalWeebADoodle.g:2497:1: rule__Setting__DescriptionAssignment_4 : ( ruleDescriptionStatement ) ;
    public final void rule__Setting__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2501:1: ( ( ruleDescriptionStatement ) )
            // InternalWeebADoodle.g:2502:2: ( ruleDescriptionStatement )
            {
            // InternalWeebADoodle.g:2502:2: ( ruleDescriptionStatement )
            // InternalWeebADoodle.g:2503:3: ruleDescriptionStatement
            {
             before(grammarAccess.getSettingAccess().getDescriptionDescriptionStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDescriptionStatement();

            state._fsp--;

             after(grammarAccess.getSettingAccess().getDescriptionDescriptionStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Setting__DescriptionAssignment_4"


    // $ANTLR start "rule__DescriptionStatement__DescriptionAssignment_1"
    // InternalWeebADoodle.g:2512:1: rule__DescriptionStatement__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DescriptionStatement__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2516:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2517:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2517:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2518:3: RULE_STRING
            {
             before(grammarAccess.getDescriptionStatementAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDescriptionStatementAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptionStatement__DescriptionAssignment_1"


    // $ANTLR start "rule__DialogueStatement__DialogueAssignment_1"
    // InternalWeebADoodle.g:2527:1: rule__DialogueStatement__DialogueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DialogueStatement__DialogueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2531:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2532:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2532:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2533:3: RULE_STRING
            {
             before(grammarAccess.getDialogueStatementAccess().getDialogueSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDialogueStatementAccess().getDialogueSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DialogueStatement__DialogueAssignment_1"


    // $ANTLR start "rule__ActionStatement__ActionAssignment_1"
    // InternalWeebADoodle.g:2542:1: rule__ActionStatement__ActionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ActionStatement__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2546:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2547:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2547:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2548:3: RULE_STRING
            {
             before(grammarAccess.getActionStatementAccess().getActionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getActionStatementAccess().getActionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionStatement__ActionAssignment_1"


    // $ANTLR start "rule__PositionStatement__PositionAssignment_1"
    // InternalWeebADoodle.g:2557:1: rule__PositionStatement__PositionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__PositionStatement__PositionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2561:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2562:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2562:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2563:3: RULE_STRING
            {
             before(grammarAccess.getPositionStatementAccess().getPositionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPositionStatementAccess().getPositionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionStatement__PositionAssignment_1"


    // $ANTLR start "rule__CameraShotStatement__CameraShotAssignment_1"
    // InternalWeebADoodle.g:2572:1: rule__CameraShotStatement__CameraShotAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CameraShotStatement__CameraShotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2576:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2577:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2577:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2578:3: RULE_STRING
            {
             before(grammarAccess.getCameraShotStatementAccess().getCameraShotSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCameraShotStatementAccess().getCameraShotSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__CameraShotAssignment_1"


    // $ANTLR start "rule__CameraShotStatement__CameraAngleAssignment_2_1"
    // InternalWeebADoodle.g:2587:1: rule__CameraShotStatement__CameraAngleAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__CameraShotStatement__CameraAngleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2591:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2592:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2592:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2593:3: RULE_STRING
            {
             before(grammarAccess.getCameraShotStatementAccess().getCameraAngleSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCameraShotStatementAccess().getCameraAngleSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CameraShotStatement__CameraAngleAssignment_2_1"


    // $ANTLR start "rule__LightingStatement__SourceAssignment_1"
    // InternalWeebADoodle.g:2602:1: rule__LightingStatement__SourceAssignment_1 : ( RULE_STRING ) ;
    public final void rule__LightingStatement__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2606:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2607:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2607:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2608:3: RULE_STRING
            {
             before(grammarAccess.getLightingStatementAccess().getSourceSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLightingStatementAccess().getSourceSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__SourceAssignment_1"


    // $ANTLR start "rule__LightingStatement__DirectionAssignment_2_1"
    // InternalWeebADoodle.g:2617:1: rule__LightingStatement__DirectionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__LightingStatement__DirectionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalWeebADoodle.g:2621:1: ( ( RULE_STRING ) )
            // InternalWeebADoodle.g:2622:2: ( RULE_STRING )
            {
            // InternalWeebADoodle.g:2622:2: ( RULE_STRING )
            // InternalWeebADoodle.g:2623:3: RULE_STRING
            {
             before(grammarAccess.getLightingStatementAccess().getDirectionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLightingStatementAccess().getDirectionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightingStatement__DirectionAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000284000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000007804000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010020000L});

}