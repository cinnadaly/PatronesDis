public abstract class Transito {
    protected Policia policia;
    protected String name;

    public Transito(String name, Policia policia) {
        this.name = name;
        this.policia = policia;
    }
    public abstract void getMsj(String mensaje);
    public void sendMsj(String mensaje) {
        policia.sendMsj(mensaje, this);
    }
    public String getName(){
        return name;
    }
}
