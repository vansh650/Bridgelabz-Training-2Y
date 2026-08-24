import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    static void display(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] ids = new int[n];

        System.out.println("Enter employee IDs:");
        for (int i = 0; i < n; i++)
            ids[i] = sc.nextInt();

        insertionSort(ids);

        System.out.println("Sorted employee IDs:");
        display(ids);
    }
}
