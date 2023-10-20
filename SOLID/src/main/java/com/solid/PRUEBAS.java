package com.solid;

import com.solid.DIP.conDIP.Bombilla;
import com.solid.DIP.conDIP.Interruptor;
import com.solid.ISP.conISP.Cocinero;
import com.solid.ISP.conISP.Constructor;
import com.solid.LSP.conLSP.Adulto;
import com.solid.LSP.conLSP.Niño;
import com.solid.OCP.conOCP.Carro;
import com.solid.OCP.conOCP.Motocicleta;
import com.solid.SRP.conSRP.ReporteGenerador;
import com.solid.SRP.conSRP.Empleado;

public class PRUEBAS {
    public static void main(String[] args) {

        System.out.println("\n<---Principio de responsabilidad unica--->");
        Empleado empleado = new Empleado("Juan");
        empleado.calcularSalario();
        ReporteGenerador reporteGenerador = new ReporteGenerador();
        reporteGenerador.generarReporte(empleado);


        System.out.println("\n<---Principio de abierto/cerrado--->");
        Motocicleta motocicleta = new Motocicleta("Honda");
        motocicleta.conducir();
        motocicleta.detener();
        Carro carro = new Carro("Toyota");
        carro.conducir();
        carro.detener();

        System.out.println("\n<---Principio de sustitucion de Liskov--->");
        Adulto adulto = new Adulto("Juan", "13689", "123456789");
        adulto.pagar();
        Niño niño = new Niño("Pedro", adulto);
        niño.pagar();


        System.out.println("\n<---Principio de segregacion de interfaces--->");
        Cocinero cocinero = new Cocinero() {
            @Override
            public void cocinar() {
                System.out.println("Cocinando");
            }
        };
        cocinero.cocinar();
        Constructor constructor = new Constructor() {
            @Override
            public void construir() {
                System.out.println("Construyendo");
            }
        };
        constructor.construir();

        System.out.println("\n<---Inversion de dependencias--->");
        Bombilla bombilla = new Bombilla();
        bombilla.encender();
        Interruptor interruptor = new Interruptor(bombilla);
        interruptor.encender();
    }
}
