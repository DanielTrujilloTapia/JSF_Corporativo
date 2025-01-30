package com.example.jsf_corporativo.controller;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MiBean {

    private String nombre;
    private String mensaje;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String saludar() {
        mensaje = "¡Hola, " + nombre + "!";
        return null; // Permanece en la misma página
    }
}
