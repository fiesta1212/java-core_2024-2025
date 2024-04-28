package lr5;

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        String arr = "Напишите функцию, которая принимает на " +
                "Вход список строк и возвращает новый список, " +
                "Содержащий только те строки, которые начинаются с большой буквы.";
        List<String> strings = List.of(arr.split(" "));
        System.out.println("После сплитования : " + "\n");
        for (String e : strings){
            System.out.println(e);
        }
        List<String> stringsAfter = filterCapStrings(strings);
        System.out.println("\n" + "После преобразования : " + "\n");
        for (String e : stringsAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterCapStrings(List<String> list){
        return list.stream().filter(s-> Character.isUpperCase(s.charAt(0))).collect(Collectors.toList());
    }
}
