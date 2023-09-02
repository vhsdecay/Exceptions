package lesson3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserData {

    private String firstName;
    private String lastName;
    private String middleName;
    private Date yearOfBirth;
    public int numberPhone;
    private String gender;


    public void parseData(){

        InputData data = new InputData();
        ParserData parserData = new ParserData();
        String[] arrayData = data.inputData();

        firstName = (parserData.parseName(arrayData[0], "имя"));
        lastName = (parserData.parseName(arrayData[1], "фамилия"));
        middleName = (parserData.parseName(arrayData[2], "отчество"));
        yearOfBirth = (parserData.parseData(arrayData[3]));
        numberPhone = parserData.parseNum(arrayData[4]);
        gender = parserData.parseGender(arrayData[5]);
    }

    public String getfirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getYearOfBirth() {
        return yearOfBirth;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public String getGender() {
        return gender;
    }
}
