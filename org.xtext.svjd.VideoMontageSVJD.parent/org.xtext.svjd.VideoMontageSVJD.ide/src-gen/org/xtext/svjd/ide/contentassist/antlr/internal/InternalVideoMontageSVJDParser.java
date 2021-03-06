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
import org.xtext.svjd.services.VideoMontageSVJDGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoMontageSVJDParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BLACK'", "'COMIC_SANS_MS'", "'E'", "'e'", "'+'", "'-'", "'starting'", "'ending'", "'Movie'", "'{'", "'}'", "'audioElement'", "'videoElement'", "'timeline'", "'Subtitle'", "'start'", "':'", "'textArea'", "'duration'", "'Audio'", "'path'", "'transition'", "'AudioClip'", "'audio'", "'volume'", "'startCut'", "'endCut'", "'Clip'", "'video'", "'Title'", "'backgroundColor'", "'of'", "'time'", "'StartingMoment'", "'Transition'", "'TextArea'", "'x'", "'y'", "'width'", "'height'", "'text'", "'font'", "'animation'", "'TextAreaDynamic'", "'textSrc'", "'line'", "'ScrollingText'", "'speed'", "'FadeIn'", "'FadeOut'", "'.'"
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
    public static final int T__60=60;
    public static final int T__61=61;
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


        public InternalVideoMontageSVJDParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoMontageSVJDParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoMontageSVJDParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVideoMontageSVJD.g"; }


    	private VideoMontageSVJDGrammarAccess grammarAccess;

    	public void setGrammarAccess(VideoMontageSVJDGrammarAccess grammarAccess) {
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
    // InternalVideoMontageSVJD.g:53:1: entryRuleMovie : ruleMovie EOF ;
    public final void entryRuleMovie() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:54:1: ( ruleMovie EOF )
            // InternalVideoMontageSVJD.g:55:1: ruleMovie EOF
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
    // InternalVideoMontageSVJD.g:62:1: ruleMovie : ( ( rule__Movie__Group__0 ) ) ;
    public final void ruleMovie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:66:2: ( ( ( rule__Movie__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:67:2: ( ( rule__Movie__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:67:2: ( ( rule__Movie__Group__0 ) )
            // InternalVideoMontageSVJD.g:68:3: ( rule__Movie__Group__0 )
            {
             before(grammarAccess.getMovieAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:69:3: ( rule__Movie__Group__0 )
            // InternalVideoMontageSVJD.g:69:4: rule__Movie__Group__0
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
    // InternalVideoMontageSVJD.g:78:1: entryRuleAudioElement : ruleAudioElement EOF ;
    public final void entryRuleAudioElement() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:79:1: ( ruleAudioElement EOF )
            // InternalVideoMontageSVJD.g:80:1: ruleAudioElement EOF
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
    // InternalVideoMontageSVJD.g:87:1: ruleAudioElement : ( ( rule__AudioElement__Group__0 ) ) ;
    public final void ruleAudioElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:91:2: ( ( ( rule__AudioElement__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:92:2: ( ( rule__AudioElement__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:92:2: ( ( rule__AudioElement__Group__0 ) )
            // InternalVideoMontageSVJD.g:93:3: ( rule__AudioElement__Group__0 )
            {
             before(grammarAccess.getAudioElementAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:94:3: ( rule__AudioElement__Group__0 )
            // InternalVideoMontageSVJD.g:94:4: rule__AudioElement__Group__0
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
    // InternalVideoMontageSVJD.g:103:1: entryRuleVideoElement : ruleVideoElement EOF ;
    public final void entryRuleVideoElement() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:104:1: ( ruleVideoElement EOF )
            // InternalVideoMontageSVJD.g:105:1: ruleVideoElement EOF
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
    // InternalVideoMontageSVJD.g:112:1: ruleVideoElement : ( ( rule__VideoElement__Group__0 ) ) ;
    public final void ruleVideoElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:116:2: ( ( ( rule__VideoElement__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:117:2: ( ( rule__VideoElement__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:117:2: ( ( rule__VideoElement__Group__0 ) )
            // InternalVideoMontageSVJD.g:118:3: ( rule__VideoElement__Group__0 )
            {
             before(grammarAccess.getVideoElementAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:119:3: ( rule__VideoElement__Group__0 )
            // InternalVideoMontageSVJD.g:119:4: rule__VideoElement__Group__0
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
    // InternalVideoMontageSVJD.g:128:1: entryRuleVideoTimeLine : ruleVideoTimeLine EOF ;
    public final void entryRuleVideoTimeLine() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:129:1: ( ruleVideoTimeLine EOF )
            // InternalVideoMontageSVJD.g:130:1: ruleVideoTimeLine EOF
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
    // InternalVideoMontageSVJD.g:137:1: ruleVideoTimeLine : ( ( rule__VideoTimeLine__Group__0 ) ) ;
    public final void ruleVideoTimeLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:141:2: ( ( ( rule__VideoTimeLine__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:142:2: ( ( rule__VideoTimeLine__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:142:2: ( ( rule__VideoTimeLine__Group__0 ) )
            // InternalVideoMontageSVJD.g:143:3: ( rule__VideoTimeLine__Group__0 )
            {
             before(grammarAccess.getVideoTimeLineAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:144:3: ( rule__VideoTimeLine__Group__0 )
            // InternalVideoMontageSVJD.g:144:4: rule__VideoTimeLine__Group__0
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
    // InternalVideoMontageSVJD.g:153:1: entryRuleTextArea : ruleTextArea EOF ;
    public final void entryRuleTextArea() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:154:1: ( ruleTextArea EOF )
            // InternalVideoMontageSVJD.g:155:1: ruleTextArea EOF
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
    // InternalVideoMontageSVJD.g:162:1: ruleTextArea : ( ( rule__TextArea__Alternatives ) ) ;
    public final void ruleTextArea() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:166:2: ( ( ( rule__TextArea__Alternatives ) ) )
            // InternalVideoMontageSVJD.g:167:2: ( ( rule__TextArea__Alternatives ) )
            {
            // InternalVideoMontageSVJD.g:167:2: ( ( rule__TextArea__Alternatives ) )
            // InternalVideoMontageSVJD.g:168:3: ( rule__TextArea__Alternatives )
            {
             before(grammarAccess.getTextAreaAccess().getAlternatives()); 
            // InternalVideoMontageSVJD.g:169:3: ( rule__TextArea__Alternatives )
            // InternalVideoMontageSVJD.g:169:4: rule__TextArea__Alternatives
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
    // InternalVideoMontageSVJD.g:178:1: entryRuleStartingMoment : ruleStartingMoment EOF ;
    public final void entryRuleStartingMoment() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:179:1: ( ruleStartingMoment EOF )
            // InternalVideoMontageSVJD.g:180:1: ruleStartingMoment EOF
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
    // InternalVideoMontageSVJD.g:187:1: ruleStartingMoment : ( ( rule__StartingMoment__Alternatives ) ) ;
    public final void ruleStartingMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:191:2: ( ( ( rule__StartingMoment__Alternatives ) ) )
            // InternalVideoMontageSVJD.g:192:2: ( ( rule__StartingMoment__Alternatives ) )
            {
            // InternalVideoMontageSVJD.g:192:2: ( ( rule__StartingMoment__Alternatives ) )
            // InternalVideoMontageSVJD.g:193:3: ( rule__StartingMoment__Alternatives )
            {
             before(grammarAccess.getStartingMomentAccess().getAlternatives()); 
            // InternalVideoMontageSVJD.g:194:3: ( rule__StartingMoment__Alternatives )
            // InternalVideoMontageSVJD.g:194:4: rule__StartingMoment__Alternatives
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
    // InternalVideoMontageSVJD.g:203:1: entryRuleAnimation : ruleAnimation EOF ;
    public final void entryRuleAnimation() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:204:1: ( ruleAnimation EOF )
            // InternalVideoMontageSVJD.g:205:1: ruleAnimation EOF
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
    // InternalVideoMontageSVJD.g:212:1: ruleAnimation : ( ( rule__Animation__Alternatives ) ) ;
    public final void ruleAnimation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:216:2: ( ( ( rule__Animation__Alternatives ) ) )
            // InternalVideoMontageSVJD.g:217:2: ( ( rule__Animation__Alternatives ) )
            {
            // InternalVideoMontageSVJD.g:217:2: ( ( rule__Animation__Alternatives ) )
            // InternalVideoMontageSVJD.g:218:3: ( rule__Animation__Alternatives )
            {
             before(grammarAccess.getAnimationAccess().getAlternatives()); 
            // InternalVideoMontageSVJD.g:219:3: ( rule__Animation__Alternatives )
            // InternalVideoMontageSVJD.g:219:4: rule__Animation__Alternatives
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
    // InternalVideoMontageSVJD.g:228:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:229:1: ( ruleEString EOF )
            // InternalVideoMontageSVJD.g:230:1: ruleEString EOF
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
    // InternalVideoMontageSVJD.g:237:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:241:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalVideoMontageSVJD.g:242:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalVideoMontageSVJD.g:242:2: ( ( rule__EString__Alternatives ) )
            // InternalVideoMontageSVJD.g:243:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalVideoMontageSVJD.g:244:3: ( rule__EString__Alternatives )
            // InternalVideoMontageSVJD.g:244:4: rule__EString__Alternatives
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
    // InternalVideoMontageSVJD.g:253:1: entryRuleSubtitle : ruleSubtitle EOF ;
    public final void entryRuleSubtitle() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:254:1: ( ruleSubtitle EOF )
            // InternalVideoMontageSVJD.g:255:1: ruleSubtitle EOF
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
    // InternalVideoMontageSVJD.g:262:1: ruleSubtitle : ( ( rule__Subtitle__Group__0 ) ) ;
    public final void ruleSubtitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:266:2: ( ( ( rule__Subtitle__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:267:2: ( ( rule__Subtitle__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:267:2: ( ( rule__Subtitle__Group__0 ) )
            // InternalVideoMontageSVJD.g:268:3: ( rule__Subtitle__Group__0 )
            {
             before(grammarAccess.getSubtitleAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:269:3: ( rule__Subtitle__Group__0 )
            // InternalVideoMontageSVJD.g:269:4: rule__Subtitle__Group__0
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
    // InternalVideoMontageSVJD.g:278:1: entryRuleAudio : ruleAudio EOF ;
    public final void entryRuleAudio() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:279:1: ( ruleAudio EOF )
            // InternalVideoMontageSVJD.g:280:1: ruleAudio EOF
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
    // InternalVideoMontageSVJD.g:287:1: ruleAudio : ( ( rule__Audio__Group__0 ) ) ;
    public final void ruleAudio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:291:2: ( ( ( rule__Audio__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:292:2: ( ( rule__Audio__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:292:2: ( ( rule__Audio__Group__0 ) )
            // InternalVideoMontageSVJD.g:293:3: ( rule__Audio__Group__0 )
            {
             before(grammarAccess.getAudioAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:294:3: ( rule__Audio__Group__0 )
            // InternalVideoMontageSVJD.g:294:4: rule__Audio__Group__0
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
    // InternalVideoMontageSVJD.g:303:1: entryRuleAudioClip : ruleAudioClip EOF ;
    public final void entryRuleAudioClip() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:304:1: ( ruleAudioClip EOF )
            // InternalVideoMontageSVJD.g:305:1: ruleAudioClip EOF
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
    // InternalVideoMontageSVJD.g:312:1: ruleAudioClip : ( ( rule__AudioClip__Group__0 ) ) ;
    public final void ruleAudioClip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:316:2: ( ( ( rule__AudioClip__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:317:2: ( ( rule__AudioClip__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:317:2: ( ( rule__AudioClip__Group__0 ) )
            // InternalVideoMontageSVJD.g:318:3: ( rule__AudioClip__Group__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:319:3: ( rule__AudioClip__Group__0 )
            // InternalVideoMontageSVJD.g:319:4: rule__AudioClip__Group__0
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
    // InternalVideoMontageSVJD.g:328:1: entryRuleClip : ruleClip EOF ;
    public final void entryRuleClip() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:329:1: ( ruleClip EOF )
            // InternalVideoMontageSVJD.g:330:1: ruleClip EOF
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
    // InternalVideoMontageSVJD.g:337:1: ruleClip : ( ( rule__Clip__Group__0 ) ) ;
    public final void ruleClip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:341:2: ( ( ( rule__Clip__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:342:2: ( ( rule__Clip__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:342:2: ( ( rule__Clip__Group__0 ) )
            // InternalVideoMontageSVJD.g:343:3: ( rule__Clip__Group__0 )
            {
             before(grammarAccess.getClipAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:344:3: ( rule__Clip__Group__0 )
            // InternalVideoMontageSVJD.g:344:4: rule__Clip__Group__0
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
    // InternalVideoMontageSVJD.g:353:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:354:1: ( ruleTitle EOF )
            // InternalVideoMontageSVJD.g:355:1: ruleTitle EOF
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
    // InternalVideoMontageSVJD.g:362:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:366:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:367:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:367:2: ( ( rule__Title__Group__0 ) )
            // InternalVideoMontageSVJD.g:368:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:369:3: ( rule__Title__Group__0 )
            // InternalVideoMontageSVJD.g:369:4: rule__Title__Group__0
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
    // InternalVideoMontageSVJD.g:378:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:379:1: ( ruleVideo EOF )
            // InternalVideoMontageSVJD.g:380:1: ruleVideo EOF
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
    // InternalVideoMontageSVJD.g:387:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:391:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:392:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:392:2: ( ( rule__Video__Group__0 ) )
            // InternalVideoMontageSVJD.g:393:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:394:3: ( rule__Video__Group__0 )
            // InternalVideoMontageSVJD.g:394:4: rule__Video__Group__0
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
    // InternalVideoMontageSVJD.g:403:1: entryRuleRelativeMoment : ruleRelativeMoment EOF ;
    public final void entryRuleRelativeMoment() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:404:1: ( ruleRelativeMoment EOF )
            // InternalVideoMontageSVJD.g:405:1: ruleRelativeMoment EOF
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
    // InternalVideoMontageSVJD.g:412:1: ruleRelativeMoment : ( ( rule__RelativeMoment__Group__0 ) ) ;
    public final void ruleRelativeMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:416:2: ( ( ( rule__RelativeMoment__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:417:2: ( ( rule__RelativeMoment__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:417:2: ( ( rule__RelativeMoment__Group__0 ) )
            // InternalVideoMontageSVJD.g:418:3: ( rule__RelativeMoment__Group__0 )
            {
             before(grammarAccess.getRelativeMomentAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:419:3: ( rule__RelativeMoment__Group__0 )
            // InternalVideoMontageSVJD.g:419:4: rule__RelativeMoment__Group__0
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
    // InternalVideoMontageSVJD.g:428:1: entryRuleAbsoluteMoment : ruleAbsoluteMoment EOF ;
    public final void entryRuleAbsoluteMoment() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:429:1: ( ruleAbsoluteMoment EOF )
            // InternalVideoMontageSVJD.g:430:1: ruleAbsoluteMoment EOF
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
    // InternalVideoMontageSVJD.g:437:1: ruleAbsoluteMoment : ( ( rule__AbsoluteMoment__Group__0 ) ) ;
    public final void ruleAbsoluteMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:441:2: ( ( ( rule__AbsoluteMoment__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:442:2: ( ( rule__AbsoluteMoment__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:442:2: ( ( rule__AbsoluteMoment__Group__0 ) )
            // InternalVideoMontageSVJD.g:443:3: ( rule__AbsoluteMoment__Group__0 )
            {
             before(grammarAccess.getAbsoluteMomentAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:444:3: ( rule__AbsoluteMoment__Group__0 )
            // InternalVideoMontageSVJD.g:444:4: rule__AbsoluteMoment__Group__0
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
    // InternalVideoMontageSVJD.g:453:1: entryRuleStartingMoment_Impl : ruleStartingMoment_Impl EOF ;
    public final void entryRuleStartingMoment_Impl() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:454:1: ( ruleStartingMoment_Impl EOF )
            // InternalVideoMontageSVJD.g:455:1: ruleStartingMoment_Impl EOF
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
    // InternalVideoMontageSVJD.g:462:1: ruleStartingMoment_Impl : ( ( rule__StartingMoment_Impl__Group__0 ) ) ;
    public final void ruleStartingMoment_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:466:2: ( ( ( rule__StartingMoment_Impl__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:467:2: ( ( rule__StartingMoment_Impl__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:467:2: ( ( rule__StartingMoment_Impl__Group__0 ) )
            // InternalVideoMontageSVJD.g:468:3: ( rule__StartingMoment_Impl__Group__0 )
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:469:3: ( rule__StartingMoment_Impl__Group__0 )
            // InternalVideoMontageSVJD.g:469:4: rule__StartingMoment_Impl__Group__0
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
    // InternalVideoMontageSVJD.g:478:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:479:1: ( ruleTransition EOF )
            // InternalVideoMontageSVJD.g:480:1: ruleTransition EOF
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
    // InternalVideoMontageSVJD.g:487:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:491:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:492:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:492:2: ( ( rule__Transition__Group__0 ) )
            // InternalVideoMontageSVJD.g:493:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:494:3: ( rule__Transition__Group__0 )
            // InternalVideoMontageSVJD.g:494:4: rule__Transition__Group__0
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
    // InternalVideoMontageSVJD.g:503:1: entryRuleTextArea_Impl : ruleTextArea_Impl EOF ;
    public final void entryRuleTextArea_Impl() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:504:1: ( ruleTextArea_Impl EOF )
            // InternalVideoMontageSVJD.g:505:1: ruleTextArea_Impl EOF
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
    // InternalVideoMontageSVJD.g:512:1: ruleTextArea_Impl : ( ( rule__TextArea_Impl__Group__0 ) ) ;
    public final void ruleTextArea_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:516:2: ( ( ( rule__TextArea_Impl__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:517:2: ( ( rule__TextArea_Impl__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:517:2: ( ( rule__TextArea_Impl__Group__0 ) )
            // InternalVideoMontageSVJD.g:518:3: ( rule__TextArea_Impl__Group__0 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:519:3: ( rule__TextArea_Impl__Group__0 )
            // InternalVideoMontageSVJD.g:519:4: rule__TextArea_Impl__Group__0
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
    // InternalVideoMontageSVJD.g:528:1: entryRuleTextAreaDynamic : ruleTextAreaDynamic EOF ;
    public final void entryRuleTextAreaDynamic() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:529:1: ( ruleTextAreaDynamic EOF )
            // InternalVideoMontageSVJD.g:530:1: ruleTextAreaDynamic EOF
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
    // InternalVideoMontageSVJD.g:537:1: ruleTextAreaDynamic : ( ( rule__TextAreaDynamic__Group__0 ) ) ;
    public final void ruleTextAreaDynamic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:541:2: ( ( ( rule__TextAreaDynamic__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:542:2: ( ( rule__TextAreaDynamic__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:542:2: ( ( rule__TextAreaDynamic__Group__0 ) )
            // InternalVideoMontageSVJD.g:543:3: ( rule__TextAreaDynamic__Group__0 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:544:3: ( rule__TextAreaDynamic__Group__0 )
            // InternalVideoMontageSVJD.g:544:4: rule__TextAreaDynamic__Group__0
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


    // $ANTLR start "entryRuleScrollingText"
    // InternalVideoMontageSVJD.g:553:1: entryRuleScrollingText : ruleScrollingText EOF ;
    public final void entryRuleScrollingText() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:554:1: ( ruleScrollingText EOF )
            // InternalVideoMontageSVJD.g:555:1: ruleScrollingText EOF
            {
             before(grammarAccess.getScrollingTextRule()); 
            pushFollow(FOLLOW_1);
            ruleScrollingText();

            state._fsp--;

             after(grammarAccess.getScrollingTextRule()); 
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
    // $ANTLR end "entryRuleScrollingText"


    // $ANTLR start "ruleScrollingText"
    // InternalVideoMontageSVJD.g:562:1: ruleScrollingText : ( ( rule__ScrollingText__Group__0 ) ) ;
    public final void ruleScrollingText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:566:2: ( ( ( rule__ScrollingText__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:567:2: ( ( rule__ScrollingText__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:567:2: ( ( rule__ScrollingText__Group__0 ) )
            // InternalVideoMontageSVJD.g:568:3: ( rule__ScrollingText__Group__0 )
            {
             before(grammarAccess.getScrollingTextAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:569:3: ( rule__ScrollingText__Group__0 )
            // InternalVideoMontageSVJD.g:569:4: rule__ScrollingText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScrollingTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScrollingText"


    // $ANTLR start "entryRuleFadeIn"
    // InternalVideoMontageSVJD.g:578:1: entryRuleFadeIn : ruleFadeIn EOF ;
    public final void entryRuleFadeIn() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:579:1: ( ruleFadeIn EOF )
            // InternalVideoMontageSVJD.g:580:1: ruleFadeIn EOF
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
    // InternalVideoMontageSVJD.g:587:1: ruleFadeIn : ( ( rule__FadeIn__Group__0 ) ) ;
    public final void ruleFadeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:591:2: ( ( ( rule__FadeIn__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:592:2: ( ( rule__FadeIn__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:592:2: ( ( rule__FadeIn__Group__0 ) )
            // InternalVideoMontageSVJD.g:593:3: ( rule__FadeIn__Group__0 )
            {
             before(grammarAccess.getFadeInAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:594:3: ( rule__FadeIn__Group__0 )
            // InternalVideoMontageSVJD.g:594:4: rule__FadeIn__Group__0
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
    // InternalVideoMontageSVJD.g:603:1: entryRuleFadeOut : ruleFadeOut EOF ;
    public final void entryRuleFadeOut() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:604:1: ( ruleFadeOut EOF )
            // InternalVideoMontageSVJD.g:605:1: ruleFadeOut EOF
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
    // InternalVideoMontageSVJD.g:612:1: ruleFadeOut : ( ( rule__FadeOut__Group__0 ) ) ;
    public final void ruleFadeOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:616:2: ( ( ( rule__FadeOut__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:617:2: ( ( rule__FadeOut__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:617:2: ( ( rule__FadeOut__Group__0 ) )
            // InternalVideoMontageSVJD.g:618:3: ( rule__FadeOut__Group__0 )
            {
             before(grammarAccess.getFadeOutAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:619:3: ( rule__FadeOut__Group__0 )
            // InternalVideoMontageSVJD.g:619:4: rule__FadeOut__Group__0
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
    // InternalVideoMontageSVJD.g:628:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:629:1: ( ruleEDouble EOF )
            // InternalVideoMontageSVJD.g:630:1: ruleEDouble EOF
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
    // InternalVideoMontageSVJD.g:637:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:641:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:642:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:642:2: ( ( rule__EDouble__Group__0 ) )
            // InternalVideoMontageSVJD.g:643:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:644:3: ( rule__EDouble__Group__0 )
            // InternalVideoMontageSVJD.g:644:4: rule__EDouble__Group__0
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
    // InternalVideoMontageSVJD.g:653:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalVideoMontageSVJD.g:654:1: ( ruleEInt EOF )
            // InternalVideoMontageSVJD.g:655:1: ruleEInt EOF
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
    // InternalVideoMontageSVJD.g:662:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:666:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalVideoMontageSVJD.g:667:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalVideoMontageSVJD.g:667:2: ( ( rule__EInt__Group__0 ) )
            // InternalVideoMontageSVJD.g:668:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalVideoMontageSVJD.g:669:3: ( rule__EInt__Group__0 )
            // InternalVideoMontageSVJD.g:669:4: rule__EInt__Group__0
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
    // InternalVideoMontageSVJD.g:678:1: ruleOperationMoment : ( ( rule__OperationMoment__Alternatives ) ) ;
    public final void ruleOperationMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:682:1: ( ( ( rule__OperationMoment__Alternatives ) ) )
            // InternalVideoMontageSVJD.g:683:2: ( ( rule__OperationMoment__Alternatives ) )
            {
            // InternalVideoMontageSVJD.g:683:2: ( ( rule__OperationMoment__Alternatives ) )
            // InternalVideoMontageSVJD.g:684:3: ( rule__OperationMoment__Alternatives )
            {
             before(grammarAccess.getOperationMomentAccess().getAlternatives()); 
            // InternalVideoMontageSVJD.g:685:3: ( rule__OperationMoment__Alternatives )
            // InternalVideoMontageSVJD.g:685:4: rule__OperationMoment__Alternatives
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
    // InternalVideoMontageSVJD.g:694:1: ruleMoment : ( ( rule__Moment__Alternatives ) ) ;
    public final void ruleMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:698:1: ( ( ( rule__Moment__Alternatives ) ) )
            // InternalVideoMontageSVJD.g:699:2: ( ( rule__Moment__Alternatives ) )
            {
            // InternalVideoMontageSVJD.g:699:2: ( ( rule__Moment__Alternatives ) )
            // InternalVideoMontageSVJD.g:700:3: ( rule__Moment__Alternatives )
            {
             before(grammarAccess.getMomentAccess().getAlternatives()); 
            // InternalVideoMontageSVJD.g:701:3: ( rule__Moment__Alternatives )
            // InternalVideoMontageSVJD.g:701:4: rule__Moment__Alternatives
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
    // InternalVideoMontageSVJD.g:710:1: ruleColor : ( ( 'BLACK' ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:714:1: ( ( ( 'BLACK' ) ) )
            // InternalVideoMontageSVJD.g:715:2: ( ( 'BLACK' ) )
            {
            // InternalVideoMontageSVJD.g:715:2: ( ( 'BLACK' ) )
            // InternalVideoMontageSVJD.g:716:3: ( 'BLACK' )
            {
             before(grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration()); 
            // InternalVideoMontageSVJD.g:717:3: ( 'BLACK' )
            // InternalVideoMontageSVJD.g:717:4: 'BLACK'
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
    // InternalVideoMontageSVJD.g:726:1: ruleFontStyle : ( ( 'COMIC_SANS_MS' ) ) ;
    public final void ruleFontStyle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:730:1: ( ( ( 'COMIC_SANS_MS' ) ) )
            // InternalVideoMontageSVJD.g:731:2: ( ( 'COMIC_SANS_MS' ) )
            {
            // InternalVideoMontageSVJD.g:731:2: ( ( 'COMIC_SANS_MS' ) )
            // InternalVideoMontageSVJD.g:732:3: ( 'COMIC_SANS_MS' )
            {
             before(grammarAccess.getFontStyleAccess().getCOMIC_SANS_MSEnumLiteralDeclaration()); 
            // InternalVideoMontageSVJD.g:733:3: ( 'COMIC_SANS_MS' )
            // InternalVideoMontageSVJD.g:733:4: 'COMIC_SANS_MS'
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
    // InternalVideoMontageSVJD.g:741:1: rule__AudioElement__Alternatives_1 : ( ( ruleAudio ) | ( ruleAudioClip ) );
    public final void rule__AudioElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:745:1: ( ( ruleAudio ) | ( ruleAudioClip ) )
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
                    // InternalVideoMontageSVJD.g:746:2: ( ruleAudio )
                    {
                    // InternalVideoMontageSVJD.g:746:2: ( ruleAudio )
                    // InternalVideoMontageSVJD.g:747:3: ruleAudio
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
                    // InternalVideoMontageSVJD.g:752:2: ( ruleAudioClip )
                    {
                    // InternalVideoMontageSVJD.g:752:2: ( ruleAudioClip )
                    // InternalVideoMontageSVJD.g:753:3: ruleAudioClip
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
    // InternalVideoMontageSVJD.g:762:1: rule__VideoElement__Alternatives_1 : ( ( ruleTitle ) | ( ruleClip ) | ( ruleVideo ) );
    public final void rule__VideoElement__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:766:1: ( ( ruleTitle ) | ( ruleClip ) | ( ruleVideo ) )
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
                    // InternalVideoMontageSVJD.g:767:2: ( ruleTitle )
                    {
                    // InternalVideoMontageSVJD.g:767:2: ( ruleTitle )
                    // InternalVideoMontageSVJD.g:768:3: ruleTitle
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
                    // InternalVideoMontageSVJD.g:773:2: ( ruleClip )
                    {
                    // InternalVideoMontageSVJD.g:773:2: ( ruleClip )
                    // InternalVideoMontageSVJD.g:774:3: ruleClip
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
                    // InternalVideoMontageSVJD.g:779:2: ( ruleVideo )
                    {
                    // InternalVideoMontageSVJD.g:779:2: ( ruleVideo )
                    // InternalVideoMontageSVJD.g:780:3: ruleVideo
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
    // InternalVideoMontageSVJD.g:789:1: rule__TextArea__Alternatives : ( ( ruleTextArea_Impl ) | ( ruleTextAreaDynamic ) );
    public final void rule__TextArea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:793:1: ( ( ruleTextArea_Impl ) | ( ruleTextAreaDynamic ) )
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
                    // InternalVideoMontageSVJD.g:794:2: ( ruleTextArea_Impl )
                    {
                    // InternalVideoMontageSVJD.g:794:2: ( ruleTextArea_Impl )
                    // InternalVideoMontageSVJD.g:795:3: ruleTextArea_Impl
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
                    // InternalVideoMontageSVJD.g:800:2: ( ruleTextAreaDynamic )
                    {
                    // InternalVideoMontageSVJD.g:800:2: ( ruleTextAreaDynamic )
                    // InternalVideoMontageSVJD.g:801:3: ruleTextAreaDynamic
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
    // InternalVideoMontageSVJD.g:810:1: rule__StartingMoment__Alternatives : ( ( ruleStartingMoment_Impl ) | ( ruleRelativeMoment ) | ( ruleAbsoluteMoment ) );
    public final void rule__StartingMoment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:814:1: ( ( ruleStartingMoment_Impl ) | ( ruleRelativeMoment ) | ( ruleAbsoluteMoment ) )
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
                    // InternalVideoMontageSVJD.g:815:2: ( ruleStartingMoment_Impl )
                    {
                    // InternalVideoMontageSVJD.g:815:2: ( ruleStartingMoment_Impl )
                    // InternalVideoMontageSVJD.g:816:3: ruleStartingMoment_Impl
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
                    // InternalVideoMontageSVJD.g:821:2: ( ruleRelativeMoment )
                    {
                    // InternalVideoMontageSVJD.g:821:2: ( ruleRelativeMoment )
                    // InternalVideoMontageSVJD.g:822:3: ruleRelativeMoment
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
                    // InternalVideoMontageSVJD.g:827:2: ( ruleAbsoluteMoment )
                    {
                    // InternalVideoMontageSVJD.g:827:2: ( ruleAbsoluteMoment )
                    // InternalVideoMontageSVJD.g:828:3: ruleAbsoluteMoment
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
    // InternalVideoMontageSVJD.g:837:1: rule__Animation__Alternatives : ( ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleScrollingText ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:841:1: ( ( ruleFadeIn ) | ( ruleFadeOut ) | ( ruleScrollingText ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt5=1;
                }
                break;
            case 60:
                {
                alt5=2;
                }
                break;
            case 57:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVideoMontageSVJD.g:842:2: ( ruleFadeIn )
                    {
                    // InternalVideoMontageSVJD.g:842:2: ( ruleFadeIn )
                    // InternalVideoMontageSVJD.g:843:3: ruleFadeIn
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
                    // InternalVideoMontageSVJD.g:848:2: ( ruleFadeOut )
                    {
                    // InternalVideoMontageSVJD.g:848:2: ( ruleFadeOut )
                    // InternalVideoMontageSVJD.g:849:3: ruleFadeOut
                    {
                     before(grammarAccess.getAnimationAccess().getFadeOutParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFadeOut();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getFadeOutParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoMontageSVJD.g:854:2: ( ruleScrollingText )
                    {
                    // InternalVideoMontageSVJD.g:854:2: ( ruleScrollingText )
                    // InternalVideoMontageSVJD.g:855:3: ruleScrollingText
                    {
                     before(grammarAccess.getAnimationAccess().getScrollingTextParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleScrollingText();

                    state._fsp--;

                     after(grammarAccess.getAnimationAccess().getScrollingTextParserRuleCall_2()); 

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
    // InternalVideoMontageSVJD.g:864:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:868:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalVideoMontageSVJD.g:869:2: ( RULE_STRING )
                    {
                    // InternalVideoMontageSVJD.g:869:2: ( RULE_STRING )
                    // InternalVideoMontageSVJD.g:870:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontageSVJD.g:875:2: ( RULE_ID )
                    {
                    // InternalVideoMontageSVJD.g:875:2: ( RULE_ID )
                    // InternalVideoMontageSVJD.g:876:3: RULE_ID
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
    // InternalVideoMontageSVJD.g:885:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:889:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalVideoMontageSVJD.g:890:2: ( 'E' )
                    {
                    // InternalVideoMontageSVJD.g:890:2: ( 'E' )
                    // InternalVideoMontageSVJD.g:891:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontageSVJD.g:896:2: ( 'e' )
                    {
                    // InternalVideoMontageSVJD.g:896:2: ( 'e' )
                    // InternalVideoMontageSVJD.g:897:3: 'e'
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
    // InternalVideoMontageSVJD.g:906:1: rule__OperationMoment__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__OperationMoment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:910:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    // InternalVideoMontageSVJD.g:911:2: ( ( '+' ) )
                    {
                    // InternalVideoMontageSVJD.g:911:2: ( ( '+' ) )
                    // InternalVideoMontageSVJD.g:912:3: ( '+' )
                    {
                     before(grammarAccess.getOperationMomentAccess().getAdditionEnumLiteralDeclaration_0()); 
                    // InternalVideoMontageSVJD.g:913:3: ( '+' )
                    // InternalVideoMontageSVJD.g:913:4: '+'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperationMomentAccess().getAdditionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontageSVJD.g:917:2: ( ( '-' ) )
                    {
                    // InternalVideoMontageSVJD.g:917:2: ( ( '-' ) )
                    // InternalVideoMontageSVJD.g:918:3: ( '-' )
                    {
                     before(grammarAccess.getOperationMomentAccess().getSoustractionEnumLiteralDeclaration_1()); 
                    // InternalVideoMontageSVJD.g:919:3: ( '-' )
                    // InternalVideoMontageSVJD.g:919:4: '-'
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
    // InternalVideoMontageSVJD.g:927:1: rule__Moment__Alternatives : ( ( ( 'starting' ) ) | ( ( 'ending' ) ) );
    public final void rule__Moment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:931:1: ( ( ( 'starting' ) ) | ( ( 'ending' ) ) )
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
                    // InternalVideoMontageSVJD.g:932:2: ( ( 'starting' ) )
                    {
                    // InternalVideoMontageSVJD.g:932:2: ( ( 'starting' ) )
                    // InternalVideoMontageSVJD.g:933:3: ( 'starting' )
                    {
                     before(grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0()); 
                    // InternalVideoMontageSVJD.g:934:3: ( 'starting' )
                    // InternalVideoMontageSVJD.g:934:4: 'starting'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontageSVJD.g:938:2: ( ( 'ending' ) )
                    {
                    // InternalVideoMontageSVJD.g:938:2: ( ( 'ending' ) )
                    // InternalVideoMontageSVJD.g:939:3: ( 'ending' )
                    {
                     before(grammarAccess.getMomentAccess().getEndingEnumLiteralDeclaration_1()); 
                    // InternalVideoMontageSVJD.g:940:3: ( 'ending' )
                    // InternalVideoMontageSVJD.g:940:4: 'ending'
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
    // InternalVideoMontageSVJD.g:948:1: rule__Movie__Group__0 : rule__Movie__Group__0__Impl rule__Movie__Group__1 ;
    public final void rule__Movie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:952:1: ( rule__Movie__Group__0__Impl rule__Movie__Group__1 )
            // InternalVideoMontageSVJD.g:953:2: rule__Movie__Group__0__Impl rule__Movie__Group__1
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
    // InternalVideoMontageSVJD.g:960:1: rule__Movie__Group__0__Impl : ( 'Movie' ) ;
    public final void rule__Movie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:964:1: ( ( 'Movie' ) )
            // InternalVideoMontageSVJD.g:965:1: ( 'Movie' )
            {
            // InternalVideoMontageSVJD.g:965:1: ( 'Movie' )
            // InternalVideoMontageSVJD.g:966:2: 'Movie'
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
    // InternalVideoMontageSVJD.g:975:1: rule__Movie__Group__1 : rule__Movie__Group__1__Impl rule__Movie__Group__2 ;
    public final void rule__Movie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:979:1: ( rule__Movie__Group__1__Impl rule__Movie__Group__2 )
            // InternalVideoMontageSVJD.g:980:2: rule__Movie__Group__1__Impl rule__Movie__Group__2
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
    // InternalVideoMontageSVJD.g:987:1: rule__Movie__Group__1__Impl : ( ( rule__Movie__TitleAssignment_1 ) ) ;
    public final void rule__Movie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:991:1: ( ( ( rule__Movie__TitleAssignment_1 ) ) )
            // InternalVideoMontageSVJD.g:992:1: ( ( rule__Movie__TitleAssignment_1 ) )
            {
            // InternalVideoMontageSVJD.g:992:1: ( ( rule__Movie__TitleAssignment_1 ) )
            // InternalVideoMontageSVJD.g:993:2: ( rule__Movie__TitleAssignment_1 )
            {
             before(grammarAccess.getMovieAccess().getTitleAssignment_1()); 
            // InternalVideoMontageSVJD.g:994:2: ( rule__Movie__TitleAssignment_1 )
            // InternalVideoMontageSVJD.g:994:3: rule__Movie__TitleAssignment_1
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
    // InternalVideoMontageSVJD.g:1002:1: rule__Movie__Group__2 : rule__Movie__Group__2__Impl rule__Movie__Group__3 ;
    public final void rule__Movie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1006:1: ( rule__Movie__Group__2__Impl rule__Movie__Group__3 )
            // InternalVideoMontageSVJD.g:1007:2: rule__Movie__Group__2__Impl rule__Movie__Group__3
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
    // InternalVideoMontageSVJD.g:1014:1: rule__Movie__Group__2__Impl : ( '{' ) ;
    public final void rule__Movie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1018:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:1019:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:1019:1: ( '{' )
            // InternalVideoMontageSVJD.g:1020:2: '{'
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
    // InternalVideoMontageSVJD.g:1029:1: rule__Movie__Group__3 : rule__Movie__Group__3__Impl rule__Movie__Group__4 ;
    public final void rule__Movie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1033:1: ( rule__Movie__Group__3__Impl rule__Movie__Group__4 )
            // InternalVideoMontageSVJD.g:1034:2: rule__Movie__Group__3__Impl rule__Movie__Group__4
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
    // InternalVideoMontageSVJD.g:1041:1: rule__Movie__Group__3__Impl : ( ( rule__Movie__VideoelementAssignment_3 ) ) ;
    public final void rule__Movie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1045:1: ( ( ( rule__Movie__VideoelementAssignment_3 ) ) )
            // InternalVideoMontageSVJD.g:1046:1: ( ( rule__Movie__VideoelementAssignment_3 ) )
            {
            // InternalVideoMontageSVJD.g:1046:1: ( ( rule__Movie__VideoelementAssignment_3 ) )
            // InternalVideoMontageSVJD.g:1047:2: ( rule__Movie__VideoelementAssignment_3 )
            {
             before(grammarAccess.getMovieAccess().getVideoelementAssignment_3()); 
            // InternalVideoMontageSVJD.g:1048:2: ( rule__Movie__VideoelementAssignment_3 )
            // InternalVideoMontageSVJD.g:1048:3: rule__Movie__VideoelementAssignment_3
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
    // InternalVideoMontageSVJD.g:1056:1: rule__Movie__Group__4 : rule__Movie__Group__4__Impl rule__Movie__Group__5 ;
    public final void rule__Movie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1060:1: ( rule__Movie__Group__4__Impl rule__Movie__Group__5 )
            // InternalVideoMontageSVJD.g:1061:2: rule__Movie__Group__4__Impl rule__Movie__Group__5
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
    // InternalVideoMontageSVJD.g:1068:1: rule__Movie__Group__4__Impl : ( ( rule__Movie__VideoelementAssignment_4 )* ) ;
    public final void rule__Movie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1072:1: ( ( ( rule__Movie__VideoelementAssignment_4 )* ) )
            // InternalVideoMontageSVJD.g:1073:1: ( ( rule__Movie__VideoelementAssignment_4 )* )
            {
            // InternalVideoMontageSVJD.g:1073:1: ( ( rule__Movie__VideoelementAssignment_4 )* )
            // InternalVideoMontageSVJD.g:1074:2: ( rule__Movie__VideoelementAssignment_4 )*
            {
             before(grammarAccess.getMovieAccess().getVideoelementAssignment_4()); 
            // InternalVideoMontageSVJD.g:1075:2: ( rule__Movie__VideoelementAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVideoMontageSVJD.g:1075:3: rule__Movie__VideoelementAssignment_4
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
    // InternalVideoMontageSVJD.g:1083:1: rule__Movie__Group__5 : rule__Movie__Group__5__Impl rule__Movie__Group__6 ;
    public final void rule__Movie__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1087:1: ( rule__Movie__Group__5__Impl rule__Movie__Group__6 )
            // InternalVideoMontageSVJD.g:1088:2: rule__Movie__Group__5__Impl rule__Movie__Group__6
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
    // InternalVideoMontageSVJD.g:1095:1: rule__Movie__Group__5__Impl : ( ( rule__Movie__Group_5__0 )? ) ;
    public final void rule__Movie__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1099:1: ( ( ( rule__Movie__Group_5__0 )? ) )
            // InternalVideoMontageSVJD.g:1100:1: ( ( rule__Movie__Group_5__0 )? )
            {
            // InternalVideoMontageSVJD.g:1100:1: ( ( rule__Movie__Group_5__0 )? )
            // InternalVideoMontageSVJD.g:1101:2: ( rule__Movie__Group_5__0 )?
            {
             before(grammarAccess.getMovieAccess().getGroup_5()); 
            // InternalVideoMontageSVJD.g:1102:2: ( rule__Movie__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1102:3: rule__Movie__Group_5__0
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
    // InternalVideoMontageSVJD.g:1110:1: rule__Movie__Group__6 : rule__Movie__Group__6__Impl rule__Movie__Group__7 ;
    public final void rule__Movie__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1114:1: ( rule__Movie__Group__6__Impl rule__Movie__Group__7 )
            // InternalVideoMontageSVJD.g:1115:2: rule__Movie__Group__6__Impl rule__Movie__Group__7
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
    // InternalVideoMontageSVJD.g:1122:1: rule__Movie__Group__6__Impl : ( ( rule__Movie__Group_6__0 )? ) ;
    public final void rule__Movie__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1126:1: ( ( ( rule__Movie__Group_6__0 )? ) )
            // InternalVideoMontageSVJD.g:1127:1: ( ( rule__Movie__Group_6__0 )? )
            {
            // InternalVideoMontageSVJD.g:1127:1: ( ( rule__Movie__Group_6__0 )? )
            // InternalVideoMontageSVJD.g:1128:2: ( rule__Movie__Group_6__0 )?
            {
             before(grammarAccess.getMovieAccess().getGroup_6()); 
            // InternalVideoMontageSVJD.g:1129:2: ( rule__Movie__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1129:3: rule__Movie__Group_6__0
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
    // InternalVideoMontageSVJD.g:1137:1: rule__Movie__Group__7 : rule__Movie__Group__7__Impl rule__Movie__Group__8 ;
    public final void rule__Movie__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1141:1: ( rule__Movie__Group__7__Impl rule__Movie__Group__8 )
            // InternalVideoMontageSVJD.g:1142:2: rule__Movie__Group__7__Impl rule__Movie__Group__8
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
    // InternalVideoMontageSVJD.g:1149:1: rule__Movie__Group__7__Impl : ( ( rule__Movie__VideoTimelineAssignment_7 ) ) ;
    public final void rule__Movie__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1153:1: ( ( ( rule__Movie__VideoTimelineAssignment_7 ) ) )
            // InternalVideoMontageSVJD.g:1154:1: ( ( rule__Movie__VideoTimelineAssignment_7 ) )
            {
            // InternalVideoMontageSVJD.g:1154:1: ( ( rule__Movie__VideoTimelineAssignment_7 ) )
            // InternalVideoMontageSVJD.g:1155:2: ( rule__Movie__VideoTimelineAssignment_7 )
            {
             before(grammarAccess.getMovieAccess().getVideoTimelineAssignment_7()); 
            // InternalVideoMontageSVJD.g:1156:2: ( rule__Movie__VideoTimelineAssignment_7 )
            // InternalVideoMontageSVJD.g:1156:3: rule__Movie__VideoTimelineAssignment_7
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
    // InternalVideoMontageSVJD.g:1164:1: rule__Movie__Group__8 : rule__Movie__Group__8__Impl ;
    public final void rule__Movie__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1168:1: ( rule__Movie__Group__8__Impl )
            // InternalVideoMontageSVJD.g:1169:2: rule__Movie__Group__8__Impl
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
    // InternalVideoMontageSVJD.g:1175:1: rule__Movie__Group__8__Impl : ( '}' ) ;
    public final void rule__Movie__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1179:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:1180:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:1180:1: ( '}' )
            // InternalVideoMontageSVJD.g:1181:2: '}'
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
    // InternalVideoMontageSVJD.g:1191:1: rule__Movie__Group_5__0 : rule__Movie__Group_5__0__Impl rule__Movie__Group_5__1 ;
    public final void rule__Movie__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1195:1: ( rule__Movie__Group_5__0__Impl rule__Movie__Group_5__1 )
            // InternalVideoMontageSVJD.g:1196:2: rule__Movie__Group_5__0__Impl rule__Movie__Group_5__1
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
    // InternalVideoMontageSVJD.g:1203:1: rule__Movie__Group_5__0__Impl : ( ( rule__Movie__AudioelementAssignment_5_0 ) ) ;
    public final void rule__Movie__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1207:1: ( ( ( rule__Movie__AudioelementAssignment_5_0 ) ) )
            // InternalVideoMontageSVJD.g:1208:1: ( ( rule__Movie__AudioelementAssignment_5_0 ) )
            {
            // InternalVideoMontageSVJD.g:1208:1: ( ( rule__Movie__AudioelementAssignment_5_0 ) )
            // InternalVideoMontageSVJD.g:1209:2: ( rule__Movie__AudioelementAssignment_5_0 )
            {
             before(grammarAccess.getMovieAccess().getAudioelementAssignment_5_0()); 
            // InternalVideoMontageSVJD.g:1210:2: ( rule__Movie__AudioelementAssignment_5_0 )
            // InternalVideoMontageSVJD.g:1210:3: rule__Movie__AudioelementAssignment_5_0
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
    // InternalVideoMontageSVJD.g:1218:1: rule__Movie__Group_5__1 : rule__Movie__Group_5__1__Impl ;
    public final void rule__Movie__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1222:1: ( rule__Movie__Group_5__1__Impl )
            // InternalVideoMontageSVJD.g:1223:2: rule__Movie__Group_5__1__Impl
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
    // InternalVideoMontageSVJD.g:1229:1: rule__Movie__Group_5__1__Impl : ( ( rule__Movie__AudioelementAssignment_5_1 )* ) ;
    public final void rule__Movie__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1233:1: ( ( ( rule__Movie__AudioelementAssignment_5_1 )* ) )
            // InternalVideoMontageSVJD.g:1234:1: ( ( rule__Movie__AudioelementAssignment_5_1 )* )
            {
            // InternalVideoMontageSVJD.g:1234:1: ( ( rule__Movie__AudioelementAssignment_5_1 )* )
            // InternalVideoMontageSVJD.g:1235:2: ( rule__Movie__AudioelementAssignment_5_1 )*
            {
             before(grammarAccess.getMovieAccess().getAudioelementAssignment_5_1()); 
            // InternalVideoMontageSVJD.g:1236:2: ( rule__Movie__AudioelementAssignment_5_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVideoMontageSVJD.g:1236:3: rule__Movie__AudioelementAssignment_5_1
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
    // InternalVideoMontageSVJD.g:1245:1: rule__Movie__Group_6__0 : rule__Movie__Group_6__0__Impl rule__Movie__Group_6__1 ;
    public final void rule__Movie__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1249:1: ( rule__Movie__Group_6__0__Impl rule__Movie__Group_6__1 )
            // InternalVideoMontageSVJD.g:1250:2: rule__Movie__Group_6__0__Impl rule__Movie__Group_6__1
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
    // InternalVideoMontageSVJD.g:1257:1: rule__Movie__Group_6__0__Impl : ( ( rule__Movie__SubtitleAssignment_6_0 ) ) ;
    public final void rule__Movie__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1261:1: ( ( ( rule__Movie__SubtitleAssignment_6_0 ) ) )
            // InternalVideoMontageSVJD.g:1262:1: ( ( rule__Movie__SubtitleAssignment_6_0 ) )
            {
            // InternalVideoMontageSVJD.g:1262:1: ( ( rule__Movie__SubtitleAssignment_6_0 ) )
            // InternalVideoMontageSVJD.g:1263:2: ( rule__Movie__SubtitleAssignment_6_0 )
            {
             before(grammarAccess.getMovieAccess().getSubtitleAssignment_6_0()); 
            // InternalVideoMontageSVJD.g:1264:2: ( rule__Movie__SubtitleAssignment_6_0 )
            // InternalVideoMontageSVJD.g:1264:3: rule__Movie__SubtitleAssignment_6_0
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
    // InternalVideoMontageSVJD.g:1272:1: rule__Movie__Group_6__1 : rule__Movie__Group_6__1__Impl ;
    public final void rule__Movie__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1276:1: ( rule__Movie__Group_6__1__Impl )
            // InternalVideoMontageSVJD.g:1277:2: rule__Movie__Group_6__1__Impl
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
    // InternalVideoMontageSVJD.g:1283:1: rule__Movie__Group_6__1__Impl : ( ( rule__Movie__SubtitleAssignment_6_1 )* ) ;
    public final void rule__Movie__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1287:1: ( ( ( rule__Movie__SubtitleAssignment_6_1 )* ) )
            // InternalVideoMontageSVJD.g:1288:1: ( ( rule__Movie__SubtitleAssignment_6_1 )* )
            {
            // InternalVideoMontageSVJD.g:1288:1: ( ( rule__Movie__SubtitleAssignment_6_1 )* )
            // InternalVideoMontageSVJD.g:1289:2: ( rule__Movie__SubtitleAssignment_6_1 )*
            {
             before(grammarAccess.getMovieAccess().getSubtitleAssignment_6_1()); 
            // InternalVideoMontageSVJD.g:1290:2: ( rule__Movie__SubtitleAssignment_6_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVideoMontageSVJD.g:1290:3: rule__Movie__SubtitleAssignment_6_1
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
    // InternalVideoMontageSVJD.g:1299:1: rule__AudioElement__Group__0 : rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 ;
    public final void rule__AudioElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1303:1: ( rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1 )
            // InternalVideoMontageSVJD.g:1304:2: rule__AudioElement__Group__0__Impl rule__AudioElement__Group__1
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
    // InternalVideoMontageSVJD.g:1311:1: rule__AudioElement__Group__0__Impl : ( 'audioElement' ) ;
    public final void rule__AudioElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1315:1: ( ( 'audioElement' ) )
            // InternalVideoMontageSVJD.g:1316:1: ( 'audioElement' )
            {
            // InternalVideoMontageSVJD.g:1316:1: ( 'audioElement' )
            // InternalVideoMontageSVJD.g:1317:2: 'audioElement'
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
    // InternalVideoMontageSVJD.g:1326:1: rule__AudioElement__Group__1 : rule__AudioElement__Group__1__Impl ;
    public final void rule__AudioElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1330:1: ( rule__AudioElement__Group__1__Impl )
            // InternalVideoMontageSVJD.g:1331:2: rule__AudioElement__Group__1__Impl
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
    // InternalVideoMontageSVJD.g:1337:1: rule__AudioElement__Group__1__Impl : ( ( rule__AudioElement__Alternatives_1 ) ) ;
    public final void rule__AudioElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1341:1: ( ( ( rule__AudioElement__Alternatives_1 ) ) )
            // InternalVideoMontageSVJD.g:1342:1: ( ( rule__AudioElement__Alternatives_1 ) )
            {
            // InternalVideoMontageSVJD.g:1342:1: ( ( rule__AudioElement__Alternatives_1 ) )
            // InternalVideoMontageSVJD.g:1343:2: ( rule__AudioElement__Alternatives_1 )
            {
             before(grammarAccess.getAudioElementAccess().getAlternatives_1()); 
            // InternalVideoMontageSVJD.g:1344:2: ( rule__AudioElement__Alternatives_1 )
            // InternalVideoMontageSVJD.g:1344:3: rule__AudioElement__Alternatives_1
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
    // InternalVideoMontageSVJD.g:1353:1: rule__VideoElement__Group__0 : rule__VideoElement__Group__0__Impl rule__VideoElement__Group__1 ;
    public final void rule__VideoElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1357:1: ( rule__VideoElement__Group__0__Impl rule__VideoElement__Group__1 )
            // InternalVideoMontageSVJD.g:1358:2: rule__VideoElement__Group__0__Impl rule__VideoElement__Group__1
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
    // InternalVideoMontageSVJD.g:1365:1: rule__VideoElement__Group__0__Impl : ( 'videoElement' ) ;
    public final void rule__VideoElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1369:1: ( ( 'videoElement' ) )
            // InternalVideoMontageSVJD.g:1370:1: ( 'videoElement' )
            {
            // InternalVideoMontageSVJD.g:1370:1: ( 'videoElement' )
            // InternalVideoMontageSVJD.g:1371:2: 'videoElement'
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
    // InternalVideoMontageSVJD.g:1380:1: rule__VideoElement__Group__1 : rule__VideoElement__Group__1__Impl ;
    public final void rule__VideoElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1384:1: ( rule__VideoElement__Group__1__Impl )
            // InternalVideoMontageSVJD.g:1385:2: rule__VideoElement__Group__1__Impl
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
    // InternalVideoMontageSVJD.g:1391:1: rule__VideoElement__Group__1__Impl : ( ( rule__VideoElement__Alternatives_1 ) ) ;
    public final void rule__VideoElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1395:1: ( ( ( rule__VideoElement__Alternatives_1 ) ) )
            // InternalVideoMontageSVJD.g:1396:1: ( ( rule__VideoElement__Alternatives_1 ) )
            {
            // InternalVideoMontageSVJD.g:1396:1: ( ( rule__VideoElement__Alternatives_1 ) )
            // InternalVideoMontageSVJD.g:1397:2: ( rule__VideoElement__Alternatives_1 )
            {
             before(grammarAccess.getVideoElementAccess().getAlternatives_1()); 
            // InternalVideoMontageSVJD.g:1398:2: ( rule__VideoElement__Alternatives_1 )
            // InternalVideoMontageSVJD.g:1398:3: rule__VideoElement__Alternatives_1
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
    // InternalVideoMontageSVJD.g:1407:1: rule__VideoTimeLine__Group__0 : rule__VideoTimeLine__Group__0__Impl rule__VideoTimeLine__Group__1 ;
    public final void rule__VideoTimeLine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1411:1: ( rule__VideoTimeLine__Group__0__Impl rule__VideoTimeLine__Group__1 )
            // InternalVideoMontageSVJD.g:1412:2: rule__VideoTimeLine__Group__0__Impl rule__VideoTimeLine__Group__1
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
    // InternalVideoMontageSVJD.g:1419:1: rule__VideoTimeLine__Group__0__Impl : ( 'timeline' ) ;
    public final void rule__VideoTimeLine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1423:1: ( ( 'timeline' ) )
            // InternalVideoMontageSVJD.g:1424:1: ( 'timeline' )
            {
            // InternalVideoMontageSVJD.g:1424:1: ( 'timeline' )
            // InternalVideoMontageSVJD.g:1425:2: 'timeline'
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
    // InternalVideoMontageSVJD.g:1434:1: rule__VideoTimeLine__Group__1 : rule__VideoTimeLine__Group__1__Impl rule__VideoTimeLine__Group__2 ;
    public final void rule__VideoTimeLine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1438:1: ( rule__VideoTimeLine__Group__1__Impl rule__VideoTimeLine__Group__2 )
            // InternalVideoMontageSVJD.g:1439:2: rule__VideoTimeLine__Group__1__Impl rule__VideoTimeLine__Group__2
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
    // InternalVideoMontageSVJD.g:1446:1: rule__VideoTimeLine__Group__1__Impl : ( ( rule__VideoTimeLine__VideosAssignment_1 ) ) ;
    public final void rule__VideoTimeLine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1450:1: ( ( ( rule__VideoTimeLine__VideosAssignment_1 ) ) )
            // InternalVideoMontageSVJD.g:1451:1: ( ( rule__VideoTimeLine__VideosAssignment_1 ) )
            {
            // InternalVideoMontageSVJD.g:1451:1: ( ( rule__VideoTimeLine__VideosAssignment_1 ) )
            // InternalVideoMontageSVJD.g:1452:2: ( rule__VideoTimeLine__VideosAssignment_1 )
            {
             before(grammarAccess.getVideoTimeLineAccess().getVideosAssignment_1()); 
            // InternalVideoMontageSVJD.g:1453:2: ( rule__VideoTimeLine__VideosAssignment_1 )
            // InternalVideoMontageSVJD.g:1453:3: rule__VideoTimeLine__VideosAssignment_1
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
    // InternalVideoMontageSVJD.g:1461:1: rule__VideoTimeLine__Group__2 : rule__VideoTimeLine__Group__2__Impl ;
    public final void rule__VideoTimeLine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1465:1: ( rule__VideoTimeLine__Group__2__Impl )
            // InternalVideoMontageSVJD.g:1466:2: rule__VideoTimeLine__Group__2__Impl
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
    // InternalVideoMontageSVJD.g:1472:1: rule__VideoTimeLine__Group__2__Impl : ( ( rule__VideoTimeLine__VideosAssignment_2 )* ) ;
    public final void rule__VideoTimeLine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1476:1: ( ( ( rule__VideoTimeLine__VideosAssignment_2 )* ) )
            // InternalVideoMontageSVJD.g:1477:1: ( ( rule__VideoTimeLine__VideosAssignment_2 )* )
            {
            // InternalVideoMontageSVJD.g:1477:1: ( ( rule__VideoTimeLine__VideosAssignment_2 )* )
            // InternalVideoMontageSVJD.g:1478:2: ( rule__VideoTimeLine__VideosAssignment_2 )*
            {
             before(grammarAccess.getVideoTimeLineAccess().getVideosAssignment_2()); 
            // InternalVideoMontageSVJD.g:1479:2: ( rule__VideoTimeLine__VideosAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVideoMontageSVJD.g:1479:3: rule__VideoTimeLine__VideosAssignment_2
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
    // InternalVideoMontageSVJD.g:1488:1: rule__Subtitle__Group__0 : rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1 ;
    public final void rule__Subtitle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1492:1: ( rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1 )
            // InternalVideoMontageSVJD.g:1493:2: rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1
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
    // InternalVideoMontageSVJD.g:1500:1: rule__Subtitle__Group__0__Impl : ( 'Subtitle' ) ;
    public final void rule__Subtitle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1504:1: ( ( 'Subtitle' ) )
            // InternalVideoMontageSVJD.g:1505:1: ( 'Subtitle' )
            {
            // InternalVideoMontageSVJD.g:1505:1: ( 'Subtitle' )
            // InternalVideoMontageSVJD.g:1506:2: 'Subtitle'
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
    // InternalVideoMontageSVJD.g:1515:1: rule__Subtitle__Group__1 : rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2 ;
    public final void rule__Subtitle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1519:1: ( rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2 )
            // InternalVideoMontageSVJD.g:1520:2: rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2
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
    // InternalVideoMontageSVJD.g:1527:1: rule__Subtitle__Group__1__Impl : ( ( rule__Subtitle__NameAssignment_1 ) ) ;
    public final void rule__Subtitle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1531:1: ( ( ( rule__Subtitle__NameAssignment_1 ) ) )
            // InternalVideoMontageSVJD.g:1532:1: ( ( rule__Subtitle__NameAssignment_1 ) )
            {
            // InternalVideoMontageSVJD.g:1532:1: ( ( rule__Subtitle__NameAssignment_1 ) )
            // InternalVideoMontageSVJD.g:1533:2: ( rule__Subtitle__NameAssignment_1 )
            {
             before(grammarAccess.getSubtitleAccess().getNameAssignment_1()); 
            // InternalVideoMontageSVJD.g:1534:2: ( rule__Subtitle__NameAssignment_1 )
            // InternalVideoMontageSVJD.g:1534:3: rule__Subtitle__NameAssignment_1
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
    // InternalVideoMontageSVJD.g:1542:1: rule__Subtitle__Group__2 : rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3 ;
    public final void rule__Subtitle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1546:1: ( rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3 )
            // InternalVideoMontageSVJD.g:1547:2: rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3
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
    // InternalVideoMontageSVJD.g:1554:1: rule__Subtitle__Group__2__Impl : ( 'start' ) ;
    public final void rule__Subtitle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1558:1: ( ( 'start' ) )
            // InternalVideoMontageSVJD.g:1559:1: ( 'start' )
            {
            // InternalVideoMontageSVJD.g:1559:1: ( 'start' )
            // InternalVideoMontageSVJD.g:1560:2: 'start'
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
    // InternalVideoMontageSVJD.g:1569:1: rule__Subtitle__Group__3 : rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4 ;
    public final void rule__Subtitle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1573:1: ( rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4 )
            // InternalVideoMontageSVJD.g:1574:2: rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4
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
    // InternalVideoMontageSVJD.g:1581:1: rule__Subtitle__Group__3__Impl : ( ':' ) ;
    public final void rule__Subtitle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1585:1: ( ( ':' ) )
            // InternalVideoMontageSVJD.g:1586:1: ( ':' )
            {
            // InternalVideoMontageSVJD.g:1586:1: ( ':' )
            // InternalVideoMontageSVJD.g:1587:2: ':'
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
    // InternalVideoMontageSVJD.g:1596:1: rule__Subtitle__Group__4 : rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5 ;
    public final void rule__Subtitle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1600:1: ( rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5 )
            // InternalVideoMontageSVJD.g:1601:2: rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5
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
    // InternalVideoMontageSVJD.g:1608:1: rule__Subtitle__Group__4__Impl : ( ( rule__Subtitle__StartingmomentAssignment_4 ) ) ;
    public final void rule__Subtitle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1612:1: ( ( ( rule__Subtitle__StartingmomentAssignment_4 ) ) )
            // InternalVideoMontageSVJD.g:1613:1: ( ( rule__Subtitle__StartingmomentAssignment_4 ) )
            {
            // InternalVideoMontageSVJD.g:1613:1: ( ( rule__Subtitle__StartingmomentAssignment_4 ) )
            // InternalVideoMontageSVJD.g:1614:2: ( rule__Subtitle__StartingmomentAssignment_4 )
            {
             before(grammarAccess.getSubtitleAccess().getStartingmomentAssignment_4()); 
            // InternalVideoMontageSVJD.g:1615:2: ( rule__Subtitle__StartingmomentAssignment_4 )
            // InternalVideoMontageSVJD.g:1615:3: rule__Subtitle__StartingmomentAssignment_4
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
    // InternalVideoMontageSVJD.g:1623:1: rule__Subtitle__Group__5 : rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6 ;
    public final void rule__Subtitle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1627:1: ( rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6 )
            // InternalVideoMontageSVJD.g:1628:2: rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6
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
    // InternalVideoMontageSVJD.g:1635:1: rule__Subtitle__Group__5__Impl : ( '{' ) ;
    public final void rule__Subtitle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1639:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:1640:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:1640:1: ( '{' )
            // InternalVideoMontageSVJD.g:1641:2: '{'
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
    // InternalVideoMontageSVJD.g:1650:1: rule__Subtitle__Group__6 : rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7 ;
    public final void rule__Subtitle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1654:1: ( rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7 )
            // InternalVideoMontageSVJD.g:1655:2: rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7
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
    // InternalVideoMontageSVJD.g:1662:1: rule__Subtitle__Group__6__Impl : ( ( rule__Subtitle__Group_6__0 )? ) ;
    public final void rule__Subtitle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1666:1: ( ( ( rule__Subtitle__Group_6__0 )? ) )
            // InternalVideoMontageSVJD.g:1667:1: ( ( rule__Subtitle__Group_6__0 )? )
            {
            // InternalVideoMontageSVJD.g:1667:1: ( ( rule__Subtitle__Group_6__0 )? )
            // InternalVideoMontageSVJD.g:1668:2: ( rule__Subtitle__Group_6__0 )?
            {
             before(grammarAccess.getSubtitleAccess().getGroup_6()); 
            // InternalVideoMontageSVJD.g:1669:2: ( rule__Subtitle__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1669:3: rule__Subtitle__Group_6__0
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
    // InternalVideoMontageSVJD.g:1677:1: rule__Subtitle__Group__7 : rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8 ;
    public final void rule__Subtitle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1681:1: ( rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8 )
            // InternalVideoMontageSVJD.g:1682:2: rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8
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
    // InternalVideoMontageSVJD.g:1689:1: rule__Subtitle__Group__7__Impl : ( 'textArea' ) ;
    public final void rule__Subtitle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1693:1: ( ( 'textArea' ) )
            // InternalVideoMontageSVJD.g:1694:1: ( 'textArea' )
            {
            // InternalVideoMontageSVJD.g:1694:1: ( 'textArea' )
            // InternalVideoMontageSVJD.g:1695:2: 'textArea'
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
    // InternalVideoMontageSVJD.g:1704:1: rule__Subtitle__Group__8 : rule__Subtitle__Group__8__Impl rule__Subtitle__Group__9 ;
    public final void rule__Subtitle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1708:1: ( rule__Subtitle__Group__8__Impl rule__Subtitle__Group__9 )
            // InternalVideoMontageSVJD.g:1709:2: rule__Subtitle__Group__8__Impl rule__Subtitle__Group__9
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
    // InternalVideoMontageSVJD.g:1716:1: rule__Subtitle__Group__8__Impl : ( ( rule__Subtitle__TextareaAssignment_8 ) ) ;
    public final void rule__Subtitle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1720:1: ( ( ( rule__Subtitle__TextareaAssignment_8 ) ) )
            // InternalVideoMontageSVJD.g:1721:1: ( ( rule__Subtitle__TextareaAssignment_8 ) )
            {
            // InternalVideoMontageSVJD.g:1721:1: ( ( rule__Subtitle__TextareaAssignment_8 ) )
            // InternalVideoMontageSVJD.g:1722:2: ( rule__Subtitle__TextareaAssignment_8 )
            {
             before(grammarAccess.getSubtitleAccess().getTextareaAssignment_8()); 
            // InternalVideoMontageSVJD.g:1723:2: ( rule__Subtitle__TextareaAssignment_8 )
            // InternalVideoMontageSVJD.g:1723:3: rule__Subtitle__TextareaAssignment_8
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
    // InternalVideoMontageSVJD.g:1731:1: rule__Subtitle__Group__9 : rule__Subtitle__Group__9__Impl ;
    public final void rule__Subtitle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1735:1: ( rule__Subtitle__Group__9__Impl )
            // InternalVideoMontageSVJD.g:1736:2: rule__Subtitle__Group__9__Impl
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
    // InternalVideoMontageSVJD.g:1742:1: rule__Subtitle__Group__9__Impl : ( '}' ) ;
    public final void rule__Subtitle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1746:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:1747:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:1747:1: ( '}' )
            // InternalVideoMontageSVJD.g:1748:2: '}'
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
    // InternalVideoMontageSVJD.g:1758:1: rule__Subtitle__Group_6__0 : rule__Subtitle__Group_6__0__Impl rule__Subtitle__Group_6__1 ;
    public final void rule__Subtitle__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1762:1: ( rule__Subtitle__Group_6__0__Impl rule__Subtitle__Group_6__1 )
            // InternalVideoMontageSVJD.g:1763:2: rule__Subtitle__Group_6__0__Impl rule__Subtitle__Group_6__1
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
    // InternalVideoMontageSVJD.g:1770:1: rule__Subtitle__Group_6__0__Impl : ( 'duration' ) ;
    public final void rule__Subtitle__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1774:1: ( ( 'duration' ) )
            // InternalVideoMontageSVJD.g:1775:1: ( 'duration' )
            {
            // InternalVideoMontageSVJD.g:1775:1: ( 'duration' )
            // InternalVideoMontageSVJD.g:1776:2: 'duration'
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
    // InternalVideoMontageSVJD.g:1785:1: rule__Subtitle__Group_6__1 : rule__Subtitle__Group_6__1__Impl ;
    public final void rule__Subtitle__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1789:1: ( rule__Subtitle__Group_6__1__Impl )
            // InternalVideoMontageSVJD.g:1790:2: rule__Subtitle__Group_6__1__Impl
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
    // InternalVideoMontageSVJD.g:1796:1: rule__Subtitle__Group_6__1__Impl : ( ( rule__Subtitle__DurationAssignment_6_1 ) ) ;
    public final void rule__Subtitle__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1800:1: ( ( ( rule__Subtitle__DurationAssignment_6_1 ) ) )
            // InternalVideoMontageSVJD.g:1801:1: ( ( rule__Subtitle__DurationAssignment_6_1 ) )
            {
            // InternalVideoMontageSVJD.g:1801:1: ( ( rule__Subtitle__DurationAssignment_6_1 ) )
            // InternalVideoMontageSVJD.g:1802:2: ( rule__Subtitle__DurationAssignment_6_1 )
            {
             before(grammarAccess.getSubtitleAccess().getDurationAssignment_6_1()); 
            // InternalVideoMontageSVJD.g:1803:2: ( rule__Subtitle__DurationAssignment_6_1 )
            // InternalVideoMontageSVJD.g:1803:3: rule__Subtitle__DurationAssignment_6_1
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
    // InternalVideoMontageSVJD.g:1812:1: rule__Audio__Group__0 : rule__Audio__Group__0__Impl rule__Audio__Group__1 ;
    public final void rule__Audio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1816:1: ( rule__Audio__Group__0__Impl rule__Audio__Group__1 )
            // InternalVideoMontageSVJD.g:1817:2: rule__Audio__Group__0__Impl rule__Audio__Group__1
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
    // InternalVideoMontageSVJD.g:1824:1: rule__Audio__Group__0__Impl : ( 'Audio' ) ;
    public final void rule__Audio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1828:1: ( ( 'Audio' ) )
            // InternalVideoMontageSVJD.g:1829:1: ( 'Audio' )
            {
            // InternalVideoMontageSVJD.g:1829:1: ( 'Audio' )
            // InternalVideoMontageSVJD.g:1830:2: 'Audio'
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
    // InternalVideoMontageSVJD.g:1839:1: rule__Audio__Group__1 : rule__Audio__Group__1__Impl rule__Audio__Group__2 ;
    public final void rule__Audio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1843:1: ( rule__Audio__Group__1__Impl rule__Audio__Group__2 )
            // InternalVideoMontageSVJD.g:1844:2: rule__Audio__Group__1__Impl rule__Audio__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalVideoMontageSVJD.g:1851:1: rule__Audio__Group__1__Impl : ( ( rule__Audio__NameAssignment_1 ) ) ;
    public final void rule__Audio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1855:1: ( ( ( rule__Audio__NameAssignment_1 ) ) )
            // InternalVideoMontageSVJD.g:1856:1: ( ( rule__Audio__NameAssignment_1 ) )
            {
            // InternalVideoMontageSVJD.g:1856:1: ( ( rule__Audio__NameAssignment_1 ) )
            // InternalVideoMontageSVJD.g:1857:2: ( rule__Audio__NameAssignment_1 )
            {
             before(grammarAccess.getAudioAccess().getNameAssignment_1()); 
            // InternalVideoMontageSVJD.g:1858:2: ( rule__Audio__NameAssignment_1 )
            // InternalVideoMontageSVJD.g:1858:3: rule__Audio__NameAssignment_1
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
    // InternalVideoMontageSVJD.g:1866:1: rule__Audio__Group__2 : rule__Audio__Group__2__Impl rule__Audio__Group__3 ;
    public final void rule__Audio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1870:1: ( rule__Audio__Group__2__Impl rule__Audio__Group__3 )
            // InternalVideoMontageSVJD.g:1871:2: rule__Audio__Group__2__Impl rule__Audio__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontageSVJD.g:1878:1: rule__Audio__Group__2__Impl : ( '{' ) ;
    public final void rule__Audio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1882:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:1883:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:1883:1: ( '{' )
            // InternalVideoMontageSVJD.g:1884:2: '{'
            {
             before(grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalVideoMontageSVJD.g:1893:1: rule__Audio__Group__3 : rule__Audio__Group__3__Impl rule__Audio__Group__4 ;
    public final void rule__Audio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1897:1: ( rule__Audio__Group__3__Impl rule__Audio__Group__4 )
            // InternalVideoMontageSVJD.g:1898:2: rule__Audio__Group__3__Impl rule__Audio__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontageSVJD.g:1905:1: rule__Audio__Group__3__Impl : ( ( rule__Audio__Group_3__0 )? ) ;
    public final void rule__Audio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1909:1: ( ( ( rule__Audio__Group_3__0 )? ) )
            // InternalVideoMontageSVJD.g:1910:1: ( ( rule__Audio__Group_3__0 )? )
            {
            // InternalVideoMontageSVJD.g:1910:1: ( ( rule__Audio__Group_3__0 )? )
            // InternalVideoMontageSVJD.g:1911:2: ( rule__Audio__Group_3__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_3()); 
            // InternalVideoMontageSVJD.g:1912:2: ( rule__Audio__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1912:3: rule__Audio__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Audio__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalVideoMontageSVJD.g:1920:1: rule__Audio__Group__4 : rule__Audio__Group__4__Impl rule__Audio__Group__5 ;
    public final void rule__Audio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1924:1: ( rule__Audio__Group__4__Impl rule__Audio__Group__5 )
            // InternalVideoMontageSVJD.g:1925:2: rule__Audio__Group__4__Impl rule__Audio__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontageSVJD.g:1932:1: rule__Audio__Group__4__Impl : ( ( rule__Audio__Group_4__0 )? ) ;
    public final void rule__Audio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1936:1: ( ( ( rule__Audio__Group_4__0 )? ) )
            // InternalVideoMontageSVJD.g:1937:1: ( ( rule__Audio__Group_4__0 )? )
            {
            // InternalVideoMontageSVJD.g:1937:1: ( ( rule__Audio__Group_4__0 )? )
            // InternalVideoMontageSVJD.g:1938:2: ( rule__Audio__Group_4__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_4()); 
            // InternalVideoMontageSVJD.g:1939:2: ( rule__Audio__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1939:3: rule__Audio__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Audio__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalVideoMontageSVJD.g:1947:1: rule__Audio__Group__5 : rule__Audio__Group__5__Impl ;
    public final void rule__Audio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1951:1: ( rule__Audio__Group__5__Impl )
            // InternalVideoMontageSVJD.g:1952:2: rule__Audio__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalVideoMontageSVJD.g:1958:1: rule__Audio__Group__5__Impl : ( '}' ) ;
    public final void rule__Audio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1962:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:1963:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:1963:1: ( '}' )
            // InternalVideoMontageSVJD.g:1964:2: '}'
            {
             before(grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Audio__Group_3__0"
    // InternalVideoMontageSVJD.g:1974:1: rule__Audio__Group_3__0 : rule__Audio__Group_3__0__Impl rule__Audio__Group_3__1 ;
    public final void rule__Audio__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1978:1: ( rule__Audio__Group_3__0__Impl rule__Audio__Group_3__1 )
            // InternalVideoMontageSVJD.g:1979:2: rule__Audio__Group_3__0__Impl rule__Audio__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Audio__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_3__0"


    // $ANTLR start "rule__Audio__Group_3__0__Impl"
    // InternalVideoMontageSVJD.g:1986:1: rule__Audio__Group_3__0__Impl : ( 'path' ) ;
    public final void rule__Audio__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:1990:1: ( ( 'path' ) )
            // InternalVideoMontageSVJD.g:1991:1: ( 'path' )
            {
            // InternalVideoMontageSVJD.g:1991:1: ( 'path' )
            // InternalVideoMontageSVJD.g:1992:2: 'path'
            {
             before(grammarAccess.getAudioAccess().getPathKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getPathKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_3__0__Impl"


    // $ANTLR start "rule__Audio__Group_3__1"
    // InternalVideoMontageSVJD.g:2001:1: rule__Audio__Group_3__1 : rule__Audio__Group_3__1__Impl ;
    public final void rule__Audio__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2005:1: ( rule__Audio__Group_3__1__Impl )
            // InternalVideoMontageSVJD.g:2006:2: rule__Audio__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_3__1"


    // $ANTLR start "rule__Audio__Group_3__1__Impl"
    // InternalVideoMontageSVJD.g:2012:1: rule__Audio__Group_3__1__Impl : ( ( rule__Audio__PathAssignment_3_1 ) ) ;
    public final void rule__Audio__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2016:1: ( ( ( rule__Audio__PathAssignment_3_1 ) ) )
            // InternalVideoMontageSVJD.g:2017:1: ( ( rule__Audio__PathAssignment_3_1 ) )
            {
            // InternalVideoMontageSVJD.g:2017:1: ( ( rule__Audio__PathAssignment_3_1 ) )
            // InternalVideoMontageSVJD.g:2018:2: ( rule__Audio__PathAssignment_3_1 )
            {
             before(grammarAccess.getAudioAccess().getPathAssignment_3_1()); 
            // InternalVideoMontageSVJD.g:2019:2: ( rule__Audio__PathAssignment_3_1 )
            // InternalVideoMontageSVJD.g:2019:3: rule__Audio__PathAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__PathAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getPathAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_3__1__Impl"


    // $ANTLR start "rule__Audio__Group_4__0"
    // InternalVideoMontageSVJD.g:2028:1: rule__Audio__Group_4__0 : rule__Audio__Group_4__0__Impl rule__Audio__Group_4__1 ;
    public final void rule__Audio__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2032:1: ( rule__Audio__Group_4__0__Impl rule__Audio__Group_4__1 )
            // InternalVideoMontageSVJD.g:2033:2: rule__Audio__Group_4__0__Impl rule__Audio__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Audio__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_4__0"


    // $ANTLR start "rule__Audio__Group_4__0__Impl"
    // InternalVideoMontageSVJD.g:2040:1: rule__Audio__Group_4__0__Impl : ( 'transition' ) ;
    public final void rule__Audio__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2044:1: ( ( 'transition' ) )
            // InternalVideoMontageSVJD.g:2045:1: ( 'transition' )
            {
            // InternalVideoMontageSVJD.g:2045:1: ( 'transition' )
            // InternalVideoMontageSVJD.g:2046:2: 'transition'
            {
             before(grammarAccess.getAudioAccess().getTransitionKeyword_4_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getTransitionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_4__0__Impl"


    // $ANTLR start "rule__Audio__Group_4__1"
    // InternalVideoMontageSVJD.g:2055:1: rule__Audio__Group_4__1 : rule__Audio__Group_4__1__Impl ;
    public final void rule__Audio__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2059:1: ( rule__Audio__Group_4__1__Impl )
            // InternalVideoMontageSVJD.g:2060:2: rule__Audio__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_4__1"


    // $ANTLR start "rule__Audio__Group_4__1__Impl"
    // InternalVideoMontageSVJD.g:2066:1: rule__Audio__Group_4__1__Impl : ( ( rule__Audio__TransitionAssignment_4_1 ) ) ;
    public final void rule__Audio__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2070:1: ( ( ( rule__Audio__TransitionAssignment_4_1 ) ) )
            // InternalVideoMontageSVJD.g:2071:1: ( ( rule__Audio__TransitionAssignment_4_1 ) )
            {
            // InternalVideoMontageSVJD.g:2071:1: ( ( rule__Audio__TransitionAssignment_4_1 ) )
            // InternalVideoMontageSVJD.g:2072:2: ( rule__Audio__TransitionAssignment_4_1 )
            {
             before(grammarAccess.getAudioAccess().getTransitionAssignment_4_1()); 
            // InternalVideoMontageSVJD.g:2073:2: ( rule__Audio__TransitionAssignment_4_1 )
            // InternalVideoMontageSVJD.g:2073:3: rule__Audio__TransitionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__TransitionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getTransitionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_4__1__Impl"


    // $ANTLR start "rule__AudioClip__Group__0"
    // InternalVideoMontageSVJD.g:2082:1: rule__AudioClip__Group__0 : rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1 ;
    public final void rule__AudioClip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2086:1: ( rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1 )
            // InternalVideoMontageSVJD.g:2087:2: rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1
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
    // InternalVideoMontageSVJD.g:2094:1: rule__AudioClip__Group__0__Impl : ( 'AudioClip' ) ;
    public final void rule__AudioClip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2098:1: ( ( 'AudioClip' ) )
            // InternalVideoMontageSVJD.g:2099:1: ( 'AudioClip' )
            {
            // InternalVideoMontageSVJD.g:2099:1: ( 'AudioClip' )
            // InternalVideoMontageSVJD.g:2100:2: 'AudioClip'
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
    // InternalVideoMontageSVJD.g:2109:1: rule__AudioClip__Group__1 : rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2 ;
    public final void rule__AudioClip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2113:1: ( rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2 )
            // InternalVideoMontageSVJD.g:2114:2: rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2
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
    // InternalVideoMontageSVJD.g:2121:1: rule__AudioClip__Group__1__Impl : ( ( rule__AudioClip__NameAssignment_1 ) ) ;
    public final void rule__AudioClip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2125:1: ( ( ( rule__AudioClip__NameAssignment_1 ) ) )
            // InternalVideoMontageSVJD.g:2126:1: ( ( rule__AudioClip__NameAssignment_1 ) )
            {
            // InternalVideoMontageSVJD.g:2126:1: ( ( rule__AudioClip__NameAssignment_1 ) )
            // InternalVideoMontageSVJD.g:2127:2: ( rule__AudioClip__NameAssignment_1 )
            {
             before(grammarAccess.getAudioClipAccess().getNameAssignment_1()); 
            // InternalVideoMontageSVJD.g:2128:2: ( rule__AudioClip__NameAssignment_1 )
            // InternalVideoMontageSVJD.g:2128:3: rule__AudioClip__NameAssignment_1
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
    // InternalVideoMontageSVJD.g:2136:1: rule__AudioClip__Group__2 : rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3 ;
    public final void rule__AudioClip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2140:1: ( rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3 )
            // InternalVideoMontageSVJD.g:2141:2: rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3
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
    // InternalVideoMontageSVJD.g:2148:1: rule__AudioClip__Group__2__Impl : ( 'start' ) ;
    public final void rule__AudioClip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2152:1: ( ( 'start' ) )
            // InternalVideoMontageSVJD.g:2153:1: ( 'start' )
            {
            // InternalVideoMontageSVJD.g:2153:1: ( 'start' )
            // InternalVideoMontageSVJD.g:2154:2: 'start'
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
    // InternalVideoMontageSVJD.g:2163:1: rule__AudioClip__Group__3 : rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4 ;
    public final void rule__AudioClip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2167:1: ( rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4 )
            // InternalVideoMontageSVJD.g:2168:2: rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4
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
    // InternalVideoMontageSVJD.g:2175:1: rule__AudioClip__Group__3__Impl : ( ':' ) ;
    public final void rule__AudioClip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2179:1: ( ( ':' ) )
            // InternalVideoMontageSVJD.g:2180:1: ( ':' )
            {
            // InternalVideoMontageSVJD.g:2180:1: ( ':' )
            // InternalVideoMontageSVJD.g:2181:2: ':'
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
    // InternalVideoMontageSVJD.g:2190:1: rule__AudioClip__Group__4 : rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5 ;
    public final void rule__AudioClip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2194:1: ( rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5 )
            // InternalVideoMontageSVJD.g:2195:2: rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5
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
    // InternalVideoMontageSVJD.g:2202:1: rule__AudioClip__Group__4__Impl : ( ( rule__AudioClip__StartingmomentAssignment_4 ) ) ;
    public final void rule__AudioClip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2206:1: ( ( ( rule__AudioClip__StartingmomentAssignment_4 ) ) )
            // InternalVideoMontageSVJD.g:2207:1: ( ( rule__AudioClip__StartingmomentAssignment_4 ) )
            {
            // InternalVideoMontageSVJD.g:2207:1: ( ( rule__AudioClip__StartingmomentAssignment_4 ) )
            // InternalVideoMontageSVJD.g:2208:2: ( rule__AudioClip__StartingmomentAssignment_4 )
            {
             before(grammarAccess.getAudioClipAccess().getStartingmomentAssignment_4()); 
            // InternalVideoMontageSVJD.g:2209:2: ( rule__AudioClip__StartingmomentAssignment_4 )
            // InternalVideoMontageSVJD.g:2209:3: rule__AudioClip__StartingmomentAssignment_4
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
    // InternalVideoMontageSVJD.g:2217:1: rule__AudioClip__Group__5 : rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6 ;
    public final void rule__AudioClip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2221:1: ( rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6 )
            // InternalVideoMontageSVJD.g:2222:2: rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6
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
    // InternalVideoMontageSVJD.g:2229:1: rule__AudioClip__Group__5__Impl : ( '{' ) ;
    public final void rule__AudioClip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2233:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:2234:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:2234:1: ( '{' )
            // InternalVideoMontageSVJD.g:2235:2: '{'
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
    // InternalVideoMontageSVJD.g:2244:1: rule__AudioClip__Group__6 : rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7 ;
    public final void rule__AudioClip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2248:1: ( rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7 )
            // InternalVideoMontageSVJD.g:2249:2: rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7
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
    // InternalVideoMontageSVJD.g:2256:1: rule__AudioClip__Group__6__Impl : ( ( rule__AudioClip__Group_6__0 )? ) ;
    public final void rule__AudioClip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2260:1: ( ( ( rule__AudioClip__Group_6__0 )? ) )
            // InternalVideoMontageSVJD.g:2261:1: ( ( rule__AudioClip__Group_6__0 )? )
            {
            // InternalVideoMontageSVJD.g:2261:1: ( ( rule__AudioClip__Group_6__0 )? )
            // InternalVideoMontageSVJD.g:2262:2: ( rule__AudioClip__Group_6__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_6()); 
            // InternalVideoMontageSVJD.g:2263:2: ( rule__AudioClip__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2263:3: rule__AudioClip__Group_6__0
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
    // InternalVideoMontageSVJD.g:2271:1: rule__AudioClip__Group__7 : rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8 ;
    public final void rule__AudioClip__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2275:1: ( rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8 )
            // InternalVideoMontageSVJD.g:2276:2: rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8
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
    // InternalVideoMontageSVJD.g:2283:1: rule__AudioClip__Group__7__Impl : ( ( rule__AudioClip__Group_7__0 ) ) ;
    public final void rule__AudioClip__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2287:1: ( ( ( rule__AudioClip__Group_7__0 ) ) )
            // InternalVideoMontageSVJD.g:2288:1: ( ( rule__AudioClip__Group_7__0 ) )
            {
            // InternalVideoMontageSVJD.g:2288:1: ( ( rule__AudioClip__Group_7__0 ) )
            // InternalVideoMontageSVJD.g:2289:2: ( rule__AudioClip__Group_7__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup_7()); 
            // InternalVideoMontageSVJD.g:2290:2: ( rule__AudioClip__Group_7__0 )
            // InternalVideoMontageSVJD.g:2290:3: rule__AudioClip__Group_7__0
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
    // InternalVideoMontageSVJD.g:2298:1: rule__AudioClip__Group__8 : rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9 ;
    public final void rule__AudioClip__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2302:1: ( rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9 )
            // InternalVideoMontageSVJD.g:2303:2: rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9
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
    // InternalVideoMontageSVJD.g:2310:1: rule__AudioClip__Group__8__Impl : ( ( rule__AudioClip__Group_8__0 ) ) ;
    public final void rule__AudioClip__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2314:1: ( ( ( rule__AudioClip__Group_8__0 ) ) )
            // InternalVideoMontageSVJD.g:2315:1: ( ( rule__AudioClip__Group_8__0 ) )
            {
            // InternalVideoMontageSVJD.g:2315:1: ( ( rule__AudioClip__Group_8__0 ) )
            // InternalVideoMontageSVJD.g:2316:2: ( rule__AudioClip__Group_8__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup_8()); 
            // InternalVideoMontageSVJD.g:2317:2: ( rule__AudioClip__Group_8__0 )
            // InternalVideoMontageSVJD.g:2317:3: rule__AudioClip__Group_8__0
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
    // InternalVideoMontageSVJD.g:2325:1: rule__AudioClip__Group__9 : rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10 ;
    public final void rule__AudioClip__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2329:1: ( rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10 )
            // InternalVideoMontageSVJD.g:2330:2: rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10
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
    // InternalVideoMontageSVJD.g:2337:1: rule__AudioClip__Group__9__Impl : ( ( rule__AudioClip__Group_9__0 )? ) ;
    public final void rule__AudioClip__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2341:1: ( ( ( rule__AudioClip__Group_9__0 )? ) )
            // InternalVideoMontageSVJD.g:2342:1: ( ( rule__AudioClip__Group_9__0 )? )
            {
            // InternalVideoMontageSVJD.g:2342:1: ( ( rule__AudioClip__Group_9__0 )? )
            // InternalVideoMontageSVJD.g:2343:2: ( rule__AudioClip__Group_9__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_9()); 
            // InternalVideoMontageSVJD.g:2344:2: ( rule__AudioClip__Group_9__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2344:3: rule__AudioClip__Group_9__0
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
    // InternalVideoMontageSVJD.g:2352:1: rule__AudioClip__Group__10 : rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11 ;
    public final void rule__AudioClip__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2356:1: ( rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11 )
            // InternalVideoMontageSVJD.g:2357:2: rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11
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
    // InternalVideoMontageSVJD.g:2364:1: rule__AudioClip__Group__10__Impl : ( 'audio' ) ;
    public final void rule__AudioClip__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2368:1: ( ( 'audio' ) )
            // InternalVideoMontageSVJD.g:2369:1: ( 'audio' )
            {
            // InternalVideoMontageSVJD.g:2369:1: ( 'audio' )
            // InternalVideoMontageSVJD.g:2370:2: 'audio'
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
    // InternalVideoMontageSVJD.g:2379:1: rule__AudioClip__Group__11 : rule__AudioClip__Group__11__Impl rule__AudioClip__Group__12 ;
    public final void rule__AudioClip__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2383:1: ( rule__AudioClip__Group__11__Impl rule__AudioClip__Group__12 )
            // InternalVideoMontageSVJD.g:2384:2: rule__AudioClip__Group__11__Impl rule__AudioClip__Group__12
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
    // InternalVideoMontageSVJD.g:2391:1: rule__AudioClip__Group__11__Impl : ( ( rule__AudioClip__AudioAssignment_11 )* ) ;
    public final void rule__AudioClip__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2395:1: ( ( ( rule__AudioClip__AudioAssignment_11 )* ) )
            // InternalVideoMontageSVJD.g:2396:1: ( ( rule__AudioClip__AudioAssignment_11 )* )
            {
            // InternalVideoMontageSVJD.g:2396:1: ( ( rule__AudioClip__AudioAssignment_11 )* )
            // InternalVideoMontageSVJD.g:2397:2: ( rule__AudioClip__AudioAssignment_11 )*
            {
             before(grammarAccess.getAudioClipAccess().getAudioAssignment_11()); 
            // InternalVideoMontageSVJD.g:2398:2: ( rule__AudioClip__AudioAssignment_11 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalVideoMontageSVJD.g:2398:3: rule__AudioClip__AudioAssignment_11
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
    // InternalVideoMontageSVJD.g:2406:1: rule__AudioClip__Group__12 : rule__AudioClip__Group__12__Impl ;
    public final void rule__AudioClip__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2410:1: ( rule__AudioClip__Group__12__Impl )
            // InternalVideoMontageSVJD.g:2411:2: rule__AudioClip__Group__12__Impl
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
    // InternalVideoMontageSVJD.g:2417:1: rule__AudioClip__Group__12__Impl : ( '}' ) ;
    public final void rule__AudioClip__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2421:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:2422:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:2422:1: ( '}' )
            // InternalVideoMontageSVJD.g:2423:2: '}'
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
    // InternalVideoMontageSVJD.g:2433:1: rule__AudioClip__Group_6__0 : rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1 ;
    public final void rule__AudioClip__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2437:1: ( rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1 )
            // InternalVideoMontageSVJD.g:2438:2: rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1
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
    // InternalVideoMontageSVJD.g:2445:1: rule__AudioClip__Group_6__0__Impl : ( 'volume' ) ;
    public final void rule__AudioClip__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2449:1: ( ( 'volume' ) )
            // InternalVideoMontageSVJD.g:2450:1: ( 'volume' )
            {
            // InternalVideoMontageSVJD.g:2450:1: ( 'volume' )
            // InternalVideoMontageSVJD.g:2451:2: 'volume'
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
    // InternalVideoMontageSVJD.g:2460:1: rule__AudioClip__Group_6__1 : rule__AudioClip__Group_6__1__Impl ;
    public final void rule__AudioClip__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2464:1: ( rule__AudioClip__Group_6__1__Impl )
            // InternalVideoMontageSVJD.g:2465:2: rule__AudioClip__Group_6__1__Impl
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
    // InternalVideoMontageSVJD.g:2471:1: rule__AudioClip__Group_6__1__Impl : ( ( rule__AudioClip__VolumeAssignment_6_1 ) ) ;
    public final void rule__AudioClip__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2475:1: ( ( ( rule__AudioClip__VolumeAssignment_6_1 ) ) )
            // InternalVideoMontageSVJD.g:2476:1: ( ( rule__AudioClip__VolumeAssignment_6_1 ) )
            {
            // InternalVideoMontageSVJD.g:2476:1: ( ( rule__AudioClip__VolumeAssignment_6_1 ) )
            // InternalVideoMontageSVJD.g:2477:2: ( rule__AudioClip__VolumeAssignment_6_1 )
            {
             before(grammarAccess.getAudioClipAccess().getVolumeAssignment_6_1()); 
            // InternalVideoMontageSVJD.g:2478:2: ( rule__AudioClip__VolumeAssignment_6_1 )
            // InternalVideoMontageSVJD.g:2478:3: rule__AudioClip__VolumeAssignment_6_1
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
    // InternalVideoMontageSVJD.g:2487:1: rule__AudioClip__Group_7__0 : rule__AudioClip__Group_7__0__Impl rule__AudioClip__Group_7__1 ;
    public final void rule__AudioClip__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2491:1: ( rule__AudioClip__Group_7__0__Impl rule__AudioClip__Group_7__1 )
            // InternalVideoMontageSVJD.g:2492:2: rule__AudioClip__Group_7__0__Impl rule__AudioClip__Group_7__1
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
    // InternalVideoMontageSVJD.g:2499:1: rule__AudioClip__Group_7__0__Impl : ( 'startCut' ) ;
    public final void rule__AudioClip__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2503:1: ( ( 'startCut' ) )
            // InternalVideoMontageSVJD.g:2504:1: ( 'startCut' )
            {
            // InternalVideoMontageSVJD.g:2504:1: ( 'startCut' )
            // InternalVideoMontageSVJD.g:2505:2: 'startCut'
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
    // InternalVideoMontageSVJD.g:2514:1: rule__AudioClip__Group_7__1 : rule__AudioClip__Group_7__1__Impl ;
    public final void rule__AudioClip__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2518:1: ( rule__AudioClip__Group_7__1__Impl )
            // InternalVideoMontageSVJD.g:2519:2: rule__AudioClip__Group_7__1__Impl
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
    // InternalVideoMontageSVJD.g:2525:1: rule__AudioClip__Group_7__1__Impl : ( ( rule__AudioClip__StartCutAssignment_7_1 ) ) ;
    public final void rule__AudioClip__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2529:1: ( ( ( rule__AudioClip__StartCutAssignment_7_1 ) ) )
            // InternalVideoMontageSVJD.g:2530:1: ( ( rule__AudioClip__StartCutAssignment_7_1 ) )
            {
            // InternalVideoMontageSVJD.g:2530:1: ( ( rule__AudioClip__StartCutAssignment_7_1 ) )
            // InternalVideoMontageSVJD.g:2531:2: ( rule__AudioClip__StartCutAssignment_7_1 )
            {
             before(grammarAccess.getAudioClipAccess().getStartCutAssignment_7_1()); 
            // InternalVideoMontageSVJD.g:2532:2: ( rule__AudioClip__StartCutAssignment_7_1 )
            // InternalVideoMontageSVJD.g:2532:3: rule__AudioClip__StartCutAssignment_7_1
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
    // InternalVideoMontageSVJD.g:2541:1: rule__AudioClip__Group_8__0 : rule__AudioClip__Group_8__0__Impl rule__AudioClip__Group_8__1 ;
    public final void rule__AudioClip__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2545:1: ( rule__AudioClip__Group_8__0__Impl rule__AudioClip__Group_8__1 )
            // InternalVideoMontageSVJD.g:2546:2: rule__AudioClip__Group_8__0__Impl rule__AudioClip__Group_8__1
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
    // InternalVideoMontageSVJD.g:2553:1: rule__AudioClip__Group_8__0__Impl : ( 'endCut' ) ;
    public final void rule__AudioClip__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2557:1: ( ( 'endCut' ) )
            // InternalVideoMontageSVJD.g:2558:1: ( 'endCut' )
            {
            // InternalVideoMontageSVJD.g:2558:1: ( 'endCut' )
            // InternalVideoMontageSVJD.g:2559:2: 'endCut'
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
    // InternalVideoMontageSVJD.g:2568:1: rule__AudioClip__Group_8__1 : rule__AudioClip__Group_8__1__Impl ;
    public final void rule__AudioClip__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2572:1: ( rule__AudioClip__Group_8__1__Impl )
            // InternalVideoMontageSVJD.g:2573:2: rule__AudioClip__Group_8__1__Impl
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
    // InternalVideoMontageSVJD.g:2579:1: rule__AudioClip__Group_8__1__Impl : ( ( rule__AudioClip__EndCutAssignment_8_1 ) ) ;
    public final void rule__AudioClip__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2583:1: ( ( ( rule__AudioClip__EndCutAssignment_8_1 ) ) )
            // InternalVideoMontageSVJD.g:2584:1: ( ( rule__AudioClip__EndCutAssignment_8_1 ) )
            {
            // InternalVideoMontageSVJD.g:2584:1: ( ( rule__AudioClip__EndCutAssignment_8_1 ) )
            // InternalVideoMontageSVJD.g:2585:2: ( rule__AudioClip__EndCutAssignment_8_1 )
            {
             before(grammarAccess.getAudioClipAccess().getEndCutAssignment_8_1()); 
            // InternalVideoMontageSVJD.g:2586:2: ( rule__AudioClip__EndCutAssignment_8_1 )
            // InternalVideoMontageSVJD.g:2586:3: rule__AudioClip__EndCutAssignment_8_1
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
    // InternalVideoMontageSVJD.g:2595:1: rule__AudioClip__Group_9__0 : rule__AudioClip__Group_9__0__Impl rule__AudioClip__Group_9__1 ;
    public final void rule__AudioClip__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2599:1: ( rule__AudioClip__Group_9__0__Impl rule__AudioClip__Group_9__1 )
            // InternalVideoMontageSVJD.g:2600:2: rule__AudioClip__Group_9__0__Impl rule__AudioClip__Group_9__1
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
    // InternalVideoMontageSVJD.g:2607:1: rule__AudioClip__Group_9__0__Impl : ( 'transition' ) ;
    public final void rule__AudioClip__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2611:1: ( ( 'transition' ) )
            // InternalVideoMontageSVJD.g:2612:1: ( 'transition' )
            {
            // InternalVideoMontageSVJD.g:2612:1: ( 'transition' )
            // InternalVideoMontageSVJD.g:2613:2: 'transition'
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
    // InternalVideoMontageSVJD.g:2622:1: rule__AudioClip__Group_9__1 : rule__AudioClip__Group_9__1__Impl ;
    public final void rule__AudioClip__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2626:1: ( rule__AudioClip__Group_9__1__Impl )
            // InternalVideoMontageSVJD.g:2627:2: rule__AudioClip__Group_9__1__Impl
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
    // InternalVideoMontageSVJD.g:2633:1: rule__AudioClip__Group_9__1__Impl : ( ( rule__AudioClip__TransitionAssignment_9_1 ) ) ;
    public final void rule__AudioClip__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2637:1: ( ( ( rule__AudioClip__TransitionAssignment_9_1 ) ) )
            // InternalVideoMontageSVJD.g:2638:1: ( ( rule__AudioClip__TransitionAssignment_9_1 ) )
            {
            // InternalVideoMontageSVJD.g:2638:1: ( ( rule__AudioClip__TransitionAssignment_9_1 ) )
            // InternalVideoMontageSVJD.g:2639:2: ( rule__AudioClip__TransitionAssignment_9_1 )
            {
             before(grammarAccess.getAudioClipAccess().getTransitionAssignment_9_1()); 
            // InternalVideoMontageSVJD.g:2640:2: ( rule__AudioClip__TransitionAssignment_9_1 )
            // InternalVideoMontageSVJD.g:2640:3: rule__AudioClip__TransitionAssignment_9_1
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
    // InternalVideoMontageSVJD.g:2649:1: rule__Clip__Group__0 : rule__Clip__Group__0__Impl rule__Clip__Group__1 ;
    public final void rule__Clip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2653:1: ( rule__Clip__Group__0__Impl rule__Clip__Group__1 )
            // InternalVideoMontageSVJD.g:2654:2: rule__Clip__Group__0__Impl rule__Clip__Group__1
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
    // InternalVideoMontageSVJD.g:2661:1: rule__Clip__Group__0__Impl : ( 'Clip' ) ;
    public final void rule__Clip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2665:1: ( ( 'Clip' ) )
            // InternalVideoMontageSVJD.g:2666:1: ( 'Clip' )
            {
            // InternalVideoMontageSVJD.g:2666:1: ( 'Clip' )
            // InternalVideoMontageSVJD.g:2667:2: 'Clip'
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
    // InternalVideoMontageSVJD.g:2676:1: rule__Clip__Group__1 : rule__Clip__Group__1__Impl rule__Clip__Group__2 ;
    public final void rule__Clip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2680:1: ( rule__Clip__Group__1__Impl rule__Clip__Group__2 )
            // InternalVideoMontageSVJD.g:2681:2: rule__Clip__Group__1__Impl rule__Clip__Group__2
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
    // InternalVideoMontageSVJD.g:2688:1: rule__Clip__Group__1__Impl : ( ( rule__Clip__NameAssignment_1 ) ) ;
    public final void rule__Clip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2692:1: ( ( ( rule__Clip__NameAssignment_1 ) ) )
            // InternalVideoMontageSVJD.g:2693:1: ( ( rule__Clip__NameAssignment_1 ) )
            {
            // InternalVideoMontageSVJD.g:2693:1: ( ( rule__Clip__NameAssignment_1 ) )
            // InternalVideoMontageSVJD.g:2694:2: ( rule__Clip__NameAssignment_1 )
            {
             before(grammarAccess.getClipAccess().getNameAssignment_1()); 
            // InternalVideoMontageSVJD.g:2695:2: ( rule__Clip__NameAssignment_1 )
            // InternalVideoMontageSVJD.g:2695:3: rule__Clip__NameAssignment_1
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
    // InternalVideoMontageSVJD.g:2703:1: rule__Clip__Group__2 : rule__Clip__Group__2__Impl rule__Clip__Group__3 ;
    public final void rule__Clip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2707:1: ( rule__Clip__Group__2__Impl rule__Clip__Group__3 )
            // InternalVideoMontageSVJD.g:2708:2: rule__Clip__Group__2__Impl rule__Clip__Group__3
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
    // InternalVideoMontageSVJD.g:2715:1: rule__Clip__Group__2__Impl : ( '{' ) ;
    public final void rule__Clip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2719:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:2720:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:2720:1: ( '{' )
            // InternalVideoMontageSVJD.g:2721:2: '{'
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
    // InternalVideoMontageSVJD.g:2730:1: rule__Clip__Group__3 : rule__Clip__Group__3__Impl rule__Clip__Group__4 ;
    public final void rule__Clip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2734:1: ( rule__Clip__Group__3__Impl rule__Clip__Group__4 )
            // InternalVideoMontageSVJD.g:2735:2: rule__Clip__Group__3__Impl rule__Clip__Group__4
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
    // InternalVideoMontageSVJD.g:2742:1: rule__Clip__Group__3__Impl : ( ( rule__Clip__Group_3__0 )? ) ;
    public final void rule__Clip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2746:1: ( ( ( rule__Clip__Group_3__0 )? ) )
            // InternalVideoMontageSVJD.g:2747:1: ( ( rule__Clip__Group_3__0 )? )
            {
            // InternalVideoMontageSVJD.g:2747:1: ( ( rule__Clip__Group_3__0 )? )
            // InternalVideoMontageSVJD.g:2748:2: ( rule__Clip__Group_3__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_3()); 
            // InternalVideoMontageSVJD.g:2749:2: ( rule__Clip__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2749:3: rule__Clip__Group_3__0
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
    // InternalVideoMontageSVJD.g:2757:1: rule__Clip__Group__4 : rule__Clip__Group__4__Impl rule__Clip__Group__5 ;
    public final void rule__Clip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2761:1: ( rule__Clip__Group__4__Impl rule__Clip__Group__5 )
            // InternalVideoMontageSVJD.g:2762:2: rule__Clip__Group__4__Impl rule__Clip__Group__5
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
    // InternalVideoMontageSVJD.g:2769:1: rule__Clip__Group__4__Impl : ( ( rule__Clip__Group_4__0 )? ) ;
    public final void rule__Clip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2773:1: ( ( ( rule__Clip__Group_4__0 )? ) )
            // InternalVideoMontageSVJD.g:2774:1: ( ( rule__Clip__Group_4__0 )? )
            {
            // InternalVideoMontageSVJD.g:2774:1: ( ( rule__Clip__Group_4__0 )? )
            // InternalVideoMontageSVJD.g:2775:2: ( rule__Clip__Group_4__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_4()); 
            // InternalVideoMontageSVJD.g:2776:2: ( rule__Clip__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2776:3: rule__Clip__Group_4__0
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
    // InternalVideoMontageSVJD.g:2784:1: rule__Clip__Group__5 : rule__Clip__Group__5__Impl rule__Clip__Group__6 ;
    public final void rule__Clip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2788:1: ( rule__Clip__Group__5__Impl rule__Clip__Group__6 )
            // InternalVideoMontageSVJD.g:2789:2: rule__Clip__Group__5__Impl rule__Clip__Group__6
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
    // InternalVideoMontageSVJD.g:2796:1: rule__Clip__Group__5__Impl : ( 'video' ) ;
    public final void rule__Clip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2800:1: ( ( 'video' ) )
            // InternalVideoMontageSVJD.g:2801:1: ( 'video' )
            {
            // InternalVideoMontageSVJD.g:2801:1: ( 'video' )
            // InternalVideoMontageSVJD.g:2802:2: 'video'
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
    // InternalVideoMontageSVJD.g:2811:1: rule__Clip__Group__6 : rule__Clip__Group__6__Impl rule__Clip__Group__7 ;
    public final void rule__Clip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2815:1: ( rule__Clip__Group__6__Impl rule__Clip__Group__7 )
            // InternalVideoMontageSVJD.g:2816:2: rule__Clip__Group__6__Impl rule__Clip__Group__7
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
    // InternalVideoMontageSVJD.g:2823:1: rule__Clip__Group__6__Impl : ( ( rule__Clip__VideoAssignment_6 ) ) ;
    public final void rule__Clip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2827:1: ( ( ( rule__Clip__VideoAssignment_6 ) ) )
            // InternalVideoMontageSVJD.g:2828:1: ( ( rule__Clip__VideoAssignment_6 ) )
            {
            // InternalVideoMontageSVJD.g:2828:1: ( ( rule__Clip__VideoAssignment_6 ) )
            // InternalVideoMontageSVJD.g:2829:2: ( rule__Clip__VideoAssignment_6 )
            {
             before(grammarAccess.getClipAccess().getVideoAssignment_6()); 
            // InternalVideoMontageSVJD.g:2830:2: ( rule__Clip__VideoAssignment_6 )
            // InternalVideoMontageSVJD.g:2830:3: rule__Clip__VideoAssignment_6
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
    // InternalVideoMontageSVJD.g:2838:1: rule__Clip__Group__7 : rule__Clip__Group__7__Impl ;
    public final void rule__Clip__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2842:1: ( rule__Clip__Group__7__Impl )
            // InternalVideoMontageSVJD.g:2843:2: rule__Clip__Group__7__Impl
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
    // InternalVideoMontageSVJD.g:2849:1: rule__Clip__Group__7__Impl : ( '}' ) ;
    public final void rule__Clip__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2853:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:2854:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:2854:1: ( '}' )
            // InternalVideoMontageSVJD.g:2855:2: '}'
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
    // InternalVideoMontageSVJD.g:2865:1: rule__Clip__Group_3__0 : rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1 ;
    public final void rule__Clip__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2869:1: ( rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1 )
            // InternalVideoMontageSVJD.g:2870:2: rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1
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
    // InternalVideoMontageSVJD.g:2877:1: rule__Clip__Group_3__0__Impl : ( 'startCut' ) ;
    public final void rule__Clip__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2881:1: ( ( 'startCut' ) )
            // InternalVideoMontageSVJD.g:2882:1: ( 'startCut' )
            {
            // InternalVideoMontageSVJD.g:2882:1: ( 'startCut' )
            // InternalVideoMontageSVJD.g:2883:2: 'startCut'
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
    // InternalVideoMontageSVJD.g:2892:1: rule__Clip__Group_3__1 : rule__Clip__Group_3__1__Impl ;
    public final void rule__Clip__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2896:1: ( rule__Clip__Group_3__1__Impl )
            // InternalVideoMontageSVJD.g:2897:2: rule__Clip__Group_3__1__Impl
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
    // InternalVideoMontageSVJD.g:2903:1: rule__Clip__Group_3__1__Impl : ( ( rule__Clip__StartCutAssignment_3_1 ) ) ;
    public final void rule__Clip__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2907:1: ( ( ( rule__Clip__StartCutAssignment_3_1 ) ) )
            // InternalVideoMontageSVJD.g:2908:1: ( ( rule__Clip__StartCutAssignment_3_1 ) )
            {
            // InternalVideoMontageSVJD.g:2908:1: ( ( rule__Clip__StartCutAssignment_3_1 ) )
            // InternalVideoMontageSVJD.g:2909:2: ( rule__Clip__StartCutAssignment_3_1 )
            {
             before(grammarAccess.getClipAccess().getStartCutAssignment_3_1()); 
            // InternalVideoMontageSVJD.g:2910:2: ( rule__Clip__StartCutAssignment_3_1 )
            // InternalVideoMontageSVJD.g:2910:3: rule__Clip__StartCutAssignment_3_1
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
    // InternalVideoMontageSVJD.g:2919:1: rule__Clip__Group_4__0 : rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1 ;
    public final void rule__Clip__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2923:1: ( rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1 )
            // InternalVideoMontageSVJD.g:2924:2: rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1
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
    // InternalVideoMontageSVJD.g:2931:1: rule__Clip__Group_4__0__Impl : ( 'endCut' ) ;
    public final void rule__Clip__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2935:1: ( ( 'endCut' ) )
            // InternalVideoMontageSVJD.g:2936:1: ( 'endCut' )
            {
            // InternalVideoMontageSVJD.g:2936:1: ( 'endCut' )
            // InternalVideoMontageSVJD.g:2937:2: 'endCut'
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
    // InternalVideoMontageSVJD.g:2946:1: rule__Clip__Group_4__1 : rule__Clip__Group_4__1__Impl ;
    public final void rule__Clip__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2950:1: ( rule__Clip__Group_4__1__Impl )
            // InternalVideoMontageSVJD.g:2951:2: rule__Clip__Group_4__1__Impl
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
    // InternalVideoMontageSVJD.g:2957:1: rule__Clip__Group_4__1__Impl : ( ( rule__Clip__EndCutAssignment_4_1 ) ) ;
    public final void rule__Clip__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2961:1: ( ( ( rule__Clip__EndCutAssignment_4_1 ) ) )
            // InternalVideoMontageSVJD.g:2962:1: ( ( rule__Clip__EndCutAssignment_4_1 ) )
            {
            // InternalVideoMontageSVJD.g:2962:1: ( ( rule__Clip__EndCutAssignment_4_1 ) )
            // InternalVideoMontageSVJD.g:2963:2: ( rule__Clip__EndCutAssignment_4_1 )
            {
             before(grammarAccess.getClipAccess().getEndCutAssignment_4_1()); 
            // InternalVideoMontageSVJD.g:2964:2: ( rule__Clip__EndCutAssignment_4_1 )
            // InternalVideoMontageSVJD.g:2964:3: rule__Clip__EndCutAssignment_4_1
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
    // InternalVideoMontageSVJD.g:2973:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2977:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalVideoMontageSVJD.g:2978:2: rule__Title__Group__0__Impl rule__Title__Group__1
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
    // InternalVideoMontageSVJD.g:2985:1: rule__Title__Group__0__Impl : ( 'Title' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:2989:1: ( ( 'Title' ) )
            // InternalVideoMontageSVJD.g:2990:1: ( 'Title' )
            {
            // InternalVideoMontageSVJD.g:2990:1: ( 'Title' )
            // InternalVideoMontageSVJD.g:2991:2: 'Title'
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
    // InternalVideoMontageSVJD.g:3000:1: rule__Title__Group__1 : rule__Title__Group__1__Impl rule__Title__Group__2 ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3004:1: ( rule__Title__Group__1__Impl rule__Title__Group__2 )
            // InternalVideoMontageSVJD.g:3005:2: rule__Title__Group__1__Impl rule__Title__Group__2
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
    // InternalVideoMontageSVJD.g:3012:1: rule__Title__Group__1__Impl : ( ( rule__Title__NameAssignment_1 ) ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3016:1: ( ( ( rule__Title__NameAssignment_1 ) ) )
            // InternalVideoMontageSVJD.g:3017:1: ( ( rule__Title__NameAssignment_1 ) )
            {
            // InternalVideoMontageSVJD.g:3017:1: ( ( rule__Title__NameAssignment_1 ) )
            // InternalVideoMontageSVJD.g:3018:2: ( rule__Title__NameAssignment_1 )
            {
             before(grammarAccess.getTitleAccess().getNameAssignment_1()); 
            // InternalVideoMontageSVJD.g:3019:2: ( rule__Title__NameAssignment_1 )
            // InternalVideoMontageSVJD.g:3019:3: rule__Title__NameAssignment_1
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
    // InternalVideoMontageSVJD.g:3027:1: rule__Title__Group__2 : rule__Title__Group__2__Impl rule__Title__Group__3 ;
    public final void rule__Title__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3031:1: ( rule__Title__Group__2__Impl rule__Title__Group__3 )
            // InternalVideoMontageSVJD.g:3032:2: rule__Title__Group__2__Impl rule__Title__Group__3
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
    // InternalVideoMontageSVJD.g:3039:1: rule__Title__Group__2__Impl : ( '{' ) ;
    public final void rule__Title__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3043:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:3044:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:3044:1: ( '{' )
            // InternalVideoMontageSVJD.g:3045:2: '{'
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
    // InternalVideoMontageSVJD.g:3054:1: rule__Title__Group__3 : rule__Title__Group__3__Impl rule__Title__Group__4 ;
    public final void rule__Title__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3058:1: ( rule__Title__Group__3__Impl rule__Title__Group__4 )
            // InternalVideoMontageSVJD.g:3059:2: rule__Title__Group__3__Impl rule__Title__Group__4
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
    // InternalVideoMontageSVJD.g:3066:1: rule__Title__Group__3__Impl : ( ( rule__Title__Group_3__0 )? ) ;
    public final void rule__Title__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3070:1: ( ( ( rule__Title__Group_3__0 )? ) )
            // InternalVideoMontageSVJD.g:3071:1: ( ( rule__Title__Group_3__0 )? )
            {
            // InternalVideoMontageSVJD.g:3071:1: ( ( rule__Title__Group_3__0 )? )
            // InternalVideoMontageSVJD.g:3072:2: ( rule__Title__Group_3__0 )?
            {
             before(grammarAccess.getTitleAccess().getGroup_3()); 
            // InternalVideoMontageSVJD.g:3073:2: ( rule__Title__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVideoMontageSVJD.g:3073:3: rule__Title__Group_3__0
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
    // InternalVideoMontageSVJD.g:3081:1: rule__Title__Group__4 : rule__Title__Group__4__Impl rule__Title__Group__5 ;
    public final void rule__Title__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3085:1: ( rule__Title__Group__4__Impl rule__Title__Group__5 )
            // InternalVideoMontageSVJD.g:3086:2: rule__Title__Group__4__Impl rule__Title__Group__5
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
    // InternalVideoMontageSVJD.g:3093:1: rule__Title__Group__4__Impl : ( ( rule__Title__Group_4__0 )? ) ;
    public final void rule__Title__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3097:1: ( ( ( rule__Title__Group_4__0 )? ) )
            // InternalVideoMontageSVJD.g:3098:1: ( ( rule__Title__Group_4__0 )? )
            {
            // InternalVideoMontageSVJD.g:3098:1: ( ( rule__Title__Group_4__0 )? )
            // InternalVideoMontageSVJD.g:3099:2: ( rule__Title__Group_4__0 )?
            {
             before(grammarAccess.getTitleAccess().getGroup_4()); 
            // InternalVideoMontageSVJD.g:3100:2: ( rule__Title__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVideoMontageSVJD.g:3100:3: rule__Title__Group_4__0
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
    // InternalVideoMontageSVJD.g:3108:1: rule__Title__Group__5 : rule__Title__Group__5__Impl rule__Title__Group__6 ;
    public final void rule__Title__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3112:1: ( rule__Title__Group__5__Impl rule__Title__Group__6 )
            // InternalVideoMontageSVJD.g:3113:2: rule__Title__Group__5__Impl rule__Title__Group__6
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
    // InternalVideoMontageSVJD.g:3120:1: rule__Title__Group__5__Impl : ( 'textArea' ) ;
    public final void rule__Title__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3124:1: ( ( 'textArea' ) )
            // InternalVideoMontageSVJD.g:3125:1: ( 'textArea' )
            {
            // InternalVideoMontageSVJD.g:3125:1: ( 'textArea' )
            // InternalVideoMontageSVJD.g:3126:2: 'textArea'
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
    // InternalVideoMontageSVJD.g:3135:1: rule__Title__Group__6 : rule__Title__Group__6__Impl rule__Title__Group__7 ;
    public final void rule__Title__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3139:1: ( rule__Title__Group__6__Impl rule__Title__Group__7 )
            // InternalVideoMontageSVJD.g:3140:2: rule__Title__Group__6__Impl rule__Title__Group__7
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
    // InternalVideoMontageSVJD.g:3147:1: rule__Title__Group__6__Impl : ( ( rule__Title__TextareaAssignment_6 ) ) ;
    public final void rule__Title__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3151:1: ( ( ( rule__Title__TextareaAssignment_6 ) ) )
            // InternalVideoMontageSVJD.g:3152:1: ( ( rule__Title__TextareaAssignment_6 ) )
            {
            // InternalVideoMontageSVJD.g:3152:1: ( ( rule__Title__TextareaAssignment_6 ) )
            // InternalVideoMontageSVJD.g:3153:2: ( rule__Title__TextareaAssignment_6 )
            {
             before(grammarAccess.getTitleAccess().getTextareaAssignment_6()); 
            // InternalVideoMontageSVJD.g:3154:2: ( rule__Title__TextareaAssignment_6 )
            // InternalVideoMontageSVJD.g:3154:3: rule__Title__TextareaAssignment_6
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
    // InternalVideoMontageSVJD.g:3162:1: rule__Title__Group__7 : rule__Title__Group__7__Impl ;
    public final void rule__Title__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3166:1: ( rule__Title__Group__7__Impl )
            // InternalVideoMontageSVJD.g:3167:2: rule__Title__Group__7__Impl
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
    // InternalVideoMontageSVJD.g:3173:1: rule__Title__Group__7__Impl : ( '}' ) ;
    public final void rule__Title__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3177:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:3178:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:3178:1: ( '}' )
            // InternalVideoMontageSVJD.g:3179:2: '}'
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
    // InternalVideoMontageSVJD.g:3189:1: rule__Title__Group_3__0 : rule__Title__Group_3__0__Impl rule__Title__Group_3__1 ;
    public final void rule__Title__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3193:1: ( rule__Title__Group_3__0__Impl rule__Title__Group_3__1 )
            // InternalVideoMontageSVJD.g:3194:2: rule__Title__Group_3__0__Impl rule__Title__Group_3__1
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
    // InternalVideoMontageSVJD.g:3201:1: rule__Title__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__Title__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3205:1: ( ( 'duration' ) )
            // InternalVideoMontageSVJD.g:3206:1: ( 'duration' )
            {
            // InternalVideoMontageSVJD.g:3206:1: ( 'duration' )
            // InternalVideoMontageSVJD.g:3207:2: 'duration'
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
    // InternalVideoMontageSVJD.g:3216:1: rule__Title__Group_3__1 : rule__Title__Group_3__1__Impl ;
    public final void rule__Title__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3220:1: ( rule__Title__Group_3__1__Impl )
            // InternalVideoMontageSVJD.g:3221:2: rule__Title__Group_3__1__Impl
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
    // InternalVideoMontageSVJD.g:3227:1: rule__Title__Group_3__1__Impl : ( ( rule__Title__DurationAssignment_3_1 ) ) ;
    public final void rule__Title__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3231:1: ( ( ( rule__Title__DurationAssignment_3_1 ) ) )
            // InternalVideoMontageSVJD.g:3232:1: ( ( rule__Title__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontageSVJD.g:3232:1: ( ( rule__Title__DurationAssignment_3_1 ) )
            // InternalVideoMontageSVJD.g:3233:2: ( rule__Title__DurationAssignment_3_1 )
            {
             before(grammarAccess.getTitleAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontageSVJD.g:3234:2: ( rule__Title__DurationAssignment_3_1 )
            // InternalVideoMontageSVJD.g:3234:3: rule__Title__DurationAssignment_3_1
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
    // InternalVideoMontageSVJD.g:3243:1: rule__Title__Group_4__0 : rule__Title__Group_4__0__Impl rule__Title__Group_4__1 ;
    public final void rule__Title__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3247:1: ( rule__Title__Group_4__0__Impl rule__Title__Group_4__1 )
            // InternalVideoMontageSVJD.g:3248:2: rule__Title__Group_4__0__Impl rule__Title__Group_4__1
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
    // InternalVideoMontageSVJD.g:3255:1: rule__Title__Group_4__0__Impl : ( 'backgroundColor' ) ;
    public final void rule__Title__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3259:1: ( ( 'backgroundColor' ) )
            // InternalVideoMontageSVJD.g:3260:1: ( 'backgroundColor' )
            {
            // InternalVideoMontageSVJD.g:3260:1: ( 'backgroundColor' )
            // InternalVideoMontageSVJD.g:3261:2: 'backgroundColor'
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
    // InternalVideoMontageSVJD.g:3270:1: rule__Title__Group_4__1 : rule__Title__Group_4__1__Impl ;
    public final void rule__Title__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3274:1: ( rule__Title__Group_4__1__Impl )
            // InternalVideoMontageSVJD.g:3275:2: rule__Title__Group_4__1__Impl
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
    // InternalVideoMontageSVJD.g:3281:1: rule__Title__Group_4__1__Impl : ( ( rule__Title__BackgroundColorAssignment_4_1 ) ) ;
    public final void rule__Title__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3285:1: ( ( ( rule__Title__BackgroundColorAssignment_4_1 ) ) )
            // InternalVideoMontageSVJD.g:3286:1: ( ( rule__Title__BackgroundColorAssignment_4_1 ) )
            {
            // InternalVideoMontageSVJD.g:3286:1: ( ( rule__Title__BackgroundColorAssignment_4_1 ) )
            // InternalVideoMontageSVJD.g:3287:2: ( rule__Title__BackgroundColorAssignment_4_1 )
            {
             before(grammarAccess.getTitleAccess().getBackgroundColorAssignment_4_1()); 
            // InternalVideoMontageSVJD.g:3288:2: ( rule__Title__BackgroundColorAssignment_4_1 )
            // InternalVideoMontageSVJD.g:3288:3: rule__Title__BackgroundColorAssignment_4_1
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
    // InternalVideoMontageSVJD.g:3297:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3301:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalVideoMontageSVJD.g:3302:2: rule__Video__Group__0__Impl rule__Video__Group__1
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
    // InternalVideoMontageSVJD.g:3309:1: rule__Video__Group__0__Impl : ( ( rule__Video__NameAssignment_0 ) ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3313:1: ( ( ( rule__Video__NameAssignment_0 ) ) )
            // InternalVideoMontageSVJD.g:3314:1: ( ( rule__Video__NameAssignment_0 ) )
            {
            // InternalVideoMontageSVJD.g:3314:1: ( ( rule__Video__NameAssignment_0 ) )
            // InternalVideoMontageSVJD.g:3315:2: ( rule__Video__NameAssignment_0 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_0()); 
            // InternalVideoMontageSVJD.g:3316:2: ( rule__Video__NameAssignment_0 )
            // InternalVideoMontageSVJD.g:3316:3: rule__Video__NameAssignment_0
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
    // InternalVideoMontageSVJD.g:3324:1: rule__Video__Group__1 : rule__Video__Group__1__Impl ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3328:1: ( rule__Video__Group__1__Impl )
            // InternalVideoMontageSVJD.g:3329:2: rule__Video__Group__1__Impl
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
    // InternalVideoMontageSVJD.g:3335:1: rule__Video__Group__1__Impl : ( ( rule__Video__Group_1__0 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3339:1: ( ( ( rule__Video__Group_1__0 ) ) )
            // InternalVideoMontageSVJD.g:3340:1: ( ( rule__Video__Group_1__0 ) )
            {
            // InternalVideoMontageSVJD.g:3340:1: ( ( rule__Video__Group_1__0 ) )
            // InternalVideoMontageSVJD.g:3341:2: ( rule__Video__Group_1__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup_1()); 
            // InternalVideoMontageSVJD.g:3342:2: ( rule__Video__Group_1__0 )
            // InternalVideoMontageSVJD.g:3342:3: rule__Video__Group_1__0
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
    // InternalVideoMontageSVJD.g:3351:1: rule__Video__Group_1__0 : rule__Video__Group_1__0__Impl rule__Video__Group_1__1 ;
    public final void rule__Video__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3355:1: ( rule__Video__Group_1__0__Impl rule__Video__Group_1__1 )
            // InternalVideoMontageSVJD.g:3356:2: rule__Video__Group_1__0__Impl rule__Video__Group_1__1
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
    // InternalVideoMontageSVJD.g:3363:1: rule__Video__Group_1__0__Impl : ( 'path' ) ;
    public final void rule__Video__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3367:1: ( ( 'path' ) )
            // InternalVideoMontageSVJD.g:3368:1: ( 'path' )
            {
            // InternalVideoMontageSVJD.g:3368:1: ( 'path' )
            // InternalVideoMontageSVJD.g:3369:2: 'path'
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
    // InternalVideoMontageSVJD.g:3378:1: rule__Video__Group_1__1 : rule__Video__Group_1__1__Impl ;
    public final void rule__Video__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3382:1: ( rule__Video__Group_1__1__Impl )
            // InternalVideoMontageSVJD.g:3383:2: rule__Video__Group_1__1__Impl
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
    // InternalVideoMontageSVJD.g:3389:1: rule__Video__Group_1__1__Impl : ( ( rule__Video__PathAssignment_1_1 ) ) ;
    public final void rule__Video__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3393:1: ( ( ( rule__Video__PathAssignment_1_1 ) ) )
            // InternalVideoMontageSVJD.g:3394:1: ( ( rule__Video__PathAssignment_1_1 ) )
            {
            // InternalVideoMontageSVJD.g:3394:1: ( ( rule__Video__PathAssignment_1_1 ) )
            // InternalVideoMontageSVJD.g:3395:2: ( rule__Video__PathAssignment_1_1 )
            {
             before(grammarAccess.getVideoAccess().getPathAssignment_1_1()); 
            // InternalVideoMontageSVJD.g:3396:2: ( rule__Video__PathAssignment_1_1 )
            // InternalVideoMontageSVJD.g:3396:3: rule__Video__PathAssignment_1_1
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
    // InternalVideoMontageSVJD.g:3405:1: rule__RelativeMoment__Group__0 : rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1 ;
    public final void rule__RelativeMoment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3409:1: ( rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1 )
            // InternalVideoMontageSVJD.g:3410:2: rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1
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
    // InternalVideoMontageSVJD.g:3417:1: rule__RelativeMoment__Group__0__Impl : ( () ) ;
    public final void rule__RelativeMoment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3421:1: ( ( () ) )
            // InternalVideoMontageSVJD.g:3422:1: ( () )
            {
            // InternalVideoMontageSVJD.g:3422:1: ( () )
            // InternalVideoMontageSVJD.g:3423:2: ()
            {
             before(grammarAccess.getRelativeMomentAccess().getRelativeMomentAction_0()); 
            // InternalVideoMontageSVJD.g:3424:2: ()
            // InternalVideoMontageSVJD.g:3424:3: 
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
    // InternalVideoMontageSVJD.g:3432:1: rule__RelativeMoment__Group__1 : rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2 ;
    public final void rule__RelativeMoment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3436:1: ( rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2 )
            // InternalVideoMontageSVJD.g:3437:2: rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2
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
    // InternalVideoMontageSVJD.g:3444:1: rule__RelativeMoment__Group__1__Impl : ( ( rule__RelativeMoment__MomentAssignment_1 )? ) ;
    public final void rule__RelativeMoment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3448:1: ( ( ( rule__RelativeMoment__MomentAssignment_1 )? ) )
            // InternalVideoMontageSVJD.g:3449:1: ( ( rule__RelativeMoment__MomentAssignment_1 )? )
            {
            // InternalVideoMontageSVJD.g:3449:1: ( ( rule__RelativeMoment__MomentAssignment_1 )? )
            // InternalVideoMontageSVJD.g:3450:2: ( rule__RelativeMoment__MomentAssignment_1 )?
            {
             before(grammarAccess.getRelativeMomentAccess().getMomentAssignment_1()); 
            // InternalVideoMontageSVJD.g:3451:2: ( rule__RelativeMoment__MomentAssignment_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=17 && LA26_0<=18)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVideoMontageSVJD.g:3451:3: rule__RelativeMoment__MomentAssignment_1
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
    // InternalVideoMontageSVJD.g:3459:1: rule__RelativeMoment__Group__2 : rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3 ;
    public final void rule__RelativeMoment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3463:1: ( rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3 )
            // InternalVideoMontageSVJD.g:3464:2: rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3
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
    // InternalVideoMontageSVJD.g:3471:1: rule__RelativeMoment__Group__2__Impl : ( 'of' ) ;
    public final void rule__RelativeMoment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3475:1: ( ( 'of' ) )
            // InternalVideoMontageSVJD.g:3476:1: ( 'of' )
            {
            // InternalVideoMontageSVJD.g:3476:1: ( 'of' )
            // InternalVideoMontageSVJD.g:3477:2: 'of'
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
    // InternalVideoMontageSVJD.g:3486:1: rule__RelativeMoment__Group__3 : rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4 ;
    public final void rule__RelativeMoment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3490:1: ( rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4 )
            // InternalVideoMontageSVJD.g:3491:2: rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4
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
    // InternalVideoMontageSVJD.g:3498:1: rule__RelativeMoment__Group__3__Impl : ( ( rule__RelativeMoment__ElementAssignment_3 ) ) ;
    public final void rule__RelativeMoment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3502:1: ( ( ( rule__RelativeMoment__ElementAssignment_3 ) ) )
            // InternalVideoMontageSVJD.g:3503:1: ( ( rule__RelativeMoment__ElementAssignment_3 ) )
            {
            // InternalVideoMontageSVJD.g:3503:1: ( ( rule__RelativeMoment__ElementAssignment_3 ) )
            // InternalVideoMontageSVJD.g:3504:2: ( rule__RelativeMoment__ElementAssignment_3 )
            {
             before(grammarAccess.getRelativeMomentAccess().getElementAssignment_3()); 
            // InternalVideoMontageSVJD.g:3505:2: ( rule__RelativeMoment__ElementAssignment_3 )
            // InternalVideoMontageSVJD.g:3505:3: rule__RelativeMoment__ElementAssignment_3
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
    // InternalVideoMontageSVJD.g:3513:1: rule__RelativeMoment__Group__4 : rule__RelativeMoment__Group__4__Impl ;
    public final void rule__RelativeMoment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3517:1: ( rule__RelativeMoment__Group__4__Impl )
            // InternalVideoMontageSVJD.g:3518:2: rule__RelativeMoment__Group__4__Impl
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
    // InternalVideoMontageSVJD.g:3524:1: rule__RelativeMoment__Group__4__Impl : ( ( rule__RelativeMoment__Group_4__0 )? ) ;
    public final void rule__RelativeMoment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3528:1: ( ( ( rule__RelativeMoment__Group_4__0 )? ) )
            // InternalVideoMontageSVJD.g:3529:1: ( ( rule__RelativeMoment__Group_4__0 )? )
            {
            // InternalVideoMontageSVJD.g:3529:1: ( ( rule__RelativeMoment__Group_4__0 )? )
            // InternalVideoMontageSVJD.g:3530:2: ( rule__RelativeMoment__Group_4__0 )?
            {
             before(grammarAccess.getRelativeMomentAccess().getGroup_4()); 
            // InternalVideoMontageSVJD.g:3531:2: ( rule__RelativeMoment__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=15 && LA27_0<=16)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVideoMontageSVJD.g:3531:3: rule__RelativeMoment__Group_4__0
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
    // InternalVideoMontageSVJD.g:3540:1: rule__RelativeMoment__Group_4__0 : rule__RelativeMoment__Group_4__0__Impl rule__RelativeMoment__Group_4__1 ;
    public final void rule__RelativeMoment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3544:1: ( rule__RelativeMoment__Group_4__0__Impl rule__RelativeMoment__Group_4__1 )
            // InternalVideoMontageSVJD.g:3545:2: rule__RelativeMoment__Group_4__0__Impl rule__RelativeMoment__Group_4__1
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
    // InternalVideoMontageSVJD.g:3552:1: rule__RelativeMoment__Group_4__0__Impl : ( ( rule__RelativeMoment__OperationMomentAssignment_4_0 ) ) ;
    public final void rule__RelativeMoment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3556:1: ( ( ( rule__RelativeMoment__OperationMomentAssignment_4_0 ) ) )
            // InternalVideoMontageSVJD.g:3557:1: ( ( rule__RelativeMoment__OperationMomentAssignment_4_0 ) )
            {
            // InternalVideoMontageSVJD.g:3557:1: ( ( rule__RelativeMoment__OperationMomentAssignment_4_0 ) )
            // InternalVideoMontageSVJD.g:3558:2: ( rule__RelativeMoment__OperationMomentAssignment_4_0 )
            {
             before(grammarAccess.getRelativeMomentAccess().getOperationMomentAssignment_4_0()); 
            // InternalVideoMontageSVJD.g:3559:2: ( rule__RelativeMoment__OperationMomentAssignment_4_0 )
            // InternalVideoMontageSVJD.g:3559:3: rule__RelativeMoment__OperationMomentAssignment_4_0
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
    // InternalVideoMontageSVJD.g:3567:1: rule__RelativeMoment__Group_4__1 : rule__RelativeMoment__Group_4__1__Impl ;
    public final void rule__RelativeMoment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3571:1: ( rule__RelativeMoment__Group_4__1__Impl )
            // InternalVideoMontageSVJD.g:3572:2: rule__RelativeMoment__Group_4__1__Impl
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
    // InternalVideoMontageSVJD.g:3578:1: rule__RelativeMoment__Group_4__1__Impl : ( ( rule__RelativeMoment__ValueAssignment_4_1 ) ) ;
    public final void rule__RelativeMoment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3582:1: ( ( ( rule__RelativeMoment__ValueAssignment_4_1 ) ) )
            // InternalVideoMontageSVJD.g:3583:1: ( ( rule__RelativeMoment__ValueAssignment_4_1 ) )
            {
            // InternalVideoMontageSVJD.g:3583:1: ( ( rule__RelativeMoment__ValueAssignment_4_1 ) )
            // InternalVideoMontageSVJD.g:3584:2: ( rule__RelativeMoment__ValueAssignment_4_1 )
            {
             before(grammarAccess.getRelativeMomentAccess().getValueAssignment_4_1()); 
            // InternalVideoMontageSVJD.g:3585:2: ( rule__RelativeMoment__ValueAssignment_4_1 )
            // InternalVideoMontageSVJD.g:3585:3: rule__RelativeMoment__ValueAssignment_4_1
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
    // InternalVideoMontageSVJD.g:3594:1: rule__AbsoluteMoment__Group__0 : rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1 ;
    public final void rule__AbsoluteMoment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3598:1: ( rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1 )
            // InternalVideoMontageSVJD.g:3599:2: rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1
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
    // InternalVideoMontageSVJD.g:3606:1: rule__AbsoluteMoment__Group__0__Impl : ( () ) ;
    public final void rule__AbsoluteMoment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3610:1: ( ( () ) )
            // InternalVideoMontageSVJD.g:3611:1: ( () )
            {
            // InternalVideoMontageSVJD.g:3611:1: ( () )
            // InternalVideoMontageSVJD.g:3612:2: ()
            {
             before(grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentAction_0()); 
            // InternalVideoMontageSVJD.g:3613:2: ()
            // InternalVideoMontageSVJD.g:3613:3: 
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
    // InternalVideoMontageSVJD.g:3621:1: rule__AbsoluteMoment__Group__1 : rule__AbsoluteMoment__Group__1__Impl ;
    public final void rule__AbsoluteMoment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3625:1: ( rule__AbsoluteMoment__Group__1__Impl )
            // InternalVideoMontageSVJD.g:3626:2: rule__AbsoluteMoment__Group__1__Impl
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
    // InternalVideoMontageSVJD.g:3632:1: rule__AbsoluteMoment__Group__1__Impl : ( ( rule__AbsoluteMoment__Group_1__0 )? ) ;
    public final void rule__AbsoluteMoment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3636:1: ( ( ( rule__AbsoluteMoment__Group_1__0 )? ) )
            // InternalVideoMontageSVJD.g:3637:1: ( ( rule__AbsoluteMoment__Group_1__0 )? )
            {
            // InternalVideoMontageSVJD.g:3637:1: ( ( rule__AbsoluteMoment__Group_1__0 )? )
            // InternalVideoMontageSVJD.g:3638:2: ( rule__AbsoluteMoment__Group_1__0 )?
            {
             before(grammarAccess.getAbsoluteMomentAccess().getGroup_1()); 
            // InternalVideoMontageSVJD.g:3639:2: ( rule__AbsoluteMoment__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVideoMontageSVJD.g:3639:3: rule__AbsoluteMoment__Group_1__0
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
    // InternalVideoMontageSVJD.g:3648:1: rule__AbsoluteMoment__Group_1__0 : rule__AbsoluteMoment__Group_1__0__Impl rule__AbsoluteMoment__Group_1__1 ;
    public final void rule__AbsoluteMoment__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3652:1: ( rule__AbsoluteMoment__Group_1__0__Impl rule__AbsoluteMoment__Group_1__1 )
            // InternalVideoMontageSVJD.g:3653:2: rule__AbsoluteMoment__Group_1__0__Impl rule__AbsoluteMoment__Group_1__1
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
    // InternalVideoMontageSVJD.g:3660:1: rule__AbsoluteMoment__Group_1__0__Impl : ( 'time' ) ;
    public final void rule__AbsoluteMoment__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3664:1: ( ( 'time' ) )
            // InternalVideoMontageSVJD.g:3665:1: ( 'time' )
            {
            // InternalVideoMontageSVJD.g:3665:1: ( 'time' )
            // InternalVideoMontageSVJD.g:3666:2: 'time'
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
    // InternalVideoMontageSVJD.g:3675:1: rule__AbsoluteMoment__Group_1__1 : rule__AbsoluteMoment__Group_1__1__Impl ;
    public final void rule__AbsoluteMoment__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3679:1: ( rule__AbsoluteMoment__Group_1__1__Impl )
            // InternalVideoMontageSVJD.g:3680:2: rule__AbsoluteMoment__Group_1__1__Impl
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
    // InternalVideoMontageSVJD.g:3686:1: rule__AbsoluteMoment__Group_1__1__Impl : ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) ) ;
    public final void rule__AbsoluteMoment__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3690:1: ( ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) ) )
            // InternalVideoMontageSVJD.g:3691:1: ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) )
            {
            // InternalVideoMontageSVJD.g:3691:1: ( ( rule__AbsoluteMoment__TimeAssignment_1_1 ) )
            // InternalVideoMontageSVJD.g:3692:2: ( rule__AbsoluteMoment__TimeAssignment_1_1 )
            {
             before(grammarAccess.getAbsoluteMomentAccess().getTimeAssignment_1_1()); 
            // InternalVideoMontageSVJD.g:3693:2: ( rule__AbsoluteMoment__TimeAssignment_1_1 )
            // InternalVideoMontageSVJD.g:3693:3: rule__AbsoluteMoment__TimeAssignment_1_1
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
    // InternalVideoMontageSVJD.g:3702:1: rule__StartingMoment_Impl__Group__0 : rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1 ;
    public final void rule__StartingMoment_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3706:1: ( rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1 )
            // InternalVideoMontageSVJD.g:3707:2: rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1
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
    // InternalVideoMontageSVJD.g:3714:1: rule__StartingMoment_Impl__Group__0__Impl : ( () ) ;
    public final void rule__StartingMoment_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3718:1: ( ( () ) )
            // InternalVideoMontageSVJD.g:3719:1: ( () )
            {
            // InternalVideoMontageSVJD.g:3719:1: ( () )
            // InternalVideoMontageSVJD.g:3720:2: ()
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getStartingMomentAction_0()); 
            // InternalVideoMontageSVJD.g:3721:2: ()
            // InternalVideoMontageSVJD.g:3721:3: 
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
    // InternalVideoMontageSVJD.g:3729:1: rule__StartingMoment_Impl__Group__1 : rule__StartingMoment_Impl__Group__1__Impl ;
    public final void rule__StartingMoment_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3733:1: ( rule__StartingMoment_Impl__Group__1__Impl )
            // InternalVideoMontageSVJD.g:3734:2: rule__StartingMoment_Impl__Group__1__Impl
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
    // InternalVideoMontageSVJD.g:3740:1: rule__StartingMoment_Impl__Group__1__Impl : ( 'StartingMoment' ) ;
    public final void rule__StartingMoment_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3744:1: ( ( 'StartingMoment' ) )
            // InternalVideoMontageSVJD.g:3745:1: ( 'StartingMoment' )
            {
            // InternalVideoMontageSVJD.g:3745:1: ( 'StartingMoment' )
            // InternalVideoMontageSVJD.g:3746:2: 'StartingMoment'
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
    // InternalVideoMontageSVJD.g:3756:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3760:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalVideoMontageSVJD.g:3761:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
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
    // InternalVideoMontageSVJD.g:3768:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3772:1: ( ( 'Transition' ) )
            // InternalVideoMontageSVJD.g:3773:1: ( 'Transition' )
            {
            // InternalVideoMontageSVJD.g:3773:1: ( 'Transition' )
            // InternalVideoMontageSVJD.g:3774:2: 'Transition'
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
    // InternalVideoMontageSVJD.g:3783:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3787:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalVideoMontageSVJD.g:3788:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
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
    // InternalVideoMontageSVJD.g:3795:1: rule__Transition__Group__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3799:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:3800:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:3800:1: ( '{' )
            // InternalVideoMontageSVJD.g:3801:2: '{'
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
    // InternalVideoMontageSVJD.g:3810:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3814:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalVideoMontageSVJD.g:3815:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
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
    // InternalVideoMontageSVJD.g:3822:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3826:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalVideoMontageSVJD.g:3827:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalVideoMontageSVJD.g:3827:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalVideoMontageSVJD.g:3828:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalVideoMontageSVJD.g:3829:2: ( rule__Transition__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVideoMontageSVJD.g:3829:3: rule__Transition__Group_2__0
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
    // InternalVideoMontageSVJD.g:3837:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3841:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalVideoMontageSVJD.g:3842:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
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
    // InternalVideoMontageSVJD.g:3849:1: rule__Transition__Group__3__Impl : ( 'audioElement' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3853:1: ( ( 'audioElement' ) )
            // InternalVideoMontageSVJD.g:3854:1: ( 'audioElement' )
            {
            // InternalVideoMontageSVJD.g:3854:1: ( 'audioElement' )
            // InternalVideoMontageSVJD.g:3855:2: 'audioElement'
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
    // InternalVideoMontageSVJD.g:3864:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3868:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalVideoMontageSVJD.g:3869:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
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
    // InternalVideoMontageSVJD.g:3876:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__AudioelementAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3880:1: ( ( ( rule__Transition__AudioelementAssignment_4 ) ) )
            // InternalVideoMontageSVJD.g:3881:1: ( ( rule__Transition__AudioelementAssignment_4 ) )
            {
            // InternalVideoMontageSVJD.g:3881:1: ( ( rule__Transition__AudioelementAssignment_4 ) )
            // InternalVideoMontageSVJD.g:3882:2: ( rule__Transition__AudioelementAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getAudioelementAssignment_4()); 
            // InternalVideoMontageSVJD.g:3883:2: ( rule__Transition__AudioelementAssignment_4 )
            // InternalVideoMontageSVJD.g:3883:3: rule__Transition__AudioelementAssignment_4
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
    // InternalVideoMontageSVJD.g:3891:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3895:1: ( rule__Transition__Group__5__Impl )
            // InternalVideoMontageSVJD.g:3896:2: rule__Transition__Group__5__Impl
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
    // InternalVideoMontageSVJD.g:3902:1: rule__Transition__Group__5__Impl : ( '}' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3906:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:3907:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:3907:1: ( '}' )
            // InternalVideoMontageSVJD.g:3908:2: '}'
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
    // InternalVideoMontageSVJD.g:3918:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3922:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalVideoMontageSVJD.g:3923:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
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
    // InternalVideoMontageSVJD.g:3930:1: rule__Transition__Group_2__0__Impl : ( 'duration' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3934:1: ( ( 'duration' ) )
            // InternalVideoMontageSVJD.g:3935:1: ( 'duration' )
            {
            // InternalVideoMontageSVJD.g:3935:1: ( 'duration' )
            // InternalVideoMontageSVJD.g:3936:2: 'duration'
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
    // InternalVideoMontageSVJD.g:3945:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3949:1: ( rule__Transition__Group_2__1__Impl )
            // InternalVideoMontageSVJD.g:3950:2: rule__Transition__Group_2__1__Impl
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
    // InternalVideoMontageSVJD.g:3956:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__DurationAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3960:1: ( ( ( rule__Transition__DurationAssignment_2_1 ) ) )
            // InternalVideoMontageSVJD.g:3961:1: ( ( rule__Transition__DurationAssignment_2_1 ) )
            {
            // InternalVideoMontageSVJD.g:3961:1: ( ( rule__Transition__DurationAssignment_2_1 ) )
            // InternalVideoMontageSVJD.g:3962:2: ( rule__Transition__DurationAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getDurationAssignment_2_1()); 
            // InternalVideoMontageSVJD.g:3963:2: ( rule__Transition__DurationAssignment_2_1 )
            // InternalVideoMontageSVJD.g:3963:3: rule__Transition__DurationAssignment_2_1
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
    // InternalVideoMontageSVJD.g:3972:1: rule__TextArea_Impl__Group__0 : rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1 ;
    public final void rule__TextArea_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3976:1: ( rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1 )
            // InternalVideoMontageSVJD.g:3977:2: rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1
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
    // InternalVideoMontageSVJD.g:3984:1: rule__TextArea_Impl__Group__0__Impl : ( 'TextArea' ) ;
    public final void rule__TextArea_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:3988:1: ( ( 'TextArea' ) )
            // InternalVideoMontageSVJD.g:3989:1: ( 'TextArea' )
            {
            // InternalVideoMontageSVJD.g:3989:1: ( 'TextArea' )
            // InternalVideoMontageSVJD.g:3990:2: 'TextArea'
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
    // InternalVideoMontageSVJD.g:3999:1: rule__TextArea_Impl__Group__1 : rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2 ;
    public final void rule__TextArea_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4003:1: ( rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2 )
            // InternalVideoMontageSVJD.g:4004:2: rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2
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
    // InternalVideoMontageSVJD.g:4011:1: rule__TextArea_Impl__Group__1__Impl : ( '{' ) ;
    public final void rule__TextArea_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4015:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:4016:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:4016:1: ( '{' )
            // InternalVideoMontageSVJD.g:4017:2: '{'
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
    // InternalVideoMontageSVJD.g:4026:1: rule__TextArea_Impl__Group__2 : rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3 ;
    public final void rule__TextArea_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4030:1: ( rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3 )
            // InternalVideoMontageSVJD.g:4031:2: rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3
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
    // InternalVideoMontageSVJD.g:4038:1: rule__TextArea_Impl__Group__2__Impl : ( ( rule__TextArea_Impl__Group_2__0 )? ) ;
    public final void rule__TextArea_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4042:1: ( ( ( rule__TextArea_Impl__Group_2__0 )? ) )
            // InternalVideoMontageSVJD.g:4043:1: ( ( rule__TextArea_Impl__Group_2__0 )? )
            {
            // InternalVideoMontageSVJD.g:4043:1: ( ( rule__TextArea_Impl__Group_2__0 )? )
            // InternalVideoMontageSVJD.g:4044:2: ( rule__TextArea_Impl__Group_2__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_2()); 
            // InternalVideoMontageSVJD.g:4045:2: ( rule__TextArea_Impl__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4045:3: rule__TextArea_Impl__Group_2__0
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
    // InternalVideoMontageSVJD.g:4053:1: rule__TextArea_Impl__Group__3 : rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4 ;
    public final void rule__TextArea_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4057:1: ( rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4 )
            // InternalVideoMontageSVJD.g:4058:2: rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4
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
    // InternalVideoMontageSVJD.g:4065:1: rule__TextArea_Impl__Group__3__Impl : ( ( rule__TextArea_Impl__Group_3__0 )? ) ;
    public final void rule__TextArea_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4069:1: ( ( ( rule__TextArea_Impl__Group_3__0 )? ) )
            // InternalVideoMontageSVJD.g:4070:1: ( ( rule__TextArea_Impl__Group_3__0 )? )
            {
            // InternalVideoMontageSVJD.g:4070:1: ( ( rule__TextArea_Impl__Group_3__0 )? )
            // InternalVideoMontageSVJD.g:4071:2: ( rule__TextArea_Impl__Group_3__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_3()); 
            // InternalVideoMontageSVJD.g:4072:2: ( rule__TextArea_Impl__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4072:3: rule__TextArea_Impl__Group_3__0
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
    // InternalVideoMontageSVJD.g:4080:1: rule__TextArea_Impl__Group__4 : rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5 ;
    public final void rule__TextArea_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4084:1: ( rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5 )
            // InternalVideoMontageSVJD.g:4085:2: rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5
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
    // InternalVideoMontageSVJD.g:4092:1: rule__TextArea_Impl__Group__4__Impl : ( ( rule__TextArea_Impl__Group_4__0 )? ) ;
    public final void rule__TextArea_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4096:1: ( ( ( rule__TextArea_Impl__Group_4__0 )? ) )
            // InternalVideoMontageSVJD.g:4097:1: ( ( rule__TextArea_Impl__Group_4__0 )? )
            {
            // InternalVideoMontageSVJD.g:4097:1: ( ( rule__TextArea_Impl__Group_4__0 )? )
            // InternalVideoMontageSVJD.g:4098:2: ( rule__TextArea_Impl__Group_4__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_4()); 
            // InternalVideoMontageSVJD.g:4099:2: ( rule__TextArea_Impl__Group_4__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4099:3: rule__TextArea_Impl__Group_4__0
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
    // InternalVideoMontageSVJD.g:4107:1: rule__TextArea_Impl__Group__5 : rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6 ;
    public final void rule__TextArea_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4111:1: ( rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6 )
            // InternalVideoMontageSVJD.g:4112:2: rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6
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
    // InternalVideoMontageSVJD.g:4119:1: rule__TextArea_Impl__Group__5__Impl : ( ( rule__TextArea_Impl__Group_5__0 )? ) ;
    public final void rule__TextArea_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4123:1: ( ( ( rule__TextArea_Impl__Group_5__0 )? ) )
            // InternalVideoMontageSVJD.g:4124:1: ( ( rule__TextArea_Impl__Group_5__0 )? )
            {
            // InternalVideoMontageSVJD.g:4124:1: ( ( rule__TextArea_Impl__Group_5__0 )? )
            // InternalVideoMontageSVJD.g:4125:2: ( rule__TextArea_Impl__Group_5__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_5()); 
            // InternalVideoMontageSVJD.g:4126:2: ( rule__TextArea_Impl__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4126:3: rule__TextArea_Impl__Group_5__0
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
    // InternalVideoMontageSVJD.g:4134:1: rule__TextArea_Impl__Group__6 : rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7 ;
    public final void rule__TextArea_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4138:1: ( rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7 )
            // InternalVideoMontageSVJD.g:4139:2: rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7
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
    // InternalVideoMontageSVJD.g:4146:1: rule__TextArea_Impl__Group__6__Impl : ( ( rule__TextArea_Impl__Group_6__0 ) ) ;
    public final void rule__TextArea_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4150:1: ( ( ( rule__TextArea_Impl__Group_6__0 ) ) )
            // InternalVideoMontageSVJD.g:4151:1: ( ( rule__TextArea_Impl__Group_6__0 ) )
            {
            // InternalVideoMontageSVJD.g:4151:1: ( ( rule__TextArea_Impl__Group_6__0 ) )
            // InternalVideoMontageSVJD.g:4152:2: ( rule__TextArea_Impl__Group_6__0 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_6()); 
            // InternalVideoMontageSVJD.g:4153:2: ( rule__TextArea_Impl__Group_6__0 )
            // InternalVideoMontageSVJD.g:4153:3: rule__TextArea_Impl__Group_6__0
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
    // InternalVideoMontageSVJD.g:4161:1: rule__TextArea_Impl__Group__7 : rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8 ;
    public final void rule__TextArea_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4165:1: ( rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8 )
            // InternalVideoMontageSVJD.g:4166:2: rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8
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
    // InternalVideoMontageSVJD.g:4173:1: rule__TextArea_Impl__Group__7__Impl : ( ( rule__TextArea_Impl__Group_7__0 )? ) ;
    public final void rule__TextArea_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4177:1: ( ( ( rule__TextArea_Impl__Group_7__0 )? ) )
            // InternalVideoMontageSVJD.g:4178:1: ( ( rule__TextArea_Impl__Group_7__0 )? )
            {
            // InternalVideoMontageSVJD.g:4178:1: ( ( rule__TextArea_Impl__Group_7__0 )? )
            // InternalVideoMontageSVJD.g:4179:2: ( rule__TextArea_Impl__Group_7__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_7()); 
            // InternalVideoMontageSVJD.g:4180:2: ( rule__TextArea_Impl__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4180:3: rule__TextArea_Impl__Group_7__0
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
    // InternalVideoMontageSVJD.g:4188:1: rule__TextArea_Impl__Group__8 : rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9 ;
    public final void rule__TextArea_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4192:1: ( rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9 )
            // InternalVideoMontageSVJD.g:4193:2: rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9
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
    // InternalVideoMontageSVJD.g:4200:1: rule__TextArea_Impl__Group__8__Impl : ( ( rule__TextArea_Impl__Group_8__0 )? ) ;
    public final void rule__TextArea_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4204:1: ( ( ( rule__TextArea_Impl__Group_8__0 )? ) )
            // InternalVideoMontageSVJD.g:4205:1: ( ( rule__TextArea_Impl__Group_8__0 )? )
            {
            // InternalVideoMontageSVJD.g:4205:1: ( ( rule__TextArea_Impl__Group_8__0 )? )
            // InternalVideoMontageSVJD.g:4206:2: ( rule__TextArea_Impl__Group_8__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_8()); 
            // InternalVideoMontageSVJD.g:4207:2: ( rule__TextArea_Impl__Group_8__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==53) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4207:3: rule__TextArea_Impl__Group_8__0
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
    // InternalVideoMontageSVJD.g:4215:1: rule__TextArea_Impl__Group__9 : rule__TextArea_Impl__Group__9__Impl ;
    public final void rule__TextArea_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4219:1: ( rule__TextArea_Impl__Group__9__Impl )
            // InternalVideoMontageSVJD.g:4220:2: rule__TextArea_Impl__Group__9__Impl
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
    // InternalVideoMontageSVJD.g:4226:1: rule__TextArea_Impl__Group__9__Impl : ( '}' ) ;
    public final void rule__TextArea_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4230:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:4231:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:4231:1: ( '}' )
            // InternalVideoMontageSVJD.g:4232:2: '}'
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
    // InternalVideoMontageSVJD.g:4242:1: rule__TextArea_Impl__Group_2__0 : rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1 ;
    public final void rule__TextArea_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4246:1: ( rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1 )
            // InternalVideoMontageSVJD.g:4247:2: rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1
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
    // InternalVideoMontageSVJD.g:4254:1: rule__TextArea_Impl__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__TextArea_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4258:1: ( ( 'x' ) )
            // InternalVideoMontageSVJD.g:4259:1: ( 'x' )
            {
            // InternalVideoMontageSVJD.g:4259:1: ( 'x' )
            // InternalVideoMontageSVJD.g:4260:2: 'x'
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
    // InternalVideoMontageSVJD.g:4269:1: rule__TextArea_Impl__Group_2__1 : rule__TextArea_Impl__Group_2__1__Impl ;
    public final void rule__TextArea_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4273:1: ( rule__TextArea_Impl__Group_2__1__Impl )
            // InternalVideoMontageSVJD.g:4274:2: rule__TextArea_Impl__Group_2__1__Impl
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
    // InternalVideoMontageSVJD.g:4280:1: rule__TextArea_Impl__Group_2__1__Impl : ( ( rule__TextArea_Impl__XAssignment_2_1 ) ) ;
    public final void rule__TextArea_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4284:1: ( ( ( rule__TextArea_Impl__XAssignment_2_1 ) ) )
            // InternalVideoMontageSVJD.g:4285:1: ( ( rule__TextArea_Impl__XAssignment_2_1 ) )
            {
            // InternalVideoMontageSVJD.g:4285:1: ( ( rule__TextArea_Impl__XAssignment_2_1 ) )
            // InternalVideoMontageSVJD.g:4286:2: ( rule__TextArea_Impl__XAssignment_2_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getXAssignment_2_1()); 
            // InternalVideoMontageSVJD.g:4287:2: ( rule__TextArea_Impl__XAssignment_2_1 )
            // InternalVideoMontageSVJD.g:4287:3: rule__TextArea_Impl__XAssignment_2_1
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
    // InternalVideoMontageSVJD.g:4296:1: rule__TextArea_Impl__Group_3__0 : rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1 ;
    public final void rule__TextArea_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4300:1: ( rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1 )
            // InternalVideoMontageSVJD.g:4301:2: rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1
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
    // InternalVideoMontageSVJD.g:4308:1: rule__TextArea_Impl__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__TextArea_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4312:1: ( ( 'y' ) )
            // InternalVideoMontageSVJD.g:4313:1: ( 'y' )
            {
            // InternalVideoMontageSVJD.g:4313:1: ( 'y' )
            // InternalVideoMontageSVJD.g:4314:2: 'y'
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
    // InternalVideoMontageSVJD.g:4323:1: rule__TextArea_Impl__Group_3__1 : rule__TextArea_Impl__Group_3__1__Impl ;
    public final void rule__TextArea_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4327:1: ( rule__TextArea_Impl__Group_3__1__Impl )
            // InternalVideoMontageSVJD.g:4328:2: rule__TextArea_Impl__Group_3__1__Impl
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
    // InternalVideoMontageSVJD.g:4334:1: rule__TextArea_Impl__Group_3__1__Impl : ( ( rule__TextArea_Impl__YAssignment_3_1 ) ) ;
    public final void rule__TextArea_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4338:1: ( ( ( rule__TextArea_Impl__YAssignment_3_1 ) ) )
            // InternalVideoMontageSVJD.g:4339:1: ( ( rule__TextArea_Impl__YAssignment_3_1 ) )
            {
            // InternalVideoMontageSVJD.g:4339:1: ( ( rule__TextArea_Impl__YAssignment_3_1 ) )
            // InternalVideoMontageSVJD.g:4340:2: ( rule__TextArea_Impl__YAssignment_3_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getYAssignment_3_1()); 
            // InternalVideoMontageSVJD.g:4341:2: ( rule__TextArea_Impl__YAssignment_3_1 )
            // InternalVideoMontageSVJD.g:4341:3: rule__TextArea_Impl__YAssignment_3_1
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
    // InternalVideoMontageSVJD.g:4350:1: rule__TextArea_Impl__Group_4__0 : rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1 ;
    public final void rule__TextArea_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4354:1: ( rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1 )
            // InternalVideoMontageSVJD.g:4355:2: rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1
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
    // InternalVideoMontageSVJD.g:4362:1: rule__TextArea_Impl__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__TextArea_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4366:1: ( ( 'width' ) )
            // InternalVideoMontageSVJD.g:4367:1: ( 'width' )
            {
            // InternalVideoMontageSVJD.g:4367:1: ( 'width' )
            // InternalVideoMontageSVJD.g:4368:2: 'width'
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
    // InternalVideoMontageSVJD.g:4377:1: rule__TextArea_Impl__Group_4__1 : rule__TextArea_Impl__Group_4__1__Impl ;
    public final void rule__TextArea_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4381:1: ( rule__TextArea_Impl__Group_4__1__Impl )
            // InternalVideoMontageSVJD.g:4382:2: rule__TextArea_Impl__Group_4__1__Impl
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
    // InternalVideoMontageSVJD.g:4388:1: rule__TextArea_Impl__Group_4__1__Impl : ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) ) ;
    public final void rule__TextArea_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4392:1: ( ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) ) )
            // InternalVideoMontageSVJD.g:4393:1: ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) )
            {
            // InternalVideoMontageSVJD.g:4393:1: ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) )
            // InternalVideoMontageSVJD.g:4394:2: ( rule__TextArea_Impl__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getWidthAssignment_4_1()); 
            // InternalVideoMontageSVJD.g:4395:2: ( rule__TextArea_Impl__WidthAssignment_4_1 )
            // InternalVideoMontageSVJD.g:4395:3: rule__TextArea_Impl__WidthAssignment_4_1
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
    // InternalVideoMontageSVJD.g:4404:1: rule__TextArea_Impl__Group_5__0 : rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1 ;
    public final void rule__TextArea_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4408:1: ( rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1 )
            // InternalVideoMontageSVJD.g:4409:2: rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1
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
    // InternalVideoMontageSVJD.g:4416:1: rule__TextArea_Impl__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__TextArea_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4420:1: ( ( 'height' ) )
            // InternalVideoMontageSVJD.g:4421:1: ( 'height' )
            {
            // InternalVideoMontageSVJD.g:4421:1: ( 'height' )
            // InternalVideoMontageSVJD.g:4422:2: 'height'
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
    // InternalVideoMontageSVJD.g:4431:1: rule__TextArea_Impl__Group_5__1 : rule__TextArea_Impl__Group_5__1__Impl ;
    public final void rule__TextArea_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4435:1: ( rule__TextArea_Impl__Group_5__1__Impl )
            // InternalVideoMontageSVJD.g:4436:2: rule__TextArea_Impl__Group_5__1__Impl
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
    // InternalVideoMontageSVJD.g:4442:1: rule__TextArea_Impl__Group_5__1__Impl : ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) ) ;
    public final void rule__TextArea_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4446:1: ( ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) ) )
            // InternalVideoMontageSVJD.g:4447:1: ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) )
            {
            // InternalVideoMontageSVJD.g:4447:1: ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) )
            // InternalVideoMontageSVJD.g:4448:2: ( rule__TextArea_Impl__HeightAssignment_5_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getHeightAssignment_5_1()); 
            // InternalVideoMontageSVJD.g:4449:2: ( rule__TextArea_Impl__HeightAssignment_5_1 )
            // InternalVideoMontageSVJD.g:4449:3: rule__TextArea_Impl__HeightAssignment_5_1
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
    // InternalVideoMontageSVJD.g:4458:1: rule__TextArea_Impl__Group_6__0 : rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1 ;
    public final void rule__TextArea_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4462:1: ( rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1 )
            // InternalVideoMontageSVJD.g:4463:2: rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1
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
    // InternalVideoMontageSVJD.g:4470:1: rule__TextArea_Impl__Group_6__0__Impl : ( 'text' ) ;
    public final void rule__TextArea_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4474:1: ( ( 'text' ) )
            // InternalVideoMontageSVJD.g:4475:1: ( 'text' )
            {
            // InternalVideoMontageSVJD.g:4475:1: ( 'text' )
            // InternalVideoMontageSVJD.g:4476:2: 'text'
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
    // InternalVideoMontageSVJD.g:4485:1: rule__TextArea_Impl__Group_6__1 : rule__TextArea_Impl__Group_6__1__Impl ;
    public final void rule__TextArea_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4489:1: ( rule__TextArea_Impl__Group_6__1__Impl )
            // InternalVideoMontageSVJD.g:4490:2: rule__TextArea_Impl__Group_6__1__Impl
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
    // InternalVideoMontageSVJD.g:4496:1: rule__TextArea_Impl__Group_6__1__Impl : ( ( rule__TextArea_Impl__TextAssignment_6_1 ) ) ;
    public final void rule__TextArea_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4500:1: ( ( ( rule__TextArea_Impl__TextAssignment_6_1 ) ) )
            // InternalVideoMontageSVJD.g:4501:1: ( ( rule__TextArea_Impl__TextAssignment_6_1 ) )
            {
            // InternalVideoMontageSVJD.g:4501:1: ( ( rule__TextArea_Impl__TextAssignment_6_1 ) )
            // InternalVideoMontageSVJD.g:4502:2: ( rule__TextArea_Impl__TextAssignment_6_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getTextAssignment_6_1()); 
            // InternalVideoMontageSVJD.g:4503:2: ( rule__TextArea_Impl__TextAssignment_6_1 )
            // InternalVideoMontageSVJD.g:4503:3: rule__TextArea_Impl__TextAssignment_6_1
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
    // InternalVideoMontageSVJD.g:4512:1: rule__TextArea_Impl__Group_7__0 : rule__TextArea_Impl__Group_7__0__Impl rule__TextArea_Impl__Group_7__1 ;
    public final void rule__TextArea_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4516:1: ( rule__TextArea_Impl__Group_7__0__Impl rule__TextArea_Impl__Group_7__1 )
            // InternalVideoMontageSVJD.g:4517:2: rule__TextArea_Impl__Group_7__0__Impl rule__TextArea_Impl__Group_7__1
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
    // InternalVideoMontageSVJD.g:4524:1: rule__TextArea_Impl__Group_7__0__Impl : ( 'font' ) ;
    public final void rule__TextArea_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4528:1: ( ( 'font' ) )
            // InternalVideoMontageSVJD.g:4529:1: ( 'font' )
            {
            // InternalVideoMontageSVJD.g:4529:1: ( 'font' )
            // InternalVideoMontageSVJD.g:4530:2: 'font'
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
    // InternalVideoMontageSVJD.g:4539:1: rule__TextArea_Impl__Group_7__1 : rule__TextArea_Impl__Group_7__1__Impl ;
    public final void rule__TextArea_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4543:1: ( rule__TextArea_Impl__Group_7__1__Impl )
            // InternalVideoMontageSVJD.g:4544:2: rule__TextArea_Impl__Group_7__1__Impl
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
    // InternalVideoMontageSVJD.g:4550:1: rule__TextArea_Impl__Group_7__1__Impl : ( ( rule__TextArea_Impl__FontAssignment_7_1 ) ) ;
    public final void rule__TextArea_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4554:1: ( ( ( rule__TextArea_Impl__FontAssignment_7_1 ) ) )
            // InternalVideoMontageSVJD.g:4555:1: ( ( rule__TextArea_Impl__FontAssignment_7_1 ) )
            {
            // InternalVideoMontageSVJD.g:4555:1: ( ( rule__TextArea_Impl__FontAssignment_7_1 ) )
            // InternalVideoMontageSVJD.g:4556:2: ( rule__TextArea_Impl__FontAssignment_7_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontAssignment_7_1()); 
            // InternalVideoMontageSVJD.g:4557:2: ( rule__TextArea_Impl__FontAssignment_7_1 )
            // InternalVideoMontageSVJD.g:4557:3: rule__TextArea_Impl__FontAssignment_7_1
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
    // InternalVideoMontageSVJD.g:4566:1: rule__TextArea_Impl__Group_8__0 : rule__TextArea_Impl__Group_8__0__Impl rule__TextArea_Impl__Group_8__1 ;
    public final void rule__TextArea_Impl__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4570:1: ( rule__TextArea_Impl__Group_8__0__Impl rule__TextArea_Impl__Group_8__1 )
            // InternalVideoMontageSVJD.g:4571:2: rule__TextArea_Impl__Group_8__0__Impl rule__TextArea_Impl__Group_8__1
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
    // InternalVideoMontageSVJD.g:4578:1: rule__TextArea_Impl__Group_8__0__Impl : ( 'animation' ) ;
    public final void rule__TextArea_Impl__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4582:1: ( ( 'animation' ) )
            // InternalVideoMontageSVJD.g:4583:1: ( 'animation' )
            {
            // InternalVideoMontageSVJD.g:4583:1: ( 'animation' )
            // InternalVideoMontageSVJD.g:4584:2: 'animation'
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
    // InternalVideoMontageSVJD.g:4593:1: rule__TextArea_Impl__Group_8__1 : rule__TextArea_Impl__Group_8__1__Impl rule__TextArea_Impl__Group_8__2 ;
    public final void rule__TextArea_Impl__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4597:1: ( rule__TextArea_Impl__Group_8__1__Impl rule__TextArea_Impl__Group_8__2 )
            // InternalVideoMontageSVJD.g:4598:2: rule__TextArea_Impl__Group_8__1__Impl rule__TextArea_Impl__Group_8__2
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
    // InternalVideoMontageSVJD.g:4605:1: rule__TextArea_Impl__Group_8__1__Impl : ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) ) ;
    public final void rule__TextArea_Impl__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4609:1: ( ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) ) )
            // InternalVideoMontageSVJD.g:4610:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) )
            {
            // InternalVideoMontageSVJD.g:4610:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_1 ) )
            // InternalVideoMontageSVJD.g:4611:2: ( rule__TextArea_Impl__AnimationAssignment_8_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_8_1()); 
            // InternalVideoMontageSVJD.g:4612:2: ( rule__TextArea_Impl__AnimationAssignment_8_1 )
            // InternalVideoMontageSVJD.g:4612:3: rule__TextArea_Impl__AnimationAssignment_8_1
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
    // InternalVideoMontageSVJD.g:4620:1: rule__TextArea_Impl__Group_8__2 : rule__TextArea_Impl__Group_8__2__Impl ;
    public final void rule__TextArea_Impl__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4624:1: ( rule__TextArea_Impl__Group_8__2__Impl )
            // InternalVideoMontageSVJD.g:4625:2: rule__TextArea_Impl__Group_8__2__Impl
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
    // InternalVideoMontageSVJD.g:4631:1: rule__TextArea_Impl__Group_8__2__Impl : ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* ) ;
    public final void rule__TextArea_Impl__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4635:1: ( ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* ) )
            // InternalVideoMontageSVJD.g:4636:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* )
            {
            // InternalVideoMontageSVJD.g:4636:1: ( ( rule__TextArea_Impl__AnimationAssignment_8_2 )* )
            // InternalVideoMontageSVJD.g:4637:2: ( rule__TextArea_Impl__AnimationAssignment_8_2 )*
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_8_2()); 
            // InternalVideoMontageSVJD.g:4638:2: ( rule__TextArea_Impl__AnimationAssignment_8_2 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==57||(LA36_0>=59 && LA36_0<=60)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalVideoMontageSVJD.g:4638:3: rule__TextArea_Impl__AnimationAssignment_8_2
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
    // InternalVideoMontageSVJD.g:4647:1: rule__TextAreaDynamic__Group__0 : rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1 ;
    public final void rule__TextAreaDynamic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4651:1: ( rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1 )
            // InternalVideoMontageSVJD.g:4652:2: rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1
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
    // InternalVideoMontageSVJD.g:4659:1: rule__TextAreaDynamic__Group__0__Impl : ( 'TextAreaDynamic' ) ;
    public final void rule__TextAreaDynamic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4663:1: ( ( 'TextAreaDynamic' ) )
            // InternalVideoMontageSVJD.g:4664:1: ( 'TextAreaDynamic' )
            {
            // InternalVideoMontageSVJD.g:4664:1: ( 'TextAreaDynamic' )
            // InternalVideoMontageSVJD.g:4665:2: 'TextAreaDynamic'
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
    // InternalVideoMontageSVJD.g:4674:1: rule__TextAreaDynamic__Group__1 : rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2 ;
    public final void rule__TextAreaDynamic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4678:1: ( rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2 )
            // InternalVideoMontageSVJD.g:4679:2: rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2
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
    // InternalVideoMontageSVJD.g:4686:1: rule__TextAreaDynamic__Group__1__Impl : ( '{' ) ;
    public final void rule__TextAreaDynamic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4690:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:4691:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:4691:1: ( '{' )
            // InternalVideoMontageSVJD.g:4692:2: '{'
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
    // InternalVideoMontageSVJD.g:4701:1: rule__TextAreaDynamic__Group__2 : rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3 ;
    public final void rule__TextAreaDynamic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4705:1: ( rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3 )
            // InternalVideoMontageSVJD.g:4706:2: rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3
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
    // InternalVideoMontageSVJD.g:4713:1: rule__TextAreaDynamic__Group__2__Impl : ( ( rule__TextAreaDynamic__Group_2__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4717:1: ( ( ( rule__TextAreaDynamic__Group_2__0 )? ) )
            // InternalVideoMontageSVJD.g:4718:1: ( ( rule__TextAreaDynamic__Group_2__0 )? )
            {
            // InternalVideoMontageSVJD.g:4718:1: ( ( rule__TextAreaDynamic__Group_2__0 )? )
            // InternalVideoMontageSVJD.g:4719:2: ( rule__TextAreaDynamic__Group_2__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_2()); 
            // InternalVideoMontageSVJD.g:4720:2: ( rule__TextAreaDynamic__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4720:3: rule__TextAreaDynamic__Group_2__0
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
    // InternalVideoMontageSVJD.g:4728:1: rule__TextAreaDynamic__Group__3 : rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4 ;
    public final void rule__TextAreaDynamic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4732:1: ( rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4 )
            // InternalVideoMontageSVJD.g:4733:2: rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4
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
    // InternalVideoMontageSVJD.g:4740:1: rule__TextAreaDynamic__Group__3__Impl : ( ( rule__TextAreaDynamic__Group_3__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4744:1: ( ( ( rule__TextAreaDynamic__Group_3__0 )? ) )
            // InternalVideoMontageSVJD.g:4745:1: ( ( rule__TextAreaDynamic__Group_3__0 )? )
            {
            // InternalVideoMontageSVJD.g:4745:1: ( ( rule__TextAreaDynamic__Group_3__0 )? )
            // InternalVideoMontageSVJD.g:4746:2: ( rule__TextAreaDynamic__Group_3__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_3()); 
            // InternalVideoMontageSVJD.g:4747:2: ( rule__TextAreaDynamic__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4747:3: rule__TextAreaDynamic__Group_3__0
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
    // InternalVideoMontageSVJD.g:4755:1: rule__TextAreaDynamic__Group__4 : rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5 ;
    public final void rule__TextAreaDynamic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4759:1: ( rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5 )
            // InternalVideoMontageSVJD.g:4760:2: rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5
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
    // InternalVideoMontageSVJD.g:4767:1: rule__TextAreaDynamic__Group__4__Impl : ( ( rule__TextAreaDynamic__Group_4__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4771:1: ( ( ( rule__TextAreaDynamic__Group_4__0 )? ) )
            // InternalVideoMontageSVJD.g:4772:1: ( ( rule__TextAreaDynamic__Group_4__0 )? )
            {
            // InternalVideoMontageSVJD.g:4772:1: ( ( rule__TextAreaDynamic__Group_4__0 )? )
            // InternalVideoMontageSVJD.g:4773:2: ( rule__TextAreaDynamic__Group_4__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_4()); 
            // InternalVideoMontageSVJD.g:4774:2: ( rule__TextAreaDynamic__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4774:3: rule__TextAreaDynamic__Group_4__0
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
    // InternalVideoMontageSVJD.g:4782:1: rule__TextAreaDynamic__Group__5 : rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6 ;
    public final void rule__TextAreaDynamic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4786:1: ( rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6 )
            // InternalVideoMontageSVJD.g:4787:2: rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6
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
    // InternalVideoMontageSVJD.g:4794:1: rule__TextAreaDynamic__Group__5__Impl : ( ( rule__TextAreaDynamic__Group_5__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4798:1: ( ( ( rule__TextAreaDynamic__Group_5__0 )? ) )
            // InternalVideoMontageSVJD.g:4799:1: ( ( rule__TextAreaDynamic__Group_5__0 )? )
            {
            // InternalVideoMontageSVJD.g:4799:1: ( ( rule__TextAreaDynamic__Group_5__0 )? )
            // InternalVideoMontageSVJD.g:4800:2: ( rule__TextAreaDynamic__Group_5__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_5()); 
            // InternalVideoMontageSVJD.g:4801:2: ( rule__TextAreaDynamic__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4801:3: rule__TextAreaDynamic__Group_5__0
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
    // InternalVideoMontageSVJD.g:4809:1: rule__TextAreaDynamic__Group__6 : rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7 ;
    public final void rule__TextAreaDynamic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4813:1: ( rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7 )
            // InternalVideoMontageSVJD.g:4814:2: rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7
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
    // InternalVideoMontageSVJD.g:4821:1: rule__TextAreaDynamic__Group__6__Impl : ( ( rule__TextAreaDynamic__Group_6__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4825:1: ( ( ( rule__TextAreaDynamic__Group_6__0 )? ) )
            // InternalVideoMontageSVJD.g:4826:1: ( ( rule__TextAreaDynamic__Group_6__0 )? )
            {
            // InternalVideoMontageSVJD.g:4826:1: ( ( rule__TextAreaDynamic__Group_6__0 )? )
            // InternalVideoMontageSVJD.g:4827:2: ( rule__TextAreaDynamic__Group_6__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_6()); 
            // InternalVideoMontageSVJD.g:4828:2: ( rule__TextAreaDynamic__Group_6__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==51) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4828:3: rule__TextAreaDynamic__Group_6__0
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
    // InternalVideoMontageSVJD.g:4836:1: rule__TextAreaDynamic__Group__7 : rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8 ;
    public final void rule__TextAreaDynamic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4840:1: ( rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8 )
            // InternalVideoMontageSVJD.g:4841:2: rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8
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
    // InternalVideoMontageSVJD.g:4848:1: rule__TextAreaDynamic__Group__7__Impl : ( ( rule__TextAreaDynamic__Group_7__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4852:1: ( ( ( rule__TextAreaDynamic__Group_7__0 )? ) )
            // InternalVideoMontageSVJD.g:4853:1: ( ( rule__TextAreaDynamic__Group_7__0 )? )
            {
            // InternalVideoMontageSVJD.g:4853:1: ( ( rule__TextAreaDynamic__Group_7__0 )? )
            // InternalVideoMontageSVJD.g:4854:2: ( rule__TextAreaDynamic__Group_7__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_7()); 
            // InternalVideoMontageSVJD.g:4855:2: ( rule__TextAreaDynamic__Group_7__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==55) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4855:3: rule__TextAreaDynamic__Group_7__0
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
    // InternalVideoMontageSVJD.g:4863:1: rule__TextAreaDynamic__Group__8 : rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9 ;
    public final void rule__TextAreaDynamic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4867:1: ( rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9 )
            // InternalVideoMontageSVJD.g:4868:2: rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9
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
    // InternalVideoMontageSVJD.g:4875:1: rule__TextAreaDynamic__Group__8__Impl : ( ( rule__TextAreaDynamic__Group_8__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4879:1: ( ( ( rule__TextAreaDynamic__Group_8__0 )? ) )
            // InternalVideoMontageSVJD.g:4880:1: ( ( rule__TextAreaDynamic__Group_8__0 )? )
            {
            // InternalVideoMontageSVJD.g:4880:1: ( ( rule__TextAreaDynamic__Group_8__0 )? )
            // InternalVideoMontageSVJD.g:4881:2: ( rule__TextAreaDynamic__Group_8__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_8()); 
            // InternalVideoMontageSVJD.g:4882:2: ( rule__TextAreaDynamic__Group_8__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4882:3: rule__TextAreaDynamic__Group_8__0
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
    // InternalVideoMontageSVJD.g:4890:1: rule__TextAreaDynamic__Group__9 : rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10 ;
    public final void rule__TextAreaDynamic__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4894:1: ( rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10 )
            // InternalVideoMontageSVJD.g:4895:2: rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10
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
    // InternalVideoMontageSVJD.g:4902:1: rule__TextAreaDynamic__Group__9__Impl : ( 'font' ) ;
    public final void rule__TextAreaDynamic__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4906:1: ( ( 'font' ) )
            // InternalVideoMontageSVJD.g:4907:1: ( 'font' )
            {
            // InternalVideoMontageSVJD.g:4907:1: ( 'font' )
            // InternalVideoMontageSVJD.g:4908:2: 'font'
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
    // InternalVideoMontageSVJD.g:4917:1: rule__TextAreaDynamic__Group__10 : rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11 ;
    public final void rule__TextAreaDynamic__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4921:1: ( rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11 )
            // InternalVideoMontageSVJD.g:4922:2: rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11
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
    // InternalVideoMontageSVJD.g:4929:1: rule__TextAreaDynamic__Group__10__Impl : ( ( rule__TextAreaDynamic__FontAssignment_10 ) ) ;
    public final void rule__TextAreaDynamic__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4933:1: ( ( ( rule__TextAreaDynamic__FontAssignment_10 ) ) )
            // InternalVideoMontageSVJD.g:4934:1: ( ( rule__TextAreaDynamic__FontAssignment_10 ) )
            {
            // InternalVideoMontageSVJD.g:4934:1: ( ( rule__TextAreaDynamic__FontAssignment_10 ) )
            // InternalVideoMontageSVJD.g:4935:2: ( rule__TextAreaDynamic__FontAssignment_10 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontAssignment_10()); 
            // InternalVideoMontageSVJD.g:4936:2: ( rule__TextAreaDynamic__FontAssignment_10 )
            // InternalVideoMontageSVJD.g:4936:3: rule__TextAreaDynamic__FontAssignment_10
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
    // InternalVideoMontageSVJD.g:4944:1: rule__TextAreaDynamic__Group__11 : rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12 ;
    public final void rule__TextAreaDynamic__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4948:1: ( rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12 )
            // InternalVideoMontageSVJD.g:4949:2: rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12
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
    // InternalVideoMontageSVJD.g:4956:1: rule__TextAreaDynamic__Group__11__Impl : ( ( rule__TextAreaDynamic__Group_11__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4960:1: ( ( ( rule__TextAreaDynamic__Group_11__0 )? ) )
            // InternalVideoMontageSVJD.g:4961:1: ( ( rule__TextAreaDynamic__Group_11__0 )? )
            {
            // InternalVideoMontageSVJD.g:4961:1: ( ( rule__TextAreaDynamic__Group_11__0 )? )
            // InternalVideoMontageSVJD.g:4962:2: ( rule__TextAreaDynamic__Group_11__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_11()); 
            // InternalVideoMontageSVJD.g:4963:2: ( rule__TextAreaDynamic__Group_11__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==53) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalVideoMontageSVJD.g:4963:3: rule__TextAreaDynamic__Group_11__0
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
    // InternalVideoMontageSVJD.g:4971:1: rule__TextAreaDynamic__Group__12 : rule__TextAreaDynamic__Group__12__Impl ;
    public final void rule__TextAreaDynamic__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4975:1: ( rule__TextAreaDynamic__Group__12__Impl )
            // InternalVideoMontageSVJD.g:4976:2: rule__TextAreaDynamic__Group__12__Impl
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
    // InternalVideoMontageSVJD.g:4982:1: rule__TextAreaDynamic__Group__12__Impl : ( '}' ) ;
    public final void rule__TextAreaDynamic__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:4986:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:4987:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:4987:1: ( '}' )
            // InternalVideoMontageSVJD.g:4988:2: '}'
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
    // InternalVideoMontageSVJD.g:4998:1: rule__TextAreaDynamic__Group_2__0 : rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1 ;
    public final void rule__TextAreaDynamic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5002:1: ( rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1 )
            // InternalVideoMontageSVJD.g:5003:2: rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1
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
    // InternalVideoMontageSVJD.g:5010:1: rule__TextAreaDynamic__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__TextAreaDynamic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5014:1: ( ( 'x' ) )
            // InternalVideoMontageSVJD.g:5015:1: ( 'x' )
            {
            // InternalVideoMontageSVJD.g:5015:1: ( 'x' )
            // InternalVideoMontageSVJD.g:5016:2: 'x'
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
    // InternalVideoMontageSVJD.g:5025:1: rule__TextAreaDynamic__Group_2__1 : rule__TextAreaDynamic__Group_2__1__Impl ;
    public final void rule__TextAreaDynamic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5029:1: ( rule__TextAreaDynamic__Group_2__1__Impl )
            // InternalVideoMontageSVJD.g:5030:2: rule__TextAreaDynamic__Group_2__1__Impl
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
    // InternalVideoMontageSVJD.g:5036:1: rule__TextAreaDynamic__Group_2__1__Impl : ( ( rule__TextAreaDynamic__XAssignment_2_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5040:1: ( ( ( rule__TextAreaDynamic__XAssignment_2_1 ) ) )
            // InternalVideoMontageSVJD.g:5041:1: ( ( rule__TextAreaDynamic__XAssignment_2_1 ) )
            {
            // InternalVideoMontageSVJD.g:5041:1: ( ( rule__TextAreaDynamic__XAssignment_2_1 ) )
            // InternalVideoMontageSVJD.g:5042:2: ( rule__TextAreaDynamic__XAssignment_2_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getXAssignment_2_1()); 
            // InternalVideoMontageSVJD.g:5043:2: ( rule__TextAreaDynamic__XAssignment_2_1 )
            // InternalVideoMontageSVJD.g:5043:3: rule__TextAreaDynamic__XAssignment_2_1
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
    // InternalVideoMontageSVJD.g:5052:1: rule__TextAreaDynamic__Group_3__0 : rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1 ;
    public final void rule__TextAreaDynamic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5056:1: ( rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1 )
            // InternalVideoMontageSVJD.g:5057:2: rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1
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
    // InternalVideoMontageSVJD.g:5064:1: rule__TextAreaDynamic__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__TextAreaDynamic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5068:1: ( ( 'y' ) )
            // InternalVideoMontageSVJD.g:5069:1: ( 'y' )
            {
            // InternalVideoMontageSVJD.g:5069:1: ( 'y' )
            // InternalVideoMontageSVJD.g:5070:2: 'y'
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
    // InternalVideoMontageSVJD.g:5079:1: rule__TextAreaDynamic__Group_3__1 : rule__TextAreaDynamic__Group_3__1__Impl ;
    public final void rule__TextAreaDynamic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5083:1: ( rule__TextAreaDynamic__Group_3__1__Impl )
            // InternalVideoMontageSVJD.g:5084:2: rule__TextAreaDynamic__Group_3__1__Impl
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
    // InternalVideoMontageSVJD.g:5090:1: rule__TextAreaDynamic__Group_3__1__Impl : ( ( rule__TextAreaDynamic__YAssignment_3_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5094:1: ( ( ( rule__TextAreaDynamic__YAssignment_3_1 ) ) )
            // InternalVideoMontageSVJD.g:5095:1: ( ( rule__TextAreaDynamic__YAssignment_3_1 ) )
            {
            // InternalVideoMontageSVJD.g:5095:1: ( ( rule__TextAreaDynamic__YAssignment_3_1 ) )
            // InternalVideoMontageSVJD.g:5096:2: ( rule__TextAreaDynamic__YAssignment_3_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getYAssignment_3_1()); 
            // InternalVideoMontageSVJD.g:5097:2: ( rule__TextAreaDynamic__YAssignment_3_1 )
            // InternalVideoMontageSVJD.g:5097:3: rule__TextAreaDynamic__YAssignment_3_1
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
    // InternalVideoMontageSVJD.g:5106:1: rule__TextAreaDynamic__Group_4__0 : rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1 ;
    public final void rule__TextAreaDynamic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5110:1: ( rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1 )
            // InternalVideoMontageSVJD.g:5111:2: rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1
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
    // InternalVideoMontageSVJD.g:5118:1: rule__TextAreaDynamic__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__TextAreaDynamic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5122:1: ( ( 'width' ) )
            // InternalVideoMontageSVJD.g:5123:1: ( 'width' )
            {
            // InternalVideoMontageSVJD.g:5123:1: ( 'width' )
            // InternalVideoMontageSVJD.g:5124:2: 'width'
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
    // InternalVideoMontageSVJD.g:5133:1: rule__TextAreaDynamic__Group_4__1 : rule__TextAreaDynamic__Group_4__1__Impl ;
    public final void rule__TextAreaDynamic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5137:1: ( rule__TextAreaDynamic__Group_4__1__Impl )
            // InternalVideoMontageSVJD.g:5138:2: rule__TextAreaDynamic__Group_4__1__Impl
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
    // InternalVideoMontageSVJD.g:5144:1: rule__TextAreaDynamic__Group_4__1__Impl : ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5148:1: ( ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) ) )
            // InternalVideoMontageSVJD.g:5149:1: ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) )
            {
            // InternalVideoMontageSVJD.g:5149:1: ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) )
            // InternalVideoMontageSVJD.g:5150:2: ( rule__TextAreaDynamic__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getWidthAssignment_4_1()); 
            // InternalVideoMontageSVJD.g:5151:2: ( rule__TextAreaDynamic__WidthAssignment_4_1 )
            // InternalVideoMontageSVJD.g:5151:3: rule__TextAreaDynamic__WidthAssignment_4_1
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
    // InternalVideoMontageSVJD.g:5160:1: rule__TextAreaDynamic__Group_5__0 : rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1 ;
    public final void rule__TextAreaDynamic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5164:1: ( rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1 )
            // InternalVideoMontageSVJD.g:5165:2: rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1
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
    // InternalVideoMontageSVJD.g:5172:1: rule__TextAreaDynamic__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__TextAreaDynamic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5176:1: ( ( 'height' ) )
            // InternalVideoMontageSVJD.g:5177:1: ( 'height' )
            {
            // InternalVideoMontageSVJD.g:5177:1: ( 'height' )
            // InternalVideoMontageSVJD.g:5178:2: 'height'
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
    // InternalVideoMontageSVJD.g:5187:1: rule__TextAreaDynamic__Group_5__1 : rule__TextAreaDynamic__Group_5__1__Impl ;
    public final void rule__TextAreaDynamic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5191:1: ( rule__TextAreaDynamic__Group_5__1__Impl )
            // InternalVideoMontageSVJD.g:5192:2: rule__TextAreaDynamic__Group_5__1__Impl
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
    // InternalVideoMontageSVJD.g:5198:1: rule__TextAreaDynamic__Group_5__1__Impl : ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5202:1: ( ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) ) )
            // InternalVideoMontageSVJD.g:5203:1: ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) )
            {
            // InternalVideoMontageSVJD.g:5203:1: ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) )
            // InternalVideoMontageSVJD.g:5204:2: ( rule__TextAreaDynamic__HeightAssignment_5_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getHeightAssignment_5_1()); 
            // InternalVideoMontageSVJD.g:5205:2: ( rule__TextAreaDynamic__HeightAssignment_5_1 )
            // InternalVideoMontageSVJD.g:5205:3: rule__TextAreaDynamic__HeightAssignment_5_1
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
    // InternalVideoMontageSVJD.g:5214:1: rule__TextAreaDynamic__Group_6__0 : rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1 ;
    public final void rule__TextAreaDynamic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5218:1: ( rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1 )
            // InternalVideoMontageSVJD.g:5219:2: rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1
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
    // InternalVideoMontageSVJD.g:5226:1: rule__TextAreaDynamic__Group_6__0__Impl : ( 'text' ) ;
    public final void rule__TextAreaDynamic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5230:1: ( ( 'text' ) )
            // InternalVideoMontageSVJD.g:5231:1: ( 'text' )
            {
            // InternalVideoMontageSVJD.g:5231:1: ( 'text' )
            // InternalVideoMontageSVJD.g:5232:2: 'text'
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
    // InternalVideoMontageSVJD.g:5241:1: rule__TextAreaDynamic__Group_6__1 : rule__TextAreaDynamic__Group_6__1__Impl ;
    public final void rule__TextAreaDynamic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5245:1: ( rule__TextAreaDynamic__Group_6__1__Impl )
            // InternalVideoMontageSVJD.g:5246:2: rule__TextAreaDynamic__Group_6__1__Impl
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
    // InternalVideoMontageSVJD.g:5252:1: rule__TextAreaDynamic__Group_6__1__Impl : ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5256:1: ( ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) ) )
            // InternalVideoMontageSVJD.g:5257:1: ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) )
            {
            // InternalVideoMontageSVJD.g:5257:1: ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) )
            // InternalVideoMontageSVJD.g:5258:2: ( rule__TextAreaDynamic__TextAssignment_6_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextAssignment_6_1()); 
            // InternalVideoMontageSVJD.g:5259:2: ( rule__TextAreaDynamic__TextAssignment_6_1 )
            // InternalVideoMontageSVJD.g:5259:3: rule__TextAreaDynamic__TextAssignment_6_1
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
    // InternalVideoMontageSVJD.g:5268:1: rule__TextAreaDynamic__Group_7__0 : rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1 ;
    public final void rule__TextAreaDynamic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5272:1: ( rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1 )
            // InternalVideoMontageSVJD.g:5273:2: rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1
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
    // InternalVideoMontageSVJD.g:5280:1: rule__TextAreaDynamic__Group_7__0__Impl : ( 'textSrc' ) ;
    public final void rule__TextAreaDynamic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5284:1: ( ( 'textSrc' ) )
            // InternalVideoMontageSVJD.g:5285:1: ( 'textSrc' )
            {
            // InternalVideoMontageSVJD.g:5285:1: ( 'textSrc' )
            // InternalVideoMontageSVJD.g:5286:2: 'textSrc'
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
    // InternalVideoMontageSVJD.g:5295:1: rule__TextAreaDynamic__Group_7__1 : rule__TextAreaDynamic__Group_7__1__Impl ;
    public final void rule__TextAreaDynamic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5299:1: ( rule__TextAreaDynamic__Group_7__1__Impl )
            // InternalVideoMontageSVJD.g:5300:2: rule__TextAreaDynamic__Group_7__1__Impl
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
    // InternalVideoMontageSVJD.g:5306:1: rule__TextAreaDynamic__Group_7__1__Impl : ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5310:1: ( ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) ) )
            // InternalVideoMontageSVJD.g:5311:1: ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) )
            {
            // InternalVideoMontageSVJD.g:5311:1: ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) )
            // InternalVideoMontageSVJD.g:5312:2: ( rule__TextAreaDynamic__TextSrcAssignment_7_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextSrcAssignment_7_1()); 
            // InternalVideoMontageSVJD.g:5313:2: ( rule__TextAreaDynamic__TextSrcAssignment_7_1 )
            // InternalVideoMontageSVJD.g:5313:3: rule__TextAreaDynamic__TextSrcAssignment_7_1
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
    // InternalVideoMontageSVJD.g:5322:1: rule__TextAreaDynamic__Group_8__0 : rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1 ;
    public final void rule__TextAreaDynamic__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5326:1: ( rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1 )
            // InternalVideoMontageSVJD.g:5327:2: rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1
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
    // InternalVideoMontageSVJD.g:5334:1: rule__TextAreaDynamic__Group_8__0__Impl : ( 'line' ) ;
    public final void rule__TextAreaDynamic__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5338:1: ( ( 'line' ) )
            // InternalVideoMontageSVJD.g:5339:1: ( 'line' )
            {
            // InternalVideoMontageSVJD.g:5339:1: ( 'line' )
            // InternalVideoMontageSVJD.g:5340:2: 'line'
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
    // InternalVideoMontageSVJD.g:5349:1: rule__TextAreaDynamic__Group_8__1 : rule__TextAreaDynamic__Group_8__1__Impl ;
    public final void rule__TextAreaDynamic__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5353:1: ( rule__TextAreaDynamic__Group_8__1__Impl )
            // InternalVideoMontageSVJD.g:5354:2: rule__TextAreaDynamic__Group_8__1__Impl
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
    // InternalVideoMontageSVJD.g:5360:1: rule__TextAreaDynamic__Group_8__1__Impl : ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5364:1: ( ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) ) )
            // InternalVideoMontageSVJD.g:5365:1: ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) )
            {
            // InternalVideoMontageSVJD.g:5365:1: ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) )
            // InternalVideoMontageSVJD.g:5366:2: ( rule__TextAreaDynamic__LineAssignment_8_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getLineAssignment_8_1()); 
            // InternalVideoMontageSVJD.g:5367:2: ( rule__TextAreaDynamic__LineAssignment_8_1 )
            // InternalVideoMontageSVJD.g:5367:3: rule__TextAreaDynamic__LineAssignment_8_1
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
    // InternalVideoMontageSVJD.g:5376:1: rule__TextAreaDynamic__Group_11__0 : rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1 ;
    public final void rule__TextAreaDynamic__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5380:1: ( rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1 )
            // InternalVideoMontageSVJD.g:5381:2: rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1
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
    // InternalVideoMontageSVJD.g:5388:1: rule__TextAreaDynamic__Group_11__0__Impl : ( 'animation' ) ;
    public final void rule__TextAreaDynamic__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5392:1: ( ( 'animation' ) )
            // InternalVideoMontageSVJD.g:5393:1: ( 'animation' )
            {
            // InternalVideoMontageSVJD.g:5393:1: ( 'animation' )
            // InternalVideoMontageSVJD.g:5394:2: 'animation'
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
    // InternalVideoMontageSVJD.g:5403:1: rule__TextAreaDynamic__Group_11__1 : rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2 ;
    public final void rule__TextAreaDynamic__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5407:1: ( rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2 )
            // InternalVideoMontageSVJD.g:5408:2: rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2
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
    // InternalVideoMontageSVJD.g:5415:1: rule__TextAreaDynamic__Group_11__1__Impl : ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5419:1: ( ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) ) )
            // InternalVideoMontageSVJD.g:5420:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) )
            {
            // InternalVideoMontageSVJD.g:5420:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_1 ) )
            // InternalVideoMontageSVJD.g:5421:2: ( rule__TextAreaDynamic__AnimationAssignment_11_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_1()); 
            // InternalVideoMontageSVJD.g:5422:2: ( rule__TextAreaDynamic__AnimationAssignment_11_1 )
            // InternalVideoMontageSVJD.g:5422:3: rule__TextAreaDynamic__AnimationAssignment_11_1
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
    // InternalVideoMontageSVJD.g:5430:1: rule__TextAreaDynamic__Group_11__2 : rule__TextAreaDynamic__Group_11__2__Impl ;
    public final void rule__TextAreaDynamic__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5434:1: ( rule__TextAreaDynamic__Group_11__2__Impl )
            // InternalVideoMontageSVJD.g:5435:2: rule__TextAreaDynamic__Group_11__2__Impl
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
    // InternalVideoMontageSVJD.g:5441:1: rule__TextAreaDynamic__Group_11__2__Impl : ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* ) ;
    public final void rule__TextAreaDynamic__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5445:1: ( ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* ) )
            // InternalVideoMontageSVJD.g:5446:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* )
            {
            // InternalVideoMontageSVJD.g:5446:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 )* )
            // InternalVideoMontageSVJD.g:5447:2: ( rule__TextAreaDynamic__AnimationAssignment_11_2 )*
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_2()); 
            // InternalVideoMontageSVJD.g:5448:2: ( rule__TextAreaDynamic__AnimationAssignment_11_2 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==57||(LA45_0>=59 && LA45_0<=60)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalVideoMontageSVJD.g:5448:3: rule__TextAreaDynamic__AnimationAssignment_11_2
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


    // $ANTLR start "rule__ScrollingText__Group__0"
    // InternalVideoMontageSVJD.g:5457:1: rule__ScrollingText__Group__0 : rule__ScrollingText__Group__0__Impl rule__ScrollingText__Group__1 ;
    public final void rule__ScrollingText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5461:1: ( rule__ScrollingText__Group__0__Impl rule__ScrollingText__Group__1 )
            // InternalVideoMontageSVJD.g:5462:2: rule__ScrollingText__Group__0__Impl rule__ScrollingText__Group__1
            {
            pushFollow(FOLLOW_40);
            rule__ScrollingText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__0"


    // $ANTLR start "rule__ScrollingText__Group__0__Impl"
    // InternalVideoMontageSVJD.g:5469:1: rule__ScrollingText__Group__0__Impl : ( () ) ;
    public final void rule__ScrollingText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5473:1: ( ( () ) )
            // InternalVideoMontageSVJD.g:5474:1: ( () )
            {
            // InternalVideoMontageSVJD.g:5474:1: ( () )
            // InternalVideoMontageSVJD.g:5475:2: ()
            {
             before(grammarAccess.getScrollingTextAccess().getScrollingTextAction_0()); 
            // InternalVideoMontageSVJD.g:5476:2: ()
            // InternalVideoMontageSVJD.g:5476:3: 
            {
            }

             after(grammarAccess.getScrollingTextAccess().getScrollingTextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__0__Impl"


    // $ANTLR start "rule__ScrollingText__Group__1"
    // InternalVideoMontageSVJD.g:5484:1: rule__ScrollingText__Group__1 : rule__ScrollingText__Group__1__Impl rule__ScrollingText__Group__2 ;
    public final void rule__ScrollingText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5488:1: ( rule__ScrollingText__Group__1__Impl rule__ScrollingText__Group__2 )
            // InternalVideoMontageSVJD.g:5489:2: rule__ScrollingText__Group__1__Impl rule__ScrollingText__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ScrollingText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__1"


    // $ANTLR start "rule__ScrollingText__Group__1__Impl"
    // InternalVideoMontageSVJD.g:5496:1: rule__ScrollingText__Group__1__Impl : ( 'ScrollingText' ) ;
    public final void rule__ScrollingText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5500:1: ( ( 'ScrollingText' ) )
            // InternalVideoMontageSVJD.g:5501:1: ( 'ScrollingText' )
            {
            // InternalVideoMontageSVJD.g:5501:1: ( 'ScrollingText' )
            // InternalVideoMontageSVJD.g:5502:2: 'ScrollingText'
            {
             before(grammarAccess.getScrollingTextAccess().getScrollingTextKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getScrollingTextAccess().getScrollingTextKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__1__Impl"


    // $ANTLR start "rule__ScrollingText__Group__2"
    // InternalVideoMontageSVJD.g:5511:1: rule__ScrollingText__Group__2 : rule__ScrollingText__Group__2__Impl rule__ScrollingText__Group__3 ;
    public final void rule__ScrollingText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5515:1: ( rule__ScrollingText__Group__2__Impl rule__ScrollingText__Group__3 )
            // InternalVideoMontageSVJD.g:5516:2: rule__ScrollingText__Group__2__Impl rule__ScrollingText__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__ScrollingText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__2"


    // $ANTLR start "rule__ScrollingText__Group__2__Impl"
    // InternalVideoMontageSVJD.g:5523:1: rule__ScrollingText__Group__2__Impl : ( '{' ) ;
    public final void rule__ScrollingText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5527:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:5528:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:5528:1: ( '{' )
            // InternalVideoMontageSVJD.g:5529:2: '{'
            {
             before(grammarAccess.getScrollingTextAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getScrollingTextAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__2__Impl"


    // $ANTLR start "rule__ScrollingText__Group__3"
    // InternalVideoMontageSVJD.g:5538:1: rule__ScrollingText__Group__3 : rule__ScrollingText__Group__3__Impl rule__ScrollingText__Group__4 ;
    public final void rule__ScrollingText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5542:1: ( rule__ScrollingText__Group__3__Impl rule__ScrollingText__Group__4 )
            // InternalVideoMontageSVJD.g:5543:2: rule__ScrollingText__Group__3__Impl rule__ScrollingText__Group__4
            {
            pushFollow(FOLLOW_45);
            rule__ScrollingText__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__3"


    // $ANTLR start "rule__ScrollingText__Group__3__Impl"
    // InternalVideoMontageSVJD.g:5550:1: rule__ScrollingText__Group__3__Impl : ( ( rule__ScrollingText__Group_3__0 ) ) ;
    public final void rule__ScrollingText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5554:1: ( ( ( rule__ScrollingText__Group_3__0 ) ) )
            // InternalVideoMontageSVJD.g:5555:1: ( ( rule__ScrollingText__Group_3__0 ) )
            {
            // InternalVideoMontageSVJD.g:5555:1: ( ( rule__ScrollingText__Group_3__0 ) )
            // InternalVideoMontageSVJD.g:5556:2: ( rule__ScrollingText__Group_3__0 )
            {
             before(grammarAccess.getScrollingTextAccess().getGroup_3()); 
            // InternalVideoMontageSVJD.g:5557:2: ( rule__ScrollingText__Group_3__0 )
            // InternalVideoMontageSVJD.g:5557:3: rule__ScrollingText__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getScrollingTextAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__3__Impl"


    // $ANTLR start "rule__ScrollingText__Group__4"
    // InternalVideoMontageSVJD.g:5565:1: rule__ScrollingText__Group__4 : rule__ScrollingText__Group__4__Impl rule__ScrollingText__Group__5 ;
    public final void rule__ScrollingText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5569:1: ( rule__ScrollingText__Group__4__Impl rule__ScrollingText__Group__5 )
            // InternalVideoMontageSVJD.g:5570:2: rule__ScrollingText__Group__4__Impl rule__ScrollingText__Group__5
            {
            pushFollow(FOLLOW_45);
            rule__ScrollingText__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__4"


    // $ANTLR start "rule__ScrollingText__Group__4__Impl"
    // InternalVideoMontageSVJD.g:5577:1: rule__ScrollingText__Group__4__Impl : ( ( rule__ScrollingText__Group_4__0 )? ) ;
    public final void rule__ScrollingText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5581:1: ( ( ( rule__ScrollingText__Group_4__0 )? ) )
            // InternalVideoMontageSVJD.g:5582:1: ( ( rule__ScrollingText__Group_4__0 )? )
            {
            // InternalVideoMontageSVJD.g:5582:1: ( ( rule__ScrollingText__Group_4__0 )? )
            // InternalVideoMontageSVJD.g:5583:2: ( rule__ScrollingText__Group_4__0 )?
            {
             before(grammarAccess.getScrollingTextAccess().getGroup_4()); 
            // InternalVideoMontageSVJD.g:5584:2: ( rule__ScrollingText__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==29) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalVideoMontageSVJD.g:5584:3: rule__ScrollingText__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScrollingText__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScrollingTextAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__4__Impl"


    // $ANTLR start "rule__ScrollingText__Group__5"
    // InternalVideoMontageSVJD.g:5592:1: rule__ScrollingText__Group__5 : rule__ScrollingText__Group__5__Impl ;
    public final void rule__ScrollingText__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5596:1: ( rule__ScrollingText__Group__5__Impl )
            // InternalVideoMontageSVJD.g:5597:2: rule__ScrollingText__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__5"


    // $ANTLR start "rule__ScrollingText__Group__5__Impl"
    // InternalVideoMontageSVJD.g:5603:1: rule__ScrollingText__Group__5__Impl : ( '}' ) ;
    public final void rule__ScrollingText__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5607:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:5608:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:5608:1: ( '}' )
            // InternalVideoMontageSVJD.g:5609:2: '}'
            {
             before(grammarAccess.getScrollingTextAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getScrollingTextAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group__5__Impl"


    // $ANTLR start "rule__ScrollingText__Group_3__0"
    // InternalVideoMontageSVJD.g:5619:1: rule__ScrollingText__Group_3__0 : rule__ScrollingText__Group_3__0__Impl rule__ScrollingText__Group_3__1 ;
    public final void rule__ScrollingText__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5623:1: ( rule__ScrollingText__Group_3__0__Impl rule__ScrollingText__Group_3__1 )
            // InternalVideoMontageSVJD.g:5624:2: rule__ScrollingText__Group_3__0__Impl rule__ScrollingText__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__ScrollingText__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group_3__0"


    // $ANTLR start "rule__ScrollingText__Group_3__0__Impl"
    // InternalVideoMontageSVJD.g:5631:1: rule__ScrollingText__Group_3__0__Impl : ( 'speed' ) ;
    public final void rule__ScrollingText__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5635:1: ( ( 'speed' ) )
            // InternalVideoMontageSVJD.g:5636:1: ( 'speed' )
            {
            // InternalVideoMontageSVJD.g:5636:1: ( 'speed' )
            // InternalVideoMontageSVJD.g:5637:2: 'speed'
            {
             before(grammarAccess.getScrollingTextAccess().getSpeedKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getScrollingTextAccess().getSpeedKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group_3__0__Impl"


    // $ANTLR start "rule__ScrollingText__Group_3__1"
    // InternalVideoMontageSVJD.g:5646:1: rule__ScrollingText__Group_3__1 : rule__ScrollingText__Group_3__1__Impl ;
    public final void rule__ScrollingText__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5650:1: ( rule__ScrollingText__Group_3__1__Impl )
            // InternalVideoMontageSVJD.g:5651:2: rule__ScrollingText__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group_3__1"


    // $ANTLR start "rule__ScrollingText__Group_3__1__Impl"
    // InternalVideoMontageSVJD.g:5657:1: rule__ScrollingText__Group_3__1__Impl : ( ( rule__ScrollingText__SpeedAssignment_3_1 ) ) ;
    public final void rule__ScrollingText__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5661:1: ( ( ( rule__ScrollingText__SpeedAssignment_3_1 ) ) )
            // InternalVideoMontageSVJD.g:5662:1: ( ( rule__ScrollingText__SpeedAssignment_3_1 ) )
            {
            // InternalVideoMontageSVJD.g:5662:1: ( ( rule__ScrollingText__SpeedAssignment_3_1 ) )
            // InternalVideoMontageSVJD.g:5663:2: ( rule__ScrollingText__SpeedAssignment_3_1 )
            {
             before(grammarAccess.getScrollingTextAccess().getSpeedAssignment_3_1()); 
            // InternalVideoMontageSVJD.g:5664:2: ( rule__ScrollingText__SpeedAssignment_3_1 )
            // InternalVideoMontageSVJD.g:5664:3: rule__ScrollingText__SpeedAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ScrollingText__SpeedAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getScrollingTextAccess().getSpeedAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group_3__1__Impl"


    // $ANTLR start "rule__ScrollingText__Group_4__0"
    // InternalVideoMontageSVJD.g:5673:1: rule__ScrollingText__Group_4__0 : rule__ScrollingText__Group_4__0__Impl rule__ScrollingText__Group_4__1 ;
    public final void rule__ScrollingText__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5677:1: ( rule__ScrollingText__Group_4__0__Impl rule__ScrollingText__Group_4__1 )
            // InternalVideoMontageSVJD.g:5678:2: rule__ScrollingText__Group_4__0__Impl rule__ScrollingText__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__ScrollingText__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group_4__0"


    // $ANTLR start "rule__ScrollingText__Group_4__0__Impl"
    // InternalVideoMontageSVJD.g:5685:1: rule__ScrollingText__Group_4__0__Impl : ( 'duration' ) ;
    public final void rule__ScrollingText__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5689:1: ( ( 'duration' ) )
            // InternalVideoMontageSVJD.g:5690:1: ( 'duration' )
            {
            // InternalVideoMontageSVJD.g:5690:1: ( 'duration' )
            // InternalVideoMontageSVJD.g:5691:2: 'duration'
            {
             before(grammarAccess.getScrollingTextAccess().getDurationKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getScrollingTextAccess().getDurationKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group_4__0__Impl"


    // $ANTLR start "rule__ScrollingText__Group_4__1"
    // InternalVideoMontageSVJD.g:5700:1: rule__ScrollingText__Group_4__1 : rule__ScrollingText__Group_4__1__Impl ;
    public final void rule__ScrollingText__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5704:1: ( rule__ScrollingText__Group_4__1__Impl )
            // InternalVideoMontageSVJD.g:5705:2: rule__ScrollingText__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScrollingText__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group_4__1"


    // $ANTLR start "rule__ScrollingText__Group_4__1__Impl"
    // InternalVideoMontageSVJD.g:5711:1: rule__ScrollingText__Group_4__1__Impl : ( ( rule__ScrollingText__DurationAssignment_4_1 ) ) ;
    public final void rule__ScrollingText__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5715:1: ( ( ( rule__ScrollingText__DurationAssignment_4_1 ) ) )
            // InternalVideoMontageSVJD.g:5716:1: ( ( rule__ScrollingText__DurationAssignment_4_1 ) )
            {
            // InternalVideoMontageSVJD.g:5716:1: ( ( rule__ScrollingText__DurationAssignment_4_1 ) )
            // InternalVideoMontageSVJD.g:5717:2: ( rule__ScrollingText__DurationAssignment_4_1 )
            {
             before(grammarAccess.getScrollingTextAccess().getDurationAssignment_4_1()); 
            // InternalVideoMontageSVJD.g:5718:2: ( rule__ScrollingText__DurationAssignment_4_1 )
            // InternalVideoMontageSVJD.g:5718:3: rule__ScrollingText__DurationAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ScrollingText__DurationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getScrollingTextAccess().getDurationAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__Group_4__1__Impl"


    // $ANTLR start "rule__FadeIn__Group__0"
    // InternalVideoMontageSVJD.g:5727:1: rule__FadeIn__Group__0 : rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 ;
    public final void rule__FadeIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5731:1: ( rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 )
            // InternalVideoMontageSVJD.g:5732:2: rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1
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
    // InternalVideoMontageSVJD.g:5739:1: rule__FadeIn__Group__0__Impl : ( () ) ;
    public final void rule__FadeIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5743:1: ( ( () ) )
            // InternalVideoMontageSVJD.g:5744:1: ( () )
            {
            // InternalVideoMontageSVJD.g:5744:1: ( () )
            // InternalVideoMontageSVJD.g:5745:2: ()
            {
             before(grammarAccess.getFadeInAccess().getFadeInAction_0()); 
            // InternalVideoMontageSVJD.g:5746:2: ()
            // InternalVideoMontageSVJD.g:5746:3: 
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
    // InternalVideoMontageSVJD.g:5754:1: rule__FadeIn__Group__1 : rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 ;
    public final void rule__FadeIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5758:1: ( rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 )
            // InternalVideoMontageSVJD.g:5759:2: rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2
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
    // InternalVideoMontageSVJD.g:5766:1: rule__FadeIn__Group__1__Impl : ( 'FadeIn' ) ;
    public final void rule__FadeIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5770:1: ( ( 'FadeIn' ) )
            // InternalVideoMontageSVJD.g:5771:1: ( 'FadeIn' )
            {
            // InternalVideoMontageSVJD.g:5771:1: ( 'FadeIn' )
            // InternalVideoMontageSVJD.g:5772:2: 'FadeIn'
            {
             before(grammarAccess.getFadeInAccess().getFadeInKeyword_1()); 
            match(input,59,FOLLOW_2); 
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
    // InternalVideoMontageSVJD.g:5781:1: rule__FadeIn__Group__2 : rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 ;
    public final void rule__FadeIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5785:1: ( rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 )
            // InternalVideoMontageSVJD.g:5786:2: rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3
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
    // InternalVideoMontageSVJD.g:5793:1: rule__FadeIn__Group__2__Impl : ( '{' ) ;
    public final void rule__FadeIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5797:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:5798:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:5798:1: ( '{' )
            // InternalVideoMontageSVJD.g:5799:2: '{'
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
    // InternalVideoMontageSVJD.g:5808:1: rule__FadeIn__Group__3 : rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 ;
    public final void rule__FadeIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5812:1: ( rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 )
            // InternalVideoMontageSVJD.g:5813:2: rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4
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
    // InternalVideoMontageSVJD.g:5820:1: rule__FadeIn__Group__3__Impl : ( ( rule__FadeIn__Group_3__0 )? ) ;
    public final void rule__FadeIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5824:1: ( ( ( rule__FadeIn__Group_3__0 )? ) )
            // InternalVideoMontageSVJD.g:5825:1: ( ( rule__FadeIn__Group_3__0 )? )
            {
            // InternalVideoMontageSVJD.g:5825:1: ( ( rule__FadeIn__Group_3__0 )? )
            // InternalVideoMontageSVJD.g:5826:2: ( rule__FadeIn__Group_3__0 )?
            {
             before(grammarAccess.getFadeInAccess().getGroup_3()); 
            // InternalVideoMontageSVJD.g:5827:2: ( rule__FadeIn__Group_3__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==29) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalVideoMontageSVJD.g:5827:3: rule__FadeIn__Group_3__0
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
    // InternalVideoMontageSVJD.g:5835:1: rule__FadeIn__Group__4 : rule__FadeIn__Group__4__Impl ;
    public final void rule__FadeIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5839:1: ( rule__FadeIn__Group__4__Impl )
            // InternalVideoMontageSVJD.g:5840:2: rule__FadeIn__Group__4__Impl
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
    // InternalVideoMontageSVJD.g:5846:1: rule__FadeIn__Group__4__Impl : ( '}' ) ;
    public final void rule__FadeIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5850:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:5851:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:5851:1: ( '}' )
            // InternalVideoMontageSVJD.g:5852:2: '}'
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
    // InternalVideoMontageSVJD.g:5862:1: rule__FadeIn__Group_3__0 : rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1 ;
    public final void rule__FadeIn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5866:1: ( rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1 )
            // InternalVideoMontageSVJD.g:5867:2: rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1
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
    // InternalVideoMontageSVJD.g:5874:1: rule__FadeIn__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__FadeIn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5878:1: ( ( 'duration' ) )
            // InternalVideoMontageSVJD.g:5879:1: ( 'duration' )
            {
            // InternalVideoMontageSVJD.g:5879:1: ( 'duration' )
            // InternalVideoMontageSVJD.g:5880:2: 'duration'
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
    // InternalVideoMontageSVJD.g:5889:1: rule__FadeIn__Group_3__1 : rule__FadeIn__Group_3__1__Impl ;
    public final void rule__FadeIn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5893:1: ( rule__FadeIn__Group_3__1__Impl )
            // InternalVideoMontageSVJD.g:5894:2: rule__FadeIn__Group_3__1__Impl
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
    // InternalVideoMontageSVJD.g:5900:1: rule__FadeIn__Group_3__1__Impl : ( ( rule__FadeIn__DurationAssignment_3_1 ) ) ;
    public final void rule__FadeIn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5904:1: ( ( ( rule__FadeIn__DurationAssignment_3_1 ) ) )
            // InternalVideoMontageSVJD.g:5905:1: ( ( rule__FadeIn__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontageSVJD.g:5905:1: ( ( rule__FadeIn__DurationAssignment_3_1 ) )
            // InternalVideoMontageSVJD.g:5906:2: ( rule__FadeIn__DurationAssignment_3_1 )
            {
             before(grammarAccess.getFadeInAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontageSVJD.g:5907:2: ( rule__FadeIn__DurationAssignment_3_1 )
            // InternalVideoMontageSVJD.g:5907:3: rule__FadeIn__DurationAssignment_3_1
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
    // InternalVideoMontageSVJD.g:5916:1: rule__FadeOut__Group__0 : rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 ;
    public final void rule__FadeOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5920:1: ( rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 )
            // InternalVideoMontageSVJD.g:5921:2: rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalVideoMontageSVJD.g:5928:1: rule__FadeOut__Group__0__Impl : ( () ) ;
    public final void rule__FadeOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5932:1: ( ( () ) )
            // InternalVideoMontageSVJD.g:5933:1: ( () )
            {
            // InternalVideoMontageSVJD.g:5933:1: ( () )
            // InternalVideoMontageSVJD.g:5934:2: ()
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutAction_0()); 
            // InternalVideoMontageSVJD.g:5935:2: ()
            // InternalVideoMontageSVJD.g:5935:3: 
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
    // InternalVideoMontageSVJD.g:5943:1: rule__FadeOut__Group__1 : rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 ;
    public final void rule__FadeOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5947:1: ( rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 )
            // InternalVideoMontageSVJD.g:5948:2: rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2
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
    // InternalVideoMontageSVJD.g:5955:1: rule__FadeOut__Group__1__Impl : ( 'FadeOut' ) ;
    public final void rule__FadeOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5959:1: ( ( 'FadeOut' ) )
            // InternalVideoMontageSVJD.g:5960:1: ( 'FadeOut' )
            {
            // InternalVideoMontageSVJD.g:5960:1: ( 'FadeOut' )
            // InternalVideoMontageSVJD.g:5961:2: 'FadeOut'
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutKeyword_1()); 
            match(input,60,FOLLOW_2); 
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
    // InternalVideoMontageSVJD.g:5970:1: rule__FadeOut__Group__2 : rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 ;
    public final void rule__FadeOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5974:1: ( rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 )
            // InternalVideoMontageSVJD.g:5975:2: rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3
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
    // InternalVideoMontageSVJD.g:5982:1: rule__FadeOut__Group__2__Impl : ( '{' ) ;
    public final void rule__FadeOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:5986:1: ( ( '{' ) )
            // InternalVideoMontageSVJD.g:5987:1: ( '{' )
            {
            // InternalVideoMontageSVJD.g:5987:1: ( '{' )
            // InternalVideoMontageSVJD.g:5988:2: '{'
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
    // InternalVideoMontageSVJD.g:5997:1: rule__FadeOut__Group__3 : rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 ;
    public final void rule__FadeOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6001:1: ( rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 )
            // InternalVideoMontageSVJD.g:6002:2: rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4
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
    // InternalVideoMontageSVJD.g:6009:1: rule__FadeOut__Group__3__Impl : ( ( rule__FadeOut__Group_3__0 )? ) ;
    public final void rule__FadeOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6013:1: ( ( ( rule__FadeOut__Group_3__0 )? ) )
            // InternalVideoMontageSVJD.g:6014:1: ( ( rule__FadeOut__Group_3__0 )? )
            {
            // InternalVideoMontageSVJD.g:6014:1: ( ( rule__FadeOut__Group_3__0 )? )
            // InternalVideoMontageSVJD.g:6015:2: ( rule__FadeOut__Group_3__0 )?
            {
             before(grammarAccess.getFadeOutAccess().getGroup_3()); 
            // InternalVideoMontageSVJD.g:6016:2: ( rule__FadeOut__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==29) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalVideoMontageSVJD.g:6016:3: rule__FadeOut__Group_3__0
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
    // InternalVideoMontageSVJD.g:6024:1: rule__FadeOut__Group__4 : rule__FadeOut__Group__4__Impl ;
    public final void rule__FadeOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6028:1: ( rule__FadeOut__Group__4__Impl )
            // InternalVideoMontageSVJD.g:6029:2: rule__FadeOut__Group__4__Impl
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
    // InternalVideoMontageSVJD.g:6035:1: rule__FadeOut__Group__4__Impl : ( '}' ) ;
    public final void rule__FadeOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6039:1: ( ( '}' ) )
            // InternalVideoMontageSVJD.g:6040:1: ( '}' )
            {
            // InternalVideoMontageSVJD.g:6040:1: ( '}' )
            // InternalVideoMontageSVJD.g:6041:2: '}'
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
    // InternalVideoMontageSVJD.g:6051:1: rule__FadeOut__Group_3__0 : rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1 ;
    public final void rule__FadeOut__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6055:1: ( rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1 )
            // InternalVideoMontageSVJD.g:6056:2: rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1
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
    // InternalVideoMontageSVJD.g:6063:1: rule__FadeOut__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__FadeOut__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6067:1: ( ( 'duration' ) )
            // InternalVideoMontageSVJD.g:6068:1: ( 'duration' )
            {
            // InternalVideoMontageSVJD.g:6068:1: ( 'duration' )
            // InternalVideoMontageSVJD.g:6069:2: 'duration'
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
    // InternalVideoMontageSVJD.g:6078:1: rule__FadeOut__Group_3__1 : rule__FadeOut__Group_3__1__Impl ;
    public final void rule__FadeOut__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6082:1: ( rule__FadeOut__Group_3__1__Impl )
            // InternalVideoMontageSVJD.g:6083:2: rule__FadeOut__Group_3__1__Impl
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
    // InternalVideoMontageSVJD.g:6089:1: rule__FadeOut__Group_3__1__Impl : ( ( rule__FadeOut__DurationAssignment_3_1 ) ) ;
    public final void rule__FadeOut__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6093:1: ( ( ( rule__FadeOut__DurationAssignment_3_1 ) ) )
            // InternalVideoMontageSVJD.g:6094:1: ( ( rule__FadeOut__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontageSVJD.g:6094:1: ( ( rule__FadeOut__DurationAssignment_3_1 ) )
            // InternalVideoMontageSVJD.g:6095:2: ( rule__FadeOut__DurationAssignment_3_1 )
            {
             before(grammarAccess.getFadeOutAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontageSVJD.g:6096:2: ( rule__FadeOut__DurationAssignment_3_1 )
            // InternalVideoMontageSVJD.g:6096:3: rule__FadeOut__DurationAssignment_3_1
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
    // InternalVideoMontageSVJD.g:6105:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6109:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalVideoMontageSVJD.g:6110:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
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
    // InternalVideoMontageSVJD.g:6117:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6121:1: ( ( ( '-' )? ) )
            // InternalVideoMontageSVJD.g:6122:1: ( ( '-' )? )
            {
            // InternalVideoMontageSVJD.g:6122:1: ( ( '-' )? )
            // InternalVideoMontageSVJD.g:6123:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalVideoMontageSVJD.g:6124:2: ( '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==16) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalVideoMontageSVJD.g:6124:3: '-'
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
    // InternalVideoMontageSVJD.g:6132:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6136:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalVideoMontageSVJD.g:6137:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
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
    // InternalVideoMontageSVJD.g:6144:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6148:1: ( ( ( RULE_INT )? ) )
            // InternalVideoMontageSVJD.g:6149:1: ( ( RULE_INT )? )
            {
            // InternalVideoMontageSVJD.g:6149:1: ( ( RULE_INT )? )
            // InternalVideoMontageSVJD.g:6150:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalVideoMontageSVJD.g:6151:2: ( RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_INT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalVideoMontageSVJD.g:6151:3: RULE_INT
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
    // InternalVideoMontageSVJD.g:6159:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6163:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalVideoMontageSVJD.g:6164:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
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
    // InternalVideoMontageSVJD.g:6171:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6175:1: ( ( '.' ) )
            // InternalVideoMontageSVJD.g:6176:1: ( '.' )
            {
            // InternalVideoMontageSVJD.g:6176:1: ( '.' )
            // InternalVideoMontageSVJD.g:6177:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,61,FOLLOW_2); 
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
    // InternalVideoMontageSVJD.g:6186:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6190:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalVideoMontageSVJD.g:6191:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
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
    // InternalVideoMontageSVJD.g:6198:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6202:1: ( ( RULE_INT ) )
            // InternalVideoMontageSVJD.g:6203:1: ( RULE_INT )
            {
            // InternalVideoMontageSVJD.g:6203:1: ( RULE_INT )
            // InternalVideoMontageSVJD.g:6204:2: RULE_INT
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
    // InternalVideoMontageSVJD.g:6213:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6217:1: ( rule__EDouble__Group__4__Impl )
            // InternalVideoMontageSVJD.g:6218:2: rule__EDouble__Group__4__Impl
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
    // InternalVideoMontageSVJD.g:6224:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6228:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalVideoMontageSVJD.g:6229:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalVideoMontageSVJD.g:6229:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalVideoMontageSVJD.g:6230:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalVideoMontageSVJD.g:6231:2: ( rule__EDouble__Group_4__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=13 && LA51_0<=14)) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalVideoMontageSVJD.g:6231:3: rule__EDouble__Group_4__0
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
    // InternalVideoMontageSVJD.g:6240:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6244:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalVideoMontageSVJD.g:6245:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
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
    // InternalVideoMontageSVJD.g:6252:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6256:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalVideoMontageSVJD.g:6257:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalVideoMontageSVJD.g:6257:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalVideoMontageSVJD.g:6258:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalVideoMontageSVJD.g:6259:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalVideoMontageSVJD.g:6259:3: rule__EDouble__Alternatives_4_0
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
    // InternalVideoMontageSVJD.g:6267:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6271:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalVideoMontageSVJD.g:6272:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
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
    // InternalVideoMontageSVJD.g:6279:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6283:1: ( ( ( '-' )? ) )
            // InternalVideoMontageSVJD.g:6284:1: ( ( '-' )? )
            {
            // InternalVideoMontageSVJD.g:6284:1: ( ( '-' )? )
            // InternalVideoMontageSVJD.g:6285:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalVideoMontageSVJD.g:6286:2: ( '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==16) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalVideoMontageSVJD.g:6286:3: '-'
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
    // InternalVideoMontageSVJD.g:6294:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6298:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalVideoMontageSVJD.g:6299:2: rule__EDouble__Group_4__2__Impl
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
    // InternalVideoMontageSVJD.g:6305:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6309:1: ( ( RULE_INT ) )
            // InternalVideoMontageSVJD.g:6310:1: ( RULE_INT )
            {
            // InternalVideoMontageSVJD.g:6310:1: ( RULE_INT )
            // InternalVideoMontageSVJD.g:6311:2: RULE_INT
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
    // InternalVideoMontageSVJD.g:6321:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6325:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalVideoMontageSVJD.g:6326:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalVideoMontageSVJD.g:6333:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6337:1: ( ( ( '-' )? ) )
            // InternalVideoMontageSVJD.g:6338:1: ( ( '-' )? )
            {
            // InternalVideoMontageSVJD.g:6338:1: ( ( '-' )? )
            // InternalVideoMontageSVJD.g:6339:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalVideoMontageSVJD.g:6340:2: ( '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==16) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalVideoMontageSVJD.g:6340:3: '-'
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
    // InternalVideoMontageSVJD.g:6348:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6352:1: ( rule__EInt__Group__1__Impl )
            // InternalVideoMontageSVJD.g:6353:2: rule__EInt__Group__1__Impl
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
    // InternalVideoMontageSVJD.g:6359:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6363:1: ( ( RULE_INT ) )
            // InternalVideoMontageSVJD.g:6364:1: ( RULE_INT )
            {
            // InternalVideoMontageSVJD.g:6364:1: ( RULE_INT )
            // InternalVideoMontageSVJD.g:6365:2: RULE_INT
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
    // InternalVideoMontageSVJD.g:6375:1: rule__Movie__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__Movie__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6379:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:6380:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:6380:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:6381:3: ruleEString
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
    // InternalVideoMontageSVJD.g:6390:1: rule__Movie__VideoelementAssignment_3 : ( ruleVideoElement ) ;
    public final void rule__Movie__VideoelementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6394:1: ( ( ruleVideoElement ) )
            // InternalVideoMontageSVJD.g:6395:2: ( ruleVideoElement )
            {
            // InternalVideoMontageSVJD.g:6395:2: ( ruleVideoElement )
            // InternalVideoMontageSVJD.g:6396:3: ruleVideoElement
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
    // InternalVideoMontageSVJD.g:6405:1: rule__Movie__VideoelementAssignment_4 : ( ruleVideoElement ) ;
    public final void rule__Movie__VideoelementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6409:1: ( ( ruleVideoElement ) )
            // InternalVideoMontageSVJD.g:6410:2: ( ruleVideoElement )
            {
            // InternalVideoMontageSVJD.g:6410:2: ( ruleVideoElement )
            // InternalVideoMontageSVJD.g:6411:3: ruleVideoElement
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
    // InternalVideoMontageSVJD.g:6420:1: rule__Movie__AudioelementAssignment_5_0 : ( ruleAudioElement ) ;
    public final void rule__Movie__AudioelementAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6424:1: ( ( ruleAudioElement ) )
            // InternalVideoMontageSVJD.g:6425:2: ( ruleAudioElement )
            {
            // InternalVideoMontageSVJD.g:6425:2: ( ruleAudioElement )
            // InternalVideoMontageSVJD.g:6426:3: ruleAudioElement
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
    // InternalVideoMontageSVJD.g:6435:1: rule__Movie__AudioelementAssignment_5_1 : ( ruleAudioElement ) ;
    public final void rule__Movie__AudioelementAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6439:1: ( ( ruleAudioElement ) )
            // InternalVideoMontageSVJD.g:6440:2: ( ruleAudioElement )
            {
            // InternalVideoMontageSVJD.g:6440:2: ( ruleAudioElement )
            // InternalVideoMontageSVJD.g:6441:3: ruleAudioElement
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
    // InternalVideoMontageSVJD.g:6450:1: rule__Movie__SubtitleAssignment_6_0 : ( ruleSubtitle ) ;
    public final void rule__Movie__SubtitleAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6454:1: ( ( ruleSubtitle ) )
            // InternalVideoMontageSVJD.g:6455:2: ( ruleSubtitle )
            {
            // InternalVideoMontageSVJD.g:6455:2: ( ruleSubtitle )
            // InternalVideoMontageSVJD.g:6456:3: ruleSubtitle
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
    // InternalVideoMontageSVJD.g:6465:1: rule__Movie__SubtitleAssignment_6_1 : ( ruleSubtitle ) ;
    public final void rule__Movie__SubtitleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6469:1: ( ( ruleSubtitle ) )
            // InternalVideoMontageSVJD.g:6470:2: ( ruleSubtitle )
            {
            // InternalVideoMontageSVJD.g:6470:2: ( ruleSubtitle )
            // InternalVideoMontageSVJD.g:6471:3: ruleSubtitle
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
    // InternalVideoMontageSVJD.g:6480:1: rule__Movie__VideoTimelineAssignment_7 : ( ruleVideoTimeLine ) ;
    public final void rule__Movie__VideoTimelineAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6484:1: ( ( ruleVideoTimeLine ) )
            // InternalVideoMontageSVJD.g:6485:2: ( ruleVideoTimeLine )
            {
            // InternalVideoMontageSVJD.g:6485:2: ( ruleVideoTimeLine )
            // InternalVideoMontageSVJD.g:6486:3: ruleVideoTimeLine
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
    // InternalVideoMontageSVJD.g:6495:1: rule__VideoTimeLine__VideosAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VideoTimeLine__VideosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6499:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontageSVJD.g:6500:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontageSVJD.g:6500:2: ( ( RULE_ID ) )
            // InternalVideoMontageSVJD.g:6501:3: ( RULE_ID )
            {
             before(grammarAccess.getVideoTimeLineAccess().getVideosVideoElementCrossReference_1_0()); 
            // InternalVideoMontageSVJD.g:6502:3: ( RULE_ID )
            // InternalVideoMontageSVJD.g:6503:4: RULE_ID
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
    // InternalVideoMontageSVJD.g:6514:1: rule__VideoTimeLine__VideosAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__VideoTimeLine__VideosAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6518:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontageSVJD.g:6519:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontageSVJD.g:6519:2: ( ( RULE_ID ) )
            // InternalVideoMontageSVJD.g:6520:3: ( RULE_ID )
            {
             before(grammarAccess.getVideoTimeLineAccess().getVideosVideoElementCrossReference_2_0()); 
            // InternalVideoMontageSVJD.g:6521:3: ( RULE_ID )
            // InternalVideoMontageSVJD.g:6522:4: RULE_ID
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
    // InternalVideoMontageSVJD.g:6533:1: rule__Subtitle__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Subtitle__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6537:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:6538:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:6538:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:6539:3: ruleEString
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
    // InternalVideoMontageSVJD.g:6548:1: rule__Subtitle__StartingmomentAssignment_4 : ( ruleStartingMoment ) ;
    public final void rule__Subtitle__StartingmomentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6552:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontageSVJD.g:6553:2: ( ruleStartingMoment )
            {
            // InternalVideoMontageSVJD.g:6553:2: ( ruleStartingMoment )
            // InternalVideoMontageSVJD.g:6554:3: ruleStartingMoment
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
    // InternalVideoMontageSVJD.g:6563:1: rule__Subtitle__DurationAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__Subtitle__DurationAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6567:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:6568:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:6568:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:6569:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:6578:1: rule__Subtitle__TextareaAssignment_8 : ( ruleTextArea ) ;
    public final void rule__Subtitle__TextareaAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6582:1: ( ( ruleTextArea ) )
            // InternalVideoMontageSVJD.g:6583:2: ( ruleTextArea )
            {
            // InternalVideoMontageSVJD.g:6583:2: ( ruleTextArea )
            // InternalVideoMontageSVJD.g:6584:3: ruleTextArea
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
    // InternalVideoMontageSVJD.g:6593:1: rule__Audio__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Audio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6597:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:6598:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:6598:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:6599:3: ruleEString
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


    // $ANTLR start "rule__Audio__PathAssignment_3_1"
    // InternalVideoMontageSVJD.g:6608:1: rule__Audio__PathAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Audio__PathAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6612:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:6613:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:6613:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:6614:3: ruleEString
            {
             before(grammarAccess.getAudioAccess().getPathEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getPathEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__PathAssignment_3_1"


    // $ANTLR start "rule__Audio__TransitionAssignment_4_1"
    // InternalVideoMontageSVJD.g:6623:1: rule__Audio__TransitionAssignment_4_1 : ( ruleTransition ) ;
    public final void rule__Audio__TransitionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6627:1: ( ( ruleTransition ) )
            // InternalVideoMontageSVJD.g:6628:2: ( ruleTransition )
            {
            // InternalVideoMontageSVJD.g:6628:2: ( ruleTransition )
            // InternalVideoMontageSVJD.g:6629:3: ruleTransition
            {
             before(grammarAccess.getAudioAccess().getTransitionTransitionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getTransitionTransitionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__TransitionAssignment_4_1"


    // $ANTLR start "rule__AudioClip__NameAssignment_1"
    // InternalVideoMontageSVJD.g:6638:1: rule__AudioClip__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AudioClip__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6642:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:6643:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:6643:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:6644:3: ruleEString
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
    // InternalVideoMontageSVJD.g:6653:1: rule__AudioClip__StartingmomentAssignment_4 : ( ruleStartingMoment ) ;
    public final void rule__AudioClip__StartingmomentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6657:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontageSVJD.g:6658:2: ( ruleStartingMoment )
            {
            // InternalVideoMontageSVJD.g:6658:2: ( ruleStartingMoment )
            // InternalVideoMontageSVJD.g:6659:3: ruleStartingMoment
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
    // InternalVideoMontageSVJD.g:6668:1: rule__AudioClip__VolumeAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__VolumeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6672:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:6673:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:6673:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:6674:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:6683:1: rule__AudioClip__StartCutAssignment_7_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__StartCutAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6687:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:6688:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:6688:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:6689:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:6698:1: rule__AudioClip__EndCutAssignment_8_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__EndCutAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6702:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:6703:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:6703:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:6704:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:6713:1: rule__AudioClip__TransitionAssignment_9_1 : ( ruleTransition ) ;
    public final void rule__AudioClip__TransitionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6717:1: ( ( ruleTransition ) )
            // InternalVideoMontageSVJD.g:6718:2: ( ruleTransition )
            {
            // InternalVideoMontageSVJD.g:6718:2: ( ruleTransition )
            // InternalVideoMontageSVJD.g:6719:3: ruleTransition
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
    // InternalVideoMontageSVJD.g:6728:1: rule__AudioClip__AudioAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__AudioClip__AudioAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6732:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontageSVJD.g:6733:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontageSVJD.g:6733:2: ( ( RULE_ID ) )
            // InternalVideoMontageSVJD.g:6734:3: ( RULE_ID )
            {
             before(grammarAccess.getAudioClipAccess().getAudioAudioCrossReference_11_0()); 
            // InternalVideoMontageSVJD.g:6735:3: ( RULE_ID )
            // InternalVideoMontageSVJD.g:6736:4: RULE_ID
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
    // InternalVideoMontageSVJD.g:6747:1: rule__Clip__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Clip__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6751:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:6752:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:6752:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:6753:3: ruleEString
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
    // InternalVideoMontageSVJD.g:6762:1: rule__Clip__StartCutAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Clip__StartCutAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6766:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:6767:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:6767:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:6768:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:6777:1: rule__Clip__EndCutAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__Clip__EndCutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6781:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:6782:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:6782:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:6783:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:6792:1: rule__Clip__VideoAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Clip__VideoAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6796:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontageSVJD.g:6797:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontageSVJD.g:6797:2: ( ( RULE_ID ) )
            // InternalVideoMontageSVJD.g:6798:3: ( RULE_ID )
            {
             before(grammarAccess.getClipAccess().getVideoVideoCrossReference_6_0()); 
            // InternalVideoMontageSVJD.g:6799:3: ( RULE_ID )
            // InternalVideoMontageSVJD.g:6800:4: RULE_ID
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
    // InternalVideoMontageSVJD.g:6811:1: rule__Title__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Title__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6815:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:6816:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:6816:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:6817:3: ruleEString
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
    // InternalVideoMontageSVJD.g:6826:1: rule__Title__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Title__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6830:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:6831:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:6831:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:6832:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:6841:1: rule__Title__BackgroundColorAssignment_4_1 : ( ruleColor ) ;
    public final void rule__Title__BackgroundColorAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6845:1: ( ( ruleColor ) )
            // InternalVideoMontageSVJD.g:6846:2: ( ruleColor )
            {
            // InternalVideoMontageSVJD.g:6846:2: ( ruleColor )
            // InternalVideoMontageSVJD.g:6847:3: ruleColor
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
    // InternalVideoMontageSVJD.g:6856:1: rule__Title__TextareaAssignment_6 : ( ruleTextArea ) ;
    public final void rule__Title__TextareaAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6860:1: ( ( ruleTextArea ) )
            // InternalVideoMontageSVJD.g:6861:2: ( ruleTextArea )
            {
            // InternalVideoMontageSVJD.g:6861:2: ( ruleTextArea )
            // InternalVideoMontageSVJD.g:6862:3: ruleTextArea
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
    // InternalVideoMontageSVJD.g:6871:1: rule__Video__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6875:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:6876:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:6876:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:6877:3: ruleEString
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
    // InternalVideoMontageSVJD.g:6886:1: rule__Video__PathAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Video__PathAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6890:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:6891:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:6891:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:6892:3: ruleEString
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
    // InternalVideoMontageSVJD.g:6901:1: rule__RelativeMoment__MomentAssignment_1 : ( ruleMoment ) ;
    public final void rule__RelativeMoment__MomentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6905:1: ( ( ruleMoment ) )
            // InternalVideoMontageSVJD.g:6906:2: ( ruleMoment )
            {
            // InternalVideoMontageSVJD.g:6906:2: ( ruleMoment )
            // InternalVideoMontageSVJD.g:6907:3: ruleMoment
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
    // InternalVideoMontageSVJD.g:6916:1: rule__RelativeMoment__ElementAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__RelativeMoment__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6920:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontageSVJD.g:6921:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontageSVJD.g:6921:2: ( ( RULE_ID ) )
            // InternalVideoMontageSVJD.g:6922:3: ( RULE_ID )
            {
             before(grammarAccess.getRelativeMomentAccess().getElementElementCrossReference_3_0()); 
            // InternalVideoMontageSVJD.g:6923:3: ( RULE_ID )
            // InternalVideoMontageSVJD.g:6924:4: RULE_ID
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
    // InternalVideoMontageSVJD.g:6935:1: rule__RelativeMoment__OperationMomentAssignment_4_0 : ( ruleOperationMoment ) ;
    public final void rule__RelativeMoment__OperationMomentAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6939:1: ( ( ruleOperationMoment ) )
            // InternalVideoMontageSVJD.g:6940:2: ( ruleOperationMoment )
            {
            // InternalVideoMontageSVJD.g:6940:2: ( ruleOperationMoment )
            // InternalVideoMontageSVJD.g:6941:3: ruleOperationMoment
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
    // InternalVideoMontageSVJD.g:6950:1: rule__RelativeMoment__ValueAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__RelativeMoment__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6954:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:6955:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:6955:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:6956:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:6965:1: rule__AbsoluteMoment__TimeAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__AbsoluteMoment__TimeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6969:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:6970:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:6970:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:6971:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:6980:1: rule__Transition__DurationAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__Transition__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6984:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:6985:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:6985:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:6986:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:6995:1: rule__Transition__AudioelementAssignment_4 : ( ruleAudioElement ) ;
    public final void rule__Transition__AudioelementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:6999:1: ( ( ruleAudioElement ) )
            // InternalVideoMontageSVJD.g:7000:2: ( ruleAudioElement )
            {
            // InternalVideoMontageSVJD.g:7000:2: ( ruleAudioElement )
            // InternalVideoMontageSVJD.g:7001:3: ruleAudioElement
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
    // InternalVideoMontageSVJD.g:7010:1: rule__TextArea_Impl__XAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__TextArea_Impl__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7014:1: ( ( ruleEInt ) )
            // InternalVideoMontageSVJD.g:7015:2: ( ruleEInt )
            {
            // InternalVideoMontageSVJD.g:7015:2: ( ruleEInt )
            // InternalVideoMontageSVJD.g:7016:3: ruleEInt
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
    // InternalVideoMontageSVJD.g:7025:1: rule__TextArea_Impl__YAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__TextArea_Impl__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7029:1: ( ( ruleEInt ) )
            // InternalVideoMontageSVJD.g:7030:2: ( ruleEInt )
            {
            // InternalVideoMontageSVJD.g:7030:2: ( ruleEInt )
            // InternalVideoMontageSVJD.g:7031:3: ruleEInt
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
    // InternalVideoMontageSVJD.g:7040:1: rule__TextArea_Impl__WidthAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__TextArea_Impl__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7044:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:7045:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:7045:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:7046:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:7055:1: rule__TextArea_Impl__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__TextArea_Impl__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7059:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:7060:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:7060:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:7061:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:7070:1: rule__TextArea_Impl__TextAssignment_6_1 : ( ruleEString ) ;
    public final void rule__TextArea_Impl__TextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7074:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:7075:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:7075:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:7076:3: ruleEString
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
    // InternalVideoMontageSVJD.g:7085:1: rule__TextArea_Impl__FontAssignment_7_1 : ( ( RULE_ID ) ) ;
    public final void rule__TextArea_Impl__FontAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7089:1: ( ( ( RULE_ID ) ) )
            // InternalVideoMontageSVJD.g:7090:2: ( ( RULE_ID ) )
            {
            // InternalVideoMontageSVJD.g:7090:2: ( ( RULE_ID ) )
            // InternalVideoMontageSVJD.g:7091:3: ( RULE_ID )
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontFontCrossReference_7_1_0()); 
            // InternalVideoMontageSVJD.g:7092:3: ( RULE_ID )
            // InternalVideoMontageSVJD.g:7093:4: RULE_ID
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
    // InternalVideoMontageSVJD.g:7104:1: rule__TextArea_Impl__AnimationAssignment_8_1 : ( ruleAnimation ) ;
    public final void rule__TextArea_Impl__AnimationAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7108:1: ( ( ruleAnimation ) )
            // InternalVideoMontageSVJD.g:7109:2: ( ruleAnimation )
            {
            // InternalVideoMontageSVJD.g:7109:2: ( ruleAnimation )
            // InternalVideoMontageSVJD.g:7110:3: ruleAnimation
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
    // InternalVideoMontageSVJD.g:7119:1: rule__TextArea_Impl__AnimationAssignment_8_2 : ( ruleAnimation ) ;
    public final void rule__TextArea_Impl__AnimationAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7123:1: ( ( ruleAnimation ) )
            // InternalVideoMontageSVJD.g:7124:2: ( ruleAnimation )
            {
            // InternalVideoMontageSVJD.g:7124:2: ( ruleAnimation )
            // InternalVideoMontageSVJD.g:7125:3: ruleAnimation
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
    // InternalVideoMontageSVJD.g:7134:1: rule__TextAreaDynamic__XAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7138:1: ( ( ruleEInt ) )
            // InternalVideoMontageSVJD.g:7139:2: ( ruleEInt )
            {
            // InternalVideoMontageSVJD.g:7139:2: ( ruleEInt )
            // InternalVideoMontageSVJD.g:7140:3: ruleEInt
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
    // InternalVideoMontageSVJD.g:7149:1: rule__TextAreaDynamic__YAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7153:1: ( ( ruleEInt ) )
            // InternalVideoMontageSVJD.g:7154:2: ( ruleEInt )
            {
            // InternalVideoMontageSVJD.g:7154:2: ( ruleEInt )
            // InternalVideoMontageSVJD.g:7155:3: ruleEInt
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
    // InternalVideoMontageSVJD.g:7164:1: rule__TextAreaDynamic__WidthAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__TextAreaDynamic__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7168:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:7169:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:7169:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:7170:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:7179:1: rule__TextAreaDynamic__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__TextAreaDynamic__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7183:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:7184:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:7184:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:7185:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:7194:1: rule__TextAreaDynamic__TextAssignment_6_1 : ( ruleEString ) ;
    public final void rule__TextAreaDynamic__TextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7198:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:7199:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:7199:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:7200:3: ruleEString
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
    // InternalVideoMontageSVJD.g:7209:1: rule__TextAreaDynamic__TextSrcAssignment_7_1 : ( ruleEString ) ;
    public final void rule__TextAreaDynamic__TextSrcAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7213:1: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:7214:2: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:7214:2: ( ruleEString )
            // InternalVideoMontageSVJD.g:7215:3: ruleEString
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
    // InternalVideoMontageSVJD.g:7224:1: rule__TextAreaDynamic__LineAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__LineAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7228:1: ( ( ruleEInt ) )
            // InternalVideoMontageSVJD.g:7229:2: ( ruleEInt )
            {
            // InternalVideoMontageSVJD.g:7229:2: ( ruleEInt )
            // InternalVideoMontageSVJD.g:7230:3: ruleEInt
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
    // InternalVideoMontageSVJD.g:7239:1: rule__TextAreaDynamic__FontAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__TextAreaDynamic__FontAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7243:1: ( ( ( ruleEString ) ) )
            // InternalVideoMontageSVJD.g:7244:2: ( ( ruleEString ) )
            {
            // InternalVideoMontageSVJD.g:7244:2: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:7245:3: ( ruleEString )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontFontCrossReference_10_0()); 
            // InternalVideoMontageSVJD.g:7246:3: ( ruleEString )
            // InternalVideoMontageSVJD.g:7247:4: ruleEString
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
    // InternalVideoMontageSVJD.g:7258:1: rule__TextAreaDynamic__AnimationAssignment_11_1 : ( ruleAnimation ) ;
    public final void rule__TextAreaDynamic__AnimationAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7262:1: ( ( ruleAnimation ) )
            // InternalVideoMontageSVJD.g:7263:2: ( ruleAnimation )
            {
            // InternalVideoMontageSVJD.g:7263:2: ( ruleAnimation )
            // InternalVideoMontageSVJD.g:7264:3: ruleAnimation
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
    // InternalVideoMontageSVJD.g:7273:1: rule__TextAreaDynamic__AnimationAssignment_11_2 : ( ruleAnimation ) ;
    public final void rule__TextAreaDynamic__AnimationAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7277:1: ( ( ruleAnimation ) )
            // InternalVideoMontageSVJD.g:7278:2: ( ruleAnimation )
            {
            // InternalVideoMontageSVJD.g:7278:2: ( ruleAnimation )
            // InternalVideoMontageSVJD.g:7279:3: ruleAnimation
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


    // $ANTLR start "rule__ScrollingText__SpeedAssignment_3_1"
    // InternalVideoMontageSVJD.g:7288:1: rule__ScrollingText__SpeedAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__ScrollingText__SpeedAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7292:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:7293:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:7293:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:7294:3: ruleEDouble
            {
             before(grammarAccess.getScrollingTextAccess().getSpeedEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getScrollingTextAccess().getSpeedEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__SpeedAssignment_3_1"


    // $ANTLR start "rule__ScrollingText__DurationAssignment_4_1"
    // InternalVideoMontageSVJD.g:7303:1: rule__ScrollingText__DurationAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__ScrollingText__DurationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7307:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:7308:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:7308:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:7309:3: ruleEDouble
            {
             before(grammarAccess.getScrollingTextAccess().getDurationEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getScrollingTextAccess().getDurationEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScrollingText__DurationAssignment_4_1"


    // $ANTLR start "rule__FadeIn__DurationAssignment_3_1"
    // InternalVideoMontageSVJD.g:7318:1: rule__FadeIn__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__FadeIn__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7322:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:7323:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:7323:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:7324:3: ruleEDouble
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
    // InternalVideoMontageSVJD.g:7333:1: rule__FadeOut__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__FadeOut__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontageSVJD.g:7337:1: ( ( ruleEDouble ) )
            // InternalVideoMontageSVJD.g:7338:2: ( ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:7338:2: ( ruleEDouble )
            // InternalVideoMontageSVJD.g:7339:3: ruleEDouble
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
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x2000000000010040L});
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
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1A00000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1A00000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x019F800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000020200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000006000L});

}