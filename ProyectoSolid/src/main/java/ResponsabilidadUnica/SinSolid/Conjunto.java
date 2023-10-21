package ResponsabilidadUnica.SinSolid;

public class Conjunto {
    private int cantidadElementos;
    private  int datos [];

    public String nombre;

    public void ingresarDatos(int dato){
        System.out.println("Dato ingresado correctamente = " + dato );
    }
    public void eliminarDatos(int dato){
        System.out.println("Dato eliminado correctamente = " + dato );
    }

    public int totalElementos(){
       return getCantidadElementos();
    }
    public int getCantidadElementos() {
        return cantidadElementos;
    }
    public int sumatoria(){

        System.out.println("La sumatoria del conjunto es = ");
        return 40;
    }
    public String imprimirConjunto(){
        String mensaje= "Conjunto impreso";
        return mensaje;
    }
    public int obtenerConjunto(int dato){
        System.out.println("Dato obtenido= ");
        return dato;
    }
    public boolean compararConjuntos(Conjunto conjunto){
        System.out.println("Conjunto comparado correctamente");
        return false;
    }
    public Conjunto unirConjunto(Conjunto conjunto){
        System.out.println("Conjunto unido correctamente");
        return conjunto;
    }
    public String nombreDelConjunto(){
        return nombre;
    }

    public Conjunto(String nombre) {
        this.nombre = nombre;
    }
}
