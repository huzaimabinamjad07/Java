import java.util.Scanner;

public class Task204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1;
        System.out.println(n + " x " + i + " = " + (n * i++));
        System.out.println(n + " x " + i + " = " + (n * i++));
        System.out.println(n + " x " + i + " = " + (n * i++));
        System.out.println(n + " x " + i + " = " + (n * i++));
        System.out.println(n + " x " + i + " = " + (n * i++));
        System.out.println(n + " x " + i + " = " + (n * i++));
        System.out.println(n + " x " + i + " = " + (n * i++));
        System.out.println(n + " x " + i + " = " + (n * i++));
        System.out.println(n + " x " + i + " = " + (n * i++));
        System.out.println(n + " x " + i + " = " + (n * i++));

        sc.close();
    }
}
