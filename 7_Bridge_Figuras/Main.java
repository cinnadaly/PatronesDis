import Figuras.Circulo;
import Figuras.Figura;
import Figuras.Triangulo;
import Colores.Azul;
import Colores.Rojo;
import Colores.Verde;

public class Main {
    public static void main(String[] args) {

        Triangulo figura = new Triangulo();
        figura.dibujar();
        Azul color = new Azul(figura);
        color.ColorearFigura();

        System.out.println("\n");
        Circulo figura2 = new Circulo();
        figura2.dibujar();
        Rojo color2 = new Rojo(figura2);
        color2.ColorearFigura();

    }
}