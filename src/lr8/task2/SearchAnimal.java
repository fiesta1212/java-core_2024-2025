package lr8.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchAnimal {
    public static void main(String[] args) {
        searchAnimal();
    }
    public static void searchAnimal() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите кличку для поиска: ");
            String searchName = in.nextLine();

            File file = new File("src/lr8/task2/Animals.json");

            if (file.exists() && file.length() > 0) {
                JSONParser parser = new JSONParser();
                FileReader reader = new FileReader(file);
                Object obj = parser.parse(reader);
                JSONObject animals = (JSONObject) obj;

                JSONArray animalArray = (JSONArray) animals.get("Animal");

                animalArray.stream().filter(animalObj -> {
                    JSONObject animal = (JSONObject) animalObj;
                    String animalName = (String) animal.get("Name");
                    return animalName.equals(searchName);
                })
                        .forEach(animalObj -> {
                            JSONObject animal = (JSONObject) animalObj;
                            System.out.println("Найдено животное:");
                            System.out.println("Тип: " + animal.get("Type"));
                            System.out.println("Кличка: " + animal.get("Name"));
                            System.out.println("Возраст: " + animal.get("Age"));
                        });
            } else {
                System.out.println("Файл не существует или пустой.");
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
