grammar MyGrammar;

programa: 'program' ID ';' vars bloque;
vars: 'var' var_init |;
var_init: ID extra_vars ':' tipo ';' new_id;
extra_vars: ',' ID extra_vars |;
new_id: var_init |;
tipo: 'int' | 'float';
bloque: '{' bloque_def '}';
bloque_def: estatuto |;
estatuto: asignacion | condicion | escritura;
asignacion: ID '=' expresion ';';
condicion: 'if' '(' expresion ')' bloque cond_else ';';
cond_else: 'else' bloque |;
escritura: 'print' '(' print_def ')' ';';
print_def: expresion print_extra | CTE_STRING print_extra;
print_extra:
	',' expresion print_extra
	| ',' CTE_STRING print_extra
	|;
expresion: exp expresion_cond;
expresion_cond: '>' exp | '<' exp | '!=' exp |;
exp: termino exp_op;
exp_op: '+' exp | '-' exp |;
termino: factor termino_op;
termino_op: '*' termino | '/' termino |;
factor: '(' expresion ')' | factor_op var_cte;
factor_op: '+' | '-' |;
var_cte: ID | CTE_I | CTE_F;

ID: [a-zA-Z_] [a-zA-Z_0-9]*;
CTE_I: [0-9]+;
CTE_F: [0-9]+ ('.' [0-9]*)? ([eE][+-]? [0-9]+)?;
CTE_STRING: '"' (~'"')* '"';

SPACES: [ \t\r\n]+ -> skip;
