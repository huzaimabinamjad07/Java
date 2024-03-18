import java.util.Scanner;

public class Task703 {
    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        System.out.println("Prime = " + isPrime(sc.nextInt()));

        sc.close();
    }
}