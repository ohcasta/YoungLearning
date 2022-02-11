// Generated from c:\Users\juand\OneDrive\Escritorio\Proyecto_Lenguajes\grammar\MLGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MLGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WS", "CM", "MOSTRAR", "BAYES", "REGRESION", "KNN", "SVM", 
			"ARBOL", "BOSQUE", "AUTOMATICO", "ENTRENAMIENTO", "USANDO", "PREDICCION", 
			"EFECTIVIDAD", "GRAFICA", "MANUAL", "CON", "MODELOS", "GENERARDATOS", 
			"TOKEN_Y", "TOKEN_X", "GOTAS", "CIRCULOS", "LUNAS", "MATRIZ", "VERARBOL", 
			"DIVIDIR", "PREPARARENTRENAMIENTO", "ID", "CADENA", "ENTERO"
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


	public MLGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u0143\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\6\4K\n\4\r\4\16\4L\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\7\5U\n\5\f\5\16\5X\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \7 "+
		"\u0131\n \f \16 \u0134\13 \3!\3!\7!\u0138\n!\f!\16!\u013b\13!\3!\3!\3"+
		"\"\6\"\u0140\n\"\r\"\16\"\u0141\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\36\5\2\13\f\17\17\""+
		"\"\4\2\f\f\17\17\4\2OOoo\4\2QQqq\4\2UUuu\4\2VVvv\4\2TTtt\4\2CCcc\4\2D"+
		"Ddd\4\2[[{{\4\2GGgg\4\2IIii\4\2KKkk\4\2PPpp\4\2MMmm\4\2XXxx\4\2NNnn\4"+
		"\2SSss\4\2WWww\4\2EEee\4\2FFff\4\2RRrr\4\2HHhh\4\2ZZzz\4\2\\\\||\4\2C"+
		"\\c|\6\2\62;C\\aac|\4\2$$))\2\u0147\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7J\3\2\2\2\tP\3\2\2\2\13[\3\2\2"+
		"\2\rc\3\2\2\2\17i\3\2\2\2\21s\3\2\2\2\23w\3\2\2\2\25{\3\2\2\2\27\u0081"+
		"\3\2\2\2\31\u0088\3\2\2\2\33\u0093\3\2\2\2\35\u00a1\3\2\2\2\37\u00a8\3"+
		"\2\2\2!\u00b3\3\2\2\2#\u00bf\3\2\2\2%\u00c7\3\2\2\2\'\u00ce\3\2\2\2)\u00d2"+
		"\3\2\2\2+\u00da\3\2\2\2-\u00e7\3\2\2\2/\u00e9\3\2\2\2\61\u00eb\3\2\2\2"+
		"\63\u00f1\3\2\2\2\65\u00fa\3\2\2\2\67\u0100\3\2\2\29\u0107\3\2\2\2;\u0110"+
		"\3\2\2\2=\u0118\3\2\2\2?\u012e\3\2\2\2A\u0135\3\2\2\2C\u013f\3\2\2\2E"+
		"F\7?\2\2F\4\3\2\2\2GH\7.\2\2H\6\3\2\2\2IK\t\2\2\2JI\3\2\2\2KL\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\b\4\2\2O\b\3\2\2\2PQ\7\61\2\2QR\7\61"+
		"\2\2RV\3\2\2\2SU\n\3\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2"+
		"\2\2XV\3\2\2\2YZ\b\5\2\2Z\n\3\2\2\2[\\\t\4\2\2\\]\t\5\2\2]^\t\6\2\2^_"+
		"\t\7\2\2_`\t\b\2\2`a\t\t\2\2ab\t\b\2\2b\f\3\2\2\2cd\t\n\2\2de\t\t\2\2"+
		"ef\t\13\2\2fg\t\f\2\2gh\t\6\2\2h\16\3\2\2\2ij\t\b\2\2jk\t\f\2\2kl\t\r"+
		"\2\2lm\t\b\2\2mn\t\f\2\2no\t\6\2\2op\t\16\2\2pq\t\5\2\2qr\t\17\2\2r\20"+
		"\3\2\2\2st\t\20\2\2tu\t\17\2\2uv\t\17\2\2v\22\3\2\2\2wx\t\6\2\2xy\t\21"+
		"\2\2yz\t\4\2\2z\24\3\2\2\2{|\t\t\2\2|}\t\b\2\2}~\t\n\2\2~\177\t\5\2\2"+
		"\177\u0080\t\22\2\2\u0080\26\3\2\2\2\u0081\u0082\t\n\2\2\u0082\u0083\t"+
		"\5\2\2\u0083\u0084\t\6\2\2\u0084\u0085\t\23\2\2\u0085\u0086\t\24\2\2\u0086"+
		"\u0087\t\f\2\2\u0087\30\3\2\2\2\u0088\u0089\t\t\2\2\u0089\u008a\t\24\2"+
		"\2\u008a\u008b\t\7\2\2\u008b\u008c\t\5\2\2\u008c\u008d\t\4\2\2\u008d\u008e"+
		"\t\t\2\2\u008e\u008f\t\7\2\2\u008f\u0090\t\16\2\2\u0090\u0091\t\25\2\2"+
		"\u0091\u0092\t\5\2\2\u0092\32\3\2\2\2\u0093\u0094\t\f\2\2\u0094\u0095"+
		"\t\17\2\2\u0095\u0096\t\7\2\2\u0096\u0097\t\b\2\2\u0097\u0098\t\f\2\2"+
		"\u0098\u0099\t\17\2\2\u0099\u009a\t\t\2\2\u009a\u009b\t\4\2\2\u009b\u009c"+
		"\t\16\2\2\u009c\u009d\t\f\2\2\u009d\u009e\t\17\2\2\u009e\u009f\t\7\2\2"+
		"\u009f\u00a0\t\5\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\t\24\2\2\u00a2\u00a3"+
		"\t\6\2\2\u00a3\u00a4\t\t\2\2\u00a4\u00a5\t\17\2\2\u00a5\u00a6\t\26\2\2"+
		"\u00a6\u00a7\t\5\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\t\27\2\2\u00a9\u00aa"+
		"\t\b\2\2\u00aa\u00ab\t\f\2\2\u00ab\u00ac\t\26\2\2\u00ac\u00ad\t\16\2\2"+
		"\u00ad\u00ae\t\25\2\2\u00ae\u00af\t\25\2\2\u00af\u00b0\t\16\2\2\u00b0"+
		"\u00b1\t\5\2\2\u00b1\u00b2\t\17\2\2\u00b2 \3\2\2\2\u00b3\u00b4\t\f\2\2"+
		"\u00b4\u00b5\t\30\2\2\u00b5\u00b6\t\f\2\2\u00b6\u00b7\t\25\2\2\u00b7\u00b8"+
		"\t\7\2\2\u00b8\u00b9\t\16\2\2\u00b9\u00ba\t\21\2\2\u00ba\u00bb\t\16\2"+
		"\2\u00bb\u00bc\t\26\2\2\u00bc\u00bd\t\t\2\2\u00bd\u00be\t\26\2\2\u00be"+
		"\"\3\2\2\2\u00bf\u00c0\t\r\2\2\u00c0\u00c1\t\b\2\2\u00c1\u00c2\t\t\2\2"+
		"\u00c2\u00c3\t\30\2\2\u00c3\u00c4\t\16\2\2\u00c4\u00c5\t\25\2\2\u00c5"+
		"\u00c6\t\t\2\2\u00c6$\3\2\2\2\u00c7\u00c8\t\4\2\2\u00c8\u00c9\t\t\2\2"+
		"\u00c9\u00ca\t\17\2\2\u00ca\u00cb\t\24\2\2\u00cb\u00cc\t\t\2\2\u00cc\u00cd"+
		"\t\22\2\2\u00cd&\3\2\2\2\u00ce\u00cf\t\25\2\2\u00cf\u00d0\t\5\2\2\u00d0"+
		"\u00d1\t\17\2\2\u00d1(\3\2\2\2\u00d2\u00d3\t\4\2\2\u00d3\u00d4\t\5\2\2"+
		"\u00d4\u00d5\t\26\2\2\u00d5\u00d6\t\f\2\2\u00d6\u00d7\t\22\2\2\u00d7\u00d8"+
		"\t\5\2\2\u00d8\u00d9\t\6\2\2\u00d9*\3\2\2\2\u00da\u00db\t\r\2\2\u00db"+
		"\u00dc\t\f\2\2\u00dc\u00dd\t\17\2\2\u00dd\u00de\t\f\2\2\u00de\u00df\t"+
		"\b\2\2\u00df\u00e0\t\t\2\2\u00e0\u00e1\t\b\2\2\u00e1\u00e2\t\26\2\2\u00e2"+
		"\u00e3\t\t\2\2\u00e3\u00e4\t\7\2\2\u00e4\u00e5\t\5\2\2\u00e5\u00e6\t\6"+
		"\2\2\u00e6,\3\2\2\2\u00e7\u00e8\t\13\2\2\u00e8.\3\2\2\2\u00e9\u00ea\t"+
		"\31\2\2\u00ea\60\3\2\2\2\u00eb\u00ec\t\r\2\2\u00ec\u00ed\t\5\2\2\u00ed"+
		"\u00ee\t\7\2\2\u00ee\u00ef\t\t\2\2\u00ef\u00f0\t\6\2\2\u00f0\62\3\2\2"+
		"\2\u00f1\u00f2\t\25\2\2\u00f2\u00f3\t\16\2\2\u00f3\u00f4\t\b\2\2\u00f4"+
		"\u00f5\t\25\2\2\u00f5\u00f6\t\24\2\2\u00f6\u00f7\t\22\2\2\u00f7\u00f8"+
		"\t\5\2\2\u00f8\u00f9\t\6\2\2\u00f9\64\3\2\2\2\u00fa\u00fb\t\22\2\2\u00fb"+
		"\u00fc\t\24\2\2\u00fc\u00fd\t\17\2\2\u00fd\u00fe\t\t\2\2\u00fe\u00ff\t"+
		"\6\2\2\u00ff\66\3\2\2\2\u0100\u0101\t\4\2\2\u0101\u0102\t\t\2\2\u0102"+
		"\u0103\t\7\2\2\u0103\u0104\t\b\2\2\u0104\u0105\t\16\2\2\u0105\u0106\t"+
		"\32\2\2\u01068\3\2\2\2\u0107\u0108\t\21\2\2\u0108\u0109\t\f\2\2\u0109"+
		"\u010a\t\b\2\2\u010a\u010b\t\t\2\2\u010b\u010c\t\b\2\2\u010c\u010d\t\n"+
		"\2\2\u010d\u010e\t\5\2\2\u010e\u010f\t\22\2\2\u010f:\3\2\2\2\u0110\u0111"+
		"\t\26\2\2\u0111\u0112\t\16\2\2\u0112\u0113\t\21\2\2\u0113\u0114\t\16\2"+
		"\2\u0114\u0115\t\26\2\2\u0115\u0116\t\16\2\2\u0116\u0117\t\b\2\2\u0117"+
		"<\3\2\2\2\u0118\u0119\t\27\2\2\u0119\u011a\t\b\2\2\u011a\u011b\t\f\2\2"+
		"\u011b\u011c\t\27\2\2\u011c\u011d\t\t\2\2\u011d\u011e\t\b\2\2\u011e\u011f"+
		"\t\t\2\2\u011f\u0120\t\b\2\2\u0120\u0121\t\f\2\2\u0121\u0122\t\17\2\2"+
		"\u0122\u0123\t\7\2\2\u0123\u0124\t\b\2\2\u0124\u0125\t\f\2\2\u0125\u0126"+
		"\t\17\2\2\u0126\u0127\t\t\2\2\u0127\u0128\t\4\2\2\u0128\u0129\t\16\2\2"+
		"\u0129\u012a\t\f\2\2\u012a\u012b\t\17\2\2\u012b\u012c\t\7\2\2\u012c\u012d"+
		"\t\5\2\2\u012d>\3\2\2\2\u012e\u0132\t\33\2\2\u012f\u0131\t\34\2\2\u0130"+
		"\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133@\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0139\t\35\2\2\u0136\u0138"+
		"\n\3\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\t\35"+
		"\2\2\u013dB\3\2\2\2\u013e\u0140\4\62;\2\u013f\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142D\3\2\2\2\b\2LV"+
		"\u0132\u0139\u0141\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}