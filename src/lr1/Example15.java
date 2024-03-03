package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 1 number: ");
        double a = in.nextDouble();
        System.out.println("Input 2 number: ");
        double b = in.nextDouble();
        double sum = a+b;
        double diff = a-b;
        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);
        in.close();
    }
}
