public class TostilocoBuilder {
    private String cueritos;
    private String tostitos;
    private String pepino;
    private String cacahuates;
    private String jicama;
    private String salsa;

    public TostilocoBuilder setCueritos(String cueritos){
        this.cueritos = cueritos;
        return this;
    }
    public TostilocoBuilder setTostitos(String tostitos){
        this.tostitos = tostitos;
        return this;
    }
    public TostilocoBuilder setPepino(String pepino){
        this.pepino = pepino;
        return this;
    }
    public TostilocoBuilder setCacahuates(String cacahuates){
        this.cacahuates = cacahuates;
        return this;
    }
    public TostilocoBuilder setJicama(String jicama){
        this.jicama = jicama;
        return this;
    }
    public TostilocoBuilder setSalsa(String salsa){
        this.salsa = salsa;
        return this;
    }

    public Tostiloco getTostiloco(){
        return new Tostiloco(cueritos, tostitos, pepino, cacahuates, jicama, salsa);
    }
}
