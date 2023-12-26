import Controller.Controller;
import fabricMethod.ItemToy;
import fabricMethod.Toy;
import fabricMethod.ToyGen;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createAndGetToy();
        controller.addToQueue();
        controller.addToQueue();
        controller.addToFile();
    }
}