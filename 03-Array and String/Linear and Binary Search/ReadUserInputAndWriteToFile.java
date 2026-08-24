import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ReadUserInputAndWriteToFile {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("output.txt")
        ) {
            System.out.println("Enter text. Type exit to stop.");

            while (true) {
                String input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input);
                fw.write(System.lineSeparator());
            }

            System.out.println("Data written to output.txt");
        } catch (IOException e) {
            System.out.println("Error handling file.");
        }
    }
}
