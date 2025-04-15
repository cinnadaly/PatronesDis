public class Enlatados implements Carrito{
    private String producto;

    public Enlatados(String producto){
        this.producto = producto;
    }

    @Override
    public void anadir(){
        System.out.printf("Anadiendo %s del pasillo de enlatados al carrito\n",producto);
    }
}
