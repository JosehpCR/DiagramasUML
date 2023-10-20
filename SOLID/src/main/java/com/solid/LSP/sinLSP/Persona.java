package com.solid.LSP.sinLSP;

public class Persona {
    private String nombre;
    private String cedula;
    private String tarjeta;

    public Persona(String nombre, String cedula, String tarjeta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.tarjeta = tarjeta;
    }

    public void pagar() {
        System.out.println("Pagando con tarjeta");
    }
}
