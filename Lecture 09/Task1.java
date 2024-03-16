public class Task1 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1, 4 };

        System.out.println("===== Before Sort =====");
        print(arr);
        System.out.println();

        bubbleSort(arr);

        System.out.println("===== After Sort =====");
        print(arr);

        System.out.println("\nTime Complexity = O(n^2)");
        System.out.println("Space Complexity = O(1)\n");
    }
}