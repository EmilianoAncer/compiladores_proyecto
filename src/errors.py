from sys import exit


def same_variable_init(line, var_id):
    try:
        raise NameError(
            f'Error at line: {line}. Variable "{var_id}" was initialized multiple times.')
    except Exception as e:
        print(e)
        exit()


def same_function_init(line, func_id):
    try:
        raise NameError(
            f'Error at line: {line}. function "{func_id}" was initialized multiple times.')
    except Exception as e:
        print(e)
        exit()


def bad_type(line):
    try:
        raise TypeError(f'Error at line: {line}. Type mismatch.')
    except Exception as e:
        print(e)
        exit()


def asign_bad_type(line, var_type, val_type):
    try:
        raise TypeError(
            f'Error at line: {line}. Can not assing "{val_type}" into a "{var_type}" variable.')
    except Exception as e:
        print(e)
        exit()


def over_temp_limit(line):
    try:
        raise IndexError(
            f'Error at line: {line}. The limit of temporary variables was surpassed.'
        )
    except Exception as e:
        print(e)
        exit()


def over_var_limit(line, var_type):
    try:
        raise IndexError(
            f'Error at line: {line}. The limit of "{var_type}" variables was surpassed.'
        )
    except Exception as e:
        print(e)
        exit()


def over_const_limit(line, var_type):
    try:
        raise IndexError(
            f'Error at line: {line}. The limit of "{var_type}" constants was surpassed.'
        )
    except Exception as e:
        print(e)
        exit()


def var_not_initialized(line, var_id):
    try:
        raise NameError(
            f'Error at line: {line}. "{var_id}" has not been initialized.'
        )
    except Exception as e:
        print(e)
        exit()


def no_param_id(line):
    try:
        raise NameError(
            f'Error at line: {line}. Missing parameter name.'
        )
    except Exception as e:
        print(e)
        exit()


def no_param_type(line):
    try:
        raise TypeError(
            f'Error at line: {line}. Missing parameter type.'
        )
    except Exception as e:
        print(e)
        exit()


def return_in_void(line):
    try:
        raise SyntaxError(
            f'Error at line: {line}. Return in void function.'
        )
    except Exception as e:
        print(e)
        exit()


def bad_return_type(line, func_type, return_type):
    try:
        raise TypeError(
            f'Error at line: {line}. Function type "{func_type}" can not return a "{return_type}".'
        )
    except Exception as e:
        print(e)
        exit()


def func_not_init(line, func_id):
    try:
        raise NameError(
            f'Error at line: {line}. Function "{func_id}" was not initialized.'
        )
    except Exception as e:
        print(e)
        exit()


def bad_param_type(line, param_type, func_param_type):
    try:
        raise TypeError(
            f'Error at line: {line}. Expected parameter type: "{func_param_type}", given type: "{param_type}".'
        )
    except Exception as e:
        print(e)
        exit()


def bad_param_number(line, expected, recieved):
    try:
        raise TypeError(
            f'Error at line: {line}. Expected number of parameters: "{expected}", received: "{recieved}".'
        )
    except Exception as e:
        print(e)
        exit()


def arr_init_no_dim(line, arr_name):
    try:
        raise TypeError(
            f'Error at line: {line}. Array "{arr_name}" was not given dimension on initialization.'
        )
    except Exception as e:
        print(e)
        exit()


def no_arr_to_init(line):
    try:
        raise SyntaxError(
            f'Error at line: {line}. No array to initialize.'
        )
    except Exception as e:
        print(e)
        exit()


def var_is_not_arr(line, var_name):
    try:
        raise TypeError(
            f'Error at line: {line}. "{var_name}" is not an array.'
        )
    except Exception as e:
        print(e)
        exit()


def arr_is_not_var(line, arr_name):
    try:
        raise TypeError(
            f'Error at line: {line}. Array "{arr_name}" has no dimensions.'
        )
    except Exception as e:
        print(e)
        exit()


def negative_zero(line):
    try:
        raise ValueError(
            f'Error at line: {line}. Zero can not be negative.'
        )
    except Exception as e:
        print(e)
        exit()


def func_needs_return(line, func_name):
    try:
        raise SyntaxError(
            f'Error at line: {line}. No return in function "{func_name}"'
        )
    except Exception as e:
        print(e)
        exit()

# -------------Errores VM--------------


def bad_type_on_assign():
    try:
        raise TypeError(
            f'Type missmatch on assign.'
        )
    except Exception as e:
        print(e)
        exit()


def bad_type_on_read():
    try:
        raise TypeError(
            f'Type missmatch on read.'
        )
    except Exception as e:
        print(e)
        exit()


def bad_type_on_return():
    try:
        raise TypeError(
            f'Type missmatch on return.'
        )
    except Exception as e:
        print(e)
        exit()


def out_of_bounds():
    try:
        raise IndexError(
            f'Out of bounds.'
        )
    except Exception as e:
        print(e)
        exit()


def bad_type_input(input):
    try:
        raise TypeError(
            f'Input "{input}" is not a supported type.'
        )
    except Exception as e:
        print(e)
        exit()
