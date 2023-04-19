// Generated from MyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ID=25, CTE_I=26, CTE_F=27, CTE_C=28, CTE_B=29, CTE_STRING=30, SPACES=31;
	public static final int
		RULE_programa = 0, RULE_vars = 1, RULE_var_init = 2, RULE_extra_vars = 3, 
		RULE_new_id = 4, RULE_tipo = 5, RULE_bloque = 6, RULE_bloque_init = 7, 
		RULE_bloque_def = 8, RULE_estatuto = 9, RULE_asignacion = 10, RULE_condicion = 11, 
		RULE_cond_else = 12, RULE_escritura = 13, RULE_print_def = 14, RULE_print_extra = 15, 
		RULE_expresion = 16, RULE_expresion_cond = 17, RULE_exp = 18, RULE_exp_op = 19, 
		RULE_termino = 20, RULE_termino_op = 21, RULE_factor = 22, RULE_factor_op = 23, 
		RULE_var_cte = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "vars", "var_init", "extra_vars", "new_id", "tipo", "bloque", 
			"bloque_init", "bloque_def", "estatuto", "asignacion", "condicion", "cond_else", 
			"escritura", "print_def", "print_extra", "expresion", "expresion_cond", 
			"exp", "exp_op", "termino", "termino_op", "factor", "factor_op", "var_cte"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'var'", "':'", "','", "'int'", "'float'", 
			"'char'", "'bool'", "'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", 
			"'print'", "'>'", "'<'", "'!='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "CTE_I", "CTE_F", "CTE_C", "CTE_B", "CTE_STRING", "SPACES"
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
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
			setState(51);
			match(ID);
			setState(52);
			match(T__1);
			setState(53);
			vars();
			setState(54);
			bloque();
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
	public static class VarsContext extends ParserRuleContext {
		public Var_initContext var_init() {
			return getRuleContext(Var_initContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vars);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__2);
				setState(57);
				var_init();
				}
				break;
			case EOF:
			case T__9:
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_initContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public Extra_varsContext extra_vars() {
			return getRuleContext(Extra_varsContext.class,0);
		}
		public New_idContext new_id() {
			return getRuleContext(New_idContext.class,0);
		}
		public Var_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVar_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVar_init(this);
		}
	}

	public final Var_initContext var_init() throws RecognitionException {
		Var_initContext _localctx = new Var_initContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			tipo();
			setState(62);
			match(T__3);
			setState(63);
			match(ID);
			setState(64);
			extra_vars();
			setState(65);
			match(T__1);
			setState(66);
			new_id();
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
	public static class Extra_varsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public Extra_varsContext extra_vars() {
			return getRuleContext(Extra_varsContext.class,0);
		}
		public Extra_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extra_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterExtra_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitExtra_vars(this);
		}
	}

	public final Extra_varsContext extra_vars() throws RecognitionException {
		Extra_varsContext _localctx = new Extra_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_extra_vars);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__4);
				setState(69);
				match(ID);
				setState(70);
				extra_vars();
				}
				break;
			case T__1:
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

	@SuppressWarnings("CheckReturnValue")
	public static class New_idContext extends ParserRuleContext {
		public Var_initContext var_init() {
			return getRuleContext(Var_initContext.class,0);
		}
		public New_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNew_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNew_id(this);
		}
	}

	public final New_idContext new_id() throws RecognitionException {
		New_idContext _localctx = new New_idContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_new_id);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				var_init();
				}
				break;
			case EOF:
			case T__9:
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
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
	public static class BloqueContext extends ParserRuleContext {
		public Bloque_initContext bloque_init() {
			return getRuleContext(Bloque_initContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBloque(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bloque);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__9);
				setState(81);
				bloque_init();
				setState(82);
				match(T__10);
				}
				break;
			case EOF:
			case T__1:
			case T__15:
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_initContext extends ParserRuleContext {
		public Bloque_defContext bloque_def() {
			return getRuleContext(Bloque_defContext.class,0);
		}
		public Bloque_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBloque_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBloque_init(this);
		}
	}

	public final Bloque_initContext bloque_init() throws RecognitionException {
		Bloque_initContext _localctx = new Bloque_initContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloque_init);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__16:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				bloque_def();
				}
				break;
			case T__10:
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

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_defContext extends ParserRuleContext {
		public EstatutoContext estatuto() {
			return getRuleContext(EstatutoContext.class,0);
		}
		public Bloque_initContext bloque_init() {
			return getRuleContext(Bloque_initContext.class,0);
		}
		public Bloque_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterBloque_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitBloque_def(this);
		}
	}

	public final Bloque_defContext bloque_def() throws RecognitionException {
		Bloque_defContext _localctx = new Bloque_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bloque_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			estatuto();
			setState(92);
			bloque_init();
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
	public static class EstatutoContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public EscrituraContext escritura() {
			return getRuleContext(EscrituraContext.class,0);
		}
		public EstatutoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estatuto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEstatuto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEstatuto(this);
		}
	}

	public final EstatutoContext estatuto() throws RecognitionException {
		EstatutoContext _localctx = new EstatutoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_estatuto);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				asignacion();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				condicion();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				escritura();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(ID);
			setState(100);
			match(T__11);
			setState(101);
			expresion();
			setState(102);
			match(T__1);
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
	public static class CondicionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Cond_elseContext cond_else() {
			return getRuleContext(Cond_elseContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__12);
			setState(105);
			match(T__13);
			setState(106);
			expresion();
			setState(107);
			match(T__14);
			setState(108);
			bloque();
			setState(109);
			cond_else();
			setState(110);
			match(T__1);
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
	public static class Cond_elseContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Cond_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCond_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCond_else(this);
		}
	}

	public final Cond_elseContext cond_else() throws RecognitionException {
		Cond_elseContext _localctx = new Cond_elseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cond_else);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__15);
				setState(113);
				bloque();
				}
				break;
			case T__1:
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscrituraContext extends ParserRuleContext {
		public Print_defContext print_def() {
			return getRuleContext(Print_defContext.class,0);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterEscritura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitEscritura(this);
		}
	}

	public final EscrituraContext escritura() throws RecognitionException {
		EscrituraContext _localctx = new EscrituraContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_escritura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__16);
			setState(118);
			match(T__13);
			setState(119);
			print_def();
			setState(120);
			match(T__14);
			setState(121);
			match(T__1);
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
	public static class Print_defContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Print_extraContext print_extra() {
			return getRuleContext(Print_extraContext.class,0);
		}
		public TerminalNode CTE_STRING() { return getToken(MyGrammarParser.CTE_STRING, 0); }
		public Print_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrint_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrint_def(this);
		}
	}

	public final Print_defContext print_def() throws RecognitionException {
		Print_defContext _localctx = new Print_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print_def);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__20:
			case T__21:
			case ID:
			case CTE_I:
			case CTE_F:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				expresion();
				setState(124);
				print_extra();
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(CTE_STRING);
				setState(127);
				print_extra();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Print_extraContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Print_extraContext print_extra() {
			return getRuleContext(Print_extraContext.class,0);
		}
		public TerminalNode CTE_STRING() { return getToken(MyGrammarParser.CTE_STRING, 0); }
		public Print_extraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_extra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrint_extra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrint_extra(this);
		}
	}

	public final Print_extraContext print_extra() throws RecognitionException {
		Print_extraContext _localctx = new Print_extraContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_print_extra);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__4);
				setState(131);
				expresion();
				setState(132);
				print_extra();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__4);
				setState(135);
				match(CTE_STRING);
				setState(136);
				print_extra();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expresion_condContext expresion_cond() {
			return getRuleContext(Expresion_condContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			exp();
			setState(141);
			expresion_cond();
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
	public static class Expresion_condContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expresion_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterExpresion_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitExpresion_cond(this);
		}
	}

	public final Expresion_condContext expresion_cond() throws RecognitionException {
		Expresion_condContext _localctx = new Expresion_condContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expresion_cond);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__17);
				setState(144);
				exp();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__18);
				setState(146);
				exp();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__19);
				setState(148);
				exp();
				}
				break;
			case T__1:
			case T__4:
			case T__14:
				enterOuterAlt(_localctx, 4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Exp_opContext exp_op() {
			return getRuleContext(Exp_opContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			termino();
			setState(153);
			exp_op();
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
	public static class Exp_opContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterExp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitExp_op(this);
		}
	}

	public final Exp_opContext exp_op() throws RecognitionException {
		Exp_opContext _localctx = new Exp_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exp_op);
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__20);
				setState(156);
				exp();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__21);
				setState(158);
				exp();
				}
				break;
			case T__1:
			case T__4:
			case T__14:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Termino_opContext termino_op() {
			return getRuleContext(Termino_opContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			factor();
			setState(163);
			termino_op();
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
	public static class Termino_opContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Termino_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterTermino_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitTermino_op(this);
		}
	}

	public final Termino_opContext termino_op() throws RecognitionException {
		Termino_opContext _localctx = new Termino_opContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_termino_op);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(T__22);
				setState(166);
				termino();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__23);
				setState(168);
				termino();
				}
				break;
			case T__1:
			case T__4:
			case T__14:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Factor_opContext factor_op() {
			return getRuleContext(Factor_opContext.class,0);
		}
		public Var_cteContext var_cte() {
			return getRuleContext(Var_cteContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(T__13);
				setState(173);
				expresion();
				setState(174);
				match(T__14);
				}
				break;
			case T__20:
			case T__21:
			case ID:
			case CTE_I:
			case CTE_F:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				factor_op();
				setState(177);
				var_cte();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_opContext extends ParserRuleContext {
		public Factor_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterFactor_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitFactor_op(this);
		}
	}

	public final Factor_opContext factor_op() throws RecognitionException {
		Factor_opContext _localctx = new Factor_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor_op);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__20);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__21);
				}
				break;
			case ID:
			case CTE_I:
			case CTE_F:
				enterOuterAlt(_localctx, 3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_cteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode CTE_I() { return getToken(MyGrammarParser.CTE_I, 0); }
		public TerminalNode CTE_F() { return getToken(MyGrammarParser.CTE_F, 0); }
		public Var_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterVar_cte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitVar_cte(this);
		}
	}

	public final Var_cteContext var_cte() throws RecognitionException {
		Var_cteContext _localctx = new Var_cteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_var_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u00bd\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004M\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006V\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007Z\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\tb\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003"+
		"\ft\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0081\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u008b\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0097\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u00a1\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00ab\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u00b4\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u00b9\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.0\u0000\u0002\u0001\u0000\u0006\t\u0001\u0000\u0019"+
		"\u001b\u00b8\u00002\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000\u0000"+
		"\u0004=\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bL\u0001"+
		"\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000"+
		"\u000eY\u0001\u0000\u0000\u0000\u0010[\u0001\u0000\u0000\u0000\u0012a"+
		"\u0001\u0000\u0000\u0000\u0014c\u0001\u0000\u0000\u0000\u0016h\u0001\u0000"+
		"\u0000\u0000\u0018s\u0001\u0000\u0000\u0000\u001au\u0001\u0000\u0000\u0000"+
		"\u001c\u0080\u0001\u0000\u0000\u0000\u001e\u008a\u0001\u0000\u0000\u0000"+
		" \u008c\u0001\u0000\u0000\u0000\"\u0096\u0001\u0000\u0000\u0000$\u0098"+
		"\u0001\u0000\u0000\u0000&\u00a0\u0001\u0000\u0000\u0000(\u00a2\u0001\u0000"+
		"\u0000\u0000*\u00aa\u0001\u0000\u0000\u0000,\u00b3\u0001\u0000\u0000\u0000"+
		".\u00b8\u0001\u0000\u0000\u00000\u00ba\u0001\u0000\u0000\u000023\u0005"+
		"\u0001\u0000\u000034\u0005\u0019\u0000\u000045\u0005\u0002\u0000\u0000"+
		"56\u0003\u0002\u0001\u000067\u0003\f\u0006\u00007\u0001\u0001\u0000\u0000"+
		"\u000089\u0005\u0003\u0000\u00009<\u0003\u0004\u0002\u0000:<\u0001\u0000"+
		"\u0000\u0000;8\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0003"+
		"\u0001\u0000\u0000\u0000=>\u0003\n\u0005\u0000>?\u0005\u0004\u0000\u0000"+
		"?@\u0005\u0019\u0000\u0000@A\u0003\u0006\u0003\u0000AB\u0005\u0002\u0000"+
		"\u0000BC\u0003\b\u0004\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0005\u0005"+
		"\u0000\u0000EF\u0005\u0019\u0000\u0000FI\u0003\u0006\u0003\u0000GI\u0001"+
		"\u0000\u0000\u0000HD\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000"+
		"I\u0007\u0001\u0000\u0000\u0000JM\u0003\u0004\u0002\u0000KM\u0001\u0000"+
		"\u0000\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000M\t\u0001"+
		"\u0000\u0000\u0000NO\u0007\u0000\u0000\u0000O\u000b\u0001\u0000\u0000"+
		"\u0000PQ\u0005\n\u0000\u0000QR\u0003\u000e\u0007\u0000RS\u0005\u000b\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000\u0000UP\u0001\u0000"+
		"\u0000\u0000UT\u0001\u0000\u0000\u0000V\r\u0001\u0000\u0000\u0000WZ\u0003"+
		"\u0010\b\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000Z\u000f\u0001\u0000\u0000\u0000[\\\u0003\u0012\t\u0000"+
		"\\]\u0003\u000e\u0007\u0000]\u0011\u0001\u0000\u0000\u0000^b\u0003\u0014"+
		"\n\u0000_b\u0003\u0016\u000b\u0000`b\u0003\u001a\r\u0000a^\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000b\u0013"+
		"\u0001\u0000\u0000\u0000cd\u0005\u0019\u0000\u0000de\u0005\f\u0000\u0000"+
		"ef\u0003 \u0010\u0000fg\u0005\u0002\u0000\u0000g\u0015\u0001\u0000\u0000"+
		"\u0000hi\u0005\r\u0000\u0000ij\u0005\u000e\u0000\u0000jk\u0003 \u0010"+
		"\u0000kl\u0005\u000f\u0000\u0000lm\u0003\f\u0006\u0000mn\u0003\u0018\f"+
		"\u0000no\u0005\u0002\u0000\u0000o\u0017\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0010\u0000\u0000qt\u0003\f\u0006\u0000rt\u0001\u0000\u0000\u0000sp\u0001"+
		"\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000t\u0019\u0001\u0000\u0000"+
		"\u0000uv\u0005\u0011\u0000\u0000vw\u0005\u000e\u0000\u0000wx\u0003\u001c"+
		"\u000e\u0000xy\u0005\u000f\u0000\u0000yz\u0005\u0002\u0000\u0000z\u001b"+
		"\u0001\u0000\u0000\u0000{|\u0003 \u0010\u0000|}\u0003\u001e\u000f\u0000"+
		"}\u0081\u0001\u0000\u0000\u0000~\u007f\u0005\u001e\u0000\u0000\u007f\u0081"+
		"\u0003\u001e\u000f\u0000\u0080{\u0001\u0000\u0000\u0000\u0080~\u0001\u0000"+
		"\u0000\u0000\u0081\u001d\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u0005"+
		"\u0000\u0000\u0083\u0084\u0003 \u0010\u0000\u0084\u0085\u0003\u001e\u000f"+
		"\u0000\u0085\u008b\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u0005\u0000"+
		"\u0000\u0087\u0088\u0005\u001e\u0000\u0000\u0088\u008b\u0003\u001e\u000f"+
		"\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0082\u0001\u0000\u0000"+
		"\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008a\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u001f\u0001\u0000\u0000\u0000\u008c\u008d\u0003$\u0012\u0000"+
		"\u008d\u008e\u0003\"\u0011\u0000\u008e!\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0012\u0000\u0000\u0090\u0097\u0003$\u0012\u0000\u0091\u0092"+
		"\u0005\u0013\u0000\u0000\u0092\u0097\u0003$\u0012\u0000\u0093\u0094\u0005"+
		"\u0014\u0000\u0000\u0094\u0097\u0003$\u0012\u0000\u0095\u0097\u0001\u0000"+
		"\u0000\u0000\u0096\u008f\u0001\u0000\u0000\u0000\u0096\u0091\u0001\u0000"+
		"\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000"+
		"\u0000\u0000\u0097#\u0001\u0000\u0000\u0000\u0098\u0099\u0003(\u0014\u0000"+
		"\u0099\u009a\u0003&\u0013\u0000\u009a%\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0005\u0015\u0000\u0000\u009c\u00a1\u0003$\u0012\u0000\u009d\u009e\u0005"+
		"\u0016\u0000\u0000\u009e\u00a1\u0003$\u0012\u0000\u009f\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a0\u009b\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1\'\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0003,\u0016\u0000\u00a3\u00a4\u0003*\u0015\u0000\u00a4"+
		")\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0017\u0000\u0000\u00a6\u00ab"+
		"\u0003(\u0014\u0000\u00a7\u00a8\u0005\u0018\u0000\u0000\u00a8\u00ab\u0003"+
		"(\u0014\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a5\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab+\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u000e\u0000"+
		"\u0000\u00ad\u00ae\u0003 \u0010\u0000\u00ae\u00af\u0005\u000f\u0000\u0000"+
		"\u00af\u00b4\u0001\u0000\u0000\u0000\u00b0\u00b1\u0003.\u0017\u0000\u00b1"+
		"\u00b2\u00030\u0018\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00ac"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b4-\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b9\u0005\u0015\u0000\u0000\u00b6\u00b9\u0005"+
		"\u0016\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9/\u0001\u0000\u0000\u0000\u00ba\u00bb\u0007\u0001"+
		"\u0000\u0000\u00bb1\u0001\u0000\u0000\u0000\u000e;HLUYas\u0080\u008a\u0096"+
		"\u00a0\u00aa\u00b3\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}