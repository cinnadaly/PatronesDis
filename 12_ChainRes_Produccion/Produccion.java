public abstract class Produccion {
    protected Produccion siguiente;

    public void setSiguiente(Produccion siguiente) {
        this.siguiente = siguiente;
    }
    public abstract void procesar(Producto producto);


}
