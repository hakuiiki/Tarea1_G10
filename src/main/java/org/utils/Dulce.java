package org.utils;

/**
 * Clase abstracta que representa a los distintos dulces en el expendedor
 * Hereda atributos de clase Producto
 */
public abstract class Dulce extends Producto{

    /**
     * Constructor de la clase Dulce
     * @param numSerie numero de serie del dulce
     * @param producto tipo de producto
     */
    public Dulce(int numSerie, OpcProducto producto){
        super(numSerie, producto);
    }
}

