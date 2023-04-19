// Generated from MyGrammar.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MyGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MyGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(MyGrammarParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(MyGrammarParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#var_init}.
	 * @param ctx the parse tree
	 */
	void enterVar_init(MyGrammarParser.Var_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#var_init}.
	 * @param ctx the parse tree
	 */
	void exitVar_init(MyGrammarParser.Var_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#extra_vars}.
	 * @param ctx the parse tree
	 */
	void enterExtra_vars(MyGrammarParser.Extra_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#extra_vars}.
	 * @param ctx the parse tree
	 */
	void exitExtra_vars(MyGrammarParser.Extra_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#new_id}.
	 * @param ctx the parse tree
	 */
	void enterNew_id(MyGrammarParser.New_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#new_id}.
	 * @param ctx the parse tree
	 */
	void exitNew_id(MyGrammarParser.New_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(MyGrammarParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(MyGrammarParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(MyGrammarParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(MyGrammarParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#bloque_init}.
	 * @param ctx the parse tree
	 */
	void enterBloque_init(MyGrammarParser.Bloque_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#bloque_init}.
	 * @param ctx the parse tree
	 */
	void exitBloque_init(MyGrammarParser.Bloque_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#bloque_def}.
	 * @param ctx the parse tree
	 */
	void enterBloque_def(MyGrammarParser.Bloque_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#bloque_def}.
	 * @param ctx the parse tree
	 */
	void exitBloque_def(MyGrammarParser.Bloque_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#estatuto}.
	 * @param ctx the parse tree
	 */
	void enterEstatuto(MyGrammarParser.EstatutoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#estatuto}.
	 * @param ctx the parse tree
	 */
	void exitEstatuto(MyGrammarParser.EstatutoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MyGrammarParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MyGrammarParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(MyGrammarParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(MyGrammarParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#cond_else}.
	 * @param ctx the parse tree
	 */
	void enterCond_else(MyGrammarParser.Cond_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#cond_else}.
	 * @param ctx the parse tree
	 */
	void exitCond_else(MyGrammarParser.Cond_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#escritura}.
	 * @param ctx the parse tree
	 */
	void enterEscritura(MyGrammarParser.EscrituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#escritura}.
	 * @param ctx the parse tree
	 */
	void exitEscritura(MyGrammarParser.EscrituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#print_def}.
	 * @param ctx the parse tree
	 */
	void enterPrint_def(MyGrammarParser.Print_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#print_def}.
	 * @param ctx the parse tree
	 */
	void exitPrint_def(MyGrammarParser.Print_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#print_extra}.
	 * @param ctx the parse tree
	 */
	void enterPrint_extra(MyGrammarParser.Print_extraContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#print_extra}.
	 * @param ctx the parse tree
	 */
	void exitPrint_extra(MyGrammarParser.Print_extraContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(MyGrammarParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(MyGrammarParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#expresion_cond}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_cond(MyGrammarParser.Expresion_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#expresion_cond}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_cond(MyGrammarParser.Expresion_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(MyGrammarParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(MyGrammarParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#exp_op}.
	 * @param ctx the parse tree
	 */
	void enterExp_op(MyGrammarParser.Exp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#exp_op}.
	 * @param ctx the parse tree
	 */
	void exitExp_op(MyGrammarParser.Exp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(MyGrammarParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(MyGrammarParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#termino_op}.
	 * @param ctx the parse tree
	 */
	void enterTermino_op(MyGrammarParser.Termino_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#termino_op}.
	 * @param ctx the parse tree
	 */
	void exitTermino_op(MyGrammarParser.Termino_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MyGrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MyGrammarParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void enterFactor_op(MyGrammarParser.Factor_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#factor_op}.
	 * @param ctx the parse tree
	 */
	void exitFactor_op(MyGrammarParser.Factor_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#var_cte}.
	 * @param ctx the parse tree
	 */
	void enterVar_cte(MyGrammarParser.Var_cteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#var_cte}.
	 * @param ctx the parse tree
	 */
	void exitVar_cte(MyGrammarParser.Var_cteContext ctx);
}