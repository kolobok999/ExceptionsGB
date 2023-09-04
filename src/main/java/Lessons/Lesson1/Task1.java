package Lessons.Lesson1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
//Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
public class Task1 {
    public static void main(String[] args) throws Exception {
        Task1 task1 = new Task1();
        task1.go();
    }

    public void go() throws Exception{

    }
    public int[] subArrays(int[] a, int[] b){
        // Введите свое решение ниже
        if (a.length != b.length) {
            return new int[]{0};
        }
        int size = a.length;
        int[] c = new int[size];
        for (int i = 0; i < size; i++) {
            c[i] = Math.abs(a[i] - b[i]);
        }
        return c;
    }
}
