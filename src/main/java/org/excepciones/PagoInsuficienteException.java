package org.excepciones;

/**
 * Se lanza cuando el pago no alcanza el precio del producto
 */
public class PagoInsuficienteException extends Exception {

    public PagoInsuficienteException() {
        super("Pago insuficiente: dinero insuficiente");
    }
}
