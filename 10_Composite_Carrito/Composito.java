import java.util.List;
import java.util.ArrayList;

public class Composito implements Carrito{
    private List<Carrito> carrito = new ArrayList<>();

    public void agregar(Carrito c){
        carrito.add(c);
    }
    public void eliminar(Carrito c){
        carrito.remove(c);
    }

    @Override
    public void anadir(){
        for(Carrito c : carrito){
            c.anadir();
        }
    }

}
