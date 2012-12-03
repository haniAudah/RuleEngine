// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g 2012-12-03 20:01:23

	package parser;
	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RuleGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEWLINE", "QUOTE", "ID", "INT", "WS", "'rule'", "'when'", "'then'", "'end'", "'//'", "'declare'", "':'", "'not'", "'('", "')'", "';'", "'and'", "'or'", "'String'", "'Integer'", "'int'", "'long'", "'Decimal'", "'Char'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'"
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
        

    public String[] getTokenNames() { return RuleGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g"; }


    	HashMap memory = new HashMap();



    // $ANTLR start "prog"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:21:1: prog : ( rule | comment | NEWLINE )+ ;
    public final void prog() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:22:2: ( ( rule | comment | NEWLINE )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:22:4: ( rule | comment | NEWLINE )+
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:22:4: ( rule | comment | NEWLINE )+
            int cnt1=0;
            loop1:
            do {
                int alt1=4;
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
                case NEWLINE:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:22:5: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_prog48);
            	    rule();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:22:12: comment
            	    {
            	    pushFollow(FOLLOW_comment_in_prog52);
            	    comment();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:22:22: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_prog56); 

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "rule"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:24:1: rule : 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' ;
    public final void rule() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:2: ( 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:4: 'rule' ruleName NEWLINE 'when' ruleWhen ( NEWLINE )* 'then' ruleThen ( NEWLINE )* 'end'
            {
            match(input,9,FOLLOW_9_in_rule67); 
            pushFollow(FOLLOW_ruleName_in_rule69);
            ruleName();

            state._fsp--;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_rule71); 
            match(input,10,FOLLOW_10_in_rule73); 
            pushFollow(FOLLOW_ruleWhen_in_rule75);
            ruleWhen();

            state._fsp--;

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:44: ( NEWLINE )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==NEWLINE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:44: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_rule77); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(input,11,FOLLOW_11_in_rule80); 
            pushFollow(FOLLOW_ruleThen_in_rule82);
            ruleThen();

            state._fsp--;

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:69: ( NEWLINE )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NEWLINE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:69: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_rule84); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_rule87); 
            System.out.println("ANTLR completed successfully!!");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rule"


    // $ANTLR start "comment"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:27:1: comment : '//' ( . )* NEWLINE ;
    public final void comment() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:2: ( '//' ( . )* NEWLINE )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:4: '//' ( . )* NEWLINE
            {
            match(input,13,FOLLOW_13_in_comment98); 
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:9: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==NEWLINE) ) {
                    alt4=2;
                }
                else if ( ((LA4_0>=QUOTE && LA4_0<=40)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:9: .
            	    {
            	    matchAny(input); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match(input,NEWLINE,FOLLOW_NEWLINE_in_comment103); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "comment"


    // $ANTLR start "decl"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:32:1: decl : 'declare' declName NEWLINE declMember ( NEWLINE declMember )* ( NEWLINE )* 'end' ;
    public final void decl() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:2: ( 'declare' declName NEWLINE declMember ( NEWLINE declMember )* ( NEWLINE )* 'end' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:4: 'declare' declName NEWLINE declMember ( NEWLINE declMember )* ( NEWLINE )* 'end'
            {
            match(input,14,FOLLOW_14_in_decl114); 
            pushFollow(FOLLOW_declName_in_decl116);
            declName();

            state._fsp--;

            match(input,NEWLINE,FOLLOW_NEWLINE_in_decl118); 
            pushFollow(FOLLOW_declMember_in_decl120);
            declMember();

            state._fsp--;

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:42: ( NEWLINE declMember )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==NEWLINE) ) {
                    int LA5_1 = input.LA(2);

                    if ( ((LA5_1>=QUOTE && LA5_1<=11)||(LA5_1>=13 && LA5_1<=40)) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:43: NEWLINE declMember
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_decl123); 
            	    pushFollow(FOLLOW_declMember_in_decl125);
            	    declMember();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:64: ( NEWLINE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==NEWLINE) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:64: NEWLINE
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_decl129); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,12,FOLLOW_12_in_decl132); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "decl"


    // $ANTLR start "declName"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:35:1: declName : sub2 ;
    public final void declName() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:36:2: ( sub2 )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:36:4: sub2
            {
            pushFollow(FOLLOW_sub2_in_declName141);
            sub2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declName"


    // $ANTLR start "declMember"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:38:1: declMember : declAttribute ':' declAttributeType ;
    public final void declMember() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:39:2: ( declAttribute ':' declAttributeType )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:39:4: declAttribute ':' declAttributeType
            {
            pushFollow(FOLLOW_declAttribute_in_declMember150);
            declAttribute();

            state._fsp--;

            match(input,15,FOLLOW_15_in_declMember152); 
            pushFollow(FOLLOW_declAttributeType_in_declMember154);
            declAttributeType();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declMember"


    // $ANTLR start "ruleName"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:41:1: ruleName : ( sub1 | ( QUOTE sub1 QUOTE ) ) ;
    public final void ruleName() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:42:2: ( ( sub1 | ( QUOTE sub1 QUOTE ) ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:42:4: ( sub1 | ( QUOTE sub1 QUOTE ) )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:42:4: ( sub1 | ( QUOTE sub1 QUOTE ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=ID && LA7_0<=WS)||(LA7_0>=13 && LA7_0<=40)) ) {
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
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:42:5: sub1
                    {
                    pushFollow(FOLLOW_sub1_in_ruleName164);
                    sub1();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:42:12: ( QUOTE sub1 QUOTE )
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:42:12: ( QUOTE sub1 QUOTE )
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:42:13: QUOTE sub1 QUOTE
                    {
                    match(input,QUOTE,FOLLOW_QUOTE_in_ruleName169); 
                    pushFollow(FOLLOW_sub1_in_ruleName171);
                    sub1();

                    state._fsp--;

                    match(input,QUOTE,FOLLOW_QUOTE_in_ruleName173); 

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "ruleWhen"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:44:1: ruleWhen : ( 'not' | ( identifier ':' ) )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ( ( 'and' | 'or' | 'not' ) ant_class '(' pattern ')' ( NEWLINE | ';' ) )* ;
    public final void ruleWhen() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:2: ( ( 'not' | ( identifier ':' ) )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ( ( 'and' | 'or' | 'not' ) ant_class '(' pattern ')' ( NEWLINE | ';' ) )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:4: ( 'not' | ( identifier ':' ) )? ant_class '(' pattern ')' ( NEWLINE | ';' ) ( ( 'and' | 'or' | 'not' ) ant_class '(' pattern ')' ( NEWLINE | ';' ) )*
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:4: ( 'not' | ( identifier ':' ) )?
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:5: 'not'
                    {
                    match(input,16,FOLLOW_16_in_ruleWhen185); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:13: ( identifier ':' )
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:13: ( identifier ':' )
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:45:14: identifier ':'
                    {
                    pushFollow(FOLLOW_identifier_in_ruleWhen190);
                    identifier();

                    state._fsp--;

                    match(input,15,FOLLOW_15_in_ruleWhen192); 

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_ant_class_in_ruleWhen197);
            ant_class();

            state._fsp--;

            match(input,17,FOLLOW_17_in_ruleWhen199); 
            pushFollow(FOLLOW_pattern_in_ruleWhen201);
            pattern();

            state._fsp--;

            match(input,18,FOLLOW_18_in_ruleWhen203); 
            if ( input.LA(1)==NEWLINE||input.LA(1)==19 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:46:3: ( ( 'and' | 'or' | 'not' ) ant_class '(' pattern ')' ( NEWLINE | ';' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16||(LA9_0>=20 && LA9_0<=21)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:46:4: ( 'and' | 'or' | 'not' ) ant_class '(' pattern ')' ( NEWLINE | ';' )
            	    {
            	    if ( input.LA(1)==16||(input.LA(1)>=20 && input.LA(1)<=21) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_ant_class_in_ruleWhen228);
            	    ant_class();

            	    state._fsp--;

            	    match(input,17,FOLLOW_17_in_ruleWhen230); 
            	    pushFollow(FOLLOW_pattern_in_ruleWhen232);
            	    pattern();

            	    state._fsp--;

            	    match(input,18,FOLLOW_18_in_ruleWhen234); 
            	    if ( input.LA(1)==NEWLINE||input.LA(1)==19 ) {
            	        input.consume();
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "ruleThen"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:48:1: ruleThen : sub1 ( NEWLINE sub1 )* ;
    public final void ruleThen() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:49:2: ( sub1 ( NEWLINE sub1 )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:49:4: sub1 ( NEWLINE sub1 )*
            {
            pushFollow(FOLLOW_sub1_in_ruleThen253);
            sub1();

            state._fsp--;

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:49:9: ( NEWLINE sub1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==NEWLINE) ) {
                    int LA10_1 = input.LA(2);

                    if ( ((LA10_1>=ID && LA10_1<=WS)||(LA10_1>=13 && LA10_1<=40)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:49:10: NEWLINE sub1
            	    {
            	    match(input,NEWLINE,FOLLOW_NEWLINE_in_ruleThen256); 
            	    pushFollow(FOLLOW_sub1_in_ruleThen258);
            	    sub1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ruleThen"


    // $ANTLR start "sub1"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:51:1: sub1 : (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ ;
    public final void sub1() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:52:2: ( (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:52:4: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:52:4: (~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=ID && LA11_0<=WS)||(LA11_0>=13 && LA11_0<=40)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:52:5: ~ ( NEWLINE | 'rule' | 'when' | 'then' | 'end' | QUOTE )
            	    {
            	    if ( (input.LA(1)>=ID && input.LA(1)<=WS)||(input.LA(1)>=13 && input.LA(1)<=40) ) {
            	        input.consume();
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sub1"


    // $ANTLR start "sub2"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:54:1: sub2 : (~ ( NEWLINE | 'declare' | 'end' ) )+ ;
    public final void sub2() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:55:2: ( (~ ( NEWLINE | 'declare' | 'end' ) )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:55:4: (~ ( NEWLINE | 'declare' | 'end' ) )+
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:55:4: (~ ( NEWLINE | 'declare' | 'end' ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=QUOTE && LA12_0<=11)||LA12_0==13||(LA12_0>=15 && LA12_0<=40)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:55:5: ~ ( NEWLINE | 'declare' | 'end' )
            	    {
            	    if ( (input.LA(1)>=QUOTE && input.LA(1)<=11)||input.LA(1)==13||(input.LA(1)>=15 && input.LA(1)<=40) ) {
            	        input.consume();
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "sub2"


    // $ANTLR start "declAttribute"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:57:1: declAttribute : (~ ( NEWLINE | 'end' ) ) ;
    public final void declAttribute() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:58:2: ( (~ ( NEWLINE | 'end' ) ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:58:4: (~ ( NEWLINE | 'end' ) )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:58:4: (~ ( NEWLINE | 'end' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:58:5: ~ ( NEWLINE | 'end' )
            {
            if ( (input.LA(1)>=QUOTE && input.LA(1)<=11)||(input.LA(1)>=13 && input.LA(1)<=40) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declAttribute"


    // $ANTLR start "declAttributeType"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:60:1: declAttributeType : ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' );
    public final void declAttributeType() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:61:2: ( 'String' | 'Integer' | 'int' | 'long' | 'Decimal' | 'Char' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            {
            if ( (input.LA(1)>=22 && input.LA(1)<=27) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declAttributeType"


    // $ANTLR start "ant_class"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:63:1: ant_class : identifier ;
    public final void ant_class() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:64:2: ( identifier )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:64:4: identifier
            {
            pushFollow(FOLLOW_identifier_in_ant_class374);
            identifier();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ant_class"


    // $ANTLR start "pattern"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:68:1: pattern : expr_or ( '||' expr_or )* ;
    public final void pattern() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:69:2: ( expr_or ( '||' expr_or )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:69:4: expr_or ( '||' expr_or )*
            {
            pushFollow(FOLLOW_expr_or_in_pattern385);
            expr_or();

            state._fsp--;

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:69:12: ( '||' expr_or )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:69:13: '||' expr_or
            	    {
            	    match(input,28,FOLLOW_28_in_pattern388); 
            	    pushFollow(FOLLOW_expr_or_in_pattern390);
            	    expr_or();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pattern"


    // $ANTLR start "expr_or"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:71:1: expr_or : expr_and ( '&&' expr_and )* ;
    public final void expr_or() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:72:2: ( expr_and ( '&&' expr_and )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:72:4: expr_and ( '&&' expr_and )*
            {
            pushFollow(FOLLOW_expr_and_in_expr_or401);
            expr_and();

            state._fsp--;

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:72:13: ( '&&' expr_and )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==29) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:72:14: '&&' expr_and
            	    {
            	    match(input,29,FOLLOW_29_in_expr_or404); 
            	    pushFollow(FOLLOW_expr_and_in_expr_or406);
            	    expr_and();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_or"


    // $ANTLR start "expr_and"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:74:1: expr_and : expr_eq_neq ( ( '==' | '!=' ) expr_eq_neq )* ;
    public final void expr_and() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:75:2: ( expr_eq_neq ( ( '==' | '!=' ) expr_eq_neq )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:75:4: expr_eq_neq ( ( '==' | '!=' ) expr_eq_neq )*
            {
            pushFollow(FOLLOW_expr_eq_neq_in_expr_and417);
            expr_eq_neq();

            state._fsp--;

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:75:16: ( ( '==' | '!=' ) expr_eq_neq )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=30 && LA15_0<=31)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:75:17: ( '==' | '!=' ) expr_eq_neq
            	    {
            	    if ( (input.LA(1)>=30 && input.LA(1)<=31) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_eq_neq_in_expr_and428);
            	    expr_eq_neq();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_and"


    // $ANTLR start "expr_eq_neq"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:77:1: expr_eq_neq : expr_comp ( ( '>=' | '<=' | '>' | '<' ) expr_comp )* ;
    public final void expr_eq_neq() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:78:2: ( expr_comp ( ( '>=' | '<=' | '>' | '<' ) expr_comp )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:78:4: expr_comp ( ( '>=' | '<=' | '>' | '<' ) expr_comp )*
            {
            pushFollow(FOLLOW_expr_comp_in_expr_eq_neq439);
            expr_comp();

            state._fsp--;

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:78:14: ( ( '>=' | '<=' | '>' | '<' ) expr_comp )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=32 && LA16_0<=35)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:78:15: ( '>=' | '<=' | '>' | '<' ) expr_comp
            	    {
            	    if ( (input.LA(1)>=32 && input.LA(1)<=35) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_comp_in_expr_eq_neq458);
            	    expr_comp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_eq_neq"


    // $ANTLR start "expr_comp"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:82:1: expr_comp : expr_add_sub ( ( '+' | '-' ) expr_add_sub )* ;
    public final void expr_comp() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:83:2: ( expr_add_sub ( ( '+' | '-' ) expr_add_sub )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:83:4: expr_add_sub ( ( '+' | '-' ) expr_add_sub )*
            {
            pushFollow(FOLLOW_expr_add_sub_in_expr_comp471);
            expr_add_sub();

            state._fsp--;

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:83:17: ( ( '+' | '-' ) expr_add_sub )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=36 && LA17_0<=37)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:83:18: ( '+' | '-' ) expr_add_sub
            	    {
            	    if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_add_sub_in_expr_comp482);
            	    expr_add_sub();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_comp"


    // $ANTLR start "expr_add_sub"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:85:1: expr_add_sub : expr_mul_div ( ( '*' | '/' ) expr_mul_div )* ;
    public final void expr_add_sub() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:2: ( expr_mul_div ( ( '*' | '/' ) expr_mul_div )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:4: expr_mul_div ( ( '*' | '/' ) expr_mul_div )*
            {
            pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub493);
            expr_mul_div();

            state._fsp--;

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:17: ( ( '*' | '/' ) expr_mul_div )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=38 && LA18_0<=39)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:86:18: ( '*' | '/' ) expr_mul_div
            	    {
            	    if ( (input.LA(1)>=38 && input.LA(1)<=39) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_expr_mul_div_in_expr_add_sub504);
            	    expr_mul_div();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_add_sub"


    // $ANTLR start "expr_mul_div"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:88:1: expr_mul_div : ( '!' )? expr_not ;
    public final void expr_mul_div() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:89:2: ( ( '!' )? expr_not )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:89:4: ( '!' )? expr_not
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:89:4: ( '!' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:89:5: '!'
                    {
                    match(input,40,FOLLOW_40_in_expr_mul_div516); 

                    }
                    break;

            }

            pushFollow(FOLLOW_expr_not_in_expr_mul_div520);
            expr_not();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_mul_div"


    // $ANTLR start "expr_not"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:91:1: expr_not : ( '-' | '+' )? expr_unary ;
    public final void expr_not() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:2: ( ( '-' | '+' )? expr_unary )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:4: ( '-' | '+' )? expr_unary
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:92:4: ( '-' | '+' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=36 && LA20_0<=37)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
                    {
                    if ( (input.LA(1)>=36 && input.LA(1)<=37) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_expr_unary_in_expr_not538);
            expr_unary();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_not"


    // $ANTLR start "expr_unary"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:94:1: expr_unary : ( ( identifier ':' )? identifier | '(' pattern ')' );
    public final void expr_unary() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:2: ( ( identifier ':' )? identifier | '(' pattern ')' )
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
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:4: ( identifier ':' )? identifier
                    {
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:4: ( identifier ':' )?
                    int alt21=2;
                    alt21 = dfa21.predict(input);
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:95:5: identifier ':'
                            {
                            pushFollow(FOLLOW_identifier_in_expr_unary548);
                            identifier();

                            state._fsp--;

                            match(input,15,FOLLOW_15_in_expr_unary550); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_identifier_in_expr_unary554);
                    identifier();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:96:4: '(' pattern ')'
                    {
                    match(input,17,FOLLOW_17_in_expr_unary559); 
                    pushFollow(FOLLOW_pattern_in_expr_unary561);
                    pattern();

                    state._fsp--;

                    match(input,18,FOLLOW_18_in_expr_unary563); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "expr_unary"


    // $ANTLR start "identifier"
    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:98:1: identifier : ID ( ID | INT )* ;
    public final void identifier() throws RecognitionException {
        try {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:99:2: ( ID ( ID | INT )* )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:99:4: ID ( ID | INT )*
            {
            match(input,ID,FOLLOW_ID_in_identifier572); 
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:99:7: ( ID | INT )*
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
            	    if ( (input.LA(1)>=ID && input.LA(1)<=INT) ) {
            	        input.consume();
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
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
            return "45:4: ( 'not' | ( identifier ':' ) )?";
        }
    }
    static final String DFA21_eotS =
        "\5\uffff";
    static final String DFA21_eofS =
        "\5\uffff";
    static final String DFA21_minS =
        "\3\6\2\uffff";
    static final String DFA21_maxS =
        "\1\6\2\47\2\uffff";
    static final String DFA21_acceptS =
        "\3\uffff\1\1\1\2";
    static final String DFA21_specialS =
        "\5\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1",
            "\2\2\7\uffff\1\3\2\uffff\1\4\11\uffff\14\4",
            "\2\2\7\uffff\1\3\2\uffff\1\4\11\uffff\14\4",
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
            return "95:4: ( identifier ':' )?";
        }
    }
 

    public static final BitSet FOLLOW_rule_in_prog48 = new BitSet(new long[]{0x0000000000002212L});
    public static final BitSet FOLLOW_comment_in_prog52 = new BitSet(new long[]{0x0000000000002212L});
    public static final BitSet FOLLOW_NEWLINE_in_prog56 = new BitSet(new long[]{0x0000000000002212L});
    public static final BitSet FOLLOW_9_in_rule67 = new BitSet(new long[]{0x000001FFFFFFE1E0L});
    public static final BitSet FOLLOW_ruleName_in_rule69 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_rule71 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_rule73 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ruleWhen_in_rule75 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_NEWLINE_in_rule77 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_11_in_rule80 = new BitSet(new long[]{0x000001FFFFFFE1C0L});
    public static final BitSet FOLLOW_ruleThen_in_rule82 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_NEWLINE_in_rule84 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_rule87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_comment98 = new BitSet(new long[]{0x000001FFFFFFFFF0L});
    public static final BitSet FOLLOW_NEWLINE_in_comment103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_decl114 = new BitSet(new long[]{0x000001FFFFFFAFE0L});
    public static final BitSet FOLLOW_declName_in_decl116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_decl118 = new BitSet(new long[]{0x000001FFFFFFEFE0L});
    public static final BitSet FOLLOW_declMember_in_decl120 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_NEWLINE_in_decl123 = new BitSet(new long[]{0x000001FFFFFFEFE0L});
    public static final BitSet FOLLOW_declMember_in_decl125 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_NEWLINE_in_decl129 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_decl132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub2_in_declName141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declAttribute_in_declMember150 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_declMember152 = new BitSet(new long[]{0x000000000FC00000L});
    public static final BitSet FOLLOW_declAttributeType_in_declMember154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sub1_in_ruleName164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName169 = new BitSet(new long[]{0x000001FFFFFFE1C0L});
    public static final BitSet FOLLOW_sub1_in_ruleName171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_QUOTE_in_ruleName173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleWhen185 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_identifier_in_ruleWhen190 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleWhen192 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhen197 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWhen199 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_pattern_in_ruleWhen201 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleWhen203 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_set_in_ruleWhen205 = new BitSet(new long[]{0x0000000000310002L});
    public static final BitSet FOLLOW_set_in_ruleWhen216 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_ant_class_in_ruleWhen228 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWhen230 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_pattern_in_ruleWhen232 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleWhen234 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_set_in_ruleWhen236 = new BitSet(new long[]{0x0000000000310002L});
    public static final BitSet FOLLOW_sub1_in_ruleThen253 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_NEWLINE_in_ruleThen256 = new BitSet(new long[]{0x000001FFFFFFE1C0L});
    public static final BitSet FOLLOW_sub1_in_ruleThen258 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_set_in_sub1270 = new BitSet(new long[]{0x000001FFFFFFE1C2L});
    public static final BitSet FOLLOW_set_in_sub2305 = new BitSet(new long[]{0x000001FFFFFFAFE2L});
    public static final BitSet FOLLOW_set_in_declAttribute328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_declAttributeType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_ant_class374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_or_in_pattern385 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_pattern388 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_expr_or_in_pattern390 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_expr_and_in_expr_or401 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_expr_or404 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_expr_and_in_expr_or406 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_expr_eq_neq_in_expr_and417 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_set_in_expr_and420 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_expr_eq_neq_in_expr_and428 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_expr_comp_in_expr_eq_neq439 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_set_in_expr_eq_neq442 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_expr_comp_in_expr_eq_neq458 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_comp471 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_set_in_expr_comp474 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_expr_add_sub_in_expr_comp482 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub493 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_set_in_expr_add_sub496 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_expr_mul_div_in_expr_add_sub504 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_40_in_expr_mul_div516 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_expr_not_in_expr_mul_div520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expr_not529 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_expr_unary_in_expr_not538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_expr_unary548 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_expr_unary550 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_identifier_in_expr_unary554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expr_unary559 = new BitSet(new long[]{0x0000013000020040L});
    public static final BitSet FOLLOW_pattern_in_expr_unary561 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_expr_unary563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_identifier572 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_set_in_identifier574 = new BitSet(new long[]{0x00000000000000C2L});

}