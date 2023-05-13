grammar MyGrammar;

options {
	language = Python3;
}

programa: 'program' ID ';' var func bloque;

var: 'var' var_init |;
var_init: tipo ':' ID extra_vars ';' new_type;
extra_vars: ',' ID extra_vars |;
new_type: var_init |;

func: 'def' func_init |;
func_init: tipo ID '(' parameters ')' bloque extra_func;
extra_func: extra_func |;

tipo: 'int' | 'float' | 'bool';

bloque: '{' bloque_init '}' |;
bloque_init: bloque_def |;
bloque_def: estatuto bloque_init;

estatuto: asignacion | condicion | escritura;

asignacion: ID '=' expresion ';';

condicion: 'if' '(' expresion ')' bloque cond_else ';';
cond_else: 'else' bloque |;

escritura: 'print' '(' print_def ')' ';';
print_def: expresion print_extra;
print_extra: ',' expresion print_extra |;

expresion: exp exp_super | exp expresion_cond;

exp_super: 'and' expresion | 'or' expresion |;

expresion_cond:
	'>' expresion
	| '<' expresion
	| '!=' expresion
	| '>=' expresion
	| '<=' expresion
	| '==' expresion
	|;

exp: termino exp_op;
exp_op: '+' exp | '-' exp |;

termino: factor termino_op;
termino_op: '*' termino | '/' termino |;

factor: '(' expresion ')' | var_cte;
//factor_op:
// '+' | '-' |; //TODO fix this, check notes to see how it should be

var_cte: ID | CTE_I | CTE_F | CTE_B | CTE_STRING;

ID: [a-zA-Z_] [a-zA-Z_0-9]*;
CTE_I: [0-9]+;
CTE_F: [0-9]+ ('.' [0-9]*)? ([eE][+-]? [0-9]+)?;
CTE_B: 'true' | 'false';
CTE_STRING: '"' (~'"')* '"';

SPACES: [ \t\r\n]+ -> skip;
