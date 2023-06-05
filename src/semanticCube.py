# Probablemente puedo rehacer esto para cuando no encuentre la respuesta en el diccionario, rerese el error, en vez de especificar todo lo que me daria errores.
semanticCube = {
    'int': {
        '+': {
            'int': 'int',
            'float': 'float',
            'bool': 'error',
            'string': 'error'
        },
        '-': {
            'int': 'int',
            'float': 'float',
            'bool': 'error',
            'string': 'error'
        },
        '*': {
            'int': 'int',
            'float': 'float',
            'bool': 'error',
            'string': 'error'
        },
        '/': {
            'int': 'float',
            'float': 'float',
            'bool': 'error',
            'string': 'error'
        },
        '>': {
            'int': 'bool',
            'float': 'bool',
            'bool': 'error',
            'string': 'error'
        },
        '<': {
            'int': 'bool',
            'float': 'bool',
            'bool': 'error',
            'string': 'error'
        },
        '>=': {
            'int': 'bool',
            'float': 'bool',
            'bool': 'error',
            'string': 'error'
        },
        '<=': {
            'int': 'bool',
            'float': 'bool',
            'bool': 'error',
            'string': 'error'
        },
        '==': {
            'int': 'bool',
            'float': 'error',
            'bool': 'error',
            'string': 'error'
        },
        '!=': {
            'int': 'bool',
            'float': 'error',
            'bool': 'error',
            'string': 'error'
        },
        'and': {
            'int': 'error',
            'float': 'error',
            'bool': 'error',
            'string': 'error'
        },
        'or': {
            'int': 'error',
            'float': 'error',
            'bool': 'error',
            'string': 'error'
        }
    },
    'float': {
        '+': {
            'float': 'float',
            'int': 'float',
            'bool': 'error',
            'string': 'error'
        },
        '-': {
            'float': 'float',
            'int': 'float',
            'bool': 'error',
            'string': 'error'
        },
        '*': {
            'float': 'float',
            'int': 'float',
            'bool': 'error',
            'string': 'error'
        },
        '/': {
            'float': 'float',
            'int': 'float',
            'bool': 'error',
            'string': 'error'
        },
        '>': {
            'float': 'bool',
            'int': 'bool',
            'bool': 'error',
            'string': 'error'
        },
        '<': {
            'float': 'bool',
            'int': 'bool',
            'bool': 'error',
            'string': 'error'
        },
        '>=': {
            'float': 'bool',
            'int': 'bool',
            'bool': 'error',
            'string': 'error'
        },
        '<=': {
            'float': 'bool',
            'int': 'bool',
            'bool': 'error',
            'string': 'error'
        },
        '==': {
            'float': 'bool',
            'int': 'error',
            'bool': 'error',
            'string': 'error'
        },
        '!=': {
            'float': 'bool',
            'int': 'error',
            'bool': 'error',
            'string': 'error'
        },
        'and': {
            'float': 'error',
            'int': 'error',
            'bool': 'error',
            'string': 'error'
        },
        'or': {
            'float': 'error',
            'int': 'error',
            'bool': 'error',
            'string': 'error'
        }
    },
    'bool': {
        '+': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '-': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '*': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '/': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        'and': {
            'bool': 'bool',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        'or': {
            'bool': 'bool',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '>': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '<': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '<=': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '>=': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '==': {
            'bool': 'bool',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '!=': {
            'bool': 'bool',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        }
    },
    'string': {
        '+': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '-': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '*': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '/': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        'and': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        'or': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '>': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '<': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '<=': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '>=': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '==': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        },
        '!=': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'string': 'error'
        }
    }
}


def return_type(left, op, right):
    exp_type = semanticCube[left][op][right]
    return exp_type
