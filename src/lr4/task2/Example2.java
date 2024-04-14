package lr4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        try {
            System.out.println("Кол-во строк: ");
            int row = id.nextInt();
            System.out.println("Кол-во столбцов: ");
            int col = id.nextInt();
            int[][] arr = new int[row][col];
            System.out.println("Элементы матрицы: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arr[i][j] = id.nextInt();
                }
            }
            System.out.println("Номер столбца для вывода: ");
            int colv = id.nextInt();
            if (colv < 0 || colv >= col) {
                throw new IllegalArgumentException("Столбца " + colv + " нет");
            }
            System.out.println("Столбец: " + colv);
            for (int i = 0; i < row; i++) {
                System.out.println(arr[i][colv]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: ввод строки вместо числа");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: нет столбца с таким номером");
        }
    }
}