package Colores;
import Figuras.Figura;

public class Rojo extends RellenoColor{
    public Rojo(Figura figura) {
        super(figura);
    }

    public void ColorearFigura() {
        System.out.print("Coloreando de rojo~");
    }
}
