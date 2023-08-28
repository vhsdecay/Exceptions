package lesson2;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        System.out.printf("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equals("")) {
            throw new RuntimeException("Пустые строки вводить нельзя!");
        } else {
            System.out.println("Ваш текст: " + string);
            scanner.close();
        }
    }
}
