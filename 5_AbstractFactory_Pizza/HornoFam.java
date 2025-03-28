public class HornoFam implements AbstractFactory{

    @Override
    public pizzaIt cocinarIt() {
        return new famIt();
    }

    @Override
    public pizzaMex cocinarMex() {
        return new famMex();
    }
}
