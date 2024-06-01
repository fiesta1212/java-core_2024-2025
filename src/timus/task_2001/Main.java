package timus.task_2001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] c = new int[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++) {
            c[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }

        System.out.println((c[0] - c[2]) + " " + (b[0] - b[1]));
    }
}