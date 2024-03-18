import java.util.Scanner;

public class Task603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Todo: Pattern (Butterfly)

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int spc = 2 * (n - i);

            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int spc = 2 * (n - i);

            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        sc.close();
    }
}
