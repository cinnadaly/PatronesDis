public class ProxyBanco implements ServicioBanco {
    private BancoReal bancor;

    public  ProxyBanco(){
    this.bancor = new BancoReal();
    }

    @Override
    public void realizarOp(String user, String rol){
       if("admin".equals(rol)){
           bancor.realizarOp(user,rol);
       }
       else {
           System.out.println("Acceso rechazado para " +user);
           System.out.println("Es requerido el rol de administrador.\n");
       }
    }
}
