import java.util.Scanner;

public class CreateSubstring {

    static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
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

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String result1 = createSubstring(text, start, end);
        String result2 = text.substring(start, end);

        System.out.println("User-defined substring = " + result1);
        System.out.println("Built-in substring = " + result2);
        System.out.println("Both are same = " + compare(result1, result2));
    }
}