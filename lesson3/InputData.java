package lesson3;

import lesson3.exeptions.ArrayDataSizeEx;
import java.util.Scanner;

public class InputData {
    public String[] inputData() {
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные через ПРОБЕЛ (Ф.И.О, дату рождения - dd.mm.yyyy, телефон (6цифр без знаков), пол - f/m ): ");
            try {
                String data = scan.nextLine();
                String[] arrayData = data.split(" ");
                if (arrayData.length == 6){
                    return arrayData;
                } else if (arrayData.length < 6) {
                    throw new ArrayDataSizeEx("Вы ввели менее 6 значений, повторите попытку !");
                } else {
                    throw new ArrayDataSizeEx("Вы ввели больше 6 значений, повторите попытку !");
                }
            } catch (ArrayDataSizeEx e) {
                System.out.println("Ошибка! " + e.getMessage());
            }
        }
    }

}
