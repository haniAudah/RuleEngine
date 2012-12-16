grammar RuleGrammar;

options {
	language = Java;
	output = AST;
	//backtrack = true;
}

@header {
	package parser;
	import java.util.HashMap;
}

@lexer::header {
	package parser;
}

@members {
	HashMap classTable = new HashMap();
	HashMap ruleTable = new HashMap();
	ArrayList classList = new ArrayList();
}

prog
	:	(rule | comment | decl | NEWLINE)+;

rule
	:	'rule' ruleName NEWLINE 'when' ruleWhen NEWLINE* 'then' ruleThen NEWLINE* 'end'
	 	{
	 		if (ruleTable.get($ruleName.text) != null)
	 		{
	 			System.err.println("Attempting to redefine rule " + $ruleName.text + " at line " + ($rule.start).getLine());
	 		}
	 		else
	 		{
	 			ruleTable.put($ruleName.text, "bla");
	 			//TODO Decide on how you want to store the rule
	 		}
	 		System.out.println("Rule Found!!");
 		};

comment
	:	'//' .* NEWLINE;

//Object declarations

decl
scope {
	HashMap newClass;
}
@init {
	$decl::newClass = new HashMap();
}
	:	'declare' declName NEWLINE d=declMember {$decl::newClass.put($d.attr, $d.type);} (NEWLINE d=declMember {$decl::newClass.put($d.attr, $d.type);})* NEWLINE* 'end'
	 	{
	 		if (classTable.get($declName.text) != null)
	 		{
	 			System.err.println("Attempting to redefine variable " + $declName.text + " at line " + ($decl.start).getLine());
 			}
 			else
 			{
 				classTable.put($declName.text, $decl::newClass);
 				System.out.println(classTable);
			}
	 	};

declName
	:	sub2;

declMember returns [String attr, String type]
	:	declAttribute ':' declAttributeType {$attr = $declAttribute.text; $type = $declAttributeType.text;};

ruleName
	:	(sub1 | (QUOTE sub1 QUOTE));

ruleWhen
	:	('not' | (identifier ':'))? ant_class '(' pattern ')' (NEWLINE | ';')
		(('and' | 'or' | 'not') ant_class '(' pattern ')' (NEWLINE | ';'))*;

ruleThen
	:	sub1 (NEWLINE sub1)*;

sub1
	:	(~(NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE))+;

sub2
	:	(~(NEWLINE | 'declare' | 'end'))+;

declAttribute
	:	(~(NEWLINE | 'end'));

declAttributeType
	:	'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double';

ant_class
	:	identifier;

//List all possible logical patterns that would need to be matched, in increasing order of precedence.

pattern
	:	expr_or ('||' expr_or)*;

expr_or
	:	expr_and ('&&' expr_and)*;

expr_and
	:	expr_eq_neq (('==' | '!=') expr_eq_neq)*;

expr_eq_neq
	:	expr_comp (('>=' | '<=' | '>' | '<') expr_comp)*;

//List all algebraic expressions that might need to be evaluated in the above patterns, in increasing order of precedence.

expr_comp
	:	expr_add_sub (('+' | '-') expr_add_sub)*;

expr_add_sub
	:	expr_mul_div (('*' | '/') expr_mul_div)*;

expr_mul_div
	:	('!')? expr_not;

expr_not
	:	('-' | '+')? expr_unary;

expr_unary
	:	(identifier ':')? identifier
	|	'(' pattern ')';

identifier
	:	ID (ID | INT)*;

INT
	:	'0'..'9'+ ;
NEWLINE
	:	'\r'? '\n';
ID
	:   ('a'..'z'|'A'..'Z')+;
WS
	:	(' ' | '\t')+ {skip();} ;
QUOTE
	:	'"';