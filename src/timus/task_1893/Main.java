package timus.task_1893;

import java.util.Scanner;

public class Main {
    public static int stringToInt(String s) {
        int ten = 1, ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            ans = ans + ten * (s.charAt(i) - '0');
            ten = ten * 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, n;
        String s = scanner.next();
        n = s.charAt(s.length() - 1) - 'A';
        if (s.charAt(s.length() - 1) > 'H') n--;
        n++;
        r = stringToInt(s.substring(0, s.length() - 1));
        if (r <= 2) {
            if (n == 2 || n == 3) System.out.println("aisle");
            else if (n == 1 || n == 4) System.out.println("window");
            else System.out.println("neither");
        } else if (r >= 3 && r <= 20) {
            if (n == 1 || n == 6) System.out.println("window");
            else if (n >= 2 && n <= 5) System.out.println("aisle");
            else System.out.println("neither");
        } else if (r >= 21 && r <= 65) {
            if (n == 1 || n == 10) System.out.println("window");
            else if (n == 3 || n == 4 || n == 7 || n == 8) System.out.println("aisle");
            else System.out.println("neither");
        } else {
            System.out.println("neither");
        }
    }
}
