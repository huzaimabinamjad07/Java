import java.util.Scanner;

public class Task17 {
    public static int decimalToBinary(int n) {
        StringBuilder output = new StringBuilder();

        while (n > 0) {
            int rem = n % 2;
            n /= 2;
            output.append(rem);
        }

        return Integer.parseInt(output.reverse().toString());
    }

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

        System.out.print("Enter first binary number: ");
        int a = sc.nextInt();
        System.out.print("Enter second binary number: ");
        int b = sc.nextInt();

        a = binaryToDecimal(a);
        b = binaryToDecimal(b);

        int sum = a + b;
        sum = decimalToBinary(sum);

        System.out.println("Binary Sum = " + sum);

        sc.close();
    }
}
