package timus.task_1585;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] p = new String[1000];

        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextLine();
        }

        int k1 = 0, k2 = 0, k3 = 0;

        for (int i = 0; i < n; i++) {
            if (p[i].equals("Emperor Penguin"))
                k1++;
            if (p[i].equals("Little Penguin"))
                k2++;
            if (p[i].equals("Macaroni Penguin"))
                k3++;
        }

        if (k1 > k2) {
            if (k1 > k3)
                System.out.println("Emperor Penguin");
        }
        if (k2 > k1) {
            if (k2 > k3)
                System.out.println("Little Penguin");
        }
        if (k3 > k2) {
            if (k3 > k1)
                System.out.println("Macaroni Penguin");
        }
    }
}