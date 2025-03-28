public class Main {
    public static void main(String[] args) {
        System.out.println("Metodo prototype");
        //Carro c = new Carro("Ford Fiesta", 4, 50.2F);
        //Carro c2 = new Carro(c.getNombre(), c.llantas, 50F);
        //System.out.printf("c = %s\n", c.toString());
        //Carro c2 = c.clone();
        //System.out.println(c2.toString());
        //System.out.printf("c2 = %s\n", c2.toString());


        Bala b1 = new Bala("B1", 5);
        System.out.printf("b1 = %s\n", b1.toString());
        Bala b2 = b1.clone();
        System.out.printf("b2 = %s\n", b2.toString());
    }
}