// Generated from Grammar.g4 by ANTLR 4.1
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
		WS=1, COMMENT=2, SEP=3, PAR_AP=4, PAR_CI=5, LETRA=6, CERO=7, DIGITO=8, 
		GUION_BAJO=9, PUNTO=10, OP_CAST=11, OP_UN=12, OP_NEG=13, OP_LOGNOT=14, 
		OP_MULTI=15, OP_MULT=16, OP_DIV=17, OP_MOD=18, OP_LOGAND=19, OP_ADI=20, 
		OP_ADD=21, OP_SUB=22, OP_LOGOR=23, OP_COMP=24, OP_LT=25, OP_GT=26, OP_LET=27, 
		OP_GET=28, OP_E=29, OP_NE=30, OP_ASIG=31, OP_IO=32, OP_IN=33, OP_OUT=34, 
		TIPO=35, TIPO_INT=36, TIPO_REAL=37, IDENT=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WS", "COMMENT", "';'", "'('", "')'", "LETRA", "'0'", "DIGITO", "'_'", 
		"'.'", "OP_CAST", "OP_UN", "OP_NEG", "'!'", "OP_MULTI", "'*'", "'/'", 
		"'%'", "'&&'", "OP_ADI", "'+'", "OP_SUB", "'||'", "OP_COMP", "'<'", "'>'", 
		"'<='", "'>='", "'=='", "'!='", "'='", "OP_IO", "'in'", "'out'", "TIPO", 
		"TIPO_INT", "TIPO_REAL", "IDENT"
	};
	public static final String[] ruleNames = {
		"WS", "COMMENT", "SEP", "PAR_AP", "PAR_CI", "LETRA", "CERO", "DIGITO", 
		"GUION_BAJO", "PUNTO", "OP_CAST", "OP_UN", "OP_NEG", "OP_LOGNOT", "OP_MULTI", 
		"OP_MULT", "OP_DIV", "OP_MOD", "OP_LOGAND", "OP_ADI", "OP_ADD", "OP_SUB", 
		"OP_LOGOR", "OP_COMP", "OP_LT", "OP_GT", "OP_LET", "OP_GET", "OP_E", "OP_NE", 
		"OP_ASIG", "OP_IO", "OP_IN", "OP_OUT", "TIPO", "TIPO_INT", "TIPO_REAL", 
		"IDENT"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2(\u00d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\6\2Q\n\2\r\2\16\2R\3\2"+
		"\3\2\3\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\r"+
		"v\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0080\n\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u008e\n\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u009d"+
		"\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3!\3!\5!\u00b3\n!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$"+
		"\5$\u00be\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\5\'\u00cb\n\'\3\'\3\'"+
		"\3\'\7\'\u00d0\n\'\f\'\16\'\u00d3\13\'\2(\3\3\2\5\4\3\7\5\1\t\6\1\13\7"+
		"\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37"+
		"\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1"+
		"\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1\3\2"+
		"\f\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2C\\c|\4\2KKkk\4\2PPpp\4\2VVvv\4"+
		"\2TTtt\4\2GGgg\4\2CCcc\4\2NNnn\u00e6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\3P\3\2\2\2\5V\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17"+
		"g\3\2\2\2\21i\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31u\3\2\2\2"+
		"\33w\3\2\2\2\35y\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0083\3\2\2\2"+
		"%\u0085\3\2\2\2\'\u0087\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0091\3"+
		"\2\2\2/\u0093\3\2\2\2\61\u009c\3\2\2\2\63\u009e\3\2\2\2\65\u00a0\3\2\2"+
		"\2\67\u00a2\3\2\2\29\u00a5\3\2\2\2;\u00a8\3\2\2\2=\u00ab\3\2\2\2?\u00ae"+
		"\3\2\2\2A\u00b2\3\2\2\2C\u00b4\3\2\2\2E\u00b7\3\2\2\2G\u00bd\3\2\2\2I"+
		"\u00bf\3\2\2\2K\u00c3\3\2\2\2M\u00ca\3\2\2\2OQ\t\2\2\2PO\3\2\2\2QR\3\2"+
		"\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\b\2\2\2U\4\3\2\2\2VZ\7B\2\2WY\n\3"+
		"\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\b"+
		"\3\3\2^\6\3\2\2\2_`\7=\2\2`\b\3\2\2\2ab\7*\2\2b\n\3\2\2\2cd\7+\2\2d\f"+
		"\3\2\2\2ef\t\4\2\2f\16\3\2\2\2gh\7\62\2\2h\20\3\2\2\2ij\4\63;\2j\22\3"+
		"\2\2\2kl\7a\2\2l\24\3\2\2\2mn\7\60\2\2n\26\3\2\2\2op\5\t\5\2pq\5G$\2q"+
		"r\5\13\6\2r\30\3\2\2\2sv\5\33\16\2tv\5\35\17\2us\3\2\2\2ut\3\2\2\2v\32"+
		"\3\2\2\2wx\7/\2\2x\34\3\2\2\2yz\7#\2\2z\36\3\2\2\2{\u0080\5!\21\2|\u0080"+
		"\5#\22\2}\u0080\5%\23\2~\u0080\5\'\24\2\177{\3\2\2\2\177|\3\2\2\2\177"+
		"}\3\2\2\2\177~\3\2\2\2\u0080 \3\2\2\2\u0081\u0082\7,\2\2\u0082\"\3\2\2"+
		"\2\u0083\u0084\7\61\2\2\u0084$\3\2\2\2\u0085\u0086\7\'\2\2\u0086&\3\2"+
		"\2\2\u0087\u0088\7(\2\2\u0088\u0089\7(\2\2\u0089(\3\2\2\2\u008a\u008e"+
		"\5+\26\2\u008b\u008e\5-\27\2\u008c\u008e\5/\30\2\u008d\u008a\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e*\3\2\2\2\u008f\u0090\7-\2\2\u0090"+
		",\3\2\2\2\u0091\u0092\7/\2\2\u0092.\3\2\2\2\u0093\u0094\7~\2\2\u0094\u0095"+
		"\7~\2\2\u0095\60\3\2\2\2\u0096\u009d\5\63\32\2\u0097\u009d\5\65\33\2\u0098"+
		"\u009d\5\67\34\2\u0099\u009d\59\35\2\u009a\u009d\5;\36\2\u009b\u009d\5"+
		"=\37\2\u009c\u0096\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009c"+
		"\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\62\3\2\2"+
		"\2\u009e\u009f\7>\2\2\u009f\64\3\2\2\2\u00a0\u00a1\7@\2\2\u00a1\66\3\2"+
		"\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7?\2\2\u00a48\3\2\2\2\u00a5\u00a6"+
		"\7@\2\2\u00a6\u00a7\7?\2\2\u00a7:\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9\u00aa"+
		"\7?\2\2\u00aa<\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\7?\2\2\u00ad>\3"+
		"\2\2\2\u00ae\u00af\7?\2\2\u00af@\3\2\2\2\u00b0\u00b3\5C\"\2\u00b1\u00b3"+
		"\5E#\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3B\3\2\2\2\u00b4\u00b5"+
		"\7k\2\2\u00b5\u00b6\7p\2\2\u00b6D\3\2\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9"+
		"\7w\2\2\u00b9\u00ba\7v\2\2\u00baF\3\2\2\2\u00bb\u00be\5I%\2\u00bc\u00be"+
		"\5K&\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00beH\3\2\2\2\u00bf\u00c0"+
		"\t\5\2\2\u00c0\u00c1\t\6\2\2\u00c1\u00c2\t\7\2\2\u00c2J\3\2\2\2\u00c3"+
		"\u00c4\t\b\2\2\u00c4\u00c5\t\t\2\2\u00c5\u00c6\t\n\2\2\u00c6\u00c7\t\13"+
		"\2\2\u00c7L\3\2\2\2\u00c8\u00cb\5\r\7\2\u00c9\u00cb\5\23\n\2\u00ca\u00c8"+
		"\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00d1\3\2\2\2\u00cc\u00d0\5\r\7\2\u00cd"+
		"\u00d0\5\21\t\2\u00ce\u00d0\5\23\n\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2N\3\2\2\2\u00d3\u00d1\3\2\2\2\16\2RZu\177\u008d\u009c"+
		"\u00b2\u00bd\u00ca\u00cf\u00d1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}