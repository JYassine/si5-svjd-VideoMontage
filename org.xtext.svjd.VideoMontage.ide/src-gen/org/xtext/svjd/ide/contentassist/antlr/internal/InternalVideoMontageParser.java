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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BLACK'", "'COMIC_SANS_MS'", "'E'", "'e'", "'+'", "'-'", "'starting'", "'ending'", "'Movie'", "'{'", "'}'", "'audioElement'", "'videoElement'", "'timeline'", "'Subtitle'", "'start'", "':'", "'textArea'", "'duration'", "'Audio'", "'path'", "'transition'", "'AudioClip'", "'audio'", "'volume'", "'startCut'", "'endCut'", "'Clip'", "'video'", "'Title'", "'backgroundColor'", "'of'", "'time'", "'StartingMoment'", "'Transition'", "'TextArea'", "'x'", "'y'", "'width'", "'height'", "'text'", "'font'", "'animation'", "'TextAreaDynamic'", "'textSrc'", "'line'", "'FadeIn'", "'FadeOut'", "'.'"
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


    // $ANTLR start "entryRuleVideoTimeLine"
    // InternalVideoMontage.g:128:1: entryRuleVideoTimeLine : ruleVideoTimeLine EOF ;
    public final void entryRuleVideoTimeLine() throws RecognitionException {
        try {
            // InternalVideoMontage.g:129:1: ( ruleVideoTimeLine EOF )
            // InternalVideoMontage.g:130:1: ruleVideoTimeLine EOF
            {
             before(grammarAccess.getVideoTimeLineRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoTimeLine();

            state._fsp--;

             after(grammarAccess.getVideoTimeLineRule()); 
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
    // $ANTLR end "entryRuleVideoTimeLine"


    // $ANTLR start "ruleVideoTimeLine"
    // InternalVideoMontage.g:137:1: ruleVideoTimeLine : ( ( rule__VideoTimeLine__Group__0 ) ) ;
    public final void ruleVideoTimeLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:141:2: ( ( ( rule__VideoTimeLine__Group__0 ) ) )
            // InternalVideoMontage.g:142:2: ( ( rule__VideoTimeLine__Group__0 ) )
            {
            // InternalVideoMontage.g:142:2: ( ( rule__VideoTimeLine__Group__0 ) )
            // InternalVideoMontage.g:143:3: ( rule__VideoTimeLine__Group__0 )
            {
             before(grammarAccess.getVideoTimeLineAccess().getGroup()); 
            // InternalVideoMontage.g:144:3: ( rule__VideoTimeLine__Group__0 )
            // InternalVideoMontage.g:144:4: rule__VideoTimeLine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoTimeLine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoTimeLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoTimeLine"


    // $ANTLR start "entryRuleTextArea"
    // InternalVideoMontage.g:153:1: entryRuleTextArea : ruleTextArea EOF ;
    public final void entryRuleTextArea() throws RecognitionException {
        try {
            // InternalVideoMontage.g:154:1: ( ruleTextArea EOF )
            // InternalVideoMontage.g:155:1: ruleTextArea EOF
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
    // InternalVideoMontage.g:162:1: ruleTextArea : ( ( rule__TextArea__Alternatives ) ) ;
    public final void ruleTextArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:166:2: ( ( ( rule__TextArea__Alternatives ) ) )
            // InternalVideoMontage.g:167:2: ( ( rule__TextArea__Alternatives ) )
            {
            // InternalVideoMontage.g:167:2: ( ( rule__TextArea__Alternatives ) )
            // InternalVideoMontage.g:168:3: ( rule__TextArea__Alternatives )
            {
             before(grammarAccess.getTextAreaAccess().getAlternatives()); 
            // InternalVideoMontage.g:169:3: ( rule__TextArea__Alternatives )
            // InternalVideoMontage.g:169:4: rule__TextArea__Alternatives
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
    // InternalVideoMontage.g:178:1: entryRuleStartingMoment : ruleStartingMoment EOF ;
    public final void entryRuleStartingMoment() throws RecognitionException {
        try {
            // InternalVideoMontage.g:179:1: ( ruleStartingMoment EOF )
            // InternalVideoMontage.g:180:1: ruleStartingMoment EOF
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
    // InternalVideoMontage.g:187:1: ruleStartingMoment : ( ( rule__StartingMoment__Alternatives ) ) ;
    public final void ruleStartingMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:191:2: ( ( ( rule__StartingMoment__Alternatives ) ) )
            // InternalVideoMontage.g:192:2: ( ( rule__StartingMoment__Alternatives ) )
            {
            // InternalVideoMontage.g:192:2: ( ( rule__StartingMoment__Alternatives ) )
            // InternalVideoMontage.g:193:3: ( rule__StartingMoment__Alternatives )
            {
             before(grammarAccess.getStartingMomentAccess().getAlternatives()); 
            // InternalVideoMontage.g:194:3: ( rule__StartingMoment__Alternatives )
            // InternalVideoMontage.g:194:4: rule__StartingMoment__Alternatives
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
    // InternalVideoMontage.g:203:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalVideoMontage.g:204:1: ( ruleAnimation EOF )
            // InternalVideoMontage.g:205:1: ruleAnimation EOF
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
    // InternalVideoMontage.g:212:1: ruleAnimation : ( ( rule__Animation__Alternatives ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:216:2: ( ( ( rule__Animation__Alternatives ) ) )
            // InternalVideoMontage.g:217:2: ( ( rule__Animation__Alternatives ) )
            {
            // InternalVideoMontage.g:217:2: ( ( rule__Animation__Alternatives ) )
            // InternalVideoMontage.g:218:3: ( rule__Animation__Alternatives )
            {
             before(grammarAccess.getAnimationAccess().getAlternatives()); 
            // InternalVideoMontage.g:219:3: ( rule__Animation__Alternatives )
            // InternalVideoMontage.g:219:4: rule__Animation__Alternatives
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
    // InternalVideoMontage.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalVideoMontage.g:229:1: ( ruleEString EOF )
            // InternalVideoMontage.g:230:1: ruleEString EOF
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
    // InternalVideoMontage.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalVideoMontage.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalVideoMontage.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalVideoMontage.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalVideoMontage.g:244:3: ( rule__EString__Alternatives )
            // InternalVideoMontage.g:244:4: rule__EString__Alternatives
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
    // InternalVideoMontage.g:253:1: entryRuleSubtitle : ruleSubtitle EOF ;
    public final void entryRuleSubtitle() throws RecognitionException {
        try {
            // InternalVideoMontage.g:254:1: ( ruleSubtitle EOF )
            // InternalVideoMontage.g:255:1: ruleSubtitle EOF
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
    // InternalVideoMontage.g:262:1: ruleSubtitle : ( ( rule__Subtitle__Group__0 ) ) ;
    public final void ruleSubtitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:266:2: ( ( ( rule__Subtitle__Group__0 ) ) )
            // InternalVideoMontage.g:267:2: ( ( rule__Subtitle__Group__0 ) )
            {
            // InternalVideoMontage.g:267:2: ( ( rule__Subtitle__Group__0 ) )
            // InternalVideoMontage.g:268:3: ( rule__Subtitle__Group__0 )
            {
             before(grammarAccess.getSubtitleAccess().getGroup()); 
            // InternalVideoMontage.g:269:3: ( rule__Subtitle__Group__0 )
            // InternalVideoMontage.g:269:4: rule__Subtitle__Group__0
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
    // InternalVideoMontage.g:278:1: entryRuleAudio : ruleAudio EOF ;
    public final void entryRuleAudio() throws RecognitionException {
        try {
            // InternalVideoMontage.g:279:1: ( ruleAudio EOF )
            // InternalVideoMontage.g:280:1: ruleAudio EOF
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
    // InternalVideoMontage.g:287:1: ruleAudio : ( ( rule__Audio__Group__0 ) ) ;
    public final void ruleAudio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:291:2: ( ( ( rule__Audio__Group__0 ) ) )
            // InternalVideoMontage.g:292:2: ( ( rule__Audio__Group__0 ) )
            {
            // InternalVideoMontage.g:292:2: ( ( rule__Audio__Group__0 ) )
            // InternalVideoMontage.g:293:3: ( rule__Audio__Group__0 )
            {
             before(grammarAccess.getAudioAccess().getGroup()); 
            // InternalVideoMontage.g:294:3: ( rule__Audio__Group__0 )
            // InternalVideoMontage.g:294:4: rule__Audio__Group__0
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
    // InternalVideoMontage.g:303:1: entryRuleAudioClip : ruleAudioClip EOF ;
    public final void entryRuleAudioClip() throws RecognitionException {
        try {
            // InternalVideoMontage.g:304:1: ( ruleAudioClip EOF )
            // InternalVideoMontage.g:305:1: ruleAudioClip EOF
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
    // InternalVideoMontage.g:312:1: ruleAudioClip : ( ( rule__AudioClip__Group__0 ) ) ;
    public final void ruleAudioClip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:316:2: ( ( ( rule__AudioClip__Group__0 ) ) )
            // InternalVideoMontage.g:317:2: ( ( rule__AudioClip__Group__0 ) )
            {
            // InternalVideoMontage.g:317:2: ( ( rule__AudioClip__Group__0 ) )
            // InternalVideoMontage.g:318:3: ( rule__AudioClip__Group__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup()); 
            // InternalVideoMontage.g:319:3: ( rule__AudioClip__Group__0 )
            // InternalVideoMontage.g:319:4: rule__AudioClip__Group__0
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
    // InternalVideoMontage.g:328:1: entryRuleClip : ruleClip EOF ;
    public final void entryRuleClip() throws RecognitionException {
        try {
            // InternalVideoMontage.g:329:1: ( ruleClip EOF )
            // InternalVideoMontage.g:330:1: ruleClip EOF
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
    // InternalVideoMontage.g:337:1: ruleClip : ( ( rule__Clip__Group__0 ) ) ;
    public final void ruleClip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:341:2: ( ( ( rule__Clip__Group__0 ) ) )
            // InternalVideoMontage.g:342:2: ( ( rule__Clip__Group__0 ) )
            {
            // InternalVideoMontage.g:342:2: ( ( rule__Clip__Group__0 ) )
            // InternalVideoMontage.g:343:3: ( rule__Clip__Group__0 )
            {
             before(grammarAccess.getClipAccess().getGroup()); 
            // InternalVideoMontage.g:344:3: ( rule__Clip__Group__0 )
            // InternalVideoMontage.g:344:4: rule__Clip__Group__0
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


    // $ANTLR start "entryRuleTitle"
    // InternalVideoMontage.g:353:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalVideoMontage.g:354:1: ( ruleTitle EOF )
            // InternalVideoMontage.g:355:1: ruleTitle EOF
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
    // InternalVideoMontage.g:362:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:366:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalVideoMontage.g:367:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalVideoMontage.g:367:2: ( ( rule__Title__Group__0 ) )
            // InternalVideoMontage.g:368:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalVideoMontage.g:369:3: ( rule__Title__Group__0 )
            // InternalVideoMontage.g:369:4: rule__Title__Group__0
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


    // $ANTLR start "entryRuleVideo"
    // InternalVideoMontage.g:378:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalVideoMontage.g:379:1: ( ruleVideo EOF )
            // InternalVideoMontage.g:380:1: ruleVideo EOF
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
    // InternalVideoMontage.g:387:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:391:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalVideoMontage.g:392:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalVideoMontage.g:392:2: ( ( rule__Video__Group__0 ) )
            // InternalVideoMontage.g:393:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalVideoMontage.g:394:3: ( rule__Video__Group__0 )
            // InternalVideoMontage.g:394:4: rule__Video__Group__0
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
    // InternalVideoMontage.g:403:1: entryRuleRelativeMoment : ruleRelativeMoment EOF ;
    public final void entryRuleRelativeMoment() throws RecognitionException {
        try {
            // InternalVideoMontage.g:404:1: ( ruleRelativeMoment EOF )
            // InternalVideoMontage.g:405:1: ruleRelativeMoment EOF
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
    // InternalVideoMontage.g:412:1: ruleRelativeMoment : ( ( rule__RelativeMoment__Group__0 ) ) ;
    public final void ruleRelativeMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:416:2: ( ( ( rule__RelativeMoment__Group__0 ) ) )
            // InternalVideoMontage.g:417:2: ( ( rule__RelativeMoment__Group__0 ) )
            {
            // InternalVideoMontage.g:417:2: ( ( rule__RelativeMoment__Group__0 ) )
            // InternalVideoMontage.g:418:3: ( rule__RelativeMoment__Group__0 )
            {
             before(grammarAccess.getRelativeMomentAccess().getGroup()); 
            // InternalVideoMontage.g:419:3: ( rule__RelativeMoment__Group__0 )
            // InternalVideoMontage.g:419:4: rule__RelativeMoment__Group__0
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
    // InternalVideoMontage.g:428:1: entryRuleAbsoluteMoment : ruleAbsoluteMoment EOF ;
    public final void entryRuleAbsoluteMoment() throws RecognitionException {
        try {
            // InternalVideoMontage.g:429:1: ( ruleAbsoluteMoment EOF )
            // InternalVideoMontage.g:430:1: ruleAbsoluteMoment EOF
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
    // InternalVideoMontage.g:437:1: ruleAbsoluteMoment : ( ( rule__AbsoluteMoment__Group__0 ) ) ;
    public final void ruleAbsoluteMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:441:2: ( ( ( rule__AbsoluteMoment__Group__0 ) ) )
            // InternalVideoMontage.g:442:2: ( ( rule__AbsoluteMoment__Group__0 ) )
            {
            // InternalVideoMontage.g:442:2: ( ( rule__AbsoluteMoment__Group__0 ) )
            // InternalVideoMontage.g:443:3: ( rule__AbsoluteMoment__Group__0 )
            {
             before(grammarAccess.getAbsoluteMomentAccess().getGroup()); 
            // InternalVideoMontage.g:444:3: ( rule__AbsoluteMoment__Group__0 )
            // InternalVideoMontage.g:444:4: rule__AbsoluteMoment__Group__0
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
    // InternalVideoMontage.g:453:1: entryRuleStartingMoment_Impl : ruleStartingMoment_Impl EOF ;
    public final void entryRuleStartingMoment_Impl() throws RecognitionException {
        try {
            // InternalVideoMontage.g:454:1: ( ruleStartingMoment_Impl EOF )
            // InternalVideoMontage.g:455:1: ruleStartingMoment_Impl EOF
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
    // InternalVideoMontage.g:462:1: ruleStartingMoment_Impl : ( ( rule__StartingMoment_Impl__Group__0 ) ) ;
    public final void ruleStartingMoment_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:466:2: ( ( ( rule__StartingMoment_Impl__Group__0 ) ) )
            // InternalVideoMontage.g:467:2: ( ( rule__StartingMoment_Impl__Group__0 ) )
            {
            // InternalVideoMontage.g:467:2: ( ( rule__StartingMoment_Impl__Group__0 ) )
            // InternalVideoMontage.g:468:3: ( rule__StartingMoment_Impl__Group__0 )
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getGroup()); 
            // InternalVideoMontage.g:469:3: ( rule__StartingMoment_Impl__Group__0 )
            // InternalVideoMontage.g:469:4: rule__StartingMoment_Impl__Group__0
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
    // InternalVideoMontage.g:478:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalVideoMontage.g:479:1: ( ruleTransition EOF )
            // InternalVideoMontage.g:480:1: ruleTransition EOF
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
    // InternalVideoMontage.g:487:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:491:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalVideoMontage.g:492:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalVideoMontage.g:492:2: ( ( rule__Transition__Group__0 ) )
            // InternalVideoMontage.g:493:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalVideoMontage.g:494:3: ( rule__Transition__Group__0 )
            // InternalVideoMontage.g:494:4: rule__Transition__Group__0
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


    // $ANTLR start "entryRuleTextArea_Impl"
    // InternalVideoMontage.g:503:1: entryRuleTextArea_Impl : ruleTextArea_Impl EOF ;
    public final void entryRuleTextArea_Impl() throws RecognitionException {
        try {
            // InternalVideoMontage.g:504:1: ( ruleTextArea_Impl EOF )
            // InternalVideoMontage.g:505:1: ruleTextArea_Impl EOF
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
    // InternalVideoMontage.g:512:1: ruleTextArea_Impl : ( ( rule__TextArea_Impl__Group__0 ) ) ;
    public final void ruleTextArea_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:516:2: ( ( ( rule__TextArea_Impl__Group__0 ) ) )
            // InternalVideoMontage.g:517:2: ( ( rule__TextArea_Impl__Group__0 ) )
            {
            // InternalVideoMontage.g:517:2: ( ( rule__TextArea_Impl__Group__0 ) )
            // InternalVideoMontage.g:518:3: ( rule__TextArea_Impl__Group__0 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup()); 
            // InternalVideoMontage.g:519:3: ( rule__TextArea_Impl__Group__0 )
            // InternalVideoMontage.g:519:4: rule__TextArea_Impl__Group__0
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
    // InternalVideoMontage.g:528:1: entryRuleTextAreaDynamic : ruleTextAreaDynamic EOF ;
    public final void entryRuleTextAreaDynamic() throws RecognitionException {
        try {
            // InternalVideoMontage.g:529:1: ( ruleTextAreaDynamic EOF )
            // InternalVideoMontage.g:530:1: ruleTextAreaDynamic EOF
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
    // InternalVideoMontage.g:537:1: ruleTextAreaDynamic : ( ( rule__TextAreaDynamic__Group__0 ) ) ;
    public final void ruleTextAreaDynamic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:541:2: ( ( ( rule__TextAreaDynamic__Group__0 ) ) )
            // InternalVideoMontage.g:542:2: ( ( rule__TextAreaDynamic__Group__0 ) )
            {
            // InternalVideoMontage.g:542:2: ( ( rule__TextAreaDynamic__Group__0 ) )
            // InternalVideoMontage.g:543:3: ( rule__TextAreaDynamic__Group__0 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup()); 
            // InternalVideoMontage.g:544:3: ( rule__TextAreaDynamic__Group__0 )
            // InternalVideoMontage.g:544:4: rule__TextAreaDynamic__Group__0
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
    // InternalVideoMontage.g:553:1: entryRuleFadeIn : ruleFadeIn EOF ;
    public final void entryRuleFadeIn() throws RecognitionException {
        try {
            // InternalVideoMontage.g:554:1: ( ruleFadeIn EOF )
            // InternalVideoMontage.g:555:1: ruleFadeIn EOF
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
    // InternalVideoMontage.g:562:1: ruleFadeIn : ( ( rule__FadeIn__Group__0 ) ) ;
    public final void ruleFadeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:566:2: ( ( ( rule__FadeIn__Group__0 ) ) )
            // InternalVideoMontage.g:567:2: ( ( rule__FadeIn__Group__0 ) )
            {
            // InternalVideoMontage.g:567:2: ( ( rule__FadeIn__Group__0 ) )
            // InternalVideoMontage.g:568:3: ( rule__FadeIn__Group__0 )
            {
             before(grammarAccess.getFadeInAccess().getGroup()); 
            // InternalVideoMontage.g:569:3: ( rule__FadeIn__Group__0 )
            // InternalVideoMontage.g:569:4: rule__FadeIn__Group__0
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
    // InternalVideoMontage.g:578:1: entryRuleFadeOut : ruleFadeOut EOF ;
    public final void entryRuleFadeOut() throws RecognitionException {
        try {
            // InternalVideoMontage.g:579:1: ( ruleFadeOut EOF )
            // InternalVideoMontage.g:580:1: ruleFadeOut EOF
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
    // InternalVideoMontage.g:587:1: ruleFadeOut : ( ( rule__FadeOut__Group__0 ) ) ;
    public final void ruleFadeOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:591:2: ( ( ( rule__FadeOut__Group__0 ) ) )
            // InternalVideoMontage.g:592:2: ( ( rule__FadeOut__Group__0 ) )
            {
            // InternalVideoMontage.g:592:2: ( ( rule__FadeOut__Group__0 ) )
            // InternalVideoMontage.g:593:3: ( rule__FadeOut__Group__0 )
            {
             before(grammarAccess.getFadeOutAccess().getGroup()); 
            // InternalVideoMontage.g:594:3: ( rule__FadeOut__Group__0 )
            // InternalVideoMontage.g:594:4: rule__FadeOut__Group__0
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
    // InternalVideoMontage.g:603:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalVideoMontage.g:604:1: ( ruleEDouble EOF )
            // InternalVideoMontage.g:605:1: ruleEDouble EOF
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
    // InternalVideoMontage.g:612:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:616:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalVideoMontage.g:617:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalVideoMontage.g:617:2: ( ( rule__EDouble__Group__0 ) )
            // InternalVideoMontage.g:618:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalVideoMontage.g:619:3: ( rule__EDouble__Group__0 )
            // InternalVideoMontage.g:619:4: rule__EDouble__Group__0
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
    // InternalVideoMontage.g:628:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalVideoMontage.g:629:1: ( ruleEInt EOF )
            // InternalVideoMontage.g:630:1: ruleEInt EOF
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
    // InternalVideoMontage.g:637:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:641:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalVideoMontage.g:642:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalVideoMontage.g:642:2: ( ( rule__EInt__Group__0 ) )
            // InternalVideoMontage.g:643:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalVideoMontage.g:644:3: ( rule__EInt__Group__0 )
            // InternalVideoMontage.g:644:4: rule__EInt__Group__0
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
    // InternalVideoMontage.g:653:1: ruleOperationMoment : ( ( rule__OperationMoment__Alternatives ) ) ;
    public final void ruleOperationMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:657:1: ( ( ( rule__OperationMoment__Alternatives ) ) )
            // InternalVideoMontage.g:658:2: ( ( rule__OperationMoment__Alternatives ) )
            {
            // InternalVideoMontage.g:658:2: ( ( rule__OperationMoment__Alternatives ) )
            // InternalVideoMontage.g:659:3: ( rule__OperationMoment__Alternatives )
            {
             before(grammarAccess.getOperationMomentAccess().getAlternatives()); 
            // InternalVideoMontage.g:660:3: ( rule__OperationMoment__Alternatives )
            // InternalVideoMontage.g:660:4: rule__OperationMoment__Alternatives
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
    // InternalVideoMontage.g:669:1: ruleMoment : ( ( rule__Moment__Alternatives ) ) ;
    public final void ruleMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:673:1: ( ( ( rule__Moment__Alternatives ) ) )
            // InternalVideoMontage.g:674:2: ( ( rule__Moment__Alternatives ) )
            {
            // InternalVideoMontage.g:674:2: ( ( rule__Moment__Alternatives ) )
            // InternalVideoMontage.g:675:3: ( rule__Moment__Alternatives )
            {
             before(grammarAccess.getMomentAccess().getAlternatives()); 
            // InternalVideoMontage.g:676:3: ( rule__Moment__Alternatives )
            // InternalVideoMontage.g:676:4: rule__Moment__Alternatives
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
    // InternalVideoMontage.g:685:1: ruleColor : ( ( 'BLACK' ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:689:1: ( ( ( 'BLACK' ) ) )
            // InternalVideoMontage.g:690:2: ( ( 'BLACK' ) )
            {
            // InternalVideoMontage.g:690:2: ( ( 'BLACK' ) )
            // InternalVideoMontage.g:691:3: ( 'BLACK' )
            {
             before(grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration()); 
            // InternalVideoMontage.g:692:3: ( 'BLACK' )
            // InternalVideoMontage.g:692:4: 'BLACK'
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
    // InternalVideoMontage.g:701:1: ruleFontStyle : ( ( 'COMIC_SANS_MS' ) ) ;
    public final void ruleFontStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:705:1: ( ( ( 'COMIC_SANS_MS' ) ) )
            // InternalVideoMontage.g:706:2: ( ( 'COMIC_SANS_MS' ) )
            {
            // InternalVideoMontage.g:706:2: ( ( 'COMIC_SANS_MS' ) )
            // InternalVideoMontage.g:707:3: ( 'COMIC_SANS_MS' )
            {
             before(grammarAccess.getFontStyleAccess().getCOMIC_SANS_MSEnumLiteralDeclaration()); 
            // InternalVideoMontage.g:708:3: ( 'COMIC_SANS_MS' )
            // InternalVideoMontage.g:708:4: 'COMIC_SANS_MS'
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
    // InternalVideoMontage.g:716:1: rule__AudioElement__Alternatives_1 : ( ( ruleAudio ) | ( ruleAudioClip ) );
    public final void rule__AudioElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:720:1: ( ( ruleAudio ) | ( ruleAudioClip ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalVideoMontage.g:721:2: ( ruleAudio )
                    {
                    // InternalVideoMontage.g:721:2: ( ruleAudio )
                    // InternalVideoMontage.g:722:3: ruleAudio
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
                    // InternalVideoMontage.g:727:2: ( ruleAudioClip )
                    {
                    // InternalVideoMontage.g:727:2: ( ruleAudioClip )
                    // InternalVideoMontage.g:728:3: ruleAudioClip
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
    // InternalVideoMontage.g:737:1: rule__VideoElement__Alternatives_1 : ( ( ruleTitle ) | ( ruleClip ) | ( ruleVideo ) );
    public final void rule__VideoElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:741:1: ( ( ruleTitle ) | ( ruleClip ) | ( ruleVideo ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt2=1;
                }
                break;
            case 38:
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
                    // InternalVideoMontage.g:742:2: ( ruleTitle )
                    {
                    // InternalVideoMontage.g:742:2: ( ruleTitle )
                    // InternalVideoMontage.g:743:3: ruleTitle
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
                    // InternalVideoMontage.g:748:2: ( ruleClip )
                    {
                    // InternalVideoMontage.g:748:2: ( ruleClip )
                    // InternalVideoMontage.g:749:3: ruleClip
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
                    // InternalVideoMontage.g:754:2: ( ruleVideo )
                    {
                    // InternalVideoMontage.g:754:2: ( ruleVideo )
                    // InternalVideoMontage.g:755:3: ruleVideo
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
    // InternalVideoMontage.g:764:1: rule__TextArea__Alternatives : ( ( ruleTextArea_Impl ) | ( ruleTextAreaDynamic ) );
    public final void rule__TextArea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:768:1: ( ( ruleTextArea_Impl ) | ( ruleTextAreaDynamic ) )
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
                    // InternalVideoMontage.g:769:2: ( ruleTextArea_Impl )
                    {
                    // InternalVideoMontage.g:769:2: ( ruleTextArea_Impl )
                    // InternalVideoMontage.g:770:3: ruleTextArea_Impl
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
                    // InternalVideoMontage.g:775:2: ( ruleTextAreaDynamic )
                    {
                    // InternalVideoMontage.g:775:2: ( ruleTextAreaDynamic )
                    // InternalVideoMontage.g:776:3: ruleTextAreaDynamic
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
    // InternalVideoMontage.g:785:1: rule__StartingMoment__Alternatives : ( ( ruleStartingMoment_Impl ) | ( ruleRelativeMoment ) | ( ruleAbsoluteMoment ) );
    public final void rule__StartingMoment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:789:1: ( ( ruleStartingMoment_Impl ) | ( ruleRelativeMoment ) | ( ruleAbsoluteMoment ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt4=1;
                }
                break;
            case 17:
            case 18:
            case 42:
                {
                alt4=2;
                }
                break;
            case EOF:
            case 20:
            case 43:
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
                    // InternalVideoMontage.g:790:2: ( ruleStartingMoment_Impl )
                    {
                    // InternalVideoMontage.g:790:2: ( ruleStartingMoment_Impl )
                    // InternalVideoMontage.g:791:3: ruleStartingMoment_Impl
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
                    // InternalVideoMontage.g:796:2: ( ruleRelativeMoment )
                    {
                    // InternalVideoMontage.g:796:2: ( ruleRelativeMoment )
                    // InternalVideoMontage.g:797:3: ruleRelativeMoment
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
                    // InternalVideoMontage.g:802:2: ( ruleAbsoluteMoment )
                    {
                    // InternalVideoMontage.g:802:2: ( ruleAbsoluteMoment )
                    // InternalVideoMontage.g:803:3: ruleAbsoluteMoment
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
    // InternalVideoMontage.g:812:1: rule__Animation__Alternatives : ( ( ruleFadeIn ) | ( ruleFadeOut ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:816:1: ( ( ruleFadeIn ) | ( ruleFadeOut ) )
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
                    // InternalVideoMontage.g:817:2: ( ruleFadeIn )
                    {
                    // InternalVideoMontage.g:817:2: ( ruleFadeIn )
                    // InternalVideoMontage.g:818:3: ruleFadeIn
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
                    // InternalVideoMontage.g:823:2: ( ruleFadeOut )
                    {
                    // InternalVideoMontage.g:823:2: ( ruleFadeOut )
                    // InternalVideoMontage.g:824:3: ruleFadeOut
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
    // InternalVideoMontage.g:833:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:837:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalVideoMontage.g:838:2: ( RULE_STRING )
                    {
                    // InternalVideoMontage.g:838:2: ( RULE_STRING )
                    // InternalVideoMontage.g:839:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:844:2: ( RULE_ID )
                    {
                    // InternalVideoMontage.g:844:2: ( RULE_ID )
                    // InternalVideoMontage.g:845:3: RULE_ID
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
    // InternalVideoMontage.g:854:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:858:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalVideoMontage.g:859:2: ( 'E' )
                    {
                    // InternalVideoMontage.g:859:2: ( 'E' )
                    // InternalVideoMontage.g:860:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:865:2: ( 'e' )
                    {
                    // InternalVideoMontage.g:865:2: ( 'e' )
                    // InternalVideoMontage.g:866:3: 'e'
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
    // InternalVideoMontage.g:875:1: rule__OperationMoment__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__OperationMoment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:879:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    // InternalVideoMontage.g:880:2: ( ( '+' ) )
                    {
                    // InternalVideoMontage.g:880:2: ( ( '+' ) )
                    // InternalVideoMontage.g:881:3: ( '+' )
                    {
                     before(grammarAccess.getOperationMomentAccess().getAdditionEnumLiteralDeclaration_0()); 
                    // InternalVideoMontage.g:882:3: ( '+' )
                    // InternalVideoMontage.g:882:4: '+'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationMomentAccess().getAdditionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:886:2: ( ( '-' ) )
                    {
                    // InternalVideoMontage.g:886:2: ( ( '-' ) )
                    // InternalVideoMontage.g:887:3: ( '-' )
                    {
                     before(grammarAccess.getOperationMomentAccess().getSoustractionEnumLiteralDeclaration_1()); 
                    // InternalVideoMontage.g:888:3: ( '-' )
                    // InternalVideoMontage.g:888:4: '-'
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
    // InternalVideoMontage.g:896:1: rule__Moment__Alternatives : ( ( ( 'starting' ) ) | ( ( 'ending' ) ) );
    public final void rule__Moment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:900:1: ( ( ( 'starting' ) ) | ( ( 'ending' ) ) )
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
                    // InternalVideoMontage.g:901:2: ( ( 'starting' ) )
                    {
                    // InternalVideoMontage.g:901:2: ( ( 'starting' ) )
                    // InternalVideoMontage.g:902:3: ( 'starting' )
                    {
                     before(grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0()); 
                    // InternalVideoMontage.g:903:3: ( 'starting' )
                    // InternalVideoMontage.g:903:4: 'starting'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:907:2: ( ( 'ending' ) )
                    {
                    // InternalVideoMontage.g:907:2: ( ( 'ending' ) )
                    // InternalVideoMontage.g:908:3: ( 'ending' )
                    {
                     before(grammarAccess.getMomentAccess().getEndingEnumLiteralDeclaration_1()); 
                    // InternalVideoMontage.g:909:3: ( 'ending' )
                    // InternalVideoMontage.g:909:4: 'ending'
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
    // InternalVideoMontage.g:917:1: rule__Movie__Group__0 : rule__Movie__Group__0__Impl rule__Movie__Group__1 ;
    public final void rule__Movie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:921:1: ( rule__Movie__Group__0__Impl rule__Movie__Group__1 )
            // InternalVideoMontage.g:922:2: rule__Movie__Group__0__Impl rule__Movie__Group__1
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
    // InternalVideoMontage.g:929:1: rule__Movie__Group__0__Impl : ( 'Movie' ) ;
    public final void rule__Movie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:933:1: ( ( 'Movie' ) )
            // InternalVideoMontage.g:934:1: ( 'Movie' )
            {
            // InternalVideoMontage.g:934:1: ( 'Movie' )
            // InternalVideoMontage.g:935:2: 'Movie'
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
    // InternalVideoMontage.g:944:1: rule__Movie__Group__1 : rule__Movie__Group__1__Impl rule__Movie__Group__2 ;
    public final void rule__Movie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:948:1: ( rule__Movie__Group__1__Impl rule__Movie__Group__2 )
            // InternalVideoMontage.g:949:2: rule__Movie__Group__1__Impl rule__Movie__Group__2
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
    // InternalVideoMontage.g:956:1: rule__Movie__Group__1__Impl : ( ( rule__Movie__TitleAssignment_1 ) ) ;
    public final void rule__Movie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:960:1: ( ( ( rule__Movie__TitleAssignment_1 ) ) )
            // InternalVideoMontage.g:961:1: ( ( rule__Movie__TitleAssignment_1 ) )
            {
            // InternalVideoMontage.g:961:1: ( ( rule__Movie__TitleAssignment_1 ) )
            // InternalVideoMontage.g:962:2: ( rule__Movie__TitleAssignment_1 )
            {
             before(grammarAccess.getMovieAccess().getTitleAssignment_1()); 
            // InternalVideoMontage.g:963:2: ( rule__Movie__TitleAssignment_1 )
            // InternalVideoMontage.g:963:3: rule__Movie__TitleAssignment_1
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
    // InternalVideoMontage.g:971:1: rule__Movie__Group__2 : rule__Movie__Group__2__Impl rule__Movie__Group__3 ;
    public final void rule__Movie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:975:1: ( rule__Movie__Group__2__Impl rule__Movie__Group__3 )
            // InternalVideoMontage.g:976:2: rule__Movie__Group__2__Impl rule__Movie__Group__3
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
    // InternalVideoMontage.g:983:1: rule__Movie__Group__2__Impl : ( '{' ) ;
    public final void rule__Movie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:987:1: ( ( '{' ) )
            // InternalVideoMontage.g:988:1: ( '{' )
            {
            // InternalVideoMontage.g:988:1: ( '{' )
            // InternalVideoMontage.g:989:2: '{'
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
    // InternalVideoMontage.g:998:1: rule__Movie__Group__3 : rule__Movie__Group__3__Impl rule__Movie__Group__4 ;
    public final void rule__Movie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1002:1: ( rule__Movie__Group__3__Impl rule__Movie__Group__4 )
            // InternalVideoMontage.g:1003:2: rule__Movie__Group__3__Impl rule__Movie__Group__4
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
    // InternalVideoMontage.g:1010:1: rule__Movie__Group__3__Impl : ( ( rule__Movie__VideoelementAssignment_3 ) ) ;
    public final void rule__Movie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1014:1: ( ( ( rule__Movie__VideoelementAssignment_3 ) ) )
            // InternalVideoMontage.g:1015:1: ( ( rule__Movie__VideoelementAssignment_3 ) )
            {
            // InternalVideoMontage.g:1015:1: ( ( rule__Movie__VideoelementAssignment_3 ) )
            // InternalVideoMontage.g:1016:2: ( rule__Movie__VideoelementAssignment_3 )
            {
             before(grammarAccess.getMovieAccess().getVideoelementAssignment_3()); 
            // InternalVideoMontage.g:1017:2: ( rule__Movie__VideoelementAssignment_3 )
            // InternalVideoMontage.g:1017:3: rule__Movie__VideoelementAssignment_3
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
    // InternalVideoMontage.g:1025:1: rule__Movie__Group__4 : rule__Movie__Group__4__Impl rule__Movie__Group__5 ;
    public final void rule__Movie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1029:1: ( rule__Movie__Group__4__Impl rule__Movie__Group__5 )
            // InternalVideoMontage.g:1030:2: rule__Movie__Group__4__Impl rule__Movie__Group__5
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
    // InternalVideoMontage.g:1037:1: rule__Movie__Group__4__Impl : ( ( rule__Movie__VideoelementAssignment_4 )* ) ;
    public final void rule__Movie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1041:1: ( ( ( rule__Movie__VideoelementAssignment_4 )* ) )
            // InternalVideoMontage.g:1042:1: ( ( rule__Movie__VideoelementAssignment_4 )* )
            {
            // InternalVideoMontage.g:1042:1: ( ( rule__Movie__VideoelementAssignment_4 )* )
            // InternalVideoMontage.g:1043:2: ( rule__Movie__VideoelementAssignment_4 )*
            {
             before(grammarAccess.getMovieAccess().getVideoelementAssignment_4()); 
            // InternalVideoMontage.g:1044:2: ( rule__Movie__VideoelementAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVideoMontage.g:1044:3: rule__Movie__VideoelementAssignment_4
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
    // InternalVideoMontage.g:1052:1: rule__Movie__Group__5 : rule__Movie__Group__5__Impl rule__Movie__Group__6 ;
    public final void rule__Movie__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1056:1: ( rule__Movie__Group__5__Impl rule__Movie__Group__6 )
            // InternalVideoMontage.g:1057:2: rule__Movie__Group__5__Impl rule__Movie__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalVideoMontage.g:1064:1: rule__Movie__Group__5__Impl : ( ( rule__Movie__Group_5__0 )? ) ;
    public final void rule__Movie__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1068:1: ( ( ( rule__Movie__Group_5__0 )? ) )
            // InternalVideoMontage.g:1069:1: ( ( rule__Movie__Group_5__0 )? )
            {
            // InternalVideoMontage.g:1069:1: ( ( rule__Movie__Group_5__0 )? )
            // InternalVideoMontage.g:1070:2: ( rule__Movie__Group_5__0 )?
            {
             before(grammarAccess.getMovieAccess().getGroup_5()); 
            // InternalVideoMontage.g:1071:2: ( rule__Movie__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVideoMontage.g:1071:3: rule__Movie__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Movie__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMovieAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1079:1: rule__Movie__Group__6 : rule__Movie__Group__6__Impl rule__Movie__Group__7 ;
    public final void rule__Movie__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1083:1: ( rule__Movie__Group__6__Impl rule__Movie__Group__7 )
            // InternalVideoMontage.g:1084:2: rule__Movie__Group__6__Impl rule__Movie__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalVideoMontage.g:1091:1: rule__Movie__Group__6__Impl : ( ( rule__Movie__Group_6__0 )? ) ;
    public final void rule__Movie__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1095:1: ( ( ( rule__Movie__Group_6__0 )? ) )
            // InternalVideoMontage.g:1096:1: ( ( rule__Movie__Group_6__0 )? )
            {
            // InternalVideoMontage.g:1096:1: ( ( rule__Movie__Group_6__0 )? )
            // InternalVideoMontage.g:1097:2: ( rule__Movie__Group_6__0 )?
            {
             before(grammarAccess.getMovieAccess().getGroup_6()); 
            // InternalVideoMontage.g:1098:2: ( rule__Movie__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVideoMontage.g:1098:3: rule__Movie__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Movie__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMovieAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1106:1: rule__Movie__Group__7 : rule__Movie__Group__7__Impl rule__Movie__Group__8 ;
    public final void rule__Movie__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1110:1: ( rule__Movie__Group__7__Impl rule__Movie__Group__8 )
            // InternalVideoMontage.g:1111:2: rule__Movie__Group__7__Impl rule__Movie__Group__8
            {
            pushFollow(FOLLOW_8);
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
    // InternalVideoMontage.g:1118:1: rule__Movie__Group__7__Impl : ( ( rule__Movie__VideoTimelineAssignment_7 ) ) ;
    public final void rule__Movie__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1122:1: ( ( ( rule__Movie__VideoTimelineAssignment_7 ) ) )
            // InternalVideoMontage.g:1123:1: ( ( rule__Movie__VideoTimelineAssignment_7 ) )
            {
            // InternalVideoMontage.g:1123:1: ( ( rule__Movie__VideoTimelineAssignment_7 ) )
            // InternalVideoMontage.g:1124:2: ( rule__Movie__VideoTimelineAssignment_7 )
            {
             before(grammarAccess.getMovieAccess().getVideoTimelineAssignment_7()); 
            // InternalVideoMontage.g:1125:2: ( rule__Movie__VideoTimelineAssignment_7 )
            // InternalVideoMontage.g:1125:3: rule__Movie__VideoTimelineAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Movie__VideoTimelineAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getVideoTimelineAssignment_7()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1133:1: rule__Movie__Group__8 : rule__Movie__Group__8__Impl ;
    public final void rule__Movie__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1137:1: ( rule__Movie__Group__8__Impl )
            // InternalVideoMontage.g:1138:2: rule__Movie__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:1144:1: rule__Movie__Group__8__Impl : ( '}' ) ;
    public final void rule__Movie__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1148:1: ( ( '}' ) )
            // InternalVideoMontage.g:1149:1: ( '}' )
            {
            // InternalVideoMontage.g:1149:1: ( '}' )
            // InternalVideoMontage.g:1150:2: '}'
            {
             before(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Movie__Group_5__0"
    // InternalVideoMontage.g:1160:1: rule__Movie__Group_5__0 : rule__Movie__Group_5__0__Impl rule__Movie__Group_5__1 ;
    public final void rule__Movie__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1164:1: ( rule__Movie__Group_5__0__Impl rule__Movie__Group_5__1 )
            // InternalVideoMontage.g:1165:2: rule__Movie__Group_5__0__Impl rule__Movie__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__Movie__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_5__0"


    // $ANTLR start "rule__Movie__Group_5__0__Impl"
    // InternalVideoMontage.g:1172:1: rule__Movie__Group_5__0__Impl : ( ( rule__Movie__AudioelementAssignment_5_0 ) ) ;
    public final void rule__Movie__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1176:1: ( ( ( rule__Movie__AudioelementAssignment_5_0 ) ) )
            // InternalVideoMontage.g:1177:1: ( ( rule__Movie__AudioelementAssignment_5_0 ) )
            {
            // InternalVideoMontage.g:1177:1: ( ( rule__Movie__AudioelementAssignment_5_0 ) )
            // InternalVideoMontage.g:1178:2: ( rule__Movie__AudioelementAssignment_5_0 )
            {
             before(grammarAccess.getMovieAccess().getAudioelementAssignment_5_0()); 
            // InternalVideoMontage.g:1179:2: ( rule__Movie__AudioelementAssignment_5_0 )
            // InternalVideoMontage.g:1179:3: rule__Movie__AudioelementAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Movie__AudioelementAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getAudioelementAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_5__0__Impl"


    // $ANTLR start "rule__Movie__Group_5__1"
    // InternalVideoMontage.g:1187:1: rule__Movie__Group_5__1 : rule__Movie__Group_5__1__Impl ;
    public final void rule__Movie__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1191:1: ( rule__Movie__Group_5__1__Impl )
            // InternalVideoMontage.g:1192:2: rule__Movie__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_5__1"


    // $ANTLR start "rule__Movie__Group_5__1__Impl"
    // InternalVideoMontage.g:1198:1: rule__Movie__Group_5__1__Impl : ( ( rule__Movie__AudioelementAssignment_5_1 )* ) ;
    public final void rule__Movie__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1202:1: ( ( ( rule__Movie__AudioelementAssignment_5_1 )* ) )
            // InternalVideoMontage.g:1203:1: ( ( rule__Movie__AudioelementAssignment_5_1 )* )
            {
            // InternalVideoMontage.g:1203:1: ( ( rule__Movie__AudioelementAssignment_5_1 )* )
            // InternalVideoMontage.g:1204:2: ( rule__Movie__AudioelementAssignment_5_1 )*
            {
             before(grammarAccess.getMovieAccess().getAudioelementAssignment_5_1()); 
            // InternalVideoMontage.g:1205:2: ( rule__Movie__AudioelementAssignment_5_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVideoMontage.g:1205:3: rule__Movie__AudioelementAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Movie__AudioelementAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getMovieAccess().getAudioelementAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_5__1__Impl"


    // $ANTLR start "rule__Movie__Group_6__0"
    // InternalVideoMontage.g:1214:1: rule__Movie__Group_6__0 : rule__Movie__Group_6__0__Impl rule__Movie__Group_6__1 ;
    public final void rule__Movie__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1218:1: ( rule__Movie__Group_6__0__Impl rule__Movie__Group_6__1 )
            // InternalVideoMontage.g:1219:2: rule__Movie__Group_6__0__Impl rule__Movie__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Movie__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_6__0"


    // $ANTLR start "rule__Movie__Group_6__0__Impl"
    // InternalVideoMontage.g:1226:1: rule__Movie__Group_6__0__Impl : ( ( rule__Movie__SubtitleAssignment_6_0 ) ) ;
    public final void rule__Movie__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1230:1: ( ( ( rule__Movie__SubtitleAssignment_6_0 ) ) )
            // InternalVideoMontage.g:1231:1: ( ( rule__Movie__SubtitleAssignment_6_0 ) )
            {
            // InternalVideoMontage.g:1231:1: ( ( rule__Movie__SubtitleAssignment_6_0 ) )
            // InternalVideoMontage.g:1232:2: ( rule__Movie__SubtitleAssignment_6_0 )
            {
             before(grammarAccess.getMovieAccess().getSubtitleAssignment_6_0()); 
            // InternalVideoMontage.g:1233:2: ( rule__Movie__SubtitleAssignment_6_0 )
            // InternalVideoMontage.g:1233:3: rule__Movie__SubtitleAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Movie__SubtitleAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getSubtitleAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_6__0__Impl"


    // $ANTLR start "rule__Movie__Group_6__1"
    // InternalVideoMontage.g:1241:1: rule__Movie__Group_6__1 : rule__Movie__Group_6__1__Impl ;
    public final void rule__Movie__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1245:1: ( rule__Movie__Group_6__1__Impl )
            // InternalVideoMontage.g:1246:2: rule__Movie__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_6__1"


    // $ANTLR start "rule__Movie__Group_6__1__Impl"
    // InternalVideoMontage.g:1252:1: rule__Movie__Group_6__1__Impl : ( ( rule__Movie__SubtitleAssignment_6_1 )* ) ;
    public final void rule__Movie__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1256:1: ( ( ( rule__Movie__SubtitleAssignment_6_1 )* ) )
            // InternalVideoMontage.g:1257:1: ( ( rule__Movie__SubtitleAssignment_6_1 )* )
            {
            // InternalVideoMontage.g:1257:1: ( ( rule__Movie__SubtitleAssignment_6_1 )* )
            // InternalVideoMontage.g:1258:2: ( rule__Movie__SubtitleAssignment_6_1 )*
            {
             before(grammarAccess.getMovieAccess().getSubtitleAssignment_6_1()); 
            // InternalVideoMontage.g:1259:2: ( rule__Movie__SubtitleAssignment_6_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVideoMontage.g:1259:3: rule__Movie__SubtitleAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Movie__SubtitleAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getMovieAccess().getSubtitleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_6__1__Impl"


    // $ANTLR start "rule__AudioElement__Group__0"
    // InternalVideoMontage.g:1268:1: rule__AudioElement__Group__0 : rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 ;
    public final void rule__AudioElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1272:1: ( rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 )
            // InternalVideoMontage.g:1273:2: rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:1280:1: rule__AudioElement__Group__0__Impl : ( 'audioElement' ) ;
    public final void rule__AudioElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1284:1: ( ( 'audioElement' ) )
            // InternalVideoMontage.g:1285:1: ( 'audioElement' )
            {
            // InternalVideoMontage.g:1285:1: ( 'audioElement' )
            // InternalVideoMontage.g:1286:2: 'audioElement'
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
    // InternalVideoMontage.g:1295:1: rule__AudioElement__Group__1 : rule__AudioElement__Group__1__Impl ;
    public final void rule__AudioElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1299:1: ( rule__AudioElement__Group__1__Impl )
            // InternalVideoMontage.g:1300:2: rule__AudioElement__Group__1__Impl
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
    // InternalVideoMontage.g:1306:1: rule__AudioElement__Group__1__Impl : ( ( rule__AudioElement__Alternatives_1 ) ) ;
    public final void rule__AudioElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1310:1: ( ( ( rule__AudioElement__Alternatives_1 ) ) )
            // InternalVideoMontage.g:1311:1: ( ( rule__AudioElement__Alternatives_1 ) )
            {
            // InternalVideoMontage.g:1311:1: ( ( rule__AudioElement__Alternatives_1 ) )
            // InternalVideoMontage.g:1312:2: ( rule__AudioElement__Alternatives_1 )
            {
             before(grammarAccess.getAudioElementAccess().getAlternatives_1()); 
            // InternalVideoMontage.g:1313:2: ( rule__AudioElement__Alternatives_1 )
            // InternalVideoMontage.g:1313:3: rule__AudioElement__Alternatives_1
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
    // InternalVideoMontage.g:1322:1: rule__VideoElement__Group__0 : rule__VideoElement__Group__0__Impl rule__VideoElement__Group__1 ;
    public final void rule__VideoElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1326:1: ( rule__VideoElement__Group__0__Impl rule__VideoElement__Group__1 )
            // InternalVideoMontage.g:1327:2: rule__VideoElement__Group__0__Impl rule__VideoElement__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalVideoMontage.g:1334:1: rule__VideoElement__Group__0__Impl : ( 'videoElement' ) ;
    public final void rule__VideoElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1338:1: ( ( 'videoElement' ) )
            // InternalVideoMontage.g:1339:1: ( 'videoElement' )
            {
            // InternalVideoMontage.g:1339:1: ( 'videoElement' )
            // InternalVideoMontage.g:1340:2: 'videoElement'
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
    // InternalVideoMontage.g:1349:1: rule__VideoElement__Group__1 : rule__VideoElement__Group__1__Impl ;
    public final void rule__VideoElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1353:1: ( rule__VideoElement__Group__1__Impl )
            // InternalVideoMontage.g:1354:2: rule__VideoElement__Group__1__Impl
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
    // InternalVideoMontage.g:1360:1: rule__VideoElement__Group__1__Impl : ( ( rule__VideoElement__Alternatives_1 ) ) ;
    public final void rule__VideoElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1364:1: ( ( ( rule__VideoElement__Alternatives_1 ) ) )
            // InternalVideoMontage.g:1365:1: ( ( rule__VideoElement__Alternatives_1 ) )
            {
            // InternalVideoMontage.g:1365:1: ( ( rule__VideoElement__Alternatives_1 ) )
            // InternalVideoMontage.g:1366:2: ( rule__VideoElement__Alternatives_1 )
            {
             before(grammarAccess.getVideoElementAccess().getAlternatives_1()); 
            // InternalVideoMontage.g:1367:2: ( rule__VideoElement__Alternatives_1 )
            // InternalVideoMontage.g:1367:3: rule__VideoElement__Alternatives_1
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


    // $ANTLR start "rule__VideoTimeLine__Group__0"
    // InternalVideoMontage.g:1376:1: rule__VideoTimeLine__Group__0 : rule__VideoTimeLine__Group__0__Impl rule__VideoTimeLine__Group__1 ;
    public final void rule__VideoTimeLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1380:1: ( rule__VideoTimeLine__Group__0__Impl rule__VideoTimeLine__Group__1 )
            // InternalVideoMontage.g:1381:2: rule__VideoTimeLine__Group__0__Impl rule__VideoTimeLine__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__VideoTimeLine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoTimeLine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoTimeLine__Group__0"


    // $ANTLR start "rule__VideoTimeLine__Group__0__Impl"
    // InternalVideoMontage.g:1388:1: rule__VideoTimeLine__Group__0__Impl : ( 'timeline' ) ;
    public final void rule__VideoTimeLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1392:1: ( ( 'timeline' ) )
            // InternalVideoMontage.g:1393:1: ( 'timeline' )
            {
            // InternalVideoMontage.g:1393:1: ( 'timeline' )
            // InternalVideoMontage.g:1394:2: 'timeline'
            {
             before(grammarAccess.getVideoTimeLineAccess().getTimelineKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVideoTimeLineAccess().getTimelineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoTimeLine__Group__0__Impl"


    // $ANTLR start "rule__VideoTimeLine__Group__1"
    // InternalVideoMontage.g:1403:1: rule__VideoTimeLine__Group__1 : rule__VideoTimeLine__Group__1__Impl rule__VideoTimeLine__Group__2 ;
    public final void rule__VideoTimeLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1407:1: ( rule__VideoTimeLine__Group__1__Impl rule__VideoTimeLine__Group__2 )
            // InternalVideoMontage.g:1408:2: rule__VideoTimeLine__Group__1__Impl rule__VideoTimeLine__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__VideoTimeLine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoTimeLine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoTimeLine__Group__1"


    // $ANTLR start "rule__VideoTimeLine__Group__1__Impl"
    // InternalVideoMontage.g:1415:1: rule__VideoTimeLine__Group__1__Impl : ( ( rule__VideoTimeLine__VideosAssignment_1 ) ) ;
    public final void rule__VideoTimeLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1419:1: ( ( ( rule__VideoTimeLine__VideosAssignment_1 ) ) )
            // InternalVideoMontage.g:1420:1: ( ( rule__VideoTimeLine__VideosAssignment_1 ) )
            {
            // InternalVideoMontage.g:1420:1: ( ( rule__VideoTimeLine__VideosAssignment_1 ) )
            // InternalVideoMontage.g:1421:2: ( rule__VideoTimeLine__VideosAssignment_1 )
            {
             before(grammarAccess.getVideoTimeLineAccess().getVideosAssignment_1()); 
            // InternalVideoMontage.g:1422:2: ( rule__VideoTimeLine__VideosAssignment_1 )
            // InternalVideoMontage.g:1422:3: rule__VideoTimeLine__VideosAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoTimeLine__VideosAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoTimeLineAccess().getVideosAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoTimeLine__Group__1__Impl"


    // $ANTLR start "rule__VideoTimeLine__Group__2"
    // InternalVideoMontage.g:1430:1: rule__VideoTimeLine__Group__2 : rule__VideoTimeLine__Group__2__Impl ;
    public final void rule__VideoTimeLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1434:1: ( rule__VideoTimeLine__Group__2__Impl )
            // InternalVideoMontage.g:1435:2: rule__VideoTimeLine__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoTimeLine__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoTimeLine__Group__2"


    // $ANTLR start "rule__VideoTimeLine__Group__2__Impl"
    // InternalVideoMontage.g:1441:1: rule__VideoTimeLine__Group__2__Impl : ( ( rule__VideoTimeLine__VideosAssignment_2 )* ) ;
    public final void rule__VideoTimeLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1445:1: ( ( ( rule__VideoTimeLine__VideosAssignment_2 )* ) )
            // InternalVideoMontage.g:1446:1: ( ( rule__VideoTimeLine__VideosAssignment_2 )* )
            {
            // InternalVideoMontage.g:1446:1: ( ( rule__VideoTimeLine__VideosAssignment_2 )* )
            // InternalVideoMontage.g:1447:2: ( rule__VideoTimeLine__VideosAssignment_2 )*
            {
             before(grammarAccess.getVideoTimeLineAccess().getVideosAssignment_2()); 
            // InternalVideoMontage.g:1448:2: ( rule__VideoTimeLine__VideosAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVideoMontage.g:1448:3: rule__VideoTimeLine__VideosAssignment_2
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__VideoTimeLine__VideosAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getVideoTimeLineAccess().getVideosAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoTimeLine__Group__2__Impl"


    // $ANTLR start "rule__Subtitle__Group__0"
    // InternalVideoMontage.g:1457:1: rule__Subtitle__Group__0 : rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1 ;
    public final void rule__Subtitle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1461:1: ( rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1 )
            // InternalVideoMontage.g:1462:2: rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:1469:1: rule__Subtitle__Group__0__Impl : ( 'Subtitle' ) ;
    public final void rule__Subtitle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1473:1: ( ( 'Subtitle' ) )
            // InternalVideoMontage.g:1474:1: ( 'Subtitle' )
            {
            // InternalVideoMontage.g:1474:1: ( 'Subtitle' )
            // InternalVideoMontage.g:1475:2: 'Subtitle'
            {
             before(grammarAccess.getSubtitleAccess().getSubtitleKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalVideoMontage.g:1484:1: rule__Subtitle__Group__1 : rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2 ;
    public final void rule__Subtitle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1488:1: ( rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2 )
            // InternalVideoMontage.g:1489:2: rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVideoMontage.g:1496:1: rule__Subtitle__Group__1__Impl : ( ( rule__Subtitle__NameAssignment_1 ) ) ;
    public final void rule__Subtitle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1500:1: ( ( ( rule__Subtitle__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:1501:1: ( ( rule__Subtitle__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:1501:1: ( ( rule__Subtitle__NameAssignment_1 ) )
            // InternalVideoMontage.g:1502:2: ( rule__Subtitle__NameAssignment_1 )
            {
             before(grammarAccess.getSubtitleAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:1503:2: ( rule__Subtitle__NameAssignment_1 )
            // InternalVideoMontage.g:1503:3: rule__Subtitle__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1511:1: rule__Subtitle__Group__2 : rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3 ;
    public final void rule__Subtitle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1515:1: ( rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3 )
            // InternalVideoMontage.g:1516:2: rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalVideoMontage.g:1523:1: rule__Subtitle__Group__2__Impl : ( 'start' ) ;
    public final void rule__Subtitle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1527:1: ( ( 'start' ) )
            // InternalVideoMontage.g:1528:1: ( 'start' )
            {
            // InternalVideoMontage.g:1528:1: ( 'start' )
            // InternalVideoMontage.g:1529:2: 'start'
            {
             before(grammarAccess.getSubtitleAccess().getStartKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getStartKeyword_2()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1538:1: rule__Subtitle__Group__3 : rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4 ;
    public final void rule__Subtitle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1542:1: ( rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4 )
            // InternalVideoMontage.g:1543:2: rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalVideoMontage.g:1550:1: rule__Subtitle__Group__3__Impl : ( ':' ) ;
    public final void rule__Subtitle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1554:1: ( ( ':' ) )
            // InternalVideoMontage.g:1555:1: ( ':' )
            {
            // InternalVideoMontage.g:1555:1: ( ':' )
            // InternalVideoMontage.g:1556:2: ':'
            {
             before(grammarAccess.getSubtitleAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1565:1: rule__Subtitle__Group__4 : rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5 ;
    public final void rule__Subtitle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1569:1: ( rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5 )
            // InternalVideoMontage.g:1570:2: rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalVideoMontage.g:1577:1: rule__Subtitle__Group__4__Impl : ( ( rule__Subtitle__StartingmomentAssignment_4 ) ) ;
    public final void rule__Subtitle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1581:1: ( ( ( rule__Subtitle__StartingmomentAssignment_4 ) ) )
            // InternalVideoMontage.g:1582:1: ( ( rule__Subtitle__StartingmomentAssignment_4 ) )
            {
            // InternalVideoMontage.g:1582:1: ( ( rule__Subtitle__StartingmomentAssignment_4 ) )
            // InternalVideoMontage.g:1583:2: ( rule__Subtitle__StartingmomentAssignment_4 )
            {
             before(grammarAccess.getSubtitleAccess().getStartingmomentAssignment_4()); 
            // InternalVideoMontage.g:1584:2: ( rule__Subtitle__StartingmomentAssignment_4 )
            // InternalVideoMontage.g:1584:3: rule__Subtitle__StartingmomentAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__StartingmomentAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getStartingmomentAssignment_4()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1592:1: rule__Subtitle__Group__5 : rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6 ;
    public final void rule__Subtitle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1596:1: ( rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6 )
            // InternalVideoMontage.g:1597:2: rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalVideoMontage.g:1604:1: rule__Subtitle__Group__5__Impl : ( '{' ) ;
    public final void rule__Subtitle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1608:1: ( ( '{' ) )
            // InternalVideoMontage.g:1609:1: ( '{' )
            {
            // InternalVideoMontage.g:1609:1: ( '{' )
            // InternalVideoMontage.g:1610:2: '{'
            {
             before(grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1619:1: rule__Subtitle__Group__6 : rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7 ;
    public final void rule__Subtitle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1623:1: ( rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7 )
            // InternalVideoMontage.g:1624:2: rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7
            {
            pushFollow(FOLLOW_20);
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
    // InternalVideoMontage.g:1631:1: rule__Subtitle__Group__6__Impl : ( ( rule__Subtitle__Group_6__0 )? ) ;
    public final void rule__Subtitle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1635:1: ( ( ( rule__Subtitle__Group_6__0 )? ) )
            // InternalVideoMontage.g:1636:1: ( ( rule__Subtitle__Group_6__0 )? )
            {
            // InternalVideoMontage.g:1636:1: ( ( rule__Subtitle__Group_6__0 )? )
            // InternalVideoMontage.g:1637:2: ( rule__Subtitle__Group_6__0 )?
            {
             before(grammarAccess.getSubtitleAccess().getGroup_6()); 
            // InternalVideoMontage.g:1638:2: ( rule__Subtitle__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVideoMontage.g:1638:3: rule__Subtitle__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subtitle__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubtitleAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1646:1: rule__Subtitle__Group__7 : rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8 ;
    public final void rule__Subtitle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1650:1: ( rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8 )
            // InternalVideoMontage.g:1651:2: rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalVideoMontage.g:1658:1: rule__Subtitle__Group__7__Impl : ( 'textArea' ) ;
    public final void rule__Subtitle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1662:1: ( ( 'textArea' ) )
            // InternalVideoMontage.g:1663:1: ( 'textArea' )
            {
            // InternalVideoMontage.g:1663:1: ( 'textArea' )
            // InternalVideoMontage.g:1664:2: 'textArea'
            {
             before(grammarAccess.getSubtitleAccess().getTextAreaKeyword_7()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getTextAreaKeyword_7()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1673:1: rule__Subtitle__Group__8 : rule__Subtitle__Group__8__Impl rule__Subtitle__Group__9 ;
    public final void rule__Subtitle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1677:1: ( rule__Subtitle__Group__8__Impl rule__Subtitle__Group__9 )
            // InternalVideoMontage.g:1678:2: rule__Subtitle__Group__8__Impl rule__Subtitle__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Subtitle__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__9();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:1685:1: rule__Subtitle__Group__8__Impl : ( ( rule__Subtitle__TextareaAssignment_8 ) ) ;
    public final void rule__Subtitle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1689:1: ( ( ( rule__Subtitle__TextareaAssignment_8 ) ) )
            // InternalVideoMontage.g:1690:1: ( ( rule__Subtitle__TextareaAssignment_8 ) )
            {
            // InternalVideoMontage.g:1690:1: ( ( rule__Subtitle__TextareaAssignment_8 ) )
            // InternalVideoMontage.g:1691:2: ( rule__Subtitle__TextareaAssignment_8 )
            {
             before(grammarAccess.getSubtitleAccess().getTextareaAssignment_8()); 
            // InternalVideoMontage.g:1692:2: ( rule__Subtitle__TextareaAssignment_8 )
            // InternalVideoMontage.g:1692:3: rule__Subtitle__TextareaAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__TextareaAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getTextareaAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Subtitle__Group__9"
    // InternalVideoMontage.g:1700:1: rule__Subtitle__Group__9 : rule__Subtitle__Group__9__Impl ;
    public final void rule__Subtitle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1704:1: ( rule__Subtitle__Group__9__Impl )
            // InternalVideoMontage.g:1705:2: rule__Subtitle__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__9"


    // $ANTLR start "rule__Subtitle__Group__9__Impl"
    // InternalVideoMontage.g:1711:1: rule__Subtitle__Group__9__Impl : ( '}' ) ;
    public final void rule__Subtitle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1715:1: ( ( '}' ) )
            // InternalVideoMontage.g:1716:1: ( '}' )
            {
            // InternalVideoMontage.g:1716:1: ( '}' )
            // InternalVideoMontage.g:1717:2: '}'
            {
             before(grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__9__Impl"


    // $ANTLR start "rule__Subtitle__Group_6__0"
    // InternalVideoMontage.g:1727:1: rule__Subtitle__Group_6__0 : rule__Subtitle__Group_6__0__Impl rule__Subtitle__Group_6__1 ;
    public final void rule__Subtitle__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1731:1: ( rule__Subtitle__Group_6__0__Impl rule__Subtitle__Group_6__1 )
            // InternalVideoMontage.g:1732:2: rule__Subtitle__Group_6__0__Impl rule__Subtitle__Group_6__1
            {
            pushFollow(FOLLOW_22);
            rule__Subtitle__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_6__0"


    // $ANTLR start "rule__Subtitle__Group_6__0__Impl"
    // InternalVideoMontage.g:1739:1: rule__Subtitle__Group_6__0__Impl : ( 'duration' ) ;
    public final void rule__Subtitle__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1743:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:1744:1: ( 'duration' )
            {
            // InternalVideoMontage.g:1744:1: ( 'duration' )
            // InternalVideoMontage.g:1745:2: 'duration'
            {
             before(grammarAccess.getSubtitleAccess().getDurationKeyword_6_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getDurationKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_6__0__Impl"


    // $ANTLR start "rule__Subtitle__Group_6__1"
    // InternalVideoMontage.g:1754:1: rule__Subtitle__Group_6__1 : rule__Subtitle__Group_6__1__Impl ;
    public final void rule__Subtitle__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1758:1: ( rule__Subtitle__Group_6__1__Impl )
            // InternalVideoMontage.g:1759:2: rule__Subtitle__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_6__1"


    // $ANTLR start "rule__Subtitle__Group_6__1__Impl"
    // InternalVideoMontage.g:1765:1: rule__Subtitle__Group_6__1__Impl : ( ( rule__Subtitle__DurationAssignment_6_1 ) ) ;
    public final void rule__Subtitle__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1769:1: ( ( ( rule__Subtitle__DurationAssignment_6_1 ) ) )
            // InternalVideoMontage.g:1770:1: ( ( rule__Subtitle__DurationAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:1770:1: ( ( rule__Subtitle__DurationAssignment_6_1 ) )
            // InternalVideoMontage.g:1771:2: ( rule__Subtitle__DurationAssignment_6_1 )
            {
             before(grammarAccess.getSubtitleAccess().getDurationAssignment_6_1()); 
            // InternalVideoMontage.g:1772:2: ( rule__Subtitle__DurationAssignment_6_1 )
            // InternalVideoMontage.g:1772:3: rule__Subtitle__DurationAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__DurationAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getDurationAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_6__1__Impl"


    // $ANTLR start "rule__Audio__Group__0"
    // InternalVideoMontage.g:1781:1: rule__Audio__Group__0 : rule__Audio__Group__0__Impl rule__Audio__Group__1 ;
    public final void rule__Audio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1785:1: ( rule__Audio__Group__0__Impl rule__Audio__Group__1 )
            // InternalVideoMontage.g:1786:2: rule__Audio__Group__0__Impl rule__Audio__Group__1
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
    // InternalVideoMontage.g:1793:1: rule__Audio__Group__0__Impl : ( 'Audio' ) ;
    public final void rule__Audio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1797:1: ( ( 'Audio' ) )
            // InternalVideoMontage.g:1798:1: ( 'Audio' )
            {
            // InternalVideoMontage.g:1798:1: ( 'Audio' )
            // InternalVideoMontage.g:1799:2: 'Audio'
            {
             before(grammarAccess.getAudioAccess().getAudioKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalVideoMontage.g:1808:1: rule__Audio__Group__1 : rule__Audio__Group__1__Impl rule__Audio__Group__2 ;
    public final void rule__Audio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1812:1: ( rule__Audio__Group__1__Impl rule__Audio__Group__2 )
            // InternalVideoMontage.g:1813:2: rule__Audio__Group__1__Impl rule__Audio__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVideoMontage.g:1820:1: rule__Audio__Group__1__Impl : ( ( rule__Audio__NameAssignment_1 ) ) ;
    public final void rule__Audio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1824:1: ( ( ( rule__Audio__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:1825:1: ( ( rule__Audio__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:1825:1: ( ( rule__Audio__NameAssignment_1 ) )
            // InternalVideoMontage.g:1826:2: ( rule__Audio__NameAssignment_1 )
            {
             before(grammarAccess.getAudioAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:1827:2: ( rule__Audio__NameAssignment_1 )
            // InternalVideoMontage.g:1827:3: rule__Audio__NameAssignment_1
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
    // InternalVideoMontage.g:1835:1: rule__Audio__Group__2 : rule__Audio__Group__2__Impl rule__Audio__Group__3 ;
    public final void rule__Audio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1839:1: ( rule__Audio__Group__2__Impl rule__Audio__Group__3 )
            // InternalVideoMontage.g:1840:2: rule__Audio__Group__2__Impl rule__Audio__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalVideoMontage.g:1847:1: rule__Audio__Group__2__Impl : ( 'start' ) ;
    public final void rule__Audio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1851:1: ( ( 'start' ) )
            // InternalVideoMontage.g:1852:1: ( 'start' )
            {
            // InternalVideoMontage.g:1852:1: ( 'start' )
            // InternalVideoMontage.g:1853:2: 'start'
            {
             before(grammarAccess.getAudioAccess().getStartKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalVideoMontage.g:1862:1: rule__Audio__Group__3 : rule__Audio__Group__3__Impl rule__Audio__Group__4 ;
    public final void rule__Audio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1866:1: ( rule__Audio__Group__3__Impl rule__Audio__Group__4 )
            // InternalVideoMontage.g:1867:2: rule__Audio__Group__3__Impl rule__Audio__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalVideoMontage.g:1874:1: rule__Audio__Group__3__Impl : ( ':' ) ;
    public final void rule__Audio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1878:1: ( ( ':' ) )
            // InternalVideoMontage.g:1879:1: ( ':' )
            {
            // InternalVideoMontage.g:1879:1: ( ':' )
            // InternalVideoMontage.g:1880:2: ':'
            {
             before(grammarAccess.getAudioAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalVideoMontage.g:1889:1: rule__Audio__Group__4 : rule__Audio__Group__4__Impl rule__Audio__Group__5 ;
    public final void rule__Audio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1893:1: ( rule__Audio__Group__4__Impl rule__Audio__Group__5 )
            // InternalVideoMontage.g:1894:2: rule__Audio__Group__4__Impl rule__Audio__Group__5
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
    // InternalVideoMontage.g:1901:1: rule__Audio__Group__4__Impl : ( ( rule__Audio__StartingmomentAssignment_4 ) ) ;
    public final void rule__Audio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1905:1: ( ( ( rule__Audio__StartingmomentAssignment_4 ) ) )
            // InternalVideoMontage.g:1906:1: ( ( rule__Audio__StartingmomentAssignment_4 ) )
            {
            // InternalVideoMontage.g:1906:1: ( ( rule__Audio__StartingmomentAssignment_4 ) )
            // InternalVideoMontage.g:1907:2: ( rule__Audio__StartingmomentAssignment_4 )
            {
             before(grammarAccess.getAudioAccess().getStartingmomentAssignment_4()); 
            // InternalVideoMontage.g:1908:2: ( rule__Audio__StartingmomentAssignment_4 )
            // InternalVideoMontage.g:1908:3: rule__Audio__StartingmomentAssignment_4
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
    // InternalVideoMontage.g:1916:1: rule__Audio__Group__5 : rule__Audio__Group__5__Impl rule__Audio__Group__6 ;
    public final void rule__Audio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1920:1: ( rule__Audio__Group__5__Impl rule__Audio__Group__6 )
            // InternalVideoMontage.g:1921:2: rule__Audio__Group__5__Impl rule__Audio__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:1928:1: rule__Audio__Group__5__Impl : ( '{' ) ;
    public final void rule__Audio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1932:1: ( ( '{' ) )
            // InternalVideoMontage.g:1933:1: ( '{' )
            {
            // InternalVideoMontage.g:1933:1: ( '{' )
            // InternalVideoMontage.g:1934:2: '{'
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
    // InternalVideoMontage.g:1943:1: rule__Audio__Group__6 : rule__Audio__Group__6__Impl rule__Audio__Group__7 ;
    public final void rule__Audio__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1947:1: ( rule__Audio__Group__6__Impl rule__Audio__Group__7 )
            // InternalVideoMontage.g:1948:2: rule__Audio__Group__6__Impl rule__Audio__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:1955:1: rule__Audio__Group__6__Impl : ( ( rule__Audio__Group_6__0 )? ) ;
    public final void rule__Audio__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1959:1: ( ( ( rule__Audio__Group_6__0 )? ) )
            // InternalVideoMontage.g:1960:1: ( ( rule__Audio__Group_6__0 )? )
            {
            // InternalVideoMontage.g:1960:1: ( ( rule__Audio__Group_6__0 )? )
            // InternalVideoMontage.g:1961:2: ( rule__Audio__Group_6__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_6()); 
            // InternalVideoMontage.g:1962:2: ( rule__Audio__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVideoMontage.g:1962:3: rule__Audio__Group_6__0
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
    // InternalVideoMontage.g:1970:1: rule__Audio__Group__7 : rule__Audio__Group__7__Impl rule__Audio__Group__8 ;
    public final void rule__Audio__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1974:1: ( rule__Audio__Group__7__Impl rule__Audio__Group__8 )
            // InternalVideoMontage.g:1975:2: rule__Audio__Group__7__Impl rule__Audio__Group__8
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:1982:1: rule__Audio__Group__7__Impl : ( ( rule__Audio__Group_7__0 )? ) ;
    public final void rule__Audio__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1986:1: ( ( ( rule__Audio__Group_7__0 )? ) )
            // InternalVideoMontage.g:1987:1: ( ( rule__Audio__Group_7__0 )? )
            {
            // InternalVideoMontage.g:1987:1: ( ( rule__Audio__Group_7__0 )? )
            // InternalVideoMontage.g:1988:2: ( rule__Audio__Group_7__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_7()); 
            // InternalVideoMontage.g:1989:2: ( rule__Audio__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVideoMontage.g:1989:3: rule__Audio__Group_7__0
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
    // InternalVideoMontage.g:1997:1: rule__Audio__Group__8 : rule__Audio__Group__8__Impl ;
    public final void rule__Audio__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2001:1: ( rule__Audio__Group__8__Impl )
            // InternalVideoMontage.g:2002:2: rule__Audio__Group__8__Impl
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
    // InternalVideoMontage.g:2008:1: rule__Audio__Group__8__Impl : ( '}' ) ;
    public final void rule__Audio__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2012:1: ( ( '}' ) )
            // InternalVideoMontage.g:2013:1: ( '}' )
            {
            // InternalVideoMontage.g:2013:1: ( '}' )
            // InternalVideoMontage.g:2014:2: '}'
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
    // InternalVideoMontage.g:2024:1: rule__Audio__Group_6__0 : rule__Audio__Group_6__0__Impl rule__Audio__Group_6__1 ;
    public final void rule__Audio__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2028:1: ( rule__Audio__Group_6__0__Impl rule__Audio__Group_6__1 )
            // InternalVideoMontage.g:2029:2: rule__Audio__Group_6__0__Impl rule__Audio__Group_6__1
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
    // InternalVideoMontage.g:2036:1: rule__Audio__Group_6__0__Impl : ( 'path' ) ;
    public final void rule__Audio__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2040:1: ( ( 'path' ) )
            // InternalVideoMontage.g:2041:1: ( 'path' )
            {
            // InternalVideoMontage.g:2041:1: ( 'path' )
            // InternalVideoMontage.g:2042:2: 'path'
            {
             before(grammarAccess.getAudioAccess().getPathKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalVideoMontage.g:2051:1: rule__Audio__Group_6__1 : rule__Audio__Group_6__1__Impl ;
    public final void rule__Audio__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2055:1: ( rule__Audio__Group_6__1__Impl )
            // InternalVideoMontage.g:2056:2: rule__Audio__Group_6__1__Impl
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
    // InternalVideoMontage.g:2062:1: rule__Audio__Group_6__1__Impl : ( ( rule__Audio__PathAssignment_6_1 ) ) ;
    public final void rule__Audio__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2066:1: ( ( ( rule__Audio__PathAssignment_6_1 ) ) )
            // InternalVideoMontage.g:2067:1: ( ( rule__Audio__PathAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:2067:1: ( ( rule__Audio__PathAssignment_6_1 ) )
            // InternalVideoMontage.g:2068:2: ( rule__Audio__PathAssignment_6_1 )
            {
             before(grammarAccess.getAudioAccess().getPathAssignment_6_1()); 
            // InternalVideoMontage.g:2069:2: ( rule__Audio__PathAssignment_6_1 )
            // InternalVideoMontage.g:2069:3: rule__Audio__PathAssignment_6_1
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
    // InternalVideoMontage.g:2078:1: rule__Audio__Group_7__0 : rule__Audio__Group_7__0__Impl rule__Audio__Group_7__1 ;
    public final void rule__Audio__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2082:1: ( rule__Audio__Group_7__0__Impl rule__Audio__Group_7__1 )
            // InternalVideoMontage.g:2083:2: rule__Audio__Group_7__0__Impl rule__Audio__Group_7__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalVideoMontage.g:2090:1: rule__Audio__Group_7__0__Impl : ( 'transition' ) ;
    public final void rule__Audio__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2094:1: ( ( 'transition' ) )
            // InternalVideoMontage.g:2095:1: ( 'transition' )
            {
            // InternalVideoMontage.g:2095:1: ( 'transition' )
            // InternalVideoMontage.g:2096:2: 'transition'
            {
             before(grammarAccess.getAudioAccess().getTransitionKeyword_7_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalVideoMontage.g:2105:1: rule__Audio__Group_7__1 : rule__Audio__Group_7__1__Impl ;
    public final void rule__Audio__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2109:1: ( rule__Audio__Group_7__1__Impl )
            // InternalVideoMontage.g:2110:2: rule__Audio__Group_7__1__Impl
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
    // InternalVideoMontage.g:2116:1: rule__Audio__Group_7__1__Impl : ( ( rule__Audio__TransitionAssignment_7_1 ) ) ;
    public final void rule__Audio__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2120:1: ( ( ( rule__Audio__TransitionAssignment_7_1 ) ) )
            // InternalVideoMontage.g:2121:1: ( ( rule__Audio__TransitionAssignment_7_1 ) )
            {
            // InternalVideoMontage.g:2121:1: ( ( rule__Audio__TransitionAssignment_7_1 ) )
            // InternalVideoMontage.g:2122:2: ( rule__Audio__TransitionAssignment_7_1 )
            {
             before(grammarAccess.getAudioAccess().getTransitionAssignment_7_1()); 
            // InternalVideoMontage.g:2123:2: ( rule__Audio__TransitionAssignment_7_1 )
            // InternalVideoMontage.g:2123:3: rule__Audio__TransitionAssignment_7_1
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
    // InternalVideoMontage.g:2132:1: rule__AudioClip__Group__0 : rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1 ;
    public final void rule__AudioClip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2136:1: ( rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1 )
            // InternalVideoMontage.g:2137:2: rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1
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
    // InternalVideoMontage.g:2144:1: rule__AudioClip__Group__0__Impl : ( 'AudioClip' ) ;
    public final void rule__AudioClip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2148:1: ( ( 'AudioClip' ) )
            // InternalVideoMontage.g:2149:1: ( 'AudioClip' )
            {
            // InternalVideoMontage.g:2149:1: ( 'AudioClip' )
            // InternalVideoMontage.g:2150:2: 'AudioClip'
            {
             before(grammarAccess.getAudioClipAccess().getAudioClipKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalVideoMontage.g:2159:1: rule__AudioClip__Group__1 : rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2 ;
    public final void rule__AudioClip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2163:1: ( rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2 )
            // InternalVideoMontage.g:2164:2: rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalVideoMontage.g:2171:1: rule__AudioClip__Group__1__Impl : ( ( rule__AudioClip__NameAssignment_1 ) ) ;
    public final void rule__AudioClip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2175:1: ( ( ( rule__AudioClip__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:2176:1: ( ( rule__AudioClip__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:2176:1: ( ( rule__AudioClip__NameAssignment_1 ) )
            // InternalVideoMontage.g:2177:2: ( rule__AudioClip__NameAssignment_1 )
            {
             before(grammarAccess.getAudioClipAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:2178:2: ( rule__AudioClip__NameAssignment_1 )
            // InternalVideoMontage.g:2178:3: rule__AudioClip__NameAssignment_1
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
    // InternalVideoMontage.g:2186:1: rule__AudioClip__Group__2 : rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3 ;
    public final void rule__AudioClip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2190:1: ( rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3 )
            // InternalVideoMontage.g:2191:2: rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalVideoMontage.g:2198:1: rule__AudioClip__Group__2__Impl : ( 'start' ) ;
    public final void rule__AudioClip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2202:1: ( ( 'start' ) )
            // InternalVideoMontage.g:2203:1: ( 'start' )
            {
            // InternalVideoMontage.g:2203:1: ( 'start' )
            // InternalVideoMontage.g:2204:2: 'start'
            {
             before(grammarAccess.getAudioClipAccess().getStartKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalVideoMontage.g:2213:1: rule__AudioClip__Group__3 : rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4 ;
    public final void rule__AudioClip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2217:1: ( rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4 )
            // InternalVideoMontage.g:2218:2: rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalVideoMontage.g:2225:1: rule__AudioClip__Group__3__Impl : ( ':' ) ;
    public final void rule__AudioClip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2229:1: ( ( ':' ) )
            // InternalVideoMontage.g:2230:1: ( ':' )
            {
            // InternalVideoMontage.g:2230:1: ( ':' )
            // InternalVideoMontage.g:2231:2: ':'
            {
             before(grammarAccess.getAudioClipAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
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
    // InternalVideoMontage.g:2240:1: rule__AudioClip__Group__4 : rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5 ;
    public final void rule__AudioClip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2244:1: ( rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5 )
            // InternalVideoMontage.g:2245:2: rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5
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
    // InternalVideoMontage.g:2252:1: rule__AudioClip__Group__4__Impl : ( ( rule__AudioClip__StartingmomentAssignment_4 ) ) ;
    public final void rule__AudioClip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2256:1: ( ( ( rule__AudioClip__StartingmomentAssignment_4 ) ) )
            // InternalVideoMontage.g:2257:1: ( ( rule__AudioClip__StartingmomentAssignment_4 ) )
            {
            // InternalVideoMontage.g:2257:1: ( ( rule__AudioClip__StartingmomentAssignment_4 ) )
            // InternalVideoMontage.g:2258:2: ( rule__AudioClip__StartingmomentAssignment_4 )
            {
             before(grammarAccess.getAudioClipAccess().getStartingmomentAssignment_4()); 
            // InternalVideoMontage.g:2259:2: ( rule__AudioClip__StartingmomentAssignment_4 )
            // InternalVideoMontage.g:2259:3: rule__AudioClip__StartingmomentAssignment_4
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
    // InternalVideoMontage.g:2267:1: rule__AudioClip__Group__5 : rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6 ;
    public final void rule__AudioClip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2271:1: ( rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6 )
            // InternalVideoMontage.g:2272:2: rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalVideoMontage.g:2279:1: rule__AudioClip__Group__5__Impl : ( '{' ) ;
    public final void rule__AudioClip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2283:1: ( ( '{' ) )
            // InternalVideoMontage.g:2284:1: ( '{' )
            {
            // InternalVideoMontage.g:2284:1: ( '{' )
            // InternalVideoMontage.g:2285:2: '{'
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
    // InternalVideoMontage.g:2294:1: rule__AudioClip__Group__6 : rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7 ;
    public final void rule__AudioClip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2298:1: ( rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7 )
            // InternalVideoMontage.g:2299:2: rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7
            {
            pushFollow(FOLLOW_25);
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
    // InternalVideoMontage.g:2306:1: rule__AudioClip__Group__6__Impl : ( ( rule__AudioClip__Group_6__0 )? ) ;
    public final void rule__AudioClip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2310:1: ( ( ( rule__AudioClip__Group_6__0 )? ) )
            // InternalVideoMontage.g:2311:1: ( ( rule__AudioClip__Group_6__0 )? )
            {
            // InternalVideoMontage.g:2311:1: ( ( rule__AudioClip__Group_6__0 )? )
            // InternalVideoMontage.g:2312:2: ( rule__AudioClip__Group_6__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_6()); 
            // InternalVideoMontage.g:2313:2: ( rule__AudioClip__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVideoMontage.g:2313:3: rule__AudioClip__Group_6__0
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
    // InternalVideoMontage.g:2321:1: rule__AudioClip__Group__7 : rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8 ;
    public final void rule__AudioClip__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2325:1: ( rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8 )
            // InternalVideoMontage.g:2326:2: rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8
            {
            pushFollow(FOLLOW_26);
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
    // InternalVideoMontage.g:2333:1: rule__AudioClip__Group__7__Impl : ( ( rule__AudioClip__Group_7__0 ) ) ;
    public final void rule__AudioClip__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2337:1: ( ( ( rule__AudioClip__Group_7__0 ) ) )
            // InternalVideoMontage.g:2338:1: ( ( rule__AudioClip__Group_7__0 ) )
            {
            // InternalVideoMontage.g:2338:1: ( ( rule__AudioClip__Group_7__0 ) )
            // InternalVideoMontage.g:2339:2: ( rule__AudioClip__Group_7__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup_7()); 
            // InternalVideoMontage.g:2340:2: ( rule__AudioClip__Group_7__0 )
            // InternalVideoMontage.g:2340:3: rule__AudioClip__Group_7__0
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
    // InternalVideoMontage.g:2348:1: rule__AudioClip__Group__8 : rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9 ;
    public final void rule__AudioClip__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2352:1: ( rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9 )
            // InternalVideoMontage.g:2353:2: rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9
            {
            pushFollow(FOLLOW_27);
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
    // InternalVideoMontage.g:2360:1: rule__AudioClip__Group__8__Impl : ( ( rule__AudioClip__Group_8__0 ) ) ;
    public final void rule__AudioClip__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2364:1: ( ( ( rule__AudioClip__Group_8__0 ) ) )
            // InternalVideoMontage.g:2365:1: ( ( rule__AudioClip__Group_8__0 ) )
            {
            // InternalVideoMontage.g:2365:1: ( ( rule__AudioClip__Group_8__0 ) )
            // InternalVideoMontage.g:2366:2: ( rule__AudioClip__Group_8__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup_8()); 
            // InternalVideoMontage.g:2367:2: ( rule__AudioClip__Group_8__0 )
            // InternalVideoMontage.g:2367:3: rule__AudioClip__Group_8__0
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
    // InternalVideoMontage.g:2375:1: rule__AudioClip__Group__9 : rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10 ;
    public final void rule__AudioClip__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2379:1: ( rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10 )
            // InternalVideoMontage.g:2380:2: rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10
            {
            pushFollow(FOLLOW_27);
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
    // InternalVideoMontage.g:2387:1: rule__AudioClip__Group__9__Impl : ( ( rule__AudioClip__Group_9__0 )? ) ;
    public final void rule__AudioClip__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2391:1: ( ( ( rule__AudioClip__Group_9__0 )? ) )
            // InternalVideoMontage.g:2392:1: ( ( rule__AudioClip__Group_9__0 )? )
            {
            // InternalVideoMontage.g:2392:1: ( ( rule__AudioClip__Group_9__0 )? )
            // InternalVideoMontage.g:2393:2: ( rule__AudioClip__Group_9__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_9()); 
            // InternalVideoMontage.g:2394:2: ( rule__AudioClip__Group_9__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVideoMontage.g:2394:3: rule__AudioClip__Group_9__0
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
    // InternalVideoMontage.g:2402:1: rule__AudioClip__Group__10 : rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11 ;
    public final void rule__AudioClip__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2406:1: ( rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11 )
            // InternalVideoMontage.g:2407:2: rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11
            {
            pushFollow(FOLLOW_28);
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
    // InternalVideoMontage.g:2414:1: rule__AudioClip__Group__10__Impl : ( 'audio' ) ;
    public final void rule__AudioClip__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2418:1: ( ( 'audio' ) )
            // InternalVideoMontage.g:2419:1: ( 'audio' )
            {
            // InternalVideoMontage.g:2419:1: ( 'audio' )
            // InternalVideoMontage.g:2420:2: 'audio'
            {
             before(grammarAccess.getAudioClipAccess().getAudioKeyword_10()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getAudioKeyword_10()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2429:1: rule__AudioClip__Group__11 : rule__AudioClip__Group__11__Impl rule__AudioClip__Group__12 ;
    public final void rule__AudioClip__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2433:1: ( rule__AudioClip__Group__11__Impl rule__AudioClip__Group__12 )
            // InternalVideoMontage.g:2434:2: rule__AudioClip__Group__11__Impl rule__AudioClip__Group__12
            {
            pushFollow(FOLLOW_28);
            rule__AudioClip__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__12();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:2441:1: rule__AudioClip__Group__11__Impl : ( ( rule__AudioClip__AudioAssignment_11 )* ) ;
    public final void rule__AudioClip__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2445:1: ( ( ( rule__AudioClip__AudioAssignment_11 )* ) )
            // InternalVideoMontage.g:2446:1: ( ( rule__AudioClip__AudioAssignment_11 )* )
            {
            // InternalVideoMontage.g:2446:1: ( ( rule__AudioClip__AudioAssignment_11 )* )
            // InternalVideoMontage.g:2447:2: ( rule__AudioClip__AudioAssignment_11 )*
            {
             before(grammarAccess.getAudioClipAccess().getAudioAssignment_11()); 
            // InternalVideoMontage.g:2448:2: ( rule__AudioClip__AudioAssignment_11 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalVideoMontage.g:2448:3: rule__AudioClip__AudioAssignment_11
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AudioClip__AudioAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAudioClipAccess().getAudioAssignment_11()); 

            }


            }

        }
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


    // $ANTLR start "rule__AudioClip__Group__12"
    // InternalVideoMontage.g:2456:1: rule__AudioClip__Group__12 : rule__AudioClip__Group__12__Impl ;
    public final void rule__AudioClip__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2460:1: ( rule__AudioClip__Group__12__Impl )
            // InternalVideoMontage.g:2461:2: rule__AudioClip__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__12"


    // $ANTLR start "rule__AudioClip__Group__12__Impl"
    // InternalVideoMontage.g:2467:1: rule__AudioClip__Group__12__Impl : ( '}' ) ;
    public final void rule__AudioClip__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2471:1: ( ( '}' ) )
            // InternalVideoMontage.g:2472:1: ( '}' )
            {
            // InternalVideoMontage.g:2472:1: ( '}' )
            // InternalVideoMontage.g:2473:2: '}'
            {
             before(grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_12()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__12__Impl"


    // $ANTLR start "rule__AudioClip__Group_6__0"
    // InternalVideoMontage.g:2483:1: rule__AudioClip__Group_6__0 : rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1 ;
    public final void rule__AudioClip__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2487:1: ( rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1 )
            // InternalVideoMontage.g:2488:2: rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:2495:1: rule__AudioClip__Group_6__0__Impl : ( 'volume' ) ;
    public final void rule__AudioClip__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2499:1: ( ( 'volume' ) )
            // InternalVideoMontage.g:2500:1: ( 'volume' )
            {
            // InternalVideoMontage.g:2500:1: ( 'volume' )
            // InternalVideoMontage.g:2501:2: 'volume'
            {
             before(grammarAccess.getAudioClipAccess().getVolumeKeyword_6_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalVideoMontage.g:2510:1: rule__AudioClip__Group_6__1 : rule__AudioClip__Group_6__1__Impl ;
    public final void rule__AudioClip__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2514:1: ( rule__AudioClip__Group_6__1__Impl )
            // InternalVideoMontage.g:2515:2: rule__AudioClip__Group_6__1__Impl
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
    // InternalVideoMontage.g:2521:1: rule__AudioClip__Group_6__1__Impl : ( ( rule__AudioClip__VolumeAssignment_6_1 ) ) ;
    public final void rule__AudioClip__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2525:1: ( ( ( rule__AudioClip__VolumeAssignment_6_1 ) ) )
            // InternalVideoMontage.g:2526:1: ( ( rule__AudioClip__VolumeAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:2526:1: ( ( rule__AudioClip__VolumeAssignment_6_1 ) )
            // InternalVideoMontage.g:2527:2: ( rule__AudioClip__VolumeAssignment_6_1 )
            {
             before(grammarAccess.getAudioClipAccess().getVolumeAssignment_6_1()); 
            // InternalVideoMontage.g:2528:2: ( rule__AudioClip__VolumeAssignment_6_1 )
            // InternalVideoMontage.g:2528:3: rule__AudioClip__VolumeAssignment_6_1
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
    // InternalVideoMontage.g:2537:1: rule__AudioClip__Group_7__0 : rule__AudioClip__Group_7__0__Impl rule__AudioClip__Group_7__1 ;
    public final void rule__AudioClip__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2541:1: ( rule__AudioClip__Group_7__0__Impl rule__AudioClip__Group_7__1 )
            // InternalVideoMontage.g:2542:2: rule__AudioClip__Group_7__0__Impl rule__AudioClip__Group_7__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:2549:1: rule__AudioClip__Group_7__0__Impl : ( 'startCut' ) ;
    public final void rule__AudioClip__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2553:1: ( ( 'startCut' ) )
            // InternalVideoMontage.g:2554:1: ( 'startCut' )
            {
            // InternalVideoMontage.g:2554:1: ( 'startCut' )
            // InternalVideoMontage.g:2555:2: 'startCut'
            {
             before(grammarAccess.getAudioClipAccess().getStartCutKeyword_7_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalVideoMontage.g:2564:1: rule__AudioClip__Group_7__1 : rule__AudioClip__Group_7__1__Impl ;
    public final void rule__AudioClip__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2568:1: ( rule__AudioClip__Group_7__1__Impl )
            // InternalVideoMontage.g:2569:2: rule__AudioClip__Group_7__1__Impl
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
    // InternalVideoMontage.g:2575:1: rule__AudioClip__Group_7__1__Impl : ( ( rule__AudioClip__StartCutAssignment_7_1 ) ) ;
    public final void rule__AudioClip__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2579:1: ( ( ( rule__AudioClip__StartCutAssignment_7_1 ) ) )
            // InternalVideoMontage.g:2580:1: ( ( rule__AudioClip__StartCutAssignment_7_1 ) )
            {
            // InternalVideoMontage.g:2580:1: ( ( rule__AudioClip__StartCutAssignment_7_1 ) )
            // InternalVideoMontage.g:2581:2: ( rule__AudioClip__StartCutAssignment_7_1 )
            {
             before(grammarAccess.getAudioClipAccess().getStartCutAssignment_7_1()); 
            // InternalVideoMontage.g:2582:2: ( rule__AudioClip__StartCutAssignment_7_1 )
            // InternalVideoMontage.g:2582:3: rule__AudioClip__StartCutAssignment_7_1
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
    // InternalVideoMontage.g:2591:1: rule__AudioClip__Group_8__0 : rule__AudioClip__Group_8__0__Impl rule__AudioClip__Group_8__1 ;
    public final void rule__AudioClip__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2595:1: ( rule__AudioClip__Group_8__0__Impl rule__AudioClip__Group_8__1 )
            // InternalVideoMontage.g:2596:2: rule__AudioClip__Group_8__0__Impl rule__AudioClip__Group_8__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:2603:1: rule__AudioClip__Group_8__0__Impl : ( 'endCut' ) ;
    public final void rule__AudioClip__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2607:1: ( ( 'endCut' ) )
            // InternalVideoMontage.g:2608:1: ( 'endCut' )
            {
            // InternalVideoMontage.g:2608:1: ( 'endCut' )
            // InternalVideoMontage.g:2609:2: 'endCut'
            {
             before(grammarAccess.getAudioClipAccess().getEndCutKeyword_8_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalVideoMontage.g:2618:1: rule__AudioClip__Group_8__1 : rule__AudioClip__Group_8__1__Impl ;
    public final void rule__AudioClip__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2622:1: ( rule__AudioClip__Group_8__1__Impl )
            // InternalVideoMontage.g:2623:2: rule__AudioClip__Group_8__1__Impl
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
    // InternalVideoMontage.g:2629:1: rule__AudioClip__Group_8__1__Impl : ( ( rule__AudioClip__EndCutAssignment_8_1 ) ) ;
    public final void rule__AudioClip__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2633:1: ( ( ( rule__AudioClip__EndCutAssignment_8_1 ) ) )
            // InternalVideoMontage.g:2634:1: ( ( rule__AudioClip__EndCutAssignment_8_1 ) )
            {
            // InternalVideoMontage.g:2634:1: ( ( rule__AudioClip__EndCutAssignment_8_1 ) )
            // InternalVideoMontage.g:2635:2: ( rule__AudioClip__EndCutAssignment_8_1 )
            {
             before(grammarAccess.getAudioClipAccess().getEndCutAssignment_8_1()); 
            // InternalVideoMontage.g:2636:2: ( rule__AudioClip__EndCutAssignment_8_1 )
            // InternalVideoMontage.g:2636:3: rule__AudioClip__EndCutAssignment_8_1
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
    // InternalVideoMontage.g:2645:1: rule__AudioClip__Group_9__0 : rule__AudioClip__Group_9__0__Impl rule__AudioClip__Group_9__1 ;
    public final void rule__AudioClip__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2649:1: ( rule__AudioClip__Group_9__0__Impl rule__AudioClip__Group_9__1 )
            // InternalVideoMontage.g:2650:2: rule__AudioClip__Group_9__0__Impl rule__AudioClip__Group_9__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalVideoMontage.g:2657:1: rule__AudioClip__Group_9__0__Impl : ( 'transition' ) ;
    public final void rule__AudioClip__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2661:1: ( ( 'transition' ) )
            // InternalVideoMontage.g:2662:1: ( 'transition' )
            {
            // InternalVideoMontage.g:2662:1: ( 'transition' )
            // InternalVideoMontage.g:2663:2: 'transition'
            {
             before(grammarAccess.getAudioClipAccess().getTransitionKeyword_9_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalVideoMontage.g:2672:1: rule__AudioClip__Group_9__1 : rule__AudioClip__Group_9__1__Impl ;
    public final void rule__AudioClip__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2676:1: ( rule__AudioClip__Group_9__1__Impl )
            // InternalVideoMontage.g:2677:2: rule__AudioClip__Group_9__1__Impl
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
    // InternalVideoMontage.g:2683:1: rule__AudioClip__Group_9__1__Impl : ( ( rule__AudioClip__TransitionAssignment_9_1 ) ) ;
    public final void rule__AudioClip__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2687:1: ( ( ( rule__AudioClip__TransitionAssignment_9_1 ) ) )
            // InternalVideoMontage.g:2688:1: ( ( rule__AudioClip__TransitionAssignment_9_1 ) )
            {
            // InternalVideoMontage.g:2688:1: ( ( rule__AudioClip__TransitionAssignment_9_1 ) )
            // InternalVideoMontage.g:2689:2: ( rule__AudioClip__TransitionAssignment_9_1 )
            {
             before(grammarAccess.getAudioClipAccess().getTransitionAssignment_9_1()); 
            // InternalVideoMontage.g:2690:2: ( rule__AudioClip__TransitionAssignment_9_1 )
            // InternalVideoMontage.g:2690:3: rule__AudioClip__TransitionAssignment_9_1
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


    // $ANTLR start "rule__Clip__Group__0"
    // InternalVideoMontage.g:2699:1: rule__Clip__Group__0 : rule__Clip__Group__0__Impl rule__Clip__Group__1 ;
    public final void rule__Clip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2703:1: ( rule__Clip__Group__0__Impl rule__Clip__Group__1 )
            // InternalVideoMontage.g:2704:2: rule__Clip__Group__0__Impl rule__Clip__Group__1
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
    // InternalVideoMontage.g:2711:1: rule__Clip__Group__0__Impl : ( 'Clip' ) ;
    public final void rule__Clip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2715:1: ( ( 'Clip' ) )
            // InternalVideoMontage.g:2716:1: ( 'Clip' )
            {
            // InternalVideoMontage.g:2716:1: ( 'Clip' )
            // InternalVideoMontage.g:2717:2: 'Clip'
            {
             before(grammarAccess.getClipAccess().getClipKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalVideoMontage.g:2726:1: rule__Clip__Group__1 : rule__Clip__Group__1__Impl rule__Clip__Group__2 ;
    public final void rule__Clip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2730:1: ( rule__Clip__Group__1__Impl rule__Clip__Group__2 )
            // InternalVideoMontage.g:2731:2: rule__Clip__Group__1__Impl rule__Clip__Group__2
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
    // InternalVideoMontage.g:2738:1: rule__Clip__Group__1__Impl : ( ( rule__Clip__NameAssignment_1 ) ) ;
    public final void rule__Clip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2742:1: ( ( ( rule__Clip__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:2743:1: ( ( rule__Clip__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:2743:1: ( ( rule__Clip__NameAssignment_1 ) )
            // InternalVideoMontage.g:2744:2: ( rule__Clip__NameAssignment_1 )
            {
             before(grammarAccess.getClipAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:2745:2: ( rule__Clip__NameAssignment_1 )
            // InternalVideoMontage.g:2745:3: rule__Clip__NameAssignment_1
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
    // InternalVideoMontage.g:2753:1: rule__Clip__Group__2 : rule__Clip__Group__2__Impl rule__Clip__Group__3 ;
    public final void rule__Clip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2757:1: ( rule__Clip__Group__2__Impl rule__Clip__Group__3 )
            // InternalVideoMontage.g:2758:2: rule__Clip__Group__2__Impl rule__Clip__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalVideoMontage.g:2765:1: rule__Clip__Group__2__Impl : ( '{' ) ;
    public final void rule__Clip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2769:1: ( ( '{' ) )
            // InternalVideoMontage.g:2770:1: ( '{' )
            {
            // InternalVideoMontage.g:2770:1: ( '{' )
            // InternalVideoMontage.g:2771:2: '{'
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
    // InternalVideoMontage.g:2780:1: rule__Clip__Group__3 : rule__Clip__Group__3__Impl rule__Clip__Group__4 ;
    public final void rule__Clip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2784:1: ( rule__Clip__Group__3__Impl rule__Clip__Group__4 )
            // InternalVideoMontage.g:2785:2: rule__Clip__Group__3__Impl rule__Clip__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalVideoMontage.g:2792:1: rule__Clip__Group__3__Impl : ( ( rule__Clip__Group_3__0 )? ) ;
    public final void rule__Clip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2796:1: ( ( ( rule__Clip__Group_3__0 )? ) )
            // InternalVideoMontage.g:2797:1: ( ( rule__Clip__Group_3__0 )? )
            {
            // InternalVideoMontage.g:2797:1: ( ( rule__Clip__Group_3__0 )? )
            // InternalVideoMontage.g:2798:2: ( rule__Clip__Group_3__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_3()); 
            // InternalVideoMontage.g:2799:2: ( rule__Clip__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVideoMontage.g:2799:3: rule__Clip__Group_3__0
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
    // InternalVideoMontage.g:2807:1: rule__Clip__Group__4 : rule__Clip__Group__4__Impl rule__Clip__Group__5 ;
    public final void rule__Clip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2811:1: ( rule__Clip__Group__4__Impl rule__Clip__Group__5 )
            // InternalVideoMontage.g:2812:2: rule__Clip__Group__4__Impl rule__Clip__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalVideoMontage.g:2819:1: rule__Clip__Group__4__Impl : ( ( rule__Clip__Group_4__0 )? ) ;
    public final void rule__Clip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2823:1: ( ( ( rule__Clip__Group_4__0 )? ) )
            // InternalVideoMontage.g:2824:1: ( ( rule__Clip__Group_4__0 )? )
            {
            // InternalVideoMontage.g:2824:1: ( ( rule__Clip__Group_4__0 )? )
            // InternalVideoMontage.g:2825:2: ( rule__Clip__Group_4__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_4()); 
            // InternalVideoMontage.g:2826:2: ( rule__Clip__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVideoMontage.g:2826:3: rule__Clip__Group_4__0
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
    // InternalVideoMontage.g:2834:1: rule__Clip__Group__5 : rule__Clip__Group__5__Impl rule__Clip__Group__6 ;
    public final void rule__Clip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2838:1: ( rule__Clip__Group__5__Impl rule__Clip__Group__6 )
            // InternalVideoMontage.g:2839:2: rule__Clip__Group__5__Impl rule__Clip__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoMontage.g:2846:1: rule__Clip__Group__5__Impl : ( 'video' ) ;
    public final void rule__Clip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2850:1: ( ( 'video' ) )
            // InternalVideoMontage.g:2851:1: ( 'video' )
            {
            // InternalVideoMontage.g:2851:1: ( 'video' )
            // InternalVideoMontage.g:2852:2: 'video'
            {
             before(grammarAccess.getClipAccess().getVideoKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getVideoKeyword_5()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2861:1: rule__Clip__Group__6 : rule__Clip__Group__6__Impl rule__Clip__Group__7 ;
    public final void rule__Clip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2865:1: ( rule__Clip__Group__6__Impl rule__Clip__Group__7 )
            // InternalVideoMontage.g:2866:2: rule__Clip__Group__6__Impl rule__Clip__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Clip__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__7();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:2873:1: rule__Clip__Group__6__Impl : ( ( rule__Clip__VideoAssignment_6 ) ) ;
    public final void rule__Clip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2877:1: ( ( ( rule__Clip__VideoAssignment_6 ) ) )
            // InternalVideoMontage.g:2878:1: ( ( rule__Clip__VideoAssignment_6 ) )
            {
            // InternalVideoMontage.g:2878:1: ( ( rule__Clip__VideoAssignment_6 ) )
            // InternalVideoMontage.g:2879:2: ( rule__Clip__VideoAssignment_6 )
            {
             before(grammarAccess.getClipAccess().getVideoAssignment_6()); 
            // InternalVideoMontage.g:2880:2: ( rule__Clip__VideoAssignment_6 )
            // InternalVideoMontage.g:2880:3: rule__Clip__VideoAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Clip__VideoAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getVideoAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Clip__Group__7"
    // InternalVideoMontage.g:2888:1: rule__Clip__Group__7 : rule__Clip__Group__7__Impl ;
    public final void rule__Clip__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2892:1: ( rule__Clip__Group__7__Impl )
            // InternalVideoMontage.g:2893:2: rule__Clip__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__7"


    // $ANTLR start "rule__Clip__Group__7__Impl"
    // InternalVideoMontage.g:2899:1: rule__Clip__Group__7__Impl : ( '}' ) ;
    public final void rule__Clip__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2903:1: ( ( '}' ) )
            // InternalVideoMontage.g:2904:1: ( '}' )
            {
            // InternalVideoMontage.g:2904:1: ( '}' )
            // InternalVideoMontage.g:2905:2: '}'
            {
             before(grammarAccess.getClipAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__7__Impl"


    // $ANTLR start "rule__Clip__Group_3__0"
    // InternalVideoMontage.g:2915:1: rule__Clip__Group_3__0 : rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1 ;
    public final void rule__Clip__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2919:1: ( rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1 )
            // InternalVideoMontage.g:2920:2: rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:2927:1: rule__Clip__Group_3__0__Impl : ( 'startCut' ) ;
    public final void rule__Clip__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2931:1: ( ( 'startCut' ) )
            // InternalVideoMontage.g:2932:1: ( 'startCut' )
            {
            // InternalVideoMontage.g:2932:1: ( 'startCut' )
            // InternalVideoMontage.g:2933:2: 'startCut'
            {
             before(grammarAccess.getClipAccess().getStartCutKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalVideoMontage.g:2942:1: rule__Clip__Group_3__1 : rule__Clip__Group_3__1__Impl ;
    public final void rule__Clip__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2946:1: ( rule__Clip__Group_3__1__Impl )
            // InternalVideoMontage.g:2947:2: rule__Clip__Group_3__1__Impl
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
    // InternalVideoMontage.g:2953:1: rule__Clip__Group_3__1__Impl : ( ( rule__Clip__StartCutAssignment_3_1 ) ) ;
    public final void rule__Clip__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2957:1: ( ( ( rule__Clip__StartCutAssignment_3_1 ) ) )
            // InternalVideoMontage.g:2958:1: ( ( rule__Clip__StartCutAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:2958:1: ( ( rule__Clip__StartCutAssignment_3_1 ) )
            // InternalVideoMontage.g:2959:2: ( rule__Clip__StartCutAssignment_3_1 )
            {
             before(grammarAccess.getClipAccess().getStartCutAssignment_3_1()); 
            // InternalVideoMontage.g:2960:2: ( rule__Clip__StartCutAssignment_3_1 )
            // InternalVideoMontage.g:2960:3: rule__Clip__StartCutAssignment_3_1
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
    // InternalVideoMontage.g:2969:1: rule__Clip__Group_4__0 : rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1 ;
    public final void rule__Clip__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2973:1: ( rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1 )
            // InternalVideoMontage.g:2974:2: rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:2981:1: rule__Clip__Group_4__0__Impl : ( 'endCut' ) ;
    public final void rule__Clip__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2985:1: ( ( 'endCut' ) )
            // InternalVideoMontage.g:2986:1: ( 'endCut' )
            {
            // InternalVideoMontage.g:2986:1: ( 'endCut' )
            // InternalVideoMontage.g:2987:2: 'endCut'
            {
             before(grammarAccess.getClipAccess().getEndCutKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalVideoMontage.g:2996:1: rule__Clip__Group_4__1 : rule__Clip__Group_4__1__Impl ;
    public final void rule__Clip__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3000:1: ( rule__Clip__Group_4__1__Impl )
            // InternalVideoMontage.g:3001:2: rule__Clip__Group_4__1__Impl
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
    // InternalVideoMontage.g:3007:1: rule__Clip__Group_4__1__Impl : ( ( rule__Clip__EndCutAssignment_4_1 ) ) ;
    public final void rule__Clip__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3011:1: ( ( ( rule__Clip__EndCutAssignment_4_1 ) ) )
            // InternalVideoMontage.g:3012:1: ( ( rule__Clip__EndCutAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:3012:1: ( ( rule__Clip__EndCutAssignment_4_1 ) )
            // InternalVideoMontage.g:3013:2: ( rule__Clip__EndCutAssignment_4_1 )
            {
             before(grammarAccess.getClipAccess().getEndCutAssignment_4_1()); 
            // InternalVideoMontage.g:3014:2: ( rule__Clip__EndCutAssignment_4_1 )
            // InternalVideoMontage.g:3014:3: rule__Clip__EndCutAssignment_4_1
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


    // $ANTLR start "rule__Title__Group__0"
    // InternalVideoMontage.g:3023:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3027:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalVideoMontage.g:3028:2: rule__Title__Group__0__Impl rule__Title__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:3035:1: rule__Title__Group__0__Impl : ( 'Title' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3039:1: ( ( 'Title' ) )
            // InternalVideoMontage.g:3040:1: ( 'Title' )
            {
            // InternalVideoMontage.g:3040:1: ( 'Title' )
            // InternalVideoMontage.g:3041:2: 'Title'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalVideoMontage.g:3050:1: rule__Title__Group__1 : rule__Title__Group__1__Impl rule__Title__Group__2 ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3054:1: ( rule__Title__Group__1__Impl rule__Title__Group__2 )
            // InternalVideoMontage.g:3055:2: rule__Title__Group__1__Impl rule__Title__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalVideoMontage.g:3062:1: rule__Title__Group__1__Impl : ( ( rule__Title__NameAssignment_1 ) ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3066:1: ( ( ( rule__Title__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:3067:1: ( ( rule__Title__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:3067:1: ( ( rule__Title__NameAssignment_1 ) )
            // InternalVideoMontage.g:3068:2: ( rule__Title__NameAssignment_1 )
            {
             before(grammarAccess.getTitleAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:3069:2: ( rule__Title__NameAssignment_1 )
            // InternalVideoMontage.g:3069:3: rule__Title__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3077:1: rule__Title__Group__2 : rule__Title__Group__2__Impl rule__Title__Group__3 ;
    public final void rule__Title__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3081:1: ( rule__Title__Group__2__Impl rule__Title__Group__3 )
            // InternalVideoMontage.g:3082:2: rule__Title__Group__2__Impl rule__Title__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalVideoMontage.g:3089:1: rule__Title__Group__2__Impl : ( '{' ) ;
    public final void rule__Title__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3093:1: ( ( '{' ) )
            // InternalVideoMontage.g:3094:1: ( '{' )
            {
            // InternalVideoMontage.g:3094:1: ( '{' )
            // InternalVideoMontage.g:3095:2: '{'
            {
             before(grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3104:1: rule__Title__Group__3 : rule__Title__Group__3__Impl rule__Title__Group__4 ;
    public final void rule__Title__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3108:1: ( rule__Title__Group__3__Impl rule__Title__Group__4 )
            // InternalVideoMontage.g:3109:2: rule__Title__Group__3__Impl rule__Title__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalVideoMontage.g:3116:1: rule__Title__Group__3__Impl : ( ( rule__Title__Group_3__0 )? ) ;
    public final void rule__Title__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3120:1: ( ( ( rule__Title__Group_3__0 )? ) )
            // InternalVideoMontage.g:3121:1: ( ( rule__Title__Group_3__0 )? )
            {
            // InternalVideoMontage.g:3121:1: ( ( rule__Title__Group_3__0 )? )
            // InternalVideoMontage.g:3122:2: ( rule__Title__Group_3__0 )?
            {
             before(grammarAccess.getTitleAccess().getGroup_3()); 
            // InternalVideoMontage.g:3123:2: ( rule__Title__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVideoMontage.g:3123:3: rule__Title__Group_3__0
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
    // InternalVideoMontage.g:3131:1: rule__Title__Group__4 : rule__Title__Group__4__Impl rule__Title__Group__5 ;
    public final void rule__Title__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3135:1: ( rule__Title__Group__4__Impl rule__Title__Group__5 )
            // InternalVideoMontage.g:3136:2: rule__Title__Group__4__Impl rule__Title__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalVideoMontage.g:3143:1: rule__Title__Group__4__Impl : ( ( rule__Title__Group_4__0 )? ) ;
    public final void rule__Title__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3147:1: ( ( ( rule__Title__Group_4__0 )? ) )
            // InternalVideoMontage.g:3148:1: ( ( rule__Title__Group_4__0 )? )
            {
            // InternalVideoMontage.g:3148:1: ( ( rule__Title__Group_4__0 )? )
            // InternalVideoMontage.g:3149:2: ( rule__Title__Group_4__0 )?
            {
             before(grammarAccess.getTitleAccess().getGroup_4()); 
            // InternalVideoMontage.g:3150:2: ( rule__Title__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVideoMontage.g:3150:3: rule__Title__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Title__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTitleAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3158:1: rule__Title__Group__5 : rule__Title__Group__5__Impl rule__Title__Group__6 ;
    public final void rule__Title__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3162:1: ( rule__Title__Group__5__Impl rule__Title__Group__6 )
            // InternalVideoMontage.g:3163:2: rule__Title__Group__5__Impl rule__Title__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalVideoMontage.g:3170:1: rule__Title__Group__5__Impl : ( 'textArea' ) ;
    public final void rule__Title__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3174:1: ( ( 'textArea' ) )
            // InternalVideoMontage.g:3175:1: ( 'textArea' )
            {
            // InternalVideoMontage.g:3175:1: ( 'textArea' )
            // InternalVideoMontage.g:3176:2: 'textArea'
            {
             before(grammarAccess.getTitleAccess().getTextAreaKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTextAreaKeyword_5()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3185:1: rule__Title__Group__6 : rule__Title__Group__6__Impl rule__Title__Group__7 ;
    public final void rule__Title__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3189:1: ( rule__Title__Group__6__Impl rule__Title__Group__7 )
            // InternalVideoMontage.g:3190:2: rule__Title__Group__6__Impl rule__Title__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Title__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__7();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:3197:1: rule__Title__Group__6__Impl : ( ( rule__Title__TextareaAssignment_6 ) ) ;
    public final void rule__Title__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3201:1: ( ( ( rule__Title__TextareaAssignment_6 ) ) )
            // InternalVideoMontage.g:3202:1: ( ( rule__Title__TextareaAssignment_6 ) )
            {
            // InternalVideoMontage.g:3202:1: ( ( rule__Title__TextareaAssignment_6 ) )
            // InternalVideoMontage.g:3203:2: ( rule__Title__TextareaAssignment_6 )
            {
             before(grammarAccess.getTitleAccess().getTextareaAssignment_6()); 
            // InternalVideoMontage.g:3204:2: ( rule__Title__TextareaAssignment_6 )
            // InternalVideoMontage.g:3204:3: rule__Title__TextareaAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Title__TextareaAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getTextareaAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Title__Group__7"
    // InternalVideoMontage.g:3212:1: rule__Title__Group__7 : rule__Title__Group__7__Impl ;
    public final void rule__Title__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3216:1: ( rule__Title__Group__7__Impl )
            // InternalVideoMontage.g:3217:2: rule__Title__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__7"


    // $ANTLR start "rule__Title__Group__7__Impl"
    // InternalVideoMontage.g:3223:1: rule__Title__Group__7__Impl : ( '}' ) ;
    public final void rule__Title__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3227:1: ( ( '}' ) )
            // InternalVideoMontage.g:3228:1: ( '}' )
            {
            // InternalVideoMontage.g:3228:1: ( '}' )
            // InternalVideoMontage.g:3229:2: '}'
            {
             before(grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__7__Impl"


    // $ANTLR start "rule__Title__Group_3__0"
    // InternalVideoMontage.g:3239:1: rule__Title__Group_3__0 : rule__Title__Group_3__0__Impl rule__Title__Group_3__1 ;
    public final void rule__Title__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3243:1: ( rule__Title__Group_3__0__Impl rule__Title__Group_3__1 )
            // InternalVideoMontage.g:3244:2: rule__Title__Group_3__0__Impl rule__Title__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:3251:1: rule__Title__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__Title__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3255:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:3256:1: ( 'duration' )
            {
            // InternalVideoMontage.g:3256:1: ( 'duration' )
            // InternalVideoMontage.g:3257:2: 'duration'
            {
             before(grammarAccess.getTitleAccess().getDurationKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getDurationKeyword_3_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3266:1: rule__Title__Group_3__1 : rule__Title__Group_3__1__Impl ;
    public final void rule__Title__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3270:1: ( rule__Title__Group_3__1__Impl )
            // InternalVideoMontage.g:3271:2: rule__Title__Group_3__1__Impl
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
    // InternalVideoMontage.g:3277:1: rule__Title__Group_3__1__Impl : ( ( rule__Title__DurationAssignment_3_1 ) ) ;
    public final void rule__Title__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3281:1: ( ( ( rule__Title__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:3282:1: ( ( rule__Title__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:3282:1: ( ( rule__Title__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:3283:2: ( rule__Title__DurationAssignment_3_1 )
            {
             before(grammarAccess.getTitleAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:3284:2: ( rule__Title__DurationAssignment_3_1 )
            // InternalVideoMontage.g:3284:3: rule__Title__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getDurationAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Title__Group_4__0"
    // InternalVideoMontage.g:3293:1: rule__Title__Group_4__0 : rule__Title__Group_4__0__Impl rule__Title__Group_4__1 ;
    public final void rule__Title__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3297:1: ( rule__Title__Group_4__0__Impl rule__Title__Group_4__1 )
            // InternalVideoMontage.g:3298:2: rule__Title__Group_4__0__Impl rule__Title__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__Title__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_4__0"


    // $ANTLR start "rule__Title__Group_4__0__Impl"
    // InternalVideoMontage.g:3305:1: rule__Title__Group_4__0__Impl : ( 'backgroundColor' ) ;
    public final void rule__Title__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3309:1: ( ( 'backgroundColor' ) )
            // InternalVideoMontage.g:3310:1: ( 'backgroundColor' )
            {
            // InternalVideoMontage.g:3310:1: ( 'backgroundColor' )
            // InternalVideoMontage.g:3311:2: 'backgroundColor'
            {
             before(grammarAccess.getTitleAccess().getBackgroundColorKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getBackgroundColorKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_4__0__Impl"


    // $ANTLR start "rule__Title__Group_4__1"
    // InternalVideoMontage.g:3320:1: rule__Title__Group_4__1 : rule__Title__Group_4__1__Impl ;
    public final void rule__Title__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3324:1: ( rule__Title__Group_4__1__Impl )
            // InternalVideoMontage.g:3325:2: rule__Title__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_4__1"


    // $ANTLR start "rule__Title__Group_4__1__Impl"
    // InternalVideoMontage.g:3331:1: rule__Title__Group_4__1__Impl : ( ( rule__Title__BackgroundColorAssignment_4_1 ) ) ;
    public final void rule__Title__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3335:1: ( ( ( rule__Title__BackgroundColorAssignment_4_1 ) ) )
            // InternalVideoMontage.g:3336:1: ( ( rule__Title__BackgroundColorAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:3336:1: ( ( rule__Title__BackgroundColorAssignment_4_1 ) )
            // InternalVideoMontage.g:3337:2: ( rule__Title__BackgroundColorAssignment_4_1 )
            {
             before(grammarAccess.getTitleAccess().getBackgroundColorAssignment_4_1()); 
            // InternalVideoMontage.g:3338:2: ( rule__Title__BackgroundColorAssignment_4_1 )
            // InternalVideoMontage.g:3338:3: rule__Title__BackgroundColorAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__BackgroundColorAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getBackgroundColorAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_4__1__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // InternalVideoMontage.g:3347:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3351:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalVideoMontage.g:3352:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalVideoMontage.g:3359:1: rule__Video__Group__0__Impl : ( ( rule__Video__NameAssignment_0 ) ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3363:1: ( ( ( rule__Video__NameAssignment_0 ) ) )
            // InternalVideoMontage.g:3364:1: ( ( rule__Video__NameAssignment_0 ) )
            {
            // InternalVideoMontage.g:3364:1: ( ( rule__Video__NameAssignment_0 ) )
            // InternalVideoMontage.g:3365:2: ( rule__Video__NameAssignment_0 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_0()); 
            // InternalVideoMontage.g:3366:2: ( rule__Video__NameAssignment_0 )
            // InternalVideoMontage.g:3366:3: rule__Video__NameAssignment_0
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
    // InternalVideoMontage.g:3374:1: rule__Video__Group__1 : rule__Video__Group__1__Impl ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3378:1: ( rule__Video__Group__1__Impl )
            // InternalVideoMontage.g:3379:2: rule__Video__Group__1__Impl
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
    // InternalVideoMontage.g:3385:1: rule__Video__Group__1__Impl : ( ( rule__Video__Group_1__0 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3389:1: ( ( ( rule__Video__Group_1__0 ) ) )
            // InternalVideoMontage.g:3390:1: ( ( rule__Video__Group_1__0 ) )
            {
            // InternalVideoMontage.g:3390:1: ( ( rule__Video__Group_1__0 ) )
            // InternalVideoMontage.g:3391:2: ( rule__Video__Group_1__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup_1()); 
            // InternalVideoMontage.g:3392:2: ( rule__Video__Group_1__0 )
            // InternalVideoMontage.g:3392:3: rule__Video__Group_1__0
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
    // InternalVideoMontage.g:3401:1: rule__Video__Group_1__0 : rule__Video__Group_1__0__Impl rule__Video__Group_1__1 ;
    public final void rule__Video__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3405:1: ( rule__Video__Group_1__0__Impl rule__Video__Group_1__1 )
            // InternalVideoMontage.g:3406:2: rule__Video__Group_1__0__Impl rule__Video__Group_1__1
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
    // InternalVideoMontage.g:3413:1: rule__Video__Group_1__0__Impl : ( 'path' ) ;
    public final void rule__Video__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3417:1: ( ( 'path' ) )
            // InternalVideoMontage.g:3418:1: ( 'path' )
            {
            // InternalVideoMontage.g:3418:1: ( 'path' )
            // InternalVideoMontage.g:3419:2: 'path'
            {
             before(grammarAccess.getVideoAccess().getPathKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalVideoMontage.g:3428:1: rule__Video__Group_1__1 : rule__Video__Group_1__1__Impl ;
    public final void rule__Video__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3432:1: ( rule__Video__Group_1__1__Impl )
            // InternalVideoMontage.g:3433:2: rule__Video__Group_1__1__Impl
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
    // InternalVideoMontage.g:3439:1: rule__Video__Group_1__1__Impl : ( ( rule__Video__PathAssignment_1_1 ) ) ;
    public final void rule__Video__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3443:1: ( ( ( rule__Video__PathAssignment_1_1 ) ) )
            // InternalVideoMontage.g:3444:1: ( ( rule__Video__PathAssignment_1_1 ) )
            {
            // InternalVideoMontage.g:3444:1: ( ( rule__Video__PathAssignment_1_1 ) )
            // InternalVideoMontage.g:3445:2: ( rule__Video__PathAssignment_1_1 )
            {
             before(grammarAccess.getVideoAccess().getPathAssignment_1_1()); 
            // InternalVideoMontage.g:3446:2: ( rule__Video__PathAssignment_1_1 )
            // InternalVideoMontage.g:3446:3: rule__Video__PathAssignment_1_1
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
    // InternalVideoMontage.g:3455:1: rule__RelativeMoment__Group__0 : rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1 ;
    public final void rule__RelativeMoment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3459:1: ( rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1 )
            // InternalVideoMontage.g:3460:2: rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalVideoMontage.g:3467:1: rule__RelativeMoment__Group__0__Impl : ( () ) ;
    public final void rule__RelativeMoment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3471:1: ( ( () ) )
            // InternalVideoMontage.g:3472:1: ( () )
            {
            // InternalVideoMontage.g:3472:1: ( () )
            // InternalVideoMontage.g:3473:2: ()
            {
             before(grammarAccess.getRelativeMomentAccess().getRelativeMomentAction_0()); 
            // InternalVideoMontage.g:3474:2: ()
            // InternalVideoMontage.g:3474:3: 
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
    // InternalVideoMontage.g:3482:1: rule__RelativeMoment__Group__1 : rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2 ;
    public final void rule__RelativeMoment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3486:1: ( rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2 )
            // InternalVideoMontage.g:3487:2: rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalVideoMontage.g:3494:1: rule__RelativeMoment__Group__1__Impl : ( ( rule__RelativeMoment__MomentAssignment_1 )? ) ;
    public final void rule__RelativeMoment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3498:1: ( ( ( rule__RelativeMoment__MomentAssignment_1 )? ) )
            // InternalVideoMontage.g:3499:1: ( ( rule__RelativeMoment__MomentAssignment_1 )? )
            {
            // InternalVideoMontage.g:3499:1: ( ( rule__RelativeMoment__MomentAssignment_1 )? )
            // InternalVideoMontage.g:3500:2: ( rule__RelativeMoment__MomentAssignment_1 )?
            {
             before(grammarAccess.getRelativeMomentAccess().getMomentAssignment_1()); 
            // InternalVideoMontage.g:3501:2: ( rule__RelativeMoment__MomentAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=17 && LA26_0<=18)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVideoMontage.g:3501:3: rule__RelativeMoment__MomentAssignment_1
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
    // InternalVideoMontage.g:3509:1: rule__RelativeMoment__Group__2 : rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3 ;
    public final void rule__RelativeMoment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3513:1: ( rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3 )
            // InternalVideoMontage.g:3514:2: rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoMontage.g:3521:1: rule__RelativeMoment__Group__2__Impl : ( 'of' ) ;
    public final void rule__RelativeMoment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3525:1: ( ( 'of' ) )
            // InternalVideoMontage.g:3526:1: ( 'of' )
            {
            // InternalVideoMontage.g:3526:1: ( 'of' )
            // InternalVideoMontage.g:3527:2: 'of'
            {
             before(grammarAccess.getRelativeMomentAccess().getOfKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalVideoMontage.g:3536:1: rule__RelativeMoment__Group__3 : rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4 ;
    public final void rule__RelativeMoment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3540:1: ( rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4 )
            // InternalVideoMontage.g:3541:2: rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalVideoMontage.g:3548:1: rule__RelativeMoment__Group__3__Impl : ( ( rule__RelativeMoment__ElementAssignment_3 ) ) ;
    public final void rule__RelativeMoment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3552:1: ( ( ( rule__RelativeMoment__ElementAssignment_3 ) ) )
            // InternalVideoMontage.g:3553:1: ( ( rule__RelativeMoment__ElementAssignment_3 ) )
            {
            // InternalVideoMontage.g:3553:1: ( ( rule__RelativeMoment__ElementAssignment_3 ) )
            // InternalVideoMontage.g:3554:2: ( rule__RelativeMoment__ElementAssignment_3 )
            {
             before(grammarAccess.getRelativeMomentAccess().getElementAssignment_3()); 
            // InternalVideoMontage.g:3555:2: ( rule__RelativeMoment__ElementAssignment_3 )
            // InternalVideoMontage.g:3555:3: rule__RelativeMoment__ElementAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__ElementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelativeMomentAccess().getElementAssignment_3()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3563:1: rule__RelativeMoment__Group__4 : rule__RelativeMoment__Group__4__Impl ;
    public final void rule__RelativeMoment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3567:1: ( rule__RelativeMoment__Group__4__Impl )
            // InternalVideoMontage.g:3568:2: rule__RelativeMoment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:3574:1: rule__RelativeMoment__Group__4__Impl : ( ( rule__RelativeMoment__Group_4__0 )? ) ;
    public final void rule__RelativeMoment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3578:1: ( ( ( rule__RelativeMoment__Group_4__0 )? ) )
            // InternalVideoMontage.g:3579:1: ( ( rule__RelativeMoment__Group_4__0 )? )
            {
            // InternalVideoMontage.g:3579:1: ( ( rule__RelativeMoment__Group_4__0 )? )
            // InternalVideoMontage.g:3580:2: ( rule__RelativeMoment__Group_4__0 )?
            {
             before(grammarAccess.getRelativeMomentAccess().getGroup_4()); 
            // InternalVideoMontage.g:3581:2: ( rule__RelativeMoment__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=15 && LA27_0<=16)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVideoMontage.g:3581:3: rule__RelativeMoment__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelativeMoment__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelativeMomentAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__RelativeMoment__Group_4__0"
    // InternalVideoMontage.g:3590:1: rule__RelativeMoment__Group_4__0 : rule__RelativeMoment__Group_4__0__Impl rule__RelativeMoment__Group_4__1 ;
    public final void rule__RelativeMoment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3594:1: ( rule__RelativeMoment__Group_4__0__Impl rule__RelativeMoment__Group_4__1 )
            // InternalVideoMontage.g:3595:2: rule__RelativeMoment__Group_4__0__Impl rule__RelativeMoment__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__RelativeMoment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group_4__0"


    // $ANTLR start "rule__RelativeMoment__Group_4__0__Impl"
    // InternalVideoMontage.g:3602:1: rule__RelativeMoment__Group_4__0__Impl : ( ( rule__RelativeMoment__OperationMomentAssignment_4_0 ) ) ;
    public final void rule__RelativeMoment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3606:1: ( ( ( rule__RelativeMoment__OperationMomentAssignment_4_0 ) ) )
            // InternalVideoMontage.g:3607:1: ( ( rule__RelativeMoment__OperationMomentAssignment_4_0 ) )
            {
            // InternalVideoMontage.g:3607:1: ( ( rule__RelativeMoment__OperationMomentAssignment_4_0 ) )
            // InternalVideoMontage.g:3608:2: ( rule__RelativeMoment__OperationMomentAssignment_4_0 )
            {
             before(grammarAccess.getRelativeMomentAccess().getOperationMomentAssignment_4_0()); 
            // InternalVideoMontage.g:3609:2: ( rule__RelativeMoment__OperationMomentAssignment_4_0 )
            // InternalVideoMontage.g:3609:3: rule__RelativeMoment__OperationMomentAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__OperationMomentAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRelativeMomentAccess().getOperationMomentAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group_4__0__Impl"


    // $ANTLR start "rule__RelativeMoment__Group_4__1"
    // InternalVideoMontage.g:3617:1: rule__RelativeMoment__Group_4__1 : rule__RelativeMoment__Group_4__1__Impl ;
    public final void rule__RelativeMoment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3621:1: ( rule__RelativeMoment__Group_4__1__Impl )
            // InternalVideoMontage.g:3622:2: rule__RelativeMoment__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group_4__1"


    // $ANTLR start "rule__RelativeMoment__Group_4__1__Impl"
    // InternalVideoMontage.g:3628:1: rule__RelativeMoment__Group_4__1__Impl : ( ( rule__RelativeMoment__ValueAssignment_4_1 ) ) ;
    public final void rule__RelativeMoment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3632:1: ( ( ( rule__RelativeMoment__ValueAssignment_4_1 ) ) )
            // InternalVideoMontage.g:3633:1: ( ( rule__RelativeMoment__ValueAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:3633:1: ( ( rule__RelativeMoment__ValueAssignment_4_1 ) )
            // InternalVideoMontage.g:3634:2: ( rule__RelativeMoment__ValueAssignment_4_1 )
            {
             before(grammarAccess.getRelativeMomentAccess().getValueAssignment_4_1()); 
            // InternalVideoMontage.g:3635:2: ( rule__RelativeMoment__ValueAssignment_4_1 )
            // InternalVideoMontage.g:3635:3: rule__RelativeMoment__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeMomentAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group_4__1__Impl"


    // $ANTLR start "rule__AbsoluteMoment__Group__0"
    // InternalVideoMontage.g:3644:1: rule__AbsoluteMoment__Group__0 : rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1 ;
    public final void rule__AbsoluteMoment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3648:1: ( rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1 )
            // InternalVideoMontage.g:3649:2: rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalVideoMontage.g:3656:1: rule__AbsoluteMoment__Group__0__Impl : ( () ) ;
    public final void rule__AbsoluteMoment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3660:1: ( ( () ) )
            // InternalVideoMontage.g:3661:1: ( () )
            {
            // InternalVideoMontage.g:3661:1: ( () )
            // InternalVideoMontage.g:3662:2: ()
            {
             before(grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentAction_0()); 
            // InternalVideoMontage.g:3663:2: ()
            // InternalVideoMontage.g:3663:3: 
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
    // InternalVideoMontage.g:3671:1: rule__AbsoluteMoment__Group__1 : rule__AbsoluteMoment__Group__1__Impl ;
    public final void rule__AbsoluteMoment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3675:1: ( rule__AbsoluteMoment__Group__1__Impl )
            // InternalVideoMontage.g:3676:2: rule__AbsoluteMoment__Group__1__Impl
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
    // InternalVideoMontage.g:3682:1: rule__AbsoluteMoment__Group__1__Impl : ( ( rule__AbsoluteMoment__Group_1__0 )? ) ;
    public final void rule__AbsoluteMoment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3686:1: ( ( ( rule__AbsoluteMoment__Group_1__0 )? ) )
            // InternalVideoMontage.g:3687:1: ( ( rule__AbsoluteMoment__Group_1__0 )? )
            {
            // InternalVideoMontage.g:3687:1: ( ( rule__AbsoluteMoment__Group_1__0 )? )
            // InternalVideoMontage.g:3688:2: ( rule__AbsoluteMoment__Group_1__0 )?
            {
             before(grammarAccess.getAbsoluteMomentAccess().getGroup_1()); 
            // InternalVideoMontage.g:3689:2: ( rule__AbsoluteMoment__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVideoMontage.g:3689:3: rule__AbsoluteMoment__Group_1__0
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
    // InternalVideoMontage.g:3698:1: rule__AbsoluteMoment__Group_1__0 : rule__AbsoluteMoment__Group_1__0__Impl rule__AbsoluteMoment__Group_1__1 ;
    public final void rule__AbsoluteMoment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3702:1: ( rule__AbsoluteMoment__Group_1__0__Impl rule__AbsoluteMoment__Group_1__1 )
            // InternalVideoMontage.g:3703:2: rule__AbsoluteMoment__Group_1__0__Impl rule__AbsoluteMoment__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:3710:1: rule__AbsoluteMoment__Group_1__0__Impl : ( 'time' ) ;
    public final void rule__AbsoluteMoment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3714:1: ( ( 'time' ) )
            // InternalVideoMontage.g:3715:1: ( 'time' )
            {
            // InternalVideoMontage.g:3715:1: ( 'time' )
            // InternalVideoMontage.g:3716:2: 'time'
            {
             before(grammarAccess.getAbsoluteMomentAccess().getTimeKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalVideoMontage.g:3725:1: rule__AbsoluteMoment__Group_1__1 : rule__AbsoluteMoment__Group_1__1__Impl ;
    public final void rule__AbsoluteMoment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3729:1: ( rule__AbsoluteMoment__Group_1__1__Impl )
            // InternalVideoMontage.g:3730:2: rule__AbsoluteMoment__Group_1__1__Impl
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
    // InternalVideoMontage.g:3736:1: rule__AbsoluteMoment__Group_1__1__Impl : ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) ) ;
    public final void rule__AbsoluteMoment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3740:1: ( ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) ) )
            // InternalVideoMontage.g:3741:1: ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) )
            {
            // InternalVideoMontage.g:3741:1: ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) )
            // InternalVideoMontage.g:3742:2: ( rule__AbsoluteMoment__TimeAssignment_1_1 )
            {
             before(grammarAccess.getAbsoluteMomentAccess().getTimeAssignment_1_1()); 
            // InternalVideoMontage.g:3743:2: ( rule__AbsoluteMoment__TimeAssignment_1_1 )
            // InternalVideoMontage.g:3743:3: rule__AbsoluteMoment__TimeAssignment_1_1
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
    // InternalVideoMontage.g:3752:1: rule__StartingMoment_Impl__Group__0 : rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1 ;
    public final void rule__StartingMoment_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3756:1: ( rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1 )
            // InternalVideoMontage.g:3757:2: rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1
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
    // InternalVideoMontage.g:3764:1: rule__StartingMoment_Impl__Group__0__Impl : ( () ) ;
    public final void rule__StartingMoment_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3768:1: ( ( () ) )
            // InternalVideoMontage.g:3769:1: ( () )
            {
            // InternalVideoMontage.g:3769:1: ( () )
            // InternalVideoMontage.g:3770:2: ()
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getStartingMomentAction_0()); 
            // InternalVideoMontage.g:3771:2: ()
            // InternalVideoMontage.g:3771:3: 
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
    // InternalVideoMontage.g:3779:1: rule__StartingMoment_Impl__Group__1 : rule__StartingMoment_Impl__Group__1__Impl ;
    public final void rule__StartingMoment_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3783:1: ( rule__StartingMoment_Impl__Group__1__Impl )
            // InternalVideoMontage.g:3784:2: rule__StartingMoment_Impl__Group__1__Impl
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
    // InternalVideoMontage.g:3790:1: rule__StartingMoment_Impl__Group__1__Impl : ( 'StartingMoment' ) ;
    public final void rule__StartingMoment_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3794:1: ( ( 'StartingMoment' ) )
            // InternalVideoMontage.g:3795:1: ( 'StartingMoment' )
            {
            // InternalVideoMontage.g:3795:1: ( 'StartingMoment' )
            // InternalVideoMontage.g:3796:2: 'StartingMoment'
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getStartingMomentKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalVideoMontage.g:3806:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3810:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalVideoMontage.g:3811:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalVideoMontage.g:3818:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3822:1: ( ( 'Transition' ) )
            // InternalVideoMontage.g:3823:1: ( 'Transition' )
            {
            // InternalVideoMontage.g:3823:1: ( 'Transition' )
            // InternalVideoMontage.g:3824:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalVideoMontage.g:3833:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3837:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalVideoMontage.g:3838:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalVideoMontage.g:3845:1: rule__Transition__Group__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3849:1: ( ( '{' ) )
            // InternalVideoMontage.g:3850:1: ( '{' )
            {
            // InternalVideoMontage.g:3850:1: ( '{' )
            // InternalVideoMontage.g:3851:2: '{'
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
    // InternalVideoMontage.g:3860:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3864:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalVideoMontage.g:3865:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalVideoMontage.g:3872:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3876:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalVideoMontage.g:3877:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalVideoMontage.g:3877:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalVideoMontage.g:3878:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalVideoMontage.g:3879:2: ( rule__Transition__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVideoMontage.g:3879:3: rule__Transition__Group_2__0
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
    // InternalVideoMontage.g:3887:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3891:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalVideoMontage.g:3892:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalVideoMontage.g:3899:1: rule__Transition__Group__3__Impl : ( 'audioElement' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3903:1: ( ( 'audioElement' ) )
            // InternalVideoMontage.g:3904:1: ( 'audioElement' )
            {
            // InternalVideoMontage.g:3904:1: ( 'audioElement' )
            // InternalVideoMontage.g:3905:2: 'audioElement'
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
    // InternalVideoMontage.g:3914:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3918:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalVideoMontage.g:3919:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalVideoMontage.g:3926:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__AudioelementAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3930:1: ( ( ( rule__Transition__AudioelementAssignment_4 ) ) )
            // InternalVideoMontage.g:3931:1: ( ( rule__Transition__AudioelementAssignment_4 ) )
            {
            // InternalVideoMontage.g:3931:1: ( ( rule__Transition__AudioelementAssignment_4 ) )
            // InternalVideoMontage.g:3932:2: ( rule__Transition__AudioelementAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getAudioelementAssignment_4()); 
            // InternalVideoMontage.g:3933:2: ( rule__Transition__AudioelementAssignment_4 )
            // InternalVideoMontage.g:3933:3: rule__Transition__AudioelementAssignment_4
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
    // InternalVideoMontage.g:3941:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3945:1: ( rule__Transition__Group__5__Impl )
            // InternalVideoMontage.g:3946:2: rule__Transition__Group__5__Impl
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
    // InternalVideoMontage.g:3952:1: rule__Transition__Group__5__Impl : ( '}' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3956:1: ( ( '}' ) )
            // InternalVideoMontage.g:3957:1: ( '}' )
            {
            // InternalVideoMontage.g:3957:1: ( '}' )
            // InternalVideoMontage.g:3958:2: '}'
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
    // InternalVideoMontage.g:3968:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3972:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalVideoMontage.g:3973:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:3980:1: rule__Transition__Group_2__0__Impl : ( 'duration' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3984:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:3985:1: ( 'duration' )
            {
            // InternalVideoMontage.g:3985:1: ( 'duration' )
            // InternalVideoMontage.g:3986:2: 'duration'
            {
             before(grammarAccess.getTransitionAccess().getDurationKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalVideoMontage.g:3995:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3999:1: ( rule__Transition__Group_2__1__Impl )
            // InternalVideoMontage.g:4000:2: rule__Transition__Group_2__1__Impl
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
    // InternalVideoMontage.g:4006:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__DurationAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4010:1: ( ( ( rule__Transition__DurationAssignment_2_1 ) ) )
            // InternalVideoMontage.g:4011:1: ( ( rule__Transition__DurationAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:4011:1: ( ( rule__Transition__DurationAssignment_2_1 ) )
            // InternalVideoMontage.g:4012:2: ( rule__Transition__DurationAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getDurationAssignment_2_1()); 
            // InternalVideoMontage.g:4013:2: ( rule__Transition__DurationAssignment_2_1 )
            // InternalVideoMontage.g:4013:3: rule__Transition__DurationAssignment_2_1
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


    // $ANTLR start "rule__TextArea_Impl__Group__0"
    // InternalVideoMontage.g:4022:1: rule__TextArea_Impl__Group__0 : rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1 ;
    public final void rule__TextArea_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4026:1: ( rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1 )
            // InternalVideoMontage.g:4027:2: rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1
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
    // InternalVideoMontage.g:4034:1: rule__TextArea_Impl__Group__0__Impl : ( 'TextArea' ) ;
    public final void rule__TextArea_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4038:1: ( ( 'TextArea' ) )
            // InternalVideoMontage.g:4039:1: ( 'TextArea' )
            {
            // InternalVideoMontage.g:4039:1: ( 'TextArea' )
            // InternalVideoMontage.g:4040:2: 'TextArea'
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
    // InternalVideoMontage.g:4049:1: rule__TextArea_Impl__Group__1 : rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2 ;
    public final void rule__TextArea_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4053:1: ( rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2 )
            // InternalVideoMontage.g:4054:2: rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalVideoMontage.g:4061:1: rule__TextArea_Impl__Group__1__Impl : ( '{' ) ;
    public final void rule__TextArea_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4065:1: ( ( '{' ) )
            // InternalVideoMontage.g:4066:1: ( '{' )
            {
            // InternalVideoMontage.g:4066:1: ( '{' )
            // InternalVideoMontage.g:4067:2: '{'
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
    // InternalVideoMontage.g:4076:1: rule__TextArea_Impl__Group__2 : rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3 ;
    public final void rule__TextArea_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4080:1: ( rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3 )
            // InternalVideoMontage.g:4081:2: rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalVideoMontage.g:4088:1: rule__TextArea_Impl__Group__2__Impl : ( ( rule__TextArea_Impl__Group_2__0 )? ) ;
    public final void rule__TextArea_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4092:1: ( ( ( rule__TextArea_Impl__Group_2__0 )? ) )
            // InternalVideoMontage.g:4093:1: ( ( rule__TextArea_Impl__Group_2__0 )? )
            {
            // InternalVideoMontage.g:4093:1: ( ( rule__TextArea_Impl__Group_2__0 )? )
            // InternalVideoMontage.g:4094:2: ( rule__TextArea_Impl__Group_2__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_2()); 
            // InternalVideoMontage.g:4095:2: ( rule__TextArea_Impl__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVideoMontage.g:4095:3: rule__TextArea_Impl__Group_2__0
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
    // InternalVideoMontage.g:4103:1: rule__TextArea_Impl__Group__3 : rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4 ;
    public final void rule__TextArea_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4107:1: ( rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4 )
            // InternalVideoMontage.g:4108:2: rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalVideoMontage.g:4115:1: rule__TextArea_Impl__Group__3__Impl : ( ( rule__TextArea_Impl__Group_3__0 )? ) ;
    public final void rule__TextArea_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4119:1: ( ( ( rule__TextArea_Impl__Group_3__0 )? ) )
            // InternalVideoMontage.g:4120:1: ( ( rule__TextArea_Impl__Group_3__0 )? )
            {
            // InternalVideoMontage.g:4120:1: ( ( rule__TextArea_Impl__Group_3__0 )? )
            // InternalVideoMontage.g:4121:2: ( rule__TextArea_Impl__Group_3__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_3()); 
            // InternalVideoMontage.g:4122:2: ( rule__TextArea_Impl__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVideoMontage.g:4122:3: rule__TextArea_Impl__Group_3__0
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
    // InternalVideoMontage.g:4130:1: rule__TextArea_Impl__Group__4 : rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5 ;
    public final void rule__TextArea_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4134:1: ( rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5 )
            // InternalVideoMontage.g:4135:2: rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalVideoMontage.g:4142:1: rule__TextArea_Impl__Group__4__Impl : ( ( rule__TextArea_Impl__Group_4__0 )? ) ;
    public final void rule__TextArea_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4146:1: ( ( ( rule__TextArea_Impl__Group_4__0 )? ) )
            // InternalVideoMontage.g:4147:1: ( ( rule__TextArea_Impl__Group_4__0 )? )
            {
            // InternalVideoMontage.g:4147:1: ( ( rule__TextArea_Impl__Group_4__0 )? )
            // InternalVideoMontage.g:4148:2: ( rule__TextArea_Impl__Group_4__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_4()); 
            // InternalVideoMontage.g:4149:2: ( rule__TextArea_Impl__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVideoMontage.g:4149:3: rule__TextArea_Impl__Group_4__0
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
    // InternalVideoMontage.g:4157:1: rule__TextArea_Impl__Group__5 : rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6 ;
    public final void rule__TextArea_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4161:1: ( rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6 )
            // InternalVideoMontage.g:4162:2: rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6
            {
            pushFollow(FOLLOW_37);
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
    // InternalVideoMontage.g:4169:1: rule__TextArea_Impl__Group__5__Impl : ( ( rule__TextArea_Impl__Group_5__0 )? ) ;
    public final void rule__TextArea_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4173:1: ( ( ( rule__TextArea_Impl__Group_5__0 )? ) )
            // InternalVideoMontage.g:4174:1: ( ( rule__TextArea_Impl__Group_5__0 )? )
            {
            // InternalVideoMontage.g:4174:1: ( ( rule__TextArea_Impl__Group_5__0 )? )
            // InternalVideoMontage.g:4175:2: ( rule__TextArea_Impl__Group_5__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_5()); 
            // InternalVideoMontage.g:4176:2: ( rule__TextArea_Impl__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVideoMontage.g:4176:3: rule__TextArea_Impl__Group_5__0
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
    // InternalVideoMontage.g:4184:1: rule__TextArea_Impl__Group__6 : rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7 ;
    public final void rule__TextArea_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4188:1: ( rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7 )
            // InternalVideoMontage.g:4189:2: rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7
            {
            pushFollow(FOLLOW_38);
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
    // InternalVideoMontage.g:4196:1: rule__TextArea_Impl__Group__6__Impl : ( ( rule__TextArea_Impl__Group_6__0 ) ) ;
    public final void rule__TextArea_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4200:1: ( ( ( rule__TextArea_Impl__Group_6__0 ) ) )
            // InternalVideoMontage.g:4201:1: ( ( rule__TextArea_Impl__Group_6__0 ) )
            {
            // InternalVideoMontage.g:4201:1: ( ( rule__TextArea_Impl__Group_6__0 ) )
            // InternalVideoMontage.g:4202:2: ( rule__TextArea_Impl__Group_6__0 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_6()); 
            // InternalVideoMontage.g:4203:2: ( rule__TextArea_Impl__Group_6__0 )
            // InternalVideoMontage.g:4203:3: rule__TextArea_Impl__Group_6__0
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
    // InternalVideoMontage.g:4211:1: rule__TextArea_Impl__Group__7 : rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8 ;
    public final void rule__TextArea_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4215:1: ( rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8 )
            // InternalVideoMontage.g:4216:2: rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8
            {
            pushFollow(FOLLOW_38);
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
    // InternalVideoMontage.g:4223:1: rule__TextArea_Impl__Group__7__Impl : ( ( rule__TextArea_Impl__Group_7__0 )? ) ;
    public final void rule__TextArea_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4227:1: ( ( ( rule__TextArea_Impl__Group_7__0 )? ) )
            // InternalVideoMontage.g:4228:1: ( ( rule__TextArea_Impl__Group_7__0 )? )
            {
            // InternalVideoMontage.g:4228:1: ( ( rule__TextArea_Impl__Group_7__0 )? )
            // InternalVideoMontage.g:4229:2: ( rule__TextArea_Impl__Group_7__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_7()); 
            // InternalVideoMontage.g:4230:2: ( rule__TextArea_Impl__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVideoMontage.g:4230:3: rule__TextArea_Impl__Group_7__0
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
    // InternalVideoMontage.g:4238:1: rule__TextArea_Impl__Group__8 : rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9 ;
    public final void rule__TextArea_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4242:1: ( rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9 )
            // InternalVideoMontage.g:4243:2: rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9
            {
            pushFollow(FOLLOW_38);
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
    // InternalVideoMontage.g:4250:1: rule__TextArea_Impl__Group__8__Impl : ( ( rule__TextArea_Impl__Group_8__0 )? ) ;
    public final void rule__TextArea_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4254:1: ( ( ( rule__TextArea_Impl__Group_8__0 )? ) )
            // InternalVideoMontage.g:4255:1: ( ( rule__TextArea_Impl__Group_8__0 )? )
            {
            // InternalVideoMontage.g:4255:1: ( ( rule__TextArea_Impl__Group_8__0 )? )
            // InternalVideoMontage.g:4256:2: ( rule__TextArea_Impl__Group_8__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_8()); 
            // InternalVideoMontage.g:4257:2: ( rule__TextArea_Impl__Group_8__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVideoMontage.g:4257:3: rule__TextArea_Impl__Group_8__0
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
    // InternalVideoMontage.g:4265:1: rule__TextArea_Impl__Group__9 : rule__TextArea_Impl__Group__9__Impl ;
    public final void rule__TextArea_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4269:1: ( rule__TextArea_Impl__Group__9__Impl )
            // InternalVideoMontage.g:4270:2: rule__TextArea_Impl__Group__9__Impl
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
    // InternalVideoMontage.g:4276:1: rule__TextArea_Impl__Group__9__Impl : ( '}' ) ;
    public final void rule__TextArea_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4280:1: ( ( '}' ) )
            // InternalVideoMontage.g:4281:1: ( '}' )
            {
            // InternalVideoMontage.g:4281:1: ( '}' )
            // InternalVideoMontage.g:4282:2: '}'
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
    // InternalVideoMontage.g:4292:1: rule__TextArea_Impl__Group_2__0 : rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1 ;
    public final void rule__TextArea_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4296:1: ( rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1 )
            // InternalVideoMontage.g:4297:2: rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalVideoMontage.g:4304:1: rule__TextArea_Impl__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__TextArea_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4308:1: ( ( 'x' ) )
            // InternalVideoMontage.g:4309:1: ( 'x' )
            {
            // InternalVideoMontage.g:4309:1: ( 'x' )
            // InternalVideoMontage.g:4310:2: 'x'
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
    // InternalVideoMontage.g:4319:1: rule__TextArea_Impl__Group_2__1 : rule__TextArea_Impl__Group_2__1__Impl ;
    public final void rule__TextArea_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4323:1: ( rule__TextArea_Impl__Group_2__1__Impl )
            // InternalVideoMontage.g:4324:2: rule__TextArea_Impl__Group_2__1__Impl
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
    // InternalVideoMontage.g:4330:1: rule__TextArea_Impl__Group_2__1__Impl : ( ( rule__TextArea_Impl__XAssignment_2_1 ) ) ;
    public final void rule__TextArea_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4334:1: ( ( ( rule__TextArea_Impl__XAssignment_2_1 ) ) )
            // InternalVideoMontage.g:4335:1: ( ( rule__TextArea_Impl__XAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:4335:1: ( ( rule__TextArea_Impl__XAssignment_2_1 ) )
            // InternalVideoMontage.g:4336:2: ( rule__TextArea_Impl__XAssignment_2_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getXAssignment_2_1()); 
            // InternalVideoMontage.g:4337:2: ( rule__TextArea_Impl__XAssignment_2_1 )
            // InternalVideoMontage.g:4337:3: rule__TextArea_Impl__XAssignment_2_1
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
    // InternalVideoMontage.g:4346:1: rule__TextArea_Impl__Group_3__0 : rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1 ;
    public final void rule__TextArea_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4350:1: ( rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1 )
            // InternalVideoMontage.g:4351:2: rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalVideoMontage.g:4358:1: rule__TextArea_Impl__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__TextArea_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4362:1: ( ( 'y' ) )
            // InternalVideoMontage.g:4363:1: ( 'y' )
            {
            // InternalVideoMontage.g:4363:1: ( 'y' )
            // InternalVideoMontage.g:4364:2: 'y'
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
    // InternalVideoMontage.g:4373:1: rule__TextArea_Impl__Group_3__1 : rule__TextArea_Impl__Group_3__1__Impl ;
    public final void rule__TextArea_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4377:1: ( rule__TextArea_Impl__Group_3__1__Impl )
            // InternalVideoMontage.g:4378:2: rule__TextArea_Impl__Group_3__1__Impl
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
    // InternalVideoMontage.g:4384:1: rule__TextArea_Impl__Group_3__1__Impl : ( ( rule__TextArea_Impl__YAssignment_3_1 ) ) ;
    public final void rule__TextArea_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4388:1: ( ( ( rule__TextArea_Impl__YAssignment_3_1 ) ) )
            // InternalVideoMontage.g:4389:1: ( ( rule__TextArea_Impl__YAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:4389:1: ( ( rule__TextArea_Impl__YAssignment_3_1 ) )
            // InternalVideoMontage.g:4390:2: ( rule__TextArea_Impl__YAssignment_3_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getYAssignment_3_1()); 
            // InternalVideoMontage.g:4391:2: ( rule__TextArea_Impl__YAssignment_3_1 )
            // InternalVideoMontage.g:4391:3: rule__TextArea_Impl__YAssignment_3_1
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
    // InternalVideoMontage.g:4400:1: rule__TextArea_Impl__Group_4__0 : rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1 ;
    public final void rule__TextArea_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4404:1: ( rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1 )
            // InternalVideoMontage.g:4405:2: rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:4412:1: rule__TextArea_Impl__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__TextArea_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4416:1: ( ( 'width' ) )
            // InternalVideoMontage.g:4417:1: ( 'width' )
            {
            // InternalVideoMontage.g:4417:1: ( 'width' )
            // InternalVideoMontage.g:4418:2: 'width'
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
    // InternalVideoMontage.g:4427:1: rule__TextArea_Impl__Group_4__1 : rule__TextArea_Impl__Group_4__1__Impl ;
    public final void rule__TextArea_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4431:1: ( rule__TextArea_Impl__Group_4__1__Impl )
            // InternalVideoMontage.g:4432:2: rule__TextArea_Impl__Group_4__1__Impl
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
    // InternalVideoMontage.g:4438:1: rule__TextArea_Impl__Group_4__1__Impl : ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) ) ;
    public final void rule__TextArea_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4442:1: ( ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) ) )
            // InternalVideoMontage.g:4443:1: ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:4443:1: ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) )
            // InternalVideoMontage.g:4444:2: ( rule__TextArea_Impl__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getWidthAssignment_4_1()); 
            // InternalVideoMontage.g:4445:2: ( rule__TextArea_Impl__WidthAssignment_4_1 )
            // InternalVideoMontage.g:4445:3: rule__TextArea_Impl__WidthAssignment_4_1
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
    // InternalVideoMontage.g:4454:1: rule__TextArea_Impl__Group_5__0 : rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1 ;
    public final void rule__TextArea_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4458:1: ( rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1 )
            // InternalVideoMontage.g:4459:2: rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:4466:1: rule__TextArea_Impl__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__TextArea_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4470:1: ( ( 'height' ) )
            // InternalVideoMontage.g:4471:1: ( 'height' )
            {
            // InternalVideoMontage.g:4471:1: ( 'height' )
            // InternalVideoMontage.g:4472:2: 'height'
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
    // InternalVideoMontage.g:4481:1: rule__TextArea_Impl__Group_5__1 : rule__TextArea_Impl__Group_5__1__Impl ;
    public final void rule__TextArea_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4485:1: ( rule__TextArea_Impl__Group_5__1__Impl )
            // InternalVideoMontage.g:4486:2: rule__TextArea_Impl__Group_5__1__Impl
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
    // InternalVideoMontage.g:4492:1: rule__TextArea_Impl__Group_5__1__Impl : ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) ) ;
    public final void rule__TextArea_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4496:1: ( ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) ) )
            // InternalVideoMontage.g:4497:1: ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) )
            {
            // InternalVideoMontage.g:4497:1: ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) )
            // InternalVideoMontage.g:4498:2: ( rule__TextArea_Impl__HeightAssignment_5_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getHeightAssignment_5_1()); 
            // InternalVideoMontage.g:4499:2: ( rule__TextArea_Impl__HeightAssignment_5_1 )
            // InternalVideoMontage.g:4499:3: rule__TextArea_Impl__HeightAssignment_5_1
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
    // InternalVideoMontage.g:4508:1: rule__TextArea_Impl__Group_6__0 : rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1 ;
    public final void rule__TextArea_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4512:1: ( rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1 )
            // InternalVideoMontage.g:4513:2: rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1
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
    // InternalVideoMontage.g:4520:1: rule__TextArea_Impl__Group_6__0__Impl : ( 'text' ) ;
    public final void rule__TextArea_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4524:1: ( ( 'text' ) )
            // InternalVideoMontage.g:4525:1: ( 'text' )
            {
            // InternalVideoMontage.g:4525:1: ( 'text' )
            // InternalVideoMontage.g:4526:2: 'text'
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
    // InternalVideoMontage.g:4535:1: rule__TextArea_Impl__Group_6__1 : rule__TextArea_Impl__Group_6__1__Impl ;
    public final void rule__TextArea_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4539:1: ( rule__TextArea_Impl__Group_6__1__Impl )
            // InternalVideoMontage.g:4540:2: rule__TextArea_Impl__Group_6__1__Impl
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
    // InternalVideoMontage.g:4546:1: rule__TextArea_Impl__Group_6__1__Impl : ( ( rule__TextArea_Impl__TextAssignment_6_1 ) ) ;
    public final void rule__TextArea_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4550:1: ( ( ( rule__TextArea_Impl__TextAssignment_6_1 ) ) )
            // InternalVideoMontage.g:4551:1: ( ( rule__TextArea_Impl__TextAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:4551:1: ( ( rule__TextArea_Impl__TextAssignment_6_1 ) )
            // InternalVideoMontage.g:4552:2: ( rule__TextArea_Impl__TextAssignment_6_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getTextAssignment_6_1()); 
            // InternalVideoMontage.g:4553:2: ( rule__TextArea_Impl__TextAssignment_6_1 )
            // InternalVideoMontage.g:4553:3: rule__TextArea_Impl__TextAssignment_6_1
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
    // InternalVideoMontage.g:4562:1: rule__TextArea_Impl__Group_7__0 : rule__TextArea_Impl__Group_7__0__Impl rule__TextArea_Impl__Group_7__1 ;
    public final void rule__TextArea_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4566:1: ( rule__TextArea_Impl__Group_7__0__Impl rule__TextArea_Impl__Group_7__1 )
            // InternalVideoMontage.g:4567:2: rule__TextArea_Impl__Group_7__0__Impl rule__TextArea_Impl__Group_7__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoMontage.g:4574:1: rule__TextArea_Impl__Group_7__0__Impl : ( 'font' ) ;
    public final void rule__TextArea_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4578:1: ( ( 'font' ) )
            // InternalVideoMontage.g:4579:1: ( 'font' )
            {
            // InternalVideoMontage.g:4579:1: ( 'font' )
            // InternalVideoMontage.g:4580:2: 'font'
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
    // InternalVideoMontage.g:4589:1: rule__TextArea_Impl__Group_7__1 : rule__TextArea_Impl__Group_7__1__Impl ;
    public final void rule__TextArea_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4593:1: ( rule__TextArea_Impl__Group_7__1__Impl )
            // InternalVideoMontage.g:4594:2: rule__TextArea_Impl__Group_7__1__Impl
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
    // InternalVideoMontage.g:4600:1: rule__TextArea_Impl__Group_7__1__Impl : ( ( rule__TextArea_Impl__FontAssignment_7_1 ) ) ;
    public final void rule__TextArea_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4604:1: ( ( ( rule__TextArea_Impl__FontAssignment_7_1 ) ) )
            // InternalVideoMontage.g:4605:1: ( ( rule__TextArea_Impl__FontAssignment_7_1 ) )
            {
            // InternalVideoMontage.g:4605:1: ( ( rule__TextArea_Impl__FontAssignment_7_1 ) )
            // InternalVideoMontage.g:4606:2: ( rule__TextArea_Impl__FontAssignment_7_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontAssignment_7_1()); 
            // InternalVideoMontage.g:4607:2: ( rule__TextArea_Impl__FontAssignment_7_1 )
            // InternalVideoMontage.g:4607:3: rule__TextArea_Impl__FontAssignment_7_1
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
    // InternalVideoMontage.g:4616:1: rule__TextArea_Impl__Group_8__0 : rule__TextArea_Impl__Group_8__0__Impl rule__TextArea_Impl__Group_8__1 ;
    public final void rule__TextArea_Impl__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4620:1: ( rule__TextArea_Impl__Group_8__0__Impl rule__TextArea_Impl__Group_8__1 )
            // InternalVideoMontage.g:4621:2: rule__TextArea_Impl__Group_8__0__Impl rule__TextArea_Impl__Group_8__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalVideoMontage.g:4628:1: rule__TextArea_Impl__Group_8__0__Impl : ( 'animation' ) ;
    public final void rule__TextArea_Impl__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4632:1: ( ( 'animation' ) )
            // InternalVideoMontage.g:4633:1: ( 'animation' )
            {
            // InternalVideoMontage.g:4633:1: ( 'animation' )
            // InternalVideoMontage.g:4634:2: 'animation'
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
    // InternalVideoMontage.g:4643:1: rule__TextArea_Impl__Group_8__1 : rule__TextArea_Impl__Group_8__1__Impl rule__TextArea_Impl__Group_8__2 ;
    public final void rule__TextArea_Impl__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4647:1: ( rule__TextArea_Impl__Group_8__1__Impl rule__TextArea_Impl__Group_8__2 )
            // InternalVideoMontage.g:4648:2: rule__TextArea_Impl__Group_8__1__Impl rule__TextArea_Impl__Group_8__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalVideoMontage.g:4655:1: rule__TextArea_Impl__Group_8__1__Impl : ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) ) ;
    public final void rule__TextArea_Impl__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4659:1: ( ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) ) )
            // InternalVideoMontage.g:4660:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) )
            {
            // InternalVideoMontage.g:4660:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) )
            // InternalVideoMontage.g:4661:2: ( rule__TextArea_Impl__AnimationAssignment_8_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_8_1()); 
            // InternalVideoMontage.g:4662:2: ( rule__TextArea_Impl__AnimationAssignment_8_1 )
            // InternalVideoMontage.g:4662:3: rule__TextArea_Impl__AnimationAssignment_8_1
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
    // InternalVideoMontage.g:4670:1: rule__TextArea_Impl__Group_8__2 : rule__TextArea_Impl__Group_8__2__Impl ;
    public final void rule__TextArea_Impl__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4674:1: ( rule__TextArea_Impl__Group_8__2__Impl )
            // InternalVideoMontage.g:4675:2: rule__TextArea_Impl__Group_8__2__Impl
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
    // InternalVideoMontage.g:4681:1: rule__TextArea_Impl__Group_8__2__Impl : ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* ) ;
    public final void rule__TextArea_Impl__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4685:1: ( ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* ) )
            // InternalVideoMontage.g:4686:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* )
            {
            // InternalVideoMontage.g:4686:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* )
            // InternalVideoMontage.g:4687:2: ( rule__TextArea_Impl__AnimationAssignment_8_2 )*
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_8_2()); 
            // InternalVideoMontage.g:4688:2: ( rule__TextArea_Impl__AnimationAssignment_8_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=57 && LA36_0<=58)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalVideoMontage.g:4688:3: rule__TextArea_Impl__AnimationAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__TextArea_Impl__AnimationAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalVideoMontage.g:4697:1: rule__TextAreaDynamic__Group__0 : rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1 ;
    public final void rule__TextAreaDynamic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4701:1: ( rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1 )
            // InternalVideoMontage.g:4702:2: rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1
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
    // InternalVideoMontage.g:4709:1: rule__TextAreaDynamic__Group__0__Impl : ( 'TextAreaDynamic' ) ;
    public final void rule__TextAreaDynamic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4713:1: ( ( 'TextAreaDynamic' ) )
            // InternalVideoMontage.g:4714:1: ( 'TextAreaDynamic' )
            {
            // InternalVideoMontage.g:4714:1: ( 'TextAreaDynamic' )
            // InternalVideoMontage.g:4715:2: 'TextAreaDynamic'
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
    // InternalVideoMontage.g:4724:1: rule__TextAreaDynamic__Group__1 : rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2 ;
    public final void rule__TextAreaDynamic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4728:1: ( rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2 )
            // InternalVideoMontage.g:4729:2: rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:4736:1: rule__TextAreaDynamic__Group__1__Impl : ( '{' ) ;
    public final void rule__TextAreaDynamic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4740:1: ( ( '{' ) )
            // InternalVideoMontage.g:4741:1: ( '{' )
            {
            // InternalVideoMontage.g:4741:1: ( '{' )
            // InternalVideoMontage.g:4742:2: '{'
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
    // InternalVideoMontage.g:4751:1: rule__TextAreaDynamic__Group__2 : rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3 ;
    public final void rule__TextAreaDynamic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4755:1: ( rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3 )
            // InternalVideoMontage.g:4756:2: rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:4763:1: rule__TextAreaDynamic__Group__2__Impl : ( ( rule__TextAreaDynamic__Group_2__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4767:1: ( ( ( rule__TextAreaDynamic__Group_2__0 )? ) )
            // InternalVideoMontage.g:4768:1: ( ( rule__TextAreaDynamic__Group_2__0 )? )
            {
            // InternalVideoMontage.g:4768:1: ( ( rule__TextAreaDynamic__Group_2__0 )? )
            // InternalVideoMontage.g:4769:2: ( rule__TextAreaDynamic__Group_2__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_2()); 
            // InternalVideoMontage.g:4770:2: ( rule__TextAreaDynamic__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVideoMontage.g:4770:3: rule__TextAreaDynamic__Group_2__0
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
    // InternalVideoMontage.g:4778:1: rule__TextAreaDynamic__Group__3 : rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4 ;
    public final void rule__TextAreaDynamic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4782:1: ( rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4 )
            // InternalVideoMontage.g:4783:2: rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:4790:1: rule__TextAreaDynamic__Group__3__Impl : ( ( rule__TextAreaDynamic__Group_3__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4794:1: ( ( ( rule__TextAreaDynamic__Group_3__0 )? ) )
            // InternalVideoMontage.g:4795:1: ( ( rule__TextAreaDynamic__Group_3__0 )? )
            {
            // InternalVideoMontage.g:4795:1: ( ( rule__TextAreaDynamic__Group_3__0 )? )
            // InternalVideoMontage.g:4796:2: ( rule__TextAreaDynamic__Group_3__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_3()); 
            // InternalVideoMontage.g:4797:2: ( rule__TextAreaDynamic__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVideoMontage.g:4797:3: rule__TextAreaDynamic__Group_3__0
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
    // InternalVideoMontage.g:4805:1: rule__TextAreaDynamic__Group__4 : rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5 ;
    public final void rule__TextAreaDynamic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4809:1: ( rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5 )
            // InternalVideoMontage.g:4810:2: rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:4817:1: rule__TextAreaDynamic__Group__4__Impl : ( ( rule__TextAreaDynamic__Group_4__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4821:1: ( ( ( rule__TextAreaDynamic__Group_4__0 )? ) )
            // InternalVideoMontage.g:4822:1: ( ( rule__TextAreaDynamic__Group_4__0 )? )
            {
            // InternalVideoMontage.g:4822:1: ( ( rule__TextAreaDynamic__Group_4__0 )? )
            // InternalVideoMontage.g:4823:2: ( rule__TextAreaDynamic__Group_4__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_4()); 
            // InternalVideoMontage.g:4824:2: ( rule__TextAreaDynamic__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVideoMontage.g:4824:3: rule__TextAreaDynamic__Group_4__0
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
    // InternalVideoMontage.g:4832:1: rule__TextAreaDynamic__Group__5 : rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6 ;
    public final void rule__TextAreaDynamic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4836:1: ( rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6 )
            // InternalVideoMontage.g:4837:2: rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:4844:1: rule__TextAreaDynamic__Group__5__Impl : ( ( rule__TextAreaDynamic__Group_5__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4848:1: ( ( ( rule__TextAreaDynamic__Group_5__0 )? ) )
            // InternalVideoMontage.g:4849:1: ( ( rule__TextAreaDynamic__Group_5__0 )? )
            {
            // InternalVideoMontage.g:4849:1: ( ( rule__TextAreaDynamic__Group_5__0 )? )
            // InternalVideoMontage.g:4850:2: ( rule__TextAreaDynamic__Group_5__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_5()); 
            // InternalVideoMontage.g:4851:2: ( rule__TextAreaDynamic__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalVideoMontage.g:4851:3: rule__TextAreaDynamic__Group_5__0
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
    // InternalVideoMontage.g:4859:1: rule__TextAreaDynamic__Group__6 : rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7 ;
    public final void rule__TextAreaDynamic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4863:1: ( rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7 )
            // InternalVideoMontage.g:4864:2: rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:4871:1: rule__TextAreaDynamic__Group__6__Impl : ( ( rule__TextAreaDynamic__Group_6__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4875:1: ( ( ( rule__TextAreaDynamic__Group_6__0 )? ) )
            // InternalVideoMontage.g:4876:1: ( ( rule__TextAreaDynamic__Group_6__0 )? )
            {
            // InternalVideoMontage.g:4876:1: ( ( rule__TextAreaDynamic__Group_6__0 )? )
            // InternalVideoMontage.g:4877:2: ( rule__TextAreaDynamic__Group_6__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_6()); 
            // InternalVideoMontage.g:4878:2: ( rule__TextAreaDynamic__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVideoMontage.g:4878:3: rule__TextAreaDynamic__Group_6__0
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
    // InternalVideoMontage.g:4886:1: rule__TextAreaDynamic__Group__7 : rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8 ;
    public final void rule__TextAreaDynamic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4890:1: ( rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8 )
            // InternalVideoMontage.g:4891:2: rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:4898:1: rule__TextAreaDynamic__Group__7__Impl : ( ( rule__TextAreaDynamic__Group_7__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4902:1: ( ( ( rule__TextAreaDynamic__Group_7__0 )? ) )
            // InternalVideoMontage.g:4903:1: ( ( rule__TextAreaDynamic__Group_7__0 )? )
            {
            // InternalVideoMontage.g:4903:1: ( ( rule__TextAreaDynamic__Group_7__0 )? )
            // InternalVideoMontage.g:4904:2: ( rule__TextAreaDynamic__Group_7__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_7()); 
            // InternalVideoMontage.g:4905:2: ( rule__TextAreaDynamic__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVideoMontage.g:4905:3: rule__TextAreaDynamic__Group_7__0
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
    // InternalVideoMontage.g:4913:1: rule__TextAreaDynamic__Group__8 : rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9 ;
    public final void rule__TextAreaDynamic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4917:1: ( rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9 )
            // InternalVideoMontage.g:4918:2: rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:4925:1: rule__TextAreaDynamic__Group__8__Impl : ( ( rule__TextAreaDynamic__Group_8__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4929:1: ( ( ( rule__TextAreaDynamic__Group_8__0 )? ) )
            // InternalVideoMontage.g:4930:1: ( ( rule__TextAreaDynamic__Group_8__0 )? )
            {
            // InternalVideoMontage.g:4930:1: ( ( rule__TextAreaDynamic__Group_8__0 )? )
            // InternalVideoMontage.g:4931:2: ( rule__TextAreaDynamic__Group_8__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_8()); 
            // InternalVideoMontage.g:4932:2: ( rule__TextAreaDynamic__Group_8__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVideoMontage.g:4932:3: rule__TextAreaDynamic__Group_8__0
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
    // InternalVideoMontage.g:4940:1: rule__TextAreaDynamic__Group__9 : rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10 ;
    public final void rule__TextAreaDynamic__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4944:1: ( rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10 )
            // InternalVideoMontage.g:4945:2: rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10
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
    // InternalVideoMontage.g:4952:1: rule__TextAreaDynamic__Group__9__Impl : ( 'font' ) ;
    public final void rule__TextAreaDynamic__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4956:1: ( ( 'font' ) )
            // InternalVideoMontage.g:4957:1: ( 'font' )
            {
            // InternalVideoMontage.g:4957:1: ( 'font' )
            // InternalVideoMontage.g:4958:2: 'font'
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
    // InternalVideoMontage.g:4967:1: rule__TextAreaDynamic__Group__10 : rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11 ;
    public final void rule__TextAreaDynamic__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4971:1: ( rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11 )
            // InternalVideoMontage.g:4972:2: rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11
            {
            pushFollow(FOLLOW_43);
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
    // InternalVideoMontage.g:4979:1: rule__TextAreaDynamic__Group__10__Impl : ( ( rule__TextAreaDynamic__FontAssignment_10 ) ) ;
    public final void rule__TextAreaDynamic__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4983:1: ( ( ( rule__TextAreaDynamic__FontAssignment_10 ) ) )
            // InternalVideoMontage.g:4984:1: ( ( rule__TextAreaDynamic__FontAssignment_10 ) )
            {
            // InternalVideoMontage.g:4984:1: ( ( rule__TextAreaDynamic__FontAssignment_10 ) )
            // InternalVideoMontage.g:4985:2: ( rule__TextAreaDynamic__FontAssignment_10 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontAssignment_10()); 
            // InternalVideoMontage.g:4986:2: ( rule__TextAreaDynamic__FontAssignment_10 )
            // InternalVideoMontage.g:4986:3: rule__TextAreaDynamic__FontAssignment_10
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
    // InternalVideoMontage.g:4994:1: rule__TextAreaDynamic__Group__11 : rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12 ;
    public final void rule__TextAreaDynamic__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4998:1: ( rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12 )
            // InternalVideoMontage.g:4999:2: rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12
            {
            pushFollow(FOLLOW_43);
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
    // InternalVideoMontage.g:5006:1: rule__TextAreaDynamic__Group__11__Impl : ( ( rule__TextAreaDynamic__Group_11__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5010:1: ( ( ( rule__TextAreaDynamic__Group_11__0 )? ) )
            // InternalVideoMontage.g:5011:1: ( ( rule__TextAreaDynamic__Group_11__0 )? )
            {
            // InternalVideoMontage.g:5011:1: ( ( rule__TextAreaDynamic__Group_11__0 )? )
            // InternalVideoMontage.g:5012:2: ( rule__TextAreaDynamic__Group_11__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_11()); 
            // InternalVideoMontage.g:5013:2: ( rule__TextAreaDynamic__Group_11__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalVideoMontage.g:5013:3: rule__TextAreaDynamic__Group_11__0
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
    // InternalVideoMontage.g:5021:1: rule__TextAreaDynamic__Group__12 : rule__TextAreaDynamic__Group__12__Impl ;
    public final void rule__TextAreaDynamic__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5025:1: ( rule__TextAreaDynamic__Group__12__Impl )
            // InternalVideoMontage.g:5026:2: rule__TextAreaDynamic__Group__12__Impl
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
    // InternalVideoMontage.g:5032:1: rule__TextAreaDynamic__Group__12__Impl : ( '}' ) ;
    public final void rule__TextAreaDynamic__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5036:1: ( ( '}' ) )
            // InternalVideoMontage.g:5037:1: ( '}' )
            {
            // InternalVideoMontage.g:5037:1: ( '}' )
            // InternalVideoMontage.g:5038:2: '}'
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
    // InternalVideoMontage.g:5048:1: rule__TextAreaDynamic__Group_2__0 : rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1 ;
    public final void rule__TextAreaDynamic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5052:1: ( rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1 )
            // InternalVideoMontage.g:5053:2: rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalVideoMontage.g:5060:1: rule__TextAreaDynamic__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__TextAreaDynamic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5064:1: ( ( 'x' ) )
            // InternalVideoMontage.g:5065:1: ( 'x' )
            {
            // InternalVideoMontage.g:5065:1: ( 'x' )
            // InternalVideoMontage.g:5066:2: 'x'
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
    // InternalVideoMontage.g:5075:1: rule__TextAreaDynamic__Group_2__1 : rule__TextAreaDynamic__Group_2__1__Impl ;
    public final void rule__TextAreaDynamic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5079:1: ( rule__TextAreaDynamic__Group_2__1__Impl )
            // InternalVideoMontage.g:5080:2: rule__TextAreaDynamic__Group_2__1__Impl
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
    // InternalVideoMontage.g:5086:1: rule__TextAreaDynamic__Group_2__1__Impl : ( ( rule__TextAreaDynamic__XAssignment_2_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5090:1: ( ( ( rule__TextAreaDynamic__XAssignment_2_1 ) ) )
            // InternalVideoMontage.g:5091:1: ( ( rule__TextAreaDynamic__XAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:5091:1: ( ( rule__TextAreaDynamic__XAssignment_2_1 ) )
            // InternalVideoMontage.g:5092:2: ( rule__TextAreaDynamic__XAssignment_2_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getXAssignment_2_1()); 
            // InternalVideoMontage.g:5093:2: ( rule__TextAreaDynamic__XAssignment_2_1 )
            // InternalVideoMontage.g:5093:3: rule__TextAreaDynamic__XAssignment_2_1
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
    // InternalVideoMontage.g:5102:1: rule__TextAreaDynamic__Group_3__0 : rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1 ;
    public final void rule__TextAreaDynamic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5106:1: ( rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1 )
            // InternalVideoMontage.g:5107:2: rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalVideoMontage.g:5114:1: rule__TextAreaDynamic__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__TextAreaDynamic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5118:1: ( ( 'y' ) )
            // InternalVideoMontage.g:5119:1: ( 'y' )
            {
            // InternalVideoMontage.g:5119:1: ( 'y' )
            // InternalVideoMontage.g:5120:2: 'y'
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
    // InternalVideoMontage.g:5129:1: rule__TextAreaDynamic__Group_3__1 : rule__TextAreaDynamic__Group_3__1__Impl ;
    public final void rule__TextAreaDynamic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5133:1: ( rule__TextAreaDynamic__Group_3__1__Impl )
            // InternalVideoMontage.g:5134:2: rule__TextAreaDynamic__Group_3__1__Impl
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
    // InternalVideoMontage.g:5140:1: rule__TextAreaDynamic__Group_3__1__Impl : ( ( rule__TextAreaDynamic__YAssignment_3_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5144:1: ( ( ( rule__TextAreaDynamic__YAssignment_3_1 ) ) )
            // InternalVideoMontage.g:5145:1: ( ( rule__TextAreaDynamic__YAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:5145:1: ( ( rule__TextAreaDynamic__YAssignment_3_1 ) )
            // InternalVideoMontage.g:5146:2: ( rule__TextAreaDynamic__YAssignment_3_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getYAssignment_3_1()); 
            // InternalVideoMontage.g:5147:2: ( rule__TextAreaDynamic__YAssignment_3_1 )
            // InternalVideoMontage.g:5147:3: rule__TextAreaDynamic__YAssignment_3_1
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
    // InternalVideoMontage.g:5156:1: rule__TextAreaDynamic__Group_4__0 : rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1 ;
    public final void rule__TextAreaDynamic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5160:1: ( rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1 )
            // InternalVideoMontage.g:5161:2: rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:5168:1: rule__TextAreaDynamic__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__TextAreaDynamic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5172:1: ( ( 'width' ) )
            // InternalVideoMontage.g:5173:1: ( 'width' )
            {
            // InternalVideoMontage.g:5173:1: ( 'width' )
            // InternalVideoMontage.g:5174:2: 'width'
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
    // InternalVideoMontage.g:5183:1: rule__TextAreaDynamic__Group_4__1 : rule__TextAreaDynamic__Group_4__1__Impl ;
    public final void rule__TextAreaDynamic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5187:1: ( rule__TextAreaDynamic__Group_4__1__Impl )
            // InternalVideoMontage.g:5188:2: rule__TextAreaDynamic__Group_4__1__Impl
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
    // InternalVideoMontage.g:5194:1: rule__TextAreaDynamic__Group_4__1__Impl : ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5198:1: ( ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) ) )
            // InternalVideoMontage.g:5199:1: ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:5199:1: ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) )
            // InternalVideoMontage.g:5200:2: ( rule__TextAreaDynamic__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getWidthAssignment_4_1()); 
            // InternalVideoMontage.g:5201:2: ( rule__TextAreaDynamic__WidthAssignment_4_1 )
            // InternalVideoMontage.g:5201:3: rule__TextAreaDynamic__WidthAssignment_4_1
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
    // InternalVideoMontage.g:5210:1: rule__TextAreaDynamic__Group_5__0 : rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1 ;
    public final void rule__TextAreaDynamic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5214:1: ( rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1 )
            // InternalVideoMontage.g:5215:2: rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:5222:1: rule__TextAreaDynamic__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__TextAreaDynamic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5226:1: ( ( 'height' ) )
            // InternalVideoMontage.g:5227:1: ( 'height' )
            {
            // InternalVideoMontage.g:5227:1: ( 'height' )
            // InternalVideoMontage.g:5228:2: 'height'
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
    // InternalVideoMontage.g:5237:1: rule__TextAreaDynamic__Group_5__1 : rule__TextAreaDynamic__Group_5__1__Impl ;
    public final void rule__TextAreaDynamic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5241:1: ( rule__TextAreaDynamic__Group_5__1__Impl )
            // InternalVideoMontage.g:5242:2: rule__TextAreaDynamic__Group_5__1__Impl
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
    // InternalVideoMontage.g:5248:1: rule__TextAreaDynamic__Group_5__1__Impl : ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5252:1: ( ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) ) )
            // InternalVideoMontage.g:5253:1: ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) )
            {
            // InternalVideoMontage.g:5253:1: ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) )
            // InternalVideoMontage.g:5254:2: ( rule__TextAreaDynamic__HeightAssignment_5_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getHeightAssignment_5_1()); 
            // InternalVideoMontage.g:5255:2: ( rule__TextAreaDynamic__HeightAssignment_5_1 )
            // InternalVideoMontage.g:5255:3: rule__TextAreaDynamic__HeightAssignment_5_1
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
    // InternalVideoMontage.g:5264:1: rule__TextAreaDynamic__Group_6__0 : rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1 ;
    public final void rule__TextAreaDynamic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5268:1: ( rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1 )
            // InternalVideoMontage.g:5269:2: rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1
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
    // InternalVideoMontage.g:5276:1: rule__TextAreaDynamic__Group_6__0__Impl : ( 'text' ) ;
    public final void rule__TextAreaDynamic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5280:1: ( ( 'text' ) )
            // InternalVideoMontage.g:5281:1: ( 'text' )
            {
            // InternalVideoMontage.g:5281:1: ( 'text' )
            // InternalVideoMontage.g:5282:2: 'text'
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
    // InternalVideoMontage.g:5291:1: rule__TextAreaDynamic__Group_6__1 : rule__TextAreaDynamic__Group_6__1__Impl ;
    public final void rule__TextAreaDynamic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5295:1: ( rule__TextAreaDynamic__Group_6__1__Impl )
            // InternalVideoMontage.g:5296:2: rule__TextAreaDynamic__Group_6__1__Impl
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
    // InternalVideoMontage.g:5302:1: rule__TextAreaDynamic__Group_6__1__Impl : ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5306:1: ( ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) ) )
            // InternalVideoMontage.g:5307:1: ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:5307:1: ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) )
            // InternalVideoMontage.g:5308:2: ( rule__TextAreaDynamic__TextAssignment_6_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextAssignment_6_1()); 
            // InternalVideoMontage.g:5309:2: ( rule__TextAreaDynamic__TextAssignment_6_1 )
            // InternalVideoMontage.g:5309:3: rule__TextAreaDynamic__TextAssignment_6_1
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
    // InternalVideoMontage.g:5318:1: rule__TextAreaDynamic__Group_7__0 : rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1 ;
    public final void rule__TextAreaDynamic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5322:1: ( rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1 )
            // InternalVideoMontage.g:5323:2: rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1
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
    // InternalVideoMontage.g:5330:1: rule__TextAreaDynamic__Group_7__0__Impl : ( 'textSrc' ) ;
    public final void rule__TextAreaDynamic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5334:1: ( ( 'textSrc' ) )
            // InternalVideoMontage.g:5335:1: ( 'textSrc' )
            {
            // InternalVideoMontage.g:5335:1: ( 'textSrc' )
            // InternalVideoMontage.g:5336:2: 'textSrc'
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
    // InternalVideoMontage.g:5345:1: rule__TextAreaDynamic__Group_7__1 : rule__TextAreaDynamic__Group_7__1__Impl ;
    public final void rule__TextAreaDynamic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5349:1: ( rule__TextAreaDynamic__Group_7__1__Impl )
            // InternalVideoMontage.g:5350:2: rule__TextAreaDynamic__Group_7__1__Impl
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
    // InternalVideoMontage.g:5356:1: rule__TextAreaDynamic__Group_7__1__Impl : ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5360:1: ( ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) ) )
            // InternalVideoMontage.g:5361:1: ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) )
            {
            // InternalVideoMontage.g:5361:1: ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) )
            // InternalVideoMontage.g:5362:2: ( rule__TextAreaDynamic__TextSrcAssignment_7_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextSrcAssignment_7_1()); 
            // InternalVideoMontage.g:5363:2: ( rule__TextAreaDynamic__TextSrcAssignment_7_1 )
            // InternalVideoMontage.g:5363:3: rule__TextAreaDynamic__TextSrcAssignment_7_1
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
    // InternalVideoMontage.g:5372:1: rule__TextAreaDynamic__Group_8__0 : rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1 ;
    public final void rule__TextAreaDynamic__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5376:1: ( rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1 )
            // InternalVideoMontage.g:5377:2: rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalVideoMontage.g:5384:1: rule__TextAreaDynamic__Group_8__0__Impl : ( 'line' ) ;
    public final void rule__TextAreaDynamic__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5388:1: ( ( 'line' ) )
            // InternalVideoMontage.g:5389:1: ( 'line' )
            {
            // InternalVideoMontage.g:5389:1: ( 'line' )
            // InternalVideoMontage.g:5390:2: 'line'
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
    // InternalVideoMontage.g:5399:1: rule__TextAreaDynamic__Group_8__1 : rule__TextAreaDynamic__Group_8__1__Impl ;
    public final void rule__TextAreaDynamic__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5403:1: ( rule__TextAreaDynamic__Group_8__1__Impl )
            // InternalVideoMontage.g:5404:2: rule__TextAreaDynamic__Group_8__1__Impl
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
    // InternalVideoMontage.g:5410:1: rule__TextAreaDynamic__Group_8__1__Impl : ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5414:1: ( ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) ) )
            // InternalVideoMontage.g:5415:1: ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) )
            {
            // InternalVideoMontage.g:5415:1: ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) )
            // InternalVideoMontage.g:5416:2: ( rule__TextAreaDynamic__LineAssignment_8_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getLineAssignment_8_1()); 
            // InternalVideoMontage.g:5417:2: ( rule__TextAreaDynamic__LineAssignment_8_1 )
            // InternalVideoMontage.g:5417:3: rule__TextAreaDynamic__LineAssignment_8_1
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
    // InternalVideoMontage.g:5426:1: rule__TextAreaDynamic__Group_11__0 : rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1 ;
    public final void rule__TextAreaDynamic__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5430:1: ( rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1 )
            // InternalVideoMontage.g:5431:2: rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalVideoMontage.g:5438:1: rule__TextAreaDynamic__Group_11__0__Impl : ( 'animation' ) ;
    public final void rule__TextAreaDynamic__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5442:1: ( ( 'animation' ) )
            // InternalVideoMontage.g:5443:1: ( 'animation' )
            {
            // InternalVideoMontage.g:5443:1: ( 'animation' )
            // InternalVideoMontage.g:5444:2: 'animation'
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
    // InternalVideoMontage.g:5453:1: rule__TextAreaDynamic__Group_11__1 : rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2 ;
    public final void rule__TextAreaDynamic__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5457:1: ( rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2 )
            // InternalVideoMontage.g:5458:2: rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalVideoMontage.g:5465:1: rule__TextAreaDynamic__Group_11__1__Impl : ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5469:1: ( ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) ) )
            // InternalVideoMontage.g:5470:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) )
            {
            // InternalVideoMontage.g:5470:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) )
            // InternalVideoMontage.g:5471:2: ( rule__TextAreaDynamic__AnimationAssignment_11_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_1()); 
            // InternalVideoMontage.g:5472:2: ( rule__TextAreaDynamic__AnimationAssignment_11_1 )
            // InternalVideoMontage.g:5472:3: rule__TextAreaDynamic__AnimationAssignment_11_1
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
    // InternalVideoMontage.g:5480:1: rule__TextAreaDynamic__Group_11__2 : rule__TextAreaDynamic__Group_11__2__Impl ;
    public final void rule__TextAreaDynamic__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5484:1: ( rule__TextAreaDynamic__Group_11__2__Impl )
            // InternalVideoMontage.g:5485:2: rule__TextAreaDynamic__Group_11__2__Impl
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
    // InternalVideoMontage.g:5491:1: rule__TextAreaDynamic__Group_11__2__Impl : ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* ) ;
    public final void rule__TextAreaDynamic__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5495:1: ( ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* ) )
            // InternalVideoMontage.g:5496:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* )
            {
            // InternalVideoMontage.g:5496:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* )
            // InternalVideoMontage.g:5497:2: ( rule__TextAreaDynamic__AnimationAssignment_11_2 )*
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_2()); 
            // InternalVideoMontage.g:5498:2: ( rule__TextAreaDynamic__AnimationAssignment_11_2 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=57 && LA45_0<=58)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalVideoMontage.g:5498:3: rule__TextAreaDynamic__AnimationAssignment_11_2
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__TextAreaDynamic__AnimationAssignment_11_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalVideoMontage.g:5507:1: rule__FadeIn__Group__0 : rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 ;
    public final void rule__FadeIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5511:1: ( rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 )
            // InternalVideoMontage.g:5512:2: rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalVideoMontage.g:5519:1: rule__FadeIn__Group__0__Impl : ( () ) ;
    public final void rule__FadeIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5523:1: ( ( () ) )
            // InternalVideoMontage.g:5524:1: ( () )
            {
            // InternalVideoMontage.g:5524:1: ( () )
            // InternalVideoMontage.g:5525:2: ()
            {
             before(grammarAccess.getFadeInAccess().getFadeInAction_0()); 
            // InternalVideoMontage.g:5526:2: ()
            // InternalVideoMontage.g:5526:3: 
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
    // InternalVideoMontage.g:5534:1: rule__FadeIn__Group__1 : rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 ;
    public final void rule__FadeIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5538:1: ( rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 )
            // InternalVideoMontage.g:5539:2: rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2
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
    // InternalVideoMontage.g:5546:1: rule__FadeIn__Group__1__Impl : ( 'FadeIn' ) ;
    public final void rule__FadeIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5550:1: ( ( 'FadeIn' ) )
            // InternalVideoMontage.g:5551:1: ( 'FadeIn' )
            {
            // InternalVideoMontage.g:5551:1: ( 'FadeIn' )
            // InternalVideoMontage.g:5552:2: 'FadeIn'
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
    // InternalVideoMontage.g:5561:1: rule__FadeIn__Group__2 : rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 ;
    public final void rule__FadeIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5565:1: ( rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 )
            // InternalVideoMontage.g:5566:2: rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:5573:1: rule__FadeIn__Group__2__Impl : ( '{' ) ;
    public final void rule__FadeIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5577:1: ( ( '{' ) )
            // InternalVideoMontage.g:5578:1: ( '{' )
            {
            // InternalVideoMontage.g:5578:1: ( '{' )
            // InternalVideoMontage.g:5579:2: '{'
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
    // InternalVideoMontage.g:5588:1: rule__FadeIn__Group__3 : rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 ;
    public final void rule__FadeIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5592:1: ( rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 )
            // InternalVideoMontage.g:5593:2: rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:5600:1: rule__FadeIn__Group__3__Impl : ( ( rule__FadeIn__Group_3__0 )? ) ;
    public final void rule__FadeIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5604:1: ( ( ( rule__FadeIn__Group_3__0 )? ) )
            // InternalVideoMontage.g:5605:1: ( ( rule__FadeIn__Group_3__0 )? )
            {
            // InternalVideoMontage.g:5605:1: ( ( rule__FadeIn__Group_3__0 )? )
            // InternalVideoMontage.g:5606:2: ( rule__FadeIn__Group_3__0 )?
            {
             before(grammarAccess.getFadeInAccess().getGroup_3()); 
            // InternalVideoMontage.g:5607:2: ( rule__FadeIn__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==29) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalVideoMontage.g:5607:3: rule__FadeIn__Group_3__0
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
    // InternalVideoMontage.g:5615:1: rule__FadeIn__Group__4 : rule__FadeIn__Group__4__Impl ;
    public final void rule__FadeIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5619:1: ( rule__FadeIn__Group__4__Impl )
            // InternalVideoMontage.g:5620:2: rule__FadeIn__Group__4__Impl
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
    // InternalVideoMontage.g:5626:1: rule__FadeIn__Group__4__Impl : ( '}' ) ;
    public final void rule__FadeIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5630:1: ( ( '}' ) )
            // InternalVideoMontage.g:5631:1: ( '}' )
            {
            // InternalVideoMontage.g:5631:1: ( '}' )
            // InternalVideoMontage.g:5632:2: '}'
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
    // InternalVideoMontage.g:5642:1: rule__FadeIn__Group_3__0 : rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1 ;
    public final void rule__FadeIn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5646:1: ( rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1 )
            // InternalVideoMontage.g:5647:2: rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:5654:1: rule__FadeIn__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__FadeIn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5658:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:5659:1: ( 'duration' )
            {
            // InternalVideoMontage.g:5659:1: ( 'duration' )
            // InternalVideoMontage.g:5660:2: 'duration'
            {
             before(grammarAccess.getFadeInAccess().getDurationKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalVideoMontage.g:5669:1: rule__FadeIn__Group_3__1 : rule__FadeIn__Group_3__1__Impl ;
    public final void rule__FadeIn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5673:1: ( rule__FadeIn__Group_3__1__Impl )
            // InternalVideoMontage.g:5674:2: rule__FadeIn__Group_3__1__Impl
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
    // InternalVideoMontage.g:5680:1: rule__FadeIn__Group_3__1__Impl : ( ( rule__FadeIn__DurationAssignment_3_1 ) ) ;
    public final void rule__FadeIn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5684:1: ( ( ( rule__FadeIn__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:5685:1: ( ( rule__FadeIn__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:5685:1: ( ( rule__FadeIn__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:5686:2: ( rule__FadeIn__DurationAssignment_3_1 )
            {
             before(grammarAccess.getFadeInAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:5687:2: ( rule__FadeIn__DurationAssignment_3_1 )
            // InternalVideoMontage.g:5687:3: rule__FadeIn__DurationAssignment_3_1
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
    // InternalVideoMontage.g:5696:1: rule__FadeOut__Group__0 : rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 ;
    public final void rule__FadeOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5700:1: ( rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 )
            // InternalVideoMontage.g:5701:2: rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalVideoMontage.g:5708:1: rule__FadeOut__Group__0__Impl : ( () ) ;
    public final void rule__FadeOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5712:1: ( ( () ) )
            // InternalVideoMontage.g:5713:1: ( () )
            {
            // InternalVideoMontage.g:5713:1: ( () )
            // InternalVideoMontage.g:5714:2: ()
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutAction_0()); 
            // InternalVideoMontage.g:5715:2: ()
            // InternalVideoMontage.g:5715:3: 
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
    // InternalVideoMontage.g:5723:1: rule__FadeOut__Group__1 : rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 ;
    public final void rule__FadeOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5727:1: ( rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 )
            // InternalVideoMontage.g:5728:2: rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2
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
    // InternalVideoMontage.g:5735:1: rule__FadeOut__Group__1__Impl : ( 'FadeOut' ) ;
    public final void rule__FadeOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5739:1: ( ( 'FadeOut' ) )
            // InternalVideoMontage.g:5740:1: ( 'FadeOut' )
            {
            // InternalVideoMontage.g:5740:1: ( 'FadeOut' )
            // InternalVideoMontage.g:5741:2: 'FadeOut'
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
    // InternalVideoMontage.g:5750:1: rule__FadeOut__Group__2 : rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 ;
    public final void rule__FadeOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5754:1: ( rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 )
            // InternalVideoMontage.g:5755:2: rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:5762:1: rule__FadeOut__Group__2__Impl : ( '{' ) ;
    public final void rule__FadeOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5766:1: ( ( '{' ) )
            // InternalVideoMontage.g:5767:1: ( '{' )
            {
            // InternalVideoMontage.g:5767:1: ( '{' )
            // InternalVideoMontage.g:5768:2: '{'
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
    // InternalVideoMontage.g:5777:1: rule__FadeOut__Group__3 : rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 ;
    public final void rule__FadeOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5781:1: ( rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 )
            // InternalVideoMontage.g:5782:2: rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:5789:1: rule__FadeOut__Group__3__Impl : ( ( rule__FadeOut__Group_3__0 )? ) ;
    public final void rule__FadeOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5793:1: ( ( ( rule__FadeOut__Group_3__0 )? ) )
            // InternalVideoMontage.g:5794:1: ( ( rule__FadeOut__Group_3__0 )? )
            {
            // InternalVideoMontage.g:5794:1: ( ( rule__FadeOut__Group_3__0 )? )
            // InternalVideoMontage.g:5795:2: ( rule__FadeOut__Group_3__0 )?
            {
             before(grammarAccess.getFadeOutAccess().getGroup_3()); 
            // InternalVideoMontage.g:5796:2: ( rule__FadeOut__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==29) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalVideoMontage.g:5796:3: rule__FadeOut__Group_3__0
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
    // InternalVideoMontage.g:5804:1: rule__FadeOut__Group__4 : rule__FadeOut__Group__4__Impl ;
    public final void rule__FadeOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5808:1: ( rule__FadeOut__Group__4__Impl )
            // InternalVideoMontage.g:5809:2: rule__FadeOut__Group__4__Impl
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
    // InternalVideoMontage.g:5815:1: rule__FadeOut__Group__4__Impl : ( '}' ) ;
    public final void rule__FadeOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5819:1: ( ( '}' ) )
            // InternalVideoMontage.g:5820:1: ( '}' )
            {
            // InternalVideoMontage.g:5820:1: ( '}' )
            // InternalVideoMontage.g:5821:2: '}'
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
    // InternalVideoMontage.g:5831:1: rule__FadeOut__Group_3__0 : rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1 ;
    public final void rule__FadeOut__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5835:1: ( rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1 )
            // InternalVideoMontage.g:5836:2: rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:5843:1: rule__FadeOut__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__FadeOut__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5847:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:5848:1: ( 'duration' )
            {
            // InternalVideoMontage.g:5848:1: ( 'duration' )
            // InternalVideoMontage.g:5849:2: 'duration'
            {
             before(grammarAccess.getFadeOutAccess().getDurationKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalVideoMontage.g:5858:1: rule__FadeOut__Group_3__1 : rule__FadeOut__Group_3__1__Impl ;
    public final void rule__FadeOut__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5862:1: ( rule__FadeOut__Group_3__1__Impl )
            // InternalVideoMontage.g:5863:2: rule__FadeOut__Group_3__1__Impl
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
    // InternalVideoMontage.g:5869:1: rule__FadeOut__Group_3__1__Impl : ( ( rule__FadeOut__DurationAssignment_3_1 ) ) ;
    public final void rule__FadeOut__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5873:1: ( ( ( rule__FadeOut__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:5874:1: ( ( rule__FadeOut__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:5874:1: ( ( rule__FadeOut__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:5875:2: ( rule__FadeOut__DurationAssignment_3_1 )
            {
             before(grammarAccess.getFadeOutAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:5876:2: ( rule__FadeOut__DurationAssignment_3_1 )
            // InternalVideoMontage.g:5876:3: rule__FadeOut__DurationAssignment_3_1
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
    // InternalVideoMontage.g:5885:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5889:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalVideoMontage.g:5890:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:5897:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5901:1: ( ( ( '-' )? ) )
            // InternalVideoMontage.g:5902:1: ( ( '-' )? )
            {
            // InternalVideoMontage.g:5902:1: ( ( '-' )? )
            // InternalVideoMontage.g:5903:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalVideoMontage.g:5904:2: ( '-' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==16) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalVideoMontage.g:5904:3: '-'
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
    // InternalVideoMontage.g:5912:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5916:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalVideoMontage.g:5917:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:5924:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5928:1: ( ( ( RULE_INT )? ) )
            // InternalVideoMontage.g:5929:1: ( ( RULE_INT )? )
            {
            // InternalVideoMontage.g:5929:1: ( ( RULE_INT )? )
            // InternalVideoMontage.g:5930:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalVideoMontage.g:5931:2: ( RULE_INT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_INT) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalVideoMontage.g:5931:3: RULE_INT
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
    // InternalVideoMontage.g:5939:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5943:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalVideoMontage.g:5944:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalVideoMontage.g:5951:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5955:1: ( ( '.' ) )
            // InternalVideoMontage.g:5956:1: ( '.' )
            {
            // InternalVideoMontage.g:5956:1: ( '.' )
            // InternalVideoMontage.g:5957:2: '.'
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
    // InternalVideoMontage.g:5966:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5970:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalVideoMontage.g:5971:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_47);
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
    // InternalVideoMontage.g:5978:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5982:1: ( ( RULE_INT ) )
            // InternalVideoMontage.g:5983:1: ( RULE_INT )
            {
            // InternalVideoMontage.g:5983:1: ( RULE_INT )
            // InternalVideoMontage.g:5984:2: RULE_INT
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
    // InternalVideoMontage.g:5993:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5997:1: ( rule__EDouble__Group__4__Impl )
            // InternalVideoMontage.g:5998:2: rule__EDouble__Group__4__Impl
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
    // InternalVideoMontage.g:6004:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6008:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalVideoMontage.g:6009:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalVideoMontage.g:6009:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalVideoMontage.g:6010:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalVideoMontage.g:6011:2: ( rule__EDouble__Group_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=13 && LA50_0<=14)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalVideoMontage.g:6011:3: rule__EDouble__Group_4__0
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
    // InternalVideoMontage.g:6020:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6024:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalVideoMontage.g:6025:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalVideoMontage.g:6032:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6036:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalVideoMontage.g:6037:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalVideoMontage.g:6037:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalVideoMontage.g:6038:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalVideoMontage.g:6039:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalVideoMontage.g:6039:3: rule__EDouble__Alternatives_4_0
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
    // InternalVideoMontage.g:6047:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6051:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalVideoMontage.g:6052:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalVideoMontage.g:6059:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6063:1: ( ( ( '-' )? ) )
            // InternalVideoMontage.g:6064:1: ( ( '-' )? )
            {
            // InternalVideoMontage.g:6064:1: ( ( '-' )? )
            // InternalVideoMontage.g:6065:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalVideoMontage.g:6066:2: ( '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==16) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalVideoMontage.g:6066:3: '-'
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
    // InternalVideoMontage.g:6074:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6078:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalVideoMontage.g:6079:2: rule__EDouble__Group_4__2__Impl
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
    // InternalVideoMontage.g:6085:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6089:1: ( ( RULE_INT ) )
            // InternalVideoMontage.g:6090:1: ( RULE_INT )
            {
            // InternalVideoMontage.g:6090:1: ( RULE_INT )
            // InternalVideoMontage.g:6091:2: RULE_INT
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
    // InternalVideoMontage.g:6101:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6105:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalVideoMontage.g:6106:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalVideoMontage.g:6113:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6117:1: ( ( ( '-' )? ) )
            // InternalVideoMontage.g:6118:1: ( ( '-' )? )
            {
            // InternalVideoMontage.g:6118:1: ( ( '-' )? )
            // InternalVideoMontage.g:6119:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalVideoMontage.g:6120:2: ( '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==16) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalVideoMontage.g:6120:3: '-'
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
    // InternalVideoMontage.g:6128:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6132:1: ( rule__EInt__Group__1__Impl )
            // InternalVideoMontage.g:6133:2: rule__EInt__Group__1__Impl
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
    // InternalVideoMontage.g:6139:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6143:1: ( ( RULE_INT ) )
            // InternalVideoMontage.g:6144:1: ( RULE_INT )
            {
            // InternalVideoMontage.g:6144:1: ( RULE_INT )
            // InternalVideoMontage.g:6145:2: RULE_INT
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
    // InternalVideoMontage.g:6155:1: rule__Movie__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__Movie__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6159:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6160:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6160:2: ( ruleEString )
            // InternalVideoMontage.g:6161:3: ruleEString
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
    // InternalVideoMontage.g:6170:1: rule__Movie__VideoelementAssignment_3 : ( ruleVideoElement ) ;
    public final void rule__Movie__VideoelementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6174:1: ( ( ruleVideoElement ) )
            // InternalVideoMontage.g:6175:2: ( ruleVideoElement )
            {
            // InternalVideoMontage.g:6175:2: ( ruleVideoElement )
            // InternalVideoMontage.g:6176:3: ruleVideoElement
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
    // InternalVideoMontage.g:6185:1: rule__Movie__VideoelementAssignment_4 : ( ruleVideoElement ) ;
    public final void rule__Movie__VideoelementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6189:1: ( ( ruleVideoElement ) )
            // InternalVideoMontage.g:6190:2: ( ruleVideoElement )
            {
            // InternalVideoMontage.g:6190:2: ( ruleVideoElement )
            // InternalVideoMontage.g:6191:3: ruleVideoElement
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


    // $ANTLR start "rule__Movie__AudioelementAssignment_5_0"
    // InternalVideoMontage.g:6200:1: rule__Movie__AudioelementAssignment_5_0 : ( ruleAudioElement ) ;
    public final void rule__Movie__AudioelementAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6204:1: ( ( ruleAudioElement ) )
            // InternalVideoMontage.g:6205:2: ( ruleAudioElement )
            {
            // InternalVideoMontage.g:6205:2: ( ruleAudioElement )
            // InternalVideoMontage.g:6206:3: ruleAudioElement
            {
             before(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAudioElement();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__AudioelementAssignment_5_0"


    // $ANTLR start "rule__Movie__AudioelementAssignment_5_1"
    // InternalVideoMontage.g:6215:1: rule__Movie__AudioelementAssignment_5_1 : ( ruleAudioElement ) ;
    public final void rule__Movie__AudioelementAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6219:1: ( ( ruleAudioElement ) )
            // InternalVideoMontage.g:6220:2: ( ruleAudioElement )
            {
            // InternalVideoMontage.g:6220:2: ( ruleAudioElement )
            // InternalVideoMontage.g:6221:3: ruleAudioElement
            {
             before(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAudioElement();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__AudioelementAssignment_5_1"


    // $ANTLR start "rule__Movie__SubtitleAssignment_6_0"
    // InternalVideoMontage.g:6230:1: rule__Movie__SubtitleAssignment_6_0 : ( ruleSubtitle ) ;
    public final void rule__Movie__SubtitleAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6234:1: ( ( ruleSubtitle ) )
            // InternalVideoMontage.g:6235:2: ( ruleSubtitle )
            {
            // InternalVideoMontage.g:6235:2: ( ruleSubtitle )
            // InternalVideoMontage.g:6236:3: ruleSubtitle
            {
             before(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtitle();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__SubtitleAssignment_6_0"


    // $ANTLR start "rule__Movie__SubtitleAssignment_6_1"
    // InternalVideoMontage.g:6245:1: rule__Movie__SubtitleAssignment_6_1 : ( ruleSubtitle ) ;
    public final void rule__Movie__SubtitleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6249:1: ( ( ruleSubtitle ) )
            // InternalVideoMontage.g:6250:2: ( ruleSubtitle )
            {
            // InternalVideoMontage.g:6250:2: ( ruleSubtitle )
            // InternalVideoMontage.g:6251:3: ruleSubtitle
            {
             before(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtitle();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__SubtitleAssignment_6_1"


    // $ANTLR start "rule__Movie__VideoTimelineAssignment_7"
    // InternalVideoMontage.g:6260:1: rule__Movie__VideoTimelineAssignment_7 : ( ruleVideoTimeLine ) ;
    public final void rule__Movie__VideoTimelineAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6264:1: ( ( ruleVideoTimeLine ) )
            // InternalVideoMontage.g:6265:2: ( ruleVideoTimeLine )
            {
            // InternalVideoMontage.g:6265:2: ( ruleVideoTimeLine )
            // InternalVideoMontage.g:6266:3: ruleVideoTimeLine
            {
             before(grammarAccess.getMovieAccess().getVideoTimelineVideoTimeLineParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoTimeLine();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getVideoTimelineVideoTimeLineParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__VideoTimelineAssignment_7"


    // $ANTLR start "rule__VideoTimeLine__VideosAssignment_1"
    // InternalVideoMontage.g:6275:1: rule__VideoTimeLine__VideosAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VideoTimeLine__VideosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6279:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontage.g:6280:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontage.g:6280:2: ( ( RULE_ID ) )
            // InternalVideoMontage.g:6281:3: ( RULE_ID )
            {
             before(grammarAccess.getVideoTimeLineAccess().getVideosVideoElementCrossReference_1_0()); 
            // InternalVideoMontage.g:6282:3: ( RULE_ID )
            // InternalVideoMontage.g:6283:4: RULE_ID
            {
             before(grammarAccess.getVideoTimeLineAccess().getVideosVideoElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVideoTimeLineAccess().getVideosVideoElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVideoTimeLineAccess().getVideosVideoElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoTimeLine__VideosAssignment_1"


    // $ANTLR start "rule__VideoTimeLine__VideosAssignment_2"
    // InternalVideoMontage.g:6294:1: rule__VideoTimeLine__VideosAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__VideoTimeLine__VideosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6298:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontage.g:6299:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontage.g:6299:2: ( ( RULE_ID ) )
            // InternalVideoMontage.g:6300:3: ( RULE_ID )
            {
             before(grammarAccess.getVideoTimeLineAccess().getVideosVideoElementCrossReference_2_0()); 
            // InternalVideoMontage.g:6301:3: ( RULE_ID )
            // InternalVideoMontage.g:6302:4: RULE_ID
            {
             before(grammarAccess.getVideoTimeLineAccess().getVideosVideoElementIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVideoTimeLineAccess().getVideosVideoElementIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getVideoTimeLineAccess().getVideosVideoElementCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoTimeLine__VideosAssignment_2"


    // $ANTLR start "rule__Subtitle__NameAssignment_1"
    // InternalVideoMontage.g:6313:1: rule__Subtitle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Subtitle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6317:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6318:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6318:2: ( ruleEString )
            // InternalVideoMontage.g:6319:3: ruleEString
            {
             before(grammarAccess.getSubtitleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__NameAssignment_1"


    // $ANTLR start "rule__Subtitle__StartingmomentAssignment_4"
    // InternalVideoMontage.g:6328:1: rule__Subtitle__StartingmomentAssignment_4 : ( ruleStartingMoment ) ;
    public final void rule__Subtitle__StartingmomentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6332:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontage.g:6333:2: ( ruleStartingMoment )
            {
            // InternalVideoMontage.g:6333:2: ( ruleStartingMoment )
            // InternalVideoMontage.g:6334:3: ruleStartingMoment
            {
             before(grammarAccess.getSubtitleAccess().getStartingmomentStartingMomentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStartingMoment();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getStartingmomentStartingMomentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__StartingmomentAssignment_4"


    // $ANTLR start "rule__Subtitle__DurationAssignment_6_1"
    // InternalVideoMontage.g:6343:1: rule__Subtitle__DurationAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__Subtitle__DurationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6347:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6348:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6348:2: ( ruleEDouble )
            // InternalVideoMontage.g:6349:3: ruleEDouble
            {
             before(grammarAccess.getSubtitleAccess().getDurationEDoubleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getDurationEDoubleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__DurationAssignment_6_1"


    // $ANTLR start "rule__Subtitle__TextareaAssignment_8"
    // InternalVideoMontage.g:6358:1: rule__Subtitle__TextareaAssignment_8 : ( ruleTextArea ) ;
    public final void rule__Subtitle__TextareaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6362:1: ( ( ruleTextArea ) )
            // InternalVideoMontage.g:6363:2: ( ruleTextArea )
            {
            // InternalVideoMontage.g:6363:2: ( ruleTextArea )
            // InternalVideoMontage.g:6364:3: ruleTextArea
            {
             before(grammarAccess.getSubtitleAccess().getTextareaTextAreaParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTextArea();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getTextareaTextAreaParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__TextareaAssignment_8"


    // $ANTLR start "rule__Audio__NameAssignment_1"
    // InternalVideoMontage.g:6373:1: rule__Audio__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Audio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6377:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6378:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6378:2: ( ruleEString )
            // InternalVideoMontage.g:6379:3: ruleEString
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
    // InternalVideoMontage.g:6388:1: rule__Audio__StartingmomentAssignment_4 : ( ruleStartingMoment ) ;
    public final void rule__Audio__StartingmomentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6392:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontage.g:6393:2: ( ruleStartingMoment )
            {
            // InternalVideoMontage.g:6393:2: ( ruleStartingMoment )
            // InternalVideoMontage.g:6394:3: ruleStartingMoment
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
    // InternalVideoMontage.g:6403:1: rule__Audio__PathAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Audio__PathAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6407:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6408:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6408:2: ( ruleEString )
            // InternalVideoMontage.g:6409:3: ruleEString
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
    // InternalVideoMontage.g:6418:1: rule__Audio__TransitionAssignment_7_1 : ( ruleTransition ) ;
    public final void rule__Audio__TransitionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6422:1: ( ( ruleTransition ) )
            // InternalVideoMontage.g:6423:2: ( ruleTransition )
            {
            // InternalVideoMontage.g:6423:2: ( ruleTransition )
            // InternalVideoMontage.g:6424:3: ruleTransition
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
    // InternalVideoMontage.g:6433:1: rule__AudioClip__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AudioClip__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6437:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6438:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6438:2: ( ruleEString )
            // InternalVideoMontage.g:6439:3: ruleEString
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
    // InternalVideoMontage.g:6448:1: rule__AudioClip__StartingmomentAssignment_4 : ( ruleStartingMoment ) ;
    public final void rule__AudioClip__StartingmomentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6452:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontage.g:6453:2: ( ruleStartingMoment )
            {
            // InternalVideoMontage.g:6453:2: ( ruleStartingMoment )
            // InternalVideoMontage.g:6454:3: ruleStartingMoment
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
    // InternalVideoMontage.g:6463:1: rule__AudioClip__VolumeAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__VolumeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6467:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6468:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6468:2: ( ruleEDouble )
            // InternalVideoMontage.g:6469:3: ruleEDouble
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
    // InternalVideoMontage.g:6478:1: rule__AudioClip__StartCutAssignment_7_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__StartCutAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6482:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6483:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6483:2: ( ruleEDouble )
            // InternalVideoMontage.g:6484:3: ruleEDouble
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
    // InternalVideoMontage.g:6493:1: rule__AudioClip__EndCutAssignment_8_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__EndCutAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6497:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6498:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6498:2: ( ruleEDouble )
            // InternalVideoMontage.g:6499:3: ruleEDouble
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
    // InternalVideoMontage.g:6508:1: rule__AudioClip__TransitionAssignment_9_1 : ( ruleTransition ) ;
    public final void rule__AudioClip__TransitionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6512:1: ( ( ruleTransition ) )
            // InternalVideoMontage.g:6513:2: ( ruleTransition )
            {
            // InternalVideoMontage.g:6513:2: ( ruleTransition )
            // InternalVideoMontage.g:6514:3: ruleTransition
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


    // $ANTLR start "rule__AudioClip__AudioAssignment_11"
    // InternalVideoMontage.g:6523:1: rule__AudioClip__AudioAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__AudioClip__AudioAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6527:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontage.g:6528:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontage.g:6528:2: ( ( RULE_ID ) )
            // InternalVideoMontage.g:6529:3: ( RULE_ID )
            {
             before(grammarAccess.getAudioClipAccess().getAudioAudioCrossReference_11_0()); 
            // InternalVideoMontage.g:6530:3: ( RULE_ID )
            // InternalVideoMontage.g:6531:4: RULE_ID
            {
             before(grammarAccess.getAudioClipAccess().getAudioAudioIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getAudioAudioIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getAudioClipAccess().getAudioAudioCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__AudioAssignment_11"


    // $ANTLR start "rule__Clip__NameAssignment_1"
    // InternalVideoMontage.g:6542:1: rule__Clip__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Clip__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6546:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6547:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6547:2: ( ruleEString )
            // InternalVideoMontage.g:6548:3: ruleEString
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
    // InternalVideoMontage.g:6557:1: rule__Clip__StartCutAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Clip__StartCutAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6561:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6562:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6562:2: ( ruleEDouble )
            // InternalVideoMontage.g:6563:3: ruleEDouble
            {
             before(grammarAccess.getClipAccess().getStartCutEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getClipAccess().getStartCutEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:6572:1: rule__Clip__EndCutAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Clip__EndCutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6576:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6577:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6577:2: ( ruleEDouble )
            // InternalVideoMontage.g:6578:3: ruleEDouble
            {
             before(grammarAccess.getClipAccess().getEndCutEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getClipAccess().getEndCutEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Clip__VideoAssignment_6"
    // InternalVideoMontage.g:6587:1: rule__Clip__VideoAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Clip__VideoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6591:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontage.g:6592:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontage.g:6592:2: ( ( RULE_ID ) )
            // InternalVideoMontage.g:6593:3: ( RULE_ID )
            {
             before(grammarAccess.getClipAccess().getVideoVideoCrossReference_6_0()); 
            // InternalVideoMontage.g:6594:3: ( RULE_ID )
            // InternalVideoMontage.g:6595:4: RULE_ID
            {
             before(grammarAccess.getClipAccess().getVideoVideoIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getVideoVideoIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getClipAccess().getVideoVideoCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__VideoAssignment_6"


    // $ANTLR start "rule__Title__NameAssignment_1"
    // InternalVideoMontage.g:6606:1: rule__Title__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Title__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6610:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6611:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6611:2: ( ruleEString )
            // InternalVideoMontage.g:6612:3: ruleEString
            {
             before(grammarAccess.getTitleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__NameAssignment_1"


    // $ANTLR start "rule__Title__DurationAssignment_3_1"
    // InternalVideoMontage.g:6621:1: rule__Title__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Title__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6625:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6626:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6626:2: ( ruleEDouble )
            // InternalVideoMontage.g:6627:3: ruleEDouble
            {
             before(grammarAccess.getTitleAccess().getDurationEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getDurationEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__DurationAssignment_3_1"


    // $ANTLR start "rule__Title__BackgroundColorAssignment_4_1"
    // InternalVideoMontage.g:6636:1: rule__Title__BackgroundColorAssignment_4_1 : ( ruleColor ) ;
    public final void rule__Title__BackgroundColorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6640:1: ( ( ruleColor ) )
            // InternalVideoMontage.g:6641:2: ( ruleColor )
            {
            // InternalVideoMontage.g:6641:2: ( ruleColor )
            // InternalVideoMontage.g:6642:3: ruleColor
            {
             before(grammarAccess.getTitleAccess().getBackgroundColorColorEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getBackgroundColorColorEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__BackgroundColorAssignment_4_1"


    // $ANTLR start "rule__Title__TextareaAssignment_6"
    // InternalVideoMontage.g:6651:1: rule__Title__TextareaAssignment_6 : ( ruleTextArea ) ;
    public final void rule__Title__TextareaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6655:1: ( ( ruleTextArea ) )
            // InternalVideoMontage.g:6656:2: ( ruleTextArea )
            {
            // InternalVideoMontage.g:6656:2: ( ruleTextArea )
            // InternalVideoMontage.g:6657:3: ruleTextArea
            {
             before(grammarAccess.getTitleAccess().getTextareaTextAreaParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleTextArea();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getTextareaTextAreaParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__TextareaAssignment_6"


    // $ANTLR start "rule__Video__NameAssignment_0"
    // InternalVideoMontage.g:6666:1: rule__Video__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6670:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6671:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6671:2: ( ruleEString )
            // InternalVideoMontage.g:6672:3: ruleEString
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
    // InternalVideoMontage.g:6681:1: rule__Video__PathAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Video__PathAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6685:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6686:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6686:2: ( ruleEString )
            // InternalVideoMontage.g:6687:3: ruleEString
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
    // InternalVideoMontage.g:6696:1: rule__RelativeMoment__MomentAssignment_1 : ( ruleMoment ) ;
    public final void rule__RelativeMoment__MomentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6700:1: ( ( ruleMoment ) )
            // InternalVideoMontage.g:6701:2: ( ruleMoment )
            {
            // InternalVideoMontage.g:6701:2: ( ruleMoment )
            // InternalVideoMontage.g:6702:3: ruleMoment
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


    // $ANTLR start "rule__RelativeMoment__ElementAssignment_3"
    // InternalVideoMontage.g:6711:1: rule__RelativeMoment__ElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RelativeMoment__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6715:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontage.g:6716:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontage.g:6716:2: ( ( RULE_ID ) )
            // InternalVideoMontage.g:6717:3: ( RULE_ID )
            {
             before(grammarAccess.getRelativeMomentAccess().getElementElementCrossReference_3_0()); 
            // InternalVideoMontage.g:6718:3: ( RULE_ID )
            // InternalVideoMontage.g:6719:4: RULE_ID
            {
             before(grammarAccess.getRelativeMomentAccess().getElementElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRelativeMomentAccess().getElementElementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRelativeMomentAccess().getElementElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__ElementAssignment_3"


    // $ANTLR start "rule__RelativeMoment__OperationMomentAssignment_4_0"
    // InternalVideoMontage.g:6730:1: rule__RelativeMoment__OperationMomentAssignment_4_0 : ( ruleOperationMoment ) ;
    public final void rule__RelativeMoment__OperationMomentAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6734:1: ( ( ruleOperationMoment ) )
            // InternalVideoMontage.g:6735:2: ( ruleOperationMoment )
            {
            // InternalVideoMontage.g:6735:2: ( ruleOperationMoment )
            // InternalVideoMontage.g:6736:3: ruleOperationMoment
            {
             before(grammarAccess.getRelativeMomentAccess().getOperationMomentOperationMomentEnumRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOperationMoment();

            state._fsp--;

             after(grammarAccess.getRelativeMomentAccess().getOperationMomentOperationMomentEnumRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__OperationMomentAssignment_4_0"


    // $ANTLR start "rule__RelativeMoment__ValueAssignment_4_1"
    // InternalVideoMontage.g:6745:1: rule__RelativeMoment__ValueAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__RelativeMoment__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6749:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6750:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6750:2: ( ruleEDouble )
            // InternalVideoMontage.g:6751:3: ruleEDouble
            {
             before(grammarAccess.getRelativeMomentAccess().getValueEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRelativeMomentAccess().getValueEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__ValueAssignment_4_1"


    // $ANTLR start "rule__AbsoluteMoment__TimeAssignment_1_1"
    // InternalVideoMontage.g:6760:1: rule__AbsoluteMoment__TimeAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__AbsoluteMoment__TimeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6764:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6765:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6765:2: ( ruleEDouble )
            // InternalVideoMontage.g:6766:3: ruleEDouble
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
    // InternalVideoMontage.g:6775:1: rule__Transition__DurationAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__Transition__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6779:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6780:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6780:2: ( ruleEDouble )
            // InternalVideoMontage.g:6781:3: ruleEDouble
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
    // InternalVideoMontage.g:6790:1: rule__Transition__AudioelementAssignment_4 : ( ruleAudioElement ) ;
    public final void rule__Transition__AudioelementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6794:1: ( ( ruleAudioElement ) )
            // InternalVideoMontage.g:6795:2: ( ruleAudioElement )
            {
            // InternalVideoMontage.g:6795:2: ( ruleAudioElement )
            // InternalVideoMontage.g:6796:3: ruleAudioElement
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


    // $ANTLR start "rule__TextArea_Impl__XAssignment_2_1"
    // InternalVideoMontage.g:6805:1: rule__TextArea_Impl__XAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__TextArea_Impl__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6809:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:6810:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:6810:2: ( ruleEInt )
            // InternalVideoMontage.g:6811:3: ruleEInt
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
    // InternalVideoMontage.g:6820:1: rule__TextArea_Impl__YAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__TextArea_Impl__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6824:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:6825:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:6825:2: ( ruleEInt )
            // InternalVideoMontage.g:6826:3: ruleEInt
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
    // InternalVideoMontage.g:6835:1: rule__TextArea_Impl__WidthAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__TextArea_Impl__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6839:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6840:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6840:2: ( ruleEDouble )
            // InternalVideoMontage.g:6841:3: ruleEDouble
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
    // InternalVideoMontage.g:6850:1: rule__TextArea_Impl__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__TextArea_Impl__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6854:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6855:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6855:2: ( ruleEDouble )
            // InternalVideoMontage.g:6856:3: ruleEDouble
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
    // InternalVideoMontage.g:6865:1: rule__TextArea_Impl__TextAssignment_6_1 : ( ruleEString ) ;
    public final void rule__TextArea_Impl__TextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6869:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6870:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6870:2: ( ruleEString )
            // InternalVideoMontage.g:6871:3: ruleEString
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
    // InternalVideoMontage.g:6880:1: rule__TextArea_Impl__FontAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__TextArea_Impl__FontAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6884:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontage.g:6885:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontage.g:6885:2: ( ( RULE_ID ) )
            // InternalVideoMontage.g:6886:3: ( RULE_ID )
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontFontCrossReference_7_1_0()); 
            // InternalVideoMontage.g:6887:3: ( RULE_ID )
            // InternalVideoMontage.g:6888:4: RULE_ID
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
    // InternalVideoMontage.g:6899:1: rule__TextArea_Impl__AnimationAssignment_8_1 : ( ruleAnimation ) ;
    public final void rule__TextArea_Impl__AnimationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6903:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:6904:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:6904:2: ( ruleAnimation )
            // InternalVideoMontage.g:6905:3: ruleAnimation
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
    // InternalVideoMontage.g:6914:1: rule__TextArea_Impl__AnimationAssignment_8_2 : ( ruleAnimation ) ;
    public final void rule__TextArea_Impl__AnimationAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6918:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:6919:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:6919:2: ( ruleAnimation )
            // InternalVideoMontage.g:6920:3: ruleAnimation
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
    // InternalVideoMontage.g:6929:1: rule__TextAreaDynamic__XAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6933:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:6934:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:6934:2: ( ruleEInt )
            // InternalVideoMontage.g:6935:3: ruleEInt
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
    // InternalVideoMontage.g:6944:1: rule__TextAreaDynamic__YAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6948:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:6949:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:6949:2: ( ruleEInt )
            // InternalVideoMontage.g:6950:3: ruleEInt
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
    // InternalVideoMontage.g:6959:1: rule__TextAreaDynamic__WidthAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__TextAreaDynamic__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6963:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6964:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6964:2: ( ruleEDouble )
            // InternalVideoMontage.g:6965:3: ruleEDouble
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
    // InternalVideoMontage.g:6974:1: rule__TextAreaDynamic__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__TextAreaDynamic__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6978:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:6979:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:6979:2: ( ruleEDouble )
            // InternalVideoMontage.g:6980:3: ruleEDouble
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
    // InternalVideoMontage.g:6989:1: rule__TextAreaDynamic__TextAssignment_6_1 : ( ruleEString ) ;
    public final void rule__TextAreaDynamic__TextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6993:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:6994:2: ( ruleEString )
            {
            // InternalVideoMontage.g:6994:2: ( ruleEString )
            // InternalVideoMontage.g:6995:3: ruleEString
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
    // InternalVideoMontage.g:7004:1: rule__TextAreaDynamic__TextSrcAssignment_7_1 : ( ruleEString ) ;
    public final void rule__TextAreaDynamic__TextSrcAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7008:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:7009:2: ( ruleEString )
            {
            // InternalVideoMontage.g:7009:2: ( ruleEString )
            // InternalVideoMontage.g:7010:3: ruleEString
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
    // InternalVideoMontage.g:7019:1: rule__TextAreaDynamic__LineAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__LineAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7023:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:7024:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:7024:2: ( ruleEInt )
            // InternalVideoMontage.g:7025:3: ruleEInt
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
    // InternalVideoMontage.g:7034:1: rule__TextAreaDynamic__FontAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__TextAreaDynamic__FontAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7038:1: ( ( ( ruleEString ) ) )
            // InternalVideoMontage.g:7039:2: ( ( ruleEString ) )
            {
            // InternalVideoMontage.g:7039:2: ( ( ruleEString ) )
            // InternalVideoMontage.g:7040:3: ( ruleEString )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontFontCrossReference_10_0()); 
            // InternalVideoMontage.g:7041:3: ( ruleEString )
            // InternalVideoMontage.g:7042:4: ruleEString
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
    // InternalVideoMontage.g:7053:1: rule__TextAreaDynamic__AnimationAssignment_11_1 : ( ruleAnimation ) ;
    public final void rule__TextAreaDynamic__AnimationAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7057:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:7058:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:7058:2: ( ruleAnimation )
            // InternalVideoMontage.g:7059:3: ruleAnimation
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
    // InternalVideoMontage.g:7068:1: rule__TextAreaDynamic__AnimationAssignment_11_2 : ( ruleAnimation ) ;
    public final void rule__TextAreaDynamic__AnimationAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7072:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:7073:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:7073:2: ( ruleAnimation )
            // InternalVideoMontage.g:7074:3: ruleAnimation
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
    // InternalVideoMontage.g:7083:1: rule__FadeIn__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__FadeIn__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7087:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:7088:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:7088:2: ( ruleEDouble )
            // InternalVideoMontage.g:7089:3: ruleEDouble
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
    // InternalVideoMontage.g:7098:1: rule__FadeOut__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__FadeOut__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7102:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:7103:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:7103:2: ( ruleEDouble )
            // InternalVideoMontage.g:7104:3: ruleEDouble
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000014000000030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001C0000060000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0040400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0800000000010040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000180200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000B000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020030000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000060000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000F800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0030000000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x019F800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000006000L});

}