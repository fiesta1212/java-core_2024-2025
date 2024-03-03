package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input year of birth: ");
        int year = in.nextInt();
        int currentyear = LocalDate.now().getYear();
        int age = currentyear-year;
        System.out.printf("You are %d years old", age);
        in.close();
    }
}
