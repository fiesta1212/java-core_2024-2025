package timus.task_1880;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> a = new HashMap<>();
        int ans = 0, n, c;
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            n = scanner.nextInt();
            for (; n > 0; n--) {
                c = scanner.nextInt();
                ans += (a.merge(c, 1, Integer::sum) == 3) ? 1 : 0;
            }
        }
        System.out.println(ans);
    }
}
