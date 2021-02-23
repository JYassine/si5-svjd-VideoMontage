package org.xtext.svjd.parser.antlr.internal;

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
import org.xtext.svjd.services.VideoMontageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoMontageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Movie'", "'{'", "'}'", "'audioElement'", "'videoElement'", "'Subtitle'", "'start'", "':'", "'duration'", "'textArea'", "'Audio'", "'path'", "'transition'", "'AudioClip'", "'volume'", "'startCut'", "'endCut'", "'audio'", "'Clip'", "'video'", "'of'", "'element'", "'time'", "'StartingMoment'", "'Transition'", "'Title'", "'backgroundColor'", "'TextArea'", "'x'", "'y'", "'width'", "'height'", "'text'", "'font'", "'animation'", "'TextAreaDynamic'", "'textSrc'", "'line'", "'FadeIn'", "'FadeOut'", "'-'", "'.'", "'E'", "'e'", "'+'", "'starting'", "'ending'", "'BLACK'", "'COMIC_SANS_MS'"
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

        public InternalVideoMontageParser(TokenStream input, VideoMontageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Movie";
       	}

       	@Override
       	protected VideoMontageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMovie"
    // InternalVideoMontage.g:65:1: entryRuleMovie returns [EObject current=null] : iv_ruleMovie= ruleMovie EOF ;
    public final EObject entryRuleMovie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovie = null;


        try {
            // InternalVideoMontage.g:65:46: (iv_ruleMovie= ruleMovie EOF )
            // InternalVideoMontage.g:66:2: iv_ruleMovie= ruleMovie EOF
            {
             newCompositeNode(grammarAccess.getMovieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovie=ruleMovie();

            state._fsp--;

             current =iv_ruleMovie; 
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
    // $ANTLR end "entryRuleMovie"


    // $ANTLR start "ruleMovie"
    // InternalVideoMontage.g:72:1: ruleMovie returns [EObject current=null] : (otherlv_0= 'Movie' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_videoelement_3_0= ruleVideoElement ) ) ( (lv_videoelement_4_0= ruleVideoElement ) )* ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* otherlv_9= '}' ) ;
    public final EObject ruleMovie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_videoelement_3_0 = null;

        EObject lv_videoelement_4_0 = null;

        EObject lv_audioelement_5_0 = null;

        EObject lv_audioelement_6_0 = null;

        EObject lv_subtitle_7_0 = null;

        EObject lv_subtitle_8_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:78:2: ( (otherlv_0= 'Movie' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_videoelement_3_0= ruleVideoElement ) ) ( (lv_videoelement_4_0= ruleVideoElement ) )* ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* otherlv_9= '}' ) )
            // InternalVideoMontage.g:79:2: (otherlv_0= 'Movie' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_videoelement_3_0= ruleVideoElement ) ) ( (lv_videoelement_4_0= ruleVideoElement ) )* ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* otherlv_9= '}' )
            {
            // InternalVideoMontage.g:79:2: (otherlv_0= 'Movie' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_videoelement_3_0= ruleVideoElement ) ) ( (lv_videoelement_4_0= ruleVideoElement ) )* ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* otherlv_9= '}' )
            // InternalVideoMontage.g:80:3: otherlv_0= 'Movie' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_videoelement_3_0= ruleVideoElement ) ) ( (lv_videoelement_4_0= ruleVideoElement ) )* ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMovieAccess().getMovieKeyword_0());
            		
            // InternalVideoMontage.g:84:3: ( (lv_title_1_0= ruleEString ) )
            // InternalVideoMontage.g:85:4: (lv_title_1_0= ruleEString )
            {
            // InternalVideoMontage.g:85:4: (lv_title_1_0= ruleEString )
            // InternalVideoMontage.g:86:5: lv_title_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMovieAccess().getTitleEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_title_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovieRule());
            					}
            					set(
            						current,
            						"title",
            						lv_title_1_0,
            						"org.xtext.svjd.VideoMontage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:107:3: ( (lv_videoelement_3_0= ruleVideoElement ) )
            // InternalVideoMontage.g:108:4: (lv_videoelement_3_0= ruleVideoElement )
            {
            // InternalVideoMontage.g:108:4: (lv_videoelement_3_0= ruleVideoElement )
            // InternalVideoMontage.g:109:5: lv_videoelement_3_0= ruleVideoElement
            {

            					newCompositeNode(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_videoelement_3_0=ruleVideoElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovieRule());
            					}
            					add(
            						current,
            						"videoelement",
            						lv_videoelement_3_0,
            						"org.xtext.svjd.VideoMontage.VideoElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:126:3: ( (lv_videoelement_4_0= ruleVideoElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVideoMontage.g:127:4: (lv_videoelement_4_0= ruleVideoElement )
            	    {
            	    // InternalVideoMontage.g:127:4: (lv_videoelement_4_0= ruleVideoElement )
            	    // InternalVideoMontage.g:128:5: lv_videoelement_4_0= ruleVideoElement
            	    {

            	    					newCompositeNode(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_videoelement_4_0=ruleVideoElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMovieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"videoelement",
            	    						lv_videoelement_4_0,
            	    						"org.xtext.svjd.VideoMontage.VideoElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalVideoMontage.g:145:3: ( (lv_audioelement_5_0= ruleAudioElement ) )
            // InternalVideoMontage.g:146:4: (lv_audioelement_5_0= ruleAudioElement )
            {
            // InternalVideoMontage.g:146:4: (lv_audioelement_5_0= ruleAudioElement )
            // InternalVideoMontage.g:147:5: lv_audioelement_5_0= ruleAudioElement
            {

            					newCompositeNode(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_audioelement_5_0=ruleAudioElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovieRule());
            					}
            					add(
            						current,
            						"audioelement",
            						lv_audioelement_5_0,
            						"org.xtext.svjd.VideoMontage.AudioElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:164:3: ( (lv_audioelement_6_0= ruleAudioElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVideoMontage.g:165:4: (lv_audioelement_6_0= ruleAudioElement )
            	    {
            	    // InternalVideoMontage.g:165:4: (lv_audioelement_6_0= ruleAudioElement )
            	    // InternalVideoMontage.g:166:5: lv_audioelement_6_0= ruleAudioElement
            	    {

            	    					newCompositeNode(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_audioelement_6_0=ruleAudioElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMovieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"audioelement",
            	    						lv_audioelement_6_0,
            	    						"org.xtext.svjd.VideoMontage.AudioElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalVideoMontage.g:183:3: ( (lv_subtitle_7_0= ruleSubtitle ) )
            // InternalVideoMontage.g:184:4: (lv_subtitle_7_0= ruleSubtitle )
            {
            // InternalVideoMontage.g:184:4: (lv_subtitle_7_0= ruleSubtitle )
            // InternalVideoMontage.g:185:5: lv_subtitle_7_0= ruleSubtitle
            {

            					newCompositeNode(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_subtitle_7_0=ruleSubtitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovieRule());
            					}
            					add(
            						current,
            						"subtitle",
            						lv_subtitle_7_0,
            						"org.xtext.svjd.VideoMontage.Subtitle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:202:3: ( (lv_subtitle_8_0= ruleSubtitle ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVideoMontage.g:203:4: (lv_subtitle_8_0= ruleSubtitle )
            	    {
            	    // InternalVideoMontage.g:203:4: (lv_subtitle_8_0= ruleSubtitle )
            	    // InternalVideoMontage.g:204:5: lv_subtitle_8_0= ruleSubtitle
            	    {

            	    					newCompositeNode(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_subtitle_8_0=ruleSubtitle();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMovieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"subtitle",
            	    						lv_subtitle_8_0,
            	    						"org.xtext.svjd.VideoMontage.Subtitle");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleMovie"


    // $ANTLR start "entryRuleAudioElement"
    // InternalVideoMontage.g:229:1: entryRuleAudioElement returns [EObject current=null] : iv_ruleAudioElement= ruleAudioElement EOF ;
    public final EObject entryRuleAudioElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioElement = null;


        try {
            // InternalVideoMontage.g:229:53: (iv_ruleAudioElement= ruleAudioElement EOF )
            // InternalVideoMontage.g:230:2: iv_ruleAudioElement= ruleAudioElement EOF
            {
             newCompositeNode(grammarAccess.getAudioElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAudioElement=ruleAudioElement();

            state._fsp--;

             current =iv_ruleAudioElement; 
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
    // $ANTLR end "entryRuleAudioElement"


    // $ANTLR start "ruleAudioElement"
    // InternalVideoMontage.g:236:1: ruleAudioElement returns [EObject current=null] : (otherlv_0= 'audioElement' (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip ) ) ;
    public final EObject ruleAudioElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Audio_1 = null;

        EObject this_AudioClip_2 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:242:2: ( (otherlv_0= 'audioElement' (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip ) ) )
            // InternalVideoMontage.g:243:2: (otherlv_0= 'audioElement' (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip ) )
            {
            // InternalVideoMontage.g:243:2: (otherlv_0= 'audioElement' (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip ) )
            // InternalVideoMontage.g:244:3: otherlv_0= 'audioElement' (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioElementAccess().getAudioElementKeyword_0());
            		
            // InternalVideoMontage.g:248:3: (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalVideoMontage.g:249:4: this_Audio_1= ruleAudio
                    {

                    				newCompositeNode(grammarAccess.getAudioElementAccess().getAudioParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Audio_1=ruleAudio();

                    state._fsp--;


                    				current = this_Audio_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:258:4: this_AudioClip_2= ruleAudioClip
                    {

                    				newCompositeNode(grammarAccess.getAudioElementAccess().getAudioClipParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_AudioClip_2=ruleAudioClip();

                    state._fsp--;


                    				current = this_AudioClip_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleAudioElement"


    // $ANTLR start "entryRuleVideoElement"
    // InternalVideoMontage.g:271:1: entryRuleVideoElement returns [EObject current=null] : iv_ruleVideoElement= ruleVideoElement EOF ;
    public final EObject entryRuleVideoElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoElement = null;


        try {
            // InternalVideoMontage.g:271:53: (iv_ruleVideoElement= ruleVideoElement EOF )
            // InternalVideoMontage.g:272:2: iv_ruleVideoElement= ruleVideoElement EOF
            {
             newCompositeNode(grammarAccess.getVideoElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoElement=ruleVideoElement();

            state._fsp--;

             current =iv_ruleVideoElement; 
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
    // $ANTLR end "entryRuleVideoElement"


    // $ANTLR start "ruleVideoElement"
    // InternalVideoMontage.g:278:1: ruleVideoElement returns [EObject current=null] : (otherlv_0= 'videoElement' (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo ) ) ;
    public final EObject ruleVideoElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Title_1 = null;

        EObject this_Clip_2 = null;

        EObject this_Video_3 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:284:2: ( (otherlv_0= 'videoElement' (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo ) ) )
            // InternalVideoMontage.g:285:2: (otherlv_0= 'videoElement' (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo ) )
            {
            // InternalVideoMontage.g:285:2: (otherlv_0= 'videoElement' (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo ) )
            // InternalVideoMontage.g:286:3: otherlv_0= 'videoElement' (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoElementAccess().getVideoElementKeyword_0());
            		
            // InternalVideoMontage.g:290:3: (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
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
                    // InternalVideoMontage.g:291:4: this_Title_1= ruleTitle
                    {

                    				newCompositeNode(grammarAccess.getVideoElementAccess().getTitleParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_Title_1=ruleTitle();

                    state._fsp--;


                    				current = this_Title_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:300:4: this_Clip_2= ruleClip
                    {

                    				newCompositeNode(grammarAccess.getVideoElementAccess().getClipParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Clip_2=ruleClip();

                    state._fsp--;


                    				current = this_Clip_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalVideoMontage.g:309:4: this_Video_3= ruleVideo
                    {

                    				newCompositeNode(grammarAccess.getVideoElementAccess().getVideoParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Video_3=ruleVideo();

                    state._fsp--;


                    				current = this_Video_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleVideoElement"


    // $ANTLR start "entryRuleTextArea"
    // InternalVideoMontage.g:322:1: entryRuleTextArea returns [EObject current=null] : iv_ruleTextArea= ruleTextArea EOF ;
    public final EObject entryRuleTextArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea = null;


        try {
            // InternalVideoMontage.g:322:49: (iv_ruleTextArea= ruleTextArea EOF )
            // InternalVideoMontage.g:323:2: iv_ruleTextArea= ruleTextArea EOF
            {
             newCompositeNode(grammarAccess.getTextAreaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextArea=ruleTextArea();

            state._fsp--;

             current =iv_ruleTextArea; 
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
    // $ANTLR end "entryRuleTextArea"


    // $ANTLR start "ruleTextArea"
    // InternalVideoMontage.g:329:1: ruleTextArea returns [EObject current=null] : (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic ) ;
    public final EObject ruleTextArea() throws RecognitionException {
        EObject current = null;

        EObject this_TextArea_Impl_0 = null;

        EObject this_TextAreaDynamic_1 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:335:2: ( (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic ) )
            // InternalVideoMontage.g:336:2: (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic )
            {
            // InternalVideoMontage.g:336:2: (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==38) ) {
                alt6=1;
            }
            else if ( (LA6_0==46) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoMontage.g:337:3: this_TextArea_Impl_0= ruleTextArea_Impl
                    {

                    			newCompositeNode(grammarAccess.getTextAreaAccess().getTextArea_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextArea_Impl_0=ruleTextArea_Impl();

                    state._fsp--;


                    			current = this_TextArea_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:346:3: this_TextAreaDynamic_1= ruleTextAreaDynamic
                    {

                    			newCompositeNode(grammarAccess.getTextAreaAccess().getTextAreaDynamicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextAreaDynamic_1=ruleTextAreaDynamic();

                    state._fsp--;


                    			current = this_TextAreaDynamic_1;
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
    // $ANTLR end "ruleTextArea"


    // $ANTLR start "entryRuleStartingMoment"
    // InternalVideoMontage.g:358:1: entryRuleStartingMoment returns [EObject current=null] : iv_ruleStartingMoment= ruleStartingMoment EOF ;
    public final EObject entryRuleStartingMoment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingMoment = null;


        try {
            // InternalVideoMontage.g:358:55: (iv_ruleStartingMoment= ruleStartingMoment EOF )
            // InternalVideoMontage.g:359:2: iv_ruleStartingMoment= ruleStartingMoment EOF
            {
             newCompositeNode(grammarAccess.getStartingMomentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartingMoment=ruleStartingMoment();

            state._fsp--;

             current =iv_ruleStartingMoment; 
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
    // $ANTLR end "entryRuleStartingMoment"


    // $ANTLR start "ruleStartingMoment"
    // InternalVideoMontage.g:365:1: ruleStartingMoment returns [EObject current=null] : (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment ) ;
    public final EObject ruleStartingMoment() throws RecognitionException {
        EObject current = null;

        EObject this_StartingMoment_Impl_0 = null;

        EObject this_RelativeMoment_1 = null;

        EObject this_AbsoluteMoment_2 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:371:2: ( (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment ) )
            // InternalVideoMontage.g:372:2: (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment )
            {
            // InternalVideoMontage.g:372:2: (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 31:
            case 56:
            case 57:
                {
                alt7=2;
                }
                break;
            case EOF:
            case 12:
            case 33:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalVideoMontage.g:373:3: this_StartingMoment_Impl_0= ruleStartingMoment_Impl
                    {

                    			newCompositeNode(grammarAccess.getStartingMomentAccess().getStartingMoment_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartingMoment_Impl_0=ruleStartingMoment_Impl();

                    state._fsp--;


                    			current = this_StartingMoment_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:382:3: this_RelativeMoment_1= ruleRelativeMoment
                    {

                    			newCompositeNode(grammarAccess.getStartingMomentAccess().getRelativeMomentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeMoment_1=ruleRelativeMoment();

                    state._fsp--;


                    			current = this_RelativeMoment_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVideoMontage.g:391:3: this_AbsoluteMoment_2= ruleAbsoluteMoment
                    {

                    			newCompositeNode(grammarAccess.getStartingMomentAccess().getAbsoluteMomentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbsoluteMoment_2=ruleAbsoluteMoment();

                    state._fsp--;


                    			current = this_AbsoluteMoment_2;
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
    // $ANTLR end "ruleStartingMoment"


    // $ANTLR start "entryRuleAnimation"
    // InternalVideoMontage.g:403:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalVideoMontage.g:403:50: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalVideoMontage.g:404:2: iv_ruleAnimation= ruleAnimation EOF
            {
             newCompositeNode(grammarAccess.getAnimationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnimation=ruleAnimation();

            state._fsp--;

             current =iv_ruleAnimation; 
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
    // $ANTLR end "entryRuleAnimation"


    // $ANTLR start "ruleAnimation"
    // InternalVideoMontage.g:410:1: ruleAnimation returns [EObject current=null] : (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        EObject this_FadeIn_0 = null;

        EObject this_FadeOut_1 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:416:2: ( (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut ) )
            // InternalVideoMontage.g:417:2: (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut )
            {
            // InternalVideoMontage.g:417:2: (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==49) ) {
                alt8=1;
            }
            else if ( (LA8_0==50) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalVideoMontage.g:418:3: this_FadeIn_0= ruleFadeIn
                    {

                    			newCompositeNode(grammarAccess.getAnimationAccess().getFadeInParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FadeIn_0=ruleFadeIn();

                    state._fsp--;


                    			current = this_FadeIn_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:427:3: this_FadeOut_1= ruleFadeOut
                    {

                    			newCompositeNode(grammarAccess.getAnimationAccess().getFadeOutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FadeOut_1=ruleFadeOut();

                    state._fsp--;


                    			current = this_FadeOut_1;
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
    // $ANTLR end "ruleAnimation"


    // $ANTLR start "entryRuleEString"
    // InternalVideoMontage.g:439:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVideoMontage.g:439:47: (iv_ruleEString= ruleEString EOF )
            // InternalVideoMontage.g:440:2: iv_ruleEString= ruleEString EOF
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
    // InternalVideoMontage.g:446:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:452:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVideoMontage.g:453:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVideoMontage.g:453:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoMontage.g:454:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:462:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleSubtitle"
    // InternalVideoMontage.g:473:1: entryRuleSubtitle returns [EObject current=null] : iv_ruleSubtitle= ruleSubtitle EOF ;
    public final EObject entryRuleSubtitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtitle = null;


        try {
            // InternalVideoMontage.g:473:49: (iv_ruleSubtitle= ruleSubtitle EOF )
            // InternalVideoMontage.g:474:2: iv_ruleSubtitle= ruleSubtitle EOF
            {
             newCompositeNode(grammarAccess.getSubtitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubtitle=ruleSubtitle();

            state._fsp--;

             current =iv_ruleSubtitle; 
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
    // $ANTLR end "entryRuleSubtitle"


    // $ANTLR start "ruleSubtitle"
    // InternalVideoMontage.g:480:1: ruleSubtitle returns [EObject current=null] : (otherlv_0= 'Subtitle' otherlv_1= 'start' otherlv_2= ':' ( (lv_startingmoment_3_0= ruleStartingMoment ) ) otherlv_4= '{' (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )? otherlv_7= 'textArea' ( (lv_textarea_8_0= ruleTextArea ) ) otherlv_9= '}' ) ;
    public final EObject ruleSubtitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_startingmoment_3_0 = null;

        AntlrDatatypeRuleToken lv_duration_6_0 = null;

        EObject lv_textarea_8_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:486:2: ( (otherlv_0= 'Subtitle' otherlv_1= 'start' otherlv_2= ':' ( (lv_startingmoment_3_0= ruleStartingMoment ) ) otherlv_4= '{' (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )? otherlv_7= 'textArea' ( (lv_textarea_8_0= ruleTextArea ) ) otherlv_9= '}' ) )
            // InternalVideoMontage.g:487:2: (otherlv_0= 'Subtitle' otherlv_1= 'start' otherlv_2= ':' ( (lv_startingmoment_3_0= ruleStartingMoment ) ) otherlv_4= '{' (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )? otherlv_7= 'textArea' ( (lv_textarea_8_0= ruleTextArea ) ) otherlv_9= '}' )
            {
            // InternalVideoMontage.g:487:2: (otherlv_0= 'Subtitle' otherlv_1= 'start' otherlv_2= ':' ( (lv_startingmoment_3_0= ruleStartingMoment ) ) otherlv_4= '{' (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )? otherlv_7= 'textArea' ( (lv_textarea_8_0= ruleTextArea ) ) otherlv_9= '}' )
            // InternalVideoMontage.g:488:3: otherlv_0= 'Subtitle' otherlv_1= 'start' otherlv_2= ':' ( (lv_startingmoment_3_0= ruleStartingMoment ) ) otherlv_4= '{' (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )? otherlv_7= 'textArea' ( (lv_textarea_8_0= ruleTextArea ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getSubtitleAccess().getSubtitleKeyword_0());
            		
            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSubtitleAccess().getStartKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSubtitleAccess().getColonKeyword_2());
            		
            // InternalVideoMontage.g:500:3: ( (lv_startingmoment_3_0= ruleStartingMoment ) )
            // InternalVideoMontage.g:501:4: (lv_startingmoment_3_0= ruleStartingMoment )
            {
            // InternalVideoMontage.g:501:4: (lv_startingmoment_3_0= ruleStartingMoment )
            // InternalVideoMontage.g:502:5: lv_startingmoment_3_0= ruleStartingMoment
            {

            					newCompositeNode(grammarAccess.getSubtitleAccess().getStartingmomentStartingMomentParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_startingmoment_3_0=ruleStartingMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtitleRule());
            					}
            					set(
            						current,
            						"startingmoment",
            						lv_startingmoment_3_0,
            						"org.xtext.svjd.VideoMontage.StartingMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVideoMontage.g:523:3: (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVideoMontage.g:524:4: otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubtitleAccess().getDurationKeyword_5_0());
                    			
                    // InternalVideoMontage.g:528:4: ( (lv_duration_6_0= ruleEDouble ) )
                    // InternalVideoMontage.g:529:5: (lv_duration_6_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:529:5: (lv_duration_6_0= ruleEDouble )
                    // InternalVideoMontage.g:530:6: lv_duration_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSubtitleAccess().getDurationEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_duration_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubtitleRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_6_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getSubtitleAccess().getTextAreaKeyword_6());
            		
            // InternalVideoMontage.g:552:3: ( (lv_textarea_8_0= ruleTextArea ) )
            // InternalVideoMontage.g:553:4: (lv_textarea_8_0= ruleTextArea )
            {
            // InternalVideoMontage.g:553:4: (lv_textarea_8_0= ruleTextArea )
            // InternalVideoMontage.g:554:5: lv_textarea_8_0= ruleTextArea
            {

            					newCompositeNode(grammarAccess.getSubtitleAccess().getTextareaTextAreaParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_18);
            lv_textarea_8_0=ruleTextArea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtitleRule());
            					}
            					set(
            						current,
            						"textarea",
            						lv_textarea_8_0,
            						"org.xtext.svjd.VideoMontage.TextArea");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleSubtitle"


    // $ANTLR start "entryRuleAudio"
    // InternalVideoMontage.g:579:1: entryRuleAudio returns [EObject current=null] : iv_ruleAudio= ruleAudio EOF ;
    public final EObject entryRuleAudio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudio = null;


        try {
            // InternalVideoMontage.g:579:46: (iv_ruleAudio= ruleAudio EOF )
            // InternalVideoMontage.g:580:2: iv_ruleAudio= ruleAudio EOF
            {
             newCompositeNode(grammarAccess.getAudioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAudio=ruleAudio();

            state._fsp--;

             current =iv_ruleAudio; 
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
    // $ANTLR end "entryRuleAudio"


    // $ANTLR start "ruleAudio"
    // InternalVideoMontage.g:586:1: ruleAudio returns [EObject current=null] : (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) )? (otherlv_8= 'transition' ( (lv_transition_9_0= ruleTransition ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleAudio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_startingmoment_4_0 = null;

        AntlrDatatypeRuleToken lv_path_7_0 = null;

        EObject lv_transition_9_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:592:2: ( (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) )? (otherlv_8= 'transition' ( (lv_transition_9_0= ruleTransition ) ) )? otherlv_10= '}' ) )
            // InternalVideoMontage.g:593:2: (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) )? (otherlv_8= 'transition' ( (lv_transition_9_0= ruleTransition ) ) )? otherlv_10= '}' )
            {
            // InternalVideoMontage.g:593:2: (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) )? (otherlv_8= 'transition' ( (lv_transition_9_0= ruleTransition ) ) )? otherlv_10= '}' )
            // InternalVideoMontage.g:594:3: otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) )? (otherlv_8= 'transition' ( (lv_transition_9_0= ruleTransition ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioAccess().getAudioKeyword_0());
            		
            // InternalVideoMontage.g:598:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontage.g:599:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontage.g:599:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontage.g:600:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.svjd.VideoMontage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAudioAccess().getStartKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAudioAccess().getColonKeyword_3());
            		
            // InternalVideoMontage.g:625:3: ( (lv_startingmoment_4_0= ruleStartingMoment ) )
            // InternalVideoMontage.g:626:4: (lv_startingmoment_4_0= ruleStartingMoment )
            {
            // InternalVideoMontage.g:626:4: (lv_startingmoment_4_0= ruleStartingMoment )
            // InternalVideoMontage.g:627:5: lv_startingmoment_4_0= ruleStartingMoment
            {

            					newCompositeNode(grammarAccess.getAudioAccess().getStartingmomentStartingMomentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_startingmoment_4_0=ruleStartingMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioRule());
            					}
            					set(
            						current,
            						"startingmoment",
            						lv_startingmoment_4_0,
            						"org.xtext.svjd.VideoMontage.StartingMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalVideoMontage.g:648:3: (otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVideoMontage.g:649:4: otherlv_6= 'path' ( (lv_path_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getAudioAccess().getPathKeyword_6_0());
                    			
                    // InternalVideoMontage.g:653:4: ( (lv_path_7_0= ruleEString ) )
                    // InternalVideoMontage.g:654:5: (lv_path_7_0= ruleEString )
                    {
                    // InternalVideoMontage.g:654:5: (lv_path_7_0= ruleEString )
                    // InternalVideoMontage.g:655:6: lv_path_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getPathEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_path_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_7_0,
                    							"org.xtext.svjd.VideoMontage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:673:3: (otherlv_8= 'transition' ( (lv_transition_9_0= ruleTransition ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVideoMontage.g:674:4: otherlv_8= 'transition' ( (lv_transition_9_0= ruleTransition ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getAudioAccess().getTransitionKeyword_7_0());
                    			
                    // InternalVideoMontage.g:678:4: ( (lv_transition_9_0= ruleTransition ) )
                    // InternalVideoMontage.g:679:5: (lv_transition_9_0= ruleTransition )
                    {
                    // InternalVideoMontage.g:679:5: (lv_transition_9_0= ruleTransition )
                    // InternalVideoMontage.g:680:6: lv_transition_9_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getTransitionTransitionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_transition_9_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioRule());
                    						}
                    						set(
                    							current,
                    							"transition",
                    							lv_transition_9_0,
                    							"org.xtext.svjd.VideoMontage.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAudio"


    // $ANTLR start "entryRuleAudioClip"
    // InternalVideoMontage.g:706:1: entryRuleAudioClip returns [EObject current=null] : iv_ruleAudioClip= ruleAudioClip EOF ;
    public final EObject entryRuleAudioClip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioClip = null;


        try {
            // InternalVideoMontage.g:706:50: (iv_ruleAudioClip= ruleAudioClip EOF )
            // InternalVideoMontage.g:707:2: iv_ruleAudioClip= ruleAudioClip EOF
            {
             newCompositeNode(grammarAccess.getAudioClipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAudioClip=ruleAudioClip();

            state._fsp--;

             current =iv_ruleAudioClip; 
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
    // $ANTLR end "entryRuleAudioClip"


    // $ANTLR start "ruleAudioClip"
    // InternalVideoMontage.g:713:1: ruleAudioClip returns [EObject current=null] : (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )? (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) ) (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) ) (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )? (otherlv_14= 'audio' ( (lv_audio_15_0= ruleAudio ) ) ( (lv_audio_16_0= ruleAudio ) )* ) otherlv_17= '}' ) ;
    public final EObject ruleAudioClip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_startingmoment_4_0 = null;

        AntlrDatatypeRuleToken lv_volume_7_0 = null;

        AntlrDatatypeRuleToken lv_startCut_9_0 = null;

        AntlrDatatypeRuleToken lv_endCut_11_0 = null;

        EObject lv_transition_13_0 = null;

        EObject lv_audio_15_0 = null;

        EObject lv_audio_16_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:719:2: ( (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )? (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) ) (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) ) (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )? (otherlv_14= 'audio' ( (lv_audio_15_0= ruleAudio ) ) ( (lv_audio_16_0= ruleAudio ) )* ) otherlv_17= '}' ) )
            // InternalVideoMontage.g:720:2: (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )? (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) ) (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) ) (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )? (otherlv_14= 'audio' ( (lv_audio_15_0= ruleAudio ) ) ( (lv_audio_16_0= ruleAudio ) )* ) otherlv_17= '}' )
            {
            // InternalVideoMontage.g:720:2: (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )? (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) ) (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) ) (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )? (otherlv_14= 'audio' ( (lv_audio_15_0= ruleAudio ) ) ( (lv_audio_16_0= ruleAudio ) )* ) otherlv_17= '}' )
            // InternalVideoMontage.g:721:3: otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )? (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) ) (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) ) (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )? (otherlv_14= 'audio' ( (lv_audio_15_0= ruleAudio ) ) ( (lv_audio_16_0= ruleAudio ) )* ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioClipAccess().getAudioClipKeyword_0());
            		
            // InternalVideoMontage.g:725:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontage.g:726:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontage.g:726:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontage.g:727:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioClipAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioClipRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.svjd.VideoMontage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAudioClipAccess().getStartKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getAudioClipAccess().getColonKeyword_3());
            		
            // InternalVideoMontage.g:752:3: ( (lv_startingmoment_4_0= ruleStartingMoment ) )
            // InternalVideoMontage.g:753:4: (lv_startingmoment_4_0= ruleStartingMoment )
            {
            // InternalVideoMontage.g:753:4: (lv_startingmoment_4_0= ruleStartingMoment )
            // InternalVideoMontage.g:754:5: lv_startingmoment_4_0= ruleStartingMoment
            {

            					newCompositeNode(grammarAccess.getAudioClipAccess().getStartingmomentStartingMomentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_startingmoment_4_0=ruleStartingMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioClipRule());
            					}
            					set(
            						current,
            						"startingmoment",
            						lv_startingmoment_4_0,
            						"org.xtext.svjd.VideoMontage.StartingMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalVideoMontage.g:775:3: (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVideoMontage.g:776:4: otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getAudioClipAccess().getVolumeKeyword_6_0());
                    			
                    // InternalVideoMontage.g:780:4: ( (lv_volume_7_0= ruleEDouble ) )
                    // InternalVideoMontage.g:781:5: (lv_volume_7_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:781:5: (lv_volume_7_0= ruleEDouble )
                    // InternalVideoMontage.g:782:6: lv_volume_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAudioClipAccess().getVolumeEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_volume_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioClipRule());
                    						}
                    						set(
                    							current,
                    							"volume",
                    							lv_volume_7_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:800:3: (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) )
            // InternalVideoMontage.g:801:4: otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) )
            {
            otherlv_8=(Token)match(input,26,FOLLOW_15); 

            				newLeafNode(otherlv_8, grammarAccess.getAudioClipAccess().getStartCutKeyword_7_0());
            			
            // InternalVideoMontage.g:805:4: ( (lv_startCut_9_0= ruleEDouble ) )
            // InternalVideoMontage.g:806:5: (lv_startCut_9_0= ruleEDouble )
            {
            // InternalVideoMontage.g:806:5: (lv_startCut_9_0= ruleEDouble )
            // InternalVideoMontage.g:807:6: lv_startCut_9_0= ruleEDouble
            {

            						newCompositeNode(grammarAccess.getAudioClipAccess().getStartCutEDoubleParserRuleCall_7_1_0());
            					
            pushFollow(FOLLOW_24);
            lv_startCut_9_0=ruleEDouble();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAudioClipRule());
            						}
            						set(
            							current,
            							"startCut",
            							lv_startCut_9_0,
            							"org.xtext.svjd.VideoMontage.EDouble");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalVideoMontage.g:825:3: (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) )
            // InternalVideoMontage.g:826:4: otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) )
            {
            otherlv_10=(Token)match(input,27,FOLLOW_15); 

            				newLeafNode(otherlv_10, grammarAccess.getAudioClipAccess().getEndCutKeyword_8_0());
            			
            // InternalVideoMontage.g:830:4: ( (lv_endCut_11_0= ruleEDouble ) )
            // InternalVideoMontage.g:831:5: (lv_endCut_11_0= ruleEDouble )
            {
            // InternalVideoMontage.g:831:5: (lv_endCut_11_0= ruleEDouble )
            // InternalVideoMontage.g:832:6: lv_endCut_11_0= ruleEDouble
            {

            						newCompositeNode(grammarAccess.getAudioClipAccess().getEndCutEDoubleParserRuleCall_8_1_0());
            					
            pushFollow(FOLLOW_25);
            lv_endCut_11_0=ruleEDouble();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAudioClipRule());
            						}
            						set(
            							current,
            							"endCut",
            							lv_endCut_11_0,
            							"org.xtext.svjd.VideoMontage.EDouble");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalVideoMontage.g:850:3: (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVideoMontage.g:851:4: otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) )
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getAudioClipAccess().getTransitionKeyword_9_0());
                    			
                    // InternalVideoMontage.g:855:4: ( (lv_transition_13_0= ruleTransition ) )
                    // InternalVideoMontage.g:856:5: (lv_transition_13_0= ruleTransition )
                    {
                    // InternalVideoMontage.g:856:5: (lv_transition_13_0= ruleTransition )
                    // InternalVideoMontage.g:857:6: lv_transition_13_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getAudioClipAccess().getTransitionTransitionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_transition_13_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioClipRule());
                    						}
                    						set(
                    							current,
                    							"transition",
                    							lv_transition_13_0,
                    							"org.xtext.svjd.VideoMontage.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:875:3: (otherlv_14= 'audio' ( (lv_audio_15_0= ruleAudio ) ) ( (lv_audio_16_0= ruleAudio ) )* )
            // InternalVideoMontage.g:876:4: otherlv_14= 'audio' ( (lv_audio_15_0= ruleAudio ) ) ( (lv_audio_16_0= ruleAudio ) )*
            {
            otherlv_14=(Token)match(input,28,FOLLOW_27); 

            				newLeafNode(otherlv_14, grammarAccess.getAudioClipAccess().getAudioKeyword_10_0());
            			
            // InternalVideoMontage.g:880:4: ( (lv_audio_15_0= ruleAudio ) )
            // InternalVideoMontage.g:881:5: (lv_audio_15_0= ruleAudio )
            {
            // InternalVideoMontage.g:881:5: (lv_audio_15_0= ruleAudio )
            // InternalVideoMontage.g:882:6: lv_audio_15_0= ruleAudio
            {

            						newCompositeNode(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_10_1_0());
            					
            pushFollow(FOLLOW_28);
            lv_audio_15_0=ruleAudio();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getAudioClipRule());
            						}
            						add(
            							current,
            							"audio",
            							lv_audio_15_0,
            							"org.xtext.svjd.VideoMontage.Audio");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalVideoMontage.g:899:4: ( (lv_audio_16_0= ruleAudio ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==21) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalVideoMontage.g:900:5: (lv_audio_16_0= ruleAudio )
            	    {
            	    // InternalVideoMontage.g:900:5: (lv_audio_16_0= ruleAudio )
            	    // InternalVideoMontage.g:901:6: lv_audio_16_0= ruleAudio
            	    {

            	    						newCompositeNode(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_10_2_0());
            	    					
            	    pushFollow(FOLLOW_28);
            	    lv_audio_16_0=ruleAudio();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAudioClipRule());
            	    						}
            	    						add(
            	    							current,
            	    							"audio",
            	    							lv_audio_16_0,
            	    							"org.xtext.svjd.VideoMontage.Audio");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            otherlv_17=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleAudioClip"


    // $ANTLR start "entryRuleClip"
    // InternalVideoMontage.g:927:1: entryRuleClip returns [EObject current=null] : iv_ruleClip= ruleClip EOF ;
    public final EObject entryRuleClip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClip = null;


        try {
            // InternalVideoMontage.g:927:45: (iv_ruleClip= ruleClip EOF )
            // InternalVideoMontage.g:928:2: iv_ruleClip= ruleClip EOF
            {
             newCompositeNode(grammarAccess.getClipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClip=ruleClip();

            state._fsp--;

             current =iv_ruleClip; 
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
    // $ANTLR end "entryRuleClip"


    // $ANTLR start "ruleClip"
    // InternalVideoMontage.g:934:1: ruleClip returns [EObject current=null] : (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEString ) ) )? (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEString ) ) )? (otherlv_7= 'video' ( (lv_video_8_0= ruleVideo ) ) ( (lv_video_9_0= ruleVideo ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleClip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_startCut_4_0 = null;

        AntlrDatatypeRuleToken lv_endCut_6_0 = null;

        EObject lv_video_8_0 = null;

        EObject lv_video_9_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:940:2: ( (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEString ) ) )? (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEString ) ) )? (otherlv_7= 'video' ( (lv_video_8_0= ruleVideo ) ) ( (lv_video_9_0= ruleVideo ) )* )? otherlv_10= '}' ) )
            // InternalVideoMontage.g:941:2: (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEString ) ) )? (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEString ) ) )? (otherlv_7= 'video' ( (lv_video_8_0= ruleVideo ) ) ( (lv_video_9_0= ruleVideo ) )* )? otherlv_10= '}' )
            {
            // InternalVideoMontage.g:941:2: (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEString ) ) )? (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEString ) ) )? (otherlv_7= 'video' ( (lv_video_8_0= ruleVideo ) ) ( (lv_video_9_0= ruleVideo ) )* )? otherlv_10= '}' )
            // InternalVideoMontage.g:942:3: otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEString ) ) )? (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEString ) ) )? (otherlv_7= 'video' ( (lv_video_8_0= ruleVideo ) ) ( (lv_video_9_0= ruleVideo ) )* )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClipAccess().getClipKeyword_0());
            		
            // InternalVideoMontage.g:946:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontage.g:947:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontage.g:947:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontage.g:948:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClipAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClipRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.svjd.VideoMontage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:969:3: (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVideoMontage.g:970:4: otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getClipAccess().getStartCutKeyword_3_0());
                    			
                    // InternalVideoMontage.g:974:4: ( (lv_startCut_4_0= ruleEString ) )
                    // InternalVideoMontage.g:975:5: (lv_startCut_4_0= ruleEString )
                    {
                    // InternalVideoMontage.g:975:5: (lv_startCut_4_0= ruleEString )
                    // InternalVideoMontage.g:976:6: lv_startCut_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClipAccess().getStartCutEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_startCut_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClipRule());
                    						}
                    						set(
                    							current,
                    							"startCut",
                    							lv_startCut_4_0,
                    							"org.xtext.svjd.VideoMontage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:994:3: (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVideoMontage.g:995:4: otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getClipAccess().getEndCutKeyword_4_0());
                    			
                    // InternalVideoMontage.g:999:4: ( (lv_endCut_6_0= ruleEString ) )
                    // InternalVideoMontage.g:1000:5: (lv_endCut_6_0= ruleEString )
                    {
                    // InternalVideoMontage.g:1000:5: (lv_endCut_6_0= ruleEString )
                    // InternalVideoMontage.g:1001:6: lv_endCut_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClipAccess().getEndCutEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_endCut_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClipRule());
                    						}
                    						set(
                    							current,
                    							"endCut",
                    							lv_endCut_6_0,
                    							"org.xtext.svjd.VideoMontage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1019:3: (otherlv_7= 'video' ( (lv_video_8_0= ruleVideo ) ) ( (lv_video_9_0= ruleVideo ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVideoMontage.g:1020:4: otherlv_7= 'video' ( (lv_video_8_0= ruleVideo ) ) ( (lv_video_9_0= ruleVideo ) )*
                    {
                    otherlv_7=(Token)match(input,30,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getClipAccess().getVideoKeyword_5_0());
                    			
                    // InternalVideoMontage.g:1024:4: ( (lv_video_8_0= ruleVideo ) )
                    // InternalVideoMontage.g:1025:5: (lv_video_8_0= ruleVideo )
                    {
                    // InternalVideoMontage.g:1025:5: (lv_video_8_0= ruleVideo )
                    // InternalVideoMontage.g:1026:6: lv_video_8_0= ruleVideo
                    {

                    						newCompositeNode(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_video_8_0=ruleVideo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClipRule());
                    						}
                    						add(
                    							current,
                    							"video",
                    							lv_video_8_0,
                    							"org.xtext.svjd.VideoMontage.Video");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVideoMontage.g:1043:4: ( (lv_video_9_0= ruleVideo ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalVideoMontage.g:1044:5: (lv_video_9_0= ruleVideo )
                    	    {
                    	    // InternalVideoMontage.g:1044:5: (lv_video_9_0= ruleVideo )
                    	    // InternalVideoMontage.g:1045:6: lv_video_9_0= ruleVideo
                    	    {

                    	    						newCompositeNode(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_32);
                    	    lv_video_9_0=ruleVideo();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getClipRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"video",
                    	    							lv_video_9_0,
                    	    							"org.xtext.svjd.VideoMontage.Video");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getClipAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleClip"


    // $ANTLR start "entryRuleVideo"
    // InternalVideoMontage.g:1071:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalVideoMontage.g:1071:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalVideoMontage.g:1072:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
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
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalVideoMontage.g:1078:1: ruleVideo returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) ) ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1084:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) ) ) )
            // InternalVideoMontage.g:1085:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) ) )
            {
            // InternalVideoMontage.g:1085:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) ) )
            // InternalVideoMontage.g:1086:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) )
            {
            // InternalVideoMontage.g:1086:3: ( (lv_name_0_0= ruleEString ) )
            // InternalVideoMontage.g:1087:4: (lv_name_0_0= ruleEString )
            {
            // InternalVideoMontage.g:1087:4: (lv_name_0_0= ruleEString )
            // InternalVideoMontage.g:1088:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.svjd.VideoMontage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:1105:3: (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) )
            // InternalVideoMontage.g:1106:4: otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) )
            {
            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getPathKeyword_1_0());
            			
            // InternalVideoMontage.g:1110:4: ( (lv_path_2_0= ruleEString ) )
            // InternalVideoMontage.g:1111:5: (lv_path_2_0= ruleEString )
            {
            // InternalVideoMontage.g:1111:5: (lv_path_2_0= ruleEString )
            // InternalVideoMontage.g:1112:6: lv_path_2_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getVideoAccess().getPathEStringParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_path_2_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getVideoRule());
            						}
            						set(
            							current,
            							"path",
            							lv_path_2_0,
            							"org.xtext.svjd.VideoMontage.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleRelativeMoment"
    // InternalVideoMontage.g:1134:1: entryRuleRelativeMoment returns [EObject current=null] : iv_ruleRelativeMoment= ruleRelativeMoment EOF ;
    public final EObject entryRuleRelativeMoment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeMoment = null;


        try {
            // InternalVideoMontage.g:1134:55: (iv_ruleRelativeMoment= ruleRelativeMoment EOF )
            // InternalVideoMontage.g:1135:2: iv_ruleRelativeMoment= ruleRelativeMoment EOF
            {
             newCompositeNode(grammarAccess.getRelativeMomentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeMoment=ruleRelativeMoment();

            state._fsp--;

             current =iv_ruleRelativeMoment; 
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
    // $ANTLR end "entryRuleRelativeMoment"


    // $ANTLR start "ruleRelativeMoment"
    // InternalVideoMontage.g:1141:1: ruleRelativeMoment returns [EObject current=null] : ( () ( (lv_moment_1_0= ruleMoment ) )? otherlv_2= 'of' otherlv_3= 'element' ( (otherlv_4= RULE_ID ) ) ( (lv_operationMoment_5_0= ruleOperationMoment ) ) ( (lv_value_6_0= ruleEDouble ) )? ) ;
    public final EObject ruleRelativeMoment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_moment_1_0 = null;

        Enumerator lv_operationMoment_5_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1147:2: ( ( () ( (lv_moment_1_0= ruleMoment ) )? otherlv_2= 'of' otherlv_3= 'element' ( (otherlv_4= RULE_ID ) ) ( (lv_operationMoment_5_0= ruleOperationMoment ) ) ( (lv_value_6_0= ruleEDouble ) )? ) )
            // InternalVideoMontage.g:1148:2: ( () ( (lv_moment_1_0= ruleMoment ) )? otherlv_2= 'of' otherlv_3= 'element' ( (otherlv_4= RULE_ID ) ) ( (lv_operationMoment_5_0= ruleOperationMoment ) ) ( (lv_value_6_0= ruleEDouble ) )? )
            {
            // InternalVideoMontage.g:1148:2: ( () ( (lv_moment_1_0= ruleMoment ) )? otherlv_2= 'of' otherlv_3= 'element' ( (otherlv_4= RULE_ID ) ) ( (lv_operationMoment_5_0= ruleOperationMoment ) ) ( (lv_value_6_0= ruleEDouble ) )? )
            // InternalVideoMontage.g:1149:3: () ( (lv_moment_1_0= ruleMoment ) )? otherlv_2= 'of' otherlv_3= 'element' ( (otherlv_4= RULE_ID ) ) ( (lv_operationMoment_5_0= ruleOperationMoment ) ) ( (lv_value_6_0= ruleEDouble ) )?
            {
            // InternalVideoMontage.g:1149:3: ()
            // InternalVideoMontage.g:1150:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeMomentAccess().getRelativeMomentAction_0(),
            					current);
            			

            }

            // InternalVideoMontage.g:1156:3: ( (lv_moment_1_0= ruleMoment ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=56 && LA20_0<=57)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVideoMontage.g:1157:4: (lv_moment_1_0= ruleMoment )
                    {
                    // InternalVideoMontage.g:1157:4: (lv_moment_1_0= ruleMoment )
                    // InternalVideoMontage.g:1158:5: lv_moment_1_0= ruleMoment
                    {

                    					newCompositeNode(grammarAccess.getRelativeMomentAccess().getMomentMomentEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_34);
                    lv_moment_1_0=ruleMoment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelativeMomentRule());
                    					}
                    					set(
                    						current,
                    						"moment",
                    						lv_moment_1_0,
                    						"org.xtext.svjd.VideoMontage.Moment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeMomentAccess().getOfKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getRelativeMomentAccess().getElementKeyword_3());
            		
            // InternalVideoMontage.g:1183:3: ( (otherlv_4= RULE_ID ) )
            // InternalVideoMontage.g:1184:4: (otherlv_4= RULE_ID )
            {
            // InternalVideoMontage.g:1184:4: (otherlv_4= RULE_ID )
            // InternalVideoMontage.g:1185:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelativeMomentRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_37); 

            					newLeafNode(otherlv_4, grammarAccess.getRelativeMomentAccess().getElementElementCrossReference_4_0());
            				

            }


            }

            // InternalVideoMontage.g:1196:3: ( (lv_operationMoment_5_0= ruleOperationMoment ) )
            // InternalVideoMontage.g:1197:4: (lv_operationMoment_5_0= ruleOperationMoment )
            {
            // InternalVideoMontage.g:1197:4: (lv_operationMoment_5_0= ruleOperationMoment )
            // InternalVideoMontage.g:1198:5: lv_operationMoment_5_0= ruleOperationMoment
            {

            					newCompositeNode(grammarAccess.getRelativeMomentAccess().getOperationMomentOperationMomentEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_38);
            lv_operationMoment_5_0=ruleOperationMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelativeMomentRule());
            					}
            					set(
            						current,
            						"operationMoment",
            						lv_operationMoment_5_0,
            						"org.xtext.svjd.VideoMontage.OperationMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:1215:3: ( (lv_value_6_0= ruleEDouble ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_INT||(LA21_0>=51 && LA21_0<=52)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVideoMontage.g:1216:4: (lv_value_6_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1216:4: (lv_value_6_0= ruleEDouble )
                    // InternalVideoMontage.g:1217:5: lv_value_6_0= ruleEDouble
                    {

                    					newCompositeNode(grammarAccess.getRelativeMomentAccess().getValueEDoubleParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_6_0=ruleEDouble();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelativeMomentRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_6_0,
                    						"org.xtext.svjd.VideoMontage.EDouble");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleRelativeMoment"


    // $ANTLR start "entryRuleAbsoluteMoment"
    // InternalVideoMontage.g:1238:1: entryRuleAbsoluteMoment returns [EObject current=null] : iv_ruleAbsoluteMoment= ruleAbsoluteMoment EOF ;
    public final EObject entryRuleAbsoluteMoment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteMoment = null;


        try {
            // InternalVideoMontage.g:1238:55: (iv_ruleAbsoluteMoment= ruleAbsoluteMoment EOF )
            // InternalVideoMontage.g:1239:2: iv_ruleAbsoluteMoment= ruleAbsoluteMoment EOF
            {
             newCompositeNode(grammarAccess.getAbsoluteMomentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbsoluteMoment=ruleAbsoluteMoment();

            state._fsp--;

             current =iv_ruleAbsoluteMoment; 
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
    // $ANTLR end "entryRuleAbsoluteMoment"


    // $ANTLR start "ruleAbsoluteMoment"
    // InternalVideoMontage.g:1245:1: ruleAbsoluteMoment returns [EObject current=null] : ( () (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleAbsoluteMoment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1251:2: ( ( () (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )? ) )
            // InternalVideoMontage.g:1252:2: ( () (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )? )
            {
            // InternalVideoMontage.g:1252:2: ( () (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )? )
            // InternalVideoMontage.g:1253:3: () (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )?
            {
            // InternalVideoMontage.g:1253:3: ()
            // InternalVideoMontage.g:1254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentAction_0(),
            					current);
            			

            }

            // InternalVideoMontage.g:1260:3: (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVideoMontage.g:1261:4: otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getAbsoluteMomentAccess().getTimeKeyword_1_0());
                    			
                    // InternalVideoMontage.g:1265:4: ( (lv_time_2_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1266:5: (lv_time_2_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1266:5: (lv_time_2_0= ruleEDouble )
                    // InternalVideoMontage.g:1267:6: lv_time_2_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAbsoluteMomentAccess().getTimeEDoubleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_time_2_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbsoluteMomentRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_2_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleAbsoluteMoment"


    // $ANTLR start "entryRuleStartingMoment_Impl"
    // InternalVideoMontage.g:1289:1: entryRuleStartingMoment_Impl returns [EObject current=null] : iv_ruleStartingMoment_Impl= ruleStartingMoment_Impl EOF ;
    public final EObject entryRuleStartingMoment_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingMoment_Impl = null;


        try {
            // InternalVideoMontage.g:1289:60: (iv_ruleStartingMoment_Impl= ruleStartingMoment_Impl EOF )
            // InternalVideoMontage.g:1290:2: iv_ruleStartingMoment_Impl= ruleStartingMoment_Impl EOF
            {
             newCompositeNode(grammarAccess.getStartingMoment_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartingMoment_Impl=ruleStartingMoment_Impl();

            state._fsp--;

             current =iv_ruleStartingMoment_Impl; 
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
    // $ANTLR end "entryRuleStartingMoment_Impl"


    // $ANTLR start "ruleStartingMoment_Impl"
    // InternalVideoMontage.g:1296:1: ruleStartingMoment_Impl returns [EObject current=null] : ( () otherlv_1= 'StartingMoment' ) ;
    public final EObject ruleStartingMoment_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:1302:2: ( ( () otherlv_1= 'StartingMoment' ) )
            // InternalVideoMontage.g:1303:2: ( () otherlv_1= 'StartingMoment' )
            {
            // InternalVideoMontage.g:1303:2: ( () otherlv_1= 'StartingMoment' )
            // InternalVideoMontage.g:1304:3: () otherlv_1= 'StartingMoment'
            {
            // InternalVideoMontage.g:1304:3: ()
            // InternalVideoMontage.g:1305:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartingMoment_ImplAccess().getStartingMomentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStartingMoment_ImplAccess().getStartingMomentKeyword_1());
            		

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
    // $ANTLR end "ruleStartingMoment_Impl"


    // $ANTLR start "entryRuleTransition"
    // InternalVideoMontage.g:1319:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalVideoMontage.g:1319:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalVideoMontage.g:1320:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalVideoMontage.g:1326:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioElement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_duration_3_0 = null;

        EObject lv_audioelement_5_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1332:2: ( (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioElement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' ) )
            // InternalVideoMontage.g:1333:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioElement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' )
            {
            // InternalVideoMontage.g:1333:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioElement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' )
            // InternalVideoMontage.g:1334:3: otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioElement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontage.g:1342:3: (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVideoMontage.g:1343:4: otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getDurationKeyword_2_0());
                    			
                    // InternalVideoMontage.g:1347:4: ( (lv_duration_3_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1348:5: (lv_duration_3_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1348:5: (lv_duration_3_0= ruleEDouble )
                    // InternalVideoMontage.g:1349:6: lv_duration_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getDurationEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_duration_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_3_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getAudioElementKeyword_3());
            		
            // InternalVideoMontage.g:1371:3: ( (lv_audioelement_5_0= ruleAudioElement ) )
            // InternalVideoMontage.g:1372:4: (lv_audioelement_5_0= ruleAudioElement )
            {
            // InternalVideoMontage.g:1372:4: (lv_audioelement_5_0= ruleAudioElement )
            // InternalVideoMontage.g:1373:5: lv_audioelement_5_0= ruleAudioElement
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getAudioelementAudioElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_18);
            lv_audioelement_5_0=ruleAudioElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"audioelement",
            						lv_audioelement_5_0,
            						"org.xtext.svjd.VideoMontage.AudioElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleTitle"
    // InternalVideoMontage.g:1398:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalVideoMontage.g:1398:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalVideoMontage.g:1399:2: iv_ruleTitle= ruleTitle EOF
            {
             newCompositeNode(grammarAccess.getTitleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitle=ruleTitle();

            state._fsp--;

             current =iv_ruleTitle; 
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
    // $ANTLR end "entryRuleTitle"


    // $ANTLR start "ruleTitle"
    // InternalVideoMontage.g:1405:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'Title' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )? otherlv_6= 'textArea' ( (lv_textarea_7_0= ruleTextArea ) ) otherlv_8= '}' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_duration_3_0 = null;

        Enumerator lv_backgroundColor_5_0 = null;

        EObject lv_textarea_7_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1411:2: ( (otherlv_0= 'Title' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )? otherlv_6= 'textArea' ( (lv_textarea_7_0= ruleTextArea ) ) otherlv_8= '}' ) )
            // InternalVideoMontage.g:1412:2: (otherlv_0= 'Title' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )? otherlv_6= 'textArea' ( (lv_textarea_7_0= ruleTextArea ) ) otherlv_8= '}' )
            {
            // InternalVideoMontage.g:1412:2: (otherlv_0= 'Title' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )? otherlv_6= 'textArea' ( (lv_textarea_7_0= ruleTextArea ) ) otherlv_8= '}' )
            // InternalVideoMontage.g:1413:3: otherlv_0= 'Title' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )? otherlv_6= 'textArea' ( (lv_textarea_7_0= ruleTextArea ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontage.g:1421:3: (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVideoMontage.g:1422:4: otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getTitleAccess().getDurationKeyword_2_0());
                    			
                    // InternalVideoMontage.g:1426:4: ( (lv_duration_3_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1427:5: (lv_duration_3_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1427:5: (lv_duration_3_0= ruleEDouble )
                    // InternalVideoMontage.g:1428:6: lv_duration_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTitleAccess().getDurationEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_duration_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTitleRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_3_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1446:3: (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVideoMontage.g:1447:4: otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) )
                    {
                    otherlv_4=(Token)match(input,37,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getTitleAccess().getBackgroundColorKeyword_3_0());
                    			
                    // InternalVideoMontage.g:1451:4: ( (lv_backgroundColor_5_0= ruleColor ) )
                    // InternalVideoMontage.g:1452:5: (lv_backgroundColor_5_0= ruleColor )
                    {
                    // InternalVideoMontage.g:1452:5: (lv_backgroundColor_5_0= ruleColor )
                    // InternalVideoMontage.g:1453:6: lv_backgroundColor_5_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getTitleAccess().getBackgroundColorColorEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_backgroundColor_5_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTitleRule());
                    						}
                    						set(
                    							current,
                    							"backgroundColor",
                    							lv_backgroundColor_5_0,
                    							"org.xtext.svjd.VideoMontage.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getTitleAccess().getTextAreaKeyword_4());
            		
            // InternalVideoMontage.g:1475:3: ( (lv_textarea_7_0= ruleTextArea ) )
            // InternalVideoMontage.g:1476:4: (lv_textarea_7_0= ruleTextArea )
            {
            // InternalVideoMontage.g:1476:4: (lv_textarea_7_0= ruleTextArea )
            // InternalVideoMontage.g:1477:5: lv_textarea_7_0= ruleTextArea
            {

            					newCompositeNode(grammarAccess.getTitleAccess().getTextareaTextAreaParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_textarea_7_0=ruleTextArea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleRule());
            					}
            					set(
            						current,
            						"textarea",
            						lv_textarea_7_0,
            						"org.xtext.svjd.VideoMontage.TextArea");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTitle"


    // $ANTLR start "entryRuleTextArea_Impl"
    // InternalVideoMontage.g:1502:1: entryRuleTextArea_Impl returns [EObject current=null] : iv_ruleTextArea_Impl= ruleTextArea_Impl EOF ;
    public final EObject entryRuleTextArea_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea_Impl = null;


        try {
            // InternalVideoMontage.g:1502:54: (iv_ruleTextArea_Impl= ruleTextArea_Impl EOF )
            // InternalVideoMontage.g:1503:2: iv_ruleTextArea_Impl= ruleTextArea_Impl EOF
            {
             newCompositeNode(grammarAccess.getTextArea_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextArea_Impl=ruleTextArea_Impl();

            state._fsp--;

             current =iv_ruleTextArea_Impl; 
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
    // $ANTLR end "entryRuleTextArea_Impl"


    // $ANTLR start "ruleTextArea_Impl"
    // InternalVideoMontage.g:1509:1: ruleTextArea_Impl returns [EObject current=null] : (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) ) (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )? otherlv_17= '}' ) ;
    public final EObject ruleTextArea_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;

        AntlrDatatypeRuleToken lv_width_7_0 = null;

        AntlrDatatypeRuleToken lv_height_9_0 = null;

        AntlrDatatypeRuleToken lv_text_11_0 = null;

        EObject lv_animation_15_0 = null;

        EObject lv_animation_16_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1515:2: ( (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) ) (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )? otherlv_17= '}' ) )
            // InternalVideoMontage.g:1516:2: (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) ) (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )? otherlv_17= '}' )
            {
            // InternalVideoMontage.g:1516:2: (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) ) (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )? otherlv_17= '}' )
            // InternalVideoMontage.g:1517:3: otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) ) (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextArea_ImplAccess().getTextAreaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getTextArea_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontage.g:1525:3: (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVideoMontage.g:1526:4: otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextArea_ImplAccess().getXKeyword_2_0());
                    			
                    // InternalVideoMontage.g:1530:4: ( (lv_x_3_0= ruleEInt ) )
                    // InternalVideoMontage.g:1531:5: (lv_x_3_0= ruleEInt )
                    {
                    // InternalVideoMontage.g:1531:5: (lv_x_3_0= ruleEInt )
                    // InternalVideoMontage.g:1532:6: lv_x_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getXEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_x_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    						}
                    						set(
                    							current,
                    							"x",
                    							lv_x_3_0,
                    							"org.xtext.svjd.VideoMontage.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1550:3: (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVideoMontage.g:1551:4: otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_45); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextArea_ImplAccess().getYKeyword_3_0());
                    			
                    // InternalVideoMontage.g:1555:4: ( (lv_y_5_0= ruleEInt ) )
                    // InternalVideoMontage.g:1556:5: (lv_y_5_0= ruleEInt )
                    {
                    // InternalVideoMontage.g:1556:5: (lv_y_5_0= ruleEInt )
                    // InternalVideoMontage.g:1557:6: lv_y_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getYEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_47);
                    lv_y_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    						}
                    						set(
                    							current,
                    							"y",
                    							lv_y_5_0,
                    							"org.xtext.svjd.VideoMontage.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1575:3: (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVideoMontage.g:1576:4: otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextArea_ImplAccess().getWidthKeyword_4_0());
                    			
                    // InternalVideoMontage.g:1580:4: ( (lv_width_7_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1581:5: (lv_width_7_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1581:5: (lv_width_7_0= ruleEDouble )
                    // InternalVideoMontage.g:1582:6: lv_width_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getWidthEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_width_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_7_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1600:3: (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVideoMontage.g:1601:4: otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextArea_ImplAccess().getHeightKeyword_5_0());
                    			
                    // InternalVideoMontage.g:1605:4: ( (lv_height_9_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1606:5: (lv_height_9_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1606:5: (lv_height_9_0= ruleEDouble )
                    // InternalVideoMontage.g:1607:6: lv_height_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getHeightEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_49);
                    lv_height_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_9_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1625:3: (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )
            // InternalVideoMontage.g:1626:4: otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) )
            {
            otherlv_10=(Token)match(input,43,FOLLOW_3); 

            				newLeafNode(otherlv_10, grammarAccess.getTextArea_ImplAccess().getTextKeyword_6_0());
            			
            // InternalVideoMontage.g:1630:4: ( (lv_text_11_0= ruleEString ) )
            // InternalVideoMontage.g:1631:5: (lv_text_11_0= ruleEString )
            {
            // InternalVideoMontage.g:1631:5: (lv_text_11_0= ruleEString )
            // InternalVideoMontage.g:1632:6: lv_text_11_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getTextEStringParserRuleCall_6_1_0());
            					
            pushFollow(FOLLOW_50);
            lv_text_11_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
            						}
            						set(
            							current,
            							"text",
            							lv_text_11_0,
            							"org.xtext.svjd.VideoMontage.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalVideoMontage.g:1650:3: (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVideoMontage.g:1651:4: otherlv_12= 'font' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_36); 

                    				newLeafNode(otherlv_12, grammarAccess.getTextArea_ImplAccess().getFontKeyword_7_0());
                    			
                    // InternalVideoMontage.g:1655:4: ( (otherlv_13= RULE_ID ) )
                    // InternalVideoMontage.g:1656:5: (otherlv_13= RULE_ID )
                    {
                    // InternalVideoMontage.g:1656:5: (otherlv_13= RULE_ID )
                    // InternalVideoMontage.g:1657:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextArea_ImplRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_51); 

                    						newLeafNode(otherlv_13, grammarAccess.getTextArea_ImplAccess().getFontFontCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1669:3: (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVideoMontage.g:1670:4: otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )*
                    {
                    otherlv_14=(Token)match(input,45,FOLLOW_52); 

                    				newLeafNode(otherlv_14, grammarAccess.getTextArea_ImplAccess().getAnimationKeyword_8_0());
                    			
                    // InternalVideoMontage.g:1674:4: ( (lv_animation_15_0= ruleAnimation ) )
                    // InternalVideoMontage.g:1675:5: (lv_animation_15_0= ruleAnimation )
                    {
                    // InternalVideoMontage.g:1675:5: (lv_animation_15_0= ruleAnimation )
                    // InternalVideoMontage.g:1676:6: lv_animation_15_0= ruleAnimation
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_animation_15_0=ruleAnimation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    						}
                    						add(
                    							current,
                    							"animation",
                    							lv_animation_15_0,
                    							"org.xtext.svjd.VideoMontage.Animation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVideoMontage.g:1693:4: ( (lv_animation_16_0= ruleAnimation ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>=49 && LA31_0<=50)) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalVideoMontage.g:1694:5: (lv_animation_16_0= ruleAnimation )
                    	    {
                    	    // InternalVideoMontage.g:1694:5: (lv_animation_16_0= ruleAnimation )
                    	    // InternalVideoMontage.g:1695:6: lv_animation_16_0= ruleAnimation
                    	    {

                    	    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_53);
                    	    lv_animation_16_0=ruleAnimation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"animation",
                    	    							lv_animation_16_0,
                    	    							"org.xtext.svjd.VideoMontage.Animation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getTextArea_ImplAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleTextArea_Impl"


    // $ANTLR start "entryRuleTextAreaDynamic"
    // InternalVideoMontage.g:1721:1: entryRuleTextAreaDynamic returns [EObject current=null] : iv_ruleTextAreaDynamic= ruleTextAreaDynamic EOF ;
    public final EObject entryRuleTextAreaDynamic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAreaDynamic = null;


        try {
            // InternalVideoMontage.g:1721:56: (iv_ruleTextAreaDynamic= ruleTextAreaDynamic EOF )
            // InternalVideoMontage.g:1722:2: iv_ruleTextAreaDynamic= ruleTextAreaDynamic EOF
            {
             newCompositeNode(grammarAccess.getTextAreaDynamicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextAreaDynamic=ruleTextAreaDynamic();

            state._fsp--;

             current =iv_ruleTextAreaDynamic; 
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
    // $ANTLR end "entryRuleTextAreaDynamic"


    // $ANTLR start "ruleTextAreaDynamic"
    // InternalVideoMontage.g:1728:1: ruleTextAreaDynamic returns [EObject current=null] : (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )? otherlv_21= '}' ) ;
    public final EObject ruleTextAreaDynamic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;

        AntlrDatatypeRuleToken lv_width_7_0 = null;

        AntlrDatatypeRuleToken lv_height_9_0 = null;

        AntlrDatatypeRuleToken lv_text_11_0 = null;

        AntlrDatatypeRuleToken lv_textSrc_13_0 = null;

        AntlrDatatypeRuleToken lv_line_15_0 = null;

        EObject lv_animation_19_0 = null;

        EObject lv_animation_20_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1734:2: ( (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )? otherlv_21= '}' ) )
            // InternalVideoMontage.g:1735:2: (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )? otherlv_21= '}' )
            {
            // InternalVideoMontage.g:1735:2: (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )? otherlv_21= '}' )
            // InternalVideoMontage.g:1736:3: otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAreaDynamicAccess().getTextAreaDynamicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAreaDynamicAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontage.g:1744:3: (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVideoMontage.g:1745:4: otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextAreaDynamicAccess().getXKeyword_2_0());
                    			
                    // InternalVideoMontage.g:1749:4: ( (lv_x_3_0= ruleEInt ) )
                    // InternalVideoMontage.g:1750:5: (lv_x_3_0= ruleEInt )
                    {
                    // InternalVideoMontage.g:1750:5: (lv_x_3_0= ruleEInt )
                    // InternalVideoMontage.g:1751:6: lv_x_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getXEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_x_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"x",
                    							lv_x_3_0,
                    							"org.xtext.svjd.VideoMontage.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1769:3: (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVideoMontage.g:1770:4: otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_45); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextAreaDynamicAccess().getYKeyword_3_0());
                    			
                    // InternalVideoMontage.g:1774:4: ( (lv_y_5_0= ruleEInt ) )
                    // InternalVideoMontage.g:1775:5: (lv_y_5_0= ruleEInt )
                    {
                    // InternalVideoMontage.g:1775:5: (lv_y_5_0= ruleEInt )
                    // InternalVideoMontage.g:1776:6: lv_y_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getYEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_y_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"y",
                    							lv_y_5_0,
                    							"org.xtext.svjd.VideoMontage.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1794:3: (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==41) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVideoMontage.g:1795:4: otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextAreaDynamicAccess().getWidthKeyword_4_0());
                    			
                    // InternalVideoMontage.g:1799:4: ( (lv_width_7_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1800:5: (lv_width_7_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1800:5: (lv_width_7_0= ruleEDouble )
                    // InternalVideoMontage.g:1801:6: lv_width_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getWidthEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_width_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_7_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1819:3: (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==42) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVideoMontage.g:1820:4: otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextAreaDynamicAccess().getHeightKeyword_5_0());
                    			
                    // InternalVideoMontage.g:1824:4: ( (lv_height_9_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1825:5: (lv_height_9_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1825:5: (lv_height_9_0= ruleEDouble )
                    // InternalVideoMontage.g:1826:6: lv_height_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getHeightEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_58);
                    lv_height_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_9_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1844:3: (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVideoMontage.g:1845:4: otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextAreaDynamicAccess().getTextKeyword_6_0());
                    			
                    // InternalVideoMontage.g:1849:4: ( (lv_text_11_0= ruleEString ) )
                    // InternalVideoMontage.g:1850:5: (lv_text_11_0= ruleEString )
                    {
                    // InternalVideoMontage.g:1850:5: (lv_text_11_0= ruleEString )
                    // InternalVideoMontage.g:1851:6: lv_text_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getTextEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_text_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_11_0,
                    							"org.xtext.svjd.VideoMontage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1869:3: (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVideoMontage.g:1870:4: otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getTextAreaDynamicAccess().getTextSrcKeyword_7_0());
                    			
                    // InternalVideoMontage.g:1874:4: ( (lv_textSrc_13_0= ruleEString ) )
                    // InternalVideoMontage.g:1875:5: (lv_textSrc_13_0= ruleEString )
                    {
                    // InternalVideoMontage.g:1875:5: (lv_textSrc_13_0= ruleEString )
                    // InternalVideoMontage.g:1876:6: lv_textSrc_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getTextSrcEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_textSrc_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"textSrc",
                    							lv_textSrc_13_0,
                    							"org.xtext.svjd.VideoMontage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1894:3: (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVideoMontage.g:1895:4: otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) )
                    {
                    otherlv_14=(Token)match(input,48,FOLLOW_45); 

                    				newLeafNode(otherlv_14, grammarAccess.getTextAreaDynamicAccess().getLineKeyword_8_0());
                    			
                    // InternalVideoMontage.g:1899:4: ( (lv_line_15_0= ruleEInt ) )
                    // InternalVideoMontage.g:1900:5: (lv_line_15_0= ruleEInt )
                    {
                    // InternalVideoMontage.g:1900:5: (lv_line_15_0= ruleEInt )
                    // InternalVideoMontage.g:1901:6: lv_line_15_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getLineEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_line_15_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"line",
                    							lv_line_15_0,
                    							"org.xtext.svjd.VideoMontage.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getTextAreaDynamicAccess().getFontKeyword_9());
            		
            // InternalVideoMontage.g:1923:3: ( ( ruleEString ) )
            // InternalVideoMontage.g:1924:4: ( ruleEString )
            {
            // InternalVideoMontage.g:1924:4: ( ruleEString )
            // InternalVideoMontage.g:1925:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextAreaDynamicRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getFontFontCrossReference_10_0());
            				
            pushFollow(FOLLOW_51);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:1939:3: (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalVideoMontage.g:1940:4: otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )*
                    {
                    otherlv_18=(Token)match(input,45,FOLLOW_52); 

                    				newLeafNode(otherlv_18, grammarAccess.getTextAreaDynamicAccess().getAnimationKeyword_11_0());
                    			
                    // InternalVideoMontage.g:1944:4: ( (lv_animation_19_0= ruleAnimation ) )
                    // InternalVideoMontage.g:1945:5: (lv_animation_19_0= ruleAnimation )
                    {
                    // InternalVideoMontage.g:1945:5: (lv_animation_19_0= ruleAnimation )
                    // InternalVideoMontage.g:1946:6: lv_animation_19_0= ruleAnimation
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_animation_19_0=ruleAnimation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						add(
                    							current,
                    							"animation",
                    							lv_animation_19_0,
                    							"org.xtext.svjd.VideoMontage.Animation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVideoMontage.g:1963:4: ( (lv_animation_20_0= ruleAnimation ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=49 && LA40_0<=50)) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalVideoMontage.g:1964:5: (lv_animation_20_0= ruleAnimation )
                    	    {
                    	    // InternalVideoMontage.g:1964:5: (lv_animation_20_0= ruleAnimation )
                    	    // InternalVideoMontage.g:1965:6: lv_animation_20_0= ruleAnimation
                    	    {

                    	    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_2_0());
                    	    					
                    	    pushFollow(FOLLOW_53);
                    	    lv_animation_20_0=ruleAnimation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"animation",
                    	    							lv_animation_20_0,
                    	    							"org.xtext.svjd.VideoMontage.Animation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getTextAreaDynamicAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleTextAreaDynamic"


    // $ANTLR start "entryRuleFadeIn"
    // InternalVideoMontage.g:1991:1: entryRuleFadeIn returns [EObject current=null] : iv_ruleFadeIn= ruleFadeIn EOF ;
    public final EObject entryRuleFadeIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeIn = null;


        try {
            // InternalVideoMontage.g:1991:47: (iv_ruleFadeIn= ruleFadeIn EOF )
            // InternalVideoMontage.g:1992:2: iv_ruleFadeIn= ruleFadeIn EOF
            {
             newCompositeNode(grammarAccess.getFadeInRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFadeIn=ruleFadeIn();

            state._fsp--;

             current =iv_ruleFadeIn; 
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
    // $ANTLR end "entryRuleFadeIn"


    // $ANTLR start "ruleFadeIn"
    // InternalVideoMontage.g:1998:1: ruleFadeIn returns [EObject current=null] : ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleFadeIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_duration_4_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:2004:2: ( ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalVideoMontage.g:2005:2: ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalVideoMontage.g:2005:2: ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalVideoMontage.g:2006:3: () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalVideoMontage.g:2006:3: ()
            // InternalVideoMontage.g:2007:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFadeInAccess().getFadeInAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFadeInAccess().getFadeInKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeInAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:2021:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==19) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVideoMontage.g:2022:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getFadeInAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontage.g:2026:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontage.g:2027:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:2027:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontage.g:2028:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getFadeInAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_duration_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFadeInRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_4_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFadeInAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFadeIn"


    // $ANTLR start "entryRuleFadeOut"
    // InternalVideoMontage.g:2054:1: entryRuleFadeOut returns [EObject current=null] : iv_ruleFadeOut= ruleFadeOut EOF ;
    public final EObject entryRuleFadeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeOut = null;


        try {
            // InternalVideoMontage.g:2054:48: (iv_ruleFadeOut= ruleFadeOut EOF )
            // InternalVideoMontage.g:2055:2: iv_ruleFadeOut= ruleFadeOut EOF
            {
             newCompositeNode(grammarAccess.getFadeOutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFadeOut=ruleFadeOut();

            state._fsp--;

             current =iv_ruleFadeOut; 
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
    // $ANTLR end "entryRuleFadeOut"


    // $ANTLR start "ruleFadeOut"
    // InternalVideoMontage.g:2061:1: ruleFadeOut returns [EObject current=null] : ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleFadeOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_duration_4_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:2067:2: ( ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalVideoMontage.g:2068:2: ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalVideoMontage.g:2068:2: ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalVideoMontage.g:2069:3: () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalVideoMontage.g:2069:3: ()
            // InternalVideoMontage.g:2070:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFadeOutAccess().getFadeOutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFadeOutAccess().getFadeOutKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeOutAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:2084:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==19) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVideoMontage.g:2085:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getFadeOutAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontage.g:2089:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontage.g:2090:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:2090:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontage.g:2091:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getFadeOutAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_duration_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFadeOutRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_4_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFadeOutAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleFadeOut"


    // $ANTLR start "entryRuleEDouble"
    // InternalVideoMontage.g:2117:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalVideoMontage.g:2117:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalVideoMontage.g:2118:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalVideoMontage.g:2124:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:2130:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalVideoMontage.g:2131:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalVideoMontage.g:2131:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalVideoMontage.g:2132:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalVideoMontage.g:2132:3: (kw= '-' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==51) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalVideoMontage.g:2133:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_63); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalVideoMontage.g:2139:3: (this_INT_1= RULE_INT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_INT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalVideoMontage.g:2140:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_64); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,52,FOLLOW_65); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_66); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalVideoMontage.g:2160:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=53 && LA48_0<=54)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalVideoMontage.g:2161:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalVideoMontage.g:2161:4: (kw= 'E' | kw= 'e' )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==53) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==54) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalVideoMontage.g:2162:5: kw= 'E'
                            {
                            kw=(Token)match(input,53,FOLLOW_45); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalVideoMontage.g:2168:5: kw= 'e'
                            {
                            kw=(Token)match(input,54,FOLLOW_45); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalVideoMontage.g:2174:4: (kw= '-' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==51) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalVideoMontage.g:2175:5: kw= '-'
                            {
                            kw=(Token)match(input,51,FOLLOW_65); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalVideoMontage.g:2193:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalVideoMontage.g:2193:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalVideoMontage.g:2194:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalVideoMontage.g:2200:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:2206:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalVideoMontage.g:2207:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalVideoMontage.g:2207:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalVideoMontage.g:2208:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalVideoMontage.g:2208:3: (kw= '-' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==51) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalVideoMontage.g:2209:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_65); 

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


    // $ANTLR start "ruleOperationMoment"
    // InternalVideoMontage.g:2226:1: ruleOperationMoment returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOperationMoment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:2232:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalVideoMontage.g:2233:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalVideoMontage.g:2233:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==55) ) {
                alt50=1;
            }
            else if ( (LA50_0==51) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalVideoMontage.g:2234:3: (enumLiteral_0= '+' )
                    {
                    // InternalVideoMontage.g:2234:3: (enumLiteral_0= '+' )
                    // InternalVideoMontage.g:2235:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getOperationMomentAccess().getAdditionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationMomentAccess().getAdditionEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:2242:3: (enumLiteral_1= '-' )
                    {
                    // InternalVideoMontage.g:2242:3: (enumLiteral_1= '-' )
                    // InternalVideoMontage.g:2243:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getOperationMomentAccess().getSoustractionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperationMomentAccess().getSoustractionEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleOperationMoment"


    // $ANTLR start "ruleMoment"
    // InternalVideoMontage.g:2253:1: ruleMoment returns [Enumerator current=null] : ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) ) ;
    public final Enumerator ruleMoment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:2259:2: ( ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) ) )
            // InternalVideoMontage.g:2260:2: ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) )
            {
            // InternalVideoMontage.g:2260:2: ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==56) ) {
                alt51=1;
            }
            else if ( (LA51_0==57) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalVideoMontage.g:2261:3: (enumLiteral_0= 'starting' )
                    {
                    // InternalVideoMontage.g:2261:3: (enumLiteral_0= 'starting' )
                    // InternalVideoMontage.g:2262:4: enumLiteral_0= 'starting'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:2269:3: (enumLiteral_1= 'ending' )
                    {
                    // InternalVideoMontage.g:2269:3: (enumLiteral_1= 'ending' )
                    // InternalVideoMontage.g:2270:4: enumLiteral_1= 'ending'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getMomentAccess().getEndingEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMomentAccess().getEndingEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleMoment"


    // $ANTLR start "ruleColor"
    // InternalVideoMontage.g:2280:1: ruleColor returns [Enumerator current=null] : (enumLiteral_0= 'BLACK' ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:2286:2: ( (enumLiteral_0= 'BLACK' ) )
            // InternalVideoMontage.g:2287:2: (enumLiteral_0= 'BLACK' )
            {
            // InternalVideoMontage.g:2287:2: (enumLiteral_0= 'BLACK' )
            // InternalVideoMontage.g:2288:3: enumLiteral_0= 'BLACK'
            {
            enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

            			current = grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getBLACKEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleColor"


    // $ANTLR start "ruleFontStyle"
    // InternalVideoMontage.g:2297:1: ruleFontStyle returns [Enumerator current=null] : (enumLiteral_0= 'COMIC_SANS_MS' ) ;
    public final Enumerator ruleFontStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:2303:2: ( (enumLiteral_0= 'COMIC_SANS_MS' ) )
            // InternalVideoMontage.g:2304:2: (enumLiteral_0= 'COMIC_SANS_MS' )
            {
            // InternalVideoMontage.g:2304:2: (enumLiteral_0= 'COMIC_SANS_MS' )
            // InternalVideoMontage.g:2305:3: enumLiteral_0= 'COMIC_SANS_MS'
            {
            enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

            			current = grammarAccess.getFontStyleAccess().getCOMIC_SANS_MSEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getFontStyleAccess().getCOMIC_SANS_MSEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleFontStyle"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001020000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0300000680000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0018000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000004C002000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000048002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001020002030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0018000000000042L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000002000180000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000F8000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000300000002000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0006000000002000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00019F8000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00019F0000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00019E0000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00019C0000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0001980000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0001900000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0060000000000002L});

}