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
		WS=1, COMMENT=2, SEP=3, PAR_AP=4, PAR_CI=5, LETRA=6, CERO=7, DIGITO=8, 
		GUION_BAJO=9, PUNTO=10, OP_CAST=11, OP_UN=12, OP_NEG=13, OP_LOGNOT=14, 
		OP_MULTI=15, OP_MULT=16, OP_DIV=17, OP_MOD=18, OP_LOGAND=19, OP_ADI=20, 
		OP_ADD=21, OP_SUB=22, OP_LOGOR=23, OP_COMP=24, OP_LT=25, OP_GT=26, OP_LET=27, 
		OP_GET=28, OP_E=29, OP_NE=30, OP_ASIG=31, OP_IO=32, OP_IN=33, OP_OUT=34, 
		TIPO=35, TIPO_INT=36, TIPO_REAL=37;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "COMMENT", "';'", "'('", "')'", "LETRA", "'0'", "DIGITO", 
		"'_'", "'.'", "OP_CAST", "OP_UN", "OP_NEG", "'!'", "OP_MULTI", "'*'", 
		"'/'", "'%'", "'&&'", "OP_ADI", "'+'", "OP_SUB", "'||'", "OP_COMP", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='", "'='", "OP_IO", "'in'", "'out'", 
		"TIPO", "TIPO_INT", "TIPO_REAL"
	};
	public static final int
		RULE_tipo = 0, RULE_id = 1, RULE_num = 2, RULE_programa = 3, RULE_decs = 4, 
		RULE_dec = 5, RULE_accs = 6, RULE_acc = 7, RULE_exp_nv0 = 8, RULE_exp_nv1 = 9, 
		RULE_exp_nv2 = 10, RULE_exp_nv3 = 11, RULE_exp_nv4 = 12, RULE_exp_nv5 = 13, 
		RULE_exp_nv6 = 14, RULE_exp_term = 15;
	public static final String[] ruleNames = {
		"tipo", "id", "num", "programa", "decs", "dec", "accs", "acc", "exp_nv0", 
		"exp_nv1", "exp_nv2", "exp_nv3", "exp_nv4", "exp_nv5", "exp_nv6", "exp_term"
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
		public TerminalNode GUION_BAJO(int i) {
			return getToken(GrammarParser.GUION_BAJO, i);
		}
		public TerminalNode DIGITO(int i) {
			return getToken(GrammarParser.DIGITO, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(GrammarParser.DIGITO); }
		public List<TerminalNode> LETRA() { return getTokens(GrammarParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(GrammarParser.LETRA, i);
		}
		public List<TerminalNode> GUION_BAJO() { return getTokens(GrammarParser.GUION_BAJO); }
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_la = _input.LA(1);
			if ( !(_la==LETRA || _la==GUION_BAJO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LETRA) | (1L << DIGITO) | (1L << GUION_BAJO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode PUNTO() { return getToken(GrammarParser.PUNTO, 0); }
		public TerminalNode DIGITO(int i) {
			return getToken(GrammarParser.DIGITO, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(GrammarParser.DIGITO); }
		public TerminalNode CERO(int i) {
			return getToken(GrammarParser.CERO, i);
		}
		public List<TerminalNode> CERO() { return getTokens(GrammarParser.CERO); }
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(DIGITO);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(42);
					_la = _input.LA(1);
					if ( !(_la==CERO || _la==DIGITO) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(48); match(PUNTO);
				setState(50); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(49);
						_la = _input.LA(1);
						if ( !(_la==CERO || _la==DIGITO) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(52); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
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
			setState(56); decs();
			setState(57); accs();
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(59); dec();
				}
				}
				setState(64);
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
			setState(65); tipo();
			setState(66); id();
			setState(67); match(SEP);
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
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69); acc();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_AP) | (1L << LETRA) | (1L << DIGITO) | (1L << GUION_BAJO) | (1L << OP_CAST) | (1L << OP_UN) | (1L << OP_IO))) != 0) );
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
		public Exp_nv0Context exp_nv0() {
			return getRuleContext(Exp_nv0Context.class,0);
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
			setState(74); exp_nv0();
			setState(75); match(SEP);
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

	public static class Exp_nv0Context extends ParserRuleContext {
		public TerminalNode OP_IO() { return getToken(GrammarParser.OP_IO, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Exp_nv1Context exp_nv1() {
			return getRuleContext(Exp_nv1Context.class,0);
		}
		public Exp_nv0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_nv0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_nv0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_nv0(this);
		}
	}

	public final Exp_nv0Context exp_nv0() throws RecognitionException {
		Exp_nv0Context _localctx = new Exp_nv0Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_exp_nv0);
		try {
			setState(83);
			switch (_input.LA(1)) {
			case OP_IO:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); match(OP_IO);
				setState(80);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(78); id();
					}
					break;

				case 2:
					{
					setState(79); exp_nv1();
					}
					break;
				}
				}
				break;
			case PAR_AP:
			case LETRA:
			case DIGITO:
			case GUION_BAJO:
			case OP_CAST:
			case OP_UN:
				enterOuterAlt(_localctx, 2);
				{
				setState(82); exp_nv1();
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

	public static class Exp_nv1Context extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Exp_nv2Context exp_nv2() {
			return getRuleContext(Exp_nv2Context.class,0);
		}
		public TerminalNode OP_ASIG() { return getToken(GrammarParser.OP_ASIG, 0); }
		public Exp_nv1Context exp_nv1() {
			return getRuleContext(Exp_nv1Context.class,0);
		}
		public Exp_nv1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_nv1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_nv1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_nv1(this);
		}
	}

	public final Exp_nv1Context exp_nv1() throws RecognitionException {
		Exp_nv1Context _localctx = new Exp_nv1Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_exp_nv1);
		try {
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); id();
				setState(86); match(OP_ASIG);
				setState(87); exp_nv1();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); exp_nv2(0);
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

	public static class Exp_nv2Context extends ParserRuleContext {
		public int _p;
		public Exp_nv2Context exp_nv2(int i) {
			return getRuleContext(Exp_nv2Context.class,i);
		}
		public List<Exp_nv2Context> exp_nv2() {
			return getRuleContexts(Exp_nv2Context.class);
		}
		public TerminalNode OP_COMP() { return getToken(GrammarParser.OP_COMP, 0); }
		public Exp_nv3Context exp_nv3() {
			return getRuleContext(Exp_nv3Context.class,0);
		}
		public Exp_nv2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Exp_nv2Context(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_exp_nv2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_nv2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_nv2(this);
		}
	}

	public final Exp_nv2Context exp_nv2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp_nv2Context _localctx = new Exp_nv2Context(_ctx, _parentState, _p);
		Exp_nv2Context _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_exp_nv2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93); exp_nv3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp_nv2Context(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_exp_nv2);
					setState(95);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(96); match(OP_COMP);
					setState(97); exp_nv2(3);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Exp_nv3Context extends ParserRuleContext {
		public int _p;
		public TerminalNode OP_ADI() { return getToken(GrammarParser.OP_ADI, 0); }
		public Exp_nv3Context exp_nv3() {
			return getRuleContext(Exp_nv3Context.class,0);
		}
		public Exp_nv4Context exp_nv4() {
			return getRuleContext(Exp_nv4Context.class,0);
		}
		public Exp_nv3Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Exp_nv3Context(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_exp_nv3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_nv3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_nv3(this);
		}
	}

	public final Exp_nv3Context exp_nv3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp_nv3Context _localctx = new Exp_nv3Context(_ctx, _parentState, _p);
		Exp_nv3Context _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_exp_nv3);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(104); exp_nv4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp_nv3Context(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_exp_nv3);
					setState(106);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(107); match(OP_ADI);
					setState(108); exp_nv4(0);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Exp_nv4Context extends ParserRuleContext {
		public int _p;
		public TerminalNode OP_MULTI() { return getToken(GrammarParser.OP_MULTI, 0); }
		public Exp_nv5Context exp_nv5() {
			return getRuleContext(Exp_nv5Context.class,0);
		}
		public Exp_nv4Context exp_nv4() {
			return getRuleContext(Exp_nv4Context.class,0);
		}
		public Exp_nv4Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Exp_nv4Context(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_exp_nv4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_nv4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_nv4(this);
		}
	}

	public final Exp_nv4Context exp_nv4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp_nv4Context _localctx = new Exp_nv4Context(_ctx, _parentState, _p);
		Exp_nv4Context _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_exp_nv4);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(115); exp_nv5();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp_nv4Context(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_exp_nv4);
					setState(117);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(118); match(OP_MULTI);
					setState(119); exp_nv5();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Exp_nv5Context extends ParserRuleContext {
		public TerminalNode OP_UN() { return getToken(GrammarParser.OP_UN, 0); }
		public Exp_nv6Context exp_nv6() {
			return getRuleContext(Exp_nv6Context.class,0);
		}
		public Exp_nv5Context exp_nv5() {
			return getRuleContext(Exp_nv5Context.class,0);
		}
		public Exp_nv5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_nv5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_nv5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_nv5(this);
		}
	}

	public final Exp_nv5Context exp_nv5() throws RecognitionException {
		Exp_nv5Context _localctx = new Exp_nv5Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp_nv5);
		try {
			setState(128);
			switch (_input.LA(1)) {
			case OP_UN:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(OP_UN);
				setState(126); exp_nv5();
				}
				break;
			case PAR_AP:
			case LETRA:
			case DIGITO:
			case GUION_BAJO:
			case OP_CAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); exp_nv6();
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

	public static class Exp_nv6Context extends ParserRuleContext {
		public TerminalNode OP_CAST() { return getToken(GrammarParser.OP_CAST, 0); }
		public Exp_termContext exp_term() {
			return getRuleContext(Exp_termContext.class,0);
		}
		public Exp_nv6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_nv6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_nv6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_nv6(this);
		}
	}

	public final Exp_nv6Context exp_nv6() throws RecognitionException {
		Exp_nv6Context _localctx = new Exp_nv6Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp_nv6);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case OP_CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); match(OP_CAST);
				setState(131); exp_term();
				}
				break;
			case PAR_AP:
			case LETRA:
			case DIGITO:
			case GUION_BAJO:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); exp_term();
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

	public static class Exp_termContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAR_CI() { return getToken(GrammarParser.PAR_CI, 0); }
		public TerminalNode PAR_AP() { return getToken(GrammarParser.PAR_AP, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public Exp_nv1Context exp_nv1() {
			return getRuleContext(Exp_nv1Context.class,0);
		}
		public Exp_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExp_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExp_term(this);
		}
	}

	public final Exp_termContext exp_term() throws RecognitionException {
		Exp_termContext _localctx = new Exp_termContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exp_term);
		try {
			setState(141);
			switch (_input.LA(1)) {
			case PAR_AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); match(PAR_AP);
				setState(136); exp_nv1();
				setState(137); match(PAR_CI);
				}
				break;
			case LETRA:
			case GUION_BAJO:
				enterOuterAlt(_localctx, 2);
				{
				setState(139); id();
				}
				break;
			case DIGITO:
				enterOuterAlt(_localctx, 3);
				{
				setState(140); num();
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
		case 10: return exp_nv2_sempred((Exp_nv2Context)_localctx, predIndex);

		case 11: return exp_nv3_sempred((Exp_nv3Context)_localctx, predIndex);

		case 12: return exp_nv4_sempred((Exp_nv4Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_nv2_sempred(Exp_nv2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean exp_nv3_sempred(Exp_nv3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean exp_nv4_sempred(Exp_nv4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\'\u0092\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4"+
		"\3\4\6\4\65\n\4\r\4\16\4\66\5\49\n\4\3\5\3\5\3\5\3\6\7\6?\n\6\f\6\16\6"+
		"B\13\6\3\7\3\7\3\7\3\7\3\b\6\bI\n\b\r\b\16\bJ\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\5\nS\n\n\3\n\5\nV\n\n\3\13\3\13\3\13\3\13\3\13\5\13]\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\fe\n\f\f\f\16\fh\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\rp\n\r"+
		"\f\r\16\rs\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16{\n\16\f\16\16\16~\13"+
		"\16\3\17\3\17\3\17\5\17\u0083\n\17\3\20\3\20\3\20\5\20\u0088\n\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0090\n\21\3\21\2\22\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \2\5\4\2\b\b\13\13\4\2\b\b\n\13\3\2\t\n\u0091\2"+
		"\"\3\2\2\2\4$\3\2\2\2\6+\3\2\2\2\b:\3\2\2\2\n@\3\2\2\2\fC\3\2\2\2\16H"+
		"\3\2\2\2\20L\3\2\2\2\22U\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30i\3\2\2\2"+
		"\32t\3\2\2\2\34\u0082\3\2\2\2\36\u0087\3\2\2\2 \u008f\3\2\2\2\"#\7%\2"+
		"\2#\3\3\2\2\2$(\t\2\2\2%\'\t\3\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3"+
		"\2\2\2)\5\3\2\2\2*(\3\2\2\2+/\7\n\2\2,.\t\4\2\2-,\3\2\2\2.\61\3\2\2\2"+
		"/-\3\2\2\2/\60\3\2\2\2\608\3\2\2\2\61/\3\2\2\2\62\64\7\f\2\2\63\65\t\4"+
		"\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2"+
		"\28\62\3\2\2\289\3\2\2\29\7\3\2\2\2:;\5\n\6\2;<\5\16\b\2<\t\3\2\2\2=?"+
		"\5\f\7\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\13\3\2\2\2B@\3\2\2\2"+
		"CD\5\2\2\2DE\5\4\3\2EF\7\5\2\2F\r\3\2\2\2GI\5\20\t\2HG\3\2\2\2IJ\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2K\17\3\2\2\2LM\5\22\n\2MN\7\5\2\2N\21\3\2\2\2OR"+
		"\7\"\2\2PS\5\4\3\2QS\5\24\13\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TV\5\24\13"+
		"\2UO\3\2\2\2UT\3\2\2\2V\23\3\2\2\2WX\5\4\3\2XY\7!\2\2YZ\5\24\13\2Z]\3"+
		"\2\2\2[]\5\26\f\2\\W\3\2\2\2\\[\3\2\2\2]\25\3\2\2\2^_\b\f\1\2_`\5\30\r"+
		"\2`f\3\2\2\2ab\6\f\2\3bc\7\32\2\2ce\5\26\f\2da\3\2\2\2eh\3\2\2\2fd\3\2"+
		"\2\2fg\3\2\2\2g\27\3\2\2\2hf\3\2\2\2ij\b\r\1\2jk\5\32\16\2kq\3\2\2\2l"+
		"m\6\r\3\3mn\7\26\2\2np\5\32\16\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2r\31\3\2\2\2sq\3\2\2\2tu\b\16\1\2uv\5\34\17\2v|\3\2\2\2wx\6\16\4\3x"+
		"y\7\21\2\2y{\5\34\17\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\33\3\2"+
		"\2\2~|\3\2\2\2\177\u0080\7\16\2\2\u0080\u0083\5\34\17\2\u0081\u0083\5"+
		"\36\20\2\u0082\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083\35\3\2\2\2\u0084"+
		"\u0085\7\r\2\2\u0085\u0088\5 \21\2\u0086\u0088\5 \21\2\u0087\u0084\3\2"+
		"\2\2\u0087\u0086\3\2\2\2\u0088\37\3\2\2\2\u0089\u008a\7\6\2\2\u008a\u008b"+
		"\5\24\13\2\u008b\u008c\7\7\2\2\u008c\u0090\3\2\2\2\u008d\u0090\5\4\3\2"+
		"\u008e\u0090\5\6\4\2\u008f\u0089\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e"+
		"\3\2\2\2\u0090!\3\2\2\2\21(/\668@JRU\\fq|\u0082\u0087\u008f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}