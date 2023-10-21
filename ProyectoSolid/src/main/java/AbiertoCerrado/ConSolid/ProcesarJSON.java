package AbiertoCerrado.ConSolid;

public class ProcesarJSON implements IProcesarDatos {
    private String texto;

    public ProcesarJSON(String texto) {
        this.texto = texto;
    }


    @Override
    public String procesar() {
        return ("JSON" + texto);
    }
}