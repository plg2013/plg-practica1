// $ANTLR : "Processor.g" -> "MiParser.java"$

	/* código de cabecera. opcional*/

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;
import antlr.collections.AST;
import java.util.Hashtable;
import antlr.ASTFactory;
import antlr.ASTPair;
import antlr.collections.impl.ASTArray;

public class MiParser extends antlr.LLkParser       implements MiScannerTokenTypes
 {

protected MiParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public MiParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected MiParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

public MiParser(TokenStream lexer) {
  this(lexer,1);
}

public MiParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
  buildTokenTypeASTClassMap();
  astFactory = new ASTFactory(getTokenTypeToASTClassMap());
}

	public final void programa() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST programa_AST = null;
		
		try {      // for error handling
			declaraciones();
			astFactory.addASTChild(currentAST, returnAST);
			acciones();
			astFactory.addASTChild(currentAST, returnAST);
			programa_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		returnAST = programa_AST;
	}
	
	public final void declaraciones() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST declaraciones_AST = null;
		
		try {      // for error handling
			{
			_loop1367:
			do {
				if ((LA(1)==TIPO_INT||LA(1)==TIPO_REAL)) {
					dec();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					break _loop1367;
				}
				
			} while (true);
			}
			declaraciones_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		returnAST = declaraciones_AST;
	}
	
	public final void acciones() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST acciones_AST = null;
		
		try {      // for error handling
			{
			int _cnt1372=0;
			_loop1372:
			do {
				if ((_tokenSet_1.member(LA(1)))) {
					acc();
					astFactory.addASTChild(currentAST, returnAST);
				}
				else {
					if ( _cnt1372>=1 ) { break _loop1372; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt1372++;
			} while (true);
			}
			acciones_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		returnAST = acciones_AST;
	}
	
	public final void dec() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST dec_AST = null;
		
		try {      // for error handling
			tipo();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp1_AST = null;
			tmp1_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp1_AST);
			match(IDENT);
			AST tmp2_AST = null;
			tmp2_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp2_AST);
			match(SEPARADOR);
			dec_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_2);
		}
		returnAST = dec_AST;
	}
	
	public final void tipo() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST tipo_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case TIPO_INT:
			{
				AST tmp3_AST = null;
				tmp3_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp3_AST);
				match(TIPO_INT);
				tipo_AST = (AST)currentAST.root;
				break;
			}
			case TIPO_REAL:
			{
				AST tmp4_AST = null;
				tmp4_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp4_AST);
				match(TIPO_REAL);
				tipo_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		returnAST = tipo_AST;
	}
	
	public final void acc() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST acc_AST = null;
		
		try {      // for error handling
			expresion();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp5_AST = null;
			tmp5_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp5_AST);
			match(SEPARADOR);
			acc_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		returnAST = acc_AST;
	}
	
	public final void expresion() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST expresion_AST = null;
		
		try {      // for error handling
			exp_nv0();
			astFactory.addASTChild(currentAST, returnAST);
			AST tmp6_AST = null;
			tmp6_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp6_AST);
			match(SEPARADOR);
			expresion_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_5);
		}
		returnAST = expresion_AST;
	}
	
	public final void exp_nv0() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exp_nv0_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case PARENTESIS_APER:
			case OP_MENOS:
			case OP_NOT:
			case OP_INT:
			case LIT_ENTERO:
			case LIT_REAL:
			case IDENT:
			case OP_REAL:
			{
				exp_nv1();
				astFactory.addASTChild(currentAST, returnAST);
				exp_nv0_AST = (AST)currentAST.root;
				break;
			}
			case OP_IN:
			case OP_OUT:
			{
				{
				switch ( LA(1)) {
				case OP_IN:
				{
					AST tmp7_AST = null;
					tmp7_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp7_AST);
					match(OP_IN);
					break;
				}
				case OP_OUT:
				{
					AST tmp8_AST = null;
					tmp8_AST = astFactory.create(LT(1));
					astFactory.addASTChild(currentAST, tmp8_AST);
					match(OP_OUT);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				exp_nv2();
				astFactory.addASTChild(currentAST, returnAST);
				exp_nv0_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_5);
		}
		returnAST = exp_nv0_AST;
	}
	
	public final void exp_nv1() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exp_nv1_AST = null;
		
		try {      // for error handling
			if ((_tokenSet_6.member(LA(1)))) {
				exp_nv2();
				astFactory.addASTChild(currentAST, returnAST);
				exp_nv1_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==IDENT)) {
				AST tmp9_AST = null;
				tmp9_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp9_AST);
				match(IDENT);
				AST tmp10_AST = null;
				tmp10_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp10_AST);
				match(OP_ASIGNACION);
				exp_nv2();
				astFactory.addASTChild(currentAST, returnAST);
				exp_nv1_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_5);
		}
		returnAST = exp_nv1_AST;
	}
	
	public final void exp_nv2() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exp_nv2_AST = null;
		
		try {      // for error handling
			if ((_tokenSet_6.member(LA(1)))) {
				exp_nv3();
				astFactory.addASTChild(currentAST, returnAST);
				exp_nv2_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==PARENTESIS_APER)) {
				AST tmp11_AST = null;
				tmp11_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp11_AST);
				match(PARENTESIS_APER);
				exp_nv2();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp12_AST = null;
				tmp12_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp12_AST);
				match(PARENTESIS_CIER);
				exp_nv2_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_6.member(LA(1)))) {
				exp_nv3();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp13_AST = null;
				tmp13_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp13_AST);
				match(OP_COMP);
				exp_nv3();
				astFactory.addASTChild(currentAST, returnAST);
				exp_nv2_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_7);
		}
		returnAST = exp_nv2_AST;
	}
	
	public final void exp_nv3() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exp_nv3_AST = null;
		
		try {      // for error handling
			if ((_tokenSet_6.member(LA(1)))) {
				exp_nv4();
				astFactory.addASTChild(currentAST, returnAST);
				exp_nv3_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==PARENTESIS_APER)) {
				AST tmp14_AST = null;
				tmp14_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp14_AST);
				match(PARENTESIS_APER);
				exp_nv3();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp15_AST = null;
				tmp15_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp15_AST);
				match(PARENTESIS_CIER);
				exp_nv3_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_6.member(LA(1)))) {
				exp_nv4();
				astFactory.addASTChild(currentAST, returnAST);
				exp_aditiva();
				astFactory.addASTChild(currentAST, returnAST);
				exp_nv3_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_8);
		}
		returnAST = exp_nv3_AST;
	}
	
	public final void exp_nv4() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exp_nv4_AST = null;
		
		try {      // for error handling
			if ((_tokenSet_9.member(LA(1)))) {
				exp_nv5();
				astFactory.addASTChild(currentAST, returnAST);
				exp_nv4_AST = (AST)currentAST.root;
			}
			else if ((LA(1)==PARENTESIS_APER)) {
				AST tmp16_AST = null;
				tmp16_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp16_AST);
				match(PARENTESIS_APER);
				exp_nv5();
				astFactory.addASTChild(currentAST, returnAST);
				AST tmp17_AST = null;
				tmp17_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp17_AST);
				match(PARENTESIS_CIER);
				exp_nv4_AST = (AST)currentAST.root;
			}
			else if ((_tokenSet_9.member(LA(1)))) {
				exp_nv5();
				astFactory.addASTChild(currentAST, returnAST);
				exp_multiplicativa();
				astFactory.addASTChild(currentAST, returnAST);
				exp_nv4_AST = (AST)currentAST.root;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_10);
		}
		returnAST = exp_nv4_AST;
	}
	
	public final void exp_aditiva() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exp_aditiva_AST = null;
		
		try {      // for error handling
			AST tmp18_AST = null;
			tmp18_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp18_AST);
			match(OP_ADITIVO);
			exp_nv3();
			astFactory.addASTChild(currentAST, returnAST);
			exp_aditiva_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_8);
		}
		returnAST = exp_aditiva_AST;
	}
	
	public final void exp_nv5() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exp_nv5_AST = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case OP_INT:
			{
				AST tmp19_AST = null;
				tmp19_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp19_AST);
				match(OP_INT);
				break;
			}
			case OP_REAL:
			{
				AST tmp20_AST = null;
				tmp20_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp20_AST);
				match(OP_REAL);
				break;
			}
			case OP_MENOS:
			case OP_NOT:
			case LIT_ENTERO:
			case LIT_REAL:
			case IDENT:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case OP_MENOS:
			{
				AST tmp21_AST = null;
				tmp21_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp21_AST);
				match(OP_MENOS);
				break;
			}
			case OP_NOT:
			{
				AST tmp22_AST = null;
				tmp22_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp22_AST);
				match(OP_NOT);
				break;
			}
			case LIT_ENTERO:
			case LIT_REAL:
			case IDENT:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			lex();
			astFactory.addASTChild(currentAST, returnAST);
			exp_nv5_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_11);
		}
		returnAST = exp_nv5_AST;
	}
	
	public final void exp_multiplicativa() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST exp_multiplicativa_AST = null;
		
		try {      // for error handling
			AST tmp23_AST = null;
			tmp23_AST = astFactory.create(LT(1));
			astFactory.addASTChild(currentAST, tmp23_AST);
			match(OP_MULTIPLICATIVO);
			exp_nv4();
			astFactory.addASTChild(currentAST, returnAST);
			exp_multiplicativa_AST = (AST)currentAST.root;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_10);
		}
		returnAST = exp_multiplicativa_AST;
	}
	
	public final void lex() throws RecognitionException, TokenStreamException {
		
		returnAST = null;
		ASTPair currentAST = new ASTPair();
		AST lex_AST = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LIT_ENTERO:
			{
				AST tmp24_AST = null;
				tmp24_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp24_AST);
				match(LIT_ENTERO);
				lex_AST = (AST)currentAST.root;
				break;
			}
			case LIT_REAL:
			{
				AST tmp25_AST = null;
				tmp25_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp25_AST);
				match(LIT_REAL);
				lex_AST = (AST)currentAST.root;
				break;
			}
			case IDENT:
			{
				AST tmp26_AST = null;
				tmp26_AST = astFactory.create(LT(1));
				astFactory.addASTChild(currentAST, tmp26_AST);
				match(IDENT);
				lex_AST = (AST)currentAST.root;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_11);
		}
		returnAST = lex_AST;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"BLANCO",
		"LETRA",
		"DIGITO",
		"DIGITO_NO_CERO",
		"GUION_BAJO",
		"SEPARADOR",
		"PARENTESIS_APER",
		"PARENTESIS_CIER",
		"PUNTO",
		"OP_IN",
		"OP_OUT",
		"OP_ASIGNACION",
		"OP_COMP_MENOR",
		"OP_COMP_MAYOR",
		"OP_COMP_MENORIGUAL",
		"OP_COMP_MAYORIGUAL",
		"OP_COMP_IGUAL",
		"OP_COMP_DISTINTO",
		"OP_MAS",
		"OP_MENOS",
		"OP_MULTIPLICACION",
		"OP_DIVISION",
		"OP_MODULO",
		"OP_AND",
		"OP_OR",
		"OP_NOT",
		"OP_COMP",
		"OP_ADITIVO",
		"OP_MULTIPLICATIVO",
		"TIPO_INT",
		"TIPO_REAL",
		"OP_INT",
		"LIT_NUMERO",
		"LIT_ENTERO",
		"LIT_REAL",
		"IDENT",
		"OP_REAL"
	};
	
	protected void buildTokenTypeASTClassMap() {
		tokenTypeToASTClassMap=null;
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 2096489325568L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 2122259129344L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 549755813888L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 2096489325570L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 512L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 2096489300992L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 2560L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 1073744384L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { 2096489299968L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { 3221228032L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { 7516195328L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	
	}
