package Model;

import fabricMethod.Toy;

import java.util.PriorityQueue;

public class PriorityQueueToy {
    private final PriorityQueue<Toy> priorityQueue = new PriorityQueue<>();

    public void addToQueue(Toy toy){
        priorityQueue.add(toy);
    }

    public void showQ(){
        System.out.println(priorityQueue);
    }
}
