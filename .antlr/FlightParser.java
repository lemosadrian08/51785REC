// Generated from c:/Users/lemos/51785REC/Flight.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FlightParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, IATA=8, LETRA=9, 
		DIGITO=10, WS=11;
	public static final int
		RULE_prog = 0, RULE_flight = 1, RULE_codigo_vuelo = 2, RULE_hora = 3, 
		RULE_estado = 4, RULE_terminal = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "flight", "codigo_vuelo", "hora", "estado", "terminal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "','", "'Gate:'", "':'", "'ON_TIME'", "'DELAYED'", "'CANCELLED'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "IATA", "LETRA", "DIGITO", 
			"WS"
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
	public String getGrammarFileName() { return "Flight.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlightParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public FlightContext flight() {
			return getRuleContext(FlightContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FlightParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			flight();
			setState(13);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FlightContext extends ParserRuleContext {
		public Codigo_vueloContext codigo_vuelo() {
			return getRuleContext(Codigo_vueloContext.class,0);
		}
		public List<TerminalNode> IATA() { return getTokens(FlightParser.IATA); }
		public TerminalNode IATA(int i) {
			return getToken(FlightParser.IATA, i);
		}
		public HoraContext hora() {
			return getRuleContext(HoraContext.class,0);
		}
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public FlightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterFlight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitFlight(this);
		}
	}

	public final FlightContext flight() throws RecognitionException {
		FlightContext _localctx = new FlightContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_flight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			codigo_vuelo();
			setState(16);
			match(IATA);
			setState(17);
			match(T__0);
			setState(18);
			match(IATA);
			setState(19);
			hora();
			setState(20);
			match(T__1);
			setState(21);
			estado();
			setState(22);
			match(T__1);
			setState(23);
			match(T__2);
			setState(24);
			terminal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Codigo_vueloContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(FlightParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(FlightParser.LETRA, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(FlightParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(FlightParser.DIGITO, i);
		}
		public Codigo_vueloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo_vuelo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterCodigo_vuelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitCodigo_vuelo(this);
		}
	}

	public final Codigo_vueloContext codigo_vuelo() throws RecognitionException {
		Codigo_vueloContext _localctx = new Codigo_vueloContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_codigo_vuelo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(LETRA);
			setState(27);
			match(LETRA);
			setState(28);
			match(DIGITO);
			setState(29);
			match(DIGITO);
			setState(30);
			match(DIGITO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HoraContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(FlightParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(FlightParser.DIGITO, i);
		}
		public HoraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hora; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterHora(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitHora(this);
		}
	}

	public final HoraContext hora() throws RecognitionException {
		HoraContext _localctx = new HoraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hora);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(DIGITO);
			setState(33);
			match(DIGITO);
			setState(34);
			match(T__3);
			setState(35);
			match(DIGITO);
			setState(36);
			match(DIGITO);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EstadoContext extends ParserRuleContext {
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterEstado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitEstado(this);
		}
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 224L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminalContext extends ParserRuleContext {
		public TerminalNode LETRA() { return getToken(FlightParser.LETRA, 0); }
		public List<TerminalNode> DIGITO() { return getTokens(FlightParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(FlightParser.DIGITO, i);
		}
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlightListener ) ((FlightListener)listener).exitTerminal(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_terminal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(LETRA);
			setState(41);
			match(DIGITO);
			setState(42);
			match(DIGITO);
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
		"\u0004\u0001\u000b-\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006"+
		"\u0000\u0002\u0004\u0006\b\n\u0000\u0001\u0001\u0000\u0005\u0007&\u0000"+
		"\f\u0001\u0000\u0000\u0000\u0002\u000f\u0001\u0000\u0000\u0000\u0004\u001a"+
		"\u0001\u0000\u0000\u0000\u0006 \u0001\u0000\u0000\u0000\b&\u0001\u0000"+
		"\u0000\u0000\n(\u0001\u0000\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r"+
		"\u000e\u0005\u0000\u0000\u0001\u000e\u0001\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0003\u0004\u0002\u0000\u0010\u0011\u0005\b\u0000\u0000\u0011\u0012"+
		"\u0005\u0001\u0000\u0000\u0012\u0013\u0005\b\u0000\u0000\u0013\u0014\u0003"+
		"\u0006\u0003\u0000\u0014\u0015\u0005\u0002\u0000\u0000\u0015\u0016\u0003"+
		"\b\u0004\u0000\u0016\u0017\u0005\u0002\u0000\u0000\u0017\u0018\u0005\u0003"+
		"\u0000\u0000\u0018\u0019\u0003\n\u0005\u0000\u0019\u0003\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\t\u0000\u0000\u001b\u001c\u0005\t\u0000\u0000"+
		"\u001c\u001d\u0005\n\u0000\u0000\u001d\u001e\u0005\n\u0000\u0000\u001e"+
		"\u001f\u0005\n\u0000\u0000\u001f\u0005\u0001\u0000\u0000\u0000 !\u0005"+
		"\n\u0000\u0000!\"\u0005\n\u0000\u0000\"#\u0005\u0004\u0000\u0000#$\u0005"+
		"\n\u0000\u0000$%\u0005\n\u0000\u0000%\u0007\u0001\u0000\u0000\u0000&\'"+
		"\u0007\u0000\u0000\u0000\'\t\u0001\u0000\u0000\u0000()\u0005\t\u0000\u0000"+
		")*\u0005\n\u0000\u0000*+\u0005\n\u0000\u0000+\u000b\u0001\u0000\u0000"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}