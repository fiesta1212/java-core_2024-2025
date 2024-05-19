package lr6;

import java.time.LocalTime;

// Напишите программу, которая запускает два потока и выводит на экран их
//имена и текущее время в течение 10 секунд.
public class Example1 {
    public static void main(String[] args) throws InterruptedException {
        Thread p1 = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread p2 = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + LocalTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        p1.start();
        p2.start();
        p1.join();
        p2.join();
    }
}
