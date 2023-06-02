from antlr4 import *
from antlr.MyGrammarLexer import MyGrammarLexer
from antlr.MyGrammarParser import MyGrammarParser
from antlr.MyGrammarListener import MyGrammarListener
import errors
import genQuad
from semanticCube import return_type


class MyListener(MyGrammarListener):

    def __init__(self):
        super().__init__()
        self.term_flag = False
        self.exp_flag = False
        self.exp_cond_flag = False
        self.exp_super_flag = False
        self.if_quad_move_stack = []
        self.context = None
        self.which_func = [None, None]
        self.param_counter = 0
        self.func_call_ID = None
        self.return_counter = 0

    # Enter a parse tree produced by MyGrammarParser#programa.
    def enterPrograma(self, ctx: MyGrammarParser.ProgramaContext):
        program_id = ctx.ID().getText()
        print(f"Program ID: {program_id}")
        self.context = 'global'
        self.which_func = ['main', 'void']
        quad.append(genQuad.goto())

    # Exit a parse tree produced by MyGrammarParser#programa.
    def exitPrograma(self, ctx: MyGrammarParser.ProgramaContext):
        quad.append(genQuad.end())

        # Enter a parse tree produced by MyGrammarParser#func.
    def enterFunc(self, ctx: MyGrammarParser.FuncContext):
        var.clear()
        pilaO.clear()
        POper.clear()
        PJumps.clear()

    # Exit a parse tree produced by MyGrammarParser#func.

    def exitFunc(self, ctx: MyGrammarParser.FuncContext):
        self.context = 'global'
        self.which_func = ['main', 'void']

    # Enter a parse tree produced by MyGrammarParser#func_init.
    def enterFunc_init(self, ctx: MyGrammarParser.Func_initContext):
        self.context = 'func'
        func_type = ctx.func_tipo().getText()
        func_name = ctx.ID().getText()
        if func.get(func_name):
            curr_line = ctx.start.line
            errors.same_function_init(curr_line, func_name)

        self.which_func = [func_name, func_type]
        func[func_name] = {}
        func[func_name]['type'] = func_type
        if func_type != 'void':
            self.return_counter += 1
            return_name = str(self.return_counter) + 'r'
            func[func_name]['return'] = {
                return_name: [func_type, 'GET_RETURN_VALUE']}
            var[return_name] = [func_type, 'GET_RETURN_VALUE']
        else:
            func[func_name]['return'] = None

        func[func_name]['start'] = None
        func[func_name]['var'] = {}
        func[func_name]['params'] = []
        func[func_name]['num_param'] = 0
        func[func_name]['num_temp'] = 0
        func[func_name]['num_var'] = 0

    # Exit a parse tree produced by MyGrammarParser#func_init.
    def exitFunc_init(self, ctx: MyGrammarParser.Func_initContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#func_bloque.
    def enterFunc_bloque(self, ctx: MyGrammarParser.Func_bloqueContext):
        self.debugEnter(ctx)
        func[self.which_func[0]]['num_var'] = (
            len(var) + len(cte)) - func[self.which_func[0]]['num_param']
        func[self.which_func[0]]['start'] = len(quad)

        func[self.which_func[0]]['var'] = var.copy()
        cont = 0
        for param in func[self.which_func[0]]['params']:
            cont += 1
            value = func[self.which_func[0]]['var'][param]
            new_key = str(cont) + 'p'
            func[self.which_func[0]]['var'][new_key] = value
            del func[self.which_func[0]]['var'][param]

    # Exit a parse tree produced by MyGrammarParser#func_bloque.
    def exitFunc_bloque(self, ctx: MyGrammarParser.Func_bloqueContext):
        self.debugExit(ctx)
        global temps_in_func

        var.clear()
        pilaO.clear()
        POper.clear()
        PJumps.clear()
        quad.append(genQuad.end_func())
        func[self.which_func[0]]['num_temp'] = temps_in_func
        temps_in_func = 0
        self.return_counter = 0

    # Enter a parse tree produced by MyGrammarParser#extra_func.

    def enterExtra_func(self, ctx: MyGrammarParser.Extra_funcContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#extra_func.
    def exitExtra_func(self, ctx: MyGrammarParser.Extra_funcContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#parameters.
    def enterParameters(self, ctx: MyGrammarParser.ParametersContext):
        num_children = ctx.getChildCount()
        if num_children > 0:
            if ctx.tipo():
                type = ctx.tipo().getText()
                if not ctx.ID():
                    errors.no_param_id(ctx.start.line)

                func_name = self.which_func[0]
                func[func_name]['num_param'] += 1
                id = ctx.ID().getText()
                func[func_name]['params'].append(id)
                var[id] = [type, get_var_address(
                    type, ctx.start.line, self.context)]
            else:
                errors.no_param_type(ctx.start.line)

    # Exit a parse tree produced by MyGrammarParser#parameters.
    def exitParameters(self, ctx: MyGrammarParser.ParametersContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#extra_parameter.
    def enterExtra_parameter(self, ctx: MyGrammarParser.Extra_parameterContext):
        num_children = ctx.getChildCount()
        if num_children > 0:
            if ctx.tipo():
                type = ctx.tipo().getText()
                if not ctx.ID():
                    errors.no_param_id(ctx.start.line)

                func_name = self.which_func[0]
                func[func_name]['num_param'] += 1
                id = id = ctx.ID().getText()
                func[func_name]['params'].append(id)
                var[id] = [type, get_var_address(
                    type, ctx.start.line, self.context)]
            else:
                errors.no_param_type(ctx.start.line)

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
        if self.context == 'global':
            quad[0][3] = len(quad)
            for key in func:
                if func[key]['return'] != None:
                    return_var = func[key]['return'].copy()
                    for key2 in return_var:
                        return_key = key2

                    '''if return_var[return_key][1] >= 30000 and return_var[return_key][1] <= 69999:
                        if not cte.get(return_key):
                            cte[return_key] = return_var[return_key].copy()
                    else:'''
                    if not var.get(return_key):
                        var[return_key] = return_var[return_key].copy()
        pass

    # Exit a parse tree produced by MyGrammarParser#var.
    def exitVar(self, ctx: MyGrammarParser.VarContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#var_init.
    def enterVar_init(self, ctx: MyGrammarParser.Var_initContext):
        # TODO add error for no type before var ids
        type = ctx.tipo().getText()
        var_ID = ctx.ID().getText()
        if var.get(var_ID):
            curr_line = ctx.start.line
            errors.same_variable_init(curr_line, var_ID)

        var[var_ID] = [type, get_var_address(
            type, ctx.start.line, self.context)]
        ctx.tipo_ = type
        '''else:
            type = ctx.tipo().getText()
            id = ctx.ID().getText()
            func_name = self.which_func[0]
            if func[func_name]['var'].get(id):
                curr_line = ctx.start.line
                errors.same_variable_init(curr_line, id)

            func[func_name]['var'][id] = [
                type, get_var_address(type, ctx.start.line)]
            func[func_name]['num_var'][type] += 1
            # TODO test this delete it
            if func[func_name]['num_var'].get(type):
                func[func_name]['num_var'][type] += 1
            else:
                func[func_name]['num_var'][type] = 0'''
        # ctx.tipo_ = type

    # Exit a parse tree produced by MyGrammarParser#var_init.

    def exitVar_init(self, ctx: MyGrammarParser.Var_initContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#extra_vars.
    def enterExtra_vars(self, ctx: MyGrammarParser.Extra_varsContext):
        if ctx.ID():  # TODO raise error if no var name given on init
            type = ctx.parentCtx.tipo_
            var_ID = ctx.ID().getText()
            if var.get(var_ID):
                curr_line = ctx.start.line
                errors.same_variable_init(curr_line, var_ID)

            var[var_ID] = [type, get_var_address(
                type, ctx.start.line, self.context)]
        '''else:
            type = ctx.parentCtx.tipo_
            if ctx.ID():
                id = ctx.ID().getText()
                func_name = self.which_func[0]
                if func[func_name]['var'].get(id):
                    curr_line = ctx.start.line
                    errors.same_variable_init(curr_line, id)

                func[func_name]['var'][id] = [
                    type, get_var_address(type, ctx.start.line)]
                func[func_name]['num_var'][type] += 1'''
        ctx.tipo_ = ctx.parentCtx.tipo_

    # Exit a parse tree produced by MyGrammarParser#extra_vars.

    def exitExtra_vars(self, ctx: MyGrammarParser.Extra_varsContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#new_type.
    def enterNew_type(self, ctx: MyGrammarParser.New_typeContext):
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
        self.debugExit(ctx)
        var_id = ctx.ID().getText()
        if len(pilaO) > 0:
            # debug
            res = pilaO.pop(-1)
            '''
            Probablemente cambiar esto de abajo, la manera mas facil que veo de hacerlo es, cuando se acaba una init de funcion con return, meter una temporal a la 
            tabla de variables global que sea el valor de return de la funcion, para que si hago una llamada a funcion pueda solo referirme a eso sin tener que sacarlo de
            la tabla de funciones, al mismo tiempo si lo tendre en la tabla de funciones para saber cual es inicialmente, pero la version que estara en la global sera para reglas de despues
            como assign, expresion o recursion
            '''
            '''if isinstance(res, list):
                if var[var_id][0] == res[0]:
                    quad.append(genQuad.asign(var[var_id][1], res[1]))
                else:
                    curr_line = ctx.start.line
                    errors.asign_bad_type(
                        curr_line, var[var_id][0], res[0])
            else:'''
            print(res)
            if var.get(res):
                res_aux = var[res]
            else:
                res_aux = cte[res]
            if var[var_id][0] == res_aux[0]:
                quad.append(genQuad.asign(var[var_id][1], res_aux[1]))
            else:
                curr_line = ctx.start.line
                errors.asign_bad_type(
                    curr_line, var[var_id][0], res_aux[0])

        # clear_temps()

    # Enter a parse tree produced by MyGrammarParser#condicion.

    def enterCondicion(self, ctx: MyGrammarParser.CondicionContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#condicion.
    def exitCondicion(self, ctx: MyGrammarParser.CondicionContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#cond_bloque.
    def enterCond_bloque(self, ctx: MyGrammarParser.Cond_bloqueContext):
        '''
        Tenia que partir la regla de if antes del bloque para poder
        poner el punto neural que va despues de la expresion.
        Para eso es esta regla.
        '''
        if_res = pilaO.pop(-1)
        if var[if_res][0] != 'bool':
            errors.bad_type(ctx.start.line)
        quad.append(genQuad.gotof(var[if_res][1]))
        PJumps.append(len(quad) - 1)

    # Enter a parse tree produced by MyGrammarParser#cond_else.
    def enterCond_else(self, ctx: MyGrammarParser.Cond_elseContext):
        '''
        Al llegar a esta regla, pueden pasar 2 cosas
        1. Esta siempre va a ocurrir, ponerle al GOTOF el resultado
        de la expresion del if y agregar tambien a donde tiene que
        saltar.
        2. Si hay else, se genera el GOTO del else y se guarda el
        index del cuadruplo para despues llenarlo.
        '''
        bread_crumb = PJumps.pop(-1)

        num_children = ctx.getChildCount()
        if num_children > 0:
            quad.append(genQuad.goto())
            PJumps.append(len(quad) - 1)

        quad[bread_crumb][3] = len(quad)

    # Exit a parse tree produced by MyGrammarParser#cond_else.
    def exitCond_else(self, ctx: MyGrammarParser.Cond_elseContext):
        '''
        Si hubo else (se si tuvo else si el numero de hijos es mayor a 0)
        llenamos el GOTO con el cuadruplo que sigue.
        '''
        num_children = ctx.getChildCount()
        if num_children > 0:
            bread_crumb = PJumps.pop(-1)
            quad[bread_crumb][3] = len(quad)

    def enterWhile_loop(self, ctx: MyGrammarParser.While_loopContext):
        PJumps.append(len(quad))  # TODO check this jump

    # Exit a parse tree produced by MyGrammarParser#while_loop.
    def exitWhile_loop(self, ctx: MyGrammarParser.While_loopContext):
        pass

        # Enter a parse tree produced by MyGrammarParser#func_call.
    def enterFunc_call(self, ctx: MyGrammarParser.Func_callContext):
        self.debugEnter(ctx)
        if ctx.ID():
            if func.get(ctx.ID().getText()):
                self.param_counter = 0
                self.func_call_ID = ctx.ID().getText()
                quad.append(genQuad.func_call(ctx.ID().getText()))
            else:
                errors.func_not_init(ctx.start.line, ctx.ID().getText())

    # Exit a parse tree produced by MyGrammarParser#func_call.
    def exitFunc_call(self, ctx: MyGrammarParser.Func_callContext):
        self.debugExit(ctx)
        if self.param_counter != func[self.func_call_ID]['num_param']:
            errors.bad_param_number(
                ctx.start.line, func[self.func_call_ID]['num_param'], self.param_counter)
        quad.append(genQuad.gosub(self.func_call_ID,
                    func[self.func_call_ID]['start']))
        if func[self.func_call_ID]['return'] != None:
            for key in func[self.func_call_ID]['return']:
                return_key = key
            pilaO.append(return_key)
        pass

        # Enter a parse tree produced by MyGrammarParser#func_call_params.
    def enterFunc_call_params(self, ctx: MyGrammarParser.Func_call_paramsContext):
        self.debugEnter(ctx)
        pass

    # Exit a parse tree produced by MyGrammarParser#func_call_params.
    def exitFunc_call_params(self, ctx: MyGrammarParser.Func_call_paramsContext):
        self.debugExit(ctx)
        pass

    # Enter a parse tree produced by MyGrammarParser#f_c_params_extra.
    def enterF_c_params_extra(self, ctx: MyGrammarParser.F_c_params_extraContext):
        self.debugEnter(ctx)
        if len(pilaO) > 0:
            self.param_counter += 1
            param_aux = pilaO.pop(-1)
            if var.get(param_aux):
                param_aux = var[param_aux]
            else:
                param_aux = cte[param_aux]
            init_param_name = str(self.param_counter) + 'p'
            if func[self.func_call_ID]['var'][init_param_name][0] == param_aux[0]:
                quad.append(genQuad.func_param(param_aux[1], init_param_name))
            else:
                errors.bad_param_type(
                    ctx.start.line, param_aux[0], func[self.func_call_ID]['var'][init_param_name][0])
            self.param_waiting = False
        pass

    # Exit a parse tree produced by MyGrammarParser#f_c_params_extra.
    def exitF_c_params_extra(self, ctx: MyGrammarParser.F_c_params_extraContext):
        self.debugExit(ctx)
        pass

    # Enter a parse tree produced by MyGrammarParser#while_bloque.
    def enterWhile_bloque(self, ctx: MyGrammarParser.While_bloqueContext):
        while_res = pilaO.pop(-1)
        if var[while_res][0] != 'bool':
            errors.bad_type(ctx.start.line)
        quad.append(genQuad.gotof(var[while_res][1]))
        PJumps.append(len(quad) - 1)

    # Exit a parse tree produced by MyGrammarParser#while_bloque.

    def exitWhile_bloque(self, ctx: MyGrammarParser.While_bloqueContext):
        goto_false_crumb = PJumps.pop(-1)
        goto_crumb = PJumps.pop(-1)
        quad.append(genQuad.goto(goto_crumb))
        quad[goto_false_crumb][3] = len(quad)

    # Enter a parse tree produced by MyGrammarParser#return_call.
    def enterReturn_call(self, ctx: MyGrammarParser.Return_callContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#return_call.
    def exitReturn_call(self, ctx: MyGrammarParser.Return_callContext):
        num_children = ctx.getChildCount()
        if num_children > 0:
            if self.which_func[1] == 'void':
                errors.return_in_void(ctx.start.line)
            else:
                if self.context == 'func':
                    to_return = pilaO.pop(-1)
                    self.return_counter += 1
                    return_var_name = str(self.return_counter) + 'r'
                    if var.get(to_return):
                        if self.which_func[1] == var[to_return][0]:
                            func[self.which_func[0]]['return'][return_var_name] = [
                                var[to_return][0], var[to_return][1]]
                            quad.append(genQuad.ret(var[to_return][1]))
                        else:
                            errors.bad_return_type(
                                ctx.start.line, self.which_func[1], var[to_return][0])
                    else:
                        if self.which_func[1] == cte[to_return][0]:
                            func[self.which_func[0]]['return'][return_var_name] = [
                                cte[to_return][0], cte[to_return][1]]
                            quad.append(genQuad.ret(cte[to_return][1]))
                        else:
                            errors.bad_return_type(
                                ctx.start.line, self.which_func[1], cte[to_return][0])

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
        self.exp_super_aux(ctx)
        self.exp_super_flag = False

    def exp_super_aux(self, ctx):
        if not self.exp_super_flag:
            if len(POper) > 0:
                if POper[-1] in ['and', 'or']:
                    if len(pilaO) > 1:
                        right_operand = pilaO.pop(-1)
                        if var.get(right_operand):
                            right_type = var[right_operand][0]
                            right_table = 'var'
                        else:
                            right_type = cte[right_operand][0]
                            right_table = 'cte'
                        left_operand = pilaO.pop(-1)
                        if var.get(left_operand):
                            left_type = var[left_operand][0]
                            left_table = 'var'
                        else:
                            left_type = cte[left_operand][0]
                            left_table = 'cte'
                        operator = POper.pop(-1)
                        res_type = return_type(
                            right_type, operator, left_type)
                        if res_type == 'error':
                            errors.bad_type(ctx.start.line)
                        res = add_temp(res_type, ctx.start.line)
                        quad_aux = [operator]
                        if left_table == 'var':
                            quad_aux.append(var[left_operand][1])
                        else:
                            quad_aux.append(cte[left_operand][1])
                        if right_table == 'var':
                            quad_aux.append(var[right_operand][1])
                        else:
                            quad_aux.append(cte[right_operand][1])
                        quad_aux.append(var[res][1])
                        quad.append(quad_aux)
                        self.exp_super_flag = True
                        pilaO.append(res)

    # Enter a parse tree produced by MyGrammarParser#exp_super_op.
    def enterExp_super_op(self, ctx: MyGrammarParser.Exp_super_opContext):
        num_children = ctx.getChildCount()
        if num_children > 0:
            child = ctx.getChild(0)
            if isinstance(child, TerminalNode):
                self.exp_super_aux(ctx)
                POper.append(child.getText())

    # Exit a parse tree produced by MyGrammarParser#exp_super_op.
    def exitExp_super_op(self, ctx: MyGrammarParser.Exp_super_opContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#expresion_cond.
    def enterExp_cond(self, ctx: MyGrammarParser.Exp_condContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#expresion_cond.
    def exitExp_cond(self, ctx: MyGrammarParser.Exp_condContext):
        self.exp_cond_aux(ctx)
        self.exp_cond_flag = False

    def exp_cond_aux(self, ctx):
        if not self.exp_cond_flag:
            if len(POper) > 0:
                if POper[-1] in ['<', '>', '<=', '>=', '==', '!=']:
                    if len(pilaO) > 1:
                        right_operand = pilaO.pop(-1)
                        if var.get(right_operand):
                            right_type = var[right_operand][0]
                            right_table = 'var'
                        else:
                            right_type = cte[right_operand][0]
                            right_table = 'cte'
                        left_operand = pilaO.pop(-1)
                        if var.get(left_operand):
                            left_type = var[left_operand][0]
                            left_table = 'var'
                        else:
                            left_type = cte[left_operand][0]
                            left_table = 'cte'
                        operator = POper.pop(-1)
                        res_type = return_type(
                            right_type, operator, left_type)
                        if res_type == 'error':
                            errors.bad_type(ctx.start.line)
                        res = add_temp(res_type, ctx.start.line)
                        quad_aux = [operator]
                        if left_table == 'var':
                            quad_aux.append(var[left_operand][1])
                        else:
                            quad_aux.append(cte[left_operand][1])
                        if right_table == 'var':
                            quad_aux.append(var[right_operand][1])
                        else:
                            quad_aux.append(cte[right_operand][1])
                        quad_aux.append(var[res][1])
                        quad.append(quad_aux)
                        self.exp_cond_flag = True
                        pilaO.append(res)

    # Enter a parse tree produced by MyGrammarParser#exp_cond_op.
    def enterExp_cond_op(self, ctx: MyGrammarParser.Exp_cond_opContext):
        num_children = ctx.getChildCount()
        if num_children > 0:
            child = ctx.getChild(0)
            if isinstance(child, TerminalNode):
                self.exp_cond_aux(ctx)
                POper.append(child.getText())

    # Exit a parse tree produced by MyGrammarParser#exp_cond_op.
    def exitExp_cond_op(self, ctx: MyGrammarParser.Exp_cond_opContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#exp.
    def enterExp(self, ctx: MyGrammarParser.ExpContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#exp.
    def exitExp(self, ctx: MyGrammarParser.ExpContext):
        '''
        Punto numero 4 del diagrama de expresiones,
        si enterExp_op no corre la funcion, se correra aqui 
        '''
        self.exp_aux(ctx)
        self.exp_flag = False

    def exp_aux(self, ctx):
        self.debugEnter(ctx)
        """Funcion intermediaria entre enterExp_op y exitExp,
        simula el punto 4 del diagrama de expresiones.
        Checa con el cubo semantico el tipo de resultado y genera
        el cuadruplo si no hubo error.
        Si hay un + o - pendiente, lo agrega a POper

        Args:
            ctx: Contexto de donde se llamo la funcion.
        """
        if not self.exp_flag:
            if len(POper) > 0:
                if POper[-1] == '+' or POper[-1] == '-':
                    if len(pilaO) > 1:
                        right_operand = pilaO.pop(-1)
                        print(var)
                        if var.get(right_operand):
                            right_type = var[right_operand][0]
                            right_table = 'var'
                        else:
                            right_type = cte[right_operand][0]
                            right_table = 'cte'
                        left_operand = pilaO.pop(-1)
                        if var.get(left_operand):
                            left_type = var[left_operand][0]
                            left_table = 'var'
                        else:
                            left_type = cte[left_operand][0]
                            left_table = 'cte'
                        operator = POper.pop(-1)
                        # BACK HERE
                        print(left_operand, right_operand, operator)
                        res_type = return_type(
                            right_type, operator, left_type)
                        if res_type == 'error':
                            errors.bad_type(ctx.start.line)
                        res = add_temp(res_type, ctx.start.line)
                        quad_aux = [operator]
                        if left_table == 'var':
                            quad_aux.append(var[left_operand][1])
                        else:
                            quad_aux.append(cte[left_operand][1])
                        if right_table == 'var':
                            quad_aux.append(var[right_operand][1])
                        else:
                            quad_aux.append(cte[right_operand][1])
                        quad_aux.append(var[res][1])
                        quad.append(quad_aux)
                        self.exp_flag = True
                        pilaO.append(res)

    # Enter a parse tree produced by MyGrammarParser#exp_op.

    def enterExp_op(self, ctx: MyGrammarParser.Exp_opContext):
        num_children = ctx.getChildCount()
        if num_children > 0:
            child = ctx.getChild(0)
            if isinstance(child, TerminalNode):
                self.exp_aux(ctx)
                POper.append(child.getText())

    # Exit a parse tree produced by MyGrammarParser#exp_op.

    def exitExp_op(self, ctx: MyGrammarParser.Exp_opContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#termino.

    def enterTermino(self, ctx: MyGrammarParser.TerminoContext):
        pass

    # Exit a parse tree produced by MyGrammarParser#termino.

    def exitTermino(self, ctx: MyGrammarParser.TerminoContext):
        self.term_aux(ctx)
        self.term_flag = False

    def term_aux(self, ctx):
        if not self.term_flag:
            if len(POper) > 0:
                if POper[-1] == '*' or POper[-1] == '/':
                    if len(pilaO) > 1:
                        right_operand = pilaO.pop(-1)
                        if var.get(right_operand):
                            right_type = var[right_operand][0]
                            right_table = 'var'
                        else:
                            right_type = cte[right_operand][0]
                            right_table = 'cte'
                        left_operand = pilaO.pop(-1)
                        if var.get(left_operand):
                            left_type = var[left_operand][0]
                            left_table = 'var'
                        else:
                            left_type = cte[left_operand][0]
                            left_table = 'cte'
                        operator = POper.pop(-1)
                        res_type = return_type(
                            right_type, operator, left_type)
                        if res_type == 'error':
                            errors.bad_type(ctx.start.line)
                        res = add_temp(res_type, ctx.start.line)
                        quad_aux = [operator]
                        if left_table == 'var':
                            quad_aux.append(var[left_operand][1])
                        else:
                            quad_aux.append(cte[left_operand][1])
                        if right_table == 'var':
                            quad_aux.append(var[right_operand][1])
                        else:
                            quad_aux.append(cte[right_operand][1])
                        quad_aux.append(var[res][1])
                        quad.append(quad_aux)
                        self.term_flag = True
                        pilaO.append(res)

    # Enter a parse tree produced by MyGrammarParser#termino_op.

    def enterTermino_op(self, ctx: MyGrammarParser.Termino_opContext):
        num_children = ctx.getChildCount()
        if num_children > 0:
            child = ctx.getChild(0)
            if isinstance(child, TerminalNode):
                self.term_aux(ctx)
                POper.append(child.getText())

    # Exit a parse tree produced by MyGrammarParser#termino_op.

    def exitTermino_op(self, ctx: MyGrammarParser.Termino_opContext):
        pass

    # Enter a parse tree produced by MyGrammarParser#factor.

    def enterFactor(self, ctx: MyGrammarParser.FactorContext):
        global pilaO
        global POper
        self.debugEnter(ctx)
        if ctx.getChildCount() == 3:
            pilaO_aux = pilaO.copy()
            POper_aux = POper.copy()
            pilaO.clear()
            POper.clear()
            # print('--------paren exp start---------')
            ctx.pilaO_aux = pilaO_aux.copy()
            ctx.POper_aux = POper_aux.copy()

    # Exit a parse tree produced by MyGrammarParser#factor.

    def exitFactor(self, ctx: MyGrammarParser.FactorContext):
        global pilaO
        global POper
        self.debugExit(ctx)
        if ctx.getChildCount() == 3:

            pilaO_aux = ctx.pilaO_aux.copy()
            POper_aux = ctx.POper_aux.copy()

            pilaO_aux = pilaO_aux + pilaO
            pilaO = pilaO_aux.copy()
            POper = POper_aux.copy()
            # print('--------paren exp end---------')
            return
        if ctx.func_call() == None:
            pilaO.append(ctx.getText())

    # Enter a parse tree produced by MyGrammarParser#var_cte.
    def enterVar_cte(self, ctx: MyGrammarParser.Var_cteContext):
        num_children = ctx.getChildCount()
        if num_children > 0:
            child = ctx.getChild(0)
            if var.get(child.getText()) or cte.get(child.getText()):
                return

        if ctx.ID():
            if ctx.ID().getText() == 'true' or ctx.ID().getText() == 'false':
                const_type = 'bool'
                address = get_constant_address(const_type, ctx.start.line)
                cte[ctx.ID().getText()] = [const_type, address]
            else:
                if not var.get(ctx.ID().getText()):
                    errors.var_not_initialized(
                        ctx.start.line, ctx.ID().getText())
        elif ctx.CTE_I():
            const_type = 'int'
            address = get_constant_address(const_type, ctx.start.line)
            cte[ctx.CTE_I().getText()] = [const_type, address]
        elif ctx.CTE_F():
            const_type = 'float'
            address = get_constant_address(const_type, ctx.start.line)
            cte[ctx.CTE_F().getText()] = [const_type, address]
        elif ctx.CTE_B():  # TODO delete this after testing
            print('THIS IS A BOOL CONSTANT', ctx.CTE_B().getText())
            const_type = 'bool'
            address = get_constant_address(const_type, ctx.start.line)
            cte[ctx.CTE_B().getText()] = [const_type, address]
        elif ctx.CTE_STRING():
            const_type = 'string'
            address = get_constant_address(const_type, ctx.start.line)
            cte[ctx.CTE_STRING().getText()] = [const_type, address]

    def debugEnter(self, ctx):
        # DEBUG
        rule_name = MyGrammarParser.ruleNames[ctx.getRuleIndex()]
        print("entered rule:", rule_name)
        print("Context:", ctx.getText())  # Print the entire context text
        # Print the number of child elements
        print("Child count:", ctx.getChildCount())

        # Access specific child elements and print their information
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            print("Child", i, "text:", child.getText())

        nextRuleIndex = ctx.getRuleIndex() + 1
        ruleNames = ctx.parser.ruleNames
        if nextRuleIndex < len(ruleNames):
            nextRuleName = ruleNames[nextRuleIndex]
            print("Next rule:", nextRuleName)
        else:
            print("No next rule.")
        print(pilaO)
        print(POper)
        print(PJumps)
        print(quad)
        print("")

    def debugExit(self, ctx):
        # DEBUG
        rule_name = MyGrammarParser.ruleNames[ctx.getRuleIndex()]
        print("exited rule:", rule_name)
        print("Context:", ctx.getText())  # Print the entire context text
        # Print the number of child elements
        print("Child count:", ctx.getChildCount())

        # Access specific child elements and print their information
        for i in range(ctx.getChildCount()):
            child = ctx.getChild(i)
            print("Child", i, "text:", child.getText())

        nextRuleIndex = ctx.getRuleIndex() + 1
        ruleNames = ctx.parser.ruleNames
        if nextRuleIndex < len(ruleNames):
            nextRuleName = ruleNames[nextRuleIndex]
            print("Next rule:", nextRuleName)
        else:
            print("No next rule.")
        print(pilaO)
        print(POper)
        print(PJumps)
        print(quad)
        print("")


def add_temp(res_type, line):  # former next_temp
    global temp_count
    global temp_int_count
    global temp_float_count
    global temp_bool_count
    global temps_in_func
    name = temp_count
    if res_type == 'int':
        if temp_int_count >= 79999:
            errors.over_temp_limit(line)
        address = temp_int_count
        var[name] = [res_type, address]
        temp_int_count += 1
    elif res_type == 'float':
        if temp_float_count >= 89999:
            errors.over_temp_limit(line)
        address = temp_float_count
        var[name] = [res_type, address]
        temp_float_count += 1
    elif res_type == 'bool':
        if temp_bool_count >= 99999:
            errors.over_temp_limit(line)
        address = temp_bool_count
        var[name] = [res_type, address]
        temp_bool_count += 1
    temp_count += 1
    temps_in_func += 1
    return name


def clear_temps():
    will_clear = []
    for key in var:
        if type(key) == int:
            will_clear.append(key)

    for key in will_clear:
        del var[key]


def get_var_address(var_type, line, where):
    global int_count
    global float_count
    global bool_count
    global int_count_func
    global float_count_func
    global bool_count_func
    if where == 'global':
        if var_type == 'int':
            if int_count >= 9999:
                errors.over_var_limit(line, var_type)
            address = int_count
            int_count += 1
        elif var_type == 'float':
            if float_count >= 19999:
                errors.over_var_limit(line, var_type)
            address = float_count
            float_count += 1
        elif var_type == 'bool':
            if bool_count >= 29999:
                errors.over_var_limit(line, var_type)
            address = bool_count
            bool_count += 1
        return address
    else:
        if var_type == 'int':
            if int_count_func >= 109999:
                errors.over_var_limit(line, var_type)
            address = int_count_func
            int_count_func += 1
        elif var_type == 'float':
            if float_count_func >= 129999:
                errors.over_var_limit(line, var_type)
            address = float_count_func
            float_count_func += 1
        elif var_type == 'bool':
            if bool_count_func >= 139999:
                errors.over_var_limit(line, var_type)
            address = bool_count_func
            bool_count_func += 1
        return address


def get_constant_address(var_type, line):
    global const_int_count
    global const_float_count
    global const_bool_count
    global const_string_count

    if var_type == 'int':
        if const_int_count >= 39999:
            errors.over_const_limit(line, var_type)
        address = const_int_count
        const_int_count += 1
    elif var_type == 'float':
        if const_float_count >= 49999:
            errors.over_const_limit(line, var_type)
        address = const_float_count
        const_float_count += 1
    elif var_type == 'bool':
        if const_bool_count >= 59999:
            errors.over_const_limit(line, var_type)
        address = const_bool_count
        const_bool_count += 1
    elif var_type == 'string':
        if const_string_count >= 69999:
            errors.over_const_limit(line, var_type)
        address = const_string_count
        const_string_count += 1
    return address


var = {

}

cte = {

}

func = {

}

pilaO = []

POper = []

PJumps = []

quad = []

temps_in_func = 0

int_count = 1
float_count = 10001
bool_count = 20001

const_int_count = 30001
const_float_count = 40001
const_bool_count = 50001
const_string_count = 60001


temp_count = 1
temp_int_count = 70001
temp_float_count = 80001
temp_bool_count = 90001

int_count_func = 100001
float_count_func = 110001
bool_count_func = 120001


def main():
    input_stream = FileStream("test2.pyr")
    lexer = MyGrammarLexer(input_stream)
    tokens = CommonTokenStream(lexer)
    parser = MyGrammarParser(tokens)

    tree = parser.programa()
    listener = MyListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)
    print('var:')
    print(var)
    print('cte:')
    print(cte)
    print('func:')
    print(func)
    count = 0
    for i in quad:
        print(count, ":", i)
        count += 1


if __name__ == '__main__':
    main()
