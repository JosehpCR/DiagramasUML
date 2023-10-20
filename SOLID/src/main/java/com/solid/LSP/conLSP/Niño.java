package com.solid.LSP.conLSP;

public class Niño extends Persona {
    Adulto tutor;

    public Niño(String nombre, Adulto tutor) {
        super(nombre);
        this.tutor = tutor;
    }

    public void pagar(){
        this.tutor.pagar();
    }

}
