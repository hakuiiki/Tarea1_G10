package org.excepciones;

/**
 * Se lanza cuando no hay productos disponibles en el depósito
 */
public class NoHayProductoException extends Exception {

    public NoHayProductoException() {
        super("No hay producto disponible");
    }
}