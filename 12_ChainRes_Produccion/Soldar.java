public class Soldar extends Produccion{
    @Override
    public void procesar(Producto producto){
        if(producto.getPlaca() !=null){
            producto.setSoldado(true);
            System.out.println("Paso 2: La placa se ha soldado.");
        }
        if (siguiente != null){
            siguiente.procesar(producto);
        }
    }
}
