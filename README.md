# compiladores_proyecto

## Avances
### Avance1: LéxicoSintaxis
La libreria de ANTLR simplifica bastante el creado de lexer y parse, solo se necesita hacer un archivo agregando los tokens que no son literales y las gramaticas del proyecto.
Por ahora traduje las gramaticas que se hicieron para la tarea 3, pero aun me falta agregar otras, como funciones, definicion de listas, etc.
Pude hacer un poco de testing a mano y vi que funcionaba, pero necesito investigar como automatizar el testing para hacerlo mas eficiente.

## Commits
1. Commit de setup, instalando las librerias necesarias.
2. Se agrego el archivo de MyGrammar y se tradujo a ANTLR el gramar de la tarea 3.
3. Se agrego escribio el README.
4. El grammar de bloque estaba mal diseñado, solo podia leer una linea, se arrglo el problema.
5. Se agregaron tipos de variable bool y char, tmabien se agrego el archivo test.pyr que estoy usando para testing.
6. Se actualizo el readme con nuevos commits y apartado de testing.


## Testing
Para poder hacer testing de las grammars se necesitan las herramientas de ANTLR4.
1. En la carpeta con MyGrammar.g4
   ```
    $ antlr4 -o antlr/ MyGrammar.g4
   ```
2. En la carpeta antlr
   ```
    $ javac *.java
   ```
3. Para ver los tockens en la terminal
   ```
    $ grun MyGrammar programa -tokens ../test.pyr
   ```
   Para ver la estructura de una manera grafica en un arbol
   ```
    $ grun MyGrammar programa -gui ../test.pyr
   ```
