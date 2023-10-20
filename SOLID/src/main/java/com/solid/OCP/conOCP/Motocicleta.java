package com.solid.OCP.conOCP;

public class Motocicleta implements Vehiculo{
    private String marca;

    public Motocicleta(String marca) {
        this.marca = marca;
    }

    @Override
    public void conducir() {
        System.out.println("Conducir motocicleta " + marca);
    }

    @Override
    public void detener() {
        System.out.println("Detener motocicleta " + marca);
    }
}
