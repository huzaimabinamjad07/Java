import java.util.Scanner;

public class Task11 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double perimeter = 2 * PI * r;
        double area = PI * Math.pow(r, 2);

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);

        sc.close();
    }
}
