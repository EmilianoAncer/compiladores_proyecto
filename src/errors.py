def same_variable_init(line, var_id):
    raise NameError(
        f'Error at line: {line}. Variable "{var_id}" was initialized multiple times.')


def same_function_init(line, func_id):
    raise NameError(
        f'Error at line: {line}. function "{func_id}" was initialized multiple times.')


def bad_type(line):  # TODO change error message
    raise TypeError(f'Error at line: {line}. Type mismatch.')


def asign_bad_type(line, var_type, val_type):
    raise TypeError(
        f'Error at line: {line}. Can not assing "{val_type}" into a "{var_type}" variable.')


def over_temp_limit(line):
    raise IndexError(
        f'Error at line: {line}. The limit of temporary variables was surpassed.'
    )


def over_var_limit(line, var_type):
    raise IndexError(
        f'Error at line: {line}. The limit of "{var_type}" variables was surpassed.'
    )


def over_const_limit(line, var_type):
    raise IndexError(
        f'Error at line: {line}. The limit of "{var_type}" constants was surpassed.'
    )


def var_not_initialized(line, var_id):
    raise NameError(
        f'Error at line: {line}. "{var_id}" has not been initialized.'
    )


def no_param_id(line):
    raise NameError(
        f'Error at line: {line}. Missing parameter name.'
    )


def no_param_type(line):
    raise TypeError(
        f'Error at line: {line}. Missing parameter type.'
    )


def return_in_void(line):
    raise SyntaxError(
        f'Error at line: {line}. Return in void function.'
    )


def bad_return_type(line, func_type, return_type):
    raise TypeError(
        f'Error at line: {line}. Function type "{func_type}" can not return a "{return_type}".'
    )


def func_not_init(line, func_id):
    raise NameError(
        f'Error at line: {line}. Function "{func_id}" was not initialized.'
    )


def bad_param_type(line, param_type, func_param_type):
    raise TypeError(
        f'Error at line: {line}. Expected parameter type: "{func_param_type}", given type: "{param_type}".'
    )


def bad_param_number(line, expected, recieved):
    raise TypeError(
        f'Error at line: {line}. Expected number of parameters: "{expected}", received: "{recieved}".'
    )
