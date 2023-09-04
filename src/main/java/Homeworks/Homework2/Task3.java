package Homeworks.Homework2;

public class Task3 {
    public static void main(String[] args) { // У нас все ошибки обрабатываются в блоке try/catch
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) { //Отсюда не может выйти FileNotFoundException
        System.out.println(a + b);
    }

}
