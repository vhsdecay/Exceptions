package lesson3;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class UserDataFileWriterImpl implements UserDataFileWriter {
    @Override
    public void writeUserData() throws IOException {
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        UserData ps = new UserData();
        ps.parseData();
        String userDataString = String.join(" ", ps.getfirstName(), ps.getLastName(),
                ps.getMiddleName(), df.format(ps.getYearOfBirth()), String.valueOf(ps.getNumberPhone()),
                ps.getGender());
        FileWriter writer = new FileWriter("lesson3/date/"+ ps.getfirstName() + ".txt", true);
        writer.write(userDataString +'\n');
        writer.close();
        System.out.println("Данные успешно записанны в файл" );
    }
}
