public class MovEnfrente implements Mover{
    private Cubo cubo;
    public MovEnfrente(Cubo cubo){
        this.cubo = cubo;
    }
    @Override
    public void movimiento(){
        cubo.girarEnfrente();
    }
}
