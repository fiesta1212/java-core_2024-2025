package timus.task_1025;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[105];
        int s = 0;
        int num = (n + 1) / 2;
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();
        Arrays.sort(a, 0, n);
        for (int i = 0; i < num; i++) s += (a[i] + 1) / 2;
        System.out.println(s);
        scanner.close();
    }
}