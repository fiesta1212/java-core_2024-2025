package lr5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        String[] array = ("Напишите функцию, которая принимает на " + "вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые имеют длину больше заданного значения.").split(" ");
        filterStringsByLength( array, 9).forEach(System.out::println);
    }
    private static List<String> filterStringsByLength(String[] arr, int length) {
        return Arrays.stream(arr).filter(x -> x.length() > length).collect(Collectors.toList());
    }
}
