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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'BLACK'", "'E'", "'e'", "'starting'", "'ending'", "'Movie'", "'{'", "'audioelement'", "'}'", "'videoelement'", "'subtitle'", "'title'", "','", "'Subtitle'", "'relativemoment'", "'textarea'", "'startingmoment'", "'duration'", "'-'", "'.'", "'RelativeMoment'", "'moment'", "'value'", "'Transition'", "'StartingMoment'", "'Audio'", "'audioclip'", "'path'", "'transition'", "'AudioClip'", "'volume'", "'startCut'", "'endCut'", "'audio'", "'AbsoluteMoment'", "'time'", "'Title'", "'backgroundColor'", "'Clip'", "'video'", "'Video'", "'clip'", "'TextArea'", "'font'", "'x'", "'y'", "'width'", "'height'", "'text'", "'animation'", "'TextAreaDynamic'", "'textSrc'", "'line'", "'FadeIn'", "'FadeOut'"
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // InternalVideoMontage.g:87:1: ruleAudioElement : ( ( rule__AudioElement__Alternatives ) ) ;
    public final void ruleAudioElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:91:2: ( ( ( rule__AudioElement__Alternatives ) ) )
            // InternalVideoMontage.g:92:2: ( ( rule__AudioElement__Alternatives ) )
            {
            // InternalVideoMontage.g:92:2: ( ( rule__AudioElement__Alternatives ) )
            // InternalVideoMontage.g:93:3: ( rule__AudioElement__Alternatives )
            {
             before(grammarAccess.getAudioElementAccess().getAlternatives()); 
            // InternalVideoMontage.g:94:3: ( rule__AudioElement__Alternatives )
            // InternalVideoMontage.g:94:4: rule__AudioElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AudioElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAudioElementAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalVideoMontage.g:112:1: ruleVideoElement : ( ( rule__VideoElement__Alternatives ) ) ;
    public final void ruleVideoElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:116:2: ( ( ( rule__VideoElement__Alternatives ) ) )
            // InternalVideoMontage.g:117:2: ( ( rule__VideoElement__Alternatives ) )
            {
            // InternalVideoMontage.g:117:2: ( ( rule__VideoElement__Alternatives ) )
            // InternalVideoMontage.g:118:3: ( rule__VideoElement__Alternatives )
            {
             before(grammarAccess.getVideoElementAccess().getAlternatives()); 
            // InternalVideoMontage.g:119:3: ( rule__VideoElement__Alternatives )
            // InternalVideoMontage.g:119:4: rule__VideoElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VideoElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVideoElementAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleEDouble"
    // InternalVideoMontage.g:253:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalVideoMontage.g:254:1: ( ruleEDouble EOF )
            // InternalVideoMontage.g:255:1: ruleEDouble EOF
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
    // InternalVideoMontage.g:262:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:266:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalVideoMontage.g:267:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalVideoMontage.g:267:2: ( ( rule__EDouble__Group__0 ) )
            // InternalVideoMontage.g:268:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalVideoMontage.g:269:3: ( rule__EDouble__Group__0 )
            // InternalVideoMontage.g:269:4: rule__EDouble__Group__0
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


    // $ANTLR start "entryRuleRelativeMoment"
    // InternalVideoMontage.g:278:1: entryRuleRelativeMoment : ruleRelativeMoment EOF ;
    public final void entryRuleRelativeMoment() throws RecognitionException {
        try {
            // InternalVideoMontage.g:279:1: ( ruleRelativeMoment EOF )
            // InternalVideoMontage.g:280:1: ruleRelativeMoment EOF
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
    // InternalVideoMontage.g:287:1: ruleRelativeMoment : ( ( rule__RelativeMoment__Group__0 ) ) ;
    public final void ruleRelativeMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:291:2: ( ( ( rule__RelativeMoment__Group__0 ) ) )
            // InternalVideoMontage.g:292:2: ( ( rule__RelativeMoment__Group__0 ) )
            {
            // InternalVideoMontage.g:292:2: ( ( rule__RelativeMoment__Group__0 ) )
            // InternalVideoMontage.g:293:3: ( rule__RelativeMoment__Group__0 )
            {
             before(grammarAccess.getRelativeMomentAccess().getGroup()); 
            // InternalVideoMontage.g:294:3: ( rule__RelativeMoment__Group__0 )
            // InternalVideoMontage.g:294:4: rule__RelativeMoment__Group__0
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


    // $ANTLR start "entryRuleTransition"
    // InternalVideoMontage.g:303:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalVideoMontage.g:304:1: ( ruleTransition EOF )
            // InternalVideoMontage.g:305:1: ruleTransition EOF
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
    // InternalVideoMontage.g:312:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:316:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalVideoMontage.g:317:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalVideoMontage.g:317:2: ( ( rule__Transition__Group__0 ) )
            // InternalVideoMontage.g:318:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalVideoMontage.g:319:3: ( rule__Transition__Group__0 )
            // InternalVideoMontage.g:319:4: rule__Transition__Group__0
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


    // $ANTLR start "entryRuleStartingMoment_Impl"
    // InternalVideoMontage.g:328:1: entryRuleStartingMoment_Impl : ruleStartingMoment_Impl EOF ;
    public final void entryRuleStartingMoment_Impl() throws RecognitionException {
        try {
            // InternalVideoMontage.g:329:1: ( ruleStartingMoment_Impl EOF )
            // InternalVideoMontage.g:330:1: ruleStartingMoment_Impl EOF
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
    // InternalVideoMontage.g:337:1: ruleStartingMoment_Impl : ( ( rule__StartingMoment_Impl__Group__0 ) ) ;
    public final void ruleStartingMoment_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:341:2: ( ( ( rule__StartingMoment_Impl__Group__0 ) ) )
            // InternalVideoMontage.g:342:2: ( ( rule__StartingMoment_Impl__Group__0 ) )
            {
            // InternalVideoMontage.g:342:2: ( ( rule__StartingMoment_Impl__Group__0 ) )
            // InternalVideoMontage.g:343:3: ( rule__StartingMoment_Impl__Group__0 )
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getGroup()); 
            // InternalVideoMontage.g:344:3: ( rule__StartingMoment_Impl__Group__0 )
            // InternalVideoMontage.g:344:4: rule__StartingMoment_Impl__Group__0
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


    // $ANTLR start "entryRuleAudio"
    // InternalVideoMontage.g:353:1: entryRuleAudio : ruleAudio EOF ;
    public final void entryRuleAudio() throws RecognitionException {
        try {
            // InternalVideoMontage.g:354:1: ( ruleAudio EOF )
            // InternalVideoMontage.g:355:1: ruleAudio EOF
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
    // InternalVideoMontage.g:362:1: ruleAudio : ( ( rule__Audio__Group__0 ) ) ;
    public final void ruleAudio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:366:2: ( ( ( rule__Audio__Group__0 ) ) )
            // InternalVideoMontage.g:367:2: ( ( rule__Audio__Group__0 ) )
            {
            // InternalVideoMontage.g:367:2: ( ( rule__Audio__Group__0 ) )
            // InternalVideoMontage.g:368:3: ( rule__Audio__Group__0 )
            {
             before(grammarAccess.getAudioAccess().getGroup()); 
            // InternalVideoMontage.g:369:3: ( rule__Audio__Group__0 )
            // InternalVideoMontage.g:369:4: rule__Audio__Group__0
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
    // InternalVideoMontage.g:378:1: entryRuleAudioClip : ruleAudioClip EOF ;
    public final void entryRuleAudioClip() throws RecognitionException {
        try {
            // InternalVideoMontage.g:379:1: ( ruleAudioClip EOF )
            // InternalVideoMontage.g:380:1: ruleAudioClip EOF
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
    // InternalVideoMontage.g:387:1: ruleAudioClip : ( ( rule__AudioClip__Group__0 ) ) ;
    public final void ruleAudioClip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:391:2: ( ( ( rule__AudioClip__Group__0 ) ) )
            // InternalVideoMontage.g:392:2: ( ( rule__AudioClip__Group__0 ) )
            {
            // InternalVideoMontage.g:392:2: ( ( rule__AudioClip__Group__0 ) )
            // InternalVideoMontage.g:393:3: ( rule__AudioClip__Group__0 )
            {
             before(grammarAccess.getAudioClipAccess().getGroup()); 
            // InternalVideoMontage.g:394:3: ( rule__AudioClip__Group__0 )
            // InternalVideoMontage.g:394:4: rule__AudioClip__Group__0
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


    // $ANTLR start "entryRuleAbsoluteMoment"
    // InternalVideoMontage.g:403:1: entryRuleAbsoluteMoment : ruleAbsoluteMoment EOF ;
    public final void entryRuleAbsoluteMoment() throws RecognitionException {
        try {
            // InternalVideoMontage.g:404:1: ( ruleAbsoluteMoment EOF )
            // InternalVideoMontage.g:405:1: ruleAbsoluteMoment EOF
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
    // InternalVideoMontage.g:412:1: ruleAbsoluteMoment : ( ( rule__AbsoluteMoment__Group__0 ) ) ;
    public final void ruleAbsoluteMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:416:2: ( ( ( rule__AbsoluteMoment__Group__0 ) ) )
            // InternalVideoMontage.g:417:2: ( ( rule__AbsoluteMoment__Group__0 ) )
            {
            // InternalVideoMontage.g:417:2: ( ( rule__AbsoluteMoment__Group__0 ) )
            // InternalVideoMontage.g:418:3: ( rule__AbsoluteMoment__Group__0 )
            {
             before(grammarAccess.getAbsoluteMomentAccess().getGroup()); 
            // InternalVideoMontage.g:419:3: ( rule__AbsoluteMoment__Group__0 )
            // InternalVideoMontage.g:419:4: rule__AbsoluteMoment__Group__0
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


    // $ANTLR start "entryRuleTitle"
    // InternalVideoMontage.g:428:1: entryRuleTitle : ruleTitle EOF ;
    public final void entryRuleTitle() throws RecognitionException {
        try {
            // InternalVideoMontage.g:429:1: ( ruleTitle EOF )
            // InternalVideoMontage.g:430:1: ruleTitle EOF
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
    // InternalVideoMontage.g:437:1: ruleTitle : ( ( rule__Title__Group__0 ) ) ;
    public final void ruleTitle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:441:2: ( ( ( rule__Title__Group__0 ) ) )
            // InternalVideoMontage.g:442:2: ( ( rule__Title__Group__0 ) )
            {
            // InternalVideoMontage.g:442:2: ( ( rule__Title__Group__0 ) )
            // InternalVideoMontage.g:443:3: ( rule__Title__Group__0 )
            {
             before(grammarAccess.getTitleAccess().getGroup()); 
            // InternalVideoMontage.g:444:3: ( rule__Title__Group__0 )
            // InternalVideoMontage.g:444:4: rule__Title__Group__0
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


    // $ANTLR start "entryRuleClip"
    // InternalVideoMontage.g:453:1: entryRuleClip : ruleClip EOF ;
    public final void entryRuleClip() throws RecognitionException {
        try {
            // InternalVideoMontage.g:454:1: ( ruleClip EOF )
            // InternalVideoMontage.g:455:1: ruleClip EOF
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
    // InternalVideoMontage.g:462:1: ruleClip : ( ( rule__Clip__Group__0 ) ) ;
    public final void ruleClip() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:466:2: ( ( ( rule__Clip__Group__0 ) ) )
            // InternalVideoMontage.g:467:2: ( ( rule__Clip__Group__0 ) )
            {
            // InternalVideoMontage.g:467:2: ( ( rule__Clip__Group__0 ) )
            // InternalVideoMontage.g:468:3: ( rule__Clip__Group__0 )
            {
             before(grammarAccess.getClipAccess().getGroup()); 
            // InternalVideoMontage.g:469:3: ( rule__Clip__Group__0 )
            // InternalVideoMontage.g:469:4: rule__Clip__Group__0
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
    // InternalVideoMontage.g:478:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalVideoMontage.g:479:1: ( ruleVideo EOF )
            // InternalVideoMontage.g:480:1: ruleVideo EOF
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
    // InternalVideoMontage.g:487:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:491:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalVideoMontage.g:492:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalVideoMontage.g:492:2: ( ( rule__Video__Group__0 ) )
            // InternalVideoMontage.g:493:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalVideoMontage.g:494:3: ( rule__Video__Group__0 )
            // InternalVideoMontage.g:494:4: rule__Video__Group__0
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


    // $ANTLR start "entryRuleEInt"
    // InternalVideoMontage.g:528:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalVideoMontage.g:529:1: ( ruleEInt EOF )
            // InternalVideoMontage.g:530:1: ruleEInt EOF
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
    // InternalVideoMontage.g:537:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:541:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalVideoMontage.g:542:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalVideoMontage.g:542:2: ( ( rule__EInt__Group__0 ) )
            // InternalVideoMontage.g:543:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalVideoMontage.g:544:3: ( rule__EInt__Group__0 )
            // InternalVideoMontage.g:544:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleTextAreaDynamic"
    // InternalVideoMontage.g:553:1: entryRuleTextAreaDynamic : ruleTextAreaDynamic EOF ;
    public final void entryRuleTextAreaDynamic() throws RecognitionException {
        try {
            // InternalVideoMontage.g:554:1: ( ruleTextAreaDynamic EOF )
            // InternalVideoMontage.g:555:1: ruleTextAreaDynamic EOF
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
    // InternalVideoMontage.g:562:1: ruleTextAreaDynamic : ( ( rule__TextAreaDynamic__Group__0 ) ) ;
    public final void ruleTextAreaDynamic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:566:2: ( ( ( rule__TextAreaDynamic__Group__0 ) ) )
            // InternalVideoMontage.g:567:2: ( ( rule__TextAreaDynamic__Group__0 ) )
            {
            // InternalVideoMontage.g:567:2: ( ( rule__TextAreaDynamic__Group__0 ) )
            // InternalVideoMontage.g:568:3: ( rule__TextAreaDynamic__Group__0 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup()); 
            // InternalVideoMontage.g:569:3: ( rule__TextAreaDynamic__Group__0 )
            // InternalVideoMontage.g:569:4: rule__TextAreaDynamic__Group__0
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
    // InternalVideoMontage.g:578:1: entryRuleFadeIn : ruleFadeIn EOF ;
    public final void entryRuleFadeIn() throws RecognitionException {
        try {
            // InternalVideoMontage.g:579:1: ( ruleFadeIn EOF )
            // InternalVideoMontage.g:580:1: ruleFadeIn EOF
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
    // InternalVideoMontage.g:587:1: ruleFadeIn : ( ( rule__FadeIn__Group__0 ) ) ;
    public final void ruleFadeIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:591:2: ( ( ( rule__FadeIn__Group__0 ) ) )
            // InternalVideoMontage.g:592:2: ( ( rule__FadeIn__Group__0 ) )
            {
            // InternalVideoMontage.g:592:2: ( ( rule__FadeIn__Group__0 ) )
            // InternalVideoMontage.g:593:3: ( rule__FadeIn__Group__0 )
            {
             before(grammarAccess.getFadeInAccess().getGroup()); 
            // InternalVideoMontage.g:594:3: ( rule__FadeIn__Group__0 )
            // InternalVideoMontage.g:594:4: rule__FadeIn__Group__0
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
    // InternalVideoMontage.g:603:1: entryRuleFadeOut : ruleFadeOut EOF ;
    public final void entryRuleFadeOut() throws RecognitionException {
        try {
            // InternalVideoMontage.g:604:1: ( ruleFadeOut EOF )
            // InternalVideoMontage.g:605:1: ruleFadeOut EOF
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
    // InternalVideoMontage.g:612:1: ruleFadeOut : ( ( rule__FadeOut__Group__0 ) ) ;
    public final void ruleFadeOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:616:2: ( ( ( rule__FadeOut__Group__0 ) ) )
            // InternalVideoMontage.g:617:2: ( ( rule__FadeOut__Group__0 ) )
            {
            // InternalVideoMontage.g:617:2: ( ( rule__FadeOut__Group__0 ) )
            // InternalVideoMontage.g:618:3: ( rule__FadeOut__Group__0 )
            {
             before(grammarAccess.getFadeOutAccess().getGroup()); 
            // InternalVideoMontage.g:619:3: ( rule__FadeOut__Group__0 )
            // InternalVideoMontage.g:619:4: rule__FadeOut__Group__0
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


    // $ANTLR start "ruleMoment"
    // InternalVideoMontage.g:628:1: ruleMoment : ( ( rule__Moment__Alternatives ) ) ;
    public final void ruleMoment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:632:1: ( ( ( rule__Moment__Alternatives ) ) )
            // InternalVideoMontage.g:633:2: ( ( rule__Moment__Alternatives ) )
            {
            // InternalVideoMontage.g:633:2: ( ( rule__Moment__Alternatives ) )
            // InternalVideoMontage.g:634:3: ( rule__Moment__Alternatives )
            {
             before(grammarAccess.getMomentAccess().getAlternatives()); 
            // InternalVideoMontage.g:635:3: ( rule__Moment__Alternatives )
            // InternalVideoMontage.g:635:4: rule__Moment__Alternatives
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
    // InternalVideoMontage.g:644:1: ruleColor : ( ( 'BLACK' ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:648:1: ( ( ( 'BLACK' ) ) )
            // InternalVideoMontage.g:649:2: ( ( 'BLACK' ) )
            {
            // InternalVideoMontage.g:649:2: ( ( 'BLACK' ) )
            // InternalVideoMontage.g:650:3: ( 'BLACK' )
            {
             before(grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration()); 
            // InternalVideoMontage.g:651:3: ( 'BLACK' )
            // InternalVideoMontage.g:651:4: 'BLACK'
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


    // $ANTLR start "rule__AudioElement__Alternatives"
    // InternalVideoMontage.g:659:1: rule__AudioElement__Alternatives : ( ( ruleAudio ) | ( ruleAudioClip ) );
    public final void rule__AudioElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:663:1: ( ( ruleAudio ) | ( ruleAudioClip ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==36) ) {
                alt1=1;
            }
            else if ( (LA1_0==40) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalVideoMontage.g:664:2: ( ruleAudio )
                    {
                    // InternalVideoMontage.g:664:2: ( ruleAudio )
                    // InternalVideoMontage.g:665:3: ruleAudio
                    {
                     before(grammarAccess.getAudioElementAccess().getAudioParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAudio();

                    state._fsp--;

                     after(grammarAccess.getAudioElementAccess().getAudioParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:670:2: ( ruleAudioClip )
                    {
                    // InternalVideoMontage.g:670:2: ( ruleAudioClip )
                    // InternalVideoMontage.g:671:3: ruleAudioClip
                    {
                     before(grammarAccess.getAudioElementAccess().getAudioClipParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAudioClip();

                    state._fsp--;

                     after(grammarAccess.getAudioElementAccess().getAudioClipParserRuleCall_1()); 

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
    // $ANTLR end "rule__AudioElement__Alternatives"


    // $ANTLR start "rule__VideoElement__Alternatives"
    // InternalVideoMontage.g:680:1: rule__VideoElement__Alternatives : ( ( ruleTitle ) | ( ruleClip ) | ( ruleVideo ) );
    public final void rule__VideoElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:684:1: ( ( ruleTitle ) | ( ruleClip ) | ( ruleVideo ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt2=1;
                }
                break;
            case 49:
                {
                alt2=2;
                }
                break;
            case 51:
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
                    // InternalVideoMontage.g:685:2: ( ruleTitle )
                    {
                    // InternalVideoMontage.g:685:2: ( ruleTitle )
                    // InternalVideoMontage.g:686:3: ruleTitle
                    {
                     before(grammarAccess.getVideoElementAccess().getTitleParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTitle();

                    state._fsp--;

                     after(grammarAccess.getVideoElementAccess().getTitleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:691:2: ( ruleClip )
                    {
                    // InternalVideoMontage.g:691:2: ( ruleClip )
                    // InternalVideoMontage.g:692:3: ruleClip
                    {
                     before(grammarAccess.getVideoElementAccess().getClipParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClip();

                    state._fsp--;

                     after(grammarAccess.getVideoElementAccess().getClipParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoMontage.g:697:2: ( ruleVideo )
                    {
                    // InternalVideoMontage.g:697:2: ( ruleVideo )
                    // InternalVideoMontage.g:698:3: ruleVideo
                    {
                     before(grammarAccess.getVideoElementAccess().getVideoParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVideo();

                    state._fsp--;

                     after(grammarAccess.getVideoElementAccess().getVideoParserRuleCall_2()); 

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
    // $ANTLR end "rule__VideoElement__Alternatives"


    // $ANTLR start "rule__TextArea__Alternatives"
    // InternalVideoMontage.g:707:1: rule__TextArea__Alternatives : ( ( ruleTextArea_Impl ) | ( ruleTextAreaDynamic ) );
    public final void rule__TextArea__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:711:1: ( ( ruleTextArea_Impl ) | ( ruleTextAreaDynamic ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==53) ) {
                alt3=1;
            }
            else if ( (LA3_0==61) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalVideoMontage.g:712:2: ( ruleTextArea_Impl )
                    {
                    // InternalVideoMontage.g:712:2: ( ruleTextArea_Impl )
                    // InternalVideoMontage.g:713:3: ruleTextArea_Impl
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
                    // InternalVideoMontage.g:718:2: ( ruleTextAreaDynamic )
                    {
                    // InternalVideoMontage.g:718:2: ( ruleTextAreaDynamic )
                    // InternalVideoMontage.g:719:3: ruleTextAreaDynamic
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
    // InternalVideoMontage.g:728:1: rule__StartingMoment__Alternatives : ( ( ruleStartingMoment_Impl ) | ( ruleRelativeMoment ) | ( ruleAbsoluteMoment ) );
    public final void rule__StartingMoment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:732:1: ( ( ruleStartingMoment_Impl ) | ( ruleRelativeMoment ) | ( ruleAbsoluteMoment ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 45:
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
                    // InternalVideoMontage.g:733:2: ( ruleStartingMoment_Impl )
                    {
                    // InternalVideoMontage.g:733:2: ( ruleStartingMoment_Impl )
                    // InternalVideoMontage.g:734:3: ruleStartingMoment_Impl
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
                    // InternalVideoMontage.g:739:2: ( ruleRelativeMoment )
                    {
                    // InternalVideoMontage.g:739:2: ( ruleRelativeMoment )
                    // InternalVideoMontage.g:740:3: ruleRelativeMoment
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
                    // InternalVideoMontage.g:745:2: ( ruleAbsoluteMoment )
                    {
                    // InternalVideoMontage.g:745:2: ( ruleAbsoluteMoment )
                    // InternalVideoMontage.g:746:3: ruleAbsoluteMoment
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
    // InternalVideoMontage.g:755:1: rule__Animation__Alternatives : ( ( ruleFadeIn ) | ( ruleFadeOut ) );
    public final void rule__Animation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:759:1: ( ( ruleFadeIn ) | ( ruleFadeOut ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==64) ) {
                alt5=1;
            }
            else if ( (LA5_0==65) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVideoMontage.g:760:2: ( ruleFadeIn )
                    {
                    // InternalVideoMontage.g:760:2: ( ruleFadeIn )
                    // InternalVideoMontage.g:761:3: ruleFadeIn
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
                    // InternalVideoMontage.g:766:2: ( ruleFadeOut )
                    {
                    // InternalVideoMontage.g:766:2: ( ruleFadeOut )
                    // InternalVideoMontage.g:767:3: ruleFadeOut
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
    // InternalVideoMontage.g:776:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:780:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalVideoMontage.g:781:2: ( RULE_STRING )
                    {
                    // InternalVideoMontage.g:781:2: ( RULE_STRING )
                    // InternalVideoMontage.g:782:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:787:2: ( RULE_ID )
                    {
                    // InternalVideoMontage.g:787:2: ( RULE_ID )
                    // InternalVideoMontage.g:788:3: RULE_ID
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
    // InternalVideoMontage.g:797:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:801:1: ( ( 'E' ) | ( 'e' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVideoMontage.g:802:2: ( 'E' )
                    {
                    // InternalVideoMontage.g:802:2: ( 'E' )
                    // InternalVideoMontage.g:803:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:808:2: ( 'e' )
                    {
                    // InternalVideoMontage.g:808:2: ( 'e' )
                    // InternalVideoMontage.g:809:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,13,FOLLOW_2); 
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


    // $ANTLR start "rule__Moment__Alternatives"
    // InternalVideoMontage.g:818:1: rule__Moment__Alternatives : ( ( ( 'starting' ) ) | ( ( 'ending' ) ) );
    public final void rule__Moment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:822:1: ( ( ( 'starting' ) ) | ( ( 'ending' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVideoMontage.g:823:2: ( ( 'starting' ) )
                    {
                    // InternalVideoMontage.g:823:2: ( ( 'starting' ) )
                    // InternalVideoMontage.g:824:3: ( 'starting' )
                    {
                     before(grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0()); 
                    // InternalVideoMontage.g:825:3: ( 'starting' )
                    // InternalVideoMontage.g:825:4: 'starting'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:829:2: ( ( 'ending' ) )
                    {
                    // InternalVideoMontage.g:829:2: ( ( 'ending' ) )
                    // InternalVideoMontage.g:830:3: ( 'ending' )
                    {
                     before(grammarAccess.getMomentAccess().getEndingEnumLiteralDeclaration_1()); 
                    // InternalVideoMontage.g:831:3: ( 'ending' )
                    // InternalVideoMontage.g:831:4: 'ending'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalVideoMontage.g:839:1: rule__Movie__Group__0 : rule__Movie__Group__0__Impl rule__Movie__Group__1 ;
    public final void rule__Movie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:843:1: ( rule__Movie__Group__0__Impl rule__Movie__Group__1 )
            // InternalVideoMontage.g:844:2: rule__Movie__Group__0__Impl rule__Movie__Group__1
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
    // InternalVideoMontage.g:851:1: rule__Movie__Group__0__Impl : ( 'Movie' ) ;
    public final void rule__Movie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:855:1: ( ( 'Movie' ) )
            // InternalVideoMontage.g:856:1: ( 'Movie' )
            {
            // InternalVideoMontage.g:856:1: ( 'Movie' )
            // InternalVideoMontage.g:857:2: 'Movie'
            {
             before(grammarAccess.getMovieAccess().getMovieKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalVideoMontage.g:866:1: rule__Movie__Group__1 : rule__Movie__Group__1__Impl rule__Movie__Group__2 ;
    public final void rule__Movie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:870:1: ( rule__Movie__Group__1__Impl rule__Movie__Group__2 )
            // InternalVideoMontage.g:871:2: rule__Movie__Group__1__Impl rule__Movie__Group__2
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
    // InternalVideoMontage.g:878:1: rule__Movie__Group__1__Impl : ( '{' ) ;
    public final void rule__Movie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:882:1: ( ( '{' ) )
            // InternalVideoMontage.g:883:1: ( '{' )
            {
            // InternalVideoMontage.g:883:1: ( '{' )
            // InternalVideoMontage.g:884:2: '{'
            {
             before(grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalVideoMontage.g:893:1: rule__Movie__Group__2 : rule__Movie__Group__2__Impl rule__Movie__Group__3 ;
    public final void rule__Movie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:897:1: ( rule__Movie__Group__2__Impl rule__Movie__Group__3 )
            // InternalVideoMontage.g:898:2: rule__Movie__Group__2__Impl rule__Movie__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalVideoMontage.g:905:1: rule__Movie__Group__2__Impl : ( ( rule__Movie__Group_2__0 )? ) ;
    public final void rule__Movie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:909:1: ( ( ( rule__Movie__Group_2__0 )? ) )
            // InternalVideoMontage.g:910:1: ( ( rule__Movie__Group_2__0 )? )
            {
            // InternalVideoMontage.g:910:1: ( ( rule__Movie__Group_2__0 )? )
            // InternalVideoMontage.g:911:2: ( rule__Movie__Group_2__0 )?
            {
             before(grammarAccess.getMovieAccess().getGroup_2()); 
            // InternalVideoMontage.g:912:2: ( rule__Movie__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoMontage.g:912:3: rule__Movie__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Movie__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMovieAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalVideoMontage.g:920:1: rule__Movie__Group__3 : rule__Movie__Group__3__Impl rule__Movie__Group__4 ;
    public final void rule__Movie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:924:1: ( rule__Movie__Group__3__Impl rule__Movie__Group__4 )
            // InternalVideoMontage.g:925:2: rule__Movie__Group__3__Impl rule__Movie__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:932:1: rule__Movie__Group__3__Impl : ( 'audioelement' ) ;
    public final void rule__Movie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:936:1: ( ( 'audioelement' ) )
            // InternalVideoMontage.g:937:1: ( 'audioelement' )
            {
            // InternalVideoMontage.g:937:1: ( 'audioelement' )
            // InternalVideoMontage.g:938:2: 'audioelement'
            {
             before(grammarAccess.getMovieAccess().getAudioelementKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getAudioelementKeyword_3()); 

            }


            }

        }
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
    // InternalVideoMontage.g:947:1: rule__Movie__Group__4 : rule__Movie__Group__4__Impl rule__Movie__Group__5 ;
    public final void rule__Movie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:951:1: ( rule__Movie__Group__4__Impl rule__Movie__Group__5 )
            // InternalVideoMontage.g:952:2: rule__Movie__Group__4__Impl rule__Movie__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalVideoMontage.g:959:1: rule__Movie__Group__4__Impl : ( '{' ) ;
    public final void rule__Movie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:963:1: ( ( '{' ) )
            // InternalVideoMontage.g:964:1: ( '{' )
            {
            // InternalVideoMontage.g:964:1: ( '{' )
            // InternalVideoMontage.g:965:2: '{'
            {
             before(grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalVideoMontage.g:974:1: rule__Movie__Group__5 : rule__Movie__Group__5__Impl rule__Movie__Group__6 ;
    public final void rule__Movie__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:978:1: ( rule__Movie__Group__5__Impl rule__Movie__Group__6 )
            // InternalVideoMontage.g:979:2: rule__Movie__Group__5__Impl rule__Movie__Group__6
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
    // InternalVideoMontage.g:986:1: rule__Movie__Group__5__Impl : ( ( rule__Movie__AudioelementAssignment_5 ) ) ;
    public final void rule__Movie__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:990:1: ( ( ( rule__Movie__AudioelementAssignment_5 ) ) )
            // InternalVideoMontage.g:991:1: ( ( rule__Movie__AudioelementAssignment_5 ) )
            {
            // InternalVideoMontage.g:991:1: ( ( rule__Movie__AudioelementAssignment_5 ) )
            // InternalVideoMontage.g:992:2: ( rule__Movie__AudioelementAssignment_5 )
            {
             before(grammarAccess.getMovieAccess().getAudioelementAssignment_5()); 
            // InternalVideoMontage.g:993:2: ( rule__Movie__AudioelementAssignment_5 )
            // InternalVideoMontage.g:993:3: rule__Movie__AudioelementAssignment_5
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
    // InternalVideoMontage.g:1001:1: rule__Movie__Group__6 : rule__Movie__Group__6__Impl rule__Movie__Group__7 ;
    public final void rule__Movie__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1005:1: ( rule__Movie__Group__6__Impl rule__Movie__Group__7 )
            // InternalVideoMontage.g:1006:2: rule__Movie__Group__6__Impl rule__Movie__Group__7
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
    // InternalVideoMontage.g:1013:1: rule__Movie__Group__6__Impl : ( ( rule__Movie__Group_6__0 )* ) ;
    public final void rule__Movie__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1017:1: ( ( ( rule__Movie__Group_6__0 )* ) )
            // InternalVideoMontage.g:1018:1: ( ( rule__Movie__Group_6__0 )* )
            {
            // InternalVideoMontage.g:1018:1: ( ( rule__Movie__Group_6__0 )* )
            // InternalVideoMontage.g:1019:2: ( rule__Movie__Group_6__0 )*
            {
             before(grammarAccess.getMovieAccess().getGroup_6()); 
            // InternalVideoMontage.g:1020:2: ( rule__Movie__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalVideoMontage.g:1020:3: rule__Movie__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Movie__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

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
    // InternalVideoMontage.g:1028:1: rule__Movie__Group__7 : rule__Movie__Group__7__Impl rule__Movie__Group__8 ;
    public final void rule__Movie__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1032:1: ( rule__Movie__Group__7__Impl rule__Movie__Group__8 )
            // InternalVideoMontage.g:1033:2: rule__Movie__Group__7__Impl rule__Movie__Group__8
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
    // InternalVideoMontage.g:1040:1: rule__Movie__Group__7__Impl : ( '}' ) ;
    public final void rule__Movie__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1044:1: ( ( '}' ) )
            // InternalVideoMontage.g:1045:1: ( '}' )
            {
            // InternalVideoMontage.g:1045:1: ( '}' )
            // InternalVideoMontage.g:1046:2: '}'
            {
             before(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1055:1: rule__Movie__Group__8 : rule__Movie__Group__8__Impl rule__Movie__Group__9 ;
    public final void rule__Movie__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1059:1: ( rule__Movie__Group__8__Impl rule__Movie__Group__9 )
            // InternalVideoMontage.g:1060:2: rule__Movie__Group__8__Impl rule__Movie__Group__9
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:1067:1: rule__Movie__Group__8__Impl : ( 'videoelement' ) ;
    public final void rule__Movie__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1071:1: ( ( 'videoelement' ) )
            // InternalVideoMontage.g:1072:1: ( 'videoelement' )
            {
            // InternalVideoMontage.g:1072:1: ( 'videoelement' )
            // InternalVideoMontage.g:1073:2: 'videoelement'
            {
             before(grammarAccess.getMovieAccess().getVideoelementKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getVideoelementKeyword_8()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1082:1: rule__Movie__Group__9 : rule__Movie__Group__9__Impl rule__Movie__Group__10 ;
    public final void rule__Movie__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1086:1: ( rule__Movie__Group__9__Impl rule__Movie__Group__10 )
            // InternalVideoMontage.g:1087:2: rule__Movie__Group__9__Impl rule__Movie__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Movie__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__10();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:1094:1: rule__Movie__Group__9__Impl : ( '{' ) ;
    public final void rule__Movie__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1098:1: ( ( '{' ) )
            // InternalVideoMontage.g:1099:1: ( '{' )
            {
            // InternalVideoMontage.g:1099:1: ( '{' )
            // InternalVideoMontage.g:1100:2: '{'
            {
             before(grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Movie__Group__10"
    // InternalVideoMontage.g:1109:1: rule__Movie__Group__10 : rule__Movie__Group__10__Impl rule__Movie__Group__11 ;
    public final void rule__Movie__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1113:1: ( rule__Movie__Group__10__Impl rule__Movie__Group__11 )
            // InternalVideoMontage.g:1114:2: rule__Movie__Group__10__Impl rule__Movie__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Movie__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__10"


    // $ANTLR start "rule__Movie__Group__10__Impl"
    // InternalVideoMontage.g:1121:1: rule__Movie__Group__10__Impl : ( ( rule__Movie__VideoelementAssignment_10 ) ) ;
    public final void rule__Movie__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1125:1: ( ( ( rule__Movie__VideoelementAssignment_10 ) ) )
            // InternalVideoMontage.g:1126:1: ( ( rule__Movie__VideoelementAssignment_10 ) )
            {
            // InternalVideoMontage.g:1126:1: ( ( rule__Movie__VideoelementAssignment_10 ) )
            // InternalVideoMontage.g:1127:2: ( rule__Movie__VideoelementAssignment_10 )
            {
             before(grammarAccess.getMovieAccess().getVideoelementAssignment_10()); 
            // InternalVideoMontage.g:1128:2: ( rule__Movie__VideoelementAssignment_10 )
            // InternalVideoMontage.g:1128:3: rule__Movie__VideoelementAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Movie__VideoelementAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getVideoelementAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__10__Impl"


    // $ANTLR start "rule__Movie__Group__11"
    // InternalVideoMontage.g:1136:1: rule__Movie__Group__11 : rule__Movie__Group__11__Impl rule__Movie__Group__12 ;
    public final void rule__Movie__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1140:1: ( rule__Movie__Group__11__Impl rule__Movie__Group__12 )
            // InternalVideoMontage.g:1141:2: rule__Movie__Group__11__Impl rule__Movie__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__Movie__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__11"


    // $ANTLR start "rule__Movie__Group__11__Impl"
    // InternalVideoMontage.g:1148:1: rule__Movie__Group__11__Impl : ( ( rule__Movie__Group_11__0 )* ) ;
    public final void rule__Movie__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1152:1: ( ( ( rule__Movie__Group_11__0 )* ) )
            // InternalVideoMontage.g:1153:1: ( ( rule__Movie__Group_11__0 )* )
            {
            // InternalVideoMontage.g:1153:1: ( ( rule__Movie__Group_11__0 )* )
            // InternalVideoMontage.g:1154:2: ( rule__Movie__Group_11__0 )*
            {
             before(grammarAccess.getMovieAccess().getGroup_11()); 
            // InternalVideoMontage.g:1155:2: ( rule__Movie__Group_11__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVideoMontage.g:1155:3: rule__Movie__Group_11__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Movie__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMovieAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__11__Impl"


    // $ANTLR start "rule__Movie__Group__12"
    // InternalVideoMontage.g:1163:1: rule__Movie__Group__12 : rule__Movie__Group__12__Impl rule__Movie__Group__13 ;
    public final void rule__Movie__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1167:1: ( rule__Movie__Group__12__Impl rule__Movie__Group__13 )
            // InternalVideoMontage.g:1168:2: rule__Movie__Group__12__Impl rule__Movie__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Movie__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__12"


    // $ANTLR start "rule__Movie__Group__12__Impl"
    // InternalVideoMontage.g:1175:1: rule__Movie__Group__12__Impl : ( '}' ) ;
    public final void rule__Movie__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1179:1: ( ( '}' ) )
            // InternalVideoMontage.g:1180:1: ( '}' )
            {
            // InternalVideoMontage.g:1180:1: ( '}' )
            // InternalVideoMontage.g:1181:2: '}'
            {
             before(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__12__Impl"


    // $ANTLR start "rule__Movie__Group__13"
    // InternalVideoMontage.g:1190:1: rule__Movie__Group__13 : rule__Movie__Group__13__Impl rule__Movie__Group__14 ;
    public final void rule__Movie__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1194:1: ( rule__Movie__Group__13__Impl rule__Movie__Group__14 )
            // InternalVideoMontage.g:1195:2: rule__Movie__Group__13__Impl rule__Movie__Group__14
            {
            pushFollow(FOLLOW_3);
            rule__Movie__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__13"


    // $ANTLR start "rule__Movie__Group__13__Impl"
    // InternalVideoMontage.g:1202:1: rule__Movie__Group__13__Impl : ( 'subtitle' ) ;
    public final void rule__Movie__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1206:1: ( ( 'subtitle' ) )
            // InternalVideoMontage.g:1207:1: ( 'subtitle' )
            {
            // InternalVideoMontage.g:1207:1: ( 'subtitle' )
            // InternalVideoMontage.g:1208:2: 'subtitle'
            {
             before(grammarAccess.getMovieAccess().getSubtitleKeyword_13()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getSubtitleKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__13__Impl"


    // $ANTLR start "rule__Movie__Group__14"
    // InternalVideoMontage.g:1217:1: rule__Movie__Group__14 : rule__Movie__Group__14__Impl rule__Movie__Group__15 ;
    public final void rule__Movie__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1221:1: ( rule__Movie__Group__14__Impl rule__Movie__Group__15 )
            // InternalVideoMontage.g:1222:2: rule__Movie__Group__14__Impl rule__Movie__Group__15
            {
            pushFollow(FOLLOW_11);
            rule__Movie__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__14"


    // $ANTLR start "rule__Movie__Group__14__Impl"
    // InternalVideoMontage.g:1229:1: rule__Movie__Group__14__Impl : ( '{' ) ;
    public final void rule__Movie__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1233:1: ( ( '{' ) )
            // InternalVideoMontage.g:1234:1: ( '{' )
            {
            // InternalVideoMontage.g:1234:1: ( '{' )
            // InternalVideoMontage.g:1235:2: '{'
            {
             before(grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__14__Impl"


    // $ANTLR start "rule__Movie__Group__15"
    // InternalVideoMontage.g:1244:1: rule__Movie__Group__15 : rule__Movie__Group__15__Impl rule__Movie__Group__16 ;
    public final void rule__Movie__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1248:1: ( rule__Movie__Group__15__Impl rule__Movie__Group__16 )
            // InternalVideoMontage.g:1249:2: rule__Movie__Group__15__Impl rule__Movie__Group__16
            {
            pushFollow(FOLLOW_6);
            rule__Movie__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__15"


    // $ANTLR start "rule__Movie__Group__15__Impl"
    // InternalVideoMontage.g:1256:1: rule__Movie__Group__15__Impl : ( ( rule__Movie__SubtitleAssignment_15 ) ) ;
    public final void rule__Movie__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1260:1: ( ( ( rule__Movie__SubtitleAssignment_15 ) ) )
            // InternalVideoMontage.g:1261:1: ( ( rule__Movie__SubtitleAssignment_15 ) )
            {
            // InternalVideoMontage.g:1261:1: ( ( rule__Movie__SubtitleAssignment_15 ) )
            // InternalVideoMontage.g:1262:2: ( rule__Movie__SubtitleAssignment_15 )
            {
             before(grammarAccess.getMovieAccess().getSubtitleAssignment_15()); 
            // InternalVideoMontage.g:1263:2: ( rule__Movie__SubtitleAssignment_15 )
            // InternalVideoMontage.g:1263:3: rule__Movie__SubtitleAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Movie__SubtitleAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getSubtitleAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__15__Impl"


    // $ANTLR start "rule__Movie__Group__16"
    // InternalVideoMontage.g:1271:1: rule__Movie__Group__16 : rule__Movie__Group__16__Impl rule__Movie__Group__17 ;
    public final void rule__Movie__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1275:1: ( rule__Movie__Group__16__Impl rule__Movie__Group__17 )
            // InternalVideoMontage.g:1276:2: rule__Movie__Group__16__Impl rule__Movie__Group__17
            {
            pushFollow(FOLLOW_6);
            rule__Movie__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__16"


    // $ANTLR start "rule__Movie__Group__16__Impl"
    // InternalVideoMontage.g:1283:1: rule__Movie__Group__16__Impl : ( ( rule__Movie__Group_16__0 )* ) ;
    public final void rule__Movie__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1287:1: ( ( ( rule__Movie__Group_16__0 )* ) )
            // InternalVideoMontage.g:1288:1: ( ( rule__Movie__Group_16__0 )* )
            {
            // InternalVideoMontage.g:1288:1: ( ( rule__Movie__Group_16__0 )* )
            // InternalVideoMontage.g:1289:2: ( rule__Movie__Group_16__0 )*
            {
             before(grammarAccess.getMovieAccess().getGroup_16()); 
            // InternalVideoMontage.g:1290:2: ( rule__Movie__Group_16__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVideoMontage.g:1290:3: rule__Movie__Group_16__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Movie__Group_16__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMovieAccess().getGroup_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__16__Impl"


    // $ANTLR start "rule__Movie__Group__17"
    // InternalVideoMontage.g:1298:1: rule__Movie__Group__17 : rule__Movie__Group__17__Impl rule__Movie__Group__18 ;
    public final void rule__Movie__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1302:1: ( rule__Movie__Group__17__Impl rule__Movie__Group__18 )
            // InternalVideoMontage.g:1303:2: rule__Movie__Group__17__Impl rule__Movie__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__Movie__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__17"


    // $ANTLR start "rule__Movie__Group__17__Impl"
    // InternalVideoMontage.g:1310:1: rule__Movie__Group__17__Impl : ( '}' ) ;
    public final void rule__Movie__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1314:1: ( ( '}' ) )
            // InternalVideoMontage.g:1315:1: ( '}' )
            {
            // InternalVideoMontage.g:1315:1: ( '}' )
            // InternalVideoMontage.g:1316:2: '}'
            {
             before(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_17()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__17__Impl"


    // $ANTLR start "rule__Movie__Group__18"
    // InternalVideoMontage.g:1325:1: rule__Movie__Group__18 : rule__Movie__Group__18__Impl ;
    public final void rule__Movie__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1329:1: ( rule__Movie__Group__18__Impl )
            // InternalVideoMontage.g:1330:2: rule__Movie__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__18"


    // $ANTLR start "rule__Movie__Group__18__Impl"
    // InternalVideoMontage.g:1336:1: rule__Movie__Group__18__Impl : ( '}' ) ;
    public final void rule__Movie__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1340:1: ( ( '}' ) )
            // InternalVideoMontage.g:1341:1: ( '}' )
            {
            // InternalVideoMontage.g:1341:1: ( '}' )
            // InternalVideoMontage.g:1342:2: '}'
            {
             before(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_18()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group__18__Impl"


    // $ANTLR start "rule__Movie__Group_2__0"
    // InternalVideoMontage.g:1352:1: rule__Movie__Group_2__0 : rule__Movie__Group_2__0__Impl rule__Movie__Group_2__1 ;
    public final void rule__Movie__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1356:1: ( rule__Movie__Group_2__0__Impl rule__Movie__Group_2__1 )
            // InternalVideoMontage.g:1357:2: rule__Movie__Group_2__0__Impl rule__Movie__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__Movie__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_2__0"


    // $ANTLR start "rule__Movie__Group_2__0__Impl"
    // InternalVideoMontage.g:1364:1: rule__Movie__Group_2__0__Impl : ( 'title' ) ;
    public final void rule__Movie__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1368:1: ( ( 'title' ) )
            // InternalVideoMontage.g:1369:1: ( 'title' )
            {
            // InternalVideoMontage.g:1369:1: ( 'title' )
            // InternalVideoMontage.g:1370:2: 'title'
            {
             before(grammarAccess.getMovieAccess().getTitleKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getTitleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_2__0__Impl"


    // $ANTLR start "rule__Movie__Group_2__1"
    // InternalVideoMontage.g:1379:1: rule__Movie__Group_2__1 : rule__Movie__Group_2__1__Impl ;
    public final void rule__Movie__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1383:1: ( rule__Movie__Group_2__1__Impl )
            // InternalVideoMontage.g:1384:2: rule__Movie__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_2__1"


    // $ANTLR start "rule__Movie__Group_2__1__Impl"
    // InternalVideoMontage.g:1390:1: rule__Movie__Group_2__1__Impl : ( ( rule__Movie__TitleAssignment_2_1 ) ) ;
    public final void rule__Movie__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1394:1: ( ( ( rule__Movie__TitleAssignment_2_1 ) ) )
            // InternalVideoMontage.g:1395:1: ( ( rule__Movie__TitleAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:1395:1: ( ( rule__Movie__TitleAssignment_2_1 ) )
            // InternalVideoMontage.g:1396:2: ( rule__Movie__TitleAssignment_2_1 )
            {
             before(grammarAccess.getMovieAccess().getTitleAssignment_2_1()); 
            // InternalVideoMontage.g:1397:2: ( rule__Movie__TitleAssignment_2_1 )
            // InternalVideoMontage.g:1397:3: rule__Movie__TitleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Movie__TitleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getTitleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_2__1__Impl"


    // $ANTLR start "rule__Movie__Group_6__0"
    // InternalVideoMontage.g:1406:1: rule__Movie__Group_6__0 : rule__Movie__Group_6__0__Impl rule__Movie__Group_6__1 ;
    public final void rule__Movie__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1410:1: ( rule__Movie__Group_6__0__Impl rule__Movie__Group_6__1 )
            // InternalVideoMontage.g:1411:2: rule__Movie__Group_6__0__Impl rule__Movie__Group_6__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalVideoMontage.g:1418:1: rule__Movie__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Movie__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1422:1: ( ( ',' ) )
            // InternalVideoMontage.g:1423:1: ( ',' )
            {
            // InternalVideoMontage.g:1423:1: ( ',' )
            // InternalVideoMontage.g:1424:2: ','
            {
             before(grammarAccess.getMovieAccess().getCommaKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getCommaKeyword_6_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1433:1: rule__Movie__Group_6__1 : rule__Movie__Group_6__1__Impl ;
    public final void rule__Movie__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1437:1: ( rule__Movie__Group_6__1__Impl )
            // InternalVideoMontage.g:1438:2: rule__Movie__Group_6__1__Impl
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
    // InternalVideoMontage.g:1444:1: rule__Movie__Group_6__1__Impl : ( ( rule__Movie__AudioelementAssignment_6_1 ) ) ;
    public final void rule__Movie__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1448:1: ( ( ( rule__Movie__AudioelementAssignment_6_1 ) ) )
            // InternalVideoMontage.g:1449:1: ( ( rule__Movie__AudioelementAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:1449:1: ( ( rule__Movie__AudioelementAssignment_6_1 ) )
            // InternalVideoMontage.g:1450:2: ( rule__Movie__AudioelementAssignment_6_1 )
            {
             before(grammarAccess.getMovieAccess().getAudioelementAssignment_6_1()); 
            // InternalVideoMontage.g:1451:2: ( rule__Movie__AudioelementAssignment_6_1 )
            // InternalVideoMontage.g:1451:3: rule__Movie__AudioelementAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Movie__AudioelementAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getAudioelementAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Movie__Group_11__0"
    // InternalVideoMontage.g:1460:1: rule__Movie__Group_11__0 : rule__Movie__Group_11__0__Impl rule__Movie__Group_11__1 ;
    public final void rule__Movie__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1464:1: ( rule__Movie__Group_11__0__Impl rule__Movie__Group_11__1 )
            // InternalVideoMontage.g:1465:2: rule__Movie__Group_11__0__Impl rule__Movie__Group_11__1
            {
            pushFollow(FOLLOW_9);
            rule__Movie__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_11__0"


    // $ANTLR start "rule__Movie__Group_11__0__Impl"
    // InternalVideoMontage.g:1472:1: rule__Movie__Group_11__0__Impl : ( ',' ) ;
    public final void rule__Movie__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1476:1: ( ( ',' ) )
            // InternalVideoMontage.g:1477:1: ( ',' )
            {
            // InternalVideoMontage.g:1477:1: ( ',' )
            // InternalVideoMontage.g:1478:2: ','
            {
             before(grammarAccess.getMovieAccess().getCommaKeyword_11_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_11__0__Impl"


    // $ANTLR start "rule__Movie__Group_11__1"
    // InternalVideoMontage.g:1487:1: rule__Movie__Group_11__1 : rule__Movie__Group_11__1__Impl ;
    public final void rule__Movie__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1491:1: ( rule__Movie__Group_11__1__Impl )
            // InternalVideoMontage.g:1492:2: rule__Movie__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_11__1"


    // $ANTLR start "rule__Movie__Group_11__1__Impl"
    // InternalVideoMontage.g:1498:1: rule__Movie__Group_11__1__Impl : ( ( rule__Movie__VideoelementAssignment_11_1 ) ) ;
    public final void rule__Movie__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1502:1: ( ( ( rule__Movie__VideoelementAssignment_11_1 ) ) )
            // InternalVideoMontage.g:1503:1: ( ( rule__Movie__VideoelementAssignment_11_1 ) )
            {
            // InternalVideoMontage.g:1503:1: ( ( rule__Movie__VideoelementAssignment_11_1 ) )
            // InternalVideoMontage.g:1504:2: ( rule__Movie__VideoelementAssignment_11_1 )
            {
             before(grammarAccess.getMovieAccess().getVideoelementAssignment_11_1()); 
            // InternalVideoMontage.g:1505:2: ( rule__Movie__VideoelementAssignment_11_1 )
            // InternalVideoMontage.g:1505:3: rule__Movie__VideoelementAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Movie__VideoelementAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getVideoelementAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_11__1__Impl"


    // $ANTLR start "rule__Movie__Group_16__0"
    // InternalVideoMontage.g:1514:1: rule__Movie__Group_16__0 : rule__Movie__Group_16__0__Impl rule__Movie__Group_16__1 ;
    public final void rule__Movie__Group_16__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1518:1: ( rule__Movie__Group_16__0__Impl rule__Movie__Group_16__1 )
            // InternalVideoMontage.g:1519:2: rule__Movie__Group_16__0__Impl rule__Movie__Group_16__1
            {
            pushFollow(FOLLOW_11);
            rule__Movie__Group_16__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movie__Group_16__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_16__0"


    // $ANTLR start "rule__Movie__Group_16__0__Impl"
    // InternalVideoMontage.g:1526:1: rule__Movie__Group_16__0__Impl : ( ',' ) ;
    public final void rule__Movie__Group_16__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1530:1: ( ( ',' ) )
            // InternalVideoMontage.g:1531:1: ( ',' )
            {
            // InternalVideoMontage.g:1531:1: ( ',' )
            // InternalVideoMontage.g:1532:2: ','
            {
             before(grammarAccess.getMovieAccess().getCommaKeyword_16_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMovieAccess().getCommaKeyword_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_16__0__Impl"


    // $ANTLR start "rule__Movie__Group_16__1"
    // InternalVideoMontage.g:1541:1: rule__Movie__Group_16__1 : rule__Movie__Group_16__1__Impl ;
    public final void rule__Movie__Group_16__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1545:1: ( rule__Movie__Group_16__1__Impl )
            // InternalVideoMontage.g:1546:2: rule__Movie__Group_16__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movie__Group_16__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_16__1"


    // $ANTLR start "rule__Movie__Group_16__1__Impl"
    // InternalVideoMontage.g:1552:1: rule__Movie__Group_16__1__Impl : ( ( rule__Movie__SubtitleAssignment_16_1 ) ) ;
    public final void rule__Movie__Group_16__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1556:1: ( ( ( rule__Movie__SubtitleAssignment_16_1 ) ) )
            // InternalVideoMontage.g:1557:1: ( ( rule__Movie__SubtitleAssignment_16_1 ) )
            {
            // InternalVideoMontage.g:1557:1: ( ( rule__Movie__SubtitleAssignment_16_1 ) )
            // InternalVideoMontage.g:1558:2: ( rule__Movie__SubtitleAssignment_16_1 )
            {
             before(grammarAccess.getMovieAccess().getSubtitleAssignment_16_1()); 
            // InternalVideoMontage.g:1559:2: ( rule__Movie__SubtitleAssignment_16_1 )
            // InternalVideoMontage.g:1559:3: rule__Movie__SubtitleAssignment_16_1
            {
            pushFollow(FOLLOW_2);
            rule__Movie__SubtitleAssignment_16_1();

            state._fsp--;


            }

             after(grammarAccess.getMovieAccess().getSubtitleAssignment_16_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__Group_16__1__Impl"


    // $ANTLR start "rule__Subtitle__Group__0"
    // InternalVideoMontage.g:1568:1: rule__Subtitle__Group__0 : rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1 ;
    public final void rule__Subtitle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1572:1: ( rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1 )
            // InternalVideoMontage.g:1573:2: rule__Subtitle__Group__0__Impl rule__Subtitle__Group__1
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
    // InternalVideoMontage.g:1580:1: rule__Subtitle__Group__0__Impl : ( 'Subtitle' ) ;
    public final void rule__Subtitle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1584:1: ( ( 'Subtitle' ) )
            // InternalVideoMontage.g:1585:1: ( 'Subtitle' )
            {
            // InternalVideoMontage.g:1585:1: ( 'Subtitle' )
            // InternalVideoMontage.g:1586:2: 'Subtitle'
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
    // InternalVideoMontage.g:1595:1: rule__Subtitle__Group__1 : rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2 ;
    public final void rule__Subtitle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1599:1: ( rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2 )
            // InternalVideoMontage.g:1600:2: rule__Subtitle__Group__1__Impl rule__Subtitle__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalVideoMontage.g:1607:1: rule__Subtitle__Group__1__Impl : ( '{' ) ;
    public final void rule__Subtitle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1611:1: ( ( '{' ) )
            // InternalVideoMontage.g:1612:1: ( '{' )
            {
            // InternalVideoMontage.g:1612:1: ( '{' )
            // InternalVideoMontage.g:1613:2: '{'
            {
             before(grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1622:1: rule__Subtitle__Group__2 : rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3 ;
    public final void rule__Subtitle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1626:1: ( rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3 )
            // InternalVideoMontage.g:1627:2: rule__Subtitle__Group__2__Impl rule__Subtitle__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalVideoMontage.g:1634:1: rule__Subtitle__Group__2__Impl : ( ( rule__Subtitle__Group_2__0 )? ) ;
    public final void rule__Subtitle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1638:1: ( ( ( rule__Subtitle__Group_2__0 )? ) )
            // InternalVideoMontage.g:1639:1: ( ( rule__Subtitle__Group_2__0 )? )
            {
            // InternalVideoMontage.g:1639:1: ( ( rule__Subtitle__Group_2__0 )? )
            // InternalVideoMontage.g:1640:2: ( rule__Subtitle__Group_2__0 )?
            {
             before(grammarAccess.getSubtitleAccess().getGroup_2()); 
            // InternalVideoMontage.g:1641:2: ( rule__Subtitle__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVideoMontage.g:1641:3: rule__Subtitle__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subtitle__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubtitleAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1649:1: rule__Subtitle__Group__3 : rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4 ;
    public final void rule__Subtitle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1653:1: ( rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4 )
            // InternalVideoMontage.g:1654:2: rule__Subtitle__Group__3__Impl rule__Subtitle__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:1661:1: rule__Subtitle__Group__3__Impl : ( 'relativemoment' ) ;
    public final void rule__Subtitle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1665:1: ( ( 'relativemoment' ) )
            // InternalVideoMontage.g:1666:1: ( 'relativemoment' )
            {
            // InternalVideoMontage.g:1666:1: ( 'relativemoment' )
            // InternalVideoMontage.g:1667:2: 'relativemoment'
            {
             before(grammarAccess.getSubtitleAccess().getRelativemomentKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getRelativemomentKeyword_3()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1676:1: rule__Subtitle__Group__4 : rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5 ;
    public final void rule__Subtitle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1680:1: ( rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5 )
            // InternalVideoMontage.g:1681:2: rule__Subtitle__Group__4__Impl rule__Subtitle__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoMontage.g:1688:1: rule__Subtitle__Group__4__Impl : ( '{' ) ;
    public final void rule__Subtitle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1692:1: ( ( '{' ) )
            // InternalVideoMontage.g:1693:1: ( '{' )
            {
            // InternalVideoMontage.g:1693:1: ( '{' )
            // InternalVideoMontage.g:1694:2: '{'
            {
             before(grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
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
    // InternalVideoMontage.g:1703:1: rule__Subtitle__Group__5 : rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6 ;
    public final void rule__Subtitle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1707:1: ( rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6 )
            // InternalVideoMontage.g:1708:2: rule__Subtitle__Group__5__Impl rule__Subtitle__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalVideoMontage.g:1715:1: rule__Subtitle__Group__5__Impl : ( ( rule__Subtitle__RelativemomentAssignment_5 ) ) ;
    public final void rule__Subtitle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1719:1: ( ( ( rule__Subtitle__RelativemomentAssignment_5 ) ) )
            // InternalVideoMontage.g:1720:1: ( ( rule__Subtitle__RelativemomentAssignment_5 ) )
            {
            // InternalVideoMontage.g:1720:1: ( ( rule__Subtitle__RelativemomentAssignment_5 ) )
            // InternalVideoMontage.g:1721:2: ( rule__Subtitle__RelativemomentAssignment_5 )
            {
             before(grammarAccess.getSubtitleAccess().getRelativemomentAssignment_5()); 
            // InternalVideoMontage.g:1722:2: ( rule__Subtitle__RelativemomentAssignment_5 )
            // InternalVideoMontage.g:1722:3: rule__Subtitle__RelativemomentAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__RelativemomentAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getRelativemomentAssignment_5()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1730:1: rule__Subtitle__Group__6 : rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7 ;
    public final void rule__Subtitle__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1734:1: ( rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7 )
            // InternalVideoMontage.g:1735:2: rule__Subtitle__Group__6__Impl rule__Subtitle__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalVideoMontage.g:1742:1: rule__Subtitle__Group__6__Impl : ( ( rule__Subtitle__Group_6__0 )* ) ;
    public final void rule__Subtitle__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1746:1: ( ( ( rule__Subtitle__Group_6__0 )* ) )
            // InternalVideoMontage.g:1747:1: ( ( rule__Subtitle__Group_6__0 )* )
            {
            // InternalVideoMontage.g:1747:1: ( ( rule__Subtitle__Group_6__0 )* )
            // InternalVideoMontage.g:1748:2: ( rule__Subtitle__Group_6__0 )*
            {
             before(grammarAccess.getSubtitleAccess().getGroup_6()); 
            // InternalVideoMontage.g:1749:2: ( rule__Subtitle__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalVideoMontage.g:1749:3: rule__Subtitle__Group_6__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Subtitle__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

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
    // InternalVideoMontage.g:1757:1: rule__Subtitle__Group__7 : rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8 ;
    public final void rule__Subtitle__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1761:1: ( rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8 )
            // InternalVideoMontage.g:1762:2: rule__Subtitle__Group__7__Impl rule__Subtitle__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalVideoMontage.g:1769:1: rule__Subtitle__Group__7__Impl : ( '}' ) ;
    public final void rule__Subtitle__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1773:1: ( ( '}' ) )
            // InternalVideoMontage.g:1774:1: ( '}' )
            {
            // InternalVideoMontage.g:1774:1: ( '}' )
            // InternalVideoMontage.g:1775:2: '}'
            {
             before(grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1784:1: rule__Subtitle__Group__8 : rule__Subtitle__Group__8__Impl rule__Subtitle__Group__9 ;
    public final void rule__Subtitle__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1788:1: ( rule__Subtitle__Group__8__Impl rule__Subtitle__Group__9 )
            // InternalVideoMontage.g:1789:2: rule__Subtitle__Group__8__Impl rule__Subtitle__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalVideoMontage.g:1796:1: rule__Subtitle__Group__8__Impl : ( 'textarea' ) ;
    public final void rule__Subtitle__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1800:1: ( ( 'textarea' ) )
            // InternalVideoMontage.g:1801:1: ( 'textarea' )
            {
            // InternalVideoMontage.g:1801:1: ( 'textarea' )
            // InternalVideoMontage.g:1802:2: 'textarea'
            {
             before(grammarAccess.getSubtitleAccess().getTextareaKeyword_8()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getTextareaKeyword_8()); 

            }


            }

        }
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
    // InternalVideoMontage.g:1811:1: rule__Subtitle__Group__9 : rule__Subtitle__Group__9__Impl rule__Subtitle__Group__10 ;
    public final void rule__Subtitle__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1815:1: ( rule__Subtitle__Group__9__Impl rule__Subtitle__Group__10 )
            // InternalVideoMontage.g:1816:2: rule__Subtitle__Group__9__Impl rule__Subtitle__Group__10
            {
            pushFollow(FOLLOW_18);
            rule__Subtitle__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__10();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:1823:1: rule__Subtitle__Group__9__Impl : ( ( rule__Subtitle__TextareaAssignment_9 ) ) ;
    public final void rule__Subtitle__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1827:1: ( ( ( rule__Subtitle__TextareaAssignment_9 ) ) )
            // InternalVideoMontage.g:1828:1: ( ( rule__Subtitle__TextareaAssignment_9 ) )
            {
            // InternalVideoMontage.g:1828:1: ( ( rule__Subtitle__TextareaAssignment_9 ) )
            // InternalVideoMontage.g:1829:2: ( rule__Subtitle__TextareaAssignment_9 )
            {
             before(grammarAccess.getSubtitleAccess().getTextareaAssignment_9()); 
            // InternalVideoMontage.g:1830:2: ( rule__Subtitle__TextareaAssignment_9 )
            // InternalVideoMontage.g:1830:3: rule__Subtitle__TextareaAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__TextareaAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getTextareaAssignment_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__Subtitle__Group__10"
    // InternalVideoMontage.g:1838:1: rule__Subtitle__Group__10 : rule__Subtitle__Group__10__Impl rule__Subtitle__Group__11 ;
    public final void rule__Subtitle__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1842:1: ( rule__Subtitle__Group__10__Impl rule__Subtitle__Group__11 )
            // InternalVideoMontage.g:1843:2: rule__Subtitle__Group__10__Impl rule__Subtitle__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Subtitle__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__10"


    // $ANTLR start "rule__Subtitle__Group__10__Impl"
    // InternalVideoMontage.g:1850:1: rule__Subtitle__Group__10__Impl : ( 'startingmoment' ) ;
    public final void rule__Subtitle__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1854:1: ( ( 'startingmoment' ) )
            // InternalVideoMontage.g:1855:1: ( 'startingmoment' )
            {
            // InternalVideoMontage.g:1855:1: ( 'startingmoment' )
            // InternalVideoMontage.g:1856:2: 'startingmoment'
            {
             before(grammarAccess.getSubtitleAccess().getStartingmomentKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getStartingmomentKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__10__Impl"


    // $ANTLR start "rule__Subtitle__Group__11"
    // InternalVideoMontage.g:1865:1: rule__Subtitle__Group__11 : rule__Subtitle__Group__11__Impl rule__Subtitle__Group__12 ;
    public final void rule__Subtitle__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1869:1: ( rule__Subtitle__Group__11__Impl rule__Subtitle__Group__12 )
            // InternalVideoMontage.g:1870:2: rule__Subtitle__Group__11__Impl rule__Subtitle__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Subtitle__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__11"


    // $ANTLR start "rule__Subtitle__Group__11__Impl"
    // InternalVideoMontage.g:1877:1: rule__Subtitle__Group__11__Impl : ( ( rule__Subtitle__StartingmomentAssignment_11 ) ) ;
    public final void rule__Subtitle__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1881:1: ( ( ( rule__Subtitle__StartingmomentAssignment_11 ) ) )
            // InternalVideoMontage.g:1882:1: ( ( rule__Subtitle__StartingmomentAssignment_11 ) )
            {
            // InternalVideoMontage.g:1882:1: ( ( rule__Subtitle__StartingmomentAssignment_11 ) )
            // InternalVideoMontage.g:1883:2: ( rule__Subtitle__StartingmomentAssignment_11 )
            {
             before(grammarAccess.getSubtitleAccess().getStartingmomentAssignment_11()); 
            // InternalVideoMontage.g:1884:2: ( rule__Subtitle__StartingmomentAssignment_11 )
            // InternalVideoMontage.g:1884:3: rule__Subtitle__StartingmomentAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__StartingmomentAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getStartingmomentAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__11__Impl"


    // $ANTLR start "rule__Subtitle__Group__12"
    // InternalVideoMontage.g:1892:1: rule__Subtitle__Group__12 : rule__Subtitle__Group__12__Impl ;
    public final void rule__Subtitle__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1896:1: ( rule__Subtitle__Group__12__Impl )
            // InternalVideoMontage.g:1897:2: rule__Subtitle__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__12"


    // $ANTLR start "rule__Subtitle__Group__12__Impl"
    // InternalVideoMontage.g:1903:1: rule__Subtitle__Group__12__Impl : ( '}' ) ;
    public final void rule__Subtitle__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1907:1: ( ( '}' ) )
            // InternalVideoMontage.g:1908:1: ( '}' )
            {
            // InternalVideoMontage.g:1908:1: ( '}' )
            // InternalVideoMontage.g:1909:2: '}'
            {
             before(grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group__12__Impl"


    // $ANTLR start "rule__Subtitle__Group_2__0"
    // InternalVideoMontage.g:1919:1: rule__Subtitle__Group_2__0 : rule__Subtitle__Group_2__0__Impl rule__Subtitle__Group_2__1 ;
    public final void rule__Subtitle__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1923:1: ( rule__Subtitle__Group_2__0__Impl rule__Subtitle__Group_2__1 )
            // InternalVideoMontage.g:1924:2: rule__Subtitle__Group_2__0__Impl rule__Subtitle__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__Subtitle__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subtitle__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_2__0"


    // $ANTLR start "rule__Subtitle__Group_2__0__Impl"
    // InternalVideoMontage.g:1931:1: rule__Subtitle__Group_2__0__Impl : ( 'duration' ) ;
    public final void rule__Subtitle__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1935:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:1936:1: ( 'duration' )
            {
            // InternalVideoMontage.g:1936:1: ( 'duration' )
            // InternalVideoMontage.g:1937:2: 'duration'
            {
             before(grammarAccess.getSubtitleAccess().getDurationKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getDurationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_2__0__Impl"


    // $ANTLR start "rule__Subtitle__Group_2__1"
    // InternalVideoMontage.g:1946:1: rule__Subtitle__Group_2__1 : rule__Subtitle__Group_2__1__Impl ;
    public final void rule__Subtitle__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1950:1: ( rule__Subtitle__Group_2__1__Impl )
            // InternalVideoMontage.g:1951:2: rule__Subtitle__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_2__1"


    // $ANTLR start "rule__Subtitle__Group_2__1__Impl"
    // InternalVideoMontage.g:1957:1: rule__Subtitle__Group_2__1__Impl : ( ( rule__Subtitle__DurationAssignment_2_1 ) ) ;
    public final void rule__Subtitle__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1961:1: ( ( ( rule__Subtitle__DurationAssignment_2_1 ) ) )
            // InternalVideoMontage.g:1962:1: ( ( rule__Subtitle__DurationAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:1962:1: ( ( rule__Subtitle__DurationAssignment_2_1 ) )
            // InternalVideoMontage.g:1963:2: ( rule__Subtitle__DurationAssignment_2_1 )
            {
             before(grammarAccess.getSubtitleAccess().getDurationAssignment_2_1()); 
            // InternalVideoMontage.g:1964:2: ( rule__Subtitle__DurationAssignment_2_1 )
            // InternalVideoMontage.g:1964:3: rule__Subtitle__DurationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__DurationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getDurationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__Group_2__1__Impl"


    // $ANTLR start "rule__Subtitle__Group_6__0"
    // InternalVideoMontage.g:1973:1: rule__Subtitle__Group_6__0 : rule__Subtitle__Group_6__0__Impl rule__Subtitle__Group_6__1 ;
    public final void rule__Subtitle__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1977:1: ( rule__Subtitle__Group_6__0__Impl rule__Subtitle__Group_6__1 )
            // InternalVideoMontage.g:1978:2: rule__Subtitle__Group_6__0__Impl rule__Subtitle__Group_6__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoMontage.g:1985:1: rule__Subtitle__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Subtitle__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:1989:1: ( ( ',' ) )
            // InternalVideoMontage.g:1990:1: ( ',' )
            {
            // InternalVideoMontage.g:1990:1: ( ',' )
            // InternalVideoMontage.g:1991:2: ','
            {
             before(grammarAccess.getSubtitleAccess().getCommaKeyword_6_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSubtitleAccess().getCommaKeyword_6_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2000:1: rule__Subtitle__Group_6__1 : rule__Subtitle__Group_6__1__Impl ;
    public final void rule__Subtitle__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2004:1: ( rule__Subtitle__Group_6__1__Impl )
            // InternalVideoMontage.g:2005:2: rule__Subtitle__Group_6__1__Impl
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
    // InternalVideoMontage.g:2011:1: rule__Subtitle__Group_6__1__Impl : ( ( rule__Subtitle__RelativemomentAssignment_6_1 ) ) ;
    public final void rule__Subtitle__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2015:1: ( ( ( rule__Subtitle__RelativemomentAssignment_6_1 ) ) )
            // InternalVideoMontage.g:2016:1: ( ( rule__Subtitle__RelativemomentAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:2016:1: ( ( rule__Subtitle__RelativemomentAssignment_6_1 ) )
            // InternalVideoMontage.g:2017:2: ( rule__Subtitle__RelativemomentAssignment_6_1 )
            {
             before(grammarAccess.getSubtitleAccess().getRelativemomentAssignment_6_1()); 
            // InternalVideoMontage.g:2018:2: ( rule__Subtitle__RelativemomentAssignment_6_1 )
            // InternalVideoMontage.g:2018:3: rule__Subtitle__RelativemomentAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Subtitle__RelativemomentAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSubtitleAccess().getRelativemomentAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalVideoMontage.g:2027:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2031:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalVideoMontage.g:2032:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
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
    // InternalVideoMontage.g:2039:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2043:1: ( ( ( '-' )? ) )
            // InternalVideoMontage.g:2044:1: ( ( '-' )? )
            {
            // InternalVideoMontage.g:2044:1: ( ( '-' )? )
            // InternalVideoMontage.g:2045:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalVideoMontage.g:2046:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVideoMontage.g:2046:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalVideoMontage.g:2054:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2058:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalVideoMontage.g:2059:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
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
    // InternalVideoMontage.g:2066:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2070:1: ( ( ( RULE_INT )? ) )
            // InternalVideoMontage.g:2071:1: ( ( RULE_INT )? )
            {
            // InternalVideoMontage.g:2071:1: ( ( RULE_INT )? )
            // InternalVideoMontage.g:2072:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalVideoMontage.g:2073:2: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVideoMontage.g:2073:3: RULE_INT
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
    // InternalVideoMontage.g:2081:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2085:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalVideoMontage.g:2086:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalVideoMontage.g:2093:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2097:1: ( ( '.' ) )
            // InternalVideoMontage.g:2098:1: ( '.' )
            {
            // InternalVideoMontage.g:2098:1: ( '.' )
            // InternalVideoMontage.g:2099:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalVideoMontage.g:2108:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2112:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalVideoMontage.g:2113:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalVideoMontage.g:2120:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2124:1: ( ( RULE_INT ) )
            // InternalVideoMontage.g:2125:1: ( RULE_INT )
            {
            // InternalVideoMontage.g:2125:1: ( RULE_INT )
            // InternalVideoMontage.g:2126:2: RULE_INT
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
    // InternalVideoMontage.g:2135:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2139:1: ( rule__EDouble__Group__4__Impl )
            // InternalVideoMontage.g:2140:2: rule__EDouble__Group__4__Impl
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
    // InternalVideoMontage.g:2146:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2150:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalVideoMontage.g:2151:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalVideoMontage.g:2151:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalVideoMontage.g:2152:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalVideoMontage.g:2153:2: ( rule__EDouble__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=12 && LA17_0<=13)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVideoMontage.g:2153:3: rule__EDouble__Group_4__0
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
    // InternalVideoMontage.g:2162:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2166:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalVideoMontage.g:2167:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:2174:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2178:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalVideoMontage.g:2179:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalVideoMontage.g:2179:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalVideoMontage.g:2180:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalVideoMontage.g:2181:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalVideoMontage.g:2181:3: rule__EDouble__Alternatives_4_0
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
    // InternalVideoMontage.g:2189:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2193:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalVideoMontage.g:2194:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:2201:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2205:1: ( ( ( '-' )? ) )
            // InternalVideoMontage.g:2206:1: ( ( '-' )? )
            {
            // InternalVideoMontage.g:2206:1: ( ( '-' )? )
            // InternalVideoMontage.g:2207:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalVideoMontage.g:2208:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVideoMontage.g:2208:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalVideoMontage.g:2216:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2220:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalVideoMontage.g:2221:2: rule__EDouble__Group_4__2__Impl
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
    // InternalVideoMontage.g:2227:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2231:1: ( ( RULE_INT ) )
            // InternalVideoMontage.g:2232:1: ( RULE_INT )
            {
            // InternalVideoMontage.g:2232:1: ( RULE_INT )
            // InternalVideoMontage.g:2233:2: RULE_INT
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


    // $ANTLR start "rule__RelativeMoment__Group__0"
    // InternalVideoMontage.g:2243:1: rule__RelativeMoment__Group__0 : rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1 ;
    public final void rule__RelativeMoment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2247:1: ( rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1 )
            // InternalVideoMontage.g:2248:2: rule__RelativeMoment__Group__0__Impl rule__RelativeMoment__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoMontage.g:2255:1: rule__RelativeMoment__Group__0__Impl : ( () ) ;
    public final void rule__RelativeMoment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2259:1: ( ( () ) )
            // InternalVideoMontage.g:2260:1: ( () )
            {
            // InternalVideoMontage.g:2260:1: ( () )
            // InternalVideoMontage.g:2261:2: ()
            {
             before(grammarAccess.getRelativeMomentAccess().getRelativeMomentAction_0()); 
            // InternalVideoMontage.g:2262:2: ()
            // InternalVideoMontage.g:2262:3: 
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
    // InternalVideoMontage.g:2270:1: rule__RelativeMoment__Group__1 : rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2 ;
    public final void rule__RelativeMoment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2274:1: ( rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2 )
            // InternalVideoMontage.g:2275:2: rule__RelativeMoment__Group__1__Impl rule__RelativeMoment__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:2282:1: rule__RelativeMoment__Group__1__Impl : ( 'RelativeMoment' ) ;
    public final void rule__RelativeMoment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2286:1: ( ( 'RelativeMoment' ) )
            // InternalVideoMontage.g:2287:1: ( 'RelativeMoment' )
            {
            // InternalVideoMontage.g:2287:1: ( 'RelativeMoment' )
            // InternalVideoMontage.g:2288:2: 'RelativeMoment'
            {
             before(grammarAccess.getRelativeMomentAccess().getRelativeMomentKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRelativeMomentAccess().getRelativeMomentKeyword_1()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2297:1: rule__RelativeMoment__Group__2 : rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3 ;
    public final void rule__RelativeMoment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2301:1: ( rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3 )
            // InternalVideoMontage.g:2302:2: rule__RelativeMoment__Group__2__Impl rule__RelativeMoment__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalVideoMontage.g:2309:1: rule__RelativeMoment__Group__2__Impl : ( '{' ) ;
    public final void rule__RelativeMoment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2313:1: ( ( '{' ) )
            // InternalVideoMontage.g:2314:1: ( '{' )
            {
            // InternalVideoMontage.g:2314:1: ( '{' )
            // InternalVideoMontage.g:2315:2: '{'
            {
             before(grammarAccess.getRelativeMomentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRelativeMomentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2324:1: rule__RelativeMoment__Group__3 : rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4 ;
    public final void rule__RelativeMoment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2328:1: ( rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4 )
            // InternalVideoMontage.g:2329:2: rule__RelativeMoment__Group__3__Impl rule__RelativeMoment__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalVideoMontage.g:2336:1: rule__RelativeMoment__Group__3__Impl : ( ( rule__RelativeMoment__Group_3__0 )? ) ;
    public final void rule__RelativeMoment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2340:1: ( ( ( rule__RelativeMoment__Group_3__0 )? ) )
            // InternalVideoMontage.g:2341:1: ( ( rule__RelativeMoment__Group_3__0 )? )
            {
            // InternalVideoMontage.g:2341:1: ( ( rule__RelativeMoment__Group_3__0 )? )
            // InternalVideoMontage.g:2342:2: ( rule__RelativeMoment__Group_3__0 )?
            {
             before(grammarAccess.getRelativeMomentAccess().getGroup_3()); 
            // InternalVideoMontage.g:2343:2: ( rule__RelativeMoment__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVideoMontage.g:2343:3: rule__RelativeMoment__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelativeMoment__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelativeMomentAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2351:1: rule__RelativeMoment__Group__4 : rule__RelativeMoment__Group__4__Impl rule__RelativeMoment__Group__5 ;
    public final void rule__RelativeMoment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2355:1: ( rule__RelativeMoment__Group__4__Impl rule__RelativeMoment__Group__5 )
            // InternalVideoMontage.g:2356:2: rule__RelativeMoment__Group__4__Impl rule__RelativeMoment__Group__5
            {
            pushFollow(FOLLOW_24);
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
    // InternalVideoMontage.g:2363:1: rule__RelativeMoment__Group__4__Impl : ( ( rule__RelativeMoment__Group_4__0 )? ) ;
    public final void rule__RelativeMoment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2367:1: ( ( ( rule__RelativeMoment__Group_4__0 )? ) )
            // InternalVideoMontage.g:2368:1: ( ( rule__RelativeMoment__Group_4__0 )? )
            {
            // InternalVideoMontage.g:2368:1: ( ( rule__RelativeMoment__Group_4__0 )? )
            // InternalVideoMontage.g:2369:2: ( rule__RelativeMoment__Group_4__0 )?
            {
             before(grammarAccess.getRelativeMomentAccess().getGroup_4()); 
            // InternalVideoMontage.g:2370:2: ( rule__RelativeMoment__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVideoMontage.g:2370:3: rule__RelativeMoment__Group_4__0
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


    // $ANTLR start "rule__RelativeMoment__Group__5"
    // InternalVideoMontage.g:2378:1: rule__RelativeMoment__Group__5 : rule__RelativeMoment__Group__5__Impl ;
    public final void rule__RelativeMoment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2382:1: ( rule__RelativeMoment__Group__5__Impl )
            // InternalVideoMontage.g:2383:2: rule__RelativeMoment__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:2389:1: rule__RelativeMoment__Group__5__Impl : ( '}' ) ;
    public final void rule__RelativeMoment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2393:1: ( ( '}' ) )
            // InternalVideoMontage.g:2394:1: ( '}' )
            {
            // InternalVideoMontage.g:2394:1: ( '}' )
            // InternalVideoMontage.g:2395:2: '}'
            {
             before(grammarAccess.getRelativeMomentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRelativeMomentAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__RelativeMoment__Group_3__0"
    // InternalVideoMontage.g:2405:1: rule__RelativeMoment__Group_3__0 : rule__RelativeMoment__Group_3__0__Impl rule__RelativeMoment__Group_3__1 ;
    public final void rule__RelativeMoment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2409:1: ( rule__RelativeMoment__Group_3__0__Impl rule__RelativeMoment__Group_3__1 )
            // InternalVideoMontage.g:2410:2: rule__RelativeMoment__Group_3__0__Impl rule__RelativeMoment__Group_3__1
            {
            pushFollow(FOLLOW_25);
            rule__RelativeMoment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group_3__0"


    // $ANTLR start "rule__RelativeMoment__Group_3__0__Impl"
    // InternalVideoMontage.g:2417:1: rule__RelativeMoment__Group_3__0__Impl : ( 'moment' ) ;
    public final void rule__RelativeMoment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2421:1: ( ( 'moment' ) )
            // InternalVideoMontage.g:2422:1: ( 'moment' )
            {
            // InternalVideoMontage.g:2422:1: ( 'moment' )
            // InternalVideoMontage.g:2423:2: 'moment'
            {
             before(grammarAccess.getRelativeMomentAccess().getMomentKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRelativeMomentAccess().getMomentKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group_3__0__Impl"


    // $ANTLR start "rule__RelativeMoment__Group_3__1"
    // InternalVideoMontage.g:2432:1: rule__RelativeMoment__Group_3__1 : rule__RelativeMoment__Group_3__1__Impl ;
    public final void rule__RelativeMoment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2436:1: ( rule__RelativeMoment__Group_3__1__Impl )
            // InternalVideoMontage.g:2437:2: rule__RelativeMoment__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group_3__1"


    // $ANTLR start "rule__RelativeMoment__Group_3__1__Impl"
    // InternalVideoMontage.g:2443:1: rule__RelativeMoment__Group_3__1__Impl : ( ( rule__RelativeMoment__MomentAssignment_3_1 ) ) ;
    public final void rule__RelativeMoment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2447:1: ( ( ( rule__RelativeMoment__MomentAssignment_3_1 ) ) )
            // InternalVideoMontage.g:2448:1: ( ( rule__RelativeMoment__MomentAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:2448:1: ( ( rule__RelativeMoment__MomentAssignment_3_1 ) )
            // InternalVideoMontage.g:2449:2: ( rule__RelativeMoment__MomentAssignment_3_1 )
            {
             before(grammarAccess.getRelativeMomentAccess().getMomentAssignment_3_1()); 
            // InternalVideoMontage.g:2450:2: ( rule__RelativeMoment__MomentAssignment_3_1 )
            // InternalVideoMontage.g:2450:3: rule__RelativeMoment__MomentAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeMoment__MomentAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeMomentAccess().getMomentAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__Group_3__1__Impl"


    // $ANTLR start "rule__RelativeMoment__Group_4__0"
    // InternalVideoMontage.g:2459:1: rule__RelativeMoment__Group_4__0 : rule__RelativeMoment__Group_4__0__Impl rule__RelativeMoment__Group_4__1 ;
    public final void rule__RelativeMoment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2463:1: ( rule__RelativeMoment__Group_4__0__Impl rule__RelativeMoment__Group_4__1 )
            // InternalVideoMontage.g:2464:2: rule__RelativeMoment__Group_4__0__Impl rule__RelativeMoment__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalVideoMontage.g:2471:1: rule__RelativeMoment__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__RelativeMoment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2475:1: ( ( 'value' ) )
            // InternalVideoMontage.g:2476:1: ( 'value' )
            {
            // InternalVideoMontage.g:2476:1: ( 'value' )
            // InternalVideoMontage.g:2477:2: 'value'
            {
             before(grammarAccess.getRelativeMomentAccess().getValueKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRelativeMomentAccess().getValueKeyword_4_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2486:1: rule__RelativeMoment__Group_4__1 : rule__RelativeMoment__Group_4__1__Impl ;
    public final void rule__RelativeMoment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2490:1: ( rule__RelativeMoment__Group_4__1__Impl )
            // InternalVideoMontage.g:2491:2: rule__RelativeMoment__Group_4__1__Impl
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
    // InternalVideoMontage.g:2497:1: rule__RelativeMoment__Group_4__1__Impl : ( ( rule__RelativeMoment__ValueAssignment_4_1 ) ) ;
    public final void rule__RelativeMoment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2501:1: ( ( ( rule__RelativeMoment__ValueAssignment_4_1 ) ) )
            // InternalVideoMontage.g:2502:1: ( ( rule__RelativeMoment__ValueAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:2502:1: ( ( rule__RelativeMoment__ValueAssignment_4_1 ) )
            // InternalVideoMontage.g:2503:2: ( rule__RelativeMoment__ValueAssignment_4_1 )
            {
             before(grammarAccess.getRelativeMomentAccess().getValueAssignment_4_1()); 
            // InternalVideoMontage.g:2504:2: ( rule__RelativeMoment__ValueAssignment_4_1 )
            // InternalVideoMontage.g:2504:3: rule__RelativeMoment__ValueAssignment_4_1
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


    // $ANTLR start "rule__Transition__Group__0"
    // InternalVideoMontage.g:2513:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2517:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalVideoMontage.g:2518:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:2525:1: rule__Transition__Group__0__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2529:1: ( ( 'Transition' ) )
            // InternalVideoMontage.g:2530:1: ( 'Transition' )
            {
            // InternalVideoMontage.g:2530:1: ( 'Transition' )
            // InternalVideoMontage.g:2531:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalVideoMontage.g:2540:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2544:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalVideoMontage.g:2545:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalVideoMontage.g:2552:1: rule__Transition__Group__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2556:1: ( ( '{' ) )
            // InternalVideoMontage.g:2557:1: ( '{' )
            {
            // InternalVideoMontage.g:2557:1: ( '{' )
            // InternalVideoMontage.g:2558:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalVideoMontage.g:2567:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2571:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalVideoMontage.g:2572:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalVideoMontage.g:2579:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__Group_2__0 )? ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2583:1: ( ( ( rule__Transition__Group_2__0 )? ) )
            // InternalVideoMontage.g:2584:1: ( ( rule__Transition__Group_2__0 )? )
            {
            // InternalVideoMontage.g:2584:1: ( ( rule__Transition__Group_2__0 )? )
            // InternalVideoMontage.g:2585:2: ( rule__Transition__Group_2__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_2()); 
            // InternalVideoMontage.g:2586:2: ( rule__Transition__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVideoMontage.g:2586:3: rule__Transition__Group_2__0
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
    // InternalVideoMontage.g:2594:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2598:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalVideoMontage.g:2599:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalVideoMontage.g:2606:1: rule__Transition__Group__3__Impl : ( 'audioelement' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2610:1: ( ( 'audioelement' ) )
            // InternalVideoMontage.g:2611:1: ( 'audioelement' )
            {
            // InternalVideoMontage.g:2611:1: ( 'audioelement' )
            // InternalVideoMontage.g:2612:2: 'audioelement'
            {
             before(grammarAccess.getTransitionAccess().getAudioelementKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getAudioelementKeyword_3()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2621:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2625:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalVideoMontage.g:2626:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalVideoMontage.g:2633:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__AudioelementAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2637:1: ( ( ( rule__Transition__AudioelementAssignment_4 ) ) )
            // InternalVideoMontage.g:2638:1: ( ( rule__Transition__AudioelementAssignment_4 ) )
            {
            // InternalVideoMontage.g:2638:1: ( ( rule__Transition__AudioelementAssignment_4 ) )
            // InternalVideoMontage.g:2639:2: ( rule__Transition__AudioelementAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getAudioelementAssignment_4()); 
            // InternalVideoMontage.g:2640:2: ( rule__Transition__AudioelementAssignment_4 )
            // InternalVideoMontage.g:2640:3: rule__Transition__AudioelementAssignment_4
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
    // InternalVideoMontage.g:2648:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2652:1: ( rule__Transition__Group__5__Impl )
            // InternalVideoMontage.g:2653:2: rule__Transition__Group__5__Impl
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
    // InternalVideoMontage.g:2659:1: rule__Transition__Group__5__Impl : ( '}' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2663:1: ( ( '}' ) )
            // InternalVideoMontage.g:2664:1: ( '}' )
            {
            // InternalVideoMontage.g:2664:1: ( '}' )
            // InternalVideoMontage.g:2665:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalVideoMontage.g:2675:1: rule__Transition__Group_2__0 : rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 ;
    public final void rule__Transition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2679:1: ( rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1 )
            // InternalVideoMontage.g:2680:2: rule__Transition__Group_2__0__Impl rule__Transition__Group_2__1
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
    // InternalVideoMontage.g:2687:1: rule__Transition__Group_2__0__Impl : ( 'duration' ) ;
    public final void rule__Transition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2691:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:2692:1: ( 'duration' )
            {
            // InternalVideoMontage.g:2692:1: ( 'duration' )
            // InternalVideoMontage.g:2693:2: 'duration'
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
    // InternalVideoMontage.g:2702:1: rule__Transition__Group_2__1 : rule__Transition__Group_2__1__Impl ;
    public final void rule__Transition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2706:1: ( rule__Transition__Group_2__1__Impl )
            // InternalVideoMontage.g:2707:2: rule__Transition__Group_2__1__Impl
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
    // InternalVideoMontage.g:2713:1: rule__Transition__Group_2__1__Impl : ( ( rule__Transition__DurationAssignment_2_1 ) ) ;
    public final void rule__Transition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2717:1: ( ( ( rule__Transition__DurationAssignment_2_1 ) ) )
            // InternalVideoMontage.g:2718:1: ( ( rule__Transition__DurationAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:2718:1: ( ( rule__Transition__DurationAssignment_2_1 ) )
            // InternalVideoMontage.g:2719:2: ( rule__Transition__DurationAssignment_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getDurationAssignment_2_1()); 
            // InternalVideoMontage.g:2720:2: ( rule__Transition__DurationAssignment_2_1 )
            // InternalVideoMontage.g:2720:3: rule__Transition__DurationAssignment_2_1
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


    // $ANTLR start "rule__StartingMoment_Impl__Group__0"
    // InternalVideoMontage.g:2729:1: rule__StartingMoment_Impl__Group__0 : rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1 ;
    public final void rule__StartingMoment_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2733:1: ( rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1 )
            // InternalVideoMontage.g:2734:2: rule__StartingMoment_Impl__Group__0__Impl rule__StartingMoment_Impl__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalVideoMontage.g:2741:1: rule__StartingMoment_Impl__Group__0__Impl : ( () ) ;
    public final void rule__StartingMoment_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2745:1: ( ( () ) )
            // InternalVideoMontage.g:2746:1: ( () )
            {
            // InternalVideoMontage.g:2746:1: ( () )
            // InternalVideoMontage.g:2747:2: ()
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getStartingMomentAction_0()); 
            // InternalVideoMontage.g:2748:2: ()
            // InternalVideoMontage.g:2748:3: 
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
    // InternalVideoMontage.g:2756:1: rule__StartingMoment_Impl__Group__1 : rule__StartingMoment_Impl__Group__1__Impl ;
    public final void rule__StartingMoment_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2760:1: ( rule__StartingMoment_Impl__Group__1__Impl )
            // InternalVideoMontage.g:2761:2: rule__StartingMoment_Impl__Group__1__Impl
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
    // InternalVideoMontage.g:2767:1: rule__StartingMoment_Impl__Group__1__Impl : ( 'StartingMoment' ) ;
    public final void rule__StartingMoment_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2771:1: ( ( 'StartingMoment' ) )
            // InternalVideoMontage.g:2772:1: ( 'StartingMoment' )
            {
            // InternalVideoMontage.g:2772:1: ( 'StartingMoment' )
            // InternalVideoMontage.g:2773:2: 'StartingMoment'
            {
             before(grammarAccess.getStartingMoment_ImplAccess().getStartingMomentKeyword_1()); 
            match(input,35,FOLLOW_2); 
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


    // $ANTLR start "rule__Audio__Group__0"
    // InternalVideoMontage.g:2783:1: rule__Audio__Group__0 : rule__Audio__Group__0__Impl rule__Audio__Group__1 ;
    public final void rule__Audio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2787:1: ( rule__Audio__Group__0__Impl rule__Audio__Group__1 )
            // InternalVideoMontage.g:2788:2: rule__Audio__Group__0__Impl rule__Audio__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:2795:1: rule__Audio__Group__0__Impl : ( 'Audio' ) ;
    public final void rule__Audio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2799:1: ( ( 'Audio' ) )
            // InternalVideoMontage.g:2800:1: ( 'Audio' )
            {
            // InternalVideoMontage.g:2800:1: ( 'Audio' )
            // InternalVideoMontage.g:2801:2: 'Audio'
            {
             before(grammarAccess.getAudioAccess().getAudioKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalVideoMontage.g:2810:1: rule__Audio__Group__1 : rule__Audio__Group__1__Impl rule__Audio__Group__2 ;
    public final void rule__Audio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2814:1: ( rule__Audio__Group__1__Impl rule__Audio__Group__2 )
            // InternalVideoMontage.g:2815:2: rule__Audio__Group__1__Impl rule__Audio__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:2822:1: rule__Audio__Group__1__Impl : ( ( rule__Audio__NameAssignment_1 ) ) ;
    public final void rule__Audio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2826:1: ( ( ( rule__Audio__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:2827:1: ( ( rule__Audio__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:2827:1: ( ( rule__Audio__NameAssignment_1 ) )
            // InternalVideoMontage.g:2828:2: ( rule__Audio__NameAssignment_1 )
            {
             before(grammarAccess.getAudioAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:2829:2: ( rule__Audio__NameAssignment_1 )
            // InternalVideoMontage.g:2829:3: rule__Audio__NameAssignment_1
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
    // InternalVideoMontage.g:2837:1: rule__Audio__Group__2 : rule__Audio__Group__2__Impl rule__Audio__Group__3 ;
    public final void rule__Audio__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2841:1: ( rule__Audio__Group__2__Impl rule__Audio__Group__3 )
            // InternalVideoMontage.g:2842:2: rule__Audio__Group__2__Impl rule__Audio__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalVideoMontage.g:2849:1: rule__Audio__Group__2__Impl : ( '{' ) ;
    public final void rule__Audio__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2853:1: ( ( '{' ) )
            // InternalVideoMontage.g:2854:1: ( '{' )
            {
            // InternalVideoMontage.g:2854:1: ( '{' )
            // InternalVideoMontage.g:2855:2: '{'
            {
             before(grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalVideoMontage.g:2864:1: rule__Audio__Group__3 : rule__Audio__Group__3__Impl rule__Audio__Group__4 ;
    public final void rule__Audio__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2868:1: ( rule__Audio__Group__3__Impl rule__Audio__Group__4 )
            // InternalVideoMontage.g:2869:2: rule__Audio__Group__3__Impl rule__Audio__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalVideoMontage.g:2876:1: rule__Audio__Group__3__Impl : ( ( rule__Audio__Group_3__0 )? ) ;
    public final void rule__Audio__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2880:1: ( ( ( rule__Audio__Group_3__0 )? ) )
            // InternalVideoMontage.g:2881:1: ( ( rule__Audio__Group_3__0 )? )
            {
            // InternalVideoMontage.g:2881:1: ( ( rule__Audio__Group_3__0 )? )
            // InternalVideoMontage.g:2882:2: ( rule__Audio__Group_3__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_3()); 
            // InternalVideoMontage.g:2883:2: ( rule__Audio__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVideoMontage.g:2883:3: rule__Audio__Group_3__0
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
    // InternalVideoMontage.g:2891:1: rule__Audio__Group__4 : rule__Audio__Group__4__Impl rule__Audio__Group__5 ;
    public final void rule__Audio__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2895:1: ( rule__Audio__Group__4__Impl rule__Audio__Group__5 )
            // InternalVideoMontage.g:2896:2: rule__Audio__Group__4__Impl rule__Audio__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalVideoMontage.g:2903:1: rule__Audio__Group__4__Impl : ( ( rule__Audio__Group_4__0 )? ) ;
    public final void rule__Audio__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2907:1: ( ( ( rule__Audio__Group_4__0 )? ) )
            // InternalVideoMontage.g:2908:1: ( ( rule__Audio__Group_4__0 )? )
            {
            // InternalVideoMontage.g:2908:1: ( ( rule__Audio__Group_4__0 )? )
            // InternalVideoMontage.g:2909:2: ( rule__Audio__Group_4__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_4()); 
            // InternalVideoMontage.g:2910:2: ( rule__Audio__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVideoMontage.g:2910:3: rule__Audio__Group_4__0
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
    // InternalVideoMontage.g:2918:1: rule__Audio__Group__5 : rule__Audio__Group__5__Impl rule__Audio__Group__6 ;
    public final void rule__Audio__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2922:1: ( rule__Audio__Group__5__Impl rule__Audio__Group__6 )
            // InternalVideoMontage.g:2923:2: rule__Audio__Group__5__Impl rule__Audio__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:2930:1: rule__Audio__Group__5__Impl : ( 'relativemoment' ) ;
    public final void rule__Audio__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2934:1: ( ( 'relativemoment' ) )
            // InternalVideoMontage.g:2935:1: ( 'relativemoment' )
            {
            // InternalVideoMontage.g:2935:1: ( 'relativemoment' )
            // InternalVideoMontage.g:2936:2: 'relativemoment'
            {
             before(grammarAccess.getAudioAccess().getRelativemomentKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getRelativemomentKeyword_5()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2945:1: rule__Audio__Group__6 : rule__Audio__Group__6__Impl rule__Audio__Group__7 ;
    public final void rule__Audio__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2949:1: ( rule__Audio__Group__6__Impl rule__Audio__Group__7 )
            // InternalVideoMontage.g:2950:2: rule__Audio__Group__6__Impl rule__Audio__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoMontage.g:2957:1: rule__Audio__Group__6__Impl : ( '{' ) ;
    public final void rule__Audio__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2961:1: ( ( '{' ) )
            // InternalVideoMontage.g:2962:1: ( '{' )
            {
            // InternalVideoMontage.g:2962:1: ( '{' )
            // InternalVideoMontage.g:2963:2: '{'
            {
             before(grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2972:1: rule__Audio__Group__7 : rule__Audio__Group__7__Impl rule__Audio__Group__8 ;
    public final void rule__Audio__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2976:1: ( rule__Audio__Group__7__Impl rule__Audio__Group__8 )
            // InternalVideoMontage.g:2977:2: rule__Audio__Group__7__Impl rule__Audio__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalVideoMontage.g:2984:1: rule__Audio__Group__7__Impl : ( ( rule__Audio__RelativemomentAssignment_7 ) ) ;
    public final void rule__Audio__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:2988:1: ( ( ( rule__Audio__RelativemomentAssignment_7 ) ) )
            // InternalVideoMontage.g:2989:1: ( ( rule__Audio__RelativemomentAssignment_7 ) )
            {
            // InternalVideoMontage.g:2989:1: ( ( rule__Audio__RelativemomentAssignment_7 ) )
            // InternalVideoMontage.g:2990:2: ( rule__Audio__RelativemomentAssignment_7 )
            {
             before(grammarAccess.getAudioAccess().getRelativemomentAssignment_7()); 
            // InternalVideoMontage.g:2991:2: ( rule__Audio__RelativemomentAssignment_7 )
            // InternalVideoMontage.g:2991:3: rule__Audio__RelativemomentAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Audio__RelativemomentAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getRelativemomentAssignment_7()); 

            }


            }

        }
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
    // InternalVideoMontage.g:2999:1: rule__Audio__Group__8 : rule__Audio__Group__8__Impl rule__Audio__Group__9 ;
    public final void rule__Audio__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3003:1: ( rule__Audio__Group__8__Impl rule__Audio__Group__9 )
            // InternalVideoMontage.g:3004:2: rule__Audio__Group__8__Impl rule__Audio__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Audio__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__9();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:3011:1: rule__Audio__Group__8__Impl : ( ( rule__Audio__Group_8__0 )* ) ;
    public final void rule__Audio__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3015:1: ( ( ( rule__Audio__Group_8__0 )* ) )
            // InternalVideoMontage.g:3016:1: ( ( rule__Audio__Group_8__0 )* )
            {
            // InternalVideoMontage.g:3016:1: ( ( rule__Audio__Group_8__0 )* )
            // InternalVideoMontage.g:3017:2: ( rule__Audio__Group_8__0 )*
            {
             before(grammarAccess.getAudioAccess().getGroup_8()); 
            // InternalVideoMontage.g:3018:2: ( rule__Audio__Group_8__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==23) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalVideoMontage.g:3018:3: rule__Audio__Group_8__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Audio__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getAudioAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Audio__Group__9"
    // InternalVideoMontage.g:3026:1: rule__Audio__Group__9 : rule__Audio__Group__9__Impl rule__Audio__Group__10 ;
    public final void rule__Audio__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3030:1: ( rule__Audio__Group__9__Impl rule__Audio__Group__10 )
            // InternalVideoMontage.g:3031:2: rule__Audio__Group__9__Impl rule__Audio__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__Audio__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__9"


    // $ANTLR start "rule__Audio__Group__9__Impl"
    // InternalVideoMontage.g:3038:1: rule__Audio__Group__9__Impl : ( '}' ) ;
    public final void rule__Audio__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3042:1: ( ( '}' ) )
            // InternalVideoMontage.g:3043:1: ( '}' )
            {
            // InternalVideoMontage.g:3043:1: ( '}' )
            // InternalVideoMontage.g:3044:2: '}'
            {
             before(grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__9__Impl"


    // $ANTLR start "rule__Audio__Group__10"
    // InternalVideoMontage.g:3053:1: rule__Audio__Group__10 : rule__Audio__Group__10__Impl rule__Audio__Group__11 ;
    public final void rule__Audio__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3057:1: ( rule__Audio__Group__10__Impl rule__Audio__Group__11 )
            // InternalVideoMontage.g:3058:2: rule__Audio__Group__10__Impl rule__Audio__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__Audio__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__10"


    // $ANTLR start "rule__Audio__Group__10__Impl"
    // InternalVideoMontage.g:3065:1: rule__Audio__Group__10__Impl : ( ( rule__Audio__Group_10__0 )? ) ;
    public final void rule__Audio__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3069:1: ( ( ( rule__Audio__Group_10__0 )? ) )
            // InternalVideoMontage.g:3070:1: ( ( rule__Audio__Group_10__0 )? )
            {
            // InternalVideoMontage.g:3070:1: ( ( rule__Audio__Group_10__0 )? )
            // InternalVideoMontage.g:3071:2: ( rule__Audio__Group_10__0 )?
            {
             before(grammarAccess.getAudioAccess().getGroup_10()); 
            // InternalVideoMontage.g:3072:2: ( rule__Audio__Group_10__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVideoMontage.g:3072:3: rule__Audio__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Audio__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__10__Impl"


    // $ANTLR start "rule__Audio__Group__11"
    // InternalVideoMontage.g:3080:1: rule__Audio__Group__11 : rule__Audio__Group__11__Impl rule__Audio__Group__12 ;
    public final void rule__Audio__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3084:1: ( rule__Audio__Group__11__Impl rule__Audio__Group__12 )
            // InternalVideoMontage.g:3085:2: rule__Audio__Group__11__Impl rule__Audio__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__Audio__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__11"


    // $ANTLR start "rule__Audio__Group__11__Impl"
    // InternalVideoMontage.g:3092:1: rule__Audio__Group__11__Impl : ( 'startingmoment' ) ;
    public final void rule__Audio__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3096:1: ( ( 'startingmoment' ) )
            // InternalVideoMontage.g:3097:1: ( 'startingmoment' )
            {
            // InternalVideoMontage.g:3097:1: ( 'startingmoment' )
            // InternalVideoMontage.g:3098:2: 'startingmoment'
            {
             before(grammarAccess.getAudioAccess().getStartingmomentKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getStartingmomentKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__11__Impl"


    // $ANTLR start "rule__Audio__Group__12"
    // InternalVideoMontage.g:3107:1: rule__Audio__Group__12 : rule__Audio__Group__12__Impl rule__Audio__Group__13 ;
    public final void rule__Audio__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3111:1: ( rule__Audio__Group__12__Impl rule__Audio__Group__13 )
            // InternalVideoMontage.g:3112:2: rule__Audio__Group__12__Impl rule__Audio__Group__13
            {
            pushFollow(FOLLOW_30);
            rule__Audio__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__12"


    // $ANTLR start "rule__Audio__Group__12__Impl"
    // InternalVideoMontage.g:3119:1: rule__Audio__Group__12__Impl : ( ( rule__Audio__StartingmomentAssignment_12 ) ) ;
    public final void rule__Audio__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3123:1: ( ( ( rule__Audio__StartingmomentAssignment_12 ) ) )
            // InternalVideoMontage.g:3124:1: ( ( rule__Audio__StartingmomentAssignment_12 ) )
            {
            // InternalVideoMontage.g:3124:1: ( ( rule__Audio__StartingmomentAssignment_12 ) )
            // InternalVideoMontage.g:3125:2: ( rule__Audio__StartingmomentAssignment_12 )
            {
             before(grammarAccess.getAudioAccess().getStartingmomentAssignment_12()); 
            // InternalVideoMontage.g:3126:2: ( rule__Audio__StartingmomentAssignment_12 )
            // InternalVideoMontage.g:3126:3: rule__Audio__StartingmomentAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Audio__StartingmomentAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getStartingmomentAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__12__Impl"


    // $ANTLR start "rule__Audio__Group__13"
    // InternalVideoMontage.g:3134:1: rule__Audio__Group__13 : rule__Audio__Group__13__Impl rule__Audio__Group__14 ;
    public final void rule__Audio__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3138:1: ( rule__Audio__Group__13__Impl rule__Audio__Group__14 )
            // InternalVideoMontage.g:3139:2: rule__Audio__Group__13__Impl rule__Audio__Group__14
            {
            pushFollow(FOLLOW_5);
            rule__Audio__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__13"


    // $ANTLR start "rule__Audio__Group__13__Impl"
    // InternalVideoMontage.g:3146:1: rule__Audio__Group__13__Impl : ( 'audioclip' ) ;
    public final void rule__Audio__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3150:1: ( ( 'audioclip' ) )
            // InternalVideoMontage.g:3151:1: ( 'audioclip' )
            {
            // InternalVideoMontage.g:3151:1: ( 'audioclip' )
            // InternalVideoMontage.g:3152:2: 'audioclip'
            {
             before(grammarAccess.getAudioAccess().getAudioclipKeyword_13()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getAudioclipKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__13__Impl"


    // $ANTLR start "rule__Audio__Group__14"
    // InternalVideoMontage.g:3161:1: rule__Audio__Group__14 : rule__Audio__Group__14__Impl rule__Audio__Group__15 ;
    public final void rule__Audio__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3165:1: ( rule__Audio__Group__14__Impl rule__Audio__Group__15 )
            // InternalVideoMontage.g:3166:2: rule__Audio__Group__14__Impl rule__Audio__Group__15
            {
            pushFollow(FOLLOW_12);
            rule__Audio__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__14"


    // $ANTLR start "rule__Audio__Group__14__Impl"
    // InternalVideoMontage.g:3173:1: rule__Audio__Group__14__Impl : ( ( rule__Audio__AudioclipAssignment_14 ) ) ;
    public final void rule__Audio__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3177:1: ( ( ( rule__Audio__AudioclipAssignment_14 ) ) )
            // InternalVideoMontage.g:3178:1: ( ( rule__Audio__AudioclipAssignment_14 ) )
            {
            // InternalVideoMontage.g:3178:1: ( ( rule__Audio__AudioclipAssignment_14 ) )
            // InternalVideoMontage.g:3179:2: ( rule__Audio__AudioclipAssignment_14 )
            {
             before(grammarAccess.getAudioAccess().getAudioclipAssignment_14()); 
            // InternalVideoMontage.g:3180:2: ( rule__Audio__AudioclipAssignment_14 )
            // InternalVideoMontage.g:3180:3: rule__Audio__AudioclipAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Audio__AudioclipAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getAudioclipAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__14__Impl"


    // $ANTLR start "rule__Audio__Group__15"
    // InternalVideoMontage.g:3188:1: rule__Audio__Group__15 : rule__Audio__Group__15__Impl ;
    public final void rule__Audio__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3192:1: ( rule__Audio__Group__15__Impl )
            // InternalVideoMontage.g:3193:2: rule__Audio__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__15"


    // $ANTLR start "rule__Audio__Group__15__Impl"
    // InternalVideoMontage.g:3199:1: rule__Audio__Group__15__Impl : ( '}' ) ;
    public final void rule__Audio__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3203:1: ( ( '}' ) )
            // InternalVideoMontage.g:3204:1: ( '}' )
            {
            // InternalVideoMontage.g:3204:1: ( '}' )
            // InternalVideoMontage.g:3205:2: '}'
            {
             before(grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_15()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__15__Impl"


    // $ANTLR start "rule__Audio__Group_3__0"
    // InternalVideoMontage.g:3215:1: rule__Audio__Group_3__0 : rule__Audio__Group_3__0__Impl rule__Audio__Group_3__1 ;
    public final void rule__Audio__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3219:1: ( rule__Audio__Group_3__0__Impl rule__Audio__Group_3__1 )
            // InternalVideoMontage.g:3220:2: rule__Audio__Group_3__0__Impl rule__Audio__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalVideoMontage.g:3227:1: rule__Audio__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__Audio__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3231:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:3232:1: ( 'duration' )
            {
            // InternalVideoMontage.g:3232:1: ( 'duration' )
            // InternalVideoMontage.g:3233:2: 'duration'
            {
             before(grammarAccess.getAudioAccess().getDurationKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getDurationKeyword_3_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3242:1: rule__Audio__Group_3__1 : rule__Audio__Group_3__1__Impl ;
    public final void rule__Audio__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3246:1: ( rule__Audio__Group_3__1__Impl )
            // InternalVideoMontage.g:3247:2: rule__Audio__Group_3__1__Impl
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
    // InternalVideoMontage.g:3253:1: rule__Audio__Group_3__1__Impl : ( ( rule__Audio__DurationAssignment_3_1 ) ) ;
    public final void rule__Audio__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3257:1: ( ( ( rule__Audio__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:3258:1: ( ( rule__Audio__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:3258:1: ( ( rule__Audio__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:3259:2: ( rule__Audio__DurationAssignment_3_1 )
            {
             before(grammarAccess.getAudioAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:3260:2: ( rule__Audio__DurationAssignment_3_1 )
            // InternalVideoMontage.g:3260:3: rule__Audio__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getDurationAssignment_3_1()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3269:1: rule__Audio__Group_4__0 : rule__Audio__Group_4__0__Impl rule__Audio__Group_4__1 ;
    public final void rule__Audio__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3273:1: ( rule__Audio__Group_4__0__Impl rule__Audio__Group_4__1 )
            // InternalVideoMontage.g:3274:2: rule__Audio__Group_4__0__Impl rule__Audio__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:3281:1: rule__Audio__Group_4__0__Impl : ( 'path' ) ;
    public final void rule__Audio__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3285:1: ( ( 'path' ) )
            // InternalVideoMontage.g:3286:1: ( 'path' )
            {
            // InternalVideoMontage.g:3286:1: ( 'path' )
            // InternalVideoMontage.g:3287:2: 'path'
            {
             before(grammarAccess.getAudioAccess().getPathKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getPathKeyword_4_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3296:1: rule__Audio__Group_4__1 : rule__Audio__Group_4__1__Impl ;
    public final void rule__Audio__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3300:1: ( rule__Audio__Group_4__1__Impl )
            // InternalVideoMontage.g:3301:2: rule__Audio__Group_4__1__Impl
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
    // InternalVideoMontage.g:3307:1: rule__Audio__Group_4__1__Impl : ( ( rule__Audio__PathAssignment_4_1 ) ) ;
    public final void rule__Audio__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3311:1: ( ( ( rule__Audio__PathAssignment_4_1 ) ) )
            // InternalVideoMontage.g:3312:1: ( ( rule__Audio__PathAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:3312:1: ( ( rule__Audio__PathAssignment_4_1 ) )
            // InternalVideoMontage.g:3313:2: ( rule__Audio__PathAssignment_4_1 )
            {
             before(grammarAccess.getAudioAccess().getPathAssignment_4_1()); 
            // InternalVideoMontage.g:3314:2: ( rule__Audio__PathAssignment_4_1 )
            // InternalVideoMontage.g:3314:3: rule__Audio__PathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__PathAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getPathAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Audio__Group_8__0"
    // InternalVideoMontage.g:3323:1: rule__Audio__Group_8__0 : rule__Audio__Group_8__0__Impl rule__Audio__Group_8__1 ;
    public final void rule__Audio__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3327:1: ( rule__Audio__Group_8__0__Impl rule__Audio__Group_8__1 )
            // InternalVideoMontage.g:3328:2: rule__Audio__Group_8__0__Impl rule__Audio__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__Audio__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_8__0"


    // $ANTLR start "rule__Audio__Group_8__0__Impl"
    // InternalVideoMontage.g:3335:1: rule__Audio__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Audio__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3339:1: ( ( ',' ) )
            // InternalVideoMontage.g:3340:1: ( ',' )
            {
            // InternalVideoMontage.g:3340:1: ( ',' )
            // InternalVideoMontage.g:3341:2: ','
            {
             before(grammarAccess.getAudioAccess().getCommaKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_8__0__Impl"


    // $ANTLR start "rule__Audio__Group_8__1"
    // InternalVideoMontage.g:3350:1: rule__Audio__Group_8__1 : rule__Audio__Group_8__1__Impl ;
    public final void rule__Audio__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3354:1: ( rule__Audio__Group_8__1__Impl )
            // InternalVideoMontage.g:3355:2: rule__Audio__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_8__1"


    // $ANTLR start "rule__Audio__Group_8__1__Impl"
    // InternalVideoMontage.g:3361:1: rule__Audio__Group_8__1__Impl : ( ( rule__Audio__RelativemomentAssignment_8_1 ) ) ;
    public final void rule__Audio__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3365:1: ( ( ( rule__Audio__RelativemomentAssignment_8_1 ) ) )
            // InternalVideoMontage.g:3366:1: ( ( rule__Audio__RelativemomentAssignment_8_1 ) )
            {
            // InternalVideoMontage.g:3366:1: ( ( rule__Audio__RelativemomentAssignment_8_1 ) )
            // InternalVideoMontage.g:3367:2: ( rule__Audio__RelativemomentAssignment_8_1 )
            {
             before(grammarAccess.getAudioAccess().getRelativemomentAssignment_8_1()); 
            // InternalVideoMontage.g:3368:2: ( rule__Audio__RelativemomentAssignment_8_1 )
            // InternalVideoMontage.g:3368:3: rule__Audio__RelativemomentAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__RelativemomentAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getRelativemomentAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_8__1__Impl"


    // $ANTLR start "rule__Audio__Group_10__0"
    // InternalVideoMontage.g:3377:1: rule__Audio__Group_10__0 : rule__Audio__Group_10__0__Impl rule__Audio__Group_10__1 ;
    public final void rule__Audio__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3381:1: ( rule__Audio__Group_10__0__Impl rule__Audio__Group_10__1 )
            // InternalVideoMontage.g:3382:2: rule__Audio__Group_10__0__Impl rule__Audio__Group_10__1
            {
            pushFollow(FOLLOW_31);
            rule__Audio__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_10__0"


    // $ANTLR start "rule__Audio__Group_10__0__Impl"
    // InternalVideoMontage.g:3389:1: rule__Audio__Group_10__0__Impl : ( 'transition' ) ;
    public final void rule__Audio__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3393:1: ( ( 'transition' ) )
            // InternalVideoMontage.g:3394:1: ( 'transition' )
            {
            // InternalVideoMontage.g:3394:1: ( 'transition' )
            // InternalVideoMontage.g:3395:2: 'transition'
            {
             before(grammarAccess.getAudioAccess().getTransitionKeyword_10_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getTransitionKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_10__0__Impl"


    // $ANTLR start "rule__Audio__Group_10__1"
    // InternalVideoMontage.g:3404:1: rule__Audio__Group_10__1 : rule__Audio__Group_10__1__Impl ;
    public final void rule__Audio__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3408:1: ( rule__Audio__Group_10__1__Impl )
            // InternalVideoMontage.g:3409:2: rule__Audio__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_10__1"


    // $ANTLR start "rule__Audio__Group_10__1__Impl"
    // InternalVideoMontage.g:3415:1: rule__Audio__Group_10__1__Impl : ( ( rule__Audio__TransitionAssignment_10_1 ) ) ;
    public final void rule__Audio__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3419:1: ( ( ( rule__Audio__TransitionAssignment_10_1 ) ) )
            // InternalVideoMontage.g:3420:1: ( ( rule__Audio__TransitionAssignment_10_1 ) )
            {
            // InternalVideoMontage.g:3420:1: ( ( rule__Audio__TransitionAssignment_10_1 ) )
            // InternalVideoMontage.g:3421:2: ( rule__Audio__TransitionAssignment_10_1 )
            {
             before(grammarAccess.getAudioAccess().getTransitionAssignment_10_1()); 
            // InternalVideoMontage.g:3422:2: ( rule__Audio__TransitionAssignment_10_1 )
            // InternalVideoMontage.g:3422:3: rule__Audio__TransitionAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__TransitionAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getTransitionAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group_10__1__Impl"


    // $ANTLR start "rule__AudioClip__Group__0"
    // InternalVideoMontage.g:3431:1: rule__AudioClip__Group__0 : rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1 ;
    public final void rule__AudioClip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3435:1: ( rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1 )
            // InternalVideoMontage.g:3436:2: rule__AudioClip__Group__0__Impl rule__AudioClip__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:3443:1: rule__AudioClip__Group__0__Impl : ( 'AudioClip' ) ;
    public final void rule__AudioClip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3447:1: ( ( 'AudioClip' ) )
            // InternalVideoMontage.g:3448:1: ( 'AudioClip' )
            {
            // InternalVideoMontage.g:3448:1: ( 'AudioClip' )
            // InternalVideoMontage.g:3449:2: 'AudioClip'
            {
             before(grammarAccess.getAudioClipAccess().getAudioClipKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalVideoMontage.g:3458:1: rule__AudioClip__Group__1 : rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2 ;
    public final void rule__AudioClip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3462:1: ( rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2 )
            // InternalVideoMontage.g:3463:2: rule__AudioClip__Group__1__Impl rule__AudioClip__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:3470:1: rule__AudioClip__Group__1__Impl : ( ( rule__AudioClip__NameAssignment_1 ) ) ;
    public final void rule__AudioClip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3474:1: ( ( ( rule__AudioClip__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:3475:1: ( ( rule__AudioClip__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:3475:1: ( ( rule__AudioClip__NameAssignment_1 ) )
            // InternalVideoMontage.g:3476:2: ( rule__AudioClip__NameAssignment_1 )
            {
             before(grammarAccess.getAudioClipAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:3477:2: ( rule__AudioClip__NameAssignment_1 )
            // InternalVideoMontage.g:3477:3: rule__AudioClip__NameAssignment_1
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
    // InternalVideoMontage.g:3485:1: rule__AudioClip__Group__2 : rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3 ;
    public final void rule__AudioClip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3489:1: ( rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3 )
            // InternalVideoMontage.g:3490:2: rule__AudioClip__Group__2__Impl rule__AudioClip__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalVideoMontage.g:3497:1: rule__AudioClip__Group__2__Impl : ( '{' ) ;
    public final void rule__AudioClip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3501:1: ( ( '{' ) )
            // InternalVideoMontage.g:3502:1: ( '{' )
            {
            // InternalVideoMontage.g:3502:1: ( '{' )
            // InternalVideoMontage.g:3503:2: '{'
            {
             before(grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3512:1: rule__AudioClip__Group__3 : rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4 ;
    public final void rule__AudioClip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3516:1: ( rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4 )
            // InternalVideoMontage.g:3517:2: rule__AudioClip__Group__3__Impl rule__AudioClip__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalVideoMontage.g:3524:1: rule__AudioClip__Group__3__Impl : ( ( rule__AudioClip__Group_3__0 )? ) ;
    public final void rule__AudioClip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3528:1: ( ( ( rule__AudioClip__Group_3__0 )? ) )
            // InternalVideoMontage.g:3529:1: ( ( rule__AudioClip__Group_3__0 )? )
            {
            // InternalVideoMontage.g:3529:1: ( ( rule__AudioClip__Group_3__0 )? )
            // InternalVideoMontage.g:3530:2: ( rule__AudioClip__Group_3__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_3()); 
            // InternalVideoMontage.g:3531:2: ( rule__AudioClip__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVideoMontage.g:3531:3: rule__AudioClip__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioClip__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioClipAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3539:1: rule__AudioClip__Group__4 : rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5 ;
    public final void rule__AudioClip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3543:1: ( rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5 )
            // InternalVideoMontage.g:3544:2: rule__AudioClip__Group__4__Impl rule__AudioClip__Group__5
            {
            pushFollow(FOLLOW_32);
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
    // InternalVideoMontage.g:3551:1: rule__AudioClip__Group__4__Impl : ( ( rule__AudioClip__Group_4__0 )? ) ;
    public final void rule__AudioClip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3555:1: ( ( ( rule__AudioClip__Group_4__0 )? ) )
            // InternalVideoMontage.g:3556:1: ( ( rule__AudioClip__Group_4__0 )? )
            {
            // InternalVideoMontage.g:3556:1: ( ( rule__AudioClip__Group_4__0 )? )
            // InternalVideoMontage.g:3557:2: ( rule__AudioClip__Group_4__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_4()); 
            // InternalVideoMontage.g:3558:2: ( rule__AudioClip__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVideoMontage.g:3558:3: rule__AudioClip__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioClip__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioClipAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3566:1: rule__AudioClip__Group__5 : rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6 ;
    public final void rule__AudioClip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3570:1: ( rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6 )
            // InternalVideoMontage.g:3571:2: rule__AudioClip__Group__5__Impl rule__AudioClip__Group__6
            {
            pushFollow(FOLLOW_32);
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
    // InternalVideoMontage.g:3578:1: rule__AudioClip__Group__5__Impl : ( ( rule__AudioClip__Group_5__0 )? ) ;
    public final void rule__AudioClip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3582:1: ( ( ( rule__AudioClip__Group_5__0 )? ) )
            // InternalVideoMontage.g:3583:1: ( ( rule__AudioClip__Group_5__0 )? )
            {
            // InternalVideoMontage.g:3583:1: ( ( rule__AudioClip__Group_5__0 )? )
            // InternalVideoMontage.g:3584:2: ( rule__AudioClip__Group_5__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_5()); 
            // InternalVideoMontage.g:3585:2: ( rule__AudioClip__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVideoMontage.g:3585:3: rule__AudioClip__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioClip__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioClipAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3593:1: rule__AudioClip__Group__6 : rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7 ;
    public final void rule__AudioClip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3597:1: ( rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7 )
            // InternalVideoMontage.g:3598:2: rule__AudioClip__Group__6__Impl rule__AudioClip__Group__7
            {
            pushFollow(FOLLOW_32);
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
    // InternalVideoMontage.g:3605:1: rule__AudioClip__Group__6__Impl : ( ( rule__AudioClip__Group_6__0 )? ) ;
    public final void rule__AudioClip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3609:1: ( ( ( rule__AudioClip__Group_6__0 )? ) )
            // InternalVideoMontage.g:3610:1: ( ( rule__AudioClip__Group_6__0 )? )
            {
            // InternalVideoMontage.g:3610:1: ( ( rule__AudioClip__Group_6__0 )? )
            // InternalVideoMontage.g:3611:2: ( rule__AudioClip__Group_6__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_6()); 
            // InternalVideoMontage.g:3612:2: ( rule__AudioClip__Group_6__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVideoMontage.g:3612:3: rule__AudioClip__Group_6__0
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
    // InternalVideoMontage.g:3620:1: rule__AudioClip__Group__7 : rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8 ;
    public final void rule__AudioClip__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3624:1: ( rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8 )
            // InternalVideoMontage.g:3625:2: rule__AudioClip__Group__7__Impl rule__AudioClip__Group__8
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:3632:1: rule__AudioClip__Group__7__Impl : ( 'relativemoment' ) ;
    public final void rule__AudioClip__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3636:1: ( ( 'relativemoment' ) )
            // InternalVideoMontage.g:3637:1: ( 'relativemoment' )
            {
            // InternalVideoMontage.g:3637:1: ( 'relativemoment' )
            // InternalVideoMontage.g:3638:2: 'relativemoment'
            {
             before(grammarAccess.getAudioClipAccess().getRelativemomentKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getRelativemomentKeyword_7()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3647:1: rule__AudioClip__Group__8 : rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9 ;
    public final void rule__AudioClip__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3651:1: ( rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9 )
            // InternalVideoMontage.g:3652:2: rule__AudioClip__Group__8__Impl rule__AudioClip__Group__9
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoMontage.g:3659:1: rule__AudioClip__Group__8__Impl : ( '{' ) ;
    public final void rule__AudioClip__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3663:1: ( ( '{' ) )
            // InternalVideoMontage.g:3664:1: ( '{' )
            {
            // InternalVideoMontage.g:3664:1: ( '{' )
            // InternalVideoMontage.g:3665:2: '{'
            {
             before(grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3674:1: rule__AudioClip__Group__9 : rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10 ;
    public final void rule__AudioClip__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3678:1: ( rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10 )
            // InternalVideoMontage.g:3679:2: rule__AudioClip__Group__9__Impl rule__AudioClip__Group__10
            {
            pushFollow(FOLLOW_6);
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
    // InternalVideoMontage.g:3686:1: rule__AudioClip__Group__9__Impl : ( ( rule__AudioClip__RelativemomentAssignment_9 ) ) ;
    public final void rule__AudioClip__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3690:1: ( ( ( rule__AudioClip__RelativemomentAssignment_9 ) ) )
            // InternalVideoMontage.g:3691:1: ( ( rule__AudioClip__RelativemomentAssignment_9 ) )
            {
            // InternalVideoMontage.g:3691:1: ( ( rule__AudioClip__RelativemomentAssignment_9 ) )
            // InternalVideoMontage.g:3692:2: ( rule__AudioClip__RelativemomentAssignment_9 )
            {
             before(grammarAccess.getAudioClipAccess().getRelativemomentAssignment_9()); 
            // InternalVideoMontage.g:3693:2: ( rule__AudioClip__RelativemomentAssignment_9 )
            // InternalVideoMontage.g:3693:3: rule__AudioClip__RelativemomentAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__RelativemomentAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getRelativemomentAssignment_9()); 

            }


            }

        }
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
    // InternalVideoMontage.g:3701:1: rule__AudioClip__Group__10 : rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11 ;
    public final void rule__AudioClip__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3705:1: ( rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11 )
            // InternalVideoMontage.g:3706:2: rule__AudioClip__Group__10__Impl rule__AudioClip__Group__11
            {
            pushFollow(FOLLOW_6);
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
    // InternalVideoMontage.g:3713:1: rule__AudioClip__Group__10__Impl : ( ( rule__AudioClip__Group_10__0 )* ) ;
    public final void rule__AudioClip__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3717:1: ( ( ( rule__AudioClip__Group_10__0 )* ) )
            // InternalVideoMontage.g:3718:1: ( ( rule__AudioClip__Group_10__0 )* )
            {
            // InternalVideoMontage.g:3718:1: ( ( rule__AudioClip__Group_10__0 )* )
            // InternalVideoMontage.g:3719:2: ( rule__AudioClip__Group_10__0 )*
            {
             before(grammarAccess.getAudioClipAccess().getGroup_10()); 
            // InternalVideoMontage.g:3720:2: ( rule__AudioClip__Group_10__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==23) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalVideoMontage.g:3720:3: rule__AudioClip__Group_10__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AudioClip__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

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
    // InternalVideoMontage.g:3728:1: rule__AudioClip__Group__11 : rule__AudioClip__Group__11__Impl rule__AudioClip__Group__12 ;
    public final void rule__AudioClip__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3732:1: ( rule__AudioClip__Group__11__Impl rule__AudioClip__Group__12 )
            // InternalVideoMontage.g:3733:2: rule__AudioClip__Group__11__Impl rule__AudioClip__Group__12
            {
            pushFollow(FOLLOW_29);
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
    // InternalVideoMontage.g:3740:1: rule__AudioClip__Group__11__Impl : ( '}' ) ;
    public final void rule__AudioClip__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3744:1: ( ( '}' ) )
            // InternalVideoMontage.g:3745:1: ( '}' )
            {
            // InternalVideoMontage.g:3745:1: ( '}' )
            // InternalVideoMontage.g:3746:2: '}'
            {
             before(grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__AudioClip__Group__12"
    // InternalVideoMontage.g:3755:1: rule__AudioClip__Group__12 : rule__AudioClip__Group__12__Impl rule__AudioClip__Group__13 ;
    public final void rule__AudioClip__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3759:1: ( rule__AudioClip__Group__12__Impl rule__AudioClip__Group__13 )
            // InternalVideoMontage.g:3760:2: rule__AudioClip__Group__12__Impl rule__AudioClip__Group__13
            {
            pushFollow(FOLLOW_29);
            rule__AudioClip__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__13();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:3767:1: rule__AudioClip__Group__12__Impl : ( ( rule__AudioClip__Group_12__0 )? ) ;
    public final void rule__AudioClip__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3771:1: ( ( ( rule__AudioClip__Group_12__0 )? ) )
            // InternalVideoMontage.g:3772:1: ( ( rule__AudioClip__Group_12__0 )? )
            {
            // InternalVideoMontage.g:3772:1: ( ( rule__AudioClip__Group_12__0 )? )
            // InternalVideoMontage.g:3773:2: ( rule__AudioClip__Group_12__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_12()); 
            // InternalVideoMontage.g:3774:2: ( rule__AudioClip__Group_12__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVideoMontage.g:3774:3: rule__AudioClip__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioClip__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioClipAccess().getGroup_12()); 

            }


            }

        }
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


    // $ANTLR start "rule__AudioClip__Group__13"
    // InternalVideoMontage.g:3782:1: rule__AudioClip__Group__13 : rule__AudioClip__Group__13__Impl rule__AudioClip__Group__14 ;
    public final void rule__AudioClip__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3786:1: ( rule__AudioClip__Group__13__Impl rule__AudioClip__Group__14 )
            // InternalVideoMontage.g:3787:2: rule__AudioClip__Group__13__Impl rule__AudioClip__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__AudioClip__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__13"


    // $ANTLR start "rule__AudioClip__Group__13__Impl"
    // InternalVideoMontage.g:3794:1: rule__AudioClip__Group__13__Impl : ( 'startingmoment' ) ;
    public final void rule__AudioClip__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3798:1: ( ( 'startingmoment' ) )
            // InternalVideoMontage.g:3799:1: ( 'startingmoment' )
            {
            // InternalVideoMontage.g:3799:1: ( 'startingmoment' )
            // InternalVideoMontage.g:3800:2: 'startingmoment'
            {
             before(grammarAccess.getAudioClipAccess().getStartingmomentKeyword_13()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getStartingmomentKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__13__Impl"


    // $ANTLR start "rule__AudioClip__Group__14"
    // InternalVideoMontage.g:3809:1: rule__AudioClip__Group__14 : rule__AudioClip__Group__14__Impl rule__AudioClip__Group__15 ;
    public final void rule__AudioClip__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3813:1: ( rule__AudioClip__Group__14__Impl rule__AudioClip__Group__15 )
            // InternalVideoMontage.g:3814:2: rule__AudioClip__Group__14__Impl rule__AudioClip__Group__15
            {
            pushFollow(FOLLOW_33);
            rule__AudioClip__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__14"


    // $ANTLR start "rule__AudioClip__Group__14__Impl"
    // InternalVideoMontage.g:3821:1: rule__AudioClip__Group__14__Impl : ( ( rule__AudioClip__StartingmomentAssignment_14 ) ) ;
    public final void rule__AudioClip__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3825:1: ( ( ( rule__AudioClip__StartingmomentAssignment_14 ) ) )
            // InternalVideoMontage.g:3826:1: ( ( rule__AudioClip__StartingmomentAssignment_14 ) )
            {
            // InternalVideoMontage.g:3826:1: ( ( rule__AudioClip__StartingmomentAssignment_14 ) )
            // InternalVideoMontage.g:3827:2: ( rule__AudioClip__StartingmomentAssignment_14 )
            {
             before(grammarAccess.getAudioClipAccess().getStartingmomentAssignment_14()); 
            // InternalVideoMontage.g:3828:2: ( rule__AudioClip__StartingmomentAssignment_14 )
            // InternalVideoMontage.g:3828:3: rule__AudioClip__StartingmomentAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__StartingmomentAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getStartingmomentAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__14__Impl"


    // $ANTLR start "rule__AudioClip__Group__15"
    // InternalVideoMontage.g:3836:1: rule__AudioClip__Group__15 : rule__AudioClip__Group__15__Impl rule__AudioClip__Group__16 ;
    public final void rule__AudioClip__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3840:1: ( rule__AudioClip__Group__15__Impl rule__AudioClip__Group__16 )
            // InternalVideoMontage.g:3841:2: rule__AudioClip__Group__15__Impl rule__AudioClip__Group__16
            {
            pushFollow(FOLLOW_33);
            rule__AudioClip__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__15"


    // $ANTLR start "rule__AudioClip__Group__15__Impl"
    // InternalVideoMontage.g:3848:1: rule__AudioClip__Group__15__Impl : ( ( rule__AudioClip__Group_15__0 )? ) ;
    public final void rule__AudioClip__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3852:1: ( ( ( rule__AudioClip__Group_15__0 )? ) )
            // InternalVideoMontage.g:3853:1: ( ( rule__AudioClip__Group_15__0 )? )
            {
            // InternalVideoMontage.g:3853:1: ( ( rule__AudioClip__Group_15__0 )? )
            // InternalVideoMontage.g:3854:2: ( rule__AudioClip__Group_15__0 )?
            {
             before(grammarAccess.getAudioClipAccess().getGroup_15()); 
            // InternalVideoMontage.g:3855:2: ( rule__AudioClip__Group_15__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVideoMontage.g:3855:3: rule__AudioClip__Group_15__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AudioClip__Group_15__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAudioClipAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__15__Impl"


    // $ANTLR start "rule__AudioClip__Group__16"
    // InternalVideoMontage.g:3863:1: rule__AudioClip__Group__16 : rule__AudioClip__Group__16__Impl ;
    public final void rule__AudioClip__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3867:1: ( rule__AudioClip__Group__16__Impl )
            // InternalVideoMontage.g:3868:2: rule__AudioClip__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__16"


    // $ANTLR start "rule__AudioClip__Group__16__Impl"
    // InternalVideoMontage.g:3874:1: rule__AudioClip__Group__16__Impl : ( '}' ) ;
    public final void rule__AudioClip__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3878:1: ( ( '}' ) )
            // InternalVideoMontage.g:3879:1: ( '}' )
            {
            // InternalVideoMontage.g:3879:1: ( '}' )
            // InternalVideoMontage.g:3880:2: '}'
            {
             before(grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_16()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group__16__Impl"


    // $ANTLR start "rule__AudioClip__Group_3__0"
    // InternalVideoMontage.g:3890:1: rule__AudioClip__Group_3__0 : rule__AudioClip__Group_3__0__Impl rule__AudioClip__Group_3__1 ;
    public final void rule__AudioClip__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3894:1: ( rule__AudioClip__Group_3__0__Impl rule__AudioClip__Group_3__1 )
            // InternalVideoMontage.g:3895:2: rule__AudioClip__Group_3__0__Impl rule__AudioClip__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__AudioClip__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_3__0"


    // $ANTLR start "rule__AudioClip__Group_3__0__Impl"
    // InternalVideoMontage.g:3902:1: rule__AudioClip__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__AudioClip__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3906:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:3907:1: ( 'duration' )
            {
            // InternalVideoMontage.g:3907:1: ( 'duration' )
            // InternalVideoMontage.g:3908:2: 'duration'
            {
             before(grammarAccess.getAudioClipAccess().getDurationKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getDurationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_3__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_3__1"
    // InternalVideoMontage.g:3917:1: rule__AudioClip__Group_3__1 : rule__AudioClip__Group_3__1__Impl ;
    public final void rule__AudioClip__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3921:1: ( rule__AudioClip__Group_3__1__Impl )
            // InternalVideoMontage.g:3922:2: rule__AudioClip__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_3__1"


    // $ANTLR start "rule__AudioClip__Group_3__1__Impl"
    // InternalVideoMontage.g:3928:1: rule__AudioClip__Group_3__1__Impl : ( ( rule__AudioClip__DurationAssignment_3_1 ) ) ;
    public final void rule__AudioClip__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3932:1: ( ( ( rule__AudioClip__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:3933:1: ( ( rule__AudioClip__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:3933:1: ( ( rule__AudioClip__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:3934:2: ( rule__AudioClip__DurationAssignment_3_1 )
            {
             before(grammarAccess.getAudioClipAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:3935:2: ( rule__AudioClip__DurationAssignment_3_1 )
            // InternalVideoMontage.g:3935:3: rule__AudioClip__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getDurationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_3__1__Impl"


    // $ANTLR start "rule__AudioClip__Group_4__0"
    // InternalVideoMontage.g:3944:1: rule__AudioClip__Group_4__0 : rule__AudioClip__Group_4__0__Impl rule__AudioClip__Group_4__1 ;
    public final void rule__AudioClip__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3948:1: ( rule__AudioClip__Group_4__0__Impl rule__AudioClip__Group_4__1 )
            // InternalVideoMontage.g:3949:2: rule__AudioClip__Group_4__0__Impl rule__AudioClip__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__AudioClip__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_4__0"


    // $ANTLR start "rule__AudioClip__Group_4__0__Impl"
    // InternalVideoMontage.g:3956:1: rule__AudioClip__Group_4__0__Impl : ( 'volume' ) ;
    public final void rule__AudioClip__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3960:1: ( ( 'volume' ) )
            // InternalVideoMontage.g:3961:1: ( 'volume' )
            {
            // InternalVideoMontage.g:3961:1: ( 'volume' )
            // InternalVideoMontage.g:3962:2: 'volume'
            {
             before(grammarAccess.getAudioClipAccess().getVolumeKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getVolumeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_4__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_4__1"
    // InternalVideoMontage.g:3971:1: rule__AudioClip__Group_4__1 : rule__AudioClip__Group_4__1__Impl ;
    public final void rule__AudioClip__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3975:1: ( rule__AudioClip__Group_4__1__Impl )
            // InternalVideoMontage.g:3976:2: rule__AudioClip__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_4__1"


    // $ANTLR start "rule__AudioClip__Group_4__1__Impl"
    // InternalVideoMontage.g:3982:1: rule__AudioClip__Group_4__1__Impl : ( ( rule__AudioClip__VolumeAssignment_4_1 ) ) ;
    public final void rule__AudioClip__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:3986:1: ( ( ( rule__AudioClip__VolumeAssignment_4_1 ) ) )
            // InternalVideoMontage.g:3987:1: ( ( rule__AudioClip__VolumeAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:3987:1: ( ( rule__AudioClip__VolumeAssignment_4_1 ) )
            // InternalVideoMontage.g:3988:2: ( rule__AudioClip__VolumeAssignment_4_1 )
            {
             before(grammarAccess.getAudioClipAccess().getVolumeAssignment_4_1()); 
            // InternalVideoMontage.g:3989:2: ( rule__AudioClip__VolumeAssignment_4_1 )
            // InternalVideoMontage.g:3989:3: rule__AudioClip__VolumeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__VolumeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getVolumeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_4__1__Impl"


    // $ANTLR start "rule__AudioClip__Group_5__0"
    // InternalVideoMontage.g:3998:1: rule__AudioClip__Group_5__0 : rule__AudioClip__Group_5__0__Impl rule__AudioClip__Group_5__1 ;
    public final void rule__AudioClip__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4002:1: ( rule__AudioClip__Group_5__0__Impl rule__AudioClip__Group_5__1 )
            // InternalVideoMontage.g:4003:2: rule__AudioClip__Group_5__0__Impl rule__AudioClip__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__AudioClip__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_5__0"


    // $ANTLR start "rule__AudioClip__Group_5__0__Impl"
    // InternalVideoMontage.g:4010:1: rule__AudioClip__Group_5__0__Impl : ( 'startCut' ) ;
    public final void rule__AudioClip__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4014:1: ( ( 'startCut' ) )
            // InternalVideoMontage.g:4015:1: ( 'startCut' )
            {
            // InternalVideoMontage.g:4015:1: ( 'startCut' )
            // InternalVideoMontage.g:4016:2: 'startCut'
            {
             before(grammarAccess.getAudioClipAccess().getStartCutKeyword_5_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getStartCutKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_5__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_5__1"
    // InternalVideoMontage.g:4025:1: rule__AudioClip__Group_5__1 : rule__AudioClip__Group_5__1__Impl ;
    public final void rule__AudioClip__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4029:1: ( rule__AudioClip__Group_5__1__Impl )
            // InternalVideoMontage.g:4030:2: rule__AudioClip__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_5__1"


    // $ANTLR start "rule__AudioClip__Group_5__1__Impl"
    // InternalVideoMontage.g:4036:1: rule__AudioClip__Group_5__1__Impl : ( ( rule__AudioClip__StartCutAssignment_5_1 ) ) ;
    public final void rule__AudioClip__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4040:1: ( ( ( rule__AudioClip__StartCutAssignment_5_1 ) ) )
            // InternalVideoMontage.g:4041:1: ( ( rule__AudioClip__StartCutAssignment_5_1 ) )
            {
            // InternalVideoMontage.g:4041:1: ( ( rule__AudioClip__StartCutAssignment_5_1 ) )
            // InternalVideoMontage.g:4042:2: ( rule__AudioClip__StartCutAssignment_5_1 )
            {
             before(grammarAccess.getAudioClipAccess().getStartCutAssignment_5_1()); 
            // InternalVideoMontage.g:4043:2: ( rule__AudioClip__StartCutAssignment_5_1 )
            // InternalVideoMontage.g:4043:3: rule__AudioClip__StartCutAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__StartCutAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getStartCutAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_5__1__Impl"


    // $ANTLR start "rule__AudioClip__Group_6__0"
    // InternalVideoMontage.g:4052:1: rule__AudioClip__Group_6__0 : rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1 ;
    public final void rule__AudioClip__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4056:1: ( rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1 )
            // InternalVideoMontage.g:4057:2: rule__AudioClip__Group_6__0__Impl rule__AudioClip__Group_6__1
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
    // InternalVideoMontage.g:4064:1: rule__AudioClip__Group_6__0__Impl : ( 'endCut' ) ;
    public final void rule__AudioClip__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4068:1: ( ( 'endCut' ) )
            // InternalVideoMontage.g:4069:1: ( 'endCut' )
            {
            // InternalVideoMontage.g:4069:1: ( 'endCut' )
            // InternalVideoMontage.g:4070:2: 'endCut'
            {
             before(grammarAccess.getAudioClipAccess().getEndCutKeyword_6_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getEndCutKeyword_6_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:4079:1: rule__AudioClip__Group_6__1 : rule__AudioClip__Group_6__1__Impl ;
    public final void rule__AudioClip__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4083:1: ( rule__AudioClip__Group_6__1__Impl )
            // InternalVideoMontage.g:4084:2: rule__AudioClip__Group_6__1__Impl
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
    // InternalVideoMontage.g:4090:1: rule__AudioClip__Group_6__1__Impl : ( ( rule__AudioClip__EndCutAssignment_6_1 ) ) ;
    public final void rule__AudioClip__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4094:1: ( ( ( rule__AudioClip__EndCutAssignment_6_1 ) ) )
            // InternalVideoMontage.g:4095:1: ( ( rule__AudioClip__EndCutAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:4095:1: ( ( rule__AudioClip__EndCutAssignment_6_1 ) )
            // InternalVideoMontage.g:4096:2: ( rule__AudioClip__EndCutAssignment_6_1 )
            {
             before(grammarAccess.getAudioClipAccess().getEndCutAssignment_6_1()); 
            // InternalVideoMontage.g:4097:2: ( rule__AudioClip__EndCutAssignment_6_1 )
            // InternalVideoMontage.g:4097:3: rule__AudioClip__EndCutAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__EndCutAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getEndCutAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AudioClip__Group_10__0"
    // InternalVideoMontage.g:4106:1: rule__AudioClip__Group_10__0 : rule__AudioClip__Group_10__0__Impl rule__AudioClip__Group_10__1 ;
    public final void rule__AudioClip__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4110:1: ( rule__AudioClip__Group_10__0__Impl rule__AudioClip__Group_10__1 )
            // InternalVideoMontage.g:4111:2: rule__AudioClip__Group_10__0__Impl rule__AudioClip__Group_10__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoMontage.g:4118:1: rule__AudioClip__Group_10__0__Impl : ( ',' ) ;
    public final void rule__AudioClip__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4122:1: ( ( ',' ) )
            // InternalVideoMontage.g:4123:1: ( ',' )
            {
            // InternalVideoMontage.g:4123:1: ( ',' )
            // InternalVideoMontage.g:4124:2: ','
            {
             before(grammarAccess.getAudioClipAccess().getCommaKeyword_10_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getCommaKeyword_10_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:4133:1: rule__AudioClip__Group_10__1 : rule__AudioClip__Group_10__1__Impl ;
    public final void rule__AudioClip__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4137:1: ( rule__AudioClip__Group_10__1__Impl )
            // InternalVideoMontage.g:4138:2: rule__AudioClip__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_10__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:4144:1: rule__AudioClip__Group_10__1__Impl : ( ( rule__AudioClip__RelativemomentAssignment_10_1 ) ) ;
    public final void rule__AudioClip__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4148:1: ( ( ( rule__AudioClip__RelativemomentAssignment_10_1 ) ) )
            // InternalVideoMontage.g:4149:1: ( ( rule__AudioClip__RelativemomentAssignment_10_1 ) )
            {
            // InternalVideoMontage.g:4149:1: ( ( rule__AudioClip__RelativemomentAssignment_10_1 ) )
            // InternalVideoMontage.g:4150:2: ( rule__AudioClip__RelativemomentAssignment_10_1 )
            {
             before(grammarAccess.getAudioClipAccess().getRelativemomentAssignment_10_1()); 
            // InternalVideoMontage.g:4151:2: ( rule__AudioClip__RelativemomentAssignment_10_1 )
            // InternalVideoMontage.g:4151:3: rule__AudioClip__RelativemomentAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__RelativemomentAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getRelativemomentAssignment_10_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AudioClip__Group_12__0"
    // InternalVideoMontage.g:4160:1: rule__AudioClip__Group_12__0 : rule__AudioClip__Group_12__0__Impl rule__AudioClip__Group_12__1 ;
    public final void rule__AudioClip__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4164:1: ( rule__AudioClip__Group_12__0__Impl rule__AudioClip__Group_12__1 )
            // InternalVideoMontage.g:4165:2: rule__AudioClip__Group_12__0__Impl rule__AudioClip__Group_12__1
            {
            pushFollow(FOLLOW_31);
            rule__AudioClip__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_12__0"


    // $ANTLR start "rule__AudioClip__Group_12__0__Impl"
    // InternalVideoMontage.g:4172:1: rule__AudioClip__Group_12__0__Impl : ( 'transition' ) ;
    public final void rule__AudioClip__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4176:1: ( ( 'transition' ) )
            // InternalVideoMontage.g:4177:1: ( 'transition' )
            {
            // InternalVideoMontage.g:4177:1: ( 'transition' )
            // InternalVideoMontage.g:4178:2: 'transition'
            {
             before(grammarAccess.getAudioClipAccess().getTransitionKeyword_12_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getTransitionKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_12__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_12__1"
    // InternalVideoMontage.g:4187:1: rule__AudioClip__Group_12__1 : rule__AudioClip__Group_12__1__Impl ;
    public final void rule__AudioClip__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4191:1: ( rule__AudioClip__Group_12__1__Impl )
            // InternalVideoMontage.g:4192:2: rule__AudioClip__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_12__1"


    // $ANTLR start "rule__AudioClip__Group_12__1__Impl"
    // InternalVideoMontage.g:4198:1: rule__AudioClip__Group_12__1__Impl : ( ( rule__AudioClip__TransitionAssignment_12_1 ) ) ;
    public final void rule__AudioClip__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4202:1: ( ( ( rule__AudioClip__TransitionAssignment_12_1 ) ) )
            // InternalVideoMontage.g:4203:1: ( ( rule__AudioClip__TransitionAssignment_12_1 ) )
            {
            // InternalVideoMontage.g:4203:1: ( ( rule__AudioClip__TransitionAssignment_12_1 ) )
            // InternalVideoMontage.g:4204:2: ( rule__AudioClip__TransitionAssignment_12_1 )
            {
             before(grammarAccess.getAudioClipAccess().getTransitionAssignment_12_1()); 
            // InternalVideoMontage.g:4205:2: ( rule__AudioClip__TransitionAssignment_12_1 )
            // InternalVideoMontage.g:4205:3: rule__AudioClip__TransitionAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__TransitionAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getTransitionAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_12__1__Impl"


    // $ANTLR start "rule__AudioClip__Group_15__0"
    // InternalVideoMontage.g:4214:1: rule__AudioClip__Group_15__0 : rule__AudioClip__Group_15__0__Impl rule__AudioClip__Group_15__1 ;
    public final void rule__AudioClip__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4218:1: ( rule__AudioClip__Group_15__0__Impl rule__AudioClip__Group_15__1 )
            // InternalVideoMontage.g:4219:2: rule__AudioClip__Group_15__0__Impl rule__AudioClip__Group_15__1
            {
            pushFollow(FOLLOW_3);
            rule__AudioClip__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15__0"


    // $ANTLR start "rule__AudioClip__Group_15__0__Impl"
    // InternalVideoMontage.g:4226:1: rule__AudioClip__Group_15__0__Impl : ( 'audio' ) ;
    public final void rule__AudioClip__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4230:1: ( ( 'audio' ) )
            // InternalVideoMontage.g:4231:1: ( 'audio' )
            {
            // InternalVideoMontage.g:4231:1: ( 'audio' )
            // InternalVideoMontage.g:4232:2: 'audio'
            {
             before(grammarAccess.getAudioClipAccess().getAudioKeyword_15_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getAudioKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_15__1"
    // InternalVideoMontage.g:4241:1: rule__AudioClip__Group_15__1 : rule__AudioClip__Group_15__1__Impl rule__AudioClip__Group_15__2 ;
    public final void rule__AudioClip__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4245:1: ( rule__AudioClip__Group_15__1__Impl rule__AudioClip__Group_15__2 )
            // InternalVideoMontage.g:4246:2: rule__AudioClip__Group_15__1__Impl rule__AudioClip__Group_15__2
            {
            pushFollow(FOLLOW_34);
            rule__AudioClip__Group_15__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_15__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15__1"


    // $ANTLR start "rule__AudioClip__Group_15__1__Impl"
    // InternalVideoMontage.g:4253:1: rule__AudioClip__Group_15__1__Impl : ( '{' ) ;
    public final void rule__AudioClip__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4257:1: ( ( '{' ) )
            // InternalVideoMontage.g:4258:1: ( '{' )
            {
            // InternalVideoMontage.g:4258:1: ( '{' )
            // InternalVideoMontage.g:4259:2: '{'
            {
             before(grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_15_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15__1__Impl"


    // $ANTLR start "rule__AudioClip__Group_15__2"
    // InternalVideoMontage.g:4268:1: rule__AudioClip__Group_15__2 : rule__AudioClip__Group_15__2__Impl rule__AudioClip__Group_15__3 ;
    public final void rule__AudioClip__Group_15__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4272:1: ( rule__AudioClip__Group_15__2__Impl rule__AudioClip__Group_15__3 )
            // InternalVideoMontage.g:4273:2: rule__AudioClip__Group_15__2__Impl rule__AudioClip__Group_15__3
            {
            pushFollow(FOLLOW_6);
            rule__AudioClip__Group_15__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_15__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15__2"


    // $ANTLR start "rule__AudioClip__Group_15__2__Impl"
    // InternalVideoMontage.g:4280:1: rule__AudioClip__Group_15__2__Impl : ( ( rule__AudioClip__AudioAssignment_15_2 ) ) ;
    public final void rule__AudioClip__Group_15__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4284:1: ( ( ( rule__AudioClip__AudioAssignment_15_2 ) ) )
            // InternalVideoMontage.g:4285:1: ( ( rule__AudioClip__AudioAssignment_15_2 ) )
            {
            // InternalVideoMontage.g:4285:1: ( ( rule__AudioClip__AudioAssignment_15_2 ) )
            // InternalVideoMontage.g:4286:2: ( rule__AudioClip__AudioAssignment_15_2 )
            {
             before(grammarAccess.getAudioClipAccess().getAudioAssignment_15_2()); 
            // InternalVideoMontage.g:4287:2: ( rule__AudioClip__AudioAssignment_15_2 )
            // InternalVideoMontage.g:4287:3: rule__AudioClip__AudioAssignment_15_2
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__AudioAssignment_15_2();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getAudioAssignment_15_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15__2__Impl"


    // $ANTLR start "rule__AudioClip__Group_15__3"
    // InternalVideoMontage.g:4295:1: rule__AudioClip__Group_15__3 : rule__AudioClip__Group_15__3__Impl rule__AudioClip__Group_15__4 ;
    public final void rule__AudioClip__Group_15__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4299:1: ( rule__AudioClip__Group_15__3__Impl rule__AudioClip__Group_15__4 )
            // InternalVideoMontage.g:4300:2: rule__AudioClip__Group_15__3__Impl rule__AudioClip__Group_15__4
            {
            pushFollow(FOLLOW_6);
            rule__AudioClip__Group_15__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_15__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15__3"


    // $ANTLR start "rule__AudioClip__Group_15__3__Impl"
    // InternalVideoMontage.g:4307:1: rule__AudioClip__Group_15__3__Impl : ( ( rule__AudioClip__Group_15_3__0 )* ) ;
    public final void rule__AudioClip__Group_15__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4311:1: ( ( ( rule__AudioClip__Group_15_3__0 )* ) )
            // InternalVideoMontage.g:4312:1: ( ( rule__AudioClip__Group_15_3__0 )* )
            {
            // InternalVideoMontage.g:4312:1: ( ( rule__AudioClip__Group_15_3__0 )* )
            // InternalVideoMontage.g:4313:2: ( rule__AudioClip__Group_15_3__0 )*
            {
             before(grammarAccess.getAudioClipAccess().getGroup_15_3()); 
            // InternalVideoMontage.g:4314:2: ( rule__AudioClip__Group_15_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==23) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalVideoMontage.g:4314:3: rule__AudioClip__Group_15_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AudioClip__Group_15_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getAudioClipAccess().getGroup_15_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15__3__Impl"


    // $ANTLR start "rule__AudioClip__Group_15__4"
    // InternalVideoMontage.g:4322:1: rule__AudioClip__Group_15__4 : rule__AudioClip__Group_15__4__Impl ;
    public final void rule__AudioClip__Group_15__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4326:1: ( rule__AudioClip__Group_15__4__Impl )
            // InternalVideoMontage.g:4327:2: rule__AudioClip__Group_15__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_15__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15__4"


    // $ANTLR start "rule__AudioClip__Group_15__4__Impl"
    // InternalVideoMontage.g:4333:1: rule__AudioClip__Group_15__4__Impl : ( '}' ) ;
    public final void rule__AudioClip__Group_15__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4337:1: ( ( '}' ) )
            // InternalVideoMontage.g:4338:1: ( '}' )
            {
            // InternalVideoMontage.g:4338:1: ( '}' )
            // InternalVideoMontage.g:4339:2: '}'
            {
             before(grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_15_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_15_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15__4__Impl"


    // $ANTLR start "rule__AudioClip__Group_15_3__0"
    // InternalVideoMontage.g:4349:1: rule__AudioClip__Group_15_3__0 : rule__AudioClip__Group_15_3__0__Impl rule__AudioClip__Group_15_3__1 ;
    public final void rule__AudioClip__Group_15_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4353:1: ( rule__AudioClip__Group_15_3__0__Impl rule__AudioClip__Group_15_3__1 )
            // InternalVideoMontage.g:4354:2: rule__AudioClip__Group_15_3__0__Impl rule__AudioClip__Group_15_3__1
            {
            pushFollow(FOLLOW_34);
            rule__AudioClip__Group_15_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_15_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15_3__0"


    // $ANTLR start "rule__AudioClip__Group_15_3__0__Impl"
    // InternalVideoMontage.g:4361:1: rule__AudioClip__Group_15_3__0__Impl : ( ',' ) ;
    public final void rule__AudioClip__Group_15_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4365:1: ( ( ',' ) )
            // InternalVideoMontage.g:4366:1: ( ',' )
            {
            // InternalVideoMontage.g:4366:1: ( ',' )
            // InternalVideoMontage.g:4367:2: ','
            {
             before(grammarAccess.getAudioClipAccess().getCommaKeyword_15_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAudioClipAccess().getCommaKeyword_15_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15_3__0__Impl"


    // $ANTLR start "rule__AudioClip__Group_15_3__1"
    // InternalVideoMontage.g:4376:1: rule__AudioClip__Group_15_3__1 : rule__AudioClip__Group_15_3__1__Impl ;
    public final void rule__AudioClip__Group_15_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4380:1: ( rule__AudioClip__Group_15_3__1__Impl )
            // InternalVideoMontage.g:4381:2: rule__AudioClip__Group_15_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__Group_15_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15_3__1"


    // $ANTLR start "rule__AudioClip__Group_15_3__1__Impl"
    // InternalVideoMontage.g:4387:1: rule__AudioClip__Group_15_3__1__Impl : ( ( rule__AudioClip__AudioAssignment_15_3_1 ) ) ;
    public final void rule__AudioClip__Group_15_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4391:1: ( ( ( rule__AudioClip__AudioAssignment_15_3_1 ) ) )
            // InternalVideoMontage.g:4392:1: ( ( rule__AudioClip__AudioAssignment_15_3_1 ) )
            {
            // InternalVideoMontage.g:4392:1: ( ( rule__AudioClip__AudioAssignment_15_3_1 ) )
            // InternalVideoMontage.g:4393:2: ( rule__AudioClip__AudioAssignment_15_3_1 )
            {
             before(grammarAccess.getAudioClipAccess().getAudioAssignment_15_3_1()); 
            // InternalVideoMontage.g:4394:2: ( rule__AudioClip__AudioAssignment_15_3_1 )
            // InternalVideoMontage.g:4394:3: rule__AudioClip__AudioAssignment_15_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AudioClip__AudioAssignment_15_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioClipAccess().getAudioAssignment_15_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__Group_15_3__1__Impl"


    // $ANTLR start "rule__AbsoluteMoment__Group__0"
    // InternalVideoMontage.g:4403:1: rule__AbsoluteMoment__Group__0 : rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1 ;
    public final void rule__AbsoluteMoment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4407:1: ( rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1 )
            // InternalVideoMontage.g:4408:2: rule__AbsoluteMoment__Group__0__Impl rule__AbsoluteMoment__Group__1
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
    // InternalVideoMontage.g:4415:1: rule__AbsoluteMoment__Group__0__Impl : ( () ) ;
    public final void rule__AbsoluteMoment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4419:1: ( ( () ) )
            // InternalVideoMontage.g:4420:1: ( () )
            {
            // InternalVideoMontage.g:4420:1: ( () )
            // InternalVideoMontage.g:4421:2: ()
            {
             before(grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentAction_0()); 
            // InternalVideoMontage.g:4422:2: ()
            // InternalVideoMontage.g:4422:3: 
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
    // InternalVideoMontage.g:4430:1: rule__AbsoluteMoment__Group__1 : rule__AbsoluteMoment__Group__1__Impl rule__AbsoluteMoment__Group__2 ;
    public final void rule__AbsoluteMoment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4434:1: ( rule__AbsoluteMoment__Group__1__Impl rule__AbsoluteMoment__Group__2 )
            // InternalVideoMontage.g:4435:2: rule__AbsoluteMoment__Group__1__Impl rule__AbsoluteMoment__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__AbsoluteMoment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group__2();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:4442:1: rule__AbsoluteMoment__Group__1__Impl : ( 'AbsoluteMoment' ) ;
    public final void rule__AbsoluteMoment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4446:1: ( ( 'AbsoluteMoment' ) )
            // InternalVideoMontage.g:4447:1: ( 'AbsoluteMoment' )
            {
            // InternalVideoMontage.g:4447:1: ( 'AbsoluteMoment' )
            // InternalVideoMontage.g:4448:2: 'AbsoluteMoment'
            {
             before(grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AbsoluteMoment__Group__2"
    // InternalVideoMontage.g:4457:1: rule__AbsoluteMoment__Group__2 : rule__AbsoluteMoment__Group__2__Impl rule__AbsoluteMoment__Group__3 ;
    public final void rule__AbsoluteMoment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4461:1: ( rule__AbsoluteMoment__Group__2__Impl rule__AbsoluteMoment__Group__3 )
            // InternalVideoMontage.g:4462:2: rule__AbsoluteMoment__Group__2__Impl rule__AbsoluteMoment__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__AbsoluteMoment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group__2"


    // $ANTLR start "rule__AbsoluteMoment__Group__2__Impl"
    // InternalVideoMontage.g:4469:1: rule__AbsoluteMoment__Group__2__Impl : ( '{' ) ;
    public final void rule__AbsoluteMoment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4473:1: ( ( '{' ) )
            // InternalVideoMontage.g:4474:1: ( '{' )
            {
            // InternalVideoMontage.g:4474:1: ( '{' )
            // InternalVideoMontage.g:4475:2: '{'
            {
             before(grammarAccess.getAbsoluteMomentAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAbsoluteMomentAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group__2__Impl"


    // $ANTLR start "rule__AbsoluteMoment__Group__3"
    // InternalVideoMontage.g:4484:1: rule__AbsoluteMoment__Group__3 : rule__AbsoluteMoment__Group__3__Impl rule__AbsoluteMoment__Group__4 ;
    public final void rule__AbsoluteMoment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4488:1: ( rule__AbsoluteMoment__Group__3__Impl rule__AbsoluteMoment__Group__4 )
            // InternalVideoMontage.g:4489:2: rule__AbsoluteMoment__Group__3__Impl rule__AbsoluteMoment__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__AbsoluteMoment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group__3"


    // $ANTLR start "rule__AbsoluteMoment__Group__3__Impl"
    // InternalVideoMontage.g:4496:1: rule__AbsoluteMoment__Group__3__Impl : ( ( rule__AbsoluteMoment__Group_3__0 )? ) ;
    public final void rule__AbsoluteMoment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4500:1: ( ( ( rule__AbsoluteMoment__Group_3__0 )? ) )
            // InternalVideoMontage.g:4501:1: ( ( rule__AbsoluteMoment__Group_3__0 )? )
            {
            // InternalVideoMontage.g:4501:1: ( ( rule__AbsoluteMoment__Group_3__0 )? )
            // InternalVideoMontage.g:4502:2: ( rule__AbsoluteMoment__Group_3__0 )?
            {
             before(grammarAccess.getAbsoluteMomentAccess().getGroup_3()); 
            // InternalVideoMontage.g:4503:2: ( rule__AbsoluteMoment__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVideoMontage.g:4503:3: rule__AbsoluteMoment__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbsoluteMoment__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbsoluteMomentAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group__3__Impl"


    // $ANTLR start "rule__AbsoluteMoment__Group__4"
    // InternalVideoMontage.g:4511:1: rule__AbsoluteMoment__Group__4 : rule__AbsoluteMoment__Group__4__Impl ;
    public final void rule__AbsoluteMoment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4515:1: ( rule__AbsoluteMoment__Group__4__Impl )
            // InternalVideoMontage.g:4516:2: rule__AbsoluteMoment__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group__4"


    // $ANTLR start "rule__AbsoluteMoment__Group__4__Impl"
    // InternalVideoMontage.g:4522:1: rule__AbsoluteMoment__Group__4__Impl : ( '}' ) ;
    public final void rule__AbsoluteMoment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4526:1: ( ( '}' ) )
            // InternalVideoMontage.g:4527:1: ( '}' )
            {
            // InternalVideoMontage.g:4527:1: ( '}' )
            // InternalVideoMontage.g:4528:2: '}'
            {
             before(grammarAccess.getAbsoluteMomentAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAbsoluteMomentAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group__4__Impl"


    // $ANTLR start "rule__AbsoluteMoment__Group_3__0"
    // InternalVideoMontage.g:4538:1: rule__AbsoluteMoment__Group_3__0 : rule__AbsoluteMoment__Group_3__0__Impl rule__AbsoluteMoment__Group_3__1 ;
    public final void rule__AbsoluteMoment__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4542:1: ( rule__AbsoluteMoment__Group_3__0__Impl rule__AbsoluteMoment__Group_3__1 )
            // InternalVideoMontage.g:4543:2: rule__AbsoluteMoment__Group_3__0__Impl rule__AbsoluteMoment__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__AbsoluteMoment__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group_3__0"


    // $ANTLR start "rule__AbsoluteMoment__Group_3__0__Impl"
    // InternalVideoMontage.g:4550:1: rule__AbsoluteMoment__Group_3__0__Impl : ( 'time' ) ;
    public final void rule__AbsoluteMoment__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4554:1: ( ( 'time' ) )
            // InternalVideoMontage.g:4555:1: ( 'time' )
            {
            // InternalVideoMontage.g:4555:1: ( 'time' )
            // InternalVideoMontage.g:4556:2: 'time'
            {
             before(grammarAccess.getAbsoluteMomentAccess().getTimeKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAbsoluteMomentAccess().getTimeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group_3__0__Impl"


    // $ANTLR start "rule__AbsoluteMoment__Group_3__1"
    // InternalVideoMontage.g:4565:1: rule__AbsoluteMoment__Group_3__1 : rule__AbsoluteMoment__Group_3__1__Impl ;
    public final void rule__AbsoluteMoment__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4569:1: ( rule__AbsoluteMoment__Group_3__1__Impl )
            // InternalVideoMontage.g:4570:2: rule__AbsoluteMoment__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group_3__1"


    // $ANTLR start "rule__AbsoluteMoment__Group_3__1__Impl"
    // InternalVideoMontage.g:4576:1: rule__AbsoluteMoment__Group_3__1__Impl : ( ( rule__AbsoluteMoment__TimeAssignment_3_1 ) ) ;
    public final void rule__AbsoluteMoment__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4580:1: ( ( ( rule__AbsoluteMoment__TimeAssignment_3_1 ) ) )
            // InternalVideoMontage.g:4581:1: ( ( rule__AbsoluteMoment__TimeAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:4581:1: ( ( rule__AbsoluteMoment__TimeAssignment_3_1 ) )
            // InternalVideoMontage.g:4582:2: ( rule__AbsoluteMoment__TimeAssignment_3_1 )
            {
             before(grammarAccess.getAbsoluteMomentAccess().getTimeAssignment_3_1()); 
            // InternalVideoMontage.g:4583:2: ( rule__AbsoluteMoment__TimeAssignment_3_1 )
            // InternalVideoMontage.g:4583:3: rule__AbsoluteMoment__TimeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AbsoluteMoment__TimeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAbsoluteMomentAccess().getTimeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__Group_3__1__Impl"


    // $ANTLR start "rule__Title__Group__0"
    // InternalVideoMontage.g:4592:1: rule__Title__Group__0 : rule__Title__Group__0__Impl rule__Title__Group__1 ;
    public final void rule__Title__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4596:1: ( rule__Title__Group__0__Impl rule__Title__Group__1 )
            // InternalVideoMontage.g:4597:2: rule__Title__Group__0__Impl rule__Title__Group__1
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
    // InternalVideoMontage.g:4604:1: rule__Title__Group__0__Impl : ( 'Title' ) ;
    public final void rule__Title__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4608:1: ( ( 'Title' ) )
            // InternalVideoMontage.g:4609:1: ( 'Title' )
            {
            // InternalVideoMontage.g:4609:1: ( 'Title' )
            // InternalVideoMontage.g:4610:2: 'Title'
            {
             before(grammarAccess.getTitleAccess().getTitleKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalVideoMontage.g:4619:1: rule__Title__Group__1 : rule__Title__Group__1__Impl rule__Title__Group__2 ;
    public final void rule__Title__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4623:1: ( rule__Title__Group__1__Impl rule__Title__Group__2 )
            // InternalVideoMontage.g:4624:2: rule__Title__Group__1__Impl rule__Title__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalVideoMontage.g:4631:1: rule__Title__Group__1__Impl : ( '{' ) ;
    public final void rule__Title__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4635:1: ( ( '{' ) )
            // InternalVideoMontage.g:4636:1: ( '{' )
            {
            // InternalVideoMontage.g:4636:1: ( '{' )
            // InternalVideoMontage.g:4637:2: '{'
            {
             before(grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalVideoMontage.g:4646:1: rule__Title__Group__2 : rule__Title__Group__2__Impl rule__Title__Group__3 ;
    public final void rule__Title__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4650:1: ( rule__Title__Group__2__Impl rule__Title__Group__3 )
            // InternalVideoMontage.g:4651:2: rule__Title__Group__2__Impl rule__Title__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalVideoMontage.g:4658:1: rule__Title__Group__2__Impl : ( ( rule__Title__Group_2__0 )? ) ;
    public final void rule__Title__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4662:1: ( ( ( rule__Title__Group_2__0 )? ) )
            // InternalVideoMontage.g:4663:1: ( ( rule__Title__Group_2__0 )? )
            {
            // InternalVideoMontage.g:4663:1: ( ( rule__Title__Group_2__0 )? )
            // InternalVideoMontage.g:4664:2: ( rule__Title__Group_2__0 )?
            {
             before(grammarAccess.getTitleAccess().getGroup_2()); 
            // InternalVideoMontage.g:4665:2: ( rule__Title__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVideoMontage.g:4665:3: rule__Title__Group_2__0
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
    // InternalVideoMontage.g:4673:1: rule__Title__Group__3 : rule__Title__Group__3__Impl rule__Title__Group__4 ;
    public final void rule__Title__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4677:1: ( rule__Title__Group__3__Impl rule__Title__Group__4 )
            // InternalVideoMontage.g:4678:2: rule__Title__Group__3__Impl rule__Title__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalVideoMontage.g:4685:1: rule__Title__Group__3__Impl : ( ( rule__Title__Group_3__0 )? ) ;
    public final void rule__Title__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4689:1: ( ( ( rule__Title__Group_3__0 )? ) )
            // InternalVideoMontage.g:4690:1: ( ( rule__Title__Group_3__0 )? )
            {
            // InternalVideoMontage.g:4690:1: ( ( rule__Title__Group_3__0 )? )
            // InternalVideoMontage.g:4691:2: ( rule__Title__Group_3__0 )?
            {
             before(grammarAccess.getTitleAccess().getGroup_3()); 
            // InternalVideoMontage.g:4692:2: ( rule__Title__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVideoMontage.g:4692:3: rule__Title__Group_3__0
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
    // InternalVideoMontage.g:4700:1: rule__Title__Group__4 : rule__Title__Group__4__Impl rule__Title__Group__5 ;
    public final void rule__Title__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4704:1: ( rule__Title__Group__4__Impl rule__Title__Group__5 )
            // InternalVideoMontage.g:4705:2: rule__Title__Group__4__Impl rule__Title__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:4712:1: rule__Title__Group__4__Impl : ( 'relativemoment' ) ;
    public final void rule__Title__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4716:1: ( ( 'relativemoment' ) )
            // InternalVideoMontage.g:4717:1: ( 'relativemoment' )
            {
            // InternalVideoMontage.g:4717:1: ( 'relativemoment' )
            // InternalVideoMontage.g:4718:2: 'relativemoment'
            {
             before(grammarAccess.getTitleAccess().getRelativemomentKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getRelativemomentKeyword_4()); 

            }


            }

        }
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
    // InternalVideoMontage.g:4727:1: rule__Title__Group__5 : rule__Title__Group__5__Impl rule__Title__Group__6 ;
    public final void rule__Title__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4731:1: ( rule__Title__Group__5__Impl rule__Title__Group__6 )
            // InternalVideoMontage.g:4732:2: rule__Title__Group__5__Impl rule__Title__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalVideoMontage.g:4739:1: rule__Title__Group__5__Impl : ( '{' ) ;
    public final void rule__Title__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4743:1: ( ( '{' ) )
            // InternalVideoMontage.g:4744:1: ( '{' )
            {
            // InternalVideoMontage.g:4744:1: ( '{' )
            // InternalVideoMontage.g:4745:2: '{'
            {
             before(grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalVideoMontage.g:4754:1: rule__Title__Group__6 : rule__Title__Group__6__Impl rule__Title__Group__7 ;
    public final void rule__Title__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4758:1: ( rule__Title__Group__6__Impl rule__Title__Group__7 )
            // InternalVideoMontage.g:4759:2: rule__Title__Group__6__Impl rule__Title__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalVideoMontage.g:4766:1: rule__Title__Group__6__Impl : ( ( rule__Title__RelativemomentAssignment_6 ) ) ;
    public final void rule__Title__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4770:1: ( ( ( rule__Title__RelativemomentAssignment_6 ) ) )
            // InternalVideoMontage.g:4771:1: ( ( rule__Title__RelativemomentAssignment_6 ) )
            {
            // InternalVideoMontage.g:4771:1: ( ( rule__Title__RelativemomentAssignment_6 ) )
            // InternalVideoMontage.g:4772:2: ( rule__Title__RelativemomentAssignment_6 )
            {
             before(grammarAccess.getTitleAccess().getRelativemomentAssignment_6()); 
            // InternalVideoMontage.g:4773:2: ( rule__Title__RelativemomentAssignment_6 )
            // InternalVideoMontage.g:4773:3: rule__Title__RelativemomentAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Title__RelativemomentAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getRelativemomentAssignment_6()); 

            }


            }

        }
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
    // InternalVideoMontage.g:4781:1: rule__Title__Group__7 : rule__Title__Group__7__Impl rule__Title__Group__8 ;
    public final void rule__Title__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4785:1: ( rule__Title__Group__7__Impl rule__Title__Group__8 )
            // InternalVideoMontage.g:4786:2: rule__Title__Group__7__Impl rule__Title__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Title__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__8();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:4793:1: rule__Title__Group__7__Impl : ( ( rule__Title__Group_7__0 )* ) ;
    public final void rule__Title__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4797:1: ( ( ( rule__Title__Group_7__0 )* ) )
            // InternalVideoMontage.g:4798:1: ( ( rule__Title__Group_7__0 )* )
            {
            // InternalVideoMontage.g:4798:1: ( ( rule__Title__Group_7__0 )* )
            // InternalVideoMontage.g:4799:2: ( rule__Title__Group_7__0 )*
            {
             before(grammarAccess.getTitleAccess().getGroup_7()); 
            // InternalVideoMontage.g:4800:2: ( rule__Title__Group_7__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==23) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalVideoMontage.g:4800:3: rule__Title__Group_7__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Title__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getTitleAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Title__Group__8"
    // InternalVideoMontage.g:4808:1: rule__Title__Group__8 : rule__Title__Group__8__Impl rule__Title__Group__9 ;
    public final void rule__Title__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4812:1: ( rule__Title__Group__8__Impl rule__Title__Group__9 )
            // InternalVideoMontage.g:4813:2: rule__Title__Group__8__Impl rule__Title__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Title__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__8"


    // $ANTLR start "rule__Title__Group__8__Impl"
    // InternalVideoMontage.g:4820:1: rule__Title__Group__8__Impl : ( '}' ) ;
    public final void rule__Title__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4824:1: ( ( '}' ) )
            // InternalVideoMontage.g:4825:1: ( '}' )
            {
            // InternalVideoMontage.g:4825:1: ( '}' )
            // InternalVideoMontage.g:4826:2: '}'
            {
             before(grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__8__Impl"


    // $ANTLR start "rule__Title__Group__9"
    // InternalVideoMontage.g:4835:1: rule__Title__Group__9 : rule__Title__Group__9__Impl rule__Title__Group__10 ;
    public final void rule__Title__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4839:1: ( rule__Title__Group__9__Impl rule__Title__Group__10 )
            // InternalVideoMontage.g:4840:2: rule__Title__Group__9__Impl rule__Title__Group__10
            {
            pushFollow(FOLLOW_17);
            rule__Title__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__9"


    // $ANTLR start "rule__Title__Group__9__Impl"
    // InternalVideoMontage.g:4847:1: rule__Title__Group__9__Impl : ( 'textarea' ) ;
    public final void rule__Title__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4851:1: ( ( 'textarea' ) )
            // InternalVideoMontage.g:4852:1: ( 'textarea' )
            {
            // InternalVideoMontage.g:4852:1: ( 'textarea' )
            // InternalVideoMontage.g:4853:2: 'textarea'
            {
             before(grammarAccess.getTitleAccess().getTextareaKeyword_9()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getTextareaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__9__Impl"


    // $ANTLR start "rule__Title__Group__10"
    // InternalVideoMontage.g:4862:1: rule__Title__Group__10 : rule__Title__Group__10__Impl rule__Title__Group__11 ;
    public final void rule__Title__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4866:1: ( rule__Title__Group__10__Impl rule__Title__Group__11 )
            // InternalVideoMontage.g:4867:2: rule__Title__Group__10__Impl rule__Title__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__Title__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__10"


    // $ANTLR start "rule__Title__Group__10__Impl"
    // InternalVideoMontage.g:4874:1: rule__Title__Group__10__Impl : ( ( rule__Title__TextareaAssignment_10 ) ) ;
    public final void rule__Title__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4878:1: ( ( ( rule__Title__TextareaAssignment_10 ) ) )
            // InternalVideoMontage.g:4879:1: ( ( rule__Title__TextareaAssignment_10 ) )
            {
            // InternalVideoMontage.g:4879:1: ( ( rule__Title__TextareaAssignment_10 ) )
            // InternalVideoMontage.g:4880:2: ( rule__Title__TextareaAssignment_10 )
            {
             before(grammarAccess.getTitleAccess().getTextareaAssignment_10()); 
            // InternalVideoMontage.g:4881:2: ( rule__Title__TextareaAssignment_10 )
            // InternalVideoMontage.g:4881:3: rule__Title__TextareaAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Title__TextareaAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getTextareaAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__10__Impl"


    // $ANTLR start "rule__Title__Group__11"
    // InternalVideoMontage.g:4889:1: rule__Title__Group__11 : rule__Title__Group__11__Impl ;
    public final void rule__Title__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4893:1: ( rule__Title__Group__11__Impl )
            // InternalVideoMontage.g:4894:2: rule__Title__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__11"


    // $ANTLR start "rule__Title__Group__11__Impl"
    // InternalVideoMontage.g:4900:1: rule__Title__Group__11__Impl : ( '}' ) ;
    public final void rule__Title__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4904:1: ( ( '}' ) )
            // InternalVideoMontage.g:4905:1: ( '}' )
            {
            // InternalVideoMontage.g:4905:1: ( '}' )
            // InternalVideoMontage.g:4906:2: '}'
            {
             before(grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group__11__Impl"


    // $ANTLR start "rule__Title__Group_2__0"
    // InternalVideoMontage.g:4916:1: rule__Title__Group_2__0 : rule__Title__Group_2__0__Impl rule__Title__Group_2__1 ;
    public final void rule__Title__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4920:1: ( rule__Title__Group_2__0__Impl rule__Title__Group_2__1 )
            // InternalVideoMontage.g:4921:2: rule__Title__Group_2__0__Impl rule__Title__Group_2__1
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
    // InternalVideoMontage.g:4928:1: rule__Title__Group_2__0__Impl : ( 'duration' ) ;
    public final void rule__Title__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4932:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:4933:1: ( 'duration' )
            {
            // InternalVideoMontage.g:4933:1: ( 'duration' )
            // InternalVideoMontage.g:4934:2: 'duration'
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
    // InternalVideoMontage.g:4943:1: rule__Title__Group_2__1 : rule__Title__Group_2__1__Impl ;
    public final void rule__Title__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4947:1: ( rule__Title__Group_2__1__Impl )
            // InternalVideoMontage.g:4948:2: rule__Title__Group_2__1__Impl
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
    // InternalVideoMontage.g:4954:1: rule__Title__Group_2__1__Impl : ( ( rule__Title__DurationAssignment_2_1 ) ) ;
    public final void rule__Title__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4958:1: ( ( ( rule__Title__DurationAssignment_2_1 ) ) )
            // InternalVideoMontage.g:4959:1: ( ( rule__Title__DurationAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:4959:1: ( ( rule__Title__DurationAssignment_2_1 ) )
            // InternalVideoMontage.g:4960:2: ( rule__Title__DurationAssignment_2_1 )
            {
             before(grammarAccess.getTitleAccess().getDurationAssignment_2_1()); 
            // InternalVideoMontage.g:4961:2: ( rule__Title__DurationAssignment_2_1 )
            // InternalVideoMontage.g:4961:3: rule__Title__DurationAssignment_2_1
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
    // InternalVideoMontage.g:4970:1: rule__Title__Group_3__0 : rule__Title__Group_3__0__Impl rule__Title__Group_3__1 ;
    public final void rule__Title__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4974:1: ( rule__Title__Group_3__0__Impl rule__Title__Group_3__1 )
            // InternalVideoMontage.g:4975:2: rule__Title__Group_3__0__Impl rule__Title__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalVideoMontage.g:4982:1: rule__Title__Group_3__0__Impl : ( 'backgroundColor' ) ;
    public final void rule__Title__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:4986:1: ( ( 'backgroundColor' ) )
            // InternalVideoMontage.g:4987:1: ( 'backgroundColor' )
            {
            // InternalVideoMontage.g:4987:1: ( 'backgroundColor' )
            // InternalVideoMontage.g:4988:2: 'backgroundColor'
            {
             before(grammarAccess.getTitleAccess().getBackgroundColorKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalVideoMontage.g:4997:1: rule__Title__Group_3__1 : rule__Title__Group_3__1__Impl ;
    public final void rule__Title__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5001:1: ( rule__Title__Group_3__1__Impl )
            // InternalVideoMontage.g:5002:2: rule__Title__Group_3__1__Impl
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
    // InternalVideoMontage.g:5008:1: rule__Title__Group_3__1__Impl : ( ( rule__Title__BackgroundColorAssignment_3_1 ) ) ;
    public final void rule__Title__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5012:1: ( ( ( rule__Title__BackgroundColorAssignment_3_1 ) ) )
            // InternalVideoMontage.g:5013:1: ( ( rule__Title__BackgroundColorAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:5013:1: ( ( rule__Title__BackgroundColorAssignment_3_1 ) )
            // InternalVideoMontage.g:5014:2: ( rule__Title__BackgroundColorAssignment_3_1 )
            {
             before(grammarAccess.getTitleAccess().getBackgroundColorAssignment_3_1()); 
            // InternalVideoMontage.g:5015:2: ( rule__Title__BackgroundColorAssignment_3_1 )
            // InternalVideoMontage.g:5015:3: rule__Title__BackgroundColorAssignment_3_1
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


    // $ANTLR start "rule__Title__Group_7__0"
    // InternalVideoMontage.g:5024:1: rule__Title__Group_7__0 : rule__Title__Group_7__0__Impl rule__Title__Group_7__1 ;
    public final void rule__Title__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5028:1: ( rule__Title__Group_7__0__Impl rule__Title__Group_7__1 )
            // InternalVideoMontage.g:5029:2: rule__Title__Group_7__0__Impl rule__Title__Group_7__1
            {
            pushFollow(FOLLOW_15);
            rule__Title__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Title__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_7__0"


    // $ANTLR start "rule__Title__Group_7__0__Impl"
    // InternalVideoMontage.g:5036:1: rule__Title__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Title__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5040:1: ( ( ',' ) )
            // InternalVideoMontage.g:5041:1: ( ',' )
            {
            // InternalVideoMontage.g:5041:1: ( ',' )
            // InternalVideoMontage.g:5042:2: ','
            {
             before(grammarAccess.getTitleAccess().getCommaKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTitleAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_7__0__Impl"


    // $ANTLR start "rule__Title__Group_7__1"
    // InternalVideoMontage.g:5051:1: rule__Title__Group_7__1 : rule__Title__Group_7__1__Impl ;
    public final void rule__Title__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5055:1: ( rule__Title__Group_7__1__Impl )
            // InternalVideoMontage.g:5056:2: rule__Title__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Title__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_7__1"


    // $ANTLR start "rule__Title__Group_7__1__Impl"
    // InternalVideoMontage.g:5062:1: rule__Title__Group_7__1__Impl : ( ( rule__Title__RelativemomentAssignment_7_1 ) ) ;
    public final void rule__Title__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5066:1: ( ( ( rule__Title__RelativemomentAssignment_7_1 ) ) )
            // InternalVideoMontage.g:5067:1: ( ( rule__Title__RelativemomentAssignment_7_1 ) )
            {
            // InternalVideoMontage.g:5067:1: ( ( rule__Title__RelativemomentAssignment_7_1 ) )
            // InternalVideoMontage.g:5068:2: ( rule__Title__RelativemomentAssignment_7_1 )
            {
             before(grammarAccess.getTitleAccess().getRelativemomentAssignment_7_1()); 
            // InternalVideoMontage.g:5069:2: ( rule__Title__RelativemomentAssignment_7_1 )
            // InternalVideoMontage.g:5069:3: rule__Title__RelativemomentAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Title__RelativemomentAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getTitleAccess().getRelativemomentAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__Group_7__1__Impl"


    // $ANTLR start "rule__Clip__Group__0"
    // InternalVideoMontage.g:5078:1: rule__Clip__Group__0 : rule__Clip__Group__0__Impl rule__Clip__Group__1 ;
    public final void rule__Clip__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5082:1: ( rule__Clip__Group__0__Impl rule__Clip__Group__1 )
            // InternalVideoMontage.g:5083:2: rule__Clip__Group__0__Impl rule__Clip__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:5090:1: rule__Clip__Group__0__Impl : ( 'Clip' ) ;
    public final void rule__Clip__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5094:1: ( ( 'Clip' ) )
            // InternalVideoMontage.g:5095:1: ( 'Clip' )
            {
            // InternalVideoMontage.g:5095:1: ( 'Clip' )
            // InternalVideoMontage.g:5096:2: 'Clip'
            {
             before(grammarAccess.getClipAccess().getClipKeyword_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalVideoMontage.g:5105:1: rule__Clip__Group__1 : rule__Clip__Group__1__Impl rule__Clip__Group__2 ;
    public final void rule__Clip__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5109:1: ( rule__Clip__Group__1__Impl rule__Clip__Group__2 )
            // InternalVideoMontage.g:5110:2: rule__Clip__Group__1__Impl rule__Clip__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:5117:1: rule__Clip__Group__1__Impl : ( ( rule__Clip__NameAssignment_1 ) ) ;
    public final void rule__Clip__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5121:1: ( ( ( rule__Clip__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:5122:1: ( ( rule__Clip__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:5122:1: ( ( rule__Clip__NameAssignment_1 ) )
            // InternalVideoMontage.g:5123:2: ( rule__Clip__NameAssignment_1 )
            {
             before(grammarAccess.getClipAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:5124:2: ( rule__Clip__NameAssignment_1 )
            // InternalVideoMontage.g:5124:3: rule__Clip__NameAssignment_1
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
    // InternalVideoMontage.g:5132:1: rule__Clip__Group__2 : rule__Clip__Group__2__Impl rule__Clip__Group__3 ;
    public final void rule__Clip__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5136:1: ( rule__Clip__Group__2__Impl rule__Clip__Group__3 )
            // InternalVideoMontage.g:5137:2: rule__Clip__Group__2__Impl rule__Clip__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalVideoMontage.g:5144:1: rule__Clip__Group__2__Impl : ( '{' ) ;
    public final void rule__Clip__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5148:1: ( ( '{' ) )
            // InternalVideoMontage.g:5149:1: ( '{' )
            {
            // InternalVideoMontage.g:5149:1: ( '{' )
            // InternalVideoMontage.g:5150:2: '{'
            {
             before(grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalVideoMontage.g:5159:1: rule__Clip__Group__3 : rule__Clip__Group__3__Impl rule__Clip__Group__4 ;
    public final void rule__Clip__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5163:1: ( rule__Clip__Group__3__Impl rule__Clip__Group__4 )
            // InternalVideoMontage.g:5164:2: rule__Clip__Group__3__Impl rule__Clip__Group__4
            {
            pushFollow(FOLLOW_38);
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
    // InternalVideoMontage.g:5171:1: rule__Clip__Group__3__Impl : ( ( rule__Clip__Group_3__0 )? ) ;
    public final void rule__Clip__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5175:1: ( ( ( rule__Clip__Group_3__0 )? ) )
            // InternalVideoMontage.g:5176:1: ( ( rule__Clip__Group_3__0 )? )
            {
            // InternalVideoMontage.g:5176:1: ( ( rule__Clip__Group_3__0 )? )
            // InternalVideoMontage.g:5177:2: ( rule__Clip__Group_3__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_3()); 
            // InternalVideoMontage.g:5178:2: ( rule__Clip__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVideoMontage.g:5178:3: rule__Clip__Group_3__0
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
    // InternalVideoMontage.g:5186:1: rule__Clip__Group__4 : rule__Clip__Group__4__Impl rule__Clip__Group__5 ;
    public final void rule__Clip__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5190:1: ( rule__Clip__Group__4__Impl rule__Clip__Group__5 )
            // InternalVideoMontage.g:5191:2: rule__Clip__Group__4__Impl rule__Clip__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalVideoMontage.g:5198:1: rule__Clip__Group__4__Impl : ( ( rule__Clip__Group_4__0 )? ) ;
    public final void rule__Clip__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5202:1: ( ( ( rule__Clip__Group_4__0 )? ) )
            // InternalVideoMontage.g:5203:1: ( ( rule__Clip__Group_4__0 )? )
            {
            // InternalVideoMontage.g:5203:1: ( ( rule__Clip__Group_4__0 )? )
            // InternalVideoMontage.g:5204:2: ( rule__Clip__Group_4__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_4()); 
            // InternalVideoMontage.g:5205:2: ( rule__Clip__Group_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVideoMontage.g:5205:3: rule__Clip__Group_4__0
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
    // InternalVideoMontage.g:5213:1: rule__Clip__Group__5 : rule__Clip__Group__5__Impl rule__Clip__Group__6 ;
    public final void rule__Clip__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5217:1: ( rule__Clip__Group__5__Impl rule__Clip__Group__6 )
            // InternalVideoMontage.g:5218:2: rule__Clip__Group__5__Impl rule__Clip__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalVideoMontage.g:5225:1: rule__Clip__Group__5__Impl : ( ( rule__Clip__Group_5__0 )? ) ;
    public final void rule__Clip__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5229:1: ( ( ( rule__Clip__Group_5__0 )? ) )
            // InternalVideoMontage.g:5230:1: ( ( rule__Clip__Group_5__0 )? )
            {
            // InternalVideoMontage.g:5230:1: ( ( rule__Clip__Group_5__0 )? )
            // InternalVideoMontage.g:5231:2: ( rule__Clip__Group_5__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_5()); 
            // InternalVideoMontage.g:5232:2: ( rule__Clip__Group_5__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalVideoMontage.g:5232:3: rule__Clip__Group_5__0
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
    // InternalVideoMontage.g:5240:1: rule__Clip__Group__6 : rule__Clip__Group__6__Impl rule__Clip__Group__7 ;
    public final void rule__Clip__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5244:1: ( rule__Clip__Group__6__Impl rule__Clip__Group__7 )
            // InternalVideoMontage.g:5245:2: rule__Clip__Group__6__Impl rule__Clip__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:5252:1: rule__Clip__Group__6__Impl : ( 'relativemoment' ) ;
    public final void rule__Clip__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5256:1: ( ( 'relativemoment' ) )
            // InternalVideoMontage.g:5257:1: ( 'relativemoment' )
            {
            // InternalVideoMontage.g:5257:1: ( 'relativemoment' )
            // InternalVideoMontage.g:5258:2: 'relativemoment'
            {
             before(grammarAccess.getClipAccess().getRelativemomentKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getRelativemomentKeyword_6()); 

            }


            }

        }
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
    // InternalVideoMontage.g:5267:1: rule__Clip__Group__7 : rule__Clip__Group__7__Impl rule__Clip__Group__8 ;
    public final void rule__Clip__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5271:1: ( rule__Clip__Group__7__Impl rule__Clip__Group__8 )
            // InternalVideoMontage.g:5272:2: rule__Clip__Group__7__Impl rule__Clip__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Clip__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__8();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:5279:1: rule__Clip__Group__7__Impl : ( '{' ) ;
    public final void rule__Clip__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5283:1: ( ( '{' ) )
            // InternalVideoMontage.g:5284:1: ( '{' )
            {
            // InternalVideoMontage.g:5284:1: ( '{' )
            // InternalVideoMontage.g:5285:2: '{'
            {
             before(grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__Clip__Group__8"
    // InternalVideoMontage.g:5294:1: rule__Clip__Group__8 : rule__Clip__Group__8__Impl rule__Clip__Group__9 ;
    public final void rule__Clip__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5298:1: ( rule__Clip__Group__8__Impl rule__Clip__Group__9 )
            // InternalVideoMontage.g:5299:2: rule__Clip__Group__8__Impl rule__Clip__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Clip__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__8"


    // $ANTLR start "rule__Clip__Group__8__Impl"
    // InternalVideoMontage.g:5306:1: rule__Clip__Group__8__Impl : ( ( rule__Clip__RelativemomentAssignment_8 ) ) ;
    public final void rule__Clip__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5310:1: ( ( ( rule__Clip__RelativemomentAssignment_8 ) ) )
            // InternalVideoMontage.g:5311:1: ( ( rule__Clip__RelativemomentAssignment_8 ) )
            {
            // InternalVideoMontage.g:5311:1: ( ( rule__Clip__RelativemomentAssignment_8 ) )
            // InternalVideoMontage.g:5312:2: ( rule__Clip__RelativemomentAssignment_8 )
            {
             before(grammarAccess.getClipAccess().getRelativemomentAssignment_8()); 
            // InternalVideoMontage.g:5313:2: ( rule__Clip__RelativemomentAssignment_8 )
            // InternalVideoMontage.g:5313:3: rule__Clip__RelativemomentAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Clip__RelativemomentAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getRelativemomentAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__8__Impl"


    // $ANTLR start "rule__Clip__Group__9"
    // InternalVideoMontage.g:5321:1: rule__Clip__Group__9 : rule__Clip__Group__9__Impl rule__Clip__Group__10 ;
    public final void rule__Clip__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5325:1: ( rule__Clip__Group__9__Impl rule__Clip__Group__10 )
            // InternalVideoMontage.g:5326:2: rule__Clip__Group__9__Impl rule__Clip__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Clip__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__9"


    // $ANTLR start "rule__Clip__Group__9__Impl"
    // InternalVideoMontage.g:5333:1: rule__Clip__Group__9__Impl : ( ( rule__Clip__Group_9__0 )* ) ;
    public final void rule__Clip__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5337:1: ( ( ( rule__Clip__Group_9__0 )* ) )
            // InternalVideoMontage.g:5338:1: ( ( rule__Clip__Group_9__0 )* )
            {
            // InternalVideoMontage.g:5338:1: ( ( rule__Clip__Group_9__0 )* )
            // InternalVideoMontage.g:5339:2: ( rule__Clip__Group_9__0 )*
            {
             before(grammarAccess.getClipAccess().getGroup_9()); 
            // InternalVideoMontage.g:5340:2: ( rule__Clip__Group_9__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==23) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalVideoMontage.g:5340:3: rule__Clip__Group_9__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Clip__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getClipAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__9__Impl"


    // $ANTLR start "rule__Clip__Group__10"
    // InternalVideoMontage.g:5348:1: rule__Clip__Group__10 : rule__Clip__Group__10__Impl rule__Clip__Group__11 ;
    public final void rule__Clip__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5352:1: ( rule__Clip__Group__10__Impl rule__Clip__Group__11 )
            // InternalVideoMontage.g:5353:2: rule__Clip__Group__10__Impl rule__Clip__Group__11
            {
            pushFollow(FOLLOW_39);
            rule__Clip__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__10"


    // $ANTLR start "rule__Clip__Group__10__Impl"
    // InternalVideoMontage.g:5360:1: rule__Clip__Group__10__Impl : ( '}' ) ;
    public final void rule__Clip__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5364:1: ( ( '}' ) )
            // InternalVideoMontage.g:5365:1: ( '}' )
            {
            // InternalVideoMontage.g:5365:1: ( '}' )
            // InternalVideoMontage.g:5366:2: '}'
            {
             before(grammarAccess.getClipAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__10__Impl"


    // $ANTLR start "rule__Clip__Group__11"
    // InternalVideoMontage.g:5375:1: rule__Clip__Group__11 : rule__Clip__Group__11__Impl rule__Clip__Group__12 ;
    public final void rule__Clip__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5379:1: ( rule__Clip__Group__11__Impl rule__Clip__Group__12 )
            // InternalVideoMontage.g:5380:2: rule__Clip__Group__11__Impl rule__Clip__Group__12
            {
            pushFollow(FOLLOW_39);
            rule__Clip__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__11"


    // $ANTLR start "rule__Clip__Group__11__Impl"
    // InternalVideoMontage.g:5387:1: rule__Clip__Group__11__Impl : ( ( rule__Clip__Group_11__0 )? ) ;
    public final void rule__Clip__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5391:1: ( ( ( rule__Clip__Group_11__0 )? ) )
            // InternalVideoMontage.g:5392:1: ( ( rule__Clip__Group_11__0 )? )
            {
            // InternalVideoMontage.g:5392:1: ( ( rule__Clip__Group_11__0 )? )
            // InternalVideoMontage.g:5393:2: ( rule__Clip__Group_11__0 )?
            {
             before(grammarAccess.getClipAccess().getGroup_11()); 
            // InternalVideoMontage.g:5394:2: ( rule__Clip__Group_11__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVideoMontage.g:5394:3: rule__Clip__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Clip__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClipAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__11__Impl"


    // $ANTLR start "rule__Clip__Group__12"
    // InternalVideoMontage.g:5402:1: rule__Clip__Group__12 : rule__Clip__Group__12__Impl ;
    public final void rule__Clip__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5406:1: ( rule__Clip__Group__12__Impl )
            // InternalVideoMontage.g:5407:2: rule__Clip__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__12"


    // $ANTLR start "rule__Clip__Group__12__Impl"
    // InternalVideoMontage.g:5413:1: rule__Clip__Group__12__Impl : ( '}' ) ;
    public final void rule__Clip__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5417:1: ( ( '}' ) )
            // InternalVideoMontage.g:5418:1: ( '}' )
            {
            // InternalVideoMontage.g:5418:1: ( '}' )
            // InternalVideoMontage.g:5419:2: '}'
            {
             before(grammarAccess.getClipAccess().getRightCurlyBracketKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group__12__Impl"


    // $ANTLR start "rule__Clip__Group_3__0"
    // InternalVideoMontage.g:5429:1: rule__Clip__Group_3__0 : rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1 ;
    public final void rule__Clip__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5433:1: ( rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1 )
            // InternalVideoMontage.g:5434:2: rule__Clip__Group_3__0__Impl rule__Clip__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalVideoMontage.g:5441:1: rule__Clip__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__Clip__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5445:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:5446:1: ( 'duration' )
            {
            // InternalVideoMontage.g:5446:1: ( 'duration' )
            // InternalVideoMontage.g:5447:2: 'duration'
            {
             before(grammarAccess.getClipAccess().getDurationKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getDurationKeyword_3_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:5456:1: rule__Clip__Group_3__1 : rule__Clip__Group_3__1__Impl ;
    public final void rule__Clip__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5460:1: ( rule__Clip__Group_3__1__Impl )
            // InternalVideoMontage.g:5461:2: rule__Clip__Group_3__1__Impl
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
    // InternalVideoMontage.g:5467:1: rule__Clip__Group_3__1__Impl : ( ( rule__Clip__DurationAssignment_3_1 ) ) ;
    public final void rule__Clip__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5471:1: ( ( ( rule__Clip__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:5472:1: ( ( rule__Clip__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:5472:1: ( ( rule__Clip__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:5473:2: ( rule__Clip__DurationAssignment_3_1 )
            {
             before(grammarAccess.getClipAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:5474:2: ( rule__Clip__DurationAssignment_3_1 )
            // InternalVideoMontage.g:5474:3: rule__Clip__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Clip__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getDurationAssignment_3_1()); 

            }


            }

        }
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
    // InternalVideoMontage.g:5483:1: rule__Clip__Group_4__0 : rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1 ;
    public final void rule__Clip__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5487:1: ( rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1 )
            // InternalVideoMontage.g:5488:2: rule__Clip__Group_4__0__Impl rule__Clip__Group_4__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:5495:1: rule__Clip__Group_4__0__Impl : ( 'startCut' ) ;
    public final void rule__Clip__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5499:1: ( ( 'startCut' ) )
            // InternalVideoMontage.g:5500:1: ( 'startCut' )
            {
            // InternalVideoMontage.g:5500:1: ( 'startCut' )
            // InternalVideoMontage.g:5501:2: 'startCut'
            {
             before(grammarAccess.getClipAccess().getStartCutKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getStartCutKeyword_4_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:5510:1: rule__Clip__Group_4__1 : rule__Clip__Group_4__1__Impl ;
    public final void rule__Clip__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5514:1: ( rule__Clip__Group_4__1__Impl )
            // InternalVideoMontage.g:5515:2: rule__Clip__Group_4__1__Impl
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
    // InternalVideoMontage.g:5521:1: rule__Clip__Group_4__1__Impl : ( ( rule__Clip__StartCutAssignment_4_1 ) ) ;
    public final void rule__Clip__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5525:1: ( ( ( rule__Clip__StartCutAssignment_4_1 ) ) )
            // InternalVideoMontage.g:5526:1: ( ( rule__Clip__StartCutAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:5526:1: ( ( rule__Clip__StartCutAssignment_4_1 ) )
            // InternalVideoMontage.g:5527:2: ( rule__Clip__StartCutAssignment_4_1 )
            {
             before(grammarAccess.getClipAccess().getStartCutAssignment_4_1()); 
            // InternalVideoMontage.g:5528:2: ( rule__Clip__StartCutAssignment_4_1 )
            // InternalVideoMontage.g:5528:3: rule__Clip__StartCutAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Clip__StartCutAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getStartCutAssignment_4_1()); 

            }


            }

        }
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
    // InternalVideoMontage.g:5537:1: rule__Clip__Group_5__0 : rule__Clip__Group_5__0__Impl rule__Clip__Group_5__1 ;
    public final void rule__Clip__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5541:1: ( rule__Clip__Group_5__0__Impl rule__Clip__Group_5__1 )
            // InternalVideoMontage.g:5542:2: rule__Clip__Group_5__0__Impl rule__Clip__Group_5__1
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
    // InternalVideoMontage.g:5549:1: rule__Clip__Group_5__0__Impl : ( 'endCut' ) ;
    public final void rule__Clip__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5553:1: ( ( 'endCut' ) )
            // InternalVideoMontage.g:5554:1: ( 'endCut' )
            {
            // InternalVideoMontage.g:5554:1: ( 'endCut' )
            // InternalVideoMontage.g:5555:2: 'endCut'
            {
             before(grammarAccess.getClipAccess().getEndCutKeyword_5_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getEndCutKeyword_5_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:5564:1: rule__Clip__Group_5__1 : rule__Clip__Group_5__1__Impl ;
    public final void rule__Clip__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5568:1: ( rule__Clip__Group_5__1__Impl )
            // InternalVideoMontage.g:5569:2: rule__Clip__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group_5__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:5575:1: rule__Clip__Group_5__1__Impl : ( ( rule__Clip__EndCutAssignment_5_1 ) ) ;
    public final void rule__Clip__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5579:1: ( ( ( rule__Clip__EndCutAssignment_5_1 ) ) )
            // InternalVideoMontage.g:5580:1: ( ( rule__Clip__EndCutAssignment_5_1 ) )
            {
            // InternalVideoMontage.g:5580:1: ( ( rule__Clip__EndCutAssignment_5_1 ) )
            // InternalVideoMontage.g:5581:2: ( rule__Clip__EndCutAssignment_5_1 )
            {
             before(grammarAccess.getClipAccess().getEndCutAssignment_5_1()); 
            // InternalVideoMontage.g:5582:2: ( rule__Clip__EndCutAssignment_5_1 )
            // InternalVideoMontage.g:5582:3: rule__Clip__EndCutAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Clip__EndCutAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getEndCutAssignment_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Clip__Group_9__0"
    // InternalVideoMontage.g:5591:1: rule__Clip__Group_9__0 : rule__Clip__Group_9__0__Impl rule__Clip__Group_9__1 ;
    public final void rule__Clip__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5595:1: ( rule__Clip__Group_9__0__Impl rule__Clip__Group_9__1 )
            // InternalVideoMontage.g:5596:2: rule__Clip__Group_9__0__Impl rule__Clip__Group_9__1
            {
            pushFollow(FOLLOW_15);
            rule__Clip__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_9__0"


    // $ANTLR start "rule__Clip__Group_9__0__Impl"
    // InternalVideoMontage.g:5603:1: rule__Clip__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Clip__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5607:1: ( ( ',' ) )
            // InternalVideoMontage.g:5608:1: ( ',' )
            {
            // InternalVideoMontage.g:5608:1: ( ',' )
            // InternalVideoMontage.g:5609:2: ','
            {
             before(grammarAccess.getClipAccess().getCommaKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_9__0__Impl"


    // $ANTLR start "rule__Clip__Group_9__1"
    // InternalVideoMontage.g:5618:1: rule__Clip__Group_9__1 : rule__Clip__Group_9__1__Impl ;
    public final void rule__Clip__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5622:1: ( rule__Clip__Group_9__1__Impl )
            // InternalVideoMontage.g:5623:2: rule__Clip__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_9__1"


    // $ANTLR start "rule__Clip__Group_9__1__Impl"
    // InternalVideoMontage.g:5629:1: rule__Clip__Group_9__1__Impl : ( ( rule__Clip__RelativemomentAssignment_9_1 ) ) ;
    public final void rule__Clip__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5633:1: ( ( ( rule__Clip__RelativemomentAssignment_9_1 ) ) )
            // InternalVideoMontage.g:5634:1: ( ( rule__Clip__RelativemomentAssignment_9_1 ) )
            {
            // InternalVideoMontage.g:5634:1: ( ( rule__Clip__RelativemomentAssignment_9_1 ) )
            // InternalVideoMontage.g:5635:2: ( rule__Clip__RelativemomentAssignment_9_1 )
            {
             before(grammarAccess.getClipAccess().getRelativemomentAssignment_9_1()); 
            // InternalVideoMontage.g:5636:2: ( rule__Clip__RelativemomentAssignment_9_1 )
            // InternalVideoMontage.g:5636:3: rule__Clip__RelativemomentAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Clip__RelativemomentAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getRelativemomentAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_9__1__Impl"


    // $ANTLR start "rule__Clip__Group_11__0"
    // InternalVideoMontage.g:5645:1: rule__Clip__Group_11__0 : rule__Clip__Group_11__0__Impl rule__Clip__Group_11__1 ;
    public final void rule__Clip__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5649:1: ( rule__Clip__Group_11__0__Impl rule__Clip__Group_11__1 )
            // InternalVideoMontage.g:5650:2: rule__Clip__Group_11__0__Impl rule__Clip__Group_11__1
            {
            pushFollow(FOLLOW_3);
            rule__Clip__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11__0"


    // $ANTLR start "rule__Clip__Group_11__0__Impl"
    // InternalVideoMontage.g:5657:1: rule__Clip__Group_11__0__Impl : ( 'video' ) ;
    public final void rule__Clip__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5661:1: ( ( 'video' ) )
            // InternalVideoMontage.g:5662:1: ( 'video' )
            {
            // InternalVideoMontage.g:5662:1: ( 'video' )
            // InternalVideoMontage.g:5663:2: 'video'
            {
             before(grammarAccess.getClipAccess().getVideoKeyword_11_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getVideoKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11__0__Impl"


    // $ANTLR start "rule__Clip__Group_11__1"
    // InternalVideoMontage.g:5672:1: rule__Clip__Group_11__1 : rule__Clip__Group_11__1__Impl rule__Clip__Group_11__2 ;
    public final void rule__Clip__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5676:1: ( rule__Clip__Group_11__1__Impl rule__Clip__Group_11__2 )
            // InternalVideoMontage.g:5677:2: rule__Clip__Group_11__1__Impl rule__Clip__Group_11__2
            {
            pushFollow(FOLLOW_9);
            rule__Clip__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11__1"


    // $ANTLR start "rule__Clip__Group_11__1__Impl"
    // InternalVideoMontage.g:5684:1: rule__Clip__Group_11__1__Impl : ( '{' ) ;
    public final void rule__Clip__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5688:1: ( ( '{' ) )
            // InternalVideoMontage.g:5689:1: ( '{' )
            {
            // InternalVideoMontage.g:5689:1: ( '{' )
            // InternalVideoMontage.g:5690:2: '{'
            {
             before(grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11__1__Impl"


    // $ANTLR start "rule__Clip__Group_11__2"
    // InternalVideoMontage.g:5699:1: rule__Clip__Group_11__2 : rule__Clip__Group_11__2__Impl rule__Clip__Group_11__3 ;
    public final void rule__Clip__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5703:1: ( rule__Clip__Group_11__2__Impl rule__Clip__Group_11__3 )
            // InternalVideoMontage.g:5704:2: rule__Clip__Group_11__2__Impl rule__Clip__Group_11__3
            {
            pushFollow(FOLLOW_6);
            rule__Clip__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11__2"


    // $ANTLR start "rule__Clip__Group_11__2__Impl"
    // InternalVideoMontage.g:5711:1: rule__Clip__Group_11__2__Impl : ( ( rule__Clip__VideoAssignment_11_2 ) ) ;
    public final void rule__Clip__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5715:1: ( ( ( rule__Clip__VideoAssignment_11_2 ) ) )
            // InternalVideoMontage.g:5716:1: ( ( rule__Clip__VideoAssignment_11_2 ) )
            {
            // InternalVideoMontage.g:5716:1: ( ( rule__Clip__VideoAssignment_11_2 ) )
            // InternalVideoMontage.g:5717:2: ( rule__Clip__VideoAssignment_11_2 )
            {
             before(grammarAccess.getClipAccess().getVideoAssignment_11_2()); 
            // InternalVideoMontage.g:5718:2: ( rule__Clip__VideoAssignment_11_2 )
            // InternalVideoMontage.g:5718:3: rule__Clip__VideoAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Clip__VideoAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getVideoAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11__2__Impl"


    // $ANTLR start "rule__Clip__Group_11__3"
    // InternalVideoMontage.g:5726:1: rule__Clip__Group_11__3 : rule__Clip__Group_11__3__Impl rule__Clip__Group_11__4 ;
    public final void rule__Clip__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5730:1: ( rule__Clip__Group_11__3__Impl rule__Clip__Group_11__4 )
            // InternalVideoMontage.g:5731:2: rule__Clip__Group_11__3__Impl rule__Clip__Group_11__4
            {
            pushFollow(FOLLOW_6);
            rule__Clip__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11__3"


    // $ANTLR start "rule__Clip__Group_11__3__Impl"
    // InternalVideoMontage.g:5738:1: rule__Clip__Group_11__3__Impl : ( ( rule__Clip__Group_11_3__0 )* ) ;
    public final void rule__Clip__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5742:1: ( ( ( rule__Clip__Group_11_3__0 )* ) )
            // InternalVideoMontage.g:5743:1: ( ( rule__Clip__Group_11_3__0 )* )
            {
            // InternalVideoMontage.g:5743:1: ( ( rule__Clip__Group_11_3__0 )* )
            // InternalVideoMontage.g:5744:2: ( rule__Clip__Group_11_3__0 )*
            {
             before(grammarAccess.getClipAccess().getGroup_11_3()); 
            // InternalVideoMontage.g:5745:2: ( rule__Clip__Group_11_3__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==23) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalVideoMontage.g:5745:3: rule__Clip__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Clip__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getClipAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11__3__Impl"


    // $ANTLR start "rule__Clip__Group_11__4"
    // InternalVideoMontage.g:5753:1: rule__Clip__Group_11__4 : rule__Clip__Group_11__4__Impl ;
    public final void rule__Clip__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5757:1: ( rule__Clip__Group_11__4__Impl )
            // InternalVideoMontage.g:5758:2: rule__Clip__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11__4"


    // $ANTLR start "rule__Clip__Group_11__4__Impl"
    // InternalVideoMontage.g:5764:1: rule__Clip__Group_11__4__Impl : ( '}' ) ;
    public final void rule__Clip__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5768:1: ( ( '}' ) )
            // InternalVideoMontage.g:5769:1: ( '}' )
            {
            // InternalVideoMontage.g:5769:1: ( '}' )
            // InternalVideoMontage.g:5770:2: '}'
            {
             before(grammarAccess.getClipAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11__4__Impl"


    // $ANTLR start "rule__Clip__Group_11_3__0"
    // InternalVideoMontage.g:5780:1: rule__Clip__Group_11_3__0 : rule__Clip__Group_11_3__0__Impl rule__Clip__Group_11_3__1 ;
    public final void rule__Clip__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5784:1: ( rule__Clip__Group_11_3__0__Impl rule__Clip__Group_11_3__1 )
            // InternalVideoMontage.g:5785:2: rule__Clip__Group_11_3__0__Impl rule__Clip__Group_11_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Clip__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Clip__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11_3__0"


    // $ANTLR start "rule__Clip__Group_11_3__0__Impl"
    // InternalVideoMontage.g:5792:1: rule__Clip__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__Clip__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5796:1: ( ( ',' ) )
            // InternalVideoMontage.g:5797:1: ( ',' )
            {
            // InternalVideoMontage.g:5797:1: ( ',' )
            // InternalVideoMontage.g:5798:2: ','
            {
             before(grammarAccess.getClipAccess().getCommaKeyword_11_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getClipAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11_3__0__Impl"


    // $ANTLR start "rule__Clip__Group_11_3__1"
    // InternalVideoMontage.g:5807:1: rule__Clip__Group_11_3__1 : rule__Clip__Group_11_3__1__Impl ;
    public final void rule__Clip__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5811:1: ( rule__Clip__Group_11_3__1__Impl )
            // InternalVideoMontage.g:5812:2: rule__Clip__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Clip__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11_3__1"


    // $ANTLR start "rule__Clip__Group_11_3__1__Impl"
    // InternalVideoMontage.g:5818:1: rule__Clip__Group_11_3__1__Impl : ( ( rule__Clip__VideoAssignment_11_3_1 ) ) ;
    public final void rule__Clip__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5822:1: ( ( ( rule__Clip__VideoAssignment_11_3_1 ) ) )
            // InternalVideoMontage.g:5823:1: ( ( rule__Clip__VideoAssignment_11_3_1 ) )
            {
            // InternalVideoMontage.g:5823:1: ( ( rule__Clip__VideoAssignment_11_3_1 ) )
            // InternalVideoMontage.g:5824:2: ( rule__Clip__VideoAssignment_11_3_1 )
            {
             before(grammarAccess.getClipAccess().getVideoAssignment_11_3_1()); 
            // InternalVideoMontage.g:5825:2: ( rule__Clip__VideoAssignment_11_3_1 )
            // InternalVideoMontage.g:5825:3: rule__Clip__VideoAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Clip__VideoAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClipAccess().getVideoAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__Group_11_3__1__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // InternalVideoMontage.g:5834:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5838:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalVideoMontage.g:5839:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:5846:1: rule__Video__Group__0__Impl : ( 'Video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5850:1: ( ( 'Video' ) )
            // InternalVideoMontage.g:5851:1: ( 'Video' )
            {
            // InternalVideoMontage.g:5851:1: ( 'Video' )
            // InternalVideoMontage.g:5852:2: 'Video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getVideoKeyword_0()); 

            }


            }

        }
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
    // InternalVideoMontage.g:5861:1: rule__Video__Group__1 : rule__Video__Group__1__Impl rule__Video__Group__2 ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5865:1: ( rule__Video__Group__1__Impl rule__Video__Group__2 )
            // InternalVideoMontage.g:5866:2: rule__Video__Group__1__Impl rule__Video__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Video__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__2();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:5873:1: rule__Video__Group__1__Impl : ( ( rule__Video__NameAssignment_1 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5877:1: ( ( ( rule__Video__NameAssignment_1 ) ) )
            // InternalVideoMontage.g:5878:1: ( ( rule__Video__NameAssignment_1 ) )
            {
            // InternalVideoMontage.g:5878:1: ( ( rule__Video__NameAssignment_1 ) )
            // InternalVideoMontage.g:5879:2: ( rule__Video__NameAssignment_1 )
            {
             before(grammarAccess.getVideoAccess().getNameAssignment_1()); 
            // InternalVideoMontage.g:5880:2: ( rule__Video__NameAssignment_1 )
            // InternalVideoMontage.g:5880:3: rule__Video__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Video__Group__2"
    // InternalVideoMontage.g:5888:1: rule__Video__Group__2 : rule__Video__Group__2__Impl rule__Video__Group__3 ;
    public final void rule__Video__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5892:1: ( rule__Video__Group__2__Impl rule__Video__Group__3 )
            // InternalVideoMontage.g:5893:2: rule__Video__Group__2__Impl rule__Video__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__Video__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__2"


    // $ANTLR start "rule__Video__Group__2__Impl"
    // InternalVideoMontage.g:5900:1: rule__Video__Group__2__Impl : ( '{' ) ;
    public final void rule__Video__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5904:1: ( ( '{' ) )
            // InternalVideoMontage.g:5905:1: ( '{' )
            {
            // InternalVideoMontage.g:5905:1: ( '{' )
            // InternalVideoMontage.g:5906:2: '{'
            {
             before(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__2__Impl"


    // $ANTLR start "rule__Video__Group__3"
    // InternalVideoMontage.g:5915:1: rule__Video__Group__3 : rule__Video__Group__3__Impl rule__Video__Group__4 ;
    public final void rule__Video__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5919:1: ( rule__Video__Group__3__Impl rule__Video__Group__4 )
            // InternalVideoMontage.g:5920:2: rule__Video__Group__3__Impl rule__Video__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Video__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__3"


    // $ANTLR start "rule__Video__Group__3__Impl"
    // InternalVideoMontage.g:5927:1: rule__Video__Group__3__Impl : ( ( rule__Video__Group_3__0 )? ) ;
    public final void rule__Video__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5931:1: ( ( ( rule__Video__Group_3__0 )? ) )
            // InternalVideoMontage.g:5932:1: ( ( rule__Video__Group_3__0 )? )
            {
            // InternalVideoMontage.g:5932:1: ( ( rule__Video__Group_3__0 )? )
            // InternalVideoMontage.g:5933:2: ( rule__Video__Group_3__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_3()); 
            // InternalVideoMontage.g:5934:2: ( rule__Video__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalVideoMontage.g:5934:3: rule__Video__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__3__Impl"


    // $ANTLR start "rule__Video__Group__4"
    // InternalVideoMontage.g:5942:1: rule__Video__Group__4 : rule__Video__Group__4__Impl rule__Video__Group__5 ;
    public final void rule__Video__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5946:1: ( rule__Video__Group__4__Impl rule__Video__Group__5 )
            // InternalVideoMontage.g:5947:2: rule__Video__Group__4__Impl rule__Video__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Video__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__4"


    // $ANTLR start "rule__Video__Group__4__Impl"
    // InternalVideoMontage.g:5954:1: rule__Video__Group__4__Impl : ( ( rule__Video__Group_4__0 )? ) ;
    public final void rule__Video__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5958:1: ( ( ( rule__Video__Group_4__0 )? ) )
            // InternalVideoMontage.g:5959:1: ( ( rule__Video__Group_4__0 )? )
            {
            // InternalVideoMontage.g:5959:1: ( ( rule__Video__Group_4__0 )? )
            // InternalVideoMontage.g:5960:2: ( rule__Video__Group_4__0 )?
            {
             before(grammarAccess.getVideoAccess().getGroup_4()); 
            // InternalVideoMontage.g:5961:2: ( rule__Video__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalVideoMontage.g:5961:3: rule__Video__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Video__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__4__Impl"


    // $ANTLR start "rule__Video__Group__5"
    // InternalVideoMontage.g:5969:1: rule__Video__Group__5 : rule__Video__Group__5__Impl rule__Video__Group__6 ;
    public final void rule__Video__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5973:1: ( rule__Video__Group__5__Impl rule__Video__Group__6 )
            // InternalVideoMontage.g:5974:2: rule__Video__Group__5__Impl rule__Video__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Video__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__5"


    // $ANTLR start "rule__Video__Group__5__Impl"
    // InternalVideoMontage.g:5981:1: rule__Video__Group__5__Impl : ( 'relativemoment' ) ;
    public final void rule__Video__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:5985:1: ( ( 'relativemoment' ) )
            // InternalVideoMontage.g:5986:1: ( 'relativemoment' )
            {
            // InternalVideoMontage.g:5986:1: ( 'relativemoment' )
            // InternalVideoMontage.g:5987:2: 'relativemoment'
            {
             before(grammarAccess.getVideoAccess().getRelativemomentKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getRelativemomentKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__5__Impl"


    // $ANTLR start "rule__Video__Group__6"
    // InternalVideoMontage.g:5996:1: rule__Video__Group__6 : rule__Video__Group__6__Impl rule__Video__Group__7 ;
    public final void rule__Video__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6000:1: ( rule__Video__Group__6__Impl rule__Video__Group__7 )
            // InternalVideoMontage.g:6001:2: rule__Video__Group__6__Impl rule__Video__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Video__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__6"


    // $ANTLR start "rule__Video__Group__6__Impl"
    // InternalVideoMontage.g:6008:1: rule__Video__Group__6__Impl : ( '{' ) ;
    public final void rule__Video__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6012:1: ( ( '{' ) )
            // InternalVideoMontage.g:6013:1: ( '{' )
            {
            // InternalVideoMontage.g:6013:1: ( '{' )
            // InternalVideoMontage.g:6014:2: '{'
            {
             before(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__6__Impl"


    // $ANTLR start "rule__Video__Group__7"
    // InternalVideoMontage.g:6023:1: rule__Video__Group__7 : rule__Video__Group__7__Impl rule__Video__Group__8 ;
    public final void rule__Video__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6027:1: ( rule__Video__Group__7__Impl rule__Video__Group__8 )
            // InternalVideoMontage.g:6028:2: rule__Video__Group__7__Impl rule__Video__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Video__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__7"


    // $ANTLR start "rule__Video__Group__7__Impl"
    // InternalVideoMontage.g:6035:1: rule__Video__Group__7__Impl : ( ( rule__Video__RelativemomentAssignment_7 ) ) ;
    public final void rule__Video__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6039:1: ( ( ( rule__Video__RelativemomentAssignment_7 ) ) )
            // InternalVideoMontage.g:6040:1: ( ( rule__Video__RelativemomentAssignment_7 ) )
            {
            // InternalVideoMontage.g:6040:1: ( ( rule__Video__RelativemomentAssignment_7 ) )
            // InternalVideoMontage.g:6041:2: ( rule__Video__RelativemomentAssignment_7 )
            {
             before(grammarAccess.getVideoAccess().getRelativemomentAssignment_7()); 
            // InternalVideoMontage.g:6042:2: ( rule__Video__RelativemomentAssignment_7 )
            // InternalVideoMontage.g:6042:3: rule__Video__RelativemomentAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Video__RelativemomentAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getRelativemomentAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__7__Impl"


    // $ANTLR start "rule__Video__Group__8"
    // InternalVideoMontage.g:6050:1: rule__Video__Group__8 : rule__Video__Group__8__Impl rule__Video__Group__9 ;
    public final void rule__Video__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6054:1: ( rule__Video__Group__8__Impl rule__Video__Group__9 )
            // InternalVideoMontage.g:6055:2: rule__Video__Group__8__Impl rule__Video__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__Video__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__8"


    // $ANTLR start "rule__Video__Group__8__Impl"
    // InternalVideoMontage.g:6062:1: rule__Video__Group__8__Impl : ( ( rule__Video__Group_8__0 )* ) ;
    public final void rule__Video__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6066:1: ( ( ( rule__Video__Group_8__0 )* ) )
            // InternalVideoMontage.g:6067:1: ( ( rule__Video__Group_8__0 )* )
            {
            // InternalVideoMontage.g:6067:1: ( ( rule__Video__Group_8__0 )* )
            // InternalVideoMontage.g:6068:2: ( rule__Video__Group_8__0 )*
            {
             before(grammarAccess.getVideoAccess().getGroup_8()); 
            // InternalVideoMontage.g:6069:2: ( rule__Video__Group_8__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==23) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalVideoMontage.g:6069:3: rule__Video__Group_8__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Video__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getVideoAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__8__Impl"


    // $ANTLR start "rule__Video__Group__9"
    // InternalVideoMontage.g:6077:1: rule__Video__Group__9 : rule__Video__Group__9__Impl rule__Video__Group__10 ;
    public final void rule__Video__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6081:1: ( rule__Video__Group__9__Impl rule__Video__Group__10 )
            // InternalVideoMontage.g:6082:2: rule__Video__Group__9__Impl rule__Video__Group__10
            {
            pushFollow(FOLLOW_40);
            rule__Video__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__9"


    // $ANTLR start "rule__Video__Group__9__Impl"
    // InternalVideoMontage.g:6089:1: rule__Video__Group__9__Impl : ( '}' ) ;
    public final void rule__Video__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6093:1: ( ( '}' ) )
            // InternalVideoMontage.g:6094:1: ( '}' )
            {
            // InternalVideoMontage.g:6094:1: ( '}' )
            // InternalVideoMontage.g:6095:2: '}'
            {
             before(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__9__Impl"


    // $ANTLR start "rule__Video__Group__10"
    // InternalVideoMontage.g:6104:1: rule__Video__Group__10 : rule__Video__Group__10__Impl rule__Video__Group__11 ;
    public final void rule__Video__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6108:1: ( rule__Video__Group__10__Impl rule__Video__Group__11 )
            // InternalVideoMontage.g:6109:2: rule__Video__Group__10__Impl rule__Video__Group__11
            {
            pushFollow(FOLLOW_41);
            rule__Video__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__10"


    // $ANTLR start "rule__Video__Group__10__Impl"
    // InternalVideoMontage.g:6116:1: rule__Video__Group__10__Impl : ( 'clip' ) ;
    public final void rule__Video__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6120:1: ( ( 'clip' ) )
            // InternalVideoMontage.g:6121:1: ( 'clip' )
            {
            // InternalVideoMontage.g:6121:1: ( 'clip' )
            // InternalVideoMontage.g:6122:2: 'clip'
            {
             before(grammarAccess.getVideoAccess().getClipKeyword_10()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getClipKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__10__Impl"


    // $ANTLR start "rule__Video__Group__11"
    // InternalVideoMontage.g:6131:1: rule__Video__Group__11 : rule__Video__Group__11__Impl rule__Video__Group__12 ;
    public final void rule__Video__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6135:1: ( rule__Video__Group__11__Impl rule__Video__Group__12 )
            // InternalVideoMontage.g:6136:2: rule__Video__Group__11__Impl rule__Video__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Video__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__11"


    // $ANTLR start "rule__Video__Group__11__Impl"
    // InternalVideoMontage.g:6143:1: rule__Video__Group__11__Impl : ( ( rule__Video__ClipAssignment_11 ) ) ;
    public final void rule__Video__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6147:1: ( ( ( rule__Video__ClipAssignment_11 ) ) )
            // InternalVideoMontage.g:6148:1: ( ( rule__Video__ClipAssignment_11 ) )
            {
            // InternalVideoMontage.g:6148:1: ( ( rule__Video__ClipAssignment_11 ) )
            // InternalVideoMontage.g:6149:2: ( rule__Video__ClipAssignment_11 )
            {
             before(grammarAccess.getVideoAccess().getClipAssignment_11()); 
            // InternalVideoMontage.g:6150:2: ( rule__Video__ClipAssignment_11 )
            // InternalVideoMontage.g:6150:3: rule__Video__ClipAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Video__ClipAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getClipAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__11__Impl"


    // $ANTLR start "rule__Video__Group__12"
    // InternalVideoMontage.g:6158:1: rule__Video__Group__12 : rule__Video__Group__12__Impl ;
    public final void rule__Video__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6162:1: ( rule__Video__Group__12__Impl )
            // InternalVideoMontage.g:6163:2: rule__Video__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__12"


    // $ANTLR start "rule__Video__Group__12__Impl"
    // InternalVideoMontage.g:6169:1: rule__Video__Group__12__Impl : ( '}' ) ;
    public final void rule__Video__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6173:1: ( ( '}' ) )
            // InternalVideoMontage.g:6174:1: ( '}' )
            {
            // InternalVideoMontage.g:6174:1: ( '}' )
            // InternalVideoMontage.g:6175:2: '}'
            {
             before(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_12()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__12__Impl"


    // $ANTLR start "rule__Video__Group_3__0"
    // InternalVideoMontage.g:6185:1: rule__Video__Group_3__0 : rule__Video__Group_3__0__Impl rule__Video__Group_3__1 ;
    public final void rule__Video__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6189:1: ( rule__Video__Group_3__0__Impl rule__Video__Group_3__1 )
            // InternalVideoMontage.g:6190:2: rule__Video__Group_3__0__Impl rule__Video__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Video__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_3__0"


    // $ANTLR start "rule__Video__Group_3__0__Impl"
    // InternalVideoMontage.g:6197:1: rule__Video__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__Video__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6201:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:6202:1: ( 'duration' )
            {
            // InternalVideoMontage.g:6202:1: ( 'duration' )
            // InternalVideoMontage.g:6203:2: 'duration'
            {
             before(grammarAccess.getVideoAccess().getDurationKeyword_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getDurationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_3__0__Impl"


    // $ANTLR start "rule__Video__Group_3__1"
    // InternalVideoMontage.g:6212:1: rule__Video__Group_3__1 : rule__Video__Group_3__1__Impl ;
    public final void rule__Video__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6216:1: ( rule__Video__Group_3__1__Impl )
            // InternalVideoMontage.g:6217:2: rule__Video__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_3__1"


    // $ANTLR start "rule__Video__Group_3__1__Impl"
    // InternalVideoMontage.g:6223:1: rule__Video__Group_3__1__Impl : ( ( rule__Video__DurationAssignment_3_1 ) ) ;
    public final void rule__Video__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6227:1: ( ( ( rule__Video__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:6228:1: ( ( rule__Video__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:6228:1: ( ( rule__Video__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:6229:2: ( rule__Video__DurationAssignment_3_1 )
            {
             before(grammarAccess.getVideoAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:6230:2: ( rule__Video__DurationAssignment_3_1 )
            // InternalVideoMontage.g:6230:3: rule__Video__DurationAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__DurationAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getDurationAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_3__1__Impl"


    // $ANTLR start "rule__Video__Group_4__0"
    // InternalVideoMontage.g:6239:1: rule__Video__Group_4__0 : rule__Video__Group_4__0__Impl rule__Video__Group_4__1 ;
    public final void rule__Video__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6243:1: ( rule__Video__Group_4__0__Impl rule__Video__Group_4__1 )
            // InternalVideoMontage.g:6244:2: rule__Video__Group_4__0__Impl rule__Video__Group_4__1
            {
            pushFollow(FOLLOW_13);
            rule__Video__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_4__0"


    // $ANTLR start "rule__Video__Group_4__0__Impl"
    // InternalVideoMontage.g:6251:1: rule__Video__Group_4__0__Impl : ( 'path' ) ;
    public final void rule__Video__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6255:1: ( ( 'path' ) )
            // InternalVideoMontage.g:6256:1: ( 'path' )
            {
            // InternalVideoMontage.g:6256:1: ( 'path' )
            // InternalVideoMontage.g:6257:2: 'path'
            {
             before(grammarAccess.getVideoAccess().getPathKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getPathKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_4__0__Impl"


    // $ANTLR start "rule__Video__Group_4__1"
    // InternalVideoMontage.g:6266:1: rule__Video__Group_4__1 : rule__Video__Group_4__1__Impl ;
    public final void rule__Video__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6270:1: ( rule__Video__Group_4__1__Impl )
            // InternalVideoMontage.g:6271:2: rule__Video__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_4__1"


    // $ANTLR start "rule__Video__Group_4__1__Impl"
    // InternalVideoMontage.g:6277:1: rule__Video__Group_4__1__Impl : ( ( rule__Video__PathAssignment_4_1 ) ) ;
    public final void rule__Video__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6281:1: ( ( ( rule__Video__PathAssignment_4_1 ) ) )
            // InternalVideoMontage.g:6282:1: ( ( rule__Video__PathAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:6282:1: ( ( rule__Video__PathAssignment_4_1 ) )
            // InternalVideoMontage.g:6283:2: ( rule__Video__PathAssignment_4_1 )
            {
             before(grammarAccess.getVideoAccess().getPathAssignment_4_1()); 
            // InternalVideoMontage.g:6284:2: ( rule__Video__PathAssignment_4_1 )
            // InternalVideoMontage.g:6284:3: rule__Video__PathAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__PathAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getPathAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_4__1__Impl"


    // $ANTLR start "rule__Video__Group_8__0"
    // InternalVideoMontage.g:6293:1: rule__Video__Group_8__0 : rule__Video__Group_8__0__Impl rule__Video__Group_8__1 ;
    public final void rule__Video__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6297:1: ( rule__Video__Group_8__0__Impl rule__Video__Group_8__1 )
            // InternalVideoMontage.g:6298:2: rule__Video__Group_8__0__Impl rule__Video__Group_8__1
            {
            pushFollow(FOLLOW_15);
            rule__Video__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_8__0"


    // $ANTLR start "rule__Video__Group_8__0__Impl"
    // InternalVideoMontage.g:6305:1: rule__Video__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Video__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6309:1: ( ( ',' ) )
            // InternalVideoMontage.g:6310:1: ( ',' )
            {
            // InternalVideoMontage.g:6310:1: ( ',' )
            // InternalVideoMontage.g:6311:2: ','
            {
             before(grammarAccess.getVideoAccess().getCommaKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_8__0__Impl"


    // $ANTLR start "rule__Video__Group_8__1"
    // InternalVideoMontage.g:6320:1: rule__Video__Group_8__1 : rule__Video__Group_8__1__Impl ;
    public final void rule__Video__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6324:1: ( rule__Video__Group_8__1__Impl )
            // InternalVideoMontage.g:6325:2: rule__Video__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_8__1"


    // $ANTLR start "rule__Video__Group_8__1__Impl"
    // InternalVideoMontage.g:6331:1: rule__Video__Group_8__1__Impl : ( ( rule__Video__RelativemomentAssignment_8_1 ) ) ;
    public final void rule__Video__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6335:1: ( ( ( rule__Video__RelativemomentAssignment_8_1 ) ) )
            // InternalVideoMontage.g:6336:1: ( ( rule__Video__RelativemomentAssignment_8_1 ) )
            {
            // InternalVideoMontage.g:6336:1: ( ( rule__Video__RelativemomentAssignment_8_1 ) )
            // InternalVideoMontage.g:6337:2: ( rule__Video__RelativemomentAssignment_8_1 )
            {
             before(grammarAccess.getVideoAccess().getRelativemomentAssignment_8_1()); 
            // InternalVideoMontage.g:6338:2: ( rule__Video__RelativemomentAssignment_8_1 )
            // InternalVideoMontage.g:6338:3: rule__Video__RelativemomentAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__RelativemomentAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getRelativemomentAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group_8__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group__0"
    // InternalVideoMontage.g:6347:1: rule__TextArea_Impl__Group__0 : rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1 ;
    public final void rule__TextArea_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6351:1: ( rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1 )
            // InternalVideoMontage.g:6352:2: rule__TextArea_Impl__Group__0__Impl rule__TextArea_Impl__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:6359:1: rule__TextArea_Impl__Group__0__Impl : ( 'TextArea' ) ;
    public final void rule__TextArea_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6363:1: ( ( 'TextArea' ) )
            // InternalVideoMontage.g:6364:1: ( 'TextArea' )
            {
            // InternalVideoMontage.g:6364:1: ( 'TextArea' )
            // InternalVideoMontage.g:6365:2: 'TextArea'
            {
             before(grammarAccess.getTextArea_ImplAccess().getTextAreaKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalVideoMontage.g:6374:1: rule__TextArea_Impl__Group__1 : rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2 ;
    public final void rule__TextArea_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6378:1: ( rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2 )
            // InternalVideoMontage.g:6379:2: rule__TextArea_Impl__Group__1__Impl rule__TextArea_Impl__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:6386:1: rule__TextArea_Impl__Group__1__Impl : ( '{' ) ;
    public final void rule__TextArea_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6390:1: ( ( '{' ) )
            // InternalVideoMontage.g:6391:1: ( '{' )
            {
            // InternalVideoMontage.g:6391:1: ( '{' )
            // InternalVideoMontage.g:6392:2: '{'
            {
             before(grammarAccess.getTextArea_ImplAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalVideoMontage.g:6401:1: rule__TextArea_Impl__Group__2 : rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3 ;
    public final void rule__TextArea_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6405:1: ( rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3 )
            // InternalVideoMontage.g:6406:2: rule__TextArea_Impl__Group__2__Impl rule__TextArea_Impl__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:6413:1: rule__TextArea_Impl__Group__2__Impl : ( ( rule__TextArea_Impl__Group_2__0 )? ) ;
    public final void rule__TextArea_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6417:1: ( ( ( rule__TextArea_Impl__Group_2__0 )? ) )
            // InternalVideoMontage.g:6418:1: ( ( rule__TextArea_Impl__Group_2__0 )? )
            {
            // InternalVideoMontage.g:6418:1: ( ( rule__TextArea_Impl__Group_2__0 )? )
            // InternalVideoMontage.g:6419:2: ( rule__TextArea_Impl__Group_2__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_2()); 
            // InternalVideoMontage.g:6420:2: ( rule__TextArea_Impl__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==55) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalVideoMontage.g:6420:3: rule__TextArea_Impl__Group_2__0
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
    // InternalVideoMontage.g:6428:1: rule__TextArea_Impl__Group__3 : rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4 ;
    public final void rule__TextArea_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6432:1: ( rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4 )
            // InternalVideoMontage.g:6433:2: rule__TextArea_Impl__Group__3__Impl rule__TextArea_Impl__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:6440:1: rule__TextArea_Impl__Group__3__Impl : ( ( rule__TextArea_Impl__Group_3__0 )? ) ;
    public final void rule__TextArea_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6444:1: ( ( ( rule__TextArea_Impl__Group_3__0 )? ) )
            // InternalVideoMontage.g:6445:1: ( ( rule__TextArea_Impl__Group_3__0 )? )
            {
            // InternalVideoMontage.g:6445:1: ( ( rule__TextArea_Impl__Group_3__0 )? )
            // InternalVideoMontage.g:6446:2: ( rule__TextArea_Impl__Group_3__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_3()); 
            // InternalVideoMontage.g:6447:2: ( rule__TextArea_Impl__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==56) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalVideoMontage.g:6447:3: rule__TextArea_Impl__Group_3__0
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
    // InternalVideoMontage.g:6455:1: rule__TextArea_Impl__Group__4 : rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5 ;
    public final void rule__TextArea_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6459:1: ( rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5 )
            // InternalVideoMontage.g:6460:2: rule__TextArea_Impl__Group__4__Impl rule__TextArea_Impl__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:6467:1: rule__TextArea_Impl__Group__4__Impl : ( ( rule__TextArea_Impl__Group_4__0 )? ) ;
    public final void rule__TextArea_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6471:1: ( ( ( rule__TextArea_Impl__Group_4__0 )? ) )
            // InternalVideoMontage.g:6472:1: ( ( rule__TextArea_Impl__Group_4__0 )? )
            {
            // InternalVideoMontage.g:6472:1: ( ( rule__TextArea_Impl__Group_4__0 )? )
            // InternalVideoMontage.g:6473:2: ( rule__TextArea_Impl__Group_4__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_4()); 
            // InternalVideoMontage.g:6474:2: ( rule__TextArea_Impl__Group_4__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==57) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalVideoMontage.g:6474:3: rule__TextArea_Impl__Group_4__0
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
    // InternalVideoMontage.g:6482:1: rule__TextArea_Impl__Group__5 : rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6 ;
    public final void rule__TextArea_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6486:1: ( rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6 )
            // InternalVideoMontage.g:6487:2: rule__TextArea_Impl__Group__5__Impl rule__TextArea_Impl__Group__6
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:6494:1: rule__TextArea_Impl__Group__5__Impl : ( ( rule__TextArea_Impl__Group_5__0 )? ) ;
    public final void rule__TextArea_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6498:1: ( ( ( rule__TextArea_Impl__Group_5__0 )? ) )
            // InternalVideoMontage.g:6499:1: ( ( rule__TextArea_Impl__Group_5__0 )? )
            {
            // InternalVideoMontage.g:6499:1: ( ( rule__TextArea_Impl__Group_5__0 )? )
            // InternalVideoMontage.g:6500:2: ( rule__TextArea_Impl__Group_5__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_5()); 
            // InternalVideoMontage.g:6501:2: ( rule__TextArea_Impl__Group_5__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==58) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalVideoMontage.g:6501:3: rule__TextArea_Impl__Group_5__0
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
    // InternalVideoMontage.g:6509:1: rule__TextArea_Impl__Group__6 : rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7 ;
    public final void rule__TextArea_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6513:1: ( rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7 )
            // InternalVideoMontage.g:6514:2: rule__TextArea_Impl__Group__6__Impl rule__TextArea_Impl__Group__7
            {
            pushFollow(FOLLOW_42);
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
    // InternalVideoMontage.g:6521:1: rule__TextArea_Impl__Group__6__Impl : ( ( rule__TextArea_Impl__Group_6__0 )? ) ;
    public final void rule__TextArea_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6525:1: ( ( ( rule__TextArea_Impl__Group_6__0 )? ) )
            // InternalVideoMontage.g:6526:1: ( ( rule__TextArea_Impl__Group_6__0 )? )
            {
            // InternalVideoMontage.g:6526:1: ( ( rule__TextArea_Impl__Group_6__0 )? )
            // InternalVideoMontage.g:6527:2: ( rule__TextArea_Impl__Group_6__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_6()); 
            // InternalVideoMontage.g:6528:2: ( rule__TextArea_Impl__Group_6__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==59) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalVideoMontage.g:6528:3: rule__TextArea_Impl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextArea_Impl__Group_6__0();

                    state._fsp--;


                    }
                    break;

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
    // InternalVideoMontage.g:6536:1: rule__TextArea_Impl__Group__7 : rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8 ;
    public final void rule__TextArea_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6540:1: ( rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8 )
            // InternalVideoMontage.g:6541:2: rule__TextArea_Impl__Group__7__Impl rule__TextArea_Impl__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:6548:1: rule__TextArea_Impl__Group__7__Impl : ( 'font' ) ;
    public final void rule__TextArea_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6552:1: ( ( 'font' ) )
            // InternalVideoMontage.g:6553:1: ( 'font' )
            {
            // InternalVideoMontage.g:6553:1: ( 'font' )
            // InternalVideoMontage.g:6554:2: 'font'
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontKeyword_7()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getFontKeyword_7()); 

            }


            }

        }
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
    // InternalVideoMontage.g:6563:1: rule__TextArea_Impl__Group__8 : rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9 ;
    public final void rule__TextArea_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6567:1: ( rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9 )
            // InternalVideoMontage.g:6568:2: rule__TextArea_Impl__Group__8__Impl rule__TextArea_Impl__Group__9
            {
            pushFollow(FOLLOW_43);
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
    // InternalVideoMontage.g:6575:1: rule__TextArea_Impl__Group__8__Impl : ( ( rule__TextArea_Impl__FontAssignment_8 ) ) ;
    public final void rule__TextArea_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6579:1: ( ( ( rule__TextArea_Impl__FontAssignment_8 ) ) )
            // InternalVideoMontage.g:6580:1: ( ( rule__TextArea_Impl__FontAssignment_8 ) )
            {
            // InternalVideoMontage.g:6580:1: ( ( rule__TextArea_Impl__FontAssignment_8 ) )
            // InternalVideoMontage.g:6581:2: ( rule__TextArea_Impl__FontAssignment_8 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontAssignment_8()); 
            // InternalVideoMontage.g:6582:2: ( rule__TextArea_Impl__FontAssignment_8 )
            // InternalVideoMontage.g:6582:3: rule__TextArea_Impl__FontAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__FontAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getFontAssignment_8()); 

            }


            }

        }
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
    // InternalVideoMontage.g:6590:1: rule__TextArea_Impl__Group__9 : rule__TextArea_Impl__Group__9__Impl rule__TextArea_Impl__Group__10 ;
    public final void rule__TextArea_Impl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6594:1: ( rule__TextArea_Impl__Group__9__Impl rule__TextArea_Impl__Group__10 )
            // InternalVideoMontage.g:6595:2: rule__TextArea_Impl__Group__9__Impl rule__TextArea_Impl__Group__10
            {
            pushFollow(FOLLOW_43);
            rule__TextArea_Impl__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__10();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:6602:1: rule__TextArea_Impl__Group__9__Impl : ( ( rule__TextArea_Impl__Group_9__0 )? ) ;
    public final void rule__TextArea_Impl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6606:1: ( ( ( rule__TextArea_Impl__Group_9__0 )? ) )
            // InternalVideoMontage.g:6607:1: ( ( rule__TextArea_Impl__Group_9__0 )? )
            {
            // InternalVideoMontage.g:6607:1: ( ( rule__TextArea_Impl__Group_9__0 )? )
            // InternalVideoMontage.g:6608:2: ( rule__TextArea_Impl__Group_9__0 )?
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_9()); 
            // InternalVideoMontage.g:6609:2: ( rule__TextArea_Impl__Group_9__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==60) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalVideoMontage.g:6609:3: rule__TextArea_Impl__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TextArea_Impl__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextArea_ImplAccess().getGroup_9()); 

            }


            }

        }
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


    // $ANTLR start "rule__TextArea_Impl__Group__10"
    // InternalVideoMontage.g:6617:1: rule__TextArea_Impl__Group__10 : rule__TextArea_Impl__Group__10__Impl ;
    public final void rule__TextArea_Impl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6621:1: ( rule__TextArea_Impl__Group__10__Impl )
            // InternalVideoMontage.g:6622:2: rule__TextArea_Impl__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__10"


    // $ANTLR start "rule__TextArea_Impl__Group__10__Impl"
    // InternalVideoMontage.g:6628:1: rule__TextArea_Impl__Group__10__Impl : ( '}' ) ;
    public final void rule__TextArea_Impl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6632:1: ( ( '}' ) )
            // InternalVideoMontage.g:6633:1: ( '}' )
            {
            // InternalVideoMontage.g:6633:1: ( '}' )
            // InternalVideoMontage.g:6634:2: '}'
            {
             before(grammarAccess.getTextArea_ImplAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group__10__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_2__0"
    // InternalVideoMontage.g:6644:1: rule__TextArea_Impl__Group_2__0 : rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1 ;
    public final void rule__TextArea_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6648:1: ( rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1 )
            // InternalVideoMontage.g:6649:2: rule__TextArea_Impl__Group_2__0__Impl rule__TextArea_Impl__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:6656:1: rule__TextArea_Impl__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__TextArea_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6660:1: ( ( 'x' ) )
            // InternalVideoMontage.g:6661:1: ( 'x' )
            {
            // InternalVideoMontage.g:6661:1: ( 'x' )
            // InternalVideoMontage.g:6662:2: 'x'
            {
             before(grammarAccess.getTextArea_ImplAccess().getXKeyword_2_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalVideoMontage.g:6671:1: rule__TextArea_Impl__Group_2__1 : rule__TextArea_Impl__Group_2__1__Impl ;
    public final void rule__TextArea_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6675:1: ( rule__TextArea_Impl__Group_2__1__Impl )
            // InternalVideoMontage.g:6676:2: rule__TextArea_Impl__Group_2__1__Impl
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
    // InternalVideoMontage.g:6682:1: rule__TextArea_Impl__Group_2__1__Impl : ( ( rule__TextArea_Impl__XAssignment_2_1 ) ) ;
    public final void rule__TextArea_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6686:1: ( ( ( rule__TextArea_Impl__XAssignment_2_1 ) ) )
            // InternalVideoMontage.g:6687:1: ( ( rule__TextArea_Impl__XAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:6687:1: ( ( rule__TextArea_Impl__XAssignment_2_1 ) )
            // InternalVideoMontage.g:6688:2: ( rule__TextArea_Impl__XAssignment_2_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getXAssignment_2_1()); 
            // InternalVideoMontage.g:6689:2: ( rule__TextArea_Impl__XAssignment_2_1 )
            // InternalVideoMontage.g:6689:3: rule__TextArea_Impl__XAssignment_2_1
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
    // InternalVideoMontage.g:6698:1: rule__TextArea_Impl__Group_3__0 : rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1 ;
    public final void rule__TextArea_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6702:1: ( rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1 )
            // InternalVideoMontage.g:6703:2: rule__TextArea_Impl__Group_3__0__Impl rule__TextArea_Impl__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:6710:1: rule__TextArea_Impl__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__TextArea_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6714:1: ( ( 'y' ) )
            // InternalVideoMontage.g:6715:1: ( 'y' )
            {
            // InternalVideoMontage.g:6715:1: ( 'y' )
            // InternalVideoMontage.g:6716:2: 'y'
            {
             before(grammarAccess.getTextArea_ImplAccess().getYKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVideoMontage.g:6725:1: rule__TextArea_Impl__Group_3__1 : rule__TextArea_Impl__Group_3__1__Impl ;
    public final void rule__TextArea_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6729:1: ( rule__TextArea_Impl__Group_3__1__Impl )
            // InternalVideoMontage.g:6730:2: rule__TextArea_Impl__Group_3__1__Impl
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
    // InternalVideoMontage.g:6736:1: rule__TextArea_Impl__Group_3__1__Impl : ( ( rule__TextArea_Impl__YAssignment_3_1 ) ) ;
    public final void rule__TextArea_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6740:1: ( ( ( rule__TextArea_Impl__YAssignment_3_1 ) ) )
            // InternalVideoMontage.g:6741:1: ( ( rule__TextArea_Impl__YAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:6741:1: ( ( rule__TextArea_Impl__YAssignment_3_1 ) )
            // InternalVideoMontage.g:6742:2: ( rule__TextArea_Impl__YAssignment_3_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getYAssignment_3_1()); 
            // InternalVideoMontage.g:6743:2: ( rule__TextArea_Impl__YAssignment_3_1 )
            // InternalVideoMontage.g:6743:3: rule__TextArea_Impl__YAssignment_3_1
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
    // InternalVideoMontage.g:6752:1: rule__TextArea_Impl__Group_4__0 : rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1 ;
    public final void rule__TextArea_Impl__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6756:1: ( rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1 )
            // InternalVideoMontage.g:6757:2: rule__TextArea_Impl__Group_4__0__Impl rule__TextArea_Impl__Group_4__1
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
    // InternalVideoMontage.g:6764:1: rule__TextArea_Impl__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__TextArea_Impl__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6768:1: ( ( 'width' ) )
            // InternalVideoMontage.g:6769:1: ( 'width' )
            {
            // InternalVideoMontage.g:6769:1: ( 'width' )
            // InternalVideoMontage.g:6770:2: 'width'
            {
             before(grammarAccess.getTextArea_ImplAccess().getWidthKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalVideoMontage.g:6779:1: rule__TextArea_Impl__Group_4__1 : rule__TextArea_Impl__Group_4__1__Impl ;
    public final void rule__TextArea_Impl__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6783:1: ( rule__TextArea_Impl__Group_4__1__Impl )
            // InternalVideoMontage.g:6784:2: rule__TextArea_Impl__Group_4__1__Impl
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
    // InternalVideoMontage.g:6790:1: rule__TextArea_Impl__Group_4__1__Impl : ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) ) ;
    public final void rule__TextArea_Impl__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6794:1: ( ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) ) )
            // InternalVideoMontage.g:6795:1: ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:6795:1: ( ( rule__TextArea_Impl__WidthAssignment_4_1 ) )
            // InternalVideoMontage.g:6796:2: ( rule__TextArea_Impl__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getWidthAssignment_4_1()); 
            // InternalVideoMontage.g:6797:2: ( rule__TextArea_Impl__WidthAssignment_4_1 )
            // InternalVideoMontage.g:6797:3: rule__TextArea_Impl__WidthAssignment_4_1
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
    // InternalVideoMontage.g:6806:1: rule__TextArea_Impl__Group_5__0 : rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1 ;
    public final void rule__TextArea_Impl__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6810:1: ( rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1 )
            // InternalVideoMontage.g:6811:2: rule__TextArea_Impl__Group_5__0__Impl rule__TextArea_Impl__Group_5__1
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
    // InternalVideoMontage.g:6818:1: rule__TextArea_Impl__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__TextArea_Impl__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6822:1: ( ( 'height' ) )
            // InternalVideoMontage.g:6823:1: ( 'height' )
            {
            // InternalVideoMontage.g:6823:1: ( 'height' )
            // InternalVideoMontage.g:6824:2: 'height'
            {
             before(grammarAccess.getTextArea_ImplAccess().getHeightKeyword_5_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalVideoMontage.g:6833:1: rule__TextArea_Impl__Group_5__1 : rule__TextArea_Impl__Group_5__1__Impl ;
    public final void rule__TextArea_Impl__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6837:1: ( rule__TextArea_Impl__Group_5__1__Impl )
            // InternalVideoMontage.g:6838:2: rule__TextArea_Impl__Group_5__1__Impl
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
    // InternalVideoMontage.g:6844:1: rule__TextArea_Impl__Group_5__1__Impl : ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) ) ;
    public final void rule__TextArea_Impl__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6848:1: ( ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) ) )
            // InternalVideoMontage.g:6849:1: ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) )
            {
            // InternalVideoMontage.g:6849:1: ( ( rule__TextArea_Impl__HeightAssignment_5_1 ) )
            // InternalVideoMontage.g:6850:2: ( rule__TextArea_Impl__HeightAssignment_5_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getHeightAssignment_5_1()); 
            // InternalVideoMontage.g:6851:2: ( rule__TextArea_Impl__HeightAssignment_5_1 )
            // InternalVideoMontage.g:6851:3: rule__TextArea_Impl__HeightAssignment_5_1
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
    // InternalVideoMontage.g:6860:1: rule__TextArea_Impl__Group_6__0 : rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1 ;
    public final void rule__TextArea_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6864:1: ( rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1 )
            // InternalVideoMontage.g:6865:2: rule__TextArea_Impl__Group_6__0__Impl rule__TextArea_Impl__Group_6__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:6872:1: rule__TextArea_Impl__Group_6__0__Impl : ( 'text' ) ;
    public final void rule__TextArea_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6876:1: ( ( 'text' ) )
            // InternalVideoMontage.g:6877:1: ( 'text' )
            {
            // InternalVideoMontage.g:6877:1: ( 'text' )
            // InternalVideoMontage.g:6878:2: 'text'
            {
             before(grammarAccess.getTextArea_ImplAccess().getTextKeyword_6_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalVideoMontage.g:6887:1: rule__TextArea_Impl__Group_6__1 : rule__TextArea_Impl__Group_6__1__Impl ;
    public final void rule__TextArea_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6891:1: ( rule__TextArea_Impl__Group_6__1__Impl )
            // InternalVideoMontage.g:6892:2: rule__TextArea_Impl__Group_6__1__Impl
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
    // InternalVideoMontage.g:6898:1: rule__TextArea_Impl__Group_6__1__Impl : ( ( rule__TextArea_Impl__TextAssignment_6_1 ) ) ;
    public final void rule__TextArea_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6902:1: ( ( ( rule__TextArea_Impl__TextAssignment_6_1 ) ) )
            // InternalVideoMontage.g:6903:1: ( ( rule__TextArea_Impl__TextAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:6903:1: ( ( rule__TextArea_Impl__TextAssignment_6_1 ) )
            // InternalVideoMontage.g:6904:2: ( rule__TextArea_Impl__TextAssignment_6_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getTextAssignment_6_1()); 
            // InternalVideoMontage.g:6905:2: ( rule__TextArea_Impl__TextAssignment_6_1 )
            // InternalVideoMontage.g:6905:3: rule__TextArea_Impl__TextAssignment_6_1
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


    // $ANTLR start "rule__TextArea_Impl__Group_9__0"
    // InternalVideoMontage.g:6914:1: rule__TextArea_Impl__Group_9__0 : rule__TextArea_Impl__Group_9__0__Impl rule__TextArea_Impl__Group_9__1 ;
    public final void rule__TextArea_Impl__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6918:1: ( rule__TextArea_Impl__Group_9__0__Impl rule__TextArea_Impl__Group_9__1 )
            // InternalVideoMontage.g:6919:2: rule__TextArea_Impl__Group_9__0__Impl rule__TextArea_Impl__Group_9__1
            {
            pushFollow(FOLLOW_3);
            rule__TextArea_Impl__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9__0"


    // $ANTLR start "rule__TextArea_Impl__Group_9__0__Impl"
    // InternalVideoMontage.g:6926:1: rule__TextArea_Impl__Group_9__0__Impl : ( 'animation' ) ;
    public final void rule__TextArea_Impl__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6930:1: ( ( 'animation' ) )
            // InternalVideoMontage.g:6931:1: ( 'animation' )
            {
            // InternalVideoMontage.g:6931:1: ( 'animation' )
            // InternalVideoMontage.g:6932:2: 'animation'
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationKeyword_9_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getAnimationKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9__0__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_9__1"
    // InternalVideoMontage.g:6941:1: rule__TextArea_Impl__Group_9__1 : rule__TextArea_Impl__Group_9__1__Impl rule__TextArea_Impl__Group_9__2 ;
    public final void rule__TextArea_Impl__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6945:1: ( rule__TextArea_Impl__Group_9__1__Impl rule__TextArea_Impl__Group_9__2 )
            // InternalVideoMontage.g:6946:2: rule__TextArea_Impl__Group_9__1__Impl rule__TextArea_Impl__Group_9__2
            {
            pushFollow(FOLLOW_44);
            rule__TextArea_Impl__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9__1"


    // $ANTLR start "rule__TextArea_Impl__Group_9__1__Impl"
    // InternalVideoMontage.g:6953:1: rule__TextArea_Impl__Group_9__1__Impl : ( '{' ) ;
    public final void rule__TextArea_Impl__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6957:1: ( ( '{' ) )
            // InternalVideoMontage.g:6958:1: ( '{' )
            {
            // InternalVideoMontage.g:6958:1: ( '{' )
            // InternalVideoMontage.g:6959:2: '{'
            {
             before(grammarAccess.getTextArea_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9__1__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_9__2"
    // InternalVideoMontage.g:6968:1: rule__TextArea_Impl__Group_9__2 : rule__TextArea_Impl__Group_9__2__Impl rule__TextArea_Impl__Group_9__3 ;
    public final void rule__TextArea_Impl__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6972:1: ( rule__TextArea_Impl__Group_9__2__Impl rule__TextArea_Impl__Group_9__3 )
            // InternalVideoMontage.g:6973:2: rule__TextArea_Impl__Group_9__2__Impl rule__TextArea_Impl__Group_9__3
            {
            pushFollow(FOLLOW_6);
            rule__TextArea_Impl__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9__2"


    // $ANTLR start "rule__TextArea_Impl__Group_9__2__Impl"
    // InternalVideoMontage.g:6980:1: rule__TextArea_Impl__Group_9__2__Impl : ( ( rule__TextArea_Impl__AnimationAssignment_9_2 ) ) ;
    public final void rule__TextArea_Impl__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6984:1: ( ( ( rule__TextArea_Impl__AnimationAssignment_9_2 ) ) )
            // InternalVideoMontage.g:6985:1: ( ( rule__TextArea_Impl__AnimationAssignment_9_2 ) )
            {
            // InternalVideoMontage.g:6985:1: ( ( rule__TextArea_Impl__AnimationAssignment_9_2 ) )
            // InternalVideoMontage.g:6986:2: ( rule__TextArea_Impl__AnimationAssignment_9_2 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_9_2()); 
            // InternalVideoMontage.g:6987:2: ( rule__TextArea_Impl__AnimationAssignment_9_2 )
            // InternalVideoMontage.g:6987:3: rule__TextArea_Impl__AnimationAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__AnimationAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9__2__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_9__3"
    // InternalVideoMontage.g:6995:1: rule__TextArea_Impl__Group_9__3 : rule__TextArea_Impl__Group_9__3__Impl rule__TextArea_Impl__Group_9__4 ;
    public final void rule__TextArea_Impl__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:6999:1: ( rule__TextArea_Impl__Group_9__3__Impl rule__TextArea_Impl__Group_9__4 )
            // InternalVideoMontage.g:7000:2: rule__TextArea_Impl__Group_9__3__Impl rule__TextArea_Impl__Group_9__4
            {
            pushFollow(FOLLOW_6);
            rule__TextArea_Impl__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9__3"


    // $ANTLR start "rule__TextArea_Impl__Group_9__3__Impl"
    // InternalVideoMontage.g:7007:1: rule__TextArea_Impl__Group_9__3__Impl : ( ( rule__TextArea_Impl__Group_9_3__0 )* ) ;
    public final void rule__TextArea_Impl__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7011:1: ( ( ( rule__TextArea_Impl__Group_9_3__0 )* ) )
            // InternalVideoMontage.g:7012:1: ( ( rule__TextArea_Impl__Group_9_3__0 )* )
            {
            // InternalVideoMontage.g:7012:1: ( ( rule__TextArea_Impl__Group_9_3__0 )* )
            // InternalVideoMontage.g:7013:2: ( rule__TextArea_Impl__Group_9_3__0 )*
            {
             before(grammarAccess.getTextArea_ImplAccess().getGroup_9_3()); 
            // InternalVideoMontage.g:7014:2: ( rule__TextArea_Impl__Group_9_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==23) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalVideoMontage.g:7014:3: rule__TextArea_Impl__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TextArea_Impl__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getTextArea_ImplAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9__3__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_9__4"
    // InternalVideoMontage.g:7022:1: rule__TextArea_Impl__Group_9__4 : rule__TextArea_Impl__Group_9__4__Impl ;
    public final void rule__TextArea_Impl__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7026:1: ( rule__TextArea_Impl__Group_9__4__Impl )
            // InternalVideoMontage.g:7027:2: rule__TextArea_Impl__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9__4"


    // $ANTLR start "rule__TextArea_Impl__Group_9__4__Impl"
    // InternalVideoMontage.g:7033:1: rule__TextArea_Impl__Group_9__4__Impl : ( '}' ) ;
    public final void rule__TextArea_Impl__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7037:1: ( ( '}' ) )
            // InternalVideoMontage.g:7038:1: ( '}' )
            {
            // InternalVideoMontage.g:7038:1: ( '}' )
            // InternalVideoMontage.g:7039:2: '}'
            {
             before(grammarAccess.getTextArea_ImplAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9__4__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_9_3__0"
    // InternalVideoMontage.g:7049:1: rule__TextArea_Impl__Group_9_3__0 : rule__TextArea_Impl__Group_9_3__0__Impl rule__TextArea_Impl__Group_9_3__1 ;
    public final void rule__TextArea_Impl__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7053:1: ( rule__TextArea_Impl__Group_9_3__0__Impl rule__TextArea_Impl__Group_9_3__1 )
            // InternalVideoMontage.g:7054:2: rule__TextArea_Impl__Group_9_3__0__Impl rule__TextArea_Impl__Group_9_3__1
            {
            pushFollow(FOLLOW_44);
            rule__TextArea_Impl__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9_3__0"


    // $ANTLR start "rule__TextArea_Impl__Group_9_3__0__Impl"
    // InternalVideoMontage.g:7061:1: rule__TextArea_Impl__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__TextArea_Impl__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7065:1: ( ( ',' ) )
            // InternalVideoMontage.g:7066:1: ( ',' )
            {
            // InternalVideoMontage.g:7066:1: ( ',' )
            // InternalVideoMontage.g:7067:2: ','
            {
             before(grammarAccess.getTextArea_ImplAccess().getCommaKeyword_9_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTextArea_ImplAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9_3__0__Impl"


    // $ANTLR start "rule__TextArea_Impl__Group_9_3__1"
    // InternalVideoMontage.g:7076:1: rule__TextArea_Impl__Group_9_3__1 : rule__TextArea_Impl__Group_9_3__1__Impl ;
    public final void rule__TextArea_Impl__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7080:1: ( rule__TextArea_Impl__Group_9_3__1__Impl )
            // InternalVideoMontage.g:7081:2: rule__TextArea_Impl__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9_3__1"


    // $ANTLR start "rule__TextArea_Impl__Group_9_3__1__Impl"
    // InternalVideoMontage.g:7087:1: rule__TextArea_Impl__Group_9_3__1__Impl : ( ( rule__TextArea_Impl__AnimationAssignment_9_3_1 ) ) ;
    public final void rule__TextArea_Impl__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7091:1: ( ( ( rule__TextArea_Impl__AnimationAssignment_9_3_1 ) ) )
            // InternalVideoMontage.g:7092:1: ( ( rule__TextArea_Impl__AnimationAssignment_9_3_1 ) )
            {
            // InternalVideoMontage.g:7092:1: ( ( rule__TextArea_Impl__AnimationAssignment_9_3_1 ) )
            // InternalVideoMontage.g:7093:2: ( rule__TextArea_Impl__AnimationAssignment_9_3_1 )
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_9_3_1()); 
            // InternalVideoMontage.g:7094:2: ( rule__TextArea_Impl__AnimationAssignment_9_3_1 )
            // InternalVideoMontage.g:7094:3: rule__TextArea_Impl__AnimationAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TextArea_Impl__AnimationAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextArea_ImplAccess().getAnimationAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__Group_9_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalVideoMontage.g:7103:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7107:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalVideoMontage.g:7108:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:7115:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7119:1: ( ( ( '-' )? ) )
            // InternalVideoMontage.g:7120:1: ( ( '-' )? )
            {
            // InternalVideoMontage.g:7120:1: ( ( '-' )? )
            // InternalVideoMontage.g:7121:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalVideoMontage.g:7122:2: ( '-' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==29) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalVideoMontage.g:7122:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalVideoMontage.g:7130:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7134:1: ( rule__EInt__Group__1__Impl )
            // InternalVideoMontage.g:7135:2: rule__EInt__Group__1__Impl
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
    // InternalVideoMontage.g:7141:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7145:1: ( ( RULE_INT ) )
            // InternalVideoMontage.g:7146:1: ( RULE_INT )
            {
            // InternalVideoMontage.g:7146:1: ( RULE_INT )
            // InternalVideoMontage.g:7147:2: RULE_INT
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


    // $ANTLR start "rule__TextAreaDynamic__Group__0"
    // InternalVideoMontage.g:7157:1: rule__TextAreaDynamic__Group__0 : rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1 ;
    public final void rule__TextAreaDynamic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7161:1: ( rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1 )
            // InternalVideoMontage.g:7162:2: rule__TextAreaDynamic__Group__0__Impl rule__TextAreaDynamic__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:7169:1: rule__TextAreaDynamic__Group__0__Impl : ( 'TextAreaDynamic' ) ;
    public final void rule__TextAreaDynamic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7173:1: ( ( 'TextAreaDynamic' ) )
            // InternalVideoMontage.g:7174:1: ( 'TextAreaDynamic' )
            {
            // InternalVideoMontage.g:7174:1: ( 'TextAreaDynamic' )
            // InternalVideoMontage.g:7175:2: 'TextAreaDynamic'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextAreaDynamicKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalVideoMontage.g:7184:1: rule__TextAreaDynamic__Group__1 : rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2 ;
    public final void rule__TextAreaDynamic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7188:1: ( rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2 )
            // InternalVideoMontage.g:7189:2: rule__TextAreaDynamic__Group__1__Impl rule__TextAreaDynamic__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:7196:1: rule__TextAreaDynamic__Group__1__Impl : ( '{' ) ;
    public final void rule__TextAreaDynamic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7200:1: ( ( '{' ) )
            // InternalVideoMontage.g:7201:1: ( '{' )
            {
            // InternalVideoMontage.g:7201:1: ( '{' )
            // InternalVideoMontage.g:7202:2: '{'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalVideoMontage.g:7211:1: rule__TextAreaDynamic__Group__2 : rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3 ;
    public final void rule__TextAreaDynamic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7215:1: ( rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3 )
            // InternalVideoMontage.g:7216:2: rule__TextAreaDynamic__Group__2__Impl rule__TextAreaDynamic__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:7223:1: rule__TextAreaDynamic__Group__2__Impl : ( ( rule__TextAreaDynamic__Group_2__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7227:1: ( ( ( rule__TextAreaDynamic__Group_2__0 )? ) )
            // InternalVideoMontage.g:7228:1: ( ( rule__TextAreaDynamic__Group_2__0 )? )
            {
            // InternalVideoMontage.g:7228:1: ( ( rule__TextAreaDynamic__Group_2__0 )? )
            // InternalVideoMontage.g:7229:2: ( rule__TextAreaDynamic__Group_2__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_2()); 
            // InternalVideoMontage.g:7230:2: ( rule__TextAreaDynamic__Group_2__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalVideoMontage.g:7230:3: rule__TextAreaDynamic__Group_2__0
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
    // InternalVideoMontage.g:7238:1: rule__TextAreaDynamic__Group__3 : rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4 ;
    public final void rule__TextAreaDynamic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7242:1: ( rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4 )
            // InternalVideoMontage.g:7243:2: rule__TextAreaDynamic__Group__3__Impl rule__TextAreaDynamic__Group__4
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:7250:1: rule__TextAreaDynamic__Group__3__Impl : ( ( rule__TextAreaDynamic__Group_3__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7254:1: ( ( ( rule__TextAreaDynamic__Group_3__0 )? ) )
            // InternalVideoMontage.g:7255:1: ( ( rule__TextAreaDynamic__Group_3__0 )? )
            {
            // InternalVideoMontage.g:7255:1: ( ( rule__TextAreaDynamic__Group_3__0 )? )
            // InternalVideoMontage.g:7256:2: ( rule__TextAreaDynamic__Group_3__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_3()); 
            // InternalVideoMontage.g:7257:2: ( rule__TextAreaDynamic__Group_3__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==56) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalVideoMontage.g:7257:3: rule__TextAreaDynamic__Group_3__0
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
    // InternalVideoMontage.g:7265:1: rule__TextAreaDynamic__Group__4 : rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5 ;
    public final void rule__TextAreaDynamic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7269:1: ( rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5 )
            // InternalVideoMontage.g:7270:2: rule__TextAreaDynamic__Group__4__Impl rule__TextAreaDynamic__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:7277:1: rule__TextAreaDynamic__Group__4__Impl : ( ( rule__TextAreaDynamic__Group_4__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7281:1: ( ( ( rule__TextAreaDynamic__Group_4__0 )? ) )
            // InternalVideoMontage.g:7282:1: ( ( rule__TextAreaDynamic__Group_4__0 )? )
            {
            // InternalVideoMontage.g:7282:1: ( ( rule__TextAreaDynamic__Group_4__0 )? )
            // InternalVideoMontage.g:7283:2: ( rule__TextAreaDynamic__Group_4__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_4()); 
            // InternalVideoMontage.g:7284:2: ( rule__TextAreaDynamic__Group_4__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==57) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalVideoMontage.g:7284:3: rule__TextAreaDynamic__Group_4__0
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
    // InternalVideoMontage.g:7292:1: rule__TextAreaDynamic__Group__5 : rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6 ;
    public final void rule__TextAreaDynamic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7296:1: ( rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6 )
            // InternalVideoMontage.g:7297:2: rule__TextAreaDynamic__Group__5__Impl rule__TextAreaDynamic__Group__6
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:7304:1: rule__TextAreaDynamic__Group__5__Impl : ( ( rule__TextAreaDynamic__Group_5__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7308:1: ( ( ( rule__TextAreaDynamic__Group_5__0 )? ) )
            // InternalVideoMontage.g:7309:1: ( ( rule__TextAreaDynamic__Group_5__0 )? )
            {
            // InternalVideoMontage.g:7309:1: ( ( rule__TextAreaDynamic__Group_5__0 )? )
            // InternalVideoMontage.g:7310:2: ( rule__TextAreaDynamic__Group_5__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_5()); 
            // InternalVideoMontage.g:7311:2: ( rule__TextAreaDynamic__Group_5__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==58) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalVideoMontage.g:7311:3: rule__TextAreaDynamic__Group_5__0
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
    // InternalVideoMontage.g:7319:1: rule__TextAreaDynamic__Group__6 : rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7 ;
    public final void rule__TextAreaDynamic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7323:1: ( rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7 )
            // InternalVideoMontage.g:7324:2: rule__TextAreaDynamic__Group__6__Impl rule__TextAreaDynamic__Group__7
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:7331:1: rule__TextAreaDynamic__Group__6__Impl : ( ( rule__TextAreaDynamic__Group_6__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7335:1: ( ( ( rule__TextAreaDynamic__Group_6__0 )? ) )
            // InternalVideoMontage.g:7336:1: ( ( rule__TextAreaDynamic__Group_6__0 )? )
            {
            // InternalVideoMontage.g:7336:1: ( ( rule__TextAreaDynamic__Group_6__0 )? )
            // InternalVideoMontage.g:7337:2: ( rule__TextAreaDynamic__Group_6__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_6()); 
            // InternalVideoMontage.g:7338:2: ( rule__TextAreaDynamic__Group_6__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==59) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalVideoMontage.g:7338:3: rule__TextAreaDynamic__Group_6__0
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
    // InternalVideoMontage.g:7346:1: rule__TextAreaDynamic__Group__7 : rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8 ;
    public final void rule__TextAreaDynamic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7350:1: ( rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8 )
            // InternalVideoMontage.g:7351:2: rule__TextAreaDynamic__Group__7__Impl rule__TextAreaDynamic__Group__8
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:7358:1: rule__TextAreaDynamic__Group__7__Impl : ( ( rule__TextAreaDynamic__Group_7__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7362:1: ( ( ( rule__TextAreaDynamic__Group_7__0 )? ) )
            // InternalVideoMontage.g:7363:1: ( ( rule__TextAreaDynamic__Group_7__0 )? )
            {
            // InternalVideoMontage.g:7363:1: ( ( rule__TextAreaDynamic__Group_7__0 )? )
            // InternalVideoMontage.g:7364:2: ( rule__TextAreaDynamic__Group_7__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_7()); 
            // InternalVideoMontage.g:7365:2: ( rule__TextAreaDynamic__Group_7__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==62) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalVideoMontage.g:7365:3: rule__TextAreaDynamic__Group_7__0
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
    // InternalVideoMontage.g:7373:1: rule__TextAreaDynamic__Group__8 : rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9 ;
    public final void rule__TextAreaDynamic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7377:1: ( rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9 )
            // InternalVideoMontage.g:7378:2: rule__TextAreaDynamic__Group__8__Impl rule__TextAreaDynamic__Group__9
            {
            pushFollow(FOLLOW_45);
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
    // InternalVideoMontage.g:7385:1: rule__TextAreaDynamic__Group__8__Impl : ( ( rule__TextAreaDynamic__Group_8__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7389:1: ( ( ( rule__TextAreaDynamic__Group_8__0 )? ) )
            // InternalVideoMontage.g:7390:1: ( ( rule__TextAreaDynamic__Group_8__0 )? )
            {
            // InternalVideoMontage.g:7390:1: ( ( rule__TextAreaDynamic__Group_8__0 )? )
            // InternalVideoMontage.g:7391:2: ( rule__TextAreaDynamic__Group_8__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_8()); 
            // InternalVideoMontage.g:7392:2: ( rule__TextAreaDynamic__Group_8__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==63) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalVideoMontage.g:7392:3: rule__TextAreaDynamic__Group_8__0
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
    // InternalVideoMontage.g:7400:1: rule__TextAreaDynamic__Group__9 : rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10 ;
    public final void rule__TextAreaDynamic__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7404:1: ( rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10 )
            // InternalVideoMontage.g:7405:2: rule__TextAreaDynamic__Group__9__Impl rule__TextAreaDynamic__Group__10
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:7412:1: rule__TextAreaDynamic__Group__9__Impl : ( 'font' ) ;
    public final void rule__TextAreaDynamic__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7416:1: ( ( 'font' ) )
            // InternalVideoMontage.g:7417:1: ( 'font' )
            {
            // InternalVideoMontage.g:7417:1: ( 'font' )
            // InternalVideoMontage.g:7418:2: 'font'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontKeyword_9()); 
            match(input,54,FOLLOW_2); 
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
    // InternalVideoMontage.g:7427:1: rule__TextAreaDynamic__Group__10 : rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11 ;
    public final void rule__TextAreaDynamic__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7431:1: ( rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11 )
            // InternalVideoMontage.g:7432:2: rule__TextAreaDynamic__Group__10__Impl rule__TextAreaDynamic__Group__11
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
    // InternalVideoMontage.g:7439:1: rule__TextAreaDynamic__Group__10__Impl : ( ( rule__TextAreaDynamic__FontAssignment_10 ) ) ;
    public final void rule__TextAreaDynamic__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7443:1: ( ( ( rule__TextAreaDynamic__FontAssignment_10 ) ) )
            // InternalVideoMontage.g:7444:1: ( ( rule__TextAreaDynamic__FontAssignment_10 ) )
            {
            // InternalVideoMontage.g:7444:1: ( ( rule__TextAreaDynamic__FontAssignment_10 ) )
            // InternalVideoMontage.g:7445:2: ( rule__TextAreaDynamic__FontAssignment_10 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontAssignment_10()); 
            // InternalVideoMontage.g:7446:2: ( rule__TextAreaDynamic__FontAssignment_10 )
            // InternalVideoMontage.g:7446:3: rule__TextAreaDynamic__FontAssignment_10
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
    // InternalVideoMontage.g:7454:1: rule__TextAreaDynamic__Group__11 : rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12 ;
    public final void rule__TextAreaDynamic__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7458:1: ( rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12 )
            // InternalVideoMontage.g:7459:2: rule__TextAreaDynamic__Group__11__Impl rule__TextAreaDynamic__Group__12
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
    // InternalVideoMontage.g:7466:1: rule__TextAreaDynamic__Group__11__Impl : ( ( rule__TextAreaDynamic__Group_11__0 )? ) ;
    public final void rule__TextAreaDynamic__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7470:1: ( ( ( rule__TextAreaDynamic__Group_11__0 )? ) )
            // InternalVideoMontage.g:7471:1: ( ( rule__TextAreaDynamic__Group_11__0 )? )
            {
            // InternalVideoMontage.g:7471:1: ( ( rule__TextAreaDynamic__Group_11__0 )? )
            // InternalVideoMontage.g:7472:2: ( rule__TextAreaDynamic__Group_11__0 )?
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_11()); 
            // InternalVideoMontage.g:7473:2: ( rule__TextAreaDynamic__Group_11__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==60) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalVideoMontage.g:7473:3: rule__TextAreaDynamic__Group_11__0
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
    // InternalVideoMontage.g:7481:1: rule__TextAreaDynamic__Group__12 : rule__TextAreaDynamic__Group__12__Impl ;
    public final void rule__TextAreaDynamic__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7485:1: ( rule__TextAreaDynamic__Group__12__Impl )
            // InternalVideoMontage.g:7486:2: rule__TextAreaDynamic__Group__12__Impl
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
    // InternalVideoMontage.g:7492:1: rule__TextAreaDynamic__Group__12__Impl : ( '}' ) ;
    public final void rule__TextAreaDynamic__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7496:1: ( ( '}' ) )
            // InternalVideoMontage.g:7497:1: ( '}' )
            {
            // InternalVideoMontage.g:7497:1: ( '}' )
            // InternalVideoMontage.g:7498:2: '}'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getRightCurlyBracketKeyword_12()); 
            match(input,19,FOLLOW_2); 
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
    // InternalVideoMontage.g:7508:1: rule__TextAreaDynamic__Group_2__0 : rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1 ;
    public final void rule__TextAreaDynamic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7512:1: ( rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1 )
            // InternalVideoMontage.g:7513:2: rule__TextAreaDynamic__Group_2__0__Impl rule__TextAreaDynamic__Group_2__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:7520:1: rule__TextAreaDynamic__Group_2__0__Impl : ( 'x' ) ;
    public final void rule__TextAreaDynamic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7524:1: ( ( 'x' ) )
            // InternalVideoMontage.g:7525:1: ( 'x' )
            {
            // InternalVideoMontage.g:7525:1: ( 'x' )
            // InternalVideoMontage.g:7526:2: 'x'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getXKeyword_2_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalVideoMontage.g:7535:1: rule__TextAreaDynamic__Group_2__1 : rule__TextAreaDynamic__Group_2__1__Impl ;
    public final void rule__TextAreaDynamic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7539:1: ( rule__TextAreaDynamic__Group_2__1__Impl )
            // InternalVideoMontage.g:7540:2: rule__TextAreaDynamic__Group_2__1__Impl
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
    // InternalVideoMontage.g:7546:1: rule__TextAreaDynamic__Group_2__1__Impl : ( ( rule__TextAreaDynamic__XAssignment_2_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7550:1: ( ( ( rule__TextAreaDynamic__XAssignment_2_1 ) ) )
            // InternalVideoMontage.g:7551:1: ( ( rule__TextAreaDynamic__XAssignment_2_1 ) )
            {
            // InternalVideoMontage.g:7551:1: ( ( rule__TextAreaDynamic__XAssignment_2_1 ) )
            // InternalVideoMontage.g:7552:2: ( rule__TextAreaDynamic__XAssignment_2_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getXAssignment_2_1()); 
            // InternalVideoMontage.g:7553:2: ( rule__TextAreaDynamic__XAssignment_2_1 )
            // InternalVideoMontage.g:7553:3: rule__TextAreaDynamic__XAssignment_2_1
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
    // InternalVideoMontage.g:7562:1: rule__TextAreaDynamic__Group_3__0 : rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1 ;
    public final void rule__TextAreaDynamic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7566:1: ( rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1 )
            // InternalVideoMontage.g:7567:2: rule__TextAreaDynamic__Group_3__0__Impl rule__TextAreaDynamic__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:7574:1: rule__TextAreaDynamic__Group_3__0__Impl : ( 'y' ) ;
    public final void rule__TextAreaDynamic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7578:1: ( ( 'y' ) )
            // InternalVideoMontage.g:7579:1: ( 'y' )
            {
            // InternalVideoMontage.g:7579:1: ( 'y' )
            // InternalVideoMontage.g:7580:2: 'y'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getYKeyword_3_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalVideoMontage.g:7589:1: rule__TextAreaDynamic__Group_3__1 : rule__TextAreaDynamic__Group_3__1__Impl ;
    public final void rule__TextAreaDynamic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7593:1: ( rule__TextAreaDynamic__Group_3__1__Impl )
            // InternalVideoMontage.g:7594:2: rule__TextAreaDynamic__Group_3__1__Impl
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
    // InternalVideoMontage.g:7600:1: rule__TextAreaDynamic__Group_3__1__Impl : ( ( rule__TextAreaDynamic__YAssignment_3_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7604:1: ( ( ( rule__TextAreaDynamic__YAssignment_3_1 ) ) )
            // InternalVideoMontage.g:7605:1: ( ( rule__TextAreaDynamic__YAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:7605:1: ( ( rule__TextAreaDynamic__YAssignment_3_1 ) )
            // InternalVideoMontage.g:7606:2: ( rule__TextAreaDynamic__YAssignment_3_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getYAssignment_3_1()); 
            // InternalVideoMontage.g:7607:2: ( rule__TextAreaDynamic__YAssignment_3_1 )
            // InternalVideoMontage.g:7607:3: rule__TextAreaDynamic__YAssignment_3_1
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
    // InternalVideoMontage.g:7616:1: rule__TextAreaDynamic__Group_4__0 : rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1 ;
    public final void rule__TextAreaDynamic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7620:1: ( rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1 )
            // InternalVideoMontage.g:7621:2: rule__TextAreaDynamic__Group_4__0__Impl rule__TextAreaDynamic__Group_4__1
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
    // InternalVideoMontage.g:7628:1: rule__TextAreaDynamic__Group_4__0__Impl : ( 'width' ) ;
    public final void rule__TextAreaDynamic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7632:1: ( ( 'width' ) )
            // InternalVideoMontage.g:7633:1: ( 'width' )
            {
            // InternalVideoMontage.g:7633:1: ( 'width' )
            // InternalVideoMontage.g:7634:2: 'width'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getWidthKeyword_4_0()); 
            match(input,57,FOLLOW_2); 
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
    // InternalVideoMontage.g:7643:1: rule__TextAreaDynamic__Group_4__1 : rule__TextAreaDynamic__Group_4__1__Impl ;
    public final void rule__TextAreaDynamic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7647:1: ( rule__TextAreaDynamic__Group_4__1__Impl )
            // InternalVideoMontage.g:7648:2: rule__TextAreaDynamic__Group_4__1__Impl
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
    // InternalVideoMontage.g:7654:1: rule__TextAreaDynamic__Group_4__1__Impl : ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7658:1: ( ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) ) )
            // InternalVideoMontage.g:7659:1: ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) )
            {
            // InternalVideoMontage.g:7659:1: ( ( rule__TextAreaDynamic__WidthAssignment_4_1 ) )
            // InternalVideoMontage.g:7660:2: ( rule__TextAreaDynamic__WidthAssignment_4_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getWidthAssignment_4_1()); 
            // InternalVideoMontage.g:7661:2: ( rule__TextAreaDynamic__WidthAssignment_4_1 )
            // InternalVideoMontage.g:7661:3: rule__TextAreaDynamic__WidthAssignment_4_1
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
    // InternalVideoMontage.g:7670:1: rule__TextAreaDynamic__Group_5__0 : rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1 ;
    public final void rule__TextAreaDynamic__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7674:1: ( rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1 )
            // InternalVideoMontage.g:7675:2: rule__TextAreaDynamic__Group_5__0__Impl rule__TextAreaDynamic__Group_5__1
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
    // InternalVideoMontage.g:7682:1: rule__TextAreaDynamic__Group_5__0__Impl : ( 'height' ) ;
    public final void rule__TextAreaDynamic__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7686:1: ( ( 'height' ) )
            // InternalVideoMontage.g:7687:1: ( 'height' )
            {
            // InternalVideoMontage.g:7687:1: ( 'height' )
            // InternalVideoMontage.g:7688:2: 'height'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getHeightKeyword_5_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalVideoMontage.g:7697:1: rule__TextAreaDynamic__Group_5__1 : rule__TextAreaDynamic__Group_5__1__Impl ;
    public final void rule__TextAreaDynamic__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7701:1: ( rule__TextAreaDynamic__Group_5__1__Impl )
            // InternalVideoMontage.g:7702:2: rule__TextAreaDynamic__Group_5__1__Impl
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
    // InternalVideoMontage.g:7708:1: rule__TextAreaDynamic__Group_5__1__Impl : ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7712:1: ( ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) ) )
            // InternalVideoMontage.g:7713:1: ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) )
            {
            // InternalVideoMontage.g:7713:1: ( ( rule__TextAreaDynamic__HeightAssignment_5_1 ) )
            // InternalVideoMontage.g:7714:2: ( rule__TextAreaDynamic__HeightAssignment_5_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getHeightAssignment_5_1()); 
            // InternalVideoMontage.g:7715:2: ( rule__TextAreaDynamic__HeightAssignment_5_1 )
            // InternalVideoMontage.g:7715:3: rule__TextAreaDynamic__HeightAssignment_5_1
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
    // InternalVideoMontage.g:7724:1: rule__TextAreaDynamic__Group_6__0 : rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1 ;
    public final void rule__TextAreaDynamic__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7728:1: ( rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1 )
            // InternalVideoMontage.g:7729:2: rule__TextAreaDynamic__Group_6__0__Impl rule__TextAreaDynamic__Group_6__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:7736:1: rule__TextAreaDynamic__Group_6__0__Impl : ( 'text' ) ;
    public final void rule__TextAreaDynamic__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7740:1: ( ( 'text' ) )
            // InternalVideoMontage.g:7741:1: ( 'text' )
            {
            // InternalVideoMontage.g:7741:1: ( 'text' )
            // InternalVideoMontage.g:7742:2: 'text'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextKeyword_6_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalVideoMontage.g:7751:1: rule__TextAreaDynamic__Group_6__1 : rule__TextAreaDynamic__Group_6__1__Impl ;
    public final void rule__TextAreaDynamic__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7755:1: ( rule__TextAreaDynamic__Group_6__1__Impl )
            // InternalVideoMontage.g:7756:2: rule__TextAreaDynamic__Group_6__1__Impl
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
    // InternalVideoMontage.g:7762:1: rule__TextAreaDynamic__Group_6__1__Impl : ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7766:1: ( ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) ) )
            // InternalVideoMontage.g:7767:1: ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) )
            {
            // InternalVideoMontage.g:7767:1: ( ( rule__TextAreaDynamic__TextAssignment_6_1 ) )
            // InternalVideoMontage.g:7768:2: ( rule__TextAreaDynamic__TextAssignment_6_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextAssignment_6_1()); 
            // InternalVideoMontage.g:7769:2: ( rule__TextAreaDynamic__TextAssignment_6_1 )
            // InternalVideoMontage.g:7769:3: rule__TextAreaDynamic__TextAssignment_6_1
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
    // InternalVideoMontage.g:7778:1: rule__TextAreaDynamic__Group_7__0 : rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1 ;
    public final void rule__TextAreaDynamic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7782:1: ( rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1 )
            // InternalVideoMontage.g:7783:2: rule__TextAreaDynamic__Group_7__0__Impl rule__TextAreaDynamic__Group_7__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalVideoMontage.g:7790:1: rule__TextAreaDynamic__Group_7__0__Impl : ( 'textSrc' ) ;
    public final void rule__TextAreaDynamic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7794:1: ( ( 'textSrc' ) )
            // InternalVideoMontage.g:7795:1: ( 'textSrc' )
            {
            // InternalVideoMontage.g:7795:1: ( 'textSrc' )
            // InternalVideoMontage.g:7796:2: 'textSrc'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextSrcKeyword_7_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalVideoMontage.g:7805:1: rule__TextAreaDynamic__Group_7__1 : rule__TextAreaDynamic__Group_7__1__Impl ;
    public final void rule__TextAreaDynamic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7809:1: ( rule__TextAreaDynamic__Group_7__1__Impl )
            // InternalVideoMontage.g:7810:2: rule__TextAreaDynamic__Group_7__1__Impl
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
    // InternalVideoMontage.g:7816:1: rule__TextAreaDynamic__Group_7__1__Impl : ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7820:1: ( ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) ) )
            // InternalVideoMontage.g:7821:1: ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) )
            {
            // InternalVideoMontage.g:7821:1: ( ( rule__TextAreaDynamic__TextSrcAssignment_7_1 ) )
            // InternalVideoMontage.g:7822:2: ( rule__TextAreaDynamic__TextSrcAssignment_7_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getTextSrcAssignment_7_1()); 
            // InternalVideoMontage.g:7823:2: ( rule__TextAreaDynamic__TextSrcAssignment_7_1 )
            // InternalVideoMontage.g:7823:3: rule__TextAreaDynamic__TextSrcAssignment_7_1
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
    // InternalVideoMontage.g:7832:1: rule__TextAreaDynamic__Group_8__0 : rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1 ;
    public final void rule__TextAreaDynamic__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7836:1: ( rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1 )
            // InternalVideoMontage.g:7837:2: rule__TextAreaDynamic__Group_8__0__Impl rule__TextAreaDynamic__Group_8__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalVideoMontage.g:7844:1: rule__TextAreaDynamic__Group_8__0__Impl : ( 'line' ) ;
    public final void rule__TextAreaDynamic__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7848:1: ( ( 'line' ) )
            // InternalVideoMontage.g:7849:1: ( 'line' )
            {
            // InternalVideoMontage.g:7849:1: ( 'line' )
            // InternalVideoMontage.g:7850:2: 'line'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getLineKeyword_8_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalVideoMontage.g:7859:1: rule__TextAreaDynamic__Group_8__1 : rule__TextAreaDynamic__Group_8__1__Impl ;
    public final void rule__TextAreaDynamic__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7863:1: ( rule__TextAreaDynamic__Group_8__1__Impl )
            // InternalVideoMontage.g:7864:2: rule__TextAreaDynamic__Group_8__1__Impl
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
    // InternalVideoMontage.g:7870:1: rule__TextAreaDynamic__Group_8__1__Impl : ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7874:1: ( ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) ) )
            // InternalVideoMontage.g:7875:1: ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) )
            {
            // InternalVideoMontage.g:7875:1: ( ( rule__TextAreaDynamic__LineAssignment_8_1 ) )
            // InternalVideoMontage.g:7876:2: ( rule__TextAreaDynamic__LineAssignment_8_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getLineAssignment_8_1()); 
            // InternalVideoMontage.g:7877:2: ( rule__TextAreaDynamic__LineAssignment_8_1 )
            // InternalVideoMontage.g:7877:3: rule__TextAreaDynamic__LineAssignment_8_1
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
    // InternalVideoMontage.g:7886:1: rule__TextAreaDynamic__Group_11__0 : rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1 ;
    public final void rule__TextAreaDynamic__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7890:1: ( rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1 )
            // InternalVideoMontage.g:7891:2: rule__TextAreaDynamic__Group_11__0__Impl rule__TextAreaDynamic__Group_11__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:7898:1: rule__TextAreaDynamic__Group_11__0__Impl : ( 'animation' ) ;
    public final void rule__TextAreaDynamic__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7902:1: ( ( 'animation' ) )
            // InternalVideoMontage.g:7903:1: ( 'animation' )
            {
            // InternalVideoMontage.g:7903:1: ( 'animation' )
            // InternalVideoMontage.g:7904:2: 'animation'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationKeyword_11_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalVideoMontage.g:7913:1: rule__TextAreaDynamic__Group_11__1 : rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2 ;
    public final void rule__TextAreaDynamic__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7917:1: ( rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2 )
            // InternalVideoMontage.g:7918:2: rule__TextAreaDynamic__Group_11__1__Impl rule__TextAreaDynamic__Group_11__2
            {
            pushFollow(FOLLOW_44);
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
    // InternalVideoMontage.g:7925:1: rule__TextAreaDynamic__Group_11__1__Impl : ( '{' ) ;
    public final void rule__TextAreaDynamic__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7929:1: ( ( '{' ) )
            // InternalVideoMontage.g:7930:1: ( '{' )
            {
            // InternalVideoMontage.g:7930:1: ( '{' )
            // InternalVideoMontage.g:7931:2: '{'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getLeftCurlyBracketKeyword_11_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getLeftCurlyBracketKeyword_11_1()); 

            }


            }

        }
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
    // InternalVideoMontage.g:7940:1: rule__TextAreaDynamic__Group_11__2 : rule__TextAreaDynamic__Group_11__2__Impl rule__TextAreaDynamic__Group_11__3 ;
    public final void rule__TextAreaDynamic__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7944:1: ( rule__TextAreaDynamic__Group_11__2__Impl rule__TextAreaDynamic__Group_11__3 )
            // InternalVideoMontage.g:7945:2: rule__TextAreaDynamic__Group_11__2__Impl rule__TextAreaDynamic__Group_11__3
            {
            pushFollow(FOLLOW_6);
            rule__TextAreaDynamic__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_11__3();

            state._fsp--;


            }

        }
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
    // InternalVideoMontage.g:7952:1: rule__TextAreaDynamic__Group_11__2__Impl : ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 ) ) ;
    public final void rule__TextAreaDynamic__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7956:1: ( ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 ) ) )
            // InternalVideoMontage.g:7957:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 ) )
            {
            // InternalVideoMontage.g:7957:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_2 ) )
            // InternalVideoMontage.g:7958:2: ( rule__TextAreaDynamic__AnimationAssignment_11_2 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_2()); 
            // InternalVideoMontage.g:7959:2: ( rule__TextAreaDynamic__AnimationAssignment_11_2 )
            // InternalVideoMontage.g:7959:3: rule__TextAreaDynamic__AnimationAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__AnimationAssignment_11_2();

            state._fsp--;


            }

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


    // $ANTLR start "rule__TextAreaDynamic__Group_11__3"
    // InternalVideoMontage.g:7967:1: rule__TextAreaDynamic__Group_11__3 : rule__TextAreaDynamic__Group_11__3__Impl rule__TextAreaDynamic__Group_11__4 ;
    public final void rule__TextAreaDynamic__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7971:1: ( rule__TextAreaDynamic__Group_11__3__Impl rule__TextAreaDynamic__Group_11__4 )
            // InternalVideoMontage.g:7972:2: rule__TextAreaDynamic__Group_11__3__Impl rule__TextAreaDynamic__Group_11__4
            {
            pushFollow(FOLLOW_6);
            rule__TextAreaDynamic__Group_11__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_11__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11__3"


    // $ANTLR start "rule__TextAreaDynamic__Group_11__3__Impl"
    // InternalVideoMontage.g:7979:1: rule__TextAreaDynamic__Group_11__3__Impl : ( ( rule__TextAreaDynamic__Group_11_3__0 )* ) ;
    public final void rule__TextAreaDynamic__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7983:1: ( ( ( rule__TextAreaDynamic__Group_11_3__0 )* ) )
            // InternalVideoMontage.g:7984:1: ( ( rule__TextAreaDynamic__Group_11_3__0 )* )
            {
            // InternalVideoMontage.g:7984:1: ( ( rule__TextAreaDynamic__Group_11_3__0 )* )
            // InternalVideoMontage.g:7985:2: ( rule__TextAreaDynamic__Group_11_3__0 )*
            {
             before(grammarAccess.getTextAreaDynamicAccess().getGroup_11_3()); 
            // InternalVideoMontage.g:7986:2: ( rule__TextAreaDynamic__Group_11_3__0 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==23) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalVideoMontage.g:7986:3: rule__TextAreaDynamic__Group_11_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TextAreaDynamic__Group_11_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getTextAreaDynamicAccess().getGroup_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11__3__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_11__4"
    // InternalVideoMontage.g:7994:1: rule__TextAreaDynamic__Group_11__4 : rule__TextAreaDynamic__Group_11__4__Impl ;
    public final void rule__TextAreaDynamic__Group_11__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:7998:1: ( rule__TextAreaDynamic__Group_11__4__Impl )
            // InternalVideoMontage.g:7999:2: rule__TextAreaDynamic__Group_11__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_11__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11__4"


    // $ANTLR start "rule__TextAreaDynamic__Group_11__4__Impl"
    // InternalVideoMontage.g:8005:1: rule__TextAreaDynamic__Group_11__4__Impl : ( '}' ) ;
    public final void rule__TextAreaDynamic__Group_11__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8009:1: ( ( '}' ) )
            // InternalVideoMontage.g:8010:1: ( '}' )
            {
            // InternalVideoMontage.g:8010:1: ( '}' )
            // InternalVideoMontage.g:8011:2: '}'
            {
             before(grammarAccess.getTextAreaDynamicAccess().getRightCurlyBracketKeyword_11_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getRightCurlyBracketKeyword_11_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11__4__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_11_3__0"
    // InternalVideoMontage.g:8021:1: rule__TextAreaDynamic__Group_11_3__0 : rule__TextAreaDynamic__Group_11_3__0__Impl rule__TextAreaDynamic__Group_11_3__1 ;
    public final void rule__TextAreaDynamic__Group_11_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8025:1: ( rule__TextAreaDynamic__Group_11_3__0__Impl rule__TextAreaDynamic__Group_11_3__1 )
            // InternalVideoMontage.g:8026:2: rule__TextAreaDynamic__Group_11_3__0__Impl rule__TextAreaDynamic__Group_11_3__1
            {
            pushFollow(FOLLOW_44);
            rule__TextAreaDynamic__Group_11_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_11_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11_3__0"


    // $ANTLR start "rule__TextAreaDynamic__Group_11_3__0__Impl"
    // InternalVideoMontage.g:8033:1: rule__TextAreaDynamic__Group_11_3__0__Impl : ( ',' ) ;
    public final void rule__TextAreaDynamic__Group_11_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8037:1: ( ( ',' ) )
            // InternalVideoMontage.g:8038:1: ( ',' )
            {
            // InternalVideoMontage.g:8038:1: ( ',' )
            // InternalVideoMontage.g:8039:2: ','
            {
             before(grammarAccess.getTextAreaDynamicAccess().getCommaKeyword_11_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTextAreaDynamicAccess().getCommaKeyword_11_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11_3__0__Impl"


    // $ANTLR start "rule__TextAreaDynamic__Group_11_3__1"
    // InternalVideoMontage.g:8048:1: rule__TextAreaDynamic__Group_11_3__1 : rule__TextAreaDynamic__Group_11_3__1__Impl ;
    public final void rule__TextAreaDynamic__Group_11_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8052:1: ( rule__TextAreaDynamic__Group_11_3__1__Impl )
            // InternalVideoMontage.g:8053:2: rule__TextAreaDynamic__Group_11_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__Group_11_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11_3__1"


    // $ANTLR start "rule__TextAreaDynamic__Group_11_3__1__Impl"
    // InternalVideoMontage.g:8059:1: rule__TextAreaDynamic__Group_11_3__1__Impl : ( ( rule__TextAreaDynamic__AnimationAssignment_11_3_1 ) ) ;
    public final void rule__TextAreaDynamic__Group_11_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8063:1: ( ( ( rule__TextAreaDynamic__AnimationAssignment_11_3_1 ) ) )
            // InternalVideoMontage.g:8064:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_3_1 ) )
            {
            // InternalVideoMontage.g:8064:1: ( ( rule__TextAreaDynamic__AnimationAssignment_11_3_1 ) )
            // InternalVideoMontage.g:8065:2: ( rule__TextAreaDynamic__AnimationAssignment_11_3_1 )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_3_1()); 
            // InternalVideoMontage.g:8066:2: ( rule__TextAreaDynamic__AnimationAssignment_11_3_1 )
            // InternalVideoMontage.g:8066:3: rule__TextAreaDynamic__AnimationAssignment_11_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TextAreaDynamic__AnimationAssignment_11_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaDynamicAccess().getAnimationAssignment_11_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__Group_11_3__1__Impl"


    // $ANTLR start "rule__FadeIn__Group__0"
    // InternalVideoMontage.g:8075:1: rule__FadeIn__Group__0 : rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 ;
    public final void rule__FadeIn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8079:1: ( rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1 )
            // InternalVideoMontage.g:8080:2: rule__FadeIn__Group__0__Impl rule__FadeIn__Group__1
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
    // InternalVideoMontage.g:8087:1: rule__FadeIn__Group__0__Impl : ( () ) ;
    public final void rule__FadeIn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8091:1: ( ( () ) )
            // InternalVideoMontage.g:8092:1: ( () )
            {
            // InternalVideoMontage.g:8092:1: ( () )
            // InternalVideoMontage.g:8093:2: ()
            {
             before(grammarAccess.getFadeInAccess().getFadeInAction_0()); 
            // InternalVideoMontage.g:8094:2: ()
            // InternalVideoMontage.g:8094:3: 
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
    // InternalVideoMontage.g:8102:1: rule__FadeIn__Group__1 : rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 ;
    public final void rule__FadeIn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8106:1: ( rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2 )
            // InternalVideoMontage.g:8107:2: rule__FadeIn__Group__1__Impl rule__FadeIn__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:8114:1: rule__FadeIn__Group__1__Impl : ( 'FadeIn' ) ;
    public final void rule__FadeIn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8118:1: ( ( 'FadeIn' ) )
            // InternalVideoMontage.g:8119:1: ( 'FadeIn' )
            {
            // InternalVideoMontage.g:8119:1: ( 'FadeIn' )
            // InternalVideoMontage.g:8120:2: 'FadeIn'
            {
             before(grammarAccess.getFadeInAccess().getFadeInKeyword_1()); 
            match(input,64,FOLLOW_2); 
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
    // InternalVideoMontage.g:8129:1: rule__FadeIn__Group__2 : rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 ;
    public final void rule__FadeIn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8133:1: ( rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3 )
            // InternalVideoMontage.g:8134:2: rule__FadeIn__Group__2__Impl rule__FadeIn__Group__3
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
    // InternalVideoMontage.g:8141:1: rule__FadeIn__Group__2__Impl : ( '{' ) ;
    public final void rule__FadeIn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8145:1: ( ( '{' ) )
            // InternalVideoMontage.g:8146:1: ( '{' )
            {
            // InternalVideoMontage.g:8146:1: ( '{' )
            // InternalVideoMontage.g:8147:2: '{'
            {
             before(grammarAccess.getFadeInAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalVideoMontage.g:8156:1: rule__FadeIn__Group__3 : rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 ;
    public final void rule__FadeIn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8160:1: ( rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4 )
            // InternalVideoMontage.g:8161:2: rule__FadeIn__Group__3__Impl rule__FadeIn__Group__4
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
    // InternalVideoMontage.g:8168:1: rule__FadeIn__Group__3__Impl : ( ( rule__FadeIn__Group_3__0 )? ) ;
    public final void rule__FadeIn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8172:1: ( ( ( rule__FadeIn__Group_3__0 )? ) )
            // InternalVideoMontage.g:8173:1: ( ( rule__FadeIn__Group_3__0 )? )
            {
            // InternalVideoMontage.g:8173:1: ( ( rule__FadeIn__Group_3__0 )? )
            // InternalVideoMontage.g:8174:2: ( rule__FadeIn__Group_3__0 )?
            {
             before(grammarAccess.getFadeInAccess().getGroup_3()); 
            // InternalVideoMontage.g:8175:2: ( rule__FadeIn__Group_3__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==28) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalVideoMontage.g:8175:3: rule__FadeIn__Group_3__0
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
    // InternalVideoMontage.g:8183:1: rule__FadeIn__Group__4 : rule__FadeIn__Group__4__Impl ;
    public final void rule__FadeIn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8187:1: ( rule__FadeIn__Group__4__Impl )
            // InternalVideoMontage.g:8188:2: rule__FadeIn__Group__4__Impl
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
    // InternalVideoMontage.g:8194:1: rule__FadeIn__Group__4__Impl : ( '}' ) ;
    public final void rule__FadeIn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8198:1: ( ( '}' ) )
            // InternalVideoMontage.g:8199:1: ( '}' )
            {
            // InternalVideoMontage.g:8199:1: ( '}' )
            // InternalVideoMontage.g:8200:2: '}'
            {
             before(grammarAccess.getFadeInAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalVideoMontage.g:8210:1: rule__FadeIn__Group_3__0 : rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1 ;
    public final void rule__FadeIn__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8214:1: ( rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1 )
            // InternalVideoMontage.g:8215:2: rule__FadeIn__Group_3__0__Impl rule__FadeIn__Group_3__1
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
    // InternalVideoMontage.g:8222:1: rule__FadeIn__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__FadeIn__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8226:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:8227:1: ( 'duration' )
            {
            // InternalVideoMontage.g:8227:1: ( 'duration' )
            // InternalVideoMontage.g:8228:2: 'duration'
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
    // InternalVideoMontage.g:8237:1: rule__FadeIn__Group_3__1 : rule__FadeIn__Group_3__1__Impl ;
    public final void rule__FadeIn__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8241:1: ( rule__FadeIn__Group_3__1__Impl )
            // InternalVideoMontage.g:8242:2: rule__FadeIn__Group_3__1__Impl
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
    // InternalVideoMontage.g:8248:1: rule__FadeIn__Group_3__1__Impl : ( ( rule__FadeIn__DurationAssignment_3_1 ) ) ;
    public final void rule__FadeIn__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8252:1: ( ( ( rule__FadeIn__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:8253:1: ( ( rule__FadeIn__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:8253:1: ( ( rule__FadeIn__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:8254:2: ( rule__FadeIn__DurationAssignment_3_1 )
            {
             before(grammarAccess.getFadeInAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:8255:2: ( rule__FadeIn__DurationAssignment_3_1 )
            // InternalVideoMontage.g:8255:3: rule__FadeIn__DurationAssignment_3_1
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
    // InternalVideoMontage.g:8264:1: rule__FadeOut__Group__0 : rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 ;
    public final void rule__FadeOut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8268:1: ( rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1 )
            // InternalVideoMontage.g:8269:2: rule__FadeOut__Group__0__Impl rule__FadeOut__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalVideoMontage.g:8276:1: rule__FadeOut__Group__0__Impl : ( () ) ;
    public final void rule__FadeOut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8280:1: ( ( () ) )
            // InternalVideoMontage.g:8281:1: ( () )
            {
            // InternalVideoMontage.g:8281:1: ( () )
            // InternalVideoMontage.g:8282:2: ()
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutAction_0()); 
            // InternalVideoMontage.g:8283:2: ()
            // InternalVideoMontage.g:8283:3: 
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
    // InternalVideoMontage.g:8291:1: rule__FadeOut__Group__1 : rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 ;
    public final void rule__FadeOut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8295:1: ( rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2 )
            // InternalVideoMontage.g:8296:2: rule__FadeOut__Group__1__Impl rule__FadeOut__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalVideoMontage.g:8303:1: rule__FadeOut__Group__1__Impl : ( 'FadeOut' ) ;
    public final void rule__FadeOut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8307:1: ( ( 'FadeOut' ) )
            // InternalVideoMontage.g:8308:1: ( 'FadeOut' )
            {
            // InternalVideoMontage.g:8308:1: ( 'FadeOut' )
            // InternalVideoMontage.g:8309:2: 'FadeOut'
            {
             before(grammarAccess.getFadeOutAccess().getFadeOutKeyword_1()); 
            match(input,65,FOLLOW_2); 
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
    // InternalVideoMontage.g:8318:1: rule__FadeOut__Group__2 : rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 ;
    public final void rule__FadeOut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8322:1: ( rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3 )
            // InternalVideoMontage.g:8323:2: rule__FadeOut__Group__2__Impl rule__FadeOut__Group__3
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
    // InternalVideoMontage.g:8330:1: rule__FadeOut__Group__2__Impl : ( '{' ) ;
    public final void rule__FadeOut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8334:1: ( ( '{' ) )
            // InternalVideoMontage.g:8335:1: ( '{' )
            {
            // InternalVideoMontage.g:8335:1: ( '{' )
            // InternalVideoMontage.g:8336:2: '{'
            {
             before(grammarAccess.getFadeOutAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalVideoMontage.g:8345:1: rule__FadeOut__Group__3 : rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 ;
    public final void rule__FadeOut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8349:1: ( rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4 )
            // InternalVideoMontage.g:8350:2: rule__FadeOut__Group__3__Impl rule__FadeOut__Group__4
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
    // InternalVideoMontage.g:8357:1: rule__FadeOut__Group__3__Impl : ( ( rule__FadeOut__Group_3__0 )? ) ;
    public final void rule__FadeOut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8361:1: ( ( ( rule__FadeOut__Group_3__0 )? ) )
            // InternalVideoMontage.g:8362:1: ( ( rule__FadeOut__Group_3__0 )? )
            {
            // InternalVideoMontage.g:8362:1: ( ( rule__FadeOut__Group_3__0 )? )
            // InternalVideoMontage.g:8363:2: ( rule__FadeOut__Group_3__0 )?
            {
             before(grammarAccess.getFadeOutAccess().getGroup_3()); 
            // InternalVideoMontage.g:8364:2: ( rule__FadeOut__Group_3__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==28) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalVideoMontage.g:8364:3: rule__FadeOut__Group_3__0
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
    // InternalVideoMontage.g:8372:1: rule__FadeOut__Group__4 : rule__FadeOut__Group__4__Impl ;
    public final void rule__FadeOut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8376:1: ( rule__FadeOut__Group__4__Impl )
            // InternalVideoMontage.g:8377:2: rule__FadeOut__Group__4__Impl
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
    // InternalVideoMontage.g:8383:1: rule__FadeOut__Group__4__Impl : ( '}' ) ;
    public final void rule__FadeOut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8387:1: ( ( '}' ) )
            // InternalVideoMontage.g:8388:1: ( '}' )
            {
            // InternalVideoMontage.g:8388:1: ( '}' )
            // InternalVideoMontage.g:8389:2: '}'
            {
             before(grammarAccess.getFadeOutAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalVideoMontage.g:8399:1: rule__FadeOut__Group_3__0 : rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1 ;
    public final void rule__FadeOut__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8403:1: ( rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1 )
            // InternalVideoMontage.g:8404:2: rule__FadeOut__Group_3__0__Impl rule__FadeOut__Group_3__1
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
    // InternalVideoMontage.g:8411:1: rule__FadeOut__Group_3__0__Impl : ( 'duration' ) ;
    public final void rule__FadeOut__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8415:1: ( ( 'duration' ) )
            // InternalVideoMontage.g:8416:1: ( 'duration' )
            {
            // InternalVideoMontage.g:8416:1: ( 'duration' )
            // InternalVideoMontage.g:8417:2: 'duration'
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
    // InternalVideoMontage.g:8426:1: rule__FadeOut__Group_3__1 : rule__FadeOut__Group_3__1__Impl ;
    public final void rule__FadeOut__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8430:1: ( rule__FadeOut__Group_3__1__Impl )
            // InternalVideoMontage.g:8431:2: rule__FadeOut__Group_3__1__Impl
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
    // InternalVideoMontage.g:8437:1: rule__FadeOut__Group_3__1__Impl : ( ( rule__FadeOut__DurationAssignment_3_1 ) ) ;
    public final void rule__FadeOut__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8441:1: ( ( ( rule__FadeOut__DurationAssignment_3_1 ) ) )
            // InternalVideoMontage.g:8442:1: ( ( rule__FadeOut__DurationAssignment_3_1 ) )
            {
            // InternalVideoMontage.g:8442:1: ( ( rule__FadeOut__DurationAssignment_3_1 ) )
            // InternalVideoMontage.g:8443:2: ( rule__FadeOut__DurationAssignment_3_1 )
            {
             before(grammarAccess.getFadeOutAccess().getDurationAssignment_3_1()); 
            // InternalVideoMontage.g:8444:2: ( rule__FadeOut__DurationAssignment_3_1 )
            // InternalVideoMontage.g:8444:3: rule__FadeOut__DurationAssignment_3_1
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


    // $ANTLR start "rule__Movie__TitleAssignment_2_1"
    // InternalVideoMontage.g:8453:1: rule__Movie__TitleAssignment_2_1 : ( ruleEString ) ;
    public final void rule__Movie__TitleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8457:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:8458:2: ( ruleEString )
            {
            // InternalVideoMontage.g:8458:2: ( ruleEString )
            // InternalVideoMontage.g:8459:3: ruleEString
            {
             before(grammarAccess.getMovieAccess().getTitleEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getTitleEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__TitleAssignment_2_1"


    // $ANTLR start "rule__Movie__AudioelementAssignment_5"
    // InternalVideoMontage.g:8468:1: rule__Movie__AudioelementAssignment_5 : ( ruleAudioElement ) ;
    public final void rule__Movie__AudioelementAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8472:1: ( ( ruleAudioElement ) )
            // InternalVideoMontage.g:8473:2: ( ruleAudioElement )
            {
            // InternalVideoMontage.g:8473:2: ( ruleAudioElement )
            // InternalVideoMontage.g:8474:3: ruleAudioElement
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


    // $ANTLR start "rule__Movie__AudioelementAssignment_6_1"
    // InternalVideoMontage.g:8483:1: rule__Movie__AudioelementAssignment_6_1 : ( ruleAudioElement ) ;
    public final void rule__Movie__AudioelementAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8487:1: ( ( ruleAudioElement ) )
            // InternalVideoMontage.g:8488:2: ( ruleAudioElement )
            {
            // InternalVideoMontage.g:8488:2: ( ruleAudioElement )
            // InternalVideoMontage.g:8489:3: ruleAudioElement
            {
             before(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAudioElement();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__AudioelementAssignment_6_1"


    // $ANTLR start "rule__Movie__VideoelementAssignment_10"
    // InternalVideoMontage.g:8498:1: rule__Movie__VideoelementAssignment_10 : ( ruleVideoElement ) ;
    public final void rule__Movie__VideoelementAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8502:1: ( ( ruleVideoElement ) )
            // InternalVideoMontage.g:8503:2: ( ruleVideoElement )
            {
            // InternalVideoMontage.g:8503:2: ( ruleVideoElement )
            // InternalVideoMontage.g:8504:3: ruleVideoElement
            {
             before(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoElement();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__VideoelementAssignment_10"


    // $ANTLR start "rule__Movie__VideoelementAssignment_11_1"
    // InternalVideoMontage.g:8513:1: rule__Movie__VideoelementAssignment_11_1 : ( ruleVideoElement ) ;
    public final void rule__Movie__VideoelementAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8517:1: ( ( ruleVideoElement ) )
            // InternalVideoMontage.g:8518:2: ( ruleVideoElement )
            {
            // InternalVideoMontage.g:8518:2: ( ruleVideoElement )
            // InternalVideoMontage.g:8519:3: ruleVideoElement
            {
             before(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoElement();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__VideoelementAssignment_11_1"


    // $ANTLR start "rule__Movie__SubtitleAssignment_15"
    // InternalVideoMontage.g:8528:1: rule__Movie__SubtitleAssignment_15 : ( ruleSubtitle ) ;
    public final void rule__Movie__SubtitleAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8532:1: ( ( ruleSubtitle ) )
            // InternalVideoMontage.g:8533:2: ( ruleSubtitle )
            {
            // InternalVideoMontage.g:8533:2: ( ruleSubtitle )
            // InternalVideoMontage.g:8534:3: ruleSubtitle
            {
             before(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtitle();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__SubtitleAssignment_15"


    // $ANTLR start "rule__Movie__SubtitleAssignment_16_1"
    // InternalVideoMontage.g:8543:1: rule__Movie__SubtitleAssignment_16_1 : ( ruleSubtitle ) ;
    public final void rule__Movie__SubtitleAssignment_16_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8547:1: ( ( ruleSubtitle ) )
            // InternalVideoMontage.g:8548:2: ( ruleSubtitle )
            {
            // InternalVideoMontage.g:8548:2: ( ruleSubtitle )
            // InternalVideoMontage.g:8549:3: ruleSubtitle
            {
             before(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_16_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubtitle();

            state._fsp--;

             after(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_16_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Movie__SubtitleAssignment_16_1"


    // $ANTLR start "rule__Subtitle__DurationAssignment_2_1"
    // InternalVideoMontage.g:8558:1: rule__Subtitle__DurationAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__Subtitle__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8562:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:8563:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:8563:2: ( ruleEDouble )
            // InternalVideoMontage.g:8564:3: ruleEDouble
            {
             before(grammarAccess.getSubtitleAccess().getDurationEDoubleParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getDurationEDoubleParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__DurationAssignment_2_1"


    // $ANTLR start "rule__Subtitle__RelativemomentAssignment_5"
    // InternalVideoMontage.g:8573:1: rule__Subtitle__RelativemomentAssignment_5 : ( ruleRelativeMoment ) ;
    public final void rule__Subtitle__RelativemomentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8577:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:8578:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:8578:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:8579:3: ruleRelativeMoment
            {
             before(grammarAccess.getSubtitleAccess().getRelativemomentRelativeMomentParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getRelativemomentRelativeMomentParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__RelativemomentAssignment_5"


    // $ANTLR start "rule__Subtitle__RelativemomentAssignment_6_1"
    // InternalVideoMontage.g:8588:1: rule__Subtitle__RelativemomentAssignment_6_1 : ( ruleRelativeMoment ) ;
    public final void rule__Subtitle__RelativemomentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8592:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:8593:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:8593:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:8594:3: ruleRelativeMoment
            {
             before(grammarAccess.getSubtitleAccess().getRelativemomentRelativeMomentParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getRelativemomentRelativeMomentParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__RelativemomentAssignment_6_1"


    // $ANTLR start "rule__Subtitle__TextareaAssignment_9"
    // InternalVideoMontage.g:8603:1: rule__Subtitle__TextareaAssignment_9 : ( ruleTextArea ) ;
    public final void rule__Subtitle__TextareaAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8607:1: ( ( ruleTextArea ) )
            // InternalVideoMontage.g:8608:2: ( ruleTextArea )
            {
            // InternalVideoMontage.g:8608:2: ( ruleTextArea )
            // InternalVideoMontage.g:8609:3: ruleTextArea
            {
             before(grammarAccess.getSubtitleAccess().getTextareaTextAreaParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleTextArea();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getTextareaTextAreaParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__TextareaAssignment_9"


    // $ANTLR start "rule__Subtitle__StartingmomentAssignment_11"
    // InternalVideoMontage.g:8618:1: rule__Subtitle__StartingmomentAssignment_11 : ( ruleStartingMoment ) ;
    public final void rule__Subtitle__StartingmomentAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8622:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontage.g:8623:2: ( ruleStartingMoment )
            {
            // InternalVideoMontage.g:8623:2: ( ruleStartingMoment )
            // InternalVideoMontage.g:8624:3: ruleStartingMoment
            {
             before(grammarAccess.getSubtitleAccess().getStartingmomentStartingMomentParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleStartingMoment();

            state._fsp--;

             after(grammarAccess.getSubtitleAccess().getStartingmomentStartingMomentParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subtitle__StartingmomentAssignment_11"


    // $ANTLR start "rule__RelativeMoment__MomentAssignment_3_1"
    // InternalVideoMontage.g:8633:1: rule__RelativeMoment__MomentAssignment_3_1 : ( ruleMoment ) ;
    public final void rule__RelativeMoment__MomentAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8637:1: ( ( ruleMoment ) )
            // InternalVideoMontage.g:8638:2: ( ruleMoment )
            {
            // InternalVideoMontage.g:8638:2: ( ruleMoment )
            // InternalVideoMontage.g:8639:3: ruleMoment
            {
             before(grammarAccess.getRelativeMomentAccess().getMomentMomentEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMoment();

            state._fsp--;

             after(grammarAccess.getRelativeMomentAccess().getMomentMomentEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeMoment__MomentAssignment_3_1"


    // $ANTLR start "rule__RelativeMoment__ValueAssignment_4_1"
    // InternalVideoMontage.g:8648:1: rule__RelativeMoment__ValueAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__RelativeMoment__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8652:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:8653:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:8653:2: ( ruleEDouble )
            // InternalVideoMontage.g:8654:3: ruleEDouble
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


    // $ANTLR start "rule__Transition__DurationAssignment_2_1"
    // InternalVideoMontage.g:8663:1: rule__Transition__DurationAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__Transition__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8667:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:8668:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:8668:2: ( ruleEDouble )
            // InternalVideoMontage.g:8669:3: ruleEDouble
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
    // InternalVideoMontage.g:8678:1: rule__Transition__AudioelementAssignment_4 : ( ruleAudioElement ) ;
    public final void rule__Transition__AudioelementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8682:1: ( ( ruleAudioElement ) )
            // InternalVideoMontage.g:8683:2: ( ruleAudioElement )
            {
            // InternalVideoMontage.g:8683:2: ( ruleAudioElement )
            // InternalVideoMontage.g:8684:3: ruleAudioElement
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


    // $ANTLR start "rule__Audio__NameAssignment_1"
    // InternalVideoMontage.g:8693:1: rule__Audio__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Audio__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8697:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:8698:2: ( ruleEString )
            {
            // InternalVideoMontage.g:8698:2: ( ruleEString )
            // InternalVideoMontage.g:8699:3: ruleEString
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


    // $ANTLR start "rule__Audio__DurationAssignment_3_1"
    // InternalVideoMontage.g:8708:1: rule__Audio__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Audio__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8712:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:8713:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:8713:2: ( ruleEDouble )
            // InternalVideoMontage.g:8714:3: ruleEDouble
            {
             before(grammarAccess.getAudioAccess().getDurationEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getDurationEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__DurationAssignment_3_1"


    // $ANTLR start "rule__Audio__PathAssignment_4_1"
    // InternalVideoMontage.g:8723:1: rule__Audio__PathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Audio__PathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8727:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:8728:2: ( ruleEString )
            {
            // InternalVideoMontage.g:8728:2: ( ruleEString )
            // InternalVideoMontage.g:8729:3: ruleEString
            {
             before(grammarAccess.getAudioAccess().getPathEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getPathEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__PathAssignment_4_1"


    // $ANTLR start "rule__Audio__RelativemomentAssignment_7"
    // InternalVideoMontage.g:8738:1: rule__Audio__RelativemomentAssignment_7 : ( ruleRelativeMoment ) ;
    public final void rule__Audio__RelativemomentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8742:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:8743:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:8743:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:8744:3: ruleRelativeMoment
            {
             before(grammarAccess.getAudioAccess().getRelativemomentRelativeMomentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getRelativemomentRelativeMomentParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__RelativemomentAssignment_7"


    // $ANTLR start "rule__Audio__RelativemomentAssignment_8_1"
    // InternalVideoMontage.g:8753:1: rule__Audio__RelativemomentAssignment_8_1 : ( ruleRelativeMoment ) ;
    public final void rule__Audio__RelativemomentAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8757:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:8758:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:8758:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:8759:3: ruleRelativeMoment
            {
             before(grammarAccess.getAudioAccess().getRelativemomentRelativeMomentParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getRelativemomentRelativeMomentParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__RelativemomentAssignment_8_1"


    // $ANTLR start "rule__Audio__TransitionAssignment_10_1"
    // InternalVideoMontage.g:8768:1: rule__Audio__TransitionAssignment_10_1 : ( ruleTransition ) ;
    public final void rule__Audio__TransitionAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8772:1: ( ( ruleTransition ) )
            // InternalVideoMontage.g:8773:2: ( ruleTransition )
            {
            // InternalVideoMontage.g:8773:2: ( ruleTransition )
            // InternalVideoMontage.g:8774:3: ruleTransition
            {
             before(grammarAccess.getAudioAccess().getTransitionTransitionParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getTransitionTransitionParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__TransitionAssignment_10_1"


    // $ANTLR start "rule__Audio__StartingmomentAssignment_12"
    // InternalVideoMontage.g:8783:1: rule__Audio__StartingmomentAssignment_12 : ( ruleStartingMoment ) ;
    public final void rule__Audio__StartingmomentAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8787:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontage.g:8788:2: ( ruleStartingMoment )
            {
            // InternalVideoMontage.g:8788:2: ( ruleStartingMoment )
            // InternalVideoMontage.g:8789:3: ruleStartingMoment
            {
             before(grammarAccess.getAudioAccess().getStartingmomentStartingMomentParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleStartingMoment();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getStartingmomentStartingMomentParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__StartingmomentAssignment_12"


    // $ANTLR start "rule__Audio__AudioclipAssignment_14"
    // InternalVideoMontage.g:8798:1: rule__Audio__AudioclipAssignment_14 : ( ruleAudioClip ) ;
    public final void rule__Audio__AudioclipAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8802:1: ( ( ruleAudioClip ) )
            // InternalVideoMontage.g:8803:2: ( ruleAudioClip )
            {
            // InternalVideoMontage.g:8803:2: ( ruleAudioClip )
            // InternalVideoMontage.g:8804:3: ruleAudioClip
            {
             before(grammarAccess.getAudioAccess().getAudioclipAudioClipParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleAudioClip();

            state._fsp--;

             after(grammarAccess.getAudioAccess().getAudioclipAudioClipParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__AudioclipAssignment_14"


    // $ANTLR start "rule__AudioClip__NameAssignment_1"
    // InternalVideoMontage.g:8813:1: rule__AudioClip__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__AudioClip__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8817:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:8818:2: ( ruleEString )
            {
            // InternalVideoMontage.g:8818:2: ( ruleEString )
            // InternalVideoMontage.g:8819:3: ruleEString
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


    // $ANTLR start "rule__AudioClip__DurationAssignment_3_1"
    // InternalVideoMontage.g:8828:1: rule__AudioClip__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8832:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:8833:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:8833:2: ( ruleEDouble )
            // InternalVideoMontage.g:8834:3: ruleEDouble
            {
             before(grammarAccess.getAudioClipAccess().getDurationEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getDurationEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__DurationAssignment_3_1"


    // $ANTLR start "rule__AudioClip__VolumeAssignment_4_1"
    // InternalVideoMontage.g:8843:1: rule__AudioClip__VolumeAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__VolumeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8847:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:8848:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:8848:2: ( ruleEDouble )
            // InternalVideoMontage.g:8849:3: ruleEDouble
            {
             before(grammarAccess.getAudioClipAccess().getVolumeEDoubleParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getVolumeEDoubleParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__VolumeAssignment_4_1"


    // $ANTLR start "rule__AudioClip__StartCutAssignment_5_1"
    // InternalVideoMontage.g:8858:1: rule__AudioClip__StartCutAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__StartCutAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8862:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:8863:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:8863:2: ( ruleEDouble )
            // InternalVideoMontage.g:8864:3: ruleEDouble
            {
             before(grammarAccess.getAudioClipAccess().getStartCutEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getStartCutEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__StartCutAssignment_5_1"


    // $ANTLR start "rule__AudioClip__EndCutAssignment_6_1"
    // InternalVideoMontage.g:8873:1: rule__AudioClip__EndCutAssignment_6_1 : ( ruleEDouble ) ;
    public final void rule__AudioClip__EndCutAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8877:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:8878:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:8878:2: ( ruleEDouble )
            // InternalVideoMontage.g:8879:3: ruleEDouble
            {
             before(grammarAccess.getAudioClipAccess().getEndCutEDoubleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getEndCutEDoubleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__EndCutAssignment_6_1"


    // $ANTLR start "rule__AudioClip__RelativemomentAssignment_9"
    // InternalVideoMontage.g:8888:1: rule__AudioClip__RelativemomentAssignment_9 : ( ruleRelativeMoment ) ;
    public final void rule__AudioClip__RelativemomentAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8892:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:8893:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:8893:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:8894:3: ruleRelativeMoment
            {
             before(grammarAccess.getAudioClipAccess().getRelativemomentRelativeMomentParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getRelativemomentRelativeMomentParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__RelativemomentAssignment_9"


    // $ANTLR start "rule__AudioClip__RelativemomentAssignment_10_1"
    // InternalVideoMontage.g:8903:1: rule__AudioClip__RelativemomentAssignment_10_1 : ( ruleRelativeMoment ) ;
    public final void rule__AudioClip__RelativemomentAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8907:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:8908:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:8908:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:8909:3: ruleRelativeMoment
            {
             before(grammarAccess.getAudioClipAccess().getRelativemomentRelativeMomentParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getRelativemomentRelativeMomentParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__RelativemomentAssignment_10_1"


    // $ANTLR start "rule__AudioClip__TransitionAssignment_12_1"
    // InternalVideoMontage.g:8918:1: rule__AudioClip__TransitionAssignment_12_1 : ( ruleTransition ) ;
    public final void rule__AudioClip__TransitionAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8922:1: ( ( ruleTransition ) )
            // InternalVideoMontage.g:8923:2: ( ruleTransition )
            {
            // InternalVideoMontage.g:8923:2: ( ruleTransition )
            // InternalVideoMontage.g:8924:3: ruleTransition
            {
             before(grammarAccess.getAudioClipAccess().getTransitionTransitionParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getTransitionTransitionParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__TransitionAssignment_12_1"


    // $ANTLR start "rule__AudioClip__StartingmomentAssignment_14"
    // InternalVideoMontage.g:8933:1: rule__AudioClip__StartingmomentAssignment_14 : ( ruleStartingMoment ) ;
    public final void rule__AudioClip__StartingmomentAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8937:1: ( ( ruleStartingMoment ) )
            // InternalVideoMontage.g:8938:2: ( ruleStartingMoment )
            {
            // InternalVideoMontage.g:8938:2: ( ruleStartingMoment )
            // InternalVideoMontage.g:8939:3: ruleStartingMoment
            {
             before(grammarAccess.getAudioClipAccess().getStartingmomentStartingMomentParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleStartingMoment();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getStartingmomentStartingMomentParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__StartingmomentAssignment_14"


    // $ANTLR start "rule__AudioClip__AudioAssignment_15_2"
    // InternalVideoMontage.g:8948:1: rule__AudioClip__AudioAssignment_15_2 : ( ruleAudio ) ;
    public final void rule__AudioClip__AudioAssignment_15_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8952:1: ( ( ruleAudio ) )
            // InternalVideoMontage.g:8953:2: ( ruleAudio )
            {
            // InternalVideoMontage.g:8953:2: ( ruleAudio )
            // InternalVideoMontage.g:8954:3: ruleAudio
            {
             before(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_15_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAudio();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_15_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__AudioAssignment_15_2"


    // $ANTLR start "rule__AudioClip__AudioAssignment_15_3_1"
    // InternalVideoMontage.g:8963:1: rule__AudioClip__AudioAssignment_15_3_1 : ( ruleAudio ) ;
    public final void rule__AudioClip__AudioAssignment_15_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8967:1: ( ( ruleAudio ) )
            // InternalVideoMontage.g:8968:2: ( ruleAudio )
            {
            // InternalVideoMontage.g:8968:2: ( ruleAudio )
            // InternalVideoMontage.g:8969:3: ruleAudio
            {
             before(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_15_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAudio();

            state._fsp--;

             after(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_15_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AudioClip__AudioAssignment_15_3_1"


    // $ANTLR start "rule__AbsoluteMoment__TimeAssignment_3_1"
    // InternalVideoMontage.g:8978:1: rule__AbsoluteMoment__TimeAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__AbsoluteMoment__TimeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8982:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:8983:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:8983:2: ( ruleEDouble )
            // InternalVideoMontage.g:8984:3: ruleEDouble
            {
             before(grammarAccess.getAbsoluteMomentAccess().getTimeEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getAbsoluteMomentAccess().getTimeEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbsoluteMoment__TimeAssignment_3_1"


    // $ANTLR start "rule__Title__DurationAssignment_2_1"
    // InternalVideoMontage.g:8993:1: rule__Title__DurationAssignment_2_1 : ( ruleEDouble ) ;
    public final void rule__Title__DurationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:8997:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:8998:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:8998:2: ( ruleEDouble )
            // InternalVideoMontage.g:8999:3: ruleEDouble
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
    // InternalVideoMontage.g:9008:1: rule__Title__BackgroundColorAssignment_3_1 : ( ruleColor ) ;
    public final void rule__Title__BackgroundColorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9012:1: ( ( ruleColor ) )
            // InternalVideoMontage.g:9013:2: ( ruleColor )
            {
            // InternalVideoMontage.g:9013:2: ( ruleColor )
            // InternalVideoMontage.g:9014:3: ruleColor
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


    // $ANTLR start "rule__Title__RelativemomentAssignment_6"
    // InternalVideoMontage.g:9023:1: rule__Title__RelativemomentAssignment_6 : ( ruleRelativeMoment ) ;
    public final void rule__Title__RelativemomentAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9027:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:9028:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:9028:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:9029:3: ruleRelativeMoment
            {
             before(grammarAccess.getTitleAccess().getRelativemomentRelativeMomentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getRelativemomentRelativeMomentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__RelativemomentAssignment_6"


    // $ANTLR start "rule__Title__RelativemomentAssignment_7_1"
    // InternalVideoMontage.g:9038:1: rule__Title__RelativemomentAssignment_7_1 : ( ruleRelativeMoment ) ;
    public final void rule__Title__RelativemomentAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9042:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:9043:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:9043:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:9044:3: ruleRelativeMoment
            {
             before(grammarAccess.getTitleAccess().getRelativemomentRelativeMomentParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getRelativemomentRelativeMomentParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__RelativemomentAssignment_7_1"


    // $ANTLR start "rule__Title__TextareaAssignment_10"
    // InternalVideoMontage.g:9053:1: rule__Title__TextareaAssignment_10 : ( ruleTextArea ) ;
    public final void rule__Title__TextareaAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9057:1: ( ( ruleTextArea ) )
            // InternalVideoMontage.g:9058:2: ( ruleTextArea )
            {
            // InternalVideoMontage.g:9058:2: ( ruleTextArea )
            // InternalVideoMontage.g:9059:3: ruleTextArea
            {
             before(grammarAccess.getTitleAccess().getTextareaTextAreaParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleTextArea();

            state._fsp--;

             after(grammarAccess.getTitleAccess().getTextareaTextAreaParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Title__TextareaAssignment_10"


    // $ANTLR start "rule__Clip__NameAssignment_1"
    // InternalVideoMontage.g:9068:1: rule__Clip__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Clip__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9072:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:9073:2: ( ruleEString )
            {
            // InternalVideoMontage.g:9073:2: ( ruleEString )
            // InternalVideoMontage.g:9074:3: ruleEString
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


    // $ANTLR start "rule__Clip__DurationAssignment_3_1"
    // InternalVideoMontage.g:9083:1: rule__Clip__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Clip__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9087:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:9088:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:9088:2: ( ruleEDouble )
            // InternalVideoMontage.g:9089:3: ruleEDouble
            {
             before(grammarAccess.getClipAccess().getDurationEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getClipAccess().getDurationEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__DurationAssignment_3_1"


    // $ANTLR start "rule__Clip__StartCutAssignment_4_1"
    // InternalVideoMontage.g:9098:1: rule__Clip__StartCutAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Clip__StartCutAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9102:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:9103:2: ( ruleEString )
            {
            // InternalVideoMontage.g:9103:2: ( ruleEString )
            // InternalVideoMontage.g:9104:3: ruleEString
            {
             before(grammarAccess.getClipAccess().getStartCutEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClipAccess().getStartCutEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__StartCutAssignment_4_1"


    // $ANTLR start "rule__Clip__EndCutAssignment_5_1"
    // InternalVideoMontage.g:9113:1: rule__Clip__EndCutAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Clip__EndCutAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9117:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:9118:2: ( ruleEString )
            {
            // InternalVideoMontage.g:9118:2: ( ruleEString )
            // InternalVideoMontage.g:9119:3: ruleEString
            {
             before(grammarAccess.getClipAccess().getEndCutEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClipAccess().getEndCutEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__EndCutAssignment_5_1"


    // $ANTLR start "rule__Clip__RelativemomentAssignment_8"
    // InternalVideoMontage.g:9128:1: rule__Clip__RelativemomentAssignment_8 : ( ruleRelativeMoment ) ;
    public final void rule__Clip__RelativemomentAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9132:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:9133:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:9133:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:9134:3: ruleRelativeMoment
            {
             before(grammarAccess.getClipAccess().getRelativemomentRelativeMomentParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getClipAccess().getRelativemomentRelativeMomentParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__RelativemomentAssignment_8"


    // $ANTLR start "rule__Clip__RelativemomentAssignment_9_1"
    // InternalVideoMontage.g:9143:1: rule__Clip__RelativemomentAssignment_9_1 : ( ruleRelativeMoment ) ;
    public final void rule__Clip__RelativemomentAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9147:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:9148:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:9148:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:9149:3: ruleRelativeMoment
            {
             before(grammarAccess.getClipAccess().getRelativemomentRelativeMomentParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getClipAccess().getRelativemomentRelativeMomentParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__RelativemomentAssignment_9_1"


    // $ANTLR start "rule__Clip__VideoAssignment_11_2"
    // InternalVideoMontage.g:9158:1: rule__Clip__VideoAssignment_11_2 : ( ruleVideo ) ;
    public final void rule__Clip__VideoAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9162:1: ( ( ruleVideo ) )
            // InternalVideoMontage.g:9163:2: ( ruleVideo )
            {
            // InternalVideoMontage.g:9163:2: ( ruleVideo )
            // InternalVideoMontage.g:9164:3: ruleVideo
            {
             before(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__VideoAssignment_11_2"


    // $ANTLR start "rule__Clip__VideoAssignment_11_3_1"
    // InternalVideoMontage.g:9173:1: rule__Clip__VideoAssignment_11_3_1 : ( ruleVideo ) ;
    public final void rule__Clip__VideoAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9177:1: ( ( ruleVideo ) )
            // InternalVideoMontage.g:9178:2: ( ruleVideo )
            {
            // InternalVideoMontage.g:9178:2: ( ruleVideo )
            // InternalVideoMontage.g:9179:3: ruleVideo
            {
             before(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Clip__VideoAssignment_11_3_1"


    // $ANTLR start "rule__Video__NameAssignment_1"
    // InternalVideoMontage.g:9188:1: rule__Video__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Video__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9192:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:9193:2: ( ruleEString )
            {
            // InternalVideoMontage.g:9193:2: ( ruleEString )
            // InternalVideoMontage.g:9194:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__NameAssignment_1"


    // $ANTLR start "rule__Video__DurationAssignment_3_1"
    // InternalVideoMontage.g:9203:1: rule__Video__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__Video__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9207:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:9208:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:9208:2: ( ruleEDouble )
            // InternalVideoMontage.g:9209:3: ruleEDouble
            {
             before(grammarAccess.getVideoAccess().getDurationEDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getDurationEDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__DurationAssignment_3_1"


    // $ANTLR start "rule__Video__PathAssignment_4_1"
    // InternalVideoMontage.g:9218:1: rule__Video__PathAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Video__PathAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9222:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:9223:2: ( ruleEString )
            {
            // InternalVideoMontage.g:9223:2: ( ruleEString )
            // InternalVideoMontage.g:9224:3: ruleEString
            {
             before(grammarAccess.getVideoAccess().getPathEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getPathEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__PathAssignment_4_1"


    // $ANTLR start "rule__Video__RelativemomentAssignment_7"
    // InternalVideoMontage.g:9233:1: rule__Video__RelativemomentAssignment_7 : ( ruleRelativeMoment ) ;
    public final void rule__Video__RelativemomentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9237:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:9238:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:9238:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:9239:3: ruleRelativeMoment
            {
             before(grammarAccess.getVideoAccess().getRelativemomentRelativeMomentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getRelativemomentRelativeMomentParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__RelativemomentAssignment_7"


    // $ANTLR start "rule__Video__RelativemomentAssignment_8_1"
    // InternalVideoMontage.g:9248:1: rule__Video__RelativemomentAssignment_8_1 : ( ruleRelativeMoment ) ;
    public final void rule__Video__RelativemomentAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9252:1: ( ( ruleRelativeMoment ) )
            // InternalVideoMontage.g:9253:2: ( ruleRelativeMoment )
            {
            // InternalVideoMontage.g:9253:2: ( ruleRelativeMoment )
            // InternalVideoMontage.g:9254:3: ruleRelativeMoment
            {
             before(grammarAccess.getVideoAccess().getRelativemomentRelativeMomentParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelativeMoment();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getRelativemomentRelativeMomentParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__RelativemomentAssignment_8_1"


    // $ANTLR start "rule__Video__ClipAssignment_11"
    // InternalVideoMontage.g:9263:1: rule__Video__ClipAssignment_11 : ( ruleClip ) ;
    public final void rule__Video__ClipAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9267:1: ( ( ruleClip ) )
            // InternalVideoMontage.g:9268:2: ( ruleClip )
            {
            // InternalVideoMontage.g:9268:2: ( ruleClip )
            // InternalVideoMontage.g:9269:3: ruleClip
            {
             before(grammarAccess.getVideoAccess().getClipClipParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleClip();

            state._fsp--;

             after(grammarAccess.getVideoAccess().getClipClipParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__ClipAssignment_11"


    // $ANTLR start "rule__TextArea_Impl__XAssignment_2_1"
    // InternalVideoMontage.g:9278:1: rule__TextArea_Impl__XAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__TextArea_Impl__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9282:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:9283:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:9283:2: ( ruleEInt )
            // InternalVideoMontage.g:9284:3: ruleEInt
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
    // InternalVideoMontage.g:9293:1: rule__TextArea_Impl__YAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__TextArea_Impl__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9297:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:9298:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:9298:2: ( ruleEInt )
            // InternalVideoMontage.g:9299:3: ruleEInt
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
    // InternalVideoMontage.g:9308:1: rule__TextArea_Impl__WidthAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__TextArea_Impl__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9312:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:9313:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:9313:2: ( ruleEDouble )
            // InternalVideoMontage.g:9314:3: ruleEDouble
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
    // InternalVideoMontage.g:9323:1: rule__TextArea_Impl__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__TextArea_Impl__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9327:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:9328:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:9328:2: ( ruleEDouble )
            // InternalVideoMontage.g:9329:3: ruleEDouble
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
    // InternalVideoMontage.g:9338:1: rule__TextArea_Impl__TextAssignment_6_1 : ( ruleEString ) ;
    public final void rule__TextArea_Impl__TextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9342:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:9343:2: ( ruleEString )
            {
            // InternalVideoMontage.g:9343:2: ( ruleEString )
            // InternalVideoMontage.g:9344:3: ruleEString
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


    // $ANTLR start "rule__TextArea_Impl__FontAssignment_8"
    // InternalVideoMontage.g:9353:1: rule__TextArea_Impl__FontAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__TextArea_Impl__FontAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9357:1: ( ( ( ruleEString ) ) )
            // InternalVideoMontage.g:9358:2: ( ( ruleEString ) )
            {
            // InternalVideoMontage.g:9358:2: ( ( ruleEString ) )
            // InternalVideoMontage.g:9359:3: ( ruleEString )
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontFontCrossReference_8_0()); 
            // InternalVideoMontage.g:9360:3: ( ruleEString )
            // InternalVideoMontage.g:9361:4: ruleEString
            {
             before(grammarAccess.getTextArea_ImplAccess().getFontFontEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplAccess().getFontFontEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getTextArea_ImplAccess().getFontFontCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__FontAssignment_8"


    // $ANTLR start "rule__TextArea_Impl__AnimationAssignment_9_2"
    // InternalVideoMontage.g:9372:1: rule__TextArea_Impl__AnimationAssignment_9_2 : ( ruleAnimation ) ;
    public final void rule__TextArea_Impl__AnimationAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9376:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:9377:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:9377:2: ( ruleAnimation )
            // InternalVideoMontage.g:9378:3: ruleAnimation
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__AnimationAssignment_9_2"


    // $ANTLR start "rule__TextArea_Impl__AnimationAssignment_9_3_1"
    // InternalVideoMontage.g:9387:1: rule__TextArea_Impl__AnimationAssignment_9_3_1 : ( ruleAnimation ) ;
    public final void rule__TextArea_Impl__AnimationAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9391:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:9392:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:9392:2: ( ruleAnimation )
            // InternalVideoMontage.g:9393:3: ruleAnimation
            {
             before(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea_Impl__AnimationAssignment_9_3_1"


    // $ANTLR start "rule__TextAreaDynamic__XAssignment_2_1"
    // InternalVideoMontage.g:9402:1: rule__TextAreaDynamic__XAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__XAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9406:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:9407:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:9407:2: ( ruleEInt )
            // InternalVideoMontage.g:9408:3: ruleEInt
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
    // InternalVideoMontage.g:9417:1: rule__TextAreaDynamic__YAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__YAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9421:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:9422:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:9422:2: ( ruleEInt )
            // InternalVideoMontage.g:9423:3: ruleEInt
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
    // InternalVideoMontage.g:9432:1: rule__TextAreaDynamic__WidthAssignment_4_1 : ( ruleEDouble ) ;
    public final void rule__TextAreaDynamic__WidthAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9436:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:9437:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:9437:2: ( ruleEDouble )
            // InternalVideoMontage.g:9438:3: ruleEDouble
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
    // InternalVideoMontage.g:9447:1: rule__TextAreaDynamic__HeightAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__TextAreaDynamic__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9451:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:9452:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:9452:2: ( ruleEDouble )
            // InternalVideoMontage.g:9453:3: ruleEDouble
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
    // InternalVideoMontage.g:9462:1: rule__TextAreaDynamic__TextAssignment_6_1 : ( ruleEString ) ;
    public final void rule__TextAreaDynamic__TextAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9466:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:9467:2: ( ruleEString )
            {
            // InternalVideoMontage.g:9467:2: ( ruleEString )
            // InternalVideoMontage.g:9468:3: ruleEString
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
    // InternalVideoMontage.g:9477:1: rule__TextAreaDynamic__TextSrcAssignment_7_1 : ( ruleEString ) ;
    public final void rule__TextAreaDynamic__TextSrcAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9481:1: ( ( ruleEString ) )
            // InternalVideoMontage.g:9482:2: ( ruleEString )
            {
            // InternalVideoMontage.g:9482:2: ( ruleEString )
            // InternalVideoMontage.g:9483:3: ruleEString
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
    // InternalVideoMontage.g:9492:1: rule__TextAreaDynamic__LineAssignment_8_1 : ( ruleEInt ) ;
    public final void rule__TextAreaDynamic__LineAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9496:1: ( ( ruleEInt ) )
            // InternalVideoMontage.g:9497:2: ( ruleEInt )
            {
            // InternalVideoMontage.g:9497:2: ( ruleEInt )
            // InternalVideoMontage.g:9498:3: ruleEInt
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
    // InternalVideoMontage.g:9507:1: rule__TextAreaDynamic__FontAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__TextAreaDynamic__FontAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9511:1: ( ( ( ruleEString ) ) )
            // InternalVideoMontage.g:9512:2: ( ( ruleEString ) )
            {
            // InternalVideoMontage.g:9512:2: ( ( ruleEString ) )
            // InternalVideoMontage.g:9513:3: ( ruleEString )
            {
             before(grammarAccess.getTextAreaDynamicAccess().getFontFontCrossReference_10_0()); 
            // InternalVideoMontage.g:9514:3: ( ruleEString )
            // InternalVideoMontage.g:9515:4: ruleEString
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


    // $ANTLR start "rule__TextAreaDynamic__AnimationAssignment_11_2"
    // InternalVideoMontage.g:9526:1: rule__TextAreaDynamic__AnimationAssignment_11_2 : ( ruleAnimation ) ;
    public final void rule__TextAreaDynamic__AnimationAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9530:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:9531:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:9531:2: ( ruleAnimation )
            // InternalVideoMontage.g:9532:3: ruleAnimation
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


    // $ANTLR start "rule__TextAreaDynamic__AnimationAssignment_11_3_1"
    // InternalVideoMontage.g:9541:1: rule__TextAreaDynamic__AnimationAssignment_11_3_1 : ( ruleAnimation ) ;
    public final void rule__TextAreaDynamic__AnimationAssignment_11_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9545:1: ( ( ruleAnimation ) )
            // InternalVideoMontage.g:9546:2: ( ruleAnimation )
            {
            // InternalVideoMontage.g:9546:2: ( ruleAnimation )
            // InternalVideoMontage.g:9547:3: ruleAnimation
            {
             before(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnimation();

            state._fsp--;

             after(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAreaDynamic__AnimationAssignment_11_3_1"


    // $ANTLR start "rule__FadeIn__DurationAssignment_3_1"
    // InternalVideoMontage.g:9556:1: rule__FadeIn__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__FadeIn__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9560:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:9561:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:9561:2: ( ruleEDouble )
            // InternalVideoMontage.g:9562:3: ruleEDouble
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
    // InternalVideoMontage.g:9571:1: rule__FadeOut__DurationAssignment_3_1 : ( ruleEDouble ) ;
    public final void rule__FadeOut__DurationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoMontage.g:9575:1: ( ( ruleEDouble ) )
            // InternalVideoMontage.g:9576:2: ( ruleEDouble )
            {
            // InternalVideoMontage.g:9576:2: ( ruleEDouble )
            // InternalVideoMontage.g:9577:3: ruleEDouble
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000A800000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x2020000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000200880000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000060000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000300080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004012000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000E0012000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000012000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0012000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000080000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0FC0000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x1000000000080000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xCFC0000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000010080000L});

}