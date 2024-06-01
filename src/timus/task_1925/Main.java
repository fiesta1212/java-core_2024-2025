package timus.task_1925;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a, b, s = 0, r = 0;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            s += a;
            r += b;
        }
        n++;
        int iValue = s + k - 2 * n - r;
        if (iValue < 0) {
            System.out.println("Big Bang!");
        } else {
            System.out.println(iValue);
        }
    }
}
