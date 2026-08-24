import java.util.Scanner;

public class SplitWords {

    static int findLength(String text) {
        int count = 0;

        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }

        return count;
    }

    static String[] splitWords(String text) {
        int length = findLength(text);

        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                String word = "";

                for (int j = start; j < i; j++) {
                    word = word + text.charAt(j);
                }

                words[wordIndex] = word;
                wordIndex++;
                start = i + 1;
            }
        }

        String word = "";

        for (int i = start; i < length; i++) {
            word = word + text.charAt(i);
        }

        words[wordIndex] = word;

        return words;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] result1 = splitWords(text);
        String[] result2 = text.split(" ");

        System.out.println("User-defined words:");

        for (String word : result1) {
            System.out.println(word);
        }

        System.out.println("Built-in words:");

        for (String word : result2) {
            System.out.println(word);
        }

        System.out.println("Both are same = " + compare(result1, result2));
    }
}