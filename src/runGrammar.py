from antlr4 import *
from antlr.MyGrammarLexer import MyGrammarLexer
from antlr.MyGrammarParser import MyGrammarParser
from antlr.MyGrammarListener import MyGrammarListener


class MyListener(MyGrammarListener):

    # Enter a parse tree produced by MyGrammarParser#programa.
    def enterPrograma(self, ctx: MyGrammarParser.ProgramaContext):
        program_id = ctx.ID().getText()
        print(f"Program ID: {program_id}")
        ctx.context = 'global'
        ctx.whichFunc = 'main'

    # Exit a parse tree produced by MyGrammarParser#programa.
    def exitPrograma(self, ctx: MyGrammarParser.ProgramaContext):
        pass

        # Enter a parse tree produced by MyGrammarParser#func.
    def enterFunc(self, ctx: MyGrammarParser.FuncContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#func.
    def exitFunc(self, ctx: MyGrammarParser.FuncContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#func_init.
    def enterFunc_init(self, ctx: MyGrammarParser.Func_initContext):
        ctx.context = 'func'
        func_type = ctx.func_tipo().getText()
        func_name = ctx.ID().getText()
        ctx.whichFunc = func_name
        func[func_name] = {}
        func[func_name]['type'] = func_type
        func[func_name]['var'] = {}

    # Exit a parse tree produced by MyGrammarParser#func_init.
    def exitFunc_init(self, ctx: MyGrammarParser.Func_initContext):
        ctx.inFunc = 'global'

    # Enter a parse tree produced by MyGrammarParser#extra_func.
    def enterExtra_func(self, ctx: MyGrammarParser.Extra_funcContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#extra_func.
    def exitExtra_func(self, ctx: MyGrammarParser.Extra_funcContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#parameters.
    def enterParameters(self, ctx: MyGrammarParser.ParametersContext):
        if ctx.tipo():
            type = ctx.tipo().getText()
            id = ctx.ID().getText()
            func_name = ctx.parentCtx.whichFunc
            func[func_name]['var'][id] = {}
            func[func_name]['var'][id]['type'] = type
            ctx.whichFunc = ctx.parentCtx.whichFunc

    # Exit a parse tree produced by MyGrammarParser#parameters.
    def exitParameters(self, ctx: MyGrammarParser.ParametersContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#extra_parameter.
    def enterExtra_parameter(self, ctx: MyGrammarParser.Extra_parameterContext):
        if ctx.tipo():
            type = ctx.tipo().getText()
            id = ctx.ID().getText()
            func_name = ctx.parentCtx.whichFunc
            func[func_name]['var'][id] = {}
            func[func_name]['var'][id]['type'] = type
            ctx.whichFunc = ctx.parentCtx.whichFunc
        pass

    # Exit a parse tree produced by MyGrammarParser#extra_parameter.
    def exitExtra_parameter(self, ctx: MyGrammarParser.Extra_parameterContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#func_tipo.
    def enterFunc_tipo(self, ctx: MyGrammarParser.Func_tipoContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#func_tipo.
    def exitFunc_tipo(self, ctx: MyGrammarParser.Func_tipoContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#var.
    def enterVar(self, ctx: MyGrammarParser.VarContext):
        ctx.context = ctx.parentCtx.context
        ctx.whichFunc = ctx.parentCtx.whichFunc
        pass

    # Exit a parse tree produced by MyGrammarParser#var.
    def exitVar(self, ctx: MyGrammarParser.VarContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#var_init.
    def enterVar_init(self, ctx: MyGrammarParser.Var_initContext):
        # TODO add a check if var was initialized in another type remeber to do the same in extra
        ctx.context = ctx.parentCtx.context
        if ctx.parentCtx.context == 'global':
            type = ctx.tipo().getText()
            var_ID = ctx.ID().getText()
            var[var_ID] = {}
            var[var_ID]['type'] = type
            ctx.whichFunc = ctx.parentCtx.whichFunc
            ctx.tipo_ = type
        else:
            type = ctx.tipo().getText()
            id = ctx.ID().getText()
            func_name = ctx.parentCtx.whichFunc
            func[func_name]['var'][id] = {}
            func[func_name]['var'][id]['type'] = type
            ctx.whichFunc = ctx.parentCtx.whichFunc
            ctx.tipo_ = type

    # Exit a parse tree produced by MyGrammarParser#var_init.

    def exitVar_init(self, ctx: MyGrammarParser.Var_initContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#extra_vars.
    def enterExtra_vars(self, ctx: MyGrammarParser.Extra_varsContext):
        ctx.context = ctx.parentCtx.context
        if ctx.parentCtx.context == 'global':
            if ctx.ID():
                type = ctx.parentCtx.tipo_
                var_ID = ctx.ID().getText()
                var[var_ID] = {}
                var[var_ID]['type'] = type
        else:
            type = ctx.parentCtx.tipo_
            if ctx.ID():
                id = ctx.ID().getText()
                func_name = ctx.parentCtx.whichFunc
                func[func_name]['var'][id] = {}
                func[func_name]['var'][id]['type'] = type
                ctx.whichFunc = ctx.parentCtx.whichFunc
        ctx.tipo_ = ctx.parentCtx.tipo_

    # Exit a parse tree produced by MyGrammarParser#extra_vars.

    def exitExtra_vars(self, ctx: MyGrammarParser.Extra_varsContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#new_type.
    def enterNew_type(self, ctx: MyGrammarParser.New_typeContext):
        ctx.context = ctx.parentCtx.context
        ctx.whichFunc = ctx.parentCtx.whichFunc
        pass

    # Exit a parse tree produced by MyGrammarParser#new_type.
    def exitNew_type(self, ctx: MyGrammarParser.New_typeContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#tipo.
    def enterTipo(self, ctx: MyGrammarParser.TipoContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#tipo.
    def exitTipo(self, ctx: MyGrammarParser.TipoContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#bloque.
    def enterBloque(self, ctx: MyGrammarParser.BloqueContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#bloque.
    def exitBloque(self, ctx: MyGrammarParser.BloqueContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#bloque_init.
    def enterBloque_init(self, ctx: MyGrammarParser.Bloque_initContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#bloque_init.
    def exitBloque_init(self, ctx: MyGrammarParser.Bloque_initContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#bloque_def.
    def enterBloque_def(self, ctx: MyGrammarParser.Bloque_defContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#bloque_def.
    def exitBloque_def(self, ctx: MyGrammarParser.Bloque_defContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#estatuto.
    def enterEstatuto(self, ctx: MyGrammarParser.EstatutoContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#estatuto.
    def exitEstatuto(self, ctx: MyGrammarParser.EstatutoContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#asignacion.
    def enterAsignacion(self, ctx: MyGrammarParser.AsignacionContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#asignacion.
    def exitAsignacion(self, ctx: MyGrammarParser.AsignacionContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#condicion.
    def enterCondicion(self, ctx: MyGrammarParser.CondicionContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#condicion.
    def exitCondicion(self, ctx: MyGrammarParser.CondicionContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#cond_else.
    def enterCond_else(self, ctx: MyGrammarParser.Cond_elseContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#cond_else.
    def exitCond_else(self, ctx: MyGrammarParser.Cond_elseContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#escritura.
    def enterEscritura(self, ctx: MyGrammarParser.EscrituraContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#escritura.
    def exitEscritura(self, ctx: MyGrammarParser.EscrituraContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#print_def.
    def enterPrint_def(self, ctx: MyGrammarParser.Print_defContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#print_def.
    def exitPrint_def(self, ctx: MyGrammarParser.Print_defContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#print_extra.
    def enterPrint_extra(self, ctx: MyGrammarParser.Print_extraContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#print_extra.
    def exitPrint_extra(self, ctx: MyGrammarParser.Print_extraContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#expresion.
    def enterExpresion(self, ctx: MyGrammarParser.ExpresionContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#expresion.
    def exitExpresion(self, ctx: MyGrammarParser.ExpresionContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#exp_super.
    def enterExp_super(self, ctx: MyGrammarParser.Exp_superContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#exp_super.
    def exitExp_super(self, ctx: MyGrammarParser.Exp_superContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#expresion_cond.
    def enterExpresion_cond(self, ctx: MyGrammarParser.Expresion_condContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#expresion_cond.
    def exitExpresion_cond(self, ctx: MyGrammarParser.Expresion_condContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#exp.
    def enterExp(self, ctx: MyGrammarParser.ExpContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#exp.
    def exitExp(self, ctx: MyGrammarParser.ExpContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#exp_op.
    def enterExp_op(self, ctx: MyGrammarParser.Exp_opContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#exp_op.
    def exitExp_op(self, ctx: MyGrammarParser.Exp_opContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#termino.
    def enterTermino(self, ctx: MyGrammarParser.TerminoContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#termino.
    def exitTermino(self, ctx: MyGrammarParser.TerminoContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#termino_op.
    def enterTermino_op(self, ctx: MyGrammarParser.Termino_opContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#termino_op.
    def exitTermino_op(self, ctx: MyGrammarParser.Termino_opContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#factor.
    def enterFactor(self, ctx: MyGrammarParser.FactorContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#factor.
    def exitFactor(self, ctx: MyGrammarParser.FactorContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#var_cte.
    def enterVar_cte(self, ctx: MyGrammarParser.Var_cteContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#var_cte.
    def exitVar_cte(self, ctx: MyGrammarParser.Var_cteContext):
        pass


var = {

}

func = {

}


def main():
    input_stream = FileStream("test.pyr")
    lexer = MyGrammarLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = MyGrammarParser(tokens)

    tree = parser.programa()
    listener = MyListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

    print(var)
    print(func)


if __name__ == '__main__':
    main()
