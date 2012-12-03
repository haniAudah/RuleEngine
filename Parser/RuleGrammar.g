grammar RuleGrammar;

options {
	language = Java;
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
	HashMap memory = new HashMap();
}

prog
	:	(rule | comment | NEWLINE)+;

rule
	:	'rule' ruleName NEWLINE 'when' ruleWhen NEWLINE* 'then' ruleThen NEWLINE* 'end' {System.out.println("ANTLR completed successfully!!");};

comment
	:	'//' .* NEWLINE;

//Object declarations

decl
	:	'declare' declName NEWLINE declMember (NEWLINE declMember)* NEWLINE* 'end';

declName
	:	sub2;

declMember
	:	declAttribute ':' declAttributeType;

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
	:	'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char';

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