package org.main;

import org.Comprador.Comprador;
import org.Expendedor.Expendedor;
import org.Monedas.Moneda100;
import org.Monedas.Moneda1000;

public class MainPrueba {
    public static void main(String[] args) {

        Expendedor exp = new Expendedor(3);
        /* PRUEBA 1: Compra válida con dinero exacto*/
        System.out.println("PRUEBA 1: Compra exitosa");
        Comprador c1 = new Comprador(new Moneda1000(), 2, exp);
        System.out.println("Producto: " + c1.queConsumiste());
        System.out.println("Vuelto: " + c1.cuantoVuelto());

        /* PRUEBA 2: Prueba cuando el dinero es insuficiente*/
        System.out.println("\nPRUEBA 2: Dinero insuficiente");
        Comprador c2 = new Comprador(new Moneda100(), 1, exp);
        System.out.println("Producto: " + c2.queConsumiste());
        System.out.println("Vuelto: " + c2.cuantoVuelto());

        /* PRUEBA 1: Prueba si se ingresa un producto que no esta*/
        System.out.println("\nPRUEBA 3: Producto inexistente");
        Comprador c3 = new Comprador(new Moneda1000(), 99, exp);
        System.out.println("Producto: " + c3.queConsumiste());
        System.out.println("Vuelto: " + c3.cuantoVuelto());

        /* PRUEBA 1: Compra sin ninguna moneda ingresada*/
        System.out.println("\nPRUEBA 4: Sin moneda");
        Comprador c4 = new Comprador(null, 1, exp);
        System.out.println("Producto: " + c4.queConsumiste());
        System.out.println("Vuelto: " + c4.cuantoVuelto());
    }
}
