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
		TIPO=35, TIPO_INT=36, TIPO_REAL=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WS", "COMMENT", "';'", "'('", "')'", "LETRA", "'0'", "DIGITO", "'_'", 
		"'.'", "OP_CAST", "OP_UN", "OP_NEG", "'!'", "OP_MULTI", "'*'", "'/'", 
		"'%'", "'&&'", "OP_ADI", "'+'", "OP_SUB", "'||'", "OP_COMP", "'<'", "'>'", 
		"'<='", "'>='", "'=='", "'!='", "'='", "OP_IO", "'in'", "'out'", "TIPO", 
		"TIPO_INT", "TIPO_REAL"
	};
	public static final String[] ruleNames = {
		"WS", "COMMENT", "SEP", "PAR_AP", "PAR_CI", "LETRA", "CERO", "DIGITO", 
		"GUION_BAJO", "PUNTO", "OP_CAST", "OP_UN", "OP_NEG", "OP_LOGNOT", "OP_MULTI", 
		"OP_MULT", "OP_DIV", "OP_MOD", "OP_LOGAND", "OP_ADI", "OP_ADD", "OP_SUB", 
		"OP_LOGOR", "OP_COMP", "OP_LT", "OP_GT", "OP_LET", "OP_GET", "OP_E", "OP_NE", 
		"OP_ASIG", "OP_IO", "OP_IN", "OP_OUT", "TIPO", "TIPO_INT", "TIPO_REAL"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\'\u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\6\2O\n\2\r\2\16\2P\3\2\3\2\3\3"+
		"\3\3\7\3W\n\3\f\3\16\3Z\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\rt\n\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20~\n\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u008c\n\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u009b\n\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\5!\u00b1\n!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\5$\u00bc\n$\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\2\'\3\3\2\5\4\3\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67"+
		"\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1\3\2\f\5\2\13\f\17"+
		"\17\"\"\4\2\f\f\17\17\4\2C\\c|\4\2KKkk\4\2PPpp\4\2VVvv\4\2TTtt\4\2GGg"+
		"g\4\2CCcc\4\2NNnn\u00d4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3N\3\2\2\2\5T\3\2\2\2\7"+
		"]\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23"+
		"i\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35w\3\2\2\2"+
		"\37}\3\2\2\2!\177\3\2\2\2#\u0081\3\2\2\2%\u0083\3\2\2\2\'\u0085\3\2\2"+
		"\2)\u008b\3\2\2\2+\u008d\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u009a"+
		"\3\2\2\2\63\u009c\3\2\2\2\65\u009e\3\2\2\2\67\u00a0\3\2\2\29\u00a3\3\2"+
		"\2\2;\u00a6\3\2\2\2=\u00a9\3\2\2\2?\u00ac\3\2\2\2A\u00b0\3\2\2\2C\u00b2"+
		"\3\2\2\2E\u00b5\3\2\2\2G\u00bb\3\2\2\2I\u00bd\3\2\2\2K\u00c1\3\2\2\2M"+
		"O\t\2\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\b\2\2\2"+
		"S\4\3\2\2\2TX\7B\2\2UW\n\3\2\2VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2"+
		"Y[\3\2\2\2ZX\3\2\2\2[\\\b\3\3\2\\\6\3\2\2\2]^\7=\2\2^\b\3\2\2\2_`\7*\2"+
		"\2`\n\3\2\2\2ab\7+\2\2b\f\3\2\2\2cd\t\4\2\2d\16\3\2\2\2ef\7\62\2\2f\20"+
		"\3\2\2\2gh\4\63;\2h\22\3\2\2\2ij\7a\2\2j\24\3\2\2\2kl\7\60\2\2l\26\3\2"+
		"\2\2mn\5\t\5\2no\5G$\2op\5\13\6\2p\30\3\2\2\2qt\5\33\16\2rt\5\35\17\2"+
		"sq\3\2\2\2sr\3\2\2\2t\32\3\2\2\2uv\7/\2\2v\34\3\2\2\2wx\7#\2\2x\36\3\2"+
		"\2\2y~\5!\21\2z~\5#\22\2{~\5%\23\2|~\5\'\24\2}y\3\2\2\2}z\3\2\2\2}{\3"+
		"\2\2\2}|\3\2\2\2~ \3\2\2\2\177\u0080\7,\2\2\u0080\"\3\2\2\2\u0081\u0082"+
		"\7\61\2\2\u0082$\3\2\2\2\u0083\u0084\7\'\2\2\u0084&\3\2\2\2\u0085\u0086"+
		"\7(\2\2\u0086\u0087\7(\2\2\u0087(\3\2\2\2\u0088\u008c\5+\26\2\u0089\u008c"+
		"\5-\27\2\u008a\u008c\5/\30\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c*\3\2\2\2\u008d\u008e\7-\2\2\u008e,\3\2\2\2\u008f"+
		"\u0090\7/\2\2\u0090.\3\2\2\2\u0091\u0092\7~\2\2\u0092\u0093\7~\2\2\u0093"+
		"\60\3\2\2\2\u0094\u009b\5\63\32\2\u0095\u009b\5\65\33\2\u0096\u009b\5"+
		"\67\34\2\u0097\u009b\59\35\2\u0098\u009b\5;\36\2\u0099\u009b\5=\37\2\u009a"+
		"\u0094\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2"+
		"\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\62\3\2\2\2\u009c\u009d"+
		"\7>\2\2\u009d\64\3\2\2\2\u009e\u009f\7@\2\2\u009f\66\3\2\2\2\u00a0\u00a1"+
		"\7>\2\2\u00a1\u00a2\7?\2\2\u00a28\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\u00a5"+
		"\7?\2\2\u00a5:\3\2\2\2\u00a6\u00a7\7?\2\2\u00a7\u00a8\7?\2\2\u00a8<\3"+
		"\2\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7?\2\2\u00ab>\3\2\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad@\3\2\2\2\u00ae\u00b1\5C\"\2\u00af\u00b1\5E#\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1B\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4"+
		"\7p\2\2\u00b4D\3\2\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8F\3\2\2\2\u00b9\u00bc\5I%\2\u00ba\u00bc\5K&\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bcH\3\2\2\2\u00bd\u00be\t\5\2\2\u00be"+
		"\u00bf\t\6\2\2\u00bf\u00c0\t\7\2\2\u00c0J\3\2\2\2\u00c1\u00c2\t\b\2\2"+
		"\u00c2\u00c3\t\t\2\2\u00c3\u00c4\t\n\2\2\u00c4\u00c5\t\13\2\2\u00c5L\3"+
		"\2\2\2\13\2PXs}\u008b\u009a\u00b0\u00bb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}