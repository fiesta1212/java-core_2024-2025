package timus.task_1935;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int len = 0;
        int maxc = 0;
        for (int i = 0; i < n; i++) {
            int c = scanner.nextInt();
            if (maxc < c) {
                maxc = c;
            }
            len += c;
        }
        len += maxc;
        System.out.println(len);
        scanner.close();
    }
}
