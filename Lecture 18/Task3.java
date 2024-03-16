import java.util.Scanner;

public class Task3 {
    public static int first = -1;
    public static int last = -1;

    public static void getIndices(String str, char ch, int idx) {
        if (idx == str.length()) {
            return;
        }

        if (str.charAt(idx) == ch) {
            if (first == -1) {
                first = idx;
                last = idx;
            } else {
                last = idx;
            }
        }
        getIndices(str, ch, idx + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        getIndices(str, ch, 0);

        System.out.println("First occurence: " + first);
        System.out.println("Last occurence: " + last);

        sc.close();
    }
}
