import java.util.Scanner;

public class Task1801 {
    public static void toh(int n, String s, String h, String d) {
        if (n == 1) {
            System.out.println("Transfer " + n + " from " + s + " to " + d);
            return;
        }

        toh(n - 1, s, d, h);

        System.out.println("Transfer " + n + " from " + s + " to " + d);

        toh(n - 1, h, s, d);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter disks: ");
        int n = sc.nextInt();

        toh(n, "Source", "Helper", "Destination");

        sc.close();
    }
}
