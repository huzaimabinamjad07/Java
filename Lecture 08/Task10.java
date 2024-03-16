import java.util.Scanner;

public class Task10 {
    public static void fibonacci(int n) {
        int a = 0, b = 1;

        if (n == 1) {
            System.out.println(a);
            return;
        }

        if (n == 2) {
            System.out.println(a + " " + b);
            return;
        }

        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;

            System.out.print(b + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
}