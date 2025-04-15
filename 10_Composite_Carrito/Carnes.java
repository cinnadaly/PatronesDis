public class Carnes implements Carrito{
    private String producto;

    public Carnes(String producto){
        this.producto = producto;
    }

    @Override
    public void anadir(){
        System.out.printf("Anadiendo %s del pasillo de carnes al carrito\n",producto);
    }
}
