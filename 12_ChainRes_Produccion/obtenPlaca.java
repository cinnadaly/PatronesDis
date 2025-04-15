public class obtenPlaca extends Produccion{
    @Override
    public  void procesar(Producto producto){
    producto.setPlaca("Placa base generada");
    System.out.println("Paso 1: La placa se ha obtenido.");
    if (siguiente != null){
        siguiente.procesar(producto);
    }
    }
}
