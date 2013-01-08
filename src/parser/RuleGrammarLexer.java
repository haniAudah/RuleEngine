// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g 2013-01-08 14:17:17

    package parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class RuleGrammarLexer extends Lexer {
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

    public RuleGrammarLexer() {;} 
    public RuleGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public RuleGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:11:7: ( 'rule' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:11:9: 'rule'
            {
            match("rule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:12:7: ( 'when' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:12:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:13:7: ( 'then' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:13:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:14:7: ( 'end' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:14:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:15:7: ( 'declare' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:15:9: 'declare'
            {
            match("declare"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:16:7: ( ':' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:16:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:17:7: ( 'not' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:17:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:18:7: ( '(' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:18:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:19:7: ( ')' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:19:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:20:7: ( ';' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:20:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:21:7: ( 'and' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:21:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:22:7: ( 'or' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:22:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:23:7: ( 'String' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:23:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:24:7: ( 'Integer' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:24:9: 'Integer'
            {
            match("Integer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:7: ( 'int' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:25:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:26:7: ( 'long' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:26:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:27:7: ( 'Decimal' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:27:9: 'Decimal'
            {
            match("Decimal"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:7: ( 'Char' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:28:9: 'Char'
            {
            match("Char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:29:7: ( 'double' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:29:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:30:7: ( ',' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:30:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:31:7: ( '||' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:31:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:32:7: ( '&&' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:32:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:7: ( '+' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:33:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:34:7: ( '-' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:34:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:35:7: ( '*' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:35:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:36:7: ( '/' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:36:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:37:7: ( '!' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:37:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:38:7: ( '$' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:38:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:316:5: ( '//' (~ ( '\\r' | '\\n' ) )* NEWLINE )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:316:10: '//' (~ ( '\\r' | '\\n' ) )* NEWLINE
            {
            match("//"); 

            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:316:15: (~ ( '\\r' | '\\n' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:316:16: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            mNEWLINE(); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:318:5: ( ( '0' .. '9' )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:318:10: ( '0' .. '9' )+
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:318:10: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:318:10: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:320:5: ( ( '\\r' )? '\\n' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:320:10: ( '\\r' )? '\\n'
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:320:10: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:320:10: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:322:5: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:322:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:322:10: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:324:5: ( ( ' ' | '\\t' )+ )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:324:10: ( ' ' | '\\t' )+
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:324:10: ( ' ' | '\\t' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:326:5: ( '\"' )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:326:10: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "EQUALITY"
    public final void mEQUALITY() throws RecognitionException {
        try {
            int _type = EQUALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:328:5: ( ( '==' | '!=' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:328:10: ( '==' | '!=' )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:328:10: ( '==' | '!=' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='=') ) {
                alt6=1;
            }
            else if ( (LA6_0=='!') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:328:11: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:328:18: '!='
                    {
                    match("!="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALITY"

    // $ANTLR start "INEQUALITY"
    public final void mINEQUALITY() throws RecognitionException {
        try {
            int _type = INEQUALITY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:330:5: ( ( '>=' | '<=' | '>' | '<' ) )
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:330:10: ( '>=' | '<=' | '>' | '<' )
            {
            // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:330:10: ( '>=' | '<=' | '>' | '<' )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='>') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='=') ) {
                    alt7=1;
                }
                else {
                    alt7=3;}
            }
            else if ( (LA7_0=='<') ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='=') ) {
                    alt7=2;
                }
                else {
                    alt7=4;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:330:11: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:330:18: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:330:25: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:330:31: '<'
                    {
                    match('<'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INEQUALITY"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | LINE_COMMENT | INT | NEWLINE | ID | WS | QUOTE | EQUALITY | INEQUALITY )
        int alt8=36;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:178: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 30 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:191: INT
                {
                mINT(); 

                }
                break;
            case 31 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:195: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 32 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:203: ID
                {
                mID(); 

                }
                break;
            case 33 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:206: WS
                {
                mWS(); 

                }
                break;
            case 34 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:209: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 35 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:215: EQUALITY
                {
                mEQUALITY(); 

                }
                break;
            case 36 :
                // C:\\Users\\Hani\\Documents\\EECE 637\\RuleEngine\\Parser\\RuleGrammar.g:1:224: INEQUALITY
                {
                mINEQUALITY(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\5\36\1\uffff\1\36\3\uffff\10\36\6\uffff\1\63\1\64\10\uffff"+
        "\10\36\1\75\6\36\3\uffff\3\36\1\107\2\36\1\112\1\113\1\uffff\2\36"+
        "\1\116\3\36\1\122\1\123\1\124\1\uffff\2\36\2\uffff\2\36\1\uffff"+
        "\1\131\1\36\1\133\3\uffff\4\36\1\uffff\1\36\1\uffff\1\36\1\142\1"+
        "\143\2\36\1\146\2\uffff\1\147\1\150\3\uffff";
    static final String DFA8_eofS =
        "\151\uffff";
    static final String DFA8_minS =
        "\1\11\1\165\2\150\1\156\1\145\1\uffff\1\157\3\uffff\1\156\1\162"+
        "\1\164\2\156\1\157\1\145\1\150\6\uffff\1\57\1\75\10\uffff\1\154"+
        "\2\145\1\144\1\143\1\165\1\164\1\144\1\101\1\162\2\164\1\156\1\143"+
        "\1\141\3\uffff\1\145\2\156\1\101\1\154\1\142\2\101\1\uffff\1\151"+
        "\1\145\1\101\1\147\1\151\1\162\3\101\1\uffff\1\141\1\154\2\uffff"+
        "\1\156\1\147\1\uffff\1\101\1\155\1\101\3\uffff\1\162\1\145\1\147"+
        "\1\145\1\uffff\1\141\1\uffff\1\145\2\101\1\162\1\154\1\101\2\uffff"+
        "\2\101\3\uffff";
    static final String DFA8_maxS =
        "\1\174\1\165\2\150\1\156\1\157\1\uffff\1\157\3\uffff\1\156\1\162"+
        "\1\164\2\156\1\157\1\145\1\150\6\uffff\1\57\1\75\10\uffff\1\154"+
        "\2\145\1\144\1\143\1\165\1\164\1\144\1\172\1\162\2\164\1\156\1\143"+
        "\1\141\3\uffff\1\145\2\156\1\172\1\154\1\142\2\172\1\uffff\1\151"+
        "\1\145\1\172\1\147\1\151\1\162\3\172\1\uffff\1\141\1\154\2\uffff"+
        "\1\156\1\147\1\uffff\1\172\1\155\1\172\3\uffff\1\162\1\145\1\147"+
        "\1\145\1\uffff\1\141\1\uffff\1\145\2\172\1\162\1\154\1\172\2\uffff"+
        "\2\172\3\uffff";
    static final String DFA8_acceptS =
        "\6\uffff\1\6\1\uffff\1\10\1\11\1\12\10\uffff\1\24\1\25\1\26\1\27"+
        "\1\30\1\31\2\uffff\1\34\1\36\1\37\1\40\1\41\1\42\1\43\1\44\17\uffff"+
        "\1\35\1\32\1\33\10\uffff\1\14\11\uffff\1\4\2\uffff\1\7\1\13\2\uffff"+
        "\1\17\3\uffff\1\1\1\2\1\3\4\uffff\1\20\1\uffff\1\22\6\uffff\1\23"+
        "\1\15\2\uffff\1\5\1\16\1\21";
    static final String DFA8_specialS =
        "\151\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\37\1\35\2\uffff\1\35\22\uffff\1\37\1\32\1\40\1\uffff\1\33"+
            "\1\uffff\1\25\1\uffff\1\10\1\11\1\30\1\26\1\23\1\27\1\uffff"+
            "\1\31\12\34\1\6\1\12\1\42\1\41\1\42\2\uffff\2\36\1\22\1\21\4"+
            "\36\1\16\11\36\1\15\7\36\6\uffff\1\13\2\36\1\5\1\4\3\36\1\17"+
            "\2\36\1\20\1\36\1\7\1\14\2\36\1\1\1\36\1\3\2\36\1\2\3\36\1\uffff"+
            "\1\24",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47\11\uffff\1\50",
            "",
            "\1\51",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\32\36\6\uffff\32\36",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "",
            "",
            "\1\104",
            "\1\105",
            "\1\106",
            "\32\36\6\uffff\32\36",
            "\1\110",
            "\1\111",
            "\32\36\6\uffff\32\36",
            "\32\36\6\uffff\32\36",
            "",
            "\1\114",
            "\1\115",
            "\32\36\6\uffff\32\36",
            "\1\117",
            "\1\120",
            "\1\121",
            "\32\36\6\uffff\32\36",
            "\32\36\6\uffff\32\36",
            "\32\36\6\uffff\32\36",
            "",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "",
            "\32\36\6\uffff\32\36",
            "\1\132",
            "\32\36\6\uffff\32\36",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "",
            "\1\141",
            "\32\36\6\uffff\32\36",
            "\32\36\6\uffff\32\36",
            "\1\144",
            "\1\145",
            "\32\36\6\uffff\32\36",
            "",
            "",
            "\32\36\6\uffff\32\36",
            "\32\36\6\uffff\32\36",
            "",
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
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | LINE_COMMENT | INT | NEWLINE | ID | WS | QUOTE | EQUALITY | INEQUALITY );";
        }
    }
 

}