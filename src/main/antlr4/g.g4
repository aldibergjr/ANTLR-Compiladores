grammar g;
goal	:	MainClass ( ClassDeclaration )* EOF ;
MainClass	:	'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' '[' ']' Identifier ')' '{' Statement '}' '}';
ClassDeclaration	:	'class' Identifier ( 'extends' Identifier )? '{' ( VarDeclaration )* ( MethodDeclaration )* '}' ;
VarDeclaration	:	Type Identifier ';' ;
MethodDeclaration	:	'public' Type Identifier '(' ( Type Identifier ( ',' Type Identifier )* )? ')' '{' ( VarDeclaration )* ( Statement )* 'return' (Expression | Gambiarra) ';' '}' ;
Type	
: 'int' '[' ']'
|	'boolean'
|	'int'
|	Identifier
;
Statement	
:	'{' ( Statement )* '}'
|	'if' '(' (Expression | Gambiarra) ')' Statement 'else' Statement
|	'while' '(' (Expression | Gambiarra) ')' Statement
|	'System.out.println' '(' (Expression | Gambiarra) ')' ';'
|	Identifier '=' (Expression | Gambiarra) ';'
|	Identifier '[' (Expression | Gambiarra) ']' '=' (Expression | Gambiarra) ';'
;
Expression	
:	Gambiarra ( '&&' | '<' | '+' | '-' | '*' ) (Expression | Gambiarra)
|	Gambiarra '[' (Expression | Gambiarra) ']'
|	Gambiarra '.' 'length'
|	Gambiarra '.' Identifier '(' ( (Expression | Gambiarra) ( ',' (Expression | Gambiarra) )* )? ')'
;
Identifier	:	([A-Za-z_])+([0-9])*([A-Za-z_])*;
Gambiarra:
|	Number
|	'true'
|	'false'
|	Identifier
|	'this'
|	'new' 'int' '[' (Expression | Gambiarra) ']'
|	'new' Identifier '(' ')'
|	'!' (Expression | Gambiarra)
|	'(' (Expression | Gambiarra) ')'
;
Number: ('-')?[0-9]*('.'([0-9])*);
