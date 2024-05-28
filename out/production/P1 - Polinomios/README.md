# Práctica 1: Polinomio
## Objetivos didácticos
El objetivo de esta actividad es practicar el uso de clases, métodos, constructores, estructuras de control y arrays en Java.

## Enunciado
Se desea disponer de una aplicación que realice operaciones con polinomios. Los polinomios se crean a partir de un array de coeficientes y las acciones que se quieren realizar son diversas: obtener información del polinomio, así como todos los coeficientes que representan el polinomio en forma de array de valores enteros, obtener un coeficiente concreto del polinomio, el grado del polinomio y obtener una representación del polinomio en forma de ristra para poder mostrarlo por pantalla. Por otro lado, también se pretende obtener el valor del polinomio para x igual a un valor y el polinomio resultado de sumar o restar dos polinomios.

El elemento matemático de los polinomios con coeficientes enteros y variable real tienen una expresión algebraica con la siguiente forma:

`p(x) = anxn + an-1xn-1 + ...+ a2x2 + a1x + a0`

donde: n es el grado del polinomio, los ai son los coeficientes de los términos correspondientes, 'x' es la variable y a0 es el término independiente.

## Ejercicio a realizar
Desarrolle una clase pública denominada **Polinomio** que representa polinomios con las siguientes operaciones:

* Un **constructor** por omisión que prepare un objeto Polinomio para ser usado. Este polinomio tendría grado cero y un término independiente cero.
* Un **constructor** al que se le pasa un vector de enteros. El primer elemento del vector representa el término independiente, el segundo el coeficiente del término de grado 1 y así, sucesivamente. El grado del polinomio es el índice mayor con valor distinto de cero.
* Un método llamado **grado()** que devuelve un entero que representa el grado del polinomio.
* Un método llamado **coeficiente()** al que se le pasa un parámetro con un entero, i, que indica la posición de un coeficiente del polinomio y devuelve el valor del coeficiente, o del término independiente, ai. Si el entero i no indica un término válido devuelve 0.
* Un método void llamado **coeficiente()** al que se le pasa por parámetro: un entero, i, que indica la posición de un coeficiente del polinomio y otro entero, v, que representa un valor. El método establece el coeficiente ai del polinomio al valor v. Esta operación puede cambiar el grado del polinomio.
* Un método llamado **coeficientes()** que devuelve un vector de enteros, del tamaño grado() + 1, que contiene los coeficientes del polinomio desde el término de menor grado al de mayor grado. Si se modificara el vector devuelto no debería quedar modificado el polinomio.
* El método **toString()**, redefinido de la clase Object, que devuelve una ristra que representa el polinomio comenzando por el término de mayor grado y sin mostrar los términos con coeficiente cero. En caso de que todos los coeficientes sean cero, toString() debe devolver "0". Ejemplos: "0", "3x-2", "4x^5-8x^2+2", "-3x^7".
* Un método llamado **valor()** al que se le pasa un parámetro que representa un valor real (float), v, y devuelve el valor (float) del polinomio para x=v.
* Un método llamado **suma()** que devuelve un polinomio suma del actual más otro pasado por parámetro.
* Un método llamado **resta()** que devuelve un polinomio resta del actual menos otro pasado por parámetro.

## Uso y prueba de la clase Polinomio 
Realice un programa principal en la clase pública **UsaPolinomio** que cree varios objetos y utilice las operaciones de la clase Polinomio.

Desarrolle (opcionalmente) en una clase pública llamada **PolinomioTest** pruebas para todos los métodos públicos de la clase Polinomio. Para ejecutar las clases de prueba es necesario incluir en el método main() de la clase UsaPolinomio la sentencia: 

```
org.junit.runner.JUnitCore.main("PolinomioTest");
```
Para usar JUnit hay que incluir en la clase de pruebas las siguientes cláusulas de importación:
```
import org.junit.*;
import static org.junit.Assert.*;
...
```
**Notas:**
* NO se permite el uso de contenedores para la implementación de la clase Polinomio.
