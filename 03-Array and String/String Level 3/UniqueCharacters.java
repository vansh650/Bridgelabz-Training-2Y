import java.util.Scanner;

public class UniqueCharacters {
    static int findLength(String s) {
        int count = 0;
        while (true) {
            try {
                s.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    static char[] uniqueCharacters(String s) {
        int n = findLength(s);
        char[] temp = new char[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                temp[count++] = s.charAt(i);
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();

        char[] result = uniqueCharacters(s);
        System.out.print("Unique characters: ");
        for (char ch : result)
            System.out.print(ch + " ");
    }
}
