package com.unisys.es.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 11/06/15.
 */
public class Modelo {
    public List<String> listado;

    Modelo () {
        listado=new ArrayList<String>();
        listado.add("Uno");
        listado.add("dos");
        // jajaja
    }

    public List<String> listado() {
        return listado;
    }

    public void imprime(int posicion) {
        System.out.println( listado.get(posicion));
    }

}
