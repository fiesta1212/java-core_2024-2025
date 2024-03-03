package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input year of birth: ");
        int year = in.nextInt();
        int currentyear = LocalDate.now().getYear();
        int answer = currentyear-year;
        System.out.printf("Name: %s \nAge: %d",name,answer);
        in.close();
    }
}
