package com.unisys.es.app;

import java.util.Date;

/**
 * Created by alumno on 10/06/15.
 */
public class Cliente {

    String nombre;
    String apellidos;
    String dni;
    String email;
    Date fecha_nacimiento;

    public Cliente () {
        this.nombre = "";
        this.apellidos ="";
        this.dni="";
        this.email="";
        this.fecha_nacimiento=new Date();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String enString () {
        String resultado = "El cliente es " + this.getNombre()
                + " " + this.getApellidos()
                + " con DNI:" + this.getDni()
                + ", email:" + this.getEmail()
                + " y fecha nacimiento:" + "18/02/1972";
        return resultado;
    }

}
