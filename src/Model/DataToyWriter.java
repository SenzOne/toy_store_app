package Model;

import fabricMethod.Toy;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Класс для записи информации об игрушках в файл.
 */
public class DataToyWriter {
    private final String fileName;

    /**
     * Конструктор для инициализации имени файла.
     *
     * @param fileName Имя файла, в который будет производиться запись информации об игрушках.
     */
    public DataToyWriter(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Записывает информацию об игрушке в файл.
     *
     * @param toy Игрушка для записи в файл.
     */
    public void writeToyToFile(Toy toy){
        createFile(toy);
    }

    /**
     * Создает файл, если он не существует, и записывает информацию об игрушке.
     *
     * @param toy Игрушка для записи в файл.
     */
    private void createFile(Toy toy) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(toy.toString() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
