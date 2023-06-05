def exp(op, left, right, res):  # DONE
    return [op, left, right, res]


def asign(var_id, value):  # DONE
    return ['=', value, None, var_id]


def gotof(res=None):  # DONE
    return ['GOTOF', res, None, None]


def goto(pos=None):  # DONE
    return ['GOTO', None, None, pos]


def end():  # DONE
    return ['END', None, None, None]


def end_func():  # Done
    return ['ENDFUNC', None, None, None]


def func_call(func_id):  # Done
    return ['ERA', func_id, None, None]


def func_param(value, param_dir):  # Done
    return ['PARAM', value, None, param_dir]


def gosub(func_id, func_start):  # Done
    return ['GOSUB', func_id, None, func_start]


def ret(ret_address):  # Done
    return ['RETURN', None, None, ret_address]


def read(assign_dir):  # DONE
    return ['READ', None, None, assign_dir]


def write_part(dir):  # DONE
    return ['WRITE', None, None, dir]


def write_end():  # DONE
    return ['WRITE_END', None, None, None]


def verify(value, dim_size):  # DONE
    return ['VER', value, None, dim_size]

# [+p, dim2, baseA, pointer] #DONE
