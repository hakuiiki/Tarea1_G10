package org.utils;

/**
 * Clase abstracta que representa a las distintas bebidas en el expendedor
 * Hereda atributos de clase Producto
 */
public abstract class Bebida extends Producto {

    /**
     * Constructor de la clase Bebida
     * @param numSerie numero de serie de la bebida
     * @param producto tipo de producto
     */
    public Bebida(int numSerie, OpcProducto producto){
        super(numSerie, producto);
    }
}

