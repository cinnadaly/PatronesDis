public class Factory {

    public Figura getInstance(String select)
    {
        switch(select)
        {
            case "1":
                return new Circulos();
            case "2":
                return new Cuadrados();
            case "3":
                return new Rectangulos();
            case "4":
                return new Triangulos();
            case "5":
                return new Ovalos();
            default:
                return null; //mala practica lol, no hacer
        }
    }
}
