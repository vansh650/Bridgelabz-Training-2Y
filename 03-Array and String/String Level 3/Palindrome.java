import java.util.Scanner;

public class Palindrome {
    static boolean checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean checkPalindromeRecursive(String s, int start, int end) {
        if (start >= end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        return checkPalindromeRecursive(s, start + 1, end - 1);
    }

    static char[] reverse(String s) {
        char[] rev = new char[s.length()];

        for (int i = 0; i < s.length(); i++)
            rev[i] = s.charAt(s.length() - 1 - i);

        return rev;
    }

    static boolean checkUsingArray(String s) {
        char[] original = s.toCharArray();
        char[] rev = reverse(s);

        for (int i = 0; i < original.length; i++)
            if (original[i] != rev[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String s = sc.next();

        System.out.println("Logic 1: " + checkPalindrome(s));
        System.out.println("Logic 2: " +
                checkPalindromeRecursive(s, 0, s.length() - 1));
        System.out.println("Logic 3: " + checkUsingArray(s));
    }
}
