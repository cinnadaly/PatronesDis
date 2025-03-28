public class adaptadorTele implements Television{
    private teleAntigua teleAntigua;
    public adaptadorTele(){
        this.teleAntigua = new teleAntigua();
    }
    @Override
    public void transmitir(){
        teleAntigua.reproducir();
    }
}
