import java.util.Scanner;

public class Task1301 {
    public static Scanner sc = new Scanner(System.in);

    public static String getUsername(String str) {
        int idx = str.indexOf('@');

        if (idx == -1) {
            System.out.println("Invalid Email Address");
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < idx; i++) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print("Enter email: ");
        String str = sc.next();
        sc.nextLine();

        System.out.println("Username = " + getUsername(str));
    }
}
