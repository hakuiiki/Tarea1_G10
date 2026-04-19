package org.deposito;

import java.util.ArrayList;

/**
 * Clase Deposito que permite almacenar elementos, esta pensado para ser flexible ante almacenar tanto Monedas como Productos
 * dentro del expendedor
 */
public class Deposito<T>{

    /** ArrayList que corresponde al almacenamiento de elementos del deposito*/
    private ArrayList<T> almac;

    /**
     * Constructor de la clase Deposito
     */
    public Deposito(){
        almac = new ArrayList<>();
    }

    /**
     * Metodo para agregar elemento al deposito
     * @param elemento elemento a agregar
     */
    public void add(T elemento){
        almac.add(elemento);
    }

    /**
     * Extrae un elemento del deposito
     * @return elemento retirado o null si el deposito esta vacio
     */
    public T get(){
        if(almac.size() > 0){
            return almac.remove(0);
        } else {
            return null;
        }
    }

}
