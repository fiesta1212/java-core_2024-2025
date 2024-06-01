package timus.task_1110;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        int f = 0;
        int t = -1;
        for (int i = 0; i < m; i++) {
            int x = i;
            long c = x;
            for (int j = 2; j < n + 1; j++) {
                c *= x;
                c %= m;
            }
            if (c == y) {
                if (f > 0) {
                    System.out.print(" ");
                }
                System.out.print(x);
                f++;
            }
        }
        if (f == 0) {
            System.out.println(t);
        }
    }
}