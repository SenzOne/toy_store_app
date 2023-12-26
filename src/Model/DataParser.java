package Model;

/**
 * Класс для парсинга данных и извлечения информации об объекте игрушки.
 */
public class DataParser {
    private String name;
    private int id;
    private double probabilityOfLoss;

    /**
     * Метод для парсинга данных и заполнения полей объекта игрушки.
     *
     * @param data Строка данных для парсинга.
     */
    public void parseData(String data){
        String[] inputData = data.split(" ");
        setId(inputData[0]);
        setProbabilityOfLoss(inputData[inputData.length - 1]);
        setName((data.substring(inputData[0].length(), data.length() - inputData[inputData.length - 1].length()).trim()));
    }

    /**
     * Устанавливает идентификатор игрушки.
     *
     * @param strId Строковое представление идентификатора для установки.
     */
    private void setId(String strId){
        this.id = Integer.parseInt(strId);
    }

    /**
     * Устанавливает название игрушки.
     *
     * @param name Название игрушки для установки.
     */
    private void setName(String name){
        this.name = name;
    }

    /**
     * Устанавливает вероятность потери игрушки.
     *
     * @param strProbabilityOfLoss Строковое представление вероятности потери для установки.
     */
    private void setProbabilityOfLoss(String strProbabilityOfLoss){
        this.probabilityOfLoss = Double.parseDouble(strProbabilityOfLoss);
    }

    /**
     * Получает название игрушки.
     *
     * @return Название игрушки.
     */
    public String getName() {
        return name;
    }

    /**
     * Получает идентификатор игрушки.
     *
     * @return Идентификатор игрушки.
     */
    public int getId() {
        return id;
    }

    /**
     * Получает вероятность потери игрушки.
     *
     * @return Вероятность потери игрушки.
     */
    public double getProbabilityOfLoss() {
        return probabilityOfLoss;
    }
}
