package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String text = id.nextLine();
        System.out.println("Введите ключ для шифрования: ");
        int key = id.nextInt();
        //id.nextLine();
        String entext = encrypt(text, key);
        System.out.println("Текст после преобразования: " + entext);
        System.out.println("Выполнить обратное преобразование y/n");
        String rep = id.next();
        if (rep.equals("y")) {
            String dectext = decrypt(entext, key);
            System.out.println("Текст после обратного преобразования: " + dectext);
        } else if (rep.equals("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }
    private static String encrypt(String text, int key) {
        char[] characters = text.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) (characters[i] + key);

            if (characters[i] > 'z') {
                characters[i] -= 26;
            }
        }
        return new String(characters);
    }

    private static String decrypt(String text, int key) {
        char[] characters = text.toCharArray();

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) (characters[i] - key);

            if (characters[i] < 'a') {
                characters[i] += 26;
            }
        }
        return new String(characters);
    }
}