# Ejercicios Teóricos

## 4
<p>s.length() describe 3 ya que String tiene 3 caracteres.<br>
t.length() no se puede ejecutar, el error salta en tiempo de compilación ya que la variable no está inicializada. <br>
1 + a describe 1abc como String. <br>
Al enviar el mensaje 'toUpperCase()' al objeto a, se retorna el String ABC<br>
Al enviar el mensaje 'indexOf("r")' al objeto "Libertad", se describe la posición del caracter r en "Libertad", es decir 4.<br>
Al enviar el mensaje 'lastIndexOf('i') al objeto "Universidad", se describe la posición de la última aparición del caracter i en "Universidad, es decir 7. <br>
Al enviar el mensaje 'substring(2, 4)' al objeto "Quilmes", se describe el String "il". <br>
(a.length() + a).startsWith("a") retorna false. <br>
s == a retorna true <br>
a.substring(1, 3).equals("bc") retorna true.
</p>

## 5
1. Un tipo de dato primitivo es un tipo de dato que viene predefinido por el lenguaje a través de una palabra clave. Esto es necesario en Java ya que es un lenguaje estáticamente tipado, es decir, que las variables que declaramos con un tipo en nuestro programa tienen el MISMO TIPO durante TODO su CICLO DE VIDA. En Java hay 8 tipos primitivos:
* byte
* short
* int
* float
* double
* char
* boolean
* long
2. La diferencia entre un int y un Integer es que el int es un tipo de dato primitivo y el Integer no, el Integer es una instancia (objeto) de la clase Wrapper Integer. 
3. Una variable int sin inicializar en el código fuente (que no sea variable local, si no falla en tiempo de compilación) es inicializada automáticamente por el compilador en 0. Una variable Integer, en cambio, es inicializada automáticamente en null.
4. En este caso, si se definen un int y un Integer como variables de método, no se pueden utilizar sin incializar, salta error en tiempo de compilación.

## 7
1. El paquete model está organizado como una carpeta dentro del paquete ar.unq.edu.poo2.tp3 (ar/unq/edu/poo2/tp3). Lo mismo sucede con los "subpaquetes" de model, model.gui y model.stack. Son subcarpetas de model.
2. Las clases se crean en el sistema de archivos dentro de la carpeta del paquete al cual pertenecen, lo mismo sucede con la estructura de los archivos .class.