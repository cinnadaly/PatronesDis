package Colores;
import Figuras.Figura;

public abstract class RellenoColor {
    protected Figura figura;

    protected RellenoColor(Figura figura){
        this.figura = figura;
    }
    public abstract void ColorearFigura();
}
