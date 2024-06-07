package lr8.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class AddAnimal {
    public static void main(String[] args) {
        addNewAnimal();
    }
    public static void addNewAnimal() {
        try {
            Scanner scanner = new Scanner(System.in);
            String filePath = "src/lr8/task1/Animals.xml";
            File file = new File(filePath);
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document animal;

            if (file.exists() && file.length() > 0) {
                animal = docBuilder.parse(file);
            } else {
                animal = docBuilder.newDocument();
                Element rootElement = animal.createElement("Animals");
                animal.appendChild(rootElement);
            }

            System.out.println("Введите тип домашнего животного: ");
            String type = scanner.nextLine();
            System.out.println("Введите кличку домашнего животного: ");
            String name = scanner.nextLine();
            System.out.println("Введите возраст домашнего животного: ");
            String age = scanner.nextLine();

            Element animalElement = animal.createElement("Animal");
            animal.getDocumentElement().appendChild(animalElement);

            Element typeElement = animal.createElement("Type");
            typeElement.appendChild(animal.createTextNode(type));
            animalElement.appendChild(typeElement);

            Element nameElement = animal.createElement("Name");
            nameElement.appendChild(animal.createTextNode(name));
            animalElement.appendChild(nameElement);

            Element ageElement = animal.createElement("Age");
            ageElement.appendChild(animal.createTextNode(age));
            animalElement.appendChild(ageElement);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(animal);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);

            System.out.println("Новое домашнее животное добавлено.");

        } catch (Exception e ){
            e.printStackTrace();
        }
    }
}