import java.util.Scanner;

public class Task809 {
    public static int gcd(int a, int b) {
        int gcd = 1;

        int max = Math.max(a, b);

        for (int i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Greatest Common Divisor (GCD) = " + gcd(a, b));

        sc.close();
    }
}