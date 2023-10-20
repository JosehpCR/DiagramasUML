package com.solid.DIP.sinDIP;

public class Interruptor extends Bombilla {
    Bombilla bombilla;

    public Interruptor(Bombilla bombilla) {
        this.bombilla = bombilla;
    }

    public void encender() {
        System.out.println("Encendiendo bombilla");
    }
}
