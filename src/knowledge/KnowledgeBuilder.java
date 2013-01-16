package knowledge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

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
			File f = new File(file);
			directory = f.getParent();
			ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
			RuleGrammarLexer lexer = new RuleGrammarLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			RuleGrammarParser parser = new RuleGrammarParser(tokens);

			RuleGrammarParser.prog_return result = parser.prog();
			Tree parser_AST = (Tree)result.getTree();
			System.out.println(parser_AST.toStringTree());

			classTable = RuleGrammarParser.classTable;
			constructClasses("RuleClasses.txt");

			RETE rete = new RETE();

			rete.constructRETE(parser_AST);
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

	/**
	 * Private function to add the types to the java file that will later be compiled into a RETE
	 * on-the-fly.
	 */
	private void constructClasses(String fileName) throws IOException
	{
		FileWriter abstractFile = new FileWriter(directory + "\\abstract_" + fileName, false);
		FileWriter file = new FileWriter(directory + "\\" + fileName, false);

		abstractFile.write("abstract class DataObject {\r\n");
		for (String className : classTable.keySet())
		{
			HashMap<String, String> myClass = classTable.get(className);
			file.write("class " + className + " extends DataObject {\r\n");

			for (String attribute : myClass.keySet())
			{
				String attributeType = myClass.get(attribute);
				file.write(attributeType + " " + attribute + ";\r\n");
			}
			file.write("public boolean is" + className + "() {\r\n");
			file.write("return true;\r\n}\r\n");

			abstractFile.write("public boolean is" + className + "() {\r\n");
			abstractFile.write("return false;\r\n}\r\n");
			file.write("} \r\n");
		}
		abstractFile.write("}\r\n");
		file.close();
		abstractFile.close();
	}

	private HashMap<String, HashMap<String, String>> classTable;
	private String directory;
	private int separator;
}
