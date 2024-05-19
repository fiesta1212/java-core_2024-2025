package lr6;
// Напишите функцию, которая находит максимальный элемент в массиве
//целых чисел при помощи многопоточности. Количество потоков должно
//быть равно количеству ядер процессора.
// процессор Ryzen 5600X одно физическое ядро 2 потока в итоге логических ядер 12
public class Example5 {
    public static void main(String[] args){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int[] max = {0};
        Thread[] p = new Thread[Runtime.getRuntime().availableProcessors()];
        System.out.println("Количество ядер процессора: " + p.length);
        for (int i = 0; i < p.length; i++) {
            int finalI = i;
            p[i] = new Thread(() -> {
                int k = 0;
                for (int j = finalI * array.length / p.length; j < (finalI + 1) * array.length / p.length; j++) {
                    if (array[j] > k) k = array[j];
                }
                synchronized (Example5.class) {
                    if (k > max[0]) max[0] = k;
                }

            });
            p[i].start();
        }
        for (Thread i : p) {
            try {
                i.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Максимум: " + max[0]);
    }
}
