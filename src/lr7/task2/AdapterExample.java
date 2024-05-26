package lr7.task2;

import java.io.*;
import java.util.Scanner;

public class AdapterExample {
    public static void main(String[] args) {
        String inputFileName = "src/lr7/task2/input.txt";
        String outputFileName = "src/lr7/task2/output.txt";
        try (PrintWriter printWriter = new PrintWriter(inputFileName)) {
            Scanner scanner = new Scanner(System.in);
            String userInput;
            System.out.println("Введите данные для записи в файл (для завершения введите 'exit'): ");
            while (!(userInput = scanner.nextLine()).equalsIgnoreCase("exit")) {
                printWriter.println(userInput);
            }
            System.out.println("Данные записаны в файл: " + inputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            System.out.println("Обработанные данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}