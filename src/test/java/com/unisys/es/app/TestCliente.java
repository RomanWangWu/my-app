package com.unisys.es.app;

import org.junit.Before;
import org.junit.Test;
import java.util.Date;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;
import com.unisys.es.app.Cliente;
// import static org.hamcrest

//import static org.junit.Assert.assertEquals;

/**
 * Created by alumno on 10/06/15.
 */
public class TestCliente {


    public Cliente cliente;
    @Before
    public void setUp() {
        cliente = new Cliente();
    }

    @Test
    public void TestNoEsNull () {
        assertNotNull(cliente);
    }

    @Test
    public void TestConstructorWithoutParameters() {
        Cliente c = new Cliente();
        assertEquals("class com.unisys.es.app.Cliente", c.getClass().toString());
        assertThat(c.getNombre(),is(""));
        assertThat(c.getApellidos(),is(""));
        assertThat(c.getDni(),is(""));
        assertThat(c.getEmail(),is(""));
        assertNotNull(c.getFecha_nacimiento());
    }

    @Test
    public void TestValores() {
        String nombre = "Roman";
        cliente.setNombre(nombre);
        String apellidos = "Wang";
        cliente.setApellidos(apellidos);
        String dni = "234234F";
        cliente.setDni(dni);
        String email = "asdf@gmail.com";
        cliente.setEmail(email);
        Date fecha = new Date();
        cliente.setFecha_nacimiento(fecha);

        assertEquals(nombre, cliente.getNombre());
        assertEquals(apellidos, cliente.getApellidos());
        assertEquals(dni, cliente.getDni());
        assertEquals(email, cliente.getEmail());
        assertEquals(fecha, cliente.getFecha_nacimiento());
    }


    // deberían ir separados
    @Test
    public void TestValoresNombre() {
        String nombre = "Roman";
        cliente.setNombre(nombre);

        assertEquals(nombre, cliente.getNombre());
    }

    @Test
    public void TestValoresApellidos() {
        String apellidos = "Wang";
        cliente.setApellidos(apellidos);

        assertEquals(apellidos, cliente.getApellidos());
       }

    @Test
    public void TestParametros() {
        cliente.setNombre("Roman");
        cliente.setApellidos("Wang");
        cliente.setDni("234234F");
        cliente.setEmail("asdf@gmail.com");

        Date fecha = new Date();
        cliente.setFecha_nacimiento( fecha);

        assertEquals("Roman", cliente.getNombre());
        assertThat("Wang", is(cliente.getApellidos()));
        assertThat(cliente.getFecha_nacimiento(),sameInstance(fecha));
    }


    @Test
    public void TestToString() {
        cliente.setNombre("Roman");
        cliente.setApellidos("Wang");
        cliente.setDni("234234F");
        cliente.setEmail("asdf@gmail.com");

        assertEquals("El cliente es Roman Wang con DNI:234234F, email:asdf@gmail.com y fecha nacimiento:18/02/1972",
                cliente.enString());
    }

}
