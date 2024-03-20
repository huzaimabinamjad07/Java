import java.util.Scanner;

public class Task1202 {
    public static Scanner sc = new Scanner(System.in);

    public static String manipulate(String str) {
        String temp = "";

        for (char c : str.toCharArray()) {
            if (c != 'e') {
                temp += c;
            } else {
                temp += 'i';
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Output = " + manipulate(str));
    }
}
