package lr3.Task9;

import java.util.*;

public class DeleteNachalo {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10); // Сначала добавляем любой элемент
        sortedSet.add(sortedSet.first() - 1); // Затем добавляем элемент, меньший, чем первый элемент

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(10);
        arrayDeque.removeFirst();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0, 10);
        arrayList.remove(0);

        int numElementsInCollection = 5 * 1_000_000;
        long numElementsForIndexSpeed = 5L * 1_000_000_000;

        System.out.println("Количество элементов в коллекции: " + numElementsInCollection);
        System.out.println("Количество элементов для вычисления скорости получения по индексу: " + numElementsForIndexSpeed);

        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции удаления ArrayDeque = " + getRunningTime(arrayDeque));
        System.out.println("Время выполнения операции удаления SortedSet = " + getRunningTime(sortedSet));

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

    private static long getRunningTime(Deque<Integer> Deque){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 5000000; i++) {
            Deque.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime(SortedSet<Integer> sortedSet){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            sortedSet.add(i);
        }

        long end = System.currentTimeMillis();

        return end - start;
    }
}
