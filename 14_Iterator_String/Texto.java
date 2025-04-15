public class Texto {
    private String content;

    public Texto(String content) {
        this.content = content;
    }
    public Iterator createIterator() {
        return new IteratorTexto(this);
    }
    public String getContent() {
        return content;
    }
}
