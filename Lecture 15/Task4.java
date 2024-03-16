import java.util.Scanner;

public class Task4 {
    public static Scanner sc = new Scanner(System.in);

    public static int decimalToBinary(long num) {
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            long temp = num % 2;
            num /= 2;
            sb.append(Long.toString(temp));
        }

        System.out.println("Binary = " + sb.reverse());

        int i = 0;

        for (char c : sb.toString().toCharArray()) {
            if (c == '1') {
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("1's Count = " + decimalToBinary(n));
    }
}
