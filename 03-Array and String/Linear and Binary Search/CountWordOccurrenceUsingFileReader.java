import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrenceUsingFileReader {
    public static void main(String[] args) {
        String file = "input.txt";
        String target = "hello";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equals(target)) {
                        count++;
                    }
                }
            }

            System.out.println("Word count: " + count);
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
