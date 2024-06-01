package timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, g, f, r = 0, t = 0;
        double h = 0;

        a = scanner.nextInt();

        for (f = 1; f <= a; f++) {
            g = scanner.nextInt();
            if (g == 5) r++;
            h += g;
            if (g <= 3) t++;
        }

        if (t > 0) {
            System.out.println("None");
        } else if (r == a) {
            System.out.println("Named");
        } else if (h / a >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}