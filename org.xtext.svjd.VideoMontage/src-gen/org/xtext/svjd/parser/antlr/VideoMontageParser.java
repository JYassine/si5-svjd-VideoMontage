/*
 * generated by Xtext 2.21.0
 */
package org.xtext.svjd.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.svjd.parser.antlr.internal.InternalVideoMontageParser;
import org.xtext.svjd.services.VideoMontageGrammarAccess;

public class VideoMontageParser extends AbstractAntlrParser {

	@Inject
	private VideoMontageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalVideoMontageParser createParser(XtextTokenStream stream) {
		return new InternalVideoMontageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Movie";
	}

	public VideoMontageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VideoMontageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
