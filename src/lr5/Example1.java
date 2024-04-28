package lr5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = id.nextInt();
        int[] arr = new int[size];
        for (int i =0; i < size; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        System.out.println("Array arr: ");
        System.out.println(Arrays.toString(arr));
        int[] arrresult = filterEvenNumbers(arr);
        System.out.println("Array arrresult: ");
        System.out.println(Arrays.toString(arrresult));
    }
    public static int[] filterEvenNumbers(int[] arr){
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
