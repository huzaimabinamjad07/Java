import java.util.Scanner;

public class Task1 {
    public static Scanner sc = new Scanner(System.in);

    public static String[] getArray() {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " name: ");
            arr[i] = sc.nextLine();
        }
        System.out.println();
        return arr;
    }

    public static void print(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        print(getArray());
    }
}