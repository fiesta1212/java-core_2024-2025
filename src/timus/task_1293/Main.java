package timus.task_1293;

//import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int answer = b*c*2*a;
        //out.println(answer);
        //out.flush();
        System.out.println(answer);
        in.close();
    }
}
