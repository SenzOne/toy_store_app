package fabricMethod;

/**
 * Абстрактный класс, представляющий игрушку.
 * Реализует интерфейс Comparable для сравнения игрушек.
 */
public abstract class ItemToy implements Comparable<Toy> {
    private int id; // Уникальный идентификатор игрушки
    private int idInTheQueue; // Идентификатор в очереди
    private final String name; // Название игрушки
    private double probabilityOfLoss; // Вероятность потери игрушки

    /**
     * Конструктор для создания объекта ItemToy.
     * @param id Уникальный идентификатор игрушки.
     * @param name Название игрушки.
     * @param probabilityOfLoss Вероятность потери игрушки.
     */
    public ItemToy(int id, String name, double probabilityOfLoss) {
        this.id = id;
        this.name = name;
        this.probabilityOfLoss = probabilityOfLoss;
    }

    /**
     * Устанавливает идентификатор в очереди.
     * @param idInTheQueue Идентификатор в очереди для установки.
     */
    public void setIdInTheQueue(int idInTheQueue) {
        this.idInTheQueue = idInTheQueue;
    }

    /**
     * Получает идентификатор в очереди.
     * @return Идентификатор в очереди.
     */
    public int getIdInTheQueue() {
        return idInTheQueue;
    }

    /**
     * Получает уникальный идентификатор игрушки.
     * @return Уникальный идентификатор игрушки.
     */
    public int getId() {
        return id;
    }

    /**
     * Получает название игрушки.
     * @return Название игрушки.
     */
    public String getName() {
        return name;
    }

    /**
     * Получает вероятность потери игрушки.
     * @return Вероятность потери игрушки.
     */
    public double getProbabilityOfLoss() {
        return probabilityOfLoss;
    }

    /**
     * Переопределенный метод toString для вывода информации об игрушке.
     * @return Информация об игрушке в виде строки.
     */
    @Override
    public String toString() {
        return String.format("Id: %s name: %s probabilityOfLoss: %s", id, name, probabilityOfLoss);
    }
}
