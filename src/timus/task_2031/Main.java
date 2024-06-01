package timus.task_2031;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = {"88", "68", "06", "16"};
        int n = scanner.nextInt();
        if (n > 4)
            System.out.println("Glupenky Pierre");
        else
            for (int i = n - 1; i >= 0; --i)
                System.out.print(a[i] + " ");
        scanner.close();
    }
}