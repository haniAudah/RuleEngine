// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g 2013-01-13 16:50:31

    package parser;
    import java.util.HashMap;
    import java.util.LinkedList;
    import java.util.Collections;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class RuleGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULENAME", "RULEWHEN", "BREAK", "COMMA", "NEWLINE", "QUOTE", "INEQUALITY", "EQUALITY", "INT", "ID", "LINE_COMMENT", "WS", "'rule'", "'when'", "'then'", "'end'", "'declare'", "':'", "'not'", "'('", "')'", "';'", "'and'", "'or'", "'String'", "'Integer'", "'int'", "'long'", "'Decimal'", "'Char'", "'double'", "','", "'&&'", "'||'", "'+'", "'-'", "'*'", "'/'", "'$'"
    };
    public static final int EOF=-1;
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
    public static final int COMMA=7;
    public static final int NEWLINE=8;
    public static final int QUOTE=9;
    public static final int INEQUALITY=10;
    public static final int EQUALITY=11;
    public static final int INT=12;
    public static final int ID=13;
    public static final int LINE_COMMENT=14;
    public static final int WS=15;

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:1: prog : ( rule | decl | NEWLINE )+ ;
    public final RuleGrammarParser.prog_return prog() throws RecognitionException {
        RuleGrammarParser.prog_return retval = new RuleGrammarParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE3=null;
        RuleGrammarParser.rule_return rule1 = null;

        RuleGrammarParser.decl_return decl2 = null;


        Object NEWLINE3_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:34:5: ( ( rule | decl | NEWLINE )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:34:10: ( rule | decl | NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:34:10: ( rule | decl | NEWLINE )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt1=1;
                    }
                    break;
                case 20:
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
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:34:11: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_prog113);
            	    rule1=rule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, rule1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:34:18: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_prog117);
            	    decl2=decl();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:34:27: NEWLINE
            	    {
            	    NEWLINE3=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_prog123); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:38:1: rule : 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' -> ^( 'rule' ruleName ruleWhen 'then' ) ;
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
        RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleSubtreeStream stream_ruleName=new RewriteRuleSubtreeStream(adaptor,"rule ruleName");
        RewriteRuleSubtreeStream stream_ruleThen=new RewriteRuleSubtreeStream(adaptor,"rule ruleThen");
        RewriteRuleSubtreeStream stream_ruleWhen=new RewriteRuleSubtreeStream(adaptor,"rule ruleWhen");

            ((rule_scope)rule_stack.peek()).bindings = new LinkedList<String>();

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:5: ( 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' -> ^( 'rule' ruleName ruleWhen 'then' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:10: 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end'
            {
            string_literal4=(Token)match(input,16,FOLLOW_16_in_rule152); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_16.add(string_literal4);

            pushFollow(FOLLOW_ruleName_in_rule154);
            ruleName5=ruleName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ruleName.add(ruleName5.getTree());
            NEWLINE6=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule156); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE6);

            string_literal7=(Token)match(input,17,FOLLOW_17_in_rule158); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_17.add(string_literal7);

            pushFollow(FOLLOW_ruleWhen_in_rule160);
            ruleWhen8=ruleWhen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ruleWhen.add(ruleWhen8.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:50: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:0:0: NEWLINE
            	    {
            	    NEWLINE9=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule162); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE9);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            string_literal10=(Token)match(input,18,FOLLOW_18_in_rule165); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_18.add(string_literal10);

            pushFollow(FOLLOW_ruleThen_in_rule167);
            ruleThen11=ruleThen();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ruleThen.add(ruleThen11.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:75: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:0:0: NEWLINE
            	    {
            	    NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule169); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE12);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            string_literal13=(Token)match(input,19,FOLLOW_19_in_rule172); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_19.add(string_literal13);

            if ( state.backtracking==0 ) {

                           if (ruleTable.get((ruleName5!=null?input.toString(ruleName5.start,ruleName5.stop):null)) != null)
                           {
                               System.err.println("Attempting to redefine rule " + (ruleName5!=null?input.toString(ruleName5.start,ruleName5.stop):null) + " at line " + (((Token)retval.start)).getLine());
                           }
                           else
                           {
                               ruleTable.put((ruleName5!=null?input.toString(ruleName5.start,ruleName5.stop):null), "bla");
                               //TODO Decide on how you want to store the rule
                           }
                       
            }


            // AST REWRITE
            // elements: ruleName, 16, 18, ruleWhen
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 56:12: -> ^( 'rule' ruleName ruleWhen 'then' )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:56:15: ^( 'rule' ruleName ruleWhen 'then' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_16.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ruleName.nextTree());
                adaptor.addChild(root_1, stream_ruleWhen.nextTree());
                adaptor.addChild(root_1, stream_18.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:60:1: decl : 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end' ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:67:5: ( 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:67:10: 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal14=(Token)match(input,20,FOLLOW_20_in_decl221); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal14_tree = (Object)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);
            }
            pushFollow(FOLLOW_declName_in_decl223);
            declName15=declName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declName15.getTree());
            NEWLINE16=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl225); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEWLINE16_tree = (Object)adaptor.create(NEWLINE16);
            adaptor.addChild(root_0, NEWLINE16_tree);
            }
            pushFollow(FOLLOW_declMember_in_decl229);
            d=declMember();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
            if ( state.backtracking==0 ) {
              ((decl_scope)decl_stack.peek()).newClass.put((d!=null?d.attr:null), (d!=null?d.type:null));
            }
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:67:91: ( NEWLINE d= declMember )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    int LA4_1 = input.LA(2);

                    if ( ((LA4_1>=RULENAME && LA4_1<=COMMA)||(LA4_1>=QUOTE && LA4_1<=18)||(LA4_1>=20 && LA4_1<=42)) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:67:92: NEWLINE d= declMember
            	    {
            	    NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl234); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NEWLINE17_tree = (Object)adaptor.create(NEWLINE17);
            	    adaptor.addChild(root_0, NEWLINE17_tree);
            	    }
            	    pushFollow(FOLLOW_declMember_in_decl238);
            	    d=declMember();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, d.getTree());
            	    if ( state.backtracking==0 ) {
            	      ((decl_scope)decl_stack.peek()).newClass.put((d!=null?d.attr:null), (d!=null?d.type:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:67:156: ( NEWLINE )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:0:0: NEWLINE
            	    {
            	    NEWLINE18=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl244); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NEWLINE18_tree = (Object)adaptor.create(NEWLINE18);
            	    adaptor.addChild(root_0, NEWLINE18_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            string_literal19=(Token)match(input,19,FOLLOW_19_in_decl247); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal19_tree = (Object)adaptor.create(string_literal19);
            adaptor.addChild(root_0, string_literal19_tree);
            }
            if ( state.backtracking==0 ) {

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

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:1: declName : sub2 ;
    public final RuleGrammarParser.declName_return declName() throws RecognitionException {
        RuleGrammarParser.declName_return retval = new RuleGrammarParser.declName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.sub2_return sub220 = null;



        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:5: ( sub2 )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:10: sub2
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sub2_in_declName274);
            sub220=sub2();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sub220.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:83:1: declMember returns [String attr, String type] : declAttribute ':' declAttributeType ;
    public final RuleGrammarParser.declMember_return declMember() throws RecognitionException {
        RuleGrammarParser.declMember_return retval = new RuleGrammarParser.declMember_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal22=null;
        RuleGrammarParser.declAttribute_return declAttribute21 = null;

        RuleGrammarParser.declAttributeType_return declAttributeType23 = null;


        Object char_literal22_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:84:5: ( declAttribute ':' declAttributeType )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:84:10: declAttribute ':' declAttributeType
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declAttribute_in_declMember293);
            declAttribute21=declAttribute();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declAttribute21.getTree());
            char_literal22=(Token)match(input,21,FOLLOW_21_in_declMember295); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);
            }
            pushFollow(FOLLOW_declAttributeType_in_declMember297);
            declAttributeType23=declAttributeType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, declAttributeType23.getTree());
            if ( state.backtracking==0 ) {
              retval.attr = (declAttribute21!=null?input.toString(declAttribute21.start,declAttribute21.stop):null); retval.type = (declAttributeType23!=null?input.toString(declAttributeType23.start,declAttributeType23.stop):null);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:1: ruleName : ( sub1 | ( QUOTE sub1 QUOTE ) ) -> ^( RULENAME sub1 ) ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:5: ( ( sub1 | ( QUOTE sub1 QUOTE ) ) -> ^( RULENAME sub1 ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:10: ( sub1 | ( QUOTE sub1 QUOTE ) )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:10: ( sub1 | ( QUOTE sub1 QUOTE ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULENAME && LA6_0<=COMMA)||(LA6_0>=INEQUALITY && LA6_0<=WS)||(LA6_0>=20 && LA6_0<=42)) ) {
                alt6=1;
            }
            else if ( (LA6_0==QUOTE) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:11: sub1
                    {
                    pushFollow(FOLLOW_sub1_in_ruleName315);
                    sub124=sub1();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sub1.add(sub124.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:18: ( QUOTE sub1 QUOTE )
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:18: ( QUOTE sub1 QUOTE )
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:19: QUOTE sub1 QUOTE
                    {
                    QUOTE25=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName320); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUOTE.add(QUOTE25);

                    pushFollow(FOLLOW_sub1_in_ruleName322);
                    sub126=sub1();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sub1.add(sub126.getTree());
                    QUOTE27=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName324); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUOTE.add(QUOTE27);


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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:38: -> ^( RULENAME sub1 )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:41: ^( RULENAME sub1 )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RULENAME, "RULENAME"), root_1);

                adaptor.addChild(root_1, stream_sub1.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:89:1: ruleWhen : ( NEWLINE )* ruleWhen1 ( ruleWhenK )* -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* ) ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:5: ( ( NEWLINE )* ruleWhen1 ( ruleWhenK )* -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:10: ( NEWLINE )* ruleWhen1 ( ruleWhenK )*
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:10: ( NEWLINE )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NEWLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:0:0: NEWLINE
            	    {
            	    NEWLINE28=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhen358); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE28);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            pushFollow(FOLLOW_ruleWhen1_in_ruleWhen361);
            ruleWhen129=ruleWhen1();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ruleWhen1.add(ruleWhen129.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:29: ( ruleWhenK )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==ID||LA8_0==22||(LA8_0>=26 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:0:0: ruleWhenK
            	    {
            	    pushFollow(FOLLOW_ruleWhenK_in_ruleWhen363);
            	    ruleWhenK30=ruleWhenK();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ruleWhenK.add(ruleWhenK30.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);



            // AST REWRITE
            // elements: ruleWhenK, ruleWhen1
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 98:40: -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:43: ^( RULEWHEN ruleWhen1 ( ruleWhenK )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RULEWHEN, "RULEWHEN"), root_1);

                adaptor.addChild(root_1, stream_ruleWhen1.nextTree());
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:64: ( ruleWhenK )*
                while ( stream_ruleWhenK.hasNext() ) {
                    adaptor.addChild(root_1, stream_ruleWhenK.nextTree());

                }
                stream_ruleWhenK.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:100:1: ruleWhen1 : ( 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) -> ^( ant_class pattern ) ;
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
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_ant_class=new RewriteRuleSubtreeStream(adaptor,"rule ant_class");

            ((ruleWhen_scope)ruleWhen_stack.peek()).bindings = new LinkedList<String>();

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:106:5: ( ( 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) -> ^( ant_class pattern ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:106:10: ( 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:106:10: ( 'not' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:106:11: 'not'
                    {
                    string_literal31=(Token)match(input,22,FOLLOW_22_in_ruleWhen1406); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_22.add(string_literal31);


                    }
                    break;

            }

            pushFollow(FOLLOW_ant_class_in_ruleWhen1410);
            ant_class32=ant_class();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ant_class.add(ant_class32.getTree());
            if ( state.backtracking==0 ) {
              ((ruleWhen_scope)ruleWhen_stack.peek()).declName = (ant_class32!=null?input.toString(ant_class32.start,ant_class32.stop):null);
            }
            char_literal33=(Token)match(input,23,FOLLOW_23_in_ruleWhen1414); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(char_literal33);

            pushFollow(FOLLOW_pattern_in_ruleWhen1416);
            pattern34=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern34.getTree());
            char_literal35=(Token)match(input,24,FOLLOW_24_in_ruleWhen1418); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_24.add(char_literal35);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:106:86: ( NEWLINE | ';' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NEWLINE) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:106:87: NEWLINE
                    {
                    NEWLINE36=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhen1421); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE36);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:106:97: ';'
                    {
                    char_literal37=(Token)match(input,25,FOLLOW_25_in_ruleWhen1425); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_25.add(char_literal37);


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
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 106:102: -> ^( ant_class pattern )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:106:105: ^( ant_class pattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ant_class.nextNode(), root_1);

                adaptor.addChild(root_1, stream_pattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:108:1: ruleWhenK : ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ) -> ^( ant_class pattern ) ;
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
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_ant_class=new RewriteRuleSubtreeStream(adaptor,"rule ant_class");

            ((ruleWhen_scope)ruleWhen_stack.peek()).bindings = new LinkedList<String>();

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:5: ( ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ) -> ^( ant_class pattern ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:10: ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:10: ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:11: ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:11: ( 'and' | 'or' | 'not' )?
            int alt11=4;
            switch ( input.LA(1) ) {
                case 26:
                    {
                    alt11=1;
                    }
                    break;
                case 27:
                    {
                    alt11=2;
                    }
                    break;
                case 22:
                    {
                    alt11=3;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:12: 'and'
                    {
                    string_literal38=(Token)match(input,26,FOLLOW_26_in_ruleWhenK461); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(string_literal38);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:20: 'or'
                    {
                    string_literal39=(Token)match(input,27,FOLLOW_27_in_ruleWhenK465); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(string_literal39);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:27: 'not'
                    {
                    string_literal40=(Token)match(input,22,FOLLOW_22_in_ruleWhenK469); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_22.add(string_literal40);


                    }
                    break;

            }

            pushFollow(FOLLOW_ant_class_in_ruleWhenK473);
            ant_class41=ant_class();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ant_class.add(ant_class41.getTree());
            if ( state.backtracking==0 ) {
              ((ruleWhen_scope)ruleWhen_stack.peek()).declName = (ant_class41!=null?input.toString(ant_class41.start,ant_class41.stop):null);
            }
            char_literal42=(Token)match(input,23,FOLLOW_23_in_ruleWhenK477); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_23.add(char_literal42);

            pushFollow(FOLLOW_pattern_in_ruleWhenK479);
            pattern43=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_pattern.add(pattern43.getTree());
            char_literal44=(Token)match(input,24,FOLLOW_24_in_ruleWhenK481); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_24.add(char_literal44);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:102: ( NEWLINE | ';' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==NEWLINE) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:103: NEWLINE
                    {
                    NEWLINE45=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhenK484); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NEWLINE.add(NEWLINE45);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:113: ';'
                    {
                    char_literal46=(Token)match(input,25,FOLLOW_25_in_ruleWhenK488); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_25.add(char_literal46);


                    }
                    break;

            }


            }



            // AST REWRITE
            // elements: ant_class, pattern
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:119: -> ^( ant_class pattern )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:122: ^( ant_class pattern )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_ant_class.nextNode(), root_1);

                adaptor.addChild(root_1, stream_pattern.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:115:1: ruleThen : sub1 ( NEWLINE sub1 )* ;
    public final RuleGrammarParser.ruleThen_return ruleThen() throws RecognitionException {
        RuleGrammarParser.ruleThen_return retval = new RuleGrammarParser.ruleThen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE48=null;
        RuleGrammarParser.sub1_return sub147 = null;

        RuleGrammarParser.sub1_return sub149 = null;


        Object NEWLINE48_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:116:5: ( sub1 ( NEWLINE sub1 )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:116:10: sub1 ( NEWLINE sub1 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sub1_in_ruleThen513);
            sub147=sub1();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sub147.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:116:15: ( NEWLINE sub1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==NEWLINE) ) {
                    int LA13_1 = input.LA(2);

                    if ( ((LA13_1>=RULENAME && LA13_1<=COMMA)||(LA13_1>=INEQUALITY && LA13_1<=WS)||(LA13_1>=20 && LA13_1<=42)) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:116:16: NEWLINE sub1
            	    {
            	    NEWLINE48=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleThen516); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NEWLINE48_tree = (Object)adaptor.create(NEWLINE48);
            	    adaptor.addChild(root_0, NEWLINE48_tree);
            	    }
            	    pushFollow(FOLLOW_sub1_in_ruleThen518);
            	    sub149=sub1();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, sub149.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:118:1: sub1 : (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ ;
    public final RuleGrammarParser.sub1_return sub1() throws RecognitionException {
        RuleGrammarParser.sub1_return retval = new RuleGrammarParser.sub1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set50=null;

        Object set50_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:119:5: ( (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:119:10: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:119:10: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULENAME && LA14_0<=COMMA)||(LA14_0>=INEQUALITY && LA14_0<=WS)||(LA14_0>=20 && LA14_0<=42)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:119:11: ~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE )
            	    {
            	    set50=(Token)input.LT(1);
            	    if ( (input.LA(1)>=RULENAME && input.LA(1)<=COMMA)||(input.LA(1)>=INEQUALITY && input.LA(1)<=WS)||(input.LA(1)>=20 && input.LA(1)<=42) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set50));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:121:1: sub2 : (~ ( NEWLINE | 'declare' | 'end' ) )+ ;
    public final RuleGrammarParser.sub2_return sub2() throws RecognitionException {
        RuleGrammarParser.sub2_return retval = new RuleGrammarParser.sub2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set51=null;

        Object set51_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:122:5: ( (~ ( NEWLINE | 'declare' | 'end' ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:122:10: (~ ( NEWLINE | 'declare' | 'end' ) )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:122:10: (~ ( NEWLINE | 'declare' | 'end' ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULENAME && LA15_0<=COMMA)||(LA15_0>=QUOTE && LA15_0<=18)||(LA15_0>=21 && LA15_0<=42)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:122:11: ~ ( NEWLINE | 'declare' | 'end' )
            	    {
            	    set51=(Token)input.LT(1);
            	    if ( (input.LA(1)>=RULENAME && input.LA(1)<=COMMA)||(input.LA(1)>=QUOTE && input.LA(1)<=18)||(input.LA(1)>=21 && input.LA(1)<=42) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set51));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:1: declAttribute : (~ ( NEWLINE | 'end' ) ) ;
    public final RuleGrammarParser.declAttribute_return declAttribute() throws RecognitionException {
        RuleGrammarParser.declAttribute_return retval = new RuleGrammarParser.declAttribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set52=null;

        Object set52_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:125:5: ( (~ ( NEWLINE | 'end' ) ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:125:10: (~ ( NEWLINE | 'end' ) )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:125:10: (~ ( NEWLINE | 'end' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:125:11: ~ ( NEWLINE | 'end' )
            {
            set52=(Token)input.LT(1);
            if ( (input.LA(1)>=RULENAME && input.LA(1)<=COMMA)||(input.LA(1)>=QUOTE && input.LA(1)<=18)||(input.LA(1)>=20 && input.LA(1)<=42) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set52));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:127:1: declAttributeType : ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double' );
    public final RuleGrammarParser.declAttributeType_return declAttributeType() throws RecognitionException {
        RuleGrammarParser.declAttributeType_return retval = new RuleGrammarParser.declAttributeType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set53=null;

        Object set53_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:128:5: ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            {
            root_0 = (Object)adaptor.nil();

            set53=(Token)input.LT(1);
            if ( (input.LA(1)>=28 && input.LA(1)<=34) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set53));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:130:1: ant_class : identifier ;
    public final RuleGrammarParser.ant_class_return ant_class() throws RecognitionException {
        RuleGrammarParser.ant_class_return retval = new RuleGrammarParser.ant_class_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.identifier_return identifier54 = null;



        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:131:5: ( identifier )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:131:10: identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_ant_class668);
            identifier54=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier54.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:135:1: pattern : lizy1+= expr_comma ( ',' lizy2+= expr_comma )* -> {$pattern::has && $lizy2.size() > 0}? ^( ',' ( $lizy1)+ BREAK ( $lizy2)+ ) -> {$pattern::has}? ^( ',' ( $lizy1)+ BREAK ) -> {$lizy1.size() == 0}? ^( COMMA BREAK ( $lizy2)+ ) -> ^( COMMA ( $lizy1)+ BREAK ) ;
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
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_expr_comma=new RewriteRuleSubtreeStream(adaptor,"rule expr_comma");

            ((pattern_scope)pattern_stack.peek()).has = false;
            ((pattern_scope)pattern_stack.peek()).usesBind = new LinkedList<Boolean>();
            ((pattern_scope)pattern_stack.peek()).numOfUses = 0;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:159:5: (lizy1+= expr_comma ( ',' lizy2+= expr_comma )* -> {$pattern::has && $lizy2.size() > 0}? ^( ',' ( $lizy1)+ BREAK ( $lizy2)+ ) -> {$pattern::has}? ^( ',' ( $lizy1)+ BREAK ) -> {$lizy1.size() == 0}? ^( COMMA BREAK ( $lizy2)+ ) -> ^( COMMA ( $lizy1)+ BREAK ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:159:9: lizy1+= expr_comma ( ',' lizy2+= expr_comma )*
            {
            pushFollow(FOLLOW_expr_comma_in_pattern695);
            lizy1=expr_comma();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expr_comma.add(lizy1.getTree());
            if (list_lizy1==null) list_lizy1=new ArrayList();
            list_lizy1.add(lizy1.getTree());

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:159:27: ( ',' lizy2+= expr_comma )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:159:28: ',' lizy2+= expr_comma
            	    {
            	    char_literal55=(Token)match(input,35,FOLLOW_35_in_pattern698); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_35.add(char_literal55);

            	    pushFollow(FOLLOW_expr_comma_in_pattern702);
            	    lizy2=expr_comma();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expr_comma.add(lizy2.getTree());
            	    if (list_lizy2==null) list_lizy2=new ArrayList();
            	    list_lizy2.add(lizy2.getTree());

            	    if ( state.backtracking==0 ) {
            	      ((pattern_scope)pattern_stack.peek()).has = true;
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {

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
                      
            }


            // AST REWRITE
            // elements: lizy1, 35, lizy2, lizy1, lizy1, lizy2, 35
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: lizy2, lizy1
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_lizy2=new RewriteRuleSubtreeStream(adaptor,"token lizy2",list_lizy2);
            RewriteRuleSubtreeStream stream_lizy1=new RewriteRuleSubtreeStream(adaptor,"token lizy1",list_lizy1);
            root_0 = (Object)adaptor.nil();
            // 194:5: -> {$pattern::has && $lizy2.size() > 0}? ^( ',' ( $lizy1)+ BREAK ( $lizy2)+ )
            if (((pattern_scope)pattern_stack.peek()).has && list_lizy2.size() > 0) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:194:47: ^( ',' ( $lizy1)+ BREAK ( $lizy2)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_35.nextNode(), root_1);

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
            else // 195:5: -> {$pattern::has}? ^( ',' ( $lizy1)+ BREAK )
            if (((pattern_scope)pattern_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:195:26: ^( ',' ( $lizy1)+ BREAK )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_35.nextNode(), root_1);

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
            else // 196:5: -> {$lizy1.size() == 0}? ^( COMMA BREAK ( $lizy2)+ )
            if (list_lizy1.size() == 0) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:196:31: ^( COMMA BREAK ( $lizy2)+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMA, "COMMA"), root_1);

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
            else // 197:5: -> ^( COMMA ( $lizy1)+ BREAK )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:197:9: ^( COMMA ( $lizy1)+ BREAK )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMA, "COMMA"), root_1);

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

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    public static class expr_comma_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_comma"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:199:1: expr_comma : expr_and ;
    public final RuleGrammarParser.expr_comma_return expr_comma() throws RecognitionException {
        RuleGrammarParser.expr_comma_return retval = new RuleGrammarParser.expr_comma_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.expr_and_return expr_and56 = null;




            //will be changed to true if a binding was indeed used
            ((pattern_scope)pattern_stack.peek()).usesBind.add(false);

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:204:5: ( expr_and )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:204:10: expr_and
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_and_in_expr_comma814);
            expr_and56=expr_and();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_and56.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "expr_comma"

    public static class expr_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_and"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:206:1: expr_and : expr_or ( '&&' expr_or )* ;
    public final RuleGrammarParser.expr_and_return expr_and() throws RecognitionException {
        RuleGrammarParser.expr_and_return retval = new RuleGrammarParser.expr_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal58=null;
        RuleGrammarParser.expr_or_return expr_or57 = null;

        RuleGrammarParser.expr_or_return expr_or59 = null;


        Object string_literal58_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:207:5: ( expr_or ( '&&' expr_or )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:207:9: expr_or ( '&&' expr_or )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_or_in_expr_and832);
            expr_or57=expr_or();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or57.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:207:17: ( '&&' expr_or )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:207:18: '&&' expr_or
            	    {
            	    string_literal58=(Token)match(input,36,FOLLOW_36_in_expr_and835); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal58_tree = (Object)adaptor.create(string_literal58);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal58_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_or_in_expr_and839);
            	    expr_or59=expr_or();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_or59.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "expr_and"

    public static class expr_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_or"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:209:1: expr_or : expr_bool_atom ( '||' expr_bool_atom )* ;
    public final RuleGrammarParser.expr_or_return expr_or() throws RecognitionException {
        RuleGrammarParser.expr_or_return retval = new RuleGrammarParser.expr_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal61=null;
        RuleGrammarParser.expr_bool_atom_return expr_bool_atom60 = null;

        RuleGrammarParser.expr_bool_atom_return expr_bool_atom62 = null;


        Object string_literal61_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:210:5: ( expr_bool_atom ( '||' expr_bool_atom )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:210:10: expr_bool_atom ( '||' expr_bool_atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_bool_atom_in_expr_or856);
            expr_bool_atom60=expr_bool_atom();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_bool_atom60.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:210:25: ( '||' expr_bool_atom )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:210:26: '||' expr_bool_atom
            	    {
            	    string_literal61=(Token)match(input,37,FOLLOW_37_in_expr_or859); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal61_tree = (Object)adaptor.create(string_literal61);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal61_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_bool_atom_in_expr_or863);
            	    expr_bool_atom62=expr_bool_atom();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_bool_atom62.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "expr_or"

    public static class expr_bool_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_bool_atom"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:213:1: expr_bool_atom : ( expr_ineq ( INEQUALITY expr_ineq )* | '(' expr_and ')' );
    public final RuleGrammarParser.expr_bool_atom_return expr_bool_atom() throws RecognitionException {
        RuleGrammarParser.expr_bool_atom_return retval = new RuleGrammarParser.expr_bool_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INEQUALITY64=null;
        Token char_literal66=null;
        Token char_literal68=null;
        RuleGrammarParser.expr_ineq_return expr_ineq63 = null;

        RuleGrammarParser.expr_ineq_return expr_ineq65 = null;

        RuleGrammarParser.expr_and_return expr_and67 = null;


        Object INEQUALITY64_tree=null;
        Object char_literal66_tree=null;
        Object char_literal68_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:5: ( expr_ineq ( INEQUALITY expr_ineq )* | '(' expr_and ')' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=INT && LA20_0<=ID)||LA20_0==42) ) {
                alt20=1;
            }
            else if ( (LA20_0==23) ) {
                int LA20_3 = input.LA(2);

                if ( (synpred38_RuleGrammar()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 3, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:9: expr_ineq ( INEQUALITY expr_ineq )*
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_expr_ineq_in_expr_bool_atom888);
                    expr_ineq63=expr_ineq();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_ineq63.getTree());
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:19: ( INEQUALITY expr_ineq )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==INEQUALITY) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:20: INEQUALITY expr_ineq
                    	    {
                    	    INEQUALITY64=(Token)match(input,INEQUALITY,FOLLOW_INEQUALITY_in_expr_bool_atom891); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    INEQUALITY64_tree = (Object)adaptor.create(INEQUALITY64);
                    	    root_0 = (Object)adaptor.becomeRoot(INEQUALITY64_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_expr_ineq_in_expr_bool_atom895);
                    	    expr_ineq65=expr_ineq();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_ineq65.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:215:9: '(' expr_and ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal66=(Token)match(input,23,FOLLOW_23_in_expr_bool_atom907); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_and_in_expr_bool_atom911);
                    expr_and67=expr_and();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_and67.getTree());
                    char_literal68=(Token)match(input,24,FOLLOW_24_in_expr_bool_atom913); if (state.failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "expr_bool_atom"

    public static class expr_ineq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_ineq"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:218:1: expr_ineq : expr_add_sub ( EQUALITY expr_add_sub )* ;
    public final RuleGrammarParser.expr_ineq_return expr_ineq() throws RecognitionException {
        RuleGrammarParser.expr_ineq_return retval = new RuleGrammarParser.expr_ineq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALITY70=null;
        RuleGrammarParser.expr_add_sub_return expr_add_sub69 = null;

        RuleGrammarParser.expr_add_sub_return expr_add_sub71 = null;


        Object EQUALITY70_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:219:5: ( expr_add_sub ( EQUALITY expr_add_sub )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:219:9: expr_add_sub ( EQUALITY expr_add_sub )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_add_sub_in_expr_ineq938);
            expr_add_sub69=expr_add_sub();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_add_sub69.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:219:22: ( EQUALITY expr_add_sub )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==EQUALITY) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:219:23: EQUALITY expr_add_sub
            	    {
            	    EQUALITY70=(Token)match(input,EQUALITY,FOLLOW_EQUALITY_in_expr_ineq941); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    EQUALITY70_tree = (Object)adaptor.create(EQUALITY70);
            	    root_0 = (Object)adaptor.becomeRoot(EQUALITY70_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expr_add_sub_in_expr_ineq945);
            	    expr_add_sub71=expr_add_sub();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_add_sub71.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // $ANTLR end "expr_ineq"

    public static class expr_add_sub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_add_sub"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:222:1: expr_add_sub : expr_mul_div ( ( '+' | '-' ) expr_mul_div )* ;
    public final RuleGrammarParser.expr_add_sub_return expr_add_sub() throws RecognitionException {
        RuleGrammarParser.expr_add_sub_return retval = new RuleGrammarParser.expr_add_sub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal73=null;
        Token char_literal74=null;
        RuleGrammarParser.expr_mul_div_return expr_mul_div72 = null;

        RuleGrammarParser.expr_mul_div_return expr_mul_div75 = null;


        Object char_literal73_tree=null;
        Object char_literal74_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:223:5: ( expr_mul_div ( ( '+' | '-' ) expr_mul_div )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:223:9: expr_mul_div ( ( '+' | '-' ) expr_mul_div )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub970);
            expr_mul_div72=expr_mul_div();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_mul_div72.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:223:22: ( ( '+' | '-' ) expr_mul_div )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=38 && LA23_0<=39)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:223:24: ( '+' | '-' ) expr_mul_div
            	    {
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:223:24: ( '+' | '-' )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==38) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==39) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:223:25: '+'
            	            {
            	            char_literal73=(Token)match(input,38,FOLLOW_38_in_expr_add_sub975); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal73_tree = (Object)adaptor.create(char_literal73);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal73_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:223:33: '-'
            	            {
            	            char_literal74=(Token)match(input,39,FOLLOW_39_in_expr_add_sub981); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal74_tree = (Object)adaptor.create(char_literal74);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal74_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub986);
            	    expr_mul_div75=expr_mul_div();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_mul_div75.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:226:1: expr_mul_div : expr_unary ( ( '*' | '/' ) expr_unary )* ;
    public final RuleGrammarParser.expr_mul_div_return expr_mul_div() throws RecognitionException {
        RuleGrammarParser.expr_mul_div_return retval = new RuleGrammarParser.expr_mul_div_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal77=null;
        Token char_literal78=null;
        RuleGrammarParser.expr_unary_return expr_unary76 = null;

        RuleGrammarParser.expr_unary_return expr_unary79 = null;


        Object char_literal77_tree=null;
        Object char_literal78_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:227:5: ( expr_unary ( ( '*' | '/' ) expr_unary )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:227:9: expr_unary ( ( '*' | '/' ) expr_unary )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_unary_in_expr_mul_div1011);
            expr_unary76=expr_unary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_unary76.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:227:20: ( ( '*' | '/' ) expr_unary )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=40 && LA25_0<=41)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:227:22: ( '*' | '/' ) expr_unary
            	    {
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:227:22: ( '*' | '/' )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==40) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==41) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:227:23: '*'
            	            {
            	            char_literal77=(Token)match(input,40,FOLLOW_40_in_expr_mul_div1016); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal77_tree = (Object)adaptor.create(char_literal77);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal77_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:227:31: '/'
            	            {
            	            char_literal78=(Token)match(input,41,FOLLOW_41_in_expr_mul_div1022); if (state.failed) return retval;
            	            if ( state.backtracking==0 ) {
            	            char_literal78_tree = (Object)adaptor.create(char_literal78);
            	            root_0 = (Object)adaptor.becomeRoot(char_literal78_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_expr_unary_in_expr_mul_div1027);
            	    expr_unary79=expr_unary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_unary79.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:230:1: expr_unary : ( ( '$' | '$' m1= identifier ':' )? m2= identifier -> {$expr_unary::binding}? ^( '$' $m1 ':' $m2) -> {$expr_unary::bound}? ^( '$' $m2) -> $m2 | '(' expr_add_sub ')' | INT );
    public final RuleGrammarParser.expr_unary_return expr_unary() throws RecognitionException {
        expr_unary_stack.push(new expr_unary_scope());
        RuleGrammarParser.expr_unary_return retval = new RuleGrammarParser.expr_unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal80=null;
        Token char_literal81=null;
        Token char_literal82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token INT86=null;
        RuleGrammarParser.identifier_return m1 = null;

        RuleGrammarParser.identifier_return m2 = null;

        RuleGrammarParser.expr_add_sub_return expr_add_sub84 = null;


        Object char_literal80_tree=null;
        Object char_literal81_tree=null;
        Object char_literal82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        Object INT86_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

            ((expr_unary_scope)expr_unary_stack.peek()).binding = false;
            ((expr_unary_scope)expr_unary_stack.peek()).bound = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:239:5: ( ( '$' | '$' m1= identifier ':' )? m2= identifier -> {$expr_unary::binding}? ^( '$' $m1 ':' $m2) -> {$expr_unary::bound}? ^( '$' $m2) -> $m2 | '(' expr_add_sub ')' | INT )
            int alt27=3;
            switch ( input.LA(1) ) {
            case ID:
            case 42:
                {
                alt27=1;
                }
                break;
            case 23:
                {
                alt27=2;
                }
                break;
            case INT:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:239:9: ( '$' | '$' m1= identifier ':' )? m2= identifier
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:239:9: ( '$' | '$' m1= identifier ':' )?
                    int alt26=3;
                    alt26 = dfa26.predict(input);
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:239:10: '$'
                            {
                            char_literal80=(Token)match(input,42,FOLLOW_42_in_expr_unary1062); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_42.add(char_literal80);

                            if ( state.backtracking==0 ) {
                              ((expr_unary_scope)expr_unary_stack.peek()).bound = true; ((pattern_scope)pattern_stack.peek()).usesBind.removeLast(); ((pattern_scope)pattern_stack.peek()).usesBind.add(true);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:239:108: '$' m1= identifier ':'
                            {
                            char_literal81=(Token)match(input,42,FOLLOW_42_in_expr_unary1068); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_42.add(char_literal81);

                            pushFollow(FOLLOW_identifier_in_expr_unary1072);
                            m1=identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(m1.getTree());
                            char_literal82=(Token)match(input,21,FOLLOW_21_in_expr_unary1074); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_21.add(char_literal82);

                            if ( state.backtracking==0 ) {

                                          ((expr_unary_scope)expr_unary_stack.peek()).binding = true;
                                          if (((rule_scope)rule_stack.peek()).bindings.contains((m1!=null?input.toString(m1.start,m1.stop):null)))
                                              System.err.println((m1!=null?input.toString(m1.start,m1.stop):null) + " was already bound to another variable.");
                                          else
                                          {
                                              ((rule_scope)rule_stack.peek()).bindings.add((m1!=null?input.toString(m1.start,m1.stop):null));
                                              ((ruleWhen_scope)ruleWhen_stack.peek()).bindings.add((m1!=null?input.toString(m1.start,m1.stop):null));
                                          }
                                      
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_expr_unary1099);
                    m2=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(m2.getTree());
                    if ( state.backtracking==0 ) {

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
                              
                    }


                    // AST REWRITE
                    // elements: 42, 42, m2, m2, m2, m1, 21
                    // token labels: 
                    // rule labels: retval, m1, m2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"rule m1",m1!=null?m1.tree:null);
                    RewriteRuleSubtreeStream stream_m2=new RewriteRuleSubtreeStream(adaptor,"rule m2",m2!=null?m2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 263:5: -> {$expr_unary::binding}? ^( '$' $m1 ':' $m2)
                    if (((expr_unary_scope)expr_unary_stack.peek()).binding) {
                        // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:263:33: ^( '$' $m1 ':' $m2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_42.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_m1.nextTree());
                        adaptor.addChild(root_1, stream_21.nextNode());
                        adaptor.addChild(root_1, stream_m2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 264:5: -> {$expr_unary::bound}? ^( '$' $m2)
                    if (((expr_unary_scope)expr_unary_stack.peek()).bound) {
                        // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:264:31: ^( '$' $m2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_42.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_m2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 265:5: -> $m2
                    {
                        adaptor.addChild(root_0, stream_m2.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:266:9: '(' expr_add_sub ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal83=(Token)match(input,23,FOLLOW_23_in_expr_unary1166); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_add_sub_in_expr_unary1170);
                    expr_add_sub84=expr_add_sub();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expr_add_sub84.getTree());
                    char_literal85=(Token)match(input,24,FOLLOW_24_in_expr_unary1172); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:267:9: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT86=(Token)match(input,INT,FOLLOW_INT_in_expr_unary1184); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INT86_tree = (Object)adaptor.create(INT86);
                    adaptor.addChild(root_0, INT86_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:270:1: identifier : ID ( ID | INT )* ;
    public final RuleGrammarParser.identifier_return identifier() throws RecognitionException {
        RuleGrammarParser.identifier_return retval = new RuleGrammarParser.identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID87=null;
        Token set88=null;

        Object ID87_tree=null;
        Object set88_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:271:5: ( ID ( ID | INT )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:271:10: ID ( ID | INT )*
            {
            root_0 = (Object)adaptor.nil();

            ID87=(Token)match(input,ID,FOLLOW_ID_in_identifier1204); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID87_tree = (Object)adaptor.create(ID87);
            adaptor.addChild(root_0, ID87_tree);
            }
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:271:13: ( ID | INT )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=INT && LA28_0<=ID)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            	    {
            	    set88=(Token)input.LT(1);
            	    if ( (input.LA(1)>=INT && input.LA(1)<=ID) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set88));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
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

    // $ANTLR start synpred38_RuleGrammar
    public final void synpred38_RuleGrammar_fragment() throws RecognitionException {   
        // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:9: ( expr_ineq ( INEQUALITY expr_ineq )* )
        // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:9: expr_ineq ( INEQUALITY expr_ineq )*
        {
        pushFollow(FOLLOW_expr_ineq_in_synpred38_RuleGrammar888);
        expr_ineq();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:19: ( INEQUALITY expr_ineq )*
        loop29:
        do {
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==INEQUALITY) ) {
                alt29=1;
            }


            switch (alt29) {
        	case 1 :
        	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:214:20: INEQUALITY expr_ineq
        	    {
        	    match(input,INEQUALITY,FOLLOW_INEQUALITY_in_synpred38_RuleGrammar891); if (state.failed) return ;
        	    pushFollow(FOLLOW_expr_ineq_in_synpred38_RuleGrammar895);
        	    expr_ineq();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop29;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred38_RuleGrammar

    // Delegated rules

    public final boolean synpred38_RuleGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_RuleGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA26_eotS =
        "\7\uffff";
    static final String DFA26_eofS =
        "\3\uffff\2\5\2\uffff";
    static final String DFA26_minS =
        "\2\15\1\uffff\2\12\2\uffff";
    static final String DFA26_maxS =
        "\1\52\1\15\1\uffff\2\51\2\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\3\2\uffff\1\1\1\2";
    static final String DFA26_specialS =
        "\7\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\34\uffff\1\1",
            "\1\3",
            "",
            "\2\5\2\4\7\uffff\1\6\2\uffff\1\5\12\uffff\7\5",
            "\2\5\2\4\7\uffff\1\6\2\uffff\1\5\12\uffff\7\5",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "239:9: ( '$' | '$' m1= identifier ':' )?";
        }
    }
 

    public static final BitSet FOLLOW_rule_in_prog113 = new BitSet(new long[]{0x0000000000110102L});
    public static final BitSet FOLLOW_decl_in_prog117 = new BitSet(new long[]{0x0000000000110102L});
    public static final BitSet FOLLOW_NEWLINE_in_prog123 = new BitSet(new long[]{0x0000000000110102L});
    public static final BitSet FOLLOW_16_in_rule152 = new BitSet(new long[]{0x000007FFFFF0FEF0L});
    public static final BitSet FOLLOW_ruleName_in_rule154 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_rule156 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rule158 = new BitSet(new long[]{0x0000000000402100L});
    public static final BitSet FOLLOW_ruleWhen_in_rule160 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_NEWLINE_in_rule162 = new BitSet(new long[]{0x0000000000040100L});
    public static final BitSet FOLLOW_18_in_rule165 = new BitSet(new long[]{0x000007FFFFF0FCF0L});
    public static final BitSet FOLLOW_ruleThen_in_rule167 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_NEWLINE_in_rule169 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_19_in_rule172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_decl221 = new BitSet(new long[]{0x000007FFFFE7FEF0L});
    public static final BitSet FOLLOW_declName_in_decl223 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NEWLINE_in_decl225 = new BitSet(new long[]{0x000007FFFFF7FEF0L});
    public static final BitSet FOLLOW_declMember_in_decl229 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_NEWLINE_in_decl234 = new BitSet(new long[]{0x000007FFFFF7FEF0L});
    public static final BitSet FOLLOW_declMember_in_decl238 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_NEWLINE_in_decl244 = new BitSet(new long[]{0x0000000000080100L});
    public static final BitSet FOLLOW_19_in_decl247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub2_in_declName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttribute_in_declMember293 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_declMember295 = new BitSet(new long[]{0x00000007F0000000L});
    public static final BitSet FOLLOW_declAttributeType_in_declMember297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub1_in_ruleName315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName320 = new BitSet(new long[]{0x000007FFFFF0FCF0L});
    public static final BitSet FOLLOW_sub1_in_ruleName322 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhen358 = new BitSet(new long[]{0x0000000000402100L});
    public static final BitSet FOLLOW_ruleWhen1_in_ruleWhen361 = new BitSet(new long[]{0x000000000C402102L});
    public static final BitSet FOLLOW_ruleWhenK_in_ruleWhen363 = new BitSet(new long[]{0x000000000C402102L});
    public static final BitSet FOLLOW_22_in_ruleWhen1406 = new BitSet(new long[]{0x0000000000402100L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhen1410 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleWhen1414 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_pattern_in_ruleWhen1416 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleWhen1418 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhen1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleWhen1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleWhenK461 = new BitSet(new long[]{0x0000000000402100L});
    public static final BitSet FOLLOW_27_in_ruleWhenK465 = new BitSet(new long[]{0x0000000000402100L});
    public static final BitSet FOLLOW_22_in_ruleWhenK469 = new BitSet(new long[]{0x0000000000402100L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhenK473 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleWhenK477 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_pattern_in_ruleWhenK479 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleWhenK481 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhenK484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleWhenK488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub1_in_ruleThen513 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleThen516 = new BitSet(new long[]{0x000007FFFFF0FCF0L});
    public static final BitSet FOLLOW_sub1_in_ruleThen518 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_set_in_sub1536 = new BitSet(new long[]{0x000007FFFFF0FCF2L});
    public static final BitSet FOLLOW_set_in_sub2577 = new BitSet(new long[]{0x000007FFFFE7FEF2L});
    public static final BitSet FOLLOW_set_in_declAttribute606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declAttributeType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_ant_class668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_comma_in_pattern695 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_pattern698 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_expr_comma_in_pattern702 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_expr_and_in_expr_comma814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_in_expr_and832 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_expr_and835 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_expr_or_in_expr_and839 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_expr_bool_atom_in_expr_or856 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_expr_or859 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_expr_bool_atom_in_expr_or863 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_expr_ineq_in_expr_bool_atom888 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INEQUALITY_in_expr_bool_atom891 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_expr_ineq_in_expr_bool_atom895 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_23_in_expr_bool_atom907 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_expr_and_in_expr_bool_atom911 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_expr_bool_atom913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_ineq938 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_EQUALITY_in_expr_ineq941 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_ineq945 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub970 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_38_in_expr_add_sub975 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_39_in_expr_add_sub981 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub986 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_expr_unary_in_expr_mul_div1011 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_40_in_expr_mul_div1016 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_41_in_expr_mul_div1022 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_expr_unary_in_expr_mul_div1027 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_42_in_expr_unary1062 = new BitSet(new long[]{0x0000000000402100L});
    public static final BitSet FOLLOW_42_in_expr_unary1068 = new BitSet(new long[]{0x0000000000402100L});
    public static final BitSet FOLLOW_identifier_in_expr_unary1072 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_expr_unary1074 = new BitSet(new long[]{0x0000000000402100L});
    public static final BitSet FOLLOW_identifier_in_expr_unary1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_expr_unary1166 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_unary1170 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_expr_unary1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr_unary1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier1204 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_set_in_identifier1206 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_expr_ineq_in_synpred38_RuleGrammar888 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INEQUALITY_in_synpred38_RuleGrammar891 = new BitSet(new long[]{0x0000040000C03100L});
    public static final BitSet FOLLOW_expr_ineq_in_synpred38_RuleGrammar895 = new BitSet(new long[]{0x0000000000000402L});

}