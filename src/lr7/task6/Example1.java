package lr7.task6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();
        System.out.print("Введите слово для поиска: ");
        String searchWord = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;
            System.out.println("Содержимое файла, содержащее слово \"" + searchWord + "\":");
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchWord)) {
                    System.out.println("Строка " + lineNumber + ": " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        scanner.close();
    }
}
