package fabricMethod;

public class ToyGen implements ToyGeneration{
    @Override
    public Toy createToy(int id, String name, double probabilityOfLoss) {
        return new Toy(id, name, probabilityOfLoss);
    }
}
