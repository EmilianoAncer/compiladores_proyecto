# compiladores_proyecto

## Avances
### Avance1: LéxicoSintaxis
La libreria de ANTLR simplifica bastante el creado de lexer y parse, solo se necesita hacer un archivo agregando los tokens que no son literales y las gramaticas del proyecto.
Por ahora traduje las gramaticas que se hicieron para la tarea 3, pero aun me falta agregar otras, como funciones, definicion de listas, etc.
Pude hacer un poco de testing a mano y vi que funcionaba, pero necesito investigar como automatizar el testing para hacerlo mas eficiente.

#### Commits
1. Commit de setup, instalando las librerias necesarias.
2. Se agrego el archivo de MyGrammar y se tradujo a ANTLR el gramar de la tarea 3.
3. Se agrego escribio el README.
4. El grammar de bloque estaba mal diseñado, solo podia leer una linea, se arrglo el problema.
5. Se agregaron tipos de variable bool y char, tmabien se agrego el archivo test.pyr que estoy usando para testing.
6. Se actualizo el readme con nuevos commits y apartado de testing. <br/><br/>
### Avance2: Semántica Básica de Variables y Cubo Semántico
Agregue un cubo semantico, en vez de hacerlo con un arreglo de 3 dimenciones, decidi usar los diccionarios de python, de la manera que lo hice es asi:

   ```
   cubo_semantico = {
      tipo_exp_izquierda: operador {
         tipo_exp_derecha: tipo_respuesta
      }
   }
   ```
Por ahora aregue todas las opciones posibles, lo cual lo hace bastante largo, vere si puedo quitar todas las opciones que regreas "error" y en vez cuando vaya a buscar la respuesa, si encuentra en el diccionario que de el error, pero por ahora me ayudo a visualizarlo y a asegurarme de que no me faltara nada.<br/><br/>
Me falta hacer el archivo de python que hace la lectura de codigo del nuevo lenguaje y lo pasa por mi lexer y parser, ya con eso puedo crear una funcion en mi archivo donde tengo el cubo semantico, para realizar las busquedas de tipo. <br/><br/>
Mi gramatica un no esta completa y tiene unos errores, esto lo arreglare esta semana.

#### Commits
7. Se agrego la base del cubo semantico
<br/><br/>
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
