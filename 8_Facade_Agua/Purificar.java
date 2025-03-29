public class Purificar {
    private Agua agua;
    private  Filtro filtro;
    private Cubeta cubeta;

    public Purificar(Agua agua, Filtro filtro, Cubeta cubeta) {
        this.agua = agua;
        this.filtro = filtro;
        this.cubeta = cubeta;
    }
    public void iniciar(){
        cubeta.llenarCubeta();
        agua.aguaSucia();
        cubeta.vaciarCubeta();
        filtro.prender();
        System.out.println("Iniciando purificacion");
    }
    public void terminar(){
        filtro.apagar();
        cubeta.llenarCubeta();
        System.out.println("Terminando purificacion");
        agua.aguaLimpia();
    }
}
