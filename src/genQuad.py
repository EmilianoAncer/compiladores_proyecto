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
