public class Verduras implements Carrito{
    private String producto;

    public Verduras(String producto){
        this.producto = producto;
    }

    @Override
    public void anadir(){
        System.out.printf("Anadiendo %s del pasillo de verduras al carrito\n",producto);
    }
}
