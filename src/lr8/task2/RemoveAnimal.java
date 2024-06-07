package lr8.task2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveAnimal {
    public static void main(String[] args) {
        removeAnimal();
    }
    public static void removeAnimal() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите тип для удаления: ");
            String typeToRemove = in.nextLine();

            File file = new File("src/lr8/task2/Animals.json");

            if (file.exists() && file.length() > 0) {
                JSONParser parser = new JSONParser();
                FileReader reader = new FileReader(file);
                Object obj = parser.parse(reader);
                JSONObject animals = (JSONObject) obj;

                JSONArray animalArray = (JSONArray) animals.get("Animal");

                Iterator<Object> iterator = animalArray.iterator();
                while (iterator.hasNext()) {
                    JSONObject animal = (JSONObject) iterator.next();
                    String animalType = (String) animal.get("Type");
                    if (animalType.equals(typeToRemove)) {
                        iterator.remove();
                    }
                }

                animals.put("Animal", animalArray);

                try (FileWriter fileWriter = new FileWriter(file)) {
                    fileWriter.write(animals.toJSONString());
                    System.out.println("Животные типа '" + typeToRemove + "' удалены.");
                }
            } else {
                System.out.println("Файл не существует или пустой.");
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
