package fabricMethod;

public class Toy extends ItemToy {

    public Toy(int id, String name, double probabilityOfLoss) {
        super(id, name, probabilityOfLoss);
    }
    

    /**
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Toy o) {
        return this.getId() - o.getId();
    }
}
