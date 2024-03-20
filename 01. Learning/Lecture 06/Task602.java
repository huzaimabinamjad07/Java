import java.util.Scanner;

public class Task602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Todo: Pattern (Sand Clock)

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            int spc = n - i;

            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i <= n; i++) {
            int spc = n - i;

            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();

        sc.close();
    }
}
