package timus.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double[] sr = new double[10001];
        for (int t = 1; t <= a; t++) {
            sr[t] = 0;
        }
        for (int t = 1; t <= b; t++) {
            int s = scanner.nextInt();
            sr[s]++;
        }
        System.out.printf("%.2f%%%n", sr[1] / (b / 100));
        for (int t = 2; t <= a; t++) {
            System.out.printf("%.2f%%%n", sr[t] / (b / 100));
        }
    }
}
