package lesson3;

import java.io.IOException;

public class Program {
    public static void main(String[] args){
        UserDataFileWriter fileWriter = new UserDataFileWriterImpl();
        try {
            fileWriter.writeUserData();
        } catch (IOException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
