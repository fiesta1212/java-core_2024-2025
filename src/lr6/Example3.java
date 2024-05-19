package lr6;

// Напишите программу, которая создает два потока, которые выводят на
//экран числа от 1 до 10 Первый поток должен выводить только четные числа,
//а второй поток должен выводить только нечетные числа.
public class Example3 {
    public static void main(String[] args) {
        Runnable r1 = new Runnable1();
        Thread p1 = new Thread(r1);
        Runnable r2 = new Runnable2();
        Thread p2 = new Thread(r2);
        p1.start();
        p2.start();
    }
}
class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<11;i+=2) {
            System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<11;i+=2) {
            System.out.println(i);
        }
    }
}