import java.util.Scanner;

public class Task1203 {
    public static Scanner sc = new Scanner(System.in);

    public static String getUsername(String str) {
        int idx = str.indexOf('@');

        if (idx == -1) {
            System.out.println("Invalid email address");
            return "";
        }

        return str.substring(0, idx);
    }

    public static void main(String[] args) {
        System.out.print("Enter email address: ");
        String str = sc.next();
        sc.nextLine();

        System.out.println("Username = " + getUsername(str));
    }
}
