// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g 2012-12-24 20:12:37

	package parser;
	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RuleGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULENAME", "RULEWHEN", "OBJECT", "NEWLINE", "QUOTE", "EQUALITY", "INEQUALITY", "INT", "ID", "WS", "'rule'", "'when'", "'then'", "'end'", "'//'", "'declare'", "':'", "'not'", "'('", "')'", "';'", "'and'", "'or'", "'String'", "'Integer'", "'int'", "'long'", "'Decimal'", "'Char'", "'double'", "'||'", "'&&'", "'+'", "'-'", "'*'", "'/'", "'!'"
    };
    public static final int EOF=-1;
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
    public static final int T__40=40;
    public static final int RULENAME=4;
    public static final int RULEWHEN=5;
    public static final int OBJECT=6;
    public static final int NEWLINE=7;
    public static final int QUOTE=8;
    public static final int EQUALITY=9;
    public static final int INEQUALITY=10;
    public static final int INT=11;
    public static final int ID=12;
    public static final int WS=13;

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


    	HashMap<String, HashMap<String, String>> classTable = new HashMap<String, HashMap<String, String>>();
    	HashMap<String, String> ruleTable = new HashMap<String, String>();
    	//ArrayList classList = new ArrayList();


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:30:1: prog : ( rule | comment | decl | NEWLINE )+ ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:31:2: ( ( rule | comment | decl | NEWLINE )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:31:4: ( rule | comment | decl | NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:31:4: ( rule | comment | decl | NEWLINE )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    alt1=1;
                    }
                    break;
                case 18:
                    {
                    alt1=2;
                    }
                    break;
                case 19:
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
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:31:5: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_prog73);
            	    rule1=rule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rule1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:31:12: comment
            	    {
            	    pushFollow(FOLLOW_comment_in_prog77);
            	    comment2=comment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comment2.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:31:22: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_prog81);
            	    decl3=decl();

            	    state._fsp--;


            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:31:31: NEWLINE
            	    {
            	    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_prog87); 

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:35:1: rule : 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' -> ^( 'rule' ruleName ruleWhen 'then' ) ;
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
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleTokenStream stream_15=new RewriteRuleTokenStream(adaptor,"token 15");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_ruleName=new RewriteRuleSubtreeStream(adaptor,"rule ruleName");
        RewriteRuleSubtreeStream stream_ruleThen=new RewriteRuleSubtreeStream(adaptor,"rule ruleThen");
        RewriteRuleSubtreeStream stream_ruleWhen=new RewriteRuleSubtreeStream(adaptor,"rule ruleWhen");
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:36:2: ( 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' -> ^( 'rule' ruleName ruleWhen 'then' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:36:4: 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end'
            {
            string_literal5=(Token)match(input,14,FOLLOW_14_in_rule101);  
            stream_14.add(string_literal5);

            pushFollow(FOLLOW_ruleName_in_rule103);
            ruleName6=ruleName();

            state._fsp--;

            stream_ruleName.add(ruleName6.getTree());
            NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule105);  
            stream_NEWLINE.add(NEWLINE7);

            string_literal8=(Token)match(input,15,FOLLOW_15_in_rule107);  
            stream_15.add(string_literal8);

            pushFollow(FOLLOW_ruleWhen_in_rule109);
            ruleWhen9=ruleWhen();

            state._fsp--;

            stream_ruleWhen.add(ruleWhen9.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:36:44: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:36:44: NEWLINE
            	    {
            	    NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule111);  
            	    stream_NEWLINE.add(NEWLINE10);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            string_literal11=(Token)match(input,16,FOLLOW_16_in_rule114);  
            stream_16.add(string_literal11);

            pushFollow(FOLLOW_ruleThen_in_rule116);
            ruleThen12=ruleThen();

            state._fsp--;

            stream_ruleThen.add(ruleThen12.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:36:69: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:36:69: NEWLINE
            	    {
            	    NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule118);  
            	    stream_NEWLINE.add(NEWLINE13);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            string_literal14=(Token)match(input,17,FOLLOW_17_in_rule121);  
            stream_17.add(string_literal14);


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
            // elements: ruleName, ruleWhen, 14, 16
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 47:6: -> ^( 'rule' ruleName ruleWhen 'then' )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:47:9: ^( 'rule' ruleName ruleWhen 'then' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_14.nextNode(), root_1);

                adaptor.addChild(root_1, stream_ruleName.nextTree());
                adaptor.addChild(root_1, stream_ruleWhen.nextTree());
                adaptor.addChild(root_1, stream_16.nextNode());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:49:1: comment : '//' ( . )* NEWLINE ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:50:2: ( '//' ( . )* NEWLINE )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:50:4: '//' ( . )* NEWLINE
            {
            root_0 = (Object)adaptor.nil();

            string_literal15=(Token)match(input,18,FOLLOW_18_in_comment147); 
            string_literal15_tree = (Object)adaptor.create(string_literal15);
            adaptor.addChild(root_0, string_literal15_tree);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:50:9: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=2;
                }
                else if ( ((LA4_0>=RULENAME && LA4_0<=OBJECT)||(LA4_0>=QUOTE && LA4_0<=40)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:50:9: .
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

            NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comment152); 
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:54:1: decl : 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end' ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:61:2: ( 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:61:4: 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal18=(Token)match(input,19,FOLLOW_19_in_decl172); 
            string_literal18_tree = (Object)adaptor.create(string_literal18);
            adaptor.addChild(root_0, string_literal18_tree);

            pushFollow(FOLLOW_declName_in_decl174);
            declName19=declName();

            state._fsp--;

            adaptor.addChild(root_0, declName19.getTree());
            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl176); 
            NEWLINE20_tree = (Object)adaptor.create(NEWLINE20);
            adaptor.addChild(root_0, NEWLINE20_tree);

            pushFollow(FOLLOW_declMember_in_decl180);
            d=declMember();

            state._fsp--;

            adaptor.addChild(root_0, d.getTree());
            ((decl_scope)decl_stack.peek()).newClass.put((d!=null?d.attr:null), (d!=null?d.type:null));
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:61:85: ( NEWLINE d= declMember )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    int LA5_1 = input.LA(2);

                    if ( ((LA5_1>=RULENAME && LA5_1<=OBJECT)||(LA5_1>=QUOTE && LA5_1<=16)||(LA5_1>=18 && LA5_1<=40)) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:61:86: NEWLINE d= declMember
            	    {
            	    NEWLINE21=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl185); 
            	    NEWLINE21_tree = (Object)adaptor.create(NEWLINE21);
            	    adaptor.addChild(root_0, NEWLINE21_tree);

            	    pushFollow(FOLLOW_declMember_in_decl189);
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

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:61:150: ( NEWLINE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:61:150: NEWLINE
            	    {
            	    NEWLINE22=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl195); 
            	    NEWLINE22_tree = (Object)adaptor.create(NEWLINE22);
            	    adaptor.addChild(root_0, NEWLINE22_tree);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            string_literal23=(Token)match(input,17,FOLLOW_17_in_decl198); 
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:1: declName : sub2 ;
    public final RuleGrammarParser.declName_return declName() throws RecognitionException {
        RuleGrammarParser.declName_return retval = new RuleGrammarParser.declName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.sub2_return sub224 = null;



        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:75:2: ( sub2 )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:75:4: sub2
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sub2_in_declName213);
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:1: declMember returns [String attr, String type] : declAttribute ':' declAttributeType ;
    public final RuleGrammarParser.declMember_return declMember() throws RecognitionException {
        RuleGrammarParser.declMember_return retval = new RuleGrammarParser.declMember_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        RuleGrammarParser.declAttribute_return declAttribute25 = null;

        RuleGrammarParser.declAttributeType_return declAttributeType27 = null;


        Object char_literal26_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:78:2: ( declAttribute ':' declAttributeType )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:78:4: declAttribute ':' declAttributeType
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declAttribute_in_declMember226);
            declAttribute25=declAttribute();

            state._fsp--;

            adaptor.addChild(root_0, declAttribute25.getTree());
            char_literal26=(Token)match(input,20,FOLLOW_20_in_declMember228); 
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);

            pushFollow(FOLLOW_declAttributeType_in_declMember230);
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:1: ruleName : ( sub1 | ( QUOTE sub1 QUOTE ) ) -> ^( RULENAME sub1 ) ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:2: ( ( sub1 | ( QUOTE sub1 QUOTE ) ) -> ^( RULENAME sub1 ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:4: ( sub1 | ( QUOTE sub1 QUOTE ) )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:4: ( sub1 | ( QUOTE sub1 QUOTE ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULENAME && LA7_0<=OBJECT)||(LA7_0>=EQUALITY && LA7_0<=WS)||(LA7_0>=18 && LA7_0<=40)) ) {
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
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:5: sub1
                    {
                    pushFollow(FOLLOW_sub1_in_ruleName242);
                    sub128=sub1();

                    state._fsp--;

                    stream_sub1.add(sub128.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:12: ( QUOTE sub1 QUOTE )
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:12: ( QUOTE sub1 QUOTE )
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:13: QUOTE sub1 QUOTE
                    {
                    QUOTE29=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName247);  
                    stream_QUOTE.add(QUOTE29);

                    pushFollow(FOLLOW_sub1_in_ruleName249);
                    sub130=sub1();

                    state._fsp--;

                    stream_sub1.add(sub130.getTree());
                    QUOTE31=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName251);  
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
            // 81:32: -> ^( RULENAME sub1 )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:35: ^( RULENAME sub1 )
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:83:1: ruleWhen : ( NEWLINE )* ruleWhen1 ( ruleWhenK )* -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* ) ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:88:2: ( ( NEWLINE )* ruleWhen1 ( ruleWhenK )* -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:88:4: ( NEWLINE )* ruleWhen1 ( ruleWhenK )*
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:88:4: ( NEWLINE )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==NEWLINE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:88:4: NEWLINE
            	    {
            	    NEWLINE32=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhen276);  
            	    stream_NEWLINE.add(NEWLINE32);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            pushFollow(FOLLOW_ruleWhen1_in_ruleWhen279);
            ruleWhen133=ruleWhen1();

            state._fsp--;

            stream_ruleWhen1.add(ruleWhen133.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:88:23: ( ruleWhenK )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||LA9_0==21||(LA9_0>=25 && LA9_0<=26)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:88:23: ruleWhenK
            	    {
            	    pushFollow(FOLLOW_ruleWhenK_in_ruleWhen281);
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
            // 88:34: -> ^( RULEWHEN ruleWhen1 ( ruleWhenK )* )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:88:37: ^( RULEWHEN ruleWhen1 ( ruleWhenK )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(RULEWHEN, "RULEWHEN"), root_1);

                adaptor.addChild(root_1, stream_ruleWhen1.nextTree());
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:88:58: ( ruleWhenK )*
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:90:1: ruleWhen1 : ( 'not' | ( identifier ':' ) )? ant_class '(' pattern ')' ( NEWLINE | ';' ) -> ^( ant_class pattern ) ;
    public final RuleGrammarParser.ruleWhen1_return ruleWhen1() throws RecognitionException {
        RuleGrammarParser.ruleWhen1_return retval = new RuleGrammarParser.ruleWhen1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal35=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token char_literal41=null;
        Token NEWLINE42=null;
        Token char_literal43=null;
        RuleGrammarParser.identifier_return identifier36 = null;

        RuleGrammarParser.ant_class_return ant_class38 = null;

        RuleGrammarParser.pattern_return pattern40 = null;


        Object string_literal35_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;
        Object char_literal41_tree=null;
        Object NEWLINE42_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_ant_class=new RewriteRuleSubtreeStream(adaptor,"rule ant_class");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:2: ( ( 'not' | ( identifier ':' ) )? ant_class '(' pattern ')' ( NEWLINE | ';' ) -> ^( ant_class pattern ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:4: ( 'not' | ( identifier ':' ) )? ant_class '(' pattern ')' ( NEWLINE | ';' )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:4: ( 'not' | ( identifier ':' ) )?
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:5: 'not'
                    {
                    string_literal35=(Token)match(input,21,FOLLOW_21_in_ruleWhen1305);  
                    stream_21.add(string_literal35);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:13: ( identifier ':' )
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:13: ( identifier ':' )
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:14: identifier ':'
                    {
                    pushFollow(FOLLOW_identifier_in_ruleWhen1310);
                    identifier36=identifier();

                    state._fsp--;

                    stream_identifier.add(identifier36.getTree());
                    char_literal37=(Token)match(input,20,FOLLOW_20_in_ruleWhen1312);  
                    stream_20.add(char_literal37);


                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_ant_class_in_ruleWhen1317);
            ant_class38=ant_class();

            state._fsp--;

            stream_ant_class.add(ant_class38.getTree());
            ((ruleWhen_scope)ruleWhen_stack.peek()).declName = (ant_class38!=null?input.toString(ant_class38.start,ant_class38.stop):null);
            char_literal39=(Token)match(input,22,FOLLOW_22_in_ruleWhen1321);  
            stream_22.add(char_literal39);

            pushFollow(FOLLOW_pattern_in_ruleWhen1323);
            pattern40=pattern();

            state._fsp--;

            stream_pattern.add(pattern40.getTree());
            char_literal41=(Token)match(input,23,FOLLOW_23_in_ruleWhen1325);  
            stream_23.add(char_literal41);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:99: ( NEWLINE | ';' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NEWLINE) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:100: NEWLINE
                    {
                    NEWLINE42=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhen1328);  
                    stream_NEWLINE.add(NEWLINE42);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:110: ';'
                    {
                    char_literal43=(Token)match(input,24,FOLLOW_24_in_ruleWhen1332);  
                    stream_24.add(char_literal43);


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
            // 92:115: -> ^( ant_class pattern )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:118: ^( ant_class pattern )
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:94:1: ruleWhenK : ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ) -> ^( ant_class pattern ) ;
    public final RuleGrammarParser.ruleWhenK_return ruleWhenK() throws RecognitionException {
        RuleGrammarParser.ruleWhenK_return retval = new RuleGrammarParser.ruleWhenK_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal44=null;
        Token string_literal45=null;
        Token string_literal46=null;
        Token char_literal48=null;
        Token char_literal50=null;
        Token NEWLINE51=null;
        Token char_literal52=null;
        RuleGrammarParser.ant_class_return ant_class47 = null;

        RuleGrammarParser.pattern_return pattern49 = null;


        Object string_literal44_tree=null;
        Object string_literal45_tree=null;
        Object string_literal46_tree=null;
        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        Object NEWLINE51_tree=null;
        Object char_literal52_tree=null;
        RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_pattern=new RewriteRuleSubtreeStream(adaptor,"rule pattern");
        RewriteRuleSubtreeStream stream_ant_class=new RewriteRuleSubtreeStream(adaptor,"rule ant_class");
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:2: ( ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ) -> ^( ant_class pattern ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:4: ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:4: ( ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:5: ( 'and' | 'or' | 'not' )? ant_class '(' pattern ')' ( NEWLINE | ';' )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:5: ( 'and' | 'or' | 'not' )?
            int alt12=4;
            switch ( input.LA(1) ) {
                case 25:
                    {
                    alt12=1;
                    }
                    break;
                case 26:
                    {
                    alt12=2;
                    }
                    break;
                case 21:
                    {
                    alt12=3;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:6: 'and'
                    {
                    string_literal44=(Token)match(input,25,FOLLOW_25_in_ruleWhenK354);  
                    stream_25.add(string_literal44);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:14: 'or'
                    {
                    string_literal45=(Token)match(input,26,FOLLOW_26_in_ruleWhenK358);  
                    stream_26.add(string_literal45);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:21: 'not'
                    {
                    string_literal46=(Token)match(input,21,FOLLOW_21_in_ruleWhenK362);  
                    stream_21.add(string_literal46);


                    }
                    break;

            }

            pushFollow(FOLLOW_ant_class_in_ruleWhenK366);
            ant_class47=ant_class();

            state._fsp--;

            stream_ant_class.add(ant_class47.getTree());
            ((ruleWhen_scope)ruleWhen_stack.peek()).declName = (ant_class47!=null?input.toString(ant_class47.start,ant_class47.stop):null);
            char_literal48=(Token)match(input,22,FOLLOW_22_in_ruleWhenK370);  
            stream_22.add(char_literal48);

            pushFollow(FOLLOW_pattern_in_ruleWhenK372);
            pattern49=pattern();

            state._fsp--;

            stream_pattern.add(pattern49.getTree());
            char_literal50=(Token)match(input,23,FOLLOW_23_in_ruleWhenK374);  
            stream_23.add(char_literal50);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:96: ( NEWLINE | ';' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NEWLINE) ) {
                alt13=1;
            }
            else if ( (LA13_0==24) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:97: NEWLINE
                    {
                    NEWLINE51=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleWhenK377);  
                    stream_NEWLINE.add(NEWLINE51);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:107: ';'
                    {
                    char_literal52=(Token)match(input,24,FOLLOW_24_in_ruleWhenK381);  
                    stream_24.add(char_literal52);


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
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 96:113: -> ^( ant_class pattern )
            {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:116: ^( ant_class pattern )
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:1: ruleThen : sub1 ( NEWLINE sub1 )* ;
    public final RuleGrammarParser.ruleThen_return ruleThen() throws RecognitionException {
        RuleGrammarParser.ruleThen_return retval = new RuleGrammarParser.ruleThen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE54=null;
        RuleGrammarParser.sub1_return sub153 = null;

        RuleGrammarParser.sub1_return sub155 = null;


        Object NEWLINE54_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:99:2: ( sub1 ( NEWLINE sub1 )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:99:4: sub1 ( NEWLINE sub1 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sub1_in_ruleThen400);
            sub153=sub1();

            state._fsp--;

            adaptor.addChild(root_0, sub153.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:99:9: ( NEWLINE sub1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==NEWLINE) ) {
                    int LA14_1 = input.LA(2);

                    if ( ((LA14_1>=RULENAME && LA14_1<=OBJECT)||(LA14_1>=EQUALITY && LA14_1<=WS)||(LA14_1>=18 && LA14_1<=40)) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:99:10: NEWLINE sub1
            	    {
            	    NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleThen403); 
            	    NEWLINE54_tree = (Object)adaptor.create(NEWLINE54);
            	    adaptor.addChild(root_0, NEWLINE54_tree);

            	    pushFollow(FOLLOW_sub1_in_ruleThen405);
            	    sub155=sub1();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sub155.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:101:1: sub1 : (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ ;
    public final RuleGrammarParser.sub1_return sub1() throws RecognitionException {
        RuleGrammarParser.sub1_return retval = new RuleGrammarParser.sub1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set56=null;

        Object set56_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:102:2: ( (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:102:4: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:102:4: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULENAME && LA15_0<=OBJECT)||(LA15_0>=EQUALITY && LA15_0<=WS)||(LA15_0>=18 && LA15_0<=40)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:102:5: ~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE )
            	    {
            	    set56=(Token)input.LT(1);
            	    if ( (input.LA(1)>=RULENAME && input.LA(1)<=OBJECT)||(input.LA(1)>=EQUALITY && input.LA(1)<=WS)||(input.LA(1)>=18 && input.LA(1)<=40) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set56));
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:104:1: sub2 : (~ ( NEWLINE | 'declare' | 'end' ) )+ ;
    public final RuleGrammarParser.sub2_return sub2() throws RecognitionException {
        RuleGrammarParser.sub2_return retval = new RuleGrammarParser.sub2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set57=null;

        Object set57_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:2: ( (~ ( NEWLINE | 'declare' | 'end' ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:4: (~ ( NEWLINE | 'declare' | 'end' ) )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:4: (~ ( NEWLINE | 'declare' | 'end' ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULENAME && LA16_0<=OBJECT)||(LA16_0>=QUOTE && LA16_0<=16)||LA16_0==18||(LA16_0>=20 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:105:5: ~ ( NEWLINE | 'declare' | 'end' )
            	    {
            	    set57=(Token)input.LT(1);
            	    if ( (input.LA(1)>=RULENAME && input.LA(1)<=OBJECT)||(input.LA(1)>=QUOTE && input.LA(1)<=16)||input.LA(1)==18||(input.LA(1)>=20 && input.LA(1)<=40) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set57));
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:107:1: declAttribute : (~ ( NEWLINE | 'end' ) ) ;
    public final RuleGrammarParser.declAttribute_return declAttribute() throws RecognitionException {
        RuleGrammarParser.declAttribute_return retval = new RuleGrammarParser.declAttribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set58=null;

        Object set58_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:108:2: ( (~ ( NEWLINE | 'end' ) ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:108:4: (~ ( NEWLINE | 'end' ) )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:108:4: (~ ( NEWLINE | 'end' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:108:5: ~ ( NEWLINE | 'end' )
            {
            set58=(Token)input.LT(1);
            if ( (input.LA(1)>=RULENAME && input.LA(1)<=OBJECT)||(input.LA(1)>=QUOTE && input.LA(1)<=16)||(input.LA(1)>=18 && input.LA(1)<=40) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set58));
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:110:1: declAttributeType : ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double' );
    public final RuleGrammarParser.declAttributeType_return declAttributeType() throws RecognitionException {
        RuleGrammarParser.declAttributeType_return retval = new RuleGrammarParser.declAttributeType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set59=null;

        Object set59_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:111:2: ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            {
            root_0 = (Object)adaptor.nil();

            set59=(Token)input.LT(1);
            if ( (input.LA(1)>=27 && input.LA(1)<=33) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set59));
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:113:1: ant_class : identifier ;
    public final RuleGrammarParser.ant_class_return ant_class() throws RecognitionException {
        RuleGrammarParser.ant_class_return retval = new RuleGrammarParser.ant_class_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.identifier_return identifier60 = null;



        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:114:2: ( identifier )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:114:4: identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_ant_class525);
            identifier60=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier60.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:118:1: pattern : expr_or ( '||' expr_or )* -> {$pattern::has}? ^( '||' ( expr_or )+ ) -> expr_or ;
    public final RuleGrammarParser.pattern_return pattern() throws RecognitionException {
        pattern_stack.push(new pattern_scope());
        RuleGrammarParser.pattern_return retval = new RuleGrammarParser.pattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal62=null;
        RuleGrammarParser.expr_or_return expr_or61 = null;

        RuleGrammarParser.expr_or_return expr_or63 = null;


        Object string_literal62_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_expr_or=new RewriteRuleSubtreeStream(adaptor,"rule expr_or");

        	((pattern_scope)pattern_stack.peek()).has = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:125:2: ( expr_or ( '||' expr_or )* -> {$pattern::has}? ^( '||' ( expr_or )+ ) -> expr_or )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:125:4: expr_or ( '||' expr_or )*
            {
            pushFollow(FOLLOW_expr_or_in_pattern545);
            expr_or61=expr_or();

            state._fsp--;

            stream_expr_or.add(expr_or61.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:125:12: ( '||' expr_or )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:125:13: '||' expr_or
            	    {
            	    string_literal62=(Token)match(input,34,FOLLOW_34_in_pattern548);  
            	    stream_34.add(string_literal62);

            	    pushFollow(FOLLOW_expr_or_in_pattern550);
            	    expr_or63=expr_or();

            	    state._fsp--;

            	    stream_expr_or.add(expr_or63.getTree());
            	    ((pattern_scope)pattern_stack.peek()).has = true;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);



            // AST REWRITE
            // elements: expr_or, expr_or, 34
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 126:2: -> {$pattern::has}? ^( '||' ( expr_or )+ )
            if (((pattern_scope)pattern_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:126:22: ^( '||' ( expr_or )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_34.nextNode(), root_1);

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
            else // 127:2: -> expr_or
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:129:1: expr_or : expr_and ( '&&' expr_and )* -> {$expr_or::has}? ^( '&&' ( expr_and )+ ) -> expr_and ;
    public final RuleGrammarParser.expr_or_return expr_or() throws RecognitionException {
        expr_or_stack.push(new expr_or_scope());
        RuleGrammarParser.expr_or_return retval = new RuleGrammarParser.expr_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal65=null;
        RuleGrammarParser.expr_and_return expr_and64 = null;

        RuleGrammarParser.expr_and_return expr_and66 = null;


        Object string_literal65_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleSubtreeStream stream_expr_and=new RewriteRuleSubtreeStream(adaptor,"rule expr_and");

        	((expr_or_scope)expr_or_stack.peek()).has = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:136:2: ( expr_and ( '&&' expr_and )* -> {$expr_or::has}? ^( '&&' ( expr_and )+ ) -> expr_and )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:136:4: expr_and ( '&&' expr_and )*
            {
            pushFollow(FOLLOW_expr_and_in_expr_or589);
            expr_and64=expr_and();

            state._fsp--;

            stream_expr_and.add(expr_and64.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:136:13: ( '&&' expr_and )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:136:14: '&&' expr_and
            	    {
            	    string_literal65=(Token)match(input,35,FOLLOW_35_in_expr_or592);  
            	    stream_35.add(string_literal65);

            	    pushFollow(FOLLOW_expr_and_in_expr_or594);
            	    expr_and66=expr_and();

            	    state._fsp--;

            	    stream_expr_and.add(expr_and66.getTree());
            	    ((expr_or_scope)expr_or_stack.peek()).has = true;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);



            // AST REWRITE
            // elements: expr_and, expr_and, 35
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 137:2: -> {$expr_or::has}? ^( '&&' ( expr_and )+ )
            if (((expr_or_scope)expr_or_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:137:22: ^( '&&' ( expr_and )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_35.nextNode(), root_1);

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
            else // 138:2: -> expr_and
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:140:1: expr_and : expr_eq_neq ( EQUALITY expr_eq_neq )* -> {$expr_and::hasEq}? ^( EQUALITY ( expr_eq_neq )+ ) -> expr_eq_neq ;
    public final RuleGrammarParser.expr_and_return expr_and() throws RecognitionException {
        expr_and_stack.push(new expr_and_scope());
        RuleGrammarParser.expr_and_return retval = new RuleGrammarParser.expr_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUALITY68=null;
        RuleGrammarParser.expr_eq_neq_return expr_eq_neq67 = null;

        RuleGrammarParser.expr_eq_neq_return expr_eq_neq69 = null;


        Object EQUALITY68_tree=null;
        RewriteRuleTokenStream stream_EQUALITY=new RewriteRuleTokenStream(adaptor,"token EQUALITY");
        RewriteRuleSubtreeStream stream_expr_eq_neq=new RewriteRuleSubtreeStream(adaptor,"rule expr_eq_neq");

        	((expr_and_scope)expr_and_stack.peek()).hasEq = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:147:2: ( expr_eq_neq ( EQUALITY expr_eq_neq )* -> {$expr_and::hasEq}? ^( EQUALITY ( expr_eq_neq )+ ) -> expr_eq_neq )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:147:4: expr_eq_neq ( EQUALITY expr_eq_neq )*
            {
            pushFollow(FOLLOW_expr_eq_neq_in_expr_and633);
            expr_eq_neq67=expr_eq_neq();

            state._fsp--;

            stream_expr_eq_neq.add(expr_eq_neq67.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:147:16: ( EQUALITY expr_eq_neq )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==EQUALITY) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:147:17: EQUALITY expr_eq_neq
            	    {
            	    EQUALITY68=(Token)match(input,EQUALITY,FOLLOW_EQUALITY_in_expr_and636);  
            	    stream_EQUALITY.add(EQUALITY68);

            	    pushFollow(FOLLOW_expr_eq_neq_in_expr_and638);
            	    expr_eq_neq69=expr_eq_neq();

            	    state._fsp--;

            	    stream_expr_eq_neq.add(expr_eq_neq69.getTree());
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
            // 148:2: -> {$expr_and::hasEq}? ^( EQUALITY ( expr_eq_neq )+ )
            if (((expr_and_scope)expr_and_stack.peek()).hasEq) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:148:25: ^( EQUALITY ( expr_eq_neq )+ )
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
            else // 149:2: -> expr_eq_neq
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:151:1: expr_eq_neq : expr_comp ( INEQUALITY expr_comp )* -> {$expr_eq_neq::has}? ^( INEQUALITY ( expr_comp )+ ) -> expr_comp ;
    public final RuleGrammarParser.expr_eq_neq_return expr_eq_neq() throws RecognitionException {
        expr_eq_neq_stack.push(new expr_eq_neq_scope());
        RuleGrammarParser.expr_eq_neq_return retval = new RuleGrammarParser.expr_eq_neq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INEQUALITY71=null;
        RuleGrammarParser.expr_comp_return expr_comp70 = null;

        RuleGrammarParser.expr_comp_return expr_comp72 = null;


        Object INEQUALITY71_tree=null;
        RewriteRuleTokenStream stream_INEQUALITY=new RewriteRuleTokenStream(adaptor,"token INEQUALITY");
        RewriteRuleSubtreeStream stream_expr_comp=new RewriteRuleSubtreeStream(adaptor,"rule expr_comp");

        	((expr_eq_neq_scope)expr_eq_neq_stack.peek()).has = false;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:158:2: ( expr_comp ( INEQUALITY expr_comp )* -> {$expr_eq_neq::has}? ^( INEQUALITY ( expr_comp )+ ) -> expr_comp )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:158:4: expr_comp ( INEQUALITY expr_comp )*
            {
            pushFollow(FOLLOW_expr_comp_in_expr_eq_neq677);
            expr_comp70=expr_comp();

            state._fsp--;

            stream_expr_comp.add(expr_comp70.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:158:14: ( INEQUALITY expr_comp )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==INEQUALITY) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:158:15: INEQUALITY expr_comp
            	    {
            	    INEQUALITY71=(Token)match(input,INEQUALITY,FOLLOW_INEQUALITY_in_expr_eq_neq680);  
            	    stream_INEQUALITY.add(INEQUALITY71);

            	    pushFollow(FOLLOW_expr_comp_in_expr_eq_neq682);
            	    expr_comp72=expr_comp();

            	    state._fsp--;

            	    stream_expr_comp.add(expr_comp72.getTree());
            	    ((expr_eq_neq_scope)expr_eq_neq_stack.peek()).has = true;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);



            // AST REWRITE
            // elements: expr_comp, expr_comp, INEQUALITY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 159:2: -> {$expr_eq_neq::has}? ^( INEQUALITY ( expr_comp )+ )
            if (((expr_eq_neq_scope)expr_eq_neq_stack.peek()).has) {
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:159:26: ^( INEQUALITY ( expr_comp )+ )
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
            else // 160:2: -> expr_comp
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:164:1: expr_comp : expr_add_sub ( ( '+' | '-' ) expr_add_sub )* ;
    public final RuleGrammarParser.expr_comp_return expr_comp() throws RecognitionException {
        RuleGrammarParser.expr_comp_return retval = new RuleGrammarParser.expr_comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set74=null;
        RuleGrammarParser.expr_add_sub_return expr_add_sub73 = null;

        RuleGrammarParser.expr_add_sub_return expr_add_sub75 = null;


        Object set74_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:165:2: ( expr_add_sub ( ( '+' | '-' ) expr_add_sub )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:165:4: expr_add_sub ( ( '+' | '-' ) expr_add_sub )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_add_sub_in_expr_comp714);
            expr_add_sub73=expr_add_sub();

            state._fsp--;

            adaptor.addChild(root_0, expr_add_sub73.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:165:17: ( ( '+' | '-' ) expr_add_sub )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=36 && LA21_0<=37)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:165:18: ( '+' | '-' ) expr_add_sub
            	    {
            	    set74=(Token)input.LT(1);
            	    if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set74));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_add_sub_in_expr_comp725);
            	    expr_add_sub75=expr_add_sub();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_add_sub75.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:167:1: expr_add_sub : expr_mul_div ( ( '*' | '/' ) expr_mul_div )* ;
    public final RuleGrammarParser.expr_add_sub_return expr_add_sub() throws RecognitionException {
        RuleGrammarParser.expr_add_sub_return retval = new RuleGrammarParser.expr_add_sub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set77=null;
        RuleGrammarParser.expr_mul_div_return expr_mul_div76 = null;

        RuleGrammarParser.expr_mul_div_return expr_mul_div78 = null;


        Object set77_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:168:2: ( expr_mul_div ( ( '*' | '/' ) expr_mul_div )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:168:4: expr_mul_div ( ( '*' | '/' ) expr_mul_div )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub736);
            expr_mul_div76=expr_mul_div();

            state._fsp--;

            adaptor.addChild(root_0, expr_mul_div76.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:168:17: ( ( '*' | '/' ) expr_mul_div )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=38 && LA22_0<=39)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:168:18: ( '*' | '/' ) expr_mul_div
            	    {
            	    set77=(Token)input.LT(1);
            	    if ( (input.LA(1)>=38 && input.LA(1)<=39) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set77));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub747);
            	    expr_mul_div78=expr_mul_div();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_mul_div78.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:170:1: expr_mul_div : ( '!' )? expr_not ;
    public final RuleGrammarParser.expr_mul_div_return expr_mul_div() throws RecognitionException {
        RuleGrammarParser.expr_mul_div_return retval = new RuleGrammarParser.expr_mul_div_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal79=null;
        RuleGrammarParser.expr_not_return expr_not80 = null;


        Object char_literal79_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:171:2: ( ( '!' )? expr_not )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:171:4: ( '!' )? expr_not
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:171:4: ( '!' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:171:5: '!'
                    {
                    char_literal79=(Token)match(input,40,FOLLOW_40_in_expr_mul_div759); 
                    char_literal79_tree = (Object)adaptor.create(char_literal79);
                    adaptor.addChild(root_0, char_literal79_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_not_in_expr_mul_div763);
            expr_not80=expr_not();

            state._fsp--;

            adaptor.addChild(root_0, expr_not80.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:173:1: expr_not : ( '-' | '+' )? expr_unary ;
    public final RuleGrammarParser.expr_not_return expr_not() throws RecognitionException {
        RuleGrammarParser.expr_not_return retval = new RuleGrammarParser.expr_not_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set81=null;
        RuleGrammarParser.expr_unary_return expr_unary82 = null;


        Object set81_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:174:2: ( ( '-' | '+' )? expr_unary )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:174:4: ( '-' | '+' )? expr_unary
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:174:4: ( '-' | '+' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=36 && LA24_0<=37)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
                    {
                    set81=(Token)input.LT(1);
                    if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set81));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_unary_in_expr_not781);
            expr_unary82=expr_unary();

            state._fsp--;

            adaptor.addChild(root_0, expr_unary82.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:176:1: expr_unary : ( (m1= memberIdentifier ':' )? m2= memberIdentifier | INT | '(' pattern ')' ) ;
    public final RuleGrammarParser.expr_unary_return expr_unary() throws RecognitionException {
        RuleGrammarParser.expr_unary_return retval = new RuleGrammarParser.expr_unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal83=null;
        Token INT84=null;
        Token char_literal85=null;
        Token char_literal87=null;
        RuleGrammarParser.memberIdentifier_return m1 = null;

        RuleGrammarParser.memberIdentifier_return m2 = null;

        RuleGrammarParser.pattern_return pattern86 = null;


        Object char_literal83_tree=null;
        Object INT84_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:177:2: ( ( (m1= memberIdentifier ':' )? m2= memberIdentifier | INT | '(' pattern ')' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:177:4: ( (m1= memberIdentifier ':' )? m2= memberIdentifier | INT | '(' pattern ')' )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:177:4: ( (m1= memberIdentifier ':' )? m2= memberIdentifier | INT | '(' pattern ')' )
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
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:177:5: (m1= memberIdentifier ':' )? m2= memberIdentifier
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:177:5: (m1= memberIdentifier ':' )?
                    int alt25=2;
                    alt25 = dfa25.predict(input);
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:177:6: m1= memberIdentifier ':'
                            {
                            pushFollow(FOLLOW_memberIdentifier_in_expr_unary794);
                            m1=memberIdentifier();

                            state._fsp--;

                            adaptor.addChild(root_0, m1.getTree());
                            char_literal83=(Token)match(input,20,FOLLOW_20_in_expr_unary796); 
                            char_literal83_tree = (Object)adaptor.create(char_literal83);
                            adaptor.addChild(root_0, char_literal83_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_memberIdentifier_in_expr_unary802);
                    m2=memberIdentifier();

                    state._fsp--;

                    adaptor.addChild(root_0, m2.getTree());

                    	 	if (((HashMap)classTable.get(((ruleWhen_scope)ruleWhen_stack.peek()).declName)).get((m2!=null?input.toString(m2.start,m2.stop):null)) == null)
                    	 		System.err.println("The variable " + (m2!=null?input.toString(m2.start,m2.stop):null) + " is not a member of " + ((ruleWhen_scope)ruleWhen_stack.peek()).declName + " and was not previously bound.");
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:182:4: INT
                    {
                    INT84=(Token)match(input,INT,FOLLOW_INT_in_expr_unary810); 
                    INT84_tree = (Object)adaptor.create(INT84);
                    adaptor.addChild(root_0, INT84_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:182:10: '(' pattern ')'
                    {
                    char_literal85=(Token)match(input,22,FOLLOW_22_in_expr_unary814); 
                    char_literal85_tree = (Object)adaptor.create(char_literal85);
                    adaptor.addChild(root_0, char_literal85_tree);

                    pushFollow(FOLLOW_pattern_in_expr_unary816);
                    pattern86=pattern();

                    state._fsp--;

                    adaptor.addChild(root_0, pattern86.getTree());
                    char_literal87=(Token)match(input,23,FOLLOW_23_in_expr_unary818); 
                    char_literal87_tree = (Object)adaptor.create(char_literal87);
                    adaptor.addChild(root_0, char_literal87_tree);


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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:184:1: identifier : ID ( ID | INT )* ;
    public final RuleGrammarParser.identifier_return identifier() throws RecognitionException {
        RuleGrammarParser.identifier_return retval = new RuleGrammarParser.identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID88=null;
        Token set89=null;

        Object ID88_tree=null;
        Object set89_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:185:2: ( ID ( ID | INT )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:185:4: ID ( ID | INT )*
            {
            root_0 = (Object)adaptor.nil();

            ID88=(Token)match(input,ID,FOLLOW_ID_in_identifier828); 
            ID88_tree = (Object)adaptor.create(ID88);
            adaptor.addChild(root_0, ID88_tree);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:185:7: ( ID | INT )*
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
            	    set89=(Token)input.LT(1);
            	    if ( (input.LA(1)>=INT && input.LA(1)<=ID) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set89));
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

    public static class memberIdentifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberIdentifier"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:187:1: memberIdentifier : ID ( ID | INT )* ;
    public final RuleGrammarParser.memberIdentifier_return memberIdentifier() throws RecognitionException {
        RuleGrammarParser.memberIdentifier_return retval = new RuleGrammarParser.memberIdentifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID90=null;
        Token set91=null;

        Object ID90_tree=null;
        Object set91_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:189:2: ( ID ( ID | INT )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:189:4: ID ( ID | INT )*
            {
            root_0 = (Object)adaptor.nil();

            ID90=(Token)match(input,ID,FOLLOW_ID_in_memberIdentifier847); 
            ID90_tree = (Object)adaptor.create(ID90);
            adaptor.addChild(root_0, ID90_tree);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:189:7: ( ID | INT )*
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
            	    set91=(Token)input.LT(1);
            	    if ( (input.LA(1)>=INT && input.LA(1)<=ID) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set91));
            	        state.errorRecovery=false;
            	    }
            	    else {
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
    // $ANTLR end "memberIdentifier"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA10_eotS =
        "\6\uffff";
    static final String DFA10_eofS =
        "\6\uffff";
    static final String DFA10_minS =
        "\1\14\1\uffff\2\13\2\uffff";
    static final String DFA10_maxS =
        "\1\25\1\uffff\2\26\2\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3";
    static final String DFA10_specialS =
        "\6\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\10\uffff\1\1",
            "",
            "\2\3\7\uffff\1\4\1\uffff\1\5",
            "\2\3\7\uffff\1\4\1\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "92:4: ( 'not' | ( identifier ':' ) )?";
        }
    }
    static final String DFA25_eotS =
        "\5\uffff";
    static final String DFA25_eofS =
        "\5\uffff";
    static final String DFA25_minS =
        "\1\14\2\11\2\uffff";
    static final String DFA25_maxS =
        "\1\14\2\47\2\uffff";
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
            return "177:5: (m1= memberIdentifier ':' )?";
        }
    }
 

    public static final BitSet FOLLOW_rule_in_prog73 = new BitSet(new long[]{0x00000000000C4082L});
    public static final BitSet FOLLOW_comment_in_prog77 = new BitSet(new long[]{0x00000000000C4082L});
    public static final BitSet FOLLOW_decl_in_prog81 = new BitSet(new long[]{0x00000000000C4082L});
    public static final BitSet FOLLOW_NEWLINE_in_prog87 = new BitSet(new long[]{0x00000000000C4082L});
    public static final BitSet FOLLOW_14_in_rule101 = new BitSet(new long[]{0x000001FFFFFC3F70L});
    public static final BitSet FOLLOW_ruleName_in_rule103 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_rule105 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rule107 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_ruleWhen_in_rule109 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_NEWLINE_in_rule111 = new BitSet(new long[]{0x0000000000010080L});
    public static final BitSet FOLLOW_16_in_rule114 = new BitSet(new long[]{0x000001FFFFFC3E70L});
    public static final BitSet FOLLOW_ruleThen_in_rule116 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_NEWLINE_in_rule118 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_17_in_rule121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_comment147 = new BitSet(new long[]{0x000001FFFFFFFFF0L});
    public static final BitSet FOLLOW_NEWLINE_in_comment152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_decl172 = new BitSet(new long[]{0x000001FFFFF5FF70L});
    public static final BitSet FOLLOW_declName_in_decl174 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NEWLINE_in_decl176 = new BitSet(new long[]{0x000001FFFFFDFF70L});
    public static final BitSet FOLLOW_declMember_in_decl180 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_NEWLINE_in_decl185 = new BitSet(new long[]{0x000001FFFFFDFF70L});
    public static final BitSet FOLLOW_declMember_in_decl189 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_NEWLINE_in_decl195 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_17_in_decl198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub2_in_declName213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttribute_in_declMember226 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_declMember228 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_declAttributeType_in_declMember230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub1_in_ruleName242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName247 = new BitSet(new long[]{0x000001FFFFFC3E70L});
    public static final BitSet FOLLOW_sub1_in_ruleName249 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhen276 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_ruleWhen1_in_ruleWhen279 = new BitSet(new long[]{0x0000000006201082L});
    public static final BitSet FOLLOW_ruleWhenK_in_ruleWhen281 = new BitSet(new long[]{0x0000000006201082L});
    public static final BitSet FOLLOW_21_in_ruleWhen1305 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_identifier_in_ruleWhen1310 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWhen1312 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhen1317 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWhen1321 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_pattern_in_ruleWhen1323 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleWhen1325 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhen1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWhen1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleWhenK354 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_26_in_ruleWhenK358 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_21_in_ruleWhenK362 = new BitSet(new long[]{0x0000000000201080L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhenK366 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleWhenK370 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_pattern_in_ruleWhenK372 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleWhenK374 = new BitSet(new long[]{0x0000000001000080L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleWhenK377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWhenK381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub1_in_ruleThen400 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleThen403 = new BitSet(new long[]{0x000001FFFFFC3E70L});
    public static final BitSet FOLLOW_sub1_in_ruleThen405 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_set_in_sub1417 = new BitSet(new long[]{0x000001FFFFFC3E72L});
    public static final BitSet FOLLOW_set_in_sub2452 = new BitSet(new long[]{0x000001FFFFF5FF72L});
    public static final BitSet FOLLOW_set_in_declAttribute475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declAttributeType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_ant_class525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_in_pattern545 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_pattern548 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_expr_or_in_pattern550 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_expr_and_in_expr_or589 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_expr_or592 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_expr_and_in_expr_or594 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_expr_eq_neq_in_expr_and633 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_EQUALITY_in_expr_and636 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_expr_eq_neq_in_expr_and638 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_expr_comp_in_expr_eq_neq677 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_INEQUALITY_in_expr_eq_neq680 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_expr_comp_in_expr_eq_neq682 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_comp714 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_set_in_expr_comp717 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_comp725 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub736 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_set_in_expr_add_sub739 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub747 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_40_in_expr_mul_div759 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_expr_not_in_expr_mul_div763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr_not772 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_expr_unary_in_expr_not781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberIdentifier_in_expr_unary794 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_expr_unary796 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_memberIdentifier_in_expr_unary802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr_unary810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_expr_unary814 = new BitSet(new long[]{0x0000013000401800L});
    public static final BitSet FOLLOW_pattern_in_expr_unary816 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_expr_unary818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier828 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_set_in_identifier830 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ID_in_memberIdentifier847 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_set_in_memberIdentifier849 = new BitSet(new long[]{0x0000000000001802L});

}