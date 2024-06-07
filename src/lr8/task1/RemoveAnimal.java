package lr8.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;

public class RemoveAnimal {
    public static void main(String[] args) {
        removeAnimal();
    }
    public static void removeAnimal() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите тип животного, которое вы хотите удалить: ");
            String typeToDelete = scanner.nextLine();

            File file = new File("src/lr8/task1/Animals.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            NodeList animals = doc.getElementsByTagName("Animal");

            for (int i = 0; i < animals.getLength(); i++) {
                Element animal = (Element) animals.item(i);
                String type = animal.getElementsByTagName("Type").item(0).getTextContent();

                if (type.equalsIgnoreCase(typeToDelete)) {
                    Node parentNode = animal.getParentNode();
                    parentNode.removeChild(animal);
                    System.out.println("Животное типа " + typeToDelete + " успешно удалено из файла.");
                }
            }
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
