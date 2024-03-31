package lr3.Task9;
import java.util.*;
public class DeleteSeredina {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();

        int numElementsInCollection = 5 * 1_000_000;
        long numElementsForIndexSpeed = 5L * 1_000_000_000;

        System.out.println("Количество элементов в коллекции: " + numElementsInCollection);
        System.out.println("Количество элементов для вычисления скорости получения по индексу: " + numElementsForIndexSpeed);

        Integer middleIndex = arrayList.size() / 2;
        if (!arrayList.isEmpty()) {
            arrayList.remove(middleIndex);
        }

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        Integer middleIndex2 = arrayDeque.size() / 2;
        Iterator<Integer> iterator = arrayDeque.iterator();
        Integer currentIndex = 0;
        while (iterator.hasNext()) {
            if (currentIndex == middleIndex2) {
                iterator.remove();
                break;
            }
            iterator.next();
            currentIndex++;
        }

        Integer middleIndex3 = sortedSet.size() / 2;
        Iterator<Integer> iterator3 = sortedSet.iterator();
        Integer currentIndex3 = 0;
        while (iterator3.hasNext()) {
            Integer currentElement = iterator3.next();
            if (currentIndex3 == middleIndex3) {
                iterator3.remove();
                break;
            }
            currentIndex3++;
        }

        System.out.println("Время выполнения операции удаления arrayList = " + getRunningTime(arrayList));
        System.out.println("Время выполнения операции удаления ArrayDeque = " + getRunningTime(arrayDeque));
        System.out.println("Время выполнения операции удаления SortedSet = " + getRunningTime(sortedSet));

    }

    private static long getRunningTime(List<Integer> list){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();

        return end - start;

    }

    private static long getRunningTime(Deque<Integer> Deque){

        long start = System.currentTimeMillis();

        for (int i = 0; i < 5000000; i++) {
            Deque.add(i);
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
