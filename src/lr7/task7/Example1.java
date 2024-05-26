package lr7.task7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();
        System.out.print("Введите текст для записи: ");
        String textToWrite = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(textToWrite);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
            return;
        }
        int charactersWritten = textToWrite.length();
        System.out.println("Количество записанных символов: " + charactersWritten);
        scanner.close();
    }
}
