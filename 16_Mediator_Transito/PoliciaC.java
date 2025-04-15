import java.util.ArrayList;
import java.util.List;
public class PoliciaC implements Policia{
    private List<Transito>  transitos = new ArrayList<>();

    public void registrarTransito(Transito transito){
        transitos.add(transito);
    }
    @Override
    public void sendMsj(String mensaje, Transito sender) {
        for(Transito t : transitos){
            if(t != sender){
                t.getMsj("Mensaje de Policia sobre " + sender.getName() + ": " + mensaje);
            }
        }
    }
}
