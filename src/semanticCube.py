# Probablemente puedo rehacer esto para cuando no encuentre la respuesta en el diccionario, rerese el error, en vez de especificar todo lo que me daria errores.
semanticCube = {  # TODO Check if ill add "not"
    'int': {
        '+': {
            'int': 'int',
            'float': 'float',
            'bool': 'error'
        },
        '-': {
            'int': 'int',
            'float': 'float',
            'bool': 'error'
        },
        '*': {
            'int': 'int',
            'float': 'float',
            'bool': 'error'
        },
        '/': {
            'int': 'float',
            'float': 'float',
            'bool': 'error'
        },
        '>': {
            'int': 'bool',
            'float': 'bool',
            'bool': 'error'
        },
        '<': {
            'int': 'bool',
            'float': 'bool',
            'bool': 'error'
        },
        '>=': {
            'int': 'bool',
            'float': 'bool',
            'bool': 'error'
        },
        '<=': {
            'int': 'bool',
            'float': 'bool',
            'bool': 'error'
        },
        '==': {
            'int': 'bool',
            'float': 'error',
            'bool': 'error'
        },
        '!=': {
            'int': 'bool',
            'float': 'error',
            'bool': 'error'
        },
        'and': {
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        'or': {
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        }
    },
    'float': {
        '+': {
            'float': 'float',
            'int': 'float',
            'bool': 'error'
        },
        '-': {
            'float': 'float',
            'int': 'float',
            'bool': 'error'
        },
        '*': {
            'float': 'float',
            'int': 'float',
            'bool': 'error'
        },
        '/': {
            'float': 'float',
            'int': 'float',
            'bool': 'error'
        },
        '>': {
            'float': 'bool',
            'int': 'bool',
            'bool': 'error'
        },
        '<': {
            'float': 'bool',
            'int': 'bool',
            'bool': 'error'
        },
        '>=': {
            'float': 'bool',
            'int': 'bool',
            'bool': 'error'
        },
        '<=': {
            'float': 'bool',
            'int': 'bool',
            'bool': 'error'
        },
        '==': {
            'float': 'bool',
            'int': 'error',
            'bool': 'error'
        },
        '!=': {
            'float': 'bool',
            'int': 'error',
            'bool': 'error'
        },
        'and': {
            'float': 'error',
            'int': 'error',
            'bool': 'error'
        },
        'or': {
            'float': 'error',
            'int': 'error',
            'bool': 'error'
        }
    },
    'bool': {
        '+': {
            'bool': 'error',
            'int': 'error',
            'float': 'error'
        },
        '-': {
            'bool': 'error',
            'int': 'error',
            'float': 'error'
        },
        '*': {
            'bool': 'error',
            'int': 'error',
            'float': 'error'
        },
        '/': {
            'bool': 'error',
            'int': 'error',
            'float': 'error'
        },
        'and': {
            'bool': 'bool',
            'int': 'error',
            'float': 'error'
        },
        'or': {
            'bool': 'bool',
            'int': 'error',
            'float': 'error'
        },
        '>': {
            'bool': 'error',
            'int': 'error',
            'float': 'error'
        },
        '<': {
            'bool': 'error',
            'int': 'error',
            'float': 'error'
        },
        '<=': {
            'bool': 'error',
            'int': 'error',
            'float': 'error'
        },
        '>=': {
            'bool': 'error',
            'int': 'error',
            'float': 'error'
        },
        '==': {
            'bool': 'bool',
            'int': 'error',
            'float': 'error'
        },
        '!=': {
            'bool': 'bool',
            'int': 'error',
            'float': 'error'
        }
    }
}


def return_type(left, op, right):
    exp_type = semanticCube[left][op][right]
    return exp_type
