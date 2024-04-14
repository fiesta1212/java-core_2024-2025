package lr4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("ENTER SIZE ARRAY: ");
            int n = in.nextInt();
            int[] arr = new int[n];
            System.out.println("ENTER ELEMENTS ARRAY: ");
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int k = 0;
            double sum = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0){
                    sum = sum + arr[i];
                    k++;
                }
            }
            if (k == 0){
                throw new IllegalArgumentException("положительные элементы отсутствуют");
            }
            double avg = sum / k;
            System.out.println("Среднее значение положительных элементов: " + avg);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: ввод строки вместо числа");
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: несоответствие числового типа данных");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
