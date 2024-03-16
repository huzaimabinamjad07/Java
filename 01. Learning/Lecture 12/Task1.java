import java.util.Scanner;

public class Task1 {
    public static Scanner sc = new Scanner(System.in);

    public static String[] getArray() {
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " name: ");
            arr[i] = sc.nextLine();
        }

        System.out.println();
        return arr;
    }

    public static int getSize(String[] arr) {
        int output = 0;

        for (String s : arr) {
            output += s.length();
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println("Size = " + getSize(getArray()));
    }
}