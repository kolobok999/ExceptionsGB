package Homeworks.Homework2;

public class Task2 {
    public static void main(String[] args) {
        int d = 0;
        divide(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, d);

    }

    public static void divide(int[] intArray, int d) {
        try {
            double catchedRes1 = (double) intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (Exception e) {                                     //Мы можем встретить несколько ошибок
            System.out.println("Catching exception: " + e);         //IndexOutOfBoundsException и ArithmeticException
        }                                                           //Поэтому я расширил класс ловимых ошибок.
    }
}
