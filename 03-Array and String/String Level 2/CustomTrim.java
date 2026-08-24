import java.util.Scanner;

public class CustomTrim {

    static int[] trim(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int[] position = trim(text);

        String result1 = createSubstring(
                text, position[0], position[1]);

        String result2 = text.trim();

        System.out.println("User-defined trim = " + result1);
        System.out.println("Built-in trim = " + result2);
        System.out.println("Both are same = " + compare(result1, result2));
    }
}