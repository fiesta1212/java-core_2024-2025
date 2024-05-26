package lr7.task2;

import java.io.*;
import java.util.Scanner;

public class BufferedStreamExample {
    public static void main(String[] args) {
        String fileName = "example_file.txt";
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введите данные для записи в файл: ");
        String data = inputScanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            writer.write(data);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e ){
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer,0,charRead);
            System.out.println("Прочитанные данные: " +readData);
        } catch (IOException e ){
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        /*if (new File(fileName).delete()){
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }*/
    }
}