package com.unisys.es.app;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 11/06/15.
 */
public class TestControlador {
    public Controlador controlador;

    @Before
    public void setUp() {
        controlador=new Controlador();
    }

    @Test
    public void TestNotNull() {
        assertThat(controlador,notNullValue());
    }
/*
    @Test
    public void TestModelNotNull() {
        assertThat(controlador.model,notNullValue());
    }
*/

}
