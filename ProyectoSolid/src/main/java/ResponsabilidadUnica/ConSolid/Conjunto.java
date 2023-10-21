package ResponsabilidadUnica.ConSolid;

public class Conjunto {
    private int cantidadElementos;
    private int datos[];
    private String nombre;

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
    public String nombreDelConjunto(){
        return nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Conjunto(String nombre) {
        this.nombre = nombre;
    }

}
