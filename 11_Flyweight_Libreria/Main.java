public class Main {
    public static void main(String[] args) {
        System.out.println("Implementacion Flyweight Libreria\n");
        PublicadoraFactory pf = new PublicadoraFactory();
        publicadoraC P1 = pf.getPublicadora("Editorial GP");
        publicadoraC P2 =  pf.getPublicadora("Editorial KN");

        P1.mostrarLibro("El principito");
        P1.mostrarLibro("La Metamorfosis");
        P2.mostrarLibro("Atlas de los animales");
    }
}