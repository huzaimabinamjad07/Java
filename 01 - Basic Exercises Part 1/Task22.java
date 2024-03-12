import java.util.Scanner;

public class Task22 {
    public static int binaryToDecimal(int n) {
        int output = 0;
        int power = 0;

        while (n > 0) {
            int lastDigit = n % 10;

            int temp = lastDigit * (int) (Math.pow(2, power));
            power++;
            output += temp;

            n /= 10;
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int n = sc.nextInt();

        System.out.println("Decimal = " + binaryToDecimal(n));

        sc.close();
    }
}
