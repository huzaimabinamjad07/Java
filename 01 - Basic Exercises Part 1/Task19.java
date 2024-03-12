import java.util.Scanner;

public class Task19 {
    public static int decimalToBinary(int n) {
        StringBuilder output = new StringBuilder();

        while (n > 0) {
            int rem = n % 2;
            n /= 2;
            output.append(rem);
        }

        return Integer.parseInt(output.reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();

        System.out.println("Binary = " + decimalToBinary(n));

        sc.close();
    }
}
