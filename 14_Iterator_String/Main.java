public class Main {
    public static void main(String[] args) {
        System.out.println("Patron iterator, mostrar caracteres de un String\n");
        Texto texto = new Texto("Probando 1 2 3");
        Iterator iterador = texto.createIterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.nextChar());
        }

    }
}