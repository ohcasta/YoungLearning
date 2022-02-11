// Generated from c:\Users\juand\OneDrive\Escritorio\Proyecto_Lenguajes\grammar\MLGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, WS=3, CM=4, MOSTRAR=5, BAYES=6, REGRESION=7, KNN=8, SVM=9, 
		ARBOL=10, BOSQUE=11, AUTOMATICO=12, ENTRENAMIENTO=13, USANDO=14, PREDICCION=15, 
		EFECTIVIDAD=16, GRAFICA=17, MANUAL=18, CON=19, MODELOS=20, GENERARDATOS=21, 
		TOKEN_Y=22, TOKEN_X=23, GOTAS=24, CIRCULOS=25, LUNAS=26, MATRIZ=27, VERARBOL=28, 
		DIVIDIR=29, PREPARARENTRENAMIENTO=30, ID=31, CADENA=32, ENTERO=33;
	public static final int
		RULE_inicio = 0, RULE_comandos = 1, RULE_leer = 2, RULE_aleatorio = 3, 
		RULE_tipos = 4, RULE_mostrar = 5, RULE_indice = 6, RULE_defmodelo = 7, 
		RULE_modelos = 8, RULE_entrenar = 9, RULE_predecir = 10, RULE_efectividad = 11, 
		RULE_grafica = 12, RULE_manual = 13, RULE_ayudas = 14, RULE_matriz = 15, 
		RULE_verarbol = 16, RULE_dividir = 17, RULE_dividirh = 18, RULE_preparar = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "comandos", "leer", "aleatorio", "tipos", "mostrar", "indice", 
			"defmodelo", "modelos", "entrenar", "predecir", "efectividad", "grafica", 
			"manual", "ayudas", "matriz", "verarbol", "dividir", "dividirh", "preparar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WS", "CM", "MOSTRAR", "BAYES", "REGRESION", "KNN", 
			"SVM", "ARBOL", "BOSQUE", "AUTOMATICO", "ENTRENAMIENTO", "USANDO", "PREDICCION", 
			"EFECTIVIDAD", "GRAFICA", "MANUAL", "CON", "MODELOS", "GENERARDATOS", 
			"TOKEN_Y", "TOKEN_X", "GOTAS", "CIRCULOS", "LUNAS", "MATRIZ", "VERARBOL", 
			"DIVIDIR", "PREPARARENTRENAMIENTO", "ID", "CADENA", "ENTERO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			comandos();
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

	public static class ComandosContext extends ParserRuleContext {
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public AleatorioContext aleatorio() {
			return getRuleContext(AleatorioContext.class,0);
		}
		public MostrarContext mostrar() {
			return getRuleContext(MostrarContext.class,0);
		}
		public DefmodeloContext defmodelo() {
			return getRuleContext(DefmodeloContext.class,0);
		}
		public EntrenarContext entrenar() {
			return getRuleContext(EntrenarContext.class,0);
		}
		public PredecirContext predecir() {
			return getRuleContext(PredecirContext.class,0);
		}
		public EfectividadContext efectividad() {
			return getRuleContext(EfectividadContext.class,0);
		}
		public GraficaContext grafica() {
			return getRuleContext(GraficaContext.class,0);
		}
		public ManualContext manual() {
			return getRuleContext(ManualContext.class,0);
		}
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public VerarbolContext verarbol() {
			return getRuleContext(VerarbolContext.class,0);
		}
		public DividirContext dividir() {
			return getRuleContext(DividirContext.class,0);
		}
		public PrepararContext preparar() {
			return getRuleContext(PrepararContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comandos);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				leer();
				setState(43);
				comandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				aleatorio();
				setState(46);
				comandos();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				mostrar();
				setState(49);
				comandos();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				defmodelo();
				setState(52);
				comandos();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				entrenar();
				setState(55);
				comandos();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				predecir();
				setState(58);
				comandos();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(60);
				efectividad();
				setState(61);
				comandos();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				grafica();
				setState(64);
				comandos();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				manual();
				setState(67);
				comandos();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(69);
				matriz();
				setState(70);
				comandos();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(72);
				verarbol();
				setState(73);
				comandos();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(75);
				dividir();
				setState(76);
				comandos();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(78);
				preparar();
				setState(79);
				comandos();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
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

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MLGrammarParser.ID, 0); }
		public TerminalNode CADENA() { return getToken(MLGrammarParser.CADENA, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			match(T__0);
			setState(86);
			match(CADENA);
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

	public static class AleatorioContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLGrammarParser.ID, i);
		}
		public TerminalNode TOKEN_Y() { return getToken(MLGrammarParser.TOKEN_Y, 0); }
		public TerminalNode GENERARDATOS() { return getToken(MLGrammarParser.GENERARDATOS, 0); }
		public TerminalNode ENTERO() { return getToken(MLGrammarParser.ENTERO, 0); }
		public TiposContext tipos() {
			return getRuleContext(TiposContext.class,0);
		}
		public AleatorioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aleatorio; }
	}

	public final AleatorioContext aleatorio() throws RecognitionException {
		AleatorioContext _localctx = new AleatorioContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aleatorio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			setState(89);
			match(TOKEN_Y);
			setState(90);
			match(ID);
			setState(91);
			match(T__0);
			setState(92);
			match(GENERARDATOS);
			setState(93);
			match(ENTERO);
			setState(94);
			tipos();
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

	public static class TiposContext extends ParserRuleContext {
		public TerminalNode LUNAS() { return getToken(MLGrammarParser.LUNAS, 0); }
		public TerminalNode CIRCULOS() { return getToken(MLGrammarParser.CIRCULOS, 0); }
		public TerminalNode GOTAS() { return getToken(MLGrammarParser.GOTAS, 0); }
		public TerminalNode CON() { return getToken(MLGrammarParser.CON, 0); }
		public TerminalNode ENTERO() { return getToken(MLGrammarParser.ENTERO, 0); }
		public TiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos; }
	}

	public final TiposContext tipos() throws RecognitionException {
		TiposContext _localctx = new TiposContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipos);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(LUNAS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(CIRCULOS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(GOTAS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(GOTAS);
				setState(100);
				match(CON);
				setState(101);
				match(ENTERO);
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

	public static class MostrarContext extends ParserRuleContext {
		public TerminalNode MOSTRAR() { return getToken(MLGrammarParser.MOSTRAR, 0); }
		public TerminalNode ID() { return getToken(MLGrammarParser.ID, 0); }
		public IndiceContext indice() {
			return getRuleContext(IndiceContext.class,0);
		}
		public MostrarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrar; }
	}

	public final MostrarContext mostrar() throws RecognitionException {
		MostrarContext _localctx = new MostrarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mostrar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(MOSTRAR);
			setState(105);
			match(ID);
			setState(106);
			indice();
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

	public static class IndiceContext extends ParserRuleContext {
		public TerminalNode CON() { return getToken(MLGrammarParser.CON, 0); }
		public TerminalNode ENTERO() { return getToken(MLGrammarParser.ENTERO, 0); }
		public IndiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indice; }
	}

	public final IndiceContext indice() throws RecognitionException {
		IndiceContext _localctx = new IndiceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_indice);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CON:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(CON);
				setState(109);
				match(ENTERO);
				}
				break;
			case EOF:
			case MOSTRAR:
			case ENTRENAMIENTO:
			case EFECTIVIDAD:
			case GRAFICA:
			case MANUAL:
			case MATRIZ:
			case VERARBOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DefmodeloContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MLGrammarParser.ID, 0); }
		public ModelosContext modelos() {
			return getRuleContext(ModelosContext.class,0);
		}
		public DefmodeloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defmodelo; }
	}

	public final DefmodeloContext defmodelo() throws RecognitionException {
		DefmodeloContext _localctx = new DefmodeloContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_defmodelo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(ID);
			setState(114);
			match(T__0);
			setState(115);
			modelos();
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

	public static class ModelosContext extends ParserRuleContext {
		public TerminalNode BAYES() { return getToken(MLGrammarParser.BAYES, 0); }
		public TerminalNode KNN() { return getToken(MLGrammarParser.KNN, 0); }
		public TerminalNode REGRESION() { return getToken(MLGrammarParser.REGRESION, 0); }
		public TerminalNode SVM() { return getToken(MLGrammarParser.SVM, 0); }
		public TerminalNode ARBOL() { return getToken(MLGrammarParser.ARBOL, 0); }
		public TerminalNode BOSQUE() { return getToken(MLGrammarParser.BOSQUE, 0); }
		public TerminalNode AUTOMATICO() { return getToken(MLGrammarParser.AUTOMATICO, 0); }
		public ModelosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelos; }
	}

	public final ModelosContext modelos() throws RecognitionException {
		ModelosContext _localctx = new ModelosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_modelos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAYES) | (1L << REGRESION) | (1L << KNN) | (1L << SVM) | (1L << ARBOL) | (1L << BOSQUE) | (1L << AUTOMATICO))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class EntrenarContext extends ParserRuleContext {
		public TerminalNode ENTRENAMIENTO() { return getToken(MLGrammarParser.ENTRENAMIENTO, 0); }
		public List<TerminalNode> ID() { return getTokens(MLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLGrammarParser.ID, i);
		}
		public TerminalNode USANDO() { return getToken(MLGrammarParser.USANDO, 0); }
		public TerminalNode CON() { return getToken(MLGrammarParser.CON, 0); }
		public EntrenarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrenar; }
	}

	public final EntrenarContext entrenar() throws RecognitionException {
		EntrenarContext _localctx = new EntrenarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_entrenar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ENTRENAMIENTO);
			setState(120);
			match(ID);
			setState(121);
			match(USANDO);
			setState(122);
			match(ID);
			setState(123);
			match(CON);
			setState(124);
			match(ID);
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

	public static class PredecirContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLGrammarParser.ID, i);
		}
		public TerminalNode PREDICCION() { return getToken(MLGrammarParser.PREDICCION, 0); }
		public TerminalNode USANDO() { return getToken(MLGrammarParser.USANDO, 0); }
		public PredecirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predecir; }
	}

	public final PredecirContext predecir() throws RecognitionException {
		PredecirContext _localctx = new PredecirContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_predecir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ID);
			setState(127);
			match(T__0);
			setState(128);
			match(PREDICCION);
			setState(129);
			match(ID);
			setState(130);
			match(USANDO);
			setState(131);
			match(ID);
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

	public static class EfectividadContext extends ParserRuleContext {
		public TerminalNode EFECTIVIDAD() { return getToken(MLGrammarParser.EFECTIVIDAD, 0); }
		public List<TerminalNode> ID() { return getTokens(MLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLGrammarParser.ID, i);
		}
		public TerminalNode USANDO() { return getToken(MLGrammarParser.USANDO, 0); }
		public TerminalNode CON() { return getToken(MLGrammarParser.CON, 0); }
		public EfectividadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_efectividad; }
	}

	public final EfectividadContext efectividad() throws RecognitionException {
		EfectividadContext _localctx = new EfectividadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_efectividad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(EFECTIVIDAD);
			setState(134);
			match(ID);
			setState(135);
			match(USANDO);
			setState(136);
			match(ID);
			setState(137);
			match(CON);
			setState(138);
			match(ID);
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

	public static class GraficaContext extends ParserRuleContext {
		public TerminalNode GRAFICA() { return getToken(MLGrammarParser.GRAFICA, 0); }
		public List<TerminalNode> ID() { return getTokens(MLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLGrammarParser.ID, i);
		}
		public TerminalNode USANDO() { return getToken(MLGrammarParser.USANDO, 0); }
		public TerminalNode CON() { return getToken(MLGrammarParser.CON, 0); }
		public GraficaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grafica; }
	}

	public final GraficaContext grafica() throws RecognitionException {
		GraficaContext _localctx = new GraficaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_grafica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(GRAFICA);
			setState(141);
			match(ID);
			setState(142);
			match(USANDO);
			setState(143);
			match(ID);
			setState(144);
			match(CON);
			setState(145);
			match(ID);
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

	public static class ManualContext extends ParserRuleContext {
		public TerminalNode MANUAL() { return getToken(MLGrammarParser.MANUAL, 0); }
		public AyudasContext ayudas() {
			return getRuleContext(AyudasContext.class,0);
		}
		public ManualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_manual; }
	}

	public final ManualContext manual() throws RecognitionException {
		ManualContext _localctx = new ManualContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_manual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(MANUAL);
			setState(148);
			ayudas();
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

	public static class AyudasContext extends ParserRuleContext {
		public TerminalNode ENTRENAMIENTO() { return getToken(MLGrammarParser.ENTRENAMIENTO, 0); }
		public TerminalNode PREDICCION() { return getToken(MLGrammarParser.PREDICCION, 0); }
		public TerminalNode EFECTIVIDAD() { return getToken(MLGrammarParser.EFECTIVIDAD, 0); }
		public TerminalNode GRAFICA() { return getToken(MLGrammarParser.GRAFICA, 0); }
		public TerminalNode BAYES() { return getToken(MLGrammarParser.BAYES, 0); }
		public TerminalNode KNN() { return getToken(MLGrammarParser.KNN, 0); }
		public TerminalNode REGRESION() { return getToken(MLGrammarParser.REGRESION, 0); }
		public TerminalNode SVM() { return getToken(MLGrammarParser.SVM, 0); }
		public TerminalNode ARBOL() { return getToken(MLGrammarParser.ARBOL, 0); }
		public TerminalNode BOSQUE() { return getToken(MLGrammarParser.BOSQUE, 0); }
		public TerminalNode AUTOMATICO() { return getToken(MLGrammarParser.AUTOMATICO, 0); }
		public TerminalNode MODELOS() { return getToken(MLGrammarParser.MODELOS, 0); }
		public AyudasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ayudas; }
	}

	public final AyudasContext ayudas() throws RecognitionException {
		AyudasContext _localctx = new AyudasContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ayudas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAYES) | (1L << REGRESION) | (1L << KNN) | (1L << SVM) | (1L << ARBOL) | (1L << BOSQUE) | (1L << AUTOMATICO) | (1L << ENTRENAMIENTO) | (1L << PREDICCION) | (1L << EFECTIVIDAD) | (1L << GRAFICA) | (1L << MODELOS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MatrizContext extends ParserRuleContext {
		public TerminalNode MATRIZ() { return getToken(MLGrammarParser.MATRIZ, 0); }
		public List<TerminalNode> ID() { return getTokens(MLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLGrammarParser.ID, i);
		}
		public TerminalNode USANDO() { return getToken(MLGrammarParser.USANDO, 0); }
		public TerminalNode CON() { return getToken(MLGrammarParser.CON, 0); }
		public MatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matriz; }
	}

	public final MatrizContext matriz() throws RecognitionException {
		MatrizContext _localctx = new MatrizContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_matriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(MATRIZ);
			setState(153);
			match(ID);
			setState(154);
			match(USANDO);
			setState(155);
			match(ID);
			setState(156);
			match(CON);
			setState(157);
			match(ID);
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

	public static class VerarbolContext extends ParserRuleContext {
		public TerminalNode VERARBOL() { return getToken(MLGrammarParser.VERARBOL, 0); }
		public TerminalNode ID() { return getToken(MLGrammarParser.ID, 0); }
		public VerarbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verarbol; }
	}

	public final VerarbolContext verarbol() throws RecognitionException {
		VerarbolContext _localctx = new VerarbolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_verarbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(VERARBOL);
			setState(160);
			match(ID);
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

	public static class DividirContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLGrammarParser.ID, i);
		}
		public TerminalNode TOKEN_Y() { return getToken(MLGrammarParser.TOKEN_Y, 0); }
		public TerminalNode DIVIDIR() { return getToken(MLGrammarParser.DIVIDIR, 0); }
		public DividirhContext dividirh() {
			return getRuleContext(DividirhContext.class,0);
		}
		public DividirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dividir; }
	}

	public final DividirContext dividir() throws RecognitionException {
		DividirContext _localctx = new DividirContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dividir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ID);
			setState(163);
			match(TOKEN_Y);
			setState(164);
			match(ID);
			setState(165);
			match(T__0);
			setState(166);
			match(DIVIDIR);
			setState(167);
			dividirh();
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

	public static class DividirhContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MLGrammarParser.ID, 0); }
		public TerminalNode CADENA() { return getToken(MLGrammarParser.CADENA, 0); }
		public DividirhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dividirh; }
	}

	public final DividirhContext dividirh() throws RecognitionException {
		DividirhContext _localctx = new DividirhContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dividirh);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PrepararContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MLGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MLGrammarParser.ID, i);
		}
		public TerminalNode TOKEN_Y() { return getToken(MLGrammarParser.TOKEN_Y, 0); }
		public TerminalNode PREPARARENTRENAMIENTO() { return getToken(MLGrammarParser.PREPARARENTRENAMIENTO, 0); }
		public TerminalNode USANDO() { return getToken(MLGrammarParser.USANDO, 0); }
		public TerminalNode CON() { return getToken(MLGrammarParser.CON, 0); }
		public PrepararContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preparar; }
	}

	public final PrepararContext preparar() throws RecognitionException {
		PrepararContext _localctx = new PrepararContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_preparar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ID);
			setState(172);
			match(T__1);
			setState(173);
			match(ID);
			setState(174);
			match(T__1);
			setState(175);
			match(ID);
			setState(176);
			match(TOKEN_Y);
			setState(177);
			match(ID);
			setState(178);
			match(T__0);
			setState(179);
			match(PREPARARENTRENAMIENTO);
			setState(180);
			match(USANDO);
			setState(181);
			match(ID);
			setState(182);
			match(CON);
			setState(183);
			match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3U\n\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6i\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\br\n\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\5\3\2\b\16\5\2\b\17\21\23\26\26\3\2!\"\2\u00b8"+
		"\2*\3\2\2\2\4T\3\2\2\2\6V\3\2\2\2\bZ\3\2\2\2\nh\3\2\2\2\fj\3\2\2\2\16"+
		"q\3\2\2\2\20s\3\2\2\2\22w\3\2\2\2\24y\3\2\2\2\26\u0080\3\2\2\2\30\u0087"+
		"\3\2\2\2\32\u008e\3\2\2\2\34\u0095\3\2\2\2\36\u0098\3\2\2\2 \u009a\3\2"+
		"\2\2\"\u00a1\3\2\2\2$\u00a4\3\2\2\2&\u00ab\3\2\2\2(\u00ad\3\2\2\2*+\5"+
		"\4\3\2+\3\3\2\2\2,-\5\6\4\2-.\5\4\3\2.U\3\2\2\2/\60\5\b\5\2\60\61\5\4"+
		"\3\2\61U\3\2\2\2\62\63\5\f\7\2\63\64\5\4\3\2\64U\3\2\2\2\65\66\5\20\t"+
		"\2\66\67\5\4\3\2\67U\3\2\2\289\5\24\13\29:\5\4\3\2:U\3\2\2\2;<\5\26\f"+
		"\2<=\5\4\3\2=U\3\2\2\2>?\5\30\r\2?@\5\4\3\2@U\3\2\2\2AB\5\32\16\2BC\5"+
		"\4\3\2CU\3\2\2\2DE\5\34\17\2EF\5\4\3\2FU\3\2\2\2GH\5 \21\2HI\5\4\3\2I"+
		"U\3\2\2\2JK\5\"\22\2KL\5\4\3\2LU\3\2\2\2MN\5$\23\2NO\5\4\3\2OU\3\2\2\2"+
		"PQ\5(\25\2QR\5\4\3\2RU\3\2\2\2SU\3\2\2\2T,\3\2\2\2T/\3\2\2\2T\62\3\2\2"+
		"\2T\65\3\2\2\2T8\3\2\2\2T;\3\2\2\2T>\3\2\2\2TA\3\2\2\2TD\3\2\2\2TG\3\2"+
		"\2\2TJ\3\2\2\2TM\3\2\2\2TP\3\2\2\2TS\3\2\2\2U\5\3\2\2\2VW\7!\2\2WX\7\3"+
		"\2\2XY\7\"\2\2Y\7\3\2\2\2Z[\7!\2\2[\\\7\30\2\2\\]\7!\2\2]^\7\3\2\2^_\7"+
		"\27\2\2_`\7#\2\2`a\5\n\6\2a\t\3\2\2\2bi\7\34\2\2ci\7\33\2\2di\7\32\2\2"+
		"ef\7\32\2\2fg\7\25\2\2gi\7#\2\2hb\3\2\2\2hc\3\2\2\2hd\3\2\2\2he\3\2\2"+
		"\2i\13\3\2\2\2jk\7\7\2\2kl\7!\2\2lm\5\16\b\2m\r\3\2\2\2no\7\25\2\2or\7"+
		"#\2\2pr\3\2\2\2qn\3\2\2\2qp\3\2\2\2r\17\3\2\2\2st\7!\2\2tu\7\3\2\2uv\5"+
		"\22\n\2v\21\3\2\2\2wx\t\2\2\2x\23\3\2\2\2yz\7\17\2\2z{\7!\2\2{|\7\20\2"+
		"\2|}\7!\2\2}~\7\25\2\2~\177\7!\2\2\177\25\3\2\2\2\u0080\u0081\7!\2\2\u0081"+
		"\u0082\7\3\2\2\u0082\u0083\7\21\2\2\u0083\u0084\7!\2\2\u0084\u0085\7\20"+
		"\2\2\u0085\u0086\7!\2\2\u0086\27\3\2\2\2\u0087\u0088\7\22\2\2\u0088\u0089"+
		"\7!\2\2\u0089\u008a\7\20\2\2\u008a\u008b\7!\2\2\u008b\u008c\7\25\2\2\u008c"+
		"\u008d\7!\2\2\u008d\31\3\2\2\2\u008e\u008f\7\23\2\2\u008f\u0090\7!\2\2"+
		"\u0090\u0091\7\20\2\2\u0091\u0092\7!\2\2\u0092\u0093\7\25\2\2\u0093\u0094"+
		"\7!\2\2\u0094\33\3\2\2\2\u0095\u0096\7\24\2\2\u0096\u0097\5\36\20\2\u0097"+
		"\35\3\2\2\2\u0098\u0099\t\3\2\2\u0099\37\3\2\2\2\u009a\u009b\7\35\2\2"+
		"\u009b\u009c\7!\2\2\u009c\u009d\7\20\2\2\u009d\u009e\7!\2\2\u009e\u009f"+
		"\7\25\2\2\u009f\u00a0\7!\2\2\u00a0!\3\2\2\2\u00a1\u00a2\7\36\2\2\u00a2"+
		"\u00a3\7!\2\2\u00a3#\3\2\2\2\u00a4\u00a5\7!\2\2\u00a5\u00a6\7\30\2\2\u00a6"+
		"\u00a7\7!\2\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\7\37\2\2\u00a9\u00aa\5&"+
		"\24\2\u00aa%\3\2\2\2\u00ab\u00ac\t\4\2\2\u00ac\'\3\2\2\2\u00ad\u00ae\7"+
		"!\2\2\u00ae\u00af\7\4\2\2\u00af\u00b0\7!\2\2\u00b0\u00b1\7\4\2\2\u00b1"+
		"\u00b2\7!\2\2\u00b2\u00b3\7\30\2\2\u00b3\u00b4\7!\2\2\u00b4\u00b5\7\3"+
		"\2\2\u00b5\u00b6\7 \2\2\u00b6\u00b7\7\20\2\2\u00b7\u00b8\7!\2\2\u00b8"+
		"\u00b9\7\25\2\2\u00b9\u00ba\7!\2\2\u00ba)\3\2\2\2\5Thq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}