package Model;

import fabricMethod.Toy;

import java.util.ArrayList;
import java.util.Random;


public class GettingWithProbability {
    private final ArrayList<Toy> toyArrayList = new ArrayList<>();
    private final ArrayList<Integer> randomId = new ArrayList<>();

    public void addToy(Toy toy) {
        toyArrayList.add(toy);
        recalculateProbability();
    }


    public void removeToy(Toy toy) {
        toyArrayList.remove(toy);
        recalculateProbability();
    }

    private void recalculateProbability() {
        randomId.clear();
        for (Toy toy : toyArrayList) {
            int countIdToys = (int) (toy.getProbabilityOfLoss() * toyArrayList.size() * 10);
            for (int j = 0; j < countIdToys; j++) {
                randomId.add(toy.getId());
            }
        }
    }

    public Toy getRandomToy() {
        if (randomId.isEmpty()) {
            System.out.println("Игрушки закончались");
            return null; // Проверка на пустой список randomId
        }

        Random rnd = new Random();
        int randomIndex = rnd.nextInt(randomId.size());
        int randomToyId = randomId.get(randomIndex);

        for (Toy toy : toyArrayList) {
            if (toy.getId() == randomToyId) {
                return toy;
            }
        }

        return null; // В случае, если игрушка не была найдена
    }
}
