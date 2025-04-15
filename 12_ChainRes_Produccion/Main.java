public class Main {
    public static void main(String[] args) {
        System.out.println("Linea de produccion con Chain of Responsabilities.\n");
        Produccion obtenPlaca = new obtenPlaca();
        Produccion soldar = new Soldar();
        Produccion enviar = new Enviar();

        obtenPlaca.setSiguiente(soldar);
        soldar.setSiguiente(enviar);

        Producto producto = new Producto();
        obtenPlaca.procesar(producto);
    }
}