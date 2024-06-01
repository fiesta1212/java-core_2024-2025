package timus.task_1209;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double eps = 0.000001;

        int n = scanner.nextInt();
        for (int i = 0; i < n; ++i) {
            double b = scanner.nextDouble();
            double a = (Math.sqrt(8 * b - 7) - 1) / 2;
            if (Math.abs(a % 1.0) < eps || Math.abs(a % 1.0) > 1 - eps) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
