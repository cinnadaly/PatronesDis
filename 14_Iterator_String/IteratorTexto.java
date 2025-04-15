public class IteratorTexto implements Iterator{
    private Texto texto;
    private int pos = 0;

    public IteratorTexto(Texto texto){
        this.texto = texto;
    }
    @Override
    public boolean hasNext() {
        return pos < texto.getContent().length();
    }
    @Override
    public char nextChar() {
        return texto.getContent().charAt(pos++);
    }
}
