public class Coche extends Transito{
    public Coche(String name, Policia policia){
        super(name,policia);
    }
    @Override
    public void getMsj(String mensaje){
        System.out.println(name + " se le indica  " + mensaje);
    }
}
