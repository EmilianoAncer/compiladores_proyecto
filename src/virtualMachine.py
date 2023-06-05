from codigoIntermedio import execute
from sys import exit
import errors


def run_quads(var, cte, func, quad):
    # breadcrumb es una lista para manejar recursion
    breadcrumb = []
    in_func = False
    store_temps = []
    curr = 0
    for key in cte:
        var[key] = cte[key]
    print(var)
    print('---------Execution-----------')
    while (True):
        curr_quad = quad[curr]
        if curr_quad[0] in ['+', '-', '*', '/', '<', '>', '<=', '>=', '==', '!=', 'and', 'or']:
            left = var[curr_quad[1]]
            if type_check(curr_quad[1]) == 'pointer':
                left = var[left]
            op = curr_quad[0]
            right = var[curr_quad[2]]
            if type_check(curr_quad[2]) == 'pointer':
                right = var[right]
            expresion = f'{left} {op} {right}'
            var[curr_quad[3]] = eval(expresion)
            if in_func:
                store_temps.append(curr_quad[3])
        elif curr_quad[0] == '=':
            assign_to = curr_quad[3]
            if type_check(assign_to) == 'pointer' and assign_to != None:
                assign_to = var[assign_to]
            value = curr_quad[1]
            if type_check(value) == 'pointer' and value != None:
                value = var[value]
            if type_check(assign_to) == type_check(value):
                var[assign_to] = var[value]
            else:
                errors.bad_type_on_assign()
        elif curr_quad[0] == 'WRITE':
            to_print = curr_quad[3]
            if type_check(to_print) == 'pointer':
                to_print = var[to_print]
            print(var[to_print], end='')
        elif curr_quad[0] == 'WRITE_END':
            print()
        elif curr_quad[0] == 'READ':
            in_type, in_value = check_input_type(input())
            var_type = type_check(curr_quad[3])
            if in_type == var_type:
                var[curr_quad[3]] = in_value
            else:
                errors.bad_type_on_read()
        elif curr_quad[0] == 'END':
            exit()
        elif curr_quad[0] == 'GOTOF':
            if var[curr_quad[1]] == False:
                curr = curr_quad[3] - 1
        elif curr_quad[0] == 'GOTO':
            curr = curr_quad[3] - 1
        elif curr_quad[0] == 'ERA':
            func_name = curr_quad[1]
            store_temps.clear()
            in_func = True
            if not in_func:
                for key in func[func_name]['var']:
                    # agrego las variables locales a la tabla global
                    var[key] = None
        elif curr_quad[0] == 'PARAM':
            var[curr_quad[3]] = var[curr_quad[1]]
        elif curr_quad[0] == 'GOSUB':
            # Basicamente un goto al inicio de la funcion
            # guardo a donde tengo que regresar
            breadcrumb.append(curr)
            curr = func[func_name]['start'] - 1
        elif curr_quad[0] == 'RETURN':
            func_return_address = func[func_name]['return']
            func_type = type_check(func_return_address)
            return_value = var[curr_quad[3]]
            return_value_type = check_return_type(return_value)
            if func_type == return_value_type:
                # Se pone el valor de result en la variable de return de la funcion
                var[func_return_address] = return_value
            else:
                errors.bad_type_on_return()
        elif curr_quad[0] == 'ENDFUNC':
            to_delete = []
            for key in func[func_name]['var']:
                to_delete.append(key)
            for key in to_delete:
                if var.get(key):
                    del var[key]  # borrando las variables locales
            for key in store_temps:
                del var[key]  # Borrando las temps que se usaron en la funcion
            store_temps.clear()
            in_func = False
            curr = breadcrumb.pop(-1)
        elif curr_quad[0] == 'VER':
            if not (0 <= var[curr_quad[1]] < var[curr_quad[3]]):
                errors.out_of_bounds()
        elif curr_quad[0] == '+p':
            var[curr_quad[3]] = var[curr_quad[1]] + curr_quad[2]

        curr += 1


def check_return_type(value):
    if isinstance(value, int):
        return 'int'
    elif isinstance(value, float):
        return 'float'
    elif value == 'true' or value == 'false':
        return 'bool'
    else:
        return 'error'


def check_input_type(value):
    try:
        int_val = int(value)
        return 'int', int_val
    except ValueError:
        try:
            float_val = float(value)
            return 'float', float_val
        except ValueError:
            if value == 'true':
                return 'bool', True
            elif value == 'false':
                return 'bool', False
            if value.startswith('"') and value.endswith('"'):
                return 'string', value[1:-1]
            else:
                errors.bad_type_input(value)


def type_check(address):
    if address in range(1, 9999 + 1):
        res = 'int'
    elif address in range(10001, 19999 + 1):
        res = 'float'
    elif address in range(20001, 29999 + 1):
        res = 'bool'
    elif address in range(30001, 39999 + 1):
        res = 'int'
    elif address in range(40001, 49999 + 1):
        res = 'float'
    elif address in range(50001, 59999 + 1):
        res = 'bool'
    elif address in range(60001, 69999 + 1):
        res = 'string'
    elif address in range(70001, 79999 + 1):
        res = 'int'
    elif address in range(80001, 89999 + 1):
        res = 'float'
    elif address in range(90001, 99999 + 1):
        res = 'bool'
    elif address in range(100001, 109999 + 1):
        res = 'int'
    elif address in range(110001, 119999 + 1):
        res = 'float'
    elif address in range(120001, 129999 + 1):
        res = 'bool'
    elif address in range(130001, 139999 + 1):
        res = 'pointer'
    else:
        res = 'ERROR'
    return res


def main():
    var, cte, func, quad = execute()
    print('---------ON VM------------')
    print('var:')
    print(var)
    print('cte:')
    print(cte)
    print('func:')
    print(func)
    print('quads:')
    count = 0
    for i in quad:
        print(count, ":", i)
        count += 1
    run_quads(var, cte, func, quad)


if __name__ == '__main__':
    main()
