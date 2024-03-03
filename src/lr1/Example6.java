package lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String fam = in.nextLine();
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите отчество: ");
        String ot = in.nextLine();
        System.out.printf("Hello <%s, %s, %s>", fam,name,ot);
        in.close();
    }
}
