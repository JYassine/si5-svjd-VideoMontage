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
import org.xtext.svjd.services.VideoMontageSVJDGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoMontageSVJDParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Movie'", "'{'", "'}'", "'audioElement'", "'videoElement'", "'timeline'", "'Subtitle'", "'start'", "':'", "'duration'", "'textArea'", "'Audio'", "'path'", "'transition'", "'AudioClip'", "'volume'", "'startCut'", "'endCut'", "'audio'", "'Clip'", "'video'", "'Title'", "'backgroundColor'", "'of'", "'time'", "'StartingMoment'", "'Transition'", "'TextArea'", "'x'", "'y'", "'width'", "'height'", "'text'", "'font'", "'animation'", "'TextAreaDynamic'", "'textSrc'", "'line'", "'ScrollingText'", "'speed'", "'FadeIn'", "'FadeOut'", "'-'", "'.'", "'E'", "'e'", "'+'", "'starting'", "'ending'", "'BLACK'", "'COMIC_SANS_MS'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

        public InternalVideoMontageSVJDParser(TokenStream input, VideoMontageSVJDGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Movie";
       	}

       	@Override
       	protected VideoMontageSVJDGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMovie"
    // InternalVideoMontageSVJD.g:65:1: entryRuleMovie returns [EObject current=null] : iv_ruleMovie= ruleMovie EOF ;
    public final EObject entryRuleMovie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovie = null;


        try {
            // InternalVideoMontageSVJD.g:65:46: (iv_ruleMovie= ruleMovie EOF )
            // InternalVideoMontageSVJD.g:66:2: iv_ruleMovie= ruleMovie EOF
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
    // InternalVideoMontageSVJD.g:72:1: ruleMovie returns [EObject current=null] : (otherlv_0= 'Movie' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_videoelement_3_0= ruleVideoElement ) ) ( (lv_videoelement_4_0= ruleVideoElement ) )* ( ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* )? ( ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* )? ( (lv_VideoTimeline_9_0= ruleVideoTimeLine ) ) otherlv_10= '}' ) ;
    public final EObject ruleMovie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_title_1_0 = null;

        EObject lv_videoelement_3_0 = null;

        EObject lv_videoelement_4_0 = null;

        EObject lv_audioelement_5_0 = null;

        EObject lv_audioelement_6_0 = null;

        EObject lv_subtitle_7_0 = null;

        EObject lv_subtitle_8_0 = null;

        EObject lv_VideoTimeline_9_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:78:2: ( (otherlv_0= 'Movie' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_videoelement_3_0= ruleVideoElement ) ) ( (lv_videoelement_4_0= ruleVideoElement ) )* ( ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* )? ( ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* )? ( (lv_VideoTimeline_9_0= ruleVideoTimeLine ) ) otherlv_10= '}' ) )
            // InternalVideoMontageSVJD.g:79:2: (otherlv_0= 'Movie' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_videoelement_3_0= ruleVideoElement ) ) ( (lv_videoelement_4_0= ruleVideoElement ) )* ( ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* )? ( ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* )? ( (lv_VideoTimeline_9_0= ruleVideoTimeLine ) ) otherlv_10= '}' )
            {
            // InternalVideoMontageSVJD.g:79:2: (otherlv_0= 'Movie' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_videoelement_3_0= ruleVideoElement ) ) ( (lv_videoelement_4_0= ruleVideoElement ) )* ( ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* )? ( ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* )? ( (lv_VideoTimeline_9_0= ruleVideoTimeLine ) ) otherlv_10= '}' )
            // InternalVideoMontageSVJD.g:80:3: otherlv_0= 'Movie' ( (lv_title_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_videoelement_3_0= ruleVideoElement ) ) ( (lv_videoelement_4_0= ruleVideoElement ) )* ( ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* )? ( ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* )? ( (lv_VideoTimeline_9_0= ruleVideoTimeLine ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMovieAccess().getMovieKeyword_0());
            		
            // InternalVideoMontageSVJD.g:84:3: ( (lv_title_1_0= ruleEString ) )
            // InternalVideoMontageSVJD.g:85:4: (lv_title_1_0= ruleEString )
            {
            // InternalVideoMontageSVJD.g:85:4: (lv_title_1_0= ruleEString )
            // InternalVideoMontageSVJD.g:86:5: lv_title_1_0= ruleEString
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
            						"org.xtext.svjd.VideoMontageSVJD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontageSVJD.g:107:3: ( (lv_videoelement_3_0= ruleVideoElement ) )
            // InternalVideoMontageSVJD.g:108:4: (lv_videoelement_3_0= ruleVideoElement )
            {
            // InternalVideoMontageSVJD.g:108:4: (lv_videoelement_3_0= ruleVideoElement )
            // InternalVideoMontageSVJD.g:109:5: lv_videoelement_3_0= ruleVideoElement
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
            						"org.xtext.svjd.VideoMontageSVJD.VideoElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontageSVJD.g:126:3: ( (lv_videoelement_4_0= ruleVideoElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVideoMontageSVJD.g:127:4: (lv_videoelement_4_0= ruleVideoElement )
            	    {
            	    // InternalVideoMontageSVJD.g:127:4: (lv_videoelement_4_0= ruleVideoElement )
            	    // InternalVideoMontageSVJD.g:128:5: lv_videoelement_4_0= ruleVideoElement
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
            	    						"org.xtext.svjd.VideoMontageSVJD.VideoElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalVideoMontageSVJD.g:145:3: ( ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVideoMontageSVJD.g:146:4: ( (lv_audioelement_5_0= ruleAudioElement ) ) ( (lv_audioelement_6_0= ruleAudioElement ) )*
                    {
                    // InternalVideoMontageSVJD.g:146:4: ( (lv_audioelement_5_0= ruleAudioElement ) )
                    // InternalVideoMontageSVJD.g:147:5: (lv_audioelement_5_0= ruleAudioElement )
                    {
                    // InternalVideoMontageSVJD.g:147:5: (lv_audioelement_5_0= ruleAudioElement )
                    // InternalVideoMontageSVJD.g:148:6: lv_audioelement_5_0= ruleAudioElement
                    {

                    						newCompositeNode(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_audioelement_5_0=ruleAudioElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMovieRule());
                    						}
                    						add(
                    							current,
                    							"audioelement",
                    							lv_audioelement_5_0,
                    							"org.xtext.svjd.VideoMontageSVJD.AudioElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVideoMontageSVJD.g:165:4: ( (lv_audioelement_6_0= ruleAudioElement ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalVideoMontageSVJD.g:166:5: (lv_audioelement_6_0= ruleAudioElement )
                    	    {
                    	    // InternalVideoMontageSVJD.g:166:5: (lv_audioelement_6_0= ruleAudioElement )
                    	    // InternalVideoMontageSVJD.g:167:6: lv_audioelement_6_0= ruleAudioElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_audioelement_6_0=ruleAudioElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMovieRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"audioelement",
                    	    							lv_audioelement_6_0,
                    	    							"org.xtext.svjd.VideoMontageSVJD.AudioElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:185:3: ( ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVideoMontageSVJD.g:186:4: ( (lv_subtitle_7_0= ruleSubtitle ) ) ( (lv_subtitle_8_0= ruleSubtitle ) )*
                    {
                    // InternalVideoMontageSVJD.g:186:4: ( (lv_subtitle_7_0= ruleSubtitle ) )
                    // InternalVideoMontageSVJD.g:187:5: (lv_subtitle_7_0= ruleSubtitle )
                    {
                    // InternalVideoMontageSVJD.g:187:5: (lv_subtitle_7_0= ruleSubtitle )
                    // InternalVideoMontageSVJD.g:188:6: lv_subtitle_7_0= ruleSubtitle
                    {

                    						newCompositeNode(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_subtitle_7_0=ruleSubtitle();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMovieRule());
                    						}
                    						add(
                    							current,
                    							"subtitle",
                    							lv_subtitle_7_0,
                    							"org.xtext.svjd.VideoMontageSVJD.Subtitle");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVideoMontageSVJD.g:205:4: ( (lv_subtitle_8_0= ruleSubtitle ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalVideoMontageSVJD.g:206:5: (lv_subtitle_8_0= ruleSubtitle )
                    	    {
                    	    // InternalVideoMontageSVJD.g:206:5: (lv_subtitle_8_0= ruleSubtitle )
                    	    // InternalVideoMontageSVJD.g:207:6: lv_subtitle_8_0= ruleSubtitle
                    	    {

                    	    						newCompositeNode(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_subtitle_8_0=ruleSubtitle();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMovieRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"subtitle",
                    	    							lv_subtitle_8_0,
                    	    							"org.xtext.svjd.VideoMontageSVJD.Subtitle");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:225:3: ( (lv_VideoTimeline_9_0= ruleVideoTimeLine ) )
            // InternalVideoMontageSVJD.g:226:4: (lv_VideoTimeline_9_0= ruleVideoTimeLine )
            {
            // InternalVideoMontageSVJD.g:226:4: (lv_VideoTimeline_9_0= ruleVideoTimeLine )
            // InternalVideoMontageSVJD.g:227:5: lv_VideoTimeline_9_0= ruleVideoTimeLine
            {

            					newCompositeNode(grammarAccess.getMovieAccess().getVideoTimelineVideoTimeLineParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_VideoTimeline_9_0=ruleVideoTimeLine();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovieRule());
            					}
            					set(
            						current,
            						"VideoTimeline",
            						lv_VideoTimeline_9_0,
            						"org.xtext.svjd.VideoMontageSVJD.VideoTimeLine");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalVideoMontageSVJD.g:252:1: entryRuleAudioElement returns [EObject current=null] : iv_ruleAudioElement= ruleAudioElement EOF ;
    public final EObject entryRuleAudioElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioElement = null;


        try {
            // InternalVideoMontageSVJD.g:252:53: (iv_ruleAudioElement= ruleAudioElement EOF )
            // InternalVideoMontageSVJD.g:253:2: iv_ruleAudioElement= ruleAudioElement EOF
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
    // InternalVideoMontageSVJD.g:259:1: ruleAudioElement returns [EObject current=null] : (otherlv_0= 'audioElement' (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip ) ) ;
    public final EObject ruleAudioElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Audio_1 = null;

        EObject this_AudioClip_2 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:265:2: ( (otherlv_0= 'audioElement' (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip ) ) )
            // InternalVideoMontageSVJD.g:266:2: (otherlv_0= 'audioElement' (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip ) )
            {
            // InternalVideoMontageSVJD.g:266:2: (otherlv_0= 'audioElement' (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip ) )
            // InternalVideoMontageSVJD.g:267:3: otherlv_0= 'audioElement' (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioElementAccess().getAudioElementKeyword_0());
            		
            // InternalVideoMontageSVJD.g:271:3: (this_Audio_1= ruleAudio | this_AudioClip_2= ruleAudioClip )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoMontageSVJD.g:272:4: this_Audio_1= ruleAudio
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
                    // InternalVideoMontageSVJD.g:281:4: this_AudioClip_2= ruleAudioClip
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
    // InternalVideoMontageSVJD.g:294:1: entryRuleVideoElement returns [EObject current=null] : iv_ruleVideoElement= ruleVideoElement EOF ;
    public final EObject entryRuleVideoElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoElement = null;


        try {
            // InternalVideoMontageSVJD.g:294:53: (iv_ruleVideoElement= ruleVideoElement EOF )
            // InternalVideoMontageSVJD.g:295:2: iv_ruleVideoElement= ruleVideoElement EOF
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
    // InternalVideoMontageSVJD.g:301:1: ruleVideoElement returns [EObject current=null] : (otherlv_0= 'videoElement' (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo ) ) ;
    public final EObject ruleVideoElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Title_1 = null;

        EObject this_Clip_2 = null;

        EObject this_Video_3 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:307:2: ( (otherlv_0= 'videoElement' (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo ) ) )
            // InternalVideoMontageSVJD.g:308:2: (otherlv_0= 'videoElement' (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo ) )
            {
            // InternalVideoMontageSVJD.g:308:2: (otherlv_0= 'videoElement' (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo ) )
            // InternalVideoMontageSVJD.g:309:3: otherlv_0= 'videoElement' (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoElementAccess().getVideoElementKeyword_0());
            		
            // InternalVideoMontageSVJD.g:313:3: (this_Title_1= ruleTitle | this_Clip_2= ruleClip | this_Video_3= ruleVideo )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
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
                    // InternalVideoMontageSVJD.g:314:4: this_Title_1= ruleTitle
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
                    // InternalVideoMontageSVJD.g:323:4: this_Clip_2= ruleClip
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
                    // InternalVideoMontageSVJD.g:332:4: this_Video_3= ruleVideo
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


    // $ANTLR start "entryRuleVideoTimeLine"
    // InternalVideoMontageSVJD.g:345:1: entryRuleVideoTimeLine returns [EObject current=null] : iv_ruleVideoTimeLine= ruleVideoTimeLine EOF ;
    public final EObject entryRuleVideoTimeLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoTimeLine = null;


        try {
            // InternalVideoMontageSVJD.g:345:54: (iv_ruleVideoTimeLine= ruleVideoTimeLine EOF )
            // InternalVideoMontageSVJD.g:346:2: iv_ruleVideoTimeLine= ruleVideoTimeLine EOF
            {
             newCompositeNode(grammarAccess.getVideoTimeLineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoTimeLine=ruleVideoTimeLine();

            state._fsp--;

             current =iv_ruleVideoTimeLine; 
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
    // $ANTLR end "entryRuleVideoTimeLine"


    // $ANTLR start "ruleVideoTimeLine"
    // InternalVideoMontageSVJD.g:352:1: ruleVideoTimeLine returns [EObject current=null] : (otherlv_0= 'timeline' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )* ) ;
    public final EObject ruleVideoTimeLine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:358:2: ( (otherlv_0= 'timeline' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )* ) )
            // InternalVideoMontageSVJD.g:359:2: (otherlv_0= 'timeline' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )* )
            {
            // InternalVideoMontageSVJD.g:359:2: (otherlv_0= 'timeline' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )* )
            // InternalVideoMontageSVJD.g:360:3: otherlv_0= 'timeline' ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )*
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoTimeLineAccess().getTimelineKeyword_0());
            		
            // InternalVideoMontageSVJD.g:364:3: ( (otherlv_1= RULE_ID ) )
            // InternalVideoMontageSVJD.g:365:4: (otherlv_1= RULE_ID )
            {
            // InternalVideoMontageSVJD.g:365:4: (otherlv_1= RULE_ID )
            // InternalVideoMontageSVJD.g:366:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVideoTimeLineRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_1, grammarAccess.getVideoTimeLineAccess().getVideosVideoElementCrossReference_1_0());
            				

            }


            }

            // InternalVideoMontageSVJD.g:377:3: ( (otherlv_2= RULE_ID ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVideoMontageSVJD.g:378:4: (otherlv_2= RULE_ID )
            	    {
            	    // InternalVideoMontageSVJD.g:378:4: (otherlv_2= RULE_ID )
            	    // InternalVideoMontageSVJD.g:379:5: otherlv_2= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getVideoTimeLineRule());
            	    					}
            	    				
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(otherlv_2, grammarAccess.getVideoTimeLineAccess().getVideosVideoElementCrossReference_2_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "ruleVideoTimeLine"


    // $ANTLR start "entryRuleTextArea"
    // InternalVideoMontageSVJD.g:394:1: entryRuleTextArea returns [EObject current=null] : iv_ruleTextArea= ruleTextArea EOF ;
    public final EObject entryRuleTextArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea = null;


        try {
            // InternalVideoMontageSVJD.g:394:49: (iv_ruleTextArea= ruleTextArea EOF )
            // InternalVideoMontageSVJD.g:395:2: iv_ruleTextArea= ruleTextArea EOF
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
    // InternalVideoMontageSVJD.g:401:1: ruleTextArea returns [EObject current=null] : (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic ) ;
    public final EObject ruleTextArea() throws RecognitionException {
        EObject current = null;

        EObject this_TextArea_Impl_0 = null;

        EObject this_TextAreaDynamic_1 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:407:2: ( (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic ) )
            // InternalVideoMontageSVJD.g:408:2: (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic )
            {
            // InternalVideoMontageSVJD.g:408:2: (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            else if ( (LA9_0==46) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoMontageSVJD.g:409:3: this_TextArea_Impl_0= ruleTextArea_Impl
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
                    // InternalVideoMontageSVJD.g:418:3: this_TextAreaDynamic_1= ruleTextAreaDynamic
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
    // InternalVideoMontageSVJD.g:430:1: entryRuleStartingMoment returns [EObject current=null] : iv_ruleStartingMoment= ruleStartingMoment EOF ;
    public final EObject entryRuleStartingMoment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingMoment = null;


        try {
            // InternalVideoMontageSVJD.g:430:55: (iv_ruleStartingMoment= ruleStartingMoment EOF )
            // InternalVideoMontageSVJD.g:431:2: iv_ruleStartingMoment= ruleStartingMoment EOF
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
    // InternalVideoMontageSVJD.g:437:1: ruleStartingMoment returns [EObject current=null] : (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment ) ;
    public final EObject ruleStartingMoment() throws RecognitionException {
        EObject current = null;

        EObject this_StartingMoment_Impl_0 = null;

        EObject this_RelativeMoment_1 = null;

        EObject this_AbsoluteMoment_2 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:443:2: ( (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment ) )
            // InternalVideoMontageSVJD.g:444:2: (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment )
            {
            // InternalVideoMontageSVJD.g:444:2: (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 34:
            case 58:
            case 59:
                {
                alt10=2;
                }
                break;
            case EOF:
            case 12:
            case 35:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalVideoMontageSVJD.g:445:3: this_StartingMoment_Impl_0= ruleStartingMoment_Impl
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
                    // InternalVideoMontageSVJD.g:454:3: this_RelativeMoment_1= ruleRelativeMoment
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
                    // InternalVideoMontageSVJD.g:463:3: this_AbsoluteMoment_2= ruleAbsoluteMoment
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
    // InternalVideoMontageSVJD.g:475:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalVideoMontageSVJD.g:475:50: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalVideoMontageSVJD.g:476:2: iv_ruleAnimation= ruleAnimation EOF
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
    // InternalVideoMontageSVJD.g:482:1: ruleAnimation returns [EObject current=null] : (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut | this_ScrollingText_2= ruleScrollingText ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        EObject this_FadeIn_0 = null;

        EObject this_FadeOut_1 = null;

        EObject this_ScrollingText_2 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:488:2: ( (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut | this_ScrollingText_2= ruleScrollingText ) )
            // InternalVideoMontageSVJD.g:489:2: (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut | this_ScrollingText_2= ruleScrollingText )
            {
            // InternalVideoMontageSVJD.g:489:2: (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut | this_ScrollingText_2= ruleScrollingText )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt11=1;
                }
                break;
            case 52:
                {
                alt11=2;
                }
                break;
            case 49:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalVideoMontageSVJD.g:490:3: this_FadeIn_0= ruleFadeIn
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
                    // InternalVideoMontageSVJD.g:499:3: this_FadeOut_1= ruleFadeOut
                    {

                    			newCompositeNode(grammarAccess.getAnimationAccess().getFadeOutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FadeOut_1=ruleFadeOut();

                    state._fsp--;


                    			current = this_FadeOut_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVideoMontageSVJD.g:508:3: this_ScrollingText_2= ruleScrollingText
                    {

                    			newCompositeNode(grammarAccess.getAnimationAccess().getScrollingTextParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScrollingText_2=ruleScrollingText();

                    state._fsp--;


                    			current = this_ScrollingText_2;
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
    // InternalVideoMontageSVJD.g:520:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVideoMontageSVJD.g:520:47: (iv_ruleEString= ruleEString EOF )
            // InternalVideoMontageSVJD.g:521:2: iv_ruleEString= ruleEString EOF
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
    // InternalVideoMontageSVJD.g:527:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:533:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVideoMontageSVJD.g:534:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVideoMontageSVJD.g:534:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalVideoMontageSVJD.g:535:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoMontageSVJD.g:543:3: this_ID_1= RULE_ID
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
    // InternalVideoMontageSVJD.g:554:1: entryRuleSubtitle returns [EObject current=null] : iv_ruleSubtitle= ruleSubtitle EOF ;
    public final EObject entryRuleSubtitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtitle = null;


        try {
            // InternalVideoMontageSVJD.g:554:49: (iv_ruleSubtitle= ruleSubtitle EOF )
            // InternalVideoMontageSVJD.g:555:2: iv_ruleSubtitle= ruleSubtitle EOF
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
    // InternalVideoMontageSVJD.g:561:1: ruleSubtitle returns [EObject current=null] : (otherlv_0= 'Subtitle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEDouble ) ) )? otherlv_8= 'textArea' ( (lv_textarea_9_0= ruleTextArea ) ) otherlv_10= '}' ) ;
    public final EObject ruleSubtitle() throws RecognitionException {
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

        AntlrDatatypeRuleToken lv_duration_7_0 = null;

        EObject lv_textarea_9_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:567:2: ( (otherlv_0= 'Subtitle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEDouble ) ) )? otherlv_8= 'textArea' ( (lv_textarea_9_0= ruleTextArea ) ) otherlv_10= '}' ) )
            // InternalVideoMontageSVJD.g:568:2: (otherlv_0= 'Subtitle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEDouble ) ) )? otherlv_8= 'textArea' ( (lv_textarea_9_0= ruleTextArea ) ) otherlv_10= '}' )
            {
            // InternalVideoMontageSVJD.g:568:2: (otherlv_0= 'Subtitle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEDouble ) ) )? otherlv_8= 'textArea' ( (lv_textarea_9_0= ruleTextArea ) ) otherlv_10= '}' )
            // InternalVideoMontageSVJD.g:569:3: otherlv_0= 'Subtitle' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEDouble ) ) )? otherlv_8= 'textArea' ( (lv_textarea_9_0= ruleTextArea ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubtitleAccess().getSubtitleKeyword_0());
            		
            // InternalVideoMontageSVJD.g:573:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontageSVJD.g:574:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontageSVJD.g:574:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontageSVJD.g:575:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubtitleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtitleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.svjd.VideoMontageSVJD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSubtitleAccess().getStartKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getSubtitleAccess().getColonKeyword_3());
            		
            // InternalVideoMontageSVJD.g:600:3: ( (lv_startingmoment_4_0= ruleStartingMoment ) )
            // InternalVideoMontageSVJD.g:601:4: (lv_startingmoment_4_0= ruleStartingMoment )
            {
            // InternalVideoMontageSVJD.g:601:4: (lv_startingmoment_4_0= ruleStartingMoment )
            // InternalVideoMontageSVJD.g:602:5: lv_startingmoment_4_0= ruleStartingMoment
            {

            					newCompositeNode(grammarAccess.getSubtitleAccess().getStartingmomentStartingMomentParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_startingmoment_4_0=ruleStartingMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtitleRule());
            					}
            					set(
            						current,
            						"startingmoment",
            						lv_startingmoment_4_0,
            						"org.xtext.svjd.VideoMontageSVJD.StartingMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_5, grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalVideoMontageSVJD.g:623:3: (otherlv_6= 'duration' ( (lv_duration_7_0= ruleEDouble ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVideoMontageSVJD.g:624:4: otherlv_6= 'duration' ( (lv_duration_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubtitleAccess().getDurationKeyword_6_0());
                    			
                    // InternalVideoMontageSVJD.g:628:4: ( (lv_duration_7_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:629:5: (lv_duration_7_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:629:5: (lv_duration_7_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:630:6: lv_duration_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSubtitleAccess().getDurationEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_duration_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubtitleRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_7_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getSubtitleAccess().getTextAreaKeyword_7());
            		
            // InternalVideoMontageSVJD.g:652:3: ( (lv_textarea_9_0= ruleTextArea ) )
            // InternalVideoMontageSVJD.g:653:4: (lv_textarea_9_0= ruleTextArea )
            {
            // InternalVideoMontageSVJD.g:653:4: (lv_textarea_9_0= ruleTextArea )
            // InternalVideoMontageSVJD.g:654:5: lv_textarea_9_0= ruleTextArea
            {

            					newCompositeNode(grammarAccess.getSubtitleAccess().getTextareaTextAreaParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_7);
            lv_textarea_9_0=ruleTextArea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtitleRule());
            					}
            					set(
            						current,
            						"textarea",
            						lv_textarea_9_0,
            						"org.xtext.svjd.VideoMontageSVJD.TextArea");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_9());
            		

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
    // InternalVideoMontageSVJD.g:679:1: entryRuleAudio returns [EObject current=null] : iv_ruleAudio= ruleAudio EOF ;
    public final EObject entryRuleAudio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudio = null;


        try {
            // InternalVideoMontageSVJD.g:679:46: (iv_ruleAudio= ruleAudio EOF )
            // InternalVideoMontageSVJD.g:680:2: iv_ruleAudio= ruleAudio EOF
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
    // InternalVideoMontageSVJD.g:686:1: ruleAudio returns [EObject current=null] : (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )? (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAudio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_path_4_0 = null;

        EObject lv_transition_6_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:692:2: ( (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )? (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )? otherlv_7= '}' ) )
            // InternalVideoMontageSVJD.g:693:2: (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )? (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )? otherlv_7= '}' )
            {
            // InternalVideoMontageSVJD.g:693:2: (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )? (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )? otherlv_7= '}' )
            // InternalVideoMontageSVJD.g:694:3: otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )? (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioAccess().getAudioKeyword_0());
            		
            // InternalVideoMontageSVJD.g:698:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontageSVJD.g:699:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontageSVJD.g:699:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontageSVJD.g:700:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.svjd.VideoMontageSVJD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontageSVJD.g:721:3: (otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVideoMontageSVJD.g:722:4: otherlv_3= 'path' ( (lv_path_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAudioAccess().getPathKeyword_3_0());
                    			
                    // InternalVideoMontageSVJD.g:726:4: ( (lv_path_4_0= ruleEString ) )
                    // InternalVideoMontageSVJD.g:727:5: (lv_path_4_0= ruleEString )
                    {
                    // InternalVideoMontageSVJD.g:727:5: (lv_path_4_0= ruleEString )
                    // InternalVideoMontageSVJD.g:728:6: lv_path_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getPathEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_path_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_4_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:746:3: (otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVideoMontageSVJD.g:747:4: otherlv_5= 'transition' ( (lv_transition_6_0= ruleTransition ) )
                    {
                    otherlv_5=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_5, grammarAccess.getAudioAccess().getTransitionKeyword_4_0());
                    			
                    // InternalVideoMontageSVJD.g:751:4: ( (lv_transition_6_0= ruleTransition ) )
                    // InternalVideoMontageSVJD.g:752:5: (lv_transition_6_0= ruleTransition )
                    {
                    // InternalVideoMontageSVJD.g:752:5: (lv_transition_6_0= ruleTransition )
                    // InternalVideoMontageSVJD.g:753:6: lv_transition_6_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getTransitionTransitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_transition_6_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioRule());
                    						}
                    						set(
                    							current,
                    							"transition",
                    							lv_transition_6_0,
                    							"org.xtext.svjd.VideoMontageSVJD.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalVideoMontageSVJD.g:779:1: entryRuleAudioClip returns [EObject current=null] : iv_ruleAudioClip= ruleAudioClip EOF ;
    public final EObject entryRuleAudioClip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioClip = null;


        try {
            // InternalVideoMontageSVJD.g:779:50: (iv_ruleAudioClip= ruleAudioClip EOF )
            // InternalVideoMontageSVJD.g:780:2: iv_ruleAudioClip= ruleAudioClip EOF
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
    // InternalVideoMontageSVJD.g:786:1: ruleAudioClip returns [EObject current=null] : (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )? (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) ) (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) ) (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )? otherlv_14= 'audio' ( (otherlv_15= RULE_ID ) )* otherlv_16= '}' ) ;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_startingmoment_4_0 = null;

        AntlrDatatypeRuleToken lv_volume_7_0 = null;

        AntlrDatatypeRuleToken lv_startCut_9_0 = null;

        AntlrDatatypeRuleToken lv_endCut_11_0 = null;

        EObject lv_transition_13_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:792:2: ( (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )? (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) ) (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) ) (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )? otherlv_14= 'audio' ( (otherlv_15= RULE_ID ) )* otherlv_16= '}' ) )
            // InternalVideoMontageSVJD.g:793:2: (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )? (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) ) (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) ) (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )? otherlv_14= 'audio' ( (otherlv_15= RULE_ID ) )* otherlv_16= '}' )
            {
            // InternalVideoMontageSVJD.g:793:2: (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )? (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) ) (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) ) (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )? otherlv_14= 'audio' ( (otherlv_15= RULE_ID ) )* otherlv_16= '}' )
            // InternalVideoMontageSVJD.g:794:3: otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'start' otherlv_3= ':' ( (lv_startingmoment_4_0= ruleStartingMoment ) ) otherlv_5= '{' (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )? (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) ) (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) ) (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )? otherlv_14= 'audio' ( (otherlv_15= RULE_ID ) )* otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioClipAccess().getAudioClipKeyword_0());
            		
            // InternalVideoMontageSVJD.g:798:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontageSVJD.g:799:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontageSVJD.g:799:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontageSVJD.g:800:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioClipAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioClipRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.svjd.VideoMontageSVJD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAudioClipAccess().getStartKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getAudioClipAccess().getColonKeyword_3());
            		
            // InternalVideoMontageSVJD.g:825:3: ( (lv_startingmoment_4_0= ruleStartingMoment ) )
            // InternalVideoMontageSVJD.g:826:4: (lv_startingmoment_4_0= ruleStartingMoment )
            {
            // InternalVideoMontageSVJD.g:826:4: (lv_startingmoment_4_0= ruleStartingMoment )
            // InternalVideoMontageSVJD.g:827:5: lv_startingmoment_4_0= ruleStartingMoment
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
            						"org.xtext.svjd.VideoMontageSVJD.StartingMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalVideoMontageSVJD.g:848:3: (otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVideoMontageSVJD.g:849:4: otherlv_6= 'volume' ( (lv_volume_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getAudioClipAccess().getVolumeKeyword_6_0());
                    			
                    // InternalVideoMontageSVJD.g:853:4: ( (lv_volume_7_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:854:5: (lv_volume_7_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:854:5: (lv_volume_7_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:855:6: lv_volume_7_0= ruleEDouble
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
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:873:3: (otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) ) )
            // InternalVideoMontageSVJD.g:874:4: otherlv_8= 'startCut' ( (lv_startCut_9_0= ruleEDouble ) )
            {
            otherlv_8=(Token)match(input,27,FOLLOW_16); 

            				newLeafNode(otherlv_8, grammarAccess.getAudioClipAccess().getStartCutKeyword_7_0());
            			
            // InternalVideoMontageSVJD.g:878:4: ( (lv_startCut_9_0= ruleEDouble ) )
            // InternalVideoMontageSVJD.g:879:5: (lv_startCut_9_0= ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:879:5: (lv_startCut_9_0= ruleEDouble )
            // InternalVideoMontageSVJD.g:880:6: lv_startCut_9_0= ruleEDouble
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
            							"org.xtext.svjd.VideoMontageSVJD.EDouble");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalVideoMontageSVJD.g:898:3: (otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) ) )
            // InternalVideoMontageSVJD.g:899:4: otherlv_10= 'endCut' ( (lv_endCut_11_0= ruleEDouble ) )
            {
            otherlv_10=(Token)match(input,28,FOLLOW_16); 

            				newLeafNode(otherlv_10, grammarAccess.getAudioClipAccess().getEndCutKeyword_8_0());
            			
            // InternalVideoMontageSVJD.g:903:4: ( (lv_endCut_11_0= ruleEDouble ) )
            // InternalVideoMontageSVJD.g:904:5: (lv_endCut_11_0= ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:904:5: (lv_endCut_11_0= ruleEDouble )
            // InternalVideoMontageSVJD.g:905:6: lv_endCut_11_0= ruleEDouble
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
            							"org.xtext.svjd.VideoMontageSVJD.EDouble");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalVideoMontageSVJD.g:923:3: (otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVideoMontageSVJD.g:924:4: otherlv_12= 'transition' ( (lv_transition_13_0= ruleTransition ) )
                    {
                    otherlv_12=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getAudioClipAccess().getTransitionKeyword_9_0());
                    			
                    // InternalVideoMontageSVJD.g:928:4: ( (lv_transition_13_0= ruleTransition ) )
                    // InternalVideoMontageSVJD.g:929:5: (lv_transition_13_0= ruleTransition )
                    {
                    // InternalVideoMontageSVJD.g:929:5: (lv_transition_13_0= ruleTransition )
                    // InternalVideoMontageSVJD.g:930:6: lv_transition_13_0= ruleTransition
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
                    							"org.xtext.svjd.VideoMontageSVJD.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,29,FOLLOW_27); 

            			newLeafNode(otherlv_14, grammarAccess.getAudioClipAccess().getAudioKeyword_10());
            		
            // InternalVideoMontageSVJD.g:952:3: ( (otherlv_15= RULE_ID ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalVideoMontageSVJD.g:953:4: (otherlv_15= RULE_ID )
            	    {
            	    // InternalVideoMontageSVJD.g:953:4: (otherlv_15= RULE_ID )
            	    // InternalVideoMontageSVJD.g:954:5: otherlv_15= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAudioClipRule());
            	    					}
            	    				
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_27); 

            	    					newLeafNode(otherlv_15, grammarAccess.getAudioClipAccess().getAudioAudioCrossReference_11_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_16=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalVideoMontageSVJD.g:973:1: entryRuleClip returns [EObject current=null] : iv_ruleClip= ruleClip EOF ;
    public final EObject entryRuleClip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClip = null;


        try {
            // InternalVideoMontageSVJD.g:973:45: (iv_ruleClip= ruleClip EOF )
            // InternalVideoMontageSVJD.g:974:2: iv_ruleClip= ruleClip EOF
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
    // InternalVideoMontageSVJD.g:980:1: ruleClip returns [EObject current=null] : (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEDouble ) ) )? (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEDouble ) ) )? otherlv_7= 'video' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) ;
    public final EObject ruleClip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_startCut_4_0 = null;

        AntlrDatatypeRuleToken lv_endCut_6_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:986:2: ( (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEDouble ) ) )? (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEDouble ) ) )? otherlv_7= 'video' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' ) )
            // InternalVideoMontageSVJD.g:987:2: (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEDouble ) ) )? (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEDouble ) ) )? otherlv_7= 'video' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            {
            // InternalVideoMontageSVJD.g:987:2: (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEDouble ) ) )? (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEDouble ) ) )? otherlv_7= 'video' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}' )
            // InternalVideoMontageSVJD.g:988:3: otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEDouble ) ) )? (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEDouble ) ) )? otherlv_7= 'video' ( (otherlv_8= RULE_ID ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getClipAccess().getClipKeyword_0());
            		
            // InternalVideoMontageSVJD.g:992:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontageSVJD.g:993:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontageSVJD.g:993:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontageSVJD.g:994:5: lv_name_1_0= ruleEString
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
            						"org.xtext.svjd.VideoMontageSVJD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontageSVJD.g:1015:3: (otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEDouble ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1016:4: otherlv_3= 'startCut' ( (lv_startCut_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getClipAccess().getStartCutKeyword_3_0());
                    			
                    // InternalVideoMontageSVJD.g:1020:4: ( (lv_startCut_4_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:1021:5: (lv_startCut_4_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:1021:5: (lv_startCut_4_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:1022:6: lv_startCut_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getClipAccess().getStartCutEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_startCut_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClipRule());
                    						}
                    						set(
                    							current,
                    							"startCut",
                    							lv_startCut_4_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1040:3: (otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEDouble ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1041:4: otherlv_5= 'endCut' ( (lv_endCut_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getClipAccess().getEndCutKeyword_4_0());
                    			
                    // InternalVideoMontageSVJD.g:1045:4: ( (lv_endCut_6_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:1046:5: (lv_endCut_6_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:1046:5: (lv_endCut_6_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:1047:6: lv_endCut_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getClipAccess().getEndCutEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_endCut_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClipRule());
                    						}
                    						set(
                    							current,
                    							"endCut",
                    							lv_endCut_6_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getClipAccess().getVideoKeyword_5());
            		
            // InternalVideoMontageSVJD.g:1069:3: ( (otherlv_8= RULE_ID ) )
            // InternalVideoMontageSVJD.g:1070:4: (otherlv_8= RULE_ID )
            {
            // InternalVideoMontageSVJD.g:1070:4: (otherlv_8= RULE_ID )
            // InternalVideoMontageSVJD.g:1071:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClipRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_8, grammarAccess.getClipAccess().getVideoVideoCrossReference_6_0());
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getClipAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleTitle"
    // InternalVideoMontageSVJD.g:1090:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalVideoMontageSVJD.g:1090:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalVideoMontageSVJD.g:1091:2: iv_ruleTitle= ruleTitle EOF
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
    // InternalVideoMontageSVJD.g:1097:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'backgroundColor' ( (lv_backgroundColor_6_0= ruleColor ) ) )? otherlv_7= 'textArea' ( (lv_textarea_8_0= ruleTextArea ) ) otherlv_9= '}' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        Enumerator lv_backgroundColor_6_0 = null;

        EObject lv_textarea_8_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:1103:2: ( (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'backgroundColor' ( (lv_backgroundColor_6_0= ruleColor ) ) )? otherlv_7= 'textArea' ( (lv_textarea_8_0= ruleTextArea ) ) otherlv_9= '}' ) )
            // InternalVideoMontageSVJD.g:1104:2: (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'backgroundColor' ( (lv_backgroundColor_6_0= ruleColor ) ) )? otherlv_7= 'textArea' ( (lv_textarea_8_0= ruleTextArea ) ) otherlv_9= '}' )
            {
            // InternalVideoMontageSVJD.g:1104:2: (otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'backgroundColor' ( (lv_backgroundColor_6_0= ruleColor ) ) )? otherlv_7= 'textArea' ( (lv_textarea_8_0= ruleTextArea ) ) otherlv_9= '}' )
            // InternalVideoMontageSVJD.g:1105:3: otherlv_0= 'Title' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'backgroundColor' ( (lv_backgroundColor_6_0= ruleColor ) ) )? otherlv_7= 'textArea' ( (lv_textarea_8_0= ruleTextArea ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
            		
            // InternalVideoMontageSVJD.g:1109:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontageSVJD.g:1110:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontageSVJD.g:1110:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontageSVJD.g:1111:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTitleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.svjd.VideoMontageSVJD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontageSVJD.g:1132:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1133:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getTitleAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontageSVJD.g:1137:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:1138:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:1138:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:1139:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTitleAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_duration_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTitleRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_4_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1157:3: (otherlv_5= 'backgroundColor' ( (lv_backgroundColor_6_0= ruleColor ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1158:4: otherlv_5= 'backgroundColor' ( (lv_backgroundColor_6_0= ruleColor ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_33); 

                    				newLeafNode(otherlv_5, grammarAccess.getTitleAccess().getBackgroundColorKeyword_4_0());
                    			
                    // InternalVideoMontageSVJD.g:1162:4: ( (lv_backgroundColor_6_0= ruleColor ) )
                    // InternalVideoMontageSVJD.g:1163:5: (lv_backgroundColor_6_0= ruleColor )
                    {
                    // InternalVideoMontageSVJD.g:1163:5: (lv_backgroundColor_6_0= ruleColor )
                    // InternalVideoMontageSVJD.g:1164:6: lv_backgroundColor_6_0= ruleColor
                    {

                    						newCompositeNode(grammarAccess.getTitleAccess().getBackgroundColorColorEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_backgroundColor_6_0=ruleColor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTitleRule());
                    						}
                    						set(
                    							current,
                    							"backgroundColor",
                    							lv_backgroundColor_6_0,
                    							"org.xtext.svjd.VideoMontageSVJD.Color");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_7, grammarAccess.getTitleAccess().getTextAreaKeyword_5());
            		
            // InternalVideoMontageSVJD.g:1186:3: ( (lv_textarea_8_0= ruleTextArea ) )
            // InternalVideoMontageSVJD.g:1187:4: (lv_textarea_8_0= ruleTextArea )
            {
            // InternalVideoMontageSVJD.g:1187:4: (lv_textarea_8_0= ruleTextArea )
            // InternalVideoMontageSVJD.g:1188:5: lv_textarea_8_0= ruleTextArea
            {

            					newCompositeNode(grammarAccess.getTitleAccess().getTextareaTextAreaParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_textarea_8_0=ruleTextArea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleRule());
            					}
            					set(
            						current,
            						"textarea",
            						lv_textarea_8_0,
            						"org.xtext.svjd.VideoMontageSVJD.TextArea");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_7());
            		

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


    // $ANTLR start "entryRuleVideo"
    // InternalVideoMontageSVJD.g:1213:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalVideoMontageSVJD.g:1213:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalVideoMontageSVJD.g:1214:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalVideoMontageSVJD.g:1220:1: ruleVideo returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) ) ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_path_2_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:1226:2: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) ) ) )
            // InternalVideoMontageSVJD.g:1227:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) ) )
            {
            // InternalVideoMontageSVJD.g:1227:2: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) ) )
            // InternalVideoMontageSVJD.g:1228:3: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) )
            {
            // InternalVideoMontageSVJD.g:1228:3: ( (lv_name_0_0= ruleEString ) )
            // InternalVideoMontageSVJD.g:1229:4: (lv_name_0_0= ruleEString )
            {
            // InternalVideoMontageSVJD.g:1229:4: (lv_name_0_0= ruleEString )
            // InternalVideoMontageSVJD.g:1230:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.svjd.VideoMontageSVJD.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontageSVJD.g:1247:3: (otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) ) )
            // InternalVideoMontageSVJD.g:1248:4: otherlv_1= 'path' ( (lv_path_2_0= ruleEString ) )
            {
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            				newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getPathKeyword_1_0());
            			
            // InternalVideoMontageSVJD.g:1252:4: ( (lv_path_2_0= ruleEString ) )
            // InternalVideoMontageSVJD.g:1253:5: (lv_path_2_0= ruleEString )
            {
            // InternalVideoMontageSVJD.g:1253:5: (lv_path_2_0= ruleEString )
            // InternalVideoMontageSVJD.g:1254:6: lv_path_2_0= ruleEString
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
            							"org.xtext.svjd.VideoMontageSVJD.EString");
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
    // InternalVideoMontageSVJD.g:1276:1: entryRuleRelativeMoment returns [EObject current=null] : iv_ruleRelativeMoment= ruleRelativeMoment EOF ;
    public final EObject entryRuleRelativeMoment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeMoment = null;


        try {
            // InternalVideoMontageSVJD.g:1276:55: (iv_ruleRelativeMoment= ruleRelativeMoment EOF )
            // InternalVideoMontageSVJD.g:1277:2: iv_ruleRelativeMoment= ruleRelativeMoment EOF
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
    // InternalVideoMontageSVJD.g:1283:1: ruleRelativeMoment returns [EObject current=null] : ( () ( (lv_moment_1_0= ruleMoment ) )? otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ( ( (lv_operationMoment_4_0= ruleOperationMoment ) ) ( (lv_value_5_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleRelativeMoment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_moment_1_0 = null;

        Enumerator lv_operationMoment_4_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:1289:2: ( ( () ( (lv_moment_1_0= ruleMoment ) )? otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ( ( (lv_operationMoment_4_0= ruleOperationMoment ) ) ( (lv_value_5_0= ruleEDouble ) ) )? ) )
            // InternalVideoMontageSVJD.g:1290:2: ( () ( (lv_moment_1_0= ruleMoment ) )? otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ( ( (lv_operationMoment_4_0= ruleOperationMoment ) ) ( (lv_value_5_0= ruleEDouble ) ) )? )
            {
            // InternalVideoMontageSVJD.g:1290:2: ( () ( (lv_moment_1_0= ruleMoment ) )? otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ( ( (lv_operationMoment_4_0= ruleOperationMoment ) ) ( (lv_value_5_0= ruleEDouble ) ) )? )
            // InternalVideoMontageSVJD.g:1291:3: () ( (lv_moment_1_0= ruleMoment ) )? otherlv_2= 'of' ( (otherlv_3= RULE_ID ) ) ( ( (lv_operationMoment_4_0= ruleOperationMoment ) ) ( (lv_value_5_0= ruleEDouble ) ) )?
            {
            // InternalVideoMontageSVJD.g:1291:3: ()
            // InternalVideoMontageSVJD.g:1292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeMomentAccess().getRelativeMomentAction_0(),
            					current);
            			

            }

            // InternalVideoMontageSVJD.g:1298:3: ( (lv_moment_1_0= ruleMoment ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=58 && LA23_0<=59)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1299:4: (lv_moment_1_0= ruleMoment )
                    {
                    // InternalVideoMontageSVJD.g:1299:4: (lv_moment_1_0= ruleMoment )
                    // InternalVideoMontageSVJD.g:1300:5: lv_moment_1_0= ruleMoment
                    {

                    					newCompositeNode(grammarAccess.getRelativeMomentAccess().getMomentMomentEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_35);
                    lv_moment_1_0=ruleMoment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRelativeMomentRule());
                    					}
                    					set(
                    						current,
                    						"moment",
                    						lv_moment_1_0,
                    						"org.xtext.svjd.VideoMontageSVJD.Moment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,34,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeMomentAccess().getOfKeyword_2());
            		
            // InternalVideoMontageSVJD.g:1321:3: ( (otherlv_3= RULE_ID ) )
            // InternalVideoMontageSVJD.g:1322:4: (otherlv_3= RULE_ID )
            {
            // InternalVideoMontageSVJD.g:1322:4: (otherlv_3= RULE_ID )
            // InternalVideoMontageSVJD.g:1323:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelativeMomentRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_3, grammarAccess.getRelativeMomentAccess().getElementElementCrossReference_3_0());
            				

            }


            }

            // InternalVideoMontageSVJD.g:1334:3: ( ( (lv_operationMoment_4_0= ruleOperationMoment ) ) ( (lv_value_5_0= ruleEDouble ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==53||LA24_0==57) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1335:4: ( (lv_operationMoment_4_0= ruleOperationMoment ) ) ( (lv_value_5_0= ruleEDouble ) )
                    {
                    // InternalVideoMontageSVJD.g:1335:4: ( (lv_operationMoment_4_0= ruleOperationMoment ) )
                    // InternalVideoMontageSVJD.g:1336:5: (lv_operationMoment_4_0= ruleOperationMoment )
                    {
                    // InternalVideoMontageSVJD.g:1336:5: (lv_operationMoment_4_0= ruleOperationMoment )
                    // InternalVideoMontageSVJD.g:1337:6: lv_operationMoment_4_0= ruleOperationMoment
                    {

                    						newCompositeNode(grammarAccess.getRelativeMomentAccess().getOperationMomentOperationMomentEnumRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_operationMoment_4_0=ruleOperationMoment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeMomentRule());
                    						}
                    						set(
                    							current,
                    							"operationMoment",
                    							lv_operationMoment_4_0,
                    							"org.xtext.svjd.VideoMontageSVJD.OperationMoment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVideoMontageSVJD.g:1354:4: ( (lv_value_5_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:1355:5: (lv_value_5_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:1355:5: (lv_value_5_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:1356:6: lv_value_5_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRelativeMomentAccess().getValueEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeMomentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
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
    // $ANTLR end "ruleRelativeMoment"


    // $ANTLR start "entryRuleAbsoluteMoment"
    // InternalVideoMontageSVJD.g:1378:1: entryRuleAbsoluteMoment returns [EObject current=null] : iv_ruleAbsoluteMoment= ruleAbsoluteMoment EOF ;
    public final EObject entryRuleAbsoluteMoment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteMoment = null;


        try {
            // InternalVideoMontageSVJD.g:1378:55: (iv_ruleAbsoluteMoment= ruleAbsoluteMoment EOF )
            // InternalVideoMontageSVJD.g:1379:2: iv_ruleAbsoluteMoment= ruleAbsoluteMoment EOF
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
    // InternalVideoMontageSVJD.g:1385:1: ruleAbsoluteMoment returns [EObject current=null] : ( () (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )? ) ;
    public final EObject ruleAbsoluteMoment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:1391:2: ( ( () (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )? ) )
            // InternalVideoMontageSVJD.g:1392:2: ( () (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )? )
            {
            // InternalVideoMontageSVJD.g:1392:2: ( () (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )? )
            // InternalVideoMontageSVJD.g:1393:3: () (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )?
            {
            // InternalVideoMontageSVJD.g:1393:3: ()
            // InternalVideoMontageSVJD.g:1394:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentAction_0(),
            					current);
            			

            }

            // InternalVideoMontageSVJD.g:1400:3: (otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1401:4: otherlv_1= 'time' ( (lv_time_2_0= ruleEDouble ) )
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getAbsoluteMomentAccess().getTimeKeyword_1_0());
                    			
                    // InternalVideoMontageSVJD.g:1405:4: ( (lv_time_2_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:1406:5: (lv_time_2_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:1406:5: (lv_time_2_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:1407:6: lv_time_2_0= ruleEDouble
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
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
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
    // InternalVideoMontageSVJD.g:1429:1: entryRuleStartingMoment_Impl returns [EObject current=null] : iv_ruleStartingMoment_Impl= ruleStartingMoment_Impl EOF ;
    public final EObject entryRuleStartingMoment_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingMoment_Impl = null;


        try {
            // InternalVideoMontageSVJD.g:1429:60: (iv_ruleStartingMoment_Impl= ruleStartingMoment_Impl EOF )
            // InternalVideoMontageSVJD.g:1430:2: iv_ruleStartingMoment_Impl= ruleStartingMoment_Impl EOF
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
    // InternalVideoMontageSVJD.g:1436:1: ruleStartingMoment_Impl returns [EObject current=null] : ( () otherlv_1= 'StartingMoment' ) ;
    public final EObject ruleStartingMoment_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:1442:2: ( ( () otherlv_1= 'StartingMoment' ) )
            // InternalVideoMontageSVJD.g:1443:2: ( () otherlv_1= 'StartingMoment' )
            {
            // InternalVideoMontageSVJD.g:1443:2: ( () otherlv_1= 'StartingMoment' )
            // InternalVideoMontageSVJD.g:1444:3: () otherlv_1= 'StartingMoment'
            {
            // InternalVideoMontageSVJD.g:1444:3: ()
            // InternalVideoMontageSVJD.g:1445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartingMoment_ImplAccess().getStartingMomentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

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
    // InternalVideoMontageSVJD.g:1459:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalVideoMontageSVJD.g:1459:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalVideoMontageSVJD.g:1460:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalVideoMontageSVJD.g:1466:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioElement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' ) ;
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
            // InternalVideoMontageSVJD.g:1472:2: ( (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioElement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' ) )
            // InternalVideoMontageSVJD.g:1473:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioElement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' )
            {
            // InternalVideoMontageSVJD.g:1473:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioElement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' )
            // InternalVideoMontageSVJD.g:1474:3: otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioElement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontageSVJD.g:1482:3: (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1483:4: otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getDurationKeyword_2_0());
                    			
                    // InternalVideoMontageSVJD.g:1487:4: ( (lv_duration_3_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:1488:5: (lv_duration_3_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:1488:5: (lv_duration_3_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:1489:6: lv_duration_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getDurationEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_duration_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_3_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getAudioElementKeyword_3());
            		
            // InternalVideoMontageSVJD.g:1511:3: ( (lv_audioelement_5_0= ruleAudioElement ) )
            // InternalVideoMontageSVJD.g:1512:4: (lv_audioelement_5_0= ruleAudioElement )
            {
            // InternalVideoMontageSVJD.g:1512:4: (lv_audioelement_5_0= ruleAudioElement )
            // InternalVideoMontageSVJD.g:1513:5: lv_audioelement_5_0= ruleAudioElement
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getAudioelementAudioElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_audioelement_5_0=ruleAudioElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"audioelement",
            						lv_audioelement_5_0,
            						"org.xtext.svjd.VideoMontageSVJD.AudioElement");
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


    // $ANTLR start "entryRuleTextArea_Impl"
    // InternalVideoMontageSVJD.g:1538:1: entryRuleTextArea_Impl returns [EObject current=null] : iv_ruleTextArea_Impl= ruleTextArea_Impl EOF ;
    public final EObject entryRuleTextArea_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea_Impl = null;


        try {
            // InternalVideoMontageSVJD.g:1538:54: (iv_ruleTextArea_Impl= ruleTextArea_Impl EOF )
            // InternalVideoMontageSVJD.g:1539:2: iv_ruleTextArea_Impl= ruleTextArea_Impl EOF
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
    // InternalVideoMontageSVJD.g:1545:1: ruleTextArea_Impl returns [EObject current=null] : (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) ) (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )? otherlv_17= '}' ) ;
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
            // InternalVideoMontageSVJD.g:1551:2: ( (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) ) (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )? otherlv_17= '}' ) )
            // InternalVideoMontageSVJD.g:1552:2: (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) ) (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )? otherlv_17= '}' )
            {
            // InternalVideoMontageSVJD.g:1552:2: (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) ) (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )? otherlv_17= '}' )
            // InternalVideoMontageSVJD.g:1553:3: otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) ) (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )? (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextArea_ImplAccess().getTextAreaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getTextArea_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontageSVJD.g:1561:3: (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1562:4: otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextArea_ImplAccess().getXKeyword_2_0());
                    			
                    // InternalVideoMontageSVJD.g:1566:4: ( (lv_x_3_0= ruleEInt ) )
                    // InternalVideoMontageSVJD.g:1567:5: (lv_x_3_0= ruleEInt )
                    {
                    // InternalVideoMontageSVJD.g:1567:5: (lv_x_3_0= ruleEInt )
                    // InternalVideoMontageSVJD.g:1568:6: lv_x_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getXEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_x_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    						}
                    						set(
                    							current,
                    							"x",
                    							lv_x_3_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1586:3: (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1587:4: otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextArea_ImplAccess().getYKeyword_3_0());
                    			
                    // InternalVideoMontageSVJD.g:1591:4: ( (lv_y_5_0= ruleEInt ) )
                    // InternalVideoMontageSVJD.g:1592:5: (lv_y_5_0= ruleEInt )
                    {
                    // InternalVideoMontageSVJD.g:1592:5: (lv_y_5_0= ruleEInt )
                    // InternalVideoMontageSVJD.g:1593:6: lv_y_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getYEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_y_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    						}
                    						set(
                    							current,
                    							"y",
                    							lv_y_5_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1611:3: (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1612:4: otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextArea_ImplAccess().getWidthKeyword_4_0());
                    			
                    // InternalVideoMontageSVJD.g:1616:4: ( (lv_width_7_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:1617:5: (lv_width_7_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:1617:5: (lv_width_7_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:1618:6: lv_width_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getWidthEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_width_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_7_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1636:3: (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==42) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1637:4: otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextArea_ImplAccess().getHeightKeyword_5_0());
                    			
                    // InternalVideoMontageSVJD.g:1641:4: ( (lv_height_9_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:1642:5: (lv_height_9_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:1642:5: (lv_height_9_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:1643:6: lv_height_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getHeightEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_height_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_9_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1661:3: (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )
            // InternalVideoMontageSVJD.g:1662:4: otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) )
            {
            otherlv_10=(Token)match(input,43,FOLLOW_3); 

            				newLeafNode(otherlv_10, grammarAccess.getTextArea_ImplAccess().getTextKeyword_6_0());
            			
            // InternalVideoMontageSVJD.g:1666:4: ( (lv_text_11_0= ruleEString ) )
            // InternalVideoMontageSVJD.g:1667:5: (lv_text_11_0= ruleEString )
            {
            // InternalVideoMontageSVJD.g:1667:5: (lv_text_11_0= ruleEString )
            // InternalVideoMontageSVJD.g:1668:6: lv_text_11_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getTextEStringParserRuleCall_6_1_0());
            					
            pushFollow(FOLLOW_45);
            lv_text_11_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
            						}
            						set(
            							current,
            							"text",
            							lv_text_11_0,
            							"org.xtext.svjd.VideoMontageSVJD.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalVideoMontageSVJD.g:1686:3: (otherlv_12= 'font' ( (otherlv_13= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1687:4: otherlv_12= 'font' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getTextArea_ImplAccess().getFontKeyword_7_0());
                    			
                    // InternalVideoMontageSVJD.g:1691:4: ( (otherlv_13= RULE_ID ) )
                    // InternalVideoMontageSVJD.g:1692:5: (otherlv_13= RULE_ID )
                    {
                    // InternalVideoMontageSVJD.g:1692:5: (otherlv_13= RULE_ID )
                    // InternalVideoMontageSVJD.g:1693:6: otherlv_13= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextArea_ImplRule());
                    						}
                    					
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_46); 

                    						newLeafNode(otherlv_13, grammarAccess.getTextArea_ImplAccess().getFontFontCrossReference_7_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1705:3: (otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==45) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1706:4: otherlv_14= 'animation' ( (lv_animation_15_0= ruleAnimation ) ) ( (lv_animation_16_0= ruleAnimation ) )*
                    {
                    otherlv_14=(Token)match(input,45,FOLLOW_47); 

                    				newLeafNode(otherlv_14, grammarAccess.getTextArea_ImplAccess().getAnimationKeyword_8_0());
                    			
                    // InternalVideoMontageSVJD.g:1710:4: ( (lv_animation_15_0= ruleAnimation ) )
                    // InternalVideoMontageSVJD.g:1711:5: (lv_animation_15_0= ruleAnimation )
                    {
                    // InternalVideoMontageSVJD.g:1711:5: (lv_animation_15_0= ruleAnimation )
                    // InternalVideoMontageSVJD.g:1712:6: lv_animation_15_0= ruleAnimation
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_animation_15_0=ruleAnimation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    						}
                    						add(
                    							current,
                    							"animation",
                    							lv_animation_15_0,
                    							"org.xtext.svjd.VideoMontageSVJD.Animation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVideoMontageSVJD.g:1729:4: ( (lv_animation_16_0= ruleAnimation ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==49||(LA32_0>=51 && LA32_0<=52)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalVideoMontageSVJD.g:1730:5: (lv_animation_16_0= ruleAnimation )
                    	    {
                    	    // InternalVideoMontageSVJD.g:1730:5: (lv_animation_16_0= ruleAnimation )
                    	    // InternalVideoMontageSVJD.g:1731:6: lv_animation_16_0= ruleAnimation
                    	    {

                    	    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_48);
                    	    lv_animation_16_0=ruleAnimation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"animation",
                    	    							lv_animation_16_0,
                    	    							"org.xtext.svjd.VideoMontageSVJD.Animation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
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
    // InternalVideoMontageSVJD.g:1757:1: entryRuleTextAreaDynamic returns [EObject current=null] : iv_ruleTextAreaDynamic= ruleTextAreaDynamic EOF ;
    public final EObject entryRuleTextAreaDynamic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAreaDynamic = null;


        try {
            // InternalVideoMontageSVJD.g:1757:56: (iv_ruleTextAreaDynamic= ruleTextAreaDynamic EOF )
            // InternalVideoMontageSVJD.g:1758:2: iv_ruleTextAreaDynamic= ruleTextAreaDynamic EOF
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
    // InternalVideoMontageSVJD.g:1764:1: ruleTextAreaDynamic returns [EObject current=null] : (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )? otherlv_21= '}' ) ;
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
            // InternalVideoMontageSVJD.g:1770:2: ( (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )? otherlv_21= '}' ) )
            // InternalVideoMontageSVJD.g:1771:2: (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )? otherlv_21= '}' )
            {
            // InternalVideoMontageSVJD.g:1771:2: (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )? otherlv_21= '}' )
            // InternalVideoMontageSVJD.g:1772:3: otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAreaDynamicAccess().getTextAreaDynamicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAreaDynamicAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontageSVJD.g:1780:3: (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==39) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1781:4: otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,39,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextAreaDynamicAccess().getXKeyword_2_0());
                    			
                    // InternalVideoMontageSVJD.g:1785:4: ( (lv_x_3_0= ruleEInt ) )
                    // InternalVideoMontageSVJD.g:1786:5: (lv_x_3_0= ruleEInt )
                    {
                    // InternalVideoMontageSVJD.g:1786:5: (lv_x_3_0= ruleEInt )
                    // InternalVideoMontageSVJD.g:1787:6: lv_x_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getXEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_50);
                    lv_x_3_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"x",
                    							lv_x_3_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1805:3: (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==40) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1806:4: otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextAreaDynamicAccess().getYKeyword_3_0());
                    			
                    // InternalVideoMontageSVJD.g:1810:4: ( (lv_y_5_0= ruleEInt ) )
                    // InternalVideoMontageSVJD.g:1811:5: (lv_y_5_0= ruleEInt )
                    {
                    // InternalVideoMontageSVJD.g:1811:5: (lv_y_5_0= ruleEInt )
                    // InternalVideoMontageSVJD.g:1812:6: lv_y_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getYEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_51);
                    lv_y_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"y",
                    							lv_y_5_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1830:3: (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1831:4: otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextAreaDynamicAccess().getWidthKeyword_4_0());
                    			
                    // InternalVideoMontageSVJD.g:1835:4: ( (lv_width_7_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:1836:5: (lv_width_7_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:1836:5: (lv_width_7_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:1837:6: lv_width_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getWidthEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
                    lv_width_7_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_7_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1855:3: (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1856:4: otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,42,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextAreaDynamicAccess().getHeightKeyword_5_0());
                    			
                    // InternalVideoMontageSVJD.g:1860:4: ( (lv_height_9_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:1861:5: (lv_height_9_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:1861:5: (lv_height_9_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:1862:6: lv_height_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getHeightEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_height_9_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_9_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1880:3: (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==43) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1881:4: otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextAreaDynamicAccess().getTextKeyword_6_0());
                    			
                    // InternalVideoMontageSVJD.g:1885:4: ( (lv_text_11_0= ruleEString ) )
                    // InternalVideoMontageSVJD.g:1886:5: (lv_text_11_0= ruleEString )
                    {
                    // InternalVideoMontageSVJD.g:1886:5: (lv_text_11_0= ruleEString )
                    // InternalVideoMontageSVJD.g:1887:6: lv_text_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getTextEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_54);
                    lv_text_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_11_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1905:3: (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==47) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1906:4: otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getTextAreaDynamicAccess().getTextSrcKeyword_7_0());
                    			
                    // InternalVideoMontageSVJD.g:1910:4: ( (lv_textSrc_13_0= ruleEString ) )
                    // InternalVideoMontageSVJD.g:1911:5: (lv_textSrc_13_0= ruleEString )
                    {
                    // InternalVideoMontageSVJD.g:1911:5: (lv_textSrc_13_0= ruleEString )
                    // InternalVideoMontageSVJD.g:1912:6: lv_textSrc_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getTextSrcEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_55);
                    lv_textSrc_13_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"textSrc",
                    							lv_textSrc_13_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:1930:3: (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==48) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1931:4: otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) )
                    {
                    otherlv_14=(Token)match(input,48,FOLLOW_40); 

                    				newLeafNode(otherlv_14, grammarAccess.getTextAreaDynamicAccess().getLineKeyword_8_0());
                    			
                    // InternalVideoMontageSVJD.g:1935:4: ( (lv_line_15_0= ruleEInt ) )
                    // InternalVideoMontageSVJD.g:1936:5: (lv_line_15_0= ruleEInt )
                    {
                    // InternalVideoMontageSVJD.g:1936:5: (lv_line_15_0= ruleEInt )
                    // InternalVideoMontageSVJD.g:1937:6: lv_line_15_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getLineEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_line_15_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						set(
                    							current,
                    							"line",
                    							lv_line_15_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getTextAreaDynamicAccess().getFontKeyword_9());
            		
            // InternalVideoMontageSVJD.g:1959:3: ( ( ruleEString ) )
            // InternalVideoMontageSVJD.g:1960:4: ( ruleEString )
            {
            // InternalVideoMontageSVJD.g:1960:4: ( ruleEString )
            // InternalVideoMontageSVJD.g:1961:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextAreaDynamicRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getFontFontCrossReference_10_0());
            				
            pushFollow(FOLLOW_46);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontageSVJD.g:1975:3: (otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==45) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVideoMontageSVJD.g:1976:4: otherlv_18= 'animation' ( (lv_animation_19_0= ruleAnimation ) ) ( (lv_animation_20_0= ruleAnimation ) )*
                    {
                    otherlv_18=(Token)match(input,45,FOLLOW_47); 

                    				newLeafNode(otherlv_18, grammarAccess.getTextAreaDynamicAccess().getAnimationKeyword_11_0());
                    			
                    // InternalVideoMontageSVJD.g:1980:4: ( (lv_animation_19_0= ruleAnimation ) )
                    // InternalVideoMontageSVJD.g:1981:5: (lv_animation_19_0= ruleAnimation )
                    {
                    // InternalVideoMontageSVJD.g:1981:5: (lv_animation_19_0= ruleAnimation )
                    // InternalVideoMontageSVJD.g:1982:6: lv_animation_19_0= ruleAnimation
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_48);
                    lv_animation_19_0=ruleAnimation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    						}
                    						add(
                    							current,
                    							"animation",
                    							lv_animation_19_0,
                    							"org.xtext.svjd.VideoMontageSVJD.Animation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVideoMontageSVJD.g:1999:4: ( (lv_animation_20_0= ruleAnimation ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==49||(LA41_0>=51 && LA41_0<=52)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalVideoMontageSVJD.g:2000:5: (lv_animation_20_0= ruleAnimation )
                    	    {
                    	    // InternalVideoMontageSVJD.g:2000:5: (lv_animation_20_0= ruleAnimation )
                    	    // InternalVideoMontageSVJD.g:2001:6: lv_animation_20_0= ruleAnimation
                    	    {

                    	    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_2_0());
                    	    					
                    	    pushFollow(FOLLOW_48);
                    	    lv_animation_20_0=ruleAnimation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"animation",
                    	    							lv_animation_20_0,
                    	    							"org.xtext.svjd.VideoMontageSVJD.Animation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
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


    // $ANTLR start "entryRuleScrollingText"
    // InternalVideoMontageSVJD.g:2027:1: entryRuleScrollingText returns [EObject current=null] : iv_ruleScrollingText= ruleScrollingText EOF ;
    public final EObject entryRuleScrollingText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScrollingText = null;


        try {
            // InternalVideoMontageSVJD.g:2027:54: (iv_ruleScrollingText= ruleScrollingText EOF )
            // InternalVideoMontageSVJD.g:2028:2: iv_ruleScrollingText= ruleScrollingText EOF
            {
             newCompositeNode(grammarAccess.getScrollingTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScrollingText=ruleScrollingText();

            state._fsp--;

             current =iv_ruleScrollingText; 
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
    // $ANTLR end "entryRuleScrollingText"


    // $ANTLR start "ruleScrollingText"
    // InternalVideoMontageSVJD.g:2034:1: ruleScrollingText returns [EObject current=null] : ( () otherlv_1= 'ScrollingText' otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEDouble ) ) ) (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleScrollingText() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_speed_4_0 = null;

        AntlrDatatypeRuleToken lv_duration_6_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:2040:2: ( ( () otherlv_1= 'ScrollingText' otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEDouble ) ) ) (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )? otherlv_7= '}' ) )
            // InternalVideoMontageSVJD.g:2041:2: ( () otherlv_1= 'ScrollingText' otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEDouble ) ) ) (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )? otherlv_7= '}' )
            {
            // InternalVideoMontageSVJD.g:2041:2: ( () otherlv_1= 'ScrollingText' otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEDouble ) ) ) (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )? otherlv_7= '}' )
            // InternalVideoMontageSVJD.g:2042:3: () otherlv_1= 'ScrollingText' otherlv_2= '{' (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEDouble ) ) ) (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )? otherlv_7= '}'
            {
            // InternalVideoMontageSVJD.g:2042:3: ()
            // InternalVideoMontageSVJD.g:2043:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScrollingTextAccess().getScrollingTextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getScrollingTextAccess().getScrollingTextKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_57); 

            			newLeafNode(otherlv_2, grammarAccess.getScrollingTextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontageSVJD.g:2057:3: (otherlv_3= 'speed' ( (lv_speed_4_0= ruleEDouble ) ) )
            // InternalVideoMontageSVJD.g:2058:4: otherlv_3= 'speed' ( (lv_speed_4_0= ruleEDouble ) )
            {
            otherlv_3=(Token)match(input,50,FOLLOW_16); 

            				newLeafNode(otherlv_3, grammarAccess.getScrollingTextAccess().getSpeedKeyword_3_0());
            			
            // InternalVideoMontageSVJD.g:2062:4: ( (lv_speed_4_0= ruleEDouble ) )
            // InternalVideoMontageSVJD.g:2063:5: (lv_speed_4_0= ruleEDouble )
            {
            // InternalVideoMontageSVJD.g:2063:5: (lv_speed_4_0= ruleEDouble )
            // InternalVideoMontageSVJD.g:2064:6: lv_speed_4_0= ruleEDouble
            {

            						newCompositeNode(grammarAccess.getScrollingTextAccess().getSpeedEDoubleParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_58);
            lv_speed_4_0=ruleEDouble();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getScrollingTextRule());
            						}
            						set(
            							current,
            							"speed",
            							lv_speed_4_0,
            							"org.xtext.svjd.VideoMontageSVJD.EDouble");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalVideoMontageSVJD.g:2082:3: (otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==20) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2083:4: otherlv_5= 'duration' ( (lv_duration_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getScrollingTextAccess().getDurationKeyword_4_0());
                    			
                    // InternalVideoMontageSVJD.g:2087:4: ( (lv_duration_6_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:2088:5: (lv_duration_6_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:2088:5: (lv_duration_6_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:2089:6: lv_duration_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getScrollingTextAccess().getDurationEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_duration_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScrollingTextRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_6_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getScrollingTextAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleScrollingText"


    // $ANTLR start "entryRuleFadeIn"
    // InternalVideoMontageSVJD.g:2115:1: entryRuleFadeIn returns [EObject current=null] : iv_ruleFadeIn= ruleFadeIn EOF ;
    public final EObject entryRuleFadeIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeIn = null;


        try {
            // InternalVideoMontageSVJD.g:2115:47: (iv_ruleFadeIn= ruleFadeIn EOF )
            // InternalVideoMontageSVJD.g:2116:2: iv_ruleFadeIn= ruleFadeIn EOF
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
    // InternalVideoMontageSVJD.g:2122:1: ruleFadeIn returns [EObject current=null] : ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleFadeIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_duration_4_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:2128:2: ( ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalVideoMontageSVJD.g:2129:2: ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalVideoMontageSVJD.g:2129:2: ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalVideoMontageSVJD.g:2130:3: () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalVideoMontageSVJD.g:2130:3: ()
            // InternalVideoMontageSVJD.g:2131:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFadeInAccess().getFadeInAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,51,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFadeInAccess().getFadeInKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeInAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontageSVJD.g:2145:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==20) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2146:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getFadeInAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontageSVJD.g:2150:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:2151:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:2151:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:2152:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getFadeInAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_duration_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFadeInRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_4_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
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
    // InternalVideoMontageSVJD.g:2178:1: entryRuleFadeOut returns [EObject current=null] : iv_ruleFadeOut= ruleFadeOut EOF ;
    public final EObject entryRuleFadeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeOut = null;


        try {
            // InternalVideoMontageSVJD.g:2178:48: (iv_ruleFadeOut= ruleFadeOut EOF )
            // InternalVideoMontageSVJD.g:2179:2: iv_ruleFadeOut= ruleFadeOut EOF
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
    // InternalVideoMontageSVJD.g:2185:1: ruleFadeOut returns [EObject current=null] : ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleFadeOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_duration_4_0 = null;



        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:2191:2: ( ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalVideoMontageSVJD.g:2192:2: ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalVideoMontageSVJD.g:2192:2: ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalVideoMontageSVJD.g:2193:3: () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalVideoMontageSVJD.g:2193:3: ()
            // InternalVideoMontageSVJD.g:2194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFadeOutAccess().getFadeOutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,52,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getFadeOutAccess().getFadeOutKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeOutAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontageSVJD.g:2208:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==20) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2209:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getFadeOutAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontageSVJD.g:2213:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontageSVJD.g:2214:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontageSVJD.g:2214:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontageSVJD.g:2215:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getFadeOutAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_duration_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFadeOutRule());
                    						}
                    						set(
                    							current,
                    							"duration",
                    							lv_duration_4_0,
                    							"org.xtext.svjd.VideoMontageSVJD.EDouble");
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
    // InternalVideoMontageSVJD.g:2241:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalVideoMontageSVJD.g:2241:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalVideoMontageSVJD.g:2242:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalVideoMontageSVJD.g:2248:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:2254:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalVideoMontageSVJD.g:2255:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalVideoMontageSVJD.g:2255:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalVideoMontageSVJD.g:2256:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalVideoMontageSVJD.g:2256:3: (kw= '-' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==53) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2257:4: kw= '-'
                    {
                    kw=(Token)match(input,53,FOLLOW_59); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalVideoMontageSVJD.g:2263:3: (this_INT_1= RULE_INT )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_INT) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2264:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_60); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,54,FOLLOW_61); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_62); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalVideoMontageSVJD.g:2284:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=55 && LA50_0<=56)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2285:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalVideoMontageSVJD.g:2285:4: (kw= 'E' | kw= 'e' )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==55) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==56) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalVideoMontageSVJD.g:2286:5: kw= 'E'
                            {
                            kw=(Token)match(input,55,FOLLOW_40); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalVideoMontageSVJD.g:2292:5: kw= 'e'
                            {
                            kw=(Token)match(input,56,FOLLOW_40); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalVideoMontageSVJD.g:2298:4: (kw= '-' )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==53) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalVideoMontageSVJD.g:2299:5: kw= '-'
                            {
                            kw=(Token)match(input,53,FOLLOW_61); 

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
    // InternalVideoMontageSVJD.g:2317:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalVideoMontageSVJD.g:2317:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalVideoMontageSVJD.g:2318:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalVideoMontageSVJD.g:2324:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:2330:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalVideoMontageSVJD.g:2331:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalVideoMontageSVJD.g:2331:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalVideoMontageSVJD.g:2332:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalVideoMontageSVJD.g:2332:3: (kw= '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2333:4: kw= '-'
                    {
                    kw=(Token)match(input,53,FOLLOW_61); 

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
    // InternalVideoMontageSVJD.g:2350:1: ruleOperationMoment returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleOperationMoment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:2356:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalVideoMontageSVJD.g:2357:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalVideoMontageSVJD.g:2357:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==57) ) {
                alt52=1;
            }
            else if ( (LA52_0==53) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2358:3: (enumLiteral_0= '+' )
                    {
                    // InternalVideoMontageSVJD.g:2358:3: (enumLiteral_0= '+' )
                    // InternalVideoMontageSVJD.g:2359:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getOperationMomentAccess().getAdditionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperationMomentAccess().getAdditionEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontageSVJD.g:2366:3: (enumLiteral_1= '-' )
                    {
                    // InternalVideoMontageSVJD.g:2366:3: (enumLiteral_1= '-' )
                    // InternalVideoMontageSVJD.g:2367:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

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
    // InternalVideoMontageSVJD.g:2377:1: ruleMoment returns [Enumerator current=null] : ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) ) ;
    public final Enumerator ruleMoment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:2383:2: ( ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) ) )
            // InternalVideoMontageSVJD.g:2384:2: ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) )
            {
            // InternalVideoMontageSVJD.g:2384:2: ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==58) ) {
                alt53=1;
            }
            else if ( (LA53_0==59) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalVideoMontageSVJD.g:2385:3: (enumLiteral_0= 'starting' )
                    {
                    // InternalVideoMontageSVJD.g:2385:3: (enumLiteral_0= 'starting' )
                    // InternalVideoMontageSVJD.g:2386:4: enumLiteral_0= 'starting'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontageSVJD.g:2393:3: (enumLiteral_1= 'ending' )
                    {
                    // InternalVideoMontageSVJD.g:2393:3: (enumLiteral_1= 'ending' )
                    // InternalVideoMontageSVJD.g:2394:4: enumLiteral_1= 'ending'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

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
    // InternalVideoMontageSVJD.g:2404:1: ruleColor returns [Enumerator current=null] : (enumLiteral_0= 'BLACK' ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:2410:2: ( (enumLiteral_0= 'BLACK' ) )
            // InternalVideoMontageSVJD.g:2411:2: (enumLiteral_0= 'BLACK' )
            {
            // InternalVideoMontageSVJD.g:2411:2: (enumLiteral_0= 'BLACK' )
            // InternalVideoMontageSVJD.g:2412:3: enumLiteral_0= 'BLACK'
            {
            enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

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
    // InternalVideoMontageSVJD.g:2421:1: ruleFontStyle returns [Enumerator current=null] : (enumLiteral_0= 'COMIC_SANS_MS' ) ;
    public final Enumerator ruleFontStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalVideoMontageSVJD.g:2427:2: ( (enumLiteral_0= 'COMIC_SANS_MS' ) )
            // InternalVideoMontageSVJD.g:2428:2: (enumLiteral_0= 'COMIC_SANS_MS' )
            {
            // InternalVideoMontageSVJD.g:2428:2: (enumLiteral_0= 'COMIC_SANS_MS' )
            // InternalVideoMontageSVJD.g:2429:3: enumLiteral_0= 'COMIC_SANS_MS'
            {
            enumLiteral_0=(Token)match(input,61,FOLLOW_2); 

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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000140000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0C00001C00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0060000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000404000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001802000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000098000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200300000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0220000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000F8000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000300000002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x001A000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x001A000000002000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00019F8000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00019F0000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00019E0000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00019C0000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0001980000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001900000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0040000000000040L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0180000000000002L});

}