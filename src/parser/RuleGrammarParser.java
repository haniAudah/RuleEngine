// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g 2012-12-16 19:35:27

	package parser;
	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RuleGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEWLINE", "QUOTE", "ID", "INT", "WS", "'rule'", "'when'", "'then'", "'end'", "'//'", "'declare'", "':'", "'not'", "'('", "')'", "';'", "'and'", "'or'", "'String'", "'Integer'", "'int'", "'long'", "'Decimal'", "'Char'", "'double'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'"
    };
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int NEWLINE=4;
    public static final int QUOTE=5;
    public static final int ID=6;
    public static final int INT=7;
    public static final int WS=8;

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


    	HashMap classTable = new HashMap();
    	HashMap ruleTable = new HashMap();
    	ArrayList classList = new ArrayList();


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:24:1: prog : ( rule | comment | decl | NEWLINE )+ ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:2: ( ( rule | comment | decl | NEWLINE )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:4: ( rule | comment | decl | NEWLINE )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:4: ( rule | comment | decl | NEWLINE )+
            int cnt1=0;
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 9:
                    {
                    alt1=1;
                    }
                    break;
                case 13:
                    {
                    alt1=2;
                    }
                    break;
                case 14:
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
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:5: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_prog56);
            	    rule1=rule();

            	    state._fsp--;

            	    adaptor.addChild(root_0, rule1.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:12: comment
            	    {
            	    pushFollow(FOLLOW_comment_in_prog60);
            	    comment2=comment();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comment2.getTree());

            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:22: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_prog64);
            	    decl3=decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, decl3.getTree());

            	    }
            	    break;
            	case 4 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:29: NEWLINE
            	    {
            	    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_prog68); 
            	    NEWLINE4_tree = (Object)adaptor.create(NEWLINE4);
            	    adaptor.addChild(root_0, NEWLINE4_tree);


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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:27:1: rule : 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' ;
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

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:2: ( 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:4: 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal5=(Token)match(input,9,FOLLOW_9_in_rule79); 
            string_literal5_tree = (Object)adaptor.create(string_literal5);
            adaptor.addChild(root_0, string_literal5_tree);

            pushFollow(FOLLOW_ruleName_in_rule81);
            ruleName6=ruleName();

            state._fsp--;

            adaptor.addChild(root_0, ruleName6.getTree());
            NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule83); 
            NEWLINE7_tree = (Object)adaptor.create(NEWLINE7);
            adaptor.addChild(root_0, NEWLINE7_tree);

            string_literal8=(Token)match(input,10,FOLLOW_10_in_rule85); 
            string_literal8_tree = (Object)adaptor.create(string_literal8);
            adaptor.addChild(root_0, string_literal8_tree);

            pushFollow(FOLLOW_ruleWhen_in_rule87);
            ruleWhen9=ruleWhen();

            state._fsp--;

            adaptor.addChild(root_0, ruleWhen9.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:44: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:44: NEWLINE
            	    {
            	    NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule89); 
            	    NEWLINE10_tree = (Object)adaptor.create(NEWLINE10);
            	    adaptor.addChild(root_0, NEWLINE10_tree);


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            string_literal11=(Token)match(input,11,FOLLOW_11_in_rule92); 
            string_literal11_tree = (Object)adaptor.create(string_literal11);
            adaptor.addChild(root_0, string_literal11_tree);

            pushFollow(FOLLOW_ruleThen_in_rule94);
            ruleThen12=ruleThen();

            state._fsp--;

            adaptor.addChild(root_0, ruleThen12.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:69: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:69: NEWLINE
            	    {
            	    NEWLINE13=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_rule96); 
            	    NEWLINE13_tree = (Object)adaptor.create(NEWLINE13);
            	    adaptor.addChild(root_0, NEWLINE13_tree);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            string_literal14=(Token)match(input,12,FOLLOW_12_in_rule99); 
            string_literal14_tree = (Object)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);


            	 		if (ruleTable.get((ruleName6!=null?input.toString(ruleName6.start,ruleName6.stop):null)) != null)
            	 		{
            	 			System.err.println("Attempting to redefine rule " + (ruleName6!=null?input.toString(ruleName6.start,ruleName6.stop):null) + " at line " + (((Token)retval.start)).getLine());
            	 		}
            	 		else
            	 		{
            	 			ruleTable.put((ruleName6!=null?input.toString(ruleName6.start,ruleName6.stop):null), "bla");
            	 			//TODO Decide on how you want to store the rule
            	 		}
            	 		System.out.println("Rule Found!!");
             		

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:42:1: comment : '//' ( . )* NEWLINE ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:43:2: ( '//' ( . )* NEWLINE )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:43:4: '//' ( . )* NEWLINE
            {
            root_0 = (Object)adaptor.nil();

            string_literal15=(Token)match(input,13,FOLLOW_13_in_comment113); 
            string_literal15_tree = (Object)adaptor.create(string_literal15);
            adaptor.addChild(root_0, string_literal15_tree);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:43:9: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=2;
                }
                else if ( ((LA4_0>=QUOTE && LA4_0<=41)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:43:9: .
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

            NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comment118); 
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:47:1: decl : 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end' ;
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
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:54:2: ( 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:54:4: 'declare' declName NEWLINE d= declMember ( NEWLINE d= declMember )* ( NEWLINE )* 'end'
            {
            root_0 = (Object)adaptor.nil();

            string_literal18=(Token)match(input,14,FOLLOW_14_in_decl138); 
            string_literal18_tree = (Object)adaptor.create(string_literal18);
            adaptor.addChild(root_0, string_literal18_tree);

            pushFollow(FOLLOW_declName_in_decl140);
            declName19=declName();

            state._fsp--;

            adaptor.addChild(root_0, declName19.getTree());
            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl142); 
            NEWLINE20_tree = (Object)adaptor.create(NEWLINE20);
            adaptor.addChild(root_0, NEWLINE20_tree);

            pushFollow(FOLLOW_declMember_in_decl146);
            d=declMember();

            state._fsp--;

            adaptor.addChild(root_0, d.getTree());
            ((decl_scope)decl_stack.peek()).newClass.put((d!=null?d.attr:null), (d!=null?d.type:null));
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:54:85: ( NEWLINE d= declMember )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    int LA5_1 = input.LA(2);

                    if ( ((LA5_1>=QUOTE && LA5_1<=11)||(LA5_1>=13 && LA5_1<=41)) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:54:86: NEWLINE d= declMember
            	    {
            	    NEWLINE21=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl151); 
            	    NEWLINE21_tree = (Object)adaptor.create(NEWLINE21);
            	    adaptor.addChild(root_0, NEWLINE21_tree);

            	    pushFollow(FOLLOW_declMember_in_decl155);
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

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:54:150: ( NEWLINE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:54:150: NEWLINE
            	    {
            	    NEWLINE22=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_decl161); 
            	    NEWLINE22_tree = (Object)adaptor.create(NEWLINE22);
            	    adaptor.addChild(root_0, NEWLINE22_tree);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            string_literal23=(Token)match(input,12,FOLLOW_12_in_decl164); 
            string_literal23_tree = (Object)adaptor.create(string_literal23);
            adaptor.addChild(root_0, string_literal23_tree);


            	 		if (classTable.get((declName19!=null?input.toString(declName19.start,declName19.stop):null)) != null)
            	 		{
            	 			System.err.println("Attempting to redefine variable " + (declName19!=null?input.toString(declName19.start,declName19.stop):null) + " at line " + (((Token)retval.start)).getLine());
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:67:1: declName : sub2 ;
    public final RuleGrammarParser.declName_return declName() throws RecognitionException {
        RuleGrammarParser.declName_return retval = new RuleGrammarParser.declName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.sub2_return sub224 = null;



        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:68:2: ( sub2 )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:68:4: sub2
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sub2_in_declName178);
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:70:1: declMember returns [String attr, String type] : declAttribute ':' declAttributeType ;
    public final RuleGrammarParser.declMember_return declMember() throws RecognitionException {
        RuleGrammarParser.declMember_return retval = new RuleGrammarParser.declMember_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        RuleGrammarParser.declAttribute_return declAttribute25 = null;

        RuleGrammarParser.declAttributeType_return declAttributeType27 = null;


        Object char_literal26_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:71:2: ( declAttribute ':' declAttributeType )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:71:4: declAttribute ':' declAttributeType
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_declAttribute_in_declMember191);
            declAttribute25=declAttribute();

            state._fsp--;

            adaptor.addChild(root_0, declAttribute25.getTree());
            char_literal26=(Token)match(input,15,FOLLOW_15_in_declMember193); 
            char_literal26_tree = (Object)adaptor.create(char_literal26);
            adaptor.addChild(root_0, char_literal26_tree);

            pushFollow(FOLLOW_declAttributeType_in_declMember195);
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:73:1: ruleName : ( sub1 | ( QUOTE sub1 QUOTE ) ) ;
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

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:2: ( ( sub1 | ( QUOTE sub1 QUOTE ) ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:4: ( sub1 | ( QUOTE sub1 QUOTE ) )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:4: ( sub1 | ( QUOTE sub1 QUOTE ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=ID && LA7_0<=WS)||(LA7_0>=13 && LA7_0<=41)) ) {
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
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:5: sub1
                    {
                    pushFollow(FOLLOW_sub1_in_ruleName207);
                    sub128=sub1();

                    state._fsp--;

                    adaptor.addChild(root_0, sub128.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:12: ( QUOTE sub1 QUOTE )
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:12: ( QUOTE sub1 QUOTE )
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:13: QUOTE sub1 QUOTE
                    {
                    QUOTE29=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName212); 
                    QUOTE29_tree = (Object)adaptor.create(QUOTE29);
                    adaptor.addChild(root_0, QUOTE29_tree);

                    pushFollow(FOLLOW_sub1_in_ruleName214);
                    sub130=sub1();

                    state._fsp--;

                    adaptor.addChild(root_0, sub130.getTree());
                    QUOTE31=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_ruleName216); 
                    QUOTE31_tree = (Object)adaptor.create(QUOTE31);
                    adaptor.addChild(root_0, QUOTE31_tree);


                    }


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
    // $ANTLR end "ruleName"

    public static class ruleWhen_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleWhen"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:76:1: ruleWhen : ( 'not' | ( identifier ':' ) )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ( ( 'and' | 'or' | 'not' ) ant_class '(' pattern ')' ( NEWLINE | ';' ) )* ;
    public final RuleGrammarParser.ruleWhen_return ruleWhen() throws RecognitionException {
        RuleGrammarParser.ruleWhen_return retval = new RuleGrammarParser.ruleWhen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal32=null;
        Token char_literal34=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token set39=null;
        Token set40=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Token set45=null;
        RuleGrammarParser.identifier_return identifier33 = null;

        RuleGrammarParser.ant_class_return ant_class35 = null;

        RuleGrammarParser.pattern_return pattern37 = null;

        RuleGrammarParser.ant_class_return ant_class41 = null;

        RuleGrammarParser.pattern_return pattern43 = null;


        Object string_literal32_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        Object set39_tree=null;
        Object set40_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        Object set45_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:2: ( ( 'not' | ( identifier ':' ) )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ( ( 'and' | 'or' | 'not' ) ant_class '(' pattern ')' ( NEWLINE | ';' ) )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:4: ( 'not' | ( identifier ':' ) )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ( ( 'and' | 'or' | 'not' ) ant_class '(' pattern ')' ( NEWLINE | ';' ) )*
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:4: ( 'not' | ( identifier ':' ) )?
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:5: 'not'
                    {
                    string_literal32=(Token)match(input,16,FOLLOW_16_in_ruleWhen228); 
                    string_literal32_tree = (Object)adaptor.create(string_literal32);
                    adaptor.addChild(root_0, string_literal32_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:13: ( identifier ':' )
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:13: ( identifier ':' )
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:14: identifier ':'
                    {
                    pushFollow(FOLLOW_identifier_in_ruleWhen233);
                    identifier33=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier33.getTree());
                    char_literal34=(Token)match(input,15,FOLLOW_15_in_ruleWhen235); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);


                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_ant_class_in_ruleWhen240);
            ant_class35=ant_class();

            state._fsp--;

            adaptor.addChild(root_0, ant_class35.getTree());
            char_literal36=(Token)match(input,17,FOLLOW_17_in_ruleWhen242); 
            char_literal36_tree = (Object)adaptor.create(char_literal36);
            adaptor.addChild(root_0, char_literal36_tree);

            pushFollow(FOLLOW_pattern_in_ruleWhen244);
            pattern37=pattern();

            state._fsp--;

            adaptor.addChild(root_0, pattern37.getTree());
            char_literal38=(Token)match(input,18,FOLLOW_18_in_ruleWhen246); 
            char_literal38_tree = (Object)adaptor.create(char_literal38);
            adaptor.addChild(root_0, char_literal38_tree);

            set39=(Token)input.LT(1);
            if ( input.LA(1)==NEWLINE||input.LA(1)==19 ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set39));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:78:3: ( ( 'and' | 'or' | 'not' ) ant_class '(' pattern ')' ( NEWLINE | ';' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16||(LA9_0>=20 && LA9_0<=21)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:78:4: ( 'and' | 'or' | 'not' ) ant_class '(' pattern ')' ( NEWLINE | ';' )
            	    {
            	    set40=(Token)input.LT(1);
            	    if ( input.LA(1)==16||(input.LA(1)>=20 && input.LA(1)<=21) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set40));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_ant_class_in_ruleWhen271);
            	    ant_class41=ant_class();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ant_class41.getTree());
            	    char_literal42=(Token)match(input,17,FOLLOW_17_in_ruleWhen273); 
            	    char_literal42_tree = (Object)adaptor.create(char_literal42);
            	    adaptor.addChild(root_0, char_literal42_tree);

            	    pushFollow(FOLLOW_pattern_in_ruleWhen275);
            	    pattern43=pattern();

            	    state._fsp--;

            	    adaptor.addChild(root_0, pattern43.getTree());
            	    char_literal44=(Token)match(input,18,FOLLOW_18_in_ruleWhen277); 
            	    char_literal44_tree = (Object)adaptor.create(char_literal44);
            	    adaptor.addChild(root_0, char_literal44_tree);

            	    set45=(Token)input.LT(1);
            	    if ( input.LA(1)==NEWLINE||input.LA(1)==19 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set45));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleWhen"

    public static class ruleThen_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ruleThen"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:80:1: ruleThen : sub1 ( NEWLINE sub1 )* ;
    public final RuleGrammarParser.ruleThen_return ruleThen() throws RecognitionException {
        RuleGrammarParser.ruleThen_return retval = new RuleGrammarParser.ruleThen_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NEWLINE47=null;
        RuleGrammarParser.sub1_return sub146 = null;

        RuleGrammarParser.sub1_return sub148 = null;


        Object NEWLINE47_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:2: ( sub1 ( NEWLINE sub1 )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:4: sub1 ( NEWLINE sub1 )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_sub1_in_ruleThen296);
            sub146=sub1();

            state._fsp--;

            adaptor.addChild(root_0, sub146.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:9: ( NEWLINE sub1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==NEWLINE) ) {
                    int LA10_1 = input.LA(2);

                    if ( ((LA10_1>=ID && LA10_1<=WS)||(LA10_1>=13 && LA10_1<=41)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:81:10: NEWLINE sub1
            	    {
            	    NEWLINE47=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleThen299); 
            	    NEWLINE47_tree = (Object)adaptor.create(NEWLINE47);
            	    adaptor.addChild(root_0, NEWLINE47_tree);

            	    pushFollow(FOLLOW_sub1_in_ruleThen301);
            	    sub148=sub1();

            	    state._fsp--;

            	    adaptor.addChild(root_0, sub148.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:83:1: sub1 : (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ ;
    public final RuleGrammarParser.sub1_return sub1() throws RecognitionException {
        RuleGrammarParser.sub1_return retval = new RuleGrammarParser.sub1_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set49=null;

        Object set49_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:84:2: ( (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:84:4: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:84:4: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=ID && LA11_0<=WS)||(LA11_0>=13 && LA11_0<=41)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:84:5: ~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE )
            	    {
            	    set49=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ID && input.LA(1)<=WS)||(input.LA(1)>=13 && input.LA(1)<=41) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set49));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:1: sub2 : (~ ( NEWLINE | 'declare' | 'end' ) )+ ;
    public final RuleGrammarParser.sub2_return sub2() throws RecognitionException {
        RuleGrammarParser.sub2_return retval = new RuleGrammarParser.sub2_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set50=null;

        Object set50_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:2: ( (~ ( NEWLINE | 'declare' | 'end' ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:4: (~ ( NEWLINE | 'declare' | 'end' ) )+
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:4: (~ ( NEWLINE | 'declare' | 'end' ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=QUOTE && LA12_0<=11)||LA12_0==13||(LA12_0>=15 && LA12_0<=41)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:87:5: ~ ( NEWLINE | 'declare' | 'end' )
            	    {
            	    set50=(Token)input.LT(1);
            	    if ( (input.LA(1)>=QUOTE && input.LA(1)<=11)||input.LA(1)==13||(input.LA(1)>=15 && input.LA(1)<=41) ) {
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:89:1: declAttribute : (~ ( NEWLINE | 'end' ) ) ;
    public final RuleGrammarParser.declAttribute_return declAttribute() throws RecognitionException {
        RuleGrammarParser.declAttribute_return retval = new RuleGrammarParser.declAttribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set51=null;

        Object set51_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:90:2: ( (~ ( NEWLINE | 'end' ) ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:90:4: (~ ( NEWLINE | 'end' ) )
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:90:4: (~ ( NEWLINE | 'end' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:90:5: ~ ( NEWLINE | 'end' )
            {
            set51=(Token)input.LT(1);
            if ( (input.LA(1)>=QUOTE && input.LA(1)<=11)||(input.LA(1)>=13 && input.LA(1)<=41) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set51));
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:1: declAttributeType : ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double' );
    public final RuleGrammarParser.declAttributeType_return declAttributeType() throws RecognitionException {
        RuleGrammarParser.declAttributeType_return retval = new RuleGrammarParser.declAttributeType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set52=null;

        Object set52_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:93:2: ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' | 'double' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            {
            root_0 = (Object)adaptor.nil();

            set52=(Token)input.LT(1);
            if ( (input.LA(1)>=22 && input.LA(1)<=28) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set52));
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:1: ant_class : identifier ;
    public final RuleGrammarParser.ant_class_return ant_class() throws RecognitionException {
        RuleGrammarParser.ant_class_return retval = new RuleGrammarParser.ant_class_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        RuleGrammarParser.identifier_return identifier53 = null;



        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:2: ( identifier )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:4: identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_ant_class421);
            identifier53=identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier53.getTree());

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

    public static class pattern_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:100:1: pattern : expr_or ( '||' expr_or )* ;
    public final RuleGrammarParser.pattern_return pattern() throws RecognitionException {
        RuleGrammarParser.pattern_return retval = new RuleGrammarParser.pattern_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal55=null;
        RuleGrammarParser.expr_or_return expr_or54 = null;

        RuleGrammarParser.expr_or_return expr_or56 = null;


        Object string_literal55_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:101:2: ( expr_or ( '||' expr_or )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:101:4: expr_or ( '||' expr_or )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_or_in_pattern432);
            expr_or54=expr_or();

            state._fsp--;

            adaptor.addChild(root_0, expr_or54.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:101:12: ( '||' expr_or )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:101:13: '||' expr_or
            	    {
            	    string_literal55=(Token)match(input,29,FOLLOW_29_in_pattern435); 
            	    string_literal55_tree = (Object)adaptor.create(string_literal55);
            	    adaptor.addChild(root_0, string_literal55_tree);

            	    pushFollow(FOLLOW_expr_or_in_pattern437);
            	    expr_or56=expr_or();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_or56.getTree());

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
    // $ANTLR end "pattern"

    public static class expr_or_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_or"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:103:1: expr_or : expr_and ( '&&' expr_and )* ;
    public final RuleGrammarParser.expr_or_return expr_or() throws RecognitionException {
        RuleGrammarParser.expr_or_return retval = new RuleGrammarParser.expr_or_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal58=null;
        RuleGrammarParser.expr_and_return expr_and57 = null;

        RuleGrammarParser.expr_and_return expr_and59 = null;


        Object string_literal58_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:104:2: ( expr_and ( '&&' expr_and )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:104:4: expr_and ( '&&' expr_and )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_and_in_expr_or448);
            expr_and57=expr_and();

            state._fsp--;

            adaptor.addChild(root_0, expr_and57.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:104:13: ( '&&' expr_and )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:104:14: '&&' expr_and
            	    {
            	    string_literal58=(Token)match(input,30,FOLLOW_30_in_expr_or451); 
            	    string_literal58_tree = (Object)adaptor.create(string_literal58);
            	    adaptor.addChild(root_0, string_literal58_tree);

            	    pushFollow(FOLLOW_expr_and_in_expr_or453);
            	    expr_and59=expr_and();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_and59.getTree());

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
    // $ANTLR end "expr_or"

    public static class expr_and_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_and"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:106:1: expr_and : expr_eq_neq ( ( '==' | '!=' ) expr_eq_neq )* ;
    public final RuleGrammarParser.expr_and_return expr_and() throws RecognitionException {
        RuleGrammarParser.expr_and_return retval = new RuleGrammarParser.expr_and_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set61=null;
        RuleGrammarParser.expr_eq_neq_return expr_eq_neq60 = null;

        RuleGrammarParser.expr_eq_neq_return expr_eq_neq62 = null;


        Object set61_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:107:2: ( expr_eq_neq ( ( '==' | '!=' ) expr_eq_neq )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:107:4: expr_eq_neq ( ( '==' | '!=' ) expr_eq_neq )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_eq_neq_in_expr_and464);
            expr_eq_neq60=expr_eq_neq();

            state._fsp--;

            adaptor.addChild(root_0, expr_eq_neq60.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:107:16: ( ( '==' | '!=' ) expr_eq_neq )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=32)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:107:17: ( '==' | '!=' ) expr_eq_neq
            	    {
            	    set61=(Token)input.LT(1);
            	    if ( (input.LA(1)>=31 && input.LA(1)<=32) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set61));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_eq_neq_in_expr_and475);
            	    expr_eq_neq62=expr_eq_neq();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_eq_neq62.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // $ANTLR end "expr_and"

    public static class expr_eq_neq_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_eq_neq"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:109:1: expr_eq_neq : expr_comp ( ( '>=' | '<=' | '>' | '<' ) expr_comp )* ;
    public final RuleGrammarParser.expr_eq_neq_return expr_eq_neq() throws RecognitionException {
        RuleGrammarParser.expr_eq_neq_return retval = new RuleGrammarParser.expr_eq_neq_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set64=null;
        RuleGrammarParser.expr_comp_return expr_comp63 = null;

        RuleGrammarParser.expr_comp_return expr_comp65 = null;


        Object set64_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:110:2: ( expr_comp ( ( '>=' | '<=' | '>' | '<' ) expr_comp )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:110:4: expr_comp ( ( '>=' | '<=' | '>' | '<' ) expr_comp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_comp_in_expr_eq_neq486);
            expr_comp63=expr_comp();

            state._fsp--;

            adaptor.addChild(root_0, expr_comp63.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:110:14: ( ( '>=' | '<=' | '>' | '<' ) expr_comp )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=33 && LA16_0<=36)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:110:15: ( '>=' | '<=' | '>' | '<' ) expr_comp
            	    {
            	    set64=(Token)input.LT(1);
            	    if ( (input.LA(1)>=33 && input.LA(1)<=36) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set64));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_comp_in_expr_eq_neq505);
            	    expr_comp65=expr_comp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_comp65.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // $ANTLR end "expr_eq_neq"

    public static class expr_comp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr_comp"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:114:1: expr_comp : expr_add_sub ( ( '+' | '-' ) expr_add_sub )* ;
    public final RuleGrammarParser.expr_comp_return expr_comp() throws RecognitionException {
        RuleGrammarParser.expr_comp_return retval = new RuleGrammarParser.expr_comp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set67=null;
        RuleGrammarParser.expr_add_sub_return expr_add_sub66 = null;

        RuleGrammarParser.expr_add_sub_return expr_add_sub68 = null;


        Object set67_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:115:2: ( expr_add_sub ( ( '+' | '-' ) expr_add_sub )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:115:4: expr_add_sub ( ( '+' | '-' ) expr_add_sub )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_add_sub_in_expr_comp518);
            expr_add_sub66=expr_add_sub();

            state._fsp--;

            adaptor.addChild(root_0, expr_add_sub66.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:115:17: ( ( '+' | '-' ) expr_add_sub )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=37 && LA17_0<=38)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:115:18: ( '+' | '-' ) expr_add_sub
            	    {
            	    set67=(Token)input.LT(1);
            	    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set67));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_add_sub_in_expr_comp529);
            	    expr_add_sub68=expr_add_sub();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_add_sub68.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:117:1: expr_add_sub : expr_mul_div ( ( '*' | '/' ) expr_mul_div )* ;
    public final RuleGrammarParser.expr_add_sub_return expr_add_sub() throws RecognitionException {
        RuleGrammarParser.expr_add_sub_return retval = new RuleGrammarParser.expr_add_sub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set70=null;
        RuleGrammarParser.expr_mul_div_return expr_mul_div69 = null;

        RuleGrammarParser.expr_mul_div_return expr_mul_div71 = null;


        Object set70_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:118:2: ( expr_mul_div ( ( '*' | '/' ) expr_mul_div )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:118:4: expr_mul_div ( ( '*' | '/' ) expr_mul_div )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub540);
            expr_mul_div69=expr_mul_div();

            state._fsp--;

            adaptor.addChild(root_0, expr_mul_div69.getTree());
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:118:17: ( ( '*' | '/' ) expr_mul_div )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=39 && LA18_0<=40)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:118:18: ( '*' | '/' ) expr_mul_div
            	    {
            	    set70=(Token)input.LT(1);
            	    if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set70));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub551);
            	    expr_mul_div71=expr_mul_div();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr_mul_div71.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:120:1: expr_mul_div : ( '!' )? expr_not ;
    public final RuleGrammarParser.expr_mul_div_return expr_mul_div() throws RecognitionException {
        RuleGrammarParser.expr_mul_div_return retval = new RuleGrammarParser.expr_mul_div_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal72=null;
        RuleGrammarParser.expr_not_return expr_not73 = null;


        Object char_literal72_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:121:2: ( ( '!' )? expr_not )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:121:4: ( '!' )? expr_not
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:121:4: ( '!' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:121:5: '!'
                    {
                    char_literal72=(Token)match(input,41,FOLLOW_41_in_expr_mul_div563); 
                    char_literal72_tree = (Object)adaptor.create(char_literal72);
                    adaptor.addChild(root_0, char_literal72_tree);


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_not_in_expr_mul_div567);
            expr_not73=expr_not();

            state._fsp--;

            adaptor.addChild(root_0, expr_not73.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:123:1: expr_not : ( '-' | '+' )? expr_unary ;
    public final RuleGrammarParser.expr_not_return expr_not() throws RecognitionException {
        RuleGrammarParser.expr_not_return retval = new RuleGrammarParser.expr_not_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set74=null;
        RuleGrammarParser.expr_unary_return expr_unary75 = null;


        Object set74_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:2: ( ( '-' | '+' )? expr_unary )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:4: ( '-' | '+' )? expr_unary
            {
            root_0 = (Object)adaptor.nil();

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:124:4: ( '-' | '+' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=37 && LA20_0<=38)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
                    {
                    set74=(Token)input.LT(1);
                    if ( (input.LA(1)>=37 && input.LA(1)<=38) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set74));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_unary_in_expr_not585);
            expr_unary75=expr_unary();

            state._fsp--;

            adaptor.addChild(root_0, expr_unary75.getTree());

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
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:126:1: expr_unary : ( ( identifier ':' )? identifier | '(' pattern ')' );
    public final RuleGrammarParser.expr_unary_return expr_unary() throws RecognitionException {
        RuleGrammarParser.expr_unary_return retval = new RuleGrammarParser.expr_unary_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal77=null;
        Token char_literal79=null;
        Token char_literal81=null;
        RuleGrammarParser.identifier_return identifier76 = null;

        RuleGrammarParser.identifier_return identifier78 = null;

        RuleGrammarParser.pattern_return pattern80 = null;


        Object char_literal77_tree=null;
        Object char_literal79_tree=null;
        Object char_literal81_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:127:2: ( ( identifier ':' )? identifier | '(' pattern ')' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==17) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:127:4: ( identifier ':' )? identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:127:4: ( identifier ':' )?
                    int alt21=2;
                    alt21 = dfa21.predict(input);
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:127:5: identifier ':'
                            {
                            pushFollow(FOLLOW_identifier_in_expr_unary595);
                            identifier76=identifier();

                            state._fsp--;

                            adaptor.addChild(root_0, identifier76.getTree());
                            char_literal77=(Token)match(input,15,FOLLOW_15_in_expr_unary597); 
                            char_literal77_tree = (Object)adaptor.create(char_literal77);
                            adaptor.addChild(root_0, char_literal77_tree);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_expr_unary601);
                    identifier78=identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, identifier78.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:128:4: '(' pattern ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal79=(Token)match(input,17,FOLLOW_17_in_expr_unary606); 
                    char_literal79_tree = (Object)adaptor.create(char_literal79);
                    adaptor.addChild(root_0, char_literal79_tree);

                    pushFollow(FOLLOW_pattern_in_expr_unary608);
                    pattern80=pattern();

                    state._fsp--;

                    adaptor.addChild(root_0, pattern80.getTree());
                    char_literal81=(Token)match(input,18,FOLLOW_18_in_expr_unary610); 
                    char_literal81_tree = (Object)adaptor.create(char_literal81);
                    adaptor.addChild(root_0, char_literal81_tree);


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
        }
        return retval;
    }
    // $ANTLR end "expr_unary"

    public static class identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:130:1: identifier : ID ( ID | INT )* ;
    public final RuleGrammarParser.identifier_return identifier() throws RecognitionException {
        RuleGrammarParser.identifier_return retval = new RuleGrammarParser.identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID82=null;
        Token set83=null;

        Object ID82_tree=null;
        Object set83_tree=null;

        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:131:2: ( ID ( ID | INT )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:131:4: ID ( ID | INT )*
            {
            root_0 = (Object)adaptor.nil();

            ID82=(Token)match(input,ID,FOLLOW_ID_in_identifier619); 
            ID82_tree = (Object)adaptor.create(ID82);
            adaptor.addChild(root_0, ID82_tree);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:131:7: ( ID | INT )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=ID && LA23_0<=INT)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            	    {
            	    set83=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ID && input.LA(1)<=INT) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set83));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA8_eotS =
        "\6\uffff";
    static final String DFA8_eofS =
        "\6\uffff";
    static final String DFA8_minS =
        "\1\6\1\uffff\2\6\2\uffff";
    static final String DFA8_maxS =
        "\1\20\1\uffff\2\21\2\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3";
    static final String DFA8_specialS =
        "\6\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\11\uffff\1\1",
            "",
            "\2\3\7\uffff\1\4\1\uffff\1\5",
            "\2\3\7\uffff\1\4\1\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "77:4: ( 'not' | ( identifier ':' ) )?";
        }
    }
    static final String DFA21_eotS =
        "\5\uffff";
    static final String DFA21_eofS =
        "\5\uffff";
    static final String DFA21_minS =
        "\3\6\2\uffff";
    static final String DFA21_maxS =
        "\1\6\2\50\2\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA21_specialS =
        "\5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1",
            "\2\2\7\uffff\1\3\2\uffff\1\4\12\uffff\14\4",
            "\2\2\7\uffff\1\3\2\uffff\1\4\12\uffff\14\4",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "127:4: ( identifier ':' )?";
        }
    }
 

    public static final BitSet FOLLOW_rule_in_prog56 = new BitSet(new long[]{0x0000000000006212L});
    public static final BitSet FOLLOW_comment_in_prog60 = new BitSet(new long[]{0x0000000000006212L});
    public static final BitSet FOLLOW_decl_in_prog64 = new BitSet(new long[]{0x0000000000006212L});
    public static final BitSet FOLLOW_NEWLINE_in_prog68 = new BitSet(new long[]{0x0000000000006212L});
    public static final BitSet FOLLOW_9_in_rule79 = new BitSet(new long[]{0x000003FFFFFFE1E0L});
    public static final BitSet FOLLOW_ruleName_in_rule81 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_rule83 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_rule85 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ruleWhen_in_rule87 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_NEWLINE_in_rule89 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_11_in_rule92 = new BitSet(new long[]{0x000003FFFFFFE1C0L});
    public static final BitSet FOLLOW_ruleThen_in_rule94 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_NEWLINE_in_rule96 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_rule99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_comment113 = new BitSet(new long[]{0x000003FFFFFFFFF0L});
    public static final BitSet FOLLOW_NEWLINE_in_comment118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_decl138 = new BitSet(new long[]{0x000003FFFFFFAFE0L});
    public static final BitSet FOLLOW_declName_in_decl140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_decl142 = new BitSet(new long[]{0x000003FFFFFFEFE0L});
    public static final BitSet FOLLOW_declMember_in_decl146 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_NEWLINE_in_decl151 = new BitSet(new long[]{0x000003FFFFFFEFE0L});
    public static final BitSet FOLLOW_declMember_in_decl155 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_NEWLINE_in_decl161 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_decl164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub2_in_declName178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttribute_in_declMember191 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_declMember193 = new BitSet(new long[]{0x000000001FC00000L});
    public static final BitSet FOLLOW_declAttributeType_in_declMember195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub1_in_ruleName207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName212 = new BitSet(new long[]{0x000003FFFFFFE1C0L});
    public static final BitSet FOLLOW_sub1_in_ruleName214 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleWhen228 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_identifier_in_ruleWhen233 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWhen235 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhen240 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWhen242 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_pattern_in_ruleWhen244 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleWhen246 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_set_in_ruleWhen248 = new BitSet(new long[]{0x0000000000310002L});
    public static final BitSet FOLLOW_set_in_ruleWhen259 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhen271 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWhen273 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_pattern_in_ruleWhen275 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleWhen277 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_set_in_ruleWhen279 = new BitSet(new long[]{0x0000000000310002L});
    public static final BitSet FOLLOW_sub1_in_ruleThen296 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleThen299 = new BitSet(new long[]{0x000003FFFFFFE1C0L});
    public static final BitSet FOLLOW_sub1_in_ruleThen301 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_set_in_sub1313 = new BitSet(new long[]{0x000003FFFFFFE1C2L});
    public static final BitSet FOLLOW_set_in_sub2348 = new BitSet(new long[]{0x000003FFFFFFAFE2L});
    public static final BitSet FOLLOW_set_in_declAttribute371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declAttributeType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_ant_class421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_in_pattern432 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_pattern435 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_expr_or_in_pattern437 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_expr_and_in_expr_or448 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_expr_or451 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_expr_and_in_expr_or453 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_expr_eq_neq_in_expr_and464 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_set_in_expr_and467 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_expr_eq_neq_in_expr_and475 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_expr_comp_in_expr_eq_neq486 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_set_in_expr_eq_neq489 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_expr_comp_in_expr_eq_neq505 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_comp518 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_set_in_expr_comp521 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_comp529 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub540 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_set_in_expr_add_sub543 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub551 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_41_in_expr_mul_div563 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_expr_not_in_expr_mul_div567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr_not576 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_expr_unary_in_expr_not585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_expr_unary595 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_expr_unary597 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_expr_unary601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expr_unary606 = new BitSet(new long[]{0x0000026000020040L});
    public static final BitSet FOLLOW_pattern_in_expr_unary608 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_expr_unary610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier619 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_identifier621 = new BitSet(new long[]{0x00000000000000C2L});

}