package compiler;

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
		TIPO=35, TIPO_INT=36, TIPO_REAL=37, IDENT=38;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "COMMENT", "';'", "'('", "')'", "LETRA", "'0'", "DIGITO", 
		"'_'", "'.'", "OP_CAST", "OP_UN", "OP_NEG", "'!'", "OP_MULTI", "'*'", 
		"'/'", "'%'", "'&&'", "OP_ADI", "'+'", "OP_SUB", "'||'", "OP_COMP", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='", "'='", "OP_IO", "'in'", "'out'", 
		"TIPO", "TIPO_INT", "TIPO_REAL", "IDENT"
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
			setState(36); match(DIGITO);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(37);
					_la = _input.LA(1);
					if ( !(_la==CERO || _la==DIGITO) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(49);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(43); match(PUNTO);
				setState(45); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(44);
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
					setState(47); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
			setState(51); decs();
			setState(52); accs();
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO) {
				{
				{
				setState(54); dec();
				}
				}
				setState(59);
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
			setState(60); tipo();
			setState(61); id();
			setState(62); match(SEP);
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
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64); acc();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PAR_AP) | (1L << DIGITO) | (1L << OP_CAST) | (1L << OP_UN) | (1L << OP_IO) | (1L << IDENT))) != 0) );
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
			setState(69); exp_nv0();
			setState(70); match(SEP);
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
			setState(78);
			switch (_input.LA(1)) {
			case OP_IO:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); match(OP_IO);
				setState(75);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(73); id();
					}
					break;

				case 2:
					{
					setState(74); exp_nv1();
					}
					break;
				}
				}
				break;
			case PAR_AP:
			case DIGITO:
			case OP_CAST:
			case OP_UN:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); exp_nv1();
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
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80); id();
				setState(81); match(OP_ASIG);
				setState(82); exp_nv1();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84); exp_nv2(0);
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
			setState(88); exp_nv3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp_nv2Context(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_exp_nv2);
					setState(90);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(91); match(OP_COMP);
					setState(92); exp_nv2(3);
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(99); exp_nv4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp_nv3Context(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_exp_nv3);
					setState(101);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(102); match(OP_ADI);
					setState(103); exp_nv4(0);
					}
					} 
				}
				setState(108);
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
			setState(110); exp_nv5();
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp_nv4Context(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_exp_nv4);
					setState(112);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(113); match(OP_MULTI);
					setState(114); exp_nv5();
					}
					} 
				}
				setState(119);
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
			setState(123);
			switch (_input.LA(1)) {
			case OP_UN:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); match(OP_UN);
				setState(121); exp_nv5();
				}
				break;
			case PAR_AP:
			case DIGITO:
			case OP_CAST:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(122); exp_nv6();
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
			setState(128);
			switch (_input.LA(1)) {
			case OP_CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(OP_CAST);
				setState(126); exp_term();
				}
				break;
			case PAR_AP:
			case DIGITO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); exp_term();
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
		public Exp_nv0Context exp_nv0() {
			return getRuleContext(Exp_nv0Context.class,0);
		}
		public TerminalNode PAR_CI() { return getToken(GrammarParser.PAR_CI, 0); }
		public TerminalNode PAR_AP() { return getToken(GrammarParser.PAR_AP, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
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
			setState(136);
			switch (_input.LA(1)) {
			case PAR_AP:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); match(PAR_AP);
				setState(131); exp_nv0();
				setState(132); match(PAR_CI);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(134); id();
				}
				break;
			case DIGITO:
				enterOuterAlt(_localctx, 3);
				{
				setState(135); num();
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3(\u008d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\7\4)\n\4\f\4\16\4,\13\4\3\4\3\4\6\4\60\n\4\r\4\16\4\61"+
		"\5\4\64\n\4\3\5\3\5\3\5\3\6\7\6:\n\6\f\6\16\6=\13\6\3\7\3\7\3\7\3\7\3"+
		"\b\6\bD\n\b\r\b\16\bE\3\t\3\t\3\t\3\n\3\n\3\n\5\nN\n\n\3\n\5\nQ\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\5\13X\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f`\n\f\f"+
		"\f\16\fc\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\rk\n\r\f\r\16\rn\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16v\n\16\f\16\16\16y\13\16\3\17\3\17\3\17\5\17"+
		"~\n\17\3\20\3\20\3\20\5\20\u0083\n\20\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u008b\n\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3"+
		"\2\t\n\u008b\2\"\3\2\2\2\4$\3\2\2\2\6&\3\2\2\2\b\65\3\2\2\2\n;\3\2\2\2"+
		"\f>\3\2\2\2\16C\3\2\2\2\20G\3\2\2\2\22P\3\2\2\2\24W\3\2\2\2\26Y\3\2\2"+
		"\2\30d\3\2\2\2\32o\3\2\2\2\34}\3\2\2\2\36\u0082\3\2\2\2 \u008a\3\2\2\2"+
		"\"#\7%\2\2#\3\3\2\2\2$%\7(\2\2%\5\3\2\2\2&*\7\n\2\2\')\t\2\2\2(\'\3\2"+
		"\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\63\3\2\2\2,*\3\2\2\2-/\7\f\2\2.\60"+
		"\t\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2"+
		"\2\63-\3\2\2\2\63\64\3\2\2\2\64\7\3\2\2\2\65\66\5\n\6\2\66\67\5\16\b\2"+
		"\67\t\3\2\2\28:\5\f\7\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\13\3"+
		"\2\2\2=;\3\2\2\2>?\5\2\2\2?@\5\4\3\2@A\7\5\2\2A\r\3\2\2\2BD\5\20\t\2C"+
		"B\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\17\3\2\2\2GH\5\22\n\2HI\7\5\2"+
		"\2I\21\3\2\2\2JM\7\"\2\2KN\5\4\3\2LN\5\24\13\2MK\3\2\2\2ML\3\2\2\2NQ\3"+
		"\2\2\2OQ\5\24\13\2PJ\3\2\2\2PO\3\2\2\2Q\23\3\2\2\2RS\5\4\3\2ST\7!\2\2"+
		"TU\5\24\13\2UX\3\2\2\2VX\5\26\f\2WR\3\2\2\2WV\3\2\2\2X\25\3\2\2\2YZ\b"+
		"\f\1\2Z[\5\30\r\2[a\3\2\2\2\\]\6\f\2\3]^\7\32\2\2^`\5\26\f\2_\\\3\2\2"+
		"\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\27\3\2\2\2ca\3\2\2\2de\b\r\1\2ef\5\32"+
		"\16\2fl\3\2\2\2gh\6\r\3\3hi\7\26\2\2ik\5\32\16\2jg\3\2\2\2kn\3\2\2\2l"+
		"j\3\2\2\2lm\3\2\2\2m\31\3\2\2\2nl\3\2\2\2op\b\16\1\2pq\5\34\17\2qw\3\2"+
		"\2\2rs\6\16\4\3st\7\21\2\2tv\5\34\17\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2w"+
		"x\3\2\2\2x\33\3\2\2\2yw\3\2\2\2z{\7\16\2\2{~\5\34\17\2|~\5\36\20\2}z\3"+
		"\2\2\2}|\3\2\2\2~\35\3\2\2\2\177\u0080\7\r\2\2\u0080\u0083\5 \21\2\u0081"+
		"\u0083\5 \21\2\u0082\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083\37\3\2\2\2"+
		"\u0084\u0085\7\6\2\2\u0085\u0086\5\22\n\2\u0086\u0087\7\7\2\2\u0087\u008b"+
		"\3\2\2\2\u0088\u008b\5\4\3\2\u0089\u008b\5\6\4\2\u008a\u0084\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b!\3\2\2\2\20*\61\63;EMPWalw}\u0082"+
		"\u008a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
