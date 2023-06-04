def exp(op, left, right, res):
    return [op, left, right, res]


def asign(var_id, value):
    return ['=', value, None, var_id]


def gotof(res=None):
    return ['GOTOF', res, None, None]


def goto(pos=None):
    return ['GOTO', None, None, pos]


def end():
    return ['END', None, None, None]


def end_func():
    return ['ENDFUNC', None, None, None]


def func_call(func_id):
    return ['ERA', func_id, None, None]


def func_param(value, param_num):
    return ['PARAM', value, None, param_num]


def gosub(func_id, func_start):
    return ['GOSUB', func_id, None, func_start]


def ret(ret_address):
    return ['RETURN', None, None, ret_address]


def read(assign_dir):
    return ['READ', None, None, assign_dir]


def write(dir):
    return ['WRITE', None, None, dir]


def write_start():
    return ['WRITE_START', None, None, None]


def write_part(dir):
    return ['PART', None, None, dir]


def write_end():
    return ['WRITE_END', None, None, None]


def verify(value, dim_size):
    return ['VER', value, None, dim_size]
