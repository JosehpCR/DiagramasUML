package com.solid.LSP.sinLSP;

public class Niño extends Persona {
    public Niño(String nombre, String cedula, String tarjeta) {
        super(nombre, cedula, tarjeta);
    }

    @Override
    public void pagar() {
        System.out.println("No puede pagar porque es no es mayor de edad");
    }
}
