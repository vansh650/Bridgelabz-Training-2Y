import java.util.Scanner;

public class MergeSort {
    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] a = new int[n1];
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++)
            a[i] = arr[left + i];

        for (int i = 0; i < n2; i++)
            b[i] = arr[mid + 1 + i];

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (a[i] <= b[j])
                arr[k++] = a[i++];
            else
                arr[k++] = b[j++];
        }

        while (i < n1)
            arr[k++] = a[i++];

        while (j < n2)
            arr[k++] = b[j++];
    }

    static void display(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();

        mergeSort(prices, 0, n - 1);

        System.out.println("Sorted book prices:");
        display(prices);
    }
}
