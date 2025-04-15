public class MovIzquierda implements Mover{
    private  Cubo cubo;
    public MovIzquierda(Cubo cubo){
        this.cubo = cubo;
    }
    @Override
    public void movimiento(){
        cubo.girarIzquierda();
    }
}
