package lr2;

import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = id.nextInt();
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0;i < size; i++){
            nums[i] = random.nextInt(100);
            System.out.println(nums[i] + " ");
        }
        int min = nums[0];
        for (int i = 1; i < size; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("Элементы с минимальным значением: " + min + " \nнаходятся по индексам:");
        for (int i = 0; i < size; i++){
            if(nums[i] == min){
                System.out.println(i + " ");
            }
        }
        id.close();
    }
}
