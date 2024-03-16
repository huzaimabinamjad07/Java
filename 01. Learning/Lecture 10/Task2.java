import java.util.Scanner;

public class Task2 {
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

    public static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        minMax(arr);
    }

    public static void minMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    public static void main(String[] args) {
        print(getArray());
    }
}
