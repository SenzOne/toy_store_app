package Controller;

import Model.DataParser;
import Model.GetDataFromTheConsole;
import Model.GettingWithProbability;
import Model.PriorityQueueToy;
import fabricMethod.Toy;
import fabricMethod.ToyGen;

import java.util.ArrayList;


public class Controller {
    GetDataFromTheConsole getData = new GetDataFromTheConsole();
    DataParser parser = new DataParser();
    ToyGen toyGenerator = new ToyGen();
    PriorityQueueToy priorityQueueToy = new PriorityQueueToy();
    GettingWithProbability gettingWithProbability = new GettingWithProbability();


    public void createAndGetToy() {
        char exit = 'y';
        while ('n' != exit) {
            //String data = getData.PromptToy();
            // parser.parseData(data);
            // Toy toy = toyGenerator.createToy(parser.getId(), parser.getName(), parser.getProbabilityOfLoss());
            // priorityQueueToy.addToQueue(toy);
            Toy toy = new Toy(1, "lego", 0.1);
            Toy toy2 = new Toy(2, "robot", 0.1);
            Toy toy3 = new Toy(3, "car", 0.8);
            gettingWithProbability.addToy(toy);
            gettingWithProbability.addToy(toy2);
            gettingWithProbability.addToy(toy3);
            exit = getData.PromptExit();
        }
    }

    public void addToQueue() {
        // gettingWithProbability.calculateTheProbability(); // генерируем список индексов
        int i = 3;
        while (i > 0) {

            Toy toy = gettingWithProbability.getRandomToy(); // возврощаем случайную игрушку этого индекса
            System.out.printf("Выпала игрушка %s", toy);
            gettingWithProbability.removeToy(toy);
            i--;
        }
    }


    public void show() {
        priorityQueueToy.showQ();
    }
}
