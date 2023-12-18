package Model;

import java.util.Scanner;

public class GetDataFromTheConsole {

    public String PromptToy(){
        System.out.println("Введите данные в формате id название вероятность: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public char PromptExit(){
        System.out.println("добавить еще игрушек? y/n");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }
}



