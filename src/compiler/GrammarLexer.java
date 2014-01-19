package compiler;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, SEP=3, PAR_AP=4, PAR_CI=5, OP_CAST=6, OP_LOGNOT=7, OP_MULTI=8, 
		OP_MULT=9, OP_DIV=10, OP_MOD=11, OP_LOGAND=12, OP_ADD=13, OP_SUB=14, OP_LOGOR=15, 
		OP_COMP=16, OP_LT=17, OP_GT=18, OP_LET=19, OP_GET=20, OP_E=21, OP_NE=22, 
		OP_ASIG=23, OP_IN=24, OP_OUT=25, TIPO=26, TIPO_INT=27, TIPO_REAL=28, IDENT=29, 
		NUM_ENTERO=30, NUM_REAL=31;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WS", "COMMENT", "';'", "'('", "')'", "OP_CAST", "'!'", "OP_MULTI", "'*'", 
		"'/'", "'%'", "'&&'", "'+'", "'-'", "'||'", "OP_COMP", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'='", "'in'", "'out'", "TIPO", "TIPO_INT", "TIPO_REAL", 
		"IDENT", "NUM_ENTERO", "NUM_REAL"
	};
	public static final String[] ruleNames = {
		"WS", "COMMENT", "SEP", "PAR_AP", "PAR_CI", "LETRA", "CERO", "DIGITO", 
		"GUION_BAJO", "PUNTO", "OP_CAST", "OP_LOGNOT", "OP_MULTI", "OP_MULT", 
		"OP_DIV", "OP_MOD", "OP_LOGAND", "OP_ADD", "OP_SUB", "OP_LOGOR", "OP_COMP", 
		"OP_LT", "OP_GT", "OP_LET", "OP_GET", "OP_E", "OP_NE", "OP_ASIG", "OP_IN", 
		"OP_OUT", "TIPO", "TIPO_INT", "TIPO_REAL", "IDENT", "NUM_ENTERO", "NUM_REAL"
	};


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: WS_action((RuleContext)_localctx, actionIndex); break;

		case 1: COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2!\u00da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2M\n\2\r\2\16\2N\3\2\3\2\3\3\3\3\7"+
		"\3U\n\3\f\3\16\3X\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\5\16v\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u008e\n\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \5 \u00ab\n \3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\5#\u00b8\n#\3#\3#\3#\7#\u00bd\n#"+
		"\f#\16#\u00c0\13#\3$\3$\3$\7$\u00c5\n$\f$\16$\u00c8\13$\3%\3%\3%\7%\u00cd"+
		"\n%\f%\16%\u00d0\13%\3%\3%\3%\6%\u00d5\n%\r%\16%\u00d6\5%\u00d9\n%\2&"+
		"\3\3\2\5\4\3\7\5\1\t\6\1\13\7\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\b"+
		"\1\31\t\1\33\n\1\35\13\1\37\f\1!\r\1#\16\1%\17\1\'\20\1)\21\1+\22\1-\23"+
		"\1/\24\1\61\25\1\63\26\1\65\27\1\67\30\19\31\1;\32\1=\33\1?\34\1A\35\1"+
		"C\36\1E\37\1G \1I!\1\3\2\f\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2C\\c|\4"+
		"\2KKkk\4\2PPpp\4\2VVvv\4\2TTtt\4\2GGgg\4\2CCcc\4\2NNnn\u00ea\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\3L\3\2\2\2\5R\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3"+
		"\2\2\2\17c\3\2\2\2\21e\3\2\2\2\23g\3\2\2\2\25i\3\2\2\2\27k\3\2\2\2\31"+
		"o\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2\37y\3\2\2\2!{\3\2\2\2#}\3\2\2\2%\u0080"+
		"\3\2\2\2\'\u0082\3\2\2\2)\u0084\3\2\2\2+\u008d\3\2\2\2-\u008f\3\2\2\2"+
		"/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u0096\3\2\2\2\65\u0099\3\2\2\2\67"+
		"\u009c\3\2\2\29\u009f\3\2\2\2;\u00a1\3\2\2\2=\u00a4\3\2\2\2?\u00aa\3\2"+
		"\2\2A\u00ac\3\2\2\2C\u00b0\3\2\2\2E\u00b7\3\2\2\2G\u00c1\3\2\2\2I\u00c9"+
		"\3\2\2\2KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2P"+
		"Q\b\2\2\2Q\4\3\2\2\2RV\7B\2\2SU\n\3\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\b\3\3\2Z\6\3\2\2\2[\\\7=\2\2\\\b\3\2"+
		"\2\2]^\7*\2\2^\n\3\2\2\2_`\7+\2\2`\f\3\2\2\2ab\t\4\2\2b\16\3\2\2\2cd\7"+
		"\62\2\2d\20\3\2\2\2ef\4\63;\2f\22\3\2\2\2gh\7a\2\2h\24\3\2\2\2ij\7\60"+
		"\2\2j\26\3\2\2\2kl\5\t\5\2lm\5? \2mn\5\13\6\2n\30\3\2\2\2op\7#\2\2p\32"+
		"\3\2\2\2qv\5\35\17\2rv\5\37\20\2sv\5!\21\2tv\5#\22\2uq\3\2\2\2ur\3\2\2"+
		"\2us\3\2\2\2ut\3\2\2\2v\34\3\2\2\2wx\7,\2\2x\36\3\2\2\2yz\7\61\2\2z \3"+
		"\2\2\2{|\7\'\2\2|\"\3\2\2\2}~\7(\2\2~\177\7(\2\2\177$\3\2\2\2\u0080\u0081"+
		"\7-\2\2\u0081&\3\2\2\2\u0082\u0083\7/\2\2\u0083(\3\2\2\2\u0084\u0085\7"+
		"~\2\2\u0085\u0086\7~\2\2\u0086*\3\2\2\2\u0087\u008e\5-\27\2\u0088\u008e"+
		"\5/\30\2\u0089\u008e\5\61\31\2\u008a\u008e\5\63\32\2\u008b\u008e\5\65"+
		"\33\2\u008c\u008e\5\67\34\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d"+
		"\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2"+
		"\2\2\u008e,\3\2\2\2\u008f\u0090\7>\2\2\u0090.\3\2\2\2\u0091\u0092\7@\2"+
		"\2\u0092\60\3\2\2\2\u0093\u0094\7>\2\2\u0094\u0095\7?\2\2\u0095\62\3\2"+
		"\2\2\u0096\u0097\7@\2\2\u0097\u0098\7?\2\2\u0098\64\3\2\2\2\u0099\u009a"+
		"\7?\2\2\u009a\u009b\7?\2\2\u009b\66\3\2\2\2\u009c\u009d\7#\2\2\u009d\u009e"+
		"\7?\2\2\u009e8\3\2\2\2\u009f\u00a0\7?\2\2\u00a0:\3\2\2\2\u00a1\u00a2\7"+
		"k\2\2\u00a2\u00a3\7p\2\2\u00a3<\3\2\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6"+
		"\7w\2\2\u00a6\u00a7\7v\2\2\u00a7>\3\2\2\2\u00a8\u00ab\5A!\2\u00a9\u00ab"+
		"\5C\"\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab@\3\2\2\2\u00ac\u00ad"+
		"\t\5\2\2\u00ad\u00ae\t\6\2\2\u00ae\u00af\t\7\2\2\u00afB\3\2\2\2\u00b0"+
		"\u00b1\t\b\2\2\u00b1\u00b2\t\t\2\2\u00b2\u00b3\t\n\2\2\u00b3\u00b4\t\13"+
		"\2\2\u00b4D\3\2\2\2\u00b5\u00b8\5\r\7\2\u00b6\u00b8\5\23\n\2\u00b7\u00b5"+
		"\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00be\3\2\2\2\u00b9\u00bd\5\r\7\2\u00ba"+
		"\u00bd\5\21\t\2\u00bb\u00bd\5\23\n\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3"+
		"\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bfF\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c6\5\21\t\2"+
		"\u00c2\u00c5\5\21\t\2\u00c3\u00c5\5\17\b\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"H\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ce\5\21\t\2\u00ca\u00cd\5\21\t"+
		"\2\u00cb\u00cd\5\17\b\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d8\3\2"+
		"\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\5\25\13\2\u00d2\u00d5\5\21\t\2\u00d3"+
		"\u00d5\5\17\b\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d1\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9J\3\2\2\2\22\2NVu\u008d\u00aa"+
		"\u00b7\u00bc\u00be\u00c4\u00c6\u00cc\u00ce\u00d4\u00d6\u00d8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
