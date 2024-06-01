package timus.task_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k, i;
        n = scanner.nextInt();
        k = scanner.nextInt();

        if (n <= k) {
            i = 2;
        } else {
            if (2 * n % k == 0) {
                i = (n * 2) / k;
            } else {
                i = (n * 2) / k + 1;
            }
        }
        System.out.println(i);
    }
}
