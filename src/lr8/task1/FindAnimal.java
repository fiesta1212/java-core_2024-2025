package lr8.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class FindAnimal {
    public static void main(String[] args) {
        searchAnimal();
    }
    public static void searchAnimal() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите кличку или возраст домашнего животного для поиска: ");
            String keyword = scanner.nextLine();

            File file = new File("src/lr8/task1/Animals.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            NodeList animals = doc.getElementsByTagName("Animal");

            boolean found = false;

            for (int i = 0; i < animals.getLength(); i++) {
                Element animal = (Element) animals.item(i);
                String type = animal.getElementsByTagName("Type").item(0).getTextContent();
                String name = animal.getElementsByTagName("Name").item(0).getTextContent();
                String age = animal.getElementsByTagName("Age").item(0).getTextContent();

                if (name.equalsIgnoreCase(keyword) || age.equalsIgnoreCase(keyword)) {
                    System.out.println("Найдено домашнее животное:");
                    System.out.println("Тип: " + type);
                    System.out.println("Кличка: " + name);
                    System.out.println("Возраст: " + age);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Домашние животные с такой кличкой или возрастом не найдены.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
