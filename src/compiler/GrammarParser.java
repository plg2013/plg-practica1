package compiler;

// Generated from Grammar.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, SEP=3, PAR_AP=4, PAR_CI=5, OP_CAST=6, OP_LOGNOT=7, OP_MULTI=8, 
		OP_MULT=9, OP_DIV=10, OP_MOD=11, OP_LOGAND=12, OP_ADD=13, OP_SUB=14, OP_LOGOR=15, 
		OP_COMP=16, OP_LT=17, OP_GT=18, OP_LET=19, OP_GET=20, OP_E=21, OP_NE=22, 
		OP_ASIG=23, OP_IN=24, OP_OUT=25, TIPO=26, TIPO_INT=27, TIPO_REAL=28, IDENT=29, 
		NUM=30;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "COMMENT", "';'", "'('", "')'", "OP_CAST", "'!'", "OP_MULTI", 
		"'*'", "'/'", "'%'", "'&&'", "'+'", "'-'", "'||'", "OP_COMP", "'<'", "'>'", 
		"'<='", "'>='", "'=='", "'!='", "'='", "'in'", "'out'", "TIPO", "TIPO_INT", 
		"TIPO_REAL", "IDENT", "NUM"
	};
	public static final int
		RULE_tipo = 0, RULE_id = 1, RULE_num = 2, RULE_programa = 3, RULE_decs = 4, 
		RULE_dec = 5, RULE_accs = 6, RULE_acc = 7, RULE_ioExpr = 8, RULE_asigExpr = 9, 
		RULE_compExpr = 10, RULE_adiExpr = 11, RULE_multExpr = 12, RULE_unaryExpr = 13, 
		RULE_castExpr = 14, RULE_term = 15;
	public static final String[] ruleNames = {
		"tipo", "id", "num", "programa", "decs", "dec", "accs", "acc", "ioExpr", 
		"asigExpr", "compExpr", "adiExpr", "multExpr", "unaryExpr", "castExpr", 
		"term"
	};

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GrammarParser.TIPO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_tipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); match(TIPO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(GrammarParser.IDENT, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(GrammarParser.NUM, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(NUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public AccsContext accs() {
			return getRuleContext(AccsContext.class,0);
		}
		public DecsContext decs() {
			return getRuleContext(DecsContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); decs();
			setState(39); accs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecsContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public DecsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDecs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDecs(this);
		}
	}

	public final DecsContext decs() throws RecognitionException {
		DecsContext _localctx = new DecsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(41); dec();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEP() { return getToken(GrammarParser.SEP, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); tipo();
			setState(48); id();
			setState(49); match(SEP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccsContext extends ParserRuleContext {
		public AccContext acc(int i) {
			return getRuleContext(AccContext.class,i);
		}
		public List<AccContext> acc() {
			return getRuleContexts(AccContext.class);
		}
		public AccsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAccs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAccs(this);
		}
	}

	public final AccsContext accs() throws RecognitionException {
		AccsContext _localctx = new AccsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_accs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51); acc();
				}
				}
				setState(54); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_AP) | (1L << OP_CAST) | (1L << OP_LOGNOT) | (1L << OP_SUB) | (1L << OP_IN) | (1L << OP_OUT) | (1L << IDENT) | (1L << NUM))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccContext extends ParserRuleContext {
		public IoExprContext ioExpr() {
			return getRuleContext(IoExprContext.class,0);
		}
		public TerminalNode SEP() { return getToken(GrammarParser.SEP, 0); }
		public AccContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAcc(this);
		}
	}

	public final AccContext acc() throws RecognitionException {
		AccContext _localctx = new AccContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_acc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); ioExpr();
			setState(57); match(SEP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IoExprContext extends ParserRuleContext {
		public TerminalNode OP_OUT() { return getToken(GrammarParser.OP_OUT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OP_IN() { return getToken(GrammarParser.OP_IN, 0); }
		public AsigExprContext asigExpr() {
			return getRuleContext(AsigExprContext.class,0);
		}
		public IoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIoExpr(this);
		}
	}

	public final IoExprContext ioExpr() throws RecognitionException {
		IoExprContext _localctx = new IoExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ioExpr);
		try {
			setState(67);
			switch (_input.LA(1)) {
			case OP_IN:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); match(OP_IN);
				setState(60); id();
				}
				break;
			case OP_OUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); match(OP_OUT);
				setState(64);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(62); id();
					}
					break;

				case 2:
					{
					setState(63); asigExpr();
					}
					break;
				}
				}
				break;
			case PAR_AP:
			case OP_CAST:
			case OP_LOGNOT:
			case OP_SUB:
			case IDENT:
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); asigExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsigExprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public TerminalNode OP_ASIG() { return getToken(GrammarParser.OP_ASIG, 0); }
		public AsigExprContext asigExpr() {
			return getRuleContext(AsigExprContext.class,0);
		}
		public AsigExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asigExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAsigExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAsigExpr(this);
		}
	}

	public final AsigExprContext asigExpr() throws RecognitionException {
		AsigExprContext _localctx = new AsigExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asigExpr);
		try {
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); id();
				setState(70); match(OP_ASIG);
				setState(71); asigExpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); compExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompExprContext extends ParserRuleContext {
		public TerminalNode OP_COMP() { return getToken(GrammarParser.OP_COMP, 0); }
		public AdiExprContext adiExpr(int i) {
			return getRuleContext(AdiExprContext.class,i);
		}
		public List<AdiExprContext> adiExpr() {
			return getRuleContexts(AdiExprContext.class);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompExpr(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compExpr);
		try {
			setState(81);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); adiExpr(0);
				setState(77); match(OP_COMP);
				setState(78); adiExpr(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); adiExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdiExprContext extends ParserRuleContext {
		public int _p;
		public TerminalNode OP_ADD() { return getToken(GrammarParser.OP_ADD, 0); }
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public TerminalNode OP_LOGOR() { return getToken(GrammarParser.OP_LOGOR, 0); }
		public AdiExprContext adiExpr() {
			return getRuleContext(AdiExprContext.class,0);
		}
		public TerminalNode OP_SUB() { return getToken(GrammarParser.OP_SUB, 0); }
		public AdiExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AdiExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_adiExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAdiExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAdiExpr(this);
		}
	}

	public final AdiExprContext adiExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdiExprContext _localctx = new AdiExprContext(_ctx, _parentState, _p);
		AdiExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_adiExpr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(84); multExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AdiExprContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_adiExpr);
					setState(86);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(87);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_ADD) | (1L << OP_SUB) | (1L << OP_LOGOR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(88); multExpr(0);
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultExprContext extends ParserRuleContext {
		public int _p;
		public TerminalNode OP_MULTI() { return getToken(GrammarParser.OP_MULTI, 0); }
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public MultExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultExpr(this);
		}
	}

	public final MultExprContext multExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultExprContext _localctx = new MultExprContext(_ctx, _parentState, _p);
		MultExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_multExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(95); unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultExprContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_multExpr);
					setState(97);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(98); match(OP_MULTI);
					setState(99); unaryExpr();
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public TerminalNode OP_LOGNOT() { return getToken(GrammarParser.OP_LOGNOT, 0); }
		public CastExprContext castExpr() {
			return getRuleContext(CastExprContext.class,0);
		}
		public TerminalNode OP_SUB() { return getToken(GrammarParser.OP_SUB, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unaryExpr);
		int _la;
		try {
			setState(108);
			switch (_input.LA(1)) {
			case OP_LOGNOT:
			case OP_SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==OP_LOGNOT || _la==OP_SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(106); castExpr();
				}
				break;
			case PAR_AP:
			case OP_CAST:
			case IDENT:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); castExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode OP_CAST() { return getToken(GrammarParser.OP_CAST, 0); }
		public CastExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCastExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCastExpr(this);
		}
	}

	public final CastExprContext castExpr() throws RecognitionException {
		CastExprContext _localctx = new CastExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_castExpr);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case OP_CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); match(OP_CAST);
				setState(111); term();
				}
				break;
			case PAR_AP:
			case IDENT:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); term();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public IoExprContext ioExpr() {
			return getRuleContext(IoExprContext.class,0);
		}
		public TerminalNode PAR_CI() { return getToken(GrammarParser.PAR_CI, 0); }
		public TerminalNode PAR_AP() { return getToken(GrammarParser.PAR_AP, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			setState(121);
			switch (_input.LA(1)) {
			case PAR_AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); match(PAR_AP);
				setState(116); ioExpr();
				setState(117); match(PAR_CI);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); id();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 3);
				{
				setState(120); num();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return adiExpr_sempred((AdiExprContext)_localctx, predIndex);

		case 12: return multExpr_sempred((MultExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean multExpr_sempred(MultExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean adiExpr_sempred(AdiExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3 ~\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\7\6-\n\6\f\6\16\6\60\13\6\3\7\3\7\3\7\3\7\3\b\6"+
		"\b\67\n\b\r\b\16\b8\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\nC\n\n\3\n\5\nF"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\5\13M\n\13\3\f\3\f\3\f\3\f\3\f\5\fT\n\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\\\n\r\f\r\16\r_\13\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16g\n\16\f\16\16\16j\13\16\3\17\3\17\3\17\5\17o\n\17\3\20"+
		"\3\20\3\20\5\20t\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21|\n\21\3\21\2"+
		"\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\17\21\4\2\t\t\20\20"+
		"z\2\"\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n.\3\2\2\2\f\61\3\2\2\2"+
		"\16\66\3\2\2\2\20:\3\2\2\2\22E\3\2\2\2\24L\3\2\2\2\26S\3\2\2\2\30U\3\2"+
		"\2\2\32`\3\2\2\2\34n\3\2\2\2\36s\3\2\2\2 {\3\2\2\2\"#\7\34\2\2#\3\3\2"+
		"\2\2$%\7\37\2\2%\5\3\2\2\2&\'\7 \2\2\'\7\3\2\2\2()\5\n\6\2)*\5\16\b\2"+
		"*\t\3\2\2\2+-\5\f\7\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\13\3"+
		"\2\2\2\60.\3\2\2\2\61\62\5\2\2\2\62\63\5\4\3\2\63\64\7\5\2\2\64\r\3\2"+
		"\2\2\65\67\5\20\t\2\66\65\3\2\2\2\678\3\2\2\28\66\3\2\2\289\3\2\2\29\17"+
		"\3\2\2\2:;\5\22\n\2;<\7\5\2\2<\21\3\2\2\2=>\7\32\2\2>F\5\4\3\2?B\7\33"+
		"\2\2@C\5\4\3\2AC\5\24\13\2B@\3\2\2\2BA\3\2\2\2CF\3\2\2\2DF\5\24\13\2E"+
		"=\3\2\2\2E?\3\2\2\2ED\3\2\2\2F\23\3\2\2\2GH\5\4\3\2HI\7\31\2\2IJ\5\24"+
		"\13\2JM\3\2\2\2KM\5\26\f\2LG\3\2\2\2LK\3\2\2\2M\25\3\2\2\2NO\5\30\r\2"+
		"OP\7\22\2\2PQ\5\30\r\2QT\3\2\2\2RT\5\30\r\2SN\3\2\2\2SR\3\2\2\2T\27\3"+
		"\2\2\2UV\b\r\1\2VW\5\32\16\2W]\3\2\2\2XY\6\r\2\3YZ\t\2\2\2Z\\\5\32\16"+
		"\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\31\3\2\2\2_]\3\2\2\2`a\b"+
		"\16\1\2ab\5\34\17\2bh\3\2\2\2cd\6\16\3\3de\7\n\2\2eg\5\34\17\2fc\3\2\2"+
		"\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\33\3\2\2\2jh\3\2\2\2kl\t\3\2\2lo\5\36"+
		"\20\2mo\5\36\20\2nk\3\2\2\2nm\3\2\2\2o\35\3\2\2\2pq\7\b\2\2qt\5 \21\2"+
		"rt\5 \21\2sp\3\2\2\2sr\3\2\2\2t\37\3\2\2\2uv\7\6\2\2vw\5\22\n\2wx\7\7"+
		"\2\2x|\3\2\2\2y|\5\4\3\2z|\5\6\4\2{u\3\2\2\2{y\3\2\2\2{z\3\2\2\2|!\3\2"+
		"\2\2\r.8BELS]hns{";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}