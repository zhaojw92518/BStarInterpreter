grammar GrammarB;

//parse
abmachine:		machine | machine_h | machine_l;
machine:		MACHINE id (include)? (attribute)? (operations)?			END;
machine_h:		MACHINE id (include)? (attribute)? (declare_operations)?	END;
machine_l:		MACHINE id (include)? (attribute)? (cdeclare_operations)?	END;

defines:		(define id ELEMENT)+ ;

type:			normal_type									| 
				set_type									| 
				id (L_ANGLE_BRACKET type R_ANGLE_BRACKET)? 	;
normal_type:	SHORT_TYPE                      |
                UNSIGNED SHORT_TYPE             |
                INT_TYPE                        |
                UNSIGNED INT_TYPE               |
                LONG_TYPE                       |
                UNSIGNED LONG_TYPE				|
                LONG_TYPE LONG_TYPE				|
                UNSIGNED LONG_TYPE LONG_TYPE    |
                CHAR_TYPE                       |
                UNSIGNED CHAR_TYPE				|
                FLOAT_TYPE                      |
                UNSIGNED FLOAT_TYPE				|
                DOUBLE_TYPE                     |
                UNSIGNED DOUBLE_TYPE            |
                STRING_TYPE                     |
                PROPOSITION_TYPE				|
                VOID							;

set_type:		SET_TYPE L_ANGLE_BRACKET type R_ANGLE_BRACKET (at_str)?	;
tuple_type:		STRUCT L_BRACE (type point_id SEMICOLON)* R_BRACE		;
point_id:		MUL point_id | id | L_BRACKET point_id R_BRACKET		;
addr_id:		ADDR addr_id | id | L_BRACKET addr_id R_BRACKET			;

point:			POINT 	;
belong: 		BELONG 	;
addr_get:		ADDRGET ;
nil:			NIL 	;
id:             ID      ;
string: 		STRING 	;
at_str:			AT_STR	;
true: 			TRUE 	;
false: 			FALSE 	;
integer: 		INTEGER ;
real: 			REAL 	;
char: 			CHAR 	;

term:
(			
	nil 														|
	string 														| 
	true 														| 
	false 														| 
	integer 													| 
	real 														| 
	char 														| 
	L_BRACE element (COMMA element)* R_BRACE 					| 
	L_ANGLE_BRACKET element (COMMA element)* R_ANGLE_BRACKET 	| 
	function_call 												| 
	id 															| 
	L_BRACKET element R_BRACKET 								| 
)
(
	point	L_ANGLE_BRACKET 
			(id | integer) belong element 
			(COMMA (id | integer) belong element)* 
			R_ANGLE_BRACKET										|
	point id													|
	addr_get id
)*                                                              ;

one_e:		NOT		one_e		|
			MUL		one_e		|
			ADDR	one_e		|
			term				;

unary_e:	(ADD | SUB) term	|
			one_e				;

mse_0:		unary_e				;
mse_1:		mse_0 (
				MUL		mse_0	|
				DIV		mse_0	|
				MOD		mse_0	|
				INTER	mse_0	|
				UNION	mse_0	
				  )*			;
mse:		mse_1 (
				ADD		mse_1	|
				SUB		mse_1	|
				DIFFER	mse_1
				  )*			;
condition_term:		mse	(
						L_ANGLE_BRACKET	mse	|
						ELES			mse	|
						R_ANGLE_BRACKET	mse	|
						EGRE			mse	|
						NOTBELONG		mse	|
						BELONG			mse	|
						EQU				mse	|
						UEQU			mse
						)?					;

id_list:	id (COMMA id)*						|
			L_BRACKET id (COMMA id)* R_BRACKET	;	

//lex
MACHINE: 			'MACHINE'		;
INVARIANT:			'INVARIANT'		;
ATTRIBUTE:			'ATTRIBUTE'		;
OPERATIONS:			'OPERATIONS'	;
END:				'END'			;
INCLUDE:			'INCLUDE'		;
FUNCTION:			'FUNCTION'		;
ROBUST:				'ROBUST'		;

//type
SHORT_TYPE:			'short'			;
INT_TYPE: 			'int'			;
LONG_TYPE:			'long'			;
FLOAT_TYPE:			'float'			;
DOUBLE_TYPE: 		'double'		;
CHAR_TYPE:			'char'			;
STRING_TYPE:		'string'		;
PROPOSITION_TYPE:	'proposition'	;
SET_TYPE:			'set'			;
TUPLE_TYPE:			'tuple'			;
BOOL_TYPE:			'bool'			;
ENUM_TYPE:			'enum'			;

CONST: 				'const'			;
UNSIGNED:			'unsigned'		;

TRUE:				'true'			;
FALSE:				'false'			;
NIL:				'nil'			;

STRUCT:				'struct'		;
VOID:				'void'			;
RETURN:				'return'		;
IF:					'if'			;
ELSE:				'else'			;
WHILE:				'while'			;
TYPEDEF:			'typedef'		;
SUF:				'.bs'			;				
DEFINE:				'#define'		;
FORALL:				'#'				;


//symbol
COMMA:				','		;
POINT:				'.'		;
AT:					'@'		;
SEMICOLON:			';'		;
ASSIGN_SYMBOL:		'='		;
L_BRACKET:			'('		;
R_BRACKET:			')'		;
L_BRACE:			'{'		;
R_BRACE:			'}'		;
L_ANGLE_BRACKET:	'<'		;
R_ANGLE_BRACKET:	'>'		;

ADD: 				'+'		;
SUB: 				'-'		;
MUL: 				'*'		;
DIV: 				'/'		;
MOD:				'%'		;
NOT:				'~'		;
CONJUNCTION:		'&&'	;
DISJUNCTION:		'||'	;
IMPLICATION:		'=>'	;
EXIST:				'!'		;

EGRE:				'>='	;
ELES:				'<='	;
EQU:				'=='	;
UEQU:				'!='	;

SEPERATOR:			'|'		;
BELONG:				':'		;
NOTBELONG:			'!:'	;
INTER:				'/-\\'	;
UNION:				'\\-/'	;
DIFFER:				'--'	;

ASSIGNMENT:			'='		;
ADDRGET:			'->'	;
ADDR:				'&'		;

CHAR:		'\''	(~['\"','\\'] | '\\' ['n','t','b','r','f','\\','\'','\"'])	'\''			;
STRING:		'\"'	(~['\"','\\'] | '\\' ['n','t','b','r','f','\\','\'','\"'])* '\"'			;
AT_STR:		'@'		(~['\"','\\'] | '\\' ['n','t','b','r','f','\\','\'','\"'])* '@'				;	
INTEGER:	(NO_ZERO_NUM(NUM)*) | '0'	;
REAL: 		INTEGER ('.'NUM(NUM)*)?		;
ID:			LETTER(CHARACTER)*			;

WS :		[ \t\r\n]+ -> skip ;
COMMENT:	'\\*' (~['\"','\\', '\n', '\r'] | '\\' ['n','t','b','r','f','\\','\'','\"'])* '*\\'	;


// fragments 
fragment LETTER: ['_'a-zA-Z];
fragment NO_ZERO_NUM:	[1-9];
fragment NUM: '0'|NO_ZERO_NUM;
fragment CHARACTER:	LETTER|NUM;

