public class Main {
    public static void main(String[] args) {
        System.out.println("Implementacion Command algoritmo de cubo rubik\n");
        Cubo cubo = new Cubo();

        Mover moverEnfrente = new MovEnfrente(cubo);
        Mover moverDerecha = new MovDerecha(cubo);
        Mover moverIzquierda = new MovIzquierda(cubo);

        Invoker control = new Invoker();

        control.Movimiento(moverEnfrente);
        control.Movimiento(moverDerecha);
        control.Movimiento(moverIzquierda);
    }
}