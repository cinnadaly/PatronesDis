public class Main {
    public static void main(String[] args) {
        System.out.println("Actividad logger singleton :)\n");

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Soy un mensaje!");
        logger2.log("Y yo otro :0");
    }
}