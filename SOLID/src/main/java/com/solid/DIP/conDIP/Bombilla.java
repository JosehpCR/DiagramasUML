package com.solid.DIP.conDIP;

public class Bombilla implements Dispositivo{
    @Override
    public void encender() {
        System.out.println("Bombilla encendida");
    }
}
