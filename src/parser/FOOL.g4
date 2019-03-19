grammar FOOL;

@lexer::members {
  Shila Mosammami, Eduart Uzeir, Domenico 
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
  
prog   : (print | exp) SEMIC                                      #singleExp
       | let (exp SEMIC | print SEMIC | stms)+                   #letInExp
       | (classdec)+ (let (exp SEMIC | print SEMIC | stms)+ )?   #classExpmissing
       ;

let    : LET (dec SEMIC)+ IN ;

classdec : CLASS ID (EXTENDS ID)? (LPAR vardec (COMMA vardec)* RPAR)? (CLPAR fun+ CRPAR)? SEMIC ;

letVar : LET (varasm)+ IN ;

vardec  : type ID ;

varasm  : vardec ASM exp SEMIC;

fun    : type ID LPAR ( vardec ( COMMA vardec)* )? RPAR (letVar)? CLPAR (exp SEMIC | print SEMIC | stm)+ CRPAR
       ;

dec   : varasm           #varAssignment
      | fun              #funDeclaration
      ;
         
   
type   : INT  
        | BOOL
        | VOID
        | ID
      ;

print : PRINT LPAR (ID | EXP) RPAR
      ;
    
exp    :  ('-')? left=term ((PLUS | MINUS) right=exp)?
      ;
   
term   : left=factor ((TIMES | DIV) right=term)?
      ;
   
factor : left=value ( (EQ|GREATERTHAN|LESSERTHAN|GREATEREQUAL|LESSEREQUAL|AND|OR) right=factor)?
      ;     
   
value  : (MINUS)? INTEGER                                                                         #intVal
      |  (NOT)? ( TRUE | FALSE )                                                                  #boolVal
      |  LPAR exp RPAR                                                                            #baseExp
      |  IF cond=exp THEN CLPAR thenBranch=exp SEMIC CRPAR ELSE CLPAR elseBranch=exp SEMIC CRPAR  #ifExp
      |  (MINUS| NOT)? ID                                                                         #varExp
      |  ID LPAR (exp (COMMA exp)* )? RPAR                                                        #funExp
      |  ID DOT ID ( LPAR ( exp (COMMA exp)* )? RPAR)                                             #methExp
      |  NEW ID LPAR (exp (COMMA exp)* )? RPAR                                                    #newExp
      |  NULL                                                                                     #null
      ; 


stm :  ID ASM body=exp                                                                            #asmStm
        //id = exp (assegnamento)
	  | IF LPAR cond=exp RPAR THEN CLPAR thenBranch=stms CRPAR ELSE CLPAR elseBranch=stms CRPAR   #ifStm
	    //if exp then { stms } else { stms } (condizionale) ;
	  ;

stms :  (stm SEMIC)+ ;//( stm )+ ;

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
SEMIC  : ';' ;
COLON  : ':' ;
COMMA  : ',' ;
EQ     : '==' ;
ASM    : '=' ;
PLUS   : '+' ;
MINUS  : '-' ;
TIMES  : '*' ;
DIV    : '/' ;
TRUE   : 'true' ;
FALSE  : 'false' ;
LPAR   : '(' ;
RPAR   : ')' ;
CLPAR  : '{' ;
CRPAR  : '}' ;
IF     : 'if' ;
THEN   : 'then' ;
ELSE   : 'else' ;
PRINT  : 'print' ;
LET    : 'let' ;
IN     : 'in' ;
VAR    : 'var' ;
FUN    : 'fun' ;
INT    : 'int' ;
BOOL   : 'bool' ;

//ADDED FOR PROJECT.

OR             : '||' ;
AND            : '&&' ;
NOT            : '!=' ;
GREATERTHAN    : '>' ;
LESSERTHAN     : '<' ;
GREATEREQUAL   : '>=' ;
LESSEREQUAL    : '<=' ;


VOID            : 'void';
CLASS           : 'class';
THIS            : 'this';
NEW             : 'new';
DOT             : '.';
EXTENDS         : 'extends';
NULL            : 'null';


//Numbers
fragment DIGIT : '0'..'9';    
INTEGER       : DIGIT+;

//IDs
fragment CHAR  : 'a'..'z' |'A'..'Z' ;
ID              : CHAR (CHAR | DIGIT)* ;

//ESCAPED SEQUENCES
WS              : (' '|'\t'|'\n'|'\r')-> skip;
LINECOMENTS    : '//' (~('\n'|'\r'))* -> skip;
BLOCKCOMENTS    : '/*'( ~('/'|'*')|'/'~'*'|'*'~'/'|BLOCKCOMENTS)* '*/' -> skip;




 //VERY SIMPLISTIC ERROR CHECK FOR THE LEXING PROCESS, THE OUTPUT GOES DIRECTLY TO THE TERMINAL
 //THIS IS WRONG!!!!
//ERR     : . { System.out.println("Invalid char: "+ getText()); lexicalErrors++; } -> channel(HIDDEN);
