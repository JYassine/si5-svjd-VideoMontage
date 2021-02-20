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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Movie'", "'{'", "'title'", "'audioelement'", "','", "'}'", "'videoelement'", "'subtitle'", "'Subtitle'", "'duration'", "'relativemoment'", "'textarea'", "'startingmoment'", "'-'", "'.'", "'E'", "'e'", "'RelativeMoment'", "'moment'", "'value'", "'Transition'", "'StartingMoment'", "'Audio'", "'path'", "'transition'", "'audioclip'", "'AudioClip'", "'volume'", "'startCut'", "'endCut'", "'audio'", "'AbsoluteMoment'", "'time'", "'Title'", "'backgroundColor'", "'Clip'", "'video'", "'Video'", "'clip'", "'TextArea'", "'x'", "'y'", "'width'", "'height'", "'text'", "'font'", "'animation'", "'TextAreaDynamic'", "'textSrc'", "'line'", "'FadeIn'", "'FadeOut'", "'starting'", "'ending'", "'BLACK'"
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
    // InternalVideoMontage.g:72:1: ruleMovie returns [EObject current=null] : (otherlv_0= 'Movie' otherlv_1= '{' (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? otherlv_4= 'audioelement' otherlv_5= '{' ( (lv_audioelement_6_0= ruleAudioElement ) ) (otherlv_7= ',' ( (lv_audioelement_8_0= ruleAudioElement ) ) )* otherlv_9= '}' otherlv_10= 'videoelement' otherlv_11= '{' ( (lv_videoelement_12_0= ruleVideoElement ) ) (otherlv_13= ',' ( (lv_videoelement_14_0= ruleVideoElement ) ) )* otherlv_15= '}' otherlv_16= 'subtitle' otherlv_17= '{' ( (lv_subtitle_18_0= ruleSubtitle ) ) (otherlv_19= ',' ( (lv_subtitle_20_0= ruleSubtitle ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleMovie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        EObject lv_audioelement_6_0 = null;

        EObject lv_audioelement_8_0 = null;

        EObject lv_videoelement_12_0 = null;

        EObject lv_videoelement_14_0 = null;

        EObject lv_subtitle_18_0 = null;

        EObject lv_subtitle_20_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:78:2: ( (otherlv_0= 'Movie' otherlv_1= '{' (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? otherlv_4= 'audioelement' otherlv_5= '{' ( (lv_audioelement_6_0= ruleAudioElement ) ) (otherlv_7= ',' ( (lv_audioelement_8_0= ruleAudioElement ) ) )* otherlv_9= '}' otherlv_10= 'videoelement' otherlv_11= '{' ( (lv_videoelement_12_0= ruleVideoElement ) ) (otherlv_13= ',' ( (lv_videoelement_14_0= ruleVideoElement ) ) )* otherlv_15= '}' otherlv_16= 'subtitle' otherlv_17= '{' ( (lv_subtitle_18_0= ruleSubtitle ) ) (otherlv_19= ',' ( (lv_subtitle_20_0= ruleSubtitle ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalVideoMontage.g:79:2: (otherlv_0= 'Movie' otherlv_1= '{' (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? otherlv_4= 'audioelement' otherlv_5= '{' ( (lv_audioelement_6_0= ruleAudioElement ) ) (otherlv_7= ',' ( (lv_audioelement_8_0= ruleAudioElement ) ) )* otherlv_9= '}' otherlv_10= 'videoelement' otherlv_11= '{' ( (lv_videoelement_12_0= ruleVideoElement ) ) (otherlv_13= ',' ( (lv_videoelement_14_0= ruleVideoElement ) ) )* otherlv_15= '}' otherlv_16= 'subtitle' otherlv_17= '{' ( (lv_subtitle_18_0= ruleSubtitle ) ) (otherlv_19= ',' ( (lv_subtitle_20_0= ruleSubtitle ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalVideoMontage.g:79:2: (otherlv_0= 'Movie' otherlv_1= '{' (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? otherlv_4= 'audioelement' otherlv_5= '{' ( (lv_audioelement_6_0= ruleAudioElement ) ) (otherlv_7= ',' ( (lv_audioelement_8_0= ruleAudioElement ) ) )* otherlv_9= '}' otherlv_10= 'videoelement' otherlv_11= '{' ( (lv_videoelement_12_0= ruleVideoElement ) ) (otherlv_13= ',' ( (lv_videoelement_14_0= ruleVideoElement ) ) )* otherlv_15= '}' otherlv_16= 'subtitle' otherlv_17= '{' ( (lv_subtitle_18_0= ruleSubtitle ) ) (otherlv_19= ',' ( (lv_subtitle_20_0= ruleSubtitle ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalVideoMontage.g:80:3: otherlv_0= 'Movie' otherlv_1= '{' (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? otherlv_4= 'audioelement' otherlv_5= '{' ( (lv_audioelement_6_0= ruleAudioElement ) ) (otherlv_7= ',' ( (lv_audioelement_8_0= ruleAudioElement ) ) )* otherlv_9= '}' otherlv_10= 'videoelement' otherlv_11= '{' ( (lv_videoelement_12_0= ruleVideoElement ) ) (otherlv_13= ',' ( (lv_videoelement_14_0= ruleVideoElement ) ) )* otherlv_15= '}' otherlv_16= 'subtitle' otherlv_17= '{' ( (lv_subtitle_18_0= ruleSubtitle ) ) (otherlv_19= ',' ( (lv_subtitle_20_0= ruleSubtitle ) ) )* otherlv_21= '}' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMovieAccess().getMovieKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontage.g:88:3: (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalVideoMontage.g:89:4: otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMovieAccess().getTitleKeyword_2_0());
                    			
                    // InternalVideoMontage.g:93:4: ( (lv_title_3_0= ruleEString ) )
                    // InternalVideoMontage.g:94:5: (lv_title_3_0= ruleEString )
                    {
                    // InternalVideoMontage.g:94:5: (lv_title_3_0= ruleEString )
                    // InternalVideoMontage.g:95:6: lv_title_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMovieAccess().getTitleEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_title_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMovieRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_3_0,
                    							"org.xtext.svjd.VideoMontage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getMovieAccess().getAudioelementKeyword_3());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVideoMontage.g:121:3: ( (lv_audioelement_6_0= ruleAudioElement ) )
            // InternalVideoMontage.g:122:4: (lv_audioelement_6_0= ruleAudioElement )
            {
            // InternalVideoMontage.g:122:4: (lv_audioelement_6_0= ruleAudioElement )
            // InternalVideoMontage.g:123:5: lv_audioelement_6_0= ruleAudioElement
            {

            					newCompositeNode(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalVideoMontage.g:140:3: (otherlv_7= ',' ( (lv_audioelement_8_0= ruleAudioElement ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVideoMontage.g:141:4: otherlv_7= ',' ( (lv_audioelement_8_0= ruleAudioElement ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getMovieAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalVideoMontage.g:145:4: ( (lv_audioelement_8_0= ruleAudioElement ) )
            	    // InternalVideoMontage.g:146:5: (lv_audioelement_8_0= ruleAudioElement )
            	    {
            	    // InternalVideoMontage.g:146:5: (lv_audioelement_8_0= ruleAudioElement )
            	    // InternalVideoMontage.g:147:6: lv_audioelement_8_0= ruleAudioElement
            	    {

            	    						newCompositeNode(grammarAccess.getMovieAccess().getAudioelementAudioElementParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_audioelement_8_0=ruleAudioElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMovieRule());
            	    						}
            	    						add(
            	    							current,
            	    							"audioelement",
            	    							lv_audioelement_8_0,
            	    							"org.xtext.svjd.VideoMontage.AudioElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getMovieAccess().getVideoelementKeyword_8());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalVideoMontage.g:177:3: ( (lv_videoelement_12_0= ruleVideoElement ) )
            // InternalVideoMontage.g:178:4: (lv_videoelement_12_0= ruleVideoElement )
            {
            // InternalVideoMontage.g:178:4: (lv_videoelement_12_0= ruleVideoElement )
            // InternalVideoMontage.g:179:5: lv_videoelement_12_0= ruleVideoElement
            {

            					newCompositeNode(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_videoelement_12_0=ruleVideoElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovieRule());
            					}
            					add(
            						current,
            						"videoelement",
            						lv_videoelement_12_0,
            						"org.xtext.svjd.VideoMontage.VideoElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:196:3: (otherlv_13= ',' ( (lv_videoelement_14_0= ruleVideoElement ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVideoMontage.g:197:4: otherlv_13= ',' ( (lv_videoelement_14_0= ruleVideoElement ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_13, grammarAccess.getMovieAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalVideoMontage.g:201:4: ( (lv_videoelement_14_0= ruleVideoElement ) )
            	    // InternalVideoMontage.g:202:5: (lv_videoelement_14_0= ruleVideoElement )
            	    {
            	    // InternalVideoMontage.g:202:5: (lv_videoelement_14_0= ruleVideoElement )
            	    // InternalVideoMontage.g:203:6: lv_videoelement_14_0= ruleVideoElement
            	    {

            	    						newCompositeNode(grammarAccess.getMovieAccess().getVideoelementVideoElementParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_videoelement_14_0=ruleVideoElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMovieRule());
            	    						}
            	    						add(
            	    							current,
            	    							"videoelement",
            	    							lv_videoelement_14_0,
            	    							"org.xtext.svjd.VideoMontage.VideoElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_15=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_12());
            		
            otherlv_16=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getMovieAccess().getSubtitleKeyword_13());
            		
            otherlv_17=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_17, grammarAccess.getMovieAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalVideoMontage.g:233:3: ( (lv_subtitle_18_0= ruleSubtitle ) )
            // InternalVideoMontage.g:234:4: (lv_subtitle_18_0= ruleSubtitle )
            {
            // InternalVideoMontage.g:234:4: (lv_subtitle_18_0= ruleSubtitle )
            // InternalVideoMontage.g:235:5: lv_subtitle_18_0= ruleSubtitle
            {

            					newCompositeNode(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_8);
            lv_subtitle_18_0=ruleSubtitle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovieRule());
            					}
            					add(
            						current,
            						"subtitle",
            						lv_subtitle_18_0,
            						"org.xtext.svjd.VideoMontage.Subtitle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:252:3: (otherlv_19= ',' ( (lv_subtitle_20_0= ruleSubtitle ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVideoMontage.g:253:4: otherlv_19= ',' ( (lv_subtitle_20_0= ruleSubtitle ) )
            	    {
            	    otherlv_19=(Token)match(input,15,FOLLOW_12); 

            	    				newLeafNode(otherlv_19, grammarAccess.getMovieAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalVideoMontage.g:257:4: ( (lv_subtitle_20_0= ruleSubtitle ) )
            	    // InternalVideoMontage.g:258:5: (lv_subtitle_20_0= ruleSubtitle )
            	    {
            	    // InternalVideoMontage.g:258:5: (lv_subtitle_20_0= ruleSubtitle )
            	    // InternalVideoMontage.g:259:6: lv_subtitle_20_0= ruleSubtitle
            	    {

            	    						newCompositeNode(grammarAccess.getMovieAccess().getSubtitleSubtitleParserRuleCall_16_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_subtitle_20_0=ruleSubtitle();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMovieRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subtitle",
            	    							lv_subtitle_20_0,
            	    							"org.xtext.svjd.VideoMontage.Subtitle");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_21=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_21, grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_17());
            		
            otherlv_22=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getMovieAccess().getRightCurlyBracketKeyword_18());
            		

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
    // InternalVideoMontage.g:289:1: entryRuleAudioElement returns [EObject current=null] : iv_ruleAudioElement= ruleAudioElement EOF ;
    public final EObject entryRuleAudioElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioElement = null;


        try {
            // InternalVideoMontage.g:289:53: (iv_ruleAudioElement= ruleAudioElement EOF )
            // InternalVideoMontage.g:290:2: iv_ruleAudioElement= ruleAudioElement EOF
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
    // InternalVideoMontage.g:296:1: ruleAudioElement returns [EObject current=null] : (this_Audio_0= ruleAudio | this_AudioClip_1= ruleAudioClip ) ;
    public final EObject ruleAudioElement() throws RecognitionException {
        EObject current = null;

        EObject this_Audio_0 = null;

        EObject this_AudioClip_1 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:302:2: ( (this_Audio_0= ruleAudio | this_AudioClip_1= ruleAudioClip ) )
            // InternalVideoMontage.g:303:2: (this_Audio_0= ruleAudio | this_AudioClip_1= ruleAudioClip )
            {
            // InternalVideoMontage.g:303:2: (this_Audio_0= ruleAudio | this_AudioClip_1= ruleAudioClip )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalVideoMontage.g:304:3: this_Audio_0= ruleAudio
                    {

                    			newCompositeNode(grammarAccess.getAudioElementAccess().getAudioParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Audio_0=ruleAudio();

                    state._fsp--;


                    			current = this_Audio_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:313:3: this_AudioClip_1= ruleAudioClip
                    {

                    			newCompositeNode(grammarAccess.getAudioElementAccess().getAudioClipParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AudioClip_1=ruleAudioClip();

                    state._fsp--;


                    			current = this_AudioClip_1;
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
    // $ANTLR end "ruleAudioElement"


    // $ANTLR start "entryRuleVideoElement"
    // InternalVideoMontage.g:325:1: entryRuleVideoElement returns [EObject current=null] : iv_ruleVideoElement= ruleVideoElement EOF ;
    public final EObject entryRuleVideoElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoElement = null;


        try {
            // InternalVideoMontage.g:325:53: (iv_ruleVideoElement= ruleVideoElement EOF )
            // InternalVideoMontage.g:326:2: iv_ruleVideoElement= ruleVideoElement EOF
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
    // InternalVideoMontage.g:332:1: ruleVideoElement returns [EObject current=null] : (this_Title_0= ruleTitle | this_Clip_1= ruleClip | this_Video_2= ruleVideo ) ;
    public final EObject ruleVideoElement() throws RecognitionException {
        EObject current = null;

        EObject this_Title_0 = null;

        EObject this_Clip_1 = null;

        EObject this_Video_2 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:338:2: ( (this_Title_0= ruleTitle | this_Clip_1= ruleClip | this_Video_2= ruleVideo ) )
            // InternalVideoMontage.g:339:2: (this_Title_0= ruleTitle | this_Clip_1= ruleClip | this_Video_2= ruleVideo )
            {
            // InternalVideoMontage.g:339:2: (this_Title_0= ruleTitle | this_Clip_1= ruleClip | this_Video_2= ruleVideo )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt6=1;
                }
                break;
            case 46:
                {
                alt6=2;
                }
                break;
            case 48:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalVideoMontage.g:340:3: this_Title_0= ruleTitle
                    {

                    			newCompositeNode(grammarAccess.getVideoElementAccess().getTitleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Title_0=ruleTitle();

                    state._fsp--;


                    			current = this_Title_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:349:3: this_Clip_1= ruleClip
                    {

                    			newCompositeNode(grammarAccess.getVideoElementAccess().getClipParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Clip_1=ruleClip();

                    state._fsp--;


                    			current = this_Clip_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVideoMontage.g:358:3: this_Video_2= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getVideoElementAccess().getVideoParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_2=ruleVideo();

                    state._fsp--;


                    			current = this_Video_2;
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
    // $ANTLR end "ruleVideoElement"


    // $ANTLR start "entryRuleTextArea"
    // InternalVideoMontage.g:370:1: entryRuleTextArea returns [EObject current=null] : iv_ruleTextArea= ruleTextArea EOF ;
    public final EObject entryRuleTextArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea = null;


        try {
            // InternalVideoMontage.g:370:49: (iv_ruleTextArea= ruleTextArea EOF )
            // InternalVideoMontage.g:371:2: iv_ruleTextArea= ruleTextArea EOF
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
    // InternalVideoMontage.g:377:1: ruleTextArea returns [EObject current=null] : (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic ) ;
    public final EObject ruleTextArea() throws RecognitionException {
        EObject current = null;

        EObject this_TextArea_Impl_0 = null;

        EObject this_TextAreaDynamic_1 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:383:2: ( (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic ) )
            // InternalVideoMontage.g:384:2: (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic )
            {
            // InternalVideoMontage.g:384:2: (this_TextArea_Impl_0= ruleTextArea_Impl | this_TextAreaDynamic_1= ruleTextAreaDynamic )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==50) ) {
                alt7=1;
            }
            else if ( (LA7_0==58) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVideoMontage.g:385:3: this_TextArea_Impl_0= ruleTextArea_Impl
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
                    // InternalVideoMontage.g:394:3: this_TextAreaDynamic_1= ruleTextAreaDynamic
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
    // InternalVideoMontage.g:406:1: entryRuleStartingMoment returns [EObject current=null] : iv_ruleStartingMoment= ruleStartingMoment EOF ;
    public final EObject entryRuleStartingMoment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingMoment = null;


        try {
            // InternalVideoMontage.g:406:55: (iv_ruleStartingMoment= ruleStartingMoment EOF )
            // InternalVideoMontage.g:407:2: iv_ruleStartingMoment= ruleStartingMoment EOF
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
    // InternalVideoMontage.g:413:1: ruleStartingMoment returns [EObject current=null] : (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment ) ;
    public final EObject ruleStartingMoment() throws RecognitionException {
        EObject current = null;

        EObject this_StartingMoment_Impl_0 = null;

        EObject this_RelativeMoment_1 = null;

        EObject this_AbsoluteMoment_2 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:419:2: ( (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment ) )
            // InternalVideoMontage.g:420:2: (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment )
            {
            // InternalVideoMontage.g:420:2: (this_StartingMoment_Impl_0= ruleStartingMoment_Impl | this_RelativeMoment_1= ruleRelativeMoment | this_AbsoluteMoment_2= ruleAbsoluteMoment )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 42:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalVideoMontage.g:421:3: this_StartingMoment_Impl_0= ruleStartingMoment_Impl
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
                    // InternalVideoMontage.g:430:3: this_RelativeMoment_1= ruleRelativeMoment
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
                    // InternalVideoMontage.g:439:3: this_AbsoluteMoment_2= ruleAbsoluteMoment
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
    // InternalVideoMontage.g:451:1: entryRuleAnimation returns [EObject current=null] : iv_ruleAnimation= ruleAnimation EOF ;
    public final EObject entryRuleAnimation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnimation = null;


        try {
            // InternalVideoMontage.g:451:50: (iv_ruleAnimation= ruleAnimation EOF )
            // InternalVideoMontage.g:452:2: iv_ruleAnimation= ruleAnimation EOF
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
    // InternalVideoMontage.g:458:1: ruleAnimation returns [EObject current=null] : (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut ) ;
    public final EObject ruleAnimation() throws RecognitionException {
        EObject current = null;

        EObject this_FadeIn_0 = null;

        EObject this_FadeOut_1 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:464:2: ( (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut ) )
            // InternalVideoMontage.g:465:2: (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut )
            {
            // InternalVideoMontage.g:465:2: (this_FadeIn_0= ruleFadeIn | this_FadeOut_1= ruleFadeOut )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==61) ) {
                alt9=1;
            }
            else if ( (LA9_0==62) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoMontage.g:466:3: this_FadeIn_0= ruleFadeIn
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
                    // InternalVideoMontage.g:475:3: this_FadeOut_1= ruleFadeOut
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
    // InternalVideoMontage.g:487:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVideoMontage.g:487:47: (iv_ruleEString= ruleEString EOF )
            // InternalVideoMontage.g:488:2: iv_ruleEString= ruleEString EOF
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
    // InternalVideoMontage.g:494:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:500:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVideoMontage.g:501:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVideoMontage.g:501:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalVideoMontage.g:502:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:510:3: this_ID_1= RULE_ID
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
    // InternalVideoMontage.g:521:1: entryRuleSubtitle returns [EObject current=null] : iv_ruleSubtitle= ruleSubtitle EOF ;
    public final EObject entryRuleSubtitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubtitle = null;


        try {
            // InternalVideoMontage.g:521:49: (iv_ruleSubtitle= ruleSubtitle EOF )
            // InternalVideoMontage.g:522:2: iv_ruleSubtitle= ruleSubtitle EOF
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
    // InternalVideoMontage.g:528:1: ruleSubtitle returns [EObject current=null] : (otherlv_0= 'Subtitle' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'relativemoment' otherlv_5= '{' ( (lv_relativemoment_6_0= ruleRelativeMoment ) ) (otherlv_7= ',' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) )* otherlv_9= '}' otherlv_10= 'textarea' ( (lv_textarea_11_0= ruleTextArea ) ) otherlv_12= 'startingmoment' ( (lv_startingmoment_13_0= ruleStartingMoment ) ) otherlv_14= '}' ) ;
    public final EObject ruleSubtitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_duration_3_0 = null;

        EObject lv_relativemoment_6_0 = null;

        EObject lv_relativemoment_8_0 = null;

        EObject lv_textarea_11_0 = null;

        EObject lv_startingmoment_13_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:534:2: ( (otherlv_0= 'Subtitle' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'relativemoment' otherlv_5= '{' ( (lv_relativemoment_6_0= ruleRelativeMoment ) ) (otherlv_7= ',' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) )* otherlv_9= '}' otherlv_10= 'textarea' ( (lv_textarea_11_0= ruleTextArea ) ) otherlv_12= 'startingmoment' ( (lv_startingmoment_13_0= ruleStartingMoment ) ) otherlv_14= '}' ) )
            // InternalVideoMontage.g:535:2: (otherlv_0= 'Subtitle' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'relativemoment' otherlv_5= '{' ( (lv_relativemoment_6_0= ruleRelativeMoment ) ) (otherlv_7= ',' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) )* otherlv_9= '}' otherlv_10= 'textarea' ( (lv_textarea_11_0= ruleTextArea ) ) otherlv_12= 'startingmoment' ( (lv_startingmoment_13_0= ruleStartingMoment ) ) otherlv_14= '}' )
            {
            // InternalVideoMontage.g:535:2: (otherlv_0= 'Subtitle' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'relativemoment' otherlv_5= '{' ( (lv_relativemoment_6_0= ruleRelativeMoment ) ) (otherlv_7= ',' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) )* otherlv_9= '}' otherlv_10= 'textarea' ( (lv_textarea_11_0= ruleTextArea ) ) otherlv_12= 'startingmoment' ( (lv_startingmoment_13_0= ruleStartingMoment ) ) otherlv_14= '}' )
            // InternalVideoMontage.g:536:3: otherlv_0= 'Subtitle' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'relativemoment' otherlv_5= '{' ( (lv_relativemoment_6_0= ruleRelativeMoment ) ) (otherlv_7= ',' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) )* otherlv_9= '}' otherlv_10= 'textarea' ( (lv_textarea_11_0= ruleTextArea ) ) otherlv_12= 'startingmoment' ( (lv_startingmoment_13_0= ruleStartingMoment ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubtitleAccess().getSubtitleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontage.g:544:3: (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVideoMontage.g:545:4: otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getSubtitleAccess().getDurationKeyword_2_0());
                    			
                    // InternalVideoMontage.g:549:4: ( (lv_duration_3_0= ruleEDouble ) )
                    // InternalVideoMontage.g:550:5: (lv_duration_3_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:550:5: (lv_duration_3_0= ruleEDouble )
                    // InternalVideoMontage.g:551:6: lv_duration_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getSubtitleAccess().getDurationEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_duration_3_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubtitleRule());
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

            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getSubtitleAccess().getRelativemomentKeyword_3());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getSubtitleAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalVideoMontage.g:577:3: ( (lv_relativemoment_6_0= ruleRelativeMoment ) )
            // InternalVideoMontage.g:578:4: (lv_relativemoment_6_0= ruleRelativeMoment )
            {
            // InternalVideoMontage.g:578:4: (lv_relativemoment_6_0= ruleRelativeMoment )
            // InternalVideoMontage.g:579:5: lv_relativemoment_6_0= ruleRelativeMoment
            {

            					newCompositeNode(grammarAccess.getSubtitleAccess().getRelativemomentRelativeMomentParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_relativemoment_6_0=ruleRelativeMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtitleRule());
            					}
            					add(
            						current,
            						"relativemoment",
            						lv_relativemoment_6_0,
            						"org.xtext.svjd.VideoMontage.RelativeMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:596:3: (otherlv_7= ',' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVideoMontage.g:597:4: otherlv_7= ',' ( (lv_relativemoment_8_0= ruleRelativeMoment ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_7, grammarAccess.getSubtitleAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalVideoMontage.g:601:4: ( (lv_relativemoment_8_0= ruleRelativeMoment ) )
            	    // InternalVideoMontage.g:602:5: (lv_relativemoment_8_0= ruleRelativeMoment )
            	    {
            	    // InternalVideoMontage.g:602:5: (lv_relativemoment_8_0= ruleRelativeMoment )
            	    // InternalVideoMontage.g:603:6: lv_relativemoment_8_0= ruleRelativeMoment
            	    {

            	    						newCompositeNode(grammarAccess.getSubtitleAccess().getRelativemomentRelativeMomentParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_relativemoment_8_0=ruleRelativeMoment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSubtitleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relativemoment",
            	    							lv_relativemoment_8_0,
            	    							"org.xtext.svjd.VideoMontage.RelativeMoment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getSubtitleAccess().getTextareaKeyword_8());
            		
            // InternalVideoMontage.g:629:3: ( (lv_textarea_11_0= ruleTextArea ) )
            // InternalVideoMontage.g:630:4: (lv_textarea_11_0= ruleTextArea )
            {
            // InternalVideoMontage.g:630:4: (lv_textarea_11_0= ruleTextArea )
            // InternalVideoMontage.g:631:5: lv_textarea_11_0= ruleTextArea
            {

            					newCompositeNode(grammarAccess.getSubtitleAccess().getTextareaTextAreaParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_20);
            lv_textarea_11_0=ruleTextArea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtitleRule());
            					}
            					set(
            						current,
            						"textarea",
            						lv_textarea_11_0,
            						"org.xtext.svjd.VideoMontage.TextArea");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_12, grammarAccess.getSubtitleAccess().getStartingmomentKeyword_10());
            		
            // InternalVideoMontage.g:652:3: ( (lv_startingmoment_13_0= ruleStartingMoment ) )
            // InternalVideoMontage.g:653:4: (lv_startingmoment_13_0= ruleStartingMoment )
            {
            // InternalVideoMontage.g:653:4: (lv_startingmoment_13_0= ruleStartingMoment )
            // InternalVideoMontage.g:654:5: lv_startingmoment_13_0= ruleStartingMoment
            {

            					newCompositeNode(grammarAccess.getSubtitleAccess().getStartingmomentStartingMomentParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_13);
            lv_startingmoment_13_0=ruleStartingMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubtitleRule());
            					}
            					set(
            						current,
            						"startingmoment",
            						lv_startingmoment_13_0,
            						"org.xtext.svjd.VideoMontage.StartingMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSubtitleAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleEDouble"
    // InternalVideoMontage.g:679:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalVideoMontage.g:679:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalVideoMontage.g:680:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalVideoMontage.g:686:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:692:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalVideoMontage.g:693:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalVideoMontage.g:693:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalVideoMontage.g:694:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalVideoMontage.g:694:3: (kw= '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVideoMontage.g:695:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_22); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalVideoMontage.g:701:3: (this_INT_1= RULE_INT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVideoMontage.g:702:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_23); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,25,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_25); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalVideoMontage.g:722:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=26 && LA17_0<=27)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVideoMontage.g:723:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalVideoMontage.g:723:4: (kw= 'E' | kw= 'e' )
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==26) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==27) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalVideoMontage.g:724:5: kw= 'E'
                            {
                            kw=(Token)match(input,26,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalVideoMontage.g:730:5: kw= 'e'
                            {
                            kw=(Token)match(input,27,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalVideoMontage.g:736:4: (kw= '-' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==24) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalVideoMontage.g:737:5: kw= '-'
                            {
                            kw=(Token)match(input,24,FOLLOW_24); 

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


    // $ANTLR start "entryRuleRelativeMoment"
    // InternalVideoMontage.g:755:1: entryRuleRelativeMoment returns [EObject current=null] : iv_ruleRelativeMoment= ruleRelativeMoment EOF ;
    public final EObject entryRuleRelativeMoment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeMoment = null;


        try {
            // InternalVideoMontage.g:755:55: (iv_ruleRelativeMoment= ruleRelativeMoment EOF )
            // InternalVideoMontage.g:756:2: iv_ruleRelativeMoment= ruleRelativeMoment EOF
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
    // InternalVideoMontage.g:762:1: ruleRelativeMoment returns [EObject current=null] : ( () otherlv_1= 'RelativeMoment' otherlv_2= '{' (otherlv_3= 'moment' ( (lv_moment_4_0= ruleMoment ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEDouble ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleRelativeMoment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_moment_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:768:2: ( ( () otherlv_1= 'RelativeMoment' otherlv_2= '{' (otherlv_3= 'moment' ( (lv_moment_4_0= ruleMoment ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEDouble ) ) )? otherlv_7= '}' ) )
            // InternalVideoMontage.g:769:2: ( () otherlv_1= 'RelativeMoment' otherlv_2= '{' (otherlv_3= 'moment' ( (lv_moment_4_0= ruleMoment ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEDouble ) ) )? otherlv_7= '}' )
            {
            // InternalVideoMontage.g:769:2: ( () otherlv_1= 'RelativeMoment' otherlv_2= '{' (otherlv_3= 'moment' ( (lv_moment_4_0= ruleMoment ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEDouble ) ) )? otherlv_7= '}' )
            // InternalVideoMontage.g:770:3: () otherlv_1= 'RelativeMoment' otherlv_2= '{' (otherlv_3= 'moment' ( (lv_moment_4_0= ruleMoment ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEDouble ) ) )? otherlv_7= '}'
            {
            // InternalVideoMontage.g:770:3: ()
            // InternalVideoMontage.g:771:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeMomentAccess().getRelativeMomentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeMomentAccess().getRelativeMomentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeMomentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:785:3: (otherlv_3= 'moment' ( (lv_moment_4_0= ruleMoment ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVideoMontage.g:786:4: otherlv_3= 'moment' ( (lv_moment_4_0= ruleMoment ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeMomentAccess().getMomentKeyword_3_0());
                    			
                    // InternalVideoMontage.g:790:4: ( (lv_moment_4_0= ruleMoment ) )
                    // InternalVideoMontage.g:791:5: (lv_moment_4_0= ruleMoment )
                    {
                    // InternalVideoMontage.g:791:5: (lv_moment_4_0= ruleMoment )
                    // InternalVideoMontage.g:792:6: lv_moment_4_0= ruleMoment
                    {

                    						newCompositeNode(grammarAccess.getRelativeMomentAccess().getMomentMomentEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_moment_4_0=ruleMoment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeMomentRule());
                    						}
                    						set(
                    							current,
                    							"moment",
                    							lv_moment_4_0,
                    							"org.xtext.svjd.VideoMontage.Moment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:810:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEDouble ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVideoMontage.g:811:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelativeMomentAccess().getValueKeyword_4_0());
                    			
                    // InternalVideoMontage.g:815:4: ( (lv_value_6_0= ruleEDouble ) )
                    // InternalVideoMontage.g:816:5: (lv_value_6_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:816:5: (lv_value_6_0= ruleEDouble )
                    // InternalVideoMontage.g:817:6: lv_value_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRelativeMomentAccess().getValueEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
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


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRelativeMomentAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleTransition"
    // InternalVideoMontage.g:843:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalVideoMontage.g:843:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalVideoMontage.g:844:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalVideoMontage.g:850:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioelement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' ) ;
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
            // InternalVideoMontage.g:856:2: ( (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioelement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' ) )
            // InternalVideoMontage.g:857:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioelement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' )
            {
            // InternalVideoMontage.g:857:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioelement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}' )
            // InternalVideoMontage.g:858:3: otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? otherlv_4= 'audioelement' ( (lv_audioelement_5_0= ruleAudioElement ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontage.g:866:3: (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVideoMontage.g:867:4: otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getDurationKeyword_2_0());
                    			
                    // InternalVideoMontage.g:871:4: ( (lv_duration_3_0= ruleEDouble ) )
                    // InternalVideoMontage.g:872:5: (lv_duration_3_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:872:5: (lv_duration_3_0= ruleEDouble )
                    // InternalVideoMontage.g:873:6: lv_duration_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getDurationEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_6);
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

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getAudioelementKeyword_3());
            		
            // InternalVideoMontage.g:895:3: ( (lv_audioelement_5_0= ruleAudioElement ) )
            // InternalVideoMontage.g:896:4: (lv_audioelement_5_0= ruleAudioElement )
            {
            // InternalVideoMontage.g:896:4: (lv_audioelement_5_0= ruleAudioElement )
            // InternalVideoMontage.g:897:5: lv_audioelement_5_0= ruleAudioElement
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getAudioelementAudioElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleStartingMoment_Impl"
    // InternalVideoMontage.g:922:1: entryRuleStartingMoment_Impl returns [EObject current=null] : iv_ruleStartingMoment_Impl= ruleStartingMoment_Impl EOF ;
    public final EObject entryRuleStartingMoment_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartingMoment_Impl = null;


        try {
            // InternalVideoMontage.g:922:60: (iv_ruleStartingMoment_Impl= ruleStartingMoment_Impl EOF )
            // InternalVideoMontage.g:923:2: iv_ruleStartingMoment_Impl= ruleStartingMoment_Impl EOF
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
    // InternalVideoMontage.g:929:1: ruleStartingMoment_Impl returns [EObject current=null] : ( () otherlv_1= 'StartingMoment' ) ;
    public final EObject ruleStartingMoment_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:935:2: ( ( () otherlv_1= 'StartingMoment' ) )
            // InternalVideoMontage.g:936:2: ( () otherlv_1= 'StartingMoment' )
            {
            // InternalVideoMontage.g:936:2: ( () otherlv_1= 'StartingMoment' )
            // InternalVideoMontage.g:937:3: () otherlv_1= 'StartingMoment'
            {
            // InternalVideoMontage.g:937:3: ()
            // InternalVideoMontage.g:938:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartingMoment_ImplAccess().getStartingMomentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

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


    // $ANTLR start "entryRuleAudio"
    // InternalVideoMontage.g:952:1: entryRuleAudio returns [EObject current=null] : iv_ruleAudio= ruleAudio EOF ;
    public final EObject entryRuleAudio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudio = null;


        try {
            // InternalVideoMontage.g:952:46: (iv_ruleAudio= ruleAudio EOF )
            // InternalVideoMontage.g:953:2: iv_ruleAudio= ruleAudio EOF
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
    // InternalVideoMontage.g:959:1: ruleAudio returns [EObject current=null] : (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )? otherlv_7= 'relativemoment' otherlv_8= '{' ( (lv_relativemoment_9_0= ruleRelativeMoment ) ) (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )* otherlv_12= '}' (otherlv_13= 'transition' ( (lv_transition_14_0= ruleTransition ) ) )? otherlv_15= 'startingmoment' ( (lv_startingmoment_16_0= ruleStartingMoment ) ) otherlv_17= 'audioclip' ( (lv_audioclip_18_0= ruleAudioClip ) ) otherlv_19= '}' ) ;
    public final EObject ruleAudio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        AntlrDatatypeRuleToken lv_path_6_0 = null;

        EObject lv_relativemoment_9_0 = null;

        EObject lv_relativemoment_11_0 = null;

        EObject lv_transition_14_0 = null;

        EObject lv_startingmoment_16_0 = null;

        EObject lv_audioclip_18_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:965:2: ( (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )? otherlv_7= 'relativemoment' otherlv_8= '{' ( (lv_relativemoment_9_0= ruleRelativeMoment ) ) (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )* otherlv_12= '}' (otherlv_13= 'transition' ( (lv_transition_14_0= ruleTransition ) ) )? otherlv_15= 'startingmoment' ( (lv_startingmoment_16_0= ruleStartingMoment ) ) otherlv_17= 'audioclip' ( (lv_audioclip_18_0= ruleAudioClip ) ) otherlv_19= '}' ) )
            // InternalVideoMontage.g:966:2: (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )? otherlv_7= 'relativemoment' otherlv_8= '{' ( (lv_relativemoment_9_0= ruleRelativeMoment ) ) (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )* otherlv_12= '}' (otherlv_13= 'transition' ( (lv_transition_14_0= ruleTransition ) ) )? otherlv_15= 'startingmoment' ( (lv_startingmoment_16_0= ruleStartingMoment ) ) otherlv_17= 'audioclip' ( (lv_audioclip_18_0= ruleAudioClip ) ) otherlv_19= '}' )
            {
            // InternalVideoMontage.g:966:2: (otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )? otherlv_7= 'relativemoment' otherlv_8= '{' ( (lv_relativemoment_9_0= ruleRelativeMoment ) ) (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )* otherlv_12= '}' (otherlv_13= 'transition' ( (lv_transition_14_0= ruleTransition ) ) )? otherlv_15= 'startingmoment' ( (lv_startingmoment_16_0= ruleStartingMoment ) ) otherlv_17= 'audioclip' ( (lv_audioclip_18_0= ruleAudioClip ) ) otherlv_19= '}' )
            // InternalVideoMontage.g:967:3: otherlv_0= 'Audio' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )? otherlv_7= 'relativemoment' otherlv_8= '{' ( (lv_relativemoment_9_0= ruleRelativeMoment ) ) (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )* otherlv_12= '}' (otherlv_13= 'transition' ( (lv_transition_14_0= ruleTransition ) ) )? otherlv_15= 'startingmoment' ( (lv_startingmoment_16_0= ruleStartingMoment ) ) otherlv_17= 'audioclip' ( (lv_audioclip_18_0= ruleAudioClip ) ) otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioAccess().getAudioKeyword_0());
            		
            // InternalVideoMontage.g:971:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontage.g:972:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontage.g:972:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontage.g:973:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:994:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVideoMontage.g:995:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getAudioAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontage.g:999:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1000:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1000:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontage.g:1001:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_duration_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioRule());
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

            // InternalVideoMontage.g:1019:3: (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVideoMontage.g:1020:4: otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getAudioAccess().getPathKeyword_4_0());
                    			
                    // InternalVideoMontage.g:1024:4: ( (lv_path_6_0= ruleEString ) )
                    // InternalVideoMontage.g:1025:5: (lv_path_6_0= ruleEString )
                    {
                    // InternalVideoMontage.g:1025:5: (lv_path_6_0= ruleEString )
                    // InternalVideoMontage.g:1026:6: lv_path_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getPathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_path_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_6_0,
                    							"org.xtext.svjd.VideoMontage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getAudioAccess().getRelativemomentKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getAudioAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalVideoMontage.g:1052:3: ( (lv_relativemoment_9_0= ruleRelativeMoment ) )
            // InternalVideoMontage.g:1053:4: (lv_relativemoment_9_0= ruleRelativeMoment )
            {
            // InternalVideoMontage.g:1053:4: (lv_relativemoment_9_0= ruleRelativeMoment )
            // InternalVideoMontage.g:1054:5: lv_relativemoment_9_0= ruleRelativeMoment
            {

            					newCompositeNode(grammarAccess.getAudioAccess().getRelativemomentRelativeMomentParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_relativemoment_9_0=ruleRelativeMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioRule());
            					}
            					add(
            						current,
            						"relativemoment",
            						lv_relativemoment_9_0,
            						"org.xtext.svjd.VideoMontage.RelativeMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:1071:3: (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==15) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalVideoMontage.g:1072:4: otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_10, grammarAccess.getAudioAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalVideoMontage.g:1076:4: ( (lv_relativemoment_11_0= ruleRelativeMoment ) )
            	    // InternalVideoMontage.g:1077:5: (lv_relativemoment_11_0= ruleRelativeMoment )
            	    {
            	    // InternalVideoMontage.g:1077:5: (lv_relativemoment_11_0= ruleRelativeMoment )
            	    // InternalVideoMontage.g:1078:6: lv_relativemoment_11_0= ruleRelativeMoment
            	    {

            	    						newCompositeNode(grammarAccess.getAudioAccess().getRelativemomentRelativeMomentParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_relativemoment_11_0=ruleRelativeMoment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAudioRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relativemoment",
            	    							lv_relativemoment_11_0,
            	    							"org.xtext.svjd.VideoMontage.RelativeMoment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_33); 

            			newLeafNode(otherlv_12, grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_9());
            		
            // InternalVideoMontage.g:1100:3: (otherlv_13= 'transition' ( (lv_transition_14_0= ruleTransition ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVideoMontage.g:1101:4: otherlv_13= 'transition' ( (lv_transition_14_0= ruleTransition ) )
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_34); 

                    				newLeafNode(otherlv_13, grammarAccess.getAudioAccess().getTransitionKeyword_10_0());
                    			
                    // InternalVideoMontage.g:1105:4: ( (lv_transition_14_0= ruleTransition ) )
                    // InternalVideoMontage.g:1106:5: (lv_transition_14_0= ruleTransition )
                    {
                    // InternalVideoMontage.g:1106:5: (lv_transition_14_0= ruleTransition )
                    // InternalVideoMontage.g:1107:6: lv_transition_14_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getAudioAccess().getTransitionTransitionParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_transition_14_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioRule());
                    						}
                    						set(
                    							current,
                    							"transition",
                    							lv_transition_14_0,
                    							"org.xtext.svjd.VideoMontage.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_15, grammarAccess.getAudioAccess().getStartingmomentKeyword_11());
            		
            // InternalVideoMontage.g:1129:3: ( (lv_startingmoment_16_0= ruleStartingMoment ) )
            // InternalVideoMontage.g:1130:4: (lv_startingmoment_16_0= ruleStartingMoment )
            {
            // InternalVideoMontage.g:1130:4: (lv_startingmoment_16_0= ruleStartingMoment )
            // InternalVideoMontage.g:1131:5: lv_startingmoment_16_0= ruleStartingMoment
            {

            					newCompositeNode(grammarAccess.getAudioAccess().getStartingmomentStartingMomentParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_35);
            lv_startingmoment_16_0=ruleStartingMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioRule());
            					}
            					set(
            						current,
            						"startingmoment",
            						lv_startingmoment_16_0,
            						"org.xtext.svjd.VideoMontage.StartingMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getAudioAccess().getAudioclipKeyword_13());
            		
            // InternalVideoMontage.g:1152:3: ( (lv_audioclip_18_0= ruleAudioClip ) )
            // InternalVideoMontage.g:1153:4: (lv_audioclip_18_0= ruleAudioClip )
            {
            // InternalVideoMontage.g:1153:4: (lv_audioclip_18_0= ruleAudioClip )
            // InternalVideoMontage.g:1154:5: lv_audioclip_18_0= ruleAudioClip
            {

            					newCompositeNode(grammarAccess.getAudioAccess().getAudioclipAudioClipParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_13);
            lv_audioclip_18_0=ruleAudioClip();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioRule());
            					}
            					set(
            						current,
            						"audioclip",
            						lv_audioclip_18_0,
            						"org.xtext.svjd.VideoMontage.AudioClip");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getAudioAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalVideoMontage.g:1179:1: entryRuleAudioClip returns [EObject current=null] : iv_ruleAudioClip= ruleAudioClip EOF ;
    public final EObject entryRuleAudioClip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudioClip = null;


        try {
            // InternalVideoMontage.g:1179:50: (iv_ruleAudioClip= ruleAudioClip EOF )
            // InternalVideoMontage.g:1180:2: iv_ruleAudioClip= ruleAudioClip EOF
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
    // InternalVideoMontage.g:1186:1: ruleAudioClip returns [EObject current=null] : (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'volume' ( (lv_volume_6_0= ruleEDouble ) ) )? (otherlv_7= 'startCut' ( (lv_startCut_8_0= ruleEDouble ) ) )? (otherlv_9= 'endCut' ( (lv_endCut_10_0= ruleEDouble ) ) )? otherlv_11= 'relativemoment' otherlv_12= '{' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) (otherlv_14= ',' ( (lv_relativemoment_15_0= ruleRelativeMoment ) ) )* otherlv_16= '}' (otherlv_17= 'transition' ( (lv_transition_18_0= ruleTransition ) ) )? otherlv_19= 'startingmoment' ( (lv_startingmoment_20_0= ruleStartingMoment ) ) (otherlv_21= 'audio' otherlv_22= '{' ( (lv_audio_23_0= ruleAudio ) ) (otherlv_24= ',' ( (lv_audio_25_0= ruleAudio ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) ;
    public final EObject ruleAudioClip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        AntlrDatatypeRuleToken lv_volume_6_0 = null;

        AntlrDatatypeRuleToken lv_startCut_8_0 = null;

        AntlrDatatypeRuleToken lv_endCut_10_0 = null;

        EObject lv_relativemoment_13_0 = null;

        EObject lv_relativemoment_15_0 = null;

        EObject lv_transition_18_0 = null;

        EObject lv_startingmoment_20_0 = null;

        EObject lv_audio_23_0 = null;

        EObject lv_audio_25_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1192:2: ( (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'volume' ( (lv_volume_6_0= ruleEDouble ) ) )? (otherlv_7= 'startCut' ( (lv_startCut_8_0= ruleEDouble ) ) )? (otherlv_9= 'endCut' ( (lv_endCut_10_0= ruleEDouble ) ) )? otherlv_11= 'relativemoment' otherlv_12= '{' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) (otherlv_14= ',' ( (lv_relativemoment_15_0= ruleRelativeMoment ) ) )* otherlv_16= '}' (otherlv_17= 'transition' ( (lv_transition_18_0= ruleTransition ) ) )? otherlv_19= 'startingmoment' ( (lv_startingmoment_20_0= ruleStartingMoment ) ) (otherlv_21= 'audio' otherlv_22= '{' ( (lv_audio_23_0= ruleAudio ) ) (otherlv_24= ',' ( (lv_audio_25_0= ruleAudio ) ) )* otherlv_26= '}' )? otherlv_27= '}' ) )
            // InternalVideoMontage.g:1193:2: (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'volume' ( (lv_volume_6_0= ruleEDouble ) ) )? (otherlv_7= 'startCut' ( (lv_startCut_8_0= ruleEDouble ) ) )? (otherlv_9= 'endCut' ( (lv_endCut_10_0= ruleEDouble ) ) )? otherlv_11= 'relativemoment' otherlv_12= '{' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) (otherlv_14= ',' ( (lv_relativemoment_15_0= ruleRelativeMoment ) ) )* otherlv_16= '}' (otherlv_17= 'transition' ( (lv_transition_18_0= ruleTransition ) ) )? otherlv_19= 'startingmoment' ( (lv_startingmoment_20_0= ruleStartingMoment ) ) (otherlv_21= 'audio' otherlv_22= '{' ( (lv_audio_23_0= ruleAudio ) ) (otherlv_24= ',' ( (lv_audio_25_0= ruleAudio ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            {
            // InternalVideoMontage.g:1193:2: (otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'volume' ( (lv_volume_6_0= ruleEDouble ) ) )? (otherlv_7= 'startCut' ( (lv_startCut_8_0= ruleEDouble ) ) )? (otherlv_9= 'endCut' ( (lv_endCut_10_0= ruleEDouble ) ) )? otherlv_11= 'relativemoment' otherlv_12= '{' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) (otherlv_14= ',' ( (lv_relativemoment_15_0= ruleRelativeMoment ) ) )* otherlv_16= '}' (otherlv_17= 'transition' ( (lv_transition_18_0= ruleTransition ) ) )? otherlv_19= 'startingmoment' ( (lv_startingmoment_20_0= ruleStartingMoment ) ) (otherlv_21= 'audio' otherlv_22= '{' ( (lv_audio_23_0= ruleAudio ) ) (otherlv_24= ',' ( (lv_audio_25_0= ruleAudio ) ) )* otherlv_26= '}' )? otherlv_27= '}' )
            // InternalVideoMontage.g:1194:3: otherlv_0= 'AudioClip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'volume' ( (lv_volume_6_0= ruleEDouble ) ) )? (otherlv_7= 'startCut' ( (lv_startCut_8_0= ruleEDouble ) ) )? (otherlv_9= 'endCut' ( (lv_endCut_10_0= ruleEDouble ) ) )? otherlv_11= 'relativemoment' otherlv_12= '{' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) (otherlv_14= ',' ( (lv_relativemoment_15_0= ruleRelativeMoment ) ) )* otherlv_16= '}' (otherlv_17= 'transition' ( (lv_transition_18_0= ruleTransition ) ) )? otherlv_19= 'startingmoment' ( (lv_startingmoment_20_0= ruleStartingMoment ) ) (otherlv_21= 'audio' otherlv_22= '{' ( (lv_audio_23_0= ruleAudio ) ) (otherlv_24= ',' ( (lv_audio_25_0= ruleAudio ) ) )* otherlv_26= '}' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioClipAccess().getAudioClipKeyword_0());
            		
            // InternalVideoMontage.g:1198:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontage.g:1199:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontage.g:1199:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontage.g:1200:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAudioClipAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:1221:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVideoMontage.g:1222:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getAudioClipAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontage.g:1226:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1227:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1227:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontage.g:1228:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAudioClipAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_duration_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioClipRule());
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

            // InternalVideoMontage.g:1246:3: (otherlv_5= 'volume' ( (lv_volume_6_0= ruleEDouble ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalVideoMontage.g:1247:4: otherlv_5= 'volume' ( (lv_volume_6_0= ruleEDouble ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getAudioClipAccess().getVolumeKeyword_4_0());
                    			
                    // InternalVideoMontage.g:1251:4: ( (lv_volume_6_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1252:5: (lv_volume_6_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1252:5: (lv_volume_6_0= ruleEDouble )
                    // InternalVideoMontage.g:1253:6: lv_volume_6_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAudioClipAccess().getVolumeEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_volume_6_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioClipRule());
                    						}
                    						set(
                    							current,
                    							"volume",
                    							lv_volume_6_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1271:3: (otherlv_7= 'startCut' ( (lv_startCut_8_0= ruleEDouble ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalVideoMontage.g:1272:4: otherlv_7= 'startCut' ( (lv_startCut_8_0= ruleEDouble ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getAudioClipAccess().getStartCutKeyword_5_0());
                    			
                    // InternalVideoMontage.g:1276:4: ( (lv_startCut_8_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1277:5: (lv_startCut_8_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1277:5: (lv_startCut_8_0= ruleEDouble )
                    // InternalVideoMontage.g:1278:6: lv_startCut_8_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAudioClipAccess().getStartCutEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_startCut_8_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioClipRule());
                    						}
                    						set(
                    							current,
                    							"startCut",
                    							lv_startCut_8_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1296:3: (otherlv_9= 'endCut' ( (lv_endCut_10_0= ruleEDouble ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalVideoMontage.g:1297:4: otherlv_9= 'endCut' ( (lv_endCut_10_0= ruleEDouble ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getAudioClipAccess().getEndCutKeyword_6_0());
                    			
                    // InternalVideoMontage.g:1301:4: ( (lv_endCut_10_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1302:5: (lv_endCut_10_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1302:5: (lv_endCut_10_0= ruleEDouble )
                    // InternalVideoMontage.g:1303:6: lv_endCut_10_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAudioClipAccess().getEndCutEDoubleParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_endCut_10_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioClipRule());
                    						}
                    						set(
                    							current,
                    							"endCut",
                    							lv_endCut_10_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getAudioClipAccess().getRelativemomentKeyword_7());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalVideoMontage.g:1329:3: ( (lv_relativemoment_13_0= ruleRelativeMoment ) )
            // InternalVideoMontage.g:1330:4: (lv_relativemoment_13_0= ruleRelativeMoment )
            {
            // InternalVideoMontage.g:1330:4: (lv_relativemoment_13_0= ruleRelativeMoment )
            // InternalVideoMontage.g:1331:5: lv_relativemoment_13_0= ruleRelativeMoment
            {

            					newCompositeNode(grammarAccess.getAudioClipAccess().getRelativemomentRelativeMomentParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_relativemoment_13_0=ruleRelativeMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioClipRule());
            					}
            					add(
            						current,
            						"relativemoment",
            						lv_relativemoment_13_0,
            						"org.xtext.svjd.VideoMontage.RelativeMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:1348:3: (otherlv_14= ',' ( (lv_relativemoment_15_0= ruleRelativeMoment ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalVideoMontage.g:1349:4: otherlv_14= ',' ( (lv_relativemoment_15_0= ruleRelativeMoment ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_14, grammarAccess.getAudioClipAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalVideoMontage.g:1353:4: ( (lv_relativemoment_15_0= ruleRelativeMoment ) )
            	    // InternalVideoMontage.g:1354:5: (lv_relativemoment_15_0= ruleRelativeMoment )
            	    {
            	    // InternalVideoMontage.g:1354:5: (lv_relativemoment_15_0= ruleRelativeMoment )
            	    // InternalVideoMontage.g:1355:6: lv_relativemoment_15_0= ruleRelativeMoment
            	    {

            	    						newCompositeNode(grammarAccess.getAudioClipAccess().getRelativemomentRelativeMomentParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_relativemoment_15_0=ruleRelativeMoment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAudioClipRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relativemoment",
            	    							lv_relativemoment_15_0,
            	    							"org.xtext.svjd.VideoMontage.RelativeMoment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_33); 

            			newLeafNode(otherlv_16, grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_11());
            		
            // InternalVideoMontage.g:1377:3: (otherlv_17= 'transition' ( (lv_transition_18_0= ruleTransition ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVideoMontage.g:1378:4: otherlv_17= 'transition' ( (lv_transition_18_0= ruleTransition ) )
                    {
                    otherlv_17=(Token)match(input,35,FOLLOW_34); 

                    				newLeafNode(otherlv_17, grammarAccess.getAudioClipAccess().getTransitionKeyword_12_0());
                    			
                    // InternalVideoMontage.g:1382:4: ( (lv_transition_18_0= ruleTransition ) )
                    // InternalVideoMontage.g:1383:5: (lv_transition_18_0= ruleTransition )
                    {
                    // InternalVideoMontage.g:1383:5: (lv_transition_18_0= ruleTransition )
                    // InternalVideoMontage.g:1384:6: lv_transition_18_0= ruleTransition
                    {

                    						newCompositeNode(grammarAccess.getAudioClipAccess().getTransitionTransitionParserRuleCall_12_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_transition_18_0=ruleTransition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioClipRule());
                    						}
                    						set(
                    							current,
                    							"transition",
                    							lv_transition_18_0,
                    							"org.xtext.svjd.VideoMontage.Transition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_19, grammarAccess.getAudioClipAccess().getStartingmomentKeyword_13());
            		
            // InternalVideoMontage.g:1406:3: ( (lv_startingmoment_20_0= ruleStartingMoment ) )
            // InternalVideoMontage.g:1407:4: (lv_startingmoment_20_0= ruleStartingMoment )
            {
            // InternalVideoMontage.g:1407:4: (lv_startingmoment_20_0= ruleStartingMoment )
            // InternalVideoMontage.g:1408:5: lv_startingmoment_20_0= ruleStartingMoment
            {

            					newCompositeNode(grammarAccess.getAudioClipAccess().getStartingmomentStartingMomentParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_40);
            lv_startingmoment_20_0=ruleStartingMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAudioClipRule());
            					}
            					set(
            						current,
            						"startingmoment",
            						lv_startingmoment_20_0,
            						"org.xtext.svjd.VideoMontage.StartingMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:1425:3: (otherlv_21= 'audio' otherlv_22= '{' ( (lv_audio_23_0= ruleAudio ) ) (otherlv_24= ',' ( (lv_audio_25_0= ruleAudio ) ) )* otherlv_26= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalVideoMontage.g:1426:4: otherlv_21= 'audio' otherlv_22= '{' ( (lv_audio_23_0= ruleAudio ) ) (otherlv_24= ',' ( (lv_audio_25_0= ruleAudio ) ) )* otherlv_26= '}'
                    {
                    otherlv_21=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_21, grammarAccess.getAudioClipAccess().getAudioKeyword_15_0());
                    			
                    otherlv_22=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_22, grammarAccess.getAudioClipAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalVideoMontage.g:1434:4: ( (lv_audio_23_0= ruleAudio ) )
                    // InternalVideoMontage.g:1435:5: (lv_audio_23_0= ruleAudio )
                    {
                    // InternalVideoMontage.g:1435:5: (lv_audio_23_0= ruleAudio )
                    // InternalVideoMontage.g:1436:6: lv_audio_23_0= ruleAudio
                    {

                    						newCompositeNode(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_audio_23_0=ruleAudio();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAudioClipRule());
                    						}
                    						add(
                    							current,
                    							"audio",
                    							lv_audio_23_0,
                    							"org.xtext.svjd.VideoMontage.Audio");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVideoMontage.g:1453:4: (otherlv_24= ',' ( (lv_audio_25_0= ruleAudio ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalVideoMontage.g:1454:5: otherlv_24= ',' ( (lv_audio_25_0= ruleAudio ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FOLLOW_41); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getAudioClipAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalVideoMontage.g:1458:5: ( (lv_audio_25_0= ruleAudio ) )
                    	    // InternalVideoMontage.g:1459:6: (lv_audio_25_0= ruleAudio )
                    	    {
                    	    // InternalVideoMontage.g:1459:6: (lv_audio_25_0= ruleAudio )
                    	    // InternalVideoMontage.g:1460:7: lv_audio_25_0= ruleAudio
                    	    {

                    	    							newCompositeNode(grammarAccess.getAudioClipAccess().getAudioAudioParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_audio_25_0=ruleAudio();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAudioClipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"audio",
                    	    								lv_audio_25_0,
                    	    								"org.xtext.svjd.VideoMontage.Audio");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_26, grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getAudioClipAccess().getRightCurlyBracketKeyword_16());
            		

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


    // $ANTLR start "entryRuleAbsoluteMoment"
    // InternalVideoMontage.g:1491:1: entryRuleAbsoluteMoment returns [EObject current=null] : iv_ruleAbsoluteMoment= ruleAbsoluteMoment EOF ;
    public final EObject entryRuleAbsoluteMoment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteMoment = null;


        try {
            // InternalVideoMontage.g:1491:55: (iv_ruleAbsoluteMoment= ruleAbsoluteMoment EOF )
            // InternalVideoMontage.g:1492:2: iv_ruleAbsoluteMoment= ruleAbsoluteMoment EOF
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
    // InternalVideoMontage.g:1498:1: ruleAbsoluteMoment returns [EObject current=null] : ( () otherlv_1= 'AbsoluteMoment' otherlv_2= '{' (otherlv_3= 'time' ( (lv_time_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAbsoluteMoment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_time_4_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1504:2: ( ( () otherlv_1= 'AbsoluteMoment' otherlv_2= '{' (otherlv_3= 'time' ( (lv_time_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalVideoMontage.g:1505:2: ( () otherlv_1= 'AbsoluteMoment' otherlv_2= '{' (otherlv_3= 'time' ( (lv_time_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalVideoMontage.g:1505:2: ( () otherlv_1= 'AbsoluteMoment' otherlv_2= '{' (otherlv_3= 'time' ( (lv_time_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalVideoMontage.g:1506:3: () otherlv_1= 'AbsoluteMoment' otherlv_2= '{' (otherlv_3= 'time' ( (lv_time_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalVideoMontage.g:1506:3: ()
            // InternalVideoMontage.g:1507:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAbsoluteMomentAccess().getAbsoluteMomentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getAbsoluteMomentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:1521:3: (otherlv_3= 'time' ( (lv_time_4_0= ruleEDouble ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalVideoMontage.g:1522:4: otherlv_3= 'time' ( (lv_time_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,43,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getAbsoluteMomentAccess().getTimeKeyword_3_0());
                    			
                    // InternalVideoMontage.g:1526:4: ( (lv_time_4_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1527:5: (lv_time_4_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1527:5: (lv_time_4_0= ruleEDouble )
                    // InternalVideoMontage.g:1528:6: lv_time_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getAbsoluteMomentAccess().getTimeEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_time_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAbsoluteMomentRule());
                    						}
                    						set(
                    							current,
                    							"time",
                    							lv_time_4_0,
                    							"org.xtext.svjd.VideoMontage.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAbsoluteMomentAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleTitle"
    // InternalVideoMontage.g:1554:1: entryRuleTitle returns [EObject current=null] : iv_ruleTitle= ruleTitle EOF ;
    public final EObject entryRuleTitle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitle = null;


        try {
            // InternalVideoMontage.g:1554:46: (iv_ruleTitle= ruleTitle EOF )
            // InternalVideoMontage.g:1555:2: iv_ruleTitle= ruleTitle EOF
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
    // InternalVideoMontage.g:1561:1: ruleTitle returns [EObject current=null] : (otherlv_0= 'Title' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )? otherlv_6= 'relativemoment' otherlv_7= '{' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) (otherlv_9= ',' ( (lv_relativemoment_10_0= ruleRelativeMoment ) ) )* otherlv_11= '}' otherlv_12= 'textarea' ( (lv_textarea_13_0= ruleTextArea ) ) otherlv_14= '}' ) ;
    public final EObject ruleTitle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_duration_3_0 = null;

        Enumerator lv_backgroundColor_5_0 = null;

        EObject lv_relativemoment_8_0 = null;

        EObject lv_relativemoment_10_0 = null;

        EObject lv_textarea_13_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1567:2: ( (otherlv_0= 'Title' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )? otherlv_6= 'relativemoment' otherlv_7= '{' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) (otherlv_9= ',' ( (lv_relativemoment_10_0= ruleRelativeMoment ) ) )* otherlv_11= '}' otherlv_12= 'textarea' ( (lv_textarea_13_0= ruleTextArea ) ) otherlv_14= '}' ) )
            // InternalVideoMontage.g:1568:2: (otherlv_0= 'Title' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )? otherlv_6= 'relativemoment' otherlv_7= '{' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) (otherlv_9= ',' ( (lv_relativemoment_10_0= ruleRelativeMoment ) ) )* otherlv_11= '}' otherlv_12= 'textarea' ( (lv_textarea_13_0= ruleTextArea ) ) otherlv_14= '}' )
            {
            // InternalVideoMontage.g:1568:2: (otherlv_0= 'Title' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )? otherlv_6= 'relativemoment' otherlv_7= '{' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) (otherlv_9= ',' ( (lv_relativemoment_10_0= ruleRelativeMoment ) ) )* otherlv_11= '}' otherlv_12= 'textarea' ( (lv_textarea_13_0= ruleTextArea ) ) otherlv_14= '}' )
            // InternalVideoMontage.g:1569:3: otherlv_0= 'Title' otherlv_1= '{' (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )? (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )? otherlv_6= 'relativemoment' otherlv_7= '{' ( (lv_relativemoment_8_0= ruleRelativeMoment ) ) (otherlv_9= ',' ( (lv_relativemoment_10_0= ruleRelativeMoment ) ) )* otherlv_11= '}' otherlv_12= 'textarea' ( (lv_textarea_13_0= ruleTextArea ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTitleAccess().getTitleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontage.g:1577:3: (otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalVideoMontage.g:1578:4: otherlv_2= 'duration' ( (lv_duration_3_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getTitleAccess().getDurationKeyword_2_0());
                    			
                    // InternalVideoMontage.g:1582:4: ( (lv_duration_3_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1583:5: (lv_duration_3_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1583:5: (lv_duration_3_0= ruleEDouble )
                    // InternalVideoMontage.g:1584:6: lv_duration_3_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTitleAccess().getDurationEDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            // InternalVideoMontage.g:1602:3: (otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==45) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalVideoMontage.g:1603:4: otherlv_4= 'backgroundColor' ( (lv_backgroundColor_5_0= ruleColor ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_45); 

                    				newLeafNode(otherlv_4, grammarAccess.getTitleAccess().getBackgroundColorKeyword_3_0());
                    			
                    // InternalVideoMontage.g:1607:4: ( (lv_backgroundColor_5_0= ruleColor ) )
                    // InternalVideoMontage.g:1608:5: (lv_backgroundColor_5_0= ruleColor )
                    {
                    // InternalVideoMontage.g:1608:5: (lv_backgroundColor_5_0= ruleColor )
                    // InternalVideoMontage.g:1609:6: lv_backgroundColor_5_0= ruleColor
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

            otherlv_6=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTitleAccess().getRelativemomentKeyword_4());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getTitleAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalVideoMontage.g:1635:3: ( (lv_relativemoment_8_0= ruleRelativeMoment ) )
            // InternalVideoMontage.g:1636:4: (lv_relativemoment_8_0= ruleRelativeMoment )
            {
            // InternalVideoMontage.g:1636:4: (lv_relativemoment_8_0= ruleRelativeMoment )
            // InternalVideoMontage.g:1637:5: lv_relativemoment_8_0= ruleRelativeMoment
            {

            					newCompositeNode(grammarAccess.getTitleAccess().getRelativemomentRelativeMomentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_relativemoment_8_0=ruleRelativeMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleRule());
            					}
            					add(
            						current,
            						"relativemoment",
            						lv_relativemoment_8_0,
            						"org.xtext.svjd.VideoMontage.RelativeMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:1654:3: (otherlv_9= ',' ( (lv_relativemoment_10_0= ruleRelativeMoment ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalVideoMontage.g:1655:4: otherlv_9= ',' ( (lv_relativemoment_10_0= ruleRelativeMoment ) )
            	    {
            	    otherlv_9=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_9, grammarAccess.getTitleAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalVideoMontage.g:1659:4: ( (lv_relativemoment_10_0= ruleRelativeMoment ) )
            	    // InternalVideoMontage.g:1660:5: (lv_relativemoment_10_0= ruleRelativeMoment )
            	    {
            	    // InternalVideoMontage.g:1660:5: (lv_relativemoment_10_0= ruleRelativeMoment )
            	    // InternalVideoMontage.g:1661:6: lv_relativemoment_10_0= ruleRelativeMoment
            	    {

            	    						newCompositeNode(grammarAccess.getTitleAccess().getRelativemomentRelativeMomentParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_relativemoment_10_0=ruleRelativeMoment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTitleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relativemoment",
            	    							lv_relativemoment_10_0,
            	    							"org.xtext.svjd.VideoMontage.RelativeMoment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_11=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_12=(Token)match(input,22,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getTitleAccess().getTextareaKeyword_9());
            		
            // InternalVideoMontage.g:1687:3: ( (lv_textarea_13_0= ruleTextArea ) )
            // InternalVideoMontage.g:1688:4: (lv_textarea_13_0= ruleTextArea )
            {
            // InternalVideoMontage.g:1688:4: (lv_textarea_13_0= ruleTextArea )
            // InternalVideoMontage.g:1689:5: lv_textarea_13_0= ruleTextArea
            {

            					newCompositeNode(grammarAccess.getTitleAccess().getTextareaTextAreaParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_13);
            lv_textarea_13_0=ruleTextArea();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTitleRule());
            					}
            					set(
            						current,
            						"textarea",
            						lv_textarea_13_0,
            						"org.xtext.svjd.VideoMontage.TextArea");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getTitleAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleClip"
    // InternalVideoMontage.g:1714:1: entryRuleClip returns [EObject current=null] : iv_ruleClip= ruleClip EOF ;
    public final EObject entryRuleClip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClip = null;


        try {
            // InternalVideoMontage.g:1714:45: (iv_ruleClip= ruleClip EOF )
            // InternalVideoMontage.g:1715:2: iv_ruleClip= ruleClip EOF
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
    // InternalVideoMontage.g:1721:1: ruleClip returns [EObject current=null] : (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'startCut' ( (lv_startCut_6_0= ruleEString ) ) )? (otherlv_7= 'endCut' ( (lv_endCut_8_0= ruleEString ) ) )? otherlv_9= 'relativemoment' otherlv_10= '{' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) (otherlv_12= ',' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) )* otherlv_14= '}' (otherlv_15= 'video' otherlv_16= '{' ( (lv_video_17_0= ruleVideo ) ) (otherlv_18= ',' ( (lv_video_19_0= ruleVideo ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleClip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        AntlrDatatypeRuleToken lv_startCut_6_0 = null;

        AntlrDatatypeRuleToken lv_endCut_8_0 = null;

        EObject lv_relativemoment_11_0 = null;

        EObject lv_relativemoment_13_0 = null;

        EObject lv_video_17_0 = null;

        EObject lv_video_19_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1727:2: ( (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'startCut' ( (lv_startCut_6_0= ruleEString ) ) )? (otherlv_7= 'endCut' ( (lv_endCut_8_0= ruleEString ) ) )? otherlv_9= 'relativemoment' otherlv_10= '{' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) (otherlv_12= ',' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) )* otherlv_14= '}' (otherlv_15= 'video' otherlv_16= '{' ( (lv_video_17_0= ruleVideo ) ) (otherlv_18= ',' ( (lv_video_19_0= ruleVideo ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalVideoMontage.g:1728:2: (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'startCut' ( (lv_startCut_6_0= ruleEString ) ) )? (otherlv_7= 'endCut' ( (lv_endCut_8_0= ruleEString ) ) )? otherlv_9= 'relativemoment' otherlv_10= '{' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) (otherlv_12= ',' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) )* otherlv_14= '}' (otherlv_15= 'video' otherlv_16= '{' ( (lv_video_17_0= ruleVideo ) ) (otherlv_18= ',' ( (lv_video_19_0= ruleVideo ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalVideoMontage.g:1728:2: (otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'startCut' ( (lv_startCut_6_0= ruleEString ) ) )? (otherlv_7= 'endCut' ( (lv_endCut_8_0= ruleEString ) ) )? otherlv_9= 'relativemoment' otherlv_10= '{' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) (otherlv_12= ',' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) )* otherlv_14= '}' (otherlv_15= 'video' otherlv_16= '{' ( (lv_video_17_0= ruleVideo ) ) (otherlv_18= ',' ( (lv_video_19_0= ruleVideo ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalVideoMontage.g:1729:3: otherlv_0= 'Clip' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'startCut' ( (lv_startCut_6_0= ruleEString ) ) )? (otherlv_7= 'endCut' ( (lv_endCut_8_0= ruleEString ) ) )? otherlv_9= 'relativemoment' otherlv_10= '{' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) (otherlv_12= ',' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) )* otherlv_14= '}' (otherlv_15= 'video' otherlv_16= '{' ( (lv_video_17_0= ruleVideo ) ) (otherlv_18= ',' ( (lv_video_19_0= ruleVideo ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getClipAccess().getClipKeyword_0());
            		
            // InternalVideoMontage.g:1733:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontage.g:1734:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontage.g:1734:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontage.g:1735:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClipAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:1756:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==20) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalVideoMontage.g:1757:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getClipAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontage.g:1761:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontage.g:1762:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:1762:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontage.g:1763:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getClipAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_duration_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClipRule());
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

            // InternalVideoMontage.g:1781:3: (otherlv_5= 'startCut' ( (lv_startCut_6_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalVideoMontage.g:1782:4: otherlv_5= 'startCut' ( (lv_startCut_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getClipAccess().getStartCutKeyword_4_0());
                    			
                    // InternalVideoMontage.g:1786:4: ( (lv_startCut_6_0= ruleEString ) )
                    // InternalVideoMontage.g:1787:5: (lv_startCut_6_0= ruleEString )
                    {
                    // InternalVideoMontage.g:1787:5: (lv_startCut_6_0= ruleEString )
                    // InternalVideoMontage.g:1788:6: lv_startCut_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClipAccess().getStartCutEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_startCut_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClipRule());
                    						}
                    						set(
                    							current,
                    							"startCut",
                    							lv_startCut_6_0,
                    							"org.xtext.svjd.VideoMontage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoMontage.g:1806:3: (otherlv_7= 'endCut' ( (lv_endCut_8_0= ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==40) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVideoMontage.g:1807:4: otherlv_7= 'endCut' ( (lv_endCut_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getClipAccess().getEndCutKeyword_5_0());
                    			
                    // InternalVideoMontage.g:1811:4: ( (lv_endCut_8_0= ruleEString ) )
                    // InternalVideoMontage.g:1812:5: (lv_endCut_8_0= ruleEString )
                    {
                    // InternalVideoMontage.g:1812:5: (lv_endCut_8_0= ruleEString )
                    // InternalVideoMontage.g:1813:6: lv_endCut_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getClipAccess().getEndCutEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_endCut_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClipRule());
                    						}
                    						set(
                    							current,
                    							"endCut",
                    							lv_endCut_8_0,
                    							"org.xtext.svjd.VideoMontage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getClipAccess().getRelativemomentKeyword_6());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_10, grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalVideoMontage.g:1839:3: ( (lv_relativemoment_11_0= ruleRelativeMoment ) )
            // InternalVideoMontage.g:1840:4: (lv_relativemoment_11_0= ruleRelativeMoment )
            {
            // InternalVideoMontage.g:1840:4: (lv_relativemoment_11_0= ruleRelativeMoment )
            // InternalVideoMontage.g:1841:5: lv_relativemoment_11_0= ruleRelativeMoment
            {

            					newCompositeNode(grammarAccess.getClipAccess().getRelativemomentRelativeMomentParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
            lv_relativemoment_11_0=ruleRelativeMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClipRule());
            					}
            					add(
            						current,
            						"relativemoment",
            						lv_relativemoment_11_0,
            						"org.xtext.svjd.VideoMontage.RelativeMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:1858:3: (otherlv_12= ',' ( (lv_relativemoment_13_0= ruleRelativeMoment ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==15) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalVideoMontage.g:1859:4: otherlv_12= ',' ( (lv_relativemoment_13_0= ruleRelativeMoment ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_12, grammarAccess.getClipAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalVideoMontage.g:1863:4: ( (lv_relativemoment_13_0= ruleRelativeMoment ) )
            	    // InternalVideoMontage.g:1864:5: (lv_relativemoment_13_0= ruleRelativeMoment )
            	    {
            	    // InternalVideoMontage.g:1864:5: (lv_relativemoment_13_0= ruleRelativeMoment )
            	    // InternalVideoMontage.g:1865:6: lv_relativemoment_13_0= ruleRelativeMoment
            	    {

            	    						newCompositeNode(grammarAccess.getClipAccess().getRelativemomentRelativeMomentParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_relativemoment_13_0=ruleRelativeMoment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getClipRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relativemoment",
            	    							lv_relativemoment_13_0,
            	    							"org.xtext.svjd.VideoMontage.RelativeMoment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FOLLOW_47); 

            			newLeafNode(otherlv_14, grammarAccess.getClipAccess().getRightCurlyBracketKeyword_10());
            		
            // InternalVideoMontage.g:1887:3: (otherlv_15= 'video' otherlv_16= '{' ( (lv_video_17_0= ruleVideo ) ) (otherlv_18= ',' ( (lv_video_19_0= ruleVideo ) ) )* otherlv_20= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==47) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVideoMontage.g:1888:4: otherlv_15= 'video' otherlv_16= '{' ( (lv_video_17_0= ruleVideo ) ) (otherlv_18= ',' ( (lv_video_19_0= ruleVideo ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getClipAccess().getVideoKeyword_11_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getClipAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalVideoMontage.g:1896:4: ( (lv_video_17_0= ruleVideo ) )
                    // InternalVideoMontage.g:1897:5: (lv_video_17_0= ruleVideo )
                    {
                    // InternalVideoMontage.g:1897:5: (lv_video_17_0= ruleVideo )
                    // InternalVideoMontage.g:1898:6: lv_video_17_0= ruleVideo
                    {

                    						newCompositeNode(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_video_17_0=ruleVideo();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClipRule());
                    						}
                    						add(
                    							current,
                    							"video",
                    							lv_video_17_0,
                    							"org.xtext.svjd.VideoMontage.Video");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVideoMontage.g:1915:4: (otherlv_18= ',' ( (lv_video_19_0= ruleVideo ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalVideoMontage.g:1916:5: otherlv_18= ',' ( (lv_video_19_0= ruleVideo ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getClipAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalVideoMontage.g:1920:5: ( (lv_video_19_0= ruleVideo ) )
                    	    // InternalVideoMontage.g:1921:6: (lv_video_19_0= ruleVideo )
                    	    {
                    	    // InternalVideoMontage.g:1921:6: (lv_video_19_0= ruleVideo )
                    	    // InternalVideoMontage.g:1922:7: lv_video_19_0= ruleVideo
                    	    {

                    	    							newCompositeNode(grammarAccess.getClipAccess().getVideoVideoParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_video_19_0=ruleVideo();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClipRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"video",
                    	    								lv_video_19_0,
                    	    								"org.xtext.svjd.VideoMontage.Video");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_20, grammarAccess.getClipAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getClipAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalVideoMontage.g:1953:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalVideoMontage.g:1953:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalVideoMontage.g:1954:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalVideoMontage.g:1960:1: ruleVideo returns [EObject current=null] : (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )? otherlv_7= 'relativemoment' otherlv_8= '{' ( (lv_relativemoment_9_0= ruleRelativeMoment ) ) (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )* otherlv_12= '}' otherlv_13= 'clip' ( (lv_clip_14_0= ruleClip ) ) otherlv_15= '}' ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_duration_4_0 = null;

        AntlrDatatypeRuleToken lv_path_6_0 = null;

        EObject lv_relativemoment_9_0 = null;

        EObject lv_relativemoment_11_0 = null;

        EObject lv_clip_14_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:1966:2: ( (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )? otherlv_7= 'relativemoment' otherlv_8= '{' ( (lv_relativemoment_9_0= ruleRelativeMoment ) ) (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )* otherlv_12= '}' otherlv_13= 'clip' ( (lv_clip_14_0= ruleClip ) ) otherlv_15= '}' ) )
            // InternalVideoMontage.g:1967:2: (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )? otherlv_7= 'relativemoment' otherlv_8= '{' ( (lv_relativemoment_9_0= ruleRelativeMoment ) ) (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )* otherlv_12= '}' otherlv_13= 'clip' ( (lv_clip_14_0= ruleClip ) ) otherlv_15= '}' )
            {
            // InternalVideoMontage.g:1967:2: (otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )? otherlv_7= 'relativemoment' otherlv_8= '{' ( (lv_relativemoment_9_0= ruleRelativeMoment ) ) (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )* otherlv_12= '}' otherlv_13= 'clip' ( (lv_clip_14_0= ruleClip ) ) otherlv_15= '}' )
            // InternalVideoMontage.g:1968:3: otherlv_0= 'Video' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )? otherlv_7= 'relativemoment' otherlv_8= '{' ( (lv_relativemoment_9_0= ruleRelativeMoment ) ) (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )* otherlv_12= '}' otherlv_13= 'clip' ( (lv_clip_14_0= ruleClip ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoAccess().getVideoKeyword_0());
            		
            // InternalVideoMontage.g:1972:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVideoMontage.g:1973:4: (lv_name_1_0= ruleEString )
            {
            // InternalVideoMontage.g:1973:4: (lv_name_1_0= ruleEString )
            // InternalVideoMontage.g:1974:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.svjd.VideoMontage.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:1995:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==20) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVideoMontage.g:1996:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getVideoAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontage.g:2000:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontage.g:2001:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:2001:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontage.g:2002:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_duration_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
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

            // InternalVideoMontage.g:2020:3: (otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalVideoMontage.g:2021:4: otherlv_5= 'path' ( (lv_path_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getVideoAccess().getPathKeyword_4_0());
                    			
                    // InternalVideoMontage.g:2025:4: ( (lv_path_6_0= ruleEString ) )
                    // InternalVideoMontage.g:2026:5: (lv_path_6_0= ruleEString )
                    {
                    // InternalVideoMontage.g:2026:5: (lv_path_6_0= ruleEString )
                    // InternalVideoMontage.g:2027:6: lv_path_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVideoAccess().getPathEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_path_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVideoRule());
                    						}
                    						set(
                    							current,
                    							"path",
                    							lv_path_6_0,
                    							"org.xtext.svjd.VideoMontage.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getVideoAccess().getRelativemomentKeyword_5());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_8, grammarAccess.getVideoAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalVideoMontage.g:2053:3: ( (lv_relativemoment_9_0= ruleRelativeMoment ) )
            // InternalVideoMontage.g:2054:4: (lv_relativemoment_9_0= ruleRelativeMoment )
            {
            // InternalVideoMontage.g:2054:4: (lv_relativemoment_9_0= ruleRelativeMoment )
            // InternalVideoMontage.g:2055:5: lv_relativemoment_9_0= ruleRelativeMoment
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getRelativemomentRelativeMomentParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_relativemoment_9_0=ruleRelativeMoment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					add(
            						current,
            						"relativemoment",
            						lv_relativemoment_9_0,
            						"org.xtext.svjd.VideoMontage.RelativeMoment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:2072:3: (otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==15) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalVideoMontage.g:2073:4: otherlv_10= ',' ( (lv_relativemoment_11_0= ruleRelativeMoment ) )
            	    {
            	    otherlv_10=(Token)match(input,15,FOLLOW_17); 

            	    				newLeafNode(otherlv_10, grammarAccess.getVideoAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalVideoMontage.g:2077:4: ( (lv_relativemoment_11_0= ruleRelativeMoment ) )
            	    // InternalVideoMontage.g:2078:5: (lv_relativemoment_11_0= ruleRelativeMoment )
            	    {
            	    // InternalVideoMontage.g:2078:5: (lv_relativemoment_11_0= ruleRelativeMoment )
            	    // InternalVideoMontage.g:2079:6: lv_relativemoment_11_0= ruleRelativeMoment
            	    {

            	    						newCompositeNode(grammarAccess.getVideoAccess().getRelativemomentRelativeMomentParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_relativemoment_11_0=ruleRelativeMoment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVideoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"relativemoment",
            	    							lv_relativemoment_11_0,
            	    							"org.xtext.svjd.VideoMontage.RelativeMoment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_12=(Token)match(input,16,FOLLOW_48); 

            			newLeafNode(otherlv_12, grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_13=(Token)match(input,49,FOLLOW_49); 

            			newLeafNode(otherlv_13, grammarAccess.getVideoAccess().getClipKeyword_10());
            		
            // InternalVideoMontage.g:2105:3: ( (lv_clip_14_0= ruleClip ) )
            // InternalVideoMontage.g:2106:4: (lv_clip_14_0= ruleClip )
            {
            // InternalVideoMontage.g:2106:4: (lv_clip_14_0= ruleClip )
            // InternalVideoMontage.g:2107:5: lv_clip_14_0= ruleClip
            {

            					newCompositeNode(grammarAccess.getVideoAccess().getClipClipParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_13);
            lv_clip_14_0=ruleClip();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVideoRule());
            					}
            					set(
            						current,
            						"clip",
            						lv_clip_14_0,
            						"org.xtext.svjd.VideoMontage.Clip");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getVideoAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleTextArea_Impl"
    // InternalVideoMontage.g:2132:1: entryRuleTextArea_Impl returns [EObject current=null] : iv_ruleTextArea_Impl= ruleTextArea_Impl EOF ;
    public final EObject entryRuleTextArea_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea_Impl = null;


        try {
            // InternalVideoMontage.g:2132:54: (iv_ruleTextArea_Impl= ruleTextArea_Impl EOF )
            // InternalVideoMontage.g:2133:2: iv_ruleTextArea_Impl= ruleTextArea_Impl EOF
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
    // InternalVideoMontage.g:2139:1: ruleTextArea_Impl returns [EObject current=null] : (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? otherlv_12= 'font' ( ( ruleEString ) ) (otherlv_14= 'animation' otherlv_15= '{' ( (lv_animation_16_0= ruleAnimation ) ) (otherlv_17= ',' ( (lv_animation_18_0= ruleAnimation ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;

        AntlrDatatypeRuleToken lv_width_7_0 = null;

        AntlrDatatypeRuleToken lv_height_9_0 = null;

        AntlrDatatypeRuleToken lv_text_11_0 = null;

        EObject lv_animation_16_0 = null;

        EObject lv_animation_18_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:2145:2: ( (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? otherlv_12= 'font' ( ( ruleEString ) ) (otherlv_14= 'animation' otherlv_15= '{' ( (lv_animation_16_0= ruleAnimation ) ) (otherlv_17= ',' ( (lv_animation_18_0= ruleAnimation ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalVideoMontage.g:2146:2: (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? otherlv_12= 'font' ( ( ruleEString ) ) (otherlv_14= 'animation' otherlv_15= '{' ( (lv_animation_16_0= ruleAnimation ) ) (otherlv_17= ',' ( (lv_animation_18_0= ruleAnimation ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalVideoMontage.g:2146:2: (otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? otherlv_12= 'font' ( ( ruleEString ) ) (otherlv_14= 'animation' otherlv_15= '{' ( (lv_animation_16_0= ruleAnimation ) ) (otherlv_17= ',' ( (lv_animation_18_0= ruleAnimation ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalVideoMontage.g:2147:3: otherlv_0= 'TextArea' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? otherlv_12= 'font' ( ( ruleEString ) ) (otherlv_14= 'animation' otherlv_15= '{' ( (lv_animation_16_0= ruleAnimation ) ) (otherlv_17= ',' ( (lv_animation_18_0= ruleAnimation ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextArea_ImplAccess().getTextAreaKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getTextArea_ImplAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontage.g:2155:3: (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalVideoMontage.g:2156:4: otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextArea_ImplAccess().getXKeyword_2_0());
                    			
                    // InternalVideoMontage.g:2160:4: ( (lv_x_3_0= ruleEInt ) )
                    // InternalVideoMontage.g:2161:5: (lv_x_3_0= ruleEInt )
                    {
                    // InternalVideoMontage.g:2161:5: (lv_x_3_0= ruleEInt )
                    // InternalVideoMontage.g:2162:6: lv_x_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getXEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            // InternalVideoMontage.g:2180:3: (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalVideoMontage.g:2181:4: otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextArea_ImplAccess().getYKeyword_3_0());
                    			
                    // InternalVideoMontage.g:2185:4: ( (lv_y_5_0= ruleEInt ) )
                    // InternalVideoMontage.g:2186:5: (lv_y_5_0= ruleEInt )
                    {
                    // InternalVideoMontage.g:2186:5: (lv_y_5_0= ruleEInt )
                    // InternalVideoMontage.g:2187:6: lv_y_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getYEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_52);
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

            // InternalVideoMontage.g:2205:3: (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==53) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalVideoMontage.g:2206:4: otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextArea_ImplAccess().getWidthKeyword_4_0());
                    			
                    // InternalVideoMontage.g:2210:4: ( (lv_width_7_0= ruleEDouble ) )
                    // InternalVideoMontage.g:2211:5: (lv_width_7_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:2211:5: (lv_width_7_0= ruleEDouble )
                    // InternalVideoMontage.g:2212:6: lv_width_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getWidthEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_53);
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

            // InternalVideoMontage.g:2230:3: (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==54) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalVideoMontage.g:2231:4: otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,54,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextArea_ImplAccess().getHeightKeyword_5_0());
                    			
                    // InternalVideoMontage.g:2235:4: ( (lv_height_9_0= ruleEDouble ) )
                    // InternalVideoMontage.g:2236:5: (lv_height_9_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:2236:5: (lv_height_9_0= ruleEDouble )
                    // InternalVideoMontage.g:2237:6: lv_height_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getHeightEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_54);
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

            // InternalVideoMontage.g:2255:3: (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==55) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalVideoMontage.g:2256:4: otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,55,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextArea_ImplAccess().getTextKeyword_6_0());
                    			
                    // InternalVideoMontage.g:2260:4: ( (lv_text_11_0= ruleEString ) )
                    // InternalVideoMontage.g:2261:5: (lv_text_11_0= ruleEString )
                    {
                    // InternalVideoMontage.g:2261:5: (lv_text_11_0= ruleEString )
                    // InternalVideoMontage.g:2262:6: lv_text_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getTextEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_55);
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
                    break;

            }

            otherlv_12=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_12, grammarAccess.getTextArea_ImplAccess().getFontKeyword_7());
            		
            // InternalVideoMontage.g:2284:3: ( ( ruleEString ) )
            // InternalVideoMontage.g:2285:4: ( ruleEString )
            {
            // InternalVideoMontage.g:2285:4: ( ruleEString )
            // InternalVideoMontage.g:2286:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextArea_ImplRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTextArea_ImplAccess().getFontFontCrossReference_8_0());
            				
            pushFollow(FOLLOW_56);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:2300:3: (otherlv_14= 'animation' otherlv_15= '{' ( (lv_animation_16_0= ruleAnimation ) ) (otherlv_17= ',' ( (lv_animation_18_0= ruleAnimation ) ) )* otherlv_19= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==57) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalVideoMontage.g:2301:4: otherlv_14= 'animation' otherlv_15= '{' ( (lv_animation_16_0= ruleAnimation ) ) (otherlv_17= ',' ( (lv_animation_18_0= ruleAnimation ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getTextArea_ImplAccess().getAnimationKeyword_9_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_15, grammarAccess.getTextArea_ImplAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalVideoMontage.g:2309:4: ( (lv_animation_16_0= ruleAnimation ) )
                    // InternalVideoMontage.g:2310:5: (lv_animation_16_0= ruleAnimation )
                    {
                    // InternalVideoMontage.g:2310:5: (lv_animation_16_0= ruleAnimation )
                    // InternalVideoMontage.g:2311:6: lv_animation_16_0= ruleAnimation
                    {

                    						newCompositeNode(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalVideoMontage.g:2328:4: (otherlv_17= ',' ( (lv_animation_18_0= ruleAnimation ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==15) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalVideoMontage.g:2329:5: otherlv_17= ',' ( (lv_animation_18_0= ruleAnimation ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_57); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getTextArea_ImplAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalVideoMontage.g:2333:5: ( (lv_animation_18_0= ruleAnimation ) )
                    	    // InternalVideoMontage.g:2334:6: (lv_animation_18_0= ruleAnimation )
                    	    {
                    	    // InternalVideoMontage.g:2334:6: (lv_animation_18_0= ruleAnimation )
                    	    // InternalVideoMontage.g:2335:7: lv_animation_18_0= ruleAnimation
                    	    {

                    	    							newCompositeNode(grammarAccess.getTextArea_ImplAccess().getAnimationAnimationParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_animation_18_0=ruleAnimation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTextArea_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"animation",
                    	    								lv_animation_18_0,
                    	    								"org.xtext.svjd.VideoMontage.Animation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_19, grammarAccess.getTextArea_ImplAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getTextArea_ImplAccess().getRightCurlyBracketKeyword_10());
            		

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


    // $ANTLR start "entryRuleEInt"
    // InternalVideoMontage.g:2366:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalVideoMontage.g:2366:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalVideoMontage.g:2367:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalVideoMontage.g:2373:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:2379:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalVideoMontage.g:2380:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalVideoMontage.g:2380:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalVideoMontage.g:2381:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalVideoMontage.g:2381:3: (kw= '-' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==24) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalVideoMontage.g:2382:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24); 

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


    // $ANTLR start "entryRuleTextAreaDynamic"
    // InternalVideoMontage.g:2399:1: entryRuleTextAreaDynamic returns [EObject current=null] : iv_ruleTextAreaDynamic= ruleTextAreaDynamic EOF ;
    public final EObject entryRuleTextAreaDynamic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAreaDynamic = null;


        try {
            // InternalVideoMontage.g:2399:56: (iv_ruleTextAreaDynamic= ruleTextAreaDynamic EOF )
            // InternalVideoMontage.g:2400:2: iv_ruleTextAreaDynamic= ruleTextAreaDynamic EOF
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
    // InternalVideoMontage.g:2406:1: ruleTextAreaDynamic returns [EObject current=null] : (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' otherlv_19= '{' ( (lv_animation_20_0= ruleAnimation ) ) (otherlv_21= ',' ( (lv_animation_22_0= ruleAnimation ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) ;
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
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;

        AntlrDatatypeRuleToken lv_width_7_0 = null;

        AntlrDatatypeRuleToken lv_height_9_0 = null;

        AntlrDatatypeRuleToken lv_text_11_0 = null;

        AntlrDatatypeRuleToken lv_textSrc_13_0 = null;

        AntlrDatatypeRuleToken lv_line_15_0 = null;

        EObject lv_animation_20_0 = null;

        EObject lv_animation_22_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:2412:2: ( (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' otherlv_19= '{' ( (lv_animation_20_0= ruleAnimation ) ) (otherlv_21= ',' ( (lv_animation_22_0= ruleAnimation ) ) )* otherlv_23= '}' )? otherlv_24= '}' ) )
            // InternalVideoMontage.g:2413:2: (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' otherlv_19= '{' ( (lv_animation_20_0= ruleAnimation ) ) (otherlv_21= ',' ( (lv_animation_22_0= ruleAnimation ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            {
            // InternalVideoMontage.g:2413:2: (otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' otherlv_19= '{' ( (lv_animation_20_0= ruleAnimation ) ) (otherlv_21= ',' ( (lv_animation_22_0= ruleAnimation ) ) )* otherlv_23= '}' )? otherlv_24= '}' )
            // InternalVideoMontage.g:2414:3: otherlv_0= 'TextAreaDynamic' otherlv_1= '{' (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )? (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )? (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )? (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )? (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )? (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )? (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )? otherlv_16= 'font' ( ( ruleEString ) ) (otherlv_18= 'animation' otherlv_19= '{' ( (lv_animation_20_0= ruleAnimation ) ) (otherlv_21= ',' ( (lv_animation_22_0= ruleAnimation ) ) )* otherlv_23= '}' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTextAreaDynamicAccess().getTextAreaDynamicKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAreaDynamicAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalVideoMontage.g:2422:3: (otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalVideoMontage.g:2423:4: otherlv_2= 'x' ( (lv_x_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getTextAreaDynamicAccess().getXKeyword_2_0());
                    			
                    // InternalVideoMontage.g:2427:4: ( (lv_x_3_0= ruleEInt ) )
                    // InternalVideoMontage.g:2428:5: (lv_x_3_0= ruleEInt )
                    {
                    // InternalVideoMontage.g:2428:5: (lv_x_3_0= ruleEInt )
                    // InternalVideoMontage.g:2429:6: lv_x_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getXEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_59);
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

            // InternalVideoMontage.g:2447:3: (otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalVideoMontage.g:2448:4: otherlv_4= 'y' ( (lv_y_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_26); 

                    				newLeafNode(otherlv_4, grammarAccess.getTextAreaDynamicAccess().getYKeyword_3_0());
                    			
                    // InternalVideoMontage.g:2452:4: ( (lv_y_5_0= ruleEInt ) )
                    // InternalVideoMontage.g:2453:5: (lv_y_5_0= ruleEInt )
                    {
                    // InternalVideoMontage.g:2453:5: (lv_y_5_0= ruleEInt )
                    // InternalVideoMontage.g:2454:6: lv_y_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getYEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_60);
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

            // InternalVideoMontage.g:2472:3: (otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==53) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalVideoMontage.g:2473:4: otherlv_6= 'width' ( (lv_width_7_0= ruleEDouble ) )
                    {
                    otherlv_6=(Token)match(input,53,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getTextAreaDynamicAccess().getWidthKeyword_4_0());
                    			
                    // InternalVideoMontage.g:2477:4: ( (lv_width_7_0= ruleEDouble ) )
                    // InternalVideoMontage.g:2478:5: (lv_width_7_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:2478:5: (lv_width_7_0= ruleEDouble )
                    // InternalVideoMontage.g:2479:6: lv_width_7_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getWidthEDoubleParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_61);
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

            // InternalVideoMontage.g:2497:3: (otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==54) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalVideoMontage.g:2498:4: otherlv_8= 'height' ( (lv_height_9_0= ruleEDouble ) )
                    {
                    otherlv_8=(Token)match(input,54,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getTextAreaDynamicAccess().getHeightKeyword_5_0());
                    			
                    // InternalVideoMontage.g:2502:4: ( (lv_height_9_0= ruleEDouble ) )
                    // InternalVideoMontage.g:2503:5: (lv_height_9_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:2503:5: (lv_height_9_0= ruleEDouble )
                    // InternalVideoMontage.g:2504:6: lv_height_9_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getHeightEDoubleParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_62);
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

            // InternalVideoMontage.g:2522:3: (otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==55) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalVideoMontage.g:2523:4: otherlv_10= 'text' ( (lv_text_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,55,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getTextAreaDynamicAccess().getTextKeyword_6_0());
                    			
                    // InternalVideoMontage.g:2527:4: ( (lv_text_11_0= ruleEString ) )
                    // InternalVideoMontage.g:2528:5: (lv_text_11_0= ruleEString )
                    {
                    // InternalVideoMontage.g:2528:5: (lv_text_11_0= ruleEString )
                    // InternalVideoMontage.g:2529:6: lv_text_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getTextEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_63);
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

            // InternalVideoMontage.g:2547:3: (otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==59) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalVideoMontage.g:2548:4: otherlv_12= 'textSrc' ( (lv_textSrc_13_0= ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,59,FOLLOW_5); 

                    				newLeafNode(otherlv_12, grammarAccess.getTextAreaDynamicAccess().getTextSrcKeyword_7_0());
                    			
                    // InternalVideoMontage.g:2552:4: ( (lv_textSrc_13_0= ruleEString ) )
                    // InternalVideoMontage.g:2553:5: (lv_textSrc_13_0= ruleEString )
                    {
                    // InternalVideoMontage.g:2553:5: (lv_textSrc_13_0= ruleEString )
                    // InternalVideoMontage.g:2554:6: lv_textSrc_13_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getTextSrcEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_64);
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

            // InternalVideoMontage.g:2572:3: (otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==60) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalVideoMontage.g:2573:4: otherlv_14= 'line' ( (lv_line_15_0= ruleEInt ) )
                    {
                    otherlv_14=(Token)match(input,60,FOLLOW_26); 

                    				newLeafNode(otherlv_14, grammarAccess.getTextAreaDynamicAccess().getLineKeyword_8_0());
                    			
                    // InternalVideoMontage.g:2577:4: ( (lv_line_15_0= ruleEInt ) )
                    // InternalVideoMontage.g:2578:5: (lv_line_15_0= ruleEInt )
                    {
                    // InternalVideoMontage.g:2578:5: (lv_line_15_0= ruleEInt )
                    // InternalVideoMontage.g:2579:6: lv_line_15_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getLineEIntParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_55);
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

            otherlv_16=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_16, grammarAccess.getTextAreaDynamicAccess().getFontKeyword_9());
            		
            // InternalVideoMontage.g:2601:3: ( ( ruleEString ) )
            // InternalVideoMontage.g:2602:4: ( ruleEString )
            {
            // InternalVideoMontage.g:2602:4: ( ruleEString )
            // InternalVideoMontage.g:2603:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextAreaDynamicRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getFontFontCrossReference_10_0());
            				
            pushFollow(FOLLOW_56);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoMontage.g:2617:3: (otherlv_18= 'animation' otherlv_19= '{' ( (lv_animation_20_0= ruleAnimation ) ) (otherlv_21= ',' ( (lv_animation_22_0= ruleAnimation ) ) )* otherlv_23= '}' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==57) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalVideoMontage.g:2618:4: otherlv_18= 'animation' otherlv_19= '{' ( (lv_animation_20_0= ruleAnimation ) ) (otherlv_21= ',' ( (lv_animation_22_0= ruleAnimation ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,57,FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getTextAreaDynamicAccess().getAnimationKeyword_11_0());
                    			
                    otherlv_19=(Token)match(input,12,FOLLOW_57); 

                    				newLeafNode(otherlv_19, grammarAccess.getTextAreaDynamicAccess().getLeftCurlyBracketKeyword_11_1());
                    			
                    // InternalVideoMontage.g:2626:4: ( (lv_animation_20_0= ruleAnimation ) )
                    // InternalVideoMontage.g:2627:5: (lv_animation_20_0= ruleAnimation )
                    {
                    // InternalVideoMontage.g:2627:5: (lv_animation_20_0= ruleAnimation )
                    // InternalVideoMontage.g:2628:6: lv_animation_20_0= ruleAnimation
                    {

                    						newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalVideoMontage.g:2645:4: (otherlv_21= ',' ( (lv_animation_22_0= ruleAnimation ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==15) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // InternalVideoMontage.g:2646:5: otherlv_21= ',' ( (lv_animation_22_0= ruleAnimation ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FOLLOW_57); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getTextAreaDynamicAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalVideoMontage.g:2650:5: ( (lv_animation_22_0= ruleAnimation ) )
                    	    // InternalVideoMontage.g:2651:6: (lv_animation_22_0= ruleAnimation )
                    	    {
                    	    // InternalVideoMontage.g:2651:6: (lv_animation_22_0= ruleAnimation )
                    	    // InternalVideoMontage.g:2652:7: lv_animation_22_0= ruleAnimation
                    	    {

                    	    							newCompositeNode(grammarAccess.getTextAreaDynamicAccess().getAnimationAnimationParserRuleCall_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_animation_22_0=ruleAnimation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTextAreaDynamicRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"animation",
                    	    								lv_animation_22_0,
                    	    								"org.xtext.svjd.VideoMontage.Animation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_23, grammarAccess.getTextAreaDynamicAccess().getRightCurlyBracketKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getTextAreaDynamicAccess().getRightCurlyBracketKeyword_12());
            		

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
    // InternalVideoMontage.g:2683:1: entryRuleFadeIn returns [EObject current=null] : iv_ruleFadeIn= ruleFadeIn EOF ;
    public final EObject entryRuleFadeIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeIn = null;


        try {
            // InternalVideoMontage.g:2683:47: (iv_ruleFadeIn= ruleFadeIn EOF )
            // InternalVideoMontage.g:2684:2: iv_ruleFadeIn= ruleFadeIn EOF
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
    // InternalVideoMontage.g:2690:1: ruleFadeIn returns [EObject current=null] : ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleFadeIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_duration_4_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:2696:2: ( ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalVideoMontage.g:2697:2: ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalVideoMontage.g:2697:2: ( () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalVideoMontage.g:2698:3: () otherlv_1= 'FadeIn' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalVideoMontage.g:2698:3: ()
            // InternalVideoMontage.g:2699:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFadeInAccess().getFadeInAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFadeInAccess().getFadeInKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeInAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:2713:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==20) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalVideoMontage.g:2714:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getFadeInAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontage.g:2718:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontage.g:2719:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:2719:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontage.g:2720:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getFadeInAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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
    // InternalVideoMontage.g:2746:1: entryRuleFadeOut returns [EObject current=null] : iv_ruleFadeOut= ruleFadeOut EOF ;
    public final EObject entryRuleFadeOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFadeOut = null;


        try {
            // InternalVideoMontage.g:2746:48: (iv_ruleFadeOut= ruleFadeOut EOF )
            // InternalVideoMontage.g:2747:2: iv_ruleFadeOut= ruleFadeOut EOF
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
    // InternalVideoMontage.g:2753:1: ruleFadeOut returns [EObject current=null] : ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleFadeOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_duration_4_0 = null;



        	enterRule();

        try {
            // InternalVideoMontage.g:2759:2: ( ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' ) )
            // InternalVideoMontage.g:2760:2: ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            {
            // InternalVideoMontage.g:2760:2: ( () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}' )
            // InternalVideoMontage.g:2761:3: () otherlv_1= 'FadeOut' otherlv_2= '{' (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )? otherlv_5= '}'
            {
            // InternalVideoMontage.g:2761:3: ()
            // InternalVideoMontage.g:2762:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFadeOutAccess().getFadeOutAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFadeOutAccess().getFadeOutKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getFadeOutAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVideoMontage.g:2776:3: (otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==20) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalVideoMontage.g:2777:4: otherlv_3= 'duration' ( (lv_duration_4_0= ruleEDouble ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getFadeOutAccess().getDurationKeyword_3_0());
                    			
                    // InternalVideoMontage.g:2781:4: ( (lv_duration_4_0= ruleEDouble ) )
                    // InternalVideoMontage.g:2782:5: (lv_duration_4_0= ruleEDouble )
                    {
                    // InternalVideoMontage.g:2782:5: (lv_duration_4_0= ruleEDouble )
                    // InternalVideoMontage.g:2783:6: lv_duration_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getFadeOutAccess().getDurationEDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
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

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "ruleMoment"
    // InternalVideoMontage.g:2809:1: ruleMoment returns [Enumerator current=null] : ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) ) ;
    public final Enumerator ruleMoment() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:2815:2: ( ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) ) )
            // InternalVideoMontage.g:2816:2: ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) )
            {
            // InternalVideoMontage.g:2816:2: ( (enumLiteral_0= 'starting' ) | (enumLiteral_1= 'ending' ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==63) ) {
                alt65=1;
            }
            else if ( (LA65_0==64) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalVideoMontage.g:2817:3: (enumLiteral_0= 'starting' )
                    {
                    // InternalVideoMontage.g:2817:3: (enumLiteral_0= 'starting' )
                    // InternalVideoMontage.g:2818:4: enumLiteral_0= 'starting'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMomentAccess().getStartingEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoMontage.g:2825:3: (enumLiteral_1= 'ending' )
                    {
                    // InternalVideoMontage.g:2825:3: (enumLiteral_1= 'ending' )
                    // InternalVideoMontage.g:2826:4: enumLiteral_1= 'ending'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalVideoMontage.g:2836:1: ruleColor returns [Enumerator current=null] : (enumLiteral_0= 'BLACK' ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalVideoMontage.g:2842:2: ( (enumLiteral_0= 'BLACK' ) )
            // InternalVideoMontage.g:2843:2: (enumLiteral_0= 'BLACK' )
            {
            // InternalVideoMontage.g:2843:2: (enumLiteral_0= 'BLACK' )
            // InternalVideoMontage.g:2844:3: enumLiteral_0= 'BLACK'
            {
            enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001500000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0404000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040110000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000060010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040010000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400300000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000001C000300000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000001C000200000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000018000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000200000300000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000018000300000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000010000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x01F8000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x01F0000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x01E0000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0200000000010000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x19F8000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x19F0000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x19E0000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x19C0000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x1980000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1900000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x1100000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000110000L});

}