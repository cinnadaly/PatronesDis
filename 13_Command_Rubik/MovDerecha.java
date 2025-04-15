public class MovDerecha implements Mover{
    private  Cubo cubo;
    public MovDerecha(Cubo cubo){
        this.cubo = cubo;
    }
    @Override
    public void movimiento(){
        cubo.girarDerecha();
    }
}
