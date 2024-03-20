import java.util.Scanner;

public class Task203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double perimeter = 2 * PI * radius;
        double area = PI * Math.pow(radius, 2);

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        sc.close();
    }
}
