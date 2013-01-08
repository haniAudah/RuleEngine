
grammar RuleGrammar;

options {
    language = Java;
    output = AST;
    backtrack = true;
}

tokens {
    RULENAME;
    RULEWHEN;
    BREAK;
}

@header {
    package parser;
    import java.util.HashMap;
    import java.util.LinkedList;
    import java.util.Collections;
}

@lexer::header {
    package parser;
}

@members {
    public static HashMap<String, HashMap<String, String>> classTable = new HashMap<String, HashMap<String, String>>();
    HashMap<String, String> ruleTable = new HashMap<String, String>();
}

prog
    :    (rule | decl ! | NEWLINE !)+;
/*
TODO: Explain language syntax briefly.
*/
rule
scope {
    LinkedList<String> bindings;
}
@init {
    $rule::bindings = new LinkedList<String>();
}
    :    'rule' ruleName NEWLINE 'when' ruleWhen NEWLINE* 'then' ruleThen NEWLINE* 'end'
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

//Object declarations

decl
scope {
    HashMap newClass;
}
@init {
    $decl::newClass = new HashMap();
}
    :    'declare' declName NEWLINE d=declMember {$decl::newClass.put($d.attr, $d.type);} (NEWLINE d=declMember {$decl::newClass.put($d.attr, $d.type);})* NEWLINE* 'end'
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
    :    sub2;

declMember returns [String attr, String type]
    :    declAttribute ':' declAttributeType {$attr = $declAttribute.text; $type = $declAttributeType.text;};

ruleName
    :    (sub1 | (QUOTE sub1 QUOTE)) -> ^(RULENAME sub1);

ruleWhen
scope {
    String declName;
    
    //Each ruleWhen keeps its own list of bindings made in this LHS object, because we cannot bind a
    //variable and use it in the same condition (that would be silly)
    LinkedList<String> bindings;
}
    //The first ruleWhen cannot be preceded by an (and, or)
    :    NEWLINE* ruleWhen1 ruleWhenK* -> ^(RULEWHEN ruleWhen1 ruleWhenK*);

ruleWhen1
@init {
    $ruleWhen::bindings = new LinkedList<String>();
}
    //TODO: Allow identifier binding
    //The check for ant_class being defined is left to the program, since it might have been defined in another file.
    :    ('not')? ant_class {$ruleWhen::declName = $ant_class.text;} '(' pattern ')' (NEWLINE | ';') -> ^(ant_class pattern);

ruleWhenK
@init {
    $ruleWhen::bindings = new LinkedList<String>();
}
    //TODO: Allow idenitifer binding
    :    (('and' | 'or' | 'not')? ant_class {$ruleWhen::declName = $ant_class.text;} '(' pattern ')' (NEWLINE | ';')) -> ^(ant_class pattern);

ruleThen
    :    sub1 (NEWLINE sub1)*;

sub1
    :    (~(NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE))+;

sub2
    :    (~(NEWLINE | 'declare' | 'end'))+;

declAttribute
    :    (~(NEWLINE | 'end'));

declAttributeType
    :    'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double';

ant_class
    :    identifier;

//List all possible logical patterns that would need to be matched, in increasing order of precedence.

pattern
scope {
    //For the rest of this grammar, a boolean "has" indicates whether a certain operand was indeed found
    //while going down the proper order. This is needed for tree construction. For example, a*b would
    //need to construct an AST ^(* a b) while if no * was found, we would skip ahead to the next operand
    //rather than constructing ^(a) first. This obviously makes the tree smaller and easier to parse.
    boolean has;
    
    //Number of expr_commas that could NOT be handled in alpha (since it's sorted, emitting this from the
    //grammar means we won't have to recheck for bindings in the programas, as we would know which nodes
    //should be left to beta) TODO FIX
    int numOfUses;
    
    //usesBind is only used with expr_commas. It represents whether an expression (in a comma-separated
    //list of expressions) makes use of some previously bound variable. This is needed to re-order all
    //the expr_comma's so that those that don't use bindings from other objs are placed first, and those that
    //do some inter-object comparisons are placed after. See the RETE algorithm for an explanation.
    LinkedList<Boolean> usesBind;
    
    //N.B usesBind should actually be placed in an expr_comma's scope, since it is associated with each
    //expr_comma, but as these rules are returning AST trees, a list of usesBinds was defined in pattern's
    //scope instead, and each expr_comma will add it's own usesBind onto the list.
}
@init {
    $pattern::has = false;
    $pattern::usesBind = new LinkedList<Boolean>();
    $pattern::numOfUses = 0;
}
    :   lizy1+=expr_comma (',' lizy2+=expr_comma {$pattern::has = true;})*
        {
            //I needed to emit two different lists (one with the uses and the other without)
            //so I did the following: 
            //1) use two variables lizy1 and lizy2 in the rule for no reason
            //2) move everything to lizy2 (there will only be a single elem in lizy1)
            //3) move back only the non-users
            //4) seperate them with an imaginary break node to simplify later reading
            //You won't find any other way to do this without knowledge of how antlr is
            //implementing and using these lists behind the scenes.
            if ($pattern::has)
            {
	            $lizy2.add(0, $lizy1.get(0));
	            $lizy1.remove(0);
	            
	            //transfer
	            for (int i = 0; i < $lizy2.size(); i++)
	            {
	                if (!$pattern::usesBind.get(i))
	                    $lizy1.add($lizy2.get(i));
	            }
	            int removed = 0;
	            //remove transferred
	            for (int i = 0; i < $lizy2.size() + removed; i++)
	            {
	                if (!$pattern::usesBind.get(i))
	                {
	                    $lizy2.remove(i - removed);
	                    removed++;
	                }
	            }
	            System.out.println("non-users = " + $lizy1.size());
	            System.out.println("users = " + $lizy2.size());
	        }
        }
    ->  {$pattern::has && $lizy2.size() > 0}? ^(',' $lizy1+ BREAK $lizy2+)
    ->  {$pattern::has}? ^(',' $lizy1+ BREAK)
    ->  {$lizy1.size() == 0}? BREAK $lizy2+
    ->  $lizy1+ BREAK;

expr_comma
@init {
    $pattern::usesBind.add(false);
}
    :    expr_and;
    
expr_and
    :   expr_or ('&&' ^ expr_or)*;

expr_or
    :    expr_bool_atom ('||' ^ expr_bool_atom)*
    ;
    
expr_bool_atom
    :   expr_ineq (INEQUALITY ^ expr_ineq)*
    |   '(' ! expr_and ')' !
    ;
    
expr_ineq
    :   expr_add_sub (EQUALITY ^ expr_add_sub)*
    ;
    
expr_add_sub
    :   expr_mul_div ( ('+' ^ | '-' ^) expr_mul_div)*
    ;
    
expr_mul_div
    :   expr_unary ( ('*' ^ | '/' ^) expr_unary)*
    ;
    
expr_unary
scope {
    boolean binding;
    boolean bound;
}
@init {
    $expr_unary::binding = false;
    $expr_unary::bound = false;
}
    :   ('$' {$expr_unary::bound = true; $pattern::usesBind.removeLast(); $pattern::usesBind.add(true);} | '$' m1=identifier ':' 
        {
            $expr_unary::binding = true;
            if ($rule::bindings.contains($m1.text))
                System.err.println($m1.text + " was already bound to another variable.");
            else
            {
                $rule::bindings.add($m1.text);
                $ruleWhen::bindings.add($m1.text);
            }
        })?
        m2=identifier
        {
            if ($expr_unary::bound && !$expr_unary::binding)
            {
                if (!$rule::bindings.contains($m2.text))
                    System.err.println("The variable " + $m2.text + " was not previously bound.");
                else if ($ruleWhen::bindings.contains($m2.text))
                    //using a variable bound in the same object condition is not allowed
                    System.err.println("The variable " + $m2.text + " was bound in the same LHS object.");
            }
            else if (((HashMap)classTable.get($ruleWhen::declName)).get($m2.text) == null)
                System.err.println("The variable " + $m2.text + " is not a member of " + $ruleWhen::declName);
        }
    |   '(' ! expr_add_sub ')' !
    |   INT
    ;

identifier
    :    ID (ID | INT)*;


LINE_COMMENT
    :    '//' (~('\r' | '\n'))* NEWLINE {skip();} ;
INT
    :    '0'..'9'+ ;
NEWLINE
    :    '\r'? '\n' ;
ID
    :    ('a'..'z'|'A'..'Z')+ ;
WS
    :    (' ' | '\t')+ {skip();} ;
QUOTE
    :    '"';
EQUALITY
    :    ('==' | '!=');
INEQUALITY
    :    ('>=' | '<=' | '>' | '<') ;