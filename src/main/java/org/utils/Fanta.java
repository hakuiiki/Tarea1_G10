package org.utils;

/**
 * Clase que representa una bebida Fanta en el expendedor
 */
public class Fanta extends Bebida {

    /**
     * Constructor de la clase Fanta, de enum OpcProducto se extrae su tag y precio
     * @param numSerie numero de serie de la bebida
     */
    public Fanta(int numSerie){
        super(numSerie, OpcProducto.FANTA);
    }

    /**
     * Metodo que representa el sabor del producto
     * @return sabor de la bebida
     */
    @Override
    public String consumir(){
        return "Fanta";
    }
}
