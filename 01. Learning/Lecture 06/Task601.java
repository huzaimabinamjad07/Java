import java.util.Scanner;

public class Task601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Todo: Pattern (Diamond (Palindrome))

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int spc = n - i;
            int num = i;

            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num-- + " ");
            }

            num = 2;

            for (int j = 2; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            int spc = n - i;

            int num = i;

            for (int j = 1; j <= spc; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(num-- + " ");
            }

            num = 2;

            for (int j = 2; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
