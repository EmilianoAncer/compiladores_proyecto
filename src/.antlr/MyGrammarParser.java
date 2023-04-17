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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, ID=23, CTE_I=24, CTE_F=25, 
		CTE_STRING=26, SPACES=27;
	public static final int
		RULE_programa = 0, RULE_vars = 1, RULE_var_init = 2, RULE_extra_vars = 3, 
		RULE_new_id = 4, RULE_tipo = 5, RULE_bloque = 6, RULE_bloque_def = 7, 
		RULE_estatuto = 8, RULE_asignacion = 9, RULE_condicion = 10, RULE_cond_else = 11, 
		RULE_escritura = 12, RULE_print_def = 13, RULE_print_extra = 14, RULE_expresion = 15, 
		RULE_expresion_cond = 16, RULE_exp = 17, RULE_exp_op = 18, RULE_termino = 19, 
		RULE_termino_op = 20, RULE_factor = 21, RULE_factor_op = 22, RULE_var_cte = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "vars", "var_init", "extra_vars", "new_id", "tipo", "bloque", 
			"bloque_def", "estatuto", "asignacion", "condicion", "cond_else", "escritura", 
			"print_def", "print_extra", "expresion", "expresion_cond", "exp", "exp_op", 
			"termino", "termino_op", "factor", "factor_op", "var_cte"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'var'", "':'", "','", "'int'", "'float'", 
			"'{'", "'}'", "'='", "'if'", "'('", "')'", "'else'", "'print'", "'>'", 
			"'<'", "'!='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "ID", 
			"CTE_I", "CTE_F", "CTE_STRING", "SPACES"
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
			setState(48);
			match(T__0);
			setState(49);
			match(ID);
			setState(50);
			match(T__1);
			setState(51);
			vars();
			setState(52);
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
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(T__2);
				setState(55);
				var_init();
				}
				break;
			case T__7:
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
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public Extra_varsContext extra_vars() {
			return getRuleContext(Extra_varsContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
			setState(59);
			match(ID);
			setState(60);
			extra_vars();
			setState(61);
			match(T__3);
			setState(62);
			tipo();
			setState(63);
			match(T__1);
			setState(64);
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
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__4);
				setState(67);
				match(ID);
				setState(68);
				extra_vars();
				}
				break;
			case T__3:
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				var_init();
				}
				break;
			case T__7:
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
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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
		public Bloque_defContext bloque_def() {
			return getRuleContext(Bloque_defContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__7);
			setState(79);
			bloque_def();
			setState(80);
			match(T__8);
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
		public Bloque_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_def; }
	}

	public final Bloque_defContext bloque_def() throws RecognitionException {
		Bloque_defContext _localctx = new Bloque_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bloque_def);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__14:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				estatuto();
				}
				break;
			case T__8:
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
		enterRule(_localctx, 16, RULE_estatuto);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				asignacion();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				condicion();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
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
		enterRule(_localctx, 18, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ID);
			setState(92);
			match(T__9);
			setState(93);
			expresion();
			setState(94);
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
		enterRule(_localctx, 20, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__10);
			setState(97);
			match(T__11);
			setState(98);
			expresion();
			setState(99);
			match(T__12);
			setState(100);
			bloque();
			setState(101);
			cond_else();
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
		enterRule(_localctx, 22, RULE_cond_else);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__13);
				setState(105);
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
		enterRule(_localctx, 24, RULE_escritura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__14);
			setState(110);
			match(T__11);
			setState(111);
			print_def();
			setState(112);
			match(T__12);
			setState(113);
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
		enterRule(_localctx, 26, RULE_print_def);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__18:
			case T__19:
			case ID:
			case CTE_I:
			case CTE_F:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				expresion();
				setState(116);
				print_extra();
				}
				break;
			case CTE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(CTE_STRING);
				setState(119);
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
		enterRule(_localctx, 28, RULE_print_extra);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(T__4);
				setState(123);
				expresion();
				setState(124);
				print_extra();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__4);
				setState(127);
				match(CTE_STRING);
				setState(128);
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
		enterRule(_localctx, 30, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			exp();
			setState(133);
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
		enterRule(_localctx, 32, RULE_expresion_cond);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__15);
				setState(136);
				exp();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(T__16);
				setState(138);
				exp();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(T__17);
				setState(140);
				exp();
				}
				break;
			case T__1:
			case T__4:
			case T__12:
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
		enterRule(_localctx, 34, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			termino();
			setState(145);
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
		enterRule(_localctx, 36, RULE_exp_op);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__18);
				setState(148);
				exp();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__19);
				setState(150);
				exp();
				}
				break;
			case T__1:
			case T__4:
			case T__12:
			case T__15:
			case T__16:
			case T__17:
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
		enterRule(_localctx, 38, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			factor();
			setState(155);
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
		enterRule(_localctx, 40, RULE_termino_op);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__20);
				setState(158);
				termino();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__21);
				setState(160);
				termino();
				}
				break;
			case T__1:
			case T__4:
			case T__12:
			case T__15:
			case T__16:
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
		enterRule(_localctx, 42, RULE_factor);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__11);
				setState(165);
				expresion();
				setState(166);
				match(T__12);
				}
				break;
			case T__18:
			case T__19:
			case ID:
			case CTE_I:
			case CTE_F:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				factor_op();
				setState(169);
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
		enterRule(_localctx, 44, RULE_factor_op);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__18);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(T__19);
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
		enterRule(_localctx, 46, RULE_var_cte);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\5\6M\n\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\5\tW\n\t\3\n\3\n\3\n\5\n\\\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\rn\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17{\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u0085\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0091\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u009b\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u00a5\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ae\n\27\3\30\3\30\3\30\5\30"+
		"\u00b3\n\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\4\3\2\b\t\3\2\31\33\2\u00b2\2\62\3\2\2\2\4;\3\2\2\2"+
		"\6=\3\2\2\2\bH\3\2\2\2\nL\3\2\2\2\fN\3\2\2\2\16P\3\2\2\2\20V\3\2\2\2\22"+
		"[\3\2\2\2\24]\3\2\2\2\26b\3\2\2\2\30m\3\2\2\2\32o\3\2\2\2\34z\3\2\2\2"+
		"\36\u0084\3\2\2\2 \u0086\3\2\2\2\"\u0090\3\2\2\2$\u0092\3\2\2\2&\u009a"+
		"\3\2\2\2(\u009c\3\2\2\2*\u00a4\3\2\2\2,\u00ad\3\2\2\2.\u00b2\3\2\2\2\60"+
		"\u00b4\3\2\2\2\62\63\7\3\2\2\63\64\7\31\2\2\64\65\7\4\2\2\65\66\5\4\3"+
		"\2\66\67\5\16\b\2\67\3\3\2\2\289\7\5\2\29<\5\6\4\2:<\3\2\2\2;8\3\2\2\2"+
		";:\3\2\2\2<\5\3\2\2\2=>\7\31\2\2>?\5\b\5\2?@\7\6\2\2@A\5\f\7\2AB\7\4\2"+
		"\2BC\5\n\6\2C\7\3\2\2\2DE\7\7\2\2EF\7\31\2\2FI\5\b\5\2GI\3\2\2\2HD\3\2"+
		"\2\2HG\3\2\2\2I\t\3\2\2\2JM\5\6\4\2KM\3\2\2\2LJ\3\2\2\2LK\3\2\2\2M\13"+
		"\3\2\2\2NO\t\2\2\2O\r\3\2\2\2PQ\7\n\2\2QR\5\20\t\2RS\7\13\2\2S\17\3\2"+
		"\2\2TW\5\22\n\2UW\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\21\3\2\2\2X\\\5\24\13\2"+
		"Y\\\5\26\f\2Z\\\5\32\16\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\23\3\2\2\2]"+
		"^\7\31\2\2^_\7\f\2\2_`\5 \21\2`a\7\4\2\2a\25\3\2\2\2bc\7\r\2\2cd\7\16"+
		"\2\2de\5 \21\2ef\7\17\2\2fg\5\16\b\2gh\5\30\r\2hi\7\4\2\2i\27\3\2\2\2"+
		"jk\7\20\2\2kn\5\16\b\2ln\3\2\2\2mj\3\2\2\2ml\3\2\2\2n\31\3\2\2\2op\7\21"+
		"\2\2pq\7\16\2\2qr\5\34\17\2rs\7\17\2\2st\7\4\2\2t\33\3\2\2\2uv\5 \21\2"+
		"vw\5\36\20\2w{\3\2\2\2xy\7\34\2\2y{\5\36\20\2zu\3\2\2\2zx\3\2\2\2{\35"+
		"\3\2\2\2|}\7\7\2\2}~\5 \21\2~\177\5\36\20\2\177\u0085\3\2\2\2\u0080\u0081"+
		"\7\7\2\2\u0081\u0082\7\34\2\2\u0082\u0085\5\36\20\2\u0083\u0085\3\2\2"+
		"\2\u0084|\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0083\3\2\2\2\u0085\37\3\2"+
		"\2\2\u0086\u0087\5$\23\2\u0087\u0088\5\"\22\2\u0088!\3\2\2\2\u0089\u008a"+
		"\7\22\2\2\u008a\u0091\5$\23\2\u008b\u008c\7\23\2\2\u008c\u0091\5$\23\2"+
		"\u008d\u008e\7\24\2\2\u008e\u0091\5$\23\2\u008f\u0091\3\2\2\2\u0090\u0089"+
		"\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008d\3\2\2\2\u0090\u008f\3\2\2\2\u0091"+
		"#\3\2\2\2\u0092\u0093\5(\25\2\u0093\u0094\5&\24\2\u0094%\3\2\2\2\u0095"+
		"\u0096\7\25\2\2\u0096\u009b\5$\23\2\u0097\u0098\7\26\2\2\u0098\u009b\5"+
		"$\23\2\u0099\u009b\3\2\2\2\u009a\u0095\3\2\2\2\u009a\u0097\3\2\2\2\u009a"+
		"\u0099\3\2\2\2\u009b\'\3\2\2\2\u009c\u009d\5,\27\2\u009d\u009e\5*\26\2"+
		"\u009e)\3\2\2\2\u009f\u00a0\7\27\2\2\u00a0\u00a5\5(\25\2\u00a1\u00a2\7"+
		"\30\2\2\u00a2\u00a5\5(\25\2\u00a3\u00a5\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4"+
		"\u00a1\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5+\3\2\2\2\u00a6\u00a7\7\16\2\2"+
		"\u00a7\u00a8\5 \21\2\u00a8\u00a9\7\17\2\2\u00a9\u00ae\3\2\2\2\u00aa\u00ab"+
		"\5.\30\2\u00ab\u00ac\5\60\31\2\u00ac\u00ae\3\2\2\2\u00ad\u00a6\3\2\2\2"+
		"\u00ad\u00aa\3\2\2\2\u00ae-\3\2\2\2\u00af\u00b3\7\25\2\2\u00b0\u00b3\7"+
		"\26\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3/\3\2\2\2\u00b4\u00b5\t\3\2\2\u00b5\61\3\2\2\2\17"+
		";HLV[mz\u0084\u0090\u009a\u00a4\u00ad\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}