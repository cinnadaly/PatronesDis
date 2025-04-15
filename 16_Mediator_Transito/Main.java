public class Main {
    public static void main(String[] args) {
        System.out.println("Policia de transito, metodo Mediator\n");

        PoliciaC policia = new PoliciaC();
        
        Transito coche1 = new Coche("Fiat verde",policia);
        Transito bus1 = new Bus("Camion negro",policia);

        policia.registrarTransito(coche1);
        policia.registrarTransito(bus1);

        coche1.sendMsj("Quiere cruzar la calle");
        bus1.sendMsj("Dara vuelta a la izquierda");


    }
}