package AbiertoCerrado.SinSolid;

public class ProcesarInformacion {
    private String texto;

    public String toXML(String texto){
        this.texto=texto;
        return "texto en XML";
    }

    public String toJSON(String texto){
        this.texto=texto;
        return "texto en JSON";
    }
    public String toBase64(String texto){
        this.texto=texto;
        return "texto en Base64";
    }

}
