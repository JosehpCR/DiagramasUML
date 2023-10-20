package com.solid.DIP.conDIP;

public class Interruptor {
    private Dispositivo dispositivo;

    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void encender() {
        dispositivo.encender();
    }

}
