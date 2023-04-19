// Generated from /home/ubuntu_wsl/tec/last/compis/final/compiladores_proyecto/src/MyGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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

	public static class VarsContext extends ParserRuleContext {
		public Var_initContext var_init() {
			return getRuleContext(Var_initContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
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

	public static class Extra_varsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public Extra_varsContext extra_vars() {
			return getRuleContext(Extra_varsContext.class,0);
		}
		public Extra_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extra_vars; }
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

	public static class New_idContext extends ParserRuleContext {
		public Var_initContext var_init() {
			return getRuleContext(Var_initContext.class,0);
		}
		public New_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_id; }
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class BloqueContext extends ParserRuleContext {
		public Bloque_initContext bloque_init() {
			return getRuleContext(Bloque_initContext.class,0);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
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

	public static class Bloque_initContext extends ParserRuleContext {
		public Bloque_defContext bloque_def() {
			return getRuleContext(Bloque_defContext.class,0);
		}
		public Bloque_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_init; }
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
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

	public static class Cond_elseContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Cond_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_else; }
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

	public static class EscrituraContext extends ParserRuleContext {
		public Print_defContext print_def() {
			return getRuleContext(Print_defContext.class,0);
		}
		public EscrituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escritura; }
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

	public static class Expresion_condContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Expresion_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_cond; }
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

	public static class Exp_opContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Exp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_op; }
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

	public static class Termino_opContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Termino_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_op; }
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

	public static class Factor_opContext extends ParserRuleContext {
		public Factor_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_op; }
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

	public static class Var_cteContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public TerminalNode CTE_I() { return getToken(MyGrammarParser.CTE_I, 0); }
		public TerminalNode CTE_F() { return getToken(MyGrammarParser.CTE_F, 0); }
		public Var_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_cte; }
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << CTE_I) | (1L << CTE_F))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\5\6O\n\6\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\5\bX\n\b\3\t\3\t\5\t\\\n\t\3\n\3\n\3\n\3\13\3\13\3\13\5"+
		"\13d\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\5\16v\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0083\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008d\n"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0099\n\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00a3\n\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00ad\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00b6\n\30\3\31\3\31\3\31\5\31\u00bb\n\31\3\32\3\32\3\32\2"+
		"\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\4\3\2\b"+
		"\13\3\2\33\35\2\u00ba\2\64\3\2\2\2\4=\3\2\2\2\6?\3\2\2\2\bJ\3\2\2\2\n"+
		"N\3\2\2\2\fP\3\2\2\2\16W\3\2\2\2\20[\3\2\2\2\22]\3\2\2\2\24c\3\2\2\2\26"+
		"e\3\2\2\2\30j\3\2\2\2\32u\3\2\2\2\34w\3\2\2\2\36\u0082\3\2\2\2 \u008c"+
		"\3\2\2\2\"\u008e\3\2\2\2$\u0098\3\2\2\2&\u009a\3\2\2\2(\u00a2\3\2\2\2"+
		"*\u00a4\3\2\2\2,\u00ac\3\2\2\2.\u00b5\3\2\2\2\60\u00ba\3\2\2\2\62\u00bc"+
		"\3\2\2\2\64\65\7\3\2\2\65\66\7\33\2\2\66\67\7\4\2\2\678\5\4\3\289\5\16"+
		"\b\29\3\3\2\2\2:;\7\5\2\2;>\5\6\4\2<>\3\2\2\2=:\3\2\2\2=<\3\2\2\2>\5\3"+
		"\2\2\2?@\5\f\7\2@A\7\6\2\2AB\7\33\2\2BC\5\b\5\2CD\7\4\2\2DE\5\n\6\2E\7"+
		"\3\2\2\2FG\7\7\2\2GH\7\33\2\2HK\5\b\5\2IK\3\2\2\2JF\3\2\2\2JI\3\2\2\2"+
		"K\t\3\2\2\2LO\5\6\4\2MO\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\13\3\2\2\2PQ\t\2"+
		"\2\2Q\r\3\2\2\2RS\7\f\2\2ST\5\20\t\2TU\7\r\2\2UX\3\2\2\2VX\3\2\2\2WR\3"+
		"\2\2\2WV\3\2\2\2X\17\3\2\2\2Y\\\5\22\n\2Z\\\3\2\2\2[Y\3\2\2\2[Z\3\2\2"+
		"\2\\\21\3\2\2\2]^\5\24\13\2^_\5\20\t\2_\23\3\2\2\2`d\5\26\f\2ad\5\30\r"+
		"\2bd\5\34\17\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\25\3\2\2\2ef\7\33\2\2fg"+
		"\7\16\2\2gh\5\"\22\2hi\7\4\2\2i\27\3\2\2\2jk\7\17\2\2kl\7\20\2\2lm\5\""+
		"\22\2mn\7\21\2\2no\5\16\b\2op\5\32\16\2pq\7\4\2\2q\31\3\2\2\2rs\7\22\2"+
		"\2sv\5\16\b\2tv\3\2\2\2ur\3\2\2\2ut\3\2\2\2v\33\3\2\2\2wx\7\23\2\2xy\7"+
		"\20\2\2yz\5\36\20\2z{\7\21\2\2{|\7\4\2\2|\35\3\2\2\2}~\5\"\22\2~\177\5"+
		" \21\2\177\u0083\3\2\2\2\u0080\u0081\7 \2\2\u0081\u0083\5 \21\2\u0082"+
		"}\3\2\2\2\u0082\u0080\3\2\2\2\u0083\37\3\2\2\2\u0084\u0085\7\7\2\2\u0085"+
		"\u0086\5\"\22\2\u0086\u0087\5 \21\2\u0087\u008d\3\2\2\2\u0088\u0089\7"+
		"\7\2\2\u0089\u008a\7 \2\2\u008a\u008d\5 \21\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0084\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008b\3\2\2\2\u008d!\3\2\2\2"+
		"\u008e\u008f\5&\24\2\u008f\u0090\5$\23\2\u0090#\3\2\2\2\u0091\u0092\7"+
		"\24\2\2\u0092\u0099\5&\24\2\u0093\u0094\7\25\2\2\u0094\u0099\5&\24\2\u0095"+
		"\u0096\7\26\2\2\u0096\u0099\5&\24\2\u0097\u0099\3\2\2\2\u0098\u0091\3"+
		"\2\2\2\u0098\u0093\3\2\2\2\u0098\u0095\3\2\2\2\u0098\u0097\3\2\2\2\u0099"+
		"%\3\2\2\2\u009a\u009b\5*\26\2\u009b\u009c\5(\25\2\u009c\'\3\2\2\2\u009d"+
		"\u009e\7\27\2\2\u009e\u00a3\5&\24\2\u009f\u00a0\7\30\2\2\u00a0\u00a3\5"+
		"&\24\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3)\3\2\2\2\u00a4\u00a5\5.\30\2\u00a5\u00a6\5,\27\2"+
		"\u00a6+\3\2\2\2\u00a7\u00a8\7\31\2\2\u00a8\u00ad\5*\26\2\u00a9\u00aa\7"+
		"\32\2\2\u00aa\u00ad\5*\26\2\u00ab\u00ad\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad-\3\2\2\2\u00ae\u00af\7\20\2\2"+
		"\u00af\u00b0\5\"\22\2\u00b0\u00b1\7\21\2\2\u00b1\u00b6\3\2\2\2\u00b2\u00b3"+
		"\5\60\31\2\u00b3\u00b4\5\62\32\2\u00b4\u00b6\3\2\2\2\u00b5\u00ae\3\2\2"+
		"\2\u00b5\u00b2\3\2\2\2\u00b6/\3\2\2\2\u00b7\u00bb\7\27\2\2\u00b8\u00bb"+
		"\7\30\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2"+
		"\u00ba\u00b9\3\2\2\2\u00bb\61\3\2\2\2\u00bc\u00bd\t\3\2\2\u00bd\63\3\2"+
		"\2\2\20=JNW[cu\u0082\u008c\u0098\u00a2\u00ac\u00b5\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}