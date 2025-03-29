public class Main {
    public static void main(String[] args) {
        System.out.println("Purificador de agua\n");
        Agua a = new Agua();
        Filtro f = new Filtro();
        Cubeta c = new Cubeta();
        Purificar purificar = new Purificar(a,f,c);

        purificar.iniciar();
        System.out.println();
        purificar.terminar();
    }
}