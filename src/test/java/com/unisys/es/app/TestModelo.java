package com.unisys.es.app;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 11/06/15.
 */
public class TestModelo {
    public Modelo modelo;

    @Before
    public void setup() {
        modelo=new Modelo();
    }

    @Test
    public void TestNotNull() {
        assertThat(modelo, notNullValue());
    }

    @Test
    public void TestHasTwoValues() {
        assertThat(modelo.listado.size(), is(2));
    }

    @Test
    public void TestHasDefaultValues() {
         assertThat(modelo.listado.get(0), is("Uno"));
         assertThat(modelo.listado.get(1), is("Dos"));
    }

    @Test
    public void TestListCall() {
        List<String> listado=new ArrayList<String>();
         listado.add("Uno");
         listado.add("Dos");
        //
        //assertThat(modelo.listado, is(listado));
    }

}
