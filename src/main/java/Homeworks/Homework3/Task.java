package Homeworks.Homework3;

import java.io.*;

/*
Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
Фамилия Имя Отчество датарождения номертелефона пол

Форматы данных:
фамилия, имя, отчество - строки
датарождения - строка формата dd.mm.yyyy
номертелефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым,
вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано,
пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
в него в одну строку должны записаться полученные данные, вида:

<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано,
пользователь должен увидеть стектрейс ошибки.
 */
public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        task.go();

    }

    void go() {
        User user = createUser();
        if (user != null) {
            System.out.println(user);
            writeUserToFile(user);
        }
    }

    User createUser() {
        String firstName = "";
        String lastName = "";
        String surname = "";
        String birthday = "";
        long phoneNumber = 0;
        char gender = ' ';
        boolean wasFio = false;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String data = reader.readLine();
//            String data = "23.10.1992 Dechenko Egor Mikhaylovich 1234578 m";

            String[] info = data.split(" ");
            if (info.length != 6) {
                throw new RuntimeException("Expected 6 arguments, but found " + info.length);
            }

            for (int i = 0; i < info.length; i++) {
                if (isNumber(info[i])) {
                    phoneNumber = Long.parseLong(info[i]);
                } else if (info[i].split("\\.").length == 3) {
                    birthday = info[i];
                } else if (info[i].equals("m") || info[i].equals("f")) {
                    gender = info[i].charAt(0);
                } else if (i < info.length - 2 && !wasFio) {
                    lastName = info[i];
                    firstName = info[i + 1];
                    surname = info[i + 2];
                    i += 2;
                    wasFio = true;
                }
            }

            if (birthday.isEmpty()) throw new RuntimeException("Date is incorrect");
            if (gender == ' ') throw new RuntimeException("Gender is incorrect");
            if (phoneNumber == 0) throw new RuntimeException("Number is incorrect");

        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
            return null;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        User user = new User(firstName,lastName, surname, birthday, phoneNumber, gender);
        return user;
    }

    private boolean isNumber(String number) {
        try {
            Long.parseLong(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private void writeUserToFile(User user) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter("src/main/java/Homeworks/Homework3/"+ user.getLastName(), true))){
            br.write(user.toString());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
