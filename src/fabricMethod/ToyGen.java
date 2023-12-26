package fabricMethod;

/**
 * Класс, реализующий интерфейс ToyGeneration для генерации игрушек.
 */
public class ToyGen implements ToyGeneration {

    /**
     * Создает новый объект игрушки.
     *
     * @param id               Уникальный идентификатор игрушки.
     * @param name             Название игрушки.
     * @param probabilityOfLoss Вероятность выпадения игрушки.
     * @return Новый объект игрушки типа Toy с указанными параметрами.
     */
    @Override
    public Toy createToy(int id, String name, double probabilityOfLoss) {
        return new Toy(id, name, probabilityOfLoss);
    }
}
