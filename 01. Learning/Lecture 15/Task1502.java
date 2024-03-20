import java.util.Scanner;

public class Task1502 {
    public static Scanner sc = new Scanner(System.in);

    public static boolean isPowerOf2(int num) {
        int temp = 2;

        int i = 2;

        while (temp <= num) {
            if (temp == num) {
                return true;
            }

            temp = (int) Math.pow(2, i++);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Power of 2 = " + isPowerOf2(n));
    }
}
