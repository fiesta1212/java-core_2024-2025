package lr3.Task2;

public class Example1 {
    public static void test(int a) {
        int i, b;
        while(a !=0 ) {
            b = a%2;
            System.out.print(b);
            a = a/2;
        }
    }
    public static void main(String [] args) {
        test(8);
    }
}

