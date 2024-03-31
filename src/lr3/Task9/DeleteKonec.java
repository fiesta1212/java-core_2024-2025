package lr3.Task9;
import java.util.*;
public class DeleteKonec {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        if (!sortedSet.isEmpty()) {
            Integer lastElement = sortedSet.last();
            sortedSet.remove(lastElement);
        }

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast(10);
        if (!arrayDeque.isEmpty()) {
            arrayDeque.removeLast();
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        if (!arrayList.isEmpty()) {
            Integer lastIndex = arrayList.size() - 1;
            arrayList.remove(lastIndex);
        }

        int numElementsInCollection = 5 * 1_000_000;
        long numElementsForIndexSpeed = 5L * 1_000_000_000;

        System.out.println("Количество элементов в коллекции: " + numElementsInCollection);
        System.out.println("Количество элементов для вычисления скорости получения по индексу: " + numElementsForIndexSpeed);

        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции удаления ArrayDeque = " + getRunningTime(arrayDeque));
        System.out.println("Время выполнения операции удаления SortedSet = " + getRunningTime(sortedSet));

    }

    private static long getRunningTime(List<Integer> list){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            if (!list.isEmpty()) {
                list.remove(list.size() - 1);
            }
        }

        long end = System.currentTimeMillis();

        return end - start;

    }

    private static long getRunningTime(Deque<Integer> Deque){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            if (!Deque.isEmpty()) {
                Deque.removeLast();
            }
        }

        long end = System.currentTimeMillis();

        return end - start;

    }

    private static long getRunningTime(Set<Integer> Set){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            Set.add(i);
        }

        long end = System.currentTimeMillis();

        return end - start;

    }
}
