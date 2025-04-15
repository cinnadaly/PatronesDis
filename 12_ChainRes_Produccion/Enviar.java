public class Enviar extends Produccion{
    @Override
    public void procesar(Producto producto){
        if (producto.isSoldado()){
            producto.setEnviado(true);
            System.out.println("Paso 3: El producto se ha enviado.");
        } else {
            System.out.println("Error: No es posible enviar un producto no soldado");
        }
    }
}
