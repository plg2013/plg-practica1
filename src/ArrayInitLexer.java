// Generated from ArrayInit.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArrayInitLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "','", "'}'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0"
	};


	public ArrayInitLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArrayInit.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\5\17\b\1\4\2\t\2\4\3\t\3\4\4\t\4\3\2\3\2\3\3\3\3\3\4\3\4\2\5\3\3"+
		"\1\5\4\1\7\5\1\3\2\2\16\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\3\t\3\2\2"+
		"\2\5\13\3\2\2\2\7\r\3\2\2\2\t\n\7}\2\2\n\4\3\2\2\2\13\f\7.\2\2\f\6\3\2"+
		"\2\2\r\16\7\177\2\2\16\b\3\2\2\2\3\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}