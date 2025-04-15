public class publicadoraC implements Publicadora{
    private final String nombre;

    public publicadoraC(String nombre){
        this.nombre=nombre;
    }
    @Override
    public void mostrarLibro(String titulo){
        System.out.println("Título: " + titulo + ", Publicadora: " + nombre);
    }
}
