package Homeworks.Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.go();
    }

    private void go() {
        System.out.println("Ввели число: " + enterNumber());
    }

    private float enterNumber() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float res = 0;
        try {
            res = Float.parseFloat(reader.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число. Повторите ввод:");
            res = enterNumber();
        }
        return res;
    }
}
