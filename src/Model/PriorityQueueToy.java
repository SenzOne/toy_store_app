package Model;

import fabricMethod.Toy;
import java.util.PriorityQueue;

/**
 * Класс, представляющий приоритетную очередь игрушек.
 */
public class PriorityQueueToy {
    private final PriorityQueue<Toy> priorityQueue = new PriorityQueue<>();

    /**
     * Добавляет игрушку в приоритетную очередь.
     *
     * @param toy Игрушка для добавления в очередь.
     */
    public void addToQueue(Toy toy){
        priorityQueue.add(toy);
    }

    /**
     * Выводит содержимое приоритетной очереди на экран.
     */
    public void showQ(){
        System.out.println(priorityQueue);
    }

    /**
     * Извлекает и возвращает игрушку с наивысшим приоритетом из очереди.
     *
     * @return Игрушка с наивысшим приоритетом.
     */
    public Toy getToy(){
        return priorityQueue.poll();
    }
}
