package org.excepciones;

/**
 * Se lanza cuando se intenta pagar con moneda null
 */
public class PagoIncorrectoException extends Exception {

    public PagoIncorrectoException() {
        super("Pago incorrecto: moneda nula");
    }
}