package com.solid.LSP.conLSP;

public class Adulto extends Persona{
    public String cedula;
    public String tarjeta;

    public Adulto(String nombre, String cedula, String tarjeta) {
        super(nombre);
        this.cedula = cedula;
        this.tarjeta = tarjeta;
    }

    public void pagar(){
        System.out.println("Pagando con tarjeta");
    }
}
