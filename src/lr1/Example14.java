package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        double num = in.nextDouble();
        double numplus1 = num + 1;
        double numminus1 = num - 1;
        double fourthnum = (num + numminus1 + numplus1)*(num+numplus1+numminus1);
        System.out.println("Последовательность чисел: " + numminus1 + ", " + num + ", " + numplus1 + ", " + fourthnum);
        in.close();
    }
}
