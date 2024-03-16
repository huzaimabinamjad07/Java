import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Todo: Pattern (Line)

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        sc.close();
    }
}
