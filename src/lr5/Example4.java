package lr5;

import java.util.Arrays;

public class Example4 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int)(Math.random()*10);
        }
        int[] arr2 = squareNumbers(arr1);
        System.out.println("Первый список: " + "\n");
        System.out.println(Arrays.toString(arr1));
        System.out.println("Список квадратов: " + "\n");
        System.out.println(Arrays.toString(arr2));
    }
    private static int[] squareNumbers(int[] arr1){
        return Arrays.stream(arr1).map(x->x*x).toArray();
    }
}
