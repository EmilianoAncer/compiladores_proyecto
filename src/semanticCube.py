# Probablemente puedo rehacer esto para cuando no encuentre la respuesta en el diccionario, rerese el error, en vez de especificar todo lo que me daria errores.

semanticCube = {  # TODO Check if ill add "not"
    'int': {
        '+': {
            'int': 'int',
            'float': 'float',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '-': {
            'int': 'int',
            'float': 'float',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '*': {
            'int': 'int',
            'float': 'float',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '/': {
            'int': 'float',
            'float': 'float',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '>': {
            'int': 'bool',
            'float': 'bool',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '<': {
            'int': 'bool',
            'float': 'bool',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '>=': {
            'int': 'bool',
            'float': 'bool',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '<=': {
            'int': 'bool',
            'float': 'bool',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '==': {
            'int': 'bool',
            'float': 'error',  # TODO Puede ser que lo cambie a bool
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '!=': {
            'int': 'bool',
            'float': 'error',  # TODO Puede ser que lo cambie a bool
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        'and': {
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        'or': {
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        }
    },
    'float': {
        '+': {
            'float': 'float',
            'int': 'float',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '-': {
            'float': 'float',
            'int': 'float',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '*': {
            'float': 'float',
            'int': 'float',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '/': {
            'float': 'float',
            'int': 'float',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '>': {
            'float': 'bool',
            'int': 'bool',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '<': {
            'float': 'bool',
            'int': 'bool',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '>=': {
            'float': 'bool',
            'int': 'bool',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '<=': {
            'float': 'bool',
            'int': 'bool',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '==': {
            'float': 'bool',
            'int': 'error',  # TODO Puede ser que lo cambie a bool
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        '!=': {
            'float': 'bool',
            'int': 'error',  # TODO Puede ser que lo cambie a bool
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        'and': {
            'float': 'error',
            'int': 'error',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        },
        'or': {
            'float': 'error',
            'int': 'error',
            'char': 'error',
            'string': 'error',
            'bool': 'error'
        }
    },
    'bool': {
        '+': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        '-': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        '*': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        '/': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        'and': {
            'bool': 'bool',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        'or': {
            'bool': 'bool',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        '>': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        '<': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        '<=': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        '>=': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        '==': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        },
        '!=': {
            'bool': 'error',
            'int': 'error',
            'float': 'error',
            'char': 'error',
            'string': 'error'
        }
    },
    'char': {
        '+': {
            'char': 'string',
            'string': 'string',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '-': {
            'char': 'error',
            'string': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '*': {
            'char': 'error',
            'string': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '/': {
            'char': 'error',
            'string': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '>': {
            'char': 'error',
            'string': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '<': {
            'char': 'error',
            'string': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '>=': {
            'char': 'error',
            'string': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '<=': {
            'char': 'error',
            'string': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '==': {
            'char': 'bool',
            'string': 'bool',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '!=': {
            'char': 'bool',
            'string': 'bool',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        'and': {
            'char': 'error',
            'string': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        'or': {
            'char': 'error',
            'string': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        }
    },
    'string': {
        '+': {
            'string': 'string',
            'char': 'string',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '-': {
            'string': 'error',
            'char': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '*': {
            'string': 'error',
            'char': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '/': {
            'string': 'error',
            'char': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '>': {
            'string': 'error',
            'char': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '<': {
            'string': 'error',
            'char': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '>=': {
            'string': 'error',
            'char': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '<=': {
            'string': 'error',
            'char': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '==': {
            'string': 'bool',
            'char': 'bool',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        '!=': {
            'string': 'bool',
            'char': 'bool',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        'and': {
            'string': 'error',
            'char': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        },
        'or': {
            'string': 'error',
            'char': 'error',
            'int': 'error',
            'float': 'error',
            'bool': 'error'
        }
    }
}
