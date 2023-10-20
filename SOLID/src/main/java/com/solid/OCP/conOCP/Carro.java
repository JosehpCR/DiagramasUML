package com.solid.OCP.conOCP;

public class Carro implements Vehiculo{
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    @Override
    public void conducir() {
        System.out.println("Conducir carro " + marca);
    }

    @Override
    public void detener() {
        System.out.println("Detener carro " + marca);
    }
}
