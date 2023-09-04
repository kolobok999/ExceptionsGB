package Lessons;
//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
public class Lesson1 {
    public static void main(String[] args) {
        Lesson1 lesson1 = new Lesson1();
        lesson1.go();
    }

    public void go() {
        int[] arr = {12, 15, 5, 8, 45};
        int find
        System.out.println(length(arr, 5));
    }
    public int length(int[] array, int a) {
        if (array.length < a) return -1;
        else return array.length;
    }
}
