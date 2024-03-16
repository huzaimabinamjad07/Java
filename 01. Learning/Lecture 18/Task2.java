import java.util.Scanner;

public class Task2 {
    public static void reverse(String str, int idx) {
        if (idx == 0) {
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str, idx - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.println("Original = " + str);
        System.out.print("Reverse = ");
        reverse(str, str.length() - 1);

        sc.close();
    }
}
