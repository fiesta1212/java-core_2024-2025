package lr3.Task9;

import java.util.*;

public class DobavlenieKonec {
    public static void main(String[] args) {

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(10);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);

        int numElementsInCollection = 5 * 1_000_000;
        long numElementsForIndexSpeed = 5L * 1_000_000_000;

        System.out.println("Количество элементов в коллекции: " + numElementsInCollection);
        System.out.println("Количество элементов для вычисления скорости получения по индексу: " + numElementsForIndexSpeed);

        System.out.println("Время выполнения операции добавления arrayList = " + getRunningTime(arrayList, numElementsInCollection));
        System.out.println("Время выполнения операции добавления ArrayDeque = " + getRunningTime(arrayDeque, numElementsInCollection));
        System.out.println("Время выполнения операции добавления SortedSet = " + getRunningTime(sortedSet, numElementsInCollection));

    }

    private static long getRunningTime(List<Integer> list, int numElements){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < numElements; i++) {
            list.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime(Deque<Integer> Deque, int numElements){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < numElements; i++) {
            Deque.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }

    private static long getRunningTime(SortedSet<Integer> sortedSet, int numElements){

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < numElements; i++) {
            sortedSet.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}
