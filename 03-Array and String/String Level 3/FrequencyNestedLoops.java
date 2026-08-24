import java.util.Scanner;

public class FrequencyNestedLoops {
    static String[] frequency(String s) {
        char[] arr = s.toCharArray();
        int[] freq = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '0')
                continue;

            freq[i] = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != '0')
                count++;

        String[] result = new String[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '0')
                result[index++] = arr[i] + " : " + freq[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();

        String[] result = frequency(s);
        for (String x : result)
            System.out.println(x);
    }
}
