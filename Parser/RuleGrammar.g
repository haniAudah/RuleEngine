grammar RuleGrammar;

options {
	language = Java;
	output = AST;
	//backtrack = true;
}

tokens {
	RULENAME;
	RULEWHEN;
	OBJECT;
}

@header {
	package parser;
	import java.util.HashMap;
}

@lexer::header {
	package parser;
}

@members {
	HashMap<String, HashMap<String, String>> classTable = new HashMap<String, HashMap<String, String>>();
	HashMap<String, String> ruleTable = new HashMap<String, String>();
	//ArrayList classList = new ArrayList();
}

prog
	:	(rule | comment | decl ! | NEWLINE !)+;
/*
TODO: Explain language syntax briefly.
*/
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
 		} -> ^('rule' ruleName ruleWhen 'then');

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
	 			System.err.println("Attempting to redefine class " + $declName.text + " at line " + ($decl.start).getLine());
 			}
 			else
 			{
 				classTable.put($declName.text, $decl::newClass);
 				System.out.println(classTable);
			}
	 	}; //The AST doesn't include declarations, everything that needs to be done is done while reading 'declare' statements.

declName
	:	sub2;

declMember returns [String attr, String type]
	:	declAttribute ':' declAttributeType {$attr = $declAttribute.text; $type = $declAttributeType.text;};

ruleName
	:	(sub1 | (QUOTE sub1 QUOTE)) -> ^(RULENAME sub1);

ruleWhen
scope {
	String declName;
}
	//The first ruleWhen cannot be preceded by an (and, or)
	:	NEWLINE* ruleWhen1 ruleWhenK* -> ^(RULEWHEN ruleWhen1 ruleWhenK*);

ruleWhen1
	//TODO: Fix identifier binding
	:	('not' | (identifier ':'))? ant_class {$ruleWhen::declName = $ant_class.text;} '(' pattern ')' (NEWLINE | ';') -> ^(ant_class pattern);

ruleWhenK
	//TODO: Allow idenitifer binding
	:	(('and' | 'or' | 'not')? ant_class {$ruleWhen::declName = $ant_class.text;} '(' pattern ')' (NEWLINE | ';')) -> ^(ant_class pattern);

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
scope {
	boolean has;
}
@init {
	$pattern::has = false;
}
	:	expr_or ('||' expr_or {$pattern::has = true;})*
	->	{$pattern::has}? ^('||' expr_or+)
	->	expr_or;

expr_or
scope {
	boolean has;
}
@init {
	$expr_or::has = false;
}
	:	expr_and ('&&' expr_and {$expr_or::has = true;})*
	->	{$expr_or::has}? ^('&&' expr_and+)
	->	expr_and;

expr_and
scope {
	boolean hasEq;
}
@init {
	$expr_and::hasEq = false;
}
	:	expr_eq_neq (EQUALITY expr_eq_neq {$expr_and::hasEq = true;})*
	->	{$expr_and::hasEq}? ^(EQUALITY expr_eq_neq+)
	->	expr_eq_neq;

expr_eq_neq
scope {
	boolean has;
}
@init {
	$expr_eq_neq::has = false;
}
	:	expr_comp (INEQUALITY expr_comp {$expr_eq_neq::has = true;})*
	->	{$expr_eq_neq::has}? ^(INEQUALITY expr_comp+)
	->	expr_comp;

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
	:	((m1=memberIdentifier ':')? m2=memberIdentifier
	{
	 	if (((HashMap)classTable.get($ruleWhen::declName)).get($m2.text) == null)
	 		System.err.println("The variable " + $m2.text + " is not a member of " + $ruleWhen::declName + " and was not previously bound.");
	}
	| INT | '(' pattern ')');

identifier
	:	ID (ID | INT)*;

memberIdentifier
//TODO: Do you need this?
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
EQUALITY
	:	('==' | '!=');
INEQUALITY
	:	('>=' | '<=' | '>' | '<');