package Colores;
import Figuras.Figura;

public class Verde extends  RellenoColor{
    public Verde(Figura figura) {
        super(figura);
    }

    public void ColorearFigura() {
        System.out.print("Coloreando de verde~");
    }
}
