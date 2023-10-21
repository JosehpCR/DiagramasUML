package AbiertoCerrado.ConSolid;

public class ProcesarBase64 implements IProcesarDatos {

    private String texto;

    public ProcesarBase64(String texto) {
        this.texto = texto;
    }

    @Override
    public String procesar() {
        return ("Base64 " + texto);
    }
}
