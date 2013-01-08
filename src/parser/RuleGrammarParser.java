// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g 2013-01-08 14:17:16

    package parser;
    import java.util.HashMap;
    import java.util.LinkedList;
    import java.util.Collections;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RuleGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULENAME", "RULEWHEN", "BREAK", "NEWLINE", "QUOTE", "EQUALITY", "INEQUALITY", "INT", "ID", "LINE_COMMENT", "WS", "'rule'", "'when'", "'then'", "'end'", "'declare'", "':'", "'not'", "'('", "')'", "';'", "'and'", "'or'", "'String'", "'Integer'", "'int'", "'long'", "'Decimal'", "'Char'", "'double'", "','", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'!'", "'$'"
    };
    public static final int EOF=-1;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int RULENAME=4;
    public static final int RULEWHEN=5;
    public static final int BREAK=6;
    public static final int NEWLINE=7;
    public static final int QUOTE=8;
    public static final int EQUALITY=9;
    public static final int INEQUALITY=10;
    public static final int INT=11;
    public static final int ID=12;
    public static final int LINE_COMMENT=13;
    public static final int WS=14;

    // delegates
    // delegators


        public RuleGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public RuleGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return RuleGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g"; }


        public static HashMap<String, HashMap<String, String>> classTable = new HashMap<String, HashMap<String, String>>();
        HashMap<String, String> ruleTable = new HashMap<String, String>();


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:32:1: prog : ( rule | decl | NEWLINE )+ ;
    public final RuleGrammarParser.prog_return prog() throws RecognitionException {
        RuleGrammarParser.prog_return retval = new RuleGrammarParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE3=null;
        RuleGrammarParser.rule_return rule1 = null;

        RuleGrammarParser.decl_return decl2 = null;


        Object NEWLINE3_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:5: ( ( rule | decl | NEWLINE )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:10: ( rule | decl | NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:10: ( rule | decl | NEWLINE )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 15:
                    {
                    alt1=1;
                    }
                    break;
                case 19:
                    {
                    alt1=2;
                    }
                    break;
                case NEWLINE:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:11: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_prog98);
            	    rule1=rule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rule1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:18: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_prog102);
            	    decl2=decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:27: NEWLINE
            	    {
            	    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_prog108); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "prog"

    protected static class rule_scope {
        LinkedList<String> bindings;
    }
    protected Stack rule_stack = new Stack();

    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:37:1: rule : 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' -> ^( 'rule' ruleName ruleWhen 'then' ) ;
    public final RuleGrammarParser.rule_return rule() throws RecognitionException {
        rule_stack.push(new rule_scope());
        RuleGrammarParser.rule_return retval = new RuleGrammarParser.rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal4=null;
        Token NEWLINE6=null;
        Token string_literal7=null;
        Token NEWLINE9=null;
        Token string_literal10=null;
        Token NEWLINE12=null;
        Token string_literal13=null;
        RuleGrammarParser.ruleName_return ruleName5 = null;

        RuleGrammarParser.ruleWhen_return ruleWhen8 = null;

        RuleGrammarParser.ruleThen_return ruleThen11 = null;


        Object string_literal4_tree=null;
        Object NEWLINE6_tree=null;
        Object string_literal7_tree=null;
        Object NEWLINE9_tree=null;
        Object string_literal10_tree=null;
        Object NEWLINE12_tree=null;
        Object string_literal13_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_ruleName=new RewriteRuleSubtreeStream(adaptor,"rule ruleName");
        RewriteRuleSubtreeStream stream_ruleThen=new RewriteRuleSubtreeStream(adaptor,"rule ruleThen");
        RewriteRuleSubtreeStream stream_ruleWhen=new RewriteRuleSubtreeStream(adaptor,"rule ruleWhen");

            ((rule_scope)rule_stack.peek()).bindings = new LinkedList<String>();

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:44:5: ( 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' -> ^( 'rule' ruleName ruleWhen 'then' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:44:10: 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end'
            {
            string_literal4=(Token)match(input,15,FOLLOW_15_in_rule137);  
            stream_15.add(string_literal4);

            pushFollow(FOLLOW_ruleName_in_rule139);
            ruleName5=ruleName();

            state._fsp--;

            stream_ruleName.add(ruleName5.getTree());
            NEWLINE6=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule141);  
            stream_NEWLINE.add(NEWLINE6);

            string_literal7=(Token)match(input,16,FOLLOW_16_in_rule143);  
            stream_16.add(string_literal7);

            pushFollow(FOLLOW_ruleWhen_in_rule145);
            ruleWhen8=ruleWhen();

            state._fsp--;

            stream_ruleWhen.add(ruleWhen8.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:44:50: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:44:50: NEWLINE
            	    {
            	    NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule147);  
            	    stream_NEWLINE.add(NEWLINE9);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            string_literal10=(Token)match(input,17,FOLLOW_17_in_rule150);  
            stream_17.add(string_literal10);

            pushFollow(FOLLOW_ruleThen_in_rule152);
            ruleThen11=ruleThen();

            state._fsp--;

            stream_ruleThen.add(ruleThen11.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:44:75: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:44:75: NEWLINE
            	    {
            	    NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule154);  
            	    stream_NEWLINE.add(NEWLINE12);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            string_literal13=(Token)match(input,18,FOLLOW_18_in_rule157);  
            stream_18.add(string_literal13);


                         if (ruleTable.get((ruleName5!=null?input.toString(ruleName5.start,ruleName5.stop):null)) != null)
                         {
                             System.err.println("Attempting to redefine rule " + (ruleName5!=null?input.toString(ruleName5.start,ruleName5.stop):null) + " at line " + (((Token)retval.start)).getLine());
                         }
                         else
                         {
                             ruleTable.put((ruleName5!=null?input.toString(ruleName5.start,ruleName5.stop):null), "bla");
                             //TODO Decide on how you want to store the rule
                         }
                     


            // AST REWRITE
            // elements: ruleName, 17, 15, ruleWhen
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:12: -> ^( 'rule' ruleName ruleWhen 'then' )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:55:15: ^( 'rule' ruleName ruleWhen 'then' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_15.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ruleName.nextTree());
                adaptor.addChild(root_1, stream_ruleWhen.nextTree());
                adaptor.addChild(root_1, stream_17.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            rule_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "rule"

    protected static class decl_scope {
        HashMap newClass;
    }
    protected Stack decl_stack = new Stack();

    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:59:1: decl : 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end' ;
    public final RuleGrammarParser.decl_return decl() throws RecognitionException {
        decl_stack.push(new decl_scope());
        RuleGrammarParser.decl_return retval = new RuleGrammarParser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal14=null;
        Token NEWLINE16=null;
        Token NEWLINE17=null;
        Token NEWLINE18=null;
        Token string_literal19=null;
        RuleGrammarParser.declMember_return d = null;

        RuleGrammarParser.declName_return declName15 = null;


        Object string_literal14_tree=null;
        Object NEWLINE16_tree=null;
        Object NEWLINE17_tree=null;
        Object NEWLINE18_tree=null;
        Object string_literal19_tree=null;


            ((decl_scope)decl_stack.peek()).newClass = new HashMap();

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:66:5: ( 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:66:10: 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal14=(Token)match(input,19,FOLLOW_19_in_decl206); 
            string_literal14_tree = (Object)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);

            pushFollow(FOLLOW_declName_in_decl208);
            declName15=declName();

            state._fsp--;

            adaptor.addChild(root_0, declName15.getTree());
            NEWLINE16=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl210); 
            NEWLINE16_tree = (Object)adaptor.create(NEWLINE16);
            adaptor.addChild(root_0, NEWLINE16_tree);

            pushFollow(FOLLOW_declMember_in_decl214);
            d=declMember();

            state._fsp--;

            adaptor.addChild(root_0, d.getTree());
            ((decl_scope)decl_stack.peek()).newClass.put((d!=null?d.attr:null), (d!=null?d.type:null));
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:66:91: ( NEWLINE d= declMember )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    int LA4_1 = input.LA(2);

                    if ( ((LA4_1>=RULENAME && LA4_1<=BREAK)||(LA4_1>=QUOTE && LA4_1<=17)||(LA4_1>=19 && LA4_1<=42)) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:66:92: NEWLINE d= declMember
            	    {
            	    NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl219); 
            	    NEWLINE17_tree = (Object)adaptor.create(NEWLINE17);
            	    adaptor.addChild(root_0, NEWLINE17_tree);

            	    pushFollow(FOLLOW_declMember_in_decl223);
            	    d=declMember();

            	    state._fsp--;

            	    adaptor.addChild(root_0, d.getTree());
            	    ((decl_scope)decl_stack.peek()).newClass.put((d!=null?d.attr:null), (d!=null?d.type:null));

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:66:156: ( NEWLINE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:66:156: NEWLINE
            	    {
            	    NEWLINE18=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl229); 
            	    NEWLINE18_tree = (Object)adaptor.create(NEWLINE18);
            	    adaptor.addChild(root_0, NEWLINE18_tree);


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            string_literal19=(Token)match(input,18,FOLLOW_18_in_decl232); 
            string_literal19_tree = (Object)adaptor.create(string_literal19);
            adaptor.addChild(root_0, string_literal19_tree);


                         if (classTable.get((declName15!=null?input.toString(declName15.start,declName15.stop):null)) != null)
                         {
                             System.err.println("Attempting to redefine class " + (declName15!=null?input.toString(declName15.start,declName15.stop):null) + " at line " + (((Token)retval.start)).getLine());
                         }
                         else
                         {
                             classTable.put((declName15!=null?input.toString(declName15.start,declName15.stop):null), ((decl_scope)decl_stack.peek()).newClass);
                             System.out.println(classTable);
                        }
                     

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            decl_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "decl"

    public static class declName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declName"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:79:1: declName : sub2 ;
    public final RuleGrammarParser.declName_return declName() throws RecognitionException {
        RuleGrammarParser.declName_return retval = new RuleGrammarParser.declName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.sub2_return sub220 = null;



        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:5: ( sub2 )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:10: sub2
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sub2_in_declName259);
            sub220=sub2();

            state._fsp--;

            adaptor.addChild(root_0, sub220.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declName"

    public static class declMember_return extends ParserRuleReturnScope {
        public String attr;
        public String type;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declMember"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:82:1: declMember returns [String attr, String type] : declAttribute ':' declAttributeType ;
    public final RuleGrammarParser.declMember_return declMember() throws RecognitionException {
        RuleGrammarParser.declMember_return retval = new RuleGrammarParser.declMember_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal22=null;
        RuleGrammarParser.declAttribute_return declAttribute21 = null;

        RuleGrammarParser.declAttributeType_return declAttributeType23 = null;


        Object char_literal22_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:83:5: ( declAttribute ':' declAttributeType )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:83:10: declAttribute ':' declAttributeType
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declAttribute_in_declMember278);
            declAttribute21=declAttribute();

            state._fsp--;

            adaptor.addChild(root_0, declAttribute21.getTree());
            char_literal22=(Token)match(input,20,FOLLOW_20_in_declMember280); 
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);

            pushFollow(FOLLOW_declAttributeType_in_declMember282);
            declAttributeType23=declAttributeType();

            state._fsp--;

            adaptor.addChild(root_0, declAttributeType23.getTree());
            retval.attr = (declAttribute21!=null?input.toString(declAttribute21.start,declAttribute21.stop):null); retval.type = (declAttributeType23!=null?input.toString(declAttributeType23.start,declAttributeType23.stop):null);

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declMember"

    public static class ruleName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleName"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:85:1: ruleName : ( sub1 | ( QUOTE sub1 QUOTE ) ) -> ^( RULENAME sub1 ) ;
    public final RuleGrammarParser.ruleName_return ruleName() throws RecognitionException {
        RuleGrammarParser.ruleName_return retval = new RuleGrammarParser.ruleName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUOTE25=null;
        Token QUOTE27=null;
        RuleGrammarParser.sub1_return sub124 = null;

        RuleGrammarParser.sub1_return sub126 = null;


        Object QUOTE25_tree=null;
        Object QUOTE27_tree=null;
        RewriteRuleTokenStream stream_QUOTE=new RewriteRuleTokenStream(adaptor,"token QUOTE");
        RewriteRuleSubtreeStream stream_sub1=new RewriteRuleSubtreeStream(adaptor,"rule sub1");
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:5: ( ( sub1 | ( QUOTE sub1 QUOTE ) ) -> ^( RULENAME sub1 ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:10: ( sub1 | ( QUOTE sub1 QUOTE ) )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:10: ( sub1 | ( QUOTE sub1 QUOTE ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULENAME && LA6_0<=BREAK)||(LA6_0>=EQUALITY && LA6_0<=WS)||(LA6_0>=19 && LA6_0<=42)) ) {
                alt6=1;
            }
            else if ( (LA6_0==QUOTE) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:11: sub1
                    {
                    pushFollow(FOLLOW_sub1_in_ruleName300);
                    sub124=sub1();

                    state._fsp--;

                    stream_sub1.add(sub124.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:18: ( QUOTE sub1 QUOTE )
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:18: ( QUOTE sub1 QUOTE )
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:19: QUOTE sub1 QUOTE
                    {
                    QUOTE25=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName305);  
                    stream_QUOTE.add(QUOTE25);

                    pushFollow(FOLLOW_sub1_in_ruleName307);
                    sub126=sub1();

                    state._fsp--;

                    stream_sub1.add(sub126.getTree());
                    QUOTE27=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName309);  
                    stream_QUOTE.add(QUOTE27);


                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: sub1
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 86:38: -> ^( RULENAME sub1 )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:41: ^( RULENAME sub1 )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RULENAME, "RULENAME"), root_1);

                adaptor.addChild(root_1, stream_sub1.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleName"

    protected static class ruleWhen_scope {
        String declName;
        //Each ruleWhen keeps its own list of bindings made in this LHS object, because we cannot bind a
            //variable and use it in the same condition (that would be silly)
            LinkedList<String> bindings;
    }
    protected Stack ruleWhen_stack = new Stack();

    public static class ruleWhen_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleWhen"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:88:1: ruleWhen : ( NEWLINE )* ruleWhen1 ( ruleWhenK )* -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* ) ;
    public final RuleGrammarParser.ruleWhen_return ruleWhen() throws RecognitionException {
        ruleWhen_stack.push(new ruleWhen_scope());
        RuleGrammarParser.ruleWhen_return retval = new RuleGrammarParser.ruleWhen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE28=null;
        RuleGrammarParser.ruleWhen1_return ruleWhen129 = null;

        RuleGrammarParser.ruleWhenK_return ruleWhenK30 = null;


        Object NEWLINE28_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_ruleWhenK=new RewriteRuleSubtreeStream(adaptor,"rule ruleWhenK");
        RewriteRuleSubtreeStream stream_ruleWhen1=new RewriteRuleSubtreeStream(adaptor,"rule ruleWhen1");
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:97:5: ( ( NEWLINE )* ruleWhen1 ( ruleWhenK )* -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:97:10: ( NEWLINE )* ruleWhen1 ( ruleWhenK )*
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:97:10: ( NEWLINE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NEWLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:97:10: NEWLINE
            	    {
            	    NEWLINE28=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhen343);  
            	    stream_NEWLINE.add(NEWLINE28);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_ruleWhen1_in_ruleWhen346);
            ruleWhen129=ruleWhen1();

            state._fsp--;

            stream_ruleWhen1.add(ruleWhen129.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:97:29: ( ruleWhenK )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID||LA8_0==21||(LA8_0>=25 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:97:29: ruleWhenK
            	    {
            	    pushFollow(FOLLOW_ruleWhenK_in_ruleWhen348);
            	    ruleWhenK30=ruleWhenK();

            	    state._fsp--;

            	    stream_ruleWhenK.add(ruleWhenK30.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: ruleWhen1, ruleWhenK
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 97:40: -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:97:43: ^( RULEWHEN ruleWhen1 ( ruleWhenK )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RULEWHEN, "RULEWHEN"), root_1);

                adaptor.addChild(root_1, stream_ruleWhen1.nextTree());
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:97:64: ( ruleWhenK )*
                while ( stream_ruleWhenK.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleWhenK.nextTree());

                }
                stream_ruleWhenK.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            ruleWhen_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "ruleWhen"

    public static class ruleWhen1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleWhen1"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:99:1: ruleWhen1 : ( 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) -> ^( ant_class pattern ) ;
    public final RuleGrammarParser.ruleWhen1_return ruleWhen1() throws RecognitionException {
        RuleGrammarParser.ruleWhen1_return retval = new RuleGrammarParser.ruleWhen1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal31=null;
        Token char_literal33=null;
        Token char_literal35=null;
        Token NEWLINE36=null;
        Token char_literal37=null;
        RuleGrammarParser.ant_class_return ant_class32 = null;

        RuleGrammarParser.pattern_return pattern34 = null;


        Object string_literal31_tree=null;
        Object char_literal33_tree=null;
        Object char_literal35_tree=null;
        Object NEWLINE36_tree=null;
        Object char_literal37_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_ant_class=new RewriteRuleSubtreeStream(adaptor,"rule ant_class");

            ((ruleWhen_scope)ruleWhen_stack.peek()).bindings = new LinkedList<String>();

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:5: ( ( 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) -> ^( ant_class pattern ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:10: ( 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:10: ( 'not' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:11: 'not'
                    {
                    string_literal31=(Token)match(input,21,FOLLOW_21_in_ruleWhen1391);  
                    stream_21.add(string_literal31);


                    }
                    break;

            }

            pushFollow(FOLLOW_ant_class_in_ruleWhen1395);
            ant_class32=ant_class();

            state._fsp--;

            stream_ant_class.add(ant_class32.getTree());
            ((ruleWhen_scope)ruleWhen_stack.peek()).declName = (ant_class32!=null?input.toString(ant_class32.start,ant_class32.stop):null);
            char_literal33=(Token)match(input,22,FOLLOW_22_in_ruleWhen1399);  
            stream_22.add(char_literal33);

            pushFollow(FOLLOW_pattern_in_ruleWhen1401);
            pattern34=pattern();

            state._fsp--;

            stream_pattern.add(pattern34.getTree());
            char_literal35=(Token)match(input,23,FOLLOW_23_in_ruleWhen1403);  
            stream_23.add(char_literal35);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:86: ( NEWLINE | ';' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NEWLINE) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:87: NEWLINE
                    {
                    NEWLINE36=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhen1406);  
                    stream_NEWLINE.add(NEWLINE36);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:97: ';'
                    {
                    char_literal37=(Token)match(input,24,FOLLOW_24_in_ruleWhen1410);  
                    stream_24.add(char_literal37);


                    }
                    break;

            }



            // AST REWRITE
            // elements: ant_class, pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 105:102: -> ^( ant_class pattern )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:105: ^( ant_class pattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ant_class.nextNode(), root_1);

                adaptor.addChild(root_1, stream_pattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleWhen1"

    public static class ruleWhenK_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleWhenK"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:107:1: ruleWhenK : ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ) -> ^( ant_class pattern ) ;
    public final RuleGrammarParser.ruleWhenK_return ruleWhenK() throws RecognitionException {
        RuleGrammarParser.ruleWhenK_return retval = new RuleGrammarParser.ruleWhenK_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal38=null;
        Token string_literal39=null;
        Token string_literal40=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Token NEWLINE45=null;
        Token char_literal46=null;
        RuleGrammarParser.ant_class_return ant_class41 = null;

        RuleGrammarParser.pattern_return pattern43 = null;


        Object string_literal38_tree=null;
        Object string_literal39_tree=null;
        Object string_literal40_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        Object NEWLINE45_tree=null;
        Object char_literal46_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_ant_class=new RewriteRuleSubtreeStream(adaptor,"rule ant_class");

            ((ruleWhen_scope)ruleWhen_stack.peek()).bindings = new LinkedList<String>();

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:5: ( ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ) -> ^( ant_class pattern ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:10: ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:10: ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:11: ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:11: ( 'and' | 'or' | 'not' )?
            int alt11=4;
            switch ( input.LA(1) ) {
                case 25:
                    {
                    alt11=1;
                    }
                    break;
                case 26:
                    {
                    alt11=2;
                    }
                    break;
                case 21:
                    {
                    alt11=3;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:12: 'and'
                    {
                    string_literal38=(Token)match(input,25,FOLLOW_25_in_ruleWhenK446);  
                    stream_25.add(string_literal38);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:20: 'or'
                    {
                    string_literal39=(Token)match(input,26,FOLLOW_26_in_ruleWhenK450);  
                    stream_26.add(string_literal39);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:27: 'not'
                    {
                    string_literal40=(Token)match(input,21,FOLLOW_21_in_ruleWhenK454);  
                    stream_21.add(string_literal40);


                    }
                    break;

            }

            pushFollow(FOLLOW_ant_class_in_ruleWhenK458);
            ant_class41=ant_class();

            state._fsp--;

            stream_ant_class.add(ant_class41.getTree());
            ((ruleWhen_scope)ruleWhen_stack.peek()).declName = (ant_class41!=null?input.toString(ant_class41.start,ant_class41.stop):null);
            char_literal42=(Token)match(input,22,FOLLOW_22_in_ruleWhenK462);  
            stream_22.add(char_literal42);

            pushFollow(FOLLOW_pattern_in_ruleWhenK464);
            pattern43=pattern();

            state._fsp--;

            stream_pattern.add(pattern43.getTree());
            char_literal44=(Token)match(input,23,FOLLOW_23_in_ruleWhenK466);  
            stream_23.add(char_literal44);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:102: ( NEWLINE | ';' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NEWLINE) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:103: NEWLINE
                    {
                    NEWLINE45=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhenK469);  
                    stream_NEWLINE.add(NEWLINE45);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:113: ';'
                    {
                    char_literal46=(Token)match(input,24,FOLLOW_24_in_ruleWhenK473);  
                    stream_24.add(char_literal46);


                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: pattern, ant_class
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:119: -> ^( ant_class pattern )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:122: ^( ant_class pattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ant_class.nextNode(), root_1);

                adaptor.addChild(root_1, stream_pattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleWhenK"

    public static class ruleThen_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleThen"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:114:1: ruleThen : sub1 ( NEWLINE sub1 )* ;
    public final RuleGrammarParser.ruleThen_return ruleThen() throws RecognitionException {
        RuleGrammarParser.ruleThen_return retval = new RuleGrammarParser.ruleThen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE48=null;
        RuleGrammarParser.sub1_return sub147 = null;

        RuleGrammarParser.sub1_return sub149 = null;


        Object NEWLINE48_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:115:5: ( sub1 ( NEWLINE sub1 )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:115:10: sub1 ( NEWLINE sub1 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sub1_in_ruleThen498);
            sub147=sub1();

            state._fsp--;

            adaptor.addChild(root_0, sub147.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:115:15: ( NEWLINE sub1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==NEWLINE) ) {
                    int LA13_1 = input.LA(2);

                    if ( ((LA13_1>=RULENAME && LA13_1<=BREAK)||(LA13_1>=EQUALITY && LA13_1<=WS)||(LA13_1>=19 && LA13_1<=42)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:115:16: NEWLINE sub1
            	    {
            	    NEWLINE48=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleThen501); 
            	    NEWLINE48_tree = (Object)adaptor.create(NEWLINE48);
            	    adaptor.addChild(root_0, NEWLINE48_tree);

            	    pushFollow(FOLLOW_sub1_in_ruleThen503);
            	    sub149=sub1();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sub149.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleThen"

    public static class sub1_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sub1"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:117:1: sub1 : (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ ;
    public final RuleGrammarParser.sub1_return sub1() throws RecognitionException {
        RuleGrammarParser.sub1_return retval = new RuleGrammarParser.sub1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set50=null;

        Object set50_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:118:5: ( (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:118:10: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:118:10: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULENAME && LA14_0<=BREAK)||(LA14_0>=EQUALITY && LA14_0<=WS)||(LA14_0>=19 && LA14_0<=42)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:118:11: ~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE )
            	    {
            	    set50=(Token)input.LT(1);
            	    if ( (input.LA(1)>=RULENAME && input.LA(1)<=BREAK)||(input.LA(1)>=EQUALITY && input.LA(1)<=WS)||(input.LA(1)>=19 && input.LA(1)<=42) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set50));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sub1"

    public static class sub2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sub2"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:120:1: sub2 : (~ ( NEWLINE | 'declare' | 'end' ) )+ ;
    public final RuleGrammarParser.sub2_return sub2() throws RecognitionException {
        RuleGrammarParser.sub2_return retval = new RuleGrammarParser.sub2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set51=null;

        Object set51_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:121:5: ( (~ ( NEWLINE | 'declare' | 'end' ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:121:10: (~ ( NEWLINE | 'declare' | 'end' ) )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:121:10: (~ ( NEWLINE | 'declare' | 'end' ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULENAME && LA15_0<=BREAK)||(LA15_0>=QUOTE && LA15_0<=17)||(LA15_0>=20 && LA15_0<=42)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:121:11: ~ ( NEWLINE | 'declare' | 'end' )
            	    {
            	    set51=(Token)input.LT(1);
            	    if ( (input.LA(1)>=RULENAME && input.LA(1)<=BREAK)||(input.LA(1)>=QUOTE && input.LA(1)<=17)||(input.LA(1)>=20 && input.LA(1)<=42) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set51));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sub2"

    public static class declAttribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttribute"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:123:1: declAttribute : (~ ( NEWLINE | 'end' ) ) ;
    public final RuleGrammarParser.declAttribute_return declAttribute() throws RecognitionException {
        RuleGrammarParser.declAttribute_return retval = new RuleGrammarParser.declAttribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set52=null;

        Object set52_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:5: ( (~ ( NEWLINE | 'end' ) ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:10: (~ ( NEWLINE | 'end' ) )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:10: (~ ( NEWLINE | 'end' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:11: ~ ( NEWLINE | 'end' )
            {
            set52=(Token)input.LT(1);
            if ( (input.LA(1)>=RULENAME && input.LA(1)<=BREAK)||(input.LA(1)>=QUOTE && input.LA(1)<=17)||(input.LA(1)>=19 && input.LA(1)<=42) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set52));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declAttribute"

    public static class declAttributeType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declAttributeType"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:126:1: declAttributeType : ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double' );
    public final RuleGrammarParser.declAttributeType_return declAttributeType() throws RecognitionException {
        RuleGrammarParser.declAttributeType_return retval = new RuleGrammarParser.declAttributeType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set53=null;

        Object set53_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:127:5: ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            {
            root_0 = (Object)adaptor.nil();

            set53=(Token)input.LT(1);
            if ( (input.LA(1)>=27 && input.LA(1)<=33) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set53));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "declAttributeType"

    public static class ant_class_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ant_class"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:129:1: ant_class : identifier ;
    public final RuleGrammarParser.ant_class_return ant_class() throws RecognitionException {
        RuleGrammarParser.ant_class_return retval = new RuleGrammarParser.ant_class_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.identifier_return identifier54 = null;



        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:130:5: ( identifier )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:130:10: identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_ant_class653);
            identifier54=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier54.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ant_class"

    protected static class pattern_scope {
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
    }
    protected Stack pattern_stack = new Stack();

    public static class pattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:134:1: pattern : lizy1+= expr_comma ( ',' lizy2+= expr_comma )* -> {$pattern::has && $lizy2.size() > 0}? ^( ',' ( $lizy1)+ BREAK ( $lizy2)+ ) -> {$pattern::has}? ^( ',' ( $lizy1)+ BREAK ) -> {$lizy1.size() == 0}? BREAK ( $lizy2)+ -> ( $lizy1)+ BREAK ;
    public final RuleGrammarParser.pattern_return pattern() throws RecognitionException {
        pattern_stack.push(new pattern_scope());
        RuleGrammarParser.pattern_return retval = new RuleGrammarParser.pattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        List list_lizy1=null;
        List list_lizy2=null;
        RuleReturnScope lizy1 = null;
        RuleReturnScope lizy2 = null;
        Object char_literal55_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_expr_comma=new RewriteRuleSubtreeStream(adaptor,"rule expr_comma");

            ((pattern_scope)pattern_stack.peek()).has = false;
            ((pattern_scope)pattern_stack.peek()).usesBind = new LinkedList<Boolean>();
            ((pattern_scope)pattern_stack.peek()).numOfUses = 0;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:162:5: (lizy1+= expr_comma ( ',' lizy2+= expr_comma )* -> {$pattern::has && $lizy2.size() > 0}? ^( ',' ( $lizy1)+ BREAK ( $lizy2)+ ) -> {$pattern::has}? ^( ',' ( $lizy1)+ BREAK ) -> {$lizy1.size() == 0}? BREAK ( $lizy2)+ -> ( $lizy1)+ BREAK )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:162:9: lizy1+= expr_comma ( ',' lizy2+= expr_comma )*
            {
            pushFollow(FOLLOW_expr_comma_in_pattern680);
            lizy1=expr_comma();

            state._fsp--;

            stream_expr_comma.add(lizy1.getTree());
            if (list_lizy1==null) list_lizy1=new ArrayList();
            list_lizy1.add(lizy1.getTree());

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:162:27: ( ',' lizy2+= expr_comma )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==34) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:162:28: ',' lizy2+= expr_comma
            	    {
            	    char_literal55=(Token)match(input,34,FOLLOW_34_in_pattern683);  
            	    stream_34.add(char_literal55);

            	    pushFollow(FOLLOW_expr_comma_in_pattern687);
            	    lizy2=expr_comma();

            	    state._fsp--;

            	    stream_expr_comma.add(lizy2.getTree());
            	    if (list_lizy2==null) list_lizy2=new ArrayList();
            	    list_lizy2.add(lizy2.getTree());

            	    ((pattern_scope)pattern_stack.peek()).has = true;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


                        //I needed to emit two different lists (one with the uses and the other without)
                        //so I did the following: 
                        //1) use two variables lizy1 and lizy2 in the rule for no reason
                        //2) move everything to lizy2 (there will only be a single elem in lizy1)
                        //3) move back only the non-users
                        //4) seperate them with an imaginary break node to simplify later reading
                        //You won't find any other way to do this without knowledge of how antlr is
                        //implementing and using these lists behind the scenes.
                        if (((pattern_scope)pattern_stack.peek()).has)
                        {
            	            list_lizy2.add(0, list_lizy1.get(0));
            	            list_lizy1.remove(0);
            	            
            	            //transfer
            	            for (int i = 0; i < list_lizy2.size(); i++)
            	            {
            	                if (!((pattern_scope)pattern_stack.peek()).usesBind.get(i))
            	                    list_lizy1.add(list_lizy2.get(i));
            	            }
            	            int removed = 0;
            	            //remove transferred
            	            for (int i = 0; i < list_lizy2.size() + removed; i++)
            	            {
            	                if (!((pattern_scope)pattern_stack.peek()).usesBind.get(i))
            	                {
            	                    list_lizy2.remove(i - removed);
            	                    removed++;
            	                }
            	            }
            	            System.out.println("non-users = " + list_lizy1.size());
            	            System.out.println("users = " + list_lizy2.size());
            	        }
                    


            // AST REWRITE
            // elements: 34, lizy2, lizy1, lizy1, 34, lizy1, lizy2
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: lizy2, lizy1
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_lizy2=new RewriteRuleSubtreeStream(adaptor,"token lizy2",list_lizy2);
            RewriteRuleSubtreeStream stream_lizy1=new RewriteRuleSubtreeStream(adaptor,"token lizy1",list_lizy1);
            root_0 = (Object)adaptor.nil();
            // 197:5: -> {$pattern::has && $lizy2.size() > 0}? ^( ',' ( $lizy1)+ BREAK ( $lizy2)+ )
            if (((pattern_scope)pattern_stack.peek()).has && list_lizy2.size() > 0) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:197:47: ^( ',' ( $lizy1)+ BREAK ( $lizy2)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_34.nextNode(), root_1);

                if ( !(stream_lizy1.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_lizy1.hasNext() ) {
                    adaptor.addChild(root_1, stream_lizy1.nextTree());

                }
                stream_lizy1.reset();
                adaptor.addChild(root_1, (Object)adaptor.create(BREAK, "BREAK"));
                if ( !(stream_lizy2.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_lizy2.hasNext() ) {
                    adaptor.addChild(root_1, stream_lizy2.nextTree());

                }
                stream_lizy2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 198:5: -> {$pattern::has}? ^( ',' ( $lizy1)+ BREAK )
            if (((pattern_scope)pattern_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:198:26: ^( ',' ( $lizy1)+ BREAK )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_34.nextNode(), root_1);

                if ( !(stream_lizy1.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_lizy1.hasNext() ) {
                    adaptor.addChild(root_1, stream_lizy1.nextTree());

                }
                stream_lizy1.reset();
                adaptor.addChild(root_1, (Object)adaptor.create(BREAK, "BREAK"));

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 199:5: -> {$lizy1.size() == 0}? BREAK ( $lizy2)+
            if (list_lizy1.size() == 0) {
                adaptor.addChild(root_0, (Object)adaptor.create(BREAK, "BREAK"));
                if ( !(stream_lizy2.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_lizy2.hasNext() ) {
                    adaptor.addChild(root_0, stream_lizy2.nextTree());

                }
                stream_lizy2.reset();

            }
            else // 200:5: -> ( $lizy1)+ BREAK
            {
                if ( !(stream_lizy1.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_lizy1.hasNext() ) {
                    adaptor.addChild(root_0, stream_lizy1.nextTree());

                }
                stream_lizy1.reset();
                adaptor.addChild(root_0, (Object)adaptor.create(BREAK, "BREAK"));

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            pattern_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "pattern"

    protected static class expr_comma_scope {
        boolean has;
        //usesBind is true if no previously bound variables are used in this expression
            //This is needed to re-order all the expr_comma's so that those that don't use bindings from other
            //expressions (and therefore other objects) are placed first, and those that do some inter-object
            //comparisons are placed after. See the RETE algorithm for an explanation.;
    }
    protected Stack expr_comma_stack = new Stack();

    public static class expr_comma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_comma"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:202:1: expr_comma : expr_or ( '||' expr_or )* -> {$expr_comma::has}? ^( '||' ( expr_or )+ ) -> expr_or ;
    public final RuleGrammarParser.expr_comma_return expr_comma() throws RecognitionException {
        expr_comma_stack.push(new expr_comma_scope());
        RuleGrammarParser.expr_comma_return retval = new RuleGrammarParser.expr_comma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal57=null;
        RuleGrammarParser.expr_or_return expr_or56 = null;

        RuleGrammarParser.expr_or_return expr_or58 = null;


        Object string_literal57_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_expr_or=new RewriteRuleSubtreeStream(adaptor,"rule expr_or");

            ((expr_comma_scope)expr_comma_stack.peek()).has = false;
            ((pattern_scope)pattern_stack.peek()).usesBind.add(false);

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:5: ( expr_or ( '||' expr_or )* -> {$expr_comma::has}? ^( '||' ( expr_or )+ ) -> expr_or )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:10: expr_or ( '||' expr_or )*
            {
            pushFollow(FOLLOW_expr_or_in_expr_comma795);
            expr_or56=expr_or();

            state._fsp--;

            stream_expr_or.add(expr_or56.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:18: ( '||' expr_or )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:19: '||' expr_or
            	    {
            	    string_literal57=(Token)match(input,35,FOLLOW_35_in_expr_comma798);  
            	    stream_35.add(string_literal57);

            	    pushFollow(FOLLOW_expr_or_in_expr_comma800);
            	    expr_or58=expr_or();

            	    state._fsp--;

            	    stream_expr_or.add(expr_or58.getTree());
            	    ((expr_comma_scope)expr_comma_stack.peek()).has = true;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: 35, expr_or, expr_or
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 215:5: -> {$expr_comma::has}? ^( '||' ( expr_or )+ )
            if (((expr_comma_scope)expr_comma_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:215:30: ^( '||' ( expr_or )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_35.nextNode(), root_1);

                if ( !(stream_expr_or.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr_or.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr_or.nextTree());

                }
                stream_expr_or.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 216:5: -> expr_or
            {
                adaptor.addChild(root_0, stream_expr_or.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            expr_comma_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "expr_comma"

    protected static class expr_or_scope {
        boolean has;
    }
    protected Stack expr_or_stack = new Stack();

    public static class expr_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_or"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:218:1: expr_or : expr_and ( '&&' expr_and )* -> {$expr_or::has}? ^( '&&' ( expr_and )+ ) -> expr_and ;
    public final RuleGrammarParser.expr_or_return expr_or() throws RecognitionException {
        expr_or_stack.push(new expr_or_scope());
        RuleGrammarParser.expr_or_return retval = new RuleGrammarParser.expr_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal60=null;
        RuleGrammarParser.expr_and_return expr_and59 = null;

        RuleGrammarParser.expr_and_return expr_and61 = null;


        Object string_literal60_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_expr_and=new RewriteRuleSubtreeStream(adaptor,"rule expr_and");

            ((expr_or_scope)expr_or_stack.peek()).has = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:225:5: ( expr_and ( '&&' expr_and )* -> {$expr_or::has}? ^( '&&' ( expr_and )+ ) -> expr_and )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:225:10: expr_and ( '&&' expr_and )*
            {
            pushFollow(FOLLOW_expr_and_in_expr_or855);
            expr_and59=expr_and();

            state._fsp--;

            stream_expr_and.add(expr_and59.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:225:19: ( '&&' expr_and )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:225:20: '&&' expr_and
            	    {
            	    string_literal60=(Token)match(input,36,FOLLOW_36_in_expr_or858);  
            	    stream_36.add(string_literal60);

            	    pushFollow(FOLLOW_expr_and_in_expr_or860);
            	    expr_and61=expr_and();

            	    state._fsp--;

            	    stream_expr_and.add(expr_and61.getTree());
            	    ((expr_or_scope)expr_or_stack.peek()).has = true;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



            // AST REWRITE
            // elements: expr_and, expr_and, 36
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 226:5: -> {$expr_or::has}? ^( '&&' ( expr_and )+ )
            if (((expr_or_scope)expr_or_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:226:27: ^( '&&' ( expr_and )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_36.nextNode(), root_1);

                if ( !(stream_expr_and.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr_and.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr_and.nextTree());

                }
                stream_expr_and.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 227:5: -> expr_and
            {
                adaptor.addChild(root_0, stream_expr_and.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            expr_or_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "expr_or"

    protected static class expr_and_scope {
        boolean hasEq;
    }
    protected Stack expr_and_stack = new Stack();

    public static class expr_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_and"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:229:1: expr_and : expr_eq_neq ( EQUALITY expr_eq_neq )* -> {$expr_and::hasEq}? ^( EQUALITY ( expr_eq_neq )+ ) -> expr_eq_neq ;
    public final RuleGrammarParser.expr_and_return expr_and() throws RecognitionException {
        expr_and_stack.push(new expr_and_scope());
        RuleGrammarParser.expr_and_return retval = new RuleGrammarParser.expr_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALITY63=null;
        RuleGrammarParser.expr_eq_neq_return expr_eq_neq62 = null;

        RuleGrammarParser.expr_eq_neq_return expr_eq_neq64 = null;


        Object EQUALITY63_tree=null;
        RewriteRuleTokenStream stream_EQUALITY=new RewriteRuleTokenStream(adaptor,"token EQUALITY");
        RewriteRuleSubtreeStream stream_expr_eq_neq=new RewriteRuleSubtreeStream(adaptor,"rule expr_eq_neq");

            ((expr_and_scope)expr_and_stack.peek()).hasEq = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:236:5: ( expr_eq_neq ( EQUALITY expr_eq_neq )* -> {$expr_and::hasEq}? ^( EQUALITY ( expr_eq_neq )+ ) -> expr_eq_neq )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:236:10: expr_eq_neq ( EQUALITY expr_eq_neq )*
            {
            pushFollow(FOLLOW_expr_eq_neq_in_expr_and915);
            expr_eq_neq62=expr_eq_neq();

            state._fsp--;

            stream_expr_eq_neq.add(expr_eq_neq62.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:236:22: ( EQUALITY expr_eq_neq )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EQUALITY) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:236:23: EQUALITY expr_eq_neq
            	    {
            	    EQUALITY63=(Token)match(input,EQUALITY,FOLLOW_EQUALITY_in_expr_and918);  
            	    stream_EQUALITY.add(EQUALITY63);

            	    pushFollow(FOLLOW_expr_eq_neq_in_expr_and920);
            	    expr_eq_neq64=expr_eq_neq();

            	    state._fsp--;

            	    stream_expr_eq_neq.add(expr_eq_neq64.getTree());
            	    ((expr_and_scope)expr_and_stack.peek()).hasEq = true;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);



            // AST REWRITE
            // elements: expr_eq_neq, EQUALITY, expr_eq_neq
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 237:5: -> {$expr_and::hasEq}? ^( EQUALITY ( expr_eq_neq )+ )
            if (((expr_and_scope)expr_and_stack.peek()).hasEq) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:237:30: ^( EQUALITY ( expr_eq_neq )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_EQUALITY.nextNode(), root_1);

                if ( !(stream_expr_eq_neq.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr_eq_neq.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr_eq_neq.nextTree());

                }
                stream_expr_eq_neq.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 238:5: -> expr_eq_neq
            {
                adaptor.addChild(root_0, stream_expr_eq_neq.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            expr_and_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "expr_and"

    protected static class expr_eq_neq_scope {
        boolean has;
    }
    protected Stack expr_eq_neq_stack = new Stack();

    public static class expr_eq_neq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_eq_neq"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:240:1: expr_eq_neq : expr_comp ( INEQUALITY expr_comp )* -> {$expr_eq_neq::has}? ^( INEQUALITY ( expr_comp )+ ) -> expr_comp ;
    public final RuleGrammarParser.expr_eq_neq_return expr_eq_neq() throws RecognitionException {
        expr_eq_neq_stack.push(new expr_eq_neq_scope());
        RuleGrammarParser.expr_eq_neq_return retval = new RuleGrammarParser.expr_eq_neq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INEQUALITY66=null;
        RuleGrammarParser.expr_comp_return expr_comp65 = null;

        RuleGrammarParser.expr_comp_return expr_comp67 = null;


        Object INEQUALITY66_tree=null;
        RewriteRuleTokenStream stream_INEQUALITY=new RewriteRuleTokenStream(adaptor,"token INEQUALITY");
        RewriteRuleSubtreeStream stream_expr_comp=new RewriteRuleSubtreeStream(adaptor,"rule expr_comp");

            ((expr_eq_neq_scope)expr_eq_neq_stack.peek()).has = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:247:5: ( expr_comp ( INEQUALITY expr_comp )* -> {$expr_eq_neq::has}? ^( INEQUALITY ( expr_comp )+ ) -> expr_comp )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:247:10: expr_comp ( INEQUALITY expr_comp )*
            {
            pushFollow(FOLLOW_expr_comp_in_expr_eq_neq975);
            expr_comp65=expr_comp();

            state._fsp--;

            stream_expr_comp.add(expr_comp65.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:247:20: ( INEQUALITY expr_comp )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==INEQUALITY) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:247:21: INEQUALITY expr_comp
            	    {
            	    INEQUALITY66=(Token)match(input,INEQUALITY,FOLLOW_INEQUALITY_in_expr_eq_neq978);  
            	    stream_INEQUALITY.add(INEQUALITY66);

            	    pushFollow(FOLLOW_expr_comp_in_expr_eq_neq980);
            	    expr_comp67=expr_comp();

            	    state._fsp--;

            	    stream_expr_comp.add(expr_comp67.getTree());
            	    ((expr_eq_neq_scope)expr_eq_neq_stack.peek()).has = true;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);



            // AST REWRITE
            // elements: expr_comp, INEQUALITY, expr_comp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 248:5: -> {$expr_eq_neq::has}? ^( INEQUALITY ( expr_comp )+ )
            if (((expr_eq_neq_scope)expr_eq_neq_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:248:31: ^( INEQUALITY ( expr_comp )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_INEQUALITY.nextNode(), root_1);

                if ( !(stream_expr_comp.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr_comp.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr_comp.nextTree());

                }
                stream_expr_comp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 249:5: -> expr_comp
            {
                adaptor.addChild(root_0, stream_expr_comp.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            expr_eq_neq_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "expr_eq_neq"

    protected static class expr_comp_scope {
        int has;
    }
    protected Stack expr_comp_stack = new Stack();

    public static class expr_comp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_comp"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:253:1: expr_comp : expr_add_sub ( ( '+' | '-' ) expr_add_sub )* ;
    public final RuleGrammarParser.expr_comp_return expr_comp() throws RecognitionException {
        expr_comp_stack.push(new expr_comp_scope());
        RuleGrammarParser.expr_comp_return retval = new RuleGrammarParser.expr_comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set69=null;
        RuleGrammarParser.expr_add_sub_return expr_add_sub68 = null;

        RuleGrammarParser.expr_add_sub_return expr_add_sub70 = null;


        Object set69_tree=null;


            ((expr_comp_scope)expr_comp_stack.peek()).has = 0;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:260:5: ( expr_add_sub ( ( '+' | '-' ) expr_add_sub )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:260:10: expr_add_sub ( ( '+' | '-' ) expr_add_sub )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_add_sub_in_expr_comp1037);
            expr_add_sub68=expr_add_sub();

            state._fsp--;

            adaptor.addChild(root_0, expr_add_sub68.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:260:23: ( ( '+' | '-' ) expr_add_sub )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=37 && LA21_0<=38)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:260:24: ( '+' | '-' ) expr_add_sub
            	    {
            	    set69=(Token)input.LT(1);
            	    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set69));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_add_sub_in_expr_comp1048);
            	    expr_add_sub70=expr_add_sub();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_add_sub70.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            expr_comp_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "expr_comp"

    public static class expr_add_sub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_add_sub"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:262:1: expr_add_sub : expr_mul_div ( ( '*' | '/' ) expr_mul_div )* ;
    public final RuleGrammarParser.expr_add_sub_return expr_add_sub() throws RecognitionException {
        RuleGrammarParser.expr_add_sub_return retval = new RuleGrammarParser.expr_add_sub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set72=null;
        RuleGrammarParser.expr_mul_div_return expr_mul_div71 = null;

        RuleGrammarParser.expr_mul_div_return expr_mul_div73 = null;


        Object set72_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:263:5: ( expr_mul_div ( ( '*' | '/' ) expr_mul_div )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:263:10: expr_mul_div ( ( '*' | '/' ) expr_mul_div )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub1065);
            expr_mul_div71=expr_mul_div();

            state._fsp--;

            adaptor.addChild(root_0, expr_mul_div71.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:263:23: ( ( '*' | '/' ) expr_mul_div )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=39 && LA22_0<=40)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:263:24: ( '*' | '/' ) expr_mul_div
            	    {
            	    set72=(Token)input.LT(1);
            	    if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set72));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub1076);
            	    expr_mul_div73=expr_mul_div();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_mul_div73.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_add_sub"

    public static class expr_mul_div_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_mul_div"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:265:1: expr_mul_div : ( '!' )? expr_not ;
    public final RuleGrammarParser.expr_mul_div_return expr_mul_div() throws RecognitionException {
        RuleGrammarParser.expr_mul_div_return retval = new RuleGrammarParser.expr_mul_div_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal74=null;
        RuleGrammarParser.expr_not_return expr_not75 = null;


        Object char_literal74_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:266:5: ( ( '!' )? expr_not )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:266:10: ( '!' )? expr_not
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:266:10: ( '!' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:266:11: '!'
                    {
                    char_literal74=(Token)match(input,41,FOLLOW_41_in_expr_mul_div1094); 
                    char_literal74_tree = (Object)adaptor.create(char_literal74);
                    adaptor.addChild(root_0, char_literal74_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_not_in_expr_mul_div1098);
            expr_not75=expr_not();

            state._fsp--;

            adaptor.addChild(root_0, expr_not75.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_mul_div"

    public static class expr_not_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_not"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:268:1: expr_not : ( '-' | '+' )? expr_unary ;
    public final RuleGrammarParser.expr_not_return expr_not() throws RecognitionException {
        RuleGrammarParser.expr_not_return retval = new RuleGrammarParser.expr_not_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set76=null;
        RuleGrammarParser.expr_unary_return expr_unary77 = null;


        Object set76_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:269:5: ( ( '-' | '+' )? expr_unary )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:269:10: ( '-' | '+' )? expr_unary
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:269:10: ( '-' | '+' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=37 && LA24_0<=38)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
                    {
                    set76=(Token)input.LT(1);
                    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set76));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_unary_in_expr_not1122);
            expr_unary77=expr_unary();

            state._fsp--;

            adaptor.addChild(root_0, expr_unary77.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expr_not"

    protected static class expr_unary_scope {
        boolean binding;
        boolean bound;
    }
    protected Stack expr_unary_stack = new Stack();

    public static class expr_unary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_unary"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:271:1: expr_unary : ( ( '$' | '$' m1= identifier ':' )? m2= identifier -> {$expr_unary::binding}? ^( '$' $m1 ':' $m2) -> {$expr_unary::bound}? ^( '$' $m2) -> $m2 | INT | '(' expr_or ')' -> expr_or );
    public final RuleGrammarParser.expr_unary_return expr_unary() throws RecognitionException {
        expr_unary_stack.push(new expr_unary_scope());
        RuleGrammarParser.expr_unary_return retval = new RuleGrammarParser.expr_unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal78=null;
        Token char_literal79=null;
        Token char_literal80=null;
        Token INT81=null;
        Token char_literal82=null;
        Token char_literal84=null;
        RuleGrammarParser.identifier_return m1 = null;

        RuleGrammarParser.identifier_return m2 = null;

        RuleGrammarParser.expr_or_return expr_or83 = null;


        Object char_literal78_tree=null;
        Object char_literal79_tree=null;
        Object char_literal80_tree=null;
        Object INT81_tree=null;
        Object char_literal82_tree=null;
        Object char_literal84_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_expr_or=new RewriteRuleSubtreeStream(adaptor,"rule expr_or");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

            ((expr_unary_scope)expr_unary_stack.peek()).binding = false;
            ((expr_unary_scope)expr_unary_stack.peek()).bound = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:280:5: ( ( '$' | '$' m1= identifier ':' )? m2= identifier -> {$expr_unary::binding}? ^( '$' $m1 ':' $m2) -> {$expr_unary::bound}? ^( '$' $m2) -> $m2 | INT | '(' expr_or ')' -> expr_or )
            int alt26=3;
            switch ( input.LA(1) ) {
            case ID:
            case 42:
                {
                alt26=1;
                }
                break;
            case INT:
                {
                alt26=2;
                }
                break;
            case 22:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:281:9: ( '$' | '$' m1= identifier ':' )? m2= identifier
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:281:9: ( '$' | '$' m1= identifier ':' )?
                    int alt25=3;
                    alt25 = dfa25.predict(input);
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:281:10: '$'
                            {
                            char_literal78=(Token)match(input,42,FOLLOW_42_in_expr_unary1152);  
                            stream_42.add(char_literal78);

                            ((expr_unary_scope)expr_unary_stack.peek()).bound = true; ((pattern_scope)pattern_stack.peek()).usesBind.removeLast(); ((pattern_scope)pattern_stack.peek()).usesBind.add(true);

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:281:108: '$' m1= identifier ':'
                            {
                            char_literal79=(Token)match(input,42,FOLLOW_42_in_expr_unary1158);  
                            stream_42.add(char_literal79);

                            pushFollow(FOLLOW_identifier_in_expr_unary1162);
                            m1=identifier();

                            state._fsp--;

                            stream_identifier.add(m1.getTree());
                            char_literal80=(Token)match(input,20,FOLLOW_20_in_expr_unary1164);  
                            stream_20.add(char_literal80);


                                        ((expr_unary_scope)expr_unary_stack.peek()).binding = true;
                                        if (((rule_scope)rule_stack.peek()).bindings.contains((m1!=null?input.toString(m1.start,m1.stop):null)))
                                            System.err.println((m1!=null?input.toString(m1.start,m1.stop):null) + " was already bound to another variable.");
                                        else
                                        {
                                            ((rule_scope)rule_stack.peek()).bindings.add((m1!=null?input.toString(m1.start,m1.stop):null));
                                            ((ruleWhen_scope)ruleWhen_stack.peek()).bindings.add((m1!=null?input.toString(m1.start,m1.stop):null));
                                        }
                                    

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_expr_unary1189);
                    m2=identifier();

                    state._fsp--;

                    stream_identifier.add(m2.getTree());

                                if (((expr_unary_scope)expr_unary_stack.peek()).bound && !((expr_unary_scope)expr_unary_stack.peek()).binding)
                                {
                                    if (!((rule_scope)rule_stack.peek()).bindings.contains((m2!=null?input.toString(m2.start,m2.stop):null)))
                                        System.err.println("The variable " + (m2!=null?input.toString(m2.start,m2.stop):null) + " was not previously bound.");
                                    else if (((ruleWhen_scope)ruleWhen_stack.peek()).bindings.contains((m2!=null?input.toString(m2.start,m2.stop):null)))
                                        //using a variable bound in the same object condition is not allowed
                                        System.err.println("The variable " + (m2!=null?input.toString(m2.start,m2.stop):null) + " was bound in the same LHS object.");
                                }
                                else if (((HashMap)classTable.get(((ruleWhen_scope)ruleWhen_stack.peek()).declName)).get((m2!=null?input.toString(m2.start,m2.stop):null)) == null)
                                    System.err.println("The variable " + (m2!=null?input.toString(m2.start,m2.stop):null) + " is not a member of " + ((ruleWhen_scope)ruleWhen_stack.peek()).declName);
                            


                    // AST REWRITE
                    // elements: 42, m2, m1, 42, m2, 20, m2
                    // token labels: 
                    // rule labels: retval, m1, m2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"rule m1",m1!=null?m1.tree:null);
                    RewriteRuleSubtreeStream stream_m2=new RewriteRuleSubtreeStream(adaptor,"rule m2",m2!=null?m2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 306:5: -> {$expr_unary::binding}? ^( '$' $m1 ':' $m2)
                    if (((expr_unary_scope)expr_unary_stack.peek()).binding) {
                        // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:306:33: ^( '$' $m1 ':' $m2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_42.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_m1.nextTree());
                        adaptor.addChild(root_1, stream_20.nextNode());
                        adaptor.addChild(root_1, stream_m2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 307:5: -> {$expr_unary::bound}? ^( '$' $m2)
                    if (((expr_unary_scope)expr_unary_stack.peek()).bound) {
                        // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:307:31: ^( '$' $m2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_42.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_m2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 308:5: -> $m2
                    {
                        adaptor.addChild(root_0, stream_m2.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:309:7: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT81=(Token)match(input,INT,FOLLOW_INT_in_expr_unary1259); 
                    INT81_tree = (Object)adaptor.create(INT81);
                    adaptor.addChild(root_0, INT81_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:309:13: '(' expr_or ')'
                    {
                    char_literal82=(Token)match(input,22,FOLLOW_22_in_expr_unary1263);  
                    stream_22.add(char_literal82);

                    pushFollow(FOLLOW_expr_or_in_expr_unary1265);
                    expr_or83=expr_or();

                    state._fsp--;

                    stream_expr_or.add(expr_or83.getTree());
                    char_literal84=(Token)match(input,23,FOLLOW_23_in_expr_unary1267);  
                    stream_23.add(char_literal84);



                    // AST REWRITE
                    // elements: expr_or
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 309:29: -> expr_or
                    {
                        adaptor.addChild(root_0, stream_expr_or.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            expr_unary_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "expr_unary"

    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:311:1: identifier : ID ( ID | INT )* ;
    public final RuleGrammarParser.identifier_return identifier() throws RecognitionException {
        RuleGrammarParser.identifier_return retval = new RuleGrammarParser.identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID85=null;
        Token set86=null;

        Object ID85_tree=null;
        Object set86_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:312:5: ( ID ( ID | INT )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:312:10: ID ( ID | INT )*
            {
            root_0 = (Object)adaptor.nil();

            ID85=(Token)match(input,ID,FOLLOW_ID_in_identifier1286); 
            ID85_tree = (Object)adaptor.create(ID85);
            adaptor.addChild(root_0, ID85_tree);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:312:13: ( ID | INT )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=INT && LA27_0<=ID)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            	    {
            	    set86=(Token)input.LT(1);
            	    if ( (input.LA(1)>=INT && input.LA(1)<=ID) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set86));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifier"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\7\uffff";
    static final String DFA25_eofS =
        "\7\uffff";
    static final String DFA25_minS =
        "\2\14\1\uffff\2\11\2\uffff";
    static final String DFA25_maxS =
        "\1\52\1\14\1\uffff\2\50\2\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\3\2\uffff\1\1\1\2";
    static final String DFA25_specialS =
        "\7\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\35\uffff\1\1",
            "\1\3",
            "",
            "\2\5\2\4\7\uffff\1\6\2\uffff\1\5\12\uffff\7\5",
            "\2\5\2\4\7\uffff\1\6\2\uffff\1\5\12\uffff\7\5",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "281:9: ( '$' | '$' m1= identifier ':' )?";
        }
    }
 

    public static final BitSet FOLLOW_rule_in_prog98 = new BitSet(new long[]{0x0000000000088082L});
    public static final BitSet FOLLOW_decl_in_prog102 = new BitSet(new long[]{0x0000000000088082L});
    public static final BitSet FOLLOW_NEWLINE_in_prog108 = new BitSet(new long[]{0x0000000000088082L});
    public static final BitSet FOLLOW_15_in_rule137 = new BitSet(new long[]{0x000007FFFFF87F70L});
    public static final BitSet FOLLOW_ruleName_in_rule139 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_rule141 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rule143 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_ruleWhen_in_rule145 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_NEWLINE_in_rule147 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_17_in_rule150 = new BitSet(new long[]{0x000007FFFFF87E70L});
    public static final BitSet FOLLOW_ruleThen_in_rule152 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_NEWLINE_in_rule154 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_18_in_rule157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_decl206 = new BitSet(new long[]{0x000007FFFFF3FF70L});
    public static final BitSet FOLLOW_declName_in_decl208 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_decl210 = new BitSet(new long[]{0x000007FFFFFBFF70L});
    public static final BitSet FOLLOW_declMember_in_decl214 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_NEWLINE_in_decl219 = new BitSet(new long[]{0x000007FFFFFBFF70L});
    public static final BitSet FOLLOW_declMember_in_decl223 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_NEWLINE_in_decl229 = new BitSet(new long[]{0x0000000000040080L});
    public static final BitSet FOLLOW_18_in_decl232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub2_in_declName259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttribute_in_declMember278 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_declMember280 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_declAttributeType_in_declMember282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub1_in_ruleName300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName305 = new BitSet(new long[]{0x000007FFFFF87E70L});
    public static final BitSet FOLLOW_sub1_in_ruleName307 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhen343 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_ruleWhen1_in_ruleWhen346 = new BitSet(new long[]{0x0000000006201082L});
    public static final BitSet FOLLOW_ruleWhenK_in_ruleWhen348 = new BitSet(new long[]{0x0000000006201082L});
    public static final BitSet FOLLOW_21_in_ruleWhen1391 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhen1395 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWhen1399 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_pattern_in_ruleWhen1401 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleWhen1403 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhen1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWhen1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleWhenK446 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_26_in_ruleWhenK450 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_21_in_ruleWhenK454 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhenK458 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWhenK462 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_pattern_in_ruleWhenK464 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleWhenK466 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhenK469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWhenK473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub1_in_ruleThen498 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleThen501 = new BitSet(new long[]{0x000007FFFFF87E70L});
    public static final BitSet FOLLOW_sub1_in_ruleThen503 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_sub1521 = new BitSet(new long[]{0x000007FFFFF87E72L});
    public static final BitSet FOLLOW_set_in_sub2562 = new BitSet(new long[]{0x000007FFFFF3FF72L});
    public static final BitSet FOLLOW_set_in_declAttribute591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declAttributeType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_ant_class653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_comma_in_pattern680 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_pattern683 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_expr_comma_in_pattern687 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_expr_or_in_expr_comma795 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_expr_comma798 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_expr_or_in_expr_comma800 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_expr_and_in_expr_or855 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_expr_or858 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_expr_and_in_expr_or860 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_expr_eq_neq_in_expr_and915 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_EQUALITY_in_expr_and918 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_expr_eq_neq_in_expr_and920 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_expr_comp_in_expr_eq_neq975 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INEQUALITY_in_expr_eq_neq978 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_expr_comp_in_expr_eq_neq980 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_comp1037 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_set_in_expr_comp1040 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_comp1048 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub1065 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_set_in_expr_add_sub1068 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub1076 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_41_in_expr_mul_div1094 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_expr_not_in_expr_mul_div1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr_not1113 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_expr_unary_in_expr_not1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_expr_unary1152 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_42_in_expr_unary1158 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_identifier_in_expr_unary1162 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_expr_unary1164 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_identifier_in_expr_unary1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr_unary1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_expr_unary1263 = new BitSet(new long[]{0x0000066000601880L});
    public static final BitSet FOLLOW_expr_or_in_expr_unary1265 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_expr_unary1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier1286 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_set_in_identifier1288 = new BitSet(new long[]{0x0000000000001802L});

}