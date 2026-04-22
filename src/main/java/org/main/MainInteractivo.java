package org.main;

import org.Comprador.Comprador;
import org.Expendedor.Expendedor;
import org.Monedas.Moneda;
import org.Monedas.Moneda100;
import org.Monedas.Moneda1000;
import org.Monedas.Moneda500;
import java.util.Scanner;

/* Programa interactivo que permite al usuario comprar productos desde el expendedor*/

public class MainInteractivo {
    public static void main(String[] args) {

        /* Se crea Scanner para leer datos ingresados por el usuario desde consola
        * Y se crea un expendedor con una cantidad inicial de productos por tipo*/
        Scanner sc = new Scanner(System.in);
        Expendedor exp = new Expendedor(5);

        /* Muestra los productos disbonibles del expendedor con sus precios*/
        System.out.println("=== EXPENDEDOR ===");

        System.out.println("Seleccione producto:");
        System.out.println("1: Coca-Cola a $1500");
        System.out.println("2: Sprite a $1000");
        System.out.println("3: Fanta a $800");
        System.out.println("4: Snickers a $700");
        System.out.println("5: Super8 a $300");

        /* El usuario selecciona el producto que desea del expendedor*/
        int producto = sc.nextInt();

        /*Muestra las opciones para ingressar nuestra moneda*/
        System.out.println("Ingrese moneda:");
        System.out.println("1: $100");
        System.out.println("2: $500");
        System.out.println("3: $1000");

        /* El usuario ingresa el valor de la moneda con la que desea pagar*/
        int opcionMoneda = sc.nextInt();

        /* Se convierte el valor ingresado en una instancia de la clase Moneda correspondiente*/
        Moneda m = null;

        switch (opcionMoneda) {
            case 1 -> m = new Moneda100();
            case 2 -> m = new Moneda500();
            case 3 -> m = new Moneda1000();
            default -> System.out.println("Moneda inválida");
        }

        /* Se crea un comprador que intenta realizar la compra en el expendedor*/
        Comprador c = new Comprador(m, producto, exp);

        /* Se muestra el resultado de la compra: producto obtenido o mensaje de error y
        * Se muestra el vuelto total obtenido de la compra*/
        System.out.println("Resultado:");
        System.out.println("Producto: " + c.queConsumiste());
        System.out.println("Vuelto: " + c.cuantoVuelto());

        sc.close();
    }
}