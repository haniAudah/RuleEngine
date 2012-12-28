// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g 2012-12-28 20:08:02

	package parser;
	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RuleGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULENAME", "RULEWHEN", "NEWLINE", "QUOTE", "EQUALITY", "INEQUALITY", "INT", "ID", "WS", "'rule'", "'when'", "'then'", "'end'", "'//'", "'declare'", "':'", "'not'", "'('", "')'", "';'", "'and'", "'or'", "'String'", "'Integer'", "'int'", "'long'", "'Decimal'", "'Char'", "'double'", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'!'"
    };
    public static final int EOF=-1;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int RULENAME=4;
    public static final int RULEWHEN=5;
    public static final int NEWLINE=6;
    public static final int QUOTE=7;
    public static final int EQUALITY=8;
    public static final int INEQUALITY=9;
    public static final int INT=10;
    public static final int ID=11;
    public static final int WS=12;

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
    	//ArrayList classList = new ArrayList();


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:29:1: prog : ( rule | comment | decl | NEWLINE )+ ;
    public final RuleGrammarParser.prog_return prog() throws RecognitionException {
        RuleGrammarParser.prog_return retval = new RuleGrammarParser.prog_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE4=null;
        RuleGrammarParser.rule_return rule1 = null;

        RuleGrammarParser.comment_return comment2 = null;

        RuleGrammarParser.decl_return decl3 = null;


        Object NEWLINE4_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:30:2: ( ( rule | comment | decl | NEWLINE )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:30:4: ( rule | comment | decl | NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:30:4: ( rule | comment | decl | NEWLINE )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt1=1;
                    }
                    break;
                case 17:
                    {
                    alt1=2;
                    }
                    break;
                case 18:
                    {
                    alt1=3;
                    }
                    break;
                case NEWLINE:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:30:5: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_prog69);
            	    rule1=rule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rule1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:30:12: comment
            	    {
            	    pushFollow(FOLLOW_comment_in_prog73);
            	    comment2=comment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comment2.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:30:22: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_prog77);
            	    decl3=decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:30:31: NEWLINE
            	    {
            	    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_prog83); 

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

    public static class rule_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rule"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:34:1: rule : 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' -> ^( 'rule' ruleName ruleWhen 'then' ) ;
    public final RuleGrammarParser.rule_return rule() throws RecognitionException {
        RuleGrammarParser.rule_return retval = new RuleGrammarParser.rule_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token NEWLINE7=null;
        Token string_literal8=null;
        Token NEWLINE10=null;
        Token string_literal11=null;
        Token NEWLINE13=null;
        Token string_literal14=null;
        RuleGrammarParser.ruleName_return ruleName6 = null;

        RuleGrammarParser.ruleWhen_return ruleWhen9 = null;

        RuleGrammarParser.ruleThen_return ruleThen12 = null;


        Object string_literal5_tree=null;
        Object NEWLINE7_tree=null;
        Object string_literal8_tree=null;
        Object NEWLINE10_tree=null;
        Object string_literal11_tree=null;
        Object NEWLINE13_tree=null;
        Object string_literal14_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_ruleName=new RewriteRuleSubtreeStream(adaptor,"rule ruleName");
        RewriteRuleSubtreeStream stream_ruleThen=new RewriteRuleSubtreeStream(adaptor,"rule ruleThen");
        RewriteRuleSubtreeStream stream_ruleWhen=new RewriteRuleSubtreeStream(adaptor,"rule ruleWhen");
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:35:2: ( 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' -> ^( 'rule' ruleName ruleWhen 'then' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:35:4: 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end'
            {
            string_literal5=(Token)match(input,13,FOLLOW_13_in_rule97);  
            stream_13.add(string_literal5);

            pushFollow(FOLLOW_ruleName_in_rule99);
            ruleName6=ruleName();

            state._fsp--;

            stream_ruleName.add(ruleName6.getTree());
            NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule101);  
            stream_NEWLINE.add(NEWLINE7);

            string_literal8=(Token)match(input,14,FOLLOW_14_in_rule103);  
            stream_14.add(string_literal8);

            pushFollow(FOLLOW_ruleWhen_in_rule105);
            ruleWhen9=ruleWhen();

            state._fsp--;

            stream_ruleWhen.add(ruleWhen9.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:35:44: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:35:44: NEWLINE
            	    {
            	    NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule107);  
            	    stream_NEWLINE.add(NEWLINE10);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            string_literal11=(Token)match(input,15,FOLLOW_15_in_rule110);  
            stream_15.add(string_literal11);

            pushFollow(FOLLOW_ruleThen_in_rule112);
            ruleThen12=ruleThen();

            state._fsp--;

            stream_ruleThen.add(ruleThen12.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:35:69: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:35:69: NEWLINE
            	    {
            	    NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule114);  
            	    stream_NEWLINE.add(NEWLINE13);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            string_literal14=(Token)match(input,16,FOLLOW_16_in_rule117);  
            stream_16.add(string_literal14);


            	 		if (ruleTable.get((ruleName6!=null?input.toString(ruleName6.start,ruleName6.stop):null)) != null)
            	 		{
            	 			System.err.println("Attempting to redefine rule " + (ruleName6!=null?input.toString(ruleName6.start,ruleName6.stop):null) + " at line " + (((Token)retval.start)).getLine());
            	 		}
            	 		else
            	 		{
            	 			ruleTable.put((ruleName6!=null?input.toString(ruleName6.start,ruleName6.stop):null), "bla");
            	 			//TODO Decide on how you want to store the rule
            	 		}
             		


            // AST REWRITE
            // elements: ruleWhen, 15, ruleName, 13
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 46:6: -> ^( 'rule' ruleName ruleWhen 'then' )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:46:9: ^( 'rule' ruleName ruleWhen 'then' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_13.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ruleName.nextTree());
                adaptor.addChild(root_1, stream_ruleWhen.nextTree());
                adaptor.addChild(root_1, stream_15.nextNode());

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
    // $ANTLR end "rule"

    public static class comment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comment"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:48:1: comment : '//' ( . )* NEWLINE ;
    public final RuleGrammarParser.comment_return comment() throws RecognitionException {
        RuleGrammarParser.comment_return retval = new RuleGrammarParser.comment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal15=null;
        Token wildcard16=null;
        Token NEWLINE17=null;

        Object string_literal15_tree=null;
        Object wildcard16_tree=null;
        Object NEWLINE17_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:49:2: ( '//' ( . )* NEWLINE )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:49:4: '//' ( . )* NEWLINE
            {
            root_0 = (Object)adaptor.nil();

            string_literal15=(Token)match(input,17,FOLLOW_17_in_comment143); 
            string_literal15_tree = (Object)adaptor.create(string_literal15);
            adaptor.addChild(root_0, string_literal15_tree);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:49:9: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=2;
                }
                else if ( ((LA4_0>=RULENAME && LA4_0<=RULEWHEN)||(LA4_0>=QUOTE && LA4_0<=39)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:49:9: .
            	    {
            	    wildcard16=(Token)input.LT(1);
            	    matchAny(input); 
            	    wildcard16_tree = (Object)adaptor.create(wildcard16);
            	    adaptor.addChild(root_0, wildcard16_tree);


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comment148); 
            NEWLINE17_tree = (Object)adaptor.create(NEWLINE17);
            adaptor.addChild(root_0, NEWLINE17_tree);


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
    // $ANTLR end "comment"

    protected static class decl_scope {
        HashMap newClass;
    }
    protected Stack decl_stack = new Stack();

    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "decl"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:53:1: decl : 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end' ;
    public final RuleGrammarParser.decl_return decl() throws RecognitionException {
        decl_stack.push(new decl_scope());
        RuleGrammarParser.decl_return retval = new RuleGrammarParser.decl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal18=null;
        Token NEWLINE20=null;
        Token NEWLINE21=null;
        Token NEWLINE22=null;
        Token string_literal23=null;
        RuleGrammarParser.declMember_return d = null;

        RuleGrammarParser.declName_return declName19 = null;


        Object string_literal18_tree=null;
        Object NEWLINE20_tree=null;
        Object NEWLINE21_tree=null;
        Object NEWLINE22_tree=null;
        Object string_literal23_tree=null;


        	((decl_scope)decl_stack.peek()).newClass = new HashMap();

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:60:2: ( 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:60:4: 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal18=(Token)match(input,18,FOLLOW_18_in_decl168); 
            string_literal18_tree = (Object)adaptor.create(string_literal18);
            adaptor.addChild(root_0, string_literal18_tree);

            pushFollow(FOLLOW_declName_in_decl170);
            declName19=declName();

            state._fsp--;

            adaptor.addChild(root_0, declName19.getTree());
            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl172); 
            NEWLINE20_tree = (Object)adaptor.create(NEWLINE20);
            adaptor.addChild(root_0, NEWLINE20_tree);

            pushFollow(FOLLOW_declMember_in_decl176);
            d=declMember();

            state._fsp--;

            adaptor.addChild(root_0, d.getTree());
            ((decl_scope)decl_stack.peek()).newClass.put((d!=null?d.attr:null), (d!=null?d.type:null));
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:60:85: ( NEWLINE d= declMember )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    int LA5_1 = input.LA(2);

                    if ( ((LA5_1>=RULENAME && LA5_1<=RULEWHEN)||(LA5_1>=QUOTE && LA5_1<=15)||(LA5_1>=17 && LA5_1<=39)) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:60:86: NEWLINE d= declMember
            	    {
            	    NEWLINE21=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl181); 
            	    NEWLINE21_tree = (Object)adaptor.create(NEWLINE21);
            	    adaptor.addChild(root_0, NEWLINE21_tree);

            	    pushFollow(FOLLOW_declMember_in_decl185);
            	    d=declMember();

            	    state._fsp--;

            	    adaptor.addChild(root_0, d.getTree());
            	    ((decl_scope)decl_stack.peek()).newClass.put((d!=null?d.attr:null), (d!=null?d.type:null));

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:60:150: ( NEWLINE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:60:150: NEWLINE
            	    {
            	    NEWLINE22=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl191); 
            	    NEWLINE22_tree = (Object)adaptor.create(NEWLINE22);
            	    adaptor.addChild(root_0, NEWLINE22_tree);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            string_literal23=(Token)match(input,16,FOLLOW_16_in_decl194); 
            string_literal23_tree = (Object)adaptor.create(string_literal23);
            adaptor.addChild(root_0, string_literal23_tree);


            	 		if (classTable.get((declName19!=null?input.toString(declName19.start,declName19.stop):null)) != null)
            	 		{
            	 			System.err.println("Attempting to redefine class " + (declName19!=null?input.toString(declName19.start,declName19.stop):null) + " at line " + (((Token)retval.start)).getLine());
             			}
             			else
             			{
             				classTable.put((declName19!=null?input.toString(declName19.start,declName19.stop):null), ((decl_scope)decl_stack.peek()).newClass);
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:73:1: declName : sub2 ;
    public final RuleGrammarParser.declName_return declName() throws RecognitionException {
        RuleGrammarParser.declName_return retval = new RuleGrammarParser.declName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.sub2_return sub224 = null;



        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:2: ( sub2 )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:4: sub2
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sub2_in_declName209);
            sub224=sub2();

            state._fsp--;

            adaptor.addChild(root_0, sub224.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:76:1: declMember returns [String attr, String type] : declAttribute ':' declAttributeType ;
    public final RuleGrammarParser.declMember_return declMember() throws RecognitionException {
        RuleGrammarParser.declMember_return retval = new RuleGrammarParser.declMember_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        RuleGrammarParser.declAttribute_return declAttribute25 = null;

        RuleGrammarParser.declAttributeType_return declAttributeType27 = null;


        Object char_literal26_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:2: ( declAttribute ':' declAttributeType )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:4: declAttribute ':' declAttributeType
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declAttribute_in_declMember222);
            declAttribute25=declAttribute();

            state._fsp--;

            adaptor.addChild(root_0, declAttribute25.getTree());
            char_literal26=(Token)match(input,19,FOLLOW_19_in_declMember224); 
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);

            pushFollow(FOLLOW_declAttributeType_in_declMember226);
            declAttributeType27=declAttributeType();

            state._fsp--;

            adaptor.addChild(root_0, declAttributeType27.getTree());
            retval.attr = (declAttribute25!=null?input.toString(declAttribute25.start,declAttribute25.stop):null); retval.type = (declAttributeType27!=null?input.toString(declAttributeType27.start,declAttributeType27.stop):null);

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:79:1: ruleName : ( sub1 | ( QUOTE sub1 QUOTE ) ) -> ^( RULENAME sub1 ) ;
    public final RuleGrammarParser.ruleName_return ruleName() throws RecognitionException {
        RuleGrammarParser.ruleName_return retval = new RuleGrammarParser.ruleName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QUOTE29=null;
        Token QUOTE31=null;
        RuleGrammarParser.sub1_return sub128 = null;

        RuleGrammarParser.sub1_return sub130 = null;


        Object QUOTE29_tree=null;
        Object QUOTE31_tree=null;
        RewriteRuleTokenStream stream_QUOTE=new RewriteRuleTokenStream(adaptor,"token QUOTE");
        RewriteRuleSubtreeStream stream_sub1=new RewriteRuleSubtreeStream(adaptor,"rule sub1");
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:2: ( ( sub1 | ( QUOTE sub1 QUOTE ) ) -> ^( RULENAME sub1 ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:4: ( sub1 | ( QUOTE sub1 QUOTE ) )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:4: ( sub1 | ( QUOTE sub1 QUOTE ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULENAME && LA7_0<=RULEWHEN)||(LA7_0>=EQUALITY && LA7_0<=WS)||(LA7_0>=17 && LA7_0<=39)) ) {
                alt7=1;
            }
            else if ( (LA7_0==QUOTE) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:5: sub1
                    {
                    pushFollow(FOLLOW_sub1_in_ruleName238);
                    sub128=sub1();

                    state._fsp--;

                    stream_sub1.add(sub128.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:12: ( QUOTE sub1 QUOTE )
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:12: ( QUOTE sub1 QUOTE )
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:13: QUOTE sub1 QUOTE
                    {
                    QUOTE29=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName243);  
                    stream_QUOTE.add(QUOTE29);

                    pushFollow(FOLLOW_sub1_in_ruleName245);
                    sub130=sub1();

                    state._fsp--;

                    stream_sub1.add(sub130.getTree());
                    QUOTE31=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName247);  
                    stream_QUOTE.add(QUOTE31);


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
            // 80:32: -> ^( RULENAME sub1 )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:35: ^( RULENAME sub1 )
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
    }
    protected Stack ruleWhen_stack = new Stack();

    public static class ruleWhen_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleWhen"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:82:1: ruleWhen : ( NEWLINE )* ruleWhen1 ( ruleWhenK )* -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* ) ;
    public final RuleGrammarParser.ruleWhen_return ruleWhen() throws RecognitionException {
        ruleWhen_stack.push(new ruleWhen_scope());
        RuleGrammarParser.ruleWhen_return retval = new RuleGrammarParser.ruleWhen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE32=null;
        RuleGrammarParser.ruleWhen1_return ruleWhen133 = null;

        RuleGrammarParser.ruleWhenK_return ruleWhenK34 = null;


        Object NEWLINE32_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleSubtreeStream stream_ruleWhenK=new RewriteRuleSubtreeStream(adaptor,"rule ruleWhenK");
        RewriteRuleSubtreeStream stream_ruleWhen1=new RewriteRuleSubtreeStream(adaptor,"rule ruleWhen1");
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:2: ( ( NEWLINE )* ruleWhen1 ( ruleWhenK )* -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:4: ( NEWLINE )* ruleWhen1 ( ruleWhenK )*
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:4: ( NEWLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==NEWLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:4: NEWLINE
            	    {
            	    NEWLINE32=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhen272);  
            	    stream_NEWLINE.add(NEWLINE32);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            pushFollow(FOLLOW_ruleWhen1_in_ruleWhen275);
            ruleWhen133=ruleWhen1();

            state._fsp--;

            stream_ruleWhen1.add(ruleWhen133.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:23: ( ruleWhenK )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||LA9_0==20||(LA9_0>=24 && LA9_0<=25)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:23: ruleWhenK
            	    {
            	    pushFollow(FOLLOW_ruleWhenK_in_ruleWhen277);
            	    ruleWhenK34=ruleWhenK();

            	    state._fsp--;

            	    stream_ruleWhenK.add(ruleWhenK34.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // 87:34: -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:37: ^( RULEWHEN ruleWhen1 ( ruleWhenK )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RULEWHEN, "RULEWHEN"), root_1);

                adaptor.addChild(root_1, stream_ruleWhen1.nextTree());
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:58: ( ruleWhenK )*
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:89:1: ruleWhen1 : ( 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) -> ^( ant_class pattern ) ;
    public final RuleGrammarParser.ruleWhen1_return ruleWhen1() throws RecognitionException {
        RuleGrammarParser.ruleWhen1_return retval = new RuleGrammarParser.ruleWhen1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal35=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token NEWLINE40=null;
        Token char_literal41=null;
        RuleGrammarParser.ant_class_return ant_class36 = null;

        RuleGrammarParser.pattern_return pattern38 = null;


        Object string_literal35_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object NEWLINE40_tree=null;
        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_ant_class=new RewriteRuleSubtreeStream(adaptor,"rule ant_class");
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:91:2: ( ( 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) -> ^( ant_class pattern ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:91:4: ( 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:91:4: ( 'not' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:91:5: 'not'
                    {
                    string_literal35=(Token)match(input,20,FOLLOW_20_in_ruleWhen1301);  
                    stream_20.add(string_literal35);


                    }
                    break;

            }

            pushFollow(FOLLOW_ant_class_in_ruleWhen1305);
            ant_class36=ant_class();

            state._fsp--;

            stream_ant_class.add(ant_class36.getTree());
            ((ruleWhen_scope)ruleWhen_stack.peek()).declName = (ant_class36!=null?input.toString(ant_class36.start,ant_class36.stop):null);
            char_literal37=(Token)match(input,21,FOLLOW_21_in_ruleWhen1309);  
            stream_21.add(char_literal37);

            pushFollow(FOLLOW_pattern_in_ruleWhen1311);
            pattern38=pattern();

            state._fsp--;

            stream_pattern.add(pattern38.getTree());
            char_literal39=(Token)match(input,22,FOLLOW_22_in_ruleWhen1313);  
            stream_22.add(char_literal39);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:91:80: ( NEWLINE | ';' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NEWLINE) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:91:81: NEWLINE
                    {
                    NEWLINE40=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhen1316);  
                    stream_NEWLINE.add(NEWLINE40);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:91:91: ';'
                    {
                    char_literal41=(Token)match(input,23,FOLLOW_23_in_ruleWhen1320);  
                    stream_23.add(char_literal41);


                    }
                    break;

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
            // 91:96: -> ^( ant_class pattern )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:91:99: ^( ant_class pattern )
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:93:1: ruleWhenK : ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ) -> ^( ant_class pattern ) ;
    public final RuleGrammarParser.ruleWhenK_return ruleWhenK() throws RecognitionException {
        RuleGrammarParser.ruleWhenK_return retval = new RuleGrammarParser.ruleWhenK_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal42=null;
        Token string_literal43=null;
        Token string_literal44=null;
        Token char_literal46=null;
        Token char_literal48=null;
        Token NEWLINE49=null;
        Token char_literal50=null;
        RuleGrammarParser.ant_class_return ant_class45 = null;

        RuleGrammarParser.pattern_return pattern47 = null;


        Object string_literal42_tree=null;
        Object string_literal43_tree=null;
        Object string_literal44_tree=null;
        Object char_literal46_tree=null;
        Object char_literal48_tree=null;
        Object NEWLINE49_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_ant_class=new RewriteRuleSubtreeStream(adaptor,"rule ant_class");
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:2: ( ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ) -> ^( ant_class pattern ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:4: ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:4: ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:5: ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:5: ( 'and' | 'or' | 'not' )?
            int alt12=4;
            switch ( input.LA(1) ) {
                case 24:
                    {
                    alt12=1;
                    }
                    break;
                case 25:
                    {
                    alt12=2;
                    }
                    break;
                case 20:
                    {
                    alt12=3;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:6: 'and'
                    {
                    string_literal42=(Token)match(input,24,FOLLOW_24_in_ruleWhenK342);  
                    stream_24.add(string_literal42);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:14: 'or'
                    {
                    string_literal43=(Token)match(input,25,FOLLOW_25_in_ruleWhenK346);  
                    stream_25.add(string_literal43);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:21: 'not'
                    {
                    string_literal44=(Token)match(input,20,FOLLOW_20_in_ruleWhenK350);  
                    stream_20.add(string_literal44);


                    }
                    break;

            }

            pushFollow(FOLLOW_ant_class_in_ruleWhenK354);
            ant_class45=ant_class();

            state._fsp--;

            stream_ant_class.add(ant_class45.getTree());
            ((ruleWhen_scope)ruleWhen_stack.peek()).declName = (ant_class45!=null?input.toString(ant_class45.start,ant_class45.stop):null);
            char_literal46=(Token)match(input,21,FOLLOW_21_in_ruleWhenK358);  
            stream_21.add(char_literal46);

            pushFollow(FOLLOW_pattern_in_ruleWhenK360);
            pattern47=pattern();

            state._fsp--;

            stream_pattern.add(pattern47.getTree());
            char_literal48=(Token)match(input,22,FOLLOW_22_in_ruleWhenK362);  
            stream_22.add(char_literal48);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:96: ( NEWLINE | ';' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NEWLINE) ) {
                alt13=1;
            }
            else if ( (LA13_0==23) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:97: NEWLINE
                    {
                    NEWLINE49=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhenK365);  
                    stream_NEWLINE.add(NEWLINE49);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:107: ';'
                    {
                    char_literal50=(Token)match(input,23,FOLLOW_23_in_ruleWhenK369);  
                    stream_23.add(char_literal50);


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
            // 95:113: -> ^( ant_class pattern )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:116: ^( ant_class pattern )
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:97:1: ruleThen : sub1 ( NEWLINE sub1 )* ;
    public final RuleGrammarParser.ruleThen_return ruleThen() throws RecognitionException {
        RuleGrammarParser.ruleThen_return retval = new RuleGrammarParser.ruleThen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE52=null;
        RuleGrammarParser.sub1_return sub151 = null;

        RuleGrammarParser.sub1_return sub153 = null;


        Object NEWLINE52_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:2: ( sub1 ( NEWLINE sub1 )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:4: sub1 ( NEWLINE sub1 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sub1_in_ruleThen388);
            sub151=sub1();

            state._fsp--;

            adaptor.addChild(root_0, sub151.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:9: ( NEWLINE sub1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==NEWLINE) ) {
                    int LA14_1 = input.LA(2);

                    if ( ((LA14_1>=RULENAME && LA14_1<=RULEWHEN)||(LA14_1>=EQUALITY && LA14_1<=WS)||(LA14_1>=17 && LA14_1<=39)) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:10: NEWLINE sub1
            	    {
            	    NEWLINE52=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleThen391); 
            	    NEWLINE52_tree = (Object)adaptor.create(NEWLINE52);
            	    adaptor.addChild(root_0, NEWLINE52_tree);

            	    pushFollow(FOLLOW_sub1_in_ruleThen393);
            	    sub153=sub1();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sub153.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:100:1: sub1 : (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ ;
    public final RuleGrammarParser.sub1_return sub1() throws RecognitionException {
        RuleGrammarParser.sub1_return retval = new RuleGrammarParser.sub1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set54=null;

        Object set54_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:101:2: ( (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:101:4: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:101:4: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULENAME && LA15_0<=RULEWHEN)||(LA15_0>=EQUALITY && LA15_0<=WS)||(LA15_0>=17 && LA15_0<=39)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:101:5: ~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE )
            	    {
            	    set54=(Token)input.LT(1);
            	    if ( (input.LA(1)>=RULENAME && input.LA(1)<=RULEWHEN)||(input.LA(1)>=EQUALITY && input.LA(1)<=WS)||(input.LA(1)>=17 && input.LA(1)<=39) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set54));
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
    // $ANTLR end "sub1"

    public static class sub2_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sub2"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:103:1: sub2 : (~ ( NEWLINE | 'declare' | 'end' ) )+ ;
    public final RuleGrammarParser.sub2_return sub2() throws RecognitionException {
        RuleGrammarParser.sub2_return retval = new RuleGrammarParser.sub2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set55=null;

        Object set55_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:104:2: ( (~ ( NEWLINE | 'declare' | 'end' ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:104:4: (~ ( NEWLINE | 'declare' | 'end' ) )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:104:4: (~ ( NEWLINE | 'declare' | 'end' ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULENAME && LA16_0<=RULEWHEN)||(LA16_0>=QUOTE && LA16_0<=15)||LA16_0==17||(LA16_0>=19 && LA16_0<=39)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:104:5: ~ ( NEWLINE | 'declare' | 'end' )
            	    {
            	    set55=(Token)input.LT(1);
            	    if ( (input.LA(1)>=RULENAME && input.LA(1)<=RULEWHEN)||(input.LA(1)>=QUOTE && input.LA(1)<=15)||input.LA(1)==17||(input.LA(1)>=19 && input.LA(1)<=39) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set55));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:106:1: declAttribute : (~ ( NEWLINE | 'end' ) ) ;
    public final RuleGrammarParser.declAttribute_return declAttribute() throws RecognitionException {
        RuleGrammarParser.declAttribute_return retval = new RuleGrammarParser.declAttribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set56=null;

        Object set56_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:107:2: ( (~ ( NEWLINE | 'end' ) ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:107:4: (~ ( NEWLINE | 'end' ) )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:107:4: (~ ( NEWLINE | 'end' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:107:5: ~ ( NEWLINE | 'end' )
            {
            set56=(Token)input.LT(1);
            if ( (input.LA(1)>=RULENAME && input.LA(1)<=RULEWHEN)||(input.LA(1)>=QUOTE && input.LA(1)<=15)||(input.LA(1)>=17 && input.LA(1)<=39) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set56));
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:109:1: declAttributeType : ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double' );
    public final RuleGrammarParser.declAttributeType_return declAttributeType() throws RecognitionException {
        RuleGrammarParser.declAttributeType_return retval = new RuleGrammarParser.declAttributeType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set57=null;

        Object set57_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:110:2: ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            {
            root_0 = (Object)adaptor.nil();

            set57=(Token)input.LT(1);
            if ( (input.LA(1)>=26 && input.LA(1)<=32) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set57));
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:112:1: ant_class : identifier ;
    public final RuleGrammarParser.ant_class_return ant_class() throws RecognitionException {
        RuleGrammarParser.ant_class_return retval = new RuleGrammarParser.ant_class_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.identifier_return identifier58 = null;



        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:2: ( identifier )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:4: identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_ant_class513);
            identifier58=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier58.getTree());

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
        boolean has;
    }
    protected Stack pattern_stack = new Stack();

    public static class pattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:117:1: pattern : expr_or ( '||' expr_or )* -> {$pattern::has}? ^( '||' ( expr_or )+ ) -> expr_or ;
    public final RuleGrammarParser.pattern_return pattern() throws RecognitionException {
        pattern_stack.push(new pattern_scope());
        RuleGrammarParser.pattern_return retval = new RuleGrammarParser.pattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal60=null;
        RuleGrammarParser.expr_or_return expr_or59 = null;

        RuleGrammarParser.expr_or_return expr_or61 = null;


        Object string_literal60_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_expr_or=new RewriteRuleSubtreeStream(adaptor,"rule expr_or");

        	((pattern_scope)pattern_stack.peek()).has = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:2: ( expr_or ( '||' expr_or )* -> {$pattern::has}? ^( '||' ( expr_or )+ ) -> expr_or )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:4: expr_or ( '||' expr_or )*
            {
            pushFollow(FOLLOW_expr_or_in_pattern533);
            expr_or59=expr_or();

            state._fsp--;

            stream_expr_or.add(expr_or59.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:12: ( '||' expr_or )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:13: '||' expr_or
            	    {
            	    string_literal60=(Token)match(input,33,FOLLOW_33_in_pattern536);  
            	    stream_33.add(string_literal60);

            	    pushFollow(FOLLOW_expr_or_in_pattern538);
            	    expr_or61=expr_or();

            	    state._fsp--;

            	    stream_expr_or.add(expr_or61.getTree());
            	    ((pattern_scope)pattern_stack.peek()).has = true;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: 33, expr_or, expr_or
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:2: -> {$pattern::has}? ^( '||' ( expr_or )+ )
            if (((pattern_scope)pattern_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:125:22: ^( '||' ( expr_or )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_33.nextNode(), root_1);

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
            else // 126:2: -> expr_or
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
            pattern_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "pattern"

    protected static class expr_or_scope {
        boolean has;
    }
    protected Stack expr_or_stack = new Stack();

    public static class expr_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_or"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:128:1: expr_or : expr_and ( '&&' expr_and )* -> {$expr_or::has}? ^( '&&' ( expr_and )+ ) -> expr_and ;
    public final RuleGrammarParser.expr_or_return expr_or() throws RecognitionException {
        expr_or_stack.push(new expr_or_scope());
        RuleGrammarParser.expr_or_return retval = new RuleGrammarParser.expr_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal63=null;
        RuleGrammarParser.expr_and_return expr_and62 = null;

        RuleGrammarParser.expr_and_return expr_and64 = null;


        Object string_literal63_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_expr_and=new RewriteRuleSubtreeStream(adaptor,"rule expr_and");

        	((expr_or_scope)expr_or_stack.peek()).has = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:135:2: ( expr_and ( '&&' expr_and )* -> {$expr_or::has}? ^( '&&' ( expr_and )+ ) -> expr_and )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:135:4: expr_and ( '&&' expr_and )*
            {
            pushFollow(FOLLOW_expr_and_in_expr_or577);
            expr_and62=expr_and();

            state._fsp--;

            stream_expr_and.add(expr_and62.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:135:13: ( '&&' expr_and )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==34) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:135:14: '&&' expr_and
            	    {
            	    string_literal63=(Token)match(input,34,FOLLOW_34_in_expr_or580);  
            	    stream_34.add(string_literal63);

            	    pushFollow(FOLLOW_expr_and_in_expr_or582);
            	    expr_and64=expr_and();

            	    state._fsp--;

            	    stream_expr_and.add(expr_and64.getTree());
            	    ((expr_or_scope)expr_or_stack.peek()).has = true;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



            // AST REWRITE
            // elements: 34, expr_and, expr_and
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 136:2: -> {$expr_or::has}? ^( '&&' ( expr_and )+ )
            if (((expr_or_scope)expr_or_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:136:22: ^( '&&' ( expr_and )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_34.nextNode(), root_1);

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
            else // 137:2: -> expr_and
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:139:1: expr_and : expr_eq_neq ( EQUALITY expr_eq_neq )* -> {$expr_and::hasEq}? ^( EQUALITY ( expr_eq_neq )+ ) -> expr_eq_neq ;
    public final RuleGrammarParser.expr_and_return expr_and() throws RecognitionException {
        expr_and_stack.push(new expr_and_scope());
        RuleGrammarParser.expr_and_return retval = new RuleGrammarParser.expr_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALITY66=null;
        RuleGrammarParser.expr_eq_neq_return expr_eq_neq65 = null;

        RuleGrammarParser.expr_eq_neq_return expr_eq_neq67 = null;


        Object EQUALITY66_tree=null;
        RewriteRuleTokenStream stream_EQUALITY=new RewriteRuleTokenStream(adaptor,"token EQUALITY");
        RewriteRuleSubtreeStream stream_expr_eq_neq=new RewriteRuleSubtreeStream(adaptor,"rule expr_eq_neq");

        	((expr_and_scope)expr_and_stack.peek()).hasEq = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:146:2: ( expr_eq_neq ( EQUALITY expr_eq_neq )* -> {$expr_and::hasEq}? ^( EQUALITY ( expr_eq_neq )+ ) -> expr_eq_neq )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:146:4: expr_eq_neq ( EQUALITY expr_eq_neq )*
            {
            pushFollow(FOLLOW_expr_eq_neq_in_expr_and621);
            expr_eq_neq65=expr_eq_neq();

            state._fsp--;

            stream_expr_eq_neq.add(expr_eq_neq65.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:146:16: ( EQUALITY expr_eq_neq )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EQUALITY) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:146:17: EQUALITY expr_eq_neq
            	    {
            	    EQUALITY66=(Token)match(input,EQUALITY,FOLLOW_EQUALITY_in_expr_and624);  
            	    stream_EQUALITY.add(EQUALITY66);

            	    pushFollow(FOLLOW_expr_eq_neq_in_expr_and626);
            	    expr_eq_neq67=expr_eq_neq();

            	    state._fsp--;

            	    stream_expr_eq_neq.add(expr_eq_neq67.getTree());
            	    ((expr_and_scope)expr_and_stack.peek()).hasEq = true;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);



            // AST REWRITE
            // elements: EQUALITY, expr_eq_neq, expr_eq_neq
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 147:2: -> {$expr_and::hasEq}? ^( EQUALITY ( expr_eq_neq )+ )
            if (((expr_and_scope)expr_and_stack.peek()).hasEq) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:147:25: ^( EQUALITY ( expr_eq_neq )+ )
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
            else // 148:2: -> expr_eq_neq
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:150:1: expr_eq_neq : expr_comp ( INEQUALITY expr_comp )* -> {$expr_eq_neq::has}? ^( INEQUALITY ( expr_comp )+ ) -> expr_comp ;
    public final RuleGrammarParser.expr_eq_neq_return expr_eq_neq() throws RecognitionException {
        expr_eq_neq_stack.push(new expr_eq_neq_scope());
        RuleGrammarParser.expr_eq_neq_return retval = new RuleGrammarParser.expr_eq_neq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INEQUALITY69=null;
        RuleGrammarParser.expr_comp_return expr_comp68 = null;

        RuleGrammarParser.expr_comp_return expr_comp70 = null;


        Object INEQUALITY69_tree=null;
        RewriteRuleTokenStream stream_INEQUALITY=new RewriteRuleTokenStream(adaptor,"token INEQUALITY");
        RewriteRuleSubtreeStream stream_expr_comp=new RewriteRuleSubtreeStream(adaptor,"rule expr_comp");

        	((expr_eq_neq_scope)expr_eq_neq_stack.peek()).has = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:157:2: ( expr_comp ( INEQUALITY expr_comp )* -> {$expr_eq_neq::has}? ^( INEQUALITY ( expr_comp )+ ) -> expr_comp )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:157:4: expr_comp ( INEQUALITY expr_comp )*
            {
            pushFollow(FOLLOW_expr_comp_in_expr_eq_neq665);
            expr_comp68=expr_comp();

            state._fsp--;

            stream_expr_comp.add(expr_comp68.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:157:14: ( INEQUALITY expr_comp )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==INEQUALITY) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:157:15: INEQUALITY expr_comp
            	    {
            	    INEQUALITY69=(Token)match(input,INEQUALITY,FOLLOW_INEQUALITY_in_expr_eq_neq668);  
            	    stream_INEQUALITY.add(INEQUALITY69);

            	    pushFollow(FOLLOW_expr_comp_in_expr_eq_neq670);
            	    expr_comp70=expr_comp();

            	    state._fsp--;

            	    stream_expr_comp.add(expr_comp70.getTree());
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
            // 158:2: -> {$expr_eq_neq::has}? ^( INEQUALITY ( expr_comp )+ )
            if (((expr_eq_neq_scope)expr_eq_neq_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:158:26: ^( INEQUALITY ( expr_comp )+ )
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
            else // 159:2: -> expr_comp
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

    public static class expr_comp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_comp"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:163:1: expr_comp : expr_add_sub ( ( '+' | '-' ) expr_add_sub )* ;
    public final RuleGrammarParser.expr_comp_return expr_comp() throws RecognitionException {
        RuleGrammarParser.expr_comp_return retval = new RuleGrammarParser.expr_comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set72=null;
        RuleGrammarParser.expr_add_sub_return expr_add_sub71 = null;

        RuleGrammarParser.expr_add_sub_return expr_add_sub73 = null;


        Object set72_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:164:2: ( expr_add_sub ( ( '+' | '-' ) expr_add_sub )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:164:4: expr_add_sub ( ( '+' | '-' ) expr_add_sub )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_add_sub_in_expr_comp702);
            expr_add_sub71=expr_add_sub();

            state._fsp--;

            adaptor.addChild(root_0, expr_add_sub71.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:164:17: ( ( '+' | '-' ) expr_add_sub )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=35 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:164:18: ( '+' | '-' ) expr_add_sub
            	    {
            	    set72=(Token)input.LT(1);
            	    if ( (input.LA(1)>=35 && input.LA(1)<=36) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set72));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_add_sub_in_expr_comp713);
            	    expr_add_sub73=expr_add_sub();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_add_sub73.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "expr_comp"

    public static class expr_add_sub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_add_sub"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:166:1: expr_add_sub : expr_mul_div ( ( '*' | '/' ) expr_mul_div )* ;
    public final RuleGrammarParser.expr_add_sub_return expr_add_sub() throws RecognitionException {
        RuleGrammarParser.expr_add_sub_return retval = new RuleGrammarParser.expr_add_sub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set75=null;
        RuleGrammarParser.expr_mul_div_return expr_mul_div74 = null;

        RuleGrammarParser.expr_mul_div_return expr_mul_div76 = null;


        Object set75_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:167:2: ( expr_mul_div ( ( '*' | '/' ) expr_mul_div )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:167:4: expr_mul_div ( ( '*' | '/' ) expr_mul_div )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub724);
            expr_mul_div74=expr_mul_div();

            state._fsp--;

            adaptor.addChild(root_0, expr_mul_div74.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:167:17: ( ( '*' | '/' ) expr_mul_div )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=37 && LA22_0<=38)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:167:18: ( '*' | '/' ) expr_mul_div
            	    {
            	    set75=(Token)input.LT(1);
            	    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set75));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub735);
            	    expr_mul_div76=expr_mul_div();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_mul_div76.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:169:1: expr_mul_div : ( '!' )? expr_not ;
    public final RuleGrammarParser.expr_mul_div_return expr_mul_div() throws RecognitionException {
        RuleGrammarParser.expr_mul_div_return retval = new RuleGrammarParser.expr_mul_div_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal77=null;
        RuleGrammarParser.expr_not_return expr_not78 = null;


        Object char_literal77_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:170:2: ( ( '!' )? expr_not )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:170:4: ( '!' )? expr_not
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:170:4: ( '!' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:170:5: '!'
                    {
                    char_literal77=(Token)match(input,39,FOLLOW_39_in_expr_mul_div747); 
                    char_literal77_tree = (Object)adaptor.create(char_literal77);
                    adaptor.addChild(root_0, char_literal77_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_not_in_expr_mul_div751);
            expr_not78=expr_not();

            state._fsp--;

            adaptor.addChild(root_0, expr_not78.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:172:1: expr_not : ( '-' | '+' )? expr_unary ;
    public final RuleGrammarParser.expr_not_return expr_not() throws RecognitionException {
        RuleGrammarParser.expr_not_return retval = new RuleGrammarParser.expr_not_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set79=null;
        RuleGrammarParser.expr_unary_return expr_unary80 = null;


        Object set79_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:173:2: ( ( '-' | '+' )? expr_unary )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:173:4: ( '-' | '+' )? expr_unary
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:173:4: ( '-' | '+' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=35 && LA24_0<=36)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
                    {
                    set79=(Token)input.LT(1);
                    if ( (input.LA(1)>=35 && input.LA(1)<=36) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set79));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_unary_in_expr_not769);
            expr_unary80=expr_unary();

            state._fsp--;

            adaptor.addChild(root_0, expr_unary80.getTree());

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

    public static class expr_unary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_unary"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:175:1: expr_unary : ( (m1= identifier ':' )? m2= identifier | INT | '(' pattern ')' ) ;
    public final RuleGrammarParser.expr_unary_return expr_unary() throws RecognitionException {
        RuleGrammarParser.expr_unary_return retval = new RuleGrammarParser.expr_unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal81=null;
        Token INT82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        RuleGrammarParser.identifier_return m1 = null;

        RuleGrammarParser.identifier_return m2 = null;

        RuleGrammarParser.pattern_return pattern84 = null;


        Object char_literal81_tree=null;
        Object INT82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:176:2: ( ( (m1= identifier ':' )? m2= identifier | INT | '(' pattern ')' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:176:4: ( (m1= identifier ':' )? m2= identifier | INT | '(' pattern ')' )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:176:4: ( (m1= identifier ':' )? m2= identifier | INT | '(' pattern ')' )
            int alt26=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt26=1;
                }
                break;
            case INT:
                {
                alt26=2;
                }
                break;
            case 21:
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
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:176:5: (m1= identifier ':' )? m2= identifier
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:176:5: (m1= identifier ':' )?
                    int alt25=2;
                    alt25 = dfa25.predict(input);
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:176:6: m1= identifier ':'
                            {
                            pushFollow(FOLLOW_identifier_in_expr_unary782);
                            m1=identifier();

                            state._fsp--;

                            adaptor.addChild(root_0, m1.getTree());
                            char_literal81=(Token)match(input,19,FOLLOW_19_in_expr_unary784); 
                            char_literal81_tree = (Object)adaptor.create(char_literal81);
                            adaptor.addChild(root_0, char_literal81_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_expr_unary790);
                    m2=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, m2.getTree());

                    	 	if (((HashMap)classTable.get(((ruleWhen_scope)ruleWhen_stack.peek()).declName)).get((m2!=null?input.toString(m2.start,m2.stop):null)) == null)
                    	 		System.err.println("The variable " + (m2!=null?input.toString(m2.start,m2.stop):null) + " is not a member of " + ((ruleWhen_scope)ruleWhen_stack.peek()).declName);
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:181:4: INT
                    {
                    INT82=(Token)match(input,INT,FOLLOW_INT_in_expr_unary798); 
                    INT82_tree = (Object)adaptor.create(INT82);
                    adaptor.addChild(root_0, INT82_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:181:10: '(' pattern ')'
                    {
                    char_literal83=(Token)match(input,21,FOLLOW_21_in_expr_unary802); 
                    pushFollow(FOLLOW_pattern_in_expr_unary806);
                    pattern84=pattern();

                    state._fsp--;

                    adaptor.addChild(root_0, pattern84.getTree());
                    char_literal85=(Token)match(input,22,FOLLOW_22_in_expr_unary808); 

                    }
                    break;

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
    // $ANTLR end "expr_unary"

    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:183:1: identifier : ID ( ID | INT )* ;
    public final RuleGrammarParser.identifier_return identifier() throws RecognitionException {
        RuleGrammarParser.identifier_return retval = new RuleGrammarParser.identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID86=null;
        Token set87=null;

        Object ID86_tree=null;
        Object set87_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:184:2: ( ID ( ID | INT )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:184:4: ID ( ID | INT )*
            {
            root_0 = (Object)adaptor.nil();

            ID86=(Token)match(input,ID,FOLLOW_ID_in_identifier820); 
            ID86_tree = (Object)adaptor.create(ID86);
            adaptor.addChild(root_0, ID86_tree);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:184:7: ( ID | INT )*
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
            	    set87=(Token)input.LT(1);
            	    if ( (input.LA(1)>=INT && input.LA(1)<=ID) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set87));
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
        "\5\uffff";
    static final String DFA25_eofS =
        "\5\uffff";
    static final String DFA25_minS =
        "\1\13\2\10\2\uffff";
    static final String DFA25_maxS =
        "\1\13\2\46\2\uffff";
    static final String DFA25_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA25_specialS =
        "\5\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\1",
            "\2\4\2\2\7\uffff\1\3\2\uffff\1\4\12\uffff\6\4",
            "\2\4\2\2\7\uffff\1\3\2\uffff\1\4\12\uffff\6\4",
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
            return "176:5: (m1= identifier ':' )?";
        }
    }
 

    public static final BitSet FOLLOW_rule_in_prog69 = new BitSet(new long[]{0x0000000000062042L});
    public static final BitSet FOLLOW_comment_in_prog73 = new BitSet(new long[]{0x0000000000062042L});
    public static final BitSet FOLLOW_decl_in_prog77 = new BitSet(new long[]{0x0000000000062042L});
    public static final BitSet FOLLOW_NEWLINE_in_prog83 = new BitSet(new long[]{0x0000000000062042L});
    public static final BitSet FOLLOW_13_in_rule97 = new BitSet(new long[]{0x000000FFFFFE1FB0L});
    public static final BitSet FOLLOW_ruleName_in_rule99 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_rule101 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rule103 = new BitSet(new long[]{0x0000000000100840L});
    public static final BitSet FOLLOW_ruleWhen_in_rule105 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_NEWLINE_in_rule107 = new BitSet(new long[]{0x0000000000008040L});
    public static final BitSet FOLLOW_15_in_rule110 = new BitSet(new long[]{0x000000FFFFFE1F30L});
    public static final BitSet FOLLOW_ruleThen_in_rule112 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_NEWLINE_in_rule114 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16_in_rule117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_comment143 = new BitSet(new long[]{0x000000FFFFFFFFF0L});
    public static final BitSet FOLLOW_NEWLINE_in_comment148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_decl168 = new BitSet(new long[]{0x000000FFFFFAFFB0L});
    public static final BitSet FOLLOW_declName_in_decl170 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_decl172 = new BitSet(new long[]{0x000000FFFFFEFFB0L});
    public static final BitSet FOLLOW_declMember_in_decl176 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_NEWLINE_in_decl181 = new BitSet(new long[]{0x000000FFFFFEFFB0L});
    public static final BitSet FOLLOW_declMember_in_decl185 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_NEWLINE_in_decl191 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_16_in_decl194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub2_in_declName209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttribute_in_declMember222 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_declMember224 = new BitSet(new long[]{0x00000001FC000000L});
    public static final BitSet FOLLOW_declAttributeType_in_declMember226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub1_in_ruleName238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName243 = new BitSet(new long[]{0x000000FFFFFE1F30L});
    public static final BitSet FOLLOW_sub1_in_ruleName245 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhen272 = new BitSet(new long[]{0x0000000000100840L});
    public static final BitSet FOLLOW_ruleWhen1_in_ruleWhen275 = new BitSet(new long[]{0x0000000003100842L});
    public static final BitSet FOLLOW_ruleWhenK_in_ruleWhen277 = new BitSet(new long[]{0x0000000003100842L});
    public static final BitSet FOLLOW_20_in_ruleWhen1301 = new BitSet(new long[]{0x0000000000100840L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhen1305 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleWhen1309 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_pattern_in_ruleWhen1311 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWhen1313 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhen1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleWhen1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWhenK342 = new BitSet(new long[]{0x0000000000100840L});
    public static final BitSet FOLLOW_25_in_ruleWhenK346 = new BitSet(new long[]{0x0000000000100840L});
    public static final BitSet FOLLOW_20_in_ruleWhenK350 = new BitSet(new long[]{0x0000000000100840L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhenK354 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleWhenK358 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_pattern_in_ruleWhenK360 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWhenK362 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhenK365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleWhenK369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub1_in_ruleThen388 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleThen391 = new BitSet(new long[]{0x000000FFFFFE1F30L});
    public static final BitSet FOLLOW_sub1_in_ruleThen393 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_set_in_sub1405 = new BitSet(new long[]{0x000000FFFFFE1F32L});
    public static final BitSet FOLLOW_set_in_sub2440 = new BitSet(new long[]{0x000000FFFFFAFFB2L});
    public static final BitSet FOLLOW_set_in_declAttribute463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declAttributeType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_ant_class513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_in_pattern533 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_pattern536 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_expr_or_in_pattern538 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_expr_and_in_expr_or577 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_expr_or580 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_expr_and_in_expr_or582 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_expr_eq_neq_in_expr_and621 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_EQUALITY_in_expr_and624 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_expr_eq_neq_in_expr_and626 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_expr_comp_in_expr_eq_neq665 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_INEQUALITY_in_expr_eq_neq668 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_expr_comp_in_expr_eq_neq670 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_comp702 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_set_in_expr_comp705 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_comp713 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub724 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_set_in_expr_add_sub727 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub735 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_39_in_expr_mul_div747 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_expr_not_in_expr_mul_div751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr_not760 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_expr_unary_in_expr_not769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_expr_unary782 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_expr_unary784 = new BitSet(new long[]{0x0000000000100840L});
    public static final BitSet FOLLOW_identifier_in_expr_unary790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr_unary798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_expr_unary802 = new BitSet(new long[]{0x0000009800300C40L});
    public static final BitSet FOLLOW_pattern_in_expr_unary806 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_expr_unary808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier820 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_set_in_identifier822 = new BitSet(new long[]{0x0000000000000C02L});

}