package org.productos;

import org.utils.OpcProducto;

/**
 * Clase que representa una bebida Sprite en el expendedor
 */
public class Sprite extends Bebida {

    /**
     * Constructor de la clase Sprite, de enum OpcProducto se extrae su tag y precio
     * @param numSerie numero de serie de la bebida
     */
    public Sprite(int numSerie){
        super(numSerie, OpcProducto.SPRITE);
    }

    /**
     * Metodo que representa el sabor de la bebida
     * @return sabor de la bebida
     */
    @Override
    public String consumir(){
        return "Sprite";
    }
}
