public class Tostiloco {
    private String cueritos;
    private String tostitos;
    private String pepino;
    private String cacahuates;
    private String jicama;
    private String salsa;

    public Tostiloco(
            String cueritos,
            String tostitos,
            String pepino,
            String cacahuates,
            String jicama,
            String salsa
    ){
        this.cueritos = cueritos;
        this.tostitos = tostitos;
        this.pepino = pepino;
        this.cacahuates = cacahuates;
        this.jicama = jicama;
        this.salsa = salsa;
    }
    @Override
    public String toString(){
        return "Tostitos preparados! \ncueritos= "+cueritos+
                ", \ntostitos= "+tostitos+", \npepino= "+pepino+
                ", \ncacahuates= "+cacahuates+", \njicama= "+jicama+
                ", \nsalsa= "+salsa+"\nProvecho! :)";
    }
}
