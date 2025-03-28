public class HornoGrande implements AbstractFactory{

    @Override
    public pizzaIt cocinarIt() {
        return new grandeIt();
    }

    @Override
    public pizzaMex cocinarMex() {
        return new grandeMex();
    }
}
