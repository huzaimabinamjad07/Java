public class Task1804 {
    public static boolean isSorted(int[] arr, int i) {
        if (arr.length == 0) {
            return true;
        }

        if (i == arr.length) {
            return true;
        }

        if (arr[i - 1] >= arr[i]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4 };

        System.out.println("Strictly Sorted = " + isSorted(arr, 1));
    }
}
