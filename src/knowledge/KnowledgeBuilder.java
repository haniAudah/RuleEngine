package knowledge;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import parser.RuleGrammarLexer;
import parser.RuleGrammarParser;

import engine.RETE;

public class KnowledgeBuilder {
	public KnowledgeBuilder() {
		
	}
	
	/**
	 * @param file the DRL or spreadsheet file from which rules are to be read
	 */	
	public void add(String file) {
		try
		{
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
			RuleGrammarLexer lexer = new RuleGrammarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			RuleGrammarParser parser = new RuleGrammarParser(tokens);
			
			RuleGrammarParser.prog_return result = parser.prog();
			parser_AST = (Tree)result.getTree();
			System.out.println(parser_AST.toStringTree());
			getRETE();
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
	
	/**
	 * Checks if any errors occurred while reading the DRL files or knowledge spreadsheets.
	 */
	public boolean hasErrors()
	{
		return false;
	}
	
	/**
	 * Constructs the RETE network given the knowledge input so far.
	 */
	public RETE getRETE() {
		RETE rete = new RETE();
		int i = 0;
		Tree object = parser_AST.getChild(1).getChild(i);
		while (object != null)
		{
			rete.insertType(object.toString());
			object = parser_AST.getChild(1).getChild(i);
			i++;
		}

		return rete;
	}
	
	private Tree parser_AST;
}
