package org.productos;

import org.utils.OpcProducto;

/**
 * Clase que representa una bebida CocaCola en el expendedor
 */
public class CocaCola extends Bebida {

    /**
     * Constructor de la clase CocaCola, de enum OpcProducto se extrae su tag y precio
     * @param numSerie numero de serie de la bebida
     */
    public CocaCola(int numSerie){
        super(numSerie, OpcProducto.COCA_COLA);
    }

    /**
     * Metodo que representa el sabor de la bebida
     * @return sabor de la bebida
     */
    @Override
    public String consumir(){
        return "CocaCola";
    }
}
