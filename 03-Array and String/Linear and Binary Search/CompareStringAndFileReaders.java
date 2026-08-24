import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareStringAndFileReaders {
    public static void main(String[] args) {
        int n = 1000000;

        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }

        long builderTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            buffer.append("hello");
        }

        long bufferTime = System.nanoTime() - start;

        System.out.println("StringBuilder time: " + builderTime + " ns");
        System.out.println("StringBuffer time: " + bufferTime + " ns");

        String file = "large.txt";

        start = System.nanoTime();
        long fileWords = countWithFileReader(file);
        long fileTime = System.nanoTime() - start;

        start = System.nanoTime();
        long inputWords = countWithInputStreamReader(file);
        long inputTime = System.nanoTime() - start;

        System.out.println("FileReader word count: " + fileWords);
        System.out.println("FileReader time: " + fileTime + " ns");

        System.out.println("InputStreamReader word count: " + inputWords);
        System.out.println("InputStreamReader time: " + inputTime + " ns");
    }

    static long countWithFileReader(String file) {
        long count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count += line.trim().split("\\s+").length;
                }
            }
        } catch (IOException e) {
            System.out.println("FileReader error.");
        }

        return count;
    }

    static long countWithInputStreamReader(String file) {
        long count = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file),
                        StandardCharsets.UTF_8))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count += line.trim().split("\\s+").length;
                }
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader error.");
        }

        return count;
    }
}
