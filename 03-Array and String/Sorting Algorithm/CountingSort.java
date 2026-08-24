import java.util.Scanner;

public class CountingSort {
    static void countingSort(int[] arr) {
        int min = 10;
        int max = 18;

        int[] count = new int[max - min + 1];

        for (int age : arr)
            count[age - min]++;

        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        int[] output = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++)
            arr[i] = output[i];
    }

    static void display(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter student ages (10 to 18):");
        for (int i = 0; i < n; i++)
            ages[i] = sc.nextInt();

        countingSort(ages);

        System.out.println("Sorted ages:");
        display(ages);
    }
}
