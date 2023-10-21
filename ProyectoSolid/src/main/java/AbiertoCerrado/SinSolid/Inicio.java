package AbiertoCerrado.SinSolid;

public class Inicio {

    public static void main(String[] d[]) {
        Inicio.mostrarInformacion("texto", "texto");
    }

    public static void mostrarInformacion(String tipo, String texto) {

        ProcesarInformacion cliente = new ProcesarInformacion();
        if (tipo == "XML") {
            System.out.println("Texto en " + cliente.toXML("texto"));
        } else if (tipo == "JSON") {
            System.out.println("Texto en " + cliente.toJSON("texto"));
        } else if (tipo == "Base64") {
            System.out.println("Texto en " + cliente.toBase64("texto"));
        } else {
            System.out.println("Texto no modificado");
        }
    }
}
