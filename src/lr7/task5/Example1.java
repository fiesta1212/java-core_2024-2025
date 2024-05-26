package lr7.task5;

import java.io.File;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Текущая директория: " + currentDirectory);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);
        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("Размер файла \"" + fileName + "\": " + fileSize + " байт");
        } else {
            System.out.println("Файл \"" + fileName + "\" не найден");
        }
        scanner.close();
    }
}
