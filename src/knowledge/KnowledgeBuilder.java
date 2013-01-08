package knowledge;

import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import parser.RuleGrammarLexer;
import parser.RuleGrammarParser;

import engine.RETE;

public class KnowledgeBuilder
{
	public KnowledgeBuilder()
	{

	}

	/**
	 * @param file the DRL or spreadsheet file from which rules are to be read
	 */	
	public void add(String file)
	{
		try
		{
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
			RuleGrammarLexer lexer = new RuleGrammarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			RuleGrammarParser parser = new RuleGrammarParser(tokens);

			RuleGrammarParser.prog_return result = parser.prog();
			Tree parser_AST = (Tree)result.getTree();
			System.out.println(parser_AST.toStringTree());

			RETE rete = new RETE();

			// TODO These should be invisible to KnowledgeBuilder
			rete.constructRETE(parser_AST);
			// rete.constructBeta();
			rete.print();
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
}
