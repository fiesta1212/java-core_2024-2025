package timus.task_1636;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a1 = 0, b1 = 0, c1 = 0, d1 = 0, e1 = 0, f1 = 0, g1 = 0, h1 = 0, i1 = 0, j1 = 0;
        long t1, t2, a, b, c, d, e, f, g, h, i, j;

        t1 = scanner.nextLong();
        t2 = scanner.nextLong();
        a = scanner.nextLong();
        b = scanner.nextLong();
        c = scanner.nextLong();
        d = scanner.nextLong();
        e = scanner.nextLong();
        f = scanner.nextLong();
        g = scanner.nextLong();
        h = scanner.nextLong();
        i = scanner.nextLong();
        j = scanner.nextLong();

        if (a != 0 || b != 0 || c != 0 || d != 0 || e != 0 || f != 0 || g != 0 || h != 0 || i != 0 || j != 0) {
            a1 = 20 * a;
            b1 = 20 * b;
            c1 = 20 * c;
            d1 = 20 * d;
            e1 = 20 * e;
            f1 = 20 * f;
            g1 = 20 * g;
            h1 = 20 * h;
            i1 = 20 * i;
            j1 = 20 * j;
        }

        if (t1 + a1 + b1 + c1 + d1 + e1 + f1 + g1 + h1 + i1 + j1 <= t2) {
            System.out.println("No chance.");
        } else {
            System.out.println("Dirty debug :(");
        }
    }
}
