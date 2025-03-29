public class BancoReal implements ServicioBanco {
    @Override
    public void realizarOp(String user, String rol){
        System.out.println("Realizando operacion...");
        System.out.println("\nOperacion realizada exitosamente por: " + user +"\n");
    }
}
