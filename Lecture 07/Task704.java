import java.util.Scanner;

public class Task704 {
    public static void table(int n, int i) {
        if (i == 10) {
            System.out.println(n + " x " + i + " = " + (n * i));
            return;
        }

        System.out.println(n + " x " + i + " = " + (n * i));
        table(n, ++i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        table(sc.nextInt(), 1);

        sc.close();
    }
}