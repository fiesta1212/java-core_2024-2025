package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        String[] array = ("Напишите функцию, которая принимает на " + "вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые начинаются с большой буквы.").split(" ");
        filterStringsWithSubstring(array).forEach(System.out::println);
    }

    private static List<String> filterStringsWithSubstring(String[] array) {
        return Arrays.stream(array).filter(x -> x.contains("а")).collect(Collectors.toList());
    }
}
