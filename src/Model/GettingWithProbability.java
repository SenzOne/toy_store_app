package Model;

import fabricMethod.Toy;

import java.util.ArrayList;
import java.util.Random;

/**
 * Класс для моделирования получения игрушек с учетом их вероятности выпадения.
 */
public class GettingWithProbability {

    // Массив, содержащий игрушки
    private final ArrayList<Toy> toyArrayList = new ArrayList<>();

    // Массив, содержащий идентификаторы игрушек с учетом их вероятности выпадения
    private final ArrayList<Integer> randomId = new ArrayList<>();

    /**
     * Метод для добавления новой игрушки в массив и пересчета вероятности выпадения.
     *
     * @param toy Новая игрушка для добавления
     */
    public void addToy(Toy toy) {
        toyArrayList.add(toy);
        recalculateProbability();
    }

    /**
     * Метод для удаления игрушки из массива и пересчета вероятности выпадения.
     *
     * @param toy Игрушка для удаления
     */
    public void removeToy(Toy toy) {
        toyArrayList.remove(toy);
        recalculateProbability();
    }

    /**
     * Приватный метод для пересчета вероятности выпадения игрушек.
     * Очищает массив идентификаторов и пересчитывает его на основе вероятности каждой игрушки.
     */
    private void recalculateProbability() {
        randomId.clear();
        for (Toy toy : toyArrayList) {
            int countIdToys = (int) (toy.getProbabilityOfLoss() * toyArrayList.size() * 10);
            for (int j = 0; j < countIdToys; j++) {
                randomId.add(toy.getId());
            }
        }
    }

    /**
     * Метод для получения случайной игрушки с учетом их вероятности выпадения.
     *
     * @return Случайная игрушка
     */
    public Toy getRandomToy() {
        if (randomId.isEmpty()) {
            System.out.println("Игрушки закончились");
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
