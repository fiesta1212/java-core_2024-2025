package lr6;
// Напишите программу, которая создает 10 потоков и каждый поток
//выводит на экран свой номер.
public class Example4 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
        }
    }
}
