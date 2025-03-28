public class Main {

    private pizzaIt PI;
    private pizzaMex PM;

    private Main(AbstractFactory factory) {
        PI = factory.cocinarIt();
        PM = factory.cocinarMex();
    }

    private void abrir(){
        PI.open();
        PM.open();
    }

    public static void main(String[] args) {
        System.out.println("Bienvenidos a Pizzeria nady :3!");

        HornoFam hornoF = new HornoFam();
        Main app = new Main(hornoF);
        app.abrir();
    }
}