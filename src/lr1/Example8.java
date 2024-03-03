package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название текущего дня недели: ");
        String name = in.nextLine();
        System.out.println("Введите название месяца: ");
        String mes = in.nextLine();
        System.out.println("Введите дату (номер дня в месяце): ");
        int data = in.nextInt();
        System.out.printf("Сегодня %s %d %s", name,data,mes);
        in.close();
    }
}
