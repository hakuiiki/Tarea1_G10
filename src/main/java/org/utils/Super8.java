package org.utils;

/**
 * Clase que representa un dulce Super8 en el expendedor
 */
public class Super8 extends Dulce {

    /**
     * Constructor de la clase Super8, de enum OpcProducto se extrae su tag y precio
     * @param numSerie numero de serie del dulce
     */
    public Super8(int numSerie){
        super(numSerie, OpcProducto.SUPER8);
    }

    /**
     * Metodo que representa el sabor del dulce
     * @return sabor del dulce
     */
    @Override
    public String consumir(){
        return "Snickers";
    }
}
