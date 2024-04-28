package lr5;

import java.util.List;
import java.util.stream.Collectors;
public class Example9 {
    public static void main(String[] args) {
        List<String> strings = List.of("Напишите", "функцию", "123которая121", "принимает", "на", "вход");
        List<String> filteredStrings = filterStringsOnlyLetters(strings);
        System.out.println(filteredStrings);
    }
    public static List<String> filterStringsOnlyLetters(List<String> strings){
        return strings.stream().filter(str -> str.matches("[а-яА-Я]+")).collect(Collectors.toList());
    }
}
