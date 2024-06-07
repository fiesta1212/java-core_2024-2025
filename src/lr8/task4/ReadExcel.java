package lr8.task4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadExcel {
    public static void main(String[] args) {
        boolean success = false;
        Scanner scanner = new Scanner(System.in);

        do {
            String filePath = "src/lr8/p4/example4.xlsx";
            File file = new File(filePath);
            try {
                FileInputStream fis = new FileInputStream(file);
                XSSFWorkbook workbook = new XSSFWorkbook(fis);
                XSSFSheet sheet = workbook.getSheet("Товары");
                for (Row row : sheet) {
                    for (Cell cell : row) {
                        // Выводим значение ячейки на экран
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }
                workbook.close();
                fis.close();
                success = true;
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден: " + e.getMessage());
                System.out.println("Проверьте правильность пути к файлу и повторите попытку. Хотите ли вы повторить запуск программы? (да/нет)");
                String repeat = scanner.nextLine();
                if (!repeat.equalsIgnoreCase("да")) {
                    break;
                }
            } catch (IOException e) {
                System.out.println("Ошибка ввода/вывода: " + e.getMessage());
                System.out.println("Проверьте целостность файла и повторите попытку. Хотите ли вы повторить запуск программы? (да/нет)");
                String repeat = scanner.nextLine();
                if (!repeat.equalsIgnoreCase("да")) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Отсутствие запрашиваемого листа: " + e.getMessage());
                System.out.println("Проверьте наличие нужного листа в файле и повторите попытку. Хотите ли вы повторить запуск программы? (да/нет)");
                String repeat = scanner.nextLine();
                if (!repeat.equalsIgnoreCase("да")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Неправильный формат файла: " + e.getMessage());
                System.out.println("Убедитесь, что файл имеет правильный формат и повторите попытку. Хотите ли вы повторить запуск программы? (да/нет)");
                String repeat = scanner.nextLine();
                if (!repeat.equalsIgnoreCase("да")) {
                    break;
                }
            }
        } while (!success);
        scanner.close();
    }
}