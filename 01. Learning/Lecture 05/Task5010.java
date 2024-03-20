import java.util.Scanner;

public class Task5010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Todo: Pattern (Diamond Bottom)

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
        System.out.println();

        sc.close();
    }
}
