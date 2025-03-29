public class Main {
    public static void main(String[] args) {
        ServicioBanco banco = new ProxyBanco();

        banco.realizarOp("Juanin","admin");
        banco.realizarOp("Carlos","cliente");
    }
}