package Controller;

import Model.DataParser;
import Model.GetDataFromTheConsole;
import Model.PriorityQueueToy;
import fabricMethod.Toy;
import fabricMethod.ToyGen;

import java.util.PriorityQueue;

public class Controller {
    GetDataFromTheConsole getData = new GetDataFromTheConsole();
    DataParser parser = new DataParser();
    ToyGen toyGenerator = new ToyGen();
    PriorityQueueToy priorityQueueToy = new PriorityQueueToy();

    public void createAndGetToy(){
        String data = getData.Prompt();
        parser.parseData(data);
        Toy toy = toyGenerator.createToy(parser.getId(), parser.getName(), parser.getProbabilityOfLoss());
        priorityQueueToy.addToQueue(toy);
    }

    public void show(){
        priorityQueueToy.showQ();
    }
}
