import java.util.Scanner;

public class UpperCase {

    static String convertUpper(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result = result + ch;
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

        String result1 = convertUpper(text);
        String result2 = text.toUpperCase();

        System.out.println("User-defined = " + result1);
        System.out.println("Built-in = " + result2);
        System.out.println("Both are same = " + compare(result1, result2));
    }
}