package fabricMethod;

public abstract class ItemToy implements Comparable<Toy> {
    private int id;
    private String name;
    private double probabilityOfLoss;

    public ItemToy(int id, String name, double probabilityOfLoss) {
        this.id = id;
        this.name = name;
        this.probabilityOfLoss = probabilityOfLoss;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getProbabilityOfLoss() {
        return probabilityOfLoss;
    }


    @Override
    public String toString() {
        return String.format("Id: %s name: %s probabilityOfLoss: %s", id, name, probabilityOfLoss);
    }
}
