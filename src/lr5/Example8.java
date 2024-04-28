package lr5;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = id.nextInt();
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = (int)(Math.random()*50);
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();
        int[] arr2 = filterNumbersGreaterThan(arr1, num);
        System.out.println("Исходный список: " + "\n");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Список с числами больше введенного числа: " + "\n");
        System.out.println(Arrays.toString(arr2));
    }
    private static int[] filterNumbersGreaterThan(int[] array, int num){
        return Arrays.stream(array).filter(x ->x > num).toArray();
    }
}
