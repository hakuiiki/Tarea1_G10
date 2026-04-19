package org.utils;

/**
 * Enumeracion de las opciones disponibles de productos en el expendedor
 *
 * Cada constante contiene:
 * - un tag asociado al producto
 * - el precio asociado al producto
 */
public enum OpcProducto{

    /** Bebida CocaCola*/
    COCA_COLA(1,1500),

    /** Bebida Sprite*/
    SPRITE(2,1000),

    /** Bebida Fanta*/
    FANTA(3,800),

    /** Dulce Snickers*/
    SNICKERS(4,700),

    /** Dulce Super8*/
    SUPER8(5,300);

    /** Tag identificador del producto*/
    private int tag;

    /** Precio del producto*/
    private int precio;

    /**
     * Constructor del enum OpcProducto
     * @param tag tag identificador del producto
     * @param precio valor del producto
     */
    OpcProducto(int tag, int precio){
        this.tag = tag;
        this.precio = precio;
    }

    /**
     * Getter del tag del producto
     * @return tag del producto
     */
    public int getTag(){
        return tag;
    }

    /**
     * Getter del precio del producto
     * @return valor del producto
     */
    public int getPrecio(){
        return precio;
    }

}


