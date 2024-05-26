package lr7.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(new FileReader("src/lr7/task1/input.txt"));
        int lineCount = 0;
        while (reader.readLine() != null) {
            lineCount++;
        }
        reader.close();
        System.out.println("Количество строк в файле: " + lineCount);
    }
}
