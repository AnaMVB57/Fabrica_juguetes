# Proyecto-Fabrica_juguetes

Proyecto realizado en Java utilizando POO

- 10/01/2024 -

Hay una fábrica de juguetes que está especializada en producir peluches y carritos.
Esta fábrica quiere automatizar los procesos de creación y registro de los diferentes juguetes que se producen en el día.

**Creación:**

a. Implementación para la creación de Peluche, en la cual se le pedirá al
usuario ingresar los atributos materialExterior, relleno y color.

b. Implementación para la creación de Carrito, en la cual se le pedirá al
usuario ingresar los atributos color, marca y numeroPuertas.

c. El elemento creado debe ser agregado a la lista.

**Registro:**

Imprimir todos los juguetes que se llevan hasta ahora en la lista, con
sus respectivos atributos.

- 17/01/2024 -

Añadir las siguientes funcionalidades: 

1. Clonar juguete: Se le debe preguntar al usuario por el ID del juguete que quiere clonar y el número de veces. Los clones se agregan a la lista.

2. Eliminar juguete: el usuario debe especificar el ID del juguete que quiere eliminar, para posteriormente ser removido de la lista.

- 25/01/2024 -

Añadir las siguientes funcionalidades:

1. Opción para eliminar juguetes por color de la lista.

2. Opción para mostrar juguetes por separado, es decir, puedo elegir si quiero ver solo los Peluches o solo los Carritos.

- 29/04/2024 - 
- Experimentación

  1. [x] Añadir un enum para los colores seleccionables en el programa
  2. [x] Implementar un nuevo tipo de menú utilizando HashMap

**Conceptos utilizados**

- Factory: Creación de objetos.
- Strategy: Distribución de responsabilidades del programa en diferentes clases.
- Builder: Posibilidad de crear objetos con un constructor (builder) flexible y también reduce el margen de error de la creación de estos.
           En el programa se hace uso de un builder mutable (), aunque también podría funcionar con uno inmutable().
- Singleton: Garantiza que sólo exista una instancia de cierta clase en el programa.