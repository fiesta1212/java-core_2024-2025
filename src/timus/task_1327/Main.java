package timus.task_1327;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        int c = b - a + (a % 2) + (b % 2);
        System.out.println(c / 2);
    }
}