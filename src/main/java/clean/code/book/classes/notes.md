## Clases

### Nombre de una clase
Si no podemos derivar un nombre conciso para una clase, seguramente
sea demasiado extenso.
Cuanto ma ambiguo sea el nombre de la clase, mas probabilidades
hay que tenga demasiadas responsabilidades.

### Software limpio
Crear software que funcione y crear software limpio son dos 
actividades diferentes.
El problema es que muchos creemos que hemos terminado cuando el
programa funciona. No cambiamos al otro objetivo de organizacion
y limpieza. Pasamos al siguiente problema en lugar de retroceder
y dividir las clases en unidades independientes con una unica 
responsabilidad.

### Sistemas
Los sistemas deben estar formados por muchas claves reducidas, no 
por algunas de gran tamaño. Cada clase reducida encapsula una unica
responsabilidad

### Cohesion en una clase
Las clases deben tener un numero reducido de variables de instancia. Los
metodos de una clases deben manipular una o varias de dichas variables.
Por lo general, cuantas mas variables manipule un metodo, mas cohesion
tendra su clase.

Fijese en implementacion de Stack() en el listado 10.4. Es una clase
 muy consistente. De los tres metodos, solo size() no usa ambas
 variables
---
- Stack
```java
import java.util.LinkedList;

public class Stack {
    private int topOfStack = 0;
    List<Integer> elements = new LinkedList<>();
    public int size(){
        return topOfStack;
    }
    public void push(int element){
        topOfStack++;
        element.add(element);
    }
    public int pop()throws PoppedWhenEmpty{
        if(topOfStack == 0)
            throw new PoppedWhenEmptyException();
        int element = elements.get(--topOfStack);
        elements.remove(topOfStack);
        return element;
    }
}
```
---
### Consecuencias de reducir el tamaño de las funciones
La estrategia de reducir el tamaño de las funciones y de las listas
de parametros suele provocar la proliferacion(aumento) de variables
de instancia usadas por un subconjunto de los metodos. Si esto
sucede, siempre existe al menos una clase que intenta huir de la
clase de mayor tamaño. Debe intentar separar las variables y 
metodos en dos o mas clase para que las nuevas sean mas 
consistentes.

