import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, marks;

        do {
            System.out.println("Enter 1 to enter student's marks or 0 to exit:");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the student's marks (out of 100):");
                marks = sc.nextInt();

                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
                }
            } else if (choice == 0) {
                System.out.println("Exiting the program...");
            } else {
                System.out.println("Invalid choice. Please enter either 1 or 0.");
            }
        } while (choice != 0);

        sc.close();
    }
}