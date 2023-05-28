grammar MyGrammar;

options {
	language = Python3;
}

programa: 'program' ID ';' var func 'main()' bloque;

func: 'def' func_init |;
func_init:
	func_tipo ID '(' parameters ')' var bloque extra_func;
extra_func: func |;
parameters: tipo ID extra_parameter |;
extra_parameter: ',' tipo ID extra_parameter |;

func_tipo: 'int' | 'float' | 'bool' | 'void' |;

var: 'var' var_init |;
var_init: tipo ':' ID extra_vars ';' new_type;
extra_vars: ',' ID extra_vars |;
new_type: var_init |;

tipo: 'int' | 'float' | 'bool';

bloque: '{' bloque_init '}' |;
bloque_init: bloque_def |;
bloque_def: estatuto bloque_init;

estatuto:
	asignacion
	| condicion
	| escritura
	| func_call
	| while_loop;

asignacion: ID '=' expresion ';';

condicion: 'if' '(' expresion ')' bloque cond_else;
cond_else: 'else' bloque |;

escritura: 'print' '(' print_def ')' ';';
print_def: expresion print_extra;
print_extra: ',' expresion print_extra |;

func_call: ID '(' func_call_params ')' ';';
func_call_params: expresion f_c_params_extra |;
f_c_params_extra: ',' expresion f_c_params_extra |;

while_loop: 'while' '(' expresion ')' bloque;

expresion: exp_super;

exp_super: exp_cond exp_super_op;
exp_super_op: 'and' exp_super | 'or' exp_super |;

exp_cond: exp exp_cond_op;
exp_cond_op:
	'>' exp_cond
	| '<' exp_cond
	| '>=' exp_cond
	| '<=' exp_cond
	| '==' exp_cond
	| '!=' exp_cond
	|;

exp: termino exp_op;
exp_op: '+' exp | '-' exp |;

termino: factor termino_op;
termino_op: '*' termino | '/' termino |;

factor: var_cte | '(' expresion ')';

var_cte: ID | CTE_I | CTE_F | CTE_B | CTE_STRING;

ID: [a-zA-Z_] [a-zA-Z_0-9]*;
CTE_I: [0-9]+;
CTE_F: [0-9]+ ('.' [0-9]*)? ([eE][+-]? [0-9]+)?;
CTE_B: 'true' | 'false';
CTE_STRING: '"' (~'"')* '"';

SPACES: [ \t\r\n]+ -> skip;
