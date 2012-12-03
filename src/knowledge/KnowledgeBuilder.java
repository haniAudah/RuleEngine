package knowledge;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.runtime.*;

import parser.RuleGrammarLexer;
import parser.RuleGrammarParser;

public class KnowledgeBuilder {
	
	public KnowledgeBuilder() {
		
	}
	
	/**
	 * @param file
	 */	
	public void add(String file) {
		try
		{
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
			RuleGrammarLexer lexer = new RuleGrammarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			RuleGrammarParser parser = new RuleGrammarParser(tokens);
			
			parser.prog();
		}
		catch (IOException e)
		{
			System.out.println("Error: The file " + file + " does not exist or could not be read.");
		}
		catch (RecognitionException e)
		{
			System.out.println(e.toString());
		}
	}
}
