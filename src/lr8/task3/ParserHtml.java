package lr8.task3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ParserHtml {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean reconnecting = true;
        while (reconnecting) {
            try {
                // Получаем HTML-код страницы
                Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

                // Извлекаем список новостей
                Elements newsParent = doc
                        .select("body > table > tbody > tr > td > div > table > " +
                                "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody> " +
                                "tr > td:nth-child(1)");

                // Создаем файл для записи новостей
                FileWriter writer = new FileWriter("src/lr8/task3/news.txt");

                // Записываем последние 10 новостей в файл и выводим их в консоль
                for (int i = 3; i < 20; i++) {
                    if (!(i % 2 == 0)) {
                        List<Node> nodes = newsParent.get(0).childNodes();
                        String theme = ((Element) nodes.get(i))
                                .getElementsByClass("blocktitle")
                                .get(0).childNodes().get(0).toString();
                        String date = ((Element) nodes.get(i))
                                .getElementsByClass("blockdate")
                                .get(0).childNodes().get(0).toString();

                        // Запись в файл
                        writer.write("Тема: " + theme + "\nДата: " + date + "\n\n");

                        // Вывод в консоль
                        System.out.println("Тема: " + theme);
                        System.out.println("Дата : " + date + "\n");
                    }
                }

                // Закрываем файл
                writer.close();

                // Если все прошло успешно, выходим из цикла
                reconnecting = false;
            } catch (IOException e) {
                // Обработка ошибок при получении HTML-кода страницы
                System.out.println("Произошла ошибка при загрузке страницы: " + e.getMessage());

                // Предложение повторного подключения
                System.out.println("Повторить подключение? (1 - да/0 - нет)");
                int reconnect = in.nextInt();
                if (reconnect != 1) {
                    reconnecting = false; // Если пользователь не хочет переподключаться, выходим из цикла
                }
            }
        }
    }
}
