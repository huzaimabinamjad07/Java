import java.util.Scanner;

public class Task1503 {
    public static Scanner sc = new Scanner(System.in);

    public static long decimalToBinary(long num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            long temp = num % 2;
            num /= 2;
            sb.append(Long.toString(temp));
        }

        String str = sb.reverse().toString();
        return Long.parseLong(str);
    }

    public static long binaryToDecimal(long num) {
        int power = 0;
        long dec = 0;

        while (num > 0) {
            long lastDigit = num % 10;
            num /= 10;

            long value = lastDigit * (long) (Math.pow(2, power));
            power++;

            dec += value;
        }

        return dec;
    }

    public static void main(String[] args) {
        System.out.print("Enter a decimal number: ");
        long num = sc.nextInt();

        long binary = decimalToBinary(num);
        long decimal = binaryToDecimal(binary);

        System.out.println("Binary = " + binary);
        System.out.println("Decimal = " + decimal);

    }
}
