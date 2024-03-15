import java.util.Scanner;

public class Task4 {
    public static final double PI = 3.14159;

    public static double circumference(double r) {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter raidus: ");
        double r = sc.nextDouble();

        System.out.println("Circumference = " + circumference(r));

        sc.close();
    }
}