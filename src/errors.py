def same_variable_init(line, var_id):
    raise NameError(
        f'Error at line: {line}. Variable name: {var_id} was initialized multiple times')


def same_function_init(line, func_id):
    raise NameError(
        f'Error at line: {line}. Variable name: {func_id} was initialized multiple times')


def bad_type(line):  # TODO change error message
    raise TypeError(f'Error at line: {line}. Type mismatch')


def asign_bad_type(line, var_type, val_type):
    raise TypeError(
        f'Error at line: {line}. Can not assing {val_type} into a {var_type} variable')
