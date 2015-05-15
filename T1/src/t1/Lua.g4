/* 
    Gramatica da Linguagem LUA para o T1 de Construcao de Compiladores 1 - 2015
    Alunos: 
        Daniel Nobusada     344443
        Thales Menato       407976
*/

grammar Lua;

//Comeco o Analizador Lexico

//Palavras reservadas (todas as da linguagem LUA)
PALAVRA_CHAVE
    : 'and' | 'break' | 'do' | 'else' | 'elseif' |
      'end' | 'false' | 'for' | 'function' | 'if' |
      'in' | 'local' | 'nil' | 'not' | 'or' |
      'repeat' | 'return' | 'then' | 'true' | 'until' | 'while'; 

/*
    Constantes numericas 
    Apenas decimais, sem sinal, com digitos antes e depois do ponto decimal 
        opcionais
 */ 
NUMERO
    : ('0'..'9')+ ('.'('0'..'9')+)? ;

// Nomes
NOME
    : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')* ;

/* 
    Cadeias de Caracteres 
    Apenas as versoes curtas, sem sequencia de escape ('\n'), 
        e nao sao permitidas quebras de linha.
 */

CADEIA
    : '\'' (~('\''|'\\'))* '\'' ;

// Comentario e white spaces sao ignorados com o uso de skip()
COMENTARIO  : '--' .*? '\n' {skip();};
WS : ( ' '| '\t'| '\r'| '\n') {skip();} ;

// Todos os simbolos suportados pelo analisador lexico
OP_REL 
    : '>' | '>=' | '<' | '<=' | '~=' | '=' | '==';
OP_ARIT_BINARIO 
    : '+' | '*' | '/' | '%' | '^' | '­' ;
OP_LOGICOS
    : 'and' | 'or' | 'not';
CONCATENACAO
    : '..';
COMPRIMENTO
    : '#';
VARAG
    : '...' ;
ABREPAR
    : '(' ;
FECHAPAR
    : ')' ;
ABRECHAV
    :'{';
FECHACHAV
    :'}';
ABRECOLC
    :'[';
FECHACOLC
    :']';
// Fim de todos os símbolos suportados pelo analizador lexico

// Fim do analizador Lexico


//Analisador Sintatico
programa : trecho;
bloco : trecho;
trecho : (comando (';')?)* (ultimocomando (';')?)? ;

comando :
            listavar '=' listaexp |
            chamadadefuncao |
            'do' bloco 'end' |
            'while' exp 'do' bloco 'end' |
            'repeat' bloco 'until' exp |
            'if' exp 'then' bloco ('elseif' exp 'then' bloco)* ('else' bloco)? 'end' |
//  - insercao da variavel 'i' de um 'for'
            'for' NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text, Tipo.VARIAVEL);} '=' exp ',' exp (',' exp)? 'do' bloco 'end' |
            'for' listadenomes 'in' listaexp 'do' bloco 'end' |
            'function' nomedafuncao { TabelaDeSimbolos.adicionarSimbolo($nomedafuncao.text, Tipo.FUNCAO);} corpodafuncao |
            'local' 'function' NOME corpodafuncao |
            'local' listadenomes ('=' listaexp)?;

ultimocomando 
    : 'return' (listaexp)? | 'break';

/*  
    - Acumula o nome de um metodo
    - Acumula o nome da classe, '.' e o nome do metodo
    - Para os dois acima: se o acumulado for do tipo 'class.method', eh entao inserido na tabela
*/
nomedafuncao 
    : NOME {String a = $NOME.text;} ('.' NOME {a = a +"."+$NOME.text ;})* (':' NOME )? {TabelaDeSimbolos.adicionarSimbolo(a,Tipo.FUNCAO); };

/*
    - Insere a variavelna Tabela de Simbolos; 
    - Insere as proximas variaveis na Tabela de Simbolos a partir de um ',', se houver outras variaveis
*/
listavar 
    : var {TabelaDeSimbolos.adicionarSimbolo($var.text, Tipo.VARIAVEL);} (',' var {TabelaDeSimbolos.adicionarSimbolo($var.text, Tipo.VARIAVEL);})*; 

//  - Insere a variavel na Tabela de Simbolos
var 
    : NOME {TabelaDeSimbolos.adicionarSimbolo($NOME.text,Tipo.VARIAVEL); }| expprefixo '[' exp']' | expprefixo '.' ;

/*
    - Insere a variavelna Tabela de Simbolos; 
    - Insere as proximas variaveis na Tabela de Simbolos a partir de um ',', se houver outras variaveis
*/
listadenomes 
    : NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text, Tipo.VARIAVEL);} (',' NOME { TabelaDeSimbolos.adicionarSimbolo($NOME.text, Tipo.VARIAVEL);} )*;   

listaexp 
    : (exp ',')* exp;

exp 
    : 'nil' | 'false' | 'true' | NUMERO | CADEIA | '...' | funcao | expprefixo2 | construtortabela | exp opbin exp | opunaria exp;

expprefixo 
    : NOME  ( '[' exp ']' | '.' NOME )*;

//  - Insere a variavel na Tabela de Simbolos
expprefixo2
    : var { TabelaDeSimbolos.adicionarSimbolo($var.text, Tipo.VARIAVEL);} | chamadadefuncao | '(' exp ')';

//  - Insere o metodo na Tabela de Simbolos
chamadadefuncao 
    : expprefixo { TabelaDeSimbolos.adicionarSimbolo($expprefixo.text, Tipo.FUNCAO);} args | expprefixo ':' NOME args;

args 
    : '(' (listaexp)? ')' | construtortabela | CADEIA;

funcao 
    : 'function' corpodafuncao ;

corpodafuncao 
    : '(' (listapar)? ')' bloco 'end';

listapar : listadenomes (',' '...')? | '...';

construtortabela : '{' (listadecampos)? '}';

listadecampos : campo (separadordecampos campo)* (separadordecampos)?;

campo : '[' exp ']' '=' exp | NOME '=' exp | exp;

separadordecampos : ',' | ';';

opbin : '+' | '-' | '*' | '/' | '^' | '%' | '..' | '<' | '<=' | '>' | '>=' | '==' | '~=' | 'and' | 'or';

opunaria : '-' | 'not' | '#';