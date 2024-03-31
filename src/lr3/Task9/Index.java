package lr3.Task9;
import java.util.*;
public class Index {
    public static void main(String[] args) {

        ArrayList<Integer> people = new ArrayList<Integer>();
        // добавим в список ряд элементов
        people.add(14);
        people.add(12);
        people.add(13);
        people.add(16);
        people.add(1, 18); // добавляем элемент по индексу 1

        System.out.println(people.get(3));


        ArrayDeque<Integer> people2 = new ArrayDeque<Integer>();
        // добавим в ArrayDeque ряд элементов
        people2.add(14);
        people2.add(12);
        people2.add(13);
        people2.add(16);
        people2.addFirst(18); // добавляем элемент в начало дека

        System.out.println(people.get(3));

        int numElementsInCollection = 5 * 1_000_000;
        long numElementsForIndexSpeed = 5L * 1_000_000_000;

        System.out.println("Количество элементов в коллекции: " + numElementsInCollection);
        System.out.println("Количество элементов для вычисления скорости получения по индексу: " + numElementsForIndexSpeed);

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(people));
        System.out.println("Время выполнения операции добавления ArrayDeque = " + getRunningTime(people2));

        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int i = 0; i < 5000000; i++) {
            sortedSet.add(i);
        }
        System.out.println("Время выполнения операции добавления SortedSet = " + getRunningTime(sortedSet));

    }

    private static long getRunningTime(List<Integer> list){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 5000000; i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime(Deque<Integer> deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 5000000; i++) {
            deque.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime(SortedSet<Integer> sortedSet){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 5000000; i++) {
            sortedSet.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
