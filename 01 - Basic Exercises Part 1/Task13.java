import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double perimeter = 2 * (width + height);
        double area = width * height;

        System.out.println("Perimeter = (2 x (" + width + " + " + height + ")) = " + perimeter);
        System.out.println("Area = (" + width + " x " + height + ") = " + area);

        sc.close();
    }
}
