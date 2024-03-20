import java.util.Scanner;

public class Task404 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println(n + " is neither prime nor composite");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is composite number");
                    sc.close();
                    return;
                }
            }

            System.out.println(n + " is prime number");
        }

        sc.close();
    }
}
