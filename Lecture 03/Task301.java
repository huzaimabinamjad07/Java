import java.util.Scanner;

public class Task301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print(
                "\nChoose from following:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulous\n\nChoose: ");
        char ch = sc.next().charAt(0);

        System.out.println();

        switch (ch) {
            case '1':
                System.out.println("Sum = " + (a + b));
                break;
            case '2':
                System.out.println("Difference = " + (a - b));
                break;
            case '3':
                System.out.println("Product = " + (a * b));
                break;
            case '4':
                System.out.println("Quotient = " + (a / b));
                break;
            case '5':
                System.out.println("Remainder = " + (a % b));
                break;

            default:
                System.out.println("Invalid Choice!");
                break;
        }

        sc.close();
    }
}
