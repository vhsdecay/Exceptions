package lesson3;

import lesson3.exeptions.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.Scanner;

public class ParserData {

    public String parseName(String name, String id){
        String result = "";
        while (true){
            try {
                if (name.matches("[A-Za-z]+") == false){
                    throw new NumEx(" может содержать только буквы.");
                } else if (name.length() < 2 || name.length() > 10){
                    throw new NumEx(" короче 2 или длиннее 7 символов.");
                } else {
                    result = name;
                    break;
                }
            } catch (NumberFormatException e){
                System.out.println("Ошибка! " + id + e.getMessage());
                System.out.printf("Повторите ввод %s: ", id);
                Scanner in = new Scanner(System.in);
                name = in.nextLine();
            }
        }
        return result;
    }

    public Date parseData(String stringDate){
        Scanner in = new Scanner(System.in);
        while (true){
            DateFormat date = new SimpleDateFormat("dd.MM.yyyy");
            try{
                Date nDate1 = date.parse(stringDate);
                return nDate1;
            } catch(Exception e){
                System.out.printf("Ошибка! Повторите ввод даты (dd.MM.yyyy): ");
                stringDate = in.nextLine();
            }
        }
    }

    public int parseNum(String num){
        int result = 0;
        while (true){
            try {
                 if (num.matches("\\d+") == false){
                    throw new NumEx("Номер должен содержать только цифры");
                } else if (num.length() != 6){
                    throw new NumEx("Номер должен размером 6 символов");
                } else {
                    result = Integer.parseInt(num);
                    break;
                }
            } catch (NumberFormatException e){
                System.out.println("Ошибка! " + e.getMessage());
                System.out.printf("Повторите ввод номера: ");
                Scanner in = new Scanner(System.in);
                String numInput = in.nextLine();
                num = numInput;
            }
        }
        return result;
    }

    public String parseGender(String gender){
        String result = "";
        while (true){
            try {
                if (gender.equals("f")) {
                    result = gender;
                    break;
                } else if (gender.equals("m")) {
                    result = gender;
                    break;
                } else {
                    throw new ParseEx("Пол может быть только (f/m)");
                }
            } catch (ParseEx e){
                System.out.println("Ошибка! " + e.getMessage());
                System.out.printf("Повторите ввод пола: ");
                Scanner in = new Scanner(System.in);
                String gen = in.nextLine();
                gender = gen;
            }
        }
        return result;
    }
}
