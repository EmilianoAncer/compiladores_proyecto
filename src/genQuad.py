def exp(op, left, right, res):
    return [op, left, right, res]


def asign(var_id, value):
    return ['=', value, None, var_id]
