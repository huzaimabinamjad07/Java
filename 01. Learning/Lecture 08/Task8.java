import java.util.Scanner;

public class Task8 {
    public static int power(int n, int x) {
        if (x == 0) {
            return 1;
        }

        if (n == 0 || n == 1) {
            return n;
        }

        return n * power(n, x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter its power: ");
        int x = sc.nextInt();

        System.out.println("Output = " + power(n, x));

        sc.close();
    }
}