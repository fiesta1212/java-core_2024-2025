package lr3.Task1;

public class Example5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
        System.out.println("Последовательность обхода дерева рекурсивных вызовов:");
        printFibSequence(n);
    }
    public static int fact(int n){
        if (n == 0){
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fact(n-2) + fact(n-1);
        }
    }
    public static int factWithPrint(int n) {
        System.out.print(n + " ");
        if (n == 0){
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return factWithPrint(n-2) + factWithPrint(n-1);
        }
    }

    public static void printFibSequence(int n) {
        factWithPrint(n);
        System.out.println();
    }
}
