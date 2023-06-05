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
1. Se agrego la base del cubo semantico
<br/><br/>

## Avance 14 de mayo
Me atrase algo con las entregas, entonces hice algo de catch up esta semana. Arrele varios problemas que tenia con mi gramatica, eran cosas pequeñas que no me habia dado cuenta que tenia mal, tambien decidi no tener los tipos string y char, solo tendre: int, float y bool. En la gramatica tambien agregue la gramatica para funciones, para la cual hice testing, de varias funciones, varios o zero parametros y variables locales a la funcion. <br/><br/>
Fuera de la gramatica, cree mi tabla de variables y de funciones, las cuales ya estan funcionando, al menos para la inicializacion de variables y funciones, me falta agregarle los valores a las variables una vez que se usen en un bloque de codigo, junto a esto necesito hacer los cuadrapulos de las expresiones para que esa parte funcione completamente. <br/><br/>
Batalle para entender como funcionaba la libreria, pero haber hecho las tablas me ayudo demasiado a entender, no creo tener problemas de ese tipo otra vez, entonces podre enfocarme completamente en los cuadrapulos de ahora en adelante. <br/><br/>

#### Commits
1. Se creo la tabla de variables y su funcionalidad al parsear
2. Se agrego la gramatica de funciones, tabla y funcionalidad de tabla de funciones.
<br/><br/>

### Avance 28 de mayo
Este ha sido mi avance mas grande al proyecto, al fin emepece con la generacion de cuadruplos en el codigo intermedio. En este avance hice que se generaran cuadruplos para:<br/><br/>
1. Expresiones - Aritmeticos, logicos, relacionales y expresiones con parentesis.
2. Asignamiento - Se puede asignar a una variable expresiones, variables y constantes.
3. Condicionales - Se generan cuadruplos para if e if else.
4. Ciclos - Se generan cuadruplos para ciclo while.
5. Funciones - Por el momento solo genero cuadruplos para la declaracion de variables, me falta agregar la llamada de funciones.<br/><br/>
Los ifs y whiles funcionan si esta anidados.<br/><br/>
Lo que me falta: <br/><br/>
Como puse arriba me falta llamada de funciones y tambien me falta arreglos y matrices, hablando de generacion de cuadruplos. La VM tampoco la he empezado y ya doy varios errores al usuario, pero me falta verificar varias cosas mas.

#### Commits
Lo agregare despues, son muchos.

### Avance 3 de junio
Termine las llamadas de funciones y tambien la declaracion de arreglos, los accesos de arreglo esta a punto de que funcionen completamente, para la entrega no alcance a que funcionaran cuando tienes un acceso a arreglo adentro de la dimension de otro arreglo, pero hoy mismo dejare eso funcionando, mañana me enfocare completamente en la VM para acabar el proyecto.



# Compilacion
2. En el forder src/
   ```
    $ python3 compile_pyr.py file.pyr
   ```

