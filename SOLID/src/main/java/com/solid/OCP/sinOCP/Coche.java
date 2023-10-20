package com.solid.OCP.sinOCP;

public class Coche {
    public String marca;

    public Coche(String marca) {
        this.marca = marca;
    }

    public void conducir(){
        System.out.println("Conduciendo coche");
    }

    public void detener(){
        System.out.println("Deteniendo coche");
    }
}
