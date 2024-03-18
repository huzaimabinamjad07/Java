import java.util.Scanner;

public class Task1703 {
    public static int sum(int n, int sum) {
        if (n == 0) {
            return sum;
        }

        return sum(n - 1, sum + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n, 0));

        sc.close();
    }
}
