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
		WS=1, COMMENT=2, SEP=3, PAR_AP=4, PAR_CI=5, OP_CAST=6, OP_UN=7, OP_NEG=8, 
		OP_LOGNOT=9, OP_MULTI=10, OP_MULT=11, OP_DIV=12, OP_MOD=13, OP_LOGAND=14, 
		OP_ADI=15, OP_ADD=16, OP_SUB=17, OP_LOGOR=18, OP_COMP=19, OP_LT=20, OP_GT=21, 
		OP_LET=22, OP_GET=23, OP_E=24, OP_NE=25, OP_ASIG=26, OP_IO=27, OP_IN=28, 
		OP_OUT=29, TIPO=30, TIPO_INT=31, TIPO_REAL=32, IDENT=33, NUM=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WS", "COMMENT", "';'", "'('", "')'", "OP_CAST", "OP_UN", "OP_NEG", "'!'", 
		"OP_MULTI", "'*'", "'/'", "'%'", "'&&'", "OP_ADI", "'+'", "OP_SUB", "'||'", 
		"OP_COMP", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'='", "OP_IO", 
		"'in'", "'out'", "TIPO", "TIPO_INT", "TIPO_REAL", "IDENT", "NUM"
	};
	public static final String[] ruleNames = {
		"WS", "COMMENT", "SEP", "PAR_AP", "PAR_CI", "LETRA", "CERO", "DIGITO", 
		"GUION_BAJO", "PUNTO", "OP_CAST", "OP_UN", "OP_NEG", "OP_LOGNOT", "OP_MULTI", 
		"OP_MULT", "OP_DIV", "OP_MOD", "OP_LOGAND", "OP_ADI", "OP_ADD", "OP_SUB", 
		"OP_LOGOR", "OP_COMP", "OP_LT", "OP_GT", "OP_LET", "OP_GET", "OP_E", "OP_NE", 
		"OP_ASIG", "OP_IO", "OP_IN", "OP_OUT", "TIPO", "TIPO_INT", "TIPO_REAL", 
		"IDENT", "NUM"
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2$\u00e7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\6\2S\n\2\r\2\16"+
		"\2T\3\2\3\2\3\3\3\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\5\rx\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0082\n\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u0090"+
		"\n\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u009f\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\5!\u00b5\n!\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3$\3$\5$\u00c0\n$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\5\'\u00cd\n"+
		"\'\3\'\3\'\3\'\7\'\u00d2\n\'\f\'\16\'\u00d5\13\'\3(\3(\3(\7(\u00da\n("+
		"\f(\16(\u00dd\13(\3(\3(\3(\6(\u00e2\n(\r(\16(\u00e3\5(\u00e6\n(\2)\3\3"+
		"\2\5\4\3\7\5\1\t\6\1\13\7\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\b\1\31"+
		"\t\1\33\n\1\35\13\1\37\f\1!\r\1#\16\1%\17\1\'\20\1)\21\1+\22\1-\23\1/"+
		"\24\1\61\25\1\63\26\1\65\27\1\67\30\19\31\1;\32\1=\33\1?\34\1A\35\1C\36"+
		"\1E\37\1G \1I!\1K\"\1M#\1O$\1\3\2\f\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4"+
		"\2C\\c|\4\2KKkk\4\2PPpp\4\2VVvv\4\2TTtt\4\2GGgg\4\2CCcc\4\2NNnn\u00f9"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3"+
		"\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2"+
		"\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G"+
		"\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3R\3\2\2\2\5X\3\2"+
		"\2\2\7a\3\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17i\3\2\2\2\21k\3\2"+
		"\2\2\23m\3\2\2\2\25o\3\2\2\2\27q\3\2\2\2\31w\3\2\2\2\33y\3\2\2\2\35{\3"+
		"\2\2\2\37\u0081\3\2\2\2!\u0083\3\2\2\2#\u0085\3\2\2\2%\u0087\3\2\2\2\'"+
		"\u0089\3\2\2\2)\u008f\3\2\2\2+\u0091\3\2\2\2-\u0093\3\2\2\2/\u0095\3\2"+
		"\2\2\61\u009e\3\2\2\2\63\u00a0\3\2\2\2\65\u00a2\3\2\2\2\67\u00a4\3\2\2"+
		"\29\u00a7\3\2\2\2;\u00aa\3\2\2\2=\u00ad\3\2\2\2?\u00b0\3\2\2\2A\u00b4"+
		"\3\2\2\2C\u00b6\3\2\2\2E\u00b9\3\2\2\2G\u00bf\3\2\2\2I\u00c1\3\2\2\2K"+
		"\u00c5\3\2\2\2M\u00cc\3\2\2\2O\u00d6\3\2\2\2QS\t\2\2\2RQ\3\2\2\2ST\3\2"+
		"\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\b\2\2\2W\4\3\2\2\2X\\\7B\2\2Y[\n"+
		"\3\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2"+
		"_`\b\3\3\2`\6\3\2\2\2ab\7=\2\2b\b\3\2\2\2cd\7*\2\2d\n\3\2\2\2ef\7+\2\2"+
		"f\f\3\2\2\2gh\t\4\2\2h\16\3\2\2\2ij\7\62\2\2j\20\3\2\2\2kl\4\63;\2l\22"+
		"\3\2\2\2mn\7a\2\2n\24\3\2\2\2op\7\60\2\2p\26\3\2\2\2qr\5\t\5\2rs\5G$\2"+
		"st\5\13\6\2t\30\3\2\2\2ux\5\33\16\2vx\5\35\17\2wu\3\2\2\2wv\3\2\2\2x\32"+
		"\3\2\2\2yz\7/\2\2z\34\3\2\2\2{|\7#\2\2|\36\3\2\2\2}\u0082\5!\21\2~\u0082"+
		"\5#\22\2\177\u0082\5%\23\2\u0080\u0082\5\'\24\2\u0081}\3\2\2\2\u0081~"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082 \3\2\2\2\u0083\u0084"+
		"\7,\2\2\u0084\"\3\2\2\2\u0085\u0086\7\61\2\2\u0086$\3\2\2\2\u0087\u0088"+
		"\7\'\2\2\u0088&\3\2\2\2\u0089\u008a\7(\2\2\u008a\u008b\7(\2\2\u008b(\3"+
		"\2\2\2\u008c\u0090\5+\26\2\u008d\u0090\5-\27\2\u008e\u0090\5/\30\2\u008f"+
		"\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090*\3\2\2\2"+
		"\u0091\u0092\7-\2\2\u0092,\3\2\2\2\u0093\u0094\7/\2\2\u0094.\3\2\2\2\u0095"+
		"\u0096\7~\2\2\u0096\u0097\7~\2\2\u0097\60\3\2\2\2\u0098\u009f\5\63\32"+
		"\2\u0099\u009f\5\65\33\2\u009a\u009f\5\67\34\2\u009b\u009f\59\35\2\u009c"+
		"\u009f\5;\36\2\u009d\u009f\5=\37\2\u009e\u0098\3\2\2\2\u009e\u0099\3\2"+
		"\2\2\u009e\u009a\3\2\2\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\62\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\64\3\2\2\2\u00a2"+
		"\u00a3\7@\2\2\u00a3\66\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5\u00a6\7?\2\2\u00a6"+
		"8\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8\u00a9\7?\2\2\u00a9:\3\2\2\2\u00aa\u00ab"+
		"\7?\2\2\u00ab\u00ac\7?\2\2\u00ac<\3\2\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af"+
		"\7?\2\2\u00af>\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1@\3\2\2\2\u00b2\u00b5\5"+
		"C\"\2\u00b3\u00b5\5E#\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"B\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7p\2\2\u00b8D\3\2\2\2\u00b9\u00ba"+
		"\7q\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7v\2\2\u00bcF\3\2\2\2\u00bd\u00c0"+
		"\5I%\2\u00be\u00c0\5K&\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"H\3\2\2\2\u00c1\u00c2\t\5\2\2\u00c2\u00c3\t\6\2\2\u00c3\u00c4\t\7\2\2"+
		"\u00c4J\3\2\2\2\u00c5\u00c6\t\b\2\2\u00c6\u00c7\t\t\2\2\u00c7\u00c8\t"+
		"\n\2\2\u00c8\u00c9\t\13\2\2\u00c9L\3\2\2\2\u00ca\u00cd\5\r\7\2\u00cb\u00cd"+
		"\5\23\n\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d3\3\2\2\2"+
		"\u00ce\u00d2\5\r\7\2\u00cf\u00d2\5\21\t\2\u00d0\u00d2\5\23\n\2\u00d1\u00ce"+
		"\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4N\3\2\2\2\u00d5\u00d3\3\2\2\2"+
		"\u00d6\u00db\5\21\t\2\u00d7\u00da\5\21\t\2\u00d8\u00da\5\17\b\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e5\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e1\5\25\13\2\u00df\u00e2\5\21\t\2\u00e0\u00e2\5\17\b\2\u00e1\u00df"+
		"\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00de\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6P\3\2\2\2\23\2T\\w\u0081\u008f\u009e\u00b4\u00bf\u00cc\u00d1"+
		"\u00d3\u00d9\u00db\u00e1\u00e3\u00e5";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}