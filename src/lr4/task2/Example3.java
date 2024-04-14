package lr4.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        byte[] arr = null;
        int sum = 0;
        try {
            System.out.print("Enter size array: ");
            int size = id.nextInt();
            arr = new byte[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = id.nextByte();
                sum += arr[i];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Input error: Index out of bounds. Please check the array size and element inputs.");
        } catch (InputMismatchException e) {
            System.out.println("Input error: Please enter a valid integer.");
        } catch (NumberFormatException e) {
            System.out.println("Input error: Number format exception. Please enter a valid byte value.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Input error: Array size cannot be negative.");
        }
        if (arr != null) {
            System.out.println("Sum elements array: " + sum);
        }
    }
}