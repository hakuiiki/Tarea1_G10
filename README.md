# Tarea 1: Expendedor de Productos - Desarrollo Orientado a Objetos

## Integrantes - Grupo 10
- Agustin Andres Baeza Mansilla
- Alan Ignacio Flores Yerey
- Ignacio Esteban Placencia Palma

## Descripción del Proyecto
Este proyecto consiste en una simulación avanzada de un Expendedor de Productos (Bebidas y Dulces) desarrollada en Java. El sistema permite realizar compras interactivas, manejar depósitos de stock mediante tipos genéricos, procesar pagos con distintas denominaciones de monedas y gestionar errores mediante excepciones personalizadas.

El objetivo principal es aplicar los principios de la Programación Orientada a Objetos (POO), incluyendo herencia, polimorfismo, interfaces, clases abstractas y manejo de tipos genéricos.

## Componentes Principales
El proyecto se organiza en los siguientes paquetes y clases:

* org.Expendedor: Contiene la lógica central del expendedor, gestionando los depósitos y la lógica de compra.
* org.Comprador: Simula el comportamiento del cliente que interactúa con el expendedor, consume el producto y recibe el vuelto.
* org.productos:
    - Producto (Abstracta): Clase base para todos los artículos.
    - Bebida y Dulce (Abstractas): Subclases que separan las categorías.
    - Implementaciones: CocaCola, Sprite, Fanta, Snickers, Super8.
* org.Monedas:
    - Moneda (Abstracta): Implementa Comparable para permitir el ordenamiento por valor.
    - Moneda100, Moneda500, Moneda1000, Moneda1500.
* org.deposito: Clase genérica Deposito<T> utilizada para almacenar tanto productos como monedas de vuelto.
* org.utils: Contiene el Enum OpcProducto que centraliza los precios y los identificadores (tags) de cada producto.
* org.excepciones: Excepciones personalizadas para un flujo de programa robusto.

## Decisiones de Diseño Clave

1.  Tipos Genéricos: Se implementó Deposito<T> para reutilizar la lógica de almacenamiento. Esto permite que el mismo código maneje depósitos de Bebida, Dulce o Moneda de forma segura.
2.  Enumeraciones: El uso de OpcProducto elimina el uso de "números mágicos", permitiendo que el precio y el nombre de cada producto estén vinculados de forma constante.
3.  Polimorfismo y Herencia: Todos los productos heredan de Producto, lo que permite al Expendedor entregar cualquier artículo bajo una misma estructura de método.
4.  Manejo de Excepciones:
    - PagoIncorrectoException: Si se intenta comprar con una moneda null.
    - PagoInsuficienteException: Si el valor de la moneda es menor al precio del producto.
    - NoHayProductoException: Si el depósito está vacío o el ID de producto no existe.

## Instrucciones de Ejecución
El proyecto cuenta con dos puntos de entrada:

1.  Pruebas Automáticas (Main.java): Ejecuta una serie de casos de prueba predefinidos, incluyendo casos de éxito, errores de stock, pagos insuficientes y demostración del ordenamiento de monedas mediante Comparable.
2.  Interfaz de Usuario (MainInteractivo.java): Permite al usuario interactuar mediante la consola para elegir un producto y seleccionar la moneda de pago en un bucle hasta que decida salir.

## Compilación y Ejecución
Desde la raíz del proyecto:
```bash
# Compilar
javac -d bin src/org/*/*.java

# Ejecutar Main de Pruebas
java -cp bin org.main.Main

# Ejecutar Main Interactivo
java -cp bin org.main.MainInteractivo