package org.Monedas;

/**
 * Clase abstracta que busca representar el molde para monedas genericas
 */

public abstract class Moneda implements Comparable<Moneda>{

    /** Numero de serie unico para cada Moneda */
    private int serie;

    /** Contador global para aumentar gradualmente el número de serie de la Moneda */
    private static int contador;

    /**
     * Constructor de la clase Moneda
     * Asigna un numero de serie distinto a cada Moneda
     */
    public Moneda(){
        this.serie = contador++;
    }

    /**
     * Getter del numero de serie de la Moneda
     * @return int numero de serie
     */
    public int getSerie(){
        return serie;
    }

    /**
     * Getter del valor de la Moneda
     * @return int del valor de la Moneda
     */
    public abstract int getValor();

    /**
     * Compara esta moneda con otra segun su valor
     * @param comparar objeto a comparar
     * @return int negativo si es menor
     *         int 0 si es igual
     *         int positivo si es mayor
     */
    @Override
    public int compareTo(Moneda comparar){
        return Integer.compare(this.getValor(), comparar.getValor());
    }
}