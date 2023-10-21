package ResponsabilidadUnica.ConSolid;

public class OperacionSobreConjuntos {

    private Conjunto conjunto1;
    private Conjunto conjunto2;

    public OperacionSobreConjuntos(Conjunto conjunto1, Conjunto conjunto2) {
        this.conjunto1 = conjunto1;
        this.conjunto2 = conjunto2;
    }
    public boolean compararConjuntos(ResponsabilidadUnica.SinSolid.Conjunto conjunto){
        System.out.println("Conjunto comparado correctamente");
        return false;
    }
    public ResponsabilidadUnica.SinSolid.Conjunto unirConjunto(ResponsabilidadUnica.SinSolid.Conjunto conjunto){
        System.out.println("Conjunto unido correctamente");
        return conjunto;
    }
    public String nombreDelConjunto(){
        return conjunto1.getNombre();
    }
    public Conjunto diferenciaEntreConjuntos(){
        return conjunto2;
    }
}
