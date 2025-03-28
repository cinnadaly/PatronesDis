public class Bala implements Prototype{
    private String nombre;
    public int posicion;

    public Bala(){}

    public Bala(String nombre, int posicion ){
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public Bala clone() {
        return new Bala(this.nombre, this.posicion);

    }

    @Override
    public String toString(){
        return "Bala disparada: " + nombre + ", posicion: " + posicion;
    }

}
