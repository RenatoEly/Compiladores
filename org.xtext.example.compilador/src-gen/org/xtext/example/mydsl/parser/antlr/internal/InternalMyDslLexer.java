package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int RULE_A=34;
    public static final int T__50=50;
    public static final int RULE_DEC_OP=10;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_SUB_ASSIGN=23;
    public static final int RULE_HP=36;
    public static final int RULE_INT=45;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=47;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_MUL_ASSIGN=19;
    public static final int RULE_I_CONSTANT=5;
    public static final int RULE_IS=40;
    public static final int RULE_ELLIPSIS=29;
    public static final int RULE_AND_OP=17;
    public static final int RULE_LEFT_ASSIGN=24;
    public static final int RULE_EQ_OP=15;
    public static final int RULE_LEFT_OP=11;
    public static final int RULE_AND_ASSIGN=26;
    public static final int RULE_O=30;
    public static final int RULE_P=38;
    public static final int RULE_L=33;
    public static final int RULE_OR_OP=18;
    public static final int RULE_F_CONSTANT=6;
    public static final int RULE_H=35;
    public static final int RULE_E=37;
    public static final int RULE_D=31;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_CP=41;
    public static final int RULE_GE_OP=14;
    public static final int T__99=99;
    public static final int RULE_SP=42;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_MOD_ASSIGN=21;
    public static final int RULE_XOR_ASSIGN=27;
    public static final int RULE_INC_OP=9;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_NE_OP=16;
    public static final int RULE_OR_ASSIGN=28;
    public static final int RULE_PTR_OP=8;
    public static final int RULE_STRING=46;
    public static final int RULE_ES=43;
    public static final int RULE_STRING_LITERAL=7;
    public static final int RULE_SL_COMMENT=48;
    public static final int T__77=77;
    public static final int RULE_ADD_ASSIGN=22;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=44;
    public static final int RULE_RIGHT_ASSIGN=25;
    public static final int RULE_FS=39;
    public static final int RULE_ANY_OTHER=49;
    public static final int RULE_RIGHT_OP=12;
    public static final int RULE_DIV_ASSIGN=20;
    public static final int RULE_NZ=32;
    public static final int RULE_LE_OP=13;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( '(' )
            // InternalMyDsl.g:11:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( ')' )
            // InternalMyDsl.g:12:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( ',' )
            // InternalMyDsl.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( ':' )
            // InternalMyDsl.g:14:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( '{' )
            // InternalMyDsl.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( '}' )
            // InternalMyDsl.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( '[' )
            // InternalMyDsl.g:17:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( ']' )
            // InternalMyDsl.g:18:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( '.' )
            // InternalMyDsl.g:19:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( '&' )
            // InternalMyDsl.g:20:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( '*' )
            // InternalMyDsl.g:21:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( '+' )
            // InternalMyDsl.g:22:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( '-' )
            // InternalMyDsl.g:23:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( '~' )
            // InternalMyDsl.g:24:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( '!' )
            // InternalMyDsl.g:25:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( '/' )
            // InternalMyDsl.g:26:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( '%' )
            // InternalMyDsl.g:27:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( '<' )
            // InternalMyDsl.g:28:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( '>' )
            // InternalMyDsl.g:29:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( '^' )
            // InternalMyDsl.g:30:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( '|' )
            // InternalMyDsl.g:31:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( '?' )
            // InternalMyDsl.g:32:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( '=' )
            // InternalMyDsl.g:33:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( ';' )
            // InternalMyDsl.g:34:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'auto' )
            // InternalMyDsl.g:35:9: 'auto'
            {
            match("auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'break' )
            // InternalMyDsl.g:36:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'case' )
            // InternalMyDsl.g:37:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'char' )
            // InternalMyDsl.g:38:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'const' )
            // InternalMyDsl.g:39:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'continue' )
            // InternalMyDsl.g:40:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( 'default' )
            // InternalMyDsl.g:41:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( 'do' )
            // InternalMyDsl.g:42:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( 'double' )
            // InternalMyDsl.g:43:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:7: ( 'else' )
            // InternalMyDsl.g:44:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:7: ( 'enum' )
            // InternalMyDsl.g:45:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:7: ( 'extern' )
            // InternalMyDsl.g:46:9: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:7: ( 'float' )
            // InternalMyDsl.g:47:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:7: ( 'for' )
            // InternalMyDsl.g:48:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:49:7: ( 'goto' )
            // InternalMyDsl.g:49:9: 'goto'
            {
            match("goto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:50:7: ( 'if' )
            // InternalMyDsl.g:50:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:51:7: ( 'inline' )
            // InternalMyDsl.g:51:9: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:52:7: ( 'int' )
            // InternalMyDsl.g:52:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:53:7: ( 'long' )
            // InternalMyDsl.g:53:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:54:7: ( 'register' )
            // InternalMyDsl.g:54:9: 'register'
            {
            match("register"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:55:7: ( 'restrict' )
            // InternalMyDsl.g:55:9: 'restrict'
            {
            match("restrict"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:56:7: ( 'return' )
            // InternalMyDsl.g:56:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:57:7: ( 'short' )
            // InternalMyDsl.g:57:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:58:7: ( 'signed' )
            // InternalMyDsl.g:58:9: 'signed'
            {
            match("signed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:59:7: ( 'sizeof' )
            // InternalMyDsl.g:59:9: 'sizeof'
            {
            match("sizeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:60:7: ( 'static' )
            // InternalMyDsl.g:60:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:61:8: ( 'struct' )
            // InternalMyDsl.g:61:10: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:62:8: ( 'switch' )
            // InternalMyDsl.g:62:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:63:8: ( 'typedef' )
            // InternalMyDsl.g:63:10: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:64:8: ( 'union' )
            // InternalMyDsl.g:64:10: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:65:8: ( 'unsigned' )
            // InternalMyDsl.g:65:10: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:66:8: ( 'void' )
            // InternalMyDsl.g:66:10: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:67:8: ( 'volatile' )
            // InternalMyDsl.g:67:10: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:68:8: ( 'while' )
            // InternalMyDsl.g:68:10: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:69:8: ( '_Alignas' )
            // InternalMyDsl.g:69:10: '_Alignas'
            {
            match("_Alignas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:70:8: ( '_Alignof' )
            // InternalMyDsl.g:70:10: '_Alignof'
            {
            match("_Alignof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:71:8: ( '_Atomic' )
            // InternalMyDsl.g:71:10: '_Atomic'
            {
            match("_Atomic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:72:8: ( '_Bool' )
            // InternalMyDsl.g:72:10: '_Bool'
            {
            match("_Bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:73:8: ( '_Complex' )
            // InternalMyDsl.g:73:10: '_Complex'
            {
            match("_Complex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:74:8: ( '_Generic' )
            // InternalMyDsl.g:74:10: '_Generic'
            {
            match("_Generic"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:75:8: ( '_Imaginary' )
            // InternalMyDsl.g:75:10: '_Imaginary'
            {
            match("_Imaginary"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:76:8: ( '_Noreturn' )
            // InternalMyDsl.g:76:10: '_Noreturn'
            {
            match("_Noreturn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:77:8: ( '_Static_assert' )
            // InternalMyDsl.g:77:10: '_Static_assert'
            {
            match("_Static_assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:78:8: ( '_Thread_local' )
            // InternalMyDsl.g:78:10: '_Thread_local'
            {
            match("_Thread_local"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:79:8: ( '__func__' )
            // InternalMyDsl.g:79:10: '__func__'
            {
            match("__func__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "RULE_O"
    public final void mRULE_O() throws RecognitionException {
        try {
            // InternalMyDsl.g:13490:17: ( '0' .. '7' )
            // InternalMyDsl.g:13490:19: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_O"

    // $ANTLR start "RULE_D"
    public final void mRULE_D() throws RecognitionException {
        try {
            // InternalMyDsl.g:13492:17: ( '0' .. '9' )
            // InternalMyDsl.g:13492:19: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_D"

    // $ANTLR start "RULE_NZ"
    public final void mRULE_NZ() throws RecognitionException {
        try {
            // InternalMyDsl.g:13494:18: ( '1' .. '9' )
            // InternalMyDsl.g:13494:20: '1' .. '9'
            {
            matchRange('1','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NZ"

    // $ANTLR start "RULE_L"
    public final void mRULE_L() throws RecognitionException {
        try {
            int _type = RULE_L;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13496:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // InternalMyDsl.g:13496:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_L"

    // $ANTLR start "RULE_A"
    public final void mRULE_A() throws RecognitionException {
        try {
            int _type = RULE_A;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13498:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' ) )
            // InternalMyDsl.g:13498:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' )
            {
            // InternalMyDsl.g:13498:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' '..' '9' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt1=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt1=2;
                }
                break;
            case '_':
                {
                alt1=3;
                }
                break;
            case '0':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:13498:11: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:13498:20: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:13498:29: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:13498:33: '0' '..' '9'
                    {
                    match('0'); 
                    match(".."); 

                    match('9'); 

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
    // $ANTLR end "RULE_A"

    // $ANTLR start "RULE_H"
    public final void mRULE_H() throws RecognitionException {
        try {
            // InternalMyDsl.g:13500:17: ( ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' ) )
            // InternalMyDsl.g:13500:19: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_H"

    // $ANTLR start "RULE_HP"
    public final void mRULE_HP() throws RecognitionException {
        try {
            // InternalMyDsl.g:13502:18: ( '0' ( 'x' | 'X' ) )
            // InternalMyDsl.g:13502:20: '0' ( 'x' | 'X' )
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HP"

    // $ANTLR start "RULE_E"
    public final void mRULE_E() throws RecognitionException {
        try {
            // InternalMyDsl.g:13504:17: ( ( 'E' | 'e' ) ( '+' | '-' )? RULE_D '+' )
            // InternalMyDsl.g:13504:19: ( 'E' | 'e' ) ( '+' | '-' )? RULE_D '+'
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:13504:29: ( '+' | '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='+'||LA2_0=='-') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_D(); 
            match('+'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_E"

    // $ANTLR start "RULE_P"
    public final void mRULE_P() throws RecognitionException {
        try {
            // InternalMyDsl.g:13506:17: ( ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+' )
            // InternalMyDsl.g:13506:19: ( 'P' | 'p' ) ( '+' | '-' )? '{' RULE_D '}' '+'
            {
            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:13506:29: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            match('{'); 
            mRULE_D(); 
            match('}'); 
            match('+'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_P"

    // $ANTLR start "RULE_FS"
    public final void mRULE_FS() throws RecognitionException {
        try {
            // InternalMyDsl.g:13508:18: ( ( 'f' | 'F' | 'l' | 'L' ) )
            // InternalMyDsl.g:13508:20: ( 'f' | 'F' | 'l' | 'L' )
            {
            if ( input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_FS"

    // $ANTLR start "RULE_IS"
    public final void mRULE_IS() throws RecognitionException {
        try {
            // InternalMyDsl.g:13510:18: ( ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? ) )
            // InternalMyDsl.g:13510:20: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? )
            {
            // InternalMyDsl.g:13510:20: ( ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )? | ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )? )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='U'||LA7_0=='u') ) {
                alt7=1;
            }
            else if ( (LA7_0=='L'||LA7_0=='l') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:13510:21: ( 'u' | 'U' ) ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:13510:31: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )?
                    int alt4=5;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='l') ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1=='l') ) {
                            alt4=3;
                        }
                    }
                    else if ( (LA4_0=='L') ) {
                        int LA4_2 = input.LA(2);

                        if ( (LA4_2=='L') ) {
                            alt4=4;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalMyDsl.g:13510:32: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:13510:36: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:13510:40: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:13510:48: 'L' 'L'
                            {
                            match('L'); 
                            match('L'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:13510:58: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' ) ( 'u' | 'U' )?
                    {
                    // InternalMyDsl.g:13510:58: ( 'l' | 'L' | 'l' 'l' | 'L' 'L' )
                    int alt5=4;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='l') ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1=='l') ) {
                            alt5=3;
                        }
                        else {
                            alt5=1;}
                    }
                    else if ( (LA5_0=='L') ) {
                        int LA5_2 = input.LA(2);

                        if ( (LA5_2=='L') ) {
                            alt5=4;
                        }
                        else {
                            alt5=2;}
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalMyDsl.g:13510:59: 'l'
                            {
                            match('l'); 

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:13510:63: 'L'
                            {
                            match('L'); 

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:13510:67: 'l' 'l'
                            {
                            match('l'); 
                            match('l'); 

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:13510:75: 'L' 'L'
                            {
                            match('L'); 
                            match('L'); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:13510:84: ( 'u' | 'U' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='U'||LA6_0=='u') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalMyDsl.g:
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_IS"

    // $ANTLR start "RULE_CP"
    public final void mRULE_CP() throws RecognitionException {
        try {
            // InternalMyDsl.g:13512:18: ( ( 'u' | 'U' | 'L' ) )
            // InternalMyDsl.g:13512:20: ( 'u' | 'U' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CP"

    // $ANTLR start "RULE_SP"
    public final void mRULE_SP() throws RecognitionException {
        try {
            // InternalMyDsl.g:13514:18: ( ( 'u' '8' | 'u' | 'U' | 'L' ) )
            // InternalMyDsl.g:13514:20: ( 'u' '8' | 'u' | 'U' | 'L' )
            {
            // InternalMyDsl.g:13514:20: ( 'u' '8' | 'u' | 'U' | 'L' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 'u':
                {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='8') ) {
                    alt8=1;
                }
                else {
                    alt8=2;}
                }
                break;
            case 'U':
                {
                alt8=3;
                }
                break;
            case 'L':
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:13514:21: 'u' '8'
                    {
                    match('u'); 
                    match('8'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:13514:29: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:13514:33: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:13514:37: 'L'
                    {
                    match('L'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SP"

    // $ANTLR start "RULE_ES"
    public final void mRULE_ES() throws RecognitionException {
        try {
            // InternalMyDsl.g:13516:18: ( '0*' )
            // InternalMyDsl.g:13516:20: '0*'
            {
            match("0*"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ES"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13518:9: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+ )
            // InternalMyDsl.g:13518:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            {
            // InternalMyDsl.g:13518:11: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||(LA9_0>='\f' && LA9_0<='\r')||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ELLIPSIS"
    public final void mRULE_ELLIPSIS() throws RecognitionException {
        try {
            int _type = RULE_ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13520:15: ( '...' )
            // InternalMyDsl.g:13520:17: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELLIPSIS"

    // $ANTLR start "RULE_OR_ASSIGN"
    public final void mRULE_OR_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_OR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13522:16: ( '|=' )
            // InternalMyDsl.g:13522:18: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_ASSIGN"

    // $ANTLR start "RULE_XOR_ASSIGN"
    public final void mRULE_XOR_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_XOR_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13524:17: ( '^=' )
            // InternalMyDsl.g:13524:19: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XOR_ASSIGN"

    // $ANTLR start "RULE_AND_ASSIGN"
    public final void mRULE_AND_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_AND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13526:17: ( '&=' )
            // InternalMyDsl.g:13526:19: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_ASSIGN"

    // $ANTLR start "RULE_RIGHT_ASSIGN"
    public final void mRULE_RIGHT_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13528:19: ( '>>=' )
            // InternalMyDsl.g:13528:21: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_ASSIGN"

    // $ANTLR start "RULE_LEFT_ASSIGN"
    public final void mRULE_LEFT_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_LEFT_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13530:18: ( '<<=' )
            // InternalMyDsl.g:13530:20: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_ASSIGN"

    // $ANTLR start "RULE_SUB_ASSIGN"
    public final void mRULE_SUB_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_SUB_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13532:17: ( '-=' )
            // InternalMyDsl.g:13532:19: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUB_ASSIGN"

    // $ANTLR start "RULE_ADD_ASSIGN"
    public final void mRULE_ADD_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_ADD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13534:17: ( '+=' )
            // InternalMyDsl.g:13534:19: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ADD_ASSIGN"

    // $ANTLR start "RULE_MOD_ASSIGN"
    public final void mRULE_MOD_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_MOD_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13536:17: ( '%=' )
            // InternalMyDsl.g:13536:19: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MOD_ASSIGN"

    // $ANTLR start "RULE_DIV_ASSIGN"
    public final void mRULE_DIV_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_DIV_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13538:17: ( '/=' )
            // InternalMyDsl.g:13538:19: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIV_ASSIGN"

    // $ANTLR start "RULE_MUL_ASSIGN"
    public final void mRULE_MUL_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_MUL_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13540:17: ( '*=' )
            // InternalMyDsl.g:13540:19: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MUL_ASSIGN"

    // $ANTLR start "RULE_OR_OP"
    public final void mRULE_OR_OP() throws RecognitionException {
        try {
            int _type = RULE_OR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13542:12: ( '||' )
            // InternalMyDsl.g:13542:14: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OR_OP"

    // $ANTLR start "RULE_AND_OP"
    public final void mRULE_AND_OP() throws RecognitionException {
        try {
            int _type = RULE_AND_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13544:13: ( '&&' )
            // InternalMyDsl.g:13544:15: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AND_OP"

    // $ANTLR start "RULE_NE_OP"
    public final void mRULE_NE_OP() throws RecognitionException {
        try {
            int _type = RULE_NE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13546:12: ( '!=' )
            // InternalMyDsl.g:13546:14: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NE_OP"

    // $ANTLR start "RULE_EQ_OP"
    public final void mRULE_EQ_OP() throws RecognitionException {
        try {
            int _type = RULE_EQ_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13548:12: ( '==' )
            // InternalMyDsl.g:13548:14: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQ_OP"

    // $ANTLR start "RULE_GE_OP"
    public final void mRULE_GE_OP() throws RecognitionException {
        try {
            int _type = RULE_GE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13550:12: ( '>=' )
            // InternalMyDsl.g:13550:14: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GE_OP"

    // $ANTLR start "RULE_LE_OP"
    public final void mRULE_LE_OP() throws RecognitionException {
        try {
            int _type = RULE_LE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13552:12: ( '<=' )
            // InternalMyDsl.g:13552:14: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LE_OP"

    // $ANTLR start "RULE_RIGHT_OP"
    public final void mRULE_RIGHT_OP() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13554:15: ( '>>' )
            // InternalMyDsl.g:13554:17: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_OP"

    // $ANTLR start "RULE_LEFT_OP"
    public final void mRULE_LEFT_OP() throws RecognitionException {
        try {
            int _type = RULE_LEFT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13556:14: ( '<<' )
            // InternalMyDsl.g:13556:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_OP"

    // $ANTLR start "RULE_INC_OP"
    public final void mRULE_INC_OP() throws RecognitionException {
        try {
            int _type = RULE_INC_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13558:13: ( '++' )
            // InternalMyDsl.g:13558:15: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INC_OP"

    // $ANTLR start "RULE_DEC_OP"
    public final void mRULE_DEC_OP() throws RecognitionException {
        try {
            int _type = RULE_DEC_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13560:13: ( '--' )
            // InternalMyDsl.g:13560:15: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_OP"

    // $ANTLR start "RULE_PTR_OP"
    public final void mRULE_PTR_OP() throws RecognitionException {
        try {
            int _type = RULE_PTR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13562:13: ( '->' )
            // InternalMyDsl.g:13562:15: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PTR_OP"

    // $ANTLR start "RULE_STRING_LITERAL"
    public final void mRULE_STRING_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13564:21: ( ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+ )
            // InternalMyDsl.g:13564:23: ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+
            {
            // InternalMyDsl.g:13564:23: ( ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )* )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\"'||LA13_0=='L'||LA13_0=='U'||LA13_0=='u') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:13564:24: ( RULE_SP )? '\"' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )* '\"' ( RULE_WS )*
            	    {
            	    // InternalMyDsl.g:13564:24: ( RULE_SP )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0=='L'||LA10_0=='U'||LA10_0=='u') ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalMyDsl.g:13564:24: RULE_SP
            	            {
            	            mRULE_SP(); 

            	            }
            	            break;

            	    }

            	    match('\"'); 
            	    // InternalMyDsl.g:13564:37: ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )*
            	    loop11:
            	    do {
            	        int alt11=3;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0=='\n'||LA11_0=='\''||LA11_0=='\\'||LA11_0=='^') ) {
            	            alt11=1;
            	        }
            	        else if ( (LA11_0=='0') ) {
            	            alt11=2;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:13564:38: ( '^' | '\\'' | '\\\\' | '\\n' )
            	    	    {
            	    	    if ( input.LA(1)=='\n'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='^' ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalMyDsl.g:13564:59: RULE_ES
            	    	    {
            	    	    mRULE_ES(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    match('\"'); 
            	    // InternalMyDsl.g:13564:73: ( RULE_WS )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( ((LA12_0>='\t' && LA12_0<='\n')||(LA12_0>='\f' && LA12_0<='\r')||LA12_0==' ') ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:13564:73: RULE_WS
            	    	    {
            	    	    mRULE_WS(); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_LITERAL"

    // $ANTLR start "RULE_F_CONSTANT"
    public final void mRULE_F_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_F_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13566:17: ( ( ( RULE_D )+ RULE_E ( RULE_FS )? | ( RULE_D )* '.' ( RULE_D )+ ( RULE_E )? ( RULE_FS )? | ( RULE_D )+ '.' ( RULE_E )? ( RULE_FS )? | RULE_HP ( RULE_H )+ RULE_P ( RULE_FS )? RULE_HP ( RULE_H )* '.' ( RULE_H )+ RULE_P ( RULE_FS )? | RULE_HP ( RULE_H )+ '.' RULE_P ( RULE_FS )? ) )
            // InternalMyDsl.g:13566:19: ( ( RULE_D )+ RULE_E ( RULE_FS )? | ( RULE_D )* '.' ( RULE_D )+ ( RULE_E )? ( RULE_FS )? | ( RULE_D )+ '.' ( RULE_E )? ( RULE_FS )? | RULE_HP ( RULE_H )+ RULE_P ( RULE_FS )? RULE_HP ( RULE_H )* '.' ( RULE_H )+ RULE_P ( RULE_FS )? | RULE_HP ( RULE_H )+ '.' RULE_P ( RULE_FS )? )
            {
            // InternalMyDsl.g:13566:19: ( ( RULE_D )+ RULE_E ( RULE_FS )? | ( RULE_D )* '.' ( RULE_D )+ ( RULE_E )? ( RULE_FS )? | ( RULE_D )+ '.' ( RULE_E )? ( RULE_FS )? | RULE_HP ( RULE_H )+ RULE_P ( RULE_FS )? RULE_HP ( RULE_H )* '.' ( RULE_H )+ RULE_P ( RULE_FS )? | RULE_HP ( RULE_H )+ '.' RULE_P ( RULE_FS )? )
            int alt30=5;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:13566:20: ( RULE_D )+ RULE_E ( RULE_FS )?
                    {
                    // InternalMyDsl.g:13566:20: ( RULE_D )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMyDsl.g:13566:20: RULE_D
                    	    {
                    	    mRULE_D(); 

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

                    mRULE_E(); 
                    // InternalMyDsl.g:13566:35: ( RULE_FS )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='F'||LA15_0=='L'||LA15_0=='f'||LA15_0=='l') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyDsl.g:13566:35: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:13566:44: ( RULE_D )* '.' ( RULE_D )+ ( RULE_E )? ( RULE_FS )?
                    {
                    // InternalMyDsl.g:13566:44: ( RULE_D )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMyDsl.g:13566:44: RULE_D
                    	    {
                    	    mRULE_D(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('.'); 
                    // InternalMyDsl.g:13566:56: ( RULE_D )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:13566:56: RULE_D
                    	    {
                    	    mRULE_D(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    // InternalMyDsl.g:13566:64: ( RULE_E )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='E'||LA18_0=='e') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyDsl.g:13566:64: RULE_E
                            {
                            mRULE_E(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:13566:72: ( RULE_FS )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='F'||LA19_0=='L'||LA19_0=='f'||LA19_0=='l') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalMyDsl.g:13566:72: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:13566:81: ( RULE_D )+ '.' ( RULE_E )? ( RULE_FS )?
                    {
                    // InternalMyDsl.g:13566:81: ( RULE_D )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:13566:81: RULE_D
                    	    {
                    	    mRULE_D(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    match('.'); 
                    // InternalMyDsl.g:13566:93: ( RULE_E )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMyDsl.g:13566:93: RULE_E
                            {
                            mRULE_E(); 

                            }
                            break;

                    }

                    // InternalMyDsl.g:13566:101: ( RULE_FS )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='F'||LA22_0=='L'||LA22_0=='f'||LA22_0=='l') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalMyDsl.g:13566:101: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:13566:110: RULE_HP ( RULE_H )+ RULE_P ( RULE_FS )? RULE_HP ( RULE_H )* '.' ( RULE_H )+ RULE_P ( RULE_FS )?
                    {
                    mRULE_HP(); 
                    // InternalMyDsl.g:13566:118: ( RULE_H )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='F')||(LA23_0>='a' && LA23_0<='f')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMyDsl.g:13566:118: RULE_H
                    	    {
                    	    mRULE_H(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    mRULE_P(); 
                    // InternalMyDsl.g:13566:133: ( RULE_FS )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='F'||LA24_0=='L'||LA24_0=='f'||LA24_0=='l') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalMyDsl.g:13566:133: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }

                    mRULE_HP(); 
                    // InternalMyDsl.g:13566:150: ( RULE_H )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='F')||(LA25_0>='a' && LA25_0<='f')) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMyDsl.g:13566:150: RULE_H
                    	    {
                    	    mRULE_H(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match('.'); 
                    // InternalMyDsl.g:13566:162: ( RULE_H )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='F')||(LA26_0>='a' && LA26_0<='f')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalMyDsl.g:13566:162: RULE_H
                    	    {
                    	    mRULE_H(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    mRULE_P(); 
                    // InternalMyDsl.g:13566:177: ( RULE_FS )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0=='F'||LA27_0=='L'||LA27_0=='f'||LA27_0=='l') ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalMyDsl.g:13566:177: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:13566:186: RULE_HP ( RULE_H )+ '.' RULE_P ( RULE_FS )?
                    {
                    mRULE_HP(); 
                    // InternalMyDsl.g:13566:194: ( RULE_H )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='F')||(LA28_0>='a' && LA28_0<='f')) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMyDsl.g:13566:194: RULE_H
                    	    {
                    	    mRULE_H(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    match('.'); 
                    mRULE_P(); 
                    // InternalMyDsl.g:13566:213: ( RULE_FS )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0=='F'||LA29_0=='L'||LA29_0=='f'||LA29_0=='l') ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMyDsl.g:13566:213: RULE_FS
                            {
                            mRULE_FS(); 

                            }
                            break;

                    }


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
    // $ANTLR end "RULE_F_CONSTANT"

    // $ANTLR start "RULE_I_CONSTANT"
    public final void mRULE_I_CONSTANT() throws RecognitionException {
        try {
            int _type = RULE_I_CONSTANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13568:17: ( ( RULE_HP ( RULE_H )+ ( RULE_IS )? | RULE_NZ ( RULE_D )* ( RULE_IS )? | '0' ( RULE_O )* ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' ) )
            // InternalMyDsl.g:13568:19: ( RULE_HP ( RULE_H )+ ( RULE_IS )? | RULE_NZ ( RULE_D )* ( RULE_IS )? | '0' ( RULE_O )* ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' )
            {
            // InternalMyDsl.g:13568:19: ( RULE_HP ( RULE_H )+ ( RULE_IS )? | RULE_NZ ( RULE_D )* ( RULE_IS )? | '0' ( RULE_O )* ( RULE_IS )? | ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\'' )
            int alt39=4;
            switch ( input.LA(1) ) {
            case '0':
                {
                int LA39_1 = input.LA(2);

                if ( (LA39_1=='X'||LA39_1=='x') ) {
                    alt39=1;
                }
                else {
                    alt39=3;}
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt39=2;
                }
                break;
            case '\'':
            case 'L':
            case 'U':
            case 'u':
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:13568:20: RULE_HP ( RULE_H )+ ( RULE_IS )?
                    {
                    mRULE_HP(); 
                    // InternalMyDsl.g:13568:28: ( RULE_H )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( ((LA31_0>='0' && LA31_0<='9')||(LA31_0>='A' && LA31_0<='F')||(LA31_0>='a' && LA31_0<='f')) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalMyDsl.g:13568:28: RULE_H
                    	    {
                    	    mRULE_H(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);

                    // InternalMyDsl.g:13568:36: ( RULE_IS )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0=='L'||LA32_0=='U'||LA32_0=='l'||LA32_0=='u') ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMyDsl.g:13568:36: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:13568:45: RULE_NZ ( RULE_D )* ( RULE_IS )?
                    {
                    mRULE_NZ(); 
                    // InternalMyDsl.g:13568:53: ( RULE_D )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>='0' && LA33_0<='9')) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMyDsl.g:13568:53: RULE_D
                    	    {
                    	    mRULE_D(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    // InternalMyDsl.g:13568:61: ( RULE_IS )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0=='L'||LA34_0=='U'||LA34_0=='l'||LA34_0=='u') ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalMyDsl.g:13568:61: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:13568:70: '0' ( RULE_O )* ( RULE_IS )?
                    {
                    match('0'); 
                    // InternalMyDsl.g:13568:74: ( RULE_O )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>='0' && LA35_0<='7')) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMyDsl.g:13568:74: RULE_O
                    	    {
                    	    mRULE_O(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // InternalMyDsl.g:13568:82: ( RULE_IS )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0=='L'||LA36_0=='U'||LA36_0=='l'||LA36_0=='u') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMyDsl.g:13568:82: RULE_IS
                            {
                            mRULE_IS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:13568:91: ( RULE_CP )? '\\'' ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+ '\\''
                    {
                    // InternalMyDsl.g:13568:91: ( RULE_CP )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0=='L'||LA37_0=='U'||LA37_0=='u') ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalMyDsl.g:13568:91: RULE_CP
                            {
                            mRULE_CP(); 

                            }
                            break;

                    }

                    match('\''); 
                    // InternalMyDsl.g:13568:105: ( ( '^' | '\\'' | '\\\\' | '\\n' ) | RULE_ES )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=3;
                        switch ( input.LA(1) ) {
                        case '\'':
                            {
                            int LA38_1 = input.LA(2);

                            if ( (LA38_1=='\n'||LA38_1=='\''||LA38_1=='0'||LA38_1=='\\'||LA38_1=='^') ) {
                                alt38=1;
                            }


                            }
                            break;
                        case '\n':
                        case '\\':
                        case '^':
                            {
                            alt38=1;
                            }
                            break;
                        case '0':
                            {
                            alt38=2;
                            }
                            break;

                        }

                        switch (alt38) {
                    	case 1 :
                    	    // InternalMyDsl.g:13568:106: ( '^' | '\\'' | '\\\\' | '\\n' )
                    	    {
                    	    if ( input.LA(1)=='\n'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='^' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:13568:127: RULE_ES
                    	    {
                    	    mRULE_ES(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt38 >= 1 ) break loop38;
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_I_CONSTANT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13570:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:13570:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:13570:11: ( '^' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='^') ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:13570:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:13570:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>='0' && LA41_0<='9')||(LA41_0>='A' && LA41_0<='Z')||LA41_0=='_'||(LA41_0>='a' && LA41_0<='z')) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13572:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:13572:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:13572:12: ( '0' .. '9' )+
            int cnt42=0;
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>='0' && LA42_0<='9')) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:13572:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt42 >= 1 ) break loop42;
                        EarlyExitException eee =
                            new EarlyExitException(42, input);
                        throw eee;
                }
                cnt42++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13574:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:13574:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:13574:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0=='\"') ) {
                alt45=1;
            }
            else if ( (LA45_0=='\'') ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:13574:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:13574:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop43:
                    do {
                        int alt43=3;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0=='\\') ) {
                            alt43=1;
                        }
                        else if ( ((LA43_0>='\u0000' && LA43_0<='!')||(LA43_0>='#' && LA43_0<='[')||(LA43_0>=']' && LA43_0<='\uFFFF')) ) {
                            alt43=2;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalMyDsl.g:13574:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:13574:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:13574:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:13574:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop44:
                    do {
                        int alt44=3;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0=='\\') ) {
                            alt44=1;
                        }
                        else if ( ((LA44_0>='\u0000' && LA44_0<='&')||(LA44_0>='(' && LA44_0<='[')||(LA44_0>=']' && LA44_0<='\uFFFF')) ) {
                            alt44=2;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMyDsl.g:13574:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:13574:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    match('\''); 

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
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13576:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:13576:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:13576:24: ( options {greedy=false; } : . )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0=='*') ) {
                    int LA46_1 = input.LA(2);

                    if ( (LA46_1=='/') ) {
                        alt46=2;
                    }
                    else if ( ((LA46_1>='\u0000' && LA46_1<='.')||(LA46_1>='0' && LA46_1<='\uFFFF')) ) {
                        alt46=1;
                    }


                }
                else if ( ((LA46_0>='\u0000' && LA46_0<=')')||(LA46_0>='+' && LA46_0<='\uFFFF')) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMyDsl.g:13576:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13578:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:13578:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:13578:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( ((LA47_0>='\u0000' && LA47_0<='\t')||(LA47_0>='\u000B' && LA47_0<='\f')||(LA47_0>='\u000E' && LA47_0<='\uFFFF')) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:13578:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop47;
                }
            } while (true);

            // InternalMyDsl.g:13578:40: ( ( '\\r' )? '\\n' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0=='\n'||LA49_0=='\r') ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:13578:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:13578:41: ( '\\r' )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0=='\r') ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // InternalMyDsl.g:13578:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13580:16: ( . )
            // InternalMyDsl.g:13580:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | RULE_L | RULE_A | RULE_WS | RULE_ELLIPSIS | RULE_OR_ASSIGN | RULE_XOR_ASSIGN | RULE_AND_ASSIGN | RULE_RIGHT_ASSIGN | RULE_LEFT_ASSIGN | RULE_SUB_ASSIGN | RULE_ADD_ASSIGN | RULE_MOD_ASSIGN | RULE_DIV_ASSIGN | RULE_MUL_ASSIGN | RULE_OR_OP | RULE_AND_OP | RULE_NE_OP | RULE_EQ_OP | RULE_GE_OP | RULE_LE_OP | RULE_RIGHT_OP | RULE_LEFT_OP | RULE_INC_OP | RULE_DEC_OP | RULE_PTR_OP | RULE_STRING_LITERAL | RULE_F_CONSTANT | RULE_I_CONSTANT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER )
        int alt50=103;
        alt50 = dfa50.predict(input);
        switch (alt50) {
            case 1 :
                // InternalMyDsl.g:1:10: T__50
                {
                mT__50(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__51
                {
                mT__51(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__52
                {
                mT__52(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__53
                {
                mT__53(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__54
                {
                mT__54(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__55
                {
                mT__55(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__56
                {
                mT__56(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__57
                {
                mT__57(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__58
                {
                mT__58(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__59
                {
                mT__59(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__60
                {
                mT__60(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__61
                {
                mT__61(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__62
                {
                mT__62(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__63
                {
                mT__63(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__64
                {
                mT__64(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__65
                {
                mT__65(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__66
                {
                mT__66(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__67
                {
                mT__67(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__68
                {
                mT__68(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__69
                {
                mT__69(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__70
                {
                mT__70(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__71
                {
                mT__71(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__72
                {
                mT__72(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__73
                {
                mT__73(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__74
                {
                mT__74(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__75
                {
                mT__75(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__76
                {
                mT__76(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__77
                {
                mT__77(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__78
                {
                mT__78(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__79
                {
                mT__79(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__80
                {
                mT__80(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__81
                {
                mT__81(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__82
                {
                mT__82(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__83
                {
                mT__83(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__84
                {
                mT__84(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__85
                {
                mT__85(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__86
                {
                mT__86(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__87
                {
                mT__87(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__88
                {
                mT__88(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__89
                {
                mT__89(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__90
                {
                mT__90(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__91
                {
                mT__91(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__92
                {
                mT__92(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__93
                {
                mT__93(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: T__94
                {
                mT__94(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:280: T__95
                {
                mT__95(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:286: T__96
                {
                mT__96(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:292: T__97
                {
                mT__97(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:298: T__98
                {
                mT__98(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:304: T__99
                {
                mT__99(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:310: T__100
                {
                mT__100(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:317: T__101
                {
                mT__101(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:324: T__102
                {
                mT__102(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:331: T__103
                {
                mT__103(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:338: T__104
                {
                mT__104(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:345: T__105
                {
                mT__105(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:352: T__106
                {
                mT__106(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:359: T__107
                {
                mT__107(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:366: T__108
                {
                mT__108(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:373: T__109
                {
                mT__109(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:380: T__110
                {
                mT__110(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:387: T__111
                {
                mT__111(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:394: T__112
                {
                mT__112(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:401: T__113
                {
                mT__113(); 

                }
                break;
            case 65 :
                // InternalMyDsl.g:1:408: T__114
                {
                mT__114(); 

                }
                break;
            case 66 :
                // InternalMyDsl.g:1:415: T__115
                {
                mT__115(); 

                }
                break;
            case 67 :
                // InternalMyDsl.g:1:422: T__116
                {
                mT__116(); 

                }
                break;
            case 68 :
                // InternalMyDsl.g:1:429: T__117
                {
                mT__117(); 

                }
                break;
            case 69 :
                // InternalMyDsl.g:1:436: T__118
                {
                mT__118(); 

                }
                break;
            case 70 :
                // InternalMyDsl.g:1:443: RULE_L
                {
                mRULE_L(); 

                }
                break;
            case 71 :
                // InternalMyDsl.g:1:450: RULE_A
                {
                mRULE_A(); 

                }
                break;
            case 72 :
                // InternalMyDsl.g:1:457: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 73 :
                // InternalMyDsl.g:1:465: RULE_ELLIPSIS
                {
                mRULE_ELLIPSIS(); 

                }
                break;
            case 74 :
                // InternalMyDsl.g:1:479: RULE_OR_ASSIGN
                {
                mRULE_OR_ASSIGN(); 

                }
                break;
            case 75 :
                // InternalMyDsl.g:1:494: RULE_XOR_ASSIGN
                {
                mRULE_XOR_ASSIGN(); 

                }
                break;
            case 76 :
                // InternalMyDsl.g:1:510: RULE_AND_ASSIGN
                {
                mRULE_AND_ASSIGN(); 

                }
                break;
            case 77 :
                // InternalMyDsl.g:1:526: RULE_RIGHT_ASSIGN
                {
                mRULE_RIGHT_ASSIGN(); 

                }
                break;
            case 78 :
                // InternalMyDsl.g:1:544: RULE_LEFT_ASSIGN
                {
                mRULE_LEFT_ASSIGN(); 

                }
                break;
            case 79 :
                // InternalMyDsl.g:1:561: RULE_SUB_ASSIGN
                {
                mRULE_SUB_ASSIGN(); 

                }
                break;
            case 80 :
                // InternalMyDsl.g:1:577: RULE_ADD_ASSIGN
                {
                mRULE_ADD_ASSIGN(); 

                }
                break;
            case 81 :
                // InternalMyDsl.g:1:593: RULE_MOD_ASSIGN
                {
                mRULE_MOD_ASSIGN(); 

                }
                break;
            case 82 :
                // InternalMyDsl.g:1:609: RULE_DIV_ASSIGN
                {
                mRULE_DIV_ASSIGN(); 

                }
                break;
            case 83 :
                // InternalMyDsl.g:1:625: RULE_MUL_ASSIGN
                {
                mRULE_MUL_ASSIGN(); 

                }
                break;
            case 84 :
                // InternalMyDsl.g:1:641: RULE_OR_OP
                {
                mRULE_OR_OP(); 

                }
                break;
            case 85 :
                // InternalMyDsl.g:1:652: RULE_AND_OP
                {
                mRULE_AND_OP(); 

                }
                break;
            case 86 :
                // InternalMyDsl.g:1:664: RULE_NE_OP
                {
                mRULE_NE_OP(); 

                }
                break;
            case 87 :
                // InternalMyDsl.g:1:675: RULE_EQ_OP
                {
                mRULE_EQ_OP(); 

                }
                break;
            case 88 :
                // InternalMyDsl.g:1:686: RULE_GE_OP
                {
                mRULE_GE_OP(); 

                }
                break;
            case 89 :
                // InternalMyDsl.g:1:697: RULE_LE_OP
                {
                mRULE_LE_OP(); 

                }
                break;
            case 90 :
                // InternalMyDsl.g:1:708: RULE_RIGHT_OP
                {
                mRULE_RIGHT_OP(); 

                }
                break;
            case 91 :
                // InternalMyDsl.g:1:722: RULE_LEFT_OP
                {
                mRULE_LEFT_OP(); 

                }
                break;
            case 92 :
                // InternalMyDsl.g:1:735: RULE_INC_OP
                {
                mRULE_INC_OP(); 

                }
                break;
            case 93 :
                // InternalMyDsl.g:1:747: RULE_DEC_OP
                {
                mRULE_DEC_OP(); 

                }
                break;
            case 94 :
                // InternalMyDsl.g:1:759: RULE_PTR_OP
                {
                mRULE_PTR_OP(); 

                }
                break;
            case 95 :
                // InternalMyDsl.g:1:771: RULE_STRING_LITERAL
                {
                mRULE_STRING_LITERAL(); 

                }
                break;
            case 96 :
                // InternalMyDsl.g:1:791: RULE_F_CONSTANT
                {
                mRULE_F_CONSTANT(); 

                }
                break;
            case 97 :
                // InternalMyDsl.g:1:807: RULE_I_CONSTANT
                {
                mRULE_I_CONSTANT(); 

                }
                break;
            case 98 :
                // InternalMyDsl.g:1:823: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 99 :
                // InternalMyDsl.g:1:831: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 100 :
                // InternalMyDsl.g:1:840: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 101 :
                // InternalMyDsl.g:1:852: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 102 :
                // InternalMyDsl.g:1:868: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 103 :
                // InternalMyDsl.g:1:884: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA30 dfa30 = new DFA30(this);
    protected DFA50 dfa50 = new DFA50(this);
    static final String DFA30_eotS =
        "\5\uffff\1\10\5\uffff";
    static final String DFA30_eofS =
        "\13\uffff";
    static final String DFA30_minS =
        "\2\56\1\uffff\1\56\2\60\1\uffff\1\56\3\uffff";
    static final String DFA30_maxS =
        "\1\71\1\170\1\uffff\1\145\1\146\1\71\1\uffff\1\160\3\uffff";
    static final String DFA30_acceptS =
        "\2\uffff\1\2\3\uffff\1\1\1\uffff\1\3\1\4\1\5";
    static final String DFA30_specialS =
        "\13\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\2\1\uffff\1\1\11\3",
            "\1\5\1\uffff\12\3\13\uffff\1\6\22\uffff\1\4\14\uffff\1\6\22\uffff\1\4",
            "",
            "\1\5\1\uffff\12\3\13\uffff\1\6\37\uffff\1\6",
            "\12\7\7\uffff\6\7\32\uffff\6\7",
            "\12\2",
            "",
            "\1\12\1\uffff\12\7\7\uffff\6\7\11\uffff\1\11\20\uffff\6\7\11\uffff\1\11",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "13566:19: ( ( RULE_D )+ RULE_E ( RULE_FS )? | ( RULE_D )* '.' ( RULE_D )+ ( RULE_E )? ( RULE_FS )? | ( RULE_D )+ '.' ( RULE_E )? ( RULE_FS )? | RULE_HP ( RULE_H )+ RULE_P ( RULE_FS )? RULE_HP ( RULE_H )* '.' ( RULE_H )+ RULE_P ( RULE_FS )? | RULE_HP ( RULE_H )+ '.' RULE_P ( RULE_FS )? )";
        }
    }
    static final String DFA50_eotS =
        "\11\uffff\1\74\1\100\1\102\1\105\1\111\1\uffff\1\114\1\120\1\122\1\125\1\130\1\132\1\136\1\uffff\1\141\1\uffff\22\144\1\175\1\uffff\2\144\1\62\1\175\1\62\41\uffff\1\u0099\2\uffff\1\u009b\14\uffff\1\133\1\uffff\5\133\1\u00a3\6\133\1\u00aa\12\133\2\uffff\13\133\1\75\1\uffff\1\175\1\u00c9\6\uffff\1\175\3\uffff\1\u0092\4\uffff\7\133\1\uffff\4\133\1\u00df\1\133\1\uffff\1\133\1\u00e2\32\133\1\uffff\1\175\1\uffff\1\174\3\uffff\1\175\4\uffff\1\u0102\1\133\1\u0104\1\u0105\4\133\1\u010a\1\u010b\2\133\1\uffff\1\u010e\1\133\1\uffff\1\u0110\14\133\1\u011d\14\133\1\174\3\uffff\1\u0092\1\uffff\1\u012b\2\uffff\1\u012c\3\133\2\uffff\1\133\1\u0131\1\uffff\1\133\1\uffff\3\133\1\u0136\6\133\1\u013d\1\133\1\uffff\1\133\1\u0140\2\133\1\u0143\7\133\3\uffff\2\133\1\u014d\1\u014e\1\uffff\1\u014f\2\133\1\u0152\1\uffff\1\u0153\1\u0154\1\u0155\1\u0156\1\u0157\1\133\1\uffff\2\133\1\uffff\2\133\1\uffff\10\133\1\u0166\3\uffff\2\133\6\uffff\1\u0169\4\133\1\u016e\7\133\1\u0176\1\uffff\1\u0177\1\u0178\1\uffff\1\u0179\1\u017a\1\u017b\1\u017c\1\uffff\1\u017d\1\u017e\4\133\1\u0183\11\uffff\1\133\1\u0185\2\133\1\uffff\1\u0188\1\uffff\2\133\1\uffff\5\133\1\u0190\1\u0191\2\uffff";
    static final String DFA50_eofS =
        "\u0192\uffff";
    static final String DFA50_minS =
        "\1\0\10\uffff\1\56\1\46\1\75\1\53\1\55\1\uffff\1\75\1\52\1\75\1\74\3\75\1\uffff\1\75\1\uffff\14\60\1\42\4\60\1\42\1\56\1\uffff\1\42\1\60\1\0\1\56\1\0\41\uffff\1\75\2\uffff\1\75\14\uffff\1\164\1\uffff\1\145\1\163\1\141\1\156\1\146\1\60\1\163\1\165\1\164\1\157\1\162\1\164\1\60\1\154\1\156\1\147\1\157\1\147\1\141\1\151\1\160\1\151\1\42\2\uffff\2\151\1\154\2\157\1\145\1\155\1\157\1\164\1\150\1\146\1\56\1\60\2\56\1\uffff\2\0\1\uffff\1\0\1\uffff\1\56\3\0\1\12\4\uffff\1\157\1\141\1\145\1\162\1\163\1\141\1\142\1\uffff\1\145\1\155\1\145\1\141\1\60\1\157\1\uffff\1\151\1\60\1\147\1\151\1\164\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\145\1\157\1\151\1\144\1\141\1\154\1\151\2\157\1\155\1\156\1\141\1\162\1\141\1\162\1\165\1\uffff\1\56\1\uffff\10\0\1\uffff\1\60\1\153\2\60\1\164\1\151\1\165\1\154\2\60\1\162\1\164\1\uffff\1\60\1\156\1\uffff\1\60\1\163\2\162\1\164\1\145\1\157\1\151\2\143\1\144\1\156\1\147\1\60\1\164\1\145\1\147\1\155\1\154\1\160\1\145\1\147\1\145\1\164\1\145\1\156\4\0\1\12\1\uffff\1\60\2\uffff\1\60\1\156\1\154\1\145\2\uffff\1\156\1\60\1\uffff\1\145\1\uffff\1\164\1\151\1\156\1\60\1\144\1\146\1\143\1\164\1\150\1\145\1\60\1\156\1\uffff\1\151\1\60\1\156\1\151\1\60\1\154\1\162\1\151\1\164\1\151\1\141\1\143\1\0\2\uffff\1\165\1\164\2\60\1\uffff\1\60\1\145\1\143\1\60\1\uffff\5\60\1\146\1\uffff\1\145\1\154\1\uffff\1\141\1\143\1\uffff\1\145\1\151\1\156\1\165\1\143\1\144\1\137\1\145\1\60\3\uffff\1\162\1\164\6\uffff\1\60\1\144\1\145\1\163\1\146\1\60\1\170\1\143\1\141\1\162\3\137\1\60\1\uffff\2\60\1\uffff\4\60\1\uffff\2\60\1\162\1\156\1\141\1\154\1\60\11\uffff\1\171\1\60\1\163\1\157\1\uffff\1\60\1\uffff\1\163\1\143\1\uffff\1\145\1\141\1\162\1\154\1\164\2\60\2\uffff";
    static final String DFA50_maxS =
        "\1\uffff\10\uffff\1\71\3\75\1\76\1\uffff\4\75\1\76\1\172\1\174\1\uffff\1\75\1\uffff\22\172\1\170\1\uffff\2\172\1\uffff\1\145\1\uffff\41\uffff\1\75\2\uffff\1\75\14\uffff\1\164\1\uffff\1\145\1\163\1\141\1\156\1\146\1\172\1\163\1\165\1\164\1\157\1\162\1\164\1\172\1\164\1\156\1\164\1\157\1\172\1\162\1\151\1\160\1\163\1\42\2\uffff\1\154\1\151\1\164\2\157\1\145\1\155\1\157\1\164\1\150\1\146\1\56\1\146\2\145\1\uffff\2\uffff\1\uffff\1\uffff\1\uffff\1\145\3\uffff\1\136\4\uffff\1\157\1\141\1\145\1\162\1\164\1\141\1\142\1\uffff\1\145\1\155\1\145\1\141\1\172\1\157\1\uffff\1\151\1\172\1\147\1\151\1\164\1\165\1\162\1\156\1\145\1\164\1\165\1\164\1\145\1\157\1\151\1\144\1\141\1\154\1\151\2\157\1\155\1\156\1\141\1\162\1\141\1\162\1\165\1\uffff\1\160\1\uffff\10\uffff\1\uffff\1\172\1\153\2\172\1\164\1\151\1\165\1\154\2\172\1\162\1\164\1\uffff\1\172\1\156\1\uffff\1\172\1\163\2\162\1\164\1\145\1\157\1\151\2\143\1\144\1\156\1\147\1\172\1\164\1\145\1\147\1\155\1\154\1\160\1\145\1\147\1\145\1\164\1\145\1\156\4\uffff\1\136\1\uffff\1\172\2\uffff\1\172\1\156\1\154\1\145\2\uffff\1\156\1\172\1\uffff\1\145\1\uffff\1\164\1\151\1\156\1\172\1\144\1\146\1\143\1\164\1\150\1\145\1\172\1\156\1\uffff\1\151\1\172\1\156\1\151\1\172\1\154\1\162\1\151\1\164\1\151\1\141\1\143\1\uffff\2\uffff\1\165\1\164\2\172\1\uffff\1\172\1\145\1\143\1\172\1\uffff\5\172\1\146\1\uffff\1\145\1\154\1\uffff\1\157\1\143\1\uffff\1\145\1\151\1\156\1\165\1\143\1\144\1\137\1\145\1\172\3\uffff\1\162\1\164\6\uffff\1\172\1\144\1\145\1\163\1\146\1\172\1\170\1\143\1\141\1\162\3\137\1\172\1\uffff\2\172\1\uffff\4\172\1\uffff\2\172\1\162\1\156\1\141\1\154\1\172\11\uffff\1\171\1\172\1\163\1\157\1\uffff\1\172\1\uffff\1\163\1\143\1\uffff\1\145\1\141\1\162\1\154\1\164\2\172\2\uffff";
    static final String DFA50_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff\1\16\7\uffff\1\26\1\uffff\1\30\23\uffff\1\110\5\uffff\1\147\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\111\1\11\1\140\1\114\1\125\1\12\1\123\1\13\1\120\1\134\1\14\1\117\1\135\1\136\1\15\1\16\1\126\1\17\1\122\1\145\1\146\1\20\1\121\1\21\1\uffff\1\131\1\22\1\uffff\1\130\1\23\1\113\1\24\1\142\1\112\1\124\1\25\1\26\1\127\1\27\1\30\1\uffff\1\106\27\uffff\1\137\1\141\17\uffff\1\110\2\uffff\1\137\1\uffff\1\144\5\uffff\1\116\1\133\1\115\1\132\7\uffff\1\40\6\uffff\1\50\34\uffff\1\107\1\uffff\1\143\10\uffff\1\141\14\uffff\1\46\2\uffff\1\52\37\uffff\1\31\1\uffff\1\33\1\34\4\uffff\1\42\1\43\2\uffff\1\47\1\uffff\1\53\14\uffff\1\70\15\uffff\1\32\1\35\4\uffff\1\45\4\uffff\1\57\6\uffff\1\66\2\uffff\1\72\2\uffff\1\76\11\uffff\1\41\1\44\1\51\2\uffff\1\56\1\60\1\61\1\62\1\63\1\64\16\uffff\1\37\2\uffff\1\65\4\uffff\1\75\7\uffff\1\36\1\54\1\55\1\67\1\71\1\73\1\74\1\77\1\100\4\uffff\1\105\1\uffff\1\102\2\uffff\1\101\7\uffff\1\104\1\103";
    static final String DFA50_specialS =
        "\1\15\56\uffff\1\14\1\uffff\1\17\134\uffff\1\0\1\6\1\uffff\1\3\2\uffff\1\4\1\13\1\22\63\uffff\1\23\1\5\1\2\1\16\1\20\1\21\1\12\1\25\53\uffff\1\24\1\1\1\10\1\11\51\uffff\1\7\147\uffff}>";
    static final String[] DFA50_transitionS = {
            "\11\62\2\54\1\62\2\54\22\62\1\54\1\17\1\57\2\62\1\21\1\12\1\61\1\1\1\2\1\13\1\14\1\3\1\15\1\11\1\20\1\53\11\60\1\4\1\30\1\22\1\27\1\23\1\26\1\62\13\56\1\55\10\56\1\52\5\56\1\7\1\62\1\10\1\24\1\50\1\62\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\51\1\40\2\51\1\41\5\51\1\42\1\43\1\44\1\45\1\46\1\47\3\51\1\5\1\25\1\6\1\16\uff81\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\73\1\uffff\12\75",
            "\1\77\26\uffff\1\76",
            "\1\101",
            "\1\104\21\uffff\1\103",
            "\1\107\17\uffff\1\106\1\110",
            "",
            "\1\113",
            "\1\116\4\uffff\1\117\15\uffff\1\115",
            "\1\121",
            "\1\123\1\124",
            "\1\127\1\126",
            "\1\131\3\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\134\76\uffff\1\135",
            "",
            "\1\140",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\24\133\1\143\5\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\21\133\1\145\10\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\1\146\6\133\1\147\6\133\1\150\13\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\4\133\1\151\11\133\1\152\13\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\13\133\1\153\1\133\1\154\11\133\1\155\2\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\13\133\1\156\2\133\1\157\13\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\16\133\1\160\13\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\5\133\1\161\7\133\1\162\14\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\16\133\1\163\13\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\4\133\1\164\25\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\7\133\1\165\1\166\12\133\1\167\2\133\1\170\3\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\30\133\1\171\1\133",
            "\1\174\4\uffff\1\175\10\uffff\10\133\1\173\1\133\7\uffff\32\133\4\uffff\1\133\1\uffff\15\133\1\172\14\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\16\133\1\176\13\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\7\133\1\177\22\133",
            "\12\133\7\uffff\1\u0080\1\u0081\1\u0082\3\133\1\u0083\1\133\1\u0084\4\133\1\u0085\4\133\1\u0086\1\u0087\6\133\4\uffff\1\u0088\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\174\4\uffff\1\175\10\uffff\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u0089\1\uffff\10\u008b\2\u008c\13\uffff\1\75\22\uffff\1\u008a\14\uffff\1\75\22\uffff\1\u008a",
            "",
            "\1\174\4\uffff\1\175\10\uffff\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\u0092\1\u008f\27\u0092\1\u0090\4\u0092\1\u008f\10\u0092\1\u0091\53\u0092\1\u008e\1\u0092\1\u008f\uffa1\u0092",
            "\1\75\1\uffff\12\u0093\13\uffff\1\75\37\uffff\1\75",
            "\12\u0092\1\u0096\34\u0092\1\u0097\10\u0092\1\u0095\53\u0092\1\u0094\1\u0092\1\u0096\uffa1\u0092",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0098",
            "",
            "",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\24\133\1\u00a2\5\133",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u00ab\7\uffff\1\u00ac",
            "\1\u00ad",
            "\1\u00ae\13\uffff\1\u00af\1\u00b0",
            "\1\u00b1",
            "\1\u00b2\22\uffff\1\u00b3",
            "\1\u00b4\20\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\11\uffff\1\u00b9",
            "\1\174",
            "",
            "",
            "\1\u00ba\2\uffff\1\u00bb",
            "\1\u00bc",
            "\1\u00bd\7\uffff\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\u00c8\7\uffff\6\u00c8\32\uffff\6\u00c8",
            "\1\75\1\uffff\10\u008b\2\u008c\13\uffff\1\75\37\uffff\1\75",
            "\1\75\1\uffff\12\u008c\13\uffff\1\75\37\uffff\1\75",
            "",
            "\12\u0092\1\u00cb\27\u0092\1\u00ca\4\u0092\1\u00cb\10\u0092\1\u00cc\53\u0092\1\u00cb\1\u0092\1\u00cb\uffa1\u0092",
            "\12\u0092\1\u008f\27\u0092\1\u0090\4\u0092\1\u008f\10\u0092\1\u0091\53\u0092\1\u008e\1\u0092\1\u008f\uffa1\u0092",
            "",
            "\52\u0092\1\u00cd\uffd5\u0092",
            "",
            "\1\75\1\uffff\12\u0093\13\uffff\1\75\37\uffff\1\75",
            "\12\u0092\1\u00cf\34\u0092\1\u00ce\10\u0092\1\u00d0\53\u0092\1\u00cf\1\u0092\1\u00cf\uffa1\u0092",
            "\52\u0092\1\u00d1\uffd5\u0092",
            "\12\u0092\1\u0096\34\u0092\1\u00d2\10\u0092\1\u0095\53\u0092\1\u0094\1\u0092\1\u0096\uffa1\u0092",
            "\1\175\34\uffff\1\175\10\uffff\1\175\53\uffff\1\175\1\uffff\1\175",
            "",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "",
            "\1\75\1\uffff\12\u00c8\7\uffff\6\u00c8\11\uffff\1\75\20\uffff\6\u00c8\11\uffff\1\75",
            "",
            "\11\u0092\2\u00fd\1\u0092\2\u00fd\22\u0092\1\u00fd\1\u0092\1\u0101\51\u0092\1\u0100\10\u0092\1\u00ff\37\u0092\1\u00fe\uff8a\u0092",
            "\12\u0092\1\u008f\27\u0092\1\u0090\4\u0092\1\u008f\10\u0092\1\u0091\53\u0092\1\u008e\1\u0092\1\u008f\uffa1\u0092",
            "\52\u0092\1\u00cd\uffd5\u0092",
            "\12\u0092\1\u008f\27\u0092\1\u0090\4\u0092\1\u008f\10\u0092\1\u0091\53\u0092\1\u008e\1\u0092\1\u008f\uffa1\u0092",
            "\12\u0092\1\u0096\34\u0092\1\u00d2\10\u0092\1\u0095\53\u0092\1\u0094\1\u0092\1\u0096\uffa1\u0092",
            "\12\u0092\1\u0096\34\u0092\1\u00d2\10\u0092\1\u0095\53\u0092\1\u0094\1\u0092\1\u0096\uffa1\u0092",
            "\52\u0092\1\u00d1\uffd5\u0092",
            "\12\u0092\1\u0096\34\u0092\1\u00d2\10\u0092\1\u0095\53\u0092\1\u0094\1\u0092\1\u0096\uffa1\u0092",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u0103",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u010c",
            "\1\u010d",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u010f",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\11\u0092\2\u00fd\1\u0092\2\u00fd\22\u0092\1\u00fd\1\u0092\1\u0101\51\u0092\1\u0100\10\u0092\1\u00ff\37\u0092\1\u00fe\uff8a\u0092",
            "\42\u0092\1\u0101\25\u0092\1\u012a\uffc7\u0092",
            "\42\u0092\1\u0101\uffdd\u0092",
            "\42\u0092\1\u0101\uffdd\u0092",
            "\1\174\27\uffff\1\174\4\uffff\1\174\10\uffff\1\174\53\uffff\1\174\1\uffff\1\174",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "",
            "",
            "\1\u0130",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            "\1\u0132",
            "",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u013e",
            "",
            "\1\u013f",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u0141",
            "\1\u0142",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\42\u0092\1\u0101\uffdd\u0092",
            "",
            "",
            "\1\u014b",
            "\1\u014c",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u0150",
            "\1\u0151",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\u015a",
            "",
            "\1\u015b\15\uffff\1\u015c",
            "\1\u015d",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            "",
            "",
            "\1\u0167",
            "\1\u0168",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0184",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\1\u0186",
            "\1\u0187",
            "",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            "\1\u0189",
            "\1\u018a",
            "",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "\12\133\7\uffff\32\133\4\uffff\1\133\1\uffff\32\133",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | RULE_L | RULE_A | RULE_WS | RULE_ELLIPSIS | RULE_OR_ASSIGN | RULE_XOR_ASSIGN | RULE_AND_ASSIGN | RULE_RIGHT_ASSIGN | RULE_LEFT_ASSIGN | RULE_SUB_ASSIGN | RULE_ADD_ASSIGN | RULE_MOD_ASSIGN | RULE_DIV_ASSIGN | RULE_MUL_ASSIGN | RULE_OR_OP | RULE_AND_OP | RULE_NE_OP | RULE_EQ_OP | RULE_GE_OP | RULE_LE_OP | RULE_RIGHT_OP | RULE_LEFT_OP | RULE_INC_OP | RULE_DEC_OP | RULE_PTR_OP | RULE_STRING_LITERAL | RULE_F_CONSTANT | RULE_I_CONSTANT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_142 = input.LA(1);

                        s = -1;
                        if ( (LA50_142=='\"') ) {s = 202;}

                        else if ( (LA50_142=='\n'||LA50_142=='\''||LA50_142=='\\'||LA50_142=='^') ) {s = 203;}

                        else if ( (LA50_142=='0') ) {s = 204;}

                        else if ( ((LA50_142>='\u0000' && LA50_142<='\t')||(LA50_142>='\u000B' && LA50_142<='!')||(LA50_142>='#' && LA50_142<='&')||(LA50_142>='(' && LA50_142<='/')||(LA50_142>='1' && LA50_142<='[')||LA50_142==']'||(LA50_142>='_' && LA50_142<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA50_254 = input.LA(1);

                        s = -1;
                        if ( (LA50_254=='8') ) {s = 298;}

                        else if ( (LA50_254=='\"') ) {s = 257;}

                        else if ( ((LA50_254>='\u0000' && LA50_254<='!')||(LA50_254>='#' && LA50_254<='7')||(LA50_254>='9' && LA50_254<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA50_204 = input.LA(1);

                        s = -1;
                        if ( (LA50_204=='*') ) {s = 205;}

                        else if ( ((LA50_204>='\u0000' && LA50_204<=')')||(LA50_204>='+' && LA50_204<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA50_145 = input.LA(1);

                        s = -1;
                        if ( (LA50_145=='*') ) {s = 205;}

                        else if ( ((LA50_145>='\u0000' && LA50_145<=')')||(LA50_145>='+' && LA50_145<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA50_148 = input.LA(1);

                        s = -1;
                        if ( (LA50_148=='\'') ) {s = 206;}

                        else if ( (LA50_148=='\n'||LA50_148=='\\'||LA50_148=='^') ) {s = 207;}

                        else if ( (LA50_148=='0') ) {s = 208;}

                        else if ( ((LA50_148>='\u0000' && LA50_148<='\t')||(LA50_148>='\u000B' && LA50_148<='&')||(LA50_148>='(' && LA50_148<='/')||(LA50_148>='1' && LA50_148<='[')||LA50_148==']'||(LA50_148>='_' && LA50_148<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA50_203 = input.LA(1);

                        s = -1;
                        if ( (LA50_203=='\"') ) {s = 144;}

                        else if ( (LA50_203=='\\') ) {s = 142;}

                        else if ( (LA50_203=='\n'||LA50_203=='\''||LA50_203=='^') ) {s = 143;}

                        else if ( (LA50_203=='0') ) {s = 145;}

                        else if ( ((LA50_203>='\u0000' && LA50_203<='\t')||(LA50_203>='\u000B' && LA50_203<='!')||(LA50_203>='#' && LA50_203<='&')||(LA50_203>='(' && LA50_203<='/')||(LA50_203>='1' && LA50_203<='[')||LA50_203==']'||(LA50_203>='_' && LA50_203<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA50_143 = input.LA(1);

                        s = -1;
                        if ( (LA50_143=='\"') ) {s = 144;}

                        else if ( (LA50_143=='\\') ) {s = 142;}

                        else if ( (LA50_143=='0') ) {s = 145;}

                        else if ( (LA50_143=='\n'||LA50_143=='\''||LA50_143=='^') ) {s = 143;}

                        else if ( ((LA50_143>='\u0000' && LA50_143<='\t')||(LA50_143>='\u000B' && LA50_143<='!')||(LA50_143>='#' && LA50_143<='&')||(LA50_143>='(' && LA50_143<='/')||(LA50_143>='1' && LA50_143<='[')||LA50_143==']'||(LA50_143>='_' && LA50_143<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA50_298 = input.LA(1);

                        s = -1;
                        if ( (LA50_298=='\"') ) {s = 257;}

                        else if ( ((LA50_298>='\u0000' && LA50_298<='!')||(LA50_298>='#' && LA50_298<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA50_255 = input.LA(1);

                        s = -1;
                        if ( (LA50_255=='\"') ) {s = 257;}

                        else if ( ((LA50_255>='\u0000' && LA50_255<='!')||(LA50_255>='#' && LA50_255<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA50_256 = input.LA(1);

                        s = -1;
                        if ( (LA50_256=='\"') ) {s = 257;}

                        else if ( ((LA50_256>='\u0000' && LA50_256<='!')||(LA50_256>='#' && LA50_256<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA50_208 = input.LA(1);

                        s = -1;
                        if ( (LA50_208=='*') ) {s = 209;}

                        else if ( ((LA50_208>='\u0000' && LA50_208<=')')||(LA50_208>='+' && LA50_208<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA50_149 = input.LA(1);

                        s = -1;
                        if ( (LA50_149=='*') ) {s = 209;}

                        else if ( ((LA50_149>='\u0000' && LA50_149<=')')||(LA50_149>='+' && LA50_149<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA50_47 = input.LA(1);

                        s = -1;
                        if ( (LA50_47=='\\') ) {s = 142;}

                        else if ( (LA50_47=='\n'||LA50_47=='\''||LA50_47=='^') ) {s = 143;}

                        else if ( (LA50_47=='\"') ) {s = 144;}

                        else if ( (LA50_47=='0') ) {s = 145;}

                        else if ( ((LA50_47>='\u0000' && LA50_47<='\t')||(LA50_47>='\u000B' && LA50_47<='!')||(LA50_47>='#' && LA50_47<='&')||(LA50_47>='(' && LA50_47<='/')||(LA50_47>='1' && LA50_47<='[')||LA50_47==']'||(LA50_47>='_' && LA50_47<='\uFFFF')) ) {s = 146;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA50_0 = input.LA(1);

                        s = -1;
                        if ( (LA50_0=='(') ) {s = 1;}

                        else if ( (LA50_0==')') ) {s = 2;}

                        else if ( (LA50_0==',') ) {s = 3;}

                        else if ( (LA50_0==':') ) {s = 4;}

                        else if ( (LA50_0=='{') ) {s = 5;}

                        else if ( (LA50_0=='}') ) {s = 6;}

                        else if ( (LA50_0=='[') ) {s = 7;}

                        else if ( (LA50_0==']') ) {s = 8;}

                        else if ( (LA50_0=='.') ) {s = 9;}

                        else if ( (LA50_0=='&') ) {s = 10;}

                        else if ( (LA50_0=='*') ) {s = 11;}

                        else if ( (LA50_0=='+') ) {s = 12;}

                        else if ( (LA50_0=='-') ) {s = 13;}

                        else if ( (LA50_0=='~') ) {s = 14;}

                        else if ( (LA50_0=='!') ) {s = 15;}

                        else if ( (LA50_0=='/') ) {s = 16;}

                        else if ( (LA50_0=='%') ) {s = 17;}

                        else if ( (LA50_0=='<') ) {s = 18;}

                        else if ( (LA50_0=='>') ) {s = 19;}

                        else if ( (LA50_0=='^') ) {s = 20;}

                        else if ( (LA50_0=='|') ) {s = 21;}

                        else if ( (LA50_0=='?') ) {s = 22;}

                        else if ( (LA50_0=='=') ) {s = 23;}

                        else if ( (LA50_0==';') ) {s = 24;}

                        else if ( (LA50_0=='a') ) {s = 25;}

                        else if ( (LA50_0=='b') ) {s = 26;}

                        else if ( (LA50_0=='c') ) {s = 27;}

                        else if ( (LA50_0=='d') ) {s = 28;}

                        else if ( (LA50_0=='e') ) {s = 29;}

                        else if ( (LA50_0=='f') ) {s = 30;}

                        else if ( (LA50_0=='g') ) {s = 31;}

                        else if ( (LA50_0=='i') ) {s = 32;}

                        else if ( (LA50_0=='l') ) {s = 33;}

                        else if ( (LA50_0=='r') ) {s = 34;}

                        else if ( (LA50_0=='s') ) {s = 35;}

                        else if ( (LA50_0=='t') ) {s = 36;}

                        else if ( (LA50_0=='u') ) {s = 37;}

                        else if ( (LA50_0=='v') ) {s = 38;}

                        else if ( (LA50_0=='w') ) {s = 39;}

                        else if ( (LA50_0=='_') ) {s = 40;}

                        else if ( (LA50_0=='h'||(LA50_0>='j' && LA50_0<='k')||(LA50_0>='m' && LA50_0<='q')||(LA50_0>='x' && LA50_0<='z')) ) {s = 41;}

                        else if ( (LA50_0=='U') ) {s = 42;}

                        else if ( (LA50_0=='0') ) {s = 43;}

                        else if ( ((LA50_0>='\t' && LA50_0<='\n')||(LA50_0>='\f' && LA50_0<='\r')||LA50_0==' ') ) {s = 44;}

                        else if ( (LA50_0=='L') ) {s = 45;}

                        else if ( ((LA50_0>='A' && LA50_0<='K')||(LA50_0>='M' && LA50_0<='T')||(LA50_0>='V' && LA50_0<='Z')) ) {s = 46;}

                        else if ( (LA50_0=='\"') ) {s = 47;}

                        else if ( ((LA50_0>='1' && LA50_0<='9')) ) {s = 48;}

                        else if ( (LA50_0=='\'') ) {s = 49;}

                        else if ( ((LA50_0>='\u0000' && LA50_0<='\b')||LA50_0=='\u000B'||(LA50_0>='\u000E' && LA50_0<='\u001F')||(LA50_0>='#' && LA50_0<='$')||LA50_0=='@'||LA50_0=='\\'||LA50_0=='`'||(LA50_0>='\u007F' && LA50_0<='\uFFFF')) ) {s = 50;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA50_205 = input.LA(1);

                        s = -1;
                        if ( (LA50_205=='\"') ) {s = 144;}

                        else if ( (LA50_205=='\\') ) {s = 142;}

                        else if ( (LA50_205=='0') ) {s = 145;}

                        else if ( (LA50_205=='\n'||LA50_205=='\''||LA50_205=='^') ) {s = 143;}

                        else if ( ((LA50_205>='\u0000' && LA50_205<='\t')||(LA50_205>='\u000B' && LA50_205<='!')||(LA50_205>='#' && LA50_205<='&')||(LA50_205>='(' && LA50_205<='/')||(LA50_205>='1' && LA50_205<='[')||LA50_205==']'||(LA50_205>='_' && LA50_205<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA50_49 = input.LA(1);

                        s = -1;
                        if ( (LA50_49=='\\') ) {s = 148;}

                        else if ( (LA50_49=='0') ) {s = 149;}

                        else if ( (LA50_49=='\n'||LA50_49=='^') ) {s = 150;}

                        else if ( (LA50_49=='\'') ) {s = 151;}

                        else if ( ((LA50_49>='\u0000' && LA50_49<='\t')||(LA50_49>='\u000B' && LA50_49<='&')||(LA50_49>='(' && LA50_49<='/')||(LA50_49>='1' && LA50_49<='[')||LA50_49==']'||(LA50_49>='_' && LA50_49<='\uFFFF')) ) {s = 146;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA50_206 = input.LA(1);

                        s = -1;
                        if ( (LA50_206=='\'') ) {s = 210;}

                        else if ( (LA50_206=='\\') ) {s = 148;}

                        else if ( (LA50_206=='0') ) {s = 149;}

                        else if ( (LA50_206=='\n'||LA50_206=='^') ) {s = 150;}

                        else if ( ((LA50_206>='\u0000' && LA50_206<='\t')||(LA50_206>='\u000B' && LA50_206<='&')||(LA50_206>='(' && LA50_206<='/')||(LA50_206>='1' && LA50_206<='[')||LA50_206==']'||(LA50_206>='_' && LA50_206<='\uFFFF')) ) {s = 146;}

                        else s = 125;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA50_207 = input.LA(1);

                        s = -1;
                        if ( (LA50_207=='\'') ) {s = 210;}

                        else if ( (LA50_207=='\\') ) {s = 148;}

                        else if ( (LA50_207=='0') ) {s = 149;}

                        else if ( (LA50_207=='\n'||LA50_207=='^') ) {s = 150;}

                        else if ( ((LA50_207>='\u0000' && LA50_207<='\t')||(LA50_207>='\u000B' && LA50_207<='&')||(LA50_207>='(' && LA50_207<='/')||(LA50_207>='1' && LA50_207<='[')||LA50_207==']'||(LA50_207>='_' && LA50_207<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA50_150 = input.LA(1);

                        s = -1;
                        if ( (LA50_150=='\'') ) {s = 210;}

                        else if ( (LA50_150=='\\') ) {s = 148;}

                        else if ( (LA50_150=='\n'||LA50_150=='^') ) {s = 150;}

                        else if ( (LA50_150=='0') ) {s = 149;}

                        else if ( ((LA50_150>='\u0000' && LA50_150<='\t')||(LA50_150>='\u000B' && LA50_150<='&')||(LA50_150>='(' && LA50_150<='/')||(LA50_150>='1' && LA50_150<='[')||LA50_150==']'||(LA50_150>='_' && LA50_150<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA50_202 = input.LA(1);

                        s = -1;
                        if ( ((LA50_202>='\t' && LA50_202<='\n')||(LA50_202>='\f' && LA50_202<='\r')||LA50_202==' ') ) {s = 253;}

                        else if ( (LA50_202=='u') ) {s = 254;}

                        else if ( (LA50_202=='U') ) {s = 255;}

                        else if ( (LA50_202=='L') ) {s = 256;}

                        else if ( (LA50_202=='\"') ) {s = 257;}

                        else if ( ((LA50_202>='\u0000' && LA50_202<='\b')||LA50_202=='\u000B'||(LA50_202>='\u000E' && LA50_202<='\u001F')||LA50_202=='!'||(LA50_202>='#' && LA50_202<='K')||(LA50_202>='M' && LA50_202<='T')||(LA50_202>='V' && LA50_202<='t')||(LA50_202>='v' && LA50_202<='\uFFFF')) ) {s = 146;}

                        else s = 124;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA50_253 = input.LA(1);

                        s = -1;
                        if ( (LA50_253=='u') ) {s = 254;}

                        else if ( (LA50_253=='U') ) {s = 255;}

                        else if ( (LA50_253=='L') ) {s = 256;}

                        else if ( (LA50_253=='\"') ) {s = 257;}

                        else if ( ((LA50_253>='\t' && LA50_253<='\n')||(LA50_253>='\f' && LA50_253<='\r')||LA50_253==' ') ) {s = 253;}

                        else if ( ((LA50_253>='\u0000' && LA50_253<='\b')||LA50_253=='\u000B'||(LA50_253>='\u000E' && LA50_253<='\u001F')||LA50_253=='!'||(LA50_253>='#' && LA50_253<='K')||(LA50_253>='M' && LA50_253<='T')||(LA50_253>='V' && LA50_253<='t')||(LA50_253>='v' && LA50_253<='\uFFFF')) ) {s = 146;}

                        else s = 124;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA50_209 = input.LA(1);

                        s = -1;
                        if ( (LA50_209=='\'') ) {s = 210;}

                        else if ( (LA50_209=='\\') ) {s = 148;}

                        else if ( (LA50_209=='0') ) {s = 149;}

                        else if ( (LA50_209=='\n'||LA50_209=='^') ) {s = 150;}

                        else if ( ((LA50_209>='\u0000' && LA50_209<='\t')||(LA50_209>='\u000B' && LA50_209<='&')||(LA50_209>='(' && LA50_209<='/')||(LA50_209>='1' && LA50_209<='[')||LA50_209==']'||(LA50_209>='_' && LA50_209<='\uFFFF')) ) {s = 146;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}