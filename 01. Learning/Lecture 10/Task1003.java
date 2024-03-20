import java.util.Scanner;

public class Task1003 {
    public static Scanner sc = new Scanner(System.in);

    public static int[] getArray() {
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        return arr;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Sorted = " + isSorted(getArray()));
    }
}
