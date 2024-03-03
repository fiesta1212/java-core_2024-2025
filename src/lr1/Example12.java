package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input age: ");
        int age = in.nextInt();
        int currentyear = LocalDate.now().getYear();
        int answer = currentyear-age;
        System.out.printf("If your age is %d then your year of birth %d",age,answer);
        in.close();
    }
}
