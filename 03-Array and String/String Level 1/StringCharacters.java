import java.util.Scanner;

public class StringCharacters {

    static char[] getCharacters(String text) {
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    static boolean compare(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] result1 = getCharacters(text);
        char[] result2 = text.toCharArray();

        System.out.println("User-defined array:");

        for (char c : result1) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.println("Built-in array:");

        for (char c : result2) {
            System.out.print(c + " ");
        }

        System.out.println();
        System.out.println("Both are same = " + compare(result1, result2));
    }
}