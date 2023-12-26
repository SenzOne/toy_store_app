package Controller;

import Model.*;
import fabricMethod.Toy;
import fabricMethod.ToyGen;


/**
 * Класс, управляющий процессом получения, обработки и распределения игрушек.
 */
public class Controller {
    GetDataFromTheConsole getData = new GetDataFromTheConsole();
    DataParser parser = new DataParser();
    ToyGen toyGenerator = new ToyGen();
    PriorityQueueToy priorityQueueToy = new PriorityQueueToy();
    GettingWithProbability gettingWithProbability = new GettingWithProbability();
    DataToyWriter toyWriter = new DataToyWriter("toy.txt");
    private int position = 1;

    /**
     * Метод для создания и получения игрушек с учетом вероятности их выпадения.
     */
    public void createAndGetToy() {
        char exit = 'y';
        while ('n' != exit) {
            String data = getData.PromptToy();
            parser.parseData(data);
            Toy toy = toyGenerator.createToy(parser.getId(), parser.getName(), parser.getProbabilityOfLoss());
            gettingWithProbability.addToy(toy);
            exit = getData.PromptExit();
        }
    }

    /**
     * Метод для добавления игрушки в очередь на выдачу.
     */
    public void addToQueue() {
        Toy toy = gettingWithProbability.getRandomToy();
        System.out.printf("Игрушка %s добавлена в очередь на выдачу\n", toy);
        toy.setIdInTheQueue(position);
        priorityQueueToy.addToQueue(toy);
        gettingWithProbability.removeToy(toy);
        position++;
    }

    /**
     * Метод для записи информации об игрушке в файл.
     *
     * @param toy Игрушка для записи в файл
     */
    public void addToFile() {
        for (int i = 0; i < position - 1 ; i++) {
            Toy toy = priorityQueueToy.getToy();
            System.out.printf(">>> %s записана в файл", toy);
            toyWriter.writeToyToFile(toy);
        }
    }

    /**
     * Метод для отображения игрушек, которые не попали в очередь на выдачу.
     */
    public void show() {
        System.out.println("Игрушки, которые не попали в очередь на выдачу:");
        priorityQueueToy.showQ();
    }
}
