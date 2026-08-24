public class FindFirstNegativeNumber {
    public static int search(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 3, -4, -2, 7};

        System.out.println("Index: " + search(arr));
    }
}
