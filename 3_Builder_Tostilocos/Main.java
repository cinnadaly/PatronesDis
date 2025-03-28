public class Main {
    public static void main(String[] args) {
        System.out.println("Actividad 3 Builder de tostilocos");
        TostilocoBuilder tb = new TostilocoBuilder();
        Tostiloco tostilocos = tb.setCueritos("si").setTostitos("flamin' hot").setPepino("si").setCacahuates("no").setJicama("si").setSalsa("si").getTostiloco();
        System.out.println(tostilocos.toString());
    }
}