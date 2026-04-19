package org.productos;

import org.utils.OpcProducto;

/**
 * Clase que representa un dulce Snickers en el expendedor
 */
public class Snickers extends Dulce {

    /**
     * Constructor de la clase Snickers, de enum OpcProducto se extrae su tag y precio
     * @param numSerie numero de serie del dulce
     */
    public Snickers(int numSerie){
        super(numSerie, OpcProducto.SNICKERS);
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
