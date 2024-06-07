package lr8.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddAnimal {
    public static void main(String[] args) {
        add();
    }

    public static void add() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите тип домашнего животного: ");
            String type = in.nextLine();

            System.out.println("Введите кличку домашнего животного: ");
            String name = in.nextLine();

            System.out.println("Введите возраст домашнего животного: ");
            String age = in.nextLine();

            File file = new File("src/lr8/task2/Animals.json");

            JSONObject animals;
            if (file.exists() && file.length() > 0) {
                JSONParser parser = new JSONParser();
                FileReader reader = new FileReader(file);
                Object obj = parser.parse(reader);
                animals = (JSONObject) obj;
            } else {
                animals = new JSONObject();
                animals.put("Animal", new JSONArray());
            }

            JSONObject newAnimal = new JSONObject();
            newAnimal.put("Type", type);
            newAnimal.put("Name", name);
            newAnimal.put("Age", age);

            JSONArray animalArray = (JSONArray) animals.get("Animal");
            animalArray.add(newAnimal);
            animals.put("Animal", animalArray);

            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(animals.toJSONString());
                System.out.println("Новое домашнее животное добавлено.");
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
