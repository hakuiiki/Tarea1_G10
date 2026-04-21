package org.Expendedor;
import org.Monedas.*;
import org.productos.*;
import org.deposito.*;
import org.utils.OpcProducto;

/**
 * Clase que permite llenar el expendedor de productos, comprarlos y calcular el vuelto.
 */
public class Expendedor {
    /**
     * Declara distintos depositos para los productos
     * y para el deposito del vuelto.
     */
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> super8;
    private Deposito<Dulce> snickers;
    private Deposito<Moneda> monVu;


    /**
     * Constructor de la clase Expendedor.
     * Crea los distintos depositos para productos y monedas.
     * Contiene un ciclo for para llenarlos con i cantidad de productos cada uno.
     * @param cantidad la cantidad de cada producto que se desee
     */
    public Expendedor(int cantidad) {
        this.coca = new Deposito<Bebida>();
        this.sprite = new Deposito<Bebida>();
        this.fanta = new Deposito<Bebida>();
        this.super8 = new Deposito<Dulce>();
        this.snickers = new Deposito<Dulce>();
        this.monVu = new Deposito<Moneda>();

        for (int i = 0; i < cantidad; i++) {
            coca.add(new CocaCola(100 + i));
            sprite.add(new Sprite(200 + i));
            fanta.add(new Fanta(300+  i));
            super8.add(new Super8(400+  i));
            snickers.add(new Snickers(500+  i));
        }
    }

    /**
     * Metodo para comprar productos, recibe una moneda y el producto que se desee comprar,
     * luego analiza cada caso posible y devuelve lo correspondiente en cada uno.
     * Tambien calcula el vuelto si corresponde.
     * @param mon1 moneda con la que se compra el producto
     * @param producto producto que se desee comprar
     * @return el producto comprado o null si no se pudo realizar la compra
     */
    public Producto comprarProducto(Moneda mon1, OpcProducto producto) {

        /* Verificar que la moneda y el producto no sean nulos */
        if (mon1 == null || producto == null) {
            return null;
        }

        /* Verificar que la moneda cubre el precio del producto */
        if (mon1.getValor() < producto.getPrecio()) {
            monVu.add(mon1);
            return null;
        }

        Producto productoAComprar = null;

        if (producto == OpcProducto.COCA_COLA) {
            productoAComprar = coca.get();
        }

        if (producto == OpcProducto.SPRITE) {
            productoAComprar = sprite.get();
        }

        if (producto == OpcProducto.FANTA) {
            productoAComprar = fanta.get();
        }

        if (producto == OpcProducto.SUPER8) {
            productoAComprar = super8.get();
        }

        if (producto == OpcProducto.SNICKERS) {
            productoAComprar = snickers.get();
        }

        if (productoAComprar == null) {
            monVu.add(mon1);
            return null;
        }

        /* Calculo de vuelto */
        int vuelto = mon1.getValor() - producto.getPrecio();
        while (vuelto >= 100){
            monVu.add(new Moneda100());
            vuelto-=100;
        }
        return productoAComprar;

    }

    /**
     * Getter del vuelto
     * @return saca una moneda del deposito del vuelto
     */
    public Moneda getVuelto(){
            return monVu.get();
        }
    }