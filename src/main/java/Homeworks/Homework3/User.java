package Homeworks.Homework3;
/*
Форматы данных:
фамилия, имя, отчество - строки
датарождения - строка формата dd.mm.yyyy
номертелефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.
 */
public class User {
    private String firstName;
    private String lastName;
    private String surname;
    private String birthday;
    private long phoneNumber;
    private char gender;

    public User(String firstName, String lastName, String surname, String birthday, long phoneNumber, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surname = surname;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "<" + lastName +
                "><" + firstName +
                "><" + surname +
                "><" + birthday +
                "><" + phoneNumber +
                "><" + gender +
                ">\n";
    }
}
