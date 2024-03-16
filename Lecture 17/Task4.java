import java.util.Scanner;

public class Task4 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1 || n == 2) {
            return n;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n));

        sc.close();
    }
}
