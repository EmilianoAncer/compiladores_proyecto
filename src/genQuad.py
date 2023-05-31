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
