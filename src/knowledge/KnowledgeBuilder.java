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
	public RETE getRETE()
	{
		RETE rete = new RETE();
		int i = 0;
		Tree object = parser_AST.getChild(1).getChild(0);
		while (object != null)
		{
			rete.insertType(object.toString());
			Tree temp = object.getChild(0);
			addAlpha(rete, temp);
			
			object = parser_AST.getChild(1).getChild(++i);
		}

		rete.print();
		return rete;
	}
	
	/**
	 * Recursive helper function to handle the addition of alpha nodes given a pattern to be matched
	 */
	private boolean addAlpha(RETE rete, Tree pattern)
	{
		String op = pattern.toString();
		boolean alpha = false;
		if (op.equals("&&"))
		{
			//TODO Fix this: what's up with alpha??
			if (addAlpha(rete, pattern.getChild(0)))
			{
				rete.push();
				alpha = true;
			}
			if (addAlpha(rete, pattern.getChild(1)))
			{
				rete.push();
				alpha = true;
			}
			if (!alpha)
				return false;
		}
		else if (op.equals("||"))
		{
			addAlpha(rete, pattern.getChild(0));
			addAlpha(rete, pattern.getChild(1));
			rete.push();
		}
		else if (op.equals("<") || op.equals("<=") || op.equals(">") || op.equals(">=") || op.equals("=="))
		{
			//If the attribute being used is not a member of this object, then it should be left to the Beta network
			//Since variables from other objects are referenced using $var (assuming they have been first bound
			//using $var : attribute), the check is simple
			if (pattern.getChild(0).toString().charAt(0) == '$' && !pattern.getChild(0).toString().contains(":"))
				return false;
			if (pattern.getChild(1).toString().charAt(0) == '$' && !pattern.getChild(1).toString().contains(":"))
				return false;
			rete.insertAlpha(op, new String[] {pattern.getChild(0).toString(), pattern.getChild(1).toString()});
		}
		return true;
	}
	
	private Tree parser_AST;
}
