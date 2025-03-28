import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Creacion de figuras\n");
        Factory f = new Factory();
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una opcion (1,2,3,4,5): ");
        String valor = s.nextLine();
        Figura test = f.getInstance(valor);
        test.mostrar();
    }

}