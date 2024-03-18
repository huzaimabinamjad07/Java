import java.util.Scanner;

public class Task504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Todo: Pattern (Square (Fill))

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        sc.close();
    }
}
