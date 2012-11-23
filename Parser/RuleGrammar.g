grammar RuleGrammar;

options {
	language = Java;
	//backtrack = true;
}

@header {
	import java.util.HashMap;
}

@members {
	HashMap memory = new HashMap();
}

prog: (rule | comment | NEWLINE)+;
	
rule:	'rule' ruleName 'when' ruleWhen (NEWLINE)* 'then' ruleThen (NEWLINE)* 'end';

comment
	:	'//' .* NEWLINE;
	
//decl:	'declare' declName NEWLINE (declMember)* 'end';

declName
	:	sub2;
	
declMember
	:	sub2 (NEWLINE sub2)*;

ruleName
	:	sub1;
	catch[Throwable e] { }

ruleWhen
	:	sub1 (NEWLINE sub1)*;
	catch[Throwable e] { }
	
ruleThen
	:	sub1 (NEWLINE sub1)*;
	catch[Throwable e] { }
	
sub1:	(~(NEWLINE | 'rule' | 'when' | 'then' | 'end'))+;
	
sub2:	(~(NEWLINE | 'declare' | 'end'))+;
	
INT :	'0'..'9'+ ;
NEWLINE:'\r'? '\n';
ID  :   ('a'..'z'|'A'..'Z')+ ;
WS  :	(' ' | '\t')+ {skip();} ;

