import java.util.HashMap;

public class PublicadoraFactory {
    private HashMap<String, publicadoraC> libros = new HashMap<>();

    public publicadoraC getPublicadora(String nombre){
        publicadoraC libro = libros.get(nombre);
        if(libro == null){
            libro = new  publicadoraC(nombre);
            libros.put(nombre, libro);
        }
        return libro;
    }
}
