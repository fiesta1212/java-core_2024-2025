package lr7.task1.Serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Ivan Ivanov", 30);
        try {
            FileOutputStream fileOut =
                    new FileOutputStream("src/lr7/task1/Serial/person.json");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Seiralized data is saved in person.ser");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
