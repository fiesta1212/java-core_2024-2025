package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 1 number: ");
        double a = in.nextDouble();
        System.out.println("Input 2 number: ");
        double b = in.nextDouble();
        double answer = a+b;
        System.out.println("Сумма двух чисел " + answer);
        in.close();
    }
}
