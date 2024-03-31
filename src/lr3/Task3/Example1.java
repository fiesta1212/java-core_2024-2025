package lr3.Task3;

import java.util.Scanner;

// Создать приложение, позволяющее ввести и вывести одномерный массив целых чисел.
// Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] array = new int[count];
        test(count, array, in);
        System.out.println("Введенный массив:");
        outputArray(array, 0);
    }

    private static void test(int k, int[] array, Scanner in){
        if (k > 0) {
            test(k - 1, array, in);
        }
        if (k < array.length) {
            array[k] = in.nextInt();
        }
    }

    private static void outputArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            outputArray(array, index + 1);
        }
    }
}
