import java.util.Scanner;

public class StringLength {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int userLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("User-defined length = " + userLength);
        System.out.println("Built-in length = " + builtInLength);
    }
}