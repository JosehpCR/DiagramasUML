package AbiertoCerrado.ConSolid;

public class ProcesarXML implements IProcesarDatos {

    private String texto;

    public ProcesarXML(String texto) {
        this.texto = texto;
    }

    @Override
    public String procesar() {
        return ("XML " + texto);
    }
}
