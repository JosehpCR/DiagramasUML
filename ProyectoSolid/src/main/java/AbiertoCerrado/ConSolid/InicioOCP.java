package AbiertoCerrado.ConSolid;

public class InicioOCP {

    public static void main(String[] args) {

        System.out.println("*********************************************");
        InicioOCP.mostrarInformacion(new ProcesarXML("texto"));
        InicioOCP.mostrarInformacion(new ProcesarJSON("texto"));
        InicioOCP.mostrarInformacion(new ProcesarBase64("texto"));
    }

    public static void mostrarInformacion(IProcesarDatos iProcesarDatos){
        System.out.println(iProcesarDatos.procesar());
    }
}
