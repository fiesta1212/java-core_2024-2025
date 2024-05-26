package lr7.task2;

import java.io.*;

public class ByteStreamExample {
    public static void main(String[] args) {
        String fileName = "src/lr7/task2/example_file.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите данные для записи в файл: ");
            String data = reader.readLine();

            try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
                outputStream.write(data.getBytes());
                System.out.println("Данные записаны в файл: " + fileName);
            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
            }

            try (FileInputStream inputStream = new FileInputStream(fileName)) {
                byte[] buffer = new byte[1024];
                int bytesRead = inputStream.read(buffer);
                String readData = new String(buffer, 0, bytesRead);
                System.out.println("Прочитанные данные: " + readData);
            } catch (IOException e) {
                System.out.println("Ошибка при чтении файла: " + e.getMessage());
            }

            /*if (new File(fileName).delete()) {
                System.out.println("Файл удален: " + fileName);
            } else {
                System.out.println("Не удалось удалить файл: " + fileName);
            }*/
        } catch (IOException e) {
            System.out.println("Ошибка при чтении данных с консоли: " + e.getMessage());
        }
    }
}
