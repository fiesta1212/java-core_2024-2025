package timus.task_1601;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int c, i = 0;
        while ((c = System.in.read()) != -1) {
            if ((c >= 65) && (c <= 90)) {
                i++;
                if (('A' <= c) && (c <= 'Z') && (i != 1)) {
                    c += 'a' - 'A';
                    i++;
                }
            } else if ((c == 46) || (c == 33) || (c == 63)) {
                i = 0;
            }
            System.out.print((char) c);
        }
    }
}
