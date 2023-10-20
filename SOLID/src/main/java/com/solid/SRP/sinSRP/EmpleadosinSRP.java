package com.solid.SRP.sinSRP;

public class EmpleadosinSRP {
    private String nombre;

    public EmpleadosinSRP(String nombre) {
        this.nombre = nombre;
    }

    public void calcularSalario() {
        System.out.println("Calculando salario de " + nombre);
    }

    public void generarReporte() {
        System.out.println("Generando reporte de " + nombre);
    }
}
