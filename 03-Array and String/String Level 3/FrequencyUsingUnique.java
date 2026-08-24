import java.util.Scanner;

public class FrequencyUsingUnique {
    static char[] uniqueCharacters(String s) {
        char[] temp = new char[s.length()];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
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

    static String[][] frequency(String s) {
        char[] unique = uniqueCharacters(s);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            int count = 0;

            for (int j = 0; j < s.length(); j++)
                if (unique[i] == s.charAt(j))
                    count++;

            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();

        String[][] result = frequency(s);
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i][0] + " : " + result[i][1]);
    }
}
