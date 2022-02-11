grammar MLGrammar;
inicio: comandos;

WS: [ \t\r\n]+ -> skip;
CM: '//' ~('\r' | '\n')* -> skip;


MOSTRAR : ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ;
BAYES : ( 'B' | 'b' ) ( 'A' | 'a' ) ( 'Y' | 'y' ) ( 'E' | 'e' ) ( 'S' | 's' ) ;
REGRESION : ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ;
KNN : ( 'K' | 'k' ) ( 'N' | 'n' ) ( 'N' | 'n' ) ;
SVM : ( 'S' | 's' ) ( 'V' | 'v' ) ( 'M' | 'm' ) ;
ARBOL : ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ;
BOSQUE : ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'S' | 's' ) ( 'Q' | 'q' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ;
AUTOMATICO : ( 'A' | 'a' ) ( 'U' | 'u' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'O' | 'o' ) ;
ENTRENAMIENTO : ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) ;
USANDO : ( 'U' | 'u' ) ( 'S' | 's' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'O' | 'o' ) ;
PREDICCION : ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ;
EFECTIVIDAD : ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'D' | 'd' ) ;
GRAFICA : ( 'G' | 'g' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ;
MANUAL : ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ;
CON : ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ;
MODELOS : ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'S' | 's' ) ;
GENERARDATOS : ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'D' | 'd' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'O' | 'o' ) ( 'S' | 's' ) ;
TOKEN_Y : ( 'y' | 'Y' ) ;
TOKEN_X : ( 'x' | 'X' ) ;
GOTAS : ( 'G' | 'g' ) ( 'O' | 'o' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'S' | 's' ) ;
CIRCULOS : ( 'C' | 'c' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ( 'C' | 'c' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'O' | 'o' ) ( 'S' | 's' ) ;
LUNAS : ( 'L' | 'l' ) ( 'U' | 'u' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'S' | 's' ) ;
MATRIZ : ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'Z' | 'z' ) ;
VERARBOL : ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'B' | 'b' ) ( 'O' | 'o' ) ( 'L' | 'l' ) ;
DIVIDIR : ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'R' | 'r' ) ;
PREPARARENTRENAMIENTO : ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'A' | 'a' ) ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'O' | 'o' ) ;


ID: ('a'..'z' | 'A'..'Z') ('a'..'z' | '_' | '0'..'9' | 'A'..'Z')*;
CADENA: ('"' | '\'') ~('\r' | '\n')* ('"' | '\'');
ENTERO: ('0'..'9')+;

comandos: leer comandos
        | aleatorio comandos
        | mostrar comandos
        | defmodelo comandos
        | entrenar comandos
        | predecir comandos
        | efectividad comandos
        | grafica comandos
        | manual comandos
        | matriz comandos
        | verarbol comandos
        | dividir comandos
        | preparar comandos
        | 
        ;

leer: ID '=' CADENA;

aleatorio: ID TOKEN_Y ID '=' GENERARDATOS ENTERO tipos;
tipos: LUNAS
     | CIRCULOS
     | GOTAS
     | GOTAS CON ENTERO
     ;

mostrar: MOSTRAR ID indice;
indice: CON ENTERO
      |
      ;

defmodelo: ID '=' modelos;
modelos: BAYES
       | KNN
       | REGRESION
       | SVM
       | ARBOL
       | BOSQUE
       | AUTOMATICO
       ;

entrenar: ENTRENAMIENTO ID USANDO ID CON ID;

predecir: ID '=' PREDICCION ID USANDO ID;

efectividad: EFECTIVIDAD ID USANDO ID CON ID;

grafica: GRAFICA ID USANDO ID CON ID;

manual: MANUAL ayudas;
ayudas: ENTRENAMIENTO
      | PREDICCION
      | EFECTIVIDAD
      | GRAFICA
      | BAYES
      | KNN
      | REGRESION
      | SVM
      | ARBOL
      | BOSQUE
      | AUTOMATICO
      | MODELOS
      ;

matriz: MATRIZ ID USANDO ID CON ID;

verarbol: VERARBOL ID;

dividir: ID TOKEN_Y ID '=' DIVIDIR dividirh;
dividirh: ID
        | CADENA
        ;

preparar: ID ',' ID ',' ID TOKEN_Y ID '=' PREPARARENTRENAMIENTO USANDO ID CON ID;