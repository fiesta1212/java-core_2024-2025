package lr6;
// Напишите функцию, которая суммирует элементы в массиве целых чисел
//при помощи многопоточности. Количество потоков должно быть равно
//количеству ядер процессора.
// процессор Ryzen 5600X одно физическое ядро 2 потока в итоге логических ядер 12
public class Example6 {
    public static void main(String[] args){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        long[] sum = {0};
        Thread[] p = new Thread[Runtime.getRuntime().availableProcessors()];
        System.out.println("Количество ядер процессора: " + p.length);
        for (int i = 0; i < p.length; i++) {
            int finalI = i;
            p[i] = new Thread(() -> {
                int s = 0;
                for (int j = finalI * array.length / p.length; j < (finalI + 1) * array.length / p.length; j++) {
                    s += array[j];
                }
                synchronized (Example6.class) {
                    sum[0] += s;
                }
            });
            p[i].start();
        }
        for (Thread thread : p) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Сумма массива: " + sum[0]);
    }
}
