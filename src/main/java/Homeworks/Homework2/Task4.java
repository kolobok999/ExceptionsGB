package Homeworks.Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();
            if (str.isEmpty()) {
                throw new RuntimeException();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Пустые строки вводить нельзя");
        }
    }
}
