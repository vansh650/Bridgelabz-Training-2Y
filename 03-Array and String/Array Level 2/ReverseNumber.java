import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];

        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number = number / 10;
        }

        System.out.println("Reverse number:");

        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}