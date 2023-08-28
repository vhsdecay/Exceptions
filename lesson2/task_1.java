package lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_1 {
    public static void main(String[] args) {
        boolean work = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(work){
            System.out.print("Введите дробное число: ");
            try{
                float fNumber = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно %.3f\n", fNumber);
                work = false;
            } catch (IOException|NumberFormatException e) {
                System.out.println("Неверный ввод. Введите дробное число!!!");
            }

        }
    }
}
