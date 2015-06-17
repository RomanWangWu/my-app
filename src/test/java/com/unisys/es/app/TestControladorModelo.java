package com.unisys.es.app;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.mockito.*;

/**
 * Created by alumno on 11/06/15.
 */
public class TestControladorModelo {
    public Controlador controlador;

    @Before
    public void setUp(){
        controlador=new Controlador();
    }
/*
    @Test
    public void testUno() {
        // mock creation
        Modelo mockModelo = mock(Modelo.class);

        // when(mockModelo.listado()).thenReturn( new ArrayList<String>());
    }


    @Test
    public void testModeloEspia(){
        Modelo modelo = new Modelo();
        // no puedo seguir porque no me funciona el pom
        Modelo modeloespia = spy(modelo);
        when(modeloespia.listado()).thenReturn( new ArrayList<String>());

        controlador.model=modeloespia;
        controlador.list();
    }
    */
}
