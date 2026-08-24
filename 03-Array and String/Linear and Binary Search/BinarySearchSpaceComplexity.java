public class BinarySearchSpaceComplexity {
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 8, 61};

        System.out.println(search(arr, 4));
        System.out.println("Auxiliary Space: O(1)");
    }
}
