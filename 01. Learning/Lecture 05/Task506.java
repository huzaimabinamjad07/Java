import java.util.Scanner;

public class Task506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Todo: Pattern (Diamond Top Right)

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        sc.close();
    }
}
