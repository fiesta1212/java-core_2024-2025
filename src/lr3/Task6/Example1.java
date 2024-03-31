package lr3.Task6;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("Answer: " + test(n));
    }
    private static int test(int n){
        List<Integer> people = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }
        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        return people.get(0);
    }
}
