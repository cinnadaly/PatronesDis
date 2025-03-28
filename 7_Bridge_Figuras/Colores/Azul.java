package Colores;
import Figuras.Figura;

public class Azul extends RellenoColor{
    public Azul(Figura figura) {
        super(figura);
    }

    public void ColorearFigura() {
        System.out.print("Coloreando de azul~");
    }
}
