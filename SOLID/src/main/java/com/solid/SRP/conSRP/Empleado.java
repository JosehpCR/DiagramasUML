package com.solid.SRP.conSRP;

public class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void calcularSalario() {
        System.out.println("Calculando salario de " + nombre);
    }

    public String getNombre() {
        return nombre;
    }
}
