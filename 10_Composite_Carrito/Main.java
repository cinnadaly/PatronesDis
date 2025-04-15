public class Main {
    public static void main(String[] args) {
        System.out.println("Carrito de compras composite");

        Carnes c1 = new Carnes("Pollo");
        Carnes c2 = new Carnes("Res");
        Verduras v1 = new Verduras("Lechuga");
        Enlatados e1 = new Enlatados("Elotitos");

        c1.anadir();
        System.out.println("-----------");

        Composito composito = new Composito();
        composito.agregar(c1);
        composito.agregar(c2);
        composito.agregar(v1);
        composito.agregar(e1);
        composito.anadir();
    }
}