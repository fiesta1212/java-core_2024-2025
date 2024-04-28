package lr5;

import java.util.Arrays;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = id.nextInt();
        int[] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = (int)(Math.random()*50);
        }
        System.out.println("Исходный список: " + "\n");
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = filterDivisibleNumbers(arr1,3);
        System.out.println("Список деленный на 3 без остатка: " + "\n");
        System.out.println(Arrays.toString(arr2));
    }
    private static int[] filterDivisibleNumbers(int[] arr1, int num){
        return Arrays.stream(arr1).filter(x -> x%num == 0).toArray();
    }
}
