import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\n===== Before Swap =====");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\n===== After Swap =====");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}
