package lr7.task8;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Ivan Ivanov", 30);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            outputStream.writeObject(person);
            System.out.println("Объект записан в файл");
        } catch (IOException e) {
            System.out.println("Ошибка при записи объекта в файл: " + e.getMessage());
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person restoredPerson = (Person) inputStream.readObject();
            System.out.println("Восстановленный объект из файла:");
            System.out.println("Имя: " + restoredPerson.getName());
            System.out.println("Возраст: " + restoredPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ошибка при восстановлении объекта из файла: " + e.getMessage());
        }
    }
}
