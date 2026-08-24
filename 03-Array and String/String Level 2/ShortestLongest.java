import java.util.Scanner;

public class ShortestLongest {

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
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                String word = "";

                for (int j = start; j < i; j++) {
                    word = word + text.charAt(j);
                }

                words[index] = word;
                index++;
                start = i + 1;
            }
        }

        String word = "";

        for (int i = start; i < length; i++) {
            word = word + text.charAt(i);
        }

        words[index] = word;

        return words;
    }

    static String[][] wordLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    static int[] findShortestLongest(String[][] words) {
        int shortest = 0;
        int longest = 0;

        for (int i = 1; i < words.length; i++) {
            int currentLength = Integer.parseInt(words[i][1]);
            int shortLength = Integer.parseInt(words[shortest][1]);
            int longLength = Integer.parseInt(words[longest][1]);

            if (currentLength < shortLength) {
                shortest = i;
            }

            if (currentLength > longLength) {
                longest = i;
            }
        }

        return new int[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] result = wordLength(words);

        int[] answer = findShortestLongest(result);

        System.out.println("Shortest word = " + result[answer[0]][0]);
        System.out.println("Longest word = " + result[answer[1]][0]);
    }
}