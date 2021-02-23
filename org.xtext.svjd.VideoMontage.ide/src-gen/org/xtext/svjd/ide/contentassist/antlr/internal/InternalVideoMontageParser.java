package org.xtext.svjd.ide.contentassist.antlr.internal;

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
import org.xtext.svjd.services.VideoMontageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoMontageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BLACK'", "'COMIC_SANS_MS'", "'E'", "'e'", "'+'", "'-'", "'starting'", "'ending'", "'Movie'", "'{'", "'}'", "'audioElement'", "'videoElement'", "'Subtitle'", "'start'", "':'", "'textArea'", "'duration'", "'Audio'", "'path'", "'transition'", "'AudioClip'", "'volume'", "'startCut'", "'endCut'", "'audio'", "'Clip'", "'video'", "'of'", "'element'", "'time'", "'StartingMoment'", "'Transition'", "'Title'", "'backgroundColor'", "'TextArea'", "'x'", "'y'", "'width'", "'height'", "'text'", "'font'", "'animation'", "'TextAreaDynamic'", "'textSrc'", "'line'", "'FadeIn'", "'FadeOut'", "'.'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
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


        public InternalVideoMontageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoMontageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoMontageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVideoMontage.g"; }


    	private VideoMontageGrammarAccess grammarAccess;

    	public void setGrammarAccess(VideoMontageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMovie"
    // InternalVideoMontage.g:53:1: entryRuleMovie : ruleMovie EOF ;
    public final void entryRuleMovie() throws RecognitionException {
        try {
            // InternalVideoMontage.g:54:1: ( ruleMovie EOF )
            // InternalVideoMontage.g:55:1: ruleMovie EOF
            {
             before(grammarAccess.getMovieRule()); 
            pushFollow(FOLLOW_1);
            ruleMovie();

            state._fsp--;

             after(grammarAccess.getMovieRule()); 
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
    // $ANTLR end "entryRuleMovie"


    // $ANTLR start "ruleMovie"
    // InternalVideoMontage.g:62:1: ruleMovie : ( ( rule__Movie__Group__0 ) ) ;
    public final void ruleMovie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:66:2: ( ( ( rule__Movie__Group__0 ) ) )
            // InternalVideoMontage.g:67:2: ( ( rule__Movie__Group__0 ) )
            {
            // InternalVideoMontage.g:67:2: ( ( rule__Movie__Group__0 ) )
            // InternalVideoMontage.g:68:3: ( rule__Movie__Group__0 )
            {
             before(grammarAccess.getMovieAccess().getGroup()); 
            // InternalVideoMontage.g:69:3: ( rule__Movie__Group__0 )
            // InternalVideoMontage.g:69:4: rule__Movie__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMovie"


    // $ANTLR start "entryRuleAudioElement"
    // InternalVideoMontage.g:78:1: entryRuleAudioElement : ruleAudioElement EOF ;
    public final void entryRuleAudioElement() throws RecognitionException {
        try {
            // InternalVideoMontage.g:79:1: ( ruleAudioElement EOF )
            // InternalVideoMontage.g:80:1: ruleAudioElement EOF
            {
             before(grammarAccess.getAudioElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAudioElement();

            state._fsp--;

             after(grammarAccess.getAudioElementRule()); 
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
    // $ANTLR end "entryRuleAudioElement"


    // $ANTLR start "ruleAudioElement"
    // InternalVideoMontage.g:87:1: ruleAudioElement : ( ( rule__AudioElement__Group__0 ) ) ;
    public final void ruleAudioElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:91:2: ( ( ( rule__AudioElement__Group__0 ) ) )
            // InternalVideoMontage.g:92:2: ( ( rule__AudioElement__Group__0 ) )
            {
            // InternalVideoMontage.g:92:2: ( ( rule__AudioElement__Group__0 ) )
            // InternalVideoMontage.g:93:3: ( rule__AudioElement__Group__0 )
            {
             before(grammarAccess.getAudioElementAccess().getGroup()); 
            // InternalVideoMontage.g:94:3: ( rule__AudioElement__Group__0 )
            // InternalVideoMontage.g:94:4: rule__AudioElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAudioElement"


    // $ANTLR start "entryRuleVideoElement"
    // InternalVideoMontage.g:103:1: entryRuleVideoElement : ruleVideoElement EOF ;
    public final void entryRuleVideoElement() throws RecognitionException {
        try {
            // InternalVideoMontage.g:104:1: ( ruleVideoElement EOF )
            // InternalVideoMontage.g:105:1: ruleVideoElement EOF
            {
             before(grammarAccess.getVideoElementRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoElement();

            state._fsp--;

             after(grammarAccess.getVideoElementRule()); 
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
    // $ANTLR end "entryRuleVideoElement"


    // $ANTLR start "ruleVideoElement"
    // InternalVideoMontage.g:112:1: ruleVideoElement : ( ( rule__VideoElement__Group__0 ) ) ;
    public final void ruleVideoElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:116:2: ( ( ( rule__VideoElement__Group__0 ) ) )
            // InternalVideoMontage.g:117:2: ( ( rule__VideoElement__Group__0 ) )
            {
            // InternalVideoMontage.g:117:2: ( ( rule__VideoElement__Group__0 ) )
            // InternalVideoMontage.g:118:3: ( rule__VideoElement__Group__0 )
            {
             before(grammarAccess.getVideoElementAccess().getGroup()); 
            // InternalVideoMontage.g:119:3: ( rule__VideoElement__Group__0 )
            // InternalVideoMontage.g:119:4: rule__VideoElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoElement"


    // $ANTLR start "entryRuleTextArea"
    // InternalVideoMontage.g:128:1: entryRuleTextArea : ruleTextArea EOF ;
    public final void entryRuleTextArea() throws RecognitionException {
        try {
            // InternalVideoMontage.g:129:1: ( ruleTextArea EOF )
            // InternalVideoMontage.g:130:1: ruleTextArea EOF
            {
             before(grammarAccess.getTextAreaRule()); 
            pushFollow(FOLLOW_1);
            ruleTextArea();

            state._fsp--;

             after(grammarAccess.getTextAreaRule()); 
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
    // $ANTLR end "entryRuleTextArea"


    // $ANTLR start "ruleTextArea"
    // InternalVideoMontage.g:137:1: ruleTextArea : ( ( rule__TextArea__Alternatives ) ) ;
    public final void ruleTextArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:141:2: ( ( ( rule__TextArea__Alternatives ) ) )
            // InternalVideoMontage.g:142:2: ( ( rule__TextArea__Alternatives ) )
            {
            // InternalVideoMontage.g:142:2: ( ( rule__TextArea__Alternatives ) )
            // InternalVideoMontage.g:143:3: ( rule__TextArea__Alternatives )
            {
             before(grammarAccess.getTextAreaAccess().getAlternatives()); 
            // InternalVideoMontage.g:144:3: ( rule__TextArea__Alternatives )
            // InternalVideoMontage.g:144:4: rule__TextArea__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TextArea__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextArea"


    // $ANTLR start "entryRuleStartingMoment"
    // InternalVideoMontage.g:153:1: entryRuleStartingMoment : ruleStartingMoment EOF ;
    public final void entryRuleStartingMoment() throws RecognitionException {
        try {
            // InternalVideoMontage.g:154:1: ( ruleStartingMoment EOF )
            // InternalVideoMontage.g:155:1: ruleStartingMoment EOF
            {
             before(grammarAccess.getStartingMomentRule()); 
            pushFollow(FOLLOW_1);
            ruleStartingMoment();

            state._fsp--;

             after(grammarAccess.getStartingMomentRule()); 
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
    // $ANTLR end "entryRuleStartingMoment"


    // $ANTLR start "ruleStartingMoment"
    // InternalVideoMontage.g:162:1: ruleStartingMoment : ( ( rule__StartingMoment__Alternatives ) ) ;
    public final void ruleStartingMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:166:2: ( ( ( rule__StartingMoment__Alternatives ) ) )
            // InternalVideoMontage.g:167:2: ( ( rule__StartingMoment__Alternatives ) )
            {
            // InternalVideoMontage.g:167:2: ( ( rule__StartingMoment__Alternatives ) )
            // InternalVideoMontage.g:168:3: ( rule__StartingMoment__Alternatives )
            {
             before(grammarAccess.getStartingMomentAccess().getAlternatives()); 
            // InternalVideoMontage.g:169:3: ( rule__StartingMoment__Alternatives )
            // InternalVideoMontage.g:169:4: rule__StartingMoment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StartingMoment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStartingMomentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartingMoment"


    // $ANTLR start "entryRuleAnimation"
    // InternalVideoMontage.g:178:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalVideoMontage.g:179:1: ( ruleAnimation EOF )
            // InternalVideoMontage.g:180:1: ruleAnimation EOF
            {
             before(grammarAccess.getAnimationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getAnimationRule()); 
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
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalVideoMontage.g:187:1: ruleAnimation : ( ( rule__Animation__Alternatives ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:191:2: ( ( ( rule__Animation__Alternatives ) ) )
            // InternalVideoMontage.g:192:2: ( ( rule__Animation__Alternatives ) )
            {
            // InternalVideoMontage.g:192:2: ( ( rule__Animation__Alternatives ) )
            // InternalVideoMontage.g:193:3: ( rule__Animation__Alternatives )
            {
             before(grammarAccess.getAnimationAccess().getAlternatives()); 
            // InternalVideoMontage.g:194:3: ( rule__Animation__Alternatives )
            // InternalVideoMontage.g:194:4: rule__Animation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Animation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAnimationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleEString"
    // InternalVideoMontage.g:203:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalVideoMontage.g:204:1: ( ruleEString EOF )
            // InternalVideoMontage.g:205:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalVideoMontage.g:212:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:216:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalVideoMontage.g:217:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalVideoMontage.g:217:2: ( ( rule__EString__Alternatives ) )
            // InternalVideoMontage.g:218:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalVideoMontage.g:219:3: ( rule__EString__Alternatives )
            // InternalVideoMontage.g:219:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSubtitle"
    // InternalVideoMontage.g:228:1: entryRuleSubtitle : ruleSubtitle EOF ;
    public final void entryRuleSubtitle() throws RecognitionException {
        try {
            // InternalVideoMontage.g:229:1: ( ruleSubtitle EOF )
            // InternalVideoMontage.g:230:1: ruleSubtitle EOF
            {
             before(grammarAccess.getSubtitleRule()); 
            pushFollow(FOLLOW_1);
            ruleSubtitle();

            state._fsp--;

             after(grammarAccess.getSubtitleRule()); 
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
    // $ANTLR end "entryRuleSubtitle"


    // $ANTLR start "ruleSubtitle"
    // InternalVideoMontage.g:237:1: ruleSubtitle : ( ( rule__Subtitle__Group__0 ) ) ;
    public final void ruleSubtitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:241:2: ( ( ( rule__Subtitle__Group__0 ) ) )
            // InternalVideoMontage.g:242:2: ( ( rule__Subtitle__Group__0 ) )
            {
            // InternalVideoMontage.g:242:2: ( ( rule__Subtitle__Group__0 ) )
            // InternalVideoMontage.g:243:3: ( rule__Subtitle__Group__0 )
            {
             before(grammarAccess.getSubtitleAccess().getGroup()); 
            // InternalVideoMontage.g:244:3: ( rule__Subtitle__Group__0 )
            // InternalVideoMontage.g:244:4: rule__Subtitle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubtitle"


    // $ANTLR start "entryRuleAudio"
    // InternalVideoMontage.g:253:1: entryRuleAudio : ruleAudio EOF ;
    public final void entryRuleAudio() throws RecognitionException {
        try {
            // InternalVideoMontage.g:254:1: ( ruleAudio EOF )
            // InternalVideoMontage.g:255:1: ruleAudio EOF
            {
             before(grammarAccess.getAudioRule()); 
            pushFollow(FOLLOW_1);
            ruleAudio();

            state._fsp--;

             after(grammarAccess.getAudioRule()); 
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
    // $ANTLR end "entryRuleAudio"


    // $ANTLR start "ruleAudio"
    // InternalVideoMontage.g:262:1: ruleAudio : ( ( rule__Audio__Group__0 ) ) ;
    public final void ruleAudio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:266:2: ( ( ( rule__Audio__Group__0 ) ) )
            // InternalVideoMontage.g:267:2: ( ( rule__Audio__Group__0 ) )
            {
            // InternalVideoMontage.g:267:2: ( ( rule__Audio__Group__0 ) )
            // InternalVideoMontage.g:268:3: ( rule__Audio__Group__0 )
            {
             before(grammarAccess.getAudioAccess().getGroup()); 
            // InternalVideoMontage.g:269:3: ( rule__Audio__Group__0 )
            // InternalVideoMontage.g:269:4: rule__Audio__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAudio"


    // $ANTLR start "entryRuleAudioClip"
    // InternalVideoMontage.g:278:1: entryRuleAudioClip : ruleAudioClip EOF ;
    public final void entryRuleAudioClip() throws RecognitionException {
        try {
            // InternalVideoMontage.g:279:1: ( ruleAudioClip EOF )
            // InternalVideoMontage.g:280:1: ruleAudioClip EOF
            {
             before(grammarAccess.getAudioClipRule()); 
            pushFollow(FOLLOW_1);
            ruleAudioClip();

            state._fsp--;

             after(grammarAccess.getAudioClipRule()); 
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
    // $ANTLR end "entryRuleAudioClip"


    // $ANTLR start "ruleAudioClip"
    // InternalVideoMontage.g:287:1: ruleAudioClip : ( ( rule__AudioClip__Group__0 ) ) ;
    public final void ruleAudioClip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:291:2: ( ( ( rule__AudioClip__Group__0 ) ) )
            // InternalVideoMontage.g:292:2: ( ( rule__AudioClip__Group__0 ) )
            {
            // InternalVideoMontage.g:292:2: ( ( rule__AudioClip__Group__0 ) )
            // InternalVideoMontage.g:293:3: ( rule__AudioClip__Group__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup()); 
            // InternalVideoMontage.g:294:3: ( rule__AudioClip__Group__0 )
            // InternalVideoMontage.g:294:4: rule__AudioClip__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAudioClip"


    // $ANTLR start "entryRuleClip"
    // InternalVideoMontage.g:303:1: entryRuleClip : ruleClip EOF ;
    public final void entryRuleClip() throws RecognitionException {
        try {
            // InternalVideoMontage.g:304:1: ( ruleClip EOF )
            // InternalVideoMontage.g:305:1: ruleClip EOF
            {
             before(grammarAccess.getClipRule()); 
            pushFollow(FOLLOW_1);
            ruleClip();

            state._fsp--;

             after(grammarAccess.getClipRule()); 
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
    // $ANTLR end "entryRuleClip"


    // $ANTLR start "ruleClip"
    // InternalVideoMontage.g:312:1: ruleClip : ( ( rule__Clip__Group__0 ) ) ;
    public final void ruleClip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:316:2: ( ( ( rule__Clip__Group__0 ) ) )
            // InternalVideoMontage.g:317:2: ( ( rule__Clip__Group__0 ) )
            {
            // InternalVideoMontage.g:317:2: ( ( rule__Clip__Group__0 ) )
            // InternalVideoMontage.g:318:3: ( rule__Clip__Group__0 )
            {
             before(grammarAccess.getClipAccess().getGroup()); 
            // InternalVideoMontage.g:319:3: ( rule__Clip__Group__0 )
            // InternalVideoMontage.g:319:4: rule__Clip__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClip"


    // $ANTLR start "entryRuleVideo"
    // InternalVideoMontage.g:328:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalVideoMontage.g:329:1: ( ruleVideo EOF )
            // InternalVideoMontage.g:330:1: ruleVideo EOF
            {
             before(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getVideoRule()); 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalVideoMontage.g:337:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:341:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalVideoMontage.g:342:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalVideoMontage.g:342:2: ( ( rule__Video__Group__0 ) )
            // InternalVideoMontage.g:343:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalVideoMontage.g:344:3: ( rule__Video__Group__0 )
            // InternalVideoMontage.g:344:4: rule__Video__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleRelativeMoment"
    // InternalVideoMontage.g:353:1: entryRuleRelativeMoment : ruleRelativeMoment EOF ;
    public final void entryRuleRelativeMoment() throws RecognitionException {
        try {
            // InternalVideoMontage.g:354:1: ( ruleRelativeMoment EOF )
            // InternalVideoMontage.g:355:1: ruleRelativeMoment EOF
            {
             before(grammarAccess.getRelativeMomentRule()); 
            pushFollow(FOLLOW_1);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getRelativeMomentRule()); 
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
    // $ANTLR end "entryRuleRelativeMoment"


    // $ANTLR start "ruleRelativeMoment"
    // InternalVideoMontage.g:362:1: ruleRelativeMoment : ( ( rule__RelativeMoment__Group__0 ) ) ;
    public final void ruleRelativeMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:366:2: ( ( ( rule__RelativeMoment__Group__0 ) ) )
            // InternalVideoMontage.g:367:2: ( ( rule__RelativeMoment__Group__0 ) )
            {
            // InternalVideoMontage.g:367:2: ( ( rule__RelativeMoment__Group__0 ) )
            // InternalVideoMontage.g:368:3: ( rule__RelativeMoment__Group__0 )
            {
             before(grammarAccess.getRelativeMomentAccess().getGroup()); 
            // InternalVideoMontage.g:369:3: ( rule__RelativeMoment__Group__0 )
            // InternalVideoMontage.g:369:4: rule__RelativeMoment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeMomentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelativeMoment"


    // $ANTLR start "entryRuleAbsoluteMoment"
    // InternalVideoMontage.g:378:1: entryRuleAbsoluteMoment : ruleAbsoluteMoment EOF ;
    public final void entryRuleAbsoluteMoment() throws RecognitionException {
        try {
            // InternalVideoMontage.g:379:1: ( ruleAbsoluteMoment EOF )
            // InternalVideoMontage.g:380:1: ruleAbsoluteMoment EOF
            {
             before(grammarAccess.getAbsoluteMomentRule()); 
            pushFollow(FOLLOW_1);
            ruleAbsoluteMoment();

            state._fsp--;

             after(grammarAccess.getAbsoluteMomentRule()); 
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
    // $ANTLR end "entryRuleAbsoluteMoment"


    // $ANTLR start "ruleAbsoluteMoment"
    // InternalVideoMontage.g:387:1: ruleAbsoluteMoment : ( ( rule__AbsoluteMoment__Group__0 ) ) ;
    public final void ruleAbsoluteMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:391:2: ( ( ( rule__AbsoluteMoment__Group__0 ) ) )
            // InternalVideoMontage.g:392:2: ( ( rule__AbsoluteMoment__Group__0 ) )
            {
            // InternalVideoMontage.g:392:2: ( ( rule__AbsoluteMoment__Group__0 ) )
            // InternalVideoMontage.g:393:3: ( rule__AbsoluteMoment__Group__0 )
            {
             before(grammarAccess.getAbsoluteMomentAccess().getGroup()); 
            // InternalVideoMontage.g:394:3: ( rule__AbsoluteMoment__Group__0 )
            // InternalVideoMontage.g:394:4: rule__AbsoluteMoment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteMomentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbsoluteMoment"


    // $ANTLR start "entryRuleStartingMoment_Impl"
    // InternalVideoMontage.g:403:1: entryRuleStartingMoment_Impl : ruleStartingMoment_Impl EOF ;
    public final void entryRuleStartingMoment_Impl() throws RecognitionException {
        try {
            // InternalVideoMontage.g:404:1: ( ruleStartingMoment_Impl EOF )
            // InternalVideoMontage.g:405:1: ruleStartingMoment_Impl EOF
            {
             before(grammarAccess.getStartingMoment_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleStartingMoment_Impl();

            state._fsp--;

             after(grammarAccess.getStartingMoment_ImplRule()); 
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
    // $ANTLR end "entryRuleStartingMoment_Impl"


    // $ANTLR start "ruleStartingMoment_Impl"
    // InternalVideoMontage.g:412:1: ruleStartingMoment_Impl : ( ( rule__StartingMoment_Impl__Group__0 ) ) ;
    public final void ruleStartingMoment_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:416:2: ( ( ( rule__StartingMoment_Impl__Group__0 ) ) )
            // InternalVideoMontage.g:417:2: ( ( rule__StartingMoment_Impl__Group__0 ) )
            {
            // InternalVideoMontage.g:417:2: ( ( rule__StartingMoment_Impl__Group__0 ) )
            // InternalVideoMontage.g:418:3: ( rule__StartingMoment_Impl__Group__0 )
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getGroup()); 
            // InternalVideoMontage.g:419:3: ( rule__StartingMoment_Impl__Group__0 )
            // InternalVideoMontage.g:419:4: rule__StartingMoment_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StartingMoment_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStartingMoment_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStartingMoment_Impl"


    // $ANTLR start "entryRuleTransition"
    // InternalVideoMontage.g:428:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalVideoMontage.g:429:1: ( ruleTransition EOF )
            // InternalVideoMontage.g:430:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalVideoMontage.g:437:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:441:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalVideoMontage.g:442:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalVideoMontage.g:442:2: ( ( rule__Transition__Group__0 ) )
            // InternalVideoMontage.g:443:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalVideoMontage.g:444:3: ( rule__Transition__Group__0 )
            // InternalVideoMontage.g:444:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTitle"
    // InternalVideoMontage.g:453:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalVideoMontage.g:454:1: ( ruleTitle EOF )
            // InternalVideoMontage.g:455:1: ruleTitle EOF
            {
             before(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            ruleTitle();

            state._fsp--;

             after(grammarAccess.getTitleRule()); 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalVideoMontage.g:462:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:466:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalVideoMontage.g:467:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalVideoMontage.g:467:2: ( ( rule__Title__Group__0 ) )
            // InternalVideoMontage.g:468:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalVideoMontage.g:469:3: ( rule__Title__Group__0 )
            // InternalVideoMontage.g:469:4: rule__Title__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleTextArea_Impl"
    // InternalVideoMontage.g:478:1: entryRuleTextArea_Impl : ruleTextArea_Impl EOF ;
    public final void entryRuleTextArea_Impl() throws RecognitionException {
        try {
            // InternalVideoMontage.g:479:1: ( ruleTextArea_Impl EOF )
            // InternalVideoMontage.g:480:1: ruleTextArea_Impl EOF
            {
             before(grammarAccess.getTextArea_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleTextArea_Impl();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplRule()); 
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
    // $ANTLR end "entryRuleTextArea_Impl"


    // $ANTLR start "ruleTextArea_Impl"
    // InternalVideoMontage.g:487:1: ruleTextArea_Impl : ( ( rule__TextArea_Impl__Group__0 ) ) ;
    public final void ruleTextArea_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:491:2: ( ( ( rule__TextArea_Impl__Group__0 ) ) )
            // InternalVideoMontage.g:492:2: ( ( rule__TextArea_Impl__Group__0 ) )
            {
            // InternalVideoMontage.g:492:2: ( ( rule__TextArea_Impl__Group__0 ) )
            // InternalVideoMontage.g:493:3: ( rule__TextArea_Impl__Group__0 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup()); 
            // InternalVideoMontage.g:494:3: ( rule__TextArea_Impl__Group__0 )
            // InternalVideoMontage.g:494:4: rule__TextArea_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextArea_Impl"


    // $ANTLR start "entryRuleTextAreaDynamic"
    // InternalVideoMontage.g:503:1: entryRuleTextAreaDynamic : ruleTextAreaDynamic EOF ;
    public final void entryRuleTextAreaDynamic() throws RecognitionException {
        try {
            // InternalVideoMontage.g:504:1: ( ruleTextAreaDynamic EOF )
            // InternalVideoMontage.g:505:1: ruleTextAreaDynamic EOF
            {
             before(grammarAccess.getTextAreaDynamicRule()); 
            pushFollow(FOLLOW_1);
            ruleTextAreaDynamic();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicRule()); 
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
    // $ANTLR end "entryRuleTextAreaDynamic"


    // $ANTLR start "ruleTextAreaDynamic"
    // InternalVideoMontage.g:512:1: ruleTextAreaDynamic : ( ( rule__TextAreaDynamic__Group__0 ) ) ;
    public final void ruleTextAreaDynamic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:516:2: ( ( ( rule__TextAreaDynamic__Group__0 ) ) )
            // InternalVideoMontage.g:517:2: ( ( rule__TextAreaDynamic__Group__0 ) )
            {
            // InternalVideoMontage.g:517:2: ( ( rule__TextAreaDynamic__Group__0 ) )
            // InternalVideoMontage.g:518:3: ( rule__TextAreaDynamic__Group__0 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup()); 
            // InternalVideoMontage.g:519:3: ( rule__TextAreaDynamic__Group__0 )
            // InternalVideoMontage.g:519:4: rule__TextAreaDynamic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextAreaDynamic"


    // $ANTLR start "entryRuleFadeIn"
    // InternalVideoMontage.g:528:1: entryRuleFadeIn : ruleFadeIn EOF ;
    public final void entryRuleFadeIn() throws RecognitionException {
        try {
            // InternalVideoMontage.g:529:1: ( ruleFadeIn EOF )
            // InternalVideoMontage.g:530:1: ruleFadeIn EOF
            {
             before(grammarAccess.getFadeInRule()); 
            pushFollow(FOLLOW_1);
            ruleFadeIn();

            state._fsp--;

             after(grammarAccess.getFadeInRule()); 
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
    // $ANTLR end "entryRuleFadeIn"


    // $ANTLR start "ruleFadeIn"
    // InternalVideoMontage.g:537:1: ruleFadeIn : ( ( rule__FadeIn__Group__0 ) ) ;
    public final void ruleFadeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:541:2: ( ( ( rule__FadeIn__Group__0 ) ) )
            // InternalVideoMontage.g:542:2: ( ( rule__FadeIn__Group__0 ) )
            {
            // InternalVideoMontage.g:542:2: ( ( rule__FadeIn__Group__0 ) )
            // InternalVideoMontage.g:543:3: ( rule__FadeIn__Group__0 )
            {
             before(grammarAccess.getFadeInAccess().getGroup()); 
            // InternalVideoMontage.g:544:3: ( rule__FadeIn__Group__0 )
            // InternalVideoMontage.g:544:4: rule__FadeIn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFadeIn"


    // $ANTLR start "entryRuleFadeOut"
    // InternalVideoMontage.g:553:1: entryRuleFadeOut : ruleFadeOut EOF ;
    public final void entryRuleFadeOut() throws RecognitionException {
        try {
            // InternalVideoMontage.g:554:1: ( ruleFadeOut EOF )
            // InternalVideoMontage.g:555:1: ruleFadeOut EOF
            {
             before(grammarAccess.getFadeOutRule()); 
            pushFollow(FOLLOW_1);
            ruleFadeOut();

            state._fsp--;

             after(grammarAccess.getFadeOutRule()); 
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
    // $ANTLR end "entryRuleFadeOut"


    // $ANTLR start "ruleFadeOut"
    // InternalVideoMontage.g:562:1: ruleFadeOut : ( ( rule__FadeOut__Group__0 ) ) ;
    public final void ruleFadeOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:566:2: ( ( ( rule__FadeOut__Group__0 ) ) )
            // InternalVideoMontage.g:567:2: ( ( rule__FadeOut__Group__0 ) )
            {
            // InternalVideoMontage.g:567:2: ( ( rule__FadeOut__Group__0 ) )
            // InternalVideoMontage.g:568:3: ( rule__FadeOut__Group__0 )
            {
             before(grammarAccess.getFadeOutAccess().getGroup()); 
            // InternalVideoMontage.g:569:3: ( rule__FadeOut__Group__0 )
            // InternalVideoMontage.g:569:4: rule__FadeOut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFadeOut"


    // $ANTLR start "entryRuleEDouble"
    // InternalVideoMontage.g:578:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalVideoMontage.g:579:1: ( ruleEDouble EOF )
            // InternalVideoMontage.g:580:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalVideoMontage.g:587:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:591:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalVideoMontage.g:592:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalVideoMontage.g:592:2: ( ( rule__EDouble__Group__0 ) )
            // InternalVideoMontage.g:593:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalVideoMontage.g:594:3: ( rule__EDouble__Group__0 )
            // InternalVideoMontage.g:594:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalVideoMontage.g:603:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalVideoMontage.g:604:1: ( ruleEInt EOF )
            // InternalVideoMontage.g:605:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalVideoMontage.g:612:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:616:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalVideoMontage.g:617:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalVideoMontage.g:617:2: ( ( rule__EInt__Group__0 ) )
            // InternalVideoMontage.g:618:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalVideoMontage.g:619:3: ( rule__EInt__Group__0 )
            // InternalVideoMontage.g:619:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleOperationMoment"
    // InternalVideoMontage.g:628:1: ruleOperationMoment : ( ( rule__OperationMoment__Alternatives ) ) ;
    public final void ruleOperationMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:632:1: ( ( ( rule__OperationMoment__Alternatives ) ) )
            // InternalVideoMontage.g:633:2: ( ( rule__OperationMoment__Alternatives ) )
            {
            // InternalVideoMontage.g:633:2: ( ( rule__OperationMoment__Alternatives ) )
            // InternalVideoMontage.g:634:3: ( rule__OperationMoment__Alternatives )
            {
             before(grammarAccess.getOperationMomentAccess().getAlternatives()); 
            // InternalVideoMontage.g:635:3: ( rule__OperationMoment__Alternatives )
            // InternalVideoMontage.g:635:4: rule__OperationMoment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperationMoment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationMomentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationMoment"


    // $ANTLR start "ruleMoment"
    // InternalVideoMontage.g:644:1: ruleMoment : ( ( rule__Moment__Alternatives ) ) ;
    public final void ruleMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:648:1: ( ( ( rule__Moment__Alternatives ) ) )
            // InternalVideoMontage.g:649:2: ( ( rule__Moment__Alternatives ) )
            {
            // InternalVideoMontage.g:649:2: ( ( rule__Moment__Alternatives ) )
            // InternalVideoMontage.g:650:3: ( rule__Moment__Alternatives )
            {
             before(grammarAccess.getMomentAccess().getAlternatives()); 
            // InternalVideoMontage.g:651:3: ( rule__Moment__Alternatives )
            // InternalVideoMontage.g:651:4: rule__Moment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Moment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMomentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoment"


    // $ANTLR start "ruleColor"
    // InternalVideoMontage.g:660:1: ruleColor : ( ( 'BLACK' ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:664:1: ( ( ( 'BLACK' ) ) )
            // InternalVideoMontage.g:665:2: ( ( 'BLACK' ) )
            {
            // InternalVideoMontage.g:665:2: ( ( 'BLACK' ) )
            // InternalVideoMontage.g:666:3: ( 'BLACK' )
            {
             before(grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration()); 
            // InternalVideoMontage.g:667:3: ( 'BLACK' )
            // InternalVideoMontage.g:667:4: 'BLACK'
            {
            match(input,11,FOLLOW_2); 

            }

             after(grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleFontStyle"
    // InternalVideoMontage.g:676:1: ruleFontStyle : ( ( 'COMIC_SANS_MS' ) ) ;
    public final void ruleFontStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:680:1: ( ( ( 'COMIC_SANS_MS' ) ) )
            // InternalVideoMontage.g:681:2: ( ( 'COMIC_SANS_MS' ) )
            {
            // InternalVideoMontage.g:681:2: ( ( 'COMIC_SANS_MS' ) )
            // InternalVideoMontage.g:682:3: ( 'COMIC_SANS_MS' )
            {
             before(grammarAccess.getFontStyleAccess().getCOMIC_SANS_MSEnumLiteralDeclaration()); 
            // InternalVideoMontage.g:683:3: ( 'COMIC_SANS_MS' )
            // InternalVideoMontage.g:683:4: 'COMIC_SANS_MS'
            {
            match(input,12,FOLLOW_2); 

            }

             after(grammarAccess.getFontStyleAccess().getCOMIC_SANS_MSEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFontStyle"


    // $ANTLR start "rule__AudioElement__Alternatives_1"
    // InternalVideoMontage.g:691:1: rule__AudioElement__Alternatives_1 : ( ( ruleAudio ) | ( ruleAudioClip ) );
    public final void rule__AudioElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:695:1: ( ( ruleAudio ) | ( ruleAudioClip ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==29) ) {
                alt1=1;
            }
            else if ( (LA1_0==32) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalVideoMontage.g:696:2: ( ruleAudio )
                    {
                    // InternalVideoMontage.g:696:2: ( ruleAudio )
                    // InternalVideoMontage.g:697:3: ruleAudio
                    {
                     before(grammarAccess.getAudioElementAccess().getAudioParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAudio();

                    state._fsp--;

                     after(grammarAccess.getAudioElementAccess().getAudioParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:702:2: ( ruleAudioClip )
                    {
                    // InternalVideoMontage.g:702:2: ( ruleAudioClip )
                    // InternalVideoMontage.g:703:3: ruleAudioClip
                    {
                     before(grammarAccess.getAudioElementAccess().getAudioClipParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAudioClip();

                    state._fsp--;

                     after(grammarAccess.getAudioElementAccess().getAudioClipParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__AudioElement__Alternatives_1"


    // $ANTLR start "rule__VideoElement__Alternatives_1"
    // InternalVideoMontage.g:712:1: rule__VideoElement__Alternatives_1 : ( ( ruleTitle ) | ( ruleClip ) | ( ruleVideo ) );
    public final void rule__VideoElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:716:1: ( ( ruleTitle ) | ( ruleClip ) | ( ruleVideo ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt2=1;
                }
                break;
            case 37:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVideoMontage.g:717:2: ( ruleTitle )
                    {
                    // InternalVideoMontage.g:717:2: ( ruleTitle )
                    // InternalVideoMontage.g:718:3: ruleTitle
                    {
                     before(grammarAccess.getVideoElementAccess().getTitleParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTitle();

                    state._fsp--;

                     after(grammarAccess.getVideoElementAccess().getTitleParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:723:2: ( ruleClip )
                    {
                    // InternalVideoMontage.g:723:2: ( ruleClip )
                    // InternalVideoMontage.g:724:3: ruleClip
                    {
                     before(grammarAccess.getVideoElementAccess().getClipParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClip();

                    state._fsp--;

                     after(grammarAccess.getVideoElementAccess().getClipParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoMontage.g:729:2: ( ruleVideo )
                    {
                    // InternalVideoMontage.g:729:2: ( ruleVideo )
                    // InternalVideoMontage.g:730:3: ruleVideo
                    {
                     before(grammarAccess.getVideoElementAccess().getVideoParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVideo();

                    state._fsp--;

                     after(grammarAccess.getVideoElementAccess().getVideoParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__VideoElement__Alternatives_1"


    // $ANTLR start "rule__TextArea__Alternatives"
    // InternalVideoMontage.g:739:1: rule__TextArea__Alternatives : ( ( ruleTextArea_Impl ) | ( ruleTextAreaDynamic ) );
    public final void rule__TextArea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:743:1: ( ( ruleTextArea_Impl ) | ( ruleTextAreaDynamic ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==46) ) {
                alt3=1;
            }
            else if ( (LA3_0==54) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVideoMontage.g:744:2: ( ruleTextArea_Impl )
                    {
                    // InternalVideoMontage.g:744:2: ( ruleTextArea_Impl )
                    // InternalVideoMontage.g:745:3: ruleTextArea_Impl
                    {
                     before(grammarAccess.getTextAreaAccess().getTextArea_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextArea_Impl();

                    state._fsp--;

                     after(grammarAccess.getTextAreaAccess().getTextArea_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:750:2: ( ruleTextAreaDynamic )
                    {
                    // InternalVideoMontage.g:750:2: ( ruleTextAreaDynamic )
                    // InternalVideoMontage.g:751:3: ruleTextAreaDynamic
                    {
                     before(grammarAccess.getTextAreaAccess().getTextAreaDynamicParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTextAreaDynamic();

                    state._fsp--;

                     after(grammarAccess.getTextAreaAccess().getTextAreaDynamicParserRuleCall_1()); 

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
    // $ANTLR end "rule__TextArea__Alternatives"


    // $ANTLR start "rule__StartingMoment__Alternatives"
    // InternalVideoMontage.g:760:1: rule__StartingMoment__Alternatives : ( ( ruleStartingMoment_Impl ) | ( ruleRelativeMoment ) | ( ruleAbsoluteMoment ) );
    public final void rule__StartingMoment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:764:1: ( ( ruleStartingMoment_Impl ) | ( ruleRelativeMoment ) | ( ruleAbsoluteMoment ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 17:
            case 18:
            case 39:
                {
                alt4=2;
                }
                break;
            case EOF:
            case 20:
            case 41:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVideoMontage.g:765:2: ( ruleStartingMoment_Impl )
                    {
                    // InternalVideoMontage.g:765:2: ( ruleStartingMoment_Impl )
                    // InternalVideoMontage.g:766:3: ruleStartingMoment_Impl
                    {
                     before(grammarAccess.getStartingMomentAccess().getStartingMoment_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStartingMoment_Impl();

                    state._fsp--;

                     after(grammarAccess.getStartingMomentAccess().getStartingMoment_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:771:2: ( ruleRelativeMoment )
                    {
                    // InternalVideoMontage.g:771:2: ( ruleRelativeMoment )
                    // InternalVideoMontage.g:772:3: ruleRelativeMoment
                    {
                     before(grammarAccess.getStartingMomentAccess().getRelativeMomentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRelativeMoment();

                    state._fsp--;

                     after(grammarAccess.getStartingMomentAccess().getRelativeMomentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoMontage.g:777:2: ( ruleAbsoluteMoment )
                    {
                    // InternalVideoMontage.g:777:2: ( ruleAbsoluteMoment )
                    // InternalVideoMontage.g:778:3: ruleAbsoluteMoment
                    {
                     before(grammarAccess.getStartingMomentAccess().getAbsoluteMomentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAbsoluteMoment();

                    state._fsp--;

                     after(grammarAccess.getStartingMomentAccess().getAbsoluteMomentParserRuleCall_2()); 

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
    // $ANTLR end "rule__StartingMoment__Alternatives"


    // $ANTLR start "rule__Animation__Alternatives"
    // InternalVideoMontage.g:787:1: rule__Animation__Alternatives : ( ( ruleFadeIn ) | ( ruleFadeOut ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:791:1: ( ( ruleFadeIn ) | ( ruleFadeOut ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==57) ) {
                alt5=1;
            }
            else if ( (LA5_0==58) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVideoMontage.g:792:2: ( ruleFadeIn )
                    {
                    // InternalVideoMontage.g:792:2: ( ruleFadeIn )
                    // InternalVideoMontage.g:793:3: ruleFadeIn
                    {
                     before(grammarAccess.getAnimationAccess().getFadeInParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFadeIn();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getFadeInParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:798:2: ( ruleFadeOut )
                    {
                    // InternalVideoMontage.g:798:2: ( ruleFadeOut )
                    // InternalVideoMontage.g:799:3: ruleFadeOut
                    {
                     before(grammarAccess.getAnimationAccess().getFadeOutParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFadeOut();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getFadeOutParserRuleCall_1()); 

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
    // $ANTLR end "rule__Animation__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalVideoMontage.g:808:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:812:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoMontage.g:813:2: ( RULE_STRING )
                    {
                    // InternalVideoMontage.g:813:2: ( RULE_STRING )
                    // InternalVideoMontage.g:814:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:819:2: ( RULE_ID )
                    {
                    // InternalVideoMontage.g:819:2: ( RULE_ID )
                    // InternalVideoMontage.g:820:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalVideoMontage.g:829:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:833:1: ( ( 'E' ) | ( 'e' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVideoMontage.g:834:2: ( 'E' )
                    {
                    // InternalVideoMontage.g:834:2: ( 'E' )
                    // InternalVideoMontage.g:835:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:840:2: ( 'e' )
                    {
                    // InternalVideoMontage.g:840:2: ( 'e' )
                    // InternalVideoMontage.g:841:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__OperationMoment__Alternatives"
    // InternalVideoMontage.g:850:1: rule__OperationMoment__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__OperationMoment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:854:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVideoMontage.g:855:2: ( ( '+' ) )
                    {
                    // InternalVideoMontage.g:855:2: ( ( '+' ) )
                    // InternalVideoMontage.g:856:3: ( '+' )
                    {
                     before(grammarAccess.getOperationMomentAccess().getAdditionEnumLiteralDeclaration_0()); 
                    // InternalVideoMontage.g:857:3: ( '+' )
                    // InternalVideoMontage.g:857:4: '+'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationMomentAccess().getAdditionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:861:2: ( ( '-' ) )
                    {
                    // InternalVideoMontage.g:861:2: ( ( '-' ) )
                    // InternalVideoMontage.g:862:3: ( '-' )
                    {
                     before(grammarAccess.getOperationMomentAccess().getSoustractionEnumLiteralDeclaration_1()); 
                    // InternalVideoMontage.g:863:3: ( '-' )
                    // InternalVideoMontage.g:863:4: '-'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationMomentAccess().getSoustractionEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__OperationMoment__Alternatives"


    // $ANTLR start "rule__Moment__Alternatives"
    // InternalVideoMontage.g:871:1: rule__Moment__Alternatives : ( ( ( 'starting' ) ) | ( ( 'ending' ) ) );
    public final void rule__Moment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:875:1: ( ( ( 'starting' ) ) | ( ( 'ending' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoMontage.g:876:2: ( ( 'starting' ) )
                    {
                    // InternalVideoMontage.g:876:2: ( ( 'starting' ) )
                    // InternalVideoMontage.g:877:3: ( 'starting' )
                    {
                     before(grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0()); 
                    // InternalVideoMontage.g:878:3: ( 'starting' )
                    // InternalVideoMontage.g:878:4: 'starting'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:882:2: ( ( 'ending' ) )
                    {
                    // InternalVideoMontage.g:882:2: ( ( 'ending' ) )
                    // InternalVideoMontage.g:883:3: ( 'ending' )
                    {
                     before(grammarAccess.getMomentAccess().getEndingEnumLiteralDeclaration_1()); 
                    // InternalVideoMontage.g:884:3: ( 'ending' )
                    // InternalVideoMontage.g:884:4: 'ending'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMomentAccess().getEndingEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__Moment__Alternatives"


    // $ANTLR start "rule__Movie__Group__0"
    // InternalVideoMontage.g:892:1: rule__Movie__Group__0 : rule__Movie__Group__0__Impl rule__Movie__Group__1 ;
    public final void rule__Movie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:896:1: ( rule__Movie__Group__0__Impl rule__Movie__Group__1 )
            // InternalVideoMontage.g:897:2: rule__Movie__Group__0__Impl rule__Movie__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Movie__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__0"


    // $ANTLR start "rule__Movie__Group__0__Impl"
    // InternalVideoMontage.g:904:1: rule__Movie__Group__0__Impl : ( 'Movie' ) ;
    public final void rule__Movie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:908:1: ( ( 'Movie' ) )
            // InternalVideoMontage.g:909:1: ( 'Movie' )
            {
            // InternalVideoMontage.g:909:1: ( 'Movie' )
            // InternalVideoMontage.g:910:2: 'Movie'
            {
             before(grammarAccess.getMovieAccess().getMovieKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getMovieKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__0__Impl"


    // $ANTLR start "rule__Movie__Group__1"
    // InternalVideoMontage.g:919:1: rule__Movie__Group__1 : rule__Movie__Group__1__Impl rule__Movie__Group__2 ;
    public final void rule__Movie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:923:1: ( rule__Movie__Group__1__Impl rule__Movie__Group__2 )
            // InternalVideoMontage.g:924:2: rule__Movie__Group__1__Impl rule__Movie__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Movie__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__1"


    // $ANTLR start "rule__Movie__Group__1__Impl"
    // InternalVideoMontage.g:931:1: rule__Movie__Group__1__Impl : ( ( rule__Movie__TitleAssignment_1 ) ) ;
    public final void rule__Movie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:935:1: ( ( ( rule__Movie__TitleAssignment_1 ) ) )
            // InternalVideoMontage.g:936:1: ( ( rule__Movie__TitleAssignment_1 ) )
            {
            // InternalVideoMontage.g:936:1: ( ( rule__Movie__TitleAssignment_1 ) )
            // InternalVideoMontage.g:937:2: ( rule__Movie__TitleAssignment_1 )
            {
             before(grammarAccess.getMovieAccess().getTitleAssignment_1()); 
            // InternalVideoMontage.g:938:2: ( rule__Movie__TitleAssignment_1 )
            // InternalVideoMontage.g:938:3: rule__Movie__TitleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Movie__TitleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getTitleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__1__Impl"


    // $ANTLR start "rule__Movie__Group__2"
    // InternalVideoMontage.g:946:1: rule__Movie__Group__2 : rule__Movie__Group__2__Impl rule__Movie__Group__3 ;
    public final void rule__Movie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:950:1: ( rule__Movie__Group__2__Impl rule__Movie__Group__3 )
            // InternalVideoMontage.g:951:2: rule__Movie__Group__2__Impl rule__Movie__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Movie__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__2"


    // $ANTLR start "rule__Movie__Group__2__Impl"
    // InternalVideoMontage.g:958:1: rule__Movie__Group__2__Impl : ( '{' ) ;
    public final void rule__Movie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:962:1: ( ( '{' ) )
            // InternalVideoMontage.g:963:1: ( '{' )
            {
            // InternalVideoMontage.g:963:1: ( '{' )
            // InternalVideoMontage.g:964:2: '{'
            {
             before(grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__2__Impl"


    // $ANTLR start "rule__Movie__Group__3"
    // InternalVideoMontage.g:973:1: rule__Movie__Group__3 : rule__Movie__Group__3__Impl rule__Movie__Group__4 ;
    public final void rule__Movie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:977:1: ( rule__Movie__Group__3__Impl rule__Movie__Group__4 )
            // InternalVideoMontage.g:978:2: rule__Movie__Group__3__Impl rule__Movie__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Movie__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__3"


    // $ANTLR start "rule__Movie__Group__3__Impl"
    // InternalVideoMontage.g:985:1: rule__Movie__Group__3__Impl : ( ( rule__Movie__VideoelementAssignment_3 ) ) ;
    public final void rule__Movie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:989:1: ( ( ( rule__Movie__VideoelementAssignment_3 ) ) )
            // InternalVideoMontage.g:990:1: ( ( rule__Movie__VideoelementAssignment_3 ) )
            {
            // InternalVideoMontage.g:990:1: ( ( rule__Movie__VideoelementAssignment_3 ) )
            // InternalVideoMontage.g:991:2: ( rule__Movie__VideoelementAssignment_3 )
            {
             before(grammarAccess.getMovieAccess().getVideoelementAssignment_3()); 
            // InternalVideoMontage.g:992:2: ( rule__Movie__VideoelementAssignment_3 )
            // InternalVideoMontage.g:992:3: rule__Movie__VideoelementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Movie__VideoelementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getVideoelementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__3__Impl"


    // $ANTLR start "rule__Movie__Group__4"
    // InternalVideoMontage.g:1000:1: rule__Movie__Group__4 : rule__Movie__Group__4__Impl rule__Movie__Group__5 ;
    public final void rule__Movie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1004:1: ( rule__Movie__Group__4__Impl rule__Movie__Group__5 )
            // InternalVideoMontage.g:1005:2: rule__Movie__Group__4__Impl rule__Movie__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Movie__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__4"


    // $ANTLR start "rule__Movie__Group__4__Impl"
    // InternalVideoMontage.g:1012:1: rule__Movie__Group__4__Impl : ( ( rule__Movie__VideoelementAssignment_4 )* ) ;
    public final void rule__Movie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1016:1: ( ( ( rule__Movie__VideoelementAssignment_4 )* ) )
            // InternalVideoMontage.g:1017:1: ( ( rule__Movie__VideoelementAssignment_4 )* )
            {
            // InternalVideoMontage.g:1017:1: ( ( rule__Movie__VideoelementAssignment_4 )* )
            // InternalVideoMontage.g:1018:2: ( rule__Movie__VideoelementAssignment_4 )*
            {
             before(grammarAccess.getMovieAccess().getVideoelementAssignment_4()); 
            // InternalVideoMontage.g:1019:2: ( rule__Movie__VideoelementAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVideoMontage.g:1019:3: rule__Movie__VideoelementAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Movie__VideoelementAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMovieAccess().getVideoelementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__4__Impl"


    // $ANTLR start "rule__Movie__Group__5"
    // InternalVideoMontage.g:1027:1: rule__Movie__Group__5 : rule__Movie__Group__5__Impl rule__Movie__Group__6 ;
    public final void rule__Movie__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1031:1: ( rule__Movie__Group__5__Impl rule__Movie__Group__6 )
            // InternalVideoMontage.g:1032:2: rule__Movie__Group__5__Impl rule__Movie__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Movie__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__5"


    // $ANTLR start "rule__Movie__Group__5__Impl"
    // InternalVideoMontage.g:1039:1: rule__Movie__Group__5__Impl : ( ( rule__Movie__AudioelementAssignment_5 ) ) ;
    public final void rule__Movie__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1043:1: ( ( ( rule__Movie__AudioelementAssignment_5 ) ) )
            // InternalVideoMontage.g:1044:1: ( ( rule__Movie__AudioelementAssignment_5 ) )
            {
            // InternalVideoMontage.g:1044:1: ( ( rule__Movie__AudioelementAssignment_5 ) )
            // InternalVideoMontage.g:1045:2: ( rule__Movie__AudioelementAssignment_5 )
            {
             before(grammarAccess.getMovieAccess().getAudioelementAssignment_5()); 
            // InternalVideoMontage.g:1046:2: ( rule__Movie__AudioelementAssignment_5 )
            // InternalVideoMontage.g:1046:3: rule__Movie__AudioelementAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Movie__AudioelementAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getAudioelementAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__5__Impl"


    // $ANTLR start "rule__Movie__Group__6"
    // InternalVideoMontage.g:1054:1: rule__Movie__Group__6 : rule__Movie__Group__6__Impl rule__Movie__Group__7 ;
    public final void rule__Movie__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1058:1: ( rule__Movie__Group__6__Impl rule__Movie__Group__7 )
            // InternalVideoMontage.g:1059:2: rule__Movie__Group__6__Impl rule__Movie__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Movie__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__6"


    // $ANTLR start "rule__Movie__Group__6__Impl"
    // InternalVideoMontage.g:1066:1: rule__Movie__Group__6__Impl : ( ( rule__Movie__AudioelementAssignment_6 )* ) ;
    public final void rule__Movie__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1070:1: ( ( ( rule__Movie__AudioelementAssignment_6 )* ) )
            // InternalVideoMontage.g:1071:1: ( ( rule__Movie__AudioelementAssignment_6 )* )
            {
            // InternalVideoMontage.g:1071:1: ( ( rule__Movie__AudioelementAssignment_6 )* )
            // InternalVideoMontage.g:1072:2: ( rule__Movie__AudioelementAssignment_6 )*
            {
             before(grammarAccess.getMovieAccess().getAudioelementAssignment_6()); 
            // InternalVideoMontage.g:1073:2: ( rule__Movie__AudioelementAssignment_6 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVideoMontage.g:1073:3: rule__Movie__AudioelementAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Movie__AudioelementAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMovieAccess().getAudioelementAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__6__Impl"


    // $ANTLR start "rule__Movie__Group__7"
    // InternalVideoMontage.g:1081:1: rule__Movie__Group__7 : rule__Movie__Group__7__Impl rule__Movie__Group__8 ;
    public final void rule__Movie__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1085:1: ( rule__Movie__Group__7__Impl rule__Movie__Group__8 )
            // InternalVideoMontage.g:1086:2: rule__Movie__Group__7__Impl rule__Movie__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Movie__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__7"


    // $ANTLR start "rule__Movie__Group__7__Impl"
    // InternalVideoMontage.g:1093:1: rule__Movie__Group__7__Impl : ( ( rule__Movie__SubtitleAssignment_7 ) ) ;
    public final void rule__Movie__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1097:1: ( ( ( rule__Movie__SubtitleAssignment_7 ) ) )
            // InternalVideoMontage.g:1098:1: ( ( rule__Movie__SubtitleAssignment_7 ) )
            {
            // InternalVideoMontage.g:1098:1: ( ( rule__Movie__SubtitleAssignment_7 ) )
            // InternalVideoMontage.g:1099:2: ( rule__Movie__SubtitleAssignment_7 )
            {
             before(grammarAccess.getMovieAccess().getSubtitleAssignment_7()); 
            // InternalVideoMontage.g:1100:2: ( rule__Movie__SubtitleAssignment_7 )
            // InternalVideoMontage.g:1100:3: rule__Movie__SubtitleAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Movie__SubtitleAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getSubtitleAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__7__Impl"


    // $ANTLR start "rule__Movie__Group__8"
    // InternalVideoMontage.g:1108:1: rule__Movie__Group__8 : rule__Movie__Group__8__Impl rule__Movie__Group__9 ;
    public final void rule__Movie__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1112:1: ( rule__Movie__Group__8__Impl rule__Movie__Group__9 )
            // InternalVideoMontage.g:1113:2: rule__Movie__Group__8__Impl rule__Movie__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Movie__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__8"


    // $ANTLR start "rule__Movie__Group__8__Impl"
    // InternalVideoMontage.g:1120:1: rule__Movie__Group__8__Impl : ( ( rule__Movie__SubtitleAssignment_8 )* ) ;
    public final void rule__Movie__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1124:1: ( ( ( rule__Movie__SubtitleAssignment_8 )* ) )
            // InternalVideoMontage.g:1125:1: ( ( rule__Movie__SubtitleAssignment_8 )* )
            {
            // InternalVideoMontage.g:1125:1: ( ( rule__Movie__SubtitleAssignment_8 )* )
            // InternalVideoMontage.g:1126:2: ( rule__Movie__SubtitleAssignment_8 )*
            {
             before(grammarAccess.getMovieAccess().getSubtitleAssignment_8()); 
            // InternalVideoMontage.g:1127:2: ( rule__Movie__SubtitleAssignment_8 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==24) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVideoMontage.g:1127:3: rule__Movie__SubtitleAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Movie__SubtitleAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMovieAccess().getSubtitleAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__8__Impl"


    // $ANTLR start "rule__Movie__Group__9"
    // InternalVideoMontage.g:1135:1: rule__Movie__Group__9 : rule__Movie__Group__9__Impl ;
    public final void rule__Movie__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1139:1: ( rule__Movie__Group__9__Impl )
            // InternalVideoMontage.g:1140:2: rule__Movie__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__9"


    // $ANTLR start "rule__Movie__Group__9__Impl"
    // InternalVideoMontage.g:1146:1: rule__Movie__Group__9__Impl : ( '}' ) ;
    public final void rule__Movie__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1150:1: ( ( '}' ) )
            // InternalVideoMontage.g:1151:1: ( '}' )
            {
            // InternalVideoMontage.g:1151:1: ( '}' )
            // InternalVideoMontage.g:1152:2: '}'
            {
             before(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__9__Impl"


    // $ANTLR start "rule__AudioElement__Group__0"
    // InternalVideoMontage.g:1162:1: rule__AudioElement__Group__0 : rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 ;
    public final void rule__AudioElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1166:1: ( rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 )
            // InternalVideoMontage.g:1167:2: rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AudioElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__0"


    // $ANTLR start "rule__AudioElement__Group__0__Impl"
    // InternalVideoMontage.g:1174:1: rule__AudioElement__Group__0__Impl : ( 'audioElement' ) ;
    public final void rule__AudioElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1178:1: ( ( 'audioElement' ) )
            // InternalVideoMontage.g:1179:1: ( 'audioElement' )
            {
            // InternalVideoMontage.g:1179:1: ( 'audioElement' )
            // InternalVideoMontage.g:1180:2: 'audioElement'
            {
             before(grammarAccess.getAudioElementAccess().getAudioElementKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAudioElementAccess().getAudioElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__0__Impl"


    // $ANTLR start "rule__AudioElement__Group__1"
    // InternalVideoMontage.g:1189:1: rule__AudioElement__Group__1 : rule__AudioElement__Group__1__Impl ;
    public final void rule__AudioElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1193:1: ( rule__AudioElement__Group__1__Impl )
            // InternalVideoMontage.g:1194:2: rule__AudioElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__1"


    // $ANTLR start "rule__AudioElement__Group__1__Impl"
    // InternalVideoMontage.g:1200:1: rule__AudioElement__Group__1__Impl : ( ( rule__AudioElement__Alternatives_1 ) ) ;
    public final void rule__AudioElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1204:1: ( ( ( rule__AudioElement__Alternatives_1 ) ) )
            // InternalVideoMontage.g:1205:1: ( ( rule__AudioElement__Alternatives_1 ) )
            {
            // InternalVideoMontage.g:1205:1: ( ( rule__AudioElement__Alternatives_1 ) )
            // InternalVideoMontage.g:1206:2: ( rule__AudioElement__Alternatives_1 )
            {
             before(grammarAccess.getAudioElementAccess().getAlternatives_1()); 
            // InternalVideoMontage.g:1207:2: ( rule__AudioElement__Alternatives_1 )
            // InternalVideoMontage.g:1207:3: rule__AudioElement__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioElement__Group__1__Impl"


    // $ANTLR start "rule__VideoElement__Group__0"
    // InternalVideoMontage.g:1216:1: rule__VideoElement__Group__0 : rule__VideoElement__Group__0__Impl rule__VideoElement__Group__1 ;
    public final void rule__VideoElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1220:1: ( rule__VideoElement__Group__0__Impl rule__VideoElement__Group__1 )
            // InternalVideoMontage.g:1221:2: rule__VideoElement__Group__0__Impl rule__VideoElement__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__VideoElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoElement__Group__0"


    // $ANTLR start "rule__VideoElement__Group__0__Impl"
    // InternalVideoMontage.g:1228:1: rule__VideoElement__Group__0__Impl : ( 'videoElement' ) ;
    public final void rule__VideoElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1232:1: ( ( 'videoElement' ) )
            // InternalVideoMontage.g:1233:1: ( 'videoElement' )
            {
            // InternalVideoMontage.g:1233:1: ( 'videoElement' )
            // InternalVideoMontage.g:1234:2: 'videoElement'
            {
             before(grammarAccess.getVideoElementAccess().getVideoElementKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVideoElementAccess().getVideoElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoElement__Group__0__Impl"


    // $ANTLR start "rule__VideoElement__Group__1"
    // InternalVideoMontage.g:1243:1: rule__VideoElement__Group__1 : rule__VideoElement__Group__1__Impl ;
    public final void rule__VideoElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1247:1: ( rule__VideoElement__Group__1__Impl )
            // InternalVideoMontage.g:1248:2: rule__VideoElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoElement__Group__1"


    // $ANTLR start "rule__VideoElement__Group__1__Impl"
    // InternalVideoMontage.g:1254:1: rule__VideoElement__Group__1__Impl : ( ( rule__VideoElement__Alternatives_1 ) ) ;
    public final void rule__VideoElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1258:1: ( ( ( rule__VideoElement__Alternatives_1 ) ) )
            // InternalVideoMontage.g:1259:1: ( ( rule__VideoElement__Alternatives_1 ) )
            {
            // InternalVideoMontage.g:1259:1: ( ( rule__VideoElement__Alternatives_1 ) )
            // InternalVideoMontage.g:1260:2: ( rule__VideoElement__Alternatives_1 )
            {
             before(grammarAccess.getVideoElementAccess().getAlternatives_1()); 
            // InternalVideoMontage.g:1261:2: ( rule__VideoElement__Alternatives_1 )
            // InternalVideoMontage.g:1261:3: rule__VideoElement__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoElement__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoElementAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoElement__Group__1__Impl"


    // $ANTLR start "rule__Subtitle__Group__0"
    // InternalVideoMontage.g:1270:1: rule__Subtitle__Group__0 : rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1 ;
    public final void rule__Subtitle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1274:1: ( rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1 )
            // InternalVideoMontage.g:1275:2: rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Subtitle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__0"


    // $ANTLR start "rule__Subtitle__Group__0__Impl"
    // InternalVideoMontage.g:1282:1: rule__Subtitle__Group__0__Impl : ( 'Subtitle' ) ;
    public final void rule__Subtitle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1286:1: ( ( 'Subtitle' ) )
            // InternalVideoMontage.g:1287:1: ( 'Subtitle' )
            {
            // InternalVideoMontage.g:1287:1: ( 'Subtitle' )
            // InternalVideoMontage.g:1288:2: 'Subtitle'
            {
             before(grammarAccess.getSubtitleAccess().getSubtitleKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getSubtitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__0__Impl"


    // $ANTLR start "rule__Subtitle__Group__1"
    // InternalVideoMontage.g:1297:1: rule__Subtitle__Group__1 : rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2 ;
    public final void rule__Subtitle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1301:1: ( rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2 )
            // InternalVideoMontage.g:1302:2: rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Subtitle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__1"


    // $ANTLR start "rule__Subtitle__Group__1__Impl"
    // InternalVideoMontage.g:1309:1: rule__Subtitle__Group__1__Impl : ( 'start' ) ;
    public final void rule__Subtitle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1313:1: ( ( 'start' ) )
            // InternalVideoMontage.g:1314:1: ( 'start' )
            {
            // InternalVideoMontage.g:1314:1: ( 'start' )
            // InternalVideoMontage.g:1315:2: 'start'
            {
             before(grammarAccess.getSubtitleAccess().getStartKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getStartKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__1__Impl"


    // $ANTLR start "rule__Subtitle__Group__2"
    // InternalVideoMontage.g:1324:1: rule__Subtitle__Group__2 : rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3 ;
    public final void rule__Subtitle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1328:1: ( rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3 )
            // InternalVideoMontage.g:1329:2: rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Subtitle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__2"


    // $ANTLR start "rule__Subtitle__Group__2__Impl"
    // InternalVideoMontage.g:1336:1: rule__Subtitle__Group__2__Impl : ( ':' ) ;
    public final void rule__Subtitle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1340:1: ( ( ':' ) )
            // InternalVideoMontage.g:1341:1: ( ':' )
            {
            // InternalVideoMontage.g:1341:1: ( ':' )
            // InternalVideoMontage.g:1342:2: ':'
            {
             before(grammarAccess.getSubtitleAccess().getColonKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__2__Impl"


    // $ANTLR start "rule__Subtitle__Group__3"
    // InternalVideoMontage.g:1351:1: rule__Subtitle__Group__3 : rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4 ;
    public final void rule__Subtitle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1355:1: ( rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4 )
            // InternalVideoMontage.g:1356:2: rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Subtitle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__3"


    // $ANTLR start "rule__Subtitle__Group__3__Impl"
    // InternalVideoMontage.g:1363:1: rule__Subtitle__Group__3__Impl : ( ( rule__Subtitle__StartingmomentAssignment_3 ) ) ;
    public final void rule__Subtitle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1367:1: ( ( ( rule__Subtitle__StartingmomentAssignment_3 ) ) )
            // InternalVideoMontage.g:1368:1: ( ( rule__Subtitle__StartingmomentAssignment_3 ) )
            {
            // InternalVideoMontage.g:1368:1: ( ( rule__Subtitle__StartingmomentAssignment_3 ) )
            // InternalVideoMontage.g:1369:2: ( rule__Subtitle__StartingmomentAssignment_3 )
            {
             before(grammarAccess.getSubtitleAccess().getStartingmomentAssignment_3()); 
            // InternalVideoMontage.g:1370:2: ( rule__Subtitle__StartingmomentAssignment_3 )
            // InternalVideoMontage.g:1370:3: rule__Subtitle__StartingmomentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__StartingmomentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getStartingmomentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__3__Impl"


    // $ANTLR start "rule__Subtitle__Group__4"
    // InternalVideoMontage.g:1378:1: rule__Subtitle__Group__4 : rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5 ;
    public final void rule__Subtitle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1382:1: ( rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5 )
            // InternalVideoMontage.g:1383:2: rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Subtitle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__4"


    // $ANTLR start "rule__Subtitle__Group__4__Impl"
    // InternalVideoMontage.g:1390:1: rule__Subtitle__Group__4__Impl : ( '{' ) ;
    public final void rule__Subtitle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1394:1: ( ( '{' ) )
            // InternalVideoMontage.g:1395:1: ( '{' )
            {
            // InternalVideoMontage.g:1395:1: ( '{' )
            // InternalVideoMontage.g:1396:2: '{'
            {
             before(grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__4__Impl"


    // $ANTLR start "rule__Subtitle__Group__5"
    // InternalVideoMontage.g:1405:1: rule__Subtitle__Group__5 : rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6 ;
    public final void rule__Subtitle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1409:1: ( rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6 )
            // InternalVideoMontage.g:1410:2: rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Subtitle__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__5"


    // $ANTLR start "rule__Subtitle__Group__5__Impl"
    // InternalVideoMontage.g:1417:1: rule__Subtitle__Group__5__Impl : ( ( rule__Subtitle__Group_5__0 )? ) ;
    public final void rule__Subtitle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1421:1: ( ( ( rule__Subtitle__Group_5__0 )? ) )
            // InternalVideoMontage.g:1422:1: ( ( rule__Subtitle__Group_5__0 )? )
            {
            // InternalVideoMontage.g:1422:1: ( ( rule__Subtitle__Group_5__0 )? )
            // InternalVideoMontage.g:1423:2: ( rule__Subtitle__Group_5__0 )?
            {
             before(grammarAccess.getSubtitleAccess().getGroup_5()); 
            // InternalVideoMontage.g:1424:2: ( rule__Subtitle__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVideoMontage.g:1424:3: rule__Subtitle__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subtitle__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubtitleAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__5__Impl"


    // $ANTLR start "rule__Subtitle__Group__6"
    // InternalVideoMontage.g:1432:1: rule__Subtitle__Group__6 : rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7 ;
    public final void rule__Subtitle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1436:1: ( rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7 )
            // InternalVideoMontage.g:1437:2: rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Subtitle__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__6"


    // $ANTLR start "rule__Subtitle__Group__6__Impl"
    // InternalVideoMontage.g:1444:1: rule__Subtitle__Group__6__Impl : ( 'textArea' ) ;
    public final void rule__Subtitle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1448:1: ( ( 'textArea' ) )
            // InternalVideoMontage.g:1449:1: ( 'textArea' )
            {
            // InternalVideoMontage.g:1449:1: ( 'textArea' )
            // InternalVideoMontage.g:1450:2: 'textArea'
            {
             before(grammarAccess.getSubtitleAccess().getTextAreaKeyword_6()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getTextAreaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__6__Impl"


    // $ANTLR start "rule__Subtitle__Group__7"
    // InternalVideoMontage.g:1459:1: rule__Subtitle__Group__7 : rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8 ;
    public final void rule__Subtitle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1463:1: ( rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8 )
            // InternalVideoMontage.g:1464:2: rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Subtitle__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__7"


    // $ANTLR start "rule__Subtitle__Group__7__Impl"
    // InternalVideoMontage.g:1471:1: rule__Subtitle__Group__7__Impl : ( ( rule__Subtitle__TextareaAssignment_7 ) ) ;
    public final void rule__Subtitle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1475:1: ( ( ( rule__Subtitle__TextareaAssignment_7 ) ) )
            // InternalVideoMontage.g:1476:1: ( ( rule__Subtitle__TextareaAssignment_7 ) )
            {
            // InternalVideoMontage.g:1476:1: ( ( rule__Subtitle__TextareaAssignment_7 ) )
            // InternalVideoMontage.g:1477:2: ( rule__Subtitle__TextareaAssignment_7 )
            {
             before(grammarAccess.getSubtitleAccess().getTextareaAssignment_7()); 
            // InternalVideoMontage.g:1478:2: ( rule__Subtitle__TextareaAssignment_7 )
            // InternalVideoMontage.g:1478:3: rule__Subtitle__TextareaAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__TextareaAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getTextareaAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__7__Impl"


    // $ANTLR start "rule__Subtitle__Group__8"
    // InternalVideoMontage.g:1486:1: rule__Subtitle__Group__8 : rule__Subtitle__Group__8__Impl ;
    public final void rule__Subtitle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1490:1: ( rule__Subtitle__Group__8__Impl )
            // InternalVideoMontage.g:1491:2: rule__Subtitle__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__8"


    // $ANTLR start "rule__Subtitle__Group__8__Impl"
    // InternalVideoMontage.g:1497:1: rule__Subtitle__Group__8__Impl : ( '}' ) ;
    public final void rule__Subtitle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1501:1: ( ( '}' ) )
            // InternalVideoMontage.g:1502:1: ( '}' )
            {
            // InternalVideoMontage.g:1502:1: ( '}' )
            // InternalVideoMontage.g:1503:2: '}'
            {
             before(grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__8__Impl"


    // $ANTLR start "rule__Subtitle__Group_5__0"
    // InternalVideoMontage.g:1513:1: rule__Subtitle__Group_5__0 : rule__Subtitle__Group_5__0__Impl rule__Subtitle__Group_5__1 ;
    public final void rule__Subtitle__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1517:1: ( rule__Subtitle__Group_5__0__Impl rule__Subtitle__Group_5__1 )
            // InternalVideoMontage.g:1518:2: rule__Subtitle__Group_5__0__Impl rule__Subtitle__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Subtitle__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_5__0"


    // $ANTLR start "rule__Subtitle__Group_5__0__Impl"
    // InternalVideoMontage.g:1525:1: rule__Subtitle__Group_5__0__Impl : ( 'duration' ) ;
    public final void rule__Subtitle__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1529:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:1530:1: ( 'duration' )
            {
            // InternalVideoMontage.g:1530:1: ( 'duration' )
            // InternalVideoMontage.g:1531:2: 'duration'
            {
             before(grammarAccess.getSubtitleAccess().getDurationKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getDurationKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_5__0__Impl"


    // $ANTLR start "rule__Subtitle__Group_5__1"
    // InternalVideoMontage.g:1540:1: rule__Subtitle__Group_5__1 : rule__Subtitle__Group_5__1__Impl ;
    public final void rule__Subtitle__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1544:1: ( rule__Subtitle__Group_5__1__Impl )
            // InternalVideoMontage.g:1545:2: rule__Subtitle__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_5__1"


    // $ANTLR start "rule__Subtitle__Group_5__1__Impl"
    // InternalVideoMontage.g:1551:1: rule__Subtitle__Group_5__1__Impl : ( ( rule__Subtitle__DurationAssignment_5_1 ) ) ;
    public final void rule__Subtitle__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1555:1: ( ( ( rule__Subtitle__DurationAssignment_5_1 ) ) )
            // InternalVideoMontage.g:1556:1: ( ( rule__Subtitle__DurationAssignment_5_1 ) )
            {
            // InternalVideoMontage.g:1556:1: ( ( rule__Subtitle__DurationAssignment_5_1 ) )
            // InternalVideoMontage.g:1557:2: ( rule__Subtitle__DurationAssignment_5_1 )
            {
             before(grammarAccess.getSubtitleAccess().getDurationAssignment_5_1()); 
            // InternalVideoMontage.g:1558:2: ( rule__Subtitle__DurationAssignment_5_1 )
            // InternalVideoMontage.g:1558:3: rule__Subtitle__DurationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__DurationAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getDurationAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_5__1__Impl"


    // $ANTLR start "rule__Audio__Group__0"
    // InternalVideoMontage.g:1567:1: rule__Audio__Group__0 : rule__Audio__Group__0__Impl rule__Audio__Group__1 ;
    public final void rule__Audio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1571:1: ( rule__Audio__Group__0__Impl rule__Audio__Group__1 )
            // InternalVideoMontage.g:1572:2: rule__Audio__Group__0__Impl rule__Audio__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Audio__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__0"


    // $ANTLR start "rule__Audio__Group__0__Impl"
    // InternalVideoMontage.g:1579:1: rule__Audio__Group__0__Impl : ( 'Audio' ) ;
    public final void rule__Audio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1583:1: ( ( 'Audio' ) )
            // InternalVideoMontage.g:1584:1: ( 'Audio' )
            {
            // InternalVideoMontage.g:1584:1: ( 'Audio' )
            // InternalVideoMontage.g:1585:2: 'Audio'
            {
             before(grammarAccess.getAudioAccess().getAudioKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getAudioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__0__Impl"


    // $ANTLR start "rule__Audio__Group__1"
    // InternalVideoMontage.g:1594:1: rule__Audio__Group__1 : rule__Audio__Group__1__Impl rule__Audio__Group__2 ;
    public final void rule__Audio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1598:1: ( rule__Audio__Group__1__Impl rule__Audio__Group__2 )
            // InternalVideoMontage.g:1599:2: rule__Audio__Group__1__Impl rule__Audio__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Audio__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__1"


    // $ANTLR start "rule__Audio__Group__1__Impl"
    // InternalVideoMontage.g:1606:1: rule__Audio__Group__1__Impl : ( ( rule__Audio__NameAssignment_1 ) ) ;
    public final void rule__Audio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1610:1: ( ( ( rule__Audio__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:1611:1: ( ( rule__Audio__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:1611:1: ( ( rule__Audio__NameAssignment_1 ) )
            // InternalVideoMontage.g:1612:2: ( rule__Audio__NameAssignment_1 )
            {
             before(grammarAccess.getAudioAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:1613:2: ( rule__Audio__NameAssignment_1 )
            // InternalVideoMontage.g:1613:3: rule__Audio__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__1__Impl"


    // $ANTLR start "rule__Audio__Group__2"
    // InternalVideoMontage.g:1621:1: rule__Audio__Group__2 : rule__Audio__Group__2__Impl rule__Audio__Group__3 ;
    public final void rule__Audio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1625:1: ( rule__Audio__Group__2__Impl rule__Audio__Group__3 )
            // InternalVideoMontage.g:1626:2: rule__Audio__Group__2__Impl rule__Audio__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Audio__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__2"


    // $ANTLR start "rule__Audio__Group__2__Impl"
    // InternalVideoMontage.g:1633:1: rule__Audio__Group__2__Impl : ( 'start' ) ;
    public final void rule__Audio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1637:1: ( ( 'start' ) )
            // InternalVideoMontage.g:1638:1: ( 'start' )
            {
            // InternalVideoMontage.g:1638:1: ( 'start' )
            // InternalVideoMontage.g:1639:2: 'start'
            {
             before(grammarAccess.getAudioAccess().getStartKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getStartKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__2__Impl"


    // $ANTLR start "rule__Audio__Group__3"
    // InternalVideoMontage.g:1648:1: rule__Audio__Group__3 : rule__Audio__Group__3__Impl rule__Audio__Group__4 ;
    public final void rule__Audio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1652:1: ( rule__Audio__Group__3__Impl rule__Audio__Group__4 )
            // InternalVideoMontage.g:1653:2: rule__Audio__Group__3__Impl rule__Audio__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Audio__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__3"


    // $ANTLR start "rule__Audio__Group__3__Impl"
    // InternalVideoMontage.g:1660:1: rule__Audio__Group__3__Impl : ( ':' ) ;
    public final void rule__Audio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1664:1: ( ( ':' ) )
            // InternalVideoMontage.g:1665:1: ( ':' )
            {
            // InternalVideoMontage.g:1665:1: ( ':' )
            // InternalVideoMontage.g:1666:2: ':'
            {
             before(grammarAccess.getAudioAccess().getColonKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__3__Impl"


    // $ANTLR start "rule__Audio__Group__4"
    // InternalVideoMontage.g:1675:1: rule__Audio__Group__4 : rule__Audio__Group__4__Impl rule__Audio__Group__5 ;
    public final void rule__Audio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1679:1: ( rule__Audio__Group__4__Impl rule__Audio__Group__5 )
            // InternalVideoMontage.g:1680:2: rule__Audio__Group__4__Impl rule__Audio__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Audio__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__4"


    // $ANTLR start "rule__Audio__Group__4__Impl"
    // InternalVideoMontage.g:1687:1: rule__Audio__Group__4__Impl : ( ( rule__Audio__StartingmomentAssignment_4 ) ) ;
    public final void rule__Audio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1691:1: ( ( ( rule__Audio__StartingmomentAssignment_4 ) ) )
            // InternalVideoMontage.g:1692:1: ( ( rule__Audio__StartingmomentAssignment_4 ) )
            {
            // InternalVideoMontage.g:1692:1: ( ( rule__Audio__StartingmomentAssignment_4 ) )
            // InternalVideoMontage.g:1693:2: ( rule__Audio__StartingmomentAssignment_4 )
            {
             before(grammarAccess.getAudioAccess().getStartingmomentAssignment_4()); 
            // InternalVideoMontage.g:1694:2: ( rule__Audio__StartingmomentAssignment_4 )
            // InternalVideoMontage.g:1694:3: rule__Audio__StartingmomentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Audio__StartingmomentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getStartingmomentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__4__Impl"


    // $ANTLR start "rule__Audio__Group__5"
    // InternalVideoMontage.g:1702:1: rule__Audio__Group__5 : rule__Audio__Group__5__Impl rule__Audio__Group__6 ;
    public final void rule__Audio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1706:1: ( rule__Audio__Group__5__Impl rule__Audio__Group__6 )
            // InternalVideoMontage.g:1707:2: rule__Audio__Group__5__Impl rule__Audio__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Audio__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__5"


    // $ANTLR start "rule__Audio__Group__5__Impl"
    // InternalVideoMontage.g:1714:1: rule__Audio__Group__5__Impl : ( '{' ) ;
    public final void rule__Audio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1718:1: ( ( '{' ) )
            // InternalVideoMontage.g:1719:1: ( '{' )
            {
            // InternalVideoMontage.g:1719:1: ( '{' )
            // InternalVideoMontage.g:1720:2: '{'
            {
             before(grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__5__Impl"


    // $ANTLR start "rule__Audio__Group__6"
    // InternalVideoMontage.g:1729:1: rule__Audio__Group__6 : rule__Audio__Group__6__Impl rule__Audio__Group__7 ;
    public final void rule__Audio__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1733:1: ( rule__Audio__Group__6__Impl rule__Audio__Group__7 )
            // InternalVideoMontage.g:1734:2: rule__Audio__Group__6__Impl rule__Audio__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Audio__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__6"


    // $ANTLR start "rule__Audio__Group__6__Impl"
    // InternalVideoMontage.g:1741:1: rule__Audio__Group__6__Impl : ( ( rule__Audio__Group_6__0 )? ) ;
    public final void rule__Audio__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1745:1: ( ( ( rule__Audio__Group_6__0 )? ) )
            // InternalVideoMontage.g:1746:1: ( ( rule__Audio__Group_6__0 )? )
            {
            // InternalVideoMontage.g:1746:1: ( ( rule__Audio__Group_6__0 )? )
            // InternalVideoMontage.g:1747:2: ( rule__Audio__Group_6__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_6()); 
            // InternalVideoMontage.g:1748:2: ( rule__Audio__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVideoMontage.g:1748:3: rule__Audio__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Audio__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__6__Impl"


    // $ANTLR start "rule__Audio__Group__7"
    // InternalVideoMontage.g:1756:1: rule__Audio__Group__7 : rule__Audio__Group__7__Impl rule__Audio__Group__8 ;
    public final void rule__Audio__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1760:1: ( rule__Audio__Group__7__Impl rule__Audio__Group__8 )
            // InternalVideoMontage.g:1761:2: rule__Audio__Group__7__Impl rule__Audio__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Audio__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__7"


    // $ANTLR start "rule__Audio__Group__7__Impl"
    // InternalVideoMontage.g:1768:1: rule__Audio__Group__7__Impl : ( ( rule__Audio__Group_7__0 )? ) ;
    public final void rule__Audio__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1772:1: ( ( ( rule__Audio__Group_7__0 )? ) )
            // InternalVideoMontage.g:1773:1: ( ( rule__Audio__Group_7__0 )? )
            {
            // InternalVideoMontage.g:1773:1: ( ( rule__Audio__Group_7__0 )? )
            // InternalVideoMontage.g:1774:2: ( rule__Audio__Group_7__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_7()); 
            // InternalVideoMontage.g:1775:2: ( rule__Audio__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVideoMontage.g:1775:3: rule__Audio__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Audio__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__7__Impl"


    // $ANTLR start "rule__Audio__Group__8"
    // InternalVideoMontage.g:1783:1: rule__Audio__Group__8 : rule__Audio__Group__8__Impl ;
    public final void rule__Audio__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1787:1: ( rule__Audio__Group__8__Impl )
            // InternalVideoMontage.g:1788:2: rule__Audio__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__8"


    // $ANTLR start "rule__Audio__Group__8__Impl"
    // InternalVideoMontage.g:1794:1: rule__Audio__Group__8__Impl : ( '}' ) ;
    public final void rule__Audio__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1798:1: ( ( '}' ) )
            // InternalVideoMontage.g:1799:1: ( '}' )
            {
            // InternalVideoMontage.g:1799:1: ( '}' )
            // InternalVideoMontage.g:1800:2: '}'
            {
             before(grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__8__Impl"


    // $ANTLR start "rule__Audio__Group_6__0"
    // InternalVideoMontage.g:1810:1: rule__Audio__Group_6__0 : rule__Audio__Group_6__0__Impl rule__Audio__Group_6__1 ;
    public final void rule__Audio__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1814:1: ( rule__Audio__Group_6__0__Impl rule__Audio__Group_6__1 )
            // InternalVideoMontage.g:1815:2: rule__Audio__Group_6__0__Impl rule__Audio__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Audio__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_6__0"


    // $ANTLR start "rule__Audio__Group_6__0__Impl"
    // InternalVideoMontage.g:1822:1: rule__Audio__Group_6__0__Impl : ( 'path' ) ;
    public final void rule__Audio__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1826:1: ( ( 'path' ) )
            // InternalVideoMontage.g:1827:1: ( 'path' )
            {
            // InternalVideoMontage.g:1827:1: ( 'path' )
            // InternalVideoMontage.g:1828:2: 'path'
            {
             before(grammarAccess.getAudioAccess().getPathKeyword_6_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getPathKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_6__0__Impl"


    // $ANTLR start "rule__Audio__Group_6__1"
    // InternalVideoMontage.g:1837:1: rule__Audio__Group_6__1 : rule__Audio__Group_6__1__Impl ;
    public final void rule__Audio__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1841:1: ( rule__Audio__Group_6__1__Impl )
            // InternalVideoMontage.g:1842:2: rule__Audio__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_6__1"


    // $ANTLR start "rule__Audio__Group_6__1__Impl"
    // InternalVideoMontage.g:1848:1: rule__Audio__Group_6__1__Impl : ( ( rule__Audio__PathAssignment_6_1 ) ) ;
    public final void rule__Audio__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1852:1: ( ( ( rule__Audio__PathAssignment_6_1 ) ) )
            // InternalVideoMontage.g:1853:1: ( ( rule__Audio__PathAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:1853:1: ( ( rule__Audio__PathAssignment_6_1 ) )
            // InternalVideoMontage.g:1854:2: ( rule__Audio__PathAssignment_6_1 )
            {
             before(grammarAccess.getAudioAccess().getPathAssignment_6_1()); 
            // InternalVideoMontage.g:1855:2: ( rule__Audio__PathAssignment_6_1 )
            // InternalVideoMontage.g:1855:3: rule__Audio__PathAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__PathAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getPathAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_6__1__Impl"


    // $ANTLR start "rule__Audio__Group_7__0"
    // InternalVideoMontage.g:1864:1: rule__Audio__Group_7__0 : rule__Audio__Group_7__0__Impl rule__Audio__Group_7__1 ;
    public final void rule__Audio__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1868:1: ( rule__Audio__Group_7__0__Impl rule__Audio__Group_7__1 )
            // InternalVideoMontage.g:1869:2: rule__Audio__Group_7__0__Impl rule__Audio__Group_7__1
            {
            pushFollow(FOLLOW_22);
            rule__Audio__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_7__0"


    // $ANTLR start "rule__Audio__Group_7__0__Impl"
    // InternalVideoMontage.g:1876:1: rule__Audio__Group_7__0__Impl : ( 'transition' ) ;
    public final void rule__Audio__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1880:1: ( ( 'transition' ) )
            // InternalVideoMontage.g:1881:1: ( 'transition' )
            {
            // InternalVideoMontage.g:1881:1: ( 'transition' )
            // InternalVideoMontage.g:1882:2: 'transition'
            {
             before(grammarAccess.getAudioAccess().getTransitionKeyword_7_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getTransitionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_7__0__Impl"


    // $ANTLR start "rule__Audio__Group_7__1"
    // InternalVideoMontage.g:1891:1: rule__Audio__Group_7__1 : rule__Audio__Group_7__1__Impl ;
    public final void rule__Audio__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1895:1: ( rule__Audio__Group_7__1__Impl )
            // InternalVideoMontage.g:1896:2: rule__Audio__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_7__1"


    // $ANTLR start "rule__Audio__Group_7__1__Impl"
    // InternalVideoMontage.g:1902:1: rule__Audio__Group_7__1__Impl : ( ( rule__Audio__TransitionAssignment_7_1 ) ) ;
    public final void rule__Audio__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1906:1: ( ( ( rule__Audio__TransitionAssignment_7_1 ) ) )
            // InternalVideoMontage.g:1907:1: ( ( rule__Audio__TransitionAssignment_7_1 ) )
            {
            // InternalVideoMontage.g:1907:1: ( ( rule__Audio__TransitionAssignment_7_1 ) )
            // InternalVideoMontage.g:1908:2: ( rule__Audio__TransitionAssignment_7_1 )
            {
             before(grammarAccess.getAudioAccess().getTransitionAssignment_7_1()); 
            // InternalVideoMontage.g:1909:2: ( rule__Audio__TransitionAssignment_7_1 )
            // InternalVideoMontage.g:1909:3: rule__Audio__TransitionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__TransitionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getTransitionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_7__1__Impl"


    // $ANTLR start "rule__AudioClip__Group__0"
    // InternalVideoMontage.g:1918:1: rule__AudioClip__Group__0 : rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1 ;
    public final void rule__AudioClip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1922:1: ( rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1 )
            // InternalVideoMontage.g:1923:2: rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AudioClip__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__0"


    // $ANTLR start "rule__AudioClip__Group__0__Impl"
    // InternalVideoMontage.g:1930:1: rule__AudioClip__Group__0__Impl : ( 'AudioClip' ) ;
    public final void rule__AudioClip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1934:1: ( ( 'AudioClip' ) )
            // InternalVideoMontage.g:1935:1: ( 'AudioClip' )
            {
            // InternalVideoMontage.g:1935:1: ( 'AudioClip' )
            // InternalVideoMontage.g:1936:2: 'AudioClip'
            {
             before(grammarAccess.getAudioClipAccess().getAudioClipKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getAudioClipKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__0__Impl"


    // $ANTLR start "rule__AudioClip__Group__1"
    // InternalVideoMontage.g:1945:1: rule__AudioClip__Group__1 : rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2 ;
    public final void rule__AudioClip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1949:1: ( rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2 )
            // InternalVideoMontage.g:1950:2: rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__AudioClip__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__1"


    // $ANTLR start "rule__AudioClip__Group__1__Impl"
    // InternalVideoMontage.g:1957:1: rule__AudioClip__Group__1__Impl : ( ( rule__AudioClip__NameAssignment_1 ) ) ;
    public final void rule__AudioClip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1961:1: ( ( ( rule__AudioClip__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:1962:1: ( ( rule__AudioClip__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:1962:1: ( ( rule__AudioClip__NameAssignment_1 ) )
            // InternalVideoMontage.g:1963:2: ( rule__AudioClip__NameAssignment_1 )
            {
             before(grammarAccess.getAudioClipAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:1964:2: ( rule__AudioClip__NameAssignment_1 )
            // InternalVideoMontage.g:1964:3: rule__AudioClip__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__1__Impl"


    // $ANTLR start "rule__AudioClip__Group__2"
    // InternalVideoMontage.g:1972:1: rule__AudioClip__Group__2 : rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3 ;
    public final void rule__AudioClip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1976:1: ( rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3 )
            // InternalVideoMontage.g:1977:2: rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__AudioClip__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__2"


    // $ANTLR start "rule__AudioClip__Group__2__Impl"
    // InternalVideoMontage.g:1984:1: rule__AudioClip__Group__2__Impl : ( 'start' ) ;
    public final void rule__AudioClip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1988:1: ( ( 'start' ) )
            // InternalVideoMontage.g:1989:1: ( 'start' )
            {
            // InternalVideoMontage.g:1989:1: ( 'start' )
            // InternalVideoMontage.g:1990:2: 'start'
            {
             before(grammarAccess.getAudioClipAccess().getStartKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getStartKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__2__Impl"


    // $ANTLR start "rule__AudioClip__Group__3"
    // InternalVideoMontage.g:1999:1: rule__AudioClip__Group__3 : rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4 ;
    public final void rule__AudioClip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2003:1: ( rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4 )
            // InternalVideoMontage.g:2004:2: rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__AudioClip__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__3"


    // $ANTLR start "rule__AudioClip__Group__3__Impl"
    // InternalVideoMontage.g:2011:1: rule__AudioClip__Group__3__Impl : ( ':' ) ;
    public final void rule__AudioClip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2015:1: ( ( ':' ) )
            // InternalVideoMontage.g:2016:1: ( ':' )
            {
            // InternalVideoMontage.g:2016:1: ( ':' )
            // InternalVideoMontage.g:2017:2: ':'
            {
             before(grammarAccess.getAudioClipAccess().getColonKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__3__Impl"


    // $ANTLR start "rule__AudioClip__Group__4"
    // InternalVideoMontage.g:2026:1: rule__AudioClip__Group__4 : rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5 ;
    public final void rule__AudioClip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2030:1: ( rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5 )
            // InternalVideoMontage.g:2031:2: rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__AudioClip__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__4"


    // $ANTLR start "rule__AudioClip__Group__4__Impl"
    // InternalVideoMontage.g:2038:1: rule__AudioClip__Group__4__Impl : ( ( rule__AudioClip__StartingmomentAssignment_4 ) ) ;
    public final void rule__AudioClip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2042:1: ( ( ( rule__AudioClip__StartingmomentAssignment_4 ) ) )
            // InternalVideoMontage.g:2043:1: ( ( rule__AudioClip__StartingmomentAssignment_4 ) )
            {
            // InternalVideoMontage.g:2043:1: ( ( rule__AudioClip__StartingmomentAssignment_4 ) )
            // InternalVideoMontage.g:2044:2: ( rule__AudioClip__StartingmomentAssignment_4 )
            {
             before(grammarAccess.getAudioClipAccess().getStartingmomentAssignment_4()); 
            // InternalVideoMontage.g:2045:2: ( rule__AudioClip__StartingmomentAssignment_4 )
            // InternalVideoMontage.g:2045:3: rule__AudioClip__StartingmomentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__StartingmomentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getStartingmomentAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__4__Impl"


    // $ANTLR start "rule__AudioClip__Group__5"
    // InternalVideoMontage.g:2053:1: rule__AudioClip__Group__5 : rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6 ;
    public final void rule__AudioClip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2057:1: ( rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6 )
            // InternalVideoMontage.g:2058:2: rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__AudioClip__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__5"


    // $ANTLR start "rule__AudioClip__Group__5__Impl"
    // InternalVideoMontage.g:2065:1: rule__AudioClip__Group__5__Impl : ( '{' ) ;
    public final void rule__AudioClip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2069:1: ( ( '{' ) )
            // InternalVideoMontage.g:2070:1: ( '{' )
            {
            // InternalVideoMontage.g:2070:1: ( '{' )
            // InternalVideoMontage.g:2071:2: '{'
            {
             before(grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__5__Impl"


    // $ANTLR start "rule__AudioClip__Group__6"
    // InternalVideoMontage.g:2080:1: rule__AudioClip__Group__6 : rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7 ;
    public final void rule__AudioClip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2084:1: ( rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7 )
            // InternalVideoMontage.g:2085:2: rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__AudioClip__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__6"


    // $ANTLR start "rule__AudioClip__Group__6__Impl"
    // InternalVideoMontage.g:2092:1: rule__AudioClip__Group__6__Impl : ( ( rule__AudioClip__Group_6__0 )? ) ;
    public final void rule__AudioClip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2096:1: ( ( ( rule__AudioClip__Group_6__0 )? ) )
            // InternalVideoMontage.g:2097:1: ( ( rule__AudioClip__Group_6__0 )? )
            {
            // InternalVideoMontage.g:2097:1: ( ( rule__AudioClip__Group_6__0 )? )
            // InternalVideoMontage.g:2098:2: ( rule__AudioClip__Group_6__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_6()); 
            // InternalVideoMontage.g:2099:2: ( rule__AudioClip__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVideoMontage.g:2099:3: rule__AudioClip__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioClip__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioClipAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__6__Impl"


    // $ANTLR start "rule__AudioClip__Group__7"
    // InternalVideoMontage.g:2107:1: rule__AudioClip__Group__7 : rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8 ;
    public final void rule__AudioClip__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2111:1: ( rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8 )
            // InternalVideoMontage.g:2112:2: rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__AudioClip__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__7"


    // $ANTLR start "rule__AudioClip__Group__7__Impl"
    // InternalVideoMontage.g:2119:1: rule__AudioClip__Group__7__Impl : ( ( rule__AudioClip__Group_7__0 ) ) ;
    public final void rule__AudioClip__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2123:1: ( ( ( rule__AudioClip__Group_7__0 ) ) )
            // InternalVideoMontage.g:2124:1: ( ( rule__AudioClip__Group_7__0 ) )
            {
            // InternalVideoMontage.g:2124:1: ( ( rule__AudioClip__Group_7__0 ) )
            // InternalVideoMontage.g:2125:2: ( rule__AudioClip__Group_7__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup_7()); 
            // InternalVideoMontage.g:2126:2: ( rule__AudioClip__Group_7__0 )
            // InternalVideoMontage.g:2126:3: rule__AudioClip__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__7__Impl"


    // $ANTLR start "rule__AudioClip__Group__8"
    // InternalVideoMontage.g:2134:1: rule__AudioClip__Group__8 : rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9 ;
    public final void rule__AudioClip__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2138:1: ( rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9 )
            // InternalVideoMontage.g:2139:2: rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9
            {
            pushFollow(FOLLOW_25);
            rule__AudioClip__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__8"


    // $ANTLR start "rule__AudioClip__Group__8__Impl"
    // InternalVideoMontage.g:2146:1: rule__AudioClip__Group__8__Impl : ( ( rule__AudioClip__Group_8__0 ) ) ;
    public final void rule__AudioClip__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2150:1: ( ( ( rule__AudioClip__Group_8__0 ) ) )
            // InternalVideoMontage.g:2151:1: ( ( rule__AudioClip__Group_8__0 ) )
            {
            // InternalVideoMontage.g:2151:1: ( ( rule__AudioClip__Group_8__0 ) )
            // InternalVideoMontage.g:2152:2: ( rule__AudioClip__Group_8__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup_8()); 
            // InternalVideoMontage.g:2153:2: ( rule__AudioClip__Group_8__0 )
            // InternalVideoMontage.g:2153:3: rule__AudioClip__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__8__Impl"


    // $ANTLR start "rule__AudioClip__Group__9"
    // InternalVideoMontage.g:2161:1: rule__AudioClip__Group__9 : rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10 ;
    public final void rule__AudioClip__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2165:1: ( rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10 )
            // InternalVideoMontage.g:2166:2: rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__AudioClip__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__9"


    // $ANTLR start "rule__AudioClip__Group__9__Impl"
    // InternalVideoMontage.g:2173:1: rule__AudioClip__Group__9__Impl : ( ( rule__AudioClip__Group_9__0 )? ) ;
    public final void rule__AudioClip__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2177:1: ( ( ( rule__AudioClip__Group_9__0 )? ) )
            // InternalVideoMontage.g:2178:1: ( ( rule__AudioClip__Group_9__0 )? )
            {
            // InternalVideoMontage.g:2178:1: ( ( rule__AudioClip__Group_9__0 )? )
            // InternalVideoMontage.g:2179:2: ( rule__AudioClip__Group_9__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_9()); 
            // InternalVideoMontage.g:2180:2: ( rule__AudioClip__Group_9__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVideoMontage.g:2180:3: rule__AudioClip__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioClip__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioClipAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__9__Impl"


    // $ANTLR start "rule__AudioClip__Group__10"
    // InternalVideoMontage.g:2188:1: rule__AudioClip__Group__10 : rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11 ;
    public final void rule__AudioClip__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2192:1: ( rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11 )
            // InternalVideoMontage.g:2193:2: rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__AudioClip__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__10"


    // $ANTLR start "rule__AudioClip__Group__10__Impl"
    // InternalVideoMontage.g:2200:1: rule__AudioClip__Group__10__Impl : ( ( rule__AudioClip__Group_10__0 ) ) ;
    public final void rule__AudioClip__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2204:1: ( ( ( rule__AudioClip__Group_10__0 ) ) )
            // InternalVideoMontage.g:2205:1: ( ( rule__AudioClip__Group_10__0 ) )
            {
            // InternalVideoMontage.g:2205:1: ( ( rule__AudioClip__Group_10__0 ) )
            // InternalVideoMontage.g:2206:2: ( rule__AudioClip__Group_10__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup_10()); 
            // InternalVideoMontage.g:2207:2: ( rule__AudioClip__Group_10__0 )
            // InternalVideoMontage.g:2207:3: rule__AudioClip__Group_10__0
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_10__0();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__10__Impl"


    // $ANTLR start "rule__AudioClip__Group__11"
    // InternalVideoMontage.g:2215:1: rule__AudioClip__Group__11 : rule__AudioClip__Group__11__Impl ;
    public final void rule__AudioClip__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2219:1: ( rule__AudioClip__Group__11__Impl )
            // InternalVideoMontage.g:2220:2: rule__AudioClip__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__11"


    // $ANTLR start "rule__AudioClip__Group__11__Impl"
    // InternalVideoMontage.g:2226:1: rule__AudioClip__Group__11__Impl : ( '}' ) ;
    public final void rule__AudioClip__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2230:1: ( ( '}' ) )
            // InternalVideoMontage.g:2231:1: ( '}' )
            {
            // InternalVideoMontage.g:2231:1: ( '}' )
            // InternalVideoMontage.g:2232:2: '}'
            {
             before(grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_11()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__11__Impl"


    // $ANTLR start "rule__AudioClip__Group_6__0"
    // InternalVideoMontage.g:2242:1: rule__AudioClip__Group_6__0 : rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1 ;
    public final void rule__AudioClip__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2246:1: ( rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1 )
            // InternalVideoMontage.g:2247:2: rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1
            {
            pushFollow(FOLLOW_20);
            rule__AudioClip__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_6__0"


    // $ANTLR start "rule__AudioClip__Group_6__0__Impl"
    // InternalVideoMontage.g:2254:1: rule__AudioClip__Group_6__0__Impl : ( 'volume' ) ;
    public final void rule__AudioClip__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2258:1: ( ( 'volume' ) )
            // InternalVideoMontage.g:2259:1: ( 'volume' )
            {
            // InternalVideoMontage.g:2259:1: ( 'volume' )
            // InternalVideoMontage.g:2260:2: 'volume'
            {
             before(grammarAccess.getAudioClipAccess().getVolumeKeyword_6_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getVolumeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_6__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_6__1"
    // InternalVideoMontage.g:2269:1: rule__AudioClip__Group_6__1 : rule__AudioClip__Group_6__1__Impl ;
    public final void rule__AudioClip__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2273:1: ( rule__AudioClip__Group_6__1__Impl )
            // InternalVideoMontage.g:2274:2: rule__AudioClip__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_6__1"


    // $ANTLR start "rule__AudioClip__Group_6__1__Impl"
    // InternalVideoMontage.g:2280:1: rule__AudioClip__Group_6__1__Impl : ( ( rule__AudioClip__VolumeAssignment_6_1 ) ) ;
    public final void rule__AudioClip__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2284:1: ( ( ( rule__AudioClip__VolumeAssignment_6_1 ) ) )
            // InternalVideoMontage.g:2285:1: ( ( rule__AudioClip__VolumeAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:2285:1: ( ( rule__AudioClip__VolumeAssignment_6_1 ) )
            // InternalVideoMontage.g:2286:2: ( rule__AudioClip__VolumeAssignment_6_1 )
            {
             before(grammarAccess.getAudioClipAccess().getVolumeAssignment_6_1()); 
            // InternalVideoMontage.g:2287:2: ( rule__AudioClip__VolumeAssignment_6_1 )
            // InternalVideoMontage.g:2287:3: rule__AudioClip__VolumeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__VolumeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getVolumeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_6__1__Impl"


    // $ANTLR start "rule__AudioClip__Group_7__0"
    // InternalVideoMontage.g:2296:1: rule__AudioClip__Group_7__0 : rule__AudioClip__Group_7__0__Impl rule__AudioClip__Group_7__1 ;
    public final void rule__AudioClip__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2300:1: ( rule__AudioClip__Group_7__0__Impl rule__AudioClip__Group_7__1 )
            // InternalVideoMontage.g:2301:2: rule__AudioClip__Group_7__0__Impl rule__AudioClip__Group_7__1
            {
            pushFollow(FOLLOW_20);
            rule__AudioClip__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_7__0"


    // $ANTLR start "rule__AudioClip__Group_7__0__Impl"
    // InternalVideoMontage.g:2308:1: rule__AudioClip__Group_7__0__Impl : ( 'startCut' ) ;
    public final void rule__AudioClip__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2312:1: ( ( 'startCut' ) )
            // InternalVideoMontage.g:2313:1: ( 'startCut' )
            {
            // InternalVideoMontage.g:2313:1: ( 'startCut' )
            // InternalVideoMontage.g:2314:2: 'startCut'
            {
             before(grammarAccess.getAudioClipAccess().getStartCutKeyword_7_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getStartCutKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_7__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_7__1"
    // InternalVideoMontage.g:2323:1: rule__AudioClip__Group_7__1 : rule__AudioClip__Group_7__1__Impl ;
    public final void rule__AudioClip__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2327:1: ( rule__AudioClip__Group_7__1__Impl )
            // InternalVideoMontage.g:2328:2: rule__AudioClip__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_7__1"


    // $ANTLR start "rule__AudioClip__Group_7__1__Impl"
    // InternalVideoMontage.g:2334:1: rule__AudioClip__Group_7__1__Impl : ( ( rule__AudioClip__StartCutAssignment_7_1 ) ) ;
    public final void rule__AudioClip__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2338:1: ( ( ( rule__AudioClip__StartCutAssignment_7_1 ) ) )
            // InternalVideoMontage.g:2339:1: ( ( rule__AudioClip__StartCutAssignment_7_1 ) )
            {
            // InternalVideoMontage.g:2339:1: ( ( rule__AudioClip__StartCutAssignment_7_1 ) )
            // InternalVideoMontage.g:2340:2: ( rule__AudioClip__StartCutAssignment_7_1 )
            {
             before(grammarAccess.getAudioClipAccess().getStartCutAssignment_7_1()); 
            // InternalVideoMontage.g:2341:2: ( rule__AudioClip__StartCutAssignment_7_1 )
            // InternalVideoMontage.g:2341:3: rule__AudioClip__StartCutAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__StartCutAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getStartCutAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_7__1__Impl"


    // $ANTLR start "rule__AudioClip__Group_8__0"
    // InternalVideoMontage.g:2350:1: rule__AudioClip__Group_8__0 : rule__AudioClip__Group_8__0__Impl rule__AudioClip__Group_8__1 ;
    public final void rule__AudioClip__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2354:1: ( rule__AudioClip__Group_8__0__Impl rule__AudioClip__Group_8__1 )
            // InternalVideoMontage.g:2355:2: rule__AudioClip__Group_8__0__Impl rule__AudioClip__Group_8__1
            {
            pushFollow(FOLLOW_20);
            rule__AudioClip__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_8__0"


    // $ANTLR start "rule__AudioClip__Group_8__0__Impl"
    // InternalVideoMontage.g:2362:1: rule__AudioClip__Group_8__0__Impl : ( 'endCut' ) ;
    public final void rule__AudioClip__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2366:1: ( ( 'endCut' ) )
            // InternalVideoMontage.g:2367:1: ( 'endCut' )
            {
            // InternalVideoMontage.g:2367:1: ( 'endCut' )
            // InternalVideoMontage.g:2368:2: 'endCut'
            {
             before(grammarAccess.getAudioClipAccess().getEndCutKeyword_8_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getEndCutKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_8__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_8__1"
    // InternalVideoMontage.g:2377:1: rule__AudioClip__Group_8__1 : rule__AudioClip__Group_8__1__Impl ;
    public final void rule__AudioClip__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2381:1: ( rule__AudioClip__Group_8__1__Impl )
            // InternalVideoMontage.g:2382:2: rule__AudioClip__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_8__1"


    // $ANTLR start "rule__AudioClip__Group_8__1__Impl"
    // InternalVideoMontage.g:2388:1: rule__AudioClip__Group_8__1__Impl : ( ( rule__AudioClip__EndCutAssignment_8_1 ) ) ;
    public final void rule__AudioClip__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2392:1: ( ( ( rule__AudioClip__EndCutAssignment_8_1 ) ) )
            // InternalVideoMontage.g:2393:1: ( ( rule__AudioClip__EndCutAssignment_8_1 ) )
            {
            // InternalVideoMontage.g:2393:1: ( ( rule__AudioClip__EndCutAssignment_8_1 ) )
            // InternalVideoMontage.g:2394:2: ( rule__AudioClip__EndCutAssignment_8_1 )
            {
             before(grammarAccess.getAudioClipAccess().getEndCutAssignment_8_1()); 
            // InternalVideoMontage.g:2395:2: ( rule__AudioClip__EndCutAssignment_8_1 )
            // InternalVideoMontage.g:2395:3: rule__AudioClip__EndCutAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__EndCutAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getEndCutAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_8__1__Impl"


    // $ANTLR start "rule__AudioClip__Group_9__0"
    // InternalVideoMontage.g:2404:1: rule__AudioClip__Group_9__0 : rule__AudioClip__Group_9__0__Impl rule__AudioClip__Group_9__1 ;
    public final void rule__AudioClip__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2408:1: ( rule__AudioClip__Group_9__0__Impl rule__AudioClip__Group_9__1 )
            // InternalVideoMontage.g:2409:2: rule__AudioClip__Group_9__0__Impl rule__AudioClip__Group_9__1
            {
            pushFollow(FOLLOW_22);
            rule__AudioClip__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_9__0"


    // $ANTLR start "rule__AudioClip__Group_9__0__Impl"
    // InternalVideoMontage.g:2416:1: rule__AudioClip__Group_9__0__Impl : ( 'transition' ) ;
    public final void rule__AudioClip__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2420:1: ( ( 'transition' ) )
            // InternalVideoMontage.g:2421:1: ( 'transition' )
            {
            // InternalVideoMontage.g:2421:1: ( 'transition' )
            // InternalVideoMontage.g:2422:2: 'transition'
            {
             before(grammarAccess.getAudioClipAccess().getTransitionKeyword_9_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getTransitionKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_9__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_9__1"
    // InternalVideoMontage.g:2431:1: rule__AudioClip__Group_9__1 : rule__AudioClip__Group_9__1__Impl ;
    public final void rule__AudioClip__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2435:1: ( rule__AudioClip__Group_9__1__Impl )
            // InternalVideoMontage.g:2436:2: rule__AudioClip__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_9__1"


    // $ANTLR start "rule__AudioClip__Group_9__1__Impl"
    // InternalVideoMontage.g:2442:1: rule__AudioClip__Group_9__1__Impl : ( ( rule__AudioClip__TransitionAssignment_9_1 ) ) ;
    public final void rule__AudioClip__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2446:1: ( ( ( rule__AudioClip__TransitionAssignment_9_1 ) ) )
            // InternalVideoMontage.g:2447:1: ( ( rule__AudioClip__TransitionAssignment_9_1 ) )
            {
            // InternalVideoMontage.g:2447:1: ( ( rule__AudioClip__TransitionAssignment_9_1 ) )
            // InternalVideoMontage.g:2448:2: ( rule__AudioClip__TransitionAssignment_9_1 )
            {
             before(grammarAccess.getAudioClipAccess().getTransitionAssignment_9_1()); 
            // InternalVideoMontage.g:2449:2: ( rule__AudioClip__TransitionAssignment_9_1 )
            // InternalVideoMontage.g:2449:3: rule__AudioClip__TransitionAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__TransitionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getTransitionAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_9__1__Impl"


    // $ANTLR start "rule__AudioClip__Group_10__0"
    // InternalVideoMontage.g:2458:1: rule__AudioClip__Group_10__0 : rule__AudioClip__Group_10__0__Impl rule__AudioClip__Group_10__1 ;
    public final void rule__AudioClip__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2462:1: ( rule__AudioClip__Group_10__0__Impl rule__AudioClip__Group_10__1 )
            // InternalVideoMontage.g:2463:2: rule__AudioClip__Group_10__0__Impl rule__AudioClip__Group_10__1
            {
            pushFollow(FOLLOW_26);
            rule__AudioClip__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_10__0"


    // $ANTLR start "rule__AudioClip__Group_10__0__Impl"
    // InternalVideoMontage.g:2470:1: rule__AudioClip__Group_10__0__Impl : ( 'audio' ) ;
    public final void rule__AudioClip__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2474:1: ( ( 'audio' ) )
            // InternalVideoMontage.g:2475:1: ( 'audio' )
            {
            // InternalVideoMontage.g:2475:1: ( 'audio' )
            // InternalVideoMontage.g:2476:2: 'audio'
            {
             before(grammarAccess.getAudioClipAccess().getAudioKeyword_10_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getAudioKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_10__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_10__1"
    // InternalVideoMontage.g:2485:1: rule__AudioClip__Group_10__1 : rule__AudioClip__Group_10__1__Impl rule__AudioClip__Group_10__2 ;
    public final void rule__AudioClip__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2489:1: ( rule__AudioClip__Group_10__1__Impl rule__AudioClip__Group_10__2 )
            // InternalVideoMontage.g:2490:2: rule__AudioClip__Group_10__1__Impl rule__AudioClip__Group_10__2
            {
            pushFollow(FOLLOW_26);
            rule__AudioClip__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_10__1"


    // $ANTLR start "rule__AudioClip__Group_10__1__Impl"
    // InternalVideoMontage.g:2497:1: rule__AudioClip__Group_10__1__Impl : ( ( rule__AudioClip__AudioAssignment_10_1 ) ) ;
    public final void rule__AudioClip__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2501:1: ( ( ( rule__AudioClip__AudioAssignment_10_1 ) ) )
            // InternalVideoMontage.g:2502:1: ( ( rule__AudioClip__AudioAssignment_10_1 ) )
            {
            // InternalVideoMontage.g:2502:1: ( ( rule__AudioClip__AudioAssignment_10_1 ) )
            // InternalVideoMontage.g:2503:2: ( rule__AudioClip__AudioAssignment_10_1 )
            {
             before(grammarAccess.getAudioClipAccess().getAudioAssignment_10_1()); 
            // InternalVideoMontage.g:2504:2: ( rule__AudioClip__AudioAssignment_10_1 )
            // InternalVideoMontage.g:2504:3: rule__AudioClip__AudioAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__AudioAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getAudioAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_10__1__Impl"


    // $ANTLR start "rule__AudioClip__Group_10__2"
    // InternalVideoMontage.g:2512:1: rule__AudioClip__Group_10__2 : rule__AudioClip__Group_10__2__Impl ;
    public final void rule__AudioClip__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2516:1: ( rule__AudioClip__Group_10__2__Impl )
            // InternalVideoMontage.g:2517:2: rule__AudioClip__Group_10__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_10__2"


    // $ANTLR start "rule__AudioClip__Group_10__2__Impl"
    // InternalVideoMontage.g:2523:1: rule__AudioClip__Group_10__2__Impl : ( ( rule__AudioClip__AudioAssignment_10_2 )* ) ;
    public final void rule__AudioClip__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2527:1: ( ( ( rule__AudioClip__AudioAssignment_10_2 )* ) )
            // InternalVideoMontage.g:2528:1: ( ( rule__AudioClip__AudioAssignment_10_2 )* )
            {
            // InternalVideoMontage.g:2528:1: ( ( rule__AudioClip__AudioAssignment_10_2 )* )
            // InternalVideoMontage.g:2529:2: ( rule__AudioClip__AudioAssignment_10_2 )*
            {
             before(grammarAccess.getAudioClipAccess().getAudioAssignment_10_2()); 
            // InternalVideoMontage.g:2530:2: ( rule__AudioClip__AudioAssignment_10_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalVideoMontage.g:2530:3: rule__AudioClip__AudioAssignment_10_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__AudioClip__AudioAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getAudioClipAccess().getAudioAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_10__2__Impl"


    // $ANTLR start "rule__Clip__Group__0"
    // InternalVideoMontage.g:2539:1: rule__Clip__Group__0 : rule__Clip__Group__0__Impl rule__Clip__Group__1 ;
    public final void rule__Clip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2543:1: ( rule__Clip__Group__0__Impl rule__Clip__Group__1 )
            // InternalVideoMontage.g:2544:2: rule__Clip__Group__0__Impl rule__Clip__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Clip__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__0"


    // $ANTLR start "rule__Clip__Group__0__Impl"
    // InternalVideoMontage.g:2551:1: rule__Clip__Group__0__Impl : ( 'Clip' ) ;
    public final void rule__Clip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2555:1: ( ( 'Clip' ) )
            // InternalVideoMontage.g:2556:1: ( 'Clip' )
            {
            // InternalVideoMontage.g:2556:1: ( 'Clip' )
            // InternalVideoMontage.g:2557:2: 'Clip'
            {
             before(grammarAccess.getClipAccess().getClipKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getClipKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__0__Impl"


    // $ANTLR start "rule__Clip__Group__1"
    // InternalVideoMontage.g:2566:1: rule__Clip__Group__1 : rule__Clip__Group__1__Impl rule__Clip__Group__2 ;
    public final void rule__Clip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2570:1: ( rule__Clip__Group__1__Impl rule__Clip__Group__2 )
            // InternalVideoMontage.g:2571:2: rule__Clip__Group__1__Impl rule__Clip__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Clip__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__1"


    // $ANTLR start "rule__Clip__Group__1__Impl"
    // InternalVideoMontage.g:2578:1: rule__Clip__Group__1__Impl : ( ( rule__Clip__NameAssignment_1 ) ) ;
    public final void rule__Clip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2582:1: ( ( ( rule__Clip__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:2583:1: ( ( rule__Clip__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:2583:1: ( ( rule__Clip__NameAssignment_1 ) )
            // InternalVideoMontage.g:2584:2: ( rule__Clip__NameAssignment_1 )
            {
             before(grammarAccess.getClipAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:2585:2: ( rule__Clip__NameAssignment_1 )
            // InternalVideoMontage.g:2585:3: rule__Clip__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Clip__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__1__Impl"


    // $ANTLR start "rule__Clip__Group__2"
    // InternalVideoMontage.g:2593:1: rule__Clip__Group__2 : rule__Clip__Group__2__Impl rule__Clip__Group__3 ;
    public final void rule__Clip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2597:1: ( rule__Clip__Group__2__Impl rule__Clip__Group__3 )
            // InternalVideoMontage.g:2598:2: rule__Clip__Group__2__Impl rule__Clip__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Clip__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__2"


    // $ANTLR start "rule__Clip__Group__2__Impl"
    // InternalVideoMontage.g:2605:1: rule__Clip__Group__2__Impl : ( '{' ) ;
    public final void rule__Clip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2609:1: ( ( '{' ) )
            // InternalVideoMontage.g:2610:1: ( '{' )
            {
            // InternalVideoMontage.g:2610:1: ( '{' )
            // InternalVideoMontage.g:2611:2: '{'
            {
             before(grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__2__Impl"


    // $ANTLR start "rule__Clip__Group__3"
    // InternalVideoMontage.g:2620:1: rule__Clip__Group__3 : rule__Clip__Group__3__Impl rule__Clip__Group__4 ;
    public final void rule__Clip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2624:1: ( rule__Clip__Group__3__Impl rule__Clip__Group__4 )
            // InternalVideoMontage.g:2625:2: rule__Clip__Group__3__Impl rule__Clip__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Clip__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__3"


    // $ANTLR start "rule__Clip__Group__3__Impl"
    // InternalVideoMontage.g:2632:1: rule__Clip__Group__3__Impl : ( ( rule__Clip__Group_3__0 )? ) ;
    public final void rule__Clip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2636:1: ( ( ( rule__Clip__Group_3__0 )? ) )
            // InternalVideoMontage.g:2637:1: ( ( rule__Clip__Group_3__0 )? )
            {
            // InternalVideoMontage.g:2637:1: ( ( rule__Clip__Group_3__0 )? )
            // InternalVideoMontage.g:2638:2: ( rule__Clip__Group_3__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_3()); 
            // InternalVideoMontage.g:2639:2: ( rule__Clip__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVideoMontage.g:2639:3: rule__Clip__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clip__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClipAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__3__Impl"


    // $ANTLR start "rule__Clip__Group__4"
    // InternalVideoMontage.g:2647:1: rule__Clip__Group__4 : rule__Clip__Group__4__Impl rule__Clip__Group__5 ;
    public final void rule__Clip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2651:1: ( rule__Clip__Group__4__Impl rule__Clip__Group__5 )
            // InternalVideoMontage.g:2652:2: rule__Clip__Group__4__Impl rule__Clip__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Clip__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__4"


    // $ANTLR start "rule__Clip__Group__4__Impl"
    // InternalVideoMontage.g:2659:1: rule__Clip__Group__4__Impl : ( ( rule__Clip__Group_4__0 )? ) ;
    public final void rule__Clip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2663:1: ( ( ( rule__Clip__Group_4__0 )? ) )
            // InternalVideoMontage.g:2664:1: ( ( rule__Clip__Group_4__0 )? )
            {
            // InternalVideoMontage.g:2664:1: ( ( rule__Clip__Group_4__0 )? )
            // InternalVideoMontage.g:2665:2: ( rule__Clip__Group_4__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_4()); 
            // InternalVideoMontage.g:2666:2: ( rule__Clip__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVideoMontage.g:2666:3: rule__Clip__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clip__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClipAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__4__Impl"


    // $ANTLR start "rule__Clip__Group__5"
    // InternalVideoMontage.g:2674:1: rule__Clip__Group__5 : rule__Clip__Group__5__Impl rule__Clip__Group__6 ;
    public final void rule__Clip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2678:1: ( rule__Clip__Group__5__Impl rule__Clip__Group__6 )
            // InternalVideoMontage.g:2679:2: rule__Clip__Group__5__Impl rule__Clip__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Clip__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__5"


    // $ANTLR start "rule__Clip__Group__5__Impl"
    // InternalVideoMontage.g:2686:1: rule__Clip__Group__5__Impl : ( ( rule__Clip__Group_5__0 )? ) ;
    public final void rule__Clip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2690:1: ( ( ( rule__Clip__Group_5__0 )? ) )
            // InternalVideoMontage.g:2691:1: ( ( rule__Clip__Group_5__0 )? )
            {
            // InternalVideoMontage.g:2691:1: ( ( rule__Clip__Group_5__0 )? )
            // InternalVideoMontage.g:2692:2: ( rule__Clip__Group_5__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_5()); 
            // InternalVideoMontage.g:2693:2: ( rule__Clip__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVideoMontage.g:2693:3: rule__Clip__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clip__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClipAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__5__Impl"


    // $ANTLR start "rule__Clip__Group__6"
    // InternalVideoMontage.g:2701:1: rule__Clip__Group__6 : rule__Clip__Group__6__Impl ;
    public final void rule__Clip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2705:1: ( rule__Clip__Group__6__Impl )
            // InternalVideoMontage.g:2706:2: rule__Clip__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__6"


    // $ANTLR start "rule__Clip__Group__6__Impl"
    // InternalVideoMontage.g:2712:1: rule__Clip__Group__6__Impl : ( '}' ) ;
    public final void rule__Clip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2716:1: ( ( '}' ) )
            // InternalVideoMontage.g:2717:1: ( '}' )
            {
            // InternalVideoMontage.g:2717:1: ( '}' )
            // InternalVideoMontage.g:2718:2: '}'
            {
             before(grammarAccess.getClipAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__6__Impl"


    // $ANTLR start "rule__Clip__Group_3__0"
    // InternalVideoMontage.g:2728:1: rule__Clip__Group_3__0 : rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1 ;
    public final void rule__Clip__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2732:1: ( rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1 )
            // InternalVideoMontage.g:2733:2: rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Clip__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_3__0"


    // $ANTLR start "rule__Clip__Group_3__0__Impl"
    // InternalVideoMontage.g:2740:1: rule__Clip__Group_3__0__Impl : ( 'startCut' ) ;
    public final void rule__Clip__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2744:1: ( ( 'startCut' ) )
            // InternalVideoMontage.g:2745:1: ( 'startCut' )
            {
            // InternalVideoMontage.g:2745:1: ( 'startCut' )
            // InternalVideoMontage.g:2746:2: 'startCut'
            {
             before(grammarAccess.getClipAccess().getStartCutKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getStartCutKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_3__0__Impl"


    // $ANTLR start "rule__Clip__Group_3__1"
    // InternalVideoMontage.g:2755:1: rule__Clip__Group_3__1 : rule__Clip__Group_3__1__Impl ;
    public final void rule__Clip__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2759:1: ( rule__Clip__Group_3__1__Impl )
            // InternalVideoMontage.g:2760:2: rule__Clip__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_3__1"


    // $ANTLR start "rule__Clip__Group_3__1__Impl"
    // InternalVideoMontage.g:2766:1: rule__Clip__Group_3__1__Impl : ( ( rule__Clip__StartCutAssignment_3_1 ) ) ;
    public final void rule__Clip__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2770:1: ( ( ( rule__Clip__StartCutAssignment_3_1 ) ) )
            // InternalVideoMontage.g:2771:1: ( ( rule__Clip__StartCutAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:2771:1: ( ( rule__Clip__StartCutAssignment_3_1 ) )
            // InternalVideoMontage.g:2772:2: ( rule__Clip__StartCutAssignment_3_1 )
            {
             before(grammarAccess.getClipAccess().getStartCutAssignment_3_1()); 
            // InternalVideoMontage.g:2773:2: ( rule__Clip__StartCutAssignment_3_1 )
            // InternalVideoMontage.g:2773:3: rule__Clip__StartCutAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Clip__StartCutAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getStartCutAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_3__1__Impl"


    // $ANTLR start "rule__Clip__Group_4__0"
    // InternalVideoMontage.g:2782:1: rule__Clip__Group_4__0 : rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1 ;
    public final void rule__Clip__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2786:1: ( rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1 )
            // InternalVideoMontage.g:2787:2: rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Clip__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_4__0"


    // $ANTLR start "rule__Clip__Group_4__0__Impl"
    // InternalVideoMontage.g:2794:1: rule__Clip__Group_4__0__Impl : ( 'endCut' ) ;
    public final void rule__Clip__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2798:1: ( ( 'endCut' ) )
            // InternalVideoMontage.g:2799:1: ( 'endCut' )
            {
            // InternalVideoMontage.g:2799:1: ( 'endCut' )
            // InternalVideoMontage.g:2800:2: 'endCut'
            {
             before(grammarAccess.getClipAccess().getEndCutKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getEndCutKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_4__0__Impl"


    // $ANTLR start "rule__Clip__Group_4__1"
    // InternalVideoMontage.g:2809:1: rule__Clip__Group_4__1 : rule__Clip__Group_4__1__Impl ;
    public final void rule__Clip__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2813:1: ( rule__Clip__Group_4__1__Impl )
            // InternalVideoMontage.g:2814:2: rule__Clip__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_4__1"


    // $ANTLR start "rule__Clip__Group_4__1__Impl"
    // InternalVideoMontage.g:2820:1: rule__Clip__Group_4__1__Impl : ( ( rule__Clip__EndCutAssignment_4_1 ) ) ;
    public final void rule__Clip__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2824:1: ( ( ( rule__Clip__EndCutAssignment_4_1 ) ) )
            // InternalVideoMontage.g:2825:1: ( ( rule__Clip__EndCutAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:2825:1: ( ( rule__Clip__EndCutAssignment_4_1 ) )
            // InternalVideoMontage.g:2826:2: ( rule__Clip__EndCutAssignment_4_1 )
            {
             before(grammarAccess.getClipAccess().getEndCutAssignment_4_1()); 
            // InternalVideoMontage.g:2827:2: ( rule__Clip__EndCutAssignment_4_1 )
            // InternalVideoMontage.g:2827:3: rule__Clip__EndCutAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Clip__EndCutAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getEndCutAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_4__1__Impl"


    // $ANTLR start "rule__Clip__Group_5__0"
    // InternalVideoMontage.g:2836:1: rule__Clip__Group_5__0 : rule__Clip__Group_5__0__Impl rule__Clip__Group_5__1 ;
    public final void rule__Clip__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2840:1: ( rule__Clip__Group_5__0__Impl rule__Clip__Group_5__1 )
            // InternalVideoMontage.g:2841:2: rule__Clip__Group_5__0__Impl rule__Clip__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Clip__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_5__0"


    // $ANTLR start "rule__Clip__Group_5__0__Impl"
    // InternalVideoMontage.g:2848:1: rule__Clip__Group_5__0__Impl : ( 'video' ) ;
    public final void rule__Clip__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2852:1: ( ( 'video' ) )
            // InternalVideoMontage.g:2853:1: ( 'video' )
            {
            // InternalVideoMontage.g:2853:1: ( 'video' )
            // InternalVideoMontage.g:2854:2: 'video'
            {
             before(grammarAccess.getClipAccess().getVideoKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getVideoKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_5__0__Impl"


    // $ANTLR start "rule__Clip__Group_5__1"
    // InternalVideoMontage.g:2863:1: rule__Clip__Group_5__1 : rule__Clip__Group_5__1__Impl rule__Clip__Group_5__2 ;
    public final void rule__Clip__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2867:1: ( rule__Clip__Group_5__1__Impl rule__Clip__Group_5__2 )
            // InternalVideoMontage.g:2868:2: rule__Clip__Group_5__1__Impl rule__Clip__Group_5__2
            {
            pushFollow(FOLLOW_13);
            rule__Clip__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_5__1"


    // $ANTLR start "rule__Clip__Group_5__1__Impl"
    // InternalVideoMontage.g:2875:1: rule__Clip__Group_5__1__Impl : ( ( rule__Clip__VideoAssignment_5_1 ) ) ;
    public final void rule__Clip__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2879:1: ( ( ( rule__Clip__VideoAssignment_5_1 ) ) )
            // InternalVideoMontage.g:2880:1: ( ( rule__Clip__VideoAssignment_5_1 ) )
            {
            // InternalVideoMontage.g:2880:1: ( ( rule__Clip__VideoAssignment_5_1 ) )
            // InternalVideoMontage.g:2881:2: ( rule__Clip__VideoAssignment_5_1 )
            {
             before(grammarAccess.getClipAccess().getVideoAssignment_5_1()); 
            // InternalVideoMontage.g:2882:2: ( rule__Clip__VideoAssignment_5_1 )
            // InternalVideoMontage.g:2882:3: rule__Clip__VideoAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Clip__VideoAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getVideoAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_5__1__Impl"


    // $ANTLR start "rule__Clip__Group_5__2"
    // InternalVideoMontage.g:2890:1: rule__Clip__Group_5__2 : rule__Clip__Group_5__2__Impl ;
    public final void rule__Clip__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2894:1: ( rule__Clip__Group_5__2__Impl )
            // InternalVideoMontage.g:2895:2: rule__Clip__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_5__2"


    // $ANTLR start "rule__Clip__Group_5__2__Impl"
    // InternalVideoMontage.g:2901:1: rule__Clip__Group_5__2__Impl : ( ( rule__Clip__VideoAssignment_5_2 )* ) ;
    public final void rule__Clip__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2905:1: ( ( ( rule__Clip__VideoAssignment_5_2 )* ) )
            // InternalVideoMontage.g:2906:1: ( ( rule__Clip__VideoAssignment_5_2 )* )
            {
            // InternalVideoMontage.g:2906:1: ( ( rule__Clip__VideoAssignment_5_2 )* )
            // InternalVideoMontage.g:2907:2: ( rule__Clip__VideoAssignment_5_2 )*
            {
             before(grammarAccess.getClipAccess().getVideoAssignment_5_2()); 
            // InternalVideoMontage.g:2908:2: ( rule__Clip__VideoAssignment_5_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalVideoMontage.g:2908:3: rule__Clip__VideoAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Clip__VideoAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getClipAccess().getVideoAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_5__2__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // InternalVideoMontage.g:2917:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2921:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalVideoMontage.g:2922:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Video__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__0"


    // $ANTLR start "rule__Video__Group__0__Impl"
    // InternalVideoMontage.g:2929:1: rule__Video__Group__0__Impl : ( ( rule__Video__NameAssignment_0 ) ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2933:1: ( ( ( rule__Video__NameAssignment_0 ) ) )
            // InternalVideoMontage.g:2934:1: ( ( rule__Video__NameAssignment_0 ) )
            {
            // InternalVideoMontage.g:2934:1: ( ( rule__Video__NameAssignment_0 ) )
            // InternalVideoMontage.g:2935:2: ( rule__Video__NameAssignment_0 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_0()); 
            // InternalVideoMontage.g:2936:2: ( rule__Video__NameAssignment_0 )
            // InternalVideoMontage.g:2936:3: rule__Video__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Video__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__0__Impl"


    // $ANTLR start "rule__Video__Group__1"
    // InternalVideoMontage.g:2944:1: rule__Video__Group__1 : rule__Video__Group__1__Impl ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2948:1: ( rule__Video__Group__1__Impl )
            // InternalVideoMontage.g:2949:2: rule__Video__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__1"


    // $ANTLR start "rule__Video__Group__1__Impl"
    // InternalVideoMontage.g:2955:1: rule__Video__Group__1__Impl : ( ( rule__Video__Group_1__0 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2959:1: ( ( ( rule__Video__Group_1__0 ) ) )
            // InternalVideoMontage.g:2960:1: ( ( rule__Video__Group_1__0 ) )
            {
            // InternalVideoMontage.g:2960:1: ( ( rule__Video__Group_1__0 ) )
            // InternalVideoMontage.g:2961:2: ( rule__Video__Group_1__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup_1()); 
            // InternalVideoMontage.g:2962:2: ( rule__Video__Group_1__0 )
            // InternalVideoMontage.g:2962:3: rule__Video__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__1__Impl"


    // $ANTLR start "rule__Video__Group_1__0"
    // InternalVideoMontage.g:2971:1: rule__Video__Group_1__0 : rule__Video__Group_1__0__Impl rule__Video__Group_1__1 ;
    public final void rule__Video__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2975:1: ( rule__Video__Group_1__0__Impl rule__Video__Group_1__1 )
            // InternalVideoMontage.g:2976:2: rule__Video__Group_1__0__Impl rule__Video__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Video__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_1__0"


    // $ANTLR start "rule__Video__Group_1__0__Impl"
    // InternalVideoMontage.g:2983:1: rule__Video__Group_1__0__Impl : ( 'path' ) ;
    public final void rule__Video__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2987:1: ( ( 'path' ) )
            // InternalVideoMontage.g:2988:1: ( 'path' )
            {
            // InternalVideoMontage.g:2988:1: ( 'path' )
            // InternalVideoMontage.g:2989:2: 'path'
            {
             before(grammarAccess.getVideoAccess().getPathKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getPathKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_1__0__Impl"


    // $ANTLR start "rule__Video__Group_1__1"
    // InternalVideoMontage.g:2998:1: rule__Video__Group_1__1 : rule__Video__Group_1__1__Impl ;
    public final void rule__Video__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3002:1: ( rule__Video__Group_1__1__Impl )
            // InternalVideoMontage.g:3003:2: rule__Video__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_1__1"


    // $ANTLR start "rule__Video__Group_1__1__Impl"
    // InternalVideoMontage.g:3009:1: rule__Video__Group_1__1__Impl : ( ( rule__Video__PathAssignment_1_1 ) ) ;
    public final void rule__Video__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3013:1: ( ( ( rule__Video__PathAssignment_1_1 ) ) )
            // InternalVideoMontage.g:3014:1: ( ( rule__Video__PathAssignment_1_1 ) )
            {
            // InternalVideoMontage.g:3014:1: ( ( rule__Video__PathAssignment_1_1 ) )
            // InternalVideoMontage.g:3015:2: ( rule__Video__PathAssignment_1_1 )
            {
             before(grammarAccess.getVideoAccess().getPathAssignment_1_1()); 
            // InternalVideoMontage.g:3016:2: ( rule__Video__PathAssignment_1_1 )
            // InternalVideoMontage.g:3016:3: rule__Video__PathAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__PathAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getPathAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_1__1__Impl"


    // $ANTLR start "rule__RelativeMoment__Group__0"
    // InternalVideoMontage.g:3025:1: rule__RelativeMoment__Group__0 : rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1 ;
    public final void rule__RelativeMoment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3029:1: ( rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1 )
            // InternalVideoMontage.g:3030:2: rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__RelativeMoment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__0"


    // $ANTLR start "rule__RelativeMoment__Group__0__Impl"
    // InternalVideoMontage.g:3037:1: rule__RelativeMoment__Group__0__Impl : ( () ) ;
    public final void rule__RelativeMoment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3041:1: ( ( () ) )
            // InternalVideoMontage.g:3042:1: ( () )
            {
            // InternalVideoMontage.g:3042:1: ( () )
            // InternalVideoMontage.g:3043:2: ()
            {
             before(grammarAccess.getRelativeMomentAccess().getRelativeMomentAction_0()); 
            // InternalVideoMontage.g:3044:2: ()
            // InternalVideoMontage.g:3044:3: 
            {
            }

             after(grammarAccess.getRelativeMomentAccess().getRelativeMomentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__0__Impl"


    // $ANTLR start "rule__RelativeMoment__Group__1"
    // InternalVideoMontage.g:3052:1: rule__RelativeMoment__Group__1 : rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2 ;
    public final void rule__RelativeMoment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3056:1: ( rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2 )
            // InternalVideoMontage.g:3057:2: rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__RelativeMoment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__1"


    // $ANTLR start "rule__RelativeMoment__Group__1__Impl"
    // InternalVideoMontage.g:3064:1: rule__RelativeMoment__Group__1__Impl : ( ( rule__RelativeMoment__MomentAssignment_1 )? ) ;
    public final void rule__RelativeMoment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3068:1: ( ( ( rule__RelativeMoment__MomentAssignment_1 )? ) )
            // InternalVideoMontage.g:3069:1: ( ( rule__RelativeMoment__MomentAssignment_1 )? )
            {
            // InternalVideoMontage.g:3069:1: ( ( rule__RelativeMoment__MomentAssignment_1 )? )
            // InternalVideoMontage.g:3070:2: ( rule__RelativeMoment__MomentAssignment_1 )?
            {
             before(grammarAccess.getRelativeMomentAccess().getMomentAssignment_1()); 
            // InternalVideoMontage.g:3071:2: ( rule__RelativeMoment__MomentAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=17 && LA23_0<=18)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVideoMontage.g:3071:3: rule__RelativeMoment__MomentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelativeMoment__MomentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelativeMomentAccess().getMomentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__1__Impl"


    // $ANTLR start "rule__RelativeMoment__Group__2"
    // InternalVideoMontage.g:3079:1: rule__RelativeMoment__Group__2 : rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3 ;
    public final void rule__RelativeMoment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3083:1: ( rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3 )
            // InternalVideoMontage.g:3084:2: rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__RelativeMoment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__2"


    // $ANTLR start "rule__RelativeMoment__Group__2__Impl"
    // InternalVideoMontage.g:3091:1: rule__RelativeMoment__Group__2__Impl : ( 'of' ) ;
    public final void rule__RelativeMoment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3095:1: ( ( 'of' ) )
            // InternalVideoMontage.g:3096:1: ( 'of' )
            {
            // InternalVideoMontage.g:3096:1: ( 'of' )
            // InternalVideoMontage.g:3097:2: 'of'
            {
             before(grammarAccess.getRelativeMomentAccess().getOfKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getRelativeMomentAccess().getOfKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__2__Impl"


    // $ANTLR start "rule__RelativeMoment__Group__3"
    // InternalVideoMontage.g:3106:1: rule__RelativeMoment__Group__3 : rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4 ;
    public final void rule__RelativeMoment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3110:1: ( rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4 )
            // InternalVideoMontage.g:3111:2: rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__RelativeMoment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__3"


    // $ANTLR start "rule__RelativeMoment__Group__3__Impl"
    // InternalVideoMontage.g:3118:1: rule__RelativeMoment__Group__3__Impl : ( 'element' ) ;
    public final void rule__RelativeMoment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3122:1: ( ( 'element' ) )
            // InternalVideoMontage.g:3123:1: ( 'element' )
            {
            // InternalVideoMontage.g:3123:1: ( 'element' )
            // InternalVideoMontage.g:3124:2: 'element'
            {
             before(grammarAccess.getRelativeMomentAccess().getElementKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getRelativeMomentAccess().getElementKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__3__Impl"


    // $ANTLR start "rule__RelativeMoment__Group__4"
    // InternalVideoMontage.g:3133:1: rule__RelativeMoment__Group__4 : rule__RelativeMoment__Group__4__Impl rule__RelativeMoment__Group__5 ;
    public final void rule__RelativeMoment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3137:1: ( rule__RelativeMoment__Group__4__Impl rule__RelativeMoment__Group__5 )
            // InternalVideoMontage.g:3138:2: rule__RelativeMoment__Group__4__Impl rule__RelativeMoment__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__RelativeMoment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__4"


    // $ANTLR start "rule__RelativeMoment__Group__4__Impl"
    // InternalVideoMontage.g:3145:1: rule__RelativeMoment__Group__4__Impl : ( ( rule__RelativeMoment__ElementAssignment_4 ) ) ;
    public final void rule__RelativeMoment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3149:1: ( ( ( rule__RelativeMoment__ElementAssignment_4 ) ) )
            // InternalVideoMontage.g:3150:1: ( ( rule__RelativeMoment__ElementAssignment_4 ) )
            {
            // InternalVideoMontage.g:3150:1: ( ( rule__RelativeMoment__ElementAssignment_4 ) )
            // InternalVideoMontage.g:3151:2: ( rule__RelativeMoment__ElementAssignment_4 )
            {
             before(grammarAccess.getRelativeMomentAccess().getElementAssignment_4()); 
            // InternalVideoMontage.g:3152:2: ( rule__RelativeMoment__ElementAssignment_4 )
            // InternalVideoMontage.g:3152:3: rule__RelativeMoment__ElementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__ElementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRelativeMomentAccess().getElementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__4__Impl"


    // $ANTLR start "rule__RelativeMoment__Group__5"
    // InternalVideoMontage.g:3160:1: rule__RelativeMoment__Group__5 : rule__RelativeMoment__Group__5__Impl rule__RelativeMoment__Group__6 ;
    public final void rule__RelativeMoment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3164:1: ( rule__RelativeMoment__Group__5__Impl rule__RelativeMoment__Group__6 )
            // InternalVideoMontage.g:3165:2: rule__RelativeMoment__Group__5__Impl rule__RelativeMoment__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__RelativeMoment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__5"


    // $ANTLR start "rule__RelativeMoment__Group__5__Impl"
    // InternalVideoMontage.g:3172:1: rule__RelativeMoment__Group__5__Impl : ( ( rule__RelativeMoment__OperationMomentAssignment_5 ) ) ;
    public final void rule__RelativeMoment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3176:1: ( ( ( rule__RelativeMoment__OperationMomentAssignment_5 ) ) )
            // InternalVideoMontage.g:3177:1: ( ( rule__RelativeMoment__OperationMomentAssignment_5 ) )
            {
            // InternalVideoMontage.g:3177:1: ( ( rule__RelativeMoment__OperationMomentAssignment_5 ) )
            // InternalVideoMontage.g:3178:2: ( rule__RelativeMoment__OperationMomentAssignment_5 )
            {
             before(grammarAccess.getRelativeMomentAccess().getOperationMomentAssignment_5()); 
            // InternalVideoMontage.g:3179:2: ( rule__RelativeMoment__OperationMomentAssignment_5 )
            // InternalVideoMontage.g:3179:3: rule__RelativeMoment__OperationMomentAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__OperationMomentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRelativeMomentAccess().getOperationMomentAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__5__Impl"


    // $ANTLR start "rule__RelativeMoment__Group__6"
    // InternalVideoMontage.g:3187:1: rule__RelativeMoment__Group__6 : rule__RelativeMoment__Group__6__Impl ;
    public final void rule__RelativeMoment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3191:1: ( rule__RelativeMoment__Group__6__Impl )
            // InternalVideoMontage.g:3192:2: rule__RelativeMoment__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__6"


    // $ANTLR start "rule__RelativeMoment__Group__6__Impl"
    // InternalVideoMontage.g:3198:1: rule__RelativeMoment__Group__6__Impl : ( ( rule__RelativeMoment__ValueAssignment_6 )? ) ;
    public final void rule__RelativeMoment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3202:1: ( ( ( rule__RelativeMoment__ValueAssignment_6 )? ) )
            // InternalVideoMontage.g:3203:1: ( ( rule__RelativeMoment__ValueAssignment_6 )? )
            {
            // InternalVideoMontage.g:3203:1: ( ( rule__RelativeMoment__ValueAssignment_6 )? )
            // InternalVideoMontage.g:3204:2: ( rule__RelativeMoment__ValueAssignment_6 )?
            {
             before(grammarAccess.getRelativeMomentAccess().getValueAssignment_6()); 
            // InternalVideoMontage.g:3205:2: ( rule__RelativeMoment__ValueAssignment_6 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT||LA24_0==16||LA24_0==59) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVideoMontage.g:3205:3: rule__RelativeMoment__ValueAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelativeMoment__ValueAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelativeMomentAccess().getValueAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group__6__Impl"


    // $ANTLR start "rule__AbsoluteMoment__Group__0"
    // InternalVideoMontage.g:3214:1: rule__AbsoluteMoment__Group__0 : rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1 ;
    public final void rule__AbsoluteMoment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3218:1: ( rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1 )
            // InternalVideoMontage.g:3219:2: rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__AbsoluteMoment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group__0"


    // $ANTLR start "rule__AbsoluteMoment__Group__0__Impl"
    // InternalVideoMontage.g:3226:1: rule__AbsoluteMoment__Group__0__Impl : ( () ) ;
    public final void rule__AbsoluteMoment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3230:1: ( ( () ) )
            // InternalVideoMontage.g:3231:1: ( () )
            {
            // InternalVideoMontage.g:3231:1: ( () )
            // InternalVideoMontage.g:3232:2: ()
            {
             before(grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentAction_0()); 
            // InternalVideoMontage.g:3233:2: ()
            // InternalVideoMontage.g:3233:3: 
            {
            }

             after(grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group__0__Impl"


    // $ANTLR start "rule__AbsoluteMoment__Group__1"
    // InternalVideoMontage.g:3241:1: rule__AbsoluteMoment__Group__1 : rule__AbsoluteMoment__Group__1__Impl ;
    public final void rule__AbsoluteMoment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3245:1: ( rule__AbsoluteMoment__Group__1__Impl )
            // InternalVideoMontage.g:3246:2: rule__AbsoluteMoment__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group__1"


    // $ANTLR start "rule__AbsoluteMoment__Group__1__Impl"
    // InternalVideoMontage.g:3252:1: rule__AbsoluteMoment__Group__1__Impl : ( ( rule__AbsoluteMoment__Group_1__0 )? ) ;
    public final void rule__AbsoluteMoment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3256:1: ( ( ( rule__AbsoluteMoment__Group_1__0 )? ) )
            // InternalVideoMontage.g:3257:1: ( ( rule__AbsoluteMoment__Group_1__0 )? )
            {
            // InternalVideoMontage.g:3257:1: ( ( rule__AbsoluteMoment__Group_1__0 )? )
            // InternalVideoMontage.g:3258:2: ( rule__AbsoluteMoment__Group_1__0 )?
            {
             before(grammarAccess.getAbsoluteMomentAccess().getGroup_1()); 
            // InternalVideoMontage.g:3259:2: ( rule__AbsoluteMoment__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVideoMontage.g:3259:3: rule__AbsoluteMoment__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbsoluteMoment__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbsoluteMomentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group__1__Impl"


    // $ANTLR start "rule__AbsoluteMoment__Group_1__0"
    // InternalVideoMontage.g:3268:1: rule__AbsoluteMoment__Group_1__0 : rule__AbsoluteMoment__Group_1__0__Impl rule__AbsoluteMoment__Group_1__1 ;
    public final void rule__AbsoluteMoment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3272:1: ( rule__AbsoluteMoment__Group_1__0__Impl rule__AbsoluteMoment__Group_1__1 )
            // InternalVideoMontage.g:3273:2: rule__AbsoluteMoment__Group_1__0__Impl rule__AbsoluteMoment__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__AbsoluteMoment__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group_1__0"


    // $ANTLR start "rule__AbsoluteMoment__Group_1__0__Impl"
    // InternalVideoMontage.g:3280:1: rule__AbsoluteMoment__Group_1__0__Impl : ( 'time' ) ;
    public final void rule__AbsoluteMoment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3284:1: ( ( 'time' ) )
            // InternalVideoMontage.g:3285:1: ( 'time' )
            {
            // InternalVideoMontage.g:3285:1: ( 'time' )
            // InternalVideoMontage.g:3286:2: 'time'
            {
             before(grammarAccess.getAbsoluteMomentAccess().getTimeKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAbsoluteMomentAccess().getTimeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group_1__0__Impl"


    // $ANTLR start "rule__AbsoluteMoment__Group_1__1"
    // InternalVideoMontage.g:3295:1: rule__AbsoluteMoment__Group_1__1 : rule__AbsoluteMoment__Group_1__1__Impl ;
    public final void rule__AbsoluteMoment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3299:1: ( rule__AbsoluteMoment__Group_1__1__Impl )
            // InternalVideoMontage.g:3300:2: rule__AbsoluteMoment__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group_1__1"


    // $ANTLR start "rule__AbsoluteMoment__Group_1__1__Impl"
    // InternalVideoMontage.g:3306:1: rule__AbsoluteMoment__Group_1__1__Impl : ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) ) ;
    public final void rule__AbsoluteMoment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3310:1: ( ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) ) )
            // InternalVideoMontage.g:3311:1: ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) )
            {
            // InternalVideoMontage.g:3311:1: ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) )
            // InternalVideoMontage.g:3312:2: ( rule__AbsoluteMoment__TimeAssignment_1_1 )
            {
             before(grammarAccess.getAbsoluteMomentAccess().getTimeAssignment_1_1()); 
            // InternalVideoMontage.g:3313:2: ( rule__AbsoluteMoment__TimeAssignment_1_1 )
            // InternalVideoMontage.g:3313:3: rule__AbsoluteMoment__TimeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__TimeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteMomentAccess().getTimeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group_1__1__Impl"


    // $ANTLR start "rule__StartingMoment_Impl__Group__0"
    // InternalVideoMontage.g:3322:1: rule__StartingMoment_Impl__Group__0 : rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1 ;
    public final void rule__StartingMoment_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3326:1: ( rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1 )
            // InternalVideoMontage.g:3327:2: rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__StartingMoment_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StartingMoment_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingMoment_Impl__Group__0"


    // $ANTLR start "rule__StartingMoment_Impl__Group__0__Impl"
    // InternalVideoMontage.g:3334:1: rule__StartingMoment_Impl__Group__0__Impl : ( () ) ;
    public final void rule__StartingMoment_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3338:1: ( ( () ) )
            // InternalVideoMontage.g:3339:1: ( () )
            {
            // InternalVideoMontage.g:3339:1: ( () )
            // InternalVideoMontage.g:3340:2: ()
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getStartingMomentAction_0()); 
            // InternalVideoMontage.g:3341:2: ()
            // InternalVideoMontage.g:3341:3: 
            {
            }

             after(grammarAccess.getStartingMoment_ImplAccess().getStartingMomentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingMoment_Impl__Group__0__Impl"


    // $ANTLR start "rule__StartingMoment_Impl__Group__1"
    // InternalVideoMontage.g:3349:1: rule__StartingMoment_Impl__Group__1 : rule__StartingMoment_Impl__Group__1__Impl ;
    public final void rule__StartingMoment_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3353:1: ( rule__StartingMoment_Impl__Group__1__Impl )
            // InternalVideoMontage.g:3354:2: rule__StartingMoment_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StartingMoment_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingMoment_Impl__Group__1"


    // $ANTLR start "rule__StartingMoment_Impl__Group__1__Impl"
    // InternalVideoMontage.g:3360:1: rule__StartingMoment_Impl__Group__1__Impl : ( 'StartingMoment' ) ;
    public final void rule__StartingMoment_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3364:1: ( ( 'StartingMoment' ) )
            // InternalVideoMontage.g:3365:1: ( 'StartingMoment' )
            {
            // InternalVideoMontage.g:3365:1: ( 'StartingMoment' )
            // InternalVideoMontage.g:3366:2: 'StartingMoment'
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getStartingMomentKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStartingMoment_ImplAccess().getStartingMomentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StartingMoment_Impl__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalVideoMontage.g:3376:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3380:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalVideoMontage.g:3381:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalVideoMontage.g:3388:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3392:1: ( ( 'Transition' ) )
            // InternalVideoMontage.g:3393:1: ( 'Transition' )
            {
            // InternalVideoMontage.g:3393:1: ( 'Transition' )
            // InternalVideoMontage.g:3394:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalVideoMontage.g:3403:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3407:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalVideoMontage.g:3408:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalVideoMontage.g:3415:1: rule__Transition__Group__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3419:1: ( ( '{' ) )
            // InternalVideoMontage.g:3420:1: ( '{' )
            {
            // InternalVideoMontage.g:3420:1: ( '{' )
            // InternalVideoMontage.g:3421:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalVideoMontage.g:3430:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3434:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalVideoMontage.g:3435:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalVideoMontage.g:3442:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3446:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalVideoMontage.g:3447:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalVideoMontage.g:3447:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalVideoMontage.g:3448:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalVideoMontage.g:3449:2: ( rule__Transition__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVideoMontage.g:3449:3: rule__Transition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Transition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalVideoMontage.g:3457:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3461:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalVideoMontage.g:3462:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalVideoMontage.g:3469:1: rule__Transition__Group__3__Impl : ( 'audioElement' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3473:1: ( ( 'audioElement' ) )
            // InternalVideoMontage.g:3474:1: ( 'audioElement' )
            {
            // InternalVideoMontage.g:3474:1: ( 'audioElement' )
            // InternalVideoMontage.g:3475:2: 'audioElement'
            {
             before(grammarAccess.getTransitionAccess().getAudioElementKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getAudioElementKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalVideoMontage.g:3484:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3488:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalVideoMontage.g:3489:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalVideoMontage.g:3496:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__AudioelementAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3500:1: ( ( ( rule__Transition__AudioelementAssignment_4 ) ) )
            // InternalVideoMontage.g:3501:1: ( ( rule__Transition__AudioelementAssignment_4 ) )
            {
            // InternalVideoMontage.g:3501:1: ( ( rule__Transition__AudioelementAssignment_4 ) )
            // InternalVideoMontage.g:3502:2: ( rule__Transition__AudioelementAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getAudioelementAssignment_4()); 
            // InternalVideoMontage.g:3503:2: ( rule__Transition__AudioelementAssignment_4 )
            // InternalVideoMontage.g:3503:3: rule__Transition__AudioelementAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transition__AudioelementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getAudioelementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalVideoMontage.g:3511:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3515:1: ( rule__Transition__Group__5__Impl )
            // InternalVideoMontage.g:3516:2: rule__Transition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalVideoMontage.g:3522:1: rule__Transition__Group__5__Impl : ( '}' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3526:1: ( ( '}' ) )
            // InternalVideoMontage.g:3527:1: ( '}' )
            {
            // InternalVideoMontage.g:3527:1: ( '}' )
            // InternalVideoMontage.g:3528:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group_2__0"
    // InternalVideoMontage.g:3538:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3542:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalVideoMontage.g:3543:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Transition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0"


    // $ANTLR start "rule__Transition__Group_2__0__Impl"
    // InternalVideoMontage.g:3550:1: rule__Transition__Group_2__0__Impl : ( 'duration' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3554:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:3555:1: ( 'duration' )
            {
            // InternalVideoMontage.g:3555:1: ( 'duration' )
            // InternalVideoMontage.g:3556:2: 'duration'
            {
             before(grammarAccess.getTransitionAccess().getDurationKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getDurationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_2__1"
    // InternalVideoMontage.g:3565:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3569:1: ( rule__Transition__Group_2__1__Impl )
            // InternalVideoMontage.g:3570:2: rule__Transition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1"


    // $ANTLR start "rule__Transition__Group_2__1__Impl"
    // InternalVideoMontage.g:3576:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__DurationAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3580:1: ( ( ( rule__Transition__DurationAssignment_2_1 ) ) )
            // InternalVideoMontage.g:3581:1: ( ( rule__Transition__DurationAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:3581:1: ( ( rule__Transition__DurationAssignment_2_1 ) )
            // InternalVideoMontage.g:3582:2: ( rule__Transition__DurationAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getDurationAssignment_2_1()); 
            // InternalVideoMontage.g:3583:2: ( rule__Transition__DurationAssignment_2_1 )
            // InternalVideoMontage.g:3583:3: rule__Transition__DurationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__DurationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getDurationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_2__1__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalVideoMontage.g:3592:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3596:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalVideoMontage.g:3597:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Title__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0"


    // $ANTLR start "rule__Title__Group__0__Impl"
    // InternalVideoMontage.g:3604:1: rule__Title__Group__0__Impl : ( 'Title' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3608:1: ( ( 'Title' ) )
            // InternalVideoMontage.g:3609:1: ( 'Title' )
            {
            // InternalVideoMontage.g:3609:1: ( 'Title' )
            // InternalVideoMontage.g:3610:2: 'Title'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTitleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__0__Impl"


    // $ANTLR start "rule__Title__Group__1"
    // InternalVideoMontage.g:3619:1: rule__Title__Group__1 : rule__Title__Group__1__Impl rule__Title__Group__2 ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3623:1: ( rule__Title__Group__1__Impl rule__Title__Group__2 )
            // InternalVideoMontage.g:3624:2: rule__Title__Group__1__Impl rule__Title__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__Title__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1"


    // $ANTLR start "rule__Title__Group__1__Impl"
    // InternalVideoMontage.g:3631:1: rule__Title__Group__1__Impl : ( '{' ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3635:1: ( ( '{' ) )
            // InternalVideoMontage.g:3636:1: ( '{' )
            {
            // InternalVideoMontage.g:3636:1: ( '{' )
            // InternalVideoMontage.g:3637:2: '{'
            {
             before(grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__1__Impl"


    // $ANTLR start "rule__Title__Group__2"
    // InternalVideoMontage.g:3646:1: rule__Title__Group__2 : rule__Title__Group__2__Impl rule__Title__Group__3 ;
    public final void rule__Title__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3650:1: ( rule__Title__Group__2__Impl rule__Title__Group__3 )
            // InternalVideoMontage.g:3651:2: rule__Title__Group__2__Impl rule__Title__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__Title__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__2"


    // $ANTLR start "rule__Title__Group__2__Impl"
    // InternalVideoMontage.g:3658:1: rule__Title__Group__2__Impl : ( ( rule__Title__Group_2__0 )? ) ;
    public final void rule__Title__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3662:1: ( ( ( rule__Title__Group_2__0 )? ) )
            // InternalVideoMontage.g:3663:1: ( ( rule__Title__Group_2__0 )? )
            {
            // InternalVideoMontage.g:3663:1: ( ( rule__Title__Group_2__0 )? )
            // InternalVideoMontage.g:3664:2: ( rule__Title__Group_2__0 )?
            {
             before(grammarAccess.getTitleAccess().getGroup_2()); 
            // InternalVideoMontage.g:3665:2: ( rule__Title__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVideoMontage.g:3665:3: rule__Title__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Title__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTitleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__2__Impl"


    // $ANTLR start "rule__Title__Group__3"
    // InternalVideoMontage.g:3673:1: rule__Title__Group__3 : rule__Title__Group__3__Impl rule__Title__Group__4 ;
    public final void rule__Title__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3677:1: ( rule__Title__Group__3__Impl rule__Title__Group__4 )
            // InternalVideoMontage.g:3678:2: rule__Title__Group__3__Impl rule__Title__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Title__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__3"


    // $ANTLR start "rule__Title__Group__3__Impl"
    // InternalVideoMontage.g:3685:1: rule__Title__Group__3__Impl : ( ( rule__Title__Group_3__0 )? ) ;
    public final void rule__Title__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3689:1: ( ( ( rule__Title__Group_3__0 )? ) )
            // InternalVideoMontage.g:3690:1: ( ( rule__Title__Group_3__0 )? )
            {
            // InternalVideoMontage.g:3690:1: ( ( rule__Title__Group_3__0 )? )
            // InternalVideoMontage.g:3691:2: ( rule__Title__Group_3__0 )?
            {
             before(grammarAccess.getTitleAccess().getGroup_3()); 
            // InternalVideoMontage.g:3692:2: ( rule__Title__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVideoMontage.g:3692:3: rule__Title__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Title__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTitleAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__3__Impl"


    // $ANTLR start "rule__Title__Group__4"
    // InternalVideoMontage.g:3700:1: rule__Title__Group__4 : rule__Title__Group__4__Impl rule__Title__Group__5 ;
    public final void rule__Title__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3704:1: ( rule__Title__Group__4__Impl rule__Title__Group__5 )
            // InternalVideoMontage.g:3705:2: rule__Title__Group__4__Impl rule__Title__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Title__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__4"


    // $ANTLR start "rule__Title__Group__4__Impl"
    // InternalVideoMontage.g:3712:1: rule__Title__Group__4__Impl : ( 'textArea' ) ;
    public final void rule__Title__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3716:1: ( ( 'textArea' ) )
            // InternalVideoMontage.g:3717:1: ( 'textArea' )
            {
            // InternalVideoMontage.g:3717:1: ( 'textArea' )
            // InternalVideoMontage.g:3718:2: 'textArea'
            {
             before(grammarAccess.getTitleAccess().getTextAreaKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTextAreaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__4__Impl"


    // $ANTLR start "rule__Title__Group__5"
    // InternalVideoMontage.g:3727:1: rule__Title__Group__5 : rule__Title__Group__5__Impl rule__Title__Group__6 ;
    public final void rule__Title__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3731:1: ( rule__Title__Group__5__Impl rule__Title__Group__6 )
            // InternalVideoMontage.g:3732:2: rule__Title__Group__5__Impl rule__Title__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Title__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__5"


    // $ANTLR start "rule__Title__Group__5__Impl"
    // InternalVideoMontage.g:3739:1: rule__Title__Group__5__Impl : ( ( rule__Title__TextareaAssignment_5 ) ) ;
    public final void rule__Title__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3743:1: ( ( ( rule__Title__TextareaAssignment_5 ) ) )
            // InternalVideoMontage.g:3744:1: ( ( rule__Title__TextareaAssignment_5 ) )
            {
            // InternalVideoMontage.g:3744:1: ( ( rule__Title__TextareaAssignment_5 ) )
            // InternalVideoMontage.g:3745:2: ( rule__Title__TextareaAssignment_5 )
            {
             before(grammarAccess.getTitleAccess().getTextareaAssignment_5()); 
            // InternalVideoMontage.g:3746:2: ( rule__Title__TextareaAssignment_5 )
            // InternalVideoMontage.g:3746:3: rule__Title__TextareaAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Title__TextareaAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getTextareaAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__5__Impl"


    // $ANTLR start "rule__Title__Group__6"
    // InternalVideoMontage.g:3754:1: rule__Title__Group__6 : rule__Title__Group__6__Impl ;
    public final void rule__Title__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3758:1: ( rule__Title__Group__6__Impl )
            // InternalVideoMontage.g:3759:2: rule__Title__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__6"


    // $ANTLR start "rule__Title__Group__6__Impl"
    // InternalVideoMontage.g:3765:1: rule__Title__Group__6__Impl : ( '}' ) ;
    public final void rule__Title__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3769:1: ( ( '}' ) )
            // InternalVideoMontage.g:3770:1: ( '}' )
            {
            // InternalVideoMontage.g:3770:1: ( '}' )
            // InternalVideoMontage.g:3771:2: '}'
            {
             before(grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__6__Impl"


    // $ANTLR start "rule__Title__Group_2__0"
    // InternalVideoMontage.g:3781:1: rule__Title__Group_2__0 : rule__Title__Group_2__0__Impl rule__Title__Group_2__1 ;
    public final void rule__Title__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3785:1: ( rule__Title__Group_2__0__Impl rule__Title__Group_2__1 )
            // InternalVideoMontage.g:3786:2: rule__Title__Group_2__0__Impl rule__Title__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Title__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_2__0"


    // $ANTLR start "rule__Title__Group_2__0__Impl"
    // InternalVideoMontage.g:3793:1: rule__Title__Group_2__0__Impl : ( 'duration' ) ;
    public final void rule__Title__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3797:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:3798:1: ( 'duration' )
            {
            // InternalVideoMontage.g:3798:1: ( 'duration' )
            // InternalVideoMontage.g:3799:2: 'duration'
            {
             before(grammarAccess.getTitleAccess().getDurationKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getDurationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_2__0__Impl"


    // $ANTLR start "rule__Title__Group_2__1"
    // InternalVideoMontage.g:3808:1: rule__Title__Group_2__1 : rule__Title__Group_2__1__Impl ;
    public final void rule__Title__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3812:1: ( rule__Title__Group_2__1__Impl )
            // InternalVideoMontage.g:3813:2: rule__Title__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_2__1"


    // $ANTLR start "rule__Title__Group_2__1__Impl"
    // InternalVideoMontage.g:3819:1: rule__Title__Group_2__1__Impl : ( ( rule__Title__DurationAssignment_2_1 ) ) ;
    public final void rule__Title__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3823:1: ( ( ( rule__Title__DurationAssignment_2_1 ) ) )
            // InternalVideoMontage.g:3824:1: ( ( rule__Title__DurationAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:3824:1: ( ( rule__Title__DurationAssignment_2_1 ) )
            // InternalVideoMontage.g:3825:2: ( rule__Title__DurationAssignment_2_1 )
            {
             before(grammarAccess.getTitleAccess().getDurationAssignment_2_1()); 
            // InternalVideoMontage.g:3826:2: ( rule__Title__DurationAssignment_2_1 )
            // InternalVideoMontage.g:3826:3: rule__Title__DurationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__DurationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getDurationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_2__1__Impl"


    // $ANTLR start "rule__Title__Group_3__0"
    // InternalVideoMontage.g:3835:1: rule__Title__Group_3__0 : rule__Title__Group_3__0__Impl rule__Title__Group_3__1 ;
    public final void rule__Title__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3839:1: ( rule__Title__Group_3__0__Impl rule__Title__Group_3__1 )
            // InternalVideoMontage.g:3840:2: rule__Title__Group_3__0__Impl rule__Title__Group_3__1
            {
            pushFollow(FOLLOW_38);
            rule__Title__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_3__0"


    // $ANTLR start "rule__Title__Group_3__0__Impl"
    // InternalVideoMontage.g:3847:1: rule__Title__Group_3__0__Impl : ( 'backgroundColor' ) ;
    public final void rule__Title__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3851:1: ( ( 'backgroundColor' ) )
            // InternalVideoMontage.g:3852:1: ( 'backgroundColor' )
            {
            // InternalVideoMontage.g:3852:1: ( 'backgroundColor' )
            // InternalVideoMontage.g:3853:2: 'backgroundColor'
            {
             before(grammarAccess.getTitleAccess().getBackgroundColorKeyword_3_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getBackgroundColorKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_3__0__Impl"


    // $ANTLR start "rule__Title__Group_3__1"
    // InternalVideoMontage.g:3862:1: rule__Title__Group_3__1 : rule__Title__Group_3__1__Impl ;
    public final void rule__Title__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3866:1: ( rule__Title__Group_3__1__Impl )
            // InternalVideoMontage.g:3867:2: rule__Title__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_3__1"


    // $ANTLR start "rule__Title__Group_3__1__Impl"
    // InternalVideoMontage.g:3873:1: rule__Title__Group_3__1__Impl : ( ( rule__Title__BackgroundColorAssignment_3_1 ) ) ;
    public final void rule__Title__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3877:1: ( ( ( rule__Title__BackgroundColorAssignment_3_1 ) ) )
            // InternalVideoMontage.g:3878:1: ( ( rule__Title__BackgroundColorAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:3878:1: ( ( rule__Title__BackgroundColorAssignment_3_1 ) )
            // InternalVideoMontage.g:3879:2: ( rule__Title__BackgroundColorAssignment_3_1 )
            {
             before(grammarAccess.getTitleAccess().getBackgroundColorAssignment_3_1()); 
            // InternalVideoMontage.g:3880:2: ( rule__Title__BackgroundColorAssignment_3_1 )
            // InternalVideoMontage.g:3880:3: rule__Title__BackgroundColorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__BackgroundColorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getBackgroundColorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_3__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__0"
    // InternalVideoMontage.g:3889:1: rule__TextArea_Impl__Group__0 : rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1 ;
    public final void rule__TextArea_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3893:1: ( rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1 )
            // InternalVideoMontage.g:3894:2: rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TextArea_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__0"


    // $ANTLR start "rule__TextArea_Impl__Group__0__Impl"
    // InternalVideoMontage.g:3901:1: rule__TextArea_Impl__Group__0__Impl : ( 'TextArea' ) ;
    public final void rule__TextArea_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3905:1: ( ( 'TextArea' ) )
            // InternalVideoMontage.g:3906:1: ( 'TextArea' )
            {
            // InternalVideoMontage.g:3906:1: ( 'TextArea' )
            // InternalVideoMontage.g:3907:2: 'TextArea'
            {
             before(grammarAccess.getTextArea_ImplAccess().getTextAreaKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getTextAreaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__0__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__1"
    // InternalVideoMontage.g:3916:1: rule__TextArea_Impl__Group__1 : rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2 ;
    public final void rule__TextArea_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3920:1: ( rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2 )
            // InternalVideoMontage.g:3921:2: rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__TextArea_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__1"


    // $ANTLR start "rule__TextArea_Impl__Group__1__Impl"
    // InternalVideoMontage.g:3928:1: rule__TextArea_Impl__Group__1__Impl : ( '{' ) ;
    public final void rule__TextArea_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3932:1: ( ( '{' ) )
            // InternalVideoMontage.g:3933:1: ( '{' )
            {
            // InternalVideoMontage.g:3933:1: ( '{' )
            // InternalVideoMontage.g:3934:2: '{'
            {
             before(grammarAccess.getTextArea_ImplAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__2"
    // InternalVideoMontage.g:3943:1: rule__TextArea_Impl__Group__2 : rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3 ;
    public final void rule__TextArea_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3947:1: ( rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3 )
            // InternalVideoMontage.g:3948:2: rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__TextArea_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__2"


    // $ANTLR start "rule__TextArea_Impl__Group__2__Impl"
    // InternalVideoMontage.g:3955:1: rule__TextArea_Impl__Group__2__Impl : ( ( rule__TextArea_Impl__Group_2__0 )? ) ;
    public final void rule__TextArea_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3959:1: ( ( ( rule__TextArea_Impl__Group_2__0 )? ) )
            // InternalVideoMontage.g:3960:1: ( ( rule__TextArea_Impl__Group_2__0 )? )
            {
            // InternalVideoMontage.g:3960:1: ( ( rule__TextArea_Impl__Group_2__0 )? )
            // InternalVideoMontage.g:3961:2: ( rule__TextArea_Impl__Group_2__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_2()); 
            // InternalVideoMontage.g:3962:2: ( rule__TextArea_Impl__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==47) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVideoMontage.g:3962:3: rule__TextArea_Impl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextArea_Impl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextArea_ImplAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__2__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__3"
    // InternalVideoMontage.g:3970:1: rule__TextArea_Impl__Group__3 : rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4 ;
    public final void rule__TextArea_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3974:1: ( rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4 )
            // InternalVideoMontage.g:3975:2: rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4
            {
            pushFollow(FOLLOW_39);
            rule__TextArea_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__3"


    // $ANTLR start "rule__TextArea_Impl__Group__3__Impl"
    // InternalVideoMontage.g:3982:1: rule__TextArea_Impl__Group__3__Impl : ( ( rule__TextArea_Impl__Group_3__0 )? ) ;
    public final void rule__TextArea_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3986:1: ( ( ( rule__TextArea_Impl__Group_3__0 )? ) )
            // InternalVideoMontage.g:3987:1: ( ( rule__TextArea_Impl__Group_3__0 )? )
            {
            // InternalVideoMontage.g:3987:1: ( ( rule__TextArea_Impl__Group_3__0 )? )
            // InternalVideoMontage.g:3988:2: ( rule__TextArea_Impl__Group_3__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_3()); 
            // InternalVideoMontage.g:3989:2: ( rule__TextArea_Impl__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==48) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVideoMontage.g:3989:3: rule__TextArea_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextArea_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextArea_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__3__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__4"
    // InternalVideoMontage.g:3997:1: rule__TextArea_Impl__Group__4 : rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5 ;
    public final void rule__TextArea_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4001:1: ( rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5 )
            // InternalVideoMontage.g:4002:2: rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__TextArea_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__4"


    // $ANTLR start "rule__TextArea_Impl__Group__4__Impl"
    // InternalVideoMontage.g:4009:1: rule__TextArea_Impl__Group__4__Impl : ( ( rule__TextArea_Impl__Group_4__0 )? ) ;
    public final void rule__TextArea_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4013:1: ( ( ( rule__TextArea_Impl__Group_4__0 )? ) )
            // InternalVideoMontage.g:4014:1: ( ( rule__TextArea_Impl__Group_4__0 )? )
            {
            // InternalVideoMontage.g:4014:1: ( ( rule__TextArea_Impl__Group_4__0 )? )
            // InternalVideoMontage.g:4015:2: ( rule__TextArea_Impl__Group_4__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_4()); 
            // InternalVideoMontage.g:4016:2: ( rule__TextArea_Impl__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==49) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVideoMontage.g:4016:3: rule__TextArea_Impl__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextArea_Impl__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextArea_ImplAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__4__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__5"
    // InternalVideoMontage.g:4024:1: rule__TextArea_Impl__Group__5 : rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6 ;
    public final void rule__TextArea_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4028:1: ( rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6 )
            // InternalVideoMontage.g:4029:2: rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__TextArea_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__5"


    // $ANTLR start "rule__TextArea_Impl__Group__5__Impl"
    // InternalVideoMontage.g:4036:1: rule__TextArea_Impl__Group__5__Impl : ( ( rule__TextArea_Impl__Group_5__0 )? ) ;
    public final void rule__TextArea_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4040:1: ( ( ( rule__TextArea_Impl__Group_5__0 )? ) )
            // InternalVideoMontage.g:4041:1: ( ( rule__TextArea_Impl__Group_5__0 )? )
            {
            // InternalVideoMontage.g:4041:1: ( ( rule__TextArea_Impl__Group_5__0 )? )
            // InternalVideoMontage.g:4042:2: ( rule__TextArea_Impl__Group_5__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_5()); 
            // InternalVideoMontage.g:4043:2: ( rule__TextArea_Impl__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVideoMontage.g:4043:3: rule__TextArea_Impl__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextArea_Impl__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextArea_ImplAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__5__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__6"
    // InternalVideoMontage.g:4051:1: rule__TextArea_Impl__Group__6 : rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7 ;
    public final void rule__TextArea_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4055:1: ( rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7 )
            // InternalVideoMontage.g:4056:2: rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7
            {
            pushFollow(FOLLOW_40);
            rule__TextArea_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__6"


    // $ANTLR start "rule__TextArea_Impl__Group__6__Impl"
    // InternalVideoMontage.g:4063:1: rule__TextArea_Impl__Group__6__Impl : ( ( rule__TextArea_Impl__Group_6__0 ) ) ;
    public final void rule__TextArea_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4067:1: ( ( ( rule__TextArea_Impl__Group_6__0 ) ) )
            // InternalVideoMontage.g:4068:1: ( ( rule__TextArea_Impl__Group_6__0 ) )
            {
            // InternalVideoMontage.g:4068:1: ( ( rule__TextArea_Impl__Group_6__0 ) )
            // InternalVideoMontage.g:4069:2: ( rule__TextArea_Impl__Group_6__0 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_6()); 
            // InternalVideoMontage.g:4070:2: ( rule__TextArea_Impl__Group_6__0 )
            // InternalVideoMontage.g:4070:3: rule__TextArea_Impl__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_6__0();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__6__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__7"
    // InternalVideoMontage.g:4078:1: rule__TextArea_Impl__Group__7 : rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8 ;
    public final void rule__TextArea_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4082:1: ( rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8 )
            // InternalVideoMontage.g:4083:2: rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8
            {
            pushFollow(FOLLOW_40);
            rule__TextArea_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__7"


    // $ANTLR start "rule__TextArea_Impl__Group__7__Impl"
    // InternalVideoMontage.g:4090:1: rule__TextArea_Impl__Group__7__Impl : ( ( rule__TextArea_Impl__Group_7__0 )? ) ;
    public final void rule__TextArea_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4094:1: ( ( ( rule__TextArea_Impl__Group_7__0 )? ) )
            // InternalVideoMontage.g:4095:1: ( ( rule__TextArea_Impl__Group_7__0 )? )
            {
            // InternalVideoMontage.g:4095:1: ( ( rule__TextArea_Impl__Group_7__0 )? )
            // InternalVideoMontage.g:4096:2: ( rule__TextArea_Impl__Group_7__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_7()); 
            // InternalVideoMontage.g:4097:2: ( rule__TextArea_Impl__Group_7__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVideoMontage.g:4097:3: rule__TextArea_Impl__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextArea_Impl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextArea_ImplAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__7__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__8"
    // InternalVideoMontage.g:4105:1: rule__TextArea_Impl__Group__8 : rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9 ;
    public final void rule__TextArea_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4109:1: ( rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9 )
            // InternalVideoMontage.g:4110:2: rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9
            {
            pushFollow(FOLLOW_40);
            rule__TextArea_Impl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__8"


    // $ANTLR start "rule__TextArea_Impl__Group__8__Impl"
    // InternalVideoMontage.g:4117:1: rule__TextArea_Impl__Group__8__Impl : ( ( rule__TextArea_Impl__Group_8__0 )? ) ;
    public final void rule__TextArea_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4121:1: ( ( ( rule__TextArea_Impl__Group_8__0 )? ) )
            // InternalVideoMontage.g:4122:1: ( ( rule__TextArea_Impl__Group_8__0 )? )
            {
            // InternalVideoMontage.g:4122:1: ( ( rule__TextArea_Impl__Group_8__0 )? )
            // InternalVideoMontage.g:4123:2: ( rule__TextArea_Impl__Group_8__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_8()); 
            // InternalVideoMontage.g:4124:2: ( rule__TextArea_Impl__Group_8__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVideoMontage.g:4124:3: rule__TextArea_Impl__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextArea_Impl__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextArea_ImplAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__8__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__9"
    // InternalVideoMontage.g:4132:1: rule__TextArea_Impl__Group__9 : rule__TextArea_Impl__Group__9__Impl ;
    public final void rule__TextArea_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4136:1: ( rule__TextArea_Impl__Group__9__Impl )
            // InternalVideoMontage.g:4137:2: rule__TextArea_Impl__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__9"


    // $ANTLR start "rule__TextArea_Impl__Group__9__Impl"
    // InternalVideoMontage.g:4143:1: rule__TextArea_Impl__Group__9__Impl : ( '}' ) ;
    public final void rule__TextArea_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4147:1: ( ( '}' ) )
            // InternalVideoMontage.g:4148:1: ( '}' )
            {
            // InternalVideoMontage.g:4148:1: ( '}' )
            // InternalVideoMontage.g:4149:2: '}'
            {
             before(grammarAccess.getTextArea_ImplAccess().getRightCurlyBracketKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__9__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_2__0"
    // InternalVideoMontage.g:4159:1: rule__TextArea_Impl__Group_2__0 : rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1 ;
    public final void rule__TextArea_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4163:1: ( rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1 )
            // InternalVideoMontage.g:4164:2: rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1
            {
            pushFollow(FOLLOW_41);
            rule__TextArea_Impl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_2__0"


    // $ANTLR start "rule__TextArea_Impl__Group_2__0__Impl"
    // InternalVideoMontage.g:4171:1: rule__TextArea_Impl__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__TextArea_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4175:1: ( ( 'x' ) )
            // InternalVideoMontage.g:4176:1: ( 'x' )
            {
            // InternalVideoMontage.g:4176:1: ( 'x' )
            // InternalVideoMontage.g:4177:2: 'x'
            {
             before(grammarAccess.getTextArea_ImplAccess().getXKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getXKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_2__0__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_2__1"
    // InternalVideoMontage.g:4186:1: rule__TextArea_Impl__Group_2__1 : rule__TextArea_Impl__Group_2__1__Impl ;
    public final void rule__TextArea_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4190:1: ( rule__TextArea_Impl__Group_2__1__Impl )
            // InternalVideoMontage.g:4191:2: rule__TextArea_Impl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_2__1"


    // $ANTLR start "rule__TextArea_Impl__Group_2__1__Impl"
    // InternalVideoMontage.g:4197:1: rule__TextArea_Impl__Group_2__1__Impl : ( ( rule__TextArea_Impl__XAssignment_2_1 ) ) ;
    public final void rule__TextArea_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4201:1: ( ( ( rule__TextArea_Impl__XAssignment_2_1 ) ) )
            // InternalVideoMontage.g:4202:1: ( ( rule__TextArea_Impl__XAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:4202:1: ( ( rule__TextArea_Impl__XAssignment_2_1 ) )
            // InternalVideoMontage.g:4203:2: ( rule__TextArea_Impl__XAssignment_2_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getXAssignment_2_1()); 
            // InternalVideoMontage.g:4204:2: ( rule__TextArea_Impl__XAssignment_2_1 )
            // InternalVideoMontage.g:4204:3: rule__TextArea_Impl__XAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__XAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getXAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_2__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_3__0"
    // InternalVideoMontage.g:4213:1: rule__TextArea_Impl__Group_3__0 : rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1 ;
    public final void rule__TextArea_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4217:1: ( rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1 )
            // InternalVideoMontage.g:4218:2: rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__TextArea_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_3__0"


    // $ANTLR start "rule__TextArea_Impl__Group_3__0__Impl"
    // InternalVideoMontage.g:4225:1: rule__TextArea_Impl__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__TextArea_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4229:1: ( ( 'y' ) )
            // InternalVideoMontage.g:4230:1: ( 'y' )
            {
            // InternalVideoMontage.g:4230:1: ( 'y' )
            // InternalVideoMontage.g:4231:2: 'y'
            {
             before(grammarAccess.getTextArea_ImplAccess().getYKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getYKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_3__1"
    // InternalVideoMontage.g:4240:1: rule__TextArea_Impl__Group_3__1 : rule__TextArea_Impl__Group_3__1__Impl ;
    public final void rule__TextArea_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4244:1: ( rule__TextArea_Impl__Group_3__1__Impl )
            // InternalVideoMontage.g:4245:2: rule__TextArea_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_3__1"


    // $ANTLR start "rule__TextArea_Impl__Group_3__1__Impl"
    // InternalVideoMontage.g:4251:1: rule__TextArea_Impl__Group_3__1__Impl : ( ( rule__TextArea_Impl__YAssignment_3_1 ) ) ;
    public final void rule__TextArea_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4255:1: ( ( ( rule__TextArea_Impl__YAssignment_3_1 ) ) )
            // InternalVideoMontage.g:4256:1: ( ( rule__TextArea_Impl__YAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:4256:1: ( ( rule__TextArea_Impl__YAssignment_3_1 ) )
            // InternalVideoMontage.g:4257:2: ( rule__TextArea_Impl__YAssignment_3_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getYAssignment_3_1()); 
            // InternalVideoMontage.g:4258:2: ( rule__TextArea_Impl__YAssignment_3_1 )
            // InternalVideoMontage.g:4258:3: rule__TextArea_Impl__YAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__YAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getYAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_4__0"
    // InternalVideoMontage.g:4267:1: rule__TextArea_Impl__Group_4__0 : rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1 ;
    public final void rule__TextArea_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4271:1: ( rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1 )
            // InternalVideoMontage.g:4272:2: rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__TextArea_Impl__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_4__0"


    // $ANTLR start "rule__TextArea_Impl__Group_4__0__Impl"
    // InternalVideoMontage.g:4279:1: rule__TextArea_Impl__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__TextArea_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4283:1: ( ( 'width' ) )
            // InternalVideoMontage.g:4284:1: ( 'width' )
            {
            // InternalVideoMontage.g:4284:1: ( 'width' )
            // InternalVideoMontage.g:4285:2: 'width'
            {
             before(grammarAccess.getTextArea_ImplAccess().getWidthKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getWidthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_4__0__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_4__1"
    // InternalVideoMontage.g:4294:1: rule__TextArea_Impl__Group_4__1 : rule__TextArea_Impl__Group_4__1__Impl ;
    public final void rule__TextArea_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4298:1: ( rule__TextArea_Impl__Group_4__1__Impl )
            // InternalVideoMontage.g:4299:2: rule__TextArea_Impl__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_4__1"


    // $ANTLR start "rule__TextArea_Impl__Group_4__1__Impl"
    // InternalVideoMontage.g:4305:1: rule__TextArea_Impl__Group_4__1__Impl : ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) ) ;
    public final void rule__TextArea_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4309:1: ( ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) ) )
            // InternalVideoMontage.g:4310:1: ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:4310:1: ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) )
            // InternalVideoMontage.g:4311:2: ( rule__TextArea_Impl__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getWidthAssignment_4_1()); 
            // InternalVideoMontage.g:4312:2: ( rule__TextArea_Impl__WidthAssignment_4_1 )
            // InternalVideoMontage.g:4312:3: rule__TextArea_Impl__WidthAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__WidthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getWidthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_4__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_5__0"
    // InternalVideoMontage.g:4321:1: rule__TextArea_Impl__Group_5__0 : rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1 ;
    public final void rule__TextArea_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4325:1: ( rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1 )
            // InternalVideoMontage.g:4326:2: rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__TextArea_Impl__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_5__0"


    // $ANTLR start "rule__TextArea_Impl__Group_5__0__Impl"
    // InternalVideoMontage.g:4333:1: rule__TextArea_Impl__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__TextArea_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4337:1: ( ( 'height' ) )
            // InternalVideoMontage.g:4338:1: ( 'height' )
            {
            // InternalVideoMontage.g:4338:1: ( 'height' )
            // InternalVideoMontage.g:4339:2: 'height'
            {
             before(grammarAccess.getTextArea_ImplAccess().getHeightKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getHeightKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_5__0__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_5__1"
    // InternalVideoMontage.g:4348:1: rule__TextArea_Impl__Group_5__1 : rule__TextArea_Impl__Group_5__1__Impl ;
    public final void rule__TextArea_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4352:1: ( rule__TextArea_Impl__Group_5__1__Impl )
            // InternalVideoMontage.g:4353:2: rule__TextArea_Impl__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_5__1"


    // $ANTLR start "rule__TextArea_Impl__Group_5__1__Impl"
    // InternalVideoMontage.g:4359:1: rule__TextArea_Impl__Group_5__1__Impl : ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) ) ;
    public final void rule__TextArea_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4363:1: ( ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) ) )
            // InternalVideoMontage.g:4364:1: ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) )
            {
            // InternalVideoMontage.g:4364:1: ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) )
            // InternalVideoMontage.g:4365:2: ( rule__TextArea_Impl__HeightAssignment_5_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getHeightAssignment_5_1()); 
            // InternalVideoMontage.g:4366:2: ( rule__TextArea_Impl__HeightAssignment_5_1 )
            // InternalVideoMontage.g:4366:3: rule__TextArea_Impl__HeightAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__HeightAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getHeightAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_5__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_6__0"
    // InternalVideoMontage.g:4375:1: rule__TextArea_Impl__Group_6__0 : rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1 ;
    public final void rule__TextArea_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4379:1: ( rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1 )
            // InternalVideoMontage.g:4380:2: rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__TextArea_Impl__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_6__0"


    // $ANTLR start "rule__TextArea_Impl__Group_6__0__Impl"
    // InternalVideoMontage.g:4387:1: rule__TextArea_Impl__Group_6__0__Impl : ( 'text' ) ;
    public final void rule__TextArea_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4391:1: ( ( 'text' ) )
            // InternalVideoMontage.g:4392:1: ( 'text' )
            {
            // InternalVideoMontage.g:4392:1: ( 'text' )
            // InternalVideoMontage.g:4393:2: 'text'
            {
             before(grammarAccess.getTextArea_ImplAccess().getTextKeyword_6_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getTextKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_6__1"
    // InternalVideoMontage.g:4402:1: rule__TextArea_Impl__Group_6__1 : rule__TextArea_Impl__Group_6__1__Impl ;
    public final void rule__TextArea_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4406:1: ( rule__TextArea_Impl__Group_6__1__Impl )
            // InternalVideoMontage.g:4407:2: rule__TextArea_Impl__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_6__1"


    // $ANTLR start "rule__TextArea_Impl__Group_6__1__Impl"
    // InternalVideoMontage.g:4413:1: rule__TextArea_Impl__Group_6__1__Impl : ( ( rule__TextArea_Impl__TextAssignment_6_1 ) ) ;
    public final void rule__TextArea_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4417:1: ( ( ( rule__TextArea_Impl__TextAssignment_6_1 ) ) )
            // InternalVideoMontage.g:4418:1: ( ( rule__TextArea_Impl__TextAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:4418:1: ( ( rule__TextArea_Impl__TextAssignment_6_1 ) )
            // InternalVideoMontage.g:4419:2: ( rule__TextArea_Impl__TextAssignment_6_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getTextAssignment_6_1()); 
            // InternalVideoMontage.g:4420:2: ( rule__TextArea_Impl__TextAssignment_6_1 )
            // InternalVideoMontage.g:4420:3: rule__TextArea_Impl__TextAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__TextAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getTextAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_7__0"
    // InternalVideoMontage.g:4429:1: rule__TextArea_Impl__Group_7__0 : rule__TextArea_Impl__Group_7__0__Impl rule__TextArea_Impl__Group_7__1 ;
    public final void rule__TextArea_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4433:1: ( rule__TextArea_Impl__Group_7__0__Impl rule__TextArea_Impl__Group_7__1 )
            // InternalVideoMontage.g:4434:2: rule__TextArea_Impl__Group_7__0__Impl rule__TextArea_Impl__Group_7__1
            {
            pushFollow(FOLLOW_33);
            rule__TextArea_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_7__0"


    // $ANTLR start "rule__TextArea_Impl__Group_7__0__Impl"
    // InternalVideoMontage.g:4441:1: rule__TextArea_Impl__Group_7__0__Impl : ( 'font' ) ;
    public final void rule__TextArea_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4445:1: ( ( 'font' ) )
            // InternalVideoMontage.g:4446:1: ( 'font' )
            {
            // InternalVideoMontage.g:4446:1: ( 'font' )
            // InternalVideoMontage.g:4447:2: 'font'
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontKeyword_7_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getFontKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_7__1"
    // InternalVideoMontage.g:4456:1: rule__TextArea_Impl__Group_7__1 : rule__TextArea_Impl__Group_7__1__Impl ;
    public final void rule__TextArea_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4460:1: ( rule__TextArea_Impl__Group_7__1__Impl )
            // InternalVideoMontage.g:4461:2: rule__TextArea_Impl__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_7__1"


    // $ANTLR start "rule__TextArea_Impl__Group_7__1__Impl"
    // InternalVideoMontage.g:4467:1: rule__TextArea_Impl__Group_7__1__Impl : ( ( rule__TextArea_Impl__FontAssignment_7_1 ) ) ;
    public final void rule__TextArea_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4471:1: ( ( ( rule__TextArea_Impl__FontAssignment_7_1 ) ) )
            // InternalVideoMontage.g:4472:1: ( ( rule__TextArea_Impl__FontAssignment_7_1 ) )
            {
            // InternalVideoMontage.g:4472:1: ( ( rule__TextArea_Impl__FontAssignment_7_1 ) )
            // InternalVideoMontage.g:4473:2: ( rule__TextArea_Impl__FontAssignment_7_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontAssignment_7_1()); 
            // InternalVideoMontage.g:4474:2: ( rule__TextArea_Impl__FontAssignment_7_1 )
            // InternalVideoMontage.g:4474:3: rule__TextArea_Impl__FontAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__FontAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getFontAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_8__0"
    // InternalVideoMontage.g:4483:1: rule__TextArea_Impl__Group_8__0 : rule__TextArea_Impl__Group_8__0__Impl rule__TextArea_Impl__Group_8__1 ;
    public final void rule__TextArea_Impl__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4487:1: ( rule__TextArea_Impl__Group_8__0__Impl rule__TextArea_Impl__Group_8__1 )
            // InternalVideoMontage.g:4488:2: rule__TextArea_Impl__Group_8__0__Impl rule__TextArea_Impl__Group_8__1
            {
            pushFollow(FOLLOW_42);
            rule__TextArea_Impl__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_8__0"


    // $ANTLR start "rule__TextArea_Impl__Group_8__0__Impl"
    // InternalVideoMontage.g:4495:1: rule__TextArea_Impl__Group_8__0__Impl : ( 'animation' ) ;
    public final void rule__TextArea_Impl__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4499:1: ( ( 'animation' ) )
            // InternalVideoMontage.g:4500:1: ( 'animation' )
            {
            // InternalVideoMontage.g:4500:1: ( 'animation' )
            // InternalVideoMontage.g:4501:2: 'animation'
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationKeyword_8_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getAnimationKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_8__0__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_8__1"
    // InternalVideoMontage.g:4510:1: rule__TextArea_Impl__Group_8__1 : rule__TextArea_Impl__Group_8__1__Impl rule__TextArea_Impl__Group_8__2 ;
    public final void rule__TextArea_Impl__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4514:1: ( rule__TextArea_Impl__Group_8__1__Impl rule__TextArea_Impl__Group_8__2 )
            // InternalVideoMontage.g:4515:2: rule__TextArea_Impl__Group_8__1__Impl rule__TextArea_Impl__Group_8__2
            {
            pushFollow(FOLLOW_42);
            rule__TextArea_Impl__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_8__1"


    // $ANTLR start "rule__TextArea_Impl__Group_8__1__Impl"
    // InternalVideoMontage.g:4522:1: rule__TextArea_Impl__Group_8__1__Impl : ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) ) ;
    public final void rule__TextArea_Impl__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4526:1: ( ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) ) )
            // InternalVideoMontage.g:4527:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) )
            {
            // InternalVideoMontage.g:4527:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) )
            // InternalVideoMontage.g:4528:2: ( rule__TextArea_Impl__AnimationAssignment_8_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_8_1()); 
            // InternalVideoMontage.g:4529:2: ( rule__TextArea_Impl__AnimationAssignment_8_1 )
            // InternalVideoMontage.g:4529:3: rule__TextArea_Impl__AnimationAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__AnimationAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_8__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_8__2"
    // InternalVideoMontage.g:4537:1: rule__TextArea_Impl__Group_8__2 : rule__TextArea_Impl__Group_8__2__Impl ;
    public final void rule__TextArea_Impl__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4541:1: ( rule__TextArea_Impl__Group_8__2__Impl )
            // InternalVideoMontage.g:4542:2: rule__TextArea_Impl__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_8__2"


    // $ANTLR start "rule__TextArea_Impl__Group_8__2__Impl"
    // InternalVideoMontage.g:4548:1: rule__TextArea_Impl__Group_8__2__Impl : ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* ) ;
    public final void rule__TextArea_Impl__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4552:1: ( ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* ) )
            // InternalVideoMontage.g:4553:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* )
            {
            // InternalVideoMontage.g:4553:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* )
            // InternalVideoMontage.g:4554:2: ( rule__TextArea_Impl__AnimationAssignment_8_2 )*
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_8_2()); 
            // InternalVideoMontage.g:4555:2: ( rule__TextArea_Impl__AnimationAssignment_8_2 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=57 && LA35_0<=58)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVideoMontage.g:4555:3: rule__TextArea_Impl__AnimationAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__TextArea_Impl__AnimationAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_8__2__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__0"
    // InternalVideoMontage.g:4564:1: rule__TextAreaDynamic__Group__0 : rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1 ;
    public final void rule__TextAreaDynamic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4568:1: ( rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1 )
            // InternalVideoMontage.g:4569:2: rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TextAreaDynamic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__0"


    // $ANTLR start "rule__TextAreaDynamic__Group__0__Impl"
    // InternalVideoMontage.g:4576:1: rule__TextAreaDynamic__Group__0__Impl : ( 'TextAreaDynamic' ) ;
    public final void rule__TextAreaDynamic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4580:1: ( ( 'TextAreaDynamic' ) )
            // InternalVideoMontage.g:4581:1: ( 'TextAreaDynamic' )
            {
            // InternalVideoMontage.g:4581:1: ( 'TextAreaDynamic' )
            // InternalVideoMontage.g:4582:2: 'TextAreaDynamic'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextAreaDynamicKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getTextAreaDynamicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__0__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__1"
    // InternalVideoMontage.g:4591:1: rule__TextAreaDynamic__Group__1 : rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2 ;
    public final void rule__TextAreaDynamic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4595:1: ( rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2 )
            // InternalVideoMontage.g:4596:2: rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2
            {
            pushFollow(FOLLOW_44);
            rule__TextAreaDynamic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__1"


    // $ANTLR start "rule__TextAreaDynamic__Group__1__Impl"
    // InternalVideoMontage.g:4603:1: rule__TextAreaDynamic__Group__1__Impl : ( '{' ) ;
    public final void rule__TextAreaDynamic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4607:1: ( ( '{' ) )
            // InternalVideoMontage.g:4608:1: ( '{' )
            {
            // InternalVideoMontage.g:4608:1: ( '{' )
            // InternalVideoMontage.g:4609:2: '{'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__1__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__2"
    // InternalVideoMontage.g:4618:1: rule__TextAreaDynamic__Group__2 : rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3 ;
    public final void rule__TextAreaDynamic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4622:1: ( rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3 )
            // InternalVideoMontage.g:4623:2: rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__TextAreaDynamic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__2"


    // $ANTLR start "rule__TextAreaDynamic__Group__2__Impl"
    // InternalVideoMontage.g:4630:1: rule__TextAreaDynamic__Group__2__Impl : ( ( rule__TextAreaDynamic__Group_2__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4634:1: ( ( ( rule__TextAreaDynamic__Group_2__0 )? ) )
            // InternalVideoMontage.g:4635:1: ( ( rule__TextAreaDynamic__Group_2__0 )? )
            {
            // InternalVideoMontage.g:4635:1: ( ( rule__TextAreaDynamic__Group_2__0 )? )
            // InternalVideoMontage.g:4636:2: ( rule__TextAreaDynamic__Group_2__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_2()); 
            // InternalVideoMontage.g:4637:2: ( rule__TextAreaDynamic__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==47) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVideoMontage.g:4637:3: rule__TextAreaDynamic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextAreaDynamic__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAreaDynamicAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__2__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__3"
    // InternalVideoMontage.g:4645:1: rule__TextAreaDynamic__Group__3 : rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4 ;
    public final void rule__TextAreaDynamic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4649:1: ( rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4 )
            // InternalVideoMontage.g:4650:2: rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__TextAreaDynamic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__3"


    // $ANTLR start "rule__TextAreaDynamic__Group__3__Impl"
    // InternalVideoMontage.g:4657:1: rule__TextAreaDynamic__Group__3__Impl : ( ( rule__TextAreaDynamic__Group_3__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4661:1: ( ( ( rule__TextAreaDynamic__Group_3__0 )? ) )
            // InternalVideoMontage.g:4662:1: ( ( rule__TextAreaDynamic__Group_3__0 )? )
            {
            // InternalVideoMontage.g:4662:1: ( ( rule__TextAreaDynamic__Group_3__0 )? )
            // InternalVideoMontage.g:4663:2: ( rule__TextAreaDynamic__Group_3__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_3()); 
            // InternalVideoMontage.g:4664:2: ( rule__TextAreaDynamic__Group_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==48) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVideoMontage.g:4664:3: rule__TextAreaDynamic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextAreaDynamic__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAreaDynamicAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__3__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__4"
    // InternalVideoMontage.g:4672:1: rule__TextAreaDynamic__Group__4 : rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5 ;
    public final void rule__TextAreaDynamic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4676:1: ( rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5 )
            // InternalVideoMontage.g:4677:2: rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__TextAreaDynamic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__4"


    // $ANTLR start "rule__TextAreaDynamic__Group__4__Impl"
    // InternalVideoMontage.g:4684:1: rule__TextAreaDynamic__Group__4__Impl : ( ( rule__TextAreaDynamic__Group_4__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4688:1: ( ( ( rule__TextAreaDynamic__Group_4__0 )? ) )
            // InternalVideoMontage.g:4689:1: ( ( rule__TextAreaDynamic__Group_4__0 )? )
            {
            // InternalVideoMontage.g:4689:1: ( ( rule__TextAreaDynamic__Group_4__0 )? )
            // InternalVideoMontage.g:4690:2: ( rule__TextAreaDynamic__Group_4__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_4()); 
            // InternalVideoMontage.g:4691:2: ( rule__TextAreaDynamic__Group_4__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==49) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVideoMontage.g:4691:3: rule__TextAreaDynamic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextAreaDynamic__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAreaDynamicAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__4__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__5"
    // InternalVideoMontage.g:4699:1: rule__TextAreaDynamic__Group__5 : rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6 ;
    public final void rule__TextAreaDynamic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4703:1: ( rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6 )
            // InternalVideoMontage.g:4704:2: rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6
            {
            pushFollow(FOLLOW_44);
            rule__TextAreaDynamic__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__5"


    // $ANTLR start "rule__TextAreaDynamic__Group__5__Impl"
    // InternalVideoMontage.g:4711:1: rule__TextAreaDynamic__Group__5__Impl : ( ( rule__TextAreaDynamic__Group_5__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4715:1: ( ( ( rule__TextAreaDynamic__Group_5__0 )? ) )
            // InternalVideoMontage.g:4716:1: ( ( rule__TextAreaDynamic__Group_5__0 )? )
            {
            // InternalVideoMontage.g:4716:1: ( ( rule__TextAreaDynamic__Group_5__0 )? )
            // InternalVideoMontage.g:4717:2: ( rule__TextAreaDynamic__Group_5__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_5()); 
            // InternalVideoMontage.g:4718:2: ( rule__TextAreaDynamic__Group_5__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==50) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVideoMontage.g:4718:3: rule__TextAreaDynamic__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextAreaDynamic__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAreaDynamicAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__5__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__6"
    // InternalVideoMontage.g:4726:1: rule__TextAreaDynamic__Group__6 : rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7 ;
    public final void rule__TextAreaDynamic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4730:1: ( rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7 )
            // InternalVideoMontage.g:4731:2: rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7
            {
            pushFollow(FOLLOW_44);
            rule__TextAreaDynamic__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__6"


    // $ANTLR start "rule__TextAreaDynamic__Group__6__Impl"
    // InternalVideoMontage.g:4738:1: rule__TextAreaDynamic__Group__6__Impl : ( ( rule__TextAreaDynamic__Group_6__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4742:1: ( ( ( rule__TextAreaDynamic__Group_6__0 )? ) )
            // InternalVideoMontage.g:4743:1: ( ( rule__TextAreaDynamic__Group_6__0 )? )
            {
            // InternalVideoMontage.g:4743:1: ( ( rule__TextAreaDynamic__Group_6__0 )? )
            // InternalVideoMontage.g:4744:2: ( rule__TextAreaDynamic__Group_6__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_6()); 
            // InternalVideoMontage.g:4745:2: ( rule__TextAreaDynamic__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalVideoMontage.g:4745:3: rule__TextAreaDynamic__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextAreaDynamic__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAreaDynamicAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__6__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__7"
    // InternalVideoMontage.g:4753:1: rule__TextAreaDynamic__Group__7 : rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8 ;
    public final void rule__TextAreaDynamic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4757:1: ( rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8 )
            // InternalVideoMontage.g:4758:2: rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8
            {
            pushFollow(FOLLOW_44);
            rule__TextAreaDynamic__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__7"


    // $ANTLR start "rule__TextAreaDynamic__Group__7__Impl"
    // InternalVideoMontage.g:4765:1: rule__TextAreaDynamic__Group__7__Impl : ( ( rule__TextAreaDynamic__Group_7__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4769:1: ( ( ( rule__TextAreaDynamic__Group_7__0 )? ) )
            // InternalVideoMontage.g:4770:1: ( ( rule__TextAreaDynamic__Group_7__0 )? )
            {
            // InternalVideoMontage.g:4770:1: ( ( rule__TextAreaDynamic__Group_7__0 )? )
            // InternalVideoMontage.g:4771:2: ( rule__TextAreaDynamic__Group_7__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_7()); 
            // InternalVideoMontage.g:4772:2: ( rule__TextAreaDynamic__Group_7__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVideoMontage.g:4772:3: rule__TextAreaDynamic__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextAreaDynamic__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAreaDynamicAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__7__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__8"
    // InternalVideoMontage.g:4780:1: rule__TextAreaDynamic__Group__8 : rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9 ;
    public final void rule__TextAreaDynamic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4784:1: ( rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9 )
            // InternalVideoMontage.g:4785:2: rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9
            {
            pushFollow(FOLLOW_44);
            rule__TextAreaDynamic__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__8"


    // $ANTLR start "rule__TextAreaDynamic__Group__8__Impl"
    // InternalVideoMontage.g:4792:1: rule__TextAreaDynamic__Group__8__Impl : ( ( rule__TextAreaDynamic__Group_8__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4796:1: ( ( ( rule__TextAreaDynamic__Group_8__0 )? ) )
            // InternalVideoMontage.g:4797:1: ( ( rule__TextAreaDynamic__Group_8__0 )? )
            {
            // InternalVideoMontage.g:4797:1: ( ( rule__TextAreaDynamic__Group_8__0 )? )
            // InternalVideoMontage.g:4798:2: ( rule__TextAreaDynamic__Group_8__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_8()); 
            // InternalVideoMontage.g:4799:2: ( rule__TextAreaDynamic__Group_8__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==56) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVideoMontage.g:4799:3: rule__TextAreaDynamic__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextAreaDynamic__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAreaDynamicAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__8__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__9"
    // InternalVideoMontage.g:4807:1: rule__TextAreaDynamic__Group__9 : rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10 ;
    public final void rule__TextAreaDynamic__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4811:1: ( rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10 )
            // InternalVideoMontage.g:4812:2: rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__TextAreaDynamic__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__9"


    // $ANTLR start "rule__TextAreaDynamic__Group__9__Impl"
    // InternalVideoMontage.g:4819:1: rule__TextAreaDynamic__Group__9__Impl : ( 'font' ) ;
    public final void rule__TextAreaDynamic__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4823:1: ( ( 'font' ) )
            // InternalVideoMontage.g:4824:1: ( 'font' )
            {
            // InternalVideoMontage.g:4824:1: ( 'font' )
            // InternalVideoMontage.g:4825:2: 'font'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontKeyword_9()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getFontKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__9__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__10"
    // InternalVideoMontage.g:4834:1: rule__TextAreaDynamic__Group__10 : rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11 ;
    public final void rule__TextAreaDynamic__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4838:1: ( rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11 )
            // InternalVideoMontage.g:4839:2: rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11
            {
            pushFollow(FOLLOW_45);
            rule__TextAreaDynamic__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__10"


    // $ANTLR start "rule__TextAreaDynamic__Group__10__Impl"
    // InternalVideoMontage.g:4846:1: rule__TextAreaDynamic__Group__10__Impl : ( ( rule__TextAreaDynamic__FontAssignment_10 ) ) ;
    public final void rule__TextAreaDynamic__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4850:1: ( ( ( rule__TextAreaDynamic__FontAssignment_10 ) ) )
            // InternalVideoMontage.g:4851:1: ( ( rule__TextAreaDynamic__FontAssignment_10 ) )
            {
            // InternalVideoMontage.g:4851:1: ( ( rule__TextAreaDynamic__FontAssignment_10 ) )
            // InternalVideoMontage.g:4852:2: ( rule__TextAreaDynamic__FontAssignment_10 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontAssignment_10()); 
            // InternalVideoMontage.g:4853:2: ( rule__TextAreaDynamic__FontAssignment_10 )
            // InternalVideoMontage.g:4853:3: rule__TextAreaDynamic__FontAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__FontAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getFontAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__10__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__11"
    // InternalVideoMontage.g:4861:1: rule__TextAreaDynamic__Group__11 : rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12 ;
    public final void rule__TextAreaDynamic__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4865:1: ( rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12 )
            // InternalVideoMontage.g:4866:2: rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12
            {
            pushFollow(FOLLOW_45);
            rule__TextAreaDynamic__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__11"


    // $ANTLR start "rule__TextAreaDynamic__Group__11__Impl"
    // InternalVideoMontage.g:4873:1: rule__TextAreaDynamic__Group__11__Impl : ( ( rule__TextAreaDynamic__Group_11__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4877:1: ( ( ( rule__TextAreaDynamic__Group_11__0 )? ) )
            // InternalVideoMontage.g:4878:1: ( ( rule__TextAreaDynamic__Group_11__0 )? )
            {
            // InternalVideoMontage.g:4878:1: ( ( rule__TextAreaDynamic__Group_11__0 )? )
            // InternalVideoMontage.g:4879:2: ( rule__TextAreaDynamic__Group_11__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_11()); 
            // InternalVideoMontage.g:4880:2: ( rule__TextAreaDynamic__Group_11__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVideoMontage.g:4880:3: rule__TextAreaDynamic__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextAreaDynamic__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAreaDynamicAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__11__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group__12"
    // InternalVideoMontage.g:4888:1: rule__TextAreaDynamic__Group__12 : rule__TextAreaDynamic__Group__12__Impl ;
    public final void rule__TextAreaDynamic__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4892:1: ( rule__TextAreaDynamic__Group__12__Impl )
            // InternalVideoMontage.g:4893:2: rule__TextAreaDynamic__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__12"


    // $ANTLR start "rule__TextAreaDynamic__Group__12__Impl"
    // InternalVideoMontage.g:4899:1: rule__TextAreaDynamic__Group__12__Impl : ( '}' ) ;
    public final void rule__TextAreaDynamic__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4903:1: ( ( '}' ) )
            // InternalVideoMontage.g:4904:1: ( '}' )
            {
            // InternalVideoMontage.g:4904:1: ( '}' )
            // InternalVideoMontage.g:4905:2: '}'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getRightCurlyBracketKeyword_12()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group__12__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_2__0"
    // InternalVideoMontage.g:4915:1: rule__TextAreaDynamic__Group_2__0 : rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1 ;
    public final void rule__TextAreaDynamic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4919:1: ( rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1 )
            // InternalVideoMontage.g:4920:2: rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1
            {
            pushFollow(FOLLOW_41);
            rule__TextAreaDynamic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_2__0"


    // $ANTLR start "rule__TextAreaDynamic__Group_2__0__Impl"
    // InternalVideoMontage.g:4927:1: rule__TextAreaDynamic__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__TextAreaDynamic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4931:1: ( ( 'x' ) )
            // InternalVideoMontage.g:4932:1: ( 'x' )
            {
            // InternalVideoMontage.g:4932:1: ( 'x' )
            // InternalVideoMontage.g:4933:2: 'x'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getXKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getXKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_2__0__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_2__1"
    // InternalVideoMontage.g:4942:1: rule__TextAreaDynamic__Group_2__1 : rule__TextAreaDynamic__Group_2__1__Impl ;
    public final void rule__TextAreaDynamic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4946:1: ( rule__TextAreaDynamic__Group_2__1__Impl )
            // InternalVideoMontage.g:4947:2: rule__TextAreaDynamic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_2__1"


    // $ANTLR start "rule__TextAreaDynamic__Group_2__1__Impl"
    // InternalVideoMontage.g:4953:1: rule__TextAreaDynamic__Group_2__1__Impl : ( ( rule__TextAreaDynamic__XAssignment_2_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4957:1: ( ( ( rule__TextAreaDynamic__XAssignment_2_1 ) ) )
            // InternalVideoMontage.g:4958:1: ( ( rule__TextAreaDynamic__XAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:4958:1: ( ( rule__TextAreaDynamic__XAssignment_2_1 ) )
            // InternalVideoMontage.g:4959:2: ( rule__TextAreaDynamic__XAssignment_2_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getXAssignment_2_1()); 
            // InternalVideoMontage.g:4960:2: ( rule__TextAreaDynamic__XAssignment_2_1 )
            // InternalVideoMontage.g:4960:3: rule__TextAreaDynamic__XAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__XAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getXAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_2__1__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_3__0"
    // InternalVideoMontage.g:4969:1: rule__TextAreaDynamic__Group_3__0 : rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1 ;
    public final void rule__TextAreaDynamic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4973:1: ( rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1 )
            // InternalVideoMontage.g:4974:2: rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__TextAreaDynamic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_3__0"


    // $ANTLR start "rule__TextAreaDynamic__Group_3__0__Impl"
    // InternalVideoMontage.g:4981:1: rule__TextAreaDynamic__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__TextAreaDynamic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4985:1: ( ( 'y' ) )
            // InternalVideoMontage.g:4986:1: ( 'y' )
            {
            // InternalVideoMontage.g:4986:1: ( 'y' )
            // InternalVideoMontage.g:4987:2: 'y'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getYKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getYKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_3__0__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_3__1"
    // InternalVideoMontage.g:4996:1: rule__TextAreaDynamic__Group_3__1 : rule__TextAreaDynamic__Group_3__1__Impl ;
    public final void rule__TextAreaDynamic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5000:1: ( rule__TextAreaDynamic__Group_3__1__Impl )
            // InternalVideoMontage.g:5001:2: rule__TextAreaDynamic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_3__1"


    // $ANTLR start "rule__TextAreaDynamic__Group_3__1__Impl"
    // InternalVideoMontage.g:5007:1: rule__TextAreaDynamic__Group_3__1__Impl : ( ( rule__TextAreaDynamic__YAssignment_3_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5011:1: ( ( ( rule__TextAreaDynamic__YAssignment_3_1 ) ) )
            // InternalVideoMontage.g:5012:1: ( ( rule__TextAreaDynamic__YAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:5012:1: ( ( rule__TextAreaDynamic__YAssignment_3_1 ) )
            // InternalVideoMontage.g:5013:2: ( rule__TextAreaDynamic__YAssignment_3_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getYAssignment_3_1()); 
            // InternalVideoMontage.g:5014:2: ( rule__TextAreaDynamic__YAssignment_3_1 )
            // InternalVideoMontage.g:5014:3: rule__TextAreaDynamic__YAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__YAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getYAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_3__1__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_4__0"
    // InternalVideoMontage.g:5023:1: rule__TextAreaDynamic__Group_4__0 : rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1 ;
    public final void rule__TextAreaDynamic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5027:1: ( rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1 )
            // InternalVideoMontage.g:5028:2: rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__TextAreaDynamic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_4__0"


    // $ANTLR start "rule__TextAreaDynamic__Group_4__0__Impl"
    // InternalVideoMontage.g:5035:1: rule__TextAreaDynamic__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__TextAreaDynamic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5039:1: ( ( 'width' ) )
            // InternalVideoMontage.g:5040:1: ( 'width' )
            {
            // InternalVideoMontage.g:5040:1: ( 'width' )
            // InternalVideoMontage.g:5041:2: 'width'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getWidthKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getWidthKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_4__0__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_4__1"
    // InternalVideoMontage.g:5050:1: rule__TextAreaDynamic__Group_4__1 : rule__TextAreaDynamic__Group_4__1__Impl ;
    public final void rule__TextAreaDynamic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5054:1: ( rule__TextAreaDynamic__Group_4__1__Impl )
            // InternalVideoMontage.g:5055:2: rule__TextAreaDynamic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_4__1"


    // $ANTLR start "rule__TextAreaDynamic__Group_4__1__Impl"
    // InternalVideoMontage.g:5061:1: rule__TextAreaDynamic__Group_4__1__Impl : ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5065:1: ( ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) ) )
            // InternalVideoMontage.g:5066:1: ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:5066:1: ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) )
            // InternalVideoMontage.g:5067:2: ( rule__TextAreaDynamic__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getWidthAssignment_4_1()); 
            // InternalVideoMontage.g:5068:2: ( rule__TextAreaDynamic__WidthAssignment_4_1 )
            // InternalVideoMontage.g:5068:3: rule__TextAreaDynamic__WidthAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__WidthAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getWidthAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_4__1__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_5__0"
    // InternalVideoMontage.g:5077:1: rule__TextAreaDynamic__Group_5__0 : rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1 ;
    public final void rule__TextAreaDynamic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5081:1: ( rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1 )
            // InternalVideoMontage.g:5082:2: rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__TextAreaDynamic__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_5__0"


    // $ANTLR start "rule__TextAreaDynamic__Group_5__0__Impl"
    // InternalVideoMontage.g:5089:1: rule__TextAreaDynamic__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__TextAreaDynamic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5093:1: ( ( 'height' ) )
            // InternalVideoMontage.g:5094:1: ( 'height' )
            {
            // InternalVideoMontage.g:5094:1: ( 'height' )
            // InternalVideoMontage.g:5095:2: 'height'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getHeightKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getHeightKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_5__0__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_5__1"
    // InternalVideoMontage.g:5104:1: rule__TextAreaDynamic__Group_5__1 : rule__TextAreaDynamic__Group_5__1__Impl ;
    public final void rule__TextAreaDynamic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5108:1: ( rule__TextAreaDynamic__Group_5__1__Impl )
            // InternalVideoMontage.g:5109:2: rule__TextAreaDynamic__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_5__1"


    // $ANTLR start "rule__TextAreaDynamic__Group_5__1__Impl"
    // InternalVideoMontage.g:5115:1: rule__TextAreaDynamic__Group_5__1__Impl : ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5119:1: ( ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) ) )
            // InternalVideoMontage.g:5120:1: ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) )
            {
            // InternalVideoMontage.g:5120:1: ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) )
            // InternalVideoMontage.g:5121:2: ( rule__TextAreaDynamic__HeightAssignment_5_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getHeightAssignment_5_1()); 
            // InternalVideoMontage.g:5122:2: ( rule__TextAreaDynamic__HeightAssignment_5_1 )
            // InternalVideoMontage.g:5122:3: rule__TextAreaDynamic__HeightAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__HeightAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getHeightAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_5__1__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_6__0"
    // InternalVideoMontage.g:5131:1: rule__TextAreaDynamic__Group_6__0 : rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1 ;
    public final void rule__TextAreaDynamic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5135:1: ( rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1 )
            // InternalVideoMontage.g:5136:2: rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__TextAreaDynamic__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_6__0"


    // $ANTLR start "rule__TextAreaDynamic__Group_6__0__Impl"
    // InternalVideoMontage.g:5143:1: rule__TextAreaDynamic__Group_6__0__Impl : ( 'text' ) ;
    public final void rule__TextAreaDynamic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5147:1: ( ( 'text' ) )
            // InternalVideoMontage.g:5148:1: ( 'text' )
            {
            // InternalVideoMontage.g:5148:1: ( 'text' )
            // InternalVideoMontage.g:5149:2: 'text'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextKeyword_6_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getTextKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_6__0__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_6__1"
    // InternalVideoMontage.g:5158:1: rule__TextAreaDynamic__Group_6__1 : rule__TextAreaDynamic__Group_6__1__Impl ;
    public final void rule__TextAreaDynamic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5162:1: ( rule__TextAreaDynamic__Group_6__1__Impl )
            // InternalVideoMontage.g:5163:2: rule__TextAreaDynamic__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_6__1"


    // $ANTLR start "rule__TextAreaDynamic__Group_6__1__Impl"
    // InternalVideoMontage.g:5169:1: rule__TextAreaDynamic__Group_6__1__Impl : ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5173:1: ( ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) ) )
            // InternalVideoMontage.g:5174:1: ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:5174:1: ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) )
            // InternalVideoMontage.g:5175:2: ( rule__TextAreaDynamic__TextAssignment_6_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextAssignment_6_1()); 
            // InternalVideoMontage.g:5176:2: ( rule__TextAreaDynamic__TextAssignment_6_1 )
            // InternalVideoMontage.g:5176:3: rule__TextAreaDynamic__TextAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__TextAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getTextAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_6__1__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_7__0"
    // InternalVideoMontage.g:5185:1: rule__TextAreaDynamic__Group_7__0 : rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1 ;
    public final void rule__TextAreaDynamic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5189:1: ( rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1 )
            // InternalVideoMontage.g:5190:2: rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__TextAreaDynamic__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_7__0"


    // $ANTLR start "rule__TextAreaDynamic__Group_7__0__Impl"
    // InternalVideoMontage.g:5197:1: rule__TextAreaDynamic__Group_7__0__Impl : ( 'textSrc' ) ;
    public final void rule__TextAreaDynamic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5201:1: ( ( 'textSrc' ) )
            // InternalVideoMontage.g:5202:1: ( 'textSrc' )
            {
            // InternalVideoMontage.g:5202:1: ( 'textSrc' )
            // InternalVideoMontage.g:5203:2: 'textSrc'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextSrcKeyword_7_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getTextSrcKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_7__0__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_7__1"
    // InternalVideoMontage.g:5212:1: rule__TextAreaDynamic__Group_7__1 : rule__TextAreaDynamic__Group_7__1__Impl ;
    public final void rule__TextAreaDynamic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5216:1: ( rule__TextAreaDynamic__Group_7__1__Impl )
            // InternalVideoMontage.g:5217:2: rule__TextAreaDynamic__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_7__1"


    // $ANTLR start "rule__TextAreaDynamic__Group_7__1__Impl"
    // InternalVideoMontage.g:5223:1: rule__TextAreaDynamic__Group_7__1__Impl : ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5227:1: ( ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) ) )
            // InternalVideoMontage.g:5228:1: ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) )
            {
            // InternalVideoMontage.g:5228:1: ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) )
            // InternalVideoMontage.g:5229:2: ( rule__TextAreaDynamic__TextSrcAssignment_7_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextSrcAssignment_7_1()); 
            // InternalVideoMontage.g:5230:2: ( rule__TextAreaDynamic__TextSrcAssignment_7_1 )
            // InternalVideoMontage.g:5230:3: rule__TextAreaDynamic__TextSrcAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__TextSrcAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getTextSrcAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_7__1__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_8__0"
    // InternalVideoMontage.g:5239:1: rule__TextAreaDynamic__Group_8__0 : rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1 ;
    public final void rule__TextAreaDynamic__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5243:1: ( rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1 )
            // InternalVideoMontage.g:5244:2: rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1
            {
            pushFollow(FOLLOW_41);
            rule__TextAreaDynamic__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_8__0"


    // $ANTLR start "rule__TextAreaDynamic__Group_8__0__Impl"
    // InternalVideoMontage.g:5251:1: rule__TextAreaDynamic__Group_8__0__Impl : ( 'line' ) ;
    public final void rule__TextAreaDynamic__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5255:1: ( ( 'line' ) )
            // InternalVideoMontage.g:5256:1: ( 'line' )
            {
            // InternalVideoMontage.g:5256:1: ( 'line' )
            // InternalVideoMontage.g:5257:2: 'line'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getLineKeyword_8_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getLineKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_8__0__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_8__1"
    // InternalVideoMontage.g:5266:1: rule__TextAreaDynamic__Group_8__1 : rule__TextAreaDynamic__Group_8__1__Impl ;
    public final void rule__TextAreaDynamic__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5270:1: ( rule__TextAreaDynamic__Group_8__1__Impl )
            // InternalVideoMontage.g:5271:2: rule__TextAreaDynamic__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_8__1"


    // $ANTLR start "rule__TextAreaDynamic__Group_8__1__Impl"
    // InternalVideoMontage.g:5277:1: rule__TextAreaDynamic__Group_8__1__Impl : ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5281:1: ( ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) ) )
            // InternalVideoMontage.g:5282:1: ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) )
            {
            // InternalVideoMontage.g:5282:1: ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) )
            // InternalVideoMontage.g:5283:2: ( rule__TextAreaDynamic__LineAssignment_8_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getLineAssignment_8_1()); 
            // InternalVideoMontage.g:5284:2: ( rule__TextAreaDynamic__LineAssignment_8_1 )
            // InternalVideoMontage.g:5284:3: rule__TextAreaDynamic__LineAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__LineAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getLineAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_8__1__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_11__0"
    // InternalVideoMontage.g:5293:1: rule__TextAreaDynamic__Group_11__0 : rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1 ;
    public final void rule__TextAreaDynamic__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5297:1: ( rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1 )
            // InternalVideoMontage.g:5298:2: rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1
            {
            pushFollow(FOLLOW_42);
            rule__TextAreaDynamic__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11__0"


    // $ANTLR start "rule__TextAreaDynamic__Group_11__0__Impl"
    // InternalVideoMontage.g:5305:1: rule__TextAreaDynamic__Group_11__0__Impl : ( 'animation' ) ;
    public final void rule__TextAreaDynamic__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5309:1: ( ( 'animation' ) )
            // InternalVideoMontage.g:5310:1: ( 'animation' )
            {
            // InternalVideoMontage.g:5310:1: ( 'animation' )
            // InternalVideoMontage.g:5311:2: 'animation'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationKeyword_11_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getAnimationKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11__0__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_11__1"
    // InternalVideoMontage.g:5320:1: rule__TextAreaDynamic__Group_11__1 : rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2 ;
    public final void rule__TextAreaDynamic__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5324:1: ( rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2 )
            // InternalVideoMontage.g:5325:2: rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2
            {
            pushFollow(FOLLOW_42);
            rule__TextAreaDynamic__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11__1"


    // $ANTLR start "rule__TextAreaDynamic__Group_11__1__Impl"
    // InternalVideoMontage.g:5332:1: rule__TextAreaDynamic__Group_11__1__Impl : ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5336:1: ( ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) ) )
            // InternalVideoMontage.g:5337:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) )
            {
            // InternalVideoMontage.g:5337:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) )
            // InternalVideoMontage.g:5338:2: ( rule__TextAreaDynamic__AnimationAssignment_11_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_1()); 
            // InternalVideoMontage.g:5339:2: ( rule__TextAreaDynamic__AnimationAssignment_11_1 )
            // InternalVideoMontage.g:5339:3: rule__TextAreaDynamic__AnimationAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__AnimationAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11__1__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_11__2"
    // InternalVideoMontage.g:5347:1: rule__TextAreaDynamic__Group_11__2 : rule__TextAreaDynamic__Group_11__2__Impl ;
    public final void rule__TextAreaDynamic__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5351:1: ( rule__TextAreaDynamic__Group_11__2__Impl )
            // InternalVideoMontage.g:5352:2: rule__TextAreaDynamic__Group_11__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_11__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11__2"


    // $ANTLR start "rule__TextAreaDynamic__Group_11__2__Impl"
    // InternalVideoMontage.g:5358:1: rule__TextAreaDynamic__Group_11__2__Impl : ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* ) ;
    public final void rule__TextAreaDynamic__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5362:1: ( ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* ) )
            // InternalVideoMontage.g:5363:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* )
            {
            // InternalVideoMontage.g:5363:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* )
            // InternalVideoMontage.g:5364:2: ( rule__TextAreaDynamic__AnimationAssignment_11_2 )*
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_2()); 
            // InternalVideoMontage.g:5365:2: ( rule__TextAreaDynamic__AnimationAssignment_11_2 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=57 && LA44_0<=58)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalVideoMontage.g:5365:3: rule__TextAreaDynamic__AnimationAssignment_11_2
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__TextAreaDynamic__AnimationAssignment_11_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11__2__Impl"


    // $ANTLR start "rule__FadeIn__Group__0"
    // InternalVideoMontage.g:5374:1: rule__FadeIn__Group__0 : rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 ;
    public final void rule__FadeIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5378:1: ( rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 )
            // InternalVideoMontage.g:5379:2: rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1
            {
            pushFollow(FOLLOW_46);
            rule__FadeIn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__0"


    // $ANTLR start "rule__FadeIn__Group__0__Impl"
    // InternalVideoMontage.g:5386:1: rule__FadeIn__Group__0__Impl : ( () ) ;
    public final void rule__FadeIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5390:1: ( ( () ) )
            // InternalVideoMontage.g:5391:1: ( () )
            {
            // InternalVideoMontage.g:5391:1: ( () )
            // InternalVideoMontage.g:5392:2: ()
            {
             before(grammarAccess.getFadeInAccess().getFadeInAction_0()); 
            // InternalVideoMontage.g:5393:2: ()
            // InternalVideoMontage.g:5393:3: 
            {
            }

             after(grammarAccess.getFadeInAccess().getFadeInAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__0__Impl"


    // $ANTLR start "rule__FadeIn__Group__1"
    // InternalVideoMontage.g:5401:1: rule__FadeIn__Group__1 : rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 ;
    public final void rule__FadeIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5405:1: ( rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 )
            // InternalVideoMontage.g:5406:2: rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FadeIn__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__1"


    // $ANTLR start "rule__FadeIn__Group__1__Impl"
    // InternalVideoMontage.g:5413:1: rule__FadeIn__Group__1__Impl : ( 'FadeIn' ) ;
    public final void rule__FadeIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5417:1: ( ( 'FadeIn' ) )
            // InternalVideoMontage.g:5418:1: ( 'FadeIn' )
            {
            // InternalVideoMontage.g:5418:1: ( 'FadeIn' )
            // InternalVideoMontage.g:5419:2: 'FadeIn'
            {
             before(grammarAccess.getFadeInAccess().getFadeInKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getFadeInKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__1__Impl"


    // $ANTLR start "rule__FadeIn__Group__2"
    // InternalVideoMontage.g:5428:1: rule__FadeIn__Group__2 : rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 ;
    public final void rule__FadeIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5432:1: ( rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 )
            // InternalVideoMontage.g:5433:2: rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__FadeIn__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__2"


    // $ANTLR start "rule__FadeIn__Group__2__Impl"
    // InternalVideoMontage.g:5440:1: rule__FadeIn__Group__2__Impl : ( '{' ) ;
    public final void rule__FadeIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5444:1: ( ( '{' ) )
            // InternalVideoMontage.g:5445:1: ( '{' )
            {
            // InternalVideoMontage.g:5445:1: ( '{' )
            // InternalVideoMontage.g:5446:2: '{'
            {
             before(grammarAccess.getFadeInAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__2__Impl"


    // $ANTLR start "rule__FadeIn__Group__3"
    // InternalVideoMontage.g:5455:1: rule__FadeIn__Group__3 : rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 ;
    public final void rule__FadeIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5459:1: ( rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 )
            // InternalVideoMontage.g:5460:2: rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__FadeIn__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__3"


    // $ANTLR start "rule__FadeIn__Group__3__Impl"
    // InternalVideoMontage.g:5467:1: rule__FadeIn__Group__3__Impl : ( ( rule__FadeIn__Group_3__0 )? ) ;
    public final void rule__FadeIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5471:1: ( ( ( rule__FadeIn__Group_3__0 )? ) )
            // InternalVideoMontage.g:5472:1: ( ( rule__FadeIn__Group_3__0 )? )
            {
            // InternalVideoMontage.g:5472:1: ( ( rule__FadeIn__Group_3__0 )? )
            // InternalVideoMontage.g:5473:2: ( rule__FadeIn__Group_3__0 )?
            {
             before(grammarAccess.getFadeInAccess().getGroup_3()); 
            // InternalVideoMontage.g:5474:2: ( rule__FadeIn__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalVideoMontage.g:5474:3: rule__FadeIn__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FadeIn__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFadeInAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__3__Impl"


    // $ANTLR start "rule__FadeIn__Group__4"
    // InternalVideoMontage.g:5482:1: rule__FadeIn__Group__4 : rule__FadeIn__Group__4__Impl ;
    public final void rule__FadeIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5486:1: ( rule__FadeIn__Group__4__Impl )
            // InternalVideoMontage.g:5487:2: rule__FadeIn__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__4"


    // $ANTLR start "rule__FadeIn__Group__4__Impl"
    // InternalVideoMontage.g:5493:1: rule__FadeIn__Group__4__Impl : ( '}' ) ;
    public final void rule__FadeIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5497:1: ( ( '}' ) )
            // InternalVideoMontage.g:5498:1: ( '}' )
            {
            // InternalVideoMontage.g:5498:1: ( '}' )
            // InternalVideoMontage.g:5499:2: '}'
            {
             before(grammarAccess.getFadeInAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group__4__Impl"


    // $ANTLR start "rule__FadeIn__Group_3__0"
    // InternalVideoMontage.g:5509:1: rule__FadeIn__Group_3__0 : rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1 ;
    public final void rule__FadeIn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5513:1: ( rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1 )
            // InternalVideoMontage.g:5514:2: rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__FadeIn__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeIn__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group_3__0"


    // $ANTLR start "rule__FadeIn__Group_3__0__Impl"
    // InternalVideoMontage.g:5521:1: rule__FadeIn__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__FadeIn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5525:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:5526:1: ( 'duration' )
            {
            // InternalVideoMontage.g:5526:1: ( 'duration' )
            // InternalVideoMontage.g:5527:2: 'duration'
            {
             before(grammarAccess.getFadeInAccess().getDurationKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFadeInAccess().getDurationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group_3__0__Impl"


    // $ANTLR start "rule__FadeIn__Group_3__1"
    // InternalVideoMontage.g:5536:1: rule__FadeIn__Group_3__1 : rule__FadeIn__Group_3__1__Impl ;
    public final void rule__FadeIn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5540:1: ( rule__FadeIn__Group_3__1__Impl )
            // InternalVideoMontage.g:5541:2: rule__FadeIn__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group_3__1"


    // $ANTLR start "rule__FadeIn__Group_3__1__Impl"
    // InternalVideoMontage.g:5547:1: rule__FadeIn__Group_3__1__Impl : ( ( rule__FadeIn__DurationAssignment_3_1 ) ) ;
    public final void rule__FadeIn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5551:1: ( ( ( rule__FadeIn__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:5552:1: ( ( rule__FadeIn__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:5552:1: ( ( rule__FadeIn__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:5553:2: ( rule__FadeIn__DurationAssignment_3_1 )
            {
             before(grammarAccess.getFadeInAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:5554:2: ( rule__FadeIn__DurationAssignment_3_1 )
            // InternalVideoMontage.g:5554:3: rule__FadeIn__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FadeIn__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFadeInAccess().getDurationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__Group_3__1__Impl"


    // $ANTLR start "rule__FadeOut__Group__0"
    // InternalVideoMontage.g:5563:1: rule__FadeOut__Group__0 : rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 ;
    public final void rule__FadeOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5567:1: ( rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 )
            // InternalVideoMontage.g:5568:2: rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__FadeOut__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__0"


    // $ANTLR start "rule__FadeOut__Group__0__Impl"
    // InternalVideoMontage.g:5575:1: rule__FadeOut__Group__0__Impl : ( () ) ;
    public final void rule__FadeOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5579:1: ( ( () ) )
            // InternalVideoMontage.g:5580:1: ( () )
            {
            // InternalVideoMontage.g:5580:1: ( () )
            // InternalVideoMontage.g:5581:2: ()
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutAction_0()); 
            // InternalVideoMontage.g:5582:2: ()
            // InternalVideoMontage.g:5582:3: 
            {
            }

             after(grammarAccess.getFadeOutAccess().getFadeOutAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__0__Impl"


    // $ANTLR start "rule__FadeOut__Group__1"
    // InternalVideoMontage.g:5590:1: rule__FadeOut__Group__1 : rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 ;
    public final void rule__FadeOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5594:1: ( rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 )
            // InternalVideoMontage.g:5595:2: rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__FadeOut__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__1"


    // $ANTLR start "rule__FadeOut__Group__1__Impl"
    // InternalVideoMontage.g:5602:1: rule__FadeOut__Group__1__Impl : ( 'FadeOut' ) ;
    public final void rule__FadeOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5606:1: ( ( 'FadeOut' ) )
            // InternalVideoMontage.g:5607:1: ( 'FadeOut' )
            {
            // InternalVideoMontage.g:5607:1: ( 'FadeOut' )
            // InternalVideoMontage.g:5608:2: 'FadeOut'
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getFadeOutKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__1__Impl"


    // $ANTLR start "rule__FadeOut__Group__2"
    // InternalVideoMontage.g:5617:1: rule__FadeOut__Group__2 : rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 ;
    public final void rule__FadeOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5621:1: ( rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 )
            // InternalVideoMontage.g:5622:2: rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3
            {
            pushFollow(FOLLOW_47);
            rule__FadeOut__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__2"


    // $ANTLR start "rule__FadeOut__Group__2__Impl"
    // InternalVideoMontage.g:5629:1: rule__FadeOut__Group__2__Impl : ( '{' ) ;
    public final void rule__FadeOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5633:1: ( ( '{' ) )
            // InternalVideoMontage.g:5634:1: ( '{' )
            {
            // InternalVideoMontage.g:5634:1: ( '{' )
            // InternalVideoMontage.g:5635:2: '{'
            {
             before(grammarAccess.getFadeOutAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__2__Impl"


    // $ANTLR start "rule__FadeOut__Group__3"
    // InternalVideoMontage.g:5644:1: rule__FadeOut__Group__3 : rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 ;
    public final void rule__FadeOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5648:1: ( rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 )
            // InternalVideoMontage.g:5649:2: rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4
            {
            pushFollow(FOLLOW_47);
            rule__FadeOut__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__3"


    // $ANTLR start "rule__FadeOut__Group__3__Impl"
    // InternalVideoMontage.g:5656:1: rule__FadeOut__Group__3__Impl : ( ( rule__FadeOut__Group_3__0 )? ) ;
    public final void rule__FadeOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5660:1: ( ( ( rule__FadeOut__Group_3__0 )? ) )
            // InternalVideoMontage.g:5661:1: ( ( rule__FadeOut__Group_3__0 )? )
            {
            // InternalVideoMontage.g:5661:1: ( ( rule__FadeOut__Group_3__0 )? )
            // InternalVideoMontage.g:5662:2: ( rule__FadeOut__Group_3__0 )?
            {
             before(grammarAccess.getFadeOutAccess().getGroup_3()); 
            // InternalVideoMontage.g:5663:2: ( rule__FadeOut__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==28) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalVideoMontage.g:5663:3: rule__FadeOut__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FadeOut__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFadeOutAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__3__Impl"


    // $ANTLR start "rule__FadeOut__Group__4"
    // InternalVideoMontage.g:5671:1: rule__FadeOut__Group__4 : rule__FadeOut__Group__4__Impl ;
    public final void rule__FadeOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5675:1: ( rule__FadeOut__Group__4__Impl )
            // InternalVideoMontage.g:5676:2: rule__FadeOut__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__4"


    // $ANTLR start "rule__FadeOut__Group__4__Impl"
    // InternalVideoMontage.g:5682:1: rule__FadeOut__Group__4__Impl : ( '}' ) ;
    public final void rule__FadeOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5686:1: ( ( '}' ) )
            // InternalVideoMontage.g:5687:1: ( '}' )
            {
            // InternalVideoMontage.g:5687:1: ( '}' )
            // InternalVideoMontage.g:5688:2: '}'
            {
             before(grammarAccess.getFadeOutAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group__4__Impl"


    // $ANTLR start "rule__FadeOut__Group_3__0"
    // InternalVideoMontage.g:5698:1: rule__FadeOut__Group_3__0 : rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1 ;
    public final void rule__FadeOut__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5702:1: ( rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1 )
            // InternalVideoMontage.g:5703:2: rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__FadeOut__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FadeOut__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group_3__0"


    // $ANTLR start "rule__FadeOut__Group_3__0__Impl"
    // InternalVideoMontage.g:5710:1: rule__FadeOut__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__FadeOut__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5714:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:5715:1: ( 'duration' )
            {
            // InternalVideoMontage.g:5715:1: ( 'duration' )
            // InternalVideoMontage.g:5716:2: 'duration'
            {
             before(grammarAccess.getFadeOutAccess().getDurationKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFadeOutAccess().getDurationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group_3__0__Impl"


    // $ANTLR start "rule__FadeOut__Group_3__1"
    // InternalVideoMontage.g:5725:1: rule__FadeOut__Group_3__1 : rule__FadeOut__Group_3__1__Impl ;
    public final void rule__FadeOut__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5729:1: ( rule__FadeOut__Group_3__1__Impl )
            // InternalVideoMontage.g:5730:2: rule__FadeOut__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group_3__1"


    // $ANTLR start "rule__FadeOut__Group_3__1__Impl"
    // InternalVideoMontage.g:5736:1: rule__FadeOut__Group_3__1__Impl : ( ( rule__FadeOut__DurationAssignment_3_1 ) ) ;
    public final void rule__FadeOut__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5740:1: ( ( ( rule__FadeOut__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:5741:1: ( ( rule__FadeOut__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:5741:1: ( ( rule__FadeOut__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:5742:2: ( rule__FadeOut__DurationAssignment_3_1 )
            {
             before(grammarAccess.getFadeOutAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:5743:2: ( rule__FadeOut__DurationAssignment_3_1 )
            // InternalVideoMontage.g:5743:3: rule__FadeOut__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FadeOut__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFadeOutAccess().getDurationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__Group_3__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalVideoMontage.g:5752:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5756:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalVideoMontage.g:5757:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalVideoMontage.g:5764:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5768:1: ( ( ( '-' )? ) )
            // InternalVideoMontage.g:5769:1: ( ( '-' )? )
            {
            // InternalVideoMontage.g:5769:1: ( ( '-' )? )
            // InternalVideoMontage.g:5770:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalVideoMontage.g:5771:2: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==16) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalVideoMontage.g:5771:3: '-'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalVideoMontage.g:5779:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5783:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalVideoMontage.g:5784:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalVideoMontage.g:5791:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5795:1: ( ( ( RULE_INT )? ) )
            // InternalVideoMontage.g:5796:1: ( ( RULE_INT )? )
            {
            // InternalVideoMontage.g:5796:1: ( ( RULE_INT )? )
            // InternalVideoMontage.g:5797:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalVideoMontage.g:5798:2: ( RULE_INT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_INT) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalVideoMontage.g:5798:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalVideoMontage.g:5806:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5810:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalVideoMontage.g:5811:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalVideoMontage.g:5818:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5822:1: ( ( '.' ) )
            // InternalVideoMontage.g:5823:1: ( '.' )
            {
            // InternalVideoMontage.g:5823:1: ( '.' )
            // InternalVideoMontage.g:5824:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalVideoMontage.g:5833:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5837:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalVideoMontage.g:5838:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_49);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalVideoMontage.g:5845:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5849:1: ( ( RULE_INT ) )
            // InternalVideoMontage.g:5850:1: ( RULE_INT )
            {
            // InternalVideoMontage.g:5850:1: ( RULE_INT )
            // InternalVideoMontage.g:5851:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalVideoMontage.g:5860:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5864:1: ( rule__EDouble__Group__4__Impl )
            // InternalVideoMontage.g:5865:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalVideoMontage.g:5871:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5875:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalVideoMontage.g:5876:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalVideoMontage.g:5876:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalVideoMontage.g:5877:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalVideoMontage.g:5878:2: ( rule__EDouble__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=13 && LA49_0<=14)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalVideoMontage.g:5878:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalVideoMontage.g:5887:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5891:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalVideoMontage.g:5892:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_41);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalVideoMontage.g:5899:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5903:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalVideoMontage.g:5904:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalVideoMontage.g:5904:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalVideoMontage.g:5905:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalVideoMontage.g:5906:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalVideoMontage.g:5906:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalVideoMontage.g:5914:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5918:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalVideoMontage.g:5919:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_41);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalVideoMontage.g:5926:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5930:1: ( ( ( '-' )? ) )
            // InternalVideoMontage.g:5931:1: ( ( '-' )? )
            {
            // InternalVideoMontage.g:5931:1: ( ( '-' )? )
            // InternalVideoMontage.g:5932:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalVideoMontage.g:5933:2: ( '-' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==16) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalVideoMontage.g:5933:3: '-'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalVideoMontage.g:5941:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5945:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalVideoMontage.g:5946:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalVideoMontage.g:5952:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5956:1: ( ( RULE_INT ) )
            // InternalVideoMontage.g:5957:1: ( RULE_INT )
            {
            // InternalVideoMontage.g:5957:1: ( RULE_INT )
            // InternalVideoMontage.g:5958:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalVideoMontage.g:5968:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5972:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalVideoMontage.g:5973:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalVideoMontage.g:5980:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5984:1: ( ( ( '-' )? ) )
            // InternalVideoMontage.g:5985:1: ( ( '-' )? )
            {
            // InternalVideoMontage.g:5985:1: ( ( '-' )? )
            // InternalVideoMontage.g:5986:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalVideoMontage.g:5987:2: ( '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==16) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalVideoMontage.g:5987:3: '-'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalVideoMontage.g:5995:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5999:1: ( rule__EInt__Group__1__Impl )
            // InternalVideoMontage.g:6000:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalVideoMontage.g:6006:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6010:1: ( ( RULE_INT ) )
            // InternalVideoMontage.g:6011:1: ( RULE_INT )
            {
            // InternalVideoMontage.g:6011:1: ( RULE_INT )
            // InternalVideoMontage.g:6012:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Movie__TitleAssignment_1"
    // InternalVideoMontage.g:6022:1: rule__Movie__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__Movie__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6026:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6027:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6027:2: ( ruleEString )
            // InternalVideoMontage.g:6028:3: ruleEString
            {
             before(grammarAccess.getMovieAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getTitleEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__TitleAssignment_1"


    // $ANTLR start "rule__Movie__VideoelementAssignment_3"
    // InternalVideoMontage.g:6037:1: rule__Movie__VideoelementAssignment_3 : ( ruleVideoElement ) ;
    public final void rule__Movie__VideoelementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6041:1: ( ( ruleVideoElement ) )
            // InternalVideoMontage.g:6042:2: ( ruleVideoElement )
            {
            // InternalVideoMontage.g:6042:2: ( ruleVideoElement )
            // InternalVideoMontage.g:6043:3: ruleVideoElement
            {
             before(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoElement();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__VideoelementAssignment_3"


    // $ANTLR start "rule__Movie__VideoelementAssignment_4"
    // InternalVideoMontage.g:6052:1: rule__Movie__VideoelementAssignment_4 : ( ruleVideoElement ) ;
    public final void rule__Movie__VideoelementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6056:1: ( ( ruleVideoElement ) )
            // InternalVideoMontage.g:6057:2: ( ruleVideoElement )
            {
            // InternalVideoMontage.g:6057:2: ( ruleVideoElement )
            // InternalVideoMontage.g:6058:3: ruleVideoElement
            {
             before(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoElement();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__VideoelementAssignment_4"


    // $ANTLR start "rule__Movie__AudioelementAssignment_5"
    // InternalVideoMontage.g:6067:1: rule__Movie__AudioelementAssignment_5 : ( ruleAudioElement ) ;
    public final void rule__Movie__AudioelementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6071:1: ( ( ruleAudioElement ) )
            // InternalVideoMontage.g:6072:2: ( ruleAudioElement )
            {
            // InternalVideoMontage.g:6072:2: ( ruleAudioElement )
            // InternalVideoMontage.g:6073:3: ruleAudioElement
            {
             before(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAudioElement();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__AudioelementAssignment_5"


    // $ANTLR start "rule__Movie__AudioelementAssignment_6"
    // InternalVideoMontage.g:6082:1: rule__Movie__AudioelementAssignment_6 : ( ruleAudioElement ) ;
    public final void rule__Movie__AudioelementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6086:1: ( ( ruleAudioElement ) )
            // InternalVideoMontage.g:6087:2: ( ruleAudioElement )
            {
            // InternalVideoMontage.g:6087:2: ( ruleAudioElement )
            // InternalVideoMontage.g:6088:3: ruleAudioElement
            {
             before(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAudioElement();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__AudioelementAssignment_6"


    // $ANTLR start "rule__Movie__SubtitleAssignment_7"
    // InternalVideoMontage.g:6097:1: rule__Movie__SubtitleAssignment_7 : ( ruleSubtitle ) ;
    public final void rule__Movie__SubtitleAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6101:1: ( ( ruleSubtitle ) )
            // InternalVideoMontage.g:6102:2: ( ruleSubtitle )
            {
            // InternalVideoMontage.g:6102:2: ( ruleSubtitle )
            // InternalVideoMontage.g:6103:3: ruleSubtitle
            {
             before(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtitle();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__SubtitleAssignment_7"


    // $ANTLR start "rule__Movie__SubtitleAssignment_8"
    // InternalVideoMontage.g:6112:1: rule__Movie__SubtitleAssignment_8 : ( ruleSubtitle ) ;
    public final void rule__Movie__SubtitleAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6116:1: ( ( ruleSubtitle ) )
            // InternalVideoMontage.g:6117:2: ( ruleSubtitle )
            {
            // InternalVideoMontage.g:6117:2: ( ruleSubtitle )
            // InternalVideoMontage.g:6118:3: ruleSubtitle
            {
             before(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtitle();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__SubtitleAssignment_8"


    // $ANTLR start "rule__Subtitle__StartingmomentAssignment_3"
    // InternalVideoMontage.g:6127:1: rule__Subtitle__StartingmomentAssignment_3 : ( ruleStartingMoment ) ;
    public final void rule__Subtitle__StartingmomentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6131:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontage.g:6132:2: ( ruleStartingMoment )
            {
            // InternalVideoMontage.g:6132:2: ( ruleStartingMoment )
            // InternalVideoMontage.g:6133:3: ruleStartingMoment
            {
             before(grammarAccess.getSubtitleAccess().getStartingmomentStartingMomentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStartingMoment();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getStartingmomentStartingMomentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__StartingmomentAssignment_3"


    // $ANTLR start "rule__Subtitle__DurationAssignment_5_1"
    // InternalVideoMontage.g:6142:1: rule__Subtitle__DurationAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__Subtitle__DurationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6146:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6147:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6147:2: ( ruleEDouble )
            // InternalVideoMontage.g:6148:3: ruleEDouble
            {
             before(grammarAccess.getSubtitleAccess().getDurationEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getDurationEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__DurationAssignment_5_1"


    // $ANTLR start "rule__Subtitle__TextareaAssignment_7"
    // InternalVideoMontage.g:6157:1: rule__Subtitle__TextareaAssignment_7 : ( ruleTextArea ) ;
    public final void rule__Subtitle__TextareaAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6161:1: ( ( ruleTextArea ) )
            // InternalVideoMontage.g:6162:2: ( ruleTextArea )
            {
            // InternalVideoMontage.g:6162:2: ( ruleTextArea )
            // InternalVideoMontage.g:6163:3: ruleTextArea
            {
             before(grammarAccess.getSubtitleAccess().getTextareaTextAreaParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTextArea();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getTextareaTextAreaParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__TextareaAssignment_7"


    // $ANTLR start "rule__Audio__NameAssignment_1"
    // InternalVideoMontage.g:6172:1: rule__Audio__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Audio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6176:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6177:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6177:2: ( ruleEString )
            // InternalVideoMontage.g:6178:3: ruleEString
            {
             before(grammarAccess.getAudioAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__NameAssignment_1"


    // $ANTLR start "rule__Audio__StartingmomentAssignment_4"
    // InternalVideoMontage.g:6187:1: rule__Audio__StartingmomentAssignment_4 : ( ruleStartingMoment ) ;
    public final void rule__Audio__StartingmomentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6191:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontage.g:6192:2: ( ruleStartingMoment )
            {
            // InternalVideoMontage.g:6192:2: ( ruleStartingMoment )
            // InternalVideoMontage.g:6193:3: ruleStartingMoment
            {
             before(grammarAccess.getAudioAccess().getStartingmomentStartingMomentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStartingMoment();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getStartingmomentStartingMomentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__StartingmomentAssignment_4"


    // $ANTLR start "rule__Audio__PathAssignment_6_1"
    // InternalVideoMontage.g:6202:1: rule__Audio__PathAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Audio__PathAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6206:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6207:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6207:2: ( ruleEString )
            // InternalVideoMontage.g:6208:3: ruleEString
            {
             before(grammarAccess.getAudioAccess().getPathEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getPathEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__PathAssignment_6_1"


    // $ANTLR start "rule__Audio__TransitionAssignment_7_1"
    // InternalVideoMontage.g:6217:1: rule__Audio__TransitionAssignment_7_1 : ( ruleTransition ) ;
    public final void rule__Audio__TransitionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6221:1: ( ( ruleTransition ) )
            // InternalVideoMontage.g:6222:2: ( ruleTransition )
            {
            // InternalVideoMontage.g:6222:2: ( ruleTransition )
            // InternalVideoMontage.g:6223:3: ruleTransition
            {
             before(grammarAccess.getAudioAccess().getTransitionTransitionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getTransitionTransitionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__TransitionAssignment_7_1"


    // $ANTLR start "rule__AudioClip__NameAssignment_1"
    // InternalVideoMontage.g:6232:1: rule__AudioClip__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AudioClip__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6236:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6237:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6237:2: ( ruleEString )
            // InternalVideoMontage.g:6238:3: ruleEString
            {
             before(grammarAccess.getAudioClipAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__NameAssignment_1"


    // $ANTLR start "rule__AudioClip__StartingmomentAssignment_4"
    // InternalVideoMontage.g:6247:1: rule__AudioClip__StartingmomentAssignment_4 : ( ruleStartingMoment ) ;
    public final void rule__AudioClip__StartingmomentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6251:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontage.g:6252:2: ( ruleStartingMoment )
            {
            // InternalVideoMontage.g:6252:2: ( ruleStartingMoment )
            // InternalVideoMontage.g:6253:3: ruleStartingMoment
            {
             before(grammarAccess.getAudioClipAccess().getStartingmomentStartingMomentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStartingMoment();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getStartingmomentStartingMomentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__StartingmomentAssignment_4"


    // $ANTLR start "rule__AudioClip__VolumeAssignment_6_1"
    // InternalVideoMontage.g:6262:1: rule__AudioClip__VolumeAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__VolumeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6266:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6267:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6267:2: ( ruleEDouble )
            // InternalVideoMontage.g:6268:3: ruleEDouble
            {
             before(grammarAccess.getAudioClipAccess().getVolumeEDoubleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getVolumeEDoubleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__VolumeAssignment_6_1"


    // $ANTLR start "rule__AudioClip__StartCutAssignment_7_1"
    // InternalVideoMontage.g:6277:1: rule__AudioClip__StartCutAssignment_7_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__StartCutAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6281:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6282:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6282:2: ( ruleEDouble )
            // InternalVideoMontage.g:6283:3: ruleEDouble
            {
             before(grammarAccess.getAudioClipAccess().getStartCutEDoubleParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getStartCutEDoubleParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__StartCutAssignment_7_1"


    // $ANTLR start "rule__AudioClip__EndCutAssignment_8_1"
    // InternalVideoMontage.g:6292:1: rule__AudioClip__EndCutAssignment_8_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__EndCutAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6296:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6297:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6297:2: ( ruleEDouble )
            // InternalVideoMontage.g:6298:3: ruleEDouble
            {
             before(grammarAccess.getAudioClipAccess().getEndCutEDoubleParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getEndCutEDoubleParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__EndCutAssignment_8_1"


    // $ANTLR start "rule__AudioClip__TransitionAssignment_9_1"
    // InternalVideoMontage.g:6307:1: rule__AudioClip__TransitionAssignment_9_1 : ( ruleTransition ) ;
    public final void rule__AudioClip__TransitionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6311:1: ( ( ruleTransition ) )
            // InternalVideoMontage.g:6312:2: ( ruleTransition )
            {
            // InternalVideoMontage.g:6312:2: ( ruleTransition )
            // InternalVideoMontage.g:6313:3: ruleTransition
            {
             before(grammarAccess.getAudioClipAccess().getTransitionTransitionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getTransitionTransitionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__TransitionAssignment_9_1"


    // $ANTLR start "rule__AudioClip__AudioAssignment_10_1"
    // InternalVideoMontage.g:6322:1: rule__AudioClip__AudioAssignment_10_1 : ( ruleAudio ) ;
    public final void rule__AudioClip__AudioAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6326:1: ( ( ruleAudio ) )
            // InternalVideoMontage.g:6327:2: ( ruleAudio )
            {
            // InternalVideoMontage.g:6327:2: ( ruleAudio )
            // InternalVideoMontage.g:6328:3: ruleAudio
            {
             before(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAudio();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__AudioAssignment_10_1"


    // $ANTLR start "rule__AudioClip__AudioAssignment_10_2"
    // InternalVideoMontage.g:6337:1: rule__AudioClip__AudioAssignment_10_2 : ( ruleAudio ) ;
    public final void rule__AudioClip__AudioAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6341:1: ( ( ruleAudio ) )
            // InternalVideoMontage.g:6342:2: ( ruleAudio )
            {
            // InternalVideoMontage.g:6342:2: ( ruleAudio )
            // InternalVideoMontage.g:6343:3: ruleAudio
            {
             before(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAudio();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__AudioAssignment_10_2"


    // $ANTLR start "rule__Clip__NameAssignment_1"
    // InternalVideoMontage.g:6352:1: rule__Clip__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Clip__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6356:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6357:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6357:2: ( ruleEString )
            // InternalVideoMontage.g:6358:3: ruleEString
            {
             before(grammarAccess.getClipAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClipAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__NameAssignment_1"


    // $ANTLR start "rule__Clip__StartCutAssignment_3_1"
    // InternalVideoMontage.g:6367:1: rule__Clip__StartCutAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Clip__StartCutAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6371:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6372:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6372:2: ( ruleEString )
            // InternalVideoMontage.g:6373:3: ruleEString
            {
             before(grammarAccess.getClipAccess().getStartCutEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClipAccess().getStartCutEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__StartCutAssignment_3_1"


    // $ANTLR start "rule__Clip__EndCutAssignment_4_1"
    // InternalVideoMontage.g:6382:1: rule__Clip__EndCutAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Clip__EndCutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6386:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6387:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6387:2: ( ruleEString )
            // InternalVideoMontage.g:6388:3: ruleEString
            {
             before(grammarAccess.getClipAccess().getEndCutEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClipAccess().getEndCutEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__EndCutAssignment_4_1"


    // $ANTLR start "rule__Clip__VideoAssignment_5_1"
    // InternalVideoMontage.g:6397:1: rule__Clip__VideoAssignment_5_1 : ( ruleVideo ) ;
    public final void rule__Clip__VideoAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6401:1: ( ( ruleVideo ) )
            // InternalVideoMontage.g:6402:2: ( ruleVideo )
            {
            // InternalVideoMontage.g:6402:2: ( ruleVideo )
            // InternalVideoMontage.g:6403:3: ruleVideo
            {
             before(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__VideoAssignment_5_1"


    // $ANTLR start "rule__Clip__VideoAssignment_5_2"
    // InternalVideoMontage.g:6412:1: rule__Clip__VideoAssignment_5_2 : ( ruleVideo ) ;
    public final void rule__Clip__VideoAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6416:1: ( ( ruleVideo ) )
            // InternalVideoMontage.g:6417:2: ( ruleVideo )
            {
            // InternalVideoMontage.g:6417:2: ( ruleVideo )
            // InternalVideoMontage.g:6418:3: ruleVideo
            {
             before(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__VideoAssignment_5_2"


    // $ANTLR start "rule__Video__NameAssignment_0"
    // InternalVideoMontage.g:6427:1: rule__Video__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6431:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6432:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6432:2: ( ruleEString )
            // InternalVideoMontage.g:6433:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__NameAssignment_0"


    // $ANTLR start "rule__Video__PathAssignment_1_1"
    // InternalVideoMontage.g:6442:1: rule__Video__PathAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Video__PathAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6446:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6447:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6447:2: ( ruleEString )
            // InternalVideoMontage.g:6448:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getPathEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getPathEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__PathAssignment_1_1"


    // $ANTLR start "rule__RelativeMoment__MomentAssignment_1"
    // InternalVideoMontage.g:6457:1: rule__RelativeMoment__MomentAssignment_1 : ( ruleMoment ) ;
    public final void rule__RelativeMoment__MomentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6461:1: ( ( ruleMoment ) )
            // InternalVideoMontage.g:6462:2: ( ruleMoment )
            {
            // InternalVideoMontage.g:6462:2: ( ruleMoment )
            // InternalVideoMontage.g:6463:3: ruleMoment
            {
             before(grammarAccess.getRelativeMomentAccess().getMomentMomentEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMoment();

            state._fsp--;

             after(grammarAccess.getRelativeMomentAccess().getMomentMomentEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__MomentAssignment_1"


    // $ANTLR start "rule__RelativeMoment__ElementAssignment_4"
    // InternalVideoMontage.g:6472:1: rule__RelativeMoment__ElementAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__RelativeMoment__ElementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6476:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontage.g:6477:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontage.g:6477:2: ( ( RULE_ID ) )
            // InternalVideoMontage.g:6478:3: ( RULE_ID )
            {
             before(grammarAccess.getRelativeMomentAccess().getElementElementCrossReference_4_0()); 
            // InternalVideoMontage.g:6479:3: ( RULE_ID )
            // InternalVideoMontage.g:6480:4: RULE_ID
            {
             before(grammarAccess.getRelativeMomentAccess().getElementElementIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelativeMomentAccess().getElementElementIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelativeMomentAccess().getElementElementCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__ElementAssignment_4"


    // $ANTLR start "rule__RelativeMoment__OperationMomentAssignment_5"
    // InternalVideoMontage.g:6491:1: rule__RelativeMoment__OperationMomentAssignment_5 : ( ruleOperationMoment ) ;
    public final void rule__RelativeMoment__OperationMomentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6495:1: ( ( ruleOperationMoment ) )
            // InternalVideoMontage.g:6496:2: ( ruleOperationMoment )
            {
            // InternalVideoMontage.g:6496:2: ( ruleOperationMoment )
            // InternalVideoMontage.g:6497:3: ruleOperationMoment
            {
             before(grammarAccess.getRelativeMomentAccess().getOperationMomentOperationMomentEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationMoment();

            state._fsp--;

             after(grammarAccess.getRelativeMomentAccess().getOperationMomentOperationMomentEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__OperationMomentAssignment_5"


    // $ANTLR start "rule__RelativeMoment__ValueAssignment_6"
    // InternalVideoMontage.g:6506:1: rule__RelativeMoment__ValueAssignment_6 : ( ruleEDouble ) ;
    public final void rule__RelativeMoment__ValueAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6510:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6511:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6511:2: ( ruleEDouble )
            // InternalVideoMontage.g:6512:3: ruleEDouble
            {
             before(grammarAccess.getRelativeMomentAccess().getValueEDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRelativeMomentAccess().getValueEDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__ValueAssignment_6"


    // $ANTLR start "rule__AbsoluteMoment__TimeAssignment_1_1"
    // InternalVideoMontage.g:6521:1: rule__AbsoluteMoment__TimeAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__AbsoluteMoment__TimeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6525:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6526:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6526:2: ( ruleEDouble )
            // InternalVideoMontage.g:6527:3: ruleEDouble
            {
             before(grammarAccess.getAbsoluteMomentAccess().getTimeEDoubleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAbsoluteMomentAccess().getTimeEDoubleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__TimeAssignment_1_1"


    // $ANTLR start "rule__Transition__DurationAssignment_2_1"
    // InternalVideoMontage.g:6536:1: rule__Transition__DurationAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__Transition__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6540:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6541:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6541:2: ( ruleEDouble )
            // InternalVideoMontage.g:6542:3: ruleEDouble
            {
             before(grammarAccess.getTransitionAccess().getDurationEDoubleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getDurationEDoubleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__DurationAssignment_2_1"


    // $ANTLR start "rule__Transition__AudioelementAssignment_4"
    // InternalVideoMontage.g:6551:1: rule__Transition__AudioelementAssignment_4 : ( ruleAudioElement ) ;
    public final void rule__Transition__AudioelementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6555:1: ( ( ruleAudioElement ) )
            // InternalVideoMontage.g:6556:2: ( ruleAudioElement )
            {
            // InternalVideoMontage.g:6556:2: ( ruleAudioElement )
            // InternalVideoMontage.g:6557:3: ruleAudioElement
            {
             before(grammarAccess.getTransitionAccess().getAudioelementAudioElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAudioElement();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getAudioelementAudioElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__AudioelementAssignment_4"


    // $ANTLR start "rule__Title__DurationAssignment_2_1"
    // InternalVideoMontage.g:6566:1: rule__Title__DurationAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__Title__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6570:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6571:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6571:2: ( ruleEDouble )
            // InternalVideoMontage.g:6572:3: ruleEDouble
            {
             before(grammarAccess.getTitleAccess().getDurationEDoubleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getDurationEDoubleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__DurationAssignment_2_1"


    // $ANTLR start "rule__Title__BackgroundColorAssignment_3_1"
    // InternalVideoMontage.g:6581:1: rule__Title__BackgroundColorAssignment_3_1 : ( ruleColor ) ;
    public final void rule__Title__BackgroundColorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6585:1: ( ( ruleColor ) )
            // InternalVideoMontage.g:6586:2: ( ruleColor )
            {
            // InternalVideoMontage.g:6586:2: ( ruleColor )
            // InternalVideoMontage.g:6587:3: ruleColor
            {
             before(grammarAccess.getTitleAccess().getBackgroundColorColorEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getBackgroundColorColorEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__BackgroundColorAssignment_3_1"


    // $ANTLR start "rule__Title__TextareaAssignment_5"
    // InternalVideoMontage.g:6596:1: rule__Title__TextareaAssignment_5 : ( ruleTextArea ) ;
    public final void rule__Title__TextareaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6600:1: ( ( ruleTextArea ) )
            // InternalVideoMontage.g:6601:2: ( ruleTextArea )
            {
            // InternalVideoMontage.g:6601:2: ( ruleTextArea )
            // InternalVideoMontage.g:6602:3: ruleTextArea
            {
             before(grammarAccess.getTitleAccess().getTextareaTextAreaParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTextArea();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getTextareaTextAreaParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__TextareaAssignment_5"


    // $ANTLR start "rule__TextArea_Impl__XAssignment_2_1"
    // InternalVideoMontage.g:6611:1: rule__TextArea_Impl__XAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__TextArea_Impl__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6615:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:6616:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:6616:2: ( ruleEInt )
            // InternalVideoMontage.g:6617:3: ruleEInt
            {
             before(grammarAccess.getTextArea_ImplAccess().getXEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplAccess().getXEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__XAssignment_2_1"


    // $ANTLR start "rule__TextArea_Impl__YAssignment_3_1"
    // InternalVideoMontage.g:6626:1: rule__TextArea_Impl__YAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__TextArea_Impl__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6630:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:6631:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:6631:2: ( ruleEInt )
            // InternalVideoMontage.g:6632:3: ruleEInt
            {
             before(grammarAccess.getTextArea_ImplAccess().getYEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplAccess().getYEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__YAssignment_3_1"


    // $ANTLR start "rule__TextArea_Impl__WidthAssignment_4_1"
    // InternalVideoMontage.g:6641:1: rule__TextArea_Impl__WidthAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__TextArea_Impl__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6645:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6646:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6646:2: ( ruleEDouble )
            // InternalVideoMontage.g:6647:3: ruleEDouble
            {
             before(grammarAccess.getTextArea_ImplAccess().getWidthEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplAccess().getWidthEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__WidthAssignment_4_1"


    // $ANTLR start "rule__TextArea_Impl__HeightAssignment_5_1"
    // InternalVideoMontage.g:6656:1: rule__TextArea_Impl__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__TextArea_Impl__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6660:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6661:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6661:2: ( ruleEDouble )
            // InternalVideoMontage.g:6662:3: ruleEDouble
            {
             before(grammarAccess.getTextArea_ImplAccess().getHeightEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplAccess().getHeightEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__HeightAssignment_5_1"


    // $ANTLR start "rule__TextArea_Impl__TextAssignment_6_1"
    // InternalVideoMontage.g:6671:1: rule__TextArea_Impl__TextAssignment_6_1 : ( ruleEString ) ;
    public final void rule__TextArea_Impl__TextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6675:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6676:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6676:2: ( ruleEString )
            // InternalVideoMontage.g:6677:3: ruleEString
            {
             before(grammarAccess.getTextArea_ImplAccess().getTextEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplAccess().getTextEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__TextAssignment_6_1"


    // $ANTLR start "rule__TextArea_Impl__FontAssignment_7_1"
    // InternalVideoMontage.g:6686:1: rule__TextArea_Impl__FontAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__TextArea_Impl__FontAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6690:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontage.g:6691:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontage.g:6691:2: ( ( RULE_ID ) )
            // InternalVideoMontage.g:6692:3: ( RULE_ID )
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontFontCrossReference_7_1_0()); 
            // InternalVideoMontage.g:6693:3: ( RULE_ID )
            // InternalVideoMontage.g:6694:4: RULE_ID
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontFontIDTerminalRuleCall_7_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getFontFontIDTerminalRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getTextArea_ImplAccess().getFontFontCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__FontAssignment_7_1"


    // $ANTLR start "rule__TextArea_Impl__AnimationAssignment_8_1"
    // InternalVideoMontage.g:6705:1: rule__TextArea_Impl__AnimationAssignment_8_1 : ( ruleAnimation ) ;
    public final void rule__TextArea_Impl__AnimationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6709:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:6710:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:6710:2: ( ruleAnimation )
            // InternalVideoMontage.g:6711:3: ruleAnimation
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__AnimationAssignment_8_1"


    // $ANTLR start "rule__TextArea_Impl__AnimationAssignment_8_2"
    // InternalVideoMontage.g:6720:1: rule__TextArea_Impl__AnimationAssignment_8_2 : ( ruleAnimation ) ;
    public final void rule__TextArea_Impl__AnimationAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6724:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:6725:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:6725:2: ( ruleAnimation )
            // InternalVideoMontage.g:6726:3: ruleAnimation
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__AnimationAssignment_8_2"


    // $ANTLR start "rule__TextAreaDynamic__XAssignment_2_1"
    // InternalVideoMontage.g:6735:1: rule__TextAreaDynamic__XAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6739:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:6740:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:6740:2: ( ruleEInt )
            // InternalVideoMontage.g:6741:3: ruleEInt
            {
             before(grammarAccess.getTextAreaDynamicAccess().getXEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getXEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__XAssignment_2_1"


    // $ANTLR start "rule__TextAreaDynamic__YAssignment_3_1"
    // InternalVideoMontage.g:6750:1: rule__TextAreaDynamic__YAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6754:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:6755:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:6755:2: ( ruleEInt )
            // InternalVideoMontage.g:6756:3: ruleEInt
            {
             before(grammarAccess.getTextAreaDynamicAccess().getYEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getYEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__YAssignment_3_1"


    // $ANTLR start "rule__TextAreaDynamic__WidthAssignment_4_1"
    // InternalVideoMontage.g:6765:1: rule__TextAreaDynamic__WidthAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__TextAreaDynamic__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6769:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6770:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6770:2: ( ruleEDouble )
            // InternalVideoMontage.g:6771:3: ruleEDouble
            {
             before(grammarAccess.getTextAreaDynamicAccess().getWidthEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getWidthEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__WidthAssignment_4_1"


    // $ANTLR start "rule__TextAreaDynamic__HeightAssignment_5_1"
    // InternalVideoMontage.g:6780:1: rule__TextAreaDynamic__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__TextAreaDynamic__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6784:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6785:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6785:2: ( ruleEDouble )
            // InternalVideoMontage.g:6786:3: ruleEDouble
            {
             before(grammarAccess.getTextAreaDynamicAccess().getHeightEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getHeightEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__HeightAssignment_5_1"


    // $ANTLR start "rule__TextAreaDynamic__TextAssignment_6_1"
    // InternalVideoMontage.g:6795:1: rule__TextAreaDynamic__TextAssignment_6_1 : ( ruleEString ) ;
    public final void rule__TextAreaDynamic__TextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6799:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6800:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6800:2: ( ruleEString )
            // InternalVideoMontage.g:6801:3: ruleEString
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getTextEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__TextAssignment_6_1"


    // $ANTLR start "rule__TextAreaDynamic__TextSrcAssignment_7_1"
    // InternalVideoMontage.g:6810:1: rule__TextAreaDynamic__TextSrcAssignment_7_1 : ( ruleEString ) ;
    public final void rule__TextAreaDynamic__TextSrcAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6814:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6815:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6815:2: ( ruleEString )
            // InternalVideoMontage.g:6816:3: ruleEString
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextSrcEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getTextSrcEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__TextSrcAssignment_7_1"


    // $ANTLR start "rule__TextAreaDynamic__LineAssignment_8_1"
    // InternalVideoMontage.g:6825:1: rule__TextAreaDynamic__LineAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__LineAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6829:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:6830:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:6830:2: ( ruleEInt )
            // InternalVideoMontage.g:6831:3: ruleEInt
            {
             before(grammarAccess.getTextAreaDynamicAccess().getLineEIntParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getLineEIntParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__LineAssignment_8_1"


    // $ANTLR start "rule__TextAreaDynamic__FontAssignment_10"
    // InternalVideoMontage.g:6840:1: rule__TextAreaDynamic__FontAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__TextAreaDynamic__FontAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6844:1: ( ( ( ruleEString ) ) )
            // InternalVideoMontage.g:6845:2: ( ( ruleEString ) )
            {
            // InternalVideoMontage.g:6845:2: ( ( ruleEString ) )
            // InternalVideoMontage.g:6846:3: ( ruleEString )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontFontCrossReference_10_0()); 
            // InternalVideoMontage.g:6847:3: ( ruleEString )
            // InternalVideoMontage.g:6848:4: ruleEString
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontFontEStringParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getFontFontEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getTextAreaDynamicAccess().getFontFontCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__FontAssignment_10"


    // $ANTLR start "rule__TextAreaDynamic__AnimationAssignment_11_1"
    // InternalVideoMontage.g:6859:1: rule__TextAreaDynamic__AnimationAssignment_11_1 : ( ruleAnimation ) ;
    public final void rule__TextAreaDynamic__AnimationAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6863:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:6864:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:6864:2: ( ruleAnimation )
            // InternalVideoMontage.g:6865:3: ruleAnimation
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__AnimationAssignment_11_1"


    // $ANTLR start "rule__TextAreaDynamic__AnimationAssignment_11_2"
    // InternalVideoMontage.g:6874:1: rule__TextAreaDynamic__AnimationAssignment_11_2 : ( ruleAnimation ) ;
    public final void rule__TextAreaDynamic__AnimationAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6878:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:6879:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:6879:2: ( ruleAnimation )
            // InternalVideoMontage.g:6880:3: ruleAnimation
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__AnimationAssignment_11_2"


    // $ANTLR start "rule__FadeIn__DurationAssignment_3_1"
    // InternalVideoMontage.g:6889:1: rule__FadeIn__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__FadeIn__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6893:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6894:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6894:2: ( ruleEDouble )
            // InternalVideoMontage.g:6895:3: ruleEDouble
            {
             before(grammarAccess.getFadeInAccess().getDurationEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getFadeInAccess().getDurationEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeIn__DurationAssignment_3_1"


    // $ANTLR start "rule__FadeOut__DurationAssignment_3_1"
    // InternalVideoMontage.g:6904:1: rule__FadeOut__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__FadeOut__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6908:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6909:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6909:2: ( ruleEDouble )
            // InternalVideoMontage.g:6910:3: ruleEDouble
            {
             before(grammarAccess.getFadeOutAccess().getDurationEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getFadeOutAccess().getDurationEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FadeOut__DurationAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000102000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000068000060000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0800000000010040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000C0200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004C00200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000102000000032L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000060000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000010400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200018000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0030000000200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x019F800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000006000L});

}