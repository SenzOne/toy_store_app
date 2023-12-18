package Model;

import java.util.Scanner;

public class GetDataFromTheConsole {

    public String Prompt(){

        System.out.println("Введите данные: ");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        return data;
    }
}



